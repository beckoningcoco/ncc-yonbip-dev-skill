/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.io.Serializable;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductSpecItemQryDTO
extends UPCPager
implements Serializable {
    private Long productId;
    private List<Long> productIdList;
    private String productCode;
    private List<String> productCodeList;

    public Long getProductId() {
        return this.productId;
    }

    public List<Long> getProductIdList() {
        return this.productIdList;
    }

    public String getProductCode() {
        return this.productCode;
    }

    public List<String> getProductCodeList() {
        return this.productCodeList;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductIdList(List<Long> productIdList) {
        this.productIdList = productIdList;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductCodeList(List<String> productCodeList) {
        this.productCodeList = productCodeList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductSpecItemQryDTO)) {
            return false;
        }
        ProductSpecItemQryDTO other = (ProductSpecItemQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        List<Long> this$productIdList = this.getProductIdList();
        List<Long> other$productIdList = other.getProductIdList();
        if (this$productIdList == null ? other$productIdList != null : !((Object)this$productIdList).equals(other$productIdList)) {
            return false;
        }
        String this$productCode = this.getProductCode();
        String other$productCode = other.getProductCode();
        if (this$productCode == null ? other$productCode != null : !this$productCode.equals(other$productCode)) {
            return false;
        }
        List<String> this$productCodeList = this.getProductCodeList();
        List<String> other$productCodeList = other.getProductCodeList();
        return !(this$productCodeList == null ? other$productCodeList != null : !((Object)this$productCodeList).equals(other$productCodeList));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ProductSpecItemQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        List<Long> $productIdList = this.getProductIdList();
        result = result * 59 + ($productIdList == null ? 43 : ((Object)$productIdList).hashCode());
        String $productCode = this.getProductCode();
        result = result * 59 + ($productCode == null ? 43 : $productCode.hashCode());
        List<String> $productCodeList = this.getProductCodeList();
        result = result * 59 + ($productCodeList == null ? 43 : ((Object)$productCodeList).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ProductSpecItemQryDTO(productId=" + this.getProductId() + ", productIdList=" + this.getProductIdList() + ", productCode=" + this.getProductCode() + ", productCodeList=" + this.getProductCodeList() + ")";
    }
}

