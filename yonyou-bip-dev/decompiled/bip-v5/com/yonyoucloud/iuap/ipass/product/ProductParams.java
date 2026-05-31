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
public class ProductParams
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String productId;
    private String productApplyRangeId;
    private String param;
    private String param_GroupName;
    private String param_Name;
    private String paramValue;
    private String pubts;
    private String _status;

    public String getId() {
        return this.id;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public String getParam() {
        return this.param;
    }

    public String getParam_GroupName() {
        return this.param_GroupName;
    }

    public String getParam_Name() {
        return this.param_Name;
    }

    public String getParamValue() {
        return this.paramValue;
    }

    public String getPubts() {
        return this.pubts;
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

    public void setProductApplyRangeId(String productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public void setParam_GroupName(String param_GroupName) {
        this.param_GroupName = param_GroupName;
    }

    public void setParam_Name(String param_Name) {
        this.param_Name = param_Name;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductParams)) {
            return false;
        }
        ProductParams other = (ProductParams)o;
        if (!other.canEqual(this)) {
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
        String this$productApplyRangeId = this.getProductApplyRangeId();
        String other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !this$productApplyRangeId.equals(other$productApplyRangeId)) {
            return false;
        }
        String this$param = this.getParam();
        String other$param = other.getParam();
        if (this$param == null ? other$param != null : !this$param.equals(other$param)) {
            return false;
        }
        String this$param_GroupName = this.getParam_GroupName();
        String other$param_GroupName = other.getParam_GroupName();
        if (this$param_GroupName == null ? other$param_GroupName != null : !this$param_GroupName.equals(other$param_GroupName)) {
            return false;
        }
        String this$param_Name = this.getParam_Name();
        String other$param_Name = other.getParam_Name();
        if (this$param_Name == null ? other$param_Name != null : !this$param_Name.equals(other$param_Name)) {
            return false;
        }
        String this$paramValue = this.getParamValue();
        String other$paramValue = other.getParamValue();
        if (this$paramValue == null ? other$paramValue != null : !this$paramValue.equals(other$paramValue)) {
            return false;
        }
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        return !(this$_status == null ? other$_status != null : !this$_status.equals(other$_status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductParams;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : $productApplyRangeId.hashCode());
        String $param = this.getParam();
        result = result * 59 + ($param == null ? 43 : $param.hashCode());
        String $param_GroupName = this.getParam_GroupName();
        result = result * 59 + ($param_GroupName == null ? 43 : $param_GroupName.hashCode());
        String $param_Name = this.getParam_Name();
        result = result * 59 + ($param_Name == null ? 43 : $param_Name.hashCode());
        String $paramValue = this.getParamValue();
        result = result * 59 + ($paramValue == null ? 43 : $paramValue.hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductParams(id=" + this.getId() + ", productId=" + this.getProductId() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", param=" + this.getParam() + ", param_GroupName=" + this.getParam_GroupName() + ", param_Name=" + this.getParam_Name() + ", paramValue=" + this.getParamValue() + ", pubts=" + this.getPubts() + ", _status=" + this.get_status() + ")";
    }
}

