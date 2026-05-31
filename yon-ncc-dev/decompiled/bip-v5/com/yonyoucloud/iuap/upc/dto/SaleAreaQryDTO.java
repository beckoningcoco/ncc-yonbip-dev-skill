/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.MerchantDerivativeBaseQryDTO;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class SaleAreaQryDTO
extends MerchantDerivativeBaseQryDTO {
    private Integer level;
    private Long parent;
    private List<Long> parents;
    private Long fuzzyParent;
    private String path;
    private String fuzzyPath;

    public Integer getLevel() {
        return this.level;
    }

    public Long getParent() {
        return this.parent;
    }

    public List<Long> getParents() {
        return this.parents;
    }

    public Long getFuzzyParent() {
        return this.fuzzyParent;
    }

    public String getPath() {
        return this.path;
    }

    public String getFuzzyPath() {
        return this.fuzzyPath;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public void setParents(List<Long> parents) {
        this.parents = parents;
    }

    public void setFuzzyParent(Long fuzzyParent) {
        this.fuzzyParent = fuzzyParent;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setFuzzyPath(String fuzzyPath) {
        this.fuzzyPath = fuzzyPath;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SaleAreaQryDTO)) {
            return false;
        }
        SaleAreaQryDTO other = (SaleAreaQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Integer this$level = this.getLevel();
        Integer other$level = other.getLevel();
        if (this$level == null ? other$level != null : !((Object)this$level).equals(other$level)) {
            return false;
        }
        Long this$parent = this.getParent();
        Long other$parent = other.getParent();
        if (this$parent == null ? other$parent != null : !((Object)this$parent).equals(other$parent)) {
            return false;
        }
        Long this$fuzzyParent = this.getFuzzyParent();
        Long other$fuzzyParent = other.getFuzzyParent();
        if (this$fuzzyParent == null ? other$fuzzyParent != null : !((Object)this$fuzzyParent).equals(other$fuzzyParent)) {
            return false;
        }
        List<Long> this$parents = this.getParents();
        List<Long> other$parents = other.getParents();
        if (this$parents == null ? other$parents != null : !((Object)this$parents).equals(other$parents)) {
            return false;
        }
        String this$path = this.getPath();
        String other$path = other.getPath();
        if (this$path == null ? other$path != null : !this$path.equals(other$path)) {
            return false;
        }
        String this$fuzzyPath = this.getFuzzyPath();
        String other$fuzzyPath = other.getFuzzyPath();
        return !(this$fuzzyPath == null ? other$fuzzyPath != null : !this$fuzzyPath.equals(other$fuzzyPath));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SaleAreaQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Integer $level = this.getLevel();
        result = result * 59 + ($level == null ? 43 : ((Object)$level).hashCode());
        Long $parent = this.getParent();
        result = result * 59 + ($parent == null ? 43 : ((Object)$parent).hashCode());
        Long $fuzzyParent = this.getFuzzyParent();
        result = result * 59 + ($fuzzyParent == null ? 43 : ((Object)$fuzzyParent).hashCode());
        List<Long> $parents = this.getParents();
        result = result * 59 + ($parents == null ? 43 : ((Object)$parents).hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        String $fuzzyPath = this.getFuzzyPath();
        result = result * 59 + ($fuzzyPath == null ? 43 : $fuzzyPath.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "SaleAreaQryDTO(level=" + this.getLevel() + ", parent=" + this.getParent() + ", parents=" + this.getParents() + ", fuzzyParent=" + this.getFuzzyParent() + ", path=" + this.getPath() + ", fuzzyPath=" + this.getFuzzyPath() + ")";
    }
}

