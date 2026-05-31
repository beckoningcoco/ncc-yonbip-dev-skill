/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyoucloud.iuap.upc.dto.MerchantBaseDTO;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantDTO
extends MerchantBaseDTO
implements Serializable {
    public String rangesOrgId;
    public String shopId;
    public Integer rangeType;
    public Long merchantApplyRangeId;
    public String searchCode;
    public Integer stopStatus;
    public Date createTime;
    private Long customerLevel;
    private Long customerType;
    private String customerTypeName;
    private String transactionCurrency;
    private String taxRate;
    private Long deliveryWarehouse;
    private Long settlementMethod;
    private String settlementMethod___code;
    private MultiLangText settlementMethod___name;
    private Integer creditServiceDay;
    private Long collectionAgreement;
    private Integer payWay;
    private Long shipmentMethod;
    private String shipmentMethod___code;
    private MultiLangText shipmentMethod___name;
    private String exchangeratetype;
    private String exchangeratetype___code;
    private MultiLangText exchangeratetype___name;
    private String specialManagementDep;
    private String specialManagementDepName;
    private MultiLangText specialManagementDepName_multilang;
    private String professSalesmanId;
    private String professSalesmanEmail;
    private String professSalesmanName;
    private MultiLangText professSalesmanName_multilang;
    private String professSalesmanMobile;
    private String professSalesmanUserId;
    private Boolean detailStopStatus;
    private Long addressInfoId;
    private Long addressId;
    private String addressCode;
    private String receiver;
    private String addressInfoCountry;
    private String addressInfoProvince;
    private String addressInfoCity;
    private String addressInfoArea;
    private String addressInfoRegion;
    private String addressInfoRegionCode;
    private String addressInfoAddress;
    private String addressInfoInputAddress;
    private String addressInfoLongitude;
    private String addressInfoLatitude;
    private String addressInfoMobile;
    private String addressInfoTelephone;
    private String addressInfoZipCode;
    private Boolean addressInfoDefault;
    private String shippingAddressErpCode;
    private String deliveryAddressErpCode;
    private String addressInfoEmail;
    private String addressInfoQQ;
    private String addressInfoWeChat;
    private String addressInfoRemarks;
    private String mergerName;
    private Long receivingWarehouse;
    private Long shipRegion;
    private Long detailSaleAreaId;
    private String detailSaleAreaCode;
    private String detailSaleAreaName;
    private String detailSaleAreaPath;
    private Long agentLevelId;
    private String agentLevelCode;
    private String agentLevelName;
    private Long contacterId;
    private String contacterFullName;
    private String contacterMobile;
    private String contacterAreaCodeMobile;
    private Boolean contacterDefault;
    private Integer agentInvoiceBillingType;
    private String agentInvoiceBdBillingType;
    private String agentInvoiceTitle;
    private String agentInvoiceTaxNo;
    private String agentInvoiceTelephone;
    private String agentInvoiceName;
    private String agentInvoiceBankName;
    private String agentInvoiceBankAccount;
    private String agentInvoiceAddress;
    private Boolean agentInvoiceDefaultInvoice;
    private String agentInvoiceRemarks;
    private String agentInvoiceReceiveInvoiceMobile;
    private String agentInvoiceReceiveInvoiceEmail;
    private Integer maxChannelLevel;
    private Integer miniChannelLevel;
    private HashMap<String, Object> merchantCharacter;
    private HashMap<String, Object> merchantDetailCharacter;
    private Long collectionAgreementId;
    private String collectionAgreementCode;
    private String collectionAgreementName;
    private Integer frozenState;
    private String freezeLink;
    private String tradeCustomers;
    private Integer priceMarking;
    private String potential;
    private String isFinancialSynergy;

    public String getRangesOrgId() {
        return this.rangesOrgId;
    }

    public String getShopId() {
        return this.shopId;
    }

    public Integer getRangeType() {
        return this.rangeType;
    }

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public String getSearchCode() {
        return this.searchCode;
    }

    public Integer getStopStatus() {
        return this.stopStatus;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Long getCustomerLevel() {
        return this.customerLevel;
    }

    public Long getCustomerType() {
        return this.customerType;
    }

    public String getCustomerTypeName() {
        return this.customerTypeName;
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

    public Long getSettlementMethod() {
        return this.settlementMethod;
    }

    public String getSettlementMethod___code() {
        return this.settlementMethod___code;
    }

    public MultiLangText getSettlementMethod___name() {
        return this.settlementMethod___name;
    }

    public Integer getCreditServiceDay() {
        return this.creditServiceDay;
    }

    public Long getCollectionAgreement() {
        return this.collectionAgreement;
    }

    public Integer getPayWay() {
        return this.payWay;
    }

    public Long getShipmentMethod() {
        return this.shipmentMethod;
    }

    public String getShipmentMethod___code() {
        return this.shipmentMethod___code;
    }

    public MultiLangText getShipmentMethod___name() {
        return this.shipmentMethod___name;
    }

    public String getExchangeratetype() {
        return this.exchangeratetype;
    }

    public String getExchangeratetype___code() {
        return this.exchangeratetype___code;
    }

    public MultiLangText getExchangeratetype___name() {
        return this.exchangeratetype___name;
    }

    public String getSpecialManagementDep() {
        return this.specialManagementDep;
    }

    public String getSpecialManagementDepName() {
        return this.specialManagementDepName;
    }

    public MultiLangText getSpecialManagementDepName_multilang() {
        return this.specialManagementDepName_multilang;
    }

    public String getProfessSalesmanId() {
        return this.professSalesmanId;
    }

    public String getProfessSalesmanEmail() {
        return this.professSalesmanEmail;
    }

    public String getProfessSalesmanName() {
        return this.professSalesmanName;
    }

    public MultiLangText getProfessSalesmanName_multilang() {
        return this.professSalesmanName_multilang;
    }

    public String getProfessSalesmanMobile() {
        return this.professSalesmanMobile;
    }

    public String getProfessSalesmanUserId() {
        return this.professSalesmanUserId;
    }

    public Boolean getDetailStopStatus() {
        return this.detailStopStatus;
    }

    public Long getAddressInfoId() {
        return this.addressInfoId;
    }

    public Long getAddressId() {
        return this.addressId;
    }

    public String getAddressCode() {
        return this.addressCode;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public String getAddressInfoCountry() {
        return this.addressInfoCountry;
    }

    public String getAddressInfoProvince() {
        return this.addressInfoProvince;
    }

    public String getAddressInfoCity() {
        return this.addressInfoCity;
    }

    public String getAddressInfoArea() {
        return this.addressInfoArea;
    }

    public String getAddressInfoRegion() {
        return this.addressInfoRegion;
    }

    public String getAddressInfoRegionCode() {
        return this.addressInfoRegionCode;
    }

    public String getAddressInfoAddress() {
        return this.addressInfoAddress;
    }

    public String getAddressInfoInputAddress() {
        return this.addressInfoInputAddress;
    }

    public String getAddressInfoLongitude() {
        return this.addressInfoLongitude;
    }

    public String getAddressInfoLatitude() {
        return this.addressInfoLatitude;
    }

    public String getAddressInfoMobile() {
        return this.addressInfoMobile;
    }

    public String getAddressInfoTelephone() {
        return this.addressInfoTelephone;
    }

    public String getAddressInfoZipCode() {
        return this.addressInfoZipCode;
    }

    public Boolean getAddressInfoDefault() {
        return this.addressInfoDefault;
    }

    public String getShippingAddressErpCode() {
        return this.shippingAddressErpCode;
    }

    public String getDeliveryAddressErpCode() {
        return this.deliveryAddressErpCode;
    }

    public String getAddressInfoEmail() {
        return this.addressInfoEmail;
    }

    public String getAddressInfoQQ() {
        return this.addressInfoQQ;
    }

    public String getAddressInfoWeChat() {
        return this.addressInfoWeChat;
    }

    public String getAddressInfoRemarks() {
        return this.addressInfoRemarks;
    }

    public String getMergerName() {
        return this.mergerName;
    }

    public Long getReceivingWarehouse() {
        return this.receivingWarehouse;
    }

    public Long getShipRegion() {
        return this.shipRegion;
    }

    public Long getDetailSaleAreaId() {
        return this.detailSaleAreaId;
    }

    public String getDetailSaleAreaCode() {
        return this.detailSaleAreaCode;
    }

    public String getDetailSaleAreaName() {
        return this.detailSaleAreaName;
    }

    public String getDetailSaleAreaPath() {
        return this.detailSaleAreaPath;
    }

    public Long getAgentLevelId() {
        return this.agentLevelId;
    }

    public String getAgentLevelCode() {
        return this.agentLevelCode;
    }

    public String getAgentLevelName() {
        return this.agentLevelName;
    }

    public Long getContacterId() {
        return this.contacterId;
    }

    public String getContacterFullName() {
        return this.contacterFullName;
    }

    public String getContacterMobile() {
        return this.contacterMobile;
    }

    public String getContacterAreaCodeMobile() {
        return this.contacterAreaCodeMobile;
    }

    public Boolean getContacterDefault() {
        return this.contacterDefault;
    }

    public Integer getAgentInvoiceBillingType() {
        return this.agentInvoiceBillingType;
    }

    public String getAgentInvoiceBdBillingType() {
        return this.agentInvoiceBdBillingType;
    }

    public String getAgentInvoiceTitle() {
        return this.agentInvoiceTitle;
    }

    public String getAgentInvoiceTaxNo() {
        return this.agentInvoiceTaxNo;
    }

    public String getAgentInvoiceTelephone() {
        return this.agentInvoiceTelephone;
    }

    public String getAgentInvoiceName() {
        return this.agentInvoiceName;
    }

    public String getAgentInvoiceBankName() {
        return this.agentInvoiceBankName;
    }

    public String getAgentInvoiceBankAccount() {
        return this.agentInvoiceBankAccount;
    }

    public String getAgentInvoiceAddress() {
        return this.agentInvoiceAddress;
    }

    public Boolean getAgentInvoiceDefaultInvoice() {
        return this.agentInvoiceDefaultInvoice;
    }

    public String getAgentInvoiceRemarks() {
        return this.agentInvoiceRemarks;
    }

    public String getAgentInvoiceReceiveInvoiceMobile() {
        return this.agentInvoiceReceiveInvoiceMobile;
    }

    public String getAgentInvoiceReceiveInvoiceEmail() {
        return this.agentInvoiceReceiveInvoiceEmail;
    }

    public Integer getMaxChannelLevel() {
        return this.maxChannelLevel;
    }

    public Integer getMiniChannelLevel() {
        return this.miniChannelLevel;
    }

    public HashMap<String, Object> getMerchantCharacter() {
        return this.merchantCharacter;
    }

    public HashMap<String, Object> getMerchantDetailCharacter() {
        return this.merchantDetailCharacter;
    }

    public Long getCollectionAgreementId() {
        return this.collectionAgreementId;
    }

    public String getCollectionAgreementCode() {
        return this.collectionAgreementCode;
    }

    public String getCollectionAgreementName() {
        return this.collectionAgreementName;
    }

    public Integer getFrozenState() {
        return this.frozenState;
    }

    public String getFreezeLink() {
        return this.freezeLink;
    }

    public String getTradeCustomers() {
        return this.tradeCustomers;
    }

    public Integer getPriceMarking() {
        return this.priceMarking;
    }

    public String getPotential() {
        return this.potential;
    }

    public String getIsFinancialSynergy() {
        return this.isFinancialSynergy;
    }

    public void setRangesOrgId(String rangesOrgId) {
        this.rangesOrgId = rangesOrgId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public void setRangeType(Integer rangeType) {
        this.rangeType = rangeType;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode;
    }

    public void setStopStatus(Integer stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setCustomerLevel(Long customerLevel) {
        this.customerLevel = customerLevel;
    }

    public void setCustomerType(Long customerType) {
        this.customerType = customerType;
    }

    public void setCustomerTypeName(String customerTypeName) {
        this.customerTypeName = customerTypeName;
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

    public void setSettlementMethod(Long settlementMethod) {
        this.settlementMethod = settlementMethod;
    }

    public void setSettlementMethod___code(String settlementMethod___code) {
        this.settlementMethod___code = settlementMethod___code;
    }

    public void setSettlementMethod___name(MultiLangText settlementMethod___name) {
        this.settlementMethod___name = settlementMethod___name;
    }

    public void setCreditServiceDay(Integer creditServiceDay) {
        this.creditServiceDay = creditServiceDay;
    }

    public void setCollectionAgreement(Long collectionAgreement) {
        this.collectionAgreement = collectionAgreement;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    public void setShipmentMethod(Long shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    public void setShipmentMethod___code(String shipmentMethod___code) {
        this.shipmentMethod___code = shipmentMethod___code;
    }

    public void setShipmentMethod___name(MultiLangText shipmentMethod___name) {
        this.shipmentMethod___name = shipmentMethod___name;
    }

    public void setExchangeratetype(String exchangeratetype) {
        this.exchangeratetype = exchangeratetype;
    }

    public void setExchangeratetype___code(String exchangeratetype___code) {
        this.exchangeratetype___code = exchangeratetype___code;
    }

    public void setExchangeratetype___name(MultiLangText exchangeratetype___name) {
        this.exchangeratetype___name = exchangeratetype___name;
    }

    public void setSpecialManagementDep(String specialManagementDep) {
        this.specialManagementDep = specialManagementDep;
    }

    public void setSpecialManagementDepName(String specialManagementDepName) {
        this.specialManagementDepName = specialManagementDepName;
    }

    public void setSpecialManagementDepName_multilang(MultiLangText specialManagementDepName_multilang) {
        this.specialManagementDepName_multilang = specialManagementDepName_multilang;
    }

    public void setProfessSalesmanId(String professSalesmanId) {
        this.professSalesmanId = professSalesmanId;
    }

    public void setProfessSalesmanEmail(String professSalesmanEmail) {
        this.professSalesmanEmail = professSalesmanEmail;
    }

    public void setProfessSalesmanName(String professSalesmanName) {
        this.professSalesmanName = professSalesmanName;
    }

    public void setProfessSalesmanName_multilang(MultiLangText professSalesmanName_multilang) {
        this.professSalesmanName_multilang = professSalesmanName_multilang;
    }

    public void setProfessSalesmanMobile(String professSalesmanMobile) {
        this.professSalesmanMobile = professSalesmanMobile;
    }

    public void setProfessSalesmanUserId(String professSalesmanUserId) {
        this.professSalesmanUserId = professSalesmanUserId;
    }

    public void setDetailStopStatus(Boolean detailStopStatus) {
        this.detailStopStatus = detailStopStatus;
    }

    public void setAddressInfoId(Long addressInfoId) {
        this.addressInfoId = addressInfoId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public void setAddressInfoCountry(String addressInfoCountry) {
        this.addressInfoCountry = addressInfoCountry;
    }

    public void setAddressInfoProvince(String addressInfoProvince) {
        this.addressInfoProvince = addressInfoProvince;
    }

    public void setAddressInfoCity(String addressInfoCity) {
        this.addressInfoCity = addressInfoCity;
    }

    public void setAddressInfoArea(String addressInfoArea) {
        this.addressInfoArea = addressInfoArea;
    }

    public void setAddressInfoRegion(String addressInfoRegion) {
        this.addressInfoRegion = addressInfoRegion;
    }

    public void setAddressInfoRegionCode(String addressInfoRegionCode) {
        this.addressInfoRegionCode = addressInfoRegionCode;
    }

    public void setAddressInfoAddress(String addressInfoAddress) {
        this.addressInfoAddress = addressInfoAddress;
    }

    public void setAddressInfoInputAddress(String addressInfoInputAddress) {
        this.addressInfoInputAddress = addressInfoInputAddress;
    }

    public void setAddressInfoLongitude(String addressInfoLongitude) {
        this.addressInfoLongitude = addressInfoLongitude;
    }

    public void setAddressInfoLatitude(String addressInfoLatitude) {
        this.addressInfoLatitude = addressInfoLatitude;
    }

    public void setAddressInfoMobile(String addressInfoMobile) {
        this.addressInfoMobile = addressInfoMobile;
    }

    public void setAddressInfoTelephone(String addressInfoTelephone) {
        this.addressInfoTelephone = addressInfoTelephone;
    }

    public void setAddressInfoZipCode(String addressInfoZipCode) {
        this.addressInfoZipCode = addressInfoZipCode;
    }

    public void setAddressInfoDefault(Boolean addressInfoDefault) {
        this.addressInfoDefault = addressInfoDefault;
    }

    public void setShippingAddressErpCode(String shippingAddressErpCode) {
        this.shippingAddressErpCode = shippingAddressErpCode;
    }

    public void setDeliveryAddressErpCode(String deliveryAddressErpCode) {
        this.deliveryAddressErpCode = deliveryAddressErpCode;
    }

    public void setAddressInfoEmail(String addressInfoEmail) {
        this.addressInfoEmail = addressInfoEmail;
    }

    public void setAddressInfoQQ(String addressInfoQQ) {
        this.addressInfoQQ = addressInfoQQ;
    }

    public void setAddressInfoWeChat(String addressInfoWeChat) {
        this.addressInfoWeChat = addressInfoWeChat;
    }

    public void setAddressInfoRemarks(String addressInfoRemarks) {
        this.addressInfoRemarks = addressInfoRemarks;
    }

    public void setMergerName(String mergerName) {
        this.mergerName = mergerName;
    }

    public void setReceivingWarehouse(Long receivingWarehouse) {
        this.receivingWarehouse = receivingWarehouse;
    }

    public void setShipRegion(Long shipRegion) {
        this.shipRegion = shipRegion;
    }

    public void setDetailSaleAreaId(Long detailSaleAreaId) {
        this.detailSaleAreaId = detailSaleAreaId;
    }

    public void setDetailSaleAreaCode(String detailSaleAreaCode) {
        this.detailSaleAreaCode = detailSaleAreaCode;
    }

    public void setDetailSaleAreaName(String detailSaleAreaName) {
        this.detailSaleAreaName = detailSaleAreaName;
    }

    public void setDetailSaleAreaPath(String detailSaleAreaPath) {
        this.detailSaleAreaPath = detailSaleAreaPath;
    }

    public void setAgentLevelId(Long agentLevelId) {
        this.agentLevelId = agentLevelId;
    }

    public void setAgentLevelCode(String agentLevelCode) {
        this.agentLevelCode = agentLevelCode;
    }

    public void setAgentLevelName(String agentLevelName) {
        this.agentLevelName = agentLevelName;
    }

    public void setContacterId(Long contacterId) {
        this.contacterId = contacterId;
    }

    public void setContacterFullName(String contacterFullName) {
        this.contacterFullName = contacterFullName;
    }

    public void setContacterMobile(String contacterMobile) {
        this.contacterMobile = contacterMobile;
    }

    public void setContacterAreaCodeMobile(String contacterAreaCodeMobile) {
        this.contacterAreaCodeMobile = contacterAreaCodeMobile;
    }

    public void setContacterDefault(Boolean contacterDefault) {
        this.contacterDefault = contacterDefault;
    }

    public void setAgentInvoiceBillingType(Integer agentInvoiceBillingType) {
        this.agentInvoiceBillingType = agentInvoiceBillingType;
    }

    public void setAgentInvoiceBdBillingType(String agentInvoiceBdBillingType) {
        this.agentInvoiceBdBillingType = agentInvoiceBdBillingType;
    }

    public void setAgentInvoiceTitle(String agentInvoiceTitle) {
        this.agentInvoiceTitle = agentInvoiceTitle;
    }

    public void setAgentInvoiceTaxNo(String agentInvoiceTaxNo) {
        this.agentInvoiceTaxNo = agentInvoiceTaxNo;
    }

    public void setAgentInvoiceTelephone(String agentInvoiceTelephone) {
        this.agentInvoiceTelephone = agentInvoiceTelephone;
    }

    public void setAgentInvoiceName(String agentInvoiceName) {
        this.agentInvoiceName = agentInvoiceName;
    }

    public void setAgentInvoiceBankName(String agentInvoiceBankName) {
        this.agentInvoiceBankName = agentInvoiceBankName;
    }

    public void setAgentInvoiceBankAccount(String agentInvoiceBankAccount) {
        this.agentInvoiceBankAccount = agentInvoiceBankAccount;
    }

    public void setAgentInvoiceAddress(String agentInvoiceAddress) {
        this.agentInvoiceAddress = agentInvoiceAddress;
    }

    public void setAgentInvoiceDefaultInvoice(Boolean agentInvoiceDefaultInvoice) {
        this.agentInvoiceDefaultInvoice = agentInvoiceDefaultInvoice;
    }

    public void setAgentInvoiceRemarks(String agentInvoiceRemarks) {
        this.agentInvoiceRemarks = agentInvoiceRemarks;
    }

    public void setAgentInvoiceReceiveInvoiceMobile(String agentInvoiceReceiveInvoiceMobile) {
        this.agentInvoiceReceiveInvoiceMobile = agentInvoiceReceiveInvoiceMobile;
    }

    public void setAgentInvoiceReceiveInvoiceEmail(String agentInvoiceReceiveInvoiceEmail) {
        this.agentInvoiceReceiveInvoiceEmail = agentInvoiceReceiveInvoiceEmail;
    }

    public void setMaxChannelLevel(Integer maxChannelLevel) {
        this.maxChannelLevel = maxChannelLevel;
    }

    public void setMiniChannelLevel(Integer miniChannelLevel) {
        this.miniChannelLevel = miniChannelLevel;
    }

    public void setMerchantCharacter(HashMap<String, Object> merchantCharacter) {
        this.merchantCharacter = merchantCharacter;
    }

    public void setMerchantDetailCharacter(HashMap<String, Object> merchantDetailCharacter) {
        this.merchantDetailCharacter = merchantDetailCharacter;
    }

    public void setCollectionAgreementId(Long collectionAgreementId) {
        this.collectionAgreementId = collectionAgreementId;
    }

    public void setCollectionAgreementCode(String collectionAgreementCode) {
        this.collectionAgreementCode = collectionAgreementCode;
    }

    public void setCollectionAgreementName(String collectionAgreementName) {
        this.collectionAgreementName = collectionAgreementName;
    }

    public void setFrozenState(Integer frozenState) {
        this.frozenState = frozenState;
    }

    public void setFreezeLink(String freezeLink) {
        this.freezeLink = freezeLink;
    }

    public void setTradeCustomers(String tradeCustomers) {
        this.tradeCustomers = tradeCustomers;
    }

    public void setPriceMarking(Integer priceMarking) {
        this.priceMarking = priceMarking;
    }

    public void setPotential(String potential) {
        this.potential = potential;
    }

    public void setIsFinancialSynergy(String isFinancialSynergy) {
        this.isFinancialSynergy = isFinancialSynergy;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantDTO)) {
            return false;
        }
        MerchantDTO other = (MerchantDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$rangeType = this.getRangeType();
        Integer other$rangeType = other.getRangeType();
        if (this$rangeType == null ? other$rangeType != null : !((Object)this$rangeType).equals(other$rangeType)) {
            return false;
        }
        Long this$merchantApplyRangeId = this.getMerchantApplyRangeId();
        Long other$merchantApplyRangeId = other.getMerchantApplyRangeId();
        if (this$merchantApplyRangeId == null ? other$merchantApplyRangeId != null : !((Object)this$merchantApplyRangeId).equals(other$merchantApplyRangeId)) {
            return false;
        }
        Integer this$stopStatus = this.getStopStatus();
        Integer other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Long this$customerLevel = this.getCustomerLevel();
        Long other$customerLevel = other.getCustomerLevel();
        if (this$customerLevel == null ? other$customerLevel != null : !((Object)this$customerLevel).equals(other$customerLevel)) {
            return false;
        }
        Long this$customerType = this.getCustomerType();
        Long other$customerType = other.getCustomerType();
        if (this$customerType == null ? other$customerType != null : !((Object)this$customerType).equals(other$customerType)) {
            return false;
        }
        Long this$deliveryWarehouse = this.getDeliveryWarehouse();
        Long other$deliveryWarehouse = other.getDeliveryWarehouse();
        if (this$deliveryWarehouse == null ? other$deliveryWarehouse != null : !((Object)this$deliveryWarehouse).equals(other$deliveryWarehouse)) {
            return false;
        }
        Long this$settlementMethod = this.getSettlementMethod();
        Long other$settlementMethod = other.getSettlementMethod();
        if (this$settlementMethod == null ? other$settlementMethod != null : !((Object)this$settlementMethod).equals(other$settlementMethod)) {
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
        Integer this$payWay = this.getPayWay();
        Integer other$payWay = other.getPayWay();
        if (this$payWay == null ? other$payWay != null : !((Object)this$payWay).equals(other$payWay)) {
            return false;
        }
        Long this$shipmentMethod = this.getShipmentMethod();
        Long other$shipmentMethod = other.getShipmentMethod();
        if (this$shipmentMethod == null ? other$shipmentMethod != null : !((Object)this$shipmentMethod).equals(other$shipmentMethod)) {
            return false;
        }
        Boolean this$detailStopStatus = this.getDetailStopStatus();
        Boolean other$detailStopStatus = other.getDetailStopStatus();
        if (this$detailStopStatus == null ? other$detailStopStatus != null : !((Object)this$detailStopStatus).equals(other$detailStopStatus)) {
            return false;
        }
        Long this$addressInfoId = this.getAddressInfoId();
        Long other$addressInfoId = other.getAddressInfoId();
        if (this$addressInfoId == null ? other$addressInfoId != null : !((Object)this$addressInfoId).equals(other$addressInfoId)) {
            return false;
        }
        Long this$addressId = this.getAddressId();
        Long other$addressId = other.getAddressId();
        if (this$addressId == null ? other$addressId != null : !((Object)this$addressId).equals(other$addressId)) {
            return false;
        }
        Boolean this$addressInfoDefault = this.getAddressInfoDefault();
        Boolean other$addressInfoDefault = other.getAddressInfoDefault();
        if (this$addressInfoDefault == null ? other$addressInfoDefault != null : !((Object)this$addressInfoDefault).equals(other$addressInfoDefault)) {
            return false;
        }
        Long this$receivingWarehouse = this.getReceivingWarehouse();
        Long other$receivingWarehouse = other.getReceivingWarehouse();
        if (this$receivingWarehouse == null ? other$receivingWarehouse != null : !((Object)this$receivingWarehouse).equals(other$receivingWarehouse)) {
            return false;
        }
        Long this$shipRegion = this.getShipRegion();
        Long other$shipRegion = other.getShipRegion();
        if (this$shipRegion == null ? other$shipRegion != null : !((Object)this$shipRegion).equals(other$shipRegion)) {
            return false;
        }
        Long this$detailSaleAreaId = this.getDetailSaleAreaId();
        Long other$detailSaleAreaId = other.getDetailSaleAreaId();
        if (this$detailSaleAreaId == null ? other$detailSaleAreaId != null : !((Object)this$detailSaleAreaId).equals(other$detailSaleAreaId)) {
            return false;
        }
        Long this$agentLevelId = this.getAgentLevelId();
        Long other$agentLevelId = other.getAgentLevelId();
        if (this$agentLevelId == null ? other$agentLevelId != null : !((Object)this$agentLevelId).equals(other$agentLevelId)) {
            return false;
        }
        Long this$contacterId = this.getContacterId();
        Long other$contacterId = other.getContacterId();
        if (this$contacterId == null ? other$contacterId != null : !((Object)this$contacterId).equals(other$contacterId)) {
            return false;
        }
        Boolean this$contacterDefault = this.getContacterDefault();
        Boolean other$contacterDefault = other.getContacterDefault();
        if (this$contacterDefault == null ? other$contacterDefault != null : !((Object)this$contacterDefault).equals(other$contacterDefault)) {
            return false;
        }
        Integer this$agentInvoiceBillingType = this.getAgentInvoiceBillingType();
        Integer other$agentInvoiceBillingType = other.getAgentInvoiceBillingType();
        if (this$agentInvoiceBillingType == null ? other$agentInvoiceBillingType != null : !((Object)this$agentInvoiceBillingType).equals(other$agentInvoiceBillingType)) {
            return false;
        }
        Boolean this$agentInvoiceDefaultInvoice = this.getAgentInvoiceDefaultInvoice();
        Boolean other$agentInvoiceDefaultInvoice = other.getAgentInvoiceDefaultInvoice();
        if (this$agentInvoiceDefaultInvoice == null ? other$agentInvoiceDefaultInvoice != null : !((Object)this$agentInvoiceDefaultInvoice).equals(other$agentInvoiceDefaultInvoice)) {
            return false;
        }
        Integer this$maxChannelLevel = this.getMaxChannelLevel();
        Integer other$maxChannelLevel = other.getMaxChannelLevel();
        if (this$maxChannelLevel == null ? other$maxChannelLevel != null : !((Object)this$maxChannelLevel).equals(other$maxChannelLevel)) {
            return false;
        }
        Integer this$miniChannelLevel = this.getMiniChannelLevel();
        Integer other$miniChannelLevel = other.getMiniChannelLevel();
        if (this$miniChannelLevel == null ? other$miniChannelLevel != null : !((Object)this$miniChannelLevel).equals(other$miniChannelLevel)) {
            return false;
        }
        Long this$collectionAgreementId = this.getCollectionAgreementId();
        Long other$collectionAgreementId = other.getCollectionAgreementId();
        if (this$collectionAgreementId == null ? other$collectionAgreementId != null : !((Object)this$collectionAgreementId).equals(other$collectionAgreementId)) {
            return false;
        }
        Integer this$frozenState = this.getFrozenState();
        Integer other$frozenState = other.getFrozenState();
        if (this$frozenState == null ? other$frozenState != null : !((Object)this$frozenState).equals(other$frozenState)) {
            return false;
        }
        Integer this$priceMarking = this.getPriceMarking();
        Integer other$priceMarking = other.getPriceMarking();
        if (this$priceMarking == null ? other$priceMarking != null : !((Object)this$priceMarking).equals(other$priceMarking)) {
            return false;
        }
        String this$rangesOrgId = this.getRangesOrgId();
        String other$rangesOrgId = other.getRangesOrgId();
        if (this$rangesOrgId == null ? other$rangesOrgId != null : !this$rangesOrgId.equals(other$rangesOrgId)) {
            return false;
        }
        String this$shopId = this.getShopId();
        String other$shopId = other.getShopId();
        if (this$shopId == null ? other$shopId != null : !this$shopId.equals(other$shopId)) {
            return false;
        }
        String this$searchCode = this.getSearchCode();
        String other$searchCode = other.getSearchCode();
        if (this$searchCode == null ? other$searchCode != null : !this$searchCode.equals(other$searchCode)) {
            return false;
        }
        Date this$createTime = this.getCreateTime();
        Date other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !((Object)this$createTime).equals(other$createTime)) {
            return false;
        }
        String this$customerTypeName = this.getCustomerTypeName();
        String other$customerTypeName = other.getCustomerTypeName();
        if (this$customerTypeName == null ? other$customerTypeName != null : !this$customerTypeName.equals(other$customerTypeName)) {
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
        String this$settlementMethod___code = this.getSettlementMethod___code();
        String other$settlementMethod___code = other.getSettlementMethod___code();
        if (this$settlementMethod___code == null ? other$settlementMethod___code != null : !this$settlementMethod___code.equals(other$settlementMethod___code)) {
            return false;
        }
        MultiLangText this$settlementMethod___name = this.getSettlementMethod___name();
        MultiLangText other$settlementMethod___name = other.getSettlementMethod___name();
        if (this$settlementMethod___name == null ? other$settlementMethod___name != null : !this$settlementMethod___name.equals(other$settlementMethod___name)) {
            return false;
        }
        String this$shipmentMethod___code = this.getShipmentMethod___code();
        String other$shipmentMethod___code = other.getShipmentMethod___code();
        if (this$shipmentMethod___code == null ? other$shipmentMethod___code != null : !this$shipmentMethod___code.equals(other$shipmentMethod___code)) {
            return false;
        }
        MultiLangText this$shipmentMethod___name = this.getShipmentMethod___name();
        MultiLangText other$shipmentMethod___name = other.getShipmentMethod___name();
        if (this$shipmentMethod___name == null ? other$shipmentMethod___name != null : !this$shipmentMethod___name.equals(other$shipmentMethod___name)) {
            return false;
        }
        String this$exchangeratetype = this.getExchangeratetype();
        String other$exchangeratetype = other.getExchangeratetype();
        if (this$exchangeratetype == null ? other$exchangeratetype != null : !this$exchangeratetype.equals(other$exchangeratetype)) {
            return false;
        }
        String this$exchangeratetype___code = this.getExchangeratetype___code();
        String other$exchangeratetype___code = other.getExchangeratetype___code();
        if (this$exchangeratetype___code == null ? other$exchangeratetype___code != null : !this$exchangeratetype___code.equals(other$exchangeratetype___code)) {
            return false;
        }
        MultiLangText this$exchangeratetype___name = this.getExchangeratetype___name();
        MultiLangText other$exchangeratetype___name = other.getExchangeratetype___name();
        if (this$exchangeratetype___name == null ? other$exchangeratetype___name != null : !this$exchangeratetype___name.equals(other$exchangeratetype___name)) {
            return false;
        }
        String this$specialManagementDep = this.getSpecialManagementDep();
        String other$specialManagementDep = other.getSpecialManagementDep();
        if (this$specialManagementDep == null ? other$specialManagementDep != null : !this$specialManagementDep.equals(other$specialManagementDep)) {
            return false;
        }
        String this$specialManagementDepName = this.getSpecialManagementDepName();
        String other$specialManagementDepName = other.getSpecialManagementDepName();
        if (this$specialManagementDepName == null ? other$specialManagementDepName != null : !this$specialManagementDepName.equals(other$specialManagementDepName)) {
            return false;
        }
        MultiLangText this$specialManagementDepName_multilang = this.getSpecialManagementDepName_multilang();
        MultiLangText other$specialManagementDepName_multilang = other.getSpecialManagementDepName_multilang();
        if (this$specialManagementDepName_multilang == null ? other$specialManagementDepName_multilang != null : !this$specialManagementDepName_multilang.equals(other$specialManagementDepName_multilang)) {
            return false;
        }
        String this$professSalesmanId = this.getProfessSalesmanId();
        String other$professSalesmanId = other.getProfessSalesmanId();
        if (this$professSalesmanId == null ? other$professSalesmanId != null : !this$professSalesmanId.equals(other$professSalesmanId)) {
            return false;
        }
        String this$professSalesmanEmail = this.getProfessSalesmanEmail();
        String other$professSalesmanEmail = other.getProfessSalesmanEmail();
        if (this$professSalesmanEmail == null ? other$professSalesmanEmail != null : !this$professSalesmanEmail.equals(other$professSalesmanEmail)) {
            return false;
        }
        String this$professSalesmanName = this.getProfessSalesmanName();
        String other$professSalesmanName = other.getProfessSalesmanName();
        if (this$professSalesmanName == null ? other$professSalesmanName != null : !this$professSalesmanName.equals(other$professSalesmanName)) {
            return false;
        }
        MultiLangText this$professSalesmanName_multilang = this.getProfessSalesmanName_multilang();
        MultiLangText other$professSalesmanName_multilang = other.getProfessSalesmanName_multilang();
        if (this$professSalesmanName_multilang == null ? other$professSalesmanName_multilang != null : !this$professSalesmanName_multilang.equals(other$professSalesmanName_multilang)) {
            return false;
        }
        String this$professSalesmanMobile = this.getProfessSalesmanMobile();
        String other$professSalesmanMobile = other.getProfessSalesmanMobile();
        if (this$professSalesmanMobile == null ? other$professSalesmanMobile != null : !this$professSalesmanMobile.equals(other$professSalesmanMobile)) {
            return false;
        }
        String this$professSalesmanUserId = this.getProfessSalesmanUserId();
        String other$professSalesmanUserId = other.getProfessSalesmanUserId();
        if (this$professSalesmanUserId == null ? other$professSalesmanUserId != null : !this$professSalesmanUserId.equals(other$professSalesmanUserId)) {
            return false;
        }
        String this$addressCode = this.getAddressCode();
        String other$addressCode = other.getAddressCode();
        if (this$addressCode == null ? other$addressCode != null : !this$addressCode.equals(other$addressCode)) {
            return false;
        }
        String this$receiver = this.getReceiver();
        String other$receiver = other.getReceiver();
        if (this$receiver == null ? other$receiver != null : !this$receiver.equals(other$receiver)) {
            return false;
        }
        String this$addressInfoCountry = this.getAddressInfoCountry();
        String other$addressInfoCountry = other.getAddressInfoCountry();
        if (this$addressInfoCountry == null ? other$addressInfoCountry != null : !this$addressInfoCountry.equals(other$addressInfoCountry)) {
            return false;
        }
        String this$addressInfoProvince = this.getAddressInfoProvince();
        String other$addressInfoProvince = other.getAddressInfoProvince();
        if (this$addressInfoProvince == null ? other$addressInfoProvince != null : !this$addressInfoProvince.equals(other$addressInfoProvince)) {
            return false;
        }
        String this$addressInfoCity = this.getAddressInfoCity();
        String other$addressInfoCity = other.getAddressInfoCity();
        if (this$addressInfoCity == null ? other$addressInfoCity != null : !this$addressInfoCity.equals(other$addressInfoCity)) {
            return false;
        }
        String this$addressInfoArea = this.getAddressInfoArea();
        String other$addressInfoArea = other.getAddressInfoArea();
        if (this$addressInfoArea == null ? other$addressInfoArea != null : !this$addressInfoArea.equals(other$addressInfoArea)) {
            return false;
        }
        String this$addressInfoRegion = this.getAddressInfoRegion();
        String other$addressInfoRegion = other.getAddressInfoRegion();
        if (this$addressInfoRegion == null ? other$addressInfoRegion != null : !this$addressInfoRegion.equals(other$addressInfoRegion)) {
            return false;
        }
        String this$addressInfoRegionCode = this.getAddressInfoRegionCode();
        String other$addressInfoRegionCode = other.getAddressInfoRegionCode();
        if (this$addressInfoRegionCode == null ? other$addressInfoRegionCode != null : !this$addressInfoRegionCode.equals(other$addressInfoRegionCode)) {
            return false;
        }
        String this$addressInfoAddress = this.getAddressInfoAddress();
        String other$addressInfoAddress = other.getAddressInfoAddress();
        if (this$addressInfoAddress == null ? other$addressInfoAddress != null : !this$addressInfoAddress.equals(other$addressInfoAddress)) {
            return false;
        }
        String this$addressInfoInputAddress = this.getAddressInfoInputAddress();
        String other$addressInfoInputAddress = other.getAddressInfoInputAddress();
        if (this$addressInfoInputAddress == null ? other$addressInfoInputAddress != null : !this$addressInfoInputAddress.equals(other$addressInfoInputAddress)) {
            return false;
        }
        String this$addressInfoLongitude = this.getAddressInfoLongitude();
        String other$addressInfoLongitude = other.getAddressInfoLongitude();
        if (this$addressInfoLongitude == null ? other$addressInfoLongitude != null : !this$addressInfoLongitude.equals(other$addressInfoLongitude)) {
            return false;
        }
        String this$addressInfoLatitude = this.getAddressInfoLatitude();
        String other$addressInfoLatitude = other.getAddressInfoLatitude();
        if (this$addressInfoLatitude == null ? other$addressInfoLatitude != null : !this$addressInfoLatitude.equals(other$addressInfoLatitude)) {
            return false;
        }
        String this$addressInfoMobile = this.getAddressInfoMobile();
        String other$addressInfoMobile = other.getAddressInfoMobile();
        if (this$addressInfoMobile == null ? other$addressInfoMobile != null : !this$addressInfoMobile.equals(other$addressInfoMobile)) {
            return false;
        }
        String this$addressInfoTelephone = this.getAddressInfoTelephone();
        String other$addressInfoTelephone = other.getAddressInfoTelephone();
        if (this$addressInfoTelephone == null ? other$addressInfoTelephone != null : !this$addressInfoTelephone.equals(other$addressInfoTelephone)) {
            return false;
        }
        String this$addressInfoZipCode = this.getAddressInfoZipCode();
        String other$addressInfoZipCode = other.getAddressInfoZipCode();
        if (this$addressInfoZipCode == null ? other$addressInfoZipCode != null : !this$addressInfoZipCode.equals(other$addressInfoZipCode)) {
            return false;
        }
        String this$shippingAddressErpCode = this.getShippingAddressErpCode();
        String other$shippingAddressErpCode = other.getShippingAddressErpCode();
        if (this$shippingAddressErpCode == null ? other$shippingAddressErpCode != null : !this$shippingAddressErpCode.equals(other$shippingAddressErpCode)) {
            return false;
        }
        String this$deliveryAddressErpCode = this.getDeliveryAddressErpCode();
        String other$deliveryAddressErpCode = other.getDeliveryAddressErpCode();
        if (this$deliveryAddressErpCode == null ? other$deliveryAddressErpCode != null : !this$deliveryAddressErpCode.equals(other$deliveryAddressErpCode)) {
            return false;
        }
        String this$addressInfoEmail = this.getAddressInfoEmail();
        String other$addressInfoEmail = other.getAddressInfoEmail();
        if (this$addressInfoEmail == null ? other$addressInfoEmail != null : !this$addressInfoEmail.equals(other$addressInfoEmail)) {
            return false;
        }
        String this$addressInfoQQ = this.getAddressInfoQQ();
        String other$addressInfoQQ = other.getAddressInfoQQ();
        if (this$addressInfoQQ == null ? other$addressInfoQQ != null : !this$addressInfoQQ.equals(other$addressInfoQQ)) {
            return false;
        }
        String this$addressInfoWeChat = this.getAddressInfoWeChat();
        String other$addressInfoWeChat = other.getAddressInfoWeChat();
        if (this$addressInfoWeChat == null ? other$addressInfoWeChat != null : !this$addressInfoWeChat.equals(other$addressInfoWeChat)) {
            return false;
        }
        String this$addressInfoRemarks = this.getAddressInfoRemarks();
        String other$addressInfoRemarks = other.getAddressInfoRemarks();
        if (this$addressInfoRemarks == null ? other$addressInfoRemarks != null : !this$addressInfoRemarks.equals(other$addressInfoRemarks)) {
            return false;
        }
        String this$mergerName = this.getMergerName();
        String other$mergerName = other.getMergerName();
        if (this$mergerName == null ? other$mergerName != null : !this$mergerName.equals(other$mergerName)) {
            return false;
        }
        String this$detailSaleAreaCode = this.getDetailSaleAreaCode();
        String other$detailSaleAreaCode = other.getDetailSaleAreaCode();
        if (this$detailSaleAreaCode == null ? other$detailSaleAreaCode != null : !this$detailSaleAreaCode.equals(other$detailSaleAreaCode)) {
            return false;
        }
        String this$detailSaleAreaName = this.getDetailSaleAreaName();
        String other$detailSaleAreaName = other.getDetailSaleAreaName();
        if (this$detailSaleAreaName == null ? other$detailSaleAreaName != null : !this$detailSaleAreaName.equals(other$detailSaleAreaName)) {
            return false;
        }
        String this$detailSaleAreaPath = this.getDetailSaleAreaPath();
        String other$detailSaleAreaPath = other.getDetailSaleAreaPath();
        if (this$detailSaleAreaPath == null ? other$detailSaleAreaPath != null : !this$detailSaleAreaPath.equals(other$detailSaleAreaPath)) {
            return false;
        }
        String this$agentLevelCode = this.getAgentLevelCode();
        String other$agentLevelCode = other.getAgentLevelCode();
        if (this$agentLevelCode == null ? other$agentLevelCode != null : !this$agentLevelCode.equals(other$agentLevelCode)) {
            return false;
        }
        String this$agentLevelName = this.getAgentLevelName();
        String other$agentLevelName = other.getAgentLevelName();
        if (this$agentLevelName == null ? other$agentLevelName != null : !this$agentLevelName.equals(other$agentLevelName)) {
            return false;
        }
        String this$contacterFullName = this.getContacterFullName();
        String other$contacterFullName = other.getContacterFullName();
        if (this$contacterFullName == null ? other$contacterFullName != null : !this$contacterFullName.equals(other$contacterFullName)) {
            return false;
        }
        String this$contacterMobile = this.getContacterMobile();
        String other$contacterMobile = other.getContacterMobile();
        if (this$contacterMobile == null ? other$contacterMobile != null : !this$contacterMobile.equals(other$contacterMobile)) {
            return false;
        }
        String this$contacterAreaCodeMobile = this.getContacterAreaCodeMobile();
        String other$contacterAreaCodeMobile = other.getContacterAreaCodeMobile();
        if (this$contacterAreaCodeMobile == null ? other$contacterAreaCodeMobile != null : !this$contacterAreaCodeMobile.equals(other$contacterAreaCodeMobile)) {
            return false;
        }
        String this$agentInvoiceBdBillingType = this.getAgentInvoiceBdBillingType();
        String other$agentInvoiceBdBillingType = other.getAgentInvoiceBdBillingType();
        if (this$agentInvoiceBdBillingType == null ? other$agentInvoiceBdBillingType != null : !this$agentInvoiceBdBillingType.equals(other$agentInvoiceBdBillingType)) {
            return false;
        }
        String this$agentInvoiceTitle = this.getAgentInvoiceTitle();
        String other$agentInvoiceTitle = other.getAgentInvoiceTitle();
        if (this$agentInvoiceTitle == null ? other$agentInvoiceTitle != null : !this$agentInvoiceTitle.equals(other$agentInvoiceTitle)) {
            return false;
        }
        String this$agentInvoiceTaxNo = this.getAgentInvoiceTaxNo();
        String other$agentInvoiceTaxNo = other.getAgentInvoiceTaxNo();
        if (this$agentInvoiceTaxNo == null ? other$agentInvoiceTaxNo != null : !this$agentInvoiceTaxNo.equals(other$agentInvoiceTaxNo)) {
            return false;
        }
        String this$agentInvoiceTelephone = this.getAgentInvoiceTelephone();
        String other$agentInvoiceTelephone = other.getAgentInvoiceTelephone();
        if (this$agentInvoiceTelephone == null ? other$agentInvoiceTelephone != null : !this$agentInvoiceTelephone.equals(other$agentInvoiceTelephone)) {
            return false;
        }
        String this$agentInvoiceName = this.getAgentInvoiceName();
        String other$agentInvoiceName = other.getAgentInvoiceName();
        if (this$agentInvoiceName == null ? other$agentInvoiceName != null : !this$agentInvoiceName.equals(other$agentInvoiceName)) {
            return false;
        }
        String this$agentInvoiceBankName = this.getAgentInvoiceBankName();
        String other$agentInvoiceBankName = other.getAgentInvoiceBankName();
        if (this$agentInvoiceBankName == null ? other$agentInvoiceBankName != null : !this$agentInvoiceBankName.equals(other$agentInvoiceBankName)) {
            return false;
        }
        String this$agentInvoiceBankAccount = this.getAgentInvoiceBankAccount();
        String other$agentInvoiceBankAccount = other.getAgentInvoiceBankAccount();
        if (this$agentInvoiceBankAccount == null ? other$agentInvoiceBankAccount != null : !this$agentInvoiceBankAccount.equals(other$agentInvoiceBankAccount)) {
            return false;
        }
        String this$agentInvoiceAddress = this.getAgentInvoiceAddress();
        String other$agentInvoiceAddress = other.getAgentInvoiceAddress();
        if (this$agentInvoiceAddress == null ? other$agentInvoiceAddress != null : !this$agentInvoiceAddress.equals(other$agentInvoiceAddress)) {
            return false;
        }
        String this$agentInvoiceRemarks = this.getAgentInvoiceRemarks();
        String other$agentInvoiceRemarks = other.getAgentInvoiceRemarks();
        if (this$agentInvoiceRemarks == null ? other$agentInvoiceRemarks != null : !this$agentInvoiceRemarks.equals(other$agentInvoiceRemarks)) {
            return false;
        }
        String this$agentInvoiceReceiveInvoiceMobile = this.getAgentInvoiceReceiveInvoiceMobile();
        String other$agentInvoiceReceiveInvoiceMobile = other.getAgentInvoiceReceiveInvoiceMobile();
        if (this$agentInvoiceReceiveInvoiceMobile == null ? other$agentInvoiceReceiveInvoiceMobile != null : !this$agentInvoiceReceiveInvoiceMobile.equals(other$agentInvoiceReceiveInvoiceMobile)) {
            return false;
        }
        String this$agentInvoiceReceiveInvoiceEmail = this.getAgentInvoiceReceiveInvoiceEmail();
        String other$agentInvoiceReceiveInvoiceEmail = other.getAgentInvoiceReceiveInvoiceEmail();
        if (this$agentInvoiceReceiveInvoiceEmail == null ? other$agentInvoiceReceiveInvoiceEmail != null : !this$agentInvoiceReceiveInvoiceEmail.equals(other$agentInvoiceReceiveInvoiceEmail)) {
            return false;
        }
        HashMap<String, Object> this$merchantCharacter = this.getMerchantCharacter();
        HashMap<String, Object> other$merchantCharacter = other.getMerchantCharacter();
        if (this$merchantCharacter == null ? other$merchantCharacter != null : !((Object)this$merchantCharacter).equals(other$merchantCharacter)) {
            return false;
        }
        HashMap<String, Object> this$merchantDetailCharacter = this.getMerchantDetailCharacter();
        HashMap<String, Object> other$merchantDetailCharacter = other.getMerchantDetailCharacter();
        if (this$merchantDetailCharacter == null ? other$merchantDetailCharacter != null : !((Object)this$merchantDetailCharacter).equals(other$merchantDetailCharacter)) {
            return false;
        }
        String this$collectionAgreementCode = this.getCollectionAgreementCode();
        String other$collectionAgreementCode = other.getCollectionAgreementCode();
        if (this$collectionAgreementCode == null ? other$collectionAgreementCode != null : !this$collectionAgreementCode.equals(other$collectionAgreementCode)) {
            return false;
        }
        String this$collectionAgreementName = this.getCollectionAgreementName();
        String other$collectionAgreementName = other.getCollectionAgreementName();
        if (this$collectionAgreementName == null ? other$collectionAgreementName != null : !this$collectionAgreementName.equals(other$collectionAgreementName)) {
            return false;
        }
        String this$freezeLink = this.getFreezeLink();
        String other$freezeLink = other.getFreezeLink();
        if (this$freezeLink == null ? other$freezeLink != null : !this$freezeLink.equals(other$freezeLink)) {
            return false;
        }
        String this$tradeCustomers = this.getTradeCustomers();
        String other$tradeCustomers = other.getTradeCustomers();
        if (this$tradeCustomers == null ? other$tradeCustomers != null : !this$tradeCustomers.equals(other$tradeCustomers)) {
            return false;
        }
        String this$potential = this.getPotential();
        String other$potential = other.getPotential();
        if (this$potential == null ? other$potential != null : !this$potential.equals(other$potential)) {
            return false;
        }
        String this$isFinancialSynergy = this.getIsFinancialSynergy();
        String other$isFinancialSynergy = other.getIsFinancialSynergy();
        return !(this$isFinancialSynergy == null ? other$isFinancialSynergy != null : !this$isFinancialSynergy.equals(other$isFinancialSynergy));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MerchantDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $rangeType = this.getRangeType();
        result = result * 59 + ($rangeType == null ? 43 : ((Object)$rangeType).hashCode());
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Integer $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Long $customerLevel = this.getCustomerLevel();
        result = result * 59 + ($customerLevel == null ? 43 : ((Object)$customerLevel).hashCode());
        Long $customerType = this.getCustomerType();
        result = result * 59 + ($customerType == null ? 43 : ((Object)$customerType).hashCode());
        Long $deliveryWarehouse = this.getDeliveryWarehouse();
        result = result * 59 + ($deliveryWarehouse == null ? 43 : ((Object)$deliveryWarehouse).hashCode());
        Long $settlementMethod = this.getSettlementMethod();
        result = result * 59 + ($settlementMethod == null ? 43 : ((Object)$settlementMethod).hashCode());
        Integer $creditServiceDay = this.getCreditServiceDay();
        result = result * 59 + ($creditServiceDay == null ? 43 : ((Object)$creditServiceDay).hashCode());
        Long $collectionAgreement = this.getCollectionAgreement();
        result = result * 59 + ($collectionAgreement == null ? 43 : ((Object)$collectionAgreement).hashCode());
        Integer $payWay = this.getPayWay();
        result = result * 59 + ($payWay == null ? 43 : ((Object)$payWay).hashCode());
        Long $shipmentMethod = this.getShipmentMethod();
        result = result * 59 + ($shipmentMethod == null ? 43 : ((Object)$shipmentMethod).hashCode());
        Boolean $detailStopStatus = this.getDetailStopStatus();
        result = result * 59 + ($detailStopStatus == null ? 43 : ((Object)$detailStopStatus).hashCode());
        Long $addressInfoId = this.getAddressInfoId();
        result = result * 59 + ($addressInfoId == null ? 43 : ((Object)$addressInfoId).hashCode());
        Long $addressId = this.getAddressId();
        result = result * 59 + ($addressId == null ? 43 : ((Object)$addressId).hashCode());
        Boolean $addressInfoDefault = this.getAddressInfoDefault();
        result = result * 59 + ($addressInfoDefault == null ? 43 : ((Object)$addressInfoDefault).hashCode());
        Long $receivingWarehouse = this.getReceivingWarehouse();
        result = result * 59 + ($receivingWarehouse == null ? 43 : ((Object)$receivingWarehouse).hashCode());
        Long $shipRegion = this.getShipRegion();
        result = result * 59 + ($shipRegion == null ? 43 : ((Object)$shipRegion).hashCode());
        Long $detailSaleAreaId = this.getDetailSaleAreaId();
        result = result * 59 + ($detailSaleAreaId == null ? 43 : ((Object)$detailSaleAreaId).hashCode());
        Long $agentLevelId = this.getAgentLevelId();
        result = result * 59 + ($agentLevelId == null ? 43 : ((Object)$agentLevelId).hashCode());
        Long $contacterId = this.getContacterId();
        result = result * 59 + ($contacterId == null ? 43 : ((Object)$contacterId).hashCode());
        Boolean $contacterDefault = this.getContacterDefault();
        result = result * 59 + ($contacterDefault == null ? 43 : ((Object)$contacterDefault).hashCode());
        Integer $agentInvoiceBillingType = this.getAgentInvoiceBillingType();
        result = result * 59 + ($agentInvoiceBillingType == null ? 43 : ((Object)$agentInvoiceBillingType).hashCode());
        Boolean $agentInvoiceDefaultInvoice = this.getAgentInvoiceDefaultInvoice();
        result = result * 59 + ($agentInvoiceDefaultInvoice == null ? 43 : ((Object)$agentInvoiceDefaultInvoice).hashCode());
        Integer $maxChannelLevel = this.getMaxChannelLevel();
        result = result * 59 + ($maxChannelLevel == null ? 43 : ((Object)$maxChannelLevel).hashCode());
        Integer $miniChannelLevel = this.getMiniChannelLevel();
        result = result * 59 + ($miniChannelLevel == null ? 43 : ((Object)$miniChannelLevel).hashCode());
        Long $collectionAgreementId = this.getCollectionAgreementId();
        result = result * 59 + ($collectionAgreementId == null ? 43 : ((Object)$collectionAgreementId).hashCode());
        Integer $frozenState = this.getFrozenState();
        result = result * 59 + ($frozenState == null ? 43 : ((Object)$frozenState).hashCode());
        Integer $priceMarking = this.getPriceMarking();
        result = result * 59 + ($priceMarking == null ? 43 : ((Object)$priceMarking).hashCode());
        String $rangesOrgId = this.getRangesOrgId();
        result = result * 59 + ($rangesOrgId == null ? 43 : $rangesOrgId.hashCode());
        String $shopId = this.getShopId();
        result = result * 59 + ($shopId == null ? 43 : $shopId.hashCode());
        String $searchCode = this.getSearchCode();
        result = result * 59 + ($searchCode == null ? 43 : $searchCode.hashCode());
        Date $createTime = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : ((Object)$createTime).hashCode());
        String $customerTypeName = this.getCustomerTypeName();
        result = result * 59 + ($customerTypeName == null ? 43 : $customerTypeName.hashCode());
        String $transactionCurrency = this.getTransactionCurrency();
        result = result * 59 + ($transactionCurrency == null ? 43 : $transactionCurrency.hashCode());
        String $taxRate = this.getTaxRate();
        result = result * 59 + ($taxRate == null ? 43 : $taxRate.hashCode());
        String $settlementMethod___code = this.getSettlementMethod___code();
        result = result * 59 + ($settlementMethod___code == null ? 43 : $settlementMethod___code.hashCode());
        MultiLangText $settlementMethod___name = this.getSettlementMethod___name();
        result = result * 59 + ($settlementMethod___name == null ? 43 : $settlementMethod___name.hashCode());
        String $shipmentMethod___code = this.getShipmentMethod___code();
        result = result * 59 + ($shipmentMethod___code == null ? 43 : $shipmentMethod___code.hashCode());
        MultiLangText $shipmentMethod___name = this.getShipmentMethod___name();
        result = result * 59 + ($shipmentMethod___name == null ? 43 : $shipmentMethod___name.hashCode());
        String $exchangeratetype = this.getExchangeratetype();
        result = result * 59 + ($exchangeratetype == null ? 43 : $exchangeratetype.hashCode());
        String $exchangeratetype___code = this.getExchangeratetype___code();
        result = result * 59 + ($exchangeratetype___code == null ? 43 : $exchangeratetype___code.hashCode());
        MultiLangText $exchangeratetype___name = this.getExchangeratetype___name();
        result = result * 59 + ($exchangeratetype___name == null ? 43 : $exchangeratetype___name.hashCode());
        String $specialManagementDep = this.getSpecialManagementDep();
        result = result * 59 + ($specialManagementDep == null ? 43 : $specialManagementDep.hashCode());
        String $specialManagementDepName = this.getSpecialManagementDepName();
        result = result * 59 + ($specialManagementDepName == null ? 43 : $specialManagementDepName.hashCode());
        MultiLangText $specialManagementDepName_multilang = this.getSpecialManagementDepName_multilang();
        result = result * 59 + ($specialManagementDepName_multilang == null ? 43 : $specialManagementDepName_multilang.hashCode());
        String $professSalesmanId = this.getProfessSalesmanId();
        result = result * 59 + ($professSalesmanId == null ? 43 : $professSalesmanId.hashCode());
        String $professSalesmanEmail = this.getProfessSalesmanEmail();
        result = result * 59 + ($professSalesmanEmail == null ? 43 : $professSalesmanEmail.hashCode());
        String $professSalesmanName = this.getProfessSalesmanName();
        result = result * 59 + ($professSalesmanName == null ? 43 : $professSalesmanName.hashCode());
        MultiLangText $professSalesmanName_multilang = this.getProfessSalesmanName_multilang();
        result = result * 59 + ($professSalesmanName_multilang == null ? 43 : $professSalesmanName_multilang.hashCode());
        String $professSalesmanMobile = this.getProfessSalesmanMobile();
        result = result * 59 + ($professSalesmanMobile == null ? 43 : $professSalesmanMobile.hashCode());
        String $professSalesmanUserId = this.getProfessSalesmanUserId();
        result = result * 59 + ($professSalesmanUserId == null ? 43 : $professSalesmanUserId.hashCode());
        String $addressCode = this.getAddressCode();
        result = result * 59 + ($addressCode == null ? 43 : $addressCode.hashCode());
        String $receiver = this.getReceiver();
        result = result * 59 + ($receiver == null ? 43 : $receiver.hashCode());
        String $addressInfoCountry = this.getAddressInfoCountry();
        result = result * 59 + ($addressInfoCountry == null ? 43 : $addressInfoCountry.hashCode());
        String $addressInfoProvince = this.getAddressInfoProvince();
        result = result * 59 + ($addressInfoProvince == null ? 43 : $addressInfoProvince.hashCode());
        String $addressInfoCity = this.getAddressInfoCity();
        result = result * 59 + ($addressInfoCity == null ? 43 : $addressInfoCity.hashCode());
        String $addressInfoArea = this.getAddressInfoArea();
        result = result * 59 + ($addressInfoArea == null ? 43 : $addressInfoArea.hashCode());
        String $addressInfoRegion = this.getAddressInfoRegion();
        result = result * 59 + ($addressInfoRegion == null ? 43 : $addressInfoRegion.hashCode());
        String $addressInfoRegionCode = this.getAddressInfoRegionCode();
        result = result * 59 + ($addressInfoRegionCode == null ? 43 : $addressInfoRegionCode.hashCode());
        String $addressInfoAddress = this.getAddressInfoAddress();
        result = result * 59 + ($addressInfoAddress == null ? 43 : $addressInfoAddress.hashCode());
        String $addressInfoInputAddress = this.getAddressInfoInputAddress();
        result = result * 59 + ($addressInfoInputAddress == null ? 43 : $addressInfoInputAddress.hashCode());
        String $addressInfoLongitude = this.getAddressInfoLongitude();
        result = result * 59 + ($addressInfoLongitude == null ? 43 : $addressInfoLongitude.hashCode());
        String $addressInfoLatitude = this.getAddressInfoLatitude();
        result = result * 59 + ($addressInfoLatitude == null ? 43 : $addressInfoLatitude.hashCode());
        String $addressInfoMobile = this.getAddressInfoMobile();
        result = result * 59 + ($addressInfoMobile == null ? 43 : $addressInfoMobile.hashCode());
        String $addressInfoTelephone = this.getAddressInfoTelephone();
        result = result * 59 + ($addressInfoTelephone == null ? 43 : $addressInfoTelephone.hashCode());
        String $addressInfoZipCode = this.getAddressInfoZipCode();
        result = result * 59 + ($addressInfoZipCode == null ? 43 : $addressInfoZipCode.hashCode());
        String $shippingAddressErpCode = this.getShippingAddressErpCode();
        result = result * 59 + ($shippingAddressErpCode == null ? 43 : $shippingAddressErpCode.hashCode());
        String $deliveryAddressErpCode = this.getDeliveryAddressErpCode();
        result = result * 59 + ($deliveryAddressErpCode == null ? 43 : $deliveryAddressErpCode.hashCode());
        String $addressInfoEmail = this.getAddressInfoEmail();
        result = result * 59 + ($addressInfoEmail == null ? 43 : $addressInfoEmail.hashCode());
        String $addressInfoQQ = this.getAddressInfoQQ();
        result = result * 59 + ($addressInfoQQ == null ? 43 : $addressInfoQQ.hashCode());
        String $addressInfoWeChat = this.getAddressInfoWeChat();
        result = result * 59 + ($addressInfoWeChat == null ? 43 : $addressInfoWeChat.hashCode());
        String $addressInfoRemarks = this.getAddressInfoRemarks();
        result = result * 59 + ($addressInfoRemarks == null ? 43 : $addressInfoRemarks.hashCode());
        String $mergerName = this.getMergerName();
        result = result * 59 + ($mergerName == null ? 43 : $mergerName.hashCode());
        String $detailSaleAreaCode = this.getDetailSaleAreaCode();
        result = result * 59 + ($detailSaleAreaCode == null ? 43 : $detailSaleAreaCode.hashCode());
        String $detailSaleAreaName = this.getDetailSaleAreaName();
        result = result * 59 + ($detailSaleAreaName == null ? 43 : $detailSaleAreaName.hashCode());
        String $detailSaleAreaPath = this.getDetailSaleAreaPath();
        result = result * 59 + ($detailSaleAreaPath == null ? 43 : $detailSaleAreaPath.hashCode());
        String $agentLevelCode = this.getAgentLevelCode();
        result = result * 59 + ($agentLevelCode == null ? 43 : $agentLevelCode.hashCode());
        String $agentLevelName = this.getAgentLevelName();
        result = result * 59 + ($agentLevelName == null ? 43 : $agentLevelName.hashCode());
        String $contacterFullName = this.getContacterFullName();
        result = result * 59 + ($contacterFullName == null ? 43 : $contacterFullName.hashCode());
        String $contacterMobile = this.getContacterMobile();
        result = result * 59 + ($contacterMobile == null ? 43 : $contacterMobile.hashCode());
        String $contacterAreaCodeMobile = this.getContacterAreaCodeMobile();
        result = result * 59 + ($contacterAreaCodeMobile == null ? 43 : $contacterAreaCodeMobile.hashCode());
        String $agentInvoiceBdBillingType = this.getAgentInvoiceBdBillingType();
        result = result * 59 + ($agentInvoiceBdBillingType == null ? 43 : $agentInvoiceBdBillingType.hashCode());
        String $agentInvoiceTitle = this.getAgentInvoiceTitle();
        result = result * 59 + ($agentInvoiceTitle == null ? 43 : $agentInvoiceTitle.hashCode());
        String $agentInvoiceTaxNo = this.getAgentInvoiceTaxNo();
        result = result * 59 + ($agentInvoiceTaxNo == null ? 43 : $agentInvoiceTaxNo.hashCode());
        String $agentInvoiceTelephone = this.getAgentInvoiceTelephone();
        result = result * 59 + ($agentInvoiceTelephone == null ? 43 : $agentInvoiceTelephone.hashCode());
        String $agentInvoiceName = this.getAgentInvoiceName();
        result = result * 59 + ($agentInvoiceName == null ? 43 : $agentInvoiceName.hashCode());
        String $agentInvoiceBankName = this.getAgentInvoiceBankName();
        result = result * 59 + ($agentInvoiceBankName == null ? 43 : $agentInvoiceBankName.hashCode());
        String $agentInvoiceBankAccount = this.getAgentInvoiceBankAccount();
        result = result * 59 + ($agentInvoiceBankAccount == null ? 43 : $agentInvoiceBankAccount.hashCode());
        String $agentInvoiceAddress = this.getAgentInvoiceAddress();
        result = result * 59 + ($agentInvoiceAddress == null ? 43 : $agentInvoiceAddress.hashCode());
        String $agentInvoiceRemarks = this.getAgentInvoiceRemarks();
        result = result * 59 + ($agentInvoiceRemarks == null ? 43 : $agentInvoiceRemarks.hashCode());
        String $agentInvoiceReceiveInvoiceMobile = this.getAgentInvoiceReceiveInvoiceMobile();
        result = result * 59 + ($agentInvoiceReceiveInvoiceMobile == null ? 43 : $agentInvoiceReceiveInvoiceMobile.hashCode());
        String $agentInvoiceReceiveInvoiceEmail = this.getAgentInvoiceReceiveInvoiceEmail();
        result = result * 59 + ($agentInvoiceReceiveInvoiceEmail == null ? 43 : $agentInvoiceReceiveInvoiceEmail.hashCode());
        HashMap<String, Object> $merchantCharacter = this.getMerchantCharacter();
        result = result * 59 + ($merchantCharacter == null ? 43 : ((Object)$merchantCharacter).hashCode());
        HashMap<String, Object> $merchantDetailCharacter = this.getMerchantDetailCharacter();
        result = result * 59 + ($merchantDetailCharacter == null ? 43 : ((Object)$merchantDetailCharacter).hashCode());
        String $collectionAgreementCode = this.getCollectionAgreementCode();
        result = result * 59 + ($collectionAgreementCode == null ? 43 : $collectionAgreementCode.hashCode());
        String $collectionAgreementName = this.getCollectionAgreementName();
        result = result * 59 + ($collectionAgreementName == null ? 43 : $collectionAgreementName.hashCode());
        String $freezeLink = this.getFreezeLink();
        result = result * 59 + ($freezeLink == null ? 43 : $freezeLink.hashCode());
        String $tradeCustomers = this.getTradeCustomers();
        result = result * 59 + ($tradeCustomers == null ? 43 : $tradeCustomers.hashCode());
        String $potential = this.getPotential();
        result = result * 59 + ($potential == null ? 43 : $potential.hashCode());
        String $isFinancialSynergy = this.getIsFinancialSynergy();
        result = result * 59 + ($isFinancialSynergy == null ? 43 : $isFinancialSynergy.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MerchantDTO(rangesOrgId=" + this.getRangesOrgId() + ", shopId=" + this.getShopId() + ", rangeType=" + this.getRangeType() + ", merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", searchCode=" + this.getSearchCode() + ", stopStatus=" + this.getStopStatus() + ", createTime=" + this.getCreateTime() + ", customerLevel=" + this.getCustomerLevel() + ", customerType=" + this.getCustomerType() + ", customerTypeName=" + this.getCustomerTypeName() + ", transactionCurrency=" + this.getTransactionCurrency() + ", taxRate=" + this.getTaxRate() + ", deliveryWarehouse=" + this.getDeliveryWarehouse() + ", settlementMethod=" + this.getSettlementMethod() + ", settlementMethod___code=" + this.getSettlementMethod___code() + ", settlementMethod___name=" + this.getSettlementMethod___name() + ", creditServiceDay=" + this.getCreditServiceDay() + ", collectionAgreement=" + this.getCollectionAgreement() + ", payWay=" + this.getPayWay() + ", shipmentMethod=" + this.getShipmentMethod() + ", shipmentMethod___code=" + this.getShipmentMethod___code() + ", shipmentMethod___name=" + this.getShipmentMethod___name() + ", exchangeratetype=" + this.getExchangeratetype() + ", exchangeratetype___code=" + this.getExchangeratetype___code() + ", exchangeratetype___name=" + this.getExchangeratetype___name() + ", specialManagementDep=" + this.getSpecialManagementDep() + ", specialManagementDepName=" + this.getSpecialManagementDepName() + ", specialManagementDepName_multilang=" + this.getSpecialManagementDepName_multilang() + ", professSalesmanId=" + this.getProfessSalesmanId() + ", professSalesmanEmail=" + this.getProfessSalesmanEmail() + ", professSalesmanName=" + this.getProfessSalesmanName() + ", professSalesmanName_multilang=" + this.getProfessSalesmanName_multilang() + ", professSalesmanMobile=" + this.getProfessSalesmanMobile() + ", professSalesmanUserId=" + this.getProfessSalesmanUserId() + ", detailStopStatus=" + this.getDetailStopStatus() + ", addressInfoId=" + this.getAddressInfoId() + ", addressId=" + this.getAddressId() + ", addressCode=" + this.getAddressCode() + ", receiver=" + this.getReceiver() + ", addressInfoCountry=" + this.getAddressInfoCountry() + ", addressInfoProvince=" + this.getAddressInfoProvince() + ", addressInfoCity=" + this.getAddressInfoCity() + ", addressInfoArea=" + this.getAddressInfoArea() + ", addressInfoRegion=" + this.getAddressInfoRegion() + ", addressInfoRegionCode=" + this.getAddressInfoRegionCode() + ", addressInfoAddress=" + this.getAddressInfoAddress() + ", addressInfoInputAddress=" + this.getAddressInfoInputAddress() + ", addressInfoLongitude=" + this.getAddressInfoLongitude() + ", addressInfoLatitude=" + this.getAddressInfoLatitude() + ", addressInfoMobile=" + this.getAddressInfoMobile() + ", addressInfoTelephone=" + this.getAddressInfoTelephone() + ", addressInfoZipCode=" + this.getAddressInfoZipCode() + ", addressInfoDefault=" + this.getAddressInfoDefault() + ", shippingAddressErpCode=" + this.getShippingAddressErpCode() + ", deliveryAddressErpCode=" + this.getDeliveryAddressErpCode() + ", addressInfoEmail=" + this.getAddressInfoEmail() + ", addressInfoQQ=" + this.getAddressInfoQQ() + ", addressInfoWeChat=" + this.getAddressInfoWeChat() + ", addressInfoRemarks=" + this.getAddressInfoRemarks() + ", mergerName=" + this.getMergerName() + ", receivingWarehouse=" + this.getReceivingWarehouse() + ", shipRegion=" + this.getShipRegion() + ", detailSaleAreaId=" + this.getDetailSaleAreaId() + ", detailSaleAreaCode=" + this.getDetailSaleAreaCode() + ", detailSaleAreaName=" + this.getDetailSaleAreaName() + ", detailSaleAreaPath=" + this.getDetailSaleAreaPath() + ", agentLevelId=" + this.getAgentLevelId() + ", agentLevelCode=" + this.getAgentLevelCode() + ", agentLevelName=" + this.getAgentLevelName() + ", contacterId=" + this.getContacterId() + ", contacterFullName=" + this.getContacterFullName() + ", contacterMobile=" + this.getContacterMobile() + ", contacterAreaCodeMobile=" + this.getContacterAreaCodeMobile() + ", contacterDefault=" + this.getContacterDefault() + ", agentInvoiceBillingType=" + this.getAgentInvoiceBillingType() + ", agentInvoiceBdBillingType=" + this.getAgentInvoiceBdBillingType() + ", agentInvoiceTitle=" + this.getAgentInvoiceTitle() + ", agentInvoiceTaxNo=" + this.getAgentInvoiceTaxNo() + ", agentInvoiceTelephone=" + this.getAgentInvoiceTelephone() + ", agentInvoiceName=" + this.getAgentInvoiceName() + ", agentInvoiceBankName=" + this.getAgentInvoiceBankName() + ", agentInvoiceBankAccount=" + this.getAgentInvoiceBankAccount() + ", agentInvoiceAddress=" + this.getAgentInvoiceAddress() + ", agentInvoiceDefaultInvoice=" + this.getAgentInvoiceDefaultInvoice() + ", agentInvoiceRemarks=" + this.getAgentInvoiceRemarks() + ", agentInvoiceReceiveInvoiceMobile=" + this.getAgentInvoiceReceiveInvoiceMobile() + ", agentInvoiceReceiveInvoiceEmail=" + this.getAgentInvoiceReceiveInvoiceEmail() + ", maxChannelLevel=" + this.getMaxChannelLevel() + ", miniChannelLevel=" + this.getMiniChannelLevel() + ", merchantCharacter=" + this.getMerchantCharacter() + ", merchantDetailCharacter=" + this.getMerchantDetailCharacter() + ", collectionAgreementId=" + this.getCollectionAgreementId() + ", collectionAgreementCode=" + this.getCollectionAgreementCode() + ", collectionAgreementName=" + this.getCollectionAgreementName() + ", frozenState=" + this.getFrozenState() + ", freezeLink=" + this.getFreezeLink() + ", tradeCustomers=" + this.getTradeCustomers() + ", priceMarking=" + this.getPriceMarking() + ", potential=" + this.getPotential() + ", isFinancialSynergy=" + this.getIsFinancialSynergy() + ")";
    }
}

