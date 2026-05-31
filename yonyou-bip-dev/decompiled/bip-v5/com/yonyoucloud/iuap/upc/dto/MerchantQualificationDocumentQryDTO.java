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
public class MerchantQualificationDocumentQryDTO
implements Serializable {
    private Long merchantId;
    private String licenseName;
    private Integer warningDay;

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getLicenseName() {
        return this.licenseName;
    }

    public Integer getWarningDay() {
        return this.warningDay;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public void setWarningDay(Integer warningDay) {
        this.warningDay = warningDay;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantQualificationDocumentQryDTO)) {
            return false;
        }
        MerchantQualificationDocumentQryDTO other = (MerchantQualificationDocumentQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Integer this$warningDay = this.getWarningDay();
        Integer other$warningDay = other.getWarningDay();
        if (this$warningDay == null ? other$warningDay != null : !((Object)this$warningDay).equals(other$warningDay)) {
            return false;
        }
        String this$licenseName = this.getLicenseName();
        String other$licenseName = other.getLicenseName();
        return !(this$licenseName == null ? other$licenseName != null : !this$licenseName.equals(other$licenseName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantQualificationDocumentQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Integer $warningDay = this.getWarningDay();
        result = result * 59 + ($warningDay == null ? 43 : ((Object)$warningDay).hashCode());
        String $licenseName = this.getLicenseName();
        result = result * 59 + ($licenseName == null ? 43 : $licenseName.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantQualificationDocumentQryDTO(merchantId=" + this.getMerchantId() + ", licenseName=" + this.getLicenseName() + ", warningDay=" + this.getWarningDay() + ")";
    }
}

