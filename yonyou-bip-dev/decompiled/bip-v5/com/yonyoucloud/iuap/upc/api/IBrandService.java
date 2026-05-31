/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.derivatives.BrandDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.BrandQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IBrandService {
    public CoreDocJsonResult<BrandDTO> queryByID(Long var1) throws Exception;

    public CoreDocJsonResult<BrandDTO> queryByIDList(List<Long> var1) throws Exception;

    public CoreDocJsonResult<BrandDTO> queryByCode(String var1) throws Exception;

    public CoreDocJsonResult<BrandDTO> queryByCodeList(List<String> var1) throws Exception;

    public CoreDocJsonResult<BrandDTO> listByPage(BrandQryDTO var1) throws Exception;

    public CoreDocJsonResult<BrandDTO> add(BrandDTO var1) throws Exception;

    public CoreDocJsonResult<BrandDTO> update(BrandDTO var1) throws Exception;

    public CoreDocJsonResult<UPCResultList> batchAdd(List<BrandDTO> var1) throws Exception;

    public CoreDocJsonResult<UPCResultList> batchUpdate(List<BrandDTO> var1) throws Exception;
}

