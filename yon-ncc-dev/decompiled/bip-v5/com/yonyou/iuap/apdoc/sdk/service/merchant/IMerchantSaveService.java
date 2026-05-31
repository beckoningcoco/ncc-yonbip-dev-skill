/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.apdoc.sdk.service.merchant;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.sdk.dto.common.DocOrgIdDTO;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantDataDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantContacterDTO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMerchantSaveService {
    public MerchantDataDTO merchantAdd(MerchantDataDTO var1) throws Exception;

    public MerchantDataDTO merchantUpdate(MerchantDataDTO var1) throws Exception;

    public String merchantDelete(DocOrgIdDTO var1) throws Exception;

    public String merchantDeleteAsync(DocOrgIdDTO var1) throws Exception;

    public String merchantBatchDeleteAsync(List<DocOrgIdDTO> var1) throws Exception;

    public MerchantDataDTO merchantOrgDataAdd(MerchantDataDTO var1) throws Exception;

    public void deleteMerchantAdress(Long var1) throws Exception;

    public void merchantContacterAdd(List<MerchantContacterDTO> var1) throws Exception;

    public void merchantContacterUpdate(List<MerchantContacterDTO> var1) throws Exception;

    public void merchantContacterDelete(List<Long> var1) throws Exception;

    public void merchantBusinessLog(MerchantDataDTO var1, String var2);

    public CoreDocJsonResult<DocOrgIdDTO> merchantBatchStop(List<DocOrgIdDTO> var1) throws Exception;

    public CoreDocJsonResult<DocOrgIdDTO> merchantBatchUnStop(List<DocOrgIdDTO> var1) throws Exception;
}

