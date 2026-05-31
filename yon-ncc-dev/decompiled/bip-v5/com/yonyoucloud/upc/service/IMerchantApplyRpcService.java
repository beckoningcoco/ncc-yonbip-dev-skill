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
public interface IMerchantApplyRpcService {
    public Object getMerchantApplyValue(String var1, Long var2);

    public Object getMerchantApplyValues(String var1, List<Long> var2);

    public Object orgIsExistMerchantApplyRange(String var1, String var2, Long var3);

    public Object orgIsExistMerchantApplyRanges(String var1, String var2, List<Long> var3);

    public Boolean orgIsLikeMerchantApplyRange(String var1, Long var2);

    public Boolean orgIsNotLikeMerchantApplyRange(String var1, Long var2);
}

