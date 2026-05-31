/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.service;

import java.util.Map;

public interface IProductUpdateOtherDbService {
    public void updateSkuBackStatusOfApplierOtherDb(Map<String, Object> var1) throws Exception;

    public int updateProductSkuInventoryCountOtherDb(Map<String, Object> var1) throws Exception;

    public int updateProductSkuPriceOtherDb(Map<String, Object> var1) throws Exception;

    public void updateTenantInnerUnifiedFieldOtherDb(Map<String, Object> var1) throws Exception;

    public int updateProductSkuInventoryCountByShopIdOtherDb(Map<String, Object> var1) throws Exception;

    public int updateProductSkuInventoryCountByNoShopIdOtherDb(Map<String, Object> var1) throws Exception;

    public void updateProductSpecItemOrder(Map<String, Object> var1) throws Exception;

    public void updateBusinessUnitOtherDb(Map<String, Object> var1) throws Exception;
}

