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
public interface IMerchantRpcService {
    public Object getMerchantValue(String var1, Long var2, Long var3);

    public Object getMerchantValue(String var1, String var2, Long var3);

    public Object getMerchantValue(String var1, Long var2, String var3);

    public Object getMerchantValue(String var1, String var2, String var3);

    public Object getMerchantValues(String var1, List<Object> var2, List<Object> var3);
}

