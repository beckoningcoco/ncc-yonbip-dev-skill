/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.upc.datarule;

import com.yonyoucloud.iuap.upc.api.remote.IDataConsumer;
import java.util.List;

public class DataConsumer {
    private String domain;
    private String name;
    private IDataConsumer remote;
    private List<String> dataKeys;

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getDataKeys() {
        return this.dataKeys;
    }

    public void setDataKeys(List<String> dataKeys) {
        this.dataKeys = dataKeys;
    }

    public IDataConsumer getRemote() {
        return this.remote;
    }

    public void setRemote(IDataConsumer remote) {
        this.remote = remote;
    }
}

