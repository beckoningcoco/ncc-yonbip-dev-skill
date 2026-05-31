/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.openapi;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class OpenAPIDTO<T> {
    T data;

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof OpenAPIDTO)) {
            return false;
        }
        OpenAPIDTO other = (OpenAPIDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        T this$data = this.getData();
        T other$data = other.getData();
        return !(this$data == null ? other$data != null : !this$data.equals(other$data));
    }

    protected boolean canEqual(Object other) {
        return other instanceof OpenAPIDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        T $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        return result;
    }

    public String toString() {
        return "OpenAPIDTO(data=" + this.getData() + ")";
    }
}

