/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component(value="productClassBeforeDeleteRule")
public class ProductClassBeforeDeleteRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(ProductClassBeforeDeleteRule.class);

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        if (null != bills && bills.size() > 0) {
            for (BizObject bill : bills) {
                ArrayList<String> excludeList = new ArrayList<String>();
                excludeList.add(0, "report.account.IAGL");
                excludeList.add(0, "report.account.IADetailLedgerSum");
                excludeList.add(0, "report.account.IADetailLedger");
                map.put("excludeList", excludeList);
                log.info("ProductClassBeforeDeleteRule_excludeList:{}", excludeList);
            }
        }
        return new RuleExecuteResult();
    }
}

