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
public class MerchantApplyRangeQryDTO
implements Serializable {
    private String[] fields;
    private Long merchantApplyRangeId;
    private List<Long> merchantApplyRangeIds;
    private Long merchantId;
    private List<Long> merchantIdList;
    private Long orgId;
    private String orgIdStr;
    private List<Long> orgIds;
    private List<String> orgIdStrs;
    private Long shopId;
    private List<Long> shopIdList;
    private Integer rangeType;
    private Integer potential;

    public String[] getFields() {
        return this.fields;
    }

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public List<Long> getMerchantApplyRangeIds() {
        return this.merchantApplyRangeIds;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public List<Long> getMerchantIdList() {
        return this.merchantIdList;
    }

    public Long getOrgId() {
        return this.orgId;
    }

    public String getOrgIdStr() {
        return this.orgIdStr;
    }

    public List<Long> getOrgIds() {
        return this.orgIds;
    }

    public List<String> getOrgIdStrs() {
        return this.orgIdStrs;
    }

    public Long getShopId() {
        return this.shopId;
    }

    public List<Long> getShopIdList() {
        return this.shopIdList;
    }

    public Integer getRangeType() {
        return this.rangeType;
    }

    public Integer getPotential() {
        return this.potential;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setMerchantApplyRangeIds(List<Long> merchantApplyRangeIds) {
        this.merchantApplyRangeIds = merchantApplyRangeIds;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantIdList(List<Long> merchantIdList) {
        this.merchantIdList = merchantIdList;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setOrgIdStr(String orgIdStr) {
        this.orgIdStr = orgIdStr;
    }

    public void setOrgIds(List<Long> orgIds) {
        this.orgIds = orgIds;
    }

    public void setOrgIdStrs(List<String> orgIdStrs) {
        this.orgIdStrs = orgIdStrs;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public void setShopIdList(List<Long> shopIdList) {
        this.shopIdList = shopIdList;
    }

    public void setRangeType(Integer rangeType) {
        this.rangeType = rangeType;
    }

    public void setPotential(Integer potential) {
        this.potential = potential;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantApplyRangeQryDTO)) {
            return false;
        }
        MerchantApplyRangeQryDTO other = (MerchantApplyRangeQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantApplyRangeId = this.getMerchantApplyRangeId();
        Long other$merchantApplyRangeId = other.getMerchantApplyRangeId();
        if (this$merchantApplyRangeId == null ? other$merchantApplyRangeId != null : !((Object)this$merchantApplyRangeId).equals(other$merchantApplyRangeId)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Long this$orgId = this.getOrgId();
        Long other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !((Object)this$orgId).equals(other$orgId)) {
            return false;
        }
        Long this$shopId = this.getShopId();
        Long other$shopId = other.getShopId();
        if (this$shopId == null ? other$shopId != null : !((Object)this$shopId).equals(other$shopId)) {
            return false;
        }
        Integer this$rangeType = this.getRangeType();
        Integer other$rangeType = other.getRangeType();
        if (this$rangeType == null ? other$rangeType != null : !((Object)this$rangeType).equals(other$rangeType)) {
            return false;
        }
        Integer this$potential = this.getPotential();
        Integer other$potential = other.getPotential();
        if (this$potential == null ? other$potential != null : !((Object)this$potential).equals(other$potential)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        List<Long> this$merchantApplyRangeIds = this.getMerchantApplyRangeIds();
        List<Long> other$merchantApplyRangeIds = other.getMerchantApplyRangeIds();
        if (this$merchantApplyRangeIds == null ? other$merchantApplyRangeIds != null : !((Object)this$merchantApplyRangeIds).equals(other$merchantApplyRangeIds)) {
            return false;
        }
        List<Long> this$merchantIdList = this.getMerchantIdList();
        List<Long> other$merchantIdList = other.getMerchantIdList();
        if (this$merchantIdList == null ? other$merchantIdList != null : !((Object)this$merchantIdList).equals(other$merchantIdList)) {
            return false;
        }
        String this$orgIdStr = this.getOrgIdStr();
        String other$orgIdStr = other.getOrgIdStr();
        if (this$orgIdStr == null ? other$orgIdStr != null : !this$orgIdStr.equals(other$orgIdStr)) {
            return false;
        }
        List<Long> this$orgIds = this.getOrgIds();
        List<Long> other$orgIds = other.getOrgIds();
        if (this$orgIds == null ? other$orgIds != null : !((Object)this$orgIds).equals(other$orgIds)) {
            return false;
        }
        List<String> this$orgIdStrs = this.getOrgIdStrs();
        List<String> other$orgIdStrs = other.getOrgIdStrs();
        if (this$orgIdStrs == null ? other$orgIdStrs != null : !((Object)this$orgIdStrs).equals(other$orgIdStrs)) {
            return false;
        }
        List<Long> this$shopIdList = this.getShopIdList();
        List<Long> other$shopIdList = other.getShopIdList();
        return !(this$shopIdList == null ? other$shopIdList != null : !((Object)this$shopIdList).equals(other$shopIdList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantApplyRangeQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : ((Object)$orgId).hashCode());
        Long $shopId = this.getShopId();
        result = result * 59 + ($shopId == null ? 43 : ((Object)$shopId).hashCode());
        Integer $rangeType = this.getRangeType();
        result = result * 59 + ($rangeType == null ? 43 : ((Object)$rangeType).hashCode());
        Integer $potential = this.getPotential();
        result = result * 59 + ($potential == null ? 43 : ((Object)$potential).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        List<Long> $merchantApplyRangeIds = this.getMerchantApplyRangeIds();
        result = result * 59 + ($merchantApplyRangeIds == null ? 43 : ((Object)$merchantApplyRangeIds).hashCode());
        List<Long> $merchantIdList = this.getMerchantIdList();
        result = result * 59 + ($merchantIdList == null ? 43 : ((Object)$merchantIdList).hashCode());
        String $orgIdStr = this.getOrgIdStr();
        result = result * 59 + ($orgIdStr == null ? 43 : $orgIdStr.hashCode());
        List<Long> $orgIds = this.getOrgIds();
        result = result * 59 + ($orgIds == null ? 43 : ((Object)$orgIds).hashCode());
        List<String> $orgIdStrs = this.getOrgIdStrs();
        result = result * 59 + ($orgIdStrs == null ? 43 : ((Object)$orgIdStrs).hashCode());
        List<Long> $shopIdList = this.getShopIdList();
        result = result * 59 + ($shopIdList == null ? 43 : ((Object)$shopIdList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantApplyRangeQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", merchantApplyRangeIds=" + this.getMerchantApplyRangeIds() + ", merchantId=" + this.getMerchantId() + ", merchantIdList=" + this.getMerchantIdList() + ", orgId=" + this.getOrgId() + ", orgIdStr=" + this.getOrgIdStr() + ", orgIds=" + this.getOrgIds() + ", orgIdStrs=" + this.getOrgIdStrs() + ", shopId=" + this.getShopId() + ", shopIdList=" + this.getShopIdList() + ", rangeType=" + this.getRangeType() + ", potential=" + this.getPotential() + ")";
    }
}

