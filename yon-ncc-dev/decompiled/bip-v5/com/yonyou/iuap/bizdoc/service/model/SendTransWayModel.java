/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseDaoModel;

public class SendTransWayModel
extends BaseDaoModel {
    private Boolean stopStatus;
    private String erpCode;
    private Integer transportWay;
    private Integer container;

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public Integer getTransportWay() {
        return this.transportWay;
    }

    public Integer getContainer() {
        return this.container;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setTransportWay(Integer transportWay) {
        this.transportWay = transportWay;
    }

    public void setContainer(Integer container) {
        this.container = container;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SendTransWayModel)) {
            return false;
        }
        SendTransWayModel other = (SendTransWayModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Integer this$transportWay = this.getTransportWay();
        Integer other$transportWay = other.getTransportWay();
        if (this$transportWay == null ? other$transportWay != null : !((Object)this$transportWay).equals(other$transportWay)) {
            return false;
        }
        Integer this$container = this.getContainer();
        Integer other$container = other.getContainer();
        if (this$container == null ? other$container != null : !((Object)this$container).equals(other$container)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        return !(this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SendTransWayModel;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Integer $transportWay = this.getTransportWay();
        result = result * 59 + ($transportWay == null ? 43 : ((Object)$transportWay).hashCode());
        Integer $container = this.getContainer();
        result = result * 59 + ($container == null ? 43 : ((Object)$container).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "SendTransWayModel(stopStatus=" + this.getStopStatus() + ", erpCode=" + this.getErpCode() + ", transportWay=" + this.getTransportWay() + ", container=" + this.getContainer() + ")";
    }
}

