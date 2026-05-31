/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyou.iuap.apdoc.sdk.dto.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantDetailDataDTO
implements Serializable {
    private String id;
    private Long merchantId;
    private String belongMerchantId;
    private String belongMerchantId___code;
    private String belongMerchantId___name;
    private String searchCode;
    private String transactionCurrencyId;
    private String transactionCurrencyId___code;
    private String transactionCurrencyId___name;
    private String taxRateId;
    private String taxRateId___code;
    private String taxRateId___name;
    private Long deliveryWarehouseId;
    private String deliveryWarehouseId___code;
    private String deliveryWarehouseId___name;
    private Integer creditServiceDayId;
    private Long collectionAgreementId;
    private String collectionAgreementId___code;
    private String collectionAgreementId___name;
    private Long settlementMethodId;
    private String settlementMethodId___code;
    private String settlementMethodId___name;
    private Long shipmentMethodId;
    private String shipmentMethodId___code;
    private String shipmentMethodId___name;
    private Integer signBack;
    private Long merchantLevelId;
    private String merchantLevelId___code;
    private String merchantLevelId___name;
    private String exchangeRateTypeId;
    private String exchangeRateTypeId___code;
    private String exchangeRateTypeId___name;
    private Long merchantTypeId;
    private String merchantTypeId___code;
    private String merchantTypeId___name;
    private String orgDefaultAddress;
    private HashMap<String, Object> merchantApplyRangeDetailCharacter;
    private Map<String, Object> customExtend;
    private String freezeLink;
    private String frozenState;
    private String isTradeCustomers;
    private String payWay;
    private Long layoffId;
    private String layoffId___code;
    private String layoffId___name;
    private Boolean isCreator;
    private Integer priceMarking;
    private String erpCode;
    private Date lockTime;
    private String locker;
    private Date lockDate;
    private String creator;
    private Date modifyTime;
    private Date modifyDate;
    private Date createTime;
    private String modifier;
    private Long creatorId;
    private Long modifierId;
    private Date createDate;
    private Date stoptime;
    private Boolean stopstatus;
    private Date pubts;
    private UPCEntityStatus entityStatus;
    private List<String> needBlankFieldList;

    public String getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getBelongMerchantId() {
        return this.belongMerchantId;
    }

    public String getBelongMerchantId___code() {
        return this.belongMerchantId___code;
    }

    public String getBelongMerchantId___name() {
        return this.belongMerchantId___name;
    }

    public String getSearchCode() {
        return this.searchCode;
    }

    public String getTransactionCurrencyId() {
        return this.transactionCurrencyId;
    }

    public String getTransactionCurrencyId___code() {
        return this.transactionCurrencyId___code;
    }

    public String getTransactionCurrencyId___name() {
        return this.transactionCurrencyId___name;
    }

    public String getTaxRateId() {
        return this.taxRateId;
    }

    public String getTaxRateId___code() {
        return this.taxRateId___code;
    }

    public String getTaxRateId___name() {
        return this.taxRateId___name;
    }

    public Long getDeliveryWarehouseId() {
        return this.deliveryWarehouseId;
    }

    public String getDeliveryWarehouseId___code() {
        return this.deliveryWarehouseId___code;
    }

    public String getDeliveryWarehouseId___name() {
        return this.deliveryWarehouseId___name;
    }

    public Integer getCreditServiceDayId() {
        return this.creditServiceDayId;
    }

    public Long getCollectionAgreementId() {
        return this.collectionAgreementId;
    }

    public String getCollectionAgreementId___code() {
        return this.collectionAgreementId___code;
    }

    public String getCollectionAgreementId___name() {
        return this.collectionAgreementId___name;
    }

    public Long getSettlementMethodId() {
        return this.settlementMethodId;
    }

    public String getSettlementMethodId___code() {
        return this.settlementMethodId___code;
    }

    public String getSettlementMethodId___name() {
        return this.settlementMethodId___name;
    }

    public Long getShipmentMethodId() {
        return this.shipmentMethodId;
    }

    public String getShipmentMethodId___code() {
        return this.shipmentMethodId___code;
    }

    public String getShipmentMethodId___name() {
        return this.shipmentMethodId___name;
    }

    public Integer getSignBack() {
        return this.signBack;
    }

    public Long getMerchantLevelId() {
        return this.merchantLevelId;
    }

    public String getMerchantLevelId___code() {
        return this.merchantLevelId___code;
    }

    public String getMerchantLevelId___name() {
        return this.merchantLevelId___name;
    }

    public String getExchangeRateTypeId() {
        return this.exchangeRateTypeId;
    }

    public String getExchangeRateTypeId___code() {
        return this.exchangeRateTypeId___code;
    }

    public String getExchangeRateTypeId___name() {
        return this.exchangeRateTypeId___name;
    }

    public Long getMerchantTypeId() {
        return this.merchantTypeId;
    }

    public String getMerchantTypeId___code() {
        return this.merchantTypeId___code;
    }

    public String getMerchantTypeId___name() {
        return this.merchantTypeId___name;
    }

    public String getOrgDefaultAddress() {
        return this.orgDefaultAddress;
    }

    public HashMap<String, Object> getMerchantApplyRangeDetailCharacter() {
        return this.merchantApplyRangeDetailCharacter;
    }

    public Map<String, Object> getCustomExtend() {
        return this.customExtend;
    }

    public String getFreezeLink() {
        return this.freezeLink;
    }

    public String getFrozenState() {
        return this.frozenState;
    }

    public String getIsTradeCustomers() {
        return this.isTradeCustomers;
    }

    public String getPayWay() {
        return this.payWay;
    }

    public Long getLayoffId() {
        return this.layoffId;
    }

    public String getLayoffId___code() {
        return this.layoffId___code;
    }

    public String getLayoffId___name() {
        return this.layoffId___name;
    }

    public Boolean getIsCreator() {
        return this.isCreator;
    }

    public Integer getPriceMarking() {
        return this.priceMarking;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public Date getLockTime() {
        return this.lockTime;
    }

    public String getLocker() {
        return this.locker;
    }

    public Date getLockDate() {
        return this.lockDate;
    }

    public String getCreator() {
        return this.creator;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public Date getModifyDate() {
        return this.modifyDate;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public String getModifier() {
        return this.modifier;
    }

    public Long getCreatorId() {
        return this.creatorId;
    }

    public Long getModifierId() {
        return this.modifierId;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public Date getStoptime() {
        return this.stoptime;
    }

    public Boolean getStopstatus() {
        return this.stopstatus;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public UPCEntityStatus getEntityStatus() {
        return this.entityStatus;
    }

    public List<String> getNeedBlankFieldList() {
        return this.needBlankFieldList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setBelongMerchantId(String belongMerchantId) {
        this.belongMerchantId = belongMerchantId;
    }

    public void setBelongMerchantId___code(String belongMerchantId___code) {
        this.belongMerchantId___code = belongMerchantId___code;
    }

    public void setBelongMerchantId___name(String belongMerchantId___name) {
        this.belongMerchantId___name = belongMerchantId___name;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode;
    }

    public void setTransactionCurrencyId(String transactionCurrencyId) {
        this.transactionCurrencyId = transactionCurrencyId;
    }

    public void setTransactionCurrencyId___code(String transactionCurrencyId___code) {
        this.transactionCurrencyId___code = transactionCurrencyId___code;
    }

    public void setTransactionCurrencyId___name(String transactionCurrencyId___name) {
        this.transactionCurrencyId___name = transactionCurrencyId___name;
    }

    public void setTaxRateId(String taxRateId) {
        this.taxRateId = taxRateId;
    }

    public void setTaxRateId___code(String taxRateId___code) {
        this.taxRateId___code = taxRateId___code;
    }

    public void setTaxRateId___name(String taxRateId___name) {
        this.taxRateId___name = taxRateId___name;
    }

    public void setDeliveryWarehouseId(Long deliveryWarehouseId) {
        this.deliveryWarehouseId = deliveryWarehouseId;
    }

    public void setDeliveryWarehouseId___code(String deliveryWarehouseId___code) {
        this.deliveryWarehouseId___code = deliveryWarehouseId___code;
    }

    public void setDeliveryWarehouseId___name(String deliveryWarehouseId___name) {
        this.deliveryWarehouseId___name = deliveryWarehouseId___name;
    }

    public void setCreditServiceDayId(Integer creditServiceDayId) {
        this.creditServiceDayId = creditServiceDayId;
    }

    public void setCollectionAgreementId(Long collectionAgreementId) {
        this.collectionAgreementId = collectionAgreementId;
    }

    public void setCollectionAgreementId___code(String collectionAgreementId___code) {
        this.collectionAgreementId___code = collectionAgreementId___code;
    }

    public void setCollectionAgreementId___name(String collectionAgreementId___name) {
        this.collectionAgreementId___name = collectionAgreementId___name;
    }

    public void setSettlementMethodId(Long settlementMethodId) {
        this.settlementMethodId = settlementMethodId;
    }

    public void setSettlementMethodId___code(String settlementMethodId___code) {
        this.settlementMethodId___code = settlementMethodId___code;
    }

    public void setSettlementMethodId___name(String settlementMethodId___name) {
        this.settlementMethodId___name = settlementMethodId___name;
    }

    public void setShipmentMethodId(Long shipmentMethodId) {
        this.shipmentMethodId = shipmentMethodId;
    }

    public void setShipmentMethodId___code(String shipmentMethodId___code) {
        this.shipmentMethodId___code = shipmentMethodId___code;
    }

    public void setShipmentMethodId___name(String shipmentMethodId___name) {
        this.shipmentMethodId___name = shipmentMethodId___name;
    }

    public void setSignBack(Integer signBack) {
        this.signBack = signBack;
    }

    public void setMerchantLevelId(Long merchantLevelId) {
        this.merchantLevelId = merchantLevelId;
    }

    public void setMerchantLevelId___code(String merchantLevelId___code) {
        this.merchantLevelId___code = merchantLevelId___code;
    }

    public void setMerchantLevelId___name(String merchantLevelId___name) {
        this.merchantLevelId___name = merchantLevelId___name;
    }

    public void setExchangeRateTypeId(String exchangeRateTypeId) {
        this.exchangeRateTypeId = exchangeRateTypeId;
    }

    public void setExchangeRateTypeId___code(String exchangeRateTypeId___code) {
        this.exchangeRateTypeId___code = exchangeRateTypeId___code;
    }

    public void setExchangeRateTypeId___name(String exchangeRateTypeId___name) {
        this.exchangeRateTypeId___name = exchangeRateTypeId___name;
    }

    public void setMerchantTypeId(Long merchantTypeId) {
        this.merchantTypeId = merchantTypeId;
    }

    public void setMerchantTypeId___code(String merchantTypeId___code) {
        this.merchantTypeId___code = merchantTypeId___code;
    }

    public void setMerchantTypeId___name(String merchantTypeId___name) {
        this.merchantTypeId___name = merchantTypeId___name;
    }

    public void setOrgDefaultAddress(String orgDefaultAddress) {
        this.orgDefaultAddress = orgDefaultAddress;
    }

    public void setMerchantApplyRangeDetailCharacter(HashMap<String, Object> merchantApplyRangeDetailCharacter) {
        this.merchantApplyRangeDetailCharacter = merchantApplyRangeDetailCharacter;
    }

    public void setCustomExtend(Map<String, Object> customExtend) {
        this.customExtend = customExtend;
    }

    public void setFreezeLink(String freezeLink) {
        this.freezeLink = freezeLink;
    }

    public void setFrozenState(String frozenState) {
        this.frozenState = frozenState;
    }

    public void setIsTradeCustomers(String isTradeCustomers) {
        this.isTradeCustomers = isTradeCustomers;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public void setLayoffId(Long layoffId) {
        this.layoffId = layoffId;
    }

    public void setLayoffId___code(String layoffId___code) {
        this.layoffId___code = layoffId___code;
    }

    public void setLayoffId___name(String layoffId___name) {
        this.layoffId___name = layoffId___name;
    }

    public void setIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
    }

    public void setPriceMarking(Integer priceMarking) {
        this.priceMarking = priceMarking;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setLockTime(Date lockTime) {
        this.lockTime = lockTime;
    }

    public void setLocker(String locker) {
        this.locker = locker;
    }

    public void setLockDate(Date lockDate) {
        this.lockDate = lockDate;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setStoptime(Date stoptime) {
        this.stoptime = stoptime;
    }

    public void setStopstatus(Boolean stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setEntityStatus(UPCEntityStatus entityStatus) {
        this.entityStatus = entityStatus;
    }

    public void setNeedBlankFieldList(List<String> needBlankFieldList) {
        this.needBlankFieldList = needBlankFieldList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantDetailDataDTO)) {
            return false;
        }
        MerchantDetailDataDTO other = (MerchantDetailDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Long this$deliveryWarehouseId = this.getDeliveryWarehouseId();
        Long other$deliveryWarehouseId = other.getDeliveryWarehouseId();
        if (this$deliveryWarehouseId == null ? other$deliveryWarehouseId != null : !((Object)this$deliveryWarehouseId).equals(other$deliveryWarehouseId)) {
            return false;
        }
        Integer this$creditServiceDayId = this.getCreditServiceDayId();
        Integer other$creditServiceDayId = other.getCreditServiceDayId();
        if (this$creditServiceDayId == null ? other$creditServiceDayId != null : !((Object)this$creditServiceDayId).equals(other$creditServiceDayId)) {
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
        Integer this$signBack = this.getSignBack();
        Integer other$signBack = other.getSignBack();
        if (this$signBack == null ? other$signBack != null : !((Object)this$signBack).equals(other$signBack)) {
            return false;
        }
        Long this$merchantLevelId = this.getMerchantLevelId();
        Long other$merchantLevelId = other.getMerchantLevelId();
        if (this$merchantLevelId == null ? other$merchantLevelId != null : !((Object)this$merchantLevelId).equals(other$merchantLevelId)) {
            return false;
        }
        Long this$merchantTypeId = this.getMerchantTypeId();
        Long other$merchantTypeId = other.getMerchantTypeId();
        if (this$merchantTypeId == null ? other$merchantTypeId != null : !((Object)this$merchantTypeId).equals(other$merchantTypeId)) {
            return false;
        }
        Long this$layoffId = this.getLayoffId();
        Long other$layoffId = other.getLayoffId();
        if (this$layoffId == null ? other$layoffId != null : !((Object)this$layoffId).equals(other$layoffId)) {
            return false;
        }
        Boolean this$isCreator = this.getIsCreator();
        Boolean other$isCreator = other.getIsCreator();
        if (this$isCreator == null ? other$isCreator != null : !((Object)this$isCreator).equals(other$isCreator)) {
            return false;
        }
        Integer this$priceMarking = this.getPriceMarking();
        Integer other$priceMarking = other.getPriceMarking();
        if (this$priceMarking == null ? other$priceMarking != null : !((Object)this$priceMarking).equals(other$priceMarking)) {
            return false;
        }
        Long this$creatorId = this.getCreatorId();
        Long other$creatorId = other.getCreatorId();
        if (this$creatorId == null ? other$creatorId != null : !((Object)this$creatorId).equals(other$creatorId)) {
            return false;
        }
        Long this$modifierId = this.getModifierId();
        Long other$modifierId = other.getModifierId();
        if (this$modifierId == null ? other$modifierId != null : !((Object)this$modifierId).equals(other$modifierId)) {
            return false;
        }
        Boolean this$stopstatus = this.getStopstatus();
        Boolean other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$belongMerchantId = this.getBelongMerchantId();
        String other$belongMerchantId = other.getBelongMerchantId();
        if (this$belongMerchantId == null ? other$belongMerchantId != null : !this$belongMerchantId.equals(other$belongMerchantId)) {
            return false;
        }
        String this$belongMerchantId___code = this.getBelongMerchantId___code();
        String other$belongMerchantId___code = other.getBelongMerchantId___code();
        if (this$belongMerchantId___code == null ? other$belongMerchantId___code != null : !this$belongMerchantId___code.equals(other$belongMerchantId___code)) {
            return false;
        }
        String this$belongMerchantId___name = this.getBelongMerchantId___name();
        String other$belongMerchantId___name = other.getBelongMerchantId___name();
        if (this$belongMerchantId___name == null ? other$belongMerchantId___name != null : !this$belongMerchantId___name.equals(other$belongMerchantId___name)) {
            return false;
        }
        String this$searchCode = this.getSearchCode();
        String other$searchCode = other.getSearchCode();
        if (this$searchCode == null ? other$searchCode != null : !this$searchCode.equals(other$searchCode)) {
            return false;
        }
        String this$transactionCurrencyId = this.getTransactionCurrencyId();
        String other$transactionCurrencyId = other.getTransactionCurrencyId();
        if (this$transactionCurrencyId == null ? other$transactionCurrencyId != null : !this$transactionCurrencyId.equals(other$transactionCurrencyId)) {
            return false;
        }
        String this$transactionCurrencyId___code = this.getTransactionCurrencyId___code();
        String other$transactionCurrencyId___code = other.getTransactionCurrencyId___code();
        if (this$transactionCurrencyId___code == null ? other$transactionCurrencyId___code != null : !this$transactionCurrencyId___code.equals(other$transactionCurrencyId___code)) {
            return false;
        }
        String this$transactionCurrencyId___name = this.getTransactionCurrencyId___name();
        String other$transactionCurrencyId___name = other.getTransactionCurrencyId___name();
        if (this$transactionCurrencyId___name == null ? other$transactionCurrencyId___name != null : !this$transactionCurrencyId___name.equals(other$transactionCurrencyId___name)) {
            return false;
        }
        String this$taxRateId = this.getTaxRateId();
        String other$taxRateId = other.getTaxRateId();
        if (this$taxRateId == null ? other$taxRateId != null : !this$taxRateId.equals(other$taxRateId)) {
            return false;
        }
        String this$taxRateId___code = this.getTaxRateId___code();
        String other$taxRateId___code = other.getTaxRateId___code();
        if (this$taxRateId___code == null ? other$taxRateId___code != null : !this$taxRateId___code.equals(other$taxRateId___code)) {
            return false;
        }
        String this$taxRateId___name = this.getTaxRateId___name();
        String other$taxRateId___name = other.getTaxRateId___name();
        if (this$taxRateId___name == null ? other$taxRateId___name != null : !this$taxRateId___name.equals(other$taxRateId___name)) {
            return false;
        }
        String this$deliveryWarehouseId___code = this.getDeliveryWarehouseId___code();
        String other$deliveryWarehouseId___code = other.getDeliveryWarehouseId___code();
        if (this$deliveryWarehouseId___code == null ? other$deliveryWarehouseId___code != null : !this$deliveryWarehouseId___code.equals(other$deliveryWarehouseId___code)) {
            return false;
        }
        String this$deliveryWarehouseId___name = this.getDeliveryWarehouseId___name();
        String other$deliveryWarehouseId___name = other.getDeliveryWarehouseId___name();
        if (this$deliveryWarehouseId___name == null ? other$deliveryWarehouseId___name != null : !this$deliveryWarehouseId___name.equals(other$deliveryWarehouseId___name)) {
            return false;
        }
        String this$collectionAgreementId___code = this.getCollectionAgreementId___code();
        String other$collectionAgreementId___code = other.getCollectionAgreementId___code();
        if (this$collectionAgreementId___code == null ? other$collectionAgreementId___code != null : !this$collectionAgreementId___code.equals(other$collectionAgreementId___code)) {
            return false;
        }
        String this$collectionAgreementId___name = this.getCollectionAgreementId___name();
        String other$collectionAgreementId___name = other.getCollectionAgreementId___name();
        if (this$collectionAgreementId___name == null ? other$collectionAgreementId___name != null : !this$collectionAgreementId___name.equals(other$collectionAgreementId___name)) {
            return false;
        }
        String this$settlementMethodId___code = this.getSettlementMethodId___code();
        String other$settlementMethodId___code = other.getSettlementMethodId___code();
        if (this$settlementMethodId___code == null ? other$settlementMethodId___code != null : !this$settlementMethodId___code.equals(other$settlementMethodId___code)) {
            return false;
        }
        String this$settlementMethodId___name = this.getSettlementMethodId___name();
        String other$settlementMethodId___name = other.getSettlementMethodId___name();
        if (this$settlementMethodId___name == null ? other$settlementMethodId___name != null : !this$settlementMethodId___name.equals(other$settlementMethodId___name)) {
            return false;
        }
        String this$shipmentMethodId___code = this.getShipmentMethodId___code();
        String other$shipmentMethodId___code = other.getShipmentMethodId___code();
        if (this$shipmentMethodId___code == null ? other$shipmentMethodId___code != null : !this$shipmentMethodId___code.equals(other$shipmentMethodId___code)) {
            return false;
        }
        String this$shipmentMethodId___name = this.getShipmentMethodId___name();
        String other$shipmentMethodId___name = other.getShipmentMethodId___name();
        if (this$shipmentMethodId___name == null ? other$shipmentMethodId___name != null : !this$shipmentMethodId___name.equals(other$shipmentMethodId___name)) {
            return false;
        }
        String this$merchantLevelId___code = this.getMerchantLevelId___code();
        String other$merchantLevelId___code = other.getMerchantLevelId___code();
        if (this$merchantLevelId___code == null ? other$merchantLevelId___code != null : !this$merchantLevelId___code.equals(other$merchantLevelId___code)) {
            return false;
        }
        String this$merchantLevelId___name = this.getMerchantLevelId___name();
        String other$merchantLevelId___name = other.getMerchantLevelId___name();
        if (this$merchantLevelId___name == null ? other$merchantLevelId___name != null : !this$merchantLevelId___name.equals(other$merchantLevelId___name)) {
            return false;
        }
        String this$exchangeRateTypeId = this.getExchangeRateTypeId();
        String other$exchangeRateTypeId = other.getExchangeRateTypeId();
        if (this$exchangeRateTypeId == null ? other$exchangeRateTypeId != null : !this$exchangeRateTypeId.equals(other$exchangeRateTypeId)) {
            return false;
        }
        String this$exchangeRateTypeId___code = this.getExchangeRateTypeId___code();
        String other$exchangeRateTypeId___code = other.getExchangeRateTypeId___code();
        if (this$exchangeRateTypeId___code == null ? other$exchangeRateTypeId___code != null : !this$exchangeRateTypeId___code.equals(other$exchangeRateTypeId___code)) {
            return false;
        }
        String this$exchangeRateTypeId___name = this.getExchangeRateTypeId___name();
        String other$exchangeRateTypeId___name = other.getExchangeRateTypeId___name();
        if (this$exchangeRateTypeId___name == null ? other$exchangeRateTypeId___name != null : !this$exchangeRateTypeId___name.equals(other$exchangeRateTypeId___name)) {
            return false;
        }
        String this$merchantTypeId___code = this.getMerchantTypeId___code();
        String other$merchantTypeId___code = other.getMerchantTypeId___code();
        if (this$merchantTypeId___code == null ? other$merchantTypeId___code != null : !this$merchantTypeId___code.equals(other$merchantTypeId___code)) {
            return false;
        }
        String this$merchantTypeId___name = this.getMerchantTypeId___name();
        String other$merchantTypeId___name = other.getMerchantTypeId___name();
        if (this$merchantTypeId___name == null ? other$merchantTypeId___name != null : !this$merchantTypeId___name.equals(other$merchantTypeId___name)) {
            return false;
        }
        String this$orgDefaultAddress = this.getOrgDefaultAddress();
        String other$orgDefaultAddress = other.getOrgDefaultAddress();
        if (this$orgDefaultAddress == null ? other$orgDefaultAddress != null : !this$orgDefaultAddress.equals(other$orgDefaultAddress)) {
            return false;
        }
        HashMap<String, Object> this$merchantApplyRangeDetailCharacter = this.getMerchantApplyRangeDetailCharacter();
        HashMap<String, Object> other$merchantApplyRangeDetailCharacter = other.getMerchantApplyRangeDetailCharacter();
        if (this$merchantApplyRangeDetailCharacter == null ? other$merchantApplyRangeDetailCharacter != null : !((Object)this$merchantApplyRangeDetailCharacter).equals(other$merchantApplyRangeDetailCharacter)) {
            return false;
        }
        Map<String, Object> this$customExtend = this.getCustomExtend();
        Map<String, Object> other$customExtend = other.getCustomExtend();
        if (this$customExtend == null ? other$customExtend != null : !((Object)this$customExtend).equals(other$customExtend)) {
            return false;
        }
        String this$freezeLink = this.getFreezeLink();
        String other$freezeLink = other.getFreezeLink();
        if (this$freezeLink == null ? other$freezeLink != null : !this$freezeLink.equals(other$freezeLink)) {
            return false;
        }
        String this$frozenState = this.getFrozenState();
        String other$frozenState = other.getFrozenState();
        if (this$frozenState == null ? other$frozenState != null : !this$frozenState.equals(other$frozenState)) {
            return false;
        }
        String this$isTradeCustomers = this.getIsTradeCustomers();
        String other$isTradeCustomers = other.getIsTradeCustomers();
        if (this$isTradeCustomers == null ? other$isTradeCustomers != null : !this$isTradeCustomers.equals(other$isTradeCustomers)) {
            return false;
        }
        String this$payWay = this.getPayWay();
        String other$payWay = other.getPayWay();
        if (this$payWay == null ? other$payWay != null : !this$payWay.equals(other$payWay)) {
            return false;
        }
        String this$layoffId___code = this.getLayoffId___code();
        String other$layoffId___code = other.getLayoffId___code();
        if (this$layoffId___code == null ? other$layoffId___code != null : !this$layoffId___code.equals(other$layoffId___code)) {
            return false;
        }
        String this$layoffId___name = this.getLayoffId___name();
        String other$layoffId___name = other.getLayoffId___name();
        if (this$layoffId___name == null ? other$layoffId___name != null : !this$layoffId___name.equals(other$layoffId___name)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        Date this$lockTime = this.getLockTime();
        Date other$lockTime = other.getLockTime();
        if (this$lockTime == null ? other$lockTime != null : !((Object)this$lockTime).equals(other$lockTime)) {
            return false;
        }
        String this$locker = this.getLocker();
        String other$locker = other.getLocker();
        if (this$locker == null ? other$locker != null : !this$locker.equals(other$locker)) {
            return false;
        }
        Date this$lockDate = this.getLockDate();
        Date other$lockDate = other.getLockDate();
        if (this$lockDate == null ? other$lockDate != null : !((Object)this$lockDate).equals(other$lockDate)) {
            return false;
        }
        String this$creator = this.getCreator();
        String other$creator = other.getCreator();
        if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) {
            return false;
        }
        Date this$modifyTime = this.getModifyTime();
        Date other$modifyTime = other.getModifyTime();
        if (this$modifyTime == null ? other$modifyTime != null : !((Object)this$modifyTime).equals(other$modifyTime)) {
            return false;
        }
        Date this$modifyDate = this.getModifyDate();
        Date other$modifyDate = other.getModifyDate();
        if (this$modifyDate == null ? other$modifyDate != null : !((Object)this$modifyDate).equals(other$modifyDate)) {
            return false;
        }
        Date this$createTime = this.getCreateTime();
        Date other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !((Object)this$createTime).equals(other$createTime)) {
            return false;
        }
        String this$modifier = this.getModifier();
        String other$modifier = other.getModifier();
        if (this$modifier == null ? other$modifier != null : !this$modifier.equals(other$modifier)) {
            return false;
        }
        Date this$createDate = this.getCreateDate();
        Date other$createDate = other.getCreateDate();
        if (this$createDate == null ? other$createDate != null : !((Object)this$createDate).equals(other$createDate)) {
            return false;
        }
        Date this$stoptime = this.getStoptime();
        Date other$stoptime = other.getStoptime();
        if (this$stoptime == null ? other$stoptime != null : !((Object)this$stoptime).equals(other$stoptime)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
            return false;
        }
        UPCEntityStatus this$entityStatus = this.getEntityStatus();
        UPCEntityStatus other$entityStatus = other.getEntityStatus();
        if (this$entityStatus == null ? other$entityStatus != null : !((Object)((Object)this$entityStatus)).equals((Object)other$entityStatus)) {
            return false;
        }
        List<String> this$needBlankFieldList = this.getNeedBlankFieldList();
        List<String> other$needBlankFieldList = other.getNeedBlankFieldList();
        return !(this$needBlankFieldList == null ? other$needBlankFieldList != null : !((Object)this$needBlankFieldList).equals(other$needBlankFieldList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantDetailDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $deliveryWarehouseId = this.getDeliveryWarehouseId();
        result = result * 59 + ($deliveryWarehouseId == null ? 43 : ((Object)$deliveryWarehouseId).hashCode());
        Integer $creditServiceDayId = this.getCreditServiceDayId();
        result = result * 59 + ($creditServiceDayId == null ? 43 : ((Object)$creditServiceDayId).hashCode());
        Long $collectionAgreementId = this.getCollectionAgreementId();
        result = result * 59 + ($collectionAgreementId == null ? 43 : ((Object)$collectionAgreementId).hashCode());
        Long $settlementMethodId = this.getSettlementMethodId();
        result = result * 59 + ($settlementMethodId == null ? 43 : ((Object)$settlementMethodId).hashCode());
        Long $shipmentMethodId = this.getShipmentMethodId();
        result = result * 59 + ($shipmentMethodId == null ? 43 : ((Object)$shipmentMethodId).hashCode());
        Integer $signBack = this.getSignBack();
        result = result * 59 + ($signBack == null ? 43 : ((Object)$signBack).hashCode());
        Long $merchantLevelId = this.getMerchantLevelId();
        result = result * 59 + ($merchantLevelId == null ? 43 : ((Object)$merchantLevelId).hashCode());
        Long $merchantTypeId = this.getMerchantTypeId();
        result = result * 59 + ($merchantTypeId == null ? 43 : ((Object)$merchantTypeId).hashCode());
        Long $layoffId = this.getLayoffId();
        result = result * 59 + ($layoffId == null ? 43 : ((Object)$layoffId).hashCode());
        Boolean $isCreator = this.getIsCreator();
        result = result * 59 + ($isCreator == null ? 43 : ((Object)$isCreator).hashCode());
        Integer $priceMarking = this.getPriceMarking();
        result = result * 59 + ($priceMarking == null ? 43 : ((Object)$priceMarking).hashCode());
        Long $creatorId = this.getCreatorId();
        result = result * 59 + ($creatorId == null ? 43 : ((Object)$creatorId).hashCode());
        Long $modifierId = this.getModifierId();
        result = result * 59 + ($modifierId == null ? 43 : ((Object)$modifierId).hashCode());
        Boolean $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $belongMerchantId = this.getBelongMerchantId();
        result = result * 59 + ($belongMerchantId == null ? 43 : $belongMerchantId.hashCode());
        String $belongMerchantId___code = this.getBelongMerchantId___code();
        result = result * 59 + ($belongMerchantId___code == null ? 43 : $belongMerchantId___code.hashCode());
        String $belongMerchantId___name = this.getBelongMerchantId___name();
        result = result * 59 + ($belongMerchantId___name == null ? 43 : $belongMerchantId___name.hashCode());
        String $searchCode = this.getSearchCode();
        result = result * 59 + ($searchCode == null ? 43 : $searchCode.hashCode());
        String $transactionCurrencyId = this.getTransactionCurrencyId();
        result = result * 59 + ($transactionCurrencyId == null ? 43 : $transactionCurrencyId.hashCode());
        String $transactionCurrencyId___code = this.getTransactionCurrencyId___code();
        result = result * 59 + ($transactionCurrencyId___code == null ? 43 : $transactionCurrencyId___code.hashCode());
        String $transactionCurrencyId___name = this.getTransactionCurrencyId___name();
        result = result * 59 + ($transactionCurrencyId___name == null ? 43 : $transactionCurrencyId___name.hashCode());
        String $taxRateId = this.getTaxRateId();
        result = result * 59 + ($taxRateId == null ? 43 : $taxRateId.hashCode());
        String $taxRateId___code = this.getTaxRateId___code();
        result = result * 59 + ($taxRateId___code == null ? 43 : $taxRateId___code.hashCode());
        String $taxRateId___name = this.getTaxRateId___name();
        result = result * 59 + ($taxRateId___name == null ? 43 : $taxRateId___name.hashCode());
        String $deliveryWarehouseId___code = this.getDeliveryWarehouseId___code();
        result = result * 59 + ($deliveryWarehouseId___code == null ? 43 : $deliveryWarehouseId___code.hashCode());
        String $deliveryWarehouseId___name = this.getDeliveryWarehouseId___name();
        result = result * 59 + ($deliveryWarehouseId___name == null ? 43 : $deliveryWarehouseId___name.hashCode());
        String $collectionAgreementId___code = this.getCollectionAgreementId___code();
        result = result * 59 + ($collectionAgreementId___code == null ? 43 : $collectionAgreementId___code.hashCode());
        String $collectionAgreementId___name = this.getCollectionAgreementId___name();
        result = result * 59 + ($collectionAgreementId___name == null ? 43 : $collectionAgreementId___name.hashCode());
        String $settlementMethodId___code = this.getSettlementMethodId___code();
        result = result * 59 + ($settlementMethodId___code == null ? 43 : $settlementMethodId___code.hashCode());
        String $settlementMethodId___name = this.getSettlementMethodId___name();
        result = result * 59 + ($settlementMethodId___name == null ? 43 : $settlementMethodId___name.hashCode());
        String $shipmentMethodId___code = this.getShipmentMethodId___code();
        result = result * 59 + ($shipmentMethodId___code == null ? 43 : $shipmentMethodId___code.hashCode());
        String $shipmentMethodId___name = this.getShipmentMethodId___name();
        result = result * 59 + ($shipmentMethodId___name == null ? 43 : $shipmentMethodId___name.hashCode());
        String $merchantLevelId___code = this.getMerchantLevelId___code();
        result = result * 59 + ($merchantLevelId___code == null ? 43 : $merchantLevelId___code.hashCode());
        String $merchantLevelId___name = this.getMerchantLevelId___name();
        result = result * 59 + ($merchantLevelId___name == null ? 43 : $merchantLevelId___name.hashCode());
        String $exchangeRateTypeId = this.getExchangeRateTypeId();
        result = result * 59 + ($exchangeRateTypeId == null ? 43 : $exchangeRateTypeId.hashCode());
        String $exchangeRateTypeId___code = this.getExchangeRateTypeId___code();
        result = result * 59 + ($exchangeRateTypeId___code == null ? 43 : $exchangeRateTypeId___code.hashCode());
        String $exchangeRateTypeId___name = this.getExchangeRateTypeId___name();
        result = result * 59 + ($exchangeRateTypeId___name == null ? 43 : $exchangeRateTypeId___name.hashCode());
        String $merchantTypeId___code = this.getMerchantTypeId___code();
        result = result * 59 + ($merchantTypeId___code == null ? 43 : $merchantTypeId___code.hashCode());
        String $merchantTypeId___name = this.getMerchantTypeId___name();
        result = result * 59 + ($merchantTypeId___name == null ? 43 : $merchantTypeId___name.hashCode());
        String $orgDefaultAddress = this.getOrgDefaultAddress();
        result = result * 59 + ($orgDefaultAddress == null ? 43 : $orgDefaultAddress.hashCode());
        HashMap<String, Object> $merchantApplyRangeDetailCharacter = this.getMerchantApplyRangeDetailCharacter();
        result = result * 59 + ($merchantApplyRangeDetailCharacter == null ? 43 : ((Object)$merchantApplyRangeDetailCharacter).hashCode());
        Map<String, Object> $customExtend = this.getCustomExtend();
        result = result * 59 + ($customExtend == null ? 43 : ((Object)$customExtend).hashCode());
        String $freezeLink = this.getFreezeLink();
        result = result * 59 + ($freezeLink == null ? 43 : $freezeLink.hashCode());
        String $frozenState = this.getFrozenState();
        result = result * 59 + ($frozenState == null ? 43 : $frozenState.hashCode());
        String $isTradeCustomers = this.getIsTradeCustomers();
        result = result * 59 + ($isTradeCustomers == null ? 43 : $isTradeCustomers.hashCode());
        String $payWay = this.getPayWay();
        result = result * 59 + ($payWay == null ? 43 : $payWay.hashCode());
        String $layoffId___code = this.getLayoffId___code();
        result = result * 59 + ($layoffId___code == null ? 43 : $layoffId___code.hashCode());
        String $layoffId___name = this.getLayoffId___name();
        result = result * 59 + ($layoffId___name == null ? 43 : $layoffId___name.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        Date $lockTime = this.getLockTime();
        result = result * 59 + ($lockTime == null ? 43 : ((Object)$lockTime).hashCode());
        String $locker = this.getLocker();
        result = result * 59 + ($locker == null ? 43 : $locker.hashCode());
        Date $lockDate = this.getLockDate();
        result = result * 59 + ($lockDate == null ? 43 : ((Object)$lockDate).hashCode());
        String $creator = this.getCreator();
        result = result * 59 + ($creator == null ? 43 : $creator.hashCode());
        Date $modifyTime = this.getModifyTime();
        result = result * 59 + ($modifyTime == null ? 43 : ((Object)$modifyTime).hashCode());
        Date $modifyDate = this.getModifyDate();
        result = result * 59 + ($modifyDate == null ? 43 : ((Object)$modifyDate).hashCode());
        Date $createTime = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : ((Object)$createTime).hashCode());
        String $modifier = this.getModifier();
        result = result * 59 + ($modifier == null ? 43 : $modifier.hashCode());
        Date $createDate = this.getCreateDate();
        result = result * 59 + ($createDate == null ? 43 : ((Object)$createDate).hashCode());
        Date $stoptime = this.getStoptime();
        result = result * 59 + ($stoptime == null ? 43 : ((Object)$stoptime).hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        List<String> $needBlankFieldList = this.getNeedBlankFieldList();
        result = result * 59 + ($needBlankFieldList == null ? 43 : ((Object)$needBlankFieldList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantDetailDataDTO(id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", belongMerchantId=" + this.getBelongMerchantId() + ", belongMerchantId___code=" + this.getBelongMerchantId___code() + ", belongMerchantId___name=" + this.getBelongMerchantId___name() + ", searchCode=" + this.getSearchCode() + ", transactionCurrencyId=" + this.getTransactionCurrencyId() + ", transactionCurrencyId___code=" + this.getTransactionCurrencyId___code() + ", transactionCurrencyId___name=" + this.getTransactionCurrencyId___name() + ", taxRateId=" + this.getTaxRateId() + ", taxRateId___code=" + this.getTaxRateId___code() + ", taxRateId___name=" + this.getTaxRateId___name() + ", deliveryWarehouseId=" + this.getDeliveryWarehouseId() + ", deliveryWarehouseId___code=" + this.getDeliveryWarehouseId___code() + ", deliveryWarehouseId___name=" + this.getDeliveryWarehouseId___name() + ", creditServiceDayId=" + this.getCreditServiceDayId() + ", collectionAgreementId=" + this.getCollectionAgreementId() + ", collectionAgreementId___code=" + this.getCollectionAgreementId___code() + ", collectionAgreementId___name=" + this.getCollectionAgreementId___name() + ", settlementMethodId=" + this.getSettlementMethodId() + ", settlementMethodId___code=" + this.getSettlementMethodId___code() + ", settlementMethodId___name=" + this.getSettlementMethodId___name() + ", shipmentMethodId=" + this.getShipmentMethodId() + ", shipmentMethodId___code=" + this.getShipmentMethodId___code() + ", shipmentMethodId___name=" + this.getShipmentMethodId___name() + ", signBack=" + this.getSignBack() + ", merchantLevelId=" + this.getMerchantLevelId() + ", merchantLevelId___code=" + this.getMerchantLevelId___code() + ", merchantLevelId___name=" + this.getMerchantLevelId___name() + ", exchangeRateTypeId=" + this.getExchangeRateTypeId() + ", exchangeRateTypeId___code=" + this.getExchangeRateTypeId___code() + ", exchangeRateTypeId___name=" + this.getExchangeRateTypeId___name() + ", merchantTypeId=" + this.getMerchantTypeId() + ", merchantTypeId___code=" + this.getMerchantTypeId___code() + ", merchantTypeId___name=" + this.getMerchantTypeId___name() + ", orgDefaultAddress=" + this.getOrgDefaultAddress() + ", merchantApplyRangeDetailCharacter=" + this.getMerchantApplyRangeDetailCharacter() + ", customExtend=" + this.getCustomExtend() + ", freezeLink=" + this.getFreezeLink() + ", frozenState=" + this.getFrozenState() + ", isTradeCustomers=" + this.getIsTradeCustomers() + ", payWay=" + this.getPayWay() + ", layoffId=" + this.getLayoffId() + ", layoffId___code=" + this.getLayoffId___code() + ", layoffId___name=" + this.getLayoffId___name() + ", isCreator=" + this.getIsCreator() + ", priceMarking=" + this.getPriceMarking() + ", erpCode=" + this.getErpCode() + ", lockTime=" + this.getLockTime() + ", locker=" + this.getLocker() + ", lockDate=" + this.getLockDate() + ", creator=" + this.getCreator() + ", modifyTime=" + this.getModifyTime() + ", modifyDate=" + this.getModifyDate() + ", createTime=" + this.getCreateTime() + ", modifier=" + this.getModifier() + ", creatorId=" + this.getCreatorId() + ", modifierId=" + this.getModifierId() + ", createDate=" + this.getCreateDate() + ", stoptime=" + this.getStoptime() + ", stopstatus=" + this.getStopstatus() + ", pubts=" + this.getPubts() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ", needBlankFieldList=" + this.getNeedBlankFieldList() + ")";
    }
}

