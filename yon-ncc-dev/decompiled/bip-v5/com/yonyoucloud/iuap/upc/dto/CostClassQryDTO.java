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
public class CostClassQryDTO
implements Serializable {
    private String[] fields;
    private Long id;
    private List<Long> idList;
    private String code;
    private List<String> codeList;
    private String createOrgId;
    private String orgId;
    private List<String> createOrgIdList;
    private List<String> orgIdList;
    private Integer stopStatus;

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

    public String getCreateOrgId() {
        return this.createOrgId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public List<String> getCreateOrgIdList() {
        return this.createOrgIdList;
    }

    public List<String> getOrgIdList() {
        return this.orgIdList;
    }

    public Integer getStopStatus() {
        return this.stopStatus;
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

    public void setCreateOrgId(String createOrgId) {
        this.createOrgId = createOrgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setCreateOrgIdList(List<String> createOrgIdList) {
        this.createOrgIdList = createOrgIdList;
    }

    public void setOrgIdList(List<String> orgIdList) {
        this.orgIdList = orgIdList;
    }

    public void setStopStatus(Integer stopStatus) {
        this.stopStatus = stopStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CostClassQryDTO)) {
            return false;
        }
        CostClassQryDTO other = (CostClassQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Integer this$stopStatus = this.getStopStatus();
        Integer other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
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
        String this$createOrgId = this.getCreateOrgId();
        String other$createOrgId = other.getCreateOrgId();
        if (this$createOrgId == null ? other$createOrgId != null : !this$createOrgId.equals(other$createOrgId)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        List<String> this$createOrgIdList = this.getCreateOrgIdList();
        List<String> other$createOrgIdList = other.getCreateOrgIdList();
        if (this$createOrgIdList == null ? other$createOrgIdList != null : !((Object)this$createOrgIdList).equals(other$createOrgIdList)) {
            return false;
        }
        List<String> this$orgIdList = this.getOrgIdList();
        List<String> other$orgIdList = other.getOrgIdList();
        return !(this$orgIdList == null ? other$orgIdList != null : !((Object)this$orgIdList).equals(other$orgIdList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof CostClassQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Integer $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        List<Long> $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : ((Object)$idList).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        List<String> $codeList = this.getCodeList();
        result = result * 59 + ($codeList == null ? 43 : ((Object)$codeList).hashCode());
        String $createOrgId = this.getCreateOrgId();
        result = result * 59 + ($createOrgId == null ? 43 : $createOrgId.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        List<String> $createOrgIdList = this.getCreateOrgIdList();
        result = result * 59 + ($createOrgIdList == null ? 43 : ((Object)$createOrgIdList).hashCode());
        List<String> $orgIdList = this.getOrgIdList();
        result = result * 59 + ($orgIdList == null ? 43 : ((Object)$orgIdList).hashCode());
        return result;
    }

    public String toString() {
        return "CostClassQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", id=" + this.getId() + ", idList=" + this.getIdList() + ", code=" + this.getCode() + ", codeList=" + this.getCodeList() + ", createOrgId=" + this.getCreateOrgId() + ", orgId=" + this.getOrgId() + ", createOrgIdList=" + this.getCreateOrgIdList() + ", orgIdList=" + this.getOrgIdList() + ", stopStatus=" + this.getStopStatus() + ")";
    }
}

