/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.salearea.SaleArea
 *  com.yonyoucloud.upc.aa.salearea.SaleAreaApplyRange
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  com.yonyoucloud.upc.utils.TreeBillDataUtil
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
package com.yonyoucloud.upc.billrule.salearea;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.option.service.PubOptionService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.salearea.SaleArea;
import com.yonyoucloud.upc.aa.salearea.SaleAreaApplyRange;
import com.yonyoucloud.upc.service.ProductClsService;
import com.yonyoucloud.upc.service.utils.TreeApplyRangeUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import com.yonyoucloud.upc.utils.TreeBillDataUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
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

@Component(value="saleareaProcessRule")
public class SaleareaProcessRule
extends AbstractCommonRule {
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private PubOptionService pubOptionService;
    @Autowired
    private ProductClsService productClsService;
    public static final int MAX_CODE = 60;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        RuleExecuteResult deleteResult;
        List bills = this.getBills(billContext, paramMap);
        if (CollectionUtils.isEmpty((Collection)bills)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.DATA_IS_NOT_EXISTS);
        }
        SaleArea saleArea = (SaleArea)bills.get(0);
        if ((saleArea.getEntityStatus() == EntityStatus.Insert || saleArea.getEntityStatus() == EntityStatus.Update) && saleArea.getCode() != null && saleArea.getCode().length() > 60) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CODE_LENGTH_ERROR_SIZE, new Object[]{String.valueOf(60)});
        }
        ArrayList<String> rangeOrgIdListInDb = new ArrayList();
        if (saleArea.getId() != null) {
            rangeOrgIdListInDb = this.getRangeOrgIdList(saleArea.getId().toString());
        }
        saleArea.setOrgId(TreeApplyRangeUtils.getInstance().getDefaultOrg(this.iupcControlRuleService, saleArea.getOrgId()));
        if (saleArea.getParent() != null && !"delete".equals(billContext.getAction())) {
            int level;
            BizObject bizObject = MetaDaoHelper.findById((String)"aa.salearea.SaleArea", (Object)saleArea.getParent());
            if (bizObject != null && bizObject.containsKey((Object)"level") && bizObject.get("level") != null && (level = ((Integer)bizObject.get("level")).intValue()) > 7) {
                RuleExecuteResult rr = new RuleExecuteResult();
                rr.setCancel(true);
                return rr;
            }
            if (!MerchantUtils.getAllowSelectNonLeafNodes()) {
                this.checksParentRefer(saleArea);
            }
            this.chechParentStatus(saleArea);
        }
        if (saleArea.getEntityStatus() == EntityStatus.Insert || saleArea.getEntityStatus() == EntityStatus.Update) {
            this.dealSaleareaRange(saleArea, rangeOrgIdListInDb);
        }
        if (saleArea.getEntityStatus() == EntityStatus.Insert) {
            saleArea.setIsEnd(Boolean.valueOf(true));
        }
        if (saleArea.getEntityStatus() == EntityStatus.Update) {
            Boolean stopstatus;
            deleteResult = this.chechRefered((Long)saleArea.getId());
            if (deleteResult != null) {
                QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(saleArea.getId()), QueryCondition.name((String)"code").eq((Object)saleArea.getCode())}));
                List checkResult = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)schema);
                if (checkResult == null || checkResult.size() == 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800318);
                }
                if (saleArea.getStopstatus().booleanValue()) {
                    HashMap<String, Object> map = new HashMap<String, Object>();
                    map.put("id", saleArea.getId());
                    map.put("table", "aa_salearea");
                    SqlHelper.update((String)"com.yonyoucloud.upc.aa.cust.updateAreaStopStatus", map);
                }
            }
            if (!(stopstatus = saleArea.getStopstatus()).booleanValue()) {
                saleArea.setStoptime(null);
            }
            if (saleArea.getId() != null && saleArea.getParent() != null) {
                TreeBillDataUtil.checkTreeLevel((String)"aa.salearea.SaleArea", (Long)((Long)saleArea.getId()), (Long)saleArea.getParent());
            }
            MerchantUtils.updateMapDefineStatus((Map)saleArea, (String)"aa.salearea.SaleAreaDefine", (String)"defines");
        }
        if ("delete".equals(billContext.getAction())) {
            if (!CollectionUtils.isEmpty((Collection)bills)) {
                this.productClsService.checkIsEnd((BizObject)bills.get(0), "aa.salearea.SaleArea");
            }
            if (saleArea.get("saleAreaApplyRange_isCreator") != null && !Boolean.parseBoolean(saleArea.get("saleAreaApplyRange_isCreator").toString())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SALE_AREA_CAN_NOT_DELETE, new Object[]{saleArea.getCode()});
            }
            deleteResult = this.beforeDelete(saleArea);
            if (deleteResult != null) {
                return deleteResult;
            }
            List<String> subOrgs = this.iupcControlRuleService.getSubOrgs(saleArea.getOrgId());
            TreeApplyRangeUtils.getInstance().updateRangeIsEndByPrantClsAndOrg((BizObject)saleArea, 1, "salearea_id", subOrgs, "aa.salearea.SaleArea", "aa.salearea.SaleAreaApplyRange");
        }
        if ("stop".equals(billContext.getAction())) {
            if (saleArea.getId() == null) {
                return new RuleExecuteResult(0, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080113", (String)"\u975e\u5e38\u89c4\u64cd\u4f5c"));
            }
            HashMap<String, Object> map = new HashMap<String, Object>();
            map.put("id", saleArea.getId());
            map.put("table", "aa_salearea");
            SqlHelper.update((String)"com.yonyoucloud.upc.aa.cust.updateAreaStopStatus", map);
        }
        return new RuleExecuteResult();
    }

    private void chechParentStatus(SaleArea saleArea) throws Exception {
        if (saleArea.containsKey((Object)"stopstatus") && saleArea.getStopstatus() != null && saleArea.getStopstatus().booleanValue()) {
            return;
        }
        if (saleArea.getEntityStatus() == EntityStatus.Insert || saleArea.getEntityStatus() == EntityStatus.Update) {
            QuerySchema schema = QuerySchema.create().addSelect("stopstatus, orgId").addCondition((ConditionExpression)QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)saleArea.getParent())}));
            List saleAreas = MetaDaoHelper.query((String)"aa.salearea.SaleArea", (QuerySchema)schema);
            if (saleAreas == null || saleAreas.size() == 0) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800319);
            }
            Boolean stopstatus = (Boolean)((Map)saleAreas.get(0)).get("stopstatus");
            if (stopstatus.booleanValue()) {
                Object[] objectArray = new Object[1];
                objectArray[0] = MultilangUtil.getAttr((String)"aa.salearea.SaleArea", (String)"name", (BizObject)saleArea, null);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800320, objectArray);
            }
            if (!((Map)saleAreas.get(0)).get("orgId").toString().equals(saleArea.getOrgId()) && !MerchantUtils.getAllowSelectNonLeafNodes()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800157);
            }
        }
    }

    private void checksParentRefer(SaleArea saleArea) throws Exception {
        if (saleArea.getEntityStatus() == EntityStatus.Insert || saleArea.getEntityStatus() == EntityStatus.Update) {
            QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"customerArea").eq((Object)saleArea.getParent()), QueryCondition.name((String)"channCustomerArea").eq((Object)saleArea.getParent())}));
            List settlemethods = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)schema);
            schema = QuerySchema.create();
            schema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"saleAreaId").eq((Object)saleArea.getParent())}));
            List customerAreaList = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)schema);
            if (!CollectionUtils.isEmpty((Collection)settlemethods) || !CollectionUtils.isEmpty((Collection)customerAreaList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800321);
            }
        }
    }

    private void dealSaleareaRange(SaleArea saleArea, List<String> rangeOrgIdListInDb) throws Exception {
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        if (saleArea.getEntityStatus() == EntityStatus.Insert && CollectionUtils.isEmpty((Collection)saleArea.saleAreaApplyRange())) {
            this.setRanges(saleArea, rangeOrgIdListInDb);
            if (!this.pubOptionService.getOrgGlobalShare("aa.salearea.SaleArea").booleanValue() && TreeApplyRangeUtils.getInstance().isApiOrExcelData((BizObject)saleArea)) {
                this.setApplierRanges(saleArea, rangeOrgIdListInDb);
            }
        }
        if (saleArea.getEntityStatus() == EntityStatus.Update) {
            if (!saleArea.containsKey((Object)"_fromApi") || !((Boolean)saleArea.get("_fromApi")).booleanValue()) {
                Map manageClsOrg = MetaDaoHelper.queryOne((String)"aa.salearea.SaleArea", (QuerySchema)QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(saleArea.getId())})));
                if (manageClsOrg == null || manageClsOrg.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800163);
                }
                if (!singleOrg.booleanValue() && !manageClsOrg.get("orgId").toString().equals(saleArea.getOrgId())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800159);
                }
                List<String> subOrgs = this.iupcControlRuleService.getSubOrgs(saleArea.getOrgId());
                TreeApplyRangeUtils.getInstance().updateRangeIsEndByPrantClsAndOrg((BizObject)saleArea, 1, "salearea_id", subOrgs, "aa.salearea.SaleArea", "aa.salearea.SaleAreaApplyRange");
                if (saleArea.getParent() != null) {
                    subOrgs.add(saleArea.getOrgId());
                    TreeApplyRangeUtils.getInstance().updateRangeIsEndByClsAndOrg(0, "salearea_id", saleArea.getParent(), subOrgs, "aa.salearea.SaleAreaApplyRange");
                }
            } else {
                TreeApplyRangeUtils.getInstance().checkCreatOrg(saleArea.getId(), saleArea.getOrgId(), "aa.salearea.SaleArea");
                QuerySchema schema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"saleArea").eq(saleArea.getId())}));
                List ranges = MetaDaoHelper.query((String)"aa.salearea.SaleAreaApplyRange", (QuerySchema)schema);
                if (CollectionUtils.isEmpty((Collection)ranges)) {
                    this.setRanges(saleArea, rangeOrgIdListInDb);
                    this.setApplierRanges(saleArea, rangeOrgIdListInDb);
                } else if (ranges.size() == 1) {
                    this.setApplierRanges(saleArea, rangeOrgIdListInDb);
                }
            }
        }
    }

    public void setRanges(SaleArea saleArea, List<String> rangeOrgIdListInDb) {
        ArrayList<SaleAreaApplyRange> ranges = saleArea.saleAreaApplyRange();
        if (ranges == null || ranges.size() < 1) {
            ranges = new ArrayList<SaleAreaApplyRange>();
            ranges.add(TreeApplyRangeUtils.getInstance().getSalearesApplyRange((Long)saleArea.getId(), saleArea.getOrgId(), true, true));
            Iterator iterator = ranges.iterator();
            while (iterator.hasNext()) {
                SaleAreaApplyRange next = (SaleAreaApplyRange)iterator.next();
                if (!rangeOrgIdListInDb.contains(next.getOrgId())) continue;
                iterator.remove();
            }
            saleArea.setSaleAreaApplyRange(ranges);
        }
    }

    public void setApplierRanges(SaleArea saleArea, List<String> rangeOrgIdListInDb) throws Exception {
        List<String> shareAll;
        ArrayList<SaleAreaApplyRange> ranges = saleArea.saleAreaApplyRange();
        if (ranges == null) {
            ranges = new ArrayList<SaleAreaApplyRange>();
        }
        ArrayList<String> orgs = new ArrayList<String>();
        orgs.add(saleArea.getOrgId());
        List<String> autoShareOrg = this.iupcControlRuleService.getVoucherManageShareOrgs("aa.salearea.SaleArea", orgs);
        if (!CollectionUtils.isEmpty(autoShareOrg) && !CollectionUtils.isEmpty(shareAll = this.iupcControlRuleService.getOrgRangeShareAll("aa.salearea.SaleArea", saleArea.getOrgId()))) {
            for (String org : shareAll) {
                if (org.equals(saleArea.getOrgId())) continue;
                ranges.add(TreeApplyRangeUtils.getInstance().getSalearesApplyRange((Long)saleArea.getId(), org, true, false));
            }
        }
        Iterator iterator = ranges.iterator();
        while (iterator.hasNext()) {
            SaleAreaApplyRange next = (SaleAreaApplyRange)iterator.next();
            if (!rangeOrgIdListInDb.contains(next.getOrgId())) continue;
            iterator.remove();
        }
        saleArea.setSaleAreaApplyRange(ranges);
    }

    private RuleExecuteResult chechRefered(long cId) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"saleAreaId").eq((Object)cId)}));
        List checkResult = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)schema);
        if (checkResult != null && checkResult.size() > 0) {
            return new RuleExecuteResult(0, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080114", (String)"\u9500\u552e\u533a\u57df\u5df2\u88ab\u5ba2\u6237\u5f15\u7528"));
        }
        return null;
    }

    private RuleExecuteResult beforeDelete(SaleArea saleArea) throws Exception {
        RuleExecuteResult ruleResult = this.chechRefered((Long)saleArea.getId());
        if (ruleResult != null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.SALE_AREA_IS_USED_IN_CUSTOMER_CAN_NOT_DELETE);
        }
        return null;
    }

    private List<String> getRangeOrgIdList(String saleAreaId) throws Exception {
        ArrayList<String> rangeOrgIdListInDb = new ArrayList<String>();
        if (saleAreaId == null) {
            return rangeOrgIdListInDb;
        }
        QuerySchema rangeOrgIdListSchema = QuerySchema.create().addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"saleArea").eq((Object)saleAreaId)}));
        List orglist = MetaDaoHelper.query((String)"aa.salearea.SaleAreaApplyRange", (QuerySchema)rangeOrgIdListSchema);
        if (orglist == null || orglist.size() == 0) {
            return rangeOrgIdListInDb;
        }
        for (Map item : orglist) {
            rangeOrgIdListInDb.add(item.get("orgId").toString());
        }
        return rangeOrgIdListInDb;
    }
}

