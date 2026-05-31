/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.international.MultiLangText
 */
package com.yonyou.iuap.apdoc.sdk.dto.material;

import com.yonyou.iuap.apdoc.sdk.dto.material.MaterialCharacterQryDTO;
import com.yonyou.iuap.international.MultiLangText;

public class MaterialCharacterRpcDTO
extends MaterialCharacterQryDTO {
    private Long materialId;
    private String materialCode;
    private MultiLangText materialName;
    private Long skuId;
    private boolean isSku;
    private String skuCode;
    private MultiLangText skuName;
    private String orgId;

    public Long getMaterialId() {
        return this.materialId;
    }

    public String getMaterialCode() {
        return this.materialCode;
    }

    public MultiLangText getMaterialName() {
        return this.materialName;
    }

    public Long getSkuId() {
        return this.skuId;
    }

    public boolean isSku() {
        return this.isSku;
    }

    public String getSkuCode() {
        return this.skuCode;
    }

    public MultiLangText getSkuName() {
        return this.skuName;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public void setMaterialCode(String materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(MultiLangText materialName) {
        this.materialName = materialName;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }

    public void setSku(boolean isSku) {
        this.isSku = isSku;
    }

    public void setSkuCode(String skuCode) {
        this.skuCode = skuCode;
    }

    public void setSkuName(MultiLangText skuName) {
        this.skuName = skuName;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialCharacterRpcDTO)) {
            return false;
        }
        MaterialCharacterRpcDTO other = (MaterialCharacterRpcDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isSku() != other.isSku()) {
            return false;
        }
        Long this$materialId = this.getMaterialId();
        Long other$materialId = other.getMaterialId();
        if (this$materialId == null ? other$materialId != null : !((Object)this$materialId).equals(other$materialId)) {
            return false;
        }
        Long this$skuId = this.getSkuId();
        Long other$skuId = other.getSkuId();
        if (this$skuId == null ? other$skuId != null : !((Object)this$skuId).equals(other$skuId)) {
            return false;
        }
        String this$materialCode = this.getMaterialCode();
        String other$materialCode = other.getMaterialCode();
        if (this$materialCode == null ? other$materialCode != null : !this$materialCode.equals(other$materialCode)) {
            return false;
        }
        MultiLangText this$materialName = this.getMaterialName();
        MultiLangText other$materialName = other.getMaterialName();
        if (this$materialName == null ? other$materialName != null : !this$materialName.equals(other$materialName)) {
            return false;
        }
        String this$skuCode = this.getSkuCode();
        String other$skuCode = other.getSkuCode();
        if (this$skuCode == null ? other$skuCode != null : !this$skuCode.equals(other$skuCode)) {
            return false;
        }
        MultiLangText this$skuName = this.getSkuName();
        MultiLangText other$skuName = other.getSkuName();
        if (this$skuName == null ? other$skuName != null : !this$skuName.equals(other$skuName)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        return !(this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MaterialCharacterRpcDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isSku() ? 79 : 97);
        Long $materialId = this.getMaterialId();
        result = result * 59 + ($materialId == null ? 43 : ((Object)$materialId).hashCode());
        Long $skuId = this.getSkuId();
        result = result * 59 + ($skuId == null ? 43 : ((Object)$skuId).hashCode());
        String $materialCode = this.getMaterialCode();
        result = result * 59 + ($materialCode == null ? 43 : $materialCode.hashCode());
        MultiLangText $materialName = this.getMaterialName();
        result = result * 59 + ($materialName == null ? 43 : $materialName.hashCode());
        String $skuCode = this.getSkuCode();
        result = result * 59 + ($skuCode == null ? 43 : $skuCode.hashCode());
        MultiLangText $skuName = this.getSkuName();
        result = result * 59 + ($skuName == null ? 43 : $skuName.hashCode());
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MaterialCharacterRpcDTO(materialId=" + this.getMaterialId() + ", materialCode=" + this.getMaterialCode() + ", materialName=" + this.getMaterialName() + ", skuId=" + this.getSkuId() + ", isSku=" + this.isSku() + ", skuCode=" + this.getSkuCode() + ", skuName=" + this.getSkuName() + ", orgId=" + this.getOrgId() + ")";
    }
}

