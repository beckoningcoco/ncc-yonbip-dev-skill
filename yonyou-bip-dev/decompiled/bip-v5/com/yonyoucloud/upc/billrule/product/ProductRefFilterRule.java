/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.OptionalTypeEnum
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.product.OptionalTypeEnum;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.stereotype.Component;

@Component(value="productRefFilterRule")
public class ProductRefFilterRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billDataDto || null == billContext) {
            return new RuleExecuteResult();
        }
        if ("grid".equals(billDataDto.getDataType())) {
            FilterVO condition = billDataDto.getCondition();
            if (null == condition) {
                condition = new FilterVO();
            }
            billDataDto.setIsDistinct(true);
            condition.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("isOptionalMaterial", ConditionOperator.eq.name(), (Object)UPCConstants.TRUE_INT)});
            condition.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("optionalType", ConditionOperator.eq.name(), (Object)OptionalTypeEnum.CHARACTER_OPTION.getValue())});
            billDataDto.setCondition(condition);
        }
        return new RuleExecuteResult();
    }
}

