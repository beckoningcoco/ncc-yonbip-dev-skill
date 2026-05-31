/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.uap.billcode.BillCodeComponentParam
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductCheckFreeExtend
 *  com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSpecItem
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  com.yonyoucloud.upc.utils.RedisLockKeyConstants
 *  com.yonyoucloud.upc.utils.UpcStringUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.uap.billcode.BillCodeComponentParam;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductUpdateService;
import com.yonyoucloud.upc.datarule.ProductTplService;
import com.yonyoucloud.upc.deletelog.DocDeleteLogService;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductCheckFreeExtend;
import com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSpecItem;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.MultilangUtil;
import com.yonyoucloud.upc.utils.RedisLockKeyConstants;
import com.yonyoucloud.upc.utils.UpcStringUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Component(value="productSkuService")
public class ProductSkuService {
    private static final Logger log = LoggerFactory.getLogger(ProductSkuService.class);
    @Autowired
    private IUPCProductUpdateService upcProductUpdateService;
    @Autowired
    ProductTplService productTplService;
    @Autowired
    private EventService2 eventService2;
    @Autowired
    private IBillCodeComponentService iBillCodeComponentService;
    @Autowired
    DocDeleteLogService docDeleteLogService;
    public static Integer CHECKFREE_NO = 1;
    public static Integer CHECKFREE_PARTED_NOIA = 2;
    public static Integer CHECKFREE_ALLED_NOIA = 3;
    public static Integer CHECKFREE_PARTED_PARTIA = 4;
    public static Integer CHECKFREE_ALLED_ALLIA = 5;

    public String getUniqueKeyIds(String id1, String id2) {
        String ids = id1 + ";" + id2;
        return this.getUniqueSpecValIdsString(ids);
    }

    public String getUniqueSpecValIdsString(String specIds) {
        if (StringUtils.isNotEmpty((CharSequence)specIds)) {
            String[] specids = specIds.split(";");
            List<String> ids = Arrays.asList(specids);
            List sortedIds = ids.stream().sorted((a, b) -> {
                int result = StringUtils.compare((String)a, (String)b);
                return result;
            }).collect(Collectors.toList());
            StringBuilder specValIdsString = new StringBuilder();
            for (String id : sortedIds) {
                if (!StringUtils.isNotEmpty((CharSequence)id)) continue;
                specValIdsString.append(id).append(";");
            }
            return specValIdsString.toString();
        }
        return null;
    }

    public List<List<ProductSpecItem>> getSpecItemAssociation(Object productid) throws Exception {
        if (!this.checkSpecCountOfTpl(productid)) {
            return null;
        }
        List<ProductSpecItem> productSpecItems = this.getSpectItemByProductId(productid, null);
        ArrayList<List<ProductSpecItem>> specItemAssociations = new ArrayList<List<ProductSpecItem>>();
        HashMap<Long, List<ProductSpecItem>> specItemsMap = new HashMap<Long, List<ProductSpecItem>>(productSpecItems.size());
        ArrayList<Long> specsByOrder = new ArrayList<Long>();
        for (ProductSpecItem productSpecItem : productSpecItems) {
            List<ProductSpecItem> tempSpecItems;
            Long specId = productSpecItem.getISpecId();
            if (specItemsMap.containsKey(specId)) {
                tempSpecItems = (List)specItemsMap.get(specId);
            } else {
                tempSpecItems = new ArrayList();
                specItemsMap.put(specId, tempSpecItems);
                specsByOrder.add(specId);
            }
            tempSpecItems.add(productSpecItem);
        }
        if (!CollectionUtils.isEmpty(specsByOrder)) {
            this.setSpecItemAssociations(specItemsMap, specsByOrder, 0, specsByOrder.size(), null, specItemAssociations);
        }
        return specItemAssociations;
    }

