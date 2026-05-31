/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductIPassTime
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String productId;
    private String productApplyRangeId;
    private Boolean iControlTime;
    private String ControlTimeType;
    private String dateRange;
    private String dStartDate;
    private String dEndDate;
    private Long RelativeDate;
    private Long durationDate;

    public String getId() {
        return this.id;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getProductApplyRangeId() {
        return this.productApplyRangeId;
    }

    public Boolean getIControlTime() {
        return this.iControlTime;
    }

    public String getControlTimeType() {
        return this.ControlTimeType;
    }

    public String getDateRange() {
        return this.dateRange;
    }

    public String getDStartDate() {
        return this.dStartDate;
    }

    public String getDEndDate() {
        return this.dEndDate;
    }

    public Long getRelativeDate() {
        return this.RelativeDate;
    }

    public Long getDurationDate() {
        return this.durationDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductApplyRangeId(String productApplyRangeId) {
        this.productApplyRangeId = productApplyRangeId;
    }

    public void setIControlTime(Boolean iControlTime) {
        this.iControlTime = iControlTime;
    }

    public void setControlTimeType(String ControlTimeType) {
        this.ControlTimeType = ControlTimeType;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }

    public void setDStartDate(String dStartDate) {
        this.dStartDate = dStartDate;
    }

    public void setDEndDate(String dEndDate) {
        this.dEndDate = dEndDate;
    }

    public void setRelativeDate(Long RelativeDate) {
        this.RelativeDate = RelativeDate;
    }

    public void setDurationDate(Long durationDate) {
        this.durationDate = durationDate;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductIPassTime)) {
            return false;
        }
        ProductIPassTime other = (ProductIPassTime)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$iControlTime = this.getIControlTime();
        Boolean other$iControlTime = other.getIControlTime();
        if (this$iControlTime == null ? other$iControlTime != null : !((Object)this$iControlTime).equals(other$iControlTime)) {
            return false;
        }
        Long this$RelativeDate = this.getRelativeDate();
        Long other$RelativeDate = other.getRelativeDate();
        if (this$RelativeDate == null ? other$RelativeDate != null : !((Object)this$RelativeDate).equals(other$RelativeDate)) {
            return false;
        }
        Long this$durationDate = this.getDurationDate();
        Long other$durationDate = other.getDurationDate();
        if (this$durationDate == null ? other$durationDate != null : !((Object)this$durationDate).equals(other$durationDate)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$productId = this.getProductId();
        String other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !this$productId.equals(other$productId)) {
            return false;
        }
        String this$productApplyRangeId = this.getProductApplyRangeId();
        String other$productApplyRangeId = other.getProductApplyRangeId();
        if (this$productApplyRangeId == null ? other$productApplyRangeId != null : !this$productApplyRangeId.equals(other$productApplyRangeId)) {
            return false;
        }
        String this$ControlTimeType = this.getControlTimeType();
        String other$ControlTimeType = other.getControlTimeType();
        if (this$ControlTimeType == null ? other$ControlTimeType != null : !this$ControlTimeType.equals(other$ControlTimeType)) {
            return false;
        }
        String this$dateRange = this.getDateRange();
        String other$dateRange = other.getDateRange();
        if (this$dateRange == null ? other$dateRange != null : !this$dateRange.equals(other$dateRange)) {
            return false;
        }
        String this$dStartDate = this.getDStartDate();
        String other$dStartDate = other.getDStartDate();
        if (this$dStartDate == null ? other$dStartDate != null : !this$dStartDate.equals(other$dStartDate)) {
            return false;
        }
        String this$dEndDate = this.getDEndDate();
        String other$dEndDate = other.getDEndDate();
        return !(this$dEndDate == null ? other$dEndDate != null : !this$dEndDate.equals(other$dEndDate));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductIPassTime;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $iControlTime = this.getIControlTime();
        result = result * 59 + ($iControlTime == null ? 43 : ((Object)$iControlTime).hashCode());
        Long $RelativeDate = this.getRelativeDate();
        result = result * 59 + ($RelativeDate == null ? 43 : ((Object)$RelativeDate).hashCode());
        Long $durationDate = this.getDurationDate();
        result = result * 59 + ($durationDate == null ? 43 : ((Object)$durationDate).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : $productId.hashCode());
        String $productApplyRangeId = this.getProductApplyRangeId();
        result = result * 59 + ($productApplyRangeId == null ? 43 : $productApplyRangeId.hashCode());
        String $ControlTimeType = this.getControlTimeType();
        result = result * 59 + ($ControlTimeType == null ? 43 : $ControlTimeType.hashCode());
        String $dateRange = this.getDateRange();
        result = result * 59 + ($dateRange == null ? 43 : $dateRange.hashCode());
        String $dStartDate = this.getDStartDate();
        result = result * 59 + ($dStartDate == null ? 43 : $dStartDate.hashCode());
        String $dEndDate = this.getDEndDate();
        result = result * 59 + ($dEndDate == null ? 43 : $dEndDate.hashCode());
        return result;
    }

    public String toString() {
        return "ProductIPassTime(id=" + this.getId() + ", productId=" + this.getProductId() + ", productApplyRangeId=" + this.getProductApplyRangeId() + ", iControlTime=" + this.getIControlTime() + ", ControlTimeType=" + this.getControlTimeType() + ", dateRange=" + this.getDateRange() + ", dStartDate=" + this.getDStartDate() + ", dEndDate=" + this.getDEndDate() + ", RelativeDate=" + this.getRelativeDate() + ", durationDate=" + this.getDurationDate() + ")";
    }
}

