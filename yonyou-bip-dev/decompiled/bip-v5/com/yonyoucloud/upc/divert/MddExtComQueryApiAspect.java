/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.aspectj.lang.ProceedingJoinPoint
 *  org.aspectj.lang.annotation.Around
 *  org.aspectj.lang.annotation.Aspect
 *  org.aspectj.lang.annotation.Pointcut
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.query.parser.QuerySchemaBuilder
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
import java.util.List;
import java.util.Map;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.imeta.orm.base.Json;
import org.imeta.orm.query.parser.QuerySchemaBuilder;
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
public class MddExtComQueryApiAspect {
    private static final Logger log = LoggerFactory.getLogger(MddExtComQueryApiAspect.class);
    @Autowired
    private MerchantApplyRpcService merchantApplyRpcService;
    @Autowired
    ProductApplyRpcService productApplyRpcService;

    @Pointcut(value="execution(public * com.yonyou.ucf.mdd.ext.service.MddExtComQueryApiService.query(..)) && args(fullname, json) || execution(public * com.yonyou.ypd.bill.service.impl.YpdExtComQueryApiService.query(..)) && args(fullname, json)", argNames="fullname, json")
    public void handle(String fullname, String json) throws Exception {
    }

    @Around(value="handle(fullname, json)")
    public <T extends Map<String, Object>> List<T> around(ProceedingJoinPoint point, String fullname, String json) throws Throwable {
        List resultList = (List)point.proceed();
        try {
            QuerySchema schema = QuerySchemaBuilder.fromJson((Json)new Json(json));
            if ("aa.customerapply.CustomerApply".equals(fullname)) {
                this.aroundCustomerApply(schema, resultList);
            } else if ("pc.productapply.ProductApply".equals(fullname)) {
                this.aroundProductApply(schema, resultList);
            }
        }
        catch (Exception e) {
            log.error("MddExtComQueryApiAspect-around\u5f02\u5e38\u4fe1\u606f:" + e.getMessage(), (Throwable)e);
        }
        return resultList;
    }

    private <T extends Map<String, Object>> void aroundProductApply(QuerySchema schema, List<T> resultList) {
        List queryFieldList = schema.selectFields();
        if (!CollectionUtils.isEmpty((Collection)queryFieldList) && !CollectionUtils.isEmpty(resultList) && resultList.size() == 1) {
            Map result = (Map)resultList.get(0);
            for (QueryField queryField : queryFieldList) {
                Object value;
                if (queryField.name() == null || !queryField.name().contains("applyProductId.") || result.get("id") == null || (value = this.productApplyRpcService.getProductApplyValue(queryField.name(), Long.valueOf(result.get("id").toString()))) == null) continue;
                result.put(queryField.alias(), value);
            }
        }
    }

    private <T extends Map<String, Object>> void aroundCustomerApply(QuerySchema schema, List<T> resultList) throws Exception {
        List queryFieldList = schema.selectFields();
        if (!CollectionUtils.isEmpty((Collection)queryFieldList) && !CollectionUtils.isEmpty(resultList) && resultList.size() == 1) {
            Map result = (Map)resultList.get(0);
            for (QueryField queryField : queryFieldList) {
                Object value;
                if (queryField.name() == null || !queryField.name().contains("applyCustomer.") || result.get("id") == null || (value = this.merchantApplyRpcService.getMerchantApplyValue(queryField.name(), Long.valueOf(result.get("id").toString()))) == null) continue;
                result.put(queryField.alias(), value);
            }
        }
    }
}

