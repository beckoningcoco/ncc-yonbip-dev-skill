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
public class AgentFinancialQryDTO
implements Serializable {
    private String[] fields;
    private Long id;
    private List<Long> ids;
    private Boolean ifDefault;
    private Long merchantId;
    private String currency;
    private String bankAccount;
    private List<String> bankAccountList;
    private String fuzzyBankAccount;
    private String openBank;
    private List<String> openBankList;
    private String fuzzyOpenBank;
    private String country;
    private Long province;
    private String jointLineNo;
    private String remarks;
    private String swiftCode;
    private String bankAccountName;
    private Boolean stopStatus;
    private String agentBankForElectronic;

    public String[] getFields() {
        return this.fields;
    }

    public Long getId() {
        return this.id;
    }

    public List<Long> getIds() {
        return this.ids;
    }

    public Boolean getIfDefault() {
        return this.ifDefault;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }

    public List<String> getBankAccountList() {
        return this.bankAccountList;
    }

    public String getFuzzyBankAccount() {
        return this.fuzzyBankAccount;
    }

    public String getOpenBank() {
        return this.openBank;
    }

    public List<String> getOpenBankList() {
        return this.openBankList;
    }

    public String getFuzzyOpenBank() {
        return this.fuzzyOpenBank;
    }

    public String getCountry() {
        return this.country;
    }

    public Long getProvince() {
        return this.province;
    }

    public String getJointLineNo() {
        return this.jointLineNo;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getSwiftCode() {
        return this.swiftCode;
    }

    public String getBankAccountName() {
        return this.bankAccountName;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public String getAgentBankForElectronic() {
        return this.agentBankForElectronic;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public void setIfDefault(Boolean ifDefault) {
        this.ifDefault = ifDefault;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankAccountList(List<String> bankAccountList) {
        this.bankAccountList = bankAccountList;
    }

    public void setFuzzyBankAccount(String fuzzyBankAccount) {
        this.fuzzyBankAccount = fuzzyBankAccount;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public void setOpenBankList(List<String> openBankList) {
        this.openBankList = openBankList;
    }

    public void setFuzzyOpenBank(String fuzzyOpenBank) {
        this.fuzzyOpenBank = fuzzyOpenBank;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setProvince(Long province) {
        this.province = province;
    }

    public void setJointLineNo(String jointLineNo) {
        this.jointLineNo = jointLineNo;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setAgentBankForElectronic(String agentBankForElectronic) {
        this.agentBankForElectronic = agentBankForElectronic;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentFinancialQryDTO)) {
            return false;
        }
        AgentFinancialQryDTO other = (AgentFinancialQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Boolean this$ifDefault = this.getIfDefault();
        Boolean other$ifDefault = other.getIfDefault();
        if (this$ifDefault == null ? other$ifDefault != null : !((Object)this$ifDefault).equals(other$ifDefault)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Long this$province = this.getProvince();
        Long other$province = other.getProvince();
        if (this$province == null ? other$province != null : !((Object)this$province).equals(other$province)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        List<Long> this$ids = this.getIds();
        List<Long> other$ids = other.getIds();
        if (this$ids == null ? other$ids != null : !((Object)this$ids).equals(other$ids)) {
            return false;
        }
        String this$currency = this.getCurrency();
        String other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) {
            return false;
        }
        String this$bankAccount = this.getBankAccount();
        String other$bankAccount = other.getBankAccount();
        if (this$bankAccount == null ? other$bankAccount != null : !this$bankAccount.equals(other$bankAccount)) {
            return false;
        }
        List<String> this$bankAccountList = this.getBankAccountList();
        List<String> other$bankAccountList = other.getBankAccountList();
        if (this$bankAccountList == null ? other$bankAccountList != null : !((Object)this$bankAccountList).equals(other$bankAccountList)) {
            return false;
        }
        String this$fuzzyBankAccount = this.getFuzzyBankAccount();
        String other$fuzzyBankAccount = other.getFuzzyBankAccount();
        if (this$fuzzyBankAccount == null ? other$fuzzyBankAccount != null : !this$fuzzyBankAccount.equals(other$fuzzyBankAccount)) {
            return false;
        }
        String this$openBank = this.getOpenBank();
        String other$openBank = other.getOpenBank();
        if (this$openBank == null ? other$openBank != null : !this$openBank.equals(other$openBank)) {
            return false;
        }
        List<String> this$openBankList = this.getOpenBankList();
        List<String> other$openBankList = other.getOpenBankList();
        if (this$openBankList == null ? other$openBankList != null : !((Object)this$openBankList).equals(other$openBankList)) {
            return false;
        }
        String this$fuzzyOpenBank = this.getFuzzyOpenBank();
        String other$fuzzyOpenBank = other.getFuzzyOpenBank();
        if (this$fuzzyOpenBank == null ? other$fuzzyOpenBank != null : !this$fuzzyOpenBank.equals(other$fuzzyOpenBank)) {
            return false;
        }
        String this$country = this.getCountry();
        String other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) {
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
        String this$swiftCode = this.getSwiftCode();
        String other$swiftCode = other.getSwiftCode();
        if (this$swiftCode == null ? other$swiftCode != null : !this$swiftCode.equals(other$swiftCode)) {
            return false;
        }
        String this$bankAccountName = this.getBankAccountName();
        String other$bankAccountName = other.getBankAccountName();
        if (this$bankAccountName == null ? other$bankAccountName != null : !this$bankAccountName.equals(other$bankAccountName)) {
            return false;
        }
        String this$agentBankForElectronic = this.getAgentBankForElectronic();
        String other$agentBankForElectronic = other.getAgentBankForElectronic();
        return !(this$agentBankForElectronic == null ? other$agentBankForElectronic != null : !this$agentBankForElectronic.equals(other$agentBankForElectronic));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AgentFinancialQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $ifDefault = this.getIfDefault();
        result = result * 59 + ($ifDefault == null ? 43 : ((Object)$ifDefault).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $province = this.getProvince();
        result = result * 59 + ($province == null ? 43 : ((Object)$province).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        List<Long> $ids = this.getIds();
        result = result * 59 + ($ids == null ? 43 : ((Object)$ids).hashCode());
        String $currency = this.getCurrency();
        result = result * 59 + ($currency == null ? 43 : $currency.hashCode());
        String $bankAccount = this.getBankAccount();
        result = result * 59 + ($bankAccount == null ? 43 : $bankAccount.hashCode());
        List<String> $bankAccountList = this.getBankAccountList();
        result = result * 59 + ($bankAccountList == null ? 43 : ((Object)$bankAccountList).hashCode());
        String $fuzzyBankAccount = this.getFuzzyBankAccount();
        result = result * 59 + ($fuzzyBankAccount == null ? 43 : $fuzzyBankAccount.hashCode());
        String $openBank = this.getOpenBank();
        result = result * 59 + ($openBank == null ? 43 : $openBank.hashCode());
        List<String> $openBankList = this.getOpenBankList();
        result = result * 59 + ($openBankList == null ? 43 : ((Object)$openBankList).hashCode());
        String $fuzzyOpenBank = this.getFuzzyOpenBank();
        result = result * 59 + ($fuzzyOpenBank == null ? 43 : $fuzzyOpenBank.hashCode());
        String $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        String $jointLineNo = this.getJointLineNo();
        result = result * 59 + ($jointLineNo == null ? 43 : $jointLineNo.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        String $swiftCode = this.getSwiftCode();
        result = result * 59 + ($swiftCode == null ? 43 : $swiftCode.hashCode());
        String $bankAccountName = this.getBankAccountName();
        result = result * 59 + ($bankAccountName == null ? 43 : $bankAccountName.hashCode());
        String $agentBankForElectronic = this.getAgentBankForElectronic();
        result = result * 59 + ($agentBankForElectronic == null ? 43 : $agentBankForElectronic.hashCode());
        return result;
    }

    public String toString() {
        return "AgentFinancialQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", id=" + this.getId() + ", ids=" + this.getIds() + ", ifDefault=" + this.getIfDefault() + ", merchantId=" + this.getMerchantId() + ", currency=" + this.getCurrency() + ", bankAccount=" + this.getBankAccount() + ", bankAccountList=" + this.getBankAccountList() + ", fuzzyBankAccount=" + this.getFuzzyBankAccount() + ", openBank=" + this.getOpenBank() + ", openBankList=" + this.getOpenBankList() + ", fuzzyOpenBank=" + this.getFuzzyOpenBank() + ", country=" + this.getCountry() + ", province=" + this.getProvince() + ", jointLineNo=" + this.getJointLineNo() + ", remarks=" + this.getRemarks() + ", swiftCode=" + this.getSwiftCode() + ", bankAccountName=" + this.getBankAccountName() + ", stopStatus=" + this.getStopStatus() + ", agentBankForElectronic=" + this.getAgentBankForElectronic() + ")";
    }
}

