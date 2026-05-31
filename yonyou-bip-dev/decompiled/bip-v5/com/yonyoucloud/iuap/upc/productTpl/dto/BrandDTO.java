/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.productTpl.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class BrandDTO {
    String brandName;

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BrandDTO)) {
            return false;
        }
        BrandDTO other = (BrandDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$brandName = this.getBrandName();
        String other$brandName = other.getBrandName();
        return !(this$brandName == null ? other$brandName != null : !this$brandName.equals(other$brandName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BrandDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $brandName = this.getBrandName();
        result = result * 59 + ($brandName == null ? 43 : $brandName.hashCode());
        return result;
    }

    public String toString() {
        return "BrandDTO(brandName=" + this.getBrandName() + ")";
    }
}

