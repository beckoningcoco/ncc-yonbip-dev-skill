/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.service.MCSetManageService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.pc.cls.ManagementClassApplyRangeGroup
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
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.cls;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.service.MCSetManageService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.pc.cls.ManagementClassApplyRangeGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.service.ProductClsService;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="managementClsApplyRangeGroupRule")
public class ManagementClsApplyRangeGroupRule
extends AbstractCommonRule {
    @Autowired
    GroupService groupService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private IOrgUnitQueryService orgUnitQueryService;
    @Autowired
    private PubOptionService pubOptionService;
    @Lazy
    @Autowired(required=false)
    private MCSetManageService mcSetManageService;
    @Autowired
    private ProductClsService productClsService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || null == billDataDto) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        for (BizObject bill : bills) {
            Object optionValue;
            ManagementClass managementClass = (ManagementClass)bill;
            this.checkDataForImport(map, managementClass);
            boolean migrationFlag = false;
            if (null != billDataDto.getCustMap()) {
                migrationFlag = BooleanUtil.isTrue(billDataDto.getCustMap().get("FLAG_FROM_MIGRATION"));
            }
            if (null == managementClass.get("managementClassApplyRanges") || migrationFlag) {
                this.dealRangeForApi(managementClass);
                continue;
            }
            if (null == managementClass.get("managementClassApplyRanges")) continue;
            ArrayList<ManagementClassApplyRangeGroup> managementClassApplyRangeGroupList = new ArrayList<ManagementClassApplyRangeGroup>();
            List managementClassApplyRanges = (List)managementClass.get("managementClassApplyRanges");
            ArrayList shopIds = new ArrayList();
            if (managementClass.get("orgId") != null && "666666".equals(managementClass.get("orgId").toString()) && (optionValue = OptionUtils.getOptionByName((String)"u8c-config", (String)"AutomaticallyAssignMerchants", null)) != null && BooleanUtil.isTrue((Object)optionValue)) {
                List orgs = this.orgUnitQueryService.getByCondition((String)AppContext.getYTenantId(), ConditionDTO.newCondition().onlyExternalOrg());
                HashSet<String> orgIdSet = new HashSet<String>();
                if (!CollectionUtils.isEmpty((Collection)orgs)) {
                    for (OrgUnitDTO org : orgs) {
                        orgIdSet.add(org.getId());
                    }
                }
                shopIds.addAll(orgIdSet);
            }
            if (managementClass.getEntityStatus() == EntityStatus.Insert) {
                PubOrgGroupDetail pubOrgGroupDetail;
                HashSet<String> orgsSet = new HashSet<String>();
                PubOrgGroup pubOrgGroup = new PubOrgGroup();
                ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
                for (Map managementClassApplyRange : managementClassApplyRanges) {
                    pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setOrgGroupType("0");
                    if (managementClassApplyRange.get("orgType") != null) {
                        pubOrgGroupDetail.setOrgType(managementClassApplyRange.get("orgType").toString());
                    } else {
                        pubOrgGroupDetail.setOrgType("1");
                    }
                    pubOrgGroupDetail.setOrgId(managementClassApplyRange.get("orgId") == null ? null : managementClassApplyRange.get("orgId").toString());
                    orgsSet.add(pubOrgGroupDetail.getOrgId());
                    pubOrgGroupDetailList.add(pubOrgGroupDetail);
                }
                if (!CollectionUtils.isEmpty(shopIds)) {
                    for (String shopId : shopIds) {
                        if (orgsSet.contains(shopId)) continue;
                        orgsSet.add(shopId);
                        pubOrgGroupDetail = new PubOrgGroupDetail();
                        pubOrgGroupDetail.setOrgGroupType("0");
                        pubOrgGroupDetail.setOrgType("3");
                        pubOrgGroupDetail.setOrgId(shopId == null ? null : shopId);
                        pubOrgGroupDetailList.add(pubOrgGroupDetail);
                    }
                }
                pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
                pubOrgGroup.setOrgGroupType("0");
                String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
                ManagementClassApplyRangeGroup managementClassApplyRangeGroup = new ManagementClassApplyRangeGroup();
                managementClassApplyRangeGroup.setId((Object)IdManager.getInstance().nextId());
                managementClassApplyRangeGroup.setOrgGroupId(groupId);
                managementClassApplyRangeGroup.setOrgGroupType(pubOrgGroup.getOrgGroupType());
                managementClassApplyRangeGroup.remove("pubts");
                managementClassApplyRangeGroup.setEntityStatus(EntityStatus.Insert);
                managementClassApplyRangeGroupList.add(managementClassApplyRangeGroup);
                managementClass.setOrgGroupId(groupId);
            } else {
                QueryConditionGroup managementClassRangeGroupCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq(managementClass.getId()), QueryCondition.name((String)"orgGroupType").eq((Object)"0")});
                QuerySchema managementClassRangeGroupSchema = QuerySchema.create().addSelect("id,orgGroupId,clsId,orgGroupType").addCondition((ConditionExpression)managementClassRangeGroupCondition);
                List originalManagementClassApplyRangeGroupList = MetaDaoHelper.query((String)"pc.cls.ManagementClassApplyRangeGroup", (QuerySchema)managementClassRangeGroupSchema);
                if (null == originalManagementClassApplyRangeGroupList || originalManagementClassApplyRangeGroupList.size() == 0) {
                    return new RuleExecuteResult();
                }
                ManagementClassApplyRangeGroup managementClassApplyRangeGroup = (ManagementClassApplyRangeGroup)JSON.parseObject((String)JSON.toJSONString(originalManagementClassApplyRangeGroupList.get(0)), ManagementClassApplyRangeGroup.class);
                QueryConditionGroup originalManagementClassApplyRangeGroupDetailCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"groupId").eq((Object)managementClassApplyRangeGroup.getOrgGroupId())});
                QuerySchema originalManagementClassApplyRangeGroupDetailSchema = QuerySchema.create().addSelect("id,orgId,groupId,orgType").addCondition((ConditionExpression)originalManagementClassApplyRangeGroupDetailCondition);
                List originalPubOrgGroupDetailMapList = MetaDaoHelper.query((String)"pc.pub_org_group.PubOrgGroupDetail", (QuerySchema)originalManagementClassApplyRangeGroupDetailSchema);
                List<Object> newPubOrgGroupDetailMapList = new ArrayList();
                for (Map map2 : originalPubOrgGroupDetailMapList) {
                    PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setId(map2.get("id"));
                    pubOrgGroupDetail.setOrgId(map2.get("orgId") == null ? null : map2.get("orgId").toString());
                    pubOrgGroupDetail.setGroupId(map2.get("groupId") == null ? null : map2.get("groupId").toString());
                    pubOrgGroupDetail.setOrgType(map2.get("orgType") == null ? null : map2.get("orgType").toString());
                    newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
                }
                for (Map map3 : managementClassApplyRanges) {
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
                            newPubOrgGroupDetailMapList = newPubOrgGroupDetailMapList.stream().filter(b -> !managementClassApplyRange.get("id").equals(b.get("id"))).collect(Collectors.toList());
                        }
                        pubOrgGroupDetail = new PubOrgGroupDetail();
                        pubOrgGroupDetail.setOrgId(map3.get("orgId") != null ? map3.get("orgId").toString() : null);
                        pubOrgGroupDetail.setOrgGroupType("0");
                        pubOrgGroupDetail.setOrgType("1");
                        newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
                        continue;
                    }
                    if (entityStatus != EntityStatus.Delete) continue;
                    newPubOrgGroupDetailMapList = newPubOrgGroupDetailMapList.stream().filter(b -> !b.get("orgId").equals(managementClassApplyRange.get("orgId"))).collect(Collectors.toList());
                }
                for (PubOrgGroupDetail pubOrgGroupDetail : newPubOrgGroupDetailMapList) {
                    pubOrgGroupDetail.remove("id");
                }
                PubOrgGroup pubOrgGroup = new PubOrgGroup();
                pubOrgGroup.setOrgGroupType("0");
                pubOrgGroup.setOrgGroupDetailList(newPubOrgGroupDetailMapList);
                String string = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
                managementClassApplyRangeGroup.setOrgGroupId(string);
                managementClassApplyRangeGroup.setEntityStatus(EntityStatus.Update);
                managementClassApplyRangeGroupList.add(managementClassApplyRangeGroup);
                managementClass.setOrgGroupId(string);
            }
            managementClass.set("managementClassApplyRanges", managementClassApplyRangeGroupList);
        }
        return new RuleExecuteResult();
    }

    private void dealRangeForApi(ManagementClass managementClass) throws Exception {
        if (EntityStatus.Update == managementClass.getEntityStatus()) {
            this.dealRangeForApiUpdateApply(managementClass);
        } else if (EntityStatus.Insert == managementClass.getEntityStatus()) {
            this.dealClsApplyRangeGroupForInsert(managementClass);
        }
    }

    private void dealClsApplyRangeGroupForInsert(ManagementClass managementClass) throws Exception {
        Object optionValue;
        if (StringUtils.isEmpty((CharSequence)managementClass.getOrgId())) {
            managementClass.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, managementClass.getOrgId()));
        }
        if (this.pubOptionService.getOrgGlobalShare("pc.cls.ManagementClass").booleanValue()) {
            this.globalShareSetApplyRange(managementClass);
            return;
        }
        ArrayList<ManagementClassApplyRangeGroup> managementClassApplyRanges = new ArrayList<ManagementClassApplyRangeGroup>();
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        PubOrgGroup pubOrgGroup = new PubOrgGroup();
        HashSet<String> orgsSet = new HashSet<String>();
        ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
        if (singleOrg.booleanValue()) {
            managementClass.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, managementClass.getOrgId()));
            PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
            pubOrgGroupDetail.setOrgType("1");
            pubOrgGroupDetail.setOrgGroupType("0");
            pubOrgGroupDetail.setOrgId(managementClass.getOrgId());
            pubOrgGroupDetailList.add(pubOrgGroupDetail);
        } else {
            PubOrgGroupDetail pubOrgGroupDetail;
            List<Map> orgMaps;
            HashSet<String> orgIdset = new HashSet<String>();
            if (managementClass.get("orgGroups") != null) {
                this.getOrgGroups(managementClass, orgIdset);
            }
            if (!CollectionUtils.isEmpty(orgMaps = TreeApplyRangeUtils.getInstance().getOrgAndRangeOrg(this.iupcControlRuleService, singleOrg, managementClass.getOrgId(), "pc.cls.ManagementClass"))) {
                for (Map orgMap : orgMaps) {
                    if (managementClass.getOrgId() != null && !orgMap.get("id").equals(managementClass.getOrgId()) && orgIdset.size() > 0 && !orgIdset.contains(orgMap.get("id"))) continue;
                    pubOrgGroupDetail = new PubOrgGroupDetail();
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
            if (pubOrgGroupDetailList.size() == 1 && orgIdset.size() > 0) {
                for (String orgId : orgIdset) {
                    pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setOrgType("1");
                    pubOrgGroupDetail.setOrgId(orgId);
                    orgsSet.add(pubOrgGroupDetail.getOrgId());
                    pubOrgGroupDetail.setOrgGroupType("0");
                    pubOrgGroupDetailList.add(pubOrgGroupDetail);
                }
            }
        }
        ArrayList shopIds = new ArrayList();
        if (managementClass.get("orgId") != null && "666666".equals(managementClass.get("orgId").toString()) && (optionValue = OptionUtils.getOptionByName((String)"u8c-config", (String)"AutomaticallyAssignMerchants", null)) != null && BooleanUtil.isTrue((Object)optionValue)) {
            List orgs = this.orgUnitQueryService.getByCondition((String)AppContext.getYTenantId(), ConditionDTO.newCondition().onlyExternalOrg());
            HashSet<String> orgIdSet = new HashSet<String>();
            if (!CollectionUtils.isEmpty((Collection)orgs)) {
                for (OrgUnitDTO org : orgs) {
                    orgIdSet.add(org.getId());
                }
            }
            shopIds.addAll(orgIdSet);
        }
        if (!CollectionUtils.isEmpty(shopIds)) {
            for (String shopId : shopIds) {
                if (orgsSet.contains(shopId)) continue;
                orgsSet.add(shopId);
                PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                pubOrgGroupDetail.setOrgGroupType("0");
                pubOrgGroupDetail.setOrgType("3");
                pubOrgGroupDetail.setOrgId(shopId == null ? null : shopId);
                pubOrgGroupDetailList.add(pubOrgGroupDetail);
            }
        }
        pubOrgGroup.setOrgGroupType("0");
        pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
        String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
        ManagementClassApplyRangeGroup managementClassApplyRangeGroup = new ManagementClassApplyRangeGroup();
        managementClassApplyRangeGroup.setOrgGroupId(groupId);
        managementClassApplyRangeGroup.setId((Object)IdManager.getInstance().nextId());
        managementClassApplyRangeGroup.setOrgGroupType(pubOrgGroup.getOrgGroupType());
        if (managementClass.getEntityStatus() == EntityStatus.Update) {
            managementClassApplyRangeGroup.setClsId((Long)managementClass.getId());
        }
        managementClassApplyRangeGroup.remove("pubts");
        managementClassApplyRangeGroup.setEntityStatus(EntityStatus.Insert);
        managementClassApplyRanges.add(managementClassApplyRangeGroup);
        managementClass.put("managementClassApplyRanges", managementClassApplyRanges);
        managementClass.setOrgGroupId(groupId);
    }

    private void getOrgGroups(ManagementClass managementClass, Set<String> orgIdset) throws Exception {
        List orgGroups;
        if (managementClass.get("orgGroups") != null && (orgGroups = (List)managementClass.get("orgGroups")) != null && orgGroups.size() > 0) {
            List<String> orgRangeShare = this.upcControlRuleService.getOrgRangeShareAllWithoutAutoShare("pc.cls.ManagementClass", managementClass.getOrgId());
            HashSet<String> hashSetHasPerpession = new HashSet<String>(orgRangeShare);
            ArrayList<String> orgCodeList = new ArrayList<String>();
            for (BizObject orgGroup : orgGroups) {
                if (orgGroup.get("orgCode") == null) continue;
                orgCodeList.add(orgGroup.get("orgCode").toString());
            }
            ConditionDTO conditionDTO = ConditionDTO.newCondition();
            conditionDTO.andCodeIn(orgCodeList);
            List orgIdList = this.orgUnitQueryService.getIdsByCondition(AppContext.getCurrentUser().getYTenantId(), conditionDTO);
            if (!CollectionUtils.isEmpty((Collection)orgIdList)) {
                for (String orgId : orgIdList) {
                    if (hashSetHasPerpession.contains(orgId)) {
                        orgIdset.add(orgId);
                        continue;
                    }
                    throw new CoreDocBusinessException(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A20538008B", (String)"\u8bf7\u68c0\u67e5\u53c2\u6570\u3010orgGroups\u3011\u7684\u8303\u56f4\u662f\u5426\u6709\u8bef\uff0c\u8be5\u53c2\u6570\u7684\u7ec4\u7ec7\u9700\u6ee1\u8db3\u7528\u6237\u7ec4\u7ec7\u6743\u9650\u548c\u5f53\u524d\u6863\u6848\u7684\u5171\u4eab\u7ec4\u7ec7\u8303\u56f4"));
                }
            } else if (orgCodeList.size() > 0) {
                throw new CoreDocBusinessException(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A20538008B", (String)"\u8bf7\u68c0\u67e5\u53c2\u6570\u3010orgGroups\u3011\u7684\u8303\u56f4\u662f\u5426\u6709\u8bef\uff0c\u8be5\u53c2\u6570\u7684\u7ec4\u7ec7\u9700\u6ee1\u8db3\u7528\u6237\u7ec4\u7ec7\u6743\u9650\u548c\u5f53\u524d\u6863\u6848\u7684\u5171\u4eab\u7ec4\u7ec7\u8303\u56f4"));
            }
            for (BizObject orgGroup : orgGroups) {
                if (orgGroup.get("orgId") != null && hashSetHasPerpession.contains(orgGroup.get("orgId").toString())) {
                    orgIdset.add(orgGroup.get("orgId").toString());
                    continue;
                }
                if (orgGroup.get("orgId") == null || hashSetHasPerpession.contains(orgGroup.get("orgId").toString())) continue;
                throw new CoreDocBusinessException(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A20538008B", (String)"\u8bf7\u68c0\u67e5\u53c2\u6570\u3010orgGroups\u3011\u7684\u8303\u56f4\u662f\u5426\u6709\u8bef\uff0c\u8be5\u53c2\u6570\u7684\u7ec4\u7ec7\u9700\u6ee1\u8db3\u7528\u6237\u7ec4\u7ec7\u6743\u9650\u548c\u5f53\u524d\u6863\u6848\u7684\u5171\u4eab\u7ec4\u7ec7\u8303\u56f4"));
            }
        }
    }

    private void dealRangeForApiUpdateApply(ManagementClass managementClass) throws Exception {
        if (managementClass.get("orgGroups") != null) {
            Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
            List<Map> orgMaps = TreeApplyRangeUtils.getInstance().getOrgAndRangeOrg(this.iupcControlRuleService, singleOrg, managementClass.getOrgId(), "pc.cls.ManagementClass");
            QueryConditionGroup managementClassRangeGroupCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq(managementClass.getId()), QueryCondition.name((String)"orgGroupType").eq((Object)"0")});
            QuerySchema managementClassRangeGroupSchema = QuerySchema.create().addSelect("id,orgGroupId,clsId,orgGroupType").addCondition((ConditionExpression)managementClassRangeGroupCondition);
            List originalManagementClassApplyRangeGroupList = MetaDaoHelper.query((String)"pc.cls.ManagementClassApplyRangeGroup", (QuerySchema)managementClassRangeGroupSchema);
            if (null == originalManagementClassApplyRangeGroupList || originalManagementClassApplyRangeGroupList.size() == 0) {
                return;
            }
            ManagementClassApplyRangeGroup managementClassApplyRangeGroup = (ManagementClassApplyRangeGroup)JSON.parseObject((String)JSON.toJSONString(originalManagementClassApplyRangeGroupList.get(0)), ManagementClassApplyRangeGroup.class);
            QueryConditionGroup originalManagementClassApplyRangeGroupDetailCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"groupId").eq((Object)managementClassApplyRangeGroup.getOrgGroupId())});
            QuerySchema originalManagementClassApplyRangeGroupDetailSchema = QuerySchema.create().addSelect("id,orgId,groupId,orgType").addCondition((ConditionExpression)originalManagementClassApplyRangeGroupDetailCondition);
            List originalPubOrgGroupDetailMapList = MetaDaoHelper.query((String)"pc.pub_org_group.PubOrgGroupDetail", (QuerySchema)originalManagementClassApplyRangeGroupDetailSchema);
            ArrayList<PubOrgGroupDetail> newPubOrgGroupDetailMapList = new ArrayList<PubOrgGroupDetail>();
            HashSet<String> orgSet = new HashSet<String>();
            for (Iterator originalPubOrgGroupDetailMap : originalPubOrgGroupDetailMapList) {
                PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                pubOrgGroupDetail.setId(originalPubOrgGroupDetailMap.get("id"));
                if (originalPubOrgGroupDetailMap.get("orgId") == null) {
                    pubOrgGroupDetail.setOrgId(null);
                } else {
                    pubOrgGroupDetail.setOrgId(originalPubOrgGroupDetailMap.get("orgId").toString());
                    orgSet.add(originalPubOrgGroupDetailMap.get("orgId").toString());
                }
                pubOrgGroupDetail.setGroupId(originalPubOrgGroupDetailMap.get("groupId") == null ? null : originalPubOrgGroupDetailMap.get("groupId").toString());
                pubOrgGroupDetail.setOrgType(originalPubOrgGroupDetailMap.get("orgType") == null ? null : originalPubOrgGroupDetailMap.get("orgType").toString());
                newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
            }
            HashSet<String> orgIdset = new HashSet<String>();
            if (managementClass.get("orgGroups") != null) {
                this.getOrgGroups(managementClass, orgIdset);
            }
            for (Map orgMap : orgMaps) {
                if (orgSet.contains(orgMap.get("id").toString()) || orgIdset.size() > 0 && !orgIdset.contains(orgMap.get("id").toString())) continue;
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
                pubOrgGroupDetail.setOrgGroupType("0");
                newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
            }
            for (PubOrgGroupDetail orgGroupDetail : newPubOrgGroupDetailMapList) {
                orgGroupDetail.remove("id");
            }
            PubOrgGroup pubOrgGroup = new PubOrgGroup();
            pubOrgGroup.setOrgGroupType("0");
            pubOrgGroup.setOrgGroupDetailList(newPubOrgGroupDetailMapList);
            String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
            managementClassApplyRangeGroup.setOrgGroupId(groupId);
            managementClassApplyRangeGroup.setClsId((Long)managementClass.getId());
            managementClassApplyRangeGroup.setEntityStatus(EntityStatus.Update);
            ArrayList<ManagementClassApplyRangeGroup> managementClassApplyRangeGroupList = new ArrayList<ManagementClassApplyRangeGroup>();
            managementClassApplyRangeGroupList.add(managementClassApplyRangeGroup);
            managementClass.setOrgGroupId(groupId);
            managementClass.set("managementClassApplyRanges", managementClassApplyRangeGroupList);
        } else {
            boolean bool = BooleanUtil.isTrue((Object)managementClass.get("_fromApi"));
            if (managementClass.containsKey((Object)"orgId") && bool) {
                managementClass.remove("orgId");
            }
            managementClass.remove("orgGroupId");
        }
    }

    private void globalShareSetApplyRange(ManagementClass managementClass) throws Exception {
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        PubOrgGroup pubOrgGroup = new PubOrgGroup();
        ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
        ArrayList<ManagementClassApplyRangeGroup> managementClassApplyRanges = new ArrayList<ManagementClassApplyRangeGroup>();
        if (singleOrg.booleanValue() || StringUtils.isEmpty((CharSequence)managementClass.getOrgId())) {
            managementClass.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, managementClass.getOrgId()));
        }
        PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
        pubOrgGroupDetail.setOrgType("1");
        pubOrgGroupDetail.setOrgGroupType("0");
        pubOrgGroupDetail.setOrgId(managementClass.getOrgId());
        pubOrgGroupDetailList.add(pubOrgGroupDetail);
        pubOrgGroup.setOrgGroupType("0");
        pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
        String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
        ManagementClassApplyRangeGroup managementClassApplyRangeGroup = new ManagementClassApplyRangeGroup();
        managementClassApplyRangeGroup.setOrgGroupId(groupId);
        managementClassApplyRangeGroup.setId((Object)IdManager.getInstance().nextId());
        managementClassApplyRangeGroup.setOrgGroupType(pubOrgGroup.getOrgGroupType());
        managementClassApplyRangeGroup.remove("pubts");
        managementClassApplyRangeGroup.setEntityStatus(EntityStatus.Insert);
        managementClassApplyRanges.add(managementClassApplyRangeGroup);
        managementClass.put("managementClassApplyRanges", managementClassApplyRanges);
        managementClass.setOrgGroupId(groupId);
    }

    private void checkDataForImport(Map<String, Object> map, ManagementClass managementClass) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        String requestAction = billDataDto.getRequestAction();
        boolean isImport = false;
        if (requestAction != null && requestAction.contains("import")) {
            isImport = true;
        }
        if (!isImport) {
            return;
        }
        if (EntityStatus.Update == managementClass.getEntityStatus()) {
            TreeApplyRangeUtils.getInstance().checkCreatOrg(managementClass.getId(), managementClass.getOrgId(), "pc.cls.ManagementClass");
            QuerySchema schema = QuerySchema.create().addSelect(new String[]{"parent", "orgId", "stopstatus"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(managementClass.getId())}));
            Map query = MetaDaoHelper.queryOne((String)"pc.cls.ManagementClass", (QuerySchema)schema);
            if (query != null && query.get("parent") != null && !"0".equals(query.get("parent").toString()) && managementClass.getParent() != null && !managementClass.getParent().toString().equals(query.get("parent").toString())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800174);
            }
            if (managementClass.getParent() != null) {
                QuerySchema querySchema = QuerySchema.create().addSelect(new String[]{"orgId", "level"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)managementClass.getParent())}));
                Map queryOrgId = MetaDaoHelper.queryOne((String)"pc.cls.ManagementClass", (QuerySchema)querySchema);
                if (queryOrgId == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800175);
                }
                if (queryOrgId.get("level") != null && (Integer)queryOrgId.get("level") > 7) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800177);
                }
            }
        } else if (EntityStatus.Insert == managementClass.getEntityStatus() && managementClass.getParent() != null) {
            QuerySchema querySchema = QuerySchema.create().addSelect(new String[]{"orgId", "level"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)managementClass.getParent())}));
            Map queryOrgId = MetaDaoHelper.queryOne((String)"pc.cls.ManagementClass", (QuerySchema)querySchema);
            if (queryOrgId == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800175);
            }
            if (managementClass.getOrgId() == null) {
                managementClass.setOrgId(queryOrgId.get("orgId").toString());
            }
            if (queryOrgId.get("level") != null && (Integer)queryOrgId.get("level") > 7) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800177);
            }
        }
    }
}

