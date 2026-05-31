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

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class CustomerCategoryQryDTO
extends MerchantDerivativeBaseQryDTO {
    private Long parent;
    private String path;
    private String fuzzyPath;
    private Integer level;
    private Integer stopStatus;

    public Long getParent() {
        return this.parent;
    }

    public String getPath() {
        return this.path;
    }

    public String getFuzzyPath() {
        return this.fuzzyPath;
    }

    public Integer getLevel() {
        return this.level;
    }

    public Integer getStopStatus() {
        return this.stopStatus;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void setFuzzyPath(String fuzzyPath) {
        this.fuzzyPath = fuzzyPath;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public void setStopStatus(Integer stopStatus) {
        this.stopStatus = stopStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof CustomerCategoryQryDTO)) {
            return false;
        }
        CustomerCategoryQryDTO other = (CustomerCategoryQryDTO)o;
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
        Integer this$stopStatus = this.getStopStatus();
        Integer other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !((Object)this$stopStatus).equals(other$stopStatus)) {
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
        return other instanceof CustomerCategoryQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $parent = this.getParent();
        result = result * 59 + ($parent == null ? 43 : ((Object)$parent).hashCode());
        Integer $level = this.getLevel();
        result = result * 59 + ($level == null ? 43 : ((Object)$level).hashCode());
        Integer $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : ((Object)$stopStatus).hashCode());
        String $path = this.getPath();
        result = result * 59 + ($path == null ? 43 : $path.hashCode());
        String $fuzzyPath = this.getFuzzyPath();
        result = result * 59 + ($fuzzyPath == null ? 43 : $fuzzyPath.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "CustomerCategoryQryDTO(parent=" + this.getParent() + ", path=" + this.getPath() + ", fuzzyPath=" + this.getFuzzyPath() + ", level=" + this.getLevel() + ", stopStatus=" + this.getStopStatus() + ")";
    }
}

