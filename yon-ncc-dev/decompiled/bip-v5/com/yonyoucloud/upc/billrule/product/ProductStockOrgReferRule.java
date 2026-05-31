/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="productStockOrgReferRule")
public class ProductStockOrgReferRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        Map<String, Boolean> externalData = new HashMap<String, Boolean>(1);
        if (null != billDataDto.getExternalData()) {
            externalData = (Map)billDataDto.getExternalData();
        }
        externalData.put("noPermissionRequired", true);
        billDataDto.setExternalData(externalData);
        return new RuleExecuteResult();
    }
}

