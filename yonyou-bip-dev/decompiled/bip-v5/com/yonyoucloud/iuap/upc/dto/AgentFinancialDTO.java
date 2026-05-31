/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;
import java.io.Serializable;
import java.util.Date;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AgentFinancialDTO
implements Serializable {
    private Long id;
    private Long merchantId;
    private String merchantName;
    private String bankAccount;
    private String bankAccountName;
    private String bank;
    private String openBank;
    private String currency;
    private Integer accountType;
    private Boolean isDefault;
    private Boolean stopStatus;
    private String country;
    private Long province;
    private String provinceName;
    private String jointLineNo;
    private String remarks;
    private String erpCode;
    private String swiftCode;
    private Date accountOpeningDate;
    private String agentBankForElectronic;
    private UPCEntityStatus entityStatus = UPCEntityStatus.Insert;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }

    public String getBankAccountName() {
        return this.bankAccountName;
    }

    public String getBank() {
        return this.bank;
    }

    public String getOpenBank() {
        return this.openBank;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Integer getAccountType() {
        return this.accountType;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public String getCountry() {
        return this.country;
    }

    public Long getProvince() {
        return this.province;
    }

    public String getProvinceName() {
        return this.provinceName;
    }

    public String getJointLineNo() {
        return this.jointLineNo;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public String getSwiftCode() {
        return this.swiftCode;
    }

    public Date getAccountOpeningDate() {
        return this.accountOpeningDate;
    }

    public String getAgentBankForElectronic() {
        return this.agentBankForElectronic;
    }

    public UPCEntityStatus getEntityStatus() {
        return this.entityStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public void setJointLineNo(String jointLineNo) {
        this.jointLineNo = jointLineNo;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public void setAccountOpeningDate(Date accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public void setAgentBankForElectronic(String agentBankForElectronic) {
        this.agentBankForElectronic = agentBankForElectronic;
    }

    public void setEntityStatus(UPCEntityStatus entityStatus) {
        this.entityStatus = entityStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentFinancialDTO)) {
            return false;
        }
        AgentFinancialDTO other = (AgentFinancialDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Integer this$accountType = this.getAccountType();
        Integer other$accountType = other.getAccountType();
        if (this$accountType == null ? other$accountType != null : !((Object)this$accountType).equals(other$accountType)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        Long this$province = this.getProvince();
        Long other$province = other.getProvince();
        if (this$province == null ? other$province != null : !((Object)this$province).equals(other$province)) {
            return false;
        }
        String this$merchantName = this.getMerchantName();
        String other$merchantName = other.getMerchantName();
        if (this$merchantName == null ? other$merchantName != null : !this$merchantName.equals(other$merchantName)) {
            return false;
        }
        String this$bankAccount = this.getBankAccount();
        String other$bankAccount = other.getBankAccount();
        if (this$bankAccount == null ? other$bankAccount != null : !this$bankAccount.equals(other$bankAccount)) {
            return false;
        }
        String this$bankAccountName = this.getBankAccountName();
        String other$bankAccountName = other.getBankAccountName();
        if (this$bankAccountName == null ? other$bankAccountName != null : !this$bankAccountName.equals(other$bankAccountName)) {
            return false;
        }
        String this$bank = this.getBank();
        String other$bank = other.getBank();
        if (this$bank == null ? other$bank != null : !this$bank.equals(other$bank)) {
            return false;
        }
        String this$openBank = this.getOpenBank();
        String other$openBank = other.getOpenBank();
        if (this$openBank == null ? other$openBank != null : !this$openBank.equals(other$openBank)) {
            return false;
        }
        String this$currency = this.getCurrency();
        String other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) {
            return false;
        }
        String this$country = this.getCountry();
        String other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) {
            return false;
        }
        String this$provinceName = this.getProvinceName();
        String other$provinceName = other.getProvinceName();
        if (this$provinceName == null ? other$provinceName != null : !this$provinceName.equals(other$provinceName)) {
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
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String this$swiftCode = this.getSwiftCode();
        String other$swiftCode = other.getSwiftCode();
        if (this$swiftCode == null ? other$swiftCode != null : !this$swiftCode.equals(other$swiftCode)) {
            return false;
        }
        Date this$accountOpeningDate = this.getAccountOpeningDate();
        Date other$accountOpeningDate = other.getAccountOpeningDate();
        if (this$accountOpeningDate == null ? other$accountOpeningDate != null : !((Object)this$accountOpeningDate).equals(other$accountOpeningDate)) {
            return false;
        }
        String this$agentBankForElectronic = this.getAgentBankForElectronic();
        String other$agentBankForElectronic = other.getAgentBankForElectronic();
        if (this$agentBankForElectronic == null ? other$agentBankForElectronic != null : !this$agentBankForElectronic.equals(other$agentBankForElectronic)) {
            return false;
        }
        UPCEntityStatus this$entityStatus = this.getEntityStatus();
        UPCEntityStatus other$entityStatus = other.getEntityStatus();
        return !(this$entityStatus == null ? other$entityStatus != null : !((Object)((Object)this$entityStatus)).equals((Object)other$entityStatus));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AgentFinancialDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Integer $accountType = this.getAccountType();
        result = result * 59 + ($accountType == null ? 43 : ((Object)$accountType).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        Long $province = this.getProvince();
        result = result * 59 + ($province == null ? 43 : ((Object)$province).hashCode());
        String $merchantName = this.getMerchantName();
        result = result * 59 + ($merchantName == null ? 43 : $merchantName.hashCode());
        String $bankAccount = this.getBankAccount();
        result = result * 59 + ($bankAccount == null ? 43 : $bankAccount.hashCode());
        String $bankAccountName = this.getBankAccountName();
        result = result * 59 + ($bankAccountName == null ? 43 : $bankAccountName.hashCode());
        String $bank = this.getBank();
        result = result * 59 + ($bank == null ? 43 : $bank.hashCode());
        String $openBank = this.getOpenBank();
        result = result * 59 + ($openBank == null ? 43 : $openBank.hashCode());
        String $currency = this.getCurrency();
        result = result * 59 + ($currency == null ? 43 : $currency.hashCode());
        String $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        String $provinceName = this.getProvinceName();
        result = result * 59 + ($provinceName == null ? 43 : $provinceName.hashCode());
        String $jointLineNo = this.getJointLineNo();
        result = result * 59 + ($jointLineNo == null ? 43 : $jointLineNo.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $swiftCode = this.getSwiftCode();
        result = result * 59 + ($swiftCode == null ? 43 : $swiftCode.hashCode());
        Date $accountOpeningDate = this.getAccountOpeningDate();
        result = result * 59 + ($accountOpeningDate == null ? 43 : ((Object)$accountOpeningDate).hashCode());
        String $agentBankForElectronic = this.getAgentBankForElectronic();
        result = result * 59 + ($agentBankForElectronic == null ? 43 : $agentBankForElectronic.hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        return result;
    }

    public String toString() {
        return "AgentFinancialDTO(id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", merchantName=" + this.getMerchantName() + ", bankAccount=" + this.getBankAccount() + ", bankAccountName=" + this.getBankAccountName() + ", bank=" + this.getBank() + ", openBank=" + this.getOpenBank() + ", currency=" + this.getCurrency() + ", accountType=" + this.getAccountType() + ", isDefault=" + this.getIsDefault() + ", stopStatus=" + this.getStopStatus() + ", country=" + this.getCountry() + ", province=" + this.getProvince() + ", provinceName=" + this.getProvinceName() + ", jointLineNo=" + this.getJointLineNo() + ", remarks=" + this.getRemarks() + ", erpCode=" + this.getErpCode() + ", swiftCode=" + this.getSwiftCode() + ", accountOpeningDate=" + this.getAccountOpeningDate() + ", agentBankForElectronic=" + this.getAgentBankForElectronic() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ")";
    }
}

