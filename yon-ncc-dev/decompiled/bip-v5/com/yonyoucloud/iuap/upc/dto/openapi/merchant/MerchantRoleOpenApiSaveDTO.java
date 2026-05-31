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
public class MerchantRoleOpenApiSaveDTO
implements Serializable {
    public Boolean merchantOptions;
    public String businessRole;

    public Boolean getMerchantOptions() {
        return this.merchantOptions;
    }

    public String getBusinessRole() {
        return this.businessRole;
    }

    public void setMerchantOptions(Boolean merchantOptions) {
        this.merchantOptions = merchantOptions;
    }

    public void setBusinessRole(String businessRole) {
        this.businessRole = businessRole;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantRoleOpenApiSaveDTO)) {
            return false;
        }
        MerchantRoleOpenApiSaveDTO other = (MerchantRoleOpenApiSaveDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$merchantOptions = this.getMerchantOptions();
        Boolean other$merchantOptions = other.getMerchantOptions();
        if (this$merchantOptions == null ? other$merchantOptions != null : !((Object)this$merchantOptions).equals(other$merchantOptions)) {
            return false;
        }
        String this$businessRole = this.getBusinessRole();
        String other$businessRole = other.getBusinessRole();
        return !(this$businessRole == null ? other$businessRole != null : !this$businessRole.equals(other$businessRole));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantRoleOpenApiSaveDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $merchantOptions = this.getMerchantOptions();
        result = result * 59 + ($merchantOptions == null ? 43 : ((Object)$merchantOptions).hashCode());
        String $businessRole = this.getBusinessRole();
        result = result * 59 + ($businessRole == null ? 43 : $businessRole.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantRoleOpenApiSaveDTO(merchantOptions=" + this.getMerchantOptions() + ", businessRole=" + this.getBusinessRole() + ")";
    }
}

