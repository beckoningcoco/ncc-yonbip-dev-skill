/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.api.dto;

import java.util.List;

public class ApplyRangeOrgDTO {
    private List<Long> ids;
    private Long id;
    private String orgId;
    private List<String> orgIds;

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setOrgIds(List<String> orgIds) {
        this.orgIds = orgIds;
    }

    public List<Long> getIds() {
        return this.ids;
    }

    public Long getId() {
        return this.id;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public List<String> getOrgIds() {
        return this.orgIds;
    }

    public String toString() {
        return "ApplyRangeOrgDTO(ids=" + this.getIds() + ", id=" + this.getId() + ", orgId=" + this.getOrgId() + ", orgIds=" + this.getOrgIds() + ")";
    }
}

