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
public class SkuRelationDTO
implements Serializable {
    private String skuId;
    private Long productId;
    private Long skuIdED;
    private Long skuIdIA;

    public String getSkuId() {
        return this.skuId;
    }

    public Long getProductId() {
        return this.productId;
    }

    public Long getSkuIdED() {
        return this.skuIdED;
    }

    public Long getSkuIdIA() {
        return this.skuIdIA;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setSkuIdED(Long skuIdED) {
        this.skuIdED = skuIdED;
    }

    public void setSkuIdIA(Long skuIdIA) {
        this.skuIdIA = skuIdIA;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SkuRelationDTO)) {
            return false;
        }
        SkuRelationDTO other = (SkuRelationDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$skuIdED = this.getSkuIdED();
        Long other$skuIdED = other.getSkuIdED();
        if (this$skuIdED == null ? other$skuIdED != null : !((Object)this$skuIdED).equals(other$skuIdED)) {
            return false;
        }
        Long this$skuIdIA = this.getSkuIdIA();
        Long other$skuIdIA = other.getSkuIdIA();
        if (this$skuIdIA == null ? other$skuIdIA != null : !((Object)this$skuIdIA).equals(other$skuIdIA)) {
            return false;
        }
        String this$skuId = this.getSkuId();
        String other$skuId = other.getSkuId();
        return !(this$skuId == null ? other$skuId != null : !this$skuId.equals(other$skuId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SkuRelationDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $skuIdED = this.getSkuIdED();
        result = result * 59 + ($skuIdED == null ? 43 : ((Object)$skuIdED).hashCode());
        Long $skuIdIA = this.getSkuIdIA();
        result = result * 59 + ($skuIdIA == null ? 43 : ((Object)$skuIdIA).hashCode());
        String $skuId = this.getSkuId();
        result = result * 59 + ($skuId == null ? 43 : $skuId.hashCode());
        return result;
    }

    public String toString() {
        return "SkuRelationDTO(skuId=" + this.getSkuId() + ", productId=" + this.getProductId() + ", skuIdED=" + this.getSkuIdED() + ", skuIdIA=" + this.getSkuIdIA() + ")";
    }
}

