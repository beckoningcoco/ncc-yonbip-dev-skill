/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import java.util.List;

public class GoodsproductscomparisonQueryParam {
    private Long positionId;
    private List<Long> positionIds;
    private Long productId;
    private List<Long> productIds;
    private Long warehouseId;
    private List<Long> warehouseIds;
    @Deprecated
    private Long tenantId;
    private String ytenantId;

    public Long getPositionId() {
        return this.positionId;
    }

    public List<Long> getPositionIds() {
        return this.positionIds;
    }

    public Long getProductId() {
        return this.productId;
    }

    public List<Long> getProductIds() {
        return this.productIds;
    }

    public Long getWarehouseId() {
        return this.warehouseId;
    }

    public List<Long> getWarehouseIds() {
        return this.warehouseIds;
    }

    @Deprecated
    public Long getTenantId() {
        return this.tenantId;
    }

    public String getYtenantId() {
        return this.ytenantId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public void setPositionIds(List<Long> positionIds) {
        this.positionIds = positionIds;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setProductIds(List<Long> productIds) {
        this.productIds = productIds;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public void setWarehouseIds(List<Long> warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    @Deprecated
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public void setYtenantId(String ytenantId) {
        this.ytenantId = ytenantId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GoodsproductscomparisonQueryParam)) {
            return false;
        }
        GoodsproductscomparisonQueryParam other = (GoodsproductscomparisonQueryParam)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$positionId = this.getPositionId();
        Long other$positionId = other.getPositionId();
        if (this$positionId == null ? other$positionId != null : !((Object)this$positionId).equals(other$positionId)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Long this$warehouseId = this.getWarehouseId();
        Long other$warehouseId = other.getWarehouseId();
        if (this$warehouseId == null ? other$warehouseId != null : !((Object)this$warehouseId).equals(other$warehouseId)) {
            return false;
        }
        Long this$tenantId = this.getTenantId();
        Long other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !((Object)this$tenantId).equals(other$tenantId)) {
            return false;
        }
        List<Long> this$positionIds = this.getPositionIds();
        List<Long> other$positionIds = other.getPositionIds();
        if (this$positionIds == null ? other$positionIds != null : !((Object)this$positionIds).equals(other$positionIds)) {
            return false;
        }
        List<Long> this$productIds = this.getProductIds();
        List<Long> other$productIds = other.getProductIds();
        if (this$productIds == null ? other$productIds != null : !((Object)this$productIds).equals(other$productIds)) {
            return false;
        }
        List<Long> this$warehouseIds = this.getWarehouseIds();
        List<Long> other$warehouseIds = other.getWarehouseIds();
        if (this$warehouseIds == null ? other$warehouseIds != null : !((Object)this$warehouseIds).equals(other$warehouseIds)) {
            return false;
        }
        String this$ytenantId = this.getYtenantId();
        String other$ytenantId = other.getYtenantId();
        return !(this$ytenantId == null ? other$ytenantId != null : !this$ytenantId.equals(other$ytenantId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof GoodsproductscomparisonQueryParam;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $positionId = this.getPositionId();
        result = result * 59 + ($positionId == null ? 43 : ((Object)$positionId).hashCode());
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Long $warehouseId = this.getWarehouseId();
        result = result * 59 + ($warehouseId == null ? 43 : ((Object)$warehouseId).hashCode());
        Long $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : ((Object)$tenantId).hashCode());
        List<Long> $positionIds = this.getPositionIds();
        result = result * 59 + ($positionIds == null ? 43 : ((Object)$positionIds).hashCode());
        List<Long> $productIds = this.getProductIds();
        result = result * 59 + ($productIds == null ? 43 : ((Object)$productIds).hashCode());
        List<Long> $warehouseIds = this.getWarehouseIds();
        result = result * 59 + ($warehouseIds == null ? 43 : ((Object)$warehouseIds).hashCode());
        String $ytenantId = this.getYtenantId();
        result = result * 59 + ($ytenantId == null ? 43 : $ytenantId.hashCode());
        return result;
    }

    public String toString() {
        return "GoodsproductscomparisonQueryParam(positionId=" + this.getPositionId() + ", positionIds=" + this.getPositionIds() + ", productId=" + this.getProductId() + ", productIds=" + this.getProductIds() + ", warehouseId=" + this.getWarehouseId() + ", warehouseIds=" + this.getWarehouseIds() + ", tenantId=" + this.getTenantId() + ", ytenantId=" + this.getYtenantId() + ")";
    }
}

