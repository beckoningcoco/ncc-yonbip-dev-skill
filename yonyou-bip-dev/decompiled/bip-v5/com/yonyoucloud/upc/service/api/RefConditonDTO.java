/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.api;

public class RefConditonDTO {
    private boolean isExtend;

    public void setExtend(boolean isExtend) {
        this.isExtend = isExtend;
    }

    public boolean isExtend() {
        return this.isExtend;
    }

    public String toString() {
        return "RefConditonDTO(isExtend=" + this.isExtend() + ")";
    }
}

