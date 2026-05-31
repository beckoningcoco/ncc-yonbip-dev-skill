/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 */
package com.yonyoucloud.iuap.upc.api.service;

import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import java.util.List;
import java.util.Set;

public interface IUPCProductDeleteService {
    public void DeleteSKUDataByRangeId(Object var1, Set<Object> var2) throws Exception;

    public void deleteProductApplyRange(List<ProductApplyRange> var1) throws Exception;
}

