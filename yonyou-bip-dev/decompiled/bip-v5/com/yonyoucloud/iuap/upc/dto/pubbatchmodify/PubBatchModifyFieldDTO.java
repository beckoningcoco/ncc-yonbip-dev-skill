/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonInclude
 *  com.fasterxml.jackson.annotation.JsonInclude$Include
 */
package com.yonyoucloud.iuap.upc.dto.pubbatchmodify;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;

@JsonInclude(value=JsonInclude.Include.NON_NULL)
public class PubBatchModifyFieldDTO
implements Serializable {
    private String id;
    private String batchModifyEntityId;
    private String batchModifyEntityFullName;
    private String fieldName;
    private String cItemName;
    private String fieldCaption;
    private String fieldCaptionResId;
    private String cName;
    private String isCheck;
    private String isMultiple;
    private String isMultipleSave;
    private boolean multiple = false;
    private String controlType;
    private String enumType;
    private String enumValue;
    private String refType;
    private String refRetId;
    private String refReturn;

    public String getId() {
        return this.id;
    }

    public String getBatchModifyEntityId() {
        return this.batchModifyEntityId;
    }

    public String getBatchModifyEntityFullName() {
        return this.batchModifyEntityFullName;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public String getCItemName() {
        return this.cItemName;
    }

    public String getFieldCaption() {
        return this.fieldCaption;
    }

    public String getFieldCaptionResId() {
        return this.fieldCaptionResId;
    }

    public String getCName() {
        return this.cName;
    }

    public String getIsCheck() {
        return this.isCheck;
    }

    public String getIsMultiple() {
        return this.isMultiple;
    }

    public String getIsMultipleSave() {
        return this.isMultipleSave;
    }

    public boolean isMultiple() {
        return this.multiple;
    }

    public String getControlType() {
        return this.controlType;
    }

    public String getEnumType() {
        return this.enumType;
    }

    public String getEnumValue() {
        return this.enumValue;
    }

    public String getRefType() {
        return this.refType;
    }

    public String getRefRetId() {
        return this.refRetId;
    }

    public String getRefReturn() {
        return this.refReturn;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBatchModifyEntityId(String batchModifyEntityId) {
        this.batchModifyEntityId = batchModifyEntityId;
    }

    public void setBatchModifyEntityFullName(String batchModifyEntityFullName) {
        this.batchModifyEntityFullName = batchModifyEntityFullName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setCItemName(String cItemName) {
        this.cItemName = cItemName;
    }

    public void setFieldCaption(String fieldCaption) {
        this.fieldCaption = fieldCaption;
    }

    public void setFieldCaptionResId(String fieldCaptionResId) {
        this.fieldCaptionResId = fieldCaptionResId;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck;
    }

    public void setIsMultiple(String isMultiple) {
        this.isMultiple = isMultiple;
    }

    public void setIsMultipleSave(String isMultipleSave) {
        this.isMultipleSave = isMultipleSave;
    }

    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
    }

    public void setControlType(String controlType) {
        this.controlType = controlType;
    }

    public void setEnumType(String enumType) {
        this.enumType = enumType;
    }

    public void setEnumValue(String enumValue) {
        this.enumValue = enumValue;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public void setRefRetId(String refRetId) {
        this.refRetId = refRetId;
    }

    public void setRefReturn(String refReturn) {
        this.refReturn = refReturn;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PubBatchModifyFieldDTO)) {
            return false;
        }
        PubBatchModifyFieldDTO other = (PubBatchModifyFieldDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isMultiple() != other.isMultiple()) {
            return false;
        }
        String this$id = this.getId();
        String other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) {
            return false;
        }
        String this$batchModifyEntityId = this.getBatchModifyEntityId();
        String other$batchModifyEntityId = other.getBatchModifyEntityId();
        if (this$batchModifyEntityId == null ? other$batchModifyEntityId != null : !this$batchModifyEntityId.equals(other$batchModifyEntityId)) {
            return false;
        }
        String this$batchModifyEntityFullName = this.getBatchModifyEntityFullName();
        String other$batchModifyEntityFullName = other.getBatchModifyEntityFullName();
        if (this$batchModifyEntityFullName == null ? other$batchModifyEntityFullName != null : !this$batchModifyEntityFullName.equals(other$batchModifyEntityFullName)) {
            return false;
        }
        String this$fieldName = this.getFieldName();
        String other$fieldName = other.getFieldName();
        if (this$fieldName == null ? other$fieldName != null : !this$fieldName.equals(other$fieldName)) {
            return false;
        }
        String this$cItemName = this.getCItemName();
        String other$cItemName = other.getCItemName();
        if (this$cItemName == null ? other$cItemName != null : !this$cItemName.equals(other$cItemName)) {
            return false;
        }
        String this$fieldCaption = this.getFieldCaption();
        String other$fieldCaption = other.getFieldCaption();
        if (this$fieldCaption == null ? other$fieldCaption != null : !this$fieldCaption.equals(other$fieldCaption)) {
            return false;
        }
        String this$fieldCaptionResId = this.getFieldCaptionResId();
        String other$fieldCaptionResId = other.getFieldCaptionResId();
        if (this$fieldCaptionResId == null ? other$fieldCaptionResId != null : !this$fieldCaptionResId.equals(other$fieldCaptionResId)) {
            return false;
        }
        String this$cName = this.getCName();
        String other$cName = other.getCName();
        if (this$cName == null ? other$cName != null : !this$cName.equals(other$cName)) {
            return false;
        }
        String this$isCheck = this.getIsCheck();
        String other$isCheck = other.getIsCheck();
        if (this$isCheck == null ? other$isCheck != null : !this$isCheck.equals(other$isCheck)) {
            return false;
        }
        String this$isMultiple = this.getIsMultiple();
        String other$isMultiple = other.getIsMultiple();
        if (this$isMultiple == null ? other$isMultiple != null : !this$isMultiple.equals(other$isMultiple)) {
            return false;
        }
        String this$isMultipleSave = this.getIsMultipleSave();
        String other$isMultipleSave = other.getIsMultipleSave();
        if (this$isMultipleSave == null ? other$isMultipleSave != null : !this$isMultipleSave.equals(other$isMultipleSave)) {
            return false;
        }
        String this$controlType = this.getControlType();
        String other$controlType = other.getControlType();
        if (this$controlType == null ? other$controlType != null : !this$controlType.equals(other$controlType)) {
            return false;
        }
        String this$enumType = this.getEnumType();
        String other$enumType = other.getEnumType();
        if (this$enumType == null ? other$enumType != null : !this$enumType.equals(other$enumType)) {
            return false;
        }
        String this$enumValue = this.getEnumValue();
        String other$enumValue = other.getEnumValue();
        if (this$enumValue == null ? other$enumValue != null : !this$enumValue.equals(other$enumValue)) {
            return false;
        }
        String this$refType = this.getRefType();
        String other$refType = other.getRefType();
        if (this$refType == null ? other$refType != null : !this$refType.equals(other$refType)) {
            return false;
        }
        String this$refRetId = this.getRefRetId();
        String other$refRetId = other.getRefRetId();
        if (this$refRetId == null ? other$refRetId != null : !this$refRetId.equals(other$refRetId)) {
            return false;
        }
        String this$refReturn = this.getRefReturn();
        String other$refReturn = other.getRefReturn();
        return !(this$refReturn == null ? other$refReturn != null : !this$refReturn.equals(other$refReturn));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PubBatchModifyFieldDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isMultiple() ? 79 : 97);
        String $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        String $batchModifyEntityId = this.getBatchModifyEntityId();
        result = result * 59 + ($batchModifyEntityId == null ? 43 : $batchModifyEntityId.hashCode());
        String $batchModifyEntityFullName = this.getBatchModifyEntityFullName();
        result = result * 59 + ($batchModifyEntityFullName == null ? 43 : $batchModifyEntityFullName.hashCode());
        String $fieldName = this.getFieldName();
        result = result * 59 + ($fieldName == null ? 43 : $fieldName.hashCode());
        String $cItemName = this.getCItemName();
        result = result * 59 + ($cItemName == null ? 43 : $cItemName.hashCode());
        String $fieldCaption = this.getFieldCaption();
        result = result * 59 + ($fieldCaption == null ? 43 : $fieldCaption.hashCode());
        String $fieldCaptionResId = this.getFieldCaptionResId();
        result = result * 59 + ($fieldCaptionResId == null ? 43 : $fieldCaptionResId.hashCode());
        String $cName = this.getCName();
        result = result * 59 + ($cName == null ? 43 : $cName.hashCode());
        String $isCheck = this.getIsCheck();
        result = result * 59 + ($isCheck == null ? 43 : $isCheck.hashCode());
        String $isMultiple = this.getIsMultiple();
        result = result * 59 + ($isMultiple == null ? 43 : $isMultiple.hashCode());
        String $isMultipleSave = this.getIsMultipleSave();
        result = result * 59 + ($isMultipleSave == null ? 43 : $isMultipleSave.hashCode());
        String $controlType = this.getControlType();
        result = result * 59 + ($controlType == null ? 43 : $controlType.hashCode());
        String $enumType = this.getEnumType();
        result = result * 59 + ($enumType == null ? 43 : $enumType.hashCode());
        String $enumValue = this.getEnumValue();
        result = result * 59 + ($enumValue == null ? 43 : $enumValue.hashCode());
        String $refType = this.getRefType();
        result = result * 59 + ($refType == null ? 43 : $refType.hashCode());
        String $refRetId = this.getRefRetId();
        result = result * 59 + ($refRetId == null ? 43 : $refRetId.hashCode());
        String $refReturn = this.getRefReturn();
        result = result * 59 + ($refReturn == null ? 43 : $refReturn.hashCode());
        return result;
    }

    public String toString() {
        return "PubBatchModifyFieldDTO(id=" + this.getId() + ", batchModifyEntityId=" + this.getBatchModifyEntityId() + ", batchModifyEntityFullName=" + this.getBatchModifyEntityFullName() + ", fieldName=" + this.getFieldName() + ", cItemName=" + this.getCItemName() + ", fieldCaption=" + this.getFieldCaption() + ", fieldCaptionResId=" + this.getFieldCaptionResId() + ", cName=" + this.getCName() + ", isCheck=" + this.getIsCheck() + ", isMultiple=" + this.getIsMultiple() + ", isMultipleSave=" + this.getIsMultipleSave() + ", multiple=" + this.isMultiple() + ", controlType=" + this.getControlType() + ", enumType=" + this.getEnumType() + ", enumValue=" + this.getEnumValue() + ", refType=" + this.getRefType() + ", refRetId=" + this.getRefRetId() + ", refReturn=" + this.getRefReturn() + ")";
    }
}

