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
public class ProductAttachments
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String folder;
    private String productId;
    private Long sort;
    private String type;
    private Long size;
    private String fileName;
    private String id;
    private String _status;

    public String getFolder() {
        return this.folder;
    }

    public String getProductId() {
        return this.productId;
    }

    public Long getSort() {
        return this.sort;
    }

    public String getType() {
        return this.type;
    }

    public Long getSize() {
        return this.size;
    }

    public String getFileName() {
        return this.fileName;
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

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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
        if (!(o instanceof ProductAttachments)) {
            return false;
        }
        ProductAttachments other = (ProductAttachments)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$sort = this.getSort();
        Long other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !((Object)this$sort).equals(other$sort)) {
            return false;
        }
        Long this$size = this.getSize();
        Long other$size = other.getSize();
        if (this$size == null ? other$size != null : !((Object)this$size).equals(other$size)) {
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
        String this$type = this.getType();
        String other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) {
            return false;
        }
        String this$fileName = this.getFileName();
        String other$fileName = other.getFileName();
        if (this$fileName == null ? other$fileName != null : !this$fileName.equals(other$fileName)) {
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
        return other instanceof ProductAttachments;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : ((Object)$sort).hashCode());
        Long $size = this.getSize();
        result = result * 59 + ($size == null ? 43 : ((Object)$size).hashCode());
        String $folder = this.getFolder();
        result = result * 59 + ($folder == null ? 43 : $folder.hashCode());
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        String $fileName = this.getFileName();
        result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductAttachments(folder=" + this.getFolder() + ", productId=" + this.getProductId() + ", sort=" + this.getSort() + ", type=" + this.getType() + ", size=" + this.getSize() + ", fileName=" + this.getFileName() + ", id=" + this.getId() + ", _status=" + this.get_status() + ")";
    }
}

