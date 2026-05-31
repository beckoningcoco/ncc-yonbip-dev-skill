/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.cls.ManagementClassApplyRange
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
import com.yonyoucloud.upc.pc.cls.ManagementClassApplyRange;
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

public class OrgEnableEventHandlerManageClass
implements IOrgEnableEventHandler {
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;

    @Override
    public void Handle(String orgId) throws Exception {
        List<String> orgIds = this.iupcControlRuleService.getVoucherManageShareParentOrgs("pc.cls.ManagementClass", orgId);
        if (orgIds.isEmpty()) {
            return;
        }
        List<String> clsIds = this.iupcControlRuleService.getSelfCreateVoucherByCreateOrg("pc.cls.ManagementClass", orgIds);
        if (clsIds.isEmpty()) {
            return;
        }
        List rangesInDb = MetaDaoHelper.query((String)"pc.cls.ManagementClassApplyRangeGroup", (QuerySchema)QuerySchema.create().addSelect("clsId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId), QueryCondition.name((String)"clsId").in(clsIds)})));
        if (!rangesInDb.isEmpty()) {
            List merchantExists = rangesInDb.stream().map(map -> map.get("clsId").toString()).collect(Collectors.toList());
            clsIds.removeAll(merchantExists);
        }
        if (!clsIds.isEmpty()) {
            List list = MetaDaoHelper.query((String)"pc.cls.ManagementClassApplyRangeGroup", (QuerySchema)QuerySchema.create().addSelect("clsId, isEnd").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in(orgIds), QueryCondition.name((String)"clsId").in(clsIds)})));
            ArrayList<ManagementClassApplyRange> ranges = new ArrayList<ManagementClassApplyRange>();
            for (Map map2 : list) {
                ManagementClassApplyRange range = new ManagementClassApplyRange();
                range.setId((Object)IdManager.getInstance().nextId());
                range.put("clsId", map2.get("clsId"));
                range.setOrgId(orgId);
                range.setIsCreator(Boolean.valueOf(false));
                range.setIsApplied(Boolean.valueOf(false));
                range.put("isEnd", map2.get("isEnd"));
                range.setTenant((Long)AppContext.getCurrentUser().getTenant());
                range.setEntityStatus(EntityStatus.Insert);
                ranges.add(range);
                if (ranges.size() <= 500) continue;
                MetaDaoHelper.insert((String)"pc.cls.ManagementClassApplyRangeGroup", ranges);
                ranges.clear();
            }
            if (ranges.size() > 0) {
                MetaDaoHelper.insert((String)"pc.cls.ManagementClassApplyRangeGroup", ranges);
            }
        }
    }
}

