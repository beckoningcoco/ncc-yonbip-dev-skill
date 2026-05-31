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
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.stereotype.Component;

@Component(value="productApplyBeforeDeleteRule")
public class ProductApplyBeforeDeleteRule
extends AbstractCommonRule {
    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bio : bills) {
            ProductApply productApply = (ProductApply)bio;
            ProductApply applyParam = new ProductApply();
            applyParam.setId(productApply.getId());
            ProductApply apply = (ProductApply)SqlHelper.selectOne((String)"com.yonyoucloud.upc.mapper.productapply.getProductApplyByConditions", (Object)applyParam);
            String status = apply.get("status").toString();
            String effectStatus = apply.get("effectStatus").toString();
            Boolean isWfControlled = apply.getIsWfControlled();
            if (!isWfControlled.booleanValue() && !"0".equals(status)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_NOT_OPEN_APPLY_BILL_CAN_NOT_DELETE);
            }
            if (!isWfControlled.booleanValue() || "0".equals(effectStatus)) continue;
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_OPEN_APPLY_BILL_CAN_NOT_DELETE_OPEN_STATUS);
        }
        return new RuleExecuteResult();
    }
}

