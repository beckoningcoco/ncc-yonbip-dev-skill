/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.dto.ext;

public enum UPCEntityStatus {
    Unchanged,
    Insert,
    Update,
    Delete,
    LOGICDELETE;


    public static UPCEntityStatus getEntityStatus(String value) {
        if (value == null) {
            return null;
        }
        for (UPCEntityStatus entityStatus : UPCEntityStatus.values()) {
            if (!value.equals(entityStatus.name())) continue;
            return entityStatus;
        }
        return null;
    }
}

