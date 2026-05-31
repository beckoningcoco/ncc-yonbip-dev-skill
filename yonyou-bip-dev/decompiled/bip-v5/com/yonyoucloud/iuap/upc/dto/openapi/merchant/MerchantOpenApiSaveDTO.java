/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.openapi.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantAddressOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantAgentFinancialOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantAgentInvoiceOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantApplyRangeDetailOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantApplyRangeOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantContactOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantCustomerAreaOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantInvoicingCustomerOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantManagerOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantPrincipalOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantRoleOpenApiSaveDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.iuap.upc.vo.UPCExtPropertiesVO;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantOpenApiSaveDTO
extends UPCExtPropertiesVO
implements Serializable {
    private Long id;
    public String code;
    public MultilingualVO name;
    private String createOrgId;
    private String createOrgCode;
    private String createOrgName;
    private String belongOrgId;
    private String belongOrgCode;
    private String belongOrgName;
    private String transTypeId;
    private String transTypeCode;
    private String transTypeName;
    private MultilingualVO shortname;
    private String countryId;
    private String countryName;
    private String countryCode;
    @Deprecated
    private String timeZoneId;
    @Deprecated
    private String timeZoneName;
    private String newTimeZone;
    private String languageId;
    private String languageCode;
    private String parentManageOrgId;
    private String parentManageOrgCode;
    private String parentManageOrgName;
    private Long parentCustomerId;
    private String parentCustomerCode;
    private String parentCustomerName;
    private Long suppliersId;
    private String suppliersCode;
    private String suppliersName;
    private Boolean retailInvestors;
    private Boolean internalOrg;
    private String internalOrgIdId;
    private String internalOrgIdCode;
    private String internalOrgIdName;
    private Long taxPayingCategories;
    private Long customerClassId;
    private String customerClassCode;
    private String customerClassName;
    private Long customerIndustryId;
    private String customerIndustryCode;
    private String customerIndustryName;
    private Long developmentPartnerId;
    private String developmentPartnerCode;
    private String developmentPartnerName;
    private Long enterpriseNature;
    private String enterpriseName;
    private String personName;
    private String orgName;
    private Long licenseType;
    private String creditCode;
    private String leaderName;
    private String leaderNameIdNo;
    private String personCharge;
    private String personChargeIdNo;
    private String businessLicenseNo;
    private String businessterm;
    private String buildTime;
    private String contactName;
    private String contactTel;
    private MultilingualVO address;
    private String regionCode;
    private String email;
    private String fax;
    private String enterNatureId;
    private String enterNatureCode;
    private String enterNatureName;
    private String currencyCode;
    private String money;
    private Long peopleNum;
    private Long scopeModel;
    private String yearMoney;
    private MultilingualVO scope;
    private String website;
    private String wid;
    private String postCode;
    private HashMap<String, Object> merchantCharacter;
    private List<MerchantAddressOpenApiSaveDTO> merchantAddressInfos;
    private List<MerchantContactOpenApiSaveDTO> merchantContactInfos;
    private List<MerchantAgentFinancialOpenApiSaveDTO> merchantAgentFinancialInfos;
    private List<MerchantAgentInvoiceOpenApiSaveDTO> merchantAgentInvoiceInfos;
    private List<MerchantApplyRangeOpenApiSaveDTO> merchantApplyRanges;
    private MerchantApplyRangeDetailOpenApiSaveDTO merchantAppliedDetail;
    private MerchantRoleOpenApiSaveDTO merchantRole;
    private MerchantManagerOpenApiSaveDTO merchantsManager;
    private List<MerchantCustomerAreaOpenApiSaveDTO> customerAreas;
    private List<MerchantPrincipalOpenApiSaveDTO> principals;
    private List<MerchantInvoicingCustomerOpenApiSaveDTO> invoicingCustomers;
    private Boolean blank;
    public Boolean stopStatus;
    private String pubts;
    private String createTime;
    private String modifyTime;
    private String creator;
    private String modifier;
    private BigDecimal longitude;
    private BigDecimal latitude;
    public String erpCode;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public MultilingualVO getName() {
        return this.name;
    }

    public String getCreateOrgId() {
        return this.createOrgId;
    }

    public String getCreateOrgCode() {
        return this.createOrgCode;
    }

    public String getCreateOrgName() {
        return this.createOrgName;
    }

    public String getBelongOrgId() {
        return this.belongOrgId;
    }

    public String getBelongOrgCode() {
        return this.belongOrgCode;
    }

    public String getBelongOrgName() {
        return this.belongOrgName;
    }

    public String getTransTypeId() {
        return this.transTypeId;
    }

    public String getTransTypeCode() {
        return this.transTypeCode;
    }

    public String getTransTypeName() {
        return this.transTypeName;
    }

    public MultilingualVO getShortname() {
        return this.shortname;
    }

    public String getCountryId() {
        return this.countryId;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    @Deprecated
    public String getTimeZoneId() {
        return this.timeZoneId;
    }

    @Deprecated
    public String getTimeZoneName() {
        return this.timeZoneName;
    }

    public String getNewTimeZone() {
        return this.newTimeZone;
    }

    public String getLanguageId() {
        return this.languageId;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public String getParentManageOrgId() {
        return this.parentManageOrgId;
    }

    public String getParentManageOrgCode() {
        return this.parentManageOrgCode;
    }

    public String getParentManageOrgName() {
        return this.parentManageOrgName;
    }

    public Long getParentCustomerId() {
        return this.parentCustomerId;
    }

    public String getParentCustomerCode() {
        return this.parentCustomerCode;
    }

    public String getParentCustomerName() {
        return this.parentCustomerName;
    }

    public Long getSuppliersId() {
        return this.suppliersId;
    }

    public String getSuppliersCode() {
        return this.suppliersCode;
    }

    public String getSuppliersName() {
        return this.suppliersName;
    }

    public Boolean getRetailInvestors() {
        return this.retailInvestors;
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

    public String getInternalOrgIdName() {
        return this.internalOrgIdName;
    }

    public Long getTaxPayingCategories() {
        return this.taxPayingCategories;
    }

    public Long getCustomerClassId() {
        return this.customerClassId;
    }

    public String getCustomerClassCode() {
        return this.customerClassCode;
    }

    public String getCustomerClassName() {
        return this.customerClassName;
    }

    public Long getCustomerIndustryId() {
        return this.customerIndustryId;
    }

    public String getCustomerIndustryCode() {
        return this.customerIndustryCode;
    }

    public String getCustomerIndustryName() {
        return this.customerIndustryName;
    }

    public Long getDevelopmentPartnerId() {
        return this.developmentPartnerId;
    }

    public String getDevelopmentPartnerCode() {
        return this.developmentPartnerCode;
    }

    public String getDevelopmentPartnerName() {
        return this.developmentPartnerName;
    }

    public Long getEnterpriseNature() {
        return this.enterpriseNature;
    }

    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public String getPersonName() {
        return this.personName;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public Long getLicenseType() {
        return this.licenseType;
    }

    public String getCreditCode() {
        return this.creditCode;
    }

    public String getLeaderName() {
        return this.leaderName;
    }

    public String getLeaderNameIdNo() {
        return this.leaderNameIdNo;
    }

    public String getPersonCharge() {
        return this.personCharge;
    }

    public String getPersonChargeIdNo() {
        return this.personChargeIdNo;
    }

    public String getBusinessLicenseNo() {
        return this.businessLicenseNo;
    }

    public String getBusinessterm() {
        return this.businessterm;
    }

    public String getBuildTime() {
        return this.buildTime;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactTel() {
        return this.contactTel;
    }

    public MultilingualVO getAddress() {
        return this.address;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFax() {
        return this.fax;
    }

    public String getEnterNatureId() {
        return this.enterNatureId;
    }

    public String getEnterNatureCode() {
        return this.enterNatureCode;
    }

    public String getEnterNatureName() {
        return this.enterNatureName;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getMoney() {
        return this.money;
    }

    public Long getPeopleNum() {
        return this.peopleNum;
    }

    public Long getScopeModel() {
        return this.scopeModel;
    }

    public String getYearMoney() {
        return this.yearMoney;
    }

    public MultilingualVO getScope() {
        return this.scope;
    }

    public String getWebsite() {
        return this.website;
    }

    public String getWid() {
        return this.wid;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public HashMap<String, Object> getMerchantCharacter() {
        return this.merchantCharacter;
    }

    public List<MerchantAddressOpenApiSaveDTO> getMerchantAddressInfos() {
        return this.merchantAddressInfos;
    }

    public List<MerchantContactOpenApiSaveDTO> getMerchantContactInfos() {
        return this.merchantContactInfos;
    }

    public List<MerchantAgentFinancialOpenApiSaveDTO> getMerchantAgentFinancialInfos() {
        return this.merchantAgentFinancialInfos;
    }

    public List<MerchantAgentInvoiceOpenApiSaveDTO> getMerchantAgentInvoiceInfos() {
        return this.merchantAgentInvoiceInfos;
    }

    public List<MerchantApplyRangeOpenApiSaveDTO> getMerchantApplyRanges() {
        return this.merchantApplyRanges;
    }

    public MerchantApplyRangeDetailOpenApiSaveDTO getMerchantAppliedDetail() {
        return this.merchantAppliedDetail;
    }

    public MerchantRoleOpenApiSaveDTO getMerchantRole() {
        return this.merchantRole;
    }

    public MerchantManagerOpenApiSaveDTO getMerchantsManager() {
        return this.merchantsManager;
    }

    public List<MerchantCustomerAreaOpenApiSaveDTO> getCustomerAreas() {
        return this.customerAreas;
    }

    public List<MerchantPrincipalOpenApiSaveDTO> getPrincipals() {
        return this.principals;
    }

    public List<MerchantInvoicingCustomerOpenApiSaveDTO> getInvoicingCustomers() {
        return this.invoicingCustomers;
    }

    public Boolean getBlank() {
        return this.blank;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public String getPubts() {
        return this.pubts;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public String getModifyTime() {
        return this.modifyTime;
    }

    public String getCreator() {
        return this.creator;
    }

    public String getModifier() {
        return this.modifier;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(MultilingualVO name) {
        this.name = name;
    }

    public void setCreateOrgId(String createOrgId) {
        this.createOrgId = createOrgId;
    }

    public void setCreateOrgCode(String createOrgCode) {
        this.createOrgCode = createOrgCode;
    }

    public void setCreateOrgName(String createOrgName) {
        this.createOrgName = createOrgName;
    }

    public void setBelongOrgId(String belongOrgId) {
        this.belongOrgId = belongOrgId;
    }

    public void setBelongOrgCode(String belongOrgCode) {
        this.belongOrgCode = belongOrgCode;
    }

    public void setBelongOrgName(String belongOrgName) {
        this.belongOrgName = belongOrgName;
    }

    public void setTransTypeId(String transTypeId) {
        this.transTypeId = transTypeId;
    }

    public void setTransTypeCode(String transTypeCode) {
        this.transTypeCode = transTypeCode;
    }

    public void setTransTypeName(String transTypeName) {
        this.transTypeName = transTypeName;
    }

    public void setShortname(MultilingualVO shortname) {
        this.shortname = shortname;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Deprecated
    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Deprecated
    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    public void setNewTimeZone(String newTimeZone) {
        this.newTimeZone = newTimeZone;
    }

    public void setLanguageId(String languageId) {
        this.languageId = languageId;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public void setParentManageOrgId(String parentManageOrgId) {
        this.parentManageOrgId = parentManageOrgId;
    }

    public void setParentManageOrgCode(String parentManageOrgCode) {
        this.parentManageOrgCode = parentManageOrgCode;
    }

    public void setParentManageOrgName(String parentManageOrgName) {
        this.parentManageOrgName = parentManageOrgName;
    }

    public void setParentCustomerId(Long parentCustomerId) {
        this.parentCustomerId = parentCustomerId;
    }

    public void setParentCustomerCode(String parentCustomerCode) {
        this.parentCustomerCode = parentCustomerCode;
    }

    public void setParentCustomerName(String parentCustomerName) {
        this.parentCustomerName = parentCustomerName;
    }

    public void setSuppliersId(Long suppliersId) {
        this.suppliersId = suppliersId;
    }

    public void setSuppliersCode(String suppliersCode) {
        this.suppliersCode = suppliersCode;
    }

    public void setSuppliersName(String suppliersName) {
        this.suppliersName = suppliersName;
    }

    public void setRetailInvestors(Boolean retailInvestors) {
        this.retailInvestors = retailInvestors;
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

    public void setInternalOrgIdName(String internalOrgIdName) {
        this.internalOrgIdName = internalOrgIdName;
    }

    public void setTaxPayingCategories(Long taxPayingCategories) {
        this.taxPayingCategories = taxPayingCategories;
    }

    public void setCustomerClassId(Long customerClassId) {
        this.customerClassId = customerClassId;
    }

    public void setCustomerClassCode(String customerClassCode) {
        this.customerClassCode = customerClassCode;
    }

    public void setCustomerClassName(String customerClassName) {
        this.customerClassName = customerClassName;
    }

    public void setCustomerIndustryId(Long customerIndustryId) {
        this.customerIndustryId = customerIndustryId;
    }

    public void setCustomerIndustryCode(String customerIndustryCode) {
        this.customerIndustryCode = customerIndustryCode;
    }

    public void setCustomerIndustryName(String customerIndustryName) {
        this.customerIndustryName = customerIndustryName;
    }

    public void setDevelopmentPartnerId(Long developmentPartnerId) {
        this.developmentPartnerId = developmentPartnerId;
    }

    public void setDevelopmentPartnerCode(String developmentPartnerCode) {
        this.developmentPartnerCode = developmentPartnerCode;
    }

    public void setDevelopmentPartnerName(String developmentPartnerName) {
        this.developmentPartnerName = developmentPartnerName;
    }

    public void setEnterpriseNature(Long enterpriseNature) {
        this.enterpriseNature = enterpriseNature;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setLicenseType(Long licenseType) {
        this.licenseType = licenseType;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public void setLeaderNameIdNo(String leaderNameIdNo) {
        this.leaderNameIdNo = leaderNameIdNo;
    }

    public void setPersonCharge(String personCharge) {
        this.personCharge = personCharge;
    }

    public void setPersonChargeIdNo(String personChargeIdNo) {
        this.personChargeIdNo = personChargeIdNo;
    }

    public void setBusinessLicenseNo(String businessLicenseNo) {
        this.businessLicenseNo = businessLicenseNo;
    }

    public void setBusinessterm(String businessterm) {
        this.businessterm = businessterm;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public void setAddress(MultilingualVO address) {
        this.address = address;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setEnterNatureId(String enterNatureId) {
        this.enterNatureId = enterNatureId;
    }

    public void setEnterNatureCode(String enterNatureCode) {
        this.enterNatureCode = enterNatureCode;
    }

    public void setEnterNatureName(String enterNatureName) {
        this.enterNatureName = enterNatureName;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void setPeopleNum(Long peopleNum) {
        this.peopleNum = peopleNum;
    }

    public void setScopeModel(Long scopeModel) {
        this.scopeModel = scopeModel;
    }

    public void setYearMoney(String yearMoney) {
        this.yearMoney = yearMoney;
    }

    public void setScope(MultilingualVO scope) {
        this.scope = scope;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setWid(String wid) {
        this.wid = wid;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setMerchantCharacter(HashMap<String, Object> merchantCharacter) {
        this.merchantCharacter = merchantCharacter;
    }

    public void setMerchantAddressInfos(List<MerchantAddressOpenApiSaveDTO> merchantAddressInfos) {
        this.merchantAddressInfos = merchantAddressInfos;
    }

    public void setMerchantContactInfos(List<MerchantContactOpenApiSaveDTO> merchantContactInfos) {
        this.merchantContactInfos = merchantContactInfos;
    }

    public void setMerchantAgentFinancialInfos(List<MerchantAgentFinancialOpenApiSaveDTO> merchantAgentFinancialInfos) {
        this.merchantAgentFinancialInfos = merchantAgentFinancialInfos;
    }

    public void setMerchantAgentInvoiceInfos(List<MerchantAgentInvoiceOpenApiSaveDTO> merchantAgentInvoiceInfos) {
        this.merchantAgentInvoiceInfos = merchantAgentInvoiceInfos;
    }

    public void setMerchantApplyRanges(List<MerchantApplyRangeOpenApiSaveDTO> merchantApplyRanges) {
        this.merchantApplyRanges = merchantApplyRanges;
    }

    public void setMerchantAppliedDetail(MerchantApplyRangeDetailOpenApiSaveDTO merchantAppliedDetail) {
        this.merchantAppliedDetail = merchantAppliedDetail;
    }

    public void setMerchantRole(MerchantRoleOpenApiSaveDTO merchantRole) {
        this.merchantRole = merchantRole;
    }

    public void setMerchantsManager(MerchantManagerOpenApiSaveDTO merchantsManager) {
        this.merchantsManager = merchantsManager;
    }

    public void setCustomerAreas(List<MerchantCustomerAreaOpenApiSaveDTO> customerAreas) {
        this.customerAreas = customerAreas;
    }

    public void setPrincipals(List<MerchantPrincipalOpenApiSaveDTO> principals) {
        this.principals = principals;
    }

    public void setInvoicingCustomers(List<MerchantInvoicingCustomerOpenApiSaveDTO> invoicingCustomers) {
        this.invoicingCustomers = invoicingCustomers;
    }

    public void setBlank(Boolean blank) {
        this.blank = blank;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setPubts(String pubts) {
        this.pubts = pubts;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantOpenApiSaveDTO)) {
            return false;
        }
        MerchantOpenApiSaveDTO other = (MerchantOpenApiSaveDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$parentCustomerId = this.getParentCustomerId();
        Long other$parentCustomerId = other.getParentCustomerId();
        if (this$parentCustomerId == null ? other$parentCustomerId != null : !((Object)this$parentCustomerId).equals(other$parentCustomerId)) {
            return false;
        }
        Long this$suppliersId = this.getSuppliersId();
        Long other$suppliersId = other.getSuppliersId();
        if (this$suppliersId == null ? other$suppliersId != null : !((Object)this$suppliersId).equals(other$suppliersId)) {
            return false;
        }
        Boolean this$retailInvestors = this.getRetailInvestors();
        Boolean other$retailInvestors = other.getRetailInvestors();
        if (this$retailInvestors == null ? other$retailInvestors != null : !((Object)this$retailInvestors).equals(other$retailInvestors)) {
            return false;
        }
        Boolean this$internalOrg = this.getInternalOrg();
        Boolean other$internalOrg = other.getInternalOrg();
        if (this$internalOrg == null ? other$internalOrg != null : !((Object)this$internalOrg).equals(other$internalOrg)) {
            return false;
        }
        Long this$taxPayingCategories = this.getTaxPayingCategories();
        Long other$taxPayingCategories = other.getTaxPayingCategories();
        if (this$taxPayingCategories == null ? other$taxPayingCategories != null : !((Object)this$taxPayingCategories).equals(other$taxPayingCategories)) {
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
        Long this$developmentPartnerId = this.getDevelopmentPartnerId();
        Long other$developmentPartnerId = other.getDevelopmentPartnerId();
        if (this$developmentPartnerId == null ? other$developmentPartnerId != null : !((Object)this$developmentPartnerId).equals(other$developmentPartnerId)) {
            return false;
        }
        Long this$enterpriseNature = this.getEnterpriseNature();
        Long other$enterpriseNature = other.getEnterpriseNature();
        if (this$enterpriseNature == null ? other$enterpriseNature != null : !((Object)this$enterpriseNature).equals(other$enterpriseNature)) {
            return false;
        }
        Long this$licenseType = this.getLicenseType();
        Long other$licenseType = other.getLicenseType();
        if (this$licenseType == null ? other$licenseType != null : !((Object)this$licenseType).equals(other$licenseType)) {
            return false;
        }
        Long this$peopleNum = this.getPeopleNum();
        Long other$peopleNum = other.getPeopleNum();
        if (this$peopleNum == null ? other$peopleNum != null : !((Object)this$peopleNum).equals(other$peopleNum)) {
            return false;
        }
        Long this$scopeModel = this.getScopeModel();
        Long other$scopeModel = other.getScopeModel();
        if (this$scopeModel == null ? other$scopeModel != null : !((Object)this$scopeModel).equals(other$scopeModel)) {
            return false;
        }
        Boolean this$blank = this.getBlank();
        Boolean other$blank = other.getBlank();
        if (this$blank == null ? other$blank != null : !((Object)this$blank).equals(other$blank)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        MultilingualVO this$name = this.getName();
        MultilingualVO other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
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
        String this$createOrgName = this.getCreateOrgName();
        String other$createOrgName = other.getCreateOrgName();
        if (this$createOrgName == null ? other$createOrgName != null : !this$createOrgName.equals(other$createOrgName)) {
            return false;
        }
        String this$belongOrgId = this.getBelongOrgId();
        String other$belongOrgId = other.getBelongOrgId();
        if (this$belongOrgId == null ? other$belongOrgId != null : !this$belongOrgId.equals(other$belongOrgId)) {
            return false;
        }
        String this$belongOrgCode = this.getBelongOrgCode();
        String other$belongOrgCode = other.getBelongOrgCode();
        if (this$belongOrgCode == null ? other$belongOrgCode != null : !this$belongOrgCode.equals(other$belongOrgCode)) {
            return false;
        }
        String this$belongOrgName = this.getBelongOrgName();
        String other$belongOrgName = other.getBelongOrgName();
        if (this$belongOrgName == null ? other$belongOrgName != null : !this$belongOrgName.equals(other$belongOrgName)) {
            return false;
        }
        String this$transTypeId = this.getTransTypeId();
        String other$transTypeId = other.getTransTypeId();
        if (this$transTypeId == null ? other$transTypeId != null : !this$transTypeId.equals(other$transTypeId)) {
            return false;
        }
        String this$transTypeCode = this.getTransTypeCode();
        String other$transTypeCode = other.getTransTypeCode();
        if (this$transTypeCode == null ? other$transTypeCode != null : !this$transTypeCode.equals(other$transTypeCode)) {
            return false;
        }
        String this$transTypeName = this.getTransTypeName();
        String other$transTypeName = other.getTransTypeName();
        if (this$transTypeName == null ? other$transTypeName != null : !this$transTypeName.equals(other$transTypeName)) {
            return false;
        }
        MultilingualVO this$shortname = this.getShortname();
        MultilingualVO other$shortname = other.getShortname();
        if (this$shortname == null ? other$shortname != null : !((Object)this$shortname).equals(other$shortname)) {
            return false;
        }
        String this$countryId = this.getCountryId();
        String other$countryId = other.getCountryId();
        if (this$countryId == null ? other$countryId != null : !this$countryId.equals(other$countryId)) {
            return false;
        }
        String this$countryName = this.getCountryName();
        String other$countryName = other.getCountryName();
        if (this$countryName == null ? other$countryName != null : !this$countryName.equals(other$countryName)) {
            return false;
        }
        String this$countryCode = this.getCountryCode();
        String other$countryCode = other.getCountryCode();
        if (this$countryCode == null ? other$countryCode != null : !this$countryCode.equals(other$countryCode)) {
            return false;
        }
        String this$timeZoneId = this.getTimeZoneId();
        String other$timeZoneId = other.getTimeZoneId();
        if (this$timeZoneId == null ? other$timeZoneId != null : !this$timeZoneId.equals(other$timeZoneId)) {
            return false;
        }
        String this$timeZoneName = this.getTimeZoneName();
        String other$timeZoneName = other.getTimeZoneName();
        if (this$timeZoneName == null ? other$timeZoneName != null : !this$timeZoneName.equals(other$timeZoneName)) {
            return false;
        }
        String this$newTimeZone = this.getNewTimeZone();
        String other$newTimeZone = other.getNewTimeZone();
        if (this$newTimeZone == null ? other$newTimeZone != null : !this$newTimeZone.equals(other$newTimeZone)) {
            return false;
        }
        String this$languageId = this.getLanguageId();
        String other$languageId = other.getLanguageId();
        if (this$languageId == null ? other$languageId != null : !this$languageId.equals(other$languageId)) {
            return false;
        }
        String this$languageCode = this.getLanguageCode();
        String other$languageCode = other.getLanguageCode();
        if (this$languageCode == null ? other$languageCode != null : !this$languageCode.equals(other$languageCode)) {
            return false;
        }
        String this$parentManageOrgId = this.getParentManageOrgId();
        String other$parentManageOrgId = other.getParentManageOrgId();
        if (this$parentManageOrgId == null ? other$parentManageOrgId != null : !this$parentManageOrgId.equals(other$parentManageOrgId)) {
            return false;
        }
        String this$parentManageOrgCode = this.getParentManageOrgCode();
        String other$parentManageOrgCode = other.getParentManageOrgCode();
        if (this$parentManageOrgCode == null ? other$parentManageOrgCode != null : !this$parentManageOrgCode.equals(other$parentManageOrgCode)) {
            return false;
        }
        String this$parentManageOrgName = this.getParentManageOrgName();
        String other$parentManageOrgName = other.getParentManageOrgName();
        if (this$parentManageOrgName == null ? other$parentManageOrgName != null : !this$parentManageOrgName.equals(other$parentManageOrgName)) {
            return false;
        }
        String this$parentCustomerCode = this.getParentCustomerCode();
        String other$parentCustomerCode = other.getParentCustomerCode();
        if (this$parentCustomerCode == null ? other$parentCustomerCode != null : !this$parentCustomerCode.equals(other$parentCustomerCode)) {
            return false;
        }
        String this$parentCustomerName = this.getParentCustomerName();
        String other$parentCustomerName = other.getParentCustomerName();
        if (this$parentCustomerName == null ? other$parentCustomerName != null : !this$parentCustomerName.equals(other$parentCustomerName)) {
            return false;
        }
        String this$suppliersCode = this.getSuppliersCode();
        String other$suppliersCode = other.getSuppliersCode();
        if (this$suppliersCode == null ? other$suppliersCode != null : !this$suppliersCode.equals(other$suppliersCode)) {
            return false;
        }
        String this$suppliersName = this.getSuppliersName();
        String other$suppliersName = other.getSuppliersName();
        if (this$suppliersName == null ? other$suppliersName != null : !this$suppliersName.equals(other$suppliersName)) {
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
        String this$internalOrgIdName = this.getInternalOrgIdName();
        String other$internalOrgIdName = other.getInternalOrgIdName();
        if (this$internalOrgIdName == null ? other$internalOrgIdName != null : !this$internalOrgIdName.equals(other$internalOrgIdName)) {
            return false;
        }
        String this$customerClassCode = this.getCustomerClassCode();
        String other$customerClassCode = other.getCustomerClassCode();
        if (this$customerClassCode == null ? other$customerClassCode != null : !this$customerClassCode.equals(other$customerClassCode)) {
            return false;
        }
        String this$customerClassName = this.getCustomerClassName();
        String other$customerClassName = other.getCustomerClassName();
        if (this$customerClassName == null ? other$customerClassName != null : !this$customerClassName.equals(other$customerClassName)) {
            return false;
        }
        String this$customerIndustryCode = this.getCustomerIndustryCode();
        String other$customerIndustryCode = other.getCustomerIndustryCode();
        if (this$customerIndustryCode == null ? other$customerIndustryCode != null : !this$customerIndustryCode.equals(other$customerIndustryCode)) {
            return false;
        }
        String this$customerIndustryName = this.getCustomerIndustryName();
        String other$customerIndustryName = other.getCustomerIndustryName();
        if (this$customerIndustryName == null ? other$customerIndustryName != null : !this$customerIndustryName.equals(other$customerIndustryName)) {
            return false;
        }
        String this$developmentPartnerCode = this.getDevelopmentPartnerCode();
        String other$developmentPartnerCode = other.getDevelopmentPartnerCode();
        if (this$developmentPartnerCode == null ? other$developmentPartnerCode != null : !this$developmentPartnerCode.equals(other$developmentPartnerCode)) {
            return false;
        }
        String this$developmentPartnerName = this.getDevelopmentPartnerName();
        String other$developmentPartnerName = other.getDevelopmentPartnerName();
        if (this$developmentPartnerName == null ? other$developmentPartnerName != null : !this$developmentPartnerName.equals(other$developmentPartnerName)) {
            return false;
        }
        String this$enterpriseName = this.getEnterpriseName();
        String other$enterpriseName = other.getEnterpriseName();
        if (this$enterpriseName == null ? other$enterpriseName != null : !this$enterpriseName.equals(other$enterpriseName)) {
            return false;
        }
        String this$personName = this.getPersonName();
        String other$personName = other.getPersonName();
        if (this$personName == null ? other$personName != null : !this$personName.equals(other$personName)) {
            return false;
        }
        String this$orgName = this.getOrgName();
        String other$orgName = other.getOrgName();
        if (this$orgName == null ? other$orgName != null : !this$orgName.equals(other$orgName)) {
            return false;
        }
        String this$creditCode = this.getCreditCode();
        String other$creditCode = other.getCreditCode();
        if (this$creditCode == null ? other$creditCode != null : !this$creditCode.equals(other$creditCode)) {
            return false;
        }
        String this$leaderName = this.getLeaderName();
        String other$leaderName = other.getLeaderName();
        if (this$leaderName == null ? other$leaderName != null : !this$leaderName.equals(other$leaderName)) {
            return false;
        }
        String this$leaderNameIdNo = this.getLeaderNameIdNo();
        String other$leaderNameIdNo = other.getLeaderNameIdNo();
        if (this$leaderNameIdNo == null ? other$leaderNameIdNo != null : !this$leaderNameIdNo.equals(other$leaderNameIdNo)) {
            return false;
        }
        String this$personCharge = this.getPersonCharge();
        String other$personCharge = other.getPersonCharge();
        if (this$personCharge == null ? other$personCharge != null : !this$personCharge.equals(other$personCharge)) {
            return false;
        }
        String this$personChargeIdNo = this.getPersonChargeIdNo();
        String other$personChargeIdNo = other.getPersonChargeIdNo();
        if (this$personChargeIdNo == null ? other$personChargeIdNo != null : !this$personChargeIdNo.equals(other$personChargeIdNo)) {
            return false;
        }
        String this$businessLicenseNo = this.getBusinessLicenseNo();
        String other$businessLicenseNo = other.getBusinessLicenseNo();
        if (this$businessLicenseNo == null ? other$businessLicenseNo != null : !this$businessLicenseNo.equals(other$businessLicenseNo)) {
            return false;
        }
        String this$businessterm = this.getBusinessterm();
        String other$businessterm = other.getBusinessterm();
        if (this$businessterm == null ? other$businessterm != null : !this$businessterm.equals(other$businessterm)) {
            return false;
        }
        String this$buildTime = this.getBuildTime();
        String other$buildTime = other.getBuildTime();
        if (this$buildTime == null ? other$buildTime != null : !this$buildTime.equals(other$buildTime)) {
            return false;
        }
        String this$contactName = this.getContactName();
        String other$contactName = other.getContactName();
        if (this$contactName == null ? other$contactName != null : !this$contactName.equals(other$contactName)) {
            return false;
        }
        String this$contactTel = this.getContactTel();
        String other$contactTel = other.getContactTel();
        if (this$contactTel == null ? other$contactTel != null : !this$contactTel.equals(other$contactTel)) {
            return false;
        }
        MultilingualVO this$address = this.getAddress();
        MultilingualVO other$address = other.getAddress();
        if (this$address == null ? other$address != null : !((Object)this$address).equals(other$address)) {
            return false;
        }
        String this$regionCode = this.getRegionCode();
        String other$regionCode = other.getRegionCode();
        if (this$regionCode == null ? other$regionCode != null : !this$regionCode.equals(other$regionCode)) {
            return false;
        }
        String this$email = this.getEmail();
        String other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) {
            return false;
        }
        String this$fax = this.getFax();
        String other$fax = other.getFax();
        if (this$fax == null ? other$fax != null : !this$fax.equals(other$fax)) {
            return false;
        }
        String this$enterNatureId = this.getEnterNatureId();
        String other$enterNatureId = other.getEnterNatureId();
        if (this$enterNatureId == null ? other$enterNatureId != null : !this$enterNatureId.equals(other$enterNatureId)) {
            return false;
        }
        String this$enterNatureCode = this.getEnterNatureCode();
        String other$enterNatureCode = other.getEnterNatureCode();
        if (this$enterNatureCode == null ? other$enterNatureCode != null : !this$enterNatureCode.equals(other$enterNatureCode)) {
            return false;
        }
        String this$enterNatureName = this.getEnterNatureName();
        String other$enterNatureName = other.getEnterNatureName();
        if (this$enterNatureName == null ? other$enterNatureName != null : !this$enterNatureName.equals(other$enterNatureName)) {
            return false;
        }
        String this$currencyCode = this.getCurrencyCode();
        String other$currencyCode = other.getCurrencyCode();
        if (this$currencyCode == null ? other$currencyCode != null : !this$currencyCode.equals(other$currencyCode)) {
            return false;
        }
        String this$money = this.getMoney();
        String other$money = other.getMoney();
        if (this$money == null ? other$money != null : !this$money.equals(other$money)) {
            return false;
        }
        String this$yearMoney = this.getYearMoney();
        String other$yearMoney = other.getYearMoney();
        if (this$yearMoney == null ? other$yearMoney != null : !this$yearMoney.equals(other$yearMoney)) {
            return false;
        }
        MultilingualVO this$scope = this.getScope();
        MultilingualVO other$scope = other.getScope();
        if (this$scope == null ? other$scope != null : !((Object)this$scope).equals(other$scope)) {
            return false;
        }
        String this$website = this.getWebsite();
        String other$website = other.getWebsite();
        if (this$website == null ? other$website != null : !this$website.equals(other$website)) {
            return false;
        }
        String this$wid = this.getWid();
        String other$wid = other.getWid();
        if (this$wid == null ? other$wid != null : !this$wid.equals(other$wid)) {
            return false;
        }
        String this$postCode = this.getPostCode();
        String other$postCode = other.getPostCode();
        if (this$postCode == null ? other$postCode != null : !this$postCode.equals(other$postCode)) {
            return false;
        }
        HashMap<String, Object> this$merchantCharacter = this.getMerchantCharacter();
        HashMap<String, Object> other$merchantCharacter = other.getMerchantCharacter();
        if (this$merchantCharacter == null ? other$merchantCharacter != null : !((Object)this$merchantCharacter).equals(other$merchantCharacter)) {
            return false;
        }
        List<MerchantAddressOpenApiSaveDTO> this$merchantAddressInfos = this.getMerchantAddressInfos();
        List<MerchantAddressOpenApiSaveDTO> other$merchantAddressInfos = other.getMerchantAddressInfos();
        if (this$merchantAddressInfos == null ? other$merchantAddressInfos != null : !((Object)this$merchantAddressInfos).equals(other$merchantAddressInfos)) {
            return false;
        }
        List<MerchantContactOpenApiSaveDTO> this$merchantContactInfos = this.getMerchantContactInfos();
        List<MerchantContactOpenApiSaveDTO> other$merchantContactInfos = other.getMerchantContactInfos();
        if (this$merchantContactInfos == null ? other$merchantContactInfos != null : !((Object)this$merchantContactInfos).equals(other$merchantContactInfos)) {
            return false;
        }
        List<MerchantAgentFinancialOpenApiSaveDTO> this$merchantAgentFinancialInfos = this.getMerchantAgentFinancialInfos();
        List<MerchantAgentFinancialOpenApiSaveDTO> other$merchantAgentFinancialInfos = other.getMerchantAgentFinancialInfos();
        if (this$merchantAgentFinancialInfos == null ? other$merchantAgentFinancialInfos != null : !((Object)this$merchantAgentFinancialInfos).equals(other$merchantAgentFinancialInfos)) {
            return false;
        }
        List<MerchantAgentInvoiceOpenApiSaveDTO> this$merchantAgentInvoiceInfos = this.getMerchantAgentInvoiceInfos();
        List<MerchantAgentInvoiceOpenApiSaveDTO> other$merchantAgentInvoiceInfos = other.getMerchantAgentInvoiceInfos();
        if (this$merchantAgentInvoiceInfos == null ? other$merchantAgentInvoiceInfos != null : !((Object)this$merchantAgentInvoiceInfos).equals(other$merchantAgentInvoiceInfos)) {
            return false;
        }
        List<MerchantApplyRangeOpenApiSaveDTO> this$merchantApplyRanges = this.getMerchantApplyRanges();
        List<MerchantApplyRangeOpenApiSaveDTO> other$merchantApplyRanges = other.getMerchantApplyRanges();
        if (this$merchantApplyRanges == null ? other$merchantApplyRanges != null : !((Object)this$merchantApplyRanges).equals(other$merchantApplyRanges)) {
            return false;
        }
        MerchantApplyRangeDetailOpenApiSaveDTO this$merchantAppliedDetail = this.getMerchantAppliedDetail();
        MerchantApplyRangeDetailOpenApiSaveDTO other$merchantAppliedDetail = other.getMerchantAppliedDetail();
        if (this$merchantAppliedDetail == null ? other$merchantAppliedDetail != null : !((Object)this$merchantAppliedDetail).equals(other$merchantAppliedDetail)) {
            return false;
        }
        MerchantRoleOpenApiSaveDTO this$merchantRole = this.getMerchantRole();
        MerchantRoleOpenApiSaveDTO other$merchantRole = other.getMerchantRole();
        if (this$merchantRole == null ? other$merchantRole != null : !((Object)this$merchantRole).equals(other$merchantRole)) {
            return false;
        }
        MerchantManagerOpenApiSaveDTO this$merchantsManager = this.getMerchantsManager();
        MerchantManagerOpenApiSaveDTO other$merchantsManager = other.getMerchantsManager();
        if (this$merchantsManager == null ? other$merchantsManager != null : !((Object)this$merchantsManager).equals(other$merchantsManager)) {
            return false;
        }
        List<MerchantCustomerAreaOpenApiSaveDTO> this$customerAreas = this.getCustomerAreas();
        List<MerchantCustomerAreaOpenApiSaveDTO> other$customerAreas = other.getCustomerAreas();
        if (this$customerAreas == null ? other$customerAreas != null : !((Object)this$customerAreas).equals(other$customerAreas)) {
            return false;
        }
        List<MerchantPrincipalOpenApiSaveDTO> this$principals = this.getPrincipals();
        List<MerchantPrincipalOpenApiSaveDTO> other$principals = other.getPrincipals();
        if (this$principals == null ? other$principals != null : !((Object)this$principals).equals(other$principals)) {
            return false;
        }
        List<MerchantInvoicingCustomerOpenApiSaveDTO> this$invoicingCustomers = this.getInvoicingCustomers();
        List<MerchantInvoicingCustomerOpenApiSaveDTO> other$invoicingCustomers = other.getInvoicingCustomers();
        if (this$invoicingCustomers == null ? other$invoicingCustomers != null : !((Object)this$invoicingCustomers).equals(other$invoicingCustomers)) {
            return false;
        }
        String this$pubts = this.getPubts();
        String other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !this$pubts.equals(other$pubts)) {
            return false;
        }
        String this$createTime = this.getCreateTime();
        String other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !this$createTime.equals(other$createTime)) {
            return false;
        }
        String this$modifyTime = this.getModifyTime();
        String other$modifyTime = other.getModifyTime();
        if (this$modifyTime == null ? other$modifyTime != null : !this$modifyTime.equals(other$modifyTime)) {
            return false;
        }
        String this$creator = this.getCreator();
        String other$creator = other.getCreator();
        if (this$creator == null ? other$creator != null : !this$creator.equals(other$creator)) {
            return false;
        }
        String this$modifier = this.getModifier();
        String other$modifier = other.getModifier();
        if (this$modifier == null ? other$modifier != null : !this$modifier.equals(other$modifier)) {
            return false;
        }
        BigDecimal this$longitude = this.getLongitude();
        BigDecimal other$longitude = other.getLongitude();
        if (this$longitude == null ? other$longitude != null : !((Object)this$longitude).equals(other$longitude)) {
            return false;
        }
        BigDecimal this$latitude = this.getLatitude();
        BigDecimal other$latitude = other.getLatitude();
        if (this$latitude == null ? other$latitude != null : !((Object)this$latitude).equals(other$latitude)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        return !(this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MerchantOpenApiSaveDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $parentCustomerId = this.getParentCustomerId();
        result = result * 59 + ($parentCustomerId == null ? 43 : ((Object)$parentCustomerId).hashCode());
        Long $suppliersId = this.getSuppliersId();
        result = result * 59 + ($suppliersId == null ? 43 : ((Object)$suppliersId).hashCode());
        Boolean $retailInvestors = this.getRetailInvestors();
        result = result * 59 + ($retailInvestors == null ? 43 : ((Object)$retailInvestors).hashCode());
        Boolean $internalOrg = this.getInternalOrg();
        result = result * 59 + ($internalOrg == null ? 43 : ((Object)$internalOrg).hashCode());
        Long $taxPayingCategories = this.getTaxPayingCategories();
        result = result * 59 + ($taxPayingCategories == null ? 43 : ((Object)$taxPayingCategories).hashCode());
        Long $customerClassId = this.getCustomerClassId();
        result = result * 59 + ($customerClassId == null ? 43 : ((Object)$customerClassId).hashCode());
        Long $customerIndustryId = this.getCustomerIndustryId();
        result = result * 59 + ($customerIndustryId == null ? 43 : ((Object)$customerIndustryId).hashCode());
        Long $developmentPartnerId = this.getDevelopmentPartnerId();
        result = result * 59 + ($developmentPartnerId == null ? 43 : ((Object)$developmentPartnerId).hashCode());
        Long $enterpriseNature = this.getEnterpriseNature();
        result = result * 59 + ($enterpriseNature == null ? 43 : ((Object)$enterpriseNature).hashCode());
        Long $licenseType = this.getLicenseType();
        result = result * 59 + ($licenseType == null ? 43 : ((Object)$licenseType).hashCode());
        Long $peopleNum = this.getPeopleNum();
        result = result * 59 + ($peopleNum == null ? 43 : ((Object)$peopleNum).hashCode());
        Long $scopeModel = this.getScopeModel();
        result = result * 59 + ($scopeModel == null ? 43 : ((Object)$scopeModel).hashCode());
        Boolean $blank = this.getBlank();
        result = result * 59 + ($blank == null ? 43 : ((Object)$blank).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $createOrgId = this.getCreateOrgId();
        result = result * 59 + ($createOrgId == null ? 43 : $createOrgId.hashCode());
        String $createOrgCode = this.getCreateOrgCode();
        result = result * 59 + ($createOrgCode == null ? 43 : $createOrgCode.hashCode());
        String $createOrgName = this.getCreateOrgName();
        result = result * 59 + ($createOrgName == null ? 43 : $createOrgName.hashCode());
        String $belongOrgId = this.getBelongOrgId();
        result = result * 59 + ($belongOrgId == null ? 43 : $belongOrgId.hashCode());
        String $belongOrgCode = this.getBelongOrgCode();
        result = result * 59 + ($belongOrgCode == null ? 43 : $belongOrgCode.hashCode());
        String $belongOrgName = this.getBelongOrgName();
        result = result * 59 + ($belongOrgName == null ? 43 : $belongOrgName.hashCode());
        String $transTypeId = this.getTransTypeId();
        result = result * 59 + ($transTypeId == null ? 43 : $transTypeId.hashCode());
        String $transTypeCode = this.getTransTypeCode();
        result = result * 59 + ($transTypeCode == null ? 43 : $transTypeCode.hashCode());
        String $transTypeName = this.getTransTypeName();
        result = result * 59 + ($transTypeName == null ? 43 : $transTypeName.hashCode());
        MultilingualVO $shortname = this.getShortname();
        result = result * 59 + ($shortname == null ? 43 : $shortname.hashCode());
        String $countryId = this.getCountryId();
        result = result * 59 + ($countryId == null ? 43 : $countryId.hashCode());
        String $countryName = this.getCountryName();
        result = result * 59 + ($countryName == null ? 43 : $countryName.hashCode());
        String $countryCode = this.getCountryCode();
        result = result * 59 + ($countryCode == null ? 43 : $countryCode.hashCode());
        String $timeZoneId = this.getTimeZoneId();
        result = result * 59 + ($timeZoneId == null ? 43 : $timeZoneId.hashCode());
        String $timeZoneName = this.getTimeZoneName();
        result = result * 59 + ($timeZoneName == null ? 43 : $timeZoneName.hashCode());
        String $newTimeZone = this.getNewTimeZone();
        result = result * 59 + ($newTimeZone == null ? 43 : $newTimeZone.hashCode());
        String $languageId = this.getLanguageId();
        result = result * 59 + ($languageId == null ? 43 : $languageId.hashCode());
        String $languageCode = this.getLanguageCode();
        result = result * 59 + ($languageCode == null ? 43 : $languageCode.hashCode());
        String $parentManageOrgId = this.getParentManageOrgId();
        result = result * 59 + ($parentManageOrgId == null ? 43 : $parentManageOrgId.hashCode());
        String $parentManageOrgCode = this.getParentManageOrgCode();
        result = result * 59 + ($parentManageOrgCode == null ? 43 : $parentManageOrgCode.hashCode());
        String $parentManageOrgName = this.getParentManageOrgName();
        result = result * 59 + ($parentManageOrgName == null ? 43 : $parentManageOrgName.hashCode());
        String $parentCustomerCode = this.getParentCustomerCode();
        result = result * 59 + ($parentCustomerCode == null ? 43 : $parentCustomerCode.hashCode());
        String $parentCustomerName = this.getParentCustomerName();
        result = result * 59 + ($parentCustomerName == null ? 43 : $parentCustomerName.hashCode());
        String $suppliersCode = this.getSuppliersCode();
        result = result * 59 + ($suppliersCode == null ? 43 : $suppliersCode.hashCode());
        String $suppliersName = this.getSuppliersName();
        result = result * 59 + ($suppliersName == null ? 43 : $suppliersName.hashCode());
        String $internalOrgIdId = this.getInternalOrgIdId();
        result = result * 59 + ($internalOrgIdId == null ? 43 : $internalOrgIdId.hashCode());
        String $internalOrgIdCode = this.getInternalOrgIdCode();
        result = result * 59 + ($internalOrgIdCode == null ? 43 : $internalOrgIdCode.hashCode());
        String $internalOrgIdName = this.getInternalOrgIdName();
        result = result * 59 + ($internalOrgIdName == null ? 43 : $internalOrgIdName.hashCode());
        String $customerClassCode = this.getCustomerClassCode();
        result = result * 59 + ($customerClassCode == null ? 43 : $customerClassCode.hashCode());
        String $customerClassName = this.getCustomerClassName();
        result = result * 59 + ($customerClassName == null ? 43 : $customerClassName.hashCode());
        String $customerIndustryCode = this.getCustomerIndustryCode();
        result = result * 59 + ($customerIndustryCode == null ? 43 : $customerIndustryCode.hashCode());
        String $customerIndustryName = this.getCustomerIndustryName();
        result = result * 59 + ($customerIndustryName == null ? 43 : $customerIndustryName.hashCode());
        String $developmentPartnerCode = this.getDevelopmentPartnerCode();
        result = result * 59 + ($developmentPartnerCode == null ? 43 : $developmentPartnerCode.hashCode());
        String $developmentPartnerName = this.getDevelopmentPartnerName();
        result = result * 59 + ($developmentPartnerName == null ? 43 : $developmentPartnerName.hashCode());
        String $enterpriseName = this.getEnterpriseName();
        result = result * 59 + ($enterpriseName == null ? 43 : $enterpriseName.hashCode());
        String $personName = this.getPersonName();
        result = result * 59 + ($personName == null ? 43 : $personName.hashCode());
        String $orgName = this.getOrgName();
        result = result * 59 + ($orgName == null ? 43 : $orgName.hashCode());
        String $creditCode = this.getCreditCode();
        result = result * 59 + ($creditCode == null ? 43 : $creditCode.hashCode());
        String $leaderName = this.getLeaderName();
        result = result * 59 + ($leaderName == null ? 43 : $leaderName.hashCode());
        String $leaderNameIdNo = this.getLeaderNameIdNo();
        result = result * 59 + ($leaderNameIdNo == null ? 43 : $leaderNameIdNo.hashCode());
        String $personCharge = this.getPersonCharge();
        result = result * 59 + ($personCharge == null ? 43 : $personCharge.hashCode());
        String $personChargeIdNo = this.getPersonChargeIdNo();
        result = result * 59 + ($personChargeIdNo == null ? 43 : $personChargeIdNo.hashCode());
        String $businessLicenseNo = this.getBusinessLicenseNo();
        result = result * 59 + ($businessLicenseNo == null ? 43 : $businessLicenseNo.hashCode());
        String $businessterm = this.getBusinessterm();
        result = result * 59 + ($businessterm == null ? 43 : $businessterm.hashCode());
        String $buildTime = this.getBuildTime();
        result = result * 59 + ($buildTime == null ? 43 : $buildTime.hashCode());
        String $contactName = this.getContactName();
        result = result * 59 + ($contactName == null ? 43 : $contactName.hashCode());
        String $contactTel = this.getContactTel();
        result = result * 59 + ($contactTel == null ? 43 : $contactTel.hashCode());
        MultilingualVO $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        String $regionCode = this.getRegionCode();
        result = result * 59 + ($regionCode == null ? 43 : $regionCode.hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        String $fax = this.getFax();
        result = result * 59 + ($fax == null ? 43 : $fax.hashCode());
        String $enterNatureId = this.getEnterNatureId();
        result = result * 59 + ($enterNatureId == null ? 43 : $enterNatureId.hashCode());
        String $enterNatureCode = this.getEnterNatureCode();
        result = result * 59 + ($enterNatureCode == null ? 43 : $enterNatureCode.hashCode());
        String $enterNatureName = this.getEnterNatureName();
        result = result * 59 + ($enterNatureName == null ? 43 : $enterNatureName.hashCode());
        String $currencyCode = this.getCurrencyCode();
        result = result * 59 + ($currencyCode == null ? 43 : $currencyCode.hashCode());
        String $money = this.getMoney();
        result = result * 59 + ($money == null ? 43 : $money.hashCode());
        String $yearMoney = this.getYearMoney();
        result = result * 59 + ($yearMoney == null ? 43 : $yearMoney.hashCode());
        MultilingualVO $scope = this.getScope();
        result = result * 59 + ($scope == null ? 43 : $scope.hashCode());
        String $website = this.getWebsite();
        result = result * 59 + ($website == null ? 43 : $website.hashCode());
        String $wid = this.getWid();
        result = result * 59 + ($wid == null ? 43 : $wid.hashCode());
        String $postCode = this.getPostCode();
        result = result * 59 + ($postCode == null ? 43 : $postCode.hashCode());
        HashMap<String, Object> $merchantCharacter = this.getMerchantCharacter();
        result = result * 59 + ($merchantCharacter == null ? 43 : ((Object)$merchantCharacter).hashCode());
        List<MerchantAddressOpenApiSaveDTO> $merchantAddressInfos = this.getMerchantAddressInfos();
        result = result * 59 + ($merchantAddressInfos == null ? 43 : ((Object)$merchantAddressInfos).hashCode());
        List<MerchantContactOpenApiSaveDTO> $merchantContactInfos = this.getMerchantContactInfos();
        result = result * 59 + ($merchantContactInfos == null ? 43 : ((Object)$merchantContactInfos).hashCode());
        List<MerchantAgentFinancialOpenApiSaveDTO> $merchantAgentFinancialInfos = this.getMerchantAgentFinancialInfos();
        result = result * 59 + ($merchantAgentFinancialInfos == null ? 43 : ((Object)$merchantAgentFinancialInfos).hashCode());
        List<MerchantAgentInvoiceOpenApiSaveDTO> $merchantAgentInvoiceInfos = this.getMerchantAgentInvoiceInfos();
        result = result * 59 + ($merchantAgentInvoiceInfos == null ? 43 : ((Object)$merchantAgentInvoiceInfos).hashCode());
        List<MerchantApplyRangeOpenApiSaveDTO> $merchantApplyRanges = this.getMerchantApplyRanges();
        result = result * 59 + ($merchantApplyRanges == null ? 43 : ((Object)$merchantApplyRanges).hashCode());
        MerchantApplyRangeDetailOpenApiSaveDTO $merchantAppliedDetail = this.getMerchantAppliedDetail();
        result = result * 59 + ($merchantAppliedDetail == null ? 43 : ((Object)$merchantAppliedDetail).hashCode());
        MerchantRoleOpenApiSaveDTO $merchantRole = this.getMerchantRole();
        result = result * 59 + ($merchantRole == null ? 43 : ((Object)$merchantRole).hashCode());
        MerchantManagerOpenApiSaveDTO $merchantsManager = this.getMerchantsManager();
        result = result * 59 + ($merchantsManager == null ? 43 : ((Object)$merchantsManager).hashCode());
        List<MerchantCustomerAreaOpenApiSaveDTO> $customerAreas = this.getCustomerAreas();
        result = result * 59 + ($customerAreas == null ? 43 : ((Object)$customerAreas).hashCode());
        List<MerchantPrincipalOpenApiSaveDTO> $principals = this.getPrincipals();
        result = result * 59 + ($principals == null ? 43 : ((Object)$principals).hashCode());
        List<MerchantInvoicingCustomerOpenApiSaveDTO> $invoicingCustomers = this.getInvoicingCustomers();
        result = result * 59 + ($invoicingCustomers == null ? 43 : ((Object)$invoicingCustomers).hashCode());
        String $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : $pubts.hashCode());
        String $createTime = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : $createTime.hashCode());
        String $modifyTime = this.getModifyTime();
        result = result * 59 + ($modifyTime == null ? 43 : $modifyTime.hashCode());
        String $creator = this.getCreator();
        result = result * 59 + ($creator == null ? 43 : $creator.hashCode());
        String $modifier = this.getModifier();
        result = result * 59 + ($modifier == null ? 43 : $modifier.hashCode());
        BigDecimal $longitude = this.getLongitude();
        result = result * 59 + ($longitude == null ? 43 : ((Object)$longitude).hashCode());
        BigDecimal $latitude = this.getLatitude();
        result = result * 59 + ($latitude == null ? 43 : ((Object)$latitude).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MerchantOpenApiSaveDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", createOrgId=" + this.getCreateOrgId() + ", createOrgCode=" + this.getCreateOrgCode() + ", createOrgName=" + this.getCreateOrgName() + ", belongOrgId=" + this.getBelongOrgId() + ", belongOrgCode=" + this.getBelongOrgCode() + ", belongOrgName=" + this.getBelongOrgName() + ", transTypeId=" + this.getTransTypeId() + ", transTypeCode=" + this.getTransTypeCode() + ", transTypeName=" + this.getTransTypeName() + ", shortname=" + this.getShortname() + ", countryId=" + this.getCountryId() + ", countryName=" + this.getCountryName() + ", countryCode=" + this.getCountryCode() + ", timeZoneId=" + this.getTimeZoneId() + ", timeZoneName=" + this.getTimeZoneName() + ", newTimeZone=" + this.getNewTimeZone() + ", languageId=" + this.getLanguageId() + ", languageCode=" + this.getLanguageCode() + ", parentManageOrgId=" + this.getParentManageOrgId() + ", parentManageOrgCode=" + this.getParentManageOrgCode() + ", parentManageOrgName=" + this.getParentManageOrgName() + ", parentCustomerId=" + this.getParentCustomerId() + ", parentCustomerCode=" + this.getParentCustomerCode() + ", parentCustomerName=" + this.getParentCustomerName() + ", suppliersId=" + this.getSuppliersId() + ", suppliersCode=" + this.getSuppliersCode() + ", suppliersName=" + this.getSuppliersName() + ", retailInvestors=" + this.getRetailInvestors() + ", internalOrg=" + this.getInternalOrg() + ", internalOrgIdId=" + this.getInternalOrgIdId() + ", internalOrgIdCode=" + this.getInternalOrgIdCode() + ", internalOrgIdName=" + this.getInternalOrgIdName() + ", taxPayingCategories=" + this.getTaxPayingCategories() + ", customerClassId=" + this.getCustomerClassId() + ", customerClassCode=" + this.getCustomerClassCode() + ", customerClassName=" + this.getCustomerClassName() + ", customerIndustryId=" + this.getCustomerIndustryId() + ", customerIndustryCode=" + this.getCustomerIndustryCode() + ", customerIndustryName=" + this.getCustomerIndustryName() + ", developmentPartnerId=" + this.getDevelopmentPartnerId() + ", developmentPartnerCode=" + this.getDevelopmentPartnerCode() + ", developmentPartnerName=" + this.getDevelopmentPartnerName() + ", enterpriseNature=" + this.getEnterpriseNature() + ", enterpriseName=" + this.getEnterpriseName() + ", personName=" + this.getPersonName() + ", orgName=" + this.getOrgName() + ", licenseType=" + this.getLicenseType() + ", creditCode=" + this.getCreditCode() + ", leaderName=" + this.getLeaderName() + ", leaderNameIdNo=" + this.getLeaderNameIdNo() + ", personCharge=" + this.getPersonCharge() + ", personChargeIdNo=" + this.getPersonChargeIdNo() + ", businessLicenseNo=" + this.getBusinessLicenseNo() + ", businessterm=" + this.getBusinessterm() + ", buildTime=" + this.getBuildTime() + ", contactName=" + this.getContactName() + ", contactTel=" + this.getContactTel() + ", address=" + this.getAddress() + ", regionCode=" + this.getRegionCode() + ", email=" + this.getEmail() + ", fax=" + this.getFax() + ", enterNatureId=" + this.getEnterNatureId() + ", enterNatureCode=" + this.getEnterNatureCode() + ", enterNatureName=" + this.getEnterNatureName() + ", currencyCode=" + this.getCurrencyCode() + ", money=" + this.getMoney() + ", peopleNum=" + this.getPeopleNum() + ", scopeModel=" + this.getScopeModel() + ", yearMoney=" + this.getYearMoney() + ", scope=" + this.getScope() + ", website=" + this.getWebsite() + ", wid=" + this.getWid() + ", postCode=" + this.getPostCode() + ", merchantCharacter=" + this.getMerchantCharacter() + ", merchantAddressInfos=" + this.getMerchantAddressInfos() + ", merchantContactInfos=" + this.getMerchantContactInfos() + ", merchantAgentFinancialInfos=" + this.getMerchantAgentFinancialInfos() + ", merchantAgentInvoiceInfos=" + this.getMerchantAgentInvoiceInfos() + ", merchantApplyRanges=" + this.getMerchantApplyRanges() + ", merchantAppliedDetail=" + this.getMerchantAppliedDetail() + ", merchantRole=" + this.getMerchantRole() + ", merchantsManager=" + this.getMerchantsManager() + ", customerAreas=" + this.getCustomerAreas() + ", principals=" + this.getPrincipals() + ", invoicingCustomers=" + this.getInvoicingCustomers() + ", blank=" + this.getBlank() + ", stopStatus=" + this.getStopStatus() + ", pubts=" + this.getPubts() + ", createTime=" + this.getCreateTime() + ", modifyTime=" + this.getModifyTime() + ", creator=" + this.getCreator() + ", modifier=" + this.getModifier() + ", longitude=" + this.getLongitude() + ", latitude=" + this.getLatitude() + ", erpCode=" + this.getErpCode() + ")";
    }
}

