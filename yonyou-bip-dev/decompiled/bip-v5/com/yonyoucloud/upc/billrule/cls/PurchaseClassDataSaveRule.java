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
 *  com.yonyoucloud.upc.pc.cls.PurchaseClass
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.cls.PurchaseClass;
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

@Component(value="purchaseClassDataSaveRule")
public class PurchaseClassDataSaveRule
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
            if ("pc_purchaseclass".equals(billContext.getBillnum())) {
                PurchaseClass purchaseClass = (PurchaseClass)cls;
                this.checksParentRefer(purchaseClass);
                this.checkParentStopstatus(purchaseClass);
                if (purchaseClass.getEntityStatus() == EntityStatus.Update) {
                    SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.purchaseClass.UpdateChildrenPurchaseClass", params);
                }
            }
            this.checkEndChildrenLevel(params);
        }
        return new RuleExecuteResult();
    }

    private void checkEndChildrenLevel(Map<String, Object> params) throws Exception {
        List purchaseClasses = SqlHelper.selectList((String)"com.yonyoucloud.upc.bill.dao.purchaseClass.selectEndChildrenLevel", params);
        if (purchaseClasses != null && purchaseClasses.size() > 0 && ((PurchaseClass)purchaseClasses.get(0)).getLevel() > 8) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800147);
        }
    }

    private void checkParentStopstatus(PurchaseClass purchaseClass) throws Exception {
        boolean pStopstatus;
        QuerySchema schema;
        List clss;
        if (!purchaseClass.getStopstatus().booleanValue() && purchaseClass.get("parent") != null && (clss = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)(schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(purchaseClass.get("parent"))}))))) != null && clss.size() > 0 && (pStopstatus = ((Boolean)((Map)clss.get(0)).get("stopstatus")).booleanValue())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800148, new Object[]{purchaseClass.getName()});
        }
    }

    private void checksParentRefer(PurchaseClass purchaseClass) throws Exception {
        if (purchaseClass.getParent() != null) {
            QuerySchema schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"purchaseClass").eq((Object)purchaseClass.getParent())}));
            Map map = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
            int count = 0;
            if (map != null && map.get("count") != null) {
                count = Integer.valueOf(map.get("count").toString());
            }
            if (count > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800149, new Object[]{purchaseClass.getName()});
            }
        }
    }
}

