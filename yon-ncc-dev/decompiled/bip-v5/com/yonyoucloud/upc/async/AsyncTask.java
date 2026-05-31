/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 */
package com.yonyoucloud.upc.async;

import com.yonyou.ucf.mdd.ext.core.AppContext;
import java.util.Map;
import java.util.UUID;

public class AsyncTask {
    private String id = UUID.randomUUID().toString();
    private Long tenantId;
    private Long userId;
    private Object data;
    private String yhtTenantId;
    private Map<String, Object> param;
    private String executor;

    public AsyncTask() {
    }

    public AsyncTask(Object data, String executor, Map<String, Object> param, String yhtTenantId) {
        this();
        this.userId = (Long)AppContext.getCurrentUser().getId();
        this.tenantId = (Long)AppContext.getTenantId();
        this.data = data;
        this.executor = executor;
        this.param = param;
        this.yhtTenantId = yhtTenantId;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTenantId() {
        return this.tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    public Long getUserId() {
        return this.userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getExecutor() {
        return this.executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public Map<String, Object> getParam() {
        return this.param;
    }

    public void setParam(Map<String, Object> param) {
        this.param = param;
    }

    public String getYhtTenantId() {
        return this.yhtTenantId;
    }

    public void setYhtTenantId(String yhtTenantId) {
        this.yhtTenantId = yhtTenantId;
    }
}

