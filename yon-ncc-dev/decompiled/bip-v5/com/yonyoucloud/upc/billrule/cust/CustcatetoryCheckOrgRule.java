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
 *  com.yonyoucloud.upc.aa.custcategory.CustCategory
 *  com.yonyoucloud.upc.aa.custcategory.CustCategoryApplyRange
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cust;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.custcategory.CustCategory;
import com.yonyoucloud.upc.aa.custcategory.CustCategoryApplyRange;
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

@Component(value="custcatetoryCheckOrgRule")
public class CustcatetoryCheckOrgRule
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
        CustCategory custCategory = (CustCategory)bills.get(0);
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        ArrayList<CustCategoryApplyRange> custCategoryApplyRanges = new ArrayList<CustCategoryApplyRange>();
        String orgId = custCategory.getOrgId();
        boolean isCreatOrg = false;
        if (this.pubOptionService.getOrgGlobalShare("aa.custcategory.CustCategory").booleanValue()) {
            this.addApplyRange(custCategory, custCategoryApplyRanges);
        } else {
            List<Map> orgMaps;
            List clsByOrg;
            Object oldOrgId;
            if (null != custCategory.getId() && (oldOrgId = ((Map)(clsByOrg = MetaDaoHelper.queryById((String)"aa.custcategory.CustCategory", (String)"orgId", (Object)custCategory.getId())).get(0)).get("orgId")) != null && oldOrgId.equals(orgId)) {
                isCreatOrg = true;
                QuerySchema schema = QuerySchema.create().addSelect("*, orgId.name orgIdName, orgId.code orgIdCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq(custCategory.getId())}));
                List ranges = MetaDaoHelper.query((String)"aa.custcategory.CustCategoryApplyRange", (QuerySchema)schema);
                for (Map m : ranges) {
                    CustCategoryApplyRange custCategoryApplyRange = new CustCategoryApplyRange();
                    custCategoryApplyRange.setClsId((Long)custCategory.getId());
                    custCategoryApplyRange.setOrgId(m.get("orgId").toString());
                    custCategoryApplyRange.setIsCreator(Boolean.valueOf(Boolean.parseBoolean(m.get("isCreator").toString())));
                    custCategoryApplyRange.setIsApplied(Boolean.valueOf(Boolean.parseBoolean(m.get("isApplied").toString())));
                    custCategoryApplyRange.setIsEnd(Boolean.valueOf(Boolean.parseBoolean(m.get("isEnd").toString())));
                    custCategoryApplyRange.setId(m.get("id"));
                    custCategoryApplyRange.setEntityStatus(EntityStatus.Update);
                    custCategoryApplyRange.put("orgIdCode", (Object)m.get("orgIdCode").toString());
                    custCategoryApplyRange.put("orgIdName", (Object)m.get("orgIdName").toString());
                    custCategoryApplyRanges.add(custCategoryApplyRange);
                }
            }
            if (!isCreatOrg && orgId != null && (orgMaps = TreeApplyRangeUtils.getInstance().getOrgAndRangeOrg(this.iupcControlRuleService, singleOrg, orgId, "aa.custcategory.CustCategory")) != null) {
                for (Map m : orgMaps) {
                    boolean isCreator = false;
                    if (orgId.equals(m.get("id").toString())) {
                        isCreator = true;
                    }
                    CustCategoryApplyRange range = TreeApplyRangeUtils.getInstance().getCustCatetoryApplyRange((Long)custCategory.getId(), m.get("id").toString(), true, isCreator);
                    range.put("orgIdCode", (Object)m.get("code").toString());
                    if (m.get("name") != null) {
                        range.put("orgIdName", (Object)m.get("name").toString());
                    }
                    custCategoryApplyRanges.add(range);
                }
            }
        }
        custCategory.remove("stopstatus");
        custCategory.setCustCategoryApplyRanges(custCategoryApplyRanges);
        this.putParam(paramMap, "return", custCategory);
        return new RuleExecuteResult();
    }

    private void addApplyRange(CustCategory custCategory, List<CustCategoryApplyRange> custCategoryApplyRanges) throws Exception {
        HashSet<String> orgs = new HashSet<String>();
        orgs.add(custCategory.getOrgId());
        List<Map> result = this.upcControlRuleService.getOrgDetail(orgs);
        if (result == null || result.size() != 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800135);
        }
        Map org = result.get(0);
        CustCategoryApplyRange range = TreeApplyRangeUtils.getInstance().getCustCatetoryApplyRange((Long)custCategory.getId(), org.get("id").toString(), true, true);
        range.put("orgIdCode", (Object)org.get("code").toString());
        range.put("orgIdName", (Object)org.get("name").toString());
        custCategoryApplyRanges.add(range);
    }
}

