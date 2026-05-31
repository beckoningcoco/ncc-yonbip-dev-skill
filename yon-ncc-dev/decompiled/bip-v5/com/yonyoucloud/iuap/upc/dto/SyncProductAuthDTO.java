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
public class SyncProductAuthDTO
implements Serializable {
    private String msg;

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof SyncProductAuthDTO)) {
            return false;
        }
        SyncProductAuthDTO other = (SyncProductAuthDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$msg = this.getMsg();
        String other$msg = other.getMsg();
        return !(this$msg == null ? other$msg != null : !this$msg.equals(other$msg));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SyncProductAuthDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $msg = this.getMsg();
        result = result * 59 + ($msg == null ? 43 : $msg.hashCode());
        return result;
    }

    public String toString() {
        return "SyncProductAuthDTO(msg=" + this.getMsg() + ")";
    }
}

