/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyoucloud.upc.pc.product.Product
 */
package com.yonyoucloud.iuap.upc.api.service;

import com.yonyoucloud.upc.pc.product.Product;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface IUPCProductQueryService {
    public byte[] CheckRegistedInfos() throws Exception;

    public Map getUMemberCenterAppId() throws Exception;

    public Map GetMallDomain() throws Exception;

    public Map GetMallWxId() throws Exception;

    public List<Map> GetMemberCenterMemberLevel() throws Exception;

    public List<Map> GetPrivilegedAndNextOrgs() throws Exception;

    public List<Map> GetPrivilegedAndNextOrgIds() throws Exception;

    public List<Map> GetPrivilegedAndNextCustomers() throws Exception;

    public List<Map> GetPrivilegedAndNextCustomerIds() throws Exception;

    public Map<String, Object> GetOrgCustIdByShopId(Long var1) throws Exception;

    public List<Map<String, Object>> GetOrgCustIdByShopIds(List<Long> var1) throws Exception;

    public Map<String, Object> GetOrgShopIdByCustId(Long var1) throws Exception;

    public List<Map<String, Object>> GetOrgShopIdByCustIds(List<Long> var1) throws Exception;

    public Map<String, Object> SetParams(Long var1, Long var2, String var3, Long var4, Long var5) throws Exception;

    public List<Map> getSKUSaled(List<Map<String, Object>> var1) throws Exception;

    public List<Map> getAssistUnitRate(List<Map> var1) throws Exception;

    public List<Map> getAssistUnitRateByOrg(List<Map> var1) throws Exception;

    public Boolean checkCanModifyProductStopStatusOfApplier(String var1, Boolean var2) throws Exception;

    public Boolean getAppliedControlledByCreator() throws Exception;

    public Boolean checkCouponProduct(Long var1, Long var2) throws Exception;

    public Map getProductInfoBySKUId(String var1, String var2) throws Exception;

    public Object getSystemOption(Object var1, String var2) throws Exception;

    public List<Map> getProductApplyRange(List<Long> var1) throws Exception;

    public List getSpecByProductid(String var1) throws Exception;

    public List<Map> getSpecFrees(List<Long> var1) throws Exception;

    public Map getCrossDomainFieldValue(Object var1, String var2, String var3, String var4) throws Exception;

    public List<Map> getCrossDomainFieldValues(Set<Object> var1, String var2, String var3, String ... var4) throws Exception;

    public List<String> getCrossDomainIdsByMasterOrg(List<String> var1, String var2, String var3, String var4) throws Exception;

    public void setOrgs4U8c(Product var1, Boolean var2) throws Exception;

    public Map<String, Object> getProductMultiLangFields(Map<String, Object> var1) throws Exception;

    public List<Map> getProductDetailByOrg(List<Map> var1) throws Exception;

    public List<String> getCouponId(Long var1) throws Exception;

    public List<Map> getProductApplyRangeByProductAndOrgId(Long var1, String var2) throws Exception;
}

