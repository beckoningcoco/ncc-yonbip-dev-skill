/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.merchantgroupdto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class CustomerAreaCrmDto {
    private Long id;
    private Long merchantApplyRangeId;
    private Long merchantId;
    private Long saleAreaId;
    private Boolean isDefault;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public Long getSaleAreaId() {
        return this.saleAreaId;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setSaleAreaId(Long saleAreaId) {
        this.saleAreaId = saleAreaId;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CustomerAreaCrmDto)) {
            return false;
        }
        CustomerAreaCrmDto other = (CustomerAreaCrmDto)o;
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
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Long this$saleAreaId = this.getSaleAreaId();
        Long other$saleAreaId = other.getSaleAreaId();
        if (this$saleAreaId == null ? other$saleAreaId != null : !((Object)this$saleAreaId).equals(other$saleAreaId)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        return !(this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault));
    }

    protected boolean canEqual(Object other) {
        return other instanceof CustomerAreaCrmDto;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $saleAreaId = this.getSaleAreaId();
        result = result * 59 + ($saleAreaId == null ? 43 : ((Object)$saleAreaId).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        return result;
    }

    public String toString() {
        return "CustomerAreaCrmDto(id=" + this.getId() + ", merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", merchantId=" + this.getMerchantId() + ", saleAreaId=" + this.getSaleAreaId() + ", isDefault=" + this.getIsDefault() + ")";
    }
}

