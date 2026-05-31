/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.merchantgroupdto;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantAggregationCrmDto {
    private Long merchantId;
    private String oldOrgId;
    private String newOrgId;
    private String newProfessSalesmanId;
    private String newSpecialManagementDepId;
    private Long newSaleAreaId;
    private Boolean oldOrgStop;

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getOldOrgId() {
        return this.oldOrgId;
    }

    public String getNewOrgId() {
        return this.newOrgId;
    }

    public String getNewProfessSalesmanId() {
        return this.newProfessSalesmanId;
    }

    public String getNewSpecialManagementDepId() {
        return this.newSpecialManagementDepId;
    }

    public Long getNewSaleAreaId() {
        return this.newSaleAreaId;
    }

    public Boolean getOldOrgStop() {
        return this.oldOrgStop;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setOldOrgId(String oldOrgId) {
        this.oldOrgId = oldOrgId;
    }

    public void setNewOrgId(String newOrgId) {
        this.newOrgId = newOrgId;
    }

    public void setNewProfessSalesmanId(String newProfessSalesmanId) {
        this.newProfessSalesmanId = newProfessSalesmanId;
    }

    public void setNewSpecialManagementDepId(String newSpecialManagementDepId) {
        this.newSpecialManagementDepId = newSpecialManagementDepId;
    }

    public void setNewSaleAreaId(Long newSaleAreaId) {
        this.newSaleAreaId = newSaleAreaId;
    }

    public void setOldOrgStop(Boolean oldOrgStop) {
        this.oldOrgStop = oldOrgStop;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantAggregationCrmDto)) {
            return false;
        }
        MerchantAggregationCrmDto other = (MerchantAggregationCrmDto)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Long this$newSaleAreaId = this.getNewSaleAreaId();
        Long other$newSaleAreaId = other.getNewSaleAreaId();
        if (this$newSaleAreaId == null ? other$newSaleAreaId != null : !((Object)this$newSaleAreaId).equals(other$newSaleAreaId)) {
            return false;
        }
        Boolean this$oldOrgStop = this.getOldOrgStop();
        Boolean other$oldOrgStop = other.getOldOrgStop();
        if (this$oldOrgStop == null ? other$oldOrgStop != null : !((Object)this$oldOrgStop).equals(other$oldOrgStop)) {
            return false;
        }
        String this$oldOrgId = this.getOldOrgId();
        String other$oldOrgId = other.getOldOrgId();
        if (this$oldOrgId == null ? other$oldOrgId != null : !this$oldOrgId.equals(other$oldOrgId)) {
            return false;
        }
        String this$newOrgId = this.getNewOrgId();
        String other$newOrgId = other.getNewOrgId();
        if (this$newOrgId == null ? other$newOrgId != null : !this$newOrgId.equals(other$newOrgId)) {
            return false;
        }
        String this$newProfessSalesmanId = this.getNewProfessSalesmanId();
        String other$newProfessSalesmanId = other.getNewProfessSalesmanId();
        if (this$newProfessSalesmanId == null ? other$newProfessSalesmanId != null : !this$newProfessSalesmanId.equals(other$newProfessSalesmanId)) {
            return false;
        }
        String this$newSpecialManagementDepId = this.getNewSpecialManagementDepId();
        String other$newSpecialManagementDepId = other.getNewSpecialManagementDepId();
        return !(this$newSpecialManagementDepId == null ? other$newSpecialManagementDepId != null : !this$newSpecialManagementDepId.equals(other$newSpecialManagementDepId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantAggregationCrmDto;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $newSaleAreaId = this.getNewSaleAreaId();
        result = result * 59 + ($newSaleAreaId == null ? 43 : ((Object)$newSaleAreaId).hashCode());
        Boolean $oldOrgStop = this.getOldOrgStop();
        result = result * 59 + ($oldOrgStop == null ? 43 : ((Object)$oldOrgStop).hashCode());
        String $oldOrgId = this.getOldOrgId();
        result = result * 59 + ($oldOrgId == null ? 43 : $oldOrgId.hashCode());
        String $newOrgId = this.getNewOrgId();
        result = result * 59 + ($newOrgId == null ? 43 : $newOrgId.hashCode());
        String $newProfessSalesmanId = this.getNewProfessSalesmanId();
        result = result * 59 + ($newProfessSalesmanId == null ? 43 : $newProfessSalesmanId.hashCode());
        String $newSpecialManagementDepId = this.getNewSpecialManagementDepId();
        result = result * 59 + ($newSpecialManagementDepId == null ? 43 : $newSpecialManagementDepId.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantAggregationCrmDto(merchantId=" + this.getMerchantId() + ", oldOrgId=" + this.getOldOrgId() + ", newOrgId=" + this.getNewOrgId() + ", newProfessSalesmanId=" + this.getNewProfessSalesmanId() + ", newSpecialManagementDepId=" + this.getNewSpecialManagementDepId() + ", newSaleAreaId=" + this.getNewSaleAreaId() + ", oldOrgStop=" + this.getOldOrgStop() + ")";
    }
}

