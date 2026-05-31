/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.upc.utils;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class TransferDetailErrorShopMerchant {
    private Long id;
    private String errorCause;

    public Long getId() {
        return this.id;
    }

    public String getErrorCause() {
        return this.errorCause;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setErrorCause(String errorCause) {
        this.errorCause = errorCause;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof TransferDetailErrorShopMerchant)) {
            return false;
        }
        TransferDetailErrorShopMerchant other = (TransferDetailErrorShopMerchant)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        String this$errorCause = this.getErrorCause();
        String other$errorCause = other.getErrorCause();
        return !(this$errorCause == null ? other$errorCause != null : !this$errorCause.equals(other$errorCause));
    }

    protected boolean canEqual(Object other) {
        return other instanceof TransferDetailErrorShopMerchant;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $errorCause = this.getErrorCause();
        result = result * 59 + ($errorCause == null ? 43 : $errorCause.hashCode());
        return result;
    }

    public String toString() {
        return "TransferDetailErrorShopMerchant(id=" + this.getId() + ", errorCause=" + this.getErrorCause() + ")";
    }
}

