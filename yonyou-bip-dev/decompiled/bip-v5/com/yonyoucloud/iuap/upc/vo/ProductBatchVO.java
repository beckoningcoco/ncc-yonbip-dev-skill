/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.List;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class ProductBatchVO {
    private Long id;
    private String orgId;
    private List<String> tagIds;

    public Long getId() {
        return this.id;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public List<String> getTagIds() {
        return this.tagIds;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ProductBatchVO)) {
            return false;
        }
        ProductBatchVO other = (ProductBatchVO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$id = this.getId();
        Long other$id = other.getId();
        if (this$id == null ? other$id != null : !((Object)this$id).equals(other$id)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        List<String> this$tagIds = this.getTagIds();
        List<String> other$tagIds = other.getTagIds();
        return !(this$tagIds == null ? other$tagIds != null : !((Object)this$tagIds).equals(other$tagIds));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ProductBatchVO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        List<String> $tagIds = this.getTagIds();
        result = result * 59 + ($tagIds == null ? 43 : ((Object)$tagIds).hashCode());
        return result;
    }

    public String toString() {
        return "ProductBatchVO(id=" + this.getId() + ", orgId=" + this.getOrgId() + ", tagIds=" + this.getTagIds() + ")";
    }
}

