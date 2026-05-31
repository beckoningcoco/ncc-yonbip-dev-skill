/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.productsku;

import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.iuap.upc.api.service.IProductApiService;
import com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.service.ProductSkuCharacterService;
import com.yonyoucloud.upc.service.ProductSkuDetailSaveService;
import com.yonyoucloud.upc.service.ProductSkuService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productSkuAddAfterDetailRule")
public class ProductSkuAddAfterDetailRule
extends AbstractCommonRule {
    @Autowired
    ProductSkuDetailSaveService productSkuDetailSaveService;
    @Autowired
    IProductApiService productApiService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ProductSkuCharacterService productSkuCharacterService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        Object productfreecharacteritems;
        Object productId;
        LoginUser currentUser = AppContext.getCurrentUser();
        Map product = (Map)paramMap.get("return");
        Object productId_productTemplate = product.get("productTemplate");
        if (null != productId_productTemplate) {
            Map tpl = this.productApiService.getTemplateData(Long.parseLong(productId_productTemplate.toString()));
            product.put("tplData", tpl);
        }
        if (null != (productId = product.get("id"))) {
            product.put("units", this.productSkuDetailSaveService.getUnitByProductId(productId, product));
            Map<String, Object> rangeAndDetail = this.getRangeAndDetail(Long.parseLong(productId.toString()));
            if (rangeAndDetail != null && !rangeAndDetail.isEmpty()) {
                product.putAll(rangeAndDetail);
            }
        }
        if (null != (productfreecharacteritems = product.get("productfreecharacteritems"))) {
            ArrayList<ProductFreeCharacterItem> freeCharacterItems = new ArrayList<ProductFreeCharacterItem>();
            List items = (List)productfreecharacteritems;
            if (!CollectionUtils.isEmpty((Collection)items)) {
                for (Map data : items) {
                    ProductFreeCharacterItem productFreeCharacterItem = new ProductFreeCharacterItem();
                    productFreeCharacterItem.putAll(data);
                    freeCharacterItems.add(productFreeCharacterItem);
                }
            }
            product.put("productfreecharacteritems", freeCharacterItems);
            this.productSkuCharacterService.dealFreeCharacterItems(freeCharacterItems);
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId), QueryCondition.name((String)"isSKU").eq((Object)0)});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        List defaultSkus = this.productSkuService.query("pc.product.ProductSKU", schema);
        if (!CollectionUtils.isEmpty((Collection)defaultSkus)) {
            product.put("defaultSKUId", ((ProductSKU)defaultSkus.get(0)).getId());
        }
        this.deleteSkuDetail(product);
        return null;
    }

    private void deleteSkuDetail(Map product) {
        Object skuObjs = product.get("productskus");
        if (null != skuObjs && skuObjs instanceof List) {
            List skus = (List)skuObjs;
            for (Map sku : skus) {
                sku.remove("productSkuDetailNew");
            }
        }
    }

    private Map<String, Object> getRangeAndDetail(Long productId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isCreator").eq((Object)true)});
        QuerySchema schema = QuerySchema.create().addSelect("id as productApplyRangeId, isCreator as isCreator, isApplied as isApplied, productDetailId.iStatus as productDetailIStatus, productDetailId.fMarkPrice as productDetailFMarkPrice,  productDetailId.fSalePrice as productDetailFSalePrice, productDetailId.fMarketPrice as productDetailFMarketPrice").addCondition((ConditionExpression)queryConditionGroup);
        List ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)ranges)) {
            return (Map)ranges.get(0);
        }
        return null;
    }
}

