/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSKUDetail
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  com.yonyoucloud.upc.pc.product.ProductSkuOrderProperty
 *  com.yonyoucloud.upc.pc.product.SKUOrderProperty
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSKUDetail;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.pc.product.ProductSkuOrderProperty;
import com.yonyoucloud.upc.pc.product.SKUOrderProperty;
import com.yonyoucloud.upc.service.ProductSkuService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="productSkuDetailSaveService")
public class ProductSkuDetailSaveService {
    @Autowired
    GroupService groupService;
    @Autowired
    ProductSkuService productSkuService;

    public void dealSkuDetailExtend(ProductSKU sku, Map range) throws Exception {
        Object productApplyRangeId = range.get("id");
        Object productDetailId = range.get("productDetailId");
        ProductSkuDetailNew skuDetailNew = (ProductSkuDetailNew)sku.productSkuDetailNew().get(0);
        skuDetailNew.setIsCreator(Boolean.valueOf(true));
        List productSkuOrderPropertyList = sku.productSkuOrderProperty();
        if (productSkuOrderPropertyList != null) {
            productSkuOrderPropertyList.forEach(a -> {
                a.setIsCreator(Boolean.valueOf(true));
                a.setProductDetailId(Long.valueOf(Long.parseLong(productDetailId.toString())));
                a.setProductApplyRangeId(Long.valueOf(Long.parseLong(productApplyRangeId.toString())));
            });
        }
    }

    public void dealSkuDetailNewExists(ProductSKU sku, Object productApplyRangeId, Long productDetailId) throws Exception {
        List productSkuOrderPropertyList;
        ProductSkuDetailNew skuDetailNew = (ProductSkuDetailNew)sku.productSkuDetailNew().get(0);
        if (null != productApplyRangeId) {
            skuDetailNew.setProductApplyRangeId(Long.valueOf(Long.parseLong(productApplyRangeId.toString())));
        } else {
            skuDetailNew.remove("productApplyRangeId");
        }
        if (null != skuDetailNew) {
            this.dealSkuDetailNewAndDetailCharacter(sku, productApplyRangeId, productDetailId, skuDetailNew);
        }
        if (!CollectionUtils.isEmpty((Collection)(productSkuOrderPropertyList = sku.productSkuOrderProperty()))) {
            this.dealSkuOrderProperty(sku, productApplyRangeId, productDetailId, productSkuOrderPropertyList);
        }
    }

