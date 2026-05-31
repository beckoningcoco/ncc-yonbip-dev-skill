/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.productApply;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.service.ProductApplyService;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productApplySubmitRule")
public class ProductApplySubmitRule
extends AbstractCommonRule {
    @Autowired
    ProductApplyService productApplyService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bio : bills) {
            ProductApply productApply = (ProductApply)bio;
            ProductApply applyParam = new ProductApply();
            applyParam.setId(productApply.getId());
            ProductApply apply = (ProductApply)SqlHelper.selectOne((String)"com.yonyoucloud.upc.mapper.productapply.getProductApplyByConditions", (Object)applyParam);
            if (!apply.getIsWfControlled().booleanValue()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_PROCESS_DEFINITION_NOT_EXIST);
            }
            productApply.setProductData(apply.getProductData());
            this.productApplyService.fillInfoData(productApply, 0);
            productApply.setRangeOrgId(apply.getRangeOrgId());
        }
        return new RuleExecuteResult();
    }
}

