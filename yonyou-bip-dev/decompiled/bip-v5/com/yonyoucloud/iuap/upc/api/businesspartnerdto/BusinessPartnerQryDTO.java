/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.businesspartnerdto;

import com.yonyoucloud.iuap.upc.dto.openapi.character.QueryExtendDTO;
import java.util.List;

public class BusinessPartnerQryDTO
extends QueryExtendDTO {
    private String[] fields;
    private Integer pageSize;
    private Integer pageIndex;
    private String id;
    private List<String> idList;
    private String name;
    private String fuzzyName;
    private String code;
    private List<String> codeList;
    private String fuzzyCode;
    private String shortName;
    private Integer partnerType;
    private String superiorBusinessPartnerId;
    private String country;
    private String timeZone;
    private Integer status;
    private List<String> roleClassNameList;

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    @Override
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdList(List<String> idList) {
        this.idList = idList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public void setFuzzyCode(String fuzzyCode) {
        this.fuzzyCode = fuzzyCode;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public void setPartnerType(Integer partnerType) {
        this.partnerType = partnerType;
    }

    public void setSuperiorBusinessPartnerId(String superiorBusinessPartnerId) {
        this.superiorBusinessPartnerId = superiorBusinessPartnerId;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setRoleClassNameList(List<String> roleClassNameList) {
        this.roleClassNameList = roleClassNameList;
    }

    public String[] getFields() {
        return this.fields;
    }

    @Override
    public Integer getPageSize() {
        return this.pageSize;
    }

    @Override
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public String getId() {
        return this.id;
    }

    public List<String> getIdList() {
        return this.idList;
    }

    public String getName() {
        return this.name;
    }

    public String getFuzzyName() {
        return this.fuzzyName;
    }

    public String getCode() {
        return this.code;
    }

    public List<String> getCodeList() {
        return this.codeList;
    }

    public String getFuzzyCode() {
        return this.fuzzyCode;
    }

    public String getShortName() {
        return this.shortName;
    }

    public Integer getPartnerType() {
        return this.partnerType;
    }

    public String getSuperiorBusinessPartnerId() {
        return this.superiorBusinessPartnerId;
    }

    public String getCountry() {
        return this.country;
    }

    public String getTimeZone() {
        return this.timeZone;
    }

    public Integer getStatus() {
        return this.status;
    }

    public List<String> getRoleClassNameList() {
        return this.roleClassNameList;
    }
}

