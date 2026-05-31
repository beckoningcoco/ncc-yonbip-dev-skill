/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.sys.service.ApiUserService
 *  com.yonyou.ucf.mdd.ext.util.ResultMessage
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  iuap.yms.thread.api.YmsExecutors
 *  org.apache.kafka.clients.consumer.ConsumerRecord
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.kafka.support.Acknowledgment
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.sys.service.ApiUserService;
import com.yonyou.ucf.mdd.ext.util.ResultMessage;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.upc.async.AsyncTask;
import com.yonyoucloud.upc.async.TaskExecutor;
import com.yonyoucloud.upc.service.openapi.MerchantOldOpenApiServiceImpl;
import iuap.yms.thread.api.YmsExecutors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="mq.saveTaskService")
public class MQSaveTaskService
implements TaskExecutor {
    private static final Logger log = LoggerFactory.getLogger(MQSaveTaskService.class);
    private int threadNum = Runtime.getRuntime().availableProcessors() * 2;
    private static final int DEFAULT_IMPORT_POOL_TASK_NUM = 50000;
    @Autowired
    @Lazy
    @Qualifier(value="pc.BillService")
    public IUPCBillService extBillService;
    @Autowired
    ApiUserService apiUserService;
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    @Autowired
    MerchantOldOpenApiServiceImpl merchantOldOpenApiService;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void dealWithAck(List<ConsumerRecord<?, ?>> records, Acknowledgment ack) throws Exception {
        try {
            for (ConsumerRecord<?, ?> record : records) {
                if (null == record.value()) continue;
                AsyncTask task = (AsyncTask)JSON.parseObject((String)record.value().toString(), AsyncTask.class);
                RobotExecutors.runAs((String)task.getYhtTenantId(), () -> {
                    try {
                        this.dealWithAck(task);
                    }
                    catch (Exception e) {
                        log.error(this.getClass() + ", dealWithAck, exception:" + e.getMessage(), (Throwable)e);
                    }
                });
            }
        }
        catch (Exception e) {
            log.error("kafka consumer error({}):" + e.getMessage(), (Throwable)e);
        }
        finally {
            log.info("kafka message success,");
            ack.acknowledge();
        }
    }

    @Override
    public void dealWithAck(AsyncTask task) throws Exception {
        log.error(String.format("MQ Save Begin: task = %s", task.getId()));
        Map data = (Map)task.getData();
        BillDataDto bill = (BillDataDto)JSON.parseObject((String)JSON.toJSONString((Object)data), BillDataDto.class);
        Map<String, Object> param = task.getParam();
        log.error(String.format("MQSaveTaskService Begin: paramoutkafka = %s", JSON.toJSONString(param)));
        UPCResultList result = null;
        Object resource = param.get("resource");
        String url = AppContext.getEnvConfig((String)resource.toString()) + "/gwmanage/erpdata/upc/log";
        Object callbackUrl = param.get("callbackUrl");
        List allData = (List)bill.getData();
        try {
            String billnum;
            if (resource != null && "ublinker".equals(resource.toString())) {
                bill = this.extBillService.dealBillDataForMq(bill, "save");
            }
            if ((billnum = bill.getBillnum()).equals("pc_productsku_edit")) {
                result = this.saveDatas(task.getYhtTenantId(), bill);
            } else {
                ArrayList<Object> messages = new ArrayList<Object>();
                String callBackKey = String.valueOf(param.get("key"));
                List<Map<String, Object>> billDatas = this.dealBillDataForUbLinker(bill, messages, callBackKey);
                this.callBackError(messages, url, task);
                if (!CollectionUtils.isEmpty(billDatas)) {
                    result = this.saveDatas(task.getYhtTenantId(), this.extBillService.dealBillDataForApi(bill, "save"));
                }
            }
        }
        catch (Exception e) {
            log.error(this.getClass() + ".execute ublinker ", (Throwable)e);
            this.dealCallBackError(task, param, resource, url, callbackUrl, e.getMessage(), allData.size());
        }
        if (null != result) {
            if (resource != null && "ublinker".equals(resource.toString())) {
                this.sendUblinker(ResultMessage.data((Object)result), url, task);
            } else if (callbackUrl != null) {
                this.sendUblinker(ResultMessage.data((Object)result), callbackUrl.toString(), task);
            }
        }
    }

    private List<Map<String, Object>> dealBillDataForUbLinker(BillDataDto bill, List<Object> messages, String callBackKey) throws Exception {
        List<Map<String, Object>> datas = this.merchantOldOpenApiService.converBillData(bill);
        ArrayList<Map<String, Object>> resultBillList = new ArrayList<Map<String, Object>>();
        for (Map<String, Object> billOne : datas) {
            try {
                if ("aa_merchant".equals(bill.getBillnum())) {
                    this.merchantOldOpenApiService.checkData(billOne);
                }
                resultBillList.add(billOne);
            }
            catch (Exception e) {
                HashMap<String, String> msg = new HashMap<String, String>();
                if (null != billOne.get(callBackKey)) {
                    msg.put("key", billOne.get(callBackKey).toString());
                }
                msg.put("message", e.getMessage());
                messages.add(msg);
            }
        }
        bill.setData(resultBillList);
        return resultBillList;
    }

    public void callBackError(List<Object> messages, String url, AsyncTask task) {
        if (!CollectionUtils.isEmpty(messages)) {
            ResultList resultList = new ResultList();
            resultList.setFailCount(messages.size());
            resultList.setCount(messages.size());
            resultList.setMessages(messages);
            resultList.setFailInfos(messages);
            this.sendUblinker(ResultMessage.data((Object)resultList), url, task);
        }
    }

    public void dealCallBackError(AsyncTask task, Map<String, Object> param, Object resource, String url, Object callbackUrl, String message, Integer dataSize) {
        HashMap<String, String> msg = new HashMap<String, String>();
        msg.put("key", "ALL_ERROR");
        msg.put("message", message);
        ArrayList<HashMap<String, String>> messages = new ArrayList<HashMap<String, String>>();
        messages.add(msg);
        ResultList resultList = new ResultList();
        resultList.setFailCount(dataSize.intValue());
        resultList.setCount(dataSize.intValue());
        resultList.setMessages(messages);
        resultList.setFailInfos(messages);
        String errorMsg = ResultMessage.data((Object)resultList);
        if (resource != null && "ublinker".equals(resource.toString())) {
            this.sendUblinker(errorMsg, url, task);
        } else if (callbackUrl != null) {
            this.sendUblinker(errorMsg, callbackUrl.toString(), task);
        }
    }

    public UPCResultList saveDatas(String ytenantId, BillDataDto bill) throws Exception {
        List data = (List)bill.getData();
        int batchNum = this.threadNum;
        if (data.size() < this.threadNum) {
            batchNum = data.size();
        }
        if (batchNum == 0) {
            return new UPCResultList();
        }
        ArrayList<ResultList> resultLists = new ArrayList<ResultList>();
        int batchSize = this.getBatchSize(data.size(), batchNum);
        CountDownLatch latch = new CountDownLatch(batchNum);
        for (int i = 0; i < batchNum; ++i) {
            int toIndex;
            int fromIndex;
            BillDataDto tempBill = new BillDataDto();
            tempBill.setBillnum(bill.getBillnum());
            tempBill.setKey(bill.getKey());
            if (i == batchNum - 1) {
                fromIndex = batchSize * i;
                toIndex = data.size();
            } else {
                fromIndex = batchSize * i;
                toIndex = batchSize * (i + 1);
            }
            tempBill.setData(data.subList(fromIndex, toIndex));
            RobotExecutors.runAs((String)ytenantId, () -> {
                ResultList resultList = new ResultList();
                try {
                    resultList = this.extBillService.batchSave(tempBill);
                }
                catch (Exception e) {
                    HashMap<String, String> map = new HashMap<String, String>(1);
                    map.put(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408096A", (String)"\u7cfb\u7edf\u5f02\u5e38"), e.getMessage());
                    resultList.addMessage(map);
                }
                List list = resultLists;
                synchronized (list) {
                    resultLists.add(resultList);
                }
                latch.countDown();
            }, (ExecutorService)YmsExecutors.getLongTaskContextExecutor());
        }
        latch.await();
        return this.getResult(resultLists);
    }

    private UPCResultList getResult(List<ResultList> resultList) {
        UPCResultList convertResult = new UPCResultList();
        int count = 0;
        int sucessCount = 0;
        int failCount = 0;
        ArrayList messages = new ArrayList();
        ArrayList infos = new ArrayList();
        for (ResultList tempResult : resultList) {
            count += tempResult.getCount();
            sucessCount += tempResult.getSucessCount();
            failCount += tempResult.getFailCount();
            messages.addAll(tempResult.getMessages());
            infos.addAll(tempResult.getInfos());
        }
        convertResult.setMessages(messages);
        convertResult.setInfos(infos);
        convertResult.setCount(Integer.valueOf(count));
        convertResult.setSucessCount(Integer.valueOf(sucessCount));
        convertResult.setFailCount(Integer.valueOf(failCount));
        return convertResult;
    }

    private int getBatchSize(int size, int batchNum) {
        return size / batchNum;
    }

    protected void sendUblinker(String resultMessage, String url, AsyncTask task) {
        try {
            this.sendUblinkerByRequestData(resultMessage, url, task.getParam());
        }
        catch (Exception e) {
            log.error("send ubliker backfeed info error", (Throwable)e);
        }
    }

    public void sendUblinkerByRequestData(String resultMessage, String url, Map<String, Object> requestData) throws Exception {
        HashMap<String, String> headerParams = new HashMap<String, String>();
        headerParams.put("Authorization", InvocationInfoProxy.getYhtAccessToken());
        requestData.put("result", resultMessage);
        requestData.remove("data");
        Object tenantId = requestData.get("tenantId");
        url = url + "?tenantId=" + tenantId + "&appid=" + this.ymsParamConfig.getUblinkerAppid();
        String resultStr = JSON.toJSONString(requestData);
        log.error("sendUblinkerByRequestData\uff0cdata\uff1a" + resultStr);
        YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
        ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
        YmsHttpRequest request = new YmsHttpRequestBuilder().url(url).method(YmsHttpMethod.POST).body((Object)resultStr).addHeader(ymsHttpHeader.addAllMap(headerParams)).build();
        this.ymsHttpClient.execute(request);
    }
}

