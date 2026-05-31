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
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantApplyRangeDetailErpQryDTO
extends UPCPager
implements Serializable {
    private List<String> funcTypeList;
    private Long merchantId;
    private Boolean showGlobal;
    private String pubts;
    private Boolean existPotential;

    public List<String> getFuncTypeList() {
        return this.funcTypeList;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public Boolean getShowGlobal() {
        return this.showGlobal;
    }

    public String getPubts() {
        return this.pubts;
    }

    public Boolean getExistPotential() {
        return this.existPotential;
    }

    public void setFuncTypeList(List<String> funcTypeList) {
        this.funcTypeList = funcTypeList;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setShowGlobal(Boolean showGlobal) {
        this.showGlobal = showGlobal;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setExistPotential(Boolean existPotential) {
        this.existPotential = existPotential;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantApplyRangeDetailErpQryDTO)) {
            return false;
        }
        MerchantApplyRangeDetailErpQryDTO other = (MerchantApplyRangeDetailErpQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Boolean this$showGlobal = this.getShowGlobal();
        Boolean other$showGlobal = other.getShowGlobal();
        if (this$showGlobal == null ? other$showGlobal != null : !((Object)this$showGlobal).equals(other$showGlobal)) {
            return false;
        }
        Boolean this$existPotential = this.getExistPotential();
        Boolean other$existPotential = other.getExistPotential();
        if (this$existPotential == null ? other$existPotential != null : !((Object)this$existPotential).equals(other$existPotential)) {
            return false;
        }
        List<String> this$funcTypeList = this.getFuncTypeList();
        List<String> other$funcTypeList = other.getFuncTypeList();
        if (this$funcTypeList == null ? other$funcTypeList != null : !((Object)this$funcTypeList).equals(other$funcTypeList)) {
            return false;
        }
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        return !(this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MerchantApplyRangeDetailErpQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Boolean $showGlobal = this.getShowGlobal();
        result = result * 59 + ($showGlobal == null ? 43 : ((Object)$showGlobal).hashCode());
        Boolean $existPotential = this.getExistPotential();
        result = result * 59 + ($existPotential == null ? 43 : ((Object)$existPotential).hashCode());
        List<String> $funcTypeList = this.getFuncTypeList();
        result = result * 59 + ($funcTypeList == null ? 43 : ((Object)$funcTypeList).hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MerchantApplyRangeDetailErpQryDTO(funcTypeList=" + this.getFuncTypeList() + ", merchantId=" + this.getMerchantId() + ", showGlobal=" + this.getShowGlobal() + ", pubts=" + this.getPubts() + ", existPotential=" + this.getExistPotential() + ")";
    }
}

