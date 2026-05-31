/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.org.service.itf.IExternalOrgManagerService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyoucloud.upc.aa.merchant.IsExistPotential
 *  com.yonyoucloud.upc.aa.merchant.IsTradeCustomers
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo
 *  com.yonyoucloud.upc.service.IUPCMerchantSyncService
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.org.service.itf.IExternalOrgManagerService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyoucloud.upc.aa.merchant.IsExistPotential;
import com.yonyoucloud.upc.aa.merchant.IsTradeCustomers;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo;
import com.yonyoucloud.upc.service.IUPCMerchantSyncService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="merchantSaveExternalOrgRule")
public class MerchantSaveExternalOrgRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(MerchantSaveExternalOrgRule.class);
    @Autowired
    private IUPCMerchantSyncService iupcMerchantSyncService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    private IExternalOrgManagerService iExternalOrgManagerService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        for (BizObject bill : bills) {
            Merchant merchant = (Merchant)bill;
            if (merchant.merchantRole() != null && StringUtils.isNotBlank((CharSequence)merchant.merchantRole().getBusinessRole()) && merchant.merchantsManager() != null && (StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getMobile()) || StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getEmail()))) {
                if (merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("5")) {
                    this.saveExternalOrg(billContext.getAction(), merchant);
                } else if (EntityStatus.Update == merchant.getEntityStatus()) {
                    this.deleteExternalOrg(merchant);
                }
            } else if (EntityStatus.Update == merchant.getEntityStatus() && merchant.merchantRole() != null && merchant.merchantRole().containsValue((Object)"businessRole") && StringUtils.isNotBlank((CharSequence)merchant.merchantRole().getBusinessRole())) {
                this.deleteExternalOrg(merchant);
            }
            if (MerchantUtils.isExists((Map)merchant, (String)"srcBill") && "CRM".equals(merchant.get("srcBill"))) continue;
            this.createRetail(merchant);
        }
        return new RuleExecuteResult();
    }

    public void saveExternalOrg(String action, Merchant merchant) {
        this.iupcMerchantSyncService.executeUpdate(action, MerchantUtils.transferExternalOrg((Merchant)merchant));
    }

    public void createRetail(Merchant merchant) throws Exception {
        if (merchant.merchantRole() == null) {
            return;
        }
        String businessRole = merchant.merchantRole().getBusinessRole();
        if (!StringUtils.isEmpty((CharSequence)businessRole) && businessRole.contains("4")) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)("SH" + merchant.getCode()))}));
            List merchantList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
            if (EntityStatus.Insert.equals((Object)merchant.getEntityStatus()) && !CollectionUtils.isEmpty((Collection)merchantList)) {
                Merchant merchants = new Merchant();
                merchants.setId(((Map)merchantList.get(0)).get("id"));
                MetaDaoHelper.delete((String)"aa.merchant.Merchant", (BizObject)merchants);
                querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchants.getId())}));
                List merchantRoleInfolist = MetaDaoHelper.query((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Collection)merchantRoleInfolist)) {
                    MerchantRoleInfo merchantRoleInfo = new MerchantRoleInfo();
                    merchantRoleInfo.setMerchantId((Long)merchants.getId());
                    merchantRoleInfo.setId(((Map)merchantRoleInfolist.get(0)).get("id"));
                    MetaDaoHelper.delete((String)"aa.merchant.MerchantRoleInfo", (BizObject)merchantRoleInfo);
                }
                querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchants.getId())}));
                List merchantApplyRangelist = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Collection)merchantApplyRangelist)) {
                    MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
                    merchantApplyRange.setMerchantId((Long)merchants.getId());
                    merchantApplyRange.setId(((Map)merchantApplyRangelist.get(0)).get("id"));
                    MetaDaoHelper.delete((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
                }
                if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    querySchema = QuerySchema.create();
                    querySchema.addSelect("merchantApplyRangeId");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchants.getId())}));
                    List merchantApplyRangeDetaillist = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema);
                    if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetaillist)) {
                        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                        merchantApplyRangeDetail.set("id", merchants.getId());
                        merchantApplyRangeDetail.set("merchantApplyRangeId", ((Map)merchantApplyRangeDetaillist.get(0)).get("id"));
                        MetaDaoHelper.delete((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                    }
                }
            } else if (EntityStatus.Update.equals((Object)merchant.getEntityStatus()) && !CollectionUtils.isEmpty((Collection)merchantList)) {
                return;
            }
            if (EntityStatus.Unchanged.equals((Object)merchant.getEntityStatus())) {
                return;
            }
            Merchant merchant1 = new Merchant();
            merchant1.setId((Object)IdManager.getInstance().nextId());
            merchant1.setCode("SH" + merchant.getCode());
            String path = merchant1.getId() + "|";
            merchant1.setPath(path);
            merchant1.setName(MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)merchant, null) + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408029B", (String)"\u6563\u6237"));
            merchant1.setCreateOrg(merchant.getId().toString());
            merchant1.setCreateMerchant((Long)merchant.getId());
            merchant1.setEnterpriseName(merchant.getEnterpriseName());
            merchant1.setRetailInvestors(Boolean.valueOf(true));
            merchant1.remove("orgId");
            merchant1.setCustomerClass(merchant.getCustomerClass());
            merchant1.setTaxPayingCategories(merchant.getTaxPayingCategories());
            merchant1.setEnterpriseNature(merchant.getEnterpriseNature());
            merchant1.setIsExistPotential(IsExistPotential.allRegularCust.getValue());
            merchant1.setEntityStatus(EntityStatus.Insert);
            String[] commonExcludeList = new String[]{"ytenant", "tenant", "pubts"};
            MerchantRoleInfo merchantRoleInfo = new MerchantRoleInfo();
            BeanUtils.copyProperties((Object)merchant.merchantRole(), (Object)merchantRoleInfo, (String[])commonExcludeList);
            merchantRoleInfo.setId((Object)IdManager.getInstance().nextId());
            merchantRoleInfo.setBusinessRole("1");
            merchantRoleInfo.set("merchantOptions", (Object)false);
            merchantRoleInfo.setMerchantId((Long)merchant1.getId());
            merchantRoleInfo.setEntityStatus(EntityStatus.Insert);
            merchant1.setMerchantRole(merchantRoleInfo);
            MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
            if (!CollectionUtils.isEmpty((Collection)merchant.merchantApplyRanges())) {
                BeanUtils.copyProperties(merchant.merchantApplyRanges().get(0), (Object)merchantApplyRange, (String[])commonExcludeList);
            }
            merchantApplyRange.setId((Object)IdManager.getInstance().nextId());
            merchantApplyRange.setShop((Long)merchant.getId());
            merchantApplyRange.setOrgId(merchant.getId().toString());
            merchantApplyRange.setIsCreator(Boolean.valueOf(true));
            merchantApplyRange.setIsApplied(Boolean.valueOf(true));
            merchantApplyRange.setMerchantId((Long)merchant1.getId());
            merchantApplyRange.setRangeType(Integer.valueOf(3));
            merchantApplyRange.setIsPotential(Boolean.valueOf(false));
            merchantApplyRange.setIsSalesOrg(Boolean.valueOf(true));
            merchantApplyRange.setEntityStatus(EntityStatus.Insert);
            ArrayList<MerchantApplyRange> merchantApplyRangeList = new ArrayList<MerchantApplyRange>();
            merchantApplyRangeList.add(merchantApplyRange);
            merchant1.setMerchantApplyRanges(merchantApplyRangeList);
            MerchantApplyRangeDetail merchantApplyRangeDetails = new MerchantApplyRangeDetail();
            if (!CollectionUtils.isEmpty((Collection)merchant.merchantAppliedDetail())) {
                String[] excludeList = new String[]{"belongMerchant", "transactionCurrency", "professSalesman", "specialManagementDep", "customerArea", "ytenant", "tenant", "pubts"};
                BeanUtils.copyProperties(merchant.merchantAppliedDetail().get(0), (Object)merchantApplyRangeDetails, (String[])excludeList);
            }
            merchantApplyRangeDetails.set("id", merchant1.getId());
            merchantApplyRangeDetails.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
            merchantApplyRangeDetails.remove("merchantApplyRangeExtId");
            merchantApplyRangeDetails.remove("customerLevel");
            merchantApplyRangeDetails.remove("customerType");
            merchantApplyRangeDetails.remove("deliveryWarehouse");
            merchantApplyRangeDetails.remove("transactionCurrency");
            merchantApplyRangeDetails.remove("exchangeratetype");
            merchantApplyRangeDetails.remove("taxRate");
            merchantApplyRangeDetails.remove("payway");
            merchantApplyRangeDetails.remove("creditServiceDay");
            merchantApplyRangeDetails.remove("collectionAgreement");
            merchantApplyRangeDetails.remove("settlementMethod");
            merchantApplyRangeDetails.remove("shipmentMethod");
            merchantApplyRangeDetails.setEntityStatus(EntityStatus.Insert);
            merchantApplyRangeDetails.setIsTradeCustomers(IsTradeCustomers.tradeCustomers.getValue());
            ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
            merchantApplyRangeDetailList.add(merchantApplyRangeDetails);
            merchant1.setMerchantAppliedDetail(merchantApplyRangeDetailList);
            this.merchantGroupService.saveMerchantApplyRangeGroup(merchant1);
            MetaDaoHelper.insert((String)"aa.merchant.Merchant", (BizObject)merchant1);
        }
    }

    private void deleteExternalOrg(Merchant merchant) throws Exception {
        String businessRole;
        QuerySchema schema = QuerySchema.create();
        schema.addSelect("id,businessRole");
        schema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchant.getId().toString())}));
        Map merchantRole = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)schema);
        if (!CollectionUtils.isEmpty((Map)merchantRole) && merchantRole.get("businessRole") != null && ((businessRole = merchantRole.get("businessRole").toString()).contains("4") || businessRole.contains("3") || businessRole.contains("5"))) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchant.getId().toString()), QueryCondition.name((String)"dr").eq((Object)0), QueryCondition.name((String)"externalorg").eq((Object)1)}));
            List externalOrgList = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)querySchema, (String)"ucf-org-center");
            if (!CollectionUtils.isEmpty((Collection)externalOrgList)) {
                this.iExternalOrgManagerService.disable(AppContext.getCurrentUser().getYhtTenantId(), AppContext.getCurrentUser().getYhtUserId(), merchant.getId().toString());
                ArrayList<String> externalOrgIdList = new ArrayList<String>();
                externalOrgIdList.add(merchant.getId().toString());
                this.iExternalOrgManagerService.batchDelete(AppContext.getCurrentUser().getYTenantId(), AppContext.getCurrentUser().getYhtUserId(), externalOrgIdList);
            }
        }
    }
}

