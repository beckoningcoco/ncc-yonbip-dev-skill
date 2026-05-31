/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.productTpl.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplOrderPropertyDTO {
    private Long template;
    private String name;
    private Boolean isShow;
    private Boolean isRequired;
    private String alias;
    private Integer limitNum;
    private String skuPropertyTypeId_propertyType_showItem;
    private String skuPropertyTypeId_alias;
    private String skuPropertyTypeId_userdefMode;
    private String skuPropertyTypeId_type;
    private String promptMessage;
    private String iDataType;
    private String cModifier;
    private String dModifyTime;
    private String iLimitNum;
    private String iOrder;
    private String iDeleted;
    private String skuPropertyTypeId;

    public Long getTemplate() {
        return this.template;
    }

    public String getName() {
        return this.name;
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

    public String getSkuPropertyTypeId_propertyType_showItem() {
        return this.skuPropertyTypeId_propertyType_showItem;
    }

    public String getSkuPropertyTypeId_alias() {
        return this.skuPropertyTypeId_alias;
    }

    public String getSkuPropertyTypeId_userdefMode() {
        return this.skuPropertyTypeId_userdefMode;
    }

    public String getSkuPropertyTypeId_type() {
        return this.skuPropertyTypeId_type;
    }

    public String getPromptMessage() {
        return this.promptMessage;
    }

    public String getIDataType() {
        return this.iDataType;
    }

    public String getCModifier() {
        return this.cModifier;
    }

    public String getDModifyTime() {
        return this.dModifyTime;
    }

    public String getILimitNum() {
        return this.iLimitNum;
    }

    public String getIOrder() {
        return this.iOrder;
    }

    public String getIDeleted() {
        return this.iDeleted;
    }

    public String getSkuPropertyTypeId() {
        return this.skuPropertyTypeId;
    }

    public void setTemplate(Long template) {
        this.template = template;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setSkuPropertyTypeId_propertyType_showItem(String skuPropertyTypeId_propertyType_showItem) {
        this.skuPropertyTypeId_propertyType_showItem = skuPropertyTypeId_propertyType_showItem;
    }

    public void setSkuPropertyTypeId_alias(String skuPropertyTypeId_alias) {
        this.skuPropertyTypeId_alias = skuPropertyTypeId_alias;
    }

    public void setSkuPropertyTypeId_userdefMode(String skuPropertyTypeId_userdefMode) {
        this.skuPropertyTypeId_userdefMode = skuPropertyTypeId_userdefMode;
    }

    public void setSkuPropertyTypeId_type(String skuPropertyTypeId_type) {
        this.skuPropertyTypeId_type = skuPropertyTypeId_type;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }

    public void setIDataType(String iDataType) {
        this.iDataType = iDataType;
    }

    public void setCModifier(String cModifier) {
        this.cModifier = cModifier;
    }

    public void setDModifyTime(String dModifyTime) {
        this.dModifyTime = dModifyTime;
    }

    public void setILimitNum(String iLimitNum) {
        this.iLimitNum = iLimitNum;
    }

    public void setIOrder(String iOrder) {
        this.iOrder = iOrder;
    }

    public void setIDeleted(String iDeleted) {
        this.iDeleted = iDeleted;
    }

    public void setSkuPropertyTypeId(String skuPropertyTypeId) {
        this.skuPropertyTypeId = skuPropertyTypeId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplOrderPropertyDTO)) {
            return false;
        }
        ProductTplOrderPropertyDTO other = (ProductTplOrderPropertyDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$template = this.getTemplate();
        Long other$template = other.getTemplate();
        if (this$template == null ? other$template != null : !((Object)this$template).equals(other$template)) {
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
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$alias = this.getAlias();
        String other$alias = other.getAlias();
        if (this$alias == null ? other$alias != null : !this$alias.equals(other$alias)) {
            return false;
        }
        String this$skuPropertyTypeId_propertyType_showItem = this.getSkuPropertyTypeId_propertyType_showItem();
        String other$skuPropertyTypeId_propertyType_showItem = other.getSkuPropertyTypeId_propertyType_showItem();
        if (this$skuPropertyTypeId_propertyType_showItem == null ? other$skuPropertyTypeId_propertyType_showItem != null : !this$skuPropertyTypeId_propertyType_showItem.equals(other$skuPropertyTypeId_propertyType_showItem)) {
            return false;
        }
        String this$skuPropertyTypeId_alias = this.getSkuPropertyTypeId_alias();
        String other$skuPropertyTypeId_alias = other.getSkuPropertyTypeId_alias();
        if (this$skuPropertyTypeId_alias == null ? other$skuPropertyTypeId_alias != null : !this$skuPropertyTypeId_alias.equals(other$skuPropertyTypeId_alias)) {
            return false;
        }
        String this$skuPropertyTypeId_userdefMode = this.getSkuPropertyTypeId_userdefMode();
        String other$skuPropertyTypeId_userdefMode = other.getSkuPropertyTypeId_userdefMode();
        if (this$skuPropertyTypeId_userdefMode == null ? other$skuPropertyTypeId_userdefMode != null : !this$skuPropertyTypeId_userdefMode.equals(other$skuPropertyTypeId_userdefMode)) {
            return false;
        }
        String this$skuPropertyTypeId_type = this.getSkuPropertyTypeId_type();
        String other$skuPropertyTypeId_type = other.getSkuPropertyTypeId_type();
        if (this$skuPropertyTypeId_type == null ? other$skuPropertyTypeId_type != null : !this$skuPropertyTypeId_type.equals(other$skuPropertyTypeId_type)) {
            return false;
        }
        String this$promptMessage = this.getPromptMessage();
        String other$promptMessage = other.getPromptMessage();
        if (this$promptMessage == null ? other$promptMessage != null : !this$promptMessage.equals(other$promptMessage)) {
            return false;
        }
        String this$iDataType = this.getIDataType();
        String other$iDataType = other.getIDataType();
        if (this$iDataType == null ? other$iDataType != null : !this$iDataType.equals(other$iDataType)) {
            return false;
        }
        String this$cModifier = this.getCModifier();
        String other$cModifier = other.getCModifier();
        if (this$cModifier == null ? other$cModifier != null : !this$cModifier.equals(other$cModifier)) {
            return false;
        }
        String this$dModifyTime = this.getDModifyTime();
        String other$dModifyTime = other.getDModifyTime();
        if (this$dModifyTime == null ? other$dModifyTime != null : !this$dModifyTime.equals(other$dModifyTime)) {
            return false;
        }
        String this$iLimitNum = this.getILimitNum();
        String other$iLimitNum = other.getILimitNum();
        if (this$iLimitNum == null ? other$iLimitNum != null : !this$iLimitNum.equals(other$iLimitNum)) {
            return false;
        }
        String this$iOrder = this.getIOrder();
        String other$iOrder = other.getIOrder();
        if (this$iOrder == null ? other$iOrder != null : !this$iOrder.equals(other$iOrder)) {
            return false;
        }
        String this$iDeleted = this.getIDeleted();
        String other$iDeleted = other.getIDeleted();
        if (this$iDeleted == null ? other$iDeleted != null : !this$iDeleted.equals(other$iDeleted)) {
            return false;
        }
        String this$skuPropertyTypeId = this.getSkuPropertyTypeId();
        String other$skuPropertyTypeId = other.getSkuPropertyTypeId();
        return !(this$skuPropertyTypeId == null ? other$skuPropertyTypeId != null : !this$skuPropertyTypeId.equals(other$skuPropertyTypeId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplOrderPropertyDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $template = this.getTemplate();
        result = result * 59 + ($template == null ? 43 : ((Object)$template).hashCode());
        Boolean $isShow = this.getIsShow();
        result = result * 59 + ($isShow == null ? 43 : ((Object)$isShow).hashCode());
        Boolean $isRequired = this.getIsRequired();
        result = result * 59 + ($isRequired == null ? 43 : ((Object)$isRequired).hashCode());
        Integer $limitNum = this.getLimitNum();
        result = result * 59 + ($limitNum == null ? 43 : ((Object)$limitNum).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $alias = this.getAlias();
        result = result * 59 + ($alias == null ? 43 : $alias.hashCode());
        String $skuPropertyTypeId_propertyType_showItem = this.getSkuPropertyTypeId_propertyType_showItem();
        result = result * 59 + ($skuPropertyTypeId_propertyType_showItem == null ? 43 : $skuPropertyTypeId_propertyType_showItem.hashCode());
        String $skuPropertyTypeId_alias = this.getSkuPropertyTypeId_alias();
        result = result * 59 + ($skuPropertyTypeId_alias == null ? 43 : $skuPropertyTypeId_alias.hashCode());
        String $skuPropertyTypeId_userdefMode = this.getSkuPropertyTypeId_userdefMode();
        result = result * 59 + ($skuPropertyTypeId_userdefMode == null ? 43 : $skuPropertyTypeId_userdefMode.hashCode());
        String $skuPropertyTypeId_type = this.getSkuPropertyTypeId_type();
        result = result * 59 + ($skuPropertyTypeId_type == null ? 43 : $skuPropertyTypeId_type.hashCode());
        String $promptMessage = this.getPromptMessage();
        result = result * 59 + ($promptMessage == null ? 43 : $promptMessage.hashCode());
        String $iDataType = this.getIDataType();
        result = result * 59 + ($iDataType == null ? 43 : $iDataType.hashCode());
        String $cModifier = this.getCModifier();
        result = result * 59 + ($cModifier == null ? 43 : $cModifier.hashCode());
        String $dModifyTime = this.getDModifyTime();
        result = result * 59 + ($dModifyTime == null ? 43 : $dModifyTime.hashCode());
        String $iLimitNum = this.getILimitNum();
        result = result * 59 + ($iLimitNum == null ? 43 : $iLimitNum.hashCode());
        String $iOrder = this.getIOrder();
        result = result * 59 + ($iOrder == null ? 43 : $iOrder.hashCode());
        String $iDeleted = this.getIDeleted();
        result = result * 59 + ($iDeleted == null ? 43 : $iDeleted.hashCode());
        String $skuPropertyTypeId = this.getSkuPropertyTypeId();
        result = result * 59 + ($skuPropertyTypeId == null ? 43 : $skuPropertyTypeId.hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplOrderPropertyDTO(template=" + this.getTemplate() + ", name=" + this.getName() + ", isShow=" + this.getIsShow() + ", isRequired=" + this.getIsRequired() + ", alias=" + this.getAlias() + ", limitNum=" + this.getLimitNum() + ", skuPropertyTypeId_propertyType_showItem=" + this.getSkuPropertyTypeId_propertyType_showItem() + ", skuPropertyTypeId_alias=" + this.getSkuPropertyTypeId_alias() + ", skuPropertyTypeId_userdefMode=" + this.getSkuPropertyTypeId_userdefMode() + ", skuPropertyTypeId_type=" + this.getSkuPropertyTypeId_type() + ", promptMessage=" + this.getPromptMessage() + ", iDataType=" + this.getIDataType() + ", cModifier=" + this.getCModifier() + ", dModifyTime=" + this.getDModifyTime() + ", iLimitNum=" + this.getILimitNum() + ", iOrder=" + this.getIOrder() + ", iDeleted=" + this.getIDeleted() + ", skuPropertyTypeId=" + this.getSkuPropertyTypeId() + ")";
    }
}

