/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo
 *  com.yonyoucloud.upc.service.IUPCMerchantSyncService
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
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.google.gson.Gson;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo;
import com.yonyoucloud.upc.service.IUPCMerchantSyncService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.springframework.util.CollectionUtils;

@Component(value="merchantRangeSyncVendorRule")
public class MerchantRangeSyncVendorRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(MerchantRangeSyncVendorRule.class);
    @Autowired
    private IUPCMerchantSyncService iupcMerchantSyncService;
    private static final String BILL_NUM = "aa_vendor";

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, paramMap);
        try {
            for (BizObject bill : bills) {
                QuerySchema querySchema;
                Map merchantRoleInfoSql;
                String businessRole;
                Merchant merchant = (Merchant)bill;
                List merchantApplyRanges = merchant.merchantApplyRanges();
                if (CollectionUtils.isEmpty((Collection)merchantApplyRanges) || merchantApplyRanges.get(0) == null) {
                    QuerySchema query = QuerySchema.create().addSelect("id,shop,orgId,merchantId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                    merchantApplyRanges = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)query, null);
                }
                if (CollectionUtils.isEmpty((Collection)merchantApplyRanges) || merchantApplyRanges.get(0) == null) continue;
                MerchantRoleInfo merchantRoleInfo = merchant.merchantRole();
                if (!CollectionUtils.isEmpty((Map)merchantRoleInfo) && merchant.merchantRole().getBusinessRole() != null ? !(businessRole = merchant.merchantRole().getBusinessRole()).contains("4") && !businessRole.contains("3") && !businessRole.contains("5") : CollectionUtils.isEmpty((Map)(merchantRoleInfoSql = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)(querySchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"businessRole").like((Object)"3"), QueryCondition.name((String)"businessRole").like((Object)"4"), QueryCondition.name((String)"businessRole").like((Object)"5")})}))))))) {
                    return new RuleExecuteResult();
                }
                HashMap<String, Object> param = new HashMap<String, Object>();
                this.createParamters(param, this.transMerchantApplyRangesToMap(merchant, merchantApplyRanges));
                HashMap<String, String> map = new HashMap<String, String>(1);
                map.put("businessCreateVendor", "true");
                this.iupcMerchantSyncService.saveMerchantRangeToVendor(new Gson().toJson(param), map);
            }
        }
        catch (Exception e) {
            log.error("MerchantRangeSyncVendorRule:" + e.getMessage(), (Throwable)e);
        }
        return new RuleExecuteResult();
    }

    private void createParamters(Map<String, Object> paramMap, List<Map<String, Object>> dataList) {
        paramMap.put("billnum", BILL_NUM);
        paramMap.put("data", dataList);
        paramMap.put("parameters", new Object());
        paramMap.put("filterId", 0);
        paramMap.put("isIncludeMeta", false);
        paramMap.put("isOnlyTotal", false);
        paramMap.put("isOnlyCount", false);
        paramMap.put("isPrint", false);
        paramMap.put("chartIndex", 0);
        paramMap.put("isMasterOrg", false);
        paramMap.put("fromApi", false);
        paramMap.put("isDistinct", false);
        paramMap.put("onlyCount", false);
        paramMap.put("distinct", false);
        paramMap.put("publish", false);
        paramMap.put("onlyTotal", false);
        paramMap.put("includeMeta", false);
        paramMap.put("print", false);
        paramMap.put("sum", false);
        paramMap.put("masterOrg", false);
        paramMap.put("fromKanban", false);
    }

    private List<Map<String, Object>> transMerchantApplyRangesToMap(Merchant merchant, List<MerchantApplyRange> merchantApplyRanges) throws Exception {
        ArrayList<Map<String, Object>> vendorMapList = new ArrayList<Map<String, Object>>(merchantApplyRanges.size());
        List<Map<String, Object>> orgsAttr = this.getOrgsAttr(merchantApplyRanges);
        merchantApplyRanges.stream().forEach(merchantApplyRange -> orgsAttr.stream().forEach(org -> {
            if (org.get("id").equals(merchantApplyRange.getOrgId())) {
                HashMap<String, Object> map = new HashMap<String, Object>();
                map.put("tenant", AppContext.getCurrentUser().getTenant());
                map.put("_status", EntityStatus.Insert);
                map.put("isCreator", true);
                map.put("isApplied", true);
                map.put("code", org.get("code"));
                HashMap nameMap = new HashMap();
                nameMap.put("zh_CN", org.get("name"));
                nameMap.put("en_US", org.get("name"));
                nameMap.put("zh_TW", org.get("name"));
                map.put("name", nameMap);
                map.put("org", merchantApplyRange.getMerchantId().toString());
                map.put("orgName", merchant.get("name"));
                map.put("creditcode", merchant.getCreditCode());
                map.put("vendorclass", null);
                map.put("datasource", "100_");
                map.put("accessstatus", "1");
                map.put("freezestatus", false);
                map.put("country", merchant.getCountry());
                map.put("regionCode", merchant.getRegionCode());
                map.put("vendorphone", merchant.getContactTel());
                map.put("id", Long.valueOf(org.get("id").toString()));
                map.put("correspondingorg", merchantApplyRange.getOrgId());
                HashMap<String, Object> vendorOrg = new HashMap<String, Object>();
                vendorOrg.put("hasDefaultInit", true);
                vendorOrg.put("isCreator", true);
                vendorOrg.put("rangeType", 1);
                vendorOrg.put("isApplied", true);
                vendorOrg.put("vendororg", Long.valueOf(org.get("id").toString()));
                vendorOrg.put("org_code", merchant.getCode());
                vendorOrg.put("org", merchant.getId().toString());
                vendorOrg.put("org_name", merchant.get("name"));
                vendorOrg.put("_status", EntityStatus.Insert);
                ArrayList<HashMap<String, Object>> vendorOrgs = new ArrayList<HashMap<String, Object>>(1);
                vendorOrgs.add(vendorOrg);
                map.put("vendorOrgs", vendorOrgs);
                vendorMapList.add(map);
            }
        }));
        if (CollectionUtils.isEmpty(vendorMapList)) {
            return new ArrayList<Map<String, Object>>();
        }
        return vendorMapList;
    }

    private List<Map<String, Object>> getOrgsAttr(List<MerchantApplyRange> merchantApplyRanges) throws Exception {
        ArrayList orgsList = new ArrayList(merchantApplyRanges.size());
        merchantApplyRanges.parallelStream().forEach(merchantApplyRange -> orgsList.add(merchantApplyRange.getOrgId()));
        if (CollectionUtils.isEmpty(orgsList)) {
            return new ArrayList<Map<String, Object>>();
        }
        QuerySchema querySchemaStaff = QuerySchema.create().addSelect("id,code,name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgsList)}));
        List mapList = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)querySchemaStaff, (String)"ucf-org-center");
        if (CollectionUtils.isEmpty((Collection)mapList)) {
            return new ArrayList<Map<String, Object>>();
        }
        return mapList;
    }
}

