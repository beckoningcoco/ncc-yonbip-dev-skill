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
package com.yonyoucloud.upc.billrule.ref;

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

@Component(value="attachmentGroupRefBeforeRule")
public class AttachmentGroupRefBeforeRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        String billnum;
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        RefEntity refEntity = billDataDto.getRefEntity();
        FilterVO filterVO = billDataDto.getCondition();
        if (filterVO == null) {
            filterVO = new FilterVO();
        }
        if ("pc_productimport".equals(billnum = billDataDto.getBillnum()) && "pc_attachmentgroupitemref".equals(refEntity.refType)) {
            filterVO.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("groupId.billType", "eq", (Object)"1")});
        }
        if ("aa_merchant".equals(billnum) && "pc_attachmentgroupitemref".equals(refEntity.refType)) {
            filterVO.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("groupId.billType", "eq", (Object)"2")});
        }
        if ("pc_productimport".equals(billnum) && "pc_attachmentgroupref".equals(refEntity.refType)) {
            billnum = "pc_product";
        }
        billDataDto.setCondition(filterVO);
        billDataDto.setBillnum(billnum);
        this.putParam(paramMap, billDataDto);
        return new RuleExecuteResult();
    }
}

