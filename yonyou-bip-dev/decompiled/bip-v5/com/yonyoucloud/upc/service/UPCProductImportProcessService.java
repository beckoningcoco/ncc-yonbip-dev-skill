/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.bill.service.ImportProcessResultService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.util.Toolkit
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.bill.service.ImportProcessResultService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.util.Toolkit;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductImportProcessService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class UPCProductImportProcessService
implements IUPCProductImportProcessService {
    private static final Logger log = LoggerFactory.getLogger(UPCProductImportProcessService.class);
    private Logger Logger = LoggerFactory.getLogger(this.getClass());

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Map<String, Object> getProductBatchImportProcess(String asyncKey) throws Exception {
        Iterator iterator;
        int totalCount;
        Map redisBatchKeyList;
        int totalSuccessCount;
        int totalFailCount;
        HashMap<String, Object> data;
        HashMap<String, Object> result;
        block10: {
            result = new HashMap();
            data = new HashMap<String, Object>();
            String isEnd = AppContext.cache().get(asyncKey + "_productBatchImport" + "_isEnd");
            if (null != isEnd && !"".equals(isEnd) && Boolean.parseBoolean(isEnd)) {
                totalFailCount = 0;
                totalSuccessCount = 0;
                String redisBatchKey = asyncKey + "_productBatchImport";
                redisBatchKeyList = AppContext.cache().hgetAllByScan(redisBatchKey);
                String redisTotalCountKey = asyncKey + "_productBatchImportTotalCount";
                totalCount = Integer.parseInt(AppContext.cache().get(redisTotalCountKey));
                if (redisBatchKeyList != null && !redisBatchKeyList.isEmpty()) {
                    iterator = redisBatchKeyList.keySet().iterator();
                    break block10;
                } else {
                    log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807CE", (String)"#######UPCProductImportProcessService::getProductBatchImportProcess\uff0credisBatchKeyList\u4e3a\u7a7a\uff01 {}"), (Object)redisBatchKeyList);
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801492);
                }
            }
            String value = AppContext.cache().get(asyncKey);
            if (!StringUtils.isBlank((CharSequence)value)) return (Map)JSON.parse((String)value);
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807CB", (String)"#######UPCProductImportProcessService::getProductBatchImportProcess\uff0cvalue\u4e3a\u7a7a\uff01") + value);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801493);
        }
        while (iterator.hasNext()) {
            String redisBatchField = (String)iterator.next();
            try {
                Map processMap = ImportProcessResultService.getInstance().getImportProcess(redisBatchField);
                int failCount = processMap.get("failCount") == null ? 0 : Integer.parseInt(processMap.get("failCount").toString());
                totalFailCount += failCount;
                int successCount = processMap.get("successCount") == null ? 0 : Integer.parseInt(processMap.get("successCount").toString());
                totalSuccessCount += successCount;
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807CD", (String)"\u83b7\u53d6\u6846\u67b6\u7269\u6599\u5bfc\u5165\u8fdb\u5ea6\u5f02\u5e38({}):") + e.getMessage(), (Throwable)e);
            }
        }
        result.put("code", 200);
        result.put("flag", 1);
        result.put("billNum", "pc_product");
        result.put("failCount", totalFailCount);
        result.put("sucessCount", totalSuccessCount);
        result.put("totalCount", totalCount);
        result.put("count", totalCount);
        result.put("percentage", Toolkit.getPrecentValue((int)totalCount, (int)(totalSuccessCount + totalFailCount)));
        data.put("count", totalCount);
        data.put("totalCount", totalCount);
        data.put("sucessCount", totalSuccessCount);
        data.put("failCount", totalFailCount);
        data.put("percentage", Toolkit.getPrecentValue((int)totalCount, (int)(totalSuccessCount + totalFailCount)));
        if (totalFailCount + totalSuccessCount == totalCount) {
            ArrayList messageList = new ArrayList();
            for (String redisBatchField : redisBatchKeyList.keySet()) {
                AppContext.cache().del(new String[]{redisBatchField + "_import_process_idempotent"});
                try {
                    Map batchResult = ImportProcessResultService.getInstance().getImportProcess(redisBatchField);
                    List messages = (List)batchResult.get("message");
                    if (CollectionUtils.isEmpty((Collection)messages)) continue;
                    messageList.addAll(messages);
                }
                catch (Exception e) {
                    log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807CA", (String)"\u6c47\u603b\u6846\u67b6\u7269\u6599\u5bfc\u5165\u8fdb\u5ea6\u4fe1\u606f\u5f02\u5e38({}):") + e.getMessage(), (Throwable)e);
                }
            }
            data.put("messages", messageList);
        }
        result.put("data", data);
        return result;
    }
}

