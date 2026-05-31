/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.upc.service;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductApplyRpcService {
    public Object getProductApplyValue(String var1, Long var2);

    public Object getProductApplyValues(String var1, List<Long> var2);

    public Object getOriginalProductDataFromApply(String var1, Long var2);

    public Object getOriginalProductDataFromApplys(String var1, List<Long> var2);
}

