/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.productTpl.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.productTpl.dto.MultilingualDTO;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplParameterDTO {
    MultilingualDTO name;
    Boolean isFilter;
    MultilingualDTO group;

    public MultilingualDTO getName() {
        return this.name;
    }

    public Boolean getIsFilter() {
        return this.isFilter;
    }

    public MultilingualDTO getGroup() {
        return this.group;
    }

    public void setName(MultilingualDTO name) {
        this.name = name;
    }

    public void setIsFilter(Boolean isFilter) {
        this.isFilter = isFilter;
    }

    public void setGroup(MultilingualDTO group) {
        this.group = group;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplParameterDTO)) {
            return false;
        }
        ProductTplParameterDTO other = (ProductTplParameterDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$isFilter = this.getIsFilter();
        Boolean other$isFilter = other.getIsFilter();
        if (this$isFilter == null ? other$isFilter != null : !((Object)this$isFilter).equals(other$isFilter)) {
            return false;
        }
        MultilingualDTO this$name = this.getName();
        MultilingualDTO other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        MultilingualDTO this$group = this.getGroup();
        MultilingualDTO other$group = other.getGroup();
        return !(this$group == null ? other$group != null : !((Object)this$group).equals(other$group));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplParameterDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $isFilter = this.getIsFilter();
        result = result * 59 + ($isFilter == null ? 43 : ((Object)$isFilter).hashCode());
        MultilingualDTO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : ((Object)$name).hashCode());
        MultilingualDTO $group = this.getGroup();
        result = result * 59 + ($group == null ? 43 : ((Object)$group).hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplParameterDTO(name=" + this.getName() + ", isFilter=" + this.getIsFilter() + ", group=" + this.getGroup() + ")";
    }
}

