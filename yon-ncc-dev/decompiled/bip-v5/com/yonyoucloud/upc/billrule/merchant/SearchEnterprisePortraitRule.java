/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="searchEnterprisePortraitRule")
public class SearchEnterprisePortraitRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(SearchEnterprisePortraitRule.class);
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        List data = (List)billDataDto.getData();
        String token = ((Map)data.get(0)).get("token").toString();
        JSONObject value = this.queryBaseInfo(token);
        this.putParam(paramMap, "return", value);
        return new RuleExecuteResult((Object)value);
    }

    public JSONObject queryBaseInfo(String token) {
        String yhturl = this.ymsParamConfig.getDomainIuapDataEP() + "/intellid/rest/enterprise/getBaseInfo";
        String url = yhturl + "?token=" + token;
        YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
        ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
        YmsHttpRequest request = new YmsHttpRequestBuilder().url(url).addHeader(ymsHttpHeader).method(YmsHttpMethod.GET).build();
        String resultString = "";
        try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
            resultString = ymsHttpResponse.getBodyString();
        }
        catch (Exception e) {
            log.error("queryBaseInfo Exception!", (Throwable)e);
        }
        JSONObject jsonObject = JSONObject.parseObject((String)resultString);
        Object status = jsonObject.get((Object)"status");
        if (status.toString().equals("1")) {
            JSONObject jsonObject1 = (JSONObject)jsonObject.get((Object)"result");
            JSONObject newJson = new JSONObject();
            newJson.put("enterpriseName", this.handleValue(jsonObject1.get((Object)"name")));
            newJson.put("peopleNum", this.handleValue(jsonObject1.get((Object)"staffNumRange")));
            newJson.put("contactTel", this.handleValue(jsonObject1.get((Object)"contactTel")));
            newJson.put("email", this.handleValue(jsonObject1.get((Object)"contactEmail")));
            newJson.put("website", this.handleValue(jsonObject1.get((Object)"website")));
            newJson.put("regAddress", this.handleValue(jsonObject1.get((Object)"regLocation")));
            newJson.put("leaderName", this.handleValue(jsonObject1.get((Object)"legalPersonName")));
            newJson.put("buildTime", this.handleValue(jsonObject1.get((Object)"estiblishTime")));
            newJson.put("money", this.handleValue(jsonObject1.get((Object)"regCapital")));
            newJson.put("scope", this.handleValue(jsonObject1.get((Object)"businessScope")));
            newJson.put("buildTime", this.handleValue(jsonObject1.get((Object)"estiblishTime")));
            newJson.put("creditCode", this.handleValue(jsonObject1.get((Object)"creditCode")));
            newJson.put("address", this.handleValue(jsonObject1.get((Object)"regLocation")));
            return newJson;
        }
        String pattern = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408003C", (String)"\u8c03\u7528\u4f01\u4e1a\u6838\u5b9e\u62a5\u9519{0}");
        throw new RuntimeException(MessageFormat.format(pattern, jsonObject.get((Object)"message")));
    }

    private Object handleValue(Object value) {
        if (value == null) {
            return value;
        }
        if ("-".equals(value.toString())) {
            return "";
        }
        return value;
    }
}

