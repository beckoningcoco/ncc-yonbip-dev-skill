/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.apdoc.sdk.service.material;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.ProductTplCyclePropertyDTO;
import com.yonyoucloud.iuap.upc.dto.ProductTplDTO;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMaterailTplQryService {
    public List<ProductTplDTO> listMaterialTplInfoById(List<Long> var1) throws Exception;

    public List<Long> listMaterialIdByIds(List<Long> var1) throws Exception;

    public List<ProductTplCyclePropertyDTO> listMaterialTplCyclePropertyById(List<Long> var1) throws Exception;
}

