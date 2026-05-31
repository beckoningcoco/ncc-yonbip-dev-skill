/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantCharacterIPassQueryRequest
extends UPCPager
implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String code;
    private String createOrgId;
    private String createOrgCode;
    private Long customerClassId;
    private String customerClassCode;
    private Long customerIndustryId;
    private String customerIndustryCode;
    private Boolean internalOrg;
    private String internalOrgIdId;
    private String internalOrgIdCode;
    private Long suppliersId;
    private String suppliersCode;
    private Date beginTime;
    private Date endTime;
    private Boolean filterPotential;
    private Boolean custom_childInfo;
    private String filterOrgCodes;
    private String creditCode;
    private List<String> creditCodeList;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getCreateOrgId() {
        return this.createOrgId;
    }

    public String getCreateOrgCode() {
        return this.createOrgCode;
    }

    public Long getCustomerClassId() {
        return this.customerClassId;
    }

    public String getCustomerClassCode() {
        return this.customerClassCode;
    }

    public Long getCustomerIndustryId() {
        return this.customerIndustryId;
    }

    public String getCustomerIndustryCode() {
        return this.customerIndustryCode;
    }

    public Boolean getInternalOrg() {
        return this.internalOrg;
    }

    public String getInternalOrgIdId() {
        return this.internalOrgIdId;
    }

    public String getInternalOrgIdCode() {
        return this.internalOrgIdCode;
    }

    public Long getSuppliersId() {
        return this.suppliersId;
    }

    public String getSuppliersCode() {
        return this.suppliersCode;
    }

    public Date getBeginTime() {
        return this.beginTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public Boolean getFilterPotential() {
        return this.filterPotential;
    }

    public Boolean getCustom_childInfo() {
        return this.custom_childInfo;
    }

    public String getFilterOrgCodes() {
        return this.filterOrgCodes;
    }

    public String getCreditCode() {
        return this.creditCode;
    }

    public List<String> getCreditCodeList() {
        return this.creditCodeList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCreateOrgId(String createOrgId) {
        this.createOrgId = createOrgId;
    }

    public void setCreateOrgCode(String createOrgCode) {
        this.createOrgCode = createOrgCode;
    }

    public void setCustomerClassId(Long customerClassId) {
        this.customerClassId = customerClassId;
    }

    public void setCustomerClassCode(String customerClassCode) {
        this.customerClassCode = customerClassCode;
    }

    public void setCustomerIndustryId(Long customerIndustryId) {
        this.customerIndustryId = customerIndustryId;
    }

    public void setCustomerIndustryCode(String customerIndustryCode) {
        this.customerIndustryCode = customerIndustryCode;
    }

    public void setInternalOrg(Boolean internalOrg) {
        this.internalOrg = internalOrg;
    }

    public void setInternalOrgIdId(String internalOrgIdId) {
        this.internalOrgIdId = internalOrgIdId;
    }

    public void setInternalOrgIdCode(String internalOrgIdCode) {
        this.internalOrgIdCode = internalOrgIdCode;
    }

    public void setSuppliersId(Long suppliersId) {
        this.suppliersId = suppliersId;
    }

    public void setSuppliersCode(String suppliersCode) {
        this.suppliersCode = suppliersCode;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void setFilterPotential(Boolean filterPotential) {
        this.filterPotential = filterPotential;
    }

    public void setCustom_childInfo(Boolean custom_childInfo) {
        this.custom_childInfo = custom_childInfo;
    }

    public void setFilterOrgCodes(String filterOrgCodes) {
        this.filterOrgCodes = filterOrgCodes;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public void setCreditCodeList(List<String> creditCodeList) {
        this.creditCodeList = creditCodeList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantCharacterIPassQueryRequest)) {
            return false;
        }
        MerchantCharacterIPassQueryRequest other = (MerchantCharacterIPassQueryRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$customerClassId = this.getCustomerClassId();
        Long other$customerClassId = other.getCustomerClassId();
        if (this$customerClassId == null ? other$customerClassId != null : !((Object)this$customerClassId).equals(other$customerClassId)) {
            return false;
        }
        Long this$customerIndustryId = this.getCustomerIndustryId();
        Long other$customerIndustryId = other.getCustomerIndustryId();
        if (this$customerIndustryId == null ? other$customerIndustryId != null : !((Object)this$customerIndustryId).equals(other$customerIndustryId)) {
            return false;
        }
        Boolean this$internalOrg = this.getInternalOrg();
        Boolean other$internalOrg = other.getInternalOrg();
        if (this$internalOrg == null ? other$internalOrg != null : !((Object)this$internalOrg).equals(other$internalOrg)) {
            return false;
        }
        Long this$suppliersId = this.getSuppliersId();
        Long other$suppliersId = other.getSuppliersId();
        if (this$suppliersId == null ? other$suppliersId != null : !((Object)this$suppliersId).equals(other$suppliersId)) {
            return false;
        }
        Boolean this$filterPotential = this.getFilterPotential();
        Boolean other$filterPotential = other.getFilterPotential();
        if (this$filterPotential == null ? other$filterPotential != null : !((Object)this$filterPotential).equals(other$filterPotential)) {
            return false;
        }
        Boolean this$custom_childInfo = this.getCustom_childInfo();
        Boolean other$custom_childInfo = other.getCustom_childInfo();
        if (this$custom_childInfo == null ? other$custom_childInfo != null : !((Object)this$custom_childInfo).equals(other$custom_childInfo)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$createOrgId = this.getCreateOrgId();
        String other$createOrgId = other.getCreateOrgId();
        if (this$createOrgId == null ? other$createOrgId != null : !this$createOrgId.equals(other$createOrgId)) {
            return false;
        }
        String this$createOrgCode = this.getCreateOrgCode();
        String other$createOrgCode = other.getCreateOrgCode();
        if (this$createOrgCode == null ? other$createOrgCode != null : !this$createOrgCode.equals(other$createOrgCode)) {
            return false;
        }
        String this$customerClassCode = this.getCustomerClassCode();
        String other$customerClassCode = other.getCustomerClassCode();
        if (this$customerClassCode == null ? other$customerClassCode != null : !this$customerClassCode.equals(other$customerClassCode)) {
            return false;
        }
        String this$customerIndustryCode = this.getCustomerIndustryCode();
        String other$customerIndustryCode = other.getCustomerIndustryCode();
        if (this$customerIndustryCode == null ? other$customerIndustryCode != null : !this$customerIndustryCode.equals(other$customerIndustryCode)) {
            return false;
        }
        String this$internalOrgIdId = this.getInternalOrgIdId();
        String other$internalOrgIdId = other.getInternalOrgIdId();
        if (this$internalOrgIdId == null ? other$internalOrgIdId != null : !this$internalOrgIdId.equals(other$internalOrgIdId)) {
            return false;
        }
        String this$internalOrgIdCode = this.getInternalOrgIdCode();
        String other$internalOrgIdCode = other.getInternalOrgIdCode();
        if (this$internalOrgIdCode == null ? other$internalOrgIdCode != null : !this$internalOrgIdCode.equals(other$internalOrgIdCode)) {
            return false;
        }
        String this$suppliersCode = this.getSuppliersCode();
        String other$suppliersCode = other.getSuppliersCode();
        if (this$suppliersCode == null ? other$suppliersCode != null : !this$suppliersCode.equals(other$suppliersCode)) {
            return false;
        }
        Date this$beginTime = this.getBeginTime();
        Date other$beginTime = other.getBeginTime();
        if (this$beginTime == null ? other$beginTime != null : !((Object)this$beginTime).equals(other$beginTime)) {
            return false;
        }
        Date this$endTime = this.getEndTime();
        Date other$endTime = other.getEndTime();
        if (this$endTime == null ? other$endTime != null : !((Object)this$endTime).equals(other$endTime)) {
            return false;
        }
        String this$filterOrgCodes = this.getFilterOrgCodes();
        String other$filterOrgCodes = other.getFilterOrgCodes();
        if (this$filterOrgCodes == null ? other$filterOrgCodes != null : !this$filterOrgCodes.equals(other$filterOrgCodes)) {
            return false;
        }
        String this$creditCode = this.getCreditCode();
        String other$creditCode = other.getCreditCode();
        if (this$creditCode == null ? other$creditCode != null : !this$creditCode.equals(other$creditCode)) {
            return false;
        }
        List<String> this$creditCodeList = this.getCreditCodeList();
        List<String> other$creditCodeList = other.getCreditCodeList();
        return !(this$creditCodeList == null ? other$creditCodeList != null : !((Object)this$creditCodeList).equals(other$creditCodeList));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MerchantCharacterIPassQueryRequest;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $customerClassId = this.getCustomerClassId();
        result = result * 59 + ($customerClassId == null ? 43 : ((Object)$customerClassId).hashCode());
        Long $customerIndustryId = this.getCustomerIndustryId();
        result = result * 59 + ($customerIndustryId == null ? 43 : ((Object)$customerIndustryId).hashCode());
        Boolean $internalOrg = this.getInternalOrg();
        result = result * 59 + ($internalOrg == null ? 43 : ((Object)$internalOrg).hashCode());
        Long $suppliersId = this.getSuppliersId();
        result = result * 59 + ($suppliersId == null ? 43 : ((Object)$suppliersId).hashCode());
        Boolean $filterPotential = this.getFilterPotential();
        result = result * 59 + ($filterPotential == null ? 43 : ((Object)$filterPotential).hashCode());
        Boolean $custom_childInfo = this.getCustom_childInfo();
        result = result * 59 + ($custom_childInfo == null ? 43 : ((Object)$custom_childInfo).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $createOrgId = this.getCreateOrgId();
        result = result * 59 + ($createOrgId == null ? 43 : $createOrgId.hashCode());
        String $createOrgCode = this.getCreateOrgCode();
        result = result * 59 + ($createOrgCode == null ? 43 : $createOrgCode.hashCode());
        String $customerClassCode = this.getCustomerClassCode();
        result = result * 59 + ($customerClassCode == null ? 43 : $customerClassCode.hashCode());
        String $customerIndustryCode = this.getCustomerIndustryCode();
        result = result * 59 + ($customerIndustryCode == null ? 43 : $customerIndustryCode.hashCode());
        String $internalOrgIdId = this.getInternalOrgIdId();
        result = result * 59 + ($internalOrgIdId == null ? 43 : $internalOrgIdId.hashCode());
        String $internalOrgIdCode = this.getInternalOrgIdCode();
        result = result * 59 + ($internalOrgIdCode == null ? 43 : $internalOrgIdCode.hashCode());
        String $suppliersCode = this.getSuppliersCode();
        result = result * 59 + ($suppliersCode == null ? 43 : $suppliersCode.hashCode());
        Date $beginTime = this.getBeginTime();
        result = result * 59 + ($beginTime == null ? 43 : ((Object)$beginTime).hashCode());
        Date $endTime = this.getEndTime();
        result = result * 59 + ($endTime == null ? 43 : ((Object)$endTime).hashCode());
        String $filterOrgCodes = this.getFilterOrgCodes();
        result = result * 59 + ($filterOrgCodes == null ? 43 : $filterOrgCodes.hashCode());
        String $creditCode = this.getCreditCode();
        result = result * 59 + ($creditCode == null ? 43 : $creditCode.hashCode());
        List<String> $creditCodeList = this.getCreditCodeList();
        result = result * 59 + ($creditCodeList == null ? 43 : ((Object)$creditCodeList).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MerchantCharacterIPassQueryRequest(id=" + this.getId() + ", code=" + this.getCode() + ", createOrgId=" + this.getCreateOrgId() + ", createOrgCode=" + this.getCreateOrgCode() + ", customerClassId=" + this.getCustomerClassId() + ", customerClassCode=" + this.getCustomerClassCode() + ", customerIndustryId=" + this.getCustomerIndustryId() + ", customerIndustryCode=" + this.getCustomerIndustryCode() + ", internalOrg=" + this.getInternalOrg() + ", internalOrgIdId=" + this.getInternalOrgIdId() + ", internalOrgIdCode=" + this.getInternalOrgIdCode() + ", suppliersId=" + this.getSuppliersId() + ", suppliersCode=" + this.getSuppliersCode() + ", beginTime=" + this.getBeginTime() + ", endTime=" + this.getEndTime() + ", filterPotential=" + this.getFilterPotential() + ", custom_childInfo=" + this.getCustom_childInfo() + ", filterOrgCodes=" + this.getFilterOrgCodes() + ", creditCode=" + this.getCreditCode() + ", creditCodeList=" + this.getCreditCodeList() + ")";
    }
}

