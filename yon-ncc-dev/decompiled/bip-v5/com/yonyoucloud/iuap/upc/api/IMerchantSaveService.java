/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.AddressInfoDTO;
import com.yonyoucloud.iuap.upc.dto.AgentFinancialDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantAllocateOrgDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantInvoiceDTO;
import com.yonyoucloud.iuap.upc.dto.ResultMessageDTO;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMerchantSaveService {
    public Object saveAddress(AddressInfoDTO var1) throws Exception;

    public AgentFinancialDTO saveOrUpdateAgentFinancial(AgentFinancialDTO var1) throws Exception;

    public MerchantInvoiceDTO saveOrUpdateMerchantInvoice(MerchantInvoiceDTO var1) throws Exception;

    public ResultMessageDTO saveMerchantAllocateOrg(MerchantAllocateOrgDTO var1) throws Exception;

    public ResultMessageDTO saveMerchantAllocateShop(MerchantAllocateOrgDTO var1) throws Exception;

    public ResultMessageDTO setMerchantChannelLevel(MerchantDTO var1);
}

