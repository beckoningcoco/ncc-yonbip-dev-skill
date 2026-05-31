/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.businesspartnerdto;

public class BusinessPartnerRoleClassDTO {
    private String id;
    private String partnerId;
    private Boolean check;
    private Integer roleClassName;

    public void setId(String id) {
        this.id = id;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }

    public void setRoleClassName(Integer roleClassName) {
        this.roleClassName = roleClassName;
    }

    public String getId() {
        return this.id;
    }

    public String getPartnerId() {
        return this.partnerId;
    }

    public Boolean getCheck() {
        return this.check;
    }

    public Integer getRoleClassName() {
        return this.roleClassName;
    }
}

