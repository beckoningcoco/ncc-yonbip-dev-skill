/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductSpecItemAlbumDTO
implements Serializable {
    private Long id;
    private Long productId;
    private Long productSpecItemId;
    private String folder;
    private String imageThumbPath;
    private String imgName;
    private Long productFreeCharacterItemId;

    public Long getId() {
        return this.id;
    }

    public Long getProductId() {
        return this.productId;
    }

    public Long getProductSpecItemId() {
        return this.productSpecItemId;
    }

    public String getFolder() {
        return this.folder;
    }

    public String getImageThumbPath() {
        return this.imageThumbPath;
    }

    public String getImgName() {
        return this.imgName;
    }

    public Long getProductFreeCharacterItemId() {
        return this.productFreeCharacterItemId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductSpecItemId(Long productSpecItemId) {
        this.productSpecItemId = productSpecItemId;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public void setImageThumbPath(String imageThumbPath) {
        this.imageThumbPath = imageThumbPath;
    }

    public void setImgName(String imgName) {
        this.imgName = imgName;
    }

    public void setProductFreeCharacterItemId(Long productFreeCharacterItemId) {
        this.productFreeCharacterItemId = productFreeCharacterItemId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSpecItemAlbumDTO)) {
            return false;
        }
        ProductSpecItemAlbumDTO other = (ProductSpecItemAlbumDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$productSpecItemId = this.getProductSpecItemId();
        Long other$productSpecItemId = other.getProductSpecItemId();
        if (this$productSpecItemId == null ? other$productSpecItemId != null : !((Object)this$productSpecItemId).equals(other$productSpecItemId)) {
            return false;
        }
        Long this$productFreeCharacterItemId = this.getProductFreeCharacterItemId();
        Long other$productFreeCharacterItemId = other.getProductFreeCharacterItemId();
        if (this$productFreeCharacterItemId == null ? other$productFreeCharacterItemId != null : !((Object)this$productFreeCharacterItemId).equals(other$productFreeCharacterItemId)) {
            return false;
        }
        String this$folder = this.getFolder();
        String other$folder = other.getFolder();
        if (this$folder == null ? other$folder != null : !this$folder.equals(other$folder)) {
            return false;
        }
        String this$imageThumbPath = this.getImageThumbPath();
        String other$imageThumbPath = other.getImageThumbPath();
        if (this$imageThumbPath == null ? other$imageThumbPath != null : !this$imageThumbPath.equals(other$imageThumbPath)) {
            return false;
        }
        String this$imgName = this.getImgName();
        String other$imgName = other.getImgName();
        return !(this$imgName == null ? other$imgName != null : !this$imgName.equals(other$imgName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductSpecItemAlbumDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $productSpecItemId = this.getProductSpecItemId();
        result = result * 59 + ($productSpecItemId == null ? 43 : ((Object)$productSpecItemId).hashCode());
        Long $productFreeCharacterItemId = this.getProductFreeCharacterItemId();
        result = result * 59 + ($productFreeCharacterItemId == null ? 43 : ((Object)$productFreeCharacterItemId).hashCode());
        String $folder = this.getFolder();
        result = result * 59 + ($folder == null ? 43 : $folder.hashCode());
        String $imageThumbPath = this.getImageThumbPath();
        result = result * 59 + ($imageThumbPath == null ? 43 : $imageThumbPath.hashCode());
        String $imgName = this.getImgName();
        result = result * 59 + ($imgName == null ? 43 : $imgName.hashCode());
        return result;
    }

    public String toString() {
        return "ProductSpecItemAlbumDTO(id=" + this.getId() + ", productId=" + this.getProductId() + ", productSpecItemId=" + this.getProductSpecItemId() + ", folder=" + this.getFolder() + ", imageThumbPath=" + this.getImageThumbPath() + ", imgName=" + this.getImgName() + ", productFreeCharacterItemId=" + this.getProductFreeCharacterItemId() + ")";
    }
}

