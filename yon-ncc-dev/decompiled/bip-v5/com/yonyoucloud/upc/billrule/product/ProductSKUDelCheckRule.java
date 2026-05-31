/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.utils.AsyncCheckUtil
 *  com.yonyoucloud.upc.utils.BizObjectUtils
 *  org.apache.commons.lang3.SerializationUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IBizReferenceCheckService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductQueryService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.AsyncCheckUtil;
import com.yonyoucloud.upc.utils.BizObjectUtils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.apache.commons.lang3.SerializationUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="productSKUDelCheckRule")
public class ProductSKUDelCheckRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductSKUDelCheckRule.class);
    private static final HashMap<String, String> CHECK_DOMAIN = new HashMap();
    private static final HashMap<String, String> DOMAIN_RULE;
    @Autowired
    private IUPCProductQueryService productQueryService;
    @Autowired
    private IBizReferenceCheckService referenceCheckService;
    @Autowired
    @Qualifier(value="ymsExecutorService")
    private ExecutorService ymsExecutorService;

    public RuleExecuteResult execute(final BillContext billContext, final Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PARAM_IS_NULL);
        }
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bill : bills) {
            Boolean fromAutoGenerateSKU = false;
            if (bill.containsKey((Object)"fromAutoGenerateSKU_")) {
                fromAutoGenerateSKU = (Boolean)bill.get("fromAutoGenerateSKU_");
            }
            if (!bill.containsKey((Object)"id") || bill.get("id") == null) continue;
            if (!(fromAutoGenerateSKU.booleanValue() || bill.containsKey((Object)"productApplyRangeId") && bill.get("productApplyRangeId") != null)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_RANGE_ID_NULL);
            }
            if (!fromAutoGenerateSKU.booleanValue()) {
                Map product = this.productQueryService.getProductInfoBySKUId(bill.get("id").toString(), bill.get("productApplyRangeId").toString());
                if (null == product || product.isEmpty()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_RELEASE_PRODUCT_IS_DELETE, new Object[]{bill.get("id").toString()});
                }
                if (product.get("isCreator").equals(false)) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_IS_NOT_SELF_CREATE);
                }
            }
            BizObjectUtils.clearMapParent((Map)bill);
            ArrayList<1> arrayList = new ArrayList<1>();
            for (final Map.Entry<String, String> entry : CHECK_DOMAIN.entrySet()) {
                boolean execCheck = false;
                if (entry.getValue().startsWith("u8c-config")) {
                    if (ProductUtil.checkOpenOption("u8c-config", entry.getValue().substring(18))) {
                        execCheck = true;
                    }
                } else if (ProductUtil.checkOpenOption("u8c-config", entry.getValue())) {
                    execCheck = true;
                }
                if (!execCheck) continue;
                arrayList.add(new Callable(){

                    public Object call() throws Exception {
                        return ProductSKUDelCheckRule.this.excuteRule(billContext, paramMap, (String)DOMAIN_RULE.get(entry.getKey()), (String)entry.getKey());
                    }
                });
            }
            String res = AsyncCheckUtil.check(arrayList, (ExecutorService)this.ymsExecutorService);
            if (StringUtils.isNotEmpty((CharSequence)res)) {
                throw new CoreDocBusinessException(res);
            }
            Map<String, Object> result = this.referenceCheckService.checkReference("pc.product.ProductSKU", Long.valueOf(bill.get("id").toString()));
            if (result.containsKey("success")) {
                return new RuleExecuteResult();
            }
            throw new CoreDocBusinessException((String)result.get("error"));
        }
        return new RuleExecuteResult();
    }

    public String excuteRule(BillContext billContext, Map<String, Object> paramMap, String ruleId, String domain) throws Exception {
        IRpcRule rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class);
        if (null != rpcRule) {
            RuleRegister billRuleRegister = ProductUtil.getBillRuleRegister("pc_product", "skudelete", ruleId, domain);
            HashMap param = (HashMap)SerializationUtils.clone((Serializable)((HashMap)paramMap));
            try {
                RuleExecuteResult ruleResult = rpcRule.execute(billRuleRegister, billContext, (Map)param);
                if (null != ruleResult) {
                    if (ruleResult.getMsgCode() == 1) {
                        return null;
                    }
                    return ruleResult.getMessage();
                }
            }
            catch (Exception e) {
                log.error("domain:" + domain + ", ruldId:" + ruleId + ", exception:" + e.getMessage(), (Throwable)e);
                return InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802BF", (String)"rule\u6821\u9a8c\u5f02\u5e38\uff0cdomain:") + domain + ", ruldId:" + ruleId + ", exception:" + e.getMessage();
            }
        }
        return null;
    }

    static {
        CHECK_DOMAIN.put("ustock", "u8c-config.option.app:ST");
        CHECK_DOMAIN.put("udinghuo", "u8c-config.option.app:SCMSA");
        CHECK_DOMAIN.put("yonyoufi", "app:IA");
        CHECK_DOMAIN.put("upu", "u8c-config.option.app:PU");
        CHECK_DOMAIN.put("retail", "u8c-config.option.app:RM");
        CHECK_DOMAIN.put("dst", "u8c-config.option.app:SDOC");
        CHECK_DOMAIN.put("cpu-base", "u8c-config.option.service:ycSupplierCategory");
        CHECK_DOMAIN.put("requirementsplanning", "u8c-config.option.app:MR");
        CHECK_DOMAIN.put("sact", "u8c-config.option.app:SACT");
        CHECK_DOMAIN.put("quote", "u8c-config.option.service:salesquotationlist");
        DOMAIN_RULE = new HashMap();
        DOMAIN_RULE.put("ustock", "ustockProductSKUQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("udinghuo", "productSkuReferCheckByIdRule");
        DOMAIN_RULE.put("yonyoufi", "productSkuIdReferCheckRule");
        DOMAIN_RULE.put("upu", "upuProductSKUQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("retail", "retailProductSKUQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("dst", "dstProductSkuQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("cpu-base", "cpuSKUUpdateCheckRule");
        DOMAIN_RULE.put("requirementsplanning", "productSKUQuoteCheckRule");
        DOMAIN_RULE.put("sact", "sact.ProductSKUNoOrgRefCheckRule");
        DOMAIN_RULE.put("quote", "productSkuNoOrgRefCheckRule");
    }
}

