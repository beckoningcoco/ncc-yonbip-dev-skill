/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.product.ProductApplyRange
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IOrgEnableEventHandler;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.product.ProductApplyRange;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class OrgEnableEventHandlerProduct
implements IOrgEnableEventHandler {
    private Logger logger = LoggerFactory.getLogger(OrgEnableEventHandlerProduct.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    @Override
    public void Handle(String orgId) throws Exception {
        this.logger.info("OrgEnableEventHandlerProduct receive orgId:", (Object)orgId);
        List<String> orgIds = this.upcControlRuleService.getVoucherManageShareParentOrgs("pc.product.Product", orgId);
        this.logger.info("OrgEnableEventHandlerProduct get parent orgIds:", orgIds);
        if (orgIds.isEmpty()) {
            return;
        }
        List<String> productIds = this.upcControlRuleService.getSelfCreateVoucherByCreateOrg("pc.product.Product", orgIds);
        this.logger.info("OrgEnableEventHandlerProduct get self create productIds:", productIds);
        if (productIds.isEmpty()) {
            return;
        }
        List rangesInDb = MetaDaoHelper.query((String)"pc.product.ProductApplyRange", (QuerySchema)QuerySchema.create().addSelect("productId, orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId)})));
        Map<String, Integer> productRangesMap = null;
        if (!rangesInDb.isEmpty()) {
            productRangesMap = rangesInDb.stream().collect(Collectors.toMap(x -> x.get("productId").toString() + x.get("orgId").toString(), y -> 1));
        }
        ArrayList<ProductApplyRange> ranges = new ArrayList<ProductApplyRange>();
        for (String id : productIds) {
            if (null != productRangesMap && productRangesMap.containsKey(id + orgId)) continue;
            ProductApplyRange range = ProductUtil.buildProductApplyRange(Long.valueOf(id), 1, orgId, null);
            ranges.add(range);
            if (ranges.size() <= 500) continue;
            MetaDaoHelper.insert((String)"pc.product.ProductApplyRange", ranges);
            ranges.clear();
        }
        this.logger.info("OrgEnableEventHandlerProduct insert ranges:", ranges);
        if (ranges.size() > 0) {
            MetaDaoHelper.insert((String)"pc.product.ProductApplyRange", ranges);
        }
    }
}

