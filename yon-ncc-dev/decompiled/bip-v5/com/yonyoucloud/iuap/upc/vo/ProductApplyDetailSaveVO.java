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
import java.math.BigDecimal;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductApplyDetailSaveVO {
    private String shortName;
    private BigDecimal fNoTaxCostPrice;
    private String mnemonicCode;
    private String barCode;
    private String receiptName;
    private String receiptSpec;
    private String receiptModel;
    private BigDecimal fMarkPrice;
    private BigDecimal fSalePrice;
    private BigDecimal fMarketPrice;
    private BigDecimal fPrimeCosts;
    private BigDecimal safetyStock;
    private BigDecimal highestStock;
    private BigDecimal lowestStock;
    private BigDecimal arrivalAllowErrorLimit;
    private BigDecimal invoiceAllowErrorLimit;
    private BigDecimal inStoreLessLimit;
    private BigDecimal outStoreLessLimit;
    private BigDecimal storageLossRate;
    private BigDecimal lInventoryCount;
    private BigDecimal fSettleAccountsRate;
    private Integer iBaseSaleCount;
    private Integer frontLeadTime;
    private Integer behindLeadTime;
    private BigDecimal leadTimeCoefficient;
    private BigDecimal leadTimeQuantity;
    private BigDecimal rejectRate;
    private Map<String, Object> productExtendCharacterDef;
    private Integer checkByRevenueManagement;
    private Long omsWarehouse;
    private String omsWarehouseCode;
    private Long returnWarehouse;
    private String returnWarehouseCode;
    private Long deliveryWarehouse;
    private String deliveryWarehouseCode;
    private Long receiptWarehouse;
    private String receiptWarehouseCode;
    private String outTaxrate;
    private String inTaxrate;
    @JsonProperty(value="isBatchManage")
    private Boolean isBatchManage;
    @JsonProperty(value="isExpiryDateManage")
    private Boolean isExpiryDateManage;
    @JsonProperty(value="isExpiryDateCalculationMethod")
    private Integer isExpiryDateCalculationMethod;
    private Integer expireDateNo;
    private Integer expireDateUnit;
    private String productBuyer;
    private String productBuyerCode;
    private BigDecimal purchaseOrderQuantity;
    private BigDecimal purchaseTimes;
    private Integer fixedLeadTime;
    private Integer turnoverMaterials;
    private Integer amortizationMethod;
    private BigDecimal measurementCount;
    private Long measurementUnit;
    private String measurementUnit_Code;
    private String measurementUnit_Name;
    private BigDecimal compensationAmount;
    private BigDecimal moldingTime;
    private BigDecimal moldCavities;
    private Integer inspectionType;
    private Boolean warehousingByResult;
    private Integer testRule;
    private Integer enableStockPeriodRecheck;
    private Integer enableStockExpireCheck;
    private Integer returnInspection;
    private Integer sendInspection;
    private Integer planCheckDays;
    private Integer singleInspection;
    private Integer manageByInventory;
    private Integer projectTrackStrategy;
    private Integer strategyComparisonRule;
    private Integer mtoStrategy;
    private BigDecimal ropStock;
    private Integer planMethod;
    private Integer planDefaultAttribute;
    private Boolean checkByBatch;
    private Integer processType;
    @JsonProperty(value="isProcess")
    private Boolean isProcess;
    private Integer inventoryPlanStrategy;
    private Integer lossType;
    private Integer batchRule;
    private BigDecimal fixedWastage;
    private BigDecimal wastageRate;
    private BigDecimal fixedQuantity;
    private BigDecimal economicQuantity;
    private Boolean specialMaterials;
    private Boolean prepareFeed;
    private String supplyType;
    private String produceDepartment;
    private String produceDepartment_Code;
    private String businessAttribute;
    private Integer businessAttributePurchase;
    private Integer businessAttributeSale;
    private Integer businessAttributeSelfCreate;
    private Integer businessAttributeOutSourcing;
    private Integer directProduction;
    private Integer demandConsolidation;
    private Integer demandConsolidationType;
    private Integer demandConsolidationUnit;
    private Integer demandConsolidationNumber;
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
    @JsonProperty(value="isSerialNoManage")
    private Boolean isSerialNoManage;
    private Integer inspectionControlPoint;
    @JsonProperty(value="ECNControl")
    private Boolean ECNControl;
    @JsonProperty(value="iABCClass")
    private Integer iABCClass;
    private String deliveryMethod;
    private String engineeringDrawingNo;
    private Boolean reservation;
    private Integer checkBySalesOrders;
    private String manufacturingStrategy;

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public BigDecimal getfNoTaxCostPrice() {
        return this.fNoTaxCostPrice;
    }

    public void setfNoTaxCostPrice(BigDecimal fNoTaxCostPrice) {
        this.fNoTaxCostPrice = fNoTaxCostPrice;
    }

    public String getMnemonicCode() {
        return this.mnemonicCode;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public String getReceiptName() {
        return this.receiptName;
    }

    public void setReceiptName(String receiptName) {
        this.receiptName = receiptName;
    }

    public String getReceiptSpec() {
        return this.receiptSpec;
    }

    public void setReceiptSpec(String receiptSpec) {
        this.receiptSpec = receiptSpec;
    }

    public String getReceiptModel() {
        return this.receiptModel;
    }

    public void setReceiptModel(String receiptModel) {
        this.receiptModel = receiptModel;
    }

    public BigDecimal getfMarkPrice() {
        return this.fMarkPrice;
    }

    public void setfMarkPrice(BigDecimal fMarkPrice) {
        this.fMarkPrice = fMarkPrice;
    }

    public BigDecimal getfSalePrice() {
        return this.fSalePrice;
    }

    public void setfSalePrice(BigDecimal fSalePrice) {
        this.fSalePrice = fSalePrice;
    }

    public BigDecimal getfMarketPrice() {
        return this.fMarketPrice;
    }

    public void setfMarketPrice(BigDecimal fMarketPrice) {
        this.fMarketPrice = fMarketPrice;
    }

    public BigDecimal getfPrimeCosts() {
        return this.fPrimeCosts;
    }

    public void setfPrimeCosts(BigDecimal fPrimeCosts) {
        this.fPrimeCosts = fPrimeCosts;
    }

    public BigDecimal getSafetyStock() {
        return this.safetyStock;
    }

    public void setSafetyStock(BigDecimal safetyStock) {
        this.safetyStock = safetyStock;
    }

    public BigDecimal getHighestStock() {
        return this.highestStock;
    }

    public void setHighestStock(BigDecimal highestStock) {
        this.highestStock = highestStock;
    }

    public BigDecimal getLowestStock() {
        return this.lowestStock;
    }

    public void setLowestStock(BigDecimal lowestStock) {
        this.lowestStock = lowestStock;
    }

    public BigDecimal getArrivalAllowErrorLimit() {
        return this.arrivalAllowErrorLimit;
    }

    public void setArrivalAllowErrorLimit(BigDecimal arrivalAllowErrorLimit) {
        this.arrivalAllowErrorLimit = arrivalAllowErrorLimit;
    }

    public BigDecimal getInvoiceAllowErrorLimit() {
        return this.invoiceAllowErrorLimit;
    }

    public void setInvoiceAllowErrorLimit(BigDecimal invoiceAllowErrorLimit) {
        this.invoiceAllowErrorLimit = invoiceAllowErrorLimit;
    }

    public BigDecimal getInStoreLessLimit() {
        return this.inStoreLessLimit;
    }

    public void setInStoreLessLimit(BigDecimal inStoreLessLimit) {
        this.inStoreLessLimit = inStoreLessLimit;
    }

    public BigDecimal getOutStoreLessLimit() {
        return this.outStoreLessLimit;
    }

    public void setOutStoreLessLimit(BigDecimal outStoreLessLimit) {
        this.outStoreLessLimit = outStoreLessLimit;
    }

    public BigDecimal getStorageLossRate() {
        return this.storageLossRate;
    }

    public void setStorageLossRate(BigDecimal storageLossRate) {
        this.storageLossRate = storageLossRate;
    }

    public BigDecimal getlInventoryCount() {
        return this.lInventoryCount;
    }

    public void setlInventoryCount(BigDecimal lInventoryCount) {
        this.lInventoryCount = lInventoryCount;
    }

    public BigDecimal getfSettleAccountsRate() {
        return this.fSettleAccountsRate;
    }

    public void setfSettleAccountsRate(BigDecimal fSettleAccountsRate) {
        this.fSettleAccountsRate = fSettleAccountsRate;
    }

    public Integer getiBaseSaleCount() {
        return this.iBaseSaleCount;
    }

    public void setiBaseSaleCount(Integer iBaseSaleCount) {
        this.iBaseSaleCount = iBaseSaleCount;
    }

    public Integer getFrontLeadTime() {
        return this.frontLeadTime;
    }

    public void setFrontLeadTime(Integer frontLeadTime) {
        this.frontLeadTime = frontLeadTime;
    }

    public Integer getBehindLeadTime() {
        return this.behindLeadTime;
    }

    public void setBehindLeadTime(Integer behindLeadTime) {
        this.behindLeadTime = behindLeadTime;
    }

    public BigDecimal getLeadTimeCoefficient() {
        return this.leadTimeCoefficient;
    }

    public void setLeadTimeCoefficient(BigDecimal leadTimeCoefficient) {
        this.leadTimeCoefficient = leadTimeCoefficient;
    }

    public BigDecimal getLeadTimeQuantity() {
        return this.leadTimeQuantity;
    }

    public void setLeadTimeQuantity(BigDecimal leadTimeQuantity) {
        this.leadTimeQuantity = leadTimeQuantity;
    }

    public BigDecimal getRejectRate() {
        return this.rejectRate;
    }

    public void setRejectRate(BigDecimal rejectRate) {
        this.rejectRate = rejectRate;
    }

    public Map<String, Object> getProductExtendCharacterDef() {
        return this.productExtendCharacterDef;
    }

    public void setProductExtendCharacterDef(Map<String, Object> productExtendCharacterDef) {
        this.productExtendCharacterDef = productExtendCharacterDef;
    }

    public BigDecimal getMoldCavities() {
        return this.moldCavities;
    }

    public void setMoldCavities(BigDecimal moldCavities) {
        this.moldCavities = moldCavities;
    }

    public BigDecimal getMoldingTime() {
        return this.moldingTime;
    }

    public void setMoldingTime(BigDecimal moldingTime) {
        this.moldingTime = moldingTime;
    }

    public BigDecimal getCompensationAmount() {
        return this.compensationAmount;
    }

    public void setCompensationAmount(BigDecimal compensationAmount) {
        this.compensationAmount = compensationAmount;
    }

    public Long getMeasurementUnit() {
        return this.measurementUnit;
    }

    public void setMeasurementUnit(Long measurementUnit) {
        this.measurementUnit = measurementUnit;
    }

    public BigDecimal getMeasurementCount() {
        return this.measurementCount;
    }

    public void setMeasurementCount(BigDecimal measurementCount) {
        this.measurementCount = measurementCount;
    }

    public Integer getAmortizationMethod() {
        return this.amortizationMethod;
    }

    public void setAmortizationMethod(Integer amortizationMethod) {
        this.amortizationMethod = amortizationMethod;
    }

    public Integer getTurnoverMaterials() {
        return this.turnoverMaterials;
    }

    public void setTurnoverMaterials(Integer turnoverMaterials) {
        this.turnoverMaterials = turnoverMaterials;
    }

    public Integer getCheckByRevenueManagement() {
        return this.checkByRevenueManagement;
    }

    public Long getOmsWarehouse() {
        return this.omsWarehouse;
    }

    public String getOmsWarehouseCode() {
        return this.omsWarehouseCode;
    }

    public Long getReturnWarehouse() {
        return this.returnWarehouse;
    }

    public String getReturnWarehouseCode() {
        return this.returnWarehouseCode;
    }

    public Long getDeliveryWarehouse() {
        return this.deliveryWarehouse;
    }

    public String getDeliveryWarehouseCode() {
        return this.deliveryWarehouseCode;
    }

    public Long getReceiptWarehouse() {
        return this.receiptWarehouse;
    }

    public String getReceiptWarehouseCode() {
        return this.receiptWarehouseCode;
    }

    public String getOutTaxrate() {
        return this.outTaxrate;
    }

    public String getInTaxrate() {
        return this.inTaxrate;
    }

    public Boolean getIsBatchManage() {
        return this.isBatchManage;
    }

    public Boolean getIsExpiryDateManage() {
        return this.isExpiryDateManage;
    }

    public Integer getIsExpiryDateCalculationMethod() {
        return this.isExpiryDateCalculationMethod;
    }

    public Integer getExpireDateNo() {
        return this.expireDateNo;
    }

    public Integer getExpireDateUnit() {
        return this.expireDateUnit;
    }

    public String getProductBuyer() {
        return this.productBuyer;
    }

    public String getProductBuyerCode() {
        return this.productBuyerCode;
    }

    public BigDecimal getPurchaseOrderQuantity() {
        return this.purchaseOrderQuantity;
    }

    public BigDecimal getPurchaseTimes() {
        return this.purchaseTimes;
    }

    public Integer getFixedLeadTime() {
        return this.fixedLeadTime;
    }

    public String getMeasurementUnit_Code() {
        return this.measurementUnit_Code;
    }

    public String getMeasurementUnit_Name() {
        return this.measurementUnit_Name;
    }

    public Integer getInspectionType() {
        return this.inspectionType;
    }

    public Boolean getWarehousingByResult() {
        return this.warehousingByResult;
    }

    public Integer getTestRule() {
        return this.testRule;
    }

    public Integer getEnableStockPeriodRecheck() {
        return this.enableStockPeriodRecheck;
    }

    public Integer getEnableStockExpireCheck() {
        return this.enableStockExpireCheck;
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

    public Integer getSingleInspection() {
        return this.singleInspection;
    }

    public Integer getManageByInventory() {
        return this.manageByInventory;
    }

    public Integer getProjectTrackStrategy() {
        return this.projectTrackStrategy;
    }

    public Integer getStrategyComparisonRule() {
        return this.strategyComparisonRule;
    }

    public Integer getMtoStrategy() {
        return this.mtoStrategy;
    }

    public BigDecimal getRopStock() {
        return this.ropStock;
    }

    public Integer getPlanMethod() {
        return this.planMethod;
    }

    public Integer getPlanDefaultAttribute() {
        return this.planDefaultAttribute;
    }

    public Boolean getCheckByBatch() {
        return this.checkByBatch;
    }

    public Integer getProcessType() {
        return this.processType;
    }

    public Boolean getIsProcess() {
        return this.isProcess;
    }

    public Integer getInventoryPlanStrategy() {
        return this.inventoryPlanStrategy;
    }

    public Integer getLossType() {
        return this.lossType;
    }

    public Integer getBatchRule() {
        return this.batchRule;
    }

    public BigDecimal getFixedWastage() {
        return this.fixedWastage;
    }

    public BigDecimal getWastageRate() {
        return this.wastageRate;
    }

    public BigDecimal getFixedQuantity() {
        return this.fixedQuantity;
    }

    public BigDecimal getEconomicQuantity() {
        return this.economicQuantity;
    }

    public Boolean getSpecialMaterials() {
        return this.specialMaterials;
    }

    public Boolean getPrepareFeed() {
        return this.prepareFeed;
    }

    public String getSupplyType() {
        return this.supplyType;
    }

    public String getProduceDepartment() {
        return this.produceDepartment;
    }

    public String getProduceDepartment_Code() {
        return this.produceDepartment_Code;
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

    public Integer getDirectProduction() {
        return this.directProduction;
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

    public Boolean getIsSerialNoManage() {
        return this.isSerialNoManage;
    }

    public Integer getInspectionControlPoint() {
        return this.inspectionControlPoint;
    }

    public Boolean getECNControl() {
        return this.ECNControl;
    }

    public Integer getIABCClass() {
        return this.iABCClass;
    }

    public String getDeliveryMethod() {
        return this.deliveryMethod;
    }

    public String getEngineeringDrawingNo() {
        return this.engineeringDrawingNo;
    }

    public Boolean getReservation() {
        return this.reservation;
    }

    public Integer getCheckBySalesOrders() {
        return this.checkBySalesOrders;
    }

    public String getManufacturingStrategy() {
        return this.manufacturingStrategy;
    }

    public void setCheckByRevenueManagement(Integer checkByRevenueManagement) {
        this.checkByRevenueManagement = checkByRevenueManagement;
    }

    public void setOmsWarehouse(Long omsWarehouse) {
        this.omsWarehouse = omsWarehouse;
    }

    public void setOmsWarehouseCode(String omsWarehouseCode) {
        this.omsWarehouseCode = omsWarehouseCode;
    }

    public void setReturnWarehouse(Long returnWarehouse) {
        this.returnWarehouse = returnWarehouse;
    }

    public void setReturnWarehouseCode(String returnWarehouseCode) {
        this.returnWarehouseCode = returnWarehouseCode;
    }

    public void setDeliveryWarehouse(Long deliveryWarehouse) {
        this.deliveryWarehouse = deliveryWarehouse;
    }

    public void setDeliveryWarehouseCode(String deliveryWarehouseCode) {
        this.deliveryWarehouseCode = deliveryWarehouseCode;
    }

    public void setReceiptWarehouse(Long receiptWarehouse) {
        this.receiptWarehouse = receiptWarehouse;
    }

    public void setReceiptWarehouseCode(String receiptWarehouseCode) {
        this.receiptWarehouseCode = receiptWarehouseCode;
    }

    public void setOutTaxrate(String outTaxrate) {
        this.outTaxrate = outTaxrate;
    }

    public void setInTaxrate(String inTaxrate) {
        this.inTaxrate = inTaxrate;
    }

    @JsonProperty(value="isBatchManage")
    public void setIsBatchManage(Boolean isBatchManage) {
        this.isBatchManage = isBatchManage;
    }

    @JsonProperty(value="isExpiryDateManage")
    public void setIsExpiryDateManage(Boolean isExpiryDateManage) {
        this.isExpiryDateManage = isExpiryDateManage;
    }

    @JsonProperty(value="isExpiryDateCalculationMethod")
    public void setIsExpiryDateCalculationMethod(Integer isExpiryDateCalculationMethod) {
        this.isExpiryDateCalculationMethod = isExpiryDateCalculationMethod;
    }

    public void setExpireDateNo(Integer expireDateNo) {
        this.expireDateNo = expireDateNo;
    }

    public void setExpireDateUnit(Integer expireDateUnit) {
        this.expireDateUnit = expireDateUnit;
    }

    public void setProductBuyer(String productBuyer) {
        this.productBuyer = productBuyer;
    }

    public void setProductBuyerCode(String productBuyerCode) {
        this.productBuyerCode = productBuyerCode;
    }

    public void setPurchaseOrderQuantity(BigDecimal purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }

    public void setPurchaseTimes(BigDecimal purchaseTimes) {
        this.purchaseTimes = purchaseTimes;
    }

    public void setFixedLeadTime(Integer fixedLeadTime) {
        this.fixedLeadTime = fixedLeadTime;
    }

    public void setMeasurementUnit_Code(String measurementUnit_Code) {
        this.measurementUnit_Code = measurementUnit_Code;
    }

    public void setMeasurementUnit_Name(String measurementUnit_Name) {
        this.measurementUnit_Name = measurementUnit_Name;
    }

    public void setInspectionType(Integer inspectionType) {
        this.inspectionType = inspectionType;
    }

    public void setWarehousingByResult(Boolean warehousingByResult) {
        this.warehousingByResult = warehousingByResult;
    }

    public void setTestRule(Integer testRule) {
        this.testRule = testRule;
    }

    public void setEnableStockPeriodRecheck(Integer enableStockPeriodRecheck) {
        this.enableStockPeriodRecheck = enableStockPeriodRecheck;
    }

    public void setEnableStockExpireCheck(Integer enableStockExpireCheck) {
        this.enableStockExpireCheck = enableStockExpireCheck;
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

    public void setSingleInspection(Integer singleInspection) {
        this.singleInspection = singleInspection;
    }

    public void setManageByInventory(Integer manageByInventory) {
        this.manageByInventory = manageByInventory;
    }

    public void setProjectTrackStrategy(Integer projectTrackStrategy) {
        this.projectTrackStrategy = projectTrackStrategy;
    }

    public void setStrategyComparisonRule(Integer strategyComparisonRule) {
        this.strategyComparisonRule = strategyComparisonRule;
    }

    public void setMtoStrategy(Integer mtoStrategy) {
        this.mtoStrategy = mtoStrategy;
    }

    public void setRopStock(BigDecimal ropStock) {
        this.ropStock = ropStock;
    }

    public void setPlanMethod(Integer planMethod) {
        this.planMethod = planMethod;
    }

    public void setPlanDefaultAttribute(Integer planDefaultAttribute) {
        this.planDefaultAttribute = planDefaultAttribute;
    }

    public void setCheckByBatch(Boolean checkByBatch) {
        this.checkByBatch = checkByBatch;
    }

    public void setProcessType(Integer processType) {
        this.processType = processType;
    }

    @JsonProperty(value="isProcess")
    public void setIsProcess(Boolean isProcess) {
        this.isProcess = isProcess;
    }

    public void setInventoryPlanStrategy(Integer inventoryPlanStrategy) {
        this.inventoryPlanStrategy = inventoryPlanStrategy;
    }

    public void setLossType(Integer lossType) {
        this.lossType = lossType;
    }

    public void setBatchRule(Integer batchRule) {
        this.batchRule = batchRule;
    }

    public void setFixedWastage(BigDecimal fixedWastage) {
        this.fixedWastage = fixedWastage;
    }

    public void setWastageRate(BigDecimal wastageRate) {
        this.wastageRate = wastageRate;
    }

    public void setFixedQuantity(BigDecimal fixedQuantity) {
        this.fixedQuantity = fixedQuantity;
    }

    public void setEconomicQuantity(BigDecimal economicQuantity) {
        this.economicQuantity = economicQuantity;
    }

    public void setSpecialMaterials(Boolean specialMaterials) {
        this.specialMaterials = specialMaterials;
    }

    public void setPrepareFeed(Boolean prepareFeed) {
        this.prepareFeed = prepareFeed;
    }

    public void setSupplyType(String supplyType) {
        this.supplyType = supplyType;
    }

    public void setProduceDepartment(String produceDepartment) {
        this.produceDepartment = produceDepartment;
    }

    public void setProduceDepartment_Code(String produceDepartment_Code) {
        this.produceDepartment_Code = produceDepartment_Code;
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

    public void setDirectProduction(Integer directProduction) {
        this.directProduction = directProduction;
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

    @JsonProperty(value="isSerialNoManage")
    public void setIsSerialNoManage(Boolean isSerialNoManage) {
        this.isSerialNoManage = isSerialNoManage;
    }

    public void setInspectionControlPoint(Integer inspectionControlPoint) {
        this.inspectionControlPoint = inspectionControlPoint;
    }

    @JsonProperty(value="ECNControl")
    public void setECNControl(Boolean ECNControl) {
        this.ECNControl = ECNControl;
    }

    @JsonProperty(value="iABCClass")
    public void setIABCClass(Integer iABCClass) {
        this.iABCClass = iABCClass;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public void setEngineeringDrawingNo(String engineeringDrawingNo) {
        this.engineeringDrawingNo = engineeringDrawingNo;
    }

    public void setReservation(Boolean reservation) {
        this.reservation = reservation;
    }

    public void setCheckBySalesOrders(Integer checkBySalesOrders) {
        this.checkBySalesOrders = checkBySalesOrders;
    }

    public void setManufacturingStrategy(String manufacturingStrategy) {
        this.manufacturingStrategy = manufacturingStrategy;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductApplyDetailSaveVO)) {
            return false;
        }
        ProductApplyDetailSaveVO other = (ProductApplyDetailSaveVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$iBaseSaleCount = this.getiBaseSaleCount();
        Integer other$iBaseSaleCount = other.getiBaseSaleCount();
        if (this$iBaseSaleCount == null ? other$iBaseSaleCount != null : !((Object)this$iBaseSaleCount).equals(other$iBaseSaleCount)) {
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
        Integer this$checkByRevenueManagement = this.getCheckByRevenueManagement();
        Integer other$checkByRevenueManagement = other.getCheckByRevenueManagement();
        if (this$checkByRevenueManagement == null ? other$checkByRevenueManagement != null : !((Object)this$checkByRevenueManagement).equals(other$checkByRevenueManagement)) {
            return false;
        }
        Long this$omsWarehouse = this.getOmsWarehouse();
        Long other$omsWarehouse = other.getOmsWarehouse();
        if (this$omsWarehouse == null ? other$omsWarehouse != null : !((Object)this$omsWarehouse).equals(other$omsWarehouse)) {
            return false;
        }
        Long this$returnWarehouse = this.getReturnWarehouse();
        Long other$returnWarehouse = other.getReturnWarehouse();
        if (this$returnWarehouse == null ? other$returnWarehouse != null : !((Object)this$returnWarehouse).equals(other$returnWarehouse)) {
            return false;
        }
        Long this$deliveryWarehouse = this.getDeliveryWarehouse();
        Long other$deliveryWarehouse = other.getDeliveryWarehouse();
        if (this$deliveryWarehouse == null ? other$deliveryWarehouse != null : !((Object)this$deliveryWarehouse).equals(other$deliveryWarehouse)) {
            return false;
        }
        Long this$receiptWarehouse = this.getReceiptWarehouse();
        Long other$receiptWarehouse = other.getReceiptWarehouse();
        if (this$receiptWarehouse == null ? other$receiptWarehouse != null : !((Object)this$receiptWarehouse).equals(other$receiptWarehouse)) {
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
        Integer this$isExpiryDateCalculationMethod = this.getIsExpiryDateCalculationMethod();
        Integer other$isExpiryDateCalculationMethod = other.getIsExpiryDateCalculationMethod();
        if (this$isExpiryDateCalculationMethod == null ? other$isExpiryDateCalculationMethod != null : !((Object)this$isExpiryDateCalculationMethod).equals(other$isExpiryDateCalculationMethod)) {
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
        Integer this$fixedLeadTime = this.getFixedLeadTime();
        Integer other$fixedLeadTime = other.getFixedLeadTime();
        if (this$fixedLeadTime == null ? other$fixedLeadTime != null : !((Object)this$fixedLeadTime).equals(other$fixedLeadTime)) {
            return false;
        }
        Integer this$turnoverMaterials = this.getTurnoverMaterials();
        Integer other$turnoverMaterials = other.getTurnoverMaterials();
        if (this$turnoverMaterials == null ? other$turnoverMaterials != null : !((Object)this$turnoverMaterials).equals(other$turnoverMaterials)) {
            return false;
        }
        Integer this$amortizationMethod = this.getAmortizationMethod();
        Integer other$amortizationMethod = other.getAmortizationMethod();
        if (this$amortizationMethod == null ? other$amortizationMethod != null : !((Object)this$amortizationMethod).equals(other$amortizationMethod)) {
            return false;
        }
        Long this$measurementUnit = this.getMeasurementUnit();
        Long other$measurementUnit = other.getMeasurementUnit();
        if (this$measurementUnit == null ? other$measurementUnit != null : !((Object)this$measurementUnit).equals(other$measurementUnit)) {
            return false;
        }
        Integer this$inspectionType = this.getInspectionType();
        Integer other$inspectionType = other.getInspectionType();
        if (this$inspectionType == null ? other$inspectionType != null : !((Object)this$inspectionType).equals(other$inspectionType)) {
            return false;
        }
        Boolean this$warehousingByResult = this.getWarehousingByResult();
        Boolean other$warehousingByResult = other.getWarehousingByResult();
        if (this$warehousingByResult == null ? other$warehousingByResult != null : !((Object)this$warehousingByResult).equals(other$warehousingByResult)) {
            return false;
        }
        Integer this$testRule = this.getTestRule();
        Integer other$testRule = other.getTestRule();
        if (this$testRule == null ? other$testRule != null : !((Object)this$testRule).equals(other$testRule)) {
            return false;
        }
        Integer this$enableStockPeriodRecheck = this.getEnableStockPeriodRecheck();
        Integer other$enableStockPeriodRecheck = other.getEnableStockPeriodRecheck();
        if (this$enableStockPeriodRecheck == null ? other$enableStockPeriodRecheck != null : !((Object)this$enableStockPeriodRecheck).equals(other$enableStockPeriodRecheck)) {
            return false;
        }
        Integer this$enableStockExpireCheck = this.getEnableStockExpireCheck();
        Integer other$enableStockExpireCheck = other.getEnableStockExpireCheck();
        if (this$enableStockExpireCheck == null ? other$enableStockExpireCheck != null : !((Object)this$enableStockExpireCheck).equals(other$enableStockExpireCheck)) {
            return false;
        }
        Integer this$returnInspection = this.getReturnInspection();
        Integer other$returnInspection = other.getReturnInspection();
        if (this$returnInspection == null ? other$returnInspection != null : !((Object)this$returnInspection).equals(other$returnInspection)) {
            return false;
        }
        Integer this$sendInspection = this.getSendInspection();
        Integer other$sendInspection = other.getSendInspection();
        if (this$sendInspection == null ? other$sendInspection != null : !((Object)this$sendInspection).equals(other$sendInspection)) {
            return false;
        }
        Integer this$planCheckDays = this.getPlanCheckDays();
        Integer other$planCheckDays = other.getPlanCheckDays();
        if (this$planCheckDays == null ? other$planCheckDays != null : !((Object)this$planCheckDays).equals(other$planCheckDays)) {
            return false;
        }
        Integer this$singleInspection = this.getSingleInspection();
        Integer other$singleInspection = other.getSingleInspection();
        if (this$singleInspection == null ? other$singleInspection != null : !((Object)this$singleInspection).equals(other$singleInspection)) {
            return false;
        }
        Integer this$manageByInventory = this.getManageByInventory();
        Integer other$manageByInventory = other.getManageByInventory();
        if (this$manageByInventory == null ? other$manageByInventory != null : !((Object)this$manageByInventory).equals(other$manageByInventory)) {
            return false;
        }
        Integer this$projectTrackStrategy = this.getProjectTrackStrategy();
        Integer other$projectTrackStrategy = other.getProjectTrackStrategy();
        if (this$projectTrackStrategy == null ? other$projectTrackStrategy != null : !((Object)this$projectTrackStrategy).equals(other$projectTrackStrategy)) {
            return false;
        }
        Integer this$strategyComparisonRule = this.getStrategyComparisonRule();
        Integer other$strategyComparisonRule = other.getStrategyComparisonRule();
        if (this$strategyComparisonRule == null ? other$strategyComparisonRule != null : !((Object)this$strategyComparisonRule).equals(other$strategyComparisonRule)) {
            return false;
        }
        Integer this$mtoStrategy = this.getMtoStrategy();
        Integer other$mtoStrategy = other.getMtoStrategy();
        if (this$mtoStrategy == null ? other$mtoStrategy != null : !((Object)this$mtoStrategy).equals(other$mtoStrategy)) {
            return false;
        }
        Integer this$planMethod = this.getPlanMethod();
        Integer other$planMethod = other.getPlanMethod();
        if (this$planMethod == null ? other$planMethod != null : !((Object)this$planMethod).equals(other$planMethod)) {
            return false;
        }
        Integer this$planDefaultAttribute = this.getPlanDefaultAttribute();
        Integer other$planDefaultAttribute = other.getPlanDefaultAttribute();
        if (this$planDefaultAttribute == null ? other$planDefaultAttribute != null : !((Object)this$planDefaultAttribute).equals(other$planDefaultAttribute)) {
            return false;
        }
        Boolean this$checkByBatch = this.getCheckByBatch();
        Boolean other$checkByBatch = other.getCheckByBatch();
        if (this$checkByBatch == null ? other$checkByBatch != null : !((Object)this$checkByBatch).equals(other$checkByBatch)) {
            return false;
        }
        Integer this$processType = this.getProcessType();
        Integer other$processType = other.getProcessType();
        if (this$processType == null ? other$processType != null : !((Object)this$processType).equals(other$processType)) {
            return false;
        }
        Boolean this$isProcess = this.getIsProcess();
        Boolean other$isProcess = other.getIsProcess();
        if (this$isProcess == null ? other$isProcess != null : !((Object)this$isProcess).equals(other$isProcess)) {
            return false;
        }
        Integer this$inventoryPlanStrategy = this.getInventoryPlanStrategy();
        Integer other$inventoryPlanStrategy = other.getInventoryPlanStrategy();
        if (this$inventoryPlanStrategy == null ? other$inventoryPlanStrategy != null : !((Object)this$inventoryPlanStrategy).equals(other$inventoryPlanStrategy)) {
            return false;
        }
        Integer this$lossType = this.getLossType();
        Integer other$lossType = other.getLossType();
        if (this$lossType == null ? other$lossType != null : !((Object)this$lossType).equals(other$lossType)) {
            return false;
        }
        Integer this$batchRule = this.getBatchRule();
        Integer other$batchRule = other.getBatchRule();
        if (this$batchRule == null ? other$batchRule != null : !((Object)this$batchRule).equals(other$batchRule)) {
            return false;
        }
        Boolean this$specialMaterials = this.getSpecialMaterials();
        Boolean other$specialMaterials = other.getSpecialMaterials();
        if (this$specialMaterials == null ? other$specialMaterials != null : !((Object)this$specialMaterials).equals(other$specialMaterials)) {
            return false;
        }
        Boolean this$prepareFeed = this.getPrepareFeed();
        Boolean other$prepareFeed = other.getPrepareFeed();
        if (this$prepareFeed == null ? other$prepareFeed != null : !((Object)this$prepareFeed).equals(other$prepareFeed)) {
            return false;
        }
        Integer this$businessAttributePurchase = this.getBusinessAttributePurchase();
        Integer other$businessAttributePurchase = other.getBusinessAttributePurchase();
        if (this$businessAttributePurchase == null ? other$businessAttributePurchase != null : !((Object)this$businessAttributePurchase).equals(other$businessAttributePurchase)) {
            return false;
        }
        Integer this$businessAttributeSale = this.getBusinessAttributeSale();
        Integer other$businessAttributeSale = other.getBusinessAttributeSale();
        if (this$businessAttributeSale == null ? other$businessAttributeSale != null : !((Object)this$businessAttributeSale).equals(other$businessAttributeSale)) {
            return false;
        }
        Integer this$businessAttributeSelfCreate = this.getBusinessAttributeSelfCreate();
        Integer other$businessAttributeSelfCreate = other.getBusinessAttributeSelfCreate();
        if (this$businessAttributeSelfCreate == null ? other$businessAttributeSelfCreate != null : !((Object)this$businessAttributeSelfCreate).equals(other$businessAttributeSelfCreate)) {
            return false;
        }
        Integer this$businessAttributeOutSourcing = this.getBusinessAttributeOutSourcing();
        Integer other$businessAttributeOutSourcing = other.getBusinessAttributeOutSourcing();
        if (this$businessAttributeOutSourcing == null ? other$businessAttributeOutSourcing != null : !((Object)this$businessAttributeOutSourcing).equals(other$businessAttributeOutSourcing)) {
            return false;
        }
        Integer this$directProduction = this.getDirectProduction();
        Integer other$directProduction = other.getDirectProduction();
        if (this$directProduction == null ? other$directProduction != null : !((Object)this$directProduction).equals(other$directProduction)) {
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
        Integer this$productInspection = this.getProductInspection();
        Integer other$productInspection = other.getProductInspection();
        if (this$productInspection == null ? other$productInspection != null : !((Object)this$productInspection).equals(other$productInspection)) {
            return false;
        }
        Integer this$productInspectionCtrlPoint = this.getProductInspectionCtrlPoint();
        Integer other$productInspectionCtrlPoint = other.getProductInspectionCtrlPoint();
        if (this$productInspectionCtrlPoint == null ? other$productInspectionCtrlPoint != null : !((Object)this$productInspectionCtrlPoint).equals(other$productInspectionCtrlPoint)) {
            return false;
        }
        Integer this$outSourceInspection = this.getOutSourceInspection();
        Integer other$outSourceInspection = other.getOutSourceInspection();
        if (this$outSourceInspection == null ? other$outSourceInspection != null : !((Object)this$outSourceInspection).equals(other$outSourceInspection)) {
            return false;
        }
        Integer this$outSourceInspectionCtrlPoint = this.getOutSourceInspectionCtrlPoint();
        Integer other$outSourceInspectionCtrlPoint = other.getOutSourceInspectionCtrlPoint();
        if (this$outSourceInspectionCtrlPoint == null ? other$outSourceInspectionCtrlPoint != null : !((Object)this$outSourceInspectionCtrlPoint).equals(other$outSourceInspectionCtrlPoint)) {
            return false;
        }
        Integer this$transferInspection = this.getTransferInspection();
        Integer other$transferInspection = other.getTransferInspection();
        if (this$transferInspection == null ? other$transferInspection != null : !((Object)this$transferInspection).equals(other$transferInspection)) {
            return false;
        }
        Integer this$transferInspectionCtrlPoint = this.getTransferInspectionCtrlPoint();
        Integer other$transferInspectionCtrlPoint = other.getTransferInspectionCtrlPoint();
        if (this$transferInspectionCtrlPoint == null ? other$transferInspectionCtrlPoint != null : !((Object)this$transferInspectionCtrlPoint).equals(other$transferInspectionCtrlPoint)) {
            return false;
        }
        Integer this$productFirstInspection = this.getProductFirstInspection();
        Integer other$productFirstInspection = other.getProductFirstInspection();
        if (this$productFirstInspection == null ? other$productFirstInspection != null : !((Object)this$productFirstInspection).equals(other$productFirstInspection)) {
            return false;
        }
        Integer this$firstInspectionCtrlMethod = this.getFirstInspectionCtrlMethod();
        Integer other$firstInspectionCtrlMethod = other.getFirstInspectionCtrlMethod();
        if (this$firstInspectionCtrlMethod == null ? other$firstInspectionCtrlMethod != null : !((Object)this$firstInspectionCtrlMethod).equals(other$firstInspectionCtrlMethod)) {
            return false;
        }
        Integer this$sendInspectionCtrlPoint = this.getSendInspectionCtrlPoint();
        Integer other$sendInspectionCtrlPoint = other.getSendInspectionCtrlPoint();
        if (this$sendInspectionCtrlPoint == null ? other$sendInspectionCtrlPoint != null : !((Object)this$sendInspectionCtrlPoint).equals(other$sendInspectionCtrlPoint)) {
            return false;
        }
        Integer this$returnInspectionCtrlPoint = this.getReturnInspectionCtrlPoint();
        Integer other$returnInspectionCtrlPoint = other.getReturnInspectionCtrlPoint();
        if (this$returnInspectionCtrlPoint == null ? other$returnInspectionCtrlPoint != null : !((Object)this$returnInspectionCtrlPoint).equals(other$returnInspectionCtrlPoint)) {
            return false;
        }
        Boolean this$isSerialNoManage = this.getIsSerialNoManage();
        Boolean other$isSerialNoManage = other.getIsSerialNoManage();
        if (this$isSerialNoManage == null ? other$isSerialNoManage != null : !((Object)this$isSerialNoManage).equals(other$isSerialNoManage)) {
            return false;
        }
        Integer this$inspectionControlPoint = this.getInspectionControlPoint();
        Integer other$inspectionControlPoint = other.getInspectionControlPoint();
        if (this$inspectionControlPoint == null ? other$inspectionControlPoint != null : !((Object)this$inspectionControlPoint).equals(other$inspectionControlPoint)) {
            return false;
        }
        Boolean this$ECNControl = this.getECNControl();
        Boolean other$ECNControl = other.getECNControl();
        if (this$ECNControl == null ? other$ECNControl != null : !((Object)this$ECNControl).equals(other$ECNControl)) {
            return false;
        }
        Integer this$iABCClass = this.getIABCClass();
        Integer other$iABCClass = other.getIABCClass();
        if (this$iABCClass == null ? other$iABCClass != null : !((Object)this$iABCClass).equals(other$iABCClass)) {
            return false;
        }
        Boolean this$reservation = this.getReservation();
        Boolean other$reservation = other.getReservation();
        if (this$reservation == null ? other$reservation != null : !((Object)this$reservation).equals(other$reservation)) {
            return false;
        }
        Integer this$checkBySalesOrders = this.getCheckBySalesOrders();
        Integer other$checkBySalesOrders = other.getCheckBySalesOrders();
        if (this$checkBySalesOrders == null ? other$checkBySalesOrders != null : !((Object)this$checkBySalesOrders).equals(other$checkBySalesOrders)) {
            return false;
        }
        String this$shortName = this.getShortName();
        String other$shortName = other.getShortName();
        if (this$shortName == null ? other$shortName != null : !this$shortName.equals(other$shortName)) {
            return false;
        }
        BigDecimal this$fNoTaxCostPrice = this.getfNoTaxCostPrice();
        BigDecimal other$fNoTaxCostPrice = other.getfNoTaxCostPrice();
        if (this$fNoTaxCostPrice == null ? other$fNoTaxCostPrice != null : !((Object)this$fNoTaxCostPrice).equals(other$fNoTaxCostPrice)) {
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
        String this$receiptName = this.getReceiptName();
        String other$receiptName = other.getReceiptName();
        if (this$receiptName == null ? other$receiptName != null : !this$receiptName.equals(other$receiptName)) {
            return false;
        }
        String this$receiptSpec = this.getReceiptSpec();
        String other$receiptSpec = other.getReceiptSpec();
        if (this$receiptSpec == null ? other$receiptSpec != null : !this$receiptSpec.equals(other$receiptSpec)) {
            return false;
        }
        String this$receiptModel = this.getReceiptModel();
        String other$receiptModel = other.getReceiptModel();
        if (this$receiptModel == null ? other$receiptModel != null : !this$receiptModel.equals(other$receiptModel)) {
            return false;
        }
        BigDecimal this$fMarkPrice = this.getfMarkPrice();
        BigDecimal other$fMarkPrice = other.getfMarkPrice();
        if (this$fMarkPrice == null ? other$fMarkPrice != null : !((Object)this$fMarkPrice).equals(other$fMarkPrice)) {
            return false;
        }
        BigDecimal this$fSalePrice = this.getfSalePrice();
        BigDecimal other$fSalePrice = other.getfSalePrice();
        if (this$fSalePrice == null ? other$fSalePrice != null : !((Object)this$fSalePrice).equals(other$fSalePrice)) {
            return false;
        }
        BigDecimal this$fMarketPrice = this.getfMarketPrice();
        BigDecimal other$fMarketPrice = other.getfMarketPrice();
        if (this$fMarketPrice == null ? other$fMarketPrice != null : !((Object)this$fMarketPrice).equals(other$fMarketPrice)) {
            return false;
        }
        BigDecimal this$fPrimeCosts = this.getfPrimeCosts();
        BigDecimal other$fPrimeCosts = other.getfPrimeCosts();
        if (this$fPrimeCosts == null ? other$fPrimeCosts != null : !((Object)this$fPrimeCosts).equals(other$fPrimeCosts)) {
            return false;
        }
        BigDecimal this$safetyStock = this.getSafetyStock();
        BigDecimal other$safetyStock = other.getSafetyStock();
        if (this$safetyStock == null ? other$safetyStock != null : !((Object)this$safetyStock).equals(other$safetyStock)) {
            return false;
        }
        BigDecimal this$highestStock = this.getHighestStock();
        BigDecimal other$highestStock = other.getHighestStock();
        if (this$highestStock == null ? other$highestStock != null : !((Object)this$highestStock).equals(other$highestStock)) {
            return false;
        }
        BigDecimal this$lowestStock = this.getLowestStock();
        BigDecimal other$lowestStock = other.getLowestStock();
        if (this$lowestStock == null ? other$lowestStock != null : !((Object)this$lowestStock).equals(other$lowestStock)) {
            return false;
        }
        BigDecimal this$arrivalAllowErrorLimit = this.getArrivalAllowErrorLimit();
        BigDecimal other$arrivalAllowErrorLimit = other.getArrivalAllowErrorLimit();
        if (this$arrivalAllowErrorLimit == null ? other$arrivalAllowErrorLimit != null : !((Object)this$arrivalAllowErrorLimit).equals(other$arrivalAllowErrorLimit)) {
            return false;
        }
        BigDecimal this$invoiceAllowErrorLimit = this.getInvoiceAllowErrorLimit();
        BigDecimal other$invoiceAllowErrorLimit = other.getInvoiceAllowErrorLimit();
        if (this$invoiceAllowErrorLimit == null ? other$invoiceAllowErrorLimit != null : !((Object)this$invoiceAllowErrorLimit).equals(other$invoiceAllowErrorLimit)) {
            return false;
        }
        BigDecimal this$inStoreLessLimit = this.getInStoreLessLimit();
        BigDecimal other$inStoreLessLimit = other.getInStoreLessLimit();
        if (this$inStoreLessLimit == null ? other$inStoreLessLimit != null : !((Object)this$inStoreLessLimit).equals(other$inStoreLessLimit)) {
            return false;
        }
        BigDecimal this$outStoreLessLimit = this.getOutStoreLessLimit();
        BigDecimal other$outStoreLessLimit = other.getOutStoreLessLimit();
        if (this$outStoreLessLimit == null ? other$outStoreLessLimit != null : !((Object)this$outStoreLessLimit).equals(other$outStoreLessLimit)) {
            return false;
        }
        BigDecimal this$storageLossRate = this.getStorageLossRate();
        BigDecimal other$storageLossRate = other.getStorageLossRate();
        if (this$storageLossRate == null ? other$storageLossRate != null : !((Object)this$storageLossRate).equals(other$storageLossRate)) {
            return false;
        }
        BigDecimal this$lInventoryCount = this.getlInventoryCount();
        BigDecimal other$lInventoryCount = other.getlInventoryCount();
        if (this$lInventoryCount == null ? other$lInventoryCount != null : !((Object)this$lInventoryCount).equals(other$lInventoryCount)) {
            return false;
        }
        BigDecimal this$fSettleAccountsRate = this.getfSettleAccountsRate();
        BigDecimal other$fSettleAccountsRate = other.getfSettleAccountsRate();
        if (this$fSettleAccountsRate == null ? other$fSettleAccountsRate != null : !((Object)this$fSettleAccountsRate).equals(other$fSettleAccountsRate)) {
            return false;
        }
        BigDecimal this$leadTimeCoefficient = this.getLeadTimeCoefficient();
        BigDecimal other$leadTimeCoefficient = other.getLeadTimeCoefficient();
        if (this$leadTimeCoefficient == null ? other$leadTimeCoefficient != null : !((Object)this$leadTimeCoefficient).equals(other$leadTimeCoefficient)) {
            return false;
        }
        BigDecimal this$leadTimeQuantity = this.getLeadTimeQuantity();
        BigDecimal other$leadTimeQuantity = other.getLeadTimeQuantity();
        if (this$leadTimeQuantity == null ? other$leadTimeQuantity != null : !((Object)this$leadTimeQuantity).equals(other$leadTimeQuantity)) {
            return false;
        }
        BigDecimal this$rejectRate = this.getRejectRate();
        BigDecimal other$rejectRate = other.getRejectRate();
        if (this$rejectRate == null ? other$rejectRate != null : !((Object)this$rejectRate).equals(other$rejectRate)) {
            return false;
        }
        Map<String, Object> this$productExtendCharacterDef = this.getProductExtendCharacterDef();
        Map<String, Object> other$productExtendCharacterDef = other.getProductExtendCharacterDef();
        if (this$productExtendCharacterDef == null ? other$productExtendCharacterDef != null : !((Object)this$productExtendCharacterDef).equals(other$productExtendCharacterDef)) {
            return false;
        }
        String this$omsWarehouseCode = this.getOmsWarehouseCode();
        String other$omsWarehouseCode = other.getOmsWarehouseCode();
        if (this$omsWarehouseCode == null ? other$omsWarehouseCode != null : !this$omsWarehouseCode.equals(other$omsWarehouseCode)) {
            return false;
        }
        String this$returnWarehouseCode = this.getReturnWarehouseCode();
        String other$returnWarehouseCode = other.getReturnWarehouseCode();
        if (this$returnWarehouseCode == null ? other$returnWarehouseCode != null : !this$returnWarehouseCode.equals(other$returnWarehouseCode)) {
            return false;
        }
        String this$deliveryWarehouseCode = this.getDeliveryWarehouseCode();
        String other$deliveryWarehouseCode = other.getDeliveryWarehouseCode();
        if (this$deliveryWarehouseCode == null ? other$deliveryWarehouseCode != null : !this$deliveryWarehouseCode.equals(other$deliveryWarehouseCode)) {
            return false;
        }
        String this$receiptWarehouseCode = this.getReceiptWarehouseCode();
        String other$receiptWarehouseCode = other.getReceiptWarehouseCode();
        if (this$receiptWarehouseCode == null ? other$receiptWarehouseCode != null : !this$receiptWarehouseCode.equals(other$receiptWarehouseCode)) {
            return false;
        }
        String this$outTaxrate = this.getOutTaxrate();
        String other$outTaxrate = other.getOutTaxrate();
        if (this$outTaxrate == null ? other$outTaxrate != null : !this$outTaxrate.equals(other$outTaxrate)) {
            return false;
        }
        String this$inTaxrate = this.getInTaxrate();
        String other$inTaxrate = other.getInTaxrate();
        if (this$inTaxrate == null ? other$inTaxrate != null : !this$inTaxrate.equals(other$inTaxrate)) {
            return false;
        }
        String this$productBuyer = this.getProductBuyer();
        String other$productBuyer = other.getProductBuyer();
        if (this$productBuyer == null ? other$productBuyer != null : !this$productBuyer.equals(other$productBuyer)) {
            return false;
        }
        String this$productBuyerCode = this.getProductBuyerCode();
        String other$productBuyerCode = other.getProductBuyerCode();
        if (this$productBuyerCode == null ? other$productBuyerCode != null : !this$productBuyerCode.equals(other$productBuyerCode)) {
            return false;
        }
        BigDecimal this$purchaseOrderQuantity = this.getPurchaseOrderQuantity();
        BigDecimal other$purchaseOrderQuantity = other.getPurchaseOrderQuantity();
        if (this$purchaseOrderQuantity == null ? other$purchaseOrderQuantity != null : !((Object)this$purchaseOrderQuantity).equals(other$purchaseOrderQuantity)) {
            return false;
        }
        BigDecimal this$purchaseTimes = this.getPurchaseTimes();
        BigDecimal other$purchaseTimes = other.getPurchaseTimes();
        if (this$purchaseTimes == null ? other$purchaseTimes != null : !((Object)this$purchaseTimes).equals(other$purchaseTimes)) {
            return false;
        }
        BigDecimal this$measurementCount = this.getMeasurementCount();
        BigDecimal other$measurementCount = other.getMeasurementCount();
        if (this$measurementCount == null ? other$measurementCount != null : !((Object)this$measurementCount).equals(other$measurementCount)) {
            return false;
        }
        String this$measurementUnit_Code = this.getMeasurementUnit_Code();
        String other$measurementUnit_Code = other.getMeasurementUnit_Code();
        if (this$measurementUnit_Code == null ? other$measurementUnit_Code != null : !this$measurementUnit_Code.equals(other$measurementUnit_Code)) {
            return false;
        }
        String this$measurementUnit_Name = this.getMeasurementUnit_Name();
        String other$measurementUnit_Name = other.getMeasurementUnit_Name();
        if (this$measurementUnit_Name == null ? other$measurementUnit_Name != null : !this$measurementUnit_Name.equals(other$measurementUnit_Name)) {
            return false;
        }
        BigDecimal this$compensationAmount = this.getCompensationAmount();
        BigDecimal other$compensationAmount = other.getCompensationAmount();
        if (this$compensationAmount == null ? other$compensationAmount != null : !((Object)this$compensationAmount).equals(other$compensationAmount)) {
            return false;
        }
        BigDecimal this$moldingTime = this.getMoldingTime();
        BigDecimal other$moldingTime = other.getMoldingTime();
        if (this$moldingTime == null ? other$moldingTime != null : !((Object)this$moldingTime).equals(other$moldingTime)) {
            return false;
        }
        BigDecimal this$moldCavities = this.getMoldCavities();
        BigDecimal other$moldCavities = other.getMoldCavities();
        if (this$moldCavities == null ? other$moldCavities != null : !((Object)this$moldCavities).equals(other$moldCavities)) {
            return false;
        }
        BigDecimal this$ropStock = this.getRopStock();
        BigDecimal other$ropStock = other.getRopStock();
        if (this$ropStock == null ? other$ropStock != null : !((Object)this$ropStock).equals(other$ropStock)) {
            return false;
        }
        BigDecimal this$fixedWastage = this.getFixedWastage();
        BigDecimal other$fixedWastage = other.getFixedWastage();
        if (this$fixedWastage == null ? other$fixedWastage != null : !((Object)this$fixedWastage).equals(other$fixedWastage)) {
            return false;
        }
        BigDecimal this$wastageRate = this.getWastageRate();
        BigDecimal other$wastageRate = other.getWastageRate();
        if (this$wastageRate == null ? other$wastageRate != null : !((Object)this$wastageRate).equals(other$wastageRate)) {
            return false;
        }
        BigDecimal this$fixedQuantity = this.getFixedQuantity();
        BigDecimal other$fixedQuantity = other.getFixedQuantity();
        if (this$fixedQuantity == null ? other$fixedQuantity != null : !((Object)this$fixedQuantity).equals(other$fixedQuantity)) {
            return false;
        }
        BigDecimal this$economicQuantity = this.getEconomicQuantity();
        BigDecimal other$economicQuantity = other.getEconomicQuantity();
        if (this$economicQuantity == null ? other$economicQuantity != null : !((Object)this$economicQuantity).equals(other$economicQuantity)) {
            return false;
        }
        String this$supplyType = this.getSupplyType();
        String other$supplyType = other.getSupplyType();
        if (this$supplyType == null ? other$supplyType != null : !this$supplyType.equals(other$supplyType)) {
            return false;
        }
        String this$produceDepartment = this.getProduceDepartment();
        String other$produceDepartment = other.getProduceDepartment();
        if (this$produceDepartment == null ? other$produceDepartment != null : !this$produceDepartment.equals(other$produceDepartment)) {
            return false;
        }
        String this$produceDepartment_Code = this.getProduceDepartment_Code();
        String other$produceDepartment_Code = other.getProduceDepartment_Code();
        if (this$produceDepartment_Code == null ? other$produceDepartment_Code != null : !this$produceDepartment_Code.equals(other$produceDepartment_Code)) {
            return false;
        }
        String this$businessAttribute = this.getBusinessAttribute();
        String other$businessAttribute = other.getBusinessAttribute();
        if (this$businessAttribute == null ? other$businessAttribute != null : !this$businessAttribute.equals(other$businessAttribute)) {
            return false;
        }
        String this$deliveryMethod = this.getDeliveryMethod();
        String other$deliveryMethod = other.getDeliveryMethod();
        if (this$deliveryMethod == null ? other$deliveryMethod != null : !this$deliveryMethod.equals(other$deliveryMethod)) {
            return false;
        }
        String this$engineeringDrawingNo = this.getEngineeringDrawingNo();
        String other$engineeringDrawingNo = other.getEngineeringDrawingNo();
        if (this$engineeringDrawingNo == null ? other$engineeringDrawingNo != null : !this$engineeringDrawingNo.equals(other$engineeringDrawingNo)) {
            return false;
        }
        String this$manufacturingStrategy = this.getManufacturingStrategy();
        String other$manufacturingStrategy = other.getManufacturingStrategy();
        return !(this$manufacturingStrategy == null ? other$manufacturingStrategy != null : !this$manufacturingStrategy.equals(other$manufacturingStrategy));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductApplyDetailSaveVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $iBaseSaleCount = this.getiBaseSaleCount();
        result = result * 59 + ($iBaseSaleCount == null ? 43 : ((Object)$iBaseSaleCount).hashCode());
        Integer $frontLeadTime = this.getFrontLeadTime();
        result = result * 59 + ($frontLeadTime == null ? 43 : ((Object)$frontLeadTime).hashCode());
        Integer $behindLeadTime = this.getBehindLeadTime();
        result = result * 59 + ($behindLeadTime == null ? 43 : ((Object)$behindLeadTime).hashCode());
        Integer $checkByRevenueManagement = this.getCheckByRevenueManagement();
        result = result * 59 + ($checkByRevenueManagement == null ? 43 : ((Object)$checkByRevenueManagement).hashCode());
        Long $omsWarehouse = this.getOmsWarehouse();
        result = result * 59 + ($omsWarehouse == null ? 43 : ((Object)$omsWarehouse).hashCode());
        Long $returnWarehouse = this.getReturnWarehouse();
        result = result * 59 + ($returnWarehouse == null ? 43 : ((Object)$returnWarehouse).hashCode());
        Long $deliveryWarehouse = this.getDeliveryWarehouse();
        result = result * 59 + ($deliveryWarehouse == null ? 43 : ((Object)$deliveryWarehouse).hashCode());
        Long $receiptWarehouse = this.getReceiptWarehouse();
        result = result * 59 + ($receiptWarehouse == null ? 43 : ((Object)$receiptWarehouse).hashCode());
        Boolean $isBatchManage = this.getIsBatchManage();
        result = result * 59 + ($isBatchManage == null ? 43 : ((Object)$isBatchManage).hashCode());
        Boolean $isExpiryDateManage = this.getIsExpiryDateManage();
        result = result * 59 + ($isExpiryDateManage == null ? 43 : ((Object)$isExpiryDateManage).hashCode());
        Integer $isExpiryDateCalculationMethod = this.getIsExpiryDateCalculationMethod();
        result = result * 59 + ($isExpiryDateCalculationMethod == null ? 43 : ((Object)$isExpiryDateCalculationMethod).hashCode());
        Integer $expireDateNo = this.getExpireDateNo();
        result = result * 59 + ($expireDateNo == null ? 43 : ((Object)$expireDateNo).hashCode());
        Integer $expireDateUnit = this.getExpireDateUnit();
        result = result * 59 + ($expireDateUnit == null ? 43 : ((Object)$expireDateUnit).hashCode());
        Integer $fixedLeadTime = this.getFixedLeadTime();
        result = result * 59 + ($fixedLeadTime == null ? 43 : ((Object)$fixedLeadTime).hashCode());
        Integer $turnoverMaterials = this.getTurnoverMaterials();
        result = result * 59 + ($turnoverMaterials == null ? 43 : ((Object)$turnoverMaterials).hashCode());
        Integer $amortizationMethod = this.getAmortizationMethod();
        result = result * 59 + ($amortizationMethod == null ? 43 : ((Object)$amortizationMethod).hashCode());
        Long $measurementUnit = this.getMeasurementUnit();
        result = result * 59 + ($measurementUnit == null ? 43 : ((Object)$measurementUnit).hashCode());
        Integer $inspectionType = this.getInspectionType();
        result = result * 59 + ($inspectionType == null ? 43 : ((Object)$inspectionType).hashCode());
        Boolean $warehousingByResult = this.getWarehousingByResult();
        result = result * 59 + ($warehousingByResult == null ? 43 : ((Object)$warehousingByResult).hashCode());
        Integer $testRule = this.getTestRule();
        result = result * 59 + ($testRule == null ? 43 : ((Object)$testRule).hashCode());
        Integer $enableStockPeriodRecheck = this.getEnableStockPeriodRecheck();
        result = result * 59 + ($enableStockPeriodRecheck == null ? 43 : ((Object)$enableStockPeriodRecheck).hashCode());
        Integer $enableStockExpireCheck = this.getEnableStockExpireCheck();
        result = result * 59 + ($enableStockExpireCheck == null ? 43 : ((Object)$enableStockExpireCheck).hashCode());
        Integer $returnInspection = this.getReturnInspection();
        result = result * 59 + ($returnInspection == null ? 43 : ((Object)$returnInspection).hashCode());
        Integer $sendInspection = this.getSendInspection();
        result = result * 59 + ($sendInspection == null ? 43 : ((Object)$sendInspection).hashCode());
        Integer $planCheckDays = this.getPlanCheckDays();
        result = result * 59 + ($planCheckDays == null ? 43 : ((Object)$planCheckDays).hashCode());
        Integer $singleInspection = this.getSingleInspection();
        result = result * 59 + ($singleInspection == null ? 43 : ((Object)$singleInspection).hashCode());
        Integer $manageByInventory = this.getManageByInventory();
        result = result * 59 + ($manageByInventory == null ? 43 : ((Object)$manageByInventory).hashCode());
        Integer $projectTrackStrategy = this.getProjectTrackStrategy();
        result = result * 59 + ($projectTrackStrategy == null ? 43 : ((Object)$projectTrackStrategy).hashCode());
        Integer $strategyComparisonRule = this.getStrategyComparisonRule();
        result = result * 59 + ($strategyComparisonRule == null ? 43 : ((Object)$strategyComparisonRule).hashCode());
        Integer $mtoStrategy = this.getMtoStrategy();
        result = result * 59 + ($mtoStrategy == null ? 43 : ((Object)$mtoStrategy).hashCode());
        Integer $planMethod = this.getPlanMethod();
        result = result * 59 + ($planMethod == null ? 43 : ((Object)$planMethod).hashCode());
        Integer $planDefaultAttribute = this.getPlanDefaultAttribute();
        result = result * 59 + ($planDefaultAttribute == null ? 43 : ((Object)$planDefaultAttribute).hashCode());
        Boolean $checkByBatch = this.getCheckByBatch();
        result = result * 59 + ($checkByBatch == null ? 43 : ((Object)$checkByBatch).hashCode());
        Integer $processType = this.getProcessType();
        result = result * 59 + ($processType == null ? 43 : ((Object)$processType).hashCode());
        Boolean $isProcess = this.getIsProcess();
        result = result * 59 + ($isProcess == null ? 43 : ((Object)$isProcess).hashCode());
        Integer $inventoryPlanStrategy = this.getInventoryPlanStrategy();
        result = result * 59 + ($inventoryPlanStrategy == null ? 43 : ((Object)$inventoryPlanStrategy).hashCode());
        Integer $lossType = this.getLossType();
        result = result * 59 + ($lossType == null ? 43 : ((Object)$lossType).hashCode());
        Integer $batchRule = this.getBatchRule();
        result = result * 59 + ($batchRule == null ? 43 : ((Object)$batchRule).hashCode());
        Boolean $specialMaterials = this.getSpecialMaterials();
        result = result * 59 + ($specialMaterials == null ? 43 : ((Object)$specialMaterials).hashCode());
        Boolean $prepareFeed = this.getPrepareFeed();
        result = result * 59 + ($prepareFeed == null ? 43 : ((Object)$prepareFeed).hashCode());
        Integer $businessAttributePurchase = this.getBusinessAttributePurchase();
        result = result * 59 + ($businessAttributePurchase == null ? 43 : ((Object)$businessAttributePurchase).hashCode());
        Integer $businessAttributeSale = this.getBusinessAttributeSale();
        result = result * 59 + ($businessAttributeSale == null ? 43 : ((Object)$businessAttributeSale).hashCode());
        Integer $businessAttributeSelfCreate = this.getBusinessAttributeSelfCreate();
        result = result * 59 + ($businessAttributeSelfCreate == null ? 43 : ((Object)$businessAttributeSelfCreate).hashCode());
        Integer $businessAttributeOutSourcing = this.getBusinessAttributeOutSourcing();
        result = result * 59 + ($businessAttributeOutSourcing == null ? 43 : ((Object)$businessAttributeOutSourcing).hashCode());
        Integer $directProduction = this.getDirectProduction();
        result = result * 59 + ($directProduction == null ? 43 : ((Object)$directProduction).hashCode());
        Integer $demandConsolidation = this.getDemandConsolidation();
        result = result * 59 + ($demandConsolidation == null ? 43 : ((Object)$demandConsolidation).hashCode());
        Integer $demandConsolidationType = this.getDemandConsolidationType();
        result = result * 59 + ($demandConsolidationType == null ? 43 : ((Object)$demandConsolidationType).hashCode());
        Integer $demandConsolidationUnit = this.getDemandConsolidationUnit();
        result = result * 59 + ($demandConsolidationUnit == null ? 43 : ((Object)$demandConsolidationUnit).hashCode());
        Integer $demandConsolidationNumber = this.getDemandConsolidationNumber();
        result = result * 59 + ($demandConsolidationNumber == null ? 43 : ((Object)$demandConsolidationNumber).hashCode());
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
        Boolean $isSerialNoManage = this.getIsSerialNoManage();
        result = result * 59 + ($isSerialNoManage == null ? 43 : ((Object)$isSerialNoManage).hashCode());
        Integer $inspectionControlPoint = this.getInspectionControlPoint();
        result = result * 59 + ($inspectionControlPoint == null ? 43 : ((Object)$inspectionControlPoint).hashCode());
        Boolean $ECNControl = this.getECNControl();
        result = result * 59 + ($ECNControl == null ? 43 : ((Object)$ECNControl).hashCode());
        Integer $iABCClass = this.getIABCClass();
        result = result * 59 + ($iABCClass == null ? 43 : ((Object)$iABCClass).hashCode());
        Boolean $reservation = this.getReservation();
        result = result * 59 + ($reservation == null ? 43 : ((Object)$reservation).hashCode());
        Integer $checkBySalesOrders = this.getCheckBySalesOrders();
        result = result * 59 + ($checkBySalesOrders == null ? 43 : ((Object)$checkBySalesOrders).hashCode());
        String $shortName = this.getShortName();
        result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
        BigDecimal $fNoTaxCostPrice = this.getfNoTaxCostPrice();
        result = result * 59 + ($fNoTaxCostPrice == null ? 43 : ((Object)$fNoTaxCostPrice).hashCode());
        String $mnemonicCode = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : $mnemonicCode.hashCode());
        String $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : $barCode.hashCode());
        String $receiptName = this.getReceiptName();
        result = result * 59 + ($receiptName == null ? 43 : $receiptName.hashCode());
        String $receiptSpec = this.getReceiptSpec();
        result = result * 59 + ($receiptSpec == null ? 43 : $receiptSpec.hashCode());
        String $receiptModel = this.getReceiptModel();
        result = result * 59 + ($receiptModel == null ? 43 : $receiptModel.hashCode());
        BigDecimal $fMarkPrice = this.getfMarkPrice();
        result = result * 59 + ($fMarkPrice == null ? 43 : ((Object)$fMarkPrice).hashCode());
        BigDecimal $fSalePrice = this.getfSalePrice();
        result = result * 59 + ($fSalePrice == null ? 43 : ((Object)$fSalePrice).hashCode());
        BigDecimal $fMarketPrice = this.getfMarketPrice();
        result = result * 59 + ($fMarketPrice == null ? 43 : ((Object)$fMarketPrice).hashCode());
        BigDecimal $fPrimeCosts = this.getfPrimeCosts();
        result = result * 59 + ($fPrimeCosts == null ? 43 : ((Object)$fPrimeCosts).hashCode());
        BigDecimal $safetyStock = this.getSafetyStock();
        result = result * 59 + ($safetyStock == null ? 43 : ((Object)$safetyStock).hashCode());
        BigDecimal $highestStock = this.getHighestStock();
        result = result * 59 + ($highestStock == null ? 43 : ((Object)$highestStock).hashCode());
        BigDecimal $lowestStock = this.getLowestStock();
        result = result * 59 + ($lowestStock == null ? 43 : ((Object)$lowestStock).hashCode());
        BigDecimal $arrivalAllowErrorLimit = this.getArrivalAllowErrorLimit();
        result = result * 59 + ($arrivalAllowErrorLimit == null ? 43 : ((Object)$arrivalAllowErrorLimit).hashCode());
        BigDecimal $invoiceAllowErrorLimit = this.getInvoiceAllowErrorLimit();
        result = result * 59 + ($invoiceAllowErrorLimit == null ? 43 : ((Object)$invoiceAllowErrorLimit).hashCode());
        BigDecimal $inStoreLessLimit = this.getInStoreLessLimit();
        result = result * 59 + ($inStoreLessLimit == null ? 43 : ((Object)$inStoreLessLimit).hashCode());
        BigDecimal $outStoreLessLimit = this.getOutStoreLessLimit();
        result = result * 59 + ($outStoreLessLimit == null ? 43 : ((Object)$outStoreLessLimit).hashCode());
        BigDecimal $storageLossRate = this.getStorageLossRate();
        result = result * 59 + ($storageLossRate == null ? 43 : ((Object)$storageLossRate).hashCode());
        BigDecimal $lInventoryCount = this.getlInventoryCount();
        result = result * 59 + ($lInventoryCount == null ? 43 : ((Object)$lInventoryCount).hashCode());
        BigDecimal $fSettleAccountsRate = this.getfSettleAccountsRate();
        result = result * 59 + ($fSettleAccountsRate == null ? 43 : ((Object)$fSettleAccountsRate).hashCode());
        BigDecimal $leadTimeCoefficient = this.getLeadTimeCoefficient();
        result = result * 59 + ($leadTimeCoefficient == null ? 43 : ((Object)$leadTimeCoefficient).hashCode());
        BigDecimal $leadTimeQuantity = this.getLeadTimeQuantity();
        result = result * 59 + ($leadTimeQuantity == null ? 43 : ((Object)$leadTimeQuantity).hashCode());
        BigDecimal $rejectRate = this.getRejectRate();
        result = result * 59 + ($rejectRate == null ? 43 : ((Object)$rejectRate).hashCode());
        Map<String, Object> $productExtendCharacterDef = this.getProductExtendCharacterDef();
        result = result * 59 + ($productExtendCharacterDef == null ? 43 : ((Object)$productExtendCharacterDef).hashCode());
        String $omsWarehouseCode = this.getOmsWarehouseCode();
        result = result * 59 + ($omsWarehouseCode == null ? 43 : $omsWarehouseCode.hashCode());
        String $returnWarehouseCode = this.getReturnWarehouseCode();
        result = result * 59 + ($returnWarehouseCode == null ? 43 : $returnWarehouseCode.hashCode());
        String $deliveryWarehouseCode = this.getDeliveryWarehouseCode();
        result = result * 59 + ($deliveryWarehouseCode == null ? 43 : $deliveryWarehouseCode.hashCode());
        String $receiptWarehouseCode = this.getReceiptWarehouseCode();
        result = result * 59 + ($receiptWarehouseCode == null ? 43 : $receiptWarehouseCode.hashCode());
        String $outTaxrate = this.getOutTaxrate();
        result = result * 59 + ($outTaxrate == null ? 43 : $outTaxrate.hashCode());
        String $inTaxrate = this.getInTaxrate();
        result = result * 59 + ($inTaxrate == null ? 43 : $inTaxrate.hashCode());
        String $productBuyer = this.getProductBuyer();
        result = result * 59 + ($productBuyer == null ? 43 : $productBuyer.hashCode());
        String $productBuyerCode = this.getProductBuyerCode();
        result = result * 59 + ($productBuyerCode == null ? 43 : $productBuyerCode.hashCode());
        BigDecimal $purchaseOrderQuantity = this.getPurchaseOrderQuantity();
        result = result * 59 + ($purchaseOrderQuantity == null ? 43 : ((Object)$purchaseOrderQuantity).hashCode());
        BigDecimal $purchaseTimes = this.getPurchaseTimes();
        result = result * 59 + ($purchaseTimes == null ? 43 : ((Object)$purchaseTimes).hashCode());
        BigDecimal $measurementCount = this.getMeasurementCount();
        result = result * 59 + ($measurementCount == null ? 43 : ((Object)$measurementCount).hashCode());
        String $measurementUnit_Code = this.getMeasurementUnit_Code();
        result = result * 59 + ($measurementUnit_Code == null ? 43 : $measurementUnit_Code.hashCode());
        String $measurementUnit_Name = this.getMeasurementUnit_Name();
        result = result * 59 + ($measurementUnit_Name == null ? 43 : $measurementUnit_Name.hashCode());
        BigDecimal $compensationAmount = this.getCompensationAmount();
        result = result * 59 + ($compensationAmount == null ? 43 : ((Object)$compensationAmount).hashCode());
        BigDecimal $moldingTime = this.getMoldingTime();
        result = result * 59 + ($moldingTime == null ? 43 : ((Object)$moldingTime).hashCode());
        BigDecimal $moldCavities = this.getMoldCavities();
        result = result * 59 + ($moldCavities == null ? 43 : ((Object)$moldCavities).hashCode());
        BigDecimal $ropStock = this.getRopStock();
        result = result * 59 + ($ropStock == null ? 43 : ((Object)$ropStock).hashCode());
        BigDecimal $fixedWastage = this.getFixedWastage();
        result = result * 59 + ($fixedWastage == null ? 43 : ((Object)$fixedWastage).hashCode());
        BigDecimal $wastageRate = this.getWastageRate();
        result = result * 59 + ($wastageRate == null ? 43 : ((Object)$wastageRate).hashCode());
        BigDecimal $fixedQuantity = this.getFixedQuantity();
        result = result * 59 + ($fixedQuantity == null ? 43 : ((Object)$fixedQuantity).hashCode());
        BigDecimal $economicQuantity = this.getEconomicQuantity();
        result = result * 59 + ($economicQuantity == null ? 43 : ((Object)$economicQuantity).hashCode());
        String $supplyType = this.getSupplyType();
        result = result * 59 + ($supplyType == null ? 43 : $supplyType.hashCode());
        String $produceDepartment = this.getProduceDepartment();
        result = result * 59 + ($produceDepartment == null ? 43 : $produceDepartment.hashCode());
        String $produceDepartment_Code = this.getProduceDepartment_Code();
        result = result * 59 + ($produceDepartment_Code == null ? 43 : $produceDepartment_Code.hashCode());
        String $businessAttribute = this.getBusinessAttribute();
        result = result * 59 + ($businessAttribute == null ? 43 : $businessAttribute.hashCode());
        String $deliveryMethod = this.getDeliveryMethod();
        result = result * 59 + ($deliveryMethod == null ? 43 : $deliveryMethod.hashCode());
        String $engineeringDrawingNo = this.getEngineeringDrawingNo();
        result = result * 59 + ($engineeringDrawingNo == null ? 43 : $engineeringDrawingNo.hashCode());
        String $manufacturingStrategy = this.getManufacturingStrategy();
        result = result * 59 + ($manufacturingStrategy == null ? 43 : $manufacturingStrategy.hashCode());
        return result;
    }

    public String toString() {
        return "ProductApplyDetailSaveVO(shortName=" + this.getShortName() + ", fNoTaxCostPrice=" + this.getfNoTaxCostPrice() + ", mnemonicCode=" + this.getMnemonicCode() + ", barCode=" + this.getBarCode() + ", receiptName=" + this.getReceiptName() + ", receiptSpec=" + this.getReceiptSpec() + ", receiptModel=" + this.getReceiptModel() + ", fMarkPrice=" + this.getfMarkPrice() + ", fSalePrice=" + this.getfSalePrice() + ", fMarketPrice=" + this.getfMarketPrice() + ", fPrimeCosts=" + this.getfPrimeCosts() + ", safetyStock=" + this.getSafetyStock() + ", highestStock=" + this.getHighestStock() + ", lowestStock=" + this.getLowestStock() + ", arrivalAllowErrorLimit=" + this.getArrivalAllowErrorLimit() + ", invoiceAllowErrorLimit=" + this.getInvoiceAllowErrorLimit() + ", inStoreLessLimit=" + this.getInStoreLessLimit() + ", outStoreLessLimit=" + this.getOutStoreLessLimit() + ", storageLossRate=" + this.getStorageLossRate() + ", lInventoryCount=" + this.getlInventoryCount() + ", fSettleAccountsRate=" + this.getfSettleAccountsRate() + ", iBaseSaleCount=" + this.getiBaseSaleCount() + ", frontLeadTime=" + this.getFrontLeadTime() + ", behindLeadTime=" + this.getBehindLeadTime() + ", leadTimeCoefficient=" + this.getLeadTimeCoefficient() + ", leadTimeQuantity=" + this.getLeadTimeQuantity() + ", rejectRate=" + this.getRejectRate() + ", productExtendCharacterDef=" + this.getProductExtendCharacterDef() + ", checkByRevenueManagement=" + this.getCheckByRevenueManagement() + ", omsWarehouse=" + this.getOmsWarehouse() + ", omsWarehouseCode=" + this.getOmsWarehouseCode() + ", returnWarehouse=" + this.getReturnWarehouse() + ", returnWarehouseCode=" + this.getReturnWarehouseCode() + ", deliveryWarehouse=" + this.getDeliveryWarehouse() + ", deliveryWarehouseCode=" + this.getDeliveryWarehouseCode() + ", receiptWarehouse=" + this.getReceiptWarehouse() + ", receiptWarehouseCode=" + this.getReceiptWarehouseCode() + ", outTaxrate=" + this.getOutTaxrate() + ", inTaxrate=" + this.getInTaxrate() + ", isBatchManage=" + this.getIsBatchManage() + ", isExpiryDateManage=" + this.getIsExpiryDateManage() + ", isExpiryDateCalculationMethod=" + this.getIsExpiryDateCalculationMethod() + ", expireDateNo=" + this.getExpireDateNo() + ", expireDateUnit=" + this.getExpireDateUnit() + ", productBuyer=" + this.getProductBuyer() + ", productBuyerCode=" + this.getProductBuyerCode() + ", purchaseOrderQuantity=" + this.getPurchaseOrderQuantity() + ", purchaseTimes=" + this.getPurchaseTimes() + ", fixedLeadTime=" + this.getFixedLeadTime() + ", turnoverMaterials=" + this.getTurnoverMaterials() + ", amortizationMethod=" + this.getAmortizationMethod() + ", measurementCount=" + this.getMeasurementCount() + ", measurementUnit=" + this.getMeasurementUnit() + ", measurementUnit_Code=" + this.getMeasurementUnit_Code() + ", measurementUnit_Name=" + this.getMeasurementUnit_Name() + ", compensationAmount=" + this.getCompensationAmount() + ", moldingTime=" + this.getMoldingTime() + ", moldCavities=" + this.getMoldCavities() + ", inspectionType=" + this.getInspectionType() + ", warehousingByResult=" + this.getWarehousingByResult() + ", testRule=" + this.getTestRule() + ", enableStockPeriodRecheck=" + this.getEnableStockPeriodRecheck() + ", enableStockExpireCheck=" + this.getEnableStockExpireCheck() + ", returnInspection=" + this.getReturnInspection() + ", sendInspection=" + this.getSendInspection() + ", planCheckDays=" + this.getPlanCheckDays() + ", singleInspection=" + this.getSingleInspection() + ", manageByInventory=" + this.getManageByInventory() + ", projectTrackStrategy=" + this.getProjectTrackStrategy() + ", strategyComparisonRule=" + this.getStrategyComparisonRule() + ", mtoStrategy=" + this.getMtoStrategy() + ", ropStock=" + this.getRopStock() + ", planMethod=" + this.getPlanMethod() + ", planDefaultAttribute=" + this.getPlanDefaultAttribute() + ", checkByBatch=" + this.getCheckByBatch() + ", processType=" + this.getProcessType() + ", isProcess=" + this.getIsProcess() + ", inventoryPlanStrategy=" + this.getInventoryPlanStrategy() + ", lossType=" + this.getLossType() + ", batchRule=" + this.getBatchRule() + ", fixedWastage=" + this.getFixedWastage() + ", wastageRate=" + this.getWastageRate() + ", fixedQuantity=" + this.getFixedQuantity() + ", economicQuantity=" + this.getEconomicQuantity() + ", specialMaterials=" + this.getSpecialMaterials() + ", prepareFeed=" + this.getPrepareFeed() + ", supplyType=" + this.getSupplyType() + ", produceDepartment=" + this.getProduceDepartment() + ", produceDepartment_Code=" + this.getProduceDepartment_Code() + ", businessAttribute=" + this.getBusinessAttribute() + ", businessAttributePurchase=" + this.getBusinessAttributePurchase() + ", businessAttributeSale=" + this.getBusinessAttributeSale() + ", businessAttributeSelfCreate=" + this.getBusinessAttributeSelfCreate() + ", businessAttributeOutSourcing=" + this.getBusinessAttributeOutSourcing() + ", directProduction=" + this.getDirectProduction() + ", demandConsolidation=" + this.getDemandConsolidation() + ", demandConsolidationType=" + this.getDemandConsolidationType() + ", demandConsolidationUnit=" + this.getDemandConsolidationUnit() + ", demandConsolidationNumber=" + this.getDemandConsolidationNumber() + ", productInspection=" + this.getProductInspection() + ", productInspectionCtrlPoint=" + this.getProductInspectionCtrlPoint() + ", outSourceInspection=" + this.getOutSourceInspection() + ", outSourceInspectionCtrlPoint=" + this.getOutSourceInspectionCtrlPoint() + ", transferInspection=" + this.getTransferInspection() + ", transferInspectionCtrlPoint=" + this.getTransferInspectionCtrlPoint() + ", productFirstInspection=" + this.getProductFirstInspection() + ", firstInspectionCtrlMethod=" + this.getFirstInspectionCtrlMethod() + ", sendInspectionCtrlPoint=" + this.getSendInspectionCtrlPoint() + ", returnInspectionCtrlPoint=" + this.getReturnInspectionCtrlPoint() + ", isSerialNoManage=" + this.getIsSerialNoManage() + ", inspectionControlPoint=" + this.getInspectionControlPoint() + ", ECNControl=" + this.getECNControl() + ", iABCClass=" + this.getIABCClass() + ", deliveryMethod=" + this.getDeliveryMethod() + ", engineeringDrawingNo=" + this.getEngineeringDrawingNo() + ", reservation=" + this.getReservation() + ", checkBySalesOrders=" + this.getCheckBySalesOrders() + ", manufacturingStrategy=" + this.getManufacturingStrategy() + ")";
    }
}

