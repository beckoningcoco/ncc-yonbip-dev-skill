/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 */
package com.yonyoucloud.upc.billrule.product.productrulebase;

import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Map;

public abstract class ProductRuleBase
extends AbstractCommonRule {
    public boolean executeBeforeCheckIsIgnore(BillContext billContext, Map<String, Object> paramMap, String ruleName) throws Exception {
        Map context = billContext.getContext();
        if (context == null || !context.containsKey("ignore_rules") || context.get("ignore_rules") == null) {
            return false;
        }
        String ignoreRules = context.get("ignore_rules").toString();
        return ignoreRules.contains(ruleName);
    }

    public void excuteRpcRule(BillContext billContext, Map<String, Object> paramMap, RuleRegister billRuleRegister) throws Exception {
        RuleExecuteResult ruleResult;
        IRpcRule rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class);
        if (null != rpcRule && null != (ruleResult = rpcRule.execute(billRuleRegister, billContext, paramMap)) && ruleResult.getMsgCode() != 1) {
            throw new CoreDocBusinessException(ruleResult.getMessage());
        }
    }

    public RuleRegister<Long> buildRuleRegister(String domain, String billNum, String action, String ruleId, Long tenantId) {
        return this.buildRuleRegister(domain, billNum, action, ruleId, tenantId, null, null);
    }

    public RuleRegister<Long> buildRuleRegister(String domain, String billNum, String action, String ruleId, Long tenantId, Float iorder, Boolean asyn) {
        RuleRegister register = new RuleRegister();
        if (iorder == null) {
            iorder = Float.valueOf("10");
        }
        if (null == asyn) {
            asyn = false;
        }
        register.setDomain(domain);
        register.setBillnum(billNum);
        register.setAction(action);
        register.setRuleId(ruleId);
        register.setIorder(iorder);
        register.setTenantId((Object)tenantId);
        register.setAsyn(asyn.booleanValue());
        return register;
    }
}