    private void dealSkuOrderProperty(ProductSKU sku, Object productApplyRangeId, Long productDetailId, List<ProductSkuOrderProperty> productSkuOrderPropertyList) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuId").eq(sku.getId()), QueryCondition.name((String)"productDetailId").eq((Object)productDetailId)});
        QuerySchema schema = QuerySchema.create().addSelect("id, productApplyRangeId, skuId, skuPropertyTypeId").addCondition((ConditionExpression)queryConditionGroup);
        List skuOrderPropertiesDetailInDb = MetaDaoHelper.query((String)"pc.product.ProductSkuOrderProperty", (QuerySchema)schema);
        HashMap skuOrderPropertyInDbMap = new HashMap(8);
        if (!CollectionUtils.isEmpty((Collection)skuOrderPropertiesDetailInDb)) {
            skuOrderPropertiesDetailInDb.forEach(map -> {
                String tempKey = map.get("skuId").toString() + map.get("skuPropertyTypeId").toString();
                skuOrderPropertyInDbMap.put(tempKey, map);
            });
        }
        ArrayList<ProductSkuOrderProperty> productSkuOrderProperties = new ArrayList<ProductSkuOrderProperty>();
        for (ProductSkuOrderProperty propExtend : productSkuOrderPropertyList) {
            ProductSkuOrderProperty prop = new ProductSkuOrderProperty();
            this.exchangeFromExtend(propExtend, prop);
            prop.setProductDetailId(productDetailId);
            String mapKey = sku.getId().toString() + propExtend.getSkuPropertyTypeId();
            if (skuOrderPropertyInDbMap.containsKey(mapKey)) {
                prop.putAll((Map)skuOrderPropertyInDbMap.get(mapKey));
                prop.setId(((Map)skuOrderPropertyInDbMap.get(mapKey)).get("id"));
                prop.setEntityStatus(EntityStatus.Update);
            } else {
                prop.setId((Object)IdManager.getInstance().nextId());
                prop.setProductApplyRangeId(Long.valueOf(Long.parseLong(productApplyRangeId.toString())));
                prop.setEntityStatus(EntityStatus.Insert);
            }
            prop.setProductApplyRangeId(Long.valueOf(Long.parseLong(productApplyRangeId.toString())));
            prop.setProductDetailId(productDetailId);
            prop.setIsCreator(Boolean.valueOf(false));
            productSkuOrderProperties.add(prop);
        }
        sku.setProductSkuOrderProperty(productSkuOrderProperties);
    }

    private void dealSkuDetailNewAndDetailCharacter(ProductSKU sku, Object productApplyRangeId, Long productDetailId, ProductSkuDetailNew skuDetailNew) throws Exception {
        ProductSkuDetailNew productSkuDetailNew = new ProductSkuDetailNew();
        this.exchangeFromExtend(skuDetailNew, productSkuDetailNew);
        productSkuDetailNew.remove("productDetailId");
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuId").eq(sku.getId()), QueryCondition.name((String)"productDetailId").eq((Object)productDetailId)});
        QuerySchema schema = QuerySchema.create().addSelect("productDetailId, id").addCondition((ConditionExpression)queryConditionGroup);
        List skuDetailInDb = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)schema);
        Map skuDetailNewInDb = (Map)skuDetailInDb.get(0);
        if (!CollectionUtils.isEmpty((Collection)skuDetailInDb)) {
            productSkuDetailNew.putAll(skuDetailNewInDb);
            productSkuDetailNew.setEntityStatus(EntityStatus.Update);
        } else {
            productSkuDetailNew.setProductDetailId(productDetailId);
            productSkuDetailNew.setEntityStatus(EntityStatus.Insert);
            productSkuDetailNew.setProductApplyRangeId(Long.valueOf(Long.parseLong(productApplyRangeId.toString())));
            productSkuDetailNew.setId((Object)IdManager.getInstance().nextId());
            productSkuDetailNew.setIsCreator(Boolean.valueOf(false));
        }
        ArrayList<ProductSkuDetailNew> productSkuDetailNews = new ArrayList<ProductSkuDetailNew>();
        productSkuDetailNews.add(productSkuDetailNew);
        sku.setProductSkuDetailNew(productSkuDetailNews);
        this.dealSkuDetailCharacter(productSkuDetailNew, skuDetailNewInDb);
    }

    private void dealSkuDetailCharacter(ProductSkuDetailNew productSkuDetailNew, Map skuDetailNewInDb) {
        Object skuDetailCharacterDef = productSkuDetailNew.get("skuDetailCharacterDef");
        if (null != skuDetailCharacterDef && skuDetailCharacterDef instanceof Map) {
            Map skuDetailCharacterDefMap = (Map)productSkuDetailNew.get("skuDetailCharacterDef");
            skuDetailCharacterDefMap.put("ytenant", AppContext.getYTenantId());
            Object skuDetailCharacterDefInDb = skuDetailNewInDb.get("skuDetailCharacterDef");
            if (null != skuDetailCharacterDefInDb && skuDetailCharacterDefInDb instanceof Map) {
                Object skuDetailCharacterDefId = ((Map)skuDetailCharacterDefInDb).get("id");
                skuDetailCharacterDefMap.put("id", skuDetailCharacterDefId);
                skuDetailCharacterDefMap.put("_status", EntityStatus.Update);
            } else {
                skuDetailCharacterDefMap.put("id", IdManager.getInstance().nextId());
                skuDetailCharacterDefMap.put("_status", EntityStatus.Insert);
            }
        }
    }

    public void dealSkuDetail(ProductSKU sku, Object productApplyRangeId, ProductSkuDetailNew skuDetailNew) throws Exception {
        ProductSKUDetail skuDetail = new ProductSKUDetail();
        if (null != skuDetailNew) {
            this.exchangeFromExtend(skuDetailNew, skuDetail);
        }
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenant", AppContext.getYTenantId());
        params.put("skuId", sku.getId());
        params.put("productApplyRangeId", productApplyRangeId);
        Map productSkuDetailInDb = (Map)SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.ProductSkuExtendAndDetailDoubleWriteDao.selectProductSkuDetailByCondition", params);
        if (productSkuDetailInDb != null && !productSkuDetailInDb.isEmpty()) {
            skuDetail.setId(productSkuDetailInDb.get("id"));
            skuDetail.setEntityStatus(EntityStatus.Update);
            SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductSkuExtendAndDetailDoubleWriteDao.updateProductSkuDetailByPrimaryKey", (Object)skuDetail);
        } else {
            skuDetail.setId((Object)IdManager.getInstance().nextId());
            skuDetail.setEntityStatus(EntityStatus.Insert);
            skuDetail.setProductApplyRangeId(Long.valueOf(Long.parseLong(productApplyRangeId.toString())));
            skuDetail.put("tenant", (Object)AppContext.getCurrentUser().getYxyTenantId());
            skuDetail.put("ytenant", AppContext.getYTenantId());
            SqlHelper.insert((String)"com.yonyoucloud.upc.data.ProductSkuExtendAndDetailDoubleWriteDao.insertProductSkuDetailSelective", (Object)skuDetail);
        }
        List skuOrderPropertiesDetailInDb = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.selectSkuOrderPropertyByCondition", params);
        HashMap skuOrderPropertyInDbMap = new HashMap(8);
        if (!CollectionUtils.isEmpty((Collection)skuOrderPropertiesDetailInDb)) {
            skuOrderPropertiesDetailInDb.forEach(map -> {
                String tempKey = map.get("skuId").toString() + map.get("skuPropertyTypeId").toString();
                skuOrderPropertyInDbMap.put(tempKey, map);
            });
        }
        if (null != sku.productSkuOrderProperty()) {
            for (ProductSkuOrderProperty propExtend : sku.productSkuOrderProperty()) {
                SKUOrderProperty prop = new SKUOrderProperty();
                this.exchangeFromExtend(propExtend, prop);
                String mapKey = sku.getId().toString() + propExtend.getSkuPropertyTypeId();
                if (skuOrderPropertyInDbMap.containsKey(mapKey)) {
                    prop.putAll((Map)skuOrderPropertyInDbMap.get(mapKey));
                    prop.setId(((Map)skuOrderPropertyInDbMap.get(mapKey)).get("id"));
                    prop.setEntityStatus(EntityStatus.Update);
                    SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.updateSkuOrderPropertyByPrimaryKey", (Object)prop);
                    continue;
                }
                prop.setId((Object)IdManager.getInstance().nextId());
                prop.setProductApplyRangeId(Long.valueOf(Long.parseLong(productApplyRangeId.toString())));
                prop.setEntityStatus(EntityStatus.Insert);
                prop.put("tenant", AppContext.getTenantId());
                prop.put("ytenant", AppContext.getYTenantId());
                SqlHelper.update((String)"com.yonyoucloud.upc.data.ProductDoubleWriteDao.insertSkuOrderPropertySelective", (Object)prop);
            }
        }
    }

    public void dealSkuApplyDetailExists(ProductSKU sku, Long productApplyRangeId, Long productDetailId) throws Exception {
        ProductSkuDetailNew skuDetailNew = (ProductSkuDetailNew)sku.productSkuDetailNew().get(0);
        this.dealSkuDetailNewExists(sku, productApplyRangeId, productDetailId);
        sku.setSkuOrderProperties(null);
        sku.setProductSKUDetail(null);
    }

    public List<Map> getUnitByProductId(Object productId, Map data) throws Exception {
        List result = new ArrayList<Map>();
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productId)});
        String selectField = "unit, unit.precision as unit_precision, unit.name as unit_name, unitUseType, productTemplate, weightUnit as weightUnit, weightUnit.precision as weightUnit_precision, weightUnit.name as weightUnit_name, volumeUnit as volumeUnit, volumeUnit.precision as volumeUnit_precision, volumeUnit.name as volumeUnit_name, weight as product_weight, volume as product_volume";
        QuerySchema schema = QuerySchema.create().addSelect(selectField).addCondition((ConditionExpression)queryConditionGroup);
        List productsInDB = this.productSkuService.query("pc.product.Product", schema);
        if (!CollectionUtils.isEmpty((Collection)productsInDB)) {
            Product product = (Product)productsInDB.get(0);
            if (null != data) {
                data.putAll(product);
            }
            Long unit = product.getUnit();
            Short unitUseType = product.getUnitUseType();
            if (null != unitUseType && "1".equals(unitUseType.toString())) {
                queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)product.getProductTemplate())});
                schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
                result = this.productSkuService.query("pc.tpl.ProductTplAssistUnitExchange", schema);
            } else {
                queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId)});
                schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
                result = this.productSkuService.query("pc.product.ProductAssistUnitExchange", schema);
            }
            HashMap<String, Number> map = new HashMap<String, Number>();
            map.put("assistUnit", unit);
            map.put("assistUnitCount", 1);
            map.put("mainUnitCount", 1);
            result.add(map);
        }
        return result;
    }

    public Map getRange(Object productApplyRangeId) throws Exception {
        List ranges = MetaDaoHelper.queryById((String)"pc.product.ProductApplyRange", (String)"*", (Object)productApplyRangeId);
        if (!CollectionUtils.isEmpty((Collection)ranges)) {
            return (Map)ranges.get(0);
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800525);
    }

    public <T1 extends Map, T2 extends Map> void exchangeFromExtend(T1 sourceObj, T2 destObj) {
        for (Map.Entry entry : sourceObj.entrySet()) {
            destObj.put((String)entry.getKey().toString(), entry.getValue());
        }
    }
}

