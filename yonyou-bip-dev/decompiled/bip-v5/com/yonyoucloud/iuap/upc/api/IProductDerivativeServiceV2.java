/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.BrandQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductCheckFreeMergeDTO;
import com.yonyoucloud.iuap.upc.dto.ProductIdQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductParameterQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductParametersDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSpecItemDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSpecItemQryDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTagDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplAssistUnitExchangeDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplCharacterDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplCyclePropertyDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplExtendPropDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplParameterDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplSpecSumDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplUnitDTO;
import com.yonyoucloud.iuap.upc.dto.TagQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.vo.ProductAssistClassVO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.HashSet;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductDerivativeServiceV2 {
    public UPCPager tagByPageV2(TagQryDTO var1) throws Exception;

    public UPCPager brandByPageV2(BrandQryDTO var1) throws Exception;

    public HashSet<Long> getProductIdByQryDTO(ProductIdQryDTO var1) throws Exception;

    public HashSet<Long> getProductTplParameterId(Long var1, Boolean var2) throws Exception;

    public List<ProductTplParameterDTO> getProductTplParameterByTemplateId(List<Long> var1, Boolean var2) throws Exception;

    public List<ProductParametersDTO> getProductParameters(ProductParameterQryDTO var1) throws Exception;

    public List<ProductAssistClassVO> getProductAssistClassByProductId(List<Long> var1) throws Exception;

    public List<ProductTplDTO> getProductTplById(List<Long> var1, String[] var2) throws Exception;

    public List<ProductTplUnitDTO> listProductTplUnitByTplId(List<Long> var1, String[] var2) throws Exception;

    public List<ProductTplAssistUnitExchangeDTO> listTplAssistUnitExchangeByTplId(List<Long> var1) throws Exception;

    public List<ProductTplExtendPropDTO> listProductTplExtendPropByTplId(List<Long> var1) throws Exception;

    public List<ProductTplSpecSumDTO> listProductTplSpecSumByTplId(List<Long> var1) throws Exception;

    public List<ProductSpecItemDTO> listProductSpecItemByProductId(List<Long> var1) throws Exception;

    public UPCPager listProductSpecItemByPageV2(ProductSpecItemQryDTO var1) throws Exception;

    public List<ProductCheckFreeMergeDTO> listProductCheckFreeMerge(ProductSpecItemQryDTO var1) throws Exception;

    public List<ProductTagDTO> listProductTagByProductIdAndTagId(List<Long> var1, List<Long> var2) throws Exception;

    public CoreDocJsonResult<ProductTplCyclePropertyDTO> listProductTplCycleProperty(List<Long> var1) throws Exception;

    public List<ProductTplCharacterDTO> listProductTplCharacterDTO(List<Long> var1) throws Exception;
}

