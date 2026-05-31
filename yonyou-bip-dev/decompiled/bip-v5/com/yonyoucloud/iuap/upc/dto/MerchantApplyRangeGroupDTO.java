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
public class MerchantApplyRangeGroupDTO
implements Serializable {
    private String id;
    private String orgId;
    private String orgExternalorg;
    private Long merchantId;
    private String merchantName;
    private String merchantCode;
    private Long merchantCustomerClass;
    private Long merchantCustomerIndustry;
    private Long merchantChannCustomerClass;
    private Long merchantChannCustomerLevel;
    private Long merchantChannCustomerArea;
    private Long merchantChannCustomerIndustry;
    private Boolean detailStopStatus;
    private Long detailCustomerLevel;
    private Long detailCustomerArea;
    private String detailTransactionCurrency;

    public String getId() {
        return this.id;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOrgExternalorg() {
        return this.orgExternalorg;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getMerchantCode() {
        return this.merchantCode;
    }

    public Long getMerchantCustomerClass() {
        return this.merchantCustomerClass;
    }

    public Long getMerchantCustomerIndustry() {
        return this.merchantCustomerIndustry;
    }

    public Long getMerchantChannCustomerClass() {
        return this.merchantChannCustomerClass;
    }

    public Long getMerchantChannCustomerLevel() {
        return this.merchantChannCustomerLevel;
    }

    public Long getMerchantChannCustomerArea() {
        return this.merchantChannCustomerArea;
    }

    public Long getMerchantChannCustomerIndustry() {
        return this.merchantChannCustomerIndustry;
    }

    public Boolean getDetailStopStatus() {
        return this.detailStopStatus;
    }

    public Long getDetailCustomerLevel() {
        return this.detailCustomerLevel;
    }

    public Long getDetailCustomerArea() {
        return this.detailCustomerArea;
    }

    public String getDetailTransactionCurrency() {
        return this.detailTransactionCurrency;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgExternalorg(String orgExternalorg) {
        this.orgExternalorg = orgExternalorg;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public void setMerchantCustomerClass(Long merchantCustomerClass) {
        this.merchantCustomerClass = merchantCustomerClass;
    }

    public void setMerchantCustomerIndustry(Long merchantCustomerIndustry) {
        this.merchantCustomerIndustry = merchantCustomerIndustry;
    }

    public void setMerchantChannCustomerClass(Long merchantChannCustomerClass) {
        this.merchantChannCustomerClass = merchantChannCustomerClass;
    }

    public void setMerchantChannCustomerLevel(Long merchantChannCustomerLevel) {
        this.merchantChannCustomerLevel = merchantChannCustomerLevel;
    }

    public void setMerchantChannCustomerArea(Long merchantChannCustomerArea) {
        this.merchantChannCustomerArea = merchantChannCustomerArea;
    }

    public void setMerchantChannCustomerIndustry(Long merchantChannCustomerIndustry) {
        this.merchantChannCustomerIndustry = merchantChannCustomerIndustry;
    }

    public void setDetailStopStatus(Boolean detailStopStatus) {
        this.detailStopStatus = detailStopStatus;
    }

    public void setDetailCustomerLevel(Long detailCustomerLevel) {
        this.detailCustomerLevel = detailCustomerLevel;
    }

    public void setDetailCustomerArea(Long detailCustomerArea) {
        this.detailCustomerArea = detailCustomerArea;
    }

    public void setDetailTransactionCurrency(String detailTransactionCurrency) {
        this.detailTransactionCurrency = detailTransactionCurrency;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantApplyRangeGroupDTO)) {
            return false;
        }
        MerchantApplyRangeGroupDTO other = (MerchantApplyRangeGroupDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Long this$merchantCustomerClass = this.getMerchantCustomerClass();
        Long other$merchantCustomerClass = other.getMerchantCustomerClass();
        if (this$merchantCustomerClass == null ? other$merchantCustomerClass != null : !((Object)this$merchantCustomerClass).equals(other$merchantCustomerClass)) {
            return false;
        }
        Long this$merchantCustomerIndustry = this.getMerchantCustomerIndustry();
        Long other$merchantCustomerIndustry = other.getMerchantCustomerIndustry();
        if (this$merchantCustomerIndustry == null ? other$merchantCustomerIndustry != null : !((Object)this$merchantCustomerIndustry).equals(other$merchantCustomerIndustry)) {
            return false;
        }
        Long this$merchantChannCustomerClass = this.getMerchantChannCustomerClass();
        Long other$merchantChannCustomerClass = other.getMerchantChannCustomerClass();
        if (this$merchantChannCustomerClass == null ? other$merchantChannCustomerClass != null : !((Object)this$merchantChannCustomerClass).equals(other$merchantChannCustomerClass)) {
            return false;
        }
        Long this$merchantChannCustomerLevel = this.getMerchantChannCustomerLevel();
        Long other$merchantChannCustomerLevel = other.getMerchantChannCustomerLevel();
        if (this$merchantChannCustomerLevel == null ? other$merchantChannCustomerLevel != null : !((Object)this$merchantChannCustomerLevel).equals(other$merchantChannCustomerLevel)) {
            return false;
        }
        Long this$merchantChannCustomerArea = this.getMerchantChannCustomerArea();
        Long other$merchantChannCustomerArea = other.getMerchantChannCustomerArea();
        if (this$merchantChannCustomerArea == null ? other$merchantChannCustomerArea != null : !((Object)this$merchantChannCustomerArea).equals(other$merchantChannCustomerArea)) {
            return false;
        }
        Long this$merchantChannCustomerIndustry = this.getMerchantChannCustomerIndustry();
        Long other$merchantChannCustomerIndustry = other.getMerchantChannCustomerIndustry();
        if (this$merchantChannCustomerIndustry == null ? other$merchantChannCustomerIndustry != null : !((Object)this$merchantChannCustomerIndustry).equals(other$merchantChannCustomerIndustry)) {
            return false;
        }
        Boolean this$detailStopStatus = this.getDetailStopStatus();
        Boolean other$detailStopStatus = other.getDetailStopStatus();
        if (this$detailStopStatus == null ? other$detailStopStatus != null : !((Object)this$detailStopStatus).equals(other$detailStopStatus)) {
            return false;
        }
        Long this$detailCustomerLevel = this.getDetailCustomerLevel();
        Long other$detailCustomerLevel = other.getDetailCustomerLevel();
        if (this$detailCustomerLevel == null ? other$detailCustomerLevel != null : !((Object)this$detailCustomerLevel).equals(other$detailCustomerLevel)) {
            return false;
        }
        Long this$detailCustomerArea = this.getDetailCustomerArea();
        Long other$detailCustomerArea = other.getDetailCustomerArea();
        if (this$detailCustomerArea == null ? other$detailCustomerArea != null : !((Object)this$detailCustomerArea).equals(other$detailCustomerArea)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$orgExternalorg = this.getOrgExternalorg();
        String other$orgExternalorg = other.getOrgExternalorg();
        if (this$orgExternalorg == null ? other$orgExternalorg != null : !this$orgExternalorg.equals(other$orgExternalorg)) {
            return false;
        }
        String this$merchantName = this.getMerchantName();
        String other$merchantName = other.getMerchantName();
        if (this$merchantName == null ? other$merchantName != null : !this$merchantName.equals(other$merchantName)) {
            return false;
        }
        String this$merchantCode = this.getMerchantCode();
        String other$merchantCode = other.getMerchantCode();
        if (this$merchantCode == null ? other$merchantCode != null : !this$merchantCode.equals(other$merchantCode)) {
            return false;
        }
        String this$detailTransactionCurrency = this.getDetailTransactionCurrency();
        String other$detailTransactionCurrency = other.getDetailTransactionCurrency();
        return !(this$detailTransactionCurrency == null ? other$detailTransactionCurrency != null : !this$detailTransactionCurrency.equals(other$detailTransactionCurrency));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantApplyRangeGroupDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $merchantCustomerClass = this.getMerchantCustomerClass();
        result = result * 59 + ($merchantCustomerClass == null ? 43 : ((Object)$merchantCustomerClass).hashCode());
        Long $merchantCustomerIndustry = this.getMerchantCustomerIndustry();
        result = result * 59 + ($merchantCustomerIndustry == null ? 43 : ((Object)$merchantCustomerIndustry).hashCode());
        Long $merchantChannCustomerClass = this.getMerchantChannCustomerClass();
        result = result * 59 + ($merchantChannCustomerClass == null ? 43 : ((Object)$merchantChannCustomerClass).hashCode());
        Long $merchantChannCustomerLevel = this.getMerchantChannCustomerLevel();
        result = result * 59 + ($merchantChannCustomerLevel == null ? 43 : ((Object)$merchantChannCustomerLevel).hashCode());
        Long $merchantChannCustomerArea = this.getMerchantChannCustomerArea();
        result = result * 59 + ($merchantChannCustomerArea == null ? 43 : ((Object)$merchantChannCustomerArea).hashCode());
        Long $merchantChannCustomerIndustry = this.getMerchantChannCustomerIndustry();
        result = result * 59 + ($merchantChannCustomerIndustry == null ? 43 : ((Object)$merchantChannCustomerIndustry).hashCode());
        Boolean $detailStopStatus = this.getDetailStopStatus();
        result = result * 59 + ($detailStopStatus == null ? 43 : ((Object)$detailStopStatus).hashCode());
        Long $detailCustomerLevel = this.getDetailCustomerLevel();
        result = result * 59 + ($detailCustomerLevel == null ? 43 : ((Object)$detailCustomerLevel).hashCode());
        Long $detailCustomerArea = this.getDetailCustomerArea();
        result = result * 59 + ($detailCustomerArea == null ? 43 : ((Object)$detailCustomerArea).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $orgExternalorg = this.getOrgExternalorg();
        result = result * 59 + ($orgExternalorg == null ? 43 : $orgExternalorg.hashCode());
        String $merchantName = this.getMerchantName();
        result = result * 59 + ($merchantName == null ? 43 : $merchantName.hashCode());
        String $merchantCode = this.getMerchantCode();
        result = result * 59 + ($merchantCode == null ? 43 : $merchantCode.hashCode());
        String $detailTransactionCurrency = this.getDetailTransactionCurrency();
        result = result * 59 + ($detailTransactionCurrency == null ? 43 : $detailTransactionCurrency.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantApplyRangeGroupDTO(id=" + this.getId() + ", orgId=" + this.getOrgId() + ", orgExternalorg=" + this.getOrgExternalorg() + ", merchantId=" + this.getMerchantId() + ", merchantName=" + this.getMerchantName() + ", merchantCode=" + this.getMerchantCode() + ", merchantCustomerClass=" + this.getMerchantCustomerClass() + ", merchantCustomerIndustry=" + this.getMerchantCustomerIndustry() + ", merchantChannCustomerClass=" + this.getMerchantChannCustomerClass() + ", merchantChannCustomerLevel=" + this.getMerchantChannCustomerLevel() + ", merchantChannCustomerArea=" + this.getMerchantChannCustomerArea() + ", merchantChannCustomerIndustry=" + this.getMerchantChannCustomerIndustry() + ", detailStopStatus=" + this.getDetailStopStatus() + ", detailCustomerLevel=" + this.getDetailCustomerLevel() + ", detailCustomerArea=" + this.getDetailCustomerArea() + ", detailTransactionCurrency=" + this.getDetailTransactionCurrency() + ")";
    }
}

