/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.pubbatchmodify.PubBatchModifyDTO;
import com.yonyoucloud.iuap.upc.dto.pubbatchmodify.PubBatchModifyModifySaveDTO;
import com.yonyoucloud.iuap.upc.dto.pubbatchmodify.PubBatchModifyQueryDTO;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IPubBatchModifyService {
    public List<PubBatchModifyDTO> getPubBatchModifyBatchEntity(PubBatchModifyQueryDTO var1) throws Exception;

    public PubBatchModifyDTO getPubBatchModifyEntityField(PubBatchModifyQueryDTO var1) throws Exception;

    public String batchModify(PubBatchModifyModifySaveDTO var1) throws Exception;

    public String getSyncDataProgress(String var1) throws Exception;
}

