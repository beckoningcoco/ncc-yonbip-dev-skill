/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.tpl.ProductTplBrand
 *  com.yonyoucloud.upc.pc.tpl.ProductTplParameter
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.yonyoucloud.upc.billrule.tpl;

import com.google.gson.Gson;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IBizReferenceCheckService;
import com.yonyoucloud.upc.pc.tpl.ProductTplBrand;
import com.yonyoucloud.upc.pc.tpl.ProductTplParameter;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProducttplUtils {
    private static final Logger log = LoggerFactory.getLogger(ProducttplUtils.class);
    private static ProducttplUtils producttplUtils = new ProducttplUtils();
    private static final HashMap<String, String> CHECK_DOMAIN = new HashMap();
    private static final HashMap<String, String> DOMAIN_RULE;
    private static final List<String> CHECK_FIELDS_ALL;

    private ProducttplUtils() {
    }

    public static ProducttplUtils getInstance() {
        return producttplUtils;
    }

    public void checkBrandExists(List<ProductTplBrand> brands) throws Exception {
        if (brands == null) {
            return;
        }
        for (ProductTplBrand ptb : brands) {
            QuerySchema schema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"brand").eq((Object)ptb.getBrand()), QueryCondition.name((String)"template").eq((Object)ptb.getTemplate())})});
            List productTplBrands = MetaDaoHelper.query((String)"pc.tpl.ProductTplBrand", (QuerySchema)schema);
            this.dealStatus((BizObject)ptb, productTplBrands);
        }
    }

    public void checkParameterssExists(List<ProductTplParameter> productTplParameters) throws Exception {
        if (productTplParameters == null) {
            return;
        }
        for (ProductTplParameter parameter : productTplParameters) {
            QuerySchema schema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq(MultilangUtil.getAttr((String)"pc.tpl.ProductTplParameter", (String)"name", (BizObject)parameter, null)), QueryCondition.name((String)"template").eq((Object)parameter.getTemplate())})});
            List parameters = MetaDaoHelper.query((String)"pc.tpl.ProductTplParameter", (QuerySchema)schema);
            this.dealStatus((BizObject)parameter, parameters);
        }
    }

    public void dealStatus(BizObject bo, List<Map> lMap) {
        if (lMap != null && lMap.size() > 0 && bo.getEntityStatus() == EntityStatus.Insert) {
            bo.setEntityStatus(EntityStatus.Update);
            bo.setId(lMap.get(0).get("id"));
        }
        if (lMap != null && lMap.size() > 0 && bo.getEntityStatus() == EntityStatus.Delete) {
            bo.setId(lMap.get(0).get("id"));
        }
    }

    public void checkUnitRef(BillContext billContext, List<Map<String, Object>> bills, Map<String, Object> paramMap, String item, IBizReferenceCheckService checkService) throws Exception {
        Map field = (Map)new Gson().fromJson(item, Map.class);
        ArrayList<Long> productIds = new ArrayList<Long>();
        for (Map<String, Object> map : bills) {
            productIds.add((Long)map.get("id"));
        }
        if (CHECK_FIELDS_ALL.contains(field.get("key").toString())) {
            for (Map.Entry entry : CHECK_DOMAIN.entrySet()) {
                IRpcRule rpcRule;
                if (!ProductUtil.checkOpenOption("u8c-config", (String)entry.getValue()) || null == (rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class))) continue;
                RuleRegister billRuleRegister = ProductUtil.getBillRuleRegister("pc_product", "delete", DOMAIN_RULE.get(entry.getKey()), (String)entry.getKey());
                Long time1 = System.currentTimeMillis();
                log.info(String.format("ProducttplUtils@RPC: start. group = %s", entry.getKey()));
                RuleExecuteResult ruleResult = rpcRule.execute(billRuleRegister, billContext, paramMap);
                log.info("ProducttplUtils check field:[{}] execute rule:[{}], domain:[{}], result:[{}]", new Object[]{field.get("key"), billRuleRegister.getRuleId(), billRuleRegister.getDomain(), ruleResult});
                Long time2 = System.currentTimeMillis();
                log.info("ProducttplUtils@RPC: return. group = {}, time={}", entry.getKey(), (Object)(time2 - time1));
                if (null == ruleResult || ruleResult.getMsgCode() == 1) continue;
                throw new CoreDocBusinessException(ruleResult.getMessage());
            }
            Map<String, Object> result = checkService.checkReference("pc.product.Product", productIds);
            if (result.containsKey("error") && result.get("error") != null) {
                throw new CoreDocBusinessException(result.get("error").toString());
            }
        }
    }

    static {
        CHECK_DOMAIN.put("ustock", "app:ST");
        CHECK_DOMAIN.put("udinghuo", "app:SCMSA");
        CHECK_DOMAIN.put("yonyoufi", "app:IA");
        CHECK_DOMAIN.put("upu", "app:PU");
        CHECK_DOMAIN.put("engineeringdata", "app:ED");
        CHECK_DOMAIN.put("retail", "app:RM");
        CHECK_DOMAIN.put("uinttrade", "app:UIT");
        CHECK_DOMAIN.put("dst", "app:SDOC");
        DOMAIN_RULE = new HashMap();
        DOMAIN_RULE.put("ustock", "ustockProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("udinghuo", "productReferCheckByIdRule");
        DOMAIN_RULE.put("yonyoufi", "productIdReferCheckRule");
        DOMAIN_RULE.put("upu", "upuProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("engineeringdata", "deleteMaterialCheckRule");
        DOMAIN_RULE.put("retail", "retailProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("uinttrade", "uinttradeProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("dst", "dstProductQuoteNoOrgCheckRule");
        CHECK_FIELDS_ALL = new ArrayList<String>();
        CHECK_FIELDS_ALL.add("unit_Name");
        CHECK_FIELDS_ALL.add("unitUseType");
        CHECK_FIELDS_ALL.add("enableAssistUnit");
        CHECK_FIELDS_ALL.add("assistUnit");
        CHECK_FIELDS_ALL.add("assistUnit_Name");
        CHECK_FIELDS_ALL.add("mainUnitCount");
        CHECK_FIELDS_ALL.add("unitExchangeType");
    }
}

