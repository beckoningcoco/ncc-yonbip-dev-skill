/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonProperty
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class ProductApplyDataDetail
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String shortName;
    @JsonProperty(value="fNoTaxCostPrice")
    private BigDecimal fNoTaxCostPrice;
    private String mnemonicCode;
    private String barCode;
    private String receiptName;
    private String receiptSpec;
    private String receiptModel;
    @JsonProperty(value="fMarkPrice")
    private BigDecimal fMarkPrice;
    @JsonProperty(value="fSalePrice")
    private BigDecimal fSalePrice;
    @JsonProperty(value="fMarketPrice")
    private BigDecimal fMarketPrice;
    @JsonProperty(value="fPrimeCosts")
    private BigDecimal fPrimeCosts;
    private BigDecimal safetyStock;
    private BigDecimal highestStock;
    private BigDecimal lowestStock;
    private BigDecimal arrivalAllowErrorLimit;
    private BigDecimal invoiceAllowErrorLimit;
    private BigDecimal inStoreLessLimit;
    private BigDecimal outStoreLessLimit;
    private BigDecimal storageLossRate;
    @JsonProperty(value="lInventoryCount")
    private BigDecimal lInventoryCount;
    @JsonProperty(value="fSettleAccountsRate")
    private BigDecimal fSettleAccountsRate;
    @JsonProperty(value="iBaseSaleCount")
    private Integer iBaseSaleCount;
    private Integer frontLeadTime;
    private Integer behindLeadTime;
    private BigDecimal leadTimeCoefficient;
    private BigDecimal leadTimeQuantity;
    private BigDecimal rejectRate;
    private Map<String, Object> productExtendCharacterDef;
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
    @JsonProperty(value="isBatchManage")
    private Boolean isBatchManage;
    private Integer inventoryPlanStrategy;
    private Integer lossType;
    private Integer batchRule;
    private BigDecimal fixedWastage;
    private BigDecimal wastageRate;
    private BigDecimal fixedQuantity;
    private BigDecimal economicQuantity;
    private Boolean specialMaterials;
    private Boolean prepareFeed;
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
    private String engineeringDrawingNo;
    private String inTaxrate;
    private String outTaxrate;
    private String produceDepartment;
    private String produceDepartment_Code;
    private Boolean reservation;
    private Integer checkBySalesOrders;
    private String manufacturingStrategy;
    private List<String> changeProperties;

    public String getShortName() {
        return this.shortName;
    }

    public BigDecimal getFNoTaxCostPrice() {
        return this.fNoTaxCostPrice;
    }

    public String getMnemonicCode() {
        return this.mnemonicCode;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public String getReceiptName() {
        return this.receiptName;
    }

    public String getReceiptSpec() {
        return this.receiptSpec;
    }

    public String getReceiptModel() {
        return this.receiptModel;
    }

    public BigDecimal getFMarkPrice() {
        return this.fMarkPrice;
    }

    public BigDecimal getFSalePrice() {
        return this.fSalePrice;
    }

    public BigDecimal getFMarketPrice() {
        return this.fMarketPrice;
    }

    public BigDecimal getFPrimeCosts() {
        return this.fPrimeCosts;
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

    public BigDecimal getArrivalAllowErrorLimit() {
        return this.arrivalAllowErrorLimit;
    }

    public BigDecimal getInvoiceAllowErrorLimit() {
        return this.invoiceAllowErrorLimit;
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

    public BigDecimal getLInventoryCount() {
        return this.lInventoryCount;
    }

    public BigDecimal getFSettleAccountsRate() {
        return this.fSettleAccountsRate;
    }

    public Integer getIBaseSaleCount() {
        return this.iBaseSaleCount;
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

    public BigDecimal getRejectRate() {
        return this.rejectRate;
    }

    public Map<String, Object> getProductExtendCharacterDef() {
        return this.productExtendCharacterDef;
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

    public String getMeasurementUnit_Code() {
        return this.measurementUnit_Code;
    }

    public String getMeasurementUnit_Name() {
        return this.measurementUnit_Name;
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

    public Boolean getIsBatchManage() {
        return this.isBatchManage;
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

    public String getEngineeringDrawingNo() {
        return this.engineeringDrawingNo;
    }

    public String getInTaxrate() {
        return this.inTaxrate;
    }

    public String getOutTaxrate() {
        return this.outTaxrate;
    }

    public String getProduceDepartment() {
        return this.produceDepartment;
    }

    public String getProduceDepartment_Code() {
        return this.produceDepartment_Code;
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

    public List<String> getChangeProperties() {
        return this.changeProperties;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @JsonProperty(value="fNoTaxCostPrice")
    public void setFNoTaxCostPrice(BigDecimal fNoTaxCostPrice) {
        this.fNoTaxCostPrice = fNoTaxCostPrice;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setReceiptName(String receiptName) {
        this.receiptName = receiptName;
    }

    public void setReceiptSpec(String receiptSpec) {
        this.receiptSpec = receiptSpec;
    }

    public void setReceiptModel(String receiptModel) {
        this.receiptModel = receiptModel;
    }

    @JsonProperty(value="fMarkPrice")
    public void setFMarkPrice(BigDecimal fMarkPrice) {
        this.fMarkPrice = fMarkPrice;
    }

    @JsonProperty(value="fSalePrice")
    public void setFSalePrice(BigDecimal fSalePrice) {
        this.fSalePrice = fSalePrice;
    }

    @JsonProperty(value="fMarketPrice")
    public void setFMarketPrice(BigDecimal fMarketPrice) {
        this.fMarketPrice = fMarketPrice;
    }

    @JsonProperty(value="fPrimeCosts")
    public void setFPrimeCosts(BigDecimal fPrimeCosts) {
        this.fPrimeCosts = fPrimeCosts;
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

    public void setArrivalAllowErrorLimit(BigDecimal arrivalAllowErrorLimit) {
        this.arrivalAllowErrorLimit = arrivalAllowErrorLimit;
    }

    public void setInvoiceAllowErrorLimit(BigDecimal invoiceAllowErrorLimit) {
        this.invoiceAllowErrorLimit = invoiceAllowErrorLimit;
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

    @JsonProperty(value="lInventoryCount")
    public void setLInventoryCount(BigDecimal lInventoryCount) {
        this.lInventoryCount = lInventoryCount;
    }

    @JsonProperty(value="fSettleAccountsRate")
    public void setFSettleAccountsRate(BigDecimal fSettleAccountsRate) {
        this.fSettleAccountsRate = fSettleAccountsRate;
    }

    @JsonProperty(value="iBaseSaleCount")
    public void setIBaseSaleCount(Integer iBaseSaleCount) {
        this.iBaseSaleCount = iBaseSaleCount;
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

    public void setRejectRate(BigDecimal rejectRate) {
        this.rejectRate = rejectRate;
    }

    public void setProductExtendCharacterDef(Map<String, Object> productExtendCharacterDef) {
        this.productExtendCharacterDef = productExtendCharacterDef;
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

    public void setMeasurementUnit_Code(String measurementUnit_Code) {
        this.measurementUnit_Code = measurementUnit_Code;
    }

    public void setMeasurementUnit_Name(String measurementUnit_Name) {
        this.measurementUnit_Name = measurementUnit_Name;
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

    @JsonProperty(value="isBatchManage")
    public void setIsBatchManage(Boolean isBatchManage) {
        this.isBatchManage = isBatchManage;
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

    public void setEngineeringDrawingNo(String engineeringDrawingNo) {
        this.engineeringDrawingNo = engineeringDrawingNo;
    }

    public void setInTaxrate(String inTaxrate) {
        this.inTaxrate = inTaxrate;
    }

    public void setOutTaxrate(String outTaxrate) {
        this.outTaxrate = outTaxrate;
    }

    public void setProduceDepartment(String produceDepartment) {
        this.produceDepartment = produceDepartment;
    }

    public void setProduceDepartment_Code(String produceDepartment_Code) {
        this.produceDepartment_Code = produceDepartment_Code;
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

    public void setChangeProperties(List<String> changeProperties) {
        this.changeProperties = changeProperties;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductApplyDataDetail)) {
            return false;
        }
        ProductApplyDataDetail other = (ProductApplyDataDetail)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$iBaseSaleCount = this.getIBaseSaleCount();
        Integer other$iBaseSaleCount = other.getIBaseSaleCount();
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
        Boolean this$isBatchManage = this.getIsBatchManage();
        Boolean other$isBatchManage = other.getIsBatchManage();
        if (this$isBatchManage == null ? other$isBatchManage != null : !((Object)this$isBatchManage).equals(other$isBatchManage)) {
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
        Integer this$inspectionControlPoint = this.getInspectionControlPoint();
        Integer other$inspectionControlPoint = other.getInspectionControlPoint();
        if (this$inspectionControlPoint == null ? other$inspectionControlPoint != null : !((Object)this$inspectionControlPoint).equals(other$inspectionControlPoint)) {
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
        BigDecimal this$fNoTaxCostPrice = this.getFNoTaxCostPrice();
        BigDecimal other$fNoTaxCostPrice = other.getFNoTaxCostPrice();
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
        BigDecimal this$fMarkPrice = this.getFMarkPrice();
        BigDecimal other$fMarkPrice = other.getFMarkPrice();
        if (this$fMarkPrice == null ? other$fMarkPrice != null : !((Object)this$fMarkPrice).equals(other$fMarkPrice)) {
            return false;
        }
        BigDecimal this$fSalePrice = this.getFSalePrice();
        BigDecimal other$fSalePrice = other.getFSalePrice();
        if (this$fSalePrice == null ? other$fSalePrice != null : !((Object)this$fSalePrice).equals(other$fSalePrice)) {
            return false;
        }
        BigDecimal this$fMarketPrice = this.getFMarketPrice();
        BigDecimal other$fMarketPrice = other.getFMarketPrice();
        if (this$fMarketPrice == null ? other$fMarketPrice != null : !((Object)this$fMarketPrice).equals(other$fMarketPrice)) {
            return false;
        }
        BigDecimal this$fPrimeCosts = this.getFPrimeCosts();
        BigDecimal other$fPrimeCosts = other.getFPrimeCosts();
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
        BigDecimal this$lInventoryCount = this.getLInventoryCount();
        BigDecimal other$lInventoryCount = other.getLInventoryCount();
        if (this$lInventoryCount == null ? other$lInventoryCount != null : !((Object)this$lInventoryCount).equals(other$lInventoryCount)) {
            return false;
        }
        BigDecimal this$fSettleAccountsRate = this.getFSettleAccountsRate();
        BigDecimal other$fSettleAccountsRate = other.getFSettleAccountsRate();
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
        String this$engineeringDrawingNo = this.getEngineeringDrawingNo();
        String other$engineeringDrawingNo = other.getEngineeringDrawingNo();
        if (this$engineeringDrawingNo == null ? other$engineeringDrawingNo != null : !this$engineeringDrawingNo.equals(other$engineeringDrawingNo)) {
            return false;
        }
        String this$inTaxrate = this.getInTaxrate();
        String other$inTaxrate = other.getInTaxrate();
        if (this$inTaxrate == null ? other$inTaxrate != null : !this$inTaxrate.equals(other$inTaxrate)) {
            return false;
        }
        String this$outTaxrate = this.getOutTaxrate();
        String other$outTaxrate = other.getOutTaxrate();
        if (this$outTaxrate == null ? other$outTaxrate != null : !this$outTaxrate.equals(other$outTaxrate)) {
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
        String this$manufacturingStrategy = this.getManufacturingStrategy();
        String other$manufacturingStrategy = other.getManufacturingStrategy();
        if (this$manufacturingStrategy == null ? other$manufacturingStrategy != null : !this$manufacturingStrategy.equals(other$manufacturingStrategy)) {
            return false;
        }
        List<String> this$changeProperties = this.getChangeProperties();
        List<String> other$changeProperties = other.getChangeProperties();
        return !(this$changeProperties == null ? other$changeProperties != null : !((Object)this$changeProperties).equals(other$changeProperties));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductApplyDataDetail;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $iBaseSaleCount = this.getIBaseSaleCount();
        result = result * 59 + ($iBaseSaleCount == null ? 43 : ((Object)$iBaseSaleCount).hashCode());
        Integer $frontLeadTime = this.getFrontLeadTime();
        result = result * 59 + ($frontLeadTime == null ? 43 : ((Object)$frontLeadTime).hashCode());
        Integer $behindLeadTime = this.getBehindLeadTime();
        result = result * 59 + ($behindLeadTime == null ? 43 : ((Object)$behindLeadTime).hashCode());
        Integer $fixedLeadTime = this.getFixedLeadTime();
        result = result * 59 + ($fixedLeadTime == null ? 43 : ((Object)$fixedLeadTime).hashCode());
        Integer $turnoverMaterials = this.getTurnoverMaterials();
        result = result * 59 + ($turnoverMaterials == null ? 43 : ((Object)$turnoverMaterials).hashCode());
        Integer $amortizationMethod = this.getAmortizationMethod();
        result = result * 59 + ($amortizationMethod == null ? 43 : ((Object)$amortizationMethod).hashCode());
        Long $measurementUnit = this.getMeasurementUnit();
        result = result * 59 + ($measurementUnit == null ? 43 : ((Object)$measurementUnit).hashCode());
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
        Boolean $isBatchManage = this.getIsBatchManage();
        result = result * 59 + ($isBatchManage == null ? 43 : ((Object)$isBatchManage).hashCode());
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
        Boolean $reservation = this.getReservation();
        result = result * 59 + ($reservation == null ? 43 : ((Object)$reservation).hashCode());
        Integer $checkBySalesOrders = this.getCheckBySalesOrders();
        result = result * 59 + ($checkBySalesOrders == null ? 43 : ((Object)$checkBySalesOrders).hashCode());
        String $shortName = this.getShortName();
        result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
        BigDecimal $fNoTaxCostPrice = this.getFNoTaxCostPrice();
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
        BigDecimal $fMarkPrice = this.getFMarkPrice();
        result = result * 59 + ($fMarkPrice == null ? 43 : ((Object)$fMarkPrice).hashCode());
        BigDecimal $fSalePrice = this.getFSalePrice();
        result = result * 59 + ($fSalePrice == null ? 43 : ((Object)$fSalePrice).hashCode());
        BigDecimal $fMarketPrice = this.getFMarketPrice();
        result = result * 59 + ($fMarketPrice == null ? 43 : ((Object)$fMarketPrice).hashCode());
        BigDecimal $fPrimeCosts = this.getFPrimeCosts();
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
        BigDecimal $lInventoryCount = this.getLInventoryCount();
        result = result * 59 + ($lInventoryCount == null ? 43 : ((Object)$lInventoryCount).hashCode());
        BigDecimal $fSettleAccountsRate = this.getFSettleAccountsRate();
        result = result * 59 + ($fSettleAccountsRate == null ? 43 : ((Object)$fSettleAccountsRate).hashCode());
        BigDecimal $leadTimeCoefficient = this.getLeadTimeCoefficient();
        result = result * 59 + ($leadTimeCoefficient == null ? 43 : ((Object)$leadTimeCoefficient).hashCode());
        BigDecimal $leadTimeQuantity = this.getLeadTimeQuantity();
        result = result * 59 + ($leadTimeQuantity == null ? 43 : ((Object)$leadTimeQuantity).hashCode());
        BigDecimal $rejectRate = this.getRejectRate();
        result = result * 59 + ($rejectRate == null ? 43 : ((Object)$rejectRate).hashCode());
        Map<String, Object> $productExtendCharacterDef = this.getProductExtendCharacterDef();
        result = result * 59 + ($productExtendCharacterDef == null ? 43 : ((Object)$productExtendCharacterDef).hashCode());
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
        String $engineeringDrawingNo = this.getEngineeringDrawingNo();
        result = result * 59 + ($engineeringDrawingNo == null ? 43 : $engineeringDrawingNo.hashCode());
        String $inTaxrate = this.getInTaxrate();
        result = result * 59 + ($inTaxrate == null ? 43 : $inTaxrate.hashCode());
        String $outTaxrate = this.getOutTaxrate();
        result = result * 59 + ($outTaxrate == null ? 43 : $outTaxrate.hashCode());
        String $produceDepartment = this.getProduceDepartment();
        result = result * 59 + ($produceDepartment == null ? 43 : $produceDepartment.hashCode());
        String $produceDepartment_Code = this.getProduceDepartment_Code();
        result = result * 59 + ($produceDepartment_Code == null ? 43 : $produceDepartment_Code.hashCode());
        String $manufacturingStrategy = this.getManufacturingStrategy();
        result = result * 59 + ($manufacturingStrategy == null ? 43 : $manufacturingStrategy.hashCode());
        List<String> $changeProperties = this.getChangeProperties();
        result = result * 59 + ($changeProperties == null ? 43 : ((Object)$changeProperties).hashCode());
        return result;
    }

    public String toString() {
        return "ProductApplyDataDetail(shortName=" + this.getShortName() + ", fNoTaxCostPrice=" + this.getFNoTaxCostPrice() + ", mnemonicCode=" + this.getMnemonicCode() + ", barCode=" + this.getBarCode() + ", receiptName=" + this.getReceiptName() + ", receiptSpec=" + this.getReceiptSpec() + ", receiptModel=" + this.getReceiptModel() + ", fMarkPrice=" + this.getFMarkPrice() + ", fSalePrice=" + this.getFSalePrice() + ", fMarketPrice=" + this.getFMarketPrice() + ", fPrimeCosts=" + this.getFPrimeCosts() + ", safetyStock=" + this.getSafetyStock() + ", highestStock=" + this.getHighestStock() + ", lowestStock=" + this.getLowestStock() + ", arrivalAllowErrorLimit=" + this.getArrivalAllowErrorLimit() + ", invoiceAllowErrorLimit=" + this.getInvoiceAllowErrorLimit() + ", inStoreLessLimit=" + this.getInStoreLessLimit() + ", outStoreLessLimit=" + this.getOutStoreLessLimit() + ", storageLossRate=" + this.getStorageLossRate() + ", lInventoryCount=" + this.getLInventoryCount() + ", fSettleAccountsRate=" + this.getFSettleAccountsRate() + ", iBaseSaleCount=" + this.getIBaseSaleCount() + ", frontLeadTime=" + this.getFrontLeadTime() + ", behindLeadTime=" + this.getBehindLeadTime() + ", leadTimeCoefficient=" + this.getLeadTimeCoefficient() + ", leadTimeQuantity=" + this.getLeadTimeQuantity() + ", rejectRate=" + this.getRejectRate() + ", productExtendCharacterDef=" + this.getProductExtendCharacterDef() + ", productBuyer=" + this.getProductBuyer() + ", productBuyerCode=" + this.getProductBuyerCode() + ", purchaseOrderQuantity=" + this.getPurchaseOrderQuantity() + ", purchaseTimes=" + this.getPurchaseTimes() + ", fixedLeadTime=" + this.getFixedLeadTime() + ", turnoverMaterials=" + this.getTurnoverMaterials() + ", amortizationMethod=" + this.getAmortizationMethod() + ", measurementCount=" + this.getMeasurementCount() + ", measurementUnit=" + this.getMeasurementUnit() + ", measurementUnit_Code=" + this.getMeasurementUnit_Code() + ", measurementUnit_Name=" + this.getMeasurementUnit_Name() + ", compensationAmount=" + this.getCompensationAmount() + ", moldingTime=" + this.getMoldingTime() + ", moldCavities=" + this.getMoldCavities() + ", manageByInventory=" + this.getManageByInventory() + ", projectTrackStrategy=" + this.getProjectTrackStrategy() + ", strategyComparisonRule=" + this.getStrategyComparisonRule() + ", mtoStrategy=" + this.getMtoStrategy() + ", ropStock=" + this.getRopStock() + ", planMethod=" + this.getPlanMethod() + ", planDefaultAttribute=" + this.getPlanDefaultAttribute() + ", checkByBatch=" + this.getCheckByBatch() + ", processType=" + this.getProcessType() + ", isProcess=" + this.getIsProcess() + ", isBatchManage=" + this.getIsBatchManage() + ", inventoryPlanStrategy=" + this.getInventoryPlanStrategy() + ", lossType=" + this.getLossType() + ", batchRule=" + this.getBatchRule() + ", fixedWastage=" + this.getFixedWastage() + ", wastageRate=" + this.getWastageRate() + ", fixedQuantity=" + this.getFixedQuantity() + ", economicQuantity=" + this.getEconomicQuantity() + ", specialMaterials=" + this.getSpecialMaterials() + ", prepareFeed=" + this.getPrepareFeed() + ", productInspection=" + this.getProductInspection() + ", productInspectionCtrlPoint=" + this.getProductInspectionCtrlPoint() + ", outSourceInspection=" + this.getOutSourceInspection() + ", outSourceInspectionCtrlPoint=" + this.getOutSourceInspectionCtrlPoint() + ", transferInspection=" + this.getTransferInspection() + ", transferInspectionCtrlPoint=" + this.getTransferInspectionCtrlPoint() + ", productFirstInspection=" + this.getProductFirstInspection() + ", firstInspectionCtrlMethod=" + this.getFirstInspectionCtrlMethod() + ", sendInspectionCtrlPoint=" + this.getSendInspectionCtrlPoint() + ", returnInspectionCtrlPoint=" + this.getReturnInspectionCtrlPoint() + ", inspectionControlPoint=" + this.getInspectionControlPoint() + ", engineeringDrawingNo=" + this.getEngineeringDrawingNo() + ", inTaxrate=" + this.getInTaxrate() + ", outTaxrate=" + this.getOutTaxrate() + ", produceDepartment=" + this.getProduceDepartment() + ", produceDepartment_Code=" + this.getProduceDepartment_Code() + ", reservation=" + this.getReservation() + ", checkBySalesOrders=" + this.getCheckBySalesOrders() + ", manufacturingStrategy=" + this.getManufacturingStrategy() + ", changeProperties=" + this.getChangeProperties() + ")";
    }
}

