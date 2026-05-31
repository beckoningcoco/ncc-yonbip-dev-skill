/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 *  org.springframework.util.StringUtils
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class DealWithBatchModifyData {
    private static final Logger log = LoggerFactory.getLogger(DealWithBatchModifyData.class);

    public void upgradeMerchantToolbarItem() throws Exception {
        if (StringUtils.hasText((String)AppContext.getCurrentUser().getYTenantId())) {
            HashMap<String, String> params = new HashMap<String, String>();
            params.put("ytenantId", AppContext.getCurrentUser().getYTenantId());
            SqlHelper.update((String)"com.yonyoucloud.upc.data.dealWithData.batchModify.updateMerchantToolbarItem", params);
        }
    }
}

