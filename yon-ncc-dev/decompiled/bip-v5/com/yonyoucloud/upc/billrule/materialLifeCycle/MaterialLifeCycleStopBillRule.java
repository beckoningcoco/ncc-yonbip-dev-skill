/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.materialLifeCycle;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.springframework.stereotype.Component;

@Component(value="materialLifeCycleStopBillRule")
public class MaterialLifeCycleStopBillRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        Iterator var5 = bills.iterator();
        String action = billContext.getAction();
        while (var5.hasNext()) {
            BizObject bill = (BizObject)var5.next();
            if ("unstop".equals(action)) {
                bill.set("stoptime", null);
                bill.set("stopstatus", (Object)0);
                bill.setEntityStatus(EntityStatus.Update);
                continue;
            }
            if (!"stop".equals(action)) continue;
            bill.set("stoptime", (Object)new Date());
            bill.set("stopstatus", (Object)1);
            bill.setEntityStatus(EntityStatus.Update);
        }
        MetaDaoHelper.update((String)billContext.getFullname(), (List)bills);
        return new RuleExecuteResult();
    }
}

