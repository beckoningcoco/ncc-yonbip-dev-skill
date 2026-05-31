/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component(value="merchantDetailFilterRule")
public class MerchantDetailFilterRule
extends AbstractCommonRule {
    @Autowired
    private IUPCMerchantQueryService upcMerchantQueryService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        Map merchantRange;
        Map externalData;
        billContext.setRowAuthControled(true);
        switch (AppContext.getCurrentUser().getUserType()) {
            case TenantAdmin: 
            case TenantEmployee: {
                break;
            }
            case JoinUser: 
            case TenantShopuser: 
            case ShopAdminUser: 
            case ShopUser: {
                billContext.setbRowAuthControl(true);
                break;
            }
        }
        BillDataDto bill = (BillDataDto)paramMap.get("param");
        if (bill.getExternalData() instanceof Map && (externalData = (Map)bill.getExternalData()) != null && !externalData.isEmpty() && (externalData.get("importType") != null && externalData.get("importMode") != null && externalData.get("importType").equals(2) && externalData.get("importMode").equals(2) || "2".equals(externalData.get("exportType"))) && (merchantRange = bill.getMapCondition()) != null && merchantRange.get("@merchantApplyRangeIds") != null) {
            String[] merchantRangeid = merchantRange.get("@merchantApplyRangeIds").toString().split(",");
            merchantRange.put("@merchantApplyRangeId", merchantRangeid[(Integer)merchantRange.get("index")]);
        }
        Long merchantApplyRangeId = null;
        if (null != bill.getMapCondition() && null != bill.getMapCondition().get("@merchantApplyRangeId") && StringUtils.hasText((String)bill.getMapCondition().get("@merchantApplyRangeId").toString())) {
            merchantApplyRangeId = Long.parseLong(bill.getMapCondition().get("@merchantApplyRangeId").toString());
        }
        String belongOrg = bill.getMapCondition() != null && bill.getMapCondition().get("belongOrg") != null ? bill.getMapCondition().get("belongOrg").toString() : null;
        Map params = this.upcMerchantQueryService.setParams(Long.valueOf(StringUtils.hasLength((String)bill.getId()) ? Long.valueOf(bill.getId()) : 0L), merchantApplyRangeId, belongOrg, null, null);
        billContext.setMasterOrgField("merchantApplyRanges.orgId");
        billContext.setContext(params);
        return new RuleExecuteResult();
    }
}

