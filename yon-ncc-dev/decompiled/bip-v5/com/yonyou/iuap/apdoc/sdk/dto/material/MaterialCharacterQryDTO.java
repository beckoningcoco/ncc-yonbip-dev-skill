/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.dto.material;

import java.util.HashMap;

public class MaterialCharacterQryDTO {
    private HashMap<String, Object> materialCharacter;
    private HashMap<String, Object> materialDetailCharacter;
    private HashMap<String, Object> materialPropCharacter;
    private HashMap<String, Object> skuCharacter;
    private HashMap<String, Object> skuFreeCharacter;
    private HashMap<String, Object> skuPropCharacter;

    public HashMap<String, Object> getMaterialCharacter() {
        return this.materialCharacter;
    }

    public HashMap<String, Object> getMaterialDetailCharacter() {
        return this.materialDetailCharacter;
    }

    public HashMap<String, Object> getMaterialPropCharacter() {
        return this.materialPropCharacter;
    }

    public HashMap<String, Object> getSkuCharacter() {
        return this.skuCharacter;
    }

    public HashMap<String, Object> getSkuFreeCharacter() {
        return this.skuFreeCharacter;
    }

    public HashMap<String, Object> getSkuPropCharacter() {
        return this.skuPropCharacter;
    }

    public void setMaterialCharacter(HashMap<String, Object> materialCharacter) {
        this.materialCharacter = materialCharacter;
    }

    public void setMaterialDetailCharacter(HashMap<String, Object> materialDetailCharacter) {
        this.materialDetailCharacter = materialDetailCharacter;
    }

    public void setMaterialPropCharacter(HashMap<String, Object> materialPropCharacter) {
        this.materialPropCharacter = materialPropCharacter;
    }

    public void setSkuCharacter(HashMap<String, Object> skuCharacter) {
        this.skuCharacter = skuCharacter;
    }

    public void setSkuFreeCharacter(HashMap<String, Object> skuFreeCharacter) {
        this.skuFreeCharacter = skuFreeCharacter;
    }

    public void setSkuPropCharacter(HashMap<String, Object> skuPropCharacter) {
        this.skuPropCharacter = skuPropCharacter;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialCharacterQryDTO)) {
            return false;
        }
        MaterialCharacterQryDTO other = (MaterialCharacterQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        HashMap<String, Object> this$materialCharacter = this.getMaterialCharacter();
        HashMap<String, Object> other$materialCharacter = other.getMaterialCharacter();
        if (this$materialCharacter == null ? other$materialCharacter != null : !((Object)this$materialCharacter).equals(other$materialCharacter)) {
            return false;
        }
        HashMap<String, Object> this$materialDetailCharacter = this.getMaterialDetailCharacter();
        HashMap<String, Object> other$materialDetailCharacter = other.getMaterialDetailCharacter();
        if (this$materialDetailCharacter == null ? other$materialDetailCharacter != null : !((Object)this$materialDetailCharacter).equals(other$materialDetailCharacter)) {
            return false;
        }
        HashMap<String, Object> this$materialPropCharacter = this.getMaterialPropCharacter();
        HashMap<String, Object> other$materialPropCharacter = other.getMaterialPropCharacter();
        if (this$materialPropCharacter == null ? other$materialPropCharacter != null : !((Object)this$materialPropCharacter).equals(other$materialPropCharacter)) {
            return false;
        }
        HashMap<String, Object> this$skuCharacter = this.getSkuCharacter();
        HashMap<String, Object> other$skuCharacter = other.getSkuCharacter();
        if (this$skuCharacter == null ? other$skuCharacter != null : !((Object)this$skuCharacter).equals(other$skuCharacter)) {
            return false;
        }
        HashMap<String, Object> this$skuFreeCharacter = this.getSkuFreeCharacter();
        HashMap<String, Object> other$skuFreeCharacter = other.getSkuFreeCharacter();
        if (this$skuFreeCharacter == null ? other$skuFreeCharacter != null : !((Object)this$skuFreeCharacter).equals(other$skuFreeCharacter)) {
            return false;
        }
        HashMap<String, Object> this$skuPropCharacter = this.getSkuPropCharacter();
        HashMap<String, Object> other$skuPropCharacter = other.getSkuPropCharacter();
        return !(this$skuPropCharacter == null ? other$skuPropCharacter != null : !((Object)this$skuPropCharacter).equals(other$skuPropCharacter));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MaterialCharacterQryDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        HashMap<String, Object> $materialCharacter = this.getMaterialCharacter();
        result = result * 59 + ($materialCharacter == null ? 43 : ((Object)$materialCharacter).hashCode());
        HashMap<String, Object> $materialDetailCharacter = this.getMaterialDetailCharacter();
        result = result * 59 + ($materialDetailCharacter == null ? 43 : ((Object)$materialDetailCharacter).hashCode());
        HashMap<String, Object> $materialPropCharacter = this.getMaterialPropCharacter();
        result = result * 59 + ($materialPropCharacter == null ? 43 : ((Object)$materialPropCharacter).hashCode());
        HashMap<String, Object> $skuCharacter = this.getSkuCharacter();
        result = result * 59 + ($skuCharacter == null ? 43 : ((Object)$skuCharacter).hashCode());
        HashMap<String, Object> $skuFreeCharacter = this.getSkuFreeCharacter();
        result = result * 59 + ($skuFreeCharacter == null ? 43 : ((Object)$skuFreeCharacter).hashCode());
        HashMap<String, Object> $skuPropCharacter = this.getSkuPropCharacter();
        result = result * 59 + ($skuPropCharacter == null ? 43 : ((Object)$skuPropCharacter).hashCode());
        return result;
    }

    public String toString() {
        return "MaterialCharacterQryDTO(materialCharacter=" + this.getMaterialCharacter() + ", materialDetailCharacter=" + this.getMaterialDetailCharacter() + ", materialPropCharacter=" + this.getMaterialPropCharacter() + ", skuCharacter=" + this.getSkuCharacter() + ", skuFreeCharacter=" + this.getSkuFreeCharacter() + ", skuPropCharacter=" + this.getSkuPropCharacter() + ")";
    }
}

