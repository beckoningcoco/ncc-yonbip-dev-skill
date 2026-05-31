/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.derivatives;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ManagementClassMethodDTO {
    private List<Long> ids;
    private Long id;
    private String orgId;
    private List<String> orgIds;

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

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ManagementClassMethodDTO)) {
            return false;
        }
        ManagementClassMethodDTO other = (ManagementClassMethodDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        List<Long> this$ids = this.getIds();
        List<Long> other$ids = other.getIds();
        if (this$ids == null ? other$ids != null : !((Object)this$ids).equals(other$ids)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        List<String> this$orgIds = this.getOrgIds();
        List<String> other$orgIds = other.getOrgIds();
        return !(this$orgIds == null ? other$orgIds != null : !((Object)this$orgIds).equals(other$orgIds));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ManagementClassMethodDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        List<Long> $ids = this.getIds();
        result = result * 59 + ($ids == null ? 43 : ((Object)$ids).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        List<String> $orgIds = this.getOrgIds();
        result = result * 59 + ($orgIds == null ? 43 : ((Object)$orgIds).hashCode());
        return result;
    }

    public String toString() {
        return "ManagementClassMethodDTO(ids=" + this.getIds() + ", id=" + this.getId() + ", orgId=" + this.getOrgId() + ", orgIds=" + this.getOrgIds() + ")";
    }
}