    private boolean checkSpecCountOfTpl(Object productId) {
        try {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productId)});
            String selectField = "id, productTemplate";
            QuerySchema schema = QuerySchema.create().addSelect(selectField).addCondition((ConditionExpression)queryConditionGroup);
            List products = this.query("pc.product.Product", schema);
            if (CollectionUtils.isEmpty((Collection)products) || null == ((Product)products.get(0)).getProductTemplate()) {
                return false;
            }
            Long productTemplate = ((Product)products.get(0)).getProductTemplate();
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq((Object)productTemplate)});
            schema = QuerySchema.create().addSelect("specification").addCondition((ConditionExpression)queryConditionGroup).distinct();
            List productTplSpecs = this.query("pc.tpl.ProductTplSpec", schema);
            if (CollectionUtils.isEmpty((Collection)productTplSpecs)) {
                return false;
            }
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId)});
            schema = QuerySchema.create().addSelect("iSpecId").addCondition((ConditionExpression)queryConditionGroup).distinct();
            List productSpecItems = this.query("pc.product.ProductSpecItem", schema);
            if (CollectionUtils.isEmpty((Collection)productSpecItems)) {
                return false;
            }
            if (productSpecItems.size() == productTplSpecs.size()) {
                return true;
            }
        }
        catch (Exception e) {
            return false;
        }
        return false;
    }

    public List<ProductSpecItem> getSpectItemByProductId(Object productId, Boolean isShowSpec) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId)});
        if (null != isShowSpec) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"iSpecId.isShowSpec").eq((Object)isShowSpec));
        }
        String selectField = "productId, iOrder, iSpecId, lsSpecItems_id, specValue, iSpecId.showItem as showItem, iSpecId.defineId as defineId, iSpecId.isShowSpec as isShowSpec, lsSpecItems_id.code as specCode";
        QuerySchema schema = QuerySchema.create().addSelect(selectField).addCondition((ConditionExpression)queryConditionGroup).addOrderBy("iOrder");
        List productSpecItems = this.query("pc.product.ProductSpecItem", schema);
        return productSpecItems;
    }

    public void setSpecItemAssociations(Map<Long, List<ProductSpecItem>> specItemsMap, List<Long> specsByOrder, int level, int size, List<ProductSpecItem> specItemAssociation, List<List<ProductSpecItem>> specItemAssociations) {
        List<ProductSpecItem> productSpecItems = specItemsMap.get(specsByOrder.get(level));
        ++level;
        for (ProductSpecItem specItem : productSpecItems) {
            ArrayList<ProductSpecItem> specItemAssociationTemp = new ArrayList<ProductSpecItem>();
            if (null != specItemAssociation) {
                specItemAssociationTemp.addAll(specItemAssociation);
            }
            specItemAssociationTemp.add(specItem);
            if (level < size) {
                this.setSpecItemAssociations(specItemsMap, specsByOrder, level, size, specItemAssociationTemp, specItemAssociations);
                continue;
            }
            specItemAssociations.add(specItemAssociationTemp);
        }
    }

    public ProductSKU queryDefaultSku(Long productId) throws Exception {
        QueryConditionGroup querySkuGroup = new QueryConditionGroup();
        querySkuGroup.addCondition(new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isSKU").eq((Object)0)});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)querySkuGroup);
        List skusInDb = this.query("pc.product.ProductSKU", schema);
        if (!CollectionUtils.isEmpty((Collection)skusInDb)) {
            return (ProductSKU)skusInDb.get(0);
        }
        return null;
    }

    public List<ProductCheckFreeExtend> getAllCheckFree(Long productId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isCreator").eq((Object)true)});
        QuerySchema schema = QuerySchema.create().addSelect("freeType, freeId, checked, freeId.defineId as defineId").addCondition((ConditionExpression)queryConditionGroup);
        return this.query("pc.product.ProductCheckFreeNew", schema);
    }

    public void deleteSkuById(Object skuId, Object productId) throws Exception {
        this.checkSkuDel(skuId, productId);
        this.docDeleteLogService.insertDeleteLog("pc.product.ProductSKU", skuId.toString(), null);
        MetaDaoHelper.delete((String)"pc.product.ProductSKU", (Long)Long.parseLong(skuId.toString()));
    }

    public void checkSkuDel(Object skuId, Object productId) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId), QueryCondition.name((String)"isCreator").eq((Object)true)}));
        Map range = MetaDaoHelper.queryOne((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        ProductUtil.checkCanDelSKU(Long.parseLong(skuId.toString()), Long.parseLong(range.get("id").toString()));
    }

    public void setSKUDefaultValue(Product product, ProductSKU sku, AtomicInteger maxCode, BillCodeContext billCodeContext) throws Exception {
        if (StringUtils.isEmpty((CharSequence)sku.getCode()) && billCodeContext.getBillnumMode() == 0) {
            sku.setCode(this.getSkuCodeByFlowing(product.getCode(), maxCode));
        }
        String productName = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, null);
        Object skuNameObj = sku.get("name") instanceof String ? (String)MultilangUtil.getAttr((String)"pc.product.ProductSKU", (String)"name", (BizObject)sku, null) : sku.get("name");
        String nameSpacer = "";
        if (ObjectUtils.isEmpty((Object)skuNameObj)) {
            String skuName = "";
            Map templateMap = new HashMap();
            try {
                QuerySchema schema = QuerySchema.create().addSelect("involveSKUNaming,nameSpacer").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)product.getProductTemplate())}));
                templateMap = MetaDaoHelper.queryOne((String)"pc.tpl.ProductTpl", (QuerySchema)schema);
            }
            catch (Exception e) {
                log.error(e.getMessage(), (Throwable)e);
            }
            skuName = templateMap.isEmpty() || (Boolean)templateMap.get("involveSKUNaming") != false ? productName : "";
            if (!templateMap.isEmpty() && templateMap.containsKey("nameSpacer") && templateMap.get("nameSpacer") != null) {
                nameSpacer = ProductUtil.convertNameSpacer(templateMap.get("nameSpacer").toString());
            }
            try {
                skuName = skuName + ProductUtil.getSKUNameModelByProductId(product.getProductTemplate(), sku, nameSpacer);
            }
            catch (Exception e) {
                log.error(e.getMessage(), (Throwable)e);
            }
            sku.setName(skuName);
        } else {
            try {
                ProductUtil.getSKUNameModelByProductId(product.getProductTemplate(), sku, nameSpacer);
            }
            catch (Exception e) {
                log.error(e.getMessage(), (Throwable)e);
            }
        }
        String skuModel = (String)MultilangUtil.getAttr((String)"pc.product.ProductSKU", (String)"model", (BizObject)sku, null);
        String skuModelDescription = (String)MultilangUtil.getAttr((String)"pc.product.ProductSKU", (String)"modelDescription", (BizObject)sku, null);
        if (StringUtils.isEmpty((CharSequence)skuModelDescription)) {
            sku.put("modelDescription", product.get("modelDescription"));
        }
        if (StringUtils.isEmpty((CharSequence)skuModel)) {
            sku.put("model", product.get("model"));
        }
        sku.setIsSKU(Integer.valueOf(1));
    }

    public String getSkuCodeByFlowing(String productCode, AtomicInteger maxCode) {
        Integer val = maxCode.addAndGet(1);
        if (val > 9999) {
            return productCode + val.toString();
        }
        return productCode + StringUtils.leftPad((String)val.toString(), (int)4, (char)'0');
    }

    public List query(String fullname, QuerySchema schema) throws Exception {
        List datas = MetaDaoHelper.query((String)fullname, (QuerySchema)schema);
        ArrayList<BizObject> resultDatas = new ArrayList<BizObject>();
        if (!CollectionUtils.isEmpty((Collection)datas)) {
            for (Map data : datas) {
                resultDatas.add(Objectlizer.convert((Map)data, (String)fullname));
            }
        }
        return resultDatas;
    }

    public void updateProductDefaultSku(Object productId) throws Exception {
        Product productSave = new Product();
        productSave.setEntityStatus(EntityStatus.Update);
        productSave.setId(productId);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId), QueryCondition.name((String)"isSKU").eq((Object)0)});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        List defaultSkuInDb = this.query("pc.product.ProductSKU", schema);
        if (!CollectionUtils.isEmpty((Collection)defaultSkuInDb)) {
            this.deleteSkuById(((ProductSKU)defaultSkuInDb.get(0)).getId(), productId);
            productSave.setDefaultSKUId(null);
            productSave.setHasSpecs(Boolean.valueOf(true));
            MetaDaoHelper.update((String)"pc.product.Product", (BizObject)productSave);
        } else {
            queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productId)});
            schema = QuerySchema.create().addSelect("hasSpecs").addCondition((ConditionExpression)queryConditionGroup);
            List products = this.query("pc.product.Product", schema);
            if (null == ((Product)products.get(0)).getHasSpecs() || !((Product)products.get(0)).getHasSpecs().booleanValue()) {
                productSave.setHasSpecs(Boolean.valueOf(true));
                MetaDaoHelper.update((String)"pc.product.Product", (BizObject)productSave);
            }
        }
    }

    public void dealRealmParam(Product product) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"isSKU").eq((Object)0)}));
        List skus = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)skus)) {
            product.put("defaultSKUId", ((Map)skus.get(0)).get("id"));
            product.put("productSpecFrees", null);
        } else {
            HashMap<String, Object> param = new HashMap<String, Object>(2);
            param.put("ytenant", AppContext.getYTenantId());
            param.put("productId", product.getId());
            List specItems = SqlHelper.selectList((String)"com.yonyoucloud.upc.product.dao.ProductSKUSpecItem.specItems", param);
            product.put("specItems_", (Object)specItems);
            List specFrees = MetaDaoHelper.query((String)"pc.product.ProductCheckFreeNew", (QuerySchema)QuerySchema.create().addSelect(new String[]{"checked", "freeId", "freeId.showItem as freeId_Name", "freeId.defineId as freeId_DefineId", "freeType"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.get("id")), QueryCondition.name((String)"isCreator").eq((Object)true)})));
            product.put("productSpecFrees", (Object)specFrees);
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId())});
            schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
            List productSpecItems = this.query("pc.product.ProductSpecItem", schema);
            product.setProductspecitems(productSpecItems);
        }
    }

    public void sendEvent(Map<String, Object> eventMap) throws Exception {
        EventType eventType = EventType.find("pc_product", "save", "SKUUpdate");
        HashMap<String, Object> businessObject = new HashMap<String, Object>();
        businessObject.put("fullname", "pc.product.ProductSKU");
        businessObject.putAll(eventMap);
        try {
            this.eventService2.sendEvent("YXYBASEDOC", eventType.toString(), businessObject);
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805A1", (String)"\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25"), (Throwable)e);
        }
    }

    public void sendDeleteEvent(Map<String, Object> eventMap) throws Exception {
        EventType eventType = EventType.find("pc_product", "skudelete", "SKUDelete");
        HashMap<String, Object> businessObject = new HashMap<String, Object>();
        businessObject.put("fullname", "pc.product.ProductSKU");
        businessObject.putAll(eventMap);
        try {
            this.eventService2.sendEvent("YXYBASEDOC", eventType.toString(), businessObject);
        }
        catch (Exception e) {
            log.error(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040805A1", (String)"\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25"), (Throwable)e);
        }
    }

    public void updateCount(Product product) throws Exception {
        HashMap<String, Object> params = new HashMap<String, Object>(8);
        params.put("productid", product.getId());
        params.put("tenantid", AppContext.getCurrentUser().getTenant());
        params.put("productapplyrangeid", product.get("productApplyRangeId"));
        this.upcProductUpdateService.UpdateUpDownCountOfCreator(params);
    }

    public void checkFieldBySku(Object productId, String fieldKey) throws Exception {
        int skuCount;
        Map map;
        QuerySchema schema = QuerySchema.create().addSelect("count(1) as skuCount").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId), QueryCondition.name((String)"isSKU").eq((Object)1)}));
        List skuCounts = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)skuCounts) && (map = (Map)skuCounts.get(0)) != null && !map.isEmpty() && null != map.get("skuCount") && (skuCount = Integer.parseInt(map.get("skuCount").toString())) > 0) {
            if ("productTemplate_Name".equals(fieldKey)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800836);
            }
            if ("useSku".equals(fieldKey)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800837);
            }
        }
    }

    public ProductSKU setSkuExistsLock(String specIds, Object productId) throws Exception {
        String freeValueIdsMd5 = this.getFreeValueIdsMd5(specIds, productId);
        ProductSKU skuExists = this.getSkuExists(specIds, productId);
        if (null != skuExists) {
            return skuExists;
        }
        String lockKey = this.getProductSkuLockKey(productId, freeValueIdsMd5);
        String requestId = UUID.randomUUID().toString();
        this.getLockByKey(lockKey, requestId);
        skuExists = this.getSkuExists(specIds, productId);
        if (null != skuExists) {
            RedisTool.releaseLock((String)lockKey, (String)requestId);
        }
        return skuExists;
    }

    public String getProductSkuLockKey(Object productId, String freeValueIdsMd5) {
        return RedisLockKeyConstants.PRODUCT_SKU_UNIQUE + productId + RedisLockKeyConstants.CONACTOR + freeValueIdsMd5;
    }

    public ProductSKU getSkuExists(String specIds, Object productId) throws Exception {
        String freeValueIdsMd5 = this.getFreeValueIdsMd5(specIds, productId);
        this.repairSkuMd5(productId);
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId), QueryCondition.name((String)"isSKU").eq((Object)1), QueryCondition.name((String)"freeValueIdsMd5").eq((Object)freeValueIdsMd5)});
        QuerySchema schema = QuerySchema.create().addSelect("id, specIds, freeValueIdsMd5, code, name").addCondition((ConditionExpression)queryConditionGroup);
        List skuInDb = this.query("pc.product.ProductSKU", schema);
        if (!CollectionUtils.isEmpty((Collection)skuInDb)) {
            return (ProductSKU)skuInDb.get(0);
        }
        return null;
    }

    public void repairSkuMd5(Object productId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId), QueryCondition.name((String)"isSKU").eq((Object)1), QueryCondition.name((String)"freeValueIdsMd5").is_null()});
        QuerySchema schema = QuerySchema.create().addSelect("id, specIds").addCondition((ConditionExpression)queryConditionGroup);
        List skus = this.query("pc.product.ProductSKU", schema);
        ArrayList<ProductSKU> updateSkus = new ArrayList<ProductSKU>();
        int num = 0;
        if (!CollectionUtils.isEmpty((Collection)skus)) {
            for (ProductSKU sku : skus) {
                sku.setFreeValueIdsMd5(this.getFreeValueIdsMd5(sku.getSpecIds(), productId));
                sku.setEntityStatus(EntityStatus.Update);
                updateSkus.add(sku);
                if (++num != 500) continue;
                MetaDaoHelper.update((String)"pc.product.ProductSKU", updateSkus);
                updateSkus.clear();
                num = 0;
            }
            if (!CollectionUtils.isEmpty(updateSkus)) {
                MetaDaoHelper.update((String)"pc.product.ProductSKU", updateSkus);
            }
        }
    }

    public List<ProductSpecItem> getProductSpecByProductIdAndSpecs(List<ProductSpecItem> specItems, long productId) throws Exception {
        if (CollectionUtils.isEmpty(specItems)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800838);
        }
        ArrayList<Long> specIds = new ArrayList<Long>();
        ArrayList<Long> specItemIds = new ArrayList<Long>();
        for (ProductSpecItem item : specItems) {
            specIds.add(item.getISpecId());
            specItemIds.add(item.getLsSpecItems_id());
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"iSpecId").in(specIds), QueryCondition.name((String)"lsSpecItems_id").in(specItemIds)});
        QuerySchema schema = QuerySchema.create().addSelect("id, productId, iSpecId, lsSpecItems_id").addCondition((ConditionExpression)queryConditionGroup);
        return this.query("pc.product.ProductSpecItem", schema);
    }

    public List<ProductFreeCharacterItem> getProductFreeCharacterItemsByProductId(List<ProductFreeCharacterItem> characterItems, long productId) throws Exception {
        if (CollectionUtils.isEmpty(characterItems)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800838);
        }
        ArrayList<Long> chracterIds = new ArrayList<Long>();
        ArrayList<String> chractervalueIds = new ArrayList<String>();
        for (ProductFreeCharacterItem item : characterItems) {
            chracterIds.add(item.getCharacterId());
            chractervalueIds.add(item.getCharacterValueId());
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"characterId").in(chracterIds), QueryCondition.name((String)"characterValueId").in(chractervalueIds)});
        QuerySchema schema = QuerySchema.create().addSelect("id, productId, characterId, characterValueId").addCondition((ConditionExpression)queryConditionGroup);
        return this.query("pc.product.ProductFreeCharacterItem", schema);
    }

    public String getFreeValueIdsMd5(String specIds, Object productId) {
        if (StringUtils.isNotEmpty((CharSequence)specIds)) {
            String[] idsArray = specIds.split(";");
            List<String> idList = Arrays.asList(idsArray);
            ArrayList<String> ids = new ArrayList<String>(idList);
            ids.add(productId.toString());
            return UpcStringUtil.sortStrMd5(ids);
        }
        return null;
    }

    public void getLockByKey(final String lockKey, final String requestId) throws Exception {
        int tryLockNum = 0;
        while (true) {
            if (tryLockNum > 60) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800839);
            }
            ++tryLockNum;
            if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)10)) break;
            TimeUnit.MILLISECONDS.sleep(200L);
        }
        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

            public void afterCompletion(int status) {
                RedisTool.releaseLock((String)lockKey, (String)requestId);
            }
        });
    }

    public void checkSkuCodeUniqueOne(String skuCode, Object skuId, Object productId) throws Exception {
        QuerySchema schema;
        List skusInDb;
        Object checkType = OptionUtils.getSysOptionByName((String)"sku_code_global_unique");
        boolean isGlobalUnique = false;
        if (null != checkType && Boolean.parseBoolean(checkType.toString())) {
            isGlobalUnique = true;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_eq(skuId), QueryCondition.name((String)"code").eq((Object)skuCode)});
        if (!isGlobalUnique) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").eq(productId));
        }
        if (!CollectionUtils.isEmpty((Collection)(skusInDb = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)(schema = QuerySchema.create().addSelect("1").addCondition((ConditionExpression)queryConditionGroup)))))) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800840, new Object[]{skuCode});
        }
    }

    public void checkSkuCodeUniqueBatch(List<ProductSKU> productskus, long productId) throws Exception {
        if (CollectionUtils.isEmpty(productskus)) {
            return;
        }
        Object checkType = OptionUtils.getSysOptionByName((String)"sku_code_global_unique");
        boolean isGlobalUnique = false;
        if (null != checkType && Boolean.parseBoolean(checkType.toString())) {
            isGlobalUnique = true;
        }
        this.checkSkuCodeByProdutId(productId);
        ArrayList<String> skuCodes = new ArrayList<String>();
        int circleCount = 0;
        if (isGlobalUnique) {
            for (ProductSKU sku : productskus) {
                skuCodes.add(sku.getCode());
                if (++circleCount <= 500) continue;
                circleCount = 0;
                this.checkSkuCodeUniqueProductId(skuCodes, productId);
                skuCodes.clear();
            }
        }
        if (isGlobalUnique && !CollectionUtils.isEmpty(skuCodes)) {
            this.checkSkuCodeUniqueProductId(skuCodes, productId);
        }
    }

    private void checkSkuCodeByProdutId(long productId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId)});
        QuerySchema schema = QuerySchema.create().addSelect("code, id").addCondition((ConditionExpression)queryConditionGroup).addPager(1, UPCConstants.USERDEF_PAGE_SIZE.intValue());
        List skusInDb = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)skusInDb)) {
            HashMap<String, String> skuInProductMap = new HashMap<String, String>(skusInDb.size());
            for (Map data : skusInDb) {
                if (null == data.get("code")) continue;
                String skuCode = data.get("code").toString();
                if (skuInProductMap.containsKey(skuCode)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800840, new Object[]{skuCode});
                }
                skuInProductMap.put(skuCode, skuCode);
            }
        }
    }

    public void checkSkuCodeUniqueProductId(List<String> skuCodes, Long productId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").in(skuCodes), QueryCondition.name((String)"productId").not_eq((Object)productId)});
        QuerySchema schema = QuerySchema.create().addSelect("code").addCondition((ConditionExpression)queryConditionGroup);
        List skusInDb = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)skusInDb)) {
            ArrayList<String> codeList = new ArrayList<String>(skusInDb.size());
            for (Map data : skusInDb) {
                if (null == data.get("code")) continue;
                codeList.add(data.get("code").toString());
            }
            String codesStr = StringUtils.join(codeList, (String)",");
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800840, new Object[]{codesStr});
        }
    }

    public boolean isSkuSens(Object productId) throws Exception {
        boolean result = false;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productId)});
        QuerySchema schema = QuerySchema.create().addSelect("productTemplate").addCondition((ConditionExpression)queryConditionGroup);
        List products = this.query("pc.product.Product", schema);
        if (CollectionUtils.isEmpty((Collection)products)) {
            return result;
        }
        if (null == ((Product)products.get(0)).getProductTemplate()) {
            return result;
        }
        result = this.productTplService.isSkuSens(((Product)products.get(0)).getProductTemplate());
        if (result) {
            this.updateProductDefaultSku(productId);
        }
        return result;
    }

    public void returnSkuCodes(String[] billCodes) {
        String skuAutoCodeNum = "pc_product|productskus#code";
        String busObjCode = "productcenter." + skuAutoCodeNum;
        BillCodeComponentParam billingCodeComponentParam = new BillCodeComponentParam(busObjCode, skuAutoCodeNum, (String)AppContext.getYTenantId(), null, billCodes);
        this.iBillCodeComponentService.returnBatchBillCodes(billingCodeComponentParam);
    }
}

