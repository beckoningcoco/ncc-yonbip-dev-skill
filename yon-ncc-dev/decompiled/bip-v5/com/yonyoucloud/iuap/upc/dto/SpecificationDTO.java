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
public class SpecificationDTO
implements Serializable {
    private Long iSpecId;
    private Long lsSpecItems_id;
    private String specCode;
    private String specName;
    private String cBarCode;

    public Long getISpecId() {
        return this.iSpecId;
    }

    public Long getLsSpecItems_id() {
        return this.lsSpecItems_id;
    }

    public String getSpecCode() {
        return this.specCode;
    }

    public String getSpecName() {
        return this.specName;
    }

    public String getCBarCode() {
        return this.cBarCode;
    }

    public void setISpecId(Long iSpecId) {
        this.iSpecId = iSpecId;
    }

    public void setLsSpecItems_id(Long lsSpecItems_id) {
        this.lsSpecItems_id = lsSpecItems_id;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

    public void setCBarCode(String cBarCode) {
        this.cBarCode = cBarCode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SpecificationDTO)) {
            return false;
        }
        SpecificationDTO other = (SpecificationDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$iSpecId = this.getISpecId();
        Long other$iSpecId = other.getISpecId();
        if (this$iSpecId == null ? other$iSpecId != null : !((Object)this$iSpecId).equals(other$iSpecId)) {
            return false;
        }
        Long this$lsSpecItems_id = this.getLsSpecItems_id();
        Long other$lsSpecItems_id = other.getLsSpecItems_id();
        if (this$lsSpecItems_id == null ? other$lsSpecItems_id != null : !((Object)this$lsSpecItems_id).equals(other$lsSpecItems_id)) {
            return false;
        }
        String this$specCode = this.getSpecCode();
        String other$specCode = other.getSpecCode();
        if (this$specCode == null ? other$specCode != null : !this$specCode.equals(other$specCode)) {
            return false;
        }
        String this$specName = this.getSpecName();
        String other$specName = other.getSpecName();
        if (this$specName == null ? other$specName != null : !this$specName.equals(other$specName)) {
            return false;
        }
        String this$cBarCode = this.getCBarCode();
        String other$cBarCode = other.getCBarCode();
        return !(this$cBarCode == null ? other$cBarCode != null : !this$cBarCode.equals(other$cBarCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SpecificationDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $iSpecId = this.getISpecId();
        result = result * 59 + ($iSpecId == null ? 43 : ((Object)$iSpecId).hashCode());
        Long $lsSpecItems_id = this.getLsSpecItems_id();
        result = result * 59 + ($lsSpecItems_id == null ? 43 : ((Object)$lsSpecItems_id).hashCode());
        String $specCode = this.getSpecCode();
        result = result * 59 + ($specCode == null ? 43 : $specCode.hashCode());
        String $specName = this.getSpecName();
        result = result * 59 + ($specName == null ? 43 : $specName.hashCode());
        String $cBarCode = this.getCBarCode();
        result = result * 59 + ($cBarCode == null ? 43 : $cBarCode.hashCode());
        return result;
    }

    public String toString() {
        return "SpecificationDTO(iSpecId=" + this.getISpecId() + ", lsSpecItems_id=" + this.getLsSpecItems_id() + ", specCode=" + this.getSpecCode() + ", specName=" + this.getSpecName() + ", cBarCode=" + this.getCBarCode() + ")";
    }
}

