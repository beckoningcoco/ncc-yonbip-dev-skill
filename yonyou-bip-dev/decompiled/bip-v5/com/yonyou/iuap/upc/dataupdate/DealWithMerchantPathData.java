/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.ucf.mdd.ext.base.tenant.Tenant
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyou.iuap.upc.dataupdate;

import com.yonyou.iuap.upc.dataupdate.DataUpdateBaseServcie;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.ucf.mdd.ext.base.tenant.Tenant;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class DealWithMerchantPathData
extends DataUpdateBaseServcie {
    private static final Logger log = LoggerFactory.getLogger(DealWithMerchantPathData.class);
    @Autowired
    protected IYmsJdbcApi ymsJdbcApi;

    @Override
    public int businessDataUpdate(Tenant tenant, int capacity) throws Exception {
        return 0;
    }

    @Override
    public String getTaskName() {
        return "\u66f4\u65b0\u5ba2\u6237\u6863\u6848path\u5b57\u6bb5";
    }

    public void dealWithMerchantPathDataByMerchantId(Long merchantId) throws Exception {
        Merchant parentCustomer;
        Merchant merchant = this.getParentCustomerById(merchantId);
        StringBuilder path = new StringBuilder(merchantId + "|");
        if (!CollectionUtils.isEmpty((Map)merchant) && merchant.getParentCustomer() == null) {
            merchant.setPath(path.toString());
            merchant.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchant);
        } else if (!CollectionUtils.isEmpty((Map)merchant) && merchant.getParentCustomer() != null && !CollectionUtils.isEmpty((Map)(parentCustomer = this.getParentCustomerById(merchant.getParentCustomer())))) {
            while (!CollectionUtils.isEmpty((Map)parentCustomer) && parentCustomer.getParentCustomer() != null && !path.toString().contains(parentCustomer.getId() + "|")) {
                path.insert(0, parentCustomer.getId() + "|");
                parentCustomer = this.getParentCustomerById(parentCustomer.getParentCustomer());
            }
            if (!path.toString().contains(parentCustomer.getId() + "|")) {
                path.insert(0, parentCustomer.getId() + "|");
                merchant.setPath(path.toString());
                merchant.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchant);
            }
        }
    }

    public void dealWithMerchantPathDataByMerchantId(List<Long> merchantIdList) throws Exception {
        for (Long merchantId : merchantIdList) {
            this.dealWithMerchantPathDataByMerchantId(merchantId);
        }
    }

    public Merchant getParentCustomerById(Long merchantId) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,parentCustomer");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantId)}));
        List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantList)) {
            return (Merchant)merchantList.get(0);
        }
        return null;
    }
}

