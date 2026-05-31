/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.ipass.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantOpenApiSaveDTO;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantIPassUpdateRequest
extends MerchantOpenApiSaveDTO {
    private String sourceUnique;
    private String _status;
    private Long merchantId;
    private Long orgId;
    private List<String> orgIds;
    private String createOrgId;

    public String getSourceUnique() {
        return this.sourceUnique;
    }

    public String get_status() {
        return this._status;
    }

    public Long getMerchantId() {
        return this.merchantId;
    }

    public Long getOrgId() {
        return this.orgId;
    }

    public List<String> getOrgIds() {
        return this.orgIds;
    }

    @Override
    public String getCreateOrgId() {
        return this.createOrgId;
    }

    public void setSourceUnique(String sourceUnique) {
        this.sourceUnique = sourceUnique;
    }

    public void set_status(String _status) {
        this._status = _status;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public void setOrgIds(List<String> orgIds) {
        this.orgIds = orgIds;
    }

    @Override
    public void setCreateOrgId(String createOrgId) {
        this.createOrgId = createOrgId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantIPassUpdateRequest)) {
            return false;
        }
        MerchantIPassUpdateRequest other = (MerchantIPassUpdateRequest)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$merchantId = this.getMerchantId();
        Long other$merchantId = other.getMerchantId();
        if (this$merchantId == null ? other$merchantId != null : !((Object)this$merchantId).equals(other$merchantId)) {
            return false;
        }
        Long this$orgId = this.getOrgId();
        Long other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !((Object)this$orgId).equals(other$orgId)) {
            return false;
        }
        String this$sourceUnique = this.getSourceUnique();
        String other$sourceUnique = other.getSourceUnique();
        if (this$sourceUnique == null ? other$sourceUnique != null : !this$sourceUnique.equals(other$sourceUnique)) {
            return false;
        }
        String this$_status = this.get_status();
        String other$_status = other.get_status();
        if (this$_status == null ? other$_status != null : !this$_status.equals(other$_status)) {
            return false;
        }
        List<String> this$orgIds = this.getOrgIds();
        List<String> other$orgIds = other.getOrgIds();
        if (this$orgIds == null ? other$orgIds != null : !((Object)this$orgIds).equals(other$orgIds)) {
            return false;
        }
        String this$createOrgId = this.getCreateOrgId();
        String other$createOrgId = other.getCreateOrgId();
        return !(this$createOrgId == null ? other$createOrgId != null : !this$createOrgId.equals(other$createOrgId));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MerchantIPassUpdateRequest;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $merchantId = this.getMerchantId();
        result = result * 59 + ($merchantId == null ? 43 : ((Object)$merchantId).hashCode());
        Long $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : ((Object)$orgId).hashCode());
        String $sourceUnique = this.getSourceUnique();
        result = result * 59 + ($sourceUnique == null ? 43 : $sourceUnique.hashCode());
        String $_status = this.get_status();
        result = result * 59 + ($_status == null ? 43 : $_status.hashCode());
        List<String> $orgIds = this.getOrgIds();
        result = result * 59 + ($orgIds == null ? 43 : ((Object)$orgIds).hashCode());
        String $createOrgId = this.getCreateOrgId();
        result = result * 59 + ($createOrgId == null ? 43 : $createOrgId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MerchantIPassUpdateRequest(sourceUnique=" + this.getSourceUnique() + ", _status=" + this.get_status() + ", merchantId=" + this.getMerchantId() + ", orgId=" + this.getOrgId() + ", orgIds=" + this.getOrgIds() + ", createOrgId=" + this.getCreateOrgId() + ")";
    }
}

