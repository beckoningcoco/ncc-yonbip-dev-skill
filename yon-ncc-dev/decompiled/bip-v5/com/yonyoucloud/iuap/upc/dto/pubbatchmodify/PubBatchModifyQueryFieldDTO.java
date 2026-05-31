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
public class PubBatchModifyQueryFieldDTO
implements Serializable {
    private String fieldName;
    private String conditionOperator;
    private Object value;
    private boolean multiple = false;

    public String getFieldName() {
        return this.fieldName;
    }

    public String getConditionOperator() {
        return this.conditionOperator;
    }

    public Object getValue() {
        return this.value;
    }

    public boolean isMultiple() {
        return this.multiple;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setConditionOperator(String conditionOperator) {
        this.conditionOperator = conditionOperator;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setMultiple(boolean multiple) {
        this.multiple = multiple;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof PubBatchModifyQueryFieldDTO)) {
            return false;
        }
        PubBatchModifyQueryFieldDTO other = (PubBatchModifyQueryFieldDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        if (this.isMultiple() != other.isMultiple()) {
            return false;
        }
        String this$fieldName = this.getFieldName();
        String other$fieldName = other.getFieldName();
        if (this$fieldName == null ? other$fieldName != null : !this$fieldName.equals(other$fieldName)) {
            return false;
        }
        String this$conditionOperator = this.getConditionOperator();
        String other$conditionOperator = other.getConditionOperator();
        if (this$conditionOperator == null ? other$conditionOperator != null : !this$conditionOperator.equals(other$conditionOperator)) {
            return false;
        }
        Object this$value = this.getValue();
        Object other$value = other.getValue();
        return !(this$value == null ? other$value != null : !this$value.equals(other$value));
    }

    protected boolean canEqual(Object other) {
        return other instanceof PubBatchModifyQueryFieldDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + (this.isMultiple() ? 79 : 97);
        String $fieldName = this.getFieldName();
        result = result * 59 + ($fieldName == null ? 43 : $fieldName.hashCode());
        String $conditionOperator = this.getConditionOperator();
        result = result * 59 + ($conditionOperator == null ? 43 : $conditionOperator.hashCode());
        Object $value = this.getValue();
        result = result * 59 + ($value == null ? 43 : $value.hashCode());
        return result;
    }

    public String toString() {
        return "PubBatchModifyQueryFieldDTO(fieldName=" + this.getFieldName() + ", conditionOperator=" + this.getConditionOperator() + ", value=" + this.getValue() + ", multiple=" + this.isMultiple() + ")";
    }
}

