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
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AddressInfoQryDTO
implements Serializable {
    private String[] fields;
    private Long merchantId;
    private List<Long> merchantIdList;
    private String address;
    private Boolean isDefault;

    public String[] getFields() {
        return this.fields;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public List<Long> getMerchantIdList() {
        return this.merchantIdList;
    }

    public String getAddress() {
        return this.address;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantIdList(List<Long> merchantIdList) {
        this.merchantIdList = merchantIdList;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AddressInfoQryDTO)) {
            return false;
        }
        AddressInfoQryDTO other = (AddressInfoQryDTO)o;
        if (!other.canEqual(this)) {
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
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        List<Long> this$merchantIdList = this.getMerchantIdList();
        List<Long> other$merchantIdList = other.getMerchantIdList();
        if (this$merchantIdList == null ? other$merchantIdList != null : !((Object)this$merchantIdList).equals(other$merchantIdList)) {
            return false;
        }
        String this$address = this.getAddress();
        String other$address = other.getAddress();
        return !(this$address == null ? other$address != null : !this$address.equals(other$address));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AddressInfoQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        List<Long> $merchantIdList = this.getMerchantIdList();
        result = result * 59 + ($merchantIdList == null ? 43 : ((Object)$merchantIdList).hashCode());
        String $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        return result;
    }

    public String toString() {
        return "AddressInfoQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", merchantId=" + this.getMerchantId() + ", merchantIdList=" + this.getMerchantIdList() + ", address=" + this.getAddress() + ", isDefault=" + this.getIsDefault() + ")";
    }
}

