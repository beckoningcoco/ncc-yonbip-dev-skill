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
public class ProductLineDTO
implements Serializable {
    private Long id;
    private String code;
    private String name;
    private String name2;
    private String name3;
    private String remark;
    private String remark2;
    private String remark3;
    private String stopStatus;
    private String erpCode;

    public Long getId() {
        return this.id;
    }

    public String getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public String getName2() {
        return this.name2;
    }

    public String getName3() {
        return this.name3;
    }

    public String getRemark() {
        return this.remark;
    }

    public String getRemark2() {
        return this.remark2;
    }

    public String getRemark3() {
        return this.remark3;
    }

    public String getStopStatus() {
        return this.stopStatus;
    }

    public String getErpCode() {
        return this.erpCode;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    public void setStopStatus(String stopStatus) {
        this.stopStatus = stopStatus;
    }

    public void setErpCode(String erpCode) {
        this.erpCode = erpCode;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductLineDTO)) {
            return false;
        }
        ProductLineDTO other = (ProductLineDTO)o;
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
        String this$name = this.getName();
        String other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) {
            return false;
        }
        String this$name2 = this.getName2();
        String other$name2 = other.getName2();
        if (this$name2 == null ? other$name2 != null : !this$name2.equals(other$name2)) {
            return false;
        }
        String this$name3 = this.getName3();
        String other$name3 = other.getName3();
        if (this$name3 == null ? other$name3 != null : !this$name3.equals(other$name3)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        if (this$remark == null ? other$remark != null : !this$remark.equals(other$remark)) {
            return false;
        }
        String this$remark2 = this.getRemark2();
        String other$remark2 = other.getRemark2();
        if (this$remark2 == null ? other$remark2 != null : !this$remark2.equals(other$remark2)) {
            return false;
        }
        String this$remark3 = this.getRemark3();
        String other$remark3 = other.getRemark3();
        if (this$remark3 == null ? other$remark3 != null : !this$remark3.equals(other$remark3)) {
            return false;
        }
        String this$stopStatus = this.getStopStatus();
        String other$stopStatus = other.getStopStatus();
        if (this$stopStatus == null ? other$stopStatus != null : !this$stopStatus.equals(other$stopStatus)) {
            return false;
        }
        String this$erpCode = this.getErpCode();
        String other$erpCode = other.getErpCode();
        return !(this$erpCode == null ? other$erpCode != null : !this$erpCode.equals(other$erpCode));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductLineDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $name = this.getName();
        result = result * 59 + ($name == null ? 43 : $name.hashCode());
        String $name2 = this.getName2();
        result = result * 59 + ($name2 == null ? 43 : $name2.hashCode());
        String $name3 = this.getName3();
        result = result * 59 + ($name3 == null ? 43 : $name3.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        String $remark2 = this.getRemark2();
        result = result * 59 + ($remark2 == null ? 43 : $remark2.hashCode());
        String $remark3 = this.getRemark3();
        result = result * 59 + ($remark3 == null ? 43 : $remark3.hashCode());
        String $stopStatus = this.getStopStatus();
        result = result * 59 + ($stopStatus == null ? 43 : $stopStatus.hashCode());
        String $erpCode = this.getErpCode();
        result = result * 59 + ($erpCode == null ? 43 : $erpCode.hashCode());
        return result;
    }

    public String toString() {
        return "ProductLineDTO(id=" + this.getId() + ", code=" + this.getCode() + ", name=" + this.getName() + ", name2=" + this.getName2() + ", name3=" + this.getName3() + ", remark=" + this.getRemark() + ", remark2=" + this.getRemark2() + ", remark3=" + this.getRemark3() + ", stopStatus=" + this.getStopStatus() + ", erpCode=" + this.getErpCode() + ")";
    }
}

