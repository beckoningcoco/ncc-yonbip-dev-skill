/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.product.ProductApplyDataSaveRequest
 *  com.yonyoucloud.iuap.ipass.product.ProductIPassQueryRequest
 *  com.yonyoucloud.iuap.ipass.product.ProductSaveRequest
 *  com.yonyoucloud.upc.ipass.vo.material.ProductCharacterSaveRequest
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.iuap.ipass.service.product;

import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.product.ProductApplyDataSaveRequest;
import com.yonyoucloud.iuap.ipass.product.ProductIPassQueryRequest;
import com.yonyoucloud.iuap.ipass.product.ProductSaveRequest;
import com.yonyoucloud.upc.ipass.vo.material.ProductCharacterSaveRequest;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ProductIPassService {
    public CoreDocJsonResultForOpenApi doProductListAndDetailQuery(ProductIPassQueryRequest var1);

    public CoreDocJsonResultForOpenApi doProductBatchSave(List<ProductSaveRequest> var1);

    public CoreDocJsonResultForOpenApi doCharacterProductBatchSave(List<ProductCharacterSaveRequest> var1);

    public CoreDocJsonResultForOpenApi doProductApplyDetailSave(List<ProductApplyDataSaveRequest> var1);
}

