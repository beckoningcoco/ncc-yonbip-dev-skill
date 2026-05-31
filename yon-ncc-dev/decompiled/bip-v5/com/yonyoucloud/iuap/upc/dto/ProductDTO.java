/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.CharacterDTO
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.CharacterDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSpecItemDTO;
import com.yonyoucloud.iuap.upc.vo.ProductAlbumVO;
import com.yonyoucloud.iuap.upc.vo.ProductAttachmentVO;
import com.yonyoucloud.iuap.upc.vo.ProductParameterExtendVO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductDTO
implements Serializable {
    private Long id;
    private String createOrgId;
    private String orgId;
    private String orgType;
    private String orgIdCode;
    private String orgIdName;
    private MultiLangText orgIdName_multLang;
    private Long shopId;
    private String tenantId;
    private String name;
    private MultiLangText name_multiLang;
    private String shortName;
    private Long productApplyRangeId;
    private String code;
    private String transType;
    private String transTypeName;
    private Long unitId;
    private String unitErpCode;
    private Integer unitTruncationType;
    private Integer unitExchangeType;
    private BigDecimal mainUnitCount;
    private String unitCode;
    private String unitName;
    private MultiLangText unitName_multLang;
    private Integer unitPrecision;
    private Integer unitUseType;
    private String productPropCharacterDefine;
    private HashMap<String, Object> productPropCharacterDefineMap;
    private HashMap<String, Object> productCharacterDef;
    private HashMap<String, Object> productExtendCharacterDef;
    private Integer order;
    private Long assistUnit;
    private Boolean enableAssistUnit;
    private BigDecimal unitConvertCoefficient;
    private String modelDescription;
    private Integer singleInspection;
    private String model;
    private MultiLangText model_multiLang;
    private Long manageClass;
    private String manageClassPath;
    private String manageClassCode;
    private String manageClassName;
    private MultiLangText manageClassName_multiLang;
    private Long purchaseClass;
    private String purchaseClassCode;
    private String purchaseClassName;
    private Long costClass;
    private String costClassCode;
    private String costClassName;
    private MultiLangText costClassName_multiLang;
    private Long brand;
    private String brandCode;
    private String brandName;
    private MultiLangText brandName_multiLang;
    private String platformCode;
    private String placeOfOrigin;
    private Long productLine;
    private String productLineCode;
    private String productLineName;
    private MultiLangText productLineName_multiLang;
    private BigDecimal length;
    private BigDecimal height;
    private BigDecimal width;
    private BigDecimal weight;
    private Long weightUnit;
    private BigDecimal netWeight;
    private Long netWeightUnit;
    private BigDecimal volume;
    private Long volumeUnit;
    private String barCode;
    private List<String> productBarCodes;
    private String displayName;
    private String erpOuterCode;
    private String manufacturer;
    private Boolean mktDisplayPrice;
    private String mktPriceAreaMessage;
    private Long mktBatchPriceUnit;
    private BigDecimal mktBatchPrice;
    private Long mktBatchUnit;
    private String mktBatchUnitName;
    private String mktBatchUnitCode;
    private Long mktOnlineUnit;
    private Long mktOfflineUnit;
    private Long mktRequireUnit;
    private BigDecimal mktMarkPrice;
    private BigDecimal mktSalePrice;
    private BigDecimal mktMarketPrice;
    private Boolean mktStatus;
    private Boolean mktUOrderStatus;
    private Integer orderUpCount;
    private Integer orderDownCount;
    private BigDecimal upuMaxPrimeCosts;
    private BigDecimal upuPrimeCosts;
    private BigDecimal upuRequestOrderLimit;
    private BigDecimal upuArrivalAllowErrorLimit;
    private BigDecimal upuInvoiceAllowErrorLimit;
    private Long upuPurchaseUnit;
    private String upuPurchaseUnitName;
    private String upuPurchaseUnitCode;
    private Integer upuPurchaseUnitPrecision;
    private Long upuPurchasePriceUnit;
    private String upuPurchasePriceUnitName;
    private String upuPurchasePriceUnitCode;
    private BigDecimal upuPurchaseTimes;
    private BigDecimal upuPurchaseOrderQuantity;
    private Boolean saleCanSale;
    private BigDecimal saleMinOrderQuantity;
    private BigDecimal saleDoubleSale;
    private Integer saleDeliveryDays;
    private String saleChannel;
    private Long saleProductClass;
    private String saleProductClassCode;
    private String saleProductClassName;
    private String saleProductClassPath;
    private String stockOmsWarehouse;
    private Boolean stockBatchManage;
    private Boolean stockExpiryDateManage;
    private String stockExpiryDateCalculationMethod;
    private String stockExpireDateNo;
    private String stockExpireDateUnit;
    private String stockDaysBeforeValidityReject;
    private String stockValidityWarningDays;
    private Boolean stockSerialNoManage;
    private Boolean stockBarcodeManage;
    private Integer stockManageByInventory;
    private BigDecimal stockSafetyStock;
    private BigDecimal stockHighestStock;
    private BigDecimal stockLowestStock;
    private BigDecimal stockRopStock;
    private Long stockDeliveryWarehouse;
    private String stockDeliveryWarehouseName;
    private Long stockReturnWarehouse;
    private String stockReturnWarehouseName;
    private Long stockReceiptWarehouse;
    private String stockReceiptWarehouseName;
    private BigDecimal stockInStoreExcessLimit;
    private BigDecimal stockOutStoreExcessLimit;
    private BigDecimal stockInStoreLessLimit;
    private BigDecimal stockOutStoreLessLimit;
    private Integer stockMaximumTurnoverDays;
    private Long stockScanCountUnit;
    private Boolean stockReservation;
    private BigDecimal stockStorageLossRate;
    private Boolean stockAllowNegativeInventory;
    private Long stockStockUnit;
    private String stockStockUnitCode;
    private String stockStockUnitName;
    private Long demandPlanningUnit;
    private String demandPlanningUnitCode;
    private String demandPlanningUnitName;
    private Boolean inspectionType;
    private Integer testRule;
    private Boolean inspectionReturnsWarehousingByResult;
    private Integer planCheckDays;
    private Long inspectionUnit;
    private Integer edSupplyType;
    @Deprecated
    private Integer edProduceDepartment;
    private String edProduceDepartmentNew;
    private Boolean edBindCarrier;
    private Integer edPurpose;
    private String edWeigh;
    private Double doubleReplenish;
    private String edEngineeringDrawingNo;
    private String edECNControl;
    private String edPlanDefaultAttribute;
    private String edPlanMethod;
    private String edManufacturePlanner;
    private BigDecimal edPlanProduceLimit;
    private String edKeySubPart;
    private String edBOMType;
    private String edBOMSource;
    private String edBatchRule;
    private BigDecimal edEconomicQuantity;
    private BigDecimal edFixedQuantity;
    private BigDecimal edBatchDouble;
    private Integer edFrontLeadTime;
    private Integer edBehindLeadTime;
    private Integer edFixedLeadTime;
    private BigDecimal edLeadTimeCoefficient;
    private BigDecimal edLeadTimeQuantity;
    private Integer edLossType;
    private String edFixedWastage;
    private BigDecimal edRejectRate;
    private Boolean edPrepareFeed;
    @Deprecated
    private Boolean edWastageRate;
    private BigDecimal wastageRate;
    private Boolean edDirectProduction;
    private Boolean edSpecialMaterials;
    private Boolean edVirtualPart;
    private Integer edDemandConsolidation;
    private Integer edDemandConsolidationType;
    private Integer edDemandConsolidationUnit;
    private Integer edDemandConsolidationNumber;
    private Integer edDemandConsolidationDateType;
    private Integer edResetForwardDays;
    private Integer edResetBackwardDays;
    private Integer edBeyondSupplyDays;
    private Boolean edLogisticsRelated;
    private Integer edWeighingMode;
    private Boolean edFixedReturn;
    private Boolean edReviewGrossWeight;
    private Boolean edSpecialCarTransport;
    private Long edProduceUnit;
    private String edProduceUnitCode;
    private String edProduceUnitName;
    private String edProduceUnitPercision;
    private Long edPlanClass;
    private String edPlanClassName;
    private Long fiCostClass;
    private Integer fiValueManageType;
    private Integer fiCostValuation;
    private BigDecimal fiNoTaxCostPrice;
    private Boolean fiCheckByBatch;
    private Boolean accountingByItem;
    private Integer checkFree;
    private String taxClass;
    private String taxClassCode;
    private String taxClassName;
    private String taxClassSimpleName;
    private String fiReceiptName;
    private String fiInTaxrate;
    private String noTaxation;
    private String fiOutTaxrate;
    private Long fiPreferentialPolicyType;
    private String fiPreferentialPolicyTypeName;
    private String receiptSpec;
    private String receiptModel;
    private Integer creatorType;
    private String realProductAttribute;
    @Deprecated
    private String realProductAttributeType;
    private Integer realProductAttributeTypeNew;
    @Deprecated
    private String virtualProductAttribute;
    private Integer virtualProductAttributeNew;
    private String businessAttribute;
    private Integer ptoPriceType;
    private Long productTemplate;
    private String productTemplateName;
    private Boolean productTemplateSkuDynamic;
    private Boolean businessAttributePurchase;
    private Boolean businessAttributeSelfCreate;
    private Boolean businessAttributeOutSourcing;
    private Boolean businessAttributeSale;
    private Boolean saleChannelOfOnlineBatch;
    private Boolean saleChannelOfDistribution;
    private Integer enableSparePartsManagement;
    private String depositPayType;
    private String minimumDeposits;
    private Long productTagId;
    private Boolean isWeight;
    private Integer productFamily;
    private Integer salesAndOperations;
    private Boolean stopStatus;
    private String erpCode;
    private String mnemonicCode;
    private Long productVendor;
    private String productVendorName;
    private String productBuyer;
    private String productBuyerName;
    private String warehouseManager;
    private String warehouseManagerName;
    private String description;
    private String mobileDescription;
    private Boolean medIsRegistrationManager;
    private Boolean medIsAuthorizationManager;
    private String medSunshinePurchaseNo;
    private String medRegistrationNo;
    private Integer retailProcessType;
    private Integer retailPriceDimension;
    private Boolean material;
    private Boolean saleInOfflineStore;
    private Boolean offlineStoreOrder;
    private Integer isOptionalMaterial;
    private Long defaultSKUId;
    private Long productDetailId;
    private Boolean recommendedMaterials;
    @Deprecated
    private Boolean isProcess;
    private Boolean process;
    private String url;
    private Boolean hasSpecs;
    private Long couponId;
    private String titleMemo;
    private Integer platFormStatus;
    private Integer couponType;
    private Long creatorCustomer;
    private BigDecimal inventoryCount;
    private String manufacturingStrategy;
    private Integer mtoStrategy;
    private Integer strategyComparisonRule;
    private List<ProductAlbumVO> productAlbums;
    private List<ProductAttachmentVO> productAttachments;
    private List<ProductParameterExtendVO> productParams;
    private List<ProductSpecItemDTO> productSpecItems;
    private String productDefine1;
    private String productDefine2;
    private String productDefine3;
    private String productDefine4;
    private String productDefine5;
    private String productDefine6;
    private String productDefine7;
    private String productDefine8;
    private String productDefine9;
    private String productDefine10;
    private String productDefine11;
    private String productDefine12;
    private String productDefine13;
    private String productDefine14;
    private String productDefine15;
    private String productDefine16;
    private String productDefine17;
    private String productDefine18;
    private String productDefine19;
    private String productDefine20;
    private String productDefine21;
    private String productDefine22;
    private String productDefine23;
    private String productDefine24;
    private String productDefine25;
    private String productDefine26;
    private String productDefine27;
    private String productDefine28;
    private String productDefine29;
    private String productDefine30;
    private String productFreeDefine1;
    private String productFreeDefine2;
    private String productFreeDefine3;
    private String productFreeDefine4;
    private String productFreeDefine5;
    private String productFreeDefine6;
    private String productFreeDefine7;
    private String productFreeDefine8;
    private String productFreeDefine9;
    private String productFreeDefine10;
    private String productFreeDefine11;
    private String productFreeDefine12;
    private String productFreeDefine13;
    private String productFreeDefine14;
    private String productFreeDefine15;
    private String productFreeDefine16;
    private String productFreeDefine17;
    private String productFreeDefine18;
    private String productFreeDefine19;
    private String productFreeDefine20;
    private String productFreeDefine21;
    private String productFreeDefine22;
    private String productFreeDefine23;
    private String productFreeDefine24;
    private String productFreeDefine25;
    private String productFreeDefine26;
    private String productFreeDefine27;
    private String productFreeDefine28;
    private String productFreeDefine29;
    private String productFreeDefine30;
    public String free1;
    public String free2;
    public String free3;
    public String free4;
    public String free5;
    public String free6;
    public String free7;
    public String free8;
    public String free9;
    public String free10;
    private String materialStatus;
    private String orgMaterialStatus;
    private Integer fullSetInspection;
    private List<CharacterDTO> characterDTOList;
    private String homepageBusinessId;
    private String imgBusinessId;
    private String videoBusinessId;
    private String attachments;
    private String costItems;
    private String costItemsCode;
    private String costItemsName;
    private Integer projectTrackStrategy;
    private Integer checkByProject;
    private Integer checkBySalesOrders;
    private Integer checkByClient;
    private Integer checkByOutsourcing;
    private Long billingUnit;
    private String billingUnitCode;
    private String billingUnitName;
    private Integer sendInspection;
    private Integer returnInspection;
    private Integer iBaseSaleCount;
    private Integer iABCClass;
    private Integer atpInspection;
    private BigDecimal doublePick;
    private Integer checkByRevenueManagement;
    private Integer optionalType;
    private Integer overSigning;
    private Integer inspectionControlPoint;
    private Boolean allowStorePurchase;
    private Boolean isOfflineStoreOrder;
    private Boolean isOfflineStoreReturn;
    private Map<String, Object> customExtend;
    private Boolean isPriceChangeAllowed;
    private String mktRequireUnitName;
    private String mktRequireUnitPrecision;
    private String mktRequireUniterpCode;
    private String mktOfflineUnitName;
    private String mktOfflineUnitPrecision;
    private String mktOfflineUniterpCode;
    private String fiOutTaxrateName;
    private String lowestMarkPrice;
    private String createTime;
    private Integer productInspection;
    private Integer productInspectionCtrlPoint;
    private Integer outSourceInspection;
    private Integer outSourceInspectionCtrlPoint;
    private Integer transferInspection;
    private Integer transferInspectionCtrlPoint;
    private Integer productFirstInspection;
    private Integer firstInspectionCtrlMethod;
    private Integer sendInspectionCtrlPoint;
    private Integer returnInspectionCtrlPoint;
    private Boolean mallOnlyOrder;
    private Boolean mallIControlTime;
    private Integer mallDepositDealPayType;
    private BigDecimal mallDepositPercentage;
    private Integer mallCustomerServiceDay;
    private String keywords;
    private String mallMetaDescription;
    private Boolean mallIsAllArea;
    private MultiLangText mktOnlineUnit___Name;
    private String mallSaleStyle;
    private Long mallDlyFeeRuleId;
    private Boolean mallEnableDeposit;
    private Integer mallUpcount;
    private Integer mallDowncount;
    private Boolean mallEnableSubscribe;
    private String mallPageTitle;
    private Integer mallSalePoints;
    private Boolean mallEnableCyclePurchase;
    private BigDecimal mallDeposits;
    private Long mallGiftCardId;
    private String deliveryMethod;
    private Integer turnoverMaterials;
    private Integer amortizationMethod;
    private BigDecimal measurementCount;
    private Long measurementUnit;
    private String measurementUnitName;
    private String measurementUnitCode;
    private BigDecimal compensationAmount;
    private BigDecimal moldingTime;
    private BigDecimal moldCavities;
    private Integer measurementUnitPrecision;
    private Integer reviewCycle;
    private Integer effectiveLeadTime;
    private String productionMode;
    private Integer balance;

    public Long getId() {
        return this.id;
    }

    public String getCreateOrgId() {
        return this.createOrgId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOrgType() {
        return this.orgType;
    }

    public String getOrgIdCode() {
        return this.orgIdCode;
    }

    public String getOrgIdName() {
        return this.orgIdName;
    }

    public MultiLangText getOrgIdName_multLang() {
        return this.orgIdName_multLang;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getName() {
        return this.name;
    }

    public MultiLangText getName_multiLang() {
        return this.name_multiLang;
    }

    public String getShortName() {
        return this.shortName;
    }

    public Long getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public String getCode() {
        return this.code;
    }

    public String getTransType() {
        return this.transType;
    }

    public String getTransTypeName() {
        return this.transTypeName;
    }

    public Long getUnitId() {
        return this.unitId;
    }

    public String getUnitErpCode() {
        return this.unitErpCode;
    }

    public Integer getUnitTruncationType() {
        return this.unitTruncationType;
    }

    public Integer getUnitExchangeType() {
        return this.unitExchangeType;
    }

    public BigDecimal getMainUnitCount() {
        return this.mainUnitCount;
    }

    public String getUnitCode() {
        return this.unitCode;
    }

    public String getUnitName() {
        return this.unitName;
    }

    public MultiLangText getUnitName_multLang() {
        return this.unitName_multLang;
    }

    public Integer getUnitPrecision() {
        return this.unitPrecision;
    }

    public Integer getUnitUseType() {
        return this.unitUseType;
    }

    public String getProductPropCharacterDefine() {
        return this.productPropCharacterDefine;
    }

    public HashMap<String, Object> getProductPropCharacterDefineMap() {
        return this.productPropCharacterDefineMap;
    }

    public HashMap<String, Object> getProductCharacterDef() {
        return this.productCharacterDef;
    }

    public HashMap<String, Object> getProductExtendCharacterDef() {
        return this.productExtendCharacterDef;
    }

    public Integer getOrder() {
        return this.order;
    }

    public Long getAssistUnit() {
        return this.assistUnit;
    }

    public Boolean getEnableAssistUnit() {
        return this.enableAssistUnit;
    }

    public BigDecimal getUnitConvertCoefficient() {
        return this.unitConvertCoefficient;
    }

    public String getModelDescription() {
        return this.modelDescription;
    }

    public Integer getSingleInspection() {
        return this.singleInspection;
    }

    public String getModel() {
        return this.model;
    }

    public MultiLangText getModel_multiLang() {
        return this.model_multiLang;
    }

    public Long getManageClass() {
        return this.manageClass;
    }

    public String getManageClassPath() {
        return this.manageClassPath;
    }

    public String getManageClassCode() {
        return this.manageClassCode;
    }

    public String getManageClassName() {
        return this.manageClassName;
    }

    public MultiLangText getManageClassName_multiLang() {
        return this.manageClassName_multiLang;
    }

    public Long getPurchaseClass() {
        return this.purchaseClass;
    }

    public String getPurchaseClassCode() {
        return this.purchaseClassCode;
    }

    public String getPurchaseClassName() {
        return this.purchaseClassName;
    }

    public Long getCostClass() {
        return this.costClass;
    }

    public String getCostClassCode() {
        return this.costClassCode;
    }

    public String getCostClassName() {
        return this.costClassName;
    }

    public MultiLangText getCostClassName_multiLang() {
        return this.costClassName_multiLang;
    }

    public Long getBrand() {
        return this.brand;
    }

    public String getBrandCode() {
        return this.brandCode;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public MultiLangText getBrandName_multiLang() {
        return this.brandName_multiLang;
    }

    public String getPlatformCode() {
        return this.platformCode;
    }

    public String getPlaceOfOrigin() {
        return this.placeOfOrigin;
    }

    public Long getProductLine() {
        return this.productLine;
    }

    public String getProductLineCode() {
        return this.productLineCode;
    }

    public String getProductLineName() {
        return this.productLineName;
    }

    public MultiLangText getProductLineName_multiLang() {
        return this.productLineName_multiLang;
    }

    public BigDecimal getLength() {
        return this.length;
    }

    public BigDecimal getHeight() {
        return this.height;
    }

    public BigDecimal getWidth() {
        return this.width;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public Long getWeightUnit() {
        return this.weightUnit;
    }

    public BigDecimal getNetWeight() {
        return this.netWeight;
    }

    public Long getNetWeightUnit() {
        return this.netWeightUnit;
    }

    public BigDecimal getVolume() {
        return this.volume;
    }

    public Long getVolumeUnit() {
        return this.volumeUnit;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public List<String> getProductBarCodes() {
        return this.productBarCodes;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public String getErpOuterCode() {
        return this.erpOuterCode;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public Boolean getMktDisplayPrice() {
        return this.mktDisplayPrice;
    }

    public String getMktPriceAreaMessage() {
        return this.mktPriceAreaMessage;
    }

    public Long getMktBatchPriceUnit() {
        return this.mktBatchPriceUnit;
    }

    public BigDecimal getMktBatchPrice() {
        return this.mktBatchPrice;
    }

    public Long getMktBatchUnit() {
        return this.mktBatchUnit;
    }

    public String getMktBatchUnitName() {
        return this.mktBatchUnitName;
    }

    public String getMktBatchUnitCode() {
        return this.mktBatchUnitCode;
    }

    public Long getMktOnlineUnit() {
        return this.mktOnlineUnit;
    }

    public Long getMktOfflineUnit() {
        return this.mktOfflineUnit;
    }

    public Long getMktRequireUnit() {
        return this.mktRequireUnit;
    }

    public BigDecimal getMktMarkPrice() {
        return this.mktMarkPrice;
    }

    public BigDecimal getMktSalePrice() {
        return this.mktSalePrice;
    }

    public BigDecimal getMktMarketPrice() {
        return this.mktMarketPrice;
    }

    public Boolean getMktStatus() {
        return this.mktStatus;
    }

    public Boolean getMktUOrderStatus() {
        return this.mktUOrderStatus;
    }

    public Integer getOrderUpCount() {
        return this.orderUpCount;
    }

    public Integer getOrderDownCount() {
        return this.orderDownCount;
    }

    public BigDecimal getUpuMaxPrimeCosts() {
        return this.upuMaxPrimeCosts;
    }

    public BigDecimal getUpuPrimeCosts() {
        return this.upuPrimeCosts;
    }

    public BigDecimal getUpuRequestOrderLimit() {
        return this.upuRequestOrderLimit;
    }

    public BigDecimal getUpuArrivalAllowErrorLimit() {
        return this.upuArrivalAllowErrorLimit;
    }

    public BigDecimal getUpuInvoiceAllowErrorLimit() {
        return this.upuInvoiceAllowErrorLimit;
    }

    public Long getUpuPurchaseUnit() {
        return this.upuPurchaseUnit;
    }

    public String getUpuPurchaseUnitName() {
        return this.upuPurchaseUnitName;
    }

    public String getUpuPurchaseUnitCode() {
        return this.upuPurchaseUnitCode;
    }

    public Integer getUpuPurchaseUnitPrecision() {
        return this.upuPurchaseUnitPrecision;
    }

    public Long getUpuPurchasePriceUnit() {
        return this.upuPurchasePriceUnit;
    }

    public String getUpuPurchasePriceUnitName() {
        return this.upuPurchasePriceUnitName;
    }

    public String getUpuPurchasePriceUnitCode() {
        return this.upuPurchasePriceUnitCode;
    }

    public BigDecimal getUpuPurchaseTimes() {
        return this.upuPurchaseTimes;
    }

    public BigDecimal getUpuPurchaseOrderQuantity() {
        return this.upuPurchaseOrderQuantity;
    }

    public Boolean getSaleCanSale() {
        return this.saleCanSale;
    }

    public BigDecimal getSaleMinOrderQuantity() {
        return this.saleMinOrderQuantity;
    }

    public BigDecimal getSaleDoubleSale() {
        return this.saleDoubleSale;
    }

    public Integer getSaleDeliveryDays() {
        return this.saleDeliveryDays;
    }

    public String getSaleChannel() {
        return this.saleChannel;
    }

    public Long getSaleProductClass() {
        return this.saleProductClass;
    }

    public String getSaleProductClassCode() {
        return this.saleProductClassCode;
    }

    public String getSaleProductClassName() {
        return this.saleProductClassName;
    }

    public String getSaleProductClassPath() {
        return this.saleProductClassPath;
    }

    public String getStockOmsWarehouse() {
        return this.stockOmsWarehouse;
    }

    public Boolean getStockBatchManage() {
        return this.stockBatchManage;
    }

    public Boolean getStockExpiryDateManage() {
        return this.stockExpiryDateManage;
    }

    public String getStockExpiryDateCalculationMethod() {
        return this.stockExpiryDateCalculationMethod;
    }

    public String getStockExpireDateNo() {
        return this.stockExpireDateNo;
    }

    public String getStockExpireDateUnit() {
        return this.stockExpireDateUnit;
    }

    public String getStockDaysBeforeValidityReject() {
        return this.stockDaysBeforeValidityReject;
    }

    public String getStockValidityWarningDays() {
        return this.stockValidityWarningDays;
    }

    public Boolean getStockSerialNoManage() {
        return this.stockSerialNoManage;
    }

    public Boolean getStockBarcodeManage() {
        return this.stockBarcodeManage;
    }

    public Integer getStockManageByInventory() {
        return this.stockManageByInventory;
    }

    public BigDecimal getStockSafetyStock() {
        return this.stockSafetyStock;
    }

    public BigDecimal getStockHighestStock() {
        return this.stockHighestStock;
    }

    public BigDecimal getStockLowestStock() {
        return this.stockLowestStock;
    }

    public BigDecimal getStockRopStock() {
        return this.stockRopStock;
    }

    public Long getStockDeliveryWarehouse() {
        return this.stockDeliveryWarehouse;
    }

    public String getStockDeliveryWarehouseName() {
        return this.stockDeliveryWarehouseName;
    }

    public Long getStockReturnWarehouse() {
        return this.stockReturnWarehouse;
    }

    public String getStockReturnWarehouseName() {
        return this.stockReturnWarehouseName;
    }

    public Long getStockReceiptWarehouse() {
        return this.stockReceiptWarehouse;
    }

    public String getStockReceiptWarehouseName() {
        return this.stockReceiptWarehouseName;
    }

    public BigDecimal getStockInStoreExcessLimit() {
        return this.stockInStoreExcessLimit;
    }

    public BigDecimal getStockOutStoreExcessLimit() {
        return this.stockOutStoreExcessLimit;
    }

    public BigDecimal getStockInStoreLessLimit() {
        return this.stockInStoreLessLimit;
    }

    public BigDecimal getStockOutStoreLessLimit() {
        return this.stockOutStoreLessLimit;
    }

    public Integer getStockMaximumTurnoverDays() {
        return this.stockMaximumTurnoverDays;
    }

    public Long getStockScanCountUnit() {
        return this.stockScanCountUnit;
    }

    public Boolean getStockReservation() {
        return this.stockReservation;
    }

    public BigDecimal getStockStorageLossRate() {
        return this.stockStorageLossRate;
    }

    public Boolean getStockAllowNegativeInventory() {
        return this.stockAllowNegativeInventory;
    }

    public Long getStockStockUnit() {
        return this.stockStockUnit;
    }

    public String getStockStockUnitCode() {
        return this.stockStockUnitCode;
    }

    public String getStockStockUnitName() {
        return this.stockStockUnitName;
    }

    public Long getDemandPlanningUnit() {
        return this.demandPlanningUnit;
    }

    public String getDemandPlanningUnitCode() {
        return this.demandPlanningUnitCode;
    }

    public String getDemandPlanningUnitName() {
        return this.demandPlanningUnitName;
    }

    public Boolean getInspectionType() {
        return this.inspectionType;
    }

    public Integer getTestRule() {
        return this.testRule;
    }

    public Boolean getInspectionReturnsWarehousingByResult() {
        return this.inspectionReturnsWarehousingByResult;
    }

    public Integer getPlanCheckDays() {
        return this.planCheckDays;
    }

    public Long getInspectionUnit() {
        return this.inspectionUnit;
    }

    public Integer getEdSupplyType() {
        return this.edSupplyType;
    }

    @Deprecated
    public Integer getEdProduceDepartment() {
        return this.edProduceDepartment;
    }

    public String getEdProduceDepartmentNew() {
        return this.edProduceDepartmentNew;
    }

    public Boolean getEdBindCarrier() {
        return this.edBindCarrier;
    }

    public Integer getEdPurpose() {
        return this.edPurpose;
    }

    public String getEdWeigh() {
        return this.edWeigh;
    }

    public Double getDoubleReplenish() {
        return this.doubleReplenish;
    }

    public String getEdEngineeringDrawingNo() {
        return this.edEngineeringDrawingNo;
    }

    public String getEdECNControl() {
        return this.edECNControl;
    }

    public String getEdPlanDefaultAttribute() {
        return this.edPlanDefaultAttribute;
    }

    public String getEdPlanMethod() {
        return this.edPlanMethod;
    }

    public String getEdManufacturePlanner() {
        return this.edManufacturePlanner;
    }

    public BigDecimal getEdPlanProduceLimit() {
        return this.edPlanProduceLimit;
    }

    public String getEdKeySubPart() {
        return this.edKeySubPart;
    }

    public String getEdBOMType() {
        return this.edBOMType;
    }

    public String getEdBOMSource() {
        return this.edBOMSource;
    }

    public String getEdBatchRule() {
        return this.edBatchRule;
    }

    public BigDecimal getEdEconomicQuantity() {
        return this.edEconomicQuantity;
    }

    public BigDecimal getEdFixedQuantity() {
        return this.edFixedQuantity;
    }

    public BigDecimal getEdBatchDouble() {
        return this.edBatchDouble;
    }

    public Integer getEdFrontLeadTime() {
        return this.edFrontLeadTime;
    }

    public Integer getEdBehindLeadTime() {
        return this.edBehindLeadTime;
    }

    public Integer getEdFixedLeadTime() {
        return this.edFixedLeadTime;
    }

    public BigDecimal getEdLeadTimeCoefficient() {
        return this.edLeadTimeCoefficient;
    }

    public BigDecimal getEdLeadTimeQuantity() {
        return this.edLeadTimeQuantity;
    }

    public Integer getEdLossType() {
        return this.edLossType;
    }

    public String getEdFixedWastage() {
        return this.edFixedWastage;
    }

    public BigDecimal getEdRejectRate() {
        return this.edRejectRate;
    }

    public Boolean getEdPrepareFeed() {
        return this.edPrepareFeed;
    }

    @Deprecated
    public Boolean getEdWastageRate() {
        return this.edWastageRate;
    }

    public BigDecimal getWastageRate() {
        return this.wastageRate;
    }

    public Boolean getEdDirectProduction() {
        return this.edDirectProduction;
    }

    public Boolean getEdSpecialMaterials() {
        return this.edSpecialMaterials;
    }

    public Boolean getEdVirtualPart() {
        return this.edVirtualPart;
    }

    public Integer getEdDemandConsolidation() {
        return this.edDemandConsolidation;
    }

    public Integer getEdDemandConsolidationType() {
        return this.edDemandConsolidationType;
    }

    public Integer getEdDemandConsolidationUnit() {
        return this.edDemandConsolidationUnit;
    }

    public Integer getEdDemandConsolidationNumber() {
        return this.edDemandConsolidationNumber;
    }

    public Integer getEdDemandConsolidationDateType() {
        return this.edDemandConsolidationDateType;
    }

    public Integer getEdResetForwardDays() {
        return this.edResetForwardDays;
    }

    public Integer getEdResetBackwardDays() {
        return this.edResetBackwardDays;
    }

    public Integer getEdBeyondSupplyDays() {
        return this.edBeyondSupplyDays;
    }

    public Boolean getEdLogisticsRelated() {
        return this.edLogisticsRelated;
    }

    public Integer getEdWeighingMode() {
        return this.edWeighingMode;
    }

    public Boolean getEdFixedReturn() {
        return this.edFixedReturn;
    }

    public Boolean getEdReviewGrossWeight() {
        return this.edReviewGrossWeight;
    }

    public Boolean getEdSpecialCarTransport() {
        return this.edSpecialCarTransport;
    }

    public Long getEdProduceUnit() {
        return this.edProduceUnit;
    }

    public String getEdProduceUnitCode() {
        return this.edProduceUnitCode;
    }

    public String getEdProduceUnitName() {
        return this.edProduceUnitName;
    }

    public String getEdProduceUnitPercision() {
        return this.edProduceUnitPercision;
    }

    public Long getEdPlanClass() {
        return this.edPlanClass;
    }

    public String getEdPlanClassName() {
        return this.edPlanClassName;
    }

    public Long getFiCostClass() {
        return this.fiCostClass;
    }

    public Integer getFiValueManageType() {
        return this.fiValueManageType;
    }

    public Integer getFiCostValuation() {
        return this.fiCostValuation;
    }

    public BigDecimal getFiNoTaxCostPrice() {
        return this.fiNoTaxCostPrice;
    }

    public Boolean getFiCheckByBatch() {
        return this.fiCheckByBatch;
    }

    public Boolean getAccountingByItem() {
        return this.accountingByItem;
    }

    public Integer getCheckFree() {
        return this.checkFree;
    }

    public String getTaxClass() {
        return this.taxClass;
    }

    public String getTaxClassCode() {
        return this.taxClassCode;
    }

    public String getTaxClassName() {
        return this.taxClassName;
    }

    public String getTaxClassSimpleName() {
        return this.taxClassSimpleName;
    }

    public String getFiReceiptName() {
        return this.fiReceiptName;
    }

    public String getFiInTaxrate() {
        return this.fiInTaxrate;
    }

    public String getNoTaxation() {
        return this.noTaxation;
    }

    public String getFiOutTaxrate() {
        return this.fiOutTaxrate;
    }

    public Long getFiPreferentialPolicyType() {
        return this.fiPreferentialPolicyType;
    }

    public String getFiPreferentialPolicyTypeName() {
        return this.fiPreferentialPolicyTypeName;
    }

    public String getReceiptSpec() {
        return this.receiptSpec;
    }

    public String getReceiptModel() {
        return this.receiptModel;
    }

    public Integer getCreatorType() {
        return this.creatorType;
    }

    public String getRealProductAttribute() {
        return this.realProductAttribute;
    }

    @Deprecated
    public String getRealProductAttributeType() {
        return this.realProductAttributeType;
    }

    public Integer getRealProductAttributeTypeNew() {
        return this.realProductAttributeTypeNew;
    }

    @Deprecated
    public String getVirtualProductAttribute() {
        return this.virtualProductAttribute;
    }

    public Integer getVirtualProductAttributeNew() {
        return this.virtualProductAttributeNew;
    }

    public String getBusinessAttribute() {
        return this.businessAttribute;
    }

    public Integer getPtoPriceType() {
        return this.ptoPriceType;
    }

    public Long getProductTemplate() {
        return this.productTemplate;
    }

    public String getProductTemplateName() {
        return this.productTemplateName;
    }

    public Boolean getProductTemplateSkuDynamic() {
        return this.productTemplateSkuDynamic;
    }

    public Boolean getBusinessAttributePurchase() {
        return this.businessAttributePurchase;
    }

    public Boolean getBusinessAttributeSelfCreate() {
        return this.businessAttributeSelfCreate;
    }

    public Boolean getBusinessAttributeOutSourcing() {
        return this.businessAttributeOutSourcing;
    }

    public Boolean getBusinessAttributeSale() {
        return this.businessAttributeSale;
    }

    public Boolean getSaleChannelOfOnlineBatch() {
        return this.saleChannelOfOnlineBatch;
    }

    public Boolean getSaleChannelOfDistribution() {
        return this.saleChannelOfDistribution;
    }

    public Integer getEnableSparePartsManagement() {
        return this.enableSparePartsManagement;
    }

    public String getDepositPayType() {
        return this.depositPayType;
    }

    public String getMinimumDeposits() {
        return this.minimumDeposits;
    }

    public Long getProductTagId() {
        return this.productTagId;
    }

    public Boolean getIsWeight() {
        return this.isWeight;
    }

    public Integer getProductFamily() {
        return this.productFamily;
    }

    public Integer getSalesAndOperations() {
        return this.salesAndOperations;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public String getMnemonicCode() {
        return this.mnemonicCode;
    }

    public Long getProductVendor() {
        return this.productVendor;
    }

    public String getProductVendorName() {
        return this.productVendorName;
    }

    public String getProductBuyer() {
        return this.productBuyer;
    }

    public String getProductBuyerName() {
        return this.productBuyerName;
    }

    public String getWarehouseManager() {
        return this.warehouseManager;
    }

    public String getWarehouseManagerName() {
        return this.warehouseManagerName;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMobileDescription() {
        return this.mobileDescription;
    }

    public Boolean getMedIsRegistrationManager() {
        return this.medIsRegistrationManager;
    }

    public Boolean getMedIsAuthorizationManager() {
        return this.medIsAuthorizationManager;
    }

    public String getMedSunshinePurchaseNo() {
        return this.medSunshinePurchaseNo;
    }

    public String getMedRegistrationNo() {
        return this.medRegistrationNo;
    }

    public Integer getRetailProcessType() {
        return this.retailProcessType;
    }

    public Integer getRetailPriceDimension() {
        return this.retailPriceDimension;
    }

    public Boolean getMaterial() {
        return this.material;
    }

    public Boolean getSaleInOfflineStore() {
        return this.saleInOfflineStore;
    }

    public Boolean getOfflineStoreOrder() {
        return this.offlineStoreOrder;
    }

    public Integer getIsOptionalMaterial() {
        return this.isOptionalMaterial;
    }

    public Long getDefaultSKUId() {
        return this.defaultSKUId;
    }

    public Long getProductDetailId() {
        return this.productDetailId;
    }

    public Boolean getRecommendedMaterials() {
        return this.recommendedMaterials;
    }

    @Deprecated
    public Boolean getIsProcess() {
        return this.isProcess;
    }

    public Boolean getProcess() {
        return this.process;
    }

    public String getUrl() {
        return this.url;
    }

    public Boolean getHasSpecs() {
        return this.hasSpecs;
    }

    public Long getCouponId() {
        return this.couponId;
    }

    public String getTitleMemo() {
        return this.titleMemo;
    }

    public Integer getPlatFormStatus() {
        return this.platFormStatus;
    }

    public Integer getCouponType() {
        return this.couponType;
    }

    public Long getCreatorCustomer() {
        return this.creatorCustomer;
    }

    public BigDecimal getInventoryCount() {
        return this.inventoryCount;
    }

    public String getManufacturingStrategy() {
        return this.manufacturingStrategy;
    }

    public Integer getMtoStrategy() {
        return this.mtoStrategy;
    }

    public Integer getStrategyComparisonRule() {
        return this.strategyComparisonRule;
    }

    public List<ProductAlbumVO> getProductAlbums() {
        return this.productAlbums;
    }

    public List<ProductAttachmentVO> getProductAttachments() {
        return this.productAttachments;
    }

    public List<ProductParameterExtendVO> getProductParams() {
        return this.productParams;
    }

    public List<ProductSpecItemDTO> getProductSpecItems() {
        return this.productSpecItems;
    }

    public String getProductDefine1() {
        return this.productDefine1;
    }

    public String getProductDefine2() {
        return this.productDefine2;
    }

    public String getProductDefine3() {
        return this.productDefine3;
    }

    public String getProductDefine4() {
        return this.productDefine4;
    }

    public String getProductDefine5() {
        return this.productDefine5;
    }

    public String getProductDefine6() {
        return this.productDefine6;
    }

    public String getProductDefine7() {
        return this.productDefine7;
    }

    public String getProductDefine8() {
        return this.productDefine8;
    }

    public String getProductDefine9() {
        return this.productDefine9;
    }

    public String getProductDefine10() {
        return this.productDefine10;
    }

    public String getProductDefine11() {
        return this.productDefine11;
    }

    public String getProductDefine12() {
        return this.productDefine12;
    }

    public String getProductDefine13() {
        return this.productDefine13;
    }

    public String getProductDefine14() {
        return this.productDefine14;
    }

    public String getProductDefine15() {
        return this.productDefine15;
    }

    public String getProductDefine16() {
        return this.productDefine16;
    }

    public String getProductDefine17() {
        return this.productDefine17;
    }

    public String getProductDefine18() {
        return this.productDefine18;
    }

    public String getProductDefine19() {
        return this.productDefine19;
    }

    public String getProductDefine20() {
        return this.productDefine20;
    }

    public String getProductDefine21() {
        return this.productDefine21;
    }

    public String getProductDefine22() {
        return this.productDefine22;
    }

    public String getProductDefine23() {
        return this.productDefine23;
    }

    public String getProductDefine24() {
        return this.productDefine24;
    }

    public String getProductDefine25() {
        return this.productDefine25;
    }

    public String getProductDefine26() {
        return this.productDefine26;
    }

    public String getProductDefine27() {
        return this.productDefine27;
    }

    public String getProductDefine28() {
        return this.productDefine28;
    }

    public String getProductDefine29() {
        return this.productDefine29;
    }

    public String getProductDefine30() {
        return this.productDefine30;
    }

    public String getProductFreeDefine1() {
        return this.productFreeDefine1;
    }

    public String getProductFreeDefine2() {
        return this.productFreeDefine2;
    }

    public String getProductFreeDefine3() {
        return this.productFreeDefine3;
    }

    public String getProductFreeDefine4() {
        return this.productFreeDefine4;
    }

    public String getProductFreeDefine5() {
        return this.productFreeDefine5;
    }

    public String getProductFreeDefine6() {
        return this.productFreeDefine6;
    }

    public String getProductFreeDefine7() {
        return this.productFreeDefine7;
    }

    public String getProductFreeDefine8() {
        return this.productFreeDefine8;
    }

    public String getProductFreeDefine9() {
        return this.productFreeDefine9;
    }

    public String getProductFreeDefine10() {
        return this.productFreeDefine10;
    }

    public String getProductFreeDefine11() {
        return this.productFreeDefine11;
    }

    public String getProductFreeDefine12() {
        return this.productFreeDefine12;
    }

    public String getProductFreeDefine13() {
        return this.productFreeDefine13;
    }

    public String getProductFreeDefine14() {
        return this.productFreeDefine14;
    }

    public String getProductFreeDefine15() {
        return this.productFreeDefine15;
    }

    public String getProductFreeDefine16() {
        return this.productFreeDefine16;
    }

    public String getProductFreeDefine17() {
        return this.productFreeDefine17;
    }

    public String getProductFreeDefine18() {
        return this.productFreeDefine18;
    }

    public String getProductFreeDefine19() {
        return this.productFreeDefine19;
    }

    public String getProductFreeDefine20() {
        return this.productFreeDefine20;
    }

    public String getProductFreeDefine21() {
        return this.productFreeDefine21;
    }

    public String getProductFreeDefine22() {
        return this.productFreeDefine22;
    }

    public String getProductFreeDefine23() {
        return this.productFreeDefine23;
    }

    public String getProductFreeDefine24() {
        return this.productFreeDefine24;
    }

    public String getProductFreeDefine25() {
        return this.productFreeDefine25;
    }

    public String getProductFreeDefine26() {
        return this.productFreeDefine26;
    }

    public String getProductFreeDefine27() {
        return this.productFreeDefine27;
    }

    public String getProductFreeDefine28() {
        return this.productFreeDefine28;
    }

    public String getProductFreeDefine29() {
        return this.productFreeDefine29;
    }

    public String getProductFreeDefine30() {
        return this.productFreeDefine30;
    }

    public String getFree1() {
        return this.free1;
    }

    public String getFree2() {
        return this.free2;
    }

    public String getFree3() {
        return this.free3;
    }

    public String getFree4() {
        return this.free4;
    }

    public String getFree5() {
        return this.free5;
    }

    public String getFree6() {
        return this.free6;
    }

    public String getFree7() {
        return this.free7;
    }

    public String getFree8() {
        return this.free8;
    }

    public String getFree9() {
        return this.free9;
    }

    public String getFree10() {
        return this.free10;
    }

    public String getMaterialStatus() {
        return this.materialStatus;
    }

    public String getOrgMaterialStatus() {
        return this.orgMaterialStatus;
    }

    public Integer getFullSetInspection() {
        return this.fullSetInspection;
    }

    public List<CharacterDTO> getCharacterDTOList() {
        return this.characterDTOList;
    }

    public String getHomepageBusinessId() {
        return this.homepageBusinessId;
    }

    public String getImgBusinessId() {
        return this.imgBusinessId;
    }

    public String getVideoBusinessId() {
        return this.videoBusinessId;
    }

    public String getAttachments() {
        return this.attachments;
    }

    public String getCostItems() {
        return this.costItems;
    }

    public String getCostItemsCode() {
        return this.costItemsCode;
    }

    public String getCostItemsName() {
        return this.costItemsName;
    }

    public Integer getProjectTrackStrategy() {
        return this.projectTrackStrategy;
    }

    public Integer getCheckByProject() {
        return this.checkByProject;
    }

    public Integer getCheckBySalesOrders() {
        return this.checkBySalesOrders;
    }

    public Integer getCheckByClient() {
        return this.checkByClient;
    }

    public Integer getCheckByOutsourcing() {
        return this.checkByOutsourcing;
    }

    public Long getBillingUnit() {
        return this.billingUnit;
    }

    public String getBillingUnitCode() {
        return this.billingUnitCode;
    }

    public String getBillingUnitName() {
        return this.billingUnitName;
    }

    public Integer getSendInspection() {
        return this.sendInspection;
    }

    public Integer getReturnInspection() {
        return this.returnInspection;
    }

    public Integer getIBaseSaleCount() {
        return this.iBaseSaleCount;
    }

    public Integer getIABCClass() {
        return this.iABCClass;
    }

    public Integer getAtpInspection() {
        return this.atpInspection;
    }

    public BigDecimal getDoublePick() {
        return this.doublePick;
    }

    public Integer getCheckByRevenueManagement() {
        return this.checkByRevenueManagement;
    }

    public Integer getOptionalType() {
        return this.optionalType;
    }

    public Integer getOverSigning() {
        return this.overSigning;
    }

    public Integer getInspectionControlPoint() {
        return this.inspectionControlPoint;
    }

    public Boolean getAllowStorePurchase() {
        return this.allowStorePurchase;
    }

    public Boolean getIsOfflineStoreOrder() {
        return this.isOfflineStoreOrder;
    }

    public Boolean getIsOfflineStoreReturn() {
        return this.isOfflineStoreReturn;
    }

    public Map<String, Object> getCustomExtend() {
        return this.customExtend;
    }

    public Boolean getIsPriceChangeAllowed() {
        return this.isPriceChangeAllowed;
    }

    public String getMktRequireUnitName() {
        return this.mktRequireUnitName;
    }

    public String getMktRequireUnitPrecision() {
        return this.mktRequireUnitPrecision;
    }

    public String getMktRequireUniterpCode() {
        return this.mktRequireUniterpCode;
    }

    public String getMktOfflineUnitName() {
        return this.mktOfflineUnitName;
    }

    public String getMktOfflineUnitPrecision() {
        return this.mktOfflineUnitPrecision;
    }

    public String getMktOfflineUniterpCode() {
        return this.mktOfflineUniterpCode;
    }

    public String getFiOutTaxrateName() {
        return this.fiOutTaxrateName;
    }

    public String getLowestMarkPrice() {
        return this.lowestMarkPrice;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public Integer getProductInspection() {
        return this.productInspection;
    }

    public Integer getProductInspectionCtrlPoint() {
        return this.productInspectionCtrlPoint;
    }

    public Integer getOutSourceInspection() {
        return this.outSourceInspection;
    }

    public Integer getOutSourceInspectionCtrlPoint() {
        return this.outSourceInspectionCtrlPoint;
    }

    public Integer getTransferInspection() {
        return this.transferInspection;
    }

    public Integer getTransferInspectionCtrlPoint() {
        return this.transferInspectionCtrlPoint;
    }

    public Integer getProductFirstInspection() {
        return this.productFirstInspection;
    }

    public Integer getFirstInspectionCtrlMethod() {
        return this.firstInspectionCtrlMethod;
    }

    public Integer getSendInspectionCtrlPoint() {
        return this.sendInspectionCtrlPoint;
    }

    public Integer getReturnInspectionCtrlPoint() {
        return this.returnInspectionCtrlPoint;
    }

    public Boolean getMallOnlyOrder() {
        return this.mallOnlyOrder;
    }

    public Boolean getMallIControlTime() {
        return this.mallIControlTime;
    }

    public Integer getMallDepositDealPayType() {
        return this.mallDepositDealPayType;
    }

    public BigDecimal getMallDepositPercentage() {
        return this.mallDepositPercentage;
    }

    public Integer getMallCustomerServiceDay() {
        return this.mallCustomerServiceDay;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public String getMallMetaDescription() {
        return this.mallMetaDescription;
    }

    public Boolean getMallIsAllArea() {
        return this.mallIsAllArea;
    }

    public MultiLangText getMktOnlineUnit___Name() {
        return this.mktOnlineUnit___Name;
    }

    public String getMallSaleStyle() {
        return this.mallSaleStyle;
    }

    public Long getMallDlyFeeRuleId() {
        return this.mallDlyFeeRuleId;
    }

    public Boolean getMallEnableDeposit() {
        return this.mallEnableDeposit;
    }

    public Integer getMallUpcount() {
        return this.mallUpcount;
    }

    public Integer getMallDowncount() {
        return this.mallDowncount;
    }

    public Boolean getMallEnableSubscribe() {
        return this.mallEnableSubscribe;
    }

    public String getMallPageTitle() {
        return this.mallPageTitle;
    }

    public Integer getMallSalePoints() {
        return this.mallSalePoints;
    }

    public Boolean getMallEnableCyclePurchase() {
        return this.mallEnableCyclePurchase;
    }

    public BigDecimal getMallDeposits() {
        return this.mallDeposits;
    }

    public Long getMallGiftCardId() {
        return this.mallGiftCardId;
    }

    public String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    public Integer getTurnoverMaterials() {
        return this.turnoverMaterials;
    }

    public Integer getAmortizationMethod() {
        return this.amortizationMethod;
    }

    public BigDecimal getMeasurementCount() {
        return this.measurementCount;
    }

    public Long getMeasurementUnit() {
        return this.measurementUnit;
    }

    public String getMeasurementUnitName() {
        return this.measurementUnitName;
    }

    public String getMeasurementUnitCode() {
        return this.measurementUnitCode;
    }

    public BigDecimal getCompensationAmount() {
        return this.compensationAmount;
    }

    public BigDecimal getMoldingTime() {
        return this.moldingTime;
    }

    public BigDecimal getMoldCavities() {
        return this.moldCavities;
    }

    public Integer getMeasurementUnitPrecision() {
        return this.measurementUnitPrecision;
    }

    public Integer getReviewCycle() {
        return this.reviewCycle;
    }

    public Integer getEffectiveLeadTime() {
        return this.effectiveLeadTime;
    }

    public String getProductionMode() {
        return this.productionMode;
    }

    public Integer getBalance() {
        return this.balance;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreateOrgId(String createOrgId) {
        this.createOrgId = createOrgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public void setOrgIdCode(String orgIdCode) {
        this.orgIdCode = orgIdCode;
    }

    public void setOrgIdName(String orgIdName) {
        this.orgIdName = orgIdName;
    }

    public void setOrgIdName_multLang(MultiLangText orgIdName_multLang) {
        this.orgIdName_multLang = orgIdName_multLang;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName_multiLang(MultiLangText name_multiLang) {
        this.name_multiLang = name_multiLang;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setProductApplyRangeId(Long productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public void setTransTypeName(String transTypeName) {
        this.transTypeName = transTypeName;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public void setUnitErpCode(String unitErpCode) {
        this.unitErpCode = unitErpCode;
    }

    public void setUnitTruncationType(Integer unitTruncationType) {
        this.unitTruncationType = unitTruncationType;
    }

    public void setUnitExchangeType(Integer unitExchangeType) {
        this.unitExchangeType = unitExchangeType;
    }

    public void setMainUnitCount(BigDecimal mainUnitCount) {
        this.mainUnitCount = mainUnitCount;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void setUnitName_multLang(MultiLangText unitName_multLang) {
        this.unitName_multLang = unitName_multLang;
    }

    public void setUnitPrecision(Integer unitPrecision) {
        this.unitPrecision = unitPrecision;
    }

    public void setUnitUseType(Integer unitUseType) {
        this.unitUseType = unitUseType;
    }

    public void setProductPropCharacterDefine(String productPropCharacterDefine) {
        this.productPropCharacterDefine = productPropCharacterDefine;
    }

    public void setProductPropCharacterDefineMap(HashMap<String, Object> productPropCharacterDefineMap) {
        this.productPropCharacterDefineMap = productPropCharacterDefineMap;
    }

    public void setProductCharacterDef(HashMap<String, Object> productCharacterDef) {
        this.productCharacterDef = productCharacterDef;
    }

    public void setProductExtendCharacterDef(HashMap<String, Object> productExtendCharacterDef) {
        this.productExtendCharacterDef = productExtendCharacterDef;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setAssistUnit(Long assistUnit) {
        this.assistUnit = assistUnit;
    }

    public void setEnableAssistUnit(Boolean enableAssistUnit) {
        this.enableAssistUnit = enableAssistUnit;
    }

    public void setUnitConvertCoefficient(BigDecimal unitConvertCoefficient) {
        this.unitConvertCoefficient = unitConvertCoefficient;
    }

    public void setModelDescription(String modelDescription) {
        this.modelDescription = modelDescription;
    }

    public void setSingleInspection(Integer singleInspection) {
        this.singleInspection = singleInspection;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModel_multiLang(MultiLangText model_multiLang) {
        this.model_multiLang = model_multiLang;
    }

    public void setManageClass(Long manageClass) {
        this.manageClass = manageClass;
    }

    public void setManageClassPath(String manageClassPath) {
        this.manageClassPath = manageClassPath;
    }

    public void setManageClassCode(String manageClassCode) {
        this.manageClassCode = manageClassCode;
    }

    public void setManageClassName(String manageClassName) {
        this.manageClassName = manageClassName;
    }

    public void setManageClassName_multiLang(MultiLangText manageClassName_multiLang) {
        this.manageClassName_multiLang = manageClassName_multiLang;
    }

    public void setPurchaseClass(Long purchaseClass) {
        this.purchaseClass = purchaseClass;
    }

    public void setPurchaseClassCode(String purchaseClassCode) {
        this.purchaseClassCode = purchaseClassCode;
    }

    public void setPurchaseClassName(String purchaseClassName) {
        this.purchaseClassName = purchaseClassName;
    }

    public void setCostClass(Long costClass) {
        this.costClass = costClass;
    }

    public void setCostClassCode(String costClassCode) {
        this.costClassCode = costClassCode;
    }

    public void setCostClassName(String costClassName) {
        this.costClassName = costClassName;
    }

    public void setCostClassName_multiLang(MultiLangText costClassName_multiLang) {
        this.costClassName_multiLang = costClassName_multiLang;
    }

    public void setBrand(Long brand) {
        this.brand = brand;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setBrandName_multiLang(MultiLangText brandName_multiLang) {
        this.brandName_multiLang = brandName_multiLang;
    }

    public void setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public void setProductLine(Long productLine) {
        this.productLine = productLine;
    }

    public void setProductLineCode(String productLineCode) {
        this.productLineCode = productLineCode;
    }

    public void setProductLineName(String productLineName) {
        this.productLineName = productLineName;
    }

    public void setProductLineName_multiLang(MultiLangText productLineName_multiLang) {
        this.productLineName_multiLang = productLineName_multiLang;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setWeightUnit(Long weightUnit) {
        this.weightUnit = weightUnit;
    }

    public void setNetWeight(BigDecimal netWeight) {
        this.netWeight = netWeight;
    }

    public void setNetWeightUnit(Long netWeightUnit) {
        this.netWeightUnit = netWeightUnit;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public void setVolumeUnit(Long volumeUnit) {
        this.volumeUnit = volumeUnit;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setProductBarCodes(List<String> productBarCodes) {
        this.productBarCodes = productBarCodes;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public void setErpOuterCode(String erpOuterCode) {
        this.erpOuterCode = erpOuterCode;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setMktDisplayPrice(Boolean mktDisplayPrice) {
        this.mktDisplayPrice = mktDisplayPrice;
    }

    public void setMktPriceAreaMessage(String mktPriceAreaMessage) {
        this.mktPriceAreaMessage = mktPriceAreaMessage;
    }

    public void setMktBatchPriceUnit(Long mktBatchPriceUnit) {
        this.mktBatchPriceUnit = mktBatchPriceUnit;
    }

    public void setMktBatchPrice(BigDecimal mktBatchPrice) {
        this.mktBatchPrice = mktBatchPrice;
    }

    public void setMktBatchUnit(Long mktBatchUnit) {
        this.mktBatchUnit = mktBatchUnit;
    }

    public void setMktBatchUnitName(String mktBatchUnitName) {
        this.mktBatchUnitName = mktBatchUnitName;
    }

    public void setMktBatchUnitCode(String mktBatchUnitCode) {
        this.mktBatchUnitCode = mktBatchUnitCode;
    }

    public void setMktOnlineUnit(Long mktOnlineUnit) {
        this.mktOnlineUnit = mktOnlineUnit;
    }

    public void setMktOfflineUnit(Long mktOfflineUnit) {
        this.mktOfflineUnit = mktOfflineUnit;
    }

    public void setMktRequireUnit(Long mktRequireUnit) {
        this.mktRequireUnit = mktRequireUnit;
    }

    public void setMktMarkPrice(BigDecimal mktMarkPrice) {
        this.mktMarkPrice = mktMarkPrice;
    }

    public void setMktSalePrice(BigDecimal mktSalePrice) {
        this.mktSalePrice = mktSalePrice;
    }

    public void setMktMarketPrice(BigDecimal mktMarketPrice) {
        this.mktMarketPrice = mktMarketPrice;
    }

    public void setMktStatus(Boolean mktStatus) {
        this.mktStatus = mktStatus;
    }

    public void setMktUOrderStatus(Boolean mktUOrderStatus) {
        this.mktUOrderStatus = mktUOrderStatus;
    }

    public void setOrderUpCount(Integer orderUpCount) {
        this.orderUpCount = orderUpCount;
    }

    public void setOrderDownCount(Integer orderDownCount) {
        this.orderDownCount = orderDownCount;
    }

    public void setUpuMaxPrimeCosts(BigDecimal upuMaxPrimeCosts) {
        this.upuMaxPrimeCosts = upuMaxPrimeCosts;
    }

    public void setUpuPrimeCosts(BigDecimal upuPrimeCosts) {
        this.upuPrimeCosts = upuPrimeCosts;
    }

    public void setUpuRequestOrderLimit(BigDecimal upuRequestOrderLimit) {
        this.upuRequestOrderLimit = upuRequestOrderLimit;
    }

    public void setUpuArrivalAllowErrorLimit(BigDecimal upuArrivalAllowErrorLimit) {
        this.upuArrivalAllowErrorLimit = upuArrivalAllowErrorLimit;
    }

    public void setUpuInvoiceAllowErrorLimit(BigDecimal upuInvoiceAllowErrorLimit) {
        this.upuInvoiceAllowErrorLimit = upuInvoiceAllowErrorLimit;
    }

    public void setUpuPurchaseUnit(Long upuPurchaseUnit) {
        this.upuPurchaseUnit = upuPurchaseUnit;
    }

    public void setUpuPurchaseUnitName(String upuPurchaseUnitName) {
        this.upuPurchaseUnitName = upuPurchaseUnitName;
    }

    public void setUpuPurchaseUnitCode(String upuPurchaseUnitCode) {
        this.upuPurchaseUnitCode = upuPurchaseUnitCode;
    }

    public void setUpuPurchaseUnitPrecision(Integer upuPurchaseUnitPrecision) {
        this.upuPurchaseUnitPrecision = upuPurchaseUnitPrecision;
    }

    public void setUpuPurchasePriceUnit(Long upuPurchasePriceUnit) {
        this.upuPurchasePriceUnit = upuPurchasePriceUnit;
    }

    public void setUpuPurchasePriceUnitName(String upuPurchasePriceUnitName) {
        this.upuPurchasePriceUnitName = upuPurchasePriceUnitName;
    }

    public void setUpuPurchasePriceUnitCode(String upuPurchasePriceUnitCode) {
        this.upuPurchasePriceUnitCode = upuPurchasePriceUnitCode;
    }

    public void setUpuPurchaseTimes(BigDecimal upuPurchaseTimes) {
        this.upuPurchaseTimes = upuPurchaseTimes;
    }

    public void setUpuPurchaseOrderQuantity(BigDecimal upuPurchaseOrderQuantity) {
        this.upuPurchaseOrderQuantity = upuPurchaseOrderQuantity;
    }

    public void setSaleCanSale(Boolean saleCanSale) {
        this.saleCanSale = saleCanSale;
    }

    public void setSaleMinOrderQuantity(BigDecimal saleMinOrderQuantity) {
        this.saleMinOrderQuantity = saleMinOrderQuantity;
    }

    public void setSaleDoubleSale(BigDecimal saleDoubleSale) {
        this.saleDoubleSale = saleDoubleSale;
    }

    public void setSaleDeliveryDays(Integer saleDeliveryDays) {
        this.saleDeliveryDays = saleDeliveryDays;
    }

    public void setSaleChannel(String saleChannel) {
        this.saleChannel = saleChannel;
    }

    public void setSaleProductClass(Long saleProductClass) {
        this.saleProductClass = saleProductClass;
    }

    public void setSaleProductClassCode(String saleProductClassCode) {
        this.saleProductClassCode = saleProductClassCode;
    }

    public void setSaleProductClassName(String saleProductClassName) {
        this.saleProductClassName = saleProductClassName;
    }

    public void setSaleProductClassPath(String saleProductClassPath) {
        this.saleProductClassPath = saleProductClassPath;
    }

    public void setStockOmsWarehouse(String stockOmsWarehouse) {
        this.stockOmsWarehouse = stockOmsWarehouse;
    }

    public void setStockBatchManage(Boolean stockBatchManage) {
        this.stockBatchManage = stockBatchManage;
    }

    public void setStockExpiryDateManage(Boolean stockExpiryDateManage) {
        this.stockExpiryDateManage = stockExpiryDateManage;
    }

    public void setStockExpiryDateCalculationMethod(String stockExpiryDateCalculationMethod) {
        this.stockExpiryDateCalculationMethod = stockExpiryDateCalculationMethod;
    }

    public void setStockExpireDateNo(String stockExpireDateNo) {
        this.stockExpireDateNo = stockExpireDateNo;
    }

    public void setStockExpireDateUnit(String stockExpireDateUnit) {
        this.stockExpireDateUnit = stockExpireDateUnit;
    }

    public void setStockDaysBeforeValidityReject(String stockDaysBeforeValidityReject) {
        this.stockDaysBeforeValidityReject = stockDaysBeforeValidityReject;
    }

    public void setStockValidityWarningDays(String stockValidityWarningDays) {
        this.stockValidityWarningDays = stockValidityWarningDays;
    }

    public void setStockSerialNoManage(Boolean stockSerialNoManage) {
        this.stockSerialNoManage = stockSerialNoManage;
    }

    public void setStockBarcodeManage(Boolean stockBarcodeManage) {
        this.stockBarcodeManage = stockBarcodeManage;
    }

    public void setStockManageByInventory(Integer stockManageByInventory) {
        this.stockManageByInventory = stockManageByInventory;
    }

    public void setStockSafetyStock(BigDecimal stockSafetyStock) {
        this.stockSafetyStock = stockSafetyStock;
    }

    public void setStockHighestStock(BigDecimal stockHighestStock) {
        this.stockHighestStock = stockHighestStock;
    }

    public void setStockLowestStock(BigDecimal stockLowestStock) {
        this.stockLowestStock = stockLowestStock;
    }

    public void setStockRopStock(BigDecimal stockRopStock) {
        this.stockRopStock = stockRopStock;
    }

    public void setStockDeliveryWarehouse(Long stockDeliveryWarehouse) {
        this.stockDeliveryWarehouse = stockDeliveryWarehouse;
    }

    public void setStockDeliveryWarehouseName(String stockDeliveryWarehouseName) {
        this.stockDeliveryWarehouseName = stockDeliveryWarehouseName;
    }

    public void setStockReturnWarehouse(Long stockReturnWarehouse) {
        this.stockReturnWarehouse = stockReturnWarehouse;
    }

    public void setStockReturnWarehouseName(String stockReturnWarehouseName) {
        this.stockReturnWarehouseName = stockReturnWarehouseName;
    }

    public void setStockReceiptWarehouse(Long stockReceiptWarehouse) {
        this.stockReceiptWarehouse = stockReceiptWarehouse;
    }

    public void setStockReceiptWarehouseName(String stockReceiptWarehouseName) {
        this.stockReceiptWarehouseName = stockReceiptWarehouseName;
    }

    public void setStockInStoreExcessLimit(BigDecimal stockInStoreExcessLimit) {
        this.stockInStoreExcessLimit = stockInStoreExcessLimit;
    }

    public void setStockOutStoreExcessLimit(BigDecimal stockOutStoreExcessLimit) {
        this.stockOutStoreExcessLimit = stockOutStoreExcessLimit;
    }

    public void setStockInStoreLessLimit(BigDecimal stockInStoreLessLimit) {
        this.stockInStoreLessLimit = stockInStoreLessLimit;
    }

    public void setStockOutStoreLessLimit(BigDecimal stockOutStoreLessLimit) {
        this.stockOutStoreLessLimit = stockOutStoreLessLimit;
    }

    public void setStockMaximumTurnoverDays(Integer stockMaximumTurnoverDays) {
        this.stockMaximumTurnoverDays = stockMaximumTurnoverDays;
    }

    public void setStockScanCountUnit(Long stockScanCountUnit) {
        this.stockScanCountUnit = stockScanCountUnit;
    }

    public void setStockReservation(Boolean stockReservation) {
        this.stockReservation = stockReservation;
    }

    public void setStockStorageLossRate(BigDecimal stockStorageLossRate) {
        this.stockStorageLossRate = stockStorageLossRate;
    }

    public void setStockAllowNegativeInventory(Boolean stockAllowNegativeInventory) {
        this.stockAllowNegativeInventory = stockAllowNegativeInventory;
    }

    public void setStockStockUnit(Long stockStockUnit) {
        this.stockStockUnit = stockStockUnit;
    }

    public void setStockStockUnitCode(String stockStockUnitCode) {
        this.stockStockUnitCode = stockStockUnitCode;
    }

    public void setStockStockUnitName(String stockStockUnitName) {
        this.stockStockUnitName = stockStockUnitName;
    }

    public void setDemandPlanningUnit(Long demandPlanningUnit) {
        this.demandPlanningUnit = demandPlanningUnit;
    }

    public void setDemandPlanningUnitCode(String demandPlanningUnitCode) {
        this.demandPlanningUnitCode = demandPlanningUnitCode;
    }

    public void setDemandPlanningUnitName(String demandPlanningUnitName) {
        this.demandPlanningUnitName = demandPlanningUnitName;
    }

    public void setInspectionType(Boolean inspectionType) {
        this.inspectionType = inspectionType;
    }

    public void setTestRule(Integer testRule) {
        this.testRule = testRule;
    }

    public void setInspectionReturnsWarehousingByResult(Boolean inspectionReturnsWarehousingByResult) {
        this.inspectionReturnsWarehousingByResult = inspectionReturnsWarehousingByResult;
    }

    public void setPlanCheckDays(Integer planCheckDays) {
        this.planCheckDays = planCheckDays;
    }

    public void setInspectionUnit(Long inspectionUnit) {
        this.inspectionUnit = inspectionUnit;
    }

    public void setEdSupplyType(Integer edSupplyType) {
        this.edSupplyType = edSupplyType;
    }

    @Deprecated
    public void setEdProduceDepartment(Integer edProduceDepartment) {
        this.edProduceDepartment = edProduceDepartment;
    }

    public void setEdProduceDepartmentNew(String edProduceDepartmentNew) {
        this.edProduceDepartmentNew = edProduceDepartmentNew;
    }

    public void setEdBindCarrier(Boolean edBindCarrier) {
        this.edBindCarrier = edBindCarrier;
    }

    public void setEdPurpose(Integer edPurpose) {
        this.edPurpose = edPurpose;
    }

    public void setEdWeigh(String edWeigh) {
        this.edWeigh = edWeigh;
    }

    public void setDoubleReplenish(Double doubleReplenish) {
        this.doubleReplenish = doubleReplenish;
    }

    public void setEdEngineeringDrawingNo(String edEngineeringDrawingNo) {
        this.edEngineeringDrawingNo = edEngineeringDrawingNo;
    }

    public void setEdECNControl(String edECNControl) {
        this.edECNControl = edECNControl;
    }

    public void setEdPlanDefaultAttribute(String edPlanDefaultAttribute) {
        this.edPlanDefaultAttribute = edPlanDefaultAttribute;
    }

    public void setEdPlanMethod(String edPlanMethod) {
        this.edPlanMethod = edPlanMethod;
    }

    public void setEdManufacturePlanner(String edManufacturePlanner) {
        this.edManufacturePlanner = edManufacturePlanner;
    }

    public void setEdPlanProduceLimit(BigDecimal edPlanProduceLimit) {
        this.edPlanProduceLimit = edPlanProduceLimit;
    }

    public void setEdKeySubPart(String edKeySubPart) {
        this.edKeySubPart = edKeySubPart;
    }

    public void setEdBOMType(String edBOMType) {
        this.edBOMType = edBOMType;
    }

    public void setEdBOMSource(String edBOMSource) {
        this.edBOMSource = edBOMSource;
    }

    public void setEdBatchRule(String edBatchRule) {
        this.edBatchRule = edBatchRule;
    }

    public void setEdEconomicQuantity(BigDecimal edEconomicQuantity) {
        this.edEconomicQuantity = edEconomicQuantity;
    }

    public void setEdFixedQuantity(BigDecimal edFixedQuantity) {
        this.edFixedQuantity = edFixedQuantity;
    }

    public void setEdBatchDouble(BigDecimal edBatchDouble) {
        this.edBatchDouble = edBatchDouble;
    }

    public void setEdFrontLeadTime(Integer edFrontLeadTime) {
        this.edFrontLeadTime = edFrontLeadTime;
    }

    public void setEdBehindLeadTime(Integer edBehindLeadTime) {
        this.edBehindLeadTime = edBehindLeadTime;
    }

    public void setEdFixedLeadTime(Integer edFixedLeadTime) {
        this.edFixedLeadTime = edFixedLeadTime;
    }

    public void setEdLeadTimeCoefficient(BigDecimal edLeadTimeCoefficient) {
        this.edLeadTimeCoefficient = edLeadTimeCoefficient;
    }

    public void setEdLeadTimeQuantity(BigDecimal edLeadTimeQuantity) {
        this.edLeadTimeQuantity = edLeadTimeQuantity;
    }

    public void setEdLossType(Integer edLossType) {
        this.edLossType = edLossType;
    }

    public void setEdFixedWastage(String edFixedWastage) {
        this.edFixedWastage = edFixedWastage;
    }

    public void setEdRejectRate(BigDecimal edRejectRate) {
        this.edRejectRate = edRejectRate;
    }

    public void setEdPrepareFeed(Boolean edPrepareFeed) {
        this.edPrepareFeed = edPrepareFeed;
    }

    @Deprecated
    public void setEdWastageRate(Boolean edWastageRate) {
        this.edWastageRate = edWastageRate;
    }

    public void setWastageRate(BigDecimal wastageRate) {
        this.wastageRate = wastageRate;
    }

    public void setEdDirectProduction(Boolean edDirectProduction) {
        this.edDirectProduction = edDirectProduction;
    }

    public void setEdSpecialMaterials(Boolean edSpecialMaterials) {
        this.edSpecialMaterials = edSpecialMaterials;
    }

    public void setEdVirtualPart(Boolean edVirtualPart) {
        this.edVirtualPart = edVirtualPart;
    }

    public void setEdDemandConsolidation(Integer edDemandConsolidation) {
        this.edDemandConsolidation = edDemandConsolidation;
    }

    public void setEdDemandConsolidationType(Integer edDemandConsolidationType) {
        this.edDemandConsolidationType = edDemandConsolidationType;
    }

    public void setEdDemandConsolidationUnit(Integer edDemandConsolidationUnit) {
        this.edDemandConsolidationUnit = edDemandConsolidationUnit;
    }

    public void setEdDemandConsolidationNumber(Integer edDemandConsolidationNumber) {
        this.edDemandConsolidationNumber = edDemandConsolidationNumber;
    }

    public void setEdDemandConsolidationDateType(Integer edDemandConsolidationDateType) {
        this.edDemandConsolidationDateType = edDemandConsolidationDateType;
    }

    public void setEdResetForwardDays(Integer edResetForwardDays) {
        this.edResetForwardDays = edResetForwardDays;
    }

    public void setEdResetBackwardDays(Integer edResetBackwardDays) {
        this.edResetBackwardDays = edResetBackwardDays;
    }

    public void setEdBeyondSupplyDays(Integer edBeyondSupplyDays) {
        this.edBeyondSupplyDays = edBeyondSupplyDays;
    }

    public void setEdLogisticsRelated(Boolean edLogisticsRelated) {
        this.edLogisticsRelated = edLogisticsRelated;
    }

    public void setEdWeighingMode(Integer edWeighingMode) {
        this.edWeighingMode = edWeighingMode;
    }

    public void setEdFixedReturn(Boolean edFixedReturn) {
        this.edFixedReturn = edFixedReturn;
    }

    public void setEdReviewGrossWeight(Boolean edReviewGrossWeight) {
        this.edReviewGrossWeight = edReviewGrossWeight;
    }

    public void setEdSpecialCarTransport(Boolean edSpecialCarTransport) {
        this.edSpecialCarTransport = edSpecialCarTransport;
    }

    public void setEdProduceUnit(Long edProduceUnit) {
        this.edProduceUnit = edProduceUnit;
    }

    public void setEdProduceUnitCode(String edProduceUnitCode) {
        this.edProduceUnitCode = edProduceUnitCode;
    }

    public void setEdProduceUnitName(String edProduceUnitName) {
        this.edProduceUnitName = edProduceUnitName;
    }

    public void setEdProduceUnitPercision(String edProduceUnitPercision) {
        this.edProduceUnitPercision = edProduceUnitPercision;
    }

    public void setEdPlanClass(Long edPlanClass) {
        this.edPlanClass = edPlanClass;
    }

    public void setEdPlanClassName(String edPlanClassName) {
        this.edPlanClassName = edPlanClassName;
    }

    public void setFiCostClass(Long fiCostClass) {
        this.fiCostClass = fiCostClass;
    }

    public void setFiValueManageType(Integer fiValueManageType) {
        this.fiValueManageType = fiValueManageType;
    }

    public void setFiCostValuation(Integer fiCostValuation) {
        this.fiCostValuation = fiCostValuation;
    }

    public void setFiNoTaxCostPrice(BigDecimal fiNoTaxCostPrice) {
        this.fiNoTaxCostPrice = fiNoTaxCostPrice;
    }

    public void setFiCheckByBatch(Boolean fiCheckByBatch) {
        this.fiCheckByBatch = fiCheckByBatch;
    }

    public void setAccountingByItem(Boolean accountingByItem) {
        this.accountingByItem = accountingByItem;
    }

    public void setCheckFree(Integer checkFree) {
        this.checkFree = checkFree;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }

    public void setTaxClassCode(String taxClassCode) {
        this.taxClassCode = taxClassCode;
    }

    public void setTaxClassName(String taxClassName) {
        this.taxClassName = taxClassName;
    }

    public void setTaxClassSimpleName(String taxClassSimpleName) {
        this.taxClassSimpleName = taxClassSimpleName;
    }

    public void setFiReceiptName(String fiReceiptName) {
        this.fiReceiptName = fiReceiptName;
    }

    public void setFiInTaxrate(String fiInTaxrate) {
        this.fiInTaxrate = fiInTaxrate;
    }

    public void setNoTaxation(String noTaxation) {
        this.noTaxation = noTaxation;
    }

    public void setFiOutTaxrate(String fiOutTaxrate) {
        this.fiOutTaxrate = fiOutTaxrate;
    }

    public void setFiPreferentialPolicyType(Long fiPreferentialPolicyType) {
        this.fiPreferentialPolicyType = fiPreferentialPolicyType;
    }

    public void setFiPreferentialPolicyTypeName(String fiPreferentialPolicyTypeName) {
        this.fiPreferentialPolicyTypeName = fiPreferentialPolicyTypeName;
    }

    public void setReceiptSpec(String receiptSpec) {
        this.receiptSpec = receiptSpec;
    }

    public void setReceiptModel(String receiptModel) {
        this.receiptModel = receiptModel;
    }

    public void setCreatorType(Integer creatorType) {
        this.creatorType = creatorType;
    }

    public void setRealProductAttribute(String realProductAttribute) {
        this.realProductAttribute = realProductAttribute;
    }

    @Deprecated
    public void setRealProductAttributeType(String realProductAttributeType) {
        this.realProductAttributeType = realProductAttributeType;
    }

    public void setRealProductAttributeTypeNew(Integer realProductAttributeTypeNew) {
        this.realProductAttributeTypeNew = realProductAttributeTypeNew;
    }

    @Deprecated
    public void setVirtualProductAttribute(String virtualProductAttribute) {
        this.virtualProductAttribute = virtualProductAttribute;
    }

    public void setVirtualProductAttributeNew(Integer virtualProductAttributeNew) {
        this.virtualProductAttributeNew = virtualProductAttributeNew;
    }

    public void setBusinessAttribute(String businessAttribute) {
        this.businessAttribute = businessAttribute;
    }

    public void setPtoPriceType(Integer ptoPriceType) {
        this.ptoPriceType = ptoPriceType;
    }

    public void setProductTemplate(Long productTemplate) {
        this.productTemplate = productTemplate;
    }

    public void setProductTemplateName(String productTemplateName) {
        this.productTemplateName = productTemplateName;
    }

    public void setProductTemplateSkuDynamic(Boolean productTemplateSkuDynamic) {
        this.productTemplateSkuDynamic = productTemplateSkuDynamic;
    }

    public void setBusinessAttributePurchase(Boolean businessAttributePurchase) {
        this.businessAttributePurchase = businessAttributePurchase;
    }

    public void setBusinessAttributeSelfCreate(Boolean businessAttributeSelfCreate) {
        this.businessAttributeSelfCreate = businessAttributeSelfCreate;
    }

    public void setBusinessAttributeOutSourcing(Boolean businessAttributeOutSourcing) {
        this.businessAttributeOutSourcing = businessAttributeOutSourcing;
    }

    public void setBusinessAttributeSale(Boolean businessAttributeSale) {
        this.businessAttributeSale = businessAttributeSale;
    }

    public void setSaleChannelOfOnlineBatch(Boolean saleChannelOfOnlineBatch) {
        this.saleChannelOfOnlineBatch = saleChannelOfOnlineBatch;
    }

    public void setSaleChannelOfDistribution(Boolean saleChannelOfDistribution) {
        this.saleChannelOfDistribution = saleChannelOfDistribution;
    }

    public void setEnableSparePartsManagement(Integer enableSparePartsManagement) {
        this.enableSparePartsManagement = enableSparePartsManagement;
    }

    public void setDepositPayType(String depositPayType) {
        this.depositPayType = depositPayType;
    }

    public void setMinimumDeposits(String minimumDeposits) {
        this.minimumDeposits = minimumDeposits;
    }

    public void setProductTagId(Long productTagId) {
        this.productTagId = productTagId;
    }

    public void setIsWeight(Boolean isWeight) {
        this.isWeight = isWeight;
    }

    public void setProductFamily(Integer productFamily) {
        this.productFamily = productFamily;
    }

    public void setSalesAndOperations(Integer salesAndOperations) {
        this.salesAndOperations = salesAndOperations;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public void setProductVendor(Long productVendor) {
        this.productVendor = productVendor;
    }

    public void setProductVendorName(String productVendorName) {
        this.productVendorName = productVendorName;
    }

    public void setProductBuyer(String productBuyer) {
        this.productBuyer = productBuyer;
    }

    public void setProductBuyerName(String productBuyerName) {
        this.productBuyerName = productBuyerName;
    }

    public void setWarehouseManager(String warehouseManager) {
        this.warehouseManager = warehouseManager;
    }

    public void setWarehouseManagerName(String warehouseManagerName) {
        this.warehouseManagerName = warehouseManagerName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMobileDescription(String mobileDescription) {
        this.mobileDescription = mobileDescription;
    }

    public void setMedIsRegistrationManager(Boolean medIsRegistrationManager) {
        this.medIsRegistrationManager = medIsRegistrationManager;
    }

    public void setMedIsAuthorizationManager(Boolean medIsAuthorizationManager) {
        this.medIsAuthorizationManager = medIsAuthorizationManager;
    }

    public void setMedSunshinePurchaseNo(String medSunshinePurchaseNo) {
        this.medSunshinePurchaseNo = medSunshinePurchaseNo;
    }

    public void setMedRegistrationNo(String medRegistrationNo) {
        this.medRegistrationNo = medRegistrationNo;
    }

    public void setRetailProcessType(Integer retailProcessType) {
        this.retailProcessType = retailProcessType;
    }

    public void setRetailPriceDimension(Integer retailPriceDimension) {
        this.retailPriceDimension = retailPriceDimension;
    }

    public void setMaterial(Boolean material) {
        this.material = material;
    }

    public void setSaleInOfflineStore(Boolean saleInOfflineStore) {
        this.saleInOfflineStore = saleInOfflineStore;
    }

    public void setOfflineStoreOrder(Boolean offlineStoreOrder) {
        this.offlineStoreOrder = offlineStoreOrder;
    }

    public void setIsOptionalMaterial(Integer isOptionalMaterial) {
        this.isOptionalMaterial = isOptionalMaterial;
    }

    public void setDefaultSKUId(Long defaultSKUId) {
        this.defaultSKUId = defaultSKUId;
    }

    public void setProductDetailId(Long productDetailId) {
        this.productDetailId = productDetailId;
    }

    public void setRecommendedMaterials(Boolean recommendedMaterials) {
        this.recommendedMaterials = recommendedMaterials;
    }

    @Deprecated
    public void setIsProcess(Boolean isProcess) {
        this.isProcess = isProcess;
    }

    public void setProcess(Boolean process) {
        this.process = process;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setHasSpecs(Boolean hasSpecs) {
        this.hasSpecs = hasSpecs;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public void setTitleMemo(String titleMemo) {
        this.titleMemo = titleMemo;
    }

    public void setPlatFormStatus(Integer platFormStatus) {
        this.platFormStatus = platFormStatus;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public void setCreatorCustomer(Long creatorCustomer) {
        this.creatorCustomer = creatorCustomer;
    }

    public void setInventoryCount(BigDecimal inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public void setManufacturingStrategy(String manufacturingStrategy) {
        this.manufacturingStrategy = manufacturingStrategy;
    }

    public void setMtoStrategy(Integer mtoStrategy) {
        this.mtoStrategy = mtoStrategy;
    }

    public void setStrategyComparisonRule(Integer strategyComparisonRule) {
        this.strategyComparisonRule = strategyComparisonRule;
    }

    public void setProductAlbums(List<ProductAlbumVO> productAlbums) {
        this.productAlbums = productAlbums;
    }

    public void setProductAttachments(List<ProductAttachmentVO> productAttachments) {
        this.productAttachments = productAttachments;
    }

    public void setProductParams(List<ProductParameterExtendVO> productParams) {
        this.productParams = productParams;
    }

    public void setProductSpecItems(List<ProductSpecItemDTO> productSpecItems) {
        this.productSpecItems = productSpecItems;
    }

    public void setProductDefine1(String productDefine1) {
        this.productDefine1 = productDefine1;
    }

    public void setProductDefine2(String productDefine2) {
        this.productDefine2 = productDefine2;
    }

    public void setProductDefine3(String productDefine3) {
        this.productDefine3 = productDefine3;
    }

    public void setProductDefine4(String productDefine4) {
        this.productDefine4 = productDefine4;
    }

    public void setProductDefine5(String productDefine5) {
        this.productDefine5 = productDefine5;
    }

    public void setProductDefine6(String productDefine6) {
        this.productDefine6 = productDefine6;
    }

    public void setProductDefine7(String productDefine7) {
        this.productDefine7 = productDefine7;
    }

    public void setProductDefine8(String productDefine8) {
        this.productDefine8 = productDefine8;
    }

    public void setProductDefine9(String productDefine9) {
        this.productDefine9 = productDefine9;
    }

    public void setProductDefine10(String productDefine10) {
        this.productDefine10 = productDefine10;
    }

    public void setProductDefine11(String productDefine11) {
        this.productDefine11 = productDefine11;
    }

    public void setProductDefine12(String productDefine12) {
        this.productDefine12 = productDefine12;
    }

    public void setProductDefine13(String productDefine13) {
        this.productDefine13 = productDefine13;
    }

    public void setProductDefine14(String productDefine14) {
        this.productDefine14 = productDefine14;
    }

    public void setProductDefine15(String productDefine15) {
        this.productDefine15 = productDefine15;
    }

    public void setProductDefine16(String productDefine16) {
        this.productDefine16 = productDefine16;
    }

    public void setProductDefine17(String productDefine17) {
        this.productDefine17 = productDefine17;
    }

    public void setProductDefine18(String productDefine18) {
        this.productDefine18 = productDefine18;
    }

    public void setProductDefine19(String productDefine19) {
        this.productDefine19 = productDefine19;
    }

    public void setProductDefine20(String productDefine20) {
        this.productDefine20 = productDefine20;
    }

    public void setProductDefine21(String productDefine21) {
        this.productDefine21 = productDefine21;
    }

    public void setProductDefine22(String productDefine22) {
        this.productDefine22 = productDefine22;
    }

    public void setProductDefine23(String productDefine23) {
        this.productDefine23 = productDefine23;
    }

    public void setProductDefine24(String productDefine24) {
        this.productDefine24 = productDefine24;
    }

    public void setProductDefine25(String productDefine25) {
        this.productDefine25 = productDefine25;
    }

    public void setProductDefine26(String productDefine26) {
        this.productDefine26 = productDefine26;
    }

    public void setProductDefine27(String productDefine27) {
        this.productDefine27 = productDefine27;
    }

    public void setProductDefine28(String productDefine28) {
        this.productDefine28 = productDefine28;
    }

    public void setProductDefine29(String productDefine29) {
        this.productDefine29 = productDefine29;
    }

    public void setProductDefine30(String productDefine30) {
        this.productDefine30 = productDefine30;
    }

    public void setProductFreeDefine1(String productFreeDefine1) {
        this.productFreeDefine1 = productFreeDefine1;
    }

    public void setProductFreeDefine2(String productFreeDefine2) {
        this.productFreeDefine2 = productFreeDefine2;
    }

    public void setProductFreeDefine3(String productFreeDefine3) {
        this.productFreeDefine3 = productFreeDefine3;
    }

    public void setProductFreeDefine4(String productFreeDefine4) {
        this.productFreeDefine4 = productFreeDefine4;
    }

    public void setProductFreeDefine5(String productFreeDefine5) {
        this.productFreeDefine5 = productFreeDefine5;
    }

    public void setProductFreeDefine6(String productFreeDefine6) {
        this.productFreeDefine6 = productFreeDefine6;
    }

    public void setProductFreeDefine7(String productFreeDefine7) {
        this.productFreeDefine7 = productFreeDefine7;
    }

    public void setProductFreeDefine8(String productFreeDefine8) {
        this.productFreeDefine8 = productFreeDefine8;
    }

    public void setProductFreeDefine9(String productFreeDefine9) {
        this.productFreeDefine9 = productFreeDefine9;
    }

    public void setProductFreeDefine10(String productFreeDefine10) {
        this.productFreeDefine10 = productFreeDefine10;
    }

    public void setProductFreeDefine11(String productFreeDefine11) {
        this.productFreeDefine11 = productFreeDefine11;
    }

    public void setProductFreeDefine12(String productFreeDefine12) {
        this.productFreeDefine12 = productFreeDefine12;
    }

    public void setProductFreeDefine13(String productFreeDefine13) {
        this.productFreeDefine13 = productFreeDefine13;
    }

    public void setProductFreeDefine14(String productFreeDefine14) {
        this.productFreeDefine14 = productFreeDefine14;
    }

    public void setProductFreeDefine15(String productFreeDefine15) {
        this.productFreeDefine15 = productFreeDefine15;
    }

    public void setProductFreeDefine16(String productFreeDefine16) {
        this.productFreeDefine16 = productFreeDefine16;
    }

    public void setProductFreeDefine17(String productFreeDefine17) {
        this.productFreeDefine17 = productFreeDefine17;
    }

    public void setProductFreeDefine18(String productFreeDefine18) {
        this.productFreeDefine18 = productFreeDefine18;
    }

    public void setProductFreeDefine19(String productFreeDefine19) {
        this.productFreeDefine19 = productFreeDefine19;
    }

    public void setProductFreeDefine20(String productFreeDefine20) {
        this.productFreeDefine20 = productFreeDefine20;
    }

    public void setProductFreeDefine21(String productFreeDefine21) {
        this.productFreeDefine21 = productFreeDefine21;
    }

    public void setProductFreeDefine22(String productFreeDefine22) {
        this.productFreeDefine22 = productFreeDefine22;
    }

    public void setProductFreeDefine23(String productFreeDefine23) {
        this.productFreeDefine23 = productFreeDefine23;
    }

    public void setProductFreeDefine24(String productFreeDefine24) {
        this.productFreeDefine24 = productFreeDefine24;
    }

    public void setProductFreeDefine25(String productFreeDefine25) {
        this.productFreeDefine25 = productFreeDefine25;
    }

    public void setProductFreeDefine26(String productFreeDefine26) {
        this.productFreeDefine26 = productFreeDefine26;
    }

    public void setProductFreeDefine27(String productFreeDefine27) {
        this.productFreeDefine27 = productFreeDefine27;
    }

    public void setProductFreeDefine28(String productFreeDefine28) {
        this.productFreeDefine28 = productFreeDefine28;
    }

    public void setProductFreeDefine29(String productFreeDefine29) {
        this.productFreeDefine29 = productFreeDefine29;
    }

    public void setProductFreeDefine30(String productFreeDefine30) {
        this.productFreeDefine30 = productFreeDefine30;
    }

    public void setFree1(String free1) {
        this.free1 = free1;
    }

    public void setFree2(String free2) {
        this.free2 = free2;
    }

    public void setFree3(String free3) {
        this.free3 = free3;
    }

    public void setFree4(String free4) {
        this.free4 = free4;
    }

    public void setFree5(String free5) {
        this.free5 = free5;
    }

    public void setFree6(String free6) {
        this.free6 = free6;
    }

    public void setFree7(String free7) {
        this.free7 = free7;
    }

    public void setFree8(String free8) {
        this.free8 = free8;
    }

    public void setFree9(String free9) {
        this.free9 = free9;
    }

    public void setFree10(String free10) {
        this.free10 = free10;
    }

    public void setMaterialStatus(String materialStatus) {
        this.materialStatus = materialStatus;
    }

    public void setOrgMaterialStatus(String orgMaterialStatus) {
        this.orgMaterialStatus = orgMaterialStatus;
    }

    public void setFullSetInspection(Integer fullSetInspection) {
        this.fullSetInspection = fullSetInspection;
    }

    public void setCharacterDTOList(List<CharacterDTO> characterDTOList) {
        this.characterDTOList = characterDTOList;
    }

    public void setHomepageBusinessId(String homepageBusinessId) {
        this.homepageBusinessId = homepageBusinessId;
    }

    public void setImgBusinessId(String imgBusinessId) {
        this.imgBusinessId = imgBusinessId;
    }

    public void setVideoBusinessId(String videoBusinessId) {
        this.videoBusinessId = videoBusinessId;
    }

    public void setAttachments(String attachments) {
        this.attachments = attachments;
    }

    public void setCostItems(String costItems) {
        this.costItems = costItems;
    }

    public void setCostItemsCode(String costItemsCode) {
        this.costItemsCode = costItemsCode;
    }

    public void setCostItemsName(String costItemsName) {
        this.costItemsName = costItemsName;
    }

    public void setProjectTrackStrategy(Integer projectTrackStrategy) {
        this.projectTrackStrategy = projectTrackStrategy;
    }

    public void setCheckByProject(Integer checkByProject) {
        this.checkByProject = checkByProject;
    }

    public void setCheckBySalesOrders(Integer checkBySalesOrders) {
        this.checkBySalesOrders = checkBySalesOrders;
    }

    public void setCheckByClient(Integer checkByClient) {
        this.checkByClient = checkByClient;
    }

    public void setCheckByOutsourcing(Integer checkByOutsourcing) {
        this.checkByOutsourcing = checkByOutsourcing;
    }

    public void setBillingUnit(Long billingUnit) {
        this.billingUnit = billingUnit;
    }

    public void setBillingUnitCode(String billingUnitCode) {
        this.billingUnitCode = billingUnitCode;
    }

    public void setBillingUnitName(String billingUnitName) {
        this.billingUnitName = billingUnitName;
    }

    public void setSendInspection(Integer sendInspection) {
        this.sendInspection = sendInspection;
    }

    public void setReturnInspection(Integer returnInspection) {
        this.returnInspection = returnInspection;
    }

    public void setIBaseSaleCount(Integer iBaseSaleCount) {
        this.iBaseSaleCount = iBaseSaleCount;
    }

    public void setIABCClass(Integer iABCClass) {
        this.iABCClass = iABCClass;
    }

    public void setAtpInspection(Integer atpInspection) {
        this.atpInspection = atpInspection;
    }

    public void setDoublePick(BigDecimal doublePick) {
        this.doublePick = doublePick;
    }

    public void setCheckByRevenueManagement(Integer checkByRevenueManagement) {
        this.checkByRevenueManagement = checkByRevenueManagement;
    }

    public void setOptionalType(Integer optionalType) {
        this.optionalType = optionalType;
    }

    public void setOverSigning(Integer overSigning) {
        this.overSigning = overSigning;
    }

    public void setInspectionControlPoint(Integer inspectionControlPoint) {
        this.inspectionControlPoint = inspectionControlPoint;
    }

    public void setAllowStorePurchase(Boolean allowStorePurchase) {
        this.allowStorePurchase = allowStorePurchase;
    }

    public void setIsOfflineStoreOrder(Boolean isOfflineStoreOrder) {
        this.isOfflineStoreOrder = isOfflineStoreOrder;
    }

    public void setIsOfflineStoreReturn(Boolean isOfflineStoreReturn) {
        this.isOfflineStoreReturn = isOfflineStoreReturn;
    }

    public void setCustomExtend(Map<String, Object> customExtend) {
        this.customExtend = customExtend;
    }

    public void setIsPriceChangeAllowed(Boolean isPriceChangeAllowed) {
        this.isPriceChangeAllowed = isPriceChangeAllowed;
    }

    public void setMktRequireUnitName(String mktRequireUnitName) {
        this.mktRequireUnitName = mktRequireUnitName;
    }

    public void setMktRequireUnitPrecision(String mktRequireUnitPrecision) {
        this.mktRequireUnitPrecision = mktRequireUnitPrecision;
    }

    public void setMktRequireUniterpCode(String mktRequireUniterpCode) {
        this.mktRequireUniterpCode = mktRequireUniterpCode;
    }

    public void setMktOfflineUnitName(String mktOfflineUnitName) {
        this.mktOfflineUnitName = mktOfflineUnitName;
    }

    public void setMktOfflineUnitPrecision(String mktOfflineUnitPrecision) {
        this.mktOfflineUnitPrecision = mktOfflineUnitPrecision;
    }

    public void setMktOfflineUniterpCode(String mktOfflineUniterpCode) {
        this.mktOfflineUniterpCode = mktOfflineUniterpCode;
    }

    public void setFiOutTaxrateName(String fiOutTaxrateName) {
        this.fiOutTaxrateName = fiOutTaxrateName;
    }

    public void setLowestMarkPrice(String lowestMarkPrice) {
        this.lowestMarkPrice = lowestMarkPrice;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setProductInspection(Integer productInspection) {
        this.productInspection = productInspection;
    }

    public void setProductInspectionCtrlPoint(Integer productInspectionCtrlPoint) {
        this.productInspectionCtrlPoint = productInspectionCtrlPoint;
    }

    public void setOutSourceInspection(Integer outSourceInspection) {
        this.outSourceInspection = outSourceInspection;
    }

    public void setOutSourceInspectionCtrlPoint(Integer outSourceInspectionCtrlPoint) {
        this.outSourceInspectionCtrlPoint = outSourceInspectionCtrlPoint;
    }

    public void setTransferInspection(Integer transferInspection) {
        this.transferInspection = transferInspection;
    }

    public void setTransferInspectionCtrlPoint(Integer transferInspectionCtrlPoint) {
        this.transferInspectionCtrlPoint = transferInspectionCtrlPoint;
    }

    public void setProductFirstInspection(Integer productFirstInspection) {
        this.productFirstInspection = productFirstInspection;
    }

    public void setFirstInspectionCtrlMethod(Integer firstInspectionCtrlMethod) {
        this.firstInspectionCtrlMethod = firstInspectionCtrlMethod;
    }

    public void setSendInspectionCtrlPoint(Integer sendInspectionCtrlPoint) {
        this.sendInspectionCtrlPoint = sendInspectionCtrlPoint;
    }

    public void setReturnInspectionCtrlPoint(Integer returnInspectionCtrlPoint) {
        this.returnInspectionCtrlPoint = returnInspectionCtrlPoint;
    }

    public void setMallOnlyOrder(Boolean mallOnlyOrder) {
        this.mallOnlyOrder = mallOnlyOrder;
    }

    public void setMallIControlTime(Boolean mallIControlTime) {
        this.mallIControlTime = mallIControlTime;
    }

    public void setMallDepositDealPayType(Integer mallDepositDealPayType) {
        this.mallDepositDealPayType = mallDepositDealPayType;
    }

    public void setMallDepositPercentage(BigDecimal mallDepositPercentage) {
        this.mallDepositPercentage = mallDepositPercentage;
    }

    public void setMallCustomerServiceDay(Integer mallCustomerServiceDay) {
        this.mallCustomerServiceDay = mallCustomerServiceDay;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setMallMetaDescription(String mallMetaDescription) {
        this.mallMetaDescription = mallMetaDescription;
    }

    public void setMallIsAllArea(Boolean mallIsAllArea) {
        this.mallIsAllArea = mallIsAllArea;
    }

    public void setMktOnlineUnit___Name(MultiLangText mktOnlineUnit___Name) {
        this.mktOnlineUnit___Name = mktOnlineUnit___Name;
    }

    public void setMallSaleStyle(String mallSaleStyle) {
        this.mallSaleStyle = mallSaleStyle;
    }

    public void setMallDlyFeeRuleId(Long mallDlyFeeRuleId) {
        this.mallDlyFeeRuleId = mallDlyFeeRuleId;
    }

    public void setMallEnableDeposit(Boolean mallEnableDeposit) {
        this.mallEnableDeposit = mallEnableDeposit;
    }

    public void setMallUpcount(Integer mallUpcount) {
        this.mallUpcount = mallUpcount;
    }

    public void setMallDowncount(Integer mallDowncount) {
        this.mallDowncount = mallDowncount;
    }

    public void setMallEnableSubscribe(Boolean mallEnableSubscribe) {
        this.mallEnableSubscribe = mallEnableSubscribe;
    }

    public void setMallPageTitle(String mallPageTitle) {
        this.mallPageTitle = mallPageTitle;
    }

    public void setMallSalePoints(Integer mallSalePoints) {
        this.mallSalePoints = mallSalePoints;
    }

    public void setMallEnableCyclePurchase(Boolean mallEnableCyclePurchase) {
        this.mallEnableCyclePurchase = mallEnableCyclePurchase;
    }

    public void setMallDeposits(BigDecimal mallDeposits) {
        this.mallDeposits = mallDeposits;
    }

    public void setMallGiftCardId(Long mallGiftCardId) {
        this.mallGiftCardId = mallGiftCardId;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public void setTurnoverMaterials(Integer turnoverMaterials) {
        this.turnoverMaterials = turnoverMaterials;
    }

    public void setAmortizationMethod(Integer amortizationMethod) {
        this.amortizationMethod = amortizationMethod;
    }

    public void setMeasurementCount(BigDecimal measurementCount) {
        this.measurementCount = measurementCount;
    }

    public void setMeasurementUnit(Long measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public void setMeasurementUnitName(String measurementUnitName) {
        this.measurementUnitName = measurementUnitName;
    }

    public void setMeasurementUnitCode(String measurementUnitCode) {
        this.measurementUnitCode = measurementUnitCode;
    }

    public void setCompensationAmount(BigDecimal compensationAmount) {
        this.compensationAmount = compensationAmount;
    }

    public void setMoldingTime(BigDecimal moldingTime) {
        this.moldingTime = moldingTime;
    }

    public void setMoldCavities(BigDecimal moldCavities) {
        this.moldCavities = moldCavities;
    }

    public void setMeasurementUnitPrecision(Integer measurementUnitPrecision) {
        this.measurementUnitPrecision = measurementUnitPrecision;
    }

    public void setReviewCycle(Integer reviewCycle) {
        this.reviewCycle = reviewCycle;
    }

    public void setEffectiveLeadTime(Integer effectiveLeadTime) {
        this.effectiveLeadTime = effectiveLeadTime;
    }

    public void setProductionMode(String productionMode) {
        this.productionMode = productionMode;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object o) {
        void other$productionMode;
        void this$productionMode;
        void other$moldCavities;
        void this$moldCavities;
        void other$moldingTime;
        void this$moldingTime;
        void other$compensationAmount;
        void this$compensationAmount;
        void other$measurementUnitCode;
        void this$measurementUnitCode;
        void other$measurementUnitName;
        void this$measurementUnitName;
        void other$measurementCount;
        void this$measurementCount;
        void other$deliveryMethod;
        void this$deliveryMethod;
        void other$mallDeposits;
        void this$mallDeposits;
        void other$mallPageTitle;
        void this$mallPageTitle;
        void other$mallSaleStyle;
        void this$mallSaleStyle;
        void other$mktOnlineUnit___Name;
        void this$mktOnlineUnit___Name;
        void other$mallMetaDescription;
        void this$mallMetaDescription;
        void other$keywords;
        void this$keywords;
        void other$mallDepositPercentage;
        void this$mallDepositPercentage;
        void other$createTime;
        void this$createTime;
        void other$lowestMarkPrice;
        void this$lowestMarkPrice;
        void other$fiOutTaxrateName;
        void this$fiOutTaxrateName;
        void other$mktOfflineUniterpCode;
        void this$mktOfflineUniterpCode;
        void other$mktOfflineUnitPrecision;
        void this$mktOfflineUnitPrecision;
        void other$mktOfflineUnitName;
        void this$mktOfflineUnitName;
        void other$mktRequireUniterpCode;
        void this$mktRequireUniterpCode;
        void other$mktRequireUnitPrecision;
        void this$mktRequireUnitPrecision;
        void other$mktRequireUnitName;
        void this$mktRequireUnitName;
        void other$customExtend;
        void this$customExtend;
        void other$doublePick;
        void this$doublePick;
        void other$billingUnitName;
        void this$billingUnitName;
        void other$billingUnitCode;
        void this$billingUnitCode;
        void other$costItemsName;
        void this$costItemsName;
        void other$costItemsCode;
        void this$costItemsCode;
        void other$costItems;
        void this$costItems;
        void other$attachments;
        void this$attachments;
        void other$videoBusinessId;
        void this$videoBusinessId;
        void other$imgBusinessId;
        void this$imgBusinessId;
        void other$homepageBusinessId;
        void this$homepageBusinessId;
        void other$characterDTOList;
        void this$characterDTOList;
        void other$orgMaterialStatus;
        void this$orgMaterialStatus;
        void other$materialStatus;
        void this$materialStatus;
        void other$free10;
        void this$free10;
        void other$free9;
        void this$free9;
        void other$free8;
        void this$free8;
        void other$free7;
        void this$free7;
        void other$free6;
        void this$free6;
        void other$free5;
        void this$free5;
        void other$free4;
        void this$free4;
        void other$free3;
        void this$free3;
        void other$free2;
        void this$free2;
        void other$free1;
        void this$free1;
        void other$productFreeDefine30;
        void this$productFreeDefine30;
        void other$productFreeDefine29;
        void this$productFreeDefine29;
        void other$productFreeDefine28;
        void this$productFreeDefine28;
        void other$productFreeDefine27;
        void this$productFreeDefine27;
        void other$productFreeDefine26;
        void this$productFreeDefine26;
        void other$productFreeDefine25;
        void this$productFreeDefine25;
        void other$productFreeDefine24;
        void this$productFreeDefine24;
        void other$productFreeDefine23;
        void this$productFreeDefine23;
        void other$productFreeDefine22;
        void this$productFreeDefine22;
        void other$productFreeDefine21;
        void this$productFreeDefine21;
        void other$productFreeDefine20;
        void this$productFreeDefine20;
        void other$productFreeDefine19;
        void this$productFreeDefine19;
        void other$productFreeDefine18;
        void this$productFreeDefine18;
        void other$productFreeDefine17;
        void this$productFreeDefine17;
        void other$productFreeDefine16;
        void this$productFreeDefine16;
        void other$productFreeDefine15;
        void this$productFreeDefine15;
        void other$productFreeDefine14;
        void this$productFreeDefine14;
        void other$productFreeDefine13;
        void this$productFreeDefine13;
        void other$productFreeDefine12;
        void this$productFreeDefine12;
        void other$productFreeDefine11;
        void this$productFreeDefine11;
        void other$productFreeDefine10;
        void this$productFreeDefine10;
        void other$productFreeDefine9;
        void this$productFreeDefine9;
        void other$productFreeDefine8;
        void this$productFreeDefine8;
        void other$productFreeDefine7;
        void this$productFreeDefine7;
        void other$productFreeDefine6;
        void this$productFreeDefine6;
        void other$productFreeDefine5;
        void this$productFreeDefine5;
        void other$productFreeDefine4;
        void this$productFreeDefine4;
        void other$productFreeDefine3;
        void this$productFreeDefine3;
        void other$productFreeDefine2;
        void this$productFreeDefine2;
        void other$productFreeDefine1;
        void this$productFreeDefine1;
        void other$productDefine30;
        void this$productDefine30;
        void other$productDefine29;
        void this$productDefine29;
        void other$productDefine28;
        void this$productDefine28;
        void other$productDefine27;
        void this$productDefine27;
        void other$productDefine26;
        void this$productDefine26;
        void other$productDefine25;
        void this$productDefine25;
        void other$productDefine24;
        void this$productDefine24;
        void other$productDefine23;
        void this$productDefine23;
        void other$productDefine22;
        void this$productDefine22;
        void other$productDefine21;
        void this$productDefine21;
        void other$productDefine20;
        void this$productDefine20;
        void other$productDefine19;
        void this$productDefine19;
        void other$productDefine18;
        void this$productDefine18;
        void other$productDefine17;
        void this$productDefine17;
        void other$productDefine16;
        void this$productDefine16;
        void other$productDefine15;
        void this$productDefine15;
        void other$productDefine14;
        void this$productDefine14;
        void other$productDefine13;
        void this$productDefine13;
        void other$productDefine12;
        void this$productDefine12;
        void other$productDefine11;
        void this$productDefine11;
        void other$productDefine10;
        void this$productDefine10;
        void other$productDefine9;
        void this$productDefine9;
        void other$productDefine8;
        void this$productDefine8;
        void other$productDefine7;
        void this$productDefine7;
        void other$productDefine6;
        void this$productDefine6;
        void other$productDefine5;
        void this$productDefine5;
        void other$productDefine4;
        void this$productDefine4;
        void other$productDefine3;
        void this$productDefine3;
        void other$productDefine2;
        void this$productDefine2;
        void other$productDefine1;
        void this$productDefine1;
        void other$productSpecItems;
        void this$productSpecItems;
        void other$productParams;
        void this$productParams;
        void other$productAttachments;
        void this$productAttachments;
        void other$productAlbums;
        void this$productAlbums;
        void other$manufacturingStrategy;
        void this$manufacturingStrategy;
        void other$inventoryCount;
        void this$inventoryCount;
        void other$titleMemo;
        void this$titleMemo;
        void other$url;
        void this$url;
        void other$medRegistrationNo;
        void this$medRegistrationNo;
        void other$medSunshinePurchaseNo;
        void this$medSunshinePurchaseNo;
        void other$mobileDescription;
        void this$mobileDescription;
        void other$description;
        void this$description;
        void other$warehouseManagerName;
        void this$warehouseManagerName;
        void other$warehouseManager;
        void this$warehouseManager;
        void other$productBuyerName;
        void this$productBuyerName;
        void other$productBuyer;
        void this$productBuyer;
        void other$productVendorName;
        void this$productVendorName;
        void other$mnemonicCode;
        void this$mnemonicCode;
        void other$erpCode;
        void this$erpCode;
        void other$minimumDeposits;
        void this$minimumDeposits;
        void other$depositPayType;
        void this$depositPayType;
        void other$productTemplateName;
        void this$productTemplateName;
        void other$businessAttribute;
        void this$businessAttribute;
        void other$virtualProductAttribute;
        void this$virtualProductAttribute;
        void other$realProductAttributeType;
        void this$realProductAttributeType;
        void other$realProductAttribute;
        void this$realProductAttribute;
        void other$receiptModel;
        void this$receiptModel;
        void other$receiptSpec;
        void this$receiptSpec;
        void other$fiPreferentialPolicyTypeName;
        void this$fiPreferentialPolicyTypeName;
        void other$fiOutTaxrate;
        void this$fiOutTaxrate;
        void other$noTaxation;
        void this$noTaxation;
        void other$fiInTaxrate;
        void this$fiInTaxrate;
        void other$fiReceiptName;
        void this$fiReceiptName;
        void other$taxClassSimpleName;
        void this$taxClassSimpleName;
        void other$taxClassName;
        void this$taxClassName;
        void other$taxClassCode;
        void this$taxClassCode;
        void other$taxClass;
        void this$taxClass;
        void other$fiNoTaxCostPrice;
        void this$fiNoTaxCostPrice;
        void other$edPlanClassName;
        void this$edPlanClassName;
        void other$edProduceUnitPercision;
        void this$edProduceUnitPercision;
        void other$edProduceUnitName;
        void this$edProduceUnitName;
        void other$edProduceUnitCode;
        void this$edProduceUnitCode;
        void other$wastageRate;
        void this$wastageRate;
        void other$edRejectRate;
        void this$edRejectRate;
        void other$edFixedWastage;
        void this$edFixedWastage;
        void other$edLeadTimeQuantity;
        void this$edLeadTimeQuantity;
        void other$edLeadTimeCoefficient;
        void this$edLeadTimeCoefficient;
        void other$edBatchDouble;
        void this$edBatchDouble;
        void other$edFixedQuantity;
        void this$edFixedQuantity;
        void other$edEconomicQuantity;
        void this$edEconomicQuantity;
        void other$edBatchRule;
        void this$edBatchRule;
        void other$edBOMSource;
        void this$edBOMSource;
        void other$edBOMType;
        void this$edBOMType;
        void other$edKeySubPart;
        void this$edKeySubPart;
        void other$edPlanProduceLimit;
        void this$edPlanProduceLimit;
        void other$edManufacturePlanner;
        void this$edManufacturePlanner;
        void other$edPlanMethod;
        void this$edPlanMethod;
        void other$edPlanDefaultAttribute;
        void this$edPlanDefaultAttribute;
        void other$edECNControl;
        void this$edECNControl;
        void other$edEngineeringDrawingNo;
        void this$edEngineeringDrawingNo;
        void other$edWeigh;
        void this$edWeigh;
        void other$edProduceDepartmentNew;
        void this$edProduceDepartmentNew;
        void other$demandPlanningUnitName;
        void this$demandPlanningUnitName;
        void other$demandPlanningUnitCode;
        void this$demandPlanningUnitCode;
        void other$stockStockUnitName;
        void this$stockStockUnitName;
        void other$stockStockUnitCode;
        void this$stockStockUnitCode;
        void other$stockStorageLossRate;
        void this$stockStorageLossRate;
        void other$stockOutStoreLessLimit;
        void this$stockOutStoreLessLimit;
        void other$stockInStoreLessLimit;
        void this$stockInStoreLessLimit;
        void other$stockOutStoreExcessLimit;
        void this$stockOutStoreExcessLimit;
        void other$stockInStoreExcessLimit;
        void this$stockInStoreExcessLimit;
        void other$stockReceiptWarehouseName;
        void this$stockReceiptWarehouseName;
        void other$stockReturnWarehouseName;
        void this$stockReturnWarehouseName;
        void other$stockDeliveryWarehouseName;
        void this$stockDeliveryWarehouseName;
        void other$stockRopStock;
        void this$stockRopStock;
        void other$stockLowestStock;
        void this$stockLowestStock;
        void other$stockHighestStock;
        void this$stockHighestStock;
        void other$stockSafetyStock;
        void this$stockSafetyStock;
        void other$stockValidityWarningDays;
        void this$stockValidityWarningDays;
        void other$stockDaysBeforeValidityReject;
        void this$stockDaysBeforeValidityReject;
        void other$stockExpireDateUnit;
        void this$stockExpireDateUnit;
        void other$stockExpireDateNo;
        void this$stockExpireDateNo;
        void other$stockExpiryDateCalculationMethod;
        void this$stockExpiryDateCalculationMethod;
        void other$stockOmsWarehouse;
        void this$stockOmsWarehouse;
        void other$saleProductClassPath;
        void this$saleProductClassPath;
        void other$saleProductClassName;
        void this$saleProductClassName;
        void other$saleProductClassCode;
        void this$saleProductClassCode;
        void other$saleChannel;
        void this$saleChannel;
        void other$saleDoubleSale;
        void this$saleDoubleSale;
        void other$saleMinOrderQuantity;
        void this$saleMinOrderQuantity;
        void other$upuPurchaseOrderQuantity;
        void this$upuPurchaseOrderQuantity;
        void other$upuPurchaseTimes;
        void this$upuPurchaseTimes;
        void other$upuPurchasePriceUnitCode;
        void this$upuPurchasePriceUnitCode;
        void other$upuPurchasePriceUnitName;
        void this$upuPurchasePriceUnitName;
        void other$upuPurchaseUnitCode;
        void this$upuPurchaseUnitCode;
        void other$upuPurchaseUnitName;
        void this$upuPurchaseUnitName;
        void other$upuInvoiceAllowErrorLimit;
        void this$upuInvoiceAllowErrorLimit;
        void other$upuArrivalAllowErrorLimit;
        void this$upuArrivalAllowErrorLimit;
        void other$upuRequestOrderLimit;
        void this$upuRequestOrderLimit;
        void other$upuPrimeCosts;
        void this$upuPrimeCosts;
        void other$upuMaxPrimeCosts;
        void this$upuMaxPrimeCosts;
        void other$mktMarketPrice;
        void this$mktMarketPrice;
        void other$mktSalePrice;
        void this$mktSalePrice;
        void other$mktMarkPrice;
        void this$mktMarkPrice;
        void other$mktBatchUnitCode;
        void this$mktBatchUnitCode;
        void other$mktBatchUnitName;
        void this$mktBatchUnitName;
        void other$mktBatchPrice;
        void this$mktBatchPrice;
        void other$mktPriceAreaMessage;
        void this$mktPriceAreaMessage;
        void other$manufacturer;
        void this$manufacturer;
        void other$erpOuterCode;
        void this$erpOuterCode;
        void other$displayName;
        void this$displayName;
        void other$productBarCodes;
        void this$productBarCodes;
        void other$barCode;
        void this$barCode;
        void other$volume;
        void this$volume;
        void other$netWeight;
        void this$netWeight;
        void other$weight;
        void this$weight;
        void other$width;
        void this$width;
        void other$height;
        void this$height;
        void other$length;
        void this$length;
        void other$productLineName_multiLang;
        void this$productLineName_multiLang;
        void other$productLineName;
        void this$productLineName;
        void other$productLineCode;
        void this$productLineCode;
        void other$placeOfOrigin;
        void this$placeOfOrigin;
        void other$platformCode;
        void this$platformCode;
        void other$brandName_multiLang;
        void this$brandName_multiLang;
        void other$brandName;
        void this$brandName;
        void other$brandCode;
        void this$brandCode;
        void other$costClassName_multiLang;
        void this$costClassName_multiLang;
        void other$costClassName;
        void this$costClassName;
        void other$costClassCode;
        void this$costClassCode;
        void other$purchaseClassName;
        void this$purchaseClassName;
        void other$purchaseClassCode;
        void this$purchaseClassCode;
        void other$manageClassName_multiLang;
        void this$manageClassName_multiLang;
        void other$manageClassName;
        void this$manageClassName;
        void other$manageClassCode;
        void this$manageClassCode;
        void other$manageClassPath;
        void this$manageClassPath;
        void other$model_multiLang;
        void this$model_multiLang;
        void other$model;
        void this$model;
        void other$modelDescription;
        void this$modelDescription;
        void other$unitConvertCoefficient;
        void this$unitConvertCoefficient;
        void other$productExtendCharacterDef;
        void this$productExtendCharacterDef;
        void other$productCharacterDef;
        void this$productCharacterDef;
        void other$productPropCharacterDefineMap;
        void this$productPropCharacterDefineMap;
        void other$productPropCharacterDefine;
        void this$productPropCharacterDefine;
        void other$unitName_multLang;
        void this$unitName_multLang;
        void other$unitName;
        void this$unitName;
        void other$unitCode;
        void this$unitCode;
        void other$mainUnitCount;
        void this$mainUnitCount;
        void other$unitErpCode;
        void this$unitErpCode;
        void other$transTypeName;
        void this$transTypeName;
        void other$transType;
        void this$transType;
        void other$code;
        void this$code;
        void other$shortName;
        void this$shortName;
        void other$name_multiLang;
        void this$name_multiLang;
        void other$name;
        void this$name;
        void other$tenantId;
        void this$tenantId;
        void other$orgIdName_multLang;
        void this$orgIdName_multLang;
        void other$orgIdName;
        void this$orgIdName;
        void other$orgIdCode;
        void this$orgIdCode;
        void other$orgType;
        void this$orgType;
        void other$orgId;
        void this$orgId;
        void other$createOrgId;
        void this$createOrgId;
        void other$balance;
        void this$balance;
        void other$effectiveLeadTime;
        void this$effectiveLeadTime;
        void other$reviewCycle;
        void this$reviewCycle;
        void other$measurementUnitPrecision;
        void this$measurementUnitPrecision;
        void other$measurementUnit;
        void this$measurementUnit;
        void other$amortizationMethod;
        void this$amortizationMethod;
        void other$turnoverMaterials;
        void this$turnoverMaterials;
        void other$mallGiftCardId;
        void this$mallGiftCardId;
        void other$mallEnableCyclePurchase;
        void this$mallEnableCyclePurchase;
        void other$mallSalePoints;
        void this$mallSalePoints;
        void other$mallEnableSubscribe;
        void this$mallEnableSubscribe;
        void other$mallDowncount;
        void this$mallDowncount;
        void other$mallUpcount;
        void this$mallUpcount;
        void other$mallEnableDeposit;
        void this$mallEnableDeposit;
        void other$mallDlyFeeRuleId;
        void this$mallDlyFeeRuleId;
        void other$mallIsAllArea;
        void this$mallIsAllArea;
        void other$mallCustomerServiceDay;
        void this$mallCustomerServiceDay;
        void other$mallDepositDealPayType;
        void this$mallDepositDealPayType;
        void other$mallIControlTime;
        void this$mallIControlTime;
        void other$mallOnlyOrder;
        void this$mallOnlyOrder;
        void other$returnInspectionCtrlPoint;
        void this$returnInspectionCtrlPoint;
        void other$sendInspectionCtrlPoint;
        void this$sendInspectionCtrlPoint;
        void other$firstInspectionCtrlMethod;
        void this$firstInspectionCtrlMethod;
        void other$productFirstInspection;
        void this$productFirstInspection;
        void other$transferInspectionCtrlPoint;
        void this$transferInspectionCtrlPoint;
        void other$transferInspection;
        void this$transferInspection;
        void other$outSourceInspectionCtrlPoint;
        void this$outSourceInspectionCtrlPoint;
        void other$outSourceInspection;
        void this$outSourceInspection;
        void other$productInspectionCtrlPoint;
        void this$productInspectionCtrlPoint;
        void other$productInspection;
        void this$productInspection;
        void other$isPriceChangeAllowed;
        void this$isPriceChangeAllowed;
        void other$isOfflineStoreReturn;
        void this$isOfflineStoreReturn;
        void other$isOfflineStoreOrder;
        void this$isOfflineStoreOrder;
        void other$allowStorePurchase;
        void this$allowStorePurchase;
        void other$inspectionControlPoint;
        void this$inspectionControlPoint;
        void other$overSigning;
        void this$overSigning;
        void other$optionalType;
        void this$optionalType;
        void other$checkByRevenueManagement;
        void this$checkByRevenueManagement;
        void other$atpInspection;
        void this$atpInspection;
        void other$iABCClass;
        void this$iABCClass;
        void other$iBaseSaleCount;
        void this$iBaseSaleCount;
        void other$returnInspection;
        void this$returnInspection;
        void other$sendInspection;
        void this$sendInspection;
        void other$billingUnit;
        void this$billingUnit;
        void other$checkByOutsourcing;
        void this$checkByOutsourcing;
        void other$checkByClient;
        void this$checkByClient;
        void other$checkBySalesOrders;
        void this$checkBySalesOrders;
        void other$checkByProject;
        void this$checkByProject;
        void other$projectTrackStrategy;
        void this$projectTrackStrategy;
        void other$fullSetInspection;
        void this$fullSetInspection;
        void other$strategyComparisonRule;
        void this$strategyComparisonRule;
        void other$mtoStrategy;
        void this$mtoStrategy;
        void other$creatorCustomer;
        void this$creatorCustomer;
        void other$couponType;
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductDTO)) {
            return false;
        }
        ProductDTO other = (ProductDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$shopId = this.getShopId();
        Long other$shopId = other.getShopId();
        if (this$shopId == null ? other$shopId != null : !((Object)this$shopId).equals(other$shopId)) {
            return false;
        }
        Long this$productApplyRangeId = this.getProductApplyRangeId();
        Long other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !((Object)this$productApplyRangeId).equals(other$productApplyRangeId)) {
            return false;
        }
        Long this$unitId = this.getUnitId();
        Long other$unitId = other.getUnitId();
        if (this$unitId == null ? other$unitId != null : !((Object)this$unitId).equals(other$unitId)) {
            return false;
        }
        Integer this$unitTruncationType = this.getUnitTruncationType();
        Integer other$unitTruncationType = other.getUnitTruncationType();
        if (this$unitTruncationType == null ? other$unitTruncationType != null : !((Object)this$unitTruncationType).equals(other$unitTruncationType)) {
            return false;
        }
        Integer this$unitExchangeType = this.getUnitExchangeType();
        Integer other$unitExchangeType = other.getUnitExchangeType();
        if (this$unitExchangeType == null ? other$unitExchangeType != null : !((Object)this$unitExchangeType).equals(other$unitExchangeType)) {
            return false;
        }
        Integer this$unitPrecision = this.getUnitPrecision();
        Integer other$unitPrecision = other.getUnitPrecision();
        if (this$unitPrecision == null ? other$unitPrecision != null : !((Object)this$unitPrecision).equals(other$unitPrecision)) {
            return false;
        }
        Integer this$unitUseType = this.getUnitUseType();
        Integer other$unitUseType = other.getUnitUseType();
        if (this$unitUseType == null ? other$unitUseType != null : !((Object)this$unitUseType).equals(other$unitUseType)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Long this$assistUnit = this.getAssistUnit();
        Long other$assistUnit = other.getAssistUnit();
        if (this$assistUnit == null ? other$assistUnit != null : !((Object)this$assistUnit).equals(other$assistUnit)) {
            return false;
        }
        Boolean this$enableAssistUnit = this.getEnableAssistUnit();
        Boolean other$enableAssistUnit = other.getEnableAssistUnit();
        if (this$enableAssistUnit == null ? other$enableAssistUnit != null : !((Object)this$enableAssistUnit).equals(other$enableAssistUnit)) {
            return false;
        }
        Integer this$singleInspection = this.getSingleInspection();
        Integer other$singleInspection = other.getSingleInspection();
        if (this$singleInspection == null ? other$singleInspection != null : !((Object)this$singleInspection).equals(other$singleInspection)) {
            return false;
        }
        Long this$manageClass = this.getManageClass();
        Long other$manageClass = other.getManageClass();
        if (this$manageClass == null ? other$manageClass != null : !((Object)this$manageClass).equals(other$manageClass)) {
            return false;
        }
        Long this$purchaseClass = this.getPurchaseClass();
        Long other$purchaseClass = other.getPurchaseClass();
        if (this$purchaseClass == null ? other$purchaseClass != null : !((Object)this$purchaseClass).equals(other$purchaseClass)) {
            return false;
        }
        Long this$costClass = this.getCostClass();
        Long other$costClass = other.getCostClass();
        if (this$costClass == null ? other$costClass != null : !((Object)this$costClass).equals(other$costClass)) {
            return false;
        }
        Long this$brand = this.getBrand();
        Long other$brand = other.getBrand();
        if (this$brand == null ? other$brand != null : !((Object)this$brand).equals(other$brand)) {
            return false;
        }
        Long this$productLine = this.getProductLine();
        Long other$productLine = other.getProductLine();
        if (this$productLine == null ? other$productLine != null : !((Object)this$productLine).equals(other$productLine)) {
            return false;
        }
        Long this$weightUnit = this.getWeightUnit();
        Long other$weightUnit = other.getWeightUnit();
        if (this$weightUnit == null ? other$weightUnit != null : !((Object)this$weightUnit).equals(other$weightUnit)) {
            return false;
        }
        Long this$netWeightUnit = this.getNetWeightUnit();
        Long other$netWeightUnit = other.getNetWeightUnit();
        if (this$netWeightUnit == null ? other$netWeightUnit != null : !((Object)this$netWeightUnit).equals(other$netWeightUnit)) {
            return false;
        }
        Long this$volumeUnit = this.getVolumeUnit();
        Long other$volumeUnit = other.getVolumeUnit();
        if (this$volumeUnit == null ? other$volumeUnit != null : !((Object)this$volumeUnit).equals(other$volumeUnit)) {
            return false;
        }
        Boolean this$mktDisplayPrice = this.getMktDisplayPrice();
        Boolean other$mktDisplayPrice = other.getMktDisplayPrice();
        if (this$mktDisplayPrice == null ? other$mktDisplayPrice != null : !((Object)this$mktDisplayPrice).equals(other$mktDisplayPrice)) {
            return false;
        }
        Long this$mktBatchPriceUnit = this.getMktBatchPriceUnit();
        Long other$mktBatchPriceUnit = other.getMktBatchPriceUnit();
        if (this$mktBatchPriceUnit == null ? other$mktBatchPriceUnit != null : !((Object)this$mktBatchPriceUnit).equals(other$mktBatchPriceUnit)) {
            return false;
        }
        Long this$mktBatchUnit = this.getMktBatchUnit();
        Long other$mktBatchUnit = other.getMktBatchUnit();
        if (this$mktBatchUnit == null ? other$mktBatchUnit != null : !((Object)this$mktBatchUnit).equals(other$mktBatchUnit)) {
            return false;
        }
        Long this$mktOnlineUnit = this.getMktOnlineUnit();
        Long other$mktOnlineUnit = other.getMktOnlineUnit();
        if (this$mktOnlineUnit == null ? other$mktOnlineUnit != null : !((Object)this$mktOnlineUnit).equals(other$mktOnlineUnit)) {
            return false;
        }
        Long this$mktOfflineUnit = this.getMktOfflineUnit();
        Long other$mktOfflineUnit = other.getMktOfflineUnit();
        if (this$mktOfflineUnit == null ? other$mktOfflineUnit != null : !((Object)this$mktOfflineUnit).equals(other$mktOfflineUnit)) {
            return false;
        }
        Long this$mktRequireUnit = this.getMktRequireUnit();
        Long other$mktRequireUnit = other.getMktRequireUnit();
        if (this$mktRequireUnit == null ? other$mktRequireUnit != null : !((Object)this$mktRequireUnit).equals(other$mktRequireUnit)) {
            return false;
        }
        Boolean this$mktStatus = this.getMktStatus();
        Boolean other$mktStatus = other.getMktStatus();
        if (this$mktStatus == null ? other$mktStatus != null : !((Object)this$mktStatus).equals(other$mktStatus)) {
            return false;
        }
        Boolean this$mktUOrderStatus = this.getMktUOrderStatus();
        Boolean other$mktUOrderStatus = other.getMktUOrderStatus();
        if (this$mktUOrderStatus == null ? other$mktUOrderStatus != null : !((Object)this$mktUOrderStatus).equals(other$mktUOrderStatus)) {
            return false;
        }
        Integer this$orderUpCount = this.getOrderUpCount();
        Integer other$orderUpCount = other.getOrderUpCount();
        if (this$orderUpCount == null ? other$orderUpCount != null : !((Object)this$orderUpCount).equals(other$orderUpCount)) {
            return false;
        }
        Integer this$orderDownCount = this.getOrderDownCount();
        Integer other$orderDownCount = other.getOrderDownCount();
        if (this$orderDownCount == null ? other$orderDownCount != null : !((Object)this$orderDownCount).equals(other$orderDownCount)) {
            return false;
        }
        Long this$upuPurchaseUnit = this.getUpuPurchaseUnit();
        Long other$upuPurchaseUnit = other.getUpuPurchaseUnit();
        if (this$upuPurchaseUnit == null ? other$upuPurchaseUnit != null : !((Object)this$upuPurchaseUnit).equals(other$upuPurchaseUnit)) {
            return false;
        }
        Integer this$upuPurchaseUnitPrecision = this.getUpuPurchaseUnitPrecision();
        Integer other$upuPurchaseUnitPrecision = other.getUpuPurchaseUnitPrecision();
        if (this$upuPurchaseUnitPrecision == null ? other$upuPurchaseUnitPrecision != null : !((Object)this$upuPurchaseUnitPrecision).equals(other$upuPurchaseUnitPrecision)) {
            return false;
        }
        Long this$upuPurchasePriceUnit = this.getUpuPurchasePriceUnit();
        Long other$upuPurchasePriceUnit = other.getUpuPurchasePriceUnit();
        if (this$upuPurchasePriceUnit == null ? other$upuPurchasePriceUnit != null : !((Object)this$upuPurchasePriceUnit).equals(other$upuPurchasePriceUnit)) {
            return false;
        }
        Boolean this$saleCanSale = this.getSaleCanSale();
        Boolean other$saleCanSale = other.getSaleCanSale();
        if (this$saleCanSale == null ? other$saleCanSale != null : !((Object)this$saleCanSale).equals(other$saleCanSale)) {
            return false;
        }
        Integer this$saleDeliveryDays = this.getSaleDeliveryDays();
        Integer other$saleDeliveryDays = other.getSaleDeliveryDays();
        if (this$saleDeliveryDays == null ? other$saleDeliveryDays != null : !((Object)this$saleDeliveryDays).equals(other$saleDeliveryDays)) {
            return false;
        }
        Long this$saleProductClass = this.getSaleProductClass();
        Long other$saleProductClass = other.getSaleProductClass();
        if (this$saleProductClass == null ? other$saleProductClass != null : !((Object)this$saleProductClass).equals(other$saleProductClass)) {
            return false;
        }
        Boolean this$stockBatchManage = this.getStockBatchManage();
        Boolean other$stockBatchManage = other.getStockBatchManage();
        if (this$stockBatchManage == null ? other$stockBatchManage != null : !((Object)this$stockBatchManage).equals(other$stockBatchManage)) {
            return false;
        }
        Boolean this$stockExpiryDateManage = this.getStockExpiryDateManage();
        Boolean other$stockExpiryDateManage = other.getStockExpiryDateManage();
        if (this$stockExpiryDateManage == null ? other$stockExpiryDateManage != null : !((Object)this$stockExpiryDateManage).equals(other$stockExpiryDateManage)) {
            return false;
        }
        Boolean this$stockSerialNoManage = this.getStockSerialNoManage();
        Boolean other$stockSerialNoManage = other.getStockSerialNoManage();
        if (this$stockSerialNoManage == null ? other$stockSerialNoManage != null : !((Object)this$stockSerialNoManage).equals(other$stockSerialNoManage)) {
            return false;
        }
        Boolean this$stockBarcodeManage = this.getStockBarcodeManage();
        Boolean other$stockBarcodeManage = other.getStockBarcodeManage();
        if (this$stockBarcodeManage == null ? other$stockBarcodeManage != null : !((Object)this$stockBarcodeManage).equals(other$stockBarcodeManage)) {
            return false;
        }
        Integer this$stockManageByInventory = this.getStockManageByInventory();
        Integer other$stockManageByInventory = other.getStockManageByInventory();
        if (this$stockManageByInventory == null ? other$stockManageByInventory != null : !((Object)this$stockManageByInventory).equals(other$stockManageByInventory)) {
            return false;
        }
        Long this$stockDeliveryWarehouse = this.getStockDeliveryWarehouse();
        Long other$stockDeliveryWarehouse = other.getStockDeliveryWarehouse();
        if (this$stockDeliveryWarehouse == null ? other$stockDeliveryWarehouse != null : !((Object)this$stockDeliveryWarehouse).equals(other$stockDeliveryWarehouse)) {
            return false;
        }
        Long this$stockReturnWarehouse = this.getStockReturnWarehouse();
        Long other$stockReturnWarehouse = other.getStockReturnWarehouse();
        if (this$stockReturnWarehouse == null ? other$stockReturnWarehouse != null : !((Object)this$stockReturnWarehouse).equals(other$stockReturnWarehouse)) {
            return false;
        }
        Long this$stockReceiptWarehouse = this.getStockReceiptWarehouse();
        Long other$stockReceiptWarehouse = other.getStockReceiptWarehouse();
        if (this$stockReceiptWarehouse == null ? other$stockReceiptWarehouse != null : !((Object)this$stockReceiptWarehouse).equals(other$stockReceiptWarehouse)) {
            return false;
        }
        Integer this$stockMaximumTurnoverDays = this.getStockMaximumTurnoverDays();
        Integer other$stockMaximumTurnoverDays = other.getStockMaximumTurnoverDays();
        if (this$stockMaximumTurnoverDays == null ? other$stockMaximumTurnoverDays != null : !((Object)this$stockMaximumTurnoverDays).equals(other$stockMaximumTurnoverDays)) {
            return false;
        }
        Long this$stockScanCountUnit = this.getStockScanCountUnit();
        Long other$stockScanCountUnit = other.getStockScanCountUnit();
        if (this$stockScanCountUnit == null ? other$stockScanCountUnit != null : !((Object)this$stockScanCountUnit).equals(other$stockScanCountUnit)) {
            return false;
        }
        Boolean this$stockReservation = this.getStockReservation();
        Boolean other$stockReservation = other.getStockReservation();
        if (this$stockReservation == null ? other$stockReservation != null : !((Object)this$stockReservation).equals(other$stockReservation)) {
            return false;
        }
        Boolean this$stockAllowNegativeInventory = this.getStockAllowNegativeInventory();
        Boolean other$stockAllowNegativeInventory = other.getStockAllowNegativeInventory();
        if (this$stockAllowNegativeInventory == null ? other$stockAllowNegativeInventory != null : !((Object)this$stockAllowNegativeInventory).equals(other$stockAllowNegativeInventory)) {
            return false;
        }
        Long this$stockStockUnit = this.getStockStockUnit();
        Long other$stockStockUnit = other.getStockStockUnit();
        if (this$stockStockUnit == null ? other$stockStockUnit != null : !((Object)this$stockStockUnit).equals(other$stockStockUnit)) {
            return false;
        }
        Long this$demandPlanningUnit = this.getDemandPlanningUnit();
        Long other$demandPlanningUnit = other.getDemandPlanningUnit();
        if (this$demandPlanningUnit == null ? other$demandPlanningUnit != null : !((Object)this$demandPlanningUnit).equals(other$demandPlanningUnit)) {
            return false;
        }
        Boolean this$inspectionType = this.getInspectionType();
        Boolean other$inspectionType = other.getInspectionType();
        if (this$inspectionType == null ? other$inspectionType != null : !((Object)this$inspectionType).equals(other$inspectionType)) {
            return false;
        }
        Integer this$testRule = this.getTestRule();
        Integer other$testRule = other.getTestRule();
        if (this$testRule == null ? other$testRule != null : !((Object)this$testRule).equals(other$testRule)) {
            return false;
        }
        Boolean this$inspectionReturnsWarehousingByResult = this.getInspectionReturnsWarehousingByResult();
        Boolean other$inspectionReturnsWarehousingByResult = other.getInspectionReturnsWarehousingByResult();
        if (this$inspectionReturnsWarehousingByResult == null ? other$inspectionReturnsWarehousingByResult != null : !((Object)this$inspectionReturnsWarehousingByResult).equals(other$inspectionReturnsWarehousingByResult)) {
            return false;
        }
        Integer this$planCheckDays = this.getPlanCheckDays();
        Integer other$planCheckDays = other.getPlanCheckDays();
        if (this$planCheckDays == null ? other$planCheckDays != null : !((Object)this$planCheckDays).equals(other$planCheckDays)) {
            return false;
        }
        Long this$inspectionUnit = this.getInspectionUnit();
        Long other$inspectionUnit = other.getInspectionUnit();
        if (this$inspectionUnit == null ? other$inspectionUnit != null : !((Object)this$inspectionUnit).equals(other$inspectionUnit)) {
            return false;
        }
        Integer this$edSupplyType = this.getEdSupplyType();
        Integer other$edSupplyType = other.getEdSupplyType();
        if (this$edSupplyType == null ? other$edSupplyType != null : !((Object)this$edSupplyType).equals(other$edSupplyType)) {
            return false;
        }
        Integer this$edProduceDepartment = this.getEdProduceDepartment();
        Integer other$edProduceDepartment = other.getEdProduceDepartment();
        if (this$edProduceDepartment == null ? other$edProduceDepartment != null : !((Object)this$edProduceDepartment).equals(other$edProduceDepartment)) {
            return false;
        }
        Boolean this$edBindCarrier = this.getEdBindCarrier();
        Boolean other$edBindCarrier = other.getEdBindCarrier();
        if (this$edBindCarrier == null ? other$edBindCarrier != null : !((Object)this$edBindCarrier).equals(other$edBindCarrier)) {
            return false;
        }
        Integer this$edPurpose = this.getEdPurpose();
        Integer other$edPurpose = other.getEdPurpose();
        if (this$edPurpose == null ? other$edPurpose != null : !((Object)this$edPurpose).equals(other$edPurpose)) {
            return false;
        }
        Double this$doubleReplenish = this.getDoubleReplenish();
        Double other$doubleReplenish = other.getDoubleReplenish();
        if (this$doubleReplenish == null ? other$doubleReplenish != null : !((Object)this$doubleReplenish).equals(other$doubleReplenish)) {
            return false;
        }
        Integer this$edFrontLeadTime = this.getEdFrontLeadTime();
        Integer other$edFrontLeadTime = other.getEdFrontLeadTime();
        if (this$edFrontLeadTime == null ? other$edFrontLeadTime != null : !((Object)this$edFrontLeadTime).equals(other$edFrontLeadTime)) {
            return false;
        }
        Integer this$edBehindLeadTime = this.getEdBehindLeadTime();
        Integer other$edBehindLeadTime = other.getEdBehindLeadTime();
        if (this$edBehindLeadTime == null ? other$edBehindLeadTime != null : !((Object)this$edBehindLeadTime).equals(other$edBehindLeadTime)) {
            return false;
        }
        Integer this$edFixedLeadTime = this.getEdFixedLeadTime();
        Integer other$edFixedLeadTime = other.getEdFixedLeadTime();
        if (this$edFixedLeadTime == null ? other$edFixedLeadTime != null : !((Object)this$edFixedLeadTime).equals(other$edFixedLeadTime)) {
            return false;
        }
        Integer this$edLossType = this.getEdLossType();
        Integer other$edLossType = other.getEdLossType();
        if (this$edLossType == null ? other$edLossType != null : !((Object)this$edLossType).equals(other$edLossType)) {
            return false;
        }
        Boolean this$edPrepareFeed = this.getEdPrepareFeed();
        Boolean other$edPrepareFeed = other.getEdPrepareFeed();
        if (this$edPrepareFeed == null ? other$edPrepareFeed != null : !((Object)this$edPrepareFeed).equals(other$edPrepareFeed)) {
            return false;
        }
        Boolean this$edWastageRate = this.getEdWastageRate();
        Boolean other$edWastageRate = other.getEdWastageRate();
        if (this$edWastageRate == null ? other$edWastageRate != null : !((Object)this$edWastageRate).equals(other$edWastageRate)) {
            return false;
        }
        Boolean this$edDirectProduction = this.getEdDirectProduction();
        Boolean other$edDirectProduction = other.getEdDirectProduction();
        if (this$edDirectProduction == null ? other$edDirectProduction != null : !((Object)this$edDirectProduction).equals(other$edDirectProduction)) {
            return false;
        }
        Boolean this$edSpecialMaterials = this.getEdSpecialMaterials();
        Boolean other$edSpecialMaterials = other.getEdSpecialMaterials();
        if (this$edSpecialMaterials == null ? other$edSpecialMaterials != null : !((Object)this$edSpecialMaterials).equals(other$edSpecialMaterials)) {
            return false;
        }
        Boolean this$edVirtualPart = this.getEdVirtualPart();
        Boolean other$edVirtualPart = other.getEdVirtualPart();
        if (this$edVirtualPart == null ? other$edVirtualPart != null : !((Object)this$edVirtualPart).equals(other$edVirtualPart)) {
            return false;
        }
        Integer this$edDemandConsolidation = this.getEdDemandConsolidation();
        Integer other$edDemandConsolidation = other.getEdDemandConsolidation();
        if (this$edDemandConsolidation == null ? other$edDemandConsolidation != null : !((Object)this$edDemandConsolidation).equals(other$edDemandConsolidation)) {
            return false;
        }
        Integer this$edDemandConsolidationType = this.getEdDemandConsolidationType();
        Integer other$edDemandConsolidationType = other.getEdDemandConsolidationType();
        if (this$edDemandConsolidationType == null ? other$edDemandConsolidationType != null : !((Object)this$edDemandConsolidationType).equals(other$edDemandConsolidationType)) {
            return false;
        }
        Integer this$edDemandConsolidationUnit = this.getEdDemandConsolidationUnit();
        Integer other$edDemandConsolidationUnit = other.getEdDemandConsolidationUnit();
        if (this$edDemandConsolidationUnit == null ? other$edDemandConsolidationUnit != null : !((Object)this$edDemandConsolidationUnit).equals(other$edDemandConsolidationUnit)) {
            return false;
        }
        Integer this$edDemandConsolidationNumber = this.getEdDemandConsolidationNumber();
        Integer other$edDemandConsolidationNumber = other.getEdDemandConsolidationNumber();
        if (this$edDemandConsolidationNumber == null ? other$edDemandConsolidationNumber != null : !((Object)this$edDemandConsolidationNumber).equals(other$edDemandConsolidationNumber)) {
            return false;
        }
        Integer this$edDemandConsolidationDateType = this.getEdDemandConsolidationDateType();
        Integer other$edDemandConsolidationDateType = other.getEdDemandConsolidationDateType();
        if (this$edDemandConsolidationDateType == null ? other$edDemandConsolidationDateType != null : !((Object)this$edDemandConsolidationDateType).equals(other$edDemandConsolidationDateType)) {
            return false;
        }
        Integer this$edResetForwardDays = this.getEdResetForwardDays();
        Integer other$edResetForwardDays = other.getEdResetForwardDays();
        if (this$edResetForwardDays == null ? other$edResetForwardDays != null : !((Object)this$edResetForwardDays).equals(other$edResetForwardDays)) {
            return false;
        }
        Integer this$edResetBackwardDays = this.getEdResetBackwardDays();
        Integer other$edResetBackwardDays = other.getEdResetBackwardDays();
        if (this$edResetBackwardDays == null ? other$edResetBackwardDays != null : !((Object)this$edResetBackwardDays).equals(other$edResetBackwardDays)) {
            return false;
        }
        Integer this$edBeyondSupplyDays = this.getEdBeyondSupplyDays();
        Integer other$edBeyondSupplyDays = other.getEdBeyondSupplyDays();
        if (this$edBeyondSupplyDays == null ? other$edBeyondSupplyDays != null : !((Object)this$edBeyondSupplyDays).equals(other$edBeyondSupplyDays)) {
            return false;
        }
        Boolean this$edLogisticsRelated = this.getEdLogisticsRelated();
        Boolean other$edLogisticsRelated = other.getEdLogisticsRelated();
        if (this$edLogisticsRelated == null ? other$edLogisticsRelated != null : !((Object)this$edLogisticsRelated).equals(other$edLogisticsRelated)) {
            return false;
        }
        Integer this$edWeighingMode = this.getEdWeighingMode();
        Integer other$edWeighingMode = other.getEdWeighingMode();
        if (this$edWeighingMode == null ? other$edWeighingMode != null : !((Object)this$edWeighingMode).equals(other$edWeighingMode)) {
            return false;
        }
        Boolean this$edFixedReturn = this.getEdFixedReturn();
        Boolean other$edFixedReturn = other.getEdFixedReturn();
        if (this$edFixedReturn == null ? other$edFixedReturn != null : !((Object)this$edFixedReturn).equals(other$edFixedReturn)) {
            return false;
        }
        Boolean this$edReviewGrossWeight = this.getEdReviewGrossWeight();
        Boolean other$edReviewGrossWeight = other.getEdReviewGrossWeight();
        if (this$edReviewGrossWeight == null ? other$edReviewGrossWeight != null : !((Object)this$edReviewGrossWeight).equals(other$edReviewGrossWeight)) {
            return false;
        }
        Boolean this$edSpecialCarTransport = this.getEdSpecialCarTransport();
        Boolean other$edSpecialCarTransport = other.getEdSpecialCarTransport();
        if (this$edSpecialCarTransport == null ? other$edSpecialCarTransport != null : !((Object)this$edSpecialCarTransport).equals(other$edSpecialCarTransport)) {
            return false;
        }
        Long this$edProduceUnit = this.getEdProduceUnit();
        Long other$edProduceUnit = other.getEdProduceUnit();
        if (this$edProduceUnit == null ? other$edProduceUnit != null : !((Object)this$edProduceUnit).equals(other$edProduceUnit)) {
            return false;
        }
        Long this$edPlanClass = this.getEdPlanClass();
        Long other$edPlanClass = other.getEdPlanClass();
        if (this$edPlanClass == null ? other$edPlanClass != null : !((Object)this$edPlanClass).equals(other$edPlanClass)) {
            return false;
        }
        Long this$fiCostClass = this.getFiCostClass();
        Long other$fiCostClass = other.getFiCostClass();
        if (this$fiCostClass == null ? other$fiCostClass != null : !((Object)this$fiCostClass).equals(other$fiCostClass)) {
            return false;
        }
        Integer this$fiValueManageType = this.getFiValueManageType();
        Integer other$fiValueManageType = other.getFiValueManageType();
        if (this$fiValueManageType == null ? other$fiValueManageType != null : !((Object)this$fiValueManageType).equals(other$fiValueManageType)) {
            return false;
        }
        Integer this$fiCostValuation = this.getFiCostValuation();
        Integer other$fiCostValuation = other.getFiCostValuation();
        if (this$fiCostValuation == null ? other$fiCostValuation != null : !((Object)this$fiCostValuation).equals(other$fiCostValuation)) {
            return false;
        }
        Boolean this$fiCheckByBatch = this.getFiCheckByBatch();
        Boolean other$fiCheckByBatch = other.getFiCheckByBatch();
        if (this$fiCheckByBatch == null ? other$fiCheckByBatch != null : !((Object)this$fiCheckByBatch).equals(other$fiCheckByBatch)) {
            return false;
        }
        Boolean this$accountingByItem = this.getAccountingByItem();
        Boolean other$accountingByItem = other.getAccountingByItem();
        if (this$accountingByItem == null ? other$accountingByItem != null : !((Object)this$accountingByItem).equals(other$accountingByItem)) {
            return false;
        }
        Integer this$checkFree = this.getCheckFree();
        Integer other$checkFree = other.getCheckFree();
        if (this$checkFree == null ? other$checkFree != null : !((Object)this$checkFree).equals(other$checkFree)) {
            return false;
        }
        Long this$fiPreferentialPolicyType = this.getFiPreferentialPolicyType();
        Long other$fiPreferentialPolicyType = other.getFiPreferentialPolicyType();
        if (this$fiPreferentialPolicyType == null ? other$fiPreferentialPolicyType != null : !((Object)this$fiPreferentialPolicyType).equals(other$fiPreferentialPolicyType)) {
            return false;
        }
        Integer this$creatorType = this.getCreatorType();
        Integer other$creatorType = other.getCreatorType();
        if (this$creatorType == null ? other$creatorType != null : !((Object)this$creatorType).equals(other$creatorType)) {
            return false;
        }
        Integer this$realProductAttributeTypeNew = this.getRealProductAttributeTypeNew();
        Integer other$realProductAttributeTypeNew = other.getRealProductAttributeTypeNew();
        if (this$realProductAttributeTypeNew == null ? other$realProductAttributeTypeNew != null : !((Object)this$realProductAttributeTypeNew).equals(other$realProductAttributeTypeNew)) {
            return false;
        }
        Integer this$virtualProductAttributeNew = this.getVirtualProductAttributeNew();
        Integer other$virtualProductAttributeNew = other.getVirtualProductAttributeNew();
        if (this$virtualProductAttributeNew == null ? other$virtualProductAttributeNew != null : !((Object)this$virtualProductAttributeNew).equals(other$virtualProductAttributeNew)) {
            return false;
        }
        Integer this$ptoPriceType = this.getPtoPriceType();
        Integer other$ptoPriceType = other.getPtoPriceType();
        if (this$ptoPriceType == null ? other$ptoPriceType != null : !((Object)this$ptoPriceType).equals(other$ptoPriceType)) {
            return false;
        }
        Long this$productTemplate = this.getProductTemplate();
        Long other$productTemplate = other.getProductTemplate();
        if (this$productTemplate == null ? other$productTemplate != null : !((Object)this$productTemplate).equals(other$productTemplate)) {
            return false;
        }
        Boolean this$productTemplateSkuDynamic = this.getProductTemplateSkuDynamic();
        Boolean other$productTemplateSkuDynamic = other.getProductTemplateSkuDynamic();
        if (this$productTemplateSkuDynamic == null ? other$productTemplateSkuDynamic != null : !((Object)this$productTemplateSkuDynamic).equals(other$productTemplateSkuDynamic)) {
            return false;
        }
        Boolean this$businessAttributePurchase = this.getBusinessAttributePurchase();
        Boolean other$businessAttributePurchase = other.getBusinessAttributePurchase();
        if (this$businessAttributePurchase == null ? other$businessAttributePurchase != null : !((Object)this$businessAttributePurchase).equals(other$businessAttributePurchase)) {
            return false;
        }
        Boolean this$businessAttributeSelfCreate = this.getBusinessAttributeSelfCreate();
        Boolean other$businessAttributeSelfCreate = other.getBusinessAttributeSelfCreate();
        if (this$businessAttributeSelfCreate == null ? other$businessAttributeSelfCreate != null : !((Object)this$businessAttributeSelfCreate).equals(other$businessAttributeSelfCreate)) {
            return false;
        }
        Boolean this$businessAttributeOutSourcing = this.getBusinessAttributeOutSourcing();
        Boolean other$businessAttributeOutSourcing = other.getBusinessAttributeOutSourcing();
        if (this$businessAttributeOutSourcing == null ? other$businessAttributeOutSourcing != null : !((Object)this$businessAttributeOutSourcing).equals(other$businessAttributeOutSourcing)) {
            return false;
        }
        Boolean this$businessAttributeSale = this.getBusinessAttributeSale();
        Boolean other$businessAttributeSale = other.getBusinessAttributeSale();
        if (this$businessAttributeSale == null ? other$businessAttributeSale != null : !((Object)this$businessAttributeSale).equals(other$businessAttributeSale)) {
            return false;
        }
        Boolean this$saleChannelOfOnlineBatch = this.getSaleChannelOfOnlineBatch();
        Boolean other$saleChannelOfOnlineBatch = other.getSaleChannelOfOnlineBatch();
        if (this$saleChannelOfOnlineBatch == null ? other$saleChannelOfOnlineBatch != null : !((Object)this$saleChannelOfOnlineBatch).equals(other$saleChannelOfOnlineBatch)) {
            return false;
        }
        Boolean this$saleChannelOfDistribution = this.getSaleChannelOfDistribution();
        Boolean other$saleChannelOfDistribution = other.getSaleChannelOfDistribution();
        if (this$saleChannelOfDistribution == null ? other$saleChannelOfDistribution != null : !((Object)this$saleChannelOfDistribution).equals(other$saleChannelOfDistribution)) {
            return false;
        }
        Integer this$enableSparePartsManagement = this.getEnableSparePartsManagement();
        Integer other$enableSparePartsManagement = other.getEnableSparePartsManagement();
        if (this$enableSparePartsManagement == null ? other$enableSparePartsManagement != null : !((Object)this$enableSparePartsManagement).equals(other$enableSparePartsManagement)) {
            return false;
        }
        Long this$productTagId = this.getProductTagId();
        Long other$productTagId = other.getProductTagId();
        if (this$productTagId == null ? other$productTagId != null : !((Object)this$productTagId).equals(other$productTagId)) {
            return false;
        }
        Boolean this$isWeight = this.getIsWeight();
        Boolean other$isWeight = other.getIsWeight();
        if (this$isWeight == null ? other$isWeight != null : !((Object)this$isWeight).equals(other$isWeight)) {
            return false;
        }
        Integer this$productFamily = this.getProductFamily();
        Integer other$productFamily = other.getProductFamily();
        if (this$productFamily == null ? other$productFamily != null : !((Object)this$productFamily).equals(other$productFamily)) {
            return false;
        }
        Integer this$salesAndOperations = this.getSalesAndOperations();
        Integer other$salesAndOperations = other.getSalesAndOperations();
        if (this$salesAndOperations == null ? other$salesAndOperations != null : !((Object)this$salesAndOperations).equals(other$salesAndOperations)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Long this$productVendor = this.getProductVendor();
        Long other$productVendor = other.getProductVendor();
        if (this$productVendor == null ? other$productVendor != null : !((Object)this$productVendor).equals(other$productVendor)) {
            return false;
        }
        Boolean this$medIsRegistrationManager = this.getMedIsRegistrationManager();
        Boolean other$medIsRegistrationManager = other.getMedIsRegistrationManager();
        if (this$medIsRegistrationManager == null ? other$medIsRegistrationManager != null : !((Object)this$medIsRegistrationManager).equals(other$medIsRegistrationManager)) {
            return false;
        }
        Boolean this$medIsAuthorizationManager = this.getMedIsAuthorizationManager();
        Boolean other$medIsAuthorizationManager = other.getMedIsAuthorizationManager();
        if (this$medIsAuthorizationManager == null ? other$medIsAuthorizationManager != null : !((Object)this$medIsAuthorizationManager).equals(other$medIsAuthorizationManager)) {
            return false;
        }
        Integer this$retailProcessType = this.getRetailProcessType();
        Integer other$retailProcessType = other.getRetailProcessType();
        if (this$retailProcessType == null ? other$retailProcessType != null : !((Object)this$retailProcessType).equals(other$retailProcessType)) {
            return false;
        }
        Integer this$retailPriceDimension = this.getRetailPriceDimension();
        Integer other$retailPriceDimension = other.getRetailPriceDimension();
        if (this$retailPriceDimension == null ? other$retailPriceDimension != null : !((Object)this$retailPriceDimension).equals(other$retailPriceDimension)) {
            return false;
        }
        Boolean this$material = this.getMaterial();
        Boolean other$material = other.getMaterial();
        if (this$material == null ? other$material != null : !((Object)this$material).equals(other$material)) {
            return false;
        }
        Boolean this$saleInOfflineStore = this.getSaleInOfflineStore();
        Boolean other$saleInOfflineStore = other.getSaleInOfflineStore();
        if (this$saleInOfflineStore == null ? other$saleInOfflineStore != null : !((Object)this$saleInOfflineStore).equals(other$saleInOfflineStore)) {
            return false;
        }
        Boolean this$offlineStoreOrder = this.getOfflineStoreOrder();
        Boolean other$offlineStoreOrder = other.getOfflineStoreOrder();
        if (this$offlineStoreOrder == null ? other$offlineStoreOrder != null : !((Object)this$offlineStoreOrder).equals(other$offlineStoreOrder)) {
            return false;
        }
        Integer this$isOptionalMaterial = this.getIsOptionalMaterial();
        Integer other$isOptionalMaterial = other.getIsOptionalMaterial();
        if (this$isOptionalMaterial == null ? other$isOptionalMaterial != null : !((Object)this$isOptionalMaterial).equals(other$isOptionalMaterial)) {
            return false;
        }
        Long this$defaultSKUId = this.getDefaultSKUId();
        Long other$defaultSKUId = other.getDefaultSKUId();
        if (this$defaultSKUId == null ? other$defaultSKUId != null : !((Object)this$defaultSKUId).equals(other$defaultSKUId)) {
            return false;
        }
        Long this$productDetailId = this.getProductDetailId();
        Long other$productDetailId = other.getProductDetailId();
        if (this$productDetailId == null ? other$productDetailId != null : !((Object)this$productDetailId).equals(other$productDetailId)) {
            return false;
        }
        Boolean this$recommendedMaterials = this.getRecommendedMaterials();
        Boolean other$recommendedMaterials = other.getRecommendedMaterials();
        if (this$recommendedMaterials == null ? other$recommendedMaterials != null : !((Object)this$recommendedMaterials).equals(other$recommendedMaterials)) {
            return false;
        }
        Boolean this$isProcess = this.getIsProcess();
        Boolean other$isProcess = other.getIsProcess();
        if (this$isProcess == null ? other$isProcess != null : !((Object)this$isProcess).equals(other$isProcess)) {
            return false;
        }
        Boolean this$process = this.getProcess();
        Boolean other$process = other.getProcess();
        if (this$process == null ? other$process != null : !((Object)this$process).equals(other$process)) {
            return false;
        }
        Boolean this$hasSpecs = this.getHasSpecs();
        Boolean other$hasSpecs = other.getHasSpecs();
        if (this$hasSpecs == null ? other$hasSpecs != null : !((Object)this$hasSpecs).equals(other$hasSpecs)) {
            return false;
        }
        Long this$couponId = this.getCouponId();
        Long other$couponId = other.getCouponId();
        if (this$couponId == null ? other$couponId != null : !((Object)this$couponId).equals(other$couponId)) {
            return false;
        }
        Integer this$platFormStatus = this.getPlatFormStatus();
        Integer other$platFormStatus = other.getPlatFormStatus();
        if (this$platFormStatus == null ? other$platFormStatus != null : !((Object)this$platFormStatus).equals(other$platFormStatus)) {
            return false;
        }
        Integer this$couponType = this.getCouponType();
        Integer n = other.getCouponType();
        if (this$couponType == null ? other$couponType != null : !((Object)this$couponType).equals(other$couponType)) {
            return false;
        }
        Long l = this.getCreatorCustomer();
        Long l2 = other.getCreatorCustomer();
        if (this$creatorCustomer == null ? other$creatorCustomer != null : !this$creatorCustomer.equals(other$creatorCustomer)) {
            return false;
        }
        Integer n2 = this.getMtoStrategy();
        Integer n3 = other.getMtoStrategy();
        if (this$mtoStrategy == null ? other$mtoStrategy != null : !this$mtoStrategy.equals(other$mtoStrategy)) {
            return false;
        }
        Integer n4 = this.getStrategyComparisonRule();
        Integer n5 = other.getStrategyComparisonRule();
        if (this$strategyComparisonRule == null ? other$strategyComparisonRule != null : !this$strategyComparisonRule.equals(other$strategyComparisonRule)) {
            return false;
        }
        Integer n6 = this.getFullSetInspection();
        Integer n7 = other.getFullSetInspection();
        if (this$fullSetInspection == null ? other$fullSetInspection != null : !this$fullSetInspection.equals(other$fullSetInspection)) {
            return false;
        }
        Integer n8 = this.getProjectTrackStrategy();
        Integer n9 = other.getProjectTrackStrategy();
        if (this$projectTrackStrategy == null ? other$projectTrackStrategy != null : !this$projectTrackStrategy.equals(other$projectTrackStrategy)) {
            return false;
        }
        Integer n10 = this.getCheckByProject();
        Integer n11 = other.getCheckByProject();
        if (this$checkByProject == null ? other$checkByProject != null : !this$checkByProject.equals(other$checkByProject)) {
            return false;
        }
        Integer n12 = this.getCheckBySalesOrders();
        Integer n13 = other.getCheckBySalesOrders();
        if (this$checkBySalesOrders == null ? other$checkBySalesOrders != null : !this$checkBySalesOrders.equals(other$checkBySalesOrders)) {
            return false;
        }
        Integer n14 = this.getCheckByClient();
        Integer n15 = other.getCheckByClient();
        if (this$checkByClient == null ? other$checkByClient != null : !this$checkByClient.equals(other$checkByClient)) {
            return false;
        }
        Integer n16 = this.getCheckByOutsourcing();
        Integer n17 = other.getCheckByOutsourcing();
        if (this$checkByOutsourcing == null ? other$checkByOutsourcing != null : !this$checkByOutsourcing.equals(other$checkByOutsourcing)) {
            return false;
        }
        Long l3 = this.getBillingUnit();
        Long l4 = other.getBillingUnit();
        if (this$billingUnit == null ? other$billingUnit != null : !this$billingUnit.equals(other$billingUnit)) {
            return false;
        }
        Integer n18 = this.getSendInspection();
        Integer n19 = other.getSendInspection();
        if (this$sendInspection == null ? other$sendInspection != null : !this$sendInspection.equals(other$sendInspection)) {
            return false;
        }
        Integer n20 = this.getReturnInspection();
        Integer n21 = other.getReturnInspection();
        if (this$returnInspection == null ? other$returnInspection != null : !this$returnInspection.equals(other$returnInspection)) {
            return false;
        }
        Integer n22 = this.getIBaseSaleCount();
        Integer n23 = other.getIBaseSaleCount();
        if (this$iBaseSaleCount == null ? other$iBaseSaleCount != null : !this$iBaseSaleCount.equals(other$iBaseSaleCount)) {
            return false;
        }
        Integer n24 = this.getIABCClass();
        Integer n25 = other.getIABCClass();
        if (this$iABCClass == null ? other$iABCClass != null : !this$iABCClass.equals(other$iABCClass)) {
            return false;
        }
        Integer n26 = this.getAtpInspection();
        Integer n27 = other.getAtpInspection();
        if (this$atpInspection == null ? other$atpInspection != null : !this$atpInspection.equals(other$atpInspection)) {
            return false;
        }
        Integer n28 = this.getCheckByRevenueManagement();
        Integer n29 = other.getCheckByRevenueManagement();
        if (this$checkByRevenueManagement == null ? other$checkByRevenueManagement != null : !this$checkByRevenueManagement.equals(other$checkByRevenueManagement)) {
            return false;
        }
        Integer n30 = this.getOptionalType();
        Integer n31 = other.getOptionalType();
        if (this$optionalType == null ? other$optionalType != null : !this$optionalType.equals(other$optionalType)) {
            return false;
        }
        Integer n32 = this.getOverSigning();
        Integer n33 = other.getOverSigning();
        if (this$overSigning == null ? other$overSigning != null : !this$overSigning.equals(other$overSigning)) {
            return false;
        }
        Integer n34 = this.getInspectionControlPoint();
        Integer n35 = other.getInspectionControlPoint();
        if (this$inspectionControlPoint == null ? other$inspectionControlPoint != null : !this$inspectionControlPoint.equals(other$inspectionControlPoint)) {
            return false;
        }
        Boolean bl = this.getAllowStorePurchase();
        Boolean bl2 = other.getAllowStorePurchase();
        if (this$allowStorePurchase == null ? other$allowStorePurchase != null : !this$allowStorePurchase.equals(other$allowStorePurchase)) {
            return false;
        }
        Boolean bl3 = this.getIsOfflineStoreOrder();
        Boolean bl4 = other.getIsOfflineStoreOrder();
        if (this$isOfflineStoreOrder == null ? other$isOfflineStoreOrder != null : !this$isOfflineStoreOrder.equals(other$isOfflineStoreOrder)) {
            return false;
        }
        Boolean bl5 = this.getIsOfflineStoreReturn();
        Boolean bl6 = other.getIsOfflineStoreReturn();
        if (this$isOfflineStoreReturn == null ? other$isOfflineStoreReturn != null : !this$isOfflineStoreReturn.equals(other$isOfflineStoreReturn)) {
            return false;
        }
        Boolean bl7 = this.getIsPriceChangeAllowed();
        Boolean bl8 = other.getIsPriceChangeAllowed();
        if (this$isPriceChangeAllowed == null ? other$isPriceChangeAllowed != null : !this$isPriceChangeAllowed.equals(other$isPriceChangeAllowed)) {
            return false;
        }
        Integer n36 = this.getProductInspection();
        Integer n37 = other.getProductInspection();
        if (this$productInspection == null ? other$productInspection != null : !this$productInspection.equals(other$productInspection)) {
            return false;
        }
        Integer n38 = this.getProductInspectionCtrlPoint();
        Integer n39 = other.getProductInspectionCtrlPoint();
        if (this$productInspectionCtrlPoint == null ? other$productInspectionCtrlPoint != null : !this$productInspectionCtrlPoint.equals(other$productInspectionCtrlPoint)) {
            return false;
        }
        Integer n40 = this.getOutSourceInspection();
        Integer n41 = other.getOutSourceInspection();
        if (this$outSourceInspection == null ? other$outSourceInspection != null : !this$outSourceInspection.equals(other$outSourceInspection)) {
            return false;
        }
        Integer n42 = this.getOutSourceInspectionCtrlPoint();
        Integer n43 = other.getOutSourceInspectionCtrlPoint();
        if (this$outSourceInspectionCtrlPoint == null ? other$outSourceInspectionCtrlPoint != null : !this$outSourceInspectionCtrlPoint.equals(other$outSourceInspectionCtrlPoint)) {
            return false;
        }
        Integer n44 = this.getTransferInspection();
        Integer n45 = other.getTransferInspection();
        if (this$transferInspection == null ? other$transferInspection != null : !this$transferInspection.equals(other$transferInspection)) {
            return false;
        }
        Integer n46 = this.getTransferInspectionCtrlPoint();
        Integer n47 = other.getTransferInspectionCtrlPoint();
        if (this$transferInspectionCtrlPoint == null ? other$transferInspectionCtrlPoint != null : !this$transferInspectionCtrlPoint.equals(other$transferInspectionCtrlPoint)) {
            return false;
        }
        Integer n48 = this.getProductFirstInspection();
        Integer n49 = other.getProductFirstInspection();
        if (this$productFirstInspection == null ? other$productFirstInspection != null : !this$productFirstInspection.equals(other$productFirstInspection)) {
            return false;
        }
        Integer n50 = this.getFirstInspectionCtrlMethod();
        Integer n51 = other.getFirstInspectionCtrlMethod();
        if (this$firstInspectionCtrlMethod == null ? other$firstInspectionCtrlMethod != null : !this$firstInspectionCtrlMethod.equals(other$firstInspectionCtrlMethod)) {
            return false;
        }
        Integer n52 = this.getSendInspectionCtrlPoint();
        Integer n53 = other.getSendInspectionCtrlPoint();
        if (this$sendInspectionCtrlPoint == null ? other$sendInspectionCtrlPoint != null : !this$sendInspectionCtrlPoint.equals(other$sendInspectionCtrlPoint)) {
            return false;
        }
        Integer n54 = this.getReturnInspectionCtrlPoint();
        Integer n55 = other.getReturnInspectionCtrlPoint();
        if (this$returnInspectionCtrlPoint == null ? other$returnInspectionCtrlPoint != null : !this$returnInspectionCtrlPoint.equals(other$returnInspectionCtrlPoint)) {
            return false;
        }
        Boolean bl9 = this.getMallOnlyOrder();
        Boolean bl10 = other.getMallOnlyOrder();
        if (this$mallOnlyOrder == null ? other$mallOnlyOrder != null : !this$mallOnlyOrder.equals(other$mallOnlyOrder)) {
            return false;
        }
        Boolean bl11 = this.getMallIControlTime();
        Boolean bl12 = other.getMallIControlTime();
        if (this$mallIControlTime == null ? other$mallIControlTime != null : !this$mallIControlTime.equals(other$mallIControlTime)) {
            return false;
        }
        Integer n56 = this.getMallDepositDealPayType();
        Integer n57 = other.getMallDepositDealPayType();
        if (this$mallDepositDealPayType == null ? other$mallDepositDealPayType != null : !this$mallDepositDealPayType.equals(other$mallDepositDealPayType)) {
            return false;
        }
        Integer n58 = this.getMallCustomerServiceDay();
        Integer n59 = other.getMallCustomerServiceDay();
        if (this$mallCustomerServiceDay == null ? other$mallCustomerServiceDay != null : !this$mallCustomerServiceDay.equals(other$mallCustomerServiceDay)) {
            return false;
        }
        Boolean bl13 = this.getMallIsAllArea();
        Boolean bl14 = other.getMallIsAllArea();
        if (this$mallIsAllArea == null ? other$mallIsAllArea != null : !this$mallIsAllArea.equals(other$mallIsAllArea)) {
            return false;
        }
        Long l5 = this.getMallDlyFeeRuleId();
        Long l6 = other.getMallDlyFeeRuleId();
        if (this$mallDlyFeeRuleId == null ? other$mallDlyFeeRuleId != null : !this$mallDlyFeeRuleId.equals(other$mallDlyFeeRuleId)) {
            return false;
        }
        Boolean bl15 = this.getMallEnableDeposit();
        Boolean bl16 = other.getMallEnableDeposit();
        if (this$mallEnableDeposit == null ? other$mallEnableDeposit != null : !this$mallEnableDeposit.equals(other$mallEnableDeposit)) {
            return false;
        }
        Integer n60 = this.getMallUpcount();
        Integer n61 = other.getMallUpcount();
        if (this$mallUpcount == null ? other$mallUpcount != null : !this$mallUpcount.equals(other$mallUpcount)) {
            return false;
        }
        Integer n62 = this.getMallDowncount();
        Integer n63 = other.getMallDowncount();
        if (this$mallDowncount == null ? other$mallDowncount != null : !this$mallDowncount.equals(other$mallDowncount)) {
            return false;
        }
        Boolean bl17 = this.getMallEnableSubscribe();
        Boolean bl18 = other.getMallEnableSubscribe();
        if (this$mallEnableSubscribe == null ? other$mallEnableSubscribe != null : !this$mallEnableSubscribe.equals(other$mallEnableSubscribe)) {
            return false;
        }
        Integer n64 = this.getMallSalePoints();
        Integer n65 = other.getMallSalePoints();
        if (this$mallSalePoints == null ? other$mallSalePoints != null : !this$mallSalePoints.equals(other$mallSalePoints)) {
            return false;
        }
        Boolean bl19 = this.getMallEnableCyclePurchase();
        Boolean bl20 = other.getMallEnableCyclePurchase();
        if (this$mallEnableCyclePurchase == null ? other$mallEnableCyclePurchase != null : !this$mallEnableCyclePurchase.equals(other$mallEnableCyclePurchase)) {
            return false;
        }
        Long l7 = this.getMallGiftCardId();
        Long l8 = other.getMallGiftCardId();
        if (this$mallGiftCardId == null ? other$mallGiftCardId != null : !this$mallGiftCardId.equals(other$mallGiftCardId)) {
            return false;
        }
        Integer n66 = this.getTurnoverMaterials();
        Integer n67 = other.getTurnoverMaterials();
        if (this$turnoverMaterials == null ? other$turnoverMaterials != null : !this$turnoverMaterials.equals(other$turnoverMaterials)) {
            return false;
        }
        Integer n68 = this.getAmortizationMethod();
        Integer n69 = other.getAmortizationMethod();
        if (this$amortizationMethod == null ? other$amortizationMethod != null : !this$amortizationMethod.equals(other$amortizationMethod)) {
            return false;
        }
        Long l9 = this.getMeasurementUnit();
        Long l10 = other.getMeasurementUnit();
        if (this$measurementUnit == null ? other$measurementUnit != null : !this$measurementUnit.equals(other$measurementUnit)) {
            return false;
        }
        Integer n70 = this.getMeasurementUnitPrecision();
        Integer n71 = other.getMeasurementUnitPrecision();
        if (this$measurementUnitPrecision == null ? other$measurementUnitPrecision != null : !this$measurementUnitPrecision.equals(other$measurementUnitPrecision)) {
            return false;
        }
        Integer n72 = this.getReviewCycle();
        Integer n73 = other.getReviewCycle();
        if (this$reviewCycle == null ? other$reviewCycle != null : !this$reviewCycle.equals(other$reviewCycle)) {
            return false;
        }
        Integer n74 = this.getEffectiveLeadTime();
        Integer n75 = other.getEffectiveLeadTime();
        if (this$effectiveLeadTime == null ? other$effectiveLeadTime != null : !this$effectiveLeadTime.equals(other$effectiveLeadTime)) {
            return false;
        }
        Integer n76 = this.getBalance();
        Integer n77 = other.getBalance();
        if (this$balance == null ? other$balance != null : !this$balance.equals(other$balance)) {
            return false;
        }
        String string = this.getCreateOrgId();
        String string2 = other.getCreateOrgId();
        if (this$createOrgId == null ? other$createOrgId != null : !this$createOrgId.equals(other$createOrgId)) {
            return false;
        }
        String string3 = this.getOrgId();
        String string4 = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String string5 = this.getOrgType();
        String string6 = other.getOrgType();
        if (this$orgType == null ? other$orgType != null : !this$orgType.equals(other$orgType)) {
            return false;
        }
        String string7 = this.getOrgIdCode();
        String string8 = other.getOrgIdCode();
        if (this$orgIdCode == null ? other$orgIdCode != null : !this$orgIdCode.equals(other$orgIdCode)) {
            return false;
        }
        String string9 = this.getOrgIdName();
        String string10 = other.getOrgIdName();
        if (this$orgIdName == null ? other$orgIdName != null : !this$orgIdName.equals(other$orgIdName)) {
            return false;
        }
        MultiLangText multiLangText = this.getOrgIdName_multLang();
        MultiLangText multiLangText2 = other.getOrgIdName_multLang();
        if (this$orgIdName_multLang == null ? other$orgIdName_multLang != null : !this$orgIdName_multLang.equals(other$orgIdName_multLang)) {
            return false;
        }
        String string11 = this.getTenantId();
        String string12 = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !this$tenantId.equals(other$tenantId)) {
            return false;
        }
        String string13 = this.getName();
        String string14 = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        MultiLangText multiLangText3 = this.getName_multiLang();
        MultiLangText multiLangText4 = other.getName_multiLang();
        if (this$name_multiLang == null ? other$name_multiLang != null : !this$name_multiLang.equals(other$name_multiLang)) {
            return false;
        }
        String string15 = this.getShortName();
        String string16 = other.getShortName();
        if (this$shortName == null ? other$shortName != null : !this$shortName.equals(other$shortName)) {
            return false;
        }
        String string17 = this.getCode();
        String string18 = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String string19 = this.getTransType();
        String string20 = other.getTransType();
        if (this$transType == null ? other$transType != null : !this$transType.equals(other$transType)) {
            return false;
        }
        String string21 = this.getTransTypeName();
        String string22 = other.getTransTypeName();
        if (this$transTypeName == null ? other$transTypeName != null : !this$transTypeName.equals(other$transTypeName)) {
            return false;
        }
        String string23 = this.getUnitErpCode();
        String string24 = other.getUnitErpCode();
        if (this$unitErpCode == null ? other$unitErpCode != null : !this$unitErpCode.equals(other$unitErpCode)) {
            return false;
        }
        BigDecimal bigDecimal = this.getMainUnitCount();
        BigDecimal bigDecimal2 = other.getMainUnitCount();
        if (this$mainUnitCount == null ? other$mainUnitCount != null : !this$mainUnitCount.equals(other$mainUnitCount)) {
            return false;
        }
        String string25 = this.getUnitCode();
        String string26 = other.getUnitCode();
        if (this$unitCode == null ? other$unitCode != null : !this$unitCode.equals(other$unitCode)) {
            return false;
        }
        String string27 = this.getUnitName();
        String string28 = other.getUnitName();
        if (this$unitName == null ? other$unitName != null : !this$unitName.equals(other$unitName)) {
            return false;
        }
        MultiLangText multiLangText5 = this.getUnitName_multLang();
        MultiLangText multiLangText6 = other.getUnitName_multLang();
        if (this$unitName_multLang == null ? other$unitName_multLang != null : !this$unitName_multLang.equals(other$unitName_multLang)) {
            return false;
        }
        String string29 = this.getProductPropCharacterDefine();
        String string30 = other.getProductPropCharacterDefine();
        if (this$productPropCharacterDefine == null ? other$productPropCharacterDefine != null : !this$productPropCharacterDefine.equals(other$productPropCharacterDefine)) {
            return false;
        }
        HashMap<String, Object> hashMap = this.getProductPropCharacterDefineMap();
        HashMap<String, Object> hashMap2 = other.getProductPropCharacterDefineMap();
        if (this$productPropCharacterDefineMap == null ? other$productPropCharacterDefineMap != null : !this$productPropCharacterDefineMap.equals(other$productPropCharacterDefineMap)) {
            return false;
        }
        HashMap<String, Object> hashMap3 = this.getProductCharacterDef();
        HashMap<String, Object> hashMap4 = other.getProductCharacterDef();
        if (this$productCharacterDef == null ? other$productCharacterDef != null : !this$productCharacterDef.equals(other$productCharacterDef)) {
            return false;
        }
        HashMap<String, Object> hashMap5 = this.getProductExtendCharacterDef();
        HashMap<String, Object> hashMap6 = other.getProductExtendCharacterDef();
        if (this$productExtendCharacterDef == null ? other$productExtendCharacterDef != null : !this$productExtendCharacterDef.equals(other$productExtendCharacterDef)) {
            return false;
        }
        BigDecimal bigDecimal3 = this.getUnitConvertCoefficient();
        BigDecimal bigDecimal4 = other.getUnitConvertCoefficient();
        if (this$unitConvertCoefficient == null ? other$unitConvertCoefficient != null : !this$unitConvertCoefficient.equals(other$unitConvertCoefficient)) {
            return false;
        }
        String string31 = this.getModelDescription();
        String string32 = other.getModelDescription();
        if (this$modelDescription == null ? other$modelDescription != null : !this$modelDescription.equals(other$modelDescription)) {
            return false;
        }
        String string33 = this.getModel();
        String string34 = other.getModel();
        if (this$model == null ? other$model != null : !this$model.equals(other$model)) {
            return false;
        }
        MultiLangText multiLangText7 = this.getModel_multiLang();
        MultiLangText multiLangText8 = other.getModel_multiLang();
        if (this$model_multiLang == null ? other$model_multiLang != null : !this$model_multiLang.equals(other$model_multiLang)) {
            return false;
        }
        String string35 = this.getManageClassPath();
        String string36 = other.getManageClassPath();
        if (this$manageClassPath == null ? other$manageClassPath != null : !this$manageClassPath.equals(other$manageClassPath)) {
            return false;
        }
        String string37 = this.getManageClassCode();
        String string38 = other.getManageClassCode();
        if (this$manageClassCode == null ? other$manageClassCode != null : !this$manageClassCode.equals(other$manageClassCode)) {
            return false;
        }
        String string39 = this.getManageClassName();
        String string40 = other.getManageClassName();
        if (this$manageClassName == null ? other$manageClassName != null : !this$manageClassName.equals(other$manageClassName)) {
            return false;
        }
        MultiLangText multiLangText9 = this.getManageClassName_multiLang();
        MultiLangText multiLangText10 = other.getManageClassName_multiLang();
        if (this$manageClassName_multiLang == null ? other$manageClassName_multiLang != null : !this$manageClassName_multiLang.equals(other$manageClassName_multiLang)) {
            return false;
        }
        String string41 = this.getPurchaseClassCode();
        String string42 = other.getPurchaseClassCode();
        if (this$purchaseClassCode == null ? other$purchaseClassCode != null : !this$purchaseClassCode.equals(other$purchaseClassCode)) {
            return false;
        }
        String string43 = this.getPurchaseClassName();
        String string44 = other.getPurchaseClassName();
        if (this$purchaseClassName == null ? other$purchaseClassName != null : !this$purchaseClassName.equals(other$purchaseClassName)) {
            return false;
        }
        String string45 = this.getCostClassCode();
        String string46 = other.getCostClassCode();
        if (this$costClassCode == null ? other$costClassCode != null : !this$costClassCode.equals(other$costClassCode)) {
            return false;
        }
        String string47 = this.getCostClassName();
        String string48 = other.getCostClassName();
        if (this$costClassName == null ? other$costClassName != null : !this$costClassName.equals(other$costClassName)) {
            return false;
        }
        MultiLangText multiLangText11 = this.getCostClassName_multiLang();
        MultiLangText multiLangText12 = other.getCostClassName_multiLang();
        if (this$costClassName_multiLang == null ? other$costClassName_multiLang != null : !this$costClassName_multiLang.equals(other$costClassName_multiLang)) {
            return false;
        }
        String string49 = this.getBrandCode();
        String string50 = other.getBrandCode();
        if (this$brandCode == null ? other$brandCode != null : !this$brandCode.equals(other$brandCode)) {
            return false;
        }
        String string51 = this.getBrandName();
        String string52 = other.getBrandName();
        if (this$brandName == null ? other$brandName != null : !this$brandName.equals(other$brandName)) {
            return false;
        }
        MultiLangText multiLangText13 = this.getBrandName_multiLang();
        MultiLangText multiLangText14 = other.getBrandName_multiLang();
        if (this$brandName_multiLang == null ? other$brandName_multiLang != null : !this$brandName_multiLang.equals(other$brandName_multiLang)) {
            return false;
        }
        String string53 = this.getPlatformCode();
        String string54 = other.getPlatformCode();
        if (this$platformCode == null ? other$platformCode != null : !this$platformCode.equals(other$platformCode)) {
            return false;
        }
        String string55 = this.getPlaceOfOrigin();
        String string56 = other.getPlaceOfOrigin();
        if (this$placeOfOrigin == null ? other$placeOfOrigin != null : !this$placeOfOrigin.equals(other$placeOfOrigin)) {
            return false;
        }
        String string57 = this.getProductLineCode();
        String string58 = other.getProductLineCode();
        if (this$productLineCode == null ? other$productLineCode != null : !this$productLineCode.equals(other$productLineCode)) {
            return false;
        }
        String string59 = this.getProductLineName();
        String string60 = other.getProductLineName();
        if (this$productLineName == null ? other$productLineName != null : !this$productLineName.equals(other$productLineName)) {
            return false;
        }
        MultiLangText multiLangText15 = this.getProductLineName_multiLang();
        MultiLangText multiLangText16 = other.getProductLineName_multiLang();
        if (this$productLineName_multiLang == null ? other$productLineName_multiLang != null : !this$productLineName_multiLang.equals(other$productLineName_multiLang)) {
            return false;
        }
        BigDecimal bigDecimal5 = this.getLength();
        BigDecimal bigDecimal6 = other.getLength();
        if (this$length == null ? other$length != null : !this$length.equals(other$length)) {
            return false;
        }
        BigDecimal bigDecimal7 = this.getHeight();
        BigDecimal bigDecimal8 = other.getHeight();
        if (this$height == null ? other$height != null : !this$height.equals(other$height)) {
            return false;
        }
        BigDecimal bigDecimal9 = this.getWidth();
        BigDecimal bigDecimal10 = other.getWidth();
        if (this$width == null ? other$width != null : !this$width.equals(other$width)) {
            return false;
        }
        BigDecimal bigDecimal11 = this.getWeight();
        BigDecimal bigDecimal12 = other.getWeight();
        if (this$weight == null ? other$weight != null : !this$weight.equals(other$weight)) {
            return false;
        }
        BigDecimal bigDecimal13 = this.getNetWeight();
        BigDecimal bigDecimal14 = other.getNetWeight();
        if (this$netWeight == null ? other$netWeight != null : !this$netWeight.equals(other$netWeight)) {
            return false;
        }
        BigDecimal bigDecimal15 = this.getVolume();
        BigDecimal bigDecimal16 = other.getVolume();
        if (this$volume == null ? other$volume != null : !this$volume.equals(other$volume)) {
            return false;
        }
        String string61 = this.getBarCode();
        String string62 = other.getBarCode();
        if (this$barCode == null ? other$barCode != null : !this$barCode.equals(other$barCode)) {
            return false;
        }
        List<String> list = this.getProductBarCodes();
        List<String> list2 = other.getProductBarCodes();
        if (this$productBarCodes == null ? other$productBarCodes != null : !this$productBarCodes.equals(other$productBarCodes)) {
            return false;
        }
        String string63 = this.getDisplayName();
        String string64 = other.getDisplayName();
        if (this$displayName == null ? other$displayName != null : !this$displayName.equals(other$displayName)) {
            return false;
        }
        String string65 = this.getErpOuterCode();
        String string66 = other.getErpOuterCode();
        if (this$erpOuterCode == null ? other$erpOuterCode != null : !this$erpOuterCode.equals(other$erpOuterCode)) {
            return false;
        }
        String string67 = this.getManufacturer();
        String string68 = other.getManufacturer();
        if (this$manufacturer == null ? other$manufacturer != null : !this$manufacturer.equals(other$manufacturer)) {
            return false;
        }
        String string69 = this.getMktPriceAreaMessage();
        String string70 = other.getMktPriceAreaMessage();
        if (this$mktPriceAreaMessage == null ? other$mktPriceAreaMessage != null : !this$mktPriceAreaMessage.equals(other$mktPriceAreaMessage)) {
            return false;
        }
        BigDecimal bigDecimal17 = this.getMktBatchPrice();
        BigDecimal bigDecimal18 = other.getMktBatchPrice();
        if (this$mktBatchPrice == null ? other$mktBatchPrice != null : !this$mktBatchPrice.equals(other$mktBatchPrice)) {
            return false;
        }
        String string71 = this.getMktBatchUnitName();
        String string72 = other.getMktBatchUnitName();
        if (this$mktBatchUnitName == null ? other$mktBatchUnitName != null : !this$mktBatchUnitName.equals(other$mktBatchUnitName)) {
            return false;
        }
        String string73 = this.getMktBatchUnitCode();
        String string74 = other.getMktBatchUnitCode();
        if (this$mktBatchUnitCode == null ? other$mktBatchUnitCode != null : !this$mktBatchUnitCode.equals(other$mktBatchUnitCode)) {
            return false;
        }
        BigDecimal bigDecimal19 = this.getMktMarkPrice();
        BigDecimal bigDecimal20 = other.getMktMarkPrice();
        if (this$mktMarkPrice == null ? other$mktMarkPrice != null : !this$mktMarkPrice.equals(other$mktMarkPrice)) {
            return false;
        }
        BigDecimal bigDecimal21 = this.getMktSalePrice();
        BigDecimal bigDecimal22 = other.getMktSalePrice();
        if (this$mktSalePrice == null ? other$mktSalePrice != null : !this$mktSalePrice.equals(other$mktSalePrice)) {
            return false;
        }
        BigDecimal bigDecimal23 = this.getMktMarketPrice();
        BigDecimal bigDecimal24 = other.getMktMarketPrice();
        if (this$mktMarketPrice == null ? other$mktMarketPrice != null : !this$mktMarketPrice.equals(other$mktMarketPrice)) {
            return false;
        }
        BigDecimal bigDecimal25 = this.getUpuMaxPrimeCosts();
        BigDecimal bigDecimal26 = other.getUpuMaxPrimeCosts();
        if (this$upuMaxPrimeCosts == null ? other$upuMaxPrimeCosts != null : !this$upuMaxPrimeCosts.equals(other$upuMaxPrimeCosts)) {
            return false;
        }
        BigDecimal bigDecimal27 = this.getUpuPrimeCosts();
        BigDecimal bigDecimal28 = other.getUpuPrimeCosts();
        if (this$upuPrimeCosts == null ? other$upuPrimeCosts != null : !this$upuPrimeCosts.equals(other$upuPrimeCosts)) {
            return false;
        }
        BigDecimal bigDecimal29 = this.getUpuRequestOrderLimit();
        BigDecimal bigDecimal30 = other.getUpuRequestOrderLimit();
        if (this$upuRequestOrderLimit == null ? other$upuRequestOrderLimit != null : !this$upuRequestOrderLimit.equals(other$upuRequestOrderLimit)) {
            return false;
        }
        BigDecimal bigDecimal31 = this.getUpuArrivalAllowErrorLimit();
        BigDecimal bigDecimal32 = other.getUpuArrivalAllowErrorLimit();
        if (this$upuArrivalAllowErrorLimit == null ? other$upuArrivalAllowErrorLimit != null : !this$upuArrivalAllowErrorLimit.equals(other$upuArrivalAllowErrorLimit)) {
            return false;
        }
        BigDecimal bigDecimal33 = this.getUpuInvoiceAllowErrorLimit();
        BigDecimal bigDecimal34 = other.getUpuInvoiceAllowErrorLimit();
        if (this$upuInvoiceAllowErrorLimit == null ? other$upuInvoiceAllowErrorLimit != null : !this$upuInvoiceAllowErrorLimit.equals(other$upuInvoiceAllowErrorLimit)) {
            return false;
        }
        String string75 = this.getUpuPurchaseUnitName();
        String string76 = other.getUpuPurchaseUnitName();
        if (this$upuPurchaseUnitName == null ? other$upuPurchaseUnitName != null : !this$upuPurchaseUnitName.equals(other$upuPurchaseUnitName)) {
            return false;
        }
        String string77 = this.getUpuPurchaseUnitCode();
        String string78 = other.getUpuPurchaseUnitCode();
        if (this$upuPurchaseUnitCode == null ? other$upuPurchaseUnitCode != null : !this$upuPurchaseUnitCode.equals(other$upuPurchaseUnitCode)) {
            return false;
        }
        String string79 = this.getUpuPurchasePriceUnitName();
        String string80 = other.getUpuPurchasePriceUnitName();
        if (this$upuPurchasePriceUnitName == null ? other$upuPurchasePriceUnitName != null : !this$upuPurchasePriceUnitName.equals(other$upuPurchasePriceUnitName)) {
            return false;
        }
        String string81 = this.getUpuPurchasePriceUnitCode();
        String string82 = other.getUpuPurchasePriceUnitCode();
        if (this$upuPurchasePriceUnitCode == null ? other$upuPurchasePriceUnitCode != null : !this$upuPurchasePriceUnitCode.equals(other$upuPurchasePriceUnitCode)) {
            return false;
        }
        BigDecimal bigDecimal35 = this.getUpuPurchaseTimes();
        BigDecimal bigDecimal36 = other.getUpuPurchaseTimes();
        if (this$upuPurchaseTimes == null ? other$upuPurchaseTimes != null : !this$upuPurchaseTimes.equals(other$upuPurchaseTimes)) {
            return false;
        }
        BigDecimal bigDecimal37 = this.getUpuPurchaseOrderQuantity();
        BigDecimal bigDecimal38 = other.getUpuPurchaseOrderQuantity();
        if (this$upuPurchaseOrderQuantity == null ? other$upuPurchaseOrderQuantity != null : !this$upuPurchaseOrderQuantity.equals(other$upuPurchaseOrderQuantity)) {
            return false;
        }
        BigDecimal bigDecimal39 = this.getSaleMinOrderQuantity();
        BigDecimal bigDecimal40 = other.getSaleMinOrderQuantity();
        if (this$saleMinOrderQuantity == null ? other$saleMinOrderQuantity != null : !this$saleMinOrderQuantity.equals(other$saleMinOrderQuantity)) {
            return false;
        }
        BigDecimal bigDecimal41 = this.getSaleDoubleSale();
        BigDecimal bigDecimal42 = other.getSaleDoubleSale();
        if (this$saleDoubleSale == null ? other$saleDoubleSale != null : !this$saleDoubleSale.equals(other$saleDoubleSale)) {
            return false;
        }
        String string83 = this.getSaleChannel();
        String string84 = other.getSaleChannel();
        if (this$saleChannel == null ? other$saleChannel != null : !this$saleChannel.equals(other$saleChannel)) {
            return false;
        }
        String string85 = this.getSaleProductClassCode();
        String string86 = other.getSaleProductClassCode();
        if (this$saleProductClassCode == null ? other$saleProductClassCode != null : !this$saleProductClassCode.equals(other$saleProductClassCode)) {
            return false;
        }
        String string87 = this.getSaleProductClassName();
        String string88 = other.getSaleProductClassName();
        if (this$saleProductClassName == null ? other$saleProductClassName != null : !this$saleProductClassName.equals(other$saleProductClassName)) {
            return false;
        }
        String string89 = this.getSaleProductClassPath();
        String string90 = other.getSaleProductClassPath();
        if (this$saleProductClassPath == null ? other$saleProductClassPath != null : !this$saleProductClassPath.equals(other$saleProductClassPath)) {
            return false;
        }
        String string91 = this.getStockOmsWarehouse();
        String string92 = other.getStockOmsWarehouse();
        if (this$stockOmsWarehouse == null ? other$stockOmsWarehouse != null : !this$stockOmsWarehouse.equals(other$stockOmsWarehouse)) {
            return false;
        }
        String string93 = this.getStockExpiryDateCalculationMethod();
        String string94 = other.getStockExpiryDateCalculationMethod();
        if (this$stockExpiryDateCalculationMethod == null ? other$stockExpiryDateCalculationMethod != null : !this$stockExpiryDateCalculationMethod.equals(other$stockExpiryDateCalculationMethod)) {
            return false;
        }
        String string95 = this.getStockExpireDateNo();
        String string96 = other.getStockExpireDateNo();
        if (this$stockExpireDateNo == null ? other$stockExpireDateNo != null : !this$stockExpireDateNo.equals(other$stockExpireDateNo)) {
            return false;
        }
        String string97 = this.getStockExpireDateUnit();
        String string98 = other.getStockExpireDateUnit();
        if (this$stockExpireDateUnit == null ? other$stockExpireDateUnit != null : !this$stockExpireDateUnit.equals(other$stockExpireDateUnit)) {
            return false;
        }
        String string99 = this.getStockDaysBeforeValidityReject();
        String string100 = other.getStockDaysBeforeValidityReject();
        if (this$stockDaysBeforeValidityReject == null ? other$stockDaysBeforeValidityReject != null : !this$stockDaysBeforeValidityReject.equals(other$stockDaysBeforeValidityReject)) {
            return false;
        }
        String string101 = this.getStockValidityWarningDays();
        String string102 = other.getStockValidityWarningDays();
        if (this$stockValidityWarningDays == null ? other$stockValidityWarningDays != null : !this$stockValidityWarningDays.equals(other$stockValidityWarningDays)) {
            return false;
        }
        BigDecimal bigDecimal43 = this.getStockSafetyStock();
        BigDecimal bigDecimal44 = other.getStockSafetyStock();
        if (this$stockSafetyStock == null ? other$stockSafetyStock != null : !this$stockSafetyStock.equals(other$stockSafetyStock)) {
            return false;
        }
        BigDecimal bigDecimal45 = this.getStockHighestStock();
        BigDecimal bigDecimal46 = other.getStockHighestStock();
        if (this$stockHighestStock == null ? other$stockHighestStock != null : !this$stockHighestStock.equals(other$stockHighestStock)) {
            return false;
        }
        BigDecimal bigDecimal47 = this.getStockLowestStock();
        BigDecimal bigDecimal48 = other.getStockLowestStock();
        if (this$stockLowestStock == null ? other$stockLowestStock != null : !this$stockLowestStock.equals(other$stockLowestStock)) {
            return false;
        }
        BigDecimal bigDecimal49 = this.getStockRopStock();
        BigDecimal bigDecimal50 = other.getStockRopStock();
        if (this$stockRopStock == null ? other$stockRopStock != null : !this$stockRopStock.equals(other$stockRopStock)) {
            return false;
        }
        String string103 = this.getStockDeliveryWarehouseName();
        String string104 = other.getStockDeliveryWarehouseName();
        if (this$stockDeliveryWarehouseName == null ? other$stockDeliveryWarehouseName != null : !this$stockDeliveryWarehouseName.equals(other$stockDeliveryWarehouseName)) {
            return false;
        }
        String string105 = this.getStockReturnWarehouseName();
        String string106 = other.getStockReturnWarehouseName();
        if (this$stockReturnWarehouseName == null ? other$stockReturnWarehouseName != null : !this$stockReturnWarehouseName.equals(other$stockReturnWarehouseName)) {
            return false;
        }
        String string107 = this.getStockReceiptWarehouseName();
        String string108 = other.getStockReceiptWarehouseName();
        if (this$stockReceiptWarehouseName == null ? other$stockReceiptWarehouseName != null : !this$stockReceiptWarehouseName.equals(other$stockReceiptWarehouseName)) {
            return false;
        }
        BigDecimal bigDecimal51 = this.getStockInStoreExcessLimit();
        BigDecimal bigDecimal52 = other.getStockInStoreExcessLimit();
        if (this$stockInStoreExcessLimit == null ? other$stockInStoreExcessLimit != null : !this$stockInStoreExcessLimit.equals(other$stockInStoreExcessLimit)) {
            return false;
        }
        BigDecimal bigDecimal53 = this.getStockOutStoreExcessLimit();
        BigDecimal bigDecimal54 = other.getStockOutStoreExcessLimit();
        if (this$stockOutStoreExcessLimit == null ? other$stockOutStoreExcessLimit != null : !this$stockOutStoreExcessLimit.equals(other$stockOutStoreExcessLimit)) {
            return false;
        }
        BigDecimal bigDecimal55 = this.getStockInStoreLessLimit();
        BigDecimal bigDecimal56 = other.getStockInStoreLessLimit();
        if (this$stockInStoreLessLimit == null ? other$stockInStoreLessLimit != null : !this$stockInStoreLessLimit.equals(other$stockInStoreLessLimit)) {
            return false;
        }
        BigDecimal bigDecimal57 = this.getStockOutStoreLessLimit();
        BigDecimal bigDecimal58 = other.getStockOutStoreLessLimit();
        if (this$stockOutStoreLessLimit == null ? other$stockOutStoreLessLimit != null : !this$stockOutStoreLessLimit.equals(other$stockOutStoreLessLimit)) {
            return false;
        }
        BigDecimal bigDecimal59 = this.getStockStorageLossRate();
        BigDecimal bigDecimal60 = other.getStockStorageLossRate();
        if (this$stockStorageLossRate == null ? other$stockStorageLossRate != null : !this$stockStorageLossRate.equals(other$stockStorageLossRate)) {
            return false;
        }
        String string109 = this.getStockStockUnitCode();
        String string110 = other.getStockStockUnitCode();
        if (this$stockStockUnitCode == null ? other$stockStockUnitCode != null : !this$stockStockUnitCode.equals(other$stockStockUnitCode)) {
            return false;
        }
        String string111 = this.getStockStockUnitName();
        String string112 = other.getStockStockUnitName();
        if (this$stockStockUnitName == null ? other$stockStockUnitName != null : !this$stockStockUnitName.equals(other$stockStockUnitName)) {
            return false;
        }
        String string113 = this.getDemandPlanningUnitCode();
        String string114 = other.getDemandPlanningUnitCode();
        if (this$demandPlanningUnitCode == null ? other$demandPlanningUnitCode != null : !this$demandPlanningUnitCode.equals(other$demandPlanningUnitCode)) {
            return false;
        }
        String string115 = this.getDemandPlanningUnitName();
        String string116 = other.getDemandPlanningUnitName();
        if (this$demandPlanningUnitName == null ? other$demandPlanningUnitName != null : !this$demandPlanningUnitName.equals(other$demandPlanningUnitName)) {
            return false;
        }
        String string117 = this.getEdProduceDepartmentNew();
        String string118 = other.getEdProduceDepartmentNew();
        if (this$edProduceDepartmentNew == null ? other$edProduceDepartmentNew != null : !this$edProduceDepartmentNew.equals(other$edProduceDepartmentNew)) {
            return false;
        }
        String string119 = this.getEdWeigh();
        String string120 = other.getEdWeigh();
        if (this$edWeigh == null ? other$edWeigh != null : !this$edWeigh.equals(other$edWeigh)) {
            return false;
        }
        String string121 = this.getEdEngineeringDrawingNo();
        String string122 = other.getEdEngineeringDrawingNo();
        if (this$edEngineeringDrawingNo == null ? other$edEngineeringDrawingNo != null : !this$edEngineeringDrawingNo.equals(other$edEngineeringDrawingNo)) {
            return false;
        }
        String string123 = this.getEdECNControl();
        String string124 = other.getEdECNControl();
        if (this$edECNControl == null ? other$edECNControl != null : !this$edECNControl.equals(other$edECNControl)) {
            return false;
        }
        String string125 = this.getEdPlanDefaultAttribute();
        String string126 = other.getEdPlanDefaultAttribute();
        if (this$edPlanDefaultAttribute == null ? other$edPlanDefaultAttribute != null : !this$edPlanDefaultAttribute.equals(other$edPlanDefaultAttribute)) {
            return false;
        }
        String string127 = this.getEdPlanMethod();
        String string128 = other.getEdPlanMethod();
        if (this$edPlanMethod == null ? other$edPlanMethod != null : !this$edPlanMethod.equals(other$edPlanMethod)) {
            return false;
        }
        String string129 = this.getEdManufacturePlanner();
        String string130 = other.getEdManufacturePlanner();
        if (this$edManufacturePlanner == null ? other$edManufacturePlanner != null : !this$edManufacturePlanner.equals(other$edManufacturePlanner)) {
            return false;
        }
        BigDecimal bigDecimal61 = this.getEdPlanProduceLimit();
        BigDecimal bigDecimal62 = other.getEdPlanProduceLimit();
        if (this$edPlanProduceLimit == null ? other$edPlanProduceLimit != null : !this$edPlanProduceLimit.equals(other$edPlanProduceLimit)) {
            return false;
        }
        String string131 = this.getEdKeySubPart();
        String string132 = other.getEdKeySubPart();
        if (this$edKeySubPart == null ? other$edKeySubPart != null : !this$edKeySubPart.equals(other$edKeySubPart)) {
            return false;
        }
        String string133 = this.getEdBOMType();
        String string134 = other.getEdBOMType();
        if (this$edBOMType == null ? other$edBOMType != null : !this$edBOMType.equals(other$edBOMType)) {
            return false;
        }
        String string135 = this.getEdBOMSource();
        String string136 = other.getEdBOMSource();
        if (this$edBOMSource == null ? other$edBOMSource != null : !this$edBOMSource.equals(other$edBOMSource)) {
            return false;
        }
        String string137 = this.getEdBatchRule();
        String string138 = other.getEdBatchRule();
        if (this$edBatchRule == null ? other$edBatchRule != null : !this$edBatchRule.equals(other$edBatchRule)) {
            return false;
        }
        BigDecimal bigDecimal63 = this.getEdEconomicQuantity();
        BigDecimal bigDecimal64 = other.getEdEconomicQuantity();
        if (this$edEconomicQuantity == null ? other$edEconomicQuantity != null : !this$edEconomicQuantity.equals(other$edEconomicQuantity)) {
            return false;
        }
        BigDecimal bigDecimal65 = this.getEdFixedQuantity();
        BigDecimal bigDecimal66 = other.getEdFixedQuantity();
        if (this$edFixedQuantity == null ? other$edFixedQuantity != null : !this$edFixedQuantity.equals(other$edFixedQuantity)) {
            return false;
        }
        BigDecimal bigDecimal67 = this.getEdBatchDouble();
        BigDecimal bigDecimal68 = other.getEdBatchDouble();
        if (this$edBatchDouble == null ? other$edBatchDouble != null : !this$edBatchDouble.equals(other$edBatchDouble)) {
            return false;
        }
        BigDecimal bigDecimal69 = this.getEdLeadTimeCoefficient();
        BigDecimal bigDecimal70 = other.getEdLeadTimeCoefficient();
        if (this$edLeadTimeCoefficient == null ? other$edLeadTimeCoefficient != null : !this$edLeadTimeCoefficient.equals(other$edLeadTimeCoefficient)) {
            return false;
        }
        BigDecimal bigDecimal71 = this.getEdLeadTimeQuantity();
        BigDecimal bigDecimal72 = other.getEdLeadTimeQuantity();
        if (this$edLeadTimeQuantity == null ? other$edLeadTimeQuantity != null : !this$edLeadTimeQuantity.equals(other$edLeadTimeQuantity)) {
            return false;
        }
        String string139 = this.getEdFixedWastage();
        String string140 = other.getEdFixedWastage();
        if (this$edFixedWastage == null ? other$edFixedWastage != null : !this$edFixedWastage.equals(other$edFixedWastage)) {
            return false;
        }
        BigDecimal bigDecimal73 = this.getEdRejectRate();
        BigDecimal bigDecimal74 = other.getEdRejectRate();
        if (this$edRejectRate == null ? other$edRejectRate != null : !this$edRejectRate.equals(other$edRejectRate)) {
            return false;
        }
        BigDecimal bigDecimal75 = this.getWastageRate();
        BigDecimal bigDecimal76 = other.getWastageRate();
        if (this$wastageRate == null ? other$wastageRate != null : !this$wastageRate.equals(other$wastageRate)) {
            return false;
        }
        String string141 = this.getEdProduceUnitCode();
        String string142 = other.getEdProduceUnitCode();
        if (this$edProduceUnitCode == null ? other$edProduceUnitCode != null : !this$edProduceUnitCode.equals(other$edProduceUnitCode)) {
            return false;
        }
        String string143 = this.getEdProduceUnitName();
        String string144 = other.getEdProduceUnitName();
        if (this$edProduceUnitName == null ? other$edProduceUnitName != null : !this$edProduceUnitName.equals(other$edProduceUnitName)) {
            return false;
        }
        String string145 = this.getEdProduceUnitPercision();
        String string146 = other.getEdProduceUnitPercision();
        if (this$edProduceUnitPercision == null ? other$edProduceUnitPercision != null : !this$edProduceUnitPercision.equals(other$edProduceUnitPercision)) {
            return false;
        }
        String string147 = this.getEdPlanClassName();
        String string148 = other.getEdPlanClassName();
        if (this$edPlanClassName == null ? other$edPlanClassName != null : !this$edPlanClassName.equals(other$edPlanClassName)) {
            return false;
        }
        BigDecimal bigDecimal77 = this.getFiNoTaxCostPrice();
        BigDecimal bigDecimal78 = other.getFiNoTaxCostPrice();
        if (this$fiNoTaxCostPrice == null ? other$fiNoTaxCostPrice != null : !this$fiNoTaxCostPrice.equals(other$fiNoTaxCostPrice)) {
            return false;
        }
        String string149 = this.getTaxClass();
        String string150 = other.getTaxClass();
        if (this$taxClass == null ? other$taxClass != null : !this$taxClass.equals(other$taxClass)) {
            return false;
        }
        String string151 = this.getTaxClassCode();
        String string152 = other.getTaxClassCode();
        if (this$taxClassCode == null ? other$taxClassCode != null : !this$taxClassCode.equals(other$taxClassCode)) {
            return false;
        }
        String string153 = this.getTaxClassName();
        String string154 = other.getTaxClassName();
        if (this$taxClassName == null ? other$taxClassName != null : !this$taxClassName.equals(other$taxClassName)) {
            return false;
        }
        String string155 = this.getTaxClassSimpleName();
        String string156 = other.getTaxClassSimpleName();
        if (this$taxClassSimpleName == null ? other$taxClassSimpleName != null : !this$taxClassSimpleName.equals(other$taxClassSimpleName)) {
            return false;
        }
        String string157 = this.getFiReceiptName();
        String string158 = other.getFiReceiptName();
        if (this$fiReceiptName == null ? other$fiReceiptName != null : !this$fiReceiptName.equals(other$fiReceiptName)) {
            return false;
        }
        String string159 = this.getFiInTaxrate();
        String string160 = other.getFiInTaxrate();
        if (this$fiInTaxrate == null ? other$fiInTaxrate != null : !this$fiInTaxrate.equals(other$fiInTaxrate)) {
            return false;
        }
        String string161 = this.getNoTaxation();
        String string162 = other.getNoTaxation();
        if (this$noTaxation == null ? other$noTaxation != null : !this$noTaxation.equals(other$noTaxation)) {
            return false;
        }
        String string163 = this.getFiOutTaxrate();
        String string164 = other.getFiOutTaxrate();
        if (this$fiOutTaxrate == null ? other$fiOutTaxrate != null : !this$fiOutTaxrate.equals(other$fiOutTaxrate)) {
            return false;
        }
        String string165 = this.getFiPreferentialPolicyTypeName();
        String string166 = other.getFiPreferentialPolicyTypeName();
        if (this$fiPreferentialPolicyTypeName == null ? other$fiPreferentialPolicyTypeName != null : !this$fiPreferentialPolicyTypeName.equals(other$fiPreferentialPolicyTypeName)) {
            return false;
        }
        String string167 = this.getReceiptSpec();
        String string168 = other.getReceiptSpec();
        if (this$receiptSpec == null ? other$receiptSpec != null : !this$receiptSpec.equals(other$receiptSpec)) {
            return false;
        }
        String string169 = this.getReceiptModel();
        String string170 = other.getReceiptModel();
        if (this$receiptModel == null ? other$receiptModel != null : !this$receiptModel.equals(other$receiptModel)) {
            return false;
        }
        String string171 = this.getRealProductAttribute();
        String string172 = other.getRealProductAttribute();
        if (this$realProductAttribute == null ? other$realProductAttribute != null : !this$realProductAttribute.equals(other$realProductAttribute)) {
            return false;
        }
        String string173 = this.getRealProductAttributeType();
        String string174 = other.getRealProductAttributeType();
        if (this$realProductAttributeType == null ? other$realProductAttributeType != null : !this$realProductAttributeType.equals(other$realProductAttributeType)) {
            return false;
        }
        String string175 = this.getVirtualProductAttribute();
        String string176 = other.getVirtualProductAttribute();
        if (this$virtualProductAttribute == null ? other$virtualProductAttribute != null : !this$virtualProductAttribute.equals(other$virtualProductAttribute)) {
            return false;
        }
        String string177 = this.getBusinessAttribute();
        String string178 = other.getBusinessAttribute();
        if (this$businessAttribute == null ? other$businessAttribute != null : !this$businessAttribute.equals(other$businessAttribute)) {
            return false;
        }
        String string179 = this.getProductTemplateName();
        String string180 = other.getProductTemplateName();
        if (this$productTemplateName == null ? other$productTemplateName != null : !this$productTemplateName.equals(other$productTemplateName)) {
            return false;
        }
        String string181 = this.getDepositPayType();
        String string182 = other.getDepositPayType();
        if (this$depositPayType == null ? other$depositPayType != null : !this$depositPayType.equals(other$depositPayType)) {
            return false;
        }
        String string183 = this.getMinimumDeposits();
        String string184 = other.getMinimumDeposits();
        if (this$minimumDeposits == null ? other$minimumDeposits != null : !this$minimumDeposits.equals(other$minimumDeposits)) {
            return false;
        }
        String string185 = this.getErpCode();
        String string186 = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String string187 = this.getMnemonicCode();
        String string188 = other.getMnemonicCode();
        if (this$mnemonicCode == null ? other$mnemonicCode != null : !this$mnemonicCode.equals(other$mnemonicCode)) {
            return false;
        }
        String string189 = this.getProductVendorName();
        String string190 = other.getProductVendorName();
        if (this$productVendorName == null ? other$productVendorName != null : !this$productVendorName.equals(other$productVendorName)) {
            return false;
        }
        String string191 = this.getProductBuyer();
        String string192 = other.getProductBuyer();
        if (this$productBuyer == null ? other$productBuyer != null : !this$productBuyer.equals(other$productBuyer)) {
            return false;
        }
        String string193 = this.getProductBuyerName();
        String string194 = other.getProductBuyerName();
        if (this$productBuyerName == null ? other$productBuyerName != null : !this$productBuyerName.equals(other$productBuyerName)) {
            return false;
        }
        String string195 = this.getWarehouseManager();
        String string196 = other.getWarehouseManager();
        if (this$warehouseManager == null ? other$warehouseManager != null : !this$warehouseManager.equals(other$warehouseManager)) {
            return false;
        }
        String string197 = this.getWarehouseManagerName();
        String string198 = other.getWarehouseManagerName();
        if (this$warehouseManagerName == null ? other$warehouseManagerName != null : !this$warehouseManagerName.equals(other$warehouseManagerName)) {
            return false;
        }
        String string199 = this.getDescription();
        String string200 = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        String string201 = this.getMobileDescription();
        String string202 = other.getMobileDescription();
        if (this$mobileDescription == null ? other$mobileDescription != null : !this$mobileDescription.equals(other$mobileDescription)) {
            return false;
        }
        String string203 = this.getMedSunshinePurchaseNo();
        String string204 = other.getMedSunshinePurchaseNo();
        if (this$medSunshinePurchaseNo == null ? other$medSunshinePurchaseNo != null : !this$medSunshinePurchaseNo.equals(other$medSunshinePurchaseNo)) {
            return false;
        }
        String string205 = this.getMedRegistrationNo();
        String string206 = other.getMedRegistrationNo();
        if (this$medRegistrationNo == null ? other$medRegistrationNo != null : !this$medRegistrationNo.equals(other$medRegistrationNo)) {
            return false;
        }
        String string207 = this.getUrl();
        String string208 = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) {
            return false;
        }
        String string209 = this.getTitleMemo();
        String string210 = other.getTitleMemo();
        if (this$titleMemo == null ? other$titleMemo != null : !this$titleMemo.equals(other$titleMemo)) {
            return false;
        }
        BigDecimal bigDecimal79 = this.getInventoryCount();
        BigDecimal bigDecimal80 = other.getInventoryCount();
        if (this$inventoryCount == null ? other$inventoryCount != null : !this$inventoryCount.equals(other$inventoryCount)) {
            return false;
        }
        String string211 = this.getManufacturingStrategy();
        String string212 = other.getManufacturingStrategy();
        if (this$manufacturingStrategy == null ? other$manufacturingStrategy != null : !this$manufacturingStrategy.equals(other$manufacturingStrategy)) {
            return false;
        }
        List<ProductAlbumVO> list3 = this.getProductAlbums();
        List<ProductAlbumVO> list4 = other.getProductAlbums();
        if (this$productAlbums == null ? other$productAlbums != null : !this$productAlbums.equals(other$productAlbums)) {
            return false;
        }
        List<ProductAttachmentVO> list5 = this.getProductAttachments();
        List<ProductAttachmentVO> list6 = other.getProductAttachments();
        if (this$productAttachments == null ? other$productAttachments != null : !this$productAttachments.equals(other$productAttachments)) {
            return false;
        }
        List<ProductParameterExtendVO> list7 = this.getProductParams();
        List<ProductParameterExtendVO> list8 = other.getProductParams();
        if (this$productParams == null ? other$productParams != null : !this$productParams.equals(other$productParams)) {
            return false;
        }
        List<ProductSpecItemDTO> list9 = this.getProductSpecItems();
        List<ProductSpecItemDTO> list10 = other.getProductSpecItems();
        if (this$productSpecItems == null ? other$productSpecItems != null : !this$productSpecItems.equals(other$productSpecItems)) {
            return false;
        }
        String string213 = this.getProductDefine1();
        String string214 = other.getProductDefine1();
        if (this$productDefine1 == null ? other$productDefine1 != null : !this$productDefine1.equals(other$productDefine1)) {
            return false;
        }
        String string215 = this.getProductDefine2();
        String string216 = other.getProductDefine2();
        if (this$productDefine2 == null ? other$productDefine2 != null : !this$productDefine2.equals(other$productDefine2)) {
            return false;
        }
        String string217 = this.getProductDefine3();
        String string218 = other.getProductDefine3();
        if (this$productDefine3 == null ? other$productDefine3 != null : !this$productDefine3.equals(other$productDefine3)) {
            return false;
        }
        String string219 = this.getProductDefine4();
        String string220 = other.getProductDefine4();
        if (this$productDefine4 == null ? other$productDefine4 != null : !this$productDefine4.equals(other$productDefine4)) {
            return false;
        }
        String string221 = this.getProductDefine5();
        String string222 = other.getProductDefine5();
        if (this$productDefine5 == null ? other$productDefine5 != null : !this$productDefine5.equals(other$productDefine5)) {
            return false;
        }
        String string223 = this.getProductDefine6();
        String string224 = other.getProductDefine6();
        if (this$productDefine6 == null ? other$productDefine6 != null : !this$productDefine6.equals(other$productDefine6)) {
            return false;
        }
        String string225 = this.getProductDefine7();
        String string226 = other.getProductDefine7();
        if (this$productDefine7 == null ? other$productDefine7 != null : !this$productDefine7.equals(other$productDefine7)) {
            return false;
        }
        String string227 = this.getProductDefine8();
        String string228 = other.getProductDefine8();
        if (this$productDefine8 == null ? other$productDefine8 != null : !this$productDefine8.equals(other$productDefine8)) {
            return false;
        }
        String string229 = this.getProductDefine9();
        String string230 = other.getProductDefine9();
        if (this$productDefine9 == null ? other$productDefine9 != null : !this$productDefine9.equals(other$productDefine9)) {
            return false;
        }
        String string231 = this.getProductDefine10();
        String string232 = other.getProductDefine10();
        if (this$productDefine10 == null ? other$productDefine10 != null : !this$productDefine10.equals(other$productDefine10)) {
            return false;
        }
        String string233 = this.getProductDefine11();
        String string234 = other.getProductDefine11();
        if (this$productDefine11 == null ? other$productDefine11 != null : !this$productDefine11.equals(other$productDefine11)) {
            return false;
        }
        String string235 = this.getProductDefine12();
        String string236 = other.getProductDefine12();
        if (this$productDefine12 == null ? other$productDefine12 != null : !this$productDefine12.equals(other$productDefine12)) {
            return false;
        }
        String string237 = this.getProductDefine13();
        String string238 = other.getProductDefine13();
        if (this$productDefine13 == null ? other$productDefine13 != null : !this$productDefine13.equals(other$productDefine13)) {
            return false;
        }
        String string239 = this.getProductDefine14();
        String string240 = other.getProductDefine14();
        if (this$productDefine14 == null ? other$productDefine14 != null : !this$productDefine14.equals(other$productDefine14)) {
            return false;
        }
        String string241 = this.getProductDefine15();
        String string242 = other.getProductDefine15();
        if (this$productDefine15 == null ? other$productDefine15 != null : !this$productDefine15.equals(other$productDefine15)) {
            return false;
        }
        String string243 = this.getProductDefine16();
        String string244 = other.getProductDefine16();
        if (this$productDefine16 == null ? other$productDefine16 != null : !this$productDefine16.equals(other$productDefine16)) {
            return false;
        }
        String string245 = this.getProductDefine17();
        String string246 = other.getProductDefine17();
        if (this$productDefine17 == null ? other$productDefine17 != null : !this$productDefine17.equals(other$productDefine17)) {
            return false;
        }
        String string247 = this.getProductDefine18();
        String string248 = other.getProductDefine18();
        if (this$productDefine18 == null ? other$productDefine18 != null : !this$productDefine18.equals(other$productDefine18)) {
            return false;
        }
        String string249 = this.getProductDefine19();
        String string250 = other.getProductDefine19();
        if (this$productDefine19 == null ? other$productDefine19 != null : !this$productDefine19.equals(other$productDefine19)) {
            return false;
        }
        String string251 = this.getProductDefine20();
        String string252 = other.getProductDefine20();
        if (this$productDefine20 == null ? other$productDefine20 != null : !this$productDefine20.equals(other$productDefine20)) {
            return false;
        }
        String string253 = this.getProductDefine21();
        String string254 = other.getProductDefine21();
        if (this$productDefine21 == null ? other$productDefine21 != null : !this$productDefine21.equals(other$productDefine21)) {
            return false;
        }
        String string255 = this.getProductDefine22();
        String string256 = other.getProductDefine22();
        if (this$productDefine22 == null ? other$productDefine22 != null : !this$productDefine22.equals(other$productDefine22)) {
            return false;
        }
        String string257 = this.getProductDefine23();
        String string258 = other.getProductDefine23();
        if (this$productDefine23 == null ? other$productDefine23 != null : !this$productDefine23.equals(other$productDefine23)) {
            return false;
        }
        String string259 = this.getProductDefine24();
        String string260 = other.getProductDefine24();
        if (this$productDefine24 == null ? other$productDefine24 != null : !this$productDefine24.equals(other$productDefine24)) {
            return false;
        }
        String string261 = this.getProductDefine25();
        String string262 = other.getProductDefine25();
        if (this$productDefine25 == null ? other$productDefine25 != null : !this$productDefine25.equals(other$productDefine25)) {
            return false;
        }
        String string263 = this.getProductDefine26();
        String string264 = other.getProductDefine26();
        if (this$productDefine26 == null ? other$productDefine26 != null : !this$productDefine26.equals(other$productDefine26)) {
            return false;
        }
        String string265 = this.getProductDefine27();
        String string266 = other.getProductDefine27();
        if (this$productDefine27 == null ? other$productDefine27 != null : !this$productDefine27.equals(other$productDefine27)) {
            return false;
        }
        String string267 = this.getProductDefine28();
        String string268 = other.getProductDefine28();
        if (this$productDefine28 == null ? other$productDefine28 != null : !this$productDefine28.equals(other$productDefine28)) {
            return false;
        }
        String string269 = this.getProductDefine29();
        String string270 = other.getProductDefine29();
        if (this$productDefine29 == null ? other$productDefine29 != null : !this$productDefine29.equals(other$productDefine29)) {
            return false;
        }
        String string271 = this.getProductDefine30();
        String string272 = other.getProductDefine30();
        if (this$productDefine30 == null ? other$productDefine30 != null : !this$productDefine30.equals(other$productDefine30)) {
            return false;
        }
        String string273 = this.getProductFreeDefine1();
        String string274 = other.getProductFreeDefine1();
        if (this$productFreeDefine1 == null ? other$productFreeDefine1 != null : !this$productFreeDefine1.equals(other$productFreeDefine1)) {
            return false;
        }
        String string275 = this.getProductFreeDefine2();
        String string276 = other.getProductFreeDefine2();
        if (this$productFreeDefine2 == null ? other$productFreeDefine2 != null : !this$productFreeDefine2.equals(other$productFreeDefine2)) {
            return false;
        }
        String string277 = this.getProductFreeDefine3();
        String string278 = other.getProductFreeDefine3();
        if (this$productFreeDefine3 == null ? other$productFreeDefine3 != null : !this$productFreeDefine3.equals(other$productFreeDefine3)) {
            return false;
        }
        String string279 = this.getProductFreeDefine4();
        String string280 = other.getProductFreeDefine4();
        if (this$productFreeDefine4 == null ? other$productFreeDefine4 != null : !this$productFreeDefine4.equals(other$productFreeDefine4)) {
            return false;
        }
        String string281 = this.getProductFreeDefine5();
        String string282 = other.getProductFreeDefine5();
        if (this$productFreeDefine5 == null ? other$productFreeDefine5 != null : !this$productFreeDefine5.equals(other$productFreeDefine5)) {
            return false;
        }
        String string283 = this.getProductFreeDefine6();
        String string284 = other.getProductFreeDefine6();
        if (this$productFreeDefine6 == null ? other$productFreeDefine6 != null : !this$productFreeDefine6.equals(other$productFreeDefine6)) {
            return false;
        }
        String string285 = this.getProductFreeDefine7();
        String string286 = other.getProductFreeDefine7();
        if (this$productFreeDefine7 == null ? other$productFreeDefine7 != null : !this$productFreeDefine7.equals(other$productFreeDefine7)) {
            return false;
        }
        String string287 = this.getProductFreeDefine8();
        String string288 = other.getProductFreeDefine8();
        if (this$productFreeDefine8 == null ? other$productFreeDefine8 != null : !this$productFreeDefine8.equals(other$productFreeDefine8)) {
            return false;
        }
        String string289 = this.getProductFreeDefine9();
        String string290 = other.getProductFreeDefine9();
        if (this$productFreeDefine9 == null ? other$productFreeDefine9 != null : !this$productFreeDefine9.equals(other$productFreeDefine9)) {
            return false;
        }
        String string291 = this.getProductFreeDefine10();
        String string292 = other.getProductFreeDefine10();
        if (this$productFreeDefine10 == null ? other$productFreeDefine10 != null : !this$productFreeDefine10.equals(other$productFreeDefine10)) {
            return false;
        }
        String string293 = this.getProductFreeDefine11();
        String string294 = other.getProductFreeDefine11();
        if (this$productFreeDefine11 == null ? other$productFreeDefine11 != null : !this$productFreeDefine11.equals(other$productFreeDefine11)) {
            return false;
        }
        String string295 = this.getProductFreeDefine12();
        String string296 = other.getProductFreeDefine12();
        if (this$productFreeDefine12 == null ? other$productFreeDefine12 != null : !this$productFreeDefine12.equals(other$productFreeDefine12)) {
            return false;
        }
        String string297 = this.getProductFreeDefine13();
        String string298 = other.getProductFreeDefine13();
        if (this$productFreeDefine13 == null ? other$productFreeDefine13 != null : !this$productFreeDefine13.equals(other$productFreeDefine13)) {
            return false;
        }
        String string299 = this.getProductFreeDefine14();
        String string300 = other.getProductFreeDefine14();
        if (this$productFreeDefine14 == null ? other$productFreeDefine14 != null : !this$productFreeDefine14.equals(other$productFreeDefine14)) {
            return false;
        }
        String string301 = this.getProductFreeDefine15();
        String string302 = other.getProductFreeDefine15();
        if (this$productFreeDefine15 == null ? other$productFreeDefine15 != null : !this$productFreeDefine15.equals(other$productFreeDefine15)) {
            return false;
        }
        String string303 = this.getProductFreeDefine16();
        String string304 = other.getProductFreeDefine16();
        if (this$productFreeDefine16 == null ? other$productFreeDefine16 != null : !this$productFreeDefine16.equals(other$productFreeDefine16)) {
            return false;
        }
        String string305 = this.getProductFreeDefine17();
        String string306 = other.getProductFreeDefine17();
        if (this$productFreeDefine17 == null ? other$productFreeDefine17 != null : !this$productFreeDefine17.equals(other$productFreeDefine17)) {
            return false;
        }
        String string307 = this.getProductFreeDefine18();
        String string308 = other.getProductFreeDefine18();
        if (this$productFreeDefine18 == null ? other$productFreeDefine18 != null : !this$productFreeDefine18.equals(other$productFreeDefine18)) {
            return false;
        }
        String string309 = this.getProductFreeDefine19();
        String string310 = other.getProductFreeDefine19();
        if (this$productFreeDefine19 == null ? other$productFreeDefine19 != null : !this$productFreeDefine19.equals(other$productFreeDefine19)) {
            return false;
        }
        String string311 = this.getProductFreeDefine20();
        String string312 = other.getProductFreeDefine20();
        if (this$productFreeDefine20 == null ? other$productFreeDefine20 != null : !this$productFreeDefine20.equals(other$productFreeDefine20)) {
            return false;
        }
        String string313 = this.getProductFreeDefine21();
        String string314 = other.getProductFreeDefine21();
        if (this$productFreeDefine21 == null ? other$productFreeDefine21 != null : !this$productFreeDefine21.equals(other$productFreeDefine21)) {
            return false;
        }
        String string315 = this.getProductFreeDefine22();
        String string316 = other.getProductFreeDefine22();
        if (this$productFreeDefine22 == null ? other$productFreeDefine22 != null : !this$productFreeDefine22.equals(other$productFreeDefine22)) {
            return false;
        }
        String string317 = this.getProductFreeDefine23();
        String string318 = other.getProductFreeDefine23();
        if (this$productFreeDefine23 == null ? other$productFreeDefine23 != null : !this$productFreeDefine23.equals(other$productFreeDefine23)) {
            return false;
        }
        String string319 = this.getProductFreeDefine24();
        String string320 = other.getProductFreeDefine24();
        if (this$productFreeDefine24 == null ? other$productFreeDefine24 != null : !this$productFreeDefine24.equals(other$productFreeDefine24)) {
            return false;
        }
        String string321 = this.getProductFreeDefine25();
        String string322 = other.getProductFreeDefine25();
        if (this$productFreeDefine25 == null ? other$productFreeDefine25 != null : !this$productFreeDefine25.equals(other$productFreeDefine25)) {
            return false;
        }
        String string323 = this.getProductFreeDefine26();
        String string324 = other.getProductFreeDefine26();
        if (this$productFreeDefine26 == null ? other$productFreeDefine26 != null : !this$productFreeDefine26.equals(other$productFreeDefine26)) {
            return false;
        }
        String string325 = this.getProductFreeDefine27();
        String string326 = other.getProductFreeDefine27();
        if (this$productFreeDefine27 == null ? other$productFreeDefine27 != null : !this$productFreeDefine27.equals(other$productFreeDefine27)) {
            return false;
        }
        String string327 = this.getProductFreeDefine28();
        String string328 = other.getProductFreeDefine28();
        if (this$productFreeDefine28 == null ? other$productFreeDefine28 != null : !this$productFreeDefine28.equals(other$productFreeDefine28)) {
            return false;
        }
        String string329 = this.getProductFreeDefine29();
        String string330 = other.getProductFreeDefine29();
        if (this$productFreeDefine29 == null ? other$productFreeDefine29 != null : !this$productFreeDefine29.equals(other$productFreeDefine29)) {
            return false;
        }
        String string331 = this.getProductFreeDefine30();
        String string332 = other.getProductFreeDefine30();
        if (this$productFreeDefine30 == null ? other$productFreeDefine30 != null : !this$productFreeDefine30.equals(other$productFreeDefine30)) {
            return false;
        }
        String string333 = this.getFree1();
        String string334 = other.getFree1();
        if (this$free1 == null ? other$free1 != null : !this$free1.equals(other$free1)) {
            return false;
        }
        String string335 = this.getFree2();
        String string336 = other.getFree2();
        if (this$free2 == null ? other$free2 != null : !this$free2.equals(other$free2)) {
            return false;
        }
        String string337 = this.getFree3();
        String string338 = other.getFree3();
        if (this$free3 == null ? other$free3 != null : !this$free3.equals(other$free3)) {
            return false;
        }
        String string339 = this.getFree4();
        String string340 = other.getFree4();
        if (this$free4 == null ? other$free4 != null : !this$free4.equals(other$free4)) {
            return false;
        }
        String string341 = this.getFree5();
        String string342 = other.getFree5();
        if (this$free5 == null ? other$free5 != null : !this$free5.equals(other$free5)) {
            return false;
        }
        String string343 = this.getFree6();
        String string344 = other.getFree6();
        if (this$free6 == null ? other$free6 != null : !this$free6.equals(other$free6)) {
            return false;
        }
        String string345 = this.getFree7();
        String string346 = other.getFree7();
        if (this$free7 == null ? other$free7 != null : !this$free7.equals(other$free7)) {
            return false;
        }
        String string347 = this.getFree8();
        String string348 = other.getFree8();
        if (this$free8 == null ? other$free8 != null : !this$free8.equals(other$free8)) {
            return false;
        }
        String string349 = this.getFree9();
        String string350 = other.getFree9();
        if (this$free9 == null ? other$free9 != null : !this$free9.equals(other$free9)) {
            return false;
        }
        String string351 = this.getFree10();
        String string352 = other.getFree10();
        if (this$free10 == null ? other$free10 != null : !this$free10.equals(other$free10)) {
            return false;
        }
        String string353 = this.getMaterialStatus();
        String string354 = other.getMaterialStatus();
        if (this$materialStatus == null ? other$materialStatus != null : !this$materialStatus.equals(other$materialStatus)) {
            return false;
        }
        String string355 = this.getOrgMaterialStatus();
        String string356 = other.getOrgMaterialStatus();
        if (this$orgMaterialStatus == null ? other$orgMaterialStatus != null : !this$orgMaterialStatus.equals(other$orgMaterialStatus)) {
            return false;
        }
        List<CharacterDTO> list11 = this.getCharacterDTOList();
        List<CharacterDTO> list12 = other.getCharacterDTOList();
        if (this$characterDTOList == null ? other$characterDTOList != null : !this$characterDTOList.equals(other$characterDTOList)) {
            return false;
        }
        String string357 = this.getHomepageBusinessId();
        String string358 = other.getHomepageBusinessId();
        if (this$homepageBusinessId == null ? other$homepageBusinessId != null : !this$homepageBusinessId.equals(other$homepageBusinessId)) {
            return false;
        }
        String string359 = this.getImgBusinessId();
        String string360 = other.getImgBusinessId();
        if (this$imgBusinessId == null ? other$imgBusinessId != null : !this$imgBusinessId.equals(other$imgBusinessId)) {
            return false;
        }
        String string361 = this.getVideoBusinessId();
        String string362 = other.getVideoBusinessId();
        if (this$videoBusinessId == null ? other$videoBusinessId != null : !this$videoBusinessId.equals(other$videoBusinessId)) {
            return false;
        }
        String string363 = this.getAttachments();
        String string364 = other.getAttachments();
        if (this$attachments == null ? other$attachments != null : !this$attachments.equals(other$attachments)) {
            return false;
        }
        String string365 = this.getCostItems();
        String string366 = other.getCostItems();
        if (this$costItems == null ? other$costItems != null : !this$costItems.equals(other$costItems)) {
            return false;
        }
        String string367 = this.getCostItemsCode();
        String string368 = other.getCostItemsCode();
        if (this$costItemsCode == null ? other$costItemsCode != null : !this$costItemsCode.equals(other$costItemsCode)) {
            return false;
        }
        String string369 = this.getCostItemsName();
        String string370 = other.getCostItemsName();
        if (this$costItemsName == null ? other$costItemsName != null : !this$costItemsName.equals(other$costItemsName)) {
            return false;
        }
        String string371 = this.getBillingUnitCode();
        String string372 = other.getBillingUnitCode();
        if (this$billingUnitCode == null ? other$billingUnitCode != null : !this$billingUnitCode.equals(other$billingUnitCode)) {
            return false;
        }
        String string373 = this.getBillingUnitName();
        String string374 = other.getBillingUnitName();
        if (this$billingUnitName == null ? other$billingUnitName != null : !this$billingUnitName.equals(other$billingUnitName)) {
            return false;
        }
        BigDecimal bigDecimal81 = this.getDoublePick();
        BigDecimal bigDecimal82 = other.getDoublePick();
        if (this$doublePick == null ? other$doublePick != null : !this$doublePick.equals(other$doublePick)) {
            return false;
        }
        Map<String, Object> map = this.getCustomExtend();
        Map<String, Object> map2 = other.getCustomExtend();
        if (this$customExtend == null ? other$customExtend != null : !this$customExtend.equals(other$customExtend)) {
            return false;
        }
        String string375 = this.getMktRequireUnitName();
        String string376 = other.getMktRequireUnitName();
        if (this$mktRequireUnitName == null ? other$mktRequireUnitName != null : !this$mktRequireUnitName.equals(other$mktRequireUnitName)) {
            return false;
        }
        String string377 = this.getMktRequireUnitPrecision();
        String string378 = other.getMktRequireUnitPrecision();
        if (this$mktRequireUnitPrecision == null ? other$mktRequireUnitPrecision != null : !this$mktRequireUnitPrecision.equals(other$mktRequireUnitPrecision)) {
            return false;
        }
        String string379 = this.getMktRequireUniterpCode();
        String string380 = other.getMktRequireUniterpCode();
        if (this$mktRequireUniterpCode == null ? other$mktRequireUniterpCode != null : !this$mktRequireUniterpCode.equals(other$mktRequireUniterpCode)) {
            return false;
        }
        String string381 = this.getMktOfflineUnitName();
        String string382 = other.getMktOfflineUnitName();
        if (this$mktOfflineUnitName == null ? other$mktOfflineUnitName != null : !this$mktOfflineUnitName.equals(other$mktOfflineUnitName)) {
            return false;
        }
        String string383 = this.getMktOfflineUnitPrecision();
        String string384 = other.getMktOfflineUnitPrecision();
        if (this$mktOfflineUnitPrecision == null ? other$mktOfflineUnitPrecision != null : !this$mktOfflineUnitPrecision.equals(other$mktOfflineUnitPrecision)) {
            return false;
        }
        String string385 = this.getMktOfflineUniterpCode();
        String string386 = other.getMktOfflineUniterpCode();
        if (this$mktOfflineUniterpCode == null ? other$mktOfflineUniterpCode != null : !this$mktOfflineUniterpCode.equals(other$mktOfflineUniterpCode)) {
            return false;
        }
        String string387 = this.getFiOutTaxrateName();
        String string388 = other.getFiOutTaxrateName();
        if (this$fiOutTaxrateName == null ? other$fiOutTaxrateName != null : !this$fiOutTaxrateName.equals(other$fiOutTaxrateName)) {
            return false;
        }
        String string389 = this.getLowestMarkPrice();
        String string390 = other.getLowestMarkPrice();
        if (this$lowestMarkPrice == null ? other$lowestMarkPrice != null : !this$lowestMarkPrice.equals(other$lowestMarkPrice)) {
            return false;
        }
        String string391 = this.getCreateTime();
        String string392 = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) {
            return false;
        }
        BigDecimal bigDecimal83 = this.getMallDepositPercentage();
        BigDecimal bigDecimal84 = other.getMallDepositPercentage();
        if (this$mallDepositPercentage == null ? other$mallDepositPercentage != null : !this$mallDepositPercentage.equals(other$mallDepositPercentage)) {
            return false;
        }
        String string393 = this.getKeywords();
        String string394 = other.getKeywords();
        if (this$keywords == null ? other$keywords != null : !this$keywords.equals(other$keywords)) {
            return false;
        }
        String string395 = this.getMallMetaDescription();
        String string396 = other.getMallMetaDescription();
        if (this$mallMetaDescription == null ? other$mallMetaDescription != null : !this$mallMetaDescription.equals(other$mallMetaDescription)) {
            return false;
        }
        MultiLangText multiLangText17 = this.getMktOnlineUnit___Name();
        MultiLangText multiLangText18 = other.getMktOnlineUnit___Name();
        if (this$mktOnlineUnit___Name == null ? other$mktOnlineUnit___Name != null : !this$mktOnlineUnit___Name.equals(other$mktOnlineUnit___Name)) {
            return false;
        }
        String string397 = this.getMallSaleStyle();
        String string398 = other.getMallSaleStyle();
        if (this$mallSaleStyle == null ? other$mallSaleStyle != null : !this$mallSaleStyle.equals(other$mallSaleStyle)) {
            return false;
        }
        String string399 = this.getMallPageTitle();
        String string400 = other.getMallPageTitle();
        if (this$mallPageTitle == null ? other$mallPageTitle != null : !this$mallPageTitle.equals(other$mallPageTitle)) {
            return false;
        }
        BigDecimal bigDecimal85 = this.getMallDeposits();
        BigDecimal bigDecimal86 = other.getMallDeposits();
        if (this$mallDeposits == null ? other$mallDeposits != null : !this$mallDeposits.equals(other$mallDeposits)) {
            return false;
        }
        String string401 = this.getDeliveryMethod();
        String string402 = other.getDeliveryMethod();
        if (this$deliveryMethod == null ? other$deliveryMethod != null : !this$deliveryMethod.equals(other$deliveryMethod)) {
            return false;
        }
        BigDecimal bigDecimal87 = this.getMeasurementCount();
        BigDecimal bigDecimal88 = other.getMeasurementCount();
        if (this$measurementCount == null ? other$measurementCount != null : !this$measurementCount.equals(other$measurementCount)) {
            return false;
        }
        String string403 = this.getMeasurementUnitName();
        String string404 = other.getMeasurementUnitName();
        if (this$measurementUnitName == null ? other$measurementUnitName != null : !this$measurementUnitName.equals(other$measurementUnitName)) {
            return false;
        }
        String string405 = this.getMeasurementUnitCode();
        String string406 = other.getMeasurementUnitCode();
        if (this$measurementUnitCode == null ? other$measurementUnitCode != null : !this$measurementUnitCode.equals(other$measurementUnitCode)) {
            return false;
        }
        BigDecimal bigDecimal89 = this.getCompensationAmount();
        BigDecimal bigDecimal90 = other.getCompensationAmount();
        if (this$compensationAmount == null ? other$compensationAmount != null : !this$compensationAmount.equals(other$compensationAmount)) {
            return false;
        }
        BigDecimal bigDecimal91 = this.getMoldingTime();
        BigDecimal bigDecimal92 = other.getMoldingTime();
        if (this$moldingTime == null ? other$moldingTime != null : !this$moldingTime.equals(other$moldingTime)) {
            return false;
        }
        BigDecimal bigDecimal93 = this.getMoldCavities();
        BigDecimal bigDecimal94 = other.getMoldCavities();
        if (this$moldCavities == null ? other$moldCavities != null : !this$moldCavities.equals(other$moldCavities)) {
            return false;
        }
        String string407 = this.getProductionMode();
        String string408 = other.getProductionMode();
        return !(this$productionMode == null ? other$productionMode != null : !this$productionMode.equals(other$productionMode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductDTO;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        void $productionMode;
        void $moldCavities;
        void $moldingTime;
        void $compensationAmount;
        void $measurementUnitCode;
        void $measurementUnitName;
        void $measurementCount;
        void $deliveryMethod;
        void $mallDeposits;
        void $mallPageTitle;
        void $mallSaleStyle;
        void $mktOnlineUnit___Name;
        void $mallMetaDescription;
        void $keywords;
        void $mallDepositPercentage;
        void $createTime;
        void $lowestMarkPrice;
        void $fiOutTaxrateName;
        void $mktOfflineUniterpCode;
        void $mktOfflineUnitPrecision;
        void $mktOfflineUnitName;
        void $mktRequireUniterpCode;
        void $mktRequireUnitPrecision;
        void $mktRequireUnitName;
        void $customExtend;
        void $doublePick;
        void $billingUnitName;
        void $billingUnitCode;
        void $costItemsName;
        void $costItemsCode;
        void $costItems;
        void $attachments;
        void $videoBusinessId;
        void $imgBusinessId;
        void $homepageBusinessId;
        void $characterDTOList;
        void $orgMaterialStatus;
        void $materialStatus;
        void $free10;
        void $free9;
        void $free8;
        void $free7;
        void $free6;
        void $free5;
        void $free4;
        void $free3;
        void $free2;
        void $free1;
        void $productFreeDefine30;
        void $productFreeDefine29;
        void $productFreeDefine28;
        void $productFreeDefine27;
        void $productFreeDefine26;
        void $productFreeDefine25;
        void $productFreeDefine24;
        void $productFreeDefine23;
        void $productFreeDefine22;
        void $productFreeDefine21;
        void $productFreeDefine20;
        void $productFreeDefine19;
        void $productFreeDefine18;
        void $productFreeDefine17;
        void $productFreeDefine16;
        void $productFreeDefine15;
        void $productFreeDefine14;
        void $productFreeDefine13;
        void $productFreeDefine12;
        void $productFreeDefine11;
        void $productFreeDefine10;
        void $productFreeDefine9;
        void $productFreeDefine8;
        void $productFreeDefine7;
        void $productFreeDefine6;
        void $productFreeDefine5;
        void $productFreeDefine4;
        void $productFreeDefine3;
        void $productFreeDefine2;
        void $productFreeDefine1;
        void $productDefine30;
        void $productDefine29;
        void $productDefine28;
        void $productDefine27;
        void $productDefine26;
        void $productDefine25;
        void $productDefine24;
        void $productDefine23;
        void $productDefine22;
        void $productDefine21;
        void $productDefine20;
        void $productDefine19;
        void $productDefine18;
        void $productDefine17;
        void $productDefine16;
        void $productDefine15;
        void $productDefine14;
        void $productDefine13;
        void $productDefine12;
        void $productDefine11;
        void $productDefine10;
        void $productDefine9;
        void $productDefine8;
        void $productDefine7;
        void $productDefine6;
        void $productDefine5;
        void $productDefine4;
        void $productDefine3;
        void $productDefine2;
        void $productDefine1;
        void $productSpecItems;
        void $productParams;
        void $productAttachments;
        void $productAlbums;
        void $manufacturingStrategy;
        void $inventoryCount;
        void $titleMemo;
        void $url;
        void $medRegistrationNo;
        void $medSunshinePurchaseNo;
        void $mobileDescription;
        void $description;
        void $warehouseManagerName;
        void $warehouseManager;
        void $productBuyerName;
        void $productBuyer;
        void $productVendorName;
        void $mnemonicCode;
        void $erpCode;
        void $minimumDeposits;
        void $depositPayType;
        void $productTemplateName;
        void $businessAttribute;
        void $virtualProductAttribute;
        void $realProductAttributeType;
        void $realProductAttribute;
        void $receiptModel;
        void $receiptSpec;
        void $fiPreferentialPolicyTypeName;
        void $fiOutTaxrate;
        void $noTaxation;
        void $fiInTaxrate;
        void $fiReceiptName;
        void $taxClassSimpleName;
        void $taxClassName;
        void $taxClassCode;
        void $taxClass;
        void $fiNoTaxCostPrice;
        void $edPlanClassName;
        void $edProduceUnitPercision;
        void $edProduceUnitName;
        void $edProduceUnitCode;
        void $wastageRate;
        void $edRejectRate;
        void $edFixedWastage;
        void $edLeadTimeQuantity;
        void $edLeadTimeCoefficient;
        void $edBatchDouble;
        void $edFixedQuantity;
        void $edEconomicQuantity;
        void $edBatchRule;
        void $edBOMSource;
        void $edBOMType;
        void $edKeySubPart;
        void $edPlanProduceLimit;
        void $edManufacturePlanner;
        void $edPlanMethod;
        void $edPlanDefaultAttribute;
        void $edECNControl;
        void $edEngineeringDrawingNo;
        void $edWeigh;
        void $edProduceDepartmentNew;
        void $demandPlanningUnitName;
        void $demandPlanningUnitCode;
        void $stockStockUnitName;
        void $stockStockUnitCode;
        void $stockStorageLossRate;
        void $stockOutStoreLessLimit;
        void $stockInStoreLessLimit;
        void $stockOutStoreExcessLimit;
        void $stockInStoreExcessLimit;
        void $stockReceiptWarehouseName;
        void $stockReturnWarehouseName;
        void $stockDeliveryWarehouseName;
        void $stockRopStock;
        void $stockLowestStock;
        void $stockHighestStock;
        void $stockSafetyStock;
        void $stockValidityWarningDays;
        void $stockDaysBeforeValidityReject;
        void $stockExpireDateUnit;
        void $stockExpireDateNo;
        void $stockExpiryDateCalculationMethod;
        void $stockOmsWarehouse;
        void $saleProductClassPath;
        void $saleProductClassName;
        void $saleProductClassCode;
        void $saleChannel;
        void $saleDoubleSale;
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $shopId = this.getShopId();
        result = result * 59 + ($shopId == null ? 43 : ((Object)$shopId).hashCode());
        Long $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : ((Object)$productApplyRangeId).hashCode());
        Long $unitId = this.getUnitId();
        result = result * 59 + ($unitId == null ? 43 : ((Object)$unitId).hashCode());
        Integer $unitTruncationType = this.getUnitTruncationType();
        result = result * 59 + ($unitTruncationType == null ? 43 : ((Object)$unitTruncationType).hashCode());
        Integer $unitExchangeType = this.getUnitExchangeType();
        result = result * 59 + ($unitExchangeType == null ? 43 : ((Object)$unitExchangeType).hashCode());
        Integer $unitPrecision = this.getUnitPrecision();
        result = result * 59 + ($unitPrecision == null ? 43 : ((Object)$unitPrecision).hashCode());
        Integer $unitUseType = this.getUnitUseType();
        result = result * 59 + ($unitUseType == null ? 43 : ((Object)$unitUseType).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Long $assistUnit = this.getAssistUnit();
        result = result * 59 + ($assistUnit == null ? 43 : ((Object)$assistUnit).hashCode());
        Boolean $enableAssistUnit = this.getEnableAssistUnit();
        result = result * 59 + ($enableAssistUnit == null ? 43 : ((Object)$enableAssistUnit).hashCode());
        Integer $singleInspection = this.getSingleInspection();
        result = result * 59 + ($singleInspection == null ? 43 : ((Object)$singleInspection).hashCode());
        Long $manageClass = this.getManageClass();
        result = result * 59 + ($manageClass == null ? 43 : ((Object)$manageClass).hashCode());
        Long $purchaseClass = this.getPurchaseClass();
        result = result * 59 + ($purchaseClass == null ? 43 : ((Object)$purchaseClass).hashCode());
        Long $costClass = this.getCostClass();
        result = result * 59 + ($costClass == null ? 43 : ((Object)$costClass).hashCode());
        Long $brand = this.getBrand();
        result = result * 59 + ($brand == null ? 43 : ((Object)$brand).hashCode());
        Long $productLine = this.getProductLine();
        result = result * 59 + ($productLine == null ? 43 : ((Object)$productLine).hashCode());
        Long $weightUnit = this.getWeightUnit();
        result = result * 59 + ($weightUnit == null ? 43 : ((Object)$weightUnit).hashCode());
        Long $netWeightUnit = this.getNetWeightUnit();
        result = result * 59 + ($netWeightUnit == null ? 43 : ((Object)$netWeightUnit).hashCode());
        Long $volumeUnit = this.getVolumeUnit();
        result = result * 59 + ($volumeUnit == null ? 43 : ((Object)$volumeUnit).hashCode());
        Boolean $mktDisplayPrice = this.getMktDisplayPrice();
        result = result * 59 + ($mktDisplayPrice == null ? 43 : ((Object)$mktDisplayPrice).hashCode());
        Long $mktBatchPriceUnit = this.getMktBatchPriceUnit();
        result = result * 59 + ($mktBatchPriceUnit == null ? 43 : ((Object)$mktBatchPriceUnit).hashCode());
        Long $mktBatchUnit = this.getMktBatchUnit();
        result = result * 59 + ($mktBatchUnit == null ? 43 : ((Object)$mktBatchUnit).hashCode());
        Long $mktOnlineUnit = this.getMktOnlineUnit();
        result = result * 59 + ($mktOnlineUnit == null ? 43 : ((Object)$mktOnlineUnit).hashCode());
        Long $mktOfflineUnit = this.getMktOfflineUnit();
        result = result * 59 + ($mktOfflineUnit == null ? 43 : ((Object)$mktOfflineUnit).hashCode());
        Long $mktRequireUnit = this.getMktRequireUnit();
        result = result * 59 + ($mktRequireUnit == null ? 43 : ((Object)$mktRequireUnit).hashCode());
        Boolean $mktStatus = this.getMktStatus();
        result = result * 59 + ($mktStatus == null ? 43 : ((Object)$mktStatus).hashCode());
        Boolean $mktUOrderStatus = this.getMktUOrderStatus();
        result = result * 59 + ($mktUOrderStatus == null ? 43 : ((Object)$mktUOrderStatus).hashCode());
        Integer $orderUpCount = this.getOrderUpCount();
        result = result * 59 + ($orderUpCount == null ? 43 : ((Object)$orderUpCount).hashCode());
        Integer $orderDownCount = this.getOrderDownCount();
        result = result * 59 + ($orderDownCount == null ? 43 : ((Object)$orderDownCount).hashCode());
        Long $upuPurchaseUnit = this.getUpuPurchaseUnit();
        result = result * 59 + ($upuPurchaseUnit == null ? 43 : ((Object)$upuPurchaseUnit).hashCode());
        Integer $upuPurchaseUnitPrecision = this.getUpuPurchaseUnitPrecision();
        result = result * 59 + ($upuPurchaseUnitPrecision == null ? 43 : ((Object)$upuPurchaseUnitPrecision).hashCode());
        Long $upuPurchasePriceUnit = this.getUpuPurchasePriceUnit();
        result = result * 59 + ($upuPurchasePriceUnit == null ? 43 : ((Object)$upuPurchasePriceUnit).hashCode());
        Boolean $saleCanSale = this.getSaleCanSale();
        result = result * 59 + ($saleCanSale == null ? 43 : ((Object)$saleCanSale).hashCode());
        Integer $saleDeliveryDays = this.getSaleDeliveryDays();
        result = result * 59 + ($saleDeliveryDays == null ? 43 : ((Object)$saleDeliveryDays).hashCode());
        Long $saleProductClass = this.getSaleProductClass();
        result = result * 59 + ($saleProductClass == null ? 43 : ((Object)$saleProductClass).hashCode());
        Boolean $stockBatchManage = this.getStockBatchManage();
        result = result * 59 + ($stockBatchManage == null ? 43 : ((Object)$stockBatchManage).hashCode());
        Boolean $stockExpiryDateManage = this.getStockExpiryDateManage();
        result = result * 59 + ($stockExpiryDateManage == null ? 43 : ((Object)$stockExpiryDateManage).hashCode());
        Boolean $stockSerialNoManage = this.getStockSerialNoManage();
        result = result * 59 + ($stockSerialNoManage == null ? 43 : ((Object)$stockSerialNoManage).hashCode());
        Boolean $stockBarcodeManage = this.getStockBarcodeManage();
        result = result * 59 + ($stockBarcodeManage == null ? 43 : ((Object)$stockBarcodeManage).hashCode());
        Integer $stockManageByInventory = this.getStockManageByInventory();
        result = result * 59 + ($stockManageByInventory == null ? 43 : ((Object)$stockManageByInventory).hashCode());
        Long $stockDeliveryWarehouse = this.getStockDeliveryWarehouse();
        result = result * 59 + ($stockDeliveryWarehouse == null ? 43 : ((Object)$stockDeliveryWarehouse).hashCode());
        Long $stockReturnWarehouse = this.getStockReturnWarehouse();
        result = result * 59 + ($stockReturnWarehouse == null ? 43 : ((Object)$stockReturnWarehouse).hashCode());
        Long $stockReceiptWarehouse = this.getStockReceiptWarehouse();
        result = result * 59 + ($stockReceiptWarehouse == null ? 43 : ((Object)$stockReceiptWarehouse).hashCode());
        Integer $stockMaximumTurnoverDays = this.getStockMaximumTurnoverDays();
        result = result * 59 + ($stockMaximumTurnoverDays == null ? 43 : ((Object)$stockMaximumTurnoverDays).hashCode());
        Long $stockScanCountUnit = this.getStockScanCountUnit();
        result = result * 59 + ($stockScanCountUnit == null ? 43 : ((Object)$stockScanCountUnit).hashCode());
        Boolean $stockReservation = this.getStockReservation();
        result = result * 59 + ($stockReservation == null ? 43 : ((Object)$stockReservation).hashCode());
        Boolean $stockAllowNegativeInventory = this.getStockAllowNegativeInventory();
        result = result * 59 + ($stockAllowNegativeInventory == null ? 43 : ((Object)$stockAllowNegativeInventory).hashCode());
        Long $stockStockUnit = this.getStockStockUnit();
        result = result * 59 + ($stockStockUnit == null ? 43 : ((Object)$stockStockUnit).hashCode());
        Long $demandPlanningUnit = this.getDemandPlanningUnit();
        result = result * 59 + ($demandPlanningUnit == null ? 43 : ((Object)$demandPlanningUnit).hashCode());
        Boolean $inspectionType = this.getInspectionType();
        result = result * 59 + ($inspectionType == null ? 43 : ((Object)$inspectionType).hashCode());
        Integer $testRule = this.getTestRule();
        result = result * 59 + ($testRule == null ? 43 : ((Object)$testRule).hashCode());
        Boolean $inspectionReturnsWarehousingByResult = this.getInspectionReturnsWarehousingByResult();
        result = result * 59 + ($inspectionReturnsWarehousingByResult == null ? 43 : ((Object)$inspectionReturnsWarehousingByResult).hashCode());
        Integer $planCheckDays = this.getPlanCheckDays();
        result = result * 59 + ($planCheckDays == null ? 43 : ((Object)$planCheckDays).hashCode());
        Long $inspectionUnit = this.getInspectionUnit();
        result = result * 59 + ($inspectionUnit == null ? 43 : ((Object)$inspectionUnit).hashCode());
        Integer $edSupplyType = this.getEdSupplyType();
        result = result * 59 + ($edSupplyType == null ? 43 : ((Object)$edSupplyType).hashCode());
        Integer $edProduceDepartment = this.getEdProduceDepartment();
        result = result * 59 + ($edProduceDepartment == null ? 43 : ((Object)$edProduceDepartment).hashCode());
        Boolean $edBindCarrier = this.getEdBindCarrier();
        result = result * 59 + ($edBindCarrier == null ? 43 : ((Object)$edBindCarrier).hashCode());
        Integer $edPurpose = this.getEdPurpose();
        result = result * 59 + ($edPurpose == null ? 43 : ((Object)$edPurpose).hashCode());
        Double $doubleReplenish = this.getDoubleReplenish();
        result = result * 59 + ($doubleReplenish == null ? 43 : ((Object)$doubleReplenish).hashCode());
        Integer $edFrontLeadTime = this.getEdFrontLeadTime();
        result = result * 59 + ($edFrontLeadTime == null ? 43 : ((Object)$edFrontLeadTime).hashCode());
        Integer $edBehindLeadTime = this.getEdBehindLeadTime();
        result = result * 59 + ($edBehindLeadTime == null ? 43 : ((Object)$edBehindLeadTime).hashCode());
        Integer $edFixedLeadTime = this.getEdFixedLeadTime();
        result = result * 59 + ($edFixedLeadTime == null ? 43 : ((Object)$edFixedLeadTime).hashCode());
        Integer $edLossType = this.getEdLossType();
        result = result * 59 + ($edLossType == null ? 43 : ((Object)$edLossType).hashCode());
        Boolean $edPrepareFeed = this.getEdPrepareFeed();
        result = result * 59 + ($edPrepareFeed == null ? 43 : ((Object)$edPrepareFeed).hashCode());
        Boolean $edWastageRate = this.getEdWastageRate();
        result = result * 59 + ($edWastageRate == null ? 43 : ((Object)$edWastageRate).hashCode());
        Boolean $edDirectProduction = this.getEdDirectProduction();
        result = result * 59 + ($edDirectProduction == null ? 43 : ((Object)$edDirectProduction).hashCode());
        Boolean $edSpecialMaterials = this.getEdSpecialMaterials();
        result = result * 59 + ($edSpecialMaterials == null ? 43 : ((Object)$edSpecialMaterials).hashCode());
        Boolean $edVirtualPart = this.getEdVirtualPart();
        result = result * 59 + ($edVirtualPart == null ? 43 : ((Object)$edVirtualPart).hashCode());
        Integer $edDemandConsolidation = this.getEdDemandConsolidation();
        result = result * 59 + ($edDemandConsolidation == null ? 43 : ((Object)$edDemandConsolidation).hashCode());
        Integer $edDemandConsolidationType = this.getEdDemandConsolidationType();
        result = result * 59 + ($edDemandConsolidationType == null ? 43 : ((Object)$edDemandConsolidationType).hashCode());
        Integer $edDemandConsolidationUnit = this.getEdDemandConsolidationUnit();
        result = result * 59 + ($edDemandConsolidationUnit == null ? 43 : ((Object)$edDemandConsolidationUnit).hashCode());
        Integer $edDemandConsolidationNumber = this.getEdDemandConsolidationNumber();
        result = result * 59 + ($edDemandConsolidationNumber == null ? 43 : ((Object)$edDemandConsolidationNumber).hashCode());
        Integer $edDemandConsolidationDateType = this.getEdDemandConsolidationDateType();
        result = result * 59 + ($edDemandConsolidationDateType == null ? 43 : ((Object)$edDemandConsolidationDateType).hashCode());
        Integer $edResetForwardDays = this.getEdResetForwardDays();
        result = result * 59 + ($edResetForwardDays == null ? 43 : ((Object)$edResetForwardDays).hashCode());
        Integer $edResetBackwardDays = this.getEdResetBackwardDays();
        result = result * 59 + ($edResetBackwardDays == null ? 43 : ((Object)$edResetBackwardDays).hashCode());
        Integer $edBeyondSupplyDays = this.getEdBeyondSupplyDays();
        result = result * 59 + ($edBeyondSupplyDays == null ? 43 : ((Object)$edBeyondSupplyDays).hashCode());
        Boolean $edLogisticsRelated = this.getEdLogisticsRelated();
        result = result * 59 + ($edLogisticsRelated == null ? 43 : ((Object)$edLogisticsRelated).hashCode());
        Integer $edWeighingMode = this.getEdWeighingMode();
        result = result * 59 + ($edWeighingMode == null ? 43 : ((Object)$edWeighingMode).hashCode());
        Boolean $edFixedReturn = this.getEdFixedReturn();
        result = result * 59 + ($edFixedReturn == null ? 43 : ((Object)$edFixedReturn).hashCode());
        Boolean $edReviewGrossWeight = this.getEdReviewGrossWeight();
        result = result * 59 + ($edReviewGrossWeight == null ? 43 : ((Object)$edReviewGrossWeight).hashCode());
        Boolean $edSpecialCarTransport = this.getEdSpecialCarTransport();
        result = result * 59 + ($edSpecialCarTransport == null ? 43 : ((Object)$edSpecialCarTransport).hashCode());
        Long $edProduceUnit = this.getEdProduceUnit();
        result = result * 59 + ($edProduceUnit == null ? 43 : ((Object)$edProduceUnit).hashCode());
        Long $edPlanClass = this.getEdPlanClass();
        result = result * 59 + ($edPlanClass == null ? 43 : ((Object)$edPlanClass).hashCode());
        Long $fiCostClass = this.getFiCostClass();
        result = result * 59 + ($fiCostClass == null ? 43 : ((Object)$fiCostClass).hashCode());
        Integer $fiValueManageType = this.getFiValueManageType();
        result = result * 59 + ($fiValueManageType == null ? 43 : ((Object)$fiValueManageType).hashCode());
        Integer $fiCostValuation = this.getFiCostValuation();
        result = result * 59 + ($fiCostValuation == null ? 43 : ((Object)$fiCostValuation).hashCode());
        Boolean $fiCheckByBatch = this.getFiCheckByBatch();
        result = result * 59 + ($fiCheckByBatch == null ? 43 : ((Object)$fiCheckByBatch).hashCode());
        Boolean $accountingByItem = this.getAccountingByItem();
        result = result * 59 + ($accountingByItem == null ? 43 : ((Object)$accountingByItem).hashCode());
        Integer $checkFree = this.getCheckFree();
        result = result * 59 + ($checkFree == null ? 43 : ((Object)$checkFree).hashCode());
        Long $fiPreferentialPolicyType = this.getFiPreferentialPolicyType();
        result = result * 59 + ($fiPreferentialPolicyType == null ? 43 : ((Object)$fiPreferentialPolicyType).hashCode());
        Integer $creatorType = this.getCreatorType();
        result = result * 59 + ($creatorType == null ? 43 : ((Object)$creatorType).hashCode());
        Integer $realProductAttributeTypeNew = this.getRealProductAttributeTypeNew();
        result = result * 59 + ($realProductAttributeTypeNew == null ? 43 : ((Object)$realProductAttributeTypeNew).hashCode());
        Integer $virtualProductAttributeNew = this.getVirtualProductAttributeNew();
        result = result * 59 + ($virtualProductAttributeNew == null ? 43 : ((Object)$virtualProductAttributeNew).hashCode());
        Integer $ptoPriceType = this.getPtoPriceType();
        result = result * 59 + ($ptoPriceType == null ? 43 : ((Object)$ptoPriceType).hashCode());
        Long $productTemplate = this.getProductTemplate();
        result = result * 59 + ($productTemplate == null ? 43 : ((Object)$productTemplate).hashCode());
        Boolean $productTemplateSkuDynamic = this.getProductTemplateSkuDynamic();
        result = result * 59 + ($productTemplateSkuDynamic == null ? 43 : ((Object)$productTemplateSkuDynamic).hashCode());
        Boolean $businessAttributePurchase = this.getBusinessAttributePurchase();
        result = result * 59 + ($businessAttributePurchase == null ? 43 : ((Object)$businessAttributePurchase).hashCode());
        Boolean $businessAttributeSelfCreate = this.getBusinessAttributeSelfCreate();
        result = result * 59 + ($businessAttributeSelfCreate == null ? 43 : ((Object)$businessAttributeSelfCreate).hashCode());
        Boolean $businessAttributeOutSourcing = this.getBusinessAttributeOutSourcing();
        result = result * 59 + ($businessAttributeOutSourcing == null ? 43 : ((Object)$businessAttributeOutSourcing).hashCode());
        Boolean $businessAttributeSale = this.getBusinessAttributeSale();
        result = result * 59 + ($businessAttributeSale == null ? 43 : ((Object)$businessAttributeSale).hashCode());
        Boolean $saleChannelOfOnlineBatch = this.getSaleChannelOfOnlineBatch();
        result = result * 59 + ($saleChannelOfOnlineBatch == null ? 43 : ((Object)$saleChannelOfOnlineBatch).hashCode());
        Boolean $saleChannelOfDistribution = this.getSaleChannelOfDistribution();
        result = result * 59 + ($saleChannelOfDistribution == null ? 43 : ((Object)$saleChannelOfDistribution).hashCode());
        Integer $enableSparePartsManagement = this.getEnableSparePartsManagement();
        result = result * 59 + ($enableSparePartsManagement == null ? 43 : ((Object)$enableSparePartsManagement).hashCode());
        Long $productTagId = this.getProductTagId();
        result = result * 59 + ($productTagId == null ? 43 : ((Object)$productTagId).hashCode());
        Boolean $isWeight = this.getIsWeight();
        result = result * 59 + ($isWeight == null ? 43 : ((Object)$isWeight).hashCode());
        Integer $productFamily = this.getProductFamily();
        result = result * 59 + ($productFamily == null ? 43 : ((Object)$productFamily).hashCode());
        Integer $salesAndOperations = this.getSalesAndOperations();
        result = result * 59 + ($salesAndOperations == null ? 43 : ((Object)$salesAndOperations).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Long $productVendor = this.getProductVendor();
        result = result * 59 + ($productVendor == null ? 43 : ((Object)$productVendor).hashCode());
        Boolean $medIsRegistrationManager = this.getMedIsRegistrationManager();
        result = result * 59 + ($medIsRegistrationManager == null ? 43 : ((Object)$medIsRegistrationManager).hashCode());
        Boolean $medIsAuthorizationManager = this.getMedIsAuthorizationManager();
        result = result * 59 + ($medIsAuthorizationManager == null ? 43 : ((Object)$medIsAuthorizationManager).hashCode());
        Integer $retailProcessType = this.getRetailProcessType();
        result = result * 59 + ($retailProcessType == null ? 43 : ((Object)$retailProcessType).hashCode());
        Integer $retailPriceDimension = this.getRetailPriceDimension();
        result = result * 59 + ($retailPriceDimension == null ? 43 : ((Object)$retailPriceDimension).hashCode());
        Boolean $material = this.getMaterial();
        result = result * 59 + ($material == null ? 43 : ((Object)$material).hashCode());
        Boolean $saleInOfflineStore = this.getSaleInOfflineStore();
        result = result * 59 + ($saleInOfflineStore == null ? 43 : ((Object)$saleInOfflineStore).hashCode());
        Boolean $offlineStoreOrder = this.getOfflineStoreOrder();
        result = result * 59 + ($offlineStoreOrder == null ? 43 : ((Object)$offlineStoreOrder).hashCode());
        Integer $isOptionalMaterial = this.getIsOptionalMaterial();
        result = result * 59 + ($isOptionalMaterial == null ? 43 : ((Object)$isOptionalMaterial).hashCode());
        Long $defaultSKUId = this.getDefaultSKUId();
        result = result * 59 + ($defaultSKUId == null ? 43 : ((Object)$defaultSKUId).hashCode());
        Long $productDetailId = this.getProductDetailId();
        result = result * 59 + ($productDetailId == null ? 43 : ((Object)$productDetailId).hashCode());
        Boolean $recommendedMaterials = this.getRecommendedMaterials();
        result = result * 59 + ($recommendedMaterials == null ? 43 : ((Object)$recommendedMaterials).hashCode());
        Boolean $isProcess = this.getIsProcess();
        result = result * 59 + ($isProcess == null ? 43 : ((Object)$isProcess).hashCode());
        Boolean $process = this.getProcess();
        result = result * 59 + ($process == null ? 43 : ((Object)$process).hashCode());
        Boolean $hasSpecs = this.getHasSpecs();
        result = result * 59 + ($hasSpecs == null ? 43 : ((Object)$hasSpecs).hashCode());
        Long $couponId = this.getCouponId();
        result = result * 59 + ($couponId == null ? 43 : ((Object)$couponId).hashCode());
        Integer $platFormStatus = this.getPlatFormStatus();
        result = result * 59 + ($platFormStatus == null ? 43 : ((Object)$platFormStatus).hashCode());
        Integer $couponType = this.getCouponType();
        result = result * 59 + ($couponType == null ? 43 : ((Object)$couponType).hashCode());
        Long $creatorCustomer = this.getCreatorCustomer();
        result = result * 59 + ($creatorCustomer == null ? 43 : ((Object)$creatorCustomer).hashCode());
        Integer $mtoStrategy = this.getMtoStrategy();
        result = result * 59 + ($mtoStrategy == null ? 43 : ((Object)$mtoStrategy).hashCode());
        Integer $strategyComparisonRule = this.getStrategyComparisonRule();
        result = result * 59 + ($strategyComparisonRule == null ? 43 : ((Object)$strategyComparisonRule).hashCode());
        Integer $fullSetInspection = this.getFullSetInspection();
        result = result * 59 + ($fullSetInspection == null ? 43 : ((Object)$fullSetInspection).hashCode());
        Integer $projectTrackStrategy = this.getProjectTrackStrategy();
        result = result * 59 + ($projectTrackStrategy == null ? 43 : ((Object)$projectTrackStrategy).hashCode());
        Integer $checkByProject = this.getCheckByProject();
        result = result * 59 + ($checkByProject == null ? 43 : ((Object)$checkByProject).hashCode());
        Integer $checkBySalesOrders = this.getCheckBySalesOrders();
        result = result * 59 + ($checkBySalesOrders == null ? 43 : ((Object)$checkBySalesOrders).hashCode());
        Integer $checkByClient = this.getCheckByClient();
        result = result * 59 + ($checkByClient == null ? 43 : ((Object)$checkByClient).hashCode());
        Integer $checkByOutsourcing = this.getCheckByOutsourcing();
        result = result * 59 + ($checkByOutsourcing == null ? 43 : ((Object)$checkByOutsourcing).hashCode());
        Long $billingUnit = this.getBillingUnit();
        result = result * 59 + ($billingUnit == null ? 43 : ((Object)$billingUnit).hashCode());
        Integer $sendInspection = this.getSendInspection();
        result = result * 59 + ($sendInspection == null ? 43 : ((Object)$sendInspection).hashCode());
        Integer $returnInspection = this.getReturnInspection();
        result = result * 59 + ($returnInspection == null ? 43 : ((Object)$returnInspection).hashCode());
        Integer $iBaseSaleCount = this.getIBaseSaleCount();
        result = result * 59 + ($iBaseSaleCount == null ? 43 : ((Object)$iBaseSaleCount).hashCode());
        Integer $iABCClass = this.getIABCClass();
        result = result * 59 + ($iABCClass == null ? 43 : ((Object)$iABCClass).hashCode());
        Integer $atpInspection = this.getAtpInspection();
        result = result * 59 + ($atpInspection == null ? 43 : ((Object)$atpInspection).hashCode());
        Integer $checkByRevenueManagement = this.getCheckByRevenueManagement();
        result = result * 59 + ($checkByRevenueManagement == null ? 43 : ((Object)$checkByRevenueManagement).hashCode());
        Integer $optionalType = this.getOptionalType();
        result = result * 59 + ($optionalType == null ? 43 : ((Object)$optionalType).hashCode());
        Integer $overSigning = this.getOverSigning();
        result = result * 59 + ($overSigning == null ? 43 : ((Object)$overSigning).hashCode());
        Integer $inspectionControlPoint = this.getInspectionControlPoint();
        result = result * 59 + ($inspectionControlPoint == null ? 43 : ((Object)$inspectionControlPoint).hashCode());
        Boolean $allowStorePurchase = this.getAllowStorePurchase();
        result = result * 59 + ($allowStorePurchase == null ? 43 : ((Object)$allowStorePurchase).hashCode());
        Boolean $isOfflineStoreOrder = this.getIsOfflineStoreOrder();
        result = result * 59 + ($isOfflineStoreOrder == null ? 43 : ((Object)$isOfflineStoreOrder).hashCode());
        Boolean $isOfflineStoreReturn = this.getIsOfflineStoreReturn();
        result = result * 59 + ($isOfflineStoreReturn == null ? 43 : ((Object)$isOfflineStoreReturn).hashCode());
        Boolean $isPriceChangeAllowed = this.getIsPriceChangeAllowed();
        result = result * 59 + ($isPriceChangeAllowed == null ? 43 : ((Object)$isPriceChangeAllowed).hashCode());
        Integer $productInspection = this.getProductInspection();
        result = result * 59 + ($productInspection == null ? 43 : ((Object)$productInspection).hashCode());
        Integer $productInspectionCtrlPoint = this.getProductInspectionCtrlPoint();
        result = result * 59 + ($productInspectionCtrlPoint == null ? 43 : ((Object)$productInspectionCtrlPoint).hashCode());
        Integer $outSourceInspection = this.getOutSourceInspection();
        result = result * 59 + ($outSourceInspection == null ? 43 : ((Object)$outSourceInspection).hashCode());
        Integer $outSourceInspectionCtrlPoint = this.getOutSourceInspectionCtrlPoint();
        result = result * 59 + ($outSourceInspectionCtrlPoint == null ? 43 : ((Object)$outSourceInspectionCtrlPoint).hashCode());
        Integer $transferInspection = this.getTransferInspection();
        result = result * 59 + ($transferInspection == null ? 43 : ((Object)$transferInspection).hashCode());
        Integer $transferInspectionCtrlPoint = this.getTransferInspectionCtrlPoint();
        result = result * 59 + ($transferInspectionCtrlPoint == null ? 43 : ((Object)$transferInspectionCtrlPoint).hashCode());
        Integer $productFirstInspection = this.getProductFirstInspection();
        result = result * 59 + ($productFirstInspection == null ? 43 : ((Object)$productFirstInspection).hashCode());
        Integer $firstInspectionCtrlMethod = this.getFirstInspectionCtrlMethod();
        result = result * 59 + ($firstInspectionCtrlMethod == null ? 43 : ((Object)$firstInspectionCtrlMethod).hashCode());
        Integer $sendInspectionCtrlPoint = this.getSendInspectionCtrlPoint();
        result = result * 59 + ($sendInspectionCtrlPoint == null ? 43 : ((Object)$sendInspectionCtrlPoint).hashCode());
        Integer $returnInspectionCtrlPoint = this.getReturnInspectionCtrlPoint();
        result = result * 59 + ($returnInspectionCtrlPoint == null ? 43 : ((Object)$returnInspectionCtrlPoint).hashCode());
        Boolean $mallOnlyOrder = this.getMallOnlyOrder();
        result = result * 59 + ($mallOnlyOrder == null ? 43 : ((Object)$mallOnlyOrder).hashCode());
        Boolean $mallIControlTime = this.getMallIControlTime();
        result = result * 59 + ($mallIControlTime == null ? 43 : ((Object)$mallIControlTime).hashCode());
        Integer $mallDepositDealPayType = this.getMallDepositDealPayType();
        result = result * 59 + ($mallDepositDealPayType == null ? 43 : ((Object)$mallDepositDealPayType).hashCode());
        Integer $mallCustomerServiceDay = this.getMallCustomerServiceDay();
        result = result * 59 + ($mallCustomerServiceDay == null ? 43 : ((Object)$mallCustomerServiceDay).hashCode());
        Boolean $mallIsAllArea = this.getMallIsAllArea();
        result = result * 59 + ($mallIsAllArea == null ? 43 : ((Object)$mallIsAllArea).hashCode());
        Long $mallDlyFeeRuleId = this.getMallDlyFeeRuleId();
        result = result * 59 + ($mallDlyFeeRuleId == null ? 43 : ((Object)$mallDlyFeeRuleId).hashCode());
        Boolean $mallEnableDeposit = this.getMallEnableDeposit();
        result = result * 59 + ($mallEnableDeposit == null ? 43 : ((Object)$mallEnableDeposit).hashCode());
        Integer $mallUpcount = this.getMallUpcount();
        result = result * 59 + ($mallUpcount == null ? 43 : ((Object)$mallUpcount).hashCode());
        Integer $mallDowncount = this.getMallDowncount();
        result = result * 59 + ($mallDowncount == null ? 43 : ((Object)$mallDowncount).hashCode());
        Boolean $mallEnableSubscribe = this.getMallEnableSubscribe();
        result = result * 59 + ($mallEnableSubscribe == null ? 43 : ((Object)$mallEnableSubscribe).hashCode());
        Integer $mallSalePoints = this.getMallSalePoints();
        result = result * 59 + ($mallSalePoints == null ? 43 : ((Object)$mallSalePoints).hashCode());
        Boolean $mallEnableCyclePurchase = this.getMallEnableCyclePurchase();
        result = result * 59 + ($mallEnableCyclePurchase == null ? 43 : ((Object)$mallEnableCyclePurchase).hashCode());
        Long $mallGiftCardId = this.getMallGiftCardId();
        result = result * 59 + ($mallGiftCardId == null ? 43 : ((Object)$mallGiftCardId).hashCode());
        Integer $turnoverMaterials = this.getTurnoverMaterials();
        result = result * 59 + ($turnoverMaterials == null ? 43 : ((Object)$turnoverMaterials).hashCode());
        Integer $amortizationMethod = this.getAmortizationMethod();
        result = result * 59 + ($amortizationMethod == null ? 43 : ((Object)$amortizationMethod).hashCode());
        Long $measurementUnit = this.getMeasurementUnit();
        result = result * 59 + ($measurementUnit == null ? 43 : ((Object)$measurementUnit).hashCode());
        Integer $measurementUnitPrecision = this.getMeasurementUnitPrecision();
        result = result * 59 + ($measurementUnitPrecision == null ? 43 : ((Object)$measurementUnitPrecision).hashCode());
        Integer $reviewCycle = this.getReviewCycle();
        result = result * 59 + ($reviewCycle == null ? 43 : ((Object)$reviewCycle).hashCode());
        Integer $effectiveLeadTime = this.getEffectiveLeadTime();
        result = result * 59 + ($effectiveLeadTime == null ? 43 : ((Object)$effectiveLeadTime).hashCode());
        Integer $balance = this.getBalance();
        result = result * 59 + ($balance == null ? 43 : ((Object)$balance).hashCode());
        String $createOrgId = this.getCreateOrgId();
        result = result * 59 + ($createOrgId == null ? 43 : $createOrgId.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $orgType = this.getOrgType();
        result = result * 59 + ($orgType == null ? 43 : $orgType.hashCode());
        String $orgIdCode = this.getOrgIdCode();
        result = result * 59 + ($orgIdCode == null ? 43 : $orgIdCode.hashCode());
        String $orgIdName = this.getOrgIdName();
        result = result * 59 + ($orgIdName == null ? 43 : $orgIdName.hashCode());
        MultiLangText $orgIdName_multLang = this.getOrgIdName_multLang();
        result = result * 59 + ($orgIdName_multLang == null ? 43 : $orgIdName_multLang.hashCode());
        String $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : $tenantId.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        MultiLangText $name_multiLang = this.getName_multiLang();
        result = result * 59 + ($name_multiLang == null ? 43 : $name_multiLang.hashCode());
        String $shortName = this.getShortName();
        result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $transType = this.getTransType();
        result = result * 59 + ($transType == null ? 43 : $transType.hashCode());
        String $transTypeName = this.getTransTypeName();
        result = result * 59 + ($transTypeName == null ? 43 : $transTypeName.hashCode());
        String $unitErpCode = this.getUnitErpCode();
        result = result * 59 + ($unitErpCode == null ? 43 : $unitErpCode.hashCode());
        BigDecimal $mainUnitCount = this.getMainUnitCount();
        result = result * 59 + ($mainUnitCount == null ? 43 : ((Object)$mainUnitCount).hashCode());
        String $unitCode = this.getUnitCode();
        result = result * 59 + ($unitCode == null ? 43 : $unitCode.hashCode());
        String $unitName = this.getUnitName();
        result = result * 59 + ($unitName == null ? 43 : $unitName.hashCode());
        MultiLangText $unitName_multLang = this.getUnitName_multLang();
        result = result * 59 + ($unitName_multLang == null ? 43 : $unitName_multLang.hashCode());
        String $productPropCharacterDefine = this.getProductPropCharacterDefine();
        result = result * 59 + ($productPropCharacterDefine == null ? 43 : $productPropCharacterDefine.hashCode());
        HashMap<String, Object> $productPropCharacterDefineMap = this.getProductPropCharacterDefineMap();
        result = result * 59 + ($productPropCharacterDefineMap == null ? 43 : ((Object)$productPropCharacterDefineMap).hashCode());
        HashMap<String, Object> $productCharacterDef = this.getProductCharacterDef();
        result = result * 59 + ($productCharacterDef == null ? 43 : ((Object)$productCharacterDef).hashCode());
        HashMap<String, Object> $productExtendCharacterDef = this.getProductExtendCharacterDef();
        result = result * 59 + ($productExtendCharacterDef == null ? 43 : ((Object)$productExtendCharacterDef).hashCode());
        BigDecimal $unitConvertCoefficient = this.getUnitConvertCoefficient();
        result = result * 59 + ($unitConvertCoefficient == null ? 43 : ((Object)$unitConvertCoefficient).hashCode());
        String $modelDescription = this.getModelDescription();
        result = result * 59 + ($modelDescription == null ? 43 : $modelDescription.hashCode());
        String $model = this.getModel();
        result = result * 59 + ($model == null ? 43 : $model.hashCode());
        MultiLangText $model_multiLang = this.getModel_multiLang();
        result = result * 59 + ($model_multiLang == null ? 43 : $model_multiLang.hashCode());
        String $manageClassPath = this.getManageClassPath();
        result = result * 59 + ($manageClassPath == null ? 43 : $manageClassPath.hashCode());
        String $manageClassCode = this.getManageClassCode();
        result = result * 59 + ($manageClassCode == null ? 43 : $manageClassCode.hashCode());
        String $manageClassName = this.getManageClassName();
        result = result * 59 + ($manageClassName == null ? 43 : $manageClassName.hashCode());
        MultiLangText $manageClassName_multiLang = this.getManageClassName_multiLang();
        result = result * 59 + ($manageClassName_multiLang == null ? 43 : $manageClassName_multiLang.hashCode());
        String $purchaseClassCode = this.getPurchaseClassCode();
        result = result * 59 + ($purchaseClassCode == null ? 43 : $purchaseClassCode.hashCode());
        String $purchaseClassName = this.getPurchaseClassName();
        result = result * 59 + ($purchaseClassName == null ? 43 : $purchaseClassName.hashCode());
        String $costClassCode = this.getCostClassCode();
        result = result * 59 + ($costClassCode == null ? 43 : $costClassCode.hashCode());
        String $costClassName = this.getCostClassName();
        result = result * 59 + ($costClassName == null ? 43 : $costClassName.hashCode());
        MultiLangText $costClassName_multiLang = this.getCostClassName_multiLang();
        result = result * 59 + ($costClassName_multiLang == null ? 43 : $costClassName_multiLang.hashCode());
        String $brandCode = this.getBrandCode();
        result = result * 59 + ($brandCode == null ? 43 : $brandCode.hashCode());
        String $brandName = this.getBrandName();
        result = result * 59 + ($brandName == null ? 43 : $brandName.hashCode());
        MultiLangText $brandName_multiLang = this.getBrandName_multiLang();
        result = result * 59 + ($brandName_multiLang == null ? 43 : $brandName_multiLang.hashCode());
        String $platformCode = this.getPlatformCode();
        result = result * 59 + ($platformCode == null ? 43 : $platformCode.hashCode());
        String $placeOfOrigin = this.getPlaceOfOrigin();
        result = result * 59 + ($placeOfOrigin == null ? 43 : $placeOfOrigin.hashCode());
        String $productLineCode = this.getProductLineCode();
        result = result * 59 + ($productLineCode == null ? 43 : $productLineCode.hashCode());
        String $productLineName = this.getProductLineName();
        result = result * 59 + ($productLineName == null ? 43 : $productLineName.hashCode());
        MultiLangText $productLineName_multiLang = this.getProductLineName_multiLang();
        result = result * 59 + ($productLineName_multiLang == null ? 43 : $productLineName_multiLang.hashCode());
        BigDecimal $length = this.getLength();
        result = result * 59 + ($length == null ? 43 : ((Object)$length).hashCode());
        BigDecimal $height = this.getHeight();
        result = result * 59 + ($height == null ? 43 : ((Object)$height).hashCode());
        BigDecimal $width = this.getWidth();
        result = result * 59 + ($width == null ? 43 : ((Object)$width).hashCode());
        BigDecimal $weight = this.getWeight();
        result = result * 59 + ($weight == null ? 43 : ((Object)$weight).hashCode());
        BigDecimal $netWeight = this.getNetWeight();
        result = result * 59 + ($netWeight == null ? 43 : ((Object)$netWeight).hashCode());
        BigDecimal $volume = this.getVolume();
        result = result * 59 + ($volume == null ? 43 : ((Object)$volume).hashCode());
        String $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : $barCode.hashCode());
        List<String> $productBarCodes = this.getProductBarCodes();
        result = result * 59 + ($productBarCodes == null ? 43 : ((Object)$productBarCodes).hashCode());
        String $displayName = this.getDisplayName();
        result = result * 59 + ($displayName == null ? 43 : $displayName.hashCode());
        String $erpOuterCode = this.getErpOuterCode();
        result = result * 59 + ($erpOuterCode == null ? 43 : $erpOuterCode.hashCode());
        String $manufacturer = this.getManufacturer();
        result = result * 59 + ($manufacturer == null ? 43 : $manufacturer.hashCode());
        String $mktPriceAreaMessage = this.getMktPriceAreaMessage();
        result = result * 59 + ($mktPriceAreaMessage == null ? 43 : $mktPriceAreaMessage.hashCode());
        BigDecimal $mktBatchPrice = this.getMktBatchPrice();
        result = result * 59 + ($mktBatchPrice == null ? 43 : ((Object)$mktBatchPrice).hashCode());
        String $mktBatchUnitName = this.getMktBatchUnitName();
        result = result * 59 + ($mktBatchUnitName == null ? 43 : $mktBatchUnitName.hashCode());
        String $mktBatchUnitCode = this.getMktBatchUnitCode();
        result = result * 59 + ($mktBatchUnitCode == null ? 43 : $mktBatchUnitCode.hashCode());
        BigDecimal $mktMarkPrice = this.getMktMarkPrice();
        result = result * 59 + ($mktMarkPrice == null ? 43 : ((Object)$mktMarkPrice).hashCode());
        BigDecimal $mktSalePrice = this.getMktSalePrice();
        result = result * 59 + ($mktSalePrice == null ? 43 : ((Object)$mktSalePrice).hashCode());
        BigDecimal $mktMarketPrice = this.getMktMarketPrice();
        result = result * 59 + ($mktMarketPrice == null ? 43 : ((Object)$mktMarketPrice).hashCode());
        BigDecimal $upuMaxPrimeCosts = this.getUpuMaxPrimeCosts();
        result = result * 59 + ($upuMaxPrimeCosts == null ? 43 : ((Object)$upuMaxPrimeCosts).hashCode());
        BigDecimal $upuPrimeCosts = this.getUpuPrimeCosts();
        result = result * 59 + ($upuPrimeCosts == null ? 43 : ((Object)$upuPrimeCosts).hashCode());
        BigDecimal $upuRequestOrderLimit = this.getUpuRequestOrderLimit();
        result = result * 59 + ($upuRequestOrderLimit == null ? 43 : ((Object)$upuRequestOrderLimit).hashCode());
        BigDecimal $upuArrivalAllowErrorLimit = this.getUpuArrivalAllowErrorLimit();
        result = result * 59 + ($upuArrivalAllowErrorLimit == null ? 43 : ((Object)$upuArrivalAllowErrorLimit).hashCode());
        BigDecimal $upuInvoiceAllowErrorLimit = this.getUpuInvoiceAllowErrorLimit();
        result = result * 59 + ($upuInvoiceAllowErrorLimit == null ? 43 : ((Object)$upuInvoiceAllowErrorLimit).hashCode());
        String $upuPurchaseUnitName = this.getUpuPurchaseUnitName();
        result = result * 59 + ($upuPurchaseUnitName == null ? 43 : $upuPurchaseUnitName.hashCode());
        String $upuPurchaseUnitCode = this.getUpuPurchaseUnitCode();
        result = result * 59 + ($upuPurchaseUnitCode == null ? 43 : $upuPurchaseUnitCode.hashCode());
        String $upuPurchasePriceUnitName = this.getUpuPurchasePriceUnitName();
        result = result * 59 + ($upuPurchasePriceUnitName == null ? 43 : $upuPurchasePriceUnitName.hashCode());
        String $upuPurchasePriceUnitCode = this.getUpuPurchasePriceUnitCode();
        result = result * 59 + ($upuPurchasePriceUnitCode == null ? 43 : $upuPurchasePriceUnitCode.hashCode());
        BigDecimal $upuPurchaseTimes = this.getUpuPurchaseTimes();
        result = result * 59 + ($upuPurchaseTimes == null ? 43 : ((Object)$upuPurchaseTimes).hashCode());
        BigDecimal $upuPurchaseOrderQuantity = this.getUpuPurchaseOrderQuantity();
        result = result * 59 + ($upuPurchaseOrderQuantity == null ? 43 : ((Object)$upuPurchaseOrderQuantity).hashCode());
        BigDecimal $saleMinOrderQuantity = this.getSaleMinOrderQuantity();
        result = result * 59 + ($saleMinOrderQuantity == null ? 43 : ((Object)$saleMinOrderQuantity).hashCode());
        BigDecimal bigDecimal = this.getSaleDoubleSale();
        result = result * 59 + ($saleDoubleSale == null ? 43 : $saleDoubleSale.hashCode());
        String string = this.getSaleChannel();
        result = result * 59 + ($saleChannel == null ? 43 : $saleChannel.hashCode());
        String string2 = this.getSaleProductClassCode();
        result = result * 59 + ($saleProductClassCode == null ? 43 : $saleProductClassCode.hashCode());
        String string3 = this.getSaleProductClassName();
        result = result * 59 + ($saleProductClassName == null ? 43 : $saleProductClassName.hashCode());
        String string4 = this.getSaleProductClassPath();
        result = result * 59 + ($saleProductClassPath == null ? 43 : $saleProductClassPath.hashCode());
        String string5 = this.getStockOmsWarehouse();
        result = result * 59 + ($stockOmsWarehouse == null ? 43 : $stockOmsWarehouse.hashCode());
        String string6 = this.getStockExpiryDateCalculationMethod();
        result = result * 59 + ($stockExpiryDateCalculationMethod == null ? 43 : $stockExpiryDateCalculationMethod.hashCode());
        String string7 = this.getStockExpireDateNo();
        result = result * 59 + ($stockExpireDateNo == null ? 43 : $stockExpireDateNo.hashCode());
        String string8 = this.getStockExpireDateUnit();
        result = result * 59 + ($stockExpireDateUnit == null ? 43 : $stockExpireDateUnit.hashCode());
        String string9 = this.getStockDaysBeforeValidityReject();
        result = result * 59 + ($stockDaysBeforeValidityReject == null ? 43 : $stockDaysBeforeValidityReject.hashCode());
        String string10 = this.getStockValidityWarningDays();
        result = result * 59 + ($stockValidityWarningDays == null ? 43 : $stockValidityWarningDays.hashCode());
        BigDecimal bigDecimal2 = this.getStockSafetyStock();
        result = result * 59 + ($stockSafetyStock == null ? 43 : $stockSafetyStock.hashCode());
        BigDecimal bigDecimal3 = this.getStockHighestStock();
        result = result * 59 + ($stockHighestStock == null ? 43 : $stockHighestStock.hashCode());
        BigDecimal bigDecimal4 = this.getStockLowestStock();
        result = result * 59 + ($stockLowestStock == null ? 43 : $stockLowestStock.hashCode());
        BigDecimal bigDecimal5 = this.getStockRopStock();
        result = result * 59 + ($stockRopStock == null ? 43 : $stockRopStock.hashCode());
        String string11 = this.getStockDeliveryWarehouseName();
        result = result * 59 + ($stockDeliveryWarehouseName == null ? 43 : $stockDeliveryWarehouseName.hashCode());
        String string12 = this.getStockReturnWarehouseName();
        result = result * 59 + ($stockReturnWarehouseName == null ? 43 : $stockReturnWarehouseName.hashCode());
        String string13 = this.getStockReceiptWarehouseName();
        result = result * 59 + ($stockReceiptWarehouseName == null ? 43 : $stockReceiptWarehouseName.hashCode());
        BigDecimal bigDecimal6 = this.getStockInStoreExcessLimit();
        result = result * 59 + ($stockInStoreExcessLimit == null ? 43 : $stockInStoreExcessLimit.hashCode());
        BigDecimal bigDecimal7 = this.getStockOutStoreExcessLimit();
        result = result * 59 + ($stockOutStoreExcessLimit == null ? 43 : $stockOutStoreExcessLimit.hashCode());
        BigDecimal bigDecimal8 = this.getStockInStoreLessLimit();
        result = result * 59 + ($stockInStoreLessLimit == null ? 43 : $stockInStoreLessLimit.hashCode());
        BigDecimal bigDecimal9 = this.getStockOutStoreLessLimit();
        result = result * 59 + ($stockOutStoreLessLimit == null ? 43 : $stockOutStoreLessLimit.hashCode());
        BigDecimal bigDecimal10 = this.getStockStorageLossRate();
        result = result * 59 + ($stockStorageLossRate == null ? 43 : $stockStorageLossRate.hashCode());
        String string14 = this.getStockStockUnitCode();
        result = result * 59 + ($stockStockUnitCode == null ? 43 : $stockStockUnitCode.hashCode());
        String string15 = this.getStockStockUnitName();
        result = result * 59 + ($stockStockUnitName == null ? 43 : $stockStockUnitName.hashCode());
        String string16 = this.getDemandPlanningUnitCode();
        result = result * 59 + ($demandPlanningUnitCode == null ? 43 : $demandPlanningUnitCode.hashCode());
        String string17 = this.getDemandPlanningUnitName();
        result = result * 59 + ($demandPlanningUnitName == null ? 43 : $demandPlanningUnitName.hashCode());
        String string18 = this.getEdProduceDepartmentNew();
        result = result * 59 + ($edProduceDepartmentNew == null ? 43 : $edProduceDepartmentNew.hashCode());
        String string19 = this.getEdWeigh();
        result = result * 59 + ($edWeigh == null ? 43 : $edWeigh.hashCode());
        String string20 = this.getEdEngineeringDrawingNo();
        result = result * 59 + ($edEngineeringDrawingNo == null ? 43 : $edEngineeringDrawingNo.hashCode());
        String string21 = this.getEdECNControl();
        result = result * 59 + ($edECNControl == null ? 43 : $edECNControl.hashCode());
        String string22 = this.getEdPlanDefaultAttribute();
        result = result * 59 + ($edPlanDefaultAttribute == null ? 43 : $edPlanDefaultAttribute.hashCode());
        String string23 = this.getEdPlanMethod();
        result = result * 59 + ($edPlanMethod == null ? 43 : $edPlanMethod.hashCode());
        String string24 = this.getEdManufacturePlanner();
        result = result * 59 + ($edManufacturePlanner == null ? 43 : $edManufacturePlanner.hashCode());
        BigDecimal bigDecimal11 = this.getEdPlanProduceLimit();
        result = result * 59 + ($edPlanProduceLimit == null ? 43 : $edPlanProduceLimit.hashCode());
        String string25 = this.getEdKeySubPart();
        result = result * 59 + ($edKeySubPart == null ? 43 : $edKeySubPart.hashCode());
        String string26 = this.getEdBOMType();
        result = result * 59 + ($edBOMType == null ? 43 : $edBOMType.hashCode());
        String string27 = this.getEdBOMSource();
        result = result * 59 + ($edBOMSource == null ? 43 : $edBOMSource.hashCode());
        String string28 = this.getEdBatchRule();
        result = result * 59 + ($edBatchRule == null ? 43 : $edBatchRule.hashCode());
        BigDecimal bigDecimal12 = this.getEdEconomicQuantity();
        result = result * 59 + ($edEconomicQuantity == null ? 43 : $edEconomicQuantity.hashCode());
        BigDecimal bigDecimal13 = this.getEdFixedQuantity();
        result = result * 59 + ($edFixedQuantity == null ? 43 : $edFixedQuantity.hashCode());
        BigDecimal bigDecimal14 = this.getEdBatchDouble();
        result = result * 59 + ($edBatchDouble == null ? 43 : $edBatchDouble.hashCode());
        BigDecimal bigDecimal15 = this.getEdLeadTimeCoefficient();
        result = result * 59 + ($edLeadTimeCoefficient == null ? 43 : $edLeadTimeCoefficient.hashCode());
        BigDecimal bigDecimal16 = this.getEdLeadTimeQuantity();
        result = result * 59 + ($edLeadTimeQuantity == null ? 43 : $edLeadTimeQuantity.hashCode());
        String string29 = this.getEdFixedWastage();
        result = result * 59 + ($edFixedWastage == null ? 43 : $edFixedWastage.hashCode());
        BigDecimal bigDecimal17 = this.getEdRejectRate();
        result = result * 59 + ($edRejectRate == null ? 43 : $edRejectRate.hashCode());
        BigDecimal bigDecimal18 = this.getWastageRate();
        result = result * 59 + ($wastageRate == null ? 43 : $wastageRate.hashCode());
        String string30 = this.getEdProduceUnitCode();
        result = result * 59 + ($edProduceUnitCode == null ? 43 : $edProduceUnitCode.hashCode());
        String string31 = this.getEdProduceUnitName();
        result = result * 59 + ($edProduceUnitName == null ? 43 : $edProduceUnitName.hashCode());
        String string32 = this.getEdProduceUnitPercision();
        result = result * 59 + ($edProduceUnitPercision == null ? 43 : $edProduceUnitPercision.hashCode());
        String string33 = this.getEdPlanClassName();
        result = result * 59 + ($edPlanClassName == null ? 43 : $edPlanClassName.hashCode());
        BigDecimal bigDecimal19 = this.getFiNoTaxCostPrice();
        result = result * 59 + ($fiNoTaxCostPrice == null ? 43 : $fiNoTaxCostPrice.hashCode());
        String string34 = this.getTaxClass();
        result = result * 59 + ($taxClass == null ? 43 : $taxClass.hashCode());
        String string35 = this.getTaxClassCode();
        result = result * 59 + ($taxClassCode == null ? 43 : $taxClassCode.hashCode());
        String string36 = this.getTaxClassName();
        result = result * 59 + ($taxClassName == null ? 43 : $taxClassName.hashCode());
        String string37 = this.getTaxClassSimpleName();
        result = result * 59 + ($taxClassSimpleName == null ? 43 : $taxClassSimpleName.hashCode());
        String string38 = this.getFiReceiptName();
        result = result * 59 + ($fiReceiptName == null ? 43 : $fiReceiptName.hashCode());
        String string39 = this.getFiInTaxrate();
        result = result * 59 + ($fiInTaxrate == null ? 43 : $fiInTaxrate.hashCode());
        String string40 = this.getNoTaxation();
        result = result * 59 + ($noTaxation == null ? 43 : $noTaxation.hashCode());
        String string41 = this.getFiOutTaxrate();
        result = result * 59 + ($fiOutTaxrate == null ? 43 : $fiOutTaxrate.hashCode());
        String string42 = this.getFiPreferentialPolicyTypeName();
        result = result * 59 + ($fiPreferentialPolicyTypeName == null ? 43 : $fiPreferentialPolicyTypeName.hashCode());
        String string43 = this.getReceiptSpec();
        result = result * 59 + ($receiptSpec == null ? 43 : $receiptSpec.hashCode());
        String string44 = this.getReceiptModel();
        result = result * 59 + ($receiptModel == null ? 43 : $receiptModel.hashCode());
        String string45 = this.getRealProductAttribute();
        result = result * 59 + ($realProductAttribute == null ? 43 : $realProductAttribute.hashCode());
        String string46 = this.getRealProductAttributeType();
        result = result * 59 + ($realProductAttributeType == null ? 43 : $realProductAttributeType.hashCode());
        String string47 = this.getVirtualProductAttribute();
        result = result * 59 + ($virtualProductAttribute == null ? 43 : $virtualProductAttribute.hashCode());
        String string48 = this.getBusinessAttribute();
        result = result * 59 + ($businessAttribute == null ? 43 : $businessAttribute.hashCode());
        String string49 = this.getProductTemplateName();
        result = result * 59 + ($productTemplateName == null ? 43 : $productTemplateName.hashCode());
        String string50 = this.getDepositPayType();
        result = result * 59 + ($depositPayType == null ? 43 : $depositPayType.hashCode());
        String string51 = this.getMinimumDeposits();
        result = result * 59 + ($minimumDeposits == null ? 43 : $minimumDeposits.hashCode());
        String string52 = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String string53 = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : $mnemonicCode.hashCode());
        String string54 = this.getProductVendorName();
        result = result * 59 + ($productVendorName == null ? 43 : $productVendorName.hashCode());
        String string55 = this.getProductBuyer();
        result = result * 59 + ($productBuyer == null ? 43 : $productBuyer.hashCode());
        String string56 = this.getProductBuyerName();
        result = result * 59 + ($productBuyerName == null ? 43 : $productBuyerName.hashCode());
        String string57 = this.getWarehouseManager();
        result = result * 59 + ($warehouseManager == null ? 43 : $warehouseManager.hashCode());
        String string58 = this.getWarehouseManagerName();
        result = result * 59 + ($warehouseManagerName == null ? 43 : $warehouseManagerName.hashCode());
        String string59 = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        String string60 = this.getMobileDescription();
        result = result * 59 + ($mobileDescription == null ? 43 : $mobileDescription.hashCode());
        String string61 = this.getMedSunshinePurchaseNo();
        result = result * 59 + ($medSunshinePurchaseNo == null ? 43 : $medSunshinePurchaseNo.hashCode());
        String string62 = this.getMedRegistrationNo();
        result = result * 59 + ($medRegistrationNo == null ? 43 : $medRegistrationNo.hashCode());
        String string63 = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        String string64 = this.getTitleMemo();
        result = result * 59 + ($titleMemo == null ? 43 : $titleMemo.hashCode());
        BigDecimal bigDecimal20 = this.getInventoryCount();
        result = result * 59 + ($inventoryCount == null ? 43 : $inventoryCount.hashCode());
        String string65 = this.getManufacturingStrategy();
        result = result * 59 + ($manufacturingStrategy == null ? 43 : $manufacturingStrategy.hashCode());
        List<ProductAlbumVO> list = this.getProductAlbums();
        result = result * 59 + ($productAlbums == null ? 43 : $productAlbums.hashCode());
        List<ProductAttachmentVO> list2 = this.getProductAttachments();
        result = result * 59 + ($productAttachments == null ? 43 : $productAttachments.hashCode());
        List<ProductParameterExtendVO> list3 = this.getProductParams();
        result = result * 59 + ($productParams == null ? 43 : $productParams.hashCode());
        List<ProductSpecItemDTO> list4 = this.getProductSpecItems();
        result = result * 59 + ($productSpecItems == null ? 43 : $productSpecItems.hashCode());
        String string66 = this.getProductDefine1();
        result = result * 59 + ($productDefine1 == null ? 43 : $productDefine1.hashCode());
        String string67 = this.getProductDefine2();
        result = result * 59 + ($productDefine2 == null ? 43 : $productDefine2.hashCode());
        String string68 = this.getProductDefine3();
        result = result * 59 + ($productDefine3 == null ? 43 : $productDefine3.hashCode());
        String string69 = this.getProductDefine4();
        result = result * 59 + ($productDefine4 == null ? 43 : $productDefine4.hashCode());
        String string70 = this.getProductDefine5();
        result = result * 59 + ($productDefine5 == null ? 43 : $productDefine5.hashCode());
        String string71 = this.getProductDefine6();
        result = result * 59 + ($productDefine6 == null ? 43 : $productDefine6.hashCode());
        String string72 = this.getProductDefine7();
        result = result * 59 + ($productDefine7 == null ? 43 : $productDefine7.hashCode());
        String string73 = this.getProductDefine8();
        result = result * 59 + ($productDefine8 == null ? 43 : $productDefine8.hashCode());
        String string74 = this.getProductDefine9();
        result = result * 59 + ($productDefine9 == null ? 43 : $productDefine9.hashCode());
        String string75 = this.getProductDefine10();
        result = result * 59 + ($productDefine10 == null ? 43 : $productDefine10.hashCode());
        String string76 = this.getProductDefine11();
        result = result * 59 + ($productDefine11 == null ? 43 : $productDefine11.hashCode());
        String string77 = this.getProductDefine12();
        result = result * 59 + ($productDefine12 == null ? 43 : $productDefine12.hashCode());
        String string78 = this.getProductDefine13();
        result = result * 59 + ($productDefine13 == null ? 43 : $productDefine13.hashCode());
        String string79 = this.getProductDefine14();
        result = result * 59 + ($productDefine14 == null ? 43 : $productDefine14.hashCode());
        String string80 = this.getProductDefine15();
        result = result * 59 + ($productDefine15 == null ? 43 : $productDefine15.hashCode());
        String string81 = this.getProductDefine16();
        result = result * 59 + ($productDefine16 == null ? 43 : $productDefine16.hashCode());
        String string82 = this.getProductDefine17();
        result = result * 59 + ($productDefine17 == null ? 43 : $productDefine17.hashCode());
        String string83 = this.getProductDefine18();
        result = result * 59 + ($productDefine18 == null ? 43 : $productDefine18.hashCode());
        String string84 = this.getProductDefine19();
        result = result * 59 + ($productDefine19 == null ? 43 : $productDefine19.hashCode());
        String string85 = this.getProductDefine20();
        result = result * 59 + ($productDefine20 == null ? 43 : $productDefine20.hashCode());
        String string86 = this.getProductDefine21();
        result = result * 59 + ($productDefine21 == null ? 43 : $productDefine21.hashCode());
        String string87 = this.getProductDefine22();
        result = result * 59 + ($productDefine22 == null ? 43 : $productDefine22.hashCode());
        String string88 = this.getProductDefine23();
        result = result * 59 + ($productDefine23 == null ? 43 : $productDefine23.hashCode());
        String string89 = this.getProductDefine24();
        result = result * 59 + ($productDefine24 == null ? 43 : $productDefine24.hashCode());
        String string90 = this.getProductDefine25();
        result = result * 59 + ($productDefine25 == null ? 43 : $productDefine25.hashCode());
        String string91 = this.getProductDefine26();
        result = result * 59 + ($productDefine26 == null ? 43 : $productDefine26.hashCode());
        String string92 = this.getProductDefine27();
        result = result * 59 + ($productDefine27 == null ? 43 : $productDefine27.hashCode());
        String string93 = this.getProductDefine28();
        result = result * 59 + ($productDefine28 == null ? 43 : $productDefine28.hashCode());
        String string94 = this.getProductDefine29();
        result = result * 59 + ($productDefine29 == null ? 43 : $productDefine29.hashCode());
        String string95 = this.getProductDefine30();
        result = result * 59 + ($productDefine30 == null ? 43 : $productDefine30.hashCode());
        String string96 = this.getProductFreeDefine1();
        result = result * 59 + ($productFreeDefine1 == null ? 43 : $productFreeDefine1.hashCode());
        String string97 = this.getProductFreeDefine2();
        result = result * 59 + ($productFreeDefine2 == null ? 43 : $productFreeDefine2.hashCode());
        String string98 = this.getProductFreeDefine3();
        result = result * 59 + ($productFreeDefine3 == null ? 43 : $productFreeDefine3.hashCode());
        String string99 = this.getProductFreeDefine4();
        result = result * 59 + ($productFreeDefine4 == null ? 43 : $productFreeDefine4.hashCode());
        String string100 = this.getProductFreeDefine5();
        result = result * 59 + ($productFreeDefine5 == null ? 43 : $productFreeDefine5.hashCode());
        String string101 = this.getProductFreeDefine6();
        result = result * 59 + ($productFreeDefine6 == null ? 43 : $productFreeDefine6.hashCode());
        String string102 = this.getProductFreeDefine7();
        result = result * 59 + ($productFreeDefine7 == null ? 43 : $productFreeDefine7.hashCode());
        String string103 = this.getProductFreeDefine8();
        result = result * 59 + ($productFreeDefine8 == null ? 43 : $productFreeDefine8.hashCode());
        String string104 = this.getProductFreeDefine9();
        result = result * 59 + ($productFreeDefine9 == null ? 43 : $productFreeDefine9.hashCode());
        String string105 = this.getProductFreeDefine10();
        result = result * 59 + ($productFreeDefine10 == null ? 43 : $productFreeDefine10.hashCode());
        String string106 = this.getProductFreeDefine11();
        result = result * 59 + ($productFreeDefine11 == null ? 43 : $productFreeDefine11.hashCode());
        String string107 = this.getProductFreeDefine12();
        result = result * 59 + ($productFreeDefine12 == null ? 43 : $productFreeDefine12.hashCode());
        String string108 = this.getProductFreeDefine13();
        result = result * 59 + ($productFreeDefine13 == null ? 43 : $productFreeDefine13.hashCode());
        String string109 = this.getProductFreeDefine14();
        result = result * 59 + ($productFreeDefine14 == null ? 43 : $productFreeDefine14.hashCode());
        String string110 = this.getProductFreeDefine15();
        result = result * 59 + ($productFreeDefine15 == null ? 43 : $productFreeDefine15.hashCode());
        String string111 = this.getProductFreeDefine16();
        result = result * 59 + ($productFreeDefine16 == null ? 43 : $productFreeDefine16.hashCode());
        String string112 = this.getProductFreeDefine17();
        result = result * 59 + ($productFreeDefine17 == null ? 43 : $productFreeDefine17.hashCode());
        String string113 = this.getProductFreeDefine18();
        result = result * 59 + ($productFreeDefine18 == null ? 43 : $productFreeDefine18.hashCode());
        String string114 = this.getProductFreeDefine19();
        result = result * 59 + ($productFreeDefine19 == null ? 43 : $productFreeDefine19.hashCode());
        String string115 = this.getProductFreeDefine20();
        result = result * 59 + ($productFreeDefine20 == null ? 43 : $productFreeDefine20.hashCode());
        String string116 = this.getProductFreeDefine21();
        result = result * 59 + ($productFreeDefine21 == null ? 43 : $productFreeDefine21.hashCode());
        String string117 = this.getProductFreeDefine22();
        result = result * 59 + ($productFreeDefine22 == null ? 43 : $productFreeDefine22.hashCode());
        String string118 = this.getProductFreeDefine23();
        result = result * 59 + ($productFreeDefine23 == null ? 43 : $productFreeDefine23.hashCode());
        String string119 = this.getProductFreeDefine24();
        result = result * 59 + ($productFreeDefine24 == null ? 43 : $productFreeDefine24.hashCode());
        String string120 = this.getProductFreeDefine25();
        result = result * 59 + ($productFreeDefine25 == null ? 43 : $productFreeDefine25.hashCode());
        String string121 = this.getProductFreeDefine26();
        result = result * 59 + ($productFreeDefine26 == null ? 43 : $productFreeDefine26.hashCode());
        String string122 = this.getProductFreeDefine27();
        result = result * 59 + ($productFreeDefine27 == null ? 43 : $productFreeDefine27.hashCode());
        String string123 = this.getProductFreeDefine28();
        result = result * 59 + ($productFreeDefine28 == null ? 43 : $productFreeDefine28.hashCode());
        String string124 = this.getProductFreeDefine29();
        result = result * 59 + ($productFreeDefine29 == null ? 43 : $productFreeDefine29.hashCode());
        String string125 = this.getProductFreeDefine30();
        result = result * 59 + ($productFreeDefine30 == null ? 43 : $productFreeDefine30.hashCode());
        String string126 = this.getFree1();
        result = result * 59 + ($free1 == null ? 43 : $free1.hashCode());
        String string127 = this.getFree2();
        result = result * 59 + ($free2 == null ? 43 : $free2.hashCode());
        String string128 = this.getFree3();
        result = result * 59 + ($free3 == null ? 43 : $free3.hashCode());
        String string129 = this.getFree4();
        result = result * 59 + ($free4 == null ? 43 : $free4.hashCode());
        String string130 = this.getFree5();
        result = result * 59 + ($free5 == null ? 43 : $free5.hashCode());
        String string131 = this.getFree6();
        result = result * 59 + ($free6 == null ? 43 : $free6.hashCode());
        String string132 = this.getFree7();
        result = result * 59 + ($free7 == null ? 43 : $free7.hashCode());
        String string133 = this.getFree8();
        result = result * 59 + ($free8 == null ? 43 : $free8.hashCode());
        String string134 = this.getFree9();
        result = result * 59 + ($free9 == null ? 43 : $free9.hashCode());
        String string135 = this.getFree10();
        result = result * 59 + ($free10 == null ? 43 : $free10.hashCode());
        String string136 = this.getMaterialStatus();
        result = result * 59 + ($materialStatus == null ? 43 : $materialStatus.hashCode());
        String string137 = this.getOrgMaterialStatus();
        result = result * 59 + ($orgMaterialStatus == null ? 43 : $orgMaterialStatus.hashCode());
        List<CharacterDTO> list5 = this.getCharacterDTOList();
        result = result * 59 + ($characterDTOList == null ? 43 : $characterDTOList.hashCode());
        String string138 = this.getHomepageBusinessId();
        result = result * 59 + ($homepageBusinessId == null ? 43 : $homepageBusinessId.hashCode());
        String string139 = this.getImgBusinessId();
        result = result * 59 + ($imgBusinessId == null ? 43 : $imgBusinessId.hashCode());
        String string140 = this.getVideoBusinessId();
        result = result * 59 + ($videoBusinessId == null ? 43 : $videoBusinessId.hashCode());
        String string141 = this.getAttachments();
        result = result * 59 + ($attachments == null ? 43 : $attachments.hashCode());
        String string142 = this.getCostItems();
        result = result * 59 + ($costItems == null ? 43 : $costItems.hashCode());
        String string143 = this.getCostItemsCode();
        result = result * 59 + ($costItemsCode == null ? 43 : $costItemsCode.hashCode());
        String string144 = this.getCostItemsName();
        result = result * 59 + ($costItemsName == null ? 43 : $costItemsName.hashCode());
        String string145 = this.getBillingUnitCode();
        result = result * 59 + ($billingUnitCode == null ? 43 : $billingUnitCode.hashCode());
        String string146 = this.getBillingUnitName();
        result = result * 59 + ($billingUnitName == null ? 43 : $billingUnitName.hashCode());
        BigDecimal bigDecimal21 = this.getDoublePick();
        result = result * 59 + ($doublePick == null ? 43 : $doublePick.hashCode());
        Map<String, Object> map = this.getCustomExtend();
        result = result * 59 + ($customExtend == null ? 43 : $customExtend.hashCode());
        String string147 = this.getMktRequireUnitName();
        result = result * 59 + ($mktRequireUnitName == null ? 43 : $mktRequireUnitName.hashCode());
        String string148 = this.getMktRequireUnitPrecision();
        result = result * 59 + ($mktRequireUnitPrecision == null ? 43 : $mktRequireUnitPrecision.hashCode());
        String string149 = this.getMktRequireUniterpCode();
        result = result * 59 + ($mktRequireUniterpCode == null ? 43 : $mktRequireUniterpCode.hashCode());
        String string150 = this.getMktOfflineUnitName();
        result = result * 59 + ($mktOfflineUnitName == null ? 43 : $mktOfflineUnitName.hashCode());
        String string151 = this.getMktOfflineUnitPrecision();
        result = result * 59 + ($mktOfflineUnitPrecision == null ? 43 : $mktOfflineUnitPrecision.hashCode());
        String string152 = this.getMktOfflineUniterpCode();
        result = result * 59 + ($mktOfflineUniterpCode == null ? 43 : $mktOfflineUniterpCode.hashCode());
        String string153 = this.getFiOutTaxrateName();
        result = result * 59 + ($fiOutTaxrateName == null ? 43 : $fiOutTaxrateName.hashCode());
        String string154 = this.getLowestMarkPrice();
        result = result * 59 + ($lowestMarkPrice == null ? 43 : $lowestMarkPrice.hashCode());
        String string155 = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : $createTime.hashCode());
        BigDecimal bigDecimal22 = this.getMallDepositPercentage();
        result = result * 59 + ($mallDepositPercentage == null ? 43 : $mallDepositPercentage.hashCode());
        String string156 = this.getKeywords();
        result = result * 59 + ($keywords == null ? 43 : $keywords.hashCode());
        String string157 = this.getMallMetaDescription();
        result = result * 59 + ($mallMetaDescription == null ? 43 : $mallMetaDescription.hashCode());
        MultiLangText multiLangText = this.getMktOnlineUnit___Name();
        result = result * 59 + ($mktOnlineUnit___Name == null ? 43 : $mktOnlineUnit___Name.hashCode());
        String string158 = this.getMallSaleStyle();
        result = result * 59 + ($mallSaleStyle == null ? 43 : $mallSaleStyle.hashCode());
        String string159 = this.getMallPageTitle();
        result = result * 59 + ($mallPageTitle == null ? 43 : $mallPageTitle.hashCode());
        BigDecimal bigDecimal23 = this.getMallDeposits();
        result = result * 59 + ($mallDeposits == null ? 43 : $mallDeposits.hashCode());
        String string160 = this.getDeliveryMethod();
        result = result * 59 + ($deliveryMethod == null ? 43 : $deliveryMethod.hashCode());
        BigDecimal bigDecimal24 = this.getMeasurementCount();
        result = result * 59 + ($measurementCount == null ? 43 : $measurementCount.hashCode());
        String string161 = this.getMeasurementUnitName();
        result = result * 59 + ($measurementUnitName == null ? 43 : $measurementUnitName.hashCode());
        String string162 = this.getMeasurementUnitCode();
        result = result * 59 + ($measurementUnitCode == null ? 43 : $measurementUnitCode.hashCode());
        BigDecimal bigDecimal25 = this.getCompensationAmount();
        result = result * 59 + ($compensationAmount == null ? 43 : $compensationAmount.hashCode());
        BigDecimal bigDecimal26 = this.getMoldingTime();
        result = result * 59 + ($moldingTime == null ? 43 : $moldingTime.hashCode());
        BigDecimal bigDecimal27 = this.getMoldCavities();
        result = result * 59 + ($moldCavities == null ? 43 : $moldCavities.hashCode());
        String string163 = this.getProductionMode();
        result = result * 59 + ($productionMode == null ? 43 : $productionMode.hashCode());
        return result;
    }

    public String toString() {
        return "ProductDTO(id=" + this.getId() + ", createOrgId=" + this.getCreateOrgId() + ", orgId=" + this.getOrgId() + ", orgType=" + this.getOrgType() + ", orgIdCode=" + this.getOrgIdCode() + ", orgIdName=" + this.getOrgIdName() + ", orgIdName_multLang=" + this.getOrgIdName_multLang() + ", shopId=" + this.getShopId() + ", tenantId=" + this.getTenantId() + ", name=" + this.getName() + ", name_multiLang=" + this.getName_multiLang() + ", shortName=" + this.getShortName() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", code=" + this.getCode() + ", transType=" + this.getTransType() + ", transTypeName=" + this.getTransTypeName() + ", unitId=" + this.getUnitId() + ", unitErpCode=" + this.getUnitErpCode() + ", unitTruncationType=" + this.getUnitTruncationType() + ", unitExchangeType=" + this.getUnitExchangeType() + ", mainUnitCount=" + this.getMainUnitCount() + ", unitCode=" + this.getUnitCode() + ", unitName=" + this.getUnitName() + ", unitName_multLang=" + this.getUnitName_multLang() + ", unitPrecision=" + this.getUnitPrecision() + ", unitUseType=" + this.getUnitUseType() + ", productPropCharacterDefine=" + this.getProductPropCharacterDefine() + ", productPropCharacterDefineMap=" + this.getProductPropCharacterDefineMap() + ", productCharacterDef=" + this.getProductCharacterDef() + ", productExtendCharacterDef=" + this.getProductExtendCharacterDef() + ", order=" + this.getOrder() + ", assistUnit=" + this.getAssistUnit() + ", enableAssistUnit=" + this.getEnableAssistUnit() + ", unitConvertCoefficient=" + this.getUnitConvertCoefficient() + ", modelDescription=" + this.getModelDescription() + ", singleInspection=" + this.getSingleInspection() + ", model=" + this.getModel() + ", model_multiLang=" + this.getModel_multiLang() + ", manageClass=" + this.getManageClass() + ", manageClassPath=" + this.getManageClassPath() + ", manageClassCode=" + this.getManageClassCode() + ", manageClassName=" + this.getManageClassName() + ", manageClassName_multiLang=" + this.getManageClassName_multiLang() + ", purchaseClass=" + this.getPurchaseClass() + ", purchaseClassCode=" + this.getPurchaseClassCode() + ", purchaseClassName=" + this.getPurchaseClassName() + ", costClass=" + this.getCostClass() + ", costClassCode=" + this.getCostClassCode() + ", costClassName=" + this.getCostClassName() + ", costClassName_multiLang=" + this.getCostClassName_multiLang() + ", brand=" + this.getBrand() + ", brandCode=" + this.getBrandCode() + ", brandName=" + this.getBrandName() + ", brandName_multiLang=" + this.getBrandName_multiLang() + ", platformCode=" + this.getPlatformCode() + ", placeOfOrigin=" + this.getPlaceOfOrigin() + ", productLine=" + this.getProductLine() + ", productLineCode=" + this.getProductLineCode() + ", productLineName=" + this.getProductLineName() + ", productLineName_multiLang=" + this.getProductLineName_multiLang() + ", length=" + this.getLength() + ", height=" + this.getHeight() + ", width=" + this.getWidth() + ", weight=" + this.getWeight() + ", weightUnit=" + this.getWeightUnit() + ", netWeight=" + this.getNetWeight() + ", netWeightUnit=" + this.getNetWeightUnit() + ", volume=" + this.getVolume() + ", volumeUnit=" + this.getVolumeUnit() + ", barCode=" + this.getBarCode() + ", productBarCodes=" + this.getProductBarCodes() + ", displayName=" + this.getDisplayName() + ", erpOuterCode=" + this.getErpOuterCode() + ", manufacturer=" + this.getManufacturer() + ", mktDisplayPrice=" + this.getMktDisplayPrice() + ", mktPriceAreaMessage=" + this.getMktPriceAreaMessage() + ", mktBatchPriceUnit=" + this.getMktBatchPriceUnit() + ", mktBatchPrice=" + this.getMktBatchPrice() + ", mktBatchUnit=" + this.getMktBatchUnit() + ", mktBatchUnitName=" + this.getMktBatchUnitName() + ", mktBatchUnitCode=" + this.getMktBatchUnitCode() + ", mktOnlineUnit=" + this.getMktOnlineUnit() + ", mktOfflineUnit=" + this.getMktOfflineUnit() + ", mktRequireUnit=" + this.getMktRequireUnit() + ", mktMarkPrice=" + this.getMktMarkPrice() + ", mktSalePrice=" + this.getMktSalePrice() + ", mktMarketPrice=" + this.getMktMarketPrice() + ", mktStatus=" + this.getMktStatus() + ", mktUOrderStatus=" + this.getMktUOrderStatus() + ", orderUpCount=" + this.getOrderUpCount() + ", orderDownCount=" + this.getOrderDownCount() + ", upuMaxPrimeCosts=" + this.getUpuMaxPrimeCosts() + ", upuPrimeCosts=" + this.getUpuPrimeCosts() + ", upuRequestOrderLimit=" + this.getUpuRequestOrderLimit() + ", upuArrivalAllowErrorLimit=" + this.getUpuArrivalAllowErrorLimit() + ", upuInvoiceAllowErrorLimit=" + this.getUpuInvoiceAllowErrorLimit() + ", upuPurchaseUnit=" + this.getUpuPurchaseUnit() + ", upuPurchaseUnitName=" + this.getUpuPurchaseUnitName() + ", upuPurchaseUnitCode=" + this.getUpuPurchaseUnitCode() + ", upuPurchaseUnitPrecision=" + this.getUpuPurchaseUnitPrecision() + ", upuPurchasePriceUnit=" + this.getUpuPurchasePriceUnit() + ", upuPurchasePriceUnitName=" + this.getUpuPurchasePriceUnitName() + ", upuPurchasePriceUnitCode=" + this.getUpuPurchasePriceUnitCode() + ", upuPurchaseTimes=" + this.getUpuPurchaseTimes() + ", upuPurchaseOrderQuantity=" + this.getUpuPurchaseOrderQuantity() + ", saleCanSale=" + this.getSaleCanSale() + ", saleMinOrderQuantity=" + this.getSaleMinOrderQuantity() + ", saleDoubleSale=" + this.getSaleDoubleSale() + ", saleDeliveryDays=" + this.getSaleDeliveryDays() + ", saleChannel=" + this.getSaleChannel() + ", saleProductClass=" + this.getSaleProductClass() + ", saleProductClassCode=" + this.getSaleProductClassCode() + ", saleProductClassName=" + this.getSaleProductClassName() + ", saleProductClassPath=" + this.getSaleProductClassPath() + ", stockOmsWarehouse=" + this.getStockOmsWarehouse() + ", stockBatchManage=" + this.getStockBatchManage() + ", stockExpiryDateManage=" + this.getStockExpiryDateManage() + ", stockExpiryDateCalculationMethod=" + this.getStockExpiryDateCalculationMethod() + ", stockExpireDateNo=" + this.getStockExpireDateNo() + ", stockExpireDateUnit=" + this.getStockExpireDateUnit() + ", stockDaysBeforeValidityReject=" + this.getStockDaysBeforeValidityReject() + ", stockValidityWarningDays=" + this.getStockValidityWarningDays() + ", stockSerialNoManage=" + this.getStockSerialNoManage() + ", stockBarcodeManage=" + this.getStockBarcodeManage() + ", stockManageByInventory=" + this.getStockManageByInventory() + ", stockSafetyStock=" + this.getStockSafetyStock() + ", stockHighestStock=" + this.getStockHighestStock() + ", stockLowestStock=" + this.getStockLowestStock() + ", stockRopStock=" + this.getStockRopStock() + ", stockDeliveryWarehouse=" + this.getStockDeliveryWarehouse() + ", stockDeliveryWarehouseName=" + this.getStockDeliveryWarehouseName() + ", stockReturnWarehouse=" + this.getStockReturnWarehouse() + ", stockReturnWarehouseName=" + this.getStockReturnWarehouseName() + ", stockReceiptWarehouse=" + this.getStockReceiptWarehouse() + ", stockReceiptWarehouseName=" + this.getStockReceiptWarehouseName() + ", stockInStoreExcessLimit=" + this.getStockInStoreExcessLimit() + ", stockOutStoreExcessLimit=" + this.getStockOutStoreExcessLimit() + ", stockInStoreLessLimit=" + this.getStockInStoreLessLimit() + ", stockOutStoreLessLimit=" + this.getStockOutStoreLessLimit() + ", stockMaximumTurnoverDays=" + this.getStockMaximumTurnoverDays() + ", stockScanCountUnit=" + this.getStockScanCountUnit() + ", stockReservation=" + this.getStockReservation() + ", stockStorageLossRate=" + this.getStockStorageLossRate() + ", stockAllowNegativeInventory=" + this.getStockAllowNegativeInventory() + ", stockStockUnit=" + this.getStockStockUnit() + ", stockStockUnitCode=" + this.getStockStockUnitCode() + ", stockStockUnitName=" + this.getStockStockUnitName() + ", demandPlanningUnit=" + this.getDemandPlanningUnit() + ", demandPlanningUnitCode=" + this.getDemandPlanningUnitCode() + ", demandPlanningUnitName=" + this.getDemandPlanningUnitName() + ", inspectionType=" + this.getInspectionType() + ", testRule=" + this.getTestRule() + ", inspectionReturnsWarehousingByResult=" + this.getInspectionReturnsWarehousingByResult() + ", planCheckDays=" + this.getPlanCheckDays() + ", inspectionUnit=" + this.getInspectionUnit() + ", edSupplyType=" + this.getEdSupplyType() + ", edProduceDepartment=" + this.getEdProduceDepartment() + ", edProduceDepartmentNew=" + this.getEdProduceDepartmentNew() + ", edBindCarrier=" + this.getEdBindCarrier() + ", edPurpose=" + this.getEdPurpose() + ", edWeigh=" + this.getEdWeigh() + ", doubleReplenish=" + this.getDoubleReplenish() + ", edEngineeringDrawingNo=" + this.getEdEngineeringDrawingNo() + ", edECNControl=" + this.getEdECNControl() + ", edPlanDefaultAttribute=" + this.getEdPlanDefaultAttribute() + ", edPlanMethod=" + this.getEdPlanMethod() + ", edManufacturePlanner=" + this.getEdManufacturePlanner() + ", edPlanProduceLimit=" + this.getEdPlanProduceLimit() + ", edKeySubPart=" + this.getEdKeySubPart() + ", edBOMType=" + this.getEdBOMType() + ", edBOMSource=" + this.getEdBOMSource() + ", edBatchRule=" + this.getEdBatchRule() + ", edEconomicQuantity=" + this.getEdEconomicQuantity() + ", edFixedQuantity=" + this.getEdFixedQuantity() + ", edBatchDouble=" + this.getEdBatchDouble() + ", edFrontLeadTime=" + this.getEdFrontLeadTime() + ", edBehindLeadTime=" + this.getEdBehindLeadTime() + ", edFixedLeadTime=" + this.getEdFixedLeadTime() + ", edLeadTimeCoefficient=" + this.getEdLeadTimeCoefficient() + ", edLeadTimeQuantity=" + this.getEdLeadTimeQuantity() + ", edLossType=" + this.getEdLossType() + ", edFixedWastage=" + this.getEdFixedWastage() + ", edRejectRate=" + this.getEdRejectRate() + ", edPrepareFeed=" + this.getEdPrepareFeed() + ", edWastageRate=" + this.getEdWastageRate() + ", wastageRate=" + this.getWastageRate() + ", edDirectProduction=" + this.getEdDirectProduction() + ", edSpecialMaterials=" + this.getEdSpecialMaterials() + ", edVirtualPart=" + this.getEdVirtualPart() + ", edDemandConsolidation=" + this.getEdDemandConsolidation() + ", edDemandConsolidationType=" + this.getEdDemandConsolidationType() + ", edDemandConsolidationUnit=" + this.getEdDemandConsolidationUnit() + ", edDemandConsolidationNumber=" + this.getEdDemandConsolidationNumber() + ", edDemandConsolidationDateType=" + this.getEdDemandConsolidationDateType() + ", edResetForwardDays=" + this.getEdResetForwardDays() + ", edResetBackwardDays=" + this.getEdResetBackwardDays() + ", edBeyondSupplyDays=" + this.getEdBeyondSupplyDays() + ", edLogisticsRelated=" + this.getEdLogisticsRelated() + ", edWeighingMode=" + this.getEdWeighingMode() + ", edFixedReturn=" + this.getEdFixedReturn() + ", edReviewGrossWeight=" + this.getEdReviewGrossWeight() + ", edSpecialCarTransport=" + this.getEdSpecialCarTransport() + ", edProduceUnit=" + this.getEdProduceUnit() + ", edProduceUnitCode=" + this.getEdProduceUnitCode() + ", edProduceUnitName=" + this.getEdProduceUnitName() + ", edProduceUnitPercision=" + this.getEdProduceUnitPercision() + ", edPlanClass=" + this.getEdPlanClass() + ", edPlanClassName=" + this.getEdPlanClassName() + ", fiCostClass=" + this.getFiCostClass() + ", fiValueManageType=" + this.getFiValueManageType() + ", fiCostValuation=" + this.getFiCostValuation() + ", fiNoTaxCostPrice=" + this.getFiNoTaxCostPrice() + ", fiCheckByBatch=" + this.getFiCheckByBatch() + ", accountingByItem=" + this.getAccountingByItem() + ", checkFree=" + this.getCheckFree() + ", taxClass=" + this.getTaxClass() + ", taxClassCode=" + this.getTaxClassCode() + ", taxClassName=" + this.getTaxClassName() + ", taxClassSimpleName=" + this.getTaxClassSimpleName() + ", fiReceiptName=" + this.getFiReceiptName() + ", fiInTaxrate=" + this.getFiInTaxrate() + ", noTaxation=" + this.getNoTaxation() + ", fiOutTaxrate=" + this.getFiOutTaxrate() + ", fiPreferentialPolicyType=" + this.getFiPreferentialPolicyType() + ", fiPreferentialPolicyTypeName=" + this.getFiPreferentialPolicyTypeName() + ", receiptSpec=" + this.getReceiptSpec() + ", receiptModel=" + this.getReceiptModel() + ", creatorType=" + this.getCreatorType() + ", realProductAttribute=" + this.getRealProductAttribute() + ", realProductAttributeType=" + this.getRealProductAttributeType() + ", realProductAttributeTypeNew=" + this.getRealProductAttributeTypeNew() + ", virtualProductAttribute=" + this.getVirtualProductAttribute() + ", virtualProductAttributeNew=" + this.getVirtualProductAttributeNew() + ", businessAttribute=" + this.getBusinessAttribute() + ", ptoPriceType=" + this.getPtoPriceType() + ", productTemplate=" + this.getProductTemplate() + ", productTemplateName=" + this.getProductTemplateName() + ", productTemplateSkuDynamic=" + this.getProductTemplateSkuDynamic() + ", businessAttributePurchase=" + this.getBusinessAttributePurchase() + ", businessAttributeSelfCreate=" + this.getBusinessAttributeSelfCreate() + ", businessAttributeOutSourcing=" + this.getBusinessAttributeOutSourcing() + ", businessAttributeSale=" + this.getBusinessAttributeSale() + ", saleChannelOfOnlineBatch=" + this.getSaleChannelOfOnlineBatch() + ", saleChannelOfDistribution=" + this.getSaleChannelOfDistribution() + ", enableSparePartsManagement=" + this.getEnableSparePartsManagement() + ", depositPayType=" + this.getDepositPayType() + ", minimumDeposits=" + this.getMinimumDeposits() + ", productTagId=" + this.getProductTagId() + ", isWeight=" + this.getIsWeight() + ", productFamily=" + this.getProductFamily() + ", salesAndOperations=" + this.getSalesAndOperations() + ", stopStatus=" + this.getStopStatus() + ", erpCode=" + this.getErpCode() + ", mnemonicCode=" + this.getMnemonicCode() + ", productVendor=" + this.getProductVendor() + ", productVendorName=" + this.getProductVendorName() + ", productBuyer=" + this.getProductBuyer() + ", productBuyerName=" + this.getProductBuyerName() + ", warehouseManager=" + this.getWarehouseManager() + ", warehouseManagerName=" + this.getWarehouseManagerName() + ", description=" + this.getDescription() + ", mobileDescription=" + this.getMobileDescription() + ", medIsRegistrationManager=" + this.getMedIsRegistrationManager() + ", medIsAuthorizationManager=" + this.getMedIsAuthorizationManager() + ", medSunshinePurchaseNo=" + this.getMedSunshinePurchaseNo() + ", medRegistrationNo=" + this.getMedRegistrationNo() + ", retailProcessType=" + this.getRetailProcessType() + ", retailPriceDimension=" + this.getRetailPriceDimension() + ", material=" + this.getMaterial() + ", saleInOfflineStore=" + this.getSaleInOfflineStore() + ", offlineStoreOrder=" + this.getOfflineStoreOrder() + ", isOptionalMaterial=" + this.getIsOptionalMaterial() + ", defaultSKUId=" + this.getDefaultSKUId() + ", productDetailId=" + this.getProductDetailId() + ", recommendedMaterials=" + this.getRecommendedMaterials() + ", isProcess=" + this.getIsProcess() + ", process=" + this.getProcess() + ", url=" + this.getUrl() + ", hasSpecs=" + this.getHasSpecs() + ", couponId=" + this.getCouponId() + ", titleMemo=" + this.getTitleMemo() + ", platFormStatus=" + this.getPlatFormStatus() + ", couponType=" + this.getCouponType() + ", creatorCustomer=" + this.getCreatorCustomer() + ", inventoryCount=" + this.getInventoryCount() + ", manufacturingStrategy=" + this.getManufacturingStrategy() + ", mtoStrategy=" + this.getMtoStrategy() + ", strategyComparisonRule=" + this.getStrategyComparisonRule() + ", productAlbums=" + this.getProductAlbums() + ", productAttachments=" + this.getProductAttachments() + ", productParams=" + this.getProductParams() + ", productSpecItems=" + this.getProductSpecItems() + ", productDefine1=" + this.getProductDefine1() + ", productDefine2=" + this.getProductDefine2() + ", productDefine3=" + this.getProductDefine3() + ", productDefine4=" + this.getProductDefine4() + ", productDefine5=" + this.getProductDefine5() + ", productDefine6=" + this.getProductDefine6() + ", productDefine7=" + this.getProductDefine7() + ", productDefine8=" + this.getProductDefine8() + ", productDefine9=" + this.getProductDefine9() + ", productDefine10=" + this.getProductDefine10() + ", productDefine11=" + this.getProductDefine11() + ", productDefine12=" + this.getProductDefine12() + ", productDefine13=" + this.getProductDefine13() + ", productDefine14=" + this.getProductDefine14() + ", productDefine15=" + this.getProductDefine15() + ", productDefine16=" + this.getProductDefine16() + ", productDefine17=" + this.getProductDefine17() + ", productDefine18=" + this.getProductDefine18() + ", productDefine19=" + this.getProductDefine19() + ", productDefine20=" + this.getProductDefine20() + ", productDefine21=" + this.getProductDefine21() + ", productDefine22=" + this.getProductDefine22() + ", productDefine23=" + this.getProductDefine23() + ", productDefine24=" + this.getProductDefine24() + ", productDefine25=" + this.getProductDefine25() + ", productDefine26=" + this.getProductDefine26() + ", productDefine27=" + this.getProductDefine27() + ", productDefine28=" + this.getProductDefine28() + ", productDefine29=" + this.getProductDefine29() + ", productDefine30=" + this.getProductDefine30() + ", productFreeDefine1=" + this.getProductFreeDefine1() + ", productFreeDefine2=" + this.getProductFreeDefine2() + ", productFreeDefine3=" + this.getProductFreeDefine3() + ", productFreeDefine4=" + this.getProductFreeDefine4() + ", productFreeDefine5=" + this.getProductFreeDefine5() + ", productFreeDefine6=" + this.getProductFreeDefine6() + ", productFreeDefine7=" + this.getProductFreeDefine7() + ", productFreeDefine8=" + this.getProductFreeDefine8() + ", productFreeDefine9=" + this.getProductFreeDefine9() + ", productFreeDefine10=" + this.getProductFreeDefine10() + ", productFreeDefine11=" + this.getProductFreeDefine11() + ", productFreeDefine12=" + this.getProductFreeDefine12() + ", productFreeDefine13=" + this.getProductFreeDefine13() + ", productFreeDefine14=" + this.getProductFreeDefine14() + ", productFreeDefine15=" + this.getProductFreeDefine15() + ", productFreeDefine16=" + this.getProductFreeDefine16() + ", productFreeDefine17=" + this.getProductFreeDefine17() + ", productFreeDefine18=" + this.getProductFreeDefine18() + ", productFreeDefine19=" + this.getProductFreeDefine19() + ", productFreeDefine20=" + this.getProductFreeDefine20() + ", productFreeDefine21=" + this.getProductFreeDefine21() + ", productFreeDefine22=" + this.getProductFreeDefine22() + ", productFreeDefine23=" + this.getProductFreeDefine23() + ", productFreeDefine24=" + this.getProductFreeDefine24() + ", productFreeDefine25=" + this.getProductFreeDefine25() + ", productFreeDefine26=" + this.getProductFreeDefine26() + ", productFreeDefine27=" + this.getProductFreeDefine27() + ", productFreeDefine28=" + this.getProductFreeDefine28() + ", productFreeDefine29=" + this.getProductFreeDefine29() + ", productFreeDefine30=" + this.getProductFreeDefine30() + ", free1=" + this.getFree1() + ", free2=" + this.getFree2() + ", free3=" + this.getFree3() + ", free4=" + this.getFree4() + ", free5=" + this.getFree5() + ", free6=" + this.getFree6() + ", free7=" + this.getFree7() + ", free8=" + this.getFree8() + ", free9=" + this.getFree9() + ", free10=" + this.getFree10() + ", materialStatus=" + this.getMaterialStatus() + ", orgMaterialStatus=" + this.getOrgMaterialStatus() + ", fullSetInspection=" + this.getFullSetInspection() + ", characterDTOList=" + this.getCharacterDTOList() + ", homepageBusinessId=" + this.getHomepageBusinessId() + ", imgBusinessId=" + this.getImgBusinessId() + ", videoBusinessId=" + this.getVideoBusinessId() + ", attachments=" + this.getAttachments() + ", costItems=" + this.getCostItems() + ", costItemsCode=" + this.getCostItemsCode() + ", costItemsName=" + this.getCostItemsName() + ", projectTrackStrategy=" + this.getProjectTrackStrategy() + ", checkByProject=" + this.getCheckByProject() + ", checkBySalesOrders=" + this.getCheckBySalesOrders() + ", checkByClient=" + this.getCheckByClient() + ", checkByOutsourcing=" + this.getCheckByOutsourcing() + ", billingUnit=" + this.getBillingUnit() + ", billingUnitCode=" + this.getBillingUnitCode() + ", billingUnitName=" + this.getBillingUnitName() + ", sendInspection=" + this.getSendInspection() + ", returnInspection=" + this.getReturnInspection() + ", iBaseSaleCount=" + this.getIBaseSaleCount() + ", iABCClass=" + this.getIABCClass() + ", atpInspection=" + this.getAtpInspection() + ", doublePick=" + this.getDoublePick() + ", checkByRevenueManagement=" + this.getCheckByRevenueManagement() + ", optionalType=" + this.getOptionalType() + ", overSigning=" + this.getOverSigning() + ", inspectionControlPoint=" + this.getInspectionControlPoint() + ", allowStorePurchase=" + this.getAllowStorePurchase() + ", isOfflineStoreOrder=" + this.getIsOfflineStoreOrder() + ", isOfflineStoreReturn=" + this.getIsOfflineStoreReturn() + ", customExtend=" + this.getCustomExtend() + ", isPriceChangeAllowed=" + this.getIsPriceChangeAllowed() + ", mktRequireUnitName=" + this.getMktRequireUnitName() + ", mktRequireUnitPrecision=" + this.getMktRequireUnitPrecision() + ", mktRequireUniterpCode=" + this.getMktRequireUniterpCode() + ", mktOfflineUnitName=" + this.getMktOfflineUnitName() + ", mktOfflineUnitPrecision=" + this.getMktOfflineUnitPrecision() + ", mktOfflineUniterpCode=" + this.getMktOfflineUniterpCode() + ", fiOutTaxrateName=" + this.getFiOutTaxrateName() + ", lowestMarkPrice=" + this.getLowestMarkPrice() + ", createTime=" + this.getCreateTime() + ", productInspection=" + this.getProductInspection() + ", productInspectionCtrlPoint=" + this.getProductInspectionCtrlPoint() + ", outSourceInspection=" + this.getOutSourceInspection() + ", outSourceInspectionCtrlPoint=" + this.getOutSourceInspectionCtrlPoint() + ", transferInspection=" + this.getTransferInspection() + ", transferInspectionCtrlPoint=" + this.getTransferInspectionCtrlPoint() + ", productFirstInspection=" + this.getProductFirstInspection() + ", firstInspectionCtrlMethod=" + this.getFirstInspectionCtrlMethod() + ", sendInspectionCtrlPoint=" + this.getSendInspectionCtrlPoint() + ", returnInspectionCtrlPoint=" + this.getReturnInspectionCtrlPoint() + ", mallOnlyOrder=" + this.getMallOnlyOrder() + ", mallIControlTime=" + this.getMallIControlTime() + ", mallDepositDealPayType=" + this.getMallDepositDealPayType() + ", mallDepositPercentage=" + this.getMallDepositPercentage() + ", mallCustomerServiceDay=" + this.getMallCustomerServiceDay() + ", keywords=" + this.getKeywords() + ", mallMetaDescription=" + this.getMallMetaDescription() + ", mallIsAllArea=" + this.getMallIsAllArea() + ", mktOnlineUnit___Name=" + this.getMktOnlineUnit___Name() + ", mallSaleStyle=" + this.getMallSaleStyle() + ", mallDlyFeeRuleId=" + this.getMallDlyFeeRuleId() + ", mallEnableDeposit=" + this.getMallEnableDeposit() + ", mallUpcount=" + this.getMallUpcount() + ", mallDowncount=" + this.getMallDowncount() + ", mallEnableSubscribe=" + this.getMallEnableSubscribe() + ", mallPageTitle=" + this.getMallPageTitle() + ", mallSalePoints=" + this.getMallSalePoints() + ", mallEnableCyclePurchase=" + this.getMallEnableCyclePurchase() + ", mallDeposits=" + this.getMallDeposits() + ", mallGiftCardId=" + this.getMallGiftCardId() + ", deliveryMethod=" + this.getDeliveryMethod() + ", turnoverMaterials=" + this.getTurnoverMaterials() + ", amortizationMethod=" + this.getAmortizationMethod() + ", measurementCount=" + this.getMeasurementCount() + ", measurementUnit=" + this.getMeasurementUnit() + ", measurementUnitName=" + this.getMeasurementUnitName() + ", measurementUnitCode=" + this.getMeasurementUnitCode() + ", compensationAmount=" + this.getCompensationAmount() + ", moldingTime=" + this.getMoldingTime() + ", moldCavities=" + this.getMoldCavities() + ", measurementUnitPrecision=" + this.getMeasurementUnitPrecision() + ", reviewCycle=" + this.getReviewCycle() + ", effectiveLeadTime=" + this.getEffectiveLeadTime() + ", productionMode=" + this.getProductionMode() + ", balance=" + this.getBalance() + ")";
    }
}

