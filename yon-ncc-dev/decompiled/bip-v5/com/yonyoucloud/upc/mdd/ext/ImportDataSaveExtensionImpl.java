/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.context.YmsContextWrappers
 *  com.yonyou.yonbip.iuap.xport.common.error.ExcelErrorLocation
 *  com.yonyou.yonbip.iuap.xport.common.error.XportImportItemProcessException
 *  com.yonyou.yonbip.iuap.xport.importing.error.BusinessServicesSelfScheduledException
 *  com.yonyou.yonbip.iuap.xport.importing.processor.extension.BatchSaveResult
 *  com.yonyou.yonbip.iuap.xport.importing.processor.extension.CheckedConsumer
 *  com.yonyou.yonbip.iuap.xport.importing.processor.extension.ImportDataSaveExtension
 *  com.yonyou.yonbip.iuap.xport.importing.processor.pojo.ImportEventBO
 *  com.yonyou.yonbip.iuap.xport.importing.processor.pojo.ImportSingleData
 *  com.yonyou.yonbip.iuap.xport.importing.progress.ImportProgressReporter
 *  com.yonyou.ypd.bill.basic.constant.BillErrorEnum
 *  com.yonyou.ypd.bill.basic.exception.YpdException
 *  iuap.yms.thread.api.YmsExecutors
 *  org.apache.commons.lang3.StringUtils
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.scheduling.annotation.Scheduled
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 */
package com.yonyoucloud.upc.mdd.ext;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.context.YmsContextWrappers;
import com.yonyou.yonbip.iuap.xport.common.error.ExcelErrorLocation;
import com.yonyou.yonbip.iuap.xport.common.error.XportImportItemProcessException;
import com.yonyou.yonbip.iuap.xport.importing.error.BusinessServicesSelfScheduledException;
import com.yonyou.yonbip.iuap.xport.importing.processor.extension.BatchSaveResult;
import com.yonyou.yonbip.iuap.xport.importing.processor.extension.CheckedConsumer;
import com.yonyou.yonbip.iuap.xport.importing.processor.extension.ImportDataSaveExtension;
import com.yonyou.yonbip.iuap.xport.importing.processor.pojo.ImportEventBO;
import com.yonyou.yonbip.iuap.xport.importing.processor.pojo.ImportSingleData;
import com.yonyou.yonbip.iuap.xport.importing.progress.ImportProgressReporter;
import com.yonyou.ypd.bill.basic.constant.BillErrorEnum;
import com.yonyou.ypd.bill.basic.exception.YpdException;
import iuap.yms.thread.api.YmsExecutors;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ImportDataSaveExtensionImpl
implements ImportDataSaveExtension {
    private static final Logger log = LoggerFactory.getLogger(ImportDataSaveExtensionImpl.class);
    @Autowired
    YMSParamConfig ymsParamConfig;
    private final Executor executor = YmsExecutors.getLongTaskContextExecutor();
    private Set<String> singleExecutionBillNumSet;
    private final DelayQueue<RetryImportData> importDataRetryQueue = new DelayQueue();
    private final AtomicBoolean failedDataRetryRunning = new AtomicBoolean(false);
    @Autowired
    @Lazy
    protected ImportProgressReporter reporter;
    private static final int MAX_QUEUE_SIZE = 1000;
    private static final int MAX_RETRY = 5;
    private static final int LOCK_FAILED_RETRY_SECONDS = 10;

    @Scheduled(cron="0/30 * * * * ?")
    public void executeLockFailedImport() {
        if (this.failedDataRetryRunning.getAndSet(true)) {
            return;
        }
        try {
            while (!this.importDataRetryQueue.isEmpty()) {
                RetryImportData element = (RetryImportData)this.importDataRetryQueue.take();
                this.doSingleSave(element);
            }
        }
        catch (InterruptedException e) {
            log.error("\u5bfc\u5165\u4efb\u52a1\u52a0\u9501\u5931\u8d25\u6267\u884c\u5ef6\u65f6\u91cd\u8bd5\u5f02\u5e38", (Throwable)e);
            Thread.currentThread().interrupt();
        }
        this.failedDataRetryRunning.set(false);
    }

    private void doSingleSave(RetryImportData element) {
        try {
            this.executor.execute(() -> element.getConsumer().accept(element));
        }
        catch (Exception e) {
            log.error("\u5bfc\u5165\u5e76\u53d1\u9501\u6570\u636e\u91cd\u8bd5\u4efb\u52a1\u6267\u884c\u5931\u8d25", (Throwable)e);
            element.setJumpOut(true);
            element.getConsumer().accept(element);
        }
    }

    private void reportFailedImport(ImportSingleData data, Exception ex) {
        if (ex instanceof XportImportItemProcessException) {
            List errorLocations = ((XportImportItemProcessException)ex).getErrorLocation();
            for (ExcelErrorLocation errorLocation : errorLocations) {
                if (errorLocation.getRow() == null) {
                    errorLocation.setRow(data.getRowIndex());
                }
                if (errorLocation.getSheetName() == null) {
                    errorLocation.setSheetName(data.getSheetName());
                }
                if (!StringUtils.isBlank((CharSequence)errorLocation.getErrorMessage())) continue;
                errorLocation.setErrorMessage(ex.getMessage());
            }
            this.reporter.onImportItemProcessErrors(data.getEvent().getAsyncKey(), data.getEvent().getSubKey(), 1, (Collection)errorLocations);
        } else {
            ExcelErrorLocation errorLocation = new ExcelErrorLocation();
            errorLocation.setErrorMessage(ex.getMessage());
            errorLocation.setRow(data.getRowIndex());
            errorLocation.setSheetName(data.getSheetName());
            this.reporter.onImportItemProcessError(data.getEvent().getAsyncKey(), data.getEvent().getSubKey(), errorLocation);
        }
    }

    private boolean addToDelayQueue(RetryImportData element) {
        if (this.importDataRetryQueue.size() >= 1000) {
            return false;
        }
        return this.importDataRetryQueue.offer(element);
    }

    public boolean accept(@NotNull ImportEventBO importEventBO, @NotNull List<ImportSingleData> needSaveDataList) {
        return false;
    }

    @NotNull
    public BatchSaveResult doBatchSave(@NotNull ImportEventBO importEventBO, @NotNull List<ImportSingleData> needSaveDataList) {
        BatchSaveResult result = new BatchSaveResult();
        result.setFailedCount(needSaveDataList.size());
        result.setSuccessCount(0);
        return result;
    }

    public boolean acceptAroundSingleItemSave(@NotNull ImportSingleData singleData) {
        return true;
    }

    @Transactional(rollbackFor={Throwable.class})
    public void aroundAndDoSave(ImportSingleData singleData, CheckedConsumer<ImportSingleData> saveConsumer) throws Exception {
        try {
            saveConsumer.accept((Object)singleData);
        }
        catch (Exception e) {
            if (this.isLockException(e) && this.addToDelayQueue(new RetryImportData(singleData, this.wrapConsumer(saveConsumer), e, 10L, 0))) {
                throw new BusinessServicesSelfScheduledException("\u52a0\u9501\u5931\u8d25\u7b49\u5f85\u91cd\u8bd5");
            }
            throw e;
        }
    }

    @NotNull
    private Consumer<RetryImportData> wrapConsumer(CheckedConsumer<ImportSingleData> consumer) {
        return YmsContextWrappers.wrapConsumer(importData -> {
            if (importData.isJumpOut()) {
                this.reportFailedImport(importData.getData(), importData.getException());
            } else {
                try {
                    consumer.accept((Object)importData.getData());
                    this.reporter.addSucceedOne(importData.getData().getEvent().getAsyncKey(), importData.getData().getEvent().getSubKey());
                }
                catch (Exception e) {
                    if (this.isLockException(e) && importData.getRetryCount() < 5 && this.addToDelayQueue(new RetryImportData(importData.getData(), importData.getConsumer(), e, 10L, importData.getRetryCount() + 1))) {
                        return;
                    }
                    this.reportFailedImport(importData.getData(), e);
                }
            }
        });
    }

    private boolean isLockException(Exception e) {
        if (e instanceof YpdException) {
            YpdException ex = (YpdException)e;
            String errorCode = String.valueOf(BillErrorEnum.YPD_LOCK_DONOTNEW.getErrorCode());
            return errorCode.equals(ex.getDisplayCode()) || errorCode.equals(ex.getErrorCode());
        }
        return false;
    }

    public Integer getParallelism(ImportEventBO importEventBO, List<ImportSingleData> needSaveDataList) {
        return this.needSingleExecute(importEventBO) ? Integer.valueOf(1) : null;
    }

    private boolean needSingleExecute(ImportEventBO importEventBO) {
        if (importEventBO == null || importEventBO.getImportContextDto() == null) {
            return true;
        }
        if (this.singleExecutionBillNumSet == null) {
            String parallelBillNum = this.ymsParamConfig.getParalleBillnum();
            this.singleExecutionBillNumSet = parallelBillNum != null ? Arrays.stream(parallelBillNum.split(",")).collect(Collectors.toSet()) : new HashSet<String>();
        }
        return this.singleExecutionBillNumSet.contains(importEventBO.getImportContextDto().getBillno());
    }

    static class RetryImportData
    implements Delayed {
        private final ImportSingleData data;
        private final Consumer<RetryImportData> consumer;
        private final long expireTime;
        private final int retryCount;
        private final Exception exception;
        private boolean jumpOut = false;

        public RetryImportData(ImportSingleData data, Consumer<RetryImportData> consumer, Exception exception, long expireSecond, int retryCount) {
            this.data = data;
            this.consumer = consumer;
            this.exception = exception;
            this.expireTime = System.currentTimeMillis() + expireSecond * 1000L;
            this.retryCount = retryCount;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            long diff = this.expireTime - System.currentTimeMillis();
            return unit.convert(diff, TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(@NotNull Delayed o) {
            return Long.compare(this.expireTime, ((RetryImportData)o).expireTime);
        }

        public ImportSingleData getData() {
            return this.data;
        }

        public Consumer<RetryImportData> getConsumer() {
            return this.consumer;
        }

        public long getExpireTime() {
            return this.expireTime;
        }

        public int getRetryCount() {
            return this.retryCount;
        }

        public Exception getException() {
            return this.exception;
        }

        public boolean isJumpOut() {
            return this.jumpOut;
        }

        public void setJumpOut(boolean jumpOut) {
            this.jumpOut = jumpOut;
        }
    }
}

