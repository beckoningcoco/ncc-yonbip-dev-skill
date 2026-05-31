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
public class MerchantInvoiceDataDTO
implements Serializable {
    private Long id;
    private String bdBillingType;
    private String bdBillingType___code;
    private String title;
    private String taxNo;
    private String receievInvoiceMobile;
    private String receievInvoiceEmail;
    private String telephone;
    private MultiLangText address;
    private Date pubts;
    private String bankAccount;
    private String bankName;
    private String bankName___code;
    private String bdBillingType___scope;
    private Boolean isDefault;
    private Long merchantId;
    private String merchantId___code;
    private String name;
    private String name___code;
    private String remarks;
    private HashMap<String, Object> agentInvoiceCharacter;
    private Map<String, Object> customExtend;
    private UPCEntityStatus entityStatus;
    private List<String> needBlankFieldList;

    public Long getId() {
        return this.id;
    }

    public String getBdBillingType() {
        return this.bdBillingType;
    }

    public String getBdBillingType___code() {
        return this.bdBillingType___code;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTaxNo() {
        return this.taxNo;
    }

    public String getReceievInvoiceMobile() {
        return this.receievInvoiceMobile;
    }

    public String getReceievInvoiceEmail() {
        return this.receievInvoiceEmail;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public MultiLangText getAddress() {
        return this.address;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getBankName___code() {
        return this.bankName___code;
    }

    public String getBdBillingType___scope() {
        return this.bdBillingType___scope;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantId___code() {
        return this.merchantId___code;
    }

    public String getName() {
        return this.name;
    }

    public String getName___code() {
        return this.name___code;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public HashMap<String, Object> getAgentInvoiceCharacter() {
        return this.agentInvoiceCharacter;
    }

    public Map<String, Object> getCustomExtend() {
        return this.customExtend;
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

    public void setBdBillingType(String bdBillingType) {
        this.bdBillingType = bdBillingType;
    }

    public void setBdBillingType___code(String bdBillingType___code) {
        this.bdBillingType___code = bdBillingType___code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public void setReceievInvoiceMobile(String receievInvoiceMobile) {
        this.receievInvoiceMobile = receievInvoiceMobile;
    }

    public void setReceievInvoiceEmail(String receievInvoiceEmail) {
        this.receievInvoiceEmail = receievInvoiceEmail;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setAddress(MultiLangText address) {
        this.address = address;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankName___code(String bankName___code) {
        this.bankName___code = bankName___code;
    }

    public void setBdBillingType___scope(String bdBillingType___scope) {
        this.bdBillingType___scope = bdBillingType___scope;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantId___code(String merchantId___code) {
        this.merchantId___code = merchantId___code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName___code(String name___code) {
        this.name___code = name___code;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setAgentInvoiceCharacter(HashMap<String, Object> agentInvoiceCharacter) {
        this.agentInvoiceCharacter = agentInvoiceCharacter;
    }

    public void setCustomExtend(Map<String, Object> customExtend) {
        this.customExtend = customExtend;
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
        if (!(o instanceof MerchantInvoiceDataDTO)) {
            return false;
        }
        MerchantInvoiceDataDTO other = (MerchantInvoiceDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
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
        String this$bdBillingType = this.getBdBillingType();
        String other$bdBillingType = other.getBdBillingType();
        if (this$bdBillingType == null ? other$bdBillingType != null : !this$bdBillingType.equals(other$bdBillingType)) {
            return false;
        }
        String this$bdBillingType___code = this.getBdBillingType___code();
        String other$bdBillingType___code = other.getBdBillingType___code();
        if (this$bdBillingType___code == null ? other$bdBillingType___code != null : !this$bdBillingType___code.equals(other$bdBillingType___code)) {
            return false;
        }
        String this$title = this.getTitle();
        String other$title = other.getTitle();
        if (this$title == null ? other$title != null : !this$title.equals(other$title)) {
            return false;
        }
        String this$taxNo = this.getTaxNo();
        String other$taxNo = other.getTaxNo();
        if (this$taxNo == null ? other$taxNo != null : !this$taxNo.equals(other$taxNo)) {
            return false;
        }
        String this$receievInvoiceMobile = this.getReceievInvoiceMobile();
        String other$receievInvoiceMobile = other.getReceievInvoiceMobile();
        if (this$receievInvoiceMobile == null ? other$receievInvoiceMobile != null : !this$receievInvoiceMobile.equals(other$receievInvoiceMobile)) {
            return false;
        }
        String this$receievInvoiceEmail = this.getReceievInvoiceEmail();
        String other$receievInvoiceEmail = other.getReceievInvoiceEmail();
        if (this$receievInvoiceEmail == null ? other$receievInvoiceEmail != null : !this$receievInvoiceEmail.equals(other$receievInvoiceEmail)) {
            return false;
        }
        String this$telephone = this.getTelephone();
        String other$telephone = other.getTelephone();
        if (this$telephone == null ? other$telephone != null : !this$telephone.equals(other$telephone)) {
            return false;
        }
        MultiLangText this$address = this.getAddress();
        MultiLangText other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
            return false;
        }
        String this$bankAccount = this.getBankAccount();
        String other$bankAccount = other.getBankAccount();
        if (this$bankAccount == null ? other$bankAccount != null : !this$bankAccount.equals(other$bankAccount)) {
            return false;
        }
        String this$bankName = this.getBankName();
        String other$bankName = other.getBankName();
        if (this$bankName == null ? other$bankName != null : !this$bankName.equals(other$bankName)) {
            return false;
        }
        String this$bankName___code = this.getBankName___code();
        String other$bankName___code = other.getBankName___code();
        if (this$bankName___code == null ? other$bankName___code != null : !this$bankName___code.equals(other$bankName___code)) {
            return false;
        }
        String this$bdBillingType___scope = this.getBdBillingType___scope();
        String other$bdBillingType___scope = other.getBdBillingType___scope();
        if (this$bdBillingType___scope == null ? other$bdBillingType___scope != null : !this$bdBillingType___scope.equals(other$bdBillingType___scope)) {
            return false;
        }
        String this$merchantId___code = this.getMerchantId___code();
        String other$merchantId___code = other.getMerchantId___code();
        if (this$merchantId___code == null ? other$merchantId___code != null : !this$merchantId___code.equals(other$merchantId___code)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$name___code = this.getName___code();
        String other$name___code = other.getName___code();
        if (this$name___code == null ? other$name___code != null : !this$name___code.equals(other$name___code)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
            return false;
        }
        HashMap<String, Object> this$agentInvoiceCharacter = this.getAgentInvoiceCharacter();
        HashMap<String, Object> other$agentInvoiceCharacter = other.getAgentInvoiceCharacter();
        if (this$agentInvoiceCharacter == null ? other$agentInvoiceCharacter != null : !((Object)this$agentInvoiceCharacter).equals(other$agentInvoiceCharacter)) {
            return false;
        }
        Map<String, Object> this$customExtend = this.getCustomExtend();
        Map<String, Object> other$customExtend = other.getCustomExtend();
        if (this$customExtend == null ? other$customExtend != null : !((Object)this$customExtend).equals(other$customExtend)) {
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
        return other instanceof MerchantInvoiceDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        String $bdBillingType = this.getBdBillingType();
        result = result * 59 + ($bdBillingType == null ? 43 : $bdBillingType.hashCode());
        String $bdBillingType___code = this.getBdBillingType___code();
        result = result * 59 + ($bdBillingType___code == null ? 43 : $bdBillingType___code.hashCode());
        String $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        String $taxNo = this.getTaxNo();
        result = result * 59 + ($taxNo == null ? 43 : $taxNo.hashCode());
        String $receievInvoiceMobile = this.getReceievInvoiceMobile();
        result = result * 59 + ($receievInvoiceMobile == null ? 43 : $receievInvoiceMobile.hashCode());
        String $receievInvoiceEmail = this.getReceievInvoiceEmail();
        result = result * 59 + ($receievInvoiceEmail == null ? 43 : $receievInvoiceEmail.hashCode());
        String $telephone = this.getTelephone();
        result = result * 59 + ($telephone == null ? 43 : $telephone.hashCode());
        MultiLangText $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        String $bankAccount = this.getBankAccount();
        result = result * 59 + ($bankAccount == null ? 43 : $bankAccount.hashCode());
        String $bankName = this.getBankName();
        result = result * 59 + ($bankName == null ? 43 : $bankName.hashCode());
        String $bankName___code = this.getBankName___code();
        result = result * 59 + ($bankName___code == null ? 43 : $bankName___code.hashCode());
        String $bdBillingType___scope = this.getBdBillingType___scope();
        result = result * 59 + ($bdBillingType___scope == null ? 43 : $bdBillingType___scope.hashCode());
        String $merchantId___code = this.getMerchantId___code();
        result = result * 59 + ($merchantId___code == null ? 43 : $merchantId___code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $name___code = this.getName___code();
        result = result * 59 + ($name___code == null ? 43 : $name___code.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        HashMap<String, Object> $agentInvoiceCharacter = this.getAgentInvoiceCharacter();
        result = result * 59 + ($agentInvoiceCharacter == null ? 43 : ((Object)$agentInvoiceCharacter).hashCode());
        Map<String, Object> $customExtend = this.getCustomExtend();
        result = result * 59 + ($customExtend == null ? 43 : ((Object)$customExtend).hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        List<String> $needBlankFieldList = this.getNeedBlankFieldList();
        result = result * 59 + ($needBlankFieldList == null ? 43 : ((Object)$needBlankFieldList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantInvoiceDataDTO(id=" + this.getId() + ", bdBillingType=" + this.getBdBillingType() + ", bdBillingType___code=" + this.getBdBillingType___code() + ", title=" + this.getTitle() + ", taxNo=" + this.getTaxNo() + ", receievInvoiceMobile=" + this.getReceievInvoiceMobile() + ", receievInvoiceEmail=" + this.getReceievInvoiceEmail() + ", telephone=" + this.getTelephone() + ", address=" + this.getAddress() + ", pubts=" + this.getPubts() + ", bankAccount=" + this.getBankAccount() + ", bankName=" + this.getBankName() + ", bankName___code=" + this.getBankName___code() + ", bdBillingType___scope=" + this.getBdBillingType___scope() + ", isDefault=" + this.getIsDefault() + ", merchantId=" + this.getMerchantId() + ", merchantId___code=" + this.getMerchantId___code() + ", name=" + this.getName() + ", name___code=" + this.getName___code() + ", remarks=" + this.getRemarks() + ", agentInvoiceCharacter=" + this.getAgentInvoiceCharacter() + ", customExtend=" + this.getCustomExtend() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ", needBlankFieldList=" + this.getNeedBlankFieldList() + ")";
    }
}

