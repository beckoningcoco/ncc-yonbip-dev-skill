/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.derivatives;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ApplyRangeGroupDTO
implements Serializable {
    private String orgId;
    private String orgCode;
    private String orgName;

    public String getOrgId() {
        return this.orgId;
    }

    public String getOrgCode() {
        return this.orgCode;
    }

    public String getOrgName() {
        return this.orgName;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ApplyRangeGroupDTO)) {
            return false;
        }
        ApplyRangeGroupDTO other = (ApplyRangeGroupDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$orgCode = this.getOrgCode();
        String other$orgCode = other.getOrgCode();
        if (this$orgCode == null ? other$orgCode != null : !this$orgCode.equals(other$orgCode)) {
            return false;
        }
        String this$orgName = this.getOrgName();
        String other$orgName = other.getOrgName();
        return !(this$orgName == null ? other$orgName != null : !this$orgName.equals(other$orgName));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ApplyRangeGroupDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $orgCode = this.getOrgCode();
        result = result * 59 + ($orgCode == null ? 43 : $orgCode.hashCode());
        String $orgName = this.getOrgName();
        result = result * 59 + ($orgName == null ? 43 : $orgName.hashCode());
        return result;
    }

    public String toString() {
        return "ApplyRangeGroupDTO(orgId=" + this.getOrgId() + ", orgCode=" + this.getOrgCode() + ", orgName=" + this.getOrgName() + ")";
    }
}

