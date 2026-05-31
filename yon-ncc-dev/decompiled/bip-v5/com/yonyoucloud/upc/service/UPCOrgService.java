/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCOrgService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.stereotype.Service;

@Service
public class UPCOrgService
implements IUPCOrgService {
    @Override
    public Map getCustOrg(Long custId) throws Exception {
        List result = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect("fullname as orgname, customerId.name as customername").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"customerId").eq((Object)custId)})));
        if (result != null && result.size() > 0) {
            return (Map)result.get(0);
        }
        return null;
    }

    @Override
    public Map getOrgCust(Long orgId) throws Exception {
        List result = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect("customerId, customerId.name as customername").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)orgId)})));
        if (result != null && result.size() > 0) {
            return (Map)result.get(0);
        }
        return null;
    }

    @Override
    public Map getCustProducts(Long custId) throws Exception {
        List data = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("productId.code as productcode, customerId.name as custname").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"customerId").eq((Object)custId)})));
        HashMap<String, Object> result = new HashMap<String, Object>();
        if (data != null && data.size() > 0) {
            result.put("exists", true);
            result.put("msg", InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080385", (String)"\u5f53\u524d\u7ec4\u7ec7\u6709\u6743\u9650\u7684\u5546\u54c1[") + data.stream().map(map -> map.get("productcode")).collect(Collectors.toList()).toString() + "]" + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080386", (String)"\u5df2\u4e0e\u5ba2\u6237[") + ((Map)data.get(0)).get("custname") + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080387", (String)"]\u5173\u8054"));
        } else {
            result.put("exists", false);
        }
        return result;
    }

    @Override
    public void updateProductRangeOrgId(Map<String, Object> param) throws Exception {
        param.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductRangeOrgId", param);
    }

    @Override
    public void updateProductRangeCustShopId(Map<String, Object> param) throws Exception {
        param.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.updateProductRangeCustShopId", param);
    }

    @Override
    public void clearProductRangeOrgCustId(Map<String, Object> param) throws Exception {
        param.put("ytenant", AppContext.getYTenantId());
        SqlHelper.update((String)"com.yonyoucloud.upc.product.dao.ProductUpdate.clearProductRangeOrgCustId", param);
    }
}

