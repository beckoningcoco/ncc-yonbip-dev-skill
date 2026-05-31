/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.ResultMessageDTO;
import com.yonyoucloud.iuap.upc.vo.MaterialStatusApiVO;
import com.yonyoucloud.iuap.upc.vo.MaterialStatusQueryVO;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMaterialStatusService {
    public MaterialStatusApiVO materialStatusSave(MaterialStatusApiVO var1) throws Exception;

    public List<MaterialStatusApiVO> materialStatusQuery(MaterialStatusQueryVO var1) throws Exception;

    public ResultMessageDTO materialStatusDelete(MaterialStatusQueryVO var1) throws Exception;
}

