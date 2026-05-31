/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.constant.ApplicationCodeConstant
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  com.yonyou.ucf.mdd.common.utils.json.GsonHelper
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.data.productapply.ProductApplyQueryDao
 *  com.yonyoucloud.upc.other.HistoryResult
 *  com.yonyoucloud.upc.pc.productapply.EffectStatus
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
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
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyou.ucf.mdd.common.utils.json.GsonHelper;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.data.productapply.ProductApplyQueryDao;
import com.yonyoucloud.upc.other.HistoryResult;
import com.yonyoucloud.upc.pc.productapply.EffectStatus;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import com.yonyoucloud.upc.service.UPCBillService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
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
public class ProductApplyHistoryService {
    private static final Logger log = LoggerFactory.getLogger(ProductApplyHistoryService.class);
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    ProductApplyQueryDao productApplyQueryDao;
    @Autowired
    UPCBillService upcBillService;

    public HistoryResult getProductApplyHistory(Map parameterMap) throws Exception {
        HistoryResult productHistory = new HistoryResult();
        if (parameterMap.get("isCreator") != null && BooleanUtil.isFalse(parameterMap.get("isCreator"))) {
            ArrayList history = new ArrayList();
            parameterMap.put("busiObjTypeCode", "pc_product");
            HistoryResult productHistorys = this.getProductHistory("/log-pub/business/rest/search/historyNoAuth", parameterMap);
            if (!CollectionUtils.isEmpty((Collection)productHistorys.getData())) {
                List productInsertHistory = productHistorys.getData().stream().filter(p -> "insert".equals(p.get("operCode"))).collect(Collectors.toList());
                history.addAll(productInsertHistory);
            }
            parameterMap.put("busiObjTypeCode", "pc_productdetail");
            HistoryResult productDetailHistory = this.getProductHistory("/log-pub/business/rest/search/historyNoAuth", parameterMap);
            history.addAll(0, productDetailHistory.getData());
            if (!CollectionUtils.isEmpty(history)) {
                productHistory.setStatus(Integer.valueOf(1));
                productHistory.setData(history);
            }
        } else {
            productHistory = this.getProductHistory("/log-pub/business/rest/search/historyNoAuth", parameterMap);
        }
        ProductApply productApply = this.getProductApplyById(parameterMap);
        return this.mergeProductApplyToProductHistory(productApply, productHistory);
    }

    private HistoryResult mergeProductApplyToProductHistory(ProductApply productApply, HistoryResult productHistory) {
        if (productApply == null) {
            return productHistory;
        }
        productHistory.setStatus(Integer.valueOf(1));
        ArrayList<Map<String, Object>> data = productHistory.getData();
        Map<String, Object> productApplyHistory = this.processProductApply(productApply);
        if (CollectionUtils.isEmpty((Collection)data)) {
            data = new ArrayList<Map<String, Object>>();
            data.add(productApplyHistory);
        } else {
            data.add(0, productApplyHistory);
        }
        return productHistory;
    }

