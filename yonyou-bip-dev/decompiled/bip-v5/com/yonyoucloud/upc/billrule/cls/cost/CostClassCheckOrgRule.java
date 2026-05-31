/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.CostClass
 *  com.yonyoucloud.upc.pc.cls.CostClassApplyRange
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls.cost;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.cls.CostClass;
import com.yonyoucloud.upc.pc.cls.CostClassApplyRange;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="costClassCheckOrgRule")
public class CostClassCheckOrgRule
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
        CostClass cls = (CostClass)bills.get(0);
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        ArrayList<CostClassApplyRange> costClassApplyRanges = new ArrayList<CostClassApplyRange>();
        String orgId = cls.getOrgId();
        boolean isCreatOrg = false;
        if (this.pubOptionService.getOrgGlobalShare("pc.cls.CostClass").booleanValue()) {
            this.addApplyRange(cls, costClassApplyRanges);
        } else {
            List<Map> orgMaps;
            List clsByOrg;
            Object oldOrgId;
            if (null != cls.getId() && (oldOrgId = ((Map)(clsByOrg = MetaDaoHelper.queryById((String)"pc.cls.CostClass", (String)"orgId", (Object)cls.getId())).get(0)).get("orgId")) != null && oldOrgId.equals(orgId)) {
                isCreatOrg = true;
                QuerySchema schema = QuerySchema.create().addSelect("*, orgId.name orgIdName, orgId.code orgIdCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq(cls.getId())}));
                List ranges = MetaDaoHelper.query((String)"pc.cls.CostClassApplyRange", (QuerySchema)schema);
                for (Map m : ranges) {
                    CostClassApplyRange costClassApplyRange = new CostClassApplyRange();
                    costClassApplyRange.setClsId((Long)cls.getId());
                    costClassApplyRange.setOrgId(m.get("orgId").toString());
                    costClassApplyRange.setIsCreator(Boolean.valueOf(Boolean.parseBoolean(m.get("isCreator").toString())));
                    costClassApplyRange.setIsApplied(Boolean.valueOf(Boolean.parseBoolean(m.get("isApplied").toString())));
                    costClassApplyRange.setIsEnd(Boolean.valueOf(Boolean.parseBoolean(m.get("isEnd").toString())));
                    costClassApplyRange.setId(m.get("id"));
                    costClassApplyRange.setEntityStatus(EntityStatus.Update);
                    costClassApplyRange.put("orgIdCode", (Object)m.get("orgIdCode").toString());
                    costClassApplyRange.put("orgIdName", (Object)m.get("orgIdName").toString());
                    costClassApplyRanges.add(costClassApplyRange);
                }
            }
            if (!isCreatOrg && (orgMaps = TreeApplyRangeUtils.getInstance().getOrgAndRangeOrg(this.iupcControlRuleService, singleOrg, orgId, "pc.cls.CostClass")) != null) {
                for (Map m : orgMaps) {
                    boolean isCreator = false;
                    if (orgId.equals(m.get("id").toString())) {
                        isCreator = true;
                    }
                    CostClassApplyRange range = TreeApplyRangeUtils.getInstance().getCostClassApplyRange((Long)cls.getId(), m.get("id").toString(), true, isCreator);
                    range.put("orgIdCode", (Object)m.get("code").toString());
                    range.put("orgIdName", (Object)m.get("name").toString());
                    costClassApplyRanges.add(range);
                }
            }
        }
        cls.remove("stopstatus");
        cls.setCostClassApplyRanges(costClassApplyRanges);
        this.putParam(paramMap, "return", cls);
        return new RuleExecuteResult();
    }

    private void addApplyRange(CostClass cls, List<CostClassApplyRange> costClassApplyRanges) throws Exception {
        HashSet<String> orgs = new HashSet<String>();
        orgs.add(cls.getOrgId());
        List<Map> result = this.upcControlRuleService.getOrgDetail(orgs);
        if (result == null || result.size() != 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800135);
        }
        Map org = result.get(0);
        CostClassApplyRange range = TreeApplyRangeUtils.getInstance().getCostClassApplyRange((Long)cls.getId(), org.get("id").toString(), true, true);
        range.put("orgIdCode", (Object)org.get("code").toString());
        range.put("orgIdName", (Object)org.get("name").toString());
        costClassApplyRanges.add(range);
    }
}

