/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.ContactCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.CustomerAreaCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantAggregationCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantApplyRangeGroupCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantDetailCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantDetailRecentCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantGroupCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.PrincipalCrmDto;
import java.util.List;
import java.util.Map;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMerchantApplyRangeGroupService {
    public void updateMerchant(MerchantGroupCrmDto var1) throws Exception;

    public void batchUpdateMerchant(List<MerchantGroupCrmDto> var1) throws Exception;

    public void updateMerchantApplyRange(MerchantApplyRangeGroupCrmDto var1) throws Exception;

    public void batchUpdateMerchantApplyRange(List<MerchantApplyRangeGroupCrmDto> var1) throws Exception;

    public void updateMerchantApplyRangeDetail(MerchantDetailCrmDto var1) throws Exception;

    public void batchUpdateMerchantApplyRangeDetail(List<MerchantDetailCrmDto> var1) throws Exception;

    public void insertCustomerArea(CustomerAreaCrmDto var1) throws Exception;

    public void batchInsertCustomerArea(List<CustomerAreaCrmDto> var1) throws Exception;

    public void updateCustomerArea(CustomerAreaCrmDto var1) throws Exception;

    public void batchUpdateCustomerArea(List<CustomerAreaCrmDto> var1) throws Exception;

    public void deleteCustomerArea(CustomerAreaCrmDto var1) throws Exception;

    public void batchDeleteCustomerArea(List<CustomerAreaCrmDto> var1) throws Exception;

    public void insertPrincipal(PrincipalCrmDto var1) throws Exception;

    public void batchInsertPrincipal(List<PrincipalCrmDto> var1) throws Exception;

    public void updatePrincipal(PrincipalCrmDto var1) throws Exception;

    public void batchUpdatePrincipal(List<PrincipalCrmDto> var1) throws Exception;

    public void deletePrincipal(PrincipalCrmDto var1) throws Exception;

    public void batchDeletePrincipal(List<PrincipalCrmDto> var1) throws Exception;

    public void merchantAggregation(MerchantAggregationCrmDto var1, Map<String, List<CustomerAreaCrmDto>> var2, Map<String, List<PrincipalCrmDto>> var3, List<MerchantDetailCrmDto> var4) throws Exception;

    public void merchantAggregation(List<MerchantAggregationCrmDto> var1, Map<String, List<CustomerAreaCrmDto>> var2, Map<String, List<PrincipalCrmDto>> var3, List<MerchantDetailCrmDto> var4) throws Exception;

    public ContactCrmDto insertContact(ContactCrmDto var1) throws Exception;

    public ContactCrmDto updateContact(ContactCrmDto var1) throws Exception;

    public ContactCrmDto deleteContact(ContactCrmDto var1) throws Exception;

    public void batchUpdateMerchantApplyRangeDetailRecentFollow(List<MerchantDetailRecentCrmDto> var1) throws Exception;

    public void updateMerchantApplyRangeDetailRecentFollow(MerchantDetailRecentCrmDto var1) throws Exception;

    public void setMerchantIsExistPotential(Long var1) throws Exception;
}

