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
public class CharacterUpdateDataCheck
extends DataUpdateBaseServcie {
    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return 0;
    }

    @Override
    public String getTaskName() {
        return "\u7279\u5f81\u6570\u636e\u9884\u68c0";
    }
}

