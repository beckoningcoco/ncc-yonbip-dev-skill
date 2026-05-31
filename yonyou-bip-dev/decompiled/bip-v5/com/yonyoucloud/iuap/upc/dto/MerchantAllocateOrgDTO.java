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
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantAllocateOrgDTO
implements Serializable {
    private Long merchantId;
    private List<String> orgIds;
    private String isTradeCustomers;
    private Boolean stopStatus;

    public Long getMerchantId() {
        return this.merchantId;
    }

    public List<String> getOrgIds() {
        return this.orgIds;
    }

    public String getIsTradeCustomers() {
        return this.isTradeCustomers;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setOrgIds(List<String> orgIds) {
        this.orgIds = orgIds;
    }

    public void setIsTradeCustomers(String isTradeCustomers) {
        this.isTradeCustomers = isTradeCustomers;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantAllocateOrgDTO)) {
            return false;
        }
        MerchantAllocateOrgDTO other = (MerchantAllocateOrgDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        List<String> this$orgIds = this.getOrgIds();
        List<String> other$orgIds = other.getOrgIds();
        if (this$orgIds == null ? other$orgIds != null : !((Object)this$orgIds).equals(other$orgIds)) {
            return false;
        }
        String this$isTradeCustomers = this.getIsTradeCustomers();
        String other$isTradeCustomers = other.getIsTradeCustomers();
        return !(this$isTradeCustomers == null ? other$isTradeCustomers != null : !this$isTradeCustomers.equals(other$isTradeCustomers));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantAllocateOrgDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        List<String> $orgIds = this.getOrgIds();
        result = result * 59 + ($orgIds == null ? 43 : ((Object)$orgIds).hashCode());
        String $isTradeCustomers = this.getIsTradeCustomers();
        result = result * 59 + ($isTradeCustomers == null ? 43 : $isTradeCustomers.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantAllocateOrgDTO(merchantId=" + this.getMerchantId() + ", orgIds=" + this.getOrgIds() + ", isTradeCustomers=" + this.getIsTradeCustomers() + ", stopStatus=" + this.getStopStatus() + ")";
    }
}

