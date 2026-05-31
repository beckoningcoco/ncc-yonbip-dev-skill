/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="merchantUpdateDetailFilterRule")
public class MerchantUpdateDetailFilterRule
extends AbstractCommonRule {
    @Autowired
    private PubOptionService pubOptionService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        Map merchantRange;
        Map externalData;
        BillDataDto bill = (BillDataDto)paramMap.get("param");
        if (bill.getExternalData() instanceof Map && (externalData = (Map)bill.getExternalData()) != null && !externalData.isEmpty() && externalData.get("importType") != null && externalData.get("importMode") != null && externalData.get("importType").equals(2) && externalData.get("importMode").equals(2) && (merchantRange = bill.getMapCondition()) != null && merchantRange.get("@merchantApplyRangeIds") != null) {
            String[] merchantRangeid = merchantRange.get("@merchantApplyRangeIds").toString().split(",");
            ArrayList<String> merchantRangeIdList = new ArrayList<String>();
            for (String s : merchantRangeid) {
                merchantRangeIdList.add(s);
            }
            merchantRange.put("@merchantApplyRangeId", merchantRangeIdList);
        }
        HashMap params = new HashMap();
        params.put("@merchantApplyRangeId", bill.getMapCondition().get("@merchantApplyRangeId"));
        if (!this.pubOptionService.getOrgGlobalShare("aa.merchant.Merchant").booleanValue()) {
            billContext.setMasterOrgField("merchantApplyRanges.orgId");
        }
        billContext.setContext(params);
        return new RuleExecuteResult();
    }
}

