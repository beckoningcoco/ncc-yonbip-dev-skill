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

@Component(value="productDetailExportForImportRule")
public class ProductDetailExportForImportRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        String[] composeIds;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        if (billDataDto.getId() != null && (composeIds = billDataDto.getId().split("_")).length == 2) {
            billDataDto.setId(composeIds[0]);
            HashMap<String, String> mapCondition = billDataDto.getMapCondition();
            if (mapCondition != null) {
                mapCondition.put("@productApplyRangeId", composeIds[1]);
            } else {
                mapCondition = new HashMap<String, String>();
                mapCondition.put("@productApplyRangeId", composeIds[1]);
                billDataDto.setMapCondition(mapCondition);
            }
        }
        return new RuleExecuteResult();
    }
}

