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
public class PartnerMerchantComparisonQryDTO
implements Serializable {
    private String partnerId;
    private Long merchantId;

    public String getPartnerId() {
        return this.partnerId;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PartnerMerchantComparisonQryDTO)) {
            return false;
        }
        PartnerMerchantComparisonQryDTO other = (PartnerMerchantComparisonQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        String this$partnerId = this.getPartnerId();
        String other$partnerId = other.getPartnerId();
        return !(this$partnerId == null ? other$partnerId != null : !this$partnerId.equals(other$partnerId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PartnerMerchantComparisonQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        String $partnerId = this.getPartnerId();
        result = result * 59 + ($partnerId == null ? 43 : $partnerId.hashCode());
        return result;
    }

    public String toString() {
        return "PartnerMerchantComparisonQryDTO(partnerId=" + this.getPartnerId() + ", merchantId=" + this.getMerchantId() + ")";
    }
}

