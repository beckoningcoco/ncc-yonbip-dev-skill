/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.ext.UPCRuleExecuteResult;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductShelveServiceV2 {
    public UPCRuleExecuteResult shelfUorderProductV2(Long var1, List<String> var2) throws Exception;

    public UPCRuleExecuteResult unShelfUorderProductV2(Long var1, List<String> var2) throws Exception;

    public UPCRuleExecuteResult shelfUmallProductV2(Long var1, List<String> var2) throws Exception;

    public UPCRuleExecuteResult unShelfUmallProductV2(Long var1, List<String> var2) throws Exception;

    public CoreDocJsonResult unShelfUmallProductV3(Long var1, String var2) throws Exception;

    public CoreDocJsonResult shelfUmallProductV3(Long var1, String var2) throws Exception;

    public CoreDocJsonResult unShelfUorderProductV3(Long var1, String var2) throws Exception;

    public CoreDocJsonResult shelfUorderProductV3(Long var1, String var2) throws Exception;
}

