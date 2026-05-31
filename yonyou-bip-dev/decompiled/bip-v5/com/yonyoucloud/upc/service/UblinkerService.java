/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  org.apache.commons.lang3.ObjectUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyoucloud.upc.async.AsyncTask;
import com.yonyoucloud.upc.async.TaskRegister;
import com.yonyoucloud.upc.service.MQSaveSkuTaskService;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UblinkerService {
    public static final String UBLINKER_RESOURCE = "ublinker";
    public static final String UBLINKER_CALLBACK_EEROR_MSG = "message";
    private static final String NC_SKU_RETURN_FIRLD = "erpCode";
    public static final String CALL_BACK_KEY = "key";
    public static final String ALL_CALL_BACK_FLAG = "ALL_ERROR";
    @Autowired
    TaskRegister taskRegister;
    @Autowired
    MQSaveSkuTaskService mqSaveSkuTaskService;

    public String sendMqSkuSave(Map param) throws Exception {
        Object billnum;
        Object data;
        BillDataDto bill = new BillDataDto();
        Object key = param.get(CALL_BACK_KEY);
        if (key != null) {
            bill.setKey(key.toString());
        }
        if ((data = param.get("data")) != null) {
            bill.setData(data);
        }
        if ((billnum = param.get("billnum")) != null) {
            bill.setBillnum(billnum.toString());
        }
        Object tenantId = param.get("tenantId");
        String yhtTenantId = null;
        if (tenantId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800863);
        }
        yhtTenantId = tenantId.toString();
        String finalYhtTenantId = yhtTenantId;
        String taskId = billnum != null && "pc_productdetail".equals(billnum.toString()) ? (String)RobotExecutors.runAs((String)yhtTenantId, () -> this.taskRegister.registerProductDetailTask(new AsyncTask(bill, "mQSaveProductDetailTaskService", param, finalYhtTenantId))) : (String)RobotExecutors.runAs((String)yhtTenantId, () -> this.taskRegister.registerSkuTask(new AsyncTask(bill, "mQSaveSkuTaskService", param, finalYhtTenantId)));
        return taskId;
    }

    public ResultList saveNcSku(Map param) throws Exception {
        Object key;
        Object billnum;
        BillDataDto bill = new BillDataDto();
        Object data = param.get("data");
        if (data != null) {
            bill.setData(data);
        }
        if ((billnum = param.get("billnum")) != null) {
            bill.setBillnum(billnum.toString());
        }
        if (ObjectUtils.isEmpty(key = param.get(CALL_BACK_KEY))) {
            key = NC_SKU_RETURN_FIRLD;
        }
        return this.mqSaveSkuTaskService.saveSkuAndTpl(bill, key.toString());
    }
}

