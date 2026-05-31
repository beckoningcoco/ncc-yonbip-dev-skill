/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.brand.BrandIPassListRequest
 *  com.yonyoucloud.iuap.ipass.brand.BrandIPassSaveRequest
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.iuap.ipass.service.brand;

import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.brand.BrandIPassListRequest;
import com.yonyoucloud.iuap.ipass.brand.BrandIPassSaveRequest;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface BrandIPassService {
    public CoreDocJsonResultForOpenApi doBrandQuery(BrandIPassListRequest var1);

    public CoreDocJsonResultForOpenApi doBrandBatchSaveOrUpdate(List<BrandIPassSaveRequest> var1);
}

