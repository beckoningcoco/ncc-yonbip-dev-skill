/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.ucf.CharacterDTO
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.ucf.CharacterDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSpecItemDTO;
import com.yonyoucloud.iuap.upc.vo.ProductAlbumVO;
import com.yonyoucloud.iuap.upc.vo.ProductAttachmentVO;
import com.yonyoucloud.iuap.upc.vo.ProductParameterExtendVO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductBaseDTO
implements Serializable {
    private Long id;
    private String createOrgId;
    private String orgId;
    private String orgType;
    private String tenantId;
    private String name;
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
    private Integer unitPrecision;
    private Integer unitUseType;
    private String productPropCharacterDefine;
    private HashMap<String, Object> productPropCharacterDefineMap;
    private Integer order;
    private Long assistUnit;
    private Boolean enableAssistUnit;
    private BigDecimal unitConvertCoefficient;
    private String modelDescription;
    private String model;
    private Long manageClass;
    private String manageClassPath;
    private String manageClassCode;
    private String manageClassName;
    private Long costClass;
    private String costClassCode;
    private String costClassName;
    private Long brand;
    private String brandCode;
    private String brandName;
    private String platformCode;
    private String placeOfOrigin;
    private Long productLine;
    private String productLineCode;
    private String productLineName;
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
    private Long upuPurchasePriceUnit;
    private String upuPurchasePriceUnitName;
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
    private Boolean edWastageRate;
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
    private List<CharacterDTO> characterDTOList;

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

    public String getTenantId() {
        return this.tenantId;
    }

    public String getName() {
        return this.name;
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

    public String getModel() {
        return this.model;
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

    public Long getCostClass() {
        return this.costClass;
    }

    public String getCostClassCode() {
        return this.costClassCode;
    }

    public String getCostClassName() {
        return this.costClassName;
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

    public Long getUpuPurchasePriceUnit() {
        return this.upuPurchasePriceUnit;
    }

    public String getUpuPurchasePriceUnitName() {
        return this.upuPurchasePriceUnitName;
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

    public Boolean getEdWastageRate() {
        return this.edWastageRate;
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

    public List<CharacterDTO> getCharacterDTOList() {
        return this.characterDTOList;
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

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setModel(String model) {
        this.model = model;
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

    public void setCostClass(Long costClass) {
        this.costClass = costClass;
    }

    public void setCostClassCode(String costClassCode) {
        this.costClassCode = costClassCode;
    }

    public void setCostClassName(String costClassName) {
        this.costClassName = costClassName;
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

    public void setUpuPurchasePriceUnit(Long upuPurchasePriceUnit) {
        this.upuPurchasePriceUnit = upuPurchasePriceUnit;
    }

    public void setUpuPurchasePriceUnitName(String upuPurchasePriceUnitName) {
        this.upuPurchasePriceUnitName = upuPurchasePriceUnitName;
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

    public void setEdWastageRate(Boolean edWastageRate) {
        this.edWastageRate = edWastageRate;
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

    public void setCharacterDTOList(List<CharacterDTO> characterDTOList) {
        this.characterDTOList = characterDTOList;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object o) {
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
        void other$edProduceUnitPercision;
        void this$edProduceUnitPercision;
        void other$edProduceUnitName;
        void this$edProduceUnitName;
        void other$edProduceUnitCode;
        void this$edProduceUnitCode;
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
        void other$upuPurchasePriceUnitName;
        void this$upuPurchasePriceUnitName;
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
        void other$productLineName;
        void this$productLineName;
        void other$productLineCode;
        void this$productLineCode;
        void other$placeOfOrigin;
        void this$placeOfOrigin;
        void other$platformCode;
        void this$platformCode;
        void other$brandName;
        void this$brandName;
        void other$brandCode;
        void this$brandCode;
        void other$costClassName;
        void this$costClassName;
        void other$costClassCode;
        void this$costClassCode;
        void other$manageClassName;
        void this$manageClassName;
        void other$manageClassCode;
        void this$manageClassCode;
        void other$manageClassPath;
        void this$manageClassPath;
        void other$model;
        void this$model;
        void other$modelDescription;
        void this$modelDescription;
        void other$unitConvertCoefficient;
        void this$unitConvertCoefficient;
        void other$productPropCharacterDefineMap;
        void this$productPropCharacterDefineMap;
        void other$productPropCharacterDefine;
        void this$productPropCharacterDefine;
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
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductBaseDTO)) {
            return false;
        }
        ProductBaseDTO other = (ProductBaseDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
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
        Long this$manageClass = this.getManageClass();
        Long other$manageClass = other.getManageClass();
        if (this$manageClass == null ? other$manageClass != null : !((Object)this$manageClass).equals(other$manageClass)) {
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
        Integer other$couponType = other.getCouponType();
        if (this$couponType == null ? other$couponType != null : !((Object)this$couponType).equals(other$couponType)) {
            return false;
        }
        Long this$creatorCustomer = this.getCreatorCustomer();
        Long other$creatorCustomer = other.getCreatorCustomer();
        if (this$creatorCustomer == null ? other$creatorCustomer != null : !((Object)this$creatorCustomer).equals(other$creatorCustomer)) {
            return false;
        }
        String this$createOrgId = this.getCreateOrgId();
        String other$createOrgId = other.getCreateOrgId();
        if (this$createOrgId == null ? other$createOrgId != null : !this$createOrgId.equals(other$createOrgId)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$orgType = this.getOrgType();
        String other$orgType = other.getOrgType();
        if (this$orgType == null ? other$orgType != null : !this$orgType.equals(other$orgType)) {
            return false;
        }
        String this$tenantId = this.getTenantId();
        String other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !this$tenantId.equals(other$tenantId)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$code = this.getCode();
        String string = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String string2 = this.getTransType();
        String string3 = other.getTransType();
        if (this$transType == null ? other$transType != null : !this$transType.equals(other$transType)) {
            return false;
        }
        String string4 = this.getTransTypeName();
        String string5 = other.getTransTypeName();
        if (this$transTypeName == null ? other$transTypeName != null : !this$transTypeName.equals(other$transTypeName)) {
            return false;
        }
        String string6 = this.getUnitErpCode();
        String string7 = other.getUnitErpCode();
        if (this$unitErpCode == null ? other$unitErpCode != null : !this$unitErpCode.equals(other$unitErpCode)) {
            return false;
        }
        BigDecimal bigDecimal = this.getMainUnitCount();
        BigDecimal bigDecimal2 = other.getMainUnitCount();
        if (this$mainUnitCount == null ? other$mainUnitCount != null : !this$mainUnitCount.equals(other$mainUnitCount)) {
            return false;
        }
        String string8 = this.getUnitCode();
        String string9 = other.getUnitCode();
        if (this$unitCode == null ? other$unitCode != null : !this$unitCode.equals(other$unitCode)) {
            return false;
        }
        String string10 = this.getUnitName();
        String string11 = other.getUnitName();
        if (this$unitName == null ? other$unitName != null : !this$unitName.equals(other$unitName)) {
            return false;
        }
        String string12 = this.getProductPropCharacterDefine();
        String string13 = other.getProductPropCharacterDefine();
        if (this$productPropCharacterDefine == null ? other$productPropCharacterDefine != null : !this$productPropCharacterDefine.equals(other$productPropCharacterDefine)) {
            return false;
        }
        HashMap<String, Object> hashMap = this.getProductPropCharacterDefineMap();
        HashMap<String, Object> hashMap2 = other.getProductPropCharacterDefineMap();
        if (this$productPropCharacterDefineMap == null ? other$productPropCharacterDefineMap != null : !this$productPropCharacterDefineMap.equals(other$productPropCharacterDefineMap)) {
            return false;
        }
        BigDecimal bigDecimal3 = this.getUnitConvertCoefficient();
        BigDecimal bigDecimal4 = other.getUnitConvertCoefficient();
        if (this$unitConvertCoefficient == null ? other$unitConvertCoefficient != null : !this$unitConvertCoefficient.equals(other$unitConvertCoefficient)) {
            return false;
        }
        String string14 = this.getModelDescription();
        String string15 = other.getModelDescription();
        if (this$modelDescription == null ? other$modelDescription != null : !this$modelDescription.equals(other$modelDescription)) {
            return false;
        }
        String string16 = this.getModel();
        String string17 = other.getModel();
        if (this$model == null ? other$model != null : !this$model.equals(other$model)) {
            return false;
        }
        String string18 = this.getManageClassPath();
        String string19 = other.getManageClassPath();
        if (this$manageClassPath == null ? other$manageClassPath != null : !this$manageClassPath.equals(other$manageClassPath)) {
            return false;
        }
        String string20 = this.getManageClassCode();
        String string21 = other.getManageClassCode();
        if (this$manageClassCode == null ? other$manageClassCode != null : !this$manageClassCode.equals(other$manageClassCode)) {
            return false;
        }
        String string22 = this.getManageClassName();
        String string23 = other.getManageClassName();
        if (this$manageClassName == null ? other$manageClassName != null : !this$manageClassName.equals(other$manageClassName)) {
            return false;
        }
        String string24 = this.getCostClassCode();
        String string25 = other.getCostClassCode();
        if (this$costClassCode == null ? other$costClassCode != null : !this$costClassCode.equals(other$costClassCode)) {
            return false;
        }
        String string26 = this.getCostClassName();
        String string27 = other.getCostClassName();
        if (this$costClassName == null ? other$costClassName != null : !this$costClassName.equals(other$costClassName)) {
            return false;
        }
        String string28 = this.getBrandCode();
        String string29 = other.getBrandCode();
        if (this$brandCode == null ? other$brandCode != null : !this$brandCode.equals(other$brandCode)) {
            return false;
        }
        String string30 = this.getBrandName();
        String string31 = other.getBrandName();
        if (this$brandName == null ? other$brandName != null : !this$brandName.equals(other$brandName)) {
            return false;
        }
        String string32 = this.getPlatformCode();
        String string33 = other.getPlatformCode();
        if (this$platformCode == null ? other$platformCode != null : !this$platformCode.equals(other$platformCode)) {
            return false;
        }
        String string34 = this.getPlaceOfOrigin();
        String string35 = other.getPlaceOfOrigin();
        if (this$placeOfOrigin == null ? other$placeOfOrigin != null : !this$placeOfOrigin.equals(other$placeOfOrigin)) {
            return false;
        }
        String string36 = this.getProductLineCode();
        String string37 = other.getProductLineCode();
        if (this$productLineCode == null ? other$productLineCode != null : !this$productLineCode.equals(other$productLineCode)) {
            return false;
        }
        String string38 = this.getProductLineName();
        String string39 = other.getProductLineName();
        if (this$productLineName == null ? other$productLineName != null : !this$productLineName.equals(other$productLineName)) {
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
        String string40 = this.getBarCode();
        String string41 = other.getBarCode();
        if (this$barCode == null ? other$barCode != null : !this$barCode.equals(other$barCode)) {
            return false;
        }
        String string42 = this.getErpOuterCode();
        String string43 = other.getErpOuterCode();
        if (this$erpOuterCode == null ? other$erpOuterCode != null : !this$erpOuterCode.equals(other$erpOuterCode)) {
            return false;
        }
        String string44 = this.getManufacturer();
        String string45 = other.getManufacturer();
        if (this$manufacturer == null ? other$manufacturer != null : !this$manufacturer.equals(other$manufacturer)) {
            return false;
        }
        String string46 = this.getMktPriceAreaMessage();
        String string47 = other.getMktPriceAreaMessage();
        if (this$mktPriceAreaMessage == null ? other$mktPriceAreaMessage != null : !this$mktPriceAreaMessage.equals(other$mktPriceAreaMessage)) {
            return false;
        }
        BigDecimal bigDecimal17 = this.getMktBatchPrice();
        BigDecimal bigDecimal18 = other.getMktBatchPrice();
        if (this$mktBatchPrice == null ? other$mktBatchPrice != null : !this$mktBatchPrice.equals(other$mktBatchPrice)) {
            return false;
        }
        String string48 = this.getMktBatchUnitName();
        String string49 = other.getMktBatchUnitName();
        if (this$mktBatchUnitName == null ? other$mktBatchUnitName != null : !this$mktBatchUnitName.equals(other$mktBatchUnitName)) {
            return false;
        }
        String string50 = this.getMktBatchUnitCode();
        String string51 = other.getMktBatchUnitCode();
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
        String string52 = this.getUpuPurchaseUnitName();
        String string53 = other.getUpuPurchaseUnitName();
        if (this$upuPurchaseUnitName == null ? other$upuPurchaseUnitName != null : !this$upuPurchaseUnitName.equals(other$upuPurchaseUnitName)) {
            return false;
        }
        String string54 = this.getUpuPurchasePriceUnitName();
        String string55 = other.getUpuPurchasePriceUnitName();
        if (this$upuPurchasePriceUnitName == null ? other$upuPurchasePriceUnitName != null : !this$upuPurchasePriceUnitName.equals(other$upuPurchasePriceUnitName)) {
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
        String string56 = this.getSaleChannel();
        String string57 = other.getSaleChannel();
        if (this$saleChannel == null ? other$saleChannel != null : !this$saleChannel.equals(other$saleChannel)) {
            return false;
        }
        String string58 = this.getSaleProductClassCode();
        String string59 = other.getSaleProductClassCode();
        if (this$saleProductClassCode == null ? other$saleProductClassCode != null : !this$saleProductClassCode.equals(other$saleProductClassCode)) {
            return false;
        }
        String string60 = this.getSaleProductClassName();
        String string61 = other.getSaleProductClassName();
        if (this$saleProductClassName == null ? other$saleProductClassName != null : !this$saleProductClassName.equals(other$saleProductClassName)) {
            return false;
        }
        String string62 = this.getSaleProductClassPath();
        String string63 = other.getSaleProductClassPath();
        if (this$saleProductClassPath == null ? other$saleProductClassPath != null : !this$saleProductClassPath.equals(other$saleProductClassPath)) {
            return false;
        }
        String string64 = this.getStockOmsWarehouse();
        String string65 = other.getStockOmsWarehouse();
        if (this$stockOmsWarehouse == null ? other$stockOmsWarehouse != null : !this$stockOmsWarehouse.equals(other$stockOmsWarehouse)) {
            return false;
        }
        String string66 = this.getStockExpiryDateCalculationMethod();
        String string67 = other.getStockExpiryDateCalculationMethod();
        if (this$stockExpiryDateCalculationMethod == null ? other$stockExpiryDateCalculationMethod != null : !this$stockExpiryDateCalculationMethod.equals(other$stockExpiryDateCalculationMethod)) {
            return false;
        }
        String string68 = this.getStockExpireDateNo();
        String string69 = other.getStockExpireDateNo();
        if (this$stockExpireDateNo == null ? other$stockExpireDateNo != null : !this$stockExpireDateNo.equals(other$stockExpireDateNo)) {
            return false;
        }
        String string70 = this.getStockExpireDateUnit();
        String string71 = other.getStockExpireDateUnit();
        if (this$stockExpireDateUnit == null ? other$stockExpireDateUnit != null : !this$stockExpireDateUnit.equals(other$stockExpireDateUnit)) {
            return false;
        }
        String string72 = this.getStockDaysBeforeValidityReject();
        String string73 = other.getStockDaysBeforeValidityReject();
        if (this$stockDaysBeforeValidityReject == null ? other$stockDaysBeforeValidityReject != null : !this$stockDaysBeforeValidityReject.equals(other$stockDaysBeforeValidityReject)) {
            return false;
        }
        String string74 = this.getStockValidityWarningDays();
        String string75 = other.getStockValidityWarningDays();
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
        String string76 = this.getStockDeliveryWarehouseName();
        String string77 = other.getStockDeliveryWarehouseName();
        if (this$stockDeliveryWarehouseName == null ? other$stockDeliveryWarehouseName != null : !this$stockDeliveryWarehouseName.equals(other$stockDeliveryWarehouseName)) {
            return false;
        }
        String string78 = this.getStockReturnWarehouseName();
        String string79 = other.getStockReturnWarehouseName();
        if (this$stockReturnWarehouseName == null ? other$stockReturnWarehouseName != null : !this$stockReturnWarehouseName.equals(other$stockReturnWarehouseName)) {
            return false;
        }
        String string80 = this.getStockReceiptWarehouseName();
        String string81 = other.getStockReceiptWarehouseName();
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
        String string82 = this.getStockStockUnitCode();
        String string83 = other.getStockStockUnitCode();
        if (this$stockStockUnitCode == null ? other$stockStockUnitCode != null : !this$stockStockUnitCode.equals(other$stockStockUnitCode)) {
            return false;
        }
        String string84 = this.getStockStockUnitName();
        String string85 = other.getStockStockUnitName();
        if (this$stockStockUnitName == null ? other$stockStockUnitName != null : !this$stockStockUnitName.equals(other$stockStockUnitName)) {
            return false;
        }
        String string86 = this.getEdProduceDepartmentNew();
        String string87 = other.getEdProduceDepartmentNew();
        if (this$edProduceDepartmentNew == null ? other$edProduceDepartmentNew != null : !this$edProduceDepartmentNew.equals(other$edProduceDepartmentNew)) {
            return false;
        }
        String string88 = this.getEdWeigh();
        String string89 = other.getEdWeigh();
        if (this$edWeigh == null ? other$edWeigh != null : !this$edWeigh.equals(other$edWeigh)) {
            return false;
        }
        String string90 = this.getEdEngineeringDrawingNo();
        String string91 = other.getEdEngineeringDrawingNo();
        if (this$edEngineeringDrawingNo == null ? other$edEngineeringDrawingNo != null : !this$edEngineeringDrawingNo.equals(other$edEngineeringDrawingNo)) {
            return false;
        }
        String string92 = this.getEdECNControl();
        String string93 = other.getEdECNControl();
        if (this$edECNControl == null ? other$edECNControl != null : !this$edECNControl.equals(other$edECNControl)) {
            return false;
        }
        String string94 = this.getEdPlanDefaultAttribute();
        String string95 = other.getEdPlanDefaultAttribute();
        if (this$edPlanDefaultAttribute == null ? other$edPlanDefaultAttribute != null : !this$edPlanDefaultAttribute.equals(other$edPlanDefaultAttribute)) {
            return false;
        }
        String string96 = this.getEdPlanMethod();
        String string97 = other.getEdPlanMethod();
        if (this$edPlanMethod == null ? other$edPlanMethod != null : !this$edPlanMethod.equals(other$edPlanMethod)) {
            return false;
        }
        String string98 = this.getEdManufacturePlanner();
        String string99 = other.getEdManufacturePlanner();
        if (this$edManufacturePlanner == null ? other$edManufacturePlanner != null : !this$edManufacturePlanner.equals(other$edManufacturePlanner)) {
            return false;
        }
        BigDecimal bigDecimal61 = this.getEdPlanProduceLimit();
        BigDecimal bigDecimal62 = other.getEdPlanProduceLimit();
        if (this$edPlanProduceLimit == null ? other$edPlanProduceLimit != null : !this$edPlanProduceLimit.equals(other$edPlanProduceLimit)) {
            return false;
        }
        String string100 = this.getEdKeySubPart();
        String string101 = other.getEdKeySubPart();
        if (this$edKeySubPart == null ? other$edKeySubPart != null : !this$edKeySubPart.equals(other$edKeySubPart)) {
            return false;
        }
        String string102 = this.getEdBOMType();
        String string103 = other.getEdBOMType();
        if (this$edBOMType == null ? other$edBOMType != null : !this$edBOMType.equals(other$edBOMType)) {
            return false;
        }
        String string104 = this.getEdBOMSource();
        String string105 = other.getEdBOMSource();
        if (this$edBOMSource == null ? other$edBOMSource != null : !this$edBOMSource.equals(other$edBOMSource)) {
            return false;
        }
        String string106 = this.getEdBatchRule();
        String string107 = other.getEdBatchRule();
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
        String string108 = this.getEdFixedWastage();
        String string109 = other.getEdFixedWastage();
        if (this$edFixedWastage == null ? other$edFixedWastage != null : !this$edFixedWastage.equals(other$edFixedWastage)) {
            return false;
        }
        BigDecimal bigDecimal73 = this.getEdRejectRate();
        BigDecimal bigDecimal74 = other.getEdRejectRate();
        if (this$edRejectRate == null ? other$edRejectRate != null : !this$edRejectRate.equals(other$edRejectRate)) {
            return false;
        }
        String string110 = this.getEdProduceUnitCode();
        String string111 = other.getEdProduceUnitCode();
        if (this$edProduceUnitCode == null ? other$edProduceUnitCode != null : !this$edProduceUnitCode.equals(other$edProduceUnitCode)) {
            return false;
        }
        String string112 = this.getEdProduceUnitName();
        String string113 = other.getEdProduceUnitName();
        if (this$edProduceUnitName == null ? other$edProduceUnitName != null : !this$edProduceUnitName.equals(other$edProduceUnitName)) {
            return false;
        }
        String string114 = this.getEdProduceUnitPercision();
        String string115 = other.getEdProduceUnitPercision();
        if (this$edProduceUnitPercision == null ? other$edProduceUnitPercision != null : !this$edProduceUnitPercision.equals(other$edProduceUnitPercision)) {
            return false;
        }
        BigDecimal bigDecimal75 = this.getFiNoTaxCostPrice();
        BigDecimal bigDecimal76 = other.getFiNoTaxCostPrice();
        if (this$fiNoTaxCostPrice == null ? other$fiNoTaxCostPrice != null : !this$fiNoTaxCostPrice.equals(other$fiNoTaxCostPrice)) {
            return false;
        }
        String string116 = this.getTaxClass();
        String string117 = other.getTaxClass();
        if (this$taxClass == null ? other$taxClass != null : !this$taxClass.equals(other$taxClass)) {
            return false;
        }
        String string118 = this.getTaxClassCode();
        String string119 = other.getTaxClassCode();
        if (this$taxClassCode == null ? other$taxClassCode != null : !this$taxClassCode.equals(other$taxClassCode)) {
            return false;
        }
        String string120 = this.getTaxClassName();
        String string121 = other.getTaxClassName();
        if (this$taxClassName == null ? other$taxClassName != null : !this$taxClassName.equals(other$taxClassName)) {
            return false;
        }
        String string122 = this.getTaxClassSimpleName();
        String string123 = other.getTaxClassSimpleName();
        if (this$taxClassSimpleName == null ? other$taxClassSimpleName != null : !this$taxClassSimpleName.equals(other$taxClassSimpleName)) {
            return false;
        }
        String string124 = this.getFiReceiptName();
        String string125 = other.getFiReceiptName();
        if (this$fiReceiptName == null ? other$fiReceiptName != null : !this$fiReceiptName.equals(other$fiReceiptName)) {
            return false;
        }
        String string126 = this.getFiInTaxrate();
        String string127 = other.getFiInTaxrate();
        if (this$fiInTaxrate == null ? other$fiInTaxrate != null : !this$fiInTaxrate.equals(other$fiInTaxrate)) {
            return false;
        }
        String string128 = this.getNoTaxation();
        String string129 = other.getNoTaxation();
        if (this$noTaxation == null ? other$noTaxation != null : !this$noTaxation.equals(other$noTaxation)) {
            return false;
        }
        String string130 = this.getFiOutTaxrate();
        String string131 = other.getFiOutTaxrate();
        if (this$fiOutTaxrate == null ? other$fiOutTaxrate != null : !this$fiOutTaxrate.equals(other$fiOutTaxrate)) {
            return false;
        }
        String string132 = this.getFiPreferentialPolicyTypeName();
        String string133 = other.getFiPreferentialPolicyTypeName();
        if (this$fiPreferentialPolicyTypeName == null ? other$fiPreferentialPolicyTypeName != null : !this$fiPreferentialPolicyTypeName.equals(other$fiPreferentialPolicyTypeName)) {
            return false;
        }
        String string134 = this.getReceiptSpec();
        String string135 = other.getReceiptSpec();
        if (this$receiptSpec == null ? other$receiptSpec != null : !this$receiptSpec.equals(other$receiptSpec)) {
            return false;
        }
        String string136 = this.getReceiptModel();
        String string137 = other.getReceiptModel();
        if (this$receiptModel == null ? other$receiptModel != null : !this$receiptModel.equals(other$receiptModel)) {
            return false;
        }
        String string138 = this.getRealProductAttribute();
        String string139 = other.getRealProductAttribute();
        if (this$realProductAttribute == null ? other$realProductAttribute != null : !this$realProductAttribute.equals(other$realProductAttribute)) {
            return false;
        }
        String string140 = this.getRealProductAttributeType();
        String string141 = other.getRealProductAttributeType();
        if (this$realProductAttributeType == null ? other$realProductAttributeType != null : !this$realProductAttributeType.equals(other$realProductAttributeType)) {
            return false;
        }
        String string142 = this.getVirtualProductAttribute();
        String string143 = other.getVirtualProductAttribute();
        if (this$virtualProductAttribute == null ? other$virtualProductAttribute != null : !this$virtualProductAttribute.equals(other$virtualProductAttribute)) {
            return false;
        }
        String string144 = this.getBusinessAttribute();
        String string145 = other.getBusinessAttribute();
        if (this$businessAttribute == null ? other$businessAttribute != null : !this$businessAttribute.equals(other$businessAttribute)) {
            return false;
        }
        String string146 = this.getProductTemplateName();
        String string147 = other.getProductTemplateName();
        if (this$productTemplateName == null ? other$productTemplateName != null : !this$productTemplateName.equals(other$productTemplateName)) {
            return false;
        }
        String string148 = this.getDepositPayType();
        String string149 = other.getDepositPayType();
        if (this$depositPayType == null ? other$depositPayType != null : !this$depositPayType.equals(other$depositPayType)) {
            return false;
        }
        String string150 = this.getMinimumDeposits();
        String string151 = other.getMinimumDeposits();
        if (this$minimumDeposits == null ? other$minimumDeposits != null : !this$minimumDeposits.equals(other$minimumDeposits)) {
            return false;
        }
        String string152 = this.getErpCode();
        String string153 = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String string154 = this.getMnemonicCode();
        String string155 = other.getMnemonicCode();
        if (this$mnemonicCode == null ? other$mnemonicCode != null : !this$mnemonicCode.equals(other$mnemonicCode)) {
            return false;
        }
        String string156 = this.getProductVendorName();
        String string157 = other.getProductVendorName();
        if (this$productVendorName == null ? other$productVendorName != null : !this$productVendorName.equals(other$productVendorName)) {
            return false;
        }
        String string158 = this.getProductBuyer();
        String string159 = other.getProductBuyer();
        if (this$productBuyer == null ? other$productBuyer != null : !this$productBuyer.equals(other$productBuyer)) {
            return false;
        }
        String string160 = this.getProductBuyerName();
        String string161 = other.getProductBuyerName();
        if (this$productBuyerName == null ? other$productBuyerName != null : !this$productBuyerName.equals(other$productBuyerName)) {
            return false;
        }
        String string162 = this.getWarehouseManager();
        String string163 = other.getWarehouseManager();
        if (this$warehouseManager == null ? other$warehouseManager != null : !this$warehouseManager.equals(other$warehouseManager)) {
            return false;
        }
        String string164 = this.getWarehouseManagerName();
        String string165 = other.getWarehouseManagerName();
        if (this$warehouseManagerName == null ? other$warehouseManagerName != null : !this$warehouseManagerName.equals(other$warehouseManagerName)) {
            return false;
        }
        String string166 = this.getDescription();
        String string167 = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        String string168 = this.getMobileDescription();
        String string169 = other.getMobileDescription();
        if (this$mobileDescription == null ? other$mobileDescription != null : !this$mobileDescription.equals(other$mobileDescription)) {
            return false;
        }
        String string170 = this.getMedSunshinePurchaseNo();
        String string171 = other.getMedSunshinePurchaseNo();
        if (this$medSunshinePurchaseNo == null ? other$medSunshinePurchaseNo != null : !this$medSunshinePurchaseNo.equals(other$medSunshinePurchaseNo)) {
            return false;
        }
        String string172 = this.getMedRegistrationNo();
        String string173 = other.getMedRegistrationNo();
        if (this$medRegistrationNo == null ? other$medRegistrationNo != null : !this$medRegistrationNo.equals(other$medRegistrationNo)) {
            return false;
        }
        String string174 = this.getUrl();
        String string175 = other.getUrl();
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) {
            return false;
        }
        String string176 = this.getTitleMemo();
        String string177 = other.getTitleMemo();
        if (this$titleMemo == null ? other$titleMemo != null : !this$titleMemo.equals(other$titleMemo)) {
            return false;
        }
        BigDecimal bigDecimal77 = this.getInventoryCount();
        BigDecimal bigDecimal78 = other.getInventoryCount();
        if (this$inventoryCount == null ? other$inventoryCount != null : !this$inventoryCount.equals(other$inventoryCount)) {
            return false;
        }
        List<ProductAlbumVO> list = this.getProductAlbums();
        List<ProductAlbumVO> list2 = other.getProductAlbums();
        if (this$productAlbums == null ? other$productAlbums != null : !this$productAlbums.equals(other$productAlbums)) {
            return false;
        }
        List<ProductAttachmentVO> list3 = this.getProductAttachments();
        List<ProductAttachmentVO> list4 = other.getProductAttachments();
        if (this$productAttachments == null ? other$productAttachments != null : !this$productAttachments.equals(other$productAttachments)) {
            return false;
        }
        List<ProductParameterExtendVO> list5 = this.getProductParams();
        List<ProductParameterExtendVO> list6 = other.getProductParams();
        if (this$productParams == null ? other$productParams != null : !this$productParams.equals(other$productParams)) {
            return false;
        }
        List<ProductSpecItemDTO> list7 = this.getProductSpecItems();
        List<ProductSpecItemDTO> list8 = other.getProductSpecItems();
        if (this$productSpecItems == null ? other$productSpecItems != null : !this$productSpecItems.equals(other$productSpecItems)) {
            return false;
        }
        String string178 = this.getProductDefine1();
        String string179 = other.getProductDefine1();
        if (this$productDefine1 == null ? other$productDefine1 != null : !this$productDefine1.equals(other$productDefine1)) {
            return false;
        }
        String string180 = this.getProductDefine2();
        String string181 = other.getProductDefine2();
        if (this$productDefine2 == null ? other$productDefine2 != null : !this$productDefine2.equals(other$productDefine2)) {
            return false;
        }
        String string182 = this.getProductDefine3();
        String string183 = other.getProductDefine3();
        if (this$productDefine3 == null ? other$productDefine3 != null : !this$productDefine3.equals(other$productDefine3)) {
            return false;
        }
        String string184 = this.getProductDefine4();
        String string185 = other.getProductDefine4();
        if (this$productDefine4 == null ? other$productDefine4 != null : !this$productDefine4.equals(other$productDefine4)) {
            return false;
        }
        String string186 = this.getProductDefine5();
        String string187 = other.getProductDefine5();
        if (this$productDefine5 == null ? other$productDefine5 != null : !this$productDefine5.equals(other$productDefine5)) {
            return false;
        }
        String string188 = this.getProductDefine6();
        String string189 = other.getProductDefine6();
        if (this$productDefine6 == null ? other$productDefine6 != null : !this$productDefine6.equals(other$productDefine6)) {
            return false;
        }
        String string190 = this.getProductDefine7();
        String string191 = other.getProductDefine7();
        if (this$productDefine7 == null ? other$productDefine7 != null : !this$productDefine7.equals(other$productDefine7)) {
            return false;
        }
        String string192 = this.getProductDefine8();
        String string193 = other.getProductDefine8();
        if (this$productDefine8 == null ? other$productDefine8 != null : !this$productDefine8.equals(other$productDefine8)) {
            return false;
        }
        String string194 = this.getProductDefine9();
        String string195 = other.getProductDefine9();
        if (this$productDefine9 == null ? other$productDefine9 != null : !this$productDefine9.equals(other$productDefine9)) {
            return false;
        }
        String string196 = this.getProductDefine10();
        String string197 = other.getProductDefine10();
        if (this$productDefine10 == null ? other$productDefine10 != null : !this$productDefine10.equals(other$productDefine10)) {
            return false;
        }
        String string198 = this.getProductDefine11();
        String string199 = other.getProductDefine11();
        if (this$productDefine11 == null ? other$productDefine11 != null : !this$productDefine11.equals(other$productDefine11)) {
            return false;
        }
        String string200 = this.getProductDefine12();
        String string201 = other.getProductDefine12();
        if (this$productDefine12 == null ? other$productDefine12 != null : !this$productDefine12.equals(other$productDefine12)) {
            return false;
        }
        String string202 = this.getProductDefine13();
        String string203 = other.getProductDefine13();
        if (this$productDefine13 == null ? other$productDefine13 != null : !this$productDefine13.equals(other$productDefine13)) {
            return false;
        }
        String string204 = this.getProductDefine14();
        String string205 = other.getProductDefine14();
        if (this$productDefine14 == null ? other$productDefine14 != null : !this$productDefine14.equals(other$productDefine14)) {
            return false;
        }
        String string206 = this.getProductDefine15();
        String string207 = other.getProductDefine15();
        if (this$productDefine15 == null ? other$productDefine15 != null : !this$productDefine15.equals(other$productDefine15)) {
            return false;
        }
        String string208 = this.getProductDefine16();
        String string209 = other.getProductDefine16();
        if (this$productDefine16 == null ? other$productDefine16 != null : !this$productDefine16.equals(other$productDefine16)) {
            return false;
        }
        String string210 = this.getProductDefine17();
        String string211 = other.getProductDefine17();
        if (this$productDefine17 == null ? other$productDefine17 != null : !this$productDefine17.equals(other$productDefine17)) {
            return false;
        }
        String string212 = this.getProductDefine18();
        String string213 = other.getProductDefine18();
        if (this$productDefine18 == null ? other$productDefine18 != null : !this$productDefine18.equals(other$productDefine18)) {
            return false;
        }
        String string214 = this.getProductDefine19();
        String string215 = other.getProductDefine19();
        if (this$productDefine19 == null ? other$productDefine19 != null : !this$productDefine19.equals(other$productDefine19)) {
            return false;
        }
        String string216 = this.getProductDefine20();
        String string217 = other.getProductDefine20();
        if (this$productDefine20 == null ? other$productDefine20 != null : !this$productDefine20.equals(other$productDefine20)) {
            return false;
        }
        String string218 = this.getProductDefine21();
        String string219 = other.getProductDefine21();
        if (this$productDefine21 == null ? other$productDefine21 != null : !this$productDefine21.equals(other$productDefine21)) {
            return false;
        }
        String string220 = this.getProductDefine22();
        String string221 = other.getProductDefine22();
        if (this$productDefine22 == null ? other$productDefine22 != null : !this$productDefine22.equals(other$productDefine22)) {
            return false;
        }
        String string222 = this.getProductDefine23();
        String string223 = other.getProductDefine23();
        if (this$productDefine23 == null ? other$productDefine23 != null : !this$productDefine23.equals(other$productDefine23)) {
            return false;
        }
        String string224 = this.getProductDefine24();
        String string225 = other.getProductDefine24();
        if (this$productDefine24 == null ? other$productDefine24 != null : !this$productDefine24.equals(other$productDefine24)) {
            return false;
        }
        String string226 = this.getProductDefine25();
        String string227 = other.getProductDefine25();
        if (this$productDefine25 == null ? other$productDefine25 != null : !this$productDefine25.equals(other$productDefine25)) {
            return false;
        }
        String string228 = this.getProductDefine26();
        String string229 = other.getProductDefine26();
        if (this$productDefine26 == null ? other$productDefine26 != null : !this$productDefine26.equals(other$productDefine26)) {
            return false;
        }
        String string230 = this.getProductDefine27();
        String string231 = other.getProductDefine27();
        if (this$productDefine27 == null ? other$productDefine27 != null : !this$productDefine27.equals(other$productDefine27)) {
            return false;
        }
        String string232 = this.getProductDefine28();
        String string233 = other.getProductDefine28();
        if (this$productDefine28 == null ? other$productDefine28 != null : !this$productDefine28.equals(other$productDefine28)) {
            return false;
        }
        String string234 = this.getProductDefine29();
        String string235 = other.getProductDefine29();
        if (this$productDefine29 == null ? other$productDefine29 != null : !this$productDefine29.equals(other$productDefine29)) {
            return false;
        }
        String string236 = this.getProductDefine30();
        String string237 = other.getProductDefine30();
        if (this$productDefine30 == null ? other$productDefine30 != null : !this$productDefine30.equals(other$productDefine30)) {
            return false;
        }
        String string238 = this.getProductFreeDefine1();
        String string239 = other.getProductFreeDefine1();
        if (this$productFreeDefine1 == null ? other$productFreeDefine1 != null : !this$productFreeDefine1.equals(other$productFreeDefine1)) {
            return false;
        }
        String string240 = this.getProductFreeDefine2();
        String string241 = other.getProductFreeDefine2();
        if (this$productFreeDefine2 == null ? other$productFreeDefine2 != null : !this$productFreeDefine2.equals(other$productFreeDefine2)) {
            return false;
        }
        String string242 = this.getProductFreeDefine3();
        String string243 = other.getProductFreeDefine3();
        if (this$productFreeDefine3 == null ? other$productFreeDefine3 != null : !this$productFreeDefine3.equals(other$productFreeDefine3)) {
            return false;
        }
        String string244 = this.getProductFreeDefine4();
        String string245 = other.getProductFreeDefine4();
        if (this$productFreeDefine4 == null ? other$productFreeDefine4 != null : !this$productFreeDefine4.equals(other$productFreeDefine4)) {
            return false;
        }
        String string246 = this.getProductFreeDefine5();
        String string247 = other.getProductFreeDefine5();
        if (this$productFreeDefine5 == null ? other$productFreeDefine5 != null : !this$productFreeDefine5.equals(other$productFreeDefine5)) {
            return false;
        }
        String string248 = this.getProductFreeDefine6();
        String string249 = other.getProductFreeDefine6();
        if (this$productFreeDefine6 == null ? other$productFreeDefine6 != null : !this$productFreeDefine6.equals(other$productFreeDefine6)) {
            return false;
        }
        String string250 = this.getProductFreeDefine7();
        String string251 = other.getProductFreeDefine7();
        if (this$productFreeDefine7 == null ? other$productFreeDefine7 != null : !this$productFreeDefine7.equals(other$productFreeDefine7)) {
            return false;
        }
        String string252 = this.getProductFreeDefine8();
        String string253 = other.getProductFreeDefine8();
        if (this$productFreeDefine8 == null ? other$productFreeDefine8 != null : !this$productFreeDefine8.equals(other$productFreeDefine8)) {
            return false;
        }
        String string254 = this.getProductFreeDefine9();
        String string255 = other.getProductFreeDefine9();
        if (this$productFreeDefine9 == null ? other$productFreeDefine9 != null : !this$productFreeDefine9.equals(other$productFreeDefine9)) {
            return false;
        }
        String string256 = this.getProductFreeDefine10();
        String string257 = other.getProductFreeDefine10();
        if (this$productFreeDefine10 == null ? other$productFreeDefine10 != null : !this$productFreeDefine10.equals(other$productFreeDefine10)) {
            return false;
        }
        String string258 = this.getProductFreeDefine11();
        String string259 = other.getProductFreeDefine11();
        if (this$productFreeDefine11 == null ? other$productFreeDefine11 != null : !this$productFreeDefine11.equals(other$productFreeDefine11)) {
            return false;
        }
        String string260 = this.getProductFreeDefine12();
        String string261 = other.getProductFreeDefine12();
        if (this$productFreeDefine12 == null ? other$productFreeDefine12 != null : !this$productFreeDefine12.equals(other$productFreeDefine12)) {
            return false;
        }
        String string262 = this.getProductFreeDefine13();
        String string263 = other.getProductFreeDefine13();
        if (this$productFreeDefine13 == null ? other$productFreeDefine13 != null : !this$productFreeDefine13.equals(other$productFreeDefine13)) {
            return false;
        }
        String string264 = this.getProductFreeDefine14();
        String string265 = other.getProductFreeDefine14();
        if (this$productFreeDefine14 == null ? other$productFreeDefine14 != null : !this$productFreeDefine14.equals(other$productFreeDefine14)) {
            return false;
        }
        String string266 = this.getProductFreeDefine15();
        String string267 = other.getProductFreeDefine15();
        if (this$productFreeDefine15 == null ? other$productFreeDefine15 != null : !this$productFreeDefine15.equals(other$productFreeDefine15)) {
            return false;
        }
        String string268 = this.getProductFreeDefine16();
        String string269 = other.getProductFreeDefine16();
        if (this$productFreeDefine16 == null ? other$productFreeDefine16 != null : !this$productFreeDefine16.equals(other$productFreeDefine16)) {
            return false;
        }
        String string270 = this.getProductFreeDefine17();
        String string271 = other.getProductFreeDefine17();
        if (this$productFreeDefine17 == null ? other$productFreeDefine17 != null : !this$productFreeDefine17.equals(other$productFreeDefine17)) {
            return false;
        }
        String string272 = this.getProductFreeDefine18();
        String string273 = other.getProductFreeDefine18();
        if (this$productFreeDefine18 == null ? other$productFreeDefine18 != null : !this$productFreeDefine18.equals(other$productFreeDefine18)) {
            return false;
        }
        String string274 = this.getProductFreeDefine19();
        String string275 = other.getProductFreeDefine19();
        if (this$productFreeDefine19 == null ? other$productFreeDefine19 != null : !this$productFreeDefine19.equals(other$productFreeDefine19)) {
            return false;
        }
        String string276 = this.getProductFreeDefine20();
        String string277 = other.getProductFreeDefine20();
        if (this$productFreeDefine20 == null ? other$productFreeDefine20 != null : !this$productFreeDefine20.equals(other$productFreeDefine20)) {
            return false;
        }
        String string278 = this.getProductFreeDefine21();
        String string279 = other.getProductFreeDefine21();
        if (this$productFreeDefine21 == null ? other$productFreeDefine21 != null : !this$productFreeDefine21.equals(other$productFreeDefine21)) {
            return false;
        }
        String string280 = this.getProductFreeDefine22();
        String string281 = other.getProductFreeDefine22();
        if (this$productFreeDefine22 == null ? other$productFreeDefine22 != null : !this$productFreeDefine22.equals(other$productFreeDefine22)) {
            return false;
        }
        String string282 = this.getProductFreeDefine23();
        String string283 = other.getProductFreeDefine23();
        if (this$productFreeDefine23 == null ? other$productFreeDefine23 != null : !this$productFreeDefine23.equals(other$productFreeDefine23)) {
            return false;
        }
        String string284 = this.getProductFreeDefine24();
        String string285 = other.getProductFreeDefine24();
        if (this$productFreeDefine24 == null ? other$productFreeDefine24 != null : !this$productFreeDefine24.equals(other$productFreeDefine24)) {
            return false;
        }
        String string286 = this.getProductFreeDefine25();
        String string287 = other.getProductFreeDefine25();
        if (this$productFreeDefine25 == null ? other$productFreeDefine25 != null : !this$productFreeDefine25.equals(other$productFreeDefine25)) {
            return false;
        }
        String string288 = this.getProductFreeDefine26();
        String string289 = other.getProductFreeDefine26();
        if (this$productFreeDefine26 == null ? other$productFreeDefine26 != null : !this$productFreeDefine26.equals(other$productFreeDefine26)) {
            return false;
        }
        String string290 = this.getProductFreeDefine27();
        String string291 = other.getProductFreeDefine27();
        if (this$productFreeDefine27 == null ? other$productFreeDefine27 != null : !this$productFreeDefine27.equals(other$productFreeDefine27)) {
            return false;
        }
        String string292 = this.getProductFreeDefine28();
        String string293 = other.getProductFreeDefine28();
        if (this$productFreeDefine28 == null ? other$productFreeDefine28 != null : !this$productFreeDefine28.equals(other$productFreeDefine28)) {
            return false;
        }
        String string294 = this.getProductFreeDefine29();
        String string295 = other.getProductFreeDefine29();
        if (this$productFreeDefine29 == null ? other$productFreeDefine29 != null : !this$productFreeDefine29.equals(other$productFreeDefine29)) {
            return false;
        }
        String string296 = this.getProductFreeDefine30();
        String string297 = other.getProductFreeDefine30();
        if (this$productFreeDefine30 == null ? other$productFreeDefine30 != null : !this$productFreeDefine30.equals(other$productFreeDefine30)) {
            return false;
        }
        String string298 = this.getFree1();
        String string299 = other.getFree1();
        if (this$free1 == null ? other$free1 != null : !this$free1.equals(other$free1)) {
            return false;
        }
        String string300 = this.getFree2();
        String string301 = other.getFree2();
        if (this$free2 == null ? other$free2 != null : !this$free2.equals(other$free2)) {
            return false;
        }
        String string302 = this.getFree3();
        String string303 = other.getFree3();
        if (this$free3 == null ? other$free3 != null : !this$free3.equals(other$free3)) {
            return false;
        }
        String string304 = this.getFree4();
        String string305 = other.getFree4();
        if (this$free4 == null ? other$free4 != null : !this$free4.equals(other$free4)) {
            return false;
        }
        String string306 = this.getFree5();
        String string307 = other.getFree5();
        if (this$free5 == null ? other$free5 != null : !this$free5.equals(other$free5)) {
            return false;
        }
        String string308 = this.getFree6();
        String string309 = other.getFree6();
        if (this$free6 == null ? other$free6 != null : !this$free6.equals(other$free6)) {
            return false;
        }
        String string310 = this.getFree7();
        String string311 = other.getFree7();
        if (this$free7 == null ? other$free7 != null : !this$free7.equals(other$free7)) {
            return false;
        }
        String string312 = this.getFree8();
        String string313 = other.getFree8();
        if (this$free8 == null ? other$free8 != null : !this$free8.equals(other$free8)) {
            return false;
        }
        String string314 = this.getFree9();
        String string315 = other.getFree9();
        if (this$free9 == null ? other$free9 != null : !this$free9.equals(other$free9)) {
            return false;
        }
        String string316 = this.getFree10();
        String string317 = other.getFree10();
        if (this$free10 == null ? other$free10 != null : !this$free10.equals(other$free10)) {
            return false;
        }
        String string318 = this.getMaterialStatus();
        String string319 = other.getMaterialStatus();
        if (this$materialStatus == null ? other$materialStatus != null : !this$materialStatus.equals(other$materialStatus)) {
            return false;
        }
        String string320 = this.getOrgMaterialStatus();
        String string321 = other.getOrgMaterialStatus();
        if (this$orgMaterialStatus == null ? other$orgMaterialStatus != null : !this$orgMaterialStatus.equals(other$orgMaterialStatus)) {
            return false;
        }
        List<CharacterDTO> list9 = this.getCharacterDTOList();
        List<CharacterDTO> list10 = other.getCharacterDTOList();
        return !(this$characterDTOList == null ? other$characterDTOList != null : !this$characterDTOList.equals(other$characterDTOList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductBaseDTO;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
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
        void $inventoryCount;
        void $titleMemo;
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
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
        Long $manageClass = this.getManageClass();
        result = result * 59 + ($manageClass == null ? 43 : ((Object)$manageClass).hashCode());
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
        String $createOrgId = this.getCreateOrgId();
        result = result * 59 + ($createOrgId == null ? 43 : $createOrgId.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $orgType = this.getOrgType();
        result = result * 59 + ($orgType == null ? 43 : $orgType.hashCode());
        String $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : $tenantId.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
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
        String $productPropCharacterDefine = this.getProductPropCharacterDefine();
        result = result * 59 + ($productPropCharacterDefine == null ? 43 : $productPropCharacterDefine.hashCode());
        HashMap<String, Object> $productPropCharacterDefineMap = this.getProductPropCharacterDefineMap();
        result = result * 59 + ($productPropCharacterDefineMap == null ? 43 : ((Object)$productPropCharacterDefineMap).hashCode());
        BigDecimal $unitConvertCoefficient = this.getUnitConvertCoefficient();
        result = result * 59 + ($unitConvertCoefficient == null ? 43 : ((Object)$unitConvertCoefficient).hashCode());
        String $modelDescription = this.getModelDescription();
        result = result * 59 + ($modelDescription == null ? 43 : $modelDescription.hashCode());
        String $model = this.getModel();
        result = result * 59 + ($model == null ? 43 : $model.hashCode());
        String $manageClassPath = this.getManageClassPath();
        result = result * 59 + ($manageClassPath == null ? 43 : $manageClassPath.hashCode());
        String $manageClassCode = this.getManageClassCode();
        result = result * 59 + ($manageClassCode == null ? 43 : $manageClassCode.hashCode());
        String $manageClassName = this.getManageClassName();
        result = result * 59 + ($manageClassName == null ? 43 : $manageClassName.hashCode());
        String $costClassCode = this.getCostClassCode();
        result = result * 59 + ($costClassCode == null ? 43 : $costClassCode.hashCode());
        String $costClassName = this.getCostClassName();
        result = result * 59 + ($costClassName == null ? 43 : $costClassName.hashCode());
        String $brandCode = this.getBrandCode();
        result = result * 59 + ($brandCode == null ? 43 : $brandCode.hashCode());
        String $brandName = this.getBrandName();
        result = result * 59 + ($brandName == null ? 43 : $brandName.hashCode());
        String $platformCode = this.getPlatformCode();
        result = result * 59 + ($platformCode == null ? 43 : $platformCode.hashCode());
        String $placeOfOrigin = this.getPlaceOfOrigin();
        result = result * 59 + ($placeOfOrigin == null ? 43 : $placeOfOrigin.hashCode());
        String $productLineCode = this.getProductLineCode();
        result = result * 59 + ($productLineCode == null ? 43 : $productLineCode.hashCode());
        String $productLineName = this.getProductLineName();
        result = result * 59 + ($productLineName == null ? 43 : $productLineName.hashCode());
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
        String $upuPurchasePriceUnitName = this.getUpuPurchasePriceUnitName();
        result = result * 59 + ($upuPurchasePriceUnitName == null ? 43 : $upuPurchasePriceUnitName.hashCode());
        BigDecimal $upuPurchaseTimes = this.getUpuPurchaseTimes();
        result = result * 59 + ($upuPurchaseTimes == null ? 43 : ((Object)$upuPurchaseTimes).hashCode());
        BigDecimal $upuPurchaseOrderQuantity = this.getUpuPurchaseOrderQuantity();
        result = result * 59 + ($upuPurchaseOrderQuantity == null ? 43 : ((Object)$upuPurchaseOrderQuantity).hashCode());
        BigDecimal $saleMinOrderQuantity = this.getSaleMinOrderQuantity();
        result = result * 59 + ($saleMinOrderQuantity == null ? 43 : ((Object)$saleMinOrderQuantity).hashCode());
        BigDecimal $saleDoubleSale = this.getSaleDoubleSale();
        result = result * 59 + ($saleDoubleSale == null ? 43 : ((Object)$saleDoubleSale).hashCode());
        String $saleChannel = this.getSaleChannel();
        result = result * 59 + ($saleChannel == null ? 43 : $saleChannel.hashCode());
        String $saleProductClassCode = this.getSaleProductClassCode();
        result = result * 59 + ($saleProductClassCode == null ? 43 : $saleProductClassCode.hashCode());
        String $saleProductClassName = this.getSaleProductClassName();
        result = result * 59 + ($saleProductClassName == null ? 43 : $saleProductClassName.hashCode());
        String $saleProductClassPath = this.getSaleProductClassPath();
        result = result * 59 + ($saleProductClassPath == null ? 43 : $saleProductClassPath.hashCode());
        String $stockOmsWarehouse = this.getStockOmsWarehouse();
        result = result * 59 + ($stockOmsWarehouse == null ? 43 : $stockOmsWarehouse.hashCode());
        String $stockExpiryDateCalculationMethod = this.getStockExpiryDateCalculationMethod();
        result = result * 59 + ($stockExpiryDateCalculationMethod == null ? 43 : $stockExpiryDateCalculationMethod.hashCode());
        String $stockExpireDateNo = this.getStockExpireDateNo();
        result = result * 59 + ($stockExpireDateNo == null ? 43 : $stockExpireDateNo.hashCode());
        String $stockExpireDateUnit = this.getStockExpireDateUnit();
        result = result * 59 + ($stockExpireDateUnit == null ? 43 : $stockExpireDateUnit.hashCode());
        String $stockDaysBeforeValidityReject = this.getStockDaysBeforeValidityReject();
        result = result * 59 + ($stockDaysBeforeValidityReject == null ? 43 : $stockDaysBeforeValidityReject.hashCode());
        String $stockValidityWarningDays = this.getStockValidityWarningDays();
        result = result * 59 + ($stockValidityWarningDays == null ? 43 : $stockValidityWarningDays.hashCode());
        BigDecimal $stockSafetyStock = this.getStockSafetyStock();
        result = result * 59 + ($stockSafetyStock == null ? 43 : ((Object)$stockSafetyStock).hashCode());
        BigDecimal $stockHighestStock = this.getStockHighestStock();
        result = result * 59 + ($stockHighestStock == null ? 43 : ((Object)$stockHighestStock).hashCode());
        BigDecimal $stockLowestStock = this.getStockLowestStock();
        result = result * 59 + ($stockLowestStock == null ? 43 : ((Object)$stockLowestStock).hashCode());
        BigDecimal $stockRopStock = this.getStockRopStock();
        result = result * 59 + ($stockRopStock == null ? 43 : ((Object)$stockRopStock).hashCode());
        String $stockDeliveryWarehouseName = this.getStockDeliveryWarehouseName();
        result = result * 59 + ($stockDeliveryWarehouseName == null ? 43 : $stockDeliveryWarehouseName.hashCode());
        String $stockReturnWarehouseName = this.getStockReturnWarehouseName();
        result = result * 59 + ($stockReturnWarehouseName == null ? 43 : $stockReturnWarehouseName.hashCode());
        String $stockReceiptWarehouseName = this.getStockReceiptWarehouseName();
        result = result * 59 + ($stockReceiptWarehouseName == null ? 43 : $stockReceiptWarehouseName.hashCode());
        BigDecimal $stockInStoreExcessLimit = this.getStockInStoreExcessLimit();
        result = result * 59 + ($stockInStoreExcessLimit == null ? 43 : ((Object)$stockInStoreExcessLimit).hashCode());
        BigDecimal $stockOutStoreExcessLimit = this.getStockOutStoreExcessLimit();
        result = result * 59 + ($stockOutStoreExcessLimit == null ? 43 : ((Object)$stockOutStoreExcessLimit).hashCode());
        BigDecimal $stockInStoreLessLimit = this.getStockInStoreLessLimit();
        result = result * 59 + ($stockInStoreLessLimit == null ? 43 : ((Object)$stockInStoreLessLimit).hashCode());
        BigDecimal $stockOutStoreLessLimit = this.getStockOutStoreLessLimit();
        result = result * 59 + ($stockOutStoreLessLimit == null ? 43 : ((Object)$stockOutStoreLessLimit).hashCode());
        BigDecimal $stockStorageLossRate = this.getStockStorageLossRate();
        result = result * 59 + ($stockStorageLossRate == null ? 43 : ((Object)$stockStorageLossRate).hashCode());
        String $stockStockUnitCode = this.getStockStockUnitCode();
        result = result * 59 + ($stockStockUnitCode == null ? 43 : $stockStockUnitCode.hashCode());
        String $stockStockUnitName = this.getStockStockUnitName();
        result = result * 59 + ($stockStockUnitName == null ? 43 : $stockStockUnitName.hashCode());
        String $edProduceDepartmentNew = this.getEdProduceDepartmentNew();
        result = result * 59 + ($edProduceDepartmentNew == null ? 43 : $edProduceDepartmentNew.hashCode());
        String $edWeigh = this.getEdWeigh();
        result = result * 59 + ($edWeigh == null ? 43 : $edWeigh.hashCode());
        String $edEngineeringDrawingNo = this.getEdEngineeringDrawingNo();
        result = result * 59 + ($edEngineeringDrawingNo == null ? 43 : $edEngineeringDrawingNo.hashCode());
        String $edECNControl = this.getEdECNControl();
        result = result * 59 + ($edECNControl == null ? 43 : $edECNControl.hashCode());
        String $edPlanDefaultAttribute = this.getEdPlanDefaultAttribute();
        result = result * 59 + ($edPlanDefaultAttribute == null ? 43 : $edPlanDefaultAttribute.hashCode());
        String $edPlanMethod = this.getEdPlanMethod();
        result = result * 59 + ($edPlanMethod == null ? 43 : $edPlanMethod.hashCode());
        String $edManufacturePlanner = this.getEdManufacturePlanner();
        result = result * 59 + ($edManufacturePlanner == null ? 43 : $edManufacturePlanner.hashCode());
        BigDecimal $edPlanProduceLimit = this.getEdPlanProduceLimit();
        result = result * 59 + ($edPlanProduceLimit == null ? 43 : ((Object)$edPlanProduceLimit).hashCode());
        String $edKeySubPart = this.getEdKeySubPart();
        result = result * 59 + ($edKeySubPart == null ? 43 : $edKeySubPart.hashCode());
        String $edBOMType = this.getEdBOMType();
        result = result * 59 + ($edBOMType == null ? 43 : $edBOMType.hashCode());
        String $edBOMSource = this.getEdBOMSource();
        result = result * 59 + ($edBOMSource == null ? 43 : $edBOMSource.hashCode());
        String $edBatchRule = this.getEdBatchRule();
        result = result * 59 + ($edBatchRule == null ? 43 : $edBatchRule.hashCode());
        BigDecimal $edEconomicQuantity = this.getEdEconomicQuantity();
        result = result * 59 + ($edEconomicQuantity == null ? 43 : ((Object)$edEconomicQuantity).hashCode());
        BigDecimal $edFixedQuantity = this.getEdFixedQuantity();
        result = result * 59 + ($edFixedQuantity == null ? 43 : ((Object)$edFixedQuantity).hashCode());
        BigDecimal $edBatchDouble = this.getEdBatchDouble();
        result = result * 59 + ($edBatchDouble == null ? 43 : ((Object)$edBatchDouble).hashCode());
        BigDecimal $edLeadTimeCoefficient = this.getEdLeadTimeCoefficient();
        result = result * 59 + ($edLeadTimeCoefficient == null ? 43 : ((Object)$edLeadTimeCoefficient).hashCode());
        BigDecimal $edLeadTimeQuantity = this.getEdLeadTimeQuantity();
        result = result * 59 + ($edLeadTimeQuantity == null ? 43 : ((Object)$edLeadTimeQuantity).hashCode());
        String $edFixedWastage = this.getEdFixedWastage();
        result = result * 59 + ($edFixedWastage == null ? 43 : $edFixedWastage.hashCode());
        BigDecimal $edRejectRate = this.getEdRejectRate();
        result = result * 59 + ($edRejectRate == null ? 43 : ((Object)$edRejectRate).hashCode());
        String $edProduceUnitCode = this.getEdProduceUnitCode();
        result = result * 59 + ($edProduceUnitCode == null ? 43 : $edProduceUnitCode.hashCode());
        String $edProduceUnitName = this.getEdProduceUnitName();
        result = result * 59 + ($edProduceUnitName == null ? 43 : $edProduceUnitName.hashCode());
        String $edProduceUnitPercision = this.getEdProduceUnitPercision();
        result = result * 59 + ($edProduceUnitPercision == null ? 43 : $edProduceUnitPercision.hashCode());
        BigDecimal $fiNoTaxCostPrice = this.getFiNoTaxCostPrice();
        result = result * 59 + ($fiNoTaxCostPrice == null ? 43 : ((Object)$fiNoTaxCostPrice).hashCode());
        String $taxClass = this.getTaxClass();
        result = result * 59 + ($taxClass == null ? 43 : $taxClass.hashCode());
        String $taxClassCode = this.getTaxClassCode();
        result = result * 59 + ($taxClassCode == null ? 43 : $taxClassCode.hashCode());
        String $taxClassName = this.getTaxClassName();
        result = result * 59 + ($taxClassName == null ? 43 : $taxClassName.hashCode());
        String $taxClassSimpleName = this.getTaxClassSimpleName();
        result = result * 59 + ($taxClassSimpleName == null ? 43 : $taxClassSimpleName.hashCode());
        String $fiReceiptName = this.getFiReceiptName();
        result = result * 59 + ($fiReceiptName == null ? 43 : $fiReceiptName.hashCode());
        String $fiInTaxrate = this.getFiInTaxrate();
        result = result * 59 + ($fiInTaxrate == null ? 43 : $fiInTaxrate.hashCode());
        String $noTaxation = this.getNoTaxation();
        result = result * 59 + ($noTaxation == null ? 43 : $noTaxation.hashCode());
        String $fiOutTaxrate = this.getFiOutTaxrate();
        result = result * 59 + ($fiOutTaxrate == null ? 43 : $fiOutTaxrate.hashCode());
        String $fiPreferentialPolicyTypeName = this.getFiPreferentialPolicyTypeName();
        result = result * 59 + ($fiPreferentialPolicyTypeName == null ? 43 : $fiPreferentialPolicyTypeName.hashCode());
        String $receiptSpec = this.getReceiptSpec();
        result = result * 59 + ($receiptSpec == null ? 43 : $receiptSpec.hashCode());
        String $receiptModel = this.getReceiptModel();
        result = result * 59 + ($receiptModel == null ? 43 : $receiptModel.hashCode());
        String $realProductAttribute = this.getRealProductAttribute();
        result = result * 59 + ($realProductAttribute == null ? 43 : $realProductAttribute.hashCode());
        String $realProductAttributeType = this.getRealProductAttributeType();
        result = result * 59 + ($realProductAttributeType == null ? 43 : $realProductAttributeType.hashCode());
        String $virtualProductAttribute = this.getVirtualProductAttribute();
        result = result * 59 + ($virtualProductAttribute == null ? 43 : $virtualProductAttribute.hashCode());
        String $businessAttribute = this.getBusinessAttribute();
        result = result * 59 + ($businessAttribute == null ? 43 : $businessAttribute.hashCode());
        String $productTemplateName = this.getProductTemplateName();
        result = result * 59 + ($productTemplateName == null ? 43 : $productTemplateName.hashCode());
        String $depositPayType = this.getDepositPayType();
        result = result * 59 + ($depositPayType == null ? 43 : $depositPayType.hashCode());
        String $minimumDeposits = this.getMinimumDeposits();
        result = result * 59 + ($minimumDeposits == null ? 43 : $minimumDeposits.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $mnemonicCode = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : $mnemonicCode.hashCode());
        String $productVendorName = this.getProductVendorName();
        result = result * 59 + ($productVendorName == null ? 43 : $productVendorName.hashCode());
        String $productBuyer = this.getProductBuyer();
        result = result * 59 + ($productBuyer == null ? 43 : $productBuyer.hashCode());
        String $productBuyerName = this.getProductBuyerName();
        result = result * 59 + ($productBuyerName == null ? 43 : $productBuyerName.hashCode());
        String $warehouseManager = this.getWarehouseManager();
        result = result * 59 + ($warehouseManager == null ? 43 : $warehouseManager.hashCode());
        String $warehouseManagerName = this.getWarehouseManagerName();
        result = result * 59 + ($warehouseManagerName == null ? 43 : $warehouseManagerName.hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        String $mobileDescription = this.getMobileDescription();
        result = result * 59 + ($mobileDescription == null ? 43 : $mobileDescription.hashCode());
        String $medSunshinePurchaseNo = this.getMedSunshinePurchaseNo();
        result = result * 59 + ($medSunshinePurchaseNo == null ? 43 : $medSunshinePurchaseNo.hashCode());
        String $medRegistrationNo = this.getMedRegistrationNo();
        result = result * 59 + ($medRegistrationNo == null ? 43 : $medRegistrationNo.hashCode());
        String $url = this.getUrl();
        result = result * 59 + ($url == null ? 43 : $url.hashCode());
        String string = this.getTitleMemo();
        result = result * 59 + ($titleMemo == null ? 43 : $titleMemo.hashCode());
        BigDecimal bigDecimal = this.getInventoryCount();
        result = result * 59 + ($inventoryCount == null ? 43 : $inventoryCount.hashCode());
        List<ProductAlbumVO> list = this.getProductAlbums();
        result = result * 59 + ($productAlbums == null ? 43 : $productAlbums.hashCode());
        List<ProductAttachmentVO> list2 = this.getProductAttachments();
        result = result * 59 + ($productAttachments == null ? 43 : $productAttachments.hashCode());
        List<ProductParameterExtendVO> list3 = this.getProductParams();
        result = result * 59 + ($productParams == null ? 43 : $productParams.hashCode());
        List<ProductSpecItemDTO> list4 = this.getProductSpecItems();
        result = result * 59 + ($productSpecItems == null ? 43 : $productSpecItems.hashCode());
        String string2 = this.getProductDefine1();
        result = result * 59 + ($productDefine1 == null ? 43 : $productDefine1.hashCode());
        String string3 = this.getProductDefine2();
        result = result * 59 + ($productDefine2 == null ? 43 : $productDefine2.hashCode());
        String string4 = this.getProductDefine3();
        result = result * 59 + ($productDefine3 == null ? 43 : $productDefine3.hashCode());
        String string5 = this.getProductDefine4();
        result = result * 59 + ($productDefine4 == null ? 43 : $productDefine4.hashCode());
        String string6 = this.getProductDefine5();
        result = result * 59 + ($productDefine5 == null ? 43 : $productDefine5.hashCode());
        String string7 = this.getProductDefine6();
        result = result * 59 + ($productDefine6 == null ? 43 : $productDefine6.hashCode());
        String string8 = this.getProductDefine7();
        result = result * 59 + ($productDefine7 == null ? 43 : $productDefine7.hashCode());
        String string9 = this.getProductDefine8();
        result = result * 59 + ($productDefine8 == null ? 43 : $productDefine8.hashCode());
        String string10 = this.getProductDefine9();
        result = result * 59 + ($productDefine9 == null ? 43 : $productDefine9.hashCode());
        String string11 = this.getProductDefine10();
        result = result * 59 + ($productDefine10 == null ? 43 : $productDefine10.hashCode());
        String string12 = this.getProductDefine11();
        result = result * 59 + ($productDefine11 == null ? 43 : $productDefine11.hashCode());
        String string13 = this.getProductDefine12();
        result = result * 59 + ($productDefine12 == null ? 43 : $productDefine12.hashCode());
        String string14 = this.getProductDefine13();
        result = result * 59 + ($productDefine13 == null ? 43 : $productDefine13.hashCode());
        String string15 = this.getProductDefine14();
        result = result * 59 + ($productDefine14 == null ? 43 : $productDefine14.hashCode());
        String string16 = this.getProductDefine15();
        result = result * 59 + ($productDefine15 == null ? 43 : $productDefine15.hashCode());
        String string17 = this.getProductDefine16();
        result = result * 59 + ($productDefine16 == null ? 43 : $productDefine16.hashCode());
        String string18 = this.getProductDefine17();
        result = result * 59 + ($productDefine17 == null ? 43 : $productDefine17.hashCode());
        String string19 = this.getProductDefine18();
        result = result * 59 + ($productDefine18 == null ? 43 : $productDefine18.hashCode());
        String string20 = this.getProductDefine19();
        result = result * 59 + ($productDefine19 == null ? 43 : $productDefine19.hashCode());
        String string21 = this.getProductDefine20();
        result = result * 59 + ($productDefine20 == null ? 43 : $productDefine20.hashCode());
        String string22 = this.getProductDefine21();
        result = result * 59 + ($productDefine21 == null ? 43 : $productDefine21.hashCode());
        String string23 = this.getProductDefine22();
        result = result * 59 + ($productDefine22 == null ? 43 : $productDefine22.hashCode());
        String string24 = this.getProductDefine23();
        result = result * 59 + ($productDefine23 == null ? 43 : $productDefine23.hashCode());
        String string25 = this.getProductDefine24();
        result = result * 59 + ($productDefine24 == null ? 43 : $productDefine24.hashCode());
        String string26 = this.getProductDefine25();
        result = result * 59 + ($productDefine25 == null ? 43 : $productDefine25.hashCode());
        String string27 = this.getProductDefine26();
        result = result * 59 + ($productDefine26 == null ? 43 : $productDefine26.hashCode());
        String string28 = this.getProductDefine27();
        result = result * 59 + ($productDefine27 == null ? 43 : $productDefine27.hashCode());
        String string29 = this.getProductDefine28();
        result = result * 59 + ($productDefine28 == null ? 43 : $productDefine28.hashCode());
        String string30 = this.getProductDefine29();
        result = result * 59 + ($productDefine29 == null ? 43 : $productDefine29.hashCode());
        String string31 = this.getProductDefine30();
        result = result * 59 + ($productDefine30 == null ? 43 : $productDefine30.hashCode());
        String string32 = this.getProductFreeDefine1();
        result = result * 59 + ($productFreeDefine1 == null ? 43 : $productFreeDefine1.hashCode());
        String string33 = this.getProductFreeDefine2();
        result = result * 59 + ($productFreeDefine2 == null ? 43 : $productFreeDefine2.hashCode());
        String string34 = this.getProductFreeDefine3();
        result = result * 59 + ($productFreeDefine3 == null ? 43 : $productFreeDefine3.hashCode());
        String string35 = this.getProductFreeDefine4();
        result = result * 59 + ($productFreeDefine4 == null ? 43 : $productFreeDefine4.hashCode());
        String string36 = this.getProductFreeDefine5();
        result = result * 59 + ($productFreeDefine5 == null ? 43 : $productFreeDefine5.hashCode());
        String string37 = this.getProductFreeDefine6();
        result = result * 59 + ($productFreeDefine6 == null ? 43 : $productFreeDefine6.hashCode());
        String string38 = this.getProductFreeDefine7();
        result = result * 59 + ($productFreeDefine7 == null ? 43 : $productFreeDefine7.hashCode());
        String string39 = this.getProductFreeDefine8();
        result = result * 59 + ($productFreeDefine8 == null ? 43 : $productFreeDefine8.hashCode());
        String string40 = this.getProductFreeDefine9();
        result = result * 59 + ($productFreeDefine9 == null ? 43 : $productFreeDefine9.hashCode());
        String string41 = this.getProductFreeDefine10();
        result = result * 59 + ($productFreeDefine10 == null ? 43 : $productFreeDefine10.hashCode());
        String string42 = this.getProductFreeDefine11();
        result = result * 59 + ($productFreeDefine11 == null ? 43 : $productFreeDefine11.hashCode());
        String string43 = this.getProductFreeDefine12();
        result = result * 59 + ($productFreeDefine12 == null ? 43 : $productFreeDefine12.hashCode());
        String string44 = this.getProductFreeDefine13();
        result = result * 59 + ($productFreeDefine13 == null ? 43 : $productFreeDefine13.hashCode());
        String string45 = this.getProductFreeDefine14();
        result = result * 59 + ($productFreeDefine14 == null ? 43 : $productFreeDefine14.hashCode());
        String string46 = this.getProductFreeDefine15();
        result = result * 59 + ($productFreeDefine15 == null ? 43 : $productFreeDefine15.hashCode());
        String string47 = this.getProductFreeDefine16();
        result = result * 59 + ($productFreeDefine16 == null ? 43 : $productFreeDefine16.hashCode());
        String string48 = this.getProductFreeDefine17();
        result = result * 59 + ($productFreeDefine17 == null ? 43 : $productFreeDefine17.hashCode());
        String string49 = this.getProductFreeDefine18();
        result = result * 59 + ($productFreeDefine18 == null ? 43 : $productFreeDefine18.hashCode());
        String string50 = this.getProductFreeDefine19();
        result = result * 59 + ($productFreeDefine19 == null ? 43 : $productFreeDefine19.hashCode());
        String string51 = this.getProductFreeDefine20();
        result = result * 59 + ($productFreeDefine20 == null ? 43 : $productFreeDefine20.hashCode());
        String string52 = this.getProductFreeDefine21();
        result = result * 59 + ($productFreeDefine21 == null ? 43 : $productFreeDefine21.hashCode());
        String string53 = this.getProductFreeDefine22();
        result = result * 59 + ($productFreeDefine22 == null ? 43 : $productFreeDefine22.hashCode());
        String string54 = this.getProductFreeDefine23();
        result = result * 59 + ($productFreeDefine23 == null ? 43 : $productFreeDefine23.hashCode());
        String string55 = this.getProductFreeDefine24();
        result = result * 59 + ($productFreeDefine24 == null ? 43 : $productFreeDefine24.hashCode());
        String string56 = this.getProductFreeDefine25();
        result = result * 59 + ($productFreeDefine25 == null ? 43 : $productFreeDefine25.hashCode());
        String string57 = this.getProductFreeDefine26();
        result = result * 59 + ($productFreeDefine26 == null ? 43 : $productFreeDefine26.hashCode());
        String string58 = this.getProductFreeDefine27();
        result = result * 59 + ($productFreeDefine27 == null ? 43 : $productFreeDefine27.hashCode());
        String string59 = this.getProductFreeDefine28();
        result = result * 59 + ($productFreeDefine28 == null ? 43 : $productFreeDefine28.hashCode());
        String string60 = this.getProductFreeDefine29();
        result = result * 59 + ($productFreeDefine29 == null ? 43 : $productFreeDefine29.hashCode());
        String string61 = this.getProductFreeDefine30();
        result = result * 59 + ($productFreeDefine30 == null ? 43 : $productFreeDefine30.hashCode());
        String string62 = this.getFree1();
        result = result * 59 + ($free1 == null ? 43 : $free1.hashCode());
        String string63 = this.getFree2();
        result = result * 59 + ($free2 == null ? 43 : $free2.hashCode());
        String string64 = this.getFree3();
        result = result * 59 + ($free3 == null ? 43 : $free3.hashCode());
        String string65 = this.getFree4();
        result = result * 59 + ($free4 == null ? 43 : $free4.hashCode());
        String string66 = this.getFree5();
        result = result * 59 + ($free5 == null ? 43 : $free5.hashCode());
        String string67 = this.getFree6();
        result = result * 59 + ($free6 == null ? 43 : $free6.hashCode());
        String string68 = this.getFree7();
        result = result * 59 + ($free7 == null ? 43 : $free7.hashCode());
        String string69 = this.getFree8();
        result = result * 59 + ($free8 == null ? 43 : $free8.hashCode());
        String string70 = this.getFree9();
        result = result * 59 + ($free9 == null ? 43 : $free9.hashCode());
        String string71 = this.getFree10();
        result = result * 59 + ($free10 == null ? 43 : $free10.hashCode());
        String string72 = this.getMaterialStatus();
        result = result * 59 + ($materialStatus == null ? 43 : $materialStatus.hashCode());
        String string73 = this.getOrgMaterialStatus();
        result = result * 59 + ($orgMaterialStatus == null ? 43 : $orgMaterialStatus.hashCode());
        List<CharacterDTO> list5 = this.getCharacterDTOList();
        result = result * 59 + ($characterDTOList == null ? 43 : $characterDTOList.hashCode());
        return result;
    }

    public String toString() {
        return "ProductBaseDTO(id=" + this.getId() + ", createOrgId=" + this.getCreateOrgId() + ", orgId=" + this.getOrgId() + ", orgType=" + this.getOrgType() + ", tenantId=" + this.getTenantId() + ", name=" + this.getName() + ", code=" + this.getCode() + ", transType=" + this.getTransType() + ", transTypeName=" + this.getTransTypeName() + ", unitId=" + this.getUnitId() + ", unitErpCode=" + this.getUnitErpCode() + ", unitTruncationType=" + this.getUnitTruncationType() + ", unitExchangeType=" + this.getUnitExchangeType() + ", mainUnitCount=" + this.getMainUnitCount() + ", unitCode=" + this.getUnitCode() + ", unitName=" + this.getUnitName() + ", unitPrecision=" + this.getUnitPrecision() + ", unitUseType=" + this.getUnitUseType() + ", productPropCharacterDefine=" + this.getProductPropCharacterDefine() + ", productPropCharacterDefineMap=" + this.getProductPropCharacterDefineMap() + ", order=" + this.getOrder() + ", assistUnit=" + this.getAssistUnit() + ", enableAssistUnit=" + this.getEnableAssistUnit() + ", unitConvertCoefficient=" + this.getUnitConvertCoefficient() + ", modelDescription=" + this.getModelDescription() + ", model=" + this.getModel() + ", manageClass=" + this.getManageClass() + ", manageClassPath=" + this.getManageClassPath() + ", manageClassCode=" + this.getManageClassCode() + ", manageClassName=" + this.getManageClassName() + ", costClass=" + this.getCostClass() + ", costClassCode=" + this.getCostClassCode() + ", costClassName=" + this.getCostClassName() + ", brand=" + this.getBrand() + ", brandCode=" + this.getBrandCode() + ", brandName=" + this.getBrandName() + ", platformCode=" + this.getPlatformCode() + ", placeOfOrigin=" + this.getPlaceOfOrigin() + ", productLine=" + this.getProductLine() + ", productLineCode=" + this.getProductLineCode() + ", productLineName=" + this.getProductLineName() + ", length=" + this.getLength() + ", height=" + this.getHeight() + ", width=" + this.getWidth() + ", weight=" + this.getWeight() + ", weightUnit=" + this.getWeightUnit() + ", netWeight=" + this.getNetWeight() + ", netWeightUnit=" + this.getNetWeightUnit() + ", volume=" + this.getVolume() + ", volumeUnit=" + this.getVolumeUnit() + ", barCode=" + this.getBarCode() + ", erpOuterCode=" + this.getErpOuterCode() + ", manufacturer=" + this.getManufacturer() + ", mktDisplayPrice=" + this.getMktDisplayPrice() + ", mktPriceAreaMessage=" + this.getMktPriceAreaMessage() + ", mktBatchPriceUnit=" + this.getMktBatchPriceUnit() + ", mktBatchPrice=" + this.getMktBatchPrice() + ", mktBatchUnit=" + this.getMktBatchUnit() + ", mktBatchUnitName=" + this.getMktBatchUnitName() + ", mktBatchUnitCode=" + this.getMktBatchUnitCode() + ", mktOnlineUnit=" + this.getMktOnlineUnit() + ", mktOfflineUnit=" + this.getMktOfflineUnit() + ", mktRequireUnit=" + this.getMktRequireUnit() + ", mktMarkPrice=" + this.getMktMarkPrice() + ", mktSalePrice=" + this.getMktSalePrice() + ", mktMarketPrice=" + this.getMktMarketPrice() + ", mktStatus=" + this.getMktStatus() + ", mktUOrderStatus=" + this.getMktUOrderStatus() + ", orderUpCount=" + this.getOrderUpCount() + ", orderDownCount=" + this.getOrderDownCount() + ", upuMaxPrimeCosts=" + this.getUpuMaxPrimeCosts() + ", upuPrimeCosts=" + this.getUpuPrimeCosts() + ", upuRequestOrderLimit=" + this.getUpuRequestOrderLimit() + ", upuArrivalAllowErrorLimit=" + this.getUpuArrivalAllowErrorLimit() + ", upuInvoiceAllowErrorLimit=" + this.getUpuInvoiceAllowErrorLimit() + ", upuPurchaseUnit=" + this.getUpuPurchaseUnit() + ", upuPurchaseUnitName=" + this.getUpuPurchaseUnitName() + ", upuPurchasePriceUnit=" + this.getUpuPurchasePriceUnit() + ", upuPurchasePriceUnitName=" + this.getUpuPurchasePriceUnitName() + ", upuPurchaseTimes=" + this.getUpuPurchaseTimes() + ", upuPurchaseOrderQuantity=" + this.getUpuPurchaseOrderQuantity() + ", saleCanSale=" + this.getSaleCanSale() + ", saleMinOrderQuantity=" + this.getSaleMinOrderQuantity() + ", saleDoubleSale=" + this.getSaleDoubleSale() + ", saleDeliveryDays=" + this.getSaleDeliveryDays() + ", saleChannel=" + this.getSaleChannel() + ", saleProductClass=" + this.getSaleProductClass() + ", saleProductClassCode=" + this.getSaleProductClassCode() + ", saleProductClassName=" + this.getSaleProductClassName() + ", saleProductClassPath=" + this.getSaleProductClassPath() + ", stockOmsWarehouse=" + this.getStockOmsWarehouse() + ", stockBatchManage=" + this.getStockBatchManage() + ", stockExpiryDateManage=" + this.getStockExpiryDateManage() + ", stockExpiryDateCalculationMethod=" + this.getStockExpiryDateCalculationMethod() + ", stockExpireDateNo=" + this.getStockExpireDateNo() + ", stockExpireDateUnit=" + this.getStockExpireDateUnit() + ", stockDaysBeforeValidityReject=" + this.getStockDaysBeforeValidityReject() + ", stockValidityWarningDays=" + this.getStockValidityWarningDays() + ", stockSerialNoManage=" + this.getStockSerialNoManage() + ", stockBarcodeManage=" + this.getStockBarcodeManage() + ", stockSafetyStock=" + this.getStockSafetyStock() + ", stockHighestStock=" + this.getStockHighestStock() + ", stockLowestStock=" + this.getStockLowestStock() + ", stockRopStock=" + this.getStockRopStock() + ", stockDeliveryWarehouse=" + this.getStockDeliveryWarehouse() + ", stockDeliveryWarehouseName=" + this.getStockDeliveryWarehouseName() + ", stockReturnWarehouse=" + this.getStockReturnWarehouse() + ", stockReturnWarehouseName=" + this.getStockReturnWarehouseName() + ", stockReceiptWarehouse=" + this.getStockReceiptWarehouse() + ", stockReceiptWarehouseName=" + this.getStockReceiptWarehouseName() + ", stockInStoreExcessLimit=" + this.getStockInStoreExcessLimit() + ", stockOutStoreExcessLimit=" + this.getStockOutStoreExcessLimit() + ", stockInStoreLessLimit=" + this.getStockInStoreLessLimit() + ", stockOutStoreLessLimit=" + this.getStockOutStoreLessLimit() + ", stockMaximumTurnoverDays=" + this.getStockMaximumTurnoverDays() + ", stockScanCountUnit=" + this.getStockScanCountUnit() + ", stockReservation=" + this.getStockReservation() + ", stockStorageLossRate=" + this.getStockStorageLossRate() + ", stockAllowNegativeInventory=" + this.getStockAllowNegativeInventory() + ", stockStockUnit=" + this.getStockStockUnit() + ", stockStockUnitCode=" + this.getStockStockUnitCode() + ", stockStockUnitName=" + this.getStockStockUnitName() + ", inspectionType=" + this.getInspectionType() + ", testRule=" + this.getTestRule() + ", inspectionReturnsWarehousingByResult=" + this.getInspectionReturnsWarehousingByResult() + ", planCheckDays=" + this.getPlanCheckDays() + ", inspectionUnit=" + this.getInspectionUnit() + ", edSupplyType=" + this.getEdSupplyType() + ", edProduceDepartment=" + this.getEdProduceDepartment() + ", edProduceDepartmentNew=" + this.getEdProduceDepartmentNew() + ", edBindCarrier=" + this.getEdBindCarrier() + ", edPurpose=" + this.getEdPurpose() + ", edWeigh=" + this.getEdWeigh() + ", doubleReplenish=" + this.getDoubleReplenish() + ", edEngineeringDrawingNo=" + this.getEdEngineeringDrawingNo() + ", edECNControl=" + this.getEdECNControl() + ", edPlanDefaultAttribute=" + this.getEdPlanDefaultAttribute() + ", edPlanMethod=" + this.getEdPlanMethod() + ", edManufacturePlanner=" + this.getEdManufacturePlanner() + ", edPlanProduceLimit=" + this.getEdPlanProduceLimit() + ", edKeySubPart=" + this.getEdKeySubPart() + ", edBOMType=" + this.getEdBOMType() + ", edBOMSource=" + this.getEdBOMSource() + ", edBatchRule=" + this.getEdBatchRule() + ", edEconomicQuantity=" + this.getEdEconomicQuantity() + ", edFixedQuantity=" + this.getEdFixedQuantity() + ", edBatchDouble=" + this.getEdBatchDouble() + ", edFrontLeadTime=" + this.getEdFrontLeadTime() + ", edBehindLeadTime=" + this.getEdBehindLeadTime() + ", edFixedLeadTime=" + this.getEdFixedLeadTime() + ", edLeadTimeCoefficient=" + this.getEdLeadTimeCoefficient() + ", edLeadTimeQuantity=" + this.getEdLeadTimeQuantity() + ", edLossType=" + this.getEdLossType() + ", edFixedWastage=" + this.getEdFixedWastage() + ", edRejectRate=" + this.getEdRejectRate() + ", edPrepareFeed=" + this.getEdPrepareFeed() + ", edWastageRate=" + this.getEdWastageRate() + ", edDirectProduction=" + this.getEdDirectProduction() + ", edSpecialMaterials=" + this.getEdSpecialMaterials() + ", edVirtualPart=" + this.getEdVirtualPart() + ", edDemandConsolidation=" + this.getEdDemandConsolidation() + ", edDemandConsolidationType=" + this.getEdDemandConsolidationType() + ", edDemandConsolidationUnit=" + this.getEdDemandConsolidationUnit() + ", edDemandConsolidationNumber=" + this.getEdDemandConsolidationNumber() + ", edDemandConsolidationDateType=" + this.getEdDemandConsolidationDateType() + ", edResetForwardDays=" + this.getEdResetForwardDays() + ", edResetBackwardDays=" + this.getEdResetBackwardDays() + ", edBeyondSupplyDays=" + this.getEdBeyondSupplyDays() + ", edLogisticsRelated=" + this.getEdLogisticsRelated() + ", edWeighingMode=" + this.getEdWeighingMode() + ", edFixedReturn=" + this.getEdFixedReturn() + ", edReviewGrossWeight=" + this.getEdReviewGrossWeight() + ", edSpecialCarTransport=" + this.getEdSpecialCarTransport() + ", edProduceUnit=" + this.getEdProduceUnit() + ", edProduceUnitCode=" + this.getEdProduceUnitCode() + ", edProduceUnitName=" + this.getEdProduceUnitName() + ", edProduceUnitPercision=" + this.getEdProduceUnitPercision() + ", edPlanClass=" + this.getEdPlanClass() + ", fiCostClass=" + this.getFiCostClass() + ", fiValueManageType=" + this.getFiValueManageType() + ", fiCostValuation=" + this.getFiCostValuation() + ", fiNoTaxCostPrice=" + this.getFiNoTaxCostPrice() + ", fiCheckByBatch=" + this.getFiCheckByBatch() + ", accountingByItem=" + this.getAccountingByItem() + ", checkFree=" + this.getCheckFree() + ", taxClass=" + this.getTaxClass() + ", taxClassCode=" + this.getTaxClassCode() + ", taxClassName=" + this.getTaxClassName() + ", taxClassSimpleName=" + this.getTaxClassSimpleName() + ", fiReceiptName=" + this.getFiReceiptName() + ", fiInTaxrate=" + this.getFiInTaxrate() + ", noTaxation=" + this.getNoTaxation() + ", fiOutTaxrate=" + this.getFiOutTaxrate() + ", fiPreferentialPolicyType=" + this.getFiPreferentialPolicyType() + ", fiPreferentialPolicyTypeName=" + this.getFiPreferentialPolicyTypeName() + ", receiptSpec=" + this.getReceiptSpec() + ", receiptModel=" + this.getReceiptModel() + ", creatorType=" + this.getCreatorType() + ", realProductAttribute=" + this.getRealProductAttribute() + ", realProductAttributeType=" + this.getRealProductAttributeType() + ", realProductAttributeTypeNew=" + this.getRealProductAttributeTypeNew() + ", virtualProductAttribute=" + this.getVirtualProductAttribute() + ", virtualProductAttributeNew=" + this.getVirtualProductAttributeNew() + ", businessAttribute=" + this.getBusinessAttribute() + ", ptoPriceType=" + this.getPtoPriceType() + ", productTemplate=" + this.getProductTemplate() + ", productTemplateName=" + this.getProductTemplateName() + ", productTemplateSkuDynamic=" + this.getProductTemplateSkuDynamic() + ", businessAttributePurchase=" + this.getBusinessAttributePurchase() + ", businessAttributeSelfCreate=" + this.getBusinessAttributeSelfCreate() + ", businessAttributeOutSourcing=" + this.getBusinessAttributeOutSourcing() + ", businessAttributeSale=" + this.getBusinessAttributeSale() + ", saleChannelOfOnlineBatch=" + this.getSaleChannelOfOnlineBatch() + ", saleChannelOfDistribution=" + this.getSaleChannelOfDistribution() + ", enableSparePartsManagement=" + this.getEnableSparePartsManagement() + ", depositPayType=" + this.getDepositPayType() + ", minimumDeposits=" + this.getMinimumDeposits() + ", productTagId=" + this.getProductTagId() + ", isWeight=" + this.getIsWeight() + ", productFamily=" + this.getProductFamily() + ", salesAndOperations=" + this.getSalesAndOperations() + ", stopStatus=" + this.getStopStatus() + ", erpCode=" + this.getErpCode() + ", mnemonicCode=" + this.getMnemonicCode() + ", productVendor=" + this.getProductVendor() + ", productVendorName=" + this.getProductVendorName() + ", productBuyer=" + this.getProductBuyer() + ", productBuyerName=" + this.getProductBuyerName() + ", warehouseManager=" + this.getWarehouseManager() + ", warehouseManagerName=" + this.getWarehouseManagerName() + ", description=" + this.getDescription() + ", mobileDescription=" + this.getMobileDescription() + ", medIsRegistrationManager=" + this.getMedIsRegistrationManager() + ", medIsAuthorizationManager=" + this.getMedIsAuthorizationManager() + ", medSunshinePurchaseNo=" + this.getMedSunshinePurchaseNo() + ", medRegistrationNo=" + this.getMedRegistrationNo() + ", retailProcessType=" + this.getRetailProcessType() + ", retailPriceDimension=" + this.getRetailPriceDimension() + ", material=" + this.getMaterial() + ", saleInOfflineStore=" + this.getSaleInOfflineStore() + ", offlineStoreOrder=" + this.getOfflineStoreOrder() + ", isOptionalMaterial=" + this.getIsOptionalMaterial() + ", defaultSKUId=" + this.getDefaultSKUId() + ", productDetailId=" + this.getProductDetailId() + ", recommendedMaterials=" + this.getRecommendedMaterials() + ", isProcess=" + this.getIsProcess() + ", process=" + this.getProcess() + ", url=" + this.getUrl() + ", hasSpecs=" + this.getHasSpecs() + ", couponId=" + this.getCouponId() + ", titleMemo=" + this.getTitleMemo() + ", platFormStatus=" + this.getPlatFormStatus() + ", couponType=" + this.getCouponType() + ", creatorCustomer=" + this.getCreatorCustomer() + ", inventoryCount=" + this.getInventoryCount() + ", productAlbums=" + this.getProductAlbums() + ", productAttachments=" + this.getProductAttachments() + ", productParams=" + this.getProductParams() + ", productSpecItems=" + this.getProductSpecItems() + ", productDefine1=" + this.getProductDefine1() + ", productDefine2=" + this.getProductDefine2() + ", productDefine3=" + this.getProductDefine3() + ", productDefine4=" + this.getProductDefine4() + ", productDefine5=" + this.getProductDefine5() + ", productDefine6=" + this.getProductDefine6() + ", productDefine7=" + this.getProductDefine7() + ", productDefine8=" + this.getProductDefine8() + ", productDefine9=" + this.getProductDefine9() + ", productDefine10=" + this.getProductDefine10() + ", productDefine11=" + this.getProductDefine11() + ", productDefine12=" + this.getProductDefine12() + ", productDefine13=" + this.getProductDefine13() + ", productDefine14=" + this.getProductDefine14() + ", productDefine15=" + this.getProductDefine15() + ", productDefine16=" + this.getProductDefine16() + ", productDefine17=" + this.getProductDefine17() + ", productDefine18=" + this.getProductDefine18() + ", productDefine19=" + this.getProductDefine19() + ", productDefine20=" + this.getProductDefine20() + ", productDefine21=" + this.getProductDefine21() + ", productDefine22=" + this.getProductDefine22() + ", productDefine23=" + this.getProductDefine23() + ", productDefine24=" + this.getProductDefine24() + ", productDefine25=" + this.getProductDefine25() + ", productDefine26=" + this.getProductDefine26() + ", productDefine27=" + this.getProductDefine27() + ", productDefine28=" + this.getProductDefine28() + ", productDefine29=" + this.getProductDefine29() + ", productDefine30=" + this.getProductDefine30() + ", productFreeDefine1=" + this.getProductFreeDefine1() + ", productFreeDefine2=" + this.getProductFreeDefine2() + ", productFreeDefine3=" + this.getProductFreeDefine3() + ", productFreeDefine4=" + this.getProductFreeDefine4() + ", productFreeDefine5=" + this.getProductFreeDefine5() + ", productFreeDefine6=" + this.getProductFreeDefine6() + ", productFreeDefine7=" + this.getProductFreeDefine7() + ", productFreeDefine8=" + this.getProductFreeDefine8() + ", productFreeDefine9=" + this.getProductFreeDefine9() + ", productFreeDefine10=" + this.getProductFreeDefine10() + ", productFreeDefine11=" + this.getProductFreeDefine11() + ", productFreeDefine12=" + this.getProductFreeDefine12() + ", productFreeDefine13=" + this.getProductFreeDefine13() + ", productFreeDefine14=" + this.getProductFreeDefine14() + ", productFreeDefine15=" + this.getProductFreeDefine15() + ", productFreeDefine16=" + this.getProductFreeDefine16() + ", productFreeDefine17=" + this.getProductFreeDefine17() + ", productFreeDefine18=" + this.getProductFreeDefine18() + ", productFreeDefine19=" + this.getProductFreeDefine19() + ", productFreeDefine20=" + this.getProductFreeDefine20() + ", productFreeDefine21=" + this.getProductFreeDefine21() + ", productFreeDefine22=" + this.getProductFreeDefine22() + ", productFreeDefine23=" + this.getProductFreeDefine23() + ", productFreeDefine24=" + this.getProductFreeDefine24() + ", productFreeDefine25=" + this.getProductFreeDefine25() + ", productFreeDefine26=" + this.getProductFreeDefine26() + ", productFreeDefine27=" + this.getProductFreeDefine27() + ", productFreeDefine28=" + this.getProductFreeDefine28() + ", productFreeDefine29=" + this.getProductFreeDefine29() + ", productFreeDefine30=" + this.getProductFreeDefine30() + ", free1=" + this.getFree1() + ", free2=" + this.getFree2() + ", free3=" + this.getFree3() + ", free4=" + this.getFree4() + ", free5=" + this.getFree5() + ", free6=" + this.getFree6() + ", free7=" + this.getFree7() + ", free8=" + this.getFree8() + ", free9=" + this.getFree9() + ", free10=" + this.getFree10() + ", materialStatus=" + this.getMaterialStatus() + ", orgMaterialStatus=" + this.getOrgMaterialStatus() + ", characterDTOList=" + this.getCharacterDTOList() + ")";
    }
}

