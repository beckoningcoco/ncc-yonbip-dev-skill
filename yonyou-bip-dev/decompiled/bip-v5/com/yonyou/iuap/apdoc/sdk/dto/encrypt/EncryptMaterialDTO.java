/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.dto.encrypt;

public class EncryptMaterialDTO {
    private String encryptName;
    private String remark;
    private Long materialId;

    public String getEncryptName() {
        return this.encryptName;
    }

    public String getRemark() {
        return this.remark;
    }

    public Long getMaterialId() {
        return this.materialId;
    }

    public void setEncryptName(String encryptName) {
        this.encryptName = encryptName;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EncryptMaterialDTO)) {
            return false;
        }
        EncryptMaterialDTO other = (EncryptMaterialDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Long this$materialId = this.getMaterialId();
        Long other$materialId = other.getMaterialId();
        if (this$materialId == null ? other$materialId != null : !((Object)this$materialId).equals(other$materialId)) {
            return false;
        }
        String this$encryptName = this.getEncryptName();
        String other$encryptName = other.getEncryptName();
        if (this$encryptName == null ? other$encryptName != null : !this$encryptName.equals(other$encryptName)) {
            return false;
        }
        String this$remark = this.getRemark();
        String other$remark = other.getRemark();
        return !(this$remark == null ? other$remark != null : !this$remark.equals(other$remark));
    }

    protected boolean canEqual(Object other) {
        return other instanceof EncryptMaterialDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Long $materialId = this.getMaterialId();
        result = result * 59 + ($materialId == null ? 43 : ((Object)$materialId).hashCode());
        String $encryptName = this.getEncryptName();
        result = result * 59 + ($encryptName == null ? 43 : $encryptName.hashCode());
        String $remark = this.getRemark();
        result = result * 59 + ($remark == null ? 43 : $remark.hashCode());
        return result;
    }

    public String toString() {
        return "EncryptMaterialDTO(encryptName=" + this.getEncryptName() + ", remark=" + this.getRemark() + ", materialId=" + this.getMaterialId() + ")";
    }
}

