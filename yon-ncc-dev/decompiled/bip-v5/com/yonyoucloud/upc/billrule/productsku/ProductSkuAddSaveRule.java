/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.util.DateKit
 *  com.yonyoucloud.upc.common.enums.DomainOpenEnum
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSKUSpecItem
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  com.yonyoucloud.upc.pc.product.ProductSkuOrderProperty
 *  com.yonyoucloud.upc.pc.product.ProductSource
 *  com.yonyoucloud.upc.pc.product.ProductSpecItem
 *  com.yonyoucloud.upc.pc.product.ProductSpecItemAlbum
 *  com.yonyoucloud.upc.pc.product.SkuFreeCharacterItem
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.UpcStringUtil
 *  org.apache.commons.lang3.StringUtils
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
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.billrule.productsku;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.util.DateKit;
import com.yonyoucloud.upc.billrule.product.ProductSKUAutoCodeRule;
import com.yonyoucloud.upc.common.enums.DomainOpenEnum;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSKUSpecItem;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.pc.product.ProductSkuOrderProperty;
import com.yonyoucloud.upc.pc.product.ProductSource;
import com.yonyoucloud.upc.pc.product.ProductSpecItem;
import com.yonyoucloud.upc.pc.product.ProductSpecItemAlbum;
import com.yonyoucloud.upc.pc.product.SkuFreeCharacterItem;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import com.yonyoucloud.upc.service.ProductSkuCharacterService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.UseSkuService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.UpcStringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.lang3.StringUtils;
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
import org.springframework.util.ObjectUtils;

