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
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.PlanClass
 *  com.yonyoucloud.upc.utils.MultilangUtil
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
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.cls.PlanClass;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
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

@Component(value="planClassDataAfterSaveRule")
public class PlanClassDataAfterSaveRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = this.getBills(billContext, map);
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenantid", AppContext.getCurrentUser().getYTenantId());
        for (BizObject cls : clss) {
            params.put("id", cls.get("id"));
            SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.UpdatePlanClassFullPath", params);
            PlanClass planClass = (PlanClass)cls;
            this.checkParentStopstatus(planClass);
            if (planClass.getEntityStatus() == EntityStatus.Update) {
                TreeApplyRangeUtils.getInstance().updateChildFPathAndLevel("pc.cls.PlanClass", cls.get("id"));
                if (planClass.getStopstatus().booleanValue()) {
                    HashMap<String, Object> paramMap = new HashMap<String, Object>();
                    paramMap.put("id", planClass.getId());
                    paramMap.put("table", "product_plan_class");
                    paramMap.put("ytenantId", AppContext.getYTenantId());
                    SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateChildStopStatus", paramMap);
                }
            }
            if (planClass.getEntityStatus() != EntityStatus.Insert) continue;
            planClass.setIsEnd(Boolean.valueOf(true));
        }
        return new RuleExecuteResult();
    }

    private void checkParentStopstatus(PlanClass planClass) throws Exception {
        boolean pStopstatus;
        QuerySchema schema;
        List clss;
        if (!planClass.getStopstatus().booleanValue() && planClass.get("parent") != null && (clss = MetaDaoHelper.query((String)"pc.cls.PlanClass", (QuerySchema)(schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(planClass.get("parent"))}))))) != null && clss.size() > 0 && (pStopstatus = ((Boolean)((Map)clss.get(0)).get("stopstatus")).booleanValue())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800155, new Object[]{MultilangUtil.getAttr((String)"pc.cls.PlanClass", (String)"name", (BizObject)planClass, null)});
        }
    }

    private void checksParentRefer(PlanClass planClass) throws Exception {
        QuerySchema schema;
        List products;
        if (planClass.getParent() != null && (products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)(schema = QuerySchema.create().addSelect("id ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"planClass").eq((Object)planClass.getParent())}))))).size() > 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800150, new Object[]{""});
        }
    }
}

