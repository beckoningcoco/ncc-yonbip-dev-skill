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
 *  com.yonyou.iuap.data.entity.dto.FuncOrg
 *  com.yonyou.iuap.data.service.itf.FuncOrgDataQryService
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.custcategory.CustCategory
 *  com.yonyoucloud.upc.aa.custcategory.CustCategoryApplyRange
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  com.yonyoucloud.upc.utils.TreeBillDataUtil
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
package com.yonyoucloud.upc.billrule.cust;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.iuap.data.entity.dto.FuncOrg;
import com.yonyou.iuap.data.service.itf.FuncOrgDataQryService;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.custcategory.CustCategory;
import com.yonyoucloud.upc.aa.custcategory.CustCategoryApplyRange;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.service.ProductClsService;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import com.yonyoucloud.upc.utils.TreeBillDataUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="custcategoryProcessRule")
public class CustcategoryProcessRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private FuncOrgDataQryService funcOrgDataQryService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    GroupService groupService;
    @Autowired
    private ProductClsService productClsService;
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        List funcOrgs;
        List orgids;
        boolean hasStatus;
        List bills = this.getBills(billContext, paramMap);
        CustCategory custInfo = (CustCategory)bills.get(0);
        ArrayList<String> rangeOrgIdListInDb = new ArrayList();
        if (custInfo.getId() != null) {
            rangeOrgIdListInDb = this.getRangeOrgIdList(custInfo.getId().toString());
        }
        if (!(hasStatus = custInfo.containsKey((Object)"isEnabled"))) {
            custInfo.setIsEnabled(Boolean.valueOf(true));
        }
        if (custInfo.getOrgId() != null && !(orgids = (funcOrgs = this.funcOrgDataQryService.listByIds(new ArrayList<String>(Collections.singletonList(custInfo.getOrgId())), new ArrayList<Integer>(Collections.singletonList(1)), AppContext.getYhtTenantId().toString(), "diwork", "adminorg")).stream().map(FuncOrg::getOrgid).collect(Collectors.toList())).contains(custInfo.getOrgId()) && !"delete".equals(billContext.getAction())) {
            custInfo.setOrgId(null);
        }
        if (custInfo.getEntityStatus() == EntityStatus.Insert) {
            if (custInfo.getParent() == null) {
                custInfo.setIsEnd(Boolean.valueOf(true));
            }
            custInfo.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, custInfo.getOrgId()));
            this.checkParent(custInfo);
            this.checkOrgId(custInfo);
        }
        if (custInfo.getEntityStatus() == EntityStatus.Update) {
            custInfo.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, custInfo.getOrgId()));
            this.checkParent(custInfo);
            if (!custInfo.getIsEnabled().booleanValue()) {
                this.stopChildren((Long)custInfo.getId());
            }
            if (custInfo.getId() != null && custInfo.getParent() != null) {
                TreeBillDataUtil.checkTreeLevel((String)"aa.custcategory.CustCategory", (Long)((Long)custInfo.getId()), (Long)custInfo.getParent());
            }
            MerchantUtils.updateMapDefineStatus((Map)custInfo, (String)"aa.custcategory.CustCategoryDefine", (String)"custCategoryDefines");
        }
        if ("delete".equals(billContext.getAction())) {
            if (!CollectionUtils.isEmpty((Collection)bills)) {
                this.productClsService.checkIsEnd((BizObject)bills.get(0), "aa.custcategory.CustCategory");
            }
            if (custInfo.get("custCategoryApplyRanges_isCreator") != null && !Boolean.parseBoolean(custInfo.get("custCategoryApplyRanges_isCreator").toString())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800474, new Object[]{custInfo.getCode()});
            }
            this.checksRefer(custInfo);
            List<String> subOrgs = this.iupcControlRuleService.getSubOrgs(custInfo.getOrgId());
            TreeApplyRangeUtils.getInstance().updateRangeIsEndByPrantClsAndOrg((BizObject)custInfo, 1, "clsId", subOrgs, "aa.custcategory.CustCategory", "aa.custcategory.CustCategoryApplyRange");
        } else {
            this.dealCustCatagoryRange(custInfo, rangeOrgIdListInDb);
            if (BooleanUtil.isTrue((Object)custInfo.get("_fromApi"))) {
                this.dealRangeForApi(custInfo);
            } else {
                this.dealRange(custInfo);
            }
        }
        return new RuleExecuteResult();
    }

    private void dealCustCatagoryRange(CustCategory cls, List<String> rangeOrgIdListInDb) throws Exception {
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        if (cls.getEntityStatus() == EntityStatus.Insert && CollectionUtils.isEmpty((Collection)cls.custCategoryApplyRanges())) {
            this.setCreatorRanges(cls, rangeOrgIdListInDb);
            if (!this.pubOptionService.getOrgGlobalShare("aa.custcategory.CustCategory").booleanValue() && TreeApplyRangeUtils.getInstance().isApiOrExcelData((BizObject)cls)) {
                this.setApplierRanges(cls, rangeOrgIdListInDb);
            }
        }
        if (cls.getEntityStatus() == EntityStatus.Update) {
            if (!cls.containsKey((Object)"_fromApi") || !((Boolean)cls.get("_fromApi")).booleanValue()) {
                Map custCategoryOrg = MetaDaoHelper.queryOne((String)"aa.custcategory.CustCategory", (QuerySchema)QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(cls.getId())})));
                if (custCategoryOrg == null || custCategoryOrg.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800475);
                }
                if (!singleOrg.booleanValue() && !custCategoryOrg.get("orgId").toString().equals(cls.getOrgId())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800159);
                }
                List<String> subOrgs = this.iupcControlRuleService.getSubOrgs(cls.getOrgId());
                TreeApplyRangeUtils.getInstance().updateRangeIsEndByPrantClsAndOrg((BizObject)cls, 1, "clsId", subOrgs, "aa.custcategory.CustCategory", "aa.custcategory.CustCategoryApplyRange");
                if (cls.getParent() != null) {
                    subOrgs.add(cls.getOrgId());
                    TreeApplyRangeUtils.getInstance().updateRangeIsEndByClsAndOrg(0, "clsId", cls.getParent(), subOrgs, "aa.custcategory.CustCategoryApplyRange");
                }
            } else {
                TreeApplyRangeUtils.getInstance().checkCreatOrg(cls.getId(), cls.getOrgId(), "aa.custcategory.CustCategory");
                QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq(cls.getId())}));
                List ranges = MetaDaoHelper.query((String)"aa.custcategory.CustCategoryApplyRange", (QuerySchema)schema);
                if (CollectionUtils.isEmpty((Collection)ranges)) {
                    this.setCreatorRanges(cls, rangeOrgIdListInDb);
                    this.setApplierRanges(cls, rangeOrgIdListInDb);
                } else if (ranges.size() == 1) {
                    this.setApplierRanges(cls, rangeOrgIdListInDb);
                }
            }
        }
    }

    private void setCreatorRanges(CustCategory cls, List<String> rangeOrgIdListInDb) {
        ArrayList<CustCategoryApplyRange> ranges = cls.custCategoryApplyRanges();
        if (ranges == null || ranges.size() < 1) {
            ranges = new ArrayList<CustCategoryApplyRange>();
            ranges.add(TreeApplyRangeUtils.getInstance().getCustCatetoryApplyRange((Long)cls.getId(), cls.getOrgId(), true, true));
            Iterator iterator = ranges.iterator();
            while (iterator.hasNext()) {
                CustCategoryApplyRange next = (CustCategoryApplyRange)iterator.next();
                if (!rangeOrgIdListInDb.contains(next.getOrgId())) continue;
                iterator.remove();
            }
            cls.setCustCategoryApplyRanges(ranges);
        }
    }

    private void setApplierRanges(CustCategory cls, List<String> rangeOrgIdListInDb) throws Exception {
        List<String> shareAll;
        ArrayList<CustCategoryApplyRange> ranges = cls.custCategoryApplyRanges();
        if (ranges == null) {
            ranges = new ArrayList<CustCategoryApplyRange>();
        }
        ArrayList<String> orgs = new ArrayList<String>();
        orgs.add(cls.getOrgId());
        List<String> autoShareOrg = this.iupcControlRuleService.getVoucherManageShareOrgs("aa.custcategory.CustCategory", orgs);
        if (!CollectionUtils.isEmpty(autoShareOrg) && !CollectionUtils.isEmpty(shareAll = this.iupcControlRuleService.getOrgRangeShareAll("aa.custcategory.CustCategory", cls.getOrgId()))) {
            for (String org : shareAll) {
                if (org.equals(cls.getOrgId())) continue;
                ranges.add(TreeApplyRangeUtils.getInstance().getCustCatetoryApplyRange((Long)cls.getId(), org, true, false));
            }
        }
        Iterator iterator = ranges.iterator();
        while (iterator.hasNext()) {
            CustCategoryApplyRange next = (CustCategoryApplyRange)iterator.next();
            if (!rangeOrgIdListInDb.contains(next.getOrgId())) continue;
            iterator.remove();
        }
        cls.setCustCategoryApplyRanges(ranges);
    }

    private void checkParent(CustCategory custInfo) throws Exception {
        Long parent = custInfo.getParent();
        if (parent == null) {
            return;
        }
        QuerySchema schema = QuerySchema.create().addSelect("isEnabled, level, orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)parent)}));
        List custclss = MetaDaoHelper.query((String)"aa.custcategory.CustCategory", (QuerySchema)schema);
        if (custclss == null || custclss.size() == 0) {
            Object[] objectArray = new Object[1];
            objectArray[0] = MultilangUtil.getAttr((String)"aa.custcategory.CustCategory", (String)"name", (BizObject)custInfo, null);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800476, objectArray);
        }
        if (!((Map)custclss.get(0)).get("orgId").toString().equals(custInfo.getOrgId()) && !MerchantUtils.getAllowSelectNonLeafNodes()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800157);
        }
        this.checkLevel(custclss, custInfo);
        this.checkIsEnable(custclss, custInfo);
        if (!MerchantUtils.getAllowSelectNonLeafNodes()) {
            this.checksParentRefer(custInfo);
        }
    }

    private void checkLevel(List<Map> custclss, CustCategory custInfo) throws Exception {
        int level;
        Object o = custclss.get(0).get("level");
        if (o != null && (level = ((Integer)o).intValue()) > 7) {
            Object[] objectArray = new Object[1];
            objectArray[0] = MultilangUtil.getAttr((String)"aa.custcategory.CustCategory", (String)"name", (BizObject)custInfo, null);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800477, objectArray);
        }
    }

    private void checksParentRefer(CustCategory custInfo) throws Exception {
        Long parent = custInfo.getParent();
        if (parent == null) {
            return;
        }
        RuleExecuteResult ruleResult = this.checksRefer(parent);
        if (ruleResult != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800478);
        }
    }

    private void stopChildren(Long id) throws Exception {
        HashMap<String, Long> map = new HashMap<String, Long>();
        map.put("id", id);
        SqlHelper.update((String)"com.yonyoucloud.upc.aa.cust.updateChildStatus", map);
    }

    private void checkIsEnable(List<Map> custclss, CustCategory custInfo) throws Exception {
        Boolean isEnabled;
        Object o = custclss.get(0).get("isEnabled");
        if (custInfo.getIsEnabled().booleanValue() && o != null && !(isEnabled = (Boolean)o).booleanValue()) {
            Object[] objectArray = new Object[1];
            objectArray[0] = MultilangUtil.getAttr((String)"aa.custcategory.CustCategory", (String)"name", (BizObject)custInfo, null);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800320, objectArray);
        }
    }

    private RuleExecuteResult checksRefer(CustCategory custInfo) throws Exception {
        RuleExecuteResult ruleResult = this.checksRefer((Long)custInfo.getId());
        if (ruleResult != null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800479);
        }
        return null;
    }

    private RuleExecuteResult checksRefer(Long id) throws Exception {
        int num;
        ArrayList<QueryCondition> conditionExpressions = new ArrayList<QueryCondition>();
        conditionExpressions.add(QueryCondition.name((String)"customerClass").eq((Object)id));
        ConditionExpression[] ces = new ConditionExpression[conditionExpressions.size()];
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.or((ConditionExpression[])conditionExpressions.toArray(ces));
        QuerySchema querySchema = new QuerySchema();
        querySchema.addSelect("count(1) as num");
        querySchema.queryConditionGroup(queryConditionGroup);
        Map merchantCount = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
        if (merchantCount != null && merchantCount.get("num") != null && (num = Integer.parseInt(merchantCount.get("num").toString())) != 0) {
            return new RuleExecuteResult(0, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080148", (String)"\u5ba2\u6237\u5206\u7c7b\u5df2\u88ab\u5f15\u7528"));
        }
        return null;
    }

    private List<String> getRangeOrgIdList(String custCategoryId) throws Exception {
        ArrayList<String> rangeOrgIdListInDb = new ArrayList<String>();
        if (custCategoryId == null) {
            rangeOrgIdListInDb = new ArrayList();
            return rangeOrgIdListInDb;
        }
        QuerySchema rangeOrgIdListSchema = QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq((Object)custCategoryId)}));
        List orglist = MetaDaoHelper.query((String)"aa.custcategory.CustCategoryApplyRange", (QuerySchema)rangeOrgIdListSchema);
        if (orglist == null || orglist.size() == 0) {
            return rangeOrgIdListInDb;
        }
        for (Map item : orglist) {
            rangeOrgIdListInDb.add(item.get("orgId").toString());
        }
        return rangeOrgIdListInDb;
    }

    private void dealRangeForApi(CustCategory custCategory) throws Exception {
        if (EntityStatus.Update == custCategory.getEntityStatus()) {
            QuerySchema schema;
            Map queryOrg;
            if (custCategory.containsKey((Object)"orgId") && custCategory != null && custCategory.getId() != null && (queryOrg = MetaDaoHelper.queryOne((String)"aa.custcategory.CustCategory", (QuerySchema)(schema = QuerySchema.create().addSelect("orgId").appendQueryCondition(new ConditionExpression[]{QueryCondition.name((String)"id").eq(custCategory.getId())})))) != null && queryOrg.get("orgId") != null) {
                custCategory.setOrgId(queryOrg.get("orgId").toString());
            }
            return;
        }
        if (EntityStatus.Insert == custCategory.getEntityStatus()) {
            if (StringUtils.isEmpty((CharSequence)custCategory.getOrgId())) {
                custCategory.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, custCategory.getOrgId()));
            }
            if (this.pubOptionService.getOrgGlobalShare("aa.custcategory.CustCategory").booleanValue()) {
                this.globalShareSetApplyRange(custCategory);
                return;
            }
            Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
            PubOrgGroup pubOrgGroup = new PubOrgGroup();
            HashSet<String> orgsSet = new HashSet<String>();
            ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
            if (singleOrg.booleanValue()) {
                custCategory.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, custCategory.getOrgId()));
                PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                pubOrgGroupDetail.setOrgGroupType("0");
                pubOrgGroupDetail.setOrgType("1");
                pubOrgGroupDetail.setOrgId(custCategory.getOrgId());
                pubOrgGroupDetailList.add(pubOrgGroupDetail);
            } else {
                List<Map> orgMaps = TreeApplyRangeUtils.getInstance().getOrgAndRangeOrg(this.iupcControlRuleService, singleOrg, custCategory.getOrgId(), "pc.cls.CostClass");
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
            if (pubOrgGroup != null && pubOrgGroup.orgGroupDetailList() != null) {
                String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
                custCategory.setOrgGroupId(groupId);
            }
        }
    }

    private void globalShareSetApplyRange(CustCategory custCategory) throws Exception {
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        PubOrgGroup pubOrgGroup = new PubOrgGroup();
        ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
        if (singleOrg.booleanValue() || StringUtils.isEmpty((CharSequence)custCategory.getOrgId())) {
            custCategory.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, custCategory.getOrgId()));
        }
        PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
        pubOrgGroupDetail.setOrgGroupType("0");
        pubOrgGroupDetail.setOrgType("1");
        pubOrgGroupDetail.setOrgId(custCategory.getOrgId());
        pubOrgGroupDetailList.add(pubOrgGroupDetail);
        pubOrgGroup.setOrgGroupType("0");
        pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
        String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
        custCategory.setOrgGroupId(groupId);
    }

    private void dealRange(CustCategory custCategory) throws Exception {
        List custCategoryApplyRanges = custCategory.custCategoryApplyRanges();
        PubOrgGroup pubOrgGroup = new PubOrgGroup();
        ArrayList<PubOrgGroupDetail> newPubOrgGroupDetailMapList = new ArrayList<PubOrgGroupDetail>();
        if (custCategory.getEntityStatus() == EntityStatus.Insert) {
            if (!CollectionUtils.isEmpty((Collection)custCategoryApplyRanges)) {
                for (CustCategoryApplyRange custCategoryApplyRange : custCategoryApplyRanges) {
                    PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
                    pubOrgGroupDetail.setOrgId(custCategoryApplyRange.getOrgId());
                    pubOrgGroupDetail.setOrgGroupType("0");
                    pubOrgGroupDetail.setOrgType("1");
                    newPubOrgGroupDetailMapList.add(pubOrgGroupDetail);
                }
                pubOrgGroup.setOrgGroupType("0");
                pubOrgGroup.setOrgGroupDetailList(newPubOrgGroupDetailMapList);
            }
        } else {
            Long id;
            QuerySchema query = QuerySchema.create().addSelect("id,orgId,clsId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"clsId").eq(custCategory.getId())}));
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
            if (!CollectionUtils.isEmpty((Collection)custCategoryApplyRanges)) {
                for (CustCategoryApplyRange custCategoryApplyRange : custCategoryApplyRanges) {
                    EntityStatus entityStatus = custCategoryApplyRange.getEntityStatus();
                    if (entityStatus == EntityStatus.Insert) {
                        orgIdSet.add(custCategoryApplyRange.getOrgId());
                        continue;
                    }
                    if (entityStatus == EntityStatus.Update) {
                        id = Long.valueOf(custCategoryApplyRange.getId().toString());
                        String oldOrgId = (String)idAndOrgIdMap.get(id);
                        String newOrgId = custCategoryApplyRange.getOrgId();
                        orgIdSet.remove(oldOrgId);
                        orgIdSet.add(newOrgId);
                        continue;
                    }
                    if (entityStatus != EntityStatus.Delete) continue;
                    orgIdSet.remove(custCategoryApplyRange.getOrgId());
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
        if (pubOrgGroup != null && pubOrgGroup.orgGroupDetailList() != null) {
            String groupId = this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
            custCategory.setOrgGroupId(groupId);
        }
    }

    private void checkOrgId(CustCategory custCategory) throws Exception {
        if (custCategory.getEntityStatus() == EntityStatus.Insert && custCategory.getOrgId() != null && !this.iupcControlRuleService.checkSingleOrg().booleanValue()) {
            List<String> orgIds;
            String createOrgName = custCategory.getOrgId();
            ArrayList<String> createOrgIdList = new ArrayList<String>();
            createOrgIdList.add(custCategory.getOrgId());
            List orgUnitList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(createOrgIdList).withEnabled());
            if (!CollectionUtils.isEmpty((Collection)orgUnitList)) {
                createOrgName = ((OrgUnitDTO)orgUnitList.get(0)).toMultiLang().getName().toString();
            }
            if (CollectionUtils.isEmpty(orgIds = this.iupcControlRuleService.getManageOrgList("aa.custcategory.CustCategory", "aa_custcategory"))) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MANAGE_ORG_MC_FILTER_CHECK, new Object[]{createOrgName});
            }
            if (!orgIds.contains(custCategory.getOrgId())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MANAGE_ORG_MC_FILTER_CHECK, new Object[]{createOrgName});
            }
        }
    }
}

