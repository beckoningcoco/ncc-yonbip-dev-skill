/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.google.gson.internal.LinkedTreeMap
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.utils.json.GsonHelper
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.billrule.shopdecoration;

import com.alibaba.fastjson.JSON;
import com.google.gson.internal.LinkedTreeMap;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.utils.json.GsonHelper;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service(value="promotionProductReferRule")
public class PromotionProductReferRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(PromotionProductReferRule.class);
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        Object externalData = billDataDto.getExternalData();
        Map pomotionParam = null;
        if (externalData instanceof LinkedHashMap) {
            LinkedHashMap linkedHashMap = (LinkedHashMap)externalData;
            pomotionParam = (Map)linkedHashMap.get("pomotionParam");
        }
        if (pomotionParam != null) {
            pomotionParam.put("iAreaId", "all");
            pomotionParam.put("pageIndex", billDataDto.getPage().getPageIndex());
            pomotionParam.put("pageSize", billDataDto.getPage().getPageSize());
        }
        Pager result = this.getPromotionProduct(billDataDto, pomotionParam);
        this.putParam(map, "return", result);
        return new RuleExecuteResult((Object)result);
    }

    public Pager getPromotionProduct(BillDataDto dto, Map<String, Object> param) {
        Pager pager = new Pager();
        pager.setPageIndex(dto.getPage().getPageIndex());
        pager.setPageSize(dto.getPage().getPageSize());
        pager.setPageCount(dto.getPage().getTotalCount());
        String response = "";
        String token = InvocationInfoProxy.getYhtAccessToken();
        String url = this.ymsParamConfig.getUrlUmallServer() + "/api/Malls/getPromotionProduct" + "?token=" + token;
        YmsHttpRequest request = new YmsHttpRequestBuilder().url(url).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(param)).build();
        try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
            response = ymsHttpResponse.getBodyString();
            LinkedTreeMap map = (LinkedTreeMap)GsonHelper.FromJSon((String)response, Map.class);
            LinkedTreeMap data = (LinkedTreeMap)map.get((Object)"data");
            if (data != null && data.size() > 0) {
                List recordList = (List)data.get((Object)"recordList");
                pager.setRecordList(recordList);
                Double recordCount = Double.valueOf(data.get((Object)"count").toString());
                pager.setRecordCount(recordCount.intValue());
            }
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080177", (String)"\u83b7\u53d6\u5e97\u94fa\u88c5\u4fee\u4fc3\u9500\u5546\u54c1\u51fa\u9519:") + e.getMessage(), (Throwable)e);
        }
        return pager;
    }
}

