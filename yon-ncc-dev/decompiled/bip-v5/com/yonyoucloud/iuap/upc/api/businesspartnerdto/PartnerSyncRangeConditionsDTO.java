/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.businesspartnerdto;

public class PartnerSyncRangeConditionsDTO {
    private String partnerId;
    private Long merchantId;
    private String transTypeId;
    private String customerClassId;
    private Long vendorId;
    private String vendorClassId;
    private String capitalId;
    private Integer roleClass;

    public String getPartnerId() {
        return this.partnerId;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getTransTypeId() {
        return this.transTypeId;
    }

    public String getCustomerClassId() {
        return this.customerClassId;
    }

    public Long getVendorId() {
        return this.vendorId;
    }

    public String getVendorClassId() {
        return this.vendorClassId;
    }

    public String getCapitalId() {
        return this.capitalId;
    }

    public Integer getRoleClass() {
        return this.roleClass;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setTransTypeId(String transTypeId) {
        this.transTypeId = transTypeId;
    }

    public void setCustomerClassId(String customerClassId) {
        this.customerClassId = customerClassId;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public void setVendorClassId(String vendorClassId) {
        this.vendorClassId = vendorClassId;
    }

    public void setCapitalId(String capitalId) {
        this.capitalId = capitalId;
    }

    public void setRoleClass(Integer roleClass) {
        this.roleClass = roleClass;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PartnerSyncRangeConditionsDTO)) {
            return false;
        }
        PartnerSyncRangeConditionsDTO other = (PartnerSyncRangeConditionsDTO)o;
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
        Integer this$roleClass = this.getRoleClass();
        Integer other$roleClass = other.getRoleClass();
        if (this$roleClass == null ? other$roleClass != null : !((Object)this$roleClass).equals(other$roleClass)) {
            return false;
        }
        String this$partnerId = this.getPartnerId();
        String other$partnerId = other.getPartnerId();
        if (this$partnerId == null ? other$partnerId != null : !this$partnerId.equals(other$partnerId)) {
            return false;
        }
        String this$transTypeId = this.getTransTypeId();
        String other$transTypeId = other.getTransTypeId();
        if (this$transTypeId == null ? other$transTypeId != null : !this$transTypeId.equals(other$transTypeId)) {
            return false;
        }
        String this$customerClassId = this.getCustomerClassId();
        String other$customerClassId = other.getCustomerClassId();
        if (this$customerClassId == null ? other$customerClassId != null : !this$customerClassId.equals(other$customerClassId)) {
            return false;
        }
        String this$vendorClassId = this.getVendorClassId();
        String other$vendorClassId = other.getVendorClassId();
        if (this$vendorClassId == null ? other$vendorClassId != null : !this$vendorClassId.equals(other$vendorClassId)) {
            return false;
        }
        String this$capitalId = this.getCapitalId();
        String other$capitalId = other.getCapitalId();
        return !(this$capitalId == null ? other$capitalId != null : !this$capitalId.equals(other$capitalId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PartnerSyncRangeConditionsDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $vendorId = this.getVendorId();
        result = result * 59 + ($vendorId == null ? 43 : ((Object)$vendorId).hashCode());
        Integer $roleClass = this.getRoleClass();
        result = result * 59 + ($roleClass == null ? 43 : ((Object)$roleClass).hashCode());
        String $partnerId = this.getPartnerId();
        result = result * 59 + ($partnerId == null ? 43 : $partnerId.hashCode());
        String $transTypeId = this.getTransTypeId();
        result = result * 59 + ($transTypeId == null ? 43 : $transTypeId.hashCode());
        String $customerClassId = this.getCustomerClassId();
        result = result * 59 + ($customerClassId == null ? 43 : $customerClassId.hashCode());
        String $vendorClassId = this.getVendorClassId();
        result = result * 59 + ($vendorClassId == null ? 43 : $vendorClassId.hashCode());
        String $capitalId = this.getCapitalId();
        result = result * 59 + ($capitalId == null ? 43 : $capitalId.hashCode());
        return result;
    }

    public String toString() {
        return "PartnerSyncRangeConditionsDTO(partnerId=" + this.getPartnerId() + ", merchantId=" + this.getMerchantId() + ", transTypeId=" + this.getTransTypeId() + ", customerClassId=" + this.getCustomerClassId() + ", vendorId=" + this.getVendorId() + ", vendorClassId=" + this.getVendorClassId() + ", capitalId=" + this.getCapitalId() + ", roleClass=" + this.getRoleClass() + ")";
    }
}

