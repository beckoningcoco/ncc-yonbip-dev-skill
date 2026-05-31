/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.BaseDTO;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ClassBaseDTO
extends BaseDTO {
    private Long parent;
    private Integer level;
    private String path;
    private Integer sort;
    private Boolean end;

    public Long getParent() {
        return this.parent;
    }

    public Integer getLevel() {
        return this.level;
    }

    public String getPath() {
        return this.path;
    }

    public Integer getSort() {
        return this.sort;
    }

    public Boolean getEnd() {
        return this.end;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public void setEnd(Boolean end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ClassBaseDTO)) {
            return false;
        }
        ClassBaseDTO other = (ClassBaseDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$parent = this.getParent();
        Long other$parent = other.getParent();
        if (this$parent == null ? other$parent != null : !((Object)this$parent).equals(other$parent)) {
            return false;
        }
        Integer this$level = this.getLevel();
        Integer other$level = other.getLevel();
        if (this$level == null ? other$level != null : !((Object)this$level).equals(other$level)) {
            return false;
        }
        Integer this$sort = this.getSort();
        Integer other$sort = other.getSort();
        if (this$sort == null ? other$sort != null : !((Object)this$sort).equals(other$sort)) {
            return false;
        }
        Boolean this$end = this.getEnd();
        Boolean other$end = other.getEnd();
        if (this$end == null ? other$end != null : !((Object)this$end).equals(other$end)) {
            return false;
        }
        String this$path = this.getPath();
        String other$path = other.getPath();
        return !(this$path == null ? other$path != null : !this$path.equals(other$path));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof ClassBaseDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $parent = this.getParent();
        result = result * 59 + ($parent == null ? 43 : ((Object)$parent).hashCode());
        Integer $level = this.getLevel();
        result = result * 59 + ($level == null ? 43 : ((Object)$level).hashCode());
        Integer $sort = this.getSort();
        result = result * 59 + ($sort == null ? 43 : ((Object)$sort).hashCode());
        Boolean $end = this.getEnd();
        result = result * 59 + ($end == null ? 43 : ((Object)$end).hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "ClassBaseDTO(parent=" + this.getParent() + ", level=" + this.getLevel() + ", path=" + this.getPath() + ", sort=" + this.getSort() + ", end=" + this.getEnd() + ")";
    }
}

