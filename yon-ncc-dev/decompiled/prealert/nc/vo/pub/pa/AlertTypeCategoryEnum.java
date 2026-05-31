/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.jcom.lang.StringUtil
 */
package nc.vo.pub.pa;

import nc.vo.jcom.lang.StringUtil;

public enum AlertTypeCategoryEnum {
    PRESET("preset"),
    CUSTOM("custom");

    private String strValue;

    private AlertTypeCategoryEnum(String strValue) {
        this.strValue = strValue;
    }

    public String getStrValue() {
        return this.strValue;
    }

    public static AlertTypeCategoryEnum fromStrValue(String strValue) {
        if (StringUtil.isEmptyWithTrim((String)strValue)) {
            return PRESET;
        }
        if (strValue.equals(PRESET.toString())) {
            return PRESET;
        }
        if (strValue.equals(CUSTOM.toString())) {
            return CUSTOM;
        }
        throw new IllegalArgumentException(strValue);
    }

    public String toString() {
        return this.strValue;
    }
}

