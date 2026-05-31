/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.apdoc.sdk.service.sku;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.ProductSkuDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuQryDTO;
import com.yonyoucloud.iuap.upc.dto.SkuOrderPropertyDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;
import java.util.Map;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface ISkuQueryService {
    public CoreDocJsonResult<ProductSkuDTO> listSkuByIds(List<Long> var1, String[] var2) throws Exception;

    public List<Map<Long, Integer>> listSkuCountByMaterialId(List<Long> var1) throws Exception;

    public List<SkuOrderPropertyDTO> listProductTplOrderPropertyBySkuid(Long var1) throws Exception;

    public UPCPager<ProductSkuDTO> listSkuInfoByQryDTO(ProductSkuQryDTO var1) throws Exception;

    public UPCPager<ProductSkuDTO> listSkuInfoBySkuInfo(String var1, Long var2, String var3, String var4, Boolean var5) throws Exception;
}

