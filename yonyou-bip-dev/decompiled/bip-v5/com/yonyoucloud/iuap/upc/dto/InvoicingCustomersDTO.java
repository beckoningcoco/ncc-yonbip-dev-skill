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
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class InvoicingCustomersDTO
implements Serializable {
    private Long id;
    private Long merchantId;
    private String merchantName;
    private MultiLangText merchantName_multilang;
    private String merchantCode;
    private Long invoicingCustomersId;
    private String invoicingCustomersCode;
    private String invoicingCustomersName;
    private MultiLangText invoicingCustomersName_multilang;
    private Boolean ifDefault;
    private Long merchantApplyRangeId;
    private Long merchantApplyRangeOrgId;
    private String orgId;
    private Long tenantId;

    public Long getId() {
        return this.id;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantName() {
        return this.merchantName;
    }

    public MultiLangText getMerchantName_multilang() {
        return this.merchantName_multilang;
    }

    public String getMerchantCode() {
        return this.merchantCode;
    }

    public Long getInvoicingCustomersId() {
        return this.invoicingCustomersId;
    }

    public String getInvoicingCustomersCode() {
        return this.invoicingCustomersCode;
    }

    public String getInvoicingCustomersName() {
        return this.invoicingCustomersName;
    }

    public MultiLangText getInvoicingCustomersName_multilang() {
        return this.invoicingCustomersName_multilang;
    }

    public Boolean getIfDefault() {
        return this.ifDefault;
    }

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public Long getMerchantApplyRangeOrgId() {
        return this.merchantApplyRangeOrgId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public Long getTenantId() {
        return this.tenantId;
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

    public void setMerchantName_multilang(MultiLangText merchantName_multilang) {
        this.merchantName_multilang = merchantName_multilang;
    }

    public void setMerchantCode(String merchantCode) {
        this.merchantCode = merchantCode;
    }

    public void setInvoicingCustomersId(Long invoicingCustomersId) {
        this.invoicingCustomersId = invoicingCustomersId;
    }

    public void setInvoicingCustomersCode(String invoicingCustomersCode) {
        this.invoicingCustomersCode = invoicingCustomersCode;
    }

    public void setInvoicingCustomersName(String invoicingCustomersName) {
        this.invoicingCustomersName = invoicingCustomersName;
    }

    public void setInvoicingCustomersName_multilang(MultiLangText invoicingCustomersName_multilang) {
        this.invoicingCustomersName_multilang = invoicingCustomersName_multilang;
    }

    public void setIfDefault(Boolean ifDefault) {
        this.ifDefault = ifDefault;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setMerchantApplyRangeOrgId(Long merchantApplyRangeOrgId) {
        this.merchantApplyRangeOrgId = merchantApplyRangeOrgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof InvoicingCustomersDTO)) {
            return false;
        }
        InvoicingCustomersDTO other = (InvoicingCustomersDTO)o;
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
        Long this$invoicingCustomersId = this.getInvoicingCustomersId();
        Long other$invoicingCustomersId = other.getInvoicingCustomersId();
        if (this$invoicingCustomersId == null ? other$invoicingCustomersId != null : !((Object)this$invoicingCustomersId).equals(other$invoicingCustomersId)) {
            return false;
        }
        Boolean this$ifDefault = this.getIfDefault();
        Boolean other$ifDefault = other.getIfDefault();
        if (this$ifDefault == null ? other$ifDefault != null : !((Object)this$ifDefault).equals(other$ifDefault)) {
            return false;
        }
        Long this$merchantApplyRangeId = this.getMerchantApplyRangeId();
        Long other$merchantApplyRangeId = other.getMerchantApplyRangeId();
        if (this$merchantApplyRangeId == null ? other$merchantApplyRangeId != null : !((Object)this$merchantApplyRangeId).equals(other$merchantApplyRangeId)) {
            return false;
        }
        Long this$merchantApplyRangeOrgId = this.getMerchantApplyRangeOrgId();
        Long other$merchantApplyRangeOrgId = other.getMerchantApplyRangeOrgId();
        if (this$merchantApplyRangeOrgId == null ? other$merchantApplyRangeOrgId != null : !((Object)this$merchantApplyRangeOrgId).equals(other$merchantApplyRangeOrgId)) {
            return false;
        }
        Long this$tenantId = this.getTenantId();
        Long other$tenantId = other.getTenantId();
        if (this$tenantId == null ? other$tenantId != null : !((Object)this$tenantId).equals(other$tenantId)) {
            return false;
        }
        String this$merchantName = this.getMerchantName();
        String other$merchantName = other.getMerchantName();
        if (this$merchantName == null ? other$merchantName != null : !this$merchantName.equals(other$merchantName)) {
            return false;
        }
        MultiLangText this$merchantName_multilang = this.getMerchantName_multilang();
        MultiLangText other$merchantName_multilang = other.getMerchantName_multilang();
        if (this$merchantName_multilang == null ? other$merchantName_multilang != null : !this$merchantName_multilang.equals(other$merchantName_multilang)) {
            return false;
        }
        String this$merchantCode = this.getMerchantCode();
        String other$merchantCode = other.getMerchantCode();
        if (this$merchantCode == null ? other$merchantCode != null : !this$merchantCode.equals(other$merchantCode)) {
            return false;
        }
        String this$invoicingCustomersCode = this.getInvoicingCustomersCode();
        String other$invoicingCustomersCode = other.getInvoicingCustomersCode();
        if (this$invoicingCustomersCode == null ? other$invoicingCustomersCode != null : !this$invoicingCustomersCode.equals(other$invoicingCustomersCode)) {
            return false;
        }
        String this$invoicingCustomersName = this.getInvoicingCustomersName();
        String other$invoicingCustomersName = other.getInvoicingCustomersName();
        if (this$invoicingCustomersName == null ? other$invoicingCustomersName != null : !this$invoicingCustomersName.equals(other$invoicingCustomersName)) {
            return false;
        }
        MultiLangText this$invoicingCustomersName_multilang = this.getInvoicingCustomersName_multilang();
        MultiLangText other$invoicingCustomersName_multilang = other.getInvoicingCustomersName_multilang();
        if (this$invoicingCustomersName_multilang == null ? other$invoicingCustomersName_multilang != null : !this$invoicingCustomersName_multilang.equals(other$invoicingCustomersName_multilang)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        return !(this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof InvoicingCustomersDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $invoicingCustomersId = this.getInvoicingCustomersId();
        result = result * 59 + ($invoicingCustomersId == null ? 43 : ((Object)$invoicingCustomersId).hashCode());
        Boolean $ifDefault = this.getIfDefault();
        result = result * 59 + ($ifDefault == null ? 43 : ((Object)$ifDefault).hashCode());
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Long $merchantApplyRangeOrgId = this.getMerchantApplyRangeOrgId();
        result = result * 59 + ($merchantApplyRangeOrgId == null ? 43 : ((Object)$merchantApplyRangeOrgId).hashCode());
        Long $tenantId = this.getTenantId();
        result = result * 59 + ($tenantId == null ? 43 : ((Object)$tenantId).hashCode());
        String $merchantName = this.getMerchantName();
        result = result * 59 + ($merchantName == null ? 43 : $merchantName.hashCode());
        MultiLangText $merchantName_multilang = this.getMerchantName_multilang();
        result = result * 59 + ($merchantName_multilang == null ? 43 : $merchantName_multilang.hashCode());
        String $merchantCode = this.getMerchantCode();
        result = result * 59 + ($merchantCode == null ? 43 : $merchantCode.hashCode());
        String $invoicingCustomersCode = this.getInvoicingCustomersCode();
        result = result * 59 + ($invoicingCustomersCode == null ? 43 : $invoicingCustomersCode.hashCode());
        String $invoicingCustomersName = this.getInvoicingCustomersName();
        result = result * 59 + ($invoicingCustomersName == null ? 43 : $invoicingCustomersName.hashCode());
        MultiLangText $invoicingCustomersName_multilang = this.getInvoicingCustomersName_multilang();
        result = result * 59 + ($invoicingCustomersName_multilang == null ? 43 : $invoicingCustomersName_multilang.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        return result;
    }

    public String toString() {
        return "InvoicingCustomersDTO(id=" + this.getId() + ", merchantId=" + this.getMerchantId() + ", merchantName=" + this.getMerchantName() + ", merchantName_multilang=" + this.getMerchantName_multilang() + ", merchantCode=" + this.getMerchantCode() + ", invoicingCustomersId=" + this.getInvoicingCustomersId() + ", invoicingCustomersCode=" + this.getInvoicingCustomersCode() + ", invoicingCustomersName=" + this.getInvoicingCustomersName() + ", invoicingCustomersName_multilang=" + this.getInvoicingCustomersName_multilang() + ", ifDefault=" + this.getIfDefault() + ", merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", merchantApplyRangeOrgId=" + this.getMerchantApplyRangeOrgId() + ", orgId=" + this.getOrgId() + ", tenantId=" + this.getTenantId() + ")";
    }
}

