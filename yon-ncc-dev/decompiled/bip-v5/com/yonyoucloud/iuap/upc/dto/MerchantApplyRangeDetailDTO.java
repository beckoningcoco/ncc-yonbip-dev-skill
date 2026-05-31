/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantApplyRangeDetailDTO
implements Serializable {
    private Long id;
    private Long merchantApplyRangeId;
    private String orgId;
    private String belongOrg;
    private String searchCode;
    private String specialManagementDep;
    private String professSalesman;
    private String transactionCurrency;
    private String taxRate;
    private Long deliveryWarehouse;
    private Integer creditServiceDay;
    private Long collectionAgreement;
    private Long settlementMethod;
    private String settlementMethodName;
    private Long shipmentMethod;
    private String shipmentMethodName;
    private Boolean signBack;
    private Boolean stopStatus;
    private Long customerArea;
    private Long customerLevel;
    private String exchangeRateType;
    private Integer payWay;
    private Long customerType;
    private String frozenState;
    private String freezingLink;
    private String orgDefaultAddress;
    private String businessRole;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getBelongOrg() {
        return this.belongOrg;
    }

    public String getSearchCode() {
        return this.searchCode;
    }

    public String getSpecialManagementDep() {
        return this.specialManagementDep;
    }

    public String getProfessSalesman() {
        return this.professSalesman;
    }

    public String getTransactionCurrency() {
        return this.transactionCurrency;
    }

    public String getTaxRate() {
        return this.taxRate;
    }

    public Long getDeliveryWarehouse() {
        return this.deliveryWarehouse;
    }

    public Integer getCreditServiceDay() {
        return this.creditServiceDay;
    }

    public Long getCollectionAgreement() {
        return this.collectionAgreement;
    }

    public Long getSettlementMethod() {
        return this.settlementMethod;
    }

    public String getSettlementMethodName() {
        return this.settlementMethodName;
    }

    public Long getShipmentMethod() {
        return this.shipmentMethod;
    }

    public String getShipmentMethodName() {
        return this.shipmentMethodName;
    }

    public Boolean getSignBack() {
        return this.signBack;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public Long getCustomerArea() {
        return this.customerArea;
    }

    public Long getCustomerLevel() {
        return this.customerLevel;
    }

    public String getExchangeRateType() {
        return this.exchangeRateType;
    }

    public Integer getPayWay() {
        return this.payWay;
    }

    public Long getCustomerType() {
        return this.customerType;
    }

    public String getFrozenState() {
        return this.frozenState;
    }

    public String getFreezingLink() {
        return this.freezingLink;
    }

    public String getOrgDefaultAddress() {
        return this.orgDefaultAddress;
    }

    public String getBusinessRole() {
        return this.businessRole;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setBelongOrg(String belongOrg) {
        this.belongOrg = belongOrg;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode;
    }

    public void setSpecialManagementDep(String specialManagementDep) {
        this.specialManagementDep = specialManagementDep;
    }

    public void setProfessSalesman(String professSalesman) {
        this.professSalesman = professSalesman;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    public void setDeliveryWarehouse(Long deliveryWarehouse) {
        this.deliveryWarehouse = deliveryWarehouse;
    }

    public void setCreditServiceDay(Integer creditServiceDay) {
        this.creditServiceDay = creditServiceDay;
    }

    public void setCollectionAgreement(Long collectionAgreement) {
        this.collectionAgreement = collectionAgreement;
    }

    public void setSettlementMethod(Long settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    public void setSettlementMethodName(String settlementMethodName) {
        this.settlementMethodName = settlementMethodName;
    }

    public void setShipmentMethod(Long shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    public void setShipmentMethodName(String shipmentMethodName) {
        this.shipmentMethodName = shipmentMethodName;
    }

    public void setSignBack(Boolean signBack) {
        this.signBack = signBack;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setCustomerArea(Long customerArea) {
        this.customerArea = customerArea;
    }

    public void setCustomerLevel(Long customerLevel) {
        this.customerLevel = customerLevel;
    }

    public void setExchangeRateType(String exchangeRateType) {
        this.exchangeRateType = exchangeRateType;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    public void setCustomerType(Long customerType) {
        this.customerType = customerType;
    }

    public void setFrozenState(String frozenState) {
        this.frozenState = frozenState;
    }

    public void setFreezingLink(String freezingLink) {
        this.freezingLink = freezingLink;
    }

    public void setOrgDefaultAddress(String orgDefaultAddress) {
        this.orgDefaultAddress = orgDefaultAddress;
    }

    public void setBusinessRole(String businessRole) {
        this.businessRole = businessRole;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantApplyRangeDetailDTO)) {
            return false;
        }
        MerchantApplyRangeDetailDTO other = (MerchantApplyRangeDetailDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$merchantApplyRangeId = this.getMerchantApplyRangeId();
        Long other$merchantApplyRangeId = other.getMerchantApplyRangeId();
        if (this$merchantApplyRangeId == null ? other$merchantApplyRangeId != null : !((Object)this$merchantApplyRangeId).equals(other$merchantApplyRangeId)) {
            return false;
        }
        Long this$deliveryWarehouse = this.getDeliveryWarehouse();
        Long other$deliveryWarehouse = other.getDeliveryWarehouse();
        if (this$deliveryWarehouse == null ? other$deliveryWarehouse != null : !((Object)this$deliveryWarehouse).equals(other$deliveryWarehouse)) {
            return false;
        }
        Integer this$creditServiceDay = this.getCreditServiceDay();
        Integer other$creditServiceDay = other.getCreditServiceDay();
        if (this$creditServiceDay == null ? other$creditServiceDay != null : !((Object)this$creditServiceDay).equals(other$creditServiceDay)) {
            return false;
        }
        Long this$collectionAgreement = this.getCollectionAgreement();
        Long other$collectionAgreement = other.getCollectionAgreement();
        if (this$collectionAgreement == null ? other$collectionAgreement != null : !((Object)this$collectionAgreement).equals(other$collectionAgreement)) {
            return false;
        }
        Long this$settlementMethod = this.getSettlementMethod();
        Long other$settlementMethod = other.getSettlementMethod();
        if (this$settlementMethod == null ? other$settlementMethod != null : !((Object)this$settlementMethod).equals(other$settlementMethod)) {
            return false;
        }
        Long this$shipmentMethod = this.getShipmentMethod();
        Long other$shipmentMethod = other.getShipmentMethod();
        if (this$shipmentMethod == null ? other$shipmentMethod != null : !((Object)this$shipmentMethod).equals(other$shipmentMethod)) {
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
        Long this$customerArea = this.getCustomerArea();
        Long other$customerArea = other.getCustomerArea();
        if (this$customerArea == null ? other$customerArea != null : !((Object)this$customerArea).equals(other$customerArea)) {
            return false;
        }
        Long this$customerLevel = this.getCustomerLevel();
        Long other$customerLevel = other.getCustomerLevel();
        if (this$customerLevel == null ? other$customerLevel != null : !((Object)this$customerLevel).equals(other$customerLevel)) {
            return false;
        }
        Integer this$payWay = this.getPayWay();
        Integer other$payWay = other.getPayWay();
        if (this$payWay == null ? other$payWay != null : !((Object)this$payWay).equals(other$payWay)) {
            return false;
        }
        Long this$customerType = this.getCustomerType();
        Long other$customerType = other.getCustomerType();
        if (this$customerType == null ? other$customerType != null : !((Object)this$customerType).equals(other$customerType)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$belongOrg = this.getBelongOrg();
        String other$belongOrg = other.getBelongOrg();
        if (this$belongOrg == null ? other$belongOrg != null : !this$belongOrg.equals(other$belongOrg)) {
            return false;
        }
        String this$searchCode = this.getSearchCode();
        String other$searchCode = other.getSearchCode();
        if (this$searchCode == null ? other$searchCode != null : !this$searchCode.equals(other$searchCode)) {
            return false;
        }
        String this$specialManagementDep = this.getSpecialManagementDep();
        String other$specialManagementDep = other.getSpecialManagementDep();
        if (this$specialManagementDep == null ? other$specialManagementDep != null : !this$specialManagementDep.equals(other$specialManagementDep)) {
            return false;
        }
        String this$professSalesman = this.getProfessSalesman();
        String other$professSalesman = other.getProfessSalesman();
        if (this$professSalesman == null ? other$professSalesman != null : !this$professSalesman.equals(other$professSalesman)) {
            return false;
        }
        String this$transactionCurrency = this.getTransactionCurrency();
        String other$transactionCurrency = other.getTransactionCurrency();
        if (this$transactionCurrency == null ? other$transactionCurrency != null : !this$transactionCurrency.equals(other$transactionCurrency)) {
            return false;
        }
        String this$taxRate = this.getTaxRate();
        String other$taxRate = other.getTaxRate();
        if (this$taxRate == null ? other$taxRate != null : !this$taxRate.equals(other$taxRate)) {
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
        String this$exchangeRateType = this.getExchangeRateType();
        String other$exchangeRateType = other.getExchangeRateType();
        if (this$exchangeRateType == null ? other$exchangeRateType != null : !this$exchangeRateType.equals(other$exchangeRateType)) {
            return false;
        }
        String this$frozenState = this.getFrozenState();
        String other$frozenState = other.getFrozenState();
        if (this$frozenState == null ? other$frozenState != null : !this$frozenState.equals(other$frozenState)) {
            return false;
        }
        String this$freezingLink = this.getFreezingLink();
        String other$freezingLink = other.getFreezingLink();
        if (this$freezingLink == null ? other$freezingLink != null : !this$freezingLink.equals(other$freezingLink)) {
            return false;
        }
        String this$orgDefaultAddress = this.getOrgDefaultAddress();
        String other$orgDefaultAddress = other.getOrgDefaultAddress();
        if (this$orgDefaultAddress == null ? other$orgDefaultAddress != null : !this$orgDefaultAddress.equals(other$orgDefaultAddress)) {
            return false;
        }
        String this$businessRole = this.getBusinessRole();
        String other$businessRole = other.getBusinessRole();
        return !(this$businessRole == null ? other$businessRole != null : !this$businessRole.equals(other$businessRole));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantApplyRangeDetailDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Long $deliveryWarehouse = this.getDeliveryWarehouse();
        result = result * 59 + ($deliveryWarehouse == null ? 43 : ((Object)$deliveryWarehouse).hashCode());
        Integer $creditServiceDay = this.getCreditServiceDay();
        result = result * 59 + ($creditServiceDay == null ? 43 : ((Object)$creditServiceDay).hashCode());
        Long $collectionAgreement = this.getCollectionAgreement();
        result = result * 59 + ($collectionAgreement == null ? 43 : ((Object)$collectionAgreement).hashCode());
        Long $settlementMethod = this.getSettlementMethod();
        result = result * 59 + ($settlementMethod == null ? 43 : ((Object)$settlementMethod).hashCode());
        Long $shipmentMethod = this.getShipmentMethod();
        result = result * 59 + ($shipmentMethod == null ? 43 : ((Object)$shipmentMethod).hashCode());
        Boolean $signBack = this.getSignBack();
        result = result * 59 + ($signBack == null ? 43 : ((Object)$signBack).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Long $customerArea = this.getCustomerArea();
        result = result * 59 + ($customerArea == null ? 43 : ((Object)$customerArea).hashCode());
        Long $customerLevel = this.getCustomerLevel();
        result = result * 59 + ($customerLevel == null ? 43 : ((Object)$customerLevel).hashCode());
        Integer $payWay = this.getPayWay();
        result = result * 59 + ($payWay == null ? 43 : ((Object)$payWay).hashCode());
        Long $customerType = this.getCustomerType();
        result = result * 59 + ($customerType == null ? 43 : ((Object)$customerType).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $belongOrg = this.getBelongOrg();
        result = result * 59 + ($belongOrg == null ? 43 : $belongOrg.hashCode());
        String $searchCode = this.getSearchCode();
        result = result * 59 + ($searchCode == null ? 43 : $searchCode.hashCode());
        String $specialManagementDep = this.getSpecialManagementDep();
        result = result * 59 + ($specialManagementDep == null ? 43 : $specialManagementDep.hashCode());
        String $professSalesman = this.getProfessSalesman();
        result = result * 59 + ($professSalesman == null ? 43 : $professSalesman.hashCode());
        String $transactionCurrency = this.getTransactionCurrency();
        result = result * 59 + ($transactionCurrency == null ? 43 : $transactionCurrency.hashCode());
        String $taxRate = this.getTaxRate();
        result = result * 59 + ($taxRate == null ? 43 : $taxRate.hashCode());
        String $settlementMethodName = this.getSettlementMethodName();
        result = result * 59 + ($settlementMethodName == null ? 43 : $settlementMethodName.hashCode());
        String $shipmentMethodName = this.getShipmentMethodName();
        result = result * 59 + ($shipmentMethodName == null ? 43 : $shipmentMethodName.hashCode());
        String $exchangeRateType = this.getExchangeRateType();
        result = result * 59 + ($exchangeRateType == null ? 43 : $exchangeRateType.hashCode());
        String $frozenState = this.getFrozenState();
        result = result * 59 + ($frozenState == null ? 43 : $frozenState.hashCode());
        String $freezingLink = this.getFreezingLink();
        result = result * 59 + ($freezingLink == null ? 43 : $freezingLink.hashCode());
        String $orgDefaultAddress = this.getOrgDefaultAddress();
        result = result * 59 + ($orgDefaultAddress == null ? 43 : $orgDefaultAddress.hashCode());
        String $businessRole = this.getBusinessRole();
        result = result * 59 + ($businessRole == null ? 43 : $businessRole.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantApplyRangeDetailDTO(id=" + this.getId() + ", merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", orgId=" + this.getOrgId() + ", belongOrg=" + this.getBelongOrg() + ", searchCode=" + this.getSearchCode() + ", specialManagementDep=" + this.getSpecialManagementDep() + ", professSalesman=" + this.getProfessSalesman() + ", transactionCurrency=" + this.getTransactionCurrency() + ", taxRate=" + this.getTaxRate() + ", deliveryWarehouse=" + this.getDeliveryWarehouse() + ", creditServiceDay=" + this.getCreditServiceDay() + ", collectionAgreement=" + this.getCollectionAgreement() + ", settlementMethod=" + this.getSettlementMethod() + ", settlementMethodName=" + this.getSettlementMethodName() + ", shipmentMethod=" + this.getShipmentMethod() + ", shipmentMethodName=" + this.getShipmentMethodName() + ", signBack=" + this.getSignBack() + ", stopStatus=" + this.getStopStatus() + ", customerArea=" + this.getCustomerArea() + ", customerLevel=" + this.getCustomerLevel() + ", exchangeRateType=" + this.getExchangeRateType() + ", payWay=" + this.getPayWay() + ", customerType=" + this.getCustomerType() + ", frozenState=" + this.getFrozenState() + ", freezingLink=" + this.getFreezingLink() + ", orgDefaultAddress=" + this.getOrgDefaultAddress() + ", businessRole=" + this.getBusinessRole() + ")";
    }
}

