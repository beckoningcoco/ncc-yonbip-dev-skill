/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Map;
import org.springframework.stereotype.Component;

@Component(value="merchantAllocateRefFilter")
public class MerchantAllocateRefFilter
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        FilterVO merchantGridFilter = billDataDto.getCondition();
        FilterVO merchantTreeFilter = billDataDto.getTreeCondition();
        if (merchantTreeFilter == null) {
            merchantTreeFilter = new FilterVO();
        }
        if (merchantGridFilter == null) {
            merchantGridFilter = new FilterVO();
        }
        if ("bd_staff_ref".equals(refEntity.getCode()) && "professSalesmanName".equals(billDataDto.getKey())) {
            merchantGridFilter.appendCondition("biz_man_tag", "eq", (Object)true);
            merchantGridFilter.appendCondition("enable", "eq", (Object)1);
            merchantGridFilter.appendCondition("dr", "eq", (Object)0);
        }
        billDataDto.setCondition(merchantGridFilter);
        billDataDto.setTreeCondition(merchantTreeFilter);
        this.putParam(map, billDataDto);
        return new RuleExecuteResult();
    }
}

