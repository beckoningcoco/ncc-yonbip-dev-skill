/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class DefaultSKUOrderProperties
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String productId;
    private String skuId;
    private String productApplyRangeId;
    private String skuPropertyTypeId;
    private String skuPropertyTypeId_showItem;
    private String skuPropertyTypeId_alias;
    private String skuPropertyTypeId_type;
    private String skuPropertyTypeId_userdefMode;
    private Long isShow;
    private Long isRequired;
    private Long iLimitNum;
    private Long iOrder;
    private String _status;

    public String getId() {
        return this.id;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getSkuId() {
        return this.skuId;
    }

    public String getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public String getSkuPropertyTypeId() {
        return this.skuPropertyTypeId;
    }

    public String getSkuPropertyTypeId_showItem() {
        return this.skuPropertyTypeId_showItem;
    }

    public String getSkuPropertyTypeId_alias() {
        return this.skuPropertyTypeId_alias;
    }

    public String getSkuPropertyTypeId_type() {
        return this.skuPropertyTypeId_type;
    }

    public String getSkuPropertyTypeId_userdefMode() {
        return this.skuPropertyTypeId_userdefMode;
    }

    public Long getIsShow() {
        return this.isShow;
    }

    public Long getIsRequired() {
        return this.isRequired;
    }

    public Long getILimitNum() {
        return this.iLimitNum;
    }

    public Long getIOrder() {
        return this.iOrder;
    }

    public String get_status() {
        return this._status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public void setProductApplyRangeId(String productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setSkuPropertyTypeId(String skuPropertyTypeId) {
        this.skuPropertyTypeId = skuPropertyTypeId;
    }

    public void setSkuPropertyTypeId_showItem(String skuPropertyTypeId_showItem) {
        this.skuPropertyTypeId_showItem = skuPropertyTypeId_showItem;
    }

    public void setSkuPropertyTypeId_alias(String skuPropertyTypeId_alias) {
        this.skuPropertyTypeId_alias = skuPropertyTypeId_alias;
    }

    public void setSkuPropertyTypeId_type(String skuPropertyTypeId_type) {
        this.skuPropertyTypeId_type = skuPropertyTypeId_type;
    }

    public void setSkuPropertyTypeId_userdefMode(String skuPropertyTypeId_userdefMode) {
        this.skuPropertyTypeId_userdefMode = skuPropertyTypeId_userdefMode;
    }

    public void setIsShow(Long isShow) {
        this.isShow = isShow;
    }

    public void setIsRequired(Long isRequired) {
        this.isRequired = isRequired;
    }

    public void setILimitNum(Long iLimitNum) {
        this.iLimitNum = iLimitNum;
    }

    public void setIOrder(Long iOrder) {
        this.iOrder = iOrder;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DefaultSKUOrderProperties)) {
            return false;
        }
        DefaultSKUOrderProperties other = (DefaultSKUOrderProperties)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$isShow = this.getIsShow();
        Long other$isShow = other.getIsShow();
        if (this$isShow == null ? other$isShow != null : !((Object)this$isShow).equals(other$isShow)) {
            return false;
        }
        Long this$isRequired = this.getIsRequired();
        Long other$isRequired = other.getIsRequired();
        if (this$isRequired == null ? other$isRequired != null : !((Object)this$isRequired).equals(other$isRequired)) {
            return false;
        }
        Long this$iLimitNum = this.getILimitNum();
        Long other$iLimitNum = other.getILimitNum();
        if (this$iLimitNum == null ? other$iLimitNum != null : !((Object)this$iLimitNum).equals(other$iLimitNum)) {
            return false;
        }
        Long this$iOrder = this.getIOrder();
        Long other$iOrder = other.getIOrder();
        if (this$iOrder == null ? other$iOrder != null : !((Object)this$iOrder).equals(other$iOrder)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$productId = this.getProductId();
        String other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) {
            return false;
        }
        String this$skuId = this.getSkuId();
        String other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId)) {
            return false;
        }
        String this$productApplyRangeId = this.getProductApplyRangeId();
        String other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !this$productApplyRangeId.equals(other$productApplyRangeId)) {
            return false;
        }
        String this$skuPropertyTypeId = this.getSkuPropertyTypeId();
        String other$skuPropertyTypeId = other.getSkuPropertyTypeId();
        if (this$skuPropertyTypeId == null ? other$skuPropertyTypeId != null : !this$skuPropertyTypeId.equals(other$skuPropertyTypeId)) {
            return false;
        }
        String this$skuPropertyTypeId_showItem = this.getSkuPropertyTypeId_showItem();
        String other$skuPropertyTypeId_showItem = other.getSkuPropertyTypeId_showItem();
        if (this$skuPropertyTypeId_showItem == null ? other$skuPropertyTypeId_showItem != null : !this$skuPropertyTypeId_showItem.equals(other$skuPropertyTypeId_showItem)) {
            return false;
        }
        String this$skuPropertyTypeId_alias = this.getSkuPropertyTypeId_alias();
        String other$skuPropertyTypeId_alias = other.getSkuPropertyTypeId_alias();
        if (this$skuPropertyTypeId_alias == null ? other$skuPropertyTypeId_alias != null : !this$skuPropertyTypeId_alias.equals(other$skuPropertyTypeId_alias)) {
            return false;
        }
        String this$skuPropertyTypeId_type = this.getSkuPropertyTypeId_type();
        String other$skuPropertyTypeId_type = other.getSkuPropertyTypeId_type();
        if (this$skuPropertyTypeId_type == null ? other$skuPropertyTypeId_type != null : !this$skuPropertyTypeId_type.equals(other$skuPropertyTypeId_type)) {
            return false;
        }
        String this$skuPropertyTypeId_userdefMode = this.getSkuPropertyTypeId_userdefMode();
        String other$skuPropertyTypeId_userdefMode = other.getSkuPropertyTypeId_userdefMode();
        if (this$skuPropertyTypeId_userdefMode == null ? other$skuPropertyTypeId_userdefMode != null : !this$skuPropertyTypeId_userdefMode.equals(other$skuPropertyTypeId_userdefMode)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !this$_status.equals(other$_status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DefaultSKUOrderProperties;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $isShow = this.getIsShow();
        result = result * 59 + ($isShow == null ? 43 : ((Object)$isShow).hashCode());
        Long $isRequired = this.getIsRequired();
        result = result * 59 + ($isRequired == null ? 43 : ((Object)$isRequired).hashCode());
        Long $iLimitNum = this.getILimitNum();
        result = result * 59 + ($iLimitNum == null ? 43 : ((Object)$iLimitNum).hashCode());
        Long $iOrder = this.getIOrder();
        result = result * 59 + ($iOrder == null ? 43 : ((Object)$iOrder).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $skuId = this.getSkuId();
        result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
        String $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : $productApplyRangeId.hashCode());
        String $skuPropertyTypeId = this.getSkuPropertyTypeId();
        result = result * 59 + ($skuPropertyTypeId == null ? 43 : $skuPropertyTypeId.hashCode());
        String $skuPropertyTypeId_showItem = this.getSkuPropertyTypeId_showItem();
        result = result * 59 + ($skuPropertyTypeId_showItem == null ? 43 : $skuPropertyTypeId_showItem.hashCode());
        String $skuPropertyTypeId_alias = this.getSkuPropertyTypeId_alias();
        result = result * 59 + ($skuPropertyTypeId_alias == null ? 43 : $skuPropertyTypeId_alias.hashCode());
        String $skuPropertyTypeId_type = this.getSkuPropertyTypeId_type();
        result = result * 59 + ($skuPropertyTypeId_type == null ? 43 : $skuPropertyTypeId_type.hashCode());
        String $skuPropertyTypeId_userdefMode = this.getSkuPropertyTypeId_userdefMode();
        result = result * 59 + ($skuPropertyTypeId_userdefMode == null ? 43 : $skuPropertyTypeId_userdefMode.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "DefaultSKUOrderProperties(id=" + this.getId() + ", productId=" + this.getProductId() + ", skuId=" + this.getSkuId() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", skuPropertyTypeId=" + this.getSkuPropertyTypeId() + ", skuPropertyTypeId_showItem=" + this.getSkuPropertyTypeId_showItem() + ", skuPropertyTypeId_alias=" + this.getSkuPropertyTypeId_alias() + ", skuPropertyTypeId_type=" + this.getSkuPropertyTypeId_type() + ", skuPropertyTypeId_userdefMode=" + this.getSkuPropertyTypeId_userdefMode() + ", isShow=" + this.getIsShow() + ", isRequired=" + this.getIsRequired() + ", iLimitNum=" + this.getILimitNum() + ", iOrder=" + this.getIOrder() + ", _status=" + this.get_status() + ")";
    }
}

