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
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class Productspecitemalbums
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String folder;
    private String productId;
    private String productSpecItemId;
    private Long sort;
    private String type;
    private BigDecimal size;
    private String imgName;
    private String id;
    private String _status;

    public String getFolder() {
        return this.folder;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getProductSpecItemId() {
        return this.productSpecItemId;
    }

    public Long getSort() {
        return this.sort;
    }

    public String getType() {
        return this.type;
    }

    public BigDecimal getSize() {
        return this.size;
    }

    public String getImgName() {
        return this.imgName;
    }

    public String getId() {
        return this.id;
    }

    public String get_status() {
        return this._status;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductSpecItemId(String productSpecItemId) {
        this.productSpecItemId = productSpecItemId;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
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
        if (!(o instanceof Productspecitemalbums)) {
            return false;
        }
        Productspecitemalbums other = (Productspecitemalbums)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$sort = this.getSort();
        Long other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !((Object)this$sort).equals(other$sort)) {
            return false;
        }
        String this$folder = this.getFolder();
        String other$folder = other.getFolder();
        if (this$folder == null ? other$folder != null : !this$folder.equals(other$folder)) {
            return false;
        }
        String this$productId = this.getProductId();
        String other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) {
            return false;
        }
        String this$productSpecItemId = this.getProductSpecItemId();
        String other$productSpecItemId = other.getProductSpecItemId();
        if (this$productSpecItemId == null ? other$productSpecItemId != null : !this$productSpecItemId.equals(other$productSpecItemId)) {
            return false;
        }
        String this$type = this.getType();
        String other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
            return false;
        }
        BigDecimal this$size = this.getSize();
        BigDecimal other$size = other.getSize();
        if (this$size == null ? other$size != null : !((Object)this$size).equals(other$size)) {
            return false;
        }
        String this$imgName = this.getImgName();
        String other$imgName = other.getImgName();
        if (this$imgName == null ? other$imgName != null : !this$imgName.equals(other$imgName)) {
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
        return other instanceof Productspecitemalbums;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : ((Object)$sort).hashCode());
        String $folder = this.getFolder();
        result = result * 59 + ($folder == null ? 43 : $folder.hashCode());
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $productSpecItemId = this.getProductSpecItemId();
        result = result * 59 + ($productSpecItemId == null ? 43 : $productSpecItemId.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        BigDecimal $size = this.getSize();
        result = result * 59 + ($size == null ? 43 : ((Object)$size).hashCode());
        String $imgName = this.getImgName();
        result = result * 59 + ($imgName == null ? 43 : $imgName.hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "Productspecitemalbums(folder=" + this.getFolder() + ", productId=" + this.getProductId() + ", productSpecItemId=" + this.getProductSpecItemId() + ", sort=" + this.getSort() + ", type=" + this.getType() + ", size=" + this.getSize() + ", imgName=" + this.getImgName() + ", id=" + this.getId() + ", _status=" + this.get_status() + ")";
    }
}

