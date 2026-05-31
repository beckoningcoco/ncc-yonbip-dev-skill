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
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.service.IMCUpdateEventHandler;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="pc.mcUpdateEventHandlerCostClass")
public class MCUpdateEventHandlerCostClass
implements IMCUpdateEventHandler {
    private static final Logger log = LoggerFactory.getLogger(MCUpdateEventHandlerCostClass.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;

    @Override
    public void Handle(List<String> orgIds) throws Exception {
        if (orgIds != null && orgIds.size() > 0) {
            ArrayList<CostClassApplyRange> ranges = new ArrayList<CostClassApplyRange>();
            for (String orgId : orgIds) {
                List rangesOfCreator;
                List<String> subOrgs = this.upcControlRuleService.getSubOrgs(orgId);
                if (subOrgs.isEmpty() || (rangesOfCreator = MetaDaoHelper.query((String)"pc.cls.CostClassApplyRange", (QuerySchema)QuerySchema.create().addSelect("clsId, isEnd").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId), QueryCondition.name((String)"isCreator").eq((Object)true)})))).isEmpty()) continue;
                List clsIds = rangesOfCreator.stream().map(map -> map.get("clsId").toString()).collect(Collectors.toList());
                List rangesInDB = MetaDaoHelper.query((String)"pc.cls.CostClassApplyRange", (QuerySchema)QuerySchema.create().addSelect("clsId, orgId, id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").in(clsIds)})));
                Map<String, String> rangeMapInDB = null;
                if (!rangesInDB.isEmpty()) {
                    rangeMapInDB = rangesInDB.stream().collect(Collectors.toMap(x -> x.get("clsId").toString() + x.get("orgId").toString(), y -> y.get("id").toString()));
                }
                for (Map map2 : rangesOfCreator) {
                    for (String subOrg : subOrgs) {
                        if (null != rangeMapInDB && rangeMapInDB.containsKey(map2.get("clsId").toString() + subOrg)) continue;
                        CostClassApplyRange range = TreeApplyRangeUtils.getInstance().getCostClassApplyRange(Long.parseLong(map2.get("clsId").toString()), subOrg, Boolean.parseBoolean(map2.get("isEnd").toString()), false);
                        ranges.add(range);
                        if (ranges.size() <= 500) continue;
                        MetaDaoHelper.insert((String)"pc.cls.CostClassApplyRange", ranges);
                        ranges.clear();
                    }
                }
            }
            if (ranges.size() > 0) {
                MetaDaoHelper.insert((String)"pc.cls.CostClassApplyRange", ranges);
            }
        }
    }

    @Override
    public void HandleShareRange(Map shareRangeData) throws Exception {
        for (final Object key : shareRangeData.keySet()) {
            ArrayList<CostClassApplyRange> ranges = new ArrayList<CostClassApplyRange>();
            List beSharedOrgIds = (List)shareRangeData.get(key);
            List<String> clsIds = this.upcControlRuleService.getSelfCreateVoucherByCreateOrg("pc.cls.CostClass", (List<String>)new ArrayList<String>(){
                {
                    this.add(key.toString());
                }
            });
            if (clsIds == null || clsIds.isEmpty()) continue;
            List rangesInDb = MetaDaoHelper.query((String)"pc.cls.CostClassApplyRange", (QuerySchema)QuerySchema.create().addSelect("id as rangeId, clsId clsId, orgId orgId, isEnd isEnd, isCreator isCreator").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").in(clsIds)})));
            log.info("MCUpdateEventHandlerManagementClass HandleShareRange exists range data:{}", (Object)rangesInDb);
            for (String clsId : clsIds) {
                for (String subOrgId : beSharedOrgIds) {
                    List creatorrange;
                    if (!rangesInDb.stream().noneMatch(map -> map.get("clsId").toString().equals(clsId) && map.get("orgId").toString().equals(subOrgId)) || (creatorrange = MetaDaoHelper.query((String)"pc.cls.CostClassApplyRange", (QuerySchema)QuerySchema.create().addSelect("id as rangeId, clsId clsId, orgId orgId, isEnd isEnd, isCreator isCreator").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq((Object)clsId), QueryCondition.name((String)"isCreator").eq((Object)true), QueryCondition.name((String)"orgId").eq((Object)key.toString())})))) == null || creatorrange.size() <= 0) continue;
                    CostClassApplyRange range = TreeApplyRangeUtils.getInstance().getCostClassApplyRange(Long.valueOf(clsId), subOrgId, Boolean.parseBoolean(((Map)creatorrange.get(0)).get("isEnd").toString()), false);
                    ranges.add(range);
                }
            }
            log.info("MCUpdateEventHandlerManagementClass HandleShareRange insert range data:{}", ranges);
            if (ranges.isEmpty()) continue;
            MetaDaoHelper.insert((String)"pc.cls.CostClassApplyRange", ranges);
        }
    }
}

