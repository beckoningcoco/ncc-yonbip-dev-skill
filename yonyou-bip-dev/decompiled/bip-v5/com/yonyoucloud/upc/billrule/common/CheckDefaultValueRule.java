/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.itf.IStopping
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.common;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.itf.IStopping;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="checkDefaultValueRule")
public class CheckDefaultValueRule
extends AbstractCommonRule {
    public static void updateMapDefineStatus(BizObject bill, String fullname, String roleA) throws Exception {
        if (CollectionUtils.isEmpty((Map)bill)) {
            return;
        }
        Map define = (Map)bill.get(roleA);
        if (!CollectionUtils.isEmpty((Map)define)) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(new Object[]{define.get("id")})}));
            Map sqlDefine = MetaDaoHelper.queryOne((String)fullname, (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Map)sqlDefine)) {
                define.put("_status", bill.getEntityStatus());
            }
        }
    }

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        for (BizObject bill : bills) {
            boolean hasIsEnabled;
            Object stopstatus;
            boolean hasStop = bill.containsKey((Object)"stopstatus");
            if ((hasStop || bill instanceof IStopping) && (stopstatus = bill.get("stopstatus")) == null) {
                bill.set("stopstatus", (Object)false);
            }
            if (hasIsEnabled = bill.containsKey((Object)"isEnabled")) {
                Object isEnabled = bill.get("isEnabled");
                if (isEnabled != null) continue;
                bill.set("isEnabled", (Object)true);
                continue;
            }
            bill.set("isEnabled", (Object)true);
        }
        return null;
    }
}

