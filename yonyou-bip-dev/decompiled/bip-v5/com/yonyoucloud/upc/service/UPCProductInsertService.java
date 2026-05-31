/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductInsertService;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class UPCProductInsertService
implements IUPCProductInsertService {
    @Override
    public void CopyDefaultSKULvPriceOfCreator(Map<String, Object> map) throws Exception {
        map.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductInsert.CopyDefaultSKULvPriceOfCreator", map);
    }

    @Override
    public void CopyDefaultSKULvPriceOfApplier(Map<String, Object> map) throws Exception {
        map.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductInsert.CopyDefaultSKULvPriceOfApplier", map);
    }
}

