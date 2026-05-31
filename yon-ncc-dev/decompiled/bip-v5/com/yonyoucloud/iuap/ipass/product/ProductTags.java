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
public class ProductTags
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String tagId;
    private String tagId_name;
    private String productId;
    private String id;
    private String productApplyRangeId;
    private String _status;

    public String getTagId() {
        return this.tagId;
    }

    public String getTagId_name() {
        return this.tagId_name;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getId() {
        return this.id;
    }

    public String getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public String get_status() {
        return this._status;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public void setTagId_name(String tagId_name) {
        this.tagId_name = tagId_name;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductApplyRangeId(String productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTags)) {
            return false;
        }
        ProductTags other = (ProductTags)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$tagId = this.getTagId();
        String other$tagId = other.getTagId();
        if (this$tagId == null ? other$tagId != null : !this$tagId.equals(other$tagId)) {
            return false;
        }
        String this$tagId_name = this.getTagId_name();
        String other$tagId_name = other.getTagId_name();
        if (this$tagId_name == null ? other$tagId_name != null : !this$tagId_name.equals(other$tagId_name)) {
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
        String this$productApplyRangeId = this.getProductApplyRangeId();
        String other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !this$productApplyRangeId.equals(other$productApplyRangeId)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !this$_status.equals(other$_status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTags;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $tagId = this.getTagId();
        result = result * 59 + ($tagId == null ? 43 : $tagId.hashCode());
        String $tagId_name = this.getTagId_name();
        result = result * 59 + ($tagId_name == null ? 43 : $tagId_name.hashCode());
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : $productApplyRangeId.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductTags(tagId=" + this.getTagId() + ", tagId_name=" + this.getTagId_name() + ", productId=" + this.getProductId() + ", id=" + this.getId() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", _status=" + this.get_status() + ")";
    }
}

