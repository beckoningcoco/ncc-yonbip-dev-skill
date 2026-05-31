/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.alibaba.fastjson.TypeReference
 *  com.alibaba.fastjson.parser.Feature
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.common.model.rule.RuleRegister
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum
 *  com.yonyoucloud.upc.utils.MathDataUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.common.model.rule.RuleRegister;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.billrule.product.productrulebase.ProductRuleBase;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductApplyRangeDetail;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.VirtualProductAttributeEnum;
import com.yonyoucloud.upc.service.ProductCheckService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.MathDataUtils;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Component(value="productSaveBeforeCheckRule")
public class ProductSaveBeforeCheckRule
extends ProductRuleBase {
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    ProductCheckService productCheckService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        if (CollectionUtils.isEmpty((Collection)bills)) {
            return null;
        }
        Product product = (Product)bills.get(0);
        Map requestData = new HashMap();
        if (map.get("requestData") instanceof String) {
            requestData = (Map)JSON.parseObject((String)map.get("requestData").toString(), (TypeReference)new TypeReference<HashMap<String, Object>>(){}, (Feature[])new Feature[0]);
        } else if (map.get("requestData") instanceof Map) {
            requestData = (Map)map.get("requestData");
        } else if (map.get("requestData") instanceof List) {
            requestData = (Map)((List)map.get("requestData")).get(0);
        }
        Product queryProduct = this.queryProductById(product.getId());
        BizObject productOrgField = this.queryProductOrgField(product);
        this.productCheckService.checkisBatchManageForInsert(product);
        this.productCheckService.checkTurnOverMaterialsFromTrue(billContext, map, product, productOrgField);
        this.checkProductField(billContext, map, product, queryProduct);
        this.checkProductSku(billContext, map, product);
        this.checkLowStock(requestData, productOrgField);
        this.checkValue(requestData, productOrgField, product);
        this.excuteRpcCheckRule(billContext, map);
        this.applingOrgDataProcess(product, productOrgField);
        return new RuleExecuteResult();
    }

    private void applingOrgDataProcess(Product product, BizObject productOrgField) throws Exception {
        BizObject orgFields = new BizObject();
        if (product != null && BooleanUtil.isFalse((Object)product.get("isCreator"))) {
            if (ObjectUtils.isEmpty((Object)productOrgField)) {
                ProductExtend productExtend = this.queryProductExtendById(product.getId());
                orgFields.init((Map)productExtend);
            } else {
                orgFields = productOrgField;
            }
            List productApplyRanges = product.productApplyRange();
            if (!ObjectUtils.isEmpty((Object)productApplyRanges) && ((ProductApplyRange)productApplyRanges.get(0)).productAppliedDetail() != null) {
                ProductApplyRangeDetail productApplyRangeDetail = ((ProductApplyRange)product.productApplyRange().get(0)).productAppliedDetail();
                productApplyRangeDetail.put("costValuation", orgFields.get("costValuation"));
            }
        }
    }

    private void setMapValue(Map<String, String> needCheckMap, Map originData, HashMap<String, Boolean> needSelectFromDBMap, Boolean dataFromDB) {
        for (Map.Entry<String, String> next : needCheckMap.entrySet()) {
            if (dataFromDB.booleanValue() && (!dataFromDB.booleanValue() || !needSelectFromDBMap.get(next.getKey().toString()).booleanValue()) || next.getValue() != null || !originData.containsKey(next.getKey().toString())) continue;
            next.setValue(originData.get(next.getKey().toString()) == null ? null : originData.get(next.getKey().toString()).toString());
            if (dataFromDB.booleanValue()) continue;
            needSelectFromDBMap.put(next.getKey().toString(), false);
        }
    }

    private void checkValue(Map requestData, BizObject productOrgField, Product product) throws Exception {
        HashMap<String, String> needCheckMap = new HashMap<String, String>();
        HashMap<String, Boolean> needSelectFromDBMap = new HashMap<String, Boolean>();
        ProductSaveBeforeCheckRule.initNeedCheckField(requestData, needSelectFromDBMap, needCheckMap);
        if (product.detail() != null) {
            this.setMapValue(needCheckMap, (Map)product.detail(), needSelectFromDBMap, false);
        }
        if (product.productApplyRange() != null && product.productApplyRange().size() > 0 && ((ProductApplyRange)product.productApplyRange().get(0)).productAppliedDetail() != null) {
            this.setMapValue(needCheckMap, (Map)((ProductApplyRange)product.productApplyRange().get(0)).productAppliedDetail(), needSelectFromDBMap, false);
        }
        if (productOrgField != null && productOrgField.size() > 0) {
            this.setMapValue(needCheckMap, (Map)productOrgField, needSelectFromDBMap, true);
        } else {
            BizObject productOrgFieldExtend = new BizObject();
            ProductExtend productExtend = this.queryProductExtendById(product.get("id"));
            productOrgFieldExtend.init((Map)productExtend);
            this.setMapValue(needCheckMap, (Map)productOrgFieldExtend, needSelectFromDBMap, true);
        }
        this.productCheckService.checkManageByInventory(needCheckMap.get("manageByInventory"), needCheckMap.get("checkByProject"), needCheckMap.get("projectTrackStrategy"));
        this.productCheckService.checkValueManageType(needCheckMap.get("valueManageType"), needCheckMap.get("checkByProject"), needCheckMap.get("checkBySalesOrders"), needCheckMap.get("checkByClient"), needCheckMap.get("checkByOutsourcing"));
        this.productCheckService.checkProjectTrackStrategy(needCheckMap.get("projectTrackStrategy"), needCheckMap.get("mtoStrategy"), needCheckMap.get("manageByInventory"), needCheckMap.get("strategyComparisonRule"));
        this.productCheckService.checksingleInspection(needCheckMap.get("singleInspection"), needCheckMap.get("isSerialNoManage"));
        this.productCheckService.checkMtoStrategy(needCheckMap.get("mtoStrategy"), needCheckMap.get("checkBySalesOrders"));
        if (BooleanUtil.isFalse((Object)needCheckMap.get("turnoverMaterials"))) {
            this.productCheckService.checkTurnOverMaterials(product, needCheckMap.get("compensationAmount"), needCheckMap.get("moldingTime"), needCheckMap.get("moldCavities"));
        }
        this.productCheckService.checkTurnOverMaterialsRelateField(product, needCheckMap.get("turnoverMaterials"), needCheckMap.get("amortizationMethod"), needCheckMap.get("measurementCount"), needCheckMap.get("measurementUnit"));
        if ((productOrgField.size() == 0 || productOrgField.get("isBatchManage") != null && BooleanUtil.isFalse((Object)productOrgField.get("isBatchManage"))) && needCheckMap.containsKey("isBatchManage") && BooleanUtil.isTrue((Object)needCheckMap.get("isBatchManage")) && product.getVirtualProductAttribute() != null && (VirtualProductAttributeEnum.Service.getValue().equals(product.getVirtualProductAttribute().toString()) || VirtualProductAttributeEnum.Virtual.getValue().equals(product.getVirtualProductAttribute().toString()) || VirtualProductAttributeEnum.PTO.getValue().equals(product.getVirtualProductAttribute().toString()))) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.IS_BATCH_MANAGEMENT_ERROR, new Object[]{product.getCode()});
        }
    }

    private static void initNeedCheckField(Map requestData, HashMap<String, Boolean> needSelectFromDBMap, HashMap<String, String> needCheckMap) {
        String[] detailFieldNameArray;
        for (String fieldName : detailFieldNameArray = new String[]{"valueManageType", "checkByProject", "checkBySalesOrders", "checkByClient", "checkByOutsourcing", "manageByInventory", "projectTrackStrategy", "mtoStrategy", "strategyComparisonRule", "singleInspection", "isSerialNoManage", "manufacturingStrategy", "businessAttribute", "planDefaultAttribute", "planMethod", "specialMaterials", "prepareFeed", "turnoverMaterials", "amortizationMethod", "measurementCount", "measurementUnit", "compensationAmount", "moldingTime", "moldCavities", "isBatchManage"}) {
            needSelectFromDBMap.put(fieldName, !requestData.containsKey("detail!" + fieldName));
        }
        for (String fieldName : detailFieldNameArray) {
            needCheckMap.put(fieldName, requestData.get("detail!" + fieldName) != null ? requestData.get("detail!" + fieldName).toString() : null);
        }
    }

    private void checkLowStock(Map requestData, BizObject productOrgField) throws Exception {
        Map detail;
        if (requestData.containsKey("detail!lowestStock") && requestData.containsKey("detail!highestStock")) {
            BigDecimal lowestStock = MathDataUtils.getBigDecimal(requestData.get("detail!lowestStock"));
            BigDecimal highestStock = MathDataUtils.getBigDecimal(requestData.get("detail!highestStock"));
            this.checkLowAndHighStock(lowestStock, highestStock);
        } else if (requestData.containsKey("detail!lowestStock") && productOrgField.containsKey((Object)"highestStock")) {
            BigDecimal lowestStock = MathDataUtils.getBigDecimal(requestData.get("detail!lowestStock"));
            BigDecimal highestStock = (BigDecimal)productOrgField.get("highestStock");
            this.checkLowAndHighStock(lowestStock, highestStock);
        } else if (requestData.containsKey("detail!highestStock") && productOrgField.containsKey((Object)"lowestStock")) {
            BigDecimal lowestStock = (BigDecimal)productOrgField.get("lowestStock");
            BigDecimal highestStock = MathDataUtils.getBigDecimal(requestData.get("detail!highestStock"));
            this.checkLowAndHighStock(lowestStock, highestStock);
        } else if (requestData.get("detail") != null && (detail = (Map)requestData.get("detail")).get("highestStock") != null && detail.get("lowestStock") != null) {
            BigDecimal lowestStock = MathDataUtils.getBigDecimal(detail.get("lowestStock"));
            BigDecimal highestStock = MathDataUtils.getBigDecimal(detail.get("highestStock"));
            this.checkLowAndHighStock(lowestStock, highestStock);
        }
    }

    private void checkLowAndHighStock(BigDecimal lowestStock, BigDecimal highestStock) {
        if (Objects.nonNull(lowestStock) && Objects.nonNull(highestStock) && lowestStock.compareTo(highestStock) == 1) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_STOCK_LOWER_THAN_HIGHER_STOCK_ERROR);
        }
    }

    private BizObject queryProductOrgField(Product product) throws Exception {
        if (product != null && product.containsKey((Object)"productApplyRangeId")) {
            BizObject productOrgField = new BizObject();
            if (product.containsKey((Object)"isCreator") && ((Boolean)product.get("isCreator")).booleanValue()) {
                ProductExtend productExtend = this.queryProductExtendById(product.get("id"));
                productOrgField.init((Map)productExtend);
            } else {
                ProductApplyRangeDetail productApplyRangeDetail = this.queryProductApplyRangeDetailById(product.get("productApplyRangeId"));
                productOrgField.init((Map)productApplyRangeDetail);
            }
            return productOrgField;
        }
        return null;
    }

    private ProductApplyRangeDetail queryProductApplyRangeDetailById(Object productApplyRangeId) throws Exception {
        if (productApplyRangeId == null) {
            return null;
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId").eq(productApplyRangeId)}));
        Map productDetail = MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)querySchema);
        if (productDetail != null && !productDetail.isEmpty()) {
            ProductApplyRangeDetail productApplyRangeDetail = new ProductApplyRangeDetail();
            productApplyRangeDetail.init(productDetail);
            productApplyRangeDetail.setId(productApplyRangeId);
            return productApplyRangeDetail;
        }
        return null;
    }

    private ProductExtend queryProductExtendById(Object id) throws Exception {
        if (id == null) {
            return null;
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(id), QueryCondition.name((String)"isCreator").eq((Object)true)}));
        querySchema.setPartitionable(false);
        Map productDetailMap = MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)querySchema);
        if (productDetailMap != null && !productDetailMap.isEmpty()) {
            ProductExtend productExtend = new ProductExtend();
            productExtend.putAll(productDetailMap);
            productExtend.setId(id);
            return productExtend;
        }
        return null;
    }

    private void excuteRpcCheckRule(BillContext billContext, Map<String, Object> map) throws Exception {
        if ((map.containsKey("productTemplateUpdateCheck") || map.containsKey("productSkusUpdateCheck")) && ProductUtil.checkOpenOption("u8c-config", "app:BBSMK,app:B2Bpricing,app:ChannelOperateCenter,app:creditManG,app:B2Bpromoting,service:allowlimitsalelist")) {
            Long tenantId = (Long)AppContext.getTenantId();
            RuleRegister<Long> ruleRegister = this.buildRuleRegister("marketingbill", "pc_product", "save", "productReferCheckForRebateRule", tenantId);
            this.excuteRpcRule(billContext, map, ruleRegister);
        }
    }

    private void checkProductSku(BillContext billContext, Map<String, Object> map, Product product) {
        List productskus;
        List deleteProductskus;
        if (product != null && product.containsKey((Object)"productskus") && product.get("productskus") != null && !CollectionUtils.isEmpty(deleteProductskus = (productskus = product.productskus()).stream().filter(p -> EntityStatus.Delete.equals((Object)p.getEntityStatus())).collect(Collectors.toList()))) {
            map.put("productSkusUpdateCheck", true);
        }
    }

    private void checkProductField(BillContext billContext, Map<String, Object> map, Product product, Product queryProduct) throws Exception {
        QuerySchema querySchemaPurchaseClass;
        Map purchaseClassMap;
        if (product != null && queryProduct != null && product.containsKey((Object)"productTemplate") && product.get("productTemplate") != null && queryProduct.containsKey((Object)"productTemplate") && queryProduct.get("productTemplate") != null && !product.get("productTemplate").equals(queryProduct.get("productTemplate"))) {
            map.put("productTemplateUpdateCheck", true);
        }
        if (product.containsKey((Object)"purchaseClass") && product.get("purchaseClass") != null && !Objects.isNull(purchaseClassMap = MetaDaoHelper.queryOne((String)"pc.cls.PurchaseClass", (QuerySchema)(querySchemaPurchaseClass = QuerySchema.create().addSelect("isEnd").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.get("purchaseClass"))}))))) && purchaseClassMap.containsKey("isEnd") && purchaseClassMap.get("isEnd") != null && ("0".equals(purchaseClassMap.get("isEnd").toString()) || "false".equals(purchaseClassMap.get("isEnd").toString()))) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PROCUREMENT_CATEGORY_IS_NOT_END_LEVEL, new Object[]{product.getCode()});
        }
    }

    private Product queryProductById(Object id) throws Exception {
        if (id == null) {
            return null;
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("productTemplate").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(id)}));
        querySchema.setPartitionable(false);
        List queryProducts = this.productSkuService.query("pc.product.Product", querySchema);
        if (CollectionUtils.isEmpty((Collection)queryProducts)) {
            return null;
        }
        Product queryProduct = (Product)queryProducts.get(0);
        if (queryProduct != null && !queryProduct.isEmpty()) {
            Product product = new Product();
            product.init((Map)queryProduct);
            return product;
        }
        return null;
    }
}

