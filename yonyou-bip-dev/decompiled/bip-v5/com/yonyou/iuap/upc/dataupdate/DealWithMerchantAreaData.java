/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import java.time.LocalDateTime;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DealWithMerchantAreaData
extends DataUpdateBaseServcie {
    Logger logger = LoggerFactory.getLogger(DealWithMerchantAreaData.class);

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return this.upgradeMerchantCustomerArea(tenant);
    }

    public int dataUpdateForTenant() throws Exception {
        Tenant tenant = new Tenant();
        tenant.setId(AppContext.getCurrentUser().getTenant());
        tenant.setTenantCenter(AppContext.getCurrentUser().getYTenantId());
        return this.upgradeMerchantCustomerArea(tenant);
    }

    @Override
    public String getTaskName() {
        return "\u66f4\u65b0\u5ba2\u6237\u6863\u6848\u4e3b\u8868\u9500\u552e\u533a\u57df\u5b57\u6bb5";
    }

    private int upgradeMerchantCustomerArea(Tenant tenant) throws Exception {
        int tenantCount = 0;
        HashMap<String, String> tenantIdParamMap = new HashMap<String, String>(4);
        tenantIdParamMap.put("ytenantId", tenant.getTenantCenter());
        Object merchantAreaCount = SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.MerchantDoubleWriteDao.selectMerchantAreaCount", tenantIdParamMap);
        if (merchantAreaCount != null && Integer.parseInt(merchantAreaCount.toString()) > 0) {
            tenantCount = Integer.parseInt(merchantAreaCount.toString());
            SqlHelper.update((String)"com.yonyoucloud.upc.data.MerchantDoubleWriteDao.updateMerchantArea", tenantIdParamMap);
            this.logger.error(String.format("\u79df\u6237\u3010%s\u3011\u66f4\u65b0\u5ba2\u6237\u6863\u6848\u9500\u552e\u533a\u57df\u6570\u636e\u5347\u7ea7\u5b8c\u6210\uff0c\u5171\u8ba1\u5347\u7ea7\u6570\u636e\u3010%d\u3011\u6761\uff0c", tenant.getId().toString(), tenantCount) + LocalDateTime.now());
        }
        return tenantCount;
    }
}

