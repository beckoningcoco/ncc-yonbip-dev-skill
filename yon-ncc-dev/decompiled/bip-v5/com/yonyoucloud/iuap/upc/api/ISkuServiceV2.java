/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.ProductQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuTagDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuTagQryDTO;
import com.yonyoucloud.iuap.upc.dto.SpecificationDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.vo.ProductSKUSaveVO;
import com.yonyoucloud.iuap.upc.vo.sku.ProductSKUCharacterSaveVO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface ISkuServiceV2 {
    public ProductSkuDTO getSkuById(Long var1, String[] var2) throws Exception;

    public ProductSkuDTO getSkuByIdAndOrg(Long var1, String var2, String[] var3) throws Exception;

    public List<ProductSkuDTO> getSkuByIds(List<Long> var1, String[] var2) throws Exception;

    public List<ProductSkuDTO> getSkuByIdsAndOrg(List<Long> var1, String var2, String[] var3) throws Exception;

    public List<ProductSkuTagDTO> getSkuTags(ProductSkuTagQryDTO var1) throws Exception;

    public ProductSkuDTO getSkuByCode(String var1, String[] var2) throws Exception;

    public List<ProductSkuDTO> getSkuByCodeList(List<String> var1, String[] var2) throws Exception;

    public ProductSkuDTO getSkuByCodeAndOrg(String var1, String var2, String[] var3) throws Exception;

    public List<ProductSkuDTO> listSkuByProductId(Long var1, String[] var2) throws Exception;

    public List<ProductSkuDTO> listSkuByProductIds(List<Long> var1, String[] var2) throws Exception;

    @Deprecated
    public List<ProductSkuDTO> listSkuInfo(ProductQryDTO var1, String[] var2) throws Exception;

    public List<ProductSkuDTO> listSkuInfoNew(ProductSkuQryDTO var1) throws Exception;

    public UPCPager listSkuInfoByPageV2(ProductSkuQryDTO var1) throws Exception;

    public UPCResultList saveProductSKUs(List<ProductSKUSaveVO> var1) throws Exception;

    public ProductSKUCharacterSaveVO saveProductSKUCharacter(ProductSKUCharacterSaveVO var1) throws Exception;

    public List<String> saveProductSKUCharacter(List<ProductSKUCharacterSaveVO> var1) throws Exception;

    public ProductSKUCharacterSaveVO updateProductSKUCharacter(ProductSKUCharacterSaveVO var1) throws Exception;

    public List<SpecificationDTO> getSpecListBySkuId(Long var1) throws Exception;

    public CoreDocJsonResult delSkuById(Long var1) throws Exception;

    public CoreDocJsonResult saveSkuTag(Long var1, String var2, List<Long> var3) throws Exception;

    public CoreDocJsonResult delSkuTag(Long var1, String var2, List<Long> var3) throws Exception;

    public CoreDocJsonResult unShelfUmallSku(Long var1, String var2) throws Exception;

    public CoreDocJsonResult shelfUmallSku(Long var1, String var2) throws Exception;

    public CoreDocJsonResult unShelfUorderSku(Long var1, String var2) throws Exception;

    public CoreDocJsonResult shelfUorderSku(Long var1, String var2) throws Exception;

    public CoreDocJsonResult disableSku(Long var1, String var2) throws Exception;

    public CoreDocJsonResult enableSku(Long var1, String var2) throws Exception;
}

