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
import java.util.Arrays;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantRoleInfoQryDTO
implements Serializable {
    private String[] fields;
    private Long merchantId;
    private Boolean merchantOptions;
    private String businessRole;
    private String fuzzyBusinessRole;

    public String[] getFields() {
        return this.fields;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public Boolean getMerchantOptions() {
        return this.merchantOptions;
    }

    public String getBusinessRole() {
        return this.businessRole;
    }

    public String getFuzzyBusinessRole() {
        return this.fuzzyBusinessRole;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantOptions(Boolean merchantOptions) {
        this.merchantOptions = merchantOptions;
    }

    public void setBusinessRole(String businessRole) {
        this.businessRole = businessRole;
    }

    public void setFuzzyBusinessRole(String fuzzyBusinessRole) {
        this.fuzzyBusinessRole = fuzzyBusinessRole;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantRoleInfoQryDTO)) {
            return false;
        }
        MerchantRoleInfoQryDTO other = (MerchantRoleInfoQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Boolean this$merchantOptions = this.getMerchantOptions();
        Boolean other$merchantOptions = other.getMerchantOptions();
        if (this$merchantOptions == null ? other$merchantOptions != null : !((Object)this$merchantOptions).equals(other$merchantOptions)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        String this$businessRole = this.getBusinessRole();
        String other$businessRole = other.getBusinessRole();
        if (this$businessRole == null ? other$businessRole != null : !this$businessRole.equals(other$businessRole)) {
            return false;
        }
        String this$fuzzyBusinessRole = this.getFuzzyBusinessRole();
        String other$fuzzyBusinessRole = other.getFuzzyBusinessRole();
        return !(this$fuzzyBusinessRole == null ? other$fuzzyBusinessRole != null : !this$fuzzyBusinessRole.equals(other$fuzzyBusinessRole));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantRoleInfoQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Boolean $merchantOptions = this.getMerchantOptions();
        result = result * 59 + ($merchantOptions == null ? 43 : ((Object)$merchantOptions).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        String $businessRole = this.getBusinessRole();
        result = result * 59 + ($businessRole == null ? 43 : $businessRole.hashCode());
        String $fuzzyBusinessRole = this.getFuzzyBusinessRole();
        result = result * 59 + ($fuzzyBusinessRole == null ? 43 : $fuzzyBusinessRole.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantRoleInfoQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", merchantId=" + this.getMerchantId() + ", merchantOptions=" + this.getMerchantOptions() + ", businessRole=" + this.getBusinessRole() + ", fuzzyBusinessRole=" + this.getFuzzyBusinessRole() + ")";
    }
}

