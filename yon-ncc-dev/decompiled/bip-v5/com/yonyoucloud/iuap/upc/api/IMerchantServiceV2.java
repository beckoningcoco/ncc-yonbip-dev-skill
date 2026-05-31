/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.AddressInfoDTO;
import com.yonyoucloud.iuap.upc.dto.AddressInfoQryDTO;
import com.yonyoucloud.iuap.upc.dto.AgentFinancialDTO;
import com.yonyoucloud.iuap.upc.dto.AgentFinancialQryDTO;
import com.yonyoucloud.iuap.upc.dto.AgentInvoiceQryDTO;
import com.yonyoucloud.iuap.upc.dto.AgentLevelDTO;
import com.yonyoucloud.iuap.upc.dto.AgentLevelQryDTO;
import com.yonyoucloud.iuap.upc.dto.ContactDTO;
import com.yonyoucloud.iuap.upc.dto.ContactQryDTO;
import com.yonyoucloud.iuap.upc.dto.CustomerCategoryDTO;
import com.yonyoucloud.iuap.upc.dto.CustomerCategoryQryDTO;
import com.yonyoucloud.iuap.upc.dto.CustomerTradeDTO;
import com.yonyoucloud.iuap.upc.dto.CustomerTradeQryDTO;
import com.yonyoucloud.iuap.upc.dto.InvoicingCustomersDTO;
import com.yonyoucloud.iuap.upc.dto.InvoicingCustomersQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeDetailDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeDetailErpQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeDetailQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeErpQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantApplyRangeQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantBaseDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantBaseQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantContacterDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantCustomerAreaDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantCustomerAreaQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantInvoiceDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantManagerDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantManagerQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantRoleInfoDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantRoleInfoQryDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantStaffDTO;
import com.yonyoucloud.iuap.upc.dto.MerchantStaffQryDTO;
import com.yonyoucloud.iuap.upc.dto.PrincipalDTO;
import com.yonyoucloud.iuap.upc.dto.PrincipalQryDTO;
import com.yonyoucloud.iuap.upc.dto.SaleAreaDTO;
import com.yonyoucloud.iuap.upc.dto.SaleAreaQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCBillDataDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMerchantServiceV2 {
    public MerchantDTO getMerchantById(Long var1, String[] var2) throws Exception;

    public MerchantDTO getMerchantOrgInfoById(Long var1, String[] var2) throws Exception;

    public MerchantDTO getMerchantByIdAndOrg(Long var1, Long var2, String[] var3) throws Exception;

    public MerchantDTO getMerchantByIdAndOrg(Long var1, String var2, String[] var3) throws Exception;

    public List<MerchantDTO> getMerchantByIds(List<Long> var1, String[] var2) throws Exception;

    public List<MerchantDTO> getMerchantByIdsAndOrg(List<Long> var1, Long var2, String[] var3) throws Exception;

    public List<MerchantDTO> getMerchantByIdsAndOrg(List<Long> var1, String var2, String[] var3) throws Exception;

    public CoreDocJsonResult<MerchantBaseDTO> listMerchantBaseByBaseQryDTO(MerchantBaseQryDTO var1) throws Exception;

    public CoreDocJsonResult<MerchantDTO> listMerchantByQryDTONew(MerchantQryDTO var1) throws Exception;

    public UPCPager listMerchantByPageV2(MerchantQryDTO var1, Integer var2, Integer var3) throws Exception;

    public List<MerchantDTO> listMerchantByQryDTO(MerchantQryDTO var1) throws Exception;

    public List<MerchantInvoiceDTO> listMerchantAgentInvoice(AgentInvoiceQryDTO var1) throws Exception;

    public UPCPager listMerchantAgentInvoiceByPageV2(AgentInvoiceQryDTO var1, Integer var2, Integer var3) throws Exception;

    public List<MerchantInvoiceDTO> listMerchantShopId(Long var1, String[] var2) throws Exception;

    public List<MerchantApplyRangeDTO> listMerchantApplyRange(MerchantApplyRangeQryDTO var1) throws Exception;

    public List<CustomerCategoryDTO> listCustomerCategory(CustomerCategoryQryDTO var1) throws Exception;

    public UPCPager customerCategoryByPageV2(CustomerCategoryQryDTO var1, Integer var2, Integer var3) throws Exception;

    public List<MerchantContacterDTO> listMerchantContacter(List<Long> var1, Boolean var2) throws Exception;

    public UPCPager listMerchantByPageV2(Integer var1, Integer var2, String[] var3) throws Exception;

    public List<AgentFinancialDTO> listMerchantAgentFinancial(List<Long> var1, List<Long> var2, Boolean var3) throws Exception;

    public List<AgentFinancialDTO> listMerchantAgentFinancial(AgentFinancialQryDTO var1) throws Exception;

    public UPCPager listMerchantApplyRangeByPageDTOV2(Integer var1, Integer var2, List<String> var3, String var4) throws Exception;

    public UPCPager listMerchantApplyRangeByPageDTOV2(Integer var1, Integer var2, List<String> var3, String var4, Long var5) throws Exception;

    public UPCPager listMerchantApplyRangeByPageDTOV2(Integer var1, Integer var2, List<String> var3, String var4, Long var5, Boolean var6) throws Exception;

    public UPCPager listMerchantApplyRangeByPageDTOV2(MerchantApplyRangeErpQryDTO var1) throws Exception;

    public UPCPager listMerchantApplyRangeDetailByPageDTOV2(Integer var1, Integer var2, List<String> var3, String var4) throws Exception;

    public UPCPager listMerchantApplyRangeDetailByPageDTOV2(Integer var1, Integer var2, List<String> var3, String var4, Long var5) throws Exception;

    public UPCPager listMerchantApplyRangeDetailByPageDTOV2(Integer var1, Integer var2, List<String> var3, String var4, Long var5, Boolean var6) throws Exception;

    public UPCPager listMerchantApplyRangeDetailByPageDTOV2(MerchantApplyRangeDetailErpQryDTO var1) throws Exception;

    public void writeBackToNcc(UPCBillDataDTO var1) throws Exception;

    public List<InvoicingCustomersDTO> getInvoicingCustomers(Long var1, String var2) throws Exception;

    public List<AddressInfoDTO> listAddressInfoDTO(Long var1, Long var2) throws Exception;

    public Integer getMerchantApplyRangeCount(List<String> var1) throws Exception;

    public List<AddressInfoDTO> getAddressInfoById(List<Long> var1) throws Exception;

    public List<AddressInfoDTO> listAddressInfo(AddressInfoQryDTO var1) throws Exception;

    public UPCPager addressInfoByPageV2(AddressInfoQryDTO var1, Integer var2, Integer var3) throws Exception;

    public List<ContactDTO> listContact(ContactQryDTO var1) throws Exception;

    public UPCPager contactByPageV2(ContactQryDTO var1, Integer var2, Integer var3) throws Exception;

    public Long getStaffMerchantIdByYhtUserId(String var1) throws Exception;

    public List<SaleAreaDTO> listSaleArea(SaleAreaQryDTO var1) throws Exception;

    public UPCPager saleAreaByPageV2(SaleAreaQryDTO var1, Integer var2, Integer var3) throws Exception;

    public List<AgentLevelDTO> listAgentLevel(AgentLevelQryDTO var1) throws Exception;

    public UPCPager agentLevelByPageV2(AgentLevelQryDTO var1, Integer var2, Integer var3) throws Exception;

    public List<CustomerTradeDTO> listCustomerTrade(CustomerTradeQryDTO var1) throws Exception;

    public UPCPager customerTradeByPageV2(CustomerTradeQryDTO var1, Integer var2, Integer var3) throws Exception;

    public UPCPager listMerchantApplyRangeDetailByShopTypeDTOV2(Integer var1, Integer var2, List<String> var3, Long var4, Boolean var5) throws Exception;

    public List<MerchantRoleInfoDTO> getMerchantRoleInfo(MerchantRoleInfoQryDTO var1) throws Exception;

    public List<MerchantStaffDTO> getMerchantStaff(MerchantStaffQryDTO var1) throws Exception;

    public List<MerchantManagerDTO> getMerchantManager(MerchantManagerQryDTO var1) throws Exception;

    public List<MerchantApplyRangeDetailDTO> listMerchantApplyRangeDetail(MerchantApplyRangeDetailQryDTO var1) throws Exception;

    public List<Long> getMerchantIdBysaleAreaId(Long var1, Boolean var2) throws Exception;

    public List<MerchantCustomerAreaDTO> queryMerchantCustomerArea(MerchantCustomerAreaQryDTO var1) throws Exception;

    public List<InvoicingCustomersDTO> getInvoicingCustomers(InvoicingCustomersQryDTO var1) throws Exception;

    public Long getMerchantIdByInternalOrgId(String var1, String var2) throws Exception;

    public List<PrincipalDTO> getPrincipal(PrincipalQryDTO var1) throws Exception;

    public List<AddressInfoDTO> listAddressInfoByMerchantCodeList(List<String> var1, int var2, int var3) throws Exception;

    public List<MerchantDTO> getMerchantCharacter(Long var1, List<String> var2) throws Exception;
}

