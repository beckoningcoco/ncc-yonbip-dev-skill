/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.productsku;

import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import com.yonyoucloud.upc.service.ProductSkuDetailSaveService;
import com.yonyoucloud.upc.service.ProductSkuService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productSKUDelRule")
public class ProductSKUDelRule
extends AbstractCommonRule {
    @Autowired
    ProductSkuDetailSaveService productSkuDetailSaveService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        ProductSKU sku = (ProductSKU)bills.get(0);
        Map range = this.productSkuDetailSaveService.getRange(sku.get("productApplyRangeId"));
        Boolean isCreator = Boolean.parseBoolean(range.get("isCreator").toString());
        if (!isCreator.booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_NOT_ALLOW_DELETE_BY_NON_MANAGE_ORG);
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(sku.getId())});
        QuerySchema schema = QuerySchema.create().addSelect("isSKU").addCondition((ConditionExpression)queryConditionGroup);
        List skusInDb = this.productSkuService.query("pc.product.ProductSKU", schema);
        if (!CollectionUtils.isEmpty((Collection)skusInDb) && UPCConstants.ISSKU_DEFAULT.equals(((ProductSKU)skusInDb.get(0)).getIsSKU())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_NOT_ALLOW_DELETE_DEFAULT_SKU);
        }
        this.productSkuService.deleteSkuById(sku.getId(), range.get("productId"));
        this.returnSkuCode(sku);
        this.dealDefaultSku(sku.getProductId(), Long.parseLong(sku.get("productApplyRangeId").toString()));
        HashMap<String, Object> eventMap = new HashMap<String, Object>();
        eventMap.put("productId", range.get("productId").toString());
        ArrayList<String> productSKUIds = new ArrayList<String>();
        productSKUIds.add(sku.getId().toString());
        eventMap.put("productSKUIds", productSKUIds);
        this.productSkuService.sendDeleteEvent(eventMap);
        return null;
    }

    private void returnSkuCode(ProductSKU sku) {
        if (null != sku.getCode()) {
            String[] billCodes = new String[]{sku.getCode()};
            this.productSkuService.returnSkuCodes(billCodes);
        }
    }

    private void dealDefaultSku(long productId, long productApplyRangeId) throws Exception {
        if (this.productSkuService.isSkuSens(productId)) {
            return;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)});
        QuerySchema schema = QuerySchema.create().addSelect("useSku").addCondition((ConditionExpression)queryConditionGroup);
        List products = this.productSkuService.query("pc.product.Product", schema);
        if (!CollectionUtils.isEmpty((Collection)products) && 0 == ((Product)products.get(0)).getUseSku()) {
            return;
        }
        queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
        schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
        List skus = this.productSkuService.query("pc.product.ProductSKU", schema);
        if (!CollectionUtils.isEmpty((Collection)skus)) {
            return;
        }
        ProductSKU sku = new ProductSKU();
        queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)});
        schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
        List products2 = this.productSkuService.query("pc.product.Product", schema);
        Product product = (Product)products2.get(0);
        sku.setId((Object)IdManager.getInstance().nextId());
        sku.put("name", product.get("name"));
        sku.put("modelDescription", product.get("modelDescription"));
        sku.put("model", product.get("model"));
        sku.setCode(product.getCode());
        sku.setProductId((Long)product.getId());
        sku.setErpCode(product.getErpCode());
        sku.setWeight(product.getWeight());
        sku.setVolume(product.getVolume());
        sku.setIsSKU(Integer.valueOf(0));
        queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"productApplyRangeId").eq((Object)productApplyRangeId)});
        schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
        List productDetails = this.productSkuService.query("pc.product.ProductDetail", schema);
        ProductDetail productDetail = (ProductDetail)productDetails.get(0);
        this.productSkuAsyncSaveService.setSkuDetailForInsert(sku, productId, productApplyRangeId, productDetail);
        MetaDaoHelper.insert((String)"pc.product.ProductSKU", (BizObject)sku);
        Product updateProduct = new Product();
        updateProduct.setEntityStatus(EntityStatus.Update);
        updateProduct.setId(product.getId());
        updateProduct.setDefaultSKUId((Long)sku.getId());
        updateProduct.setHasSpecs(Boolean.valueOf(false));
        MetaDaoHelper.update((String)"pc.product.Product", (BizObject)updateProduct);
    }
}

