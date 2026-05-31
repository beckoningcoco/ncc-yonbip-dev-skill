/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyoucloud.iuap.upc.api.service.IMCUpdateEventHandler;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
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
import org.springframework.util.CollectionUtils;

@Component(value="pc.mcUpdateEventHandlerPurchaseClass")
public class MCUpdateEventHandlerPurchaseClass
implements IMCUpdateEventHandler {
    private static final Logger log = LoggerFactory.getLogger(MCUpdateEventHandlerPurchaseClass.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    GroupService groupService;

    @Override
    public void Handle(List<String> orgIds) throws Exception {
        if (orgIds != null && orgIds.size() > 0) {
            for (String orgId : orgIds) {
                List clsIdsMap;
                List<Long> clsIds;
                List<String> subOrgs = this.upcControlRuleService.getSubOrgs(orgId);
                if (!subOrgs.contains(orgId)) {
                    subOrgs.add(orgId);
                }
                if (null == subOrgs || subOrgs.isEmpty() || CollectionUtils.isEmpty(clsIds = (clsIdsMap = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId)})))).stream().map(map -> Long.valueOf(map.get("id").toString())).collect(Collectors.toList()))) continue;
                List<Map> rangesInDb = this.findAllRangesInDb(clsIds);
                for (Long clsId : clsIds) {
                    List<String> rangesOfCls = this.dealRangesOfCls(rangesInDb, clsId);
                    for (String subOrg : subOrgs) {
                        if (rangesOfCls.contains(subOrg)) continue;
                        rangesOfCls.add(subOrg);
                    }
                    this.dealFinalRangesOfCls(rangesOfCls, clsId);
                }
            }
        }
    }

    @Override
    public void HandleShareRange(Map shareRangeData) throws Exception {
        for (final Object key : shareRangeData.keySet()) {
            List beSharedOrgIds = (List)shareRangeData.get(key);
            List<String> clsIds = this.upcControlRuleService.getSelfCreateVoucherByCreateOrg("pc.cls.PurchaseClass", (List<String>)new ArrayList<String>(){
                {
                    this.add(key.toString());
                }
            });
            ArrayList<Long> clsIdList = new ArrayList<Long>();
            if (CollectionUtils.isEmpty(clsIds)) continue;
            for (String clsId : clsIds) {
                clsIdList.add(Long.valueOf(clsId));
            }
            List<Map> rangesInDb = this.findAllRangesInDb(clsIdList);
            for (Long clsId : clsIdList) {
                List<String> rangesOfCls = this.dealRangesOfCls(rangesInDb, clsId);
                for (String subOrgId : beSharedOrgIds) {
                    if (rangesOfCls.contains(subOrgId)) continue;
                    rangesOfCls.add(subOrgId);
                }
                this.dealFinalRangesOfCls(rangesOfCls, clsId);
            }
        }
    }

    private List<Map> findAllRangesInDb(List<Long> clsIds) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id as rangeId,orgGroupId.orgGroupDetailList.orgId as orgId, clsId as clsId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").in(clsIds)}));
        return MetaDaoHelper.query((String)"pc.cls.PurchaseClassApplyRangeGroup", (QuerySchema)schema);
    }

    private void dealFinalRangesOfCls(List<String> rangesOfCls, Long clsId) throws Exception {
        Collections.sort(rangesOfCls);
        PubOrgGroup pubOrgGroup = new PubOrgGroup();
        ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
        for (String newOrgId : rangesOfCls) {
            PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
            pubOrgGroupDetail.setOrgId(newOrgId);
            pubOrgGroupDetail.setOrgGroupType("0");
            pubOrgGroupDetail.setOrgType("1");
            pubOrgGroupDetailList.add(pubOrgGroupDetail);
        }
        pubOrgGroup.setOrgGroupType("0");
        pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
        String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("ytenantid", AppContext.getYTenantId());
        params.put("groupId", groupId);
        params.put("clsId", clsId);
        SqlHelper.update((String)"com.yonyoucloud.upc.bill.dao.productcls.updateGroupIdByPurchaseIdAndTenantId", params);
    }

    private List<String> dealRangesOfCls(List<Map> rangesInDb, Long clsId) {
        ArrayList<String> rangeList = new ArrayList<String>();
        for (Map range : rangesInDb) {
            if (null == range.get("clsId") || !range.get("clsId").toString().equals(clsId.toString()) || null == range.get("orgId")) continue;
            rangeList.add(range.get("orgId").toString());
        }
        return rangeList;
    }
}

