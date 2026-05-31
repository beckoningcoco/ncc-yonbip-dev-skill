/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.PartnerComparisonDTO;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PartnerVendorComparisonDTO
extends PartnerComparisonDTO
implements Serializable {
    private Long vendorId;
    private String code;
    private String createOrgId;
    private String createOrgCode;
    private Long vendorClass;
    private String vendorClassCode;

    public Long getVendorId() {
        return this.vendorId;
    }

    public String getCode() {
        return this.code;
    }

    public String getCreateOrgId() {
        return this.createOrgId;
    }

    public String getCreateOrgCode() {
        return this.createOrgCode;
    }

    public Long getVendorClass() {
        return this.vendorClass;
    }

    public String getVendorClassCode() {
        return this.vendorClassCode;
    }

    public void setVendorId(Long vendorId) {
        this.vendorId = vendorId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCreateOrgId(String createOrgId) {
        this.createOrgId = createOrgId;
    }

    public void setCreateOrgCode(String createOrgCode) {
        this.createOrgCode = createOrgCode;
    }

    public void setVendorClass(Long vendorClass) {
        this.vendorClass = vendorClass;
    }

    public void setVendorClassCode(String vendorClassCode) {
        this.vendorClassCode = vendorClassCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PartnerVendorComparisonDTO)) {
            return false;
        }
        PartnerVendorComparisonDTO other = (PartnerVendorComparisonDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$vendorId = this.getVendorId();
        Long other$vendorId = other.getVendorId();
        if (this$vendorId == null ? other$vendorId != null : !((Object)this$vendorId).equals(other$vendorId)) {
            return false;
        }
        Long this$vendorClass = this.getVendorClass();
        Long other$vendorClass = other.getVendorClass();
        if (this$vendorClass == null ? other$vendorClass != null : !((Object)this$vendorClass).equals(other$vendorClass)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$createOrgId = this.getCreateOrgId();
        String other$createOrgId = other.getCreateOrgId();
        if (this$createOrgId == null ? other$createOrgId != null : !this$createOrgId.equals(other$createOrgId)) {
            return false;
        }
        String this$createOrgCode = this.getCreateOrgCode();
        String other$createOrgCode = other.getCreateOrgCode();
        if (this$createOrgCode == null ? other$createOrgCode != null : !this$createOrgCode.equals(other$createOrgCode)) {
            return false;
        }
        String this$vendorClassCode = this.getVendorClassCode();
        String other$vendorClassCode = other.getVendorClassCode();
        return !(this$vendorClassCode == null ? other$vendorClassCode != null : !this$vendorClassCode.equals(other$vendorClassCode));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof PartnerVendorComparisonDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $vendorId = this.getVendorId();
        result = result * 59 + ($vendorId == null ? 43 : ((Object)$vendorId).hashCode());
        Long $vendorClass = this.getVendorClass();
        result = result * 59 + ($vendorClass == null ? 43 : ((Object)$vendorClass).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $createOrgId = this.getCreateOrgId();
        result = result * 59 + ($createOrgId == null ? 43 : $createOrgId.hashCode());
        String $createOrgCode = this.getCreateOrgCode();
        result = result * 59 + ($createOrgCode == null ? 43 : $createOrgCode.hashCode());
        String $vendorClassCode = this.getVendorClassCode();
        result = result * 59 + ($vendorClassCode == null ? 43 : $vendorClassCode.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "PartnerVendorComparisonDTO(vendorId=" + this.getVendorId() + ", code=" + this.getCode() + ", createOrgId=" + this.getCreateOrgId() + ", createOrgCode=" + this.getCreateOrgCode() + ", vendorClass=" + this.getVendorClass() + ", vendorClassCode=" + this.getVendorClassCode() + ")";
    }
}

