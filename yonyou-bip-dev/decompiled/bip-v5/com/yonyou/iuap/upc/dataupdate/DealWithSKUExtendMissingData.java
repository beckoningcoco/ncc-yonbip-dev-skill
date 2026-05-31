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
public class DealWithSKUExtendMissingData
extends DataUpdateBaseServcie {
    @Autowired
    RestoreSkuService restoreSkuService;

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.restoreSkuService.dealSkuExtendMissing(null);
    }

    @Override
    public String getTaskName() {
        return "productSKUExtend\u7f3a\u5c11\u6570\u636e";
    }
}

