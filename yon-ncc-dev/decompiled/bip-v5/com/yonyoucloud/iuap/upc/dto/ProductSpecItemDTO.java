/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ProductSpecItemAlbumDTO;
import java.io.Serializable;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductSpecItemDTO
implements Serializable {
    private Long id;
    private Long productId;
    private Boolean haveImg;
    private Integer order;
    private Long specId;
    private Long lsSpecItemsId;
    private String specValue;
    private String imgBusinessId;
    private List<ProductSpecItemAlbumDTO> productSpecItemAlbumDTOs;

    public Long getId() {
        return this.id;
    }

    public Long getProductId() {
        return this.productId;
    }

    public Boolean getHaveImg() {
        return this.haveImg;
    }

    public Integer getOrder() {
        return this.order;
    }

    public Long getSpecId() {
        return this.specId;
    }

    public Long getLsSpecItemsId() {
        return this.lsSpecItemsId;
    }

    public String getSpecValue() {
        return this.specValue;
    }

    public String getImgBusinessId() {
        return this.imgBusinessId;
    }

    public List<ProductSpecItemAlbumDTO> getProductSpecItemAlbumDTOs() {
        return this.productSpecItemAlbumDTOs;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setHaveImg(Boolean haveImg) {
        this.haveImg = haveImg;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setSpecId(Long specId) {
        this.specId = specId;
    }

    public void setLsSpecItemsId(Long lsSpecItemsId) {
        this.lsSpecItemsId = lsSpecItemsId;
    }

    public void setSpecValue(String specValue) {
        this.specValue = specValue;
    }

    public void setImgBusinessId(String imgBusinessId) {
        this.imgBusinessId = imgBusinessId;
    }

    public void setProductSpecItemAlbumDTOs(List<ProductSpecItemAlbumDTO> productSpecItemAlbumDTOs) {
        this.productSpecItemAlbumDTOs = productSpecItemAlbumDTOs;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSpecItemDTO)) {
            return false;
        }
        ProductSpecItemDTO other = (ProductSpecItemDTO)o;
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
        Boolean this$haveImg = this.getHaveImg();
        Boolean other$haveImg = other.getHaveImg();
        if (this$haveImg == null ? other$haveImg != null : !((Object)this$haveImg).equals(other$haveImg)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Long this$specId = this.getSpecId();
        Long other$specId = other.getSpecId();
        if (this$specId == null ? other$specId != null : !((Object)this$specId).equals(other$specId)) {
            return false;
        }
        Long this$lsSpecItemsId = this.getLsSpecItemsId();
        Long other$lsSpecItemsId = other.getLsSpecItemsId();
        if (this$lsSpecItemsId == null ? other$lsSpecItemsId != null : !((Object)this$lsSpecItemsId).equals(other$lsSpecItemsId)) {
            return false;
        }
        String this$specValue = this.getSpecValue();
        String other$specValue = other.getSpecValue();
        if (this$specValue == null ? other$specValue != null : !this$specValue.equals(other$specValue)) {
            return false;
        }
        String this$imgBusinessId = this.getImgBusinessId();
        String other$imgBusinessId = other.getImgBusinessId();
        if (this$imgBusinessId == null ? other$imgBusinessId != null : !this$imgBusinessId.equals(other$imgBusinessId)) {
            return false;
        }
        List<ProductSpecItemAlbumDTO> this$productSpecItemAlbumDTOs = this.getProductSpecItemAlbumDTOs();
        List<ProductSpecItemAlbumDTO> other$productSpecItemAlbumDTOs = other.getProductSpecItemAlbumDTOs();
        return !(this$productSpecItemAlbumDTOs == null ? other$productSpecItemAlbumDTOs != null : !((Object)this$productSpecItemAlbumDTOs).equals(other$productSpecItemAlbumDTOs));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductSpecItemDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Boolean $haveImg = this.getHaveImg();
        result = result * 59 + ($haveImg == null ? 43 : ((Object)$haveImg).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Long $specId = this.getSpecId();
        result = result * 59 + ($specId == null ? 43 : ((Object)$specId).hashCode());
        Long $lsSpecItemsId = this.getLsSpecItemsId();
        result = result * 59 + ($lsSpecItemsId == null ? 43 : ((Object)$lsSpecItemsId).hashCode());
        String $specValue = this.getSpecValue();
        result = result * 59 + ($specValue == null ? 43 : $specValue.hashCode());
        String $imgBusinessId = this.getImgBusinessId();
        result = result * 59 + ($imgBusinessId == null ? 43 : $imgBusinessId.hashCode());
        List<ProductSpecItemAlbumDTO> $productSpecItemAlbumDTOs = this.getProductSpecItemAlbumDTOs();
        result = result * 59 + ($productSpecItemAlbumDTOs == null ? 43 : ((Object)$productSpecItemAlbumDTOs).hashCode());
        return result;
    }

    public String toString() {
        return "ProductSpecItemDTO(id=" + this.getId() + ", productId=" + this.getProductId() + ", haveImg=" + this.getHaveImg() + ", order=" + this.getOrder() + ", specId=" + this.getSpecId() + ", lsSpecItemsId=" + this.getLsSpecItemsId() + ", specValue=" + this.getSpecValue() + ", imgBusinessId=" + this.getImgBusinessId() + ", productSpecItemAlbumDTOs=" + this.getProductSpecItemAlbumDTOs() + ")";
    }
}

