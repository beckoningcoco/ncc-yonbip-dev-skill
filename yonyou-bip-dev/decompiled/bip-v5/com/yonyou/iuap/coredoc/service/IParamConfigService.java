/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.coredoc.service;

import com.yonyou.cloud.middleware.rpc.RemoteCall;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IParamConfigService {
    public boolean isMaterialGlobalShare();

    public boolean isMerchantGlobalShare();
}

