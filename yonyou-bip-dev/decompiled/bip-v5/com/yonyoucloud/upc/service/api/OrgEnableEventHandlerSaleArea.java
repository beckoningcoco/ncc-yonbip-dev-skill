/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.aa.salearea.SaleAreaApplyRange
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IOrgEnableEventHandler;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.salearea.SaleAreaApplyRange;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;

public class OrgEnableEventHandlerSaleArea
implements IOrgEnableEventHandler {
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;

    @Override
    public void Handle(String orgId) throws Exception {
        List<String> orgIds = this.iupcControlRuleService.getVoucherManageShareParentOrgs("aa.salearea.SaleArea", orgId);
        if (orgIds.isEmpty()) {
            return;
        }
        List<String> saleAreaIds = this.iupcControlRuleService.getSelfCreateVoucherByCreateOrg("aa.salearea.SaleArea", orgIds);
        if (saleAreaIds.isEmpty()) {
            return;
        }
        List rangesInDb = MetaDaoHelper.query((String)"aa.salearea.SaleAreaApplyRange", (QuerySchema)QuerySchema.create().addSelect("saleArea").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId), QueryCondition.name((String)"saleArea").in(saleAreaIds)})));
        if (!rangesInDb.isEmpty()) {
            List merchantExists = rangesInDb.stream().map(map -> map.get("saleArea").toString()).collect(Collectors.toList());
            saleAreaIds.removeAll(merchantExists);
        }
        if (saleAreaIds.isEmpty()) {
            return;
        }
        List list = MetaDaoHelper.query((String)"aa.salearea.SaleAreaApplyRange", (QuerySchema)QuerySchema.create().addSelect("saleArea, isEnd").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in(orgIds), QueryCondition.name((String)"saleArea").in(saleAreaIds)})));
        ArrayList<SaleAreaApplyRange> ranges = new ArrayList<SaleAreaApplyRange>();
        for (Map map2 : list) {
            SaleAreaApplyRange range = new SaleAreaApplyRange();
            range.setId((Object)IdManager.getInstance().nextId());
            range.put("saleArea", map2.get("saleArea"));
            range.setOrgId(orgId);
            range.setIsCreator(Boolean.valueOf(false));
            range.setIsApplied(Boolean.valueOf(false));
            range.put("isEnd", map2.get("isEnd"));
            range.setTenant((Long)AppContext.getCurrentUser().getTenant());
            range.setEntityStatus(EntityStatus.Insert);
            ranges.add(range);
        }
        if (!ranges.isEmpty()) {
            MetaDaoHelper.insert((String)"aa.salearea.SaleAreaApplyRange", ranges);
        }
    }
}

