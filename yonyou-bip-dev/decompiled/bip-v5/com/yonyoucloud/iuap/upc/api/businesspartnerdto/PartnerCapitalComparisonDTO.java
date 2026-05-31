/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.api.businesspartnerdto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.PartnerComparisonDTO;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PartnerCapitalComparisonDTO
extends PartnerComparisonDTO
implements Serializable {
    private String capitalId;
    private String code;
    private String managementAccountSubjectId;
    private String managementAccountSubjectCode;
    private String fundBusinessObjectTypeId;
    private String fundBusinessObjectTypeCode;
    private Boolean privacyOrPublic;
    private String settleCenterId;
    private String settleCenterCode;
    private String bankBranchId;
    private String bankBranchCode;
    private String accountSubjectId;
    private String accountSubjectCode;

    public String getCapitalId() {
        return this.capitalId;
    }

    public String getCode() {
        return this.code;
    }

    public String getManagementAccountSubjectId() {
        return this.managementAccountSubjectId;
    }

    public String getManagementAccountSubjectCode() {
        return this.managementAccountSubjectCode;
    }

    public String getFundBusinessObjectTypeId() {
        return this.fundBusinessObjectTypeId;
    }

    public String getFundBusinessObjectTypeCode() {
        return this.fundBusinessObjectTypeCode;
    }

    public Boolean getPrivacyOrPublic() {
        return this.privacyOrPublic;
    }

    public String getSettleCenterId() {
        return this.settleCenterId;
    }

    public String getSettleCenterCode() {
        return this.settleCenterCode;
    }

    public String getBankBranchId() {
        return this.bankBranchId;
    }

    public String getBankBranchCode() {
        return this.bankBranchCode;
    }

    public String getAccountSubjectId() {
        return this.accountSubjectId;
    }

    public String getAccountSubjectCode() {
        return this.accountSubjectCode;
    }

    public void setCapitalId(String capitalId) {
        this.capitalId = capitalId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setManagementAccountSubjectId(String managementAccountSubjectId) {
        this.managementAccountSubjectId = managementAccountSubjectId;
    }

    public void setManagementAccountSubjectCode(String managementAccountSubjectCode) {
        this.managementAccountSubjectCode = managementAccountSubjectCode;
    }

    public void setFundBusinessObjectTypeId(String fundBusinessObjectTypeId) {
        this.fundBusinessObjectTypeId = fundBusinessObjectTypeId;
    }

    public void setFundBusinessObjectTypeCode(String fundBusinessObjectTypeCode) {
        this.fundBusinessObjectTypeCode = fundBusinessObjectTypeCode;
    }

    public void setPrivacyOrPublic(Boolean privacyOrPublic) {
        this.privacyOrPublic = privacyOrPublic;
    }

    public void setSettleCenterId(String settleCenterId) {
        this.settleCenterId = settleCenterId;
    }

    public void setSettleCenterCode(String settleCenterCode) {
        this.settleCenterCode = settleCenterCode;
    }

    public void setBankBranchId(String bankBranchId) {
        this.bankBranchId = bankBranchId;
    }

    public void setBankBranchCode(String bankBranchCode) {
        this.bankBranchCode = bankBranchCode;
    }

    public void setAccountSubjectId(String accountSubjectId) {
        this.accountSubjectId = accountSubjectId;
    }

    public void setAccountSubjectCode(String accountSubjectCode) {
        this.accountSubjectCode = accountSubjectCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PartnerCapitalComparisonDTO)) {
            return false;
        }
        PartnerCapitalComparisonDTO other = (PartnerCapitalComparisonDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$privacyOrPublic = this.getPrivacyOrPublic();
        Boolean other$privacyOrPublic = other.getPrivacyOrPublic();
        if (this$privacyOrPublic == null ? other$privacyOrPublic != null : !((Object)this$privacyOrPublic).equals(other$privacyOrPublic)) {
            return false;
        }
        String this$capitalId = this.getCapitalId();
        String other$capitalId = other.getCapitalId();
        if (this$capitalId == null ? other$capitalId != null : !this$capitalId.equals(other$capitalId)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$managementAccountSubjectId = this.getManagementAccountSubjectId();
        String other$managementAccountSubjectId = other.getManagementAccountSubjectId();
        if (this$managementAccountSubjectId == null ? other$managementAccountSubjectId != null : !this$managementAccountSubjectId.equals(other$managementAccountSubjectId)) {
            return false;
        }
        String this$managementAccountSubjectCode = this.getManagementAccountSubjectCode();
        String other$managementAccountSubjectCode = other.getManagementAccountSubjectCode();
        if (this$managementAccountSubjectCode == null ? other$managementAccountSubjectCode != null : !this$managementAccountSubjectCode.equals(other$managementAccountSubjectCode)) {
            return false;
        }
        String this$fundBusinessObjectTypeId = this.getFundBusinessObjectTypeId();
        String other$fundBusinessObjectTypeId = other.getFundBusinessObjectTypeId();
        if (this$fundBusinessObjectTypeId == null ? other$fundBusinessObjectTypeId != null : !this$fundBusinessObjectTypeId.equals(other$fundBusinessObjectTypeId)) {
            return false;
        }
        String this$fundBusinessObjectTypeCode = this.getFundBusinessObjectTypeCode();
        String other$fundBusinessObjectTypeCode = other.getFundBusinessObjectTypeCode();
        if (this$fundBusinessObjectTypeCode == null ? other$fundBusinessObjectTypeCode != null : !this$fundBusinessObjectTypeCode.equals(other$fundBusinessObjectTypeCode)) {
            return false;
        }
        String this$settleCenterId = this.getSettleCenterId();
        String other$settleCenterId = other.getSettleCenterId();
        if (this$settleCenterId == null ? other$settleCenterId != null : !this$settleCenterId.equals(other$settleCenterId)) {
            return false;
        }
        String this$settleCenterCode = this.getSettleCenterCode();
        String other$settleCenterCode = other.getSettleCenterCode();
        if (this$settleCenterCode == null ? other$settleCenterCode != null : !this$settleCenterCode.equals(other$settleCenterCode)) {
            return false;
        }
        String this$bankBranchId = this.getBankBranchId();
        String other$bankBranchId = other.getBankBranchId();
        if (this$bankBranchId == null ? other$bankBranchId != null : !this$bankBranchId.equals(other$bankBranchId)) {
            return false;
        }
        String this$bankBranchCode = this.getBankBranchCode();
        String other$bankBranchCode = other.getBankBranchCode();
        if (this$bankBranchCode == null ? other$bankBranchCode != null : !this$bankBranchCode.equals(other$bankBranchCode)) {
            return false;
        }
        String this$accountSubjectId = this.getAccountSubjectId();
        String other$accountSubjectId = other.getAccountSubjectId();
        if (this$accountSubjectId == null ? other$accountSubjectId != null : !this$accountSubjectId.equals(other$accountSubjectId)) {
            return false;
        }
        String this$accountSubjectCode = this.getAccountSubjectCode();
        String other$accountSubjectCode = other.getAccountSubjectCode();
        return !(this$accountSubjectCode == null ? other$accountSubjectCode != null : !this$accountSubjectCode.equals(other$accountSubjectCode));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof PartnerCapitalComparisonDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $privacyOrPublic = this.getPrivacyOrPublic();
        result = result * 59 + ($privacyOrPublic == null ? 43 : ((Object)$privacyOrPublic).hashCode());
        String $capitalId = this.getCapitalId();
        result = result * 59 + ($capitalId == null ? 43 : $capitalId.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $managementAccountSubjectId = this.getManagementAccountSubjectId();
        result = result * 59 + ($managementAccountSubjectId == null ? 43 : $managementAccountSubjectId.hashCode());
        String $managementAccountSubjectCode = this.getManagementAccountSubjectCode();
        result = result * 59 + ($managementAccountSubjectCode == null ? 43 : $managementAccountSubjectCode.hashCode());
        String $fundBusinessObjectTypeId = this.getFundBusinessObjectTypeId();
        result = result * 59 + ($fundBusinessObjectTypeId == null ? 43 : $fundBusinessObjectTypeId.hashCode());
        String $fundBusinessObjectTypeCode = this.getFundBusinessObjectTypeCode();
        result = result * 59 + ($fundBusinessObjectTypeCode == null ? 43 : $fundBusinessObjectTypeCode.hashCode());
        String $settleCenterId = this.getSettleCenterId();
        result = result * 59 + ($settleCenterId == null ? 43 : $settleCenterId.hashCode());
        String $settleCenterCode = this.getSettleCenterCode();
        result = result * 59 + ($settleCenterCode == null ? 43 : $settleCenterCode.hashCode());
        String $bankBranchId = this.getBankBranchId();
        result = result * 59 + ($bankBranchId == null ? 43 : $bankBranchId.hashCode());
        String $bankBranchCode = this.getBankBranchCode();
        result = result * 59 + ($bankBranchCode == null ? 43 : $bankBranchCode.hashCode());
        String $accountSubjectId = this.getAccountSubjectId();
        result = result * 59 + ($accountSubjectId == null ? 43 : $accountSubjectId.hashCode());
        String $accountSubjectCode = this.getAccountSubjectCode();
        result = result * 59 + ($accountSubjectCode == null ? 43 : $accountSubjectCode.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "PartnerCapitalComparisonDTO(capitalId=" + this.getCapitalId() + ", code=" + this.getCode() + ", managementAccountSubjectId=" + this.getManagementAccountSubjectId() + ", managementAccountSubjectCode=" + this.getManagementAccountSubjectCode() + ", fundBusinessObjectTypeId=" + this.getFundBusinessObjectTypeId() + ", fundBusinessObjectTypeCode=" + this.getFundBusinessObjectTypeCode() + ", privacyOrPublic=" + this.getPrivacyOrPublic() + ", settleCenterId=" + this.getSettleCenterId() + ", settleCenterCode=" + this.getSettleCenterCode() + ", bankBranchId=" + this.getBankBranchId() + ", bankBranchCode=" + this.getBankBranchCode() + ", accountSubjectId=" + this.getAccountSubjectId() + ", accountSubjectCode=" + this.getAccountSubjectCode() + ")";
    }
}

