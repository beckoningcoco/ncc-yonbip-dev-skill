/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyoucloud.iuap.upc.vo.ProductApiVO
 *  com.yonyoucloud.iuap.upc.vo.ProductApplyQueryVO
 *  com.yonyoucloud.iuap.upc.vo.ProductApplySaveVO
 *  com.yonyoucloud.iuap.upc.vo.ProductApplyVO
 *  com.yonyoucloud.iuap.upc.vo.ProductQueryVO
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyoucloud.iuap.upc.vo.ProductApiVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplyQueryVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplySaveVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplyVO;
import com.yonyoucloud.iuap.upc.vo.ProductQueryVO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductSaveService {
    public Object productSave(ProductApiVO var1) throws Exception;

    public ProductApiVO queryProduct(ProductQueryVO var1) throws Exception;

    public Object productApplySave(ProductApplyVO var1) throws Exception;

    public ProductApplyVO queryProductApply(ProductApplyQueryVO var1) throws Exception;

    public Pager listProductApply(ProductApplyQueryVO var1) throws Exception;

    public CoreDocJsonResult<ProductApplySaveVO> productApplyDetailSave(ProductApplySaveVO var1) throws Exception;
}

