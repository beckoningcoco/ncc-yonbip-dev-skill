/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo.deleteforce;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class DeleteForceDataVo {
    private String code;
    private String errorinfo;

    public String getCode() {
        return this.code;
    }

    public String getErrorinfo() {
        return this.errorinfo;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setErrorinfo(String errorinfo) {
        this.errorinfo = errorinfo;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof DeleteForceDataVo)) {
            return false;
        }
        DeleteForceDataVo other = (DeleteForceDataVo)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$code = this.getCode();
        String other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$errorinfo = this.getErrorinfo();
        String other$errorinfo = other.getErrorinfo();
        return !(this$errorinfo == null ? other$errorinfo != null : !this$errorinfo.equals(other$errorinfo));
    }

    protected boolean canEqual(Object other) {
        return other instanceof DeleteForceDataVo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $errorinfo = this.getErrorinfo();
        result = result * 59 + ($errorinfo == null ? 43 : $errorinfo.hashCode());
        return result;
    }

    public String toString() {
        return "DeleteForceDataVo(code=" + this.getCode() + ", errorinfo=" + this.getErrorinfo() + ")";
    }
}

