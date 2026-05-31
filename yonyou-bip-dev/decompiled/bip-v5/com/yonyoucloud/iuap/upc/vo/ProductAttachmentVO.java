/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductAttachmentVO {
    private String id;
    private Long productId;
    private String folder;
    private String fileName;
    private Integer sort;
    private String type;
    private Long size;
    private Long attachmentGroupItemId;

    public String getId() {
        return this.id;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getFolder() {
        return this.folder;
    }

    public String getFileName() {
        return this.fileName;
    }

    public Integer getSort() {
        return this.sort;
    }

    public String getType() {
        return this.type;
    }

    public Long getSize() {
        return this.size;
    }

    public Long getAttachmentGroupItemId() {
        return this.attachmentGroupItemId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public void setAttachmentGroupItemId(Long attachmentGroupItemId) {
        this.attachmentGroupItemId = attachmentGroupItemId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductAttachmentVO)) {
            return false;
        }
        ProductAttachmentVO other = (ProductAttachmentVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Integer this$sort = this.getSort();
        Integer other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !((Object)this$sort).equals(other$sort)) {
            return false;
        }
        Long this$size = this.getSize();
        Long other$size = other.getSize();
        if (this$size == null ? other$size != null : !((Object)this$size).equals(other$size)) {
            return false;
        }
        Long this$attachmentGroupItemId = this.getAttachmentGroupItemId();
        Long other$attachmentGroupItemId = other.getAttachmentGroupItemId();
        if (this$attachmentGroupItemId == null ? other$attachmentGroupItemId != null : !((Object)this$attachmentGroupItemId).equals(other$attachmentGroupItemId)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$folder = this.getFolder();
        String other$folder = other.getFolder();
        if (this$folder == null ? other$folder != null : !this$folder.equals(other$folder)) {
            return false;
        }
        String this$fileName = this.getFileName();
        String other$fileName = other.getFileName();
        if (this$fileName == null ? other$fileName != null : !this$fileName.equals(other$fileName)) {
            return false;
        }
        String this$type = this.getType();
        String other$type = other.getType();
        return !(this$type == null ? other$type != null : !this$type.equals(other$type));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductAttachmentVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Integer $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : ((Object)$sort).hashCode());
        Long $size = this.getSize();
        result = result * 59 + ($size == null ? 43 : ((Object)$size).hashCode());
        Long $attachmentGroupItemId = this.getAttachmentGroupItemId();
        result = result * 59 + ($attachmentGroupItemId == null ? 43 : ((Object)$attachmentGroupItemId).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $folder = this.getFolder();
        result = result * 59 + ($folder == null ? 43 : $folder.hashCode());
        String $fileName = this.getFileName();
        result = result * 59 + ($fileName == null ? 43 : $fileName.hashCode());
        String $type = this.getType();
        result = result * 59 + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    public String toString() {
        return "ProductAttachmentVO(id=" + this.getId() + ", productId=" + this.getProductId() + ", folder=" + this.getFolder() + ", fileName=" + this.getFileName() + ", sort=" + this.getSort() + ", type=" + this.getType() + ", size=" + this.getSize() + ", attachmentGroupItemId=" + this.getAttachmentGroupItemId() + ")";
    }
}

