/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class TagQryDTO
extends UPCPager
implements Serializable {
    private String[] fields;
    private Long id;
    private String name;
    private String tagClassCode;
    private String scope;
    private List<Long> idList;

    public String[] getFields() {
        return this.fields;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getTagClassCode() {
        return this.tagClassCode;
    }

    public String getScope() {
        return this.scope;
    }

    public List<Long> getIdList() {
        return this.idList;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTagClassCode(String tagClassCode) {
        this.tagClassCode = tagClassCode;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TagQryDTO)) {
            return false;
        }
        TagQryDTO other = (TagQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$tagClassCode = this.getTagClassCode();
        String other$tagClassCode = other.getTagClassCode();
        if (this$tagClassCode == null ? other$tagClassCode != null : !this$tagClassCode.equals(other$tagClassCode)) {
            return false;
        }
        String this$scope = this.getScope();
        String other$scope = other.getScope();
        if (this$scope == null ? other$scope != null : !this$scope.equals(other$scope)) {
            return false;
        }
        List<Long> this$idList = this.getIdList();
        List<Long> other$idList = other.getIdList();
        return !(this$idList == null ? other$idList != null : !((Object)this$idList).equals(other$idList));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof TagQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $tagClassCode = this.getTagClassCode();
        result = result * 59 + ($tagClassCode == null ? 43 : $tagClassCode.hashCode());
        String $scope = this.getScope();
        result = result * 59 + ($scope == null ? 43 : $scope.hashCode());
        List<Long> $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : ((Object)$idList).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "TagQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", id=" + this.getId() + ", name=" + this.getName() + ", tagClassCode=" + this.getTagClassCode() + ", scope=" + this.getScope() + ", idList=" + this.getIdList() + ")";
    }
}

