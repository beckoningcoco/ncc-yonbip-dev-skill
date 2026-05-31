/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.base.businesspartner.BusinessPartner
 *  com.yonyoucloud.upc.base.businesspartner.Status
 *  org.imeta.orm.base.EntityStatus
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.businesspartner;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.base.businesspartner.BusinessPartner;
import com.yonyoucloud.upc.base.businesspartner.Status;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.springframework.stereotype.Component;

@Component(value="businessPartnerStopAndUnstopRule")
public class BusinessPartnerStopAndUnstopRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (null != bills && bills.size() > 0) {
            for (BusinessPartner partner : bills) {
                if ("stop".equals(billContext.getAction())) {
                    partner.setStatus(Status.stopped);
                } else if ("unstop".equals(billContext.getAction())) {
                    partner.setStatus(Status.enable);
                }
                partner.setModifierId((Long)AppContext.getCurrentUser().getId());
                partner.setModifier(AppContext.getCurrentUser().getName());
                partner.setModifyTime(new Date());
                partner.setEntityStatus(EntityStatus.Update);
            }
        }
        return new RuleExecuteResult();
    }
}

