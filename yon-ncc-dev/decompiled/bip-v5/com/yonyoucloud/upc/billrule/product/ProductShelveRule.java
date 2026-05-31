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
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductShelfService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductUpdateService;
import com.yonyoucloud.upc.billrule.goodsAchive.ProductSKUShelveRule;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="productShelveRule")
public class ProductShelveRule
extends AbstractCommonRule {
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private IUPCProductUpdateService upcProductUpdateService;
    @Autowired
    private IUPCProductShelfService upcProductShelfService;
    @Autowired
    ProductSKUShelveRule productSKUShelveRule;
    public static String PRODUCT_ID_PARAM = "productid";
    public static String RANGE_ID_PARAM = "productapplyrangeid";

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        if (null != bills && bills.size() > 0) {
            AppContext.delThreadContext((String)"isSupportAsync");
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("ytenant", AppContext.getYTenantId());
            for (BizObject bill : bills) {
                Long productApplyRangeId = Long.parseLong((String)bill.get("productApplyRangeId"));
                params.put(PRODUCT_ID_PARAM, bill.get("id"));
                params.put(RANGE_ID_PARAM, bill.get("productApplyRangeId"));
                params.put("productApplyRangeId", bill.get("productApplyRangeId"));
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productApplyRangeId)});
                QuerySchema schema = QuerySchema.create().addSelect("id as id, productId as productId, isCreator as isCreator, isApplied as isApplied, productDetailId as productDetailId, productDetailId.stopstatus as stopstatus, productDetailId.iStatus as iStatus, productDetailId.iUOrderStatus as iUOrderStatus, productId.realProductAttribute as realProductAttribute, productId.realProductAttributeType as realProductAttributeType, productId.virtualProductAttribute as virtualProductAttribute, productId.productClass as productClass, productId.code as code").addCondition((ConditionExpression)queryConditionGroup);
                List rangeDetails = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
                Map rangeDetail = (Map)rangeDetails.get(0);
                Long productDetailId = Long.parseLong(rangeDetail.get("productDetailId").toString());
                Long productId = Long.parseLong(rangeDetail.get("productId").toString());
                if (!Boolean.parseBoolean(rangeDetail.get("isApplied").toString())) {
                    this.productSKUShelveRule.initRangeData(productId.toString(), productApplyRangeId);
                    List ranges = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"*", (Object)productApplyRangeId);
                    Map range = (Map)ranges.get(0);
                    productDetailId = Long.parseLong(range.get("productDetailId").toString());
                }
                params.put("productDetailId", productDetailId);
                boolean isCreator = Boolean.parseBoolean(rangeDetail.get("isCreator").toString());
                if ("shelve".equalsIgnoreCase(billContext.getAction())) {
                    List<Map<String, Object>> list;
                    this.checkShelveData(bill, rangeDetail);
                    if ("umall".equalsIgnoreCase((String)bill.get("biz"))) {
                        this.upcProductShelfService.shelfMallProduct(productApplyRangeId);
                        if (isCreator) {
                            list = this.upcProductUpdateService.SelectSKUBackStatusOfCreator(params);
                            if (list == null || list.size() <= 0) continue;
                            params.put("list", list);
                            this.upcProductUpdateService.UpdateSKUBackStatusOfCreator(params);
                            continue;
                        }
                        this.upcProductUpdateService.UpdateSKUBackStatusOfApplier(params);
                        continue;
                    }
                    if ("uorder".equalsIgnoreCase((String)bill.get("biz"))) {
                        this.upcProductShelfService.shelfUOrderProduct(productApplyRangeId);
                        if (isCreator) {
                            list = this.upcProductUpdateService.SelectSKUBackStatusOfCreator(params);
                            if (list == null || list.size() <= 0) continue;
                            params.put("list", list);
                            this.upcProductUpdateService.UpdateSKUBackStatusOfCreator(params);
                            continue;
                        }
                        this.upcProductUpdateService.UpdateSKUBackStatusOfApplier(params);
                        continue;
                    }
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHELVING_TYPE_ERROR);
                }
                if ("unshelve".equalsIgnoreCase(billContext.getAction())) {
                    if ("umall".equalsIgnoreCase((String)bill.get("biz"))) {
                        this.upcProductShelfService.unShelfMallProduct(productApplyRangeId);
                        continue;
                    }
                    if ("uorder".equalsIgnoreCase((String)bill.get("biz"))) {
                        this.upcProductShelfService.unShelfUOrderProduct(productApplyRangeId);
                        continue;
                    }
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_UNSHELVING_TYPE_ERROR);
                }
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_ACTION_TYPE_ERROR);
            }
            if (!params.containsKey("productid") || !params.containsKey("productapplyrangeid")) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHELVING_OR_UNSHELVING_ERROR_BECAUSE_ID_AND_RANGE_ID_IS_NULL);
            }
        }
        return new RuleExecuteResult();
    }

    private void checkShelveData(BizObject bill, Map map) {
        if (map.isEmpty()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_IS_DELETE, new Object[]{bill.get("id").toString()});
        }
        if (map.containsKey("stopstatus") && map.get("stopstatus").equals(true)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_IS_DISABLE, new Object[]{bill.get("id").toString()});
        }
        if (map.get("realProductAttribute").equals(1)) {
            if (map.get("realProductAttributeType").equals(2)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_NOT_ALLOW_SALE_BY_ENTITY_CARD, new Object[]{bill.get("id").toString()});
            }
            if (map.get("realProductAttributeType").equals(3)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_NOT_ALLOW_SALE_BY_ENTITY_STORE_VALUE_CARD, new Object[]{bill.get("id").toString()});
            }
        }
        if (map.get("realProductAttribute").equals(2) && map.get("virtualProductAttribute").equals(1)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_NOT_ALLOW_SALE_BY_STORE_VALUE_CARD, new Object[]{bill.get("id").toString()});
        }
        if (!map.containsKey("productClass")) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_NOT_ALLOW_SALE_BY_CATEGORY_IS_NULL, new Object[]{map.get("code").toString()});
        }
    }
}

