/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.ipass.product.ProductApplyDataSaveRequest;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.vo.ProductApiVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplyQueryVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplySaveVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplyVO;
import com.yonyoucloud.iuap.upc.vo.ProductQueryVO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductSaveServiceV2 {
    public Object productSave(ProductApiVO var1) throws Exception;

    public CoreDocJsonResult<UPCResultList> productBatchSave(List<ProductApiVO> var1) throws Exception;

    public ProductApiVO queryProduct(ProductQueryVO var1) throws Exception;

    public Object productApplySave(ProductApplyVO var1) throws Exception;

    public ProductApplyVO queryProductApply(ProductApplyQueryVO var1) throws Exception;

    public UPCPager listProductApplyV2(ProductApplyQueryVO var1) throws Exception;

    public CoreDocJsonResult<ProductApplySaveVO> productApplyDetailSave(ProductApplySaveVO var1) throws Exception;

    public CoreDocJsonResult<UPCResultList> productApplyDetailBatchSave(List<ProductApplyDataSaveRequest> var1) throws Exception;

    public Object productApplySaveFromIdempotent(OpenAPIDTO<ProductApplyVO> var1);

    public CoreDocJsonResult<ProductApplySaveVO> productApplyDetailSaveFromIdempotent(OpenAPIDTO<ProductApplySaveVO> var1);

    public CoreDocJsonResult<UPCResultList> addProductOrgs(Long var1, List<String> var2) throws Exception;

    public CoreDocJsonResult<UPCResultList> productDetailBatchSave(List<ProductApplySaveVO> var1) throws Exception;
}

