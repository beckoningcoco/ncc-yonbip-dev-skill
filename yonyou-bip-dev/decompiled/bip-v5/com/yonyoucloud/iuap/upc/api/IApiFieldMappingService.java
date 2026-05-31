/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.FieldMappingDTO;
import com.yonyoucloud.iuap.upc.vo.QueryFieldMappingVo;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IApiFieldMappingService {
    public List<FieldMappingDTO> getApiFieldMappingByVO(QueryFieldMappingVo var1) throws Exception;

    public void saveApiFieldMapping(List<FieldMappingDTO> var1) throws Exception;
}

