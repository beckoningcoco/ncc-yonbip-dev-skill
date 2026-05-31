/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.upc.merge.model;

public enum MergeDocTypeEnum {
    Merchant("\u5ba2\u6237", "\u8865\u5145resId"),
    Vendor("\u4f9b\u5e94\u5546", null);

    private final String status;
    private final String resId;

    private MergeDocTypeEnum(String status, String resId) {
        this.status = status;
        this.resId = resId;
    }
}

