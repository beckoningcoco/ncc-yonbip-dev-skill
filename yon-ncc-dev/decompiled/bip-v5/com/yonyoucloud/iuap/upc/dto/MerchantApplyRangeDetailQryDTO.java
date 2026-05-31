/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantApplyRangeDetailQryDTO
implements Serializable {
    private String[] fields;
    private Long id;
    private Long merchantApplyRangeId;
    private String merchantApplyRangeOrgId;
    private List<String> merchantApplyRangeOrgIdList;
    private Boolean stopStatus;

    public String[] getFields() {
        return this.fields;
    }

    public Long getId() {
        return this.id;
    }

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public String getMerchantApplyRangeOrgId() {
        return this.merchantApplyRangeOrgId;
    }

    public List<String> getMerchantApplyRangeOrgIdList() {
        return this.merchantApplyRangeOrgIdList;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setMerchantApplyRangeOrgId(String merchantApplyRangeOrgId) {
        this.merchantApplyRangeOrgId = merchantApplyRangeOrgId;
    }

    public void setMerchantApplyRangeOrgIdList(List<String> merchantApplyRangeOrgIdList) {
        this.merchantApplyRangeOrgIdList = merchantApplyRangeOrgIdList;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantApplyRangeDetailQryDTO)) {
            return false;
        }
        MerchantApplyRangeDetailQryDTO other = (MerchantApplyRangeDetailQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$merchantApplyRangeId = this.getMerchantApplyRangeId();
        Long other$merchantApplyRangeId = other.getMerchantApplyRangeId();
        if (this$merchantApplyRangeId == null ? other$merchantApplyRangeId != null : !((Object)this$merchantApplyRangeId).equals(other$merchantApplyRangeId)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        String this$merchantApplyRangeOrgId = this.getMerchantApplyRangeOrgId();
        String other$merchantApplyRangeOrgId = other.getMerchantApplyRangeOrgId();
        if (this$merchantApplyRangeOrgId == null ? other$merchantApplyRangeOrgId != null : !this$merchantApplyRangeOrgId.equals(other$merchantApplyRangeOrgId)) {
            return false;
        }
        List<String> this$merchantApplyRangeOrgIdList = this.getMerchantApplyRangeOrgIdList();
        List<String> other$merchantApplyRangeOrgIdList = other.getMerchantApplyRangeOrgIdList();
        return !(this$merchantApplyRangeOrgIdList == null ? other$merchantApplyRangeOrgIdList != null : !((Object)this$merchantApplyRangeOrgIdList).equals(other$merchantApplyRangeOrgIdList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantApplyRangeDetailQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        String $merchantApplyRangeOrgId = this.getMerchantApplyRangeOrgId();
        result = result * 59 + ($merchantApplyRangeOrgId == null ? 43 : $merchantApplyRangeOrgId.hashCode());
        List<String> $merchantApplyRangeOrgIdList = this.getMerchantApplyRangeOrgIdList();
        result = result * 59 + ($merchantApplyRangeOrgIdList == null ? 43 : ((Object)$merchantApplyRangeOrgIdList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantApplyRangeDetailQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", id=" + this.getId() + ", merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", merchantApplyRangeOrgId=" + this.getMerchantApplyRangeOrgId() + ", merchantApplyRangeOrgIdList=" + this.getMerchantApplyRangeOrgIdList() + ", stopStatus=" + this.getStopStatus() + ")";
    }
}

