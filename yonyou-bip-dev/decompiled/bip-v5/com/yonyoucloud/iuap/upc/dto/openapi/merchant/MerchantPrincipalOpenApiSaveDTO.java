/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.openapi.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantPrincipalOpenApiSaveDTO
implements Serializable {
    public Long id;
    public String specialManagementDepId;
    public String specialManagementDepCode;
    public String professSalesmanId;
    public String professSalesmanCode;
    public Boolean isDefault;
    private String entityStatus;

    public Long getId() {
        return this.id;
    }

    public String getSpecialManagementDepId() {
        return this.specialManagementDepId;
    }

    public String getSpecialManagementDepCode() {
        return this.specialManagementDepCode;
    }

    public String getProfessSalesmanId() {
        return this.professSalesmanId;
    }

    public String getProfessSalesmanCode() {
        return this.professSalesmanCode;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public String getEntityStatus() {
        return this.entityStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSpecialManagementDepId(String specialManagementDepId) {
        this.specialManagementDepId = specialManagementDepId;
    }

    public void setSpecialManagementDepCode(String specialManagementDepCode) {
        this.specialManagementDepCode = specialManagementDepCode;
    }

    public void setProfessSalesmanId(String professSalesmanId) {
        this.professSalesmanId = professSalesmanId;
    }

    public void setProfessSalesmanCode(String professSalesmanCode) {
        this.professSalesmanCode = professSalesmanCode;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantPrincipalOpenApiSaveDTO)) {
            return false;
        }
        MerchantPrincipalOpenApiSaveDTO other = (MerchantPrincipalOpenApiSaveDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
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
        String this$entityStatus = this.getEntityStatus();
        String other$entityStatus = other.getEntityStatus();
        return !(this$entityStatus == null ? other$entityStatus != null : !this$entityStatus.equals(other$entityStatus));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantPrincipalOpenApiSaveDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        String $specialManagementDepId = this.getSpecialManagementDepId();
        result = result * 59 + ($specialManagementDepId == null ? 43 : $specialManagementDepId.hashCode());
        String $specialManagementDepCode = this.getSpecialManagementDepCode();
        result = result * 59 + ($specialManagementDepCode == null ? 43 : $specialManagementDepCode.hashCode());
        String $professSalesmanId = this.getProfessSalesmanId();
        result = result * 59 + ($professSalesmanId == null ? 43 : $professSalesmanId.hashCode());
        String $professSalesmanCode = this.getProfessSalesmanCode();
        result = result * 59 + ($professSalesmanCode == null ? 43 : $professSalesmanCode.hashCode());
        String $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : $entityStatus.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantPrincipalOpenApiSaveDTO(id=" + this.getId() + ", specialManagementDepId=" + this.getSpecialManagementDepId() + ", specialManagementDepCode=" + this.getSpecialManagementDepCode() + ", professSalesmanId=" + this.getProfessSalesmanId() + ", professSalesmanCode=" + this.getProfessSalesmanCode() + ", isDefault=" + this.getIsDefault() + ", entityStatus=" + this.getEntityStatus() + ")";
    }
}

