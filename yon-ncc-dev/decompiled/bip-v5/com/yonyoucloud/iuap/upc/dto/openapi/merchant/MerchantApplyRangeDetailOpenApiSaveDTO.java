/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.openapi.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.HashMap;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantApplyRangeDetailOpenApiSaveDTO
implements Serializable {
    public String searchCode;
    public Long customerLevelId;
    public String customerLevelCode;
    public Long customerTypeId;
    public String customerTypeCode;
    public Long deliveryWarehouseId;
    public String deliveryWarehouseCode;
    public String transactionCurrencyId;
    public String transactionCurrencyName;
    public String exchangeRateTypeId;
    public String exchangeRateTypeCode;
    public String taxRateNtaxId;
    public String taxRateNtaxRate;
    public Long payWay;
    public Long creditServiceDay;
    public Long collectionAgreementId;
    public String collectionAgreementName;
    public Long settlementMethodId;
    public String settlementMethodName;
    public Long shipmentMethodId;
    public String shipmentMethodName;
    public Boolean signBack;
    public String isTradeCustomers;
    public Boolean stopStatus;
    private HashMap<String, Object> merchantApplyRangeDetailCharacter;
    private String createTime;
    private String modifyTime;
    private String creator;
    private String modifier;
    private Integer priceMarking;

    public String getSearchCode() {
        return this.searchCode;
    }

    public Long getCustomerLevelId() {
        return this.customerLevelId;
    }

    public String getCustomerLevelCode() {
        return this.customerLevelCode;
    }

    public Long getCustomerTypeId() {
        return this.customerTypeId;
    }

    public String getCustomerTypeCode() {
        return this.customerTypeCode;
    }

    public Long getDeliveryWarehouseId() {
        return this.deliveryWarehouseId;
    }

    public String getDeliveryWarehouseCode() {
        return this.deliveryWarehouseCode;
    }

    public String getTransactionCurrencyId() {
        return this.transactionCurrencyId;
    }

    public String getTransactionCurrencyName() {
        return this.transactionCurrencyName;
    }

    public String getExchangeRateTypeId() {
        return this.exchangeRateTypeId;
    }

    public String getExchangeRateTypeCode() {
        return this.exchangeRateTypeCode;
    }

    public String getTaxRateNtaxId() {
        return this.taxRateNtaxId;
    }

    public String getTaxRateNtaxRate() {
        return this.taxRateNtaxRate;
    }

    public Long getPayWay() {
        return this.payWay;
    }

    public Long getCreditServiceDay() {
        return this.creditServiceDay;
    }

    public Long getCollectionAgreementId() {
        return this.collectionAgreementId;
    }

    public String getCollectionAgreementName() {
        return this.collectionAgreementName;
    }

    public Long getSettlementMethodId() {
        return this.settlementMethodId;
    }

    public String getSettlementMethodName() {
        return this.settlementMethodName;
    }

    public Long getShipmentMethodId() {
        return this.shipmentMethodId;
    }

    public String getShipmentMethodName() {
        return this.shipmentMethodName;
    }

    public Boolean getSignBack() {
        return this.signBack;
    }

    public String getIsTradeCustomers() {
        return this.isTradeCustomers;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public HashMap<String, Object> getMerchantApplyRangeDetailCharacter() {
        return this.merchantApplyRangeDetailCharacter;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getModifyTime() {
        return this.modifyTime;
    }

    public String getCreator() {
        return this.creator;
    }

    public String getModifier() {
        return this.modifier;
    }

    public Integer getPriceMarking() {
        return this.priceMarking;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode;
    }

    public void setCustomerLevelId(Long customerLevelId) {
        this.customerLevelId = customerLevelId;
    }

    public void setCustomerLevelCode(String customerLevelCode) {
        this.customerLevelCode = customerLevelCode;
    }

    public void setCustomerTypeId(Long customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public void setCustomerTypeCode(String customerTypeCode) {
        this.customerTypeCode = customerTypeCode;
    }

    public void setDeliveryWarehouseId(Long deliveryWarehouseId) {
        this.deliveryWarehouseId = deliveryWarehouseId;
    }

    public void setDeliveryWarehouseCode(String deliveryWarehouseCode) {
        this.deliveryWarehouseCode = deliveryWarehouseCode;
    }

    public void setTransactionCurrencyId(String transactionCurrencyId) {
        this.transactionCurrencyId = transactionCurrencyId;
    }

    public void setTransactionCurrencyName(String transactionCurrencyName) {
        this.transactionCurrencyName = transactionCurrencyName;
    }

    public void setExchangeRateTypeId(String exchangeRateTypeId) {
        this.exchangeRateTypeId = exchangeRateTypeId;
    }

    public void setExchangeRateTypeCode(String exchangeRateTypeCode) {
        this.exchangeRateTypeCode = exchangeRateTypeCode;
    }

    public void setTaxRateNtaxId(String taxRateNtaxId) {
        this.taxRateNtaxId = taxRateNtaxId;
    }

    public void setTaxRateNtaxRate(String taxRateNtaxRate) {
        this.taxRateNtaxRate = taxRateNtaxRate;
    }

    public void setPayWay(Long payWay) {
        this.payWay = payWay;
    }

    public void setCreditServiceDay(Long creditServiceDay) {
        this.creditServiceDay = creditServiceDay;
    }

    public void setCollectionAgreementId(Long collectionAgreementId) {
        this.collectionAgreementId = collectionAgreementId;
    }

    public void setCollectionAgreementName(String collectionAgreementName) {
        this.collectionAgreementName = collectionAgreementName;
    }

    public void setSettlementMethodId(Long settlementMethodId) {
        this.settlementMethodId = settlementMethodId;
    }

    public void setSettlementMethodName(String settlementMethodName) {
        this.settlementMethodName = settlementMethodName;
    }

    public void setShipmentMethodId(Long shipmentMethodId) {
        this.shipmentMethodId = shipmentMethodId;
    }

    public void setShipmentMethodName(String shipmentMethodName) {
        this.shipmentMethodName = shipmentMethodName;
    }

    public void setSignBack(Boolean signBack) {
        this.signBack = signBack;
    }

    public void setIsTradeCustomers(String isTradeCustomers) {
        this.isTradeCustomers = isTradeCustomers;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setMerchantApplyRangeDetailCharacter(HashMap<String, Object> merchantApplyRangeDetailCharacter) {
        this.merchantApplyRangeDetailCharacter = merchantApplyRangeDetailCharacter;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setPriceMarking(Integer priceMarking) {
        this.priceMarking = priceMarking;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantApplyRangeDetailOpenApiSaveDTO)) {
            return false;
        }
        MerchantApplyRangeDetailOpenApiSaveDTO other = (MerchantApplyRangeDetailOpenApiSaveDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$customerLevelId = this.getCustomerLevelId();
        Long other$customerLevelId = other.getCustomerLevelId();
        if (this$customerLevelId == null ? other$customerLevelId != null : !((Object)this$customerLevelId).equals(other$customerLevelId)) {
            return false;
        }
        Long this$customerTypeId = this.getCustomerTypeId();
        Long other$customerTypeId = other.getCustomerTypeId();
        if (this$customerTypeId == null ? other$customerTypeId != null : !((Object)this$customerTypeId).equals(other$customerTypeId)) {
            return false;
        }
        Long this$deliveryWarehouseId = this.getDeliveryWarehouseId();
        Long other$deliveryWarehouseId = other.getDeliveryWarehouseId();
        if (this$deliveryWarehouseId == null ? other$deliveryWarehouseId != null : !((Object)this$deliveryWarehouseId).equals(other$deliveryWarehouseId)) {
            return false;
        }
        Long this$payWay = this.getPayWay();
        Long other$payWay = other.getPayWay();
        if (this$payWay == null ? other$payWay != null : !((Object)this$payWay).equals(other$payWay)) {
            return false;
        }
        Long this$creditServiceDay = this.getCreditServiceDay();
        Long other$creditServiceDay = other.getCreditServiceDay();
        if (this$creditServiceDay == null ? other$creditServiceDay != null : !((Object)this$creditServiceDay).equals(other$creditServiceDay)) {
            return false;
        }
        Long this$collectionAgreementId = this.getCollectionAgreementId();
        Long other$collectionAgreementId = other.getCollectionAgreementId();
        if (this$collectionAgreementId == null ? other$collectionAgreementId != null : !((Object)this$collectionAgreementId).equals(other$collectionAgreementId)) {
            return false;
        }
        Long this$settlementMethodId = this.getSettlementMethodId();
        Long other$settlementMethodId = other.getSettlementMethodId();
        if (this$settlementMethodId == null ? other$settlementMethodId != null : !((Object)this$settlementMethodId).equals(other$settlementMethodId)) {
            return false;
        }
        Long this$shipmentMethodId = this.getShipmentMethodId();
        Long other$shipmentMethodId = other.getShipmentMethodId();
        if (this$shipmentMethodId == null ? other$shipmentMethodId != null : !((Object)this$shipmentMethodId).equals(other$shipmentMethodId)) {
            return false;
        }
        Boolean this$signBack = this.getSignBack();
        Boolean other$signBack = other.getSignBack();
        if (this$signBack == null ? other$signBack != null : !((Object)this$signBack).equals(other$signBack)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Integer this$priceMarking = this.getPriceMarking();
        Integer other$priceMarking = other.getPriceMarking();
        if (this$priceMarking == null ? other$priceMarking != null : !((Object)this$priceMarking).equals(other$priceMarking)) {
            return false;
        }
        String this$searchCode = this.getSearchCode();
        String other$searchCode = other.getSearchCode();
        if (this$searchCode == null ? other$searchCode != null : !this$searchCode.equals(other$searchCode)) {
            return false;
        }
        String this$customerLevelCode = this.getCustomerLevelCode();
        String other$customerLevelCode = other.getCustomerLevelCode();
        if (this$customerLevelCode == null ? other$customerLevelCode != null : !this$customerLevelCode.equals(other$customerLevelCode)) {
            return false;
        }
        String this$customerTypeCode = this.getCustomerTypeCode();
        String other$customerTypeCode = other.getCustomerTypeCode();
        if (this$customerTypeCode == null ? other$customerTypeCode != null : !this$customerTypeCode.equals(other$customerTypeCode)) {
            return false;
        }
        String this$deliveryWarehouseCode = this.getDeliveryWarehouseCode();
        String other$deliveryWarehouseCode = other.getDeliveryWarehouseCode();
        if (this$deliveryWarehouseCode == null ? other$deliveryWarehouseCode != null : !this$deliveryWarehouseCode.equals(other$deliveryWarehouseCode)) {
            return false;
        }
        String this$transactionCurrencyId = this.getTransactionCurrencyId();
        String other$transactionCurrencyId = other.getTransactionCurrencyId();
        if (this$transactionCurrencyId == null ? other$transactionCurrencyId != null : !this$transactionCurrencyId.equals(other$transactionCurrencyId)) {
            return false;
        }
        String this$transactionCurrencyName = this.getTransactionCurrencyName();
        String other$transactionCurrencyName = other.getTransactionCurrencyName();
        if (this$transactionCurrencyName == null ? other$transactionCurrencyName != null : !this$transactionCurrencyName.equals(other$transactionCurrencyName)) {
            return false;
        }
        String this$exchangeRateTypeId = this.getExchangeRateTypeId();
        String other$exchangeRateTypeId = other.getExchangeRateTypeId();
        if (this$exchangeRateTypeId == null ? other$exchangeRateTypeId != null : !this$exchangeRateTypeId.equals(other$exchangeRateTypeId)) {
            return false;
        }
        String this$exchangeRateTypeCode = this.getExchangeRateTypeCode();
        String other$exchangeRateTypeCode = other.getExchangeRateTypeCode();
        if (this$exchangeRateTypeCode == null ? other$exchangeRateTypeCode != null : !this$exchangeRateTypeCode.equals(other$exchangeRateTypeCode)) {
            return false;
        }
        String this$taxRateNtaxId = this.getTaxRateNtaxId();
        String other$taxRateNtaxId = other.getTaxRateNtaxId();
        if (this$taxRateNtaxId == null ? other$taxRateNtaxId != null : !this$taxRateNtaxId.equals(other$taxRateNtaxId)) {
            return false;
        }
        String this$taxRateNtaxRate = this.getTaxRateNtaxRate();
        String other$taxRateNtaxRate = other.getTaxRateNtaxRate();
        if (this$taxRateNtaxRate == null ? other$taxRateNtaxRate != null : !this$taxRateNtaxRate.equals(other$taxRateNtaxRate)) {
            return false;
        }
        String this$collectionAgreementName = this.getCollectionAgreementName();
        String other$collectionAgreementName = other.getCollectionAgreementName();
        if (this$collectionAgreementName == null ? other$collectionAgreementName != null : !this$collectionAgreementName.equals(other$collectionAgreementName)) {
            return false;
        }
        String this$settlementMethodName = this.getSettlementMethodName();
        String other$settlementMethodName = other.getSettlementMethodName();
        if (this$settlementMethodName == null ? other$settlementMethodName != null : !this$settlementMethodName.equals(other$settlementMethodName)) {
            return false;
        }
        String this$shipmentMethodName = this.getShipmentMethodName();
        String other$shipmentMethodName = other.getShipmentMethodName();
        if (this$shipmentMethodName == null ? other$shipmentMethodName != null : !this$shipmentMethodName.equals(other$shipmentMethodName)) {
            return false;
        }
        String this$isTradeCustomers = this.getIsTradeCustomers();
        String other$isTradeCustomers = other.getIsTradeCustomers();
        if (this$isTradeCustomers == null ? other$isTradeCustomers != null : !this$isTradeCustomers.equals(other$isTradeCustomers)) {
            return false;
        }
        HashMap<String, Object> this$merchantApplyRangeDetailCharacter = this.getMerchantApplyRangeDetailCharacter();
        HashMap<String, Object> other$merchantApplyRangeDetailCharacter = other.getMerchantApplyRangeDetailCharacter();
        if (this$merchantApplyRangeDetailCharacter == null ? other$merchantApplyRangeDetailCharacter != null : !((Object)this$merchantApplyRangeDetailCharacter).equals(other$merchantApplyRangeDetailCharacter)) {
            return false;
        }
        String this$createTime = this.getCreateTime();
        String other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) {
            return false;
        }
        String this$modifyTime = this.getModifyTime();
        String other$modifyTime = other.getModifyTime();
        if (this$modifyTime == null ? other$modifyTime != null : !this$modifyTime.equals(other$modifyTime)) {
            return false;
        }
        String this$creator = this.getCreator();
        String other$creator = other.getCreator();
        if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) {
            return false;
        }
        String this$modifier = this.getModifier();
        String other$modifier = other.getModifier();
        return !(this$modifier == null ? other$modifier != null : !this$modifier.equals(other$modifier));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantApplyRangeDetailOpenApiSaveDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $customerLevelId = this.getCustomerLevelId();
        result = result * 59 + ($customerLevelId == null ? 43 : ((Object)$customerLevelId).hashCode());
        Long $customerTypeId = this.getCustomerTypeId();
        result = result * 59 + ($customerTypeId == null ? 43 : ((Object)$customerTypeId).hashCode());
        Long $deliveryWarehouseId = this.getDeliveryWarehouseId();
        result = result * 59 + ($deliveryWarehouseId == null ? 43 : ((Object)$deliveryWarehouseId).hashCode());
        Long $payWay = this.getPayWay();
        result = result * 59 + ($payWay == null ? 43 : ((Object)$payWay).hashCode());
        Long $creditServiceDay = this.getCreditServiceDay();
        result = result * 59 + ($creditServiceDay == null ? 43 : ((Object)$creditServiceDay).hashCode());
        Long $collectionAgreementId = this.getCollectionAgreementId();
        result = result * 59 + ($collectionAgreementId == null ? 43 : ((Object)$collectionAgreementId).hashCode());
        Long $settlementMethodId = this.getSettlementMethodId();
        result = result * 59 + ($settlementMethodId == null ? 43 : ((Object)$settlementMethodId).hashCode());
        Long $shipmentMethodId = this.getShipmentMethodId();
        result = result * 59 + ($shipmentMethodId == null ? 43 : ((Object)$shipmentMethodId).hashCode());
        Boolean $signBack = this.getSignBack();
        result = result * 59 + ($signBack == null ? 43 : ((Object)$signBack).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Integer $priceMarking = this.getPriceMarking();
        result = result * 59 + ($priceMarking == null ? 43 : ((Object)$priceMarking).hashCode());
        String $searchCode = this.getSearchCode();
        result = result * 59 + ($searchCode == null ? 43 : $searchCode.hashCode());
        String $customerLevelCode = this.getCustomerLevelCode();
        result = result * 59 + ($customerLevelCode == null ? 43 : $customerLevelCode.hashCode());
        String $customerTypeCode = this.getCustomerTypeCode();
        result = result * 59 + ($customerTypeCode == null ? 43 : $customerTypeCode.hashCode());
        String $deliveryWarehouseCode = this.getDeliveryWarehouseCode();
        result = result * 59 + ($deliveryWarehouseCode == null ? 43 : $deliveryWarehouseCode.hashCode());
        String $transactionCurrencyId = this.getTransactionCurrencyId();
        result = result * 59 + ($transactionCurrencyId == null ? 43 : $transactionCurrencyId.hashCode());
        String $transactionCurrencyName = this.getTransactionCurrencyName();
        result = result * 59 + ($transactionCurrencyName == null ? 43 : $transactionCurrencyName.hashCode());
        String $exchangeRateTypeId = this.getExchangeRateTypeId();
        result = result * 59 + ($exchangeRateTypeId == null ? 43 : $exchangeRateTypeId.hashCode());
        String $exchangeRateTypeCode = this.getExchangeRateTypeCode();
        result = result * 59 + ($exchangeRateTypeCode == null ? 43 : $exchangeRateTypeCode.hashCode());
        String $taxRateNtaxId = this.getTaxRateNtaxId();
        result = result * 59 + ($taxRateNtaxId == null ? 43 : $taxRateNtaxId.hashCode());
        String $taxRateNtaxRate = this.getTaxRateNtaxRate();
        result = result * 59 + ($taxRateNtaxRate == null ? 43 : $taxRateNtaxRate.hashCode());
        String $collectionAgreementName = this.getCollectionAgreementName();
        result = result * 59 + ($collectionAgreementName == null ? 43 : $collectionAgreementName.hashCode());
        String $settlementMethodName = this.getSettlementMethodName();
        result = result * 59 + ($settlementMethodName == null ? 43 : $settlementMethodName.hashCode());
        String $shipmentMethodName = this.getShipmentMethodName();
        result = result * 59 + ($shipmentMethodName == null ? 43 : $shipmentMethodName.hashCode());
        String $isTradeCustomers = this.getIsTradeCustomers();
        result = result * 59 + ($isTradeCustomers == null ? 43 : $isTradeCustomers.hashCode());
        HashMap<String, Object> $merchantApplyRangeDetailCharacter = this.getMerchantApplyRangeDetailCharacter();
        result = result * 59 + ($merchantApplyRangeDetailCharacter == null ? 43 : ((Object)$merchantApplyRangeDetailCharacter).hashCode());
        String $createTime = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : $createTime.hashCode());
        String $modifyTime = this.getModifyTime();
        result = result * 59 + ($modifyTime == null ? 43 : $modifyTime.hashCode());
        String $creator = this.getCreator();
        result = result * 59 + ($creator == null ? 43 : $creator.hashCode());
        String $modifier = this.getModifier();
        result = result * 59 + ($modifier == null ? 43 : $modifier.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantApplyRangeDetailOpenApiSaveDTO(searchCode=" + this.getSearchCode() + ", customerLevelId=" + this.getCustomerLevelId() + ", customerLevelCode=" + this.getCustomerLevelCode() + ", customerTypeId=" + this.getCustomerTypeId() + ", customerTypeCode=" + this.getCustomerTypeCode() + ", deliveryWarehouseId=" + this.getDeliveryWarehouseId() + ", deliveryWarehouseCode=" + this.getDeliveryWarehouseCode() + ", transactionCurrencyId=" + this.getTransactionCurrencyId() + ", transactionCurrencyName=" + this.getTransactionCurrencyName() + ", exchangeRateTypeId=" + this.getExchangeRateTypeId() + ", exchangeRateTypeCode=" + this.getExchangeRateTypeCode() + ", taxRateNtaxId=" + this.getTaxRateNtaxId() + ", taxRateNtaxRate=" + this.getTaxRateNtaxRate() + ", payWay=" + this.getPayWay() + ", creditServiceDay=" + this.getCreditServiceDay() + ", collectionAgreementId=" + this.getCollectionAgreementId() + ", collectionAgreementName=" + this.getCollectionAgreementName() + ", settlementMethodId=" + this.getSettlementMethodId() + ", settlementMethodName=" + this.getSettlementMethodName() + ", shipmentMethodId=" + this.getShipmentMethodId() + ", shipmentMethodName=" + this.getShipmentMethodName() + ", signBack=" + this.getSignBack() + ", isTradeCustomers=" + this.getIsTradeCustomers() + ", stopStatus=" + this.getStopStatus() + ", merchantApplyRangeDetailCharacter=" + this.getMerchantApplyRangeDetailCharacter() + ", createTime=" + this.getCreateTime() + ", modifyTime=" + this.getModifyTime() + ", creator=" + this.getCreator() + ", modifier=" + this.getModifier() + ", priceMarking=" + this.getPriceMarking() + ")";
    }
}

