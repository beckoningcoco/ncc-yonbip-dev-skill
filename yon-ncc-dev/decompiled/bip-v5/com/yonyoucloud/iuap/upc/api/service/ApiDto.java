/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 */
package com.yonyoucloud.iuap.upc.api.service;

import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;

public class ApiDto
extends BillDataDto {
    private String bizApp;
    private String resource;
    private boolean isPartitionable = true;

    public boolean isPartitionable() {
        return this.isPartitionable;
    }

    public void setPartitionable(boolean partitionable) {
        this.isPartitionable = partitionable;
    }

    public String getBizApp() {
        return this.bizApp;
    }

    public void setBizApp(String bizApp) {
        this.bizApp = bizApp;
    }

    public String getResource() {
        return this.resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }
}

