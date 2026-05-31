/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.bizdoc.service.model;

import java.util.List;

public class BaseQueryParam {
    protected Long id;
    protected List<Long> ids;
    protected String code;
    protected String codeLike;
    protected List<String> codes;
    protected String name;
    protected List<String> names;
    protected String nameLike;
    @Deprecated
    protected Long tenantId;
    protected String ytenantId;
    protected String valueLike;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getIds() {
        return this.ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeLike() {
        return this.codeLike;
    }

    public void setCodeLike(String codeLike) {
        this.codeLike = codeLike;
    }

    public List<String> getCodes() {
        return this.codes;
    }

    public void setCodes(List<String> codes) {
        this.codes = codes;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNames() {
        return this.names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public String getNameLike() {
        return this.nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    @Deprecated
    public Long getTenantId() {
        return this.tenantId;
    }

    @Deprecated
    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public String getValueLike() {
        return this.valueLike;
    }

    public void setValueLike(String valueLike) {
        this.valueLike = valueLike;
    }

    public String getYtenantId() {
        return this.ytenantId;
    }

    public void setYtenantId(String ytenantId) {
        this.ytenantId = ytenantId;
    }
}

