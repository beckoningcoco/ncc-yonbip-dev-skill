/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyou.iuap.apdoc.sdk.dto.merchant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantPrincipalDataDTO;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantPrincipalChangeDataDTO
extends MerchantPrincipalDataDTO
implements Serializable {
    MerchantPrincipalDataDTO merchantPrincipalBeforeSaveDataDTO;

    public MerchantPrincipalDataDTO getMerchantPrincipalBeforeSaveDataDTO() {
        return this.merchantPrincipalBeforeSaveDataDTO;
    }

    public void setMerchantPrincipalBeforeSaveDataDTO(MerchantPrincipalDataDTO merchantPrincipalBeforeSaveDataDTO) {
        this.merchantPrincipalBeforeSaveDataDTO = merchantPrincipalBeforeSaveDataDTO;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantPrincipalChangeDataDTO)) {
            return false;
        }
        MerchantPrincipalChangeDataDTO other = (MerchantPrincipalChangeDataDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        MerchantPrincipalDataDTO this$merchantPrincipalBeforeSaveDataDTO = this.getMerchantPrincipalBeforeSaveDataDTO();
        MerchantPrincipalDataDTO other$merchantPrincipalBeforeSaveDataDTO = other.getMerchantPrincipalBeforeSaveDataDTO();
        return !(this$merchantPrincipalBeforeSaveDataDTO == null ? other$merchantPrincipalBeforeSaveDataDTO != null : !((Object)this$merchantPrincipalBeforeSaveDataDTO).equals(other$merchantPrincipalBeforeSaveDataDTO));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MerchantPrincipalChangeDataDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        MerchantPrincipalDataDTO $merchantPrincipalBeforeSaveDataDTO = this.getMerchantPrincipalBeforeSaveDataDTO();
        result = result * 59 + ($merchantPrincipalBeforeSaveDataDTO == null ? 43 : ((Object)$merchantPrincipalBeforeSaveDataDTO).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MerchantPrincipalChangeDataDTO(merchantPrincipalBeforeSaveDataDTO=" + this.getMerchantPrincipalBeforeSaveDataDTO() + ")";
    }
}

