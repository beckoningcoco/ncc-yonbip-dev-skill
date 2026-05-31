/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.derivatives.SaleAreaDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.SaleAreaQryDTO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface ISaleAreaService {
    public CoreDocJsonResult<SaleAreaDTO> queryByID(Long var1) throws Exception;

    public CoreDocJsonResult<SaleAreaDTO> queryByIDList(List<Long> var1) throws Exception;

    public CoreDocJsonResult<SaleAreaDTO> queryByCode(String var1) throws Exception;

    public CoreDocJsonResult<SaleAreaDTO> queryByCodeList(List<String> var1) throws Exception;

    public CoreDocJsonResult<SaleAreaDTO> queryTree(SaleAreaQryDTO var1) throws Exception;

    public CoreDocJsonResult<SaleAreaDTO> queryTreeByParent(SaleAreaQryDTO var1) throws Exception;

    public CoreDocJsonResult<SaleAreaDTO> add(SaleAreaDTO var1) throws Exception;

    public CoreDocJsonResult<SaleAreaDTO> update(SaleAreaDTO var1) throws Exception;

    public CoreDocJsonResult<SaleAreaDTO> queryOrgByIds(List<Long> var1) throws Exception;

    public CoreDocJsonResult<SaleAreaDTO> batchAdd(List<SaleAreaDTO> var1) throws Exception;

    public CoreDocJsonResult<SaleAreaDTO> batchUpdate(List<SaleAreaDTO> var1) throws Exception;
}

