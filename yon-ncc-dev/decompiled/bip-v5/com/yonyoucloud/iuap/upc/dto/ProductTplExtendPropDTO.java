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

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductTplExtendPropDTO
implements Serializable {
    private Long template;
    private Long propertyType;
    private String propertyAlias;
    private Boolean required;
    private Boolean show;
    private Integer order;

    public Long getTemplate() {
        return this.template;
    }

    public Long getPropertyType() {
        return this.propertyType;
    }

    public String getPropertyAlias() {
        return this.propertyAlias;
    }

    public Boolean getRequired() {
        return this.required;
    }

    public Boolean getShow() {
        return this.show;
    }

    public Integer getOrder() {
        return this.order;
    }

    public void setTemplate(Long template) {
        this.template = template;
    }

    public void setPropertyType(Long propertyType) {
        this.propertyType = propertyType;
    }

    public void setPropertyAlias(String propertyAlias) {
        this.propertyAlias = propertyAlias;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplExtendPropDTO)) {
            return false;
        }
        ProductTplExtendPropDTO other = (ProductTplExtendPropDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$template = this.getTemplate();
        Long other$template = other.getTemplate();
        if (this$template == null ? other$template != null : !((Object)this$template).equals(other$template)) {
            return false;
        }
        Long this$propertyType = this.getPropertyType();
        Long other$propertyType = other.getPropertyType();
        if (this$propertyType == null ? other$propertyType != null : !((Object)this$propertyType).equals(other$propertyType)) {
            return false;
        }
        Boolean this$required = this.getRequired();
        Boolean other$required = other.getRequired();
        if (this$required == null ? other$required != null : !((Object)this$required).equals(other$required)) {
            return false;
        }
        Boolean this$show = this.getShow();
        Boolean other$show = other.getShow();
        if (this$show == null ? other$show != null : !((Object)this$show).equals(other$show)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        String this$propertyAlias = this.getPropertyAlias();
        String other$propertyAlias = other.getPropertyAlias();
        return !(this$propertyAlias == null ? other$propertyAlias != null : !this$propertyAlias.equals(other$propertyAlias));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplExtendPropDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $template = this.getTemplate();
        result = result * 59 + ($template == null ? 43 : ((Object)$template).hashCode());
        Long $propertyType = this.getPropertyType();
        result = result * 59 + ($propertyType == null ? 43 : ((Object)$propertyType).hashCode());
        Boolean $required = this.getRequired();
        result = result * 59 + ($required == null ? 43 : ((Object)$required).hashCode());
        Boolean $show = this.getShow();
        result = result * 59 + ($show == null ? 43 : ((Object)$show).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        String $propertyAlias = this.getPropertyAlias();
        result = result * 59 + ($propertyAlias == null ? 43 : $propertyAlias.hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplExtendPropDTO(template=" + this.getTemplate() + ", propertyType=" + this.getPropertyType() + ", propertyAlias=" + this.getPropertyAlias() + ", required=" + this.getRequired() + ", show=" + this.getShow() + ", order=" + this.getOrder() + ")";
    }
}

