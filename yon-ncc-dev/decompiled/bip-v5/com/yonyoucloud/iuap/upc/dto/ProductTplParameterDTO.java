/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyoucloud.iuap.upc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.international.MultiLangText;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplParameterDTO
implements Serializable {
    private Long id;
    private Long parent;
    private Long template;
    private String group;
    private String name;
    private MultiLangText name_multilang;
    private Boolean filter;

    public Long getId() {
        return this.id;
    }

    public Long getParent() {
        return this.parent;
    }

    public Long getTemplate() {
        return this.template;
    }

    public String getGroup() {
        return this.group;
    }

    public String getName() {
        return this.name;
    }

    public MultiLangText getName_multilang() {
        return this.name_multilang;
    }

    public Boolean getFilter() {
        return this.filter;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public void setTemplate(Long template) {
        this.template = template;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName_multilang(MultiLangText name_multilang) {
        this.name_multilang = name_multilang;
    }

    public void setFilter(Boolean filter) {
        this.filter = filter;
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
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        Long this$parent = this.getParent();
        Long other$parent = other.getParent();
        if (this$parent == null ? other$parent != null : !((Object)this$parent).equals(other$parent)) {
            return false;
        }
        Long this$template = this.getTemplate();
        Long other$template = other.getTemplate();
        if (this$template == null ? other$template != null : !((Object)this$template).equals(other$template)) {
            return false;
        }
        Boolean this$filter = this.getFilter();
        Boolean other$filter = other.getFilter();
        if (this$filter == null ? other$filter != null : !((Object)this$filter).equals(other$filter)) {
            return false;
        }
        String this$group = this.getGroup();
        String other$group = other.getGroup();
        if (this$group == null ? other$group != null : !this$group.equals(other$group)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        MultiLangText this$name_multilang = this.getName_multilang();
        MultiLangText other$name_multilang = other.getName_multilang();
        return !(this$name_multilang == null ? other$name_multilang != null : !this$name_multilang.equals(other$name_multilang));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplParameterDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        Long $parent = this.getParent();
        result = result * 59 + ($parent == null ? 43 : ((Object)$parent).hashCode());
        Long $template = this.getTemplate();
        result = result * 59 + ($template == null ? 43 : ((Object)$template).hashCode());
        Boolean $filter = this.getFilter();
        result = result * 59 + ($filter == null ? 43 : ((Object)$filter).hashCode());
        String $group = this.getGroup();
        result = result * 59 + ($group == null ? 43 : $group.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        MultiLangText $name_multilang = this.getName_multilang();
        result = result * 59 + ($name_multilang == null ? 43 : $name_multilang.hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplParameterDTO(id=" + this.getId() + ", parent=" + this.getParent() + ", template=" + this.getTemplate() + ", group=" + this.getGroup() + ", name=" + this.getName() + ", name_multilang=" + this.getName_multilang() + ", filter=" + this.getFilter() + ")";
    }
}

