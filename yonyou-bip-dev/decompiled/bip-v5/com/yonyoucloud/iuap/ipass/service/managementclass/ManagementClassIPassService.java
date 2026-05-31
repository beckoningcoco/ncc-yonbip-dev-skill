/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.managementclass.ManagementClassIPassSaveRequest
 *  com.yonyoucloud.iuap.ipass.managementclass.ManagementClassIPassTreeRequest
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.iuap.ipass.service.managementclass;

import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.managementclass.ManagementClassIPassSaveRequest;
import com.yonyoucloud.iuap.ipass.managementclass.ManagementClassIPassTreeRequest;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ManagementClassIPassService {
    public CoreDocJsonResultForOpenApi doManageClassQuery(ManagementClassIPassTreeRequest var1);

    public CoreDocJsonResultForOpenApi doManagementClassBatchSaveOrUpdate(List<ManagementClassIPassSaveRequest> var1);
}

