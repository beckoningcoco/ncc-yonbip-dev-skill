/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.fasterxml.jackson.annotation.JsonProperty
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.iuap.upc.vo.ProductLoadWayVO;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductDetailVO {
    private Long id;
    private Long productId;
    private Long productApplyRangeId;
    private Long purchaseUnit;
    private String purchaseUnitCode;
    private String purchaseUnitName;
    private Long purchasePriceUnit;
    private String purchasePriceUnitCode;
    private String purchasePriceUnitName;
    private BigDecimal purchaseRate;
    private Long stockUnit;
    private String stockUnitCode;
    private String stockUnitName;
    private BigDecimal stockRate;
    private Long batchUnit;
    private String batchUnitCode;
    private String batchUnitName;
    private BigDecimal batchRate;
    private Long onlineUnit;
    private String onlineUnitCode;
    private String onlineUnitName;
    private BigDecimal onlineRate;
    private Long offlineUnit;
    private String offlineUnitCode;
    private String offlineUnitName;
    private BigDecimal offlineRate;
    private Long requireUnit;
    private String requireUnitCode;
    private String requireUnitName;
    private BigDecimal requireRate;
    private Long batchPriceUnit;
    private String batchPriceUnitCode;
    private String batchPriceUnitName;
    private Long inspectionUnit;
    private String inspectionUnitCode;
    private String inspectionUnitName;
    private BigDecimal batchPriceRate;
    private BigDecimal batchPrice;
    private BigDecimal markPrice;
    private BigDecimal lowestMarkPrice;
    private BigDecimal salePrice;
    private BigDecimal marketPrice;
    private BigDecimal primeCosts;
    private BigDecimal settleAccountsRate;
    private Boolean displayPrice;
    private String priceAreaMessage;
    private Integer stockABCClass;
    private Boolean batchManage;
    private Boolean expiryDateManage;
    private Integer expireDateNo;
    private Integer expireDateUnit;
    private Boolean serialNoManage;
    private BigDecimal weight;
    private BigDecimal volume;
    private BigDecimal safetyStock;
    private BigDecimal highestStock;
    private BigDecimal lowestStock;
    private BigDecimal ropStock;
    private Long omsWarehouse;
    private String omsWarehouseCode;
    private String omsWarehouseName;
    private Integer maximumTurnoverDays;
    private Boolean canSale;
    private BigDecimal minOrderQuantity;
    private Integer deliveryDays;
    private Long orderDlyFeeRuleId;
    private Boolean enableCyclePurchase;
    private Boolean enableDeposit;
    private Integer depositDealPayType;
    private BigDecimal deposits;
    private BigDecimal depositPercentage;
    private Boolean enableModifyDeposit;
    private BigDecimal minimumDeposits;
    private Integer depositPayType;
    private String pageTitle;
    private MultilingualVO metaDescription;
    private Integer salePoints;
    private BigDecimal inventoryCount;
    private Long templateOfFreightId;
    private Integer baseSaleCount;
    private Boolean allArea;
    private Boolean enableContractManagement;
    private Boolean allowStorePurchase;
    private Boolean priceChangeAllowed;
    private Boolean saleInOfflineStore;
    private Boolean offlineStoreOrder;
    private Boolean offlineStoreReturn;
    private Boolean weighingOrNot;
    private Boolean process;
    private Integer processType;
    private Boolean material;
    private Integer retailPriceDimension;
    private Integer deliverQuantityChange;
    private BigDecimal noTaxCostPrice;
    private Boolean checkByBatch;
    private Integer checkByProject;
    private Integer checkBySalesOrders;
    private Integer checkByClient;
    private Integer checkByOutsourcing;
    private Boolean accountingByItem;
    private Boolean storeOffAndOffState;
    private Boolean orderLoadAndUnloadStatus;
    private Date mallUpTime;
    private Date mallDownTime;
    private Date orderUpTime;
    private Date orderDownTime;
    private Integer mallUpCount;
    private Integer mallDownCount;
    private Integer orderUpCount;
    private Integer orderDownCount;
    private BigDecimal minBatchPrice;
    private BigDecimal maxBatchPrice;
    private Date timestamp;
    private Long tenant;
    private String saleChannel;
    private Boolean saleChannelOfOnlineBatch;
    private Boolean saleChannelOfOnlineRetail;
    private Boolean saleChannelOfOfflineRetail;
    private Boolean saleChannelOfDistribution;
    private String barCode;
    @JsonProperty(value="stopstatus")
    private Boolean stopStatus;
    private Date stopTime;
    private Integer checkFree;
    private BigDecimal serviceDuration;
    private Integer serviceDurationUnit;
    private Boolean canOrder;
    private Boolean onlyOrder;
    private Integer orderAdvanceTime;
    private Integer valueManageType;
    private Integer costValuation;
    private Boolean checkByCost;
    private Boolean materialCost;
    private Integer planDefaultAttribute;
    private String manufactureSpecs;
    private Integer planMethod;
    private Long planStrategy;
    private Boolean keySubPart;
    private Integer supplyDemandPolicy;
    private Integer fixedLeadTime;
    private Integer batchPolicy;
    private Integer supplyType;
    private String produceDepartment;
    private String produceDepartmentCode;
    private String produceDepartmentName;
    private String manufacturePlanner;
    private String manufacturePlannerCode;
    private String manufacturePlannerName;
    private String engineeringDrawingNo;
    private Integer supplyTimes;
    private BigDecimal planProduceLimit;
    private Boolean bindCarrier;
    private Integer purpose;
    private Boolean utility;
    private Boolean weigh;
    private Long productVendor;
    private String productVendorCode;
    private String productVendorName;
    private String productBuyer;
    private String productBuyerCode;
    private String productBuyerName;
    private BigDecimal maxPrimeCosts;
    private BigDecimal requestOrderLimit;
    private BigDecimal arrivalAllowErrorLimit;
    private BigDecimal invoiceAllowErrorLimit;
    private BigDecimal planOrderLimit;
    private Boolean enableSubscribe;
    private Integer order;
    private Boolean recommend;
    private String erpOuterCode;
    private String saleStyle;
    private String shortName;
    private String mnemonicCode;
    private MultilingualVO receiptName;
    private String incomeTaxRates;
    private String incomeTaxRatesCode;
    private String incomeTaxRatesName;
    private String outputTaxRate;
    private String outTaxRateCode;
    private String outTaxRateName;
    private Long preferentialPolicyType;
    private Long produceUnit;
    private String produceUnitCode;
    private String produceUnitName;
    private Long demandPlanningUnit;
    private String demandPlanningUnitCode;
    private String demandPlanningUnitName;
    private BigDecimal produceRate;
    private Integer daysBeforeValidityReject;
    private Integer validityWarningDays;
    private String warehouseManager;
    private String warehouseManagerCode;
    private String warehouseManagerName;
    private Long deliveryWarehouse;
    private String deliveryWarehouseCode;
    private String deliveryWarehouseName;
    private Long returnWarehouse;
    private String returnWarehouseCode;
    private String returnWarehouseName;
    private BigDecimal inStoreExcessLimit;
    private BigDecimal outStoreExcessLimit;
    private BigDecimal inStoreLessLimit;
    private BigDecimal outStoreLessLimit;
    private BigDecimal storageLossRate;
    private Boolean allowNegativeInventory;
    private Integer scanCountUnit;
    private Boolean exemption;
    private Boolean warehousingByResult;
    private Boolean salesReturnsExemption;
    private Boolean returnsWarehousingByResult;
    private Boolean periodicalInspection;
    private Integer periodicalInspectionCycle;
    private MultilingualVO displayName;
    private MultilingualVO titleMemo;
    private Date beUpTime;
    private String receiptName1;
    private String receiptName2;
    private String receiptName3;
    private String receiptNam4;
    private String receiptName5;
    private String receiptName6;
    private String metadescription1;
    private String metadescription2;
    private String metadescription3;
    private String metadescription4;
    private String metadescription5;
    private String metadescription6;
    private String displayName1;
    private String displayName2;
    private String displayName3;
    private String displayName4;
    private String displayName5;
    private String displayName6;
    private String titleMemo1;
    private String titleMemo2;
    private String titleMemo3;
    private String titleMemo4;
    private String titleMemo5;
    private String titleMemo6;
    private Boolean barcodeManage;
    private Integer manageByInventory;
    private Integer registrationManager;
    private Integer authorizationManager;
    private String sunshinePurchase;
    private String registrationNumber;
    private Long receiptWarehouse;
    private String receiptWarehouseCode;
    private String receiptWarehouseName;
    private Integer BOMType;
    private Long BOMSource;
    private Integer batchRule;
    private BigDecimal economicQuantity;
    private BigDecimal fixedQuantity;
    private BigDecimal batchDouble;
    private Integer frontLeadTime;
    private Integer behindLeadTime;
    private BigDecimal leadTimeCoefficient;
    private BigDecimal leadTimeQuantity;
    private BigDecimal fixedWastage;
    private BigDecimal wastageRate;
    private BigDecimal rejectRate;
    private Boolean prepareFeed;
    private Boolean specialMaterials;
    private Boolean virtualPart;
    private Integer demandConsolidation;
    private Integer demandConsolidationType;
    private Integer demandConsolidationUnit;
    private Integer demandConsolidationNumber;
    private Integer demandConsolidationDateType;
    private Integer resetForwardDays;
    private Integer resetBackwardDays;
    private Integer beyondSupplyDays;
    private Boolean reservation;
    private Integer lossType;
    private Boolean workingPlan;
    @JsonProperty(value="ECNControl")
    private Boolean ECNControl;
    private String ytenantId;
    private String receiptSpec;
    private String receiptModel;
    private String receiptspec2;
    private String receiptmodel2;
    private String receiptspec3;
    private String receiptmodel3;
    private String receiptspec4;
    private String receiptmodel4;
    private String receiptspec5;
    private String receiptmodel5;
    private String receiptspec6;
    private String receiptmodel6;
    private BigDecimal doubleSale;
    private Integer inspectionType;
    private Boolean logisticsRelated;
    private Integer weighingMode;
    private Boolean fixedReturn;
    private Boolean reviewGrossWeight;
    private Boolean specialCarTransport;
    private Integer inventoryPlanStrategy;
    private Integer rangeType;
    private String orgId;
    private Long customerId;
    private Long shopId;
    private Boolean creator;
    private Integer expiryDateCalculationMethod;
    private MultilingualVO remark;
    private String remark1;
    private String remark2;
    private String remark3;
    private String remark4;
    private String remark5;
    private String remark6;
    private String businessAttribute;
    private Integer businessAttributePurchase;
    private Integer businessAttributeSale;
    private Integer businessAttributeSelfCreate;
    private Integer businessAttributeOutSourcing;
    private Integer testRule;
    private Integer enableStockPeriodRecheck;
    private Integer reviewCycle;
    private Integer recheckReminderLeadTime;
    private Integer enableStockExpireCheck;
    private Integer effectiveLeadTime;
    private Integer checkReminderLeadTime;
    private Integer enableSparePartsManagement;
    private Integer fullSetInspection;
    private BigDecimal purchaseOrderQuantity;
    private BigDecimal purchaseTimes;
    private BigDecimal doubleReplenish;
    private Integer directProduction;
    private Integer projectTrackStrategy;
    private String costItems;
    private String costItemsCode;
    private String costItemsName;
    private Integer singleInspection;
    private Long productExtendCharacterDefId;
    private Map<String, Object> productExtendCharacterDef;
    private String materialStatusId;
    private String materialStatusCode;
    private Long billingUnitId;
    private Integer checkByRevenueManagement;
    private Integer overSigning;
    private Integer atpInspection;
    private BigDecimal doublePick;
    private Integer mtoStrategy;
    private Integer strategyComparisonRule;
    private String manufacturingStrategy;
    private MultilingualVO receiptSpecMultilingual;
    private MultilingualVO receiptModelMultilingual;
    private Integer returnInspection;
    private Integer sendInspection;
    private Integer planCheckDays;
    private List<ProductLoadWayVO> productLoadWays;
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
    private Integer inspectionControlPoint;
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

    public Long getId() {
        return this.id;
    }

    public Long getProductId() {
        return this.productId;
    }

    public Long getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public Long getPurchaseUnit() {
        return this.purchaseUnit;
    }

    public String getPurchaseUnitCode() {
        return this.purchaseUnitCode;
    }

    public String getPurchaseUnitName() {
        return this.purchaseUnitName;
    }

    public Long getPurchasePriceUnit() {
        return this.purchasePriceUnit;
    }

    public String getPurchasePriceUnitCode() {
        return this.purchasePriceUnitCode;
    }

    public String getPurchasePriceUnitName() {
        return this.purchasePriceUnitName;
    }

    public BigDecimal getPurchaseRate() {
        return this.purchaseRate;
    }

    public Long getStockUnit() {
        return this.stockUnit;
    }

    public String getStockUnitCode() {
        return this.stockUnitCode;
    }

    public String getStockUnitName() {
        return this.stockUnitName;
    }

    public BigDecimal getStockRate() {
        return this.stockRate;
    }

    public Long getBatchUnit() {
        return this.batchUnit;
    }

    public String getBatchUnitCode() {
        return this.batchUnitCode;
    }

    public String getBatchUnitName() {
        return this.batchUnitName;
    }

    public BigDecimal getBatchRate() {
        return this.batchRate;
    }

    public Long getOnlineUnit() {
        return this.onlineUnit;
    }

    public String getOnlineUnitCode() {
        return this.onlineUnitCode;
    }

    public String getOnlineUnitName() {
        return this.onlineUnitName;
    }

    public BigDecimal getOnlineRate() {
        return this.onlineRate;
    }

    public Long getOfflineUnit() {
        return this.offlineUnit;
    }

    public String getOfflineUnitCode() {
        return this.offlineUnitCode;
    }

    public String getOfflineUnitName() {
        return this.offlineUnitName;
    }

    public BigDecimal getOfflineRate() {
        return this.offlineRate;
    }

    public Long getRequireUnit() {
        return this.requireUnit;
    }

    public String getRequireUnitCode() {
        return this.requireUnitCode;
    }

    public String getRequireUnitName() {
        return this.requireUnitName;
    }

    public BigDecimal getRequireRate() {
        return this.requireRate;
    }

    public Long getBatchPriceUnit() {
        return this.batchPriceUnit;
    }

    public String getBatchPriceUnitCode() {
        return this.batchPriceUnitCode;
    }

    public String getBatchPriceUnitName() {
        return this.batchPriceUnitName;
    }

    public Long getInspectionUnit() {
        return this.inspectionUnit;
    }

    public String getInspectionUnitCode() {
        return this.inspectionUnitCode;
    }

    public String getInspectionUnitName() {
        return this.inspectionUnitName;
    }

    public BigDecimal getBatchPriceRate() {
        return this.batchPriceRate;
    }

    public BigDecimal getBatchPrice() {
        return this.batchPrice;
    }

    public BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    public BigDecimal getLowestMarkPrice() {
        return this.lowestMarkPrice;
    }

    public BigDecimal getSalePrice() {
        return this.salePrice;
    }

    public BigDecimal getMarketPrice() {
        return this.marketPrice;
    }

    public BigDecimal getPrimeCosts() {
        return this.primeCosts;
    }

    public BigDecimal getSettleAccountsRate() {
        return this.settleAccountsRate;
    }

    public Boolean getDisplayPrice() {
        return this.displayPrice;
    }

    public String getPriceAreaMessage() {
        return this.priceAreaMessage;
    }

    public Integer getStockABCClass() {
        return this.stockABCClass;
    }

    public Boolean getBatchManage() {
        return this.batchManage;
    }

    public Boolean getExpiryDateManage() {
        return this.expiryDateManage;
    }

    public Integer getExpireDateNo() {
        return this.expireDateNo;
    }

    public Integer getExpireDateUnit() {
        return this.expireDateUnit;
    }

    public Boolean getSerialNoManage() {
        return this.serialNoManage;
    }

    public BigDecimal getWeight() {
        return this.weight;
    }

    public BigDecimal getVolume() {
        return this.volume;
    }

    public BigDecimal getSafetyStock() {
        return this.safetyStock;
    }

    public BigDecimal getHighestStock() {
        return this.highestStock;
    }

    public BigDecimal getLowestStock() {
        return this.lowestStock;
    }

    public BigDecimal getRopStock() {
        return this.ropStock;
    }

    public Long getOmsWarehouse() {
        return this.omsWarehouse;
    }

    public String getOmsWarehouseCode() {
        return this.omsWarehouseCode;
    }

    public String getOmsWarehouseName() {
        return this.omsWarehouseName;
    }

    public Integer getMaximumTurnoverDays() {
        return this.maximumTurnoverDays;
    }

    public Boolean getCanSale() {
        return this.canSale;
    }

    public BigDecimal getMinOrderQuantity() {
        return this.minOrderQuantity;
    }

    public Integer getDeliveryDays() {
        return this.deliveryDays;
    }

    public Long getOrderDlyFeeRuleId() {
        return this.orderDlyFeeRuleId;
    }

    public Boolean getEnableCyclePurchase() {
        return this.enableCyclePurchase;
    }

    public Boolean getEnableDeposit() {
        return this.enableDeposit;
    }

    public Integer getDepositDealPayType() {
        return this.depositDealPayType;
    }

    public BigDecimal getDeposits() {
        return this.deposits;
    }

    public BigDecimal getDepositPercentage() {
        return this.depositPercentage;
    }

    public Boolean getEnableModifyDeposit() {
        return this.enableModifyDeposit;
    }

    public BigDecimal getMinimumDeposits() {
        return this.minimumDeposits;
    }

    public Integer getDepositPayType() {
        return this.depositPayType;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public MultilingualVO getMetaDescription() {
        return this.metaDescription;
    }

    public Integer getSalePoints() {
        return this.salePoints;
    }

    public BigDecimal getInventoryCount() {
        return this.inventoryCount;
    }

    public Long getTemplateOfFreightId() {
        return this.templateOfFreightId;
    }

    public Integer getBaseSaleCount() {
        return this.baseSaleCount;
    }

    public Boolean getAllArea() {
        return this.allArea;
    }

    public Boolean getEnableContractManagement() {
        return this.enableContractManagement;
    }

    public Boolean getAllowStorePurchase() {
        return this.allowStorePurchase;
    }

    public Boolean getPriceChangeAllowed() {
        return this.priceChangeAllowed;
    }

    public Boolean getSaleInOfflineStore() {
        return this.saleInOfflineStore;
    }

    public Boolean getOfflineStoreOrder() {
        return this.offlineStoreOrder;
    }

    public Boolean getOfflineStoreReturn() {
        return this.offlineStoreReturn;
    }

    public Boolean getWeighingOrNot() {
        return this.weighingOrNot;
    }

    public Boolean getProcess() {
        return this.process;
    }

    public Integer getProcessType() {
        return this.processType;
    }

    public Boolean getMaterial() {
        return this.material;
    }

    public Integer getRetailPriceDimension() {
        return this.retailPriceDimension;
    }

    public Integer getDeliverQuantityChange() {
        return this.deliverQuantityChange;
    }

    public BigDecimal getNoTaxCostPrice() {
        return this.noTaxCostPrice;
    }

    public Boolean getCheckByBatch() {
        return this.checkByBatch;
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

    public Boolean getAccountingByItem() {
        return this.accountingByItem;
    }

    public Boolean getStoreOffAndOffState() {
        return this.storeOffAndOffState;
    }

    public Boolean getOrderLoadAndUnloadStatus() {
        return this.orderLoadAndUnloadStatus;
    }

    public Date getMallUpTime() {
        return this.mallUpTime;
    }

    public Date getMallDownTime() {
        return this.mallDownTime;
    }

    public Date getOrderUpTime() {
        return this.orderUpTime;
    }

    public Date getOrderDownTime() {
        return this.orderDownTime;
    }

    public Integer getMallUpCount() {
        return this.mallUpCount;
    }

    public Integer getMallDownCount() {
        return this.mallDownCount;
    }

    public Integer getOrderUpCount() {
        return this.orderUpCount;
    }

    public Integer getOrderDownCount() {
        return this.orderDownCount;
    }

    public BigDecimal getMinBatchPrice() {
        return this.minBatchPrice;
    }

    public BigDecimal getMaxBatchPrice() {
        return this.maxBatchPrice;
    }

    public Date getTimestamp() {
        return this.timestamp;
    }

    public Long getTenant() {
        return this.tenant;
    }

    public String getSaleChannel() {
        return this.saleChannel;
    }

    public Boolean getSaleChannelOfOnlineBatch() {
        return this.saleChannelOfOnlineBatch;
    }

    public Boolean getSaleChannelOfOnlineRetail() {
        return this.saleChannelOfOnlineRetail;
    }

    public Boolean getSaleChannelOfOfflineRetail() {
        return this.saleChannelOfOfflineRetail;
    }

    public Boolean getSaleChannelOfDistribution() {
        return this.saleChannelOfDistribution;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public Date getStopTime() {
        return this.stopTime;
    }

    public Integer getCheckFree() {
        return this.checkFree;
    }

    public BigDecimal getServiceDuration() {
        return this.serviceDuration;
    }

    public Integer getServiceDurationUnit() {
        return this.serviceDurationUnit;
    }

    public Boolean getCanOrder() {
        return this.canOrder;
    }

    public Boolean getOnlyOrder() {
        return this.onlyOrder;
    }

    public Integer getOrderAdvanceTime() {
        return this.orderAdvanceTime;
    }

    public Integer getValueManageType() {
        return this.valueManageType;
    }

    public Integer getCostValuation() {
        return this.costValuation;
    }

    public Boolean getCheckByCost() {
        return this.checkByCost;
    }

    public Boolean getMaterialCost() {
        return this.materialCost;
    }

    public Integer getPlanDefaultAttribute() {
        return this.planDefaultAttribute;
    }

    public String getManufactureSpecs() {
        return this.manufactureSpecs;
    }

    public Integer getPlanMethod() {
        return this.planMethod;
    }

    public Long getPlanStrategy() {
        return this.planStrategy;
    }

    public Boolean getKeySubPart() {
        return this.keySubPart;
    }

    public Integer getSupplyDemandPolicy() {
        return this.supplyDemandPolicy;
    }

    public Integer getFixedLeadTime() {
        return this.fixedLeadTime;
    }

    public Integer getBatchPolicy() {
        return this.batchPolicy;
    }

    public Integer getSupplyType() {
        return this.supplyType;
    }

    public String getProduceDepartment() {
        return this.produceDepartment;
    }

    public String getProduceDepartmentCode() {
        return this.produceDepartmentCode;
    }

    public String getProduceDepartmentName() {
        return this.produceDepartmentName;
    }

    public String getManufacturePlanner() {
        return this.manufacturePlanner;
    }

    public String getManufacturePlannerCode() {
        return this.manufacturePlannerCode;
    }

    public String getManufacturePlannerName() {
        return this.manufacturePlannerName;
    }

    public String getEngineeringDrawingNo() {
        return this.engineeringDrawingNo;
    }

    public Integer getSupplyTimes() {
        return this.supplyTimes;
    }

    public BigDecimal getPlanProduceLimit() {
        return this.planProduceLimit;
    }

    public Boolean getBindCarrier() {
        return this.bindCarrier;
    }

    public Integer getPurpose() {
        return this.purpose;
    }

    public Boolean getUtility() {
        return this.utility;
    }

    public Boolean getWeigh() {
        return this.weigh;
    }

    public Long getProductVendor() {
        return this.productVendor;
    }

    public String getProductVendorCode() {
        return this.productVendorCode;
    }

    public String getProductVendorName() {
        return this.productVendorName;
    }

    public String getProductBuyer() {
        return this.productBuyer;
    }

    public String getProductBuyerCode() {
        return this.productBuyerCode;
    }

    public String getProductBuyerName() {
        return this.productBuyerName;
    }

    public BigDecimal getMaxPrimeCosts() {
        return this.maxPrimeCosts;
    }

    public BigDecimal getRequestOrderLimit() {
        return this.requestOrderLimit;
    }

    public BigDecimal getArrivalAllowErrorLimit() {
        return this.arrivalAllowErrorLimit;
    }

    public BigDecimal getInvoiceAllowErrorLimit() {
        return this.invoiceAllowErrorLimit;
    }

    public BigDecimal getPlanOrderLimit() {
        return this.planOrderLimit;
    }

    public Boolean getEnableSubscribe() {
        return this.enableSubscribe;
    }

    public Integer getOrder() {
        return this.order;
    }

    public Boolean getRecommend() {
        return this.recommend;
    }

    public String getErpOuterCode() {
        return this.erpOuterCode;
    }

    public String getSaleStyle() {
        return this.saleStyle;
    }

    public String getShortName() {
        return this.shortName;
    }

    public String getMnemonicCode() {
        return this.mnemonicCode;
    }

    public MultilingualVO getReceiptName() {
        return this.receiptName;
    }

    public String getIncomeTaxRates() {
        return this.incomeTaxRates;
    }

    public String getIncomeTaxRatesCode() {
        return this.incomeTaxRatesCode;
    }

    public String getIncomeTaxRatesName() {
        return this.incomeTaxRatesName;
    }

    public String getOutputTaxRate() {
        return this.outputTaxRate;
    }

    public String getOutTaxRateCode() {
        return this.outTaxRateCode;
    }

    public String getOutTaxRateName() {
        return this.outTaxRateName;
    }

    public Long getPreferentialPolicyType() {
        return this.preferentialPolicyType;
    }

    public Long getProduceUnit() {
        return this.produceUnit;
    }

    public String getProduceUnitCode() {
        return this.produceUnitCode;
    }

    public String getProduceUnitName() {
        return this.produceUnitName;
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

    public BigDecimal getProduceRate() {
        return this.produceRate;
    }

    public Integer getDaysBeforeValidityReject() {
        return this.daysBeforeValidityReject;
    }

    public Integer getValidityWarningDays() {
        return this.validityWarningDays;
    }

    public String getWarehouseManager() {
        return this.warehouseManager;
    }

    public String getWarehouseManagerCode() {
        return this.warehouseManagerCode;
    }

    public String getWarehouseManagerName() {
        return this.warehouseManagerName;
    }

    public Long getDeliveryWarehouse() {
        return this.deliveryWarehouse;
    }

    public String getDeliveryWarehouseCode() {
        return this.deliveryWarehouseCode;
    }

    public String getDeliveryWarehouseName() {
        return this.deliveryWarehouseName;
    }

    public Long getReturnWarehouse() {
        return this.returnWarehouse;
    }

    public String getReturnWarehouseCode() {
        return this.returnWarehouseCode;
    }

    public String getReturnWarehouseName() {
        return this.returnWarehouseName;
    }

    public BigDecimal getInStoreExcessLimit() {
        return this.inStoreExcessLimit;
    }

    public BigDecimal getOutStoreExcessLimit() {
        return this.outStoreExcessLimit;
    }

    public BigDecimal getInStoreLessLimit() {
        return this.inStoreLessLimit;
    }

    public BigDecimal getOutStoreLessLimit() {
        return this.outStoreLessLimit;
    }

    public BigDecimal getStorageLossRate() {
        return this.storageLossRate;
    }

    public Boolean getAllowNegativeInventory() {
        return this.allowNegativeInventory;
    }

    public Integer getScanCountUnit() {
        return this.scanCountUnit;
    }

    public Boolean getExemption() {
        return this.exemption;
    }

    public Boolean getWarehousingByResult() {
        return this.warehousingByResult;
    }

    public Boolean getSalesReturnsExemption() {
        return this.salesReturnsExemption;
    }

    public Boolean getReturnsWarehousingByResult() {
        return this.returnsWarehousingByResult;
    }

    public Boolean getPeriodicalInspection() {
        return this.periodicalInspection;
    }

    public Integer getPeriodicalInspectionCycle() {
        return this.periodicalInspectionCycle;
    }

    public MultilingualVO getDisplayName() {
        return this.displayName;
    }

    public MultilingualVO getTitleMemo() {
        return this.titleMemo;
    }

    public Date getBeUpTime() {
        return this.beUpTime;
    }

    public String getReceiptName1() {
        return this.receiptName1;
    }

    public String getReceiptName2() {
        return this.receiptName2;
    }

    public String getReceiptName3() {
        return this.receiptName3;
    }

    public String getReceiptNam4() {
        return this.receiptNam4;
    }

    public String getReceiptName5() {
        return this.receiptName5;
    }

    public String getReceiptName6() {
        return this.receiptName6;
    }

    public String getMetadescription1() {
        return this.metadescription1;
    }

    public String getMetadescription2() {
        return this.metadescription2;
    }

    public String getMetadescription3() {
        return this.metadescription3;
    }

    public String getMetadescription4() {
        return this.metadescription4;
    }

    public String getMetadescription5() {
        return this.metadescription5;
    }

    public String getMetadescription6() {
        return this.metadescription6;
    }

    public String getDisplayName1() {
        return this.displayName1;
    }

    public String getDisplayName2() {
        return this.displayName2;
    }

    public String getDisplayName3() {
        return this.displayName3;
    }

    public String getDisplayName4() {
        return this.displayName4;
    }

    public String getDisplayName5() {
        return this.displayName5;
    }

    public String getDisplayName6() {
        return this.displayName6;
    }

    public String getTitleMemo1() {
        return this.titleMemo1;
    }

    public String getTitleMemo2() {
        return this.titleMemo2;
    }

    public String getTitleMemo3() {
        return this.titleMemo3;
    }

    public String getTitleMemo4() {
        return this.titleMemo4;
    }

    public String getTitleMemo5() {
        return this.titleMemo5;
    }

    public String getTitleMemo6() {
        return this.titleMemo6;
    }

    public Boolean getBarcodeManage() {
        return this.barcodeManage;
    }

    public Integer getManageByInventory() {
        return this.manageByInventory;
    }

    public Integer getRegistrationManager() {
        return this.registrationManager;
    }

    public Integer getAuthorizationManager() {
        return this.authorizationManager;
    }

    public String getSunshinePurchase() {
        return this.sunshinePurchase;
    }

    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public Long getReceiptWarehouse() {
        return this.receiptWarehouse;
    }

    public String getReceiptWarehouseCode() {
        return this.receiptWarehouseCode;
    }

    public String getReceiptWarehouseName() {
        return this.receiptWarehouseName;
    }

    public Integer getBOMType() {
        return this.BOMType;
    }

    public Long getBOMSource() {
        return this.BOMSource;
    }

    public Integer getBatchRule() {
        return this.batchRule;
    }

    public BigDecimal getEconomicQuantity() {
        return this.economicQuantity;
    }

    public BigDecimal getFixedQuantity() {
        return this.fixedQuantity;
    }

    public BigDecimal getBatchDouble() {
        return this.batchDouble;
    }

    public Integer getFrontLeadTime() {
        return this.frontLeadTime;
    }

    public Integer getBehindLeadTime() {
        return this.behindLeadTime;
    }

    public BigDecimal getLeadTimeCoefficient() {
        return this.leadTimeCoefficient;
    }

    public BigDecimal getLeadTimeQuantity() {
        return this.leadTimeQuantity;
    }

    public BigDecimal getFixedWastage() {
        return this.fixedWastage;
    }

    public BigDecimal getWastageRate() {
        return this.wastageRate;
    }

    public BigDecimal getRejectRate() {
        return this.rejectRate;
    }

    public Boolean getPrepareFeed() {
        return this.prepareFeed;
    }

    public Boolean getSpecialMaterials() {
        return this.specialMaterials;
    }

    public Boolean getVirtualPart() {
        return this.virtualPart;
    }

    public Integer getDemandConsolidation() {
        return this.demandConsolidation;
    }

    public Integer getDemandConsolidationType() {
        return this.demandConsolidationType;
    }

    public Integer getDemandConsolidationUnit() {
        return this.demandConsolidationUnit;
    }

    public Integer getDemandConsolidationNumber() {
        return this.demandConsolidationNumber;
    }

    public Integer getDemandConsolidationDateType() {
        return this.demandConsolidationDateType;
    }

    public Integer getResetForwardDays() {
        return this.resetForwardDays;
    }

    public Integer getResetBackwardDays() {
        return this.resetBackwardDays;
    }

    public Integer getBeyondSupplyDays() {
        return this.beyondSupplyDays;
    }

    public Boolean getReservation() {
        return this.reservation;
    }

    public Integer getLossType() {
        return this.lossType;
    }

    public Boolean getWorkingPlan() {
        return this.workingPlan;
    }

    public Boolean getECNControl() {
        return this.ECNControl;
    }

    public String getYtenantId() {
        return this.ytenantId;
    }

    public String getReceiptSpec() {
        return this.receiptSpec;
    }

    public String getReceiptModel() {
        return this.receiptModel;
    }

    public String getReceiptspec2() {
        return this.receiptspec2;
    }

    public String getReceiptmodel2() {
        return this.receiptmodel2;
    }

    public String getReceiptspec3() {
        return this.receiptspec3;
    }

    public String getReceiptmodel3() {
        return this.receiptmodel3;
    }

    public String getReceiptspec4() {
        return this.receiptspec4;
    }

    public String getReceiptmodel4() {
        return this.receiptmodel4;
    }

    public String getReceiptspec5() {
        return this.receiptspec5;
    }

    public String getReceiptmodel5() {
        return this.receiptmodel5;
    }

    public String getReceiptspec6() {
        return this.receiptspec6;
    }

    public String getReceiptmodel6() {
        return this.receiptmodel6;
    }

    public BigDecimal getDoubleSale() {
        return this.doubleSale;
    }

    public Integer getInspectionType() {
        return this.inspectionType;
    }

    public Boolean getLogisticsRelated() {
        return this.logisticsRelated;
    }

    public Integer getWeighingMode() {
        return this.weighingMode;
    }

    public Boolean getFixedReturn() {
        return this.fixedReturn;
    }

    public Boolean getReviewGrossWeight() {
        return this.reviewGrossWeight;
    }

    public Boolean getSpecialCarTransport() {
        return this.specialCarTransport;
    }

    public Integer getInventoryPlanStrategy() {
        return this.inventoryPlanStrategy;
    }

    public Integer getRangeType() {
        return this.rangeType;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public Long getCustomerId() {
        return this.customerId;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public Boolean getCreator() {
        return this.creator;
    }

    public Integer getExpiryDateCalculationMethod() {
        return this.expiryDateCalculationMethod;
    }

    public MultilingualVO getRemark() {
        return this.remark;
    }

    public String getRemark1() {
        return this.remark1;
    }

    public String getRemark2() {
        return this.remark2;
    }

    public String getRemark3() {
        return this.remark3;
    }

    public String getRemark4() {
        return this.remark4;
    }

    public String getRemark5() {
        return this.remark5;
    }

    public String getRemark6() {
        return this.remark6;
    }

    public String getBusinessAttribute() {
        return this.businessAttribute;
    }

    public Integer getBusinessAttributePurchase() {
        return this.businessAttributePurchase;
    }

    public Integer getBusinessAttributeSale() {
        return this.businessAttributeSale;
    }

    public Integer getBusinessAttributeSelfCreate() {
        return this.businessAttributeSelfCreate;
    }

    public Integer getBusinessAttributeOutSourcing() {
        return this.businessAttributeOutSourcing;
    }

    public Integer getTestRule() {
        return this.testRule;
    }

    public Integer getEnableStockPeriodRecheck() {
        return this.enableStockPeriodRecheck;
    }

    public Integer getReviewCycle() {
        return this.reviewCycle;
    }

    public Integer getRecheckReminderLeadTime() {
        return this.recheckReminderLeadTime;
    }

    public Integer getEnableStockExpireCheck() {
        return this.enableStockExpireCheck;
    }

    public Integer getEffectiveLeadTime() {
        return this.effectiveLeadTime;
    }

    public Integer getCheckReminderLeadTime() {
        return this.checkReminderLeadTime;
    }

    public Integer getEnableSparePartsManagement() {
        return this.enableSparePartsManagement;
    }

    public Integer getFullSetInspection() {
        return this.fullSetInspection;
    }

    public BigDecimal getPurchaseOrderQuantity() {
        return this.purchaseOrderQuantity;
    }

    public BigDecimal getPurchaseTimes() {
        return this.purchaseTimes;
    }

    public BigDecimal getDoubleReplenish() {
        return this.doubleReplenish;
    }

    public Integer getDirectProduction() {
        return this.directProduction;
    }

    public Integer getProjectTrackStrategy() {
        return this.projectTrackStrategy;
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

    public Integer getSingleInspection() {
        return this.singleInspection;
    }

    public Long getProductExtendCharacterDefId() {
        return this.productExtendCharacterDefId;
    }

    public Map<String, Object> getProductExtendCharacterDef() {
        return this.productExtendCharacterDef;
    }

    public String getMaterialStatusId() {
        return this.materialStatusId;
    }

    public String getMaterialStatusCode() {
        return this.materialStatusCode;
    }

    public Long getBillingUnitId() {
        return this.billingUnitId;
    }

    public Integer getCheckByRevenueManagement() {
        return this.checkByRevenueManagement;
    }

    public Integer getOverSigning() {
        return this.overSigning;
    }

    public Integer getAtpInspection() {
        return this.atpInspection;
    }

    public BigDecimal getDoublePick() {
        return this.doublePick;
    }

    public Integer getMtoStrategy() {
        return this.mtoStrategy;
    }

    public Integer getStrategyComparisonRule() {
        return this.strategyComparisonRule;
    }

    public String getManufacturingStrategy() {
        return this.manufacturingStrategy;
    }

    public MultilingualVO getReceiptSpecMultilingual() {
        return this.receiptSpecMultilingual;
    }

    public MultilingualVO getReceiptModelMultilingual() {
        return this.receiptModelMultilingual;
    }

    public Integer getReturnInspection() {
        return this.returnInspection;
    }

    public Integer getSendInspection() {
        return this.sendInspection;
    }

    public Integer getPlanCheckDays() {
        return this.planCheckDays;
    }

    public List<ProductLoadWayVO> getProductLoadWays() {
        return this.productLoadWays;
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

    public Integer getInspectionControlPoint() {
        return this.inspectionControlPoint;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductApplyRangeId(Long productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setPurchaseUnit(Long purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

    public void setPurchaseUnitCode(String purchaseUnitCode) {
        this.purchaseUnitCode = purchaseUnitCode;
    }

    public void setPurchaseUnitName(String purchaseUnitName) {
        this.purchaseUnitName = purchaseUnitName;
    }

    public void setPurchasePriceUnit(Long purchasePriceUnit) {
        this.purchasePriceUnit = purchasePriceUnit;
    }

    public void setPurchasePriceUnitCode(String purchasePriceUnitCode) {
        this.purchasePriceUnitCode = purchasePriceUnitCode;
    }

    public void setPurchasePriceUnitName(String purchasePriceUnitName) {
        this.purchasePriceUnitName = purchasePriceUnitName;
    }

    public void setPurchaseRate(BigDecimal purchaseRate) {
        this.purchaseRate = purchaseRate;
    }

    public void setStockUnit(Long stockUnit) {
        this.stockUnit = stockUnit;
    }

    public void setStockUnitCode(String stockUnitCode) {
        this.stockUnitCode = stockUnitCode;
    }

    public void setStockUnitName(String stockUnitName) {
        this.stockUnitName = stockUnitName;
    }

    public void setStockRate(BigDecimal stockRate) {
        this.stockRate = stockRate;
    }

    public void setBatchUnit(Long batchUnit) {
        this.batchUnit = batchUnit;
    }

    public void setBatchUnitCode(String batchUnitCode) {
        this.batchUnitCode = batchUnitCode;
    }

    public void setBatchUnitName(String batchUnitName) {
        this.batchUnitName = batchUnitName;
    }

    public void setBatchRate(BigDecimal batchRate) {
        this.batchRate = batchRate;
    }

    public void setOnlineUnit(Long onlineUnit) {
        this.onlineUnit = onlineUnit;
    }

    public void setOnlineUnitCode(String onlineUnitCode) {
        this.onlineUnitCode = onlineUnitCode;
    }

    public void setOnlineUnitName(String onlineUnitName) {
        this.onlineUnitName = onlineUnitName;
    }

    public void setOnlineRate(BigDecimal onlineRate) {
        this.onlineRate = onlineRate;
    }

    public void setOfflineUnit(Long offlineUnit) {
        this.offlineUnit = offlineUnit;
    }

    public void setOfflineUnitCode(String offlineUnitCode) {
        this.offlineUnitCode = offlineUnitCode;
    }

    public void setOfflineUnitName(String offlineUnitName) {
        this.offlineUnitName = offlineUnitName;
    }

    public void setOfflineRate(BigDecimal offlineRate) {
        this.offlineRate = offlineRate;
    }

    public void setRequireUnit(Long requireUnit) {
        this.requireUnit = requireUnit;
    }

    public void setRequireUnitCode(String requireUnitCode) {
        this.requireUnitCode = requireUnitCode;
    }

    public void setRequireUnitName(String requireUnitName) {
        this.requireUnitName = requireUnitName;
    }

    public void setRequireRate(BigDecimal requireRate) {
        this.requireRate = requireRate;
    }

    public void setBatchPriceUnit(Long batchPriceUnit) {
        this.batchPriceUnit = batchPriceUnit;
    }

    public void setBatchPriceUnitCode(String batchPriceUnitCode) {
        this.batchPriceUnitCode = batchPriceUnitCode;
    }

    public void setBatchPriceUnitName(String batchPriceUnitName) {
        this.batchPriceUnitName = batchPriceUnitName;
    }

    public void setInspectionUnit(Long inspectionUnit) {
        this.inspectionUnit = inspectionUnit;
    }

    public void setInspectionUnitCode(String inspectionUnitCode) {
        this.inspectionUnitCode = inspectionUnitCode;
    }

    public void setInspectionUnitName(String inspectionUnitName) {
        this.inspectionUnitName = inspectionUnitName;
    }

    public void setBatchPriceRate(BigDecimal batchPriceRate) {
        this.batchPriceRate = batchPriceRate;
    }

    public void setBatchPrice(BigDecimal batchPrice) {
        this.batchPrice = batchPrice;
    }

    public void setMarkPrice(BigDecimal markPrice) {
        this.markPrice = markPrice;
    }

    public void setLowestMarkPrice(BigDecimal lowestMarkPrice) {
        this.lowestMarkPrice = lowestMarkPrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public void setPrimeCosts(BigDecimal primeCosts) {
        this.primeCosts = primeCosts;
    }

    public void setSettleAccountsRate(BigDecimal settleAccountsRate) {
        this.settleAccountsRate = settleAccountsRate;
    }

    public void setDisplayPrice(Boolean displayPrice) {
        this.displayPrice = displayPrice;
    }

    public void setPriceAreaMessage(String priceAreaMessage) {
        this.priceAreaMessage = priceAreaMessage;
    }

    public void setStockABCClass(Integer stockABCClass) {
        this.stockABCClass = stockABCClass;
    }

    public void setBatchManage(Boolean batchManage) {
        this.batchManage = batchManage;
    }

    public void setExpiryDateManage(Boolean expiryDateManage) {
        this.expiryDateManage = expiryDateManage;
    }

    public void setExpireDateNo(Integer expireDateNo) {
        this.expireDateNo = expireDateNo;
    }

    public void setExpireDateUnit(Integer expireDateUnit) {
        this.expireDateUnit = expireDateUnit;
    }

    public void setSerialNoManage(Boolean serialNoManage) {
        this.serialNoManage = serialNoManage;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public void setVolume(BigDecimal volume) {
        this.volume = volume;
    }

    public void setSafetyStock(BigDecimal safetyStock) {
        this.safetyStock = safetyStock;
    }

    public void setHighestStock(BigDecimal highestStock) {
        this.highestStock = highestStock;
    }

    public void setLowestStock(BigDecimal lowestStock) {
        this.lowestStock = lowestStock;
    }

    public void setRopStock(BigDecimal ropStock) {
        this.ropStock = ropStock;
    }

    public void setOmsWarehouse(Long omsWarehouse) {
        this.omsWarehouse = omsWarehouse;
    }

    public void setOmsWarehouseCode(String omsWarehouseCode) {
        this.omsWarehouseCode = omsWarehouseCode;
    }

    public void setOmsWarehouseName(String omsWarehouseName) {
        this.omsWarehouseName = omsWarehouseName;
    }

    public void setMaximumTurnoverDays(Integer maximumTurnoverDays) {
        this.maximumTurnoverDays = maximumTurnoverDays;
    }

    public void setCanSale(Boolean canSale) {
        this.canSale = canSale;
    }

    public void setMinOrderQuantity(BigDecimal minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    public void setDeliveryDays(Integer deliveryDays) {
        this.deliveryDays = deliveryDays;
    }

    public void setOrderDlyFeeRuleId(Long orderDlyFeeRuleId) {
        this.orderDlyFeeRuleId = orderDlyFeeRuleId;
    }

    public void setEnableCyclePurchase(Boolean enableCyclePurchase) {
        this.enableCyclePurchase = enableCyclePurchase;
    }

    public void setEnableDeposit(Boolean enableDeposit) {
        this.enableDeposit = enableDeposit;
    }

    public void setDepositDealPayType(Integer depositDealPayType) {
        this.depositDealPayType = depositDealPayType;
    }

    public void setDeposits(BigDecimal deposits) {
        this.deposits = deposits;
    }

    public void setDepositPercentage(BigDecimal depositPercentage) {
        this.depositPercentage = depositPercentage;
    }

    public void setEnableModifyDeposit(Boolean enableModifyDeposit) {
        this.enableModifyDeposit = enableModifyDeposit;
    }

    public void setMinimumDeposits(BigDecimal minimumDeposits) {
        this.minimumDeposits = minimumDeposits;
    }

    public void setDepositPayType(Integer depositPayType) {
        this.depositPayType = depositPayType;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public void setMetaDescription(MultilingualVO metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setSalePoints(Integer salePoints) {
        this.salePoints = salePoints;
    }

    public void setInventoryCount(BigDecimal inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public void setTemplateOfFreightId(Long templateOfFreightId) {
        this.templateOfFreightId = templateOfFreightId;
    }

    public void setBaseSaleCount(Integer baseSaleCount) {
        this.baseSaleCount = baseSaleCount;
    }

    public void setAllArea(Boolean allArea) {
        this.allArea = allArea;
    }

    public void setEnableContractManagement(Boolean enableContractManagement) {
        this.enableContractManagement = enableContractManagement;
    }

    public void setAllowStorePurchase(Boolean allowStorePurchase) {
        this.allowStorePurchase = allowStorePurchase;
    }

    public void setPriceChangeAllowed(Boolean priceChangeAllowed) {
        this.priceChangeAllowed = priceChangeAllowed;
    }

    public void setSaleInOfflineStore(Boolean saleInOfflineStore) {
        this.saleInOfflineStore = saleInOfflineStore;
    }

    public void setOfflineStoreOrder(Boolean offlineStoreOrder) {
        this.offlineStoreOrder = offlineStoreOrder;
    }

    public void setOfflineStoreReturn(Boolean offlineStoreReturn) {
        this.offlineStoreReturn = offlineStoreReturn;
    }

    public void setWeighingOrNot(Boolean weighingOrNot) {
        this.weighingOrNot = weighingOrNot;
    }

    public void setProcess(Boolean process) {
        this.process = process;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    public void setMaterial(Boolean material) {
        this.material = material;
    }

    public void setRetailPriceDimension(Integer retailPriceDimension) {
        this.retailPriceDimension = retailPriceDimension;
    }

    public void setDeliverQuantityChange(Integer deliverQuantityChange) {
        this.deliverQuantityChange = deliverQuantityChange;
    }

    public void setNoTaxCostPrice(BigDecimal noTaxCostPrice) {
        this.noTaxCostPrice = noTaxCostPrice;
    }

    public void setCheckByBatch(Boolean checkByBatch) {
        this.checkByBatch = checkByBatch;
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

    public void setAccountingByItem(Boolean accountingByItem) {
        this.accountingByItem = accountingByItem;
    }

    public void setStoreOffAndOffState(Boolean storeOffAndOffState) {
        this.storeOffAndOffState = storeOffAndOffState;
    }

    public void setOrderLoadAndUnloadStatus(Boolean orderLoadAndUnloadStatus) {
        this.orderLoadAndUnloadStatus = orderLoadAndUnloadStatus;
    }

    public void setMallUpTime(Date mallUpTime) {
        this.mallUpTime = mallUpTime;
    }

    public void setMallDownTime(Date mallDownTime) {
        this.mallDownTime = mallDownTime;
    }

    public void setOrderUpTime(Date orderUpTime) {
        this.orderUpTime = orderUpTime;
    }

    public void setOrderDownTime(Date orderDownTime) {
        this.orderDownTime = orderDownTime;
    }

    public void setMallUpCount(Integer mallUpCount) {
        this.mallUpCount = mallUpCount;
    }

    public void setMallDownCount(Integer mallDownCount) {
        this.mallDownCount = mallDownCount;
    }

    public void setOrderUpCount(Integer orderUpCount) {
        this.orderUpCount = orderUpCount;
    }

    public void setOrderDownCount(Integer orderDownCount) {
        this.orderDownCount = orderDownCount;
    }

    public void setMinBatchPrice(BigDecimal minBatchPrice) {
        this.minBatchPrice = minBatchPrice;
    }

    public void setMaxBatchPrice(BigDecimal maxBatchPrice) {
        this.maxBatchPrice = maxBatchPrice;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setTenant(Long tenant) {
        this.tenant = tenant;
    }

    public void setSaleChannel(String saleChannel) {
        this.saleChannel = saleChannel;
    }

    public void setSaleChannelOfOnlineBatch(Boolean saleChannelOfOnlineBatch) {
        this.saleChannelOfOnlineBatch = saleChannelOfOnlineBatch;
    }

    public void setSaleChannelOfOnlineRetail(Boolean saleChannelOfOnlineRetail) {
        this.saleChannelOfOnlineRetail = saleChannelOfOnlineRetail;
    }

    public void setSaleChannelOfOfflineRetail(Boolean saleChannelOfOfflineRetail) {
        this.saleChannelOfOfflineRetail = saleChannelOfOfflineRetail;
    }

    public void setSaleChannelOfDistribution(Boolean saleChannelOfDistribution) {
        this.saleChannelOfDistribution = saleChannelOfDistribution;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    @JsonProperty(value="stopstatus")
    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setStopTime(Date stopTime) {
        this.stopTime = stopTime;
    }

    public void setCheckFree(Integer checkFree) {
        this.checkFree = checkFree;
    }

    public void setServiceDuration(BigDecimal serviceDuration) {
        this.serviceDuration = serviceDuration;
    }

    public void setServiceDurationUnit(Integer serviceDurationUnit) {
        this.serviceDurationUnit = serviceDurationUnit;
    }

    public void setCanOrder(Boolean canOrder) {
        this.canOrder = canOrder;
    }

    public void setOnlyOrder(Boolean onlyOrder) {
        this.onlyOrder = onlyOrder;
    }

    public void setOrderAdvanceTime(Integer orderAdvanceTime) {
        this.orderAdvanceTime = orderAdvanceTime;
    }

    public void setValueManageType(Integer valueManageType) {
        this.valueManageType = valueManageType;
    }

    public void setCostValuation(Integer costValuation) {
        this.costValuation = costValuation;
    }

    public void setCheckByCost(Boolean checkByCost) {
        this.checkByCost = checkByCost;
    }

    public void setMaterialCost(Boolean materialCost) {
        this.materialCost = materialCost;
    }

    public void setPlanDefaultAttribute(Integer planDefaultAttribute) {
        this.planDefaultAttribute = planDefaultAttribute;
    }

    public void setManufactureSpecs(String manufactureSpecs) {
        this.manufactureSpecs = manufactureSpecs;
    }

    public void setPlanMethod(Integer planMethod) {
        this.planMethod = planMethod;
    }

    public void setPlanStrategy(Long planStrategy) {
        this.planStrategy = planStrategy;
    }

    public void setKeySubPart(Boolean keySubPart) {
        this.keySubPart = keySubPart;
    }

    public void setSupplyDemandPolicy(Integer supplyDemandPolicy) {
        this.supplyDemandPolicy = supplyDemandPolicy;
    }

    public void setFixedLeadTime(Integer fixedLeadTime) {
        this.fixedLeadTime = fixedLeadTime;
    }

    public void setBatchPolicy(Integer batchPolicy) {
        this.batchPolicy = batchPolicy;
    }

    public void setSupplyType(Integer supplyType) {
        this.supplyType = supplyType;
    }

    public void setProduceDepartment(String produceDepartment) {
        this.produceDepartment = produceDepartment;
    }

    public void setProduceDepartmentCode(String produceDepartmentCode) {
        this.produceDepartmentCode = produceDepartmentCode;
    }

    public void setProduceDepartmentName(String produceDepartmentName) {
        this.produceDepartmentName = produceDepartmentName;
    }

    public void setManufacturePlanner(String manufacturePlanner) {
        this.manufacturePlanner = manufacturePlanner;
    }

    public void setManufacturePlannerCode(String manufacturePlannerCode) {
        this.manufacturePlannerCode = manufacturePlannerCode;
    }

    public void setManufacturePlannerName(String manufacturePlannerName) {
        this.manufacturePlannerName = manufacturePlannerName;
    }

    public void setEngineeringDrawingNo(String engineeringDrawingNo) {
        this.engineeringDrawingNo = engineeringDrawingNo;
    }

    public void setSupplyTimes(Integer supplyTimes) {
        this.supplyTimes = supplyTimes;
    }

    public void setPlanProduceLimit(BigDecimal planProduceLimit) {
        this.planProduceLimit = planProduceLimit;
    }

    public void setBindCarrier(Boolean bindCarrier) {
        this.bindCarrier = bindCarrier;
    }

    public void setPurpose(Integer purpose) {
        this.purpose = purpose;
    }

    public void setUtility(Boolean utility) {
        this.utility = utility;
    }

    public void setWeigh(Boolean weigh) {
        this.weigh = weigh;
    }

    public void setProductVendor(Long productVendor) {
        this.productVendor = productVendor;
    }

    public void setProductVendorCode(String productVendorCode) {
        this.productVendorCode = productVendorCode;
    }

    public void setProductVendorName(String productVendorName) {
        this.productVendorName = productVendorName;
    }

    public void setProductBuyer(String productBuyer) {
        this.productBuyer = productBuyer;
    }

    public void setProductBuyerCode(String productBuyerCode) {
        this.productBuyerCode = productBuyerCode;
    }

    public void setProductBuyerName(String productBuyerName) {
        this.productBuyerName = productBuyerName;
    }

    public void setMaxPrimeCosts(BigDecimal maxPrimeCosts) {
        this.maxPrimeCosts = maxPrimeCosts;
    }

    public void setRequestOrderLimit(BigDecimal requestOrderLimit) {
        this.requestOrderLimit = requestOrderLimit;
    }

    public void setArrivalAllowErrorLimit(BigDecimal arrivalAllowErrorLimit) {
        this.arrivalAllowErrorLimit = arrivalAllowErrorLimit;
    }

    public void setInvoiceAllowErrorLimit(BigDecimal invoiceAllowErrorLimit) {
        this.invoiceAllowErrorLimit = invoiceAllowErrorLimit;
    }

    public void setPlanOrderLimit(BigDecimal planOrderLimit) {
        this.planOrderLimit = planOrderLimit;
    }

    public void setEnableSubscribe(Boolean enableSubscribe) {
        this.enableSubscribe = enableSubscribe;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public void setErpOuterCode(String erpOuterCode) {
        this.erpOuterCode = erpOuterCode;
    }

    public void setSaleStyle(String saleStyle) {
        this.saleStyle = saleStyle;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public void setReceiptName(MultilingualVO receiptName) {
        this.receiptName = receiptName;
    }

    public void setIncomeTaxRates(String incomeTaxRates) {
        this.incomeTaxRates = incomeTaxRates;
    }

    public void setIncomeTaxRatesCode(String incomeTaxRatesCode) {
        this.incomeTaxRatesCode = incomeTaxRatesCode;
    }

    public void setIncomeTaxRatesName(String incomeTaxRatesName) {
        this.incomeTaxRatesName = incomeTaxRatesName;
    }

    public void setOutputTaxRate(String outputTaxRate) {
        this.outputTaxRate = outputTaxRate;
    }

    public void setOutTaxRateCode(String outTaxRateCode) {
        this.outTaxRateCode = outTaxRateCode;
    }

    public void setOutTaxRateName(String outTaxRateName) {
        this.outTaxRateName = outTaxRateName;
    }

    public void setPreferentialPolicyType(Long preferentialPolicyType) {
        this.preferentialPolicyType = preferentialPolicyType;
    }

    public void setProduceUnit(Long produceUnit) {
        this.produceUnit = produceUnit;
    }

    public void setProduceUnitCode(String produceUnitCode) {
        this.produceUnitCode = produceUnitCode;
    }

    public void setProduceUnitName(String produceUnitName) {
        this.produceUnitName = produceUnitName;
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

    public void setProduceRate(BigDecimal produceRate) {
        this.produceRate = produceRate;
    }

    public void setDaysBeforeValidityReject(Integer daysBeforeValidityReject) {
        this.daysBeforeValidityReject = daysBeforeValidityReject;
    }

    public void setValidityWarningDays(Integer validityWarningDays) {
        this.validityWarningDays = validityWarningDays;
    }

    public void setWarehouseManager(String warehouseManager) {
        this.warehouseManager = warehouseManager;
    }

    public void setWarehouseManagerCode(String warehouseManagerCode) {
        this.warehouseManagerCode = warehouseManagerCode;
    }

    public void setWarehouseManagerName(String warehouseManagerName) {
        this.warehouseManagerName = warehouseManagerName;
    }

    public void setDeliveryWarehouse(Long deliveryWarehouse) {
        this.deliveryWarehouse = deliveryWarehouse;
    }

    public void setDeliveryWarehouseCode(String deliveryWarehouseCode) {
        this.deliveryWarehouseCode = deliveryWarehouseCode;
    }

    public void setDeliveryWarehouseName(String deliveryWarehouseName) {
        this.deliveryWarehouseName = deliveryWarehouseName;
    }

    public void setReturnWarehouse(Long returnWarehouse) {
        this.returnWarehouse = returnWarehouse;
    }

    public void setReturnWarehouseCode(String returnWarehouseCode) {
        this.returnWarehouseCode = returnWarehouseCode;
    }

    public void setReturnWarehouseName(String returnWarehouseName) {
        this.returnWarehouseName = returnWarehouseName;
    }

    public void setInStoreExcessLimit(BigDecimal inStoreExcessLimit) {
        this.inStoreExcessLimit = inStoreExcessLimit;
    }

    public void setOutStoreExcessLimit(BigDecimal outStoreExcessLimit) {
        this.outStoreExcessLimit = outStoreExcessLimit;
    }

    public void setInStoreLessLimit(BigDecimal inStoreLessLimit) {
        this.inStoreLessLimit = inStoreLessLimit;
    }

    public void setOutStoreLessLimit(BigDecimal outStoreLessLimit) {
        this.outStoreLessLimit = outStoreLessLimit;
    }

    public void setStorageLossRate(BigDecimal storageLossRate) {
        this.storageLossRate = storageLossRate;
    }

    public void setAllowNegativeInventory(Boolean allowNegativeInventory) {
        this.allowNegativeInventory = allowNegativeInventory;
    }

    public void setScanCountUnit(Integer scanCountUnit) {
        this.scanCountUnit = scanCountUnit;
    }

    public void setExemption(Boolean exemption) {
        this.exemption = exemption;
    }

    public void setWarehousingByResult(Boolean warehousingByResult) {
        this.warehousingByResult = warehousingByResult;
    }

    public void setSalesReturnsExemption(Boolean salesReturnsExemption) {
        this.salesReturnsExemption = salesReturnsExemption;
    }

    public void setReturnsWarehousingByResult(Boolean returnsWarehousingByResult) {
        this.returnsWarehousingByResult = returnsWarehousingByResult;
    }

    public void setPeriodicalInspection(Boolean periodicalInspection) {
        this.periodicalInspection = periodicalInspection;
    }

    public void setPeriodicalInspectionCycle(Integer periodicalInspectionCycle) {
        this.periodicalInspectionCycle = periodicalInspectionCycle;
    }

    public void setDisplayName(MultilingualVO displayName) {
        this.displayName = displayName;
    }

    public void setTitleMemo(MultilingualVO titleMemo) {
        this.titleMemo = titleMemo;
    }

    public void setBeUpTime(Date beUpTime) {
        this.beUpTime = beUpTime;
    }

    public void setReceiptName1(String receiptName1) {
        this.receiptName1 = receiptName1;
    }

    public void setReceiptName2(String receiptName2) {
        this.receiptName2 = receiptName2;
    }

    public void setReceiptName3(String receiptName3) {
        this.receiptName3 = receiptName3;
    }

    public void setReceiptNam4(String receiptNam4) {
        this.receiptNam4 = receiptNam4;
    }

    public void setReceiptName5(String receiptName5) {
        this.receiptName5 = receiptName5;
    }

    public void setReceiptName6(String receiptName6) {
        this.receiptName6 = receiptName6;
    }

    public void setMetadescription1(String metadescription1) {
        this.metadescription1 = metadescription1;
    }

    public void setMetadescription2(String metadescription2) {
        this.metadescription2 = metadescription2;
    }

    public void setMetadescription3(String metadescription3) {
        this.metadescription3 = metadescription3;
    }

    public void setMetadescription4(String metadescription4) {
        this.metadescription4 = metadescription4;
    }

    public void setMetadescription5(String metadescription5) {
        this.metadescription5 = metadescription5;
    }

    public void setMetadescription6(String metadescription6) {
        this.metadescription6 = metadescription6;
    }

    public void setDisplayName1(String displayName1) {
        this.displayName1 = displayName1;
    }

    public void setDisplayName2(String displayName2) {
        this.displayName2 = displayName2;
    }

    public void setDisplayName3(String displayName3) {
        this.displayName3 = displayName3;
    }

    public void setDisplayName4(String displayName4) {
        this.displayName4 = displayName4;
    }

    public void setDisplayName5(String displayName5) {
        this.displayName5 = displayName5;
    }

    public void setDisplayName6(String displayName6) {
        this.displayName6 = displayName6;
    }

    public void setTitleMemo1(String titleMemo1) {
        this.titleMemo1 = titleMemo1;
    }

    public void setTitleMemo2(String titleMemo2) {
        this.titleMemo2 = titleMemo2;
    }

    public void setTitleMemo3(String titleMemo3) {
        this.titleMemo3 = titleMemo3;
    }

    public void setTitleMemo4(String titleMemo4) {
        this.titleMemo4 = titleMemo4;
    }

    public void setTitleMemo5(String titleMemo5) {
        this.titleMemo5 = titleMemo5;
    }

    public void setTitleMemo6(String titleMemo6) {
        this.titleMemo6 = titleMemo6;
    }

    public void setBarcodeManage(Boolean barcodeManage) {
        this.barcodeManage = barcodeManage;
    }

    public void setManageByInventory(Integer manageByInventory) {
        this.manageByInventory = manageByInventory;
    }

    public void setRegistrationManager(Integer registrationManager) {
        this.registrationManager = registrationManager;
    }

    public void setAuthorizationManager(Integer authorizationManager) {
        this.authorizationManager = authorizationManager;
    }

    public void setSunshinePurchase(String sunshinePurchase) {
        this.sunshinePurchase = sunshinePurchase;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setReceiptWarehouse(Long receiptWarehouse) {
        this.receiptWarehouse = receiptWarehouse;
    }

    public void setReceiptWarehouseCode(String receiptWarehouseCode) {
        this.receiptWarehouseCode = receiptWarehouseCode;
    }

    public void setReceiptWarehouseName(String receiptWarehouseName) {
        this.receiptWarehouseName = receiptWarehouseName;
    }

    public void setBOMType(Integer BOMType) {
        this.BOMType = BOMType;
    }

    public void setBOMSource(Long BOMSource) {
        this.BOMSource = BOMSource;
    }

    public void setBatchRule(Integer batchRule) {
        this.batchRule = batchRule;
    }

    public void setEconomicQuantity(BigDecimal economicQuantity) {
        this.economicQuantity = economicQuantity;
    }

    public void setFixedQuantity(BigDecimal fixedQuantity) {
        this.fixedQuantity = fixedQuantity;
    }

    public void setBatchDouble(BigDecimal batchDouble) {
        this.batchDouble = batchDouble;
    }

    public void setFrontLeadTime(Integer frontLeadTime) {
        this.frontLeadTime = frontLeadTime;
    }

    public void setBehindLeadTime(Integer behindLeadTime) {
        this.behindLeadTime = behindLeadTime;
    }

    public void setLeadTimeCoefficient(BigDecimal leadTimeCoefficient) {
        this.leadTimeCoefficient = leadTimeCoefficient;
    }

    public void setLeadTimeQuantity(BigDecimal leadTimeQuantity) {
        this.leadTimeQuantity = leadTimeQuantity;
    }

    public void setFixedWastage(BigDecimal fixedWastage) {
        this.fixedWastage = fixedWastage;
    }

    public void setWastageRate(BigDecimal wastageRate) {
        this.wastageRate = wastageRate;
    }

    public void setRejectRate(BigDecimal rejectRate) {
        this.rejectRate = rejectRate;
    }

    public void setPrepareFeed(Boolean prepareFeed) {
        this.prepareFeed = prepareFeed;
    }

    public void setSpecialMaterials(Boolean specialMaterials) {
        this.specialMaterials = specialMaterials;
    }

    public void setVirtualPart(Boolean virtualPart) {
        this.virtualPart = virtualPart;
    }

    public void setDemandConsolidation(Integer demandConsolidation) {
        this.demandConsolidation = demandConsolidation;
    }

    public void setDemandConsolidationType(Integer demandConsolidationType) {
        this.demandConsolidationType = demandConsolidationType;
    }

    public void setDemandConsolidationUnit(Integer demandConsolidationUnit) {
        this.demandConsolidationUnit = demandConsolidationUnit;
    }

    public void setDemandConsolidationNumber(Integer demandConsolidationNumber) {
        this.demandConsolidationNumber = demandConsolidationNumber;
    }

    public void setDemandConsolidationDateType(Integer demandConsolidationDateType) {
        this.demandConsolidationDateType = demandConsolidationDateType;
    }

    public void setResetForwardDays(Integer resetForwardDays) {
        this.resetForwardDays = resetForwardDays;
    }

    public void setResetBackwardDays(Integer resetBackwardDays) {
        this.resetBackwardDays = resetBackwardDays;
    }

    public void setBeyondSupplyDays(Integer beyondSupplyDays) {
        this.beyondSupplyDays = beyondSupplyDays;
    }

    public void setReservation(Boolean reservation) {
        this.reservation = reservation;
    }

    public void setLossType(Integer lossType) {
        this.lossType = lossType;
    }

    public void setWorkingPlan(Boolean workingPlan) {
        this.workingPlan = workingPlan;
    }

    @JsonProperty(value="ECNControl")
    public void setECNControl(Boolean ECNControl) {
        this.ECNControl = ECNControl;
    }

    public void setYtenantId(String ytenantId) {
        this.ytenantId = ytenantId;
    }

    public void setReceiptSpec(String receiptSpec) {
        this.receiptSpec = receiptSpec;
    }

    public void setReceiptModel(String receiptModel) {
        this.receiptModel = receiptModel;
    }

    public void setReceiptspec2(String receiptspec2) {
        this.receiptspec2 = receiptspec2;
    }

    public void setReceiptmodel2(String receiptmodel2) {
        this.receiptmodel2 = receiptmodel2;
    }

    public void setReceiptspec3(String receiptspec3) {
        this.receiptspec3 = receiptspec3;
    }

    public void setReceiptmodel3(String receiptmodel3) {
        this.receiptmodel3 = receiptmodel3;
    }

    public void setReceiptspec4(String receiptspec4) {
        this.receiptspec4 = receiptspec4;
    }

    public void setReceiptmodel4(String receiptmodel4) {
        this.receiptmodel4 = receiptmodel4;
    }

    public void setReceiptspec5(String receiptspec5) {
        this.receiptspec5 = receiptspec5;
    }

    public void setReceiptmodel5(String receiptmodel5) {
        this.receiptmodel5 = receiptmodel5;
    }

    public void setReceiptspec6(String receiptspec6) {
        this.receiptspec6 = receiptspec6;
    }

    public void setReceiptmodel6(String receiptmodel6) {
        this.receiptmodel6 = receiptmodel6;
    }

    public void setDoubleSale(BigDecimal doubleSale) {
        this.doubleSale = doubleSale;
    }

    public void setInspectionType(Integer inspectionType) {
        this.inspectionType = inspectionType;
    }

    public void setLogisticsRelated(Boolean logisticsRelated) {
        this.logisticsRelated = logisticsRelated;
    }

    public void setWeighingMode(Integer weighingMode) {
        this.weighingMode = weighingMode;
    }

    public void setFixedReturn(Boolean fixedReturn) {
        this.fixedReturn = fixedReturn;
    }

    public void setReviewGrossWeight(Boolean reviewGrossWeight) {
        this.reviewGrossWeight = reviewGrossWeight;
    }

    public void setSpecialCarTransport(Boolean specialCarTransport) {
        this.specialCarTransport = specialCarTransport;
    }

    public void setInventoryPlanStrategy(Integer inventoryPlanStrategy) {
        this.inventoryPlanStrategy = inventoryPlanStrategy;
    }

    public void setRangeType(Integer rangeType) {
        this.rangeType = rangeType;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public void setCreator(Boolean creator) {
        this.creator = creator;
    }

    public void setExpiryDateCalculationMethod(Integer expiryDateCalculationMethod) {
        this.expiryDateCalculationMethod = expiryDateCalculationMethod;
    }

    public void setRemark(MultilingualVO remark) {
        this.remark = remark;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4;
    }

    public void setRemark5(String remark5) {
        this.remark5 = remark5;
    }

    public void setRemark6(String remark6) {
        this.remark6 = remark6;
    }

    public void setBusinessAttribute(String businessAttribute) {
        this.businessAttribute = businessAttribute;
    }

    public void setBusinessAttributePurchase(Integer businessAttributePurchase) {
        this.businessAttributePurchase = businessAttributePurchase;
    }

    public void setBusinessAttributeSale(Integer businessAttributeSale) {
        this.businessAttributeSale = businessAttributeSale;
    }

    public void setBusinessAttributeSelfCreate(Integer businessAttributeSelfCreate) {
        this.businessAttributeSelfCreate = businessAttributeSelfCreate;
    }

    public void setBusinessAttributeOutSourcing(Integer businessAttributeOutSourcing) {
        this.businessAttributeOutSourcing = businessAttributeOutSourcing;
    }

    public void setTestRule(Integer testRule) {
        this.testRule = testRule;
    }

    public void setEnableStockPeriodRecheck(Integer enableStockPeriodRecheck) {
        this.enableStockPeriodRecheck = enableStockPeriodRecheck;
    }

    public void setReviewCycle(Integer reviewCycle) {
        this.reviewCycle = reviewCycle;
    }

    public void setRecheckReminderLeadTime(Integer recheckReminderLeadTime) {
        this.recheckReminderLeadTime = recheckReminderLeadTime;
    }

    public void setEnableStockExpireCheck(Integer enableStockExpireCheck) {
        this.enableStockExpireCheck = enableStockExpireCheck;
    }

    public void setEffectiveLeadTime(Integer effectiveLeadTime) {
        this.effectiveLeadTime = effectiveLeadTime;
    }

    public void setCheckReminderLeadTime(Integer checkReminderLeadTime) {
        this.checkReminderLeadTime = checkReminderLeadTime;
    }

    public void setEnableSparePartsManagement(Integer enableSparePartsManagement) {
        this.enableSparePartsManagement = enableSparePartsManagement;
    }

    public void setFullSetInspection(Integer fullSetInspection) {
        this.fullSetInspection = fullSetInspection;
    }

    public void setPurchaseOrderQuantity(BigDecimal purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }

    public void setPurchaseTimes(BigDecimal purchaseTimes) {
        this.purchaseTimes = purchaseTimes;
    }

    public void setDoubleReplenish(BigDecimal doubleReplenish) {
        this.doubleReplenish = doubleReplenish;
    }

    public void setDirectProduction(Integer directProduction) {
        this.directProduction = directProduction;
    }

    public void setProjectTrackStrategy(Integer projectTrackStrategy) {
        this.projectTrackStrategy = projectTrackStrategy;
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

    public void setSingleInspection(Integer singleInspection) {
        this.singleInspection = singleInspection;
    }

    public void setProductExtendCharacterDefId(Long productExtendCharacterDefId) {
        this.productExtendCharacterDefId = productExtendCharacterDefId;
    }

    public void setProductExtendCharacterDef(Map<String, Object> productExtendCharacterDef) {
        this.productExtendCharacterDef = productExtendCharacterDef;
    }

    public void setMaterialStatusId(String materialStatusId) {
        this.materialStatusId = materialStatusId;
    }

    public void setMaterialStatusCode(String materialStatusCode) {
        this.materialStatusCode = materialStatusCode;
    }

    public void setBillingUnitId(Long billingUnitId) {
        this.billingUnitId = billingUnitId;
    }

    public void setCheckByRevenueManagement(Integer checkByRevenueManagement) {
        this.checkByRevenueManagement = checkByRevenueManagement;
    }

    public void setOverSigning(Integer overSigning) {
        this.overSigning = overSigning;
    }

    public void setAtpInspection(Integer atpInspection) {
        this.atpInspection = atpInspection;
    }

    public void setDoublePick(BigDecimal doublePick) {
        this.doublePick = doublePick;
    }

    public void setMtoStrategy(Integer mtoStrategy) {
        this.mtoStrategy = mtoStrategy;
    }

    public void setStrategyComparisonRule(Integer strategyComparisonRule) {
        this.strategyComparisonRule = strategyComparisonRule;
    }

    public void setManufacturingStrategy(String manufacturingStrategy) {
        this.manufacturingStrategy = manufacturingStrategy;
    }

    public void setReceiptSpecMultilingual(MultilingualVO receiptSpecMultilingual) {
        this.receiptSpecMultilingual = receiptSpecMultilingual;
    }

    public void setReceiptModelMultilingual(MultilingualVO receiptModelMultilingual) {
        this.receiptModelMultilingual = receiptModelMultilingual;
    }

    public void setReturnInspection(Integer returnInspection) {
        this.returnInspection = returnInspection;
    }

    public void setSendInspection(Integer sendInspection) {
        this.sendInspection = sendInspection;
    }

    public void setPlanCheckDays(Integer planCheckDays) {
        this.planCheckDays = planCheckDays;
    }

    public void setProductLoadWays(List<ProductLoadWayVO> productLoadWays) {
        this.productLoadWays = productLoadWays;
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

    public void setInspectionControlPoint(Integer inspectionControlPoint) {
        this.inspectionControlPoint = inspectionControlPoint;
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

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object o) {
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
        void other$productLoadWays;
        void this$productLoadWays;
        void other$receiptModelMultilingual;
        void this$receiptModelMultilingual;
        void other$receiptSpecMultilingual;
        void this$receiptSpecMultilingual;
        void other$manufacturingStrategy;
        void this$manufacturingStrategy;
        void other$doublePick;
        void this$doublePick;
        void other$materialStatusCode;
        void this$materialStatusCode;
        void other$materialStatusId;
        void this$materialStatusId;
        void other$productExtendCharacterDef;
        void this$productExtendCharacterDef;
        void other$costItemsName;
        void this$costItemsName;
        void other$costItemsCode;
        void this$costItemsCode;
        void other$costItems;
        void this$costItems;
        void other$doubleReplenish;
        void this$doubleReplenish;
        void other$purchaseTimes;
        void this$purchaseTimes;
        void other$purchaseOrderQuantity;
        void this$purchaseOrderQuantity;
        void other$businessAttribute;
        void this$businessAttribute;
        void other$remark6;
        void this$remark6;
        void other$remark5;
        void this$remark5;
        void other$remark4;
        void this$remark4;
        void other$remark3;
        void this$remark3;
        void other$remark2;
        void this$remark2;
        void other$remark1;
        void this$remark1;
        void other$remark;
        void this$remark;
        void other$orgId;
        void this$orgId;
        void other$doubleSale;
        void this$doubleSale;
        void other$receiptmodel6;
        void this$receiptmodel6;
        void other$receiptspec6;
        void this$receiptspec6;
        void other$receiptmodel5;
        void this$receiptmodel5;
        void other$receiptspec5;
        void this$receiptspec5;
        void other$receiptmodel4;
        void this$receiptmodel4;
        void other$receiptspec4;
        void this$receiptspec4;
        void other$receiptmodel3;
        void this$receiptmodel3;
        void other$receiptspec3;
        void this$receiptspec3;
        void other$receiptmodel2;
        void this$receiptmodel2;
        void other$receiptspec2;
        void this$receiptspec2;
        void other$receiptModel;
        void this$receiptModel;
        void other$receiptSpec;
        void this$receiptSpec;
        void other$ytenantId;
        void this$ytenantId;
        void other$rejectRate;
        void this$rejectRate;
        void other$wastageRate;
        void this$wastageRate;
        void other$fixedWastage;
        void this$fixedWastage;
        void other$leadTimeQuantity;
        void this$leadTimeQuantity;
        void other$leadTimeCoefficient;
        void this$leadTimeCoefficient;
        void other$batchDouble;
        void this$batchDouble;
        void other$fixedQuantity;
        void this$fixedQuantity;
        void other$economicQuantity;
        void this$economicQuantity;
        void other$receiptWarehouseName;
        void this$receiptWarehouseName;
        void other$receiptWarehouseCode;
        void this$receiptWarehouseCode;
        void other$registrationNumber;
        void this$registrationNumber;
        void other$sunshinePurchase;
        void this$sunshinePurchase;
        void other$titleMemo6;
        void this$titleMemo6;
        void other$titleMemo5;
        void this$titleMemo5;
        void other$titleMemo4;
        void this$titleMemo4;
        void other$titleMemo3;
        void this$titleMemo3;
        void other$titleMemo2;
        void this$titleMemo2;
        void other$titleMemo1;
        void this$titleMemo1;
        void other$displayName6;
        void this$displayName6;
        void other$displayName5;
        void this$displayName5;
        void other$displayName4;
        void this$displayName4;
        void other$displayName3;
        void this$displayName3;
        void other$displayName2;
        void this$displayName2;
        void other$displayName1;
        void this$displayName1;
        void other$metadescription6;
        void this$metadescription6;
        void other$metadescription5;
        void this$metadescription5;
        void other$metadescription4;
        void this$metadescription4;
        void other$metadescription3;
        void this$metadescription3;
        void other$metadescription2;
        void this$metadescription2;
        void other$metadescription1;
        void this$metadescription1;
        void other$receiptName6;
        void this$receiptName6;
        void other$receiptName5;
        void this$receiptName5;
        void other$receiptNam4;
        void this$receiptNam4;
        void other$receiptName3;
        void this$receiptName3;
        void other$receiptName2;
        void this$receiptName2;
        void other$receiptName1;
        void this$receiptName1;
        void other$beUpTime;
        void this$beUpTime;
        void other$titleMemo;
        void this$titleMemo;
        void other$displayName;
        void this$displayName;
        void other$storageLossRate;
        void this$storageLossRate;
        void other$outStoreLessLimit;
        void this$outStoreLessLimit;
        void other$inStoreLessLimit;
        void this$inStoreLessLimit;
        void other$outStoreExcessLimit;
        void this$outStoreExcessLimit;
        void other$inStoreExcessLimit;
        void this$inStoreExcessLimit;
        void other$returnWarehouseName;
        void this$returnWarehouseName;
        void other$returnWarehouseCode;
        void this$returnWarehouseCode;
        void other$deliveryWarehouseName;
        void this$deliveryWarehouseName;
        void other$deliveryWarehouseCode;
        void this$deliveryWarehouseCode;
        void other$warehouseManagerName;
        void this$warehouseManagerName;
        void other$warehouseManagerCode;
        void this$warehouseManagerCode;
        void other$warehouseManager;
        void this$warehouseManager;
        void other$produceRate;
        void this$produceRate;
        void other$demandPlanningUnitName;
        void this$demandPlanningUnitName;
        void other$demandPlanningUnitCode;
        void this$demandPlanningUnitCode;
        void other$produceUnitName;
        void this$produceUnitName;
        void other$produceUnitCode;
        void this$produceUnitCode;
        void other$outTaxRateName;
        void this$outTaxRateName;
        void other$outTaxRateCode;
        void this$outTaxRateCode;
        void other$outputTaxRate;
        void this$outputTaxRate;
        void other$incomeTaxRatesName;
        void this$incomeTaxRatesName;
        void other$incomeTaxRatesCode;
        void this$incomeTaxRatesCode;
        void other$incomeTaxRates;
        void this$incomeTaxRates;
        void other$receiptName;
        void this$receiptName;
        void other$mnemonicCode;
        void this$mnemonicCode;
        void other$shortName;
        void this$shortName;
        void other$saleStyle;
        void this$saleStyle;
        void other$erpOuterCode;
        void this$erpOuterCode;
        void other$planOrderLimit;
        void this$planOrderLimit;
        void other$invoiceAllowErrorLimit;
        void this$invoiceAllowErrorLimit;
        void other$arrivalAllowErrorLimit;
        void this$arrivalAllowErrorLimit;
        void other$requestOrderLimit;
        void this$requestOrderLimit;
        void other$maxPrimeCosts;
        void this$maxPrimeCosts;
        void other$productBuyerName;
        void this$productBuyerName;
        void other$productBuyerCode;
        void this$productBuyerCode;
        void other$productBuyer;
        void this$productBuyer;
        void other$productVendorName;
        void this$productVendorName;
        void other$productVendorCode;
        void this$productVendorCode;
        void other$planProduceLimit;
        void this$planProduceLimit;
        void other$engineeringDrawingNo;
        void this$engineeringDrawingNo;
        void other$manufacturePlannerName;
        void this$manufacturePlannerName;
        void other$manufacturePlannerCode;
        void this$manufacturePlannerCode;
        void other$manufacturePlanner;
        void this$manufacturePlanner;
        void other$produceDepartmentName;
        void this$produceDepartmentName;
        void other$produceDepartmentCode;
        void this$produceDepartmentCode;
        void other$produceDepartment;
        void this$produceDepartment;
        void other$manufactureSpecs;
        void this$manufactureSpecs;
        void other$serviceDuration;
        void this$serviceDuration;
        void other$stopTime;
        void this$stopTime;
        void other$barCode;
        void this$barCode;
        void other$saleChannel;
        void this$saleChannel;
        void other$timestamp;
        void this$timestamp;
        void other$maxBatchPrice;
        void this$maxBatchPrice;
        void other$minBatchPrice;
        void this$minBatchPrice;
        void other$orderDownTime;
        void this$orderDownTime;
        void other$orderUpTime;
        void this$orderUpTime;
        void other$mallDownTime;
        void this$mallDownTime;
        void other$mallUpTime;
        void this$mallUpTime;
        void other$noTaxCostPrice;
        void this$noTaxCostPrice;
        void other$inventoryCount;
        void this$inventoryCount;
        void other$metaDescription;
        void this$metaDescription;
        void other$pageTitle;
        void this$pageTitle;
        void other$minimumDeposits;
        void this$minimumDeposits;
        void other$depositPercentage;
        void this$depositPercentage;
        void other$deposits;
        void this$deposits;
        void other$minOrderQuantity;
        void this$minOrderQuantity;
        void other$omsWarehouseName;
        void this$omsWarehouseName;
        void other$omsWarehouseCode;
        void this$omsWarehouseCode;
        void other$ropStock;
        void this$ropStock;
        void other$lowestStock;
        void this$lowestStock;
        void other$highestStock;
        void this$highestStock;
        void other$safetyStock;
        void this$safetyStock;
        void other$volume;
        void this$volume;
        void other$weight;
        void this$weight;
        void other$priceAreaMessage;
        void this$priceAreaMessage;
        void other$settleAccountsRate;
        void this$settleAccountsRate;
        void other$primeCosts;
        void this$primeCosts;
        void other$marketPrice;
        void this$marketPrice;
        void other$salePrice;
        void this$salePrice;
        void other$lowestMarkPrice;
        void this$lowestMarkPrice;
        void other$markPrice;
        void this$markPrice;
        void other$batchPrice;
        void this$batchPrice;
        void other$batchPriceRate;
        void this$batchPriceRate;
        void other$inspectionUnitName;
        void this$inspectionUnitName;
        void other$inspectionUnitCode;
        void this$inspectionUnitCode;
        void other$batchPriceUnitName;
        void this$batchPriceUnitName;
        void other$batchPriceUnitCode;
        void this$batchPriceUnitCode;
        void other$requireRate;
        void this$requireRate;
        void other$requireUnitName;
        void this$requireUnitName;
        void other$requireUnitCode;
        void this$requireUnitCode;
        void other$offlineRate;
        void this$offlineRate;
        void other$offlineUnitName;
        void this$offlineUnitName;
        void other$offlineUnitCode;
        void this$offlineUnitCode;
        void other$onlineRate;
        void this$onlineRate;
        void other$onlineUnitName;
        void this$onlineUnitName;
        void other$onlineUnitCode;
        void this$onlineUnitCode;
        void other$batchRate;
        void this$batchRate;
        void other$batchUnitName;
        void this$batchUnitName;
        void other$batchUnitCode;
        void this$batchUnitCode;
        void other$stockRate;
        void this$stockRate;
        void other$stockUnitName;
        void this$stockUnitName;
        void other$stockUnitCode;
        void this$stockUnitCode;
        void other$purchaseRate;
        void this$purchaseRate;
        void other$purchasePriceUnitName;
        void this$purchasePriceUnitName;
        void other$purchasePriceUnitCode;
        void this$purchasePriceUnitCode;
        void other$purchaseUnitName;
        void this$purchaseUnitName;
        void other$purchaseUnitCode;
        void this$purchaseUnitCode;
        void other$measurementUnit;
        void this$measurementUnit;
        void other$amortizationMethod;
        void this$amortizationMethod;
        void other$turnoverMaterials;
        void this$turnoverMaterials;
        void other$inspectionControlPoint;
        void this$inspectionControlPoint;
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
        void other$planCheckDays;
        void this$planCheckDays;
        void other$sendInspection;
        void this$sendInspection;
        void other$returnInspection;
        void this$returnInspection;
        void other$strategyComparisonRule;
        void this$strategyComparisonRule;
        void other$mtoStrategy;
        void this$mtoStrategy;
        void other$atpInspection;
        void this$atpInspection;
        void other$overSigning;
        void this$overSigning;
        void other$checkByRevenueManagement;
        void this$checkByRevenueManagement;
        void other$billingUnitId;
        void this$billingUnitId;
        void other$productExtendCharacterDefId;
        void this$productExtendCharacterDefId;
        void other$singleInspection;
        void this$singleInspection;
        void other$projectTrackStrategy;
        void this$projectTrackStrategy;
        void other$directProduction;
        void this$directProduction;
        void other$fullSetInspection;
        void this$fullSetInspection;
        void other$enableSparePartsManagement;
        void this$enableSparePartsManagement;
        void other$checkReminderLeadTime;
        void this$checkReminderLeadTime;
        void other$effectiveLeadTime;
        void this$effectiveLeadTime;
        void other$enableStockExpireCheck;
        void this$enableStockExpireCheck;
        void other$recheckReminderLeadTime;
        void this$recheckReminderLeadTime;
        void other$reviewCycle;
        void this$reviewCycle;
        void other$enableStockPeriodRecheck;
        void this$enableStockPeriodRecheck;
        void other$testRule;
        void this$testRule;
        void other$businessAttributeOutSourcing;
        void this$businessAttributeOutSourcing;
        void other$businessAttributeSelfCreate;
        void this$businessAttributeSelfCreate;
        void other$businessAttributeSale;
        void this$businessAttributeSale;
        void other$businessAttributePurchase;
        void this$businessAttributePurchase;
        void other$expiryDateCalculationMethod;
        void this$expiryDateCalculationMethod;
        void other$creator;
        void this$creator;
        void other$shopId;
        void this$shopId;
        void other$customerId;
        void this$customerId;
        void other$rangeType;
        void this$rangeType;
        void other$inventoryPlanStrategy;
        void this$inventoryPlanStrategy;
        void other$specialCarTransport;
        void this$specialCarTransport;
        void other$reviewGrossWeight;
        void this$reviewGrossWeight;
        void other$fixedReturn;
        void this$fixedReturn;
        void other$weighingMode;
        void this$weighingMode;
        void other$logisticsRelated;
        void this$logisticsRelated;
        void other$inspectionType;
        void this$inspectionType;
        void other$ECNControl;
        void this$ECNControl;
        void other$workingPlan;
        void this$workingPlan;
        void other$lossType;
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductDetailVO)) {
            return false;
        }
        ProductDetailVO other = (ProductDetailVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$productApplyRangeId = this.getProductApplyRangeId();
        Long other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !((Object)this$productApplyRangeId).equals(other$productApplyRangeId)) {
            return false;
        }
        Long this$purchaseUnit = this.getPurchaseUnit();
        Long other$purchaseUnit = other.getPurchaseUnit();
        if (this$purchaseUnit == null ? other$purchaseUnit != null : !((Object)this$purchaseUnit).equals(other$purchaseUnit)) {
            return false;
        }
        Long this$purchasePriceUnit = this.getPurchasePriceUnit();
        Long other$purchasePriceUnit = other.getPurchasePriceUnit();
        if (this$purchasePriceUnit == null ? other$purchasePriceUnit != null : !((Object)this$purchasePriceUnit).equals(other$purchasePriceUnit)) {
            return false;
        }
        Long this$stockUnit = this.getStockUnit();
        Long other$stockUnit = other.getStockUnit();
        if (this$stockUnit == null ? other$stockUnit != null : !((Object)this$stockUnit).equals(other$stockUnit)) {
            return false;
        }
        Long this$batchUnit = this.getBatchUnit();
        Long other$batchUnit = other.getBatchUnit();
        if (this$batchUnit == null ? other$batchUnit != null : !((Object)this$batchUnit).equals(other$batchUnit)) {
            return false;
        }
        Long this$onlineUnit = this.getOnlineUnit();
        Long other$onlineUnit = other.getOnlineUnit();
        if (this$onlineUnit == null ? other$onlineUnit != null : !((Object)this$onlineUnit).equals(other$onlineUnit)) {
            return false;
        }
        Long this$offlineUnit = this.getOfflineUnit();
        Long other$offlineUnit = other.getOfflineUnit();
        if (this$offlineUnit == null ? other$offlineUnit != null : !((Object)this$offlineUnit).equals(other$offlineUnit)) {
            return false;
        }
        Long this$requireUnit = this.getRequireUnit();
        Long other$requireUnit = other.getRequireUnit();
        if (this$requireUnit == null ? other$requireUnit != null : !((Object)this$requireUnit).equals(other$requireUnit)) {
            return false;
        }
        Long this$batchPriceUnit = this.getBatchPriceUnit();
        Long other$batchPriceUnit = other.getBatchPriceUnit();
        if (this$batchPriceUnit == null ? other$batchPriceUnit != null : !((Object)this$batchPriceUnit).equals(other$batchPriceUnit)) {
            return false;
        }
        Long this$inspectionUnit = this.getInspectionUnit();
        Long other$inspectionUnit = other.getInspectionUnit();
        if (this$inspectionUnit == null ? other$inspectionUnit != null : !((Object)this$inspectionUnit).equals(other$inspectionUnit)) {
            return false;
        }
        Boolean this$displayPrice = this.getDisplayPrice();
        Boolean other$displayPrice = other.getDisplayPrice();
        if (this$displayPrice == null ? other$displayPrice != null : !((Object)this$displayPrice).equals(other$displayPrice)) {
            return false;
        }
        Integer this$stockABCClass = this.getStockABCClass();
        Integer other$stockABCClass = other.getStockABCClass();
        if (this$stockABCClass == null ? other$stockABCClass != null : !((Object)this$stockABCClass).equals(other$stockABCClass)) {
            return false;
        }
        Boolean this$batchManage = this.getBatchManage();
        Boolean other$batchManage = other.getBatchManage();
        if (this$batchManage == null ? other$batchManage != null : !((Object)this$batchManage).equals(other$batchManage)) {
            return false;
        }
        Boolean this$expiryDateManage = this.getExpiryDateManage();
        Boolean other$expiryDateManage = other.getExpiryDateManage();
        if (this$expiryDateManage == null ? other$expiryDateManage != null : !((Object)this$expiryDateManage).equals(other$expiryDateManage)) {
            return false;
        }
        Integer this$expireDateNo = this.getExpireDateNo();
        Integer other$expireDateNo = other.getExpireDateNo();
        if (this$expireDateNo == null ? other$expireDateNo != null : !((Object)this$expireDateNo).equals(other$expireDateNo)) {
            return false;
        }
        Integer this$expireDateUnit = this.getExpireDateUnit();
        Integer other$expireDateUnit = other.getExpireDateUnit();
        if (this$expireDateUnit == null ? other$expireDateUnit != null : !((Object)this$expireDateUnit).equals(other$expireDateUnit)) {
            return false;
        }
        Boolean this$serialNoManage = this.getSerialNoManage();
        Boolean other$serialNoManage = other.getSerialNoManage();
        if (this$serialNoManage == null ? other$serialNoManage != null : !((Object)this$serialNoManage).equals(other$serialNoManage)) {
            return false;
        }
        Long this$omsWarehouse = this.getOmsWarehouse();
        Long other$omsWarehouse = other.getOmsWarehouse();
        if (this$omsWarehouse == null ? other$omsWarehouse != null : !((Object)this$omsWarehouse).equals(other$omsWarehouse)) {
            return false;
        }
        Integer this$maximumTurnoverDays = this.getMaximumTurnoverDays();
        Integer other$maximumTurnoverDays = other.getMaximumTurnoverDays();
        if (this$maximumTurnoverDays == null ? other$maximumTurnoverDays != null : !((Object)this$maximumTurnoverDays).equals(other$maximumTurnoverDays)) {
            return false;
        }
        Boolean this$canSale = this.getCanSale();
        Boolean other$canSale = other.getCanSale();
        if (this$canSale == null ? other$canSale != null : !((Object)this$canSale).equals(other$canSale)) {
            return false;
        }
        Integer this$deliveryDays = this.getDeliveryDays();
        Integer other$deliveryDays = other.getDeliveryDays();
        if (this$deliveryDays == null ? other$deliveryDays != null : !((Object)this$deliveryDays).equals(other$deliveryDays)) {
            return false;
        }
        Long this$orderDlyFeeRuleId = this.getOrderDlyFeeRuleId();
        Long other$orderDlyFeeRuleId = other.getOrderDlyFeeRuleId();
        if (this$orderDlyFeeRuleId == null ? other$orderDlyFeeRuleId != null : !((Object)this$orderDlyFeeRuleId).equals(other$orderDlyFeeRuleId)) {
            return false;
        }
        Boolean this$enableCyclePurchase = this.getEnableCyclePurchase();
        Boolean other$enableCyclePurchase = other.getEnableCyclePurchase();
        if (this$enableCyclePurchase == null ? other$enableCyclePurchase != null : !((Object)this$enableCyclePurchase).equals(other$enableCyclePurchase)) {
            return false;
        }
        Boolean this$enableDeposit = this.getEnableDeposit();
        Boolean other$enableDeposit = other.getEnableDeposit();
        if (this$enableDeposit == null ? other$enableDeposit != null : !((Object)this$enableDeposit).equals(other$enableDeposit)) {
            return false;
        }
        Integer this$depositDealPayType = this.getDepositDealPayType();
        Integer other$depositDealPayType = other.getDepositDealPayType();
        if (this$depositDealPayType == null ? other$depositDealPayType != null : !((Object)this$depositDealPayType).equals(other$depositDealPayType)) {
            return false;
        }
        Boolean this$enableModifyDeposit = this.getEnableModifyDeposit();
        Boolean other$enableModifyDeposit = other.getEnableModifyDeposit();
        if (this$enableModifyDeposit == null ? other$enableModifyDeposit != null : !((Object)this$enableModifyDeposit).equals(other$enableModifyDeposit)) {
            return false;
        }
        Integer this$depositPayType = this.getDepositPayType();
        Integer other$depositPayType = other.getDepositPayType();
        if (this$depositPayType == null ? other$depositPayType != null : !((Object)this$depositPayType).equals(other$depositPayType)) {
            return false;
        }
        Integer this$salePoints = this.getSalePoints();
        Integer other$salePoints = other.getSalePoints();
        if (this$salePoints == null ? other$salePoints != null : !((Object)this$salePoints).equals(other$salePoints)) {
            return false;
        }
        Long this$templateOfFreightId = this.getTemplateOfFreightId();
        Long other$templateOfFreightId = other.getTemplateOfFreightId();
        if (this$templateOfFreightId == null ? other$templateOfFreightId != null : !((Object)this$templateOfFreightId).equals(other$templateOfFreightId)) {
            return false;
        }
        Integer this$baseSaleCount = this.getBaseSaleCount();
        Integer other$baseSaleCount = other.getBaseSaleCount();
        if (this$baseSaleCount == null ? other$baseSaleCount != null : !((Object)this$baseSaleCount).equals(other$baseSaleCount)) {
            return false;
        }
        Boolean this$allArea = this.getAllArea();
        Boolean other$allArea = other.getAllArea();
        if (this$allArea == null ? other$allArea != null : !((Object)this$allArea).equals(other$allArea)) {
            return false;
        }
        Boolean this$enableContractManagement = this.getEnableContractManagement();
        Boolean other$enableContractManagement = other.getEnableContractManagement();
        if (this$enableContractManagement == null ? other$enableContractManagement != null : !((Object)this$enableContractManagement).equals(other$enableContractManagement)) {
            return false;
        }
        Boolean this$allowStorePurchase = this.getAllowStorePurchase();
        Boolean other$allowStorePurchase = other.getAllowStorePurchase();
        if (this$allowStorePurchase == null ? other$allowStorePurchase != null : !((Object)this$allowStorePurchase).equals(other$allowStorePurchase)) {
            return false;
        }
        Boolean this$priceChangeAllowed = this.getPriceChangeAllowed();
        Boolean other$priceChangeAllowed = other.getPriceChangeAllowed();
        if (this$priceChangeAllowed == null ? other$priceChangeAllowed != null : !((Object)this$priceChangeAllowed).equals(other$priceChangeAllowed)) {
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
        Boolean this$offlineStoreReturn = this.getOfflineStoreReturn();
        Boolean other$offlineStoreReturn = other.getOfflineStoreReturn();
        if (this$offlineStoreReturn == null ? other$offlineStoreReturn != null : !((Object)this$offlineStoreReturn).equals(other$offlineStoreReturn)) {
            return false;
        }
        Boolean this$weighingOrNot = this.getWeighingOrNot();
        Boolean other$weighingOrNot = other.getWeighingOrNot();
        if (this$weighingOrNot == null ? other$weighingOrNot != null : !((Object)this$weighingOrNot).equals(other$weighingOrNot)) {
            return false;
        }
        Boolean this$process = this.getProcess();
        Boolean other$process = other.getProcess();
        if (this$process == null ? other$process != null : !((Object)this$process).equals(other$process)) {
            return false;
        }
        Integer this$processType = this.getProcessType();
        Integer other$processType = other.getProcessType();
        if (this$processType == null ? other$processType != null : !((Object)this$processType).equals(other$processType)) {
            return false;
        }
        Boolean this$material = this.getMaterial();
        Boolean other$material = other.getMaterial();
        if (this$material == null ? other$material != null : !((Object)this$material).equals(other$material)) {
            return false;
        }
        Integer this$retailPriceDimension = this.getRetailPriceDimension();
        Integer other$retailPriceDimension = other.getRetailPriceDimension();
        if (this$retailPriceDimension == null ? other$retailPriceDimension != null : !((Object)this$retailPriceDimension).equals(other$retailPriceDimension)) {
            return false;
        }
        Integer this$deliverQuantityChange = this.getDeliverQuantityChange();
        Integer other$deliverQuantityChange = other.getDeliverQuantityChange();
        if (this$deliverQuantityChange == null ? other$deliverQuantityChange != null : !((Object)this$deliverQuantityChange).equals(other$deliverQuantityChange)) {
            return false;
        }
        Boolean this$checkByBatch = this.getCheckByBatch();
        Boolean other$checkByBatch = other.getCheckByBatch();
        if (this$checkByBatch == null ? other$checkByBatch != null : !((Object)this$checkByBatch).equals(other$checkByBatch)) {
            return false;
        }
        Integer this$checkByProject = this.getCheckByProject();
        Integer other$checkByProject = other.getCheckByProject();
        if (this$checkByProject == null ? other$checkByProject != null : !((Object)this$checkByProject).equals(other$checkByProject)) {
            return false;
        }
        Integer this$checkBySalesOrders = this.getCheckBySalesOrders();
        Integer other$checkBySalesOrders = other.getCheckBySalesOrders();
        if (this$checkBySalesOrders == null ? other$checkBySalesOrders != null : !((Object)this$checkBySalesOrders).equals(other$checkBySalesOrders)) {
            return false;
        }
        Integer this$checkByClient = this.getCheckByClient();
        Integer other$checkByClient = other.getCheckByClient();
        if (this$checkByClient == null ? other$checkByClient != null : !((Object)this$checkByClient).equals(other$checkByClient)) {
            return false;
        }
        Integer this$checkByOutsourcing = this.getCheckByOutsourcing();
        Integer other$checkByOutsourcing = other.getCheckByOutsourcing();
        if (this$checkByOutsourcing == null ? other$checkByOutsourcing != null : !((Object)this$checkByOutsourcing).equals(other$checkByOutsourcing)) {
            return false;
        }
        Boolean this$accountingByItem = this.getAccountingByItem();
        Boolean other$accountingByItem = other.getAccountingByItem();
        if (this$accountingByItem == null ? other$accountingByItem != null : !((Object)this$accountingByItem).equals(other$accountingByItem)) {
            return false;
        }
        Boolean this$storeOffAndOffState = this.getStoreOffAndOffState();
        Boolean other$storeOffAndOffState = other.getStoreOffAndOffState();
        if (this$storeOffAndOffState == null ? other$storeOffAndOffState != null : !((Object)this$storeOffAndOffState).equals(other$storeOffAndOffState)) {
            return false;
        }
        Boolean this$orderLoadAndUnloadStatus = this.getOrderLoadAndUnloadStatus();
        Boolean other$orderLoadAndUnloadStatus = other.getOrderLoadAndUnloadStatus();
        if (this$orderLoadAndUnloadStatus == null ? other$orderLoadAndUnloadStatus != null : !((Object)this$orderLoadAndUnloadStatus).equals(other$orderLoadAndUnloadStatus)) {
            return false;
        }
        Integer this$mallUpCount = this.getMallUpCount();
        Integer other$mallUpCount = other.getMallUpCount();
        if (this$mallUpCount == null ? other$mallUpCount != null : !((Object)this$mallUpCount).equals(other$mallUpCount)) {
            return false;
        }
        Integer this$mallDownCount = this.getMallDownCount();
        Integer other$mallDownCount = other.getMallDownCount();
        if (this$mallDownCount == null ? other$mallDownCount != null : !((Object)this$mallDownCount).equals(other$mallDownCount)) {
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
        Long this$tenant = this.getTenant();
        Long other$tenant = other.getTenant();
        if (this$tenant == null ? other$tenant != null : !((Object)this$tenant).equals(other$tenant)) {
            return false;
        }
        Boolean this$saleChannelOfOnlineBatch = this.getSaleChannelOfOnlineBatch();
        Boolean other$saleChannelOfOnlineBatch = other.getSaleChannelOfOnlineBatch();
        if (this$saleChannelOfOnlineBatch == null ? other$saleChannelOfOnlineBatch != null : !((Object)this$saleChannelOfOnlineBatch).equals(other$saleChannelOfOnlineBatch)) {
            return false;
        }
        Boolean this$saleChannelOfOnlineRetail = this.getSaleChannelOfOnlineRetail();
        Boolean other$saleChannelOfOnlineRetail = other.getSaleChannelOfOnlineRetail();
        if (this$saleChannelOfOnlineRetail == null ? other$saleChannelOfOnlineRetail != null : !((Object)this$saleChannelOfOnlineRetail).equals(other$saleChannelOfOnlineRetail)) {
            return false;
        }
        Boolean this$saleChannelOfOfflineRetail = this.getSaleChannelOfOfflineRetail();
        Boolean other$saleChannelOfOfflineRetail = other.getSaleChannelOfOfflineRetail();
        if (this$saleChannelOfOfflineRetail == null ? other$saleChannelOfOfflineRetail != null : !((Object)this$saleChannelOfOfflineRetail).equals(other$saleChannelOfOfflineRetail)) {
            return false;
        }
        Boolean this$saleChannelOfDistribution = this.getSaleChannelOfDistribution();
        Boolean other$saleChannelOfDistribution = other.getSaleChannelOfDistribution();
        if (this$saleChannelOfDistribution == null ? other$saleChannelOfDistribution != null : !((Object)this$saleChannelOfDistribution).equals(other$saleChannelOfDistribution)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Integer this$checkFree = this.getCheckFree();
        Integer other$checkFree = other.getCheckFree();
        if (this$checkFree == null ? other$checkFree != null : !((Object)this$checkFree).equals(other$checkFree)) {
            return false;
        }
        Integer this$serviceDurationUnit = this.getServiceDurationUnit();
        Integer other$serviceDurationUnit = other.getServiceDurationUnit();
        if (this$serviceDurationUnit == null ? other$serviceDurationUnit != null : !((Object)this$serviceDurationUnit).equals(other$serviceDurationUnit)) {
            return false;
        }
        Boolean this$canOrder = this.getCanOrder();
        Boolean other$canOrder = other.getCanOrder();
        if (this$canOrder == null ? other$canOrder != null : !((Object)this$canOrder).equals(other$canOrder)) {
            return false;
        }
        Boolean this$onlyOrder = this.getOnlyOrder();
        Boolean other$onlyOrder = other.getOnlyOrder();
        if (this$onlyOrder == null ? other$onlyOrder != null : !((Object)this$onlyOrder).equals(other$onlyOrder)) {
            return false;
        }
        Integer this$orderAdvanceTime = this.getOrderAdvanceTime();
        Integer other$orderAdvanceTime = other.getOrderAdvanceTime();
        if (this$orderAdvanceTime == null ? other$orderAdvanceTime != null : !((Object)this$orderAdvanceTime).equals(other$orderAdvanceTime)) {
            return false;
        }
        Integer this$valueManageType = this.getValueManageType();
        Integer other$valueManageType = other.getValueManageType();
        if (this$valueManageType == null ? other$valueManageType != null : !((Object)this$valueManageType).equals(other$valueManageType)) {
            return false;
        }
        Integer this$costValuation = this.getCostValuation();
        Integer other$costValuation = other.getCostValuation();
        if (this$costValuation == null ? other$costValuation != null : !((Object)this$costValuation).equals(other$costValuation)) {
            return false;
        }
        Boolean this$checkByCost = this.getCheckByCost();
        Boolean other$checkByCost = other.getCheckByCost();
        if (this$checkByCost == null ? other$checkByCost != null : !((Object)this$checkByCost).equals(other$checkByCost)) {
            return false;
        }
        Boolean this$materialCost = this.getMaterialCost();
        Boolean other$materialCost = other.getMaterialCost();
        if (this$materialCost == null ? other$materialCost != null : !((Object)this$materialCost).equals(other$materialCost)) {
            return false;
        }
        Integer this$planDefaultAttribute = this.getPlanDefaultAttribute();
        Integer other$planDefaultAttribute = other.getPlanDefaultAttribute();
        if (this$planDefaultAttribute == null ? other$planDefaultAttribute != null : !((Object)this$planDefaultAttribute).equals(other$planDefaultAttribute)) {
            return false;
        }
        Integer this$planMethod = this.getPlanMethod();
        Integer other$planMethod = other.getPlanMethod();
        if (this$planMethod == null ? other$planMethod != null : !((Object)this$planMethod).equals(other$planMethod)) {
            return false;
        }
        Long this$planStrategy = this.getPlanStrategy();
        Long other$planStrategy = other.getPlanStrategy();
        if (this$planStrategy == null ? other$planStrategy != null : !((Object)this$planStrategy).equals(other$planStrategy)) {
            return false;
        }
        Boolean this$keySubPart = this.getKeySubPart();
        Boolean other$keySubPart = other.getKeySubPart();
        if (this$keySubPart == null ? other$keySubPart != null : !((Object)this$keySubPart).equals(other$keySubPart)) {
            return false;
        }
        Integer this$supplyDemandPolicy = this.getSupplyDemandPolicy();
        Integer other$supplyDemandPolicy = other.getSupplyDemandPolicy();
        if (this$supplyDemandPolicy == null ? other$supplyDemandPolicy != null : !((Object)this$supplyDemandPolicy).equals(other$supplyDemandPolicy)) {
            return false;
        }
        Integer this$fixedLeadTime = this.getFixedLeadTime();
        Integer other$fixedLeadTime = other.getFixedLeadTime();
        if (this$fixedLeadTime == null ? other$fixedLeadTime != null : !((Object)this$fixedLeadTime).equals(other$fixedLeadTime)) {
            return false;
        }
        Integer this$batchPolicy = this.getBatchPolicy();
        Integer other$batchPolicy = other.getBatchPolicy();
        if (this$batchPolicy == null ? other$batchPolicy != null : !((Object)this$batchPolicy).equals(other$batchPolicy)) {
            return false;
        }
        Integer this$supplyType = this.getSupplyType();
        Integer other$supplyType = other.getSupplyType();
        if (this$supplyType == null ? other$supplyType != null : !((Object)this$supplyType).equals(other$supplyType)) {
            return false;
        }
        Integer this$supplyTimes = this.getSupplyTimes();
        Integer other$supplyTimes = other.getSupplyTimes();
        if (this$supplyTimes == null ? other$supplyTimes != null : !((Object)this$supplyTimes).equals(other$supplyTimes)) {
            return false;
        }
        Boolean this$bindCarrier = this.getBindCarrier();
        Boolean other$bindCarrier = other.getBindCarrier();
        if (this$bindCarrier == null ? other$bindCarrier != null : !((Object)this$bindCarrier).equals(other$bindCarrier)) {
            return false;
        }
        Integer this$purpose = this.getPurpose();
        Integer other$purpose = other.getPurpose();
        if (this$purpose == null ? other$purpose != null : !((Object)this$purpose).equals(other$purpose)) {
            return false;
        }
        Boolean this$utility = this.getUtility();
        Boolean other$utility = other.getUtility();
        if (this$utility == null ? other$utility != null : !((Object)this$utility).equals(other$utility)) {
            return false;
        }
        Boolean this$weigh = this.getWeigh();
        Boolean other$weigh = other.getWeigh();
        if (this$weigh == null ? other$weigh != null : !((Object)this$weigh).equals(other$weigh)) {
            return false;
        }
        Long this$productVendor = this.getProductVendor();
        Long other$productVendor = other.getProductVendor();
        if (this$productVendor == null ? other$productVendor != null : !((Object)this$productVendor).equals(other$productVendor)) {
            return false;
        }
        Boolean this$enableSubscribe = this.getEnableSubscribe();
        Boolean other$enableSubscribe = other.getEnableSubscribe();
        if (this$enableSubscribe == null ? other$enableSubscribe != null : !((Object)this$enableSubscribe).equals(other$enableSubscribe)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Boolean this$recommend = this.getRecommend();
        Boolean other$recommend = other.getRecommend();
        if (this$recommend == null ? other$recommend != null : !((Object)this$recommend).equals(other$recommend)) {
            return false;
        }
        Long this$preferentialPolicyType = this.getPreferentialPolicyType();
        Long other$preferentialPolicyType = other.getPreferentialPolicyType();
        if (this$preferentialPolicyType == null ? other$preferentialPolicyType != null : !((Object)this$preferentialPolicyType).equals(other$preferentialPolicyType)) {
            return false;
        }
        Long this$produceUnit = this.getProduceUnit();
        Long other$produceUnit = other.getProduceUnit();
        if (this$produceUnit == null ? other$produceUnit != null : !((Object)this$produceUnit).equals(other$produceUnit)) {
            return false;
        }
        Long this$demandPlanningUnit = this.getDemandPlanningUnit();
        Long other$demandPlanningUnit = other.getDemandPlanningUnit();
        if (this$demandPlanningUnit == null ? other$demandPlanningUnit != null : !((Object)this$demandPlanningUnit).equals(other$demandPlanningUnit)) {
            return false;
        }
        Integer this$daysBeforeValidityReject = this.getDaysBeforeValidityReject();
        Integer other$daysBeforeValidityReject = other.getDaysBeforeValidityReject();
        if (this$daysBeforeValidityReject == null ? other$daysBeforeValidityReject != null : !((Object)this$daysBeforeValidityReject).equals(other$daysBeforeValidityReject)) {
            return false;
        }
        Integer this$validityWarningDays = this.getValidityWarningDays();
        Integer other$validityWarningDays = other.getValidityWarningDays();
        if (this$validityWarningDays == null ? other$validityWarningDays != null : !((Object)this$validityWarningDays).equals(other$validityWarningDays)) {
            return false;
        }
        Long this$deliveryWarehouse = this.getDeliveryWarehouse();
        Long other$deliveryWarehouse = other.getDeliveryWarehouse();
        if (this$deliveryWarehouse == null ? other$deliveryWarehouse != null : !((Object)this$deliveryWarehouse).equals(other$deliveryWarehouse)) {
            return false;
        }
        Long this$returnWarehouse = this.getReturnWarehouse();
        Long other$returnWarehouse = other.getReturnWarehouse();
        if (this$returnWarehouse == null ? other$returnWarehouse != null : !((Object)this$returnWarehouse).equals(other$returnWarehouse)) {
            return false;
        }
        Boolean this$allowNegativeInventory = this.getAllowNegativeInventory();
        Boolean other$allowNegativeInventory = other.getAllowNegativeInventory();
        if (this$allowNegativeInventory == null ? other$allowNegativeInventory != null : !((Object)this$allowNegativeInventory).equals(other$allowNegativeInventory)) {
            return false;
        }
        Integer this$scanCountUnit = this.getScanCountUnit();
        Integer other$scanCountUnit = other.getScanCountUnit();
        if (this$scanCountUnit == null ? other$scanCountUnit != null : !((Object)this$scanCountUnit).equals(other$scanCountUnit)) {
            return false;
        }
        Boolean this$exemption = this.getExemption();
        Boolean other$exemption = other.getExemption();
        if (this$exemption == null ? other$exemption != null : !((Object)this$exemption).equals(other$exemption)) {
            return false;
        }
        Boolean this$warehousingByResult = this.getWarehousingByResult();
        Boolean other$warehousingByResult = other.getWarehousingByResult();
        if (this$warehousingByResult == null ? other$warehousingByResult != null : !((Object)this$warehousingByResult).equals(other$warehousingByResult)) {
            return false;
        }
        Boolean this$salesReturnsExemption = this.getSalesReturnsExemption();
        Boolean other$salesReturnsExemption = other.getSalesReturnsExemption();
        if (this$salesReturnsExemption == null ? other$salesReturnsExemption != null : !((Object)this$salesReturnsExemption).equals(other$salesReturnsExemption)) {
            return false;
        }
        Boolean this$returnsWarehousingByResult = this.getReturnsWarehousingByResult();
        Boolean other$returnsWarehousingByResult = other.getReturnsWarehousingByResult();
        if (this$returnsWarehousingByResult == null ? other$returnsWarehousingByResult != null : !((Object)this$returnsWarehousingByResult).equals(other$returnsWarehousingByResult)) {
            return false;
        }
        Boolean this$periodicalInspection = this.getPeriodicalInspection();
        Boolean other$periodicalInspection = other.getPeriodicalInspection();
        if (this$periodicalInspection == null ? other$periodicalInspection != null : !((Object)this$periodicalInspection).equals(other$periodicalInspection)) {
            return false;
        }
        Integer this$periodicalInspectionCycle = this.getPeriodicalInspectionCycle();
        Integer other$periodicalInspectionCycle = other.getPeriodicalInspectionCycle();
        if (this$periodicalInspectionCycle == null ? other$periodicalInspectionCycle != null : !((Object)this$periodicalInspectionCycle).equals(other$periodicalInspectionCycle)) {
            return false;
        }
        Boolean this$barcodeManage = this.getBarcodeManage();
        Boolean other$barcodeManage = other.getBarcodeManage();
        if (this$barcodeManage == null ? other$barcodeManage != null : !((Object)this$barcodeManage).equals(other$barcodeManage)) {
            return false;
        }
        Integer this$manageByInventory = this.getManageByInventory();
        Integer other$manageByInventory = other.getManageByInventory();
        if (this$manageByInventory == null ? other$manageByInventory != null : !((Object)this$manageByInventory).equals(other$manageByInventory)) {
            return false;
        }
        Integer this$registrationManager = this.getRegistrationManager();
        Integer other$registrationManager = other.getRegistrationManager();
        if (this$registrationManager == null ? other$registrationManager != null : !((Object)this$registrationManager).equals(other$registrationManager)) {
            return false;
        }
        Integer this$authorizationManager = this.getAuthorizationManager();
        Integer other$authorizationManager = other.getAuthorizationManager();
        if (this$authorizationManager == null ? other$authorizationManager != null : !((Object)this$authorizationManager).equals(other$authorizationManager)) {
            return false;
        }
        Long this$receiptWarehouse = this.getReceiptWarehouse();
        Long other$receiptWarehouse = other.getReceiptWarehouse();
        if (this$receiptWarehouse == null ? other$receiptWarehouse != null : !((Object)this$receiptWarehouse).equals(other$receiptWarehouse)) {
            return false;
        }
        Integer this$BOMType = this.getBOMType();
        Integer other$BOMType = other.getBOMType();
        if (this$BOMType == null ? other$BOMType != null : !((Object)this$BOMType).equals(other$BOMType)) {
            return false;
        }
        Long this$BOMSource = this.getBOMSource();
        Long other$BOMSource = other.getBOMSource();
        if (this$BOMSource == null ? other$BOMSource != null : !((Object)this$BOMSource).equals(other$BOMSource)) {
            return false;
        }
        Integer this$batchRule = this.getBatchRule();
        Integer other$batchRule = other.getBatchRule();
        if (this$batchRule == null ? other$batchRule != null : !((Object)this$batchRule).equals(other$batchRule)) {
            return false;
        }
        Integer this$frontLeadTime = this.getFrontLeadTime();
        Integer other$frontLeadTime = other.getFrontLeadTime();
        if (this$frontLeadTime == null ? other$frontLeadTime != null : !((Object)this$frontLeadTime).equals(other$frontLeadTime)) {
            return false;
        }
        Integer this$behindLeadTime = this.getBehindLeadTime();
        Integer other$behindLeadTime = other.getBehindLeadTime();
        if (this$behindLeadTime == null ? other$behindLeadTime != null : !((Object)this$behindLeadTime).equals(other$behindLeadTime)) {
            return false;
        }
        Boolean this$prepareFeed = this.getPrepareFeed();
        Boolean other$prepareFeed = other.getPrepareFeed();
        if (this$prepareFeed == null ? other$prepareFeed != null : !((Object)this$prepareFeed).equals(other$prepareFeed)) {
            return false;
        }
        Boolean this$specialMaterials = this.getSpecialMaterials();
        Boolean other$specialMaterials = other.getSpecialMaterials();
        if (this$specialMaterials == null ? other$specialMaterials != null : !((Object)this$specialMaterials).equals(other$specialMaterials)) {
            return false;
        }
        Boolean this$virtualPart = this.getVirtualPart();
        Boolean other$virtualPart = other.getVirtualPart();
        if (this$virtualPart == null ? other$virtualPart != null : !((Object)this$virtualPart).equals(other$virtualPart)) {
            return false;
        }
        Integer this$demandConsolidation = this.getDemandConsolidation();
        Integer other$demandConsolidation = other.getDemandConsolidation();
        if (this$demandConsolidation == null ? other$demandConsolidation != null : !((Object)this$demandConsolidation).equals(other$demandConsolidation)) {
            return false;
        }
        Integer this$demandConsolidationType = this.getDemandConsolidationType();
        Integer other$demandConsolidationType = other.getDemandConsolidationType();
        if (this$demandConsolidationType == null ? other$demandConsolidationType != null : !((Object)this$demandConsolidationType).equals(other$demandConsolidationType)) {
            return false;
        }
        Integer this$demandConsolidationUnit = this.getDemandConsolidationUnit();
        Integer other$demandConsolidationUnit = other.getDemandConsolidationUnit();
        if (this$demandConsolidationUnit == null ? other$demandConsolidationUnit != null : !((Object)this$demandConsolidationUnit).equals(other$demandConsolidationUnit)) {
            return false;
        }
        Integer this$demandConsolidationNumber = this.getDemandConsolidationNumber();
        Integer other$demandConsolidationNumber = other.getDemandConsolidationNumber();
        if (this$demandConsolidationNumber == null ? other$demandConsolidationNumber != null : !((Object)this$demandConsolidationNumber).equals(other$demandConsolidationNumber)) {
            return false;
        }
        Integer this$demandConsolidationDateType = this.getDemandConsolidationDateType();
        Integer other$demandConsolidationDateType = other.getDemandConsolidationDateType();
        if (this$demandConsolidationDateType == null ? other$demandConsolidationDateType != null : !((Object)this$demandConsolidationDateType).equals(other$demandConsolidationDateType)) {
            return false;
        }
        Integer this$resetForwardDays = this.getResetForwardDays();
        Integer other$resetForwardDays = other.getResetForwardDays();
        if (this$resetForwardDays == null ? other$resetForwardDays != null : !((Object)this$resetForwardDays).equals(other$resetForwardDays)) {
            return false;
        }
        Integer this$resetBackwardDays = this.getResetBackwardDays();
        Integer other$resetBackwardDays = other.getResetBackwardDays();
        if (this$resetBackwardDays == null ? other$resetBackwardDays != null : !((Object)this$resetBackwardDays).equals(other$resetBackwardDays)) {
            return false;
        }
        Integer this$beyondSupplyDays = this.getBeyondSupplyDays();
        Integer other$beyondSupplyDays = other.getBeyondSupplyDays();
        if (this$beyondSupplyDays == null ? other$beyondSupplyDays != null : !((Object)this$beyondSupplyDays).equals(other$beyondSupplyDays)) {
            return false;
        }
        Boolean this$reservation = this.getReservation();
        Boolean other$reservation = other.getReservation();
        if (this$reservation == null ? other$reservation != null : !((Object)this$reservation).equals(other$reservation)) {
            return false;
        }
        Integer this$lossType = this.getLossType();
        Integer n = other.getLossType();
        if (this$lossType == null ? other$lossType != null : !((Object)this$lossType).equals(other$lossType)) {
            return false;
        }
        Boolean bl = this.getWorkingPlan();
        Boolean bl2 = other.getWorkingPlan();
        if (this$workingPlan == null ? other$workingPlan != null : !this$workingPlan.equals(other$workingPlan)) {
            return false;
        }
        Boolean bl3 = this.getECNControl();
        Boolean bl4 = other.getECNControl();
        if (this$ECNControl == null ? other$ECNControl != null : !this$ECNControl.equals(other$ECNControl)) {
            return false;
        }
        Integer n2 = this.getInspectionType();
        Integer n3 = other.getInspectionType();
        if (this$inspectionType == null ? other$inspectionType != null : !this$inspectionType.equals(other$inspectionType)) {
            return false;
        }
        Boolean bl5 = this.getLogisticsRelated();
        Boolean bl6 = other.getLogisticsRelated();
        if (this$logisticsRelated == null ? other$logisticsRelated != null : !this$logisticsRelated.equals(other$logisticsRelated)) {
            return false;
        }
        Integer n4 = this.getWeighingMode();
        Integer n5 = other.getWeighingMode();
        if (this$weighingMode == null ? other$weighingMode != null : !this$weighingMode.equals(other$weighingMode)) {
            return false;
        }
        Boolean bl7 = this.getFixedReturn();
        Boolean bl8 = other.getFixedReturn();
        if (this$fixedReturn == null ? other$fixedReturn != null : !this$fixedReturn.equals(other$fixedReturn)) {
            return false;
        }
        Boolean bl9 = this.getReviewGrossWeight();
        Boolean bl10 = other.getReviewGrossWeight();
        if (this$reviewGrossWeight == null ? other$reviewGrossWeight != null : !this$reviewGrossWeight.equals(other$reviewGrossWeight)) {
            return false;
        }
        Boolean bl11 = this.getSpecialCarTransport();
        Boolean bl12 = other.getSpecialCarTransport();
        if (this$specialCarTransport == null ? other$specialCarTransport != null : !this$specialCarTransport.equals(other$specialCarTransport)) {
            return false;
        }
        Integer n6 = this.getInventoryPlanStrategy();
        Integer n7 = other.getInventoryPlanStrategy();
        if (this$inventoryPlanStrategy == null ? other$inventoryPlanStrategy != null : !this$inventoryPlanStrategy.equals(other$inventoryPlanStrategy)) {
            return false;
        }
        Integer n8 = this.getRangeType();
        Integer n9 = other.getRangeType();
        if (this$rangeType == null ? other$rangeType != null : !this$rangeType.equals(other$rangeType)) {
            return false;
        }
        Long l = this.getCustomerId();
        Long l2 = other.getCustomerId();
        if (this$customerId == null ? other$customerId != null : !this$customerId.equals(other$customerId)) {
            return false;
        }
        Long l3 = this.getShopId();
        Long l4 = other.getShopId();
        if (this$shopId == null ? other$shopId != null : !this$shopId.equals(other$shopId)) {
            return false;
        }
        Boolean bl13 = this.getCreator();
        Boolean bl14 = other.getCreator();
        if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) {
            return false;
        }
        Integer n10 = this.getExpiryDateCalculationMethod();
        Integer n11 = other.getExpiryDateCalculationMethod();
        if (this$expiryDateCalculationMethod == null ? other$expiryDateCalculationMethod != null : !this$expiryDateCalculationMethod.equals(other$expiryDateCalculationMethod)) {
            return false;
        }
        Integer n12 = this.getBusinessAttributePurchase();
        Integer n13 = other.getBusinessAttributePurchase();
        if (this$businessAttributePurchase == null ? other$businessAttributePurchase != null : !this$businessAttributePurchase.equals(other$businessAttributePurchase)) {
            return false;
        }
        Integer n14 = this.getBusinessAttributeSale();
        Integer n15 = other.getBusinessAttributeSale();
        if (this$businessAttributeSale == null ? other$businessAttributeSale != null : !this$businessAttributeSale.equals(other$businessAttributeSale)) {
            return false;
        }
        Integer n16 = this.getBusinessAttributeSelfCreate();
        Integer n17 = other.getBusinessAttributeSelfCreate();
        if (this$businessAttributeSelfCreate == null ? other$businessAttributeSelfCreate != null : !this$businessAttributeSelfCreate.equals(other$businessAttributeSelfCreate)) {
            return false;
        }
        Integer n18 = this.getBusinessAttributeOutSourcing();
        Integer n19 = other.getBusinessAttributeOutSourcing();
        if (this$businessAttributeOutSourcing == null ? other$businessAttributeOutSourcing != null : !this$businessAttributeOutSourcing.equals(other$businessAttributeOutSourcing)) {
            return false;
        }
        Integer n20 = this.getTestRule();
        Integer n21 = other.getTestRule();
        if (this$testRule == null ? other$testRule != null : !this$testRule.equals(other$testRule)) {
            return false;
        }
        Integer n22 = this.getEnableStockPeriodRecheck();
        Integer n23 = other.getEnableStockPeriodRecheck();
        if (this$enableStockPeriodRecheck == null ? other$enableStockPeriodRecheck != null : !this$enableStockPeriodRecheck.equals(other$enableStockPeriodRecheck)) {
            return false;
        }
        Integer n24 = this.getReviewCycle();
        Integer n25 = other.getReviewCycle();
        if (this$reviewCycle == null ? other$reviewCycle != null : !this$reviewCycle.equals(other$reviewCycle)) {
            return false;
        }
        Integer n26 = this.getRecheckReminderLeadTime();
        Integer n27 = other.getRecheckReminderLeadTime();
        if (this$recheckReminderLeadTime == null ? other$recheckReminderLeadTime != null : !this$recheckReminderLeadTime.equals(other$recheckReminderLeadTime)) {
            return false;
        }
        Integer n28 = this.getEnableStockExpireCheck();
        Integer n29 = other.getEnableStockExpireCheck();
        if (this$enableStockExpireCheck == null ? other$enableStockExpireCheck != null : !this$enableStockExpireCheck.equals(other$enableStockExpireCheck)) {
            return false;
        }
        Integer n30 = this.getEffectiveLeadTime();
        Integer n31 = other.getEffectiveLeadTime();
        if (this$effectiveLeadTime == null ? other$effectiveLeadTime != null : !this$effectiveLeadTime.equals(other$effectiveLeadTime)) {
            return false;
        }
        Integer n32 = this.getCheckReminderLeadTime();
        Integer n33 = other.getCheckReminderLeadTime();
        if (this$checkReminderLeadTime == null ? other$checkReminderLeadTime != null : !this$checkReminderLeadTime.equals(other$checkReminderLeadTime)) {
            return false;
        }
        Integer n34 = this.getEnableSparePartsManagement();
        Integer n35 = other.getEnableSparePartsManagement();
        if (this$enableSparePartsManagement == null ? other$enableSparePartsManagement != null : !this$enableSparePartsManagement.equals(other$enableSparePartsManagement)) {
            return false;
        }
        Integer n36 = this.getFullSetInspection();
        Integer n37 = other.getFullSetInspection();
        if (this$fullSetInspection == null ? other$fullSetInspection != null : !this$fullSetInspection.equals(other$fullSetInspection)) {
            return false;
        }
        Integer n38 = this.getDirectProduction();
        Integer n39 = other.getDirectProduction();
        if (this$directProduction == null ? other$directProduction != null : !this$directProduction.equals(other$directProduction)) {
            return false;
        }
        Integer n40 = this.getProjectTrackStrategy();
        Integer n41 = other.getProjectTrackStrategy();
        if (this$projectTrackStrategy == null ? other$projectTrackStrategy != null : !this$projectTrackStrategy.equals(other$projectTrackStrategy)) {
            return false;
        }
        Integer n42 = this.getSingleInspection();
        Integer n43 = other.getSingleInspection();
        if (this$singleInspection == null ? other$singleInspection != null : !this$singleInspection.equals(other$singleInspection)) {
            return false;
        }
        Long l5 = this.getProductExtendCharacterDefId();
        Long l6 = other.getProductExtendCharacterDefId();
        if (this$productExtendCharacterDefId == null ? other$productExtendCharacterDefId != null : !this$productExtendCharacterDefId.equals(other$productExtendCharacterDefId)) {
            return false;
        }
        Long l7 = this.getBillingUnitId();
        Long l8 = other.getBillingUnitId();
        if (this$billingUnitId == null ? other$billingUnitId != null : !this$billingUnitId.equals(other$billingUnitId)) {
            return false;
        }
        Integer n44 = this.getCheckByRevenueManagement();
        Integer n45 = other.getCheckByRevenueManagement();
        if (this$checkByRevenueManagement == null ? other$checkByRevenueManagement != null : !this$checkByRevenueManagement.equals(other$checkByRevenueManagement)) {
            return false;
        }
        Integer n46 = this.getOverSigning();
        Integer n47 = other.getOverSigning();
        if (this$overSigning == null ? other$overSigning != null : !this$overSigning.equals(other$overSigning)) {
            return false;
        }
        Integer n48 = this.getAtpInspection();
        Integer n49 = other.getAtpInspection();
        if (this$atpInspection == null ? other$atpInspection != null : !this$atpInspection.equals(other$atpInspection)) {
            return false;
        }
        Integer n50 = this.getMtoStrategy();
        Integer n51 = other.getMtoStrategy();
        if (this$mtoStrategy == null ? other$mtoStrategy != null : !this$mtoStrategy.equals(other$mtoStrategy)) {
            return false;
        }
        Integer n52 = this.getStrategyComparisonRule();
        Integer n53 = other.getStrategyComparisonRule();
        if (this$strategyComparisonRule == null ? other$strategyComparisonRule != null : !this$strategyComparisonRule.equals(other$strategyComparisonRule)) {
            return false;
        }
        Integer n54 = this.getReturnInspection();
        Integer n55 = other.getReturnInspection();
        if (this$returnInspection == null ? other$returnInspection != null : !this$returnInspection.equals(other$returnInspection)) {
            return false;
        }
        Integer n56 = this.getSendInspection();
        Integer n57 = other.getSendInspection();
        if (this$sendInspection == null ? other$sendInspection != null : !this$sendInspection.equals(other$sendInspection)) {
            return false;
        }
        Integer n58 = this.getPlanCheckDays();
        Integer n59 = other.getPlanCheckDays();
        if (this$planCheckDays == null ? other$planCheckDays != null : !this$planCheckDays.equals(other$planCheckDays)) {
            return false;
        }
        Integer n60 = this.getProductInspection();
        Integer n61 = other.getProductInspection();
        if (this$productInspection == null ? other$productInspection != null : !this$productInspection.equals(other$productInspection)) {
            return false;
        }
        Integer n62 = this.getProductInspectionCtrlPoint();
        Integer n63 = other.getProductInspectionCtrlPoint();
        if (this$productInspectionCtrlPoint == null ? other$productInspectionCtrlPoint != null : !this$productInspectionCtrlPoint.equals(other$productInspectionCtrlPoint)) {
            return false;
        }
        Integer n64 = this.getOutSourceInspection();
        Integer n65 = other.getOutSourceInspection();
        if (this$outSourceInspection == null ? other$outSourceInspection != null : !this$outSourceInspection.equals(other$outSourceInspection)) {
            return false;
        }
        Integer n66 = this.getOutSourceInspectionCtrlPoint();
        Integer n67 = other.getOutSourceInspectionCtrlPoint();
        if (this$outSourceInspectionCtrlPoint == null ? other$outSourceInspectionCtrlPoint != null : !this$outSourceInspectionCtrlPoint.equals(other$outSourceInspectionCtrlPoint)) {
            return false;
        }
        Integer n68 = this.getTransferInspection();
        Integer n69 = other.getTransferInspection();
        if (this$transferInspection == null ? other$transferInspection != null : !this$transferInspection.equals(other$transferInspection)) {
            return false;
        }
        Integer n70 = this.getTransferInspectionCtrlPoint();
        Integer n71 = other.getTransferInspectionCtrlPoint();
        if (this$transferInspectionCtrlPoint == null ? other$transferInspectionCtrlPoint != null : !this$transferInspectionCtrlPoint.equals(other$transferInspectionCtrlPoint)) {
            return false;
        }
        Integer n72 = this.getProductFirstInspection();
        Integer n73 = other.getProductFirstInspection();
        if (this$productFirstInspection == null ? other$productFirstInspection != null : !this$productFirstInspection.equals(other$productFirstInspection)) {
            return false;
        }
        Integer n74 = this.getFirstInspectionCtrlMethod();
        Integer n75 = other.getFirstInspectionCtrlMethod();
        if (this$firstInspectionCtrlMethod == null ? other$firstInspectionCtrlMethod != null : !this$firstInspectionCtrlMethod.equals(other$firstInspectionCtrlMethod)) {
            return false;
        }
        Integer n76 = this.getSendInspectionCtrlPoint();
        Integer n77 = other.getSendInspectionCtrlPoint();
        if (this$sendInspectionCtrlPoint == null ? other$sendInspectionCtrlPoint != null : !this$sendInspectionCtrlPoint.equals(other$sendInspectionCtrlPoint)) {
            return false;
        }
        Integer n78 = this.getReturnInspectionCtrlPoint();
        Integer n79 = other.getReturnInspectionCtrlPoint();
        if (this$returnInspectionCtrlPoint == null ? other$returnInspectionCtrlPoint != null : !this$returnInspectionCtrlPoint.equals(other$returnInspectionCtrlPoint)) {
            return false;
        }
        Integer n80 = this.getInspectionControlPoint();
        Integer n81 = other.getInspectionControlPoint();
        if (this$inspectionControlPoint == null ? other$inspectionControlPoint != null : !this$inspectionControlPoint.equals(other$inspectionControlPoint)) {
            return false;
        }
        Integer n82 = this.getTurnoverMaterials();
        Integer n83 = other.getTurnoverMaterials();
        if (this$turnoverMaterials == null ? other$turnoverMaterials != null : !this$turnoverMaterials.equals(other$turnoverMaterials)) {
            return false;
        }
        Integer n84 = this.getAmortizationMethod();
        Integer n85 = other.getAmortizationMethod();
        if (this$amortizationMethod == null ? other$amortizationMethod != null : !this$amortizationMethod.equals(other$amortizationMethod)) {
            return false;
        }
        Long l9 = this.getMeasurementUnit();
        Long l10 = other.getMeasurementUnit();
        if (this$measurementUnit == null ? other$measurementUnit != null : !this$measurementUnit.equals(other$measurementUnit)) {
            return false;
        }
        String string = this.getPurchaseUnitCode();
        String string2 = other.getPurchaseUnitCode();
        if (this$purchaseUnitCode == null ? other$purchaseUnitCode != null : !this$purchaseUnitCode.equals(other$purchaseUnitCode)) {
            return false;
        }
        String string3 = this.getPurchaseUnitName();
        String string4 = other.getPurchaseUnitName();
        if (this$purchaseUnitName == null ? other$purchaseUnitName != null : !this$purchaseUnitName.equals(other$purchaseUnitName)) {
            return false;
        }
        String string5 = this.getPurchasePriceUnitCode();
        String string6 = other.getPurchasePriceUnitCode();
        if (this$purchasePriceUnitCode == null ? other$purchasePriceUnitCode != null : !this$purchasePriceUnitCode.equals(other$purchasePriceUnitCode)) {
            return false;
        }
        String string7 = this.getPurchasePriceUnitName();
        String string8 = other.getPurchasePriceUnitName();
        if (this$purchasePriceUnitName == null ? other$purchasePriceUnitName != null : !this$purchasePriceUnitName.equals(other$purchasePriceUnitName)) {
            return false;
        }
        BigDecimal bigDecimal = this.getPurchaseRate();
        BigDecimal bigDecimal2 = other.getPurchaseRate();
        if (this$purchaseRate == null ? other$purchaseRate != null : !this$purchaseRate.equals(other$purchaseRate)) {
            return false;
        }
        String string9 = this.getStockUnitCode();
        String string10 = other.getStockUnitCode();
        if (this$stockUnitCode == null ? other$stockUnitCode != null : !this$stockUnitCode.equals(other$stockUnitCode)) {
            return false;
        }
        String string11 = this.getStockUnitName();
        String string12 = other.getStockUnitName();
        if (this$stockUnitName == null ? other$stockUnitName != null : !this$stockUnitName.equals(other$stockUnitName)) {
            return false;
        }
        BigDecimal bigDecimal3 = this.getStockRate();
        BigDecimal bigDecimal4 = other.getStockRate();
        if (this$stockRate == null ? other$stockRate != null : !this$stockRate.equals(other$stockRate)) {
            return false;
        }
        String string13 = this.getBatchUnitCode();
        String string14 = other.getBatchUnitCode();
        if (this$batchUnitCode == null ? other$batchUnitCode != null : !this$batchUnitCode.equals(other$batchUnitCode)) {
            return false;
        }
        String string15 = this.getBatchUnitName();
        String string16 = other.getBatchUnitName();
        if (this$batchUnitName == null ? other$batchUnitName != null : !this$batchUnitName.equals(other$batchUnitName)) {
            return false;
        }
        BigDecimal bigDecimal5 = this.getBatchRate();
        BigDecimal bigDecimal6 = other.getBatchRate();
        if (this$batchRate == null ? other$batchRate != null : !this$batchRate.equals(other$batchRate)) {
            return false;
        }
        String string17 = this.getOnlineUnitCode();
        String string18 = other.getOnlineUnitCode();
        if (this$onlineUnitCode == null ? other$onlineUnitCode != null : !this$onlineUnitCode.equals(other$onlineUnitCode)) {
            return false;
        }
        String string19 = this.getOnlineUnitName();
        String string20 = other.getOnlineUnitName();
        if (this$onlineUnitName == null ? other$onlineUnitName != null : !this$onlineUnitName.equals(other$onlineUnitName)) {
            return false;
        }
        BigDecimal bigDecimal7 = this.getOnlineRate();
        BigDecimal bigDecimal8 = other.getOnlineRate();
        if (this$onlineRate == null ? other$onlineRate != null : !this$onlineRate.equals(other$onlineRate)) {
            return false;
        }
        String string21 = this.getOfflineUnitCode();
        String string22 = other.getOfflineUnitCode();
        if (this$offlineUnitCode == null ? other$offlineUnitCode != null : !this$offlineUnitCode.equals(other$offlineUnitCode)) {
            return false;
        }
        String string23 = this.getOfflineUnitName();
        String string24 = other.getOfflineUnitName();
        if (this$offlineUnitName == null ? other$offlineUnitName != null : !this$offlineUnitName.equals(other$offlineUnitName)) {
            return false;
        }
        BigDecimal bigDecimal9 = this.getOfflineRate();
        BigDecimal bigDecimal10 = other.getOfflineRate();
        if (this$offlineRate == null ? other$offlineRate != null : !this$offlineRate.equals(other$offlineRate)) {
            return false;
        }
        String string25 = this.getRequireUnitCode();
        String string26 = other.getRequireUnitCode();
        if (this$requireUnitCode == null ? other$requireUnitCode != null : !this$requireUnitCode.equals(other$requireUnitCode)) {
            return false;
        }
        String string27 = this.getRequireUnitName();
        String string28 = other.getRequireUnitName();
        if (this$requireUnitName == null ? other$requireUnitName != null : !this$requireUnitName.equals(other$requireUnitName)) {
            return false;
        }
        BigDecimal bigDecimal11 = this.getRequireRate();
        BigDecimal bigDecimal12 = other.getRequireRate();
        if (this$requireRate == null ? other$requireRate != null : !this$requireRate.equals(other$requireRate)) {
            return false;
        }
        String string29 = this.getBatchPriceUnitCode();
        String string30 = other.getBatchPriceUnitCode();
        if (this$batchPriceUnitCode == null ? other$batchPriceUnitCode != null : !this$batchPriceUnitCode.equals(other$batchPriceUnitCode)) {
            return false;
        }
        String string31 = this.getBatchPriceUnitName();
        String string32 = other.getBatchPriceUnitName();
        if (this$batchPriceUnitName == null ? other$batchPriceUnitName != null : !this$batchPriceUnitName.equals(other$batchPriceUnitName)) {
            return false;
        }
        String string33 = this.getInspectionUnitCode();
        String string34 = other.getInspectionUnitCode();
        if (this$inspectionUnitCode == null ? other$inspectionUnitCode != null : !this$inspectionUnitCode.equals(other$inspectionUnitCode)) {
            return false;
        }
        String string35 = this.getInspectionUnitName();
        String string36 = other.getInspectionUnitName();
        if (this$inspectionUnitName == null ? other$inspectionUnitName != null : !this$inspectionUnitName.equals(other$inspectionUnitName)) {
            return false;
        }
        BigDecimal bigDecimal13 = this.getBatchPriceRate();
        BigDecimal bigDecimal14 = other.getBatchPriceRate();
        if (this$batchPriceRate == null ? other$batchPriceRate != null : !this$batchPriceRate.equals(other$batchPriceRate)) {
            return false;
        }
        BigDecimal bigDecimal15 = this.getBatchPrice();
        BigDecimal bigDecimal16 = other.getBatchPrice();
        if (this$batchPrice == null ? other$batchPrice != null : !this$batchPrice.equals(other$batchPrice)) {
            return false;
        }
        BigDecimal bigDecimal17 = this.getMarkPrice();
        BigDecimal bigDecimal18 = other.getMarkPrice();
        if (this$markPrice == null ? other$markPrice != null : !this$markPrice.equals(other$markPrice)) {
            return false;
        }
        BigDecimal bigDecimal19 = this.getLowestMarkPrice();
        BigDecimal bigDecimal20 = other.getLowestMarkPrice();
        if (this$lowestMarkPrice == null ? other$lowestMarkPrice != null : !this$lowestMarkPrice.equals(other$lowestMarkPrice)) {
            return false;
        }
        BigDecimal bigDecimal21 = this.getSalePrice();
        BigDecimal bigDecimal22 = other.getSalePrice();
        if (this$salePrice == null ? other$salePrice != null : !this$salePrice.equals(other$salePrice)) {
            return false;
        }
        BigDecimal bigDecimal23 = this.getMarketPrice();
        BigDecimal bigDecimal24 = other.getMarketPrice();
        if (this$marketPrice == null ? other$marketPrice != null : !this$marketPrice.equals(other$marketPrice)) {
            return false;
        }
        BigDecimal bigDecimal25 = this.getPrimeCosts();
        BigDecimal bigDecimal26 = other.getPrimeCosts();
        if (this$primeCosts == null ? other$primeCosts != null : !this$primeCosts.equals(other$primeCosts)) {
            return false;
        }
        BigDecimal bigDecimal27 = this.getSettleAccountsRate();
        BigDecimal bigDecimal28 = other.getSettleAccountsRate();
        if (this$settleAccountsRate == null ? other$settleAccountsRate != null : !this$settleAccountsRate.equals(other$settleAccountsRate)) {
            return false;
        }
        String string37 = this.getPriceAreaMessage();
        String string38 = other.getPriceAreaMessage();
        if (this$priceAreaMessage == null ? other$priceAreaMessage != null : !this$priceAreaMessage.equals(other$priceAreaMessage)) {
            return false;
        }
        BigDecimal bigDecimal29 = this.getWeight();
        BigDecimal bigDecimal30 = other.getWeight();
        if (this$weight == null ? other$weight != null : !this$weight.equals(other$weight)) {
            return false;
        }
        BigDecimal bigDecimal31 = this.getVolume();
        BigDecimal bigDecimal32 = other.getVolume();
        if (this$volume == null ? other$volume != null : !this$volume.equals(other$volume)) {
            return false;
        }
        BigDecimal bigDecimal33 = this.getSafetyStock();
        BigDecimal bigDecimal34 = other.getSafetyStock();
        if (this$safetyStock == null ? other$safetyStock != null : !this$safetyStock.equals(other$safetyStock)) {
            return false;
        }
        BigDecimal bigDecimal35 = this.getHighestStock();
        BigDecimal bigDecimal36 = other.getHighestStock();
        if (this$highestStock == null ? other$highestStock != null : !this$highestStock.equals(other$highestStock)) {
            return false;
        }
        BigDecimal bigDecimal37 = this.getLowestStock();
        BigDecimal bigDecimal38 = other.getLowestStock();
        if (this$lowestStock == null ? other$lowestStock != null : !this$lowestStock.equals(other$lowestStock)) {
            return false;
        }
        BigDecimal bigDecimal39 = this.getRopStock();
        BigDecimal bigDecimal40 = other.getRopStock();
        if (this$ropStock == null ? other$ropStock != null : !this$ropStock.equals(other$ropStock)) {
            return false;
        }
        String string39 = this.getOmsWarehouseCode();
        String string40 = other.getOmsWarehouseCode();
        if (this$omsWarehouseCode == null ? other$omsWarehouseCode != null : !this$omsWarehouseCode.equals(other$omsWarehouseCode)) {
            return false;
        }
        String string41 = this.getOmsWarehouseName();
        String string42 = other.getOmsWarehouseName();
        if (this$omsWarehouseName == null ? other$omsWarehouseName != null : !this$omsWarehouseName.equals(other$omsWarehouseName)) {
            return false;
        }
        BigDecimal bigDecimal41 = this.getMinOrderQuantity();
        BigDecimal bigDecimal42 = other.getMinOrderQuantity();
        if (this$minOrderQuantity == null ? other$minOrderQuantity != null : !this$minOrderQuantity.equals(other$minOrderQuantity)) {
            return false;
        }
        BigDecimal bigDecimal43 = this.getDeposits();
        BigDecimal bigDecimal44 = other.getDeposits();
        if (this$deposits == null ? other$deposits != null : !this$deposits.equals(other$deposits)) {
            return false;
        }
        BigDecimal bigDecimal45 = this.getDepositPercentage();
        BigDecimal bigDecimal46 = other.getDepositPercentage();
        if (this$depositPercentage == null ? other$depositPercentage != null : !this$depositPercentage.equals(other$depositPercentage)) {
            return false;
        }
        BigDecimal bigDecimal47 = this.getMinimumDeposits();
        BigDecimal bigDecimal48 = other.getMinimumDeposits();
        if (this$minimumDeposits == null ? other$minimumDeposits != null : !this$minimumDeposits.equals(other$minimumDeposits)) {
            return false;
        }
        String string43 = this.getPageTitle();
        String string44 = other.getPageTitle();
        if (this$pageTitle == null ? other$pageTitle != null : !this$pageTitle.equals(other$pageTitle)) {
            return false;
        }
        MultilingualVO multilingualVO = this.getMetaDescription();
        MultilingualVO multilingualVO2 = other.getMetaDescription();
        if (this$metaDescription == null ? other$metaDescription != null : !this$metaDescription.equals(other$metaDescription)) {
            return false;
        }
        BigDecimal bigDecimal49 = this.getInventoryCount();
        BigDecimal bigDecimal50 = other.getInventoryCount();
        if (this$inventoryCount == null ? other$inventoryCount != null : !this$inventoryCount.equals(other$inventoryCount)) {
            return false;
        }
        BigDecimal bigDecimal51 = this.getNoTaxCostPrice();
        BigDecimal bigDecimal52 = other.getNoTaxCostPrice();
        if (this$noTaxCostPrice == null ? other$noTaxCostPrice != null : !this$noTaxCostPrice.equals(other$noTaxCostPrice)) {
            return false;
        }
        Date date = this.getMallUpTime();
        Date date2 = other.getMallUpTime();
        if (this$mallUpTime == null ? other$mallUpTime != null : !this$mallUpTime.equals(other$mallUpTime)) {
            return false;
        }
        Date date3 = this.getMallDownTime();
        Date date4 = other.getMallDownTime();
        if (this$mallDownTime == null ? other$mallDownTime != null : !this$mallDownTime.equals(other$mallDownTime)) {
            return false;
        }
        Date date5 = this.getOrderUpTime();
        Date date6 = other.getOrderUpTime();
        if (this$orderUpTime == null ? other$orderUpTime != null : !this$orderUpTime.equals(other$orderUpTime)) {
            return false;
        }
        Date date7 = this.getOrderDownTime();
        Date date8 = other.getOrderDownTime();
        if (this$orderDownTime == null ? other$orderDownTime != null : !this$orderDownTime.equals(other$orderDownTime)) {
            return false;
        }
        BigDecimal bigDecimal53 = this.getMinBatchPrice();
        BigDecimal bigDecimal54 = other.getMinBatchPrice();
        if (this$minBatchPrice == null ? other$minBatchPrice != null : !this$minBatchPrice.equals(other$minBatchPrice)) {
            return false;
        }
        BigDecimal bigDecimal55 = this.getMaxBatchPrice();
        BigDecimal bigDecimal56 = other.getMaxBatchPrice();
        if (this$maxBatchPrice == null ? other$maxBatchPrice != null : !this$maxBatchPrice.equals(other$maxBatchPrice)) {
            return false;
        }
        Date date9 = this.getTimestamp();
        Date date10 = other.getTimestamp();
        if (this$timestamp == null ? other$timestamp != null : !this$timestamp.equals(other$timestamp)) {
            return false;
        }
        String string45 = this.getSaleChannel();
        String string46 = other.getSaleChannel();
        if (this$saleChannel == null ? other$saleChannel != null : !this$saleChannel.equals(other$saleChannel)) {
            return false;
        }
        String string47 = this.getBarCode();
        String string48 = other.getBarCode();
        if (this$barCode == null ? other$barCode != null : !this$barCode.equals(other$barCode)) {
            return false;
        }
        Date date11 = this.getStopTime();
        Date date12 = other.getStopTime();
        if (this$stopTime == null ? other$stopTime != null : !this$stopTime.equals(other$stopTime)) {
            return false;
        }
        BigDecimal bigDecimal57 = this.getServiceDuration();
        BigDecimal bigDecimal58 = other.getServiceDuration();
        if (this$serviceDuration == null ? other$serviceDuration != null : !this$serviceDuration.equals(other$serviceDuration)) {
            return false;
        }
        String string49 = this.getManufactureSpecs();
        String string50 = other.getManufactureSpecs();
        if (this$manufactureSpecs == null ? other$manufactureSpecs != null : !this$manufactureSpecs.equals(other$manufactureSpecs)) {
            return false;
        }
        String string51 = this.getProduceDepartment();
        String string52 = other.getProduceDepartment();
        if (this$produceDepartment == null ? other$produceDepartment != null : !this$produceDepartment.equals(other$produceDepartment)) {
            return false;
        }
        String string53 = this.getProduceDepartmentCode();
        String string54 = other.getProduceDepartmentCode();
        if (this$produceDepartmentCode == null ? other$produceDepartmentCode != null : !this$produceDepartmentCode.equals(other$produceDepartmentCode)) {
            return false;
        }
        String string55 = this.getProduceDepartmentName();
        String string56 = other.getProduceDepartmentName();
        if (this$produceDepartmentName == null ? other$produceDepartmentName != null : !this$produceDepartmentName.equals(other$produceDepartmentName)) {
            return false;
        }
        String string57 = this.getManufacturePlanner();
        String string58 = other.getManufacturePlanner();
        if (this$manufacturePlanner == null ? other$manufacturePlanner != null : !this$manufacturePlanner.equals(other$manufacturePlanner)) {
            return false;
        }
        String string59 = this.getManufacturePlannerCode();
        String string60 = other.getManufacturePlannerCode();
        if (this$manufacturePlannerCode == null ? other$manufacturePlannerCode != null : !this$manufacturePlannerCode.equals(other$manufacturePlannerCode)) {
            return false;
        }
        String string61 = this.getManufacturePlannerName();
        String string62 = other.getManufacturePlannerName();
        if (this$manufacturePlannerName == null ? other$manufacturePlannerName != null : !this$manufacturePlannerName.equals(other$manufacturePlannerName)) {
            return false;
        }
        String string63 = this.getEngineeringDrawingNo();
        String string64 = other.getEngineeringDrawingNo();
        if (this$engineeringDrawingNo == null ? other$engineeringDrawingNo != null : !this$engineeringDrawingNo.equals(other$engineeringDrawingNo)) {
            return false;
        }
        BigDecimal bigDecimal59 = this.getPlanProduceLimit();
        BigDecimal bigDecimal60 = other.getPlanProduceLimit();
        if (this$planProduceLimit == null ? other$planProduceLimit != null : !this$planProduceLimit.equals(other$planProduceLimit)) {
            return false;
        }
        String string65 = this.getProductVendorCode();
        String string66 = other.getProductVendorCode();
        if (this$productVendorCode == null ? other$productVendorCode != null : !this$productVendorCode.equals(other$productVendorCode)) {
            return false;
        }
        String string67 = this.getProductVendorName();
        String string68 = other.getProductVendorName();
        if (this$productVendorName == null ? other$productVendorName != null : !this$productVendorName.equals(other$productVendorName)) {
            return false;
        }
        String string69 = this.getProductBuyer();
        String string70 = other.getProductBuyer();
        if (this$productBuyer == null ? other$productBuyer != null : !this$productBuyer.equals(other$productBuyer)) {
            return false;
        }
        String string71 = this.getProductBuyerCode();
        String string72 = other.getProductBuyerCode();
        if (this$productBuyerCode == null ? other$productBuyerCode != null : !this$productBuyerCode.equals(other$productBuyerCode)) {
            return false;
        }
        String string73 = this.getProductBuyerName();
        String string74 = other.getProductBuyerName();
        if (this$productBuyerName == null ? other$productBuyerName != null : !this$productBuyerName.equals(other$productBuyerName)) {
            return false;
        }
        BigDecimal bigDecimal61 = this.getMaxPrimeCosts();
        BigDecimal bigDecimal62 = other.getMaxPrimeCosts();
        if (this$maxPrimeCosts == null ? other$maxPrimeCosts != null : !this$maxPrimeCosts.equals(other$maxPrimeCosts)) {
            return false;
        }
        BigDecimal bigDecimal63 = this.getRequestOrderLimit();
        BigDecimal bigDecimal64 = other.getRequestOrderLimit();
        if (this$requestOrderLimit == null ? other$requestOrderLimit != null : !this$requestOrderLimit.equals(other$requestOrderLimit)) {
            return false;
        }
        BigDecimal bigDecimal65 = this.getArrivalAllowErrorLimit();
        BigDecimal bigDecimal66 = other.getArrivalAllowErrorLimit();
        if (this$arrivalAllowErrorLimit == null ? other$arrivalAllowErrorLimit != null : !this$arrivalAllowErrorLimit.equals(other$arrivalAllowErrorLimit)) {
            return false;
        }
        BigDecimal bigDecimal67 = this.getInvoiceAllowErrorLimit();
        BigDecimal bigDecimal68 = other.getInvoiceAllowErrorLimit();
        if (this$invoiceAllowErrorLimit == null ? other$invoiceAllowErrorLimit != null : !this$invoiceAllowErrorLimit.equals(other$invoiceAllowErrorLimit)) {
            return false;
        }
        BigDecimal bigDecimal69 = this.getPlanOrderLimit();
        BigDecimal bigDecimal70 = other.getPlanOrderLimit();
        if (this$planOrderLimit == null ? other$planOrderLimit != null : !this$planOrderLimit.equals(other$planOrderLimit)) {
            return false;
        }
        String string75 = this.getErpOuterCode();
        String string76 = other.getErpOuterCode();
        if (this$erpOuterCode == null ? other$erpOuterCode != null : !this$erpOuterCode.equals(other$erpOuterCode)) {
            return false;
        }
        String string77 = this.getSaleStyle();
        String string78 = other.getSaleStyle();
        if (this$saleStyle == null ? other$saleStyle != null : !this$saleStyle.equals(other$saleStyle)) {
            return false;
        }
        String string79 = this.getShortName();
        String string80 = other.getShortName();
        if (this$shortName == null ? other$shortName != null : !this$shortName.equals(other$shortName)) {
            return false;
        }
        String string81 = this.getMnemonicCode();
        String string82 = other.getMnemonicCode();
        if (this$mnemonicCode == null ? other$mnemonicCode != null : !this$mnemonicCode.equals(other$mnemonicCode)) {
            return false;
        }
        MultilingualVO multilingualVO3 = this.getReceiptName();
        MultilingualVO multilingualVO4 = other.getReceiptName();
        if (this$receiptName == null ? other$receiptName != null : !this$receiptName.equals(other$receiptName)) {
            return false;
        }
        String string83 = this.getIncomeTaxRates();
        String string84 = other.getIncomeTaxRates();
        if (this$incomeTaxRates == null ? other$incomeTaxRates != null : !this$incomeTaxRates.equals(other$incomeTaxRates)) {
            return false;
        }
        String string85 = this.getIncomeTaxRatesCode();
        String string86 = other.getIncomeTaxRatesCode();
        if (this$incomeTaxRatesCode == null ? other$incomeTaxRatesCode != null : !this$incomeTaxRatesCode.equals(other$incomeTaxRatesCode)) {
            return false;
        }
        String string87 = this.getIncomeTaxRatesName();
        String string88 = other.getIncomeTaxRatesName();
        if (this$incomeTaxRatesName == null ? other$incomeTaxRatesName != null : !this$incomeTaxRatesName.equals(other$incomeTaxRatesName)) {
            return false;
        }
        String string89 = this.getOutputTaxRate();
        String string90 = other.getOutputTaxRate();
        if (this$outputTaxRate == null ? other$outputTaxRate != null : !this$outputTaxRate.equals(other$outputTaxRate)) {
            return false;
        }
        String string91 = this.getOutTaxRateCode();
        String string92 = other.getOutTaxRateCode();
        if (this$outTaxRateCode == null ? other$outTaxRateCode != null : !this$outTaxRateCode.equals(other$outTaxRateCode)) {
            return false;
        }
        String string93 = this.getOutTaxRateName();
        String string94 = other.getOutTaxRateName();
        if (this$outTaxRateName == null ? other$outTaxRateName != null : !this$outTaxRateName.equals(other$outTaxRateName)) {
            return false;
        }
        String string95 = this.getProduceUnitCode();
        String string96 = other.getProduceUnitCode();
        if (this$produceUnitCode == null ? other$produceUnitCode != null : !this$produceUnitCode.equals(other$produceUnitCode)) {
            return false;
        }
        String string97 = this.getProduceUnitName();
        String string98 = other.getProduceUnitName();
        if (this$produceUnitName == null ? other$produceUnitName != null : !this$produceUnitName.equals(other$produceUnitName)) {
            return false;
        }
        String string99 = this.getDemandPlanningUnitCode();
        String string100 = other.getDemandPlanningUnitCode();
        if (this$demandPlanningUnitCode == null ? other$demandPlanningUnitCode != null : !this$demandPlanningUnitCode.equals(other$demandPlanningUnitCode)) {
            return false;
        }
        String string101 = this.getDemandPlanningUnitName();
        String string102 = other.getDemandPlanningUnitName();
        if (this$demandPlanningUnitName == null ? other$demandPlanningUnitName != null : !this$demandPlanningUnitName.equals(other$demandPlanningUnitName)) {
            return false;
        }
        BigDecimal bigDecimal71 = this.getProduceRate();
        BigDecimal bigDecimal72 = other.getProduceRate();
        if (this$produceRate == null ? other$produceRate != null : !this$produceRate.equals(other$produceRate)) {
            return false;
        }
        String string103 = this.getWarehouseManager();
        String string104 = other.getWarehouseManager();
        if (this$warehouseManager == null ? other$warehouseManager != null : !this$warehouseManager.equals(other$warehouseManager)) {
            return false;
        }
        String string105 = this.getWarehouseManagerCode();
        String string106 = other.getWarehouseManagerCode();
        if (this$warehouseManagerCode == null ? other$warehouseManagerCode != null : !this$warehouseManagerCode.equals(other$warehouseManagerCode)) {
            return false;
        }
        String string107 = this.getWarehouseManagerName();
        String string108 = other.getWarehouseManagerName();
        if (this$warehouseManagerName == null ? other$warehouseManagerName != null : !this$warehouseManagerName.equals(other$warehouseManagerName)) {
            return false;
        }
        String string109 = this.getDeliveryWarehouseCode();
        String string110 = other.getDeliveryWarehouseCode();
        if (this$deliveryWarehouseCode == null ? other$deliveryWarehouseCode != null : !this$deliveryWarehouseCode.equals(other$deliveryWarehouseCode)) {
            return false;
        }
        String string111 = this.getDeliveryWarehouseName();
        String string112 = other.getDeliveryWarehouseName();
        if (this$deliveryWarehouseName == null ? other$deliveryWarehouseName != null : !this$deliveryWarehouseName.equals(other$deliveryWarehouseName)) {
            return false;
        }
        String string113 = this.getReturnWarehouseCode();
        String string114 = other.getReturnWarehouseCode();
        if (this$returnWarehouseCode == null ? other$returnWarehouseCode != null : !this$returnWarehouseCode.equals(other$returnWarehouseCode)) {
            return false;
        }
        String string115 = this.getReturnWarehouseName();
        String string116 = other.getReturnWarehouseName();
        if (this$returnWarehouseName == null ? other$returnWarehouseName != null : !this$returnWarehouseName.equals(other$returnWarehouseName)) {
            return false;
        }
        BigDecimal bigDecimal73 = this.getInStoreExcessLimit();
        BigDecimal bigDecimal74 = other.getInStoreExcessLimit();
        if (this$inStoreExcessLimit == null ? other$inStoreExcessLimit != null : !this$inStoreExcessLimit.equals(other$inStoreExcessLimit)) {
            return false;
        }
        BigDecimal bigDecimal75 = this.getOutStoreExcessLimit();
        BigDecimal bigDecimal76 = other.getOutStoreExcessLimit();
        if (this$outStoreExcessLimit == null ? other$outStoreExcessLimit != null : !this$outStoreExcessLimit.equals(other$outStoreExcessLimit)) {
            return false;
        }
        BigDecimal bigDecimal77 = this.getInStoreLessLimit();
        BigDecimal bigDecimal78 = other.getInStoreLessLimit();
        if (this$inStoreLessLimit == null ? other$inStoreLessLimit != null : !this$inStoreLessLimit.equals(other$inStoreLessLimit)) {
            return false;
        }
        BigDecimal bigDecimal79 = this.getOutStoreLessLimit();
        BigDecimal bigDecimal80 = other.getOutStoreLessLimit();
        if (this$outStoreLessLimit == null ? other$outStoreLessLimit != null : !this$outStoreLessLimit.equals(other$outStoreLessLimit)) {
            return false;
        }
        BigDecimal bigDecimal81 = this.getStorageLossRate();
        BigDecimal bigDecimal82 = other.getStorageLossRate();
        if (this$storageLossRate == null ? other$storageLossRate != null : !this$storageLossRate.equals(other$storageLossRate)) {
            return false;
        }
        MultilingualVO multilingualVO5 = this.getDisplayName();
        MultilingualVO multilingualVO6 = other.getDisplayName();
        if (this$displayName == null ? other$displayName != null : !this$displayName.equals(other$displayName)) {
            return false;
        }
        MultilingualVO multilingualVO7 = this.getTitleMemo();
        MultilingualVO multilingualVO8 = other.getTitleMemo();
        if (this$titleMemo == null ? other$titleMemo != null : !this$titleMemo.equals(other$titleMemo)) {
            return false;
        }
        Date date13 = this.getBeUpTime();
        Date date14 = other.getBeUpTime();
        if (this$beUpTime == null ? other$beUpTime != null : !this$beUpTime.equals(other$beUpTime)) {
            return false;
        }
        String string117 = this.getReceiptName1();
        String string118 = other.getReceiptName1();
        if (this$receiptName1 == null ? other$receiptName1 != null : !this$receiptName1.equals(other$receiptName1)) {
            return false;
        }
        String string119 = this.getReceiptName2();
        String string120 = other.getReceiptName2();
        if (this$receiptName2 == null ? other$receiptName2 != null : !this$receiptName2.equals(other$receiptName2)) {
            return false;
        }
        String string121 = this.getReceiptName3();
        String string122 = other.getReceiptName3();
        if (this$receiptName3 == null ? other$receiptName3 != null : !this$receiptName3.equals(other$receiptName3)) {
            return false;
        }
        String string123 = this.getReceiptNam4();
        String string124 = other.getReceiptNam4();
        if (this$receiptNam4 == null ? other$receiptNam4 != null : !this$receiptNam4.equals(other$receiptNam4)) {
            return false;
        }
        String string125 = this.getReceiptName5();
        String string126 = other.getReceiptName5();
        if (this$receiptName5 == null ? other$receiptName5 != null : !this$receiptName5.equals(other$receiptName5)) {
            return false;
        }
        String string127 = this.getReceiptName6();
        String string128 = other.getReceiptName6();
        if (this$receiptName6 == null ? other$receiptName6 != null : !this$receiptName6.equals(other$receiptName6)) {
            return false;
        }
        String string129 = this.getMetadescription1();
        String string130 = other.getMetadescription1();
        if (this$metadescription1 == null ? other$metadescription1 != null : !this$metadescription1.equals(other$metadescription1)) {
            return false;
        }
        String string131 = this.getMetadescription2();
        String string132 = other.getMetadescription2();
        if (this$metadescription2 == null ? other$metadescription2 != null : !this$metadescription2.equals(other$metadescription2)) {
            return false;
        }
        String string133 = this.getMetadescription3();
        String string134 = other.getMetadescription3();
        if (this$metadescription3 == null ? other$metadescription3 != null : !this$metadescription3.equals(other$metadescription3)) {
            return false;
        }
        String string135 = this.getMetadescription4();
        String string136 = other.getMetadescription4();
        if (this$metadescription4 == null ? other$metadescription4 != null : !this$metadescription4.equals(other$metadescription4)) {
            return false;
        }
        String string137 = this.getMetadescription5();
        String string138 = other.getMetadescription5();
        if (this$metadescription5 == null ? other$metadescription5 != null : !this$metadescription5.equals(other$metadescription5)) {
            return false;
        }
        String string139 = this.getMetadescription6();
        String string140 = other.getMetadescription6();
        if (this$metadescription6 == null ? other$metadescription6 != null : !this$metadescription6.equals(other$metadescription6)) {
            return false;
        }
        String string141 = this.getDisplayName1();
        String string142 = other.getDisplayName1();
        if (this$displayName1 == null ? other$displayName1 != null : !this$displayName1.equals(other$displayName1)) {
            return false;
        }
        String string143 = this.getDisplayName2();
        String string144 = other.getDisplayName2();
        if (this$displayName2 == null ? other$displayName2 != null : !this$displayName2.equals(other$displayName2)) {
            return false;
        }
        String string145 = this.getDisplayName3();
        String string146 = other.getDisplayName3();
        if (this$displayName3 == null ? other$displayName3 != null : !this$displayName3.equals(other$displayName3)) {
            return false;
        }
        String string147 = this.getDisplayName4();
        String string148 = other.getDisplayName4();
        if (this$displayName4 == null ? other$displayName4 != null : !this$displayName4.equals(other$displayName4)) {
            return false;
        }
        String string149 = this.getDisplayName5();
        String string150 = other.getDisplayName5();
        if (this$displayName5 == null ? other$displayName5 != null : !this$displayName5.equals(other$displayName5)) {
            return false;
        }
        String string151 = this.getDisplayName6();
        String string152 = other.getDisplayName6();
        if (this$displayName6 == null ? other$displayName6 != null : !this$displayName6.equals(other$displayName6)) {
            return false;
        }
        String string153 = this.getTitleMemo1();
        String string154 = other.getTitleMemo1();
        if (this$titleMemo1 == null ? other$titleMemo1 != null : !this$titleMemo1.equals(other$titleMemo1)) {
            return false;
        }
        String string155 = this.getTitleMemo2();
        String string156 = other.getTitleMemo2();
        if (this$titleMemo2 == null ? other$titleMemo2 != null : !this$titleMemo2.equals(other$titleMemo2)) {
            return false;
        }
        String string157 = this.getTitleMemo3();
        String string158 = other.getTitleMemo3();
        if (this$titleMemo3 == null ? other$titleMemo3 != null : !this$titleMemo3.equals(other$titleMemo3)) {
            return false;
        }
        String string159 = this.getTitleMemo4();
        String string160 = other.getTitleMemo4();
        if (this$titleMemo4 == null ? other$titleMemo4 != null : !this$titleMemo4.equals(other$titleMemo4)) {
            return false;
        }
        String string161 = this.getTitleMemo5();
        String string162 = other.getTitleMemo5();
        if (this$titleMemo5 == null ? other$titleMemo5 != null : !this$titleMemo5.equals(other$titleMemo5)) {
            return false;
        }
        String string163 = this.getTitleMemo6();
        String string164 = other.getTitleMemo6();
        if (this$titleMemo6 == null ? other$titleMemo6 != null : !this$titleMemo6.equals(other$titleMemo6)) {
            return false;
        }
        String string165 = this.getSunshinePurchase();
        String string166 = other.getSunshinePurchase();
        if (this$sunshinePurchase == null ? other$sunshinePurchase != null : !this$sunshinePurchase.equals(other$sunshinePurchase)) {
            return false;
        }
        String string167 = this.getRegistrationNumber();
        String string168 = other.getRegistrationNumber();
        if (this$registrationNumber == null ? other$registrationNumber != null : !this$registrationNumber.equals(other$registrationNumber)) {
            return false;
        }
        String string169 = this.getReceiptWarehouseCode();
        String string170 = other.getReceiptWarehouseCode();
        if (this$receiptWarehouseCode == null ? other$receiptWarehouseCode != null : !this$receiptWarehouseCode.equals(other$receiptWarehouseCode)) {
            return false;
        }
        String string171 = this.getReceiptWarehouseName();
        String string172 = other.getReceiptWarehouseName();
        if (this$receiptWarehouseName == null ? other$receiptWarehouseName != null : !this$receiptWarehouseName.equals(other$receiptWarehouseName)) {
            return false;
        }
        BigDecimal bigDecimal83 = this.getEconomicQuantity();
        BigDecimal bigDecimal84 = other.getEconomicQuantity();
        if (this$economicQuantity == null ? other$economicQuantity != null : !this$economicQuantity.equals(other$economicQuantity)) {
            return false;
        }
        BigDecimal bigDecimal85 = this.getFixedQuantity();
        BigDecimal bigDecimal86 = other.getFixedQuantity();
        if (this$fixedQuantity == null ? other$fixedQuantity != null : !this$fixedQuantity.equals(other$fixedQuantity)) {
            return false;
        }
        BigDecimal bigDecimal87 = this.getBatchDouble();
        BigDecimal bigDecimal88 = other.getBatchDouble();
        if (this$batchDouble == null ? other$batchDouble != null : !this$batchDouble.equals(other$batchDouble)) {
            return false;
        }
        BigDecimal bigDecimal89 = this.getLeadTimeCoefficient();
        BigDecimal bigDecimal90 = other.getLeadTimeCoefficient();
        if (this$leadTimeCoefficient == null ? other$leadTimeCoefficient != null : !this$leadTimeCoefficient.equals(other$leadTimeCoefficient)) {
            return false;
        }
        BigDecimal bigDecimal91 = this.getLeadTimeQuantity();
        BigDecimal bigDecimal92 = other.getLeadTimeQuantity();
        if (this$leadTimeQuantity == null ? other$leadTimeQuantity != null : !this$leadTimeQuantity.equals(other$leadTimeQuantity)) {
            return false;
        }
        BigDecimal bigDecimal93 = this.getFixedWastage();
        BigDecimal bigDecimal94 = other.getFixedWastage();
        if (this$fixedWastage == null ? other$fixedWastage != null : !this$fixedWastage.equals(other$fixedWastage)) {
            return false;
        }
        BigDecimal bigDecimal95 = this.getWastageRate();
        BigDecimal bigDecimal96 = other.getWastageRate();
        if (this$wastageRate == null ? other$wastageRate != null : !this$wastageRate.equals(other$wastageRate)) {
            return false;
        }
        BigDecimal bigDecimal97 = this.getRejectRate();
        BigDecimal bigDecimal98 = other.getRejectRate();
        if (this$rejectRate == null ? other$rejectRate != null : !this$rejectRate.equals(other$rejectRate)) {
            return false;
        }
        String string173 = this.getYtenantId();
        String string174 = other.getYtenantId();
        if (this$ytenantId == null ? other$ytenantId != null : !this$ytenantId.equals(other$ytenantId)) {
            return false;
        }
        String string175 = this.getReceiptSpec();
        String string176 = other.getReceiptSpec();
        if (this$receiptSpec == null ? other$receiptSpec != null : !this$receiptSpec.equals(other$receiptSpec)) {
            return false;
        }
        String string177 = this.getReceiptModel();
        String string178 = other.getReceiptModel();
        if (this$receiptModel == null ? other$receiptModel != null : !this$receiptModel.equals(other$receiptModel)) {
            return false;
        }
        String string179 = this.getReceiptspec2();
        String string180 = other.getReceiptspec2();
        if (this$receiptspec2 == null ? other$receiptspec2 != null : !this$receiptspec2.equals(other$receiptspec2)) {
            return false;
        }
        String string181 = this.getReceiptmodel2();
        String string182 = other.getReceiptmodel2();
        if (this$receiptmodel2 == null ? other$receiptmodel2 != null : !this$receiptmodel2.equals(other$receiptmodel2)) {
            return false;
        }
        String string183 = this.getReceiptspec3();
        String string184 = other.getReceiptspec3();
        if (this$receiptspec3 == null ? other$receiptspec3 != null : !this$receiptspec3.equals(other$receiptspec3)) {
            return false;
        }
        String string185 = this.getReceiptmodel3();
        String string186 = other.getReceiptmodel3();
        if (this$receiptmodel3 == null ? other$receiptmodel3 != null : !this$receiptmodel3.equals(other$receiptmodel3)) {
            return false;
        }
        String string187 = this.getReceiptspec4();
        String string188 = other.getReceiptspec4();
        if (this$receiptspec4 == null ? other$receiptspec4 != null : !this$receiptspec4.equals(other$receiptspec4)) {
            return false;
        }
        String string189 = this.getReceiptmodel4();
        String string190 = other.getReceiptmodel4();
        if (this$receiptmodel4 == null ? other$receiptmodel4 != null : !this$receiptmodel4.equals(other$receiptmodel4)) {
            return false;
        }
        String string191 = this.getReceiptspec5();
        String string192 = other.getReceiptspec5();
        if (this$receiptspec5 == null ? other$receiptspec5 != null : !this$receiptspec5.equals(other$receiptspec5)) {
            return false;
        }
        String string193 = this.getReceiptmodel5();
        String string194 = other.getReceiptmodel5();
        if (this$receiptmodel5 == null ? other$receiptmodel5 != null : !this$receiptmodel5.equals(other$receiptmodel5)) {
            return false;
        }
        String string195 = this.getReceiptspec6();
        String string196 = other.getReceiptspec6();
        if (this$receiptspec6 == null ? other$receiptspec6 != null : !this$receiptspec6.equals(other$receiptspec6)) {
            return false;
        }
        String string197 = this.getReceiptmodel6();
        String string198 = other.getReceiptmodel6();
        if (this$receiptmodel6 == null ? other$receiptmodel6 != null : !this$receiptmodel6.equals(other$receiptmodel6)) {
            return false;
        }
        BigDecimal bigDecimal99 = this.getDoubleSale();
        BigDecimal bigDecimal100 = other.getDoubleSale();
        if (this$doubleSale == null ? other$doubleSale != null : !this$doubleSale.equals(other$doubleSale)) {
            return false;
        }
        String string199 = this.getOrgId();
        String string200 = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        MultilingualVO multilingualVO9 = this.getRemark();
        MultilingualVO multilingualVO10 = other.getRemark();
        if (this$remark == null ? other$remark != null : !this$remark.equals(other$remark)) {
            return false;
        }
        String string201 = this.getRemark1();
        String string202 = other.getRemark1();
        if (this$remark1 == null ? other$remark1 != null : !this$remark1.equals(other$remark1)) {
            return false;
        }
        String string203 = this.getRemark2();
        String string204 = other.getRemark2();
        if (this$remark2 == null ? other$remark2 != null : !this$remark2.equals(other$remark2)) {
            return false;
        }
        String string205 = this.getRemark3();
        String string206 = other.getRemark3();
        if (this$remark3 == null ? other$remark3 != null : !this$remark3.equals(other$remark3)) {
            return false;
        }
        String string207 = this.getRemark4();
        String string208 = other.getRemark4();
        if (this$remark4 == null ? other$remark4 != null : !this$remark4.equals(other$remark4)) {
            return false;
        }
        String string209 = this.getRemark5();
        String string210 = other.getRemark5();
        if (this$remark5 == null ? other$remark5 != null : !this$remark5.equals(other$remark5)) {
            return false;
        }
        String string211 = this.getRemark6();
        String string212 = other.getRemark6();
        if (this$remark6 == null ? other$remark6 != null : !this$remark6.equals(other$remark6)) {
            return false;
        }
        String string213 = this.getBusinessAttribute();
        String string214 = other.getBusinessAttribute();
        if (this$businessAttribute == null ? other$businessAttribute != null : !this$businessAttribute.equals(other$businessAttribute)) {
            return false;
        }
        BigDecimal bigDecimal101 = this.getPurchaseOrderQuantity();
        BigDecimal bigDecimal102 = other.getPurchaseOrderQuantity();
        if (this$purchaseOrderQuantity == null ? other$purchaseOrderQuantity != null : !this$purchaseOrderQuantity.equals(other$purchaseOrderQuantity)) {
            return false;
        }
        BigDecimal bigDecimal103 = this.getPurchaseTimes();
        BigDecimal bigDecimal104 = other.getPurchaseTimes();
        if (this$purchaseTimes == null ? other$purchaseTimes != null : !this$purchaseTimes.equals(other$purchaseTimes)) {
            return false;
        }
        BigDecimal bigDecimal105 = this.getDoubleReplenish();
        BigDecimal bigDecimal106 = other.getDoubleReplenish();
        if (this$doubleReplenish == null ? other$doubleReplenish != null : !this$doubleReplenish.equals(other$doubleReplenish)) {
            return false;
        }
        String string215 = this.getCostItems();
        String string216 = other.getCostItems();
        if (this$costItems == null ? other$costItems != null : !this$costItems.equals(other$costItems)) {
            return false;
        }
        String string217 = this.getCostItemsCode();
        String string218 = other.getCostItemsCode();
        if (this$costItemsCode == null ? other$costItemsCode != null : !this$costItemsCode.equals(other$costItemsCode)) {
            return false;
        }
        String string219 = this.getCostItemsName();
        String string220 = other.getCostItemsName();
        if (this$costItemsName == null ? other$costItemsName != null : !this$costItemsName.equals(other$costItemsName)) {
            return false;
        }
        Map<String, Object> map = this.getProductExtendCharacterDef();
        Map<String, Object> map2 = other.getProductExtendCharacterDef();
        if (this$productExtendCharacterDef == null ? other$productExtendCharacterDef != null : !this$productExtendCharacterDef.equals(other$productExtendCharacterDef)) {
            return false;
        }
        String string221 = this.getMaterialStatusId();
        String string222 = other.getMaterialStatusId();
        if (this$materialStatusId == null ? other$materialStatusId != null : !this$materialStatusId.equals(other$materialStatusId)) {
            return false;
        }
        String string223 = this.getMaterialStatusCode();
        String string224 = other.getMaterialStatusCode();
        if (this$materialStatusCode == null ? other$materialStatusCode != null : !this$materialStatusCode.equals(other$materialStatusCode)) {
            return false;
        }
        BigDecimal bigDecimal107 = this.getDoublePick();
        BigDecimal bigDecimal108 = other.getDoublePick();
        if (this$doublePick == null ? other$doublePick != null : !this$doublePick.equals(other$doublePick)) {
            return false;
        }
        String string225 = this.getManufacturingStrategy();
        String string226 = other.getManufacturingStrategy();
        if (this$manufacturingStrategy == null ? other$manufacturingStrategy != null : !this$manufacturingStrategy.equals(other$manufacturingStrategy)) {
            return false;
        }
        MultilingualVO multilingualVO11 = this.getReceiptSpecMultilingual();
        MultilingualVO multilingualVO12 = other.getReceiptSpecMultilingual();
        if (this$receiptSpecMultilingual == null ? other$receiptSpecMultilingual != null : !this$receiptSpecMultilingual.equals(other$receiptSpecMultilingual)) {
            return false;
        }
        MultilingualVO multilingualVO13 = this.getReceiptModelMultilingual();
        MultilingualVO multilingualVO14 = other.getReceiptModelMultilingual();
        if (this$receiptModelMultilingual == null ? other$receiptModelMultilingual != null : !this$receiptModelMultilingual.equals(other$receiptModelMultilingual)) {
            return false;
        }
        List<ProductLoadWayVO> list = this.getProductLoadWays();
        List<ProductLoadWayVO> list2 = other.getProductLoadWays();
        if (this$productLoadWays == null ? other$productLoadWays != null : !this$productLoadWays.equals(other$productLoadWays)) {
            return false;
        }
        String string227 = this.getDeliveryMethod();
        String string228 = other.getDeliveryMethod();
        if (this$deliveryMethod == null ? other$deliveryMethod != null : !this$deliveryMethod.equals(other$deliveryMethod)) {
            return false;
        }
        BigDecimal bigDecimal109 = this.getMeasurementCount();
        BigDecimal bigDecimal110 = other.getMeasurementCount();
        if (this$measurementCount == null ? other$measurementCount != null : !this$measurementCount.equals(other$measurementCount)) {
            return false;
        }
        String string229 = this.getMeasurementUnitName();
        String string230 = other.getMeasurementUnitName();
        if (this$measurementUnitName == null ? other$measurementUnitName != null : !this$measurementUnitName.equals(other$measurementUnitName)) {
            return false;
        }
        String string231 = this.getMeasurementUnitCode();
        String string232 = other.getMeasurementUnitCode();
        if (this$measurementUnitCode == null ? other$measurementUnitCode != null : !this$measurementUnitCode.equals(other$measurementUnitCode)) {
            return false;
        }
        BigDecimal bigDecimal111 = this.getCompensationAmount();
        BigDecimal bigDecimal112 = other.getCompensationAmount();
        if (this$compensationAmount == null ? other$compensationAmount != null : !this$compensationAmount.equals(other$compensationAmount)) {
            return false;
        }
        BigDecimal bigDecimal113 = this.getMoldingTime();
        BigDecimal bigDecimal114 = other.getMoldingTime();
        if (this$moldingTime == null ? other$moldingTime != null : !this$moldingTime.equals(other$moldingTime)) {
            return false;
        }
        BigDecimal bigDecimal115 = this.getMoldCavities();
        BigDecimal bigDecimal116 = other.getMoldCavities();
        return !(this$moldCavities == null ? other$moldCavities != null : !this$moldCavities.equals(other$moldCavities));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductDetailVO;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        void $moldCavities;
        void $moldingTime;
        void $compensationAmount;
        void $measurementUnitCode;
        void $measurementUnitName;
        void $measurementCount;
        void $deliveryMethod;
        void $productLoadWays;
        void $receiptModelMultilingual;
        void $receiptSpecMultilingual;
        void $manufacturingStrategy;
        void $doublePick;
        void $materialStatusCode;
        void $materialStatusId;
        void $productExtendCharacterDef;
        void $costItemsName;
        void $costItemsCode;
        void $costItems;
        void $doubleReplenish;
        void $purchaseTimes;
        void $purchaseOrderQuantity;
        void $businessAttribute;
        void $remark6;
        void $remark5;
        void $remark4;
        void $remark3;
        void $remark2;
        void $remark1;
        void $remark;
        void $orgId;
        void $doubleSale;
        void $receiptmodel6;
        void $receiptspec6;
        void $receiptmodel5;
        void $receiptspec5;
        void $receiptmodel4;
        void $receiptspec4;
        void $receiptmodel3;
        void $receiptspec3;
        void $receiptmodel2;
        void $receiptspec2;
        void $receiptModel;
        void $receiptSpec;
        void $ytenantId;
        void $rejectRate;
        void $wastageRate;
        void $fixedWastage;
        void $leadTimeQuantity;
        void $leadTimeCoefficient;
        void $batchDouble;
        void $fixedQuantity;
        void $economicQuantity;
        void $receiptWarehouseName;
        void $receiptWarehouseCode;
        void $registrationNumber;
        void $sunshinePurchase;
        void $titleMemo6;
        void $titleMemo5;
        void $titleMemo4;
        void $titleMemo3;
        void $titleMemo2;
        void $titleMemo1;
        void $displayName6;
        void $displayName5;
        void $displayName4;
        void $displayName3;
        void $displayName2;
        void $displayName1;
        void $metadescription6;
        void $metadescription5;
        void $metadescription4;
        void $metadescription3;
        void $metadescription2;
        void $metadescription1;
        void $receiptName6;
        void $receiptName5;
        void $receiptNam4;
        void $receiptName3;
        void $receiptName2;
        void $receiptName1;
        void $beUpTime;
        void $titleMemo;
        void $displayName;
        void $storageLossRate;
        void $outStoreLessLimit;
        void $inStoreLessLimit;
        void $outStoreExcessLimit;
        void $inStoreExcessLimit;
        void $returnWarehouseName;
        void $returnWarehouseCode;
        void $deliveryWarehouseName;
        void $deliveryWarehouseCode;
        void $warehouseManagerName;
        void $warehouseManagerCode;
        void $warehouseManager;
        void $produceRate;
        void $demandPlanningUnitName;
        void $demandPlanningUnitCode;
        void $produceUnitName;
        void $produceUnitCode;
        void $outTaxRateName;
        void $outTaxRateCode;
        void $outputTaxRate;
        void $incomeTaxRatesName;
        void $incomeTaxRatesCode;
        void $incomeTaxRates;
        void $receiptName;
        void $mnemonicCode;
        void $shortName;
        void $saleStyle;
        void $erpOuterCode;
        void $planOrderLimit;
        void $invoiceAllowErrorLimit;
        void $arrivalAllowErrorLimit;
        void $requestOrderLimit;
        void $maxPrimeCosts;
        void $productBuyerName;
        void $productBuyerCode;
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : ((Object)$productApplyRangeId).hashCode());
        Long $purchaseUnit = this.getPurchaseUnit();
        result = result * 59 + ($purchaseUnit == null ? 43 : ((Object)$purchaseUnit).hashCode());
        Long $purchasePriceUnit = this.getPurchasePriceUnit();
        result = result * 59 + ($purchasePriceUnit == null ? 43 : ((Object)$purchasePriceUnit).hashCode());
        Long $stockUnit = this.getStockUnit();
        result = result * 59 + ($stockUnit == null ? 43 : ((Object)$stockUnit).hashCode());
        Long $batchUnit = this.getBatchUnit();
        result = result * 59 + ($batchUnit == null ? 43 : ((Object)$batchUnit).hashCode());
        Long $onlineUnit = this.getOnlineUnit();
        result = result * 59 + ($onlineUnit == null ? 43 : ((Object)$onlineUnit).hashCode());
        Long $offlineUnit = this.getOfflineUnit();
        result = result * 59 + ($offlineUnit == null ? 43 : ((Object)$offlineUnit).hashCode());
        Long $requireUnit = this.getRequireUnit();
        result = result * 59 + ($requireUnit == null ? 43 : ((Object)$requireUnit).hashCode());
        Long $batchPriceUnit = this.getBatchPriceUnit();
        result = result * 59 + ($batchPriceUnit == null ? 43 : ((Object)$batchPriceUnit).hashCode());
        Long $inspectionUnit = this.getInspectionUnit();
        result = result * 59 + ($inspectionUnit == null ? 43 : ((Object)$inspectionUnit).hashCode());
        Boolean $displayPrice = this.getDisplayPrice();
        result = result * 59 + ($displayPrice == null ? 43 : ((Object)$displayPrice).hashCode());
        Integer $stockABCClass = this.getStockABCClass();
        result = result * 59 + ($stockABCClass == null ? 43 : ((Object)$stockABCClass).hashCode());
        Boolean $batchManage = this.getBatchManage();
        result = result * 59 + ($batchManage == null ? 43 : ((Object)$batchManage).hashCode());
        Boolean $expiryDateManage = this.getExpiryDateManage();
        result = result * 59 + ($expiryDateManage == null ? 43 : ((Object)$expiryDateManage).hashCode());
        Integer $expireDateNo = this.getExpireDateNo();
        result = result * 59 + ($expireDateNo == null ? 43 : ((Object)$expireDateNo).hashCode());
        Integer $expireDateUnit = this.getExpireDateUnit();
        result = result * 59 + ($expireDateUnit == null ? 43 : ((Object)$expireDateUnit).hashCode());
        Boolean $serialNoManage = this.getSerialNoManage();
        result = result * 59 + ($serialNoManage == null ? 43 : ((Object)$serialNoManage).hashCode());
        Long $omsWarehouse = this.getOmsWarehouse();
        result = result * 59 + ($omsWarehouse == null ? 43 : ((Object)$omsWarehouse).hashCode());
        Integer $maximumTurnoverDays = this.getMaximumTurnoverDays();
        result = result * 59 + ($maximumTurnoverDays == null ? 43 : ((Object)$maximumTurnoverDays).hashCode());
        Boolean $canSale = this.getCanSale();
        result = result * 59 + ($canSale == null ? 43 : ((Object)$canSale).hashCode());
        Integer $deliveryDays = this.getDeliveryDays();
        result = result * 59 + ($deliveryDays == null ? 43 : ((Object)$deliveryDays).hashCode());
        Long $orderDlyFeeRuleId = this.getOrderDlyFeeRuleId();
        result = result * 59 + ($orderDlyFeeRuleId == null ? 43 : ((Object)$orderDlyFeeRuleId).hashCode());
        Boolean $enableCyclePurchase = this.getEnableCyclePurchase();
        result = result * 59 + ($enableCyclePurchase == null ? 43 : ((Object)$enableCyclePurchase).hashCode());
        Boolean $enableDeposit = this.getEnableDeposit();
        result = result * 59 + ($enableDeposit == null ? 43 : ((Object)$enableDeposit).hashCode());
        Integer $depositDealPayType = this.getDepositDealPayType();
        result = result * 59 + ($depositDealPayType == null ? 43 : ((Object)$depositDealPayType).hashCode());
        Boolean $enableModifyDeposit = this.getEnableModifyDeposit();
        result = result * 59 + ($enableModifyDeposit == null ? 43 : ((Object)$enableModifyDeposit).hashCode());
        Integer $depositPayType = this.getDepositPayType();
        result = result * 59 + ($depositPayType == null ? 43 : ((Object)$depositPayType).hashCode());
        Integer $salePoints = this.getSalePoints();
        result = result * 59 + ($salePoints == null ? 43 : ((Object)$salePoints).hashCode());
        Long $templateOfFreightId = this.getTemplateOfFreightId();
        result = result * 59 + ($templateOfFreightId == null ? 43 : ((Object)$templateOfFreightId).hashCode());
        Integer $baseSaleCount = this.getBaseSaleCount();
        result = result * 59 + ($baseSaleCount == null ? 43 : ((Object)$baseSaleCount).hashCode());
        Boolean $allArea = this.getAllArea();
        result = result * 59 + ($allArea == null ? 43 : ((Object)$allArea).hashCode());
        Boolean $enableContractManagement = this.getEnableContractManagement();
        result = result * 59 + ($enableContractManagement == null ? 43 : ((Object)$enableContractManagement).hashCode());
        Boolean $allowStorePurchase = this.getAllowStorePurchase();
        result = result * 59 + ($allowStorePurchase == null ? 43 : ((Object)$allowStorePurchase).hashCode());
        Boolean $priceChangeAllowed = this.getPriceChangeAllowed();
        result = result * 59 + ($priceChangeAllowed == null ? 43 : ((Object)$priceChangeAllowed).hashCode());
        Boolean $saleInOfflineStore = this.getSaleInOfflineStore();
        result = result * 59 + ($saleInOfflineStore == null ? 43 : ((Object)$saleInOfflineStore).hashCode());
        Boolean $offlineStoreOrder = this.getOfflineStoreOrder();
        result = result * 59 + ($offlineStoreOrder == null ? 43 : ((Object)$offlineStoreOrder).hashCode());
        Boolean $offlineStoreReturn = this.getOfflineStoreReturn();
        result = result * 59 + ($offlineStoreReturn == null ? 43 : ((Object)$offlineStoreReturn).hashCode());
        Boolean $weighingOrNot = this.getWeighingOrNot();
        result = result * 59 + ($weighingOrNot == null ? 43 : ((Object)$weighingOrNot).hashCode());
        Boolean $process = this.getProcess();
        result = result * 59 + ($process == null ? 43 : ((Object)$process).hashCode());
        Integer $processType = this.getProcessType();
        result = result * 59 + ($processType == null ? 43 : ((Object)$processType).hashCode());
        Boolean $material = this.getMaterial();
        result = result * 59 + ($material == null ? 43 : ((Object)$material).hashCode());
        Integer $retailPriceDimension = this.getRetailPriceDimension();
        result = result * 59 + ($retailPriceDimension == null ? 43 : ((Object)$retailPriceDimension).hashCode());
        Integer $deliverQuantityChange = this.getDeliverQuantityChange();
        result = result * 59 + ($deliverQuantityChange == null ? 43 : ((Object)$deliverQuantityChange).hashCode());
        Boolean $checkByBatch = this.getCheckByBatch();
        result = result * 59 + ($checkByBatch == null ? 43 : ((Object)$checkByBatch).hashCode());
        Integer $checkByProject = this.getCheckByProject();
        result = result * 59 + ($checkByProject == null ? 43 : ((Object)$checkByProject).hashCode());
        Integer $checkBySalesOrders = this.getCheckBySalesOrders();
        result = result * 59 + ($checkBySalesOrders == null ? 43 : ((Object)$checkBySalesOrders).hashCode());
        Integer $checkByClient = this.getCheckByClient();
        result = result * 59 + ($checkByClient == null ? 43 : ((Object)$checkByClient).hashCode());
        Integer $checkByOutsourcing = this.getCheckByOutsourcing();
        result = result * 59 + ($checkByOutsourcing == null ? 43 : ((Object)$checkByOutsourcing).hashCode());
        Boolean $accountingByItem = this.getAccountingByItem();
        result = result * 59 + ($accountingByItem == null ? 43 : ((Object)$accountingByItem).hashCode());
        Boolean $storeOffAndOffState = this.getStoreOffAndOffState();
        result = result * 59 + ($storeOffAndOffState == null ? 43 : ((Object)$storeOffAndOffState).hashCode());
        Boolean $orderLoadAndUnloadStatus = this.getOrderLoadAndUnloadStatus();
        result = result * 59 + ($orderLoadAndUnloadStatus == null ? 43 : ((Object)$orderLoadAndUnloadStatus).hashCode());
        Integer $mallUpCount = this.getMallUpCount();
        result = result * 59 + ($mallUpCount == null ? 43 : ((Object)$mallUpCount).hashCode());
        Integer $mallDownCount = this.getMallDownCount();
        result = result * 59 + ($mallDownCount == null ? 43 : ((Object)$mallDownCount).hashCode());
        Integer $orderUpCount = this.getOrderUpCount();
        result = result * 59 + ($orderUpCount == null ? 43 : ((Object)$orderUpCount).hashCode());
        Integer $orderDownCount = this.getOrderDownCount();
        result = result * 59 + ($orderDownCount == null ? 43 : ((Object)$orderDownCount).hashCode());
        Long $tenant = this.getTenant();
        result = result * 59 + ($tenant == null ? 43 : ((Object)$tenant).hashCode());
        Boolean $saleChannelOfOnlineBatch = this.getSaleChannelOfOnlineBatch();
        result = result * 59 + ($saleChannelOfOnlineBatch == null ? 43 : ((Object)$saleChannelOfOnlineBatch).hashCode());
        Boolean $saleChannelOfOnlineRetail = this.getSaleChannelOfOnlineRetail();
        result = result * 59 + ($saleChannelOfOnlineRetail == null ? 43 : ((Object)$saleChannelOfOnlineRetail).hashCode());
        Boolean $saleChannelOfOfflineRetail = this.getSaleChannelOfOfflineRetail();
        result = result * 59 + ($saleChannelOfOfflineRetail == null ? 43 : ((Object)$saleChannelOfOfflineRetail).hashCode());
        Boolean $saleChannelOfDistribution = this.getSaleChannelOfDistribution();
        result = result * 59 + ($saleChannelOfDistribution == null ? 43 : ((Object)$saleChannelOfDistribution).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Integer $checkFree = this.getCheckFree();
        result = result * 59 + ($checkFree == null ? 43 : ((Object)$checkFree).hashCode());
        Integer $serviceDurationUnit = this.getServiceDurationUnit();
        result = result * 59 + ($serviceDurationUnit == null ? 43 : ((Object)$serviceDurationUnit).hashCode());
        Boolean $canOrder = this.getCanOrder();
        result = result * 59 + ($canOrder == null ? 43 : ((Object)$canOrder).hashCode());
        Boolean $onlyOrder = this.getOnlyOrder();
        result = result * 59 + ($onlyOrder == null ? 43 : ((Object)$onlyOrder).hashCode());
        Integer $orderAdvanceTime = this.getOrderAdvanceTime();
        result = result * 59 + ($orderAdvanceTime == null ? 43 : ((Object)$orderAdvanceTime).hashCode());
        Integer $valueManageType = this.getValueManageType();
        result = result * 59 + ($valueManageType == null ? 43 : ((Object)$valueManageType).hashCode());
        Integer $costValuation = this.getCostValuation();
        result = result * 59 + ($costValuation == null ? 43 : ((Object)$costValuation).hashCode());
        Boolean $checkByCost = this.getCheckByCost();
        result = result * 59 + ($checkByCost == null ? 43 : ((Object)$checkByCost).hashCode());
        Boolean $materialCost = this.getMaterialCost();
        result = result * 59 + ($materialCost == null ? 43 : ((Object)$materialCost).hashCode());
        Integer $planDefaultAttribute = this.getPlanDefaultAttribute();
        result = result * 59 + ($planDefaultAttribute == null ? 43 : ((Object)$planDefaultAttribute).hashCode());
        Integer $planMethod = this.getPlanMethod();
        result = result * 59 + ($planMethod == null ? 43 : ((Object)$planMethod).hashCode());
        Long $planStrategy = this.getPlanStrategy();
        result = result * 59 + ($planStrategy == null ? 43 : ((Object)$planStrategy).hashCode());
        Boolean $keySubPart = this.getKeySubPart();
        result = result * 59 + ($keySubPart == null ? 43 : ((Object)$keySubPart).hashCode());
        Integer $supplyDemandPolicy = this.getSupplyDemandPolicy();
        result = result * 59 + ($supplyDemandPolicy == null ? 43 : ((Object)$supplyDemandPolicy).hashCode());
        Integer $fixedLeadTime = this.getFixedLeadTime();
        result = result * 59 + ($fixedLeadTime == null ? 43 : ((Object)$fixedLeadTime).hashCode());
        Integer $batchPolicy = this.getBatchPolicy();
        result = result * 59 + ($batchPolicy == null ? 43 : ((Object)$batchPolicy).hashCode());
        Integer $supplyType = this.getSupplyType();
        result = result * 59 + ($supplyType == null ? 43 : ((Object)$supplyType).hashCode());
        Integer $supplyTimes = this.getSupplyTimes();
        result = result * 59 + ($supplyTimes == null ? 43 : ((Object)$supplyTimes).hashCode());
        Boolean $bindCarrier = this.getBindCarrier();
        result = result * 59 + ($bindCarrier == null ? 43 : ((Object)$bindCarrier).hashCode());
        Integer $purpose = this.getPurpose();
        result = result * 59 + ($purpose == null ? 43 : ((Object)$purpose).hashCode());
        Boolean $utility = this.getUtility();
        result = result * 59 + ($utility == null ? 43 : ((Object)$utility).hashCode());
        Boolean $weigh = this.getWeigh();
        result = result * 59 + ($weigh == null ? 43 : ((Object)$weigh).hashCode());
        Long $productVendor = this.getProductVendor();
        result = result * 59 + ($productVendor == null ? 43 : ((Object)$productVendor).hashCode());
        Boolean $enableSubscribe = this.getEnableSubscribe();
        result = result * 59 + ($enableSubscribe == null ? 43 : ((Object)$enableSubscribe).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Boolean $recommend = this.getRecommend();
        result = result * 59 + ($recommend == null ? 43 : ((Object)$recommend).hashCode());
        Long $preferentialPolicyType = this.getPreferentialPolicyType();
        result = result * 59 + ($preferentialPolicyType == null ? 43 : ((Object)$preferentialPolicyType).hashCode());
        Long $produceUnit = this.getProduceUnit();
        result = result * 59 + ($produceUnit == null ? 43 : ((Object)$produceUnit).hashCode());
        Long $demandPlanningUnit = this.getDemandPlanningUnit();
        result = result * 59 + ($demandPlanningUnit == null ? 43 : ((Object)$demandPlanningUnit).hashCode());
        Integer $daysBeforeValidityReject = this.getDaysBeforeValidityReject();
        result = result * 59 + ($daysBeforeValidityReject == null ? 43 : ((Object)$daysBeforeValidityReject).hashCode());
        Integer $validityWarningDays = this.getValidityWarningDays();
        result = result * 59 + ($validityWarningDays == null ? 43 : ((Object)$validityWarningDays).hashCode());
        Long $deliveryWarehouse = this.getDeliveryWarehouse();
        result = result * 59 + ($deliveryWarehouse == null ? 43 : ((Object)$deliveryWarehouse).hashCode());
        Long $returnWarehouse = this.getReturnWarehouse();
        result = result * 59 + ($returnWarehouse == null ? 43 : ((Object)$returnWarehouse).hashCode());
        Boolean $allowNegativeInventory = this.getAllowNegativeInventory();
        result = result * 59 + ($allowNegativeInventory == null ? 43 : ((Object)$allowNegativeInventory).hashCode());
        Integer $scanCountUnit = this.getScanCountUnit();
        result = result * 59 + ($scanCountUnit == null ? 43 : ((Object)$scanCountUnit).hashCode());
        Boolean $exemption = this.getExemption();
        result = result * 59 + ($exemption == null ? 43 : ((Object)$exemption).hashCode());
        Boolean $warehousingByResult = this.getWarehousingByResult();
        result = result * 59 + ($warehousingByResult == null ? 43 : ((Object)$warehousingByResult).hashCode());
        Boolean $salesReturnsExemption = this.getSalesReturnsExemption();
        result = result * 59 + ($salesReturnsExemption == null ? 43 : ((Object)$salesReturnsExemption).hashCode());
        Boolean $returnsWarehousingByResult = this.getReturnsWarehousingByResult();
        result = result * 59 + ($returnsWarehousingByResult == null ? 43 : ((Object)$returnsWarehousingByResult).hashCode());
        Boolean $periodicalInspection = this.getPeriodicalInspection();
        result = result * 59 + ($periodicalInspection == null ? 43 : ((Object)$periodicalInspection).hashCode());
        Integer $periodicalInspectionCycle = this.getPeriodicalInspectionCycle();
        result = result * 59 + ($periodicalInspectionCycle == null ? 43 : ((Object)$periodicalInspectionCycle).hashCode());
        Boolean $barcodeManage = this.getBarcodeManage();
        result = result * 59 + ($barcodeManage == null ? 43 : ((Object)$barcodeManage).hashCode());
        Integer $manageByInventory = this.getManageByInventory();
        result = result * 59 + ($manageByInventory == null ? 43 : ((Object)$manageByInventory).hashCode());
        Integer $registrationManager = this.getRegistrationManager();
        result = result * 59 + ($registrationManager == null ? 43 : ((Object)$registrationManager).hashCode());
        Integer $authorizationManager = this.getAuthorizationManager();
        result = result * 59 + ($authorizationManager == null ? 43 : ((Object)$authorizationManager).hashCode());
        Long $receiptWarehouse = this.getReceiptWarehouse();
        result = result * 59 + ($receiptWarehouse == null ? 43 : ((Object)$receiptWarehouse).hashCode());
        Integer $BOMType = this.getBOMType();
        result = result * 59 + ($BOMType == null ? 43 : ((Object)$BOMType).hashCode());
        Long $BOMSource = this.getBOMSource();
        result = result * 59 + ($BOMSource == null ? 43 : ((Object)$BOMSource).hashCode());
        Integer $batchRule = this.getBatchRule();
        result = result * 59 + ($batchRule == null ? 43 : ((Object)$batchRule).hashCode());
        Integer $frontLeadTime = this.getFrontLeadTime();
        result = result * 59 + ($frontLeadTime == null ? 43 : ((Object)$frontLeadTime).hashCode());
        Integer $behindLeadTime = this.getBehindLeadTime();
        result = result * 59 + ($behindLeadTime == null ? 43 : ((Object)$behindLeadTime).hashCode());
        Boolean $prepareFeed = this.getPrepareFeed();
        result = result * 59 + ($prepareFeed == null ? 43 : ((Object)$prepareFeed).hashCode());
        Boolean $specialMaterials = this.getSpecialMaterials();
        result = result * 59 + ($specialMaterials == null ? 43 : ((Object)$specialMaterials).hashCode());
        Boolean $virtualPart = this.getVirtualPart();
        result = result * 59 + ($virtualPart == null ? 43 : ((Object)$virtualPart).hashCode());
        Integer $demandConsolidation = this.getDemandConsolidation();
        result = result * 59 + ($demandConsolidation == null ? 43 : ((Object)$demandConsolidation).hashCode());
        Integer $demandConsolidationType = this.getDemandConsolidationType();
        result = result * 59 + ($demandConsolidationType == null ? 43 : ((Object)$demandConsolidationType).hashCode());
        Integer $demandConsolidationUnit = this.getDemandConsolidationUnit();
        result = result * 59 + ($demandConsolidationUnit == null ? 43 : ((Object)$demandConsolidationUnit).hashCode());
        Integer $demandConsolidationNumber = this.getDemandConsolidationNumber();
        result = result * 59 + ($demandConsolidationNumber == null ? 43 : ((Object)$demandConsolidationNumber).hashCode());
        Integer $demandConsolidationDateType = this.getDemandConsolidationDateType();
        result = result * 59 + ($demandConsolidationDateType == null ? 43 : ((Object)$demandConsolidationDateType).hashCode());
        Integer $resetForwardDays = this.getResetForwardDays();
        result = result * 59 + ($resetForwardDays == null ? 43 : ((Object)$resetForwardDays).hashCode());
        Integer $resetBackwardDays = this.getResetBackwardDays();
        result = result * 59 + ($resetBackwardDays == null ? 43 : ((Object)$resetBackwardDays).hashCode());
        Integer $beyondSupplyDays = this.getBeyondSupplyDays();
        result = result * 59 + ($beyondSupplyDays == null ? 43 : ((Object)$beyondSupplyDays).hashCode());
        Boolean $reservation = this.getReservation();
        result = result * 59 + ($reservation == null ? 43 : ((Object)$reservation).hashCode());
        Integer $lossType = this.getLossType();
        result = result * 59 + ($lossType == null ? 43 : ((Object)$lossType).hashCode());
        Boolean $workingPlan = this.getWorkingPlan();
        result = result * 59 + ($workingPlan == null ? 43 : ((Object)$workingPlan).hashCode());
        Boolean $ECNControl = this.getECNControl();
        result = result * 59 + ($ECNControl == null ? 43 : ((Object)$ECNControl).hashCode());
        Integer $inspectionType = this.getInspectionType();
        result = result * 59 + ($inspectionType == null ? 43 : ((Object)$inspectionType).hashCode());
        Boolean $logisticsRelated = this.getLogisticsRelated();
        result = result * 59 + ($logisticsRelated == null ? 43 : ((Object)$logisticsRelated).hashCode());
        Integer $weighingMode = this.getWeighingMode();
        result = result * 59 + ($weighingMode == null ? 43 : ((Object)$weighingMode).hashCode());
        Boolean $fixedReturn = this.getFixedReturn();
        result = result * 59 + ($fixedReturn == null ? 43 : ((Object)$fixedReturn).hashCode());
        Boolean $reviewGrossWeight = this.getReviewGrossWeight();
        result = result * 59 + ($reviewGrossWeight == null ? 43 : ((Object)$reviewGrossWeight).hashCode());
        Boolean $specialCarTransport = this.getSpecialCarTransport();
        result = result * 59 + ($specialCarTransport == null ? 43 : ((Object)$specialCarTransport).hashCode());
        Integer $inventoryPlanStrategy = this.getInventoryPlanStrategy();
        result = result * 59 + ($inventoryPlanStrategy == null ? 43 : ((Object)$inventoryPlanStrategy).hashCode());
        Integer $rangeType = this.getRangeType();
        result = result * 59 + ($rangeType == null ? 43 : ((Object)$rangeType).hashCode());
        Long $customerId = this.getCustomerId();
        result = result * 59 + ($customerId == null ? 43 : ((Object)$customerId).hashCode());
        Long $shopId = this.getShopId();
        result = result * 59 + ($shopId == null ? 43 : ((Object)$shopId).hashCode());
        Boolean $creator = this.getCreator();
        result = result * 59 + ($creator == null ? 43 : ((Object)$creator).hashCode());
        Integer $expiryDateCalculationMethod = this.getExpiryDateCalculationMethod();
        result = result * 59 + ($expiryDateCalculationMethod == null ? 43 : ((Object)$expiryDateCalculationMethod).hashCode());
        Integer $businessAttributePurchase = this.getBusinessAttributePurchase();
        result = result * 59 + ($businessAttributePurchase == null ? 43 : ((Object)$businessAttributePurchase).hashCode());
        Integer $businessAttributeSale = this.getBusinessAttributeSale();
        result = result * 59 + ($businessAttributeSale == null ? 43 : ((Object)$businessAttributeSale).hashCode());
        Integer $businessAttributeSelfCreate = this.getBusinessAttributeSelfCreate();
        result = result * 59 + ($businessAttributeSelfCreate == null ? 43 : ((Object)$businessAttributeSelfCreate).hashCode());
        Integer $businessAttributeOutSourcing = this.getBusinessAttributeOutSourcing();
        result = result * 59 + ($businessAttributeOutSourcing == null ? 43 : ((Object)$businessAttributeOutSourcing).hashCode());
        Integer $testRule = this.getTestRule();
        result = result * 59 + ($testRule == null ? 43 : ((Object)$testRule).hashCode());
        Integer $enableStockPeriodRecheck = this.getEnableStockPeriodRecheck();
        result = result * 59 + ($enableStockPeriodRecheck == null ? 43 : ((Object)$enableStockPeriodRecheck).hashCode());
        Integer $reviewCycle = this.getReviewCycle();
        result = result * 59 + ($reviewCycle == null ? 43 : ((Object)$reviewCycle).hashCode());
        Integer $recheckReminderLeadTime = this.getRecheckReminderLeadTime();
        result = result * 59 + ($recheckReminderLeadTime == null ? 43 : ((Object)$recheckReminderLeadTime).hashCode());
        Integer $enableStockExpireCheck = this.getEnableStockExpireCheck();
        result = result * 59 + ($enableStockExpireCheck == null ? 43 : ((Object)$enableStockExpireCheck).hashCode());
        Integer $effectiveLeadTime = this.getEffectiveLeadTime();
        result = result * 59 + ($effectiveLeadTime == null ? 43 : ((Object)$effectiveLeadTime).hashCode());
        Integer $checkReminderLeadTime = this.getCheckReminderLeadTime();
        result = result * 59 + ($checkReminderLeadTime == null ? 43 : ((Object)$checkReminderLeadTime).hashCode());
        Integer $enableSparePartsManagement = this.getEnableSparePartsManagement();
        result = result * 59 + ($enableSparePartsManagement == null ? 43 : ((Object)$enableSparePartsManagement).hashCode());
        Integer $fullSetInspection = this.getFullSetInspection();
        result = result * 59 + ($fullSetInspection == null ? 43 : ((Object)$fullSetInspection).hashCode());
        Integer $directProduction = this.getDirectProduction();
        result = result * 59 + ($directProduction == null ? 43 : ((Object)$directProduction).hashCode());
        Integer $projectTrackStrategy = this.getProjectTrackStrategy();
        result = result * 59 + ($projectTrackStrategy == null ? 43 : ((Object)$projectTrackStrategy).hashCode());
        Integer $singleInspection = this.getSingleInspection();
        result = result * 59 + ($singleInspection == null ? 43 : ((Object)$singleInspection).hashCode());
        Long $productExtendCharacterDefId = this.getProductExtendCharacterDefId();
        result = result * 59 + ($productExtendCharacterDefId == null ? 43 : ((Object)$productExtendCharacterDefId).hashCode());
        Long $billingUnitId = this.getBillingUnitId();
        result = result * 59 + ($billingUnitId == null ? 43 : ((Object)$billingUnitId).hashCode());
        Integer $checkByRevenueManagement = this.getCheckByRevenueManagement();
        result = result * 59 + ($checkByRevenueManagement == null ? 43 : ((Object)$checkByRevenueManagement).hashCode());
        Integer $overSigning = this.getOverSigning();
        result = result * 59 + ($overSigning == null ? 43 : ((Object)$overSigning).hashCode());
        Integer $atpInspection = this.getAtpInspection();
        result = result * 59 + ($atpInspection == null ? 43 : ((Object)$atpInspection).hashCode());
        Integer $mtoStrategy = this.getMtoStrategy();
        result = result * 59 + ($mtoStrategy == null ? 43 : ((Object)$mtoStrategy).hashCode());
        Integer $strategyComparisonRule = this.getStrategyComparisonRule();
        result = result * 59 + ($strategyComparisonRule == null ? 43 : ((Object)$strategyComparisonRule).hashCode());
        Integer $returnInspection = this.getReturnInspection();
        result = result * 59 + ($returnInspection == null ? 43 : ((Object)$returnInspection).hashCode());
        Integer $sendInspection = this.getSendInspection();
        result = result * 59 + ($sendInspection == null ? 43 : ((Object)$sendInspection).hashCode());
        Integer $planCheckDays = this.getPlanCheckDays();
        result = result * 59 + ($planCheckDays == null ? 43 : ((Object)$planCheckDays).hashCode());
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
        Integer $inspectionControlPoint = this.getInspectionControlPoint();
        result = result * 59 + ($inspectionControlPoint == null ? 43 : ((Object)$inspectionControlPoint).hashCode());
        Integer $turnoverMaterials = this.getTurnoverMaterials();
        result = result * 59 + ($turnoverMaterials == null ? 43 : ((Object)$turnoverMaterials).hashCode());
        Integer $amortizationMethod = this.getAmortizationMethod();
        result = result * 59 + ($amortizationMethod == null ? 43 : ((Object)$amortizationMethod).hashCode());
        Long $measurementUnit = this.getMeasurementUnit();
        result = result * 59 + ($measurementUnit == null ? 43 : ((Object)$measurementUnit).hashCode());
        String $purchaseUnitCode = this.getPurchaseUnitCode();
        result = result * 59 + ($purchaseUnitCode == null ? 43 : $purchaseUnitCode.hashCode());
        String $purchaseUnitName = this.getPurchaseUnitName();
        result = result * 59 + ($purchaseUnitName == null ? 43 : $purchaseUnitName.hashCode());
        String $purchasePriceUnitCode = this.getPurchasePriceUnitCode();
        result = result * 59 + ($purchasePriceUnitCode == null ? 43 : $purchasePriceUnitCode.hashCode());
        String $purchasePriceUnitName = this.getPurchasePriceUnitName();
        result = result * 59 + ($purchasePriceUnitName == null ? 43 : $purchasePriceUnitName.hashCode());
        BigDecimal $purchaseRate = this.getPurchaseRate();
        result = result * 59 + ($purchaseRate == null ? 43 : ((Object)$purchaseRate).hashCode());
        String $stockUnitCode = this.getStockUnitCode();
        result = result * 59 + ($stockUnitCode == null ? 43 : $stockUnitCode.hashCode());
        String $stockUnitName = this.getStockUnitName();
        result = result * 59 + ($stockUnitName == null ? 43 : $stockUnitName.hashCode());
        BigDecimal $stockRate = this.getStockRate();
        result = result * 59 + ($stockRate == null ? 43 : ((Object)$stockRate).hashCode());
        String $batchUnitCode = this.getBatchUnitCode();
        result = result * 59 + ($batchUnitCode == null ? 43 : $batchUnitCode.hashCode());
        String $batchUnitName = this.getBatchUnitName();
        result = result * 59 + ($batchUnitName == null ? 43 : $batchUnitName.hashCode());
        BigDecimal $batchRate = this.getBatchRate();
        result = result * 59 + ($batchRate == null ? 43 : ((Object)$batchRate).hashCode());
        String $onlineUnitCode = this.getOnlineUnitCode();
        result = result * 59 + ($onlineUnitCode == null ? 43 : $onlineUnitCode.hashCode());
        String $onlineUnitName = this.getOnlineUnitName();
        result = result * 59 + ($onlineUnitName == null ? 43 : $onlineUnitName.hashCode());
        BigDecimal $onlineRate = this.getOnlineRate();
        result = result * 59 + ($onlineRate == null ? 43 : ((Object)$onlineRate).hashCode());
        String $offlineUnitCode = this.getOfflineUnitCode();
        result = result * 59 + ($offlineUnitCode == null ? 43 : $offlineUnitCode.hashCode());
        String $offlineUnitName = this.getOfflineUnitName();
        result = result * 59 + ($offlineUnitName == null ? 43 : $offlineUnitName.hashCode());
        BigDecimal $offlineRate = this.getOfflineRate();
        result = result * 59 + ($offlineRate == null ? 43 : ((Object)$offlineRate).hashCode());
        String $requireUnitCode = this.getRequireUnitCode();
        result = result * 59 + ($requireUnitCode == null ? 43 : $requireUnitCode.hashCode());
        String $requireUnitName = this.getRequireUnitName();
        result = result * 59 + ($requireUnitName == null ? 43 : $requireUnitName.hashCode());
        BigDecimal $requireRate = this.getRequireRate();
        result = result * 59 + ($requireRate == null ? 43 : ((Object)$requireRate).hashCode());
        String $batchPriceUnitCode = this.getBatchPriceUnitCode();
        result = result * 59 + ($batchPriceUnitCode == null ? 43 : $batchPriceUnitCode.hashCode());
        String $batchPriceUnitName = this.getBatchPriceUnitName();
        result = result * 59 + ($batchPriceUnitName == null ? 43 : $batchPriceUnitName.hashCode());
        String $inspectionUnitCode = this.getInspectionUnitCode();
        result = result * 59 + ($inspectionUnitCode == null ? 43 : $inspectionUnitCode.hashCode());
        String $inspectionUnitName = this.getInspectionUnitName();
        result = result * 59 + ($inspectionUnitName == null ? 43 : $inspectionUnitName.hashCode());
        BigDecimal $batchPriceRate = this.getBatchPriceRate();
        result = result * 59 + ($batchPriceRate == null ? 43 : ((Object)$batchPriceRate).hashCode());
        BigDecimal $batchPrice = this.getBatchPrice();
        result = result * 59 + ($batchPrice == null ? 43 : ((Object)$batchPrice).hashCode());
        BigDecimal $markPrice = this.getMarkPrice();
        result = result * 59 + ($markPrice == null ? 43 : ((Object)$markPrice).hashCode());
        BigDecimal $lowestMarkPrice = this.getLowestMarkPrice();
        result = result * 59 + ($lowestMarkPrice == null ? 43 : ((Object)$lowestMarkPrice).hashCode());
        BigDecimal $salePrice = this.getSalePrice();
        result = result * 59 + ($salePrice == null ? 43 : ((Object)$salePrice).hashCode());
        BigDecimal $marketPrice = this.getMarketPrice();
        result = result * 59 + ($marketPrice == null ? 43 : ((Object)$marketPrice).hashCode());
        BigDecimal $primeCosts = this.getPrimeCosts();
        result = result * 59 + ($primeCosts == null ? 43 : ((Object)$primeCosts).hashCode());
        BigDecimal $settleAccountsRate = this.getSettleAccountsRate();
        result = result * 59 + ($settleAccountsRate == null ? 43 : ((Object)$settleAccountsRate).hashCode());
        String $priceAreaMessage = this.getPriceAreaMessage();
        result = result * 59 + ($priceAreaMessage == null ? 43 : $priceAreaMessage.hashCode());
        BigDecimal $weight = this.getWeight();
        result = result * 59 + ($weight == null ? 43 : ((Object)$weight).hashCode());
        BigDecimal $volume = this.getVolume();
        result = result * 59 + ($volume == null ? 43 : ((Object)$volume).hashCode());
        BigDecimal $safetyStock = this.getSafetyStock();
        result = result * 59 + ($safetyStock == null ? 43 : ((Object)$safetyStock).hashCode());
        BigDecimal $highestStock = this.getHighestStock();
        result = result * 59 + ($highestStock == null ? 43 : ((Object)$highestStock).hashCode());
        BigDecimal $lowestStock = this.getLowestStock();
        result = result * 59 + ($lowestStock == null ? 43 : ((Object)$lowestStock).hashCode());
        BigDecimal $ropStock = this.getRopStock();
        result = result * 59 + ($ropStock == null ? 43 : ((Object)$ropStock).hashCode());
        String $omsWarehouseCode = this.getOmsWarehouseCode();
        result = result * 59 + ($omsWarehouseCode == null ? 43 : $omsWarehouseCode.hashCode());
        String $omsWarehouseName = this.getOmsWarehouseName();
        result = result * 59 + ($omsWarehouseName == null ? 43 : $omsWarehouseName.hashCode());
        BigDecimal $minOrderQuantity = this.getMinOrderQuantity();
        result = result * 59 + ($minOrderQuantity == null ? 43 : ((Object)$minOrderQuantity).hashCode());
        BigDecimal $deposits = this.getDeposits();
        result = result * 59 + ($deposits == null ? 43 : ((Object)$deposits).hashCode());
        BigDecimal $depositPercentage = this.getDepositPercentage();
        result = result * 59 + ($depositPercentage == null ? 43 : ((Object)$depositPercentage).hashCode());
        BigDecimal $minimumDeposits = this.getMinimumDeposits();
        result = result * 59 + ($minimumDeposits == null ? 43 : ((Object)$minimumDeposits).hashCode());
        String $pageTitle = this.getPageTitle();
        result = result * 59 + ($pageTitle == null ? 43 : $pageTitle.hashCode());
        MultilingualVO $metaDescription = this.getMetaDescription();
        result = result * 59 + ($metaDescription == null ? 43 : $metaDescription.hashCode());
        BigDecimal $inventoryCount = this.getInventoryCount();
        result = result * 59 + ($inventoryCount == null ? 43 : ((Object)$inventoryCount).hashCode());
        BigDecimal $noTaxCostPrice = this.getNoTaxCostPrice();
        result = result * 59 + ($noTaxCostPrice == null ? 43 : ((Object)$noTaxCostPrice).hashCode());
        Date $mallUpTime = this.getMallUpTime();
        result = result * 59 + ($mallUpTime == null ? 43 : ((Object)$mallUpTime).hashCode());
        Date $mallDownTime = this.getMallDownTime();
        result = result * 59 + ($mallDownTime == null ? 43 : ((Object)$mallDownTime).hashCode());
        Date $orderUpTime = this.getOrderUpTime();
        result = result * 59 + ($orderUpTime == null ? 43 : ((Object)$orderUpTime).hashCode());
        Date $orderDownTime = this.getOrderDownTime();
        result = result * 59 + ($orderDownTime == null ? 43 : ((Object)$orderDownTime).hashCode());
        BigDecimal $minBatchPrice = this.getMinBatchPrice();
        result = result * 59 + ($minBatchPrice == null ? 43 : ((Object)$minBatchPrice).hashCode());
        BigDecimal $maxBatchPrice = this.getMaxBatchPrice();
        result = result * 59 + ($maxBatchPrice == null ? 43 : ((Object)$maxBatchPrice).hashCode());
        Date $timestamp = this.getTimestamp();
        result = result * 59 + ($timestamp == null ? 43 : ((Object)$timestamp).hashCode());
        String $saleChannel = this.getSaleChannel();
        result = result * 59 + ($saleChannel == null ? 43 : $saleChannel.hashCode());
        String $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : $barCode.hashCode());
        Date $stopTime = this.getStopTime();
        result = result * 59 + ($stopTime == null ? 43 : ((Object)$stopTime).hashCode());
        BigDecimal $serviceDuration = this.getServiceDuration();
        result = result * 59 + ($serviceDuration == null ? 43 : ((Object)$serviceDuration).hashCode());
        String $manufactureSpecs = this.getManufactureSpecs();
        result = result * 59 + ($manufactureSpecs == null ? 43 : $manufactureSpecs.hashCode());
        String $produceDepartment = this.getProduceDepartment();
        result = result * 59 + ($produceDepartment == null ? 43 : $produceDepartment.hashCode());
        String $produceDepartmentCode = this.getProduceDepartmentCode();
        result = result * 59 + ($produceDepartmentCode == null ? 43 : $produceDepartmentCode.hashCode());
        String $produceDepartmentName = this.getProduceDepartmentName();
        result = result * 59 + ($produceDepartmentName == null ? 43 : $produceDepartmentName.hashCode());
        String $manufacturePlanner = this.getManufacturePlanner();
        result = result * 59 + ($manufacturePlanner == null ? 43 : $manufacturePlanner.hashCode());
        String $manufacturePlannerCode = this.getManufacturePlannerCode();
        result = result * 59 + ($manufacturePlannerCode == null ? 43 : $manufacturePlannerCode.hashCode());
        String $manufacturePlannerName = this.getManufacturePlannerName();
        result = result * 59 + ($manufacturePlannerName == null ? 43 : $manufacturePlannerName.hashCode());
        String $engineeringDrawingNo = this.getEngineeringDrawingNo();
        result = result * 59 + ($engineeringDrawingNo == null ? 43 : $engineeringDrawingNo.hashCode());
        BigDecimal $planProduceLimit = this.getPlanProduceLimit();
        result = result * 59 + ($planProduceLimit == null ? 43 : ((Object)$planProduceLimit).hashCode());
        String $productVendorCode = this.getProductVendorCode();
        result = result * 59 + ($productVendorCode == null ? 43 : $productVendorCode.hashCode());
        String $productVendorName = this.getProductVendorName();
        result = result * 59 + ($productVendorName == null ? 43 : $productVendorName.hashCode());
        String $productBuyer = this.getProductBuyer();
        result = result * 59 + ($productBuyer == null ? 43 : $productBuyer.hashCode());
        String string = this.getProductBuyerCode();
        result = result * 59 + ($productBuyerCode == null ? 43 : $productBuyerCode.hashCode());
        String string2 = this.getProductBuyerName();
        result = result * 59 + ($productBuyerName == null ? 43 : $productBuyerName.hashCode());
        BigDecimal bigDecimal = this.getMaxPrimeCosts();
        result = result * 59 + ($maxPrimeCosts == null ? 43 : $maxPrimeCosts.hashCode());
        BigDecimal bigDecimal2 = this.getRequestOrderLimit();
        result = result * 59 + ($requestOrderLimit == null ? 43 : $requestOrderLimit.hashCode());
        BigDecimal bigDecimal3 = this.getArrivalAllowErrorLimit();
        result = result * 59 + ($arrivalAllowErrorLimit == null ? 43 : $arrivalAllowErrorLimit.hashCode());
        BigDecimal bigDecimal4 = this.getInvoiceAllowErrorLimit();
        result = result * 59 + ($invoiceAllowErrorLimit == null ? 43 : $invoiceAllowErrorLimit.hashCode());
        BigDecimal bigDecimal5 = this.getPlanOrderLimit();
        result = result * 59 + ($planOrderLimit == null ? 43 : $planOrderLimit.hashCode());
        String string3 = this.getErpOuterCode();
        result = result * 59 + ($erpOuterCode == null ? 43 : $erpOuterCode.hashCode());
        String string4 = this.getSaleStyle();
        result = result * 59 + ($saleStyle == null ? 43 : $saleStyle.hashCode());
        String string5 = this.getShortName();
        result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
        String string6 = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : $mnemonicCode.hashCode());
        MultilingualVO multilingualVO = this.getReceiptName();
        result = result * 59 + ($receiptName == null ? 43 : $receiptName.hashCode());
        String string7 = this.getIncomeTaxRates();
        result = result * 59 + ($incomeTaxRates == null ? 43 : $incomeTaxRates.hashCode());
        String string8 = this.getIncomeTaxRatesCode();
        result = result * 59 + ($incomeTaxRatesCode == null ? 43 : $incomeTaxRatesCode.hashCode());
        String string9 = this.getIncomeTaxRatesName();
        result = result * 59 + ($incomeTaxRatesName == null ? 43 : $incomeTaxRatesName.hashCode());
        String string10 = this.getOutputTaxRate();
        result = result * 59 + ($outputTaxRate == null ? 43 : $outputTaxRate.hashCode());
        String string11 = this.getOutTaxRateCode();
        result = result * 59 + ($outTaxRateCode == null ? 43 : $outTaxRateCode.hashCode());
        String string12 = this.getOutTaxRateName();
        result = result * 59 + ($outTaxRateName == null ? 43 : $outTaxRateName.hashCode());
        String string13 = this.getProduceUnitCode();
        result = result * 59 + ($produceUnitCode == null ? 43 : $produceUnitCode.hashCode());
        String string14 = this.getProduceUnitName();
        result = result * 59 + ($produceUnitName == null ? 43 : $produceUnitName.hashCode());
        String string15 = this.getDemandPlanningUnitCode();
        result = result * 59 + ($demandPlanningUnitCode == null ? 43 : $demandPlanningUnitCode.hashCode());
        String string16 = this.getDemandPlanningUnitName();
        result = result * 59 + ($demandPlanningUnitName == null ? 43 : $demandPlanningUnitName.hashCode());
        BigDecimal bigDecimal6 = this.getProduceRate();
        result = result * 59 + ($produceRate == null ? 43 : $produceRate.hashCode());
        String string17 = this.getWarehouseManager();
        result = result * 59 + ($warehouseManager == null ? 43 : $warehouseManager.hashCode());
        String string18 = this.getWarehouseManagerCode();
        result = result * 59 + ($warehouseManagerCode == null ? 43 : $warehouseManagerCode.hashCode());
        String string19 = this.getWarehouseManagerName();
        result = result * 59 + ($warehouseManagerName == null ? 43 : $warehouseManagerName.hashCode());
        String string20 = this.getDeliveryWarehouseCode();
        result = result * 59 + ($deliveryWarehouseCode == null ? 43 : $deliveryWarehouseCode.hashCode());
        String string21 = this.getDeliveryWarehouseName();
        result = result * 59 + ($deliveryWarehouseName == null ? 43 : $deliveryWarehouseName.hashCode());
        String string22 = this.getReturnWarehouseCode();
        result = result * 59 + ($returnWarehouseCode == null ? 43 : $returnWarehouseCode.hashCode());
        String string23 = this.getReturnWarehouseName();
        result = result * 59 + ($returnWarehouseName == null ? 43 : $returnWarehouseName.hashCode());
        BigDecimal bigDecimal7 = this.getInStoreExcessLimit();
        result = result * 59 + ($inStoreExcessLimit == null ? 43 : $inStoreExcessLimit.hashCode());
        BigDecimal bigDecimal8 = this.getOutStoreExcessLimit();
        result = result * 59 + ($outStoreExcessLimit == null ? 43 : $outStoreExcessLimit.hashCode());
        BigDecimal bigDecimal9 = this.getInStoreLessLimit();
        result = result * 59 + ($inStoreLessLimit == null ? 43 : $inStoreLessLimit.hashCode());
        BigDecimal bigDecimal10 = this.getOutStoreLessLimit();
        result = result * 59 + ($outStoreLessLimit == null ? 43 : $outStoreLessLimit.hashCode());
        BigDecimal bigDecimal11 = this.getStorageLossRate();
        result = result * 59 + ($storageLossRate == null ? 43 : $storageLossRate.hashCode());
        MultilingualVO multilingualVO2 = this.getDisplayName();
        result = result * 59 + ($displayName == null ? 43 : $displayName.hashCode());
        MultilingualVO multilingualVO3 = this.getTitleMemo();
        result = result * 59 + ($titleMemo == null ? 43 : $titleMemo.hashCode());
        Date date = this.getBeUpTime();
        result = result * 59 + ($beUpTime == null ? 43 : $beUpTime.hashCode());
        String string24 = this.getReceiptName1();
        result = result * 59 + ($receiptName1 == null ? 43 : $receiptName1.hashCode());
        String string25 = this.getReceiptName2();
        result = result * 59 + ($receiptName2 == null ? 43 : $receiptName2.hashCode());
        String string26 = this.getReceiptName3();
        result = result * 59 + ($receiptName3 == null ? 43 : $receiptName3.hashCode());
        String string27 = this.getReceiptNam4();
        result = result * 59 + ($receiptNam4 == null ? 43 : $receiptNam4.hashCode());
        String string28 = this.getReceiptName5();
        result = result * 59 + ($receiptName5 == null ? 43 : $receiptName5.hashCode());
        String string29 = this.getReceiptName6();
        result = result * 59 + ($receiptName6 == null ? 43 : $receiptName6.hashCode());
        String string30 = this.getMetadescription1();
        result = result * 59 + ($metadescription1 == null ? 43 : $metadescription1.hashCode());
        String string31 = this.getMetadescription2();
        result = result * 59 + ($metadescription2 == null ? 43 : $metadescription2.hashCode());
        String string32 = this.getMetadescription3();
        result = result * 59 + ($metadescription3 == null ? 43 : $metadescription3.hashCode());
        String string33 = this.getMetadescription4();
        result = result * 59 + ($metadescription4 == null ? 43 : $metadescription4.hashCode());
        String string34 = this.getMetadescription5();
        result = result * 59 + ($metadescription5 == null ? 43 : $metadescription5.hashCode());
        String string35 = this.getMetadescription6();
        result = result * 59 + ($metadescription6 == null ? 43 : $metadescription6.hashCode());
        String string36 = this.getDisplayName1();
        result = result * 59 + ($displayName1 == null ? 43 : $displayName1.hashCode());
        String string37 = this.getDisplayName2();
        result = result * 59 + ($displayName2 == null ? 43 : $displayName2.hashCode());
        String string38 = this.getDisplayName3();
        result = result * 59 + ($displayName3 == null ? 43 : $displayName3.hashCode());
        String string39 = this.getDisplayName4();
        result = result * 59 + ($displayName4 == null ? 43 : $displayName4.hashCode());
        String string40 = this.getDisplayName5();
        result = result * 59 + ($displayName5 == null ? 43 : $displayName5.hashCode());
        String string41 = this.getDisplayName6();
        result = result * 59 + ($displayName6 == null ? 43 : $displayName6.hashCode());
        String string42 = this.getTitleMemo1();
        result = result * 59 + ($titleMemo1 == null ? 43 : $titleMemo1.hashCode());
        String string43 = this.getTitleMemo2();
        result = result * 59 + ($titleMemo2 == null ? 43 : $titleMemo2.hashCode());
        String string44 = this.getTitleMemo3();
        result = result * 59 + ($titleMemo3 == null ? 43 : $titleMemo3.hashCode());
        String string45 = this.getTitleMemo4();
        result = result * 59 + ($titleMemo4 == null ? 43 : $titleMemo4.hashCode());
        String string46 = this.getTitleMemo5();
        result = result * 59 + ($titleMemo5 == null ? 43 : $titleMemo5.hashCode());
        String string47 = this.getTitleMemo6();
        result = result * 59 + ($titleMemo6 == null ? 43 : $titleMemo6.hashCode());
        String string48 = this.getSunshinePurchase();
        result = result * 59 + ($sunshinePurchase == null ? 43 : $sunshinePurchase.hashCode());
        String string49 = this.getRegistrationNumber();
        result = result * 59 + ($registrationNumber == null ? 43 : $registrationNumber.hashCode());
        String string50 = this.getReceiptWarehouseCode();
        result = result * 59 + ($receiptWarehouseCode == null ? 43 : $receiptWarehouseCode.hashCode());
        String string51 = this.getReceiptWarehouseName();
        result = result * 59 + ($receiptWarehouseName == null ? 43 : $receiptWarehouseName.hashCode());
        BigDecimal bigDecimal12 = this.getEconomicQuantity();
        result = result * 59 + ($economicQuantity == null ? 43 : $economicQuantity.hashCode());
        BigDecimal bigDecimal13 = this.getFixedQuantity();
        result = result * 59 + ($fixedQuantity == null ? 43 : $fixedQuantity.hashCode());
        BigDecimal bigDecimal14 = this.getBatchDouble();
        result = result * 59 + ($batchDouble == null ? 43 : $batchDouble.hashCode());
        BigDecimal bigDecimal15 = this.getLeadTimeCoefficient();
        result = result * 59 + ($leadTimeCoefficient == null ? 43 : $leadTimeCoefficient.hashCode());
        BigDecimal bigDecimal16 = this.getLeadTimeQuantity();
        result = result * 59 + ($leadTimeQuantity == null ? 43 : $leadTimeQuantity.hashCode());
        BigDecimal bigDecimal17 = this.getFixedWastage();
        result = result * 59 + ($fixedWastage == null ? 43 : $fixedWastage.hashCode());
        BigDecimal bigDecimal18 = this.getWastageRate();
        result = result * 59 + ($wastageRate == null ? 43 : $wastageRate.hashCode());
        BigDecimal bigDecimal19 = this.getRejectRate();
        result = result * 59 + ($rejectRate == null ? 43 : $rejectRate.hashCode());
        String string52 = this.getYtenantId();
        result = result * 59 + ($ytenantId == null ? 43 : $ytenantId.hashCode());
        String string53 = this.getReceiptSpec();
        result = result * 59 + ($receiptSpec == null ? 43 : $receiptSpec.hashCode());
        String string54 = this.getReceiptModel();
        result = result * 59 + ($receiptModel == null ? 43 : $receiptModel.hashCode());
        String string55 = this.getReceiptspec2();
        result = result * 59 + ($receiptspec2 == null ? 43 : $receiptspec2.hashCode());
        String string56 = this.getReceiptmodel2();
        result = result * 59 + ($receiptmodel2 == null ? 43 : $receiptmodel2.hashCode());
        String string57 = this.getReceiptspec3();
        result = result * 59 + ($receiptspec3 == null ? 43 : $receiptspec3.hashCode());
        String string58 = this.getReceiptmodel3();
        result = result * 59 + ($receiptmodel3 == null ? 43 : $receiptmodel3.hashCode());
        String string59 = this.getReceiptspec4();
        result = result * 59 + ($receiptspec4 == null ? 43 : $receiptspec4.hashCode());
        String string60 = this.getReceiptmodel4();
        result = result * 59 + ($receiptmodel4 == null ? 43 : $receiptmodel4.hashCode());
        String string61 = this.getReceiptspec5();
        result = result * 59 + ($receiptspec5 == null ? 43 : $receiptspec5.hashCode());
        String string62 = this.getReceiptmodel5();
        result = result * 59 + ($receiptmodel5 == null ? 43 : $receiptmodel5.hashCode());
        String string63 = this.getReceiptspec6();
        result = result * 59 + ($receiptspec6 == null ? 43 : $receiptspec6.hashCode());
        String string64 = this.getReceiptmodel6();
        result = result * 59 + ($receiptmodel6 == null ? 43 : $receiptmodel6.hashCode());
        BigDecimal bigDecimal20 = this.getDoubleSale();
        result = result * 59 + ($doubleSale == null ? 43 : $doubleSale.hashCode());
        String string65 = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        MultilingualVO multilingualVO4 = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        String string66 = this.getRemark1();
        result = result * 59 + ($remark1 == null ? 43 : $remark1.hashCode());
        String string67 = this.getRemark2();
        result = result * 59 + ($remark2 == null ? 43 : $remark2.hashCode());
        String string68 = this.getRemark3();
        result = result * 59 + ($remark3 == null ? 43 : $remark3.hashCode());
        String string69 = this.getRemark4();
        result = result * 59 + ($remark4 == null ? 43 : $remark4.hashCode());
        String string70 = this.getRemark5();
        result = result * 59 + ($remark5 == null ? 43 : $remark5.hashCode());
        String string71 = this.getRemark6();
        result = result * 59 + ($remark6 == null ? 43 : $remark6.hashCode());
        String string72 = this.getBusinessAttribute();
        result = result * 59 + ($businessAttribute == null ? 43 : $businessAttribute.hashCode());
        BigDecimal bigDecimal21 = this.getPurchaseOrderQuantity();
        result = result * 59 + ($purchaseOrderQuantity == null ? 43 : $purchaseOrderQuantity.hashCode());
        BigDecimal bigDecimal22 = this.getPurchaseTimes();
        result = result * 59 + ($purchaseTimes == null ? 43 : $purchaseTimes.hashCode());
        BigDecimal bigDecimal23 = this.getDoubleReplenish();
        result = result * 59 + ($doubleReplenish == null ? 43 : $doubleReplenish.hashCode());
        String string73 = this.getCostItems();
        result = result * 59 + ($costItems == null ? 43 : $costItems.hashCode());
        String string74 = this.getCostItemsCode();
        result = result * 59 + ($costItemsCode == null ? 43 : $costItemsCode.hashCode());
        String string75 = this.getCostItemsName();
        result = result * 59 + ($costItemsName == null ? 43 : $costItemsName.hashCode());
        Map<String, Object> map = this.getProductExtendCharacterDef();
        result = result * 59 + ($productExtendCharacterDef == null ? 43 : $productExtendCharacterDef.hashCode());
        String string76 = this.getMaterialStatusId();
        result = result * 59 + ($materialStatusId == null ? 43 : $materialStatusId.hashCode());
        String string77 = this.getMaterialStatusCode();
        result = result * 59 + ($materialStatusCode == null ? 43 : $materialStatusCode.hashCode());
        BigDecimal bigDecimal24 = this.getDoublePick();
        result = result * 59 + ($doublePick == null ? 43 : $doublePick.hashCode());
        String string78 = this.getManufacturingStrategy();
        result = result * 59 + ($manufacturingStrategy == null ? 43 : $manufacturingStrategy.hashCode());
        MultilingualVO multilingualVO5 = this.getReceiptSpecMultilingual();
        result = result * 59 + ($receiptSpecMultilingual == null ? 43 : $receiptSpecMultilingual.hashCode());
        MultilingualVO multilingualVO6 = this.getReceiptModelMultilingual();
        result = result * 59 + ($receiptModelMultilingual == null ? 43 : $receiptModelMultilingual.hashCode());
        List<ProductLoadWayVO> list = this.getProductLoadWays();
        result = result * 59 + ($productLoadWays == null ? 43 : $productLoadWays.hashCode());
        String string79 = this.getDeliveryMethod();
        result = result * 59 + ($deliveryMethod == null ? 43 : $deliveryMethod.hashCode());
        BigDecimal bigDecimal25 = this.getMeasurementCount();
        result = result * 59 + ($measurementCount == null ? 43 : $measurementCount.hashCode());
        String string80 = this.getMeasurementUnitName();
        result = result * 59 + ($measurementUnitName == null ? 43 : $measurementUnitName.hashCode());
        String string81 = this.getMeasurementUnitCode();
        result = result * 59 + ($measurementUnitCode == null ? 43 : $measurementUnitCode.hashCode());
        BigDecimal bigDecimal26 = this.getCompensationAmount();
        result = result * 59 + ($compensationAmount == null ? 43 : $compensationAmount.hashCode());
        BigDecimal bigDecimal27 = this.getMoldingTime();
        result = result * 59 + ($moldingTime == null ? 43 : $moldingTime.hashCode());
        BigDecimal bigDecimal28 = this.getMoldCavities();
        result = result * 59 + ($moldCavities == null ? 43 : $moldCavities.hashCode());
        return result;
    }

    public String toString() {
        return "ProductDetailVO(id=" + this.getId() + ", productId=" + this.getProductId() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", purchaseUnit=" + this.getPurchaseUnit() + ", purchaseUnitCode=" + this.getPurchaseUnitCode() + ", purchaseUnitName=" + this.getPurchaseUnitName() + ", purchasePriceUnit=" + this.getPurchasePriceUnit() + ", purchasePriceUnitCode=" + this.getPurchasePriceUnitCode() + ", purchasePriceUnitName=" + this.getPurchasePriceUnitName() + ", purchaseRate=" + this.getPurchaseRate() + ", stockUnit=" + this.getStockUnit() + ", stockUnitCode=" + this.getStockUnitCode() + ", stockUnitName=" + this.getStockUnitName() + ", stockRate=" + this.getStockRate() + ", batchUnit=" + this.getBatchUnit() + ", batchUnitCode=" + this.getBatchUnitCode() + ", batchUnitName=" + this.getBatchUnitName() + ", batchRate=" + this.getBatchRate() + ", onlineUnit=" + this.getOnlineUnit() + ", onlineUnitCode=" + this.getOnlineUnitCode() + ", onlineUnitName=" + this.getOnlineUnitName() + ", onlineRate=" + this.getOnlineRate() + ", offlineUnit=" + this.getOfflineUnit() + ", offlineUnitCode=" + this.getOfflineUnitCode() + ", offlineUnitName=" + this.getOfflineUnitName() + ", offlineRate=" + this.getOfflineRate() + ", requireUnit=" + this.getRequireUnit() + ", requireUnitCode=" + this.getRequireUnitCode() + ", requireUnitName=" + this.getRequireUnitName() + ", requireRate=" + this.getRequireRate() + ", batchPriceUnit=" + this.getBatchPriceUnit() + ", batchPriceUnitCode=" + this.getBatchPriceUnitCode() + ", batchPriceUnitName=" + this.getBatchPriceUnitName() + ", inspectionUnit=" + this.getInspectionUnit() + ", inspectionUnitCode=" + this.getInspectionUnitCode() + ", inspectionUnitName=" + this.getInspectionUnitName() + ", batchPriceRate=" + this.getBatchPriceRate() + ", batchPrice=" + this.getBatchPrice() + ", markPrice=" + this.getMarkPrice() + ", lowestMarkPrice=" + this.getLowestMarkPrice() + ", salePrice=" + this.getSalePrice() + ", marketPrice=" + this.getMarketPrice() + ", primeCosts=" + this.getPrimeCosts() + ", settleAccountsRate=" + this.getSettleAccountsRate() + ", displayPrice=" + this.getDisplayPrice() + ", priceAreaMessage=" + this.getPriceAreaMessage() + ", stockABCClass=" + this.getStockABCClass() + ", batchManage=" + this.getBatchManage() + ", expiryDateManage=" + this.getExpiryDateManage() + ", expireDateNo=" + this.getExpireDateNo() + ", expireDateUnit=" + this.getExpireDateUnit() + ", serialNoManage=" + this.getSerialNoManage() + ", weight=" + this.getWeight() + ", volume=" + this.getVolume() + ", safetyStock=" + this.getSafetyStock() + ", highestStock=" + this.getHighestStock() + ", lowestStock=" + this.getLowestStock() + ", ropStock=" + this.getRopStock() + ", omsWarehouse=" + this.getOmsWarehouse() + ", omsWarehouseCode=" + this.getOmsWarehouseCode() + ", omsWarehouseName=" + this.getOmsWarehouseName() + ", maximumTurnoverDays=" + this.getMaximumTurnoverDays() + ", canSale=" + this.getCanSale() + ", minOrderQuantity=" + this.getMinOrderQuantity() + ", deliveryDays=" + this.getDeliveryDays() + ", orderDlyFeeRuleId=" + this.getOrderDlyFeeRuleId() + ", enableCyclePurchase=" + this.getEnableCyclePurchase() + ", enableDeposit=" + this.getEnableDeposit() + ", depositDealPayType=" + this.getDepositDealPayType() + ", deposits=" + this.getDeposits() + ", depositPercentage=" + this.getDepositPercentage() + ", enableModifyDeposit=" + this.getEnableModifyDeposit() + ", minimumDeposits=" + this.getMinimumDeposits() + ", depositPayType=" + this.getDepositPayType() + ", pageTitle=" + this.getPageTitle() + ", metaDescription=" + this.getMetaDescription() + ", salePoints=" + this.getSalePoints() + ", inventoryCount=" + this.getInventoryCount() + ", templateOfFreightId=" + this.getTemplateOfFreightId() + ", baseSaleCount=" + this.getBaseSaleCount() + ", allArea=" + this.getAllArea() + ", enableContractManagement=" + this.getEnableContractManagement() + ", allowStorePurchase=" + this.getAllowStorePurchase() + ", priceChangeAllowed=" + this.getPriceChangeAllowed() + ", saleInOfflineStore=" + this.getSaleInOfflineStore() + ", offlineStoreOrder=" + this.getOfflineStoreOrder() + ", offlineStoreReturn=" + this.getOfflineStoreReturn() + ", weighingOrNot=" + this.getWeighingOrNot() + ", process=" + this.getProcess() + ", processType=" + this.getProcessType() + ", material=" + this.getMaterial() + ", retailPriceDimension=" + this.getRetailPriceDimension() + ", deliverQuantityChange=" + this.getDeliverQuantityChange() + ", noTaxCostPrice=" + this.getNoTaxCostPrice() + ", checkByBatch=" + this.getCheckByBatch() + ", checkByProject=" + this.getCheckByProject() + ", checkBySalesOrders=" + this.getCheckBySalesOrders() + ", checkByClient=" + this.getCheckByClient() + ", checkByOutsourcing=" + this.getCheckByOutsourcing() + ", accountingByItem=" + this.getAccountingByItem() + ", storeOffAndOffState=" + this.getStoreOffAndOffState() + ", orderLoadAndUnloadStatus=" + this.getOrderLoadAndUnloadStatus() + ", mallUpTime=" + this.getMallUpTime() + ", mallDownTime=" + this.getMallDownTime() + ", orderUpTime=" + this.getOrderUpTime() + ", orderDownTime=" + this.getOrderDownTime() + ", mallUpCount=" + this.getMallUpCount() + ", mallDownCount=" + this.getMallDownCount() + ", orderUpCount=" + this.getOrderUpCount() + ", orderDownCount=" + this.getOrderDownCount() + ", minBatchPrice=" + this.getMinBatchPrice() + ", maxBatchPrice=" + this.getMaxBatchPrice() + ", timestamp=" + this.getTimestamp() + ", tenant=" + this.getTenant() + ", saleChannel=" + this.getSaleChannel() + ", saleChannelOfOnlineBatch=" + this.getSaleChannelOfOnlineBatch() + ", saleChannelOfOnlineRetail=" + this.getSaleChannelOfOnlineRetail() + ", saleChannelOfOfflineRetail=" + this.getSaleChannelOfOfflineRetail() + ", saleChannelOfDistribution=" + this.getSaleChannelOfDistribution() + ", barCode=" + this.getBarCode() + ", stopStatus=" + this.getStopStatus() + ", stopTime=" + this.getStopTime() + ", checkFree=" + this.getCheckFree() + ", serviceDuration=" + this.getServiceDuration() + ", serviceDurationUnit=" + this.getServiceDurationUnit() + ", canOrder=" + this.getCanOrder() + ", onlyOrder=" + this.getOnlyOrder() + ", orderAdvanceTime=" + this.getOrderAdvanceTime() + ", valueManageType=" + this.getValueManageType() + ", costValuation=" + this.getCostValuation() + ", checkByCost=" + this.getCheckByCost() + ", materialCost=" + this.getMaterialCost() + ", planDefaultAttribute=" + this.getPlanDefaultAttribute() + ", manufactureSpecs=" + this.getManufactureSpecs() + ", planMethod=" + this.getPlanMethod() + ", planStrategy=" + this.getPlanStrategy() + ", keySubPart=" + this.getKeySubPart() + ", supplyDemandPolicy=" + this.getSupplyDemandPolicy() + ", fixedLeadTime=" + this.getFixedLeadTime() + ", batchPolicy=" + this.getBatchPolicy() + ", supplyType=" + this.getSupplyType() + ", produceDepartment=" + this.getProduceDepartment() + ", produceDepartmentCode=" + this.getProduceDepartmentCode() + ", produceDepartmentName=" + this.getProduceDepartmentName() + ", manufacturePlanner=" + this.getManufacturePlanner() + ", manufacturePlannerCode=" + this.getManufacturePlannerCode() + ", manufacturePlannerName=" + this.getManufacturePlannerName() + ", engineeringDrawingNo=" + this.getEngineeringDrawingNo() + ", supplyTimes=" + this.getSupplyTimes() + ", planProduceLimit=" + this.getPlanProduceLimit() + ", bindCarrier=" + this.getBindCarrier() + ", purpose=" + this.getPurpose() + ", utility=" + this.getUtility() + ", weigh=" + this.getWeigh() + ", productVendor=" + this.getProductVendor() + ", productVendorCode=" + this.getProductVendorCode() + ", productVendorName=" + this.getProductVendorName() + ", productBuyer=" + this.getProductBuyer() + ", productBuyerCode=" + this.getProductBuyerCode() + ", productBuyerName=" + this.getProductBuyerName() + ", maxPrimeCosts=" + this.getMaxPrimeCosts() + ", requestOrderLimit=" + this.getRequestOrderLimit() + ", arrivalAllowErrorLimit=" + this.getArrivalAllowErrorLimit() + ", invoiceAllowErrorLimit=" + this.getInvoiceAllowErrorLimit() + ", planOrderLimit=" + this.getPlanOrderLimit() + ", enableSubscribe=" + this.getEnableSubscribe() + ", order=" + this.getOrder() + ", recommend=" + this.getRecommend() + ", erpOuterCode=" + this.getErpOuterCode() + ", saleStyle=" + this.getSaleStyle() + ", shortName=" + this.getShortName() + ", mnemonicCode=" + this.getMnemonicCode() + ", receiptName=" + this.getReceiptName() + ", incomeTaxRates=" + this.getIncomeTaxRates() + ", incomeTaxRatesCode=" + this.getIncomeTaxRatesCode() + ", incomeTaxRatesName=" + this.getIncomeTaxRatesName() + ", outputTaxRate=" + this.getOutputTaxRate() + ", outTaxRateCode=" + this.getOutTaxRateCode() + ", outTaxRateName=" + this.getOutTaxRateName() + ", preferentialPolicyType=" + this.getPreferentialPolicyType() + ", produceUnit=" + this.getProduceUnit() + ", produceUnitCode=" + this.getProduceUnitCode() + ", produceUnitName=" + this.getProduceUnitName() + ", demandPlanningUnit=" + this.getDemandPlanningUnit() + ", demandPlanningUnitCode=" + this.getDemandPlanningUnitCode() + ", demandPlanningUnitName=" + this.getDemandPlanningUnitName() + ", produceRate=" + this.getProduceRate() + ", daysBeforeValidityReject=" + this.getDaysBeforeValidityReject() + ", validityWarningDays=" + this.getValidityWarningDays() + ", warehouseManager=" + this.getWarehouseManager() + ", warehouseManagerCode=" + this.getWarehouseManagerCode() + ", warehouseManagerName=" + this.getWarehouseManagerName() + ", deliveryWarehouse=" + this.getDeliveryWarehouse() + ", deliveryWarehouseCode=" + this.getDeliveryWarehouseCode() + ", deliveryWarehouseName=" + this.getDeliveryWarehouseName() + ", returnWarehouse=" + this.getReturnWarehouse() + ", returnWarehouseCode=" + this.getReturnWarehouseCode() + ", returnWarehouseName=" + this.getReturnWarehouseName() + ", inStoreExcessLimit=" + this.getInStoreExcessLimit() + ", outStoreExcessLimit=" + this.getOutStoreExcessLimit() + ", inStoreLessLimit=" + this.getInStoreLessLimit() + ", outStoreLessLimit=" + this.getOutStoreLessLimit() + ", storageLossRate=" + this.getStorageLossRate() + ", allowNegativeInventory=" + this.getAllowNegativeInventory() + ", scanCountUnit=" + this.getScanCountUnit() + ", exemption=" + this.getExemption() + ", warehousingByResult=" + this.getWarehousingByResult() + ", salesReturnsExemption=" + this.getSalesReturnsExemption() + ", returnsWarehousingByResult=" + this.getReturnsWarehousingByResult() + ", periodicalInspection=" + this.getPeriodicalInspection() + ", periodicalInspectionCycle=" + this.getPeriodicalInspectionCycle() + ", displayName=" + this.getDisplayName() + ", titleMemo=" + this.getTitleMemo() + ", beUpTime=" + this.getBeUpTime() + ", receiptName1=" + this.getReceiptName1() + ", receiptName2=" + this.getReceiptName2() + ", receiptName3=" + this.getReceiptName3() + ", receiptNam4=" + this.getReceiptNam4() + ", receiptName5=" + this.getReceiptName5() + ", receiptName6=" + this.getReceiptName6() + ", metadescription1=" + this.getMetadescription1() + ", metadescription2=" + this.getMetadescription2() + ", metadescription3=" + this.getMetadescription3() + ", metadescription4=" + this.getMetadescription4() + ", metadescription5=" + this.getMetadescription5() + ", metadescription6=" + this.getMetadescription6() + ", displayName1=" + this.getDisplayName1() + ", displayName2=" + this.getDisplayName2() + ", displayName3=" + this.getDisplayName3() + ", displayName4=" + this.getDisplayName4() + ", displayName5=" + this.getDisplayName5() + ", displayName6=" + this.getDisplayName6() + ", titleMemo1=" + this.getTitleMemo1() + ", titleMemo2=" + this.getTitleMemo2() + ", titleMemo3=" + this.getTitleMemo3() + ", titleMemo4=" + this.getTitleMemo4() + ", titleMemo5=" + this.getTitleMemo5() + ", titleMemo6=" + this.getTitleMemo6() + ", barcodeManage=" + this.getBarcodeManage() + ", manageByInventory=" + this.getManageByInventory() + ", registrationManager=" + this.getRegistrationManager() + ", authorizationManager=" + this.getAuthorizationManager() + ", sunshinePurchase=" + this.getSunshinePurchase() + ", registrationNumber=" + this.getRegistrationNumber() + ", receiptWarehouse=" + this.getReceiptWarehouse() + ", receiptWarehouseCode=" + this.getReceiptWarehouseCode() + ", receiptWarehouseName=" + this.getReceiptWarehouseName() + ", BOMType=" + this.getBOMType() + ", BOMSource=" + this.getBOMSource() + ", batchRule=" + this.getBatchRule() + ", economicQuantity=" + this.getEconomicQuantity() + ", fixedQuantity=" + this.getFixedQuantity() + ", batchDouble=" + this.getBatchDouble() + ", frontLeadTime=" + this.getFrontLeadTime() + ", behindLeadTime=" + this.getBehindLeadTime() + ", leadTimeCoefficient=" + this.getLeadTimeCoefficient() + ", leadTimeQuantity=" + this.getLeadTimeQuantity() + ", fixedWastage=" + this.getFixedWastage() + ", wastageRate=" + this.getWastageRate() + ", rejectRate=" + this.getRejectRate() + ", prepareFeed=" + this.getPrepareFeed() + ", specialMaterials=" + this.getSpecialMaterials() + ", virtualPart=" + this.getVirtualPart() + ", demandConsolidation=" + this.getDemandConsolidation() + ", demandConsolidationType=" + this.getDemandConsolidationType() + ", demandConsolidationUnit=" + this.getDemandConsolidationUnit() + ", demandConsolidationNumber=" + this.getDemandConsolidationNumber() + ", demandConsolidationDateType=" + this.getDemandConsolidationDateType() + ", resetForwardDays=" + this.getResetForwardDays() + ", resetBackwardDays=" + this.getResetBackwardDays() + ", beyondSupplyDays=" + this.getBeyondSupplyDays() + ", reservation=" + this.getReservation() + ", lossType=" + this.getLossType() + ", workingPlan=" + this.getWorkingPlan() + ", ECNControl=" + this.getECNControl() + ", ytenantId=" + this.getYtenantId() + ", receiptSpec=" + this.getReceiptSpec() + ", receiptModel=" + this.getReceiptModel() + ", receiptspec2=" + this.getReceiptspec2() + ", receiptmodel2=" + this.getReceiptmodel2() + ", receiptspec3=" + this.getReceiptspec3() + ", receiptmodel3=" + this.getReceiptmodel3() + ", receiptspec4=" + this.getReceiptspec4() + ", receiptmodel4=" + this.getReceiptmodel4() + ", receiptspec5=" + this.getReceiptspec5() + ", receiptmodel5=" + this.getReceiptmodel5() + ", receiptspec6=" + this.getReceiptspec6() + ", receiptmodel6=" + this.getReceiptmodel6() + ", doubleSale=" + this.getDoubleSale() + ", inspectionType=" + this.getInspectionType() + ", logisticsRelated=" + this.getLogisticsRelated() + ", weighingMode=" + this.getWeighingMode() + ", fixedReturn=" + this.getFixedReturn() + ", reviewGrossWeight=" + this.getReviewGrossWeight() + ", specialCarTransport=" + this.getSpecialCarTransport() + ", inventoryPlanStrategy=" + this.getInventoryPlanStrategy() + ", rangeType=" + this.getRangeType() + ", orgId=" + this.getOrgId() + ", customerId=" + this.getCustomerId() + ", shopId=" + this.getShopId() + ", creator=" + this.getCreator() + ", expiryDateCalculationMethod=" + this.getExpiryDateCalculationMethod() + ", remark=" + this.getRemark() + ", remark1=" + this.getRemark1() + ", remark2=" + this.getRemark2() + ", remark3=" + this.getRemark3() + ", remark4=" + this.getRemark4() + ", remark5=" + this.getRemark5() + ", remark6=" + this.getRemark6() + ", businessAttribute=" + this.getBusinessAttribute() + ", businessAttributePurchase=" + this.getBusinessAttributePurchase() + ", businessAttributeSale=" + this.getBusinessAttributeSale() + ", businessAttributeSelfCreate=" + this.getBusinessAttributeSelfCreate() + ", businessAttributeOutSourcing=" + this.getBusinessAttributeOutSourcing() + ", testRule=" + this.getTestRule() + ", enableStockPeriodRecheck=" + this.getEnableStockPeriodRecheck() + ", reviewCycle=" + this.getReviewCycle() + ", recheckReminderLeadTime=" + this.getRecheckReminderLeadTime() + ", enableStockExpireCheck=" + this.getEnableStockExpireCheck() + ", effectiveLeadTime=" + this.getEffectiveLeadTime() + ", checkReminderLeadTime=" + this.getCheckReminderLeadTime() + ", enableSparePartsManagement=" + this.getEnableSparePartsManagement() + ", fullSetInspection=" + this.getFullSetInspection() + ", purchaseOrderQuantity=" + this.getPurchaseOrderQuantity() + ", purchaseTimes=" + this.getPurchaseTimes() + ", doubleReplenish=" + this.getDoubleReplenish() + ", directProduction=" + this.getDirectProduction() + ", projectTrackStrategy=" + this.getProjectTrackStrategy() + ", costItems=" + this.getCostItems() + ", costItemsCode=" + this.getCostItemsCode() + ", costItemsName=" + this.getCostItemsName() + ", singleInspection=" + this.getSingleInspection() + ", productExtendCharacterDefId=" + this.getProductExtendCharacterDefId() + ", productExtendCharacterDef=" + this.getProductExtendCharacterDef() + ", materialStatusId=" + this.getMaterialStatusId() + ", materialStatusCode=" + this.getMaterialStatusCode() + ", billingUnitId=" + this.getBillingUnitId() + ", checkByRevenueManagement=" + this.getCheckByRevenueManagement() + ", overSigning=" + this.getOverSigning() + ", atpInspection=" + this.getAtpInspection() + ", doublePick=" + this.getDoublePick() + ", mtoStrategy=" + this.getMtoStrategy() + ", strategyComparisonRule=" + this.getStrategyComparisonRule() + ", manufacturingStrategy=" + this.getManufacturingStrategy() + ", receiptSpecMultilingual=" + this.getReceiptSpecMultilingual() + ", receiptModelMultilingual=" + this.getReceiptModelMultilingual() + ", returnInspection=" + this.getReturnInspection() + ", sendInspection=" + this.getSendInspection() + ", planCheckDays=" + this.getPlanCheckDays() + ", productLoadWays=" + this.getProductLoadWays() + ", productInspection=" + this.getProductInspection() + ", productInspectionCtrlPoint=" + this.getProductInspectionCtrlPoint() + ", outSourceInspection=" + this.getOutSourceInspection() + ", outSourceInspectionCtrlPoint=" + this.getOutSourceInspectionCtrlPoint() + ", transferInspection=" + this.getTransferInspection() + ", transferInspectionCtrlPoint=" + this.getTransferInspectionCtrlPoint() + ", productFirstInspection=" + this.getProductFirstInspection() + ", firstInspectionCtrlMethod=" + this.getFirstInspectionCtrlMethod() + ", sendInspectionCtrlPoint=" + this.getSendInspectionCtrlPoint() + ", returnInspectionCtrlPoint=" + this.getReturnInspectionCtrlPoint() + ", inspectionControlPoint=" + this.getInspectionControlPoint() + ", deliveryMethod=" + this.getDeliveryMethod() + ", turnoverMaterials=" + this.getTurnoverMaterials() + ", amortizationMethod=" + this.getAmortizationMethod() + ", measurementCount=" + this.getMeasurementCount() + ", measurementUnit=" + this.getMeasurementUnit() + ", measurementUnitName=" + this.getMeasurementUnitName() + ", measurementUnitCode=" + this.getMeasurementUnitCode() + ", compensationAmount=" + this.getCompensationAmount() + ", moldingTime=" + this.getMoldingTime() + ", moldCavities=" + this.getMoldCavities() + ")";
    }
}

