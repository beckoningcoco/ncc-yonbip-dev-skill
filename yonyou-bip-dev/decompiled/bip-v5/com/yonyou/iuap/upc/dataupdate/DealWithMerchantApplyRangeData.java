/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.springframework.stereotype.Service
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import java.util.HashMap;
import org.springframework.stereotype.Service;

@Service
public class DealWithMerchantApplyRangeData
extends DataUpdateBaseServcie {
    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return 0;
    }

    @Override
    public String getTaskName() {
        return null;
    }

    public void dealWithIsSalesOrg(String ytenantId, String isNew) throws Exception {
        HashMap<String, String> tenantIdParamMap = new HashMap<String, String>(4);
        tenantIdParamMap.put("ytenantId", ytenantId);
        if ("1".equals(isNew)) {
            SqlHelper.update((String)"com.yonyoucloud.upc.data.MerchantDoubleWriteDao.dealNewWithIsSalesOrg", tenantIdParamMap);
        } else {
            SqlHelper.update((String)"com.yonyoucloud.upc.data.MerchantDoubleWriteDao.dealWithIsSalesOrg", tenantIdParamMap);
        }
    }
}

