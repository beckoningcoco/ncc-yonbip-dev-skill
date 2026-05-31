/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.schema.SimpleCondition
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.stereotype.Service
 */
package com.yonyoucloud.upc.service;

import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IUPCProductDeleteService;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.schema.SimpleCondition;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UPCProductDeleteService
implements IUPCProductDeleteService {
    private static final Logger log = LoggerFactory.getLogger(UPCProductDeleteService.class);

    @Override
    public void DeleteSKUDataByRangeId(Object productId, Set<Object> rangeIds) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCProductDeleteService.DeleteSKUDataByRangeId\u5b58\u5728\u8c03\u7528");
        if (rangeIds == null || rangeIds.isEmpty()) {
            return;
        }
        ArrayList<SimpleCondition> conditions = new ArrayList<SimpleCondition>();
        conditions.add(new SimpleCondition("productId", ConditionOperator.eq, productId));
        conditions.add(new SimpleCondition("productApplyRangeId", ConditionOperator.in, rangeIds));
        conditions.add(new SimpleCondition("tenant", ConditionOperator.eq, AppContext.getCurrentUser().getTenant()));
        MetaDaoHelper.batchDelete((String)"pc.product.ProductSKUDetail", conditions);
        MetaDaoHelper.batchDelete((String)"pc.product.SKUOrderProperty", conditions);
        MetaDaoHelper.batchDelete((String)"pc.product.ProductSKULvPrice", conditions);
    }

    @Override
    public void deleteProductApplyRange(List<ProductApplyRange> list) throws Exception {
        log.error("com.yonyoucloud.upc.service.UPCProductDeleteService.deleteProductApplyRange\u5b58\u5728\u8c03\u7528");
        if (list == null || list.isEmpty()) {
            return;
        }
        MetaDaoHelper.delete((String)"pc.product.ProductApplyRange", list);
    }
}

