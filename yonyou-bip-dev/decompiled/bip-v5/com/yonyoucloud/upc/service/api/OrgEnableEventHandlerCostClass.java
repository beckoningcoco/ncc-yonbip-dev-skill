/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.pc.cls.CostClassApplyRange
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IOrgEnableEventHandler;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.cls.CostClassApplyRange;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;

public class OrgEnableEventHandlerCostClass
implements IOrgEnableEventHandler {
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;

    @Override
    public void Handle(String orgId) throws Exception {
        List<String> clsIds;
        List<String> orgIds = this.iupcControlRuleService.getVoucherManageShareParentOrgs("pc.cls.CostClass", orgId);
        if (!orgIds.isEmpty() && !(clsIds = this.iupcControlRuleService.getSelfCreateVoucherByCreateOrg("pc.cls.CostClass", orgIds)).isEmpty()) {
            List rangesInDb = MetaDaoHelper.query((String)"pc.cls.CostClassApplyRange", (QuerySchema)QuerySchema.create().addSelect("clsId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId), QueryCondition.name((String)"clsId").in(clsIds)})));
            if (!rangesInDb.isEmpty()) {
                List merchantExists = rangesInDb.stream().map(map -> map.get("clsId").toString()).collect(Collectors.toList());
                clsIds.removeAll(merchantExists);
            }
            if (!clsIds.isEmpty()) {
                List list = MetaDaoHelper.query((String)"pc.cls.CostClassApplyRange", (QuerySchema)QuerySchema.create().addSelect("clsId, isEnd").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in(orgIds), QueryCondition.name((String)"clsId").in(clsIds)})));
                ArrayList<CostClassApplyRange> ranges = new ArrayList<CostClassApplyRange>();
                for (Map map2 : list) {
                    ranges.add(TreeApplyRangeUtils.getInstance().getCostClassApplyRange(Long.parseLong(map2.get("clsId").toString()), orgId, Boolean.parseBoolean(map2.get("isEnd").toString()), false));
                    if (ranges.size() <= 500) continue;
                    MetaDaoHelper.insert((String)"pc.cls.CostClassApplyRange", ranges);
                    ranges.clear();
                }
                if (ranges.size() > 0) {
                    MetaDaoHelper.insert((String)"pc.cls.CostClassApplyRange", ranges);
                }
            }
        }
    }
}

