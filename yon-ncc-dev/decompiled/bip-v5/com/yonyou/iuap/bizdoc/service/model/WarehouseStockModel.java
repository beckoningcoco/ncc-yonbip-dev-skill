/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

public class WarehouseStockModel {
    private Long id;
    private Long warehouseId;
    private Boolean isDefault;
    private Long tenantId;
    private String ytenantId;
    private String orgId;

    public Long getId() {
        return this.id;
    }

    public Long getWarehouseId() {
        return this.warehouseId;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public String getYtenantId() {
        return this.ytenantId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public void setYtenantId(String ytenantId) {
        this.ytenantId = ytenantId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof WarehouseStockModel)) {
            return false;
        }
        WarehouseStockModel other = (WarehouseStockModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$warehouseId = this.getWarehouseId();
        Long other$warehouseId = other.getWarehouseId();
        if (this$warehouseId == null ? other$warehouseId != null : !((Object)this$warehouseId).equals(other$warehouseId)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        Long this$tenantId = this.getTenantId();
        Long other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !((Object)this$tenantId).equals(other$tenantId)) {
            return false;
        }
        String this$ytenantId = this.getYtenantId();
        String other$ytenantId = other.getYtenantId();
        if (this$ytenantId == null ? other$ytenantId != null : !this$ytenantId.equals(other$ytenantId)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        return !(this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof WarehouseStockModel;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $warehouseId = this.getWarehouseId();
        result = result * 59 + ($warehouseId == null ? 43 : ((Object)$warehouseId).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Long $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : ((Object)$tenantId).hashCode());
        String $ytenantId = this.getYtenantId();
        result = result * 59 + ($ytenantId == null ? 43 : $ytenantId.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        return result;
    }

    public String toString() {
        return "WarehouseStockModel(id=" + this.getId() + ", warehouseId=" + this.getWarehouseId() + ", isDefault=" + this.getIsDefault() + ", tenantId=" + this.getTenantId() + ", ytenantId=" + this.getYtenantId() + ", orgId=" + this.getOrgId() + ")";
    }
}

