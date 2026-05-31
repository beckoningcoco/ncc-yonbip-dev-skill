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
 *  com.yonyoucloud.upc.base.businesspartner.LinkObject
 *  com.yonyoucloud.upc.base.businesspartner.PartnerLinkPlan
 *  com.yonyoucloud.upc.base.businesspartner.PartnerSyncPlan
 *  com.yonyoucloud.upc.base.businesspartner.PartnerSyncRule
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.businesspartner;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.base.businesspartner.LinkObject;
import com.yonyoucloud.upc.base.businesspartner.PartnerLinkPlan;
import com.yonyoucloud.upc.base.businesspartner.PartnerSyncPlan;
import com.yonyoucloud.upc.base.businesspartner.PartnerSyncRule;
import com.yonyoucloud.upc.service.BusinessPartnerService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="partnerSyncPlanSaveBeforeRule")
public class PartnerSyncPlanSaveBeforeRule
extends AbstractCommonRule {
    @Autowired
    private BusinessPartnerService businessPartnerService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bill : bills) {
            PartnerSyncPlan partnerSyncPlan = (PartnerSyncPlan)bill;
            if (partnerSyncPlan.getStopstatus().booleanValue()) {
                new RuleExecuteResult();
            }
            PartnerLinkPlan linkPlan = this.businessPartnerService.getLinkPlan();
            this.startCheck(partnerSyncPlan, linkPlan);
            this.checkLinkPlanAndSyncRuleLinkObject(linkPlan, partnerSyncPlan);
        }
        return new RuleExecuteResult();
    }

    private void startCheck(PartnerSyncPlan partnerSyncPlan, PartnerLinkPlan linkPlan) throws Exception {
        if (partnerSyncPlan.getStopstatus() != null && !partnerSyncPlan.getStopstatus().booleanValue() && linkPlan.getStopstatus().booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800019);
        }
    }

    public void checkLinkPlanAndSyncRuleLinkObject(PartnerLinkPlan linkPlan, PartnerSyncPlan partnerSyncPlan) {
        if (partnerSyncPlan.getStopstatus().booleanValue()) {
            return;
        }
        List partnerSyncRules = partnerSyncPlan.planSyncRules();
        if (!CollectionUtils.isEmpty((Collection)partnerSyncRules) && linkPlan != null) {
            for (PartnerSyncRule partnerSyncRule : partnerSyncRules) {
                if (!(partnerSyncRule.getSourceObject() != LinkObject.MERCHANT && partnerSyncRule.getTargetObject() != LinkObject.MERCHANT || linkPlan.getLinkObject() != null && linkPlan.getLinkObject().contains(String.valueOf(LinkObject.MERCHANT.getValue())))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800020);
                }
                if (!(partnerSyncRule.getSourceObject() != LinkObject.VENDOR && partnerSyncRule.getTargetObject() != LinkObject.VENDOR || linkPlan.getLinkObject() != null && linkPlan.getLinkObject().contains(String.valueOf(LinkObject.VENDOR.getValue())))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800021);
                }
                if (partnerSyncRule.getSourceObject() != LinkObject.CAPITAL_BUSINESS_OBJECT && partnerSyncRule.getTargetObject() != LinkObject.CAPITAL_BUSINESS_OBJECT || linkPlan.getLinkObject() != null && linkPlan.getLinkObject().contains(String.valueOf(LinkObject.CAPITAL_BUSINESS_OBJECT.getValue()))) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800022);
            }
        }
    }
}

