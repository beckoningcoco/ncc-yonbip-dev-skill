/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import java.io.Serializable;
import java.math.BigDecimal;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantBaseDTO
implements Serializable {
    private Long id;
    public String name;
    public MultilingualVO nameMul;
    public String code;
    public String orgId;
    private String createMerchant;
    private String createOrg;
    private Boolean internalOrg;
    private String internalOrgId;
    private String creditCode;
    private String shortname;
    private MultilingualVO shortnameMul;
    private String region;
    private String regionCode;
    private String address;
    private String postCode;
    private String contactName;
    private String contactTel;
    private String enterpriseNature;
    private String licenseType;
    private String enterpriseName;
    private String leaderName;
    private String leaderNameIdNo;
    private String businessLicense;
    private String businessLicenseNo;
    private String buildTime;
    private String currencyCode;
    private Boolean retailInvestors;
    private String country;
    private Long suppliers;
    private String personName;
    private String idNo;
    private String personCharge;
    private String personChargeIdNo;
    private Long invoicingCustomers;
    private String invoicingCustomersCode;
    private String invoicingCustomersName;
    private Long parentCustomer;
    private Long channCustomerClass;
    private Long channCustomerLevel;
    private Long channCustomerLevelName;
    private Long channCustomerArea;
    private Long channCustomerIndustry;
    private Long channSpecialManagementDep;
    private Long channProfessSalesman;
    private Long customerClass;
    private String customerClassCode;
    private String customerClassName;
    private Boolean customerClassEnd;
    private String customerClassPath;
    private Long customerIndustry;
    private Long taxPayingCategories;
    private String website;
    private String email;
    private Long merchantType;
    private Long channelType;
    private Long customerArea;
    private String customerAreaName;
    private String customerAreaCode;
    private String enterNature;
    private String fax;
    private String logo;
    private Long parentManageOrg;
    private String officialMobile;
    private String officialName;
    private String officialEmail;
    private String representativeMobile;
    private String representativeName;
    private String representativeEmail;
    private String businessterm;
    private String path;
    private String transType;
    private Boolean merchantOptions;
    private Long custCategoryId;
    private String custCategoryCode;
    private String custCategoryName;
    @Deprecated
    private String timeZone;
    private String newTimeZone;
    private String language;
    private Integer scopeModel;
    private Long customerTradeId;
    private String customerTradeCode;
    private String customerTradeName;
    private Long saleAreaId;
    private String saleAreaCode;
    private String saleAreaName;
    private String saleAreaPath;
    private String businessRole;
    private String merchantsManagerMobile;
    private String merchantsManagerFullName;
    private String merchantsManagerEmail;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private Long businessPartner;
    private Long developmentPartner;
    private String merchantDefine1;
    private String merchantDefine2;
    private String merchantDefine3;
    private String merchantDefine4;
    private String merchantDefine5;
    private String merchantDefine6;
    private String merchantDefine7;
    private String merchantDefine8;
    private String merchantDefine9;
    private String merchantDefine10;
    private String merchantDefine11;
    private String merchantDefine12;
    private String merchantDefine13;
    private String merchantDefine14;
    private String merchantDefine15;
    private String merchantDefine16;
    private String merchantDefine17;
    private String merchantDefine18;
    private String merchantDefine19;
    private String merchantDefine20;
    private String merchantDefine21;
    private String merchantDefine22;
    private String merchantDefine23;
    private String merchantDefine24;
    private String merchantDefine25;
    private String merchantDefine26;
    private String merchantDefine27;
    private String merchantDefine28;
    private String merchantDefine29;
    private String merchantDefine30;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public MultilingualVO getNameMul() {
        return this.nameMul;
    }

    public String getCode() {
        return this.code;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getCreateMerchant() {
        return this.createMerchant;
    }

    public String getCreateOrg() {
        return this.createOrg;
    }

    public Boolean getInternalOrg() {
        return this.internalOrg;
    }

    public String getInternalOrgId() {
        return this.internalOrgId;
    }

    public String getCreditCode() {
        return this.creditCode;
    }

    public String getShortname() {
        return this.shortname;
    }

    public MultilingualVO getShortnameMul() {
        return this.shortnameMul;
    }

    public String getRegion() {
        return this.region;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactTel() {
        return this.contactTel;
    }

    public String getEnterpriseNature() {
        return this.enterpriseNature;
    }

    public String getLicenseType() {
        return this.licenseType;
    }

    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public String getLeaderName() {
        return this.leaderName;
    }

    public String getLeaderNameIdNo() {
        return this.leaderNameIdNo;
    }

    public String getBusinessLicense() {
        return this.businessLicense;
    }

    public String getBusinessLicenseNo() {
        return this.businessLicenseNo;
    }

    public String getBuildTime() {
        return this.buildTime;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Boolean getRetailInvestors() {
        return this.retailInvestors;
    }

    public String getCountry() {
        return this.country;
    }

    public Long getSuppliers() {
        return this.suppliers;
    }

    public String getPersonName() {
        return this.personName;
    }

    public String getIdNo() {
        return this.idNo;
    }

    public String getPersonCharge() {
        return this.personCharge;
    }

    public String getPersonChargeIdNo() {
        return this.personChargeIdNo;
    }

    public Long getInvoicingCustomers() {
        return this.invoicingCustomers;
    }

    public String getInvoicingCustomersCode() {
        return this.invoicingCustomersCode;
    }

    public String getInvoicingCustomersName() {
        return this.invoicingCustomersName;
    }

    public Long getParentCustomer() {
        return this.parentCustomer;
    }

    public Long getChannCustomerClass() {
        return this.channCustomerClass;
    }

    public Long getChannCustomerLevel() {
        return this.channCustomerLevel;
    }

    public Long getChannCustomerLevelName() {
        return this.channCustomerLevelName;
    }

    public Long getChannCustomerArea() {
        return this.channCustomerArea;
    }

    public Long getChannCustomerIndustry() {
        return this.channCustomerIndustry;
    }

    public Long getChannSpecialManagementDep() {
        return this.channSpecialManagementDep;
    }

    public Long getChannProfessSalesman() {
        return this.channProfessSalesman;
    }

    public Long getCustomerClass() {
        return this.customerClass;
    }

    public String getCustomerClassCode() {
        return this.customerClassCode;
    }

    public String getCustomerClassName() {
        return this.customerClassName;
    }

    public Boolean getCustomerClassEnd() {
        return this.customerClassEnd;
    }

    public String getCustomerClassPath() {
        return this.customerClassPath;
    }

    public Long getCustomerIndustry() {
        return this.customerIndustry;
    }

    public Long getTaxPayingCategories() {
        return this.taxPayingCategories;
    }

    public String getWebsite() {
        return this.website;
    }

    public String getEmail() {
        return this.email;
    }

    public Long getMerchantType() {
        return this.merchantType;
    }

    public Long getChannelType() {
        return this.channelType;
    }

    public Long getCustomerArea() {
        return this.customerArea;
    }

    public String getCustomerAreaName() {
        return this.customerAreaName;
    }

    public String getCustomerAreaCode() {
        return this.customerAreaCode;
    }

    public String getEnterNature() {
        return this.enterNature;
    }

    public String getFax() {
        return this.fax;
    }

    public String getLogo() {
        return this.logo;
    }

    public Long getParentManageOrg() {
        return this.parentManageOrg;
    }

    public String getOfficialMobile() {
        return this.officialMobile;
    }

    public String getOfficialName() {
        return this.officialName;
    }

    public String getOfficialEmail() {
        return this.officialEmail;
    }

    public String getRepresentativeMobile() {
        return this.representativeMobile;
    }

    public String getRepresentativeName() {
        return this.representativeName;
    }

    public String getRepresentativeEmail() {
        return this.representativeEmail;
    }

    public String getBusinessterm() {
        return this.businessterm;
    }

    public String getPath() {
        return this.path;
    }

    public String getTransType() {
        return this.transType;
    }

    public Boolean getMerchantOptions() {
        return this.merchantOptions;
    }

    public Long getCustCategoryId() {
        return this.custCategoryId;
    }

    public String getCustCategoryCode() {
        return this.custCategoryCode;
    }

    public String getCustCategoryName() {
        return this.custCategoryName;
    }

    @Deprecated
    public String getTimeZone() {
        return this.timeZone;
    }

    public String getNewTimeZone() {
        return this.newTimeZone;
    }

    public String getLanguage() {
        return this.language;
    }

    public Integer getScopeModel() {
        return this.scopeModel;
    }

    public Long getCustomerTradeId() {
        return this.customerTradeId;
    }

    public String getCustomerTradeCode() {
        return this.customerTradeCode;
    }

    public String getCustomerTradeName() {
        return this.customerTradeName;
    }

    public Long getSaleAreaId() {
        return this.saleAreaId;
    }

    public String getSaleAreaCode() {
        return this.saleAreaCode;
    }

    public String getSaleAreaName() {
        return this.saleAreaName;
    }

    public String getSaleAreaPath() {
        return this.saleAreaPath;
    }

    public String getBusinessRole() {
        return this.businessRole;
    }

    public String getMerchantsManagerMobile() {
        return this.merchantsManagerMobile;
    }

    public String getMerchantsManagerFullName() {
        return this.merchantsManagerFullName;
    }

    public String getMerchantsManagerEmail() {
        return this.merchantsManagerEmail;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public Long getBusinessPartner() {
        return this.businessPartner;
    }

    public Long getDevelopmentPartner() {
        return this.developmentPartner;
    }

    public String getMerchantDefine1() {
        return this.merchantDefine1;
    }

    public String getMerchantDefine2() {
        return this.merchantDefine2;
    }

    public String getMerchantDefine3() {
        return this.merchantDefine3;
    }

    public String getMerchantDefine4() {
        return this.merchantDefine4;
    }

    public String getMerchantDefine5() {
        return this.merchantDefine5;
    }

    public String getMerchantDefine6() {
        return this.merchantDefine6;
    }

    public String getMerchantDefine7() {
        return this.merchantDefine7;
    }

    public String getMerchantDefine8() {
        return this.merchantDefine8;
    }

    public String getMerchantDefine9() {
        return this.merchantDefine9;
    }

    public String getMerchantDefine10() {
        return this.merchantDefine10;
    }

    public String getMerchantDefine11() {
        return this.merchantDefine11;
    }

    public String getMerchantDefine12() {
        return this.merchantDefine12;
    }

    public String getMerchantDefine13() {
        return this.merchantDefine13;
    }

    public String getMerchantDefine14() {
        return this.merchantDefine14;
    }

    public String getMerchantDefine15() {
        return this.merchantDefine15;
    }

    public String getMerchantDefine16() {
        return this.merchantDefine16;
    }

    public String getMerchantDefine17() {
        return this.merchantDefine17;
    }

    public String getMerchantDefine18() {
        return this.merchantDefine18;
    }

    public String getMerchantDefine19() {
        return this.merchantDefine19;
    }

    public String getMerchantDefine20() {
        return this.merchantDefine20;
    }

    public String getMerchantDefine21() {
        return this.merchantDefine21;
    }

    public String getMerchantDefine22() {
        return this.merchantDefine22;
    }

    public String getMerchantDefine23() {
        return this.merchantDefine23;
    }

    public String getMerchantDefine24() {
        return this.merchantDefine24;
    }

    public String getMerchantDefine25() {
        return this.merchantDefine25;
    }

    public String getMerchantDefine26() {
        return this.merchantDefine26;
    }

    public String getMerchantDefine27() {
        return this.merchantDefine27;
    }

    public String getMerchantDefine28() {
        return this.merchantDefine28;
    }

    public String getMerchantDefine29() {
        return this.merchantDefine29;
    }

    public String getMerchantDefine30() {
        return this.merchantDefine30;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNameMul(MultilingualVO nameMul) {
        this.nameMul = nameMul;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setCreateMerchant(String createMerchant) {
        this.createMerchant = createMerchant;
    }

    public void setCreateOrg(String createOrg) {
        this.createOrg = createOrg;
    }

    public void setInternalOrg(Boolean internalOrg) {
        this.internalOrg = internalOrg;
    }

    public void setInternalOrgId(String internalOrgId) {
        this.internalOrgId = internalOrgId;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public void setShortnameMul(MultilingualVO shortnameMul) {
        this.shortnameMul = shortnameMul;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public void setEnterpriseNature(String enterpriseNature) {
        this.enterpriseNature = enterpriseNature;
    }

    public void setLicenseType(String licenseType) {
        this.licenseType = licenseType;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public void setLeaderNameIdNo(String leaderNameIdNo) {
        this.leaderNameIdNo = leaderNameIdNo;
    }

    public void setBusinessLicense(String businessLicense) {
        this.businessLicense = businessLicense;
    }

    public void setBusinessLicenseNo(String businessLicenseNo) {
        this.businessLicenseNo = businessLicenseNo;
    }

    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setRetailInvestors(Boolean retailInvestors) {
        this.retailInvestors = retailInvestors;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSuppliers(Long suppliers) {
        this.suppliers = suppliers;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public void setPersonCharge(String personCharge) {
        this.personCharge = personCharge;
    }

    public void setPersonChargeIdNo(String personChargeIdNo) {
        this.personChargeIdNo = personChargeIdNo;
    }

    public void setInvoicingCustomers(Long invoicingCustomers) {
        this.invoicingCustomers = invoicingCustomers;
    }

    public void setInvoicingCustomersCode(String invoicingCustomersCode) {
        this.invoicingCustomersCode = invoicingCustomersCode;
    }

    public void setInvoicingCustomersName(String invoicingCustomersName) {
        this.invoicingCustomersName = invoicingCustomersName;
    }

    public void setParentCustomer(Long parentCustomer) {
        this.parentCustomer = parentCustomer;
    }

    public void setChannCustomerClass(Long channCustomerClass) {
        this.channCustomerClass = channCustomerClass;
    }

    public void setChannCustomerLevel(Long channCustomerLevel) {
        this.channCustomerLevel = channCustomerLevel;
    }

    public void setChannCustomerLevelName(Long channCustomerLevelName) {
        this.channCustomerLevelName = channCustomerLevelName;
    }

    public void setChannCustomerArea(Long channCustomerArea) {
        this.channCustomerArea = channCustomerArea;
    }

    public void setChannCustomerIndustry(Long channCustomerIndustry) {
        this.channCustomerIndustry = channCustomerIndustry;
    }

    public void setChannSpecialManagementDep(Long channSpecialManagementDep) {
        this.channSpecialManagementDep = channSpecialManagementDep;
    }

    public void setChannProfessSalesman(Long channProfessSalesman) {
        this.channProfessSalesman = channProfessSalesman;
    }

    public void setCustomerClass(Long customerClass) {
        this.customerClass = customerClass;
    }

    public void setCustomerClassCode(String customerClassCode) {
        this.customerClassCode = customerClassCode;
    }

    public void setCustomerClassName(String customerClassName) {
        this.customerClassName = customerClassName;
    }

    public void setCustomerClassEnd(Boolean customerClassEnd) {
        this.customerClassEnd = customerClassEnd;
    }

    public void setCustomerClassPath(String customerClassPath) {
        this.customerClassPath = customerClassPath;
    }

    public void setCustomerIndustry(Long customerIndustry) {
        this.customerIndustry = customerIndustry;
    }

    public void setTaxPayingCategories(Long taxPayingCategories) {
        this.taxPayingCategories = taxPayingCategories;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMerchantType(Long merchantType) {
        this.merchantType = merchantType;
    }

    public void setChannelType(Long channelType) {
        this.channelType = channelType;
    }

    public void setCustomerArea(Long customerArea) {
        this.customerArea = customerArea;
    }

    public void setCustomerAreaName(String customerAreaName) {
        this.customerAreaName = customerAreaName;
    }

    public void setCustomerAreaCode(String customerAreaCode) {
        this.customerAreaCode = customerAreaCode;
    }

    public void setEnterNature(String enterNature) {
        this.enterNature = enterNature;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setParentManageOrg(Long parentManageOrg) {
        this.parentManageOrg = parentManageOrg;
    }

    public void setOfficialMobile(String officialMobile) {
        this.officialMobile = officialMobile;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public void setOfficialEmail(String officialEmail) {
        this.officialEmail = officialEmail;
    }

    public void setRepresentativeMobile(String representativeMobile) {
        this.representativeMobile = representativeMobile;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public void setRepresentativeEmail(String representativeEmail) {
        this.representativeEmail = representativeEmail;
    }

    public void setBusinessterm(String businessterm) {
        this.businessterm = businessterm;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public void setMerchantOptions(Boolean merchantOptions) {
        this.merchantOptions = merchantOptions;
    }

    public void setCustCategoryId(Long custCategoryId) {
        this.custCategoryId = custCategoryId;
    }

    public void setCustCategoryCode(String custCategoryCode) {
        this.custCategoryCode = custCategoryCode;
    }

    public void setCustCategoryName(String custCategoryName) {
        this.custCategoryName = custCategoryName;
    }

    @Deprecated
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public void setNewTimeZone(String newTimeZone) {
        this.newTimeZone = newTimeZone;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setScopeModel(Integer scopeModel) {
        this.scopeModel = scopeModel;
    }

    public void setCustomerTradeId(Long customerTradeId) {
        this.customerTradeId = customerTradeId;
    }

    public void setCustomerTradeCode(String customerTradeCode) {
        this.customerTradeCode = customerTradeCode;
    }

    public void setCustomerTradeName(String customerTradeName) {
        this.customerTradeName = customerTradeName;
    }

    public void setSaleAreaId(Long saleAreaId) {
        this.saleAreaId = saleAreaId;
    }

    public void setSaleAreaCode(String saleAreaCode) {
        this.saleAreaCode = saleAreaCode;
    }

    public void setSaleAreaName(String saleAreaName) {
        this.saleAreaName = saleAreaName;
    }

    public void setSaleAreaPath(String saleAreaPath) {
        this.saleAreaPath = saleAreaPath;
    }

    public void setBusinessRole(String businessRole) {
        this.businessRole = businessRole;
    }

    public void setMerchantsManagerMobile(String merchantsManagerMobile) {
        this.merchantsManagerMobile = merchantsManagerMobile;
    }

    public void setMerchantsManagerFullName(String merchantsManagerFullName) {
        this.merchantsManagerFullName = merchantsManagerFullName;
    }

    public void setMerchantsManagerEmail(String merchantsManagerEmail) {
        this.merchantsManagerEmail = merchantsManagerEmail;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public void setBusinessPartner(Long businessPartner) {
        this.businessPartner = businessPartner;
    }

    public void setDevelopmentPartner(Long developmentPartner) {
        this.developmentPartner = developmentPartner;
    }

    public void setMerchantDefine1(String merchantDefine1) {
        this.merchantDefine1 = merchantDefine1;
    }

    public void setMerchantDefine2(String merchantDefine2) {
        this.merchantDefine2 = merchantDefine2;
    }

    public void setMerchantDefine3(String merchantDefine3) {
        this.merchantDefine3 = merchantDefine3;
    }

    public void setMerchantDefine4(String merchantDefine4) {
        this.merchantDefine4 = merchantDefine4;
    }

    public void setMerchantDefine5(String merchantDefine5) {
        this.merchantDefine5 = merchantDefine5;
    }

    public void setMerchantDefine6(String merchantDefine6) {
        this.merchantDefine6 = merchantDefine6;
    }

    public void setMerchantDefine7(String merchantDefine7) {
        this.merchantDefine7 = merchantDefine7;
    }

    public void setMerchantDefine8(String merchantDefine8) {
        this.merchantDefine8 = merchantDefine8;
    }

    public void setMerchantDefine9(String merchantDefine9) {
        this.merchantDefine9 = merchantDefine9;
    }

    public void setMerchantDefine10(String merchantDefine10) {
        this.merchantDefine10 = merchantDefine10;
    }

    public void setMerchantDefine11(String merchantDefine11) {
        this.merchantDefine11 = merchantDefine11;
    }

    public void setMerchantDefine12(String merchantDefine12) {
        this.merchantDefine12 = merchantDefine12;
    }

    public void setMerchantDefine13(String merchantDefine13) {
        this.merchantDefine13 = merchantDefine13;
    }

    public void setMerchantDefine14(String merchantDefine14) {
        this.merchantDefine14 = merchantDefine14;
    }

    public void setMerchantDefine15(String merchantDefine15) {
        this.merchantDefine15 = merchantDefine15;
    }

    public void setMerchantDefine16(String merchantDefine16) {
        this.merchantDefine16 = merchantDefine16;
    }

    public void setMerchantDefine17(String merchantDefine17) {
        this.merchantDefine17 = merchantDefine17;
    }

    public void setMerchantDefine18(String merchantDefine18) {
        this.merchantDefine18 = merchantDefine18;
    }

    public void setMerchantDefine19(String merchantDefine19) {
        this.merchantDefine19 = merchantDefine19;
    }

    public void setMerchantDefine20(String merchantDefine20) {
        this.merchantDefine20 = merchantDefine20;
    }

    public void setMerchantDefine21(String merchantDefine21) {
        this.merchantDefine21 = merchantDefine21;
    }

    public void setMerchantDefine22(String merchantDefine22) {
        this.merchantDefine22 = merchantDefine22;
    }

    public void setMerchantDefine23(String merchantDefine23) {
        this.merchantDefine23 = merchantDefine23;
    }

    public void setMerchantDefine24(String merchantDefine24) {
        this.merchantDefine24 = merchantDefine24;
    }

    public void setMerchantDefine25(String merchantDefine25) {
        this.merchantDefine25 = merchantDefine25;
    }

    public void setMerchantDefine26(String merchantDefine26) {
        this.merchantDefine26 = merchantDefine26;
    }

    public void setMerchantDefine27(String merchantDefine27) {
        this.merchantDefine27 = merchantDefine27;
    }

    public void setMerchantDefine28(String merchantDefine28) {
        this.merchantDefine28 = merchantDefine28;
    }

    public void setMerchantDefine29(String merchantDefine29) {
        this.merchantDefine29 = merchantDefine29;
    }

    public void setMerchantDefine30(String merchantDefine30) {
        this.merchantDefine30 = merchantDefine30;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantBaseDTO)) {
            return false;
        }
        MerchantBaseDTO other = (MerchantBaseDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Boolean this$internalOrg = this.getInternalOrg();
        Boolean other$internalOrg = other.getInternalOrg();
        if (this$internalOrg == null ? other$internalOrg != null : !((Object)this$internalOrg).equals(other$internalOrg)) {
            return false;
        }
        Boolean this$retailInvestors = this.getRetailInvestors();
        Boolean other$retailInvestors = other.getRetailInvestors();
        if (this$retailInvestors == null ? other$retailInvestors != null : !((Object)this$retailInvestors).equals(other$retailInvestors)) {
            return false;
        }
        Long this$suppliers = this.getSuppliers();
        Long other$suppliers = other.getSuppliers();
        if (this$suppliers == null ? other$suppliers != null : !((Object)this$suppliers).equals(other$suppliers)) {
            return false;
        }
        Long this$invoicingCustomers = this.getInvoicingCustomers();
        Long other$invoicingCustomers = other.getInvoicingCustomers();
        if (this$invoicingCustomers == null ? other$invoicingCustomers != null : !((Object)this$invoicingCustomers).equals(other$invoicingCustomers)) {
            return false;
        }
        Long this$parentCustomer = this.getParentCustomer();
        Long other$parentCustomer = other.getParentCustomer();
        if (this$parentCustomer == null ? other$parentCustomer != null : !((Object)this$parentCustomer).equals(other$parentCustomer)) {
            return false;
        }
        Long this$channCustomerClass = this.getChannCustomerClass();
        Long other$channCustomerClass = other.getChannCustomerClass();
        if (this$channCustomerClass == null ? other$channCustomerClass != null : !((Object)this$channCustomerClass).equals(other$channCustomerClass)) {
            return false;
        }
        Long this$channCustomerLevel = this.getChannCustomerLevel();
        Long other$channCustomerLevel = other.getChannCustomerLevel();
        if (this$channCustomerLevel == null ? other$channCustomerLevel != null : !((Object)this$channCustomerLevel).equals(other$channCustomerLevel)) {
            return false;
        }
        Long this$channCustomerLevelName = this.getChannCustomerLevelName();
        Long other$channCustomerLevelName = other.getChannCustomerLevelName();
        if (this$channCustomerLevelName == null ? other$channCustomerLevelName != null : !((Object)this$channCustomerLevelName).equals(other$channCustomerLevelName)) {
            return false;
        }
        Long this$channCustomerArea = this.getChannCustomerArea();
        Long other$channCustomerArea = other.getChannCustomerArea();
        if (this$channCustomerArea == null ? other$channCustomerArea != null : !((Object)this$channCustomerArea).equals(other$channCustomerArea)) {
            return false;
        }
        Long this$channCustomerIndustry = this.getChannCustomerIndustry();
        Long other$channCustomerIndustry = other.getChannCustomerIndustry();
        if (this$channCustomerIndustry == null ? other$channCustomerIndustry != null : !((Object)this$channCustomerIndustry).equals(other$channCustomerIndustry)) {
            return false;
        }
        Long this$channSpecialManagementDep = this.getChannSpecialManagementDep();
        Long other$channSpecialManagementDep = other.getChannSpecialManagementDep();
        if (this$channSpecialManagementDep == null ? other$channSpecialManagementDep != null : !((Object)this$channSpecialManagementDep).equals(other$channSpecialManagementDep)) {
            return false;
        }
        Long this$channProfessSalesman = this.getChannProfessSalesman();
        Long other$channProfessSalesman = other.getChannProfessSalesman();
        if (this$channProfessSalesman == null ? other$channProfessSalesman != null : !((Object)this$channProfessSalesman).equals(other$channProfessSalesman)) {
            return false;
        }
        Long this$customerClass = this.getCustomerClass();
        Long other$customerClass = other.getCustomerClass();
        if (this$customerClass == null ? other$customerClass != null : !((Object)this$customerClass).equals(other$customerClass)) {
            return false;
        }
        Boolean this$customerClassEnd = this.getCustomerClassEnd();
        Boolean other$customerClassEnd = other.getCustomerClassEnd();
        if (this$customerClassEnd == null ? other$customerClassEnd != null : !((Object)this$customerClassEnd).equals(other$customerClassEnd)) {
            return false;
        }
        Long this$customerIndustry = this.getCustomerIndustry();
        Long other$customerIndustry = other.getCustomerIndustry();
        if (this$customerIndustry == null ? other$customerIndustry != null : !((Object)this$customerIndustry).equals(other$customerIndustry)) {
            return false;
        }
        Long this$taxPayingCategories = this.getTaxPayingCategories();
        Long other$taxPayingCategories = other.getTaxPayingCategories();
        if (this$taxPayingCategories == null ? other$taxPayingCategories != null : !((Object)this$taxPayingCategories).equals(other$taxPayingCategories)) {
            return false;
        }
        Long this$merchantType = this.getMerchantType();
        Long other$merchantType = other.getMerchantType();
        if (this$merchantType == null ? other$merchantType != null : !((Object)this$merchantType).equals(other$merchantType)) {
            return false;
        }
        Long this$channelType = this.getChannelType();
        Long other$channelType = other.getChannelType();
        if (this$channelType == null ? other$channelType != null : !((Object)this$channelType).equals(other$channelType)) {
            return false;
        }
        Long this$customerArea = this.getCustomerArea();
        Long other$customerArea = other.getCustomerArea();
        if (this$customerArea == null ? other$customerArea != null : !((Object)this$customerArea).equals(other$customerArea)) {
            return false;
        }
        Long this$parentManageOrg = this.getParentManageOrg();
        Long other$parentManageOrg = other.getParentManageOrg();
        if (this$parentManageOrg == null ? other$parentManageOrg != null : !((Object)this$parentManageOrg).equals(other$parentManageOrg)) {
            return false;
        }
        Boolean this$merchantOptions = this.getMerchantOptions();
        Boolean other$merchantOptions = other.getMerchantOptions();
        if (this$merchantOptions == null ? other$merchantOptions != null : !((Object)this$merchantOptions).equals(other$merchantOptions)) {
            return false;
        }
        Long this$custCategoryId = this.getCustCategoryId();
        Long other$custCategoryId = other.getCustCategoryId();
        if (this$custCategoryId == null ? other$custCategoryId != null : !((Object)this$custCategoryId).equals(other$custCategoryId)) {
            return false;
        }
        Integer this$scopeModel = this.getScopeModel();
        Integer other$scopeModel = other.getScopeModel();
        if (this$scopeModel == null ? other$scopeModel != null : !((Object)this$scopeModel).equals(other$scopeModel)) {
            return false;
        }
        Long this$customerTradeId = this.getCustomerTradeId();
        Long other$customerTradeId = other.getCustomerTradeId();
        if (this$customerTradeId == null ? other$customerTradeId != null : !((Object)this$customerTradeId).equals(other$customerTradeId)) {
            return false;
        }
        Long this$saleAreaId = this.getSaleAreaId();
        Long other$saleAreaId = other.getSaleAreaId();
        if (this$saleAreaId == null ? other$saleAreaId != null : !((Object)this$saleAreaId).equals(other$saleAreaId)) {
            return false;
        }
        Long this$businessPartner = this.getBusinessPartner();
        Long other$businessPartner = other.getBusinessPartner();
        if (this$businessPartner == null ? other$businessPartner != null : !((Object)this$businessPartner).equals(other$businessPartner)) {
            return false;
        }
        Long this$developmentPartner = this.getDevelopmentPartner();
        Long other$developmentPartner = other.getDevelopmentPartner();
        if (this$developmentPartner == null ? other$developmentPartner != null : !((Object)this$developmentPartner).equals(other$developmentPartner)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        MultilingualVO this$nameMul = this.getNameMul();
        MultilingualVO other$nameMul = other.getNameMul();
        if (this$nameMul == null ? other$nameMul != null : !((Object)this$nameMul).equals(other$nameMul)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$createMerchant = this.getCreateMerchant();
        String other$createMerchant = other.getCreateMerchant();
        if (this$createMerchant == null ? other$createMerchant != null : !this$createMerchant.equals(other$createMerchant)) {
            return false;
        }
        String this$createOrg = this.getCreateOrg();
        String other$createOrg = other.getCreateOrg();
        if (this$createOrg == null ? other$createOrg != null : !this$createOrg.equals(other$createOrg)) {
            return false;
        }
        String this$internalOrgId = this.getInternalOrgId();
        String other$internalOrgId = other.getInternalOrgId();
        if (this$internalOrgId == null ? other$internalOrgId != null : !this$internalOrgId.equals(other$internalOrgId)) {
            return false;
        }
        String this$creditCode = this.getCreditCode();
        String other$creditCode = other.getCreditCode();
        if (this$creditCode == null ? other$creditCode != null : !this$creditCode.equals(other$creditCode)) {
            return false;
        }
        String this$shortname = this.getShortname();
        String other$shortname = other.getShortname();
        if (this$shortname == null ? other$shortname != null : !this$shortname.equals(other$shortname)) {
            return false;
        }
        MultilingualVO this$shortnameMul = this.getShortnameMul();
        MultilingualVO other$shortnameMul = other.getShortnameMul();
        if (this$shortnameMul == null ? other$shortnameMul != null : !((Object)this$shortnameMul).equals(other$shortnameMul)) {
            return false;
        }
        String this$region = this.getRegion();
        String other$region = other.getRegion();
        if (this$region == null ? other$region != null : !this$region.equals(other$region)) {
            return false;
        }
        String this$regionCode = this.getRegionCode();
        String other$regionCode = other.getRegionCode();
        if (this$regionCode == null ? other$regionCode != null : !this$regionCode.equals(other$regionCode)) {
            return false;
        }
        String this$address = this.getAddress();
        String other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) {
            return false;
        }
        String this$postCode = this.getPostCode();
        String other$postCode = other.getPostCode();
        if (this$postCode == null ? other$postCode != null : !this$postCode.equals(other$postCode)) {
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
        String this$enterpriseNature = this.getEnterpriseNature();
        String other$enterpriseNature = other.getEnterpriseNature();
        if (this$enterpriseNature == null ? other$enterpriseNature != null : !this$enterpriseNature.equals(other$enterpriseNature)) {
            return false;
        }
        String this$licenseType = this.getLicenseType();
        String other$licenseType = other.getLicenseType();
        if (this$licenseType == null ? other$licenseType != null : !this$licenseType.equals(other$licenseType)) {
            return false;
        }
        String this$enterpriseName = this.getEnterpriseName();
        String other$enterpriseName = other.getEnterpriseName();
        if (this$enterpriseName == null ? other$enterpriseName != null : !this$enterpriseName.equals(other$enterpriseName)) {
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
        String this$businessLicense = this.getBusinessLicense();
        String other$businessLicense = other.getBusinessLicense();
        if (this$businessLicense == null ? other$businessLicense != null : !this$businessLicense.equals(other$businessLicense)) {
            return false;
        }
        String this$businessLicenseNo = this.getBusinessLicenseNo();
        String other$businessLicenseNo = other.getBusinessLicenseNo();
        if (this$businessLicenseNo == null ? other$businessLicenseNo != null : !this$businessLicenseNo.equals(other$businessLicenseNo)) {
            return false;
        }
        String this$buildTime = this.getBuildTime();
        String other$buildTime = other.getBuildTime();
        if (this$buildTime == null ? other$buildTime != null : !this$buildTime.equals(other$buildTime)) {
            return false;
        }
        String this$currencyCode = this.getCurrencyCode();
        String other$currencyCode = other.getCurrencyCode();
        if (this$currencyCode == null ? other$currencyCode != null : !this$currencyCode.equals(other$currencyCode)) {
            return false;
        }
        String this$country = this.getCountry();
        String other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) {
            return false;
        }
        String this$personName = this.getPersonName();
        String other$personName = other.getPersonName();
        if (this$personName == null ? other$personName != null : !this$personName.equals(other$personName)) {
            return false;
        }
        String this$idNo = this.getIdNo();
        String other$idNo = other.getIdNo();
        if (this$idNo == null ? other$idNo != null : !this$idNo.equals(other$idNo)) {
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
        String this$customerClassPath = this.getCustomerClassPath();
        String other$customerClassPath = other.getCustomerClassPath();
        if (this$customerClassPath == null ? other$customerClassPath != null : !this$customerClassPath.equals(other$customerClassPath)) {
            return false;
        }
        String this$website = this.getWebsite();
        String other$website = other.getWebsite();
        if (this$website == null ? other$website != null : !this$website.equals(other$website)) {
            return false;
        }
        String this$email = this.getEmail();
        String other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) {
            return false;
        }
        String this$customerAreaName = this.getCustomerAreaName();
        String other$customerAreaName = other.getCustomerAreaName();
        if (this$customerAreaName == null ? other$customerAreaName != null : !this$customerAreaName.equals(other$customerAreaName)) {
            return false;
        }
        String this$customerAreaCode = this.getCustomerAreaCode();
        String other$customerAreaCode = other.getCustomerAreaCode();
        if (this$customerAreaCode == null ? other$customerAreaCode != null : !this$customerAreaCode.equals(other$customerAreaCode)) {
            return false;
        }
        String this$enterNature = this.getEnterNature();
        String other$enterNature = other.getEnterNature();
        if (this$enterNature == null ? other$enterNature != null : !this$enterNature.equals(other$enterNature)) {
            return false;
        }
        String this$fax = this.getFax();
        String other$fax = other.getFax();
        if (this$fax == null ? other$fax != null : !this$fax.equals(other$fax)) {
            return false;
        }
        String this$logo = this.getLogo();
        String other$logo = other.getLogo();
        if (this$logo == null ? other$logo != null : !this$logo.equals(other$logo)) {
            return false;
        }
        String this$officialMobile = this.getOfficialMobile();
        String other$officialMobile = other.getOfficialMobile();
        if (this$officialMobile == null ? other$officialMobile != null : !this$officialMobile.equals(other$officialMobile)) {
            return false;
        }
        String this$officialName = this.getOfficialName();
        String other$officialName = other.getOfficialName();
        if (this$officialName == null ? other$officialName != null : !this$officialName.equals(other$officialName)) {
            return false;
        }
        String this$officialEmail = this.getOfficialEmail();
        String other$officialEmail = other.getOfficialEmail();
        if (this$officialEmail == null ? other$officialEmail != null : !this$officialEmail.equals(other$officialEmail)) {
            return false;
        }
        String this$representativeMobile = this.getRepresentativeMobile();
        String other$representativeMobile = other.getRepresentativeMobile();
        if (this$representativeMobile == null ? other$representativeMobile != null : !this$representativeMobile.equals(other$representativeMobile)) {
            return false;
        }
        String this$representativeName = this.getRepresentativeName();
        String other$representativeName = other.getRepresentativeName();
        if (this$representativeName == null ? other$representativeName != null : !this$representativeName.equals(other$representativeName)) {
            return false;
        }
        String this$representativeEmail = this.getRepresentativeEmail();
        String other$representativeEmail = other.getRepresentativeEmail();
        if (this$representativeEmail == null ? other$representativeEmail != null : !this$representativeEmail.equals(other$representativeEmail)) {
            return false;
        }
        String this$businessterm = this.getBusinessterm();
        String other$businessterm = other.getBusinessterm();
        if (this$businessterm == null ? other$businessterm != null : !this$businessterm.equals(other$businessterm)) {
            return false;
        }
        String this$path = this.getPath();
        String other$path = other.getPath();
        if (this$path == null ? other$path != null : !this$path.equals(other$path)) {
            return false;
        }
        String this$transType = this.getTransType();
        String other$transType = other.getTransType();
        if (this$transType == null ? other$transType != null : !this$transType.equals(other$transType)) {
            return false;
        }
        String this$custCategoryCode = this.getCustCategoryCode();
        String other$custCategoryCode = other.getCustCategoryCode();
        if (this$custCategoryCode == null ? other$custCategoryCode != null : !this$custCategoryCode.equals(other$custCategoryCode)) {
            return false;
        }
        String this$custCategoryName = this.getCustCategoryName();
        String other$custCategoryName = other.getCustCategoryName();
        if (this$custCategoryName == null ? other$custCategoryName != null : !this$custCategoryName.equals(other$custCategoryName)) {
            return false;
        }
        String this$timeZone = this.getTimeZone();
        String other$timeZone = other.getTimeZone();
        if (this$timeZone == null ? other$timeZone != null : !this$timeZone.equals(other$timeZone)) {
            return false;
        }
        String this$newTimeZone = this.getNewTimeZone();
        String other$newTimeZone = other.getNewTimeZone();
        if (this$newTimeZone == null ? other$newTimeZone != null : !this$newTimeZone.equals(other$newTimeZone)) {
            return false;
        }
        String this$language = this.getLanguage();
        String other$language = other.getLanguage();
        if (this$language == null ? other$language != null : !this$language.equals(other$language)) {
            return false;
        }
        String this$customerTradeCode = this.getCustomerTradeCode();
        String other$customerTradeCode = other.getCustomerTradeCode();
        if (this$customerTradeCode == null ? other$customerTradeCode != null : !this$customerTradeCode.equals(other$customerTradeCode)) {
            return false;
        }
        String this$customerTradeName = this.getCustomerTradeName();
        String other$customerTradeName = other.getCustomerTradeName();
        if (this$customerTradeName == null ? other$customerTradeName != null : !this$customerTradeName.equals(other$customerTradeName)) {
            return false;
        }
        String this$saleAreaCode = this.getSaleAreaCode();
        String other$saleAreaCode = other.getSaleAreaCode();
        if (this$saleAreaCode == null ? other$saleAreaCode != null : !this$saleAreaCode.equals(other$saleAreaCode)) {
            return false;
        }
        String this$saleAreaName = this.getSaleAreaName();
        String other$saleAreaName = other.getSaleAreaName();
        if (this$saleAreaName == null ? other$saleAreaName != null : !this$saleAreaName.equals(other$saleAreaName)) {
            return false;
        }
        String this$saleAreaPath = this.getSaleAreaPath();
        String other$saleAreaPath = other.getSaleAreaPath();
        if (this$saleAreaPath == null ? other$saleAreaPath != null : !this$saleAreaPath.equals(other$saleAreaPath)) {
            return false;
        }
        String this$businessRole = this.getBusinessRole();
        String other$businessRole = other.getBusinessRole();
        if (this$businessRole == null ? other$businessRole != null : !this$businessRole.equals(other$businessRole)) {
            return false;
        }
        String this$merchantsManagerMobile = this.getMerchantsManagerMobile();
        String other$merchantsManagerMobile = other.getMerchantsManagerMobile();
        if (this$merchantsManagerMobile == null ? other$merchantsManagerMobile != null : !this$merchantsManagerMobile.equals(other$merchantsManagerMobile)) {
            return false;
        }
        String this$merchantsManagerFullName = this.getMerchantsManagerFullName();
        String other$merchantsManagerFullName = other.getMerchantsManagerFullName();
        if (this$merchantsManagerFullName == null ? other$merchantsManagerFullName != null : !this$merchantsManagerFullName.equals(other$merchantsManagerFullName)) {
            return false;
        }
        String this$merchantsManagerEmail = this.getMerchantsManagerEmail();
        String other$merchantsManagerEmail = other.getMerchantsManagerEmail();
        if (this$merchantsManagerEmail == null ? other$merchantsManagerEmail != null : !this$merchantsManagerEmail.equals(other$merchantsManagerEmail)) {
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
        String this$merchantDefine1 = this.getMerchantDefine1();
        String other$merchantDefine1 = other.getMerchantDefine1();
        if (this$merchantDefine1 == null ? other$merchantDefine1 != null : !this$merchantDefine1.equals(other$merchantDefine1)) {
            return false;
        }
        String this$merchantDefine2 = this.getMerchantDefine2();
        String other$merchantDefine2 = other.getMerchantDefine2();
        if (this$merchantDefine2 == null ? other$merchantDefine2 != null : !this$merchantDefine2.equals(other$merchantDefine2)) {
            return false;
        }
        String this$merchantDefine3 = this.getMerchantDefine3();
        String other$merchantDefine3 = other.getMerchantDefine3();
        if (this$merchantDefine3 == null ? other$merchantDefine3 != null : !this$merchantDefine3.equals(other$merchantDefine3)) {
            return false;
        }
        String this$merchantDefine4 = this.getMerchantDefine4();
        String other$merchantDefine4 = other.getMerchantDefine4();
        if (this$merchantDefine4 == null ? other$merchantDefine4 != null : !this$merchantDefine4.equals(other$merchantDefine4)) {
            return false;
        }
        String this$merchantDefine5 = this.getMerchantDefine5();
        String other$merchantDefine5 = other.getMerchantDefine5();
        if (this$merchantDefine5 == null ? other$merchantDefine5 != null : !this$merchantDefine5.equals(other$merchantDefine5)) {
            return false;
        }
        String this$merchantDefine6 = this.getMerchantDefine6();
        String other$merchantDefine6 = other.getMerchantDefine6();
        if (this$merchantDefine6 == null ? other$merchantDefine6 != null : !this$merchantDefine6.equals(other$merchantDefine6)) {
            return false;
        }
        String this$merchantDefine7 = this.getMerchantDefine7();
        String other$merchantDefine7 = other.getMerchantDefine7();
        if (this$merchantDefine7 == null ? other$merchantDefine7 != null : !this$merchantDefine7.equals(other$merchantDefine7)) {
            return false;
        }
        String this$merchantDefine8 = this.getMerchantDefine8();
        String other$merchantDefine8 = other.getMerchantDefine8();
        if (this$merchantDefine8 == null ? other$merchantDefine8 != null : !this$merchantDefine8.equals(other$merchantDefine8)) {
            return false;
        }
        String this$merchantDefine9 = this.getMerchantDefine9();
        String other$merchantDefine9 = other.getMerchantDefine9();
        if (this$merchantDefine9 == null ? other$merchantDefine9 != null : !this$merchantDefine9.equals(other$merchantDefine9)) {
            return false;
        }
        String this$merchantDefine10 = this.getMerchantDefine10();
        String other$merchantDefine10 = other.getMerchantDefine10();
        if (this$merchantDefine10 == null ? other$merchantDefine10 != null : !this$merchantDefine10.equals(other$merchantDefine10)) {
            return false;
        }
        String this$merchantDefine11 = this.getMerchantDefine11();
        String other$merchantDefine11 = other.getMerchantDefine11();
        if (this$merchantDefine11 == null ? other$merchantDefine11 != null : !this$merchantDefine11.equals(other$merchantDefine11)) {
            return false;
        }
        String this$merchantDefine12 = this.getMerchantDefine12();
        String other$merchantDefine12 = other.getMerchantDefine12();
        if (this$merchantDefine12 == null ? other$merchantDefine12 != null : !this$merchantDefine12.equals(other$merchantDefine12)) {
            return false;
        }
        String this$merchantDefine13 = this.getMerchantDefine13();
        String other$merchantDefine13 = other.getMerchantDefine13();
        if (this$merchantDefine13 == null ? other$merchantDefine13 != null : !this$merchantDefine13.equals(other$merchantDefine13)) {
            return false;
        }
        String this$merchantDefine14 = this.getMerchantDefine14();
        String other$merchantDefine14 = other.getMerchantDefine14();
        if (this$merchantDefine14 == null ? other$merchantDefine14 != null : !this$merchantDefine14.equals(other$merchantDefine14)) {
            return false;
        }
        String this$merchantDefine15 = this.getMerchantDefine15();
        String other$merchantDefine15 = other.getMerchantDefine15();
        if (this$merchantDefine15 == null ? other$merchantDefine15 != null : !this$merchantDefine15.equals(other$merchantDefine15)) {
            return false;
        }
        String this$merchantDefine16 = this.getMerchantDefine16();
        String other$merchantDefine16 = other.getMerchantDefine16();
        if (this$merchantDefine16 == null ? other$merchantDefine16 != null : !this$merchantDefine16.equals(other$merchantDefine16)) {
            return false;
        }
        String this$merchantDefine17 = this.getMerchantDefine17();
        String other$merchantDefine17 = other.getMerchantDefine17();
        if (this$merchantDefine17 == null ? other$merchantDefine17 != null : !this$merchantDefine17.equals(other$merchantDefine17)) {
            return false;
        }
        String this$merchantDefine18 = this.getMerchantDefine18();
        String other$merchantDefine18 = other.getMerchantDefine18();
        if (this$merchantDefine18 == null ? other$merchantDefine18 != null : !this$merchantDefine18.equals(other$merchantDefine18)) {
            return false;
        }
        String this$merchantDefine19 = this.getMerchantDefine19();
        String other$merchantDefine19 = other.getMerchantDefine19();
        if (this$merchantDefine19 == null ? other$merchantDefine19 != null : !this$merchantDefine19.equals(other$merchantDefine19)) {
            return false;
        }
        String this$merchantDefine20 = this.getMerchantDefine20();
        String other$merchantDefine20 = other.getMerchantDefine20();
        if (this$merchantDefine20 == null ? other$merchantDefine20 != null : !this$merchantDefine20.equals(other$merchantDefine20)) {
            return false;
        }
        String this$merchantDefine21 = this.getMerchantDefine21();
        String other$merchantDefine21 = other.getMerchantDefine21();
        if (this$merchantDefine21 == null ? other$merchantDefine21 != null : !this$merchantDefine21.equals(other$merchantDefine21)) {
            return false;
        }
        String this$merchantDefine22 = this.getMerchantDefine22();
        String other$merchantDefine22 = other.getMerchantDefine22();
        if (this$merchantDefine22 == null ? other$merchantDefine22 != null : !this$merchantDefine22.equals(other$merchantDefine22)) {
            return false;
        }
        String this$merchantDefine23 = this.getMerchantDefine23();
        String other$merchantDefine23 = other.getMerchantDefine23();
        if (this$merchantDefine23 == null ? other$merchantDefine23 != null : !this$merchantDefine23.equals(other$merchantDefine23)) {
            return false;
        }
        String this$merchantDefine24 = this.getMerchantDefine24();
        String other$merchantDefine24 = other.getMerchantDefine24();
        if (this$merchantDefine24 == null ? other$merchantDefine24 != null : !this$merchantDefine24.equals(other$merchantDefine24)) {
            return false;
        }
        String this$merchantDefine25 = this.getMerchantDefine25();
        String other$merchantDefine25 = other.getMerchantDefine25();
        if (this$merchantDefine25 == null ? other$merchantDefine25 != null : !this$merchantDefine25.equals(other$merchantDefine25)) {
            return false;
        }
        String this$merchantDefine26 = this.getMerchantDefine26();
        String other$merchantDefine26 = other.getMerchantDefine26();
        if (this$merchantDefine26 == null ? other$merchantDefine26 != null : !this$merchantDefine26.equals(other$merchantDefine26)) {
            return false;
        }
        String this$merchantDefine27 = this.getMerchantDefine27();
        String other$merchantDefine27 = other.getMerchantDefine27();
        if (this$merchantDefine27 == null ? other$merchantDefine27 != null : !this$merchantDefine27.equals(other$merchantDefine27)) {
            return false;
        }
        String this$merchantDefine28 = this.getMerchantDefine28();
        String other$merchantDefine28 = other.getMerchantDefine28();
        if (this$merchantDefine28 == null ? other$merchantDefine28 != null : !this$merchantDefine28.equals(other$merchantDefine28)) {
            return false;
        }
        String this$merchantDefine29 = this.getMerchantDefine29();
        String other$merchantDefine29 = other.getMerchantDefine29();
        if (this$merchantDefine29 == null ? other$merchantDefine29 != null : !this$merchantDefine29.equals(other$merchantDefine29)) {
            return false;
        }
        String this$merchantDefine30 = this.getMerchantDefine30();
        String other$merchantDefine30 = other.getMerchantDefine30();
        return !(this$merchantDefine30 == null ? other$merchantDefine30 != null : !this$merchantDefine30.equals(other$merchantDefine30));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantBaseDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $internalOrg = this.getInternalOrg();
        result = result * 59 + ($internalOrg == null ? 43 : ((Object)$internalOrg).hashCode());
        Boolean $retailInvestors = this.getRetailInvestors();
        result = result * 59 + ($retailInvestors == null ? 43 : ((Object)$retailInvestors).hashCode());
        Long $suppliers = this.getSuppliers();
        result = result * 59 + ($suppliers == null ? 43 : ((Object)$suppliers).hashCode());
        Long $invoicingCustomers = this.getInvoicingCustomers();
        result = result * 59 + ($invoicingCustomers == null ? 43 : ((Object)$invoicingCustomers).hashCode());
        Long $parentCustomer = this.getParentCustomer();
        result = result * 59 + ($parentCustomer == null ? 43 : ((Object)$parentCustomer).hashCode());
        Long $channCustomerClass = this.getChannCustomerClass();
        result = result * 59 + ($channCustomerClass == null ? 43 : ((Object)$channCustomerClass).hashCode());
        Long $channCustomerLevel = this.getChannCustomerLevel();
        result = result * 59 + ($channCustomerLevel == null ? 43 : ((Object)$channCustomerLevel).hashCode());
        Long $channCustomerLevelName = this.getChannCustomerLevelName();
        result = result * 59 + ($channCustomerLevelName == null ? 43 : ((Object)$channCustomerLevelName).hashCode());
        Long $channCustomerArea = this.getChannCustomerArea();
        result = result * 59 + ($channCustomerArea == null ? 43 : ((Object)$channCustomerArea).hashCode());
        Long $channCustomerIndustry = this.getChannCustomerIndustry();
        result = result * 59 + ($channCustomerIndustry == null ? 43 : ((Object)$channCustomerIndustry).hashCode());
        Long $channSpecialManagementDep = this.getChannSpecialManagementDep();
        result = result * 59 + ($channSpecialManagementDep == null ? 43 : ((Object)$channSpecialManagementDep).hashCode());
        Long $channProfessSalesman = this.getChannProfessSalesman();
        result = result * 59 + ($channProfessSalesman == null ? 43 : ((Object)$channProfessSalesman).hashCode());
        Long $customerClass = this.getCustomerClass();
        result = result * 59 + ($customerClass == null ? 43 : ((Object)$customerClass).hashCode());
        Boolean $customerClassEnd = this.getCustomerClassEnd();
        result = result * 59 + ($customerClassEnd == null ? 43 : ((Object)$customerClassEnd).hashCode());
        Long $customerIndustry = this.getCustomerIndustry();
        result = result * 59 + ($customerIndustry == null ? 43 : ((Object)$customerIndustry).hashCode());
        Long $taxPayingCategories = this.getTaxPayingCategories();
        result = result * 59 + ($taxPayingCategories == null ? 43 : ((Object)$taxPayingCategories).hashCode());
        Long $merchantType = this.getMerchantType();
        result = result * 59 + ($merchantType == null ? 43 : ((Object)$merchantType).hashCode());
        Long $channelType = this.getChannelType();
        result = result * 59 + ($channelType == null ? 43 : ((Object)$channelType).hashCode());
        Long $customerArea = this.getCustomerArea();
        result = result * 59 + ($customerArea == null ? 43 : ((Object)$customerArea).hashCode());
        Long $parentManageOrg = this.getParentManageOrg();
        result = result * 59 + ($parentManageOrg == null ? 43 : ((Object)$parentManageOrg).hashCode());
        Boolean $merchantOptions = this.getMerchantOptions();
        result = result * 59 + ($merchantOptions == null ? 43 : ((Object)$merchantOptions).hashCode());
        Long $custCategoryId = this.getCustCategoryId();
        result = result * 59 + ($custCategoryId == null ? 43 : ((Object)$custCategoryId).hashCode());
        Integer $scopeModel = this.getScopeModel();
        result = result * 59 + ($scopeModel == null ? 43 : ((Object)$scopeModel).hashCode());
        Long $customerTradeId = this.getCustomerTradeId();
        result = result * 59 + ($customerTradeId == null ? 43 : ((Object)$customerTradeId).hashCode());
        Long $saleAreaId = this.getSaleAreaId();
        result = result * 59 + ($saleAreaId == null ? 43 : ((Object)$saleAreaId).hashCode());
        Long $businessPartner = this.getBusinessPartner();
        result = result * 59 + ($businessPartner == null ? 43 : ((Object)$businessPartner).hashCode());
        Long $developmentPartner = this.getDevelopmentPartner();
        result = result * 59 + ($developmentPartner == null ? 43 : ((Object)$developmentPartner).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        MultilingualVO $nameMul = this.getNameMul();
        result = result * 59 + ($nameMul == null ? 43 : $nameMul.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $createMerchant = this.getCreateMerchant();
        result = result * 59 + ($createMerchant == null ? 43 : $createMerchant.hashCode());
        String $createOrg = this.getCreateOrg();
        result = result * 59 + ($createOrg == null ? 43 : $createOrg.hashCode());
        String $internalOrgId = this.getInternalOrgId();
        result = result * 59 + ($internalOrgId == null ? 43 : $internalOrgId.hashCode());
        String $creditCode = this.getCreditCode();
        result = result * 59 + ($creditCode == null ? 43 : $creditCode.hashCode());
        String $shortname = this.getShortname();
        result = result * 59 + ($shortname == null ? 43 : $shortname.hashCode());
        MultilingualVO $shortnameMul = this.getShortnameMul();
        result = result * 59 + ($shortnameMul == null ? 43 : $shortnameMul.hashCode());
        String $region = this.getRegion();
        result = result * 59 + ($region == null ? 43 : $region.hashCode());
        String $regionCode = this.getRegionCode();
        result = result * 59 + ($regionCode == null ? 43 : $regionCode.hashCode());
        String $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        String $postCode = this.getPostCode();
        result = result * 59 + ($postCode == null ? 43 : $postCode.hashCode());
        String $contactName = this.getContactName();
        result = result * 59 + ($contactName == null ? 43 : $contactName.hashCode());
        String $contactTel = this.getContactTel();
        result = result * 59 + ($contactTel == null ? 43 : $contactTel.hashCode());
        String $enterpriseNature = this.getEnterpriseNature();
        result = result * 59 + ($enterpriseNature == null ? 43 : $enterpriseNature.hashCode());
        String $licenseType = this.getLicenseType();
        result = result * 59 + ($licenseType == null ? 43 : $licenseType.hashCode());
        String $enterpriseName = this.getEnterpriseName();
        result = result * 59 + ($enterpriseName == null ? 43 : $enterpriseName.hashCode());
        String $leaderName = this.getLeaderName();
        result = result * 59 + ($leaderName == null ? 43 : $leaderName.hashCode());
        String $leaderNameIdNo = this.getLeaderNameIdNo();
        result = result * 59 + ($leaderNameIdNo == null ? 43 : $leaderNameIdNo.hashCode());
        String $businessLicense = this.getBusinessLicense();
        result = result * 59 + ($businessLicense == null ? 43 : $businessLicense.hashCode());
        String $businessLicenseNo = this.getBusinessLicenseNo();
        result = result * 59 + ($businessLicenseNo == null ? 43 : $businessLicenseNo.hashCode());
        String $buildTime = this.getBuildTime();
        result = result * 59 + ($buildTime == null ? 43 : $buildTime.hashCode());
        String $currencyCode = this.getCurrencyCode();
        result = result * 59 + ($currencyCode == null ? 43 : $currencyCode.hashCode());
        String $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        String $personName = this.getPersonName();
        result = result * 59 + ($personName == null ? 43 : $personName.hashCode());
        String $idNo = this.getIdNo();
        result = result * 59 + ($idNo == null ? 43 : $idNo.hashCode());
        String $personCharge = this.getPersonCharge();
        result = result * 59 + ($personCharge == null ? 43 : $personCharge.hashCode());
        String $personChargeIdNo = this.getPersonChargeIdNo();
        result = result * 59 + ($personChargeIdNo == null ? 43 : $personChargeIdNo.hashCode());
        String $invoicingCustomersCode = this.getInvoicingCustomersCode();
        result = result * 59 + ($invoicingCustomersCode == null ? 43 : $invoicingCustomersCode.hashCode());
        String $invoicingCustomersName = this.getInvoicingCustomersName();
        result = result * 59 + ($invoicingCustomersName == null ? 43 : $invoicingCustomersName.hashCode());
        String $customerClassCode = this.getCustomerClassCode();
        result = result * 59 + ($customerClassCode == null ? 43 : $customerClassCode.hashCode());
        String $customerClassName = this.getCustomerClassName();
        result = result * 59 + ($customerClassName == null ? 43 : $customerClassName.hashCode());
        String $customerClassPath = this.getCustomerClassPath();
        result = result * 59 + ($customerClassPath == null ? 43 : $customerClassPath.hashCode());
        String $website = this.getWebsite();
        result = result * 59 + ($website == null ? 43 : $website.hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        String $customerAreaName = this.getCustomerAreaName();
        result = result * 59 + ($customerAreaName == null ? 43 : $customerAreaName.hashCode());
        String $customerAreaCode = this.getCustomerAreaCode();
        result = result * 59 + ($customerAreaCode == null ? 43 : $customerAreaCode.hashCode());
        String $enterNature = this.getEnterNature();
        result = result * 59 + ($enterNature == null ? 43 : $enterNature.hashCode());
        String $fax = this.getFax();
        result = result * 59 + ($fax == null ? 43 : $fax.hashCode());
        String $logo = this.getLogo();
        result = result * 59 + ($logo == null ? 43 : $logo.hashCode());
        String $officialMobile = this.getOfficialMobile();
        result = result * 59 + ($officialMobile == null ? 43 : $officialMobile.hashCode());
        String $officialName = this.getOfficialName();
        result = result * 59 + ($officialName == null ? 43 : $officialName.hashCode());
        String $officialEmail = this.getOfficialEmail();
        result = result * 59 + ($officialEmail == null ? 43 : $officialEmail.hashCode());
        String $representativeMobile = this.getRepresentativeMobile();
        result = result * 59 + ($representativeMobile == null ? 43 : $representativeMobile.hashCode());
        String $representativeName = this.getRepresentativeName();
        result = result * 59 + ($representativeName == null ? 43 : $representativeName.hashCode());
        String $representativeEmail = this.getRepresentativeEmail();
        result = result * 59 + ($representativeEmail == null ? 43 : $representativeEmail.hashCode());
        String $businessterm = this.getBusinessterm();
        result = result * 59 + ($businessterm == null ? 43 : $businessterm.hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        String $transType = this.getTransType();
        result = result * 59 + ($transType == null ? 43 : $transType.hashCode());
        String $custCategoryCode = this.getCustCategoryCode();
        result = result * 59 + ($custCategoryCode == null ? 43 : $custCategoryCode.hashCode());
        String $custCategoryName = this.getCustCategoryName();
        result = result * 59 + ($custCategoryName == null ? 43 : $custCategoryName.hashCode());
        String $timeZone = this.getTimeZone();
        result = result * 59 + ($timeZone == null ? 43 : $timeZone.hashCode());
        String $newTimeZone = this.getNewTimeZone();
        result = result * 59 + ($newTimeZone == null ? 43 : $newTimeZone.hashCode());
        String $language = this.getLanguage();
        result = result * 59 + ($language == null ? 43 : $language.hashCode());
        String $customerTradeCode = this.getCustomerTradeCode();
        result = result * 59 + ($customerTradeCode == null ? 43 : $customerTradeCode.hashCode());
        String $customerTradeName = this.getCustomerTradeName();
        result = result * 59 + ($customerTradeName == null ? 43 : $customerTradeName.hashCode());
        String $saleAreaCode = this.getSaleAreaCode();
        result = result * 59 + ($saleAreaCode == null ? 43 : $saleAreaCode.hashCode());
        String $saleAreaName = this.getSaleAreaName();
        result = result * 59 + ($saleAreaName == null ? 43 : $saleAreaName.hashCode());
        String $saleAreaPath = this.getSaleAreaPath();
        result = result * 59 + ($saleAreaPath == null ? 43 : $saleAreaPath.hashCode());
        String $businessRole = this.getBusinessRole();
        result = result * 59 + ($businessRole == null ? 43 : $businessRole.hashCode());
        String $merchantsManagerMobile = this.getMerchantsManagerMobile();
        result = result * 59 + ($merchantsManagerMobile == null ? 43 : $merchantsManagerMobile.hashCode());
        String $merchantsManagerFullName = this.getMerchantsManagerFullName();
        result = result * 59 + ($merchantsManagerFullName == null ? 43 : $merchantsManagerFullName.hashCode());
        String $merchantsManagerEmail = this.getMerchantsManagerEmail();
        result = result * 59 + ($merchantsManagerEmail == null ? 43 : $merchantsManagerEmail.hashCode());
        BigDecimal $longitude = this.getLongitude();
        result = result * 59 + ($longitude == null ? 43 : ((Object)$longitude).hashCode());
        BigDecimal $latitude = this.getLatitude();
        result = result * 59 + ($latitude == null ? 43 : ((Object)$latitude).hashCode());
        String $merchantDefine1 = this.getMerchantDefine1();
        result = result * 59 + ($merchantDefine1 == null ? 43 : $merchantDefine1.hashCode());
        String $merchantDefine2 = this.getMerchantDefine2();
        result = result * 59 + ($merchantDefine2 == null ? 43 : $merchantDefine2.hashCode());
        String $merchantDefine3 = this.getMerchantDefine3();
        result = result * 59 + ($merchantDefine3 == null ? 43 : $merchantDefine3.hashCode());
        String $merchantDefine4 = this.getMerchantDefine4();
        result = result * 59 + ($merchantDefine4 == null ? 43 : $merchantDefine4.hashCode());
        String $merchantDefine5 = this.getMerchantDefine5();
        result = result * 59 + ($merchantDefine5 == null ? 43 : $merchantDefine5.hashCode());
        String $merchantDefine6 = this.getMerchantDefine6();
        result = result * 59 + ($merchantDefine6 == null ? 43 : $merchantDefine6.hashCode());
        String $merchantDefine7 = this.getMerchantDefine7();
        result = result * 59 + ($merchantDefine7 == null ? 43 : $merchantDefine7.hashCode());
        String $merchantDefine8 = this.getMerchantDefine8();
        result = result * 59 + ($merchantDefine8 == null ? 43 : $merchantDefine8.hashCode());
        String $merchantDefine9 = this.getMerchantDefine9();
        result = result * 59 + ($merchantDefine9 == null ? 43 : $merchantDefine9.hashCode());
        String $merchantDefine10 = this.getMerchantDefine10();
        result = result * 59 + ($merchantDefine10 == null ? 43 : $merchantDefine10.hashCode());
        String $merchantDefine11 = this.getMerchantDefine11();
        result = result * 59 + ($merchantDefine11 == null ? 43 : $merchantDefine11.hashCode());
        String $merchantDefine12 = this.getMerchantDefine12();
        result = result * 59 + ($merchantDefine12 == null ? 43 : $merchantDefine12.hashCode());
        String $merchantDefine13 = this.getMerchantDefine13();
        result = result * 59 + ($merchantDefine13 == null ? 43 : $merchantDefine13.hashCode());
        String $merchantDefine14 = this.getMerchantDefine14();
        result = result * 59 + ($merchantDefine14 == null ? 43 : $merchantDefine14.hashCode());
        String $merchantDefine15 = this.getMerchantDefine15();
        result = result * 59 + ($merchantDefine15 == null ? 43 : $merchantDefine15.hashCode());
        String $merchantDefine16 = this.getMerchantDefine16();
        result = result * 59 + ($merchantDefine16 == null ? 43 : $merchantDefine16.hashCode());
        String $merchantDefine17 = this.getMerchantDefine17();
        result = result * 59 + ($merchantDefine17 == null ? 43 : $merchantDefine17.hashCode());
        String $merchantDefine18 = this.getMerchantDefine18();
        result = result * 59 + ($merchantDefine18 == null ? 43 : $merchantDefine18.hashCode());
        String $merchantDefine19 = this.getMerchantDefine19();
        result = result * 59 + ($merchantDefine19 == null ? 43 : $merchantDefine19.hashCode());
        String $merchantDefine20 = this.getMerchantDefine20();
        result = result * 59 + ($merchantDefine20 == null ? 43 : $merchantDefine20.hashCode());
        String $merchantDefine21 = this.getMerchantDefine21();
        result = result * 59 + ($merchantDefine21 == null ? 43 : $merchantDefine21.hashCode());
        String $merchantDefine22 = this.getMerchantDefine22();
        result = result * 59 + ($merchantDefine22 == null ? 43 : $merchantDefine22.hashCode());
        String $merchantDefine23 = this.getMerchantDefine23();
        result = result * 59 + ($merchantDefine23 == null ? 43 : $merchantDefine23.hashCode());
        String $merchantDefine24 = this.getMerchantDefine24();
        result = result * 59 + ($merchantDefine24 == null ? 43 : $merchantDefine24.hashCode());
        String $merchantDefine25 = this.getMerchantDefine25();
        result = result * 59 + ($merchantDefine25 == null ? 43 : $merchantDefine25.hashCode());
        String $merchantDefine26 = this.getMerchantDefine26();
        result = result * 59 + ($merchantDefine26 == null ? 43 : $merchantDefine26.hashCode());
        String $merchantDefine27 = this.getMerchantDefine27();
        result = result * 59 + ($merchantDefine27 == null ? 43 : $merchantDefine27.hashCode());
        String $merchantDefine28 = this.getMerchantDefine28();
        result = result * 59 + ($merchantDefine28 == null ? 43 : $merchantDefine28.hashCode());
        String $merchantDefine29 = this.getMerchantDefine29();
        result = result * 59 + ($merchantDefine29 == null ? 43 : $merchantDefine29.hashCode());
        String $merchantDefine30 = this.getMerchantDefine30();
        result = result * 59 + ($merchantDefine30 == null ? 43 : $merchantDefine30.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantBaseDTO(id=" + this.getId() + ", name=" + this.getName() + ", nameMul=" + this.getNameMul() + ", code=" + this.getCode() + ", orgId=" + this.getOrgId() + ", createMerchant=" + this.getCreateMerchant() + ", createOrg=" + this.getCreateOrg() + ", internalOrg=" + this.getInternalOrg() + ", internalOrgId=" + this.getInternalOrgId() + ", creditCode=" + this.getCreditCode() + ", shortname=" + this.getShortname() + ", shortnameMul=" + this.getShortnameMul() + ", region=" + this.getRegion() + ", regionCode=" + this.getRegionCode() + ", address=" + this.getAddress() + ", postCode=" + this.getPostCode() + ", contactName=" + this.getContactName() + ", contactTel=" + this.getContactTel() + ", enterpriseNature=" + this.getEnterpriseNature() + ", licenseType=" + this.getLicenseType() + ", enterpriseName=" + this.getEnterpriseName() + ", leaderName=" + this.getLeaderName() + ", leaderNameIdNo=" + this.getLeaderNameIdNo() + ", businessLicense=" + this.getBusinessLicense() + ", businessLicenseNo=" + this.getBusinessLicenseNo() + ", buildTime=" + this.getBuildTime() + ", currencyCode=" + this.getCurrencyCode() + ", retailInvestors=" + this.getRetailInvestors() + ", country=" + this.getCountry() + ", suppliers=" + this.getSuppliers() + ", personName=" + this.getPersonName() + ", idNo=" + this.getIdNo() + ", personCharge=" + this.getPersonCharge() + ", personChargeIdNo=" + this.getPersonChargeIdNo() + ", invoicingCustomers=" + this.getInvoicingCustomers() + ", invoicingCustomersCode=" + this.getInvoicingCustomersCode() + ", invoicingCustomersName=" + this.getInvoicingCustomersName() + ", parentCustomer=" + this.getParentCustomer() + ", channCustomerClass=" + this.getChannCustomerClass() + ", channCustomerLevel=" + this.getChannCustomerLevel() + ", channCustomerLevelName=" + this.getChannCustomerLevelName() + ", channCustomerArea=" + this.getChannCustomerArea() + ", channCustomerIndustry=" + this.getChannCustomerIndustry() + ", channSpecialManagementDep=" + this.getChannSpecialManagementDep() + ", channProfessSalesman=" + this.getChannProfessSalesman() + ", customerClass=" + this.getCustomerClass() + ", customerClassCode=" + this.getCustomerClassCode() + ", customerClassName=" + this.getCustomerClassName() + ", customerClassEnd=" + this.getCustomerClassEnd() + ", customerClassPath=" + this.getCustomerClassPath() + ", customerIndustry=" + this.getCustomerIndustry() + ", taxPayingCategories=" + this.getTaxPayingCategories() + ", website=" + this.getWebsite() + ", email=" + this.getEmail() + ", merchantType=" + this.getMerchantType() + ", channelType=" + this.getChannelType() + ", customerArea=" + this.getCustomerArea() + ", customerAreaName=" + this.getCustomerAreaName() + ", customerAreaCode=" + this.getCustomerAreaCode() + ", enterNature=" + this.getEnterNature() + ", fax=" + this.getFax() + ", logo=" + this.getLogo() + ", parentManageOrg=" + this.getParentManageOrg() + ", officialMobile=" + this.getOfficialMobile() + ", officialName=" + this.getOfficialName() + ", officialEmail=" + this.getOfficialEmail() + ", representativeMobile=" + this.getRepresentativeMobile() + ", representativeName=" + this.getRepresentativeName() + ", representativeEmail=" + this.getRepresentativeEmail() + ", businessterm=" + this.getBusinessterm() + ", path=" + this.getPath() + ", transType=" + this.getTransType() + ", merchantOptions=" + this.getMerchantOptions() + ", custCategoryId=" + this.getCustCategoryId() + ", custCategoryCode=" + this.getCustCategoryCode() + ", custCategoryName=" + this.getCustCategoryName() + ", timeZone=" + this.getTimeZone() + ", newTimeZone=" + this.getNewTimeZone() + ", language=" + this.getLanguage() + ", scopeModel=" + this.getScopeModel() + ", customerTradeId=" + this.getCustomerTradeId() + ", customerTradeCode=" + this.getCustomerTradeCode() + ", customerTradeName=" + this.getCustomerTradeName() + ", saleAreaId=" + this.getSaleAreaId() + ", saleAreaCode=" + this.getSaleAreaCode() + ", saleAreaName=" + this.getSaleAreaName() + ", saleAreaPath=" + this.getSaleAreaPath() + ", businessRole=" + this.getBusinessRole() + ", merchantsManagerMobile=" + this.getMerchantsManagerMobile() + ", merchantsManagerFullName=" + this.getMerchantsManagerFullName() + ", merchantsManagerEmail=" + this.getMerchantsManagerEmail() + ", longitude=" + this.getLongitude() + ", latitude=" + this.getLatitude() + ", businessPartner=" + this.getBusinessPartner() + ", developmentPartner=" + this.getDevelopmentPartner() + ", merchantDefine1=" + this.getMerchantDefine1() + ", merchantDefine2=" + this.getMerchantDefine2() + ", merchantDefine3=" + this.getMerchantDefine3() + ", merchantDefine4=" + this.getMerchantDefine4() + ", merchantDefine5=" + this.getMerchantDefine5() + ", merchantDefine6=" + this.getMerchantDefine6() + ", merchantDefine7=" + this.getMerchantDefine7() + ", merchantDefine8=" + this.getMerchantDefine8() + ", merchantDefine9=" + this.getMerchantDefine9() + ", merchantDefine10=" + this.getMerchantDefine10() + ", merchantDefine11=" + this.getMerchantDefine11() + ", merchantDefine12=" + this.getMerchantDefine12() + ", merchantDefine13=" + this.getMerchantDefine13() + ", merchantDefine14=" + this.getMerchantDefine14() + ", merchantDefine15=" + this.getMerchantDefine15() + ", merchantDefine16=" + this.getMerchantDefine16() + ", merchantDefine17=" + this.getMerchantDefine17() + ", merchantDefine18=" + this.getMerchantDefine18() + ", merchantDefine19=" + this.getMerchantDefine19() + ", merchantDefine20=" + this.getMerchantDefine20() + ", merchantDefine21=" + this.getMerchantDefine21() + ", merchantDefine22=" + this.getMerchantDefine22() + ", merchantDefine23=" + this.getMerchantDefine23() + ", merchantDefine24=" + this.getMerchantDefine24() + ", merchantDefine25=" + this.getMerchantDefine25() + ", merchantDefine26=" + this.getMerchantDefine26() + ", merchantDefine27=" + this.getMerchantDefine27() + ", merchantDefine28=" + this.getMerchantDefine28() + ", merchantDefine29=" + this.getMerchantDefine29() + ", merchantDefine30=" + this.getMerchantDefine30() + ")";
    }
}

