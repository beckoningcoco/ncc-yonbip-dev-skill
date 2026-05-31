/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.ref.RefEntity
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.unit;

import com.yonyou.ucf.mdd.common.model.ref.RefEntity;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.stereotype.Component;

@Component(value="unitRefBeforeRule")
public class UnitRefBeforeRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        RefEntity refEntity = billDataDto.getRefEntity();
        if (null == billContext || refEntity == null || billDataDto == null) {
            return new RuleExecuteResult();
        }
        if ("pc_unitref_new".equals(refEntity.getCode()) && billDataDto.getPath() != null && billDataDto.getPath().length() > 0) {
            FilterVO condition = billDataDto.getCondition();
            if (null == condition) {
                condition = new FilterVO();
            }
            condition.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("unitGroup", "eq", (Object)billDataDto.getPath())});
            billDataDto.setCondition(condition);
            billDataDto.setPath(null);
        }
        return new RuleExecuteResult();
    }
}

