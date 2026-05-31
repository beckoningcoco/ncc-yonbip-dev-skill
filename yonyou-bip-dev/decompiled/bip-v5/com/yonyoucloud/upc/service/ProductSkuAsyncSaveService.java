/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  com.yonyoucloud.upc.pc.product.ProductSkuOrderProperty
 *  com.yonyoucloud.upc.pc.product.ProductSource
 *  com.yonyoucloud.upc.pc.product.SkuAutoCodeFieldEnum
 *  com.yonyoucloud.upc.pc.product.SkuFreeCharacterItem
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  com.yonyoucloud.upc.utils.RedisLockKeyConstants
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
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationAdapter
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.billrule.goodsAchive.ProductSKUShelveRule;
import com.yonyoucloud.upc.billrule.product.ProductDefaultSKURule;
import com.yonyoucloud.upc.billrule.product.ProductSKUAutoCodeRule;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.pc.product.ProductFreeCharacterItem;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.pc.product.ProductSkuOrderProperty;
import com.yonyoucloud.upc.pc.product.ProductSource;
import com.yonyoucloud.upc.pc.product.SkuAutoCodeFieldEnum;
import com.yonyoucloud.upc.pc.product.SkuFreeCharacterItem;
import com.yonyoucloud.upc.service.BillruleregisterCoreService;
import com.yonyoucloud.upc.service.ProductSkuCharacterService;
import com.yonyoucloud.upc.service.ProductSkuDetailSaveService;
import com.yonyoucloud.upc.service.ProductSkuRealmService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.utils.CoredocDataSourceUtils;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.MultilangUtil;
import com.yonyoucloud.upc.utils.RedisLockKeyConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Service(value="productSkuAsyncSaveService")
public class ProductSkuAsyncSaveService {
    private static final Logger log = LoggerFactory.getLogger(ProductSkuAsyncSaveService.class);
    private static Logger logger = LoggerFactory.getLogger(ProductSkuAsyncSaveService.class);
    private static final Set<String> nonUpdateFields = new HashSet<String>();
    private static final List<String> blankKeyList;
    @Autowired
    ProductSKUAutoCodeRule productSKUAutoCodeRule;
    @Autowired
    BillruleregisterCoreService billruleregisterCoreService;
    @Autowired
    ProductDefaultSKURule productDefaultSKURule;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ProductSkuRealmService productSkuRealmService;
    @Autowired
    ProductSkuDetailSaveService productSkuDetailSaveService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    @Qualifier(value="ymsExecutorService")
    private ExecutorService ymsExecutorService;
    @Autowired
    ProductSkuCharacterService productSkuCharacterService;
    @Autowired
    ProductSKUShelveRule productSKUShelveRule;

    public void saveProductSkuAsync(Product product, Object billnumMode) throws Exception {
        Object id = product.getId();
        List<ProductDetail> productDetails = this.getAllProductDetailByRange(id, product.get("productApplyRangeId"));
        if (CollectionUtils.isEmpty(productDetails)) {
            return;
        }
        String productName = this.getProductName(product);
        List<List<ProductFreeCharacterItem>> freeItemAssociations = this.getSpecItemAssociation(id);
        if (CollectionUtils.isEmpty(freeItemAssociations)) {
            return;
        }
        AtomicInteger maxCode = this.getMaxCode(id, product.getCode());
        int submitNum = 0;
        int skuAsyncBatchNum = Integer.parseInt(AppContext.getEnvConfig((String)"skuAsyncBatchNum", (String)"10"));
        int skuAsyncBatchSubmitNum = Integer.parseInt(AppContext.getEnvConfig((String)"skuAsyncBatchSubmitNum", (String)"499"));
        ArrayList<ProductSKU> productSKUS = new ArrayList<ProductSKU>();
        if (!CollectionUtils.isEmpty(freeItemAssociations)) {
            int batchNum = 0;
            for (List<ProductFreeCharacterItem> freeItemAssociation : freeItemAssociations) {
                ProductSKU sku = this.dealSkuData(product, freeItemAssociation, productDetails.get(0), billnumMode, maxCode, productName);
                if (null != sku) {
                    ++batchNum;
                    productSKUS.add(sku);
                }
                if (skuAsyncBatchNum != batchNum) continue;
                this.batchSaveSku(productSKUS, billnumMode, product.getId());
                productSKUS.clear();
                if ((submitNum += batchNum) > skuAsyncBatchSubmitNum) {
                    String threadId = String.valueOf(Thread.currentThread().getId());
                    AppContext.setThreadContext((String)threadId, (Object)threadId);
                    break;
                }
                batchNum = 0;
            }
            if (productSKUS.size() > 0) {
                this.batchSaveSku(productSKUS, billnumMode, product.getId());
                String threadId = String.valueOf(Thread.currentThread().getId());
                AppContext.delThreadContext((String)threadId);
            }
            this.productSkuService.updateProductDefaultSku(id);
            this.productSkuService.updateCount(product);
        }
    }

