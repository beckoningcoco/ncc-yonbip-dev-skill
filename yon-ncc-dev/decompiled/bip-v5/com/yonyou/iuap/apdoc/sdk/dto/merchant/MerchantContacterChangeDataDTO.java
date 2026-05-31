/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyou.iuap.apdoc.sdk.dto.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantContacterDataDTO;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantContacterChangeDataDTO
extends MerchantContacterDataDTO
implements Serializable {
    MerchantContacterDataDTO merchantContacterBeforeSaveDataDTO;
    String createOrgId;

    public MerchantContacterDataDTO getMerchantContacterBeforeSaveDataDTO() {
        return this.merchantContacterBeforeSaveDataDTO;
    }

    public String getCreateOrgId() {
        return this.createOrgId;
    }

    public void setMerchantContacterBeforeSaveDataDTO(MerchantContacterDataDTO merchantContacterBeforeSaveDataDTO) {
        this.merchantContacterBeforeSaveDataDTO = merchantContacterBeforeSaveDataDTO;
    }

    public void setCreateOrgId(String createOrgId) {
        this.createOrgId = createOrgId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantContacterChangeDataDTO)) {
            return false;
        }
        MerchantContacterChangeDataDTO other = (MerchantContacterChangeDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        MerchantContacterDataDTO this$merchantContacterBeforeSaveDataDTO = this.getMerchantContacterBeforeSaveDataDTO();
        MerchantContacterDataDTO other$merchantContacterBeforeSaveDataDTO = other.getMerchantContacterBeforeSaveDataDTO();
        if (this$merchantContacterBeforeSaveDataDTO == null ? other$merchantContacterBeforeSaveDataDTO != null : !((Object)this$merchantContacterBeforeSaveDataDTO).equals(other$merchantContacterBeforeSaveDataDTO)) {
            return false;
        }
        String this$createOrgId = this.getCreateOrgId();
        String other$createOrgId = other.getCreateOrgId();
        return !(this$createOrgId == null ? other$createOrgId != null : !this$createOrgId.equals(other$createOrgId));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MerchantContacterChangeDataDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        MerchantContacterDataDTO $merchantContacterBeforeSaveDataDTO = this.getMerchantContacterBeforeSaveDataDTO();
        result = result * 59 + ($merchantContacterBeforeSaveDataDTO == null ? 43 : ((Object)$merchantContacterBeforeSaveDataDTO).hashCode());
        String $createOrgId = this.getCreateOrgId();
        result = result * 59 + ($createOrgId == null ? 43 : $createOrgId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MerchantContacterChangeDataDTO(merchantContacterBeforeSaveDataDTO=" + this.getMerchantContacterBeforeSaveDataDTO() + ", createOrgId=" + this.getCreateOrgId() + ")";
    }
}

