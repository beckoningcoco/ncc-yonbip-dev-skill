/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.service.MerchantService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="stopNotifyRule")
public class StopNotifyRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(StopNotifyRule.class);
    @Autowired
    private EventService2 eventService2;
    @Autowired
    private MerchantService merchantService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = this.getBills(billContext, map);
        if ("aa_merchant".equals(billContext.getBillnum()) || "aa_merchantlist".equals(billContext.getBillnum()) || "voucher_agentrelationlist".equals(billContext.getBillnum()) || "voucher_aa_agentrelationlist".equals(billContext.getBillnum())) {
            HashMap<String, Object> businessObject = new HashMap<String, Object>();
            for (BizObject cls : clss) {
                ArrayList<Object> merchantApplyRangeIds = new ArrayList<Object>();
                if (cls.get("merchantApplyRangeId") instanceof Long) {
                    merchantApplyRangeIds.add(cls.get("merchantApplyRangeId"));
                } else {
                    merchantApplyRangeIds.add(Long.valueOf((String)cls.get("merchantApplyRangeId")));
                }
                businessObject.put("ids", merchantApplyRangeIds);
                if (!"stop".equals(billContext.getAction()) && !"disable".equals(billContext.getAction())) continue;
                businessObject.put("fullname", billContext.getFullname());
                try {
                    this.eventService2.sendEvent("YXYBASEDOC", "STOP_NOTIFY", businessObject);
                }
                catch (Exception e) {
                    log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408047E", (String)"\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25") + e.getMessage(), (Throwable)e);
                }
            }
        }
        if ("aa_merchant".equals(billContext.getBillnum()) || "aa_merchantlist".equals(billContext.getBillnum())) {
            this.merchantService.updateBillContext(clss, billContext);
        }
        return new RuleExecuteResult();
    }
}

