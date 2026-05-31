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
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductIdQryDTO
implements Serializable {
    private Long productClassId;
    private List<Long> productClassIdList;
    private Long productTemplateId;
    private List<Long> productTemplateIdList;
    private Long brandId;
    private List<Long> brandIdList;
    private Long tagId;
    private List<Long> tagIdList;

    public Long getProductClassId() {
        return this.productClassId;
    }

    public List<Long> getProductClassIdList() {
        return this.productClassIdList;
    }

    public Long getProductTemplateId() {
        return this.productTemplateId;
    }

    public List<Long> getProductTemplateIdList() {
        return this.productTemplateIdList;
    }

    public Long getBrandId() {
        return this.brandId;
    }

    public List<Long> getBrandIdList() {
        return this.brandIdList;
    }

    public Long getTagId() {
        return this.tagId;
    }

    public List<Long> getTagIdList() {
        return this.tagIdList;
    }

    public void setProductClassId(Long productClassId) {
        this.productClassId = productClassId;
    }

    public void setProductClassIdList(List<Long> productClassIdList) {
        this.productClassIdList = productClassIdList;
    }

    public void setProductTemplateId(Long productTemplateId) {
        this.productTemplateId = productTemplateId;
    }

    public void setProductTemplateIdList(List<Long> productTemplateIdList) {
        this.productTemplateIdList = productTemplateIdList;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public void setBrandIdList(List<Long> brandIdList) {
        this.brandIdList = brandIdList;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public void setTagIdList(List<Long> tagIdList) {
        this.tagIdList = tagIdList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductIdQryDTO)) {
            return false;
        }
        ProductIdQryDTO other = (ProductIdQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productClassId = this.getProductClassId();
        Long other$productClassId = other.getProductClassId();
        if (this$productClassId == null ? other$productClassId != null : !((Object)this$productClassId).equals(other$productClassId)) {
            return false;
        }
        Long this$productTemplateId = this.getProductTemplateId();
        Long other$productTemplateId = other.getProductTemplateId();
        if (this$productTemplateId == null ? other$productTemplateId != null : !((Object)this$productTemplateId).equals(other$productTemplateId)) {
            return false;
        }
        Long this$brandId = this.getBrandId();
        Long other$brandId = other.getBrandId();
        if (this$brandId == null ? other$brandId != null : !((Object)this$brandId).equals(other$brandId)) {
            return false;
        }
        Long this$tagId = this.getTagId();
        Long other$tagId = other.getTagId();
        if (this$tagId == null ? other$tagId != null : !((Object)this$tagId).equals(other$tagId)) {
            return false;
        }
        List<Long> this$productClassIdList = this.getProductClassIdList();
        List<Long> other$productClassIdList = other.getProductClassIdList();
        if (this$productClassIdList == null ? other$productClassIdList != null : !((Object)this$productClassIdList).equals(other$productClassIdList)) {
            return false;
        }
        List<Long> this$productTemplateIdList = this.getProductTemplateIdList();
        List<Long> other$productTemplateIdList = other.getProductTemplateIdList();
        if (this$productTemplateIdList == null ? other$productTemplateIdList != null : !((Object)this$productTemplateIdList).equals(other$productTemplateIdList)) {
            return false;
        }
        List<Long> this$brandIdList = this.getBrandIdList();
        List<Long> other$brandIdList = other.getBrandIdList();
        if (this$brandIdList == null ? other$brandIdList != null : !((Object)this$brandIdList).equals(other$brandIdList)) {
            return false;
        }
        List<Long> this$tagIdList = this.getTagIdList();
        List<Long> other$tagIdList = other.getTagIdList();
        return !(this$tagIdList == null ? other$tagIdList != null : !((Object)this$tagIdList).equals(other$tagIdList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductIdQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productClassId = this.getProductClassId();
        result = result * 59 + ($productClassId == null ? 43 : ((Object)$productClassId).hashCode());
        Long $productTemplateId = this.getProductTemplateId();
        result = result * 59 + ($productTemplateId == null ? 43 : ((Object)$productTemplateId).hashCode());
        Long $brandId = this.getBrandId();
        result = result * 59 + ($brandId == null ? 43 : ((Object)$brandId).hashCode());
        Long $tagId = this.getTagId();
        result = result * 59 + ($tagId == null ? 43 : ((Object)$tagId).hashCode());
        List<Long> $productClassIdList = this.getProductClassIdList();
        result = result * 59 + ($productClassIdList == null ? 43 : ((Object)$productClassIdList).hashCode());
        List<Long> $productTemplateIdList = this.getProductTemplateIdList();
        result = result * 59 + ($productTemplateIdList == null ? 43 : ((Object)$productTemplateIdList).hashCode());
        List<Long> $brandIdList = this.getBrandIdList();
        result = result * 59 + ($brandIdList == null ? 43 : ((Object)$brandIdList).hashCode());
        List<Long> $tagIdList = this.getTagIdList();
        result = result * 59 + ($tagIdList == null ? 43 : ((Object)$tagIdList).hashCode());
        return result;
    }

    public String toString() {
        return "ProductIdQryDTO(productClassId=" + this.getProductClassId() + ", productClassIdList=" + this.getProductClassIdList() + ", productTemplateId=" + this.getProductTemplateId() + ", productTemplateIdList=" + this.getProductTemplateIdList() + ", brandId=" + this.getBrandId() + ", brandIdList=" + this.getBrandIdList() + ", tagId=" + this.getTagId() + ", tagIdList=" + this.getTagIdList() + ")";
    }
}

