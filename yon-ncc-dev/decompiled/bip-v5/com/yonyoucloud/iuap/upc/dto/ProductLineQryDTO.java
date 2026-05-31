/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductLineQryDTO
implements Serializable {
    private Integer pageSize;
    private String[] fields;
    private Long id;
    private List<Long> idList;
    private String code;
    private List<String> codeList;
    private String name;
    private String fuzzyName;
    private String stopStatus;
    private String erpCode;
    private String searchProperty;
    private Object searchValue;
    private String searchRule;
    private Boolean filterDataPermission = false;

    public Integer getPageSize() {
        return this.pageSize;
    }

    public String[] getFields() {
        return this.fields;
    }

    public Long getId() {
        return this.id;
    }

    public List<Long> getIdList() {
        return this.idList;
    }

    public String getCode() {
        return this.code;
    }

    public List<String> getCodeList() {
        return this.codeList;
    }

    public String getName() {
        return this.name;
    }

    public String getFuzzyName() {
        return this.fuzzyName;
    }

    public String getStopStatus() {
        return this.stopStatus;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public String getSearchProperty() {
        return this.searchProperty;
    }

    public Object getSearchValue() {
        return this.searchValue;
    }

    public String getSearchRule() {
        return this.searchRule;
    }

    public Boolean getFilterDataPermission() {
        return this.filterDataPermission;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCodeList(List<String> codeList) {
        this.codeList = codeList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFuzzyName(String fuzzyName) {
        this.fuzzyName = fuzzyName;
    }

    public void setStopStatus(String stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setSearchProperty(String searchProperty) {
        this.searchProperty = searchProperty;
    }

    public void setSearchValue(Object searchValue) {
        this.searchValue = searchValue;
    }

    public void setSearchRule(String searchRule) {
        this.searchRule = searchRule;
    }

    public void setFilterDataPermission(Boolean filterDataPermission) {
        this.filterDataPermission = filterDataPermission;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductLineQryDTO)) {
            return false;
        }
        ProductLineQryDTO other = (ProductLineQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$pageSize = this.getPageSize();
        Integer other$pageSize = other.getPageSize();
        if (this$pageSize == null ? other$pageSize != null : !((Object)this$pageSize).equals(other$pageSize)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Boolean this$filterDataPermission = this.getFilterDataPermission();
        Boolean other$filterDataPermission = other.getFilterDataPermission();
        if (this$filterDataPermission == null ? other$filterDataPermission != null : !((Object)this$filterDataPermission).equals(other$filterDataPermission)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        List<Long> this$idList = this.getIdList();
        List<Long> other$idList = other.getIdList();
        if (this$idList == null ? other$idList != null : !((Object)this$idList).equals(other$idList)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        List<String> this$codeList = this.getCodeList();
        List<String> other$codeList = other.getCodeList();
        if (this$codeList == null ? other$codeList != null : !((Object)this$codeList).equals(other$codeList)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$fuzzyName = this.getFuzzyName();
        String other$fuzzyName = other.getFuzzyName();
        if (this$fuzzyName == null ? other$fuzzyName != null : !this$fuzzyName.equals(other$fuzzyName)) {
            return false;
        }
        String this$stopStatus = this.getStopStatus();
        String other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !this$stopStatus.equals(other$stopStatus)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        String this$searchProperty = this.getSearchProperty();
        String other$searchProperty = other.getSearchProperty();
        if (this$searchProperty == null ? other$searchProperty != null : !this$searchProperty.equals(other$searchProperty)) {
            return false;
        }
        Object this$searchValue = this.getSearchValue();
        Object other$searchValue = other.getSearchValue();
        if (this$searchValue == null ? other$searchValue != null : !this$searchValue.equals(other$searchValue)) {
            return false;
        }
        String this$searchRule = this.getSearchRule();
        String other$searchRule = other.getSearchRule();
        return !(this$searchRule == null ? other$searchRule != null : !this$searchRule.equals(other$searchRule));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductLineQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $pageSize = this.getPageSize();
        result = result * 59 + ($pageSize == null ? 43 : ((Object)$pageSize).hashCode());
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Boolean $filterDataPermission = this.getFilterDataPermission();
        result = result * 59 + ($filterDataPermission == null ? 43 : ((Object)$filterDataPermission).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        List<Long> $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : ((Object)$idList).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        List<String> $codeList = this.getCodeList();
        result = result * 59 + ($codeList == null ? 43 : ((Object)$codeList).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $fuzzyName = this.getFuzzyName();
        result = result * 59 + ($fuzzyName == null ? 43 : $fuzzyName.hashCode());
        String $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : $stopStatus.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        String $searchProperty = this.getSearchProperty();
        result = result * 59 + ($searchProperty == null ? 43 : $searchProperty.hashCode());
        Object $searchValue = this.getSearchValue();
        result = result * 59 + ($searchValue == null ? 43 : $searchValue.hashCode());
        String $searchRule = this.getSearchRule();
        result = result * 59 + ($searchRule == null ? 43 : $searchRule.hashCode());
        return result;
    }

    public String toString() {
        return "ProductLineQryDTO(pageSize=" + this.getPageSize() + ", fields=" + Arrays.deepToString(this.getFields()) + ", id=" + this.getId() + ", idList=" + this.getIdList() + ", code=" + this.getCode() + ", codeList=" + this.getCodeList() + ", name=" + this.getName() + ", fuzzyName=" + this.getFuzzyName() + ", stopStatus=" + this.getStopStatus() + ", erpCode=" + this.getErpCode() + ", searchProperty=" + this.getSearchProperty() + ", searchValue=" + this.getSearchValue() + ", searchRule=" + this.getSearchRule() + ", filterDataPermission=" + this.getFilterDataPermission() + ")";
    }
}

