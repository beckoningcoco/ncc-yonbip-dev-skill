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
public class ProductIPassAssistClass
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String status;
    private Long productClassId;
    private String productClassCode;

    public String getStatus() {
        return this.status;
    }

    public Long getProductClassId() {
        return this.productClassId;
    }

    public String getProductClassCode() {
        return this.productClassCode;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setProductClassId(Long productClassId) {
        this.productClassId = productClassId;
    }

    public void setProductClassCode(String productClassCode) {
        this.productClassCode = productClassCode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductIPassAssistClass)) {
            return false;
        }
        ProductIPassAssistClass other = (ProductIPassAssistClass)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productClassId = this.getProductClassId();
        Long other$productClassId = other.getProductClassId();
        if (this$productClassId == null ? other$productClassId != null : !((Object)this$productClassId).equals(other$productClassId)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        if (this$status == null ? other$status != null : !this$status.equals(other$status)) {
            return false;
        }
        String this$productClassCode = this.getProductClassCode();
        String other$productClassCode = other.getProductClassCode();
        return !(this$productClassCode == null ? other$productClassCode != null : !this$productClassCode.equals(other$productClassCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductIPassAssistClass;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productClassId = this.getProductClassId();
        result = result * 59 + ($productClassId == null ? 43 : ((Object)$productClassId).hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        String $productClassCode = this.getProductClassCode();
        result = result * 59 + ($productClassCode == null ? 43 : $productClassCode.hashCode());
        return result;
    }

    public String toString() {
        return "ProductIPassAssistClass(status=" + this.getStatus() + ", productClassId=" + this.getProductClassId() + ", productClassCode=" + this.getProductClassCode() + ")";
    }
}

