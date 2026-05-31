/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.apdoc.sdk.service.material;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.sdk.dto.material.MaterialCompQryDTO;
import com.yonyou.iuap.apdoc.sdk.dto.material.MaterialEaxctCompQryDTO;
import com.yonyou.iuap.apdoc.sdk.dto.material.MaterialQryRpcDTO4Retail;
import com.yonyou.iuap.apdoc.sdk.dto.material.ShopMaterialQryDTO;
import com.yonyou.iuap.apdoc.sdk.dto.material.SkuFuzzyCompQryDTO;
import com.yonyou.iuap.apdoc.sdk.dto.material.SkuQryRpcDTO4Retail;
import com.yonyoucloud.iuap.upc.dto.ProductDTO;
import com.yonyoucloud.iuap.upc.dto.ProductQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.sku.dto.SkuBaseDTO;
import java.util.HashMap;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMaterialQueryService4Retail {
    public UPCPager<ProductDTO> searchMaterial4ScanByInfo(MaterialCompQryDTO var1) throws Exception;

    public int countMaterial4DownloadByInfo(MaterialQryRpcDTO4Retail var1) throws Exception;

    public UPCPager<ProductDTO> listMaterial4DownloadByInfo(MaterialQryRpcDTO4Retail var1) throws Exception;

    public UPCPager<ProductDTO> exactMaterial4ScanByInfo(MaterialEaxctCompQryDTO var1) throws Exception;

    public UPCPager<SkuBaseDTO> fuzzyMatchSku4ShopByInfo(SkuFuzzyCompQryDTO var1) throws Exception;

    public UPCPager<SkuBaseDTO> exactMatchSku4ShopByInfo(SkuQryRpcDTO4Retail var1) throws Exception;

    public List<Long> searchShopMaterialByInfo(ShopMaterialQryDTO var1) throws Exception;

    public HashMap<String, List> exactMatchSku4ShopByInfo(SkuQryRpcDTO4Retail var1, ProductQryDTO var2, ProductSkuQryDTO var3) throws Exception;

    public HashMap<String, List> fuzzyMatchSku4ShopByInfo(SkuFuzzyCompQryDTO var1, ProductQryDTO var2, ProductSkuQryDTO var3) throws Exception;
}

