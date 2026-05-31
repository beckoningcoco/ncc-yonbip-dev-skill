/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  com.yonyou.ucf.mdd.common.utils.json.GsonHelper
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApplyHistoryDTO
 *  com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus
 *  com.yonyoucloud.upc.other.HistoryResult
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyou.ucf.mdd.common.utils.json.GsonHelper;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.customerapply.CustomerApplyHistoryDTO;
import com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus;
import com.yonyoucloud.upc.other.HistoryResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class CustomerApplyHistoryService {
    private static final Logger log = LoggerFactory.getLogger(CustomerApplyHistoryService.class);
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public HistoryResult getCustomerApplyHistory(CustomerApplyHistoryDTO customerApplyHistoryDTO) throws Exception {
        if (StringUtils.isNotEmpty((CharSequence)customerApplyHistoryDTO.getCustomerApplyId())) {
            HashMap<String, String> parameterMap = new HashMap<String, String>();
            parameterMap.put("serviceCode", customerApplyHistoryDTO.getServiceCode());
            parameterMap.put("terminalType", customerApplyHistoryDTO.getTerminalType());
            parameterMap.put("busiObjId", customerApplyHistoryDTO.getBusiObjId());
            parameterMap.put("busiObjTypeCode", customerApplyHistoryDTO.getBusiObjTypeCode());
            parameterMap.put("tenantId", customerApplyHistoryDTO.getTenantId());
            parameterMap.put("struct", customerApplyHistoryDTO.getStruct());
            parameterMap.put("customerApplyId", customerApplyHistoryDTO.getCustomerApplyId());
            parameterMap.put("needTranslate", "false");
            HistoryResult merchantHistory = this.getMerchantHistory(parameterMap);
            Long customerApplyId = Long.parseLong((String)parameterMap.get("customerApplyId"));
            CustomerApply customerApply = this.getCustomerApplyById(customerApplyId);
            return this.mergeCustomerApplyToProductHistory(customerApply, merchantHistory);
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800137);
    }

    private HistoryResult mergeCustomerApplyToProductHistory(CustomerApply customerApply, HistoryResult merchantHistory) {
        if (customerApply == null) {
            return merchantHistory;
        }
        merchantHistory.setStatus(Integer.valueOf(1));
        ArrayList<Map<String, Object>> data = merchantHistory.getData();
        Map<String, Object> customerApplyHistory = this.processCustomerApply(customerApply);
        if (CollectionUtils.isEmpty((Collection)data)) {
            data = new ArrayList<Map<String, Object>>();
            data.add(customerApplyHistory);
            merchantHistory.setData(data);
        } else {
            data.add(0, customerApplyHistory);
        }
        return merchantHistory;
    }

    private Map<String, Object> processCustomerApply(CustomerApply customerApply) {
        HashMap<String, Object> customerApplyMap = new HashMap<String, Object>();
        customerApplyMap.put("mdUri", "aa.merchant.Merchant");
        customerApplyMap.put("busiObjTypeCode", "aa_merchant");
        customerApplyMap.put("busiObjTypeName", "\u5ba2\u6237");
        customerApplyMap.put("busiObjTypeName2", "Merchant");
        customerApplyMap.put("busiObjTypeName3", "\u5ba2\u6236");
        customerApplyMap.put("busiObjCode", customerApply.getMerchantCode());
        customerApplyMap.put("busiObjName", customerApply.getMerchantName());
        customerApplyMap.put("operCode", "update");
        customerApplyMap.put("operationName", "\u66f4\u65b0");
        customerApplyMap.put("operationName4Select", "\u66f4\u65b0");
        customerApplyMap.put("operator", customerApply.getCreatorId());
        customerApplyMap.put("operatorName", customerApply.getCreator());
        customerApplyMap.put("operationDate", customerApply.getCreateTime());
        customerApplyMap.put("tenantId", AppContext.getCurrentUser().getYTenantId());
        customerApplyMap.put("operResult", "success");
        customerApplyMap.put("ts", customerApply.getCreateTime());
        customerApplyMap.put("struct", 1);
        customerApplyMap.put("domain", "iuap-apdoc-material");
        customerApplyMap.put("serviceCode", "aa_merchant");
        customerApplyMap.put("serviceName", "\u5ba2\u6237\u6863\u6848");
        customerApplyMap.put("serviceName2", "Customer File");
        customerApplyMap.put("serviceName3", "\u5ba2\u6236\u6a94\u6848");
        customerApplyMap.put("applicationCode", ApplicationCodeConstant.getApplicationCodeByFullName((String)"aa.merchant.Merchant"));
        customerApplyMap.put("applicationName", "Customers Information");
        customerApplyMap.put("applicationName2", "Master Data");
        customerApplyMap.put("applicationName3", "\u5ba2\u6236\u8cc7\u8a0a");
        customerApplyMap.put("labelCode", "PF");
        customerApplyMap.put("labelName", "\u6570\u5b57\u5316\u5efa\u6a21");
        customerApplyMap.put("labelName2", "Digital Modeling");
        customerApplyMap.put("labelName3", "\u6578\u5b57\u5316\u5efa\u6a21");
        customerApplyMap.put("compress", 1);
        customerApplyMap.put("ytenantId", AppContext.getCurrentUser().getYTenantId());
        JSONObject jsonObject = JSON.parseObject((String)customerApply.getCustomerData());
        customerApplyMap.put("newBusiObj", jsonObject.toJSONString());
        return customerApplyMap;
    }

    private CustomerApply getCustomerApplyById(Long customerApplyId) throws Exception {
        if (customerApplyId == null) {
            return null;
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("id,applyCode,merchantCode,merchantName,creatorId,creator,createTime,customerData").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)customerApplyId), QueryCondition.name((String)"effectStatus").eq((Object)CustomerEffectStatus.pending.getValue())}));
        List customerApplyList = MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApply", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)customerApplyList)) {
            return (CustomerApply)customerApplyList.get(0);
        }
        return null;
    }

    private HistoryResult getMerchantHistory(Map<String, String> parameterMap) {
        HashMap<String, String> headerParams = new HashMap<String, String>();
        String domainUrl = this.ymsParamConfig.getDomainIUapAuditLog();
        headerParams.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
        YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
        ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
        YmsHttpRequest request = new YmsHttpRequestBuilder().url(domainUrl + "/log-pub/business/rest/search/historyNoAuth").method(YmsHttpMethod.GET).addQueryParam(parameterMap).addHeader(ymsHttpHeader.addAllMap(headerParams)).build();
        String response = "";
        try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
            response = ymsHttpResponse.getBodyString();
        }
        catch (Exception e) {
            log.error("getProductHistory Exception!", (Throwable)e);
        }
        HistoryResult historyResult = new HistoryResult();
        if (StringUtils.isEmpty((CharSequence)response)) {
            historyResult.setCode("999");
            historyResult.setMessage(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1AAEC41805480015", (String)"\u672a\u83b7\u53d6\u5230\u53d8\u66f4\u5386\u53f2"));
            return historyResult;
        }
        if (GsonHelper.isGoodJson((String)response)) {
            try {
                historyResult = (HistoryResult)JSON.parseObject((String)response, HistoryResult.class);
            }
            catch (Exception e) {
                historyResult.setCode("999");
                historyResult.setMessage(e.getMessage());
            }
        } else {
            log.error("\u83b7\u53d6\u53d8\u66f4\u5386\u53f2\u5931\u8d25:{}", (Object)response);
            historyResult.setCode("999");
            historyResult.setMessage(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1AAEC41805480014", (String)"\u83b7\u53d6\u53d8\u66f4\u5386\u53f2\u5931\u8d25"));
        }
        return historyResult;
    }
}

