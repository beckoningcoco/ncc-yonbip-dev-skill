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
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantBillingDataDTO
implements Serializable {
    private Long id;
    private Long tenant;
    private String ytenant;
    private Date pubts;
    private Long invoicingCustomersId;
    private String invoicingCustomersId___code;
    private MultiLangText invoicingCustomersId___name;
    private Boolean isDefault;
    private Long merchantApplyRangeId;
    private String orgId;
    private Long merchantId;
    private String merchantId___code;
    private MultiLangText merchantId___name;
    private UPCEntityStatus entityStatus;
    private List<String> needBlankFieldList;

    public Long getId() {
        return this.id;
    }

    public Long getTenant() {
        return this.tenant;
    }

    public String getYtenant() {
        return this.ytenant;
    }

    public Date getPubts() {
        return this.pubts;
    }

    public Long getInvoicingCustomersId() {
        return this.invoicingCustomersId;
    }

    public String getInvoicingCustomersId___code() {
        return this.invoicingCustomersId___code;
    }

    public MultiLangText getInvoicingCustomersId___name() {
        return this.invoicingCustomersId___name;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public String getMerchantId___code() {
        return this.merchantId___code;
    }

    public MultiLangText getMerchantId___name() {
        return this.merchantId___name;
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

    public void setTenant(Long tenant) {
        this.tenant = tenant;
    }

    public void setYtenant(String ytenant) {
        this.ytenant = ytenant;
    }

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setInvoicingCustomersId(Long invoicingCustomersId) {
        this.invoicingCustomersId = invoicingCustomersId;
    }

    public void setInvoicingCustomersId___code(String invoicingCustomersId___code) {
        this.invoicingCustomersId___code = invoicingCustomersId___code;
    }

    public void setInvoicingCustomersId___name(MultiLangText invoicingCustomersId___name) {
        this.invoicingCustomersId___name = invoicingCustomersId___name;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantId___code(String merchantId___code) {
        this.merchantId___code = merchantId___code;
    }

    public void setMerchantId___name(MultiLangText merchantId___name) {
        this.merchantId___name = merchantId___name;
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
        if (!(o instanceof MerchantBillingDataDTO)) {
            return false;
        }
        MerchantBillingDataDTO other = (MerchantBillingDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$tenant = this.getTenant();
        Long other$tenant = other.getTenant();
        if (this$tenant == null ? other$tenant != null : !((Object)this$tenant).equals(other$tenant)) {
            return false;
        }
        Long this$invoicingCustomersId = this.getInvoicingCustomersId();
        Long other$invoicingCustomersId = other.getInvoicingCustomersId();
        if (this$invoicingCustomersId == null ? other$invoicingCustomersId != null : !((Object)this$invoicingCustomersId).equals(other$invoicingCustomersId)) {
            return false;
        }
        Boolean this$isDefault = this.getIsDefault();
        Boolean other$isDefault = other.getIsDefault();
        if (this$isDefault == null ? other$isDefault != null : !((Object)this$isDefault).equals(other$isDefault)) {
            return false;
        }
        Long this$merchantApplyRangeId = this.getMerchantApplyRangeId();
        Long other$merchantApplyRangeId = other.getMerchantApplyRangeId();
        if (this$merchantApplyRangeId == null ? other$merchantApplyRangeId != null : !((Object)this$merchantApplyRangeId).equals(other$merchantApplyRangeId)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        String this$ytenant = this.getYtenant();
        String other$ytenant = other.getYtenant();
        if (this$ytenant == null ? other$ytenant != null : !this$ytenant.equals(other$ytenant)) {
            return false;
        }
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
            return false;
        }
        String this$invoicingCustomersId___code = this.getInvoicingCustomersId___code();
        String other$invoicingCustomersId___code = other.getInvoicingCustomersId___code();
        if (this$invoicingCustomersId___code == null ? other$invoicingCustomersId___code != null : !this$invoicingCustomersId___code.equals(other$invoicingCustomersId___code)) {
            return false;
        }
        MultiLangText this$invoicingCustomersId___name = this.getInvoicingCustomersId___name();
        MultiLangText other$invoicingCustomersId___name = other.getInvoicingCustomersId___name();
        if (this$invoicingCustomersId___name == null ? other$invoicingCustomersId___name != null : !this$invoicingCustomersId___name.equals(other$invoicingCustomersId___name)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$merchantId___code = this.getMerchantId___code();
        String other$merchantId___code = other.getMerchantId___code();
        if (this$merchantId___code == null ? other$merchantId___code != null : !this$merchantId___code.equals(other$merchantId___code)) {
            return false;
        }
        MultiLangText this$merchantId___name = this.getMerchantId___name();
        MultiLangText other$merchantId___name = other.getMerchantId___name();
        if (this$merchantId___name == null ? other$merchantId___name != null : !this$merchantId___name.equals(other$merchantId___name)) {
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
        return other instanceof MerchantBillingDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $tenant = this.getTenant();
        result = result * 59 + ($tenant == null ? 43 : ((Object)$tenant).hashCode());
        Long $invoicingCustomersId = this.getInvoicingCustomersId();
        result = result * 59 + ($invoicingCustomersId == null ? 43 : ((Object)$invoicingCustomersId).hashCode());
        Boolean $isDefault = this.getIsDefault();
        result = result * 59 + ($isDefault == null ? 43 : ((Object)$isDefault).hashCode());
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        String $ytenant = this.getYtenant();
        result = result * 59 + ($ytenant == null ? 43 : $ytenant.hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        String $invoicingCustomersId___code = this.getInvoicingCustomersId___code();
        result = result * 59 + ($invoicingCustomersId___code == null ? 43 : $invoicingCustomersId___code.hashCode());
        MultiLangText $invoicingCustomersId___name = this.getInvoicingCustomersId___name();
        result = result * 59 + ($invoicingCustomersId___name == null ? 43 : $invoicingCustomersId___name.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $merchantId___code = this.getMerchantId___code();
        result = result * 59 + ($merchantId___code == null ? 43 : $merchantId___code.hashCode());
        MultiLangText $merchantId___name = this.getMerchantId___name();
        result = result * 59 + ($merchantId___name == null ? 43 : $merchantId___name.hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        List<String> $needBlankFieldList = this.getNeedBlankFieldList();
        result = result * 59 + ($needBlankFieldList == null ? 43 : ((Object)$needBlankFieldList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantBillingDataDTO(id=" + this.getId() + ", tenant=" + this.getTenant() + ", ytenant=" + this.getYtenant() + ", pubts=" + this.getPubts() + ", invoicingCustomersId=" + this.getInvoicingCustomersId() + ", invoicingCustomersId___code=" + this.getInvoicingCustomersId___code() + ", invoicingCustomersId___name=" + this.getInvoicingCustomersId___name() + ", isDefault=" + this.getIsDefault() + ", merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", orgId=" + this.getOrgId() + ", merchantId=" + this.getMerchantId() + ", merchantId___code=" + this.getMerchantId___code() + ", merchantId___name=" + this.getMerchantId___name() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ", needBlankFieldList=" + this.getNeedBlankFieldList() + ")";
    }
}

