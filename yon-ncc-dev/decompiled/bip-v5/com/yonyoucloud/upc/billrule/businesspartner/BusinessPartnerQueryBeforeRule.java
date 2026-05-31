/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.core.base.ConditionOperator
 *  org.jetbrains.annotations.Nullable
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.businesspartner;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Component;

@Component(value="businessPartnerQueryBeforeRule")
public class BusinessPartnerQueryBeforeRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        FilterVO gridFilter = billDataDto.getCondition();
        if (gridFilter == null) {
            return new RuleExecuteResult();
        }
        this.processPartnerRoleClassFilter(gridFilter);
        return new RuleExecuteResult();
    }

    @Nullable
    public void processPartnerRoleClassFilter(FilterVO gridFilter) {
        FilterCommonVO[] vos = gridFilter.getCommonVOs();
        if (vos != null) {
            for (FilterCommonVO vo : vos) {
                if (!vo.getItemName().equalsIgnoreCase("partnerRoleClasses.roleClassName")) continue;
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("partnerRoleClasses.isCheck", "eq", (Object)1)});
            }
        }
    }
}

