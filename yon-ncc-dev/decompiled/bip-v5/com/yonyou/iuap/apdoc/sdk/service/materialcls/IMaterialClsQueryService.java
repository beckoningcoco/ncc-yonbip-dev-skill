/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.apdoc.sdk.service.materialcls;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassDTO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.HashMap;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMaterialClsQueryService {
    public List<ManagementClassDTO> listMaterialClsApplyRangeIdByIds(List<Long> var1) throws Exception;

    public List<String> listAllOrgIdyInfo(List<Long> var1, List<String> var2) throws Exception;

    public List<ManagementClassDTO> getMaterialClsById(String var1) throws Exception;

    public ManagementClassDTO getMaterialClsById(Long var1, String var2) throws Exception;

    public List<ManagementClassDTO> getMaterialClsById(List<Long> var1, String var2) throws Exception;

    public CoreDocJsonResult<ManagementClassDTO> listMaterialClsByPath(List<String> var1) throws Exception;

    public HashMap<Long, List<ManagementClassDTO>> listSubMaterialClsByIds(List<Long> var1) throws Exception;
}

