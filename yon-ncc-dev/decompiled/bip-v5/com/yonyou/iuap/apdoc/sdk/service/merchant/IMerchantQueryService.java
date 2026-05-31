/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.apdoc.sdk.service.merchant;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.sdk.dto.merchant.MerchantDataDTO;
import com.yonyoucloud.iuap.upc.dto.AddressInfoDTO;
import com.yonyoucloud.iuap.upc.dto.InvoicingCustomersDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantContacterDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantCustomerAreaDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantInvoiceDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantManagerDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantRoleInfoDTO;
import com.yonyoucloud.iuap.upc.dto.PrincipalDTO;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMerchantQueryService {
    public boolean isExistMerchant(Long var1, String var2) throws Exception;

    public List<String> listMerchantApplyOrgIdByMerchantId(Long var1) throws Exception;

    public MerchantDTO getMerchantByOrgAndInnerOrg(String var1, String var2) throws Exception;

    public MerchantManagerDTO getMerchantManagerById(Long var1) throws Exception;

    public List<MerchantRoleInfoDTO> listMerchantRoleByIds(List<Long> var1) throws Exception;

    public List<MerchantInvoiceDTO> listMerchantInvoiceByIds(List<Long> var1) throws Exception;

    public List<MerchantContacterDTO> listMerchantContacter(List<Long> var1, Boolean var2) throws Exception;

    public List<MerchantContacterDTO> listMerchantContacterById(List<Long> var1, Boolean var2) throws Exception;

    public List<AddressInfoDTO> listAddressInfoByMerchantCodeList(List<String> var1, int var2, int var3) throws Exception;

    public List<AddressInfoDTO> listAddressInfoByMerchantIdList(List<Long> var1, int var2, int var3) throws Exception;

    public List<MerchantManagerDTO> listMerchantManager(List<Long> var1) throws Exception;

    public List<MerchantCustomerAreaDTO> listMerchantSaleArea(Long var1, String var2, Boolean var3) throws Exception;

    public List<InvoicingCustomersDTO> listMerchantBilling(Long var1, Boolean var2) throws Exception;

    public List<InvoicingCustomersDTO> listBillingMerchant(Long var1, String var2, Boolean var3) throws Exception;

    public List<InvoicingCustomersDTO> listMerchantBilling(List<Long> var1, String var2, Boolean var3) throws Exception;

    public List<PrincipalDTO> listMerchantPrincipal(Long var1, String var2, Boolean var3) throws Exception;

    public MerchantDataDTO getMerchantBillingSaleareaPrincipalById(Long var1, String var2, Boolean var3) throws Exception;

    public Boolean isPostential(Long var1, String var2) throws Exception;

    public List<Long> listMerchantIdsByMasterOrgId(String var1, String var2, String var3, Boolean var4) throws Exception;
}

