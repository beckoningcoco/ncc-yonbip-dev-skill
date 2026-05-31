/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.PurchaseClass
 *  com.yonyoucloud.upc.pc.cls.PurchaseClassApplyRangeGroup
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.cls.PurchaseClass;
import com.yonyoucloud.upc.pc.cls.PurchaseClassApplyRangeGroup;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="purchaseClassCheckOrgRule")
public class PurchaseClassCheckOrgRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List<Map> orgMaps;
        List clsByOrg;
        Object oldOrgId;
        List bills = this.getBills(billContext, paramMap);
        if (null == bills || bills.size() == 0) {
            return new RuleExecuteResult();
        }
        PurchaseClass cls = (PurchaseClass)bills.get(0);
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        ArrayList<PurchaseClassApplyRangeGroup> purchaseClassApplyRangeGroups = new ArrayList<PurchaseClassApplyRangeGroup>();
        String orgId = cls.getOrgId();
        boolean isCreatOrg = false;
        if (null != cls.getId() && (oldOrgId = ((Map)(clsByOrg = MetaDaoHelper.queryById((String)"pc.cls.PurchaseClass", (String)"orgId", (Object)cls.getId())).get(0)).get("orgId")) != null && oldOrgId.equals(orgId)) {
            isCreatOrg = true;
            QuerySchema schema = QuerySchema.create().addSelect("orgGroupId.orgGroupDetailList.id as id,orgGroupId.orgGroupDetailList.orgId as orgId, orgGroupId.orgGroupDetailList.orgId.name as orgIdName, orgGroupId.orgGroupDetailList.orgId.code as orgIdCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq(cls.getId())}));
            List ranges = MetaDaoHelper.query((String)"pc.cls.PurchaseClassApplyRangeGroup", (QuerySchema)schema);
            for (Map m : ranges) {
                PurchaseClassApplyRangeGroup purchaseClassApplyRangeGroup = new PurchaseClassApplyRangeGroup();
                purchaseClassApplyRangeGroup.setClsId((Long)cls.getId());
                purchaseClassApplyRangeGroup.set("orgId", (Object)m.get("orgId").toString());
                purchaseClassApplyRangeGroup.setId(m.get("id"));
                purchaseClassApplyRangeGroup.put("orgIdCode", (Object)m.get("orgIdCode").toString());
                purchaseClassApplyRangeGroup.put("orgIdName", (Object)m.get("orgIdName").toString());
                purchaseClassApplyRangeGroup.setEntityStatus(EntityStatus.Update);
                purchaseClassApplyRangeGroups.add(purchaseClassApplyRangeGroup);
            }
        }
        if (!isCreatOrg && orgId != null && (orgMaps = TreeApplyRangeUtils.getInstance().getOrgAndRangeOrg(this.iupcControlRuleService, singleOrg, orgId, "pc.cls.PurchaseClass")) != null) {
            for (Map m : orgMaps) {
                PurchaseClassApplyRangeGroup rangeGroup = new PurchaseClassApplyRangeGroup();
                rangeGroup.setId((Object)IdManager.getInstance().nextId());
                rangeGroup.setClsId((Long)cls.getId());
                rangeGroup.set("orgId", (Object)m.get("id").toString());
                rangeGroup.put("orgIdCode", (Object)m.get("code").toString());
                rangeGroup.put("orgIdName", (Object)m.get("name").toString());
                if (m.get("externalorg") != null) {
                    if ((Integer)m.get("externalorg") == 0) {
                        rangeGroup.put("orgType", (Object)"1");
                    } else if ((Integer)m.get("externalorg") == 1) {
                        rangeGroup.put("orgType", (Object)"3");
                    }
                }
                rangeGroup.setTenant((Long)AppContext.getCurrentUser().getTenant());
                rangeGroup.setEntityStatus(EntityStatus.Insert);
                purchaseClassApplyRangeGroups.add(rangeGroup);
            }
        }
        cls.remove("stopstatus");
        cls.set("purchaseClassApplyRanges", purchaseClassApplyRangeGroups);
        this.putParam(paramMap, "return", cls);
        return new RuleExecuteResult();
    }
}

