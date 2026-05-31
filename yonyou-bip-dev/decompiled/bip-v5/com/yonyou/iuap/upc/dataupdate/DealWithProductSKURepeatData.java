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
import com.yonyoucloud.upc.service.repairsku.RepairSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealWithProductSKURepeatData
extends DataUpdateBaseServcie {
    @Autowired
    RepairSkuService repairSkuService;

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.repairSkuService.dealRepeatSkuByTenantId();
    }

    @Override
    public String getTaskName() {
        return "\u5904\u7406\u89c4\u683c\u7ec4\u5408\u91cd\u590dsku";
    }
}

