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
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class InvoicingCustomersQryDTO
implements Serializable {
    private List<Long> merchantIdList;
    private List<String> orgIdList;
    private Boolean isDefault;

    public List<Long> getMerchantIdList() {
        return this.merchantIdList;
    }

    public List<String> getOrgIdList() {
        return this.orgIdList;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setMerchantIdList(List<Long> merchantIdList) {
        this.merchantIdList = merchantIdList;
    }

    public void setOrgIdList(List<String> orgIdList) {
        this.orgIdList = orgIdList;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InvoicingCustomersQryDTO)) {
            return false;
        }
        InvoicingCustomersQryDTO other = (InvoicingCustomersQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        List<Long> this$merchantIdList = this.getMerchantIdList();
        List<Long> other$merchantIdList = other.getMerchantIdList();
        if (this$merchantIdList == null ? other$merchantIdList != null : !((Object)this$merchantIdList).equals(other$merchantIdList)) {
            return false;
        }
        List<String> this$orgIdList = this.getOrgIdList();
        List<String> other$orgIdList = other.getOrgIdList();
        return !(this$orgIdList == null ? other$orgIdList != null : !((Object)this$orgIdList).equals(other$orgIdList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof InvoicingCustomersQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        List<Long> $merchantIdList = this.getMerchantIdList();
        result = result * 59 + ($merchantIdList == null ? 43 : ((Object)$merchantIdList).hashCode());
        List<String> $orgIdList = this.getOrgIdList();
        result = result * 59 + ($orgIdList == null ? 43 : ((Object)$orgIdList).hashCode());
        return result;
    }

    public String toString() {
        return "InvoicingCustomersQryDTO(merchantIdList=" + this.getMerchantIdList() + ", orgIdList=" + this.getOrgIdList() + ", isDefault=" + this.getIsDefault() + ")";
    }
}

