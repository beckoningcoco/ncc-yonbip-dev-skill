/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyoucloud.iuap.upc.dto.ProductQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSkuDTO
 *  com.yonyoucloud.iuap.upc.dto.ProductSkuQryDTO
 *  com.yonyoucloud.iuap.upc.dto.SpecificationDTO
 *  com.yonyoucloud.iuap.upc.vo.ProductSKUSaveVO
 *  com.yonyoucloud.iuap.upc.vo.sku.ProductSKUCharacterSaveVO
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyoucloud.iuap.upc.dto.ProductQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuQryDTO;
import com.yonyoucloud.iuap.upc.dto.SpecificationDTO;
import com.yonyoucloud.iuap.upc.vo.ProductSKUSaveVO;
import com.yonyoucloud.iuap.upc.vo.sku.ProductSKUCharacterSaveVO;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface ISkuService {
    public ProductSkuDTO getSkuById(Long var1, String[] var2) throws Exception;

    @Deprecated
    public ProductSkuDTO getSkuByIdAndOrg(Long var1, Long var2, String[] var3) throws Exception;

    public List<ProductSkuDTO> getSkuByIds(List<Long> var1, String[] var2) throws Exception;

    @Deprecated
    public List<ProductSkuDTO> getSkuByIdsAndOrg(List<Long> var1, Long var2, String[] var3) throws Exception;

    public ProductSkuDTO getSkuByCode(String var1, String[] var2) throws Exception;

    public List<ProductSkuDTO> getSkuByCodeList(List<String> var1, String[] var2) throws Exception;

    @Deprecated
    public ProductSkuDTO getSkuByCodeAndOrg(String var1, Long var2, String[] var3) throws Exception;

    public List<ProductSkuDTO> listSkuByProductId(Long var1, String[] var2) throws Exception;

    public List<ProductSkuDTO> listSkuByProductIds(List<Long> var1, String[] var2) throws Exception;

    @Deprecated
    public List<ProductSkuDTO> listSkuInfo(ProductQryDTO var1, String[] var2) throws Exception;

    public List<ProductSkuDTO> listSkuInfoNew(ProductSkuQryDTO var1) throws Exception;

    public Pager listSkuInfoByPage(ProductSkuQryDTO var1) throws Exception;

    public ResultList saveProductSKU(List<ProductSKUSaveVO> var1) throws Exception;

    public ProductSKUCharacterSaveVO saveProductSKUCharacter(ProductSKUCharacterSaveVO var1) throws Exception;

    public List<String> saveProductSKUCharacter(List<ProductSKUCharacterSaveVO> var1) throws Exception;

    public ProductSKUCharacterSaveVO updateProductSKUCharacter(ProductSKUCharacterSaveVO var1) throws Exception;

    public List<SpecificationDTO> getSpecListBySkuId(Long var1) throws Exception;
}

