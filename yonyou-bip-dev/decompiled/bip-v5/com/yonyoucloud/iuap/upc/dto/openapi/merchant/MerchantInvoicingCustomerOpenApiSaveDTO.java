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
public class MerchantInvoicingCustomerOpenApiSaveDTO
implements Serializable {
    public Long id;
    public Long invoicingCustomersId;
    public String invoicingCustomersIdCode;
    public Boolean isDefault;
    private String entityStatus;

    public Long getId() {
        return this.id;
    }

    public Long getInvoicingCustomersId() {
        return this.invoicingCustomersId;
    }

    public String getInvoicingCustomersIdCode() {
        return this.invoicingCustomersIdCode;
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

    public void setInvoicingCustomersId(Long invoicingCustomersId) {
        this.invoicingCustomersId = invoicingCustomersId;
    }

    public void setInvoicingCustomersIdCode(String invoicingCustomersIdCode) {
        this.invoicingCustomersIdCode = invoicingCustomersIdCode;
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
        if (!(o instanceof MerchantInvoicingCustomerOpenApiSaveDTO)) {
            return false;
        }
        MerchantInvoicingCustomerOpenApiSaveDTO other = (MerchantInvoicingCustomerOpenApiSaveDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$invoicingCustomersId = this.getInvoicingCustomersId();
        Long other$invoicingCustomersId = other.getInvoicingCustomersId();
        if (this$invoicingCustomersId == null ? other$invoicingCustomersId != null : !((Object)this$invoicingCustomersId).equals(other$invoicingCustomersId)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        String this$invoicingCustomersIdCode = this.getInvoicingCustomersIdCode();
        String other$invoicingCustomersIdCode = other.getInvoicingCustomersIdCode();
        if (this$invoicingCustomersIdCode == null ? other$invoicingCustomersIdCode != null : !this$invoicingCustomersIdCode.equals(other$invoicingCustomersIdCode)) {
            return false;
        }
        String this$entityStatus = this.getEntityStatus();
        String other$entityStatus = other.getEntityStatus();
        return !(this$entityStatus == null ? other$entityStatus != null : !this$entityStatus.equals(other$entityStatus));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantInvoicingCustomerOpenApiSaveDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $invoicingCustomersId = this.getInvoicingCustomersId();
        result = result * 59 + ($invoicingCustomersId == null ? 43 : ((Object)$invoicingCustomersId).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        String $invoicingCustomersIdCode = this.getInvoicingCustomersIdCode();
        result = result * 59 + ($invoicingCustomersIdCode == null ? 43 : $invoicingCustomersIdCode.hashCode());
        String $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : $entityStatus.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantInvoicingCustomerOpenApiSaveDTO(id=" + this.getId() + ", invoicingCustomersId=" + this.getInvoicingCustomersId() + ", invoicingCustomersIdCode=" + this.getInvoicingCustomersIdCode() + ", isDefault=" + this.getIsDefault() + ", entityStatus=" + this.getEntityStatus() + ")";
    }
}

