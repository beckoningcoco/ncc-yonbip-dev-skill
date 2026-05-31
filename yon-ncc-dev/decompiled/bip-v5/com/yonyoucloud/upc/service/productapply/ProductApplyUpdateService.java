/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.productapply.ProductApply
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service.productapply;

import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.upc.pc.productapply.ProductApply;
import org.springframework.stereotype.Service;

@Service
public class ProductApplyUpdateService {
    public void updateEffectStatus(ProductApply productApply) throws Exception {
        if (null != productApply.getId() && null != productApply.getEffectStatus()) {
            SqlHelper.update((String)"com.yonyoucloud.upc.mapper.productapply.updateEffectStatus", (Object)productApply);
        }
    }
}

