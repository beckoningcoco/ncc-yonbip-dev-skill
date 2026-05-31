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
public class TransferShopMerchantDTO
implements Serializable {
    private List<Long> merchantIdList;
    private String targetOrgId;
    private Long customerLevelId;
    private Long saleAreaId;

    public List<Long> getMerchantIdList() {
        return this.merchantIdList;
    }

    public String getTargetOrgId() {
        return this.targetOrgId;
    }

    public Long getCustomerLevelId() {
        return this.customerLevelId;
    }

    public Long getSaleAreaId() {
        return this.saleAreaId;
    }

    public void setMerchantIdList(List<Long> merchantIdList) {
        this.merchantIdList = merchantIdList;
    }

    public void setTargetOrgId(String targetOrgId) {
        this.targetOrgId = targetOrgId;
    }

    public void setCustomerLevelId(Long customerLevelId) {
        this.customerLevelId = customerLevelId;
    }

    public void setSaleAreaId(Long saleAreaId) {
        this.saleAreaId = saleAreaId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TransferShopMerchantDTO)) {
            return false;
        }
        TransferShopMerchantDTO other = (TransferShopMerchantDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$customerLevelId = this.getCustomerLevelId();
        Long other$customerLevelId = other.getCustomerLevelId();
        if (this$customerLevelId == null ? other$customerLevelId != null : !((Object)this$customerLevelId).equals(other$customerLevelId)) {
            return false;
        }
        Long this$saleAreaId = this.getSaleAreaId();
        Long other$saleAreaId = other.getSaleAreaId();
        if (this$saleAreaId == null ? other$saleAreaId != null : !((Object)this$saleAreaId).equals(other$saleAreaId)) {
            return false;
        }
        List<Long> this$merchantIdList = this.getMerchantIdList();
        List<Long> other$merchantIdList = other.getMerchantIdList();
        if (this$merchantIdList == null ? other$merchantIdList != null : !((Object)this$merchantIdList).equals(other$merchantIdList)) {
            return false;
        }
        String this$targetOrgId = this.getTargetOrgId();
        String other$targetOrgId = other.getTargetOrgId();
        return !(this$targetOrgId == null ? other$targetOrgId != null : !this$targetOrgId.equals(other$targetOrgId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof TransferShopMerchantDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $customerLevelId = this.getCustomerLevelId();
        result = result * 59 + ($customerLevelId == null ? 43 : ((Object)$customerLevelId).hashCode());
        Long $saleAreaId = this.getSaleAreaId();
        result = result * 59 + ($saleAreaId == null ? 43 : ((Object)$saleAreaId).hashCode());
        List<Long> $merchantIdList = this.getMerchantIdList();
        result = result * 59 + ($merchantIdList == null ? 43 : ((Object)$merchantIdList).hashCode());
        String $targetOrgId = this.getTargetOrgId();
        result = result * 59 + ($targetOrgId == null ? 43 : $targetOrgId.hashCode());
        return result;
    }

    public String toString() {
        return "TransferShopMerchantDTO(merchantIdList=" + this.getMerchantIdList() + ", targetOrgId=" + this.getTargetOrgId() + ", customerLevelId=" + this.getCustomerLevelId() + ", saleAreaId=" + this.getSaleAreaId() + ")";
    }
}

