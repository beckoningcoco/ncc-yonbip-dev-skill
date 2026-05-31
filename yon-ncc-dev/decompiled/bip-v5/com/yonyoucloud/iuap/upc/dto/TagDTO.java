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
import java.util.Date;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class TagDTO
implements Serializable {
    private Long id;
    private String name;
    private Long tagClass;
    private String tagClassName;
    private String tagClassCode;
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

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Long getTagClass() {
        return this.tagClass;
    }

    public String getTagClassName() {
        return this.tagClassName;
    }

    public String getTagClassCode() {
        return this.tagClassCode;
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

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTagClass(Long tagClass) {
        this.tagClass = tagClass;
    }

    public void setTagClassName(String tagClassName) {
        this.tagClassName = tagClassName;
    }

    public void setTagClassCode(String tagClassCode) {
        this.tagClassCode = tagClassCode;
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

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TagDTO)) {
            return false;
        }
        TagDTO other = (TagDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$tagClass = this.getTagClass();
        Long other$tagClass = other.getTagClass();
        if (this$tagClass == null ? other$tagClass != null : !((Object)this$tagClass).equals(other$tagClass)) {
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
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$tagClassName = this.getTagClassName();
        String other$tagClassName = other.getTagClassName();
        if (this$tagClassName == null ? other$tagClassName != null : !this$tagClassName.equals(other$tagClassName)) {
            return false;
        }
        String this$tagClassCode = this.getTagClassCode();
        String other$tagClassCode = other.getTagClassCode();
        if (this$tagClassCode == null ? other$tagClassCode != null : !this$tagClassCode.equals(other$tagClassCode)) {
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

    protected boolean canEqual(Object other) {
        return other instanceof TagDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $tagClass = this.getTagClass();
        result = result * 59 + ($tagClass == null ? 43 : ((Object)$tagClass).hashCode());
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
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $tagClassName = this.getTagClassName();
        result = result * 59 + ($tagClassName == null ? 43 : $tagClassName.hashCode());
        String $tagClassCode = this.getTagClassCode();
        result = result * 59 + ($tagClassCode == null ? 43 : $tagClassCode.hashCode());
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

    public String toString() {
        return "TagDTO(id=" + this.getId() + ", name=" + this.getName() + ", tagClass=" + this.getTagClass() + ", tagClassName=" + this.getTagClassName() + ", tagClassCode=" + this.getTagClassCode() + ", tagAbbr=" + this.getTagAbbr() + ", backGroundColor=" + this.getBackGroundColor() + ", fontColor=" + this.getFontColor() + ", scope=" + this.getScope() + ", style=" + this.getStyle() + ", tagBusinessId=" + this.getTagBusinessId() + ", tagPosition=" + this.getTagPosition() + ", endTime=" + this.getEndTime() + ", front=" + this.getFront() + ", manage=" + this.getManage() + ", fastSale=" + this.getFastSale() + ")";
    }
}

