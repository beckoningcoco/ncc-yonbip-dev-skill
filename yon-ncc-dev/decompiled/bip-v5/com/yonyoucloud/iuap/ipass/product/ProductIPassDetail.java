/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductIPassDetail
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String shortName;
    private String mnemonicCode;
    private String erpOuterCode;
    private String barCode;
    private Object productExtendCharacterDef;
    private Integer inspectionType;
    private Boolean warehousingByResult;
    private Integer testRule;
    private String businessAttribute;
    private String saleChannel;
    private Long purchaseUnit;
    private String purchaseUnitCode;
    private Long inspectionUnit;
    private String inspectionUnitCode;
    private Long purchasePriceUnit;
    private String purchasePriceUnitCode;
    private Long stockUnit;
    private String stockUnitCode;
    private Long produceUnit;
    private String produceUnitCode;
    private Long batchPriceUnit;
    private String batchPriceUnitCode;
    private Long batchUnit;
    private String batchUnitCode;
    private Long onlineUnit;
    private String onlineUnitCode;
    private Long offlineUnit;
    private String offlineUnitCode;
    private Long requireUnit;
    private String requireUnitCode;
    private BigDecimal markPrice;
    private BigDecimal salePrice;
    private BigDecimal marketPrice;
    private Boolean displayPrice;
    private String priceAreaMessage;
    private MultilingualVO receiptName;
    private String incomeTaxRates;
    private String incomeTaxRatesCode;
    private String outputTaxRate;
    private String outTaxRateCode;
    private Long order;
    private Boolean stopstatus;
    private Boolean storeOffAndOffState;
    private Boolean orderLoadAndUnloadStatus;
    private Long productVendor;
    private String productVendorCode;
    private String productBuyer;
    private String productBuyerCode;
    private BigDecimal primeCosts;
    private BigDecimal maxPrimeCosts;
    private BigDecimal requestOrderLimit;
    private Boolean canSale;
    private BigDecimal minOrderQuantity;
    private Long deliveryDays;
    private Boolean batchManage;
    private Boolean expiryDateManage;
    private Short expiryDateCalculationMethod;
    private Long expireDateNo;
    private String expireDateUnit;
    private Long daysBeforeValidityReject;
    private Long validityWarningDays;
    private Boolean serialNoManage;
    private Boolean barcodeManage;
    private BigDecimal safetyStock;
    private BigDecimal highestStock;
    private BigDecimal lowestStock;
    private BigDecimal ropStock;
    private String warehouseManager;
    private String warehouseManagerCode;
    private Long receiptWarehouse;
    private String receiptWarehouseCode;
    private Long deliveryWarehouse;
    private String deliveryWarehouseCode;
    private Long returnWarehouse;
    private String returnWarehouseCode;
    private BigDecimal inStoreExcessLimit;
    private BigDecimal outStoreExcessLimit;
    private BigDecimal storageLossRate;
    private Integer planDefaultAttribute;
    private Boolean allowNegativeInventory;
    private Integer planMethod;
    private Boolean keySubPart;
    private Long fixedLeadTime;
    private Integer supplyType;
    private String produceDepartment;
    private String produceDepartmentCode;
    private String manufacturePlanner;
    private String manufacturePlannerCode;
    private String engineeringDrawingNo;
    private Long planProduceLimit;
    private String valueManageType;
    private Integer batchRule;
    private BigDecimal fixedQuantity;
    private String costValuation;
    private BigDecimal noTaxCostPrice;
    private Boolean checkByBatch;
    private String saleStyle;
    private Long salePoints;
    private BigDecimal inventoryCount;
    private Integer baseSaleCount;
    private MultilingualVO metaDescription;
    private BigDecimal settleAccountsRate;
    private Boolean recommend;
    private MultilingualVO displayName;
    private MultilingualVO titleMemo;
    private Boolean allowStorePurchase;
    private Boolean saleInOfflineStore;
    private Boolean priceChangeAllowed;
    private Boolean offlineStoreOrder;
    private Boolean offlineStoreReturn;
    private Long retailPriceDimension;
    private Long deliverQuantityChange;
    private Boolean process;
    private String processType;
    private Boolean material;
    private Boolean weighingOrNot;
    private String inventoryPlanStrategy;
    private MultilingualVO remark;
    private MultilingualVO receiptSpecMultilingual;
    private MultilingualVO receiptModelMultilingual;
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

    public String getShortName() {
        return this.shortName;
    }

    public String getMnemonicCode() {
        return this.mnemonicCode;
    }

    public String getErpOuterCode() {
        return this.erpOuterCode;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public Object getProductExtendCharacterDef() {
        return this.productExtendCharacterDef;
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

    public String getBusinessAttribute() {
        return this.businessAttribute;
    }

    public String getSaleChannel() {
        return this.saleChannel;
    }

    public Long getPurchaseUnit() {
        return this.purchaseUnit;
    }

    public String getPurchaseUnitCode() {
        return this.purchaseUnitCode;
    }

    public Long getInspectionUnit() {
        return this.inspectionUnit;
    }

    public String getInspectionUnitCode() {
        return this.inspectionUnitCode;
    }

    public Long getPurchasePriceUnit() {
        return this.purchasePriceUnit;
    }

    public String getPurchasePriceUnitCode() {
        return this.purchasePriceUnitCode;
    }

    public Long getStockUnit() {
        return this.stockUnit;
    }

    public String getStockUnitCode() {
        return this.stockUnitCode;
    }

    public Long getProduceUnit() {
        return this.produceUnit;
    }

    public String getProduceUnitCode() {
        return this.produceUnitCode;
    }

    public Long getBatchPriceUnit() {
        return this.batchPriceUnit;
    }

    public String getBatchPriceUnitCode() {
        return this.batchPriceUnitCode;
    }

    public Long getBatchUnit() {
        return this.batchUnit;
    }

    public String getBatchUnitCode() {
        return this.batchUnitCode;
    }

    public Long getOnlineUnit() {
        return this.onlineUnit;
    }

    public String getOnlineUnitCode() {
        return this.onlineUnitCode;
    }

    public Long getOfflineUnit() {
        return this.offlineUnit;
    }

    public String getOfflineUnitCode() {
        return this.offlineUnitCode;
    }

    public Long getRequireUnit() {
        return this.requireUnit;
    }

    public String getRequireUnitCode() {
        return this.requireUnitCode;
    }

    public BigDecimal getMarkPrice() {
        return this.markPrice;
    }

    public BigDecimal getSalePrice() {
        return this.salePrice;
    }

    public BigDecimal getMarketPrice() {
        return this.marketPrice;
    }

    public Boolean getDisplayPrice() {
        return this.displayPrice;
    }

    public String getPriceAreaMessage() {
        return this.priceAreaMessage;
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

    public String getOutputTaxRate() {
        return this.outputTaxRate;
    }

    public String getOutTaxRateCode() {
        return this.outTaxRateCode;
    }

    public Long getOrder() {
        return this.order;
    }

    public Boolean getStopstatus() {
        return this.stopstatus;
    }

    public Boolean getStoreOffAndOffState() {
        return this.storeOffAndOffState;
    }

    public Boolean getOrderLoadAndUnloadStatus() {
        return this.orderLoadAndUnloadStatus;
    }

    public Long getProductVendor() {
        return this.productVendor;
    }

    public String getProductVendorCode() {
        return this.productVendorCode;
    }

    public String getProductBuyer() {
        return this.productBuyer;
    }

    public String getProductBuyerCode() {
        return this.productBuyerCode;
    }

    public BigDecimal getPrimeCosts() {
        return this.primeCosts;
    }

    public BigDecimal getMaxPrimeCosts() {
        return this.maxPrimeCosts;
    }

    public BigDecimal getRequestOrderLimit() {
        return this.requestOrderLimit;
    }

    public Boolean getCanSale() {
        return this.canSale;
    }

    public BigDecimal getMinOrderQuantity() {
        return this.minOrderQuantity;
    }

    public Long getDeliveryDays() {
        return this.deliveryDays;
    }

    public Boolean getBatchManage() {
        return this.batchManage;
    }

    public Boolean getExpiryDateManage() {
        return this.expiryDateManage;
    }

    public Short getExpiryDateCalculationMethod() {
        return this.expiryDateCalculationMethod;
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

    public Boolean getSerialNoManage() {
        return this.serialNoManage;
    }

    public Boolean getBarcodeManage() {
        return this.barcodeManage;
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

    public String getWarehouseManager() {
        return this.warehouseManager;
    }

    public String getWarehouseManagerCode() {
        return this.warehouseManagerCode;
    }

    public Long getReceiptWarehouse() {
        return this.receiptWarehouse;
    }

    public String getReceiptWarehouseCode() {
        return this.receiptWarehouseCode;
    }

    public Long getDeliveryWarehouse() {
        return this.deliveryWarehouse;
    }

    public String getDeliveryWarehouseCode() {
        return this.deliveryWarehouseCode;
    }

    public Long getReturnWarehouse() {
        return this.returnWarehouse;
    }

    public String getReturnWarehouseCode() {
        return this.returnWarehouseCode;
    }

    public BigDecimal getInStoreExcessLimit() {
        return this.inStoreExcessLimit;
    }

    public BigDecimal getOutStoreExcessLimit() {
        return this.outStoreExcessLimit;
    }

    public BigDecimal getStorageLossRate() {
        return this.storageLossRate;
    }

    public Integer getPlanDefaultAttribute() {
        return this.planDefaultAttribute;
    }

    public Boolean getAllowNegativeInventory() {
        return this.allowNegativeInventory;
    }

    public Integer getPlanMethod() {
        return this.planMethod;
    }

    public Boolean getKeySubPart() {
        return this.keySubPart;
    }

    public Long getFixedLeadTime() {
        return this.fixedLeadTime;
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

    public String getManufacturePlanner() {
        return this.manufacturePlanner;
    }

    public String getManufacturePlannerCode() {
        return this.manufacturePlannerCode;
    }

    public String getEngineeringDrawingNo() {
        return this.engineeringDrawingNo;
    }

    public Long getPlanProduceLimit() {
        return this.planProduceLimit;
    }

    public String getValueManageType() {
        return this.valueManageType;
    }

    public Integer getBatchRule() {
        return this.batchRule;
    }

    public BigDecimal getFixedQuantity() {
        return this.fixedQuantity;
    }

    public String getCostValuation() {
        return this.costValuation;
    }

    public BigDecimal getNoTaxCostPrice() {
        return this.noTaxCostPrice;
    }

    public Boolean getCheckByBatch() {
        return this.checkByBatch;
    }

    public String getSaleStyle() {
        return this.saleStyle;
    }

    public Long getSalePoints() {
        return this.salePoints;
    }

    public BigDecimal getInventoryCount() {
        return this.inventoryCount;
    }

    public Integer getBaseSaleCount() {
        return this.baseSaleCount;
    }

    public MultilingualVO getMetaDescription() {
        return this.metaDescription;
    }

    public BigDecimal getSettleAccountsRate() {
        return this.settleAccountsRate;
    }

    public Boolean getRecommend() {
        return this.recommend;
    }

    public MultilingualVO getDisplayName() {
        return this.displayName;
    }

    public MultilingualVO getTitleMemo() {
        return this.titleMemo;
    }

    public Boolean getAllowStorePurchase() {
        return this.allowStorePurchase;
    }

    public Boolean getSaleInOfflineStore() {
        return this.saleInOfflineStore;
    }

    public Boolean getPriceChangeAllowed() {
        return this.priceChangeAllowed;
    }

    public Boolean getOfflineStoreOrder() {
        return this.offlineStoreOrder;
    }

    public Boolean getOfflineStoreReturn() {
        return this.offlineStoreReturn;
    }

    public Long getRetailPriceDimension() {
        return this.retailPriceDimension;
    }

    public Long getDeliverQuantityChange() {
        return this.deliverQuantityChange;
    }

    public Boolean getProcess() {
        return this.process;
    }

    public String getProcessType() {
        return this.processType;
    }

    public Boolean getMaterial() {
        return this.material;
    }

    public Boolean getWeighingOrNot() {
        return this.weighingOrNot;
    }

    public String getInventoryPlanStrategy() {
        return this.inventoryPlanStrategy;
    }

    public MultilingualVO getRemark() {
        return this.remark;
    }

    public MultilingualVO getReceiptSpecMultilingual() {
        return this.receiptSpecMultilingual;
    }

    public MultilingualVO getReceiptModelMultilingual() {
        return this.receiptModelMultilingual;
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

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setMnemonicCode(String mnemonicCode) {
        this.mnemonicCode = mnemonicCode;
    }

    public void setErpOuterCode(String erpOuterCode) {
        this.erpOuterCode = erpOuterCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setProductExtendCharacterDef(Object productExtendCharacterDef) {
        this.productExtendCharacterDef = productExtendCharacterDef;
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

    public void setBusinessAttribute(String businessAttribute) {
        this.businessAttribute = businessAttribute;
    }

    public void setSaleChannel(String saleChannel) {
        this.saleChannel = saleChannel;
    }

    public void setPurchaseUnit(Long purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

    public void setPurchaseUnitCode(String purchaseUnitCode) {
        this.purchaseUnitCode = purchaseUnitCode;
    }

    public void setInspectionUnit(Long inspectionUnit) {
        this.inspectionUnit = inspectionUnit;
    }

    public void setInspectionUnitCode(String inspectionUnitCode) {
        this.inspectionUnitCode = inspectionUnitCode;
    }

    public void setPurchasePriceUnit(Long purchasePriceUnit) {
        this.purchasePriceUnit = purchasePriceUnit;
    }

    public void setPurchasePriceUnitCode(String purchasePriceUnitCode) {
        this.purchasePriceUnitCode = purchasePriceUnitCode;
    }

    public void setStockUnit(Long stockUnit) {
        this.stockUnit = stockUnit;
    }

    public void setStockUnitCode(String stockUnitCode) {
        this.stockUnitCode = stockUnitCode;
    }

    public void setProduceUnit(Long produceUnit) {
        this.produceUnit = produceUnit;
    }

    public void setProduceUnitCode(String produceUnitCode) {
        this.produceUnitCode = produceUnitCode;
    }

    public void setBatchPriceUnit(Long batchPriceUnit) {
        this.batchPriceUnit = batchPriceUnit;
    }

    public void setBatchPriceUnitCode(String batchPriceUnitCode) {
        this.batchPriceUnitCode = batchPriceUnitCode;
    }

    public void setBatchUnit(Long batchUnit) {
        this.batchUnit = batchUnit;
    }

    public void setBatchUnitCode(String batchUnitCode) {
        this.batchUnitCode = batchUnitCode;
    }

    public void setOnlineUnit(Long onlineUnit) {
        this.onlineUnit = onlineUnit;
    }

    public void setOnlineUnitCode(String onlineUnitCode) {
        this.onlineUnitCode = onlineUnitCode;
    }

    public void setOfflineUnit(Long offlineUnit) {
        this.offlineUnit = offlineUnit;
    }

    public void setOfflineUnitCode(String offlineUnitCode) {
        this.offlineUnitCode = offlineUnitCode;
    }

    public void setRequireUnit(Long requireUnit) {
        this.requireUnit = requireUnit;
    }

    public void setRequireUnitCode(String requireUnitCode) {
        this.requireUnitCode = requireUnitCode;
    }

    public void setMarkPrice(BigDecimal markPrice) {
        this.markPrice = markPrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public void setDisplayPrice(Boolean displayPrice) {
        this.displayPrice = displayPrice;
    }

    public void setPriceAreaMessage(String priceAreaMessage) {
        this.priceAreaMessage = priceAreaMessage;
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

    public void setOutputTaxRate(String outputTaxRate) {
        this.outputTaxRate = outputTaxRate;
    }

    public void setOutTaxRateCode(String outTaxRateCode) {
        this.outTaxRateCode = outTaxRateCode;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public void setStopstatus(Boolean stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void setStoreOffAndOffState(Boolean storeOffAndOffState) {
        this.storeOffAndOffState = storeOffAndOffState;
    }

    public void setOrderLoadAndUnloadStatus(Boolean orderLoadAndUnloadStatus) {
        this.orderLoadAndUnloadStatus = orderLoadAndUnloadStatus;
    }

    public void setProductVendor(Long productVendor) {
        this.productVendor = productVendor;
    }

    public void setProductVendorCode(String productVendorCode) {
        this.productVendorCode = productVendorCode;
    }

    public void setProductBuyer(String productBuyer) {
        this.productBuyer = productBuyer;
    }

    public void setProductBuyerCode(String productBuyerCode) {
        this.productBuyerCode = productBuyerCode;
    }

    public void setPrimeCosts(BigDecimal primeCosts) {
        this.primeCosts = primeCosts;
    }

    public void setMaxPrimeCosts(BigDecimal maxPrimeCosts) {
        this.maxPrimeCosts = maxPrimeCosts;
    }

    public void setRequestOrderLimit(BigDecimal requestOrderLimit) {
        this.requestOrderLimit = requestOrderLimit;
    }

    public void setCanSale(Boolean canSale) {
        this.canSale = canSale;
    }

    public void setMinOrderQuantity(BigDecimal minOrderQuantity) {
        this.minOrderQuantity = minOrderQuantity;
    }

    public void setDeliveryDays(Long deliveryDays) {
        this.deliveryDays = deliveryDays;
    }

    public void setBatchManage(Boolean batchManage) {
        this.batchManage = batchManage;
    }

    public void setExpiryDateManage(Boolean expiryDateManage) {
        this.expiryDateManage = expiryDateManage;
    }

    public void setExpiryDateCalculationMethod(Short expiryDateCalculationMethod) {
        this.expiryDateCalculationMethod = expiryDateCalculationMethod;
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

    public void setSerialNoManage(Boolean serialNoManage) {
        this.serialNoManage = serialNoManage;
    }

    public void setBarcodeManage(Boolean barcodeManage) {
        this.barcodeManage = barcodeManage;
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

    public void setWarehouseManager(String warehouseManager) {
        this.warehouseManager = warehouseManager;
    }

    public void setWarehouseManagerCode(String warehouseManagerCode) {
        this.warehouseManagerCode = warehouseManagerCode;
    }

    public void setReceiptWarehouse(Long receiptWarehouse) {
        this.receiptWarehouse = receiptWarehouse;
    }

    public void setReceiptWarehouseCode(String receiptWarehouseCode) {
        this.receiptWarehouseCode = receiptWarehouseCode;
    }

    public void setDeliveryWarehouse(Long deliveryWarehouse) {
        this.deliveryWarehouse = deliveryWarehouse;
    }

    public void setDeliveryWarehouseCode(String deliveryWarehouseCode) {
        this.deliveryWarehouseCode = deliveryWarehouseCode;
    }

    public void setReturnWarehouse(Long returnWarehouse) {
        this.returnWarehouse = returnWarehouse;
    }

    public void setReturnWarehouseCode(String returnWarehouseCode) {
        this.returnWarehouseCode = returnWarehouseCode;
    }

    public void setInStoreExcessLimit(BigDecimal inStoreExcessLimit) {
        this.inStoreExcessLimit = inStoreExcessLimit;
    }

    public void setOutStoreExcessLimit(BigDecimal outStoreExcessLimit) {
        this.outStoreExcessLimit = outStoreExcessLimit;
    }

    public void setStorageLossRate(BigDecimal storageLossRate) {
        this.storageLossRate = storageLossRate;
    }

    public void setPlanDefaultAttribute(Integer planDefaultAttribute) {
        this.planDefaultAttribute = planDefaultAttribute;
    }

    public void setAllowNegativeInventory(Boolean allowNegativeInventory) {
        this.allowNegativeInventory = allowNegativeInventory;
    }

    public void setPlanMethod(Integer planMethod) {
        this.planMethod = planMethod;
    }

    public void setKeySubPart(Boolean keySubPart) {
        this.keySubPart = keySubPart;
    }

    public void setFixedLeadTime(Long fixedLeadTime) {
        this.fixedLeadTime = fixedLeadTime;
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

    public void setManufacturePlanner(String manufacturePlanner) {
        this.manufacturePlanner = manufacturePlanner;
    }

    public void setManufacturePlannerCode(String manufacturePlannerCode) {
        this.manufacturePlannerCode = manufacturePlannerCode;
    }

    public void setEngineeringDrawingNo(String engineeringDrawingNo) {
        this.engineeringDrawingNo = engineeringDrawingNo;
    }

    public void setPlanProduceLimit(Long planProduceLimit) {
        this.planProduceLimit = planProduceLimit;
    }

    public void setValueManageType(String valueManageType) {
        this.valueManageType = valueManageType;
    }

    public void setBatchRule(Integer batchRule) {
        this.batchRule = batchRule;
    }

    public void setFixedQuantity(BigDecimal fixedQuantity) {
        this.fixedQuantity = fixedQuantity;
    }

    public void setCostValuation(String costValuation) {
        this.costValuation = costValuation;
    }

    public void setNoTaxCostPrice(BigDecimal noTaxCostPrice) {
        this.noTaxCostPrice = noTaxCostPrice;
    }

    public void setCheckByBatch(Boolean checkByBatch) {
        this.checkByBatch = checkByBatch;
    }

    public void setSaleStyle(String saleStyle) {
        this.saleStyle = saleStyle;
    }

    public void setSalePoints(Long salePoints) {
        this.salePoints = salePoints;
    }

    public void setInventoryCount(BigDecimal inventoryCount) {
        this.inventoryCount = inventoryCount;
    }

    public void setBaseSaleCount(Integer baseSaleCount) {
        this.baseSaleCount = baseSaleCount;
    }

    public void setMetaDescription(MultilingualVO metaDescription) {
        this.metaDescription = metaDescription;
    }

    public void setSettleAccountsRate(BigDecimal settleAccountsRate) {
        this.settleAccountsRate = settleAccountsRate;
    }

    public void setRecommend(Boolean recommend) {
        this.recommend = recommend;
    }

    public void setDisplayName(MultilingualVO displayName) {
        this.displayName = displayName;
    }

    public void setTitleMemo(MultilingualVO titleMemo) {
        this.titleMemo = titleMemo;
    }

    public void setAllowStorePurchase(Boolean allowStorePurchase) {
        this.allowStorePurchase = allowStorePurchase;
    }

    public void setSaleInOfflineStore(Boolean saleInOfflineStore) {
        this.saleInOfflineStore = saleInOfflineStore;
    }

    public void setPriceChangeAllowed(Boolean priceChangeAllowed) {
        this.priceChangeAllowed = priceChangeAllowed;
    }

    public void setOfflineStoreOrder(Boolean offlineStoreOrder) {
        this.offlineStoreOrder = offlineStoreOrder;
    }

    public void setOfflineStoreReturn(Boolean offlineStoreReturn) {
        this.offlineStoreReturn = offlineStoreReturn;
    }

    public void setRetailPriceDimension(Long retailPriceDimension) {
        this.retailPriceDimension = retailPriceDimension;
    }

    public void setDeliverQuantityChange(Long deliverQuantityChange) {
        this.deliverQuantityChange = deliverQuantityChange;
    }

    public void setProcess(Boolean process) {
        this.process = process;
    }

    public void setProcessType(String processType) {
        this.processType = processType;
    }

    public void setMaterial(Boolean material) {
        this.material = material;
    }

    public void setWeighingOrNot(Boolean weighingOrNot) {
        this.weighingOrNot = weighingOrNot;
    }

    public void setInventoryPlanStrategy(String inventoryPlanStrategy) {
        this.inventoryPlanStrategy = inventoryPlanStrategy;
    }

    public void setRemark(MultilingualVO remark) {
        this.remark = remark;
    }

    public void setReceiptSpecMultilingual(MultilingualVO receiptSpecMultilingual) {
        this.receiptSpecMultilingual = receiptSpecMultilingual;
    }

    public void setReceiptModelMultilingual(MultilingualVO receiptModelMultilingual) {
        this.receiptModelMultilingual = receiptModelMultilingual;
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

    /*
     * WARNING - void declaration
     */
    public boolean equals(Object o) {
        void other$receiptModelMultilingual;
        void this$receiptModelMultilingual;
        void other$receiptSpecMultilingual;
        void this$receiptSpecMultilingual;
        void other$remark;
        void this$remark;
        void other$inventoryPlanStrategy;
        void this$inventoryPlanStrategy;
        void other$processType;
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductIPassDetail)) {
            return false;
        }
        ProductIPassDetail other = (ProductIPassDetail)o;
        if (!other.canEqual(this)) {
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
        Long this$purchaseUnit = this.getPurchaseUnit();
        Long other$purchaseUnit = other.getPurchaseUnit();
        if (this$purchaseUnit == null ? other$purchaseUnit != null : !((Object)this$purchaseUnit).equals(other$purchaseUnit)) {
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
        Long this$stockUnit = this.getStockUnit();
        Long other$stockUnit = other.getStockUnit();
        if (this$stockUnit == null ? other$stockUnit != null : !((Object)this$stockUnit).equals(other$stockUnit)) {
            return false;
        }
        Long this$produceUnit = this.getProduceUnit();
        Long other$produceUnit = other.getProduceUnit();
        if (this$produceUnit == null ? other$produceUnit != null : !((Object)this$produceUnit).equals(other$produceUnit)) {
            return false;
        }
        Long this$batchPriceUnit = this.getBatchPriceUnit();
        Long other$batchPriceUnit = other.getBatchPriceUnit();
        if (this$batchPriceUnit == null ? other$batchPriceUnit != null : !((Object)this$batchPriceUnit).equals(other$batchPriceUnit)) {
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
        Boolean this$displayPrice = this.getDisplayPrice();
        Boolean other$displayPrice = other.getDisplayPrice();
        if (this$displayPrice == null ? other$displayPrice != null : !((Object)this$displayPrice).equals(other$displayPrice)) {
            return false;
        }
        Long this$order = this.getOrder();
        Long other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Boolean this$stopstatus = this.getStopstatus();
        Boolean other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
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
        Long this$productVendor = this.getProductVendor();
        Long other$productVendor = other.getProductVendor();
        if (this$productVendor == null ? other$productVendor != null : !((Object)this$productVendor).equals(other$productVendor)) {
            return false;
        }
        Boolean this$canSale = this.getCanSale();
        Boolean other$canSale = other.getCanSale();
        if (this$canSale == null ? other$canSale != null : !((Object)this$canSale).equals(other$canSale)) {
            return false;
        }
        Long this$deliveryDays = this.getDeliveryDays();
        Long other$deliveryDays = other.getDeliveryDays();
        if (this$deliveryDays == null ? other$deliveryDays != null : !((Object)this$deliveryDays).equals(other$deliveryDays)) {
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
        Short this$expiryDateCalculationMethod = this.getExpiryDateCalculationMethod();
        Short other$expiryDateCalculationMethod = other.getExpiryDateCalculationMethod();
        if (this$expiryDateCalculationMethod == null ? other$expiryDateCalculationMethod != null : !((Object)this$expiryDateCalculationMethod).equals(other$expiryDateCalculationMethod)) {
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
        Boolean this$serialNoManage = this.getSerialNoManage();
        Boolean other$serialNoManage = other.getSerialNoManage();
        if (this$serialNoManage == null ? other$serialNoManage != null : !((Object)this$serialNoManage).equals(other$serialNoManage)) {
            return false;
        }
        Boolean this$barcodeManage = this.getBarcodeManage();
        Boolean other$barcodeManage = other.getBarcodeManage();
        if (this$barcodeManage == null ? other$barcodeManage != null : !((Object)this$barcodeManage).equals(other$barcodeManage)) {
            return false;
        }
        Long this$receiptWarehouse = this.getReceiptWarehouse();
        Long other$receiptWarehouse = other.getReceiptWarehouse();
        if (this$receiptWarehouse == null ? other$receiptWarehouse != null : !((Object)this$receiptWarehouse).equals(other$receiptWarehouse)) {
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
        Integer this$planDefaultAttribute = this.getPlanDefaultAttribute();
        Integer other$planDefaultAttribute = other.getPlanDefaultAttribute();
        if (this$planDefaultAttribute == null ? other$planDefaultAttribute != null : !((Object)this$planDefaultAttribute).equals(other$planDefaultAttribute)) {
            return false;
        }
        Boolean this$allowNegativeInventory = this.getAllowNegativeInventory();
        Boolean other$allowNegativeInventory = other.getAllowNegativeInventory();
        if (this$allowNegativeInventory == null ? other$allowNegativeInventory != null : !((Object)this$allowNegativeInventory).equals(other$allowNegativeInventory)) {
            return false;
        }
        Integer this$planMethod = this.getPlanMethod();
        Integer other$planMethod = other.getPlanMethod();
        if (this$planMethod == null ? other$planMethod != null : !((Object)this$planMethod).equals(other$planMethod)) {
            return false;
        }
        Boolean this$keySubPart = this.getKeySubPart();
        Boolean other$keySubPart = other.getKeySubPart();
        if (this$keySubPart == null ? other$keySubPart != null : !((Object)this$keySubPart).equals(other$keySubPart)) {
            return false;
        }
        Long this$fixedLeadTime = this.getFixedLeadTime();
        Long other$fixedLeadTime = other.getFixedLeadTime();
        if (this$fixedLeadTime == null ? other$fixedLeadTime != null : !((Object)this$fixedLeadTime).equals(other$fixedLeadTime)) {
            return false;
        }
        Integer this$supplyType = this.getSupplyType();
        Integer other$supplyType = other.getSupplyType();
        if (this$supplyType == null ? other$supplyType != null : !((Object)this$supplyType).equals(other$supplyType)) {
            return false;
        }
        Long this$planProduceLimit = this.getPlanProduceLimit();
        Long other$planProduceLimit = other.getPlanProduceLimit();
        if (this$planProduceLimit == null ? other$planProduceLimit != null : !((Object)this$planProduceLimit).equals(other$planProduceLimit)) {
            return false;
        }
        Integer this$batchRule = this.getBatchRule();
        Integer other$batchRule = other.getBatchRule();
        if (this$batchRule == null ? other$batchRule != null : !((Object)this$batchRule).equals(other$batchRule)) {
            return false;
        }
        Boolean this$checkByBatch = this.getCheckByBatch();
        Boolean other$checkByBatch = other.getCheckByBatch();
        if (this$checkByBatch == null ? other$checkByBatch != null : !((Object)this$checkByBatch).equals(other$checkByBatch)) {
            return false;
        }
        Long this$salePoints = this.getSalePoints();
        Long other$salePoints = other.getSalePoints();
        if (this$salePoints == null ? other$salePoints != null : !((Object)this$salePoints).equals(other$salePoints)) {
            return false;
        }
        Integer this$baseSaleCount = this.getBaseSaleCount();
        Integer other$baseSaleCount = other.getBaseSaleCount();
        if (this$baseSaleCount == null ? other$baseSaleCount != null : !((Object)this$baseSaleCount).equals(other$baseSaleCount)) {
            return false;
        }
        Boolean this$recommend = this.getRecommend();
        Boolean other$recommend = other.getRecommend();
        if (this$recommend == null ? other$recommend != null : !((Object)this$recommend).equals(other$recommend)) {
            return false;
        }
        Boolean this$allowStorePurchase = this.getAllowStorePurchase();
        Boolean other$allowStorePurchase = other.getAllowStorePurchase();
        if (this$allowStorePurchase == null ? other$allowStorePurchase != null : !((Object)this$allowStorePurchase).equals(other$allowStorePurchase)) {
            return false;
        }
        Boolean this$saleInOfflineStore = this.getSaleInOfflineStore();
        Boolean other$saleInOfflineStore = other.getSaleInOfflineStore();
        if (this$saleInOfflineStore == null ? other$saleInOfflineStore != null : !((Object)this$saleInOfflineStore).equals(other$saleInOfflineStore)) {
            return false;
        }
        Boolean this$priceChangeAllowed = this.getPriceChangeAllowed();
        Boolean other$priceChangeAllowed = other.getPriceChangeAllowed();
        if (this$priceChangeAllowed == null ? other$priceChangeAllowed != null : !((Object)this$priceChangeAllowed).equals(other$priceChangeAllowed)) {
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
        Long this$retailPriceDimension = this.getRetailPriceDimension();
        Long other$retailPriceDimension = other.getRetailPriceDimension();
        if (this$retailPriceDimension == null ? other$retailPriceDimension != null : !((Object)this$retailPriceDimension).equals(other$retailPriceDimension)) {
            return false;
        }
        Long this$deliverQuantityChange = this.getDeliverQuantityChange();
        Long other$deliverQuantityChange = other.getDeliverQuantityChange();
        if (this$deliverQuantityChange == null ? other$deliverQuantityChange != null : !((Object)this$deliverQuantityChange).equals(other$deliverQuantityChange)) {
            return false;
        }
        Boolean this$process = this.getProcess();
        Boolean other$process = other.getProcess();
        if (this$process == null ? other$process != null : !((Object)this$process).equals(other$process)) {
            return false;
        }
        Boolean this$material = this.getMaterial();
        Boolean other$material = other.getMaterial();
        if (this$material == null ? other$material != null : !((Object)this$material).equals(other$material)) {
            return false;
        }
        Boolean this$weighingOrNot = this.getWeighingOrNot();
        Boolean other$weighingOrNot = other.getWeighingOrNot();
        if (this$weighingOrNot == null ? other$weighingOrNot != null : !((Object)this$weighingOrNot).equals(other$weighingOrNot)) {
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
        String this$erpOuterCode = this.getErpOuterCode();
        String other$erpOuterCode = other.getErpOuterCode();
        if (this$erpOuterCode == null ? other$erpOuterCode != null : !this$erpOuterCode.equals(other$erpOuterCode)) {
            return false;
        }
        String this$barCode = this.getBarCode();
        String other$barCode = other.getBarCode();
        if (this$barCode == null ? other$barCode != null : !this$barCode.equals(other$barCode)) {
            return false;
        }
        Object this$productExtendCharacterDef = this.getProductExtendCharacterDef();
        Object other$productExtendCharacterDef = other.getProductExtendCharacterDef();
        if (this$productExtendCharacterDef == null ? other$productExtendCharacterDef != null : !this$productExtendCharacterDef.equals(other$productExtendCharacterDef)) {
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
        String this$purchaseUnitCode = this.getPurchaseUnitCode();
        String other$purchaseUnitCode = other.getPurchaseUnitCode();
        if (this$purchaseUnitCode == null ? other$purchaseUnitCode != null : !this$purchaseUnitCode.equals(other$purchaseUnitCode)) {
            return false;
        }
        String this$inspectionUnitCode = this.getInspectionUnitCode();
        String other$inspectionUnitCode = other.getInspectionUnitCode();
        if (this$inspectionUnitCode == null ? other$inspectionUnitCode != null : !this$inspectionUnitCode.equals(other$inspectionUnitCode)) {
            return false;
        }
        String this$purchasePriceUnitCode = this.getPurchasePriceUnitCode();
        String other$purchasePriceUnitCode = other.getPurchasePriceUnitCode();
        if (this$purchasePriceUnitCode == null ? other$purchasePriceUnitCode != null : !this$purchasePriceUnitCode.equals(other$purchasePriceUnitCode)) {
            return false;
        }
        String this$stockUnitCode = this.getStockUnitCode();
        String other$stockUnitCode = other.getStockUnitCode();
        if (this$stockUnitCode == null ? other$stockUnitCode != null : !this$stockUnitCode.equals(other$stockUnitCode)) {
            return false;
        }
        String this$produceUnitCode = this.getProduceUnitCode();
        String other$produceUnitCode = other.getProduceUnitCode();
        if (this$produceUnitCode == null ? other$produceUnitCode != null : !this$produceUnitCode.equals(other$produceUnitCode)) {
            return false;
        }
        String this$batchPriceUnitCode = this.getBatchPriceUnitCode();
        String other$batchPriceUnitCode = other.getBatchPriceUnitCode();
        if (this$batchPriceUnitCode == null ? other$batchPriceUnitCode != null : !this$batchPriceUnitCode.equals(other$batchPriceUnitCode)) {
            return false;
        }
        String this$batchUnitCode = this.getBatchUnitCode();
        String other$batchUnitCode = other.getBatchUnitCode();
        if (this$batchUnitCode == null ? other$batchUnitCode != null : !this$batchUnitCode.equals(other$batchUnitCode)) {
            return false;
        }
        String this$onlineUnitCode = this.getOnlineUnitCode();
        String other$onlineUnitCode = other.getOnlineUnitCode();
        if (this$onlineUnitCode == null ? other$onlineUnitCode != null : !this$onlineUnitCode.equals(other$onlineUnitCode)) {
            return false;
        }
        String this$offlineUnitCode = this.getOfflineUnitCode();
        String other$offlineUnitCode = other.getOfflineUnitCode();
        if (this$offlineUnitCode == null ? other$offlineUnitCode != null : !this$offlineUnitCode.equals(other$offlineUnitCode)) {
            return false;
        }
        String this$requireUnitCode = this.getRequireUnitCode();
        String other$requireUnitCode = other.getRequireUnitCode();
        if (this$requireUnitCode == null ? other$requireUnitCode != null : !this$requireUnitCode.equals(other$requireUnitCode)) {
            return false;
        }
        BigDecimal this$markPrice = this.getMarkPrice();
        BigDecimal other$markPrice = other.getMarkPrice();
        if (this$markPrice == null ? other$markPrice != null : !((Object)this$markPrice).equals(other$markPrice)) {
            return false;
        }
        BigDecimal this$salePrice = this.getSalePrice();
        BigDecimal other$salePrice = other.getSalePrice();
        if (this$salePrice == null ? other$salePrice != null : !((Object)this$salePrice).equals(other$salePrice)) {
            return false;
        }
        BigDecimal this$marketPrice = this.getMarketPrice();
        BigDecimal other$marketPrice = other.getMarketPrice();
        if (this$marketPrice == null ? other$marketPrice != null : !((Object)this$marketPrice).equals(other$marketPrice)) {
            return false;
        }
        String this$priceAreaMessage = this.getPriceAreaMessage();
        String other$priceAreaMessage = other.getPriceAreaMessage();
        if (this$priceAreaMessage == null ? other$priceAreaMessage != null : !this$priceAreaMessage.equals(other$priceAreaMessage)) {
            return false;
        }
        MultilingualVO this$receiptName = this.getReceiptName();
        MultilingualVO other$receiptName = other.getReceiptName();
        if (this$receiptName == null ? other$receiptName != null : !((Object)this$receiptName).equals(other$receiptName)) {
            return false;
        }
        String this$incomeTaxRates = this.getIncomeTaxRates();
        String other$incomeTaxRates = other.getIncomeTaxRates();
        if (this$incomeTaxRates == null ? other$incomeTaxRates != null : !this$incomeTaxRates.equals(other$incomeTaxRates)) {
            return false;
        }
        String this$incomeTaxRatesCode = this.getIncomeTaxRatesCode();
        String other$incomeTaxRatesCode = other.getIncomeTaxRatesCode();
        if (this$incomeTaxRatesCode == null ? other$incomeTaxRatesCode != null : !this$incomeTaxRatesCode.equals(other$incomeTaxRatesCode)) {
            return false;
        }
        String this$outputTaxRate = this.getOutputTaxRate();
        String other$outputTaxRate = other.getOutputTaxRate();
        if (this$outputTaxRate == null ? other$outputTaxRate != null : !this$outputTaxRate.equals(other$outputTaxRate)) {
            return false;
        }
        String this$outTaxRateCode = this.getOutTaxRateCode();
        String other$outTaxRateCode = other.getOutTaxRateCode();
        if (this$outTaxRateCode == null ? other$outTaxRateCode != null : !this$outTaxRateCode.equals(other$outTaxRateCode)) {
            return false;
        }
        String this$productVendorCode = this.getProductVendorCode();
        String other$productVendorCode = other.getProductVendorCode();
        if (this$productVendorCode == null ? other$productVendorCode != null : !this$productVendorCode.equals(other$productVendorCode)) {
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
        BigDecimal this$primeCosts = this.getPrimeCosts();
        BigDecimal other$primeCosts = other.getPrimeCosts();
        if (this$primeCosts == null ? other$primeCosts != null : !((Object)this$primeCosts).equals(other$primeCosts)) {
            return false;
        }
        BigDecimal this$maxPrimeCosts = this.getMaxPrimeCosts();
        BigDecimal other$maxPrimeCosts = other.getMaxPrimeCosts();
        if (this$maxPrimeCosts == null ? other$maxPrimeCosts != null : !((Object)this$maxPrimeCosts).equals(other$maxPrimeCosts)) {
            return false;
        }
        BigDecimal this$requestOrderLimit = this.getRequestOrderLimit();
        BigDecimal other$requestOrderLimit = other.getRequestOrderLimit();
        if (this$requestOrderLimit == null ? other$requestOrderLimit != null : !((Object)this$requestOrderLimit).equals(other$requestOrderLimit)) {
            return false;
        }
        BigDecimal this$minOrderQuantity = this.getMinOrderQuantity();
        BigDecimal other$minOrderQuantity = other.getMinOrderQuantity();
        if (this$minOrderQuantity == null ? other$minOrderQuantity != null : !((Object)this$minOrderQuantity).equals(other$minOrderQuantity)) {
            return false;
        }
        String this$expireDateUnit = this.getExpireDateUnit();
        String other$expireDateUnit = other.getExpireDateUnit();
        if (this$expireDateUnit == null ? other$expireDateUnit != null : !this$expireDateUnit.equals(other$expireDateUnit)) {
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
        BigDecimal this$ropStock = this.getRopStock();
        BigDecimal other$ropStock = other.getRopStock();
        if (this$ropStock == null ? other$ropStock != null : !((Object)this$ropStock).equals(other$ropStock)) {
            return false;
        }
        String this$warehouseManager = this.getWarehouseManager();
        String other$warehouseManager = other.getWarehouseManager();
        if (this$warehouseManager == null ? other$warehouseManager != null : !this$warehouseManager.equals(other$warehouseManager)) {
            return false;
        }
        String this$warehouseManagerCode = this.getWarehouseManagerCode();
        String other$warehouseManagerCode = other.getWarehouseManagerCode();
        if (this$warehouseManagerCode == null ? other$warehouseManagerCode != null : !this$warehouseManagerCode.equals(other$warehouseManagerCode)) {
            return false;
        }
        String this$receiptWarehouseCode = this.getReceiptWarehouseCode();
        String other$receiptWarehouseCode = other.getReceiptWarehouseCode();
        if (this$receiptWarehouseCode == null ? other$receiptWarehouseCode != null : !this$receiptWarehouseCode.equals(other$receiptWarehouseCode)) {
            return false;
        }
        String this$deliveryWarehouseCode = this.getDeliveryWarehouseCode();
        String other$deliveryWarehouseCode = other.getDeliveryWarehouseCode();
        if (this$deliveryWarehouseCode == null ? other$deliveryWarehouseCode != null : !this$deliveryWarehouseCode.equals(other$deliveryWarehouseCode)) {
            return false;
        }
        String this$returnWarehouseCode = this.getReturnWarehouseCode();
        String other$returnWarehouseCode = other.getReturnWarehouseCode();
        if (this$returnWarehouseCode == null ? other$returnWarehouseCode != null : !this$returnWarehouseCode.equals(other$returnWarehouseCode)) {
            return false;
        }
        BigDecimal this$inStoreExcessLimit = this.getInStoreExcessLimit();
        BigDecimal other$inStoreExcessLimit = other.getInStoreExcessLimit();
        if (this$inStoreExcessLimit == null ? other$inStoreExcessLimit != null : !((Object)this$inStoreExcessLimit).equals(other$inStoreExcessLimit)) {
            return false;
        }
        BigDecimal this$outStoreExcessLimit = this.getOutStoreExcessLimit();
        BigDecimal other$outStoreExcessLimit = other.getOutStoreExcessLimit();
        if (this$outStoreExcessLimit == null ? other$outStoreExcessLimit != null : !((Object)this$outStoreExcessLimit).equals(other$outStoreExcessLimit)) {
            return false;
        }
        BigDecimal this$storageLossRate = this.getStorageLossRate();
        BigDecimal other$storageLossRate = other.getStorageLossRate();
        if (this$storageLossRate == null ? other$storageLossRate != null : !((Object)this$storageLossRate).equals(other$storageLossRate)) {
            return false;
        }
        String this$produceDepartment = this.getProduceDepartment();
        String other$produceDepartment = other.getProduceDepartment();
        if (this$produceDepartment == null ? other$produceDepartment != null : !this$produceDepartment.equals(other$produceDepartment)) {
            return false;
        }
        String this$produceDepartmentCode = this.getProduceDepartmentCode();
        String other$produceDepartmentCode = other.getProduceDepartmentCode();
        if (this$produceDepartmentCode == null ? other$produceDepartmentCode != null : !this$produceDepartmentCode.equals(other$produceDepartmentCode)) {
            return false;
        }
        String this$manufacturePlanner = this.getManufacturePlanner();
        String other$manufacturePlanner = other.getManufacturePlanner();
        if (this$manufacturePlanner == null ? other$manufacturePlanner != null : !this$manufacturePlanner.equals(other$manufacturePlanner)) {
            return false;
        }
        String this$manufacturePlannerCode = this.getManufacturePlannerCode();
        String other$manufacturePlannerCode = other.getManufacturePlannerCode();
        if (this$manufacturePlannerCode == null ? other$manufacturePlannerCode != null : !this$manufacturePlannerCode.equals(other$manufacturePlannerCode)) {
            return false;
        }
        String this$engineeringDrawingNo = this.getEngineeringDrawingNo();
        String other$engineeringDrawingNo = other.getEngineeringDrawingNo();
        if (this$engineeringDrawingNo == null ? other$engineeringDrawingNo != null : !this$engineeringDrawingNo.equals(other$engineeringDrawingNo)) {
            return false;
        }
        String this$valueManageType = this.getValueManageType();
        String other$valueManageType = other.getValueManageType();
        if (this$valueManageType == null ? other$valueManageType != null : !this$valueManageType.equals(other$valueManageType)) {
            return false;
        }
        BigDecimal this$fixedQuantity = this.getFixedQuantity();
        BigDecimal other$fixedQuantity = other.getFixedQuantity();
        if (this$fixedQuantity == null ? other$fixedQuantity != null : !((Object)this$fixedQuantity).equals(other$fixedQuantity)) {
            return false;
        }
        String this$costValuation = this.getCostValuation();
        String other$costValuation = other.getCostValuation();
        if (this$costValuation == null ? other$costValuation != null : !this$costValuation.equals(other$costValuation)) {
            return false;
        }
        BigDecimal this$noTaxCostPrice = this.getNoTaxCostPrice();
        BigDecimal other$noTaxCostPrice = other.getNoTaxCostPrice();
        if (this$noTaxCostPrice == null ? other$noTaxCostPrice != null : !((Object)this$noTaxCostPrice).equals(other$noTaxCostPrice)) {
            return false;
        }
        String this$saleStyle = this.getSaleStyle();
        String other$saleStyle = other.getSaleStyle();
        if (this$saleStyle == null ? other$saleStyle != null : !this$saleStyle.equals(other$saleStyle)) {
            return false;
        }
        BigDecimal this$inventoryCount = this.getInventoryCount();
        BigDecimal other$inventoryCount = other.getInventoryCount();
        if (this$inventoryCount == null ? other$inventoryCount != null : !((Object)this$inventoryCount).equals(other$inventoryCount)) {
            return false;
        }
        MultilingualVO this$metaDescription = this.getMetaDescription();
        MultilingualVO other$metaDescription = other.getMetaDescription();
        if (this$metaDescription == null ? other$metaDescription != null : !((Object)this$metaDescription).equals(other$metaDescription)) {
            return false;
        }
        BigDecimal this$settleAccountsRate = this.getSettleAccountsRate();
        BigDecimal other$settleAccountsRate = other.getSettleAccountsRate();
        if (this$settleAccountsRate == null ? other$settleAccountsRate != null : !((Object)this$settleAccountsRate).equals(other$settleAccountsRate)) {
            return false;
        }
        MultilingualVO this$displayName = this.getDisplayName();
        MultilingualVO other$displayName = other.getDisplayName();
        if (this$displayName == null ? other$displayName != null : !((Object)this$displayName).equals(other$displayName)) {
            return false;
        }
        MultilingualVO this$titleMemo = this.getTitleMemo();
        MultilingualVO other$titleMemo = other.getTitleMemo();
        if (this$titleMemo == null ? other$titleMemo != null : !((Object)this$titleMemo).equals(other$titleMemo)) {
            return false;
        }
        String this$processType = this.getProcessType();
        String string = other.getProcessType();
        if (this$processType == null ? other$processType != null : !this$processType.equals(other$processType)) {
            return false;
        }
        String string2 = this.getInventoryPlanStrategy();
        String string3 = other.getInventoryPlanStrategy();
        if (this$inventoryPlanStrategy == null ? other$inventoryPlanStrategy != null : !this$inventoryPlanStrategy.equals(other$inventoryPlanStrategy)) {
            return false;
        }
        MultilingualVO multilingualVO = this.getRemark();
        MultilingualVO multilingualVO2 = other.getRemark();
        if (this$remark == null ? other$remark != null : !this$remark.equals(other$remark)) {
            return false;
        }
        MultilingualVO multilingualVO3 = this.getReceiptSpecMultilingual();
        MultilingualVO multilingualVO4 = other.getReceiptSpecMultilingual();
        if (this$receiptSpecMultilingual == null ? other$receiptSpecMultilingual != null : !this$receiptSpecMultilingual.equals(other$receiptSpecMultilingual)) {
            return false;
        }
        MultilingualVO multilingualVO5 = this.getReceiptModelMultilingual();
        MultilingualVO multilingualVO6 = other.getReceiptModelMultilingual();
        return !(this$receiptModelMultilingual == null ? other$receiptModelMultilingual != null : !this$receiptModelMultilingual.equals(other$receiptModelMultilingual));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductIPassDetail;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $inspectionType = this.getInspectionType();
        result = result * 59 + ($inspectionType == null ? 43 : ((Object)$inspectionType).hashCode());
        Boolean $warehousingByResult = this.getWarehousingByResult();
        result = result * 59 + ($warehousingByResult == null ? 43 : ((Object)$warehousingByResult).hashCode());
        Integer $testRule = this.getTestRule();
        result = result * 59 + ($testRule == null ? 43 : ((Object)$testRule).hashCode());
        Long $purchaseUnit = this.getPurchaseUnit();
        result = result * 59 + ($purchaseUnit == null ? 43 : ((Object)$purchaseUnit).hashCode());
        Long $inspectionUnit = this.getInspectionUnit();
        result = result * 59 + ($inspectionUnit == null ? 43 : ((Object)$inspectionUnit).hashCode());
        Long $purchasePriceUnit = this.getPurchasePriceUnit();
        result = result * 59 + ($purchasePriceUnit == null ? 43 : ((Object)$purchasePriceUnit).hashCode());
        Long $stockUnit = this.getStockUnit();
        result = result * 59 + ($stockUnit == null ? 43 : ((Object)$stockUnit).hashCode());
        Long $produceUnit = this.getProduceUnit();
        result = result * 59 + ($produceUnit == null ? 43 : ((Object)$produceUnit).hashCode());
        Long $batchPriceUnit = this.getBatchPriceUnit();
        result = result * 59 + ($batchPriceUnit == null ? 43 : ((Object)$batchPriceUnit).hashCode());
        Long $batchUnit = this.getBatchUnit();
        result = result * 59 + ($batchUnit == null ? 43 : ((Object)$batchUnit).hashCode());
        Long $onlineUnit = this.getOnlineUnit();
        result = result * 59 + ($onlineUnit == null ? 43 : ((Object)$onlineUnit).hashCode());
        Long $offlineUnit = this.getOfflineUnit();
        result = result * 59 + ($offlineUnit == null ? 43 : ((Object)$offlineUnit).hashCode());
        Long $requireUnit = this.getRequireUnit();
        result = result * 59 + ($requireUnit == null ? 43 : ((Object)$requireUnit).hashCode());
        Boolean $displayPrice = this.getDisplayPrice();
        result = result * 59 + ($displayPrice == null ? 43 : ((Object)$displayPrice).hashCode());
        Long $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Boolean $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        Boolean $storeOffAndOffState = this.getStoreOffAndOffState();
        result = result * 59 + ($storeOffAndOffState == null ? 43 : ((Object)$storeOffAndOffState).hashCode());
        Boolean $orderLoadAndUnloadStatus = this.getOrderLoadAndUnloadStatus();
        result = result * 59 + ($orderLoadAndUnloadStatus == null ? 43 : ((Object)$orderLoadAndUnloadStatus).hashCode());
        Long $productVendor = this.getProductVendor();
        result = result * 59 + ($productVendor == null ? 43 : ((Object)$productVendor).hashCode());
        Boolean $canSale = this.getCanSale();
        result = result * 59 + ($canSale == null ? 43 : ((Object)$canSale).hashCode());
        Long $deliveryDays = this.getDeliveryDays();
        result = result * 59 + ($deliveryDays == null ? 43 : ((Object)$deliveryDays).hashCode());
        Boolean $batchManage = this.getBatchManage();
        result = result * 59 + ($batchManage == null ? 43 : ((Object)$batchManage).hashCode());
        Boolean $expiryDateManage = this.getExpiryDateManage();
        result = result * 59 + ($expiryDateManage == null ? 43 : ((Object)$expiryDateManage).hashCode());
        Short $expiryDateCalculationMethod = this.getExpiryDateCalculationMethod();
        result = result * 59 + ($expiryDateCalculationMethod == null ? 43 : ((Object)$expiryDateCalculationMethod).hashCode());
        Long $expireDateNo = this.getExpireDateNo();
        result = result * 59 + ($expireDateNo == null ? 43 : ((Object)$expireDateNo).hashCode());
        Long $daysBeforeValidityReject = this.getDaysBeforeValidityReject();
        result = result * 59 + ($daysBeforeValidityReject == null ? 43 : ((Object)$daysBeforeValidityReject).hashCode());
        Long $validityWarningDays = this.getValidityWarningDays();
        result = result * 59 + ($validityWarningDays == null ? 43 : ((Object)$validityWarningDays).hashCode());
        Boolean $serialNoManage = this.getSerialNoManage();
        result = result * 59 + ($serialNoManage == null ? 43 : ((Object)$serialNoManage).hashCode());
        Boolean $barcodeManage = this.getBarcodeManage();
        result = result * 59 + ($barcodeManage == null ? 43 : ((Object)$barcodeManage).hashCode());
        Long $receiptWarehouse = this.getReceiptWarehouse();
        result = result * 59 + ($receiptWarehouse == null ? 43 : ((Object)$receiptWarehouse).hashCode());
        Long $deliveryWarehouse = this.getDeliveryWarehouse();
        result = result * 59 + ($deliveryWarehouse == null ? 43 : ((Object)$deliveryWarehouse).hashCode());
        Long $returnWarehouse = this.getReturnWarehouse();
        result = result * 59 + ($returnWarehouse == null ? 43 : ((Object)$returnWarehouse).hashCode());
        Integer $planDefaultAttribute = this.getPlanDefaultAttribute();
        result = result * 59 + ($planDefaultAttribute == null ? 43 : ((Object)$planDefaultAttribute).hashCode());
        Boolean $allowNegativeInventory = this.getAllowNegativeInventory();
        result = result * 59 + ($allowNegativeInventory == null ? 43 : ((Object)$allowNegativeInventory).hashCode());
        Integer $planMethod = this.getPlanMethod();
        result = result * 59 + ($planMethod == null ? 43 : ((Object)$planMethod).hashCode());
        Boolean $keySubPart = this.getKeySubPart();
        result = result * 59 + ($keySubPart == null ? 43 : ((Object)$keySubPart).hashCode());
        Long $fixedLeadTime = this.getFixedLeadTime();
        result = result * 59 + ($fixedLeadTime == null ? 43 : ((Object)$fixedLeadTime).hashCode());
        Integer $supplyType = this.getSupplyType();
        result = result * 59 + ($supplyType == null ? 43 : ((Object)$supplyType).hashCode());
        Long $planProduceLimit = this.getPlanProduceLimit();
        result = result * 59 + ($planProduceLimit == null ? 43 : ((Object)$planProduceLimit).hashCode());
        Integer $batchRule = this.getBatchRule();
        result = result * 59 + ($batchRule == null ? 43 : ((Object)$batchRule).hashCode());
        Boolean $checkByBatch = this.getCheckByBatch();
        result = result * 59 + ($checkByBatch == null ? 43 : ((Object)$checkByBatch).hashCode());
        Long $salePoints = this.getSalePoints();
        result = result * 59 + ($salePoints == null ? 43 : ((Object)$salePoints).hashCode());
        Integer $baseSaleCount = this.getBaseSaleCount();
        result = result * 59 + ($baseSaleCount == null ? 43 : ((Object)$baseSaleCount).hashCode());
        Boolean $recommend = this.getRecommend();
        result = result * 59 + ($recommend == null ? 43 : ((Object)$recommend).hashCode());
        Boolean $allowStorePurchase = this.getAllowStorePurchase();
        result = result * 59 + ($allowStorePurchase == null ? 43 : ((Object)$allowStorePurchase).hashCode());
        Boolean $saleInOfflineStore = this.getSaleInOfflineStore();
        result = result * 59 + ($saleInOfflineStore == null ? 43 : ((Object)$saleInOfflineStore).hashCode());
        Boolean $priceChangeAllowed = this.getPriceChangeAllowed();
        result = result * 59 + ($priceChangeAllowed == null ? 43 : ((Object)$priceChangeAllowed).hashCode());
        Boolean $offlineStoreOrder = this.getOfflineStoreOrder();
        result = result * 59 + ($offlineStoreOrder == null ? 43 : ((Object)$offlineStoreOrder).hashCode());
        Boolean $offlineStoreReturn = this.getOfflineStoreReturn();
        result = result * 59 + ($offlineStoreReturn == null ? 43 : ((Object)$offlineStoreReturn).hashCode());
        Long $retailPriceDimension = this.getRetailPriceDimension();
        result = result * 59 + ($retailPriceDimension == null ? 43 : ((Object)$retailPriceDimension).hashCode());
        Long $deliverQuantityChange = this.getDeliverQuantityChange();
        result = result * 59 + ($deliverQuantityChange == null ? 43 : ((Object)$deliverQuantityChange).hashCode());
        Boolean $process = this.getProcess();
        result = result * 59 + ($process == null ? 43 : ((Object)$process).hashCode());
        Boolean $material = this.getMaterial();
        result = result * 59 + ($material == null ? 43 : ((Object)$material).hashCode());
        Boolean $weighingOrNot = this.getWeighingOrNot();
        result = result * 59 + ($weighingOrNot == null ? 43 : ((Object)$weighingOrNot).hashCode());
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
        String $shortName = this.getShortName();
        result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
        String $mnemonicCode = this.getMnemonicCode();
        result = result * 59 + ($mnemonicCode == null ? 43 : $mnemonicCode.hashCode());
        String $erpOuterCode = this.getErpOuterCode();
        result = result * 59 + ($erpOuterCode == null ? 43 : $erpOuterCode.hashCode());
        String $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : $barCode.hashCode());
        Object $productExtendCharacterDef = this.getProductExtendCharacterDef();
        result = result * 59 + ($productExtendCharacterDef == null ? 43 : $productExtendCharacterDef.hashCode());
        String $businessAttribute = this.getBusinessAttribute();
        result = result * 59 + ($businessAttribute == null ? 43 : $businessAttribute.hashCode());
        String $saleChannel = this.getSaleChannel();
        result = result * 59 + ($saleChannel == null ? 43 : $saleChannel.hashCode());
        String $purchaseUnitCode = this.getPurchaseUnitCode();
        result = result * 59 + ($purchaseUnitCode == null ? 43 : $purchaseUnitCode.hashCode());
        String $inspectionUnitCode = this.getInspectionUnitCode();
        result = result * 59 + ($inspectionUnitCode == null ? 43 : $inspectionUnitCode.hashCode());
        String $purchasePriceUnitCode = this.getPurchasePriceUnitCode();
        result = result * 59 + ($purchasePriceUnitCode == null ? 43 : $purchasePriceUnitCode.hashCode());
        String $stockUnitCode = this.getStockUnitCode();
        result = result * 59 + ($stockUnitCode == null ? 43 : $stockUnitCode.hashCode());
        String $produceUnitCode = this.getProduceUnitCode();
        result = result * 59 + ($produceUnitCode == null ? 43 : $produceUnitCode.hashCode());
        String $batchPriceUnitCode = this.getBatchPriceUnitCode();
        result = result * 59 + ($batchPriceUnitCode == null ? 43 : $batchPriceUnitCode.hashCode());
        String $batchUnitCode = this.getBatchUnitCode();
        result = result * 59 + ($batchUnitCode == null ? 43 : $batchUnitCode.hashCode());
        String $onlineUnitCode = this.getOnlineUnitCode();
        result = result * 59 + ($onlineUnitCode == null ? 43 : $onlineUnitCode.hashCode());
        String $offlineUnitCode = this.getOfflineUnitCode();
        result = result * 59 + ($offlineUnitCode == null ? 43 : $offlineUnitCode.hashCode());
        String $requireUnitCode = this.getRequireUnitCode();
        result = result * 59 + ($requireUnitCode == null ? 43 : $requireUnitCode.hashCode());
        BigDecimal $markPrice = this.getMarkPrice();
        result = result * 59 + ($markPrice == null ? 43 : ((Object)$markPrice).hashCode());
        BigDecimal $salePrice = this.getSalePrice();
        result = result * 59 + ($salePrice == null ? 43 : ((Object)$salePrice).hashCode());
        BigDecimal $marketPrice = this.getMarketPrice();
        result = result * 59 + ($marketPrice == null ? 43 : ((Object)$marketPrice).hashCode());
        String $priceAreaMessage = this.getPriceAreaMessage();
        result = result * 59 + ($priceAreaMessage == null ? 43 : $priceAreaMessage.hashCode());
        MultilingualVO $receiptName = this.getReceiptName();
        result = result * 59 + ($receiptName == null ? 43 : $receiptName.hashCode());
        String $incomeTaxRates = this.getIncomeTaxRates();
        result = result * 59 + ($incomeTaxRates == null ? 43 : $incomeTaxRates.hashCode());
        String $incomeTaxRatesCode = this.getIncomeTaxRatesCode();
        result = result * 59 + ($incomeTaxRatesCode == null ? 43 : $incomeTaxRatesCode.hashCode());
        String $outputTaxRate = this.getOutputTaxRate();
        result = result * 59 + ($outputTaxRate == null ? 43 : $outputTaxRate.hashCode());
        String $outTaxRateCode = this.getOutTaxRateCode();
        result = result * 59 + ($outTaxRateCode == null ? 43 : $outTaxRateCode.hashCode());
        String $productVendorCode = this.getProductVendorCode();
        result = result * 59 + ($productVendorCode == null ? 43 : $productVendorCode.hashCode());
        String $productBuyer = this.getProductBuyer();
        result = result * 59 + ($productBuyer == null ? 43 : $productBuyer.hashCode());
        String $productBuyerCode = this.getProductBuyerCode();
        result = result * 59 + ($productBuyerCode == null ? 43 : $productBuyerCode.hashCode());
        BigDecimal $primeCosts = this.getPrimeCosts();
        result = result * 59 + ($primeCosts == null ? 43 : ((Object)$primeCosts).hashCode());
        BigDecimal $maxPrimeCosts = this.getMaxPrimeCosts();
        result = result * 59 + ($maxPrimeCosts == null ? 43 : ((Object)$maxPrimeCosts).hashCode());
        BigDecimal $requestOrderLimit = this.getRequestOrderLimit();
        result = result * 59 + ($requestOrderLimit == null ? 43 : ((Object)$requestOrderLimit).hashCode());
        BigDecimal $minOrderQuantity = this.getMinOrderQuantity();
        result = result * 59 + ($minOrderQuantity == null ? 43 : ((Object)$minOrderQuantity).hashCode());
        String $expireDateUnit = this.getExpireDateUnit();
        result = result * 59 + ($expireDateUnit == null ? 43 : $expireDateUnit.hashCode());
        BigDecimal $safetyStock = this.getSafetyStock();
        result = result * 59 + ($safetyStock == null ? 43 : ((Object)$safetyStock).hashCode());
        BigDecimal $highestStock = this.getHighestStock();
        result = result * 59 + ($highestStock == null ? 43 : ((Object)$highestStock).hashCode());
        BigDecimal $lowestStock = this.getLowestStock();
        result = result * 59 + ($lowestStock == null ? 43 : ((Object)$lowestStock).hashCode());
        BigDecimal $ropStock = this.getRopStock();
        result = result * 59 + ($ropStock == null ? 43 : ((Object)$ropStock).hashCode());
        String $warehouseManager = this.getWarehouseManager();
        result = result * 59 + ($warehouseManager == null ? 43 : $warehouseManager.hashCode());
        String $warehouseManagerCode = this.getWarehouseManagerCode();
        result = result * 59 + ($warehouseManagerCode == null ? 43 : $warehouseManagerCode.hashCode());
        String $receiptWarehouseCode = this.getReceiptWarehouseCode();
        result = result * 59 + ($receiptWarehouseCode == null ? 43 : $receiptWarehouseCode.hashCode());
        String $deliveryWarehouseCode = this.getDeliveryWarehouseCode();
        result = result * 59 + ($deliveryWarehouseCode == null ? 43 : $deliveryWarehouseCode.hashCode());
        String $returnWarehouseCode = this.getReturnWarehouseCode();
        result = result * 59 + ($returnWarehouseCode == null ? 43 : $returnWarehouseCode.hashCode());
        BigDecimal $inStoreExcessLimit = this.getInStoreExcessLimit();
        result = result * 59 + ($inStoreExcessLimit == null ? 43 : ((Object)$inStoreExcessLimit).hashCode());
        BigDecimal $outStoreExcessLimit = this.getOutStoreExcessLimit();
        result = result * 59 + ($outStoreExcessLimit == null ? 43 : ((Object)$outStoreExcessLimit).hashCode());
        BigDecimal $storageLossRate = this.getStorageLossRate();
        result = result * 59 + ($storageLossRate == null ? 43 : ((Object)$storageLossRate).hashCode());
        String $produceDepartment = this.getProduceDepartment();
        result = result * 59 + ($produceDepartment == null ? 43 : $produceDepartment.hashCode());
        String $produceDepartmentCode = this.getProduceDepartmentCode();
        result = result * 59 + ($produceDepartmentCode == null ? 43 : $produceDepartmentCode.hashCode());
        String $manufacturePlanner = this.getManufacturePlanner();
        result = result * 59 + ($manufacturePlanner == null ? 43 : $manufacturePlanner.hashCode());
        String $manufacturePlannerCode = this.getManufacturePlannerCode();
        result = result * 59 + ($manufacturePlannerCode == null ? 43 : $manufacturePlannerCode.hashCode());
        String $engineeringDrawingNo = this.getEngineeringDrawingNo();
        result = result * 59 + ($engineeringDrawingNo == null ? 43 : $engineeringDrawingNo.hashCode());
        String $valueManageType = this.getValueManageType();
        result = result * 59 + ($valueManageType == null ? 43 : $valueManageType.hashCode());
        BigDecimal $fixedQuantity = this.getFixedQuantity();
        result = result * 59 + ($fixedQuantity == null ? 43 : ((Object)$fixedQuantity).hashCode());
        String $costValuation = this.getCostValuation();
        result = result * 59 + ($costValuation == null ? 43 : $costValuation.hashCode());
        BigDecimal $noTaxCostPrice = this.getNoTaxCostPrice();
        result = result * 59 + ($noTaxCostPrice == null ? 43 : ((Object)$noTaxCostPrice).hashCode());
        String $saleStyle = this.getSaleStyle();
        result = result * 59 + ($saleStyle == null ? 43 : $saleStyle.hashCode());
        BigDecimal $inventoryCount = this.getInventoryCount();
        result = result * 59 + ($inventoryCount == null ? 43 : ((Object)$inventoryCount).hashCode());
        MultilingualVO $metaDescription = this.getMetaDescription();
        result = result * 59 + ($metaDescription == null ? 43 : $metaDescription.hashCode());
        BigDecimal $settleAccountsRate = this.getSettleAccountsRate();
        result = result * 59 + ($settleAccountsRate == null ? 43 : ((Object)$settleAccountsRate).hashCode());
        MultilingualVO $displayName = this.getDisplayName();
        result = result * 59 + ($displayName == null ? 43 : $displayName.hashCode());
        MultilingualVO $titleMemo = this.getTitleMemo();
        result = result * 59 + ($titleMemo == null ? 43 : $titleMemo.hashCode());
        String $processType = this.getProcessType();
        result = result * 59 + ($processType == null ? 43 : $processType.hashCode());
        String $inventoryPlanStrategy = this.getInventoryPlanStrategy();
        result = result * 59 + ($inventoryPlanStrategy == null ? 43 : $inventoryPlanStrategy.hashCode());
        MultilingualVO $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        MultilingualVO $receiptSpecMultilingual = this.getReceiptSpecMultilingual();
        result = result * 59 + ($receiptSpecMultilingual == null ? 43 : $receiptSpecMultilingual.hashCode());
        MultilingualVO $receiptModelMultilingual = this.getReceiptModelMultilingual();
        result = result * 59 + ($receiptModelMultilingual == null ? 43 : $receiptModelMultilingual.hashCode());
        return result;
    }

    public String toString() {
        return "ProductIPassDetail(shortName=" + this.getShortName() + ", mnemonicCode=" + this.getMnemonicCode() + ", erpOuterCode=" + this.getErpOuterCode() + ", barCode=" + this.getBarCode() + ", productExtendCharacterDef=" + this.getProductExtendCharacterDef() + ", inspectionType=" + this.getInspectionType() + ", warehousingByResult=" + this.getWarehousingByResult() + ", testRule=" + this.getTestRule() + ", businessAttribute=" + this.getBusinessAttribute() + ", saleChannel=" + this.getSaleChannel() + ", purchaseUnit=" + this.getPurchaseUnit() + ", purchaseUnitCode=" + this.getPurchaseUnitCode() + ", inspectionUnit=" + this.getInspectionUnit() + ", inspectionUnitCode=" + this.getInspectionUnitCode() + ", purchasePriceUnit=" + this.getPurchasePriceUnit() + ", purchasePriceUnitCode=" + this.getPurchasePriceUnitCode() + ", stockUnit=" + this.getStockUnit() + ", stockUnitCode=" + this.getStockUnitCode() + ", produceUnit=" + this.getProduceUnit() + ", produceUnitCode=" + this.getProduceUnitCode() + ", batchPriceUnit=" + this.getBatchPriceUnit() + ", batchPriceUnitCode=" + this.getBatchPriceUnitCode() + ", batchUnit=" + this.getBatchUnit() + ", batchUnitCode=" + this.getBatchUnitCode() + ", onlineUnit=" + this.getOnlineUnit() + ", onlineUnitCode=" + this.getOnlineUnitCode() + ", offlineUnit=" + this.getOfflineUnit() + ", offlineUnitCode=" + this.getOfflineUnitCode() + ", requireUnit=" + this.getRequireUnit() + ", requireUnitCode=" + this.getRequireUnitCode() + ", markPrice=" + this.getMarkPrice() + ", salePrice=" + this.getSalePrice() + ", marketPrice=" + this.getMarketPrice() + ", displayPrice=" + this.getDisplayPrice() + ", priceAreaMessage=" + this.getPriceAreaMessage() + ", receiptName=" + this.getReceiptName() + ", incomeTaxRates=" + this.getIncomeTaxRates() + ", incomeTaxRatesCode=" + this.getIncomeTaxRatesCode() + ", outputTaxRate=" + this.getOutputTaxRate() + ", outTaxRateCode=" + this.getOutTaxRateCode() + ", order=" + this.getOrder() + ", stopstatus=" + this.getStopstatus() + ", storeOffAndOffState=" + this.getStoreOffAndOffState() + ", orderLoadAndUnloadStatus=" + this.getOrderLoadAndUnloadStatus() + ", productVendor=" + this.getProductVendor() + ", productVendorCode=" + this.getProductVendorCode() + ", productBuyer=" + this.getProductBuyer() + ", productBuyerCode=" + this.getProductBuyerCode() + ", primeCosts=" + this.getPrimeCosts() + ", maxPrimeCosts=" + this.getMaxPrimeCosts() + ", requestOrderLimit=" + this.getRequestOrderLimit() + ", canSale=" + this.getCanSale() + ", minOrderQuantity=" + this.getMinOrderQuantity() + ", deliveryDays=" + this.getDeliveryDays() + ", batchManage=" + this.getBatchManage() + ", expiryDateManage=" + this.getExpiryDateManage() + ", expiryDateCalculationMethod=" + this.getExpiryDateCalculationMethod() + ", expireDateNo=" + this.getExpireDateNo() + ", expireDateUnit=" + this.getExpireDateUnit() + ", daysBeforeValidityReject=" + this.getDaysBeforeValidityReject() + ", validityWarningDays=" + this.getValidityWarningDays() + ", serialNoManage=" + this.getSerialNoManage() + ", barcodeManage=" + this.getBarcodeManage() + ", safetyStock=" + this.getSafetyStock() + ", highestStock=" + this.getHighestStock() + ", lowestStock=" + this.getLowestStock() + ", ropStock=" + this.getRopStock() + ", warehouseManager=" + this.getWarehouseManager() + ", warehouseManagerCode=" + this.getWarehouseManagerCode() + ", receiptWarehouse=" + this.getReceiptWarehouse() + ", receiptWarehouseCode=" + this.getReceiptWarehouseCode() + ", deliveryWarehouse=" + this.getDeliveryWarehouse() + ", deliveryWarehouseCode=" + this.getDeliveryWarehouseCode() + ", returnWarehouse=" + this.getReturnWarehouse() + ", returnWarehouseCode=" + this.getReturnWarehouseCode() + ", inStoreExcessLimit=" + this.getInStoreExcessLimit() + ", outStoreExcessLimit=" + this.getOutStoreExcessLimit() + ", storageLossRate=" + this.getStorageLossRate() + ", planDefaultAttribute=" + this.getPlanDefaultAttribute() + ", allowNegativeInventory=" + this.getAllowNegativeInventory() + ", planMethod=" + this.getPlanMethod() + ", keySubPart=" + this.getKeySubPart() + ", fixedLeadTime=" + this.getFixedLeadTime() + ", supplyType=" + this.getSupplyType() + ", produceDepartment=" + this.getProduceDepartment() + ", produceDepartmentCode=" + this.getProduceDepartmentCode() + ", manufacturePlanner=" + this.getManufacturePlanner() + ", manufacturePlannerCode=" + this.getManufacturePlannerCode() + ", engineeringDrawingNo=" + this.getEngineeringDrawingNo() + ", planProduceLimit=" + this.getPlanProduceLimit() + ", valueManageType=" + this.getValueManageType() + ", batchRule=" + this.getBatchRule() + ", fixedQuantity=" + this.getFixedQuantity() + ", costValuation=" + this.getCostValuation() + ", noTaxCostPrice=" + this.getNoTaxCostPrice() + ", checkByBatch=" + this.getCheckByBatch() + ", saleStyle=" + this.getSaleStyle() + ", salePoints=" + this.getSalePoints() + ", inventoryCount=" + this.getInventoryCount() + ", baseSaleCount=" + this.getBaseSaleCount() + ", metaDescription=" + this.getMetaDescription() + ", settleAccountsRate=" + this.getSettleAccountsRate() + ", recommend=" + this.getRecommend() + ", displayName=" + this.getDisplayName() + ", titleMemo=" + this.getTitleMemo() + ", allowStorePurchase=" + this.getAllowStorePurchase() + ", saleInOfflineStore=" + this.getSaleInOfflineStore() + ", priceChangeAllowed=" + this.getPriceChangeAllowed() + ", offlineStoreOrder=" + this.getOfflineStoreOrder() + ", offlineStoreReturn=" + this.getOfflineStoreReturn() + ", retailPriceDimension=" + this.getRetailPriceDimension() + ", deliverQuantityChange=" + this.getDeliverQuantityChange() + ", process=" + this.getProcess() + ", processType=" + this.getProcessType() + ", material=" + this.getMaterial() + ", weighingOrNot=" + this.getWeighingOrNot() + ", inventoryPlanStrategy=" + this.getInventoryPlanStrategy() + ", remark=" + this.getRemark() + ", receiptSpecMultilingual=" + this.getReceiptSpecMultilingual() + ", receiptModelMultilingual=" + this.getReceiptModelMultilingual() + ", productInspection=" + this.getProductInspection() + ", productInspectionCtrlPoint=" + this.getProductInspectionCtrlPoint() + ", outSourceInspection=" + this.getOutSourceInspection() + ", outSourceInspectionCtrlPoint=" + this.getOutSourceInspectionCtrlPoint() + ", transferInspection=" + this.getTransferInspection() + ", transferInspectionCtrlPoint=" + this.getTransferInspectionCtrlPoint() + ", productFirstInspection=" + this.getProductFirstInspection() + ", firstInspectionCtrlMethod=" + this.getFirstInspectionCtrlMethod() + ", sendInspectionCtrlPoint=" + this.getSendInspectionCtrlPoint() + ", returnInspectionCtrlPoint=" + this.getReturnInspectionCtrlPoint() + ", inspectionControlPoint=" + this.getInspectionControlPoint() + ")";
    }
}

