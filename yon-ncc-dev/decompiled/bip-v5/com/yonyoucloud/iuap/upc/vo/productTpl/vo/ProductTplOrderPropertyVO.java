/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.productTpl.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplOrderPropertyVO {
    String propertyTypeShowItem;
    Boolean isShow;
    Boolean isRequired;
    String alias;
    Integer limitNum;

    public String getPropertyTypeShowItem() {
        return this.propertyTypeShowItem;
    }

    public Boolean getIsShow() {
        return this.isShow;
    }

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    public String getAlias() {
        return this.alias;
    }

    public Integer getLimitNum() {
        return this.limitNum;
    }

    public void setPropertyTypeShowItem(String propertyTypeShowItem) {
        this.propertyTypeShowItem = propertyTypeShowItem;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public void setLimitNum(Integer limitNum) {
        this.limitNum = limitNum;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplOrderPropertyVO)) {
            return false;
        }
        ProductTplOrderPropertyVO other = (ProductTplOrderPropertyVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$isShow = this.getIsShow();
        Boolean other$isShow = other.getIsShow();
        if (this$isShow == null ? other$isShow != null : !((Object)this$isShow).equals(other$isShow)) {
            return false;
        }
        Boolean this$isRequired = this.getIsRequired();
        Boolean other$isRequired = other.getIsRequired();
        if (this$isRequired == null ? other$isRequired != null : !((Object)this$isRequired).equals(other$isRequired)) {
            return false;
        }
        Integer this$limitNum = this.getLimitNum();
        Integer other$limitNum = other.getLimitNum();
        if (this$limitNum == null ? other$limitNum != null : !((Object)this$limitNum).equals(other$limitNum)) {
            return false;
        }
        String this$propertyTypeShowItem = this.getPropertyTypeShowItem();
        String other$propertyTypeShowItem = other.getPropertyTypeShowItem();
        if (this$propertyTypeShowItem == null ? other$propertyTypeShowItem != null : !this$propertyTypeShowItem.equals(other$propertyTypeShowItem)) {
            return false;
        }
        String this$alias = this.getAlias();
        String other$alias = other.getAlias();
        return !(this$alias == null ? other$alias != null : !this$alias.equals(other$alias));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplOrderPropertyVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $isShow = this.getIsShow();
        result = result * 59 + ($isShow == null ? 43 : ((Object)$isShow).hashCode());
        Boolean $isRequired = this.getIsRequired();
        result = result * 59 + ($isRequired == null ? 43 : ((Object)$isRequired).hashCode());
        Integer $limitNum = this.getLimitNum();
        result = result * 59 + ($limitNum == null ? 43 : ((Object)$limitNum).hashCode());
        String $propertyTypeShowItem = this.getPropertyTypeShowItem();
        result = result * 59 + ($propertyTypeShowItem == null ? 43 : $propertyTypeShowItem.hashCode());
        String $alias = this.getAlias();
        result = result * 59 + ($alias == null ? 43 : $alias.hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplOrderPropertyVO(propertyTypeShowItem=" + this.getPropertyTypeShowItem() + ", isShow=" + this.getIsShow() + ", isRequired=" + this.getIsRequired() + ", alias=" + this.getAlias() + ", limitNum=" + this.getLimitNum() + ")";
    }
}

