/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.unit.UnitGroupIPassQueryRequest
 *  com.yonyoucloud.iuap.ipass.unit.UnitGroupIPassSaveRequest
 *  com.yonyoucloud.iuap.ipass.unit.UnitIPassSaveRequest
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.iuap.ipass.service.unit;

import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.unit.UnitGroupIPassQueryRequest;
import com.yonyoucloud.iuap.ipass.unit.UnitGroupIPassSaveRequest;
import com.yonyoucloud.iuap.ipass.unit.UnitIPassSaveRequest;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface UnitIPassService {
    public CoreDocJsonResultForOpenApi doUnitGroupQuery(UnitGroupIPassQueryRequest var1);

    public CoreDocJsonResultForOpenApi doUnitGroupBatchSaveOrUpdate(List<UnitGroupIPassSaveRequest> var1);

    public CoreDocJsonResultForOpenApi doUnitBatchSaveOrUpdate(List<UnitIPassSaveRequest> var1);
}

