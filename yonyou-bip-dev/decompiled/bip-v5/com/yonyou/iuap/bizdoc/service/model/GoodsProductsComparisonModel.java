/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

public class GoodsProductsComparisonModel {
    private Long id;
    private Long positionId;
    private Long prodIuctd;
    private Long warehouseId;
    private Integer outPriority;
    private Integer inPriority;
    private Long tenantId;
    private String ytenantId;

    public Long getId() {
        return this.id;
    }

    public Long getPositionId() {
        return this.positionId;
    }

    public Long getProdIuctd() {
        return this.prodIuctd;
    }

    public Long getWarehouseId() {
        return this.warehouseId;
    }

    public Integer getOutPriority() {
        return this.outPriority;
    }

    public Integer getInPriority() {
        return this.inPriority;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public String getYtenantId() {
        return this.ytenantId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public void setProdIuctd(Long prodIuctd) {
        this.prodIuctd = prodIuctd;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public void setOutPriority(Integer outPriority) {
        this.outPriority = outPriority;
    }

    public void setInPriority(Integer inPriority) {
        this.inPriority = inPriority;
    }

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
        if (!(o instanceof GoodsProductsComparisonModel)) {
            return false;
        }
        GoodsProductsComparisonModel other = (GoodsProductsComparisonModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$positionId = this.getPositionId();
        Long other$positionId = other.getPositionId();
        if (this$positionId == null ? other$positionId != null : !((Object)this$positionId).equals(other$positionId)) {
            return false;
        }
        Long this$prodIuctd = this.getProdIuctd();
        Long other$prodIuctd = other.getProdIuctd();
        if (this$prodIuctd == null ? other$prodIuctd != null : !((Object)this$prodIuctd).equals(other$prodIuctd)) {
            return false;
        }
        Long this$warehouseId = this.getWarehouseId();
        Long other$warehouseId = other.getWarehouseId();
        if (this$warehouseId == null ? other$warehouseId != null : !((Object)this$warehouseId).equals(other$warehouseId)) {
            return false;
        }
        Integer this$outPriority = this.getOutPriority();
        Integer other$outPriority = other.getOutPriority();
        if (this$outPriority == null ? other$outPriority != null : !((Object)this$outPriority).equals(other$outPriority)) {
            return false;
        }
        Integer this$inPriority = this.getInPriority();
        Integer other$inPriority = other.getInPriority();
        if (this$inPriority == null ? other$inPriority != null : !((Object)this$inPriority).equals(other$inPriority)) {
            return false;
        }
        Long this$tenantId = this.getTenantId();
        Long other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !((Object)this$tenantId).equals(other$tenantId)) {
            return false;
        }
        String this$ytenantId = this.getYtenantId();
        String other$ytenantId = other.getYtenantId();
        return !(this$ytenantId == null ? other$ytenantId != null : !this$ytenantId.equals(other$ytenantId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof GoodsProductsComparisonModel;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $positionId = this.getPositionId();
        result = result * 59 + ($positionId == null ? 43 : ((Object)$positionId).hashCode());
        Long $prodIuctd = this.getProdIuctd();
        result = result * 59 + ($prodIuctd == null ? 43 : ((Object)$prodIuctd).hashCode());
        Long $warehouseId = this.getWarehouseId();
        result = result * 59 + ($warehouseId == null ? 43 : ((Object)$warehouseId).hashCode());
        Integer $outPriority = this.getOutPriority();
        result = result * 59 + ($outPriority == null ? 43 : ((Object)$outPriority).hashCode());
        Integer $inPriority = this.getInPriority();
        result = result * 59 + ($inPriority == null ? 43 : ((Object)$inPriority).hashCode());
        Long $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : ((Object)$tenantId).hashCode());
        String $ytenantId = this.getYtenantId();
        result = result * 59 + ($ytenantId == null ? 43 : $ytenantId.hashCode());
        return result;
    }

    public String toString() {
        return "GoodsProductsComparisonModel(id=" + this.getId() + ", positionId=" + this.getPositionId() + ", prodIuctd=" + this.getProdIuctd() + ", warehouseId=" + this.getWarehouseId() + ", outPriority=" + this.getOutPriority() + ", inPriority=" + this.getInPriority() + ", tenantId=" + this.getTenantId() + ", ytenantId=" + this.getYtenantId() + ")";
    }
}

