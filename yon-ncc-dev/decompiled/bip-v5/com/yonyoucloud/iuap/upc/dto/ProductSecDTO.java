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
public class ProductSecDTO
implements Serializable {
    private String defineId;
    private String showItem;
    private String length;
    private String maxInputLen;
    private String decimalDigits;
    private String isMultiSel;
    private Boolean isSerInput;
    private Boolean isWebInput;
    private Boolean isEnabled;
    private Boolean isWebShow;
    private Integer propertyType;
    private Integer userdefMode;
    private String userdefAlias;
    private Boolean sourcetype;
    private Boolean isShowSpec;

    public String getDefineId() {
        return this.defineId;
    }

    public String getShowItem() {
        return this.showItem;
    }

    public String getLength() {
        return this.length;
    }

    public String getMaxInputLen() {
        return this.maxInputLen;
    }

    public String getDecimalDigits() {
        return this.decimalDigits;
    }

    public String getIsMultiSel() {
        return this.isMultiSel;
    }

    public Boolean getIsSerInput() {
        return this.isSerInput;
    }

    public Boolean getIsWebInput() {
        return this.isWebInput;
    }

    public Boolean getIsEnabled() {
        return this.isEnabled;
    }

    public Boolean getIsWebShow() {
        return this.isWebShow;
    }

    public Integer getPropertyType() {
        return this.propertyType;
    }

    public Integer getUserdefMode() {
        return this.userdefMode;
    }

    public String getUserdefAlias() {
        return this.userdefAlias;
    }

    public Boolean getSourcetype() {
        return this.sourcetype;
    }

    public Boolean getIsShowSpec() {
        return this.isShowSpec;
    }

    public void setDefineId(String defineId) {
        this.defineId = defineId;
    }

    public void setShowItem(String showItem) {
        this.showItem = showItem;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public void setMaxInputLen(String maxInputLen) {
        this.maxInputLen = maxInputLen;
    }

    public void setDecimalDigits(String decimalDigits) {
        this.decimalDigits = decimalDigits;
    }

    public void setIsMultiSel(String isMultiSel) {
        this.isMultiSel = isMultiSel;
    }

    public void setIsSerInput(Boolean isSerInput) {
        this.isSerInput = isSerInput;
    }

    public void setIsWebInput(Boolean isWebInput) {
        this.isWebInput = isWebInput;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void setIsWebShow(Boolean isWebShow) {
        this.isWebShow = isWebShow;
    }

    public void setPropertyType(Integer propertyType) {
        this.propertyType = propertyType;
    }

    public void setUserdefMode(Integer userdefMode) {
        this.userdefMode = userdefMode;
    }

    public void setUserdefAlias(String userdefAlias) {
        this.userdefAlias = userdefAlias;
    }

    public void setSourcetype(Boolean sourcetype) {
        this.sourcetype = sourcetype;
    }

    public void setIsShowSpec(Boolean isShowSpec) {
        this.isShowSpec = isShowSpec;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSecDTO)) {
            return false;
        }
        ProductSecDTO other = (ProductSecDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$isSerInput = this.getIsSerInput();
        Boolean other$isSerInput = other.getIsSerInput();
        if (this$isSerInput == null ? other$isSerInput != null : !((Object)this$isSerInput).equals(other$isSerInput)) {
            return false;
        }
        Boolean this$isWebInput = this.getIsWebInput();
        Boolean other$isWebInput = other.getIsWebInput();
        if (this$isWebInput == null ? other$isWebInput != null : !((Object)this$isWebInput).equals(other$isWebInput)) {
            return false;
        }
        Boolean this$isEnabled = this.getIsEnabled();
        Boolean other$isEnabled = other.getIsEnabled();
        if (this$isEnabled == null ? other$isEnabled != null : !((Object)this$isEnabled).equals(other$isEnabled)) {
            return false;
        }
        Boolean this$isWebShow = this.getIsWebShow();
        Boolean other$isWebShow = other.getIsWebShow();
        if (this$isWebShow == null ? other$isWebShow != null : !((Object)this$isWebShow).equals(other$isWebShow)) {
            return false;
        }
        Integer this$propertyType = this.getPropertyType();
        Integer other$propertyType = other.getPropertyType();
        if (this$propertyType == null ? other$propertyType != null : !((Object)this$propertyType).equals(other$propertyType)) {
            return false;
        }
        Integer this$userdefMode = this.getUserdefMode();
        Integer other$userdefMode = other.getUserdefMode();
        if (this$userdefMode == null ? other$userdefMode != null : !((Object)this$userdefMode).equals(other$userdefMode)) {
            return false;
        }
        Boolean this$sourcetype = this.getSourcetype();
        Boolean other$sourcetype = other.getSourcetype();
        if (this$sourcetype == null ? other$sourcetype != null : !((Object)this$sourcetype).equals(other$sourcetype)) {
            return false;
        }
        Boolean this$isShowSpec = this.getIsShowSpec();
        Boolean other$isShowSpec = other.getIsShowSpec();
        if (this$isShowSpec == null ? other$isShowSpec != null : !((Object)this$isShowSpec).equals(other$isShowSpec)) {
            return false;
        }
        String this$defineId = this.getDefineId();
        String other$defineId = other.getDefineId();
        if (this$defineId == null ? other$defineId != null : !this$defineId.equals(other$defineId)) {
            return false;
        }
        String this$showItem = this.getShowItem();
        String other$showItem = other.getShowItem();
        if (this$showItem == null ? other$showItem != null : !this$showItem.equals(other$showItem)) {
            return false;
        }
        String this$length = this.getLength();
        String other$length = other.getLength();
        if (this$length == null ? other$length != null : !this$length.equals(other$length)) {
            return false;
        }
        String this$maxInputLen = this.getMaxInputLen();
        String other$maxInputLen = other.getMaxInputLen();
        if (this$maxInputLen == null ? other$maxInputLen != null : !this$maxInputLen.equals(other$maxInputLen)) {
            return false;
        }
        String this$decimalDigits = this.getDecimalDigits();
        String other$decimalDigits = other.getDecimalDigits();
        if (this$decimalDigits == null ? other$decimalDigits != null : !this$decimalDigits.equals(other$decimalDigits)) {
            return false;
        }
        String this$isMultiSel = this.getIsMultiSel();
        String other$isMultiSel = other.getIsMultiSel();
        if (this$isMultiSel == null ? other$isMultiSel != null : !this$isMultiSel.equals(other$isMultiSel)) {
            return false;
        }
        String this$userdefAlias = this.getUserdefAlias();
        String other$userdefAlias = other.getUserdefAlias();
        return !(this$userdefAlias == null ? other$userdefAlias != null : !this$userdefAlias.equals(other$userdefAlias));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductSecDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $isSerInput = this.getIsSerInput();
        result = result * 59 + ($isSerInput == null ? 43 : ((Object)$isSerInput).hashCode());
        Boolean $isWebInput = this.getIsWebInput();
        result = result * 59 + ($isWebInput == null ? 43 : ((Object)$isWebInput).hashCode());
        Boolean $isEnabled = this.getIsEnabled();
        result = result * 59 + ($isEnabled == null ? 43 : ((Object)$isEnabled).hashCode());
        Boolean $isWebShow = this.getIsWebShow();
        result = result * 59 + ($isWebShow == null ? 43 : ((Object)$isWebShow).hashCode());
        Integer $propertyType = this.getPropertyType();
        result = result * 59 + ($propertyType == null ? 43 : ((Object)$propertyType).hashCode());
        Integer $userdefMode = this.getUserdefMode();
        result = result * 59 + ($userdefMode == null ? 43 : ((Object)$userdefMode).hashCode());
        Boolean $sourcetype = this.getSourcetype();
        result = result * 59 + ($sourcetype == null ? 43 : ((Object)$sourcetype).hashCode());
        Boolean $isShowSpec = this.getIsShowSpec();
        result = result * 59 + ($isShowSpec == null ? 43 : ((Object)$isShowSpec).hashCode());
        String $defineId = this.getDefineId();
        result = result * 59 + ($defineId == null ? 43 : $defineId.hashCode());
        String $showItem = this.getShowItem();
        result = result * 59 + ($showItem == null ? 43 : $showItem.hashCode());
        String $length = this.getLength();
        result = result * 59 + ($length == null ? 43 : $length.hashCode());
        String $maxInputLen = this.getMaxInputLen();
        result = result * 59 + ($maxInputLen == null ? 43 : $maxInputLen.hashCode());
        String $decimalDigits = this.getDecimalDigits();
        result = result * 59 + ($decimalDigits == null ? 43 : $decimalDigits.hashCode());
        String $isMultiSel = this.getIsMultiSel();
        result = result * 59 + ($isMultiSel == null ? 43 : $isMultiSel.hashCode());
        String $userdefAlias = this.getUserdefAlias();
        result = result * 59 + ($userdefAlias == null ? 43 : $userdefAlias.hashCode());
        return result;
    }

    public String toString() {
        return "ProductSecDTO(defineId=" + this.getDefineId() + ", showItem=" + this.getShowItem() + ", length=" + this.getLength() + ", maxInputLen=" + this.getMaxInputLen() + ", decimalDigits=" + this.getDecimalDigits() + ", isMultiSel=" + this.getIsMultiSel() + ", isSerInput=" + this.getIsSerInput() + ", isWebInput=" + this.getIsWebInput() + ", isEnabled=" + this.getIsEnabled() + ", isWebShow=" + this.getIsWebShow() + ", propertyType=" + this.getPropertyType() + ", userdefMode=" + this.getUserdefMode() + ", userdefAlias=" + this.getUserdefAlias() + ", sourcetype=" + this.getSourcetype() + ", isShowSpec=" + this.getIsShowSpec() + ")";
    }
}

