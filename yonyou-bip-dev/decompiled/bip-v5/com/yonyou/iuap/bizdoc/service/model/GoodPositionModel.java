/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseDaoModel;

public class GoodPositionModel
extends BaseDaoModel {
    private Long warehouseId;
    private String charger;
    private String volume;
    private Long custId;
    private String erpCode;
    private String barCode;
    private Long parent;
    private Boolean isEnd;
    private Integer level;
    private Boolean isFastAdd;
    private Boolean stopStatus;

    public Long getWarehouseId() {
        return this.warehouseId;
    }

    public String getCharger() {
        return this.charger;
    }

    public String getVolume() {
        return this.volume;
    }

    public Long getCustId() {
        return this.custId;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public String getBarCode() {
        return this.barCode;
    }

    public Long getParent() {
        return this.parent;
    }

    public Boolean getIsEnd() {
        return this.isEnd;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Boolean getIsFastAdd() {
        return this.isFastAdd;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public void setIsEnd(Boolean isEnd) {
        this.isEnd = isEnd;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setIsFastAdd(Boolean isFastAdd) {
        this.isFastAdd = isFastAdd;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GoodPositionModel)) {
            return false;
        }
        GoodPositionModel other = (GoodPositionModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$warehouseId = this.getWarehouseId();
        Long other$warehouseId = other.getWarehouseId();
        if (this$warehouseId == null ? other$warehouseId != null : !((Object)this$warehouseId).equals(other$warehouseId)) {
            return false;
        }
        Long this$custId = this.getCustId();
        Long other$custId = other.getCustId();
        if (this$custId == null ? other$custId != null : !((Object)this$custId).equals(other$custId)) {
            return false;
        }
        Long this$parent = this.getParent();
        Long other$parent = other.getParent();
        if (this$parent == null ? other$parent != null : !((Object)this$parent).equals(other$parent)) {
            return false;
        }
        Boolean this$isEnd = this.getIsEnd();
        Boolean other$isEnd = other.getIsEnd();
        if (this$isEnd == null ? other$isEnd != null : !((Object)this$isEnd).equals(other$isEnd)) {
            return false;
        }
        Integer this$level = this.getLevel();
        Integer other$level = other.getLevel();
        if (this$level == null ? other$level != null : !((Object)this$level).equals(other$level)) {
            return false;
        }
        Boolean this$isFastAdd = this.getIsFastAdd();
        Boolean other$isFastAdd = other.getIsFastAdd();
        if (this$isFastAdd == null ? other$isFastAdd != null : !((Object)this$isFastAdd).equals(other$isFastAdd)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        String this$charger = this.getCharger();
        String other$charger = other.getCharger();
        if (this$charger == null ? other$charger != null : !this$charger.equals(other$charger)) {
            return false;
        }
        String this$volume = this.getVolume();
        String other$volume = other.getVolume();
        if (this$volume == null ? other$volume != null : !this$volume.equals(other$volume)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String this$barCode = this.getBarCode();
        String other$barCode = other.getBarCode();
        return !(this$barCode == null ? other$barCode != null : !this$barCode.equals(other$barCode));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof GoodPositionModel;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $warehouseId = this.getWarehouseId();
        result = result * 59 + ($warehouseId == null ? 43 : ((Object)$warehouseId).hashCode());
        Long $custId = this.getCustId();
        result = result * 59 + ($custId == null ? 43 : ((Object)$custId).hashCode());
        Long $parent = this.getParent();
        result = result * 59 + ($parent == null ? 43 : ((Object)$parent).hashCode());
        Boolean $isEnd = this.getIsEnd();
        result = result * 59 + ($isEnd == null ? 43 : ((Object)$isEnd).hashCode());
        Integer $level = this.getLevel();
        result = result * 59 + ($level == null ? 43 : ((Object)$level).hashCode());
        Boolean $isFastAdd = this.getIsFastAdd();
        result = result * 59 + ($isFastAdd == null ? 43 : ((Object)$isFastAdd).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $charger = this.getCharger();
        result = result * 59 + ($charger == null ? 43 : $charger.hashCode());
        String $volume = this.getVolume();
        result = result * 59 + ($volume == null ? 43 : $volume.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : $barCode.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "GoodPositionModel(warehouseId=" + this.getWarehouseId() + ", charger=" + this.getCharger() + ", volume=" + this.getVolume() + ", custId=" + this.getCustId() + ", erpCode=" + this.getErpCode() + ", barCode=" + this.getBarCode() + ", parent=" + this.getParent() + ", isEnd=" + this.getIsEnd() + ", level=" + this.getLevel() + ", isFastAdd=" + this.getIsFastAdd() + ", stopStatus=" + this.getStopStatus() + ")";
    }
}