    private ProductSKU dealSkuData(Product product, List<ProductFreeCharacterItem> freeItemAssociation, ProductDetail productDetail, Object billnumMode, AtomicInteger maxCode, String skuNameByProduct) throws Exception {
        ProductSKU sku = new ProductSKU();
        sku.setEntityStatus(EntityStatus.Insert);
        long skuId = IdManager.getInstance().nextId();
        sku.setId((Object)skuId);
        sku.setIsSKU(Integer.valueOf(1));
        sku.setIsStandard(Integer.valueOf(1));
        sku.setIsED(Integer.valueOf(0));
        sku.setIsIa(Integer.valueOf(0));
        sku.setSource(ProductSource.DynamicSku);
        int len = freeItemAssociation.size();
        int cycleIndex = 1;
        String specIds = "";
        String specs = "";
        String specNames = "";
        String skuName = skuNameByProduct;
        String skuNameAuto = skuNameByProduct;
        String specCode = "";
        ArrayList<SkuFreeCharacterItem> skuFreeCharacterItems = new ArrayList<SkuFreeCharacterItem>();
        String spacer = "";
        spacer = ProductUtil.getNameSpacerBytemplateId(product.getProductTemplate());
        BizObject skuFreeCharacter = new BizObject();
        skuFreeCharacter.set("id", (Object)String.valueOf(IdManager.getInstance().nextId()));
        for (ProductFreeCharacterItem item : freeItemAssociation) {
            String characterNme = (String)item.get("characterNme");
            String characterValueId = item.getCharacterValueId();
            String characterValue = (String)item.get("value");
            skuFreeCharacter.put(item.getCharacterCode(), (Object)characterValueId);
            specs = specs + characterNme + ":" + characterValue + ";";
            skuName = skuName + spacer + characterValue;
            skuNameAuto = skuNameAuto + characterValue;
            specCode = specCode + item.getCode();
            specIds = cycleIndex == len ? specIds + characterValueId : specIds + characterValueId + ";";
            SkuFreeCharacterItem skuFreeCharacterItem = new SkuFreeCharacterItem();
            skuFreeCharacterItem.setId((Object)IdManager.getInstance().nextId());
            skuFreeCharacterItem.setEntityStatus(EntityStatus.Insert);
            skuFreeCharacterItem.setCharacterCode(item.getCharacterCode());
            skuFreeCharacterItem.setCharacterId(item.getCharacterId());
            skuFreeCharacterItem.setCharacterValueId(item.getCharacterValueId());
            skuFreeCharacterItem.setProductFreeCharacterItemId((String)item.getId());
            skuFreeCharacterItem.setCharacteristicsId(item.getCharacteristicsId());
            skuFreeCharacterItem.setSkuId((Long)sku.getId());
            skuFreeCharacterItem.setProductId((Long)product.getId());
            skuFreeCharacterItems.add(skuFreeCharacterItem);
        }
        sku.put("skuFreeCharacter", (Object)skuFreeCharacter);
        sku.setSpecIds(specIds);
        sku.setFreeValueIds(specIds);
        sku.setFreeValueIdsMd5(this.productSkuService.getFreeValueIdsMd5(specIds, product.getId()));
        if (null != this.productSkuService.getSkuExists(specIds, product.getId())) {
            return null;
        }
        sku.setSpecs(specs);
        sku.setFreeValues(specs);
        sku.setSpecNames(specNames);
        sku.set(SkuAutoCodeFieldEnum.skuAutoCode.getFieldName(), (Object)skuNameAuto);
        sku.set(SkuAutoCodeFieldEnum.specCode.getFieldName(), (Object)specCode);
        sku.setProductId(Long.valueOf(Long.parseLong(product.getId().toString())));
        sku.setName(skuName);
        if (billnumMode == null || billnumMode != null && Integer.parseInt(billnumMode.toString()) == 0) {
            sku.setCode(this.productSkuService.getSkuCodeByFlowing(product.getCode(), maxCode));
        }
        sku.setSkufreecharacteritems(skuFreeCharacterItems);
        if (sku.get("modelDescription") == null) {
            sku.put("modelDescription", productDetail.get("modelDescription"));
        }
        this.setSkuDetailForInsert(sku, (Long)product.getId(), Long.parseLong(product.get("productApplyRangeId").toString()), productDetail);
        return sku;
    }

