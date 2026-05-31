/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
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
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productSKUEnableRule")
public class ProductSKUEnableRule
extends AbstractCommonRule {
    @Autowired
    ProductSKUShelveRule productSKUShelveRule;
    @Autowired
    UPCProductShelfService upcProductShelfService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (null != bills && bills.size() > 0) {
            AppContext.delThreadContext((String)"isSupportAsync");
            for (BizObject bill : bills) {
                this.upcProductShelfService.checkEnableDisableParam(bill.getId(), bill.get("productApplyRangeId"));
                Long skuId = Long.parseLong(bill.getId().toString());
                Long productApplyRangeId = Long.parseLong(bill.get("productApplyRangeId").toString());
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productApplyRangeId)});
                QuerySchema schema = QuerySchema.create().addSelect("id as id, productId as productId, isCreator as isCreator, isApplied as isApplied, productDetailId.stopstatus as stopstatus").addCondition((ConditionExpression)queryConditionGroup);
                List rangeDetails = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                if (CollectionUtils.isEmpty((Collection)rangeDetails)) continue;
                Map range = (Map)rangeDetails.get(0);
                boolean productStopStatus = Boolean.parseBoolean(range.get("stopstatus").toString());
                if (productStopStatus) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_IS_DISABLE);
                }
                Boolean isApplied = Boolean.parseBoolean(range.get("isApplied").toString());
                Long productId = Long.parseLong(range.get("productId").toString());
                if (!isApplied.booleanValue()) {
                    this.productSKUShelveRule.initRangeData(productId.toString(), Long.parseLong(productApplyRangeId.toString()));
                }
                Boolean isCreator = Boolean.parseBoolean(range.get("isCreator").toString());
                this.upcProductShelfService.enableProductSKU(productId, productApplyRangeId, skuId, isCreator);
            }
        }
        return new RuleExecuteResult();
    }
}

