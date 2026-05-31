/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.MerchantBaseQryDTO;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantQryDTO
extends MerchantBaseQryDTO {
    @Deprecated
    private Long orgId;
    @Deprecated
    private List<Long> orgIdList;
    private String orgIdNew;
    private List<String> orgIdListNew;
    private Boolean detailStopStatus;
    private String pubts;
    private Long merchantApplyRangeId;
    private List<Long> merchantApplyRangeIdList;
    private Boolean creator;
    private Long customerLevel;
    private Boolean createOrg;
    private Boolean addressInfoDefault;
    private Boolean contacterDefault;
    private Integer agentInvoiceBillingType;
    private String agentInvoiceBdBillingType;
    private String agentInvoiceTaxNo;
    private Boolean agentInvoiceDefaultInvoice;
    private String fuzzyTaxNoAndName;
    private String tradeCustomers;
    private String businessRole;
    private List<String> funcTypeList;
    private Boolean salesOrg;
    private String potential;
    private String specialManagementDepCode;
    private String professSalesmanCode;
    private String creatorName;
    private Integer warningDay;
    private String isFinancialSynergy;
    private String taxRateId;

    @Deprecated
    public Long getOrgId() {
        return this.orgId;
    }

    @Deprecated
    public List<Long> getOrgIdList() {
        return this.orgIdList;
    }

    @Override
    public String getOrgIdNew() {
        return this.orgIdNew;
    }

    @Override
    public List<String> getOrgIdListNew() {
        return this.orgIdListNew;
    }

    public Boolean getDetailStopStatus() {
        return this.detailStopStatus;
    }

    public String getPubts() {
        return this.pubts;
    }

    public Long getMerchantApplyRangeId() {
        return this.merchantApplyRangeId;
    }

    public List<Long> getMerchantApplyRangeIdList() {
        return this.merchantApplyRangeIdList;
    }

    public Boolean getCreator() {
        return this.creator;
    }

    public Long getCustomerLevel() {
        return this.customerLevel;
    }

    @Override
    public Boolean getCreateOrg() {
        return this.createOrg;
    }

    public Boolean getAddressInfoDefault() {
        return this.addressInfoDefault;
    }

    public Boolean getContacterDefault() {
        return this.contacterDefault;
    }

    public Integer getAgentInvoiceBillingType() {
        return this.agentInvoiceBillingType;
    }

    public String getAgentInvoiceBdBillingType() {
        return this.agentInvoiceBdBillingType;
    }

    public String getAgentInvoiceTaxNo() {
        return this.agentInvoiceTaxNo;
    }

    public Boolean getAgentInvoiceDefaultInvoice() {
        return this.agentInvoiceDefaultInvoice;
    }

    public String getFuzzyTaxNoAndName() {
        return this.fuzzyTaxNoAndName;
    }

    public String getTradeCustomers() {
        return this.tradeCustomers;
    }

    public String getBusinessRole() {
        return this.businessRole;
    }

    public List<String> getFuncTypeList() {
        return this.funcTypeList;
    }

    public Boolean getSalesOrg() {
        return this.salesOrg;
    }

    public String getPotential() {
        return this.potential;
    }

    public String getSpecialManagementDepCode() {
        return this.specialManagementDepCode;
    }

    public String getProfessSalesmanCode() {
        return this.professSalesmanCode;
    }

    public String getCreatorName() {
        return this.creatorName;
    }

    public Integer getWarningDay() {
        return this.warningDay;
    }

    public String getIsFinancialSynergy() {
        return this.isFinancialSynergy;
    }

    @Override
    public String getTaxRateId() {
        return this.taxRateId;
    }

    @Deprecated
    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    @Deprecated
    public void setOrgIdList(List<Long> orgIdList) {
        this.orgIdList = orgIdList;
    }

    @Override
    public void setOrgIdNew(String orgIdNew) {
        this.orgIdNew = orgIdNew;
    }

    @Override
    public void setOrgIdListNew(List<String> orgIdListNew) {
        this.orgIdListNew = orgIdListNew;
    }

    public void setDetailStopStatus(Boolean detailStopStatus) {
        this.detailStopStatus = detailStopStatus;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setMerchantApplyRangeId(Long merchantApplyRangeId) {
        this.merchantApplyRangeId = merchantApplyRangeId;
    }

    public void setMerchantApplyRangeIdList(List<Long> merchantApplyRangeIdList) {
        this.merchantApplyRangeIdList = merchantApplyRangeIdList;
    }

    public void setCreator(Boolean creator) {
        this.creator = creator;
    }

    public void setCustomerLevel(Long customerLevel) {
        this.customerLevel = customerLevel;
    }

    @Override
    public void setCreateOrg(Boolean createOrg) {
        this.createOrg = createOrg;
    }

    public void setAddressInfoDefault(Boolean addressInfoDefault) {
        this.addressInfoDefault = addressInfoDefault;
    }

    public void setContacterDefault(Boolean contacterDefault) {
        this.contacterDefault = contacterDefault;
    }

    public void setAgentInvoiceBillingType(Integer agentInvoiceBillingType) {
        this.agentInvoiceBillingType = agentInvoiceBillingType;
    }

    public void setAgentInvoiceBdBillingType(String agentInvoiceBdBillingType) {
        this.agentInvoiceBdBillingType = agentInvoiceBdBillingType;
    }

    public void setAgentInvoiceTaxNo(String agentInvoiceTaxNo) {
        this.agentInvoiceTaxNo = agentInvoiceTaxNo;
    }

    public void setAgentInvoiceDefaultInvoice(Boolean agentInvoiceDefaultInvoice) {
        this.agentInvoiceDefaultInvoice = agentInvoiceDefaultInvoice;
    }

    public void setFuzzyTaxNoAndName(String fuzzyTaxNoAndName) {
        this.fuzzyTaxNoAndName = fuzzyTaxNoAndName;
    }

    public void setTradeCustomers(String tradeCustomers) {
        this.tradeCustomers = tradeCustomers;
    }

    public void setBusinessRole(String businessRole) {
        this.businessRole = businessRole;
    }

    public void setFuncTypeList(List<String> funcTypeList) {
        this.funcTypeList = funcTypeList;
    }

    public void setSalesOrg(Boolean salesOrg) {
        this.salesOrg = salesOrg;
    }

    public void setPotential(String potential) {
        this.potential = potential;
    }

    public void setSpecialManagementDepCode(String specialManagementDepCode) {
        this.specialManagementDepCode = specialManagementDepCode;
    }

    public void setProfessSalesmanCode(String professSalesmanCode) {
        this.professSalesmanCode = professSalesmanCode;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public void setWarningDay(Integer warningDay) {
        this.warningDay = warningDay;
    }

    public void setIsFinancialSynergy(String isFinancialSynergy) {
        this.isFinancialSynergy = isFinancialSynergy;
    }

    @Override
    public void setTaxRateId(String taxRateId) {
        this.taxRateId = taxRateId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantQryDTO)) {
            return false;
        }
        MerchantQryDTO other = (MerchantQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$orgId = this.getOrgId();
        Long other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !((Object)this$orgId).equals(other$orgId)) {
            return false;
        }
        Boolean this$detailStopStatus = this.getDetailStopStatus();
        Boolean other$detailStopStatus = other.getDetailStopStatus();
        if (this$detailStopStatus == null ? other$detailStopStatus != null : !((Object)this$detailStopStatus).equals(other$detailStopStatus)) {
            return false;
        }
        Long this$merchantApplyRangeId = this.getMerchantApplyRangeId();
        Long other$merchantApplyRangeId = other.getMerchantApplyRangeId();
        if (this$merchantApplyRangeId == null ? other$merchantApplyRangeId != null : !((Object)this$merchantApplyRangeId).equals(other$merchantApplyRangeId)) {
            return false;
        }
        Boolean this$creator = this.getCreator();
        Boolean other$creator = other.getCreator();
        if (this$creator == null ? other$creator != null : !((Object)this$creator).equals(other$creator)) {
            return false;
        }
        Long this$customerLevel = this.getCustomerLevel();
        Long other$customerLevel = other.getCustomerLevel();
        if (this$customerLevel == null ? other$customerLevel != null : !((Object)this$customerLevel).equals(other$customerLevel)) {
            return false;
        }
        Boolean this$createOrg = this.getCreateOrg();
        Boolean other$createOrg = other.getCreateOrg();
        if (this$createOrg == null ? other$createOrg != null : !((Object)this$createOrg).equals(other$createOrg)) {
            return false;
        }
        Boolean this$addressInfoDefault = this.getAddressInfoDefault();
        Boolean other$addressInfoDefault = other.getAddressInfoDefault();
        if (this$addressInfoDefault == null ? other$addressInfoDefault != null : !((Object)this$addressInfoDefault).equals(other$addressInfoDefault)) {
            return false;
        }
        Boolean this$contacterDefault = this.getContacterDefault();
        Boolean other$contacterDefault = other.getContacterDefault();
        if (this$contacterDefault == null ? other$contacterDefault != null : !((Object)this$contacterDefault).equals(other$contacterDefault)) {
            return false;
        }
        Integer this$agentInvoiceBillingType = this.getAgentInvoiceBillingType();
        Integer other$agentInvoiceBillingType = other.getAgentInvoiceBillingType();
        if (this$agentInvoiceBillingType == null ? other$agentInvoiceBillingType != null : !((Object)this$agentInvoiceBillingType).equals(other$agentInvoiceBillingType)) {
            return false;
        }
        Boolean this$agentInvoiceDefaultInvoice = this.getAgentInvoiceDefaultInvoice();
        Boolean other$agentInvoiceDefaultInvoice = other.getAgentInvoiceDefaultInvoice();
        if (this$agentInvoiceDefaultInvoice == null ? other$agentInvoiceDefaultInvoice != null : !((Object)this$agentInvoiceDefaultInvoice).equals(other$agentInvoiceDefaultInvoice)) {
            return false;
        }
        Boolean this$salesOrg = this.getSalesOrg();
        Boolean other$salesOrg = other.getSalesOrg();
        if (this$salesOrg == null ? other$salesOrg != null : !((Object)this$salesOrg).equals(other$salesOrg)) {
            return false;
        }
        Integer this$warningDay = this.getWarningDay();
        Integer other$warningDay = other.getWarningDay();
        if (this$warningDay == null ? other$warningDay != null : !((Object)this$warningDay).equals(other$warningDay)) {
            return false;
        }
        List<Long> this$orgIdList = this.getOrgIdList();
        List<Long> other$orgIdList = other.getOrgIdList();
        if (this$orgIdList == null ? other$orgIdList != null : !((Object)this$orgIdList).equals(other$orgIdList)) {
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
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts)) {
            return false;
        }
        List<Long> this$merchantApplyRangeIdList = this.getMerchantApplyRangeIdList();
        List<Long> other$merchantApplyRangeIdList = other.getMerchantApplyRangeIdList();
        if (this$merchantApplyRangeIdList == null ? other$merchantApplyRangeIdList != null : !((Object)this$merchantApplyRangeIdList).equals(other$merchantApplyRangeIdList)) {
            return false;
        }
        String this$agentInvoiceBdBillingType = this.getAgentInvoiceBdBillingType();
        String other$agentInvoiceBdBillingType = other.getAgentInvoiceBdBillingType();
        if (this$agentInvoiceBdBillingType == null ? other$agentInvoiceBdBillingType != null : !this$agentInvoiceBdBillingType.equals(other$agentInvoiceBdBillingType)) {
            return false;
        }
        String this$agentInvoiceTaxNo = this.getAgentInvoiceTaxNo();
        String other$agentInvoiceTaxNo = other.getAgentInvoiceTaxNo();
        if (this$agentInvoiceTaxNo == null ? other$agentInvoiceTaxNo != null : !this$agentInvoiceTaxNo.equals(other$agentInvoiceTaxNo)) {
            return false;
        }
        String this$fuzzyTaxNoAndName = this.getFuzzyTaxNoAndName();
        String other$fuzzyTaxNoAndName = other.getFuzzyTaxNoAndName();
        if (this$fuzzyTaxNoAndName == null ? other$fuzzyTaxNoAndName != null : !this$fuzzyTaxNoAndName.equals(other$fuzzyTaxNoAndName)) {
            return false;
        }
        String this$tradeCustomers = this.getTradeCustomers();
        String other$tradeCustomers = other.getTradeCustomers();
        if (this$tradeCustomers == null ? other$tradeCustomers != null : !this$tradeCustomers.equals(other$tradeCustomers)) {
            return false;
        }
        String this$businessRole = this.getBusinessRole();
        String other$businessRole = other.getBusinessRole();
        if (this$businessRole == null ? other$businessRole != null : !this$businessRole.equals(other$businessRole)) {
            return false;
        }
        List<String> this$funcTypeList = this.getFuncTypeList();
        List<String> other$funcTypeList = other.getFuncTypeList();
        if (this$funcTypeList == null ? other$funcTypeList != null : !((Object)this$funcTypeList).equals(other$funcTypeList)) {
            return false;
        }
        String this$potential = this.getPotential();
        String other$potential = other.getPotential();
        if (this$potential == null ? other$potential != null : !this$potential.equals(other$potential)) {
            return false;
        }
        String this$specialManagementDepCode = this.getSpecialManagementDepCode();
        String other$specialManagementDepCode = other.getSpecialManagementDepCode();
        if (this$specialManagementDepCode == null ? other$specialManagementDepCode != null : !this$specialManagementDepCode.equals(other$specialManagementDepCode)) {
            return false;
        }
        String this$professSalesmanCode = this.getProfessSalesmanCode();
        String other$professSalesmanCode = other.getProfessSalesmanCode();
        if (this$professSalesmanCode == null ? other$professSalesmanCode != null : !this$professSalesmanCode.equals(other$professSalesmanCode)) {
            return false;
        }
        String this$creatorName = this.getCreatorName();
        String other$creatorName = other.getCreatorName();
        if (this$creatorName == null ? other$creatorName != null : !this$creatorName.equals(other$creatorName)) {
            return false;
        }
        String this$isFinancialSynergy = this.getIsFinancialSynergy();
        String other$isFinancialSynergy = other.getIsFinancialSynergy();
        if (this$isFinancialSynergy == null ? other$isFinancialSynergy != null : !this$isFinancialSynergy.equals(other$isFinancialSynergy)) {
            return false;
        }
        String this$taxRateId = this.getTaxRateId();
        String other$taxRateId = other.getTaxRateId();
        return !(this$taxRateId == null ? other$taxRateId != null : !this$taxRateId.equals(other$taxRateId));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MerchantQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : ((Object)$orgId).hashCode());
        Boolean $detailStopStatus = this.getDetailStopStatus();
        result = result * 59 + ($detailStopStatus == null ? 43 : ((Object)$detailStopStatus).hashCode());
        Long $merchantApplyRangeId = this.getMerchantApplyRangeId();
        result = result * 59 + ($merchantApplyRangeId == null ? 43 : ((Object)$merchantApplyRangeId).hashCode());
        Boolean $creator = this.getCreator();
        result = result * 59 + ($creator == null ? 43 : ((Object)$creator).hashCode());
        Long $customerLevel = this.getCustomerLevel();
        result = result * 59 + ($customerLevel == null ? 43 : ((Object)$customerLevel).hashCode());
        Boolean $createOrg = this.getCreateOrg();
        result = result * 59 + ($createOrg == null ? 43 : ((Object)$createOrg).hashCode());
        Boolean $addressInfoDefault = this.getAddressInfoDefault();
        result = result * 59 + ($addressInfoDefault == null ? 43 : ((Object)$addressInfoDefault).hashCode());
        Boolean $contacterDefault = this.getContacterDefault();
        result = result * 59 + ($contacterDefault == null ? 43 : ((Object)$contacterDefault).hashCode());
        Integer $agentInvoiceBillingType = this.getAgentInvoiceBillingType();
        result = result * 59 + ($agentInvoiceBillingType == null ? 43 : ((Object)$agentInvoiceBillingType).hashCode());
        Boolean $agentInvoiceDefaultInvoice = this.getAgentInvoiceDefaultInvoice();
        result = result * 59 + ($agentInvoiceDefaultInvoice == null ? 43 : ((Object)$agentInvoiceDefaultInvoice).hashCode());
        Boolean $salesOrg = this.getSalesOrg();
        result = result * 59 + ($salesOrg == null ? 43 : ((Object)$salesOrg).hashCode());
        Integer $warningDay = this.getWarningDay();
        result = result * 59 + ($warningDay == null ? 43 : ((Object)$warningDay).hashCode());
        List<Long> $orgIdList = this.getOrgIdList();
        result = result * 59 + ($orgIdList == null ? 43 : ((Object)$orgIdList).hashCode());
        String $orgIdNew = this.getOrgIdNew();
        result = result * 59 + ($orgIdNew == null ? 43 : $orgIdNew.hashCode());
        List<String> $orgIdListNew = this.getOrgIdListNew();
        result = result * 59 + ($orgIdListNew == null ? 43 : ((Object)$orgIdListNew).hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        List<Long> $merchantApplyRangeIdList = this.getMerchantApplyRangeIdList();
        result = result * 59 + ($merchantApplyRangeIdList == null ? 43 : ((Object)$merchantApplyRangeIdList).hashCode());
        String $agentInvoiceBdBillingType = this.getAgentInvoiceBdBillingType();
        result = result * 59 + ($agentInvoiceBdBillingType == null ? 43 : $agentInvoiceBdBillingType.hashCode());
        String $agentInvoiceTaxNo = this.getAgentInvoiceTaxNo();
        result = result * 59 + ($agentInvoiceTaxNo == null ? 43 : $agentInvoiceTaxNo.hashCode());
        String $fuzzyTaxNoAndName = this.getFuzzyTaxNoAndName();
        result = result * 59 + ($fuzzyTaxNoAndName == null ? 43 : $fuzzyTaxNoAndName.hashCode());
        String $tradeCustomers = this.getTradeCustomers();
        result = result * 59 + ($tradeCustomers == null ? 43 : $tradeCustomers.hashCode());
        String $businessRole = this.getBusinessRole();
        result = result * 59 + ($businessRole == null ? 43 : $businessRole.hashCode());
        List<String> $funcTypeList = this.getFuncTypeList();
        result = result * 59 + ($funcTypeList == null ? 43 : ((Object)$funcTypeList).hashCode());
        String $potential = this.getPotential();
        result = result * 59 + ($potential == null ? 43 : $potential.hashCode());
        String $specialManagementDepCode = this.getSpecialManagementDepCode();
        result = result * 59 + ($specialManagementDepCode == null ? 43 : $specialManagementDepCode.hashCode());
        String $professSalesmanCode = this.getProfessSalesmanCode();
        result = result * 59 + ($professSalesmanCode == null ? 43 : $professSalesmanCode.hashCode());
        String $creatorName = this.getCreatorName();
        result = result * 59 + ($creatorName == null ? 43 : $creatorName.hashCode());
        String $isFinancialSynergy = this.getIsFinancialSynergy();
        result = result * 59 + ($isFinancialSynergy == null ? 43 : $isFinancialSynergy.hashCode());
        String $taxRateId = this.getTaxRateId();
        result = result * 59 + ($taxRateId == null ? 43 : $taxRateId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MerchantQryDTO(orgId=" + this.getOrgId() + ", orgIdList=" + this.getOrgIdList() + ", orgIdNew=" + this.getOrgIdNew() + ", orgIdListNew=" + this.getOrgIdListNew() + ", detailStopStatus=" + this.getDetailStopStatus() + ", pubts=" + this.getPubts() + ", merchantApplyRangeId=" + this.getMerchantApplyRangeId() + ", merchantApplyRangeIdList=" + this.getMerchantApplyRangeIdList() + ", creator=" + this.getCreator() + ", customerLevel=" + this.getCustomerLevel() + ", createOrg=" + this.getCreateOrg() + ", addressInfoDefault=" + this.getAddressInfoDefault() + ", contacterDefault=" + this.getContacterDefault() + ", agentInvoiceBillingType=" + this.getAgentInvoiceBillingType() + ", agentInvoiceBdBillingType=" + this.getAgentInvoiceBdBillingType() + ", agentInvoiceTaxNo=" + this.getAgentInvoiceTaxNo() + ", agentInvoiceDefaultInvoice=" + this.getAgentInvoiceDefaultInvoice() + ", fuzzyTaxNoAndName=" + this.getFuzzyTaxNoAndName() + ", tradeCustomers=" + this.getTradeCustomers() + ", businessRole=" + this.getBusinessRole() + ", funcTypeList=" + this.getFuncTypeList() + ", salesOrg=" + this.getSalesOrg() + ", potential=" + this.getPotential() + ", specialManagementDepCode=" + this.getSpecialManagementDepCode() + ", professSalesmanCode=" + this.getProfessSalesmanCode() + ", creatorName=" + this.getCreatorName() + ", warningDay=" + this.getWarningDay() + ", isFinancialSynergy=" + this.getIsFinancialSynergy() + ", taxRateId=" + this.getTaxRateId() + ")";
    }
}

