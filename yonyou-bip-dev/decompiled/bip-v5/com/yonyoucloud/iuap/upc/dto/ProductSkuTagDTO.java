/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.sku.dto.SkuBaseDTO;
import java.io.Serializable;
import java.util.Date;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductSkuTagDTO
extends SkuBaseDTO
implements Serializable {
    public Long skuId;
    private String orgId;
    private Long productDetailId;
    private Long productApplyRangeId;
    private Long tagId;
    private String tagCode;
    private String tagName;
    private String tagAbbr;
    private String backGroundColor;
    private String fontColor;
    private String scope;
    private Integer style;
    private String tagBusinessId;
    private Integer tagPosition;
    private Date endTime;
    private Integer front;
    private Integer manage;
    private Integer fastSale;

    public Long getSkuId() {
        return this.skuId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public Long getProductDetailId() {
        return this.productDetailId;
    }

    public Long getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public Long getTagId() {
        return this.tagId;
    }

    public String getTagCode() {
        return this.tagCode;
    }

    public String getTagName() {
        return this.tagName;
    }

    public String getTagAbbr() {
        return this.tagAbbr;
    }

    public String getBackGroundColor() {
        return this.backGroundColor;
    }

    public String getFontColor() {
        return this.fontColor;
    }

    public String getScope() {
        return this.scope;
    }

    public Integer getStyle() {
        return this.style;
    }

    public String getTagBusinessId() {
        return this.tagBusinessId;
    }

    public Integer getTagPosition() {
        return this.tagPosition;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public Integer getFront() {
        return this.front;
    }

    public Integer getManage() {
        return this.manage;
    }

    public Integer getFastSale() {
        return this.fastSale;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setProductDetailId(Long productDetailId) {
        this.productDetailId = productDetailId;
    }

    public void setProductApplyRangeId(Long productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public void setTagCode(String tagCode) {
        this.tagCode = tagCode;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public void setTagAbbr(String tagAbbr) {
        this.tagAbbr = tagAbbr;
    }

    public void setBackGroundColor(String backGroundColor) {
        this.backGroundColor = backGroundColor;
    }

    public void setFontColor(String fontColor) {
        this.fontColor = fontColor;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public void setTagBusinessId(String tagBusinessId) {
        this.tagBusinessId = tagBusinessId;
    }

    public void setTagPosition(Integer tagPosition) {
        this.tagPosition = tagPosition;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setFront(Integer front) {
        this.front = front;
    }

    public void setManage(Integer manage) {
        this.manage = manage;
    }

    public void setFastSale(Integer fastSale) {
        this.fastSale = fastSale;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSkuTagDTO)) {
            return false;
        }
        ProductSkuTagDTO other = (ProductSkuTagDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$skuId = this.getSkuId();
        Long other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !((Object)this$skuId).equals(other$skuId)) {
            return false;
        }
        Long this$productDetailId = this.getProductDetailId();
        Long other$productDetailId = other.getProductDetailId();
        if (this$productDetailId == null ? other$productDetailId != null : !((Object)this$productDetailId).equals(other$productDetailId)) {
            return false;
        }
        Long this$productApplyRangeId = this.getProductApplyRangeId();
        Long other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !((Object)this$productApplyRangeId).equals(other$productApplyRangeId)) {
            return false;
        }
        Long this$tagId = this.getTagId();
        Long other$tagId = other.getTagId();
        if (this$tagId == null ? other$tagId != null : !((Object)this$tagId).equals(other$tagId)) {
            return false;
        }
        Integer this$style = this.getStyle();
        Integer other$style = other.getStyle();
        if (this$style == null ? other$style != null : !((Object)this$style).equals(other$style)) {
            return false;
        }
        Integer this$tagPosition = this.getTagPosition();
        Integer other$tagPosition = other.getTagPosition();
        if (this$tagPosition == null ? other$tagPosition != null : !((Object)this$tagPosition).equals(other$tagPosition)) {
            return false;
        }
        Integer this$front = this.getFront();
        Integer other$front = other.getFront();
        if (this$front == null ? other$front != null : !((Object)this$front).equals(other$front)) {
            return false;
        }
        Integer this$manage = this.getManage();
        Integer other$manage = other.getManage();
        if (this$manage == null ? other$manage != null : !((Object)this$manage).equals(other$manage)) {
            return false;
        }
        Integer this$fastSale = this.getFastSale();
        Integer other$fastSale = other.getFastSale();
        if (this$fastSale == null ? other$fastSale != null : !((Object)this$fastSale).equals(other$fastSale)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$tagCode = this.getTagCode();
        String other$tagCode = other.getTagCode();
        if (this$tagCode == null ? other$tagCode != null : !this$tagCode.equals(other$tagCode)) {
            return false;
        }
        String this$tagName = this.getTagName();
        String other$tagName = other.getTagName();
        if (this$tagName == null ? other$tagName != null : !this$tagName.equals(other$tagName)) {
            return false;
        }
        String this$tagAbbr = this.getTagAbbr();
        String other$tagAbbr = other.getTagAbbr();
        if (this$tagAbbr == null ? other$tagAbbr != null : !this$tagAbbr.equals(other$tagAbbr)) {
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
        String this$scope = this.getScope();
        String other$scope = other.getScope();
        if (this$scope == null ? other$scope != null : !this$scope.equals(other$scope)) {
            return false;
        }
        String this$tagBusinessId = this.getTagBusinessId();
        String other$tagBusinessId = other.getTagBusinessId();
        if (this$tagBusinessId == null ? other$tagBusinessId != null : !this$tagBusinessId.equals(other$tagBusinessId)) {
            return false;
        }
        Date this$endTime = this.getEndTime();
        Date other$endTime = other.getEndTime();
        return !(this$endTime == null ? other$endTime != null : !((Object)this$endTime).equals(other$endTime));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ProductSkuTagDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $skuId = this.getSkuId();
        result = result * 59 + ($skuId == null ? 43 : ((Object)$skuId).hashCode());
        Long $productDetailId = this.getProductDetailId();
        result = result * 59 + ($productDetailId == null ? 43 : ((Object)$productDetailId).hashCode());
        Long $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : ((Object)$productApplyRangeId).hashCode());
        Long $tagId = this.getTagId();
        result = result * 59 + ($tagId == null ? 43 : ((Object)$tagId).hashCode());
        Integer $style = this.getStyle();
        result = result * 59 + ($style == null ? 43 : ((Object)$style).hashCode());
        Integer $tagPosition = this.getTagPosition();
        result = result * 59 + ($tagPosition == null ? 43 : ((Object)$tagPosition).hashCode());
        Integer $front = this.getFront();
        result = result * 59 + ($front == null ? 43 : ((Object)$front).hashCode());
        Integer $manage = this.getManage();
        result = result * 59 + ($manage == null ? 43 : ((Object)$manage).hashCode());
        Integer $fastSale = this.getFastSale();
        result = result * 59 + ($fastSale == null ? 43 : ((Object)$fastSale).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $tagCode = this.getTagCode();
        result = result * 59 + ($tagCode == null ? 43 : $tagCode.hashCode());
        String $tagName = this.getTagName();
        result = result * 59 + ($tagName == null ? 43 : $tagName.hashCode());
        String $tagAbbr = this.getTagAbbr();
        result = result * 59 + ($tagAbbr == null ? 43 : $tagAbbr.hashCode());
        String $backGroundColor = this.getBackGroundColor();
        result = result * 59 + ($backGroundColor == null ? 43 : $backGroundColor.hashCode());
        String $fontColor = this.getFontColor();
        result = result * 59 + ($fontColor == null ? 43 : $fontColor.hashCode());
        String $scope = this.getScope();
        result = result * 59 + ($scope == null ? 43 : $scope.hashCode());
        String $tagBusinessId = this.getTagBusinessId();
        result = result * 59 + ($tagBusinessId == null ? 43 : $tagBusinessId.hashCode());
        Date $endTime = this.getEndTime();
        result = result * 59 + ($endTime == null ? 43 : ((Object)$endTime).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ProductSkuTagDTO(skuId=" + this.getSkuId() + ", orgId=" + this.getOrgId() + ", productDetailId=" + this.getProductDetailId() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", tagId=" + this.getTagId() + ", tagCode=" + this.getTagCode() + ", tagName=" + this.getTagName() + ", tagAbbr=" + this.getTagAbbr() + ", backGroundColor=" + this.getBackGroundColor() + ", fontColor=" + this.getFontColor() + ", scope=" + this.getScope() + ", style=" + this.getStyle() + ", tagBusinessId=" + this.getTagBusinessId() + ", tagPosition=" + this.getTagPosition() + ", endTime=" + this.getEndTime() + ", front=" + this.getFront() + ", manage=" + this.getManage() + ", fastSale=" + this.getFastSale() + ")";
    }
}

