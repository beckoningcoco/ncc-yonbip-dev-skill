/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseDaoModel;

public class SettleMethodContrastModel
extends BaseDaoModel {
    private String orgId;
    private Long storeId;
    private Long onlineShopId;
    private Long settleMethodId;
    private String currency;
    private String bank;
    private String openBank;
    private String bankAccountId;
    private String cashAccountId;
    private Boolean isDefault;
    private Integer order;

    public String getOrgId() {
        return this.orgId;
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public Long getOnlineShopId() {
        return this.onlineShopId;
    }

    public Long getSettleMethodId() {
        return this.settleMethodId;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getBank() {
        return this.bank;
    }

    public String getOpenBank() {
        return this.openBank;
    }

    public String getBankAccountId() {
        return this.bankAccountId;
    }

    public String getCashAccountId() {
        return this.cashAccountId;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Integer getOrder() {
        return this.order;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public void setOnlineShopId(Long onlineShopId) {
        this.onlineShopId = onlineShopId;
    }

    public void setSettleMethodId(Long settleMethodId) {
        this.settleMethodId = settleMethodId;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public void setCashAccountId(String cashAccountId) {
        this.cashAccountId = cashAccountId;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SettleMethodContrastModel)) {
            return false;
        }
        SettleMethodContrastModel other = (SettleMethodContrastModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$storeId = this.getStoreId();
        Long other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !((Object)this$storeId).equals(other$storeId)) {
            return false;
        }
        Long this$onlineShopId = this.getOnlineShopId();
        Long other$onlineShopId = other.getOnlineShopId();
        if (this$onlineShopId == null ? other$onlineShopId != null : !((Object)this$onlineShopId).equals(other$onlineShopId)) {
            return false;
        }
        Long this$settleMethodId = this.getSettleMethodId();
        Long other$settleMethodId = other.getSettleMethodId();
        if (this$settleMethodId == null ? other$settleMethodId != null : !((Object)this$settleMethodId).equals(other$settleMethodId)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$currency = this.getCurrency();
        String other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) {
            return false;
        }
        String this$bank = this.getBank();
        String other$bank = other.getBank();
        if (this$bank == null ? other$bank != null : !this$bank.equals(other$bank)) {
            return false;
        }
        String this$openBank = this.getOpenBank();
        String other$openBank = other.getOpenBank();
        if (this$openBank == null ? other$openBank != null : !this$openBank.equals(other$openBank)) {
            return false;
        }
        String this$bankAccountId = this.getBankAccountId();
        String other$bankAccountId = other.getBankAccountId();
        if (this$bankAccountId == null ? other$bankAccountId != null : !this$bankAccountId.equals(other$bankAccountId)) {
            return false;
        }
        String this$cashAccountId = this.getCashAccountId();
        String other$cashAccountId = other.getCashAccountId();
        return !(this$cashAccountId == null ? other$cashAccountId != null : !this$cashAccountId.equals(other$cashAccountId));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SettleMethodContrastModel;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $storeId = this.getStoreId();
        result = result * 59 + ($storeId == null ? 43 : ((Object)$storeId).hashCode());
        Long $onlineShopId = this.getOnlineShopId();
        result = result * 59 + ($onlineShopId == null ? 43 : ((Object)$onlineShopId).hashCode());
        Long $settleMethodId = this.getSettleMethodId();
        result = result * 59 + ($settleMethodId == null ? 43 : ((Object)$settleMethodId).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $currency = this.getCurrency();
        result = result * 59 + ($currency == null ? 43 : $currency.hashCode());
        String $bank = this.getBank();
        result = result * 59 + ($bank == null ? 43 : $bank.hashCode());
        String $openBank = this.getOpenBank();
        result = result * 59 + ($openBank == null ? 43 : $openBank.hashCode());
        String $bankAccountId = this.getBankAccountId();
        result = result * 59 + ($bankAccountId == null ? 43 : $bankAccountId.hashCode());
        String $cashAccountId = this.getCashAccountId();
        result = result * 59 + ($cashAccountId == null ? 43 : $cashAccountId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "SettleMethodContrastModel(orgId=" + this.getOrgId() + ", storeId=" + this.getStoreId() + ", onlineShopId=" + this.getOnlineShopId() + ", settleMethodId=" + this.getSettleMethodId() + ", currency=" + this.getCurrency() + ", bank=" + this.getBank() + ", openBank=" + this.getOpenBank() + ", bankAccountId=" + this.getBankAccountId() + ", cashAccountId=" + this.getCashAccountId() + ", isDefault=" + this.getIsDefault() + ", order=" + this.getOrder() + ")";
    }
}