    public List<List<ProductFreeCharacterItem>> getSpecItemAssociation(Object productid) throws Exception {
        List<ProductFreeCharacterItem> productFreeCharacterItems = this.getSpectItemByProductId(productid);
        ArrayList<List<ProductFreeCharacterItem>> productFreeCharacterItemAssociations = new ArrayList<List<ProductFreeCharacterItem>>();
        HashMap<Long, List<ProductFreeCharacterItem>> productFreeCharacterItemsMap = new HashMap<Long, List<ProductFreeCharacterItem>>(productFreeCharacterItems.size());
        ArrayList<Long> specsByOrder = new ArrayList<Long>();
        for (ProductFreeCharacterItem productFreeCharacterItem : productFreeCharacterItems) {
            List<ProductFreeCharacterItem> tempSpecItems;
            Long characterId = productFreeCharacterItem.getCharacterId();
            if (productFreeCharacterItemsMap.containsKey(characterId)) {
                tempSpecItems = (List)productFreeCharacterItemsMap.get(characterId);
            } else {
                tempSpecItems = new ArrayList();
                productFreeCharacterItemsMap.put(characterId, tempSpecItems);
                specsByOrder.add(characterId);
            }
            tempSpecItems.add(productFreeCharacterItem);
        }
        if (!CollectionUtils.isEmpty(specsByOrder)) {
            this.setSpecItemAssociations(productFreeCharacterItemsMap, specsByOrder, 0, null, productFreeCharacterItemAssociations);
        }
        return productFreeCharacterItemAssociations;
    }

    private void setSpecItemAssociations(Map<Long, List<ProductFreeCharacterItem>> productFreeCharacterItemsMap, List<Long> specsByOrder, int level, List<ProductFreeCharacterItem> productFreeCharacterItemAssociation, List<List<ProductFreeCharacterItem>> productFreeCharacterItemAssociations) {
        Long freeCharacterId = specsByOrder.get(level);
        List<ProductFreeCharacterItem> productFreeCharacterItems = productFreeCharacterItemsMap.get(freeCharacterId);
        ++level;
        for (ProductFreeCharacterItem productFreeCharacterItem : productFreeCharacterItems) {
            ArrayList<ProductFreeCharacterItem> specItemAssociationTemp = new ArrayList<ProductFreeCharacterItem>();
            if (null != productFreeCharacterItemAssociation) {
                specItemAssociationTemp.addAll(productFreeCharacterItemAssociation);
            }
            specItemAssociationTemp.add(productFreeCharacterItem);
            if (level < specsByOrder.size()) {
                this.setSpecItemAssociations(productFreeCharacterItemsMap, specsByOrder, level, specItemAssociationTemp, productFreeCharacterItemAssociations);
                continue;
            }
            productFreeCharacterItemAssociations.add(specItemAssociationTemp);
        }
    }

