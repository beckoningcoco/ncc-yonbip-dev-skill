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
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DealWithMerchantGroupData
extends DataUpdateBaseServcie {
    @Autowired
    private MerchantGroupService merchantGroupService;

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        this.merchantGroupService.compensationMerchantApplyRangeGroup(tenant.getYTenantId(), capacity);
        return 1;
    }

    @Override
    public String getTaskName() {
        return "\u5ba2\u6237\u65b0\u6a21\u578b\u5347\u7ea7\u5f02\u5e38";
    }
}

