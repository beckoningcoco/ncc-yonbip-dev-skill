/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantListQryDTO
extends UPCPager
implements Serializable {
    private String rangeOrgId;
    private String fuzzyName;
    private String fuzzyCode;
    private String fuzzySearchCode;
    private Boolean detailStopStatus;
    private String mobile;

    public String getRangeOrgId() {
        return this.rangeOrgId;
    }

    public String getFuzzyName() {
        return this.fuzzyName;
    }

    public String getFuzzyCode() {
        return this.fuzzyCode;
    }

    public String getFuzzySearchCode() {
        return this.fuzzySearchCode;
    }

    public Boolean getDetailStopStatus() {
        return this.detailStopStatus;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setRangeOrgId(String rangeOrgId) {
        this.rangeOrgId = rangeOrgId;
    }

    public void setFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName;
    }

    public void setFuzzyCode(String fuzzyCode) {
        this.fuzzyCode = fuzzyCode;
    }

    public void setFuzzySearchCode(String fuzzySearchCode) {
        this.fuzzySearchCode = fuzzySearchCode;
    }

    public void setDetailStopStatus(Boolean detailStopStatus) {
        this.detailStopStatus = detailStopStatus;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantListQryDTO)) {
            return false;
        }
        MerchantListQryDTO other = (MerchantListQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$detailStopStatus = this.getDetailStopStatus();
        Boolean other$detailStopStatus = other.getDetailStopStatus();
        if (this$detailStopStatus == null ? other$detailStopStatus != null : !((Object)this$detailStopStatus).equals(other$detailStopStatus)) {
            return false;
        }
        String this$rangeOrgId = this.getRangeOrgId();
        String other$rangeOrgId = other.getRangeOrgId();
        if (this$rangeOrgId == null ? other$rangeOrgId != null : !this$rangeOrgId.equals(other$rangeOrgId)) {
            return false;
        }
        String this$fuzzyName = this.getFuzzyName();
        String other$fuzzyName = other.getFuzzyName();
        if (this$fuzzyName == null ? other$fuzzyName != null : !this$fuzzyName.equals(other$fuzzyName)) {
            return false;
        }
        String this$fuzzyCode = this.getFuzzyCode();
        String other$fuzzyCode = other.getFuzzyCode();
        if (this$fuzzyCode == null ? other$fuzzyCode != null : !this$fuzzyCode.equals(other$fuzzyCode)) {
            return false;
        }
        String this$fuzzySearchCode = this.getFuzzySearchCode();
        String other$fuzzySearchCode = other.getFuzzySearchCode();
        if (this$fuzzySearchCode == null ? other$fuzzySearchCode != null : !this$fuzzySearchCode.equals(other$fuzzySearchCode)) {
            return false;
        }
        String this$mobile = this.getMobile();
        String other$mobile = other.getMobile();
        return !(this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MerchantListQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $detailStopStatus = this.getDetailStopStatus();
        result = result * 59 + ($detailStopStatus == null ? 43 : ((Object)$detailStopStatus).hashCode());
        String $rangeOrgId = this.getRangeOrgId();
        result = result * 59 + ($rangeOrgId == null ? 43 : $rangeOrgId.hashCode());
        String $fuzzyName = this.getFuzzyName();
        result = result * 59 + ($fuzzyName == null ? 43 : $fuzzyName.hashCode());
        String $fuzzyCode = this.getFuzzyCode();
        result = result * 59 + ($fuzzyCode == null ? 43 : $fuzzyCode.hashCode());
        String $fuzzySearchCode = this.getFuzzySearchCode();
        result = result * 59 + ($fuzzySearchCode == null ? 43 : $fuzzySearchCode.hashCode());
        String $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MerchantListQryDTO(rangeOrgId=" + this.getRangeOrgId() + ", fuzzyName=" + this.getFuzzyName() + ", fuzzyCode=" + this.getFuzzyCode() + ", fuzzySearchCode=" + this.getFuzzySearchCode() + ", detailStopStatus=" + this.getDetailStopStatus() + ", mobile=" + this.getMobile() + ")";
    }
}

