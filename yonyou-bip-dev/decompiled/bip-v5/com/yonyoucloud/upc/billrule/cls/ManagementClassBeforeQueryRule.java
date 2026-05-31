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
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.cls;

import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterCommonVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import java.util.ArrayList;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="managementClassBeforeQueryRule")
public class ManagementClassBeforeQueryRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private PubOptionService pubOptionService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if ("pc_managementclasslist".equals(billContext.getBillnum())) {
            if (this.pubOptionService.getOrgGlobalShare("pc.cls.ManagementClass").booleanValue()) {
                FilterCommonVO[] vos;
                if (billDataDto != null && billDataDto.getCondition() != null && (vos = billDataDto.getCondition().getCommonVOs()) != null) {
                    ArrayList<FilterCommonVO> newVOs = new ArrayList<FilterCommonVO>();
                    for (FilterCommonVO vo : vos) {
                        if ("managementClassApplyRanges_orgId".equalsIgnoreCase(vo.getItemName())) continue;
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
            } else if ("pc_managementclasslist".equals(billContext.getBillnum())) {
                TreeApplyRangeUtils.getInstance().queryCheckOrgId(this.iupcControlRuleService, billDataDto, "managementClassApplyRanges_orgId");
            }
        }
        return new RuleExecuteResult();
    }
}

