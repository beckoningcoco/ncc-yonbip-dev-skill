/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.merchantgroupdto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MultilingualDto;
import java.math.BigDecimal;
import java.util.Date;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantGroupCrmDto {
    private Long id;
    private MultilingualDto name;
    private MultilingualDto shortname;
    private String searchCode;
    private String creditCode;
    private Integer verfyMark;
    private BigDecimal longitude;
    private BigDecimal latitude;
    private String address;
    private String country;
    private String region;
    private String regionCode;
    private String website;
    private String enterpriseName;
    private String leaderName;
    private Date buildTime;
    private String scope;
    private String contactTel;
    private String email;

    public Long getId() {
        return this.id;
    }

    public MultilingualDto getName() {
        return this.name;
    }

    public MultilingualDto getShortname() {
        return this.shortname;
    }

    public String getSearchCode() {
        return this.searchCode;
    }

    public String getCreditCode() {
        return this.creditCode;
    }

    public Integer getVerfyMark() {
        return this.verfyMark;
    }

    public BigDecimal getLongitude() {
        return this.longitude;
    }

    public BigDecimal getLatitude() {
        return this.latitude;
    }

    public String getAddress() {
        return this.address;
    }

    public String getCountry() {
        return this.country;
    }

    public String getRegion() {
        return this.region;
    }

    public String getRegionCode() {
        return this.regionCode;
    }

    public String getWebsite() {
        return this.website;
    }

    public String getEnterpriseName() {
        return this.enterpriseName;
    }

    public String getLeaderName() {
        return this.leaderName;
    }

    public Date getBuildTime() {
        return this.buildTime;
    }

    public String getScope() {
        return this.scope;
    }

    public String getContactTel() {
        return this.contactTel;
    }

    public String getEmail() {
        return this.email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(MultilingualDto name) {
        this.name = name;
    }

    public void setShortname(MultilingualDto shortname) {
        this.shortname = shortname;
    }

    public void setSearchCode(String searchCode) {
        this.searchCode = searchCode;
    }

    public void setCreditCode(String creditCode) {
        this.creditCode = creditCode;
    }

    public void setVerfyMark(Integer verfyMark) {
        this.verfyMark = verfyMark;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantGroupCrmDto)) {
            return false;
        }
        MerchantGroupCrmDto other = (MerchantGroupCrmDto)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$verfyMark = this.getVerfyMark();
        Integer other$verfyMark = other.getVerfyMark();
        if (this$verfyMark == null ? other$verfyMark != null : !((Object)this$verfyMark).equals(other$verfyMark)) {
            return false;
        }
        MultilingualDto this$name = this.getName();
        MultilingualDto other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        MultilingualDto this$shortname = this.getShortname();
        MultilingualDto other$shortname = other.getShortname();
        if (this$shortname == null ? other$shortname != null : !((Object)this$shortname).equals(other$shortname)) {
            return false;
        }
        String this$searchCode = this.getSearchCode();
        String other$searchCode = other.getSearchCode();
        if (this$searchCode == null ? other$searchCode != null : !this$searchCode.equals(other$searchCode)) {
            return false;
        }
        String this$creditCode = this.getCreditCode();
        String other$creditCode = other.getCreditCode();
        if (this$creditCode == null ? other$creditCode != null : !this$creditCode.equals(other$creditCode)) {
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
        String this$address = this.getAddress();
        String other$address = other.getAddress();
        if (this$address == null ? other$address != null : !this$address.equals(other$address)) {
            return false;
        }
        String this$country = this.getCountry();
        String other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) {
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
        String this$website = this.getWebsite();
        String other$website = other.getWebsite();
        if (this$website == null ? other$website != null : !this$website.equals(other$website)) {
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
        Date this$buildTime = this.getBuildTime();
        Date other$buildTime = other.getBuildTime();
        if (this$buildTime == null ? other$buildTime != null : !((Object)this$buildTime).equals(other$buildTime)) {
            return false;
        }
        String this$scope = this.getScope();
        String other$scope = other.getScope();
        if (this$scope == null ? other$scope != null : !this$scope.equals(other$scope)) {
            return false;
        }
        String this$contactTel = this.getContactTel();
        String other$contactTel = other.getContactTel();
        if (this$contactTel == null ? other$contactTel != null : !this$contactTel.equals(other$contactTel)) {
            return false;
        }
        String this$email = this.getEmail();
        String other$email = other.getEmail();
        return !(this$email == null ? other$email != null : !this$email.equals(other$email));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantGroupCrmDto;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $verfyMark = this.getVerfyMark();
        result = result * 59 + ($verfyMark == null ? 43 : ((Object)$verfyMark).hashCode());
        MultilingualDto $name = this.getName();
        result = result * 59 + ($name == null ? 43 : ((Object)$name).hashCode());
        MultilingualDto $shortname = this.getShortname();
        result = result * 59 + ($shortname == null ? 43 : ((Object)$shortname).hashCode());
        String $searchCode = this.getSearchCode();
        result = result * 59 + ($searchCode == null ? 43 : $searchCode.hashCode());
        String $creditCode = this.getCreditCode();
        result = result * 59 + ($creditCode == null ? 43 : $creditCode.hashCode());
        BigDecimal $longitude = this.getLongitude();
        result = result * 59 + ($longitude == null ? 43 : ((Object)$longitude).hashCode());
        BigDecimal $latitude = this.getLatitude();
        result = result * 59 + ($latitude == null ? 43 : ((Object)$latitude).hashCode());
        String $address = this.getAddress();
        result = result * 59 + ($address == null ? 43 : $address.hashCode());
        String $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        String $region = this.getRegion();
        result = result * 59 + ($region == null ? 43 : $region.hashCode());
        String $regionCode = this.getRegionCode();
        result = result * 59 + ($regionCode == null ? 43 : $regionCode.hashCode());
        String $website = this.getWebsite();
        result = result * 59 + ($website == null ? 43 : $website.hashCode());
        String $enterpriseName = this.getEnterpriseName();
        result = result * 59 + ($enterpriseName == null ? 43 : $enterpriseName.hashCode());
        String $leaderName = this.getLeaderName();
        result = result * 59 + ($leaderName == null ? 43 : $leaderName.hashCode());
        Date $buildTime = this.getBuildTime();
        result = result * 59 + ($buildTime == null ? 43 : ((Object)$buildTime).hashCode());
        String $scope = this.getScope();
        result = result * 59 + ($scope == null ? 43 : $scope.hashCode());
        String $contactTel = this.getContactTel();
        result = result * 59 + ($contactTel == null ? 43 : $contactTel.hashCode());
        String $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantGroupCrmDto(id=" + this.getId() + ", name=" + this.getName() + ", shortname=" + this.getShortname() + ", searchCode=" + this.getSearchCode() + ", creditCode=" + this.getCreditCode() + ", verfyMark=" + this.getVerfyMark() + ", longitude=" + this.getLongitude() + ", latitude=" + this.getLatitude() + ", address=" + this.getAddress() + ", country=" + this.getCountry() + ", region=" + this.getRegion() + ", regionCode=" + this.getRegionCode() + ", website=" + this.getWebsite() + ", enterpriseName=" + this.getEnterpriseName() + ", leaderName=" + this.getLeaderName() + ", buildTime=" + this.getBuildTime() + ", scope=" + this.getScope() + ", contactTel=" + this.getContactTel() + ", email=" + this.getEmail() + ")";
    }
}

