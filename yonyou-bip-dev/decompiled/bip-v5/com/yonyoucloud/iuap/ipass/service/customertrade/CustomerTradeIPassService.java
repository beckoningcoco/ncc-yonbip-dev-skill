/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.json.JSONArray
 *  cn.hutool.json.JSONObject
 *  cn.hutool.json.JSONUtil
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.customerTrade.BatchCustomertradeIPassSaveRequest
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.upc.aa.customertrade.CustomerTrade
 *  com.yonyoucloud.upc.utils.BlackListCheckUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.ipass.service.customertrade;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.customerTrade.BatchCustomertradeIPassSaveRequest;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.upc.aa.customertrade.CustomerTrade;
import com.yonyoucloud.upc.utils.BlackListCheckUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class CustomerTradeIPassService {
    private static final Logger log = LoggerFactory.getLogger(CustomerTradeIPassService.class);
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    BlackListCheckUtil blackListCheckUtil;

    public CoreDocJsonResultForOpenApi queryTreeIPASS() {
        try {
            BillDataDto bill = new BillDataDto();
            bill.setBillnum("aa_customertradelist");
            bill.setTreename("aa.customertrade.CustomerTrade");
            List list = this.billService.querytree(bill);
            if ("aa_customertradelist".equals(bill.getBillnum()) && !CollectionUtils.isEmpty((Collection)list)) {
                this.billService.dealDataForCustomertrade(list);
            }
            List<JSONObject> resultList = this.transTreeToList(list);
            UPCPager upcPager = new UPCPager();
            int recordCount = resultList.size();
            upcPager.setRecordCount(Integer.valueOf(recordCount));
            upcPager.setHaveNextPage(Boolean.valueOf(false));
            upcPager.setRecordList(resultList);
            return CoreDocJsonResultForOpenApi.success((Object)upcPager);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(businessException.getMessage()));
        }
        catch (Exception e) {
            log.error("\u5ba2\u6237\u884c\u4e1a\u6811ipass\u96c6\u6210\u63a5\u53e3\u67e5\u8be2\u9519\u8bef\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResultForOpenApi batchSaveIPASS(List<BatchCustomertradeIPassSaveRequest> batchCustomertradeIPassSaveRequests) {
        try {
            List<CustomerTrade> customerTradeList = this.handleSaveParam(batchCustomertradeIPassSaveRequests);
            BillDataDto bill = new BillDataDto();
            bill.setBillnum("aa_customertrade");
            bill.setConvertType(Integer.valueOf(2));
            bill.setData(customerTradeList);
            this.blackListCheckUtil.check(bill.getBillnum());
            this.billService.setUserDefineClassIsEnabledForSave(bill);
            ResultList result = this.billService.batchSave(this.billService.dealBillDataForApi(bill, "save"));
            List messages = result.getMessages();
            ArrayList newMessages = new ArrayList();
            if (!CollectionUtils.isEmpty((Collection)messages)) {
                for (Object message : messages) {
                    Object sourceUnique = "";
                    String errorMessage = message.toString();
                    if (errorMessage.contains("[code:")) {
                        sourceUnique = StringUtils.substringBetween((String)errorMessage, (String)"[code:", (String)"]");
                    }
                    HashMap<String, Object> map = new HashMap<String, Object>();
                    map.put("message", message);
                    map.put("sourceUnique", sourceUnique);
                    newMessages.add(map);
                }
            }
            List infos = result.getInfos();
            ArrayList newInfos = new ArrayList();
            if (!CollectionUtils.isEmpty((Collection)infos)) {
                for (Object info : infos) {
                    JSONObject resultData = JSONUtil.parseObj(info);
                    Map<String, Object> uniqueMap = this.getUniqueMap(resultData);
                    HashMap<String, Map<String, Object>> map = new HashMap<String, Map<String, Object>>();
                    map.put("data", uniqueMap);
                    newInfos.add(map);
                }
            }
            UPCResultList upcResultList = new UPCResultList();
            upcResultList.setCount(Integer.valueOf(result.getCount()));
            upcResultList.setFailCount(Integer.valueOf(result.getFailCount()));
            upcResultList.setSuccessCount(Integer.valueOf(result.getSucessCount()));
            upcResultList.setMessages(newMessages);
            upcResultList.setInfos(newInfos);
            return CoreDocJsonResultForOpenApi.success((Object)upcResultList);
        }
        catch (Exception e) {
            log.error("\u5ba2\u6237\u884c\u4e1a\u6279\u91cf\u4fdd\u5b58ipass\u96c6\u6210\u63a5\u53e3\u67e5\u8be2\u9519\u8bef\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public Map<String, Object> getUniqueMap(JSONObject dataJson) {
        String sourceUnique = "";
        if (dataJson.containsKey((Object)"sourceUnique")) {
            sourceUnique = (String)dataJson.get((Object)"sourceUnique", String.class);
        } else if (dataJson.containsKey((Object)"erpCode")) {
            sourceUnique = (String)dataJson.get((Object)"erpCode", String.class);
        }
        HashMap<String, Object> uniqueMap = new HashMap<String, Object>();
        uniqueMap.put("sourceUnique", sourceUnique);
        if (dataJson.containsKey((Object)"id")) {
            uniqueMap.put("targetUnique", dataJson.get((Object)"id"));
        }
        return uniqueMap;
    }

    private List<JSONObject> transTreeToList(List dataList) {
        ArrayList<String> uniqueIds = new ArrayList<String>();
        ArrayList<JSONObject> list = new ArrayList<JSONObject>();
        JSONArray array = JSONUtil.parseArray((Object)dataList);
        for (Object item : array) {
            JSONObject object = JSONUtil.parseObj(item);
            if (object.containsKey((Object)"children")) {
                list.addAll(this.getChildren(object, uniqueIds));
            }
            if (!object.containsKey((Object)"id") || uniqueIds.contains(object.getStr((Object)"id"))) continue;
            object.set("children", null);
            list.add(object);
            uniqueIds.add(object.getStr((Object)"id"));
        }
        return list;
    }

    private List<JSONObject> getChildren(JSONObject object, List<String> uniqueIds) {
        ArrayList<JSONObject> result = new ArrayList<JSONObject>();
        JSONArray children = object.getJSONArray((Object)"children");
        if (Objects.nonNull(children)) {
            for (Object item : children) {
                result.addAll(this.getChildren(JSONUtil.parseObj(item), uniqueIds));
            }
        }
        if (object.containsKey((Object)"id") && !uniqueIds.contains(object.getStr((Object)"id"))) {
            object.set("children", null);
            result.add(object);
            uniqueIds.add(object.getStr((Object)"id"));
        }
        return result;
    }

    public List<CustomerTrade> handleSaveParam(List<BatchCustomertradeIPassSaveRequest> saveDataList) {
        ArrayList<CustomerTrade> customerTradeList = new ArrayList<CustomerTrade>();
        if (!CollectionUtils.isEmpty(saveDataList)) {
            for (BatchCustomertradeIPassSaveRequest saveData : saveDataList) {
                Map map = (Map)JSON.parseObject((String)JSON.toJSONString((Object)saveData), HashMap.class);
                CustomerTrade customerTrade = new CustomerTrade();
                customerTrade.putAll(map);
                HashMap<String, String> name = new HashMap<String, String>();
                if (saveData.getName() != null) {
                    name.put("zh_CN", saveData.getName());
                }
                if (saveData.getName_en_US() != null) {
                    name.put("en_US", saveData.getName_en_US());
                }
                if (saveData.getName_zh_TW() != null) {
                    name.put("zh_TW", saveData.getName_zh_TW());
                }
                if (!CollectionUtils.isEmpty(name)) {
                    customerTrade.put("name", name);
                }
                customerTradeList.add(customerTrade);
            }
        }
        return customerTradeList;
    }
}

