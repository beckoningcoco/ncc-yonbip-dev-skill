/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.merchantgroupdto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.HashMap;
import java.util.HashSet;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PrincipalCrmDto {
    private Long id;
    private Long merchantApplyRangeId;
    private Long merchantId;
    private String specialManagementDep;
    private String professSalesman;
    private Boolean isDefault;
    private HashSet<String> blankSet;
    private HashMap<String, Object> principalCharacter;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getSpecialManagementDep() {
        return this.specialManagementDep;
    }

    public String getProfessSalesman() {
        return this.professSalesman;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public HashSet<String> getBlankSet() {
        return this.blankSet;
    }

    public HashMap<String, Object> getPrincipalCharacter() {
        return this.principalCharacter;
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

    public void setSpecialManagementDep(String specialManagementDep) {
        this.specialManagementDep = specialManagementDep;
    }

    public void setProfessSalesman(String professSalesman) {
        this.professSalesman = professSalesman;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setBlankSet(HashSet<String> blankSet) {
        this.blankSet = blankSet;
    }

    public void setPrincipalCharacter(HashMap<String, Object> principalCharacter) {
        this.principalCharacter = principalCharacter;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PrincipalCrmDto)) {
            return false;
        }
        PrincipalCrmDto other = (PrincipalCrmDto)o;
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
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        String this$specialManagementDep = this.getSpecialManagementDep();
        String other$specialManagementDep = other.getSpecialManagementDep();
        if (this$specialManagementDep == null ? other$specialManagementDep != null : !this$specialManagementDep.equals(other$specialManagementDep)) {
            return false;
        }
        String this$professSalesman = this.getProfessSalesman();
        String other$professSalesman = other.getProfessSalesman();
        if (this$professSalesman == null ? other$professSalesman != null : !this$professSalesman.equals(other$professSalesman)) {
            return false;
        }
        HashSet<String> this$blankSet = this.getBlankSet();
        HashSet<String> other$blankSet = other.getBlankSet();
        if (this$blankSet == null ? other$blankSet != null : !((Object)this$blankSet).equals(other$blankSet)) {
            return false;
        }
        HashMap<String, Object> this$principalCharacter = this.getPrincipalCharacter();
        HashMap<String, Object> other$principalCharacter = other.getPrincipalCharacter();
        return !(this$principalCharacter == null ? other$principalCharacter != null : !((Object)this$principalCharacter).equals(other$principalCharacter));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PrincipalCrmDto;
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
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        String $specialManagementDep = this.getSpecialManagementDep();
        result = result * 59 + ($specialManagementDep == null ? 43 : $specialManagementDep.hashCode());
        String $professSalesman = this.getProfessSalesman();
        result = result * 59 + ($professSalesman == null ? 43 : $professSalesman.hashCode());
        HashSet<String> $blankSet = this.getBlankSet();
        result = result * 59 + ($blankSet == null ? 43 : ((Object)$blankSet).hashCode());
        HashMap<String, Object> $principalCharacter = this.getPrincipalCharacter();
        result = result * 59 + ($principalCharacter == null ? 43 : ((Object)$principalCharacter).hashCode());
        return result;
    }

    public String toString() {
        return "PrincipalCrmDto(id=" + this.getId() + ", merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", merchantId=" + this.getMerchantId() + ", specialManagementDep=" + this.getSpecialManagementDep() + ", professSalesman=" + this.getProfessSalesman() + ", isDefault=" + this.getIsDefault() + ", blankSet=" + this.getBlankSet() + ", principalCharacter=" + this.getPrincipalCharacter() + ")";
    }
}

