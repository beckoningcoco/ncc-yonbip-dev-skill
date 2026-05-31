/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api.openapi;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.openapi.merchant.MerchantOpenApiSaveDTO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMerchantOpenApiService {
    public CoreDocJsonResult<MerchantOpenApiSaveDTO> insertMerchant(MerchantOpenApiSaveDTO var1);

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> updateMerchant(MerchantOpenApiSaveDTO var1);

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> queryById(Long var1);

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> queryByIdList(List<Long> var1);

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> queryByCode(String var1);

    public CoreDocJsonResult<MerchantOpenApiSaveDTO> queryByCodeList(List<String> var1);
}

