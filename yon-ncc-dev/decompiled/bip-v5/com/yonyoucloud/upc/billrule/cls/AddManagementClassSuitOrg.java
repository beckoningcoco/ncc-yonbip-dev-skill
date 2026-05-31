/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.pc.cls.ManagementClassApplyRangeGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 */
package com.yonyoucloud.upc.billrule.cls;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.pc.cls.ManagementClassApplyRangeGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.service.ProductApplyRangeGroupService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

@Component(value="addManagementSuitOrg")
public class AddManagementClassSuitOrg
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(AddManagementClassSuitOrg.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    ProductApplyRangeGroupService productApplyRangeGroupService;
    @Autowired
    GroupService groupService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800137);
        }
        List bills = this.getBills(billContext, paramMap);
        RuleExecuteResult result = new RuleExecuteResult();
        final String applyRangeLockKey = "APPLY_RANGE_MANAGEMENT_CLASS" + AppContext.getTenantId();
        final String lockValue = UUID.randomUUID().toString();
        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

            public void afterCompletion(int status) {
                RedisTool.releaseLock((String)applyRangeLockKey, (String)lockValue);
            }
        });
        for (int i = 0; i < bills.size(); ++i) {
            if (!((BizObject)bills.get(i)).containsKey((Object)"orgIds") || ((BizObject)bills.get(i)).get("orgIds") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800138);
            }
            if (!((BizObject)bills.get(i)).containsKey((Object)"clsId") || ((BizObject)bills.get(i)).get("clsId") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800169);
            }
            List orgIds = (List)((BizObject)bills.get(i)).get("orgIds");
            Long clsId = Long.valueOf((String)((BizObject)bills.get(i)).get("clsId"));
            if (RedisTool.tryGetLock((String)applyRangeLockKey, (String)lockValue, (int)600)) {
                List managementClass = MetaDaoHelper.query((String)"pc.cls.ManagementClass", (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "orgId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)clsId)})));
                if (managementClass == null || managementClass.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800170);
                }
                if (!((Map)managementClass.get(0)).containsKey("orgId") || ((Map)managementClass.get(0)).get("orgId") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800171, new Object[]{((Map)managementClass.get(0)).get("code")});
                }
                String creatorOrgId = ((Map)managementClass.get(0)).get("orgId").toString();
                QuerySchema querySchema = QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)creatorOrgId)}));
                List creatorOrg = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)querySchema, (String)"ucf-org-center");
                if (!this.upcControlRuleService.checkVoucherManageShareOrg("pc.cls.ManagementClass", creatorOrgId).booleanValue()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800172, new Object[]{((Map)managementClass.get(0)).get("code"), ((Map)creatorOrg.get(0)).get("name")});
                }
                List<String> orgRangeShare = this.upcControlRuleService.getOrgRangeShareAllWithoutAutoShare("pc.cls.ManagementClass", creatorOrgId);
                if (null == orgRangeShare || orgRangeShare.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800143, new Object[]{((Map)managementClass.get(0)).get("code"), ((Map)creatorOrg.get(0)).get("name")});
                }
                QueryConditionGroup managementClassRangeGroupCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq((Object)clsId), QueryCondition.name((String)"orgGroupType").eq((Object)"0")});
                QuerySchema managementClassRangeGroupSchema = QuerySchema.create().addSelect("id,orgGroupId,clsId,orgGroupType").addCondition((ConditionExpression)managementClassRangeGroupCondition);
                List originalManagementClassApplyRangeGroupList = MetaDaoHelper.query((String)"pc.cls.ManagementClassApplyRangeGroup", (QuerySchema)managementClassRangeGroupSchema);
                if (null == originalManagementClassApplyRangeGroupList || originalManagementClassApplyRangeGroupList.size() == 0) {
                    return new RuleExecuteResult((Object)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_17E9B0BE054000AD", (String)"\u7269\u6599\u5206\u7c7b\u6570\u636e\u67e5\u8be2\u9519\u8bef\uff01"));
                }
                ManagementClassApplyRangeGroup managementClassApplyRangeGroup = (ManagementClassApplyRangeGroup)JSON.parseObject((String)JSON.toJSONString(originalManagementClassApplyRangeGroupList.get(0)), ManagementClassApplyRangeGroup.class);
                QueryConditionGroup originalManagementClassApplyRangeGroupDetailCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"groupId").eq((Object)managementClassApplyRangeGroup.getOrgGroupId())});
                QuerySchema originalManagementClassApplyRangeGroupDetailSchema = QuerySchema.create().addSelect("id,orgId,groupId,orgType").addCondition((ConditionExpression)originalManagementClassApplyRangeGroupDetailCondition);
                List originalPubOrgGroupDetailMapList = MetaDaoHelper.query((String)"pc.pub_org_group.PubOrgGroupDetail", (QuerySchema)originalManagementClassApplyRangeGroupDetailSchema);
                ArrayList<PubOrgGroupDetail> newPubOrgGroupDetailMapList = new ArrayList<PubOrgGroupDetail>();
                ArrayList<String> oldOrgIds = new ArrayList<String>();
                for (Map originalPubOrgGroupDetailMap : originalPubOrgGroupDetailMapList) {
                    if (originalPubOrgGroupDetailMap.get("orgId") != null) {
                        oldOrgIds.add(originalPubOrgGroupDetailMap.get("orgId").toString());
                    }
                    PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setOrgId(originalPubOrgGroupDetailMap.get("orgId") == null ? null : originalPubOrgGroupDetailMap.get("orgId").toString());
                    pubOrgGroupDetail.setGroupId(originalPubOrgGroupDetailMap.get("groupId") == null ? null : originalPubOrgGroupDetailMap.get("groupId").toString());
                    pubOrgGroupDetail.setOrgType(originalPubOrgGroupDetailMap.get("orgType") == null ? null : originalPubOrgGroupDetailMap.get("orgType").toString());
                    newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
                }
                HashSet<String> orgRangeShareSet = new HashSet<String>(orgRangeShare);
                HashSet orgIdSet = new HashSet(orgIds);
                HashSet orgIdInterSet = new HashSet(orgIds);
                orgIdSet.removeAll(orgRangeShareSet);
                orgIdInterSet.retainAll(orgRangeShare);
                for (String orgId : orgIdInterSet) {
                    if (oldOrgIds.contains(orgId)) continue;
                    PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setOrgId(orgId);
                    pubOrgGroupDetail.setOrgGroupType("0");
                    pubOrgGroupDetail.setOrgType("1");
                    newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
                }
                PubOrgGroup pubOrgGroup = new PubOrgGroup();
                pubOrgGroup.setOrgGroupType("0");
                pubOrgGroup.setOrgGroupDetailList(newPubOrgGroupDetailMapList);
                String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
                managementClassApplyRangeGroup.setOrgGroupId(groupId);
                managementClassApplyRangeGroup.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"pc.cls.ManagementClassApplyRangeGroup", (BizObject)managementClassApplyRangeGroup);
                ManagementClass managementClass1 = new ManagementClass();
                managementClass1.setId((Object)clsId);
                managementClass1.setOrgGroupId(groupId);
                managementClass1.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"pc.cls.ManagementClass", (BizObject)managementClass1);
                if (orgIdSet.isEmpty()) continue;
                List notExists = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgIdSet)})), (String)"ucf-org-center");
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800173, new Object[]{((Map)managementClass.get(0)).get("code"), ((Map)creatorOrg.get(0)).get("name"), notExists.stream().map(map -> map.get("name").toString()).collect(Collectors.toList())});
            }
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR);
        }
        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

            public void afterCompletion(int status) {
                RedisTool.releaseLock((String)applyRangeLockKey, (String)lockValue);
            }
        });
        return result;
    }
}

