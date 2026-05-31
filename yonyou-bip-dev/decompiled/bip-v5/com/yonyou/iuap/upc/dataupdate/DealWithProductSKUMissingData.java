/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  org.springframework.stereotype.Service
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import org.springframework.stereotype.Service;

@Service
public class DealWithProductSKUMissingData
extends DataUpdateBaseServcie {
    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.restoreDefaultSkuMissing();
    }

    private int restoreDefaultSkuMissing() {
        return 0;
    }

    @Override
    public String getTaskName() {
        return "\u5904\u7406\u7f3a\u5c11\u7684\u9ed8\u8ba4sku\u6570\u636e";
    }
}

