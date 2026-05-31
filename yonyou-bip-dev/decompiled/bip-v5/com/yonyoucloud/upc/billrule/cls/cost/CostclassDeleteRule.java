/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.CostClass
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls.cost;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.cls.CostClass;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="costclassDeleteRule")
public class CostclassDeleteRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billDataDto || null == billContext) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        CostClass costClass = (CostClass)bills.get(0);
        if ("delete".equals(billContext.getAction()) && null != costClass.get("costClassApplyRanges_isCreator") && !Boolean.parseBoolean(costClass.get("costClassApplyRanges_isCreator").toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800156, new Object[]{costClass.getCode()});
        }
        return null;
    }
}