@Component(value="productSkuAddSaveRule")
public class ProductSkuAddSaveRule
extends AbstractCommonRule {
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    private IBillCodeComponentService billCodeComponentService;
    @Autowired
    ProductSKUAutoCodeRule productSKUAutoCodeRule;
    @Autowired
    UseSkuService useSkuService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    ProductSkuCharacterService productSkuCharacterService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List bills = this.getBills(billContext, paramMap);
        Product product = (Product)bills.get(0);
        this.useSkuService.checkSkuCanAddSku((Long)product.getId());
        product.setEntityStatus(EntityStatus.Unchanged);
        if (null == product.get("productApplyRangeId")) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"isCreator").eq((Object)true)});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
            List ranges = this.productSkuService.query("pc.product.ProductApplyRange", schema);
            product.put("productApplyRangeId", ((ProductApplyRange)ranges.get(0)).getId());
        }
        List<ProductDetail> productDetails = this.productSkuAsyncSaveService.getAllProductDetailByRange(product.getId(), product.get("productApplyRangeId"));
        Map<String, ProductFreeCharacterItem> allitemMap = this.dealproductfreecharacteritems(product);
        Map<String, ProductSpecItem> allSpecItemMap = this.dealSpecItems(product);
        if (!CollectionUtils.isEmpty((Collection)product.productskus())) {
            this.dealProductSkuDetail(product.productskus(), (Long)product.getId(), (Long)product.get("productApplyRangeId"), productDetails.get(0), allitemMap, allSpecItemMap);
            this.dealProductSkuAudit(product.productskus());
            this.checkSpecValues(product);
        }
        return null;
    }

    private Map<String, ProductSpecItem> dealSpecItems(Product product) {
        if (!CollectionUtils.isEmpty((Collection)product.productspecitems())) {
            List productspecitems = product.productspecitems();
            HashMap<String, ProductSpecItem> allSpecItemMap = new HashMap<String, ProductSpecItem>(productspecitems.size());
            for (ProductSpecItem item : productspecitems) {
                allSpecItemMap.put(item.getLsSpecItems_id().toString(), item);
            }
            return allSpecItemMap;
        }
        return null;
    }

    private Map<String, ProductFreeCharacterItem> dealproductfreecharacteritems(Product product) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId())});
        QuerySchema schema = QuerySchema.create().addSelect("id, characteristicsId, characterId, characterValueId").addCondition((ConditionExpression)queryConditionGroup);
        List productfreecharacteritemsInDb = this.productSkuService.query("pc.product.ProductFreeCharacterItem", schema);
        HashMap<String, ProductFreeCharacterItem> itemInDbMap = null;
        if (!CollectionUtils.isEmpty((Collection)productfreecharacteritemsInDb)) {
            itemInDbMap = new HashMap<String, ProductFreeCharacterItem>(productfreecharacteritemsInDb.size());
            for (ProductFreeCharacterItem item : productfreecharacteritemsInDb) {
                itemInDbMap.put(item.getCharacterValueId(), item);
            }
        }
        if (!CollectionUtils.isEmpty((Collection)product.productfreecharacteritems())) {
            ArrayList<ProductFreeCharacterItem> insertCharacterItems = new ArrayList<ProductFreeCharacterItem>();
            List productfreecharacteritems = product.productfreecharacteritems();
            HashMap<String, ProductFreeCharacterItem> allitemId = new HashMap<String, ProductFreeCharacterItem>(productfreecharacteritems.size());
            for (ProductFreeCharacterItem freeCharacterItem : productfreecharacteritems) {
                if (EntityStatus.Update == freeCharacterItem.getEntityStatus() && itemInDbMap != null && itemInDbMap.containsKey(freeCharacterItem.getCharacterValueId())) {
                    freeCharacterItem.setEntityStatus(EntityStatus.Update);
                    freeCharacterItem.setId(((ProductFreeCharacterItem)itemInDbMap.get(freeCharacterItem.getCharacterValueId())).getId());
                } else if (EntityStatus.Insert == freeCharacterItem.getEntityStatus()) {
                    if (itemInDbMap != null && itemInDbMap.containsKey(freeCharacterItem.getCharacterValueId())) {
                        freeCharacterItem.setEntityStatus(EntityStatus.Unchanged);
                    } else {
                        freeCharacterItem.setId((Object)(IdManager.getInstance().nextId() + ""));
                        freeCharacterItem.setTenant(AppContext.getTenantId());
                        freeCharacterItem.setYtenant((String)AppContext.getYhtTenantId());
                        freeCharacterItem.setProductId((Long)product.getId());
                        insertCharacterItems.add(freeCharacterItem);
                    }
                }
                allitemId.put(freeCharacterItem.getCharacterValueId(), freeCharacterItem);
                List productSpecItemAlbums = freeCharacterItem.productFreeCharacterItemAlbums();
                if (CollectionUtils.isEmpty((Collection)productSpecItemAlbums)) continue;
                for (ProductSpecItemAlbum album : productSpecItemAlbums) {
                    if (EntityStatus.Insert != album.getEntityStatus()) continue;
                    album.setId((Object)IdManager.getInstance().nextId());
                    album.setProductFreeCharacterItemId((String)freeCharacterItem.getId());
                    album.setProductSpecItemId(Long.valueOf(Long.parseLong((String)freeCharacterItem.getId())));
                    album.setProductId((Long)product.getId());
                }
            }
            if (!CollectionUtils.isEmpty(insertCharacterItems)) {
                this.productSkuCharacterService.dealFreeCharacterItems(insertCharacterItems);
            }
            return allitemId;
        }
        return null;
    }

    private void dealProductSkuDetail(List<ProductSKU> productskus, long productId, long productApplyRangeId, ProductDetail productDetail, Map<String, ProductFreeCharacterItem> allitemMap, Map<String, ProductSpecItem> allSpecItemMap) throws Exception {
        BillCodeContext billCodeContext = this.billCodeComponentService.getBillCodeContext("pc_product|productskus#code", (String)AppContext.getYhtTenantId(), "");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)});
        QuerySchema schema = QuerySchema.create().addSelect("id, name, code, productTemplate, model, modelDescription").addCondition((ConditionExpression)queryConditionGroup);
        List products = this.productSkuService.query("pc.product.Product", schema);
        Product product = (Product)products.get(0);
        ArrayList<ProductSKU> productSKUSInsert = new ArrayList<ProductSKU>();
        AtomicInteger maxCode = this.productSkuAsyncSaveService.getMaxCode(productId, product.getCode());
        for (ProductSKU sku : productskus) {
            if (EntityStatus.Insert == sku.getEntityStatus()) {
                if (CollectionUtils.isEmpty((Collection)sku.productSkuDetailNew())) {
                    sku.setSource(ProductSource.DynamicSku);
                    this.productSkuAsyncSaveService.setSkuDetailForInsert(sku, productId, productApplyRangeId, productDetail);
                } else {
                    sku.setSource(ProductSource.UI);
                    this.setSkuDetail(sku, productId, productApplyRangeId, productDetail);
                    this.productSkuAsyncSaveService.dealSkuDataForApplied(sku, productId);
                }
                if (sku.productSkuOrderProperty() != null) {
                    this.productSkuAsyncSaveService.dealProductSkuOrderPropertiesForInsert(sku, productId, productApplyRangeId, productDetail);
                }
                this.setSkuSpecItem(sku, allSpecItemMap);
                this.productSkuService.setSKUDefaultValue(product, sku, maxCode, billCodeContext);
                productSKUSInsert.add(sku);
                this.setFreeValueIdsMd5(sku);
                this.dealskufreecharacteritems(sku, allitemMap);
                if (TreeApplyRangeUtils.getInstance().isExcelData((BizObject)sku)) {
                    sku.setSource(ProductSource.ExcelImport);
                    continue;
                }
                if (!TreeApplyRangeUtils.getInstance().isApiOrExcelData((BizObject)sku)) continue;
                sku.setSource(ProductSource.OpenAPI);
                continue;
            }
            if (EntityStatus.Delete == sku.getEntityStatus()) {
                this.productSkuService.deleteSkuById(sku.getId(), productId);
                continue;
            }
            if (EntityStatus.Update != sku.getEntityStatus()) continue;
            this.setSkuDetail(sku, productId, productApplyRangeId, productDetail);
            if (sku.productSkuOrderProperty() != null) {
                this.productSkuAsyncSaveService.dealProductSkuOrderPropertiesForUpdate(sku, productId, productApplyRangeId, productDetail);
            }
            sku.remove("skuFreeCharacter");
        }
        if (!CollectionUtils.isEmpty(productSKUSInsert)) {
            Product productSave = new Product();
            productSave.setEntityStatus(EntityStatus.Insert);
            productSave.setId((Object)productId);
            productSave.setProductskus(productSKUSInsert);
            this.productSKUAutoCodeRule.skuBatchAutoCode(productSave, billCodeContext.getBillnumMode());
        }
        this.productSkuService.updateProductDefaultSku(productId);
    }

    private void dealskufreecharacteritems(ProductSKU sku, Map<String, ProductFreeCharacterItem> allitemMap) {
        if (allitemMap == null || allitemMap.isEmpty()) {
            return;
        }
        if (StringUtils.isNotEmpty((CharSequence)sku.getFreeValueIds())) {
            String[] freeItemIds;
            ArrayList<SkuFreeCharacterItem> skufreecharacteritems = new ArrayList<SkuFreeCharacterItem>();
            for (String itemId : freeItemIds = sku.getFreeValueIds().split(";")) {
                ProductFreeCharacterItem freeCharacterItem = allitemMap.get(itemId);
                if (null == freeCharacterItem) continue;
                SkuFreeCharacterItem item = new SkuFreeCharacterItem();
                item.setId((Object)(IdManager.getInstance().nextId() + ""));
                item.setSkuId((Long)sku.getId());
                item.setProductId(sku.getProductId());
                item.setProductFreeCharacterItemId(freeCharacterItem.getId().toString());
                item.setCharacteristicsId(freeCharacterItem.getCharacteristicsId());
                item.setCharacterId(freeCharacterItem.getCharacterId());
                item.setCharacterCode(freeCharacterItem.getCharacterCode());
                item.setCharacterValueId(freeCharacterItem.getCharacterValueId());
                item.setTenant(AppContext.getTenantId());
                item.setYtenant((String)AppContext.getYhtTenantId());
                item.setEntityStatus(EntityStatus.Insert);
                skufreecharacteritems.add(item);
            }
            sku.setSkufreecharacteritems(skufreecharacteritems);
        }
    }

    public void setFreeValueIdsMd5(ProductSKU sku) {
        if (StringUtils.isNotEmpty((CharSequence)sku.getFreeValueIds())) {
            if (StringUtils.isEmpty((CharSequence)sku.getSpecIds())) {
                sku.setSpecIds(sku.getFreeValueIds());
            }
            if (StringUtils.isEmpty((CharSequence)sku.getSpecs())) {
                sku.setSpecs(sku.getFreeValues());
            }
        } else {
            sku.setFreeValueIds(sku.getSpecIds());
            sku.setFreeValues(sku.getSpecs());
        }
        String freeValueIds = sku.getSpecIds();
        String[] idsArray = freeValueIds.split(";");
        List<String> idList = Arrays.asList(idsArray);
        ArrayList<String> ids = new ArrayList<String>(idList);
        ids.add(sku.getProductId().toString());
        String freeValueIdsMd5 = UpcStringUtil.sortStrMd5(ids);
        sku.setFreeValueIdsMd5(freeValueIdsMd5);
    }

    private void setSkuSpecItem(ProductSKU sku, Map<String, ProductSpecItem> allSpecItemMap) throws Exception {
        String specIds = sku.getSpecIds();
        if (StringUtils.isNotEmpty((CharSequence)specIds)) {
            String[] ids = specIds.split(";");
            ArrayList<ProductSKUSpecItem> skuSpecItems = new ArrayList<ProductSKUSpecItem>();
            for (String id : ids) {
                if (allSpecItemMap == null || allSpecItemMap.isEmpty()) continue;
                ProductSpecItem productSpecItem = allSpecItemMap.get(id);
                ProductSKUSpecItem skuSpecItem = new ProductSKUSpecItem();
                skuSpecItem.setId((Object)IdManager.getInstance().nextId());
                skuSpecItem.setProductId(sku.getProductId());
                skuSpecItem.setSkuId((Long)sku.getId());
                skuSpecItem.setSpecId(productSpecItem.getISpecId());
                skuSpecItem.setSpecItemId(productSpecItem.getLsSpecItems_id());
                skuSpecItem.setEntityStatus(EntityStatus.Insert);
                skuSpecItems.add(skuSpecItem);
            }
            sku.setProductSKUSpecItems(skuSpecItems);
        }
    }

    public void setSkuDetail(ProductSKU sku, long productId, long productApplyRangeId, ProductDetail productDetail) throws Exception {
        sku.setProductSKUDetail(null);
        List skuDetailNews = sku.productSkuDetailNew();
        ProductSkuDetailNew skuDetailNew = (ProductSkuDetailNew)skuDetailNews.get(0);
        skuDetailNew.setIsCreator(Boolean.valueOf(true));
        this.checkStatus(skuDetailNew, productDetail);
        if (EntityStatus.Insert == sku.getEntityStatus()) {
            skuDetailNew.setId((Object)IdManager.getInstance().nextId());
            skuDetailNew.setEntityStatus(EntityStatus.Insert);
        } else {
            skuDetailNew.setEntityStatus(EntityStatus.Update);
        }
        skuDetailNew.setIsCreator(Boolean.valueOf(true));
        skuDetailNew.setSkuId((Long)sku.getId());
        skuDetailNew.setProductId(Long.valueOf(productId));
        skuDetailNew.setProductApplyRangeId(Long.valueOf(productApplyRangeId));
        skuDetailNew.setProductDetailId(Long.valueOf(Long.parseLong(productDetail.getId().toString())));
        if (null != sku.getIsSKU() && 0 == sku.getIsSKU()) {
            skuDetailNew.setStopstatus(Boolean.valueOf(true));
            skuDetailNew.setStatus(Boolean.valueOf(false));
            skuDetailNew.setUstatus(Boolean.valueOf(false));
        }
        ArrayList<ProductSkuDetailNew> productSkuDetailNews = new ArrayList<ProductSkuDetailNew>();
        productSkuDetailNews.add(skuDetailNew);
        sku.setProductSkuDetailNew(productSkuDetailNews);
        List productSkuOrderProperties = sku.productSkuOrderProperty();
        if (!CollectionUtils.isEmpty((Collection)productSkuOrderProperties)) {
            for (ProductSkuOrderProperty productSkuOrderProperty : productSkuOrderProperties) {
                productSkuOrderProperty.setProductDetailId(Long.valueOf(Long.parseLong(productDetail.getId().toString())));
                productSkuOrderProperty.setProductApplyRangeId(Long.valueOf(productApplyRangeId));
            }
        }
    }

    private void checkStatus(ProductSkuDetailNew skuDetailNew, ProductDetail productDetail) throws Exception {
        boolean isOpenUdh;
        boolean isOpenUMall;
        if (null == productDetail || null == skuDetailNew) {
            return;
        }
        Boolean status = skuDetailNew.getStatus();
        if (null != status && status.booleanValue() && (isOpenUMall = ProductUtil.checkOpenOption("u8c-config", DomainOpenEnum.MALL.getServiceName())) && !productDetail.getIStatus().booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_STATUS_NOT_ALLOW_SALE);
        }
        Boolean ustatus = skuDetailNew.getUstatus();
        if (null != ustatus && ustatus.booleanValue() && (isOpenUdh = ProductUtil.checkOpenOption("u8c-config", "app:SCMSA")) && !productDetail.getIUOrderStatus().booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SHOP_STATUS_NOT_ALLOW_SALE_BY_U);
        }
        Boolean stopstatus = skuDetailNew.getStopstatus();
        if (null != stopstatus && !stopstatus.booleanValue() && productDetail.getStopstatus().booleanValue()) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_STOP_STATUS_NOT_ALLOW_SKU_SALE);
        }
    }

    private void checkSpecValues(Product product) {
        List productskus = product.productskus();
        boolean hasInsertSku = false;
        for (ProductSKU sku : productskus) {
            if (EntityStatus.Insert != sku.getEntityStatus()) continue;
            hasInsertSku = true;
            if (StringUtils.isEmpty((CharSequence)sku.getFreeValueIds())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_FREE_VALUE_IDS_IS_NULL);
            }
            if (CollectionUtils.isEmpty((Collection)sku.skufreecharacteritems())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SKU_FREE_CHARACTER_ITEMS_IS_NULL);
            }
            if (!ObjectUtils.isEmpty((Object)sku.getSkuFreeCharacter())) continue;
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SKU_SAVE_FREECHARACTER_NULL);
        }
        if (hasInsertSku && CollectionUtils.isEmpty((Collection)product.productfreecharacteritems())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_FREE_CHARACTER_ITEMS_IS_NULL);
        }
    }

    private void dealProductSkuAudit(List<ProductSKU> productskus) {
        LoginUser user = AppContext.getCurrentUser();
        if (user == null) {
            return;
        }
        for (ProductSKU sku : productskus) {
            if (EntityStatus.Insert == sku.getEntityStatus()) {
                sku.set("creatorId", user.getId());
                sku.set("creator", (Object)user.getName());
                sku.setCreateTime(DateKit.getNowDate());
                sku.setCreateDate(DateKit.getNowDateShort());
                continue;
            }
            if (EntityStatus.Update != sku.getEntityStatus()) continue;
            sku.set("modifierId", user.getId());
            sku.set("modifier", (Object)user.getName());
            sku.setModifyTime(DateKit.getNowDate());
            sku.setModifyDate(DateKit.getNowDateShort());
        }
    }
}

