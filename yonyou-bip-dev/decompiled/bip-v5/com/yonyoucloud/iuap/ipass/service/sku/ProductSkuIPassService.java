/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.sku.ProductSkuIPassSaveRequest
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.iuap.ipass.service.sku;

import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.sku.ProductSkuIPassSaveRequest;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ProductSkuIPassService {
    public CoreDocJsonResultForOpenApi doProductSkuBatchSaveOrUpdate(List<ProductSkuIPassSaveRequest> var1);
}

