/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.vo.ProductApplyApiVO;
import com.yonyoucloud.iuap.upc.vo.ProductApplyVO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductApplyService {
    public CoreDocJsonResult<ProductApplyApiVO> productApplySave(ProductApplyVO var1);

    public CoreDocJsonResult<UPCResultList> productApplyBatchSave(List<ProductApplyVO> var1);
}

