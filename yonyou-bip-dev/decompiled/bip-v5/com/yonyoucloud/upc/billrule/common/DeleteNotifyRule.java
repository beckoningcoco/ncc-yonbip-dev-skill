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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="deleteNotifyRule")
public class DeleteNotifyRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(DeleteNotifyRule.class);
    @Autowired
    private EventService2 eventService2;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = this.getBills(billContext, map);
        HashMap<String, Object> businessObject = new HashMap<String, Object>();
        businessObject.put("fullname", billContext.getFullname());
        if (clss != null && clss.size() > 0) {
            log.info("==============> createOrgId" + ((BizObject)clss.get(0)).get("createOrg") + "| belongOrgId: " + ((BizObject)clss.get(0)).get("belongOrg"));
            if ("aa.merchant.Merchant".equals(billContext.getFullname())) {
                businessObject.put("createOrg", ((BizObject)clss.get(0)).get("createOrg"));
                businessObject.put("belongOrg", ((BizObject)clss.get(0)).get("belongOrg"));
            }
            if ("aa.custcategory.CustCategory".equals(billContext.getFullname())) {
                businessObject.put("custCategoryApplyRanges_orgId_name", ((BizObject)clss.get(0)).get("custCategoryApplyRanges_orgId_name"));
                businessObject.put("custCategoryApplyRanges_orgId", ((BizObject)clss.get(0)).get("custCategoryApplyRanges_orgId"));
            }
            businessObject.put("id", ((BizObject)clss.get(0)).get("id"));
            log.debug("=========> " + billContext.getBillnum() + "Id:" + ((BizObject)clss.get(0)).get("id"));
            try {
                this.eventService2.sendEvent("YXYBASEDOC", "DELETE_NOTIFY", businessObject);
            }
            catch (Exception e) {
                log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408031D", (String)"\u5220\u9664\u65f6\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25") + e.getMessage(), (Throwable)e);
            }
        }
        return new RuleExecuteResult();
    }
}

