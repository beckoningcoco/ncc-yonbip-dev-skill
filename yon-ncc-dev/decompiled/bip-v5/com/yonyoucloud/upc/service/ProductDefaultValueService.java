/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.billcode.model.QueryBillNumberParam
 *  com.yonyou.iuap.billcode.po.BillNumberPO
 *  com.yonyou.iuap.billcode.po.BillPrefixPO
 *  com.yonyou.iuap.billcode.service.IBillNumberService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.uap.billcode.BillCodeObj
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.transtype.model.BdTransType
 *  com.yonyou.ucf.transtype.model.TransType
 *  com.yonyoucloud.upc.pc.product.Product
 *  com.yonyoucloud.upc.pc.product.ProductDepositTimeExtend
 *  com.yonyoucloud.upc.pc.product.ProductDetail
 *  com.yonyoucloud.upc.pc.product.ProductExtend
 *  com.yonyoucloud.upc.pc.product.ProductionModeEnum
 *  com.yonyoucloud.upc.pc.product.TestRule
 *  com.yonyoucloud.upc.utils.BizObjectUtils
 *  com.yonyoucloud.upc.utils.PingYinUtil
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.model.Entity
 *  org.imeta.core.model.Property
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.billcode.model.QueryBillNumberParam;
import com.yonyou.iuap.billcode.po.BillNumberPO;
import com.yonyou.iuap.billcode.po.BillPrefixPO;
import com.yonyou.iuap.billcode.service.IBillNumberService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.uap.billcode.BillCodeObj;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.transtype.model.BdTransType;
import com.yonyou.ucf.transtype.model.TransType;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.pc.product.Product;
import com.yonyoucloud.upc.pc.product.ProductDepositTimeExtend;
import com.yonyoucloud.upc.pc.product.ProductDetail;
import com.yonyoucloud.upc.pc.product.ProductExtend;
import com.yonyoucloud.upc.pc.product.ProductionModeEnum;
import com.yonyoucloud.upc.pc.product.TestRule;
import com.yonyoucloud.upc.service.CoredocTransTypeService;
import com.yonyoucloud.upc.service.ProductApiDataService;
import com.yonyoucloud.upc.utils.BizObjectUtils;
import com.yonyoucloud.upc.utils.PingYinUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.model.Entity;
import org.imeta.core.model.Property;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="productDefaultValueService")
public class ProductDefaultValueService {
    @Autowired
    CoredocTransTypeService coredocTransTypeService;
    @Autowired
    @Qualifier(value="pc.billApiService")
    private IUPCBillService upcBillService;
    @Autowired
    ProductApiDataService productApiDataService;
    @Autowired
    private IBillNumberService billCodeRuleMgrService;

