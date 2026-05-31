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
public class ProductDescriptionVO {
    private Long id;
    private Long productId;
    private String description;
    private String mobileDescription;

    public Long getId() {
        return this.id;
    }

    public Long getProductId() {
        return this.productId;
    }

    public String getDescription() {
        return this.description;
    }

    public String getMobileDescription() {
        return this.mobileDescription;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMobileDescription(String mobileDescription) {
        this.mobileDescription = mobileDescription;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductDescriptionVO)) {
            return false;
        }
        ProductDescriptionVO other = (ProductDescriptionVO)o;
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
        String this$description = this.getDescription();
        String other$description = other.getDescription();
        if (this$description == null ? other$description != null : !this$description.equals(other$description)) {
            return false;
        }
        String this$mobileDescription = this.getMobileDescription();
        String other$mobileDescription = other.getMobileDescription();
        return !(this$mobileDescription == null ? other$mobileDescription != null : !this$mobileDescription.equals(other$mobileDescription));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductDescriptionVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        String $description = this.getDescription();
        result = result * 59 + ($description == null ? 43 : $description.hashCode());
        String $mobileDescription = this.getMobileDescription();
        result = result * 59 + ($mobileDescription == null ? 43 : $mobileDescription.hashCode());
        return result;
    }

    public String toString() {
        return "ProductDescriptionVO(id=" + this.getId() + ", productId=" + this.getProductId() + ", description=" + this.getDescription() + ", mobileDescription=" + this.getMobileDescription() + ")";
    }
}

