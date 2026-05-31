/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.openapi.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantApplyRangeOpenApiSaveDTO
implements Serializable {
    public Long id;
    public String orgId;
    public String orgIdCode;
    private String entityStatus;

    public Long getId() {
        return this.id;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOrgIdCode() {
        return this.orgIdCode;
    }

    public String getEntityStatus() {
        return this.entityStatus;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgIdCode(String orgIdCode) {
        this.orgIdCode = orgIdCode;
    }

    public void setEntityStatus(String entityStatus) {
        this.entityStatus = entityStatus;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantApplyRangeOpenApiSaveDTO)) {
            return false;
        }
        MerchantApplyRangeOpenApiSaveDTO other = (MerchantApplyRangeOpenApiSaveDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        String this$orgIdCode = this.getOrgIdCode();
        String other$orgIdCode = other.getOrgIdCode();
        if (this$orgIdCode == null ? other$orgIdCode != null : !this$orgIdCode.equals(other$orgIdCode)) {
            return false;
        }
        String this$entityStatus = this.getEntityStatus();
        String other$entityStatus = other.getEntityStatus();
        return !(this$entityStatus == null ? other$entityStatus != null : !this$entityStatus.equals(other$entityStatus));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantApplyRangeOpenApiSaveDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        String $orgIdCode = this.getOrgIdCode();
        result = result * 59 + ($orgIdCode == null ? 43 : $orgIdCode.hashCode());
        String $entityStatus = this.getEntityStatus();
        result = result * 59 + ($entityStatus == null ? 43 : $entityStatus.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantApplyRangeOpenApiSaveDTO(id=" + this.getId() + ", orgId=" + this.getOrgId() + ", orgIdCode=" + this.getOrgIdCode() + ", entityStatus=" + this.getEntityStatus() + ")";
    }
}

