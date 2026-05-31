/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.stereotype.Component;

@Component(value="merchantStaffFilter")
public class MerchantStaffFilter
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        if (null == billContext) {
            return new RuleExecuteResult();
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        FilterVO filterVOCurrent = billDataDto.getCondition();
        if (billDataDto.getCondition() == null) {
            filterVOCurrent = new FilterVO();
        }
        filterVOCurrent.appendCondition("biz_man_tag", ConditionOperator.eq.name(), (Object)true);
        filterVOCurrent.appendCondition("enable", ConditionOperator.eq.name(), (Object)1);
        filterVOCurrent.appendCondition("dr", ConditionOperator.eq.name(), (Object)0);
        billDataDto.setCondition(filterVOCurrent);
        this.putParam(map, billDataDto);
        return new RuleExecuteResult();
    }
}

