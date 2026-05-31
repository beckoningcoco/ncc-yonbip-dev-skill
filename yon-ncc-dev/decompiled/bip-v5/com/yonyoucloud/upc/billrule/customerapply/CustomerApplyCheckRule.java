/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bpm.service.ProcessService
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.customerapply;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bpm.service.ProcessService;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.service.CustomerApplyService;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="customerApplyCheckRule")
public class CustomerApplyCheckRule
extends AbstractCommonRule {
    @Autowired
    private ProcessService processService;
    @Autowired
    CustomerApplyService customerApplyService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        if ("aa_customerapplylist".equals(billContext.getBillnum())) {
            Map data = (Map)map.get("return");
            if (billContext.isSupportBpm()) {
                BizObject bill = new BizObject();
                boolean isWfControlled = this.processService.bpmControl(billContext, bill);
                data.put("isWfControlled", isWfControlled);
            }
        }
        return null;
    }
}

