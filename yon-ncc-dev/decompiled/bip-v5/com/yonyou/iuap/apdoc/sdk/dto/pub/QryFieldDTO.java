/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.dto.pub;

import com.yonyou.iuap.apdoc.sdk.constant.QryOperatorEnum;
import java.util.List;

public class QryFieldDTO {
    private String fieldName;
    private QryOperatorEnum operator;
    private List<QryOperatorEnum> operators;
    private Object value;
    private List<Object> values;

    public String getFieldName() {
        return this.fieldName;
    }

    public QryOperatorEnum getOperator() {
        return this.operator;
    }

    public List<QryOperatorEnum> getOperators() {
        return this.operators;
    }

    public Object getValue() {
        return this.value;
    }

    public List<Object> getValues() {
        return this.values;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setOperator(QryOperatorEnum operator) {
        this.operator = operator;
    }

    public void setOperators(List<QryOperatorEnum> operators) {
        this.operators = operators;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public void setValues(List<Object> values) {
        this.values = values;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof QryFieldDTO)) {
            return false;
        }
        QryFieldDTO other = (QryFieldDTO)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$fieldName = this.getFieldName();
        String other$fieldName = other.getFieldName();
        if (this$fieldName == null ? other$fieldName != null : !this$fieldName.equals(other$fieldName)) {
            return false;
        }
        QryOperatorEnum this$operator = this.getOperator();
        QryOperatorEnum other$operator = other.getOperator();
        if (this$operator == null ? other$operator != null : !((Object)((Object)this$operator)).equals((Object)other$operator)) {
            return false;
        }
        List<QryOperatorEnum> this$operators = this.getOperators();
        List<QryOperatorEnum> other$operators = other.getOperators();
        if (this$operators == null ? other$operators != null : !((Object)this$operators).equals(other$operators)) {
            return false;
        }
        Object this$value = this.getValue();
        Object other$value = other.getValue();
        if (this$value == null ? other$value != null : !this$value.equals(other$value)) {
            return false;
        }
        List<Object> this$values = this.getValues();
        List<Object> other$values = other.getValues();
        return !(this$values == null ? other$values != null : !((Object)this$values).equals(other$values));
    }

    protected boolean canEqual(Object other) {
        return other instanceof QryFieldDTO;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $fieldName = this.getFieldName();
        result = result * 59 + ($fieldName == null ? 43 : $fieldName.hashCode());
        QryOperatorEnum $operator = this.getOperator();
        result = result * 59 + ($operator == null ? 43 : ((Object)((Object)$operator)).hashCode());
        List<QryOperatorEnum> $operators = this.getOperators();
        result = result * 59 + ($operators == null ? 43 : ((Object)$operators).hashCode());
        Object $value = this.getValue();
        result = result * 59 + ($value == null ? 43 : $value.hashCode());
        List<Object> $values = this.getValues();
        result = result * 59 + ($values == null ? 43 : ((Object)$values).hashCode());
        return result;
    }

    public String toString() {
        return "QryFieldDTO(fieldName=" + this.getFieldName() + ", operator=" + (Object)((Object)this.getOperator()) + ", operators=" + this.getOperators() + ", value=" + this.getValue() + ", values=" + this.getValues() + ")";
    }
}

