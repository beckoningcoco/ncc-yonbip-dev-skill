/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.api;

public class FormulaScopeDTO {
    private Integer scope;
    private String field;

    public FormulaScopeDTO(Integer scope, String field) {
        this.scope = scope;
        this.field = field;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Integer getScope() {
        return this.scope;
    }

    public String getField() {
        return this.field;
    }
}

