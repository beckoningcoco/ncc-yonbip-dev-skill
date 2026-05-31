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
public class PubBatchModifyFieldSaveDTO
implements Serializable {
    private String fieldName;
    private String isCheck;
    private Object value;

    public String getFieldName() {
        return this.fieldName;
    }

    public String getIsCheck() {
        return this.isCheck;
    }

    public Object getValue() {
        return this.value;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setIsCheck(String isCheck) {
        this.isCheck = isCheck;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PubBatchModifyFieldSaveDTO)) {
            return false;
        }
        PubBatchModifyFieldSaveDTO other = (PubBatchModifyFieldSaveDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$fieldName = this.getFieldName();
        String other$fieldName = other.getFieldName();
        if (this$fieldName == null ? other$fieldName != null : !this$fieldName.equals(other$fieldName)) {
            return false;
        }
        String this$isCheck = this.getIsCheck();
        String other$isCheck = other.getIsCheck();
        if (this$isCheck == null ? other$isCheck != null : !this$isCheck.equals(other$isCheck)) {
            return false;
        }
        Object this$value = this.getValue();
        Object other$value = other.getValue();
        return !(this$value == null ? other$value != null : !this$value.equals(other$value));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PubBatchModifyFieldSaveDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $fieldName = this.getFieldName();
        result = result * 59 + ($fieldName == null ? 43 : $fieldName.hashCode());
        String $isCheck = this.getIsCheck();
        result = result * 59 + ($isCheck == null ? 43 : $isCheck.hashCode());
        Object $value = this.getValue();
        result = result * 59 + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    public String toString() {
        return "PubBatchModifyFieldSaveDTO(fieldName=" + this.getFieldName() + ", isCheck=" + this.getIsCheck() + ", value=" + this.getValue() + ")";
    }
}

