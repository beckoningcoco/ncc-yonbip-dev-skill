/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.org.service.itf.core.IFuncTypeQueryService
 *  com.yonyou.iuap.support.i18n.locale.core.zone.YonBipTimeZones
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.basedoc.model.BaseRegionVO
 *  com.yonyou.ucf.basedoc.model.rpcparams.BaseRegionParams
 *  com.yonyou.ucf.basedoc.service.itf.IBaseRegionService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ucf.mdd.ext.util.json.GsonHelper
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  com.yonyoucloud.fi.tmsp.openapi.ITmspBizPartnerService
 *  com.yonyoucloud.fi.tmsp.vo.FundBizObjArchInsertReq
 *  com.yonyoucloud.fi.tmsp.vo.FundBizObjArchQueryReq
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.vendor.Vendor
 *  com.yonyoucloud.upc.base.businesspartner.BankData
 *  com.yonyoucloud.upc.base.businesspartner.BusinessPartner
 *  com.yonyoucloud.upc.base.businesspartner.LicenseType
 *  com.yonyoucloud.upc.base.businesspartner.LinkBy
 *  com.yonyoucloud.upc.base.businesspartner.LinkObject
 *  com.yonyoucloud.upc.base.businesspartner.MatchFieldValueChange
 *  com.yonyoucloud.upc.base.businesspartner.PartnerCapitalComparison
 *  com.yonyoucloud.upc.base.businesspartner.PartnerLinkPlan
 *  com.yonyoucloud.upc.base.businesspartner.PartnerLinkRule
 *  com.yonyoucloud.upc.base.businesspartner.PartnerMerchantComparison
 *  com.yonyoucloud.upc.base.businesspartner.PartnerSyncPlan
 *  com.yonyoucloud.upc.base.businesspartner.PartnerSyncRule
 *  com.yonyoucloud.upc.base.businesspartner.PartnerType
 *  com.yonyoucloud.upc.base.businesspartner.PartnerVendorComparison
 *  com.yonyoucloud.upc.base.businesspartner.RoleClass
 *  com.yonyoucloud.upc.base.businesspartner.RoleClassName
 *  com.yonyoucloud.upc.base.businesspartner.Status
 *  com.yonyoucloud.upc.base.businesspartner.SyncCascadeObject
 *  com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService
 *  com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubService
 *  com.yonyoucloud.upc.pub.api.vendor.vo.vendor.VendorVO
 *  com.yonyoucloud.upc.utils.BusinessPartnerUtils
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.PartnerConstant
 *  com.yonyoucloud.upc.utils.PingYinUtil
 *  com.yonyoucloud.upc.utils.RegexUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.cache.RedisManager
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.businesspartner;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.org.service.itf.core.IFuncTypeQueryService;
import com.yonyou.iuap.support.i18n.locale.core.zone.YonBipTimeZones;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.basedoc.model.BaseRegionVO;
import com.yonyou.ucf.basedoc.model.rpcparams.BaseRegionParams;
import com.yonyou.ucf.basedoc.service.itf.IBaseRegionService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ucf.mdd.ext.util.json.GsonHelper;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyoucloud.fi.tmsp.openapi.ITmspBizPartnerService;
import com.yonyoucloud.fi.tmsp.vo.FundBizObjArchInsertReq;
import com.yonyoucloud.fi.tmsp.vo.FundBizObjArchQueryReq;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.vendor.Vendor;
import com.yonyoucloud.upc.base.businesspartner.BankData;
import com.yonyoucloud.upc.base.businesspartner.BusinessPartner;
import com.yonyoucloud.upc.base.businesspartner.LicenseType;
import com.yonyoucloud.upc.base.businesspartner.LinkBy;
import com.yonyoucloud.upc.base.businesspartner.LinkObject;
import com.yonyoucloud.upc.base.businesspartner.MatchFieldValueChange;
import com.yonyoucloud.upc.base.businesspartner.PartnerCapitalComparison;
import com.yonyoucloud.upc.base.businesspartner.PartnerLinkPlan;
import com.yonyoucloud.upc.base.businesspartner.PartnerLinkRule;
import com.yonyoucloud.upc.base.businesspartner.PartnerMerchantComparison;
import com.yonyoucloud.upc.base.businesspartner.PartnerSyncPlan;
import com.yonyoucloud.upc.base.businesspartner.PartnerSyncRule;
import com.yonyoucloud.upc.base.businesspartner.PartnerType;
import com.yonyoucloud.upc.base.businesspartner.PartnerVendorComparison;
import com.yonyoucloud.upc.base.businesspartner.RoleClass;
import com.yonyoucloud.upc.base.businesspartner.RoleClassName;
import com.yonyoucloud.upc.base.businesspartner.Status;
import com.yonyoucloud.upc.base.businesspartner.SyncCascadeObject;
import com.yonyoucloud.upc.billrule.businesspartner.BusinessPartnerComparatorManager;
import com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService;
import com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubService;
import com.yonyoucloud.upc.pub.api.vendor.vo.vendor.VendorVO;
import com.yonyoucloud.upc.service.BusinessPartnerService;
import com.yonyoucloud.upc.service.api.BusinessPartnerServiceImpl;
import com.yonyoucloud.upc.utils.BusinessPartnerUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.PartnerConstant;
import com.yonyoucloud.upc.utils.PingYinUtil;
import com.yonyoucloud.upc.utils.RegexUtils;
import java.io.UnsupportedEncodingException;
import java.lang.invoke.LambdaMetafactory;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.cache.RedisManager;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Component(value="businessPartnerSaveBeforeRule")
public class BusinessPartnerSaveBeforeRule
extends AbstractCommonRule {
    @Autowired
    private BusinessPartnerService partnerService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private BusinessPartnerServiceImpl businessPartnerServiceImpl;
    @Autowired
    private BusinessPartnerService businessPartnerService;
    @Autowired
    private IFuncTypeQueryService funcTypeQueryService;
    @Autowired
    private IVendorPubService vendorPublicService;
    @Autowired
    private IBaseRegionService baseRegionService;
    @Autowired
    private IVendorPubQueryService vendorPubQueryService;
    @Autowired
    private BusinessPartnerComparatorManager comparatorManager;
    @Lazy
    @Autowired
    private ITmspBizPartnerService capitalPartnerService;
    @Autowired
    private IBDQueryRepository billQueryRepository;
    Logger logger = LoggerFactory.getLogger(BusinessPartnerSaveBeforeRule.class);

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List partnerList = this.getBills(billContext, paramMap);
        Boolean isImport = billDataDto.getAsyncKey() != null && billDataDto.getImportMode() != null && billDataDto.getImportType() != null;
        Boolean isApi = ((BizObject)partnerList.get(0)).get("_fromApi") != null && (Boolean)((BusinessPartner)partnerList.get(0)).get("_fromApi") == true;
        String locale = InvocationInfoProxy.getLocale();
        for (BizObject bill : partnerList) {
            BusinessPartner partner = (BusinessPartner)bill;
            BusinessPartner partnerInDb = new BusinessPartner();
            this.setDefaultValue(partner, locale);
            this.checkData(partner, locale);
            this.checkUnique(partner, isImport, isApi, locale);
            if (partner.containsKey((Object)PartnerConstant.SPECIAL_KEY_FROM_NCC)) {
                this.businessPartnerServiceImpl.dealBusinessPartnerForNCC(partner);
                return new RuleExecuteResult();
            }
            this.uniformData(partner, isImport, isApi, partnerInDb, billDataDto);
            PartnerLinkPlan linkPlan = this.partnerService.getLinkPlan();
            partner.put("linkPlan", (Object)linkPlan);
            if (EntityStatus.Insert.equals((Object)partner.getEntityStatus()) && (partner.containsKey((Object)"vendorToPartner") || partner.containsKey((Object)"merchantToPartner"))) {
                this.isPartnerExists(partner, locale);
            }
            this.checkAndSetRoleClassChecks(partner);
            this.updateMissingFieldsWithDefaults(partner);
            this.automaticCorrelationControl(partner, billDataDto);
            this.setPartnerSyncPlanStatus(partner);
            this.dealBankData(partner, partnerInDb);
            partner.put("isImport", (Object)isImport);
            boolean isUpdateImport = billDataDto.getImportMode() != null && (billDataDto.getImportMode().equals(2) || billDataDto.getImportMode().equals(0) && EntityStatus.Update.equals((Object)partner.getEntityStatus()));
            partner.put("isUpdateImport", (Object)isUpdateImport);
            if (partner.containsKey((Object)"vendorSyncCascadeMerchant")) {
                this.vendorSyncCascadeMerchant(locale, partner);
            }
            if (partner.containsKey((Object)"merchantSyncCascadeVendor")) {
                this.merchantSyncCascadeVendor(locale, partner);
            }
            this.comparatorManager.processPartnerComparisons(partner);
        }
        return new RuleExecuteResult();
    }

    private void checkAndSetRoleClassChecks(BusinessPartner partner) {
        List roleClasses = partner.partnerRoleClasses();
        if (roleClasses != null && roleClasses.size() > 0) {
            for (RoleClass roleClass : roleClasses) {
                if (RoleClassName.vendor.equals((Object)roleClass.getRoleClassName()) && !CollectionUtils.isEmpty((Collection)partner.partnerVendorComparisons())) {
                    roleClass.setIsCheck(Boolean.valueOf(true));
                    continue;
                }
                if (RoleClassName.merchant.equals((Object)roleClass.getRoleClassName()) && !CollectionUtils.isEmpty((Collection)partner.partnerMerchantComparisons())) {
                    roleClass.setIsCheck(Boolean.valueOf(true));
                    continue;
                }
                if (RoleClassName.org.equals((Object)roleClass.getRoleClassName()) && partner.getInternalOrgId() != null) {
                    roleClass.setIsCheck(Boolean.valueOf(true));
                    continue;
                }
                if (!RoleClassName.CAPITAL.equals((Object)roleClass.getRoleClassName()) || CollectionUtils.isEmpty((Collection)partner.partnerCapitalComparisons())) continue;
                roleClass.setIsCheck(Boolean.valueOf(true));
            }
            this.validateAndSetOrgRoleChecks(partner, roleClasses);
        }
    }

    private void validateAndSetOrgRoleChecks(BusinessPartner partner, List<RoleClass> roleClasses) {
        for (RoleClass roleClass : roleClasses) {
            if (!RoleClassName.org.equals((Object)roleClass.getRoleClassName())) continue;
            if (!roleClass.getIsCheck().booleanValue()) {
                if (partner.getInternalOrgId() != null) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BUSINESS_PARTNER_ROLE_CLASS_0_ORG_ONLY_NULL, new Object[]{partner.getCode()});
                }
                if (partner.getFinancialSynergyFlag() == null || partner.getFinancialSynergyFlag() != PartnerConstant.INTEGER_YES) continue;
                throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_19DE6C8005B0000B", (String)"\u7f16\u7801\u4e3a\uff1a[%s]\u7684\u4e1a\u52a1\u4f19\u4f34\u7684\u7ec4\u7ec7\u89d2\u8272\u4e3a\u5426\uff0c\u662f\u5426\u8d22\u52a1\u534f\u540c\u53ea\u80fd\u4e3a\u5426\uff01"), partner.getCode()));
            }
            if (roleClass.getIsCheck().booleanValue() && partner.getInternalOrgId() == null) {
                throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080626", (String)"\u7f16\u7801\u4e3a\uff1a[%s]\u7684\u4e1a\u52a1\u4f19\u4f34\u7684\u7ec4\u7ec7\u89d2\u8272\u4e3a\u662f\uff0c\u5185\u90e8\u7ec4\u7ec7\u5b57\u6bb5\u4e0d\u80fd\u4e3a\u7a7a\uff01"), partner.getCode()));
            }
            if (partner.getInternalOrgId() == null || MerchantUtils.getIsInternalCustomer()) continue;
            boolean financeorg = this.funcTypeQueryService.orgHasFunc((String)AppContext.getYTenantId(), partner.getInternalOrgId(), "financeorg");
            if (!financeorg) {
                throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080628", (String)"\u7f16\u7801\u4e3a\uff1a[%s]\u7684\u4e1a\u52a1\u4f19\u4f34\u7684\u5185\u90e8\u7ec4\u7ec7\u4e0d\u5177\u6709\u4f1a\u8ba1\u4e3b\u4f53\u804c\u80fd\uff01"), partner.getCode()));
            }
            roleClass.setIsCheck(Boolean.valueOf(true));
        }
    }

    private void updateMissingFieldsWithDefaults(BusinessPartner partner) throws Exception {
        if (EntityStatus.Update.equals((Object)partner.getEntityStatus())) {
            if (CollectionUtils.isEmpty((Collection)partner.partnerRoleClasses())) {
                partner.setPartnerRoleClasses(BusinessPartnerUtils.queryPartnerRoleClass((String)((String)partner.getId()), null));
            }
            if (!partner.containsKey((Object)"creditCode")) {
                QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq(partner.getId()));
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"dr").eq((Object)0));
                QuerySchema schema = QuerySchema.create().addSelect("creditCode").addCondition((ConditionExpression)queryConditionGroup);
                Map criteriaMap = MetaDaoHelper.queryOne((String)"base.businesspartner.BusinessPartner", (QuerySchema)schema);
                if (criteriaMap != null && criteriaMap.get("creditCode") != null) {
                    partner.setCreditCode(criteriaMap.get("creditCode").toString());
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    private void automaticCorrelationControl(BusinessPartner partner, BillDataDto billDataDto) throws Exception {
        if (partner.get("partnerFrom") != null) {
            return;
        }
        linkPlan = (PartnerLinkPlan)partner.get("linkPlan");
        partnerLinkRules = linkPlan.planLinkRules();
        entityName = null;
        domain = null;
        locale = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
        roleClasses = partner.partnerRoleClasses();
        isImport = billDataDto.getImportMode() != null && billDataDto.getImportType() != null;
        partner.put("isImport", (Object)isImport);
        partner.put("linkPlanStopStatus", (Object)linkPlan.getStopstatus());
        if (CollectionUtils.isEmpty((Collection)roleClasses)) {
            return;
        }
        block5: for (RoleClass roleClass : roleClasses) {
            checkIsEnableLinkPlan = null;
            if (RoleClassName.org.equals((Object)roleClass.getRoleClassName())) continue;
            checkIsEnableLinkPlan = RoleClassName.CAPITAL.equals((Object)roleClass.getRoleClassName()) != false ? this.businessPartnerServiceImpl.checkIsEnableLinkPlan(linkPlan, "3") : this.businessPartnerServiceImpl.checkIsEnableLinkPlan(linkPlan, String.valueOf(roleClass.getRoleClassName().getValue()));
            if (!checkIsEnableLinkPlan.booleanValue()) {
                if (!roleClass.getIsCheck().equals(false)) continue;
                delComparisonByIdMap = new HashMap<String, Object>(4);
                delComparisonByIdMap.put("partner_id", partner.getId());
                delComparisonByIdMap.put("ytenant_id", AppContext.getYTenantId());
                if (RoleClassName.CAPITAL.equals((Object)roleClass.getRoleClassName())) {
                    partnerCapitalComparisons = BusinessPartnerUtils.queryCapitalComparisonByPartnerId((String)((String)partner.getId()));
                    if (CollectionUtils.isEmpty((Collection)partnerCapitalComparisons)) continue;
                    fundBizObjArchInsertReq = new FundBizObjArchInsertReq();
                    fundBizObjArchInsertReq.setBizPartner(null);
                    for (PartnerCapitalComparison partnerCapitalComparison : partnerCapitalComparisons) {
                        fundBizObjArchInsertReq.setFundBizObjId(partnerCapitalComparison.getCapitalId());
                        this.capitalPartnerService.deleteFundBizObjArch(fundBizObjArchInsertReq);
                    }
                    SqlHelper.update((String)"com.yonyoucloud.upc.data.businesspartner.delCapitalComparisonById", delComparisonByIdMap);
                    continue;
                }
                if (RoleClassName.vendor.equals((Object)roleClass.getRoleClassName())) {
                    partnerVendorComparisons = BusinessPartnerUtils.queryVendorComparisonByPartnerId((String)((String)partner.getId()));
                    if (CollectionUtils.isEmpty((Collection)partnerVendorComparisons)) continue;
                    for (PartnerVendorComparison partnerVendorComparison : partnerVendorComparisons) {
                        this.vendorPublicService.updateVendorBusinessPartner(partnerVendorComparison.getVendorId(), null);
                    }
                    SqlHelper.update((String)"com.yonyoucloud.upc.data.businesspartner.delVendorComparisonById", delComparisonByIdMap);
                    continue;
                }
                if (!RoleClassName.merchant.equals((Object)roleClass.getRoleClassName()) || CollectionUtils.isEmpty((Collection)(partnerMerchantComparisons = BusinessPartnerUtils.queryMerchantComparisonByPartnerId((String)((String)partner.getId()))))) continue;
                for (PartnerMerchantComparison partnerMerchantComparison : partnerMerchantComparisons) {
                    delComparisonByIdMap.put("businessPartner", null);
                    delComparisonByIdMap.put("merchantId", partnerMerchantComparison.getMerchantId());
                    SqlHelper.update((String)"com.yonyoucloud.upc.data.businesspartner.updateMerchantBusinessPartner", delComparisonByIdMap);
                }
                SqlHelper.update((String)"com.yonyoucloud.upc.data.businesspartner.delMerchantComparisonById", delComparisonByIdMap);
                continue;
            }
            for (PartnerLinkRule partnerLinkRule : partnerLinkRules) {
                block57: {
                    block55: {
                        block56: {
                            if (partnerLinkRule == null || partnerLinkRule.getLinkObject() == null || roleClass == null || roleClass.getRoleClassName() == null) {
                                this.logger.error("\u4e1a\u52a1\u4f19\u4f34\u5173\u8054\u65b9\u5f0f\u4e3a\u7a7a" + partnerLinkRules);
                                continue;
                            }
                            if (partnerLinkRule.getLinkObject().getValue() != roleClass.getRoleClassName().getValue() && (partnerLinkRule.getLinkObject().getValue() != 3 || RoleClassName.CAPITAL != roleClass.getRoleClassName())) continue;
                            if (partner.getEntityStatus() == EntityStatus.Update) {
                                if (MatchFieldValueChange.PRESERVE_ORIGINAL_ASSOCIATION == partnerLinkRule.getMatchFieldValueChange()) {
                                    if (RoleClassName.merchant == roleClass.getRoleClassName() && partner.partnerMerchantComparisons() != null) {
                                        this.updateComparisonStatus(partner.partnerMerchantComparisons(), roleClass);
                                        continue;
                                    }
                                    if (RoleClassName.vendor == roleClass.getRoleClassName() && partner.partnerVendorComparisons() != null) {
                                        this.updateComparisonStatus(partner.partnerVendorComparisons(), roleClass);
                                        continue;
                                    }
                                    if (RoleClassName.CAPITAL == roleClass.getRoleClassName() && partner.partnerCapitalComparisons() != null) {
                                        this.updateComparisonStatus(partner.partnerCapitalComparisons(), roleClass);
                                        continue;
                                    }
                                } else {
                                    switch (7.$SwitchMap$com$yonyoucloud$upc$base$businesspartner$RoleClassName[roleClass.getRoleClassName().ordinal()]) {
                                        case 1: {
                                            if (CollectionUtils.isEmpty((Collection)partner.partnerMerchantComparisons())) break;
                                            this.clearAndResetMerchantAssociations(partner, partner.partnerMerchantComparisons());
                                            break;
                                        }
                                        case 2: {
                                            if (CollectionUtils.isEmpty((Collection)partner.partnerVendorComparisons())) break;
                                            this.clearAndResetVendorAssociations(partner, partner.partnerVendorComparisons());
                                            break;
                                        }
                                        case 3: {
                                            if (CollectionUtils.isEmpty((Collection)partner.partnerCapitalComparisons())) break;
                                            this.clearAndResetCapitalAssociations(partner, partner.partnerCapitalComparisons());
                                        }
                                    }
                                }
                            }
                            if (RoleClassName.CAPITAL == roleClass.getRoleClassName()) {
                                fundBizObjArchQueryReq = new FundBizObjArchQueryReq();
                                fundBusinObjArchivesResp = null;
                                if (partnerLinkRule.getLinkBy().getValue() == LinkBy.BY_NAME.getValue()) {
                                    name = this.businessPartnerService.mulLangObjectConvertString(partner.get("name"), locale);
                                    if (name == null || "".equals(name)) {
                                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BUSINESS_PARTNER_NAME_NOT_NULL);
                                    }
                                    fundBizObjArchQueryReq.setName(name);
                                    fundBusinObjArchivesResp = this.capitalPartnerService.queryFundBizObjArch(fundBizObjArchQueryReq);
                                } else if (partnerLinkRule.getLinkBy().getValue() == LinkBy.BY_CREDIT_CODE.getValue()) {
                                    if (partner.getCreditCode() != null) {
                                        fundBizObjArchQueryReq.setUnifiedSocialCreditCode(partner.getCreditCode());
                                    } else {
                                        if (CollectionUtils.isEmpty((Collection)partner.partnerCapitalComparisons())) continue block5;
                                        for (PartnerCapitalComparison partnerCapitalComparison : partner.partnerCapitalComparisons()) {
                                            if (partnerCapitalComparison.getCapitalId() != null) continue;
                                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BUSINESS_PARTNER_CAPITAL_NOT_NULL_FOR_FUND);
                                        }
                                        continue block5;
                                    }
                                    fundBusinObjArchivesResp = this.capitalPartnerService.queryFundBizObjArch(fundBizObjArchQueryReq);
                                } else if (partnerLinkRule.getLinkBy() == LinkBy.BY_CODE) {
                                    if (partner.getCode() == null) continue block5;
                                    fundBizObjArchQueryReq.setCode(partner.getCode());
                                    fundBusinObjArchivesResp = this.capitalPartnerService.queryFundBizObjArch(fundBizObjArchQueryReq);
                                }
                                if (fundBusinObjArchivesResp == null) continue;
                                if (!CollectionUtils.isEmpty((Collection)partner.partnerCapitalComparisons())) {
                                    flag = true;
                                    partnerCapitalComparison = partner.partnerCapitalComparisons().iterator();
                                    while (partnerCapitalComparison.hasNext()) {
                                        partnerCapitalComparison = (PartnerCapitalComparison)partnerCapitalComparison.next();
                                        if (fundBusinObjArchivesResp.getId() == null || !fundBusinObjArchivesResp.getId().equals(partnerCapitalComparison.getCapitalId())) continue;
                                        flag = false;
                                        break;
                                    }
                                    if (flag) {
                                        capitalComparison = BusinessPartnerUtils.generateCapitalComparison((String)((String)partner.getId()), (String)fundBusinObjArchivesResp.getId());
                                        partner.partnerCapitalComparisons().add(capitalComparison);
                                        partner.setPartnerCapitalComparisons(partner.partnerCapitalComparisons());
                                    }
                                } else {
                                    capitalComparison = BusinessPartnerUtils.generateCapitalComparison((String)((String)partner.getId()), (String)fundBusinObjArchivesResp.getId());
                                    partner.setPartnerCapitalComparisons((List)new LinkedList<PartnerCapitalComparison>(){
                                        {
                                            this.add(capitalComparison);
                                        }
                                    });
                                }
                                roleClass.setIsCheck(Boolean.valueOf(true));
                                if (EntityStatus.Update.equals((Object)partner.getEntityStatus())) {
                                    roleClass.setEntityStatus(EntityStatus.Update);
                                }
                                fundBusinObjArchivesResp.setBizPartner((String)partner.getId());
                                fundBizObjArchInsertReq = new FundBizObjArchInsertReq();
                                fundBizObjArchInsertReq.setFundBizObjId(fundBusinObjArchivesResp.getId());
                                fundBizObjArchInsertReq.setBizPartner((String)partner.getId());
                                this.capitalPartnerService.deleteFundBizObjArch(fundBizObjArchInsertReq);
                                continue;
                            }
                            queryComparisonConditionGroup = new QueryConditionGroup();
                            if (partnerLinkRule.getLinkBy().getValue() != LinkBy.BY_NAME.getValue()) break block55;
                            name = this.businessPartnerService.mulLangObjectConvertString(partner.get("name"), locale);
                            if (name == null || "".equals(name)) break block56;
                            queryComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)name));
                            break block57;
                        }
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BUSINESS_PARTNER_NAME_NOT_NULL);
                    }
                    if (partnerLinkRule.getLinkBy().getValue() != LinkBy.BY_CREDIT_CODE.getValue()) ** GOTO lbl168
                    if (partner.getCreditCode() != null) {
                        if (roleClass.getRoleClassName().equals((Object)RoleClassName.merchant)) {
                            queryComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creditCode").eq((Object)partner.getCreditCode()));
                        } else if (roleClass.getRoleClassName().equals((Object)RoleClassName.vendor)) {
                            queryComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creditcode").eq((Object)partner.getCreditCode()));
                        }
                    } else {
                        if (roleClass.getRoleClassName().equals((Object)RoleClassName.merchant)) {
                            if (CollectionUtils.isEmpty((Collection)partner.partnerMerchantComparisons())) continue block5;
                            for (PartnerMerchantComparison partnerMerchantComparison : partner.partnerMerchantComparisons()) {
                                if (partnerMerchantComparison.getMerchantId() != null) continue;
                                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BUSINESS_PARTNER_CAPITAL_NOT_NULL_FOR_MERCHANT);
                            }
                            continue block5;
                        }
                        if (!roleClass.getRoleClassName().equals((Object)RoleClassName.vendor) || CollectionUtils.isEmpty((Collection)partner.partnerVendorComparisons())) continue block5;
                        for (PartnerMerchantComparison partnerMerchantComparison : partner.partnerVendorComparisons()) {
                            if (partnerMerchantComparison.getVendorId() != null) continue;
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BUSINESS_PARTNER_CAPITAL_NOT_NULL_FOR_VENDOR);
                        }
                        continue block5;
