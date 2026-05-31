/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.api.businesspartnerdto.BusinessPartnerRoleClassDTO;
import com.yonyoucloud.iuap.upc.api.businesspartnerdto.PartnerCapitalComparisonDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerMerchantComparisonDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerVendorComparisonDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.iuap.upc.vo.UPCExtPropertiesVO;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class BusinessPartnerDTO
extends UPCExtPropertiesVO
implements Serializable {
    private String id;
    private String name;
    private String englishName;
    private String traditionalName;
    private MultilingualVO nameMultilingual;
    private MultilingualVO shortName;
    private String searchCode;
    private Integer partnerType;
    private String superiorBusinessPartnerId;
    private String superiorBusinessPartnerCode;
    private String country;
    private String countryCode;
    @Deprecated
    private String timeZone;
    @Deprecated
    private String timeZoneName;
    private String newTimeZone;
    private String language;
    private String languageCode;
    private Integer status;
    private Integer licenseType;
    private String legalPerson;
    private String legalPersonIdNo;
    private String money;
    private String currency;
    private String currencyCode;
    private Date buildDate;
    private String operatingTermTo;
    private String regionId;
    private String regionCode;
    private String regAddress;
    private String capitalId;
    private String code;
    private String creditCode;
    private String mobile;
    private String contactName;
    private String contactTel;
    private String fax;
    private String email;
    private String postalCode;
    private String website;
    private MultilingualVO scope;
    private String internalOrgId;
    private Map<String, Object> businessPartnerCharacterDef;
    private List<BusinessPartnerRoleClassDTO> partnerRoleClasses;
    private List<PartnerMerchantComparisonDTO> partnerMerchantComparisons;
    private List<PartnerVendorComparisonDTO> partnerVendorComparisons;
    private List<PartnerCapitalComparisonDTO> partnerCapitalComparisons;

    public String getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEnglishName() {
        return this.englishName;
    }

    public String getTraditionalName() {
        return this.traditionalName;
    }

    public MultilingualVO getNameMultilingual() {
        return this.nameMultilingual;
    }

    public MultilingualVO getShortName() {
        return this.shortName;
    }

    public String getSearchCode() {
        return this.searchCode;
    }

    public Integer getPartnerType() {
        return this.partnerType;
    }

    public String getSuperiorBusinessPartnerId() {
        return this.superiorBusinessPartnerId;
    }

    public String getSuperiorBusinessPartnerCode() {
        return this.superiorBusinessPartnerCode;
    }

    public String getCountry() {
        return this.country;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    @Deprecated
    public String getTimeZone() {
        return this.timeZone;
    }

    @Deprecated
    public String getTimeZoneName() {
        return this.timeZoneName;
    }

    public String getNewTimeZone() {
        return this.newTimeZone;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLanguageCode() {
        return this.languageCode;
    }

    public Integer getStatus() {
        return this.status;
    }

    public Integer getLicenseType() {
        return this.licenseType;
    }

    public String getLegalPerson() {
        return this.legalPerson;
    }

    public String getLegalPersonIdNo() {
        return this.legalPersonIdNo;
    }

    public String getMoney() {
        return this.money;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getCurrencyCode() {
        return this.currencyCode;
    }

    public Date getBuildDate() {
        return this.buildDate;
    }

    public String getOperatingTermTo() {
        return this.operatingTermTo;
    }

    public String getRegionId() {
        return this.regionId;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public String getRegAddress() {
        return this.regAddress;
    }

    public String getCapitalId() {
        return this.capitalId;
    }

    public String getCode() {
        return this.code;
    }

    public String getCreditCode() {
        return this.creditCode;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getContactName() {
        return this.contactName;
    }

    public String getContactTel() {
        return this.contactTel;
    }

    public String getFax() {
        return this.fax;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getWebsite() {
        return this.website;
    }

    public MultilingualVO getScope() {
        return this.scope;
    }

    public String getInternalOrgId() {
        return this.internalOrgId;
    }

    public Map<String, Object> getBusinessPartnerCharacterDef() {
        return this.businessPartnerCharacterDef;
    }

    public List<BusinessPartnerRoleClassDTO> getPartnerRoleClasses() {
        return this.partnerRoleClasses;
    }

    public List<PartnerMerchantComparisonDTO> getPartnerMerchantComparisons() {
        return this.partnerMerchantComparisons;
    }

    public List<PartnerVendorComparisonDTO> getPartnerVendorComparisons() {
        return this.partnerVendorComparisons;
    }

    public List<PartnerCapitalComparisonDTO> getPartnerCapitalComparisons() {
        return this.partnerCapitalComparisons;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public void setTraditionalName(String traditionalName) {
        this.traditionalName = traditionalName;
    }

    public void setNameMultilingual(MultilingualVO nameMultilingual) {
        this.nameMultilingual = nameMultilingual;
    }

    public void setShortName(MultilingualVO shortName) {
        this.shortName = shortName;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode;
    }

    public void setPartnerType(Integer partnerType) {
        this.partnerType = partnerType;
    }

    public void setSuperiorBusinessPartnerId(String superiorBusinessPartnerId) {
        this.superiorBusinessPartnerId = superiorBusinessPartnerId;
    }

    public void setSuperiorBusinessPartnerCode(String superiorBusinessPartnerCode) {
        this.superiorBusinessPartnerCode = superiorBusinessPartnerCode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Deprecated
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    @Deprecated
    public void setTimeZoneName(String timeZoneName) {
        this.timeZoneName = timeZoneName;
    }

    public void setNewTimeZone(String newTimeZone) {
        this.newTimeZone = newTimeZone;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setLicenseType(Integer licenseType) {
        this.licenseType = licenseType;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    public void setLegalPersonIdNo(String legalPersonIdNo) {
        this.legalPersonIdNo = legalPersonIdNo;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public void setBuildDate(Date buildDate) {
        this.buildDate = buildDate;
    }

    public void setOperatingTermTo(String operatingTermTo) {
        this.operatingTermTo = operatingTermTo;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress;
    }

    public void setCapitalId(String capitalId) {
        this.capitalId = capitalId;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setScope(MultilingualVO scope) {
        this.scope = scope;
    }

    public void setInternalOrgId(String internalOrgId) {
        this.internalOrgId = internalOrgId;
    }

    public void setBusinessPartnerCharacterDef(Map<String, Object> businessPartnerCharacterDef) {
        this.businessPartnerCharacterDef = businessPartnerCharacterDef;
    }

    public void setPartnerRoleClasses(List<BusinessPartnerRoleClassDTO> partnerRoleClasses) {
        this.partnerRoleClasses = partnerRoleClasses;
    }

    public void setPartnerMerchantComparisons(List<PartnerMerchantComparisonDTO> partnerMerchantComparisons) {
        this.partnerMerchantComparisons = partnerMerchantComparisons;
    }

    public void setPartnerVendorComparisons(List<PartnerVendorComparisonDTO> partnerVendorComparisons) {
        this.partnerVendorComparisons = partnerVendorComparisons;
    }

    public void setPartnerCapitalComparisons(List<PartnerCapitalComparisonDTO> partnerCapitalComparisons) {
        this.partnerCapitalComparisons = partnerCapitalComparisons;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BusinessPartnerDTO)) {
            return false;
        }
        BusinessPartnerDTO other = (BusinessPartnerDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$partnerType = this.getPartnerType();
        Integer other$partnerType = other.getPartnerType();
        if (this$partnerType == null ? other$partnerType != null : !((Object)this$partnerType).equals(other$partnerType)) {
            return false;
        }
        Integer this$status = this.getStatus();
        Integer other$status = other.getStatus();
        if (this$status == null ? other$status != null : !((Object)this$status).equals(other$status)) {
            return false;
        }
        Integer this$licenseType = this.getLicenseType();
        Integer other$licenseType = other.getLicenseType();
        if (this$licenseType == null ? other$licenseType != null : !((Object)this$licenseType).equals(other$licenseType)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$englishName = this.getEnglishName();
        String other$englishName = other.getEnglishName();
        if (this$englishName == null ? other$englishName != null : !this$englishName.equals(other$englishName)) {
            return false;
        }
        String this$traditionalName = this.getTraditionalName();
        String other$traditionalName = other.getTraditionalName();
        if (this$traditionalName == null ? other$traditionalName != null : !this$traditionalName.equals(other$traditionalName)) {
            return false;
        }
        MultilingualVO this$nameMultilingual = this.getNameMultilingual();
        MultilingualVO other$nameMultilingual = other.getNameMultilingual();
        if (this$nameMultilingual == null ? other$nameMultilingual != null : !((Object)this$nameMultilingual).equals(other$nameMultilingual)) {
            return false;
        }
        MultilingualVO this$shortName = this.getShortName();
        MultilingualVO other$shortName = other.getShortName();
        if (this$shortName == null ? other$shortName != null : !((Object)this$shortName).equals(other$shortName)) {
            return false;
        }
        String this$searchCode = this.getSearchCode();
        String other$searchCode = other.getSearchCode();
        if (this$searchCode == null ? other$searchCode != null : !this$searchCode.equals(other$searchCode)) {
            return false;
        }
        String this$superiorBusinessPartnerId = this.getSuperiorBusinessPartnerId();
        String other$superiorBusinessPartnerId = other.getSuperiorBusinessPartnerId();
        if (this$superiorBusinessPartnerId == null ? other$superiorBusinessPartnerId != null : !this$superiorBusinessPartnerId.equals(other$superiorBusinessPartnerId)) {
            return false;
        }
        String this$superiorBusinessPartnerCode = this.getSuperiorBusinessPartnerCode();
        String other$superiorBusinessPartnerCode = other.getSuperiorBusinessPartnerCode();
        if (this$superiorBusinessPartnerCode == null ? other$superiorBusinessPartnerCode != null : !this$superiorBusinessPartnerCode.equals(other$superiorBusinessPartnerCode)) {
            return false;
        }
        String this$country = this.getCountry();
        String other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) {
            return false;
        }
        String this$countryCode = this.getCountryCode();
        String other$countryCode = other.getCountryCode();
        if (this$countryCode == null ? other$countryCode != null : !this$countryCode.equals(other$countryCode)) {
            return false;
        }
        String this$timeZone = this.getTimeZone();
        String other$timeZone = other.getTimeZone();
        if (this$timeZone == null ? other$timeZone != null : !this$timeZone.equals(other$timeZone)) {
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
        String this$language = this.getLanguage();
        String other$language = other.getLanguage();
        if (this$language == null ? other$language != null : !this$language.equals(other$language)) {
            return false;
        }
        String this$languageCode = this.getLanguageCode();
        String other$languageCode = other.getLanguageCode();
        if (this$languageCode == null ? other$languageCode != null : !this$languageCode.equals(other$languageCode)) {
            return false;
        }
        String this$legalPerson = this.getLegalPerson();
        String other$legalPerson = other.getLegalPerson();
        if (this$legalPerson == null ? other$legalPerson != null : !this$legalPerson.equals(other$legalPerson)) {
            return false;
        }
        String this$legalPersonIdNo = this.getLegalPersonIdNo();
        String other$legalPersonIdNo = other.getLegalPersonIdNo();
        if (this$legalPersonIdNo == null ? other$legalPersonIdNo != null : !this$legalPersonIdNo.equals(other$legalPersonIdNo)) {
            return false;
        }
        String this$money = this.getMoney();
        String other$money = other.getMoney();
        if (this$money == null ? other$money != null : !this$money.equals(other$money)) {
            return false;
        }
        String this$currency = this.getCurrency();
        String other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) {
            return false;
        }
        String this$currencyCode = this.getCurrencyCode();
        String other$currencyCode = other.getCurrencyCode();
        if (this$currencyCode == null ? other$currencyCode != null : !this$currencyCode.equals(other$currencyCode)) {
            return false;
        }
        Date this$buildDate = this.getBuildDate();
        Date other$buildDate = other.getBuildDate();
        if (this$buildDate == null ? other$buildDate != null : !((Object)this$buildDate).equals(other$buildDate)) {
            return false;
        }
        String this$operatingTermTo = this.getOperatingTermTo();
        String other$operatingTermTo = other.getOperatingTermTo();
        if (this$operatingTermTo == null ? other$operatingTermTo != null : !this$operatingTermTo.equals(other$operatingTermTo)) {
            return false;
        }
        String this$regionId = this.getRegionId();
        String other$regionId = other.getRegionId();
        if (this$regionId == null ? other$regionId != null : !this$regionId.equals(other$regionId)) {
            return false;
        }
        String this$regionCode = this.getRegionCode();
        String other$regionCode = other.getRegionCode();
        if (this$regionCode == null ? other$regionCode != null : !this$regionCode.equals(other$regionCode)) {
            return false;
        }
        String this$regAddress = this.getRegAddress();
        String other$regAddress = other.getRegAddress();
        if (this$regAddress == null ? other$regAddress != null : !this$regAddress.equals(other$regAddress)) {
            return false;
        }
        String this$capitalId = this.getCapitalId();
        String other$capitalId = other.getCapitalId();
        if (this$capitalId == null ? other$capitalId != null : !this$capitalId.equals(other$capitalId)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$creditCode = this.getCreditCode();
        String other$creditCode = other.getCreditCode();
        if (this$creditCode == null ? other$creditCode != null : !this$creditCode.equals(other$creditCode)) {
            return false;
        }
        String this$mobile = this.getMobile();
        String other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) {
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
        String this$fax = this.getFax();
        String other$fax = other.getFax();
        if (this$fax == null ? other$fax != null : !this$fax.equals(other$fax)) {
            return false;
        }
        String this$email = this.getEmail();
        String other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) {
            return false;
        }
        String this$postalCode = this.getPostalCode();
        String other$postalCode = other.getPostalCode();
        if (this$postalCode == null ? other$postalCode != null : !this$postalCode.equals(other$postalCode)) {
            return false;
        }
        String this$website = this.getWebsite();
        String other$website = other.getWebsite();
        if (this$website == null ? other$website != null : !this$website.equals(other$website)) {
            return false;
        }
        MultilingualVO this$scope = this.getScope();
        MultilingualVO other$scope = other.getScope();
        if (this$scope == null ? other$scope != null : !((Object)this$scope).equals(other$scope)) {
            return false;
        }
        String this$internalOrgId = this.getInternalOrgId();
        String other$internalOrgId = other.getInternalOrgId();
        if (this$internalOrgId == null ? other$internalOrgId != null : !this$internalOrgId.equals(other$internalOrgId)) {
            return false;
        }
        Map<String, Object> this$businessPartnerCharacterDef = this.getBusinessPartnerCharacterDef();
        Map<String, Object> other$businessPartnerCharacterDef = other.getBusinessPartnerCharacterDef();
        if (this$businessPartnerCharacterDef == null ? other$businessPartnerCharacterDef != null : !((Object)this$businessPartnerCharacterDef).equals(other$businessPartnerCharacterDef)) {
            return false;
        }
        List<BusinessPartnerRoleClassDTO> this$partnerRoleClasses = this.getPartnerRoleClasses();
        List<BusinessPartnerRoleClassDTO> other$partnerRoleClasses = other.getPartnerRoleClasses();
        if (this$partnerRoleClasses == null ? other$partnerRoleClasses != null : !((Object)this$partnerRoleClasses).equals(other$partnerRoleClasses)) {
            return false;
        }
        List<PartnerMerchantComparisonDTO> this$partnerMerchantComparisons = this.getPartnerMerchantComparisons();
        List<PartnerMerchantComparisonDTO> other$partnerMerchantComparisons = other.getPartnerMerchantComparisons();
        if (this$partnerMerchantComparisons == null ? other$partnerMerchantComparisons != null : !((Object)this$partnerMerchantComparisons).equals(other$partnerMerchantComparisons)) {
            return false;
        }
        List<PartnerVendorComparisonDTO> this$partnerVendorComparisons = this.getPartnerVendorComparisons();
        List<PartnerVendorComparisonDTO> other$partnerVendorComparisons = other.getPartnerVendorComparisons();
        if (this$partnerVendorComparisons == null ? other$partnerVendorComparisons != null : !((Object)this$partnerVendorComparisons).equals(other$partnerVendorComparisons)) {
            return false;
        }
        List<PartnerCapitalComparisonDTO> this$partnerCapitalComparisons = this.getPartnerCapitalComparisons();
        List<PartnerCapitalComparisonDTO> other$partnerCapitalComparisons = other.getPartnerCapitalComparisons();
        return !(this$partnerCapitalComparisons == null ? other$partnerCapitalComparisons != null : !((Object)this$partnerCapitalComparisons).equals(other$partnerCapitalComparisons));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof BusinessPartnerDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $partnerType = this.getPartnerType();
        result = result * 59 + ($partnerType == null ? 43 : ((Object)$partnerType).hashCode());
        Integer $status = this.getStatus();
        result = result * 59 + ($status == null ? 43 : ((Object)$status).hashCode());
        Integer $licenseType = this.getLicenseType();
        result = result * 59 + ($licenseType == null ? 43 : ((Object)$licenseType).hashCode());
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $englishName = this.getEnglishName();
        result = result * 59 + ($englishName == null ? 43 : $englishName.hashCode());
        String $traditionalName = this.getTraditionalName();
        result = result * 59 + ($traditionalName == null ? 43 : $traditionalName.hashCode());
        MultilingualVO $nameMultilingual = this.getNameMultilingual();
        result = result * 59 + ($nameMultilingual == null ? 43 : $nameMultilingual.hashCode());
        MultilingualVO $shortName = this.getShortName();
        result = result * 59 + ($shortName == null ? 43 : $shortName.hashCode());
        String $searchCode = this.getSearchCode();
        result = result * 59 + ($searchCode == null ? 43 : $searchCode.hashCode());
        String $superiorBusinessPartnerId = this.getSuperiorBusinessPartnerId();
        result = result * 59 + ($superiorBusinessPartnerId == null ? 43 : $superiorBusinessPartnerId.hashCode());
        String $superiorBusinessPartnerCode = this.getSuperiorBusinessPartnerCode();
        result = result * 59 + ($superiorBusinessPartnerCode == null ? 43 : $superiorBusinessPartnerCode.hashCode());
        String $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        String $countryCode = this.getCountryCode();
        result = result * 59 + ($countryCode == null ? 43 : $countryCode.hashCode());
        String $timeZone = this.getTimeZone();
        result = result * 59 + ($timeZone == null ? 43 : $timeZone.hashCode());
        String $timeZoneName = this.getTimeZoneName();
        result = result * 59 + ($timeZoneName == null ? 43 : $timeZoneName.hashCode());
        String $newTimeZone = this.getNewTimeZone();
        result = result * 59 + ($newTimeZone == null ? 43 : $newTimeZone.hashCode());
        String $language = this.getLanguage();
        result = result * 59 + ($language == null ? 43 : $language.hashCode());
        String $languageCode = this.getLanguageCode();
        result = result * 59 + ($languageCode == null ? 43 : $languageCode.hashCode());
        String $legalPerson = this.getLegalPerson();
        result = result * 59 + ($legalPerson == null ? 43 : $legalPerson.hashCode());
        String $legalPersonIdNo = this.getLegalPersonIdNo();
        result = result * 59 + ($legalPersonIdNo == null ? 43 : $legalPersonIdNo.hashCode());
        String $money = this.getMoney();
        result = result * 59 + ($money == null ? 43 : $money.hashCode());
        String $currency = this.getCurrency();
        result = result * 59 + ($currency == null ? 43 : $currency.hashCode());
        String $currencyCode = this.getCurrencyCode();
        result = result * 59 + ($currencyCode == null ? 43 : $currencyCode.hashCode());
        Date $buildDate = this.getBuildDate();
        result = result * 59 + ($buildDate == null ? 43 : ((Object)$buildDate).hashCode());
        String $operatingTermTo = this.getOperatingTermTo();
        result = result * 59 + ($operatingTermTo == null ? 43 : $operatingTermTo.hashCode());
        String $regionId = this.getRegionId();
        result = result * 59 + ($regionId == null ? 43 : $regionId.hashCode());
        String $regionCode = this.getRegionCode();
        result = result * 59 + ($regionCode == null ? 43 : $regionCode.hashCode());
        String $regAddress = this.getRegAddress();
        result = result * 59 + ($regAddress == null ? 43 : $regAddress.hashCode());
        String $capitalId = this.getCapitalId();
        result = result * 59 + ($capitalId == null ? 43 : $capitalId.hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $creditCode = this.getCreditCode();
        result = result * 59 + ($creditCode == null ? 43 : $creditCode.hashCode());
        String $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        String $contactName = this.getContactName();
        result = result * 59 + ($contactName == null ? 43 : $contactName.hashCode());
        String $contactTel = this.getContactTel();
        result = result * 59 + ($contactTel == null ? 43 : $contactTel.hashCode());
        String $fax = this.getFax();
        result = result * 59 + ($fax == null ? 43 : $fax.hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        String $postalCode = this.getPostalCode();
        result = result * 59 + ($postalCode == null ? 43 : $postalCode.hashCode());
        String $website = this.getWebsite();
        result = result * 59 + ($website == null ? 43 : $website.hashCode());
        MultilingualVO $scope = this.getScope();
        result = result * 59 + ($scope == null ? 43 : $scope.hashCode());
        String $internalOrgId = this.getInternalOrgId();
        result = result * 59 + ($internalOrgId == null ? 43 : $internalOrgId.hashCode());
        Map<String, Object> $businessPartnerCharacterDef = this.getBusinessPartnerCharacterDef();
        result = result * 59 + ($businessPartnerCharacterDef == null ? 43 : ((Object)$businessPartnerCharacterDef).hashCode());
        List<BusinessPartnerRoleClassDTO> $partnerRoleClasses = this.getPartnerRoleClasses();
        result = result * 59 + ($partnerRoleClasses == null ? 43 : ((Object)$partnerRoleClasses).hashCode());
        List<PartnerMerchantComparisonDTO> $partnerMerchantComparisons = this.getPartnerMerchantComparisons();
        result = result * 59 + ($partnerMerchantComparisons == null ? 43 : ((Object)$partnerMerchantComparisons).hashCode());
        List<PartnerVendorComparisonDTO> $partnerVendorComparisons = this.getPartnerVendorComparisons();
        result = result * 59 + ($partnerVendorComparisons == null ? 43 : ((Object)$partnerVendorComparisons).hashCode());
        List<PartnerCapitalComparisonDTO> $partnerCapitalComparisons = this.getPartnerCapitalComparisons();
        result = result * 59 + ($partnerCapitalComparisons == null ? 43 : ((Object)$partnerCapitalComparisons).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "BusinessPartnerDTO(id=" + this.getId() + ", name=" + this.getName() + ", englishName=" + this.getEnglishName() + ", traditionalName=" + this.getTraditionalName() + ", nameMultilingual=" + this.getNameMultilingual() + ", shortName=" + this.getShortName() + ", searchCode=" + this.getSearchCode() + ", partnerType=" + this.getPartnerType() + ", superiorBusinessPartnerId=" + this.getSuperiorBusinessPartnerId() + ", superiorBusinessPartnerCode=" + this.getSuperiorBusinessPartnerCode() + ", country=" + this.getCountry() + ", countryCode=" + this.getCountryCode() + ", timeZone=" + this.getTimeZone() + ", timeZoneName=" + this.getTimeZoneName() + ", newTimeZone=" + this.getNewTimeZone() + ", language=" + this.getLanguage() + ", languageCode=" + this.getLanguageCode() + ", status=" + this.getStatus() + ", licenseType=" + this.getLicenseType() + ", legalPerson=" + this.getLegalPerson() + ", legalPersonIdNo=" + this.getLegalPersonIdNo() + ", money=" + this.getMoney() + ", currency=" + this.getCurrency() + ", currencyCode=" + this.getCurrencyCode() + ", buildDate=" + this.getBuildDate() + ", operatingTermTo=" + this.getOperatingTermTo() + ", regionId=" + this.getRegionId() + ", regionCode=" + this.getRegionCode() + ", regAddress=" + this.getRegAddress() + ", capitalId=" + this.getCapitalId() + ", code=" + this.getCode() + ", creditCode=" + this.getCreditCode() + ", mobile=" + this.getMobile() + ", contactName=" + this.getContactName() + ", contactTel=" + this.getContactTel() + ", fax=" + this.getFax() + ", email=" + this.getEmail() + ", postalCode=" + this.getPostalCode() + ", website=" + this.getWebsite() + ", scope=" + this.getScope() + ", internalOrgId=" + this.getInternalOrgId() + ", businessPartnerCharacterDef=" + this.getBusinessPartnerCharacterDef() + ", partnerRoleClasses=" + this.getPartnerRoleClasses() + ", partnerMerchantComparisons=" + this.getPartnerMerchantComparisons() + ", partnerVendorComparisons=" + this.getPartnerVendorComparisons() + ", partnerCapitalComparisons=" + this.getPartnerCapitalComparisons() + ")";
    }
}

