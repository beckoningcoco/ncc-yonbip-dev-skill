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
public class ProductIPassOrg
implements Serializable {
    private static final long serialVersionUID = 1L;
    private String orgCode;
    private String orgId;
    private Boolean custom_firstMaterial;
    private String custom_cpuUserGroup;

    public String getOrgCode() {
        return this.orgCode;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public Boolean getCustom_firstMaterial() {
        return this.custom_firstMaterial;
    }

    public String getCustom_cpuUserGroup() {
        return this.custom_cpuUserGroup;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setCustom_firstMaterial(Boolean custom_firstMaterial) {
        this.custom_firstMaterial = custom_firstMaterial;
    }

    public void setCustom_cpuUserGroup(String custom_cpuUserGroup) {
        this.custom_cpuUserGroup = custom_cpuUserGroup;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductIPassOrg)) {
            return false;
        }
        ProductIPassOrg other = (ProductIPassOrg)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Boolean this$custom_firstMaterial = this.getCustom_firstMaterial();
        Boolean other$custom_firstMaterial = other.getCustom_firstMaterial();
        if (this$custom_firstMaterial == null ? other$custom_firstMaterial != null : !((Object)this$custom_firstMaterial).equals(other$custom_firstMaterial)) {
            return false;
        }
        String this$orgCode = this.getOrgCode();
        String other$orgCode = other.getOrgCode();
        if (this$orgCode == null ? other$orgCode != null : !this$orgCode.equals(other$orgCode)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$custom_cpuUserGroup = this.getCustom_cpuUserGroup();
        String other$custom_cpuUserGroup = other.getCustom_cpuUserGroup();
        return !(this$custom_cpuUserGroup == null ? other$custom_cpuUserGroup != null : !this$custom_cpuUserGroup.equals(other$custom_cpuUserGroup));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductIPassOrg;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Boolean $custom_firstMaterial = this.getCustom_firstMaterial();
        result = result * 59 + ($custom_firstMaterial == null ? 43 : ((Object)$custom_firstMaterial).hashCode());
        String $orgCode = this.getOrgCode();
        result = result * 59 + ($orgCode == null ? 43 : $orgCode.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $custom_cpuUserGroup = this.getCustom_cpuUserGroup();
        result = result * 59 + ($custom_cpuUserGroup == null ? 43 : $custom_cpuUserGroup.hashCode());
        return result;
    }

    public String toString() {
        return "ProductIPassOrg(orgCode=" + this.getOrgCode() + ", orgId=" + this.getOrgId() + ", custom_firstMaterial=" + this.getCustom_firstMaterial() + ", custom_cpuUserGroup=" + this.getCustom_cpuUserGroup() + ")";
    }
}

