/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api.freedomconditonbyes;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.api.freedomconditonbyes.freedomquery.FreedomQueryCondition;
import com.yonyoucloud.iuap.upc.dto.MerchantDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IFreedomQueryByEsService {
    public UPCPager<MerchantDTO> queryMerchantByFreedomConditionPage(FreedomQueryCondition var1) throws Exception;
}

