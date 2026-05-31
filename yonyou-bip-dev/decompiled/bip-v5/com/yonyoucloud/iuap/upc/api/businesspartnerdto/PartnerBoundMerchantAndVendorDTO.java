/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.api.businesspartnerdto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PartnerBoundMerchantAndVendorDTO
implements Serializable {
    private String partnerId;
    private String partnerCode;
    private Long merchantId;
    private String merchantCode;
    private Long vendorId;
    private String vendorCode;

    public String getPartnerId() {
        return this.partnerId;
    }

    public String getPartnerCode() {
        return this.partnerCode;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantCode() {
        return this.merchantCode;
    }

    public Long getVendorId() {
        return this.vendorId;
    }

    public String getVendorCode() {
        return this.vendorCode;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PartnerBoundMerchantAndVendorDTO)) {
            return false;
        }
        PartnerBoundMerchantAndVendorDTO other = (PartnerBoundMerchantAndVendorDTO)o;
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
        if (this$vendorId == null ? other$vendorId != null : !((Object)this$vendorId).equals(other$vendorId)) {
            return false;
        }
        String this$partnerId = this.getPartnerId();
        String other$partnerId = other.getPartnerId();
        if (this$partnerId == null ? other$partnerId != null : !this$partnerId.equals(other$partnerId)) {
            return false;
        }
        String this$partnerCode = this.getPartnerCode();
        String other$partnerCode = other.getPartnerCode();
        if (this$partnerCode == null ? other$partnerCode != null : !this$partnerCode.equals(other$partnerCode)) {
            return false;
        }
        String this$merchantCode = this.getMerchantCode();
        String other$merchantCode = other.getMerchantCode();
        if (this$merchantCode == null ? other$merchantCode != null : !this$merchantCode.equals(other$merchantCode)) {
            return false;
        }
        String this$vendorCode = this.getVendorCode();
        String other$vendorCode = other.getVendorCode();
        return !(this$vendorCode == null ? other$vendorCode != null : !this$vendorCode.equals(other$vendorCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PartnerBoundMerchantAndVendorDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $vendorId = this.getVendorId();
        result = result * 59 + ($vendorId == null ? 43 : ((Object)$vendorId).hashCode());
        String $partnerId = this.getPartnerId();
        result = result * 59 + ($partnerId == null ? 43 : $partnerId.hashCode());
        String $partnerCode = this.getPartnerCode();
        result = result * 59 + ($partnerCode == null ? 43 : $partnerCode.hashCode());
        String $merchantCode = this.getMerchantCode();
        result = result * 59 + ($merchantCode == null ? 43 : $merchantCode.hashCode());
        String $vendorCode = this.getVendorCode();
        result = result * 59 + ($vendorCode == null ? 43 : $vendorCode.hashCode());
        return result;
    }

    public String toString() {
        return "PartnerBoundMerchantAndVendorDTO(partnerId=" + this.getPartnerId() + ", partnerCode=" + this.getPartnerCode() + ", merchantId=" + this.getMerchantId() + ", merchantCode=" + this.getMerchantCode() + ", vendorId=" + this.getVendorId() + ", vendorCode=" + this.getVendorCode() + ")";
    }
}

