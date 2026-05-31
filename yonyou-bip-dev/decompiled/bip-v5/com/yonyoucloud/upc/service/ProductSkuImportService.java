/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.yonbip.iuap.xport.common.ImportDataSaveStrategy
 *  com.yonyoucloud.upc.pc.product.CharacteristicsTypeEnum
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSource
 *  com.yonyoucloud.upc.pc.product.SkuAutoCodeFieldEnum
 *  com.yonyoucloud.upc.pc.product.SkuFreeCharacterItem
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.yonbip.iuap.xport.common.ImportDataSaveStrategy;
import com.yonyoucloud.upc.billrule.product.ProductSKUAutoCodeRule;
import com.yonyoucloud.upc.cache.BizCache;
import com.yonyoucloud.upc.pc.product.CharacteristicsTypeEnum;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSource;
import com.yonyoucloud.upc.pc.product.SkuAutoCodeFieldEnum;
import com.yonyoucloud.upc.pc.product.SkuFreeCharacterItem;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import com.yonyoucloud.upc.service.ProductSkuCharacterService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.utils.CoredocDataSourceUtils;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="productSkuImportService")
public class ProductSkuImportService {
    private static final Logger log = LoggerFactory.getLogger(ProductSkuImportService.class);
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;
    @Autowired
    private IBillCodeComponentService billCodeComponentService;
    @Autowired
    ProductSKUAutoCodeRule productSKUAutoCodeRule;
    @Autowired
    ProductSkuCharacterService productSkuCharacterService;
    @Autowired
    BizCache cache;

    public void dealCharacters(ProductSKU sku, long productTemplate, Product product) throws Exception {
        this.dealCharacters(sku, productTemplate, product, ImportDataSaveStrategy.UPSERT);
    }

    public void dealCharacters(ProductSKU sku, long productTemplate, Product product, ImportDataSaveStrategy saveStrategy) throws Exception {
        this.dealFreeCharacterValues(sku, productTemplate, product, saveStrategy);
    }

