/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.unit.UnitGroup
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.unit;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.billrule.unit.UnitUtils;
import com.yonyoucloud.upc.pc.unit.UnitGroup;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="unitGroupSaveRule")
public class UnitGroupSaveRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        UnitGroup unitGroup = (UnitGroup)bills.get(0);
        if (unitGroup.getId() != null) {
            Map queryUnitGroup;
            boolean surcetype;
            QuerySchema schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"stopstatus").eq((Object)0), QueryCondition.name((String)"unitGroup").eq(unitGroup.getId())}));
            List units = MetaDaoHelper.query((String)"pc.unit.Unit", (QuerySchema)schema);
            if (units != null && units.get(0) != null && ((Map)units.get(0)).get("count") != null) {
                int count = Integer.valueOf(((Map)units.get(0)).get("count").toString());
                if (unitGroup.getStopstatus() != null && unitGroup.getStopstatus().booleanValue() && count > 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800002);
                }
            }
            schema = QuerySchema.create().addSelect("name,code,sourcetype");
            List unitGroups = MetaDaoHelper.query((String)"pc.unit.UnitGroup", (boolean)true, (QuerySchema)(schema = schema.appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq(unitGroup.getId())})), null);
            if (unitGroups != null && unitGroups.size() > 0 && (surcetype = ((Boolean)(queryUnitGroup = (Map)unitGroups.get(0)).get("sourcetype")).booleanValue())) {
                boolean bool;
                Map name = (Map)queryUnitGroup.get("name");
                Object newName = unitGroup.get("name");
                if (name != null && newName != null && !(bool = UnitUtils.getInstance().checkUnitName(newName, name))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800003);
                }
                String code = queryUnitGroup.get("code").toString();
                if (!code.equals(unitGroup.getCode())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800004);
                }
            }
        }
        return null;
    }
}

