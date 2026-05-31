/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseDaoModel;
import java.time.LocalDateTime;

public class ReasonModel
extends BaseDaoModel {
    private Long reasonType;
    private Boolean stopStatus;
    private LocalDateTime pubts;
    private Integer orderNum;

    public Long getReasonType() {
        return this.reasonType;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public LocalDateTime getPubts() {
        return this.pubts;
    }

    public Integer getOrderNum() {
        return this.orderNum;
    }

    public void setReasonType(Long reasonType) {
        this.reasonType = reasonType;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setPubts(LocalDateTime pubts) {
        this.pubts = pubts;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ReasonModel)) {
            return false;
        }
        ReasonModel other = (ReasonModel)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$reasonType = this.getReasonType();
        Long other$reasonType = other.getReasonType();
        if (this$reasonType == null ? other$reasonType != null : !((Object)this$reasonType).equals(other$reasonType)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Integer this$orderNum = this.getOrderNum();
        Integer other$orderNum = other.getOrderNum();
        if (this$orderNum == null ? other$orderNum != null : !((Object)this$orderNum).equals(other$orderNum)) {
            return false;
        }
        LocalDateTime this$pubts = this.getPubts();
        LocalDateTime other$pubts = other.getPubts();
        return !(this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ReasonModel;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $reasonType = this.getReasonType();
        result = result * 59 + ($reasonType == null ? 43 : ((Object)$reasonType).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Integer $orderNum = this.getOrderNum();
        result = result * 59 + ($orderNum == null ? 43 : ((Object)$orderNum).hashCode());
        LocalDateTime $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ReasonModel(reasonType=" + this.getReasonType() + ", stopStatus=" + this.getStopStatus() + ", pubts=" + this.getPubts() + ", orderNum=" + this.getOrderNum() + ")";
    }
}

