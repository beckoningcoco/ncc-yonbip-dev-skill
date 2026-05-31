/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.billrule.goodsAchive.ProductSKUShelveRule;
import com.yonyoucloud.upc.service.UPCProductShelfService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productSKUDisableRule")
public class ProductSKUDisableRule
extends AbstractCommonRule {
    @Autowired
    ProductSKUShelveRule productSKUShelveRule;
    @Autowired
    UPCProductShelfService upcProductShelfService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (null != bills && bills.size() > 0) {
            for (BizObject bill : bills) {
                AppContext.delThreadContext((String)"isSupportAsync");
                this.upcProductShelfService.checkEnableDisableParam(bill.getId(), bill.get("productApplyRangeId"));
                Long skuId = Long.parseLong(bill.getId().toString());
                Long productApplyRangeId = Long.parseLong(bill.get("productApplyRangeId").toString());
                List ranges = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"id, productId, isCreator, isApplied", (Object)productApplyRangeId);
                if (CollectionUtils.isEmpty((Collection)ranges)) continue;
                Map range = (Map)ranges.get(0);
                Boolean isApplied = Boolean.parseBoolean(range.get("isApplied").toString());
                Long productId = Long.parseLong(range.get("productId").toString());
                if (!isApplied.booleanValue()) {
                    this.productSKUShelveRule.initRangeData(productId.toString(), Long.parseLong(productApplyRangeId.toString()));
                }
                Boolean isCreator = Boolean.parseBoolean(range.get("isCreator").toString());
                this.upcProductShelfService.disableProductSKU(productId, productApplyRangeId, skuId, isCreator);
            }
        }
        return new RuleExecuteResult();
    }
}

