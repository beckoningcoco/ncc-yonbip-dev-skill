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
public class MerchantDetailCrmDto {
    private Long merchantApplyRangeId;
    private Long highSeas;
    private Long sourceOfTheHighSeas;
    private Integer frozenState;
    private String freezingLink;
    private Boolean stopStatus;
    private String recentFollower;
    private String recentFollowContent;
    private String applyPerson;
    private Date applyTime;
    private Integer applyStatus;
    private String specialManagementDep;
    private String professSalesman;
    private Long customerArea;
    private HashSet<String> blankSet;

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public Long getHighSeas() {
        return this.highSeas;
    }

    public Long getSourceOfTheHighSeas() {
        return this.sourceOfTheHighSeas;
    }

    public Integer getFrozenState() {
        return this.frozenState;
    }

    public String getFreezingLink() {
        return this.freezingLink;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public String getRecentFollower() {
        return this.recentFollower;
    }

    public String getRecentFollowContent() {
        return this.recentFollowContent;
    }

    public String getApplyPerson() {
        return this.applyPerson;
    }

    public Date getApplyTime() {
        return this.applyTime;
    }

    public Integer getApplyStatus() {
        return this.applyStatus;
    }

    public String getSpecialManagementDep() {
        return this.specialManagementDep;
    }

    public String getProfessSalesman() {
        return this.professSalesman;
    }

    public Long getCustomerArea() {
        return this.customerArea;
    }

    public HashSet<String> getBlankSet() {
        return this.blankSet;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setHighSeas(Long highSeas) {
        this.highSeas = highSeas;
    }

    public void setSourceOfTheHighSeas(Long sourceOfTheHighSeas) {
        this.sourceOfTheHighSeas = sourceOfTheHighSeas;
    }

    public void setFrozenState(Integer frozenState) {
        this.frozenState = frozenState;
    }

    public void setFreezingLink(String freezingLink) {
        this.freezingLink = freezingLink;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setRecentFollower(String recentFollower) {
        this.recentFollower = recentFollower;
    }

    public void setRecentFollowContent(String recentFollowContent) {
        this.recentFollowContent = recentFollowContent;
    }

    public void setApplyPerson(String applyPerson) {
        this.applyPerson = applyPerson;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public void setApplyStatus(Integer applyStatus) {
        this.applyStatus = applyStatus;
    }

    public void setSpecialManagementDep(String specialManagementDep) {
        this.specialManagementDep = specialManagementDep;
    }

    public void setProfessSalesman(String professSalesman) {
        this.professSalesman = professSalesman;
    }

    public void setCustomerArea(Long customerArea) {
        this.customerArea = customerArea;
    }

    public void setBlankSet(HashSet<String> blankSet) {
        this.blankSet = blankSet;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantDetailCrmDto)) {
            return false;
        }
        MerchantDetailCrmDto other = (MerchantDetailCrmDto)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantApplyRangeId = this.getMerchantApplyRangeId();
        Long other$merchantApplyRangeId = other.getMerchantApplyRangeId();
        if (this$merchantApplyRangeId == null ? other$merchantApplyRangeId != null : !((Object)this$merchantApplyRangeId).equals(other$merchantApplyRangeId)) {
            return false;
        }
        Long this$highSeas = this.getHighSeas();
        Long other$highSeas = other.getHighSeas();
        if (this$highSeas == null ? other$highSeas != null : !((Object)this$highSeas).equals(other$highSeas)) {
            return false;
        }
        Long this$sourceOfTheHighSeas = this.getSourceOfTheHighSeas();
        Long other$sourceOfTheHighSeas = other.getSourceOfTheHighSeas();
        if (this$sourceOfTheHighSeas == null ? other$sourceOfTheHighSeas != null : !((Object)this$sourceOfTheHighSeas).equals(other$sourceOfTheHighSeas)) {
            return false;
        }
        Integer this$frozenState = this.getFrozenState();
        Integer other$frozenState = other.getFrozenState();
        if (this$frozenState == null ? other$frozenState != null : !((Object)this$frozenState).equals(other$frozenState)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Integer this$applyStatus = this.getApplyStatus();
        Integer other$applyStatus = other.getApplyStatus();
        if (this$applyStatus == null ? other$applyStatus != null : !((Object)this$applyStatus).equals(other$applyStatus)) {
            return false;
        }
        Long this$customerArea = this.getCustomerArea();
        Long other$customerArea = other.getCustomerArea();
        if (this$customerArea == null ? other$customerArea != null : !((Object)this$customerArea).equals(other$customerArea)) {
            return false;
        }
        String this$freezingLink = this.getFreezingLink();
        String other$freezingLink = other.getFreezingLink();
        if (this$freezingLink == null ? other$freezingLink != null : !this$freezingLink.equals(other$freezingLink)) {
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
        String this$applyPerson = this.getApplyPerson();
        String other$applyPerson = other.getApplyPerson();
        if (this$applyPerson == null ? other$applyPerson != null : !this$applyPerson.equals(other$applyPerson)) {
            return false;
        }
        Date this$applyTime = this.getApplyTime();
        Date other$applyTime = other.getApplyTime();
        if (this$applyTime == null ? other$applyTime != null : !((Object)this$applyTime).equals(other$applyTime)) {
            return false;
        }
        String this$specialManagementDep = this.getSpecialManagementDep();
        String other$specialManagementDep = other.getSpecialManagementDep();
        if (this$specialManagementDep == null ? other$specialManagementDep != null : !this$specialManagementDep.equals(other$specialManagementDep)) {
            return false;
        }
        String this$professSalesman = this.getProfessSalesman();
        String other$professSalesman = other.getProfessSalesman();
        if (this$professSalesman == null ? other$professSalesman != null : !this$professSalesman.equals(other$professSalesman)) {
            return false;
        }
        HashSet<String> this$blankSet = this.getBlankSet();
        HashSet<String> other$blankSet = other.getBlankSet();
        return !(this$blankSet == null ? other$blankSet != null : !((Object)this$blankSet).equals(other$blankSet));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantDetailCrmDto;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Long $highSeas = this.getHighSeas();
        result = result * 59 + ($highSeas == null ? 43 : ((Object)$highSeas).hashCode());
        Long $sourceOfTheHighSeas = this.getSourceOfTheHighSeas();
        result = result * 59 + ($sourceOfTheHighSeas == null ? 43 : ((Object)$sourceOfTheHighSeas).hashCode());
        Integer $frozenState = this.getFrozenState();
        result = result * 59 + ($frozenState == null ? 43 : ((Object)$frozenState).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Integer $applyStatus = this.getApplyStatus();
        result = result * 59 + ($applyStatus == null ? 43 : ((Object)$applyStatus).hashCode());
        Long $customerArea = this.getCustomerArea();
        result = result * 59 + ($customerArea == null ? 43 : ((Object)$customerArea).hashCode());
        String $freezingLink = this.getFreezingLink();
        result = result * 59 + ($freezingLink == null ? 43 : $freezingLink.hashCode());
        String $recentFollower = this.getRecentFollower();
        result = result * 59 + ($recentFollower == null ? 43 : $recentFollower.hashCode());
        String $recentFollowContent = this.getRecentFollowContent();
        result = result * 59 + ($recentFollowContent == null ? 43 : $recentFollowContent.hashCode());
        String $applyPerson = this.getApplyPerson();
        result = result * 59 + ($applyPerson == null ? 43 : $applyPerson.hashCode());
        Date $applyTime = this.getApplyTime();
        result = result * 59 + ($applyTime == null ? 43 : ((Object)$applyTime).hashCode());
        String $specialManagementDep = this.getSpecialManagementDep();
        result = result * 59 + ($specialManagementDep == null ? 43 : $specialManagementDep.hashCode());
        String $professSalesman = this.getProfessSalesman();
        result = result * 59 + ($professSalesman == null ? 43 : $professSalesman.hashCode());
        HashSet<String> $blankSet = this.getBlankSet();
        result = result * 59 + ($blankSet == null ? 43 : ((Object)$blankSet).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantDetailCrmDto(merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", highSeas=" + this.getHighSeas() + ", sourceOfTheHighSeas=" + this.getSourceOfTheHighSeas() + ", frozenState=" + this.getFrozenState() + ", freezingLink=" + this.getFreezingLink() + ", stopStatus=" + this.getStopStatus() + ", recentFollower=" + this.getRecentFollower() + ", recentFollowContent=" + this.getRecentFollowContent() + ", applyPerson=" + this.getApplyPerson() + ", applyTime=" + this.getApplyTime() + ", applyStatus=" + this.getApplyStatus() + ", specialManagementDep=" + this.getSpecialManagementDep() + ", professSalesman=" + this.getProfessSalesman() + ", customerArea=" + this.getCustomerArea() + ", blankSet=" + this.getBlankSet() + ")";
    }
}

