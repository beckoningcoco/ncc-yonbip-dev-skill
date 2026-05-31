/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseQueryParam;
import java.util.List;

public class GoodspositionQueryParam
extends BaseQueryParam {
    private String warehouseId;
    private List<String> warehouseIds;
    private Integer stopStatus;

    public String getWarehouseId() {
        return this.warehouseId;
    }

    public List<String> getWarehouseIds() {
        return this.warehouseIds;
    }

    public Integer getStopStatus() {
        return this.stopStatus;
    }

    public void setWarehouseId(String warehouseId) {
        this.warehouseId = warehouseId;
    }

    public void setWarehouseIds(List<String> warehouseIds) {
        this.warehouseIds = warehouseIds;
    }

    public void setStopStatus(Integer stopStatus) {
        this.stopStatus = stopStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GoodspositionQueryParam)) {
            return false;
        }
        GoodspositionQueryParam other = (GoodspositionQueryParam)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$stopStatus = this.getStopStatus();
        Integer other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        String this$warehouseId = this.getWarehouseId();
        String other$warehouseId = other.getWarehouseId();
        if (this$warehouseId == null ? other$warehouseId != null : !this$warehouseId.equals(other$warehouseId)) {
            return false;
        }
        List<String> this$warehouseIds = this.getWarehouseIds();
        List<String> other$warehouseIds = other.getWarehouseIds();
        return !(this$warehouseIds == null ? other$warehouseIds != null : !((Object)this$warehouseIds).equals(other$warehouseIds));
    }

    protected boolean canEqual(Object other) {
        return other instanceof GoodspositionQueryParam;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $warehouseId = this.getWarehouseId();
        result = result * 59 + ($warehouseId == null ? 43 : $warehouseId.hashCode());
        List<String> $warehouseIds = this.getWarehouseIds();
        result = result * 59 + ($warehouseIds == null ? 43 : ((Object)$warehouseIds).hashCode());
        return result;
    }

    public String toString() {
        return "GoodspositionQueryParam(warehouseId=" + this.getWarehouseId() + ", warehouseIds=" + this.getWarehouseIds() + ", stopStatus=" + this.getStopStatus() + ")";
    }
}

