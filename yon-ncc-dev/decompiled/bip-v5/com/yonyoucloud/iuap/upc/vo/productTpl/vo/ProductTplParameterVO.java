/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.productTpl.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplParameterVO {
    MultilingualVO name;
    Boolean isFilter;
    MultilingualVO group;

    public MultilingualVO getName() {
        return this.name;
    }

    public Boolean getIsFilter() {
        return this.isFilter;
    }

    public MultilingualVO getGroup() {
        return this.group;
    }

    public void setName(MultilingualVO name) {
        this.name = name;
    }

    public void setIsFilter(Boolean isFilter) {
        this.isFilter = isFilter;
    }

    public void setGroup(MultilingualVO group) {
        this.group = group;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplParameterVO)) {
            return false;
        }
        ProductTplParameterVO other = (ProductTplParameterVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$isFilter = this.getIsFilter();
        Boolean other$isFilter = other.getIsFilter();
        if (this$isFilter == null ? other$isFilter != null : !((Object)this$isFilter).equals(other$isFilter)) {
            return false;
        }
        MultilingualVO this$name = this.getName();
        MultilingualVO other$name = other.getName();
        if (this$name == null ? other$name != null : !((Object)this$name).equals(other$name)) {
            return false;
        }
        MultilingualVO this$group = this.getGroup();
        MultilingualVO other$group = other.getGroup();
        return !(this$group == null ? other$group != null : !((Object)this$group).equals(other$group));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplParameterVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $isFilter = this.getIsFilter();
        result = result * 59 + ($isFilter == null ? 43 : ((Object)$isFilter).hashCode());
        MultilingualVO $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        MultilingualVO $group = this.getGroup();
        result = result * 59 + ($group == null ? 43 : $group.hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplParameterVO(name=" + this.getName() + ", isFilter=" + this.getIsFilter() + ", group=" + this.getGroup() + ")";
    }
}

