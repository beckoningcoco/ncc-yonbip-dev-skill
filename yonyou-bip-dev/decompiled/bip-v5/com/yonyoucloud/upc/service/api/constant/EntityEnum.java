/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.api.constant;

import java.util.HashMap;

public enum EntityEnum {
    MERCHANTBANK("merchantBank", "agentfinancialnew", "erpCode"),
    MERCHANT("merchant", "merchant", "erpCode"),
    MATERIAL("material", "product", "erpCode"),
    CUSTOMERCATEGORY("customerCategory", "agentcategory", "cErpCode"),
    MATERIALCLASS("materialClass", "product_management_class", "erpCode");

    private String code;
    private String tableName;
    private String columnName;
    private static HashMap<String, EntityEnum> enumMap;

    private EntityEnum(String code, String tableName, String columnName) {
        this.code = code;
        this.tableName = tableName;
        this.columnName = columnName;
    }

    private static synchronized void initMap() {
        EntityEnum[] items;
        if (enumMap != null) {
            return;
        }
        enumMap = new HashMap();
        for (EntityEnum item : items = EntityEnum.values()) {
            enumMap.put(item.getCode(), item);
        }
    }

    public static EntityEnum findValue(String code) {
        if (code == null) {
            return null;
        }
        if (enumMap == null) {
            EntityEnum.initMap();
        }
        return enumMap.get(code);
    }

    public String getCode() {
        return this.code;
    }

    public String getTableName() {
        return this.tableName;
    }

    public String getColumnName() {
        return this.columnName;
    }

    static {
        enumMap = null;
    }
}

