/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.merchantgroupdto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Date;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantDetailRecentCrmDto
implements Serializable {
    private Long merchantApplyRangeId;
    private Date recentlyFollowTime;
    private String recentFollower;
    private String recentFollowContent;
    private Date positiveTime;
    private String positivePeople;

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public Date getRecentlyFollowTime() {
        return this.recentlyFollowTime;
    }

    public String getRecentFollower() {
        return this.recentFollower;
    }

    public String getRecentFollowContent() {
        return this.recentFollowContent;
    }

    public Date getPositiveTime() {
        return this.positiveTime;
    }

    public String getPositivePeople() {
        return this.positivePeople;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setRecentlyFollowTime(Date recentlyFollowTime) {
        this.recentlyFollowTime = recentlyFollowTime;
    }

    public void setRecentFollower(String recentFollower) {
        this.recentFollower = recentFollower;
    }

    public void setRecentFollowContent(String recentFollowContent) {
        this.recentFollowContent = recentFollowContent;
    }

    public void setPositiveTime(Date positiveTime) {
        this.positiveTime = positiveTime;
    }

    public void setPositivePeople(String positivePeople) {
        this.positivePeople = positivePeople;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantDetailRecentCrmDto)) {
            return false;
        }
        MerchantDetailRecentCrmDto other = (MerchantDetailRecentCrmDto)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantApplyRangeId = this.getMerchantApplyRangeId();
        Long other$merchantApplyRangeId = other.getMerchantApplyRangeId();
        if (this$merchantApplyRangeId == null ? other$merchantApplyRangeId != null : !((Object)this$merchantApplyRangeId).equals(other$merchantApplyRangeId)) {
            return false;
        }
        Date this$recentlyFollowTime = this.getRecentlyFollowTime();
        Date other$recentlyFollowTime = other.getRecentlyFollowTime();
        if (this$recentlyFollowTime == null ? other$recentlyFollowTime != null : !((Object)this$recentlyFollowTime).equals(other$recentlyFollowTime)) {
            return false;
        }
        String this$recentFollower = this.getRecentFollower();
        String other$recentFollower = other.getRecentFollower();
        if (this$recentFollower == null ? other$recentFollower != null : !this$recentFollower.equals(other$recentFollower)) {
            return false;
        }
        String this$recentFollowContent = this.getRecentFollowContent();
        String other$recentFollowContent = other.getRecentFollowContent();
        if (this$recentFollowContent == null ? other$recentFollowContent != null : !this$recentFollowContent.equals(other$recentFollowContent)) {
            return false;
        }
        Date this$positiveTime = this.getPositiveTime();
        Date other$positiveTime = other.getPositiveTime();
        if (this$positiveTime == null ? other$positiveTime != null : !((Object)this$positiveTime).equals(other$positiveTime)) {
            return false;
        }
        String this$positivePeople = this.getPositivePeople();
        String other$positivePeople = other.getPositivePeople();
        return !(this$positivePeople == null ? other$positivePeople != null : !this$positivePeople.equals(other$positivePeople));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantDetailRecentCrmDto;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Date $recentlyFollowTime = this.getRecentlyFollowTime();
        result = result * 59 + ($recentlyFollowTime == null ? 43 : ((Object)$recentlyFollowTime).hashCode());
        String $recentFollower = this.getRecentFollower();
        result = result * 59 + ($recentFollower == null ? 43 : $recentFollower.hashCode());
        String $recentFollowContent = this.getRecentFollowContent();
        result = result * 59 + ($recentFollowContent == null ? 43 : $recentFollowContent.hashCode());
        Date $positiveTime = this.getPositiveTime();
        result = result * 59 + ($positiveTime == null ? 43 : ((Object)$positiveTime).hashCode());
        String $positivePeople = this.getPositivePeople();
        result = result * 59 + ($positivePeople == null ? 43 : $positivePeople.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantDetailRecentCrmDto(merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", recentlyFollowTime=" + this.getRecentlyFollowTime() + ", recentFollower=" + this.getRecentFollower() + ", recentFollowContent=" + this.getRecentFollowContent() + ", positiveTime=" + this.getPositiveTime() + ", positivePeople=" + this.getPositivePeople() + ")";
    }
}

