/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.http.YmsHttpHeader
 *  com.yonyou.iuap.yms.http.YmsHttpMethod
 *  com.yonyou.iuap.yms.http.YmsHttpRequest
 *  com.yonyou.iuap.yms.http.YmsHttpRequestBuilder
 *  com.yonyou.iuap.yms.http.YmsHttpResponse
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.unit.Unit
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.unit;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.http.YmsHttpHeader;
import com.yonyou.iuap.yms.http.YmsHttpMethod;
import com.yonyou.iuap.yms.http.YmsHttpRequest;
import com.yonyou.iuap.yms.http.YmsHttpRequestBuilder;
import com.yonyou.iuap.yms.http.YmsHttpResponse;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.unit.Unit;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="unitDeleteRule")
public class UnitDeleteRule
extends AbstractCommonRule {
    private static Logger logger = LoggerFactory.getLogger(UnitDeleteRule.class);
    private String ACC_DELETE_UNIT_ACTION = "/api/crossValidate/getValidateResult";
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        Unit unit = (Unit)bills.get(0);
        if (this.checkProduct(unit)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_UNIT_IS_REFERENCE, new Object[]{unit.getCode()});
        }
        if (this.chechAcc(unit)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_UNIT_IS_REFERENCE_ACCOUNTING_SUBJECT);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean chechAcc(Unit unit) {
        String url = this.ymsParamConfig.getUrlAcc() + this.ACC_DELETE_UNIT_ACTION;
        HashMap<String, String> paramMap = new HashMap<String, String>();
        paramMap.put("thd_tenantId", AppContext.getCurrentUser().getYhtTenantId());
        paramMap.put("doctype", "measuredoc");
        paramMap.put("data", "{'id':'" + unit.getId() + "'}");
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Content-Type", "application/json");
        YmsHttpHeader ymsHttpHeader = new YmsHttpHeader();
        ymsHttpHeader.add("Content-Type", "application/json;charset=utf-8");
        YmsHttpRequest request = new YmsHttpRequestBuilder().url(url).method(YmsHttpMethod.POST).body((Object)JSON.toJSONString(paramMap)).addHeader(ymsHttpHeader.addAllMap(headers)).build();
        try (YmsHttpResponse ymsHttpResponse = this.ymsHttpClient.execute(request);){
            String result = ymsHttpResponse.getBodyString();
            Map map = (Map)JSONObject.parseObject((String)result, Map.class);
            Object success = map.get("success");
            Object message = map.get("message");
            if (!"true".equals(success.toString())) return false;
            if (!"cited".equals(message.toString())) return false;
            boolean bl = true;
            return bl;
        }
        catch (Exception e) {
            logger.error("\u6821\u9a8cacc\u5f15\u7528\u8ba1\u91cf\u5355\u4f4d\u5f02\u5e38" + e.getMessage(), (Throwable)e);
        }
        return false;
    }

    private boolean checkProduct(Unit unit) throws Exception {
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"unit").eq(unit.getId())});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
        List result = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        return !CollectionUtils.isEmpty((Collection)result);
    }
}

