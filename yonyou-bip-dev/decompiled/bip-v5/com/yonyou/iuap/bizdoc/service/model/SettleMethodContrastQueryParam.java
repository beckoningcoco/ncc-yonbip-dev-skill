/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseQueryParam;
import java.util.List;

public class SettleMethodContrastQueryParam
extends BaseQueryParam {
    private String bankAccountId;
    private List<String> bankAccountIds;
    private String cashAccountId;
    private List<String> cashAccountIds;
    private String orgId;
    private List<String> orgIds;
    private Long settleMethodId;
    private List<Long> settleMethodIds;
    private Long onlineShopId;
    private List<Long> onlineShopIds;
    private Long storeId;
    private List<Long> storeIds;
    private String currencyId;
    private List<String> currencyIds;

    public String getBankAccountId() {
        return this.bankAccountId;
    }

    public List<String> getBankAccountIds() {
        return this.bankAccountIds;
    }

    public String getCashAccountId() {
        return this.cashAccountId;
    }

    public List<String> getCashAccountIds() {
        return this.cashAccountIds;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public List<String> getOrgIds() {
        return this.orgIds;
    }

    public Long getSettleMethodId() {
        return this.settleMethodId;
    }

    public List<Long> getSettleMethodIds() {
        return this.settleMethodIds;
    }

    public Long getOnlineShopId() {
        return this.onlineShopId;
    }

    public List<Long> getOnlineShopIds() {
        return this.onlineShopIds;
    }

    public Long getStoreId() {
        return this.storeId;
    }

    public List<Long> getStoreIds() {
        return this.storeIds;
    }

    public String getCurrencyId() {
        return this.currencyId;
    }

    public List<String> getCurrencyIds() {
        return this.currencyIds;
    }

    public void setBankAccountId(String bankAccountId) {
        this.bankAccountId = bankAccountId;
    }

    public void setBankAccountIds(List<String> bankAccountIds) {
        this.bankAccountIds = bankAccountIds;
    }

    public void setCashAccountId(String cashAccountId) {
        this.cashAccountId = cashAccountId;
    }

    public void setCashAccountIds(List<String> cashAccountIds) {
        this.cashAccountIds = cashAccountIds;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgIds(List<String> orgIds) {
        this.orgIds = orgIds;
    }

    public void setSettleMethodId(Long settleMethodId) {
        this.settleMethodId = settleMethodId;
    }

    public void setSettleMethodIds(List<Long> settleMethodIds) {
        this.settleMethodIds = settleMethodIds;
    }

    public void setOnlineShopId(Long onlineShopId) {
        this.onlineShopId = onlineShopId;
    }

    public void setOnlineShopIds(List<Long> onlineShopIds) {
        this.onlineShopIds = onlineShopIds;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public void setStoreIds(List<Long> storeIds) {
        this.storeIds = storeIds;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public void setCurrencyIds(List<String> currencyIds) {
        this.currencyIds = currencyIds;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SettleMethodContrastQueryParam)) {
            return false;
        }
        SettleMethodContrastQueryParam other = (SettleMethodContrastQueryParam)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$settleMethodId = this.getSettleMethodId();
        Long other$settleMethodId = other.getSettleMethodId();
        if (this$settleMethodId == null ? other$settleMethodId != null : !((Object)this$settleMethodId).equals(other$settleMethodId)) {
            return false;
        }
        Long this$onlineShopId = this.getOnlineShopId();
        Long other$onlineShopId = other.getOnlineShopId();
        if (this$onlineShopId == null ? other$onlineShopId != null : !((Object)this$onlineShopId).equals(other$onlineShopId)) {
            return false;
        }
        Long this$storeId = this.getStoreId();
        Long other$storeId = other.getStoreId();
        if (this$storeId == null ? other$storeId != null : !((Object)this$storeId).equals(other$storeId)) {
            return false;
        }
        String this$bankAccountId = this.getBankAccountId();
        String other$bankAccountId = other.getBankAccountId();
        if (this$bankAccountId == null ? other$bankAccountId != null : !this$bankAccountId.equals(other$bankAccountId)) {
            return false;
        }
        List<String> this$bankAccountIds = this.getBankAccountIds();
        List<String> other$bankAccountIds = other.getBankAccountIds();
        if (this$bankAccountIds == null ? other$bankAccountIds != null : !((Object)this$bankAccountIds).equals(other$bankAccountIds)) {
            return false;
        }
        String this$cashAccountId = this.getCashAccountId();
        String other$cashAccountId = other.getCashAccountId();
        if (this$cashAccountId == null ? other$cashAccountId != null : !this$cashAccountId.equals(other$cashAccountId)) {
            return false;
        }
        List<String> this$cashAccountIds = this.getCashAccountIds();
        List<String> other$cashAccountIds = other.getCashAccountIds();
        if (this$cashAccountIds == null ? other$cashAccountIds != null : !((Object)this$cashAccountIds).equals(other$cashAccountIds)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        List<String> this$orgIds = this.getOrgIds();
        List<String> other$orgIds = other.getOrgIds();
        if (this$orgIds == null ? other$orgIds != null : !((Object)this$orgIds).equals(other$orgIds)) {
            return false;
        }
        List<Long> this$settleMethodIds = this.getSettleMethodIds();
        List<Long> other$settleMethodIds = other.getSettleMethodIds();
        if (this$settleMethodIds == null ? other$settleMethodIds != null : !((Object)this$settleMethodIds).equals(other$settleMethodIds)) {
            return false;
        }
        List<Long> this$onlineShopIds = this.getOnlineShopIds();
        List<Long> other$onlineShopIds = other.getOnlineShopIds();
        if (this$onlineShopIds == null ? other$onlineShopIds != null : !((Object)this$onlineShopIds).equals(other$onlineShopIds)) {
            return false;
        }
        List<Long> this$storeIds = this.getStoreIds();
        List<Long> other$storeIds = other.getStoreIds();
        if (this$storeIds == null ? other$storeIds != null : !((Object)this$storeIds).equals(other$storeIds)) {
            return false;
        }
        String this$currencyId = this.getCurrencyId();
        String other$currencyId = other.getCurrencyId();
        if (this$currencyId == null ? other$currencyId != null : !this$currencyId.equals(other$currencyId)) {
            return false;
        }
        List<String> this$currencyIds = this.getCurrencyIds();
        List<String> other$currencyIds = other.getCurrencyIds();
        return !(this$currencyIds == null ? other$currencyIds != null : !((Object)this$currencyIds).equals(other$currencyIds));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SettleMethodContrastQueryParam;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $settleMethodId = this.getSettleMethodId();
        result = result * 59 + ($settleMethodId == null ? 43 : ((Object)$settleMethodId).hashCode());
        Long $onlineShopId = this.getOnlineShopId();
        result = result * 59 + ($onlineShopId == null ? 43 : ((Object)$onlineShopId).hashCode());
        Long $storeId = this.getStoreId();
        result = result * 59 + ($storeId == null ? 43 : ((Object)$storeId).hashCode());
        String $bankAccountId = this.getBankAccountId();
        result = result * 59 + ($bankAccountId == null ? 43 : $bankAccountId.hashCode());
        List<String> $bankAccountIds = this.getBankAccountIds();
        result = result * 59 + ($bankAccountIds == null ? 43 : ((Object)$bankAccountIds).hashCode());
        String $cashAccountId = this.getCashAccountId();
        result = result * 59 + ($cashAccountId == null ? 43 : $cashAccountId.hashCode());
        List<String> $cashAccountIds = this.getCashAccountIds();
        result = result * 59 + ($cashAccountIds == null ? 43 : ((Object)$cashAccountIds).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        List<String> $orgIds = this.getOrgIds();
        result = result * 59 + ($orgIds == null ? 43 : ((Object)$orgIds).hashCode());
        List<Long> $settleMethodIds = this.getSettleMethodIds();
        result = result * 59 + ($settleMethodIds == null ? 43 : ((Object)$settleMethodIds).hashCode());
        List<Long> $onlineShopIds = this.getOnlineShopIds();
        result = result * 59 + ($onlineShopIds == null ? 43 : ((Object)$onlineShopIds).hashCode());
        List<Long> $storeIds = this.getStoreIds();
        result = result * 59 + ($storeIds == null ? 43 : ((Object)$storeIds).hashCode());
        String $currencyId = this.getCurrencyId();
        result = result * 59 + ($currencyId == null ? 43 : $currencyId.hashCode());
        List<String> $currencyIds = this.getCurrencyIds();
        result = result * 59 + ($currencyIds == null ? 43 : ((Object)$currencyIds).hashCode());
        return result;
    }

    public String toString() {
        return "SettleMethodContrastQueryParam(bankAccountId=" + this.getBankAccountId() + ", bankAccountIds=" + this.getBankAccountIds() + ", cashAccountId=" + this.getCashAccountId() + ", cashAccountIds=" + this.getCashAccountIds() + ", orgId=" + this.getOrgId() + ", orgIds=" + this.getOrgIds() + ", settleMethodId=" + this.getSettleMethodId() + ", settleMethodIds=" + this.getSettleMethodIds() + ", onlineShopId=" + this.getOnlineShopId() + ", onlineShopIds=" + this.getOnlineShopIds() + ", storeId=" + this.getStoreId() + ", storeIds=" + this.getStoreIds() + ", currencyId=" + this.getCurrencyId() + ", currencyIds=" + this.getCurrencyIds() + ")";
    }
}

