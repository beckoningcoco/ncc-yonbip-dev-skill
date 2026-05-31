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
public class ProductParametersDTO
implements Serializable {
    private Long id;
    private Long productId;
    private Long productApplyRangeId;
    private Long param;
    private String paramValue;

    public Long getId() {
        return this.id;
    }

    public Long getProductId() {
        return this.productId;
    }

    public Long getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public Long getParam() {
        return this.param;
    }

    public String getParamValue() {
        return this.paramValue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductApplyRangeId(Long productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setParam(Long param) {
        this.param = param;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductParametersDTO)) {
            return false;
        }
        ProductParametersDTO other = (ProductParametersDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$productApplyRangeId = this.getProductApplyRangeId();
        Long other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !((Object)this$productApplyRangeId).equals(other$productApplyRangeId)) {
            return false;
        }
        Long this$param = this.getParam();
        Long other$param = other.getParam();
        if (this$param == null ? other$param != null : !((Object)this$param).equals(other$param)) {
            return false;
        }
        String this$paramValue = this.getParamValue();
        String other$paramValue = other.getParamValue();
        return !(this$paramValue == null ? other$paramValue != null : !this$paramValue.equals(other$paramValue));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductParametersDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : ((Object)$productApplyRangeId).hashCode());
        Long $param = this.getParam();
        result = result * 59 + ($param == null ? 43 : ((Object)$param).hashCode());
        String $paramValue = this.getParamValue();
        result = result * 59 + ($paramValue == null ? 43 : $paramValue.hashCode());
        return result;
    }

    public String toString() {
        return "ProductParametersDTO(id=" + this.getId() + ", productId=" + this.getProductId() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", param=" + this.getParam() + ", paramValue=" + this.getParamValue() + ")";
    }
}

