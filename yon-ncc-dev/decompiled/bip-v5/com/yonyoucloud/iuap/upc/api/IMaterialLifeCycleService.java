/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.MaterialLifeCycleCheckDTO;
import com.yonyoucloud.iuap.upc.vo.MaterialLifeCycleCheckVO;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMaterialLifeCycleService {
    public List<MaterialLifeCycleCheckVO> getControlRule(List<MaterialLifeCycleCheckDTO> var1) throws Exception;
}

