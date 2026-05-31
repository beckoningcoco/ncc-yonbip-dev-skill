/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.api.businesspartnerdto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.BusinessPartnerDTO;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class BusinessPartnerForNCCDTO
extends BusinessPartnerDTO
implements Serializable {
    private Long merchantId;
    private Long vendorId;

    public Long getMerchantId() {
        return this.merchantId;
    }

    public Long getVendorId() {
        return this.vendorId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BusinessPartnerForNCCDTO)) {
            return false;
        }
        BusinessPartnerForNCCDTO other = (BusinessPartnerForNCCDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Long this$vendorId = this.getVendorId();
        Long other$vendorId = other.getVendorId();
        return !(this$vendorId == null ? other$vendorId != null : !((Object)this$vendorId).equals(other$vendorId));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof BusinessPartnerForNCCDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $vendorId = this.getVendorId();
        result = result * 59 + ($vendorId == null ? 43 : ((Object)$vendorId).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "BusinessPartnerForNCCDTO(merchantId=" + this.getMerchantId() + ", vendorId=" + this.getVendorId() + ")";
    }
}

