/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.PurchaseClass
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.cls.PurchaseClass;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="purchaseClassBeforeSaveRule")
public class PurchaseClassBeforeSaveRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List clss = this.getBills(billContext, map);
        for (BizObject cls : clss) {
            List<String> orgIds;
            if (!"pc_purchaseclass".equals(billContext.getBillnum())) continue;
            PurchaseClass purchaseClass = (PurchaseClass)cls;
            if (!(cls.getEntityStatus() != EntityStatus.Insert || this.iupcControlRuleService.checkSingleOrg().booleanValue() || purchaseClass.getOrgId() == null || AppContext.getCurrentUser().getUserType() == null || 0 == AppContext.getCurrentUser().getUserType().getValue() || !ObjectUtils.isEmpty(orgIds = this.iupcControlRuleService.getUserOrgAndVoucherManageOrg("pc.cls.PurchaseClass", "pc_purchaseclass")) && orgIds.contains(purchaseClass.getOrgId()))) {
                String msg = purchaseClass.getOrgId();
                if (cls.get("orgId_code") != null) {
                    msg = cls.get("orgId_code").toString();
                }
                if (cls.get("orgId_name") != null) {
                    msg = cls.get("orgId_name").toString();
                }
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MANAGE_ORG_MC_FILTER_CHECK, new Object[]{msg});
            }
            if (purchaseClass.getEntityStatus() == EntityStatus.Insert) {
                purchaseClass.setIsEnd(Boolean.valueOf(true));
            }
            this.checkPurchaseStopStatus(purchaseClass);
            this.checkParentStopstatus(purchaseClass);
            Boolean stopstatus = BooleanUtil.isFalse((Object)purchaseClass.getStopstatus());
            if (!stopstatus.booleanValue()) continue;
            purchaseClass.setStoptime(null);
        }
        return null;
    }

    private void checkPurchaseStopStatus(PurchaseClass purchaseClass) throws Exception {
        EntityStatus entityStatus = purchaseClass.getEntityStatus();
        if (EntityStatus.Update == entityStatus) {
            QuerySchema schema;
            List clss;
            Object id = purchaseClass.getId();
            Boolean stopstatus = purchaseClass.getStopstatus();
            if (stopstatus.booleanValue() && (clss = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)(schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like(id), QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"id").not_eq(id)}))))) != null && clss.size() > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800166, new Object[]{MultilangUtil.getAttr((String)"pc.cls.PurchaseClass", (String)"name", (BizObject)purchaseClass, null), purchaseClass.getCode()});
            }
        }
    }

    private void checkParentStopstatus(PurchaseClass purchaseClass) throws Exception {
        if (!purchaseClass.getStopstatus().booleanValue() && purchaseClass.getParent() != null) {
            boolean pStopstatus;
            QuerySchema schema = QuerySchema.create().addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)purchaseClass.getParent())}));
            ArrayList<QueryField> qryFields = new ArrayList<QueryField>();
            qryFields.add(new QueryField("id", "id"));
            qryFields.add(new QueryField("stopstatus", "stopstatus"));
            schema.selectFields(qryFields);
            List clss = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)schema);
            if (clss != null && clss.size() > 0 && (pStopstatus = ((Boolean)((Map)clss.get(0)).get("stopstatus")).booleanValue())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800155, new Object[]{MultilangUtil.getAttr((String)"pc.cls.PurchaseClass", (String)"name", (BizObject)purchaseClass, null)});
            }
        }
    }
}

