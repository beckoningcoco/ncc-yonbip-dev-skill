/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bpm.service.ProcessService
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.Json
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.productApply;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bpm.service.ProcessService;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.service.ProductApplyService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.Json;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productApplyCheckRule")
public class ProductApplyCheckRule
extends AbstractCommonRule {
    @Autowired
    private ProcessService processService;
    @Autowired
    ProductApplyService productApplyService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills;
        if ("pc_productapplylist".equals(billContext.getBillnum())) {
            Map data = (Map)paramMap.get("return");
            if (billContext.isSupportBpm()) {
                BizObject bill = new BizObject();
                boolean isWfControlled = this.processService.bpmControl(billContext, bill);
                data.put("isWfControlled", isWfControlled);
            }
        }
        if ("pc_productapply".equals(billContext.getBillnum()) && !CollectionUtils.isEmpty((Collection)(bills = this.getBills(billContext, paramMap)))) {
            BizObject apply = (BizObject)bills.get(0);
            this.productApplyService.setDepartment((Map)apply);
            paramMap.remove("return");
            return new RuleExecuteResult((Object)Json.encode2((BizObject)apply).toString());
        }
        return null;
    }
}

