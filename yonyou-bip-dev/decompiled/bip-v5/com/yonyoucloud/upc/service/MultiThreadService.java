/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiThreadService {
    private static final Logger log = LoggerFactory.getLogger(MultiThreadService.class);
    @Autowired
    private ApiImportCommandService apiImportCommandService;
    @Autowired
    private YmsThreadPoolConfig4UPC ymsThreadPoolConfig4UPC;

    public ExecutorService getThreadPoolExecutor() {
        return this.ymsThreadPoolConfig4UPC.getYmsExecutorService();
    }

    public UPCResultList multiThreadSave(List<BillDataDto> billList) {
        UPCResultList upcResultList = new UPCResultList();
        AtomicInteger successCount = new AtomicInteger();
        AtomicInteger failCount = new AtomicInteger();
        ArrayList<String> messages = new ArrayList<String>();
        ArrayList successInfos = new ArrayList();
        ArrayList<Future> futureList = new ArrayList<Future>();
        for (BillDataDto billDataDto : billList) {
            Future ruleExecuteResultFuture = RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> this.apiImportCommandService.singleSave4Api(billDataDto), (ExecutorService)this.ymsThreadPoolConfig4UPC.getYmsExecutorService());
            futureList.add(ruleExecuteResultFuture);
        }
        for (Future future : futureList) {
            try {
                successInfos.add(future.get());
                successCount.getAndIncrement();
            }
            catch (ExecutionException e) {
                failCount.getAndIncrement();
                if (e.getCause().getCause() != null) {
                    messages.add(e.getCause().getCause().getMessage());
                    continue;
                }
                messages.add(e.getCause().getMessage());
            }
            catch (Exception e) {
                failCount.getAndIncrement();
                messages.add(e.getCause().getMessage());
            }
        }
        upcResultList.setCount(Integer.valueOf(failCount.get() + successCount.get()));
        upcResultList.setFailCount(Integer.valueOf(failCount.get()));
        upcResultList.setSuccessCount(Integer.valueOf(successCount.get()));
        upcResultList.setMessages(messages);
        upcResultList.setInfos(successInfos);
        return upcResultList;
    }
}

