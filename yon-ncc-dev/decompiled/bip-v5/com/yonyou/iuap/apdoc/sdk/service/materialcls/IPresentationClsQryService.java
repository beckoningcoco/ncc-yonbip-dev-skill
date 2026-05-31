/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.apdoc.sdk.service.materialcls;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.PresentationClassDTO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IPresentationClsQryService {
    public CoreDocJsonResult<PresentationClassDTO> listPresentationClassByPath(List<String> var1, Boolean var2) throws Exception;

    public CoreDocJsonResult<PresentationClassDTO> listPresentationClsById(List<Long> var1) throws Exception;
}

