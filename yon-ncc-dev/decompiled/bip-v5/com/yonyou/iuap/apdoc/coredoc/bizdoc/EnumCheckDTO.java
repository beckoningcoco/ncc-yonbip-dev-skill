/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.coredoc.bizdoc;

public class EnumCheckDTO {
    private String fieldName;
    private String enumType;
    private Object enumValue;

    public EnumCheckDTO(String fieldName, String enumType, Object enumValue) {
        this.fieldName = fieldName;
        this.enumType = enumType;
        this.enumValue = enumValue;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public String getEnumType() {
        return this.enumType;
    }

    public Object getEnumValue() {
        return this.enumValue;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public void setEnumType(String enumType) {
        this.enumType = enumType;
    }

    public void setEnumValue(Object enumValue) {
        this.enumValue = enumValue;
    }
}

