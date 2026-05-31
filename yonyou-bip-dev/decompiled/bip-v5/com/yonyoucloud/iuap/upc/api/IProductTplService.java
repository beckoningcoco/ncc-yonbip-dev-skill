/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.ProductTplDTO;
import com.yonyoucloud.iuap.upc.productTpl.dto.ProductTplListDTO;
import com.yonyoucloud.iuap.upc.vo.productTpl.vo.ProductTplQueryVO;
import com.yonyoucloud.iuap.upc.vo.productTpl.vo.ProductTplVO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductTplService {
    public CoreDocJsonResult<Object> productTplSave(ProductTplVO var1) throws Exception;

    public CoreDocJsonResult<Object> productTplSave(List<ProductTplVO> var1) throws Exception;

    public CoreDocJsonResult<ProductTplListDTO> productQueryList(ProductTplQueryVO var1) throws Exception;

    public CoreDocJsonResult<ProductTplDTO> productQueryDetail(Long var1) throws Exception;

    public CoreDocJsonResult<Object> productTplSaveFromIdempotent(OpenAPIDTO<ProductTplVO> var1);
}

