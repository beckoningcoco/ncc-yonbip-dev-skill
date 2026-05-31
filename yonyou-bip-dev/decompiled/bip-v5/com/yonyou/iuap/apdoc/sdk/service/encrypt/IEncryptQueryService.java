/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.apdoc.sdk.service.encrypt;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.sdk.dto.encrypt.EncryptMaterialDTO;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IEncryptQueryService {
    public List<EncryptMaterialDTO> listEncryptMaterialByUserIds(List<String> var1) throws Exception;

    public List<EncryptMaterialDTO> listEncryptMaterialByUserId(List<Long> var1, String var2) throws Exception;
}