    private void dealFreeCharacterValues(ProductSKU sku, long productTemplate, Product product, ImportDataSaveStrategy saveStrategy) throws Exception {
        sku.setIsSKU(Integer.valueOf(1));
        Object skuFreeCharacter = sku.get("skuFreeCharacter");
        if (null == skuFreeCharacter) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801480);
        }
        List<ProductFreeCharacterItem> productFreeCharacterItems = this.productSkuCharacterService.getCharacterDataFromCharacteristics("pc.product.SkuFreeCharacter", (BizObject)skuFreeCharacter, null, productTemplate, CharacteristicsTypeEnum.IFreeCT);
        String specIds = "";
        String specs = "";
        String specCode = "";
        int len = productFreeCharacterItems.size();
        int cycleIndex = 1;
        String skuName = "";
        String skuNameAuto = "";
        Object involveSKUNaming = product.get("involveSKUNaming");
        if (null != involveSKUNaming && Boolean.parseBoolean(involveSKUNaming.toString())) {
            skuName = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, null);
        }
        String nameSpacer = ProductUtil.getNameSpacerBytemplateId(productTemplate);
        for (ProductFreeCharacterItem item : productFreeCharacterItems) {
            String characterNme = (String)item.get("characterNme");
            String characterValueId = item.getCharacterValueId();
            String characterValue = (String)item.get("value");
            specs = specs + characterNme + ":" + characterValue + ";";
            if (!StringUtils.isEmpty((CharSequence)skuName)) {
                skuName = skuName + nameSpacer;
            }
            skuName = skuName + characterValue;
            skuNameAuto = skuNameAuto + characterValue;
            specCode = specCode + item.getCode();
            if (cycleIndex == len) {
                specIds = specIds + characterValueId;
                continue;
            }
            specIds = specIds + characterValueId + ";";
        }
        sku.setSpecIds(specIds);
        sku.setFreeValueIds(specIds);
        sku.setIsSKU(Integer.valueOf(1));
        ProductSKU skuInDb = this.productSkuService.setSkuExistsLock(sku.getSpecIds(), product.getId());
        if (null != skuInDb) {
            if (CoredocDataSourceUtils.isFromExcelImport((Map)sku).booleanValue() && ImportDataSaveStrategy.INSERT_ONLY.equals((Object)saveStrategy)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MATERIAL_SKU_EXISTS);
            }
            sku.setEntityStatus(EntityStatus.Update);
            sku.setId(skuInDb.getId());
            sku.setFreeValueIdsMd5(skuInDb.getFreeValueIdsMd5());
            if (null == sku.getCode()) {
                sku.setCode(skuInDb.getCode());
            }
            if (null == sku.get("name")) {
                sku.put("name", (Object)skuInDb.getName());
            }
        } else {
            if (CoredocDataSourceUtils.isFromExcelImport((Map)sku).booleanValue() && ImportDataSaveStrategy.UPDATE_ONLY.equals((Object)saveStrategy)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MATERIAL_SKU_NOT_EXISTS);
            }
            sku.setSource(sku.getSource() == null ? ProductSource.ExcelImport : sku.getSource());
            sku.setEntityStatus(EntityStatus.Insert);
            sku.setId((Object)IdManager.getInstance().nextId());
            sku.setSpecs(specs);
            sku.setSpecNames(specs);
            sku.set(SkuAutoCodeFieldEnum.skuAutoCode.getFieldName(), (Object)skuNameAuto);
            sku.set(SkuAutoCodeFieldEnum.specCode.getFieldName(), (Object)specCode);
            sku.setProductId(Long.valueOf(Long.parseLong(product.getId().toString())));
            if (sku.get("modelDescription") == null) {
                sku.put("modelDescription", product.get("modelDescription"));
            }
            if (null == sku.get("name")) {
                if (skuName.length() > 255) {
                    sku.setName(skuName.substring(0, 255));
                } else {
                    sku.setName(skuName);
                }
            } else {
                Object name = sku.get("name");
                if (name instanceof BizObject) {
                    BizObject skuNameLang = (BizObject)sku.get("name");
                    String skuNameLocal = (String)MultilangUtil.getAttr((String)"pc.product.ProductSKU", (String)"name", (BizObject)sku, null);
                    if (StringUtils.isEmpty((CharSequence)skuNameLocal)) {
                        skuNameLang.set(InvocationInfoProxy.getLocale(), (Object)skuName);
                    }
                }
            }
            sku.setFreeValueIdsMd5(this.productSkuService.getFreeValueIdsMd5(specIds, product.getId()));
            BillCodeContext billCodeContext = this.billCodeComponentService.getBillCodeContext("pc_product|productskus#code", AppContext.getCurrentUser().getYhtTenantId(), "");
            Integer billnumMode = billCodeContext.getBillnumMode();
            if (billnumMode == null || billnumMode != null && Integer.parseInt(billnumMode.toString()) == 0) {
                if (sku.getCode() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801476);
                }
            } else {
                ArrayList<ProductSKU> skus = new ArrayList<ProductSKU>();
                skus.add(sku);
                Product productSave = new Product();
                productSave.setId(product.getId());
                productSave.setProductskus(skus);
                productSave.setEntityStatus(EntityStatus.Insert);
                this.productSKUAutoCodeRule.skuBatchAutoCode(productSave, billnumMode);
            }
            ArrayList<SkuFreeCharacterItem> skuFreeCharacterItems = new ArrayList<SkuFreeCharacterItem>();
            this.dealProductFreeCharacterItems(productFreeCharacterItems, (Long)product.getId());
            for (ProductFreeCharacterItem productFreeCharacterItem : productFreeCharacterItems) {
                SkuFreeCharacterItem skuFreeCharacterItem = new SkuFreeCharacterItem();
                skuFreeCharacterItem.setId((Object)(IdManager.getInstance().nextId() + ""));
                skuFreeCharacterItem.setEntityStatus(EntityStatus.Insert);
                skuFreeCharacterItem.setProductId((Long)product.getId());
                skuFreeCharacterItem.setSkuId((Long)sku.getId());
                skuFreeCharacterItem.setCharacterCode(productFreeCharacterItem.getCharacterCode());
                skuFreeCharacterItem.setCharacteristicsId(productFreeCharacterItem.getCharacteristicsId());
                skuFreeCharacterItem.setCharacterId(productFreeCharacterItem.getCharacterId());
                skuFreeCharacterItem.setCharacterValueId(productFreeCharacterItem.getCharacterValueId());
                skuFreeCharacterItem.setProductFreeCharacterItemId(productFreeCharacterItem.getId().toString());
                skuFreeCharacterItem.setSkuId((Long)sku.getId());
                skuFreeCharacterItems.add(skuFreeCharacterItem);
            }
            sku.setSkufreecharacteritems(skuFreeCharacterItems);
        }
    }

    public void dealProductFreeCharacterItems(List<ProductFreeCharacterItem> productFreeCharacterItems, Long productId) throws Exception {
        String key;
        List<ProductFreeCharacterItem> productFreeCharacterItemsInDb = this.productSkuService.getProductFreeCharacterItemsByProductId(productFreeCharacterItems, productId);
        ArrayList<ProductFreeCharacterItem> productSpecItemsInsert = new ArrayList<ProductFreeCharacterItem>();
        HashMap<String, ProductFreeCharacterItem> itemsInDbMap = new HashMap<String, ProductFreeCharacterItem>(productFreeCharacterItemsInDb.size());
        if (!CollectionUtils.isEmpty(productFreeCharacterItemsInDb)) {
            for (ProductFreeCharacterItem item : productFreeCharacterItemsInDb) {
                key = productId + "-" + item.getCharacterId() + "-" + item.getCharacterValueId();
                itemsInDbMap.put(key, item);
            }
        }
        for (ProductFreeCharacterItem item : productFreeCharacterItems) {
            key = productId + "-" + item.getCharacterId() + "-" + item.getCharacterValueId();
            if (itemsInDbMap.containsKey(key)) {
                item.setId(((ProductFreeCharacterItem)itemsInDbMap.get(key)).getId());
                continue;
            }
            String id = AppContext.cache().get(key);
            if (StringUtils.isEmpty((CharSequence)id)) {
                id = IdManager.getInstance().nextId() + "";
                AppContext.cache().set(key, id, 3600);
                item.setEntityStatus(EntityStatus.Insert);
                item.setId((Object)id);
                productSpecItemsInsert.add(item);
            } else {
                item.setId((Object)id);
            }
            item.setProductId(productId);
            item.setHaveImg(Integer.valueOf(0));
            if (null != item.getIOrder()) continue;
            item.setIOrder(Integer.valueOf(1));
        }
        if (!CollectionUtils.isEmpty(productSpecItemsInsert)) {
            MetaDaoHelper.insert((String)"pc.product.ProductFreeCharacterItem", productSpecItemsInsert);
        }
    }
}

