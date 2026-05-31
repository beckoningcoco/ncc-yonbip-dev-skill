/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyoucloud.upc.pc.product.ProductSKU
 */
package com.yonyoucloud.iuap.upc.api.service;

import com.yonyoucloud.upc.pc.product.ProductSKU;
import java.util.List;
import java.util.Map;

public interface IUPCProductBizService {
    public void generateSKUs(List<Map> var1, String var2, String var3, Long var4, Map<String, Object> var5) throws Exception;

    public void autoGenerateSKUBySpecs(Map<Integer, Map> var1, String var2, String var3, Map<String, Object> var4) throws Exception;

    public boolean checkDefaultSKUisUsed(ProductSKU var1) throws Exception;
}

