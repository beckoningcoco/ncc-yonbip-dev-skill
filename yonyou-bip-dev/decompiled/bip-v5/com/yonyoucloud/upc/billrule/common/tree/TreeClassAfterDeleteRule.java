/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.tree.TreeRangeEnum
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.common.tree;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.tree.TreeRangeEnum;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="treeClassAfterDeleteRule")
public class TreeClassAfterDeleteRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        String billnum = billContext.getBillnum();
        TreeRangeEnum treeRangeEnum = TreeApplyRangeUtils.getInstance().getTreeRangeEnum(billnum);
        List bills = this.getBills(billContext, map);
        if (null != bills && bills.size() > 0) {
            for (BizObject bill : bills) {
                if (!bill.containsKey((Object)"parent") || bill.get("parent") == null) continue;
                List<String> subOrgs = this.iupcControlRuleService.getSubOrgs(bill.get(treeRangeEnum.getTreeOrgName()).toString());
                TreeApplyRangeUtils.getInstance().updateRangeIsEndByPrantClsAndOrg(bill, 1, treeRangeEnum.getRangeTreeId(), subOrgs, treeRangeEnum.getTreeFullname(), treeRangeEnum.getRangeFullname());
            }
        }
        return new RuleExecuteResult();
    }
}

