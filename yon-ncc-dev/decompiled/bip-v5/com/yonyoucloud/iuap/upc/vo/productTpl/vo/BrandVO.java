/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.productTpl.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class BrandVO {
    String brandCode;
    String brandName;

    public String getBrandCode() {
        return this.brandCode;
    }

    public String getBrandName() {
        return this.brandName;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BrandVO)) {
            return false;
        }
        BrandVO other = (BrandVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$brandCode = this.getBrandCode();
        String other$brandCode = other.getBrandCode();
        if (this$brandCode == null ? other$brandCode != null : !this$brandCode.equals(other$brandCode)) {
            return false;
        }
        String this$brandName = this.getBrandName();
        String other$brandName = other.getBrandName();
        return !(this$brandName == null ? other$brandName != null : !this$brandName.equals(other$brandName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof BrandVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $brandCode = this.getBrandCode();
        result = result * 59 + ($brandCode == null ? 43 : $brandCode.hashCode());
        String $brandName = this.getBrandName();
        result = result * 59 + ($brandName == null ? 43 : $brandName.hashCode());
        return result;
    }

    public String toString() {
        return "BrandVO(brandCode=" + this.getBrandCode() + ", brandName=" + this.getBrandName() + ")";
    }
}

