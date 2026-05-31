/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import com.yonyou.iuap.bizdoc.service.model.BaseQueryParam;
import java.util.List;

public class ShipRegionQueryParam
extends BaseQueryParam {
    private String country;
    private String countryLike;
    private List<String> countries;
    private Integer stopStatus;

    public String getCountry() {
        return this.country;
    }

    public String getCountryLike() {
        return this.countryLike;
    }

    public List<String> getCountries() {
        return this.countries;
    }

    public Integer getStopStatus() {
        return this.stopStatus;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCountryLike(String countryLike) {
        this.countryLike = countryLike;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    public void setStopStatus(Integer stopStatus) {
        this.stopStatus = stopStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ShipRegionQueryParam)) {
            return false;
        }
        ShipRegionQueryParam other = (ShipRegionQueryParam)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$stopStatus = this.getStopStatus();
        Integer other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        String this$country = this.getCountry();
        String other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) {
            return false;
        }
        String this$countryLike = this.getCountryLike();
        String other$countryLike = other.getCountryLike();
        if (this$countryLike == null ? other$countryLike != null : !this$countryLike.equals(other$countryLike)) {
            return false;
        }
        List<String> this$countries = this.getCountries();
        List<String> other$countries = other.getCountries();
        return !(this$countries == null ? other$countries != null : !((Object)this$countries).equals(other$countries));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ShipRegionQueryParam;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $country = this.getCountry();
        result = result * 59 + ($country == null ? 43 : $country.hashCode());
        String $countryLike = this.getCountryLike();
        result = result * 59 + ($countryLike == null ? 43 : $countryLike.hashCode());
        List<String> $countries = this.getCountries();
        result = result * 59 + ($countries == null ? 43 : ((Object)$countries).hashCode());
        return result;
    }

    public String toString() {
        return "ShipRegionQueryParam(country=" + this.getCountry() + ", countryLike=" + this.getCountryLike() + ", countries=" + this.getCountries() + ", stopStatus=" + this.getStopStatus() + ")";
    }
}

