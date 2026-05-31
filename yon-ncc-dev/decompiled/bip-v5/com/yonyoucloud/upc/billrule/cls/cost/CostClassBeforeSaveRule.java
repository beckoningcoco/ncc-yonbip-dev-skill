/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.pc.cls.CostClass
 *  com.yonyoucloud.upc.pc.cls.CostClassApplyRange
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.cls.cost;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.pc.cls.CostClass;
import com.yonyoucloud.upc.pc.cls.CostClassApplyRange;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="costClassBeforeSaveRule")
public class CostClassBeforeSaveRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    GroupService groupService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List clss = this.getBills(billContext, map);
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        String requestAction = billDataDto.getRequestAction();
        boolean isImport = false;
        if (requestAction != null && requestAction.contains("import")) {
            isImport = true;
        }
        for (BizObject cls : clss) {
            List<String> orgIds;
            CostClass costClass = (CostClass)cls;
            if (!(cls.getEntityStatus() != EntityStatus.Insert || this.iupcControlRuleService.checkSingleOrg().booleanValue() || costClass.getOrgId() == null || AppContext.getCurrentUser().getUserType() == null || 0 == AppContext.getCurrentUser().getUserType().getValue() || !ObjectUtils.isEmpty(orgIds = this.iupcControlRuleService.getUserOrgAndVoucherManageOrg("pc.cls.CostClass", "pc_costclass")) && orgIds.contains(costClass.getOrgId()))) {
                String msg = costClass.getOrgId();
                if (cls.get("orgId_code") != null) {
                    msg = cls.get("orgId_code").toString();
                }
                if (cls.get("orgId_name") != null) {
                    msg = cls.get("orgId_name").toString();
                }
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MANAGE_ORG_MC_FILTER_CHECK, new Object[]{msg});
            }
            ArrayList<String> rangeOrgIdListInDb = new ArrayList();
            if (costClass.getId() != null) {
                rangeOrgIdListInDb = this.getRangeOrgIdList(costClass.getId().toString());
            }
            if (costClass.getEntityStatus() == EntityStatus.Insert) {
                costClass.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, costClass.getOrgId()));
            }
            if (costClass.getParent() != null) {
                int level;
                BizObject bizObject = MetaDaoHelper.findById((String)"pc.cls.CostClass", (Object)costClass.getParent());
                if (bizObject != null && bizObject.containsKey((Object)"level") && bizObject.get("level") != null && (level = ((Integer)bizObject.get("level")).intValue()) > 7) {
                    RuleExecuteResult rr = new RuleExecuteResult();
                    rr.setCancel(true);
                    return rr;
                }
                if (!bizObject.get("orgId").toString().equals(costClass.getOrgId())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800157);
                }
            }
            this.dealCostRange(costClass, rangeOrgIdListInDb, isImport);
            List costClassApplyRanges = costClass.costClassApplyRanges();
            if (BooleanUtil.isTrue((Object)costClass.get("_fromApi")) || isImport) {
                this.dealRangeForApi(costClass);
            } else {
                this.dealRange(costClass);
            }
            QuerySchema query = QuerySchema.create().addSelect("clsId,isEnd").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq(costClass.getId()), QueryCondition.name((String)"isCreator").eq((Object)1)}));
            Map clsApplyRange = MetaDaoHelper.queryOne((String)"pc.cls.CostClassApplyRange", (QuerySchema)query);
            if (!CollectionUtils.isEmpty((Collection)costClassApplyRanges)) {
                if (clsApplyRange != null && !clsApplyRange.isEmpty()) {
                    for (CostClassApplyRange costClassApplyRange : costClassApplyRanges) {
                        if (costClassApplyRange.getIsEnd() != null || !EntityStatus.Insert.equals((Object)costClassApplyRange.getEntityStatus())) continue;
                        if (clsApplyRange.get("isEnd") != null && "true".equals(clsApplyRange.get("isEnd").toString())) {
                            costClassApplyRange.setIsEnd(Boolean.valueOf(true));
                            continue;
                        }
                        costClassApplyRange.setIsEnd(Boolean.valueOf(false));
                    }
                } else {
                    Boolean isEnd = null;
                    for (CostClassApplyRange costClassApplyRange : costClassApplyRanges) {
                        if (!costClassApplyRange.containsKey((Object)"isCreator") || !costClassApplyRange.getIsCreator().booleanValue()) continue;
                        isEnd = costClassApplyRange.getIsEnd();
                    }
                    for (CostClassApplyRange costClassApplyRange : costClassApplyRanges) {
                        if (costClassApplyRange.getIsEnd() != null || !EntityStatus.Insert.equals((Object)costClassApplyRange.getEntityStatus()) || isEnd == null) continue;
                        costClassApplyRange.setIsEnd(isEnd);
                    }
                }
            }
            if (costClass.getEntityStatus() == EntityStatus.Insert) {
                costClass.setIsEnd(Boolean.valueOf(true));
            }
            if (costClass.getEntityStatus() == EntityStatus.Update) {
                this.checkCostCodeModify(costClass);
                this.checkCostStopStatus(costClass);
            }
            this.checkPManReferProduct(costClass);
        }
        return new RuleExecuteResult();
    }

    private void checkPManReferProduct(CostClass costClass) throws Exception {
        Long parent = costClass.getParent();
        if (parent != null) {
            QuerySchema schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"costClass").eq((Object)parent)}));
            Map map = MetaDaoHelper.queryOne((String)"pc.product.Product", (QuerySchema)schema);
            int count = 0;
            if (map != null && map.get("count") != null) {
                count = Integer.valueOf(map.get("count").toString());
            }
            if (count > 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800151);
            }
        }
    }

    private void checkCostStopStatus(CostClass costClass) throws Exception {
        EntityStatus entityStatus = costClass.getEntityStatus();
        if (EntityStatus.Update == entityStatus) {
            Object id = costClass.getId();
            Boolean stopstatus = costClass.getStopstatus();
            if (stopstatus.booleanValue()) {
                QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"path").like(id), QueryCondition.name((String)"stopstatus").eq((Object)false), QueryCondition.name((String)"id").not_eq(id)}));
                List clss = MetaDaoHelper.query((String)"pc.cls.CostClass", (QuerySchema)schema);
                if (clss != null && clss.size() > 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800152);
                }
            } else {
                costClass.setStoptime(null);
            }
        }
    }

    private void dealCostRange(CostClass cls, List<String> rangeOrgIdListInDb, boolean isImport) throws Exception {
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        cls.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, cls.getOrgId()));
        if (cls.getEntityStatus() == EntityStatus.Insert && CollectionUtils.isEmpty((Collection)cls.costClassApplyRanges())) {
            this.setRanges(cls, rangeOrgIdListInDb);
            if (!this.pubOptionService.getOrgGlobalShare("pc.cls.CostClass").booleanValue() && (TreeApplyRangeUtils.getInstance().isApiOrExcelData((BizObject)cls) || isImport)) {
                this.setApplierRanges(cls, rangeOrgIdListInDb);
            }
        }
        if (cls.getEntityStatus() == EntityStatus.Update) {
            if (!cls.containsKey((Object)"_fromApi") || !((Boolean)cls.get("_fromApi")).booleanValue()) {
                Map costClsOrg = MetaDaoHelper.queryOne((String)"pc.cls.CostClass", (QuerySchema)QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(cls.getId())})));
                if (costClsOrg == null || costClsOrg.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800158);
                }
                if (!singleOrg.booleanValue() && !costClsOrg.get("orgId").toString().equals(cls.getOrgId())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800159);
                }
                List<String> subOrgs = this.iupcControlRuleService.getSubOrgs(cls.getOrgId());
                TreeApplyRangeUtils.getInstance().updateRangeIsEndByPrantClsAndOrg((BizObject)cls, 1, "clsId", subOrgs, "pc.cls.CostClass", "pc.cls.CostClassApplyRange");
                if (cls.getParent() != null) {
                    subOrgs.add(cls.getOrgId());
                    TreeApplyRangeUtils.getInstance().updateRangeIsEndByClsAndOrg(0, "clsId", cls.getParent(), subOrgs, "pc.cls.CostClassApplyRange");
                }
            } else {
                TreeApplyRangeUtils.getInstance().checkCreatOrg(cls.getId(), cls.getOrgId(), "pc.cls.CostClass");
                QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").like(cls.getId())}));
                List ranges = MetaDaoHelper.query((String)"pc.cls.CostClassApplyRange", (QuerySchema)schema);
                if (CollectionUtils.isEmpty((Collection)ranges)) {
                    this.setRanges(cls, rangeOrgIdListInDb);
                    this.setApplierRanges(cls, rangeOrgIdListInDb);
                } else if (ranges.size() == 1) {
                    this.setApplierRanges(cls, rangeOrgIdListInDb);
                }
            }
        }
    }

    public void setRanges(CostClass cls, List<String> rangeOrgIdListInDb) {
        ArrayList<CostClassApplyRange> ranges = cls.costClassApplyRanges();
        if (ranges == null || ranges.size() < 1) {
            ranges = new ArrayList<CostClassApplyRange>();
            ranges.add(TreeApplyRangeUtils.getInstance().getCostClassApplyRange((Long)cls.getId(), cls.getOrgId(), true, true));
            Iterator iterator = ranges.iterator();
            while (iterator.hasNext()) {
                CostClassApplyRange next = (CostClassApplyRange)iterator.next();
                if (!rangeOrgIdListInDb.contains(next.getOrgId())) continue;
                iterator.remove();
            }
            cls.setCostClassApplyRanges(ranges);
        }
    }

    public void setApplierRanges(CostClass cls, List<String> rangeOrgIdListInDb) throws Exception {
        List<String> shareAll;
        ArrayList<CostClassApplyRange> ranges = cls.costClassApplyRanges();
        if (ranges == null) {
            ranges = new ArrayList<CostClassApplyRange>();
        }
        ArrayList<String> orgs = new ArrayList<String>();
        orgs.add(cls.getOrgId());
        List<String> autoShareOrg = this.iupcControlRuleService.getVoucherManageShareOrgs("pc.cls.CostClass", orgs);
        if (!CollectionUtils.isEmpty(autoShareOrg) && !CollectionUtils.isEmpty(shareAll = this.iupcControlRuleService.getOrgRangeShareAll("pc.cls.CostClass", cls.getOrgId()))) {
            for (String org : shareAll) {
                if (org.equals(cls.getOrgId())) continue;
                ranges.add(TreeApplyRangeUtils.getInstance().getCostClassApplyRange((Long)cls.getId(), org, true, false));
            }
        }
        Iterator iterator = ranges.iterator();
        while (iterator.hasNext()) {
            CostClassApplyRange next = (CostClassApplyRange)iterator.next();
            if (!rangeOrgIdListInDb.contains(next.getOrgId())) continue;
            iterator.remove();
        }
        cls.setCostClassApplyRanges(ranges);
    }

    private void checkCostCodeModify(CostClass cls) throws Exception {
        List proClss;
        QuerySchema schema = QuerySchema.create().addSelect("id ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"costClass").eq(cls.getId())}));
        List costClss = MetaDaoHelper.query((String)"pc.product.Product", (QuerySchema)schema);
        if (costClss.size() > 0 && (proClss = MetaDaoHelper.query((String)"pc.cls.CostClass", (QuerySchema)(schema = QuerySchema.create().addSelect("id ").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(cls.getId()), QueryCondition.name((String)"code").eq((Object)cls.getCode())}))))).size() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800153);
        }
    }

    private List<String> getRangeOrgIdList(String costClass) throws Exception {
        ArrayList<String> rangeOrgIdListInDb = new ArrayList<String>();
        if (costClass == null) {
            return rangeOrgIdListInDb;
        }
        QuerySchema rangeOrgIdListSchema = QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq((Object)costClass)}));
        List orglist = MetaDaoHelper.query((String)"pc.cls.CostClassApplyRange", (QuerySchema)rangeOrgIdListSchema);
        if (orglist == null || orglist.size() == 0) {
            return rangeOrgIdListInDb;
        }
        for (Map item : orglist) {
            rangeOrgIdListInDb.add(item.get("orgId").toString());
        }
        return rangeOrgIdListInDb;
    }

    private void dealRangeForApi(CostClass costClass) throws Exception {
        if (EntityStatus.Update == costClass.getEntityStatus()) {
            if (costClass.containsKey((Object)"orgId")) {
                costClass.remove("orgId");
            }
            return;
        }
        if (EntityStatus.Insert == costClass.getEntityStatus()) {
            if (StringUtils.isEmpty((CharSequence)costClass.getOrgId())) {
                costClass.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, costClass.getOrgId()));
            }
            if (this.pubOptionService.getOrgGlobalShare("pc.cls.CostClass").booleanValue()) {
                this.globalShareSetApplyRange(costClass);
                return;
            }
            Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
            PubOrgGroup pubOrgGroup = new PubOrgGroup();
            HashSet<String> orgsSet = new HashSet<String>();
            ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
            if (singleOrg.booleanValue()) {
                costClass.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, costClass.getOrgId()));
                PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                pubOrgGroupDetail.setOrgType("1");
                pubOrgGroupDetail.setOrgGroupType("0");
                pubOrgGroupDetail.setOrgId(costClass.getOrgId());
                pubOrgGroupDetailList.add(pubOrgGroupDetail);
            } else {
                List<Map> orgMaps = TreeApplyRangeUtils.getInstance().getOrgAndRangeOrg(this.iupcControlRuleService, singleOrg, costClass.getOrgId(), "pc.cls.CostClass");
                if (!CollectionUtils.isEmpty(orgMaps)) {
                    for (Map orgMap : orgMaps) {
                        PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                        pubOrgGroupDetail.setOrgId(orgMap.get("id").toString());
                        orgsSet.add(pubOrgGroupDetail.getOrgId());
                        pubOrgGroupDetail.setOrgGroupType("0");
                        pubOrgGroupDetail.setOrgType("1");
                        pubOrgGroupDetailList.add(pubOrgGroupDetail);
                    }
                }
            }
            pubOrgGroup.setOrgGroupType("0");
            pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
            String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
            costClass.setOrgGroupId(groupId);
        }
    }

    private void globalShareSetApplyRange(CostClass costClass) throws Exception {
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        PubOrgGroup pubOrgGroup = new PubOrgGroup();
        ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
        if (singleOrg.booleanValue() || StringUtils.isEmpty((CharSequence)costClass.getOrgId())) {
            costClass.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, costClass.getOrgId()));
        }
        PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
        pubOrgGroupDetail.setOrgGroupType("0");
        pubOrgGroupDetail.setOrgType("1");
        pubOrgGroupDetail.setOrgId(costClass.getOrgId());
        pubOrgGroupDetailList.add(pubOrgGroupDetail);
        pubOrgGroup.setOrgGroupType("0");
        pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
        String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
        costClass.setOrgGroupId(groupId);
    }

    private void dealRange(CostClass costClass) throws Exception {
        List costClassApplyRanges = costClass.costClassApplyRanges();
        PubOrgGroup pubOrgGroup = new PubOrgGroup();
        ArrayList<PubOrgGroupDetail> newPubOrgGroupDetailMapList = new ArrayList<PubOrgGroupDetail>();
        if (costClass.getEntityStatus() == EntityStatus.Insert) {
            if (!CollectionUtils.isEmpty((Collection)costClassApplyRanges)) {
                for (CostClassApplyRange costClassApplyRange : costClassApplyRanges) {
                    PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setOrgId(costClassApplyRange.getOrgId());
                    pubOrgGroupDetail.setOrgGroupType("0");
                    pubOrgGroupDetail.setOrgType("1");
                    newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
                }
                pubOrgGroup.setOrgGroupType("0");
                pubOrgGroup.setOrgGroupDetailList(newPubOrgGroupDetailMapList);
            }
        } else {
            Long id;
            QuerySchema query = QuerySchema.create().addSelect("id,orgId,clsId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq(costClass.getId())}));
            List clsApplyRangeList = MetaDaoHelper.query((String)"pc.cls.CostClassApplyRange", (QuerySchema)query);
            HashSet<String> orgIdSet = new HashSet<String>();
            HashMap<Long, String> idAndOrgIdMap = new HashMap<Long, String>();
            if (!CollectionUtils.isEmpty((Collection)clsApplyRangeList)) {
                for (Map clsApplyRange : clsApplyRangeList) {
                    String orgId = clsApplyRange.get("orgId").toString();
                    id = Long.valueOf(clsApplyRange.get("id").toString());
                    idAndOrgIdMap.put(id, orgId);
                    orgIdSet.add(orgId);
                }
            }
            if (!CollectionUtils.isEmpty((Collection)costClassApplyRanges)) {
                for (CostClassApplyRange costClassApplyRange : costClassApplyRanges) {
                    EntityStatus entityStatus = costClassApplyRange.getEntityStatus();
                    if (entityStatus == EntityStatus.Insert) {
                        orgIdSet.add(costClassApplyRange.getOrgId());
                        continue;
                    }
                    if (entityStatus == EntityStatus.Update) {
                        id = Long.valueOf(costClassApplyRange.getId().toString());
                        String oldOrgId = (String)idAndOrgIdMap.get(id);
                        String newOrgId = costClassApplyRange.getOrgId();
                        orgIdSet.remove(oldOrgId);
                        orgIdSet.add(newOrgId);
                        continue;
                    }
                    if (entityStatus != EntityStatus.Delete) continue;
                    orgIdSet.remove(costClassApplyRange.getOrgId());
                }
                if (!CollectionUtils.isEmpty(orgIdSet)) {
                    for (String orgId : orgIdSet) {
                        if (orgId == null || orgId.length() == 0) continue;
                        PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                        pubOrgGroupDetail.setOrgId(orgId);
                        pubOrgGroupDetail.setOrgGroupType("0");
                        pubOrgGroupDetail.setOrgType("1");
                        newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
                    }
                    pubOrgGroup.setOrgGroupType("0");
                    pubOrgGroup.setOrgGroupDetailList(newPubOrgGroupDetailMapList);
                }
            }
        }
        if (pubOrgGroup != null && !CollectionUtils.isEmpty((Collection)pubOrgGroup.orgGroupDetailList())) {
            String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
            costClass.setOrgGroupId(groupId);
        }
    }
}

