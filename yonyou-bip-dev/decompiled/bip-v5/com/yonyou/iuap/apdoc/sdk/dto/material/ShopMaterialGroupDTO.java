/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.dto.material;

public class ShopMaterialGroupDTO {
    private Long materialClsId;
    private String orgId;
    private int count;

    public Long getMaterialClsId() {
        return this.materialClsId;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public int getCount() {
        return this.count;
    }

    public void setMaterialClsId(Long materialClsId) {
        this.materialClsId = materialClsId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof ShopMaterialGroupDTO)) {
            return false;
        }
        ShopMaterialGroupDTO other = (ShopMaterialGroupDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.getCount() != other.getCount()) {
            return false;
        }
        Long this$materialClsId = this.getMaterialClsId();
        Long other$materialClsId = other.getMaterialClsId();
        if (this$materialClsId == null ? other$materialClsId != null : !((Object)this$materialClsId).equals(other$materialClsId)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        return !(this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId));
    }

    protected boolean canEqual(Object other) {
        return other instanceof ShopMaterialGroupDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getCount();
        Long $materialClsId = this.getMaterialClsId();
        result = result * 59 + ($materialClsId == null ? 43 : ((Object)$materialClsId).hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        return result;
    }

    public String toString() {
        return "ShopMaterialGroupDTO(materialClsId=" + this.getMaterialClsId() + ", orgId=" + this.getOrgId() + ", count=" + this.getCount() + ")";
    }
}

