/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.Condition
 *  com.yonyou.iuap.yms.param.condtition.query.QueryCondition
 *  com.yonyou.iuap.yms.type.MergeResultType
 *  com.yonyoucloud.upc.base.tenant.TenantPO
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.param.Condition;
import com.yonyou.iuap.yms.param.condtition.query.QueryCondition;
import com.yonyou.iuap.yms.type.MergeResultType;
import com.yonyoucloud.upc.base.tenant.TenantPO;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UPCTenantService {
    @Autowired
    private IYmsJdbcApi ymsJdbcApi;

    public MergeResultType saveTenant(TenantPO tenantPO) throws Exception {
        if (null != tenantPO) {
            ArrayList<TenantPO> tenantPOList = new ArrayList<TenantPO>();
            tenantPO.set_status(Integer.valueOf(2));
            tenantPOList.add(tenantPO);
            return this.ymsJdbcApi.save(tenantPOList);
        }
        return null;
    }

    public TenantPO queryById(String yTenantId) throws Exception {
        QueryCondition condition;
        List tenantList;
        if (StringUtils.isNotEmpty((CharSequence)yTenantId) && ObjectUtils.isNotEmpty((Object)(tenantList = this.ymsJdbcApi.queryByClause((Condition)(condition = (QueryCondition)new QueryCondition((Object)new TenantPO()).eq((Object)"alias", (Object)yTenantId)))))) {
            return tenantList.get(0) != null ? (TenantPO)tenantList.get(0) : null;
        }
        return null;
    }

    public Boolean existTenant(String yTenantId) throws Exception {
        TenantPO tenant = this.queryById(yTenantId);
        return tenant != null;
    }
}

