/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.businesspartner;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.stereotype.Component;

@Component(value="updatePartnerStatusRule")
public class UpdatePartnerStatusRule
extends AbstractCommonRule {
    public static final String BUSINESSPARTNER_MAPPER = "com.yonyoucloud.upc.data.businesspartner.";

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        String action = billContext.getAction();
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("id", ((BizObject)bills.get(0)).get("id"));
        if ("unstop".equals(action)) {
            params.put("status", 1);
        } else if ("stop".equals(action)) {
            params.put("status", 2);
        }
        params.put("ytenant_id", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.data.businesspartner.updateStatus", params);
        return new RuleExecuteResult();
    }
}

