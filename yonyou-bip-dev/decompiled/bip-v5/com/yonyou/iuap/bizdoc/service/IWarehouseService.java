/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.bizdoc.service;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import java.util.List;
import java.util.Map;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IWarehouseService {
    public void insert(Map<String, Object> var1) throws Exception;

    public Map<String, Object> insertWarehouse(Map<String, Object> var1) throws Exception;

    public void update(Map<String, Object> var1) throws Exception;

    public void stop(Map<String, Object> var1) throws Exception;

    public void unstop(Map<String, Object> var1) throws Exception;

    public Map<String, Object> batchdelete(List<Map<String, Object>> var1) throws Exception;

    public void delete(Map<String, Object> var1) throws Exception;
}

