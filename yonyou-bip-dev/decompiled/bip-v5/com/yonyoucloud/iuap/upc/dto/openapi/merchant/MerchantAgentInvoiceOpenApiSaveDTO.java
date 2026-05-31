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
public class MerchantAgentInvoiceOpenApiSaveDTO
implements Serializable {
    private Long id;
    public String bdBillingTypeId;
    public String bdBillingTypeName;
    public String title;
    public String taxNo;
    public String receievInvoiceMobile;
    public String receievInvoiceEmail;
    public String telephone;
    public MultilingualVO address;
    public String bankId;
    public String bankName;
    public String bankDotId;
    public String bankDotName;
    public String bankAccount;
    public String remarks;
    public Boolean isDefault;
    private HashMap<String, Object> agentInvoiceCharacter;
    private String entityStatus;
    private String sourceUnique;

    public Long getId() {
        return this.id;
    }

    public String getBdBillingTypeId() {
        return this.bdBillingTypeId;
    }

    public String getBdBillingTypeName() {
        return this.bdBillingTypeName;
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

    public MultilingualVO getAddress() {
        return this.address;
    }

    public String getBankId() {
        return this.bankId;
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getBankDotId() {
        return this.bankDotId;
    }

    public String getBankDotName() {
        return this.bankDotName;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public HashMap<String, Object> getAgentInvoiceCharacter() {
        return this.agentInvoiceCharacter;
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

    public void setBdBillingTypeId(String bdBillingTypeId) {
        this.bdBillingTypeId = bdBillingTypeId;
    }

    public void setBdBillingTypeName(String bdBillingTypeName) {
        this.bdBillingTypeName = bdBillingTypeName;
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

    public void setAddress(MultilingualVO address) {
        this.address = address;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankDotId(String bankDotId) {
        this.bankDotId = bankDotId;
    }

    public void setBankDotName(String bankDotName) {
        this.bankDotName = bankDotName;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setAgentInvoiceCharacter(HashMap<String, Object> agentInvoiceCharacter) {
        this.agentInvoiceCharacter = agentInvoiceCharacter;
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
        if (!(o instanceof MerchantAgentInvoiceOpenApiSaveDTO)) {
            return false;
        }
        MerchantAgentInvoiceOpenApiSaveDTO other = (MerchantAgentInvoiceOpenApiSaveDTO)o;
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
        String this$bdBillingTypeId = this.getBdBillingTypeId();
        String other$bdBillingTypeId = other.getBdBillingTypeId();
        if (this$bdBillingTypeId == null ? other$bdBillingTypeId != null : !this$bdBillingTypeId.equals(other$bdBillingTypeId)) {
            return false;
        }
        String this$bdBillingTypeName = this.getBdBillingTypeName();
        String other$bdBillingTypeName = other.getBdBillingTypeName();
        if (this$bdBillingTypeName == null ? other$bdBillingTypeName != null : !this$bdBillingTypeName.equals(other$bdBillingTypeName)) {
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
        MultilingualVO this$address = this.getAddress();
        MultilingualVO other$address = other.getAddress();
        if (this$address == null ? other$address != null : !((Object)this$address).equals(other$address)) {
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
        String this$bankDotId = this.getBankDotId();
        String other$bankDotId = other.getBankDotId();
        if (this$bankDotId == null ? other$bankDotId != null : !this$bankDotId.equals(other$bankDotId)) {
            return false;
        }
        String this$bankDotName = this.getBankDotName();
        String other$bankDotName = other.getBankDotName();
        if (this$bankDotName == null ? other$bankDotName != null : !this$bankDotName.equals(other$bankDotName)) {
            return false;
        }
        String this$bankAccount = this.getBankAccount();
        String other$bankAccount = other.getBankAccount();
        if (this$bankAccount == null ? other$bankAccount != null : !this$bankAccount.equals(other$bankAccount)) {
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
        return other instanceof MerchantAgentInvoiceOpenApiSaveDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        String $bdBillingTypeId = this.getBdBillingTypeId();
        result = result * 59 + ($bdBillingTypeId == null ? 43 : $bdBillingTypeId.hashCode());
        String $bdBillingTypeName = this.getBdBillingTypeName();
        result = result * 59 + ($bdBillingTypeName == null ? 43 : $bdBillingTypeName.hashCode());
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
        MultilingualVO $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        String $bankId = this.getBankId();
        result = result * 59 + ($bankId == null ? 43 : $bankId.hashCode());
        String $bankName = this.getBankName();
        result = result * 59 + ($bankName == null ? 43 : $bankName.hashCode());
        String $bankDotId = this.getBankDotId();
        result = result * 59 + ($bankDotId == null ? 43 : $bankDotId.hashCode());
        String $bankDotName = this.getBankDotName();
        result = result * 59 + ($bankDotName == null ? 43 : $bankDotName.hashCode());
        String $bankAccount = this.getBankAccount();
        result = result * 59 + ($bankAccount == null ? 43 : $bankAccount.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        HashMap<String, Object> $agentInvoiceCharacter = this.getAgentInvoiceCharacter();
        result = result * 59 + ($agentInvoiceCharacter == null ? 43 : ((Object)$agentInvoiceCharacter).hashCode());
        String $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : $entityStatus.hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantAgentInvoiceOpenApiSaveDTO(id=" + this.getId() + ", bdBillingTypeId=" + this.getBdBillingTypeId() + ", bdBillingTypeName=" + this.getBdBillingTypeName() + ", title=" + this.getTitle() + ", taxNo=" + this.getTaxNo() + ", receievInvoiceMobile=" + this.getReceievInvoiceMobile() + ", receievInvoiceEmail=" + this.getReceievInvoiceEmail() + ", telephone=" + this.getTelephone() + ", address=" + this.getAddress() + ", bankId=" + this.getBankId() + ", bankName=" + this.getBankName() + ", bankDotId=" + this.getBankDotId() + ", bankDotName=" + this.getBankDotName() + ", bankAccount=" + this.getBankAccount() + ", remarks=" + this.getRemarks() + ", isDefault=" + this.getIsDefault() + ", agentInvoiceCharacter=" + this.getAgentInvoiceCharacter() + ", entityStatus=" + this.getEntityStatus() + ", sourceUnique=" + this.getSourceUnique() + ")";
    }
}

