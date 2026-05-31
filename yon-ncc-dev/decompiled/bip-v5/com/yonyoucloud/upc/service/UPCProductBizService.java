/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 *  com.yonyoucloud.upc.pc.product.ProductSKUExtend
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  com.yonyoucloud.upc.pc.product.ProductSource
 *  com.yonyoucloud.upc.pc.product.ProductSpecItem
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

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.IRpcRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductBizService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductUpdateService;
import com.yonyoucloud.upc.billrule.goodsAchive.ProductSKUShelveRule;
import com.yonyoucloud.upc.billrule.product.ProductSKUAutoCodeRule;
import com.yonyoucloud.upc.billrule.product.ProductSKUDelCheckRule;
import com.yonyoucloud.upc.pc.product.ProductSKU;
import com.yonyoucloud.upc.pc.product.ProductSKUExtend;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.pc.product.ProductSource;
import com.yonyoucloud.upc.pc.product.ProductSpecItem;
import com.yonyoucloud.upc.service.AchiveDataQueryService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
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
public class UPCProductBizService
implements IUPCProductBizService {
    private static final Logger log = LoggerFactory.getLogger(UPCProductBizService.class);
    public static String ENABLE_SKU = "enablesku";
    @Autowired
    private IUPCProductUpdateService upcProductUpdateService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    AchiveDataQueryService achiveDataQueryService;
    @Autowired
    IBillCodeComponentService billCodeComponentService;
    @Autowired
    ProductSKUAutoCodeRule productSKUAutoCodeRule;
    @Autowired
    ProductSKUShelveRule productSKUShelveRule;

    @Override
    public void generateSKUs(List<Map> data, String productIdItem, String skuIdItem, Long transactionId, Map<String, Object> cancelData) throws Exception {
        ArrayList records = new ArrayList(data.size());
        ArrayList<Integer> autoRows = new ArrayList<Integer>(data.size());
        ArrayList<Integer> autoRowsWithoutSKU = new ArrayList<Integer>(data.size());
        for (int j = 0; j < data.size(); ++j) {
            if (data.get(j).containsKey(skuIdItem) && data.get(j).get(skuIdItem) != null) continue;
            HashMap<String, Integer> map2 = new HashMap<String, Integer>();
            map2.put("rowNo", j);
            map2.put("productId", (Integer)data.get(j).get(productIdItem));
            records.add(map2);
        }
        if (records.size() > 0) {
            List result = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id as productId", "productTemplate as productTplId", "productTemplate.skuBusinessDynamic as skuBusinessDynamic", "productTemplate.Specs.specification as specId", "productTemplate.Specs.specitem as specItemValue", "productTemplate.Specs.specification.defineId as defineId", "productTemplate.Specs.specification.type as type", "productTemplate.Specs.specification.defineId as achiveDomain", "productTemplate.Specs.specification.defineId as achiveCode", "productTemplate.Specs.specification.defineId as achiveDefineCode", "productTemplate.Specs.specification.defineId as achiveReturn"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in((Collection)records.stream().map(map -> map.get("productId")).collect(Collectors.toSet()))})));
            Map<Object, List<Map>> productspecs = result.stream().collect(Collectors.groupingBy(map -> map.get("productId")));
            HashSet<Object> productsRemove = new HashSet<Object>();
            for (Map.Entry<Object, List<Map>> entry : productspecs.entrySet()) {
                for (Map map3 : entry.getValue()) {
                    if (!map3.containsKey("productTplId")) {
                        productsRemove.add(entry.getKey());
                    }
                    if (!map3.containsKey("specId")) {
                        productsRemove.add(entry.getKey());
                    }
                    if (null == map3.get("type")) continue;
                    if (!"CustArchive".equalsIgnoreCase(map3.get("type").toString()) && !map3.containsKey("specItemValue")) {
                        productsRemove.add(entry.getKey());
                    }
                    if (map3.containsKey("skuBusinessDynamic") && !map3.get("skuBusinessDynamic").equals(false)) continue;
                    productsRemove.add(entry.getKey());
                }
            }
            if (!productsRemove.isEmpty()) {
                productspecs.keySet().removeAll(productsRemove);
            }
            for (Map map2 : records) {
                int rowNo = (Integer)map2.get("rowNo");
                List<Map> productspec = productspecs.get(map2.get("productId"));
                if (null == productspec) continue;
                Map<String, List<Map>> specs = productspec.stream().collect(Collectors.groupingBy(m -> m.get("defineId").toString()));
                Map row2 = data.get(rowNo);
                boolean autoGene = true;
                int specCount = 0;
                for (Map.Entry<String, List<Map>> entry : specs.entrySet()) {
                    if (row2.containsKey(entry.getKey()) && row2.get(entry.getKey()) != null) {
                        ++specCount;
                        Map spec = entry.getValue().get(0);
                        if (null != spec.get("type") && "CustArchive".equalsIgnoreCase(spec.get("type").toString()) || entry.getValue().stream().anyMatch(m -> m.get("specItemValue").toString().equals(row2.get(entry.getKey()).toString()))) continue;
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801425, new Object[]{row2.get("id"), entry.getKey()});
                    }
                    autoGene = false;
                    break;
                }
                if (specCount <= 0) continue;
                if (autoGene) {
                    autoRows.add(rowNo);
                    continue;
                }
                autoRowsWithoutSKU.add(rowNo);
            }
            if (autoRows.size() > 0) {
                HashMap<Integer, Map> autoGeneRows = new HashMap<Integer, Map>(autoRows.size());
                autoRows.forEach(row -> autoGeneRows.put((Integer)row, (Map)data.get((int)row)));
                this.autoGenerateSKUBySpecs(autoGeneRows, productIdItem, skuIdItem, cancelData);
                this.sendProductMessage(autoGeneRows, productIdItem, transactionId, true);
            }
            if (autoRowsWithoutSKU.size() > 0) {
                HashMap<Integer, Map> autoGeneRowsWithoutSKU = new HashMap<Integer, Map>(autoRowsWithoutSKU.size());
                autoRowsWithoutSKU.forEach(row -> autoGeneRowsWithoutSKU.put((Integer)row, (Map)data.get((int)row)));
                this.autoGenerateProductSpecItem(autoGeneRowsWithoutSKU, productIdItem, cancelData);
                this.sendProductMessage(autoGeneRowsWithoutSKU, productIdItem, transactionId, false);
            }
        }
    }

    @Override
    public void autoGenerateSKUBySpecs(Map<Integer, Map> autoGeneRows, String productIdItem, String skuIdItem, Map<String, Object> cancelData) throws Exception {
        if (autoGeneRows != null) {
            BillCodeContext billCodeContext = this.billCodeComponentService.getBillCodeContext("pc_product|productskus#code", AppContext.getCurrentUser().getYhtTenantId(), "");
            Integer billnumMode = billCodeContext.getBillnumMode();
            Set productIds = autoGeneRows.values().stream().map(map -> (Long)map.get(productIdItem)).collect(Collectors.toSet());
            List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect("id, code, name, productTemplate").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIds)})));
            Map<Long, List<Map>> productsInDb = products.stream().collect(Collectors.groupingBy(m -> (Long)m.get("id")));
            List result = MetaDaoHelper.query((String)"pc.product.ProductSKU", (QuerySchema)QuerySchema.create().addSelect("*, productId.code as productCode").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds)})));
            Map<Long, List<Map>> productSKUsInDb = result.stream().collect(Collectors.groupingBy(m -> (Long)m.get("productId")));
            List ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"isCreator").eq((Object)1)})));
            Map<Long, List<Map>> productRanges = ranges.stream().collect(Collectors.groupingBy(m -> (Long)m.get("productId")));
            List specsInDb = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id as specId", "defineId", "showItem as specName", "userdefines.id as specItemId", "userdefines.name as specItemName", "userdefines.name as specItemCode"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"classId").eq((Object)"productSpec"), QueryCondition.name((String)"isEnabled").eq((Object)1), QueryCondition.name((String)"defineId").in(ProductUtil.get10FixedFrees())})));
            Map<String, List<Map<String, Object>>> specItemsInDb = specsInDb.stream().collect(Collectors.groupingBy(m -> m.get("defineId").toString()));
            List productSpecItems = MetaDaoHelper.query((String)"pc.product.ProductSpecItem", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds)})));
            Map<Long, List<Map>> productSpecItemsInDb = productSpecItems.stream().collect(Collectors.groupingBy(m -> (Long)m.get("productId")));
            List skuNameItems = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().distinct().addSelect(new String[]{"productTemplate.Specs.specification.defineId as defineId", "id as productId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIds)})).addOrderBy("productTemplate.Specs.order"));
            Map<Long, List<Map>> skuNameItemsInDb = skuNameItems.stream().collect(Collectors.groupingBy(m -> (Long)m.get("productId")));
            HashMap<Long, List<ProductSKU>> skusInsert = new HashMap<Long, List<ProductSKU>>(autoGeneRows.keySet().size());
            HashMap<Long, List<ProductSpecItem>> specItemsInsert = new HashMap<Long, List<ProductSpecItem>>(autoGeneRows.keySet().size());
            HashSet<Long> checkedProductIds = new HashSet<Long>(autoGeneRows.keySet().size());
            HashSet<ProductSKU> delDefaultSKUs = new HashSet<ProductSKU>(autoGeneRows.keySet().size());
            Map<String, Map<String, Object>> custValuesListMap = this.getAllCustDefineValue(autoGeneRows);
            HashMap<String, Long> existSkuIdInData = new HashMap<String, Long>(autoGeneRows.size());
            for (Map.Entry<Integer, Map> entry : autoGeneRows.entrySet()) {
                Long productId = (Long)entry.getValue().get(productIdItem);
                List<Map> productInDb = productsInDb.get(productId);
                List<Map<String, Object>> productSKUInDb = productSKUsInDb.get(productId);
                List<Map<String, Object>> productSpecItemInDb = productSpecItemsInDb.get(productId);
                List<Map> skuNameItemInDb = skuNameItemsInDb.get(productId);
                if (null == productSKUInDb || productSKUInDb.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808011, new Object[]{productId});
                }
                List<Map> productRange = productRanges.get(productId);
                if (null == productRange || productRange.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808012, new Object[]{productId});
                }
                Map range = productRange.get(0);
                Long rangeId = (Long)range.get("id");
                HashMap<String, String> frees = new HashMap<String, String>(10);
                for (int i = 1; i <= 10; ++i) {
                    String freeKey = "free" + i;
                    if (!entry.getValue().containsKey(freeKey) || entry.getValue().get(freeKey) == null) continue;
                    frees.put(freeKey, entry.getValue().get(freeKey).toString().trim());
                }
                String skuNameModel = "";
                for (Map map2 : skuNameItemInDb) {
                    if ("free10".equals(map2.get("defineId").toString())) {
                        skuNameModel = skuNameModel + "free#10";
                        continue;
                    }
                    skuNameModel = skuNameModel + (String)map2.get("defineId");
                }
                List defaultsku = productSKUInDb.stream().filter(map -> map.get("isSKU").equals(0)).collect(Collectors.toList());
                if (defaultsku.isEmpty()) {
                    HashMap<String, Long> skuId = new HashMap<String, Long>();
                    skuId.put("skuId", 0L);
                    ProductSKU sku = ProductUtil.generateSKUByFixedSpecs(productId, productInDb.get(0).get("name").toString(), rangeId, frees, specItemsInDb, skuNameModel, custValuesListMap, Long.parseLong(productInDb.get(0).get("productTemplate").toString()));
                    String freeValueIdsMd5 = this.productSkuService.getFreeValueIdsMd5(sku.getSpecIds(), productId);
                    if (existSkuIdInData.containsKey(freeValueIdsMd5)) {
                        entry.getValue().put(skuIdItem, existSkuIdInData.get(freeValueIdsMd5));
                    } else {
                        ProductSKU skuExists = this.productSkuService.setSkuExistsLock(sku.getSpecIds(), productId);
                        if (null != skuExists) {
                            entry.getValue().put(skuIdItem, skuExists.getId());
                        } else {
                            sku.setSource(ProductSource.DynamicSku);
                            sku.setFreeValueIdsMd5(freeValueIdsMd5);
                            existSkuIdInData.put(freeValueIdsMd5, (Long)sku.getId());
                            this.initSkudetailNew(sku, productId, rangeId, range.get("productDetailId"));
                            ProductUtil.addDistinctProductSKU(skusInsert, frees, sku, productInDb.get(0).get("code").toString(), productSKUInDb, billnumMode, this.productSKUAutoCodeRule);
                            ProductSKU skuInInsertList = ProductUtil.findProductSKUBySpecs((List)skusInsert.get(productId), frees);
                            if (null != skuInInsertList) {
                                entry.getValue().put(skuIdItem, skuInInsertList.getId());
                            }
                            List<ProductSpecItem> specItemInsert = ProductUtil.generateProductSpecItemsByFixedSpecs(productId, frees, specItemsInDb, productSpecItemInDb, custValuesListMap);
                            ProductUtil.addDistinctProductSpecItem(specItemsInsert, productId, specItemInsert);
                        }
                    }
                }
                if (defaultsku.size() == 1) {
                    if (productSKUInDb.size() > 1) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801426, new Object[]{String.valueOf(entry.getValue().get(productIdItem))});
                    }
                    if (!checkedProductIds.contains(productId)) {
                        checkedProductIds.add(productId);
                        ProductSKU defaultSKU = new ProductSKU();
                        defaultSKU.init((Map)defaultsku.get(0));
                        defaultSKU.put("fromAutoGenerateSKU_", (Object)true);
                        if (!this.checkDefaultSKUisUsed(defaultSKU)) {
                            List skuextend = MetaDaoHelper.query((String)"pc.product.ProductSkuDetailNew", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"skuId").eq(defaultSKU.getId()), QueryCondition.name((String)"isCreator").eq((Object)true)})));
                            if (skuextend != null && !skuextend.isEmpty()) {
                                if (skuextend.size() > 1) {
                                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801427, new Object[]{String.valueOf(entry.getValue().get(productIdItem))});
                                }
                                ProductSKUExtend extend = new ProductSKUExtend();
                                extend.init((Map)skuextend.get(0));
                                defaultSKU.setProductSKUDetail(extend);
                            }
                            List defaultSKUs = (List)cancelData.get("defaultSKUs");
                            defaultSKUs.add(defaultSKU);
                            delDefaultSKUs.add(defaultSKU);
                        }
                    }
                    ProductSKU sku = ProductUtil.generateSKUByFixedSpecs(productId, productInDb.get(0).get("name").toString(), rangeId, frees, specItemsInDb, skuNameModel, custValuesListMap, Long.parseLong(productInDb.get(0).get("productTemplate").toString()));
                    this.initSkudetailNew(sku, productId, rangeId, range.get("productDetailId"));
                    ProductUtil.addDistinctProductSKU(skusInsert, frees, sku, productInDb.get(0).get("code").toString(), productSKUInDb, billnumMode, this.productSKUAutoCodeRule);
                    ProductSKU skuInInsertList = ProductUtil.findProductSKUBySpecs((List)skusInsert.get(productId), frees);
                    if (null != skuInInsertList) {
                        entry.getValue().put(skuIdItem, skuInInsertList.getId());
                    }
                    List<ProductSpecItem> specItemInsert = ProductUtil.generateProductSpecItemsByFixedSpecs(productId, frees, specItemsInDb, productSpecItemInDb, custValuesListMap);
                    ProductUtil.addDistinctProductSpecItem(specItemsInsert, productId, specItemInsert);
                    continue;
                }
                if (defaultsku.size() <= 1) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801428, new Object[]{String.valueOf(entry.getValue().get(productIdItem))});
            }
            if (!delDefaultSKUs.isEmpty()) {
                for (ProductSKU sku : delDefaultSKUs) {
                    try {
                        this.productSkuService.deleteSkuById(sku.getId(), sku.getProductId());
                    }
                    catch (ExecutionException e) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801429, new Object[]{sku.get("productCode"), e.getMessage()});
                    }
                    HashMap<String, Object> params = new HashMap<String, Object>();
                    params.put("productid", sku.getProductId());
                    params.put("tenantid", AppContext.getCurrentUser().getTenant());
                    this.upcProductUpdateService.UpdateDefaultSKUId(params);
                }
            }
            if (!skusInsert.isEmpty()) {
                Set skuIds = (Set)cancelData.get("skuIds");
                for (Map.Entry entry : skusInsert.entrySet()) {
                    MetaDaoHelper.insert((String)"pc.product.ProductSKU", (List)((List)entry.getValue()));
                    for (ProductSKU sku : (List)entry.getValue()) {
                        skuIds.add((Long)sku.getId());
                    }
                }
            }
            if (!specItemsInsert.isEmpty()) {
                Set specIds = (Set)cancelData.get("specIds");
                for (Map.Entry entry : specItemsInsert.entrySet()) {
                    MetaDaoHelper.insert((String)"pc.product.ProductSpecItem", (List)((List)entry.getValue()));
                    for (ProductSpecItem specItem : (List)entry.getValue()) {
                        specIds.add((Long)specItem.getId());
                    }
                }
            }
        }
    }

    private Map<String, Map<String, Object>> getAllCustDefineValue(Map<Integer, Map> autoGeneRows) throws Exception {
        List<String> values;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"classId").eq((Object)"productSpec"), QueryCondition.name((String)"isShowSpec").eq((Object)true), QueryCondition.name((String)"type").eq((Object)"CustArchive")});
        QuerySchema schema = QuerySchema.create().addSelect("defineId, type, achiveDefineCode, achiveReturn, showItem, id").addCondition((ConditionExpression)queryConditionGroup);
        List userdefs = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)schema);
        if (CollectionUtils.isEmpty((Collection)userdefs)) {
            return null;
        }
        HashMap<String, Object> userdefsMap = new HashMap<String, Object>(userdefs.size());
        for (Object userdef : userdefs) {
            userdefsMap.put(userdef.get("defineId").toString(), userdef);
        }
        HashMap<String, ArrayList<String>> custValuesMap = new HashMap<String, ArrayList<String>>();
        for (Map.Entry entry : autoGeneRows.entrySet()) {
            for (int i = 1; i <= 10; ++i) {
                String freeKey = "free" + i;
                if (!((Map)entry.getValue()).containsKey(freeKey) || ((Map)entry.getValue()).get(freeKey) == null || !userdefsMap.containsKey(freeKey)) continue;
                values = (List)custValuesMap.get(freeKey);
                if (null == values) {
                    values = new ArrayList<String>();
                    custValuesMap.put(freeKey, (ArrayList<String>)values);
                }
                values.add(((Map)entry.getValue()).get(freeKey).toString().trim());
            }
        }
        HashMap<String, Map<String, Object>> resultMap = new HashMap<String, Map<String, Object>>();
        for (Map.Entry next : custValuesMap.entrySet()) {
            String key = (String)next.getKey();
            values = (ArrayList<String>)next.getValue();
            Map userdefClass = (Map)userdefsMap.get(key);
            List<Map<String, Object>> custValues = "code".equals(userdefClass.get("achiveReturn").toString()) ? this.achiveDataQueryService.getCustDocByCodeAndNames(userdefClass.get("achiveDefineCode").toString(), null, values, null) : this.achiveDataQueryService.getCustDocByCodeAndNames(userdefClass.get("achiveDefineCode").toString(), values, null, null);
            if (CollectionUtils.isEmpty(custValues)) continue;
            String achiveReturn = userdefClass.get("achiveReturn").toString();
            for (Map<String, Object> valueMap : custValues) {
                Object value = valueMap.get(achiveReturn);
                if (value instanceof String) {
                    resultMap.put(key + "_" + value, valueMap);
                } else if (value instanceof Map) {
                    String specItemName;
                    Map dataMap = (Map)value;
                    String locale = InvocationInfoProxy.getLocale();
                    if (null != dataMap.get(locale)) {
                        specItemName = dataMap.get(locale).toString();
                    } else if (null != dataMap.get("zh_CN")) {
                        specItemName = dataMap.get("zh_CN").toString();
                    } else {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800861);
                    }
                    resultMap.put(key + "_" + specItemName, valueMap);
                    valueMap.put("specItemName", specItemName);
                    valueMap.put("specItemCode", dataMap.get("code"));
                }
                valueMap.put("specId", userdefClass.get("id"));
                valueMap.put("specName", userdefClass.get("showItem"));
                valueMap.put("specItemId", valueMap.get("id"));
            }
        }
        return resultMap;
    }

    private void initSkudetailNew(ProductSKU sku, Long productId, Long rangeId, Object productDetailId) throws Exception {
        ArrayList<ProductSkuDetailNew> skuDetailNewList = new ArrayList<ProductSkuDetailNew>();
        ProductSkuDetailNew skuDetailNew = new ProductSkuDetailNew();
        skuDetailNew.putAll((Map)sku.productSKUDetail());
        skuDetailNew.setId((Object)IdManager.getInstance().nextId());
        skuDetailNew.setEntityStatus(EntityStatus.Insert);
        skuDetailNew.setSkuId((Long)sku.getId());
        skuDetailNew.setProductId(productId);
        skuDetailNew.setProductApplyRangeId(rangeId);
        skuDetailNew.setProductDetailId(Long.valueOf(Long.parseLong(productDetailId.toString())));
        skuDetailNewList.add(skuDetailNew);
        MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", skuDetailNewList);
    }

    @Override
    public boolean checkDefaultSKUisUsed(ProductSKU sku) throws Exception {
        ArrayList<ProductSKU> list = new ArrayList<ProductSKU>();
        list.add(sku);
        sku.put("productApplyRangeId", null);
        BillDataDto dto = ProductUtil.getBillDataDto("pc_product", "skudelete", list);
        Map<String, Object> param = ProductUtil.getParamMap(dto);
        ProductSKUDelCheckRule checkRule = (ProductSKUDelCheckRule)((Object)AppContext.getBean((String)"productSKUDelCheckRule"));
        BillContext billContext = ProductUtil.getBillContext("pc_product", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408039A", (String)"\u7269\u6599\u6863\u6848"), "pc.product.Product", "skudelete");
        RuleExecuteResult result = checkRule.execute(billContext, param);
        if (null != result) {
            if (result.getMsgCode() == 1) {
                return false;
            }
            throw new CoreDocBusinessException(null, result.getMessage());
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808013, new Object[]{sku.getProductId(), sku.getId()});
    }

    public void autoGenerateProductSpecItem(Map<Integer, Map> autoGenRowsWithoutSKU, String productIdItem, Map<String, Object> cancelData) throws Exception {
        if (autoGenRowsWithoutSKU != null) {
            Set productIds = autoGenRowsWithoutSKU.values().stream().map(map -> (Long)map.get(productIdItem)).collect(Collectors.toSet());
            List specsInDb = MetaDaoHelper.query((String)"pc.userdef.UserDefineClass", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id as specId", "defineId", "showItem as specName", "userdefines.id as specItemId", "userdefines.name as specItemName"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"classId").eq((Object)"productSpec"), QueryCondition.name((String)"isEnabled").eq((Object)1), QueryCondition.name((String)"defineId").in(ProductUtil.get10FixedFrees())})));
            Map<String, List<Map<String, Object>>> specItemsInDb = specsInDb.stream().collect(Collectors.groupingBy(m -> m.get("defineId").toString()));
            List productSpecItems = MetaDaoHelper.query((String)"pc.product.ProductSpecItem", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds)})));
            Map<Long, List<Map>> productSpecItemsInDb = productSpecItems.stream().collect(Collectors.groupingBy(m -> (Long)m.get("productId")));
            HashMap<Long, List<ProductSpecItem>> specItemsInsert = new HashMap<Long, List<ProductSpecItem>>(autoGenRowsWithoutSKU.keySet().size());
            for (Map.Entry<Integer, Map> entry : autoGenRowsWithoutSKU.entrySet()) {
                Long productId = (Long)entry.getValue().get(productIdItem);
                List<Map<String, Object>> productSpecItemInDb = productSpecItemsInDb.get(productId);
                HashMap<String, String> frees = new HashMap<String, String>(5);
                for (int i = 1; i <= 10; ++i) {
                    String freeKey = "free" + i;
                    if (!entry.getValue().containsKey(freeKey) || entry.getValue().get(freeKey) == null) continue;
                    frees.put(freeKey, entry.getValue().get(freeKey).toString().trim());
                }
                List<ProductSpecItem> specItemInsert = ProductUtil.generateProductSpecItemsByFixedSpecs(productId, frees, specItemsInDb, productSpecItemInDb, null);
                ProductUtil.addDistinctProductSpecItem(specItemsInsert, productId, specItemInsert);
            }
            if (!specItemsInsert.isEmpty()) {
                Set specIds = (Set)cancelData.get("specIds");
                for (Map.Entry entry : specItemsInsert.entrySet()) {
                    MetaDaoHelper.insert((String)"pc.product.ProductSpecItem", (List)((List)entry.getValue()));
                    for (ProductSpecItem specItem : (List)entry.getValue()) {
                        specIds.add((Long)specItem.getId());
                    }
                }
            }
        }
    }

    private void sendProductMessage(Map<Integer, Map> autoRows, String productIdItem, Long transactionId, boolean doMaterial) throws Exception {
        if (autoRows != null) {
            Set productIds = autoRows.values().stream().map(map -> (Long)map.get(productIdItem)).collect(Collectors.toSet());
            List productsInDb = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(productIds)})));
            List rangesInDb = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect(new String[]{"productId", "id"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"isCreator").eq((Object)1)})));
            Map<Long, List<Map>> ranges = rangesInDb.stream().collect(Collectors.groupingBy(m -> (Long)m.get("productId")));
            List specItemsInDb = MetaDaoHelper.query((String)"pc.product.ProductSKUSpecItem", (QuerySchema)QuerySchema.create().addSelect(new String[]{"productId", "skuId", "specId", "specItemId", "specItemId.name as specItemId_Name", "specId.defineId as defineId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds)})).addOrderBy("specId.defineId"));
            Map<Long, List<Map>> specItems = specItemsInDb.stream().filter(map -> Integer.valueOf(map.get("defineId").toString().substring(4)).compareTo(10) < 1).collect(Collectors.groupingBy(m -> (Long)m.get("productId")));
            List specFreesInDb = MetaDaoHelper.query((String)"pc.product.ProductCheckFreeNew", (QuerySchema)QuerySchema.create().addSelect(new String[]{"productId", "checked", "freeId", "freeId.showItem as freeId_Name", "freeId.defineId as freeId_DefineId", "freeType"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").in(productIds), QueryCondition.name((String)"isCreator").eq((Object)true)})));
            Map<Long, List<Map>> specFrees = specFreesInDb.stream().collect(Collectors.groupingBy(m -> (Long)m.get("productId")));
            for (Map product : productsInDb) {
                IRpcRule rpcRule;
                Long productId = (Long)product.get("id");
                product.put("specItems_", specItems.get(productId));
                product.put("productSpecFrees", specFrees.get(productId));
                product.put("productApplyRangeId", ranges.get(productId).get(0).get("id"));
                if (!doMaterial || !ProductUtil.checkOpenOption("u8c-config", "app:ED") || null == (rpcRule = (IRpcRule)AppContext.getBean(IRpcRule.class))) continue;
                BillDataDto dto = ProductUtil.getBillDataDto("pc_product", "save", product);
                Map<String, Object> param = ProductUtil.getParamMap(dto);
                param.put("transactionId", transactionId);
                RuleRegister billRuleRegister = ProductUtil.getBillRuleRegister("pc_product", "save", "materialRule", "engineeringdata");
                billRuleRegister.setConfig("{\"needDTC\":true,\"params\":\"backSourceMap\"}");
                BillContext billContext = ProductUtil.getBillContext("pc_product", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408039A", (String)"\u7269\u6599\u6863\u6848"), "pc.product.Product", "save");
                log.info("sendProductMessage excute rule:{}", (Object)billRuleRegister);
                RuleExecuteResult ruleResult = rpcRule.execute(billRuleRegister, billContext, param);
                if (null == ruleResult) continue;
                log.info("sendProductMessage excute rule result:{}", (Object)ruleResult);
                if (ruleResult.getMsgCode() == 1) continue;
                throw new CoreDocBusinessException(ruleResult.getMessage());
            }
        }
    }
}

