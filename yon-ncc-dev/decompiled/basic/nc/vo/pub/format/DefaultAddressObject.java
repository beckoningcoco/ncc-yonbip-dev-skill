/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import nc.vo.pub.format.AddressObject;

public class DefaultAddressObject
implements AddressObject {
    private String section = null;
    private String city = null;
    private String country = null;
    private String postcode = null;
    private String road = null;
    private String state = null;

    @Override
    public String getCity() {
        return this.city;
    }

    @Override
    public String getCountry() {
        return this.country;
    }

    @Override
    public String getPostcode() {
        return this.postcode;
    }

    @Override
    public String getRoad() {
        return this.road;
    }

    @Override
    public String getState() {
        return this.state;
    }

    @Override
    public String getSection() {
        return this.section;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setRoad(String road) {
        this.road = road;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setSection(String section) {
        this.section = section;
    }
}

