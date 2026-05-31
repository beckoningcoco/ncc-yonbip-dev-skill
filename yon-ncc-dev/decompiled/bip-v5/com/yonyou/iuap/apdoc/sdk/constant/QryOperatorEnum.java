/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.apdoc.sdk.constant;

import java.util.HashMap;

public enum QryOperatorEnum {
    EQ("\u7b49\u4e8e", "="),
    NEQ("\u4e0d\u7b49\u4e8e", "!="),
    CONTAIN("\u5305\u542b", "like"),
    IN("\u5728\u96c6\u5408\u4e2d", "in"),
    NOT_IN("\u4e0d\u5728\u96c6\u5408\u4e2d", "not in "),
    IS_NULL("\u4e3a\u7a7a", "isnull"),
    NOT_NULL("\u4e0d\u4e3a\u7a7a", "is not null");

    private String name;
    private String value;
    private static HashMap<String, QryOperatorEnum> map;

    private QryOperatorEnum(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    private static synchronized void initMap() {
        QryOperatorEnum[] items;
        if (map != null) {
            return;
        }
        map = new HashMap();
        for (QryOperatorEnum item : items = QryOperatorEnum.values()) {
            map.put(item.getValue(), item);
        }
    }

    public static QryOperatorEnum find(String value) {
        if (value == null) {
            return null;
        }
        if (map == null) {
            QryOperatorEnum.initMap();
        }
        return map.get(value);
    }

    static {
        map = null;
    }
}

