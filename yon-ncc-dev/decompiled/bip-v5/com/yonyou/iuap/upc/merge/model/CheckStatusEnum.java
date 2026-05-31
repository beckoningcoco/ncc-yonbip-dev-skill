/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.upc.merge.model;

public enum CheckStatusEnum {
    hasAgent("\u6709\u4ee3\u529e", "\u8865\u5145resId"),
    noAgent("\u65e0\u4ee3\u529e", null),
    warning("\u4ec5\u544a\u793a", null);

    private final String status;
    private final String resId;

    private CheckStatusEnum(String status, String resId) {
        this.status = status;
        this.resId = resId;
    }
}

