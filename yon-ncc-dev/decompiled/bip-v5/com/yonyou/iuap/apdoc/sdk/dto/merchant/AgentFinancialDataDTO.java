/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyou.iuap.apdoc.sdk.dto.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;
import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class AgentFinancialDataDTO
implements Serializable {
    private Long id;
    private String erpCode;
    private Date stoptime;
    private Boolean stopstatus;
    private Date pubts;
    private MultiLangText accountOpeningAddress;
    private Date accountOpeningDate;
    private Integer accountType;
    private String agentBankForElectronic;
    private String agentBankForElectronic___code;
    private HashMap<String, Object> agentFinancialCharacter;
    private Map<String, Object> customExtend;
    private String bank;
    private String bank___code;
    private String bankAccount;
    private MultiLangText bankAccountName;
    private String country;
    private String country___code;
    private String currency;
    private String currency___code;
    private Boolean isDefault;
    private String jointLineNo;
    private Long merchantId;
    private String merchantId___code;
    private String openBank;
    private String openBank___code;
    private String orgFinBankAcct;
    private String orgFinBankAcct___code;
    private String province;
    private String province___code;
    private String remarks;
    private String swiftCode;
    private UPCEntityStatus entityStatus;
    private List<String> needBlankFieldList;

    public Long getId() {
        return this.id;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public Date getStoptime() {
        return this.stoptime;
    }

    public Boolean getStopstatus() {
        return this.stopstatus;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public MultiLangText getAccountOpeningAddress() {
        return this.accountOpeningAddress;
    }

    public Date getAccountOpeningDate() {
        return this.accountOpeningDate;
    }

    public Integer getAccountType() {
        return this.accountType;
    }

    public String getAgentBankForElectronic() {
        return this.agentBankForElectronic;
    }

    public String getAgentBankForElectronic___code() {
        return this.agentBankForElectronic___code;
    }

    public HashMap<String, Object> getAgentFinancialCharacter() {
        return this.agentFinancialCharacter;
    }

    public Map<String, Object> getCustomExtend() {
        return this.customExtend;
    }

    public String getBank() {
        return this.bank;
    }

    public String getBank___code() {
        return this.bank___code;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }

    public MultiLangText getBankAccountName() {
        return this.bankAccountName;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCountry___code() {
        return this.country___code;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getCurrency___code() {
        return this.currency___code;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public String getJointLineNo() {
        return this.jointLineNo;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantId___code() {
        return this.merchantId___code;
    }

    public String getOpenBank() {
        return this.openBank;
    }

    public String getOpenBank___code() {
        return this.openBank___code;
    }

    public String getOrgFinBankAcct() {
        return this.orgFinBankAcct;
    }

    public String getOrgFinBankAcct___code() {
        return this.orgFinBankAcct___code;
    }

    public String getProvince() {
        return this.province;
    }

    public String getProvince___code() {
        return this.province___code;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getSwiftCode() {
        return this.swiftCode;
    }

    public UPCEntityStatus getEntityStatus() {
        return this.entityStatus;
    }

    public List<String> getNeedBlankFieldList() {
        return this.needBlankFieldList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setStoptime(Date stoptime) {
        this.stoptime = stoptime;
    }

    public void setStopstatus(Boolean stopstatus) {
        this.stopstatus = stopstatus;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setAccountOpeningAddress(MultiLangText accountOpeningAddress) {
        this.accountOpeningAddress = accountOpeningAddress;
    }

    public void setAccountOpeningDate(Date accountOpeningDate) {
        this.accountOpeningDate = accountOpeningDate;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public void setAgentBankForElectronic(String agentBankForElectronic) {
        this.agentBankForElectronic = agentBankForElectronic;
    }

    public void setAgentBankForElectronic___code(String agentBankForElectronic___code) {
        this.agentBankForElectronic___code = agentBankForElectronic___code;
    }

    public void setAgentFinancialCharacter(HashMap<String, Object> agentFinancialCharacter) {
        this.agentFinancialCharacter = agentFinancialCharacter;
    }

    public void setCustomExtend(Map<String, Object> customExtend) {
        this.customExtend = customExtend;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public void setBank___code(String bank___code) {
        this.bank___code = bank___code;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankAccountName(MultiLangText bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCountry___code(String country___code) {
        this.country___code = country___code;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCurrency___code(String currency___code) {
        this.currency___code = currency___code;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setJointLineNo(String jointLineNo) {
        this.jointLineNo = jointLineNo;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantId___code(String merchantId___code) {
        this.merchantId___code = merchantId___code;
    }

    public void setOpenBank(String openBank) {
        this.openBank = openBank;
    }

    public void setOpenBank___code(String openBank___code) {
        this.openBank___code = openBank___code;
    }

    public void setOrgFinBankAcct(String orgFinBankAcct) {
        this.orgFinBankAcct = orgFinBankAcct;
    }

    public void setOrgFinBankAcct___code(String orgFinBankAcct___code) {
        this.orgFinBankAcct___code = orgFinBankAcct___code;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setProvince___code(String province___code) {
        this.province___code = province___code;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setSwiftCode(String swiftCode) {
        this.swiftCode = swiftCode;
    }

    public void setEntityStatus(UPCEntityStatus entityStatus) {
        this.entityStatus = entityStatus;
    }

    public void setNeedBlankFieldList(List<String> needBlankFieldList) {
        this.needBlankFieldList = needBlankFieldList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof AgentFinancialDataDTO)) {
            return false;
        }
        AgentFinancialDataDTO other = (AgentFinancialDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Boolean this$stopstatus = this.getStopstatus();
        Boolean other$stopstatus = other.getStopstatus();
        if (this$stopstatus == null ? other$stopstatus != null : !((Object)this$stopstatus).equals(other$stopstatus)) {
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
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        Date this$stoptime = this.getStoptime();
        Date other$stoptime = other.getStoptime();
        if (this$stoptime == null ? other$stoptime != null : !((Object)this$stoptime).equals(other$stoptime)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
            return false;
        }
        MultiLangText this$accountOpeningAddress = this.getAccountOpeningAddress();
        MultiLangText other$accountOpeningAddress = other.getAccountOpeningAddress();
        if (this$accountOpeningAddress == null ? other$accountOpeningAddress != null : !this$accountOpeningAddress.equals(other$accountOpeningAddress)) {
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
        String this$agentBankForElectronic___code = this.getAgentBankForElectronic___code();
        String other$agentBankForElectronic___code = other.getAgentBankForElectronic___code();
        if (this$agentBankForElectronic___code == null ? other$agentBankForElectronic___code != null : !this$agentBankForElectronic___code.equals(other$agentBankForElectronic___code)) {
            return false;
        }
        HashMap<String, Object> this$agentFinancialCharacter = this.getAgentFinancialCharacter();
        HashMap<String, Object> other$agentFinancialCharacter = other.getAgentFinancialCharacter();
        if (this$agentFinancialCharacter == null ? other$agentFinancialCharacter != null : !((Object)this$agentFinancialCharacter).equals(other$agentFinancialCharacter)) {
            return false;
        }
        Map<String, Object> this$customExtend = this.getCustomExtend();
        Map<String, Object> other$customExtend = other.getCustomExtend();
        if (this$customExtend == null ? other$customExtend != null : !((Object)this$customExtend).equals(other$customExtend)) {
            return false;
        }
        String this$bank = this.getBank();
        String other$bank = other.getBank();
        if (this$bank == null ? other$bank != null : !this$bank.equals(other$bank)) {
            return false;
        }
        String this$bank___code = this.getBank___code();
        String other$bank___code = other.getBank___code();
        if (this$bank___code == null ? other$bank___code != null : !this$bank___code.equals(other$bank___code)) {
            return false;
        }
        String this$bankAccount = this.getBankAccount();
        String other$bankAccount = other.getBankAccount();
        if (this$bankAccount == null ? other$bankAccount != null : !this$bankAccount.equals(other$bankAccount)) {
            return false;
        }
        MultiLangText this$bankAccountName = this.getBankAccountName();
        MultiLangText other$bankAccountName = other.getBankAccountName();
        if (this$bankAccountName == null ? other$bankAccountName != null : !this$bankAccountName.equals(other$bankAccountName)) {
            return false;
        }
        String this$country = this.getCountry();
        String other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) {
            return false;
        }
        String this$country___code = this.getCountry___code();
        String other$country___code = other.getCountry___code();
        if (this$country___code == null ? other$country___code != null : !this$country___code.equals(other$country___code)) {
            return false;
        }
        String this$currency = this.getCurrency();
        String other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) {
            return false;
        }
        String this$currency___code = this.getCurrency___code();
        String other$currency___code = other.getCurrency___code();
        if (this$currency___code == null ? other$currency___code != null : !this$currency___code.equals(other$currency___code)) {
            return false;
        }
        String this$jointLineNo = this.getJointLineNo();
        String other$jointLineNo = other.getJointLineNo();
        if (this$jointLineNo == null ? other$jointLineNo != null : !this$jointLineNo.equals(other$jointLineNo)) {
            return false;
        }
        String this$merchantId___code = this.getMerchantId___code();
        String other$merchantId___code = other.getMerchantId___code();
        if (this$merchantId___code == null ? other$merchantId___code != null : !this$merchantId___code.equals(other$merchantId___code)) {
            return false;
        }
        String this$openBank = this.getOpenBank();
        String other$openBank = other.getOpenBank();
        if (this$openBank == null ? other$openBank != null : !this$openBank.equals(other$openBank)) {
            return false;
        }
        String this$openBank___code = this.getOpenBank___code();
        String other$openBank___code = other.getOpenBank___code();
        if (this$openBank___code == null ? other$openBank___code != null : !this$openBank___code.equals(other$openBank___code)) {
            return false;
        }
        String this$orgFinBankAcct = this.getOrgFinBankAcct();
        String other$orgFinBankAcct = other.getOrgFinBankAcct();
        if (this$orgFinBankAcct == null ? other$orgFinBankAcct != null : !this$orgFinBankAcct.equals(other$orgFinBankAcct)) {
            return false;
        }
        String this$orgFinBankAcct___code = this.getOrgFinBankAcct___code();
        String other$orgFinBankAcct___code = other.getOrgFinBankAcct___code();
        if (this$orgFinBankAcct___code == null ? other$orgFinBankAcct___code != null : !this$orgFinBankAcct___code.equals(other$orgFinBankAcct___code)) {
            return false;
        }
        String this$province = this.getProvince();
        String other$province = other.getProvince();
        if (this$province == null ? other$province != null : !this$province.equals(other$province)) {
            return false;
        }
        String this$province___code = this.getProvince___code();
        String other$province___code = other.getProvince___code();
        if (this$province___code == null ? other$province___code != null : !this$province___code.equals(other$province___code)) {
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
        UPCEntityStatus this$entityStatus = this.getEntityStatus();
        UPCEntityStatus other$entityStatus = other.getEntityStatus();
        if (this$entityStatus == null ? other$entityStatus != null : !((Object)((Object)this$entityStatus)).equals((Object)other$entityStatus)) {
            return false;
        }
        List<String> this$needBlankFieldList = this.getNeedBlankFieldList();
        List<String> other$needBlankFieldList = other.getNeedBlankFieldList();
        return !(this$needBlankFieldList == null ? other$needBlankFieldList != null : !((Object)this$needBlankFieldList).equals(other$needBlankFieldList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof AgentFinancialDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $stopstatus = this.getStopstatus();
        result = result * 59 + ($stopstatus == null ? 43 : ((Object)$stopstatus).hashCode());
        Integer $accountType = this.getAccountType();
        result = result * 59 + ($accountType == null ? 43 : ((Object)$accountType).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        Date $stoptime = this.getStoptime();
        result = result * 59 + ($stoptime == null ? 43 : ((Object)$stoptime).hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        MultiLangText $accountOpeningAddress = this.getAccountOpeningAddress();
        result = result * 59 + ($accountOpeningAddress == null ? 43 : $accountOpeningAddress.hashCode());
        Date $accountOpeningDate = this.getAccountOpeningDate();
        result = result * 59 + ($accountOpeningDate == null ? 43 : ((Object)$accountOpeningDate).hashCode());
        String $agentBankForElectronic = this.getAgentBankForElectronic();
        result = result * 59 + ($agentBankForElectronic == null ? 43 : $agentBankForElectronic.hashCode());
        String $agentBankForElectronic___code = this.getAgentBankForElectronic___code();
        result = result * 59 + ($agentBankForElectronic___code == null ? 43 : $agentBankForElectronic___code.hashCode());
        HashMap<String, Object> $agentFinancialCharacter = this.getAgentFinancialCharacter();
        result = result * 59 + ($agentFinancialCharacter == null ? 43 : ((Object)$agentFinancialCharacter).hashCode());
        Map<String, Object> $customExtend = this.getCustomExtend();
        result = result * 59 + ($customExtend == null ? 43 : ((Object)$customExtend).hashCode());
        String $bank = this.getBank();
        result = result * 59 + ($bank == null ? 43 : $bank.hashCode());
        String $bank___code = this.getBank___code();
        result = result * 59 + ($bank___code == null ? 43 : $bank___code.hashCode());
        String $bankAccount = this.getBankAccount();
        result = result * 59 + ($bankAccount == null ? 43 : $bankAccount.hashCode());
        MultiLangText $bankAccountName = this.getBankAccountName();
        result = result * 59 + ($bankAccountName == null ? 43 : $bankAccountName.hashCode());
        String $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        String $country___code = this.getCountry___code();
        result = result * 59 + ($country___code == null ? 43 : $country___code.hashCode());
        String $currency = this.getCurrency();
        result = result * 59 + ($currency == null ? 43 : $currency.hashCode());
        String $currency___code = this.getCurrency___code();
        result = result * 59 + ($currency___code == null ? 43 : $currency___code.hashCode());
        String $jointLineNo = this.getJointLineNo();
        result = result * 59 + ($jointLineNo == null ? 43 : $jointLineNo.hashCode());
        String $merchantId___code = this.getMerchantId___code();
        result = result * 59 + ($merchantId___code == null ? 43 : $merchantId___code.hashCode());
        String $openBank = this.getOpenBank();
        result = result * 59 + ($openBank == null ? 43 : $openBank.hashCode());
        String $openBank___code = this.getOpenBank___code();
        result = result * 59 + ($openBank___code == null ? 43 : $openBank___code.hashCode());
        String $orgFinBankAcct = this.getOrgFinBankAcct();
        result = result * 59 + ($orgFinBankAcct == null ? 43 : $orgFinBankAcct.hashCode());
        String $orgFinBankAcct___code = this.getOrgFinBankAcct___code();
        result = result * 59 + ($orgFinBankAcct___code == null ? 43 : $orgFinBankAcct___code.hashCode());
        String $province = this.getProvince();
        result = result * 59 + ($province == null ? 43 : $province.hashCode());
        String $province___code = this.getProvince___code();
        result = result * 59 + ($province___code == null ? 43 : $province___code.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        String $swiftCode = this.getSwiftCode();
        result = result * 59 + ($swiftCode == null ? 43 : $swiftCode.hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        List<String> $needBlankFieldList = this.getNeedBlankFieldList();
        result = result * 59 + ($needBlankFieldList == null ? 43 : ((Object)$needBlankFieldList).hashCode());
        return result;
    }

    public String toString() {
        return "AgentFinancialDataDTO(id=" + this.getId() + ", erpCode=" + this.getErpCode() + ", stoptime=" + this.getStoptime() + ", stopstatus=" + this.getStopstatus() + ", pubts=" + this.getPubts() + ", accountOpeningAddress=" + this.getAccountOpeningAddress() + ", accountOpeningDate=" + this.getAccountOpeningDate() + ", accountType=" + this.getAccountType() + ", agentBankForElectronic=" + this.getAgentBankForElectronic() + ", agentBankForElectronic___code=" + this.getAgentBankForElectronic___code() + ", agentFinancialCharacter=" + this.getAgentFinancialCharacter() + ", customExtend=" + this.getCustomExtend() + ", bank=" + this.getBank() + ", bank___code=" + this.getBank___code() + ", bankAccount=" + this.getBankAccount() + ", bankAccountName=" + this.getBankAccountName() + ", country=" + this.getCountry() + ", country___code=" + this.getCountry___code() + ", currency=" + this.getCurrency() + ", currency___code=" + this.getCurrency___code() + ", isDefault=" + this.getIsDefault() + ", jointLineNo=" + this.getJointLineNo() + ", merchantId=" + this.getMerchantId() + ", merchantId___code=" + this.getMerchantId___code() + ", openBank=" + this.getOpenBank() + ", openBank___code=" + this.getOpenBank___code() + ", orgFinBankAcct=" + this.getOrgFinBankAcct() + ", orgFinBankAcct___code=" + this.getOrgFinBankAcct___code() + ", province=" + this.getProvince() + ", province___code=" + this.getProvince___code() + ", remarks=" + this.getRemarks() + ", swiftCode=" + this.getSwiftCode() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ", needBlankFieldList=" + this.getNeedBlankFieldList() + ")";
    }
}

