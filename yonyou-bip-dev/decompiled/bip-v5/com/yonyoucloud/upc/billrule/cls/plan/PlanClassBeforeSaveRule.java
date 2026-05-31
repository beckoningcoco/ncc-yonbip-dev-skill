/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.PlanClass
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls.plan;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.cls.PlanClass;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Component;

@Component(value="planClassBeforeSaveRule")
public class PlanClassBeforeSaveRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = this.getBills(billContext, map);
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("tenantid", AppContext.getCurrentUser().getTenant());
        for (BizObject cls : clss) {
            params.put("id", cls.get("id"));
            PlanClass planClass = (PlanClass)cls;
            if (planClass.getEntityStatus() == EntityStatus.Insert) {
                planClass.setIsEnd(Boolean.valueOf(true));
            }
            if (planClass.getEntityStatus() == EntityStatus.Update) {
                this.checkCostCodeModify(planClass);
                this.checkCostStopStatus(planClass);
            }
            this.checkPManReferProduct(planClass);
        }
        return new RuleExecuteResult();
    }

    private void checkPManReferProduct(PlanClass planClass) throws Exception {
        Long parent = planClass.getParent();
        if (parent != null) {
            QuerySchema schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"planClass").eq((Object)parent)}));
            Map map = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
            int count = 0;
            if (map != null && map.get("count") != null) {
                count = Integer.valueOf(map.get("count").toString());
            }
            if (count > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800151);
            }
        }
    }

    private void checkCostStopStatus(PlanClass planClass) throws Exception {
        EntityStatus entityStatus = planClass.getEntityStatus();
        if (EntityStatus.Update == entityStatus) {
            QuerySchema schema;
            List clss;
            Object id = planClass.getId();
            Boolean stopstatus = planClass.getStopstatus();
            if (stopstatus.booleanValue() && (clss = MetaDaoHelper.query((String)"pc.cls.PlanClass", (QuerySchema)(schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like(id), QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"id").not_eq(id)}))))) != null && clss.size() > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800152);
            }
        }
    }

    private void checkCostCodeModify(PlanClass cls) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"planClass").eq(cls.getId())}));
        List costClss = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (costClss.size() > 0) {
            schema = QuerySchema.create().addSelect("id ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(cls.getId()), QueryCondition.name((String)"code").eq((Object)cls.getCode())}));
            List proClss = MetaDaoHelper.query((String)"pc.cls.PlanClass", (QuerySchema)schema);
            if (proClss.size() == 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800153);
            }
            schema = QuerySchema.create().addSelect("id ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(cls.getId()), QueryCondition.name((String)"parent").eq((Object)cls.getParent())}));
            proClss = MetaDaoHelper.query((String)"pc.cls.PlanClass", (QuerySchema)schema);
            if (proClss.size() == 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800154);
            }
        }
    }
}

