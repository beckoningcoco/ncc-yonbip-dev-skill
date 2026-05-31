/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.docmerge.model;

public enum TaskTypeEnum {
    MerchantMergeCheck("\u5ba2\u6237\u5728\u9014\u4e1a\u52a1\u68c0\u67e5"),
    VendorMergeCheck("\u4f9b\u5e94\u5546\u5728\u9014\u4e1a\u52a1\u68c0\u67e5");

    private String description;

    private TaskTypeEnum(String description) {
        this.description = description;
    }
}

