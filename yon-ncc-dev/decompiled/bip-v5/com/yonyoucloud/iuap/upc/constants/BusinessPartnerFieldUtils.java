/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.constants;

import java.util.HashMap;

public class BusinessPartnerFieldUtils {
    public static final HashMap<String, String> businessPartnerFieldMapping = new HashMap(64);

    static {
        businessPartnerFieldMapping.put("id", "id");
        businessPartnerFieldMapping.put("nameMultilingual", "name");
        businessPartnerFieldMapping.put("name", "name");
        businessPartnerFieldMapping.put("code", "code");
        businessPartnerFieldMapping.put("shortName", "shortname");
        businessPartnerFieldMapping.put("searchCode", "searchcode");
        businessPartnerFieldMapping.put("status", "status");
        businessPartnerFieldMapping.put("partnerType", "partnerType");
        businessPartnerFieldMapping.put("superiorBusinessPartnerId", "parent");
        businessPartnerFieldMapping.put("superiorBusinessPartnerCode", "parent.code");
        businessPartnerFieldMapping.put("country", "country");
        businessPartnerFieldMapping.put("countryCode", "country.code");
        businessPartnerFieldMapping.put("timeZone", "timeZone");
        businessPartnerFieldMapping.put("timeZoneName", "timeZone.timename");
        businessPartnerFieldMapping.put("newTimeZone", "newTimeZone");
        businessPartnerFieldMapping.put("language", "language");
        businessPartnerFieldMapping.put("languageCode", "language.code");
        businessPartnerFieldMapping.put("licenseType", "licenseType");
        businessPartnerFieldMapping.put("creditCode", "creditCode");
        businessPartnerFieldMapping.put("mobile", "mobile");
        businessPartnerFieldMapping.put("legalPerson", "legalPerson");
        businessPartnerFieldMapping.put("legalPersonIdNo", "legalPersonIdNo");
        businessPartnerFieldMapping.put("money", "money");
        businessPartnerFieldMapping.put("currency", "currency");
        businessPartnerFieldMapping.put("buildDate", "buildDate");
        businessPartnerFieldMapping.put("operatingTermTo", "businessterm");
        businessPartnerFieldMapping.put("regionId", "regionId");
        businessPartnerFieldMapping.put("regAddress", "regAddress");
        businessPartnerFieldMapping.put("contactName", "contactName");
        businessPartnerFieldMapping.put("contactTel", "contactTel");
        businessPartnerFieldMapping.put("fax", "fax");
        businessPartnerFieldMapping.put("email", "email");
        businessPartnerFieldMapping.put("postalCode", "postalCode");
        businessPartnerFieldMapping.put("website", "website");
        businessPartnerFieldMapping.put("scope", "scope");
        businessPartnerFieldMapping.put("internalOrgId", "internalOrgId");
        businessPartnerFieldMapping.put("businessPartnerCharacterDef", "businessPartnerCharacterDef");
    }
}

