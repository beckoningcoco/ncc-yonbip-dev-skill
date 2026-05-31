/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.apache.commons.lang3.StringUtils
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

@Service(value="billruleregisterCoreService")
public class BillruleregisterCoreService {
    public List<Map<String, String>> getRules(String billnum, String action, String fieldName) throws Exception {
        if (StringUtils.isEmpty((CharSequence)billnum)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801525);
        }
        if (StringUtils.isEmpty((CharSequence)action)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801526);
        }
        HashMap<String, String> param = new HashMap<String, String>();
        param.put("ytenant_id", (String)AppContext.getYhtTenantId());
        param.put("billnum", billnum);
        param.put("action", action);
        param.put("fieldName", fieldName);
        List rules = SqlHelper.selectList((String)"com.yonyoucloud.upc.rule.dao.billruleregister.selectbillruleregisters", param);
        return rules;
    }

    public void excuteRules(BillContext billContext, Map<String, Object> paramMap, List<Map<String, String>> rules) throws Exception {
        for (Map<String, String> rule : rules) {
            String ruleResult;
            boolean isOpen = true;
            if (null != rule.get("check_domain")) {
                isOpen = ProductUtil.checkOpenOption("u8c-config", rule.get("check_domain"));
            }
            if (!isOpen || !StringUtils.isNotEmpty((CharSequence)(ruleResult = this.excuteRule(billContext, paramMap, rule.get("billnum"), rule.get("action"), rule.get("ruleId"), rule.get("domain"))))) continue;
            throw new CoreDocBusinessException(null, ruleResult);
        }
    }

    public String excuteRule(BillContext billContext, Map<String, Object> paramMap, String billnum, String action, String ruleId, String domain) throws Exception {
        RuleRegister billRuleRegister;
        RuleExecuteResult ruleResult;
        IRpcRule rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class);
        if (null != rpcRule && null != (ruleResult = rpcRule.execute(billRuleRegister = ProductUtil.getBillRuleRegister(billnum, action, ruleId, domain), billContext, paramMap))) {
            if (ruleResult.getMsgCode() == 1) {
                return null;
            }
            return ruleResult.getMessage();
        }
        return null;
    }
}

