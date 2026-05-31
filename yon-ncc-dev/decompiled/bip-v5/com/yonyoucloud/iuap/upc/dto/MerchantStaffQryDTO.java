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
import java.util.Arrays;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class MerchantStaffQryDTO
implements Serializable {
    private String[] fields;
    private String yhtUserId;

    public String[] getFields() {
        return this.fields;
    }

    public String getYhtUserId() {
        return this.yhtUserId;
    }

    public void setFields(String[] fields) {
        this.fields = fields;
    }

    public void setYhtUserId(String yhtUserId) {
        this.yhtUserId = yhtUserId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MerchantStaffQryDTO)) {
            return false;
        }
        MerchantStaffQryDTO other = (MerchantStaffQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (!Arrays.deepEquals(this.getFields(), other.getFields())) {
            return false;
        }
        String this$yhtUserId = this.getYhtUserId();
        String other$yhtUserId = other.getYhtUserId();
        return !(this$yhtUserId == null ? other$yhtUserId != null : !this$yhtUserId.equals(other$yhtUserId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MerchantStaffQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + Arrays.deepHashCode(this.getFields());
        String $yhtUserId = this.getYhtUserId();
        result = result * 59 + ($yhtUserId == null ? 43 : $yhtUserId.hashCode());
        return result;
    }

    public String toString() {
        return "MerchantStaffQryDTO(fields=" + Arrays.deepToString(this.getFields()) + ", yhtUserId=" + this.getYhtUserId() + ")";
    }
}

