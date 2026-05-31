/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyoucloud.upc.service.RestoreSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealWithSKUDetailErrorData
extends DataUpdateBaseServcie {
    @Autowired
    RestoreSkuService restoreSkuService;

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        this.restoreSkuService.dealDelData(null);
        return 1;
    }

    @Override
    public String getTaskName() {
        return "\u5220\u9664\u7269\u6599\u4e0d\u5b58\u5728\u7684sku\u76f8\u5173\u6570\u636e";
    }
}

