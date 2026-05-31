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
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class SkuTagQryDTO
implements Serializable {
    private Long id;
    private String name;
    private List<Long> idList;
    private List<String> nameList;

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public List<Long> getIdList() {
        return this.idList;
    }

    public List<String> getNameList() {
        return this.nameList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public void setNameList(List<String> nameList) {
        this.nameList = nameList;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SkuTagQryDTO)) {
            return false;
        }
        SkuTagQryDTO other = (SkuTagQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        List<Long> this$idList = this.getIdList();
        List<Long> other$idList = other.getIdList();
        if (this$idList == null ? other$idList != null : !((Object)this$idList).equals(other$idList)) {
            return false;
        }
        List<String> this$nameList = this.getNameList();
        List<String> other$nameList = other.getNameList();
        return !(this$nameList == null ? other$nameList != null : !((Object)this$nameList).equals(other$nameList));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SkuTagQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        List<Long> $idList = this.getIdList();
        result = result * 59 + ($idList == null ? 43 : ((Object)$idList).hashCode());
        List<String> $nameList = this.getNameList();
        result = result * 59 + ($nameList == null ? 43 : ((Object)$nameList).hashCode());
        return result;
    }

    public String toString() {
        return "SkuTagQryDTO(id=" + this.getId() + ", name=" + this.getName() + ", idList=" + this.getIdList() + ", nameList=" + this.getNameList() + ")";
    }
}

