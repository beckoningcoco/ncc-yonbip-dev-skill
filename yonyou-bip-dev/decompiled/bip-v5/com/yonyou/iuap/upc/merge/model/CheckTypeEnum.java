/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.upc.merge.model;

public enum CheckTypeEnum {
    inTransit("\u5728\u9014\u5355\u636e", "\u8865\u5145resId"),
    balance("\u5f85\u5904\u7406\u4f59\u989d", null),
    other("\u5176\u4ed6\u68c0\u67e5\u9879", null);

    private final String typeName;
    private final String resId;

    private CheckTypeEnum(String typeName, String resId) {
        this.typeName = typeName;
        this.resId = resId;
    }

    public String getTypeName() {
        return this.typeName;
    }

    public String getResId() {
        return this.resId;
    }
}

