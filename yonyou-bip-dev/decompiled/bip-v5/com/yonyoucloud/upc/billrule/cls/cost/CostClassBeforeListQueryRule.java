/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls.cost;

import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import java.util.ArrayList;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="costClassBeforeListQueryRule")
public class CostClassBeforeListQueryRule
extends AbstractCommonRule {
    @Autowired
    private PubOptionService pubOptionService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        FilterCommonVO[] vos;
        BillDataDto billDataDto;
        if ("pc_costclasslist".equals(billContext.getBillnum()) && this.pubOptionService.getOrgGlobalShare("pc.cls.CostClass").booleanValue() && (billDataDto = (BillDataDto)this.getParam(paramMap)) != null && billDataDto.getCondition() != null && (vos = billDataDto.getCondition().getCommonVOs()) != null) {
            ArrayList<FilterCommonVO> newVOs = new ArrayList<FilterCommonVO>();
            for (FilterCommonVO vo : vos) {
                if ("costClassApplyRanges_orgId".equalsIgnoreCase(vo.getItemName())) continue;
                newVOs.add(vo);
            }
            vos = new FilterCommonVO[newVOs.size()];
            for (int i = 0; i < newVOs.size(); ++i) {
                vos[i] = (FilterCommonVO)newVOs.get(i);
            }
            FilterVO condition = billDataDto.getCondition();
            condition.setCommonVOs(vos);
            billDataDto.setCondition(condition);
            this.putParam(paramMap, billDataDto);
        }
        return new RuleExecuteResult();
    }
}

