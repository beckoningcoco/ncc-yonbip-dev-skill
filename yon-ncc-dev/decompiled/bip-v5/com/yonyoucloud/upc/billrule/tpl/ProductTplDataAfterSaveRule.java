/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.util.TypeUtils
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.common.enums.OrgGroupTypeEnum
 *  com.yonyoucloud.upc.pc.product.AssistUnitType
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.UnitExchangeType
 *  com.yonyoucloud.upc.pc.tpl.ProductTpl
 *  com.yonyoucloud.upc.pc.tpl.ProductTplSpec
 *  com.yonyoucloud.upc.pc.tpl.ProductTplUnit
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.apache.commons.lang3.ObjectUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.tpl;

import com.alibaba.fastjson.util.TypeUtils;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductUpdateService;
import com.yonyoucloud.upc.common.enums.OrgGroupTypeEnum;
import com.yonyoucloud.upc.datarule.ProductTplService;
import com.yonyoucloud.upc.pc.product.AssistUnitType;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.UnitExchangeType;
import com.yonyoucloud.upc.pc.tpl.ProductTpl;
import com.yonyoucloud.upc.pc.tpl.ProductTplSpec;
import com.yonyoucloud.upc.pc.tpl.ProductTplUnit;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.apache.commons.lang3.ObjectUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="productTplDataAfterSaveRule")
public class ProductTplDataAfterSaveRule
extends AbstractCommonRule {
    @Autowired
    private IUPCProductUpdateService upcProductUpdateService;
    @Autowired
    ProductTplService productTplService;
    @Autowired
    PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    PubOptionService pubOptionService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        ProductTpl tpl = (ProductTpl)bills.get(0);
        if (tpl.getStopstatus().booleanValue()) {
            tpl.put("stopstatus", (Object)1);
        } else {
            tpl.put("stopstatus", (Object)0);
        }
        this.checkSkuBusinessDynamic(tpl);
        this.checkProductTplAssistUnitExchange(tpl);
        return new RuleExecuteResult();
    }

    private void checkSkuBusinessDynamic(ProductTpl tpl) throws Exception {
        int twoDimensionalInputNUm = 0;
        Boolean skuBusinessDynamic = tpl.getSkuBusinessDynamic();
        List productTplSpecSums = tpl.Specs();
        if (productTplSpecSums != null && productTplSpecSums.size() > 0) {
            HashMap<Long, ProductTplSpec> specMap = new HashMap<Long, ProductTplSpec>();
            for (ProductTplSpec spec : productTplSpecSums) {
                Long specification = spec.getSpecification();
                specMap.put(specification, spec);
            }
            Set entries = specMap.entrySet();
            for (Map.Entry next : entries) {
                ProductTplSpec spec = (ProductTplSpec)next.getValue();
                if (EntityStatus.Delete.equals((Object)spec.getEntityStatus())) continue;
                Boolean twoDimensionalInput = spec.getTwoDimensionalInput();
                if (twoDimensionalInput != null && twoDimensionalInput.booleanValue()) {
                    ++twoDimensionalInputNUm;
                }
                Boolean specBusinessDynamic = spec.getSpecBusinessDynamic();
                if (!skuBusinessDynamic.booleanValue() && specBusinessDynamic.booleanValue()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800111);
                }
                if (!skuBusinessDynamic.booleanValue()) continue;
                Long specId = spec.getSpecification();
                QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)specId)}));
                List userdefs = MetaDaoHelper.query((String)"pc.userdef.UserDefineClassSpec", (QuerySchema)schema);
                if (userdefs == null || userdefs.size() <= 0) continue;
                Map userdef = (Map)userdefs.get(0);
                Object isShowSpec = userdef.get("isShowSpec");
                if (isShowSpec != null) {
                    boolean showSpec = (Boolean)isShowSpec;
                    if (showSpec) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800112);
                }
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800112);
            }
        }
        if (twoDimensionalInputNUm > 1) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800113);
        }
    }

    private void checkProductTplAssistUnitExchange(ProductTpl tpl) throws Exception {
        Object batchUnit;
        Object stockUnit;
        Object purchaseUnit;
        Object produceUnit;
        QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq(tpl.getId())}));
        List productTplAssistUnitExchanges = MetaDaoHelper.query((String)"pc.tpl.ProductTplAssistUnitExchange", (QuerySchema)schema);
        HashMap<Long, Long> unitIdMap = new HashMap<Long, Long>();
        schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"template").eq(tpl.getId())}));
        List units = MetaDaoHelper.query((String)"pc.tpl.ProductTplUnit", (QuerySchema)schema);
        Map tplUnit = null;
        if (ObjectUtils.isNotEmpty((Object)units)) {
            tplUnit = (Map)units.get(0);
        }
        Object unit = null;
        if (tplUnit != null) {
            unit = tplUnit.get("unit");
        }
        int num_fixed = 0;
        int num_floating = 0;
        boolean isOpenMultiFloat = this.pubOptionService.isOpenMultiFloat();
        Boolean hasBalance = false;
        if (ObjectUtils.isNotEmpty((Object)productTplAssistUnitExchanges)) {
            for (Map assistUnitExchange : productTplAssistUnitExchanges) {
                Object assistUnit;
                Object unitExchangeType = assistUnitExchange.get("unitExchangeType");
                Object balance = assistUnitExchange.get("balance");
                if (unitExchangeType != null && Short.parseShort(unitExchangeType.toString()) == UnitExchangeType.floating.getValue()) {
                    ++num_floating;
                }
                if (unitExchangeType != null && Short.parseShort(unitExchangeType.toString()) == UnitExchangeType.fixed.getValue()) {
                    ++num_fixed;
                }
                if (null != balance && Integer.parseInt(balance.toString()) == 1) {
                    hasBalance = true;
                }
                if (num_floating > 1) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800114);
                }
                if (!isOpenMultiFloat) {
                    if (num_floating > 0 && num_fixed > 0) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800115);
                    }
                    if (hasBalance.booleanValue()) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MATERIAL_TPL_BALANCE_CAN_NOT_SET_TRUE);
                    }
                }
                if ((assistUnit = assistUnitExchange.get("assistUnit")) == null) continue;
                long assistUnitId = Long.parseLong(assistUnit.toString());
                if (unit != null && assistUnitId == Long.parseLong(unit.toString())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800116);
                }
                unitIdMap.put(assistUnitId, assistUnitId);
            }
        }
        if (tplUnit != null && num_floating == 0) {
            if (unit != null) {
                long l = Long.parseLong(unit.toString());
                unitIdMap.put(l, l);
            }
            if (tplUnit != null) {
                produceUnit = tplUnit.get("produceUnit");
                if (produceUnit != null && !unitIdMap.containsKey(Long.parseLong(produceUnit.toString()))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800117);
                }
                purchaseUnit = tplUnit.get("purchaseUnit");
                if (purchaseUnit != null && !unitIdMap.containsKey(Long.parseLong(purchaseUnit.toString()))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800118);
                }
                stockUnit = tplUnit.get("stockUnit");
                if (stockUnit != null && !unitIdMap.containsKey(Long.parseLong(stockUnit.toString()))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800119);
                }
                batchUnit = tplUnit.get("batchUnit");
                if (batchUnit != null && !unitIdMap.containsKey(Long.parseLong(batchUnit.toString()))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800120);
                }
                Object onlineUnit = tplUnit.get("onlineUnit");
                if (onlineUnit != null && !unitIdMap.containsKey(Long.parseLong(onlineUnit.toString()))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800121);
                }
            }
        } else if (!isOpenMultiFloat && tplUnit != null && num_floating == 1) {
            produceUnit = tplUnit.get("produceUnit");
            if (produceUnit != null && !unitIdMap.containsKey(Long.parseLong(produceUnit.toString()))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800122);
            }
            purchaseUnit = tplUnit.get("purchaseUnit");
            if (purchaseUnit != null && !unitIdMap.containsKey(Long.parseLong(purchaseUnit.toString()))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800123);
            }
            stockUnit = tplUnit.get("stockUnit");
            if (stockUnit != null && !unitIdMap.containsKey(Long.parseLong(stockUnit.toString()))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800124);
            }
            batchUnit = tplUnit.get("batchUnit");
            if (batchUnit != null && !unitIdMap.containsKey(Long.parseLong(batchUnit.toString()))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800125);
            }
            Object requireUnit = tplUnit.get("requireUnit");
            if (requireUnit != null && !unitIdMap.containsKey(Long.parseLong(requireUnit.toString()))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801630);
            }
            Object demandPlanningUnit = tplUnit.get("demandPlanningUnit");
            if (demandPlanningUnit != null && !unitIdMap.containsKey(Long.parseLong(demandPlanningUnit.toString()))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801628);
            }
            Object inspectionUnit = tplUnit.get("inspectionUnit");
            if (inspectionUnit != null && !unitIdMap.containsKey(Long.parseLong(inspectionUnit.toString()))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801629);
            }
        }
        if (tplUnit != null) {
            Object purchasePriceUnit;
            boolean isenableAssistUnit;
            if (unit != null) {
                long l = Long.parseLong(unit.toString());
                unitIdMap.put(l, l);
            }
            String msg = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807A5", (String)"\u91c7\u8d2d\u8ba1\u4ef7\u5355\u4f4d\u5fc5\u987b\u548c\u4e3b\u8ba1\u91cf\u5355\u4f4d\u4e00\u81f4\uff01");
            Object enableAssistUnit = tplUnit.get("enableAssistUnit");
            if (enableAssistUnit != null && (isenableAssistUnit = ((Boolean)enableAssistUnit).booleanValue())) {
                msg = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040807A9", (String)"\u91c7\u8d2d\u8ba1\u4ef7\u5355\u4f4d\u5fc5\u987b\u548c\u4e3b\u8ba1\u91cf\u5355\u4f4d\u6216\u4e00\u4e2a\u8f85\u8ba1\u91cf\u5355\u4f4d\u4e00\u81f4\uff01");
            }
            if ((purchasePriceUnit = tplUnit.get("purchasePriceUnit")) != null && !unitIdMap.containsKey(Long.parseLong(purchasePriceUnit.toString()))) {
                throw new Exception(msg);
            }
        }
    }

    private void pushUnitToProduct(ProductTpl tpl, Object unitId) throws Exception {
        Object tplId = tpl.getId();
        String unitsSql = "productApplyRangeGroup.productDetailId.id, ";
        for (AssistUnitType assistUnitType : AssistUnitType.values()) {
            unitsSql = unitsSql + "productApplyRangeGroup.productDetailId." + assistUnitType + " as detail_" + assistUnitType + ", ";
        }
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productTemplate").eq(tplId), QueryCondition.name((String)"unitUseType").eq((Object)1), QueryCondition.name((String)"productApplyRangeGroup.orgGroupType").eq((Object)OrgGroupTypeEnum.ORIGINAL.getValue())});
        QuerySchema schema = QuerySchema.create().addSelect(unitsSql + "id, unit").addCondition((ConditionExpression)condition);
        List products = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)products) && Objects.isNull(unitId)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_UNIT_IS_REFERENCE_PRODUCT_TEMPLATE);
        }
        for (Map data : products) {
            Product productTemp = new Product();
            productTemp.setId(data.get("id"));
            productTemp.put("unit", unitId);
            ProductExtend productExtend = new ProductExtend();
            productExtend.setId(data.get("id"));
            Object oldUnit = data.get("unit");
            for (AssistUnitType assistUnitType : AssistUnitType.values()) {
                String fieldName = "detail_" + assistUnitType;
                Object uid = data.get(fieldName);
                if (oldUnit != null && uid != null && Long.parseLong(oldUnit.toString()) == Long.parseLong(uid.toString())) {
                    productExtend.set(assistUnitType.toString(), unitId);
                }
                if (oldUnit != uid) continue;
                productExtend.set(assistUnitType.toString(), unitId);
            }
            productTemp.setEntityStatus(EntityStatus.Update);
            productExtend.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"pc.product.Product", (BizObject)productTemp);
            this.updateAllProductsUnits(tpl, data);
        }
    }

    private void updateAllProductsUnits(ProductTpl tpl, Map data) throws Exception {
        HashMap<String, Object> mapParams = new HashMap<String, Object>();
        mapParams.put("productid", data.get("id"));
        mapParams.put("tenantid", AppContext.getCurrentUser().getTenant());
        HashSet<Long> bussnessUnitSet = new HashSet<Long>();
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"template").eq(tpl.getId()));
        QuerySchema querySchema = QuerySchema.create().addSelect("assistUnit").addCondition((ConditionExpression)queryConditionGroup);
        List queryByProductTplUnit = MetaDaoHelper.query((String)"pc.tpl.ProductTplAssistUnitExchange", (QuerySchema)querySchema);
        for (Map map : queryByProductTplUnit) {
            if (!map.containsKey("assistUnit") || !Objects.nonNull(map.get("assistUnit"))) continue;
            bussnessUnitSet.add(TypeUtils.castToLong(map.get("assistUnit")));
        }
        boolean needUpdate = false;
        if (Objects.nonNull(tpl.Units())) {
            ProductTplUnit productTplUnit = (ProductTplUnit)tpl.Units().get(0);
            bussnessUnitSet.add(TypeUtils.castToLong((Object)productTplUnit.getUnit()));
            for (AssistUnitType assistUnitType : AssistUnitType.values()) {
                String fieldName = "detail_" + assistUnitType;
                Object uid = data.get(fieldName);
                if (bussnessUnitSet.contains(TypeUtils.castToLong(uid))) continue;
                needUpdate = true;
                break;
            }
            if (Objects.nonNull(productTplUnit.getPurchaseUnit())) {
                mapParams.put("mainPurchaseUnitId", productTplUnit.getPurchaseUnit());
            }
            if (Objects.nonNull(productTplUnit.getPurchasePriceUnit())) {
                mapParams.put("mainpurchasePriceUnitId", productTplUnit.getPurchasePriceUnit());
            }
            if (Objects.nonNull(productTplUnit.getStockUnit())) {
                mapParams.put("mainStockUnitId", productTplUnit.getStockUnit());
            }
            if (Objects.nonNull(productTplUnit.getProduceUnit())) {
                mapParams.put("mainProduceUnitId", productTplUnit.getProduceUnit());
            }
            if (Objects.nonNull(productTplUnit.getBatchPriceUnit())) {
                mapParams.put("mainBatchPriceUnitId", productTplUnit.getBatchPriceUnit());
            }
            if (Objects.nonNull(productTplUnit.getInspectionUnit())) {
                mapParams.put("mainInspectionUnitId", productTplUnit.getInspectionUnit());
            }
            if (Objects.nonNull(productTplUnit.getBatchUnit())) {
                mapParams.put("mainBatchUnitId", productTplUnit.getBatchUnit());
            }
            if (Objects.nonNull(productTplUnit.getOnlineUnit())) {
                mapParams.put("mainOnlineUnitId", productTplUnit.getOnlineUnit());
            }
            if (Objects.nonNull(productTplUnit.getOfflineUnit())) {
                mapParams.put("mainOfflineUnitId", productTplUnit.getOfflineUnit());
            }
            if (Objects.nonNull(productTplUnit.getOnlineUnit())) {
                mapParams.put("mainOnlineUnitId", productTplUnit.getOnlineUnit());
            }
            if (Objects.nonNull(productTplUnit.getRequireUnit())) {
                mapParams.put("mainRequireUnitId", productTplUnit.getRequireUnit());
            }
            if (Objects.nonNull(productTplUnit.getRequireUnit())) {
                mapParams.put("mainDemandPlanningUnitId", productTplUnit.getRequireUnit());
            }
        }
        if (mapParams.size() > 2 && needUpdate) {
            this.upcProductUpdateService.UpdateBusinessUnit(mapParams);
        }
    }
}

