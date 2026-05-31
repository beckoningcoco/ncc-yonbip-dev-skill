/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.service;

import java.util.Map;

public interface IUPCOrgService {
    public Map getCustOrg(Long var1) throws Exception;

    public Map getOrgCust(Long var1) throws Exception;

    public Map getCustProducts(Long var1) throws Exception;

    public void updateProductRangeOrgId(Map<String, Object> var1) throws Exception;

    public void updateProductRangeCustShopId(Map<String, Object> var1) throws Exception;

    public void clearProductRangeOrgCustId(Map<String, Object> var1) throws Exception;
}

