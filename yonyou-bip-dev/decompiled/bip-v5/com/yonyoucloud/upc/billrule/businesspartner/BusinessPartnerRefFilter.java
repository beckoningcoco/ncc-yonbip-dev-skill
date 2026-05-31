/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.PartnerConstant
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.businesspartner;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.PartnerConstant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="businessPartnerRefFilter")
public class BusinessPartnerRefFilter
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        if ("org_fun_filter_list_ref".equals(refEntity.refType) && !MerchantUtils.getIsInternalCustomer()) {
            if ("base_businesspartner".equals(billContext.getBillnum()) && PartnerConstant.INTERNAL_ORG_ID_NAME.equals(billDataDto.getKey())) {
                this.setFinanceOrgCondition(billDataDto);
            } else if ("base_businesspartnerlist".equals(billContext.getBillnum())) {
                this.setFinanceOrgCondition(billDataDto);
            }
        }
        this.putParam(map, billDataDto);
        return new RuleExecuteResult();
    }

    private void setFinanceOrgCondition(BillDataDto billDataDto) {
        ArrayList<String> funcCodes = new ArrayList<String>();
        funcCodes.add("financeorg");
        HashMap<String, ArrayList<String>> externalData = new HashMap<String, ArrayList<String>>();
        externalData.put("funcCodes", funcCodes);
        billDataDto.setExternalData(externalData);
    }
}

