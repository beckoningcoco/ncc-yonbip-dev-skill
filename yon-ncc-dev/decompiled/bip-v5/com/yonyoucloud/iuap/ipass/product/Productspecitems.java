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
public class Productspecitems
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Object haveImg;
    private String iSpecId_showItem;
    private String specValue;
    private String iSpecId;
    private String lsSpecItems_id;
    private Long iOrder;
    private String productId;
    private String id;
    private String _status;

    public Object getHaveImg() {
        return this.haveImg;
    }

    public String getISpecId_showItem() {
        return this.iSpecId_showItem;
    }

    public String getSpecValue() {
        return this.specValue;
    }

    public String getISpecId() {
        return this.iSpecId;
    }

    public String getLsSpecItems_id() {
        return this.lsSpecItems_id;
    }

    public Long getIOrder() {
        return this.iOrder;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getId() {
        return this.id;
    }

    public String get_status() {
        return this._status;
    }

    public void setHaveImg(Object haveImg) {
        this.haveImg = haveImg;
    }

    public void setISpecId_showItem(String iSpecId_showItem) {
        this.iSpecId_showItem = iSpecId_showItem;
    }

    public void setSpecValue(String specValue) {
        this.specValue = specValue;
    }

    public void setISpecId(String iSpecId) {
        this.iSpecId = iSpecId;
    }

    public void setLsSpecItems_id(String lsSpecItems_id) {
        this.lsSpecItems_id = lsSpecItems_id;
    }

    public void setIOrder(Long iOrder) {
        this.iOrder = iOrder;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Productspecitems)) {
            return false;
        }
        Productspecitems other = (Productspecitems)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$iOrder = this.getIOrder();
        Long other$iOrder = other.getIOrder();
        if (this$iOrder == null ? other$iOrder != null : !((Object)this$iOrder).equals(other$iOrder)) {
            return false;
        }
        Object this$haveImg = this.getHaveImg();
        Object other$haveImg = other.getHaveImg();
        if (this$haveImg == null ? other$haveImg != null : !this$haveImg.equals(other$haveImg)) {
            return false;
        }
        String this$iSpecId_showItem = this.getISpecId_showItem();
        String other$iSpecId_showItem = other.getISpecId_showItem();
        if (this$iSpecId_showItem == null ? other$iSpecId_showItem != null : !this$iSpecId_showItem.equals(other$iSpecId_showItem)) {
            return false;
        }
        String this$specValue = this.getSpecValue();
        String other$specValue = other.getSpecValue();
        if (this$specValue == null ? other$specValue != null : !this$specValue.equals(other$specValue)) {
            return false;
        }
        String this$iSpecId = this.getISpecId();
        String other$iSpecId = other.getISpecId();
        if (this$iSpecId == null ? other$iSpecId != null : !this$iSpecId.equals(other$iSpecId)) {
            return false;
        }
        String this$lsSpecItems_id = this.getLsSpecItems_id();
        String other$lsSpecItems_id = other.getLsSpecItems_id();
        if (this$lsSpecItems_id == null ? other$lsSpecItems_id != null : !this$lsSpecItems_id.equals(other$lsSpecItems_id)) {
            return false;
        }
        String this$productId = this.getProductId();
        String other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !this$_status.equals(other$_status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof Productspecitems;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $iOrder = this.getIOrder();
        result = result * 59 + ($iOrder == null ? 43 : ((Object)$iOrder).hashCode());
        Object $haveImg = this.getHaveImg();
        result = result * 59 + ($haveImg == null ? 43 : $haveImg.hashCode());
        String $iSpecId_showItem = this.getISpecId_showItem();
        result = result * 59 + ($iSpecId_showItem == null ? 43 : $iSpecId_showItem.hashCode());
        String $specValue = this.getSpecValue();
        result = result * 59 + ($specValue == null ? 43 : $specValue.hashCode());
        String $iSpecId = this.getISpecId();
        result = result * 59 + ($iSpecId == null ? 43 : $iSpecId.hashCode());
        String $lsSpecItems_id = this.getLsSpecItems_id();
        result = result * 59 + ($lsSpecItems_id == null ? 43 : $lsSpecItems_id.hashCode());
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "Productspecitems(haveImg=" + this.getHaveImg() + ", iSpecId_showItem=" + this.getISpecId_showItem() + ", specValue=" + this.getSpecValue() + ", iSpecId=" + this.getISpecId() + ", lsSpecItems_id=" + this.getLsSpecItems_id() + ", iOrder=" + this.getIOrder() + ", productId=" + this.getProductId() + ", id=" + this.getId() + ", _status=" + this.get_status() + ")";
    }
}

