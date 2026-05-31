/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.dto.material;

import com.yonyoucloud.iuap.upc.dto.ProductTplCharacterDTO;
import java.util.List;

public class MaterialCharacterStructureDTO {
    private Long matrialTplId;
    private List<Long> materialId;
    private List<ProductTplCharacterDTO> materialPropCharacter;
    private List<ProductTplCharacterDTO> skuPropCharacter;
    private List<ProductTplCharacterDTO> skuFreeCharacter;
    private List<ProductTplCharacterDTO> optionCharacter;

    public Long getMatrialTplId() {
        return this.matrialTplId;
    }

    public List<Long> getMaterialId() {
        return this.materialId;
    }

    public List<ProductTplCharacterDTO> getMaterialPropCharacter() {
        return this.materialPropCharacter;
    }

    public List<ProductTplCharacterDTO> getSkuPropCharacter() {
        return this.skuPropCharacter;
    }

    public List<ProductTplCharacterDTO> getSkuFreeCharacter() {
        return this.skuFreeCharacter;
    }

    public List<ProductTplCharacterDTO> getOptionCharacter() {
        return this.optionCharacter;
    }

    public void setMatrialTplId(Long matrialTplId) {
        this.matrialTplId = matrialTplId;
    }

    public void setMaterialId(List<Long> materialId) {
        this.materialId = materialId;
    }

    public void setMaterialPropCharacter(List<ProductTplCharacterDTO> materialPropCharacter) {
        this.materialPropCharacter = materialPropCharacter;
    }

    public void setSkuPropCharacter(List<ProductTplCharacterDTO> skuPropCharacter) {
        this.skuPropCharacter = skuPropCharacter;
    }

    public void setSkuFreeCharacter(List<ProductTplCharacterDTO> skuFreeCharacter) {
        this.skuFreeCharacter = skuFreeCharacter;
    }

    public void setOptionCharacter(List<ProductTplCharacterDTO> optionCharacter) {
        this.optionCharacter = optionCharacter;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialCharacterStructureDTO)) {
            return false;
        }
        MaterialCharacterStructureDTO other = (MaterialCharacterStructureDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$matrialTplId = this.getMatrialTplId();
        Long other$matrialTplId = other.getMatrialTplId();
        if (this$matrialTplId == null ? other$matrialTplId != null : !((Object)this$matrialTplId).equals(other$matrialTplId)) {
            return false;
        }
        List<Long> this$materialId = this.getMaterialId();
        List<Long> other$materialId = other.getMaterialId();
        if (this$materialId == null ? other$materialId != null : !((Object)this$materialId).equals(other$materialId)) {
            return false;
        }
        List<ProductTplCharacterDTO> this$materialPropCharacter = this.getMaterialPropCharacter();
        List<ProductTplCharacterDTO> other$materialPropCharacter = other.getMaterialPropCharacter();
        if (this$materialPropCharacter == null ? other$materialPropCharacter != null : !((Object)this$materialPropCharacter).equals(other$materialPropCharacter)) {
            return false;
        }
        List<ProductTplCharacterDTO> this$skuPropCharacter = this.getSkuPropCharacter();
        List<ProductTplCharacterDTO> other$skuPropCharacter = other.getSkuPropCharacter();
        if (this$skuPropCharacter == null ? other$skuPropCharacter != null : !((Object)this$skuPropCharacter).equals(other$skuPropCharacter)) {
            return false;
        }
        List<ProductTplCharacterDTO> this$skuFreeCharacter = this.getSkuFreeCharacter();
        List<ProductTplCharacterDTO> other$skuFreeCharacter = other.getSkuFreeCharacter();
        if (this$skuFreeCharacter == null ? other$skuFreeCharacter != null : !((Object)this$skuFreeCharacter).equals(other$skuFreeCharacter)) {
            return false;
        }
        List<ProductTplCharacterDTO> this$optionCharacter = this.getOptionCharacter();
        List<ProductTplCharacterDTO> other$optionCharacter = other.getOptionCharacter();
        return !(this$optionCharacter == null ? other$optionCharacter != null : !((Object)this$optionCharacter).equals(other$optionCharacter));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MaterialCharacterStructureDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $matrialTplId = this.getMatrialTplId();
        result = result * 59 + ($matrialTplId == null ? 43 : ((Object)$matrialTplId).hashCode());
        List<Long> $materialId = this.getMaterialId();
        result = result * 59 + ($materialId == null ? 43 : ((Object)$materialId).hashCode());
        List<ProductTplCharacterDTO> $materialPropCharacter = this.getMaterialPropCharacter();
        result = result * 59 + ($materialPropCharacter == null ? 43 : ((Object)$materialPropCharacter).hashCode());
        List<ProductTplCharacterDTO> $skuPropCharacter = this.getSkuPropCharacter();
        result = result * 59 + ($skuPropCharacter == null ? 43 : ((Object)$skuPropCharacter).hashCode());
        List<ProductTplCharacterDTO> $skuFreeCharacter = this.getSkuFreeCharacter();
        result = result * 59 + ($skuFreeCharacter == null ? 43 : ((Object)$skuFreeCharacter).hashCode());
        List<ProductTplCharacterDTO> $optionCharacter = this.getOptionCharacter();
        result = result * 59 + ($optionCharacter == null ? 43 : ((Object)$optionCharacter).hashCode());
        return result;
    }

    public String toString() {
        return "MaterialCharacterStructureDTO(matrialTplId=" + this.getMatrialTplId() + ", materialId=" + this.getMaterialId() + ", materialPropCharacter=" + this.getMaterialPropCharacter() + ", skuPropCharacter=" + this.getSkuPropCharacter() + ", skuFreeCharacter=" + this.getSkuFreeCharacter() + ", optionCharacter=" + this.getOptionCharacter() + ")";
    }
}

