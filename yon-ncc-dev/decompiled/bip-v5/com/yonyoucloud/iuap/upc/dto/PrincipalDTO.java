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
public class PrincipalDTO
implements Serializable {
    private Long merchantId;
    private Long merchantDetailId;
    public String specialManagementDepId;
    public String specialManagementDepCode;
    public String specialManagementDepName;
    public String professSalesmanId;
    public String professSalesmanCode;
    public String professSalesmanName;
    private Boolean ifDefault;
    private String orgId;

    public Long getMerchantId() {
        return this.merchantId;
    }

    public Long getMerchantDetailId() {
        return this.merchantDetailId;
    }

    public String getSpecialManagementDepId() {
        return this.specialManagementDepId;
    }

    public String getSpecialManagementDepCode() {
        return this.specialManagementDepCode;
    }

    public String getSpecialManagementDepName() {
        return this.specialManagementDepName;
    }

    public String getProfessSalesmanId() {
        return this.professSalesmanId;
    }

    public String getProfessSalesmanCode() {
        return this.professSalesmanCode;
    }

    public String getProfessSalesmanName() {
        return this.professSalesmanName;
    }

    public Boolean getIfDefault() {
        return this.ifDefault;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantDetailId(Long merchantDetailId) {
        this.merchantDetailId = merchantDetailId;
    }

    public void setSpecialManagementDepId(String specialManagementDepId) {
        this.specialManagementDepId = specialManagementDepId;
    }

    public void setSpecialManagementDepCode(String specialManagementDepCode) {
        this.specialManagementDepCode = specialManagementDepCode;
    }

    public void setSpecialManagementDepName(String specialManagementDepName) {
        this.specialManagementDepName = specialManagementDepName;
    }

    public void setProfessSalesmanId(String professSalesmanId) {
        this.professSalesmanId = professSalesmanId;
    }

    public void setProfessSalesmanCode(String professSalesmanCode) {
        this.professSalesmanCode = professSalesmanCode;
    }

    public void setProfessSalesmanName(String professSalesmanName) {
        this.professSalesmanName = professSalesmanName;
    }

    public void setIfDefault(Boolean ifDefault) {
        this.ifDefault = ifDefault;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PrincipalDTO)) {
            return false;
        }
        PrincipalDTO other = (PrincipalDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Long this$merchantDetailId = this.getMerchantDetailId();
        Long other$merchantDetailId = other.getMerchantDetailId();
        if (this$merchantDetailId == null ? other$merchantDetailId != null : !((Object)this$merchantDetailId).equals(other$merchantDetailId)) {
            return false;
        }
        Boolean this$ifDefault = this.getIfDefault();
        Boolean other$ifDefault = other.getIfDefault();
        if (this$ifDefault == null ? other$ifDefault != null : !((Object)this$ifDefault).equals(other$ifDefault)) {
            return false;
        }
        String this$specialManagementDepId = this.getSpecialManagementDepId();
        String other$specialManagementDepId = other.getSpecialManagementDepId();
        if (this$specialManagementDepId == null ? other$specialManagementDepId != null : !this$specialManagementDepId.equals(other$specialManagementDepId)) {
            return false;
        }
        String this$specialManagementDepCode = this.getSpecialManagementDepCode();
        String other$specialManagementDepCode = other.getSpecialManagementDepCode();
        if (this$specialManagementDepCode == null ? other$specialManagementDepCode != null : !this$specialManagementDepCode.equals(other$specialManagementDepCode)) {
            return false;
        }
        String this$specialManagementDepName = this.getSpecialManagementDepName();
        String other$specialManagementDepName = other.getSpecialManagementDepName();
        if (this$specialManagementDepName == null ? other$specialManagementDepName != null : !this$specialManagementDepName.equals(other$specialManagementDepName)) {
            return false;
        }
        String this$professSalesmanId = this.getProfessSalesmanId();
        String other$professSalesmanId = other.getProfessSalesmanId();
        if (this$professSalesmanId == null ? other$professSalesmanId != null : !this$professSalesmanId.equals(other$professSalesmanId)) {
            return false;
        }
        String this$professSalesmanCode = this.getProfessSalesmanCode();
        String other$professSalesmanCode = other.getProfessSalesmanCode();
        if (this$professSalesmanCode == null ? other$professSalesmanCode != null : !this$professSalesmanCode.equals(other$professSalesmanCode)) {
            return false;
        }
        String this$professSalesmanName = this.getProfessSalesmanName();
        String other$professSalesmanName = other.getProfessSalesmanName();
        if (this$professSalesmanName == null ? other$professSalesmanName != null : !this$professSalesmanName.equals(other$professSalesmanName)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        return !(this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PrincipalDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $merchantDetailId = this.getMerchantDetailId();
        result = result * 59 + ($merchantDetailId == null ? 43 : ((Object)$merchantDetailId).hashCode());
        Boolean $ifDefault = this.getIfDefault();
        result = result * 59 + ($ifDefault == null ? 43 : ((Object)$ifDefault).hashCode());
        String $specialManagementDepId = this.getSpecialManagementDepId();
        result = result * 59 + ($specialManagementDepId == null ? 43 : $specialManagementDepId.hashCode());
        String $specialManagementDepCode = this.getSpecialManagementDepCode();
        result = result * 59 + ($specialManagementDepCode == null ? 43 : $specialManagementDepCode.hashCode());
        String $specialManagementDepName = this.getSpecialManagementDepName();
        result = result * 59 + ($specialManagementDepName == null ? 43 : $specialManagementDepName.hashCode());
        String $professSalesmanId = this.getProfessSalesmanId();
        result = result * 59 + ($professSalesmanId == null ? 43 : $professSalesmanId.hashCode());
        String $professSalesmanCode = this.getProfessSalesmanCode();
        result = result * 59 + ($professSalesmanCode == null ? 43 : $professSalesmanCode.hashCode());
        String $professSalesmanName = this.getProfessSalesmanName();
        result = result * 59 + ($professSalesmanName == null ? 43 : $professSalesmanName.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        return result;
    }

    public String toString() {
        return "PrincipalDTO(merchantId=" + this.getMerchantId() + ", merchantDetailId=" + this.getMerchantDetailId() + ", specialManagementDepId=" + this.getSpecialManagementDepId() + ", specialManagementDepCode=" + this.getSpecialManagementDepCode() + ", specialManagementDepName=" + this.getSpecialManagementDepName() + ", professSalesmanId=" + this.getProfessSalesmanId() + ", professSalesmanCode=" + this.getProfessSalesmanCode() + ", professSalesmanName=" + this.getProfessSalesmanName() + ", ifDefault=" + this.getIfDefault() + ", orgId=" + this.getOrgId() + ")";
    }
}

