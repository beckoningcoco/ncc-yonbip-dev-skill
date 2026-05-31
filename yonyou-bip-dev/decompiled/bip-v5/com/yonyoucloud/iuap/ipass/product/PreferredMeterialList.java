/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.product;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PreferredMeterialList
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String cpuUserGroup;
    private String cpuUserGroup_name;
    private String first_material;
    private String Product_id;
    private String preferred_orgId;
    private String preferred_orgId_code;
    private String _status;
    private String delflag;
    private String cpuUserGroup_code;
    private String preferred_org_code;

    public String getId() {
        return this.id;
    }

    public String getCpuUserGroup() {
        return this.cpuUserGroup;
    }

    public String getCpuUserGroup_name() {
        return this.cpuUserGroup_name;
    }

    public String getFirst_material() {
        return this.first_material;
    }

    public String getProduct_id() {
        return this.Product_id;
    }

    public String getPreferred_orgId() {
        return this.preferred_orgId;
    }

    public String getPreferred_orgId_code() {
        return this.preferred_orgId_code;
    }

    public String get_status() {
        return this._status;
    }

    public String getDelflag() {
        return this.delflag;
    }

    public String getCpuUserGroup_code() {
        return this.cpuUserGroup_code;
    }

    public String getPreferred_org_code() {
        return this.preferred_org_code;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCpuUserGroup(String cpuUserGroup) {
        this.cpuUserGroup = cpuUserGroup;
    }

    public void setCpuUserGroup_name(String cpuUserGroup_name) {
        this.cpuUserGroup_name = cpuUserGroup_name;
    }

    public void setFirst_material(String first_material) {
        this.first_material = first_material;
    }

    public void setProduct_id(String Product_id) {
        this.Product_id = Product_id;
    }

    public void setPreferred_orgId(String preferred_orgId) {
        this.preferred_orgId = preferred_orgId;
    }

    public void setPreferred_orgId_code(String preferred_orgId_code) {
        this.preferred_orgId_code = preferred_orgId_code;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public void setDelflag(String delflag) {
        this.delflag = delflag;
    }

    public void setCpuUserGroup_code(String cpuUserGroup_code) {
        this.cpuUserGroup_code = cpuUserGroup_code;
    }

    public void setPreferred_org_code(String preferred_org_code) {
        this.preferred_org_code = preferred_org_code;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PreferredMeterialList)) {
            return false;
        }
        PreferredMeterialList other = (PreferredMeterialList)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$cpuUserGroup = this.getCpuUserGroup();
        String other$cpuUserGroup = other.getCpuUserGroup();
        if (this$cpuUserGroup == null ? other$cpuUserGroup != null : !this$cpuUserGroup.equals(other$cpuUserGroup)) {
            return false;
        }
        String this$cpuUserGroup_name = this.getCpuUserGroup_name();
        String other$cpuUserGroup_name = other.getCpuUserGroup_name();
        if (this$cpuUserGroup_name == null ? other$cpuUserGroup_name != null : !this$cpuUserGroup_name.equals(other$cpuUserGroup_name)) {
            return false;
        }
        String this$first_material = this.getFirst_material();
        String other$first_material = other.getFirst_material();
        if (this$first_material == null ? other$first_material != null : !this$first_material.equals(other$first_material)) {
            return false;
        }
        String this$Product_id = this.getProduct_id();
        String other$Product_id = other.getProduct_id();
        if (this$Product_id == null ? other$Product_id != null : !this$Product_id.equals(other$Product_id)) {
            return false;
        }
        String this$preferred_orgId = this.getPreferred_orgId();
        String other$preferred_orgId = other.getPreferred_orgId();
        if (this$preferred_orgId == null ? other$preferred_orgId != null : !this$preferred_orgId.equals(other$preferred_orgId)) {
            return false;
        }
        String this$preferred_orgId_code = this.getPreferred_orgId_code();
        String other$preferred_orgId_code = other.getPreferred_orgId_code();
        if (this$preferred_orgId_code == null ? other$preferred_orgId_code != null : !this$preferred_orgId_code.equals(other$preferred_orgId_code)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        if (this$_status == null ? other$_status != null : !this$_status.equals(other$_status)) {
            return false;
        }
        String this$delflag = this.getDelflag();
        String other$delflag = other.getDelflag();
        if (this$delflag == null ? other$delflag != null : !this$delflag.equals(other$delflag)) {
            return false;
        }
        String this$cpuUserGroup_code = this.getCpuUserGroup_code();
        String other$cpuUserGroup_code = other.getCpuUserGroup_code();
        if (this$cpuUserGroup_code == null ? other$cpuUserGroup_code != null : !this$cpuUserGroup_code.equals(other$cpuUserGroup_code)) {
            return false;
        }
        String this$preferred_org_code = this.getPreferred_org_code();
        String other$preferred_org_code = other.getPreferred_org_code();
        return !(this$preferred_org_code == null ? other$preferred_org_code != null : !this$preferred_org_code.equals(other$preferred_org_code));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PreferredMeterialList;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $cpuUserGroup = this.getCpuUserGroup();
        result = result * 59 + ($cpuUserGroup == null ? 43 : $cpuUserGroup.hashCode());
        String $cpuUserGroup_name = this.getCpuUserGroup_name();
        result = result * 59 + ($cpuUserGroup_name == null ? 43 : $cpuUserGroup_name.hashCode());
        String $first_material = this.getFirst_material();
        result = result * 59 + ($first_material == null ? 43 : $first_material.hashCode());
        String $Product_id = this.getProduct_id();
        result = result * 59 + ($Product_id == null ? 43 : $Product_id.hashCode());
        String $preferred_orgId = this.getPreferred_orgId();
        result = result * 59 + ($preferred_orgId == null ? 43 : $preferred_orgId.hashCode());
        String $preferred_orgId_code = this.getPreferred_orgId_code();
        result = result * 59 + ($preferred_orgId_code == null ? 43 : $preferred_orgId_code.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        String $delflag = this.getDelflag();
        result = result * 59 + ($delflag == null ? 43 : $delflag.hashCode());
        String $cpuUserGroup_code = this.getCpuUserGroup_code();
        result = result * 59 + ($cpuUserGroup_code == null ? 43 : $cpuUserGroup_code.hashCode());
        String $preferred_org_code = this.getPreferred_org_code();
        result = result * 59 + ($preferred_org_code == null ? 43 : $preferred_org_code.hashCode());
        return result;
    }

    public String toString() {
        return "PreferredMeterialList(id=" + this.getId() + ", cpuUserGroup=" + this.getCpuUserGroup() + ", cpuUserGroup_name=" + this.getCpuUserGroup_name() + ", first_material=" + this.getFirst_material() + ", Product_id=" + this.getProduct_id() + ", preferred_orgId=" + this.getPreferred_orgId() + ", preferred_orgId_code=" + this.getPreferred_orgId_code() + ", _status=" + this.get_status() + ", delflag=" + this.getDelflag() + ", cpuUserGroup_code=" + this.getCpuUserGroup_code() + ", preferred_org_code=" + this.getPreferred_org_code() + ")";
    }
}

