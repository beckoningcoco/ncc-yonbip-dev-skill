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
 *  com.yonyoucloud.upc.pc.cls.PurchaseClass
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.cls.PurchaseClass;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="purchaseClassDeleteRule")
public class PurchaseClassDeleteRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = this.getBills(billContext, map);
        PurchaseClass cls = (PurchaseClass)clss.get(0);
        if ("delete".equals(billContext.getAction()) && null != cls.get("purchaseClassApplyRanges_orgId") && !cls.get("purchaseClassApplyRanges_orgId").toString().equals(cls.getOrgId())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800136, new Object[]{cls.getCode()});
        }
        return new RuleExecuteResult();
    }
}

