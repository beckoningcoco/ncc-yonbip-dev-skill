/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.fasterxml.jackson.annotation.JsonProperty
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.yonyoucloud.iuap.ipass.product.IpassMultilingual;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductDetailIPass
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Boolean exemption;
    private Boolean warehousingByResult;
    private Boolean salesReturnsExemption;
    private Boolean returnsWarehousingByResult;
    private Boolean periodicalInspection;
    private Long periodicalInspectionCycle;
    private String shortName;
    private String mnemonicCode;
    private String barCode;
    private String businessAttribute;
    private String saleChannel;
    private String productApplyRangeId;
    private String id;
    private String pubts;
    private String purchaseUnit;
    private String purchaseUnit_Code;
    private String purchaseUnit_Name;
    private Long inspectionUnit;
    private String inspectionUnit_Code;
    private String inspectionUnit_Name;
    private Long purchasePriceUnit;
    private String purchasePriceUnit_Code;
    private String purchasePriceUnit_Name;
    private String stockUnit;
    private String stockUnit_Code;
    private String stockUnit_Name;
    private String produceUnit;
    private String produceUnit_Code;
    private String produceUnit_Name;
    private String batchPriceUnit;
    private String batchPriceUnit_Code;
    private String batchPriceUnit_Name;
    private String batchUnit;
    private String batchUnit_Code;
    private String batchUnit_Name;
    private String onlineUnit;
    private String onlineUnit_Code;
    private String onlineUnit_Name;
    private String offlineUnit;
    private String offlineUnit_Code;
    private String offlineUnit_Name;
    private String requireUnit;
    private String requireUnit_Code;
    private String requireUnit_Name;
    private Long batchPrice;
    @JsonProperty(value="fMarkPrice")
    private Long fMarkPrice;
    @JsonProperty(value="fLowestMarkPrice")
    private Long fLowestMarkPrice;
    @JsonProperty(value="fSalePrice")
    private Long fSalePrice;
    @JsonProperty(value="fMarketPrice")
    private Long fMarketPrice;
    private Boolean isDisplayPrice;
    private String priceAreaMessage;
    private IpassMultilingual receiptName;
    private String inTaxrate;
    private String inTaxrate_Code;
    private Long inTaxrate_Name;
    private String outTaxrate;
    private String outTaxrate_Code;
    private Long outTaxrate_Name;
    private String preferentialPolicyType;
    private String preferentialPolicyType_Name;
    @JsonProperty(value="iOrder")
    private Long iOrder;
    @JsonProperty(value="stopstatus")
    private Boolean stopstatus;
    @JsonProperty(value="iStatus")
    private Boolean iStatus;
    private String mallUpTime;
    @JsonProperty(value="iUOrderStatus")
    private Boolean iUOrderStatus;
    private String uorderUpTime;
    private String productVendor;
    private String productVendor_Name;
    private String productBuyer;
    private String productBuyer_Name;
    @JsonProperty(value="fPrimeCosts")
    private Long fPrimeCosts;
    private Long maxPrimeCosts;
    private Long requestOrderLimit;
    private Boolean canSale;
    @JsonProperty(value="iMinOrderQuantity")
    private Long iMinOrderQuantity;
    private Long deliveryDays;
    private String uorderDlyFeeRuleId;
    private String uorderDlyFeeRuleId_Name;
    private String beUpTime;
    private Boolean isBatchManage;
    private Boolean isExpiryDateManage;
    private Short isExpiryDateCalculationMethod;
    private Long expireDateNo;
    private String expireDateUnit;
    private Long daysBeforeValidityReject;
    private Long validityWarningDays;
    private Boolean isSerialNoManage;
    private Boolean isBarcodeManage;
    private Long safetyStock;
    private Long highestStock;
    private Long lowestStock;
    private Long ropStock;
    private String warehouseManager;
    private String warehouseManager_Name;
    private String deliveryWarehouse;
    private String deliveryWarehouse_Name;
    private String returnWarehouse;
    private String returnWarehouse_Name;
    private Long inStoreExcessLimit;
    private Long outStoreExcessLimit;
    private Long storageLossRate;
    private String planDefaultAttribute;
    private Boolean allowNegativeInventory;
    private String planMethod;
    private String planStrategy;
    private String planStrategy_Name;
    private Boolean keySubPart;
    private Boolean bindCarrier;
    private String purpose;
    private Boolean utility;
    private String supplyDemandPolicy;
    private Long fixedLeadTime;
    private String batchPolicy;
    private String supplyType;
    private String produceDepartment;
    private String produceDepartment_Name;
    private String manufacturePlanner;
    private String manufacturePlanner_Name;
    private String engineeringDrawingNo;
    private Long supplyTimes;
    private Long planProduceLimit;
    private Boolean weigh;
    private String valueManageType;
    private String costValuation;
    private Boolean checkByCost;
    @JsonProperty(value="fNoTaxCostPrice")
    private Long fNoTaxCostPrice;
    private Boolean checkByBatch;
    private Boolean accountingByItem;
    private Boolean materialCost;
    private String isCheckFree;
    private String saleStyle;
    private Long salePoints;
    @JsonProperty(value="lInventoryCount")
    private Long lInventoryCount;
    @JsonProperty(value="iBaseSaleCount")
    private Long iBaseSaleCount;
    private String dlyFeeRuleId;
    private String dlyFeeRuleId_Name;
    private IpassMultilingual metaDescription;
    private Boolean enableSubscribe;
    private Boolean enableDeposit;
    private String depositDealPayType;
    private Long deposits;
    private Long depositPercentage;
    private String enablemodifyDeposit;
    private Long minimumDeposits;
    private String depositPayType;
    private Long serviceDuration;
    private String serviceDurationUnit;
    private Boolean canOrder;
    private Boolean onlyOrder;
    private String orderAdvanceTime;
    @JsonProperty(value="iEnableCyclePurchase")
    private Boolean iEnableCyclePurchase;
    @JsonProperty(value="fSettleAccountsRate")
    private Long fSettleAccountsRate;
    private Boolean isAllArea;
    @JsonProperty(value="iEnableEcontract")
    private Boolean iEnableEcontract;
    private String pageTitle;
    private Boolean isRecommend;
    private IpassMultilingual displayName;
    private IpassMultilingual titleMemo;
    private Boolean allowStorePurchase;
    private Boolean isSaleInOfflineStore;
    private Boolean isPriceChangeAllowed;
    private Boolean isOfflineStoreOrder;
    private Boolean isOfflineStoreReturn;
    private String retailPriceDimension;
    private String deliverQuantityChange;
    private Boolean isProcess;
    private String processType;
    private Boolean isMaterial;
    private Boolean isWeight;
    private String inventoryPlanStrategy;
    private Object productExtendCharacterDef;

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

    public Long getPeriodicalInspectionCycle() {
        return this.periodicalInspectionCycle;
    }

    public String getShortName() {
        return this.shortName;
    }

    public String getMnemonicCode() {
        return this.mnemonicCode;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public String getBusinessAttribute() {
        return this.businessAttribute;
    }

    public String getSaleChannel() {
        return this.saleChannel;
    }

    public String getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public String getId() {
        return this.id;
    }

    public String getPubts() {
        return this.pubts;
    }

    public String getPurchaseUnit() {
        return this.purchaseUnit;
    }

    public String getPurchaseUnit_Code() {
        return this.purchaseUnit_Code;
    }

    public String getPurchaseUnit_Name() {
        return this.purchaseUnit_Name;
    }

    public Long getInspectionUnit() {
        return this.inspectionUnit;
    }

    public String getInspectionUnit_Code() {
        return this.inspectionUnit_Code;
    }

    public String getInspectionUnit_Name() {
        return this.inspectionUnit_Name;
    }

    public Long getPurchasePriceUnit() {
        return this.purchasePriceUnit;
    }

    public String getPurchasePriceUnit_Code() {
        return this.purchasePriceUnit_Code;
    }

    public String getPurchasePriceUnit_Name() {
        return this.purchasePriceUnit_Name;
    }

    public String getStockUnit() {
        return this.stockUnit;
    }

    public String getStockUnit_Code() {
        return this.stockUnit_Code;
    }

    public String getStockUnit_Name() {
        return this.stockUnit_Name;
    }

    public String getProduceUnit() {
        return this.produceUnit;
    }

    public String getProduceUnit_Code() {
        return this.produceUnit_Code;
    }

    public String getProduceUnit_Name() {
        return this.produceUnit_Name;
    }

    public String getBatchPriceUnit() {
        return this.batchPriceUnit;
    }

    public String getBatchPriceUnit_Code() {
        return this.batchPriceUnit_Code;
    }

    public String getBatchPriceUnit_Name() {
        return this.batchPriceUnit_Name;
    }

    public String getBatchUnit() {
        return this.batchUnit;
    }

    public String getBatchUnit_Code() {
        return this.batchUnit_Code;
    }

    public String getBatchUnit_Name() {
        return this.batchUnit_Name;
    }

    public String getOnlineUnit() {
        return this.onlineUnit;
    }

    public String getOnlineUnit_Code() {
        return this.onlineUnit_Code;
    }

    public String getOnlineUnit_Name() {
        return this.onlineUnit_Name;
    }

    public String getOfflineUnit() {
        return this.offlineUnit;
    }

    public String getOfflineUnit_Code() {
        return this.offlineUnit_Code;
    }

    public String getOfflineUnit_Name() {
        return this.offlineUnit_Name;
    }

    public String getRequireUnit() {
        return this.requireUnit;
    }

    public String getRequireUnit_Code() {
        return this.requireUnit_Code;
    }

    public String getRequireUnit_Name() {
        return this.requireUnit_Name;
    }

    public Long getBatchPrice() {
        return this.batchPrice;
    }

    public Long getFMarkPrice() {
        return this.fMarkPrice;
    }

    public Long getFLowestMarkPrice() {
        return this.fLowestMarkPrice;
    }

    public Long getFSalePrice() {
        return this.fSalePrice;
    }

    public Long getFMarketPrice() {
        return this.fMarketPrice;
    }

    public Boolean getIsDisplayPrice() {
        return this.isDisplayPrice;
    }

    public String getPriceAreaMessage() {
        return this.priceAreaMessage;
    }

    public IpassMultilingual getReceiptName() {
        return this.receiptName;
    }

    public String getInTaxrate() {
        return this.inTaxrate;
    }

    public String getInTaxrate_Code() {
        return this.inTaxrate_Code;
    }

    public Long getInTaxrate_Name() {
        return this.inTaxrate_Name;
    }

    public String getOutTaxrate() {
        return this.outTaxrate;
    }

    public String getOutTaxrate_Code() {
        return this.outTaxrate_Code;
    }

    public Long getOutTaxrate_Name() {
        return this.outTaxrate_Name;
    }

    public String getPreferentialPolicyType() {
        return this.preferentialPolicyType;
    }

    public String getPreferentialPolicyType_Name() {
        return this.preferentialPolicyType_Name;
    }

    public Long getIOrder() {
        return this.iOrder;
    }

    public Boolean getStopstatus() {
        return this.stopstatus;
    }

    public Boolean getIStatus() {
        return this.iStatus;
    }

    public String getMallUpTime() {
        return this.mallUpTime;
    }

    public Boolean getIUOrderStatus() {
        return this.iUOrderStatus;
    }

    public String getUorderUpTime() {
        return this.uorderUpTime;
    }

    public String getProductVendor() {
        return this.productVendor;
    }

    public String getProductVendor_Name() {
        return this.productVendor_Name;
    }

    public String getProductBuyer() {
        return this.productBuyer;
    }

    public String getProductBuyer_Name() {
        return this.productBuyer_Name;
    }

    public Long getFPrimeCosts() {
        return this.fPrimeCosts;
    }

    public Long getMaxPrimeCosts() {
        return this.maxPrimeCosts;
    }

    public Long getRequestOrderLimit() {
        return this.requestOrderLimit;
    }

    public Boolean getCanSale() {
        return this.canSale;
    }

    public Long getIMinOrderQuantity() {
        return this.iMinOrderQuantity;
    }

    public Long getDeliveryDays() {
        return this.deliveryDays;
    }

    public String getUorderDlyFeeRuleId() {
        return this.uorderDlyFeeRuleId;
    }

    public String getUorderDlyFeeRuleId_Name() {
        return this.uorderDlyFeeRuleId_Name;
    }

    public String getBeUpTime() {
        return this.beUpTime;
    }

    public Boolean getIsBatchManage() {
        return this.isBatchManage;
    }

    public Boolean getIsExpiryDateManage() {
        return this.isExpiryDateManage;
    }

    public Short getIsExpiryDateCalculationMethod() {
        return this.isExpiryDateCalculationMethod;
    }

    public Long getExpireDateNo() {
        return this.expireDateNo;
    }

    public String getExpireDateUnit() {
        return this.expireDateUnit;
    }

    public Long getDaysBeforeValidityReject() {
        return this.daysBeforeValidityReject;
    }

    public Long getValidityWarningDays() {
        return this.validityWarningDays;
    }

    public Boolean getIsSerialNoManage() {
        return this.isSerialNoManage;
    }

    public Boolean getIsBarcodeManage() {
        return this.isBarcodeManage;
    }

    public Long getSafetyStock() {
        return this.safetyStock;
    }

    public Long getHighestStock() {
        return this.highestStock;
    }

    public Long getLowestStock() {
        return this.lowestStock;
    }

    public Long getRopStock() {
        return this.ropStock;
    }

    public String getWarehouseManager() {
        return this.warehouseManager;
    }

    public String getWarehouseManager_Name() {
        return this.warehouseManager_Name;
    }

    public String getDeliveryWarehouse() {
        return this.deliveryWarehouse;
    }

    public String getDeliveryWarehouse_Name() {
        return this.deliveryWarehouse_Name;
    }

    public String getReturnWarehouse() {
        return this.returnWarehouse;
    }

    public String getReturnWarehouse_Name() {
        return this.returnWarehouse_Name;
    }

    public Long getInStoreExcessLimit() {
        return this.inStoreExcessLimit;
    }

    public Long getOutStoreExcessLimit() {
        return this.outStoreExcessLimit;
    }

    public Long getStorageLossRate() {
        return this.storageLossRate;
    }

    public String getPlanDefaultAttribute() {
        return this.planDefaultAttribute;
    }

    public Boolean getAllowNegativeInventory() {
        return this.allowNegativeInventory;
    }

    public String getPlanMethod() {
        return this.planMethod;
    }

    public String getPlanStrategy() {
        return this.planStrategy;
    }

    public String getPlanStrategy_Name() {
        return this.planStrategy_Name;
    }

    public Boolean getKeySubPart() {
        return this.keySubPart;
    }

    public Boolean getBindCarrier() {
        return this.bindCarrier;
    }

    public String getPurpose() {
        return this.purpose;
    }

    public Boolean getUtility() {
        return this.utility;
    }

    public String getSupplyDemandPolicy() {
        return this.supplyDemandPolicy;
    }

    public Long getFixedLeadTime() {
        return this.fixedLeadTime;
    }

    public String getBatchPolicy() {
        return this.batchPolicy;
    }

    public String getSupplyType() {
        return this.supplyType;
    }

    public String getProduceDepartment() {
        return this.produceDepartment;
    }

    public String getProduceDepartment_Name() {
        return this.produceDepartment_Name;
    }

    public String getManufacturePlanner() {
        return this.manufacturePlanner;
    }

    public String getManufacturePlanner_Name() {
        return this.manufacturePlanner_Name;
    }

    public String getEngineeringDrawingNo() {
        return this.engineeringDrawingNo;
    }

    public Long getSupplyTimes() {
        return this.supplyTimes;
    }

    public Long getPlanProduceLimit() {
        return this.planProduceLimit;
    }

    public Boolean getWeigh() {
        return this.weigh;
    }

    public String getValueManageType() {
        return this.valueManageType;
    }

    public String getCostValuation() {
        return this.costValuation;
    }

    public Boolean getCheckByCost() {
        return this.checkByCost;
    }

    public Long getFNoTaxCostPrice() {
        return this.fNoTaxCostPrice;
    }

    public Boolean getCheckByBatch() {
        return this.checkByBatch;
    }

    public Boolean getAccountingByItem() {
        return this.accountingByItem;
    }

    public Boolean getMaterialCost() {
        return this.materialCost;
    }

    public String getIsCheckFree() {
        return this.isCheckFree;
    }

    public String getSaleStyle() {
        return this.saleStyle;
    }

    public Long getSalePoints() {
        return this.salePoints;
    }

    public Long getLInventoryCount() {
        return this.lInventoryCount;
    }

    public Long getIBaseSaleCount() {
        return this.iBaseSaleCount;
    }

    public String getDlyFeeRuleId() {
        return this.dlyFeeRuleId;
    }

    public String getDlyFeeRuleId_Name() {
        return this.dlyFeeRuleId_Name;
    }

    public IpassMultilingual getMetaDescription() {
        return this.metaDescription;
    }

    public Boolean getEnableSubscribe() {
        return this.enableSubscribe;
    }

    public Boolean getEnableDeposit() {
        return this.enableDeposit;
    }

    public String getDepositDealPayType() {
        return this.depositDealPayType;
    }

    public Long getDeposits() {
        return this.deposits;
    }

    public Long getDepositPercentage() {
        return this.depositPercentage;
    }

    public String getEnablemodifyDeposit() {
        return this.enablemodifyDeposit;
    }

    public Long getMinimumDeposits() {
        return this.minimumDeposits;
    }

    public String getDepositPayType() {
        return this.depositPayType;
    }

    public Long getServiceDuration() {
        return this.serviceDuration;
    }

    public String getServiceDurationUnit() {
        return this.serviceDurationUnit;
    }

    public Boolean getCanOrder() {
        return this.canOrder;
    }

    public Boolean getOnlyOrder() {
        return this.onlyOrder;
    }

    public String getOrderAdvanceTime() {
        return this.orderAdvanceTime;
    }

    public Boolean getIEnableCyclePurchase() {
        return this.iEnableCyclePurchase;
    }

    public Long getFSettleAccountsRate() {
        return this.fSettleAccountsRate;
    }

    public Boolean getIsAllArea() {
        return this.isAllArea;
    }

    public Boolean getIEnableEcontract() {
        return this.iEnableEcontract;
    }

    public String getPageTitle() {
        return this.pageTitle;
    }

    public Boolean getIsRecommend() {
        return this.isRecommend;
    }

    public IpassMultilingual getDisplayName() {
        return this.displayName;
    }

    public IpassMultilingual getTitleMemo() {
        return this.titleMemo;
    }

    public Boolean getAllowStorePurchase() {
        return this.allowStorePurchase;
    }

    public Boolean getIsSaleInOfflineStore() {
        return this.isSaleInOfflineStore;
    }

    public Boolean getIsPriceChangeAllowed() {
        return this.isPriceChangeAllowed;
    }

    public Boolean getIsOfflineStoreOrder() {
        return this.isOfflineStoreOrder;
    }

    public Boolean getIsOfflineStoreReturn() {
        return this.isOfflineStoreReturn;
    }

    public String getRetailPriceDimension() {
        return this.retailPriceDimension;
    }

    public String getDeliverQuantityChange() {
        return this.deliverQuantityChange;
    }

    public Boolean getIsProcess() {
        return this.isProcess;
    }

    public String getProcessType() {
        return this.processType;
    }

    public Boolean getIsMaterial() {
        return this.isMaterial;
    }

    public Boolean getIsWeight() {
        return this.isWeight;
    }

    public String getInventoryPlanStrategy() {
        return this.inventoryPlanStrategy;
    }

    public Object getProductExtendCharacterDef() {
        return this.productExtendCharacterDef;
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

    public void setPeriodicalInspectionCycle(Long periodicalInspectionCycle) {
        this.periodicalInspectionCycle = periodicalInspectionCycle;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setBusinessAttribute(String businessAttribute) {
        this.businessAttribute = businessAttribute;
    }

    public void setSaleChannel(String saleChannel) {
        this.saleChannel = saleChannel;
    }

    public void setProductApplyRangeId(String productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setPurchaseUnit(String purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

    public void setPurchaseUnit_Code(String purchaseUnit_Code) {
        this.purchaseUnit_Code = purchaseUnit_Code;
    }

    public void setPurchaseUnit_Name(String purchaseUnit_Name) {
        this.purchaseUnit_Name = purchaseUnit_Name;
    }

    public void setInspectionUnit(Long inspectionUnit) {
        this.inspectionUnit = inspectionUnit;
    }

    public void setInspectionUnit_Code(String inspectionUnit_Code) {
        this.inspectionUnit_Code = inspectionUnit_Code;
    }

    public void setInspectionUnit_Name(String inspectionUnit_Name) {
        this.inspectionUnit_Name = inspectionUnit_Name;
    }

    public void setPurchasePriceUnit(Long purchasePriceUnit) {
        this.purchasePriceUnit = purchasePriceUnit;
    }

    public void setPurchasePriceUnit_Code(String purchasePriceUnit_Code) {
        this.purchasePriceUnit_Code = purchasePriceUnit_Code;
    }

    public void setPurchasePriceUnit_Name(String purchasePriceUnit_Name) {
        this.purchasePriceUnit_Name = purchasePriceUnit_Name;
    }

    public void setStockUnit(String stockUnit) {
        this.stockUnit = stockUnit;
    }

    public void setStockUnit_Code(String stockUnit_Code) {
        this.stockUnit_Code = stockUnit_Code;
    }

    public void setStockUnit_Name(String stockUnit_Name) {
        this.stockUnit_Name = stockUnit_Name;
    }

    public void setProduceUnit(String produceUnit) {
        this.produceUnit = produceUnit;
    }

    public void setProduceUnit_Code(String produceUnit_Code) {
        this.produceUnit_Code = produceUnit_Code;
    }

    public void setProduceUnit_Name(String produceUnit_Name) {
        this.produceUnit_Name = produceUnit_Name;
    }

    public void setBatchPriceUnit(String batchPriceUnit) {
        this.batchPriceUnit = batchPriceUnit;
    }

    public void setBatchPriceUnit_Code(String batchPriceUnit_Code) {
        this.batchPriceUnit_Code = batchPriceUnit_Code;
    }

    public void setBatchPriceUnit_Name(String batchPriceUnit_Name) {
        this.batchPriceUnit_Name = batchPriceUnit_Name;
    }

    public void setBatchUnit(String batchUnit) {
        this.batchUnit = batchUnit;
    }

    public void setBatchUnit_Code(String batchUnit_Code) {
        this.batchUnit_Code = batchUnit_Code;
    }

    public void setBatchUnit_Name(String batchUnit_Name) {
        this.batchUnit_Name = batchUnit_Name;
    }

    public void setOnlineUnit(String onlineUnit) {
        this.onlineUnit = onlineUnit;
    }

    public void setOnlineUnit_Code(String onlineUnit_Code) {
        this.onlineUnit_Code = onlineUnit_Code;
    }

    public void setOnlineUnit_Name(String onlineUnit_Name) {
        this.onlineUnit_Name = onlineUnit_Name;
    }

    public void setOfflineUnit(String offlineUnit) {
        this.offlineUnit = offlineUnit;
    }

    public void setOfflineUnit_Code(String offlineUnit_Code) {
        this.offlineUnit_Code = offlineUnit_Code;
    }

    public void setOfflineUnit_Name(String offlineUnit_Name) {
        this.offlineUnit_Name = offlineUnit_Name;
    }

    public void setRequireUnit(String requireUnit) {
        this.requireUnit = requireUnit;
    }

    public void setRequireUnit_Code(String requireUnit_Code) {
        this.requireUnit_Code = requireUnit_Code;
    }

    public void setRequireUnit_Name(String requireUnit_Name) {
        this.requireUnit_Name = requireUnit_Name;
    }

    public void setBatchPrice(Long batchPrice) {
        this.batchPrice = batchPrice;
    }

    @JsonProperty(value="fMarkPrice")
    public void setFMarkPrice(Long fMarkPrice) {
        this.fMarkPrice = fMarkPrice;
    }

    @JsonProperty(value="fLowestMarkPrice")
    public void setFLowestMarkPrice(Long fLowestMarkPrice) {
        this.fLowestMarkPrice = fLowestMarkPrice;
    }

    @JsonProperty(value="fSalePrice")
    public void setFSalePrice(Long fSalePrice) {
        this.fSalePrice = fSalePrice;
    }

    @JsonProperty(value="fMarketPrice")
    public void setFMarketPrice(Long fMarketPrice) {
        this.fMarketPrice = fMarketPrice;
    }

    public void setIsDisplayPrice(Boolean isDisplayPrice) {
        this.isDisplayPrice = isDisplayPrice;
    }

    public void setPriceAreaMessage(String priceAreaMessage) {
        this.priceAreaMessage = priceAreaMessage;
    }

    public void setReceiptName(IpassMultilingual receiptName) {
        this.receiptName = receiptName;
    }

    public void setInTaxrate(String inTaxrate) {
        this.inTaxrate = inTaxrate;
    }

    public void setInTaxrate_Code(String inTaxrate_Code) {
        this.inTaxrate_Code = inTaxrate_Code;
    }

    public void setInTaxrate_Name(Long inTaxrate_Name) {
        this.inTaxrate_Name = inTaxrate_Name;
    }

    public void setOutTaxrate(String outTaxrate) {
        this.outTaxrate = outTaxrate;
    }

    public void setOutTaxrate_Code(String outTaxrate_Code) {
        this.outTaxrate_Code = outTaxrate_Code;
    }

    public void setOutTaxrate_Name(Long outTaxrate_Name) {
        this.outTaxrate_Name = outTaxrate_Name;
    }

    public void setPreferentialPolicyType(String preferentialPolicyType) {
        this.preferentialPolicyType = preferentialPolicyType;
    }

    public void setPreferentialPolicyType_Name(String preferentialPolicyType_Name) {
        this.preferentialPolicyType_Name = preferentialPolicyType_Name;
    }

    @JsonProperty(value="iOrder")
    public void setIOrder(Long iOrder) {
        this.iOrder = iOrder;
    }

    @JsonProperty(value="stopstatus")
    public void setStopstatus(Boolean stopstatus) {
        this.stopstatus = stopstatus;
    }

    @JsonProperty(value="iStatus")
    public void setIStatus(Boolean iStatus) {
        this.iStatus = iStatus;
    }

    public void setMallUpTime(String mallUpTime) {
        this.mallUpTime = mallUpTime;
    }

    @JsonProperty(value="iUOrderStatus")
    public void setIUOrderStatus(Boolean iUOrderStatus) {
        this.iUOrderStatus = iUOrderStatus;
    }

    public void setUorderUpTime(String uorderUpTime) {
        this.uorderUpTime = uorderUpTime;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public void setProductVendor_Name(String productVendor_Name) {
        this.productVendor_Name = productVendor_Name;
    }

    public void setProductBuyer(String productBuyer) {
        this.productBuyer = productBuyer;
    }

    public void setProductBuyer_Name(String productBuyer_Name) {
        this.productBuyer_Name = productBuyer_Name;
    }

    @JsonProperty(value="fPrimeCosts")
    public void setFPrimeCosts(Long fPrimeCosts) {
        this.fPrimeCosts = fPrimeCosts;
    }

    public void setMaxPrimeCosts(Long maxPrimeCosts) {
        this.maxPrimeCosts = maxPrimeCosts;
    }

    public void setRequestOrderLimit(Long requestOrderLimit) {
        this.requestOrderLimit = requestOrderLimit;
    }

    public void setCanSale(Boolean canSale) {
        this.canSale = canSale;
    }

    @JsonProperty(value="iMinOrderQuantity")
    public void setIMinOrderQuantity(Long iMinOrderQuantity) {
        this.iMinOrderQuantity = iMinOrderQuantity;
    }

    public void setDeliveryDays(Long deliveryDays) {
        this.deliveryDays = deliveryDays;
    }

    public void setUorderDlyFeeRuleId(String uorderDlyFeeRuleId) {
        this.uorderDlyFeeRuleId = uorderDlyFeeRuleId;
    }

    public void setUorderDlyFeeRuleId_Name(String uorderDlyFeeRuleId_Name) {
        this.uorderDlyFeeRuleId_Name = uorderDlyFeeRuleId_Name;
    }

    public void setBeUpTime(String beUpTime) {
        this.beUpTime = beUpTime;
    }

    public void setIsBatchManage(Boolean isBatchManage) {
        this.isBatchManage = isBatchManage;
    }

    public void setIsExpiryDateManage(Boolean isExpiryDateManage) {
        this.isExpiryDateManage = isExpiryDateManage;
    }

    public void setIsExpiryDateCalculationMethod(Short isExpiryDateCalculationMethod) {
        this.isExpiryDateCalculationMethod = isExpiryDateCalculationMethod;
    }

    public void setExpireDateNo(Long expireDateNo) {
        this.expireDateNo = expireDateNo;
    }

    public void setExpireDateUnit(String expireDateUnit) {
        this.expireDateUnit = expireDateUnit;
    }

    public void setDaysBeforeValidityReject(Long daysBeforeValidityReject) {
        this.daysBeforeValidityReject = daysBeforeValidityReject;
    }

    public void setValidityWarningDays(Long validityWarningDays) {
        this.validityWarningDays = validityWarningDays;
    }

    public void setIsSerialNoManage(Boolean isSerialNoManage) {
        this.isSerialNoManage = isSerialNoManage;
    }

    public void setIsBarcodeManage(Boolean isBarcodeManage) {
        this.isBarcodeManage = isBarcodeManage;
    }

    public void setSafetyStock(Long safetyStock) {
        this.safetyStock = safetyStock;
    }

    public void setHighestStock(Long highestStock) {
        this.highestStock = highestStock;
    }

    public void setLowestStock(Long lowestStock) {
        this.lowestStock = lowestStock;
    }

    public void setRopStock(Long ropStock) {
        this.ropStock = ropStock;
    }

    public void setWarehouseManager(String warehouseManager) {
        this.warehouseManager = warehouseManager;
    }

    public void setWarehouseManager_Name(String warehouseManager_Name) {
        this.warehouseManager_Name = warehouseManager_Name;
    }

    public void setDeliveryWarehouse(String deliveryWarehouse) {
        this.deliveryWarehouse = deliveryWarehouse;
    }

    public void setDeliveryWarehouse_Name(String deliveryWarehouse_Name) {
        this.deliveryWarehouse_Name = deliveryWarehouse_Name;
    }

    public void setReturnWarehouse(String returnWarehouse) {
        this.returnWarehouse = returnWarehouse;
    }

    public void setReturnWarehouse_Name(String returnWarehouse_Name) {
        this.returnWarehouse_Name = returnWarehouse_Name;
    }

    public void setInStoreExcessLimit(Long inStoreExcessLimit) {
        this.inStoreExcessLimit = inStoreExcessLimit;
    }

    public void setOutStoreExcessLimit(Long outStoreExcessLimit) {
        this.outStoreExcessLimit = outStoreExcessLimit;
    }

    public void setStorageLossRate(Long storageLossRate) {
        this.storageLossRate = storageLossRate;
    }

    public void setPlanDefaultAttribute(String planDefaultAttribute) {
        this.planDefaultAttribute = planDefaultAttribute;
    }

    public void setAllowNegativeInventory(Boolean allowNegativeInventory) {
        this.allowNegativeInventory = allowNegativeInventory;
    }

    public void setPlanMethod(String planMethod) {
        this.planMethod = planMethod;
    }

    public void setPlanStrategy(String planStrategy) {
        this.planStrategy = planStrategy;
    }

    public void setPlanStrategy_Name(String planStrategy_Name) {
        this.planStrategy_Name = planStrategy_Name;
    }

    public void setKeySubPart(Boolean keySubPart) {
        this.keySubPart = keySubPart;
    }

    public void setBindCarrier(Boolean bindCarrier) {
        this.bindCarrier = bindCarrier;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public void setUtility(Boolean utility) {
        this.utility = utility;
    }

    public void setSupplyDemandPolicy(String supplyDemandPolicy) {
        this.supplyDemandPolicy = supplyDemandPolicy;
    }

    public void setFixedLeadTime(Long fixedLeadTime) {
        this.fixedLeadTime = fixedLeadTime;
    }

    public void setBatchPolicy(String batchPolicy) {
        this.batchPolicy = batchPolicy;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    public void setProduceDepartment(String produceDepartment) {
        this.produceDepartment = produceDepartment;
    }

    public void setProduceDepartment_Name(String produceDepartment_Name) {
        this.produceDepartment_Name = produceDepartment_Name;
    }

    public void setManufacturePlanner(String manufacturePlanner) {
        this.manufacturePlanner = manufacturePlanner;
    }

    public void setManufacturePlanner_Name(String manufacturePlanner_Name) {
        this.manufacturePlanner_Name = manufacturePlanner_Name;
    }

    public void setEngineeringDrawingNo(String engineeringDrawingNo) {
        this.engineeringDrawingNo = engineeringDrawingNo;
    }

    public void setSupplyTimes(Long supplyTimes) {
        this.supplyTimes = supplyTimes;
    }

    public void setPlanProduceLimit(Long planProduceLimit) {
        this.planProduceLimit = planProduceLimit;
    }

    public void setWeigh(Boolean weigh) {
        this.weigh = weigh;
    }

    public void setValueManageType(String valueManageType) {
        this.valueManageType = valueManageType;
    }

    public void setCostValuation(String costValuation) {
        this.costValuation = costValuation;
    }

    public void setCheckByCost(Boolean checkByCost) {
        this.checkByCost = checkByCost;
    }

    @JsonProperty(value="fNoTaxCostPrice")
    public void setFNoTaxCostPrice(Long fNoTaxCostPrice) {
        this.fNoTaxCostPrice = fNoTaxCostPrice;
    }

    public void setCheckByBatch(Boolean checkByBatch) {
        this.checkByBatch = checkByBatch;
    }

    public void setAccountingByItem(Boolean accountingByItem) {
        this.accountingByItem = accountingByItem;
    }

    public void setMaterialCost(Boolean materialCost) {
        this.materialCost = materialCost;
    }

    public void setIsCheckFree(String isCheckFree) {
        this.isCheckFree = isCheckFree;
    }

    public void setSaleStyle(String saleStyle) {
        this.saleStyle = saleStyle;
    }

    public void setSalePoints(Long salePoints) {
        this.salePoints = salePoints;
    }

    @JsonProperty(value="lInventoryCount")
    public void setLInventoryCount(Long lInventoryCount) {
        this.lInventoryCount = lInventoryCount;
    }

    @JsonProperty(value="iBaseSaleCount")
    public void setIBaseSaleCount(Long iBaseSaleCount) {
        this.iBaseSaleCount = iBaseSaleCount;
    }

    public void setDlyFeeRuleId(String dlyFeeRuleId) {
        this.dlyFeeRuleId = dlyFeeRuleId;
    }

    public void setDlyFeeRuleId_Name(String dlyFeeRuleId_Name) {
        this.dlyFeeRuleId_Name = dlyFeeRuleId_Name;
    }

    public void setMetaDescription(IpassMultilingual metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setEnableSubscribe(Boolean enableSubscribe) {
        this.enableSubscribe = enableSubscribe;
    }

    public void setEnableDeposit(Boolean enableDeposit) {
        this.enableDeposit = enableDeposit;
    }

    public void setDepositDealPayType(String depositDealPayType) {
        this.depositDealPayType = depositDealPayType;
    }

    public void setDeposits(Long deposits) {
        this.deposits = deposits;
    }

    public void setDepositPercentage(Long depositPercentage) {
        this.depositPercentage = depositPercentage;
    }

    public void setEnablemodifyDeposit(String enablemodifyDeposit) {
        this.enablemodifyDeposit = enablemodifyDeposit;
    }

    public void setMinimumDeposits(Long minimumDeposits) {
        this.minimumDeposits = minimumDeposits;
    }

    public void setDepositPayType(String depositPayType) {
        this.depositPayType = depositPayType;
    }

    public void setServiceDuration(Long serviceDuration) {
        this.serviceDuration = serviceDuration;
    }

    public void setServiceDurationUnit(String serviceDurationUnit) {
        this.serviceDurationUnit = serviceDurationUnit;
    }

    public void setCanOrder(Boolean canOrder) {
        this.canOrder = canOrder;
    }

    public void setOnlyOrder(Boolean onlyOrder) {
        this.onlyOrder = onlyOrder;
    }

    public void setOrderAdvanceTime(String orderAdvanceTime) {
        this.orderAdvanceTime = orderAdvanceTime;
    }

    @JsonProperty(value="iEnableCyclePurchase")
    public void setIEnableCyclePurchase(Boolean iEnableCyclePurchase) {
        this.iEnableCyclePurchase = iEnableCyclePurchase;
    }

    @JsonProperty(value="fSettleAccountsRate")
    public void setFSettleAccountsRate(Long fSettleAccountsRate) {
        this.fSettleAccountsRate = fSettleAccountsRate;
    }

    public void setIsAllArea(Boolean isAllArea) {
        this.isAllArea = isAllArea;
    }

    @JsonProperty(value="iEnableEcontract")
    public void setIEnableEcontract(Boolean iEnableEcontract) {
        this.iEnableEcontract = iEnableEcontract;
    }

    public void setPageTitle(String pageTitle) {
        this.pageTitle = pageTitle;
    }

    public void setIsRecommend(Boolean isRecommend) {
        this.isRecommend = isRecommend;
    }

    public void setDisplayName(IpassMultilingual displayName) {
        this.displayName = displayName;
    }

    public void setTitleMemo(IpassMultilingual titleMemo) {
        this.titleMemo = titleMemo;
    }

    public void setAllowStorePurchase(Boolean allowStorePurchase) {
        this.allowStorePurchase = allowStorePurchase;
    }

    public void setIsSaleInOfflineStore(Boolean isSaleInOfflineStore) {
        this.isSaleInOfflineStore = isSaleInOfflineStore;
    }

    public void setIsPriceChangeAllowed(Boolean isPriceChangeAllowed) {
        this.isPriceChangeAllowed = isPriceChangeAllowed;
    }

    public void setIsOfflineStoreOrder(Boolean isOfflineStoreOrder) {
        this.isOfflineStoreOrder = isOfflineStoreOrder;
    }

    public void setIsOfflineStoreReturn(Boolean isOfflineStoreReturn) {
        this.isOfflineStoreReturn = isOfflineStoreReturn;
    }

    public void setRetailPriceDimension(String retailPriceDimension) {
        this.retailPriceDimension = retailPriceDimension;
    }

    public void setDeliverQuantityChange(String deliverQuantityChange) {
        this.deliverQuantityChange = deliverQuantityChange;
    }

    public void setIsProcess(Boolean isProcess) {
        this.isProcess = isProcess;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public void setIsMaterial(Boolean isMaterial) {
        this.isMaterial = isMaterial;
    }

    public void setIsWeight(Boolean isWeight) {
        this.isWeight = isWeight;
    }

    public void setInventoryPlanStrategy(String inventoryPlanStrategy) {
        this.inventoryPlanStrategy = inventoryPlanStrategy;
    }

    public void setProductExtendCharacterDef(Object productExtendCharacterDef) {
        this.productExtendCharacterDef = productExtendCharacterDef;
    }

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object o) {
        void other$productExtendCharacterDef;
        void this$productExtendCharacterDef;
        void other$inventoryPlanStrategy;
        void this$inventoryPlanStrategy;
        void other$processType;
        void this$processType;
        void other$deliverQuantityChange;
        void this$deliverQuantityChange;
        void other$retailPriceDimension;
        void this$retailPriceDimension;
        void other$titleMemo;
        void this$titleMemo;
        void other$displayName;
        void this$displayName;
        void other$pageTitle;
        void this$pageTitle;
        void other$orderAdvanceTime;
        void this$orderAdvanceTime;
        void other$serviceDurationUnit;
        void this$serviceDurationUnit;
        void other$depositPayType;
        void this$depositPayType;
        void other$enablemodifyDeposit;
        void this$enablemodifyDeposit;
        void other$depositDealPayType;
        void this$depositDealPayType;
        void other$metaDescription;
        void this$metaDescription;
        void other$dlyFeeRuleId_Name;
        void this$dlyFeeRuleId_Name;
        void other$dlyFeeRuleId;
        void this$dlyFeeRuleId;
        void other$saleStyle;
        void this$saleStyle;
        void other$isCheckFree;
        void this$isCheckFree;
        void other$costValuation;
        void this$costValuation;
        void other$valueManageType;
        void this$valueManageType;
        void other$engineeringDrawingNo;
        void this$engineeringDrawingNo;
        void other$manufacturePlanner_Name;
        void this$manufacturePlanner_Name;
        void other$manufacturePlanner;
        void this$manufacturePlanner;
        void other$produceDepartment_Name;
        void this$produceDepartment_Name;
        void other$produceDepartment;
        void this$produceDepartment;
        void other$supplyType;
        void this$supplyType;
        void other$batchPolicy;
        void this$batchPolicy;
        void other$supplyDemandPolicy;
        void this$supplyDemandPolicy;
        void other$purpose;
        void this$purpose;
        void other$planStrategy_Name;
        void this$planStrategy_Name;
        void other$planStrategy;
        void this$planStrategy;
        void other$planMethod;
        void this$planMethod;
        void other$planDefaultAttribute;
        void this$planDefaultAttribute;
        void other$returnWarehouse_Name;
        void this$returnWarehouse_Name;
        void other$returnWarehouse;
        void this$returnWarehouse;
        void other$deliveryWarehouse_Name;
        void this$deliveryWarehouse_Name;
        void other$deliveryWarehouse;
        void this$deliveryWarehouse;
        void other$warehouseManager_Name;
        void this$warehouseManager_Name;
        void other$warehouseManager;
        void this$warehouseManager;
        void other$expireDateUnit;
        void this$expireDateUnit;
        void other$beUpTime;
        void this$beUpTime;
        void other$uorderDlyFeeRuleId_Name;
        void this$uorderDlyFeeRuleId_Name;
        void other$uorderDlyFeeRuleId;
        void this$uorderDlyFeeRuleId;
        void other$productBuyer_Name;
        void this$productBuyer_Name;
        void other$productBuyer;
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductDetailIPass)) {
            return false;
        }
        ProductDetailIPass other = (ProductDetailIPass)o;
        if (!other.canEqual(this)) {
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
        Long this$periodicalInspectionCycle = this.getPeriodicalInspectionCycle();
        Long other$periodicalInspectionCycle = other.getPeriodicalInspectionCycle();
        if (this$periodicalInspectionCycle == null ? other$periodicalInspectionCycle != null : !((Object)this$periodicalInspectionCycle).equals(other$periodicalInspectionCycle)) {
            return false;
        }
        Long this$inspectionUnit = this.getInspectionUnit();
        Long other$inspectionUnit = other.getInspectionUnit();
        if (this$inspectionUnit == null ? other$inspectionUnit != null : !((Object)this$inspectionUnit).equals(other$inspectionUnit)) {
            return false;
        }
        Long this$purchasePriceUnit = this.getPurchasePriceUnit();
        Long other$purchasePriceUnit = other.getPurchasePriceUnit();
        if (this$purchasePriceUnit == null ? other$purchasePriceUnit != null : !((Object)this$purchasePriceUnit).equals(other$purchasePriceUnit)) {
            return false;
        }
        Long this$batchPrice = this.getBatchPrice();
        Long other$batchPrice = other.getBatchPrice();
        if (this$batchPrice == null ? other$batchPrice != null : !((Object)this$batchPrice).equals(other$batchPrice)) {
            return false;
        }
        Long this$fMarkPrice = this.getFMarkPrice();
        Long other$fMarkPrice = other.getFMarkPrice();
        if (this$fMarkPrice == null ? other$fMarkPrice != null : !((Object)this$fMarkPrice).equals(other$fMarkPrice)) {
            return false;
        }
        Long this$fLowestMarkPrice = this.getFLowestMarkPrice();
        Long other$fLowestMarkPrice = other.getFLowestMarkPrice();
        if (this$fLowestMarkPrice == null ? other$fLowestMarkPrice != null : !((Object)this$fLowestMarkPrice).equals(other$fLowestMarkPrice)) {
            return false;
        }
        Long this$fSalePrice = this.getFSalePrice();
        Long other$fSalePrice = other.getFSalePrice();
        if (this$fSalePrice == null ? other$fSalePrice != null : !((Object)this$fSalePrice).equals(other$fSalePrice)) {
            return false;
        }
        Long this$fMarketPrice = this.getFMarketPrice();
        Long other$fMarketPrice = other.getFMarketPrice();
        if (this$fMarketPrice == null ? other$fMarketPrice != null : !((Object)this$fMarketPrice).equals(other$fMarketPrice)) {
            return false;
        }
        Boolean this$isDisplayPrice = this.getIsDisplayPrice();
        Boolean other$isDisplayPrice = other.getIsDisplayPrice();
        if (this$isDisplayPrice == null ? other$isDisplayPrice != null : !((Object)this$isDisplayPrice).equals(other$isDisplayPrice)) {
            return false;
        }
        Long this$inTaxrate_Name = this.getInTaxrate_Name();
        Long other$inTaxrate_Name = other.getInTaxrate_Name();
        if (this$inTaxrate_Name == null ? other$inTaxrate_Name != null : !((Object)this$inTaxrate_Name).equals(other$inTaxrate_Name)) {
            return false;
        }
        Long this$outTaxrate_Name = this.getOutTaxrate_Name();
        Long other$outTaxrate_Name = other.getOutTaxrate_Name();
        if (this$outTaxrate_Name == null ? other$outTaxrate_Name != null : !((Object)this$outTaxrate_Name).equals(other$outTaxrate_Name)) {
            return false;
        }
        Long this$iOrder = this.getIOrder();
        Long other$iOrder = other.getIOrder();
        if (this$iOrder == null ? other$iOrder != null : !((Object)this$iOrder).equals(other$iOrder)) {
            return false;
        }
        Boolean this$stopstatus = this.getStopstatus();
        Boolean other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
            return false;
        }
        Boolean this$iStatus = this.getIStatus();
        Boolean other$iStatus = other.getIStatus();
        if (this$iStatus == null ? other$iStatus != null : !((Object)this$iStatus).equals(other$iStatus)) {
            return false;
        }
        Boolean this$iUOrderStatus = this.getIUOrderStatus();
        Boolean other$iUOrderStatus = other.getIUOrderStatus();
        if (this$iUOrderStatus == null ? other$iUOrderStatus != null : !((Object)this$iUOrderStatus).equals(other$iUOrderStatus)) {
            return false;
        }
        Long this$fPrimeCosts = this.getFPrimeCosts();
        Long other$fPrimeCosts = other.getFPrimeCosts();
        if (this$fPrimeCosts == null ? other$fPrimeCosts != null : !((Object)this$fPrimeCosts).equals(other$fPrimeCosts)) {
            return false;
        }
        Long this$maxPrimeCosts = this.getMaxPrimeCosts();
        Long other$maxPrimeCosts = other.getMaxPrimeCosts();
        if (this$maxPrimeCosts == null ? other$maxPrimeCosts != null : !((Object)this$maxPrimeCosts).equals(other$maxPrimeCosts)) {
            return false;
        }
        Long this$requestOrderLimit = this.getRequestOrderLimit();
        Long other$requestOrderLimit = other.getRequestOrderLimit();
        if (this$requestOrderLimit == null ? other$requestOrderLimit != null : !((Object)this$requestOrderLimit).equals(other$requestOrderLimit)) {
            return false;
        }
        Boolean this$canSale = this.getCanSale();
        Boolean other$canSale = other.getCanSale();
        if (this$canSale == null ? other$canSale != null : !((Object)this$canSale).equals(other$canSale)) {
            return false;
        }
        Long this$iMinOrderQuantity = this.getIMinOrderQuantity();
        Long other$iMinOrderQuantity = other.getIMinOrderQuantity();
        if (this$iMinOrderQuantity == null ? other$iMinOrderQuantity != null : !((Object)this$iMinOrderQuantity).equals(other$iMinOrderQuantity)) {
            return false;
        }
        Long this$deliveryDays = this.getDeliveryDays();
        Long other$deliveryDays = other.getDeliveryDays();
        if (this$deliveryDays == null ? other$deliveryDays != null : !((Object)this$deliveryDays).equals(other$deliveryDays)) {
            return false;
        }
        Boolean this$isBatchManage = this.getIsBatchManage();
        Boolean other$isBatchManage = other.getIsBatchManage();
        if (this$isBatchManage == null ? other$isBatchManage != null : !((Object)this$isBatchManage).equals(other$isBatchManage)) {
            return false;
        }
        Boolean this$isExpiryDateManage = this.getIsExpiryDateManage();
        Boolean other$isExpiryDateManage = other.getIsExpiryDateManage();
        if (this$isExpiryDateManage == null ? other$isExpiryDateManage != null : !((Object)this$isExpiryDateManage).equals(other$isExpiryDateManage)) {
            return false;
        }
        Short this$isExpiryDateCalculationMethod = this.getIsExpiryDateCalculationMethod();
        Short other$isExpiryDateCalculationMethod = other.getIsExpiryDateCalculationMethod();
        if (this$isExpiryDateCalculationMethod == null ? other$isExpiryDateCalculationMethod != null : !((Object)this$isExpiryDateCalculationMethod).equals(other$isExpiryDateCalculationMethod)) {
            return false;
        }
        Long this$expireDateNo = this.getExpireDateNo();
        Long other$expireDateNo = other.getExpireDateNo();
        if (this$expireDateNo == null ? other$expireDateNo != null : !((Object)this$expireDateNo).equals(other$expireDateNo)) {
            return false;
        }
        Long this$daysBeforeValidityReject = this.getDaysBeforeValidityReject();
        Long other$daysBeforeValidityReject = other.getDaysBeforeValidityReject();
        if (this$daysBeforeValidityReject == null ? other$daysBeforeValidityReject != null : !((Object)this$daysBeforeValidityReject).equals(other$daysBeforeValidityReject)) {
            return false;
        }
        Long this$validityWarningDays = this.getValidityWarningDays();
        Long other$validityWarningDays = other.getValidityWarningDays();
        if (this$validityWarningDays == null ? other$validityWarningDays != null : !((Object)this$validityWarningDays).equals(other$validityWarningDays)) {
            return false;
        }
        Boolean this$isSerialNoManage = this.getIsSerialNoManage();
        Boolean other$isSerialNoManage = other.getIsSerialNoManage();
        if (this$isSerialNoManage == null ? other$isSerialNoManage != null : !((Object)this$isSerialNoManage).equals(other$isSerialNoManage)) {
            return false;
        }
        Boolean this$isBarcodeManage = this.getIsBarcodeManage();
        Boolean other$isBarcodeManage = other.getIsBarcodeManage();
        if (this$isBarcodeManage == null ? other$isBarcodeManage != null : !((Object)this$isBarcodeManage).equals(other$isBarcodeManage)) {
            return false;
        }
        Long this$safetyStock = this.getSafetyStock();
        Long other$safetyStock = other.getSafetyStock();
        if (this$safetyStock == null ? other$safetyStock != null : !((Object)this$safetyStock).equals(other$safetyStock)) {
            return false;
        }
        Long this$highestStock = this.getHighestStock();
        Long other$highestStock = other.getHighestStock();
        if (this$highestStock == null ? other$highestStock != null : !((Object)this$highestStock).equals(other$highestStock)) {
            return false;
        }
        Long this$lowestStock = this.getLowestStock();
        Long other$lowestStock = other.getLowestStock();
        if (this$lowestStock == null ? other$lowestStock != null : !((Object)this$lowestStock).equals(other$lowestStock)) {
            return false;
        }
        Long this$ropStock = this.getRopStock();
        Long other$ropStock = other.getRopStock();
        if (this$ropStock == null ? other$ropStock != null : !((Object)this$ropStock).equals(other$ropStock)) {
            return false;
        }
        Long this$inStoreExcessLimit = this.getInStoreExcessLimit();
        Long other$inStoreExcessLimit = other.getInStoreExcessLimit();
        if (this$inStoreExcessLimit == null ? other$inStoreExcessLimit != null : !((Object)this$inStoreExcessLimit).equals(other$inStoreExcessLimit)) {
            return false;
        }
        Long this$outStoreExcessLimit = this.getOutStoreExcessLimit();
        Long other$outStoreExcessLimit = other.getOutStoreExcessLimit();
        if (this$outStoreExcessLimit == null ? other$outStoreExcessLimit != null : !((Object)this$outStoreExcessLimit).equals(other$outStoreExcessLimit)) {
            return false;
        }
        Long this$storageLossRate = this.getStorageLossRate();
        Long other$storageLossRate = other.getStorageLossRate();
        if (this$storageLossRate == null ? other$storageLossRate != null : !((Object)this$storageLossRate).equals(other$storageLossRate)) {
            return false;
        }
        Boolean this$allowNegativeInventory = this.getAllowNegativeInventory();
        Boolean other$allowNegativeInventory = other.getAllowNegativeInventory();
        if (this$allowNegativeInventory == null ? other$allowNegativeInventory != null : !((Object)this$allowNegativeInventory).equals(other$allowNegativeInventory)) {
            return false;
        }
        Boolean this$keySubPart = this.getKeySubPart();
        Boolean other$keySubPart = other.getKeySubPart();
        if (this$keySubPart == null ? other$keySubPart != null : !((Object)this$keySubPart).equals(other$keySubPart)) {
            return false;
        }
        Boolean this$bindCarrier = this.getBindCarrier();
        Boolean other$bindCarrier = other.getBindCarrier();
        if (this$bindCarrier == null ? other$bindCarrier != null : !((Object)this$bindCarrier).equals(other$bindCarrier)) {
            return false;
        }
        Boolean this$utility = this.getUtility();
        Boolean other$utility = other.getUtility();
        if (this$utility == null ? other$utility != null : !((Object)this$utility).equals(other$utility)) {
            return false;
        }
        Long this$fixedLeadTime = this.getFixedLeadTime();
        Long other$fixedLeadTime = other.getFixedLeadTime();
        if (this$fixedLeadTime == null ? other$fixedLeadTime != null : !((Object)this$fixedLeadTime).equals(other$fixedLeadTime)) {
            return false;
        }
        Long this$supplyTimes = this.getSupplyTimes();
        Long other$supplyTimes = other.getSupplyTimes();
        if (this$supplyTimes == null ? other$supplyTimes != null : !((Object)this$supplyTimes).equals(other$supplyTimes)) {
            return false;
        }
        Long this$planProduceLimit = this.getPlanProduceLimit();
        Long other$planProduceLimit = other.getPlanProduceLimit();
        if (this$planProduceLimit == null ? other$planProduceLimit != null : !((Object)this$planProduceLimit).equals(other$planProduceLimit)) {
            return false;
        }
        Boolean this$weigh = this.getWeigh();
        Boolean other$weigh = other.getWeigh();
        if (this$weigh == null ? other$weigh != null : !((Object)this$weigh).equals(other$weigh)) {
            return false;
        }
        Boolean this$checkByCost = this.getCheckByCost();
        Boolean other$checkByCost = other.getCheckByCost();
        if (this$checkByCost == null ? other$checkByCost != null : !((Object)this$checkByCost).equals(other$checkByCost)) {
            return false;
        }
        Long this$fNoTaxCostPrice = this.getFNoTaxCostPrice();
        Long other$fNoTaxCostPrice = other.getFNoTaxCostPrice();
        if (this$fNoTaxCostPrice == null ? other$fNoTaxCostPrice != null : !((Object)this$fNoTaxCostPrice).equals(other$fNoTaxCostPrice)) {
            return false;
        }
        Boolean this$checkByBatch = this.getCheckByBatch();
        Boolean other$checkByBatch = other.getCheckByBatch();
        if (this$checkByBatch == null ? other$checkByBatch != null : !((Object)this$checkByBatch).equals(other$checkByBatch)) {
            return false;
        }
        Boolean this$accountingByItem = this.getAccountingByItem();
        Boolean other$accountingByItem = other.getAccountingByItem();
        if (this$accountingByItem == null ? other$accountingByItem != null : !((Object)this$accountingByItem).equals(other$accountingByItem)) {
            return false;
        }
        Boolean this$materialCost = this.getMaterialCost();
        Boolean other$materialCost = other.getMaterialCost();
        if (this$materialCost == null ? other$materialCost != null : !((Object)this$materialCost).equals(other$materialCost)) {
            return false;
        }
        Long this$salePoints = this.getSalePoints();
        Long other$salePoints = other.getSalePoints();
        if (this$salePoints == null ? other$salePoints != null : !((Object)this$salePoints).equals(other$salePoints)) {
            return false;
        }
        Long this$lInventoryCount = this.getLInventoryCount();
        Long other$lInventoryCount = other.getLInventoryCount();
        if (this$lInventoryCount == null ? other$lInventoryCount != null : !((Object)this$lInventoryCount).equals(other$lInventoryCount)) {
            return false;
        }
        Long this$iBaseSaleCount = this.getIBaseSaleCount();
        Long other$iBaseSaleCount = other.getIBaseSaleCount();
        if (this$iBaseSaleCount == null ? other$iBaseSaleCount != null : !((Object)this$iBaseSaleCount).equals(other$iBaseSaleCount)) {
            return false;
        }
        Boolean this$enableSubscribe = this.getEnableSubscribe();
        Boolean other$enableSubscribe = other.getEnableSubscribe();
        if (this$enableSubscribe == null ? other$enableSubscribe != null : !((Object)this$enableSubscribe).equals(other$enableSubscribe)) {
            return false;
        }
        Boolean this$enableDeposit = this.getEnableDeposit();
        Boolean other$enableDeposit = other.getEnableDeposit();
        if (this$enableDeposit == null ? other$enableDeposit != null : !((Object)this$enableDeposit).equals(other$enableDeposit)) {
            return false;
        }
        Long this$deposits = this.getDeposits();
        Long other$deposits = other.getDeposits();
        if (this$deposits == null ? other$deposits != null : !((Object)this$deposits).equals(other$deposits)) {
            return false;
        }
        Long this$depositPercentage = this.getDepositPercentage();
        Long other$depositPercentage = other.getDepositPercentage();
        if (this$depositPercentage == null ? other$depositPercentage != null : !((Object)this$depositPercentage).equals(other$depositPercentage)) {
            return false;
        }
        Long this$minimumDeposits = this.getMinimumDeposits();
        Long other$minimumDeposits = other.getMinimumDeposits();
        if (this$minimumDeposits == null ? other$minimumDeposits != null : !((Object)this$minimumDeposits).equals(other$minimumDeposits)) {
            return false;
        }
        Long this$serviceDuration = this.getServiceDuration();
        Long other$serviceDuration = other.getServiceDuration();
        if (this$serviceDuration == null ? other$serviceDuration != null : !((Object)this$serviceDuration).equals(other$serviceDuration)) {
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
        Boolean this$iEnableCyclePurchase = this.getIEnableCyclePurchase();
        Boolean other$iEnableCyclePurchase = other.getIEnableCyclePurchase();
        if (this$iEnableCyclePurchase == null ? other$iEnableCyclePurchase != null : !((Object)this$iEnableCyclePurchase).equals(other$iEnableCyclePurchase)) {
            return false;
        }
        Long this$fSettleAccountsRate = this.getFSettleAccountsRate();
        Long other$fSettleAccountsRate = other.getFSettleAccountsRate();
        if (this$fSettleAccountsRate == null ? other$fSettleAccountsRate != null : !((Object)this$fSettleAccountsRate).equals(other$fSettleAccountsRate)) {
            return false;
        }
        Boolean this$isAllArea = this.getIsAllArea();
        Boolean other$isAllArea = other.getIsAllArea();
        if (this$isAllArea == null ? other$isAllArea != null : !((Object)this$isAllArea).equals(other$isAllArea)) {
            return false;
        }
        Boolean this$iEnableEcontract = this.getIEnableEcontract();
        Boolean other$iEnableEcontract = other.getIEnableEcontract();
        if (this$iEnableEcontract == null ? other$iEnableEcontract != null : !((Object)this$iEnableEcontract).equals(other$iEnableEcontract)) {
            return false;
        }
        Boolean this$isRecommend = this.getIsRecommend();
        Boolean other$isRecommend = other.getIsRecommend();
        if (this$isRecommend == null ? other$isRecommend != null : !((Object)this$isRecommend).equals(other$isRecommend)) {
            return false;
        }
        Boolean this$allowStorePurchase = this.getAllowStorePurchase();
        Boolean other$allowStorePurchase = other.getAllowStorePurchase();
        if (this$allowStorePurchase == null ? other$allowStorePurchase != null : !((Object)this$allowStorePurchase).equals(other$allowStorePurchase)) {
            return false;
        }
        Boolean this$isSaleInOfflineStore = this.getIsSaleInOfflineStore();
        Boolean other$isSaleInOfflineStore = other.getIsSaleInOfflineStore();
        if (this$isSaleInOfflineStore == null ? other$isSaleInOfflineStore != null : !((Object)this$isSaleInOfflineStore).equals(other$isSaleInOfflineStore)) {
            return false;
        }
        Boolean this$isPriceChangeAllowed = this.getIsPriceChangeAllowed();
        Boolean other$isPriceChangeAllowed = other.getIsPriceChangeAllowed();
        if (this$isPriceChangeAllowed == null ? other$isPriceChangeAllowed != null : !((Object)this$isPriceChangeAllowed).equals(other$isPriceChangeAllowed)) {
            return false;
        }
        Boolean this$isOfflineStoreOrder = this.getIsOfflineStoreOrder();
        Boolean other$isOfflineStoreOrder = other.getIsOfflineStoreOrder();
        if (this$isOfflineStoreOrder == null ? other$isOfflineStoreOrder != null : !((Object)this$isOfflineStoreOrder).equals(other$isOfflineStoreOrder)) {
            return false;
        }
        Boolean this$isOfflineStoreReturn = this.getIsOfflineStoreReturn();
        Boolean other$isOfflineStoreReturn = other.getIsOfflineStoreReturn();
        if (this$isOfflineStoreReturn == null ? other$isOfflineStoreReturn != null : !((Object)this$isOfflineStoreReturn).equals(other$isOfflineStoreReturn)) {
            return false;
        }
        Boolean this$isProcess = this.getIsProcess();
        Boolean other$isProcess = other.getIsProcess();
        if (this$isProcess == null ? other$isProcess != null : !((Object)this$isProcess).equals(other$isProcess)) {
            return false;
        }
        Boolean this$isMaterial = this.getIsMaterial();
        Boolean other$isMaterial = other.getIsMaterial();
        if (this$isMaterial == null ? other$isMaterial != null : !((Object)this$isMaterial).equals(other$isMaterial)) {
            return false;
        }
        Boolean this$isWeight = this.getIsWeight();
        Boolean other$isWeight = other.getIsWeight();
        if (this$isWeight == null ? other$isWeight != null : !((Object)this$isWeight).equals(other$isWeight)) {
            return false;
        }
        String this$shortName = this.getShortName();
        String other$shortName = other.getShortName();
        if (this$shortName == null ? other$shortName != null : !this$shortName.equals(other$shortName)) {
            return false;
        }
        String this$mnemonicCode = this.getMnemonicCode();
        String other$mnemonicCode = other.getMnemonicCode();
        if (this$mnemonicCode == null ? other$mnemonicCode != null : !this$mnemonicCode.equals(other$mnemonicCode)) {
            return false;
        }
        String this$barCode = this.getBarCode();
        String other$barCode = other.getBarCode();
        if (this$barCode == null ? other$barCode != null : !this$barCode.equals(other$barCode)) {
            return false;
        }
        String this$businessAttribute = this.getBusinessAttribute();
        String other$businessAttribute = other.getBusinessAttribute();
        if (this$businessAttribute == null ? other$businessAttribute != null : !this$businessAttribute.equals(other$businessAttribute)) {
            return false;
        }
        String this$saleChannel = this.getSaleChannel();
        String other$saleChannel = other.getSaleChannel();
        if (this$saleChannel == null ? other$saleChannel != null : !this$saleChannel.equals(other$saleChannel)) {
            return false;
        }
        String this$productApplyRangeId = this.getProductApplyRangeId();
        String other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !this$productApplyRangeId.equals(other$productApplyRangeId)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts)) {
            return false;
        }
        String this$purchaseUnit = this.getPurchaseUnit();
        String other$purchaseUnit = other.getPurchaseUnit();
        if (this$purchaseUnit == null ? other$purchaseUnit != null : !this$purchaseUnit.equals(other$purchaseUnit)) {
            return false;
        }
        String this$purchaseUnit_Code = this.getPurchaseUnit_Code();
        String other$purchaseUnit_Code = other.getPurchaseUnit_Code();
        if (this$purchaseUnit_Code == null ? other$purchaseUnit_Code != null : !this$purchaseUnit_Code.equals(other$purchaseUnit_Code)) {
            return false;
        }
        String this$purchaseUnit_Name = this.getPurchaseUnit_Name();
        String other$purchaseUnit_Name = other.getPurchaseUnit_Name();
        if (this$purchaseUnit_Name == null ? other$purchaseUnit_Name != null : !this$purchaseUnit_Name.equals(other$purchaseUnit_Name)) {
            return false;
        }
        String this$inspectionUnit_Code = this.getInspectionUnit_Code();
        String other$inspectionUnit_Code = other.getInspectionUnit_Code();
        if (this$inspectionUnit_Code == null ? other$inspectionUnit_Code != null : !this$inspectionUnit_Code.equals(other$inspectionUnit_Code)) {
            return false;
        }
        String this$inspectionUnit_Name = this.getInspectionUnit_Name();
        String other$inspectionUnit_Name = other.getInspectionUnit_Name();
        if (this$inspectionUnit_Name == null ? other$inspectionUnit_Name != null : !this$inspectionUnit_Name.equals(other$inspectionUnit_Name)) {
            return false;
        }
        String this$purchasePriceUnit_Code = this.getPurchasePriceUnit_Code();
        String other$purchasePriceUnit_Code = other.getPurchasePriceUnit_Code();
        if (this$purchasePriceUnit_Code == null ? other$purchasePriceUnit_Code != null : !this$purchasePriceUnit_Code.equals(other$purchasePriceUnit_Code)) {
            return false;
        }
        String this$purchasePriceUnit_Name = this.getPurchasePriceUnit_Name();
        String other$purchasePriceUnit_Name = other.getPurchasePriceUnit_Name();
        if (this$purchasePriceUnit_Name == null ? other$purchasePriceUnit_Name != null : !this$purchasePriceUnit_Name.equals(other$purchasePriceUnit_Name)) {
            return false;
        }
        String this$stockUnit = this.getStockUnit();
        String other$stockUnit = other.getStockUnit();
        if (this$stockUnit == null ? other$stockUnit != null : !this$stockUnit.equals(other$stockUnit)) {
            return false;
        }
        String this$stockUnit_Code = this.getStockUnit_Code();
        String other$stockUnit_Code = other.getStockUnit_Code();
        if (this$stockUnit_Code == null ? other$stockUnit_Code != null : !this$stockUnit_Code.equals(other$stockUnit_Code)) {
            return false;
        }
        String this$stockUnit_Name = this.getStockUnit_Name();
        String other$stockUnit_Name = other.getStockUnit_Name();
        if (this$stockUnit_Name == null ? other$stockUnit_Name != null : !this$stockUnit_Name.equals(other$stockUnit_Name)) {
            return false;
        }
        String this$produceUnit = this.getProduceUnit();
        String other$produceUnit = other.getProduceUnit();
        if (this$produceUnit == null ? other$produceUnit != null : !this$produceUnit.equals(other$produceUnit)) {
            return false;
        }
        String this$produceUnit_Code = this.getProduceUnit_Code();
        String other$produceUnit_Code = other.getProduceUnit_Code();
        if (this$produceUnit_Code == null ? other$produceUnit_Code != null : !this$produceUnit_Code.equals(other$produceUnit_Code)) {
            return false;
        }
        String this$produceUnit_Name = this.getProduceUnit_Name();
        String other$produceUnit_Name = other.getProduceUnit_Name();
        if (this$produceUnit_Name == null ? other$produceUnit_Name != null : !this$produceUnit_Name.equals(other$produceUnit_Name)) {
            return false;
        }
        String this$batchPriceUnit = this.getBatchPriceUnit();
        String other$batchPriceUnit = other.getBatchPriceUnit();
        if (this$batchPriceUnit == null ? other$batchPriceUnit != null : !this$batchPriceUnit.equals(other$batchPriceUnit)) {
            return false;
        }
        String this$batchPriceUnit_Code = this.getBatchPriceUnit_Code();
        String other$batchPriceUnit_Code = other.getBatchPriceUnit_Code();
        if (this$batchPriceUnit_Code == null ? other$batchPriceUnit_Code != null : !this$batchPriceUnit_Code.equals(other$batchPriceUnit_Code)) {
            return false;
        }
        String this$batchPriceUnit_Name = this.getBatchPriceUnit_Name();
        String other$batchPriceUnit_Name = other.getBatchPriceUnit_Name();
        if (this$batchPriceUnit_Name == null ? other$batchPriceUnit_Name != null : !this$batchPriceUnit_Name.equals(other$batchPriceUnit_Name)) {
            return false;
        }
        String this$batchUnit = this.getBatchUnit();
        String other$batchUnit = other.getBatchUnit();
        if (this$batchUnit == null ? other$batchUnit != null : !this$batchUnit.equals(other$batchUnit)) {
            return false;
        }
        String this$batchUnit_Code = this.getBatchUnit_Code();
        String other$batchUnit_Code = other.getBatchUnit_Code();
        if (this$batchUnit_Code == null ? other$batchUnit_Code != null : !this$batchUnit_Code.equals(other$batchUnit_Code)) {
            return false;
        }
        String this$batchUnit_Name = this.getBatchUnit_Name();
        String other$batchUnit_Name = other.getBatchUnit_Name();
        if (this$batchUnit_Name == null ? other$batchUnit_Name != null : !this$batchUnit_Name.equals(other$batchUnit_Name)) {
            return false;
        }
        String this$onlineUnit = this.getOnlineUnit();
        String other$onlineUnit = other.getOnlineUnit();
        if (this$onlineUnit == null ? other$onlineUnit != null : !this$onlineUnit.equals(other$onlineUnit)) {
            return false;
        }
        String this$onlineUnit_Code = this.getOnlineUnit_Code();
        String other$onlineUnit_Code = other.getOnlineUnit_Code();
        if (this$onlineUnit_Code == null ? other$onlineUnit_Code != null : !this$onlineUnit_Code.equals(other$onlineUnit_Code)) {
            return false;
        }
        String this$onlineUnit_Name = this.getOnlineUnit_Name();
        String other$onlineUnit_Name = other.getOnlineUnit_Name();
        if (this$onlineUnit_Name == null ? other$onlineUnit_Name != null : !this$onlineUnit_Name.equals(other$onlineUnit_Name)) {
            return false;
        }
        String this$offlineUnit = this.getOfflineUnit();
        String other$offlineUnit = other.getOfflineUnit();
        if (this$offlineUnit == null ? other$offlineUnit != null : !this$offlineUnit.equals(other$offlineUnit)) {
            return false;
        }
        String this$offlineUnit_Code = this.getOfflineUnit_Code();
        String other$offlineUnit_Code = other.getOfflineUnit_Code();
        if (this$offlineUnit_Code == null ? other$offlineUnit_Code != null : !this$offlineUnit_Code.equals(other$offlineUnit_Code)) {
            return false;
        }
        String this$offlineUnit_Name = this.getOfflineUnit_Name();
        String other$offlineUnit_Name = other.getOfflineUnit_Name();
        if (this$offlineUnit_Name == null ? other$offlineUnit_Name != null : !this$offlineUnit_Name.equals(other$offlineUnit_Name)) {
            return false;
        }
        String this$requireUnit = this.getRequireUnit();
        String other$requireUnit = other.getRequireUnit();
        if (this$requireUnit == null ? other$requireUnit != null : !this$requireUnit.equals(other$requireUnit)) {
            return false;
        }
        String this$requireUnit_Code = this.getRequireUnit_Code();
        String other$requireUnit_Code = other.getRequireUnit_Code();
        if (this$requireUnit_Code == null ? other$requireUnit_Code != null : !this$requireUnit_Code.equals(other$requireUnit_Code)) {
            return false;
        }
        String this$requireUnit_Name = this.getRequireUnit_Name();
        String other$requireUnit_Name = other.getRequireUnit_Name();
        if (this$requireUnit_Name == null ? other$requireUnit_Name != null : !this$requireUnit_Name.equals(other$requireUnit_Name)) {
            return false;
        }
        String this$priceAreaMessage = this.getPriceAreaMessage();
        String other$priceAreaMessage = other.getPriceAreaMessage();
        if (this$priceAreaMessage == null ? other$priceAreaMessage != null : !this$priceAreaMessage.equals(other$priceAreaMessage)) {
            return false;
        }
        IpassMultilingual this$receiptName = this.getReceiptName();
        IpassMultilingual other$receiptName = other.getReceiptName();
        if (this$receiptName == null ? other$receiptName != null : !((Object)this$receiptName).equals(other$receiptName)) {
            return false;
        }
        String this$inTaxrate = this.getInTaxrate();
        String other$inTaxrate = other.getInTaxrate();
        if (this$inTaxrate == null ? other$inTaxrate != null : !this$inTaxrate.equals(other$inTaxrate)) {
            return false;
        }
        String this$inTaxrate_Code = this.getInTaxrate_Code();
        String other$inTaxrate_Code = other.getInTaxrate_Code();
        if (this$inTaxrate_Code == null ? other$inTaxrate_Code != null : !this$inTaxrate_Code.equals(other$inTaxrate_Code)) {
            return false;
        }
        String this$outTaxrate = this.getOutTaxrate();
        String other$outTaxrate = other.getOutTaxrate();
        if (this$outTaxrate == null ? other$outTaxrate != null : !this$outTaxrate.equals(other$outTaxrate)) {
            return false;
        }
        String this$outTaxrate_Code = this.getOutTaxrate_Code();
        String other$outTaxrate_Code = other.getOutTaxrate_Code();
        if (this$outTaxrate_Code == null ? other$outTaxrate_Code != null : !this$outTaxrate_Code.equals(other$outTaxrate_Code)) {
            return false;
        }
        String this$preferentialPolicyType = this.getPreferentialPolicyType();
        String other$preferentialPolicyType = other.getPreferentialPolicyType();
        if (this$preferentialPolicyType == null ? other$preferentialPolicyType != null : !this$preferentialPolicyType.equals(other$preferentialPolicyType)) {
            return false;
        }
        String this$preferentialPolicyType_Name = this.getPreferentialPolicyType_Name();
        String other$preferentialPolicyType_Name = other.getPreferentialPolicyType_Name();
        if (this$preferentialPolicyType_Name == null ? other$preferentialPolicyType_Name != null : !this$preferentialPolicyType_Name.equals(other$preferentialPolicyType_Name)) {
            return false;
        }
        String this$mallUpTime = this.getMallUpTime();
        String other$mallUpTime = other.getMallUpTime();
        if (this$mallUpTime == null ? other$mallUpTime != null : !this$mallUpTime.equals(other$mallUpTime)) {
            return false;
        }
        String this$uorderUpTime = this.getUorderUpTime();
        String other$uorderUpTime = other.getUorderUpTime();
        if (this$uorderUpTime == null ? other$uorderUpTime != null : !this$uorderUpTime.equals(other$uorderUpTime)) {
            return false;
        }
        String this$productVendor = this.getProductVendor();
        String other$productVendor = other.getProductVendor();
        if (this$productVendor == null ? other$productVendor != null : !this$productVendor.equals(other$productVendor)) {
            return false;
        }
        String this$productVendor_Name = this.getProductVendor_Name();
        String other$productVendor_Name = other.getProductVendor_Name();
        if (this$productVendor_Name == null ? other$productVendor_Name != null : !this$productVendor_Name.equals(other$productVendor_Name)) {
            return false;
        }
        String this$productBuyer = this.getProductBuyer();
        String string = other.getProductBuyer();
        if (this$productBuyer == null ? other$productBuyer != null : !this$productBuyer.equals(other$productBuyer)) {
            return false;
        }
        String string2 = this.getProductBuyer_Name();
        String string3 = other.getProductBuyer_Name();
        if (this$productBuyer_Name == null ? other$productBuyer_Name != null : !this$productBuyer_Name.equals(other$productBuyer_Name)) {
            return false;
        }
        String string4 = this.getUorderDlyFeeRuleId();
        String string5 = other.getUorderDlyFeeRuleId();
        if (this$uorderDlyFeeRuleId == null ? other$uorderDlyFeeRuleId != null : !this$uorderDlyFeeRuleId.equals(other$uorderDlyFeeRuleId)) {
            return false;
        }
        String string6 = this.getUorderDlyFeeRuleId_Name();
        String string7 = other.getUorderDlyFeeRuleId_Name();
        if (this$uorderDlyFeeRuleId_Name == null ? other$uorderDlyFeeRuleId_Name != null : !this$uorderDlyFeeRuleId_Name.equals(other$uorderDlyFeeRuleId_Name)) {
            return false;
        }
        String string8 = this.getBeUpTime();
        String string9 = other.getBeUpTime();
        if (this$beUpTime == null ? other$beUpTime != null : !this$beUpTime.equals(other$beUpTime)) {
            return false;
        }
        String string10 = this.getExpireDateUnit();
        String string11 = other.getExpireDateUnit();
        if (this$expireDateUnit == null ? other$expireDateUnit != null : !this$expireDateUnit.equals(other$expireDateUnit)) {
            return false;
        }
        String string12 = this.getWarehouseManager();
        String string13 = other.getWarehouseManager();
        if (this$warehouseManager == null ? other$warehouseManager != null : !this$warehouseManager.equals(other$warehouseManager)) {
            return false;
        }
        String string14 = this.getWarehouseManager_Name();
        String string15 = other.getWarehouseManager_Name();
        if (this$warehouseManager_Name == null ? other$warehouseManager_Name != null : !this$warehouseManager_Name.equals(other$warehouseManager_Name)) {
            return false;
        }
        String string16 = this.getDeliveryWarehouse();
        String string17 = other.getDeliveryWarehouse();
        if (this$deliveryWarehouse == null ? other$deliveryWarehouse != null : !this$deliveryWarehouse.equals(other$deliveryWarehouse)) {
            return false;
        }
        String string18 = this.getDeliveryWarehouse_Name();
        String string19 = other.getDeliveryWarehouse_Name();
        if (this$deliveryWarehouse_Name == null ? other$deliveryWarehouse_Name != null : !this$deliveryWarehouse_Name.equals(other$deliveryWarehouse_Name)) {
            return false;
        }
        String string20 = this.getReturnWarehouse();
        String string21 = other.getReturnWarehouse();
        if (this$returnWarehouse == null ? other$returnWarehouse != null : !this$returnWarehouse.equals(other$returnWarehouse)) {
            return false;
        }
        String string22 = this.getReturnWarehouse_Name();
        String string23 = other.getReturnWarehouse_Name();
        if (this$returnWarehouse_Name == null ? other$returnWarehouse_Name != null : !this$returnWarehouse_Name.equals(other$returnWarehouse_Name)) {
            return false;
        }
        String string24 = this.getPlanDefaultAttribute();
        String string25 = other.getPlanDefaultAttribute();
        if (this$planDefaultAttribute == null ? other$planDefaultAttribute != null : !this$planDefaultAttribute.equals(other$planDefaultAttribute)) {
            return false;
        }
        String string26 = this.getPlanMethod();
        String string27 = other.getPlanMethod();
        if (this$planMethod == null ? other$planMethod != null : !this$planMethod.equals(other$planMethod)) {
            return false;
        }
        String string28 = this.getPlanStrategy();
        String string29 = other.getPlanStrategy();
        if (this$planStrategy == null ? other$planStrategy != null : !this$planStrategy.equals(other$planStrategy)) {
            return false;
        }
        String string30 = this.getPlanStrategy_Name();
        String string31 = other.getPlanStrategy_Name();
        if (this$planStrategy_Name == null ? other$planStrategy_Name != null : !this$planStrategy_Name.equals(other$planStrategy_Name)) {
            return false;
        }
        String string32 = this.getPurpose();
        String string33 = other.getPurpose();
        if (this$purpose == null ? other$purpose != null : !this$purpose.equals(other$purpose)) {
            return false;
        }
        String string34 = this.getSupplyDemandPolicy();
        String string35 = other.getSupplyDemandPolicy();
        if (this$supplyDemandPolicy == null ? other$supplyDemandPolicy != null : !this$supplyDemandPolicy.equals(other$supplyDemandPolicy)) {
            return false;
        }
        String string36 = this.getBatchPolicy();
        String string37 = other.getBatchPolicy();
        if (this$batchPolicy == null ? other$batchPolicy != null : !this$batchPolicy.equals(other$batchPolicy)) {
            return false;
        }
        String string38 = this.getSupplyType();
        String string39 = other.getSupplyType();
        if (this$supplyType == null ? other$supplyType != null : !this$supplyType.equals(other$supplyType)) {
            return false;
        }
        String string40 = this.getProduceDepartment();
        String string41 = other.getProduceDepartment();
        if (this$produceDepartment == null ? other$produceDepartment != null : !this$produceDepartment.equals(other$produceDepartment)) {
            return false;
        }
        String string42 = this.getProduceDepartment_Name();
        String string43 = other.getProduceDepartment_Name();
        if (this$produceDepartment_Name == null ? other$produceDepartment_Name != null : !this$produceDepartment_Name.equals(other$produceDepartment_Name)) {
            return false;
        }
        String string44 = this.getManufacturePlanner();
        String string45 = other.getManufacturePlanner();
        if (this$manufacturePlanner == null ? other$manufacturePlanner != null : !this$manufacturePlanner.equals(other$manufacturePlanner)) {
            return false;
        }
        String string46 = this.getManufacturePlanner_Name();
        String string47 = other.getManufacturePlanner_Name();
        if (this$manufacturePlanner_Name == null ? other$manufacturePlanner_Name != null : !this$manufacturePlanner_Name.equals(other$manufacturePlanner_Name)) {
            return false;
        }
        String string48 = this.getEngineeringDrawingNo();
        String string49 = other.getEngineeringDrawingNo();
        if (this$engineeringDrawingNo == null ? other$engineeringDrawingNo != null : !this$engineeringDrawingNo.equals(other$engineeringDrawingNo)) {
            return false;
        }
        String string50 = this.getValueManageType();
        String string51 = other.getValueManageType();
        if (this$valueManageType == null ? other$valueManageType != null : !this$valueManageType.equals(other$valueManageType)) {
            return false;
        }
        String string52 = this.getCostValuation();
        String string53 = other.getCostValuation();
        if (this$costValuation == null ? other$costValuation != null : !this$costValuation.equals(other$costValuation)) {
            return false;
        }
        String string54 = this.getIsCheckFree();
        String string55 = other.getIsCheckFree();
        if (this$isCheckFree == null ? other$isCheckFree != null : !this$isCheckFree.equals(other$isCheckFree)) {
            return false;
        }
        String string56 = this.getSaleStyle();
        String string57 = other.getSaleStyle();
        if (this$saleStyle == null ? other$saleStyle != null : !this$saleStyle.equals(other$saleStyle)) {
            return false;
        }
        String string58 = this.getDlyFeeRuleId();
        String string59 = other.getDlyFeeRuleId();
        if (this$dlyFeeRuleId == null ? other$dlyFeeRuleId != null : !this$dlyFeeRuleId.equals(other$dlyFeeRuleId)) {
            return false;
        }
        String string60 = this.getDlyFeeRuleId_Name();
        String string61 = other.getDlyFeeRuleId_Name();
        if (this$dlyFeeRuleId_Name == null ? other$dlyFeeRuleId_Name != null : !this$dlyFeeRuleId_Name.equals(other$dlyFeeRuleId_Name)) {
            return false;
        }
        IpassMultilingual ipassMultilingual = this.getMetaDescription();
        IpassMultilingual ipassMultilingual2 = other.getMetaDescription();
        if (this$metaDescription == null ? other$metaDescription != null : !this$metaDescription.equals(other$metaDescription)) {
            return false;
        }
        String string62 = this.getDepositDealPayType();
        String string63 = other.getDepositDealPayType();
        if (this$depositDealPayType == null ? other$depositDealPayType != null : !this$depositDealPayType.equals(other$depositDealPayType)) {
            return false;
        }
        String string64 = this.getEnablemodifyDeposit();
        String string65 = other.getEnablemodifyDeposit();
        if (this$enablemodifyDeposit == null ? other$enablemodifyDeposit != null : !this$enablemodifyDeposit.equals(other$enablemodifyDeposit)) {
            return false;
        }
        String string66 = this.getDepositPayType();
        String string67 = other.getDepositPayType();
        if (this$depositPayType == null ? other$depositPayType != null : !this$depositPayType.equals(other$depositPayType)) {
            return false;
        }
        String string68 = this.getServiceDurationUnit();
        String string69 = other.getServiceDurationUnit();
        if (this$serviceDurationUnit == null ? other$serviceDurationUnit != null : !this$serviceDurationUnit.equals(other$serviceDurationUnit)) {
            return false;
        }
        String string70 = this.getOrderAdvanceTime();
        String string71 = other.getOrderAdvanceTime();
        if (this$orderAdvanceTime == null ? other$orderAdvanceTime != null : !this$orderAdvanceTime.equals(other$orderAdvanceTime)) {
            return false;
        }
        String string72 = this.getPageTitle();
        String string73 = other.getPageTitle();
        if (this$pageTitle == null ? other$pageTitle != null : !this$pageTitle.equals(other$pageTitle)) {
            return false;
        }
        IpassMultilingual ipassMultilingual3 = this.getDisplayName();
        IpassMultilingual ipassMultilingual4 = other.getDisplayName();
        if (this$displayName == null ? other$displayName != null : !this$displayName.equals(other$displayName)) {
            return false;
        }
        IpassMultilingual ipassMultilingual5 = this.getTitleMemo();
        IpassMultilingual ipassMultilingual6 = other.getTitleMemo();
        if (this$titleMemo == null ? other$titleMemo != null : !this$titleMemo.equals(other$titleMemo)) {
            return false;
        }
        String string74 = this.getRetailPriceDimension();
        String string75 = other.getRetailPriceDimension();
        if (this$retailPriceDimension == null ? other$retailPriceDimension != null : !this$retailPriceDimension.equals(other$retailPriceDimension)) {
            return false;
        }
        String string76 = this.getDeliverQuantityChange();
        String string77 = other.getDeliverQuantityChange();
        if (this$deliverQuantityChange == null ? other$deliverQuantityChange != null : !this$deliverQuantityChange.equals(other$deliverQuantityChange)) {
            return false;
        }
        String string78 = this.getProcessType();
        String string79 = other.getProcessType();
        if (this$processType == null ? other$processType != null : !this$processType.equals(other$processType)) {
            return false;
        }
        String string80 = this.getInventoryPlanStrategy();
        String string81 = other.getInventoryPlanStrategy();
        if (this$inventoryPlanStrategy == null ? other$inventoryPlanStrategy != null : !this$inventoryPlanStrategy.equals(other$inventoryPlanStrategy)) {
            return false;
        }
        Object object = this.getProductExtendCharacterDef();
        Object object2 = other.getProductExtendCharacterDef();
        return !(this$productExtendCharacterDef == null ? other$productExtendCharacterDef != null : !this$productExtendCharacterDef.equals(other$productExtendCharacterDef));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductDetailIPass;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
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
        Long $periodicalInspectionCycle = this.getPeriodicalInspectionCycle();
        result = result * 59 + ($periodicalInspectionCycle == null ? 43 : ((Object)$periodicalInspectionCycle).hashCode());
        Long $inspectionUnit = this.getInspectionUnit();
        result = result * 59 + ($inspectionUnit == null ? 43 : ((Object)$inspectionUnit).hashCode());
        Long $purchasePriceUnit = this.getPurchasePriceUnit();
        result = result * 59 + ($purchasePriceUnit == null ? 43 : ((Object)$purchasePriceUnit).hashCode());
        Long $batchPrice = this.getBatchPrice();
        result = result * 59 + ($batchPrice == null ? 43 : ((Object)$batchPrice).hashCode());
        Long $fMarkPrice = this.getFMarkPrice();
        result = result * 59 + ($fMarkPrice == null ? 43 : ((Object)$fMarkPrice).hashCode());
        Long $fLowestMarkPrice = this.getFLowestMarkPrice();
        result = result * 59 + ($fLowestMarkPrice == null ? 43 : ((Object)$fLowestMarkPrice).hashCode());
        Long $fSalePrice = this.getFSalePrice();
        result = result * 59 + ($fSalePrice == null ? 43 : ((Object)$fSalePrice).hashCode());
        Long $fMarketPrice = this.getFMarketPrice();
        result = result * 59 + ($fMarketPrice == null ? 43 : ((Object)$fMarketPrice).hashCode());
        Boolean $isDisplayPrice = this.getIsDisplayPrice();
        result = result * 59 + ($isDisplayPrice == null ? 43 : ((Object)$isDisplayPrice).hashCode());
        Long $inTaxrate_Name = this.getInTaxrate_Name();
        result = result * 59 + ($inTaxrate_Name == null ? 43 : ((Object)$inTaxrate_Name).hashCode());
        Long $outTaxrate_Name = this.getOutTaxrate_Name();
        result = result * 59 + ($outTaxrate_Name == null ? 43 : ((Object)$outTaxrate_Name).hashCode());
        Long $iOrder = this.getIOrder();
        result = result * 59 + ($iOrder == null ? 43 : ((Object)$iOrder).hashCode());
        Boolean $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        Boolean $iStatus = this.getIStatus();
        result = result * 59 + ($iStatus == null ? 43 : ((Object)$iStatus).hashCode());
        Boolean $iUOrderStatus = this.getIUOrderStatus();
        result = result * 59 + ($iUOrderStatus == null ? 43 : ((Object)$iUOrderStatus).hashCode());
        Long $fPrimeCosts = this.getFPrimeCosts();
        result = result * 59 + ($fPrimeCosts == null ? 43 : ((Object)$fPrimeCosts).hashCode());
        Long $maxPrimeCosts = this.getMaxPrimeCosts();
        result = result * 59 + ($maxPrimeCosts == null ? 43 : ((Object)$maxPrimeCosts).hashCode());
        Long $requestOrderLimit = this.getRequestOrderLimit();
        result = result * 59 + ($requestOrderLimit == null ? 43 : ((Object)$requestOrderLimit).hashCode());
        Boolean $canSale = this.getCanSale();
        result = result * 59 + ($canSale == null ? 43 : ((Object)$canSale).hashCode());
        Long $iMinOrderQuantity = this.getIMinOrderQuantity();
        result = result * 59 + ($iMinOrderQuantity == null ? 43 : ((Object)$iMinOrderQuantity).hashCode());
        Long $deliveryDays = this.getDeliveryDays();
        result = result * 59 + ($deliveryDays == null ? 43 : ((Object)$deliveryDays).hashCode());
        Boolean $isBatchManage = this.getIsBatchManage();
        result = result * 59 + ($isBatchManage == null ? 43 : ((Object)$isBatchManage).hashCode());
        Boolean $isExpiryDateManage = this.getIsExpiryDateManage();
        result = result * 59 + ($isExpiryDateManage == null ? 43 : ((Object)$isExpiryDateManage).hashCode());
        Short $isExpiryDateCalculationMethod = this.getIsExpiryDateCalculationMethod();
        result = result * 59 + ($isExpiryDateCalculationMethod == null ? 43 : ((Object)$isExpiryDateCalculationMethod).hashCode());
        Long $expireDateNo = this.getExpireDateNo();
        result = result * 59 + ($expireDateNo == null ? 43 : ((Object)$expireDateNo).hashCode());
        Long $daysBeforeValidityReject = this.getDaysBeforeValidityReject();
        result = result * 59 + ($daysBeforeValidityReject == null ? 43 : ((Object)$daysBeforeValidityReject).hashCode());
        Long $validityWarningDays = this.getValidityWarningDays();
        result = result * 59 + ($validityWarningDays == null ? 43 : ((Object)$validityWarningDays).hashCode());
        Boolean $isSerialNoManage = this.getIsSerialNoManage();
        result = result * 59 + ($isSerialNoManage == null ? 43 : ((Object)$isSerialNoManage).hashCode());
        Boolean $isBarcodeManage = this.getIsBarcodeManage();
        result = result * 59 + ($isBarcodeManage == null ? 43 : ((Object)$isBarcodeManage).hashCode());
        Long $safetyStock = this.getSafetyStock();
        result = result * 59 + ($safetyStock == null ? 43 : ((Object)$safetyStock).hashCode());
        Long $highestStock = this.getHighestStock();
        result = result * 59 + ($highestStock == null ? 43 : ((Object)$highestStock).hashCode());
        Long $lowestStock = this.getLowestStock();
        result = result * 59 + ($lowestStock == null ? 43 : ((Object)$lowestStock).hashCode());
        Long $ropStock = this.getRopStock();
        result = result * 59 + ($ropStock == null ? 43 : ((Object)$ropStock).hashCode());
        Long $inStoreExcessLimit = this.getInStoreExcessLimit();
        result = result * 59 + ($inStoreExcessLimit == null ? 43 : ((Object)$inStoreExcessLimit).hashCode());
        Long $outStoreExcessLimit = this.getOutStoreExcessLimit();
        result = result * 59 + ($outStoreExcessLimit == null ? 43 : ((Object)$outStoreExcessLimit).hashCode());
        Long $storageLossRate = this.getStorageLossRate();
        result = result * 59 + ($storageLossRate == null ? 43 : ((Object)$storageLossRate).hashCode());
        Boolean $allowNegativeInventory = this.getAllowNegativeInventory();
        result = result * 59 + ($allowNegativeInventory == null ? 43 : ((Object)$allowNegativeInventory).hashCode());
        Boolean $keySubPart = this.getKeySubPart();
        result = result * 59 + ($keySubPart == null ? 43 : ((Object)$keySubPart).hashCode());
        Boolean $bindCarrier = this.getBindCarrier();
        result = result * 59 + ($bindCarrier == null ? 43 : ((Object)$bindCarrier).hashCode());
        Boolean $utility = this.getUtility();
        result = result * 59 + ($utility == null ? 43 : ((Object)$utility).hashCode());
        Long $fixedLeadTime = this.getFixedLeadTime();
        result = result * 59 + ($fixedLeadTime == null ? 43 : ((Object)$fixedLeadTime).hashCode());
        Long $supplyTimes = this.getSupplyTimes();
        result = result * 59 + ($supplyTimes == null ? 43 : ((Object)$supplyTimes).hashCode());
        Long $planProduceLimit = this.getPlanProduceLimit();
        result = result * 59 + ($planProduceLimit == null ? 43 : ((Object)$planProduceLimit).hashCode());
        Boolean $weigh = this.getWeigh();
        result = result * 59 + ($weigh == null ? 43 : ((Object)$weigh).hashCode());
        Boolean $checkByCost = this.getCheckByCost();
        result = result * 59 + ($checkByCost == null ? 43 : ((Object)$checkByCost).hashCode());
        Long $fNoTaxCostPrice = this.getFNoTaxCostPrice();
        result = result * 59 + ($fNoTaxCostPrice == null ? 43 : ((Object)$fNoTaxCostPrice).hashCode());
        Boolean $checkByBatch = this.getCheckByBatch();
        result = result * 59 + ($checkByBatch == null ? 43 : ((Object)$checkByBatch).hashCode());
        Boolean $accountingByItem = this.getAccountingByItem();
        result = result * 59 + ($accountingByItem == null ? 43 : ((Object)$accountingByItem).hashCode());
        Boolean $materialCost = this.getMaterialCost();
        result = result * 59 + ($materialCost == null ? 43 : ((Object)$materialCost).hashCode());
        Long $salePoints = this.getSalePoints();
        result = result * 59 + ($salePoints == null ? 43 : ((Object)$salePoints).hashCode());
        Long $lInventoryCount = this.getLInventoryCount();
        result = result * 59 + ($lInventoryCount == null ? 43 : ((Object)$lInventoryCount).hashCode());
        Long $iBaseSaleCount = this.getIBaseSaleCount();
        result = result * 59 + ($iBaseSaleCount == null ? 43 : ((Object)$iBaseSaleCount).hashCode());
        Boolean $enableSubscribe = this.getEnableSubscribe();
        result = result * 59 + ($enableSubscribe == null ? 43 : ((Object)$enableSubscribe).hashCode());
        Boolean $enableDeposit = this.getEnableDeposit();
        result = result * 59 + ($enableDeposit == null ? 43 : ((Object)$enableDeposit).hashCode());
        Long $deposits = this.getDeposits();
        result = result * 59 + ($deposits == null ? 43 : ((Object)$deposits).hashCode());
        Long $depositPercentage = this.getDepositPercentage();
        result = result * 59 + ($depositPercentage == null ? 43 : ((Object)$depositPercentage).hashCode());
        Long $minimumDeposits = this.getMinimumDeposits();
        result = result * 59 + ($minimumDeposits == null ? 43 : ((Object)$minimumDeposits).hashCode());
        Long $serviceDuration = this.getServiceDuration();
        result = result * 59 + ($serviceDuration == null ? 43 : ((Object)$serviceDuration).hashCode());
        Boolean $canOrder = this.getCanOrder();
        result = result * 59 + ($canOrder == null ? 43 : ((Object)$canOrder).hashCode());
        Boolean $onlyOrder = this.getOnlyOrder();
        result = result * 59 + ($onlyOrder == null ? 43 : ((Object)$onlyOrder).hashCode());
        Boolean $iEnableCyclePurchase = this.getIEnableCyclePurchase();
        result = result * 59 + ($iEnableCyclePurchase == null ? 43 : ((Object)$iEnableCyclePurchase).hashCode());
        Long $fSettleAccountsRate = this.getFSettleAccountsRate();
        result = result * 59 + ($fSettleAccountsRate == null ? 43 : ((Object)$fSettleAccountsRate).hashCode());
        Boolean $isAllArea = this.getIsAllArea();
        result = result * 59 + ($isAllArea == null ? 43 : ((Object)$isAllArea).hashCode());
        Boolean $iEnableEcontract = this.getIEnableEcontract();
        result = result * 59 + ($iEnableEcontract == null ? 43 : ((Object)$iEnableEcontract).hashCode());
        Boolean $isRecommend = this.getIsRecommend();
        result = result * 59 + ($isRecommend == null ? 43 : ((Object)$isRecommend).hashCode());
        Boolean $allowStorePurchase = this.getAllowStorePurchase();
        result = result * 59 + ($allowStorePurchase == null ? 43 : ((Object)$allowStorePurchase).hashCode());
        Boolean $isSaleInOfflineStore = this.getIsSaleInOfflineStore();
        result = result * 59 + ($isSaleInOfflineStore == null ? 43 : ((Object)$isSaleInOfflineStore).hashCode());
        Boolean $isPriceChangeAllowed = this.getIsPriceChangeAllowed();
        result = result * 59 + ($isPriceChangeAllowed == null ? 43 : ((Object)$isPriceChangeAllowed).hashCode());
        Boolean $isOfflineStoreOrder = this.getIsOfflineStoreOrder();
        result = result * 59 + ($isOfflineStoreOrder == null ? 43 : ((Object)$isOfflineStoreOrder).hashCode());
        Boolean $isOfflineStoreReturn = this.getIsOfflineStoreReturn();
        result = result * 59 + ($isOfflineStoreReturn == null ? 43 : ((Object)$isOfflineStoreReturn).hashCode());
        Boolean $isProcess = this.getIsProcess();
        result = result * 59 + ($isProcess == null ? 43 : ((Object)$isProcess).hashCode());
        Boolean $isMaterial = this.getIsMaterial();
        result = result * 59 + ($isMaterial == null ? 43 : ((Object)$isMaterial).hashCode());
        Boolean $isWeight = this.getIsWeight();
        result = result * 59 + ($isWeight == null ? 43 : ((Object)$isWeight).hashCode());
        String $shortName = this.getShortName();
        result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
        String $mnemonicCode = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : $mnemonicCode.hashCode());
        String $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : $barCode.hashCode());
        String $businessAttribute = this.getBusinessAttribute();
        result = result * 59 + ($businessAttribute == null ? 43 : $businessAttribute.hashCode());
        String $saleChannel = this.getSaleChannel();
        result = result * 59 + ($saleChannel == null ? 43 : $saleChannel.hashCode());
        String $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : $productApplyRangeId.hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        String $purchaseUnit = this.getPurchaseUnit();
        result = result * 59 + ($purchaseUnit == null ? 43 : $purchaseUnit.hashCode());
        String $purchaseUnit_Code = this.getPurchaseUnit_Code();
        result = result * 59 + ($purchaseUnit_Code == null ? 43 : $purchaseUnit_Code.hashCode());
        String $purchaseUnit_Name = this.getPurchaseUnit_Name();
        result = result * 59 + ($purchaseUnit_Name == null ? 43 : $purchaseUnit_Name.hashCode());
        String $inspectionUnit_Code = this.getInspectionUnit_Code();
        result = result * 59 + ($inspectionUnit_Code == null ? 43 : $inspectionUnit_Code.hashCode());
        String $inspectionUnit_Name = this.getInspectionUnit_Name();
        result = result * 59 + ($inspectionUnit_Name == null ? 43 : $inspectionUnit_Name.hashCode());
        String $purchasePriceUnit_Code = this.getPurchasePriceUnit_Code();
        result = result * 59 + ($purchasePriceUnit_Code == null ? 43 : $purchasePriceUnit_Code.hashCode());
        String $purchasePriceUnit_Name = this.getPurchasePriceUnit_Name();
        result = result * 59 + ($purchasePriceUnit_Name == null ? 43 : $purchasePriceUnit_Name.hashCode());
        String $stockUnit = this.getStockUnit();
        result = result * 59 + ($stockUnit == null ? 43 : $stockUnit.hashCode());
        String $stockUnit_Code = this.getStockUnit_Code();
        result = result * 59 + ($stockUnit_Code == null ? 43 : $stockUnit_Code.hashCode());
        String $stockUnit_Name = this.getStockUnit_Name();
        result = result * 59 + ($stockUnit_Name == null ? 43 : $stockUnit_Name.hashCode());
        String $produceUnit = this.getProduceUnit();
        result = result * 59 + ($produceUnit == null ? 43 : $produceUnit.hashCode());
        String $produceUnit_Code = this.getProduceUnit_Code();
        result = result * 59 + ($produceUnit_Code == null ? 43 : $produceUnit_Code.hashCode());
        String $produceUnit_Name = this.getProduceUnit_Name();
        result = result * 59 + ($produceUnit_Name == null ? 43 : $produceUnit_Name.hashCode());
        String $batchPriceUnit = this.getBatchPriceUnit();
        result = result * 59 + ($batchPriceUnit == null ? 43 : $batchPriceUnit.hashCode());
        String $batchPriceUnit_Code = this.getBatchPriceUnit_Code();
        result = result * 59 + ($batchPriceUnit_Code == null ? 43 : $batchPriceUnit_Code.hashCode());
        String $batchPriceUnit_Name = this.getBatchPriceUnit_Name();
        result = result * 59 + ($batchPriceUnit_Name == null ? 43 : $batchPriceUnit_Name.hashCode());
        String $batchUnit = this.getBatchUnit();
        result = result * 59 + ($batchUnit == null ? 43 : $batchUnit.hashCode());
        String $batchUnit_Code = this.getBatchUnit_Code();
        result = result * 59 + ($batchUnit_Code == null ? 43 : $batchUnit_Code.hashCode());
        String $batchUnit_Name = this.getBatchUnit_Name();
        result = result * 59 + ($batchUnit_Name == null ? 43 : $batchUnit_Name.hashCode());
        String $onlineUnit = this.getOnlineUnit();
        result = result * 59 + ($onlineUnit == null ? 43 : $onlineUnit.hashCode());
        String $onlineUnit_Code = this.getOnlineUnit_Code();
        result = result * 59 + ($onlineUnit_Code == null ? 43 : $onlineUnit_Code.hashCode());
        String $onlineUnit_Name = this.getOnlineUnit_Name();
        result = result * 59 + ($onlineUnit_Name == null ? 43 : $onlineUnit_Name.hashCode());
        String $offlineUnit = this.getOfflineUnit();
        result = result * 59 + ($offlineUnit == null ? 43 : $offlineUnit.hashCode());
        String $offlineUnit_Code = this.getOfflineUnit_Code();
        result = result * 59 + ($offlineUnit_Code == null ? 43 : $offlineUnit_Code.hashCode());
        String $offlineUnit_Name = this.getOfflineUnit_Name();
        result = result * 59 + ($offlineUnit_Name == null ? 43 : $offlineUnit_Name.hashCode());
        String $requireUnit = this.getRequireUnit();
        result = result * 59 + ($requireUnit == null ? 43 : $requireUnit.hashCode());
        String $requireUnit_Code = this.getRequireUnit_Code();
        result = result * 59 + ($requireUnit_Code == null ? 43 : $requireUnit_Code.hashCode());
        String $requireUnit_Name = this.getRequireUnit_Name();
        result = result * 59 + ($requireUnit_Name == null ? 43 : $requireUnit_Name.hashCode());
        String $priceAreaMessage = this.getPriceAreaMessage();
        result = result * 59 + ($priceAreaMessage == null ? 43 : $priceAreaMessage.hashCode());
        IpassMultilingual $receiptName = this.getReceiptName();
        result = result * 59 + ($receiptName == null ? 43 : ((Object)$receiptName).hashCode());
        String $inTaxrate = this.getInTaxrate();
        result = result * 59 + ($inTaxrate == null ? 43 : $inTaxrate.hashCode());
        String $inTaxrate_Code = this.getInTaxrate_Code();
        result = result * 59 + ($inTaxrate_Code == null ? 43 : $inTaxrate_Code.hashCode());
        String $outTaxrate = this.getOutTaxrate();
        result = result * 59 + ($outTaxrate == null ? 43 : $outTaxrate.hashCode());
        String $outTaxrate_Code = this.getOutTaxrate_Code();
        result = result * 59 + ($outTaxrate_Code == null ? 43 : $outTaxrate_Code.hashCode());
        String $preferentialPolicyType = this.getPreferentialPolicyType();
        result = result * 59 + ($preferentialPolicyType == null ? 43 : $preferentialPolicyType.hashCode());
        String $preferentialPolicyType_Name = this.getPreferentialPolicyType_Name();
        result = result * 59 + ($preferentialPolicyType_Name == null ? 43 : $preferentialPolicyType_Name.hashCode());
        String $mallUpTime = this.getMallUpTime();
        result = result * 59 + ($mallUpTime == null ? 43 : $mallUpTime.hashCode());
        String $uorderUpTime = this.getUorderUpTime();
        result = result * 59 + ($uorderUpTime == null ? 43 : $uorderUpTime.hashCode());
        String $productVendor = this.getProductVendor();
        result = result * 59 + ($productVendor == null ? 43 : $productVendor.hashCode());
        String $productVendor_Name = this.getProductVendor_Name();
        result = result * 59 + ($productVendor_Name == null ? 43 : $productVendor_Name.hashCode());
        String $productBuyer = this.getProductBuyer();
        result = result * 59 + ($productBuyer == null ? 43 : $productBuyer.hashCode());
        String $productBuyer_Name = this.getProductBuyer_Name();
        result = result * 59 + ($productBuyer_Name == null ? 43 : $productBuyer_Name.hashCode());
        String $uorderDlyFeeRuleId = this.getUorderDlyFeeRuleId();
        result = result * 59 + ($uorderDlyFeeRuleId == null ? 43 : $uorderDlyFeeRuleId.hashCode());
        String $uorderDlyFeeRuleId_Name = this.getUorderDlyFeeRuleId_Name();
        result = result * 59 + ($uorderDlyFeeRuleId_Name == null ? 43 : $uorderDlyFeeRuleId_Name.hashCode());
        String $beUpTime = this.getBeUpTime();
        result = result * 59 + ($beUpTime == null ? 43 : $beUpTime.hashCode());
        String $expireDateUnit = this.getExpireDateUnit();
        result = result * 59 + ($expireDateUnit == null ? 43 : $expireDateUnit.hashCode());
        String $warehouseManager = this.getWarehouseManager();
        result = result * 59 + ($warehouseManager == null ? 43 : $warehouseManager.hashCode());
        String $warehouseManager_Name = this.getWarehouseManager_Name();
        result = result * 59 + ($warehouseManager_Name == null ? 43 : $warehouseManager_Name.hashCode());
        String $deliveryWarehouse = this.getDeliveryWarehouse();
        result = result * 59 + ($deliveryWarehouse == null ? 43 : $deliveryWarehouse.hashCode());
        String $deliveryWarehouse_Name = this.getDeliveryWarehouse_Name();
        result = result * 59 + ($deliveryWarehouse_Name == null ? 43 : $deliveryWarehouse_Name.hashCode());
        String $returnWarehouse = this.getReturnWarehouse();
        result = result * 59 + ($returnWarehouse == null ? 43 : $returnWarehouse.hashCode());
        String $returnWarehouse_Name = this.getReturnWarehouse_Name();
        result = result * 59 + ($returnWarehouse_Name == null ? 43 : $returnWarehouse_Name.hashCode());
        String $planDefaultAttribute = this.getPlanDefaultAttribute();
        result = result * 59 + ($planDefaultAttribute == null ? 43 : $planDefaultAttribute.hashCode());
        String $planMethod = this.getPlanMethod();
        result = result * 59 + ($planMethod == null ? 43 : $planMethod.hashCode());
        String $planStrategy = this.getPlanStrategy();
        result = result * 59 + ($planStrategy == null ? 43 : $planStrategy.hashCode());
        String $planStrategy_Name = this.getPlanStrategy_Name();
        result = result * 59 + ($planStrategy_Name == null ? 43 : $planStrategy_Name.hashCode());
        String $purpose = this.getPurpose();
        result = result * 59 + ($purpose == null ? 43 : $purpose.hashCode());
        String $supplyDemandPolicy = this.getSupplyDemandPolicy();
        result = result * 59 + ($supplyDemandPolicy == null ? 43 : $supplyDemandPolicy.hashCode());
        String $batchPolicy = this.getBatchPolicy();
        result = result * 59 + ($batchPolicy == null ? 43 : $batchPolicy.hashCode());
        String $supplyType = this.getSupplyType();
        result = result * 59 + ($supplyType == null ? 43 : $supplyType.hashCode());
        String $produceDepartment = this.getProduceDepartment();
        result = result * 59 + ($produceDepartment == null ? 43 : $produceDepartment.hashCode());
        String $produceDepartment_Name = this.getProduceDepartment_Name();
        result = result * 59 + ($produceDepartment_Name == null ? 43 : $produceDepartment_Name.hashCode());
        String $manufacturePlanner = this.getManufacturePlanner();
        result = result * 59 + ($manufacturePlanner == null ? 43 : $manufacturePlanner.hashCode());
        String $manufacturePlanner_Name = this.getManufacturePlanner_Name();
        result = result * 59 + ($manufacturePlanner_Name == null ? 43 : $manufacturePlanner_Name.hashCode());
        String $engineeringDrawingNo = this.getEngineeringDrawingNo();
        result = result * 59 + ($engineeringDrawingNo == null ? 43 : $engineeringDrawingNo.hashCode());
        String $valueManageType = this.getValueManageType();
        result = result * 59 + ($valueManageType == null ? 43 : $valueManageType.hashCode());
        String $costValuation = this.getCostValuation();
        result = result * 59 + ($costValuation == null ? 43 : $costValuation.hashCode());
        String $isCheckFree = this.getIsCheckFree();
        result = result * 59 + ($isCheckFree == null ? 43 : $isCheckFree.hashCode());
        String $saleStyle = this.getSaleStyle();
        result = result * 59 + ($saleStyle == null ? 43 : $saleStyle.hashCode());
        String $dlyFeeRuleId = this.getDlyFeeRuleId();
        result = result * 59 + ($dlyFeeRuleId == null ? 43 : $dlyFeeRuleId.hashCode());
        String $dlyFeeRuleId_Name = this.getDlyFeeRuleId_Name();
        result = result * 59 + ($dlyFeeRuleId_Name == null ? 43 : $dlyFeeRuleId_Name.hashCode());
        IpassMultilingual $metaDescription = this.getMetaDescription();
        result = result * 59 + ($metaDescription == null ? 43 : ((Object)$metaDescription).hashCode());
        String $depositDealPayType = this.getDepositDealPayType();
        result = result * 59 + ($depositDealPayType == null ? 43 : $depositDealPayType.hashCode());
        String $enablemodifyDeposit = this.getEnablemodifyDeposit();
        result = result * 59 + ($enablemodifyDeposit == null ? 43 : $enablemodifyDeposit.hashCode());
        String $depositPayType = this.getDepositPayType();
        result = result * 59 + ($depositPayType == null ? 43 : $depositPayType.hashCode());
        String $serviceDurationUnit = this.getServiceDurationUnit();
        result = result * 59 + ($serviceDurationUnit == null ? 43 : $serviceDurationUnit.hashCode());
        String $orderAdvanceTime = this.getOrderAdvanceTime();
        result = result * 59 + ($orderAdvanceTime == null ? 43 : $orderAdvanceTime.hashCode());
        String $pageTitle = this.getPageTitle();
        result = result * 59 + ($pageTitle == null ? 43 : $pageTitle.hashCode());
        IpassMultilingual $displayName = this.getDisplayName();
        result = result * 59 + ($displayName == null ? 43 : ((Object)$displayName).hashCode());
        IpassMultilingual $titleMemo = this.getTitleMemo();
        result = result * 59 + ($titleMemo == null ? 43 : ((Object)$titleMemo).hashCode());
        String $retailPriceDimension = this.getRetailPriceDimension();
        result = result * 59 + ($retailPriceDimension == null ? 43 : $retailPriceDimension.hashCode());
        String $deliverQuantityChange = this.getDeliverQuantityChange();
        result = result * 59 + ($deliverQuantityChange == null ? 43 : $deliverQuantityChange.hashCode());
        String $processType = this.getProcessType();
        result = result * 59 + ($processType == null ? 43 : $processType.hashCode());
        String $inventoryPlanStrategy = this.getInventoryPlanStrategy();
        result = result * 59 + ($inventoryPlanStrategy == null ? 43 : $inventoryPlanStrategy.hashCode());
        Object $productExtendCharacterDef = this.getProductExtendCharacterDef();
        result = result * 59 + ($productExtendCharacterDef == null ? 43 : $productExtendCharacterDef.hashCode());
        return result;
    }

    public String toString() {
        return "ProductDetailIPass(exemption=" + this.getExemption() + ", warehousingByResult=" + this.getWarehousingByResult() + ", salesReturnsExemption=" + this.getSalesReturnsExemption() + ", returnsWarehousingByResult=" + this.getReturnsWarehousingByResult() + ", periodicalInspection=" + this.getPeriodicalInspection() + ", periodicalInspectionCycle=" + this.getPeriodicalInspectionCycle() + ", shortName=" + this.getShortName() + ", mnemonicCode=" + this.getMnemonicCode() + ", barCode=" + this.getBarCode() + ", businessAttribute=" + this.getBusinessAttribute() + ", saleChannel=" + this.getSaleChannel() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", id=" + this.getId() + ", pubts=" + this.getPubts() + ", purchaseUnit=" + this.getPurchaseUnit() + ", purchaseUnit_Code=" + this.getPurchaseUnit_Code() + ", purchaseUnit_Name=" + this.getPurchaseUnit_Name() + ", inspectionUnit=" + this.getInspectionUnit() + ", inspectionUnit_Code=" + this.getInspectionUnit_Code() + ", inspectionUnit_Name=" + this.getInspectionUnit_Name() + ", purchasePriceUnit=" + this.getPurchasePriceUnit() + ", purchasePriceUnit_Code=" + this.getPurchasePriceUnit_Code() + ", purchasePriceUnit_Name=" + this.getPurchasePriceUnit_Name() + ", stockUnit=" + this.getStockUnit() + ", stockUnit_Code=" + this.getStockUnit_Code() + ", stockUnit_Name=" + this.getStockUnit_Name() + ", produceUnit=" + this.getProduceUnit() + ", produceUnit_Code=" + this.getProduceUnit_Code() + ", produceUnit_Name=" + this.getProduceUnit_Name() + ", batchPriceUnit=" + this.getBatchPriceUnit() + ", batchPriceUnit_Code=" + this.getBatchPriceUnit_Code() + ", batchPriceUnit_Name=" + this.getBatchPriceUnit_Name() + ", batchUnit=" + this.getBatchUnit() + ", batchUnit_Code=" + this.getBatchUnit_Code() + ", batchUnit_Name=" + this.getBatchUnit_Name() + ", onlineUnit=" + this.getOnlineUnit() + ", onlineUnit_Code=" + this.getOnlineUnit_Code() + ", onlineUnit_Name=" + this.getOnlineUnit_Name() + ", offlineUnit=" + this.getOfflineUnit() + ", offlineUnit_Code=" + this.getOfflineUnit_Code() + ", offlineUnit_Name=" + this.getOfflineUnit_Name() + ", requireUnit=" + this.getRequireUnit() + ", requireUnit_Code=" + this.getRequireUnit_Code() + ", requireUnit_Name=" + this.getRequireUnit_Name() + ", batchPrice=" + this.getBatchPrice() + ", fMarkPrice=" + this.getFMarkPrice() + ", fLowestMarkPrice=" + this.getFLowestMarkPrice() + ", fSalePrice=" + this.getFSalePrice() + ", fMarketPrice=" + this.getFMarketPrice() + ", isDisplayPrice=" + this.getIsDisplayPrice() + ", priceAreaMessage=" + this.getPriceAreaMessage() + ", receiptName=" + this.getReceiptName() + ", inTaxrate=" + this.getInTaxrate() + ", inTaxrate_Code=" + this.getInTaxrate_Code() + ", inTaxrate_Name=" + this.getInTaxrate_Name() + ", outTaxrate=" + this.getOutTaxrate() + ", outTaxrate_Code=" + this.getOutTaxrate_Code() + ", outTaxrate_Name=" + this.getOutTaxrate_Name() + ", preferentialPolicyType=" + this.getPreferentialPolicyType() + ", preferentialPolicyType_Name=" + this.getPreferentialPolicyType_Name() + ", iOrder=" + this.getIOrder() + ", stopstatus=" + this.getStopstatus() + ", iStatus=" + this.getIStatus() + ", mallUpTime=" + this.getMallUpTime() + ", iUOrderStatus=" + this.getIUOrderStatus() + ", uorderUpTime=" + this.getUorderUpTime() + ", productVendor=" + this.getProductVendor() + ", productVendor_Name=" + this.getProductVendor_Name() + ", productBuyer=" + this.getProductBuyer() + ", productBuyer_Name=" + this.getProductBuyer_Name() + ", fPrimeCosts=" + this.getFPrimeCosts() + ", maxPrimeCosts=" + this.getMaxPrimeCosts() + ", requestOrderLimit=" + this.getRequestOrderLimit() + ", canSale=" + this.getCanSale() + ", iMinOrderQuantity=" + this.getIMinOrderQuantity() + ", deliveryDays=" + this.getDeliveryDays() + ", uorderDlyFeeRuleId=" + this.getUorderDlyFeeRuleId() + ", uorderDlyFeeRuleId_Name=" + this.getUorderDlyFeeRuleId_Name() + ", beUpTime=" + this.getBeUpTime() + ", isBatchManage=" + this.getIsBatchManage() + ", isExpiryDateManage=" + this.getIsExpiryDateManage() + ", isExpiryDateCalculationMethod=" + this.getIsExpiryDateCalculationMethod() + ", expireDateNo=" + this.getExpireDateNo() + ", expireDateUnit=" + this.getExpireDateUnit() + ", daysBeforeValidityReject=" + this.getDaysBeforeValidityReject() + ", validityWarningDays=" + this.getValidityWarningDays() + ", isSerialNoManage=" + this.getIsSerialNoManage() + ", isBarcodeManage=" + this.getIsBarcodeManage() + ", safetyStock=" + this.getSafetyStock() + ", highestStock=" + this.getHighestStock() + ", lowestStock=" + this.getLowestStock() + ", ropStock=" + this.getRopStock() + ", warehouseManager=" + this.getWarehouseManager() + ", warehouseManager_Name=" + this.getWarehouseManager_Name() + ", deliveryWarehouse=" + this.getDeliveryWarehouse() + ", deliveryWarehouse_Name=" + this.getDeliveryWarehouse_Name() + ", returnWarehouse=" + this.getReturnWarehouse() + ", returnWarehouse_Name=" + this.getReturnWarehouse_Name() + ", inStoreExcessLimit=" + this.getInStoreExcessLimit() + ", outStoreExcessLimit=" + this.getOutStoreExcessLimit() + ", storageLossRate=" + this.getStorageLossRate() + ", planDefaultAttribute=" + this.getPlanDefaultAttribute() + ", allowNegativeInventory=" + this.getAllowNegativeInventory() + ", planMethod=" + this.getPlanMethod() + ", planStrategy=" + this.getPlanStrategy() + ", planStrategy_Name=" + this.getPlanStrategy_Name() + ", keySubPart=" + this.getKeySubPart() + ", bindCarrier=" + this.getBindCarrier() + ", purpose=" + this.getPurpose() + ", utility=" + this.getUtility() + ", supplyDemandPolicy=" + this.getSupplyDemandPolicy() + ", fixedLeadTime=" + this.getFixedLeadTime() + ", batchPolicy=" + this.getBatchPolicy() + ", supplyType=" + this.getSupplyType() + ", produceDepartment=" + this.getProduceDepartment() + ", produceDepartment_Name=" + this.getProduceDepartment_Name() + ", manufacturePlanner=" + this.getManufacturePlanner() + ", manufacturePlanner_Name=" + this.getManufacturePlanner_Name() + ", engineeringDrawingNo=" + this.getEngineeringDrawingNo() + ", supplyTimes=" + this.getSupplyTimes() + ", planProduceLimit=" + this.getPlanProduceLimit() + ", weigh=" + this.getWeigh() + ", valueManageType=" + this.getValueManageType() + ", costValuation=" + this.getCostValuation() + ", checkByCost=" + this.getCheckByCost() + ", fNoTaxCostPrice=" + this.getFNoTaxCostPrice() + ", checkByBatch=" + this.getCheckByBatch() + ", accountingByItem=" + this.getAccountingByItem() + ", materialCost=" + this.getMaterialCost() + ", isCheckFree=" + this.getIsCheckFree() + ", saleStyle=" + this.getSaleStyle() + ", salePoints=" + this.getSalePoints() + ", lInventoryCount=" + this.getLInventoryCount() + ", iBaseSaleCount=" + this.getIBaseSaleCount() + ", dlyFeeRuleId=" + this.getDlyFeeRuleId() + ", dlyFeeRuleId_Name=" + this.getDlyFeeRuleId_Name() + ", metaDescription=" + this.getMetaDescription() + ", enableSubscribe=" + this.getEnableSubscribe() + ", enableDeposit=" + this.getEnableDeposit() + ", depositDealPayType=" + this.getDepositDealPayType() + ", deposits=" + this.getDeposits() + ", depositPercentage=" + this.getDepositPercentage() + ", enablemodifyDeposit=" + this.getEnablemodifyDeposit() + ", minimumDeposits=" + this.getMinimumDeposits() + ", depositPayType=" + this.getDepositPayType() + ", serviceDuration=" + this.getServiceDuration() + ", serviceDurationUnit=" + this.getServiceDurationUnit() + ", canOrder=" + this.getCanOrder() + ", onlyOrder=" + this.getOnlyOrder() + ", orderAdvanceTime=" + this.getOrderAdvanceTime() + ", iEnableCyclePurchase=" + this.getIEnableCyclePurchase() + ", fSettleAccountsRate=" + this.getFSettleAccountsRate() + ", isAllArea=" + this.getIsAllArea() + ", iEnableEcontract=" + this.getIEnableEcontract() + ", pageTitle=" + this.getPageTitle() + ", isRecommend=" + this.getIsRecommend() + ", displayName=" + this.getDisplayName() + ", titleMemo=" + this.getTitleMemo() + ", allowStorePurchase=" + this.getAllowStorePurchase() + ", isSaleInOfflineStore=" + this.getIsSaleInOfflineStore() + ", isPriceChangeAllowed=" + this.getIsPriceChangeAllowed() + ", isOfflineStoreOrder=" + this.getIsOfflineStoreOrder() + ", isOfflineStoreReturn=" + this.getIsOfflineStoreReturn() + ", retailPriceDimension=" + this.getRetailPriceDimension() + ", deliverQuantityChange=" + this.getDeliverQuantityChange() + ", isProcess=" + this.getIsProcess() + ", processType=" + this.getProcessType() + ", isMaterial=" + this.getIsMaterial() + ", isWeight=" + this.getIsWeight() + ", inventoryPlanStrategy=" + this.getInventoryPlanStrategy() + ", productExtendCharacterDef=" + this.getProductExtendCharacterDef() + ")";
    }
}

