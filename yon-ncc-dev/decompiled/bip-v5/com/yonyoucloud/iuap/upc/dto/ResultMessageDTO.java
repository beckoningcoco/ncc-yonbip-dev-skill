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
public class ResultMessageDTO
implements Serializable {
    private Number code;
    private String message;
    private Object data;
    private Object errorDetail;

    public ResultMessageDTO() {
    }

    public ResultMessageDTO(Number code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Number getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Object getData() {
        return this.data;
    }

    public Object getErrorDetail() {
        return this.errorDetail;
    }

    public void setCode(Number code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void setErrorDetail(Object errorDetail) {
        this.errorDetail = errorDetail;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ResultMessageDTO)) {
            return false;
        }
        ResultMessageDTO other = (ResultMessageDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Number this$code = this.getCode();
        Number other$code = other.getCode();
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) {
            return false;
        }
        String this$message = this.getMessage();
        String other$message = other.getMessage();
        if (this$message == null ? other$message != null : !this$message.equals(other$message)) {
            return false;
        }
        Object this$data = this.getData();
        Object other$data = other.getData();
        if (this$data == null ? other$data != null : !this$data.equals(other$data)) {
            return false;
        }
        Object this$errorDetail = this.getErrorDetail();
        Object other$errorDetail = other.getErrorDetail();
        return !(this$errorDetail == null ? other$errorDetail != null : !this$errorDetail.equals(other$errorDetail));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ResultMessageDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Number $code = this.getCode();
        result = result * 59 + ($code == null ? 43 : $code.hashCode());
        String $message = this.getMessage();
        result = result * 59 + ($message == null ? 43 : $message.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        Object $errorDetail = this.getErrorDetail();
        result = result * 59 + ($errorDetail == null ? 43 : $errorDetail.hashCode());
        return result;
    }

    public String toString() {
        return "ResultMessageDTO(code=" + this.getCode() + ", message=" + this.getMessage() + ", data=" + this.getData() + ", errorDetail=" + this.getErrorDetail() + ")";
    }
}

