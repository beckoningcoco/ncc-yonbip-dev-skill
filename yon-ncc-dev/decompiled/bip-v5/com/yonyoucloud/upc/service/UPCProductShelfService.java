/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductShelfService;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.service.DataSourceService;
import com.yonyoucloud.upc.service.UPCProductQueryService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class UPCProductShelfService
implements IUPCProductShelfService {
    private static final String PRODUCTSKU_SELECT_MAPPER = "com.yonyoucloud.upc.product.dao.productSkuSelect";
    @Autowired
    DataSourceService dataSourceService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    UPCProductQueryService upcProductQueryService;

    @Override
    public void enableProduct(Long productApplyRangeId, Boolean enableSKU) throws Exception {
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productId, productDetailId, isCreator", (Object)productApplyRangeId);
        Long productId = Long.parseLong(((Map)rangeDetails.get(0)).get("productId").toString());
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        Boolean isCreator = Boolean.parseBoolean(((Map)rangeDetails.get(0)).get("isCreator").toString());
        HashMap<String, Object> param = new HashMap<String, Object>(4);
        param.put("productId", productId);
        param.put("ytenant", AppContext.getYTenantId());
        param.put("productApplyRangeId", productApplyRangeId);
        if (enableSKU.booleanValue()) {
            this.enableAllProductSku(productId, productApplyRangeId, isCreator);
        } else {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isSKU").eq((Object)0)});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
            List skuInDb = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
            if (!CollectionUtils.isEmpty((Collection)skuInDb)) {
                Long skuId = Long.parseLong(((Map)skuInDb.get(0)).get("id").toString());
                ProductSkuDetailNew updateParam = new ProductSkuDetailNew();
                updateParam.setStopstatus(Boolean.valueOf(false));
                updateParam.setStoptime(null);
                this.updateSkuDetailByCondition(productId, productApplyRangeId, skuId, isCreator, updateParam, productDetailId);
            }
        }
        ProductDetail productDetailParam = new ProductDetail();
        productDetailParam.setStopstatus(Boolean.valueOf(false));
        productDetailParam.setStoptime(null);
        this.setShelfAndlLnventory(productId, productDetailId, productApplyRangeId, isCreator, true, true, productDetailParam);
    }

    @Override
    public void enableAllProductSku(Long productId, Long productApplyRangeId, Boolean isCreator) throws Exception {
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productId, productDetailId, isCreator", (Object)productApplyRangeId);
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        HashMap<String, Object> param = new HashMap<String, Object>(4);
        param.put("productId", productId);
        param.put("ytenant", AppContext.getYTenantId());
        param.put("productApplyRangeId", productApplyRangeId);
        param.put("productDetailId", productDetailId);
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductShelf.EnableProductSKUOfCreatorByOrg", param);
    }

    @Override
    public void disableProduct(Long productId, Long productApplyRangeId, Boolean isCreator) throws Exception {
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productId, productDetailId, isCreator", (Object)productApplyRangeId);
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        HashMap<String, Object> param = new HashMap<String, Object>(4);
        param.put("productId", productId);
        this.putUserDataInMap(param);
        param.put("productApplyRangeId", productApplyRangeId);
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductShelf.DisableProduct", param);
        this.updateBaseModifyTime(productId);
    }

    @Override
    public void forceDownShopProduct(Long productApplyRangeId) throws Exception {
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productId, productDetailId, isCreator", (Object)productApplyRangeId);
        Long productId = Long.parseLong(((Map)rangeDetails.get(0)).get("productId").toString());
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        Boolean isCreator = Boolean.parseBoolean(((Map)rangeDetails.get(0)).get("isCreator").toString());
        HashMap<String, Object> params = new HashMap<String, Object>(4);
        params.put("productId", productId);
        params.put("productApplyRangeId", productApplyRangeId);
        params.put("productDetailId", productDetailId);
        params.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductShelf.unShelfMallAllSku", params);
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductShelf.unShelfUorderAllSku", params);
        ProductDetail productDetail = new ProductDetail();
        productDetail.setIStatus(Boolean.valueOf(false));
        productDetail.setMallUpTime(null);
        productDetail.setMallDownTime(new Date());
        productDetail.setIUOrderStatus(Boolean.valueOf(false));
        productDetail.setUorderUpTime(null);
        productDetail.setUorderDownTime(new Date());
        this.setShelfAndlLnventory(productId, productDetailId, productApplyRangeId, isCreator, true, true, productDetail);
    }

    @Override
    public void shelfMallProduct(Long productApplyRangeId) throws Exception {
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productId, productDetailId, isCreator", (Object)productApplyRangeId);
        Long productId = Long.parseLong(((Map)rangeDetails.get(0)).get("productId").toString());
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        Boolean isCreator = Boolean.parseBoolean(((Map)rangeDetails.get(0)).get("isCreator").toString());
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isSKU").eq((Object)0)});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        List skuInDb = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)skuInDb)) {
            Long skuId = Long.parseLong(((Map)skuInDb.get(0)).get("id").toString());
            ProductSkuDetailNew updateParam = new ProductSkuDetailNew();
            updateParam.setStatus(Boolean.valueOf(true));
            updateParam.setStatus_b(Boolean.valueOf(true));
            this.updateSkuDetailByCondition(productId, productApplyRangeId, skuId, isCreator, updateParam, productDetailId);
        }
        ProductDetail productDetail = new ProductDetail();
        productDetail.setIStatus(Boolean.valueOf(true));
        productDetail.setMallUpTime(new Date());
        productDetail.setMallDownTime(null);
        this.setShelfAndlLnventory(productId, productDetailId, productApplyRangeId, isCreator, true, false, productDetail);
    }

    @Override
    public void unShelfMallProduct(Long productApplyRangeId) throws Exception {
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productId, productDetailId, isCreator", (Object)productApplyRangeId);
        Long productId = Long.parseLong(((Map)rangeDetails.get(0)).get("productId").toString());
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        Boolean isCreator = Boolean.parseBoolean(((Map)rangeDetails.get(0)).get("isCreator").toString());
        HashMap<String, Object> params = new HashMap<String, Object>(4);
        params.put("productId", productId);
        params.put("productApplyRangeId", productApplyRangeId);
        params.put("productDetailId", productDetailId);
        params.put("ytenant", AppContext.getYTenantId());
        this.putUserDataInMap(params);
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductShelf.unShelfMallAllSku", params);
        ProductDetail productDetail = new ProductDetail();
        productDetail.setIStatus(Boolean.valueOf(false));
        productDetail.setMallUpTime(null);
        productDetail.setMallDownTime(new Date());
        this.setShelfAndlLnventory(productId, productDetailId, productApplyRangeId, isCreator, true, false, productDetail);
    }

    @Override
    public void shelfUOrderProduct(Long productApplyRangeId) throws Exception {
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productId, productDetailId, isCreator", (Object)productApplyRangeId);
        Long productId = Long.parseLong(((Map)rangeDetails.get(0)).get("productId").toString());
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        Boolean isCreator = Boolean.parseBoolean(((Map)rangeDetails.get(0)).get("isCreator").toString());
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isSKU").eq((Object)0)});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        List skuInDb = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)skuInDb)) {
            Long skuId = Long.parseLong(((Map)skuInDb.get(0)).get("id").toString());
            ProductSkuDetailNew updateParam = new ProductSkuDetailNew();
            updateParam.setUstatus(Boolean.valueOf(true));
            updateParam.setUstatus_b(Boolean.valueOf(true));
            this.updateSkuDetailByCondition(productId, productApplyRangeId, skuId, isCreator, updateParam, productDetailId);
        }
        ProductDetail productDetail = new ProductDetail();
        productDetail.setIUOrderStatus(Boolean.valueOf(true));
        productDetail.setUorderUpTime(new Date());
        productDetail.setUorderDownTime(null);
        this.setShelfAndlLnventory(productId, productDetailId, productApplyRangeId, isCreator, false, true, productDetail);
    }

    @Override
    public void unShelfUOrderProduct(Long productApplyRangeId) throws Exception {
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productId, productDetailId, isCreator", (Object)productApplyRangeId);
        Long productId = Long.parseLong(((Map)rangeDetails.get(0)).get("productId").toString());
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        Boolean isCreator = Boolean.parseBoolean(((Map)rangeDetails.get(0)).get("isCreator").toString());
        HashMap<String, Object> params = new HashMap<String, Object>(4);
        params.put("productId", productId);
        params.put("productApplyRangeId", productApplyRangeId);
        params.put("productDetailId", productDetailId);
        params.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductShelf.unShelfUorderAllSku", params);
        ProductDetail productDetail = new ProductDetail();
        productDetail.setIUOrderStatus(Boolean.valueOf(false));
        productDetail.setUorderUpTime(null);
        productDetail.setUorderDownTime(new Date());
        this.setShelfAndlLnventory(productId, productDetailId, productApplyRangeId, isCreator, false, true, productDetail);
    }

    @Override
    public void enableProductSKU(Long productId, Long productApplyRangeId, Long skuId, Boolean isCreator) throws Exception {
        ProductSkuDetailNew productSkuDetailNew = new ProductSkuDetailNew();
        productSkuDetailNew.setStopstatus(Boolean.valueOf(false));
        productSkuDetailNew.setStoptime(null);
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productDetailId", (Object)productApplyRangeId);
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        this.updateSkuDetailByCondition(productId, productApplyRangeId, skuId, isCreator, productSkuDetailNew, productDetailId);
    }

    @Override
    public void disableProductSKU(Long productId, Long productApplyRangeId, Long skuId, Boolean isCreator) throws Exception {
        ProductSkuDetailNew productSkuDetailNew = new ProductSkuDetailNew();
        productSkuDetailNew.setStopstatus(Boolean.valueOf(true));
        productSkuDetailNew.setStoptime(new Date());
        productSkuDetailNew.setStatus(Boolean.valueOf(false));
        productSkuDetailNew.setStatus_b(Boolean.valueOf(false));
        productSkuDetailNew.setUstatus(Boolean.valueOf(false));
        productSkuDetailNew.setUstatus_b(Boolean.valueOf(false));
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productDetailId", (Object)productApplyRangeId);
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        this.updateSkuDetailByCondition(productId, productApplyRangeId, skuId, isCreator, productSkuDetailNew, productDetailId);
        this.setShelfAndlLnventoryProductSKU(productId, productDetailId, productApplyRangeId, isCreator, true, true);
    }

    @Override
    public void shelfMallProductSKU(Long productId, Long productApplyRangeId, Long skuId, Boolean isCreator) throws Exception {
        ProductSkuDetailNew productSkuDetailNew = new ProductSkuDetailNew();
        productSkuDetailNew.setStatus(Boolean.valueOf(true));
        productSkuDetailNew.setStatus_b(Boolean.valueOf(true));
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productDetailId", (Object)productApplyRangeId);
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        this.updateSkuDetailByCondition(productId, productApplyRangeId, skuId, isCreator, productSkuDetailNew, productDetailId);
        this.setShelfAndlLnventoryProductSKU(productId, productDetailId, productApplyRangeId, isCreator, true, false);
    }

    @Override
    public void shelfUOrderProductSKU(Long productId, Long productApplyRangeId, Long skuId, Boolean isCreator) throws Exception {
        ProductSkuDetailNew productSkuDetailNew = new ProductSkuDetailNew();
        productSkuDetailNew.setUstatus(Boolean.valueOf(true));
        productSkuDetailNew.setUstatus_b(Boolean.valueOf(true));
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productDetailId", (Object)productApplyRangeId);
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        this.updateSkuDetailByCondition(productId, productApplyRangeId, skuId, isCreator, productSkuDetailNew, productDetailId);
        this.setShelfAndlLnventoryProductSKU(productId, productDetailId, productApplyRangeId, isCreator, false, true);
    }

    private void putUserDataInMap(Map<String, Object> map) {
        map.put("ytenant", AppContext.getYTenantId());
        map.put("userId", AppContext.getCurrentUser().getId());
        map.put("userName", AppContext.getCurrentUser().getName());
    }

    @Override
    public void unShelfMallProductSKU(Long productId, Long productApplyRangeId, Long skuId, Boolean isCreator) throws Exception {
        ProductSkuDetailNew productSkuDetailNew = new ProductSkuDetailNew();
        productSkuDetailNew.setStatus(Boolean.valueOf(false));
        productSkuDetailNew.setStatus_b(Boolean.valueOf(false));
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productDetailId", (Object)productApplyRangeId);
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        this.updateSkuDetailByCondition(productId, productApplyRangeId, skuId, isCreator, productSkuDetailNew, productDetailId);
        this.setShelfAndlLnventoryProductSKU(productId, productDetailId, productApplyRangeId, isCreator, true, false);
    }

    @Override
    public void unShelfUOrderProductSKU(Long productId, Long productApplyRangeId, Long skuId, Boolean isCreator) throws Exception {
        ProductSkuDetailNew productSkuDetailNew = new ProductSkuDetailNew();
        productSkuDetailNew.setUstatus(Boolean.valueOf(false));
        productSkuDetailNew.setUstatus_b(Boolean.valueOf(false));
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productDetailId", (Object)productApplyRangeId);
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        this.updateSkuDetailByCondition(productId, productApplyRangeId, skuId, isCreator, productSkuDetailNew, productDetailId);
        this.setShelfAndlLnventoryProductSKU(productId, productDetailId, productApplyRangeId, isCreator, false, true);
    }

    @Override
    public void setShelfAndlLnventoryProductSKU(Long productId, Long productDetailId, Long rangeId, Boolean isCreator, Boolean isUpdateMallCount, Boolean isUpdateUorderCount) throws Exception {
        this.setShelfAndlLnventory(productId, productDetailId, rangeId, isCreator, isUpdateMallCount, isUpdateUorderCount, null);
    }

    private void setShelfAndlLnventory(Long productId, Long productDetailId, Long rangeId, Boolean isCreator, Boolean isUpdateMallCount, Boolean isUpdateUorderCount, ProductDetail productDetailParam) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isSKU").eq((Object)0)});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        List skuInDb = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        Boolean isUpdateInventtoryCount = true;
        if (!CollectionUtils.isEmpty((Collection)skuInDb)) {
            isUpdateInventtoryCount = false;
        }
        if (isUpdateMallCount.booleanValue() || isUpdateUorderCount.booleanValue()) {
            if (null != productDetailParam) {
                productDetailParam.setModifyDate(new Date());
                productDetailParam.setModifyTime(new Date());
                productDetailParam.setModifier(AppContext.getCurrentUser().getName());
                productDetailParam.setModifierId((Long)AppContext.getCurrentUser().getId());
            }
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("productId", productId);
            params.put("productApplyRangeId", rangeId);
            params.put("productDetailId", productDetailId);
            params.put("ytenant", AppContext.getYTenantId());
            ProductExtend productExtend = new ProductExtend();
            productExtend.setId((Object)productId);
            ProductApplyRangeDetail productApplyRangeDetail = new ProductApplyRangeDetail();
            productApplyRangeDetail.setId((Object)rangeId);
            ProductDetail productDetail = new ProductDetail();
            productDetail.setId((Object)productDetailId);
            if (isUpdateMallCount.booleanValue()) {
                UPCProductShelfService.setMallCount(isUpdateInventtoryCount, params, productExtend, productApplyRangeDetail, productDetail);
            }
            if (isUpdateUorderCount.booleanValue()) {
                UPCProductShelfService.setUorderCount(params, productExtend, productApplyRangeDetail, productDetail);
            }
            if (null != productDetailParam) {
                this.putUserDataInMap((Map<String, Object>)productDetailParam);
                productDetail.putAll((Map)productDetailParam);
                productExtend.putAll((Map)productDetailParam);
                productApplyRangeDetail.putAll((Map)productDetailParam);
            }
            productDetail.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"pc.product.ProductDetail", (BizObject)productDetail);
        }
        this.updateBaseModifyTime(productId);
    }

    private static void setUorderCount(Map<String, Object> params, ProductExtend productExtend, ProductApplyRangeDetail productApplyRangeDetail, ProductDetail productDetail) throws Exception {
        ProductDetail batchPriceMap;
        Integer uorderUpCount = (Integer)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.productSkuSelect.selectUorderUpCount", params);
        Integer uorderDownCount = (Integer)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.productSkuSelect.selectUorderDownCount", params);
        if (null != uorderUpCount) {
            productDetail.setUorderupcount(uorderUpCount);
            productExtend.setUorderupcount(uorderUpCount);
            productApplyRangeDetail.setUorderupcount(uorderUpCount);
        }
        if (null != uorderDownCount) {
            productDetail.setUorderdowncount(uorderDownCount);
            productExtend.setUorderdowncount(uorderDownCount);
            productApplyRangeDetail.setUorderdowncount(uorderDownCount);
        }
        if (null != (batchPriceMap = (ProductDetail)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.productSkuSelect.selectBatchPrice", params))) {
            productExtend.setMaxBatchPrice(batchPriceMap.getMaxBatchPrice());
            productExtend.setMinBatchPrice(batchPriceMap.getMinBatchPrice());
            productApplyRangeDetail.setMaxBatchPrice(batchPriceMap.getMaxBatchPrice());
            productApplyRangeDetail.setMinBatchPrice(batchPriceMap.getMinBatchPrice());
            productDetail.setMaxBatchPrice(batchPriceMap.getMaxBatchPrice());
            productDetail.setMinBatchPrice(batchPriceMap.getMinBatchPrice());
        }
    }

    private static void setMallCount(Boolean isUpdateInventtoryCount, Map<String, Object> params, ProductExtend productExtend, ProductApplyRangeDetail productApplyRangeDetail, ProductDetail productDetail) throws Exception {
        Double lInventoryCount;
        Integer mallUpCount = (Integer)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.productSkuSelect.selectMallUpCount", params);
        Integer mallDownCount = (Integer)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.productSkuSelect.selectMallDownCount", params);
        if (null != mallUpCount) {
            productDetail.setMallupcount(mallUpCount);
            productExtend.setMallupcount(mallUpCount);
            productApplyRangeDetail.setMallupcount(mallUpCount);
        }
        if (null != mallDownCount) {
            productDetail.setMalldowncount(mallDownCount);
            productExtend.setMalldowncount(mallDownCount);
            productApplyRangeDetail.setMalldowncount(mallDownCount);
        }
        if (isUpdateInventtoryCount.booleanValue() && null != (lInventoryCount = (Double)SqlHelper.selectOne((String)"com.yonyoucloud.upc.product.dao.productSkuSelect.selectLInventoryCount", params))) {
            BigDecimal bigDecimal = new BigDecimal(lInventoryCount);
            productDetail.setLInventoryCount(bigDecimal);
            productExtend.setLInventoryCount(bigDecimal);
            productApplyRangeDetail.setLInventoryCount(bigDecimal);
        }
    }

    public void checkEnableDisableParam(Object id, Object productApplyRangeId) {
        if (null == id) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801082);
        }
        if (null == productApplyRangeId) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801083);
        }
    }

    private void updateSkuDetailByCondition(Long productId, Long productApplyRangeId, Long skuId, Boolean isCreator, ProductSkuDetailNew updateParam, Long productDetailId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"skuId").eq((Object)skuId), QueryCondition.name((String)"productDetailId").eq((Object)productDetailId)});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        List skuDetailNews = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)skuDetailNews)) {
            Map skuDetailNewInDb = (Map)skuDetailNews.get(0);
            ProductSkuDetailNew productSkuDetailNew = new ProductSkuDetailNew();
            productSkuDetailNew.putAll((Map)updateParam);
            productSkuDetailNew.setId(skuDetailNewInDb.get("id"));
            productSkuDetailNew.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"pc.product.ProductSkuDetailNew", (BizObject)productSkuDetailNew);
        }
    }

    @Override
    public void updateAutoModifyInfo(Long productId, String productApplyRangeId) throws Exception {
        List rangeDetails = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"productDetailId", (Object)productApplyRangeId);
        Long productDetailId = Long.parseLong(((Map)rangeDetails.get(0)).get("productDetailId").toString());
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("productid", productId);
        params.put("productapplyrangeid", productApplyRangeId);
        params.put("id", productDetailId);
        params.put("userId", AppContext.getCurrentUser().getId());
        params.put("userName", AppContext.getCurrentUser().getName());
        params.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductShelf.updateAutoModifyInfo", params);
        this.updateBaseModifyTime(productId);
    }

    private void updateBaseModifyTime(Long productId) throws Exception {
        Product updateProduct = new Product();
        updateProduct.setId((Object)productId);
        updateProduct.setModifyDate(new Date());
        updateProduct.setModifyTime(new Date());
        updateProduct.setModifier(AppContext.getCurrentUser().getName());
        updateProduct.setModifierId((Long)AppContext.getCurrentUser().getId());
        updateProduct.setEntityStatus(EntityStatus.Update);
        MetaDaoHelper.update((String)"pc.product.Product", (BizObject)updateProduct);
    }
}

