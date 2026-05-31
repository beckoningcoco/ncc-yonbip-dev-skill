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
public class MerchantCustomerAreaQryDTO
implements Serializable {
    private List<Long> merchantIdList;
    private List<String> OrgIdIdList;
    private List<Long> saleAreaIdList;
    private Boolean defaultSaleArea;

    public List<Long> getMerchantIdList() {
        return this.merchantIdList;
    }

    public List<String> getOrgIdIdList() {
        return this.OrgIdIdList;
    }

    public List<Long> getSaleAreaIdList() {
        return this.saleAreaIdList;
    }

    public Boolean getDefaultSaleArea() {
        return this.defaultSaleArea;
    }

    public void setMerchantIdList(List<Long> merchantIdList) {
        this.merchantIdList = merchantIdList;
    }

    public void setOrgIdIdList(List<String> OrgIdIdList) {
        this.OrgIdIdList = OrgIdIdList;
    }

    public void setSaleAreaIdList(List<Long> saleAreaIdList) {
        this.saleAreaIdList = saleAreaIdList;
    }

    public void setDefaultSaleArea(Boolean defaultSaleArea) {
        this.defaultSaleArea = defaultSaleArea;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantCustomerAreaQryDTO)) {
            return false;
        }
        MerchantCustomerAreaQryDTO other = (MerchantCustomerAreaQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$defaultSaleArea = this.getDefaultSaleArea();
        Boolean other$defaultSaleArea = other.getDefaultSaleArea();
        if (this$defaultSaleArea == null ? other$defaultSaleArea != null : !((Object)this$defaultSaleArea).equals(other$defaultSaleArea)) {
            return false;
        }
        List<Long> this$merchantIdList = this.getMerchantIdList();
        List<Long> other$merchantIdList = other.getMerchantIdList();
        if (this$merchantIdList == null ? other$merchantIdList != null : !((Object)this$merchantIdList).equals(other$merchantIdList)) {
            return false;
        }
        List<String> this$OrgIdIdList = this.getOrgIdIdList();
        List<String> other$OrgIdIdList = other.getOrgIdIdList();
        if (this$OrgIdIdList == null ? other$OrgIdIdList != null : !((Object)this$OrgIdIdList).equals(other$OrgIdIdList)) {
            return false;
        }
        List<Long> this$saleAreaIdList = this.getSaleAreaIdList();
        List<Long> other$saleAreaIdList = other.getSaleAreaIdList();
        return !(this$saleAreaIdList == null ? other$saleAreaIdList != null : !((Object)this$saleAreaIdList).equals(other$saleAreaIdList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantCustomerAreaQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $defaultSaleArea = this.getDefaultSaleArea();
        result = result * 59 + ($defaultSaleArea == null ? 43 : ((Object)$defaultSaleArea).hashCode());
        List<Long> $merchantIdList = this.getMerchantIdList();
        result = result * 59 + ($merchantIdList == null ? 43 : ((Object)$merchantIdList).hashCode());
        List<String> $OrgIdIdList = this.getOrgIdIdList();
        result = result * 59 + ($OrgIdIdList == null ? 43 : ((Object)$OrgIdIdList).hashCode());
        List<Long> $saleAreaIdList = this.getSaleAreaIdList();
        result = result * 59 + ($saleAreaIdList == null ? 43 : ((Object)$saleAreaIdList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantCustomerAreaQryDTO(merchantIdList=" + this.getMerchantIdList() + ", OrgIdIdList=" + this.getOrgIdIdList() + ", saleAreaIdList=" + this.getSaleAreaIdList() + ", defaultSaleArea=" + this.getDefaultSaleArea() + ")";
    }
}

