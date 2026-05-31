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
 *  com.yonyoucloud.upc.pc.productapply.EffectStatus
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
import com.yonyoucloud.upc.pc.productapply.EffectStatus;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.service.ProductApplyService;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productApplyUnsubmitRule")
public class ProductApplyUnsubmitRule
extends AbstractCommonRule {
    @Autowired
    ProductApplyService productApplyService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bio : bills) {
            ProductApply applyParam = new ProductApply();
            applyParam.setId(bio.getId());
            ProductApply apply = (ProductApply)SqlHelper.selectOne((String)"com.yonyoucloud.upc.mapper.productapply.getProductApplyByConditions", (Object)applyParam);
            if (null != apply.getProductUpdateStatus() && "1".equals(apply.getProductUpdateStatus().toString())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_CAN_NOT_REVOKE_BY_APPLY_STATUS);
            }
            if (null == apply.getEffectStatus() || EffectStatus.dealing.getValue() != apply.getEffectStatus().getValue()) continue;
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_CAN_NOT_REVOKE_BY_APPLY_PROCESSING);
        }
        return new RuleExecuteResult();
    }
}

