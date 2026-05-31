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
public class TaxRevenueDTO
implements Serializable {
    private Long id;
    private String code;
    private String parentCode;
    private String name;
    private String simpleName;
    private String taxDesc;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getParentCode() {
        return this.parentCode;
    }

    public String getName() {
        return this.name;
    }

    public String getSimpleName() {
        return this.simpleName;
    }

    public String getTaxDesc() {
        return this.taxDesc;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSimpleName(String simpleName) {
        this.simpleName = simpleName;
    }

    public void setTaxDesc(String taxDesc) {
        this.taxDesc = taxDesc;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TaxRevenueDTO)) {
            return false;
        }
        TaxRevenueDTO other = (TaxRevenueDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$parentCode = this.getParentCode();
        String other$parentCode = other.getParentCode();
        if (this$parentCode == null ? other$parentCode != null : !this$parentCode.equals(other$parentCode)) {
            return false;
        }
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$simpleName = this.getSimpleName();
        String other$simpleName = other.getSimpleName();
        if (this$simpleName == null ? other$simpleName != null : !this$simpleName.equals(other$simpleName)) {
            return false;
        }
        String this$taxDesc = this.getTaxDesc();
        String other$taxDesc = other.getTaxDesc();
        return !(this$taxDesc == null ? other$taxDesc != null : !this$taxDesc.equals(other$taxDesc));
    }

    protected boolean canEqual(Object other) {
        return other instanceof TaxRevenueDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $parentCode = this.getParentCode();
        result = result * 59 + ($parentCode == null ? 43 : $parentCode.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $simpleName = this.getSimpleName();
        result = result * 59 + ($simpleName == null ? 43 : $simpleName.hashCode());
        String $taxDesc = this.getTaxDesc();
        result = result * 59 + ($taxDesc == null ? 43 : $taxDesc.hashCode());
        return result;
    }

    public String toString() {
        return "TaxRevenueDTO(id=" + this.getId() + ", code=" + this.getCode() + ", parentCode=" + this.getParentCode() + ", name=" + this.getName() + ", simpleName=" + this.getSimpleName() + ", taxDesc=" + this.getTaxDesc() + ")";
    }
}

