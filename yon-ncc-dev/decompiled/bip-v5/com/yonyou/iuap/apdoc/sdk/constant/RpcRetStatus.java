/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.constant;

public enum RpcRetStatus {
    SUCCESS(200, "success"),
    FAIL(500, "fail");

    private Integer status;
    private String code;

    private RpcRetStatus(Integer status, String code) {
        this.status = status;
        this.code = code;
    }
}

