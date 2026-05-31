/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.dto.material;

import com.yonyou.iuap.apdoc.sdk.dto.pub.QryFieldDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;

public class MaterialOptQryDTO
extends UPCPager {
    private String orgId;
    private QryFieldDTO materialCode;
    private QryFieldDTO materialName;
    private QryFieldDTO materialModelDesc;
    private QryFieldDTO materialModel;
    private QryFieldDTO materialMnemonicCode;
    private QryFieldDTO barCode;
    private QryFieldDTO materialShortName;
    private QryFieldDTO skuCode;
    private QryFieldDTO skuName;
    private QryFieldDTO skuShortName;
    private QryFieldDTO skuModelDesc;
    private QryFieldDTO skuModel;
    private QryFieldDTO skuMnemonicCode;
    private QryFieldDTO materialCharacter;
    private QryFieldDTO skuCharacter;

    public String getOrgId() {
        return this.orgId;
    }

    public QryFieldDTO getMaterialCode() {
        return this.materialCode;
    }

    public QryFieldDTO getMaterialName() {
        return this.materialName;
    }

    public QryFieldDTO getMaterialModelDesc() {
        return this.materialModelDesc;
    }

    public QryFieldDTO getMaterialModel() {
        return this.materialModel;
    }

    public QryFieldDTO getMaterialMnemonicCode() {
        return this.materialMnemonicCode;
    }

    public QryFieldDTO getBarCode() {
        return this.barCode;
    }

    public QryFieldDTO getMaterialShortName() {
        return this.materialShortName;
    }

    public QryFieldDTO getSkuCode() {
        return this.skuCode;
    }

    public QryFieldDTO getSkuName() {
        return this.skuName;
    }

    public QryFieldDTO getSkuShortName() {
        return this.skuShortName;
    }

    public QryFieldDTO getSkuModelDesc() {
        return this.skuModelDesc;
    }

    public QryFieldDTO getSkuModel() {
        return this.skuModel;
    }

    public QryFieldDTO getSkuMnemonicCode() {
        return this.skuMnemonicCode;
    }

    public QryFieldDTO getMaterialCharacter() {
        return this.materialCharacter;
    }

    public QryFieldDTO getSkuCharacter() {
        return this.skuCharacter;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public void setMaterialCode(QryFieldDTO materialCode) {
        this.materialCode = materialCode;
    }

    public void setMaterialName(QryFieldDTO materialName) {
        this.materialName = materialName;
    }

    public void setMaterialModelDesc(QryFieldDTO materialModelDesc) {
        this.materialModelDesc = materialModelDesc;
    }

    public void setMaterialModel(QryFieldDTO materialModel) {
        this.materialModel = materialModel;
    }

    public void setMaterialMnemonicCode(QryFieldDTO materialMnemonicCode) {
        this.materialMnemonicCode = materialMnemonicCode;
    }

    public void setBarCode(QryFieldDTO barCode) {
        this.barCode = barCode;
    }

    public void setMaterialShortName(QryFieldDTO materialShortName) {
        this.materialShortName = materialShortName;
    }

    public void setSkuCode(QryFieldDTO skuCode) {
        this.skuCode = skuCode;
    }

    public void setSkuName(QryFieldDTO skuName) {
        this.skuName = skuName;
    }

    public void setSkuShortName(QryFieldDTO skuShortName) {
        this.skuShortName = skuShortName;
    }

    public void setSkuModelDesc(QryFieldDTO skuModelDesc) {
        this.skuModelDesc = skuModelDesc;
    }

    public void setSkuModel(QryFieldDTO skuModel) {
        this.skuModel = skuModel;
    }

    public void setSkuMnemonicCode(QryFieldDTO skuMnemonicCode) {
        this.skuMnemonicCode = skuMnemonicCode;
    }

    public void setMaterialCharacter(QryFieldDTO materialCharacter) {
        this.materialCharacter = materialCharacter;
    }

    public void setSkuCharacter(QryFieldDTO skuCharacter) {
        this.skuCharacter = skuCharacter;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof MaterialOptQryDTO)) {
            return false;
        }
        MaterialOptQryDTO other = (MaterialOptQryDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$orgId = this.getOrgId();
        String other$orgId = other.getOrgId();
        if (this$orgId == null ? other$orgId != null : !this$orgId.equals(other$orgId)) {
            return false;
        }
        QryFieldDTO this$materialCode = this.getMaterialCode();
        QryFieldDTO other$materialCode = other.getMaterialCode();
        if (this$materialCode == null ? other$materialCode != null : !((Object)this$materialCode).equals(other$materialCode)) {
            return false;
        }
        QryFieldDTO this$materialName = this.getMaterialName();
        QryFieldDTO other$materialName = other.getMaterialName();
        if (this$materialName == null ? other$materialName != null : !((Object)this$materialName).equals(other$materialName)) {
            return false;
        }
        QryFieldDTO this$materialModelDesc = this.getMaterialModelDesc();
        QryFieldDTO other$materialModelDesc = other.getMaterialModelDesc();
        if (this$materialModelDesc == null ? other$materialModelDesc != null : !((Object)this$materialModelDesc).equals(other$materialModelDesc)) {
            return false;
        }
        QryFieldDTO this$materialModel = this.getMaterialModel();
        QryFieldDTO other$materialModel = other.getMaterialModel();
        if (this$materialModel == null ? other$materialModel != null : !((Object)this$materialModel).equals(other$materialModel)) {
            return false;
        }
        QryFieldDTO this$materialMnemonicCode = this.getMaterialMnemonicCode();
        QryFieldDTO other$materialMnemonicCode = other.getMaterialMnemonicCode();
        if (this$materialMnemonicCode == null ? other$materialMnemonicCode != null : !((Object)this$materialMnemonicCode).equals(other$materialMnemonicCode)) {
            return false;
        }
        QryFieldDTO this$barCode = this.getBarCode();
        QryFieldDTO other$barCode = other.getBarCode();
        if (this$barCode == null ? other$barCode != null : !((Object)this$barCode).equals(other$barCode)) {
            return false;
        }
        QryFieldDTO this$materialShortName = this.getMaterialShortName();
        QryFieldDTO other$materialShortName = other.getMaterialShortName();
        if (this$materialShortName == null ? other$materialShortName != null : !((Object)this$materialShortName).equals(other$materialShortName)) {
            return false;
        }
        QryFieldDTO this$skuCode = this.getSkuCode();
        QryFieldDTO other$skuCode = other.getSkuCode();
        if (this$skuCode == null ? other$skuCode != null : !((Object)this$skuCode).equals(other$skuCode)) {
            return false;
        }
        QryFieldDTO this$skuName = this.getSkuName();
        QryFieldDTO other$skuName = other.getSkuName();
        if (this$skuName == null ? other$skuName != null : !((Object)this$skuName).equals(other$skuName)) {
            return false;
        }
        QryFieldDTO this$skuShortName = this.getSkuShortName();
        QryFieldDTO other$skuShortName = other.getSkuShortName();
        if (this$skuShortName == null ? other$skuShortName != null : !((Object)this$skuShortName).equals(other$skuShortName)) {
            return false;
        }
        QryFieldDTO this$skuModelDesc = this.getSkuModelDesc();
        QryFieldDTO other$skuModelDesc = other.getSkuModelDesc();
        if (this$skuModelDesc == null ? other$skuModelDesc != null : !((Object)this$skuModelDesc).equals(other$skuModelDesc)) {
            return false;
        }
        QryFieldDTO this$skuModel = this.getSkuModel();
        QryFieldDTO other$skuModel = other.getSkuModel();
        if (this$skuModel == null ? other$skuModel != null : !((Object)this$skuModel).equals(other$skuModel)) {
            return false;
        }
        QryFieldDTO this$skuMnemonicCode = this.getSkuMnemonicCode();
        QryFieldDTO other$skuMnemonicCode = other.getSkuMnemonicCode();
        if (this$skuMnemonicCode == null ? other$skuMnemonicCode != null : !((Object)this$skuMnemonicCode).equals(other$skuMnemonicCode)) {
            return false;
        }
        QryFieldDTO this$materialCharacter = this.getMaterialCharacter();
        QryFieldDTO other$materialCharacter = other.getMaterialCharacter();
        if (this$materialCharacter == null ? other$materialCharacter != null : !((Object)this$materialCharacter).equals(other$materialCharacter)) {
            return false;
        }
        QryFieldDTO this$skuCharacter = this.getSkuCharacter();
        QryFieldDTO other$skuCharacter = other.getSkuCharacter();
        return !(this$skuCharacter == null ? other$skuCharacter != null : !((Object)this$skuCharacter).equals(other$skuCharacter));
    }

    @Override
    protected boolean canEqual(Object other) {
        return other instanceof MaterialOptQryDTO;
    }

    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $orgId = this.getOrgId();
        result = result * 59 + ($orgId == null ? 43 : $orgId.hashCode());
        QryFieldDTO $materialCode = this.getMaterialCode();
        result = result * 59 + ($materialCode == null ? 43 : ((Object)$materialCode).hashCode());
        QryFieldDTO $materialName = this.getMaterialName();
        result = result * 59 + ($materialName == null ? 43 : ((Object)$materialName).hashCode());
        QryFieldDTO $materialModelDesc = this.getMaterialModelDesc();
        result = result * 59 + ($materialModelDesc == null ? 43 : ((Object)$materialModelDesc).hashCode());
        QryFieldDTO $materialModel = this.getMaterialModel();
        result = result * 59 + ($materialModel == null ? 43 : ((Object)$materialModel).hashCode());
        QryFieldDTO $materialMnemonicCode = this.getMaterialMnemonicCode();
        result = result * 59 + ($materialMnemonicCode == null ? 43 : ((Object)$materialMnemonicCode).hashCode());
        QryFieldDTO $barCode = this.getBarCode();
        result = result * 59 + ($barCode == null ? 43 : ((Object)$barCode).hashCode());
        QryFieldDTO $materialShortName = this.getMaterialShortName();
        result = result * 59 + ($materialShortName == null ? 43 : ((Object)$materialShortName).hashCode());
        QryFieldDTO $skuCode = this.getSkuCode();
        result = result * 59 + ($skuCode == null ? 43 : ((Object)$skuCode).hashCode());
        QryFieldDTO $skuName = this.getSkuName();
        result = result * 59 + ($skuName == null ? 43 : ((Object)$skuName).hashCode());
        QryFieldDTO $skuShortName = this.getSkuShortName();
        result = result * 59 + ($skuShortName == null ? 43 : ((Object)$skuShortName).hashCode());
        QryFieldDTO $skuModelDesc = this.getSkuModelDesc();
        result = result * 59 + ($skuModelDesc == null ? 43 : ((Object)$skuModelDesc).hashCode());
        QryFieldDTO $skuModel = this.getSkuModel();
        result = result * 59 + ($skuModel == null ? 43 : ((Object)$skuModel).hashCode());
        QryFieldDTO $skuMnemonicCode = this.getSkuMnemonicCode();
        result = result * 59 + ($skuMnemonicCode == null ? 43 : ((Object)$skuMnemonicCode).hashCode());
        QryFieldDTO $materialCharacter = this.getMaterialCharacter();
        result = result * 59 + ($materialCharacter == null ? 43 : ((Object)$materialCharacter).hashCode());
        QryFieldDTO $skuCharacter = this.getSkuCharacter();
        result = result * 59 + ($skuCharacter == null ? 43 : ((Object)$skuCharacter).hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MaterialOptQryDTO(orgId=" + this.getOrgId() + ", materialCode=" + this.getMaterialCode() + ", materialName=" + this.getMaterialName() + ", materialModelDesc=" + this.getMaterialModelDesc() + ", materialModel=" + this.getMaterialModel() + ", materialMnemonicCode=" + this.getMaterialMnemonicCode() + ", barCode=" + this.getBarCode() + ", materialShortName=" + this.getMaterialShortName() + ", skuCode=" + this.getSkuCode() + ", skuName=" + this.getSkuName() + ", skuShortName=" + this.getSkuShortName() + ", skuModelDesc=" + this.getSkuModelDesc() + ", skuModel=" + this.getSkuModel() + ", skuMnemonicCode=" + this.getSkuMnemonicCode() + ", materialCharacter=" + this.getMaterialCharacter() + ", skuCharacter=" + this.getSkuCharacter() + ")";
    }
}

