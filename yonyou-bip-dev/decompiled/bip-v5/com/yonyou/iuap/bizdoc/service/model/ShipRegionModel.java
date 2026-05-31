/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseDaoModel;

public class ShipRegionModel
extends BaseDaoModel {
    private String country;
    private String erpCode;
    private Integer stopStatus;
    private Integer iorder;

    public String getCountry() {
        return this.country;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public Integer getStopStatus() {
        return this.stopStatus;
    }

    public Integer getIorder() {
        return this.iorder;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setStopStatus(Integer stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setIorder(Integer iorder) {
        this.iorder = iorder;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ShipRegionModel)) {
            return false;
        }
        ShipRegionModel other = (ShipRegionModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$stopStatus = this.getStopStatus();
        Integer other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Integer this$iorder = this.getIorder();
        Integer other$iorder = other.getIorder();
        if (this$iorder == null ? other$iorder != null : !((Object)this$iorder).equals(other$iorder)) {
            return false;
        }
        String this$country = this.getCountry();
        String other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        return !(this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ShipRegionModel;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Integer $iorder = this.getIorder();
        result = result * 59 + ($iorder == null ? 43 : ((Object)$iorder).hashCode());
        String $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ShipRegionModel(country=" + this.getCountry() + ", erpCode=" + this.getErpCode() + ", stopStatus=" + this.getStopStatus() + ", iorder=" + this.getIorder() + ")";
    }
}

