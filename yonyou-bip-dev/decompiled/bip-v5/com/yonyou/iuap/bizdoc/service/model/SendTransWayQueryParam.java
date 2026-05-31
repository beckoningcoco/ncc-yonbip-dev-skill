/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseQueryParam;

public class SendTransWayQueryParam
extends BaseQueryParam {
    private Integer stopstatus;
    private Integer transportWay;
    private Integer container;

    public Integer getStopstatus() {
        return this.stopstatus;
    }

    public Integer getTransportWay() {
        return this.transportWay;
    }

    public Integer getContainer() {
        return this.container;
    }

    public void setStopstatus(Integer stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void setTransportWay(Integer transportWay) {
        this.transportWay = transportWay;
    }

    public void setContainer(Integer container) {
        this.container = container;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SendTransWayQueryParam)) {
            return false;
        }
        SendTransWayQueryParam other = (SendTransWayQueryParam)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$stopstatus = this.getStopstatus();
        Integer other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
            return false;
        }
        Integer this$transportWay = this.getTransportWay();
        Integer other$transportWay = other.getTransportWay();
        if (this$transportWay == null ? other$transportWay != null : !((Object)this$transportWay).equals(other$transportWay)) {
            return false;
        }
        Integer this$container = this.getContainer();
        Integer other$container = other.getContainer();
        return !(this$container == null ? other$container != null : !((Object)this$container).equals(other$container));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SendTransWayQueryParam;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        Integer $transportWay = this.getTransportWay();
        result = result * 59 + ($transportWay == null ? 43 : ((Object)$transportWay).hashCode());
        Integer $container = this.getContainer();
        result = result * 59 + ($container == null ? 43 : ((Object)$container).hashCode());
        return result;
    }

    public String toString() {
        return "SendTransWayQueryParam(stopstatus=" + this.getStopstatus() + ", transportWay=" + this.getTransportWay() + ", container=" + this.getContainer() + ")";
    }
}

