/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.freedomconditonbyes.freedomquery;

import com.yonyoucloud.iuap.upc.util.OperatorEnum;
import java.util.List;

public class FreedomQueryConditionDetail<T> {
    OperatorEnum operatorEnum;
    private String conditionFieldName;
    private T value;
    private List<T> valueList;
    private Boolean merchantCharacterFlag = false;

    public void setOperatorEnum(OperatorEnum operatorEnum) {
        this.operatorEnum = operatorEnum;
    }

    public void setConditionFieldName(String conditionFieldName) {
        this.conditionFieldName = conditionFieldName;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void setValueList(List<T> valueList) {
        this.valueList = valueList;
    }

    public void setMerchantCharacterFlag(Boolean merchantCharacterFlag) {
        this.merchantCharacterFlag = merchantCharacterFlag;
    }

    public OperatorEnum getOperatorEnum() {
        return this.operatorEnum;
    }

    public String getConditionFieldName() {
        return this.conditionFieldName;
    }

    public T getValue() {
        return this.value;
    }

    public List<T> getValueList() {
        return this.valueList;
    }

    public Boolean getMerchantCharacterFlag() {
        return this.merchantCharacterFlag;
    }
}

