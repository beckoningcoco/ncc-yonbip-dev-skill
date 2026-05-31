/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantInvoiceDTO
implements Serializable {
    private Long id;
    private Long merchantId;
    private Integer billingType;
    private String bdBillingType;
    private String bdBillingType___name;
    private String bdBillingType___code;
    private String bdBillingType___scop;
    private String title;
    private String taxNo;
    private String telephone;
    @Deprecated
    private String name;
    private String bankTypeId;
    private String bankTypeId___code;
    private MultiLangText bankTypeId___name;
    private String bankName;
    private String bankName___code;
    private MultiLangText bankName___name;
    private String bankAccount;
    private String address;
    @Deprecated
    private Boolean defaultInvoice;
    private Boolean isDefault;
    private String remarks;
    private String receievInvoiceMobile;
    private String receievInvoiceEmail;
    private UPCEntityStatus entityStatus = UPCEntityStatus.Insert;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public Integer getBillingType() {
        return this.billingType;
    }

    public String getBdBillingType() {
        return this.bdBillingType;
    }

    public String getBdBillingType___name() {
        return this.bdBillingType___name;
    }

    public String getBdBillingType___code() {
        return this.bdBillingType___code;
    }

    public String getBdBillingType___scop() {
        return this.bdBillingType___scop;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTaxNo() {
        return this.taxNo;
    }

    public String getTelephone() {
        return this.telephone;
    }

    @Deprecated
    public String getName() {
        return this.name;
    }

    public String getBankTypeId() {
        return this.bankTypeId;
    }

    public String getBankTypeId___code() {
        return this.bankTypeId___code;
    }

    public MultiLangText getBankTypeId___name() {
        return this.bankTypeId___name;
    }

    public String getBankName() {
        return this.bankName;
    }

    public String getBankName___code() {
        return this.bankName___code;
    }

    public MultiLangText getBankName___name() {
        return this.bankName___name;
    }

    public String getBankAccount() {
        return this.bankAccount;
    }

    public String getAddress() {
        return this.address;
    }

    @Deprecated
    public Boolean getDefaultInvoice() {
        return this.defaultInvoice;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public String getRemarks() {
        return this.remarks;
    }

    public String getReceievInvoiceMobile() {
        return this.receievInvoiceMobile;
    }

    public String getReceievInvoiceEmail() {
        return this.receievInvoiceEmail;
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

    public void setBillingType(Integer billingType) {
        this.billingType = billingType;
    }

    public void setBdBillingType(String bdBillingType) {
        this.bdBillingType = bdBillingType;
    }

    public void setBdBillingType___name(String bdBillingType___name) {
        this.bdBillingType___name = bdBillingType___name;
    }

    public void setBdBillingType___code(String bdBillingType___code) {
        this.bdBillingType___code = bdBillingType___code;
    }

    public void setBdBillingType___scop(String bdBillingType___scop) {
        this.bdBillingType___scop = bdBillingType___scop;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTaxNo(String taxNo) {
        this.taxNo = taxNo;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Deprecated
    public void setName(String name) {
        this.name = name;
    }

    public void setBankTypeId(String bankTypeId) {
        this.bankTypeId = bankTypeId;
    }

    public void setBankTypeId___code(String bankTypeId___code) {
        this.bankTypeId___code = bankTypeId___code;
    }

    public void setBankTypeId___name(MultiLangText bankTypeId___name) {
        this.bankTypeId___name = bankTypeId___name;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setBankName___code(String bankName___code) {
        this.bankName___code = bankName___code;
    }

    public void setBankName___name(MultiLangText bankName___name) {
        this.bankName___name = bankName___name;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Deprecated
    public void setDefaultInvoice(Boolean defaultInvoice) {
        this.defaultInvoice = defaultInvoice;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public void setReceievInvoiceMobile(String receievInvoiceMobile) {
        this.receievInvoiceMobile = receievInvoiceMobile;
    }

    public void setReceievInvoiceEmail(String receievInvoiceEmail) {
        this.receievInvoiceEmail = receievInvoiceEmail;
    }

    public void setEntityStatus(UPCEntityStatus entityStatus) {
        this.entityStatus = entityStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantInvoiceDTO)) {
            return false;
        }
        MerchantInvoiceDTO other = (MerchantInvoiceDTO)o;
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
        Integer this$billingType = this.getBillingType();
        Integer other$billingType = other.getBillingType();
        if (this$billingType == null ? other$billingType != null : !((Object)this$billingType).equals(other$billingType)) {
            return false;
        }
        Boolean this$defaultInvoice = this.getDefaultInvoice();
        Boolean other$defaultInvoice = other.getDefaultInvoice();
        if (this$defaultInvoice == null ? other$defaultInvoice != null : !((Object)this$defaultInvoice).equals(other$defaultInvoice)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        String this$bdBillingType = this.getBdBillingType();
        String other$bdBillingType = other.getBdBillingType();
        if (this$bdBillingType == null ? other$bdBillingType != null : !this$bdBillingType.equals(other$bdBillingType)) {
            return false;
        }
        String this$bdBillingType___name = this.getBdBillingType___name();
        String other$bdBillingType___name = other.getBdBillingType___name();
        if (this$bdBillingType___name == null ? other$bdBillingType___name != null : !this$bdBillingType___name.equals(other$bdBillingType___name)) {
            return false;
        }
        String this$bdBillingType___code = this.getBdBillingType___code();
        String other$bdBillingType___code = other.getBdBillingType___code();
        if (this$bdBillingType___code == null ? other$bdBillingType___code != null : !this$bdBillingType___code.equals(other$bdBillingType___code)) {
            return false;
        }
        String this$bdBillingType___scop = this.getBdBillingType___scop();
        String other$bdBillingType___scop = other.getBdBillingType___scop();
        if (this$bdBillingType___scop == null ? other$bdBillingType___scop != null : !this$bdBillingType___scop.equals(other$bdBillingType___scop)) {
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
        String this$telephone = this.getTelephone();
        String other$telephone = other.getTelephone();
        if (this$telephone == null ? other$telephone != null : !this$telephone.equals(other$telephone)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$bankTypeId = this.getBankTypeId();
        String other$bankTypeId = other.getBankTypeId();
        if (this$bankTypeId == null ? other$bankTypeId != null : !this$bankTypeId.equals(other$bankTypeId)) {
            return false;
        }
        String this$bankTypeId___code = this.getBankTypeId___code();
        String other$bankTypeId___code = other.getBankTypeId___code();
        if (this$bankTypeId___code == null ? other$bankTypeId___code != null : !this$bankTypeId___code.equals(other$bankTypeId___code)) {
            return false;
        }
        MultiLangText this$bankTypeId___name = this.getBankTypeId___name();
        MultiLangText other$bankTypeId___name = other.getBankTypeId___name();
        if (this$bankTypeId___name == null ? other$bankTypeId___name != null : !this$bankTypeId___name.equals(other$bankTypeId___name)) {
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
        MultiLangText this$bankName___name = this.getBankName___name();
        MultiLangText other$bankName___name = other.getBankName___name();
        if (this$bankName___name == null ? other$bankName___name != null : !this$bankName___name.equals(other$bankName___name)) {
            return false;
        }
        String this$bankAccount = this.getBankAccount();
        String other$bankAccount = other.getBankAccount();
        if (this$bankAccount == null ? other$bankAccount != null : !this$bankAccount.equals(other$bankAccount)) {
            return false;
        }
        String this$address = this.getAddress();
        String other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) {
            return false;
        }
        String this$remarks = this.getRemarks();
        String other$remarks = other.getRemarks();
        if (this$remarks == null ? other$remarks != null : !this$remarks.equals(other$remarks)) {
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
        UPCEntityStatus this$entityStatus = this.getEntityStatus();
        UPCEntityStatus other$entityStatus = other.getEntityStatus();
        return !(this$entityStatus == null ? other$entityStatus != null : !((Object)((Object)this$entityStatus)).equals((Object)other$entityStatus));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantInvoiceDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Integer $billingType = this.getBillingType();
        result = result * 59 + ($billingType == null ? 43 : ((Object)$billingType).hashCode());
        Boolean $defaultInvoice = this.getDefaultInvoice();
        result = result * 59 + ($defaultInvoice == null ? 43 : ((Object)$defaultInvoice).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        String $bdBillingType = this.getBdBillingType();
        result = result * 59 + ($bdBillingType == null ? 43 : $bdBillingType.hashCode());
        String $bdBillingType___name = this.getBdBillingType___name();
        result = result * 59 + ($bdBillingType___name == null ? 43 : $bdBillingType___name.hashCode());
        String $bdBillingType___code = this.getBdBillingType___code();
        result = result * 59 + ($bdBillingType___code == null ? 43 : $bdBillingType___code.hashCode());
        String $bdBillingType___scop = this.getBdBillingType___scop();
        result = result * 59 + ($bdBillingType___scop == null ? 43 : $bdBillingType___scop.hashCode());
        String $title = this.getTitle();
        result = result * 59 + ($title == null ? 43 : $title.hashCode());
        String $taxNo = this.getTaxNo();
        result = result * 59 + ($taxNo == null ? 43 : $taxNo.hashCode());
        String $telephone = this.getTelephone();
        result = result * 59 + ($telephone == null ? 43 : $telephone.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $bankTypeId = this.getBankTypeId();
        result = result * 59 + ($bankTypeId == null ? 43 : $bankTypeId.hashCode());
        String $bankTypeId___code = this.getBankTypeId___code();
        result = result * 59 + ($bankTypeId___code == null ? 43 : $bankTypeId___code.hashCode());
        MultiLangText $bankTypeId___name = this.getBankTypeId___name();
        result = result * 59 + ($bankTypeId___name == null ? 43 : $bankTypeId___name.hashCode());
        String $bankName = this.getBankName();
        result = result * 59 + ($bankName == null ? 43 : $bankName.hashCode());
        String $bankName___code = this.getBankName___code();
        result = result * 59 + ($bankName___code == null ? 43 : $bankName___code.hashCode());
        MultiLangText $bankName___name = this.getBankName___name();
        result = result * 59 + ($bankName___name == null ? 43 : $bankName___name.hashCode());
        String $bankAccount = this.getBankAccount();
        result = result * 59 + ($bankAccount == null ? 43 : $bankAccount.hashCode());
        String $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        String $remarks = this.getRemarks();
        result = result * 59 + ($remarks == null ? 43 : $remarks.hashCode());
        String $receievInvoiceMobile = this.getReceievInvoiceMobile();
        result = result * 59 + ($receievInvoiceMobile == null ? 43 : $receievInvoiceMobile.hashCode());
        String $receievInvoiceEmail = this.getReceievInvoiceEmail();
        result = result * 59 + ($receievInvoiceEmail == null ? 43 : $receievInvoiceEmail.hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantInvoiceDTO(id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", billingType=" + this.getBillingType() + ", bdBillingType=" + this.getBdBillingType() + ", bdBillingType___name=" + this.getBdBillingType___name() + ", bdBillingType___code=" + this.getBdBillingType___code() + ", bdBillingType___scop=" + this.getBdBillingType___scop() + ", title=" + this.getTitle() + ", taxNo=" + this.getTaxNo() + ", telephone=" + this.getTelephone() + ", name=" + this.getName() + ", bankTypeId=" + this.getBankTypeId() + ", bankTypeId___code=" + this.getBankTypeId___code() + ", bankTypeId___name=" + this.getBankTypeId___name() + ", bankName=" + this.getBankName() + ", bankName___code=" + this.getBankName___code() + ", bankName___name=" + this.getBankName___name() + ", bankAccount=" + this.getBankAccount() + ", address=" + this.getAddress() + ", defaultInvoice=" + this.getDefaultInvoice() + ", isDefault=" + this.getIsDefault() + ", remarks=" + this.getRemarks() + ", receievInvoiceMobile=" + this.getReceievInvoiceMobile() + ", receievInvoiceEmail=" + this.getReceievInvoiceEmail() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ")";
    }
}