    public void processTestRule(Product product) throws Exception {
        ProductExtend detail = product.detail();
        if (ObjectUtils.isNotEmpty((Object)detail) && detail.getTestRule() == null) {
            if (EntityStatus.Insert.equals((Object)product.getEntityStatus())) {
                detail.setTestRule(Short.valueOf(TestRule.testByTestItem.getValue()));
            } else if (EntityStatus.Update.equals((Object)product.getEntityStatus())) {
                ProductDetail detailDB = (ProductDetail)MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)QuerySchema.create().addSelect(new String[]{"id", "productApplyRangeId", "testRule"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"productApplyRangeId").eq(product.get("productApplyRangeId"))})));
                if (ObjectUtils.isNotEmpty((Object)detailDB) && detailDB.getTestRule() != null) {
                    detail.setTestRule(detailDB.getTestRule());
                } else {
                    detail.setTestRule(Short.valueOf(TestRule.testByTestItem.getValue()));
                }
            }
        }
    }

    public void setDefaultValueForProductInsert(Product product) throws Exception {
        ProductDepositTimeExtend time;
        if (product == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800585);
        }
        ProductExtend detail = product.detail();
        if (detail == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800586);
        }
        if (detail.getAtpInspection() == null) {
            detail.setAtpInspection(UPCConstants.FALSE_INT);
        }
        if (detail.getCheckByRevenueManagement() == null) {
            detail.setCheckByRevenueManagement(UPCConstants.FALSE_INT);
        }
        if (detail.getOverSigning() == null) {
            detail.setOverSigning(UPCConstants.FALSE_INT);
        }
        if (detail.getTestRule() == null) {
            detail.setTestRule(Short.valueOf(TestRule.testByTestItem.getValue()));
        }
        if (detail.getCanSale() == null) {
            detail.setCanSale(Boolean.valueOf(true));
        }
        if (detail.getIsBatchManage() == null) {
            detail.setIsBatchManage(Boolean.valueOf(false));
        }
        if (detail.getIsExpiryDateManage() == null) {
            detail.setIsExpiryDateManage(Boolean.valueOf(false));
        }
        if (detail.getIsSerialNoManage() == null) {
            detail.setIsSerialNoManage(Boolean.valueOf(false));
        }
        if (detail.getIsBarcodeManage() == null) {
            detail.setIsBarcodeManage(Boolean.valueOf(false));
        }
        if (detail.getAllowNegativeInventory() == null) {
            detail.setAllowNegativeInventory(Boolean.valueOf(false));
        }
        if (detail.get("scanCountUnit") == null) {
            detail.put("scanCountUnit", (Object)0);
        }
        if (detail.get("reservation") == null) {
            detail.put("reservation", (Object)false);
        }
        if (detail.get("inspectionType") == null) {
            detail.put("inspectionType", (Object)0);
        }
        if (detail.getWarehousingByResult() == null) {
            detail.setWarehousingByResult(Boolean.valueOf(false));
        }
        if (detail.get("testRule") == null) {
            detail.put("testRule", (Object)1);
        }
        if (detail.getSupplyType() == null) {
            detail.setSupplyType(Short.valueOf((short)0));
        }
        if (detail.get("ECNControl") == null) {
            detail.put("ECNControl", (Object)false);
        }
        if (detail.get("fullSetInspection") == null) {
            detail.put("fullSetInspection", (Object)0);
        }
        if (detail.getPlanMethod() == null) {
            detail.setPlanMethod(Short.valueOf((short)0));
        }
        if (detail.getKeySubPart() == null) {
            detail.setKeySubPart(Boolean.valueOf(false));
        }
        if (detail.getBatchRule() == null) {
            detail.setBatchRule(Short.valueOf((short)0));
        }
        if (detail.get("lossType") == null) {
            detail.put("lossType", (Object)0);
        }
        if (detail.get("depositDealPayType") == null) {
            detail.put("depositDealPayType", (Object)0);
        }
        if (detail.get("prepareFeed") == null) {
            detail.put("prepareFeed", (Object)false);
        }
        if (detail.get("specialMaterials") == null) {
            detail.put("specialMaterials", (Object)false);
        }
        if (detail.get("virtualPart") == null) {
            detail.put("virtualPart", (Object)false);
        }
        if (detail.getDirectProduction() == null) {
            detail.setDirectProduction(Integer.valueOf(0));
        }
        if (detail.get("demandConsolidation") == null) {
            detail.put("demandConsolidation", (Object)0);
        }
        if (detail.get("demandConsolidationType") == null) {
            detail.put("demandConsolidationType", (Object)0);
        }
        if (detail.get("demandConsolidationUnit") == null) {
            detail.put("demandConsolidationUnit", (Object)0);
        }
        if (detail.get("demandConsolidationNumber") == null) {
            detail.put("demandConsolidationNumber", (Object)1);
        }
        if (detail.get("demandConsolidationDateType") == null) {
            detail.put("demandConsolidationDateType", (Object)0);
        }
        if (detail.get("logisticsRelated") == null) {
            detail.put("logisticsRelated", (Object)false);
        }
        if (detail.get("weighingMode") == null) {
            detail.put("weighingMode", (Object)0);
        }
        if (detail.get("reviewGrossWeight") == null) {
            detail.put("reviewGrossWeight", (Object)false);
        }
        if (detail.get("specialCarTransport") == null) {
            detail.put("specialCarTransport", (Object)false);
        }
        if (product.getRealProductAttribute() != null && detail.getValueManageType() == null) {
            if ("1".equals(product.getRealProductAttribute().toString())) {
                detail.setValueManageType(Short.valueOf((short)0));
            } else if ("2".equals(product.getRealProductAttribute().toString())) {
                detail.setValueManageType(Short.valueOf((short)99));
            }
        }
        if (detail.get("projectTrackStrategy") == null) {
            detail.put("projectTrackStrategy", (Object)0);
        }
        if (detail.get("checkByProject") == null) {
            detail.put("checkByProject", (Object)0);
        }
        if (detail.get("checkBySalesOrders") == null) {
            detail.put("checkBySalesOrders", (Object)0);
        }
        if (detail.get("checkByClient") == null) {
            detail.put("checkByClient", (Object)0);
        }
        if (detail.get("checkByOutsourcing") == null) {
            detail.put("checkByOutsourcing", (Object)0);
        }
        if (detail.get("manageByInventory") == null) {
            detail.put("manageByInventory", (Object)0);
        }
        if (detail.get("checkByBatch") == null) {
            detail.put("checkByBatch", (Object)false);
        }
        if (detail.getSaleStyle() == null) {
            detail.setSaleStyle("1");
        }
        if (detail.getEnableSubscribe() == null) {
            detail.setEnableSubscribe(Boolean.valueOf(false));
        }
        if (detail.getEnableDeposit() == null) {
            detail.setEnableDeposit(Boolean.valueOf(false));
        }
        if (detail.getIEnableCyclePurchase() == null) {
            detail.setIEnableCyclePurchase(Boolean.valueOf(false));
        }
        if (detail.getIsRecommend() == null) {
            detail.setIsRecommend(Boolean.valueOf(false));
        }
        if (detail.getAllowStorePurchase() == null) {
            detail.setAllowStorePurchase(Boolean.valueOf(true));
        }
        if (detail.getIsSaleInOfflineStore() == null) {
            detail.setIsSaleInOfflineStore(Boolean.valueOf(true));
        }
        if (detail.getIsPriceChangeAllowed() == null) {
            detail.setIsPriceChangeAllowed(Boolean.valueOf(false));
        }
        if (detail.getIsOfflineStoreOrder() == null) {
            detail.setIsOfflineStoreOrder(Boolean.valueOf(true));
        }
        if (detail.getIsOfflineStoreReturn() == null) {
            detail.setIsOfflineStoreReturn(Boolean.valueOf(true));
        }
        if (detail.getRetailPriceDimension() == null) {
            detail.setRetailPriceDimension(Short.valueOf((short)1));
        }
        if (detail.getDeliverQuantityChange() == null) {
            detail.setDeliverQuantityChange(Short.valueOf((short)1));
        }
        if (detail.getIsProcess() == null) {
            detail.setIsProcess(Boolean.valueOf(false));
        }
        if (detail.getIsMaterial() == null) {
            detail.setIsMaterial(Boolean.valueOf(false));
        }
        if (detail.getIsWeight() == null) {
            detail.setIsWeight(Boolean.valueOf(false));
        }
        if (product.getProductFamily() == null) {
            product.setProductFamily(Integer.valueOf(0));
        }
        if (detail.getIsDisplayPrice() == null) {
            detail.setIsDisplayPrice(Boolean.valueOf(true));
        }
        if (detail.getIStatus() == null) {
            detail.setIStatus(Boolean.valueOf(false));
        }
        if (detail.getIUOrderStatus() == null) {
            detail.setIUOrderStatus(Boolean.valueOf(false));
        }
        if (detail.getEnablemodifyDeposit() == null) {
            detail.setEnablemodifyDeposit(Boolean.valueOf(false));
        }
        if (detail.get("turnoverMaterials") == null) {
            detail.put("turnoverMaterials", (Object)0);
        }
        if (detail.get("turnoverMaterials") != null && BooleanUtil.isTrue((Object)detail.get("turnoverMaterials").toString()) && detail.get("amortizationMethod") == null) {
            detail.put("amortizationMethod", (Object)0);
        }
        if (detail.getDepositPayType() == null) {
            detail.setDepositPayType(Integer.valueOf(0));
        }
        if (product.time() != null) {
            time = product.time();
            if (time.getIControlTime() == null) {
                time.setIControlTime(Boolean.valueOf(false));
            }
            if (time.getControlTimeType() == null) {
                time.setControlTimeType(Integer.valueOf(0));
            }
        } else {
            time = new ProductDepositTimeExtend();
            time.setIControlTime(Boolean.valueOf(false));
            time.setControlTimeType(Integer.valueOf(0));
            time.setEntityStatus(EntityStatus.Insert);
            product.setTime(time);
        }
        if (detail.getPlanDefaultAttribute() == null && detail.getBusinessAttribute() != null) {
            String businessAttribute = detail.getBusinessAttribute();
            if (businessAttribute.contains("3")) {
                detail.setPlanDefaultAttribute(Short.valueOf((short)3));
            } else if (businessAttribute.contains("1") && !businessAttribute.contains("2")) {
                detail.setPlanDefaultAttribute(Short.valueOf((short)1));
            } else if (businessAttribute.contains("2") && !businessAttribute.contains("1")) {
                detail.setPlanDefaultAttribute(Short.valueOf((short)5));
            }
        }
        if (detail.getEnableSparePartsManagement() == null) {
            detail.setEnableSparePartsManagement(Integer.valueOf(0));
        }
        if (detail.getEnableStockExpireCheck() == null) {
            detail.setEnableStockExpireCheck(Integer.valueOf(0));
        }
        if (detail.getSendInspection() == null) {
            detail.setSendInspection(Integer.valueOf(0));
        }
        if (detail.getReturnInspection() == null) {
            detail.setReturnInspection(Integer.valueOf(0));
        }
        if (product.getSalesAndOperations() == null) {
            product.setSalesAndOperations(Integer.valueOf(0));
        }
        if (product.getIsRegistrationManager() == null) {
            product.setIsRegistrationManager(Boolean.valueOf(false));
        }
        if (product.getIsAuthorizationManager() == null) {
            product.setIsAuthorizationManager(Boolean.valueOf(false));
        }
        if (product.getEnableAssistUnit() == null) {
            product.setEnableAssistUnit(Boolean.valueOf(false));
        }
        if (product.getIsOptionalMaterial() == null) {
            product.setIsOptionalMaterial(Integer.valueOf(0));
        }
        if (product.getIsDerivedMaterial() == null) {
            product.setIsDerivedMaterial(Integer.valueOf(0));
        }
        if (product.getTransType() == null) {
            this.setLifeCycleDataDefaultValue(product);
        }
        if (detail.getStopstatus() == null) {
            detail.setStopstatus(Boolean.valueOf(false));
        }
        if (detail.get("productionMode") == null) {
            detail.set("productionMode", (Object)ProductionModeEnum.discreteManufacture.getValue());
        }
        if (BooleanUtil.isTrue((Object)product.get("isOptionalMaterial"))) {
            if (detail.get("mtoStrategy") == null) {
                detail.set("mtoStrategy", (Object)1);
            }
            if (detail.get("strategyComparisonRule") == null) {
                detail.set("strategyComparisonRule", (Object)1);
            }
            if (detail.get("manufacturingStrategy") == null) {
                detail.set("manufacturingStrategy", (Object)"MTO");
            }
        }
        if (detail.get("manufacturingStrategy") != null && "MTO".equals(detail.get("manufacturingStrategy").toString())) {
            if (detail.get("mtoStrategy") == null) {
                detail.set("mtoStrategy", (Object)1);
            }
            if (detail.get("strategyComparisonRule") == null) {
                detail.set("strategyComparisonRule", (Object)1);
            }
        } else {
            if (detail.get("mtoStrategy") == null) {
                detail.set("mtoStrategy", (Object)0);
                detail.set("strategyComparisonRule", (Object)0);
            }
            if (detail.get("strategyComparisonRule") == null) {
                detail.set("strategyComparisonRule", (Object)0);
            }
        }
        if (detail.get("deliveryMethod") == null) {
            detail.set("deliveryMethod", (Object)"1,2,3");
        }
    }

    public void setDefaultValueForProductUpdate(Product product) throws Exception {
        QuerySchema schema;
        List extend;
        if (product == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800585);
        }
        ProductExtend detail = product.detail();
        if (detail == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800586);
        }
        if (!(detail.get("iStatus") != null && detail.get("iUOrderStatus") != null || CollectionUtils.isEmpty((Collection)(extend = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)(schema = QuerySchema.create().addSelect("iStatus,iUOrderStatus").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"isCreator").eq((Object)true)}))))))) {
            if (detail.get("iStatus") == null) {
                detail.put("iStatus", ((Map)extend.get(0)).get("iStatus"));
            }
            if (detail.get("iUOrderStatus") == null) {
                detail.put("iUOrderStatus", ((Map)extend.get(0)).get("iUOrderStatus"));
            }
        }
    }

    public void setDefaultValueForProductDetailUpdate(Product product) throws Exception {
        if (product == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800585);
        }
        ProductExtend detail = product.detail();
        if (detail == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800586);
        }
        QuerySchema schema = QuerySchema.create().addSelect("iStatus,iUOrderStatus,isExpiryDateManage").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"productId").eq(product.getId()), QueryCondition.name((String)"isCreator").eq((Object)true)});
        List extend = MetaDaoHelper.query((String)"pc.product.ProductDetail", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Collection)extend)) {
            if (detail.get("iStatus") == null) {
                detail.put("iStatus", ((Map)extend.get(0)).get("iStatus"));
            }
            if (detail.get("iUOrderStatus") == null) {
                detail.put("iUOrderStatus", ((Map)extend.get(0)).get("iUOrderStatus"));
            }
        }
    }

    public void setLifeCycleDataDefaultValue(Product product) throws Exception {
        Map<String, Object> lifeCycleTemplateData;
        if (product.getTransType() == null) {
            List<TransType> transTypes = this.coredocTransTypeService.getTransTypeByFormId("PC.pc_product");
            if (CollectionUtils.isEmpty(transTypes)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.COMMON_TRANS_TYPE_NOT_FOUND);
            }
            product.setTransType(transTypes.get(0).getId());
            product.put("transType_Name", (Object)transTypes.get(0).getName().toString());
        }
        if ((lifeCycleTemplateData = this.getLifeCycleTemplateData(product.get("transType").toString())).get("lifeCycleTemplate") != null) {
            product.setLifeCycleTemplate(lifeCycleTemplateData.get("lifeCycleTemplate").toString());
        }
        if (product.getMaterialStatus() == null && lifeCycleTemplateData.get("materialStatus") != null) {
            product.setMaterialStatus(lifeCycleTemplateData.get("materialStatus").toString());
        }
        if (product.detail() != null && product.detail().getMaterialStatus() == null && lifeCycleTemplateData.get("materialStatus") != null) {
            product.detail().setMaterialStatus(lifeCycleTemplateData.get("materialStatus").toString());
        }
    }

    public Map<String, Object> getLifeCycleTemplateData(String transtypeId) throws Exception {
        Map extendAttrsMap;
        HashMap<String, Object> lifeCycleTemplateData = new HashMap<String, Object>();
        BdTransType bdTransType = this.coredocTransTypeService.getTransTypeDataById(transtypeId);
        if (bdTransType != null && bdTransType.getExtendAttrsJson() != null && (extendAttrsMap = (Map)JSON.parseObject((String)bdTransType.getExtendAttrsJson(), HashMap.class)).get("lifeCycleTemplate") != null && !"".equals(extendAttrsMap.get("lifeCycleTemplate").toString())) {
            Map<String, Object> materialStatusData;
            lifeCycleTemplateData.put("lifeCycleTemplate", extendAttrsMap.get("lifeCycleTemplate"));
            QuerySchema schema = QuerySchema.create().addSelect("id,code,name").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)extendAttrsMap.get("lifeCycleTemplate").toString())});
            List lifeCycleTemplates = MetaDaoHelper.query((String)"pc.manage.LifeCycleTemplate", (QuerySchema)schema);
            if (!CollectionUtils.isEmpty((Collection)lifeCycleTemplates)) {
                lifeCycleTemplateData.put("lifeCycleTemplate_Name", ((Map)lifeCycleTemplates.get(0)).get("name"));
            }
            if ((materialStatusData = this.getMaterialStatusData(extendAttrsMap.get("lifeCycleTemplate").toString())) != null && !materialStatusData.isEmpty()) {
                lifeCycleTemplateData.putAll(materialStatusData);
            }
        }
        return lifeCycleTemplateData;
    }

    public Map<String, Object> getMaterialStatusData(String lifeCycleTemplateId) throws Exception {
        HashMap<String, Object> materialStatusData = new HashMap<String, Object>();
        List<Map<String, Object>> lifeCycleDetails = this.getMaterialStatusDataBylifeCycleTemplateId(lifeCycleTemplateId);
        if (!CollectionUtils.isEmpty(lifeCycleDetails)) {
            materialStatusData.put("materialStatus", lifeCycleDetails.get(0).get("materialStatusId"));
            materialStatusData.put("materialStatus_Name", lifeCycleDetails.get(0).get("materialStatus_Name"));
            for (Map<String, Object> lifeCycleDetail : lifeCycleDetails) {
                if (lifeCycleDetail.get("isDefault") == null || !"1".equals(lifeCycleDetail.get("isDefault").toString())) continue;
                materialStatusData.put("materialStatus", lifeCycleDetail.get("materialStatusId"));
                materialStatusData.put("materialStatus_Name", lifeCycleDetail.get("materialStatus_Name"));
            }
        }
        return materialStatusData;
    }

    public List<Map<String, Object>> getMaterialStatusDataBylifeCycleTemplateId(String lifeCycleTemplateId) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id,materialStatusId,materialStatusId.name as materialStatus_Name,isDefault").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"lifeCycleTemplateId").eq((Object)lifeCycleTemplateId)});
        List lifeCycleDetails = MetaDaoHelper.query((String)"pc.manage.LifeCycleDetail", (QuerySchema)schema);
        return lifeCycleDetails;
    }

    public void setDefultValueForProductDetailImport(Product product) throws Exception {
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (product.get("id") != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId").eq(product.get("id")));
        } else if (product.get("code") != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"productId.code").eq(product.get("code")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800587);
        }
        if (product.get("productApplyRange_OrgId_Name") != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId.code").eq(product.get("productApplyRange_OrgId_Name")));
        } else if (product.get("productApplyRange_OrgId") != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq(product.get("productApplyRange_OrgId")));
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800588);
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,productId,orgId,isApplied,isCreator").addCondition((ConditionExpression)queryConditionGroup);
        List productapplys = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)schema);
        if (CollectionUtils.isEmpty((Collection)productapplys)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800589);
        }
        product.put("productApplyRange_OrgId", (Object)((Map)productapplys.get(0)).get("orgId").toString());
        product.put("productApplyRangeId", (Object)((Map)productapplys.get(0)).get("id").toString());
        product.put("isCreator", ((Map)productapplys.get(0)).get("isCreator"));
        product.put("isApplied", ((Map)productapplys.get(0)).get("isApplied"));
        BillDataDto billtemp = new BillDataDto("pc_productdetail", ((Map)productapplys.get(0)).get("productId").toString());
        HashMap<String, Comparable<Long>> params = new HashMap<String, Comparable<Long>>();
        params.put("@productApplyRangeId", Long.valueOf(Long.parseLong(((Map)productapplys.get(0)).get("id").toString())));
        params.put("isCreator", Boolean.valueOf(Boolean.parseBoolean(((Map)productapplys.get(0)).get("isCreator").toString())));
        params.put("isApplied", Boolean.valueOf(Boolean.parseBoolean(((Map)productapplys.get(0)).get("isApplied").toString())));
        billtemp.setMapCondition(params);
        if (product.get("detail") != null) {
            Map detail = (Map)product.get("detail");
            Map productDetailInDb = this.upcBillService.detail(billtemp);
            for (String key : productDetailInDb.keySet()) {
                if (key.startsWith("detail!")) {
                    String newKey = key.replace("detail!", "");
                    if (detail.containsKey(newKey)) continue;
                    detail.put(key.replace("detail!", ""), productDetailInDb.get(key));
                    continue;
                }
                if (product.containsKey((Object)key)) continue;
                product.put(key, productDetailInDb.get(key));
            }
            this.productApiDataService.dealDetailDataForDetailSave(detail);
            this.productApiDataService.dealChildObjecType((Map<String, Object>)product);
            if (detail.get("productExtendCharacterDef") != null) {
                if (detail.get("productExtendCharacterDef__id") != null) {
                    ((Map)detail.get("productExtendCharacterDef")).put("id", detail.get("productExtendCharacterDef__id"));
                    ((Map)detail.get("productExtendCharacterDef")).put("_status", EntityStatus.Update);
                } else {
                    Map detailCharacterDef;
                    BizObject characterDef = new BizObject();
                    Map extendCharacterDef = (Map)this.getProductDetail(product.getId()).get("productExtendCharacterDef");
                    if (ObjectUtils.isNotEmpty((Object)extendCharacterDef)) {
                        characterDef.putAll(extendCharacterDef);
                    }
                    if (ObjectUtils.isNotEmpty((Object)(detailCharacterDef = (Map)detail.get("productExtendCharacterDef")))) {
                        characterDef.putAll(detailCharacterDef);
                    }
                    characterDef.put("id", (Object)IdManager.getInstance().nextId());
                    characterDef.put("_status", (Object)EntityStatus.Insert);
                    detail.put("productExtendCharacterDef", characterDef);
                }
            }
        }
    }

    private ProductExtend getProductDetail(Object productId) throws Exception {
        ProductExtend productDetail = new ProductExtend();
        if (productId != null) {
            QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq(productId), QueryCondition.name((String)"isCreator").eq((Object)"true")});
            QuerySchema querySchema = QuerySchema.create().addSelect("productExtendCharacterDef").addCondition((ConditionExpression)conditionGroup);
            Map productDetailMap = MetaDaoHelper.queryOne((String)"pc.product.ProductDetail", (QuerySchema)querySchema);
            if (ObjectUtils.isNotEmpty((Object)productDetailMap)) {
                productDetail.init(productDetailMap);
            }
        }
        return productDetail;
    }

    public void setMainDataForProductDetailImport(Product product, Map productInDb) {
        if (product.get("name") == null && productInDb.get("name") != null) {
            product.setName(productInDb.get("name").toString());
        }
        if (product.get("modelDescription") == null && productInDb.get("modelDescription") != null) {
            product.setModelDescription(productInDb.get("modelDescription").toString());
        }
        if (product.get("model") == null && productInDb.get("model") != null) {
            product.setModel(productInDb.get("model").toString());
        }
        if (product.getManageClass() == null && productInDb.get("manageClass") != null) {
            product.setManageClass(Long.valueOf(Long.parseLong(productInDb.get("manageClass").toString())));
        }
        if (product.getProductClass() == null && productInDb.get("productClass") != null) {
            product.setProductClass(Long.valueOf(Long.parseLong(productInDb.get("productClass").toString())));
        }
        if (product.getUnit() == null && productInDb.get("unit") != null) {
            product.setUnit(Long.valueOf(Long.parseLong(productInDb.get("unit").toString())));
        }
        if (product.getUnitUseType() == null && productInDb.get("unitUseType") != null) {
            product.setUnitUseType(Short.valueOf(Short.parseShort(productInDb.get("unitUseType").toString())));
        }
    }

    public void setDefultValueForProductUpdateImport(Product product, Map<String, Object> productDetail) throws Exception {
        if (product.detail().get("iStatus") == null) {
            product.detail().put("iStatus", productDetail.get("iStatus"));
        }
        if (product.detail().get("iUOrderStatus") == null) {
            product.detail().put("iUOrderStatus", productDetail.get("iUOrderStatus"));
        }
        if (product.detail().containsKey((Object)"isDisplayPrice") && product.detail().get("isDisplayPrice") == null) {
            product.detail().put("isDisplayPrice", productDetail.get("isDisplayPrice"));
        }
        if (product.detail().containsKey((Object)"canSale") && product.detail().get("canSale") == null) {
            product.detail().put("canSale", productDetail.get("canSale"));
        }
        if (product.detail().containsKey((Object)"warehousingByResult") && product.detail().get("warehousingByResult") == null) {
            product.detail().put("warehousingByResult", productDetail.get("warehousingByResult"));
        }
        if (product.detail().containsKey((Object)"ECNControl") && product.detail().get("ECNControl") == null) {
            product.detail().put("ECNControl", productDetail.get("ECNControl"));
        }
        if (product.detail().containsKey((Object)"fullSetInspection") && product.detail().get("fullSetInspection") == null) {
            product.detail().put("fullSetInspection", productDetail.get("fullSetInspection"));
        }
        if (product.detail().containsKey((Object)"keySubPart") && product.detail().get("keySubPart") == null) {
            product.detail().put("keySubPart", productDetail.get("keySubPart"));
        }
        if (product.detail().containsKey((Object)"specialMaterials") && product.detail().get("specialMaterials") == null) {
            product.detail().put("specialMaterials", productDetail.get("specialMaterials"));
        }
        if (product.detail().containsKey((Object)"virtualPart") && product.detail().get("virtualPart") == null) {
            product.detail().put("virtualPart", productDetail.get("virtualPart"));
        }
        if (product.detail().containsKey((Object)"prepareFeed") && product.detail().get("prepareFeed") == null) {
            product.detail().put("prepareFeed", productDetail.get("prepareFeed"));
        }
        if (product.detail().containsKey((Object)"iEnableCyclePurchase") && product.detail().get("iEnableCyclePurchase") == null) {
            product.detail().put("iEnableCyclePurchase", productDetail.get("iEnableCyclePurchase"));
        }
        if (product.detail().containsKey((Object)"isRecommend") && product.detail().get("isRecommend") == null) {
            product.detail().put("isRecommend", productDetail.get("isRecommend"));
        }
        if (product.detail().containsKey((Object)"enableSparePartsManagement") && product.detail().get("enableSparePartsManagement") == null) {
            product.detail().put("enableSparePartsManagement", productDetail.get("enableSparePartsManagement"));
        }
        if (product.detail().containsKey((Object)"saleChannelOfOfflineRetail") && product.detail().get("saleChannelOfOfflineRetail") == null) {
            product.detail().put("saleChannelOfOfflineRetail", productDetail.get("saleChannelOfOfflineRetail"));
        }
        if (product.detail().containsKey((Object)"isBarcodeManage") && product.detail().get("isBarcodeManage") == null) {
            product.detail().put("isBarcodeManage", productDetail.get("isBarcodeManage"));
        }
        if (product.detail().containsKey((Object)"manageByInventory") && product.detail().get("manageByInventory") == null) {
            product.detail().put("manageByInventory", productDetail.get("manageByInventory"));
        }
        if (product.detail().containsKey((Object)"returnsWarehousingByResult") && product.detail().get("returnsWarehousingByResult") == null) {
            product.detail().put("returnsWarehousingByResult", productDetail.get("returnsWarehousingByResult"));
        }
        if (product.detail().containsKey((Object)"bindCarrier") && product.detail().get("bindCarrier") == null) {
            product.detail().put("bindCarrier", productDetail.get("bindCarrier"));
        }
        if (product.detail().containsKey((Object)"workingPlan") && product.detail().get("workingPlan") == null) {
            product.detail().put("workingPlan", productDetail.get("workingPlan"));
        }
        if (product.detail().containsKey((Object)"projectTrackStrategy") && product.detail().get("projectTrackStrategy") == null) {
            product.detail().put("projectTrackStrategy", productDetail.get("projectTrackStrategy"));
        }
        if (product.detail().containsKey((Object)"logisticsRelated") && product.detail().get("logisticsRelated") == null) {
            product.detail().put("logisticsRelated", productDetail.get("logisticsRelated"));
        }
        if (product.detail().containsKey((Object)"fixedReturn") && product.detail().get("fixedReturn") == null) {
            product.detail().put("fixedReturn", productDetail.get("fixedReturn"));
        }
        if (product.detail().containsKey((Object)"reviewGrossWeight") && product.detail().get("reviewGrossWeight") == null) {
            product.detail().put("reviewGrossWeight", productDetail.get("reviewGrossWeight"));
        }
        if (product.detail().containsKey((Object)"specialCarTransport") && product.detail().get("specialCarTransport") == null) {
            product.detail().put("specialCarTransport", productDetail.get("specialCarTransport"));
        }
        if (product.detail().containsKey((Object)"mtoStrategy") && product.detail().get("mtoStrategy") == null) {
            product.detail().put("mtoStrategy", productDetail.get("mtoStrategy"));
        }
        if (product.detail().containsKey((Object)"strategyComparisonRule") && product.detail().get("strategyComparisonRule") == null) {
            product.detail().put("strategyComparisonRule", productDetail.get("strategyComparisonRule"));
        }
        if (product.detail().containsKey((Object)"reservation") && product.detail().get("reservation") == null) {
            product.detail().put("reservation", productDetail.get("reservation"));
        }
        if (product.detail().containsKey((Object)"inspectionType") && product.detail().get("inspectionType") == null) {
            product.detail().put("inspectionType", productDetail.get("inspectionType"));
        }
        if (!product.detail().containsKey((Object)"planDefaultAttribute")) {
            product.detail().put("planDefaultAttribute", productDetail.get("planDefaultAttribute"));
        }
        if (!product.detail().containsKey((Object)"planDefaultAttribute")) {
            product.detail().put("planDefaultAttribute", productDetail.get("planDefaultAttribute"));
        }
        if (!product.detail().containsKey((Object)"checkByProject")) {
            product.detail().put("checkByProject", productDetail.get("checkByProject"));
        }
        if (!product.detail().containsKey((Object)"checkBySalesOrders")) {
            product.detail().put("checkBySalesOrders", productDetail.get("checkBySalesOrders"));
        }
        if (!product.detail().containsKey((Object)"checkByOutsourcing")) {
            product.detail().put("checkByOutsourcing", productDetail.get("checkByOutsourcing"));
        }
        if (!product.detail().containsKey((Object)"checkByClient")) {
            product.detail().put("checkByClient", productDetail.get("checkByClient"));
        }
        if (!product.detail().containsKey((Object)"singleInspection")) {
            product.detail().put("singleInspection", productDetail.get("singleInspection"));
        }
    }

    public String generateMnemonicCode(String productName) {
        try {
            return PingYinUtil.getFirstSpell((String)productName);
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800590);
        }
    }

    public void addCreateNewCodeType(Product product, List<Map> products) throws Exception {
        List billPrefixList;
        BillNumberPO billCodeRuleConfig = this.getBillCodeRuleConfig(product);
        if (billCodeRuleConfig != null && 0 != billCodeRuleConfig.getBillnumMode() && null != billCodeRuleConfig.getCallTime() && 0 == billCodeRuleConfig.getCallTime() && !CollectionUtils.isEmpty((Collection)(billPrefixList = billCodeRuleConfig.getBillPrefix()))) {
            List fieldNames = billPrefixList.stream().filter(v -> 0 == v.getCprefixtype()).map(BillPrefixPO::getCfieldname).filter(Objects::nonNull).collect(Collectors.toList());
            List<String> standardFieldNames = fieldNames.stream().filter(v -> v != null && StringUtils.isNotEmpty((CharSequence)v.trim()) && !v.startsWith("productCharacterDef.")).collect(Collectors.toList());
            List<String> characterFieldNames = fieldNames.stream().filter(v -> v != null && v.startsWith("productCharacterDef.")).collect(Collectors.toList());
            if (this.dealStandardField(standardFieldNames, product) || this.dealCharacterField(characterFieldNames, product)) {
                product.put("forceUpdateCode", (Object)true);
            }
        }
    }

    private BillNumberPO getBillCodeRuleConfig(Product product) {
        QueryBillNumberParam param = new QueryBillNumberParam(false, "pc_product", "productcenter.pc_product", "-1");
        param.setBillNum("pc_product");
        param.setExtInfo(new HashMap());
        param.getExtInfo().put("listenFieldNameSet", new HashSet());
        return this.billCodeRuleMgrService.findCompleteBillNumberByBill(param, new BillCodeObj((Map)new BizObject((Map)product)));
    }

    private boolean dealStandardField(List<String> standardFieldNames, Product product) throws Exception {
        if (ObjectUtils.isNotEmpty(standardFieldNames)) {
            Map<String, Property> standardFieldMap = this.getStandardFieldByUri("pc.product.Product");
            HashSet<String> standardFieldSet = new HashSet<String>();
            for (String string : standardFieldNames) {
                String[] split = StringUtils.split((String)string, (String)".");
                if (!StringUtils.isNotEmpty((CharSequence)split[0]) || !standardFieldMap.containsKey(split[0])) continue;
                standardFieldSet.add(split[0]);
            }
            Product productSource = new Product();
            for (Map.Entry entry : product.entrySet()) {
                String field = (String)entry.getKey();
                Property property = standardFieldMap.get(entry.getKey());
                if (field == null || !standardFieldSet.contains(field) || property == null) continue;
                String locale = InvocationInfoProxy.getLocale();
                if (property.isMultiLangAttr() && locale != null) {
                    Map multiLangMap = (Map)entry.getValue();
                    if (multiLangMap == null || !multiLangMap.containsKey(locale)) continue;
                    productSource.put(field, multiLangMap.get(locale));
                    continue;
                }
                productSource.put(field, entry.getValue());
            }
            if (!standardFieldSet.isEmpty()) {
                QuerySchema querySchema = QuerySchema.create().addSelect(StringUtils.join(standardFieldSet, (String)",")).appendQueryCondition(new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.getId())})});
                Map productDB = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)querySchema);
                List differentValueVOS = BizObjectUtils.compareBizObject((BizObject)BizObject.fromMap((Map)productDB), (BizObject)productSource);
                return ObjectUtils.isNotEmpty((Object)differentValueVOS);
            }
        }
        return false;
    }

    private Map<String, Property> getStandardFieldByUri(String entityName) throws Exception {
        HashMap<String, Property> propertyMap = new HashMap<String, Property>();
        Entity entity = MetaDaoHelper.getEntity((String)entityName);
        if (entity != null && entity.attrMap() != null) {
            for (Property property : entity.attrMap()) {
                if (property == null || BooleanUtil.isTrue((Object)property.isCompositionAttribute()) || property.isElastic()) continue;
                propertyMap.put(property.name(), property);
            }
        }
        return propertyMap;
    }

    private boolean dealCharacterField(List<String> characterFieldNames, Product product) throws Exception {
        if (ObjectUtils.isNotEmpty(characterFieldNames) && product.get("productCharacterDef") != null) {
            Map productCharacterDef = (Map)product.get("productCharacterDef");
            ArrayList<String> characterCodeList = new ArrayList<String>();
            for (String fieldName : characterFieldNames) {
                String[] split = StringUtils.split((String)fieldName, (String)".");
                String characterCode = split.length > 1 ? split[1] : null;
                if (!StringUtils.isNotEmpty((CharSequence)characterCode)) continue;
                characterCodeList.add(characterCode);
            }
            if (ObjectUtils.isNotEmpty(characterCodeList)) {
                List selectFields = characterCodeList.stream().map(v -> "productCharacterDef." + v + " as " + v).collect(Collectors.toList());
                QuerySchema querySchema = QuerySchema.create().addSelect(StringUtils.join(selectFields, (String)",")).appendQueryCondition(new ConditionExpression[]{QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(product.getId())})});
                Map productCharacterDefDB = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)querySchema);
                List differentValueVOS = BizObjectUtils.compareBizObject((BizObject)BizObject.fromMap((Map)productCharacterDefDB), (BizObject)BizObject.fromMap((Map)productCharacterDef));
                if (ObjectUtils.isNotEmpty((Object)differentValueVOS)) {
                    return differentValueVOS.stream().anyMatch(v -> characterCodeList.contains(v.getKey()));
                }
            }
        }
        return false;
    }
}

