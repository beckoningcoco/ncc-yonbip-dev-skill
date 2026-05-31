/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.portal.MerchantRangeDetailPortalDTO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMerchantApplyRangeDetailService {
    public void lock(Long var1, String var2, String var3) throws Exception;

    public void lock(Long var1, String var2, String var3, Long var4, String var5) throws Exception;

    public void unLock(Long var1, String var2, String var3, List<String> var4) throws Exception;

    public void unLock(Long var1, String var2, String var3, List<String> var4, Long var5, String var6) throws Exception;

    public CoreDocJsonResult<MerchantRangeDetailPortalDTO> updateMerchantRangeDetailForPortal(MerchantRangeDetailPortalDTO var1);
}

