/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.api.businesspartnerdto.BusinessPartnerQryDTO;
import com.yonyoucloud.iuap.upc.dto.BusinessPartnerDTO;
import com.yonyoucloud.iuap.upc.dto.BusinessPartnerInfoQryDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerComparisonDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerComparisonSaveDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerMerchantComparisonDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerMerchantComparisonQryDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerVendorComparisonDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerVendorComparisonQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IBusinessPartnerServiceV2 {
    public PartnerMerchantComparisonDTO saveMerchantComparison(PartnerMerchantComparisonQryDTO var1) throws Exception;

    public Boolean delMerchantComparison(PartnerMerchantComparisonQryDTO var1) throws Exception;

    public PartnerVendorComparisonDTO saveVendorComparison(PartnerVendorComparisonQryDTO var1) throws Exception;

    public Boolean delVendorComparison(PartnerVendorComparisonQryDTO var1) throws Exception;

    public Boolean existsMerToPartnerSyncRule() throws Exception;

    public UPCResultList merchantToPartnerV2(Long var1, String var2) throws Exception;

    public UPCResultList vendorToPartnerV2(Long var1, String var2) throws Exception;

    public Boolean merCanToPartner(Long var1, String var2, String var3, String var4) throws Exception;

    public Boolean venCanToPartner(Long var1, String var2, String var3) throws Exception;

    public BusinessPartnerDTO getPartnerIdByNameOrCreditCode(BusinessPartnerInfoQryDTO var1) throws Exception;

    public Boolean capitalCanToPartner(Boolean var1, String var2) throws Exception;

    public UPCResultList capitalToPartnerV2(BusinessPartnerDTO var1) throws Exception;

    public PartnerComparisonDTO saveCapitalComparison(PartnerComparisonSaveDTO var1) throws Exception;

    public Boolean delCapitalComparison(PartnerComparisonSaveDTO var1) throws Exception;

    public BusinessPartnerDTO saveBusinessPartner(BusinessPartnerDTO var1) throws Exception;

    public void updateBusinessPartner(BusinessPartnerDTO var1) throws Exception;

    public UPCPager<BusinessPartnerDTO> queryBusinessPartner(BusinessPartnerQryDTO var1) throws Exception;

    public List<PartnerMerchantComparisonDTO> queryMerchantComparisonByMerchantId(List<Long> var1) throws Exception;

    public List<PartnerVendorComparisonDTO> queryVendorComparisonByVendorId(List<Long> var1) throws Exception;
}

