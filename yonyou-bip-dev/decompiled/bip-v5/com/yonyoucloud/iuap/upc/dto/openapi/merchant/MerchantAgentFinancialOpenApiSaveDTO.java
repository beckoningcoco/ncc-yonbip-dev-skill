/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.openapi.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;
import java.util.HashMap;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantAgentFinancialOpenApiSaveDTO
implements Serializable {
    private Long id;
    public String countryId;
    public String countryName;
    public Long provinceId;
    public String provinceCode;
    public String currencyId;
    public String currencyName;
    public String accountType;
    public String bankId;
    public String bankName;
    public String openBankId;
    public String openBankName;
    public String bankAccount;
    public MultilingualVO bankAccountName;
    public String jointLineNo;
    public String remarks;
    public MultilingualVO accountOpeningAddress;
    public String accountOpeningDate;
    public Boolean stopStatus;
    public Boolean isDefault;
    private HashMap<String, Object> agentFinancialCharacter;
    private String entityStatus;
    private String sourceUnique;

    public Long getId() {
        return this.id;
    }

    public String getCountryId() {
        return this.countryId;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public Long getProvinceId() {
        return this.provinceId;
    }

    public String getProvinceCode() {
        return this.provinceCode;
    }

    public String getCurrencyId() {
        return this.currencyId;
    }

    public String getCurrencyName() {
        return this.currencyName;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public String getBankId() {
        return this.bankId;
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getOpenBankId() {
        return this.openBankId;
    }

    public String getOpenBankName() {
        return this.openBankName;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }

    public MultilingualVO getBankAccountName() {
        return this.bankAccountName;
    }

    public String getJointLineNo() {
        return this.jointLineNo;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public MultilingualVO getAccountOpeningAddress() {
        return this.accountOpeningAddress;
    }

    public String getAccountOpeningDate() {
        return this.accountOpeningDate;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public HashMap<String, Object> getAgentFinancialCharacter() {
        return this.agentFinancialCharacter;
    }

    public String getEntityStatus() {
        return this.entityStatus;
    }

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setOpenBankId(String openBankId) {
        this.openBankId = openBankId;
    }

    public void setOpenBankName(String openBankName) {
        this.openBankName = openBankName;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankAccountName(MultilingualVO bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public void setJointLineNo(String jointLineNo) {
        this.jointLineNo = jointLineNo;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setAccountOpeningAddress(MultilingualVO accountOpeningAddress) {
        this.accountOpeningAddress = accountOpeningAddress;
    }

    public void setAccountOpeningDate(String accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setAgentFinancialCharacter(HashMap<String, Object> agentFinancialCharacter) {
        this.agentFinancialCharacter = agentFinancialCharacter;
    }

    public void setEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantAgentFinancialOpenApiSaveDTO)) {
            return false;
        }
        MerchantAgentFinancialOpenApiSaveDTO other = (MerchantAgentFinancialOpenApiSaveDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$provinceId = this.getProvinceId();
        Long other$provinceId = other.getProvinceId();
        if (this$provinceId == null ? other$provinceId != null : !((Object)this$provinceId).equals(other$provinceId)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        String this$countryId = this.getCountryId();
        String other$countryId = other.getCountryId();
        if (this$countryId == null ? other$countryId != null : !this$countryId.equals(other$countryId)) {
            return false;
        }
        String this$countryName = this.getCountryName();
        String other$countryName = other.getCountryName();
        if (this$countryName == null ? other$countryName != null : !this$countryName.equals(other$countryName)) {
            return false;
        }
        String this$provinceCode = this.getProvinceCode();
        String other$provinceCode = other.getProvinceCode();
        if (this$provinceCode == null ? other$provinceCode != null : !this$provinceCode.equals(other$provinceCode)) {
            return false;
        }
        String this$currencyId = this.getCurrencyId();
        String other$currencyId = other.getCurrencyId();
        if (this$currencyId == null ? other$currencyId != null : !this$currencyId.equals(other$currencyId)) {
            return false;
        }
        String this$currencyName = this.getCurrencyName();
        String other$currencyName = other.getCurrencyName();
        if (this$currencyName == null ? other$currencyName != null : !this$currencyName.equals(other$currencyName)) {
            return false;
        }
        String this$accountType = this.getAccountType();
        String other$accountType = other.getAccountType();
        if (this$accountType == null ? other$accountType != null : !this$accountType.equals(other$accountType)) {
            return false;
        }
        String this$bankId = this.getBankId();
        String other$bankId = other.getBankId();
        if (this$bankId == null ? other$bankId != null : !this$bankId.equals(other$bankId)) {
            return false;
        }
        String this$bankName = this.getBankName();
        String other$bankName = other.getBankName();
        if (this$bankName == null ? other$bankName != null : !this$bankName.equals(other$bankName)) {
            return false;
        }
        String this$openBankId = this.getOpenBankId();
        String other$openBankId = other.getOpenBankId();
        if (this$openBankId == null ? other$openBankId != null : !this$openBankId.equals(other$openBankId)) {
            return false;
        }
        String this$openBankName = this.getOpenBankName();
        String other$openBankName = other.getOpenBankName();
        if (this$openBankName == null ? other$openBankName != null : !this$openBankName.equals(other$openBankName)) {
            return false;
        }
        String this$bankAccount = this.getBankAccount();
        String other$bankAccount = other.getBankAccount();
        if (this$bankAccount == null ? other$bankAccount != null : !this$bankAccount.equals(other$bankAccount)) {
            return false;
        }
        MultilingualVO this$bankAccountName = this.getBankAccountName();
        MultilingualVO other$bankAccountName = other.getBankAccountName();
        if (this$bankAccountName == null ? other$bankAccountName != null : !((Object)this$bankAccountName).equals(other$bankAccountName)) {
            return false;
        }
        String this$jointLineNo = this.getJointLineNo();
        String other$jointLineNo = other.getJointLineNo();
        if (this$jointLineNo == null ? other$jointLineNo != null : !this$jointLineNo.equals(other$jointLineNo)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
            return false;
        }
        MultilingualVO this$accountOpeningAddress = this.getAccountOpeningAddress();
        MultilingualVO other$accountOpeningAddress = other.getAccountOpeningAddress();
        if (this$accountOpeningAddress == null ? other$accountOpeningAddress != null : !((Object)this$accountOpeningAddress).equals(other$accountOpeningAddress)) {
            return false;
        }
        String this$accountOpeningDate = this.getAccountOpeningDate();
        String other$accountOpeningDate = other.getAccountOpeningDate();
        if (this$accountOpeningDate == null ? other$accountOpeningDate != null : !this$accountOpeningDate.equals(other$accountOpeningDate)) {
            return false;
        }
        HashMap<String, Object> this$agentFinancialCharacter = this.getAgentFinancialCharacter();
        HashMap<String, Object> other$agentFinancialCharacter = other.getAgentFinancialCharacter();
        if (this$agentFinancialCharacter == null ? other$agentFinancialCharacter != null : !((Object)this$agentFinancialCharacter).equals(other$agentFinancialCharacter)) {
            return false;
        }
        String this$entityStatus = this.getEntityStatus();
        String other$entityStatus = other.getEntityStatus();
        if (this$entityStatus == null ? other$entityStatus != null : !this$entityStatus.equals(other$entityStatus)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        return !(this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantAgentFinancialOpenApiSaveDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $provinceId = this.getProvinceId();
        result = result * 59 + ($provinceId == null ? 43 : ((Object)$provinceId).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        String $countryId = this.getCountryId();
        result = result * 59 + ($countryId == null ? 43 : $countryId.hashCode());
        String $countryName = this.getCountryName();
        result = result * 59 + ($countryName == null ? 43 : $countryName.hashCode());
        String $provinceCode = this.getProvinceCode();
        result = result * 59 + ($provinceCode == null ? 43 : $provinceCode.hashCode());
        String $currencyId = this.getCurrencyId();
        result = result * 59 + ($currencyId == null ? 43 : $currencyId.hashCode());
        String $currencyName = this.getCurrencyName();
        result = result * 59 + ($currencyName == null ? 43 : $currencyName.hashCode());
        String $accountType = this.getAccountType();
        result = result * 59 + ($accountType == null ? 43 : $accountType.hashCode());
        String $bankId = this.getBankId();
        result = result * 59 + ($bankId == null ? 43 : $bankId.hashCode());
        String $bankName = this.getBankName();
        result = result * 59 + ($bankName == null ? 43 : $bankName.hashCode());
        String $openBankId = this.getOpenBankId();
        result = result * 59 + ($openBankId == null ? 43 : $openBankId.hashCode());
        String $openBankName = this.getOpenBankName();
        result = result * 59 + ($openBankName == null ? 43 : $openBankName.hashCode());
        String $bankAccount = this.getBankAccount();
        result = result * 59 + ($bankAccount == null ? 43 : $bankAccount.hashCode());
        MultilingualVO $bankAccountName = this.getBankAccountName();
        result = result * 59 + ($bankAccountName == null ? 43 : $bankAccountName.hashCode());
        String $jointLineNo = this.getJointLineNo();
        result = result * 59 + ($jointLineNo == null ? 43 : $jointLineNo.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        MultilingualVO $accountOpeningAddress = this.getAccountOpeningAddress();
        result = result * 59 + ($accountOpeningAddress == null ? 43 : $accountOpeningAddress.hashCode());
        String $accountOpeningDate = this.getAccountOpeningDate();
        result = result * 59 + ($accountOpeningDate == null ? 43 : $accountOpeningDate.hashCode());
        HashMap<String, Object> $agentFinancialCharacter = this.getAgentFinancialCharacter();
        result = result * 59 + ($agentFinancialCharacter == null ? 43 : ((Object)$agentFinancialCharacter).hashCode());
        String $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : $entityStatus.hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantAgentFinancialOpenApiSaveDTO(id=" + this.getId() + ", countryId=" + this.getCountryId() + ", countryName=" + this.getCountryName() + ", provinceId=" + this.getProvinceId() + ", provinceCode=" + this.getProvinceCode() + ", currencyId=" + this.getCurrencyId() + ", currencyName=" + this.getCurrencyName() + ", accountType=" + this.getAccountType() + ", bankId=" + this.getBankId() + ", bankName=" + this.getBankName() + ", openBankId=" + this.getOpenBankId() + ", openBankName=" + this.getOpenBankName() + ", bankAccount=" + this.getBankAccount() + ", bankAccountName=" + this.getBankAccountName() + ", jointLineNo=" + this.getJointLineNo() + ", remarks=" + this.getRemarks() + ", accountOpeningAddress=" + this.getAccountOpeningAddress() + ", accountOpeningDate=" + this.getAccountOpeningDate() + ", stopStatus=" + this.getStopStatus() + ", isDefault=" + this.getIsDefault() + ", agentFinancialCharacter=" + this.getAgentFinancialCharacter() + ", entityStatus=" + this.getEntityStatus() + ", sourceUnique=" + this.getSourceUnique() + ")";
    }
}

