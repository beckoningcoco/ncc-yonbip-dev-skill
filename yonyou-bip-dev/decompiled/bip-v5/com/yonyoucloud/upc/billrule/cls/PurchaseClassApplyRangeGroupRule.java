/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.PurchaseClass
 *  com.yonyoucloud.upc.pc.cls.PurchaseClassApplyRangeGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.cls;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.cls.PurchaseClass;
import com.yonyoucloud.upc.pc.cls.PurchaseClassApplyRangeGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="purchaseClassApplyRangeGroupRule")
public class PurchaseClassApplyRangeGroupRule
extends AbstractCommonRule {
    @Autowired
    GroupService groupService;
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private IOrgUnitQueryService orgUnitQueryService;
    @Autowired
    private PubOptionService pubOptionService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || null == billDataDto) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        for (BizObject bill : bills) {
            PurchaseClassApplyRangeGroup purchaseClassApplyRangeGroup;
            PurchaseClass purchaseClass = (PurchaseClass)bill;
            if (null == purchaseClass.get("purchaseClassApplyRanges")) {
                this.dealRangeForApi(purchaseClass);
                continue;
            }
            if (null == purchaseClass.get("purchaseClassApplyRanges")) continue;
            ArrayList<PurchaseClassApplyRangeGroup> purchaseClassApplyRangeGroupList = new ArrayList<PurchaseClassApplyRangeGroup>();
            List purchaseClassApplyRanges = (List)purchaseClass.get("purchaseClassApplyRanges");
            if (purchaseClass.getEntityStatus() == EntityStatus.Insert) {
                PubOrgGroup pubOrgGroup = new PubOrgGroup();
                ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
                for (Map purchaseClassApplyRange : purchaseClassApplyRanges) {
                    PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setOrgGroupType("0");
                    if (purchaseClassApplyRange.get("orgType") != null) {
                        pubOrgGroupDetail.setOrgType(purchaseClassApplyRange.get("orgType").toString());
                    } else {
                        pubOrgGroupDetail.setOrgType("1");
                    }
                    pubOrgGroupDetail.setOrgId(purchaseClassApplyRange.get("orgId") == null ? null : purchaseClassApplyRange.get("orgId").toString());
                    pubOrgGroupDetailList.add(pubOrgGroupDetail);
                }
                pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
                pubOrgGroup.setOrgGroupType("0");
                String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
                purchaseClassApplyRangeGroup = new PurchaseClassApplyRangeGroup();
                purchaseClassApplyRangeGroup.setId((Object)IdManager.getInstance().nextId());
                purchaseClassApplyRangeGroup.setOrgGroupId(groupId);
                purchaseClassApplyRangeGroup.setOrgGroupType(pubOrgGroup.getOrgGroupType());
                purchaseClassApplyRangeGroup.remove("pubts");
                purchaseClassApplyRangeGroup.setEntityStatus(EntityStatus.Insert);
                purchaseClassApplyRangeGroupList.add(purchaseClassApplyRangeGroup);
            } else {
                QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq(purchaseClass.getId()), QueryCondition.name((String)"orgGroupType").eq((Object)"0")});
                QuerySchema schema = QuerySchema.create().addSelect("id,orgGroupId,clsId,orgGroupType").addCondition((ConditionExpression)condition);
                List rangeGroupList = MetaDaoHelper.query((String)"pc.cls.PurchaseClassApplyRangeGroup", (QuerySchema)schema);
                if (CollectionUtils.isEmpty((Collection)rangeGroupList)) {
                    return new RuleExecuteResult();
                }
                purchaseClassApplyRangeGroup = (PurchaseClassApplyRangeGroup)JSON.parseObject((String)JSON.toJSONString(rangeGroupList.get(0)), PurchaseClassApplyRangeGroup.class);
                QueryConditionGroup rangeGroupDetailCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"groupId").eq((Object)purchaseClassApplyRangeGroup.getOrgGroupId())});
                QuerySchema applyRangeGroupDetailSchema = QuerySchema.create().addSelect("id,orgId,groupId,orgType").addCondition((ConditionExpression)rangeGroupDetailCondition);
                List originalPubOrgGroupDetailMapList = MetaDaoHelper.query((String)"pc.pub_org_group.PubOrgGroupDetail", (QuerySchema)applyRangeGroupDetailSchema);
                List<Object> newPubOrgGroupDetailMapList = new ArrayList();
                for (Map map2 : originalPubOrgGroupDetailMapList) {
                    PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setId(map2.get("id"));
                    pubOrgGroupDetail.setOrgId(map2.get("orgId") == null ? null : map2.get("orgId").toString());
                    pubOrgGroupDetail.setGroupId(map2.get("groupId") == null ? null : map2.get("groupId").toString());
                    pubOrgGroupDetail.setOrgType(map2.get("orgType") == null ? null : map2.get("orgType").toString());
                    newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
                }
                for (Map map3 : purchaseClassApplyRanges) {
                    PubOrgGroupDetail pubOrgGroupDetail;
                    EntityStatus entityStatus = null;
                    if (map3.containsKey("_status")) {
                        Object v = map3.get("_status");
                        entityStatus = v instanceof String ? EntityStatus.getEntityStatus((String)String.valueOf(v)) : (EntityStatus)v;
                    }
                    if (entityStatus == EntityStatus.Insert) {
                        pubOrgGroupDetail = new PubOrgGroupDetail();
                        pubOrgGroupDetail.setOrgId(map3.get("orgId") == null ? null : map3.get("orgId").toString());
                        pubOrgGroupDetail.setOrgGroupType("0");
                        pubOrgGroupDetail.setOrgType("1");
                        newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
                        continue;
                    }
                    if (entityStatus == EntityStatus.Update) {
                        if (map3.get("id") != null) {
                            newPubOrgGroupDetailMapList = newPubOrgGroupDetailMapList.stream().filter(b -> !purchaseClassApplyRange.get("id").equals(b.get("id"))).collect(Collectors.toList());
                        }
                        pubOrgGroupDetail = new PubOrgGroupDetail();
                        pubOrgGroupDetail.setOrgId(map3.get("orgId") != null ? map3.get("orgId").toString() : null);
                        pubOrgGroupDetail.setOrgGroupType("0");
                        pubOrgGroupDetail.setOrgType("1");
                        newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
                        continue;
                    }
                    if (entityStatus != EntityStatus.Delete) continue;
                    newPubOrgGroupDetailMapList = newPubOrgGroupDetailMapList.stream().filter(b -> !b.get("orgId").equals(purchaseClassApplyRange.get("orgId"))).collect(Collectors.toList());
                }
                for (PubOrgGroupDetail pubOrgGroupDetail : newPubOrgGroupDetailMapList) {
                    pubOrgGroupDetail.remove("id");
                }
                PubOrgGroup pubOrgGroup = new PubOrgGroup();
                pubOrgGroup.setOrgGroupType("0");
                pubOrgGroup.setOrgGroupDetailList(newPubOrgGroupDetailMapList);
                String string = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
                purchaseClassApplyRangeGroup.setOrgGroupId(string);
                purchaseClassApplyRangeGroup.setEntityStatus(EntityStatus.Update);
                purchaseClassApplyRangeGroupList.add(purchaseClassApplyRangeGroup);
            }
            purchaseClass.set("purchaseClassApplyRanges", purchaseClassApplyRangeGroupList);
        }
        return new RuleExecuteResult();
    }

    private void dealRangeForApi(PurchaseClass purchaseClass) throws Exception {
        if (EntityStatus.Update == purchaseClass.getEntityStatus()) {
            if (purchaseClass.containsKey((Object)"orgId")) {
                purchaseClass.remove("orgId");
            }
            return;
        }
        if (EntityStatus.Insert == purchaseClass.getEntityStatus()) {
            if (StringUtils.isEmpty((CharSequence)purchaseClass.getOrgId())) {
                purchaseClass.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, purchaseClass.getOrgId()));
            }
            ArrayList<PurchaseClassApplyRangeGroup> purchaseClassApplyRanges = new ArrayList<PurchaseClassApplyRangeGroup>();
            Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
            PubOrgGroup pubOrgGroup = new PubOrgGroup();
            HashSet<String> orgsSet = new HashSet<String>();
            ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
            if (singleOrg.booleanValue()) {
                purchaseClass.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, purchaseClass.getOrgId()));
                PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                pubOrgGroupDetail.setOrgType("1");
                pubOrgGroupDetail.setOrgGroupType("0");
                pubOrgGroupDetail.setOrgId(purchaseClass.getOrgId());
                pubOrgGroupDetailList.add(pubOrgGroupDetail);
            } else {
                List<Map> orgMaps = TreeApplyRangeUtils.getInstance().getOrgAndRangeOrg(this.iupcControlRuleService, singleOrg, purchaseClass.getOrgId(), "pc.cls.PurchaseClass");
                if (!CollectionUtils.isEmpty(orgMaps)) {
                    for (Map orgMap : orgMaps) {
                        PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                        if (orgMap.get("externalorg") != null) {
                            if ((Integer)orgMap.get("externalorg") == 0) {
                                pubOrgGroupDetail.setOrgType("1");
                            } else if ((Integer)orgMap.get("externalorg") == 1) {
                                pubOrgGroupDetail.setOrgType("3");
                            }
                        } else {
                            pubOrgGroupDetail.setOrgType("1");
                        }
                        pubOrgGroupDetail.setOrgId(orgMap.get("id").toString());
                        orgsSet.add(pubOrgGroupDetail.getOrgId());
                        pubOrgGroupDetail.setOrgGroupType("0");
                        pubOrgGroupDetailList.add(pubOrgGroupDetail);
                    }
                }
            }
            pubOrgGroup.setOrgGroupType("0");
            pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
            String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
            PurchaseClassApplyRangeGroup purchaseClassApplyRangeGroup = new PurchaseClassApplyRangeGroup();
            purchaseClassApplyRangeGroup.setOrgGroupId(groupId);
            purchaseClassApplyRangeGroup.setId((Object)IdManager.getInstance().nextId());
            purchaseClassApplyRangeGroup.setOrgGroupType(pubOrgGroup.getOrgGroupType());
            purchaseClassApplyRangeGroup.remove("pubts");
            purchaseClassApplyRangeGroup.setEntityStatus(EntityStatus.Insert);
            purchaseClassApplyRanges.add(purchaseClassApplyRangeGroup);
            purchaseClass.put("purchaseClassApplyRanges", purchaseClassApplyRanges);
        }
    }
}

