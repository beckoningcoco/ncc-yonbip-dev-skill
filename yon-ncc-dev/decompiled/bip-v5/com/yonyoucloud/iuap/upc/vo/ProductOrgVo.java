/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductOrgVo {
    private Integer rangeType;
    private String orgId;
    private String orgCode;
    private Boolean isCreator;
    private Boolean isApplied;
    private Integer orgType;

    public Integer getRangeType() {
        return this.rangeType;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public Boolean getIsCreator() {
        return this.isCreator;
    }

    public Boolean getIsApplied() {
        return this.isApplied;
    }

    public Integer getOrgType() {
        return this.orgType;
    }

    public void setRangeType(Integer rangeType) {
        this.rangeType = rangeType;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setIsCreator(Boolean isCreator) {
        this.isCreator = isCreator;
    }

    public void setIsApplied(Boolean isApplied) {
        this.isApplied = isApplied;
    }

    public void setOrgType(Integer orgType) {
        this.orgType = orgType;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductOrgVo)) {
            return false;
        }
        ProductOrgVo other = (ProductOrgVo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$rangeType = this.getRangeType();
        Integer other$rangeType = other.getRangeType();
        if (this$rangeType == null ? other$rangeType != null : !((Object)this$rangeType).equals(other$rangeType)) {
            return false;
        }
        Boolean this$isCreator = this.getIsCreator();
        Boolean other$isCreator = other.getIsCreator();
        if (this$isCreator == null ? other$isCreator != null : !((Object)this$isCreator).equals(other$isCreator)) {
            return false;
        }
        Boolean this$isApplied = this.getIsApplied();
        Boolean other$isApplied = other.getIsApplied();
        if (this$isApplied == null ? other$isApplied != null : !((Object)this$isApplied).equals(other$isApplied)) {
            return false;
        }
        Integer this$orgType = this.getOrgType();
        Integer other$orgType = other.getOrgType();
        if (this$orgType == null ? other$orgType != null : !((Object)this$orgType).equals(other$orgType)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$orgCode = this.getOrgCode();
        String other$orgCode = other.getOrgCode();
        return !(this$orgCode == null ? other$orgCode != null : !this$orgCode.equals(other$orgCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductOrgVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $rangeType = this.getRangeType();
        result = result * 59 + ($rangeType == null ? 43 : ((Object)$rangeType).hashCode());
        Boolean $isCreator = this.getIsCreator();
        result = result * 59 + ($isCreator == null ? 43 : ((Object)$isCreator).hashCode());
        Boolean $isApplied = this.getIsApplied();
        result = result * 59 + ($isApplied == null ? 43 : ((Object)$isApplied).hashCode());
        Integer $orgType = this.getOrgType();
        result = result * 59 + ($orgType == null ? 43 : ((Object)$orgType).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $orgCode = this.getOrgCode();
        result = result * 59 + ($orgCode == null ? 43 : $orgCode.hashCode());
        return result;
    }

    public String toString() {
        return "ProductOrgVo(rangeType=" + this.getRangeType() + ", orgId=" + this.getOrgId() + ", orgCode=" + this.getOrgCode() + ", isCreator=" + this.getIsCreator() + ", isApplied=" + this.getIsApplied() + ", orgType=" + this.getOrgType() + ")";
    }
}

