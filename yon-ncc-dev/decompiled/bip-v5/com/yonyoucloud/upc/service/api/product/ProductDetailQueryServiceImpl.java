/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.service.common.impl.CoreDocCustomExtendQueryService
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialApplyRangeVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialAssistClassVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialAssistUnitVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialBarCodeVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialDetailVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialParametersVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialTagNewVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialVO
 *  com.yonyou.iuap.graphql.query.feature.QueryFeature
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.iuap.upc.vo.ProductQueryVO
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api.product;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.service.common.impl.CoreDocCustomExtendQueryService;
import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialApplyRangeVO;
import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialAssistClassVO;
import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialAssistUnitVO;
import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialBarCodeVO;
import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialDetailVO;
import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialParametersVO;
import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialTagNewVO;
import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialVO;
import com.yonyou.iuap.graphql.query.feature.QueryFeature;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.vo.ProductQueryVO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class ProductDetailQueryServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(ProductDetailQueryServiceImpl.class);
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private CoreDocCustomExtendQueryService coreDocCustomExtendQueryService;
    static final int MAX_BATCH_SAVE_NUM = 10;
    private static String[] productMultiLangTexts = new String[]{"model", "modelDescription", "name", "keywords", "shareDescription"};
    private static String[] productDetailMultiLangTexts = new String[]{"receiptModel", "receiptName", "receiptSpec", "displayName", "metaDescription", "remark", "titleMemo"};

    public CoreDocJsonResult<MaterialVO> listProductDetail(List<ProductQueryVO> productQueryVOList) {
        if (CollectionUtils.isEmpty(productQueryVOList)) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL.getMessage()));
        }
        if (productQueryVOList.size() > 10) {
            return CoreDocJsonResult.error((Long)Long.valueOf(CoreDocBusinessErrorEnum.PARAM_MORE_THAN_LIMITATION.getCode()), (String)String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1971E45604580009", (String)"\u8bf7\u6c42\u6570\u91cf\u8d85\u8fc7\u6700\u5927\u9650\u5236\u6570\u91cf:%d"), 10));
        }
        ArrayList<MaterialVO> productApiVOList = new ArrayList<MaterialVO>();
        Integer recordCount = 0;
        StringBuffer errorMessage = new StringBuffer();
        for (ProductQueryVO productQueryVO : productQueryVOList) {
            MaterialVO productApiVO = null;
            try {
                productApiVO = this.queryProduct(productQueryVO);
            }
            catch (Exception e) {
                log.error("\u7269\u6599\u8be6\u60c5\u67e5\u8be2\u5f02\u5e38", (Throwable)e);
            }
            if (productApiVO != null) {
                Integer e = recordCount;
                recordCount = recordCount + 1;
                productApiVOList.add(productApiVO);
                continue;
            }
            StringBuffer errorStringBuffer = new StringBuffer();
            errorStringBuffer.append("id:").append(productQueryVO.getId()).append("code:").append(productQueryVO.getProductCode()).append("\uff0c\u672a\u627e\u5230\uff1b");
            errorMessage.append(errorStringBuffer);
        }
        CoreDocJsonResult result = CoreDocJsonResult.success(productApiVOList, (String)errorMessage.toString());
        result.setTotalCount(recordCount);
        return result;
    }

    public CoreDocJsonResult<MaterialVO> listProductDetail4IsApplied(List<ProductQueryVO> productQueryVOList) {
        if (CollectionUtils.isEmpty(productQueryVOList)) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL.getMessage()));
        }
        if (productQueryVOList.size() > 10) {
            return CoreDocJsonResult.error((Long)Long.valueOf(CoreDocBusinessErrorEnum.PARAM_MORE_THAN_LIMITATION.getCode()), (String)String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1971E45604580009", (String)"\u8bf7\u6c42\u6570\u91cf\u8d85\u8fc7\u6700\u5927\u9650\u5236\u6570\u91cf:%d"), 10));
        }
        ArrayList<MaterialVO> productApiVOList = new ArrayList<MaterialVO>();
        Integer recordCount = 0;
        StringBuffer errorMessage = new StringBuffer();
        for (ProductQueryVO productQueryVO : productQueryVOList) {
            MaterialVO productApiVO = null;
            try {
                productApiVO = this.queryProduct(productQueryVO);
            }
            catch (Exception e) {
                log.error("\u7269\u6599\u8be6\u60c5\u67e5\u8be2\u5f02\u5e38", (Throwable)e);
            }
            if (productApiVO != null) {
                Integer e = recordCount;
                recordCount = recordCount + 1;
                productApiVOList.add(productApiVO);
                continue;
            }
            StringBuffer errorStringBuffer = new StringBuffer();
            errorStringBuffer.append("id:").append(productQueryVO.getId()).append("code:").append(productQueryVO.getProductCode()).append("\uff0c\u672a\u627e\u5230\uff1b");
            errorMessage.append(errorStringBuffer);
        }
        CoreDocJsonResult result = CoreDocJsonResult.success(productApiVOList, (String)errorMessage.toString());
        result.setTotalCount(recordCount);
        return result;
    }

    public MaterialVO queryProduct(ProductQueryVO queryVO) throws Exception {
        if (queryVO == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800075);
        }
        if (queryVO.getId() == null && queryVO.getProductCode() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801165);
        }
        if (queryVO.getOrgId() == null && queryVO.getOrgCode() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801166);
        }
        UpcAPiTool.checkTenantInfo();
        HashMap<String, Object> queryMap = new HashMap<String, Object>(8);
        if (queryVO.getId() != null) {
            queryMap.put("id", queryVO.getId());
        } else {
            queryMap.put("code", queryVO.getProductCode());
        }
        queryMap.put("orgId", queryVO.getOrgId());
        queryMap.put("ytenant_id", AppContext.getYTenantId());
        MaterialVO productVO = this.dealProductData(queryVO.getId());
        List productDetailIdAndOrgType = SqlHelper.selectList((String)"com.yonyoucloud.upc.mapper.ProductVo.queryProductRange", queryMap);
        if (CollectionUtils.isEmpty((Collection)productDetailIdAndOrgType)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801168);
        }
        queryMap.put("productDetailId", ((Map)productDetailIdAndOrgType.get(0)).get("productDetailId"));
        this.dealProductDetailData(productVO, (Long)((Map)productDetailIdAndOrgType.get(0)).get("productDetailId"));
        this.dealProductOrgesData(productVO);
        this.dealProductAssistUnitExchangesData(productVO);
        this.dealProductTagNewsData(productVO, (Long)((Map)productDetailIdAndOrgType.get(0)).get("productDetailId"));
        this.dealProductParametersData(productVO, (Long)((Map)productDetailIdAndOrgType.get(0)).get("productDetailId"));
        this.dealProductBarCodesData(productVO);
        this.dealProductAssistClassesData(productVO);
        Map customExtendData = this.coreDocCustomExtendQueryService.getMaterialExtendData(productVO);
        productVO.setCustomExtend(customExtendData);
        return productVO;
    }

    private MaterialVO dealProductData(Long productId) throws Exception {
        QuerySchema querySchema = QuerySchema.create().addSelect("id as id,orgId as orgId,orgId.code as orgId___code,orgId.name as orgId___name,unit as unit,unit.code as unit___code, unit.name as unit___name, manageClass as manageClass ,manageClass.code as manageClass___code, manageClass.name as manageClass___name ,productClass.code as productClassCode, productClass.name as productClassName, brand as brand,brand.code as brand___code, brand.name as brand___name , costClass as costClass,costClass.code as costClass___code, costClass.name as costClass___name ,couponId as couponId,couponId.cTitle as couponId___cTitle,cust as cust, cust.code as cust___code, cust.name as cust___name ,giftCardId as giftCardId,giftCardId.giftCardName as giftCardId___giftCardName, giftCardId.giftCardCode as giftCardId___giftCardCode ,internalSupplyOrgId as internalSupplyOrgId,internalSupplyOrgId.code as internalSupplyOrgId___code, internalSupplyOrgId.name as internalSupplyOrgId___name ,lifeCycleTemplate as lifeCycleTemplate,lifeCycleTemplate.code as lifeCycleTemplate___code, lifeCycleTemplate.name as lifeCycleTemplate___name, materialStatus as materialStatus,materialStatus.code as materialStatus___code,materialStatus.name as materialStatus___name, netWeight as netWeight,netWeightUnit as netWeightUnit,netWeightUnit.code as netWeightUnit___code, netWeightUnit.name as netWeightUnit___name, volume as volume,volumeUnit as volumeUnit,volumeUnit.code as volumeUnit___code, volumeUnit.name as volumeUnit___name ,weight as weight,weightUnit as weightUnit ,weightUnit.code as weightUnit___code, weightUnit.name as weightUnit___name ,optionalMaterialId as optionalMaterialId ,optionalMaterialId.code as optionalMaterialId___code, optionalMaterialId.name as optionalMaterialId___name ,planClass as planClass,planClass.code as planClass___code, planClass.name as planClass___name ,productClass as productClass,productClass.code as productClass___code, productClass.name as productClass___name ,productLine as productLine ,productLine.code as productLine___code, productLine.name as productLine___name ,productTemplate as productTemplate ,productTemplate.name as productTemplate___name ,purchaseClass as purchaseClass,purchaseClass.code as purchaseClass___code, purchaseClass.name as purchaseClass___name ,shop as shop, shop.code as shop___code, shop.name as shop___name ,taxClass as taxClass,taxClass.code as taxClass___code, taxClass.name as taxClass___name ,transType as transType ,transType.code as transType___code, transType.name as transType___name, socialMctype as socialMctype,socialSrcid as socialSrcid,socialTenantid as socialTenantid,code as code,sociCoreArchive as sociCoreArchive,erpCode as erpCode,createDate as createDate,createTime as createTime,creator as creator,creatorId as creatorId,modifier as modifier,modifierId as modifierId,modifyDate as modifyDate,modifyTime as modifyTime,isDeleted as isDeleted,couponType as couponType,cPlatFormRemark as cPlatFormRemark,creatorType as creatorType,customerServiceDay as customerServiceDay,defaultSKUId as defaultSKUId,enableAssistUnit as enableAssistUnit,hasSpecs as hasSpecs,height as height,homepageBusinessId as homepageBusinessId,imgBusinessId as imgBusinessId,isAuthorizationManager as isAuthorizationManager,isBatch as isBatch,isDerivedMaterial as isDerivedMaterial,isOptionalMaterial as isOptionalMaterial,isRegistrationManager as isRegistrationManager,length as length,logicallyDeleteType as logicallyDeleteType,manufacturer as manufacturer,optionalType as optionalType,placeOfOrigin as placeOfOrigin,platformCode as platformCode,platFormStaus as platFormStaus,productCharacterDef as productCharacterDef,productClassPath as productClassPath,productFamily as productFamily,ptoPriceType as ptoPriceType,realProductAttribute as realProductAttribute,realProductAttributeType as realProductAttributeType,registrationNo as registrationNo,salesAndOperations as salesAndOperations,sunshinePurchaseNo as sunshinePurchaseNo,unitUseType as unitUseType,url as url,useSku as useSku,videoBusinessId as videoBusinessId,virtualProductAttribute as virtualProductAttribute,width as width,productPropCharacterDefine as productPropCharacterDefine,model as model,modelDescription as modelDescription,name as name,keywords as keywords,shareDescription as shareDescription").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productId)}));
        querySchema.configQueryFeature(QueryFeature.EnableMultiLangText, true);
        List products = MetaDaoHelper.query((String)"pc.product.Product", (boolean)true, (QuerySchema)querySchema, null);
        if (CollectionUtils.isEmpty((Collection)products)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801167);
        }
        MaterialVO productVO = (MaterialVO)JSON.parseObject((String)JSON.toJSONString(products.get(0)), MaterialVO.class);
        this.dealMultiLangText(productVO, productMultiLangTexts, (Map)products.get(0));
        return productVO;
    }

    private void dealProductDetailData(MaterialVO productVO, Long productDetailId) throws Exception {
        QuerySchema querySchema = QuerySchema.create().addSelect("id, batchPriceUnit as batchPriceUnit,batchPriceUnit.code as batchPriceUnit___code, batchPriceUnit.name as batchPriceUnit___name ,batchRule as batchRule,batchUnit as batchUnit,batchUnit.code as batchUnit___code, batchUnit.name as batchUnit___name ,behindLeadTime as behindLeadTime,beUpTime as beUpTime,beyondSupplyDays as beyondSupplyDays,billingUnit as billingUnit,billingUnit.code as billingUnit___code, billingUnit.name as billingUnit___name, bindCarrier as bindCarrier,BOMSource as BOMSource,BOMSource.code as BOMSource___code, BOMSource.name as BOMSource___name,BOMType as BOMType,businessAttribute as businessAttribute,businessAttributeOutSourcing as businessAttributeOutSourcing,businessAttributePurchase as businessAttributePurchase,businessAttributeSale as businessAttributeSale,businessAttributeSelfCreate as businessAttributeSelfCreate, canOrder as canOrder,canSale as canSale,checkByBatch as checkByBatch,checkByClient as checkByClient,checkByCost as checkByCost,checkByOutsourcing as checkByOutsourcing,checkByProject as checkByProject,checkByRevenueManagement as checkByRevenueManagement,checkBySalesOrders as checkBySalesOrders,checkReminderLeadTime as checkReminderLeadTime,costItems as costItems,costItems.code as costItems___code, costItems.name as costItems___name, costValuation as costValuation,customerId as customerId,customerId.code as customerId___code,customerId.name as customerId___name,daysBeforeValidityReject as daysBeforeValidityReject,deliverQuantityChange as deliverQuantityChange,deliveryDays as deliveryDays,deliveryWarehouse as deliveryWarehouse,deliveryWarehouse.code as deliveryWarehouse___code, deliveryWarehouse.name as deliveryWarehouse___name, demandConsolidation as demandConsolidation,demandConsolidationDateType as demandConsolidationDateType,demandConsolidationNumber as demandConsolidationNumber,demandConsolidationType as demandConsolidationType,demandConsolidationUnit as demandConsolidationUnit,demandPlanningUnit as demandPlanningUnit,demandPlanningUnit.code as demandPlanningUnit___code, demandPlanningUnit.name as demandPlanningUnit___name, depositDealPayType as depositDealPayType, depositPayType as depositPayType,depositPercentage as depositPercentage,deposits as deposits,directProduction as directProduction,dlyFeeRuleId as dlyFeeRuleId,dlyFeeRuleId.dt_name as dlyFeeRuleId___dt_name,doublePick as doublePick,doubleReplenish as doubleReplenish,ECNControl as ECNControl,economicQuantity as economicQuantity,effectiveLeadTime as effectiveLeadTime,enableDeposit as enableDeposit,enablemodifyDeposit as enablemodifyDeposit,enableSparePartsManagement as enableSparePartsManagement,enableStockExpireCheck as enableStockExpireCheck,enableStockPeriodRecheck as enableStockPeriodRecheck,enableSubscribe as enableSubscribe,engineeringDrawingNo as engineeringDrawingNo,erpOuterCode as erpOuterCode,exemption as exemption,expireDateNo as expireDateNo,expireDateUnit as expireDateUnit,fixedLeadTime as fixedLeadTime,fixedQuantity as fixedQuantity,fixedReturn as fixedReturn,fixedWastage as fixedWastage,fLowestMarkPrice as fLowestMarkPrice,fMarketPrice as fMarketPrice,fMarkPrice as fMarkPrice,fNoTaxCostPrice as fNoTaxCostPrice,fPrimeCosts as fPrimeCosts,frontLeadTime as frontLeadTime,fSalePrice as fSalePrice,fSettleAccountsRate as fSettleAccountsRate,fullSetInspection as fullSetInspection,highestStock as highestStock,iABCClass as iABCClass,iBaseSaleCount as iBaseSaleCount,iDoubleSale as iDoubleSale,iEnableCyclePurchase as iEnableCyclePurchase,iEnableEcontract as iEnableEcontract,iMinOrderQuantity as iMinOrderQuantity,inspectionType as inspectionType,inspectionUnit as inspectionUnit,inspectionUnit.code as inspectionUnit___code, inspectionUnit.name as inspectionUnit___name ,inStoreExcessLimit as inStoreExcessLimit,inStoreLessLimit as inStoreLessLimit,inTaxrate as inTaxrate,inTaxrate.code as inTaxrate___code, inTaxrate.name as inTaxrate___name, inventoryPlanStrategy as inventoryPlanStrategy,invoiceAllowErrorLimit as invoiceAllowErrorLimit,iOrder as iOrder,isAllArea as isAllArea,isBarcodeManage as isBarcodeManage,isBatchManage as isBatchManage,isCheckFree as isCheckFree,isCreator as isCreator,isDisplayPrice as isDisplayPrice,isExpiryDateCalculationMethod as isExpiryDateCalculationMethod,isExpiryDateManage as isExpiryDateManage,isMaterial as isMaterial,isOfflineStoreOrder as isOfflineStoreOrder,isOfflineStoreReturn as isOfflineStoreReturn,isPriceChangeAllowed as isPriceChangeAllowed,isProcess as isProcess,isRecommend as isRecommend,isSaleInOfflineStore as isSaleInOfflineStore,isSerialNoManage as isSerialNoManage,iStatus as iStatus,isWeight as isWeight,iUOrderStatus as iUOrderStatus,keySubPart as keySubPart,leadTimeCoefficient as leadTimeCoefficient,leadTimeQuantity as leadTimeQuantity,lInventoryCount as lInventoryCount,logisticsRelated as logisticsRelated,lossType as lossType,lowestStock as lowestStock,malldowncount as malldowncount,mallDownTime as mallDownTime,mallupcount as mallupcount,mallUpTime as mallUpTime,manageByInventory as manageByInventory,manufacturePlanner as manufacturePlanner,manufacturePlanner.code as manufacturePlanner___code, manufacturePlanner.name as manufacturePlanner___name ,manufacturingStrategy as manufacturingStrategy,materialCost as materialCost,materialStatus as materialStatus,materialStatus.code as materialStatus___code,materialStatus.name as materialStatus___name,maxBatchPrice as maxBatchPrice,maximumTurnoverDays as maximumTurnoverDays,maxPrimeCosts as maxPrimeCosts,minBatchPrice as minBatchPrice,minimumDeposits as minimumDeposits,mnemonicCode as mnemonicCode,mtoStrategy as mtoStrategy,offlineUnit as offlineUnit,offlineUnit.code as offlineUnit___code, offlineUnit.name as offlineUnit___name ,omsWarehouse as omsWarehouse,omsWarehouse.code as omsWarehouse___code, omsWarehouse.name as omsWarehouse___name ,onlineUnit as onlineUnit,onlineUnit.code as onlineUnit___code, onlineUnit.name as onlineUnit___name , onlyOrder as onlyOrder,orderAdvanceTime as orderAdvanceTime,orgId as orgId,orgId.code as orgId___code, orgId.name as orgId___name,outStoreExcessLimit as outStoreExcessLimit,outStoreLessLimit as outStoreLessLimit, outTaxrate as outTaxrate,outTaxrate.code as outTaxrate___code, outTaxrate.name as outTaxrate___name, overSigning as overSigning,pageTitle as pageTitle,periodicalInspection as periodicalInspection,periodicalInspectionCycle as periodicalInspectionCycle,planCheckDays as planCheckDays,planDefaultAttribute as planDefaultAttribute,planMethod as planMethod,planProduceLimit as planProduceLimit,planStrategy as planStrategy,preferentialPolicyType as preferentialPolicyType,preferentialPolicyType.taxRevenueCode as preferentialPolicyType___taxRevenueCode,preferentialPolicyType.name as preferentialPolicyType___name,prepareFeed as prepareFeed,priceAreaMessage as priceAreaMessage,processType as processType,produceDepartment as produceDepartment,produceDepartment.code as produceDepartment___code, produceDepartment.name as produceDepartment___name ,produceUnit as produceUnit,produceUnit.code as produceUnit___code, produceUnit.name as produceUnit___name, productApplyRangeId as productApplyRangeId,productBuyer as productBuyer,productBuyer.code as productBuyer___code, productBuyer.name as productBuyer___name, productId as productId,productId.code as productId___code, productId.name as productId___name, productionMode as productionMode,productVendor as productVendor,productVendor.code as productVendor___code, productVendor.name as productVendor___name, projectTrackStrategy as projectTrackStrategy,purchaseOrderQuantity as purchaseOrderQuantity,purchasePriceUnit as purchasePriceUnit,purchasePriceUnit.code as purchasePriceUnit___code, purchasePriceUnit.name as purchasePriceUnit___name, purchaseTimes as purchaseTimes,purchaseUnit as purchaseUnit,purchaseUnit.code as purchaseUnit___code, purchaseUnit.name as purchaseUnit___name ,purpose as purpose,rangeType as rangeType,receiptWarehouse as receiptWarehouse,receiptWarehouse.code as receiptWarehouse___code, receiptWarehouse.name as receiptWarehouse___name, recheckReminderLeadTime as recheckReminderLeadTime,rejectRate as rejectRate,requestOrderLimit as requestOrderLimit,requirementTrackingMethod as requirementTrackingMethod,requireUnit as requireUnit,requireUnit.code as requireUnit___code, requireUnit.name as requireUnit___name, reservation as reservation,resetBackwardDays as resetBackwardDays,resetForwardDays as resetForwardDays,retailPriceDimension as retailPriceDimension,returnInspection as returnInspection,returnsWarehousingByResult as returnsWarehousingByResult,returnWarehouse as returnWarehouse,returnWarehouse.code as returnWarehouse___code, returnWarehouse.name as returnWarehouse___name, reviewCycle as reviewCycle,reviewGrossWeight as reviewGrossWeight,ropStock as ropStock,safetyStock as safetyStock,saleChannel as saleChannel,saleChannelOfDistribution as saleChannelOfDistribution,saleChannelOfOfflineRetail as saleChannelOfOfflineRetail,saleChannelOfOnlineBatch as saleChannelOfOnlineBatch,saleChannelOfOnlineRetail as saleChannelOfOnlineRetail,salePoints as salePoints,salesReturnsExemption as salesReturnsExemption,saleStyle as saleStyle,scanCountUnit as scanCountUnit,sendInspection as sendInspection,serviceDuration as serviceDuration,serviceDurationUnit as serviceDurationUnit,shopId as shopId,shopId.code as shopId___code,shopId.name as shopId___name,shortName as shortName,singleInspection as singleInspection,specialCarTransport as specialCarTransport,specialMaterials as specialMaterials,stockUnit as stockUnit,stockUnit.code as stockUnit___code, stockUnit.name as stockUnit___name ,storageLossRate as storageLossRate,strategyComparisonRule as strategyComparisonRule,supplyDemandPolicy as supplyDemandPolicy,supplyTimes as supplyTimes,supplyType as supplyType,testRule as testRule,uorderDlyFeeRuleId as uorderDlyFeeRuleId,uorderdowncount as uorderdowncount,uorderDownTime as uorderDownTime,uorderupcount as uorderupcount,uorderUpTime as uorderUpTime,utility as utility,validityWarningDays as validityWarningDays,valueManageType as valueManageType,virtualPart as virtualPart,warehouseManager as warehouseManager,warehouseManager.code as warehouseManager___code, warehouseManager.name as warehouseManager___name, warehousingByResult as warehousingByResult,wastageRate as wastageRate,weigh as weigh,weighingMode as weighingMode,workingPlan as workingPlan,stopstatus as stopstatus,stoptime as stoptime,createDate as createDate,createTime as createTime,creator as creator,creatorId as creatorId,modifier as modifier,modifierId as modifierId,modifyDate as modifyDate,modifyTime as modifyTime,accountingByItem as accountingByItem,allowNegativeInventory as allowNegativeInventory,allowStorePurchase as allowStorePurchase,arrivalAllowErrorLimit as arrivalAllowErrorLimit,atpInspection as atpInspection,barCode as barCode,batchDouble as batchDouble,batchPolicy as batchPolicy,batchPrice as batchPrice,productExtendCharacterDef as productExtendCharacterDef,receiptModel as receiptModel,receiptName as receiptName,receiptSpec as receiptSpec,displayName as displayName,metaDescription as metaDescription,remark as remark,titleMemo as titleMemo, deliveryMethod, turnoverMaterials, amortizationMethod, measurementCount, measurementUnit, measurementUnit.code as measurementUnit___code,measurementUnit.name as measurementUnit___name, compensationAmount, moldingTime, moldCavities, inspectionControlPoint, productInspection, productInspectionCtrlPoint,outSourceInspection, transferInspection, productFirstInspection, firstInspectionCtrlMethod, sendInspectionCtrlPoint, returnInspectionCtrlPoint").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)productDetailId)}));
        querySchema.configQueryFeature(QueryFeature.EnableMultiLangText, true);
        List productDetails = MetaDaoHelper.query((String)"pc.product.ProductDetail", (boolean)true, (QuerySchema)querySchema, null);
        if (CollectionUtils.isEmpty((Collection)productDetails)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801168);
        }
        MaterialDetailVO productDetailVO = (MaterialDetailVO)JSON.parseObject((String)JSON.toJSONString(productDetails.get(0)), MaterialDetailVO.class);
        this.dealDetailMultiLangText(productDetailVO, productDetailMultiLangTexts, (Map)productDetails.get(0));
        productVO.setDetail(productDetailVO);
        if (null != productDetailVO && null != productDetailVO.getOrgId()) {
            productVO.setProductApplyRange_OrgId(productDetailVO.getOrgId().toString());
            productVO.setProductApplyRange_OrgId___code(productDetailVO.getOrgId___code());
            productVO.setProductApplyRange_OrgId___name(productDetailVO.getOrgId___name());
        }
    }

    private void dealProductOrgesData(MaterialVO productVO) throws Exception {
        List productOrgs = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("allocateSource as allocateSource,allocateTime as allocateTime,allocatorId as allocatorId,allocatorId.code as allocatorId___code ,allocatorId.name as allocatorId___name,allocatorName as allocatorName,controlRuleVersion as controlRuleVersion,customerId as customerId,customerId.code as customerId___code,customerId.name as customerId___name,rangeType as rangeType,orgId as orgId,orgId.code as orgId___code,orgId.name as orgId___name,productDepositTimeDetailId as productDepositTimeDetailId,productDetailId as productDetailId,productId as productId,productId.code as productId___code,productId.name as productId___name,shopId as shopId,shopId.code as shopId___code,shopId.name as shopId___name,isCreator as isCreator,isApplied as isApplied").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productVO.getId())})));
        if (!CollectionUtils.isEmpty((Collection)productOrgs)) {
            productVO.setProductOrgs(JSON.parseArray((String)JSON.toJSONString((Object)productOrgs), MaterialApplyRangeVO.class));
        }
    }

    private void dealProductAssistUnitExchangesData(MaterialVO productVO) throws Exception {
        List productAssistUnitExchanges = MetaDaoHelper.query((String)"pc.product.ProductAssistUnitExchange", (QuerySchema)QuerySchema.create().addSelect("assistUnit as assistUnit,assistUnit.code as assistUnit___code,assistUnit.name as assistUnit___name,assistUnitCount as assistUnitCount,assistVersValue as assistVersValue ,iOrder as iOrder,mainUnitCount as mainUnitCount,mainUnitCountNew as mainUnitCountNew,mainUnitRate as mainUnitRate,unitExchangeType as unitExchangeType,productId as productId,productId.code as productId___code,productId.name as productId___name,balance").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productVO.getId())})));
        if (!CollectionUtils.isEmpty((Collection)productAssistUnitExchanges)) {
            productVO.setProductAssistUnitExchanges(JSON.parseArray((String)JSON.toJSONString((Object)productAssistUnitExchanges), MaterialAssistUnitVO.class));
        }
    }

    private void dealProductTagNewsData(MaterialVO productVO, Long productDetailId) throws Exception {
        List productTagNews = MetaDaoHelper.query((String)"pc.product.ProductTagNew", (QuerySchema)QuerySchema.create().addSelect("isCreator as isCreator,productApplyRangeId as productApplyRangeId,productDetailId as productDetailId,tagId as tagId,tagId.name as tagId___name,productId as productId,productId.code as productId___code,productId.name as productId___name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productVO.getId()), QueryCondition.name((String)"productDetailId").eq((Object)productDetailId)})));
        if (!CollectionUtils.isEmpty((Collection)productTagNews)) {
            productVO.setProductTags(JSON.parseArray((String)JSON.toJSONString((Object)productTagNews), MaterialTagNewVO.class));
        }
    }

    private void dealProductParametersData(MaterialVO productVO, Long productDetailId) throws Exception {
        List productParameters = MetaDaoHelper.query((String)"pc.product.ProductParameters", (QuerySchema)QuerySchema.create().addSelect("isCreator as isCreator,productApplyRangeId as productApplyRangeId,productDetailId as productDetailId,param as param,param.name as param___name,paramValue as paramValue,productId as productId,productId.code as productId___code,productId.name as productId___name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productVO.getId()), QueryCondition.name((String)"productDetailId").eq((Object)productDetailId)})));
        if (!CollectionUtils.isEmpty((Collection)productParameters)) {
            productVO.setProductParams(JSON.parseArray((String)JSON.toJSONString((Object)productParameters), MaterialParametersVO.class));
        }
    }

    private void dealProductBarCodesData(MaterialVO productVO) throws Exception {
        List productBarCodes = MetaDaoHelper.query((String)"pc.product.ProductBarCode", (QuerySchema)QuerySchema.create().addSelect("barCode as barCode,productId as productId,productId.code as productId___code,productId.name as productId___name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productVO.getId())})));
        if (!CollectionUtils.isEmpty((Collection)productBarCodes)) {
            productVO.setProductBarCodes(JSON.parseArray((String)JSON.toJSONString((Object)productBarCodes), MaterialBarCodeVO.class));
        }
    }

    private void dealProductAssistClassesData(MaterialVO productVO) throws Exception {
        List productAssistClasses = MetaDaoHelper.query((String)"pc.product.ProductAssistClass", (QuerySchema)QuerySchema.create().addSelect("productClassId as productClassId,productClassId.code as productClassId___code,productClassId.name as productClassId___name,productId as productId,productId.code as productId___code,productId.name as productId___name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"productId").eq((Object)productVO.getId())})));
        if (!CollectionUtils.isEmpty((Collection)productAssistClasses)) {
            productVO.setProductAssistClasses(JSON.parseArray((String)JSON.toJSONString((Object)productAssistClasses), MaterialAssistClassVO.class));
        }
    }

    private void dealMultiLangText(MaterialVO productVO, String[] multiLangTexts, Map<String, Object> productMap) {
        block14: for (String multiLangText : multiLangTexts) {
            if (null == productMap.get(multiLangText)) continue;
            MultiLangText multiLangValue = (MultiLangText)productMap.get(multiLangText);
            switch (multiLangText) {
                case "name": {
                    productVO.setName(multiLangValue);
                    continue block14;
                }
                case "model": {
                    productVO.setModel(multiLangValue);
                    continue block14;
                }
                case "modelDescription": {
                    productVO.setModelDescription(multiLangValue);
                    continue block14;
                }
                case "keywords": {
                    productVO.setKeywords(multiLangValue);
                    continue block14;
                }
                case "shareDescription": {
                    productVO.setShareDescription(multiLangValue);
                    continue block14;
                }
                default: {
                    log.warn("Unknown key: {}", (Object)multiLangText);
                }
            }
        }
    }

    private void dealDetailMultiLangText(MaterialDetailVO productDetailVO, String[] multiLangTexts, Map<String, Object> productMap) {
        block18: for (String multiLangText : multiLangTexts) {
            if (null == productMap.get(multiLangText)) continue;
            MultiLangText multiLangValue = (MultiLangText)productMap.get(multiLangText);
            switch (multiLangText) {
                case "receiptModel": {
                    productDetailVO.setReceiptModel(multiLangValue);
                    continue block18;
                }
                case "receiptName": {
                    productDetailVO.setReceiptName(multiLangValue);
                    continue block18;
                }
                case "receiptSpec": {
                    productDetailVO.setReceiptSpec(multiLangValue);
                    continue block18;
                }
                case "displayName": {
                    productDetailVO.setDisplayName(multiLangValue);
                    continue block18;
                }
                case "metaDescription": {
                    productDetailVO.setMetaDescription(multiLangValue);
                    continue block18;
                }
                case "remark": {
                    productDetailVO.setRemark(multiLangValue);
                    continue block18;
                }
                case "titleMemo": {
                    productDetailVO.setTitleMemo(multiLangValue);
                    continue block18;
                }
                default: {
                    log.warn("Unknown key: {}", (Object)multiLangText);
                }
            }
        }
    }
}

