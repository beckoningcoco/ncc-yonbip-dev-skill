/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeGroupDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeGroupQryDTO;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMerchantApplyRangeGroupQueryService {
    public List<MerchantApplyRangeGroupDTO> listMerchantApplyRangeGroupByPage(MerchantApplyRangeGroupQryDTO var1, Integer var2, Integer var3) throws Exception;
}

