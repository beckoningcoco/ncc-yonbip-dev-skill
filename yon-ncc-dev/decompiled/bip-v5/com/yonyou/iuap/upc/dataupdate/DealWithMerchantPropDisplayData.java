/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

@Service
public class DealWithMerchantPropDisplayData
extends DataUpdateBaseServcie {
    private final String DEAL_WITH_DATA_MAPPER = "com.yonyoucloud.upc.data.dealWithData";

    @Override
    @Transactional(rollbackFor={Throwable.class})
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        List templateList = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.dealWithData.selectBillTplGroupId", (Object)tenant.getYTenantId());
        if (!CollectionUtils.isEmpty((Collection)templateList)) {
            for (Map template : templateList) {
                this.updateBillItemBaseTplGroupId(tenant, template);
            }
        }
        return 0;
    }

    @Override
    public String getTaskName() {
        return "\u5ba2\u6237\u5c5e\u6027\u6570\u636e\u663e\u793a\u5f02\u5e38";
    }

    private void updateBillItemBaseTplGroupId(Tenant tenant, Map<String, Object> template) throws Exception {
        if (null != template.get("iBillId") && null != template.get("iTplId") && null != template.get("iBillTplGroupId")) {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("ytenantId", tenant.getYTenantId());
            params.put("billId", template.get("iBillId"));
            params.put("tplId", template.get("iTplId"));
            params.put("tplGroupId", template.get("iBillTplGroupId"));
            SqlHelper.update((String)"com.yonyoucloud.upc.data.dealWithData.updateBillItemBaseTplGroupId", params);
        }
    }
}