    private Map<String, Object> processProductApply(ProductApply productApply) {
        HashMap<String, Object> productApplyMap = new HashMap<String, Object>();
        productApplyMap.put("mdUri", "pc.product.Product");
        productApplyMap.put("busiObjTypeCode", "pc_product");
        productApplyMap.put("busiObjTypeName", "\u7269\u6599");
        productApplyMap.put("busiObjTypeName2", "Material");
        productApplyMap.put("busiObjTypeName3", "\u7269\u6599");
        productApplyMap.put("busiObjCode", productApply.getProductCode());
        productApplyMap.put("busiObjName", productApply.getProductName());
        productApplyMap.put("operCode", "update");
        productApplyMap.put("operationName", "\u66f4\u65b0");
        productApplyMap.put("operationName4Select", "\u66f4\u65b0");
        productApplyMap.put("operator", productApply.getCreatorId());
        productApplyMap.put("operatorName", productApply.getCreator());
        productApplyMap.put("operationDate", productApply.getCreateTime());
        productApplyMap.put("tenantId", AppContext.getCurrentUser().getYTenantId());
        productApplyMap.put("operResult", "success");
        productApplyMap.put("ts", productApply.getCreateTime());
        productApplyMap.put("struct", 1);
        productApplyMap.put("domain", "iuap-apdoc-material");
        productApplyMap.put("serviceCode", "pc_product");
        productApplyMap.put("serviceName", "\u7269\u6599\u521b\u5efa");
        productApplyMap.put("serviceName2", "Matl Creation");
        productApplyMap.put("serviceName3", "\u7269\u6599\u5275\u5efa");
        productApplyMap.put("applicationCode", ApplicationCodeConstant.getApplicationCodeByFullName((String)"aa.merchant.Merchant"));
        productApplyMap.put("applicationName", "\u7269\u6599\u4fe1\u606f");
        productApplyMap.put("applicationName2", "Material Information");
        productApplyMap.put("applicationName3", "\u7269\u6599\u8cc7\u8a0a");
        productApplyMap.put("labelCode", "PF");
        productApplyMap.put("labelName", "\u57fa\u7840\u6570\u636e");
        productApplyMap.put("labelName2", "Master Data");
        productApplyMap.put("labelName3", "\u57fa\u790e\u6578\u64da");
        productApplyMap.put("compress", 1);
        productApplyMap.put("ytenantId", AppContext.getCurrentUser().getYTenantId());
        JSONObject jsonObject = JSON.parseObject((String)productApply.getProductData());
        jsonObject.remove((Object)"time!dateRange");
        productApplyMap.put("newBusiObj", jsonObject.toJSONString());
        return productApplyMap;
    }

    private ProductApply getProductApplyById(Map<String, Object> param) throws Exception {
        if (param.get("productApplyId") == null) {
            return null;
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("id,applyCode,productCode,productName,creatorId,creator,createTime,productData").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)Long.parseLong(param.get("productApplyId").toString())), QueryCondition.name((String)"effectStatus").eq((Object)EffectStatus.pending.getValue())}));
        List productApplyList = MetaDaoHelper.queryObject((String)"pc.productapply.ProductApply", (QuerySchema)querySchema, null);
        if (CollectionUtils.isEmpty((Collection)productApplyList)) {
            return null;
        }
        return (ProductApply)productApplyList.get(0);
    }

    private HistoryResult getProductHistory(String historyUrl, Map<String, String> parameterMap) {
        HashMap<String, String> headerParams = new HashMap<String, String>();
        String domainUrl = this.ymsParamConfig.getDomainIUapAuditLog();
        headerParams.put("yht_access_token", InvocationInfoProxy.getYhtAccessToken());
        YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
        ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
        YmsHttpRequest request = new YmsHttpRequestBuilder().url(domainUrl + historyUrl).method(YmsHttpMethod.GET).addQueryParam(parameterMap).addHeader(ymsHttpHeader.addAllMap(headerParams)).build();
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

    public Map productApplyOriginInfo(String id) throws Exception {
        if (StringUtils.isEmpty((CharSequence)id)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PARAM_IS_NULL);
        }
        Map result = new HashMap();
        ProductApply productApply = this.productApplyQueryDao.getProductApplyByIdAndFields(Long.valueOf(Long.parseLong(id)), new String[]{"id", "applyType", "applyProductId", "effectStatus", "productData", "originProductData"});
        if (productApply == null || !ProductApplyType.modify.equals((Object)productApply.getApplyType())) {
            return result;
        }
        if (!EffectStatus.success.equals((Object)productApply.getEffectStatus())) {
            Map productData = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(productApply.getProductData(), Map.class);
            if (null != productData.get("detail!productApplyRangeId")) {
                List range = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect(new String[]{"isCreator", "isApplied"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productData.get("detail!productApplyRangeId"))})));
                if (CollectionUtils.isEmpty((Collection)range)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800772, new Object[]{productApply.getApplyCode()});
                }
                HashMap params = new HashMap(3);
                params.put("@productApplyRangeId", productData.get("detail!productApplyRangeId"));
                params.put("isCreator", ((Map)range.get(0)).get("isCreator"));
                params.put("isApplied", ((Map)range.get(0)).get("isApplied"));
                BillDataDto bill = new BillDataDto("pc_productdetail", productApply.getApplyProductId().toString());
                bill.setMapCondition(params);
                result = this.upcBillService.detail(bill);
            }
        } else if (!StringUtils.isEmpty((CharSequence)productApply.getOriginProductData())) {
            result = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(productApply.getOriginProductData(), Map.class);
        }
        return result;
    }
}

