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
public class ProductBarCodes
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String productId;
    private String id;
    private String pubts;
    private String barCode;
    private String _status;

    public String getProductId() {
        return this.productId;
    }

    public String getId() {
        return this.id;
    }

    public String getPubts() {
        return this.pubts;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public String get_status() {
        return this._status;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductBarCodes)) {
            return false;
        }
        ProductBarCodes other = (ProductBarCodes)o;
        if (!other.canEqual(this)) {
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
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts)) {
            return false;
        }
        String this$barCode = this.getBarCode();
        String other$barCode = other.getBarCode();
        if (this$barCode == null ? other$barCode != null : !this$barCode.equals(other$barCode)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !this$_status.equals(other$_status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductBarCodes;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        String $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : $barCode.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductBarCodes(productId=" + this.getProductId() + ", id=" + this.getId() + ", pubts=" + this.getPubts() + ", barCode=" + this.getBarCode() + ", _status=" + this.get_status() + ")";
    }
}