lbl168:
                        // 1 sources

                        if (partnerLinkRule.getLinkBy().getValue() == LinkBy.BY_CODE.getValue() && StringUtils.isNotBlank((CharSequence)partner.getCode())) {
                            queryComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)partner.getCode()));
                        }
                    }
                }
                schema = QuerySchema.create();
                if (partnerLinkRule.getLinkObject().equals((Object)LinkObject.MERCHANT)) {
                    schema.addSelect("id").addCondition((ConditionExpression)queryComparisonConditionGroup);
                    entityName = "aa.merchant.Merchant";
                    queryComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.isCreator").eq((Object)true));
                    queryComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRanges.rangeType").not_eq((Object)"3"));
                } else if (partnerLinkRule.getLinkObject().equals((Object)LinkObject.VENDOR)) {
                    queryComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"org.externalorg").eq((Object)0));
                    schema.addSelect("id, org").addCondition((ConditionExpression)queryComparisonConditionGroup);
                    entityName = "aa.vendor.Vendor";
                    domain = "yssupplier";
                }
                bizObjects = MetaDaoHelper.queryObject((String)entityName, (QuerySchema)schema, domain);
                domain = null;
                if (CollectionUtils.isEmpty((Collection)bizObjects)) continue;
                if (partnerLinkRule.getLinkObject().equals((Object)LinkObject.MERCHANT)) {
                    if (isImport) {
                        partner.setPartnerMerchantComparisons(null);
                    }
                    partnerMerchantComparisonList = Optional.ofNullable(partner.partnerMerchantComparisons()).orElseGet((Supplier<List>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, <init>(), ()Ljava/util/List;)());
                    for (BizObject bizObject : bizObjects) {
                        merchantComparison = new PartnerMerchantComparison();
                        merchantComparison.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                        merchantComparison.setPartnerId((String)partner.getId());
                        merchantComparison.setIsDefault(Boolean.valueOf(false));
                        merchantComparison.setMerchantId((Long)bizObject.getId());
                        merchantComparison.setEntityStatus(EntityStatus.Insert);
                        partner.put("isAutoLinkMerchant", (Object)true);
                        partnerMerchantComparisonList.add(merchantComparison);
                    }
                    ((PartnerMerchantComparison)partnerMerchantComparisonList.get(0)).setIsDefault(Boolean.valueOf(true));
                    partner.setPartnerMerchantComparisons(partnerMerchantComparisonList);
                    roleClass.setIsCheck(Boolean.valueOf(true));
                    if (!EntityStatus.Update.equals((Object)partner.getEntityStatus())) continue;
                    roleClass.setEntityStatus(EntityStatus.Update);
                    continue;
                }
                if (isImport) {
                    partner.setPartnerVendorComparisons(null);
                }
                if (CollectionUtils.isEmpty((Collection)(filteredOrgIds = BusinessPartnerUtils.filterInternalOrgIds(originalOrgIds = bizObjects.stream().map((Function<BizObject, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$automaticCorrelationControl$0(org.imeta.orm.base.BizObject ), (Lorg/imeta/orm/base/BizObject;)Ljava/lang/String;)()).collect(Collectors.toSet()))))) continue;
                iterator = bizObjects.iterator();
                while (iterator.hasNext()) {
                    item = (Map)iterator.next();
                    if (item.get("org") == null || filteredOrgIds.contains(item.get("org").toString())) continue;
                    iterator.remove();
                }
                partnerVendorComparisonList = partner.partnerVendorComparisons() != null ? partner.partnerVendorComparisons() : new ArrayList<E>(4);
                for (BizObject bizObject : bizObjects) {
                    partnerVendorComparison = new PartnerVendorComparison();
                    partnerVendorComparison.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                    partnerVendorComparison.setPartnerId((String)partner.getId());
                    partnerVendorComparison.setIsDefault(Boolean.valueOf(false));
                    partnerVendorComparison.setVendorId((Long)bizObject.getId());
                    partnerVendorComparison.setEntityStatus(EntityStatus.Insert);
                    partner.put("isAutoLinkVendor", (Object)true);
                    partnerVendorComparisonList.add(partnerVendorComparison);
                }
                ((PartnerVendorComparison)partnerVendorComparisonList.get(0)).setIsDefault(Boolean.valueOf(true));
                partner.setPartnerVendorComparisons((List)partnerVendorComparisonList);
                roleClass.setIsCheck(Boolean.valueOf(true));
                if (!EntityStatus.Update.equals((Object)partner.getEntityStatus())) continue;
                roleClass.setEntityStatus(EntityStatus.Update);
            }
        }
    }

    private void updateComparisonStatus(List<? extends BizObject> comparisonList, RoleClass roleClass) {
        if (RoleClassName.org == roleClass.getRoleClassName()) {
            return;
        }
        for (BizObject bizObject : comparisonList) {
            if (EntityStatus.Insert.equals((Object)bizObject.getEntityStatus())) continue;
            bizObject.setEntityStatus(EntityStatus.Update);
            if (!roleClass.getIsCheck().equals(false)) continue;
            roleClass.setEntityStatus(EntityStatus.Update);
            roleClass.setIsCheck(Boolean.valueOf(true));
        }
    }

    private void clearAndResetCapitalAssociations(BusinessPartner partner, List<PartnerCapitalComparison> partnerCapitalComparisonList) throws Exception {
        HashMap<String, Object> delComparisonByIdMap = new HashMap<String, Object>(4);
        delComparisonByIdMap.put("partner_id", partner.getId());
        delComparisonByIdMap.put("ytenant_id", AppContext.getYTenantId());
        ArrayList<PartnerCapitalComparison> partnerCapitalComparisons = new ArrayList<PartnerCapitalComparison>();
        boolean isDelete = false;
        FundBizObjArchInsertReq fundBizObjArchInsertReq = new FundBizObjArchInsertReq();
        fundBizObjArchInsertReq.setBizPartner(null);
        for (PartnerCapitalComparison partnerCapitalComparison : partnerCapitalComparisonList) {
            if (EntityStatus.Insert.equals((Object)partnerCapitalComparison.getEntityStatus())) {
                partnerCapitalComparisons.add(partnerCapitalComparison);
                continue;
            }
            isDelete = true;
            fundBizObjArchInsertReq.setFundBizObjId(partnerCapitalComparison.getCapitalId());
            this.capitalPartnerService.deleteFundBizObjArch(fundBizObjArchInsertReq);
        }
        if (isDelete) {
            SqlHelper.update((String)"com.yonyoucloud.upc.data.businesspartner.delCapitalComparisonById", delComparisonByIdMap);
        }
        partner.setPartnerCapitalComparisons(CollectionUtils.isEmpty(partnerCapitalComparisons) ? null : partnerCapitalComparisons);
        if (CollectionUtils.isEmpty(partnerCapitalComparisons)) {
            partner.partnerRoleClasses().forEach(role -> {
                if (RoleClassName.CAPITAL == role.getRoleClassName()) {
                    role.setIsCheck(Boolean.valueOf(false));
                    role.setEntityStatus(EntityStatus.Update);
                }
            });
        }
    }

    private void clearAndResetVendorAssociations(BusinessPartner partner, List<PartnerVendorComparison> partnerVendorComparisonList) throws Exception {
        HashMap<String, Object> delComparisonByIdMap = new HashMap<String, Object>(4);
        delComparisonByIdMap.put("partner_id", partner.getId());
        delComparisonByIdMap.put("ytenant_id", AppContext.getYTenantId());
        ArrayList<PartnerVendorComparison> partnerVendorComparisons = new ArrayList<PartnerVendorComparison>();
        boolean isDelete = false;
        for (PartnerVendorComparison partnerVendorComparison : partnerVendorComparisonList) {
            if (EntityStatus.Insert.equals((Object)partnerVendorComparison.getEntityStatus())) {
                partnerVendorComparisons.add(partnerVendorComparison);
                continue;
            }
            if (partnerVendorComparison.getVendorId() == null) continue;
            isDelete = true;
            this.vendorPublicService.updateVendorBusinessPartner(partnerVendorComparison.getVendorId(), null);
        }
        if (isDelete) {
            SqlHelper.update((String)"com.yonyoucloud.upc.data.businesspartner.delVendorComparisonById", delComparisonByIdMap);
        }
        partner.setPartnerVendorComparisons(CollectionUtils.isEmpty(partnerVendorComparisons) ? null : partnerVendorComparisons);
        if (CollectionUtils.isEmpty(partnerVendorComparisons)) {
            partner.partnerRoleClasses().forEach(role -> {
                if (RoleClassName.vendor == role.getRoleClassName()) {
                    role.setIsCheck(Boolean.valueOf(false));
                    role.setEntityStatus(EntityStatus.Update);
                }
            });
        }
    }

    private void clearAndResetMerchantAssociations(BusinessPartner partner, List<PartnerMerchantComparison> partnerMerchantComparisonList) throws Exception {
        HashMap<String, Object> delComparisonByIdMap = new HashMap<String, Object>(4);
        delComparisonByIdMap.put("partner_id", partner.getId());
        delComparisonByIdMap.put("businessPartner", null);
        delComparisonByIdMap.put("ytenant_id", AppContext.getYTenantId());
        ArrayList<PartnerMerchantComparison> partnerMerchantComparisons = new ArrayList<PartnerMerchantComparison>();
        boolean isDelete = false;
        for (PartnerMerchantComparison partnerMerchantComparison : partnerMerchantComparisonList) {
            if (EntityStatus.Insert.equals((Object)partnerMerchantComparison.getEntityStatus())) {
                partnerMerchantComparisons.add(partnerMerchantComparison);
                continue;
            }
            isDelete = true;
            delComparisonByIdMap.put("merchantId", partnerMerchantComparison.getMerchantId());
            SqlHelper.update((String)"com.yonyoucloud.upc.data.businesspartner.updateMerchantBusinessPartner", delComparisonByIdMap);
        }
        if (isDelete) {
            SqlHelper.update((String)"com.yonyoucloud.upc.data.businesspartner.delMerchantComparisonById", delComparisonByIdMap);
        }
        partner.setPartnerMerchantComparisons(CollectionUtils.isEmpty(partnerMerchantComparisons) ? null : partnerMerchantComparisons);
        if (CollectionUtils.isEmpty(partnerMerchantComparisons)) {
            partner.partnerRoleClasses().forEach(role -> {
                if (RoleClassName.merchant == role.getRoleClassName()) {
                    role.setIsCheck(Boolean.valueOf(false));
                    role.setEntityStatus(EntityStatus.Update);
                }
            });
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void uniformData(BusinessPartner partner, Boolean isImport, Boolean isApi, BusinessPartner partnerInDb, BillDataDto billDataDto) throws Exception {
        boolean isUpdateImport;
        if (isImport.booleanValue()) {
            if (partner.get("regionCode") != null) {
                List<String> regionCodes = Arrays.asList(partner.get("regionCode").toString().split("#"));
                BaseRegionParams baseRegionParams = new BaseRegionParams();
                baseRegionParams.setNameList(regionCodes);
                List baseRegionVOS = this.baseRegionService.queryByCondition(baseRegionParams);
                if (CollectionUtils.isEmpty((Collection)baseRegionVOS)) throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BUSINESS_PARTNER_BASE_REGION_NOT_FOUND);
                partner.setRegionId(((BaseRegionVO)baseRegionVOS.get(baseRegionVOS.size() - 1)).getId());
            }
        } else if (isApi.booleanValue()) {
            this.uniformApiData(partner, partnerInDb);
        }
        if (!isImport.booleanValue() && !isApi.booleanValue()) return;
        List<RoleClass> roleClasses = partner.partnerRoleClasses();
        if (!CollectionUtils.isEmpty((Collection)roleClasses) && roleClasses.size() > RoleClassName.values().length) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BUSINESS_PARTNER_ROLE_CLASS_EXCEED_LIMITED, new Object[]{partner.getCode()});
        }
        boolean bl = isUpdateImport = billDataDto.getImportMode() != null && (billDataDto.getImportMode().equals(2) || billDataDto.getImportMode().equals(0) && EntityStatus.Update.equals((Object)partner.getEntityStatus()));
        if (isUpdateImport) {
            roleClasses = this.recoverRoleClassesForUpdate(partner, roleClasses);
            this.setComparisonsForUpdateExport(partner);
        }
        this.processingRoleClassNameForApiAndExport(partner, roleClasses);
        this.processSubTableComparisons(partner);
    }

    private void processSubTableComparisons(BusinessPartner partner) {
        Optional<List> partnerMerchantComparisons = Optional.ofNullable(partner.partnerMerchantComparisons());
        this.processComparisons(partnerMerchantComparisons.orElse(Collections.emptyList()), String.valueOf(IdManager.getInstance().nextId()));
        Optional<List> partnerVendorComparisons = Optional.ofNullable(partner.partnerVendorComparisons());
        this.processComparisons(partnerVendorComparisons.orElse(Collections.emptyList()), String.valueOf(IdManager.getInstance().nextId()));
        Optional<List> partnerCapitalComparisons = Optional.ofNullable(partner.partnerCapitalComparisons());
        this.processComparisons(partnerCapitalComparisons.orElse(Collections.emptyList()), String.valueOf(IdManager.getInstance().nextId()));
    }

    private void processComparisons(List<? extends BizObject> comparisons, String nextId) {
        if (comparisons != null && !comparisons.isEmpty()) {
            comparisons.forEach(comparison -> {
                if (comparison.getEntityStatus() == null) {
                    comparison.setEntityStatus(EntityStatus.Insert);
                }
                if (comparison.getId() == null) {
                    comparison.setId((Object)nextId);
                }
            });
        }
    }

    private void setComparisonsForUpdateExport(BusinessPartner partner) throws Exception {
        if (EntityStatus.Insert.equals((Object)partner.getEntityStatus())) {
            return;
        }
        if (partner.partnerMerchantComparisons() == null) {
            List partnerMerchantComparisons = BusinessPartnerUtils.queryMerchantComparisonByPartnerId((String)((String)partner.getId()));
            partner.setPartnerMerchantComparisons(partnerMerchantComparisons);
        }
        if (partner.partnerVendorComparisons() == null) {
            List partnerVendorComparisons = BusinessPartnerUtils.queryVendorComparisonByPartnerId((String)((String)partner.getId()));
            partner.setPartnerVendorComparisons(partnerVendorComparisons);
        }
        if (partner.partnerCapitalComparisons() == null) {
            List partnerCapitalComparisons = BusinessPartnerUtils.queryCapitalComparisonByPartnerId((String)((String)partner.getId()));
            partner.setPartnerCapitalComparisons(partnerCapitalComparisons);
        }
    }

    public List<RoleClass> recoverRoleClassesForUpdate(BusinessPartner partner, List<RoleClass> roleClasses) throws Exception {
        if (!CollectionUtils.isEmpty(roleClasses)) {
            HashSet<Short> roleClassNameList = new HashSet<Short>(8);
            for (RoleClass roleClass : roleClasses) {
                if (roleClassNameList.contains(roleClass.getRoleClassName().getValue())) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BUSINESS_PARTNER_ROLE_CLASS_NOT_ALLOW_REPEAT, new Object[]{partner.getCode(), roleClass.getRoleClassName().getName()});
                }
                roleClassNameList.add(roleClass.getRoleClassName().getValue());
                if (roleClass.getIsCheck() != null) continue;
                roleClass.setIsCheck(Boolean.valueOf(false));
            }
        } else {
            roleClasses = new ArrayList<RoleClass>(4);
        }
        QueryConditionGroup queryConditionGroupForUpdate = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"partnerId").eq(partner.getId())});
        QuerySchema selectByUpdate = QuerySchema.create().addSelect("isCheck,roleClassName,id,partnerId").addCondition((ConditionExpression)queryConditionGroupForUpdate);
        List baseRoleClassList = MetaDaoHelper.queryObject((String)"base.businesspartner.RoleClass", (QuerySchema)selectByUpdate, null);
        for (RoleClass baseRoleClass : baseRoleClassList) {
            boolean flag = true;
            for (RoleClass roleClass : roleClasses) {
                if (!baseRoleClass.getRoleClassName().equals((Object)roleClass.getRoleClassName())) continue;
                flag = false;
                roleClass.setId(baseRoleClass.getId());
                roleClass.setEntityStatus(EntityStatus.Update);
            }
            if (!flag) continue;
            roleClasses.add(baseRoleClass);
        }
        return roleClasses;
    }

    private void processingRoleClassNameForApiAndExport(BusinessPartner partner, List<RoleClass> roleClasses) {
        if (CollectionUtils.isEmpty(roleClasses)) {
            roleClasses = new ArrayList<RoleClass>(4);
            for (RoleClassName roleClassName : RoleClassName.values()) {
                RoleClass roleClass = new RoleClass();
                roleClass.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                roleClass.setPartnerId((String)partner.getId());
                roleClass.setRoleClassName(roleClassName);
                roleClass.setIsCheck(Boolean.valueOf(false));
                roleClass.setEntityStatus(EntityStatus.Insert);
                roleClasses.add(roleClass);
            }
        } else {
            TreeSet<String> roleIdList = new TreeSet<String>();
            for (RoleClassName roleClassName : RoleClassName.values()) {
                boolean flag = true;
                for (RoleClass roleClass : roleClasses) {
                    if (!roleClassName.equals((Object)roleClass.getRoleClassName())) continue;
                    flag = false;
                    if (roleClass.getId() == null) {
                        roleClass.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                        roleClass.setEntityStatus(EntityStatus.Insert);
                        roleIdList.add((String)roleClass.getId());
                    } else {
                        roleIdList.add((String)roleClass.getId());
                    }
                    if (EntityStatus.Insert.equals((Object)roleClass.getEntityStatus()) || EntityStatus.Delete.equals((Object)roleClass.getEntityStatus())) continue;
                    roleClass.setEntityStatus(EntityStatus.Update);
                }
                if (!flag) continue;
                RoleClass roleClassNew = new RoleClass();
                roleClassNew.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                roleClassNew.setPartnerId((String)partner.getId());
                roleClassNew.setRoleClassName(roleClassName);
                roleClassNew.setIsCheck(Boolean.valueOf(false));
                roleClassNew.setEntityStatus(EntityStatus.Insert);
                roleClasses.add(roleClassNew);
                roleIdList.add((String)roleClassNew.getId());
            }
            for (RoleClassName roleClassName : RoleClassName.values()) {
                for (RoleClass roleClass : roleClasses) {
                    if (roleClass.getIsCheck() == null) {
                        roleClass.setIsCheck(Boolean.valueOf(false));
                    }
                    if (!roleClassName.equals((Object)roleClass.getRoleClassName())) continue;
                    roleClass.setId((Object)String.valueOf(roleIdList.pollFirst()));
                }
            }
        }
        partner.setPartnerRoleClasses(roleClasses);
    }

    private void uniformApiData(final BusinessPartner partner, BusinessPartner partnerInDb) throws Exception {
        try {
            String regionId = this.billService.getRegionIdByPCD(partner.getRegionId());
            if (regionId != null && !"not found!!".equals(regionId)) {
                partner.setRegionId(regionId);
            }
        }
        catch (Exception e) {
            partner.setRegionId(null);
        }
        List bankData = partner.partnerBankDatas();
        if (this.partnerService.empty(bankData).booleanValue()) {
            return;
        }
        if (partner.getEntityStatus() == EntityStatus.Update && partner.getId() != null) {
            LinkedList<String> partnerIds = new LinkedList<String>(){
                {
                    this.add(partner.getId().toString());
                }
            };
            Map<String, BusinessPartner> partnerMap = this.partnerService.getPartnerByIds((List<String>)partnerIds);
            partnerInDb.setPartnerBankDatas(partnerMap.get(partner.getId().toString()).partnerBankDatas());
        }
        for (BankData item : bankData) {
            int index;
            if (item.get("province_name") != null) {
                item.setProvince(this.getProvinceIdByName(item.get("province_name").toString()));
            }
            if ((index = this.partnerService.getIndexByPartnerBank(partnerInDb.partnerBankDatas(), item.getOpenBank(), item.getBankAccount())) == -1) continue;
            item.setEntityStatus(EntityStatus.Update);
            item.setId(((BankData)partnerInDb.partnerBankDatas().get(index)).getId());
        }
    }

    private void setDefaultValue(BusinessPartner partner, String locale) throws Exception {
        if (EntityStatus.Insert == partner.getEntityStatus()) {
            if (this.partnerService.empty(partner.getSearchcode()).booleanValue()) {
                partner.setSearchcode(this.getSearchcodeByName(partner.get("name"), locale));
            }
            if (partner.getStatus() == null) {
                partner.setStatus(Status.enable);
            }
            if (partner.getPartnerType() == null) {
                partner.setPartnerType(PartnerType.enterprise);
            }
            if (partner.getFinancialSynergyFlag() == null || partner.getFinancialSynergyFlag() != PartnerConstant.INTEGER_YES && partner.getFinancialSynergyFlag() != PartnerConstant.INTEGER_FALSE) {
                partner.setFinancialSynergyFlag(PartnerConstant.INTEGER_FALSE);
            }
        }
        if (EntityStatus.Update == partner.getEntityStatus()) {
            if (partner.getStatus() == null) {
                partner.remove("status");
            }
            if (partner.getPartnerType() == null) {
                partner.remove("partnerType");
            }
        }
        if (StringUtils.isEmpty((CharSequence)partner.getNewTimeZone()) && !StringUtils.isEmpty((CharSequence)partner.getTimeZone())) {
            partner.setNewTimeZone(YonBipTimeZones.ofCode((String)partner.getTimeZone()).getCode());
        } else if (!StringUtils.isEmpty((CharSequence)partner.getNewTimeZone())) {
            partner.setNewTimeZone(YonBipTimeZones.ofCode((String)partner.getNewTimeZone()).getCode());
        }
        this.checkBusinessPartnerDTOMustField(partner);
    }

    private void checkData(BusinessPartner partner, String locale) throws Exception {
        if (partner.getCode() != null && partner.getCode().length() > 60) {
            throw new CoreDocBusinessException(PartnerConstant.CODE_LENGTH);
        }
        if (this.partnerService.mulLangObjectConvertString(partner.get("name"), locale).length() > 200) {
            throw new CoreDocBusinessException(PartnerConstant.NAME_LENGTH);
        }
        if (partner.getPartnerType() == null) {
            throw new CoreDocBusinessException(PartnerConstant.PARTNERTYPE_CHECK);
        }
        if (partner.getSearchcode() != null && partner.getSearchcode().length() > 255) {
            throw new CoreDocBusinessException(PartnerConstant.SEARCHCODE_LENGTH);
        }
        if (!this.partnerService.empty(partner.get("shortname")).booleanValue() && this.partnerService.mulLangObjectConvertString(partner.get("shortname"), locale).length() > 200) {
            throw new CoreDocBusinessException(PartnerConstant.SHORTNAME_LENGTH);
        }
        if (!this.partnerService.empty(partner.get("scope")).booleanValue() && this.partnerService.mulLangObjectConvertString(partner.get("scope"), locale).length() > PartnerConstant.SCOPE_MAX_LENGTH) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800023);
        }
        if (StringUtils.isNotBlank((CharSequence)partner.getParent()) && partner.getId() != null && partner.getParent().equals(partner.getId().toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800024);
        }
    }

    public void checkBusinessPartnerDTOMustField(BusinessPartner businessPartner) {
        if (businessPartner.getPartnerType() == null || businessPartner.getPartnerType() == PartnerType.enterprise) {
            businessPartner.setPartnerType(PartnerType.enterprise);
            if (StringUtils.isNotBlank((CharSequence)businessPartner.getMobile())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800025);
            }
            if (businessPartner.getLicenseType() == null) {
                businessPartner.setLicenseType(LicenseType.socialCodes);
            } else if (businessPartner.getLicenseType() != LicenseType.otherLicenses && businessPartner.getLicenseType() != LicenseType.socialCodes) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800026);
            }
        } else if (businessPartner.getPartnerType() == PartnerType.personal) {
            if (StringUtils.isNotBlank((CharSequence)businessPartner.getLegalPerson()) || StringUtils.isNotBlank((CharSequence)businessPartner.getLegalPersonIdNo())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800027);
            }
            if (businessPartner.getLicenseType() == null) {
                businessPartner.setLicenseType(LicenseType.IDCard);
            } else if (businessPartner.getLicenseType() != LicenseType.IDCard && businessPartner.getLicenseType() != LicenseType.passport && businessPartner.getLicenseType() != LicenseType.otherIDDocuments) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800028);
            }
        } else if (businessPartner.getPartnerType() == PartnerType.other) {
            if (StringUtils.isNotBlank((CharSequence)businessPartner.getMobile())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800029);
            }
            if (businessPartner.getLicenseType() == null) {
                businessPartner.setLicenseType(LicenseType.socialCodes);
            } else if (businessPartner.getLicenseType() != LicenseType.socialCodes && businessPartner.getLicenseType() != LicenseType.businessLicense && businessPartner.getLicenseType() != LicenseType.otherLicenses) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800030);
            }
        }
    }

    private void checkUnique(BusinessPartner partner, Boolean isImport, Boolean isApi, String currentLocale) throws Exception {
        this.checkDuplicateBusinessPartnerName(partner, isImport, isApi, currentLocale);
        this.checkUniqueInternalOrgId(partner);
    }

    private void checkDuplicateBusinessPartnerName(BusinessPartner partner, Boolean isImport, Boolean isApi, String currentLocale) throws Exception {
        short partnerType = partner.getPartnerType().getValue();
        ArrayList<QueryCondition> queryConditionList = new ArrayList<QueryCondition>();
        queryConditionList.add(QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()));
        queryConditionList.add(QueryCondition.name((String)"dr").eq((Object)0));
        String partnerName = null;
        String tipInfo = "";
        if (partner.get("name") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800031);
        }
        partnerName = this.partnerService.mulLangObjectConvertString(partner.get("name"), currentLocale);
        queryConditionList.add(QueryCondition.name((String)"name").eq((Object)partnerName));
        if (partnerType == 0 || partnerType == 2) {
            tipInfo = InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408062E", (String)"\u4f19\u4f34\u7c7b\u578b\u4e3a\u4f01\u4e1a\u3001\u5176\u4ed6\u65f6\uff0c\u540d\u79f0\u4e0d\u80fd\u91cd\u590d");
        } else if (partnerType == 1) {
            return;
        }
        if (EntityStatus.Update == partner.getEntityStatus()) {
            queryConditionList.add(QueryCondition.name((String)"id").not_eq(partner.getId()));
            if (partnerType == 1) {
                queryConditionList.add(QueryCondition.name((String)"mobile").eq((Object)partner.getMobile()));
                queryConditionList.add(QueryCondition.name((String)"creditCode").eq((Object)partner.getCreditCode()));
            } else {
                queryConditionList.add(QueryCondition.name((String)"partnerType").eq((Object)partnerType));
            }
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])((ConditionExpression[])queryConditionList.toArray(new QueryCondition[0])));
        QuerySchema selectByUniqueField = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup).addPager(0, 1);
        final String lockKey = "base_businesspartner_" + AppContext.getYhtTenantId() + "_" + partnerName.trim() + "_" + (partner.getMobile() != null ? partner.getMobile().trim() : "") + "_" + (partner.getCreditCode() != null ? partner.getCreditCode().trim() : "");
        final String requestId = UUID.randomUUID().toString();
        int tryLockNum = 0;
        while (true) {
            if (tryLockNum > 60) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800032);
            }
            ++tryLockNum;
            if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)10)) break;
            TimeUnit.MILLISECONDS.sleep(200L);
        }
        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

            public void afterCompletion(int status) {
                RedisTool.releaseLock((String)lockKey, (String)requestId);
            }
        });
        List onePartner = MetaDaoHelper.query((String)"base.businesspartner.BusinessPartner", (QuerySchema)selectByUniqueField);
        if (onePartner != null && onePartner.size() >= 1) {
            if (isImport.booleanValue() || isApi.booleanValue()) {
                throw new CoreDocBusinessException("[" + partner.getCode() + "]" + tipInfo);
            }
            if (EntityStatus.Insert == partner.getEntityStatus()) {
                throw new CoreDocBusinessException("[" + partner.getCode() + "]" + tipInfo);
            }
            if (EntityStatus.Update == partner.getEntityStatus()) {
                throw new CoreDocBusinessException("[" + partner.getCode() + "]" + tipInfo);
            }
        }
    }

    private void checkUniqueInternalOrgId(BusinessPartner partner) throws Exception {
        if (partner.getInternalOrgId() != null) {
            QuerySchema internalOrgSchema;
            List internalOrgList;
            QueryConditionGroup internalOrgGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"dr").eq((Object)0), QueryCondition.name((String)"internalOrgId").eq((Object)partner.getInternalOrgId())});
            if (EntityStatus.Update == partner.getEntityStatus()) {
                internalOrgGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_eq(partner.getId()));
            }
            if (!CollectionUtils.isEmpty((Collection)(internalOrgList = MetaDaoHelper.query((String)"base.businesspartner.BusinessPartner", (QuerySchema)(internalOrgSchema = QuerySchema.create().addSelect("id, code").addCondition((ConditionExpression)internalOrgGroup).addPager(0, 1)))))) {
                throw new CoreDocBusinessException(String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408062B", (String)"\u7f16\u7801\u4e3a[%s]\u7684\u4e1a\u52a1\u4f19\u4f34\u5df2\u7ecf\u7ed1\u5b9a\u6b64\u5185\u90e8\u7ec4\u7ec7\uff0c\u5176\u4ed6\u4e1a\u52a1\u4f19\u4f34\u4e0d\u80fd\u91cd\u590d\u7ed1\u5b9a\uff01"), ((Map)internalOrgList.get(0)).get("code")));
            }
        }
    }

    private void checkIdNo(String idNo) {
        if (idNo == null || idNo.length() == 0) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800033);
        }
        String reg = "^\\d{15}$|^\\d{17}[0-9Xx]$";
        if (!idNo.matches(reg)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800033);
        }
        char[] idNoArray = idNo.toCharArray();
        int sum = 0;
        int[] w = new int[]{7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
        char[] ch = new char[]{'1', '0', 'X', '9', '8', '7', '6', '5', '4', '3', '2'};
        for (int i = 0; i < idNoArray.length - 1; ++i) {
            sum += (idNoArray[i] - 48) * w[i];
        }
        int c = sum % 11;
        char code = ch[c];
        char last = idNoArray[idNoArray.length - 1];
        char c2 = last = last == 'x' ? (char)'X' : last;
        if (last != code) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800033);
        }
    }

    private void dealBankData(BusinessPartner partner, BusinessPartner partnerInDb) {
        List bankDatas = partner.partnerBankDatas();
        List bankDatasInDb = partnerInDb.partnerBankDatas();
        ArrayList allBankDatas = new ArrayList();
        if (this.partnerService.empty(bankDatas).booleanValue()) {
            return;
        }
        ArrayList<String> bankIds = new ArrayList<String>();
        for (BankData item2 : bankDatas) {
            if (item2.getEntityStatus() != EntityStatus.Update) continue;
            bankIds.add(item2.getId().toString());
        }
        if (!this.partnerService.empty(bankDatasInDb).booleanValue()) {
            Iterator it = bankDatasInDb.iterator();
            while (it.hasNext()) {
                BankData bankData = (BankData)it.next();
                if (!bankIds.contains(bankData.getId().toString())) continue;
                it.remove();
            }
        }
        allBankDatas.addAll(bankDatasInDb == null ? new ArrayList() : bankDatasInDb);
        allBankDatas.addAll(bankDatas);
        int defaultBankCount = allBankDatas.stream().filter(item -> item.getIsDefault()).collect(Collectors.toList()).size();
        if (defaultBankCount != 1 && partner.get("partnerFrom") != null) {
            throw new CoreDocBusinessException(PartnerConstant.DEFAULT_BANK_CHECK);
        }
    }

    private String getSearchcodeByName(Object name, String locale) throws Exception {
        String partnerName = this.partnerService.mulLangObjectConvertString(name, locale);
        boolean allChinese = RegexUtils.isAllChinese((String)partnerName);
        if (allChinese) {
            return PingYinUtil.getFirstSpell((String)partnerName);
        }
        partnerName = RegexUtils.containsDigit((String)partnerName);
        partnerName = RegexUtils.containsEnglish((String)partnerName);
        return partnerName;
    }

    private Long getProvinceIdByName(String provinceName) throws Exception {
        Map provinceMap;
        String key = "province_map_" + AppContext.getCurrentUser().getTenant().toString();
        try {
            key = URLDecoder.decode(key, "UTF-8");
        }
        catch (UnsupportedEncodingException e) {
            return -1L;
        }
        String provinceStr = AppContext.cache().get(key);
        if (!this.partnerService.empty(provinceStr).booleanValue() && (provinceMap = (Map)JSON.parse((String)provinceStr)).get(provinceName) != null) {
            return Long.parseLong(provinceMap.get(provinceName).toString());
        }
        QuerySchema getIdByName = QuerySchema.create().addSelect("id,name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"level").eq((Object)1)}));
        List regionList = this.billQueryRepository.queryMapBySchema("aa.regioncorp.RegionCorp", getIdByName, "productcenter");
        if (this.partnerService.empty(regionList).booleanValue()) {
            getIdByName = QuerySchema.create().addSelect("id,name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"level").eq((Object)1), QueryCondition.name((String)"tenant").eq((Object)0)}));
            regionList = MetaDaoHelper.queryNoPartition((String)"aa.regioncorp.RegionCorp", (QuerySchema)getIdByName, (String)"productcenter");
        }
        if (!this.partnerService.empty(regionList).booleanValue()) {
            HashMap<String, Long> provinceMap2 = new HashMap<String, Long>();
            for (Map item : regionList) {
                provinceMap2.put(item.get("name").toString(), Long.parseLong(item.get("id").toString()));
            }
            RedisManager cache = AppContext.cache();
            cache.set(key, GsonHelper.ToJSon(provinceMap2));
            return (Long)provinceMap2.get(provinceName);
        }
        return -1L;
    }

    private void setPartnerSyncPlanStatus(BusinessPartner partner) throws Exception {
        PartnerSyncPlan syncPlan = this.partnerService.getSyncPlan();
        partner.put("syncPlan", (Object)syncPlan);
        if (syncPlan.getStopstatus().booleanValue()) {
            return;
        }
        List partnerSyncRules = syncPlan.planSyncRules();
        if (!CollectionUtils.isEmpty((Collection)partnerSyncRules)) {
            for (PartnerSyncRule partnerSyncRule : partnerSyncRules) {
                LinkObject targetObject = partnerSyncRule.getTargetObject();
                boolean createTarget = partnerSyncRule.getCreateTarget();
                if (LinkObject.BUSINESS_PARTNER.equals((Object)partnerSyncRule.getSourceObject())) {
                    if (LinkObject.MERCHANT.equals((Object)targetObject) && createTarget) {
                        partner.put("partnerSyncCreateMerchant", (Object)true);
                        continue;
                    }
                    if (LinkObject.VENDOR.equals((Object)targetObject) && createTarget) {
                        partner.put("partnerSyncCreateVendor", (Object)true);
                        continue;
                    }
                    if (!LinkObject.CAPITAL_BUSINESS_OBJECT.equals((Object)targetObject) || !createTarget) continue;
                    partner.put("partnerSyncCreateCapital", (Object)true);
                    continue;
                }
                if (LinkObject.VENDOR.equals((Object)partnerSyncRule.getSourceObject())) {
                    if (!SyncCascadeObject.merchant.equals((Object)partnerSyncRule.getCascadeObject())) continue;
                    partner.put("vendorSyncCascadeMerchant", (Object)true);
                    continue;
                }
                if (!LinkObject.MERCHANT.equals((Object)partnerSyncRule.getSourceObject()) || !SyncCascadeObject.vendor.equals((Object)partnerSyncRule.getCascadeObject())) continue;
                partner.put("merchantSyncCascadeVendor", (Object)true);
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void vendorSyncCascadeMerchant(String locale, BusinessPartner partner) throws Exception {
        void var7_12;
        QuerySchema merchantSchema;
        QueryConditionGroup queryMerchantConditionGroup;
        if (partner.get("partnerFrom") == null) {
            return;
        }
        PartnerLinkPlan partnerLinkPlan = (PartnerLinkPlan)partner.get("linkPlan");
        List partnerLinkRules = partnerLinkPlan.planLinkRules();
        LinkBy linkBy = null;
        for (PartnerLinkRule partnerLinkRule : partnerLinkRules) {
            if (!LinkObject.MERCHANT.equals((Object)partnerLinkRule.getLinkObject())) continue;
            linkBy = partnerLinkRule.getLinkBy();
        }
        if (linkBy == null || CollectionUtils.isEmpty((Collection)partner.partnerVendorComparisons()) || ((PartnerVendorComparison)partner.partnerVendorComparisons().get(0)).getVendorId() == null) {
            return;
        }
        PartnerVendorComparison vendorComparison = (PartnerVendorComparison)partner.partnerVendorComparisons().get(0);
        if (!CollectionUtils.isEmpty((Collection)partner.partnerMerchantComparisons())) return;
        ArrayList arrayList = new ArrayList();
        if (linkBy.getValue() == LinkBy.BY_NAME.getValue()) {
            queryMerchantConditionGroup = new QueryConditionGroup();
            String name = this.businessPartnerService.mulLangObjectConvertString(partner.get("name"), locale);
            if (name == null || "".equals(name)) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800049);
            queryMerchantConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)name));
            QuerySchema merchantSchema2 = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryMerchantConditionGroup);
            List list = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)merchantSchema2, null);
        } else if (linkBy.getValue() == LinkBy.BY_CREDIT_CODE.getValue() && partner.getCreditCode() != null) {
            queryMerchantConditionGroup = new QueryConditionGroup();
            queryMerchantConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creditCode").eq((Object)partner.getCreditCode()));
            merchantSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryMerchantConditionGroup);
            List list = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)merchantSchema, null);
        } else if (linkBy.getValue() == LinkBy.BY_CODE.getValue() && partner.getCode() != null) {
            queryMerchantConditionGroup = new QueryConditionGroup();
            queryMerchantConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)partner.getCode()));
            merchantSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryMerchantConditionGroup);
            List list = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)merchantSchema, null);
        }
        if (!CollectionUtils.isEmpty((Collection)var7_12)) {
            ArrayList<PartnerMerchantComparison> partnerMerchantComparisonList = new ArrayList<PartnerMerchantComparison>(4);
            for (Merchant merchant : var7_12) {
                PartnerMerchantComparison merchantComparison = new PartnerMerchantComparison();
                merchantComparison.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                merchantComparison.setPartnerId(partner.getId().toString());
                merchantComparison.setIsDefault(Boolean.valueOf(false));
                merchantComparison.setMerchantId((Long)merchant.getId());
                merchantComparison.setEntityStatus(EntityStatus.Insert);
                partnerMerchantComparisonList.add(merchantComparison);
                ((PartnerMerchantComparison)partnerMerchantComparisonList.get(0)).setIsDefault(Boolean.valueOf(true));
                partner.setPartnerMerchantComparisons(partnerMerchantComparisonList);
            }
        } else {
            final PartnerMerchantComparison merchantComparison = BusinessPartnerUtils.generateMerchantComparison((String)partner.getId().toString(), null);
            LinkedList<PartnerMerchantComparison> merchantComparisons = new LinkedList<PartnerMerchantComparison>(){
                {
                    this.add(merchantComparison);
                }
            };
            if (!partner.containsKey((Object)"merchantId_createOrg")) {
                Long vendorId = vendorComparison.getVendorId();
                VendorVO vendorFieldById = this.vendorPubQueryService.getVendorFieldById(vendorId, new String[]{"org"});
                if (!StringUtils.isNotBlank((CharSequence)vendorFieldById.getOrg())) return;
                partner.put("vendor_createOrg", (Object)vendorFieldById.getOrg());
            }
            merchantComparison.set("createOrg", partner.get("vendor_createOrg"));
            merchantComparison.set("merchantId_createOrg", partner.get("vendor_createOrg"));
            partner.setPartnerMerchantComparisons((List)merchantComparisons);
            partner.set("cascadeSyncMerchant", (Object)true);
        }
        this.updateRoleClassIsCheckAndStatus(partner, RoleClassName.merchant);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void merchantSyncCascadeVendor(String locale, BusinessPartner partner) throws Exception {
        void var6_11;
        QueryConditionGroup queryMerchantConditionGroup;
        if (partner.get("partnerFrom") == null) {
            return;
        }
        PartnerLinkPlan partnerLinkPlan = (PartnerLinkPlan)partner.get("linkPlan");
        List partnerLinkRules = partnerLinkPlan.planLinkRules();
        LinkBy linkBy = null;
        for (PartnerLinkRule partnerLinkRule : partnerLinkRules) {
            if (!LinkObject.VENDOR.equals((Object)partnerLinkRule.getLinkObject())) continue;
            linkBy = partnerLinkRule.getLinkBy();
        }
        if (linkBy == null || CollectionUtils.isEmpty((Collection)partner.partnerMerchantComparisons()) || ((PartnerMerchantComparison)partner.partnerMerchantComparisons().get(0)).getMerchantId() == null) {
            return;
        }
        if (!CollectionUtils.isEmpty((Collection)partner.partnerVendorComparisons())) return;
        ArrayList arrayList = new ArrayList();
        if (linkBy.getValue() == LinkBy.BY_NAME.getValue()) {
            queryMerchantConditionGroup = new QueryConditionGroup();
            queryMerchantConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"org.externalorg").eq((Object)0));
            String name = this.businessPartnerService.mulLangObjectConvertString(partner.get("name"), locale);
            if (name == null || "".equals(name)) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800049);
            queryMerchantConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)name));
            QuerySchema merchantSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryMerchantConditionGroup);
            List list = MetaDaoHelper.queryObject((String)"aa.vendor.Vendor", (QuerySchema)merchantSchema, (String)"yssupplier");
        } else if (linkBy.getValue() == LinkBy.BY_CREDIT_CODE.getValue() && partner.getCreditCode() != null) {
            queryMerchantConditionGroup = new QueryConditionGroup();
            queryMerchantConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creditcode").eq((Object)partner.getCreditCode()));
            QuerySchema merchantSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryMerchantConditionGroup);
            List list = MetaDaoHelper.queryObject((String)"aa.vendor.Vendor", (QuerySchema)merchantSchema, (String)"yssupplier");
        } else if (linkBy.getValue() == LinkBy.BY_CODE.getValue() && partner.getCode() != null) {
            QueryConditionGroup queryVendorConditionGroup = new QueryConditionGroup();
            queryVendorConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)partner.getCode()));
            QuerySchema vednodrSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryVendorConditionGroup);
            List list = MetaDaoHelper.queryObject((String)"aa.vendor.Vendor", (QuerySchema)vednodrSchema, (String)"yssupplier");
        }
        if (!CollectionUtils.isEmpty((Collection)var6_11)) {
            ArrayList<PartnerVendorComparison> partnerVendorComparisonArrayList = new ArrayList<PartnerVendorComparison>(4);
            for (Vendor vendor : var6_11) {
                PartnerVendorComparison vendorComparison = new PartnerVendorComparison();
                vendorComparison.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                vendorComparison.setPartnerId(partner.getId().toString());
                vendorComparison.setIsDefault(Boolean.valueOf(false));
                vendorComparison.setVendorId((Long)vendor.getId());
                vendorComparison.setEntityStatus(EntityStatus.Insert);
                partnerVendorComparisonArrayList.add(vendorComparison);
                ((PartnerVendorComparison)partnerVendorComparisonArrayList.get(0)).setIsDefault(Boolean.valueOf(true));
                partner.setPartnerVendorComparisons(partnerVendorComparisonArrayList);
            }
        } else {
            final PartnerVendorComparison vendorComparison = BusinessPartnerUtils.generatePartnerVendorComparison((String)partner.getId().toString(), null);
            LinkedList<PartnerVendorComparison> partnerVendorComparisons = new LinkedList<PartnerVendorComparison>(){
                {
                    this.add(vendorComparison);
                }
            };
            if (!partner.containsKey((Object)"merchant_createOrg")) {
                PartnerMerchantComparison merchantComparison = (PartnerMerchantComparison)partner.partnerMerchantComparisons().get(0);
                Long merchantId = merchantComparison.getMerchantId();
                QuerySchema schema = QuerySchema.create().addSelect("createOrg").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantId)}));
                Map merchantCreateOrg = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)schema);
                if (merchantCreateOrg == null || merchantCreateOrg.isEmpty()) return;
                partner.put("merchant_createOrg", merchantCreateOrg.get("createOrg"));
            }
            vendorComparison.set("vendorId_org", partner.get("merchant_createOrg"));
            vendorComparison.set("createOrgId", partner.get("merchant_createOrg"));
            partner.setPartnerVendorComparisons((List)partnerVendorComparisons);
        }
        this.updateRoleClassIsCheckAndStatus(partner, RoleClassName.vendor);
    }

    private void updateRoleClassIsCheckAndStatus(BusinessPartner partner, RoleClassName roleName) {
        List roleClasses = partner.partnerRoleClasses();
        if (!CollectionUtils.isEmpty((Collection)roleClasses)) {
            for (RoleClass roleClass : roleClasses) {
                if (!roleName.equals((Object)roleClass.getRoleClassName())) continue;
                if (EntityStatus.Update.equals((Object)partner.getEntityStatus())) {
                    roleClass.setEntityStatus(EntityStatus.Update);
                }
                roleClass.setIsCheck(Boolean.valueOf(true));
            }
        }
    }

    private void isPartnerExists(BusinessPartner partner, String locale) throws Exception {
        String lockKey;
        PartnerLinkPlan partnerLinkPlan = (PartnerLinkPlan)partner.get("linkPlan");
        List partnerLinkRules = partnerLinkPlan.planLinkRules();
        LinkBy linkBy = null;
        for (PartnerLinkRule partnerLinkRule : partnerLinkRules) {
            if ((!partner.containsKey((Object)"vendorToPartner") || !LinkObject.VENDOR.equals((Object)partnerLinkRule.getLinkObject())) && (!partner.containsKey((Object)"merchantToPartner") || !LinkObject.MERCHANT.equals((Object)partnerLinkRule.getLinkObject()))) continue;
            linkBy = partnerLinkRule.getLinkBy();
            break;
        }
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        if (LinkBy.BY_NAME.equals(linkBy)) {
            lockKey = "base_businesspartner_" + AppContext.getYhtTenantId() + "_" + this.partnerService.mulLangObjectConvertString(partner.get("name"), locale);
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)this.partnerService.mulLangObjectConvertString(partner.get("name"), locale)));
        } else if (LinkBy.BY_CREDIT_CODE.equals(linkBy)) {
            lockKey = "base_businesspartner_" + AppContext.getYhtTenantId() + "_" + partner.getCreditCode();
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creditCode").eq((Object)partner.getCreditCode()));
        } else if (LinkBy.BY_CODE.equals(linkBy)) {
            lockKey = "base_businesspartner_" + AppContext.getYhtTenantId() + "_" + partner.getCode();
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)partner.getCode()));
        } else {
            return;
        }
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"dr").eq((Object)0));
        final String requestId = UUID.randomUUID().toString();
        int tryLockNum = 0;
        while (true) {
            if (tryLockNum > 60) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800032);
            }
            ++tryLockNum;
            if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)10)) {
                TransactionSynchronization transactionSynchronization = new TransactionSynchronization(){

                    public void afterCompletion(int status) {
                        RedisTool.releaseLock((String)lockKey, (String)requestId);
                    }
                };
                TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)transactionSynchronization);
                QuerySchema selectByUniqueField = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup).addPager(0, 1);
                List onePartner = MetaDaoHelper.query((String)"base.businesspartner.BusinessPartner", (QuerySchema)selectByUniqueField);
                if (CollectionUtils.isEmpty((Collection)onePartner)) break;
                partner.setEntityStatus(EntityStatus.Unchanged);
                Map existsPartner = (Map)onePartner.get(0);
                String existsPartnerId = existsPartner.get("id").toString();
                partner.setId((Object)existsPartnerId);
                if (partner.containsKey((Object)PartnerConstant.VENDOR_ID)) {
                    ArrayList<PartnerVendorComparison> partnerVendorComparisons = new ArrayList<PartnerVendorComparison>(4);
                    PartnerVendorComparison vendorComparison = BusinessPartnerUtils.generatePartnerVendorComparison((String)existsPartnerId, (Long)((Long)partner.get(PartnerConstant.VENDOR_ID)));
                    partnerVendorComparisons.add(vendorComparison);
                    partner.setPartnerVendorComparisons(partnerVendorComparisons);
                    List existsPartnerVendorComparisons = BusinessPartnerUtils.queryVendorComparisonByPartnerId((String)existsPartnerId);
                    if (!CollectionUtils.isEmpty((Collection)existsPartnerVendorComparisons)) {
                        vendorComparison.setIsDefault(Boolean.valueOf(false));
                    }
                }
                if (!partner.containsKey((Object)PartnerConstant.MERCHANT_ID)) break;
                ArrayList<PartnerMerchantComparison> partnerMerchantComparisonList = new ArrayList<PartnerMerchantComparison>(4);
                PartnerMerchantComparison merchantComparison = BusinessPartnerUtils.generateMerchantComparison((String)existsPartnerId, (Long)((Long)partner.get(PartnerConstant.MERCHANT_ID)));
                partnerMerchantComparisonList.add(merchantComparison);
                partner.setPartnerMerchantComparisons(partnerMerchantComparisonList);
                List existsPartnerMerchantComparisons = BusinessPartnerUtils.queryMerchantComparisonByPartnerId((String)existsPartnerId);
                if (CollectionUtils.isEmpty((Collection)existsPartnerMerchantComparisons)) break;
                merchantComparison.setIsDefault(Boolean.valueOf(false));
                break;
            }
            TimeUnit.MILLISECONDS.sleep(200L);
        }
    }

    private static /* synthetic */ String lambda$automaticCorrelationControl$0(BizObject item) {
        if (item.get("org") != null) {
            return item.get("org").toString();
        }
        return "";
    }
}

