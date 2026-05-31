/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.service.operationalTools;

import java.util.List;

public class APIBodifyVO {
    private List<String> ids;

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public List<String> getIds() {
        return this.ids;
    }

    public String toString() {
        return "APIBodifyVO(ids=" + this.getIds() + ")";
    }
}

