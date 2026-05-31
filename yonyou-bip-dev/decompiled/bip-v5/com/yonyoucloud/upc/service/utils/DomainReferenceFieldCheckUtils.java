/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.utils.AsyncCheckUtil
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.yonyoucloud.upc.service.utils;

import com.google.gson.JsonObject;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.AsyncCheckUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DomainReferenceFieldCheckUtils {
    private static final Logger log = LoggerFactory.getLogger(DomainReferenceFieldCheckUtils.class);
    private static final List<String> CHECK_FIELDS_ALL = new ArrayList<String>();
    private static final HashMap<String, String> CHECK_DOMAIN;
    private static final HashMap<String, String> DOMAIN_RULE;

    public static void checkDomainReference(String param, final BillContext billContext, final Map<String, Object> paramMap, ExecutorService ymsExecutorService) throws Exception {
        ArrayList<1> arrayList = new ArrayList<1>();
        if (CHECK_FIELDS_ALL.contains(param)) {
            for (final Map.Entry<String, String> entry : CHECK_DOMAIN.entrySet()) {
                arrayList.add(new Callable(){

                    public Object call() throws Exception {
                        String domain = (String)entry.getKey();
                        String openOptionName = (String)entry.getValue();
                        String ruleId = (String)DOMAIN_RULE.get(domain);
                        return DomainReferenceFieldCheckUtils.checkReference(openOptionName, domain, ruleId, billContext, paramMap);
                    }
                });
            }
            String res = AsyncCheckUtil.check(arrayList, (ExecutorService)ymsExecutorService);
            if (StringUtils.isNotEmpty((CharSequence)res)) {
                throw new CoreDocBusinessException(res);
            }
        }
    }

    public static String checkReference(String openOptionName, String domain, String rule, BillContext billContext, Map<String, Object> paramMap) throws Exception {
        IRpcRule rpcRule;
        boolean execCheck = false;
        if (openOptionName.startsWith("u8c-config")) {
            if (ProductUtil.checkOpenOption("u8c-config", openOptionName.substring(18))) {
                execCheck = true;
            }
        } else if (ProductUtil.checkOpenOption("u8c-config", openOptionName)) {
            execCheck = true;
        }
        if (execCheck && null != (rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class))) {
            if (null != domain && "yonyoufi".equalsIgnoreCase(domain)) {
                return null;
            }
            RuleRegister billRuleRegister = ProductUtil.getBillRuleRegister("pc_product", "delete", rule, domain);
            Long time1 = System.currentTimeMillis();
            log.info(String.format("Product@RPC: start. group = %s", domain));
            RuleExecuteResult ruleResult = rpcRule.execute(billRuleRegister, billContext, paramMap);
            log.info("UPCDomainReferenceFieldCheckServiceImpl execute rule:[{}], domain:[{}], result:[{}]", new Object[]{billRuleRegister.getRuleId(), billRuleRegister.getDomain(), ruleResult});
            Long time2 = System.currentTimeMillis();
            log.info(String.format("Product@RPC: return. group = %s, time=%d", domain, time2 - time1));
            if (null != ruleResult && ruleResult.getMsgCode() != 1) {
                return ruleResult.getMessage();
            }
        }
        return null;
    }

    public static void checkDomainReference(String openOptionName, String domain, String rule, BillContext billContext, Map<String, Object> paramMap) throws Exception {
        IRpcRule rpcRule;
        boolean execCheck = false;
        if (openOptionName.startsWith("u8c-config")) {
            if (ProductUtil.checkOpenOption("u8c-config", openOptionName.substring(18))) {
                execCheck = true;
            }
        } else if (ProductUtil.checkOpenOption("u8c-config", openOptionName)) {
            execCheck = true;
        }
        if (execCheck && null != (rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class))) {
            RuleRegister billRuleRegister = ProductUtil.getBillRuleRegister("pc_product", "delete", rule, domain);
            Long time1 = System.currentTimeMillis();
            log.info(String.format("Product@RPC: start. group = %s", domain));
            RuleExecuteResult ruleResult = rpcRule.execute(billRuleRegister, billContext, paramMap);
            log.info("UPCDomainReferenceFieldCheckServiceImpl execute rule:[{}], domain:[{}], result:[{}]", new Object[]{billRuleRegister.getRuleId(), billRuleRegister.getDomain(), ruleResult});
            Long time2 = System.currentTimeMillis();
            log.info(String.format("Product@RPC: return. group = %s, time=%d", domain, time2 - time1));
            if (null != ruleResult && ruleResult.getMsgCode() != 1) {
                throw new CoreDocBusinessException(ruleResult.getMessage());
            }
        }
    }

    public static Map<String, Object> buildReferenceCheckParam(String billnum, String checkFieldName, Map<String, Object> data) {
        HashMap<String, Object> paramMap = new HashMap<String, Object>();
        if (ObjectUtils.isNotEmpty((Object)checkFieldName) && ObjectUtils.isNotEmpty(data)) {
            BillDataDto checkBillDataDto = new BillDataDto();
            if (ObjectUtils.isNotEmpty((Object)billnum)) {
                checkBillDataDto.setBillnum(billnum);
            }
            data.put("changeFileName", checkFieldName);
            checkBillDataDto.setData(data);
            JsonObject json = new JsonObject();
            json.addProperty("key", checkFieldName);
            checkBillDataDto.setItem(json.toString());
            paramMap.put("param", checkBillDataDto);
        }
        return paramMap;
    }

    static {
        CHECK_FIELDS_ALL.add("unit_Name");
        CHECK_FIELDS_ALL.add("productAssistUnitExchanges");
        CHECK_DOMAIN = new HashMap();
        CHECK_DOMAIN.put("ustock", "u8c-config.option.app:ST");
        CHECK_DOMAIN.put("marketingbill", "app:BBSMK,app:B2Bpricing,app:ChannelOperateCenter,app:creditManG,app:B2Bpromoting,service:allowlimitsalelist");
        CHECK_DOMAIN.put("yonyoufi", "app:IA");
        CHECK_DOMAIN.put("upu", "u8c-config.option.app:PU");
        CHECK_DOMAIN.put("engineeringdata", "u8c-config.option.app:ED");
        CHECK_DOMAIN.put("retail", "u8c-config.option.app:RM");
        CHECK_DOMAIN.put("uinttrade", "u8c-config.option.app:UIT");
        CHECK_DOMAIN.put("dst", "u8c-config.option.app:SDOC");
        CHECK_DOMAIN.put("cpu-base", "u8c-config.option.service:ycSupplierCategory");
        CHECK_DOMAIN.put("udinghuo", "u8c-config.option.app:SCMSA");
        CHECK_DOMAIN.put("quote", "u8c-config.option.service:salesquotationlist");
        DOMAIN_RULE = new HashMap();
        DOMAIN_RULE.put("ustock", "ustockProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("marketingbill", "productReferCheckByProductIdRule");
        DOMAIN_RULE.put("yonyoufi", "productIdReferCheckRule");
        DOMAIN_RULE.put("upu", "upuProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("engineeringdata", "deleteMaterialCheckRule");
        DOMAIN_RULE.put("retail", "retailProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("uinttrade", "uinttradeProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("dst", "dstProductQuoteNoOrgCheckRule");
        DOMAIN_RULE.put("cpu-base", "cpuProductUpdateCheckRule");
        DOMAIN_RULE.put("udinghuo", "productReferCheckByIdRule");
        DOMAIN_RULE.put("quote", "productNoOrgRefCheckRule");
    }
}

