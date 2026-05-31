/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.utils.StringUtils
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ucf.mdd.ext.util.ResultMessage
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.upc.pc.product.ProductSource
 *  com.yonyoucloud.upc.pc.productncc.HandleStatus
 *  com.yonyoucloud.upc.utils.RedisLockKeyConstants
 *  org.apache.kafka.clients.consumer.ConsumerRecord
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.kafka.support.Acknowledgment
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.utils.StringUtils;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ucf.mdd.ext.util.ResultMessage;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.upc.async.AsyncTask;
import com.yonyoucloud.upc.pc.product.ProductSource;
import com.yonyoucloud.upc.pc.productncc.HandleStatus;
import com.yonyoucloud.upc.service.MQSaveTaskService;
import com.yonyoucloud.upc.service.NcSynProductService;
import com.yonyoucloud.upc.service.ProductApiDataService;
import com.yonyoucloud.upc.utils.RedisLockKeyConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class MQSaveProductNewArchTaskService
extends MQSaveTaskService {
    private static final Logger log = LoggerFactory.getLogger(MQSaveProductNewArchTaskService.class);
    @Autowired
    @Qualifier(value="mq.ncSynProductService")
    NcSynProductService ncSynProductService;
    @Autowired
    ProductApiDataService productApiDataService;

    @Override
    public void dealWithAck(AsyncTask task) throws Exception {
        BillDataDto bill = (BillDataDto)JSON.parseObject((String)JSON.toJSONString((Object)task.getData()), BillDataDto.class);
        Map<String, Object> param = task.getParam();
        log.error(String.format("MQSaveProductNewArchTaskService Begin: productnewparamoutkafka = %s", JSON.toJSONString(param)));
        UPCResultList convertResult = null;
        Object resource = param.get("resource");
        String url = AppContext.getEnvConfig((String)resource.toString()) + "/gwmanage/erpdata/upc/log";
        Object callbackUrl = param.get("callbackUrl");
        List allData = (List)bill.getData();
        try {
            if (resource != null && "ublinker".equals(resource.toString())) {
                bill = this.extBillService.dealBillDataForMq(bill, "save");
            }
            ArrayList<Object> messages = new ArrayList<Object>();
            String callBackKey = String.valueOf(param.get("key"));
            List<Map<String, Object>> billDatas = this.dealBillDataForUbLinker(bill, messages, callBackKey);
            this.callBackError(messages, url, task);
            if (!CollectionUtils.isEmpty(billDatas)) {
                convertResult = this.saveProductNewArch(bill, param);
            }
        }
        catch (Exception e) {
            log.error(this.getClass() + ".execute ublinker ", (Throwable)e);
            this.dealCallBackError(task, param, resource, url, callbackUrl, e.getMessage(), allData.size());
        }
        String resultMessage = null;
        if (null != convertResult) {
            resultMessage = ResultMessage.data((Object)convertResult);
        }
        if (StringUtils.isNotEmpty(resultMessage)) {
            if (resource != null && "ublinker".equals(resource.toString())) {
                this.sendUblinker(resultMessage, url, task);
            } else if (callbackUrl != null) {
                this.sendUblinker(resultMessage, callbackUrl.toString(), task);
            }
        }
    }

    private List<Map<String, Object>> dealBillDataForUbLinker(BillDataDto bill, List<Object> messages, String callBackKey) throws Exception {
        List<Map<String, Object>> datas = this.productApiDataService.converBillData(bill);
        List<Map<String, Object>> resultDatas = this.productApiDataService.checkProductDatasApi(datas, messages, callBackKey);
        bill.setData(resultDatas);
        return resultDatas;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public UPCResultList saveProductNewArch(BillDataDto bill, Map<String, Object> param) throws Exception {
        List allData = (List)bill.getData();
        bill.setData(null);
        ArrayList<Map> saveDatas = new ArrayList<Map>();
        Map<String, Map<String, Object>> allProducttplMap = this.ncSynProductService.getAllProducttplNcc(HandleStatus.success);
        for (Map bizObject : allData) {
            HashMap<String, String> affecsMap;
            List<String> characterIds = this.ncSynProductService.getAllAffecs(bizObject, affecsMap = new HashMap<String, String>());
            if (!CollectionUtils.isEmpty(characterIds)) {
                String characteridsAndSenMd5 = this.ncSynProductService.getCharacteridsAndSenMd5(affecsMap);
                if (allProducttplMap != null && allProducttplMap.containsKey(characteridsAndSenMd5) && null != allProducttplMap.get(characteridsAndSenMd5)) {
                    bizObject.put("productTemplate", allProducttplMap.get(characteridsAndSenMd5).get("tplId"));
                } else {
                    String msg;
                    block13: {
                        String requestId = UUID.randomUUID().toString();
                        String lockKey = RedisLockKeyConstants.PRODUCTTPLNCC_TASK + "writetpl" + characteridsAndSenMd5;
                        try {
                            if (!RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)UPCConstants.LOCK_EXPIRE_TIME)) break block13;
                            this.ncSynProductService.writeTplToTplNcc(characterIds, affecsMap);
                        }
                        catch (Exception e) {
                            msg = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408042B", (String)"\u4fdd\u5b58\u7279\u5f81\u7ec4\u5f02\u5e38\uff1a") + e.getMessage();
                            log.error(msg);
                            this.sendFailToNCC(msg, bizObject.get("erpCode").toString(), param);
                            continue;
                        }
                        finally {
                            RedisTool.releaseLock((String)lockKey, (String)requestId);
                            continue;
                        }
                    }
                    try {
                        ArrayList<Map> cacheDatas = new ArrayList<Map>();
                        cacheDatas.add(bizObject);
                        param.put("data", cacheDatas);
                        this.ncSynProductService.writeProductToProductNcc(param, characteridsAndSenMd5);
                    }
                    catch (Exception e) {
                        msg = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408042C", (String)"\u4e34\u65f6\u4fdd\u5b58\u7269\u6599\u5f02\u5e38\uff1a") + e.getMessage();
                        log.error(msg);
                        this.sendFailToNCC(msg, bizObject.get("erpCode").toString(), param);
                    }
                    continue;
                }
            }
            if (null != bizObject.get("source") && ProductSource.U8API == ProductSource.find((Number)Short.valueOf(bizObject.get("source").toString()))) {
                this.ncSynProductService.dealU8Datas(bizObject);
            }
            bizObject.remove("enableAssistUnit");
            saveDatas.add(bizObject);
        }
        if (!CollectionUtils.isEmpty(saveDatas)) {
            BillDataDto saveBill = new BillDataDto();
            saveBill.setBillnum(bill.getBillnum());
            saveBill.setKey(bill.getKey());
            saveBill.setData(saveDatas);
            UPCResultList resultList = this.saveDatas((String)AppContext.getYTenantId(), saveBill);
            return resultList;
        }
        return null;
    }

    public void sendFailToNCC(String message, String erpCode, Map<String, Object> requestData) throws Exception {
        ResultList result = new ResultList();
        result.setCount(1);
        result.setFailCount(1);
        result.setSucessCount(0);
        HashMap<String, String> msg = new HashMap<String, String>(4);
        msg.put("message", message);
        msg.put("key", erpCode);
        result.addMessage(msg);
        Object resource = requestData.get("resource");
        String url = AppContext.getEnvConfig((String)resource.toString()) + "/gwmanage/erpdata/upc/log";
        this.sendUblinkerByRequestData(ResultMessage.data((Object)result), url, requestData);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void dealWithAck(List<ConsumerRecord<?, ?>> records, Acknowledgment ack) throws Exception {
        try {
            for (ConsumerRecord<?, ?> record : records) {
                if (record.value() == null) continue;
                AsyncTask task = (AsyncTask)JSON.parseObject((String)record.value().toString(), AsyncTask.class);
                RobotExecutors.runAs((String)task.getYhtTenantId(), () -> {
                    try {
                        this.dealWithAck(task);
                    }
                    catch (Exception e) {
                        log.error(e.getMessage(), (Throwable)e);
                    }
                });
            }
        }
        catch (Exception e) {
            log.error("kafka consumer error({}):" + e.getMessage(), (Throwable)e);
        }
        finally {
            ack.acknowledge();
        }
    }
}

