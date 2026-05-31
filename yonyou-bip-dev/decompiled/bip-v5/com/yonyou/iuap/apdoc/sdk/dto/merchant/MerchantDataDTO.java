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
import com.yonyou.iuap.apdoc.sdk.dto.merchant.AddressInfoDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.AgentFinancialDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantApplyRangeDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantBillingDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantContacterDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantDetailDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantInvoiceDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantPrincipalDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantQualificationDocumentDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantRoleInfoDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantSaleAreaDataDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantsManagerDataDTO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyoucloud.iuap.upc.dto.ext.UPCEntityStatus;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantDataDTO
implements Serializable {
    private Long id;
    private String code;
    private MultiLangText name;
    private String createOrg;
    private String createOrg___code;
    private String createOrg___name;
    private String belongOrgId;
    private String belongOrgId___code;
    private String belongOrgId___name;
    private String transType;
    private String transType___code;
    private String transType___name;
    private MultiLangText shortname;
    private String country;
    private String country___code;
    private String country___name;
    private String newTimeZone;
    private String language;
    private String language___code;
    private String language___name;
    private Long parentCustomer;
    private String parentCustomer___code;
    private String parentCustomer___name;
    private Long suppliers;
    private String suppliers___code;
    private String suppliers___name;
    private Boolean retailInvestors;
    private Boolean internalOrg;
    private String internalOrgId;
    private String internalOrgId___code;
    private String internalOrgId___name;
    private String taxPayingCategories;
    private Long customerClass;
    private String customerClass___code;
    private String customerClass___name;
    private Long customerIndustry;
    private String customerIndustry___code;
    private String customerIndustry___name;
    private Long developmentPartner;
    private String developmentPartner___code;
    private String developmentPartner___name;
    private String parentManageOrg;
    private String parentManageOrg___code;
    private String parentManageOrg___name;
    private String personName;
    private String orgName;
    private String personCharge;
    private String personChargeIdNo;
    private String erpCode;
    private String merchantLogo;
    private String largeText1;
    private String largeText2;
    private String largeText3;
    private String largeText4;
    private String largeText5;
    private String frontIdCard;
    private String backIdCard;
    private String businessLicenseNew;
    private String certificate;
    private String orgCertificate;
    private String isFinancialSynergy;
    private Map<String, Object> merchantCharacter;
    private Map<String, Object> customExtend;
    private String enterpriseNature;
    private String enterpriseName;
    private String licenseType;
    private String creditCode;
    private String leaderName;
    private String leaderNameIdNo;
    private String businessLicenseNo;
    private Date businessterm;
    private String regionCode;
    private MultiLangText address;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private String contactName;
    private String contactTel;
    private String email;
    private String fax;
    private Date buildTime;
    private String enterNature;
    private String enterNature___code;
    private String enterNature___name;
    private String currencyCode;
    private String money;
    private String verfyMark;
    private Long peopleNum;
    private String scopeModel;
    private String yearMoney;
    private MultiLangText scope;
    private String website;
    private String wid;
    private String postCode;
    private Date pubts;
    private Date createDate;
    private Date createTime;
    private String creator;
    private Long creatorId;
    private String modifier;
    private Long modifierId;
    private Date modifyDate;
    private Date modifyTime;
    private MerchantRoleInfoDataDTO merchantRole;
    private MerchantsManagerDataDTO merchantsManager;
    private List<MerchantQualificationDocumentDataDTO> merchantQualificationDocuments;
    private List<MerchantInvoiceDataDTO> merchantAgentInvoiceInfos;
    private List<MerchantContacterDataDTO> merchantContactInfos;
    private List<AddressInfoDataDTO> merchantAddressInfos;
    private List<AgentFinancialDataDTO> merchantAgentFinancialInfos;
    private List<MerchantSaleAreaDataDTO> customerAreas;
    private List<MerchantPrincipalDataDTO> principals;
    private List<MerchantBillingDataDTO> invoicingCustomers;
    private List<MerchantApplyRangeDataDTO> merchantApplyRanges;
    private MerchantDetailDataDTO merchantAppliedDetail;
    private List<String> distributePrincipleOrgs;
    private String srcBill;
    private UPCEntityStatus entityStatus;
    private List<String> needBlankFieldList;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public MultiLangText getName() {
        return this.name;
    }

    public String getCreateOrg() {
        return this.createOrg;
    }

    public String getCreateOrg___code() {
        return this.createOrg___code;
    }

    public String getCreateOrg___name() {
        return this.createOrg___name;
    }

    public String getBelongOrgId() {
        return this.belongOrgId;
    }

    public String getBelongOrgId___code() {
        return this.belongOrgId___code;
    }

    public String getBelongOrgId___name() {
        return this.belongOrgId___name;
    }

    public String getTransType() {
        return this.transType;
    }

    public String getTransType___code() {
        return this.transType___code;
    }

    public String getTransType___name() {
        return this.transType___name;
    }

    public MultiLangText getShortname() {
        return this.shortname;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCountry___code() {
        return this.country___code;
    }

    public String getCountry___name() {
        return this.country___name;
    }

    public String getNewTimeZone() {
        return this.newTimeZone;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLanguage___code() {
        return this.language___code;
    }

    public String getLanguage___name() {
        return this.language___name;
    }

    public Long getParentCustomer() {
        return this.parentCustomer;
    }

    public String getParentCustomer___code() {
        return this.parentCustomer___code;
    }

    public String getParentCustomer___name() {
        return this.parentCustomer___name;
    }

    public Long getSuppliers() {
        return this.suppliers;
    }

    public String getSuppliers___code() {
        return this.suppliers___code;
    }

    public String getSuppliers___name() {
        return this.suppliers___name;
    }

    public Boolean getRetailInvestors() {
        return this.retailInvestors;
    }

    public Boolean getInternalOrg() {
        return this.internalOrg;
    }

    public String getInternalOrgId() {
        return this.internalOrgId;
    }

    public String getInternalOrgId___code() {
        return this.internalOrgId___code;
    }

    public String getInternalOrgId___name() {
        return this.internalOrgId___name;
    }

    public String getTaxPayingCategories() {
        return this.taxPayingCategories;
    }

    public Long getCustomerClass() {
        return this.customerClass;
    }

    public String getCustomerClass___code() {
        return this.customerClass___code;
    }

    public String getCustomerClass___name() {
        return this.customerClass___name;
    }

    public Long getCustomerIndustry() {
        return this.customerIndustry;
    }

    public String getCustomerIndustry___code() {
        return this.customerIndustry___code;
    }

    public String getCustomerIndustry___name() {
        return this.customerIndustry___name;
    }

    public Long getDevelopmentPartner() {
        return this.developmentPartner;
    }

    public String getDevelopmentPartner___code() {
        return this.developmentPartner___code;
    }

    public String getDevelopmentPartner___name() {
        return this.developmentPartner___name;
    }

    public String getParentManageOrg() {
        return this.parentManageOrg;
    }

    public String getParentManageOrg___code() {
        return this.parentManageOrg___code;
    }

    public String getParentManageOrg___name() {
        return this.parentManageOrg___name;
    }

    public String getPersonName() {
        return this.personName;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public String getPersonCharge() {
        return this.personCharge;
    }

    public String getPersonChargeIdNo() {
        return this.personChargeIdNo;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public String getMerchantLogo() {
        return this.merchantLogo;
    }

    public String getLargeText1() {
        return this.largeText1;
    }

    public String getLargeText2() {
        return this.largeText2;
    }

    public String getLargeText3() {
        return this.largeText3;
    }

    public String getLargeText4() {
        return this.largeText4;
    }

    public String getLargeText5() {
        return this.largeText5;
    }

    public String getFrontIdCard() {
        return this.frontIdCard;
    }

    public String getBackIdCard() {
        return this.backIdCard;
    }

    public String getBusinessLicenseNew() {
        return this.businessLicenseNew;
    }

    public String getCertificate() {
        return this.certificate;
    }

    public String getOrgCertificate() {
        return this.orgCertificate;
    }

    public String getIsFinancialSynergy() {
        return this.isFinancialSynergy;
    }

    public Map<String, Object> getMerchantCharacter() {
        return this.merchantCharacter;
    }

    public Map<String, Object> getCustomExtend() {
        return this.customExtend;
    }

    public String getEnterpriseNature() {
        return this.enterpriseNature;
    }

    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public String getLicenseType() {
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

    public String getBusinessLicenseNo() {
        return this.businessLicenseNo;
    }

    public Date getBusinessterm() {
        return this.businessterm;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public MultiLangText getAddress() {
        return this.address;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactTel() {
        return this.contactTel;
    }

    public String getEmail() {
        return this.email;
    }

    public String getFax() {
        return this.fax;
    }

    public Date getBuildTime() {
        return this.buildTime;
    }

    public String getEnterNature() {
        return this.enterNature;
    }

    public String getEnterNature___code() {
        return this.enterNature___code;
    }

    public String getEnterNature___name() {
        return this.enterNature___name;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public String getMoney() {
        return this.money;
    }

    public String getVerfyMark() {
        return this.verfyMark;
    }

    public Long getPeopleNum() {
        return this.peopleNum;
    }

    public String getScopeModel() {
        return this.scopeModel;
    }

    public String getYearMoney() {
        return this.yearMoney;
    }

    public MultiLangText getScope() {
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

    public Date getPubts() {
        return this.pubts;
    }

    public Date getCreateDate() {
        return this.createDate;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public String getCreator() {
        return this.creator;
    }

    public Long getCreatorId() {
        return this.creatorId;
    }

    public String getModifier() {
        return this.modifier;
    }

    public Long getModifierId() {
        return this.modifierId;
    }

    public Date getModifyDate() {
        return this.modifyDate;
    }

    public Date getModifyTime() {
        return this.modifyTime;
    }

    public MerchantRoleInfoDataDTO getMerchantRole() {
        return this.merchantRole;
    }

    public MerchantsManagerDataDTO getMerchantsManager() {
        return this.merchantsManager;
    }

    public List<MerchantQualificationDocumentDataDTO> getMerchantQualificationDocuments() {
        return this.merchantQualificationDocuments;
    }

    public List<MerchantInvoiceDataDTO> getMerchantAgentInvoiceInfos() {
        return this.merchantAgentInvoiceInfos;
    }

    public List<MerchantContacterDataDTO> getMerchantContactInfos() {
        return this.merchantContactInfos;
    }

    public List<AddressInfoDataDTO> getMerchantAddressInfos() {
        return this.merchantAddressInfos;
    }

    public List<AgentFinancialDataDTO> getMerchantAgentFinancialInfos() {
        return this.merchantAgentFinancialInfos;
    }

    public List<MerchantSaleAreaDataDTO> getCustomerAreas() {
        return this.customerAreas;
    }

    public List<MerchantPrincipalDataDTO> getPrincipals() {
        return this.principals;
    }

    public List<MerchantBillingDataDTO> getInvoicingCustomers() {
        return this.invoicingCustomers;
    }

    public List<MerchantApplyRangeDataDTO> getMerchantApplyRanges() {
        return this.merchantApplyRanges;
    }

    public MerchantDetailDataDTO getMerchantAppliedDetail() {
        return this.merchantAppliedDetail;
    }

    public List<String> getDistributePrincipleOrgs() {
        return this.distributePrincipleOrgs;
    }

    public String getSrcBill() {
        return this.srcBill;
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

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(MultiLangText name) {
        this.name = name;
    }

    public void setCreateOrg(String createOrg) {
        this.createOrg = createOrg;
    }

    public void setCreateOrg___code(String createOrg___code) {
        this.createOrg___code = createOrg___code;
    }

    public void setCreateOrg___name(String createOrg___name) {
        this.createOrg___name = createOrg___name;
    }

    public void setBelongOrgId(String belongOrgId) {
        this.belongOrgId = belongOrgId;
    }

    public void setBelongOrgId___code(String belongOrgId___code) {
        this.belongOrgId___code = belongOrgId___code;
    }

    public void setBelongOrgId___name(String belongOrgId___name) {
        this.belongOrgId___name = belongOrgId___name;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public void setTransType___code(String transType___code) {
        this.transType___code = transType___code;
    }

    public void setTransType___name(String transType___name) {
        this.transType___name = transType___name;
    }

    public void setShortname(MultiLangText shortname) {
        this.shortname = shortname;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCountry___code(String country___code) {
        this.country___code = country___code;
    }

    public void setCountry___name(String country___name) {
        this.country___name = country___name;
    }

    public void setNewTimeZone(String newTimeZone) {
        this.newTimeZone = newTimeZone;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLanguage___code(String language___code) {
        this.language___code = language___code;
    }

    public void setLanguage___name(String language___name) {
        this.language___name = language___name;
    }

    public void setParentCustomer(Long parentCustomer) {
        this.parentCustomer = parentCustomer;
    }

    public void setParentCustomer___code(String parentCustomer___code) {
        this.parentCustomer___code = parentCustomer___code;
    }

    public void setParentCustomer___name(String parentCustomer___name) {
        this.parentCustomer___name = parentCustomer___name;
    }

    public void setSuppliers(Long suppliers) {
        this.suppliers = suppliers;
    }

    public void setSuppliers___code(String suppliers___code) {
        this.suppliers___code = suppliers___code;
    }

    public void setSuppliers___name(String suppliers___name) {
        this.suppliers___name = suppliers___name;
    }

    public void setRetailInvestors(Boolean retailInvestors) {
        this.retailInvestors = retailInvestors;
    }

    public void setInternalOrg(Boolean internalOrg) {
        this.internalOrg = internalOrg;
    }

    public void setInternalOrgId(String internalOrgId) {
        this.internalOrgId = internalOrgId;
    }

    public void setInternalOrgId___code(String internalOrgId___code) {
        this.internalOrgId___code = internalOrgId___code;
    }

    public void setInternalOrgId___name(String internalOrgId___name) {
        this.internalOrgId___name = internalOrgId___name;
    }

    public void setTaxPayingCategories(String taxPayingCategories) {
        this.taxPayingCategories = taxPayingCategories;
    }

    public void setCustomerClass(Long customerClass) {
        this.customerClass = customerClass;
    }

    public void setCustomerClass___code(String customerClass___code) {
        this.customerClass___code = customerClass___code;
    }

    public void setCustomerClass___name(String customerClass___name) {
        this.customerClass___name = customerClass___name;
    }

    public void setCustomerIndustry(Long customerIndustry) {
        this.customerIndustry = customerIndustry;
    }

    public void setCustomerIndustry___code(String customerIndustry___code) {
        this.customerIndustry___code = customerIndustry___code;
    }

    public void setCustomerIndustry___name(String customerIndustry___name) {
        this.customerIndustry___name = customerIndustry___name;
    }

    public void setDevelopmentPartner(Long developmentPartner) {
        this.developmentPartner = developmentPartner;
    }

    public void setDevelopmentPartner___code(String developmentPartner___code) {
        this.developmentPartner___code = developmentPartner___code;
    }

    public void setDevelopmentPartner___name(String developmentPartner___name) {
        this.developmentPartner___name = developmentPartner___name;
    }

    public void setParentManageOrg(String parentManageOrg) {
        this.parentManageOrg = parentManageOrg;
    }

    public void setParentManageOrg___code(String parentManageOrg___code) {
        this.parentManageOrg___code = parentManageOrg___code;
    }

    public void setParentManageOrg___name(String parentManageOrg___name) {
        this.parentManageOrg___name = parentManageOrg___name;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public void setPersonCharge(String personCharge) {
        this.personCharge = personCharge;
    }

    public void setPersonChargeIdNo(String personChargeIdNo) {
        this.personChargeIdNo = personChargeIdNo;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setMerchantLogo(String merchantLogo) {
        this.merchantLogo = merchantLogo;
    }

    public void setLargeText1(String largeText1) {
        this.largeText1 = largeText1;
    }

    public void setLargeText2(String largeText2) {
        this.largeText2 = largeText2;
    }

    public void setLargeText3(String largeText3) {
        this.largeText3 = largeText3;
    }

    public void setLargeText4(String largeText4) {
        this.largeText4 = largeText4;
    }

    public void setLargeText5(String largeText5) {
        this.largeText5 = largeText5;
    }

    public void setFrontIdCard(String frontIdCard) {
        this.frontIdCard = frontIdCard;
    }

    public void setBackIdCard(String backIdCard) {
        this.backIdCard = backIdCard;
    }

    public void setBusinessLicenseNew(String businessLicenseNew) {
        this.businessLicenseNew = businessLicenseNew;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public void setOrgCertificate(String orgCertificate) {
        this.orgCertificate = orgCertificate;
    }

    public void setIsFinancialSynergy(String isFinancialSynergy) {
        this.isFinancialSynergy = isFinancialSynergy;
    }

    public void setMerchantCharacter(Map<String, Object> merchantCharacter) {
        this.merchantCharacter = merchantCharacter;
    }

    public void setCustomExtend(Map<String, Object> customExtend) {
        this.customExtend = customExtend;
    }

    public void setEnterpriseNature(String enterpriseNature) {
        this.enterpriseNature = enterpriseNature;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public void setLicenseType(String licenseType) {
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

    public void setBusinessLicenseNo(String businessLicenseNo) {
        this.businessLicenseNo = businessLicenseNo;
    }

    public void setBusinessterm(Date businessterm) {
        this.businessterm = businessterm;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public void setAddress(MultiLangText address) {
        this.address = address;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    public void setEnterNature(String enterNature) {
        this.enterNature = enterNature;
    }

    public void setEnterNature___code(String enterNature___code) {
        this.enterNature___code = enterNature___code;
    }

    public void setEnterNature___name(String enterNature___name) {
        this.enterNature___name = enterNature___name;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void setVerfyMark(String verfyMark) {
        this.verfyMark = verfyMark;
    }

    public void setPeopleNum(Long peopleNum) {
        this.peopleNum = peopleNum;
    }

    public void setScopeModel(String scopeModel) {
        this.scopeModel = scopeModel;
    }

    public void setYearMoney(String yearMoney) {
        this.yearMoney = yearMoney;
    }

    public void setScope(MultiLangText scope) {
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

    public void setPubts(Date pubts) {
        this.pubts = pubts;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public void setModifierId(Long modifierId) {
        this.modifierId = modifierId;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public void setMerchantRole(MerchantRoleInfoDataDTO merchantRole) {
        this.merchantRole = merchantRole;
    }

    public void setMerchantsManager(MerchantsManagerDataDTO merchantsManager) {
        this.merchantsManager = merchantsManager;
    }

    public void setMerchantQualificationDocuments(List<MerchantQualificationDocumentDataDTO> merchantQualificationDocuments) {
        this.merchantQualificationDocuments = merchantQualificationDocuments;
    }

    public void setMerchantAgentInvoiceInfos(List<MerchantInvoiceDataDTO> merchantAgentInvoiceInfos) {
        this.merchantAgentInvoiceInfos = merchantAgentInvoiceInfos;
    }

    public void setMerchantContactInfos(List<MerchantContacterDataDTO> merchantContactInfos) {
        this.merchantContactInfos = merchantContactInfos;
    }

    public void setMerchantAddressInfos(List<AddressInfoDataDTO> merchantAddressInfos) {
        this.merchantAddressInfos = merchantAddressInfos;
    }

    public void setMerchantAgentFinancialInfos(List<AgentFinancialDataDTO> merchantAgentFinancialInfos) {
        this.merchantAgentFinancialInfos = merchantAgentFinancialInfos;
    }

    public void setCustomerAreas(List<MerchantSaleAreaDataDTO> customerAreas) {
        this.customerAreas = customerAreas;
    }

    public void setPrincipals(List<MerchantPrincipalDataDTO> principals) {
        this.principals = principals;
    }

    public void setInvoicingCustomers(List<MerchantBillingDataDTO> invoicingCustomers) {
        this.invoicingCustomers = invoicingCustomers;
    }

    public void setMerchantApplyRanges(List<MerchantApplyRangeDataDTO> merchantApplyRanges) {
        this.merchantApplyRanges = merchantApplyRanges;
    }

    public void setMerchantAppliedDetail(MerchantDetailDataDTO merchantAppliedDetail) {
        this.merchantAppliedDetail = merchantAppliedDetail;
    }

    public void setDistributePrincipleOrgs(List<String> distributePrincipleOrgs) {
        this.distributePrincipleOrgs = distributePrincipleOrgs;
    }

    public void setSrcBill(String srcBill) {
        this.srcBill = srcBill;
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
        if (!(o instanceof MerchantDataDTO)) {
            return false;
        }
        MerchantDataDTO other = (MerchantDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$parentCustomer = this.getParentCustomer();
        Long other$parentCustomer = other.getParentCustomer();
        if (this$parentCustomer == null ? other$parentCustomer != null : !((Object)this$parentCustomer).equals(other$parentCustomer)) {
            return false;
        }
        Long this$suppliers = this.getSuppliers();
        Long other$suppliers = other.getSuppliers();
        if (this$suppliers == null ? other$suppliers != null : !((Object)this$suppliers).equals(other$suppliers)) {
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
        Long this$customerClass = this.getCustomerClass();
        Long other$customerClass = other.getCustomerClass();
        if (this$customerClass == null ? other$customerClass != null : !((Object)this$customerClass).equals(other$customerClass)) {
            return false;
        }
        Long this$customerIndustry = this.getCustomerIndustry();
        Long other$customerIndustry = other.getCustomerIndustry();
        if (this$customerIndustry == null ? other$customerIndustry != null : !((Object)this$customerIndustry).equals(other$customerIndustry)) {
            return false;
        }
        Long this$developmentPartner = this.getDevelopmentPartner();
        Long other$developmentPartner = other.getDevelopmentPartner();
        if (this$developmentPartner == null ? other$developmentPartner != null : !((Object)this$developmentPartner).equals(other$developmentPartner)) {
            return false;
        }
        Long this$peopleNum = this.getPeopleNum();
        Long other$peopleNum = other.getPeopleNum();
        if (this$peopleNum == null ? other$peopleNum != null : !((Object)this$peopleNum).equals(other$peopleNum)) {
            return false;
        }
        Long this$creatorId = this.getCreatorId();
        Long other$creatorId = other.getCreatorId();
        if (this$creatorId == null ? other$creatorId != null : !((Object)this$creatorId).equals(other$creatorId)) {
            return false;
        }
        Long this$modifierId = this.getModifierId();
        Long other$modifierId = other.getModifierId();
        if (this$modifierId == null ? other$modifierId != null : !((Object)this$modifierId).equals(other$modifierId)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        MultiLangText this$name = this.getName();
        MultiLangText other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$createOrg = this.getCreateOrg();
        String other$createOrg = other.getCreateOrg();
        if (this$createOrg == null ? other$createOrg != null : !this$createOrg.equals(other$createOrg)) {
            return false;
        }
        String this$createOrg___code = this.getCreateOrg___code();
        String other$createOrg___code = other.getCreateOrg___code();
        if (this$createOrg___code == null ? other$createOrg___code != null : !this$createOrg___code.equals(other$createOrg___code)) {
            return false;
        }
        String this$createOrg___name = this.getCreateOrg___name();
        String other$createOrg___name = other.getCreateOrg___name();
        if (this$createOrg___name == null ? other$createOrg___name != null : !this$createOrg___name.equals(other$createOrg___name)) {
            return false;
        }
        String this$belongOrgId = this.getBelongOrgId();
        String other$belongOrgId = other.getBelongOrgId();
        if (this$belongOrgId == null ? other$belongOrgId != null : !this$belongOrgId.equals(other$belongOrgId)) {
            return false;
        }
        String this$belongOrgId___code = this.getBelongOrgId___code();
        String other$belongOrgId___code = other.getBelongOrgId___code();
        if (this$belongOrgId___code == null ? other$belongOrgId___code != null : !this$belongOrgId___code.equals(other$belongOrgId___code)) {
            return false;
        }
        String this$belongOrgId___name = this.getBelongOrgId___name();
        String other$belongOrgId___name = other.getBelongOrgId___name();
        if (this$belongOrgId___name == null ? other$belongOrgId___name != null : !this$belongOrgId___name.equals(other$belongOrgId___name)) {
            return false;
        }
        String this$transType = this.getTransType();
        String other$transType = other.getTransType();
        if (this$transType == null ? other$transType != null : !this$transType.equals(other$transType)) {
            return false;
        }
        String this$transType___code = this.getTransType___code();
        String other$transType___code = other.getTransType___code();
        if (this$transType___code == null ? other$transType___code != null : !this$transType___code.equals(other$transType___code)) {
            return false;
        }
        String this$transType___name = this.getTransType___name();
        String other$transType___name = other.getTransType___name();
        if (this$transType___name == null ? other$transType___name != null : !this$transType___name.equals(other$transType___name)) {
            return false;
        }
        MultiLangText this$shortname = this.getShortname();
        MultiLangText other$shortname = other.getShortname();
        if (this$shortname == null ? other$shortname != null : !this$shortname.equals(other$shortname)) {
            return false;
        }
        String this$country = this.getCountry();
        String other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) {
            return false;
        }
        String this$country___code = this.getCountry___code();
        String other$country___code = other.getCountry___code();
        if (this$country___code == null ? other$country___code != null : !this$country___code.equals(other$country___code)) {
            return false;
        }
        String this$country___name = this.getCountry___name();
        String other$country___name = other.getCountry___name();
        if (this$country___name == null ? other$country___name != null : !this$country___name.equals(other$country___name)) {
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
        String this$language___code = this.getLanguage___code();
        String other$language___code = other.getLanguage___code();
        if (this$language___code == null ? other$language___code != null : !this$language___code.equals(other$language___code)) {
            return false;
        }
        String this$language___name = this.getLanguage___name();
        String other$language___name = other.getLanguage___name();
        if (this$language___name == null ? other$language___name != null : !this$language___name.equals(other$language___name)) {
            return false;
        }
        String this$parentCustomer___code = this.getParentCustomer___code();
        String other$parentCustomer___code = other.getParentCustomer___code();
        if (this$parentCustomer___code == null ? other$parentCustomer___code != null : !this$parentCustomer___code.equals(other$parentCustomer___code)) {
            return false;
        }
        String this$parentCustomer___name = this.getParentCustomer___name();
        String other$parentCustomer___name = other.getParentCustomer___name();
        if (this$parentCustomer___name == null ? other$parentCustomer___name != null : !this$parentCustomer___name.equals(other$parentCustomer___name)) {
            return false;
        }
        String this$suppliers___code = this.getSuppliers___code();
        String other$suppliers___code = other.getSuppliers___code();
        if (this$suppliers___code == null ? other$suppliers___code != null : !this$suppliers___code.equals(other$suppliers___code)) {
            return false;
        }
        String this$suppliers___name = this.getSuppliers___name();
        String other$suppliers___name = other.getSuppliers___name();
        if (this$suppliers___name == null ? other$suppliers___name != null : !this$suppliers___name.equals(other$suppliers___name)) {
            return false;
        }
        String this$internalOrgId = this.getInternalOrgId();
        String other$internalOrgId = other.getInternalOrgId();
        if (this$internalOrgId == null ? other$internalOrgId != null : !this$internalOrgId.equals(other$internalOrgId)) {
            return false;
        }
        String this$internalOrgId___code = this.getInternalOrgId___code();
        String other$internalOrgId___code = other.getInternalOrgId___code();
        if (this$internalOrgId___code == null ? other$internalOrgId___code != null : !this$internalOrgId___code.equals(other$internalOrgId___code)) {
            return false;
        }
        String this$internalOrgId___name = this.getInternalOrgId___name();
        String other$internalOrgId___name = other.getInternalOrgId___name();
        if (this$internalOrgId___name == null ? other$internalOrgId___name != null : !this$internalOrgId___name.equals(other$internalOrgId___name)) {
            return false;
        }
        String this$taxPayingCategories = this.getTaxPayingCategories();
        String other$taxPayingCategories = other.getTaxPayingCategories();
        if (this$taxPayingCategories == null ? other$taxPayingCategories != null : !this$taxPayingCategories.equals(other$taxPayingCategories)) {
            return false;
        }
        String this$customerClass___code = this.getCustomerClass___code();
        String other$customerClass___code = other.getCustomerClass___code();
        if (this$customerClass___code == null ? other$customerClass___code != null : !this$customerClass___code.equals(other$customerClass___code)) {
            return false;
        }
        String this$customerClass___name = this.getCustomerClass___name();
        String other$customerClass___name = other.getCustomerClass___name();
        if (this$customerClass___name == null ? other$customerClass___name != null : !this$customerClass___name.equals(other$customerClass___name)) {
            return false;
        }
        String this$customerIndustry___code = this.getCustomerIndustry___code();
        String other$customerIndustry___code = other.getCustomerIndustry___code();
        if (this$customerIndustry___code == null ? other$customerIndustry___code != null : !this$customerIndustry___code.equals(other$customerIndustry___code)) {
            return false;
        }
        String this$customerIndustry___name = this.getCustomerIndustry___name();
        String other$customerIndustry___name = other.getCustomerIndustry___name();
        if (this$customerIndustry___name == null ? other$customerIndustry___name != null : !this$customerIndustry___name.equals(other$customerIndustry___name)) {
            return false;
        }
        String this$developmentPartner___code = this.getDevelopmentPartner___code();
        String other$developmentPartner___code = other.getDevelopmentPartner___code();
        if (this$developmentPartner___code == null ? other$developmentPartner___code != null : !this$developmentPartner___code.equals(other$developmentPartner___code)) {
            return false;
        }
        String this$developmentPartner___name = this.getDevelopmentPartner___name();
        String other$developmentPartner___name = other.getDevelopmentPartner___name();
        if (this$developmentPartner___name == null ? other$developmentPartner___name != null : !this$developmentPartner___name.equals(other$developmentPartner___name)) {
            return false;
        }
        String this$parentManageOrg = this.getParentManageOrg();
        String other$parentManageOrg = other.getParentManageOrg();
        if (this$parentManageOrg == null ? other$parentManageOrg != null : !this$parentManageOrg.equals(other$parentManageOrg)) {
            return false;
        }
        String this$parentManageOrg___code = this.getParentManageOrg___code();
        String other$parentManageOrg___code = other.getParentManageOrg___code();
        if (this$parentManageOrg___code == null ? other$parentManageOrg___code != null : !this$parentManageOrg___code.equals(other$parentManageOrg___code)) {
            return false;
        }
        String this$parentManageOrg___name = this.getParentManageOrg___name();
        String other$parentManageOrg___name = other.getParentManageOrg___name();
        if (this$parentManageOrg___name == null ? other$parentManageOrg___name != null : !this$parentManageOrg___name.equals(other$parentManageOrg___name)) {
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
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String this$merchantLogo = this.getMerchantLogo();
        String other$merchantLogo = other.getMerchantLogo();
        if (this$merchantLogo == null ? other$merchantLogo != null : !this$merchantLogo.equals(other$merchantLogo)) {
            return false;
        }
        String this$largeText1 = this.getLargeText1();
        String other$largeText1 = other.getLargeText1();
        if (this$largeText1 == null ? other$largeText1 != null : !this$largeText1.equals(other$largeText1)) {
            return false;
        }
        String this$largeText2 = this.getLargeText2();
        String other$largeText2 = other.getLargeText2();
        if (this$largeText2 == null ? other$largeText2 != null : !this$largeText2.equals(other$largeText2)) {
            return false;
        }
        String this$largeText3 = this.getLargeText3();
        String other$largeText3 = other.getLargeText3();
        if (this$largeText3 == null ? other$largeText3 != null : !this$largeText3.equals(other$largeText3)) {
            return false;
        }
        String this$largeText4 = this.getLargeText4();
        String other$largeText4 = other.getLargeText4();
        if (this$largeText4 == null ? other$largeText4 != null : !this$largeText4.equals(other$largeText4)) {
            return false;
        }
        String this$largeText5 = this.getLargeText5();
        String other$largeText5 = other.getLargeText5();
        if (this$largeText5 == null ? other$largeText5 != null : !this$largeText5.equals(other$largeText5)) {
            return false;
        }
        String this$frontIdCard = this.getFrontIdCard();
        String other$frontIdCard = other.getFrontIdCard();
        if (this$frontIdCard == null ? other$frontIdCard != null : !this$frontIdCard.equals(other$frontIdCard)) {
            return false;
        }
        String this$backIdCard = this.getBackIdCard();
        String other$backIdCard = other.getBackIdCard();
        if (this$backIdCard == null ? other$backIdCard != null : !this$backIdCard.equals(other$backIdCard)) {
            return false;
        }
        String this$businessLicenseNew = this.getBusinessLicenseNew();
        String other$businessLicenseNew = other.getBusinessLicenseNew();
        if (this$businessLicenseNew == null ? other$businessLicenseNew != null : !this$businessLicenseNew.equals(other$businessLicenseNew)) {
            return false;
        }
        String this$certificate = this.getCertificate();
        String other$certificate = other.getCertificate();
        if (this$certificate == null ? other$certificate != null : !this$certificate.equals(other$certificate)) {
            return false;
        }
        String this$orgCertificate = this.getOrgCertificate();
        String other$orgCertificate = other.getOrgCertificate();
        if (this$orgCertificate == null ? other$orgCertificate != null : !this$orgCertificate.equals(other$orgCertificate)) {
            return false;
        }
        String this$isFinancialSynergy = this.getIsFinancialSynergy();
        String other$isFinancialSynergy = other.getIsFinancialSynergy();
        if (this$isFinancialSynergy == null ? other$isFinancialSynergy != null : !this$isFinancialSynergy.equals(other$isFinancialSynergy)) {
            return false;
        }
        Map<String, Object> this$merchantCharacter = this.getMerchantCharacter();
        Map<String, Object> other$merchantCharacter = other.getMerchantCharacter();
        if (this$merchantCharacter == null ? other$merchantCharacter != null : !((Object)this$merchantCharacter).equals(other$merchantCharacter)) {
            return false;
        }
        Map<String, Object> this$customExtend = this.getCustomExtend();
        Map<String, Object> other$customExtend = other.getCustomExtend();
        if (this$customExtend == null ? other$customExtend != null : !((Object)this$customExtend).equals(other$customExtend)) {
            return false;
        }
        String this$enterpriseNature = this.getEnterpriseNature();
        String other$enterpriseNature = other.getEnterpriseNature();
        if (this$enterpriseNature == null ? other$enterpriseNature != null : !this$enterpriseNature.equals(other$enterpriseNature)) {
            return false;
        }
        String this$enterpriseName = this.getEnterpriseName();
        String other$enterpriseName = other.getEnterpriseName();
        if (this$enterpriseName == null ? other$enterpriseName != null : !this$enterpriseName.equals(other$enterpriseName)) {
            return false;
        }
        String this$licenseType = this.getLicenseType();
        String other$licenseType = other.getLicenseType();
        if (this$licenseType == null ? other$licenseType != null : !this$licenseType.equals(other$licenseType)) {
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
        String this$businessLicenseNo = this.getBusinessLicenseNo();
        String other$businessLicenseNo = other.getBusinessLicenseNo();
        if (this$businessLicenseNo == null ? other$businessLicenseNo != null : !this$businessLicenseNo.equals(other$businessLicenseNo)) {
            return false;
        }
        Date this$businessterm = this.getBusinessterm();
        Date other$businessterm = other.getBusinessterm();
        if (this$businessterm == null ? other$businessterm != null : !((Object)this$businessterm).equals(other$businessterm)) {
            return false;
        }
        String this$regionCode = this.getRegionCode();
        String other$regionCode = other.getRegionCode();
        if (this$regionCode == null ? other$regionCode != null : !this$regionCode.equals(other$regionCode)) {
            return false;
        }
        MultiLangText this$address = this.getAddress();
        MultiLangText other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) {
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
        Date this$buildTime = this.getBuildTime();
        Date other$buildTime = other.getBuildTime();
        if (this$buildTime == null ? other$buildTime != null : !((Object)this$buildTime).equals(other$buildTime)) {
            return false;
        }
        String this$enterNature = this.getEnterNature();
        String other$enterNature = other.getEnterNature();
        if (this$enterNature == null ? other$enterNature != null : !this$enterNature.equals(other$enterNature)) {
            return false;
        }
        String this$enterNature___code = this.getEnterNature___code();
        String other$enterNature___code = other.getEnterNature___code();
        if (this$enterNature___code == null ? other$enterNature___code != null : !this$enterNature___code.equals(other$enterNature___code)) {
            return false;
        }
        String this$enterNature___name = this.getEnterNature___name();
        String other$enterNature___name = other.getEnterNature___name();
        if (this$enterNature___name == null ? other$enterNature___name != null : !this$enterNature___name.equals(other$enterNature___name)) {
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
        String this$verfyMark = this.getVerfyMark();
        String other$verfyMark = other.getVerfyMark();
        if (this$verfyMark == null ? other$verfyMark != null : !this$verfyMark.equals(other$verfyMark)) {
            return false;
        }
        String this$scopeModel = this.getScopeModel();
        String other$scopeModel = other.getScopeModel();
        if (this$scopeModel == null ? other$scopeModel != null : !this$scopeModel.equals(other$scopeModel)) {
            return false;
        }
        String this$yearMoney = this.getYearMoney();
        String other$yearMoney = other.getYearMoney();
        if (this$yearMoney == null ? other$yearMoney != null : !this$yearMoney.equals(other$yearMoney)) {
            return false;
        }
        MultiLangText this$scope = this.getScope();
        MultiLangText other$scope = other.getScope();
        if (this$scope == null ? other$scope != null : !this$scope.equals(other$scope)) {
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
        Date this$pubts = this.getPubts();
        Date other$pubts = other.getPubts();
        if (this$pubts == null ? other$pubts != null : !((Object)this$pubts).equals(other$pubts)) {
            return false;
        }
        Date this$createDate = this.getCreateDate();
        Date other$createDate = other.getCreateDate();
        if (this$createDate == null ? other$createDate != null : !((Object)this$createDate).equals(other$createDate)) {
            return false;
        }
        Date this$createTime = this.getCreateTime();
        Date other$createTime = other.getCreateTime();
        if (this$createTime == null ? other$createTime != null : !((Object)this$createTime).equals(other$createTime)) {
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
        Date this$modifyDate = this.getModifyDate();
        Date other$modifyDate = other.getModifyDate();
        if (this$modifyDate == null ? other$modifyDate != null : !((Object)this$modifyDate).equals(other$modifyDate)) {
            return false;
        }
        Date this$modifyTime = this.getModifyTime();
        Date other$modifyTime = other.getModifyTime();
        if (this$modifyTime == null ? other$modifyTime != null : !((Object)this$modifyTime).equals(other$modifyTime)) {
            return false;
        }
        MerchantRoleInfoDataDTO this$merchantRole = this.getMerchantRole();
        MerchantRoleInfoDataDTO other$merchantRole = other.getMerchantRole();
        if (this$merchantRole == null ? other$merchantRole != null : !((Object)this$merchantRole).equals(other$merchantRole)) {
            return false;
        }
        MerchantsManagerDataDTO this$merchantsManager = this.getMerchantsManager();
        MerchantsManagerDataDTO other$merchantsManager = other.getMerchantsManager();
        if (this$merchantsManager == null ? other$merchantsManager != null : !((Object)this$merchantsManager).equals(other$merchantsManager)) {
            return false;
        }
        List<MerchantQualificationDocumentDataDTO> this$merchantQualificationDocuments = this.getMerchantQualificationDocuments();
        List<MerchantQualificationDocumentDataDTO> other$merchantQualificationDocuments = other.getMerchantQualificationDocuments();
        if (this$merchantQualificationDocuments == null ? other$merchantQualificationDocuments != null : !((Object)this$merchantQualificationDocuments).equals(other$merchantQualificationDocuments)) {
            return false;
        }
        List<MerchantInvoiceDataDTO> this$merchantAgentInvoiceInfos = this.getMerchantAgentInvoiceInfos();
        List<MerchantInvoiceDataDTO> other$merchantAgentInvoiceInfos = other.getMerchantAgentInvoiceInfos();
        if (this$merchantAgentInvoiceInfos == null ? other$merchantAgentInvoiceInfos != null : !((Object)this$merchantAgentInvoiceInfos).equals(other$merchantAgentInvoiceInfos)) {
            return false;
        }
        List<MerchantContacterDataDTO> this$merchantContactInfos = this.getMerchantContactInfos();
        List<MerchantContacterDataDTO> other$merchantContactInfos = other.getMerchantContactInfos();
        if (this$merchantContactInfos == null ? other$merchantContactInfos != null : !((Object)this$merchantContactInfos).equals(other$merchantContactInfos)) {
            return false;
        }
        List<AddressInfoDataDTO> this$merchantAddressInfos = this.getMerchantAddressInfos();
        List<AddressInfoDataDTO> other$merchantAddressInfos = other.getMerchantAddressInfos();
        if (this$merchantAddressInfos == null ? other$merchantAddressInfos != null : !((Object)this$merchantAddressInfos).equals(other$merchantAddressInfos)) {
            return false;
        }
        List<AgentFinancialDataDTO> this$merchantAgentFinancialInfos = this.getMerchantAgentFinancialInfos();
        List<AgentFinancialDataDTO> other$merchantAgentFinancialInfos = other.getMerchantAgentFinancialInfos();
        if (this$merchantAgentFinancialInfos == null ? other$merchantAgentFinancialInfos != null : !((Object)this$merchantAgentFinancialInfos).equals(other$merchantAgentFinancialInfos)) {
            return false;
        }
        List<MerchantSaleAreaDataDTO> this$customerAreas = this.getCustomerAreas();
        List<MerchantSaleAreaDataDTO> other$customerAreas = other.getCustomerAreas();
        if (this$customerAreas == null ? other$customerAreas != null : !((Object)this$customerAreas).equals(other$customerAreas)) {
            return false;
        }
        List<MerchantPrincipalDataDTO> this$principals = this.getPrincipals();
        List<MerchantPrincipalDataDTO> other$principals = other.getPrincipals();
        if (this$principals == null ? other$principals != null : !((Object)this$principals).equals(other$principals)) {
            return false;
        }
        List<MerchantBillingDataDTO> this$invoicingCustomers = this.getInvoicingCustomers();
        List<MerchantBillingDataDTO> other$invoicingCustomers = other.getInvoicingCustomers();
        if (this$invoicingCustomers == null ? other$invoicingCustomers != null : !((Object)this$invoicingCustomers).equals(other$invoicingCustomers)) {
            return false;
        }
        List<MerchantApplyRangeDataDTO> this$merchantApplyRanges = this.getMerchantApplyRanges();
        List<MerchantApplyRangeDataDTO> other$merchantApplyRanges = other.getMerchantApplyRanges();
        if (this$merchantApplyRanges == null ? other$merchantApplyRanges != null : !((Object)this$merchantApplyRanges).equals(other$merchantApplyRanges)) {
            return false;
        }
        MerchantDetailDataDTO this$merchantAppliedDetail = this.getMerchantAppliedDetail();
        MerchantDetailDataDTO other$merchantAppliedDetail = other.getMerchantAppliedDetail();
        if (this$merchantAppliedDetail == null ? other$merchantAppliedDetail != null : !((Object)this$merchantAppliedDetail).equals(other$merchantAppliedDetail)) {
            return false;
        }
        List<String> this$distributePrincipleOrgs = this.getDistributePrincipleOrgs();
        List<String> other$distributePrincipleOrgs = other.getDistributePrincipleOrgs();
        if (this$distributePrincipleOrgs == null ? other$distributePrincipleOrgs != null : !((Object)this$distributePrincipleOrgs).equals(other$distributePrincipleOrgs)) {
            return false;
        }
        String this$srcBill = this.getSrcBill();
        String other$srcBill = other.getSrcBill();
        if (this$srcBill == null ? other$srcBill != null : !this$srcBill.equals(other$srcBill)) {
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
        return other instanceof MerchantDataDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $parentCustomer = this.getParentCustomer();
        result = result * 59 + ($parentCustomer == null ? 43 : ((Object)$parentCustomer).hashCode());
        Long $suppliers = this.getSuppliers();
        result = result * 59 + ($suppliers == null ? 43 : ((Object)$suppliers).hashCode());
        Boolean $retailInvestors = this.getRetailInvestors();
        result = result * 59 + ($retailInvestors == null ? 43 : ((Object)$retailInvestors).hashCode());
        Boolean $internalOrg = this.getInternalOrg();
        result = result * 59 + ($internalOrg == null ? 43 : ((Object)$internalOrg).hashCode());
        Long $customerClass = this.getCustomerClass();
        result = result * 59 + ($customerClass == null ? 43 : ((Object)$customerClass).hashCode());
        Long $customerIndustry = this.getCustomerIndustry();
        result = result * 59 + ($customerIndustry == null ? 43 : ((Object)$customerIndustry).hashCode());
        Long $developmentPartner = this.getDevelopmentPartner();
        result = result * 59 + ($developmentPartner == null ? 43 : ((Object)$developmentPartner).hashCode());
        Long $peopleNum = this.getPeopleNum();
        result = result * 59 + ($peopleNum == null ? 43 : ((Object)$peopleNum).hashCode());
        Long $creatorId = this.getCreatorId();
        result = result * 59 + ($creatorId == null ? 43 : ((Object)$creatorId).hashCode());
        Long $modifierId = this.getModifierId();
        result = result * 59 + ($modifierId == null ? 43 : ((Object)$modifierId).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        MultiLangText $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $createOrg = this.getCreateOrg();
        result = result * 59 + ($createOrg == null ? 43 : $createOrg.hashCode());
        String $createOrg___code = this.getCreateOrg___code();
        result = result * 59 + ($createOrg___code == null ? 43 : $createOrg___code.hashCode());
        String $createOrg___name = this.getCreateOrg___name();
        result = result * 59 + ($createOrg___name == null ? 43 : $createOrg___name.hashCode());
        String $belongOrgId = this.getBelongOrgId();
        result = result * 59 + ($belongOrgId == null ? 43 : $belongOrgId.hashCode());
        String $belongOrgId___code = this.getBelongOrgId___code();
        result = result * 59 + ($belongOrgId___code == null ? 43 : $belongOrgId___code.hashCode());
        String $belongOrgId___name = this.getBelongOrgId___name();
        result = result * 59 + ($belongOrgId___name == null ? 43 : $belongOrgId___name.hashCode());
        String $transType = this.getTransType();
        result = result * 59 + ($transType == null ? 43 : $transType.hashCode());
        String $transType___code = this.getTransType___code();
        result = result * 59 + ($transType___code == null ? 43 : $transType___code.hashCode());
        String $transType___name = this.getTransType___name();
        result = result * 59 + ($transType___name == null ? 43 : $transType___name.hashCode());
        MultiLangText $shortname = this.getShortname();
        result = result * 59 + ($shortname == null ? 43 : $shortname.hashCode());
        String $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        String $country___code = this.getCountry___code();
        result = result * 59 + ($country___code == null ? 43 : $country___code.hashCode());
        String $country___name = this.getCountry___name();
        result = result * 59 + ($country___name == null ? 43 : $country___name.hashCode());
        String $newTimeZone = this.getNewTimeZone();
        result = result * 59 + ($newTimeZone == null ? 43 : $newTimeZone.hashCode());
        String $language = this.getLanguage();
        result = result * 59 + ($language == null ? 43 : $language.hashCode());
        String $language___code = this.getLanguage___code();
        result = result * 59 + ($language___code == null ? 43 : $language___code.hashCode());
        String $language___name = this.getLanguage___name();
        result = result * 59 + ($language___name == null ? 43 : $language___name.hashCode());
        String $parentCustomer___code = this.getParentCustomer___code();
        result = result * 59 + ($parentCustomer___code == null ? 43 : $parentCustomer___code.hashCode());
        String $parentCustomer___name = this.getParentCustomer___name();
        result = result * 59 + ($parentCustomer___name == null ? 43 : $parentCustomer___name.hashCode());
        String $suppliers___code = this.getSuppliers___code();
        result = result * 59 + ($suppliers___code == null ? 43 : $suppliers___code.hashCode());
        String $suppliers___name = this.getSuppliers___name();
        result = result * 59 + ($suppliers___name == null ? 43 : $suppliers___name.hashCode());
        String $internalOrgId = this.getInternalOrgId();
        result = result * 59 + ($internalOrgId == null ? 43 : $internalOrgId.hashCode());
        String $internalOrgId___code = this.getInternalOrgId___code();
        result = result * 59 + ($internalOrgId___code == null ? 43 : $internalOrgId___code.hashCode());
        String $internalOrgId___name = this.getInternalOrgId___name();
        result = result * 59 + ($internalOrgId___name == null ? 43 : $internalOrgId___name.hashCode());
        String $taxPayingCategories = this.getTaxPayingCategories();
        result = result * 59 + ($taxPayingCategories == null ? 43 : $taxPayingCategories.hashCode());
        String $customerClass___code = this.getCustomerClass___code();
        result = result * 59 + ($customerClass___code == null ? 43 : $customerClass___code.hashCode());
        String $customerClass___name = this.getCustomerClass___name();
        result = result * 59 + ($customerClass___name == null ? 43 : $customerClass___name.hashCode());
        String $customerIndustry___code = this.getCustomerIndustry___code();
        result = result * 59 + ($customerIndustry___code == null ? 43 : $customerIndustry___code.hashCode());
        String $customerIndustry___name = this.getCustomerIndustry___name();
        result = result * 59 + ($customerIndustry___name == null ? 43 : $customerIndustry___name.hashCode());
        String $developmentPartner___code = this.getDevelopmentPartner___code();
        result = result * 59 + ($developmentPartner___code == null ? 43 : $developmentPartner___code.hashCode());
        String $developmentPartner___name = this.getDevelopmentPartner___name();
        result = result * 59 + ($developmentPartner___name == null ? 43 : $developmentPartner___name.hashCode());
        String $parentManageOrg = this.getParentManageOrg();
        result = result * 59 + ($parentManageOrg == null ? 43 : $parentManageOrg.hashCode());
        String $parentManageOrg___code = this.getParentManageOrg___code();
        result = result * 59 + ($parentManageOrg___code == null ? 43 : $parentManageOrg___code.hashCode());
        String $parentManageOrg___name = this.getParentManageOrg___name();
        result = result * 59 + ($parentManageOrg___name == null ? 43 : $parentManageOrg___name.hashCode());
        String $personName = this.getPersonName();
        result = result * 59 + ($personName == null ? 43 : $personName.hashCode());
        String $orgName = this.getOrgName();
        result = result * 59 + ($orgName == null ? 43 : $orgName.hashCode());
        String $personCharge = this.getPersonCharge();
        result = result * 59 + ($personCharge == null ? 43 : $personCharge.hashCode());
        String $personChargeIdNo = this.getPersonChargeIdNo();
        result = result * 59 + ($personChargeIdNo == null ? 43 : $personChargeIdNo.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $merchantLogo = this.getMerchantLogo();
        result = result * 59 + ($merchantLogo == null ? 43 : $merchantLogo.hashCode());
        String $largeText1 = this.getLargeText1();
        result = result * 59 + ($largeText1 == null ? 43 : $largeText1.hashCode());
        String $largeText2 = this.getLargeText2();
        result = result * 59 + ($largeText2 == null ? 43 : $largeText2.hashCode());
        String $largeText3 = this.getLargeText3();
        result = result * 59 + ($largeText3 == null ? 43 : $largeText3.hashCode());
        String $largeText4 = this.getLargeText4();
        result = result * 59 + ($largeText4 == null ? 43 : $largeText4.hashCode());
        String $largeText5 = this.getLargeText5();
        result = result * 59 + ($largeText5 == null ? 43 : $largeText5.hashCode());
        String $frontIdCard = this.getFrontIdCard();
        result = result * 59 + ($frontIdCard == null ? 43 : $frontIdCard.hashCode());
        String $backIdCard = this.getBackIdCard();
        result = result * 59 + ($backIdCard == null ? 43 : $backIdCard.hashCode());
        String $businessLicenseNew = this.getBusinessLicenseNew();
        result = result * 59 + ($businessLicenseNew == null ? 43 : $businessLicenseNew.hashCode());
        String $certificate = this.getCertificate();
        result = result * 59 + ($certificate == null ? 43 : $certificate.hashCode());
        String $orgCertificate = this.getOrgCertificate();
        result = result * 59 + ($orgCertificate == null ? 43 : $orgCertificate.hashCode());
        String $isFinancialSynergy = this.getIsFinancialSynergy();
        result = result * 59 + ($isFinancialSynergy == null ? 43 : $isFinancialSynergy.hashCode());
        Map<String, Object> $merchantCharacter = this.getMerchantCharacter();
        result = result * 59 + ($merchantCharacter == null ? 43 : ((Object)$merchantCharacter).hashCode());
        Map<String, Object> $customExtend = this.getCustomExtend();
        result = result * 59 + ($customExtend == null ? 43 : ((Object)$customExtend).hashCode());
        String $enterpriseNature = this.getEnterpriseNature();
        result = result * 59 + ($enterpriseNature == null ? 43 : $enterpriseNature.hashCode());
        String $enterpriseName = this.getEnterpriseName();
        result = result * 59 + ($enterpriseName == null ? 43 : $enterpriseName.hashCode());
        String $licenseType = this.getLicenseType();
        result = result * 59 + ($licenseType == null ? 43 : $licenseType.hashCode());
        String $creditCode = this.getCreditCode();
        result = result * 59 + ($creditCode == null ? 43 : $creditCode.hashCode());
        String $leaderName = this.getLeaderName();
        result = result * 59 + ($leaderName == null ? 43 : $leaderName.hashCode());
        String $leaderNameIdNo = this.getLeaderNameIdNo();
        result = result * 59 + ($leaderNameIdNo == null ? 43 : $leaderNameIdNo.hashCode());
        String $businessLicenseNo = this.getBusinessLicenseNo();
        result = result * 59 + ($businessLicenseNo == null ? 43 : $businessLicenseNo.hashCode());
        Date $businessterm = this.getBusinessterm();
        result = result * 59 + ($businessterm == null ? 43 : ((Object)$businessterm).hashCode());
        String $regionCode = this.getRegionCode();
        result = result * 59 + ($regionCode == null ? 43 : $regionCode.hashCode());
        MultiLangText $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        BigDecimal $longitude = this.getLongitude();
        result = result * 59 + ($longitude == null ? 43 : ((Object)$longitude).hashCode());
        BigDecimal $latitude = this.getLatitude();
        result = result * 59 + ($latitude == null ? 43 : ((Object)$latitude).hashCode());
        String $contactName = this.getContactName();
        result = result * 59 + ($contactName == null ? 43 : $contactName.hashCode());
        String $contactTel = this.getContactTel();
        result = result * 59 + ($contactTel == null ? 43 : $contactTel.hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        String $fax = this.getFax();
        result = result * 59 + ($fax == null ? 43 : $fax.hashCode());
        Date $buildTime = this.getBuildTime();
        result = result * 59 + ($buildTime == null ? 43 : ((Object)$buildTime).hashCode());
        String $enterNature = this.getEnterNature();
        result = result * 59 + ($enterNature == null ? 43 : $enterNature.hashCode());
        String $enterNature___code = this.getEnterNature___code();
        result = result * 59 + ($enterNature___code == null ? 43 : $enterNature___code.hashCode());
        String $enterNature___name = this.getEnterNature___name();
        result = result * 59 + ($enterNature___name == null ? 43 : $enterNature___name.hashCode());
        String $currencyCode = this.getCurrencyCode();
        result = result * 59 + ($currencyCode == null ? 43 : $currencyCode.hashCode());
        String $money = this.getMoney();
        result = result * 59 + ($money == null ? 43 : $money.hashCode());
        String $verfyMark = this.getVerfyMark();
        result = result * 59 + ($verfyMark == null ? 43 : $verfyMark.hashCode());
        String $scopeModel = this.getScopeModel();
        result = result * 59 + ($scopeModel == null ? 43 : $scopeModel.hashCode());
        String $yearMoney = this.getYearMoney();
        result = result * 59 + ($yearMoney == null ? 43 : $yearMoney.hashCode());
        MultiLangText $scope = this.getScope();
        result = result * 59 + ($scope == null ? 43 : $scope.hashCode());
        String $website = this.getWebsite();
        result = result * 59 + ($website == null ? 43 : $website.hashCode());
        String $wid = this.getWid();
        result = result * 59 + ($wid == null ? 43 : $wid.hashCode());
        String $postCode = this.getPostCode();
        result = result * 59 + ($postCode == null ? 43 : $postCode.hashCode());
        Date $pubts = this.getPubts();
        result = result * 59 + ($pubts == null ? 43 : ((Object)$pubts).hashCode());
        Date $createDate = this.getCreateDate();
        result = result * 59 + ($createDate == null ? 43 : ((Object)$createDate).hashCode());
        Date $createTime = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : ((Object)$createTime).hashCode());
        String $creator = this.getCreator();
        result = result * 59 + ($creator == null ? 43 : $creator.hashCode());
        String $modifier = this.getModifier();
        result = result * 59 + ($modifier == null ? 43 : $modifier.hashCode());
        Date $modifyDate = this.getModifyDate();
        result = result * 59 + ($modifyDate == null ? 43 : ((Object)$modifyDate).hashCode());
        Date $modifyTime = this.getModifyTime();
        result = result * 59 + ($modifyTime == null ? 43 : ((Object)$modifyTime).hashCode());
        MerchantRoleInfoDataDTO $merchantRole = this.getMerchantRole();
        result = result * 59 + ($merchantRole == null ? 43 : ((Object)$merchantRole).hashCode());
        MerchantsManagerDataDTO $merchantsManager = this.getMerchantsManager();
        result = result * 59 + ($merchantsManager == null ? 43 : ((Object)$merchantsManager).hashCode());
        List<MerchantQualificationDocumentDataDTO> $merchantQualificationDocuments = this.getMerchantQualificationDocuments();
        result = result * 59 + ($merchantQualificationDocuments == null ? 43 : ((Object)$merchantQualificationDocuments).hashCode());
        List<MerchantInvoiceDataDTO> $merchantAgentInvoiceInfos = this.getMerchantAgentInvoiceInfos();
        result = result * 59 + ($merchantAgentInvoiceInfos == null ? 43 : ((Object)$merchantAgentInvoiceInfos).hashCode());
        List<MerchantContacterDataDTO> $merchantContactInfos = this.getMerchantContactInfos();
        result = result * 59 + ($merchantContactInfos == null ? 43 : ((Object)$merchantContactInfos).hashCode());
        List<AddressInfoDataDTO> $merchantAddressInfos = this.getMerchantAddressInfos();
        result = result * 59 + ($merchantAddressInfos == null ? 43 : ((Object)$merchantAddressInfos).hashCode());
        List<AgentFinancialDataDTO> $merchantAgentFinancialInfos = this.getMerchantAgentFinancialInfos();
        result = result * 59 + ($merchantAgentFinancialInfos == null ? 43 : ((Object)$merchantAgentFinancialInfos).hashCode());
        List<MerchantSaleAreaDataDTO> $customerAreas = this.getCustomerAreas();
        result = result * 59 + ($customerAreas == null ? 43 : ((Object)$customerAreas).hashCode());
        List<MerchantPrincipalDataDTO> $principals = this.getPrincipals();
        result = result * 59 + ($principals == null ? 43 : ((Object)$principals).hashCode());
        List<MerchantBillingDataDTO> $invoicingCustomers = this.getInvoicingCustomers();
        result = result * 59 + ($invoicingCustomers == null ? 43 : ((Object)$invoicingCustomers).hashCode());
        List<MerchantApplyRangeDataDTO> $merchantApplyRanges = this.getMerchantApplyRanges();
        result = result * 59 + ($merchantApplyRanges == null ? 43 : ((Object)$merchantApplyRanges).hashCode());
        MerchantDetailDataDTO $merchantAppliedDetail = this.getMerchantAppliedDetail();
        result = result * 59 + ($merchantAppliedDetail == null ? 43 : ((Object)$merchantAppliedDetail).hashCode());
        List<String> $distributePrincipleOrgs = this.getDistributePrincipleOrgs();
        result = result * 59 + ($distributePrincipleOrgs == null ? 43 : ((Object)$distributePrincipleOrgs).hashCode());
        String $srcBill = this.getSrcBill();
        result = result * 59 + ($srcBill == null ? 43 : $srcBill.hashCode());
        UPCEntityStatus $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : ((Object)((Object)$entityStatus)).hashCode());
        List<String> $needBlankFieldList = this.getNeedBlankFieldList();
        result = result * 59 + ($needBlankFieldList == null ? 43 : ((Object)$needBlankFieldList).hashCode());
        return result;
    }

    public String toString() {
        return "MerchantDataDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", createOrg=" + this.getCreateOrg() + ", createOrg___code=" + this.getCreateOrg___code() + ", createOrg___name=" + this.getCreateOrg___name() + ", belongOrgId=" + this.getBelongOrgId() + ", belongOrgId___code=" + this.getBelongOrgId___code() + ", belongOrgId___name=" + this.getBelongOrgId___name() + ", transType=" + this.getTransType() + ", transType___code=" + this.getTransType___code() + ", transType___name=" + this.getTransType___name() + ", shortname=" + this.getShortname() + ", country=" + this.getCountry() + ", country___code=" + this.getCountry___code() + ", country___name=" + this.getCountry___name() + ", newTimeZone=" + this.getNewTimeZone() + ", language=" + this.getLanguage() + ", language___code=" + this.getLanguage___code() + ", language___name=" + this.getLanguage___name() + ", parentCustomer=" + this.getParentCustomer() + ", parentCustomer___code=" + this.getParentCustomer___code() + ", parentCustomer___name=" + this.getParentCustomer___name() + ", suppliers=" + this.getSuppliers() + ", suppliers___code=" + this.getSuppliers___code() + ", suppliers___name=" + this.getSuppliers___name() + ", retailInvestors=" + this.getRetailInvestors() + ", internalOrg=" + this.getInternalOrg() + ", internalOrgId=" + this.getInternalOrgId() + ", internalOrgId___code=" + this.getInternalOrgId___code() + ", internalOrgId___name=" + this.getInternalOrgId___name() + ", taxPayingCategories=" + this.getTaxPayingCategories() + ", customerClass=" + this.getCustomerClass() + ", customerClass___code=" + this.getCustomerClass___code() + ", customerClass___name=" + this.getCustomerClass___name() + ", customerIndustry=" + this.getCustomerIndustry() + ", customerIndustry___code=" + this.getCustomerIndustry___code() + ", customerIndustry___name=" + this.getCustomerIndustry___name() + ", developmentPartner=" + this.getDevelopmentPartner() + ", developmentPartner___code=" + this.getDevelopmentPartner___code() + ", developmentPartner___name=" + this.getDevelopmentPartner___name() + ", parentManageOrg=" + this.getParentManageOrg() + ", parentManageOrg___code=" + this.getParentManageOrg___code() + ", parentManageOrg___name=" + this.getParentManageOrg___name() + ", personName=" + this.getPersonName() + ", orgName=" + this.getOrgName() + ", personCharge=" + this.getPersonCharge() + ", personChargeIdNo=" + this.getPersonChargeIdNo() + ", erpCode=" + this.getErpCode() + ", merchantLogo=" + this.getMerchantLogo() + ", largeText1=" + this.getLargeText1() + ", largeText2=" + this.getLargeText2() + ", largeText3=" + this.getLargeText3() + ", largeText4=" + this.getLargeText4() + ", largeText5=" + this.getLargeText5() + ", frontIdCard=" + this.getFrontIdCard() + ", backIdCard=" + this.getBackIdCard() + ", businessLicenseNew=" + this.getBusinessLicenseNew() + ", certificate=" + this.getCertificate() + ", orgCertificate=" + this.getOrgCertificate() + ", isFinancialSynergy=" + this.getIsFinancialSynergy() + ", merchantCharacter=" + this.getMerchantCharacter() + ", customExtend=" + this.getCustomExtend() + ", enterpriseNature=" + this.getEnterpriseNature() + ", enterpriseName=" + this.getEnterpriseName() + ", licenseType=" + this.getLicenseType() + ", creditCode=" + this.getCreditCode() + ", leaderName=" + this.getLeaderName() + ", leaderNameIdNo=" + this.getLeaderNameIdNo() + ", businessLicenseNo=" + this.getBusinessLicenseNo() + ", businessterm=" + this.getBusinessterm() + ", regionCode=" + this.getRegionCode() + ", address=" + this.getAddress() + ", longitude=" + this.getLongitude() + ", latitude=" + this.getLatitude() + ", contactName=" + this.getContactName() + ", contactTel=" + this.getContactTel() + ", email=" + this.getEmail() + ", fax=" + this.getFax() + ", buildTime=" + this.getBuildTime() + ", enterNature=" + this.getEnterNature() + ", enterNature___code=" + this.getEnterNature___code() + ", enterNature___name=" + this.getEnterNature___name() + ", currencyCode=" + this.getCurrencyCode() + ", money=" + this.getMoney() + ", verfyMark=" + this.getVerfyMark() + ", peopleNum=" + this.getPeopleNum() + ", scopeModel=" + this.getScopeModel() + ", yearMoney=" + this.getYearMoney() + ", scope=" + this.getScope() + ", website=" + this.getWebsite() + ", wid=" + this.getWid() + ", postCode=" + this.getPostCode() + ", pubts=" + this.getPubts() + ", createDate=" + this.getCreateDate() + ", createTime=" + this.getCreateTime() + ", creator=" + this.getCreator() + ", creatorId=" + this.getCreatorId() + ", modifier=" + this.getModifier() + ", modifierId=" + this.getModifierId() + ", modifyDate=" + this.getModifyDate() + ", modifyTime=" + this.getModifyTime() + ", merchantRole=" + this.getMerchantRole() + ", merchantsManager=" + this.getMerchantsManager() + ", merchantQualificationDocuments=" + this.getMerchantQualificationDocuments() + ", merchantAgentInvoiceInfos=" + this.getMerchantAgentInvoiceInfos() + ", merchantContactInfos=" + this.getMerchantContactInfos() + ", merchantAddressInfos=" + this.getMerchantAddressInfos() + ", merchantAgentFinancialInfos=" + this.getMerchantAgentFinancialInfos() + ", customerAreas=" + this.getCustomerAreas() + ", principals=" + this.getPrincipals() + ", invoicingCustomers=" + this.getInvoicingCustomers() + ", merchantApplyRanges=" + this.getMerchantApplyRanges() + ", merchantAppliedDetail=" + this.getMerchantAppliedDetail() + ", distributePrincipleOrgs=" + this.getDistributePrincipleOrgs() + ", srcBill=" + this.getSrcBill() + ", entityStatus=" + (Object)((Object)this.getEntityStatus()) + ", needBlankFieldList=" + this.getNeedBlankFieldList() + ")";
    }
}

