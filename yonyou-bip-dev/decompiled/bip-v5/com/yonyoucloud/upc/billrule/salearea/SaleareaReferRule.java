/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.salearea;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.FilterVO;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.SimpleFilterVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.billrule.cls.ProductClsUtils;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.Map;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="saleareaReferRule")
public class SaleareaReferRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        String billnum = billDataDto.getBillnum();
        FilterVO gridFilter = billDataDto.getTreeCondition();
        if (gridFilter == null) {
            gridFilter = new FilterVO();
        }
        BizObject bizObject = new BizObject();
        String orgId = TreeApplyRangeUtils.getInstance().getOrgByRefer(billDataDto, bizObject);
        if ("aa_salearea".equals(billnum)) {
            gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("level", "lt", (Object)8)});
            if (bizObject != null && bizObject.getId() != null) {
                gridFilter.appendCondition(ConditionOperator.and, new SimpleFilterVO[]{new SimpleFilterVO("id", "nin", ProductClsUtils.getInstance().getNodeWithChildren(Long.parseLong(bizObject.get("id").toString()), "aa.salearea.SaleArea"))});
            }
        }
        if (!MerchantUtils.getAllowSelectNonLeafNodes()) {
            if (orgId == null) {
                orgId = TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, orgId);
            }
            TreeApplyRangeUtils.getInstance().getSaleAreaFilter(orgId, gridFilter);
        } else {
            billDataDto.setMasterOrgValue(null);
        }
        billDataDto.setTreeCondition(gridFilter);
        this.putParam(paramMap, billDataDto);
        return new RuleExecuteResult();
    }
}

