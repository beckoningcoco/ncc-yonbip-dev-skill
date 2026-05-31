/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.service;

import java.util.List;
import java.util.Map;

public interface IUPCProductUpdateService {
    public void UpdateUpDownCountOfCreator(Map<String, Object> var1) throws Exception;

    public void UpdateUpDownCountOfCreatorbyParams(Map<String, Object> var1) throws Exception;

    public void UpdateUpDownCountOfApplier(Map<String, Object> var1) throws Exception;

    public void UpdateUpDownCountOfApplierbyParams(Map<String, Object> var1) throws Exception;

    public void UpdateSKUBackStatusOfCreator(Map<String, Object> var1) throws Exception;

    public void UpdateSKUBackStatusOfApplier(Map<String, Object> var1) throws Exception;

    public void UpdateDefaultSKUId(Map<String, Object> var1) throws Exception;

    public void UpdateMaxMinBatchPriceNew(Map<String, Object> var1) throws Exception;

    public void UpdateSKUOrderPropsSKUIDNew(Map<String, Object> var1) throws Exception;

    public void updateTenantInnerUnifiedField(Map<String, Object> var1) throws Exception;

    public List<Map<String, Object>> SelectSKUBackStatusOfCreator(Map<String, Object> var1) throws Exception;

    public void UpdateApplyRangeDetailStatus(Map<String, Object> var1) throws Exception;

    public void UpdateBusinessUnit(Map<String, Object> var1) throws Exception;

    public void updateProductField(Map<String, Object> var1) throws Exception;

    public void updateProductAuditInfo(Map<String, Object> var1) throws Exception;
}

