/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  org.springframework.web.multipart.MultipartFile
 */
package com.yonyoucloud.upc.service.operationalTools;

import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import java.util.List;
import java.util.Map;
import org.springframework.web.multipart.MultipartFile;

public interface IForceModify {
    public static final String[] SupportFields = new String[]{"isBatchManage", "isExpiryDateManage", "isExpiryDateCalculationMethod", "expireDateNo", "expireDateUnit", "daysBeforeValidityReject", "validityWarningDays", "isSerialNoManage"};

    public ResultList billBatchModify(MultipartFile var1, Map<String, Object> var2) throws Exception;

    public String checkExcelAndFields(MultipartFile var1, Map<String, Object> var2);

    public ResultList retryOneRecords(List<String> var1) throws Exception;
}

