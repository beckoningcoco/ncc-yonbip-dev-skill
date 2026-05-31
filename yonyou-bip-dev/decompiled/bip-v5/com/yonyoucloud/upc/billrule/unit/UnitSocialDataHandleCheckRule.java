/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.unit;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component
public class UnitSocialDataHandleCheckRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        BizObject bizObject = (BizObject)bills.get(0);
        if (!bizObject.getEntityStatus().equals((Object)EntityStatus.Insert) && !"social".equals(bizObject.get("data_from_type"))) {
            QuerySchema querySchema = new QuerySchema();
            querySchema.addSelect("socialMctype");
            ArrayList<String> deleteType = new ArrayList<String>();
            deleteType.add("0");
            deleteType.add("2");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"logicallyDeleteType").in(deleteType), QueryCondition.name((String)"id").eq(bizObject.get("id"))}));
            Map result = MetaDaoHelper.queryOne((String)billContext.getFullname(), (QuerySchema)querySchema);
            if (null != result && null != result.get("socialMctype") && result.get("socialMctype").equals(0)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.DATA_IS_CONTROL_CANNOT_MODIFY_OR_DELETE);
            }
            return new RuleExecuteResult();
        }
        return new RuleExecuteResult();
    }
}

