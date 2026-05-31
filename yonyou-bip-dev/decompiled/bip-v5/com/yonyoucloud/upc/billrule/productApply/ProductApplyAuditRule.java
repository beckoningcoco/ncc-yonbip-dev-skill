/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.productapply.EffectStatus
 *  com.yonyoucloud.upc.pc.productapply.EffectType
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  com.yonyoucloud.upc.pc.productapply.ProductApplyType
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.productApply;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.productapply.EffectStatus;
import com.yonyoucloud.upc.pc.productapply.EffectType;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import com.yonyoucloud.upc.pc.productapply.ProductApplyType;
import com.yonyoucloud.upc.service.ProductApplyService;
import com.yonyoucloud.upc.service.ProductSkuService;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Component(value="productApplyAuditRule")
public class ProductApplyAuditRule
extends AbstractCommonRule {
    @Autowired
    ProductApplyService productApplyService;
    @Autowired
    ProductSkuService productSkuService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        for (BizObject bio : bills) {
            ProductApply productApply = (ProductApply)bio;
            if (productApply.getId() == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_ERROR_BY_BILL_ID_NULL);
            }
            ProductApply applyParam = new ProductApply();
            applyParam.setId(productApply.getId());
            applyParam.setTenant((Long)AppContext.getTenantId());
            final ProductApply apply = (ProductApply)SqlHelper.selectOne((String)"com.yonyoucloud.upc.mapper.productapply.getProductApplyByConditions", (Object)applyParam);
            productApply.setProductData(apply.getProductData());
            if (ProductApplyType.add.equals((Object)productApply.getApplyType()) || ProductApplyType.modify.equals((Object)productApply.getApplyType())) {
                if (productApply.containsKey((Object)"productData") && null != productApply.get("productData")) {
                    this.checkConcurrent(productApply.getProductData());
                } else {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_DATA_NULL, new Object[]{productApply.getApplyCode()});
                }
            }
            if (EffectType.timeing == apply.getEffectType() && !this.productApplyService.compareEffectTime(apply.getEffectTime())) continue;
            apply.setEffectStatus(EffectStatus.dealing);
            if (null != apply.getId() && null != apply.getEffectStatus()) {
                SqlHelper.update((String)"com.yonyoucloud.upc.mapper.productapply.updateEffectStatus", (Object)apply);
            }
            TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                public void afterCommit() {
                    try {
                        if (ProductApplyType.add == apply.getApplyType()) {
                            ProductApplyAuditRule.this.productApplyService.auditAddApply(apply);
                        } else if (ProductApplyType.modify == apply.getApplyType()) {
                            ProductApplyAuditRule.this.productApplyService.auditModifyApply(apply);
                        } else if (ProductApplyType.ADD_RANGE == apply.getApplyType()) {
                            ProductApplyAuditRule.this.productApplyService.auditProductApplyAddRange(apply);
                        }
                    }
                    catch (Exception e) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_SYNC_AUDIT_FAIL, new Object[]{apply.getApplyCode()});
                    }
                }
            });
        }
        return new RuleExecuteResult();
    }

    private void checkConcurrent(String productData) throws Exception {
        Map product = (Map)JSONObject.parseObject((String)productData, Map.class);
        Object detailId = product.get("detail!id");
        Object status = product.get("detail!_status");
        if (null != detailId && null != status && EntityStatus.Insert.toString().equals(status.toString())) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.get("detail!productApplyRangeId"))});
            QuerySchema schema = QuerySchema.create().addSelect("isApplied").addCondition((ConditionExpression)queryConditionGroup);
            List ranges = this.productSkuService.query("pc.product.ProductApplyRange", schema);
            if (CollectionUtils.isEmpty((Collection)ranges)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_DATA_NOT_EXIST_IN_ORG);
            }
            if (((ProductApplyRange)ranges.get(0)).getIsApplied().booleanValue()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_DATA_CHANGED);
            }
        }
    }
}

