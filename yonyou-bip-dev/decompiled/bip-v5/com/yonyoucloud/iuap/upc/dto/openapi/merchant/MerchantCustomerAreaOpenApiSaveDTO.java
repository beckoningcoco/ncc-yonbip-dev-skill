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
public class MerchantCustomerAreaOpenApiSaveDTO
implements Serializable {
    public Long id;
    public Long saleAreaId;
    public String saleAreaIdCode;
    public Boolean isDefault;
    private String entityStatus;

    public Long getId() {
        return this.id;
    }

    public Long getSaleAreaId() {
        return this.saleAreaId;
    }

    public String getSaleAreaIdCode() {
        return this.saleAreaIdCode;
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

    public void setSaleAreaId(Long saleAreaId) {
        this.saleAreaId = saleAreaId;
    }

    public void setSaleAreaIdCode(String saleAreaIdCode) {
        this.saleAreaIdCode = saleAreaIdCode;
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
        if (!(o instanceof MerchantCustomerAreaOpenApiSaveDTO)) {
            return false;
        }
        MerchantCustomerAreaOpenApiSaveDTO other = (MerchantCustomerAreaOpenApiSaveDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$saleAreaId = this.getSaleAreaId();
        Long other$saleAreaId = other.getSaleAreaId();
        if (this$saleAreaId == null ? other$saleAreaId != null : !((Object)this$saleAreaId).equals(other$saleAreaId)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        String this$saleAreaIdCode = this.getSaleAreaIdCode();
        String other$saleAreaIdCode = other.getSaleAreaIdCode();
        if (this$saleAreaIdCode == null ? other$saleAreaIdCode != null : !this$saleAreaIdCode.equals(other$saleAreaIdCode)) {
            return false;
        }
        String this$entityStatus = this.getEntityStatus();
        String other$entityStatus = other.getEntityStatus();
        return !(this$entityStatus == null ? other$entityStatus != null : !this$entityStatus.equals(other$entityStatus));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantCustomerAreaOpenApiSaveDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $saleAreaId = this.getSaleAreaId();
        result = result * 59 + ($saleAreaId == null ? 43 : ((Object)$saleAreaId).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        String $saleAreaIdCode = this.getSaleAreaIdCode();
        result = result * 59 + ($saleAreaIdCode == null ? 43 : $saleAreaIdCode.hashCode());
        String $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : $entityStatus.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantCustomerAreaOpenApiSaveDTO(id=" + this.getId() + ", saleAreaId=" + this.getSaleAreaId() + ", saleAreaIdCode=" + this.getSaleAreaIdCode() + ", isDefault=" + this.getIsDefault() + ", entityStatus=" + this.getEntityStatus() + ")";
    }
}

