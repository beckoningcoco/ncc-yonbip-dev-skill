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
 *  com.yonyoucloud.upc.base.businesspartner.PartnerLinkPlan
 *  com.yonyoucloud.upc.base.businesspartner.PartnerSyncPlan
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.businesspartner;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.base.businesspartner.PartnerLinkPlan;
import com.yonyoucloud.upc.base.businesspartner.PartnerSyncPlan;
import com.yonyoucloud.upc.billrule.businesspartner.PartnerSyncPlanSaveBeforeRule;
import com.yonyoucloud.upc.service.BusinessPartnerService;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="partnerLinkPlanSaveBeforeRule")
public class PartnerLinkPlanSaveBeforeRule
extends AbstractCommonRule {
    @Autowired
    private BusinessPartnerService businessPartnerService;
    @Autowired
    private PartnerSyncPlanSaveBeforeRule partnerSyncPlanSaveBeforeRule;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bill : bills) {
            PartnerLinkPlan partnerLinkPlan = (PartnerLinkPlan)bill;
            this.offCheck(partnerLinkPlan);
            PartnerSyncPlan syncPlan = this.businessPartnerService.getSyncPlan();
            this.partnerSyncPlanSaveBeforeRule.checkLinkPlanAndSyncRuleLinkObject(partnerLinkPlan, syncPlan);
        }
        return new RuleExecuteResult();
    }

    private void offCheck(PartnerLinkPlan partnerLinkPlan) throws Exception {
        PartnerSyncPlan syncPlan;
        if (partnerLinkPlan.getStopstatus() != null && partnerLinkPlan.getStopstatus().booleanValue() && !(syncPlan = this.businessPartnerService.getSyncPlan()).getStopstatus().booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800050);
        }
    }
}

