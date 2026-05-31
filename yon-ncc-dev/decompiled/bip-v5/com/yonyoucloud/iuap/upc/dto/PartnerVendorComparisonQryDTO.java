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
public class PartnerVendorComparisonQryDTO
implements Serializable {
    private String partnerId;
    private Long vendorId;

    public String getPartnerId() {
        return this.partnerId;
    }

    public Long getVendorId() {
        return this.vendorId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PartnerVendorComparisonQryDTO)) {
            return false;
        }
        PartnerVendorComparisonQryDTO other = (PartnerVendorComparisonQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$vendorId = this.getVendorId();
        Long other$vendorId = other.getVendorId();
        if (this$vendorId == null ? other$vendorId != null : !((Object)this$vendorId).equals(other$vendorId)) {
            return false;
        }
        String this$partnerId = this.getPartnerId();
        String other$partnerId = other.getPartnerId();
        return !(this$partnerId == null ? other$partnerId != null : !this$partnerId.equals(other$partnerId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PartnerVendorComparisonQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $vendorId = this.getVendorId();
        result = result * 59 + ($vendorId == null ? 43 : ((Object)$vendorId).hashCode());
        String $partnerId = this.getPartnerId();
        result = result * 59 + ($partnerId == null ? 43 : $partnerId.hashCode());
        return result;
    }

    public String toString() {
        return "PartnerVendorComparisonQryDTO(partnerId=" + this.getPartnerId() + ", vendorId=" + this.getVendorId() + ")";
    }
}

