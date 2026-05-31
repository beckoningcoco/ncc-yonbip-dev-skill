/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.ucf.common.i18n.MessageUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.product.AssistUnitType
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange
 *  com.yonyoucloud.upc.pc.product.ProductDescription
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.pc.product.ProductSkuDetailNew
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.billrule.product;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.ucf.common.i18n.MessageUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductShelfService;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductUpdateService;
import com.yonyoucloud.upc.pc.product.AssistUnitType;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.pc.product.ProductAssistUnitExchange;
import com.yonyoucloud.upc.pc.product.ProductDescription;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.pc.product.ProductSkuDetailNew;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import com.yonyoucloud.upc.service.ProductSkuService;
import com.yonyoucloud.upc.service.UseSkuService;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="productDataProcessAfterSaveRule")
public class ProductDataProcessAfterSaveRule
extends AbstractCommonRule {
    @Autowired
    private IUPCProductUpdateService upcProductUpdateService;
    @Autowired
    private IUPCProductShelfService upcProductShelfService;
    @Autowired
    ProductSkuService productSkuService;
    @Autowired
    PubOptionService pubOptionService;
    @Autowired
    UseSkuService useSkuService;
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        for (BizObject bizObject : this.getBills(billContext, paramMap)) {
            Product bill = (Product)bizObject;
            this.checkUnits((BizObject)bill);
            HashMap<String, Object> params = new HashMap<String, Object>(8);
            params.put("productid", bill.get("id"));
            params.put("tenantid", AppContext.getCurrentUser().getTenant());
            if (bill.get("isCreator").equals(true)) {
                QuerySchema schema;
                List ranges;
                if (StringUtils.isEmpty((Object)bill.get("productApplyRangeId")) && !CollectionUtils.isEmpty((Collection)(ranges = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)(schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(bill.getId()), QueryCondition.name((String)"isCreator").eq(bill.get("isCreator"))}))))))) {
                    params.put("productapplyrangeid", ((Map)ranges.get(0)).get("id"));
                }
                if (bill.containsKey((Object)"isStop") && bill.get("isStop").equals(false)) {
                    boolean enableSKU = false;
                    if (bill.containsKey((Object)"enablesku")) {
                        enableSKU = Boolean.parseBoolean(bill.get("enablesku").toString());
                    }
                    if (enableSKU) {
                        this.upcProductShelfService.enableAllProductSku(Long.parseLong(bill.get("id").toString()), Long.parseLong(bill.get("productApplyRangeId").toString()), Boolean.parseBoolean(bill.get("isCreator").toString()));
                    }
                }
                Map assistUnits = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect("unit as unit , unitUseType as unitUseType ,enableAssistUnit as enableAssistUnit").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.getId())})));
                boolean updateOrgData = false;
                if (assistUnits != null && !assistUnits.isEmpty() && "2".equals(assistUnits.get("unitUseType").toString()) && !((Boolean)assistUnits.get("enableAssistUnit")).booleanValue()) {
                    params.put("mainUnit", assistUnits.get("unit"));
                    updateOrgData = true;
                }
                if (!CollectionUtils.isEmpty((Collection)bill.productDetail())) {
                    ProductDetail productDetail = (ProductDetail)bill.productDetail().stream().filter(detail -> detail.getIsCreator()).collect(Collectors.toList()).get(0);
                    if (productDetail.containsKey((Object)"isCheckFree") && productDetail.getIsCheckFree() != null) {
                        params.put("isCheckFree", productDetail.get("isCheckFree"));
                        updateOrgData = true;
                    }
                    if (productDetail.containsKey((Object)"costValuation") && productDetail.getCostValuation() != null) {
                        params.put("iCostValuation", productDetail.get("costValuation"));
                        updateOrgData = true;
                    }
                }
                if (updateOrgData) {
                    this.upcProductUpdateService.updateTenantInnerUnifiedField(params);
                }
                if (bill.get("description") != null) {
                    ProductDescription description = (ProductDescription)bill.get("description");
                    bill.put("description!id", description.get("id"));
                }
            } else {
                params.put("productApplyRangeId", bill.get("productApplyRangeId"));
                params.put("productapplyrangeid", bill.get("productApplyRangeId"));
                if (bill.containsKey((Object)"isStop") && bill.get("isStop").equals(false)) {
                    boolean enableSKU = false;
                    if (bill.containsKey((Object)"enablesku")) {
                        enableSKU = Boolean.parseBoolean(bill.get("enablesku").toString());
                    }
                    if (enableSKU) {
                        this.upcProductShelfService.enableAllProductSku(Long.parseLong(bill.get("id").toString()), Long.parseLong(bill.get("productApplyRangeId").toString()), Boolean.parseBoolean(bill.get("isCreator").toString()));
                    }
                }
                this.dealSkuDetailByRangeId(bill.getId(), bill.get("productApplyRangeId"));
                this.upcProductUpdateService.UpdateUpDownCountOfApplier(params);
                bill.set("isApplied", (Object)true);
            }
            if (bill.get("_status").equals(EntityStatus.Unchanged)) {
                bill.set("_status", (Object)EntityStatus.Update);
            }
            this.useSkuService.checkProductUseSku(bill);
            this.setOldDataForApi(bill);
        }
        return new RuleExecuteResult();
    }

    private void setOldDataForApi(Product product) {
        List productDepositTimeDetails;
        List productDetails = product.productDetail();
        if (!CollectionUtils.isEmpty((Collection)productDetails)) {
            HashMap productExtend = new HashMap();
            productExtend.putAll((Map)productDetails.get(0));
            product.put("detail", productExtend);
        }
        if (!CollectionUtils.isEmpty((Collection)(productDepositTimeDetails = product.productDepositTimeDetail()))) {
            HashMap time = new HashMap();
            time.putAll((Map)productDepositTimeDetails.get(0));
            product.put("time", time);
        }
    }

    private void dealSkuDetailByRangeId(Object productId, Object productApplyRangeId) throws Exception {
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId), QueryCondition.name((String)"isCreator").eq((Object)true)});
        QuerySchema queryRangeGroupSchema = QuerySchema.create().addSelect("id,productDetailId").addCondition((ConditionExpression)queryConditionGroup);
        List creatorRanges = this.productSkuService.query("pc.product.ProductApplyRange", queryRangeGroupSchema);
        ProductApplyRange creatorRange = (ProductApplyRange)creatorRanges.get(0);
        QueryConditionGroup skuDetailNewForCreatorCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId), QueryCondition.name((String)"productDetailId").eq((Object)creatorRange.getProductDetailId())});
        QuerySchema querySkuDetailNewForCreatorSchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)skuDetailNewForCreatorCondition);
        List productSkuDetailNewForCreatorList = this.productSkuService.query("pc.product.ProductSkuDetailNew", querySkuDetailNewForCreatorSchema);
        queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(productApplyRangeId)});
        queryRangeGroupSchema = QuerySchema.create().addSelect("id,productDetailId").addCondition((ConditionExpression)queryConditionGroup);
        List ranges = this.productSkuService.query("pc.product.ProductApplyRange", queryRangeGroupSchema);
        ProductApplyRange range = (ProductApplyRange)ranges.get(0);
        QueryConditionGroup skuDetailNewForAppliedCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId), QueryCondition.name((String)"productApplyRangeId").eq(productApplyRangeId)});
        QuerySchema querySkuDetailNewForAppliedSchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)skuDetailNewForAppliedCondition);
        List skuDetailNewForAppliedList = this.productSkuService.query("pc.product.ProductSkuDetailNew", querySkuDetailNewForAppliedSchema);
        HashMap<Long, ProductSkuDetailNew> skuDetailNewForAppliedMap = null;
        if (!CollectionUtils.isEmpty((Collection)skuDetailNewForAppliedList)) {
            skuDetailNewForAppliedMap = new HashMap<Long, ProductSkuDetailNew>(skuDetailNewForAppliedList.size());
            for (ProductSkuDetailNew productSkuDetailNew : skuDetailNewForAppliedList) {
                skuDetailNewForAppliedMap.put(productSkuDetailNew.getSkuId(), productSkuDetailNew);
            }
        }
        ArrayList skuDetailListNew = new ArrayList();
        ArrayList<ProductSkuDetailNew> skuDetailNewListNew = new ArrayList<ProductSkuDetailNew>();
        for (ProductSkuDetailNew skuDetailNewForCreator : productSkuDetailNewForCreatorList) {
            if (skuDetailNewForAppliedMap != null && skuDetailNewForAppliedMap.containsKey(skuDetailNewForCreator.getSkuId())) continue;
            ProductSkuDetailNew skuDetailNew = new ProductSkuDetailNew();
            skuDetailNew.putAll((Map)skuDetailNewForCreator);
            Object skuDetailCharacterDefInDb = skuDetailNew.get("skuDetailCharacterDef");
            if (null != skuDetailCharacterDefInDb && skuDetailCharacterDefInDb instanceof Map) {
                Map skuDetailCharacterDef = (Map)skuDetailCharacterDefInDb;
                skuDetailCharacterDef.put("id", IdManager.getInstance().nextId());
                skuDetailCharacterDef.put("_status", EntityStatus.Insert);
            }
            skuDetailNew.setId((Object)IdManager.getInstance().nextId());
            skuDetailNew.setEntityStatus(EntityStatus.Insert);
            skuDetailNew.setProductApplyRangeId(Long.valueOf(Long.parseLong(productApplyRangeId.toString())));
            skuDetailNew.setProductDetailId(range.getProductDetailId());
            skuDetailNew.remove("pubts");
            skuDetailNew.setIsCreator(Boolean.valueOf(false));
            skuDetailNewListNew.add(skuDetailNew);
        }
        if (!CollectionUtils.isEmpty(skuDetailNewListNew)) {
            MetaDaoHelper.insert((String)"pc.product.ProductSkuDetailNew", skuDetailNewListNew);
        }
    }

    private void checkUnits(BizObject product) throws Exception {
        List exchanges = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)QuerySchema.create().addSelect("2".equals(product.get("unitUseType").toString()) ? "productAssistUnitExchanges.id as id, productAssistUnitExchanges.unitExchangeType as unitExchangeType, productAssistUnitExchanges.assistUnit as assistUnit,productAssistUnitExchanges.balance as balance" : "productTemplate.productTplAssistUnitExchanges.id as id, productTemplate.productTplAssistUnitExchanges.unitExchangeType as unitExchangeType, productTemplate.productTplAssistUnitExchanges.assistUnit as assistUnit, productTemplate.productTplAssistUnitExchanges.balance as balance").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.getId())})));
        Map assistUnits = MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)QuerySchema.create().addSelect("purchaseUnit, purchasePriceUnit, stockUnit, produceUnit, batchUnit, onlineUnit, offlineUnit, requireUnit, batchPriceUnit, saleChannel").addSelect(new QueryField[]{new QueryField("productId.unit", "mainUnit")}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productApplyRangeId").eq(product.get("productApplyRangeId"))})));
        int count = 0;
        Boolean openMultiFloat = this.pubOptionService.isOpenMultiFloat();
        Map floatUnitExchange = null;
        Boolean onlineRetailFlag = false;
        Boolean offlineRetailFlag = false;
        Boolean hasBalance = false;
        HashSet allCheckUnits = new HashSet();
        List productAssistUnitExchanges = (List)product.get("productAssistUnitExchanges");
        ArrayList<String> insertDatas = new ArrayList<String>();
        HashMap<String, String> updateDatas = new HashMap<String, String>();
        ArrayList<String> deleteDatas = new ArrayList<String>();
        if (!CollectionUtils.isEmpty((Collection)productAssistUnitExchanges)) {
            for (ProductAssistUnitExchange data : productAssistUnitExchanges) {
                if (data.getEntityStatus() == EntityStatus.Insert && data.getAssistUnit() != null) {
                    insertDatas.add(data.getAssistUnit().toString());
                    continue;
                }
                if (data.getEntityStatus() == EntityStatus.Update && data.getId() != null && data.getAssistUnit() != null) {
                    updateDatas.put(data.getId().toString(), data.getAssistUnit().toString());
                    continue;
                }
                if (data.getEntityStatus() != EntityStatus.Delete || !"2".equals(product.get("unitUseType").toString()) || data.getAssistUnit() == null) continue;
                deleteDatas.add(data.getAssistUnit().toString());
            }
            if (!CollectionUtils.isEmpty(insertDatas)) {
                allCheckUnits.addAll(insertDatas);
            }
        }
        if (!CollectionUtils.isEmpty((Collection)exchanges)) {
            for (Map exchange : exchanges) {
                if (assistUnits.get("mainUnit").toString().equals(exchange.get("assistUnit").toString())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SUB_UNIT_IS_SAME_WITH_MAIN_UNIT, new Object[]{product.get("code").toString()});
                }
                allCheckUnits.add(exchange.get("assistUnit").toString());
                if (updateDatas.containsKey(exchange.get("id").toString())) {
                    allCheckUnits.remove(exchange.get("assistUnit").toString());
                    allCheckUnits.add((String)updateDatas.get(exchange.get("id").toString()));
                }
                if (exchange.get("unitExchangeType") != null && "1".equals(exchange.get("unitExchangeType").toString())) {
                    floatUnitExchange = exchange;
                    ++count;
                }
                if (null == exchange.get("balance") || !"1".equals(exchange.get("balance").toString())) continue;
                hasBalance = true;
            }
            if (openMultiFloat.booleanValue() && count > 1 || !openMultiFloat.booleanValue() && count > 0 && exchanges.size() > 1) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SUB_UNIT_CAN_NOT_SET_MORE_THAN_ONE, new Object[]{product.get("code").toString()});
            }
            if (!openMultiFloat.booleanValue() && hasBalance.booleanValue()) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_BALANCE_CAN_NOT_SET_TRUE, new Object[]{product.get("code").toString()});
            }
            if (count > 0 && assistUnits.containsKey("saleChannel") && !"".equals(assistUnits.get("saleChannel").toString())) {
                String[] saleChannels;
                boolean bCheckSaleChannel = ProductUtil.checkOpenOption("u8c-config", "app:RM") || ProductUtil.checkOpenOption("u8c-config", "app:SDMA") || ProductUtil.checkOpenOption("u8c-config", "app:SDMB") || ProductUtil.checkOpenOption("u8c-config", "app:SCMSA") || ProductUtil.checkOpenOption("u8c-config", "app:CRMC") || ProductUtil.checkOpenOption("u8c-config", "app:SDOC");
                for (String saleChannel : saleChannels = assistUnits.get("saleChannel").toString().split(",")) {
                    if ("2".equals(saleChannel)) {
                        onlineRetailFlag = true;
                    }
                    if (!"3".equals(saleChannel)) continue;
                    offlineRetailFlag = true;
                }
                if (!openMultiFloat.booleanValue() && bCheckSaleChannel && (onlineRetailFlag.booleanValue() || offlineRetailFlag.booleanValue())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SUB_UNIT_CAN_NOT_SET_FIXED_BY_MAIN_UNIT_BY_LINE_TYPE, new Object[]{product.get("code").toString()});
                }
            }
        }
        if (!CollectionUtils.isEmpty(deleteDatas)) {
            allCheckUnits.removeAll(deleteDatas);
        }
        if (null != assistUnits) {
            allCheckUnits.add(assistUnits.get("mainUnit").toString());
        }
        block9: for (AssistUnitType value : AssistUnitType.values()) {
            if (!assistUnits.containsKey(value.toString())) continue;
            if (!allCheckUnits.contains(assistUnits.get(value.toString()).toString())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SUB_UNIT_CAN_NOT_SET_MORE_THAN_ONE_BY_MAIN_UNIT, new Object[]{product.get("code").toString(), MessageUtils.getMessage((String)value.getName())});
            }
            if (floatUnitExchange == null || floatUnitExchange.get("unitExchangeType") == null || !"1".equals(floatUnitExchange.get("unitExchangeType").toString())) continue;
            String floatUnit = floatUnitExchange.get("assistUnit").toString();
            switch (value) {
                case offlineUnit: {
                    if (openMultiFloat.booleanValue() && offlineRetailFlag.booleanValue() && assistUnits.get(value.toString()).toString().equals(floatUnit)) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_DETAIL_OFFLINERETAIL_UNIT_CAN_NOT_SET_FLOATUNIT, new Object[]{product.get("code").toString()});
                    }
                }
                case batchPriceUnit: 
                case purchasePriceUnit: {
                    continue block9;
                }
                case onlineUnit: {
                    if (!openMultiFloat.booleanValue() || !onlineRetailFlag.booleanValue() || !assistUnits.get(value.toString()).toString().equals(floatUnit)) continue block9;
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_DETAIL_ONLINERETAIL_UNIT_CAN_NOT_SET_FLOATUNIT, new Object[]{product.get("code").toString()});
                }
                case batchUnit: 
                case stockUnit: 
                case requireUnit: 
                case purchaseUnit: 
                case produceUnit: {
                    if (openMultiFloat.booleanValue() || assistUnits.get(value.toString()).toString().equals(floatUnit)) continue block9;
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_SUB_UNIT_CAN_NOT_SET_FIXED_BY_MAIN_UNIT, new Object[]{product.get("code").toString(), MessageUtils.getMessage((String)value.getName())});
                }
                default: {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_DETAIL_UNIT_TYPE_ERROR, new Object[]{product.get("code").toString()});
                }
            }
        }
    }
}

