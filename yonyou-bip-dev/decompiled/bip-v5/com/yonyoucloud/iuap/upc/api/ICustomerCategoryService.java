/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.derivatives.CustomerCategoryDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.CustomerCategoryQryDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.MessageDTO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface ICustomerCategoryService {
    public CoreDocJsonResult<CustomerCategoryDTO> queryByID(Long var1) throws Exception;

    public CoreDocJsonResult<CustomerCategoryDTO> queryByIDList(List<Long> var1) throws Exception;

    public CoreDocJsonResult<CustomerCategoryDTO> queryByCode(String var1) throws Exception;

    public CoreDocJsonResult<CustomerCategoryDTO> queryByCodeList(List<String> var1) throws Exception;

    public CoreDocJsonResult<CustomerCategoryDTO> queryTree(CustomerCategoryQryDTO var1) throws Exception;

    public CoreDocJsonResult<CustomerCategoryDTO> queryTreeByParent(CustomerCategoryQryDTO var1) throws Exception;

    public CoreDocJsonResult<CustomerCategoryDTO> add(CustomerCategoryDTO var1) throws Exception;

    public CoreDocJsonResult<CustomerCategoryDTO> update(CustomerCategoryDTO var1) throws Exception;

    public CoreDocJsonResult<MessageDTO> batchSave(List<CustomerCategoryDTO> var1) throws Exception;

    public CoreDocJsonResult<CustomerCategoryDTO> batchUpdate(List<CustomerCategoryDTO> var1) throws Exception;

    public CoreDocJsonResult<CustomerCategoryDTO> queryOrgByIds(List<Long> var1) throws Exception;
}

