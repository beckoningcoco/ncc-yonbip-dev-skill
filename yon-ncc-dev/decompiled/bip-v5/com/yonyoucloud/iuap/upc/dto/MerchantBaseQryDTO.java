/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.MerchantDerivativeBaseQryDTO;
import java.util.HashSet;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantBaseQryDTO
extends MerchantDerivativeBaseQryDTO {
    private Long merchantId;
    private List<Long> merchantIdList;
    private List<String> codeList;
    private List<String> names;
    private String fuzzyName;
    private Boolean retailInvestors;
    private Long customerClass;
    private Long parentCustomer;
    private String internalOrgId;
    private List<String> internalOrgIdList;
    private String createMerchant;
    private Boolean createOrg;
    private Boolean internalOrg;
    private Boolean potentialFlag = true;
    private String creditCode;
    private String orgIdNew;
    private List<String> orgIdListNew;
    private HashSet<String> ascField;
    private HashSet<String> descField;

    public Long getMerchantId() {
        return this.merchantId;
    }

    public List<Long> getMerchantIdList() {
        return this.merchantIdList;
    }

    @Override
    public List<String> getCodeList() {
        return this.codeList;
    }

    public List<String> getNames() {
        return this.names;
    }

    @Override
    public String getFuzzyName() {
        return this.fuzzyName;
    }

    public Boolean getRetailInvestors() {
        return this.retailInvestors;
    }

    public Long getCustomerClass() {
        return this.customerClass;
    }

    public Long getParentCustomer() {
        return this.parentCustomer;
    }

    public String getInternalOrgId() {
        return this.internalOrgId;
    }

    public List<String> getInternalOrgIdList() {
        return this.internalOrgIdList;
    }

    public String getCreateMerchant() {
        return this.createMerchant;
    }

    public Boolean getCreateOrg() {
        return this.createOrg;
    }

    public Boolean getInternalOrg() {
        return this.internalOrg;
    }

    public Boolean getPotentialFlag() {
        return this.potentialFlag;
    }

    public String getCreditCode() {
        return this.creditCode;
    }

    public String getOrgIdNew() {
        return this.orgIdNew;
    }

    public List<String> getOrgIdListNew() {
        return this.orgIdListNew;
    }

    public HashSet<String> getAscField() {
        return this.ascField;
    }

    public HashSet<String> getDescField() {
        return this.descField;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setMerchantIdList(List<Long> merchantIdList) {
        this.merchantIdList = merchantIdList;
    }

    @Override
    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public void setFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName;
    }

    public void setRetailInvestors(Boolean retailInvestors) {
        this.retailInvestors = retailInvestors;
    }

    public void setCustomerClass(Long customerClass) {
        this.customerClass = customerClass;
    }

    public void setParentCustomer(Long parentCustomer) {
        this.parentCustomer = parentCustomer;
    }

    public void setInternalOrgId(String internalOrgId) {
        this.internalOrgId = internalOrgId;
    }

    public void setInternalOrgIdList(List<String> internalOrgIdList) {
        this.internalOrgIdList = internalOrgIdList;
    }

    public void setCreateMerchant(String createMerchant) {
        this.createMerchant = createMerchant;
    }

    public void setCreateOrg(Boolean createOrg) {
        this.createOrg = createOrg;
    }

    public void setInternalOrg(Boolean internalOrg) {
        this.internalOrg = internalOrg;
    }

    public void setPotentialFlag(Boolean potentialFlag) {
        this.potentialFlag = potentialFlag;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public void setOrgIdNew(String orgIdNew) {
        this.orgIdNew = orgIdNew;
    }

    public void setOrgIdListNew(List<String> orgIdListNew) {
        this.orgIdListNew = orgIdListNew;
    }

    public void setAscField(HashSet<String> ascField) {
        this.ascField = ascField;
    }

    public void setDescField(HashSet<String> descField) {
        this.descField = descField;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantBaseQryDTO)) {
            return false;
        }
        MerchantBaseQryDTO other = (MerchantBaseQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Boolean this$retailInvestors = this.getRetailInvestors();
        Boolean other$retailInvestors = other.getRetailInvestors();
        if (this$retailInvestors == null ? other$retailInvestors != null : !((Object)this$retailInvestors).equals(other$retailInvestors)) {
            return false;
        }
        Long this$customerClass = this.getCustomerClass();
        Long other$customerClass = other.getCustomerClass();
        if (this$customerClass == null ? other$customerClass != null : !((Object)this$customerClass).equals(other$customerClass)) {
            return false;
        }
        Long this$parentCustomer = this.getParentCustomer();
        Long other$parentCustomer = other.getParentCustomer();
        if (this$parentCustomer == null ? other$parentCustomer != null : !((Object)this$parentCustomer).equals(other$parentCustomer)) {
            return false;
        }
        Boolean this$createOrg = this.getCreateOrg();
        Boolean other$createOrg = other.getCreateOrg();
        if (this$createOrg == null ? other$createOrg != null : !((Object)this$createOrg).equals(other$createOrg)) {
            return false;
        }
        Boolean this$internalOrg = this.getInternalOrg();
        Boolean other$internalOrg = other.getInternalOrg();
        if (this$internalOrg == null ? other$internalOrg != null : !((Object)this$internalOrg).equals(other$internalOrg)) {
            return false;
        }
        Boolean this$potentialFlag = this.getPotentialFlag();
        Boolean other$potentialFlag = other.getPotentialFlag();
        if (this$potentialFlag == null ? other$potentialFlag != null : !((Object)this$potentialFlag).equals(other$potentialFlag)) {
            return false;
        }
        List<Long> this$merchantIdList = this.getMerchantIdList();
        List<Long> other$merchantIdList = other.getMerchantIdList();
        if (this$merchantIdList == null ? other$merchantIdList != null : !((Object)this$merchantIdList).equals(other$merchantIdList)) {
            return false;
        }
        List<String> this$codeList = this.getCodeList();
        List<String> other$codeList = other.getCodeList();
        if (this$codeList == null ? other$codeList != null : !((Object)this$codeList).equals(other$codeList)) {
            return false;
        }
        List<String> this$names = this.getNames();
        List<String> other$names = other.getNames();
        if (this$names == null ? other$names != null : !((Object)this$names).equals(other$names)) {
            return false;
        }
        String this$fuzzyName = this.getFuzzyName();
        String other$fuzzyName = other.getFuzzyName();
        if (this$fuzzyName == null ? other$fuzzyName != null : !this$fuzzyName.equals(other$fuzzyName)) {
            return false;
        }
        String this$internalOrgId = this.getInternalOrgId();
        String other$internalOrgId = other.getInternalOrgId();
        if (this$internalOrgId == null ? other$internalOrgId != null : !this$internalOrgId.equals(other$internalOrgId)) {
            return false;
        }
        List<String> this$internalOrgIdList = this.getInternalOrgIdList();
        List<String> other$internalOrgIdList = other.getInternalOrgIdList();
        if (this$internalOrgIdList == null ? other$internalOrgIdList != null : !((Object)this$internalOrgIdList).equals(other$internalOrgIdList)) {
            return false;
        }
        String this$createMerchant = this.getCreateMerchant();
        String other$createMerchant = other.getCreateMerchant();
        if (this$createMerchant == null ? other$createMerchant != null : !this$createMerchant.equals(other$createMerchant)) {
            return false;
        }
        String this$creditCode = this.getCreditCode();
        String other$creditCode = other.getCreditCode();
        if (this$creditCode == null ? other$creditCode != null : !this$creditCode.equals(other$creditCode)) {
            return false;
        }
        String this$orgIdNew = this.getOrgIdNew();
        String other$orgIdNew = other.getOrgIdNew();
        if (this$orgIdNew == null ? other$orgIdNew != null : !this$orgIdNew.equals(other$orgIdNew)) {
            return false;
        }
        List<String> this$orgIdListNew = this.getOrgIdListNew();
        List<String> other$orgIdListNew = other.getOrgIdListNew();
        if (this$orgIdListNew == null ? other$orgIdListNew != null : !((Object)this$orgIdListNew).equals(other$orgIdListNew)) {
            return false;
        }
        HashSet<String> this$ascField = this.getAscField();
        HashSet<String> other$ascField = other.getAscField();
        if (this$ascField == null ? other$ascField != null : !((Object)this$ascField).equals(other$ascField)) {
            return false;
        }
        HashSet<String> this$descField = this.getDescField();
        HashSet<String> other$descField = other.getDescField();
        return !(this$descField == null ? other$descField != null : !((Object)this$descField).equals(other$descField));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MerchantBaseQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Boolean $retailInvestors = this.getRetailInvestors();
        result = result * 59 + ($retailInvestors == null ? 43 : ((Object)$retailInvestors).hashCode());
        Long $customerClass = this.getCustomerClass();
        result = result * 59 + ($customerClass == null ? 43 : ((Object)$customerClass).hashCode());
        Long $parentCustomer = this.getParentCustomer();
        result = result * 59 + ($parentCustomer == null ? 43 : ((Object)$parentCustomer).hashCode());
        Boolean $createOrg = this.getCreateOrg();
        result = result * 59 + ($createOrg == null ? 43 : ((Object)$createOrg).hashCode());
        Boolean $internalOrg = this.getInternalOrg();
        result = result * 59 + ($internalOrg == null ? 43 : ((Object)$internalOrg).hashCode());
        Boolean $potentialFlag = this.getPotentialFlag();
        result = result * 59 + ($potentialFlag == null ? 43 : ((Object)$potentialFlag).hashCode());
        List<Long> $merchantIdList = this.getMerchantIdList();
        result = result * 59 + ($merchantIdList == null ? 43 : ((Object)$merchantIdList).hashCode());
        List<String> $codeList = this.getCodeList();
        result = result * 59 + ($codeList == null ? 43 : ((Object)$codeList).hashCode());
        List<String> $names = this.getNames();
        result = result * 59 + ($names == null ? 43 : ((Object)$names).hashCode());
        String $fuzzyName = this.getFuzzyName();
        result = result * 59 + ($fuzzyName == null ? 43 : $fuzzyName.hashCode());
        String $internalOrgId = this.getInternalOrgId();
        result = result * 59 + ($internalOrgId == null ? 43 : $internalOrgId.hashCode());
        List<String> $internalOrgIdList = this.getInternalOrgIdList();
        result = result * 59 + ($internalOrgIdList == null ? 43 : ((Object)$internalOrgIdList).hashCode());
        String $createMerchant = this.getCreateMerchant();
        result = result * 59 + ($createMerchant == null ? 43 : $createMerchant.hashCode());
        String $creditCode = this.getCreditCode();
        result = result * 59 + ($creditCode == null ? 43 : $creditCode.hashCode());
        String $orgIdNew = this.getOrgIdNew();
        result = result * 59 + ($orgIdNew == null ? 43 : $orgIdNew.hashCode());
        List<String> $orgIdListNew = this.getOrgIdListNew();
        result = result * 59 + ($orgIdListNew == null ? 43 : ((Object)$orgIdListNew).hashCode());
        HashSet<String> $ascField = this.getAscField();
        result = result * 59 + ($ascField == null ? 43 : ((Object)$ascField).hashCode());
        HashSet<String> $descField = this.getDescField();
        result = result * 59 + ($descField == null ? 43 : ((Object)$descField).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MerchantBaseQryDTO(merchantId=" + this.getMerchantId() + ", merchantIdList=" + this.getMerchantIdList() + ", codeList=" + this.getCodeList() + ", names=" + this.getNames() + ", fuzzyName=" + this.getFuzzyName() + ", retailInvestors=" + this.getRetailInvestors() + ", customerClass=" + this.getCustomerClass() + ", parentCustomer=" + this.getParentCustomer() + ", internalOrgId=" + this.getInternalOrgId() + ", internalOrgIdList=" + this.getInternalOrgIdList() + ", createMerchant=" + this.getCreateMerchant() + ", createOrg=" + this.getCreateOrg() + ", internalOrg=" + this.getInternalOrg() + ", potentialFlag=" + this.getPotentialFlag() + ", creditCode=" + this.getCreditCode() + ", orgIdNew=" + this.getOrgIdNew() + ", orgIdListNew=" + this.getOrgIdListNew() + ", ascField=" + this.getAscField() + ", descField=" + this.getDescField() + ")";
    }
}

