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
public class ProductSpecFrees
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String productId;
    private String productApplyRangeId;
    private String freeType;
    private Boolean checked;
    private String _status;

    public String getId() {
        return this.id;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public String getFreeType() {
        return this.freeType;
    }

    public Boolean getChecked() {
        return this.checked;
    }

    public String get_status() {
        return this._status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductApplyRangeId(String productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setFreeType(String freeType) {
        this.freeType = freeType;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSpecFrees)) {
            return false;
        }
        ProductSpecFrees other = (ProductSpecFrees)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$checked = this.getChecked();
        Boolean other$checked = other.getChecked();
        if (this$checked == null ? other$checked != null : !((Object)this$checked).equals(other$checked)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$productId = this.getProductId();
        String other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) {
            return false;
        }
        String this$productApplyRangeId = this.getProductApplyRangeId();
        String other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !this$productApplyRangeId.equals(other$productApplyRangeId)) {
            return false;
        }
        String this$freeType = this.getFreeType();
        String other$freeType = other.getFreeType();
        if (this$freeType == null ? other$freeType != null : !this$freeType.equals(other$freeType)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !this$_status.equals(other$_status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductSpecFrees;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $checked = this.getChecked();
        result = result * 59 + ($checked == null ? 43 : ((Object)$checked).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : $productApplyRangeId.hashCode());
        String $freeType = this.getFreeType();
        result = result * 59 + ($freeType == null ? 43 : $freeType.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductSpecFrees(id=" + this.getId() + ", productId=" + this.getProductId() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", freeType=" + this.getFreeType() + ", checked=" + this.getChecked() + ", _status=" + this.get_status() + ")";
    }
}

