/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.api.dto;

public class UserDefValueDto {
    private Long id;
    private Long userDefId;
    private String name;
    private String code;
    private String ytenant;

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserDefId(Long userDefId) {
        this.userDefId = userDefId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setYtenant(String ytenant) {
        this.ytenant = ytenant;
    }

    public Long getId() {
        return this.id;
    }

    public Long getUserDefId() {
        return this.userDefId;
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public String getYtenant() {
        return this.ytenant;
    }
}