    public List<ProductFreeCharacterItem> getSpectItemByProductId(Object productId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId)});
        String selectField = "id, productId, characteristicsId, characterId, characterCode, characterValueId, iOrder";
        QuerySchema schema = QuerySchema.create().addSelect(selectField).addCondition((ConditionExpression)queryConditionGroup).addOrderBy("iOrder");
        List productFreeCharacterItems = this.productSkuService.query("pc.product.ProductFreeCharacterItem", schema);
        this.productSkuCharacterService.dealFreeCharacterItems(productFreeCharacterItems);
        return productFreeCharacterItems;
    }

    public List<ProductDetail> getAllProductDetailByRange(Object id, Object productApplyRangeId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productApplyRangeId)});
        QuerySchema schema = QuerySchema.create().addSelect("id, productDetailId").addCondition((ConditionExpression)queryConditionGroup);
        List ranges = this.productSkuService.query("pc.product.ProductApplyRange", schema);
        queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)((ProductApplyRange)ranges.get(0)).getProductDetailId())});
        schema = QuerySchema.create().addSelect("*, productId.modelDescription as modelDescription").addCondition((ConditionExpression)queryConditionGroup);
        List productDetails = this.productSkuService.query("pc.product.ProductDetail", schema);
        return productDetails;
    }

    public AtomicInteger getMaxCode(Object id, String productCode) throws Exception {
        AtomicInteger maxCode = new AtomicInteger(0);
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        conditionGroup.addCondition(new ConditionExpression[]{QueryCondition.name((String)"productId").eq(id), QueryCondition.name((String)"isSKU").eq((Object)1), QueryCondition.name((String)"code").like((Object)productCode)});
        QuerySchema tempSchema = QuerySchema.create().addSelect("code").addCondition((ConditionExpression)conditionGroup);
        List skusInDB = this.productSkuService.query("pc.product.ProductSKU", tempSchema);
        if (skusInDB != null) {
            skusInDB.forEach(tempSku -> {
                String code;
                String string = code = tempSku.get("code") == null ? "" : tempSku.get("code").toString();
                if (!StringUtils.isEmpty((CharSequence)code) && productCode.equals(code.substring(0, productCode.length()))) {
                    String numberStr = code.substring(productCode.length());
                    try {
                        Integer value = Integer.valueOf(numberStr);
                        if (value > maxCode.get()) {
                            maxCode.set(value);
                        }
                    }
                    catch (Exception ex) {
                        log.error("com.yonyoucloud.upc.service.ProductSkuAsyncSaveService.getMaxCode:\u83b7\u53d6\u6700\u5927\u7f16\u7801\u5f02\u5e38");
                    }
                }
            });
        }
        return maxCode;
    }

    public void batchSaveSku(List<ProductSKU> productSKUS, Object billnumMode, Object productId) throws Exception {
        if (!CollectionUtils.isEmpty(productSKUS)) {
            Product productSave = new Product();
            productSave.setId(productId);
            productSave.setProductskus(productSKUS);
            productSave.setEntityStatus(EntityStatus.Insert);
            this.productSKUAutoCodeRule.skuBatchAutoCode(productSave, billnumMode);
            MetaDaoHelper.insert((String)"pc.product.ProductSKU", productSKUS);
        }
    }

    public void setSkuDetailForInsert(ProductSKU sku, long productId, long productApplyRangeId, ProductDetail productDetail) throws Exception {
        ProductSkuDetailNew skuDetailNew = new ProductSkuDetailNew();
        skuDetailNew.setId((Object)IdManager.getInstance().nextId());
        this.fillSkuDetail(sku.getIsSKU(), (Long)sku.getId(), productId, productApplyRangeId, productDetail, (Map<String, Object>)skuDetailNew);
        skuDetailNew.setIsCreator(Boolean.valueOf(true));
        ArrayList<ProductSkuDetailNew> productSkuDetailNews = new ArrayList<ProductSkuDetailNew>();
        productSkuDetailNews.add(skuDetailNew);
        sku.setProductSkuDetailNew(productSkuDetailNews);
        this.dealSkuDataForApplied(sku, productId);
    }

    private void fillSkuDetail(Integer isSku, Long skuId, Long productId, Long productApplyRangeId, ProductDetail productDetail, Map<String, Object> skuDetail) {
        this.copyMapping(skuDetail, productDetail, ProductDefaultSKURule.COPY_FIELDS);
        skuDetail.put("id", IdManager.getInstance().nextId());
        skuDetail.put("_status", EntityStatus.Insert);
        skuDetail.put("skuId", skuId);
        skuDetail.put("productId", productId);
        skuDetail.put("productDetailId", productDetail.getId());
        skuDetail.put("productApplyRangeId", productApplyRangeId);
        if (null != isSku && 0 == isSku) {
            skuDetail.put("stopstatus", true);
            skuDetail.put("status", false);
            skuDetail.put("ustatus", false);
        }
        if (!skuDetail.containsKey("stopstatus")) {
            skuDetail.put("stopstatus", false);
        }
        if (!skuDetail.containsKey("status")) {
            skuDetail.put("status", true);
        }
        if (!skuDetail.containsKey("ustatus")) {
            skuDetail.put("ustatus", true);
        }
    }

    public void dealProductSkuOrderPropertiesForInsert(ProductSKU sku, long productId, long productApplyRangeId, ProductDetail productDetail) {
        List productSkuOrderProperties = sku.productSkuOrderProperty();
        for (ProductSkuOrderProperty productSkuOrderProperty : productSkuOrderProperties) {
            productSkuOrderProperty.setProductId(Long.valueOf(productId));
            productSkuOrderProperty.setProductApplyRangeId(Long.valueOf(productApplyRangeId));
            productSkuOrderProperty.setProductDetailId(Long.valueOf(Long.parseLong(productDetail.getId().toString())));
            productSkuOrderProperty.setIsCreator(Boolean.valueOf(true));
        }
    }

    public void dealProductSkuOrderPropertiesForUpdate(ProductSKU sku, long productId, long productApplyRangeId, ProductDetail productDetail) throws Exception {
        List productSkuOrderProperties = sku.productSkuOrderProperty();
        HashMap skuOrderPropertyExtendMap = new HashMap();
        for (ProductSkuOrderProperty productSkuOrderProperty : productSkuOrderProperties) {
            productSkuOrderProperty.setSkuId((Long)sku.getId());
            productSkuOrderProperty.setProductId(Long.valueOf(productId));
            productSkuOrderProperty.setProductApplyRangeId(Long.valueOf(productApplyRangeId));
            productSkuOrderProperty.setProductDetailId(Long.valueOf(Long.parseLong(productDetail.getId().toString())));
            productSkuOrderProperty.setIsCreator(Boolean.valueOf(true));
        }
    }

    public void dealSkuDataForApplied(ProductSKU sku, long productId) throws Exception {
        QueryConditionGroup querySkuGroup = new QueryConditionGroup();
        querySkuGroup.addCondition(new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"isCreator").eq((Object)0)});
        QuerySchema schema = QuerySchema.create().addSelect(new String[]{"productApplyRangeId", "id"}).addCondition((ConditionExpression)querySkuGroup);
        List details = this.productSkuService.query("pc.product.ProductDetail", schema);
        if (!CollectionUtils.isEmpty((Collection)details)) {
            this.dealSkuDetailForApplied(sku, details);
            if (sku.productSkuOrderProperty() != null) {
                this.dealSkuPropertyForApplied(sku, details);
            }
        }
    }

    private void dealSkuDetailForApplied(ProductSKU sku, List<ProductDetail> productDetails) throws Exception {
        ArrayList<ProductSkuDetailNew> skuDetailNewList = new ArrayList<ProductSkuDetailNew>();
        ProductSkuDetailNew productSkuDetailNew = (ProductSkuDetailNew)sku.productSkuDetailNew().get(0);
        for (ProductDetail productDetail : productDetails) {
            ProductSkuDetailNew skuDetailNew = new ProductSkuDetailNew();
            skuDetailNew.putAll((Map)productSkuDetailNew);
            Object skuDetailCharacterDefObj = skuDetailNew.get("skuDetailCharacterDef");
            if (null != skuDetailCharacterDefObj && skuDetailCharacterDefObj instanceof Map) {
                HashMap<String, Object> skuDetailCharacterDef = new HashMap<String, Object>();
                skuDetailCharacterDef.putAll((Map)skuDetailCharacterDefObj);
                skuDetailCharacterDef.put("id", IdManager.getInstance().nextId());
                skuDetailCharacterDef.put("ytenant", AppContext.getYTenantId());
                skuDetailNew.put("skuDetailCharacterDef", skuDetailCharacterDef);
            }
            skuDetailNew.setProductApplyRangeId(productDetail.getProductApplyRangeId());
            skuDetailNew.setProductDetailId((Long)productDetail.getId());
            skuDetailNew.setId((Object)IdManager.getInstance().nextId());
            skuDetailNew.setEntityStatus(EntityStatus.Insert);
            skuDetailNew.setIsCreator(Boolean.valueOf(false));
            skuDetailNewList.add(skuDetailNew);
        }
        MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", skuDetailNewList);
    }

    public void dealSkuPropertyForApplied(ProductSKU sku, List<ProductDetail> productDetails) throws Exception {
        List productSkuOrderPropertyList = sku.productSkuOrderProperty();
        ArrayList<ProductSkuOrderProperty> productSkuOrderPropertyListNew = new ArrayList<ProductSkuOrderProperty>();
        for (ProductDetail productDetail : productDetails) {
            for (ProductSkuOrderProperty productSkuOrderProperty : productSkuOrderPropertyList) {
                ProductSkuOrderProperty productSkuOrderPropertyNew = new ProductSkuOrderProperty();
                productSkuOrderPropertyNew.putAll((Map)productSkuOrderProperty);
                productSkuOrderPropertyNew.setProductApplyRangeId(productDetail.getProductApplyRangeId());
                productSkuOrderPropertyNew.setProductDetailId((Long)productDetail.getId());
                productSkuOrderPropertyNew.setId((Object)IdManager.getInstance().nextId());
                productSkuOrderPropertyNew.setEntityStatus(EntityStatus.Insert);
                productSkuOrderPropertyNew.setIsCreator(Boolean.valueOf(false));
                productSkuOrderPropertyListNew.add(productSkuOrderPropertyNew);
            }
        }
        MetaDaoHelper.insert((String)"pc.product.ProductSkuOrderProperty", productSkuOrderPropertyListNew);
    }

    public String getProductName(Product productParam) throws Exception {
        QueryConditionGroup querySkuGroup = new QueryConditionGroup();
        querySkuGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq(productParam.getId()));
        QuerySchema schema = QuerySchema.create().addSelect("name, code, productTemplate.involveSKUNaming as involveSKUNaming").addCondition((ConditionExpression)querySkuGroup);
        List productInDB = this.productSkuService.query("pc.product.Product", schema);
        if (!CollectionUtils.isEmpty((Collection)productInDB)) {
            Product product = (Product)productInDB.get(0);
            productParam.setCode(product.getCode());
            Object involveSKUNaming = product.get("involveSKUNaming");
            if (null != involveSKUNaming && Boolean.parseBoolean(involveSKUNaming.toString())) {
                String productName = (String)MultilangUtil.getAttr((String)"pc.product.Product", (String)"name", (BizObject)product, null);
                return productName;
            }
        }
        return "";
    }

    private void copyMapping(Map skuDetail, ProductDetail productDetail, HashMap<String, String> copyFields) {
        for (Map.Entry<String, String> entry : copyFields.entrySet()) {
            skuDetail.put(entry.getKey(), productDetail.get(entry.getValue()));
        }
    }

    public void asyncSaveSku(final Product product, String token, final EntityStatus entityStatus) {
        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronizationAdapter(){

            public void afterCompletion(int status) {
                ProductSkuAsyncSaveService.this.ymsExecutorService.execute(() -> {
                    String lockKey = RedisLockKeyConstants.PRODUCTSKU_ASYNCSSAVE_CONCURRENCY + product.getId();
                    try {
                        BillDataDto dto = new BillDataDto();
                        dto.setAction("skuasyncsave");
                        dto.setData((Object)product);
                        dto.setBillnum("pc_productsku_add");
                        product.setEntityStatus(entityStatus);
                        String threadId = String.valueOf(Thread.currentThread().getId());
                        while (true) {
                            AppContext.cache().set(lockKey, (String)product.get("skuasyncsaveLockKey"), 360);
                            ProductSkuAsyncSaveService.this.billService.executeUpdate("skuasyncsave", dto);
                            Object threadContext = AppContext.getThreadContext((String)threadId);
                            if (null == threadContext) break;
                            if (!threadId.equals(threadContext.toString())) {
                                break;
                            }
                            AppContext.delThreadContext((String)threadId);
                        }
                    }
                    catch (Throwable e) {
                        logger.error("com.yonyoucloud.upc.service.ProductSkuAsyncSaveService.asyncSaveSku " + e.getMessage());
                    }
                    finally {
                        RedisTool.releaseLock((String)lockKey, (String)((String)product.get("skuasyncsaveLockKey")));
                    }
                });
            }
        });
    }

    public void setModifySchemaBySkuAsync(Map<String, Object> mapCondition, BillContext billContext) {
        Object fromWeb;
        if (null != mapCondition && null != (fromWeb = mapCondition.get("fromWeb")) && "1".equals(fromWeb.toString()) && this.pubOptionService.getProductSkuSaveAsync() > 0) {
            HashMap<String, String> context = billContext.getContext();
            if (null == context) {
                context = new HashMap<String, String>(2);
                billContext.setContext(context);
            }
            context.put("modifySchema", "1");
        }
    }

    public void setSkuDetailForApi(ProductSKU sku, Long productId, Long productApplyRangeId, ProductDetail productDetail) throws Exception {
        List skuDetailNewList = sku.productSkuDetailNew();
        if (EntityStatus.Insert == sku.getEntityStatus()) {
            ProductSkuDetailNew productSkuDetailNew = (ProductSkuDetailNew)skuDetailNewList.get(0);
            ProductSkuDetailNew skuDetailNew = new ProductSkuDetailNew();
            this.copyMapping((Map)skuDetailNew, productDetail, ProductDefaultSKURule.COPY_FIELDS);
            skuDetailNew.putAll((Map)productSkuDetailNew);
            skuDetailNew.setId((Object)IdManager.getInstance().nextId());
            skuDetailNew.setEntityStatus(EntityStatus.Insert);
            skuDetailNew.setSkuId((Long)sku.getId());
            skuDetailNew.setProductId(productId);
            skuDetailNew.setProductApplyRangeId(productApplyRangeId);
            skuDetailNew.setProductDetailId(Long.valueOf(Long.parseLong(productDetail.getId().toString())));
            skuDetailNew.setIsCreator(Boolean.valueOf(true));
            ArrayList<ProductSkuDetailNew> productSkuDetailNews = new ArrayList<ProductSkuDetailNew>();
            productSkuDetailNews.add(skuDetailNew);
            sku.setProductSkuDetailNew(productSkuDetailNews);
            this.dealSkuDataForApplied(sku, productId);
        } else {
            if (CollectionUtils.isEmpty((Collection)skuDetailNewList)) {
                return;
            }
            if (CoredocDataSourceUtils.isFromExcelImport((Map)sku).booleanValue() && EntityStatus.Update.equals((Object)sku.getEntityStatus())) {
                sku.put("orgCodeForUpdate", sku.get("productId_productApplyRange_orgId_code"));
            }
            ProductSkuDetailNew productSkuDetailNew = (ProductSkuDetailNew)skuDetailNewList.get(0);
            Long productDetailId = Long.parseLong(productDetail.getId().toString());
            boolean isCreator = true;
            boolean updateExtendFlag = false;
            if (sku.containsKey((Object)"orgCodeForUpdate") && sku.get("orgCodeForUpdate") != null) {
                QueryConditionGroup queryConditionOrgGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"orgId.code").eq(sku.get("orgCodeForUpdate"))});
                QuerySchema schemaOrg = QuerySchema.create().addSelect("id, productDetailId, isCreator, isApplied").addCondition((ConditionExpression)queryConditionOrgGroup);
                List productApplyRangeList = this.productSkuService.query("pc.product.ProductApplyRange", schemaOrg);
                if (Objects.isNull(productApplyRangeList) || productApplyRangeList.size() == 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801085);
                }
                productApplyRangeId = (Long)((ProductApplyRange)productApplyRangeList.get(0)).getId();
                isCreator = ((ProductApplyRange)productApplyRangeList.get(0)).getIsCreator();
                Boolean isApplied = ((ProductApplyRange)productApplyRangeList.get(0)).getIsApplied();
                QuerySchema schemaDetil = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"id").eq((Object)((ProductApplyRange)productApplyRangeList.get(0)).getProductDetailId())}));
                List isAppliedProductCount = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)schemaDetil);
                if (!CollectionUtils.isEmpty((Collection)isAppliedProductCount)) {
                    updateExtendFlag = true;
                    if (BooleanUtil.isFalse((Object)isCreator) && BooleanUtil.isFalse((Object)isApplied)) {
                        this.productSKUShelveRule.initRangeData(productId.toString(), (Long)((ProductApplyRange)productApplyRangeList.get(0)).getId());
                        Map range = this.productSkuDetailSaveService.getRange(((ProductApplyRange)productApplyRangeList.get(0)).getId());
                        productDetailId = Long.parseLong(range.get("productDetailId").toString());
                    } else {
                        productDetailId = Long.parseLong(((Map)isAppliedProductCount.get(0)).get("id").toString());
                    }
                    if (CoredocDataSourceUtils.isFromExcelImport((Map)sku).booleanValue() && EntityStatus.Update.equals((Object)sku.getEntityStatus()) && BooleanUtil.isFalse((Object)isCreator)) {
                        for (String nonUpdateField : nonUpdateFields) {
                            sku.remove(nonUpdateField);
                        }
                    }
                }
            }
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuId").eq(sku.getId()), QueryCondition.name((String)"productId").eq((Object)productId), QueryCondition.name((String)"productDetailId").eq((Object)productDetailId)});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
            List productSkuDetailNewsInDb = this.productSkuService.query("pc.product.ProductSkuDetailNew", schema);
            ProductSkuDetailNew skuDetailNew = new ProductSkuDetailNew();
            skuDetailNew.putAll((Map)productSkuDetailNew);
            if (!CollectionUtils.isEmpty((Collection)productSkuDetailNewsInDb)) {
                skuDetailNew.setId(((ProductSkuDetailNew)productSkuDetailNewsInDb.get(0)).getId());
                skuDetailNew.setEntityStatus(EntityStatus.Update);
            } else {
                skuDetailNew.setId((Object)IdManager.getInstance().nextId());
                skuDetailNew.setEntityStatus(EntityStatus.Insert);
                this.fillDefaultValueFromCreateOrg(skuDetailNew, sku.getId() != null ? Long.valueOf(Long.parseLong(sku.getId().toString())) : null);
                Object skuDetailCharacterDefObj = skuDetailNew.get("skuDetailCharacterDef");
                if (null != skuDetailCharacterDefObj && skuDetailCharacterDefObj instanceof Map) {
                    HashMap<String, Object> skuDetailCharacterDef = new HashMap<String, Object>();
                    skuDetailCharacterDef.putAll((Map)skuDetailCharacterDefObj);
                    skuDetailCharacterDef.put("id", IdManager.getInstance().nextId());
                    skuDetailCharacterDef.put("_status", EntityStatus.Insert);
                    skuDetailCharacterDef.put("ytenant", AppContext.getYTenantId());
                    skuDetailNew.put("skuDetailCharacterDef", skuDetailCharacterDef);
                }
            }
            skuDetailNew.setSkuId((Long)sku.getId());
            skuDetailNew.setProductId(productId);
            skuDetailNew.setProductApplyRangeId(productApplyRangeId);
            skuDetailNew.setProductDetailId(productDetailId);
            skuDetailNew.setIsCreator(Boolean.valueOf(isCreator));
            ArrayList<ProductSkuDetailNew> productSkuDetailNews = new ArrayList<ProductSkuDetailNew>();
            productSkuDetailNews.add(skuDetailNew);
            sku.setProductSkuDetailNew(productSkuDetailNews);
            if (sku.get("onlyInsert") != null && BooleanUtil.isTrue((Object)sku.get("onlyInsert")) && EntityStatus.Update == sku.getEntityStatus()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.ONLY_INSERT_IS_TRUE);
            }
        }
    }

    private void fillDefaultValueFromCreateOrg(ProductSkuDetailNew skuDetailNew, Long skuId) throws Exception {
        if (ObjectUtils.isNotEmpty((Object)skuDetailNew) && skuId != null) {
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuId").eq((Object)skuId), QueryCondition.name((String)"isCreator").eq((Object)true)});
            QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryConditionGroup);
            List productSkuDetailList = this.productSkuService.query("pc.product.ProductSkuDetailNew", schema);
            if (!CollectionUtils.isEmpty((Collection)productSkuDetailList) && productSkuDetailList.get(0) != null) {
                for (Map.Entry entry : ((ProductSkuDetailNew)productSkuDetailList.get(0)).entrySet()) {
                    if (skuDetailNew.containsKey(entry.getKey()) || blankKeyList.contains(entry.getKey())) continue;
                    skuDetailNew.put((String)entry.getKey(), entry.getValue());
                }
            }
        }
    }

    static {
        nonUpdateFields.add("name");
        nonUpdateFields.add("code");
        nonUpdateFields.add("modelDescription");
        nonUpdateFields.add("model");
        nonUpdateFields.add("isStandard");
        nonUpdateFields.add("isED");
        nonUpdateFields.add("isIa");
        nonUpdateFields.add("weight");
        nonUpdateFields.add("volume");
        nonUpdateFields.add("batchUnit");
        nonUpdateFields.add("batchRate");
        nonUpdateFields.add("skuPropCharacter");
        nonUpdateFields.add("productSkuCharacterDef");
        nonUpdateFields.add("freeCharacterValues");
        nonUpdateFields.add("proCharacterValues");
        nonUpdateFields.add("erpCode");
        blankKeyList = new ArrayList<String>();
        blankKeyList.add("id");
        blankKeyList.add("_status");
        blankKeyList.add("pubts");
        blankKeyList.add("productApplyRangeId");
        blankKeyList.add("productDetailId");
        blankKeyList.add("isCreator");
    }
}

