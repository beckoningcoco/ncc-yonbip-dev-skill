/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.aspectj.lang.annotation.AfterReturning
 *  org.aspectj.lang.annotation.Aspect
 *  org.aspectj.lang.annotation.Pointcut
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.query.parser.QuerySchemaBuilder
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.EnableAspectJAutoProxy
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.divert;

import com.yonyoucloud.upc.service.api.MerchantApplyRpcService;
import com.yonyoucloud.upc.service.api.ProductApplyRpcService;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.imeta.orm.base.Json;
import org.imeta.orm.query.parser.QuerySchemaBuilder;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component
@Aspect
@EnableAspectJAutoProxy(exposeProxy=true)
public class MddExtComQueryApiServiceAspect {
    private static final Logger log = LoggerFactory.getLogger(MddExtComQueryApiServiceAspect.class);
    @Autowired
    ProductApplyRpcService productApplyRpcService;
    @Autowired
    private MerchantApplyRpcService merchantApplyRpcService;

    @Pointcut(value="execution(public * com.yonyou.ucf.mdd.ext.service.MddExtComQueryApiService.queryInternational(..)) && args(fullname, json, useES, formatData, replaceEnum, busiScence, extendParams)")
    public void handle(String fullname, String json, boolean useES, boolean formatData, boolean replaceEnum, String busiScence, Map<String, Object> extendParams) throws Exception {
    }

    @AfterReturning(value="handle(fullname, json, useES, formatData, replaceEnum, busiScence, extendParams)", returning="result")
    public void processResult(String fullname, String json, boolean useES, boolean formatData, boolean replaceEnum, String busiScence, Map<String, Object> extendParams, Object result) {
        if ("pc.productapply.ProductApply".equals(fullname)) {
            List resultList = (List)result;
            try {
                QuerySchema schema = QuerySchemaBuilder.fromJson((Json)new Json(json));
                this.resolveProductApply(schema, resultList);
            }
            catch (Exception e) {
                log.error("MddExtComQueryApiServiceAspect-\u5f02\u5e38\u4fe1\u606f:" + e.getMessage(), (Throwable)e);
            }
        } else if ("aa.customerapply.CustomerApply".equals(fullname)) {
            try {
                List resultList = (List)result;
                QuerySchema schema = QuerySchemaBuilder.fromJson((Json)new Json(json));
                this.resolveCustomerApply(schema, resultList);
            }
            catch (Exception e) {
                log.error("MddExtComQueryApiServiceAspect-\u5ba2\u6237\u7533\u8bf7\u5f02\u5e38\u4fe1\u606f:" + e.getMessage(), (Throwable)e);
            }
        }
    }

    private <T extends Map<String, Object>> void resolveProductApply(QuerySchema schema, List<T> resultList) {
        List queryFieldList = schema.selectFields();
        Long id = 0L;
        List conditions = schema.queryConditionGroup().getConditions();
        for (ConditionExpression condition : conditions) {
            if (!(condition instanceof QueryCondition) || !"id".equals(((QueryCondition)condition).getField())) continue;
            id = Long.valueOf(((QueryCondition)condition).getV1().toString());
        }
        if (!CollectionUtils.isEmpty((Collection)queryFieldList)) {
            Map result = !CollectionUtils.isEmpty(resultList) ? (Map)resultList.get(0) : new HashMap();
            for (QueryField queryField : queryFieldList) {
                Object value;
                if (queryField.name() == null || !queryField.name().contains("applyProductId.") || id <= 0L || (value = this.productApplyRpcService.getProductApplyValue(queryField.name(), id)) == null) continue;
                result.put(queryField.alias(), value);
            }
            if (CollectionUtils.isEmpty(resultList)) {
                resultList.add(result);
            }
        }
    }

    private <T extends Map<String, Object>> void resolveCustomerApply(QuerySchema schema, List<T> resultList) {
        List queryFieldList = schema.selectFields();
        Long id = 0L;
        List conditions = schema.queryConditionGroup().getConditions();
        for (ConditionExpression condition : conditions) {
            if (!(condition instanceof QueryCondition) || !"id".equals(((QueryCondition)condition).getField())) continue;
            id = Long.valueOf(((QueryCondition)condition).getV1().toString());
        }
        if (!CollectionUtils.isEmpty((Collection)queryFieldList)) {
            Map result = !CollectionUtils.isEmpty(resultList) ? (Map)resultList.get(0) : new HashMap();
            for (QueryField queryField : queryFieldList) {
                Object value;
                if (queryField.name() == null || !queryField.name().contains("applyCustomer.") || id <= 0L || (value = this.merchantApplyRpcService.getMerchantApplyValue(queryField.name(), id)) == null) continue;
                result.put(queryField.alias(), value);
            }
            if (CollectionUtils.isEmpty(resultList)) {
                resultList.add(result);
            }
        }
    }
}

