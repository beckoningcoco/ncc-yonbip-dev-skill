/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.salearea.SaleArea
 *  com.yonyoucloud.upc.aa.salearea.SaleAreaApplyRange
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.salearea;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.salearea.SaleArea;
import com.yonyoucloud.upc.aa.salearea.SaleAreaApplyRange;
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

@Component(value="saleareaCheckOrgRule")
public class SaleareaCheckOrgRule
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
        SaleArea saleArea = (SaleArea)bills.get(0);
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        ArrayList<SaleAreaApplyRange> saleAreaApplyRanges = new ArrayList<SaleAreaApplyRange>();
        String orgId = saleArea.getOrgId();
        boolean isCreatOrg = false;
        if (this.pubOptionService.getOrgGlobalShare("aa.salearea.SaleArea").booleanValue()) {
            this.addApplyRange(saleArea, saleAreaApplyRanges);
        } else {
            List<Map> orgMaps;
            List clsByOrg;
            Object oldOrgId;
            if (null != saleArea.getId() && (oldOrgId = ((Map)(clsByOrg = MetaDaoHelper.queryById((String)"aa.salearea.SaleArea", (String)"orgId", (Object)saleArea.getId())).get(0)).get("orgId")) != null && oldOrgId.equals(orgId)) {
                isCreatOrg = true;
                QuerySchema schema = QuerySchema.create().addSelect("*, orgId.name orgIdName, orgId.code orgIdCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq(saleArea.getId())}));
                List ranges = MetaDaoHelper.query((String)"aa.salearea.SaleAreaApplyRange", (QuerySchema)schema);
                for (Map m : ranges) {
                    SaleAreaApplyRange saleAreaApplyRange = new SaleAreaApplyRange();
                    saleAreaApplyRange.setSaleArea((Long)saleArea.getId());
                    saleAreaApplyRange.setOrgId(m.get("orgId").toString());
                    saleAreaApplyRange.setIsCreator(Boolean.valueOf(Boolean.parseBoolean(m.get("isCreator").toString())));
                    saleAreaApplyRange.setIsApplied(Boolean.valueOf(Boolean.parseBoolean(m.get("isApplied").toString())));
                    saleAreaApplyRange.setIsEnd(Boolean.valueOf(Boolean.parseBoolean(m.get("isEnd").toString())));
                    saleAreaApplyRange.setId(m.get("id"));
                    saleAreaApplyRange.setEntityStatus(EntityStatus.Update);
                    saleAreaApplyRange.put("orgIdCode", (Object)m.get("orgIdCode").toString());
                    saleAreaApplyRange.put("orgIdName", (Object)m.get("orgIdName").toString());
                    saleAreaApplyRanges.add(saleAreaApplyRange);
                }
            }
            if (!isCreatOrg && (orgMaps = TreeApplyRangeUtils.getInstance().getOrgAndRangeOrg(this.iupcControlRuleService, singleOrg, orgId, "aa.salearea.SaleArea")) != null) {
                for (Map m : orgMaps) {
                    boolean isCreator = false;
                    if (orgId.equals(m.get("id").toString())) {
                        isCreator = true;
                    }
                    SaleAreaApplyRange range = TreeApplyRangeUtils.getInstance().getSalearesApplyRange((Long)saleArea.getId(), m.get("id").toString(), true, isCreator);
                    range.put("orgIdCode", (Object)m.get("code").toString());
                    if (m.get("name") != null) {
                        range.put("orgIdName", (Object)m.get("name").toString());
                    }
                    saleAreaApplyRanges.add(range);
                }
            }
        }
        saleArea.remove("stopstatus");
        saleArea.setSaleAreaApplyRange(saleAreaApplyRanges);
        this.putParam(paramMap, "return", saleArea);
        return new RuleExecuteResult();
    }

    private void addApplyRange(SaleArea saleArea, List<SaleAreaApplyRange> saleAreaApplyRanges) throws Exception {
        HashSet<String> orgs = new HashSet<String>();
        orgs.add(saleArea.getOrgId());
        List<Map> result = this.upcControlRuleService.getOrgDetail(orgs);
        if (result == null || result.size() != 1) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.ORG_DATA_QUERY_ERROR);
        }
        Map org = result.get(0);
        SaleAreaApplyRange range = TreeApplyRangeUtils.getInstance().getSalearesApplyRange((Long)saleArea.getId(), org.get("id").toString(), true, true);
        range.put("orgIdCode", (Object)org.get("code").toString());
        range.put("orgIdName", (Object)org.get("name").toString());
        saleAreaApplyRanges.add(range);
    }
}

