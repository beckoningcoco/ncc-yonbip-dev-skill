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
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.materialLifeCycle;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="lifecycleTemplateSaveCheckRule")
public class LifecycleTemplateSaveCheckRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (CollectionUtils.isEmpty((Collection)bills)) {
            return new RuleExecuteResult();
        }
        this.checkLifecycleTemplateCode((BizObject)bills.get(0));
        return new RuleExecuteResult();
    }

    private void checkLifecycleTemplateCode(BizObject bill) throws Exception {
        if (EntityStatus.Update == bill.getEntityStatus()) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("id")), QueryCondition.name((String)"code").left_like((Object)"system_")});
            QuerySchema querySchema = QuerySchema.create().addSelect("1").appendQueryCondition(new ConditionExpression[]{condition});
            Map systemFlagResult = MetaDaoHelper.queryOne((String)"pc.manage.LifeCycleTemplate", (QuerySchema)querySchema);
            if (null != systemFlagResult && !systemFlagResult.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800331, new Object[]{bill.get("name").toString()});
            }
        }
        if (null != bill.get("code") && bill.get("code").toString().toLowerCase().startsWith("system_")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800332, new Object[]{bill.get("name").toString()});
        }
    }
}

