/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductIPassBarCode
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String barCode;

    public String getBarCode() {
        return this.barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductIPassBarCode)) {
            return false;
        }
        ProductIPassBarCode other = (ProductIPassBarCode)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$barCode = this.getBarCode();
        String other$barCode = other.getBarCode();
        return !(this$barCode == null ? other$barCode != null : !this$barCode.equals(other$barCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductIPassBarCode;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : $barCode.hashCode());
        return result;
    }

    public String toString() {
        return "ProductIPassBarCode(barCode=" + this.getBarCode() + ")";
    }
}

