/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.attrcontrol.DocAttrControlConfigDTO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IDocAttrControlService {
    public CoreDocJsonResult<DocAttrControlConfigDTO> queryMerchantAttrControlConfig(String var1);

    public Boolean isHaveOwnAttrControlConfig();
}

