/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.core.base.ConditionOperator
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.service.UPCControlRuleService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.util.List;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productListQueryTreeFilterRule")
public class ProductListQueryTreeFilterRule
extends AbstractCommonRule {
    @Autowired
    private UPCControlRuleService upcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billDataDto || null == billContext) {
            return new RuleExecuteResult();
        }
        if ("pc.cls.ManagementClass".equals(billDataDto.getTreename()) && ProductUtil.checkUserTyoe(AppContext.getCurrentUser()) != 3) {
            List<String> orgIds;
            FilterVO treeCondition = billDataDto.getCondition();
            if (null == treeCondition) {
                treeCondition = new FilterVO();
            }
            if (null != (orgIds = this.upcControlRuleService.getOrgPermissions(billContext.getBillnum()))) {
                treeCondition.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "in", orgIds)});
            } else {
                treeCondition.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("orgGroupId.orgGroupDetailList.orgId", "eq", (Object)-1)});
            }
            billDataDto.setIsDistinct(true);
            billDataDto.setCondition(treeCondition);
        }
        return new RuleExecuteResult();
    }
}

