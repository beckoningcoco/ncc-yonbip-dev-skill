/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.sku.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.apdoc.sdk.dto.pub.BaseQueryVO;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class SkuQryVO
extends BaseQueryVO {
    private List<String> productCodeList;
    private List<Long> productIdList;

    public List<String> getProductCodeList() {
        return this.productCodeList;
    }

    public List<Long> getProductIdList() {
        return this.productIdList;
    }

    public void setProductCodeList(List<String> productCodeList) {
        this.productCodeList = productCodeList;
    }

    public void setProductIdList(List<Long> productIdList) {
        this.productIdList = productIdList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SkuQryVO)) {
            return false;
        }
        SkuQryVO other = (SkuQryVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        List<String> this$productCodeList = this.getProductCodeList();
        List<String> other$productCodeList = other.getProductCodeList();
        if (this$productCodeList == null ? other$productCodeList != null : !((Object)this$productCodeList).equals(other$productCodeList)) {
            return false;
        }
        List<Long> this$productIdList = this.getProductIdList();
        List<Long> other$productIdList = other.getProductIdList();
        return !(this$productIdList == null ? other$productIdList != null : !((Object)this$productIdList).equals(other$productIdList));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SkuQryVO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        List<String> $productCodeList = this.getProductCodeList();
        result = result * 59 + ($productCodeList == null ? 43 : ((Object)$productCodeList).hashCode());
        List<Long> $productIdList = this.getProductIdList();
        result = result * 59 + ($productIdList == null ? 43 : ((Object)$productIdList).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "SkuQryVO(productCodeList=" + this.getProductCodeList() + ", productIdList=" + this.getProductIdList() + ")";
    }
}

