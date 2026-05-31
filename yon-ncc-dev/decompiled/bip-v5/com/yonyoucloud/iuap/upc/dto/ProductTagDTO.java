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
public class ProductTagDTO
implements Serializable {
    private Long productId;
    private Long tagId;
    private Long productApplyRangeId;
    private String orgId;
    private String tagName;
    private String backGroundColor;
    private String fontColor;
    private Integer style;
    private String tagBusinessId;

    public Long getProductId() {
        return this.productId;
    }

    public Long getTagId() {
        return this.tagId;
    }

    public Long getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getTagName() {
        return this.tagName;
    }

    public String getBackGroundColor() {
        return this.backGroundColor;
    }

    public String getFontColor() {
        return this.fontColor;
    }

    public Integer getStyle() {
        return this.style;
    }

    public String getTagBusinessId() {
        return this.tagBusinessId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public void setProductApplyRangeId(Long productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public void setBackGroundColor(String backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public void setTagBusinessId(String tagBusinessId) {
        this.tagBusinessId = tagBusinessId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTagDTO)) {
            return false;
        }
        ProductTagDTO other = (ProductTagDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$tagId = this.getTagId();
        Long other$tagId = other.getTagId();
        if (this$tagId == null ? other$tagId != null : !((Object)this$tagId).equals(other$tagId)) {
            return false;
        }
        Long this$productApplyRangeId = this.getProductApplyRangeId();
        Long other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !((Object)this$productApplyRangeId).equals(other$productApplyRangeId)) {
            return false;
        }
        Integer this$style = this.getStyle();
        Integer other$style = other.getStyle();
        if (this$style == null ? other$style != null : !((Object)this$style).equals(other$style)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$tagName = this.getTagName();
        String other$tagName = other.getTagName();
        if (this$tagName == null ? other$tagName != null : !this$tagName.equals(other$tagName)) {
            return false;
        }
        String this$backGroundColor = this.getBackGroundColor();
        String other$backGroundColor = other.getBackGroundColor();
        if (this$backGroundColor == null ? other$backGroundColor != null : !this$backGroundColor.equals(other$backGroundColor)) {
            return false;
        }
        String this$fontColor = this.getFontColor();
        String other$fontColor = other.getFontColor();
        if (this$fontColor == null ? other$fontColor != null : !this$fontColor.equals(other$fontColor)) {
            return false;
        }
        String this$tagBusinessId = this.getTagBusinessId();
        String other$tagBusinessId = other.getTagBusinessId();
        return !(this$tagBusinessId == null ? other$tagBusinessId != null : !this$tagBusinessId.equals(other$tagBusinessId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTagDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $tagId = this.getTagId();
        result = result * 59 + ($tagId == null ? 43 : ((Object)$tagId).hashCode());
        Long $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : ((Object)$productApplyRangeId).hashCode());
        Integer $style = this.getStyle();
        result = result * 59 + ($style == null ? 43 : ((Object)$style).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $tagName = this.getTagName();
        result = result * 59 + ($tagName == null ? 43 : $tagName.hashCode());
        String $backGroundColor = this.getBackGroundColor();
        result = result * 59 + ($backGroundColor == null ? 43 : $backGroundColor.hashCode());
        String $fontColor = this.getFontColor();
        result = result * 59 + ($fontColor == null ? 43 : $fontColor.hashCode());
        String $tagBusinessId = this.getTagBusinessId();
        result = result * 59 + ($tagBusinessId == null ? 43 : $tagBusinessId.hashCode());
        return result;
    }

    public String toString() {
        return "ProductTagDTO(productId=" + this.getProductId() + ", tagId=" + this.getTagId() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", orgId=" + this.getOrgId() + ", tagName=" + this.getTagName() + ", backGroundColor=" + this.getBackGroundColor() + ", fontColor=" + this.getFontColor() + ", style=" + this.getStyle() + ", tagBusinessId=" + this.getTagBusinessId() + ")";
    }
}

