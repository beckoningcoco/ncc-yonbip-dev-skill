/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail
 *  com.yonyoucloud.upc.pc.product.ProductCheckFree
 *  com.yonyoucloud.upc.pc.product.ProductCheckFreeExtend
 *  com.yonyoucloud.upc.pc.product.ProductDepositTime
 *  com.yonyoucloud.upc.pc.product.ProductDepositTimeExtend
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.ProductParameter
 *  com.yonyoucloud.upc.pc.product.ProductParameterExtend
 *  com.yonyoucloud.upc.pc.product.ProductSKUDetail
 *  com.yonyoucloud.upc.pc.product.ProductSKUExtend
 *  com.yonyoucloud.upc.pc.product.ProductTag
 *  com.yonyoucloud.upc.pc.product.ProductTagExtend
 *  com.yonyoucloud.upc.pc.product.SKUOrderProperty
 *  com.yonyoucloud.upc.pc.product.SKUOrderPropertyExtend
 *  com.yonyoucloud.upc.pc.product.SKUTag
 *  com.yonyoucloud.upc.pc.product.SKUTagExtend
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.bill.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail;
import com.yonyoucloud.upc.pc.product.ProductCheckFree;
import com.yonyoucloud.upc.pc.product.ProductCheckFreeExtend;
import com.yonyoucloud.upc.pc.product.ProductDepositTime;
import com.yonyoucloud.upc.pc.product.ProductDepositTimeExtend;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.ProductParameter;
import com.yonyoucloud.upc.pc.product.ProductParameterExtend;
import com.yonyoucloud.upc.pc.product.ProductSKUDetail;
import com.yonyoucloud.upc.pc.product.ProductSKUExtend;
import com.yonyoucloud.upc.pc.product.ProductTag;
import com.yonyoucloud.upc.pc.product.ProductTagExtend;
import com.yonyoucloud.upc.pc.product.SKUOrderProperty;
import com.yonyoucloud.upc.pc.product.SKUOrderPropertyExtend;
import com.yonyoucloud.upc.pc.product.SKUTag;
import com.yonyoucloud.upc.pc.product.SKUTagExtend;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductDoubleWriteService {
    private static final Logger log = LoggerFactory.getLogger(ProductDoubleWriteService.class);
    public static List<String> productDetailMultilingualFieldsList = new ArrayList<String>(Arrays.asList("receiptName", "displayName", "titleMemo", "metaDescription", "receiptSpec", "receiptModel", "remark"));

    public void removeOldProductModel(Product product) {
        List productApplyRangeParamList;
        product.remove("detail");
        product.remove("time");
        product.entrySet().removeIf(entry -> ((String)entry.getKey()).startsWith("detail!") || ((String)entry.getKey()).startsWith("time!"));
        product.remove("productParams");
        product.remove("productSpecFrees");
        product.remove("productTags");
        product.remove("defaultSKUOrderProperties");
        List productSkuList = (List)product.get("productskus");
        if (!CollectionUtils.isEmpty((Collection)productSkuList)) {
            productSkuList.forEach(productSku -> {
                productSku.remove("productSKUDetail");
                productSku.remove("productSKUAppliedDetail");
                productSku.remove("skuAppliedOrderProperties");
            });
        }
        if (!CollectionUtils.isEmpty((Collection)(productApplyRangeParamList = (List)product.get("productApplyRange")))) {
            productApplyRangeParamList.forEach(productApplyRange -> {
                productApplyRange.remove("skuTags");
                productApplyRange.remove("skuAppliedTags");
                productApplyRange.remove("productAppliedParams");
                productApplyRange.remove("productAppliedSpecFrees");
                productApplyRange.remove("productAppliedTags");
                productApplyRange.remove("productAppliedDetail");
                productApplyRange.remove("productAppliedTime");
            });
        }
    }

    public void dealOldProductModelTable(Product product) {
        this.saveIfNotNull(product.detail(), this::saveProductExtend);
        this.saveIfNotNull(product.time(), this::saveProductDepositTimeExtend);
        this.saveAllIfNotEmpty(product.productParams(), this::saveProductParameterExtend);
        this.saveAllIfNotEmpty(product.productSpecFrees(), this::saveProductCheckFreeExtend);
        this.saveAllIfNotEmpty(product.productTags(), this::saveProductTagExtend);
        this.saveAllIfNotEmpty(product.defaultSKUOrderProperties(), this::saveSkuOrderPropertyExtend);
        this.processProductSKUs(product);
        this.processProductApplyRanges(product);
    }

    private void processProductSKUs(Product product) {
        List productSkuList = product.productskus();
        if (!CollectionUtils.isEmpty((Collection)productSkuList)) {
            productSkuList.forEach(productSKU -> {
                this.saveIfNotNull(productSKU.productSKUDetail(), this::saveProductSkuExtend);
                this.saveIfNotNull(productSKU.productSKUAppliedDetail(), this::saveProductSkuDetail);
                this.saveAllIfNotEmpty(productSKU.skuOrderProperties(), this::saveSkuOrderPropertyExtend);
                this.saveAllIfNotEmpty(productSKU.skuAppliedOrderProperties(), this::saveSkuOrderProperty);
            });
        }
    }

    private void processProductApplyRanges(Product product) {
        List productApplyRangeList = product.productApplyRange();
        if (!CollectionUtils.isEmpty((Collection)productApplyRangeList)) {
            productApplyRangeList.forEach(productApplyRange -> {
                this.saveIfNotNull(productApplyRange.productAppliedDetail(), productApplyRangeDetail -> {
                    productApplyRangeDetail.setId(productApplyRange.getId());
                    this.saveProductApplyRangeDetail((ProductApplyRangeDetail)productApplyRangeDetail);
                });
                this.saveIfNotNull(productApplyRange.productAppliedTime(), this::saveProductDepositTime);
                this.saveAllIfNotEmpty(productApplyRange.productAppliedSpecFrees(), this::saveProductCheckFree);
                this.saveAllIfNotEmpty(productApplyRange.productAppliedParams(), this::saveProductParameter);
                this.saveAllIfNotEmpty(productApplyRange.productAppliedTags(), this::saveProductTag);
                this.saveAllIfNotEmpty(productApplyRange.skuTags(), this::saveSkuTagExtend);
                this.saveAllIfNotEmpty(productApplyRange.skuAppliedTags(), this::saveSkuTag);
            });
        }
    }

    private <T> void saveIfNotNull(T object, Consumer<T> saveMethod) {
        if (object != null) {
            saveMethod.accept(object);
        }
    }

    private <T> void saveAllIfNotEmpty(List<T> list, Consumer<T> saveMethod) {
        if (!CollectionUtils.isEmpty(list)) {
            list.forEach(saveMethod);
        }
    }

    public void saveProductExtend(ProductExtend productExtend) {
        productExtend.put("tenant", AppContext.getTenantId());
        productExtend.put("ytenant", AppContext.getYTenantId());
        this.dealMultilingualFields((BizObject)productExtend, productDetailMultilingualFieldsList);
        try {
            if (EntityStatus.Insert.equals((Object)productExtend.getEntityStatus())) {
                SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductExtendDoubleWriteDao.insertProductExtendSelective", (Object)productExtend);
            } else if (EntityStatus.Update.equals((Object)productExtend.getEntityStatus())) {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductExtendDoubleWriteDao.updateProductExtendByPrimaryKey", (Object)productExtend);
            }
        }
        catch (Exception e) {
            log.error("\u5904\u7406productExtend\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800549);
        }
    }

    public void saveProductApplyRangeDetail(ProductApplyRangeDetail productApplyRangeDetail) {
        productApplyRangeDetail.put("tenant", AppContext.getTenantId());
        productApplyRangeDetail.put("ytenant", AppContext.getYTenantId());
        this.dealMultilingualFields((BizObject)productApplyRangeDetail, productDetailMultilingualFieldsList);
        try {
            if (EntityStatus.Insert.equals((Object)productApplyRangeDetail.getEntityStatus())) {
                SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductRangeDetailDoubleWriteDao.insertProductApplyRangeDetailSelective", (Object)productApplyRangeDetail);
            } else if (EntityStatus.Update.equals((Object)productApplyRangeDetail.getEntityStatus())) {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductRangeDetailDoubleWriteDao.updateProductApplyRangeDetailByPrimaryKey", (Object)productApplyRangeDetail);
            }
        }
        catch (Exception e) {
            log.error("\u5904\u7406productApplyRangeDetail\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800550);
        }
    }

    public void saveProductCheckFreeExtend(ProductCheckFreeExtend productCheckFreeExtend) {
        productCheckFreeExtend.put("tenant", AppContext.getTenantId());
        productCheckFreeExtend.put("ytenant", AppContext.getYTenantId());
        try {
            if (EntityStatus.Insert.equals((Object)productCheckFreeExtend.getEntityStatus())) {
                SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertProductCheckFreeExtendSelective", (Object)productCheckFreeExtend);
            } else if (EntityStatus.Update.equals((Object)productCheckFreeExtend.getEntityStatus())) {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateProductCheckFreeExtendByPrimaryKey", (Object)productCheckFreeExtend);
            } else if (EntityStatus.Delete.equals((Object)productCheckFreeExtend.getEntityStatus())) {
                SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteProductCheckFreeExtendByPrimaryKey", (Object)productCheckFreeExtend.getId());
            }
        }
        catch (Exception e) {
            log.error("\u5904\u7406productCheckFreeExtend\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800551);
        }
    }

    public void saveProductCheckFree(ProductCheckFree productCheckFree) {
        productCheckFree.put("tenant", AppContext.getTenantId());
        productCheckFree.put("ytenant", AppContext.getYTenantId());
        try {
            if (EntityStatus.Insert.equals((Object)productCheckFree.getEntityStatus())) {
                SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertProductCheckFreeSelective", (Object)productCheckFree);
            } else if (EntityStatus.Update.equals((Object)productCheckFree.getEntityStatus())) {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateProductCheckFreeByPrimaryKey", (Object)productCheckFree);
            } else if (EntityStatus.Delete.equals((Object)productCheckFree.getEntityStatus())) {
                SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteProductCheckFreeByPrimaryKey", (Object)productCheckFree.getId());
            }
        }
        catch (Exception e) {
            log.error("\u5904\u7406productCheckFree\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800552);
        }
    }

    public void saveProductDepositTimeExtend(ProductDepositTimeExtend productDepositTimeExtend) {
        productDepositTimeExtend.put("tenant", AppContext.getTenantId());
        productDepositTimeExtend.put("ytenant", AppContext.getYTenantId());
        if (EntityStatus.Insert.equals((Object)productDepositTimeExtend.getEntityStatus())) {
            SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertProductDepositTimeExtendSelective", (Object)productDepositTimeExtend);
        } else if (EntityStatus.Update.equals((Object)productDepositTimeExtend.getEntityStatus())) {
            try {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateProductDepositTimeExtendByPrimaryKey", (Object)productDepositTimeExtend);
            }
            catch (Exception e) {
                log.error("\u66f4\u65b0productDepositTimeExtend\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800553);
            }
        }
    }

    public void saveProductDepositTime(ProductDepositTime productDepositTime) {
        productDepositTime.put("tenant", AppContext.getTenantId());
        productDepositTime.put("ytenant", AppContext.getYTenantId());
        try {
            if (EntityStatus.Insert.equals((Object)productDepositTime.getEntityStatus())) {
                SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertProductDepositTimeSelective", (Object)productDepositTime);
            } else if (EntityStatus.Update.equals((Object)productDepositTime.getEntityStatus())) {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateProductDepositTimeByPrimaryKey", (Object)productDepositTime);
            }
        }
        catch (Exception e) {
            log.error("\u5904\u7406productDepositTime\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800554);
        }
    }

    public void saveProductParameterExtend(ProductParameterExtend productParameterExtend) {
        productParameterExtend.put("tenant", AppContext.getTenantId());
        productParameterExtend.put("ytenant", AppContext.getYTenantId());
        try {
            if (EntityStatus.Insert.equals((Object)productParameterExtend.getEntityStatus())) {
                SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertProductParameterExtendSelective", (Object)productParameterExtend);
            } else if (EntityStatus.Update.equals((Object)productParameterExtend.getEntityStatus())) {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateProductParameterExtendByPrimaryKey", (Object)productParameterExtend);
            } else if (EntityStatus.Delete.equals((Object)productParameterExtend.getEntityStatus())) {
                SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteProductParameterExtendByPrimaryKey", (Object)productParameterExtend.getId());
            }
        }
        catch (Exception e) {
            log.error("\u5904\u7406productParameterExtend\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800555);
        }
    }

    public void saveProductParameter(ProductParameter productParameter) {
        productParameter.put("tenant", AppContext.getTenantId());
        productParameter.put("ytenant", AppContext.getYTenantId());
        try {
            if (EntityStatus.Insert.equals((Object)productParameter.getEntityStatus())) {
                SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertProductParameterSelective", (Object)productParameter);
            } else if (EntityStatus.Update.equals((Object)productParameter.getEntityStatus())) {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateProductParameterByPrimaryKey", (Object)productParameter);
            } else if (EntityStatus.Delete.equals((Object)productParameter.getEntityStatus())) {
                SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteProductParameterByPrimaryKey", (Object)productParameter.getId());
            }
        }
        catch (Exception e) {
            log.error("\u5904\u7406productParameter\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800556);
        }
    }

    public void saveSkuOrderPropertyExtend(SKUOrderPropertyExtend skuOrderPropertyExtend) {
        skuOrderPropertyExtend.put("tenant", AppContext.getTenantId());
        skuOrderPropertyExtend.put("ytenant", AppContext.getYTenantId());
        try {
            if (EntityStatus.Insert.equals((Object)skuOrderPropertyExtend.getEntityStatus())) {
                SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertSkuOrderPropertyExtendSelective", (Object)skuOrderPropertyExtend);
            } else if (EntityStatus.Update.equals((Object)skuOrderPropertyExtend.getEntityStatus())) {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateSkuOrderPropertyExtendByPrimaryKey", (Object)skuOrderPropertyExtend);
            } else if (EntityStatus.Delete.equals((Object)skuOrderPropertyExtend.getEntityStatus())) {
                SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteSkuOrderPropertyExtendByPrimaryKey", (Object)skuOrderPropertyExtend.getId());
            }
        }
        catch (Exception e) {
            log.error("\u5904\u7406skuOrderPropertyExtend\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800557);
        }
    }

    public void saveSkuOrderProperty(SKUOrderProperty skuOrderProperty) {
        skuOrderProperty.put("tenant", AppContext.getTenantId());
        skuOrderProperty.put("ytenant", AppContext.getYTenantId());
        try {
            if (EntityStatus.Insert.equals((Object)skuOrderProperty.getEntityStatus())) {
                SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertSkuOrderPropertySelective", (Object)skuOrderProperty);
            } else if (EntityStatus.Update.equals((Object)skuOrderProperty.getEntityStatus())) {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateSkuOrderPropertyByPrimaryKey", (Object)skuOrderProperty);
            } else if (EntityStatus.Delete.equals((Object)skuOrderProperty.getEntityStatus())) {
                SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteSkuOrderPropertyByPrimaryKey", (Object)skuOrderProperty.getId());
            }
        }
        catch (Exception e) {
            log.error("\u5904\u7406skuOrderProperty\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800558);
        }
    }

    public void saveProductTagExtend(ProductTagExtend productTagExtend) {
        productTagExtend.put("tenant", AppContext.getTenantId());
        productTagExtend.put("ytenant", AppContext.getYTenantId());
        try {
            if (EntityStatus.Insert.equals((Object)productTagExtend.getEntityStatus())) {
                SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertProductTagExtendSelective", (Object)productTagExtend);
            } else if (EntityStatus.Update.equals((Object)productTagExtend.getEntityStatus())) {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateProductTagExtendByPrimaryKey", (Object)productTagExtend);
            } else if (EntityStatus.Delete.equals((Object)productTagExtend.getEntityStatus())) {
                SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteProductTagExtendById", (Object)productTagExtend);
            }
        }
        catch (Exception e) {
            log.error("\u5904\u7406productTagExtend\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800559);
        }
    }

    public void saveProductTag(ProductTag productTag) {
        productTag.put("tenant", AppContext.getTenantId());
        productTag.put("ytenant", AppContext.getYTenantId());
        try {
            if (EntityStatus.Insert.equals((Object)productTag.getEntityStatus())) {
                SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertProductTagSelective", (Object)productTag);
            } else if (EntityStatus.Update.equals((Object)productTag.getEntityStatus())) {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateProductTagByPrimaryKey", (Object)productTag);
            } else if (EntityStatus.Delete.equals((Object)productTag.getEntityStatus())) {
                SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteProductTagById", (Object)productTag);
            }
        }
        catch (Exception e) {
            log.error("\u5904\u7406productTag\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800560);
        }
    }

    public void saveProductSkuExtend(ProductSKUExtend productSkuExtend) {
        productSkuExtend.put("tenant", AppContext.getTenantId());
        productSkuExtend.put("ytenant", AppContext.getYTenantId());
        if (EntityStatus.Insert.equals((Object)productSkuExtend.getEntityStatus())) {
            SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductSkuExtendAndDetailDoubleWriteDao.insertProductSkuExtendSelective", (Object)productSkuExtend);
        } else if (EntityStatus.Update.equals((Object)productSkuExtend.getEntityStatus())) {
            try {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductSkuExtendAndDetailDoubleWriteDao.updateProductSkuExtendByPrimaryKey", (Object)productSkuExtend);
            }
            catch (Exception e) {
                log.error("\u66f4\u65b0productSkuExtend\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800561);
            }
        }
    }

    public void saveProductSkuDetail(ProductSKUDetail productSkuDetail) {
        productSkuDetail.put("tenant", AppContext.getTenantId());
        productSkuDetail.put("ytenant", AppContext.getYTenantId());
        if (EntityStatus.Insert.equals((Object)productSkuDetail.getEntityStatus())) {
            SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductSkuExtendAndDetailDoubleWriteDao.insertProductSkuDetailSelective", (Object)productSkuDetail);
        } else if (EntityStatus.Update.equals((Object)productSkuDetail.getEntityStatus())) {
            try {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductSkuExtendAndDetailDoubleWriteDao.updateProductSkuDetailByPrimaryKey", (Object)productSkuDetail);
            }
            catch (Exception e) {
                log.error("\u66f4\u65b0productSkuDetail\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800562);
            }
        }
    }

    public void saveSkuTagExtend(SKUTagExtend skuTagExtend) {
        skuTagExtend.put("tenant", AppContext.getTenantId());
        skuTagExtend.put("ytenant", AppContext.getYTenantId());
        try {
            if (EntityStatus.Insert.equals((Object)skuTagExtend.getEntityStatus())) {
                SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertSkuTagExtendSelective", (Object)skuTagExtend);
            } else if (EntityStatus.Update.equals((Object)skuTagExtend.getEntityStatus())) {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateSkuTagExtendByPrimaryKey", (Object)skuTagExtend);
            } else if (EntityStatus.Delete.equals((Object)skuTagExtend.getEntityStatus())) {
                ArrayList<Long> removedIds = new ArrayList<Long>();
                removedIds.add((Long)skuTagExtend.getId());
                skuTagExtend.put("ids", removedIds);
                SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteSkuTagExtendByPrimaryKey", (Object)skuTagExtend);
            }
        }
        catch (Exception e) {
            log.error("\u5904\u7406skuTagExtend\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800563);
        }
    }

    public void saveSkuTag(SKUTag skuTag) {
        skuTag.put("tenant", AppContext.getTenantId());
        skuTag.put("ytenant", AppContext.getYTenantId());
        try {
            if (EntityStatus.Insert.equals((Object)skuTag.getEntityStatus())) {
                SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertSkuTagSelective", (Object)skuTag);
            } else if (EntityStatus.Update.equals((Object)skuTag.getEntityStatus())) {
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateSkuTagByPrimaryKey", (Object)skuTag);
            } else if (EntityStatus.Delete.equals((Object)skuTag.getEntityStatus())) {
                ArrayList<Long> removedIds = new ArrayList<Long>();
                removedIds.add((Long)skuTag.getId());
                skuTag.put("ids", removedIds);
                SqlHelper.delete((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.deleteSkuTagByPrimaryKey", (Object)skuTag.getId());
            }
        }
        catch (Exception e) {
            log.error("\u5904\u7406skuTag\u6570\u636e\u5f02\u5e38\uff1a{}", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800564);
        }
    }

    private void dealMultilingualFields(BizObject bizObject, List<String> fieldNameList) {
        fieldNameList.forEach(fieldName -> {
            Map fieldObj;
            if (bizObject.get(fieldName) instanceof Map && (fieldObj = (Map)bizObject.get(fieldName)) != null) {
                bizObject.put(fieldName, fieldObj.get("zh_CN"));
                bizObject.put(fieldName + "2", fieldObj.get("en_US"));
                bizObject.put(fieldName + "3", fieldObj.get("zh_TW"));
                bizObject.put(fieldName + "4", fieldObj.get("fr_FR"));
            }
        });
    }
}

