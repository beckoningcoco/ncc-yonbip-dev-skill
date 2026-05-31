/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;

public class ManageClassDetailRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        QuerySchema schema;
        Map applyRange;
        BillDataDto billDataDto = (BillDataDto)paramMap.get("param");
        Map returnMap = (Map)paramMap.get("return");
        Map mapCondition = billDataDto.getMapCondition();
        Object applyRangesId = mapCondition.get("managementClassApplyRangesId");
        if (applyRangesId != null && (applyRange = MetaDaoHelper.queryOne((String)"pc.cls.ManagementClassApplyRange", (QuerySchema)(schema = QuerySchema.create().addSelect("*").appendQueryCondition(new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(applyRangesId)})})))) != null) {
            returnMap.put("managementClassApplyRanges!orgId", applyRange.get("orgId"));
            returnMap.put("managementClassApplyRanges!clsId", applyRange.get("clsId"));
            returnMap.put("managementClassApplyRanges!id", applyRange.get("id"));
        }
        return new RuleExecuteResult();
    }
}

