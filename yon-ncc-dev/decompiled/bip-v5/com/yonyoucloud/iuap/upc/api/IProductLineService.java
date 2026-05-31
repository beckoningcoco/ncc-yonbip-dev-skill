/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.ProductLineDTO;
import com.yonyoucloud.iuap.upc.dto.ProductLineQryDTO;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductLineService {
    public List<ProductLineDTO> listProductLineByCondition(List<ProductLineQryDTO> var1, Integer var2, Integer var3) throws Exception;

    public Integer listProductLineCount(List<ProductLineQryDTO> var1) throws Exception;

    public List<ProductLineDTO> listProductLineByQryDTO(ProductLineQryDTO var1) throws Exception;
}

