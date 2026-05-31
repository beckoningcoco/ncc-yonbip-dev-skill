/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.json.JSONArray
 *  cn.hutool.json.JSONObject
 *  cn.hutool.json.JSONUtil
 *  com.yonyoucloud.upc.ipass.models.PassBatchPageSaveResponse
 *  com.yonyoucloud.upc.ipass.models.PassCommonConstant
 *  com.yonyoucloud.upc.ipass.models.PassCommonResponse
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.iuap.ipass.utils;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.yonyoucloud.upc.ipass.models.PassBatchPageSaveResponse;
import com.yonyoucloud.upc.ipass.models.PassCommonConstant;
import com.yonyoucloud.upc.ipass.models.PassCommonResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class PassResponseUtil {
    public static PassBatchPageSaveResponse buildForeachSaveResponse(List<PassCommonResponse> commonResponses) {
        int successCount = 0;
        int failCount = 0;
        Object retObj = null;
        ArrayList infos = new ArrayList();
        ArrayList messages = new ArrayList();
        for (PassCommonResponse response : commonResponses) {
            if (PassCommonConstant.SUCCESS_CODE_LIST.contains(response.getCode())) {
                JSONObject resultData = JSONUtil.createObj();
                if (Objects.nonNull(response.getData()) && response.getData() instanceof JSONArray) {
                    JSONArray jsonArray = JSONUtil.parseArray((Object)response.getData());
                    resultData = jsonArray.getJSONObject((Object)0);
                } else if (Objects.nonNull(response.getData()) && response.getData() instanceof JSONObject) {
                    resultData = JSONUtil.parseObj((Object)response.getData());
                }
                HashMap<String, Map<String, Object>> infoMap = new HashMap<String, Map<String, Object>>();
                Map<String, Object> uniqueMap = PassResponseUtil.getUniqueMap(response.getSourceUnique(), resultData);
                if (response.getNeedBusinessData().booleanValue()) {
                    uniqueMap.put("businessData", resultData);
                }
                infoMap.put("data", uniqueMap);
                infos.add(infoMap);
                retObj = response.getData();
                ++successCount;
                continue;
            }
            HashMap<String, String> messageMap = new HashMap<String, String>();
            messageMap.put("sourceUnique", response.getSourceUnique());
            messageMap.put("message", response.getMessage());
            messages.add(messageMap);
            ++failCount;
        }
        PassBatchPageSaveResponse response = new PassBatchPageSaveResponse();
        response.setCount(Integer.valueOf(commonResponses.size()));
        response.setSuccessCount(Integer.valueOf(successCount));
        response.setFailCount(Integer.valueOf(failCount));
        response.setInfos(infos);
        response.setMessages(messages);
        PassResponseUtil.buildOutputCodeAndMessage(response);
        if (commonResponses.get(0).getNeedRetObj().booleanValue()) {
            response.setRetObj(retObj);
        }
        return response;
    }

    public static JSONObject buildProductArchives(JSONObject dataJson) {
        JSONArray preferredMaterials;
        JSONObject productArchives = new JSONObject();
        String erpNo = (String)dataJson.get((Object)"code", String.class);
        String productId = (String)dataJson.get((Object)"id", String.class);
        productArchives.set("erpCode", (Object)erpNo);
        productArchives.set("code", (Object)erpNo);
        productArchives.set("id", (Object)productId);
        JSONArray productAssistUnitExchanges = dataJson.getJSONArray((Object)"productAssistUnitExchanges");
        if (!CollectionUtils.isEmpty((Collection)productAssistUnitExchanges)) {
            productArchives.set("productAssistUnitExchanges", (Object)PassResponseUtil.buildProductAssistUnitExchanges(productAssistUnitExchanges));
        }
        if (!CollectionUtils.isEmpty((Collection)(preferredMaterials = dataJson.getJSONArray((Object)"PreferredMeterialList")))) {
            productArchives.set("PreferredMeterialList", PassResponseUtil.buildPreferredMaterials(preferredMaterials));
        }
        return productArchives;
    }

    public static Map<String, Object> getUniqueMap(String sourceUnique, JSONObject dataJson) {
        HashMap<String, Object> uniqueMap = new HashMap<String, Object>();
        uniqueMap.put("sourceUnique", sourceUnique);
        if (dataJson.containsKey((Object)"id")) {
            uniqueMap.put("targetUnique", dataJson.get((Object)"id"));
        } else if (dataJson.containsKey((Object)"targetUnique")) {
            uniqueMap.put("targetUnique", dataJson.get((Object)"targetUnique"));
        } else if (dataJson.containsKey((Object)"applyRowId")) {
            uniqueMap.put("targetUnique", dataJson.get((Object)"applyRowId"));
        } else if (dataJson.containsKey((Object)"skuCode")) {
            uniqueMap.put("targetUnique", dataJson.get((Object)"skuCode"));
        } else if (dataJson.containsKey((Object)"erpOrderid")) {
            uniqueMap.put("targetUnique", dataJson.get((Object)"erpOrderid"));
        }
        return uniqueMap;
    }

    public static void buildOutputCodeAndMessage(PassBatchPageSaveResponse response) {
        if (response.getFailCount() == 0) {
            response.setCode("200");
            response.setMessage("\u5168\u90e8\u6210\u529f");
        } else {
            StringBuilder errMsgStr = new StringBuilder(32);
            List errMsgList = response.getMessages();
            if (!CollectionUtils.isEmpty((Collection)errMsgList)) {
                int index = 1;
                for (Map msg : errMsgList) {
                    if (!msg.containsKey("message")) continue;
                    errMsgStr.append(index++).append(".").append("message=").append(msg.get("message")).append(";");
                }
            }
            if (response.getFailCount() >= response.getCount()) {
                response.setCode("999");
                response.setMessage("\u5168\u90e8\u5931\u8d25:" + errMsgStr);
            } else {
                response.setCode("444444");
                response.setMessage("\u90e8\u5206\u6210\u529f\uff1a" + errMsgStr);
            }
        }
    }

    private static JSONArray buildProductAssistUnitExchanges(JSONArray productAssistUnitExchanges) {
        JSONArray productAssistUnitExchangesRet = new JSONArray();
        productAssistUnitExchanges.forEach(item -> {
            JSONObject productAssistUnitExchange = JSONUtil.parseObj((Object)item);
            JSONObject productAssistUnitExchangeRet = new JSONObject();
            productAssistUnitExchangeRet.set("assistUnit_Code", productAssistUnitExchange.get((Object)"assistUnit_Code"));
            productAssistUnitExchangeRet.set("id", productAssistUnitExchange.get((Object)"id"));
            productAssistUnitExchangesRet.add((Object)productAssistUnitExchangeRet);
        });
        return productAssistUnitExchangesRet;
    }

    private static Object buildPreferredMaterials(JSONArray preferredMaterials) {
        JSONArray preferredMaterialsRet = new JSONArray();
        preferredMaterials.forEach(item -> {
            JSONObject preferredMaterial = JSONUtil.parseObj((Object)item);
            JSONObject preferredMaterialRet = new JSONObject();
            preferredMaterialRet.set("preferred_orgId_code", preferredMaterial.get((Object)"preferred_orgId_code"));
            preferredMaterialRet.set("id", preferredMaterial.get((Object)"id"));
            preferredMaterialsRet.add((Object)preferredMaterialRet);
        });
        return preferredMaterialsRet;
    }

    public PassBatchPageSaveResponse buildForeachSaveResponse(String billNum, List<PassCommonResponse> commonResponses) {
        int successCount = 0;
        int failCount = 0;
        Object retObj = null;
        ArrayList infos = new ArrayList();
        ArrayList messages = new ArrayList();
        for (PassCommonResponse response : commonResponses) {
            if (PassCommonConstant.SUCCESS_CODE_LIST.contains(response.getCode())) {
                JSONObject resultData = JSONUtil.createObj();
                if (Objects.nonNull(response.getData()) && response.getData() instanceof JSONArray) {
                    JSONArray jsonArray = JSONUtil.parseArray((Object)response.getData());
                    resultData = jsonArray.getJSONObject((Object)0);
                } else if (Objects.nonNull(response.getData()) && response.getData() instanceof JSONObject) {
                    resultData = JSONUtil.parseObj((Object)response.getData());
                }
                HashMap<String, Map<String, Object>> infoMap = new HashMap<String, Map<String, Object>>();
                Map<String, Object> uniqueMap = PassResponseUtil.getUniqueMap(response.getSourceUnique(), resultData);
                if ("product".equals(billNum)) {
                    uniqueMap.put("resultData", PassResponseUtil.buildProductArchives(resultData));
                }
                if (response.getNeedBusinessData().booleanValue()) {
                    uniqueMap.put("businessData", resultData);
                }
                infoMap.put("data", uniqueMap);
                infos.add(infoMap);
                retObj = response.getData();
                ++successCount;
                continue;
            }
            HashMap<String, String> messageMap = new HashMap<String, String>();
            messageMap.put("sourceUnique", response.getSourceUnique());
            messageMap.put("message", response.getMessage());
            messages.add(messageMap);
            ++failCount;
        }
        PassBatchPageSaveResponse response = new PassBatchPageSaveResponse();
        response.setCount(Integer.valueOf(commonResponses.size()));
        response.setSuccessCount(Integer.valueOf(successCount));
        response.setFailCount(Integer.valueOf(failCount));
        response.setInfos(infos);
        response.setMessages(messages);
        PassResponseUtil.buildOutputCodeAndMessage(response);
        if (commonResponses.get(0).getNeedRetObj().booleanValue()) {
            response.setRetObj(retObj);
        }
        return response;
    }

    public <T> JSONObject handleNameSaveParam(T request, List<String> multipleNames) {
        return new JSONObject().set("data", (Object)this.handleNameSaveParamToJsonArray(request, multipleNames));
    }

    public JSONObject handleNameSaveParamToJsonArray(Object t, List<String> multipleNames) {
        JSONObject jsonObject = JSONUtil.parseObj((Object)t);
        for (String multipleName : multipleNames) {
            HashMap<String, String> multipleMap = new HashMap<String, String>();
            if (jsonObject.containsKey((Object)multipleName)) {
                multipleMap.put("zh_CN", jsonObject.getStr((Object)multipleName));
            }
            if (jsonObject.containsKey((Object)(multipleName + "_en_US"))) {
                multipleMap.put("en_US", jsonObject.getStr((Object)(multipleName + "_en_US")));
            }
            if (jsonObject.containsKey((Object)(multipleName + "_zh_TW"))) {
                multipleMap.put("zh_TW", jsonObject.getStr((Object)(multipleName + "_zh_TW")));
            }
            if (multipleMap.isEmpty()) continue;
            jsonObject.set(multipleName, multipleMap);
        }
        return jsonObject;
    }
}

