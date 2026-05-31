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
public class ProductTplSpecSumDTO
implements Serializable {
    private Long template;
    private Long specification;
    private String specItem;
    private Integer order;
    private Boolean twoDimensionalInput;
    private Boolean specBusinessDynamic;

    public Long getTemplate() {
        return this.template;
    }

    public Long getSpecification() {
        return this.specification;
    }

    public String getSpecItem() {
        return this.specItem;
    }

    public Integer getOrder() {
        return this.order;
    }

    public Boolean getTwoDimensionalInput() {
        return this.twoDimensionalInput;
    }

    public Boolean getSpecBusinessDynamic() {
        return this.specBusinessDynamic;
    }

    public void setTemplate(Long template) {
        this.template = template;
    }

    public void setSpecification(Long specification) {
        this.specification = specification;
    }

    public void setSpecItem(String specItem) {
        this.specItem = specItem;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public void setTwoDimensionalInput(Boolean twoDimensionalInput) {
        this.twoDimensionalInput = twoDimensionalInput;
    }

    public void setSpecBusinessDynamic(Boolean specBusinessDynamic) {
        this.specBusinessDynamic = specBusinessDynamic;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductTplSpecSumDTO)) {
            return false;
        }
        ProductTplSpecSumDTO other = (ProductTplSpecSumDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$template = this.getTemplate();
        Long other$template = other.getTemplate();
        if (this$template == null ? other$template != null : !((Object)this$template).equals(other$template)) {
            return false;
        }
        Long this$specification = this.getSpecification();
        Long other$specification = other.getSpecification();
        if (this$specification == null ? other$specification != null : !((Object)this$specification).equals(other$specification)) {
            return false;
        }
        Integer this$order = this.getOrder();
        Integer other$order = other.getOrder();
        if (this$order == null ? other$order != null : !((Object)this$order).equals(other$order)) {
            return false;
        }
        Boolean this$twoDimensionalInput = this.getTwoDimensionalInput();
        Boolean other$twoDimensionalInput = other.getTwoDimensionalInput();
        if (this$twoDimensionalInput == null ? other$twoDimensionalInput != null : !((Object)this$twoDimensionalInput).equals(other$twoDimensionalInput)) {
            return false;
        }
        Boolean this$specBusinessDynamic = this.getSpecBusinessDynamic();
        Boolean other$specBusinessDynamic = other.getSpecBusinessDynamic();
        if (this$specBusinessDynamic == null ? other$specBusinessDynamic != null : !((Object)this$specBusinessDynamic).equals(other$specBusinessDynamic)) {
            return false;
        }
        String this$specItem = this.getSpecItem();
        String other$specItem = other.getSpecItem();
        return !(this$specItem == null ? other$specItem != null : !this$specItem.equals(other$specItem));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductTplSpecSumDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $template = this.getTemplate();
        result = result * 59 + ($template == null ? 43 : ((Object)$template).hashCode());
        Long $specification = this.getSpecification();
        result = result * 59 + ($specification == null ? 43 : ((Object)$specification).hashCode());
        Integer $order = this.getOrder();
        result = result * 59 + ($order == null ? 43 : ((Object)$order).hashCode());
        Boolean $twoDimensionalInput = this.getTwoDimensionalInput();
        result = result * 59 + ($twoDimensionalInput == null ? 43 : ((Object)$twoDimensionalInput).hashCode());
        Boolean $specBusinessDynamic = this.getSpecBusinessDynamic();
        result = result * 59 + ($specBusinessDynamic == null ? 43 : ((Object)$specBusinessDynamic).hashCode());
        String $specItem = this.getSpecItem();
        result = result * 59 + ($specItem == null ? 43 : $specItem.hashCode());
        return result;
    }

    public String toString() {
        return "ProductTplSpecSumDTO(template=" + this.getTemplate() + ", specification=" + this.getSpecification() + ", specItem=" + this.getSpecItem() + ", order=" + this.getOrder() + ", twoDimensionalInput=" + this.getTwoDimensionalInput() + ", specBusinessDynamic=" + this.getSpecBusinessDynamic() + ")";
    }
}

