/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MaterialLifeCycleCheckVO {
    private Long productId;
    private Integer controlRule;
    private String desc;

    public Long getProductId() {
        return this.productId;
    }

    public Integer getControlRule() {
        return this.controlRule;
    }

    public String getDesc() {
        return this.desc;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public void setControlRule(Integer controlRule) {
        this.controlRule = controlRule;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialLifeCycleCheckVO)) {
            return false;
        }
        MaterialLifeCycleCheckVO other = (MaterialLifeCycleCheckVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$productId = this.getProductId();
        Long other$productId = other.getProductId();
        if (this$productId == null ? other$productId != null : !((Object)this$productId).equals(other$productId)) {
            return false;
        }
        Integer this$controlRule = this.getControlRule();
        Integer other$controlRule = other.getControlRule();
        if (this$controlRule == null ? other$controlRule != null : !((Object)this$controlRule).equals(other$controlRule)) {
            return false;
        }
        String this$desc = this.getDesc();
        String other$desc = other.getDesc();
        return !(this$desc == null ? other$desc != null : !this$desc.equals(other$desc));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MaterialLifeCycleCheckVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $productId = this.getProductId();
        result = result * 59 + ($productId == null ? 43 : ((Object)$productId).hashCode());
        Integer $controlRule = this.getControlRule();
        result = result * 59 + ($controlRule == null ? 43 : ((Object)$controlRule).hashCode());
        String $desc = this.getDesc();
        result = result * 59 + ($desc == null ? 43 : $desc.hashCode());
        return result;
    }

    public String toString() {
        return "MaterialLifeCycleCheckVO(productId=" + this.getProductId() + ", controlRule=" + this.getControlRule() + ", desc=" + this.getDesc() + ")";
    }
}

