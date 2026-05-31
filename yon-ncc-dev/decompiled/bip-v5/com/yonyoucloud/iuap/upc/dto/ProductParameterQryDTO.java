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
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductParameterQryDTO
implements Serializable {
    private List<Long> paramIdList;
    private List<String> paramValueList;
    private List<Long> productIdList;
    private List<Long> productApplyRangeIdList;
    private List<Long> productDetailIdList;

    public List<Long> getParamIdList() {
        return this.paramIdList;
    }

    public List<String> getParamValueList() {
        return this.paramValueList;
    }

    public List<Long> getProductIdList() {
        return this.productIdList;
    }

    public List<Long> getProductApplyRangeIdList() {
        return this.productApplyRangeIdList;
    }

    public List<Long> getProductDetailIdList() {
        return this.productDetailIdList;
    }

    public void setParamIdList(List<Long> paramIdList) {
        this.paramIdList = paramIdList;
    }

    public void setParamValueList(List<String> paramValueList) {
        this.paramValueList = paramValueList;
    }

    public void setProductIdList(List<Long> productIdList) {
        this.productIdList = productIdList;
    }

    public void setProductApplyRangeIdList(List<Long> productApplyRangeIdList) {
        this.productApplyRangeIdList = productApplyRangeIdList;
    }

    public void setProductDetailIdList(List<Long> productDetailIdList) {
        this.productDetailIdList = productDetailIdList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductParameterQryDTO)) {
            return false;
        }
        ProductParameterQryDTO other = (ProductParameterQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        List<Long> this$paramIdList = this.getParamIdList();
        List<Long> other$paramIdList = other.getParamIdList();
        if (this$paramIdList == null ? other$paramIdList != null : !((Object)this$paramIdList).equals(other$paramIdList)) {
            return false;
        }
        List<String> this$paramValueList = this.getParamValueList();
        List<String> other$paramValueList = other.getParamValueList();
        if (this$paramValueList == null ? other$paramValueList != null : !((Object)this$paramValueList).equals(other$paramValueList)) {
            return false;
        }
        List<Long> this$productIdList = this.getProductIdList();
        List<Long> other$productIdList = other.getProductIdList();
        if (this$productIdList == null ? other$productIdList != null : !((Object)this$productIdList).equals(other$productIdList)) {
            return false;
        }
        List<Long> this$productApplyRangeIdList = this.getProductApplyRangeIdList();
        List<Long> other$productApplyRangeIdList = other.getProductApplyRangeIdList();
        if (this$productApplyRangeIdList == null ? other$productApplyRangeIdList != null : !((Object)this$productApplyRangeIdList).equals(other$productApplyRangeIdList)) {
            return false;
        }
        List<Long> this$productDetailIdList = this.getProductDetailIdList();
        List<Long> other$productDetailIdList = other.getProductDetailIdList();
        return !(this$productDetailIdList == null ? other$productDetailIdList != null : !((Object)this$productDetailIdList).equals(other$productDetailIdList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductParameterQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List<Long> $paramIdList = this.getParamIdList();
        result = result * 59 + ($paramIdList == null ? 43 : ((Object)$paramIdList).hashCode());
        List<String> $paramValueList = this.getParamValueList();
        result = result * 59 + ($paramValueList == null ? 43 : ((Object)$paramValueList).hashCode());
        List<Long> $productIdList = this.getProductIdList();
        result = result * 59 + ($productIdList == null ? 43 : ((Object)$productIdList).hashCode());
        List<Long> $productApplyRangeIdList = this.getProductApplyRangeIdList();
        result = result * 59 + ($productApplyRangeIdList == null ? 43 : ((Object)$productApplyRangeIdList).hashCode());
        List<Long> $productDetailIdList = this.getProductDetailIdList();
        result = result * 59 + ($productDetailIdList == null ? 43 : ((Object)$productDetailIdList).hashCode());
        return result;
    }

    public String toString() {
        return "ProductParameterQryDTO(paramIdList=" + this.getParamIdList() + ", paramValueList=" + this.getParamValueList() + ", productIdList=" + this.getProductIdList() + ", productApplyRangeIdList=" + this.getProductApplyRangeIdList() + ", productDetailIdList=" + this.getProductDetailIdList() + ")";
    }
}

