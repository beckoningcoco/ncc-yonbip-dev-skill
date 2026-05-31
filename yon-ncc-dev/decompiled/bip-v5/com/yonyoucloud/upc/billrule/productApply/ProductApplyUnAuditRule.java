/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.productapply.EffectStatus
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.productApply;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.productapply.EffectStatus;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import com.yonyoucloud.upc.service.ProductApplyService;
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

@Component(value="productApplyUnAuditRule")
public class ProductApplyUnAuditRule
extends AbstractCommonRule {
    @Autowired
    ProductApplyService productApplyService;
    private static final short VERIFY_FINISHED = 2;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bio : bills) {
            ProductApply applyParam = new ProductApply();
            applyParam.setId(bio.getId());
            ProductApply apply = (ProductApply)SqlHelper.selectOne((String)"com.yonyoucloud.upc.mapper.productapply.getProductApplyByConditions", (Object)applyParam);
            if (!EffectStatus.fail.equals((Object)apply.getEffectStatus())) {
                Map product = (Map)JSON.parseObject((String)apply.getProductData(), Map.class);
                if (product.get("id") != null) {
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("id,code");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.get("id").toString())}));
                    List productList = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)productList)) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_CAN_NOT_DELETE_BY_APPLY_STATUS);
                    }
                }
                ProductApply productParam = new ProductApply();
                productParam.setTenant((Long)AppContext.getCurrentUser().getTenant());
                productParam.set("productcode", apply.get("productcode"));
                productParam.setApplyType(ProductApplyType.add);
                List productApplyList = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.productapply.getProductApplyByConditions", (Object)productParam);
                if (!CollectionUtils.isEmpty((Collection)productApplyList)) {
                    for (ProductApply productApply : productApplyList) {
                        if (bio.getId().equals(productApply.getId()) || productApply.getVerifystate() == 2 && !productApply.getEffectStatus().equals((Object)EffectStatus.dealing)) continue;
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_CAN_NOT_DELETE_BY_APPLY_SAME_APPLY_CODE);
                    }
                }
            }
            applyParam.setEffectStatus(EffectStatus.pending);
            SqlHelper.update((String)"com.yonyoucloud.upc.mapper.productapply.updateEffectStatus", (Object)applyParam);
            this.productApplyService.updateProductApplyAddRangeStatusByProductApplyId((Long)apply.getId(), null);
        }
        return null;
    }
}

