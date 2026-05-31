/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.biz.base.BizContext
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.JsonFormatter
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.customerapply;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.service.CustomerApplyService;
import java.util.ArrayList;
import java.util.Map;
import org.imeta.biz.base.BizContext;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.JsonFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="customerApplyInitRule")
public class CustomerApplyInitRule
extends AbstractCommonRule {
    @Autowired
    private CustomerApplyService customerApplyService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        ArrayList<BizObject> bills = this.getBills(billContext, map);
        if (bills == null || bills.isEmpty()) {
            bills = new ArrayList<BizObject>();
            bills.add(new BizObject());
        }
        BizObject bill = (BizObject)bills.get(0);
        this.customerApplyService.setApplyInit(bill);
        JsonFormatter formatter = new JsonFormatter(BizContext.getMetaRepository());
        String fullName = billContext.getFullname();
        String json = formatter.toJson(bill, fullName, true).toString();
        return new RuleExecuteResult((Object)json);
    }
}

