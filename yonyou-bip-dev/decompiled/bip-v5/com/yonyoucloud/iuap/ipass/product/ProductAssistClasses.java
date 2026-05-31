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
public class ProductAssistClasses
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String assClass_Name;
    private String productClassId;
    private String productId;
    private String id;
    private String _status;

    public String getAssClass_Name() {
        return this.assClass_Name;
    }

    public String getProductClassId() {
        return this.productClassId;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getId() {
        return this.id;
    }

    public String get_status() {
        return this._status;
    }

    public void setAssClass_Name(String assClass_Name) {
        this.assClass_Name = assClass_Name;
    }

    public void setProductClassId(String productClassId) {
        this.productClassId = productClassId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductAssistClasses)) {
            return false;
        }
        ProductAssistClasses other = (ProductAssistClasses)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$assClass_Name = this.getAssClass_Name();
        String other$assClass_Name = other.getAssClass_Name();
        if (this$assClass_Name == null ? other$assClass_Name != null : !this$assClass_Name.equals(other$assClass_Name)) {
            return false;
        }
        String this$productClassId = this.getProductClassId();
        String other$productClassId = other.getProductClassId();
        if (this$productClassId == null ? other$productClassId != null : !this$productClassId.equals(other$productClassId)) {
            return false;
        }
        String this$productId = this.getProductId();
        String other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !this$_status.equals(other$_status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductAssistClasses;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $assClass_Name = this.getAssClass_Name();
        result = result * 59 + ($assClass_Name == null ? 43 : $assClass_Name.hashCode());
        String $productClassId = this.getProductClassId();
        result = result * 59 + ($productClassId == null ? 43 : $productClassId.hashCode());
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductAssistClasses(assClass_Name=" + this.getAssClass_Name() + ", productClassId=" + this.getProductClassId() + ", productId=" + this.getProductId() + ", id=" + this.getId() + ", _status=" + this.get_status() + ")";
    }
}

