/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.api.YmsJdbcApiProvider
 *  com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.processor.MapListProcessor
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail
 *  com.yonyoucloud.upc.pc.product.ProductDepositTime
 *  com.yonyoucloud.upc.pc.product.ProductDepositTimeDetail
 *  com.yonyoucloud.upc.pc.product.ProductDepositTimeExtend
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSKUDetail
 *  com.yonyoucloud.upc.pc.product.ProductSKUExtend
 *  com.yonyoucloud.upc.pc.product.ProductSKUSpecItem
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  com.yonyoucloud.upc.pc.product.ProductSpecItem
 *  com.yonyoucloud.upc.pc.tpl.ProductTplSpec
 *  iuap.yms.thread.api.YmsExecutors
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.api.YmsJdbcApiProvider;
import com.yonyou.iuap.yms.factory.YmsJdbcApiProviderFactory;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.processor.MapListProcessor;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.billrule.product.ProductDefaultSKURule;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail;
import com.yonyoucloud.upc.pc.product.ProductDepositTime;
import com.yonyoucloud.upc.pc.product.ProductDepositTimeDetail;
import com.yonyoucloud.upc.pc.product.ProductDepositTimeExtend;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSKUDetail;
import com.yonyoucloud.upc.pc.product.ProductSKUExtend;
import com.yonyoucloud.upc.pc.product.ProductSKUSpecItem;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.pc.product.ProductSpecItem;
import com.yonyoucloud.upc.pc.tpl.ProductTplSpec;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.repairsku.RepairSkuService;
import iuap.yms.thread.api.YmsExecutors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class RestoreSkuService {
    private static final Logger log = LoggerFactory.getLogger(RestoreSkuService.class);
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;

    public void restoreSkuByProducts(String productIds) throws Exception {
        Object tenantId = AppContext.getTenantId();
        if (null == tenantId) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800770);
        }
        if (StringUtils.isNotEmpty((CharSequence)productIds)) {
            String[] ids;
            for (String id : ids = productIds.split(",")) {
                this.restoreSkuByProduct(id);
            }
        }
    }

    private void restoreSkuByProduct(String productId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)});
        String selectField = "id, productTemplate";
        QuerySchema schema = QuerySchema.create().addSelect(selectField).addCondition((ConditionExpression)queryConditionGroup);
        List products = this.productSkuService.query("pc.product.Product", schema);
        if (CollectionUtils.isEmpty((Collection)products)) {
            return;
        }
        Long productTemplate = ((Product)products.get(0)).getProductTemplate();
        List<ProductTplSpec> productTplSpecs = this.getAllSpecByTplId(productTemplate);
        if (CollectionUtils.isEmpty(productTplSpecs)) {
            return;
        }
        List<ProductSpecItem> productSpecItems = this.getProductSpecItem(productId);
        HashMap<String, ProductSpecItem> productSpecItemMap = new HashMap<String, ProductSpecItem>(productSpecItems.size());
        for (ProductSpecItem productSpecItem : productSpecItems) {
            productSpecItemMap.put(productSpecItem.getISpecId().toString() + productSpecItem.getLsSpecItems_id(), productSpecItem);
        }
        List<ProductSKU> skus = this.getAllSkuByProductId(productId);
        if (CollectionUtils.isEmpty(skus)) {
            return;
        }
        int count = 0;
        ArrayList<ProductSKU> updateSkus = new ArrayList<ProductSKU>();
        for (ProductSKU productSKU : skus) {
            List<ProductSKUSpecItem> productSKUSpecItems = this.getSkuSpecItem(productSKU.getId());
            HashMap<Long, ProductSKUSpecItem> skuSpecItemMap = new HashMap<Long, ProductSKUSpecItem>(productSKUSpecItems.size());
            for (ProductSKUSpecItem skuSpecItem : productSKUSpecItems) {
                skuSpecItemMap.put(skuSpecItem.getSpecId(), skuSpecItem);
            }
            for (int i = 0; i < productTplSpecs.size(); ++i) {
                int index = i + 1;
                ProductTplSpec tplSpec = productTplSpecs.get(i);
                Long specification = tplSpec.getSpecification();
                ProductSKUSpecItem skuSpecItem = (ProductSKUSpecItem)skuSpecItemMap.get(specification);
                ProductSpecItem productSpecItem = (ProductSpecItem)productSpecItemMap.get(skuSpecItem.getSpecId().toString() + skuSpecItem.getSpecItemId());
                productSKU.put("freeidx" + index, (Object)productSpecItem.getISpecId());
                productSKU.put("freex" + index, (Object)productSpecItem.getSpecValue());
            }
            productSKU.setEntityStatus(EntityStatus.Update);
            updateSkus.add(productSKU);
            if (++count <= 500) continue;
            MetaDaoHelper.update((String)"pc.product.ProductSKU", updateSkus);
            updateSkus.clear();
            count = 0;
        }
        if (!CollectionUtils.isEmpty(updateSkus)) {
            MetaDaoHelper.update((String)"pc.product.ProductSKU", updateSkus);
        }
    }

    private List<ProductSpecItem> getProductSpecItem(Object productid) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productid)});
        String selectField = "iSpecId, lsSpecItems_id, specValue";
        QuerySchema schema = QuerySchema.create().addSelect(selectField).addCondition((ConditionExpression)queryConditionGroup);
        List items = this.productSkuService.query("pc.product.ProductSpecItem", schema);
        return items;
    }

    private List<ProductSKUSpecItem> getSkuSpecItem(Object skuId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuId").eq(skuId)});
        String selectField = "specId, specItemId";
        QuerySchema schema = QuerySchema.create().addSelect(selectField).addCondition((ConditionExpression)queryConditionGroup);
        List items = this.productSkuService.query("pc.product.ProductSKUSpecItem", schema);
        return items;
    }

    private List<ProductSKU> getAllSkuByProductId(String id) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)id), QueryCondition.name((String)"isSKU").eq((Object)1)});
        String selectField = "id, specIds";
        QuerySchema schema = QuerySchema.create().addSelect(selectField).addCondition((ConditionExpression)queryConditionGroup);
        List productSKUS = this.productSkuService.query("pc.product.ProductSKU", schema);
        return productSKUS;
    }

    public List<ProductTplSpec> getAllSpecByTplId(long tplId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)tplId), QueryCondition.name((String)"specification.isShowSpec").eq((Object)0)});
        String selectField = "specification, order";
        QuerySchema schema = QuerySchema.create().addSelect(selectField).distinct().addCondition((ConditionExpression)queryConditionGroup).addOrderBy("order");
        List productTplSpecs = this.productSkuService.query("pc.tpl.ProductTplSpec", schema);
        return productTplSpecs;
    }

    public void saveSkuitemByProducts(String productIds) throws Exception {
        if (StringUtils.isNotEmpty((CharSequence)productIds)) {
            String[] ids;
            for (String id : ids = productIds.split(",")) {
                this.saveSkuitemByProduct(id);
            }
        }
    }

    private void saveSkuitemByProduct(String productId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isSKU").eq((Object)1)});
        QuerySchema schema = QuerySchema.create().addSelect("id, specIds").addCondition((ConditionExpression)queryConditionGroup);
        List skus = this.productSkuService.query("pc.product.ProductSKU", schema);
        if (!CollectionUtils.isEmpty((Collection)skus)) {
            for (ProductSKU sku : skus) {
                String specIds;
                queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"skuId").eq(sku.getId())});
                schema = QuerySchema.create().addSelect("id, specItemId").addCondition((ConditionExpression)queryConditionGroup);
                List productSKUSpecItemsInDb = this.productSkuService.query("pc.product.ProductSKUSpecItem", schema);
                HashMap<String, ProductSKUSpecItem> skuSpecItemsInDb = null;
                if (!CollectionUtils.isEmpty((Collection)productSKUSpecItemsInDb)) {
                    skuSpecItemsInDb = new HashMap<String, ProductSKUSpecItem>(productSKUSpecItemsInDb.size());
                    for (ProductSKUSpecItem skuSpecItem : productSKUSpecItemsInDb) {
                        skuSpecItemsInDb.put(skuSpecItem.getSpecItemId().toString(), skuSpecItem);
                    }
                }
                if (StringUtils.isEmpty((CharSequence)(specIds = sku.getSpecIds()))) continue;
                Object[] splitids = specIds.split(";");
                queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"lsSpecItems_id").in(splitids)});
                schema = QuerySchema.create().addSelect("id, productId, iSpecId, lsSpecItems_id").addCondition((ConditionExpression)queryConditionGroup);
                List productSpecItems = this.productSkuService.query("pc.product.ProductSpecItem", schema);
                if (CollectionUtils.isEmpty((Collection)productSpecItems)) continue;
                HashMap<String, ProductSpecItem> specItemMap = new HashMap<String, ProductSpecItem>(productSpecItems.size());
                for (ProductSpecItem item : productSpecItems) {
                    specItemMap.put(item.getLsSpecItems_id().toString(), item);
                }
                ArrayList<ProductSKUSpecItem> productSKUSpecItemsInsert = new ArrayList<ProductSKUSpecItem>();
                for (Object splitid : splitids) {
                    if (skuSpecItemsInDb != null && !skuSpecItemsInDb.isEmpty() && null != skuSpecItemsInDb.get(splitid)) continue;
                    ProductSpecItem productSpecItem = (ProductSpecItem)specItemMap.get(splitid);
                    ProductSKUSpecItem productSKUSpecItem = new ProductSKUSpecItem();
                    productSKUSpecItem.setProductId(Long.valueOf(Long.parseLong(productId)));
                    productSKUSpecItem.setSkuId(Long.valueOf(Long.parseLong(sku.getId().toString())));
                    productSKUSpecItem.setSpecId(productSpecItem.getISpecId());
                    productSKUSpecItem.setSpecItemId(productSpecItem.getLsSpecItems_id());
                    productSKUSpecItem.setTenant((Long)AppContext.getTenantId());
                    productSKUSpecItem.set("ytenant", AppContext.getYTenantId());
                    productSKUSpecItem.setEntityStatus(EntityStatus.Insert);
                    productSKUSpecItem.setId((Object)IdManager.getInstance().nextId());
                    productSKUSpecItemsInsert.add(productSKUSpecItem);
                }
                MetaDaoHelper.insert((String)"pc.product.ProductSKUSpecItem", productSKUSpecItemsInsert);
            }
        }
    }

    public void restoreProductRangeDataBySku() throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId.isApplied").eq((Object)0), QueryCondition.name((String)"productApplyRangeId.isCreator").eq((Object)0)});
        QuerySchema schema = QuerySchema.create().addSelect("id, productId, productApplyRangeId").addCondition((ConditionExpression)queryConditionGroup);
        List skuDetails = this.productSkuService.query("pc.product.ProductSkuDetailNew", schema);
        if (CollectionUtils.isEmpty((Collection)skuDetails)) {
            return;
        }
        for (ProductSkuDetailNew productSkuDetailNew : skuDetails) {
            Long productId = productSkuDetailNew.getProductId();
            Long productApplyRangeId = productSkuDetailNew.getProductApplyRangeId();
            Long productDetailId = this.getProductExtendByProductId(productId, productApplyRangeId);
            Long productDepositTimeDetailId = this.getProductDepositTimeExtend(productId, productApplyRangeId, productDetailId);
            ProductApplyRange productApplyRange = new ProductApplyRange();
            productApplyRange.setId((Object)productApplyRangeId);
            productApplyRange.setProductDetailId(productDetailId);
            productApplyRange.setIsApplied(Boolean.valueOf(true));
            productApplyRange.setProductDepositTimeDetailId(productDepositTimeDetailId);
            productApplyRange.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"pc.product.ProductApplyRange", (BizObject)productApplyRange);
            productSkuDetailNew.setProductDetailId(productDetailId);
            productSkuDetailNew.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"pc.product.ProductSkuDetailNew", (BizObject)productSkuDetailNew);
            Map<Long, ProductSKUExtend> skuExtendMap = this.getSkuExtendByProductId(productId);
            Map<Long, Long> skuRangeDetail = this.getskuDetailByProductIdAndRangeId(productId, productApplyRangeId);
            if (skuExtendMap.isEmpty()) continue;
            ArrayList<ProductSKUDetail> skuDetailsInsert = new ArrayList<ProductSKUDetail>();
            ArrayList<ProductSkuDetailNew> skuDetailNewsInsert = new ArrayList<ProductSkuDetailNew>();
            for (Map.Entry<Long, ProductSKUExtend> next : skuExtendMap.entrySet()) {
                Long skuId = next.getKey();
                if (skuRangeDetail.containsKey(skuId)) continue;
                ProductSKUExtend skuExtend = next.getValue();
                ProductSKUDetail skuDetail = new ProductSKUDetail();
                skuDetail.putAll((Map)skuExtend);
                skuDetail.setId((Object)IdManager.getInstance().nextId());
                skuDetail.setProductApplyRangeId(productApplyRangeId);
                skuDetail.setEntityStatus(EntityStatus.Insert);
                skuDetailsInsert.add(skuDetail);
                ProductSkuDetailNew skuDetailNew = new ProductSkuDetailNew();
                skuDetailNew.putAll((Map)skuExtend);
                skuDetailNew.setId((Object)IdManager.getInstance().nextId());
                skuDetailNew.setProductApplyRangeId(productApplyRangeId);
                skuDetailNew.setProductDetailId(productDetailId);
                skuDetailNew.setEntityStatus(EntityStatus.Insert);
                skuDetailNewsInsert.add(skuDetailNew);
                if (skuDetailsInsert.size() <= 500) continue;
                MetaDaoHelper.insert((String)"pc.product.ProductSKUDetail", skuDetailsInsert);
                MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", skuDetailNewsInsert);
                skuDetailsInsert.clear();
                skuDetailNewsInsert.clear();
            }
            if (CollectionUtils.isEmpty(skuDetailsInsert)) continue;
            MetaDaoHelper.insert((String)"pc.product.ProductSKUDetail", skuDetailsInsert);
            MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", skuDetailNewsInsert);
            skuDetailsInsert.clear();
            skuDetailNewsInsert.clear();
        }
    }

    private Map<Long, Long> getskuDetailByProductIdAndRangeId(Long productId, Long productApplyRangeId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"productApplyRangeId").eq((Object)productApplyRangeId)});
        QuerySchema schema = QuerySchema.create().addSelect("skuId").addCondition((ConditionExpression)queryConditionGroup);
        List existsSkuDetails = this.productSkuService.query("pc.product.ProductSKUDetail", schema);
        HashMap<Long, Long> skuDetailMap = new HashMap<Long, Long>();
        if (!CollectionUtils.isEmpty((Collection)existsSkuDetails)) {
            for (ProductSKUDetail skuDetail : existsSkuDetails) {
                skuDetailMap.put(skuDetail.getSkuId(), skuDetail.getSkuId());
            }
        }
        return skuDetailMap;
    }

    private Map<Long, ProductSKUExtend> getSkuExtendByProductId(Long productId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
        QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
        List skuExtends = this.productSkuService.query("pc.product.ProductSKUExtend", schema);
        HashMap<Long, ProductSKUExtend> skuExtendMap = new HashMap<Long, ProductSKUExtend>();
        if (!CollectionUtils.isEmpty((Collection)skuExtends)) {
            for (ProductSKUExtend skuExtend : skuExtends) {
                skuExtendMap.put(skuExtend.getSkuId(), skuExtend);
            }
        }
        return skuExtendMap;
    }

    private Long getProductDepositTimeExtend(Long productId, Long productApplyRangeId, long productDetailId) throws Exception {
        Long productDepositTimeDetailId;
        ProductDepositTimeExtend productDepositTimeExtend = null;
        ProductDepositTimeDetail productDepositTimeDetail = null;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
        QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
        List productDepositTimeExtends = this.productSkuService.query("pc.product.ProductDepositTimeExtend", schema);
        if (!CollectionUtils.isEmpty((Collection)productDepositTimeExtends)) {
            productDepositTimeExtend = (ProductDepositTimeExtend)productDepositTimeExtends.get(0);
        }
        queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"productApplyRangeId").eq((Object)productApplyRangeId)});
        schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
        List productDepositTimeDetails = this.productSkuService.query("pc.product.ProductDepositTimeDetail", schema);
        if (!CollectionUtils.isEmpty((Collection)productDepositTimeDetails)) {
            productDepositTimeDetail = (ProductDepositTimeDetail)productDepositTimeDetails.get(0);
        }
        if (null != productDepositTimeDetail) {
            productDepositTimeDetailId = (Long)productDepositTimeDetail.getId();
        } else {
            ProductDepositTimeDetail productDepositTimeDetailNew = new ProductDepositTimeDetail();
            productDepositTimeDetailNew.putAll((Map)productDepositTimeExtend);
            productDepositTimeDetailId = IdManager.getInstance().nextId();
            productDepositTimeDetailNew.setId((Object)productDepositTimeDetailId);
            productDepositTimeDetailNew.setProductId(productId);
            productDepositTimeDetailNew.setProductDetailId(Long.valueOf(productDetailId));
            productDepositTimeDetailNew.setProductApplyRangeId(productApplyRangeId);
            productDepositTimeDetailNew.setEntityStatus(EntityStatus.Insert);
            MetaDaoHelper.insert((String)"pc.product.ProductDepositTimeDetail", (BizObject)productDepositTimeDetailNew);
            ProductDepositTime productDepositTime = new ProductDepositTime();
            productDepositTime.putAll((Map)productDepositTimeExtend);
            productDepositTime.setId((Object)IdManager.getInstance().nextId());
            productDepositTime.setProductApplyRangeId(productApplyRangeId);
            productDepositTime.setEntityStatus(EntityStatus.Insert);
            MetaDaoHelper.insert((String)"pc.product.ProductDepositTime", (BizObject)productDepositTime);
        }
        return productDepositTimeDetailId;
    }

    private Long getProductExtendByProductId(Long productId, Long productApplyRangeId) throws Exception {
        Long productDetailId;
        ProductExtend productExtend = null;
        ProductDetail productDetail = null;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)});
        QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
        List productExtends = this.productSkuService.query("pc.product.ProductExtend", schema);
        if (!CollectionUtils.isEmpty((Collection)productExtends)) {
            productExtend = (ProductExtend)productExtends.get(0);
        }
        queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"productApplyRangeId").eq((Object)productApplyRangeId)});
        schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
        List productDetails = this.productSkuService.query("pc.product.ProductDetail", schema);
        if (!CollectionUtils.isEmpty((Collection)productDetails)) {
            productDetail = (ProductDetail)productDetails.get(0);
        }
        if (null != productDetail) {
            productDetailId = (Long)productDetail.getId();
        } else {
            ProductDetail productDetailNew = new ProductDetail();
            productDetailNew.putAll((Map)productExtend);
            productDetailId = IdManager.getInstance().nextId();
            productDetailNew.setId((Object)productDetailId);
            productDetailNew.setProductId(productId);
            productDetailNew.setProductApplyRangeId(productApplyRangeId);
            productDetailNew.setEntityStatus(EntityStatus.Insert);
            MetaDaoHelper.insert((String)"pc.product.ProductDetail", (BizObject)productDetailNew);
            ProductApplyRangeDetail productApplyRangeDetail = new ProductApplyRangeDetail();
            productApplyRangeDetail.putAll((Map)productExtend);
            productApplyRangeDetail.setId((Object)productApplyRangeId);
            productApplyRangeDetail.setProductId(productId);
            productApplyRangeDetail.setEntityStatus(EntityStatus.Insert);
            MetaDaoHelper.insert((String)"pc.product.ProductApplyRangeDetail", (BizObject)productApplyRangeDetail);
        }
        return productDetailId;
    }

    public void repairProductsSpecItem() {
        YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
        Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
        List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
        for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
            List<Tenant> tenants = this.getTenants();
            if (CollectionUtils.isEmpty(tenants)) continue;
            for (Tenant tenant : tenants) {
                RobotExecutors.runAs((String)tenant.getYTenantId(), () -> {
                    try {
                        this.repairProductsSpecItemTenant(ymsJdbcApi);
                    }
                    catch (Exception e) {
                        log.error(RepairSkuService.class + " repairSkuByTenant \u5904\u7406\u79df\u6237\u7ea7\u6570\u636e\u5f02\u5e38\uff1a" + tenant.getYTenantId() + " " + e.getMessage(), (Throwable)e);
                    }
                }, (ExecutorService)YmsExecutors.getYmsExecutor());
            }
        }
    }

    private void repairProductsSpecItemTenant(IYmsJdbcApi ymsJdbcApi) throws Exception {
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append(" select DISTINCT a.productId,0,specId,a.specItemId,d.name,a.tenant_id,a.ytenant_id ");
        sqlBuilder.append(" from productskuspecitem a ");
        sqlBuilder.append(" left join productspecitem b on a.productId = b.productid and a.specItemId = b.lsSpecItems_id ");
        sqlBuilder.append(" left join productsku c on a.skuId = c.id ");
        sqlBuilder.append(" left join userdefine d on a.specItemId = d.id ");
        sqlBuilder.append(" where a.ytenant_id = '" + AppContext.getYhtTenantId() + "' ");
        sqlBuilder.append(" and b.id is null ");
        sqlBuilder.append(" and c.id is not null; ");
        List skuSpecItems = ymsJdbcApi.queryForList(sqlBuilder.toString(), (ResultSetProcessor)new MapListProcessor());
        if (!CollectionUtils.isEmpty((Collection)skuSpecItems)) {
            ArrayList<ProductSpecItem> productSpecItems = new ArrayList<ProductSpecItem>(skuSpecItems.size());
            for (Map skuSpecItem : skuSpecItems) {
                if (null == skuSpecItem.get("productId") || null == skuSpecItem.get("specId") || null == skuSpecItem.get("specItemId") || null == skuSpecItem.get("name")) continue;
                ProductSpecItem productSpecItem = new ProductSpecItem();
                productSpecItem.setId((Object)IdManager.getInstance().nextId());
                productSpecItem.setProductId(Long.valueOf(Long.parseLong(skuSpecItem.get("productId").toString())));
                productSpecItem.setISpecId(Long.valueOf(Long.parseLong(skuSpecItem.get("specId").toString())));
                productSpecItem.setLsSpecItems_id(Long.valueOf(Long.parseLong(skuSpecItem.get("specItemId").toString())));
                productSpecItem.setIOrder(Integer.valueOf(0));
                productSpecItem.setSpecValue(skuSpecItem.get("name").toString());
                productSpecItem.setEntityStatus(EntityStatus.Insert);
                productSpecItems.add(productSpecItem);
            }
            if (!CollectionUtils.isEmpty(productSpecItems)) {
                MetaDaoHelper.insert((String)"pc.product.ProductSpecItem", productSpecItems);
            }
        }
    }

    private List<Tenant> getTenants() {
        String sql = "select DISTINCT tenant_id, ytenant_id from productskuspecitem ;";
        HashMap<String, String> queryTenantSQLList = new HashMap<String, String>(2);
        queryTenantSQLList.put("sql", sql);
        ArrayList<Tenant> tenantList = null;
        List tenantMapList = SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", queryTenantSQLList);
        if (!CollectionUtils.isEmpty((Collection)tenantMapList)) {
            tenantList = new ArrayList<Tenant>();
            for (Map tenantMap : tenantMapList) {
                Tenant tenant = new Tenant();
                tenant.setId(tenantMap.get("tenant_id"));
                tenant.setYTenantId(tenantMap.get("ytenant_id") == null ? "" : tenantMap.get("ytenant_id").toString());
                tenantList.add(tenant);
            }
        }
        return tenantList;
    }

    public void repairSkuRepeatCode() throws Exception {
        int pageSize = 500;
        Integer repeatCodeSkuCount = this.getRepeatCodeSkuCount();
        Integer pageNum = repeatCodeSkuCount / pageSize;
        if (repeatCodeSkuCount % pageSize > 0) {
            Integer n = pageNum;
            pageNum = pageNum + 1;
        }
        if (pageNum > 0) {
            List<Map<String, Object>> skuDatas;
            HashMap<String, AtomicInteger> maxFlowNum = new HashMap<String, AtomicInteger>();
            AtomicInteger commitSqlNum = new AtomicInteger(0);
            StringBuilder sqls = new StringBuilder();
            for (int sycleNum = 0; sycleNum != pageNum && !CollectionUtils.isEmpty(skuDatas = this.getRepeatCodeSku(pageSize)); ++sycleNum) {
                for (Map<String, Object> skuData : skuDatas) {
                    this.getRepeatSkuRepairSql(maxFlowNum, commitSqlNum, sqls, skuData);
                    if (commitSqlNum.get() <= 500) continue;
                    HashMap<String, String> params = new HashMap<String, String>(2);
                    params.put("sql", sqls.toString());
                    SqlHelper.update((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
                    commitSqlNum = new AtomicInteger(0);
                    sqls = new StringBuilder();
                }
            }
            if (commitSqlNum.get() > 0 && sqls.capacity() > 0) {
                HashMap<String, String> params = new HashMap<String, String>(2);
                params.put("sql", sqls.toString());
                SqlHelper.update((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
            }
        }
    }

    private void getRepeatSkuRepairSql(Map<String, AtomicInteger> maxFlowNum, AtomicInteger commitSqlNum, StringBuilder sqls, Map<String, Object> skuData) throws Exception {
        String skuIds;
        String[] skuIdsAttr;
        String productId = skuData.get("productId").toString();
        String productCode = skuData.get("productCode").toString();
        if (!maxFlowNum.containsKey(productId)) {
            AtomicInteger maxCode = this.productSkuAsyncSaveService.getMaxCode(productId, productCode);
            maxFlowNum.put(productId, maxCode);
        }
        if (null != (skuIdsAttr = (skuIds = skuData.get("skuIds").toString()).split(",")) && skuIdsAttr.length > 1) {
            for (int index = 1; index < skuIdsAttr.length; ++index) {
                String skuCodeByFlowing = this.productSkuService.getSkuCodeByFlowing(productCode, maxFlowNum.get(productId));
                sqls.append("update productsku set code = '").append(skuCodeByFlowing).append("' where id = ").append(skuIdsAttr[index]).append(";");
                commitSqlNum.addAndGet(1);
            }
        }
    }

    private Integer getRepeatCodeSkuCount() {
        List<Map<String, Object>> repeatCodeSku = this.getRepeatCodeSku(null);
        if (!CollectionUtils.isEmpty(repeatCodeSku)) {
            return repeatCodeSku.size();
        }
        return 0;
    }

    private List<Map<String, Object>> getRepeatCodeSku(Integer pageSize) {
        String sql = "select b.code as productCode, a.productId as productId, a.code, count(a.code) c , GROUP_CONCAT(a.id) skuIds  from productsku a inner join product b on a.productid = b.id and a.ytenant_id = b.ytenant_id where a.ytenant_id = '" + AppContext.getCurrentUser().getYTenantId() + "' group by a.productid, code HAVING c > 1 ";
        if (null != pageSize) {
            sql = sql + " limit " + pageSize;
        }
        HashMap<String, String> params = new HashMap<String, String>(2);
        params.put("sql", sql);
        return SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
    }

    public void skuDataGovernanceByTenants(List<String> ytenantIds) {
        YmsJdbcApiProvider ymsJdbcApiProvider = YmsJdbcApiProviderFactory.getYmsJdbcApiProvider();
        Supplier federalYmsJdbcApi = ymsJdbcApiProvider.getFederalYmsJdbcApi("iuap-apdoc-material_main_dataSource");
        List iYmsJdbcApis = (List)federalYmsJdbcApi.get();
        for (IYmsJdbcApi ymsJdbcApi : iYmsJdbcApis) {
            List<Map<String, Object>> tenants = this.getTenantsBySku(ymsJdbcApi, ytenantIds);
            if (CollectionUtils.isEmpty(tenants)) continue;
            for (Map<String, Object> tenant : tenants) {
                RobotExecutors.runAs((String)tenant.get("ytenantId").toString(), () -> {
                    try {
                        this.skuDataGovernance(ymsJdbcApi);
                    }
                    catch (Exception e) {
                        log.error(RepairSkuService.class + " skuDataGovernance \u5904\u7406\u79df\u6237\u7ea7\u6570\u636e\u5f02\u5e38\uff1a" + tenant.get("ytenantId") + " " + e.getMessage(), (Throwable)e);
                    }
                }, (ExecutorService)YmsExecutors.getYmsExecutor());
            }
        }
    }

    public void skuDataGovernance(IYmsJdbcApi ymsJdbcApi) throws Exception {
        this.dealDelData(ymsJdbcApi);
        this.dealMissingData(ymsJdbcApi);
    }

    private void dealMissingData(IYmsJdbcApi ymsJdbcApi) throws Exception {
        this.dealSkuExtendMissing(ymsJdbcApi);
        this.dealSkuDetailMissing(ymsJdbcApi);
        this.dealSkuDetailNewMissing(ymsJdbcApi);
    }

    public int dealSkuDetailNewMissing(IYmsJdbcApi ymsJdbcApi) throws Exception {
        int result = 0;
        String sql = " select a.id as skuId, b.productDetailId as productDetailId , b.iscreator as isCreator from productsku a  left join productapplyrange b on a.productid  = b.productid  and a.ytenant_id = b.ytenant_id  left join productskudetailnew c on a.id = c.skuid and b.id = c.productApplyRangeId  and b.ytenant_id = c.ytenant_id  where b.isApplied = 1 and c.id is null and a.ytenant_id = '" + AppContext.getYhtTenantId() + "'  and b.ytenant_id = '" + AppContext.getYhtTenantId() + "' ;";
        List<Map<String, Object>> skus = this.excuteSql(ymsJdbcApi, sql);
        if (!CollectionUtils.isEmpty(skus)) {
            HashMap<Long, Long> skuAndDetailIdMap = new HashMap<Long, Long>();
            ArrayList<Long> productDetailIds = new ArrayList<Long>();
            for (Map<String, Object> sku : skus) {
                productDetailIds.add(Long.parseLong(sku.get("productDetailId").toString()));
                skuAndDetailIdMap.put(Long.parseLong(sku.get("skuId").toString()), Long.parseLong(sku.get("productDetailId").toString()));
            }
            ArrayList<ProductSkuDetailNew> skuDetailNews = new ArrayList<ProductSkuDetailNew>();
            Map<Long, ProductDetail> idDetailMap = this.getProductDetailByIds(productDetailIds);
            for (Map.Entry next : skuAndDetailIdMap.entrySet()) {
                Long skuId = (Long)next.getKey();
                Long productDetailId = (Long)next.getValue();
                ProductDetail productDetail = idDetailMap.get(productDetailId);
                if (ObjectUtils.isNotEmpty((Object)productDetail)) {
                    ProductSkuDetailNew skuDetailNew = new ProductSkuDetailNew();
                    this.copyMapping((Map)skuDetailNew, productDetail);
                    skuDetailNew.setId((Object)IdManager.getInstance().nextId());
                    skuDetailNew.setEntityStatus(EntityStatus.Insert);
                    skuDetailNew.setSkuId(skuId);
                    skuDetailNew.setProductId(productDetail.getProductId());
                    skuDetailNew.setProductApplyRangeId(productDetail.getProductApplyRangeId());
                    skuDetailNew.setProductDetailId(productDetailId);
                    skuDetailNews.add(skuDetailNew);
                }
                if (skuDetailNews.size() <= UPCConstants.MAX_COUNT_IMPORT) continue;
                MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", skuDetailNews);
                skuDetailNews.clear();
            }
            if (!CollectionUtils.isEmpty(skuDetailNews)) {
                MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", skuDetailNews);
            }
            result = skus.size();
        }
        return result;
    }

    public int dealSkuDetailMissing(IYmsJdbcApi ymsJdbcApi) throws Exception {
        int result = 0;
        String sql = "select a.id as skuId, b.productDetailId as productDetailId, b.id as productApplyRangeId from productsku a  left join productapplyrange b on a.productid  = b.productid and a.ytenant_id = b.ytenant_id  left join productskudetail c on a.id = c.skuid and b.id = c.productApplyRangeId  and b.ytenant_id = c.ytenant_id  where b.isCreator = 0 and b.isApplied = 1 and c.id is null and a.ytenant_id = '" + AppContext.getYhtTenantId() + "'  and b.ytenant_id = '" + AppContext.getYhtTenantId() + "'; ";
        List<Map<String, Object>> skus = this.excuteSql(ymsJdbcApi, sql);
        if (!CollectionUtils.isEmpty(skus)) {
            HashMap<Long, Long> skuAndDetailIdMap = new HashMap<Long, Long>();
            ArrayList<Long> productDetailIds = new ArrayList<Long>();
            for (Map<String, Object> sku : skus) {
                productDetailIds.add(Long.parseLong(sku.get("productDetailId").toString()));
                skuAndDetailIdMap.put(Long.parseLong(sku.get("skuId").toString()), Long.parseLong(sku.get("productDetailId").toString()));
            }
            ArrayList<ProductSKUDetail> skuDetails = new ArrayList<ProductSKUDetail>();
            Map<Long, ProductDetail> idDetailMap = this.getProductDetailByIds(productDetailIds);
            for (Map.Entry next : skuAndDetailIdMap.entrySet()) {
                Long skuId = (Long)next.getKey();
                Long productDetailId = (Long)next.getValue();
                ProductDetail productDetail = idDetailMap.get(productDetailId);
                if (ObjectUtils.isNotEmpty((Object)productDetail)) {
                    ProductSKUDetail skuDetail = new ProductSKUDetail();
                    this.copyMapping((Map)skuDetail, productDetail);
                    skuDetail.setId((Object)IdManager.getInstance().nextId());
                    skuDetail.setEntityStatus(EntityStatus.Insert);
                    skuDetail.setSkuId(skuId);
                    skuDetail.setProductId(productDetail.getProductId());
                    skuDetail.setProductApplyRangeId(productDetail.getProductApplyRangeId());
                    skuDetails.add(skuDetail);
                }
                if (skuDetails.size() <= UPCConstants.MAX_COUNT_IMPORT) continue;
                MetaDaoHelper.insert((String)"pc.product.ProductSKUDetail", skuDetails);
                skuDetails.clear();
            }
            if (!CollectionUtils.isEmpty(skuDetails)) {
                MetaDaoHelper.insert((String)"pc.product.ProductSKUDetail", skuDetails);
            }
            result = skus.size();
        }
        return result;
    }

    public int dealSkuExtendMissing(IYmsJdbcApi ymsJdbcApi) throws Exception {
        int result = 0;
        String sql = "select a.id as skuId, b.productDetailId as productDetailId, b.id as productApplyRangeId from productsku a  left join productapplyrange b on a.productid  = b.productid  and a.ytenant_id = b.ytenant_id  left join productskuextend c on a.id = c.skuid and b.id = c.productApplyRangeId  and b.ytenant_id = c.ytenant_id  where b.isCreator = 1 and c.id is null and a.ytenant_id = '" + AppContext.getYhtTenantId() + "'  and b.ytenant_id = '" + AppContext.getYhtTenantId() + "'; ";
        List<Map<String, Object>> skus = this.excuteSql(ymsJdbcApi, sql);
        if (!CollectionUtils.isEmpty(skus)) {
            HashMap<Long, Long> skuAndDetailIdMap = new HashMap<Long, Long>();
            ArrayList<Long> productDetailIds = new ArrayList<Long>();
            for (Map<String, Object> sku : skus) {
                productDetailIds.add(Long.parseLong(sku.get("productDetailId").toString()));
                skuAndDetailIdMap.put(Long.parseLong(sku.get("skuId").toString()), Long.parseLong(sku.get("productDetailId").toString()));
            }
            ArrayList<ProductSKUExtend> skuExtends = new ArrayList<ProductSKUExtend>();
            Map<Long, ProductDetail> idDetailMap = this.getProductDetailByIds(productDetailIds);
            for (Map.Entry next : skuAndDetailIdMap.entrySet()) {
                Long skuId = (Long)next.getKey();
                Long productDetailId = (Long)next.getValue();
                ProductDetail productDetail = idDetailMap.get(productDetailId);
                if (ObjectUtils.isNotEmpty((Object)productDetail)) {
                    ProductSKUExtend skuExtend = new ProductSKUExtend();
                    this.copyMapping((Map)skuExtend, productDetail);
                    skuExtend.setId((Object)IdManager.getInstance().nextId());
                    skuExtend.setEntityStatus(EntityStatus.Insert);
                    skuExtend.setSkuId(skuId);
                    skuExtend.setProductId(productDetail.getProductId());
                    skuExtend.setProductApplyRangeId(productDetail.getProductApplyRangeId());
                    skuExtends.add(skuExtend);
                }
                if (skuExtends.size() <= UPCConstants.MAX_COUNT_IMPORT) continue;
                MetaDaoHelper.insert((String)"pc.product.ProductSKUExtend", skuExtends);
                skuExtends.clear();
            }
            if (!CollectionUtils.isEmpty(skuExtends)) {
                MetaDaoHelper.insert((String)"pc.product.ProductSKUExtend", skuExtends);
            }
            result = skus.size();
        }
        return result;
    }

    private Map<Long, ProductDetail> getProductDetailByIds(List<Long> productDetailIds) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productDetailIds)});
        List<String> productDetailFields = this.getProductDetailField();
        productDetailFields.add("productApplyRangeId");
        productDetailFields.add("productId");
        productDetailFields.add("id");
        QuerySchema schema = QuerySchema.create().addSelect(StringUtils.join(productDetailFields, (String)",")).addCondition((ConditionExpression)queryConditionGroup);
        List productDetails = this.productSkuService.query("pc.product.ProductDetail", schema);
        HashMap<Long, ProductDetail> idDetailMap = new HashMap<Long, ProductDetail>();
        if (!CollectionUtils.isEmpty((Collection)productDetails)) {
            for (ProductDetail productDetail : productDetails) {
                idDetailMap.put(Long.parseLong(productDetail.getId().toString()), productDetail);
            }
        }
        return idDetailMap;
    }

    public void dealDelData(IYmsJdbcApi ymsJdbcApi) {
        String ytenantId = AppContext.getYhtTenantId().toString();
        StringBuilder delSql = new StringBuilder();
        delSql.append("update productsku a left join product b on a.productid = b.id and a.ytenant_id = b.ytenant_id ").append("set a.ytenant_id = '").append(ytenantId).append("' , iDeleted = 0 , tenant_id = -tenant_id ").append(" where a.ytenant_id = '").append(ytenantId).append("' and b.id is null");
        this.excuteSql(ymsJdbcApi, delSql.toString());
        delSql = new StringBuilder();
        delSql.append("update productskuextend a left join productsku b on a.skuid = b.id and a.ytenant_id = b.ytenant_id ").append("set a.ytenant_id = '").append(ytenantId).append("', tenant_id = -tenant_id ").append(" where a.ytenant_id = '").append(ytenantId).append("' ").append(" and b.ytenant_id = '").append(ytenantId).append("' ").append(" and b.id is null;");
        delSql.append("update productskudetail a left join productsku b on a.skuid = b.id and a.ytenant_id = b.ytenant_id ").append("set a.ytenant_id = '").append(ytenantId).append("', tenant_id = -tenant_id ").append(" where a.ytenant_id = '").append(ytenantId).append("' ").append(" and b.ytenant_id = '").append(ytenantId).append("' ").append(" and b.id is null;");
        delSql.append("update productskudetailnew a left join productsku b on a.skuid = b.id and a.ytenant_id = b.ytenant_id ").append("set a.ytenant_id = '").append(ytenantId).append("', tenant_id = -tenant_id ").append(" where a.ytenant_id = '").append(ytenantId).append("' ").append(" and b.ytenant_id = '").append(ytenantId).append("' ").append(" and b.id is null;");
        delSql.append("update productskuspecitem a left join productsku b on a.skuid = b.id and a.ytenant_id = b.ytenant_id ").append("set a.ytenant_id = '").append(ytenantId).append("', tenant_id = -tenant_id ").append(" where a.ytenant_id = '").append(ytenantId).append("' ").append(" and b.ytenant_id = '").append(ytenantId).append("' ").append(" and b.id is null;");
        this.excuteSql(ymsJdbcApi, delSql.toString());
    }

    private List<Map<String, Object>> getTenantsBySku(IYmsJdbcApi ymsJdbcApi, List<String> ytenantIds) {
        StringBuilder sql = new StringBuilder();
        sql.append("select distinct tenant_id tenantId, ytenant_id ytenantId from productsku ");
        if (!CollectionUtils.isEmpty(ytenantIds)) {
            sql.append("where ytenant_id in (");
            for (int index = 0; index < ytenantIds.size(); ++index) {
                sql.append("'" + ytenantIds.get(index) + "'");
                if (index >= ytenantIds.size() - 1) continue;
                sql.append(",");
            }
            sql.append(")");
        }
        return this.excuteSql(ymsJdbcApi, sql.toString());
    }

    private List<Map<String, Object>> excuteSql(IYmsJdbcApi ymsJdbcApi, String sql) {
        if (ymsJdbcApi != null) {
            return ymsJdbcApi.queryForList(sql, (ResultSetProcessor)new MapListProcessor());
        }
        HashMap<String, String> params = new HashMap<String, String>(2);
        params.put("sql", sql);
        return SqlHelper.selectList((String)"com.yonyou.ucf.mdd.ext.meta.dao.selectList", params);
    }

    private void copyMapping(Map skuDetail, ProductDetail productDetail) {
        for (Map.Entry<String, String> entry : ProductDefaultSKURule.COPY_FIELDS.entrySet()) {
            skuDetail.put(entry.getKey(), productDetail.get(entry.getValue()));
        }
    }

    private List<String> getProductDetailField() {
        ArrayList<String> fields = new ArrayList<String>();
        for (Map.Entry<String, String> entry : ProductDefaultSKURule.COPY_FIELDS.entrySet()) {
            fields.add(entry.getValue());
        }
        return fields;
    }
}

