/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseQueryParam;

public class DeliverCorpQueryParam
extends BaseQueryParam {
    private Integer stopstatus;

    public Integer getStopstatus() {
        return this.stopstatus;
    }

    public void setStopstatus(Integer stopstatus) {
        this.stopstatus = stopstatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DeliverCorpQueryParam)) {
            return false;
        }
        DeliverCorpQueryParam other = (DeliverCorpQueryParam)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$stopstatus = this.getStopstatus();
        Integer other$stopstatus = other.getStopstatus();
        return !(this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DeliverCorpQueryParam;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        return result;
    }

    public String toString() {
        return "DeliverCorpQueryParam(stopstatus=" + this.getStopstatus() + ")";
    }
}

