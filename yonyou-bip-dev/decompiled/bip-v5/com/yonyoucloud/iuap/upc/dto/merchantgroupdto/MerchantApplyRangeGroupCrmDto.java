/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.merchantgroupdto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Date;
import java.util.HashSet;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantApplyRangeGroupCrmDto {
    private Long id;
    private Date recentlyFollowTime;
    private Boolean potential;
    private HashSet<String> blankSet;

    public Long getId() {
        return this.id;
    }

    public Date getRecentlyFollowTime() {
        return this.recentlyFollowTime;
    }

    public Boolean getPotential() {
        return this.potential;
    }

    public HashSet<String> getBlankSet() {
        return this.blankSet;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRecentlyFollowTime(Date recentlyFollowTime) {
        this.recentlyFollowTime = recentlyFollowTime;
    }

    public void setPotential(Boolean potential) {
        this.potential = potential;
    }

    public void setBlankSet(HashSet<String> blankSet) {
        this.blankSet = blankSet;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantApplyRangeGroupCrmDto)) {
            return false;
        }
        MerchantApplyRangeGroupCrmDto other = (MerchantApplyRangeGroupCrmDto)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Boolean this$potential = this.getPotential();
        Boolean other$potential = other.getPotential();
        if (this$potential == null ? other$potential != null : !((Object)this$potential).equals(other$potential)) {
            return false;
        }
        Date this$recentlyFollowTime = this.getRecentlyFollowTime();
        Date other$recentlyFollowTime = other.getRecentlyFollowTime();
        if (this$recentlyFollowTime == null ? other$recentlyFollowTime != null : !((Object)this$recentlyFollowTime).equals(other$recentlyFollowTime)) {
            return false;
        }
        HashSet<String> this$blankSet = this.getBlankSet();
        HashSet<String> other$blankSet = other.getBlankSet();
        return !(this$blankSet == null ? other$blankSet != null : !((Object)this$blankSet).equals(other$blankSet));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantApplyRangeGroupCrmDto;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $potential = this.getPotential();
        result = result * 59 + ($potential == null ? 43 : ((Object)$potential).hashCode());
        Date $recentlyFollowTime = this.getRecentlyFollowTime();
        result = result * 59 + ($recentlyFollowTime == null ? 43 : ((Object)$recentlyFollowTime).hashCode());
        HashSet<String> $blankSet = this.getBlankSet();
        result = result * 59 + ($blankSet == null ? 43 : ((Object)$blankSet).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantApplyRangeGroupCrmDto(id=" + this.getId() + ", recentlyFollowTime=" + this.getRecentlyFollowTime() + ", potential=" + this.getPotential() + ", blankSet=" + this.getBlankSet() + ")";
    }
}

