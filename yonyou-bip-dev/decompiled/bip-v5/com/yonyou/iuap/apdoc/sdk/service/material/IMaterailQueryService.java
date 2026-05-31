/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.apdoc.sdk.service.material;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.sdk.dto.busidoc.LoadWayRpcDTO;
import com.yonyou.iuap.apdoc.sdk.dto.material.MaterialOptQryDTO;
import com.yonyou.iuap.apdoc.sdk.dto.material.ShopMaterialGroupDTO;
import com.yonyoucloud.iuap.upc.dto.ProductDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMaterailQueryService {
    public boolean isExistMaterial(Long var1, String var2) throws Exception;

    public List<Long> listMaterialIdByIdsAndOrg(List<Long> var1, String var2) throws Exception;

    public List<ProductDTO> listProductByIds(List<Long> var1, String[] var2) throws Exception;

    public List<ProductDTO> listProductByOrgIds(List<String> var1, String[] var2, int var3, int var4) throws Exception;

    public boolean isSignProduct2Customer(Long var1, Boolean var2) throws Exception;

    public List<LoadWayRpcDTO> listLoadWayByMaterialAndOrgId(Long var1, String var2) throws Exception;

    public List<Long> listMaterialIdByClsId(List<Long> var1) throws Exception;

    public List<Long> listProductByBarAndMensionCode(String var1, String var2) throws Exception;

    @Deprecated
    public List<ShopMaterialGroupDTO> groupOrgMaterialByOrgAndCls(List<String> var1, List<String> var2) throws Exception;

    public List<ShopMaterialGroupDTO> groupMaterialByOrgAndCls(List<String> var1, List<Long> var2) throws Exception;

    public List<ProductDTO> listPromotionalProductCatalogue(String var1, List<Long> var2, List<Long> var3, List<Long> var4) throws Exception;

    public UPCPager<ProductSkuDTO> listProductCatalogue(MaterialOptQryDTO var1) throws Exception;
}

