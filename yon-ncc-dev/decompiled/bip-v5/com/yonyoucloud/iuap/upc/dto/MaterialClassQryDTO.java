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
public class MaterialClassQryDTO
implements Serializable {
    private String[] field;
    private List<Long> materialClassIdList;
    private List<String> materialClassCodeList;
    private List<String> materialClassNameList;
    private Long parentId;
    private List<Long> parentIds;
    private Boolean stopStatus;
    private List<String> paths;
    private String erpCode;
    private List<String> erpCodeList;

    public String[] getField() {
        return this.field;
    }

    public List<Long> getMaterialClassIdList() {
        return this.materialClassIdList;
    }

    public List<String> getMaterialClassCodeList() {
        return this.materialClassCodeList;
    }

    public List<String> getMaterialClassNameList() {
        return this.materialClassNameList;
    }

    public Long getParentId() {
        return this.parentId;
    }

    public List<Long> getParentIds() {
        return this.parentIds;
    }

    public Boolean getStopStatus() {
        return this.stopStatus;
    }

    public List<String> getPaths() {
        return this.paths;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public List<String> getErpCodeList() {
        return this.erpCodeList;
    }

    public void setField(String[] field) {
        this.field = field;
    }

    public void setMaterialClassIdList(List<Long> materialClassIdList) {
        this.materialClassIdList = materialClassIdList;
    }

    public void setMaterialClassCodeList(List<String> materialClassCodeList) {
        this.materialClassCodeList = materialClassCodeList;
    }

    public void setMaterialClassNameList(List<String> materialClassNameList) {
        this.materialClassNameList = materialClassNameList;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public void setParentIds(List<Long> parentIds) {
        this.parentIds = parentIds;
    }

    public void setStopStatus(Boolean stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setPaths(List<String> paths) {
        this.paths = paths;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public void setErpCodeList(List<String> erpCodeList) {
        this.erpCodeList = erpCodeList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialClassQryDTO)) {
            return false;
        }
        MaterialClassQryDTO other = (MaterialClassQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$parentId = this.getParentId();
        Long other$parentId = other.getParentId();
        if (this$parentId == null ? other$parentId != null : !((Object)this$parentId).equals(other$parentId)) {
            return false;
        }
        Boolean this$stopStatus = this.getStopStatus();
        Boolean other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getField(), other.getField())) {
            return false;
        }
        List<Long> this$materialClassIdList = this.getMaterialClassIdList();
        List<Long> other$materialClassIdList = other.getMaterialClassIdList();
        if (this$materialClassIdList == null ? other$materialClassIdList != null : !((Object)this$materialClassIdList).equals(other$materialClassIdList)) {
            return false;
        }
        List<String> this$materialClassCodeList = this.getMaterialClassCodeList();
        List<String> other$materialClassCodeList = other.getMaterialClassCodeList();
        if (this$materialClassCodeList == null ? other$materialClassCodeList != null : !((Object)this$materialClassCodeList).equals(other$materialClassCodeList)) {
            return false;
        }
        List<String> this$materialClassNameList = this.getMaterialClassNameList();
        List<String> other$materialClassNameList = other.getMaterialClassNameList();
        if (this$materialClassNameList == null ? other$materialClassNameList != null : !((Object)this$materialClassNameList).equals(other$materialClassNameList)) {
            return false;
        }
        List<Long> this$parentIds = this.getParentIds();
        List<Long> other$parentIds = other.getParentIds();
        if (this$parentIds == null ? other$parentIds != null : !((Object)this$parentIds).equals(other$parentIds)) {
            return false;
        }
        List<String> this$paths = this.getPaths();
        List<String> other$paths = other.getPaths();
        if (this$paths == null ? other$paths != null : !((Object)this$paths).equals(other$paths)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        if (this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode)) {
            return false;
        }
        List<String> this$erpCodeList = this.getErpCodeList();
        List<String> other$erpCodeList = other.getErpCodeList();
        return !(this$erpCodeList == null ? other$erpCodeList != null : !((Object)this$erpCodeList).equals(other$erpCodeList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MaterialClassQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $parentId = this.getParentId();
        result = result * 59 + ($parentId == null ? 43 : ((Object)$parentId).hashCode());
        Boolean $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getField());
        List<Long> $materialClassIdList = this.getMaterialClassIdList();
        result = result * 59 + ($materialClassIdList == null ? 43 : ((Object)$materialClassIdList).hashCode());
        List<String> $materialClassCodeList = this.getMaterialClassCodeList();
        result = result * 59 + ($materialClassCodeList == null ? 43 : ((Object)$materialClassCodeList).hashCode());
        List<String> $materialClassNameList = this.getMaterialClassNameList();
        result = result * 59 + ($materialClassNameList == null ? 43 : ((Object)$materialClassNameList).hashCode());
        List<Long> $parentIds = this.getParentIds();
        result = result * 59 + ($parentIds == null ? 43 : ((Object)$parentIds).hashCode());
        List<String> $paths = this.getPaths();
        result = result * 59 + ($paths == null ? 43 : ((Object)$paths).hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        List<String> $erpCodeList = this.getErpCodeList();
        result = result * 59 + ($erpCodeList == null ? 43 : ((Object)$erpCodeList).hashCode());
        return result;
    }

    public String toString() {
        return "MaterialClassQryDTO(field=" + Arrays.deepToString(this.getField()) + ", materialClassIdList=" + this.getMaterialClassIdList() + ", materialClassCodeList=" + this.getMaterialClassCodeList() + ", materialClassNameList=" + this.getMaterialClassNameList() + ", parentId=" + this.getParentId() + ", parentIds=" + this.getParentIds() + ", stopStatus=" + this.getStopStatus() + ", paths=" + this.getPaths() + ", erpCode=" + this.getErpCode() + ", erpCodeList=" + this.getErpCodeList() + ")";
    }
}

