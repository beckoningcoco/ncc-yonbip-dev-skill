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

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PrincipalQryDTO
implements Serializable {
    private Long merchantId;
    private String merchantApplyRangeOrgId;

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantApplyRangeOrgId() {
        return this.merchantApplyRangeOrgId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantApplyRangeOrgId(String merchantApplyRangeOrgId) {
        this.merchantApplyRangeOrgId = merchantApplyRangeOrgId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PrincipalQryDTO)) {
            return false;
        }
        PrincipalQryDTO other = (PrincipalQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        String this$merchantApplyRangeOrgId = this.getMerchantApplyRangeOrgId();
        String other$merchantApplyRangeOrgId = other.getMerchantApplyRangeOrgId();
        return !(this$merchantApplyRangeOrgId == null ? other$merchantApplyRangeOrgId != null : !this$merchantApplyRangeOrgId.equals(other$merchantApplyRangeOrgId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PrincipalQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        String $merchantApplyRangeOrgId = this.getMerchantApplyRangeOrgId();
        result = result * 59 + ($merchantApplyRangeOrgId == null ? 43 : $merchantApplyRangeOrgId.hashCode());
        return result;
    }

    public String toString() {
        return "PrincipalQryDTO(merchantId=" + this.getMerchantId() + ", merchantApplyRangeOrgId=" + this.getMerchantApplyRangeOrgId() + ")";
    }
}

