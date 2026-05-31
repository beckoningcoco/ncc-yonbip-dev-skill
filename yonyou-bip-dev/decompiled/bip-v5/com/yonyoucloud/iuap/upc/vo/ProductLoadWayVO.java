/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductLoadWayVO {
    private Long id;
    private Long loadWay;
    private String loadWayCode;
    private String loadWayName;
    private Long productId;
    private Long productDetailId;
    private Long productApplyRangeId;
    private String status;

    public Long getId() {
        return this.id;
    }

    public Long getLoadWay() {
        return this.loadWay;
    }

    public String getLoadWayCode() {
        return this.loadWayCode;
    }

    public String getLoadWayName() {
        return this.loadWayName;
    }

    public Long getProductId() {
        return this.productId;
    }

    public Long getProductDetailId() {
        return this.productDetailId;
    }

    public Long getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLoadWay(Long loadWay) {
        this.loadWay = loadWay;
    }

    public void setLoadWayCode(String loadWayCode) {
        this.loadWayCode = loadWayCode;
    }

    public void setLoadWayName(String loadWayName) {
        this.loadWayName = loadWayName;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductDetailId(Long productDetailId) {
        this.productDetailId = productDetailId;
    }

    public void setProductApplyRangeId(Long productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductLoadWayVO)) {
            return false;
        }
        ProductLoadWayVO other = (ProductLoadWayVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$loadWay = this.getLoadWay();
        Long other$loadWay = other.getLoadWay();
        if (this$loadWay == null ? other$loadWay != null : !((Object)this$loadWay).equals(other$loadWay)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$productDetailId = this.getProductDetailId();
        Long other$productDetailId = other.getProductDetailId();
        if (this$productDetailId == null ? other$productDetailId != null : !((Object)this$productDetailId).equals(other$productDetailId)) {
            return false;
        }
        Long this$productApplyRangeId = this.getProductApplyRangeId();
        Long other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !((Object)this$productApplyRangeId).equals(other$productApplyRangeId)) {
            return false;
        }
        String this$loadWayCode = this.getLoadWayCode();
        String other$loadWayCode = other.getLoadWayCode();
        if (this$loadWayCode == null ? other$loadWayCode != null : !this$loadWayCode.equals(other$loadWayCode)) {
            return false;
        }
        String this$loadWayName = this.getLoadWayName();
        String other$loadWayName = other.getLoadWayName();
        if (this$loadWayName == null ? other$loadWayName != null : !this$loadWayName.equals(other$loadWayName)) {
            return false;
        }
        String this$status = this.getStatus();
        String other$status = other.getStatus();
        return !(this$status == null ? other$status != null : !this$status.equals(other$status));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductLoadWayVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $loadWay = this.getLoadWay();
        result = result * 59 + ($loadWay == null ? 43 : ((Object)$loadWay).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $productDetailId = this.getProductDetailId();
        result = result * 59 + ($productDetailId == null ? 43 : ((Object)$productDetailId).hashCode());
        Long $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : ((Object)$productApplyRangeId).hashCode());
        String $loadWayCode = this.getLoadWayCode();
        result = result * 59 + ($loadWayCode == null ? 43 : $loadWayCode.hashCode());
        String $loadWayName = this.getLoadWayName();
        result = result * 59 + ($loadWayName == null ? 43 : $loadWayName.hashCode());
        String $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : $status.hashCode());
        return result;
    }

    public String toString() {
        return "ProductLoadWayVO(id=" + this.getId() + ", loadWay=" + this.getLoadWay() + ", loadWayCode=" + this.getLoadWayCode() + ", loadWayName=" + this.getLoadWayName() + ", productId=" + this.getProductId() + ", productDetailId=" + this.getProductDetailId() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", status=" + this.getStatus() + ")";
    }
}

