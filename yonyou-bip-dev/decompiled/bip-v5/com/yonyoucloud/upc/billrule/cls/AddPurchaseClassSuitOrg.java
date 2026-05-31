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
 *  com.yonyoucloud.upc.pc.cls.PurchaseClassApplyRangeGroup
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
import com.yonyoucloud.upc.pc.cls.PurchaseClassApplyRangeGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
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

@Component(value="addPurchaseClassSuitOrg")
public class AddPurchaseClassSuitOrg
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(AddPurchaseClassSuitOrg.class);
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    GroupService groupService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800137);
        }
        List bills = this.getBills(billContext, paramMap);
        RuleExecuteResult result = new RuleExecuteResult();
        final String applyRangeLockKey = "APPLY_RANGE_PURCHASE_CLASS" + AppContext.getTenantId();
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
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800139);
            }
            List orgIds = (List)((BizObject)bills.get(i)).get("orgIds");
            Long clsId = Long.valueOf((String)((BizObject)bills.get(i)).get("clsId"));
            if (RedisTool.tryGetLock((String)applyRangeLockKey, (String)lockValue, (int)600)) {
                PubOrgGroupDetail pubOrgGroupDetail;
                List purchaseClass = MetaDaoHelper.query((String)"pc.cls.PurchaseClass", (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "orgId"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)clsId)})));
                if (purchaseClass == null || purchaseClass.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800140);
                }
                if (!((Map)purchaseClass.get(0)).containsKey("orgId") || ((Map)purchaseClass.get(0)).get("orgId") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800141, new Object[]{((Map)purchaseClass.get(0)).get("code")});
                }
                String creatorOrgId = ((Map)purchaseClass.get(0)).get("orgId").toString();
                QuerySchema querySchema = QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)creatorOrgId)}));
                List creatorOrg = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)querySchema, (String)"ucf-org-center");
                if (!this.upcControlRuleService.checkVoucherManageShareOrg("pc.cls.PurchaseClass", creatorOrgId).booleanValue()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800142, new Object[]{((Map)purchaseClass.get(0)).get("code"), ((Map)creatorOrg.get(0)).get("name")});
                }
                List<String> orgRangeShare = this.upcControlRuleService.getOrgRangeShareAllWithoutAutoShare("pc.cls.PurchaseClass", creatorOrgId);
                if (null == orgRangeShare || orgRangeShare.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800143, new Object[]{((Map)purchaseClass.get(0)).get("code"), ((Map)creatorOrg.get(0)).get("name")});
                }
                QueryConditionGroup purchaseClassRangeGroupCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq((Object)clsId), QueryCondition.name((String)"orgGroupType").eq((Object)"0")});
                QuerySchema purchaseClassRangeGroupSchema = QuerySchema.create().addSelect("id,orgGroupId,clsId,orgGroupType").addCondition((ConditionExpression)purchaseClassRangeGroupCondition);
                List originalPurchaseClassApplyRangeGroupList = MetaDaoHelper.query((String)"pc.cls.PurchaseClassApplyRangeGroup", (QuerySchema)purchaseClassRangeGroupSchema);
                if (null == originalPurchaseClassApplyRangeGroupList || originalPurchaseClassApplyRangeGroupList.size() == 0) {
                    return new RuleExecuteResult((Object)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1979C2740458004D", (String)"\u91c7\u8d2d\u5206\u7c7b\u6570\u636e\u67e5\u8be2\u9519\u8bef\uff01"));
                }
                PurchaseClassApplyRangeGroup purchaseClassApplyRangeGroup = (PurchaseClassApplyRangeGroup)JSON.parseObject((String)JSON.toJSONString(originalPurchaseClassApplyRangeGroupList.get(0)), PurchaseClassApplyRangeGroup.class);
                QueryConditionGroup purchaseGroupCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"groupId").eq((Object)purchaseClassApplyRangeGroup.getOrgGroupId())});
                QuerySchema purchaseGroupSchema = QuerySchema.create().addSelect("id,orgId,groupId,orgType").addCondition((ConditionExpression)purchaseGroupCondition);
                List originalPubOrgGroupDetailMapList = MetaDaoHelper.query((String)"pc.pub_org_group.PubOrgGroupDetail", (QuerySchema)purchaseGroupSchema);
                ArrayList<PubOrgGroupDetail> newPubOrgGroupDetailMapList = new ArrayList<PubOrgGroupDetail>();
                ArrayList<String> oldOrgIds = new ArrayList<String>();
                for (Map originalPubOrgGroupDetailMap : originalPubOrgGroupDetailMapList) {
                    if (originalPubOrgGroupDetailMap.get("orgId") != null) {
                        oldOrgIds.add(originalPubOrgGroupDetailMap.get("orgId").toString());
                    }
                    pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setOrgId(originalPubOrgGroupDetailMap.get("orgId") == null ? null : originalPubOrgGroupDetailMap.get("orgId").toString());
                    pubOrgGroupDetail.setGroupId(originalPubOrgGroupDetailMap.get("groupId") == null ? null : originalPubOrgGroupDetailMap.get("groupId").toString());
                    pubOrgGroupDetail.setOrgType(originalPubOrgGroupDetailMap.get("orgType") == null ? null : originalPubOrgGroupDetailMap.get("orgType").toString());
                    newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
                }
                for (String orgId : orgIds) {
                    if (oldOrgIds.contains(orgId)) continue;
                    pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setOrgId(orgId);
                    pubOrgGroupDetail.setOrgGroupType("0");
                    pubOrgGroupDetail.setOrgType("1");
                    newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
                }
                PubOrgGroup pubOrgGroup = new PubOrgGroup();
                pubOrgGroup.setOrgGroupType("0");
                pubOrgGroup.setOrgGroupDetailList(newPubOrgGroupDetailMapList);
                String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
                purchaseClassApplyRangeGroup.setOrgGroupId(groupId);
                purchaseClassApplyRangeGroup.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"pc.cls.PurchaseClassApplyRangeGroup", (BizObject)purchaseClassApplyRangeGroup);
                HashSet<String> orgRangeShareSet = new HashSet<String>(orgRangeShare);
                HashSet orgIdSet = new HashSet(orgIds);
                orgIdSet.removeAll(orgRangeShareSet);
                if (orgIdSet.isEmpty()) continue;
                List notExists = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgIdSet)})), (String)"ucf-org-center");
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800144, new Object[]{((Map)purchaseClass.get(0)).get("code"), ((Map)creatorOrg.get(0)).get("name"), notExists.stream().map(map -> map.get("name").toString()).collect(Collectors.toList())});
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

