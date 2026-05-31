/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.util.ResultMessage
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.util.ResultMessage;
import com.yonyoucloud.upc.async.AsyncTask;
import com.yonyoucloud.upc.async.TaskRegister;
import com.yonyoucloud.upc.service.MQSaveProductNewArchTaskService;
import com.yonyoucloud.upc.service.MQSaveSkuTaskService;
import com.yonyoucloud.upc.service.MQSaveTaskService;
import com.yonyoucloud.upc.service.NcSynProductService;
import com.yonyoucloud.upc.service.UPCBillService;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class CoredocSyncKafkaService {
    private static final Logger log = LoggerFactory.getLogger(CoredocSyncKafkaService.class);
    private static final Integer SMALL_DATA_COUTN = 5;
    private static final Integer DATA_MAX_LENGTH = 0x100000;
    @Autowired
    UPCBillService upcBillService;
    @Autowired
    private TaskRegister taskRegister;
    @Autowired
    @Qualifier(value="mq.saveTaskService")
    private MQSaveTaskService mqSaveTaskService;
    @Autowired
    private NcSynProductService ncSynProductService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private MQSaveProductNewArchTaskService mQSaveProductNewArchTaskService;
    @Autowired
    private MQSaveSkuTaskService mQSaveSkuTaskService;

    public String mqSave(Map param) throws Exception {
        Object billnum;
        Object data;
        BillDataDto bill = new BillDataDto();
        Object key = param.get("key");
        if (key != null) {
            bill.setKey(key.toString());
        }
        if ((data = param.get("data")) != null) {
            bill.setData(data);
        }
        if ((billnum = param.get("billnum")) != null) {
            bill.setBillnum(billnum.toString());
        }
        int size = 0;
        if (data instanceof Map) {
            size = 1;
        } else if (data instanceof List) {
            size = ((List)data).size();
            this.checkRepeatDatas((List)data);
        }
        Object tenantId = param.get("tenantId");
        if (tenantId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800863);
        }
        String yhtTenantId = tenantId.toString();
        Gson gson = new GsonBuilder().create();
        if (gson.toJson(data).getBytes(StandardCharsets.UTF_8).length > DATA_MAX_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800894);
        }
        if (billnum.equals("pc_product")) {
            if (size < SMALL_DATA_COUTN) {
                List datas = new ArrayList<Map>();
                if (data instanceof Map) {
                    datas.add((Map)data);
                } else if (data instanceof List) {
                    datas = (List)data;
                }
                boolean hasFreeCTCharacterIds = false;
                for (Map map : datas) {
                    List<String> allAffecs = this.ncSynProductService.getAllAffecs(map, new HashMap<String, String>());
                    if (CollectionUtils.isEmpty(allAffecs)) continue;
                    hasFreeCTCharacterIds = true;
                    break;
                }
                if (!hasFreeCTCharacterIds) {
                    return this.saveDatas(param, bill);
                }
            }
            AsyncTask asyncTask = new AsyncTask(bill, "mQSaveProductNewArchTaskService", param, yhtTenantId);
            if (!this.ymsParamConfig.useKafka()) {
                this.mQSaveProductNewArchTaskService.dealWithAck(asyncTask);
                return null;
            }
            return this.taskRegister.registerProductNewArchTask(asyncTask);
        }
        if (size < SMALL_DATA_COUTN) {
            return this.saveDatas(param, bill);
        }
        if (billnum.equals("pc_productsku_edit")) {
            AsyncTask asyncTask = new AsyncTask(bill, "mQSaveSkuTaskService", param, yhtTenantId);
            if (!this.ymsParamConfig.useKafka()) {
                this.mQSaveSkuTaskService.dealWithAck(asyncTask);
                return null;
            }
            return (String)RobotExecutors.runAs((String)yhtTenantId, () -> this.taskRegister.registerSkuTask(asyncTask));
        }
        AsyncTask asyncTask = new AsyncTask(bill, "mq.saveTaskService", param, yhtTenantId);
        if (!this.ymsParamConfig.useKafka()) {
            this.mqSaveTaskService.dealWithAck(asyncTask);
            return null;
        }
        return (String)RobotExecutors.runAs((String)yhtTenantId, () -> this.taskRegister.register(asyncTask));
    }

    private void checkRepeatDatas(List<Map> datas) {
        HashMap<String, String> repeatDataMap = new HashMap<String, String>(datas.size());
        for (Map data : datas) {
            if (null == data.get("erpCode")) continue;
            String erpCode = data.get("erpCode").toString();
            if (null != repeatDataMap.get(erpCode)) {
                throw new CoreDocBusinessException(null, "\u5b58\u5728\u91cd\u590d\u6570\u636e\uff0c\u91cd\u590d\u4e3b\u952e\u4e3a\uff1a" + erpCode + "\uff0c\u8bf7\u68c0\u67e5\u6765\u6e90\u6570\u636e\u6216\u8005\u6570\u636e\u83b7\u53d6\u65b9\u5f0f\u662f\u5426\u6b63\u786e");
            }
            repeatDataMap.put(erpCode, erpCode);
        }
    }

    @NotNull
    private String saveDatas(Map param, BillDataDto bill) throws Exception {
        Object billnum = param.get("billnum");
        ResultList result = !billnum.toString().equals("pc_productsku_edit") ? this.upcBillService.batchSave(this.upcBillService.dealBillDataForApi(bill, "save")) : this.upcBillService.batchSave(bill);
        RobotExecutors.runAs((String)((String)AppContext.getYhtTenantId()), () -> {
            String url = this.ymsParamConfig.getUblinker() + "/gwmanage/erpdata/upc/log";
            try {
                this.mqSaveTaskService.sendUblinkerByRequestData(ResultMessage.data((Object)result), url, param);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040800C6", (String)"\u540c\u6b65\u7269\u6599\u4f1a\u5199\u53cb\u4f01\u8054\u5931\u8d25") + e.getMessage(), (Throwable)e);
            }
        });
        return "success";
    }
}

