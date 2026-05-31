/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.pc.cls.ManagementClassApplyRangeGroup
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
package com.yonyoucloud.upc.billrule.cls.managementclass;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.pc.cls.ManagementClassApplyRangeGroup;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import java.util.ArrayList;
import java.util.HashSet;
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

@Component(value="managementClassCheckOrgRule")
public class ManagementClassCheckOrgRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (null == bills || bills.size() == 0) {
            return new RuleExecuteResult();
        }
        ManagementClass cls = (ManagementClass)bills.get(0);
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        ArrayList<ManagementClassApplyRangeGroup> managementClassApplyRangeGroups = new ArrayList<ManagementClassApplyRangeGroup>();
        String orgId = cls.getOrgId();
        boolean isCreatOrg = false;
        if (this.pubOptionService.getOrgGlobalShare("pc.cls.ManagementClass").booleanValue()) {
            this.addManageApplyRange(cls, managementClassApplyRangeGroups);
        } else {
            List<Map> orgMaps;
            List clsByOrg;
            Object oldOrgId;
            if (null != cls.getId() && (oldOrgId = ((Map)(clsByOrg = MetaDaoHelper.queryById((String)"pc.cls.ManagementClass", (String)"orgId", (Object)cls.getId())).get(0)).get("orgId")) != null && oldOrgId.equals(orgId)) {
                isCreatOrg = true;
                QuerySchema schema = QuerySchema.create().addSelect("orgGroupId.orgGroupDetailList.id as id,orgGroupId.orgGroupDetailList.orgId as orgId, orgGroupId.orgGroupDetailList.orgId.name as orgIdName, orgGroupId.orgGroupDetailList.orgId.code as orgIdCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq(cls.getId())}));
                List ranges = MetaDaoHelper.query((String)"pc.cls.ManagementClassApplyRangeGroup", (QuerySchema)schema);
                for (Map m : ranges) {
                    ManagementClassApplyRangeGroup managementClassApplyRangeGroup = new ManagementClassApplyRangeGroup();
                    managementClassApplyRangeGroup.setClsId((Long)cls.getId());
                    managementClassApplyRangeGroup.set("orgId", (Object)m.get("orgId").toString());
                    managementClassApplyRangeGroup.setId(m.get("id"));
                    managementClassApplyRangeGroup.put("orgIdCode", (Object)m.get("orgIdCode").toString());
                    managementClassApplyRangeGroup.put("orgIdName", (Object)m.get("orgIdName").toString());
                    managementClassApplyRangeGroup.setEntityStatus(EntityStatus.Update);
                    managementClassApplyRangeGroups.add(managementClassApplyRangeGroup);
                }
            }
            if (!isCreatOrg && orgId != null && (orgMaps = TreeApplyRangeUtils.getInstance().getOrgAndRangeOrg(this.iupcControlRuleService, singleOrg, orgId, "pc.cls.ManagementClass")) != null) {
                for (Map m : orgMaps) {
                    ManagementClassApplyRangeGroup rangeGroup = new ManagementClassApplyRangeGroup();
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
                    managementClassApplyRangeGroups.add(rangeGroup);
                }
            }
        }
        cls.remove("stopstatus");
        cls.set("managementClassApplyRanges", managementClassApplyRangeGroups);
        this.putParam(paramMap, "return", cls);
        return new RuleExecuteResult();
    }

    private void addManageApplyRange(ManagementClass cls, List<ManagementClassApplyRangeGroup> managementClassApplyRangeGroups) throws Exception {
        HashSet<String> orgs = new HashSet<String>();
        orgs.add(cls.getOrgId());
        List<Map> result = this.upcControlRuleService.getOrgDetail(orgs);
        if (result == null || result.size() != 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800135);
        }
        Map org = result.get(0);
        ManagementClassApplyRangeGroup rangeGroup = new ManagementClassApplyRangeGroup();
        rangeGroup.setId((Object)IdManager.getInstance().nextId());
        rangeGroup.setClsId((Long)cls.getId());
        rangeGroup.set("orgId", (Object)org.get("id").toString());
        rangeGroup.put("orgIdCode", (Object)org.get("code").toString());
        rangeGroup.put("orgIdName", (Object)org.get("name").toString());
        rangeGroup.put("orgType", (Object)"1");
        rangeGroup.setTenant((Long)AppContext.getCurrentUser().getTenant());
        rangeGroup.setEntityStatus(EntityStatus.Insert);
        managementClassApplyRangeGroups.add(rangeGroup);
    }
}

