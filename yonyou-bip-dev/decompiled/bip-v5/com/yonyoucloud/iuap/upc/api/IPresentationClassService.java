/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.derivatives.PresentationClassDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.PresentationClassQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IPresentationClassService {
    public CoreDocJsonResult<PresentationClassDTO> queryByID(Long var1) throws Exception;

    public CoreDocJsonResult<PresentationClassDTO> queryByIDList(List<Long> var1) throws Exception;

    public CoreDocJsonResult<PresentationClassDTO> queryByCode(String var1) throws Exception;

    public CoreDocJsonResult<PresentationClassDTO> queryByCodeList(List<String> var1) throws Exception;

    public CoreDocJsonResult<PresentationClassDTO> queryTree(PresentationClassQryDTO var1) throws Exception;

    public CoreDocJsonResult<PresentationClassDTO> queryTreeByParent(PresentationClassQryDTO var1) throws Exception;

    public CoreDocJsonResult<PresentationClassDTO> add(PresentationClassDTO var1) throws Exception;

    public CoreDocJsonResult<PresentationClassDTO> update(PresentationClassDTO var1) throws Exception;

    public CoreDocJsonResult<UPCResultList> batchAdd(List<PresentationClassDTO> var1) throws Exception;

    public CoreDocJsonResult<UPCResultList> batchUpdate(List<PresentationClassDTO> var1) throws Exception;
}

