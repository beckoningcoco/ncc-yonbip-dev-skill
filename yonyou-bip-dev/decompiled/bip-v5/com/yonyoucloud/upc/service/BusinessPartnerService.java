/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.core.util.BooleanUtil
 *  com.alibaba.fastjson.JSONObject
 *  com.fasterxml.jackson.core.JsonProcessingException
 *  com.fasterxml.jackson.databind.ObjectMapper
 *  com.fasterxml.jackson.databind.ObjectWriter
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.businesspartner.BusinessPartnerPO
 *  com.yonyou.iuap.apdoc.coredoc.po.businesspartner.PartnerLinkPlanPO
 *  com.yonyou.iuap.apdoc.coredoc.po.businesspartner.PartnerLinkRulePO
 *  com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantDetailPO
 *  com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantPO
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.service.itf.core.IFuncTypeQueryService
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.multitenant.UserExecutors
 *  com.yonyou.iuap.yms.param.BaseEntity
 *  com.yonyou.iuap.yms.param.ResultSetProcessor
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyou.iuap.yms.processor.AutoBeanListProcessor
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.billmake.service.MakeBillRuleClientService
 *  com.yonyou.ucf.mdd.ext.bill.billmake.vo.PushAndPullVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ErrorMessage
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyou.ypd.bill.infrastructure.service.api.IBillQueryRepository
 *  com.yonyoucloud.fi.tmsp.openapi.ITmspBizPartnerService
 *  com.yonyoucloud.fi.tmsp.vo.FundBizObjArchQueryReq
 *  com.yonyoucloud.fi.tmsp.vo.FundBusinObjArchivesResp
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.vendor.Vendor
 *  com.yonyoucloud.upc.aa.vendor.VendorBank
 *  com.yonyoucloud.upc.aa.vendor.VendorExtend
 *  com.yonyoucloud.upc.base.businesspartner.BankData
 *  com.yonyoucloud.upc.base.businesspartner.BusinessPartner
 *  com.yonyoucloud.upc.base.businesspartner.ConditionRelation
 *  com.yonyoucloud.upc.base.businesspartner.LicenseType
 *  com.yonyoucloud.upc.base.businesspartner.LinkBy
 *  com.yonyoucloud.upc.base.businesspartner.LinkObject
 *  com.yonyoucloud.upc.base.businesspartner.OrgGenerationPartner
 *  com.yonyoucloud.upc.base.businesspartner.PartnerCapitalComparison
 *  com.yonyoucloud.upc.base.businesspartner.PartnerConditionOperator
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
 *  com.yonyoucloud.upc.base.businesspartner.SyncLog
 *  com.yonyoucloud.upc.base.businesspartner.SyncRange
 *  com.yonyoucloud.upc.base.businesspartner.SyncRangeDivDimension
 *  com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorBillStringPubService
 *  com.yonyoucloud.upc.utils.BusinessPartnerUtils
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.PartnerConstant
 *  com.yonyoucloud.upc.utils.RegexUtils
 *  org.apache.commons.collections4.CollectionUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.cache.RedisManager
 *  org.imeta.spring.support.id.IdManager
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import cn.hutool.core.util.BooleanUtil;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.businesspartner.BusinessPartnerPO;
import com.yonyou.iuap.apdoc.coredoc.po.businesspartner.PartnerLinkPlanPO;
import com.yonyou.iuap.apdoc.coredoc.po.businesspartner.PartnerLinkRulePO;
import com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantDetailPO;
import com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantPO;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.service.itf.core.IFuncTypeQueryService;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.multitenant.UserExecutors;
import com.yonyou.iuap.yms.param.BaseEntity;
import com.yonyou.iuap.yms.param.ResultSetProcessor;
import com.yonyou.iuap.yms.param.SQLParameter;
import com.yonyou.iuap.yms.processor.AutoBeanListProcessor;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.billmake.service.MakeBillRuleClientService;
import com.yonyou.ucf.mdd.ext.bill.billmake.vo.PushAndPullVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ErrorMessage;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyou.ypd.bill.infrastructure.service.api.IBillQueryRepository;
import com.yonyoucloud.fi.tmsp.openapi.ITmspBizPartnerService;
import com.yonyoucloud.fi.tmsp.vo.FundBizObjArchQueryReq;
import com.yonyoucloud.fi.tmsp.vo.FundBusinObjArchivesResp;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.vendor.Vendor;
import com.yonyoucloud.upc.aa.vendor.VendorBank;
import com.yonyoucloud.upc.aa.vendor.VendorExtend;
import com.yonyoucloud.upc.base.businesspartner.BankData;
import com.yonyoucloud.upc.base.businesspartner.BusinessPartner;
import com.yonyoucloud.upc.base.businesspartner.ConditionRelation;
import com.yonyoucloud.upc.base.businesspartner.LicenseType;
import com.yonyoucloud.upc.base.businesspartner.LinkBy;
import com.yonyoucloud.upc.base.businesspartner.LinkObject;
import com.yonyoucloud.upc.base.businesspartner.OrgGenerationPartner;
import com.yonyoucloud.upc.base.businesspartner.PartnerCapitalComparison;
import com.yonyoucloud.upc.base.businesspartner.PartnerConditionOperator;
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
import com.yonyoucloud.upc.base.businesspartner.SyncLog;
import com.yonyoucloud.upc.base.businesspartner.SyncRange;
import com.yonyoucloud.upc.base.businesspartner.SyncRangeDivDimension;
import com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorBillStringPubService;
import com.yonyoucloud.upc.service.api.BusinessPartnerServiceImpl;
import com.yonyoucloud.upc.utils.BusinessPartnerUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.PartnerConstant;
import com.yonyoucloud.upc.utils.RegexUtils;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.cache.RedisManager;
import org.imeta.spring.support.id.IdManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component(value="businessPartnerService")
public class BusinessPartnerService {
    public static final String TOTAL_COUNT = "totalCount";
    Logger logger = LoggerFactory.getLogger(BusinessPartnerService.class);
    @Autowired
    BusinessPartnerServiceImpl businessPartnerService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private MakeBillRuleClientService makeBillRuleClientService;
    @Autowired
    private IFuncTypeQueryService funcTypeQueryService;
    @Lazy
    @Autowired
    private ITmspBizPartnerService capitalPartnerService;
    @Autowired
    private IBillCodeComponentService billCodeComponentService;
    @Autowired
    IVendorBillStringPubService ysVendorService;
    @Autowired
    private IOrgUnitQueryService orgUnitQueryService;
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    @Autowired
    private IBillQueryRepository iBillQueryRepository;
    public static Integer pageSize = 500;
    private final String[] DATE_FORMATS = new String[]{"yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd"};

    public List<Map<String, Object>> linkMerchant(BusinessPartner partner) throws Exception {
        String locale = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
        PartnerLinkPlan linkPlan = this.beforeLink();
        String linkObject = linkPlan.getLinkObject();
        if (!linkObject.contains("0")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800736);
        }
        PartnerLinkRule merchantLinkRule = new PartnerLinkRule();
        List linkRules = linkPlan.planLinkRules();
        for (PartnerLinkRule item : linkRules) {
            if (LinkObject.MERCHANT != item.getLinkObject()) continue;
            merchantLinkRule = item;
            break;
        }
        LinkBy linkBy = merchantLinkRule.getLinkBy();
        QueryConditionGroup queryCondition = new QueryConditionGroup();
        if (LinkBy.BY_NAME == linkBy) {
            String partnerName = this.mulLangObjectConvertString(partner.get("name"), locale);
            if (this.checkPartnerNameIsNull(partnerName, locale).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800737);
            }
            queryCondition.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)this.mulLangObjectConvertString(partnerName, locale)));
        } else if (LinkBy.BY_CREDIT_CODE == linkBy) {
            String partnerCreditCode = partner.getCreditCode();
            if (this.empty(partnerCreditCode).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800738);
            }
            queryCondition.addCondition((ConditionExpression)QueryCondition.name((String)"creditCode").eq((Object)partnerCreditCode));
        } else if (LinkBy.BY_CODE == linkBy) {
            String code = partner.getCode();
            if (this.empty(code).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801298);
            }
            queryCondition.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)code));
        }
        QuerySchema getMerchantByField = QuerySchema.create().addSelect("id as merchantId,code as merchantId_code,name as merchantId_name,createOrg as merchantId_createOrg,createOrg.name as merchantId_createOrgName,transType as merchantId_transType,transType.name as merchantId_transTypeName,customerClass as merchantId_customerClass,customerClass.name as merchantId_customerClassName").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{queryCondition, QueryCondition.name((String)"merchantApplyRanges.isCreator").eq((Object)true), QueryCondition.name((String)"merchantApplyRanges.rangeType").not_eq((Object)"3")}));
        return MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)getMerchantByField);
    }

    public List<Map<String, Object>> linkVendor(BusinessPartner partner) throws Exception {
        String locale = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
        PartnerLinkPlan linkPlan = this.beforeLink();
        String linkObject = linkPlan.getLinkObject();
        if (!linkObject.contains("1")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800739);
        }
        PartnerLinkRule vendorLinkRule = new PartnerLinkRule();
        List linkRuleList = linkPlan.planLinkRules();
        for (PartnerLinkRule item : linkRuleList) {
            if (LinkObject.VENDOR != item.getLinkObject()) continue;
            vendorLinkRule = item;
            break;
        }
        LinkBy linkBy = vendorLinkRule.getLinkBy();
        QueryConditionGroup queryComparisonConditionGroup = new QueryConditionGroup();
        if (LinkBy.BY_NAME == linkBy) {
            String partnerName = this.mulLangObjectConvertString(partner.get("name"), locale);
            if (this.checkPartnerNameIsNull(partnerName, locale).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800737);
            }
            queryComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)this.mulLangObjectConvertString(partnerName, locale)));
        } else if (LinkBy.BY_CREDIT_CODE == linkBy) {
            String partnerCreditCode = partner.getCreditCode();
            if (this.empty(partnerCreditCode).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800738);
            }
            queryComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"creditcode").eq((Object)partnerCreditCode));
        } else if (LinkBy.BY_CODE == linkBy) {
            String code = partner.getCode();
            if (this.empty(code).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801298);
            }
            queryComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)code));
        }
        queryComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"org.externalorg").eq((Object)0));
        QuerySchema getVendorByField = QuerySchema.create().addSelect("id as vendorId,code as vendorId_code,name as vendorId_name,org as vendorId_org,org.name as vendorId_orgName,vendorclass as vendorId_vendorclass,vendorclass.name as vendorId_vendorclassName").addCondition((ConditionExpression)queryComparisonConditionGroup);
        return MetaDaoHelper.query((String)"aa.vendor.Vendor", (QuerySchema)getVendorByField, (String)"yssupplier");
    }

    public FundBusinObjArchivesResp linkCapital(BusinessPartner partner) throws Exception {
        String locale = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
        PartnerLinkPlan linkPlan = this.beforeLink();
        String linkObject = linkPlan.getLinkObject();
        if (!linkObject.contains("3")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800740);
        }
        PartnerLinkRule capitalLinkRule = null;
        List linkRuleList = linkPlan.planLinkRules();
        for (PartnerLinkRule item : linkRuleList) {
            if (LinkObject.CAPITAL_BUSINESS_OBJECT != item.getLinkObject()) continue;
            capitalLinkRule = item;
            break;
        }
        if (capitalLinkRule == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800741);
        }
        LinkBy linkBy = capitalLinkRule.getLinkBy();
        FundBizObjArchQueryReq fundBizObjArchQueryReq = new FundBizObjArchQueryReq();
        if (LinkBy.BY_NAME == linkBy) {
            String partnerName = this.mulLangObjectConvertString(partner.get("name"), locale);
            if (this.checkPartnerNameIsNull(partnerName, locale).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800737);
            }
            fundBizObjArchQueryReq.setName(partnerName);
        } else if (LinkBy.BY_CREDIT_CODE == linkBy) {
            String partnerCreditCode = partner.getCreditCode();
            if (this.empty(partnerCreditCode).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800738);
            }
            fundBizObjArchQueryReq.setUnifiedSocialCreditCode(partnerCreditCode);
        } else if (LinkBy.BY_CODE == linkBy) {
            String code = partner.getCode();
            if (this.empty(code).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801298);
            }
            fundBizObjArchQueryReq.setCode(code);
        }
        return this.capitalPartnerService.queryFundBizObjArch(fundBizObjArchQueryReq);
    }

    private PartnerLinkPlan beforeLink() throws Exception {
        PartnerLinkPlan linkPlan = this.getLinkPlan();
        if (linkPlan.getStopstatus().booleanValue()) {
            throw new CoreDocBusinessException(null, PartnerConstant.LINK_PLAN_IS_STOP);
        }
        return linkPlan;
    }

    public String recoveryLinkPlan() throws Exception {
        SqlHelper.delete((String)"com.yonyoucloud.upc.data.businesspartner.deleteLinkPlan", (Object)AppContext.getCurrentUser().getYTenantId());
        return "success";
    }

    public String recoverySyncPlan() throws Exception {
        SqlHelper.delete((String)"com.yonyoucloud.upc.data.businesspartner.deleteSyncPlan", (Object)AppContext.getCurrentUser().getYTenantId());
        return "success";
    }

    private Boolean checkPartnerNameIsNull(Object partnerName, String currentLang) {
        Object partnerNameLocale;
        if (currentLang == null || currentLang.length() == 0) {
            currentLang = "zh_CN";
        }
        if (partnerName == null) {
            return true;
        }
        if (partnerName instanceof String ? partnerName.toString().length() == 0 : partnerName instanceof Map && ((partnerNameLocale = ((Map)partnerName).get(currentLang)) == null || partnerNameLocale.toString().length() == 0)) {
            return true;
        }
        return false;
    }

    public String mulLangObjectConvertString(Object name, String currentLang) {
        if (currentLang == null || currentLang.length() == 0) {
            currentLang = "zh_CN";
        }
        if (name == null) {
            return "";
        }
        if (name instanceof String) {
            return name.toString();
        }
        if (name instanceof Map) {
            if (((Map)name).get(currentLang) == null) {
                return "";
            }
            return ((Map)name).get(currentLang).toString();
        }
        return "";
    }

    public int getLinkMode() throws Exception {
        return this.getLinkPlan().getLinkMode().getValue();
    }

    public Boolean canSyncToObject(PartnerSyncRule syncRule) throws Exception {
        LinkObject targetObject = syncRule.getTargetObject();
        if (targetObject.getValue() < 0 || targetObject.getValue() > 3) {
            return false;
        }
        List syncRuleList = this.getSyncPlan().planSyncRules();
        for (PartnerSyncRule item : syncRuleList) {
            if (!item.getCreateTarget().booleanValue() || targetObject != item.getTargetObject()) continue;
            return true;
        }
        return false;
    }

    public void executeTask(PartnerSyncRule syncRule) {
        UserExecutors.executeInDetachedThread((ExecutorService)this.ymsLongTaskExecutorService, () -> this.syncAllData(syncRule));
    }

    public void executeTask(String partnerId, String asyncKey) {
        UserExecutors.executeInDetachedThread((ExecutorService)this.ymsLongTaskExecutorService, () -> this.syncAfterSave(partnerId, asyncKey));
    }

    public void syncAllData(PartnerSyncRule syncRule) {
        String asyncKey = syncRule.get("asyncKey").toString();
        ProcessData.builder((int)1, (int)200, null, null).percentage("0").build(asyncKey, Integer.valueOf(1800));
        String locale = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
        ResultList resultList = new ResultList();
        try {
            List partnerSyncRules = this.getSyncPlan().planSyncRules();
            for (PartnerSyncRule rule : partnerSyncRules) {
                if (rule.getSourceObject().getValue() != syncRule.getSourceObject().getValue() || rule.getTargetObject().getValue() != syncRule.getTargetObject().getValue()) continue;
                syncRule = rule;
            }
            resultList = this.syncData(syncRule, null, locale, asyncKey, true);
        }
        catch (Exception e) {
            resultList.addErrorMessage(PartnerConstant.SYNC_DATA_EXCEPTION);
        }
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("count", resultList.getCount());
        resultMap.put("sucessCount", resultList.getSucessCount());
        resultMap.put("failCount", resultList.getFailCount());
        resultMap.put("messages", resultList.getMessages());
        ProcessData.builder((int)1, (int)200, resultMap, (String)null).percentage("100").setValue(TOTAL_COUNT, (Object)resultList.getCount()).successCount(resultList.getSucessCount()).failCount(resultList.getFailCount()).count(resultList.getCount()).message((Object)resultList.getMessages()).setValue("infos", (Object)resultList.getMessages()).build(asyncKey, Integer.valueOf(1800));
    }

    private Boolean checkCanPartnerToConditions(String partnerId, PartnerSyncRule syncRule) {
        if (syncRule.getSyncRange() == SyncRange.all) {
            return true;
        }
        boolean flag = false;
        for (int i = 1; i <= 3; ++i) {
            SyncRangeDivDimension divDimension = SyncRangeDivDimension.find((Number)((Number)syncRule.get("divDimension" + i)));
            if (divDimension == null) continue;
            String syncRangeField = "syncRange" + i;
            String conditionalOperatorField = "conditionalOperator" + i;
            block2 : switch (divDimension) {
                case BUSINESS_PARTNER: {
                    flag = BusinessPartnerServiceImpl.checkDivDimensionMatch(partnerId, syncRangeField, conditionalOperatorField, syncRule);
                    break;
                }
                case PARTNER_TYPE: {
                    List partners;
                    QuerySchema querySchema = QuerySchema.create().addSelect("partnerType").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)partnerId)}));
                    try {
                        partners = MetaDaoHelper.queryObject((String)"base.businesspartner.BusinessPartner", (QuerySchema)querySchema, null);
                    }
                    catch (Exception e) {
                        this.logger.error("\u67e5\u8be2\u4e1a\u52a1\u4f19\u4f34\u7c7b\u578b\u5931\u8d25", (Object)e.getMessage(), (Object)e);
                        return false;
                    }
                    if (org.springframework.util.CollectionUtils.isEmpty((Collection)partners) || ((BusinessPartner)partners.get(0)).getPartnerType() == null) break;
                    flag = BusinessPartnerServiceImpl.checkDivDimensionMatch(((BusinessPartner)partners.get(0)).getPartnerType().getValue(), syncRangeField, conditionalOperatorField, syncRule);
                    break;
                }
                case ROLE_CLASS: {
                    if (syncRule.get(syncRangeField) == null) {
                        flag = false;
                        break;
                    }
                    String roleRange = syncRule.get(syncRangeField).toString();
                    String[] split = roleRange.split(",");
                    if (split == null) break;
                    List roleClasses = null;
                    try {
                        roleClasses = BusinessPartnerUtils.queryPartnerRoleClass((String)partnerId, null);
                    }
                    catch (Exception e) {
                        flag = false;
                        break;
                    }
                    HashSet<String> roleClassesSet = new HashSet<String>();
                    if (org.springframework.util.CollectionUtils.isEmpty((Collection)roleClasses)) break;
                    for (RoleClass roleClass : roleClasses) {
                        if (roleClass == null || !roleClass.getIsCheck().booleanValue() || roleClass.getRoleClassName() == null) continue;
                        roleClassesSet.add(String.valueOf(roleClass.getRoleClassName().getValue()));
                    }
                    flag = true;
                    for (String s : split) {
                        if (roleClassesSet.contains(s)) continue;
                        flag = false;
                        break block2;
                    }
                    break;
                }
            }
            if (syncRule.getConditionRelation() != null && syncRule.getConditionRelation() == ConditionRelation.or && flag) {
                return true;
            }
            if (syncRule.getConditionRelation() == null || syncRule.getConditionRelation() != ConditionRelation.and || flag) continue;
            return false;
        }
        return flag;
    }

    public void syncAfterSave(final String partnerId, String asyncKey) {
        ProcessData.builder((int)1, (int)200, null, null).percentage("0").build(asyncKey, Integer.valueOf(1800));
        String locale = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
        ResultList finalResult = new ResultList();
        List<PartnerSyncRule> syncRuleList = null;
        try {
            syncRuleList = this.getAllSyncRule();
        }
        catch (Exception e) {
            ProcessData.builder((int)1, (int)200, (Object)new ResultList(), (String)PartnerConstant.READ_SYNC_RULE_FAIL).percentage("100").setValue(TOTAL_COUNT, (Object)0).successCount(0).failCount(0).message((Object)PartnerConstant.READ_SYNC_RULE_FAIL).setValue("infos", (Object)PartnerConstant.READ_SYNC_RULE_FAIL).build(asyncKey, Integer.valueOf(1800));
            return;
        }
        for (PartnerSyncRule item : syncRuleList) {
            Boolean flag;
            if (item.getSourceObject() != LinkObject.BUSINESS_PARTNER || !(flag = this.checkCanPartnerToConditions(partnerId, item)).booleanValue()) continue;
            ResultList resultList = null;
            try {
                LinkedList<String> partnerIds = new LinkedList<String>(){
                    {
                        this.add(partnerId);
                    }
                };
                resultList = this.syncData(item, (List<String>)partnerIds, locale, asyncKey, false);
            }
            catch (Exception e) {
                continue;
            }
            finalResult.setCount(finalResult.getCount() + resultList.getCount());
            finalResult.setSucessCount(finalResult.getSucessCount() + resultList.getSucessCount());
            finalResult.setFailCount(finalResult.getFailCount() + resultList.getFailCount());
            finalResult.getMessages().addAll(resultList.getMessages());
        }
        ProcessData.builder((int)1, (int)200, (Object)finalResult, (String)null).percentage("100").setValue(TOTAL_COUNT, (Object)finalResult.getCount()).successCount(finalResult.getSucessCount()).failCount(finalResult.getFailCount()).message((Object)finalResult.getMessages()).setValue("infos", (Object)finalResult.getMessages()).build(asyncKey, Integer.valueOf(1800));
    }

    public ResultList syncData(PartnerSyncRule syncRule, List<String> partnerIds, String locale, String asyncKey, Boolean computePercentage) throws Exception {
        ResultList allResultList = new ResultList();
        SyncLog syncLog = this.addSyncLog(syncRule);
        if (!org.springframework.util.CollectionUtils.isEmpty(partnerIds)) {
            if (syncRule.getTargetObject() == LinkObject.VENDOR) {
                allResultList = this.partnerVendorSync(partnerIds, 0, locale, asyncKey, syncRule, computePercentage);
            } else if (syncRule.getTargetObject() == LinkObject.MERCHANT) {
                allResultList = this.partnerMerchantSync(partnerIds, 0, locale, asyncKey, syncRule, computePercentage);
            } else if (syncRule.getTargetObject() == LinkObject.CAPITAL_BUSINESS_OBJECT) {
                allResultList = this.partnerToCapitalSync(partnerIds, locale, asyncKey, computePercentage);
            }
        } else {
            allResultList = this.performSync(syncRule, locale, asyncKey);
        }
        if (!org.springframework.util.CollectionUtils.isEmpty((Collection)allResultList.getMessages())) {
            syncLog.setMessage(allResultList.getMessages().toString());
        }
        syncLog.setCount(allResultList.getCount());
        syncLog.setSuccessCount(allResultList.getSucessCount());
        syncLog.setFailCount(allResultList.getFailCount());
        syncLog.setStatus(1);
        this.updateSyncLog(syncLog);
        return allResultList;
    }

    private ResultList performSync(PartnerSyncRule syncRule, String locale, String asyncKey) throws Exception {
        int pageIndex = 1;
        ResultList allResultList = new ResultList();
        ArrayList messages = new ArrayList();
        allResultList.setMessages(messages);
        QuerySchema schemaAllIdByPage = new QuerySchema();
        BillContext billContext = new BillContext();
        if (syncRule.getSourceObject() == LinkObject.BUSINESS_PARTNER || syncRule.getSourceObject() == LinkObject.CAPITAL_BUSINESS_OBJECT) {
            schemaAllIdByPage = this.collectBusinessPartnerIdsSchemaBasedOnSyncRule(syncRule);
            billContext.setFullname("base.businesspartner.BusinessPartner");
        } else if (syncRule.getSourceObject() == LinkObject.MERCHANT) {
            schemaAllIdByPage = this.collectMerchantIdsBasedOnSyncRule(syncRule);
            billContext.setFullname("aa.merchant.Merchant");
        } else if (syncRule.getSourceObject() == LinkObject.VENDOR) {
            schemaAllIdByPage = this.collectVendorIdsBasedOnSyncRule(syncRule);
            billContext.setFullname("aa.vendor.Vendor");
            billContext.setDomain("yssupplier");
        }
        schemaAllIdByPage.addPager(pageIndex, pageSize.intValue());
        Pager idPage = MetaDaoHelper.queryByPage((BillContext)billContext, (QuerySchema)schemaAllIdByPage);
        if (idPage != null) {
            double totalCount = idPage.getRecordCount();
            while (idPage.getPageIndex() <= idPage.getPageCount()) {
                List recordList = idPage.getRecordList();
                boolean isFinalPage = idPage.getPageCount() == 1;
                ResultList resultList = new ResultList();
                if (syncRule.getTargetObject() == LinkObject.BUSINESS_PARTNER) {
                    HashMap<String, String> merchantComparisonMap = new HashMap<String, String>();
                    recordList.forEach(record -> merchantComparisonMap.put(record.get("id").toString(), record.get("businessPartner") != null ? record.get("businessPartner").toString() : null));
                    if (syncRule.getSourceObject() == LinkObject.MERCHANT) {
                        resultList = this.merchantToPartnerSync(merchantComparisonMap, locale, asyncKey, syncRule, isFinalPage);
                    } else if (syncRule.getSourceObject() == LinkObject.VENDOR) {
                        resultList = this.vendorToPartnerSync(merchantComparisonMap, locale, asyncKey, syncRule, isFinalPage);
                    } else if (syncRule.getSourceObject() == LinkObject.CAPITAL_BUSINESS_OBJECT) {
                        List<String> splitPartnerIdList = recordList.stream().map(map -> map.get("id").toString()).collect(Collectors.toList());
                        resultList = this.capitalToPartnerSync(splitPartnerIdList, asyncKey, syncRule, locale, isFinalPage);
                    }
                } else if (syncRule.getSourceObject() == LinkObject.BUSINESS_PARTNER) {
                    List<String> splitPartnerIdList = recordList.stream().map(map -> map.get("id").toString()).collect(Collectors.toList());
                    if (syncRule.getTargetObject() == LinkObject.VENDOR) {
                        resultList = this.partnerVendorSync(splitPartnerIdList, 0, locale, asyncKey, syncRule, isFinalPage);
                    } else if (syncRule.getTargetObject() == LinkObject.MERCHANT) {
                        resultList = this.partnerMerchantSync(splitPartnerIdList, 0, locale, asyncKey, syncRule, isFinalPage);
                    } else if (syncRule.getTargetObject() == LinkObject.CAPITAL_BUSINESS_OBJECT) {
                        resultList = this.partnerToCapitalSync(splitPartnerIdList, locale, asyncKey, isFinalPage);
                    }
                }
                messages.addAll(resultList.getMessages());
                allResultList.setCount(allResultList.getCount() + resultList.getCount());
                allResultList.setSucessCount(allResultList.getSucessCount() + resultList.getSucessCount());
                allResultList.setFailCount(allResultList.getFailCount() + resultList.getFailCount());
                double percentage = (double)idPage.getPageIndex() / (double)idPage.getPageCount();
                ProcessData.builder((int)1, (int)200, (Object)allResultList, (String)PartnerConstant.SYNCING_DATA).percentage(String.valueOf(percentage * 100.0)).setValue(TOTAL_COUNT, (Object)totalCount).successCount(allResultList.getSucessCount()).failCount(allResultList.getFailCount()).message((Object)allResultList.getMessages()).build(asyncKey, Integer.valueOf(1800));
                ++pageIndex;
                if (idPage.getPageIndex() > idPage.getPageCount()) continue;
                schemaAllIdByPage.addPager(pageIndex, pageSize.intValue());
                idPage = MetaDaoHelper.queryByPage((BillContext)billContext, (QuerySchema)schemaAllIdByPage);
            }
        }
        return allResultList;
    }

    public List<BusinessPartner> batchInsertPartnerByMerchant(Merchant merchant) throws Exception {
        HashMap<String, BusinessPartner> partnerMap = new HashMap<String, BusinessPartner>();
        List<Map<String, Object>> partnerFieldMap = this.readPartnerFieldMap(0);
        BusinessPartner partner = new BusinessPartner();
        String partnerId = String.valueOf(IdManager.getInstance().nextId());
        partner.setStatus(Status.enable);
        partner.setId((Object)partnerId);
        partner.setCode(merchant.getCode());
        partner.setEntityStatus(EntityStatus.Insert);
        this.partnerMerchantMainSync(partner, merchant, 1, partnerFieldMap);
        BusinessPartnerUtils.assignNameIfMissing((BusinessPartner)partner, (BizObject)merchant);
        partner.setEntityStatus(EntityStatus.Insert);
        final PartnerMerchantComparison comparison = new PartnerMerchantComparison();
        long comparisonId = IdManager.getInstance().nextId();
        comparison.setId((Object)String.valueOf(comparisonId));
        comparison.setPartnerId(partnerId);
        comparison.setMerchantId((Long)merchant.getId());
        comparison.setIsDefault(Boolean.valueOf(true));
        comparison.setEntityStatus(EntityStatus.Insert);
        LinkedList<PartnerMerchantComparison> merchantComparisons = new LinkedList<PartnerMerchantComparison>(){
            {
                this.add(comparison);
            }
        };
        partner.setPartnerMerchantComparisons((List)merchantComparisons);
        ArrayList<RoleClass> roleClasses = new ArrayList<RoleClass>();
        for (RoleClassName roleClassName : RoleClassName.values()) {
            RoleClass roleClass = new RoleClass();
            long roleClassId = IdManager.getInstance().nextId();
            roleClass.setId((Object)String.valueOf(roleClassId));
            roleClass.setPartnerId(String.valueOf(partnerId));
            roleClass.setRoleClassName(roleClassName);
            if (roleClassName == RoleClassName.org) {
                roleClass.setIsCheck(Boolean.valueOf(partner.getInternalOrgId() != null));
            } else {
                roleClass.setIsCheck(Boolean.valueOf(RoleClassName.merchant == roleClassName));
            }
            roleClass.setEntityStatus(EntityStatus.Insert);
            roleClasses.add(roleClass);
        }
        partner.setPartnerRoleClasses(roleClasses);
        partnerMap.put(partner.getId().toString(), partner);
        return new ArrayList<BusinessPartner>(partnerMap.values());
    }

    public Date parseStringToDate(String dateStr) throws RuntimeException {
        if (dateStr == null || dateStr.trim().isEmpty()) {
            throw new IllegalArgumentException("\u65e5\u671f\u5b57\u7b26\u4e32\u4e0d\u80fd\u4e3a\u7a7a");
        }
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.setTimeZone(TimeZone.getDefault());
        sdf.setLenient(false);
        for (String format : this.DATE_FORMATS) {
            try {
                sdf.applyPattern(format);
                return sdf.parse(dateStr.trim());
            }
            catch (Exception e) {
            }
        }
        throw new RuntimeException("\u65e0\u6cd5\u89e3\u6790\u65e5\u671f\u5b57\u7b26\u4e32: " + dateStr);
    }

    public List<BusinessPartner> batchInsertPartnerByMerchant(MerchantPO merchantPO) throws Exception {
        HashMap<String, BusinessPartner> partnerMap = new HashMap<String, BusinessPartner>();
        List<Map<String, Object>> partnerFieldMap = this.readPartnerFieldMap(0);
        BusinessPartner partner = new BusinessPartner();
        String partnerId = String.valueOf(IdManager.getInstance().nextId());
        partner.setStatus(Status.enable);
        partner.setId((Object)partnerId);
        partner.setCode(merchantPO.getCode());
        partner.setEntityStatus(EntityStatus.Insert);
        this.mapMerchantDataToBusinessPartner(partner, merchantPO, partnerFieldMap);
        partner.setEntityStatus(EntityStatus.Insert);
        final PartnerMerchantComparison comparison = new PartnerMerchantComparison();
        long comparisonId = IdManager.getInstance().nextId();
        comparison.setId((Object)String.valueOf(comparisonId));
        comparison.setPartnerId(partnerId);
        comparison.setMerchantId(merchantPO.getId());
        comparison.setIsDefault(Boolean.valueOf(true));
        comparison.setEntityStatus(EntityStatus.Insert);
        LinkedList<PartnerMerchantComparison> merchantComparisons = new LinkedList<PartnerMerchantComparison>(){
            {
                this.add(comparison);
            }
        };
        partner.setPartnerMerchantComparisons((List)merchantComparisons);
        ArrayList<RoleClass> roleClasses = new ArrayList<RoleClass>();
        for (RoleClassName roleClassName : RoleClassName.values()) {
            RoleClass roleClass = new RoleClass();
            long roleClassId = IdManager.getInstance().nextId();
            roleClass.setId((Object)String.valueOf(roleClassId));
            roleClass.setPartnerId(String.valueOf(partnerId));
            roleClass.setRoleClassName(roleClassName);
            if (roleClassName == RoleClassName.org) {
                roleClass.setIsCheck(Boolean.valueOf(partner.getInternalOrgId() != null));
            } else {
                roleClass.setIsCheck(Boolean.valueOf(RoleClassName.merchant == roleClassName));
            }
            roleClass.setEntityStatus(EntityStatus.Insert);
            roleClasses.add(roleClass);
        }
        partner.setPartnerRoleClasses(roleClasses);
        partnerMap.put(partner.getId().toString(), partner);
        return new ArrayList<BusinessPartner>(partnerMap.values());
    }

    public List<BusinessPartner> batchInsertPartnerByMerchantNew(List<Long> noLinkMerchantIds, List<BusinessPartner> partners, String locale, PartnerSyncRule syncRule) throws Exception {
        if (this.empty(noLinkMerchantIds).booleanValue()) {
            return new ArrayList<BusinessPartner>();
        }
        Map<String, Merchant> merchantMap = null;
        try {
            merchantMap = this.getMerchantByIds(noLinkMerchantIds);
        }
        catch (Exception e) {
            this.logger.error("getMerchantByIds\u67e5\u8be2\u5ba2\u6237\u6863\u6848\u5931\u8d25\uff0c\u57fa\u672c\u5f02\u5e38\u4fe1\u606f\uff1a{}\uff0c\u8be6\u60c5\u5f02\u5e38\u4fe1\u606f\uff1a" + e.getMessage(), (Throwable)e);
            return new ArrayList<BusinessPartner>();
        }
        HashMap<String, BusinessPartner> partnerMap = new HashMap<String, BusinessPartner>(noLinkMerchantIds.size());
        List<Map<String, Object>> partnerFieldMap = this.readPartnerFieldMap(0);
        LinkBy linkBy = null;
        QuerySchema schema = QuerySchema.create().addSelect("linkBy").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"linkObject").eq((Object)"0")}));
        List partnerLinkRules = MetaDaoHelper.queryObject((String)"base.businesspartner.PartnerLinkRule", (QuerySchema)schema, null);
        linkBy = !org.springframework.util.CollectionUtils.isEmpty((Collection)partnerLinkRules) ? ((PartnerLinkRule)partnerLinkRules.get(0)).getLinkBy() : LinkBy.BY_NAME;
        HashMap<String, BusinessPartner> businessPartnerLinkByMap = new HashMap<String, BusinessPartner>(partners == null ? 16 : partners.size());
        if (linkBy.getValue() == LinkBy.BY_NAME.getValue()) {
            for (BusinessPartner partner : partners) {
                businessPartnerLinkByMap.put(this.mulLangObjectConvertString(partner.get("name"), locale), partner);
            }
        } else if (linkBy.getValue() == LinkBy.BY_CREDIT_CODE.getValue()) {
            for (BusinessPartner partner : partners) {
                if (!StringUtils.isNotBlank((CharSequence)partner.getCreditCode())) continue;
                businessPartnerLinkByMap.put(partner.getCreditCode(), partner);
            }
        } else if (linkBy.getValue() == LinkBy.BY_CODE.getValue()) {
            for (BusinessPartner partner : partners) {
                if (!StringUtils.isNotBlank((CharSequence)partner.getCode())) continue;
                businessPartnerLinkByMap.put(partner.getCode(), partner);
            }
        }
        List businessPartners = null;
        for (Merchant merchant : merchantMap.values()) {
            BusinessPartner partner = null;
            if (linkBy.getValue() == LinkBy.BY_NAME.getValue() && StringUtils.isNotBlank((CharSequence)this.mulLangObjectConvertString(merchant.get("name"), locale))) {
                if (businessPartnerLinkByMap.containsKey(this.mulLangObjectConvertString(merchant.get("name"), locale))) {
                    partner = (BusinessPartner)businessPartnerLinkByMap.get(this.mulLangObjectConvertString(merchant.get("name"), locale));
                }
                if (partner == null) {
                    QuerySchema querySchemaByName = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)this.mulLangObjectConvertString(merchant.get("name"), locale))}));
                    businessPartners = MetaDaoHelper.queryObject((String)"base.businesspartner.BusinessPartner", (QuerySchema)querySchemaByName, null);
                }
            } else if (linkBy.getValue() == LinkBy.BY_CREDIT_CODE.getValue()) {
                if (StringUtils.isBlank((CharSequence)merchant.getCreditCode())) continue;
                if (businessPartnerLinkByMap.containsKey(merchant.getCreditCode())) {
                    partner = (BusinessPartner)businessPartnerLinkByMap.get(merchant.getCreditCode());
                }
                if (partner == null) {
                    QuerySchema querySchemaByName = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"creditCode").eq((Object)merchant.getCreditCode())}));
                    businessPartners = MetaDaoHelper.queryObject((String)"base.businesspartner.BusinessPartner", (QuerySchema)querySchemaByName, null);
                }
            } else if (linkBy.getValue() == LinkBy.BY_CODE.getValue() && StringUtils.isNotBlank((CharSequence)merchant.getCode())) {
                if (businessPartnerLinkByMap.containsKey(merchant.getCode())) {
                    partner = (BusinessPartner)businessPartnerLinkByMap.get(merchant.getCode());
                }
                if (partner == null) {
                    QuerySchema querySchemaByName = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)merchant.getCode())}));
                    businessPartners = MetaDaoHelper.queryObject((String)"base.businesspartner.BusinessPartner", (QuerySchema)querySchemaByName, null);
                }
            }
            if (partner == null && this.dealExistingPartners(partnerMap, businessPartners)) {
                for (BusinessPartner businessPartner : businessPartners) {
                    if (partnerMap.get(businessPartner.getId()) == null) continue;
                    partner = (BusinessPartner)partnerMap.get(businessPartner.getId());
                }
            }
            if (partner != null) {
                final PartnerMerchantComparison comparison = BusinessPartnerUtils.generateMerchantComparison((String)((String)partner.getId()), (Long)((Long)merchant.getId()));
                List partnerMerchantComparisons = partner.partnerMerchantComparisons();
                if (!org.springframework.util.CollectionUtils.isEmpty((Collection)partnerMerchantComparisons)) {
                    partnerMerchantComparisons.add(comparison);
                } else {
                    partnerMerchantComparisons = new LinkedList<PartnerMerchantComparison>(){
                        {
                            this.add(comparison);
                        }
                    };
                }
                partner.setPartnerMerchantComparisons(partnerMerchantComparisons);
                this.partnerMerchantMainSync(partner, merchant, 1, partnerFieldMap);
                if (partner.containsKey((Object)"insertNeeded")) {
                    partner.setEntityStatus(EntityStatus.Insert);
                }
                if (!org.springframework.util.CollectionUtils.isEmpty((Collection)partner.partnerRoleClasses())) {
                    List roleClasses = partner.partnerRoleClasses();
                    for (RoleClass roleClass : roleClasses) {
                        if (!RoleClassName.merchant.equals((Object)roleClass.getRoleClassName())) continue;
                        if (partner.getEntityStatus() == null || !EntityStatus.Insert.equals((Object)partner.getEntityStatus())) {
                            roleClass.setEntityStatus(EntityStatus.Update);
                        }
                        roleClass.setIsCheck(Boolean.valueOf(true));
                    }
                }
                this.setBusinessPartnerLinkByMap(locale, linkBy, businessPartnerLinkByMap, partner);
            } else {
                partner = new BusinessPartner();
                long partnerId = partner.getId() == null ? IdManager.getInstance().nextId() : ((Long)partner.getId()).longValue();
                partner.setId((Object)String.valueOf(partnerId));
                partner.setStatus(Status.enable);
                partner.setCode(merchant.getCode());
                partner.setPartnerBankDatas(partner.partnerBankDatas() == null ? new ArrayList() : partner.partnerBankDatas());
                this.partnerMerchantMainSync(partner, merchant, 1, partnerFieldMap);
                BusinessPartnerUtils.assignNameIfMissing((BusinessPartner)partner, (BizObject)merchant);
                partner.setEntityStatus(EntityStatus.Insert);
                final PartnerMerchantComparison comparison = BusinessPartnerUtils.generateMerchantComparison((String)((String)partner.getId()), (Long)((Long)merchant.getId()));
                LinkedList<PartnerMerchantComparison> merchantComparisons = new LinkedList<PartnerMerchantComparison>(){
                    {
                        this.add(comparison);
                    }
                };
                partner.setPartnerMerchantComparisons((List)merchantComparisons);
                ArrayList<RoleClass> roleClasses = new ArrayList<RoleClass>();
                for (RoleClassName roleClassName : RoleClassName.values()) {
                    RoleClass roleClass = new RoleClass();
                    long roleClassId = IdManager.getInstance().nextId();
                    roleClass.setId((Object)String.valueOf(roleClassId));
                    roleClass.setPartnerId(String.valueOf(partnerId));
                    roleClass.setRoleClassName(roleClassName);
                    if (roleClassName == RoleClassName.org) {
                        roleClass.setIsCheck(Boolean.valueOf(partner.getInternalOrgId() != null));
                    } else {
                        roleClass.setIsCheck(Boolean.valueOf(RoleClassName.merchant == roleClassName));
                    }
                    roleClass.setEntityStatus(EntityStatus.Insert);
                    roleClasses.add(roleClass);
                }
                partner.setPartnerRoleClasses(roleClasses);
                partnerMap.put(partner.getId().toString(), partner);
                this.setBusinessPartnerLinkByMap(locale, linkBy, businessPartnerLinkByMap, partner);
                partner.put("insertNeeded", (Object)true);
            }
            if (syncRule.getCascadeObject() == null || !SyncCascadeObject.vendor.equals((Object)syncRule.getCascadeObject())) continue;
            partner.put("merchant_createOrg", (Object)merchant.getCreateOrg());
        }
        return new ArrayList<BusinessPartner>(partnerMap.values());
    }

    private void setBusinessPartnerLinkByMap(String locale, LinkBy linkBy, HashMap<String, BusinessPartner> businessPartnerLinkByMap, BusinessPartner partner) {
        if (linkBy.getValue() == 0) {
            businessPartnerLinkByMap.put(this.mulLangObjectConvertString(partner.get("name"), locale), partner);
        } else if (linkBy.getValue() == 1 && StringUtils.isNotBlank((CharSequence)partner.getCreditCode())) {
            businessPartnerLinkByMap.put(partner.getCreditCode(), partner);
        }
    }

    private boolean dealExistingPartners(Map<String, BusinessPartner> partnerMap, List<BusinessPartner> businessPartners) throws Exception {
        if (!org.springframework.util.CollectionUtils.isEmpty(businessPartners)) {
            ArrayList<String> partnerIds = new ArrayList<String>(businessPartners.size());
            for (BusinessPartner businessPartner : businessPartners) {
                partnerIds.add(businessPartner.getId().toString());
            }
            Map<String, BusinessPartner> partnerByIds = this.getPartnerByIds(partnerIds);
            for (Map.Entry<String, BusinessPartner> entry : partnerByIds.entrySet()) {
                BusinessPartner businessPartner = entry.getValue();
                businessPartner.setEntityStatus(EntityStatus.Update);
                businessPartner.put("partnerFrom", (Object)4);
                partnerMap.put(businessPartner.getId().toString(), businessPartner);
            }
            return true;
        }
        return false;
    }

    public List<BusinessPartner> batchInsertPartnerByVendor(List<Long> noLinkVendorIds) throws Exception {
        if (this.empty(noLinkVendorIds).booleanValue()) {
            return new ArrayList<BusinessPartner>();
        }
        Map<String, Vendor> vendorMap = null;
        try {
            vendorMap = this.getVendorByIds(noLinkVendorIds);
        }
        catch (Exception e) {
            this.logger.error("getVendorByIds\u67e5\u8be2\u4f9b\u5e94\u5546\u6863\u6848\u5931\u8d25\u5f02\u5e38: {}, getVendorByIds\u67e5\u8be2\u4f9b\u5e94\u5546\u6863\u6848\u5931\u8d25\u5f02\u5e38\u8be6\u60c5\uff1a" + e.getMessage(), (Throwable)e);
        }
        HashMap<String, BusinessPartner> partnerMap = new HashMap<String, BusinessPartner>();
        List<Map<String, Object>> partnerFieldMap = this.readPartnerFieldMap(1);
        for (Vendor vendor : vendorMap.values()) {
            BusinessPartner partner = new BusinessPartner();
            String partnerId = String.valueOf(IdManager.getInstance().nextId());
            partner.setStatus(Status.enable);
            partner.setId((Object)partnerId);
            partner.setCode(vendor.getCode());
            partner.setPartnerBankDatas(new ArrayList());
            partner.setEntityStatus(EntityStatus.Insert);
            this.partnerVendorMainSync(partner, vendor, 1, partnerFieldMap);
            BusinessPartnerUtils.assignNameIfMissing((BusinessPartner)partner, (BizObject)vendor);
            partner.setEntityStatus(EntityStatus.Insert);
            final PartnerVendorComparison comparison = new PartnerVendorComparison();
            comparison.setPartnerId(String.valueOf(partnerId));
            comparison.setVendorId((Long)vendor.getId());
            comparison.setIsDefault(Boolean.valueOf(true));
            comparison.setEntityStatus(EntityStatus.Insert);
            LinkedList<PartnerVendorComparison> vendorComparisons = new LinkedList<PartnerVendorComparison>(){
                {
                    this.add(comparison);
                }
            };
            partner.setPartnerVendorComparisons((List)vendorComparisons);
            ArrayList<RoleClass> roleClasses = new ArrayList<RoleClass>();
            for (RoleClassName roleClassName : RoleClassName.values()) {
                RoleClass roleClass = new RoleClass();
                long roleClassId = IdManager.getInstance().nextId();
                roleClass.setId((Object)String.valueOf(roleClassId));
                roleClass.setPartnerId(String.valueOf(partnerId));
                roleClass.setRoleClassName(roleClassName);
                if (roleClassName == RoleClassName.org) {
                    roleClass.setIsCheck(Boolean.valueOf(partner.getInternalOrgId() != null));
                } else {
                    roleClass.setIsCheck(Boolean.valueOf(RoleClassName.vendor == roleClassName));
                }
                roleClass.setEntityStatus(EntityStatus.Insert);
                roleClasses.add(roleClass);
            }
            partner.setPartnerRoleClasses(roleClasses);
            partnerMap.put(partner.getId().toString(), partner);
        }
        return new ArrayList<BusinessPartner>(partnerMap.values());
    }

    public List<BusinessPartner> batchInsertPartnerByVendorNew(List<Long> noLinkVendorIds, List<BusinessPartner> partners, String locale, PartnerSyncRule syncRule) throws Exception {
        if (this.empty(noLinkVendorIds).booleanValue()) {
            return new ArrayList<BusinessPartner>();
        }
        Map<String, Vendor> vendorMap = null;
        try {
            vendorMap = this.getVendorByIds(noLinkVendorIds);
        }
        catch (Exception e) {
            this.logger.error("getVendorByIds\u67e5\u8be2\u4f9b\u5e94\u5546\u6863\u6848\u5931\u8d25\u5f02\u5e38: {}, getVendorByIds\u67e5\u8be2\u4f9b\u5e94\u5546\u6863\u6848\u5931\u8d25\u5f02\u5e38\u8be6\u60c5\uff1a" + e.getMessage(), (Throwable)e);
        }
        HashMap<String, BusinessPartner> partnerMap = new HashMap<String, BusinessPartner>();
        List<Map<String, Object>> partnerFieldMap = this.readPartnerFieldMap(1);
        LinkBy linkBy = null;
        QuerySchema schema = QuerySchema.create().addSelect("linkBy").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"linkObject").eq((Object)"1")}));
        List partnerLinkRules = MetaDaoHelper.queryObject((String)"base.businesspartner.PartnerLinkRule", (QuerySchema)schema, null);
        linkBy = !org.springframework.util.CollectionUtils.isEmpty((Collection)partnerLinkRules) ? ((PartnerLinkRule)partnerLinkRules.get(0)).getLinkBy() : LinkBy.BY_NAME;
        HashMap<String, BusinessPartner> businessPartnerLinkByMap = new HashMap<String, BusinessPartner>(partners == null ? 16 : partners.size());
        if (linkBy.getValue() == LinkBy.BY_NAME.getValue()) {
            for (BusinessPartner partner : partners) {
                businessPartnerLinkByMap.put(this.mulLangObjectConvertString(partner.get("name"), locale), partner);
            }
        } else if (linkBy.getValue() == LinkBy.BY_CREDIT_CODE.getValue()) {
            for (BusinessPartner partner : partners) {
                if (!StringUtils.isNotBlank((CharSequence)partner.getCreditCode())) continue;
                businessPartnerLinkByMap.put(partner.getCreditCode(), partner);
            }
        } else if (linkBy.getValue() == LinkBy.BY_CODE.getValue()) {
            for (BusinessPartner partner : partners) {
                if (!StringUtils.isNotBlank((CharSequence)partner.getCode())) continue;
                businessPartnerLinkByMap.put(partner.getCode(), partner);
            }
        }
        List businessPartners = null;
        for (Vendor vendor : vendorMap.values()) {
            BusinessPartner partner = null;
            if (linkBy.getValue() == LinkBy.BY_NAME.getValue() && StringUtils.isNotBlank((CharSequence)this.mulLangObjectConvertString(vendor.get("name"), locale))) {
                if (businessPartnerLinkByMap.containsKey(this.mulLangObjectConvertString(vendor.get("name"), locale))) {
                    partner = (BusinessPartner)businessPartnerLinkByMap.get(this.mulLangObjectConvertString(vendor.get("name"), locale));
                }
                if (partner == null) {
                    QuerySchema querySchemaByName = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)this.mulLangObjectConvertString(vendor.get("name"), locale))}));
                    businessPartners = MetaDaoHelper.queryObject((String)"base.businesspartner.BusinessPartner", (QuerySchema)querySchemaByName, null);
                }
            } else if (linkBy.getValue() == LinkBy.BY_CREDIT_CODE.getValue() && StringUtils.isNotBlank((CharSequence)vendor.getCreditcode())) {
                if (StringUtils.isBlank((CharSequence)vendor.getCreditcode())) continue;
                if (businessPartnerLinkByMap.containsKey(vendor.getCreditcode())) {
                    partner = (BusinessPartner)businessPartnerLinkByMap.get(vendor.getCreditcode());
                }
                if (partner == null) {
                    QuerySchema querySchemaByName = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"creditCode").eq((Object)vendor.getCreditcode())}));
                    businessPartners = MetaDaoHelper.queryObject((String)"base.businesspartner.BusinessPartner", (QuerySchema)querySchemaByName, null);
                }
            } else if (linkBy.getValue() == LinkBy.BY_CODE.getValue() && StringUtils.isNotBlank((CharSequence)vendor.getCode())) {
                if (businessPartnerLinkByMap.containsKey(vendor.getCode())) {
                    partner = (BusinessPartner)businessPartnerLinkByMap.get(vendor.getCode());
                }
                if (partner == null) {
                    QuerySchema querySchemaByName = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)vendor.getCode())}));
                    businessPartners = MetaDaoHelper.queryObject((String)"base.businesspartner.BusinessPartner", (QuerySchema)querySchemaByName, null);
                }
            }
            if (partner == null && this.dealExistingPartners(partnerMap, businessPartners)) {
                for (BusinessPartner businessPartner : businessPartners) {
                    if (partnerMap.get(businessPartner.getId()) == null) continue;
                    partner = (BusinessPartner)partnerMap.get(businessPartner.getId());
                }
            }
            if (partner != null) {
                final PartnerVendorComparison comparison = BusinessPartnerUtils.generatePartnerVendorComparison((String)((String)partner.getId()), (Long)((Long)vendor.getId()));
                List partnerVendorComparisons = partner.partnerVendorComparisons();
                if (!org.springframework.util.CollectionUtils.isEmpty((Collection)partnerVendorComparisons)) {
                    partnerVendorComparisons.add(comparison);
                } else {
                    partnerVendorComparisons = new LinkedList<PartnerVendorComparison>(){
                        {
                            this.add(comparison);
                        }
                    };
                }
                partner.setPartnerVendorComparisons(partnerVendorComparisons);
                this.partnerVendorMainSync(partner, vendor, 1, partnerFieldMap);
                if (partner.containsKey((Object)"insertNeeded")) {
                    partner.setEntityStatus(EntityStatus.Insert);
                }
                if (!org.springframework.util.CollectionUtils.isEmpty((Collection)partner.partnerRoleClasses())) {
                    List roleClasses = partner.partnerRoleClasses();
                    for (RoleClass roleClass : roleClasses) {
                        if (!RoleClassName.vendor.equals((Object)roleClass.getRoleClassName())) continue;
                        if (partner.getEntityStatus() == null || !EntityStatus.Insert.equals((Object)partner.getEntityStatus())) {
                            roleClass.setEntityStatus(EntityStatus.Update);
                        }
                        roleClass.setIsCheck(Boolean.valueOf(true));
                    }
                }
                this.setBusinessPartnerLinkByMap(locale, linkBy, businessPartnerLinkByMap, partner);
            } else {
                partner = new BusinessPartner();
                partner.setEntityStatus(EntityStatus.Insert);
                long partnerId = partner.getId() == null ? IdManager.getInstance().nextId() : ((Long)partner.getId()).longValue();
                partner.setStatus(Status.enable);
                partner.setId((Object)String.valueOf(partnerId));
                partner.setPartnerBankDatas(new ArrayList());
                partner.setCode(vendor.getCode());
                this.partnerVendorMainSync(partner, vendor, 1, partnerFieldMap);
                BusinessPartnerUtils.assignNameIfMissing((BusinessPartner)partner, (BizObject)vendor);
                partner.setEntityStatus(EntityStatus.Insert);
                final PartnerVendorComparison comparison = BusinessPartnerUtils.generatePartnerVendorComparison((String)String.valueOf(partnerId), (Long)((Long)vendor.getId()));
                LinkedList<PartnerVendorComparison> vendorComparisons = new LinkedList<PartnerVendorComparison>(){
                    {
                        this.add(comparison);
                    }
                };
                partner.setPartnerVendorComparisons((List)vendorComparisons);
                ArrayList<RoleClass> roleClasses = new ArrayList<RoleClass>();
                for (RoleClassName roleClassName : RoleClassName.values()) {
                    RoleClass roleClass = new RoleClass();
                    long roleClassId = IdManager.getInstance().nextId();
                    roleClass.setId((Object)String.valueOf(roleClassId));
                    roleClass.setPartnerId(String.valueOf(partnerId));
                    roleClass.setRoleClassName(roleClassName);
                    if (roleClassName == RoleClassName.org) {
                        roleClass.setIsCheck(Boolean.valueOf(partner.getInternalOrgId() != null));
                    } else {
                        roleClass.setIsCheck(Boolean.valueOf(RoleClassName.vendor == roleClassName));
                    }
                    roleClass.setEntityStatus(EntityStatus.Insert);
                    roleClasses.add(roleClass);
                }
                partner.setPartnerRoleClasses(roleClasses);
                partnerMap.put(partner.getId().toString(), partner);
                this.setBusinessPartnerLinkByMap(locale, linkBy, businessPartnerLinkByMap, partner);
                partner.put("insertNeeded", (Object)true);
            }
            if (syncRule.getCascadeObject() == null || !SyncCascadeObject.merchant.equals((Object)syncRule.getCascadeObject())) continue;
            partner.put("vendor_createOrg", (Object)vendor.getOrg());
        }
        return new ArrayList<BusinessPartner>(partnerMap.values());
    }

    public void batchInsertPartnerByCapital(List<String> noLinkCapitalIds, Map<String, BusinessPartner> partnerMap, String locale) throws Exception {
        if (this.empty(noLinkCapitalIds).booleanValue()) {
            return;
        }
        Collection<BusinessPartner> partners = partnerMap.values();
        QuerySchema schema = QuerySchema.create().addSelect("linkBy").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"linkObject").eq((Object)"3")}));
        List partnerLinkRules = MetaDaoHelper.queryObject((String)"base.businesspartner.PartnerLinkRule", (QuerySchema)schema, null);
        LinkBy linkBy = !org.springframework.util.CollectionUtils.isEmpty((Collection)partnerLinkRules) ? ((PartnerLinkRule)partnerLinkRules.get(0)).getLinkBy() : LinkBy.BY_NAME;
        HashMap<String, BusinessPartner> businessPartnerLinkByMap = new HashMap<String, BusinessPartner>(partners.size());
        if (linkBy.getValue() == 0) {
            for (BusinessPartner partner : partners) {
                businessPartnerLinkByMap.put(this.mulLangObjectConvertString(partner.get("name"), locale), partner);
            }
        } else if (linkBy.getValue() == 1) {
            for (BusinessPartner partner : partners) {
                if (!StringUtils.isNotBlank((CharSequence)partner.getCreditCode())) continue;
                businessPartnerLinkByMap.put(partner.getCreditCode(), partner);
            }
        }
        FundBizObjArchQueryReq fundBizObjArchQueryReq = new FundBizObjArchQueryReq();
        for (String noLinkCapitalId : noLinkCapitalIds) {
            BusinessPartner partner = null;
            fundBizObjArchQueryReq.setId(noLinkCapitalId);
            FundBusinObjArchivesResp fundBusinObjArchivesResp = null;
            try {
                fundBusinObjArchivesResp = this.capitalPartnerService.queryFundBizObjArch(fundBizObjArchQueryReq);
            }
            catch (Exception e) {
                this.logger.error("\u67e5\u8be2\u8d44\u91d1\u4e1a\u52a1\u5bf9\u8c61\u5f02\u5e38: {}, \u67e5\u8be2\u8d44\u91d1\u4e1a\u52a1\u5bf9\u8c61\u5f02\u5e38\u5f02\u5e38\u9519\u8bef\u8be6\u60c5{}" + e.getMessage(), (Throwable)e);
            }
            if (fundBusinObjArchivesResp == null) continue;
            if (linkBy.getValue() == 0 && businessPartnerLinkByMap.containsKey(fundBusinObjArchivesResp.getFundbusinobjtypename())) {
                partner = (BusinessPartner)businessPartnerLinkByMap.get(fundBusinObjArchivesResp.getFundbusinobjtypename());
            } else if (linkBy.getValue() == 1 && businessPartnerLinkByMap.containsKey(fundBusinObjArchivesResp.getUnifiedSocialCreditCode())) {
                partner = (BusinessPartner)businessPartnerLinkByMap.get(fundBusinObjArchivesResp.getUnifiedSocialCreditCode());
            }
            if (partner != null) {
                if (AppContext.cache().get("businessPartnerLockKey_" + partner.getId() + AppContext.getCurrentUser().getYTenantId().toString()) != null) {
                    throw new CoreDocBusinessException(PartnerConstant.CONCURRENT_INFO);
                }
                final PartnerCapitalComparison capitalComparison = BusinessPartnerUtils.generateCapitalComparison((String)((String)partner.getId()), (String)noLinkCapitalId);
                partner.setPartnerCapitalComparisons((List)new LinkedList<PartnerCapitalComparison>(){
                    {
                        this.add(capitalComparison);
                    }
                });
                List<RoleClass> roleClasses = this.queryBusinessPartnerRole((String)partner.getId(), "3");
                if (org.springframework.util.CollectionUtils.isEmpty(roleClasses)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800743);
                }
                this.modifyPartnerRoleIsCheck(partner, roleClasses);
                partner.setEntityStatus(EntityStatus.Update);
            } else {
                partner = BusinessPartnerUtils.generateCapitalBusinessPartner((String)fundBusinObjArchivesResp.getId(), (Number)PartnerConstant.ROLE_CLASS_NAME_CAPITAL);
                if (fundBusinObjArchivesResp.getCode() == null) {
                    String businessPartnerCode = this.getBillCodeForCodeRule("base_businesspartner", "base.businesspartner.BusinessPartner");
                    partner.setCode(businessPartnerCode);
                } else if (fundBusinObjArchivesResp.getCode() != null) {
                    partner.setCode(fundBusinObjArchivesResp.getCode());
                }
                if (partner.getCode() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800744);
                }
            }
            partner.set("partnerFrom", (Object)"4");
            this.capitalMapPartner(fundBusinObjArchivesResp, partner);
            partnerMap.put(partner.getId().toString(), partner);
        }
    }

    public List<PartnerSyncRule> getAllSyncRule() throws Exception {
        List syncRuleList = this.getSyncPlan().planSyncRules();
        List<PartnerSyncRule> sortedList = syncRuleList.stream().sorted(Comparator.comparingInt(rule -> Optional.ofNullable(rule.getOrder()).orElse(0))).collect(Collectors.toList());
        return sortedList;
    }

    public ResultList partnerMerchantSync(List<String> partnerIds, int flag, String locale, String asyncKey, PartnerSyncRule syncRule, Boolean computePercentage) throws Exception {
        Map<String, BusinessPartner> partnerMap;
        try {
            partnerMap = this.getPartnerByIds(partnerIds);
        }
        catch (Exception e) {
            ResultList resultList = new ResultList();
            resultList.addMessage((Object)(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A2053800A5", (String)"\u4e1a\u52a1\u4f19\u4f34\u67e5\u8be2\u6709\u8bef\uff1a") + e));
            return resultList;
        }
        ArrayList<PartnerMerchantComparison> partnerMerchantList = new ArrayList<PartnerMerchantComparison>();
        for (BusinessPartner item : partnerMap.values()) {
            partnerMerchantList.addAll(item.partnerMerchantComparisons());
        }
        if (this.empty(partnerMerchantList).booleanValue()) {
            this.logger.info("\u4e1a\u52a1\u4f19\u4f34\u548c\u5ba2\u6237\u6863\u6848\u672a\u5173\u8054");
        }
        List<Map<String, Object>> partnerFieldMap = this.readPartnerFieldMap(0);
        ArrayList<Long> merchantIds = new ArrayList<Long>();
        if (0 == flag) {
            HashMap<String, Long> partnerMerchantMap = new HashMap<String, Long>(partnerIds.size());
            ArrayList<String> partnerComparison = new ArrayList<String>(partnerIds.size());
            for (PartnerMerchantComparison partnerMerchantComparison : partnerMerchantList) {
                if (partnerMerchantComparison.getIsDefault() == null || !partnerMerchantComparison.getIsDefault().booleanValue()) continue;
                merchantIds.add(partnerMerchantComparison.getMerchantId());
                partnerMerchantMap.put(partnerMerchantComparison.getPartnerId(), partnerMerchantComparison.getMerchantId());
                partnerComparison.add(partnerMerchantComparison.getPartnerId());
            }
            Map<String, Merchant> map = this.getMerchantByIds(merchantIds);
            for (Merchant merchant : map.values()) {
                String partnerId = this.getMerchantIdByPartnerId(partnerMerchantList, merchant.getId().toString(), 0);
                if (partnerId == null) continue;
                this.partnerMerchantMainSync(partnerMap.get(partnerId), merchant, 0, partnerFieldMap);
            }
            if (!map.isEmpty()) {
                Collection<Merchant> collection = map.values();
                for (Merchant value : collection) {
                    value.remove("orgId");
                }
            }
            try {
                if (!org.springframework.util.CollectionUtils.isEmpty(partnerComparison)) {
                    PushAndPullVO pushAndPullVO = new PushAndPullVO();
                    pushAndPullVO.setCode("partner_to_merchant");
                    pushAndPullVO.setIsMainSelect(1);
                    pushAndPullVO.setChildIds(partnerComparison);
                    Map map2 = this.makeBillRuleClientService.getTargetList(pushAndPullVO, "push");
                    List targetList = null;
                    if (map2 != null && map2.get("tarList") != null && !org.springframework.util.CollectionUtils.isEmpty((Collection)(targetList = (List)map2.get("tarList")))) {
                        for (Merchant merchant : targetList) {
                            Long aLong = (Long)partnerMerchantMap.get(merchant.getId());
                            merchant.remove("isPullAndPushTarget");
                            merchant.remove("vouchdate");
                            merchant.remove("_status");
                            merchant.remove("id");
                            Merchant merchantByMap = map.get(aLong.toString());
                            if (merchantByMap == null) continue;
                            this.businessPartnerService.putMapFieldInTargetObject((BizObject)merchant, (BizObject)merchantByMap, "merchantCharacter");
                            merchantByMap.putAll((Map)merchant);
                        }
                    }
                }
            }
            catch (Exception exception) {
                this.logger.error("\u4e1a\u52a1\u4f19\u4f34\u6863\u6848\u8f6c\u6362\u5ba2\u6237\u6863\u6848\u5f02\u5e38\uff1a{}\uff0c\u8be6\u60c5\u5f02\u5e38\uff1a{}" + exception.getMessage(), (Throwable)exception);
            }
            return this.batchSave(new ArrayList<Merchant>(map.values()), "aa.merchant.Merchant", asyncKey, computePercentage);
        }
        HashMap<Long, String> partnerMerchantMap = new HashMap<Long, String>(partnerIds.size());
        for (PartnerMerchantComparison partnerMerchantComparison : partnerMerchantList) {
            if (!partnerMerchantComparison.getIsDefault().booleanValue()) continue;
            merchantIds.add(partnerMerchantComparison.getMerchantId());
            partnerMerchantMap.put(partnerMerchantComparison.getMerchantId(), partnerMerchantComparison.getPartnerId());
        }
        Map<String, Merchant> merchantMap = this.getMerchantByIds(merchantIds);
        for (BusinessPartner businessPartner : partnerMap.values()) {
            String string = this.getMerchantIdByPartnerId(partnerMerchantList, businessPartner.getId().toString(), 1);
            if (string == null) continue;
            this.partnerMerchantMainSync(businessPartner, merchantMap.get(string), 1, partnerFieldMap);
        }
        try {
            if (!org.springframework.util.CollectionUtils.isEmpty(merchantIds)) {
                PushAndPullVO pushAndPullVO = new PushAndPullVO();
                pushAndPullVO.setCode("merchant_to_partner");
                pushAndPullVO.setIsMainSelect(1);
                pushAndPullVO.setChildIds(merchantIds.stream().map(x -> x + "").collect(Collectors.toList()));
                HashMap<String, Boolean> hashMap = new HashMap<String, Boolean>();
                hashMap.put("isUseBusiQuery", true);
                pushAndPullVO.setExternalDataMap(hashMap);
                Map map = this.makeBillRuleClientService.getTargetList(pushAndPullVO, "push");
                List targetList = null;
                if (map != null && map.get("tarList") != null && !org.springframework.util.CollectionUtils.isEmpty((Collection)(targetList = (List)map.get("tarList")))) {
                    for (BusinessPartner businessPartner : targetList) {
                        String aLong = (String)partnerMerchantMap.get(businessPartner.getCreatorId());
                        businessPartner.remove("isPullAndPushTarget");
                        businessPartner.remove("vouchdate");
                        businessPartner.remove("_status");
                        businessPartner.remove("id");
                        BusinessPartner businessPartnerMap = partnerMap.get(aLong);
                        if (businessPartnerMap == null) continue;
                        this.businessPartnerService.putMapFieldInTargetObject((BizObject)businessPartner, (BizObject)businessPartnerMap, "businessPartnerCharacterDef");
                        businessPartnerMap.putAll((Map)businessPartner);
                    }
                }
            }
        }
        catch (Exception exception) {
            this.logger.error("\u5ba2\u6237\u6863\u6848\u8f6c\u6362\u4e1a\u52a1\u4f19\u4f34\u6863\u6848\u5f02\u5e38\uff1a{}\uff0c\u8be6\u60c5\u5f02\u5e38\uff1a{}" + exception.getMessage(), (Throwable)exception);
        }
        ArrayList<BusinessPartner> arrayList = new ArrayList<BusinessPartner>(partnerMap.values());
        if (syncRule.getCreateTarget().booleanValue()) {
            List<Long> list = this.idsInSyncRange(syncRule).stream().map(merchantId -> Long.parseLong(merchantId.trim())).collect(Collectors.toList());
            ArrayList<Long> arrayList2 = new ArrayList<Long>();
            for (PartnerMerchantComparison item : partnerMerchantList) {
                arrayList2.add(item.getMerchantId());
            }
            list.removeAll(arrayList2);
            arrayList.addAll(this.batchInsertPartnerByMerchantNew(list, arrayList, locale, syncRule));
        }
        return this.batchSave(arrayList, "base.businesspartner.BusinessPartner", asyncKey, computePercentage);
    }

    private ResultList merchantToPartnerSync(Map<String, String> merchantComparisonMap, String locale, String asyncKey, PartnerSyncRule syncRule, Boolean computePercentage) throws Exception {
        List<String> existingPartnerIds = merchantComparisonMap.values().stream().filter(StringUtils::isNotBlank).collect(Collectors.toList());
        Map<String, BusinessPartner> partnerMap = this.getPartnerByIds(existingPartnerIds);
        List<Long> allMerchantIds = merchantComparisonMap.keySet().stream().map(Long::parseLong).collect(Collectors.toList());
        Map<String, Merchant> merchantMap = this.getMerchantByIds(allMerchantIds);
        List<Map<String, Object>> partnerFieldMap = this.readPartnerFieldMap(0);
        for (BusinessPartner businessPartner : partnerMap.values()) {
            ArrayList<PartnerMerchantComparison> partnerMerchantComparisons;
            if (org.springframework.util.CollectionUtils.isEmpty((Collection)businessPartner.partnerMerchantComparisons())) {
                partnerMerchantComparisons = new ArrayList<PartnerMerchantComparison>();
                PartnerMerchantComparison partnerMerchantComparison = BusinessPartnerUtils.generateMerchantComparison((String)((String)businessPartner.getId()), null);
                partnerMerchantComparisons.add(partnerMerchantComparison);
                businessPartner.setPartnerMerchantComparisons(partnerMerchantComparisons);
                for (Map.Entry<String, String> entry2 : merchantComparisonMap.entrySet()) {
                    if (!entry2.getKey().equals(businessPartner.getId())) continue;
                    partnerMerchantComparison.setMerchantId(Long.valueOf(entry2.getKey()));
                    break;
                }
            }
            partnerMerchantComparisons = businessPartner.partnerMerchantComparisons();
            for (PartnerMerchantComparison partnerMerchantComparison : partnerMerchantComparisons) {
                if (BooleanUtil.isFalse((Boolean)partnerMerchantComparison.getIsDefault()) || partnerMerchantComparison.getMerchantId() == null || merchantMap.get(partnerMerchantComparison.getMerchantId().toString()) == null) continue;
                this.partnerMerchantMainSync(businessPartner, merchantMap.get(partnerMerchantComparison.getMerchantId().toString()), 1, partnerFieldMap);
            }
        }
        try {
            if (!org.springframework.util.CollectionUtils.isEmpty(allMerchantIds)) {
                PushAndPullVO pushAndPullVO = new PushAndPullVO();
                pushAndPullVO.setCode("merchant_to_partner");
                pushAndPullVO.setIsMainSelect(1);
                pushAndPullVO.setChildIds(allMerchantIds.stream().map(x -> x + "").collect(Collectors.toList()));
                HashMap<String, Boolean> isUseBusiQuery = new HashMap<String, Boolean>();
                isUseBusiQuery.put("isUseBusiQuery", true);
                pushAndPullVO.setExternalDataMap(isUseBusiQuery);
                Map targetMap = this.makeBillRuleClientService.getTargetList(pushAndPullVO, "push");
                List targetList = null;
                if (!org.springframework.util.CollectionUtils.isEmpty((Map)targetMap) && targetMap.get("tarList") != null && !org.springframework.util.CollectionUtils.isEmpty((Collection)(targetList = (List)targetMap.get("tarList")))) {
                    for (BusinessPartner businessPartner : targetList) {
                        if (businessPartner.getCreatorId() == null) continue;
                        String aLong = merchantComparisonMap.get(businessPartner.getCreatorId().toString());
                        businessPartner.remove("isPullAndPushTarget");
                        businessPartner.remove("vouchdate");
                        businessPartner.remove("_status");
                        businessPartner.remove("id");
                        BusinessPartner businessPartnerMap = partnerMap.get(aLong);
                        if (businessPartnerMap == null) continue;
                        this.businessPartnerService.putMapFieldInTargetObject((BizObject)businessPartner, (BizObject)businessPartnerMap, "businessPartnerCharacterDef");
                        businessPartnerMap.putAll((Map)businessPartner);
                    }
                }
            }
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u6863\u6848\u8f6c\u6362\u4e1a\u52a1\u4f19\u4f34\u6863\u6848\u5f02\u5e38\uff1a{}\uff0c\u8be6\u60c5\u5f02\u5e38\uff1a{}" + e.getMessage(), (Throwable)e);
        }
        ArrayList<BusinessPartner> partners = new ArrayList<BusinessPartner>(partnerMap.values());
        if (syncRule.getCreateTarget().booleanValue()) {
            List<Long> merchantWithoutPartnerIds = merchantComparisonMap.entrySet().stream().filter(entry -> entry.getValue() == null || ((String)entry.getValue()).isEmpty()).map(key -> Long.parseLong((String)key.getKey())).collect(Collectors.toList());
            partners.addAll(this.batchInsertPartnerByMerchantNew(merchantWithoutPartnerIds, partners, locale, syncRule));
        }
        return this.batchSave(partners, "base.businesspartner.BusinessPartner", asyncKey, computePercentage);
    }

    public ResultList partnerVendorSync(List<String> partnerIds, int flag, String locale, String asyncKey, PartnerSyncRule syncRule, Boolean computePercentage) throws Exception {
        Map<String, BusinessPartner> partnerMap;
        try {
            partnerMap = this.getPartnerByIds(partnerIds);
        }
        catch (Exception e) {
            ResultList resultList = new ResultList();
            resultList.addMessage((Object)(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A2053800A5", (String)"\u4e1a\u52a1\u4f19\u4f34\u67e5\u8be2\u6709\u8bef\uff1a") + e));
            return resultList;
        }
        ArrayList<PartnerVendorComparison> partnerVendorList = new ArrayList<PartnerVendorComparison>();
        for (BusinessPartner partner : partnerMap.values()) {
            partnerVendorList.addAll(partner.partnerVendorComparisons());
        }
        if (this.empty(partnerVendorList).booleanValue()) {
            this.logger.info("\u4e1a\u52a1\u4f19\u4f34\u548c\u4f9b\u5e94\u5546\u6863\u6848\u672a\u5173\u8054");
        }
        List<Map<String, Object>> partnerFieldMap = this.readPartnerFieldMap(1);
        ArrayList<Long> vendorIds = new ArrayList<Long>();
        HashMap<String, Long> partnerVendorMap = new HashMap<String, Long>(partnerIds.size());
        ArrayList<String> partnerComparison = new ArrayList<String>(partnerIds.size());
        for (PartnerVendorComparison partnerVendorComparison : partnerVendorList) {
            if (partnerVendorComparison.getIsDefault() == null || !partnerVendorComparison.getIsDefault().booleanValue()) continue;
            vendorIds.add(partnerVendorComparison.getVendorId());
            partnerVendorMap.put(partnerVendorComparison.getPartnerId(), partnerVendorComparison.getVendorId());
            partnerComparison.add(partnerVendorComparison.getPartnerId());
        }
        Map<String, Vendor> vendorMap = this.getVendorByIds(vendorIds);
        for (Vendor vendor : vendorMap.values()) {
            String partnerId = this.getVendorIdByPartnerId(partnerVendorList, vendor.getId().toString(), 0);
            if (partnerId == null) continue;
            this.partnerVendorMainSync(partnerMap.get(partnerId), vendor, 0, partnerFieldMap);
        }
        if (!org.springframework.util.CollectionUtils.isEmpty(vendorMap)) {
            Collection<Vendor> collection = vendorMap.values();
            for (Vendor value : collection) {
                value.remove("orgId");
            }
        }
        try {
            if (!org.springframework.util.CollectionUtils.isEmpty(partnerComparison)) {
                PushAndPullVO pushAndPullVO = new PushAndPullVO();
                pushAndPullVO.setCode("partner_to_vendor");
                pushAndPullVO.setIsMainSelect(1);
                pushAndPullVO.setChildIds(partnerComparison);
                Map map = this.makeBillRuleClientService.getTargetList(pushAndPullVO, "push");
                List targetList = null;
                if (!org.springframework.util.CollectionUtils.isEmpty((Map)map) && map.get("tarList") != null && !org.springframework.util.CollectionUtils.isEmpty((Collection)(targetList = (List)map.get("tarList")))) {
                    for (Vendor vendor : targetList) {
                        Long aLong = (Long)partnerVendorMap.get(vendor.getId());
                        vendor.remove("isPullAndPushTarget");
                        vendor.remove("vouchdate");
                        vendor.remove("_status");
                        vendor.remove("id");
                        Vendor vendorByMap = vendorMap.get(aLong.toString());
                        if (vendorByMap == null) continue;
                        this.businessPartnerService.putMapFieldInTargetObject((BizObject)vendor, (BizObject)vendorByMap, "vendorCharacterDefine");
                        vendorByMap.putAll((Map)vendor);
                    }
                }
            }
        }
        catch (Exception exception) {
            this.logger.error("\u4e1a\u52a1\u4f19\u4f34\u6863\u6848\u8f6c\u6362\u4f9b\u5e94\u5546\u6863\u6848\u5f02\u5e38\uff1a{}\uff0c\u8be6\u60c5\u5f02\u5e38\uff1a{}" + exception.getMessage(), (Throwable)exception);
        }
        return this.batchSave(new ArrayList<Vendor>(vendorMap.values()), "aa.vendor.Vendor", asyncKey, computePercentage);
    }

    private ResultList vendorToPartnerSync(Map<String, String> vendorComparisonMap, String locale, String asyncKey, PartnerSyncRule syncRule, Boolean computePercentage) throws Exception {
        List<String> existingPartnerIds = vendorComparisonMap.values().stream().filter(StringUtils::isNotBlank).collect(Collectors.toList());
        Map<String, BusinessPartner> partnerMap = this.getPartnerByIds(existingPartnerIds);
        List<Long> allVendorIds = vendorComparisonMap.keySet().stream().map(Long::parseLong).collect(Collectors.toList());
        Map<String, Vendor> vendorMap = this.getVendorByIds(allVendorIds);
        List<Map<String, Object>> partnerFieldMap = this.readPartnerFieldMap(1);
        for (BusinessPartner businessPartner : partnerMap.values()) {
            ArrayList<PartnerVendorComparison> partnerVendorComparisons;
            if (org.springframework.util.CollectionUtils.isEmpty((Collection)businessPartner.partnerVendorComparisons()) && org.springframework.util.CollectionUtils.isEmpty((Collection)businessPartner.partnerVendorComparisons())) {
                partnerVendorComparisons = new ArrayList<PartnerVendorComparison>();
                PartnerVendorComparison partnerVendorComparison = BusinessPartnerUtils.generatePartnerVendorComparison((String)((String)businessPartner.getId()), null);
                partnerVendorComparisons.add(partnerVendorComparison);
                businessPartner.setPartnerVendorComparisons(partnerVendorComparisons);
                for (Map.Entry<String, String> entry2 : vendorComparisonMap.entrySet()) {
                    if (!entry2.getKey().equals(businessPartner.getId())) continue;
                    partnerVendorComparison.setVendorId(Long.valueOf(entry2.getKey()));
                    break;
                }
            }
            partnerVendorComparisons = businessPartner.partnerVendorComparisons();
            for (PartnerVendorComparison partnerVendorComparison : partnerVendorComparisons) {
                if (BooleanUtil.isFalse((Boolean)partnerVendorComparison.getIsDefault()) || partnerVendorComparison.getVendorId() == null || vendorMap.get(partnerVendorComparison.getVendorId().toString()) == null) continue;
                this.partnerVendorMainSync(businessPartner, vendorMap.get(partnerVendorComparison.getVendorId().toString()), 1, partnerFieldMap);
            }
        }
        try {
            if (!org.springframework.util.CollectionUtils.isEmpty(allVendorIds)) {
                PushAndPullVO pushAndPullVO = new PushAndPullVO();
                pushAndPullVO.setCode("vendor_to_partner");
                pushAndPullVO.setIsMainSelect(1);
                pushAndPullVO.setChildIds(allVendorIds.stream().map(x -> x + "").collect(Collectors.toList()));
                HashMap<String, Boolean> isUseBusiQuery = new HashMap<String, Boolean>();
                isUseBusiQuery.put("isUseBusiQuery", true);
                pushAndPullVO.setExternalDataMap(isUseBusiQuery);
                Map targetMap = this.makeBillRuleClientService.getTargetList(pushAndPullVO, "push");
                List targetList = null;
                if (!org.springframework.util.CollectionUtils.isEmpty((Map)targetMap) && targetMap.get("tarList") != null && !org.springframework.util.CollectionUtils.isEmpty((Collection)(targetList = (List)targetMap.get("tarList")))) {
                    for (BusinessPartner businessPartner : targetList) {
                        businessPartner.remove("isPullAndPushTarget");
                        businessPartner.remove("vouchdate");
                        businessPartner.remove("_status");
                        if (businessPartner.getId() == null) continue;
                        BusinessPartner businessPartnerMap = partnerMap.get(vendorComparisonMap.get(businessPartner.getId().toString()));
                        businessPartner.remove("id");
                        if (businessPartnerMap == null) continue;
                        this.businessPartnerService.putMapFieldInTargetObject((BizObject)businessPartner, (BizObject)businessPartnerMap, "businessPartnerCharacterDef");
                        businessPartnerMap.putAll((Map)businessPartner);
                    }
                }
            }
        }
        catch (Exception e) {
            this.logger.error("\u4f9b\u5e94\u5546\u6863\u6848\u8f6c\u6362\u4e1a\u52a1\u4f19\u4f34\u6863\u6848\u5f02\u5e38\uff1a{}\uff0c\u8be6\u60c5\u5f02\u5e38\uff1a{}" + e.getMessage(), (Throwable)e);
        }
        ArrayList<BusinessPartner> partners = new ArrayList<BusinessPartner>(partnerMap.values());
        if (syncRule.getCreateTarget().booleanValue()) {
            List<Long> vendorWithoutPartnerIds = vendorComparisonMap.entrySet().stream().filter(entry -> entry.getValue() == null || ((String)entry.getValue()).isEmpty()).map(key -> Long.parseLong((String)key.getKey())).collect(Collectors.toList());
            partners.addAll(this.batchInsertPartnerByVendorNew(vendorWithoutPartnerIds, partners, locale, syncRule));
        }
        return this.batchSave(partners, "base.businesspartner.BusinessPartner", asyncKey, computePercentage);
    }

    private ResultList partnerToCapitalSync(List<String> partnerIds, String locale, String asyncKey, Boolean computePercentage) throws Exception {
        Map<String, BusinessPartner> partnerMap;
        ResultList resultList = new ResultList();
        try {
            partnerMap = this.getPartnerByIds(partnerIds);
        }
        catch (Exception e) {
            resultList.addMessage((Object)(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A2053800A5", (String)"\u4e1a\u52a1\u4f19\u4f34\u67e5\u8be2\u6709\u8bef\uff1a") + e));
            return resultList;
        }
        ArrayList partnerCapitalList = new ArrayList();
        for (BusinessPartner businessPartner : partnerMap.values()) {
            if (org.springframework.util.CollectionUtils.isEmpty((Collection)businessPartner.partnerCapitalComparisons())) continue;
            partnerCapitalList.addAll(businessPartner.partnerCapitalComparisons());
        }
        if (this.empty(partnerCapitalList).booleanValue()) {
            this.logger.info("\u4e1a\u52a1\u4f19\u4f34\u548c\u8d44\u91d1\u4e1a\u52a1\u5bf9\u8c61\u6863\u6848\u672a\u5173\u8054");
        }
        int count = 0;
        for (BusinessPartner businessPartner : partnerMap.values()) {
            if (org.springframework.util.CollectionUtils.isEmpty((Collection)businessPartner.partnerCapitalComparisons())) continue;
            for (PartnerCapitalComparison capitalComparison : businessPartner.partnerCapitalComparisons()) {
                if (capitalComparison.getIsDefault() == null || !capitalComparison.getIsDefault().booleanValue()) continue;
                ++count;
            }
        }
        String string = "";
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("flag", 1);
        for (BusinessPartner businessPartner : partnerMap.values()) {
            if (org.springframework.util.CollectionUtils.isEmpty((Collection)businessPartner.partnerCapitalComparisons())) continue;
            for (PartnerCapitalComparison capitalComparison : businessPartner.partnerCapitalComparisons()) {
                if (capitalComparison.getIsDefault() == null || !capitalComparison.getIsDefault().booleanValue()) continue;
                FundBizObjArchQueryReq fundBizObjArchQueryReq = new FundBizObjArchQueryReq();
                fundBizObjArchQueryReq.setId(capitalComparison.getCapitalId());
                FundBusinObjArchivesResp fundBusinObjArchivesResp = this.capitalPartnerService.queryFundBizObjArch(fundBizObjArchQueryReq);
                this.partnerMapCapital(fundBusinObjArchivesResp, businessPartner, locale);
                resultList.setCount(resultList.getCount() + 1);
                try {
                    this.capitalPartnerService.insertFundBizObjArch(fundBusinObjArchivesResp);
                    resultList.incResultCount(true);
                }
                catch (Exception e) {
                    resultList.incResultCount(false);
                    resultList.addErrorMessage(businessPartner.getCode() + e.getMessage());
                }
                if (!computePercentage.booleanValue()) continue;
                int percentage = 0;
                if (count < 10) {
                    percentage = resultList.getCount() * 9;
                } else if (count != 0) {
                    percentage = resultList.getCount() / (count / 10) * 9;
                }
                if (percentage > 90) {
                    percentage = 90;
                }
                resultMap.put(TOTAL_COUNT, count);
                resultMap.put("percentage", percentage);
                resultMap.put("message", string);
                ProcessData.builder((int)1, (int)200, resultMap, (String)PartnerConstant.SYNCING_DATA).percentage(String.valueOf(percentage)).setValue(TOTAL_COUNT, (Object)count).successCount(resultList.getSucessCount()).failCount(resultList.getFailCount()).message((Object)string).build(asyncKey, Integer.valueOf(1800));
            }
        }
        return resultList;
    }

    public void partnerMapCapital(FundBusinObjArchivesResp fundBusinObjArchivesResp, BusinessPartner businessPartner, String locale) {
        fundBusinObjArchivesResp.setFundbusinobjtypename(this.mulLangObjectConvertString(businessPartner.get("name"), locale));
        fundBusinObjArchivesResp.setCountryregion(businessPartner.getCountry());
        fundBusinObjArchivesResp.setUnifiedSocialCreditCode(businessPartner.getCreditCode());
        fundBusinObjArchivesResp.setContact(businessPartner.getContactName());
        fundBusinObjArchivesResp.setContactnumber(businessPartner.getContactTel());
        fundBusinObjArchivesResp.setEmail(businessPartner.getEmail());
    }

    public void capitalMapPartner(FundBusinObjArchivesResp fundBusinObjArchivesResp, BusinessPartner businessPartner) {
        businessPartner.setName(fundBusinObjArchivesResp.getFundbusinobjtypename());
        businessPartner.setCountry(fundBusinObjArchivesResp.getCountryregion());
        businessPartner.setCreditCode(fundBusinObjArchivesResp.getUnifiedSocialCreditCode());
        businessPartner.setContactName(fundBusinObjArchivesResp.getContact());
        businessPartner.setContactTel(fundBusinObjArchivesResp.getContactnumber());
        businessPartner.setEmail(fundBusinObjArchivesResp.getEmail());
    }

    private ResultList capitalToPartnerSync(List<String> partnerIds, String asyncKey, PartnerSyncRule syncRule, String locale, Boolean computePercentage) throws Exception {
        Map<String, BusinessPartner> partnerMap = this.getPartnerByIds(partnerIds);
        HashSet<String> capitalComparisonIdSet = new HashSet<String>(partnerIds.size());
        FundBizObjArchQueryReq fundBizObjArchQueryReq = new FundBizObjArchQueryReq();
        for (BusinessPartner businessPartner : partnerMap.values()) {
            if (org.springframework.util.CollectionUtils.isEmpty((Collection)businessPartner.partnerCapitalComparisons())) continue;
            for (PartnerCapitalComparison capitalComparison : businessPartner.partnerCapitalComparisons()) {
                capitalComparisonIdSet.add(capitalComparison.getCapitalId());
                fundBizObjArchQueryReq.setId(capitalComparison.getCapitalId());
                FundBusinObjArchivesResp fundBusinObjArchivesResp = this.capitalPartnerService.queryFundBizObjArch(fundBizObjArchQueryReq);
                this.capitalMapPartner(fundBusinObjArchivesResp, businessPartner);
                businessPartner.setEntityStatus(EntityStatus.Update);
            }
        }
        if (syncRule.getCreateTarget().booleanValue()) {
            if (syncRule.getSyncRange() == SyncRange.all) {
                List allCapitalIdList = this.capitalPartnerService.queryFundBizObjArchByTenant();
                int differentialCapacity = allCapitalIdList.size() - capitalComparisonIdSet.size();
                if (differentialCapacity > 0) {
                    ArrayList<String> noLinkCapitalIdList = new ArrayList<String>((allCapitalIdList.size() - capitalComparisonIdSet.size()) * 2);
                    for (String capitalId : allCapitalIdList) {
                        if (capitalComparisonIdSet.contains(capitalId)) continue;
                        noLinkCapitalIdList.add(capitalId);
                    }
                    this.batchInsertPartnerByCapital(noLinkCapitalIdList, partnerMap, locale);
                }
            } else if (syncRule.get("idsInSyncRange") != null && !org.springframework.util.CollectionUtils.isEmpty((Collection)((List)syncRule.get("idsInSyncRange")))) {
                List idsInSyncRange = (List)syncRule.get("idsInSyncRange");
                idsInSyncRange.removeIf(capitalComparisonIdSet::contains);
                this.batchInsertPartnerByCapital(idsInSyncRange, partnerMap, locale);
            }
        }
        return this.batchSave(new ArrayList<BusinessPartner>(partnerMap.values()), "base.businesspartner.BusinessPartner", asyncKey, computePercentage);
    }

    public void mapMerchantDataToBusinessPartner(BusinessPartner businessPartner, MerchantPO merchantPO, List<Map<String, Object>> partnerFieldMap) throws Exception {
        if (businessPartner.getPartnerType() == PartnerType.other) {
            for (Map<String, Object> item : partnerFieldMap) {
                if (item.get("merchant") != null && item.get("merchant").toString().equals("leaderName")) {
                    item.put("merchant", "personCharge");
                    continue;
                }
                if (item.get("merchant") == null || !item.get("merchant").toString().equals("leaderNameIdNo")) continue;
                item.put("merchant", "personChargeIdNo");
            }
        }
        String local = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
        block1: for (Map<String, Object> item : partnerFieldMap) {
            if (item.get("merchant") == null || item.get("partner") == null) continue;
            Object merchantValue = merchantPO.getAttrValue(item.get("merchant").toString());
            if (merchantValue != null && merchantValue instanceof MultiLangText) {
                merchantValue = MultiLangUtils.multilangText2BizObject((MultiLangText)((MultiLangText)merchantValue));
            }
            if ("regAddress".equals(item.get("partner").toString())) {
                if (merchantValue == null) {
                    businessPartner.put(item.get("partner").toString(), merchantValue);
                    continue;
                }
                if (merchantValue instanceof BizObject) {
                    BizObject merchantValueObj = (BizObject)merchantValue;
                    businessPartner.put(item.get("partner").toString(), merchantValueObj.get(local));
                    continue;
                }
                if (!(merchantValue instanceof String)) continue;
                businessPartner.put(item.get("partner").toString(), merchantValue);
                continue;
            }
            if ("money".equals(item.get("partner").toString())) {
                merchantValue = RegexUtils.onlyRetainNumber((Object)merchantValue);
            }
            if ("financialSynergyFlag".equals(item.get("partner").toString()) && merchantValue != null) {
                merchantValue = Integer.valueOf(merchantValue.toString());
            }
            if ("internalOrgId".equals(item.get("partner").toString())) {
                List roles;
                if (EntityStatus.Insert.equals((Object)businessPartner.getEntityStatus())) {
                    roles = businessPartner.partnerRoleClasses();
                } else {
                    roles = businessPartner.partnerRoleClasses();
                    if (!org.springframework.util.CollectionUtils.isEmpty((Collection)roles)) {
                        for (RoleClass roleClass2 : roles) {
                            if (roleClass2.getRoleClassName() != RoleClassName.org) continue;
                            roleClass2.setEntityStatus(EntityStatus.Update);
                            break;
                        }
                    }
                }
                businessPartner.setPartnerRoleClasses(roles);
                if (merchantValue == null) {
                    businessPartner.put(item.get("partner").toString(), merchantValue);
                    if (org.springframework.util.CollectionUtils.isEmpty((Collection)roles)) continue;
                    for (RoleClass roleClass2 : roles) {
                        if (roleClass2.getRoleClassName() != RoleClassName.org) continue;
                        roleClass2.setIsCheck(Boolean.valueOf(false));
                        businessPartner.setPartnerRoleClasses(roles);
                        continue block1;
                    }
                    continue;
                }
                boolean financeOrg = true;
                if (!MerchantUtils.getIsInternalCustomer()) {
                    financeOrg = this.funcTypeQueryService.orgHasFunc((String)AppContext.getYTenantId(), merchantPO.getInternalOrgId(), "financeorg");
                }
                if (!financeOrg) continue;
                businessPartner.put(item.get("partner").toString(), merchantValue);
                if (org.springframework.util.CollectionUtils.isEmpty((Collection)roles)) continue;
                businessPartner.partnerRoleClasses().forEach(roleClass -> {
                    if (RoleClassName.org == roleClass.getRoleClassName()) {
                        roleClass.setIsCheck(Boolean.valueOf(true));
                        if (!EntityStatus.Insert.equals((Object)businessPartner.getEntityStatus())) {
                            roleClass.setEntityStatus(EntityStatus.Update);
                        }
                    }
                });
                continue;
            }
            businessPartner.put(item.get("partner").toString(), merchantValue);
        }
        if (merchantPO.getMerchantDetails() != null && merchantPO.getMerchantDetails().size() > 0) {
            businessPartner.setSearchcode(((MerchantDetailPO)merchantPO.getMerchantDetails().get(0)).getSearchCode());
        }
        businessPartner.set("partnerFrom", (Object)"4");
        businessPartner.set("specialKeyFromBusinessPartner", (Object)true);
        businessPartner.set("merchantToPartner", (Object)true);
        businessPartner.setEntityStatus(EntityStatus.Update);
    }

    public void partnerMerchantMainSync(BusinessPartner businessPartner, Merchant merchant, int flag, List<Map<String, Object>> partnerFieldMap) throws Exception {
        String local;
        if (businessPartner.getPartnerType() == PartnerType.other) {
            for (Map<String, Object> item2 : partnerFieldMap) {
                if (item2.get("merchant") != null && item2.get("merchant").toString().equals("leaderName")) {
                    item2.put("merchant", "personCharge");
                    continue;
                }
                if (item2.get("merchant") == null || !item2.get("merchant").toString().equals("leaderNameIdNo")) continue;
                item2.put("merchant", "personChargeIdNo");
            }
        }
        String string = local = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
        if (flag == 0) {
            for (Map map : partnerFieldMap) {
                if (map.get("merchant") == null || map.get("partner") == null) continue;
                Object partnerValue = businessPartner.get(map.get("partner"));
                if ("internalOrgId".equals(map.get("partner").toString())) {
                    merchant.put(map.get("merchant").toString(), partnerValue);
                    if (partnerValue != null) {
                        merchant.setInternalOrg(Boolean.valueOf(true));
                        continue;
                    }
                    merchant.setInternalOrg(Boolean.valueOf(false));
                    continue;
                }
                if ("financialSynergyFlag".equals(map.get("partner").toString()) && partnerValue != null) {
                    partnerValue = String.valueOf(partnerValue);
                }
                merchant.put(map.get("merchant").toString(), partnerValue);
            }
            if (merchant.merchantAppliedDetail() != null && merchant.merchantAppliedDetail().size() > 0) {
                ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setSearchcode(businessPartner.getSearchcode());
            }
            merchant.setEntityStatus(EntityStatus.Update);
            merchant.set("belongOrg", merchant.get("createOrg"));
            if (businessPartner.getPartnerType() == PartnerType.personal) {
                if (businessPartner.get("name") != null && businessPartner.get("name") instanceof BizObject) {
                    merchant.set("personName", ((BizObject)businessPartner.get("name")).get(local));
                } else {
                    merchant.set("personName", businessPartner.get("name"));
                }
            }
            if (!this.empty(businessPartner.partnerVendorComparisons()).booleanValue()) {
                Long vendorId = ((PartnerVendorComparison)businessPartner.partnerVendorComparisons().stream().filter(item -> item.getIsDefault()).collect(Collectors.toList()).get(0)).getVendorId();
                merchant.setSuppliers(vendorId);
            }
            merchant.set("specialKeyFromBusinessPartner", (Object)true);
        } else {
            block2: for (Map<String, Object> map : partnerFieldMap) {
                if (map.get("merchant") == null || map.get("partner") == null) continue;
                Object merchantValue = merchant.get(map.get("merchant"));
                if ("regAddress".equals(map.get("partner").toString())) {
                    if (merchantValue == null) {
                        businessPartner.put(map.get("partner").toString(), merchantValue);
                        continue;
                    }
                    if (merchantValue instanceof BizObject) {
                        BizObject merchantValueObj = (BizObject)merchantValue;
                        businessPartner.put(map.get("partner").toString(), merchantValueObj.get(local));
                        continue;
                    }
                    if (!(merchantValue instanceof String)) continue;
                    businessPartner.put(map.get("partner").toString(), merchantValue);
                    continue;
                }
                if ("money".equals(map.get("partner").toString())) {
                    merchantValue = RegexUtils.onlyRetainNumber((Object)merchantValue);
                }
                if ("financialSynergyFlag".equals(map.get("partner").toString()) && merchantValue != null) {
                    merchantValue = Integer.valueOf(merchantValue.toString());
                }
                if ("internalOrgId".equals(map.get("partner").toString())) {
                    List roles;
                    if (EntityStatus.Insert.equals((Object)businessPartner.getEntityStatus())) {
                        roles = businessPartner.partnerRoleClasses();
                    } else {
                        roles = businessPartner.partnerRoleClasses();
                        if (!org.springframework.util.CollectionUtils.isEmpty((Collection)roles)) {
                            for (RoleClass roleClass2 : roles) {
                                if (roleClass2.getRoleClassName() != RoleClassName.org) continue;
                                roleClass2.setEntityStatus(EntityStatus.Update);
                                break;
                            }
                        }
                    }
                    businessPartner.setPartnerRoleClasses(roles);
                    if (merchantValue == null) {
                        businessPartner.put(map.get("partner").toString(), merchantValue);
                        if (org.springframework.util.CollectionUtils.isEmpty((Collection)roles)) continue;
                        for (RoleClass roleClass2 : roles) {
                            if (roleClass2.getRoleClassName() != RoleClassName.org) continue;
                            roleClass2.setIsCheck(Boolean.valueOf(false));
                            businessPartner.setPartnerRoleClasses(roles);
                            continue block2;
                        }
                        continue;
                    }
                    boolean financeOrg = true;
                    if (!MerchantUtils.getIsInternalCustomer()) {
                        financeOrg = this.funcTypeQueryService.orgHasFunc((String)AppContext.getYTenantId(), merchant.getInternalOrgId(), "financeorg");
                    }
                    if (!financeOrg) continue;
                    businessPartner.put(map.get("partner").toString(), merchantValue);
                    if (org.springframework.util.CollectionUtils.isEmpty((Collection)roles)) continue;
                    businessPartner.partnerRoleClasses().forEach(roleClass -> {
                        if (RoleClassName.org == roleClass.getRoleClassName()) {
                            roleClass.setIsCheck(Boolean.valueOf(true));
                            if (!EntityStatus.Insert.equals((Object)businessPartner.getEntityStatus())) {
                                roleClass.setEntityStatus(EntityStatus.Update);
                            }
                        }
                    });
                    continue;
                }
                businessPartner.put(map.get("partner").toString(), merchantValue);
            }
            if (merchant.merchantAppliedDetail() != null && merchant.merchantAppliedDetail().size() > 0) {
                businessPartner.setSearchcode(((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).getSearchcode());
            }
            businessPartner.set("partnerFrom", (Object)"4");
            businessPartner.set("specialKeyFromBusinessPartner", (Object)true);
            businessPartner.set("merchantToPartner", (Object)true);
            businessPartner.setEntityStatus(EntityStatus.Update);
        }
    }

    public void partnerVendorMainSync(BusinessPartner businessPartner, Vendor vendor, int flag, List<Map<String, Object>> partnerFieldMap) throws Exception {
        String locale;
        String string = locale = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
        if (flag == 0) {
            for (Map<String, Object> item2 : partnerFieldMap) {
                if (item2.get("partner") == null || item2.get("vendor") == null) continue;
                if (item2.get("partner").toString().equals("licenseType")) {
                    if (businessPartner.getLicenseType() == null) {
                        vendor.put(item2.get("vendor").toString(), businessPartner.get(item2.get("partner")));
                        continue;
                    }
                    if (businessPartner.getLicenseType() == LicenseType.socialCodes) {
                        vendor.put("licenseType", (Object)"businessLicense");
                        continue;
                    }
                    if (businessPartner.getLicenseType() == LicenseType.businessLicense) {
                        vendor.put("licenseType", (Object)"uniqueIDCode");
                        continue;
                    }
                    if (businessPartner.getLicenseType() == LicenseType.otherLicenses) {
                        vendor.put("licenseType", (Object)"otherLicenses");
                        continue;
                    }
                    if (businessPartner.getLicenseType() == LicenseType.IDCard) {
                        vendor.put("licenseType", (Object)"idCard");
                        continue;
                    }
                    if (businessPartner.getLicenseType() == LicenseType.passport) {
                        vendor.put("licenseType", (Object)"passport");
                        continue;
                    }
                    if (businessPartner.getLicenseType() != LicenseType.otherIDDocuments) continue;
                    vendor.put("licenseType", (Object)"otherIDCard");
                    continue;
                }
                if (item2.get("partner").toString().equals("money")) continue;
                if (item2.get("partner").toString().equals("scope")) {
                    vendor.put(item2.get("vendor").toString(), (Object)this.mulLangObjectConvertString(businessPartner.get("scope"), locale));
                    continue;
                }
                if (item2.get("partner").toString().equals("internalOrgId")) {
                    vendor.put(item2.get("vendor").toString(), businessPartner.get(item2.get("partner")));
                    if (businessPartner.get(item2.get("partner")) != null) {
                        vendor.setInternalunit(Boolean.valueOf(true));
                        continue;
                    }
                    vendor.setInternalunit(Boolean.valueOf(false));
                    continue;
                }
                vendor.put(item2.get("vendor").toString(), businessPartner.get(item2.get("partner")));
            }
            if (vendor.vendorextends() != null) {
                vendor.vendorextends().setSimplename(this.mulLangObjectConvertString(businessPartner.get("shortname"), locale));
                vendor.vendorextends().setHelpcode(businessPartner.getSearchcode());
                if (businessPartner.getFinancialSynergyFlag() != null) {
                    boolean b = businessPartner.getFinancialSynergyFlag() == 1;
                    vendor.vendorextends().set("financialSynergy", (Object)b);
                }
            }
            vendor.set("isCreator", (Object)true);
            vendor.set("extSystemCode", (Object)16);
            vendor.setEntityStatus(EntityStatus.Update);
            vendor.set("specialKeyFromBusinessPartner", (Object)true);
            if (!this.empty(businessPartner.partnerMerchantComparisons()).booleanValue()) {
                Long merchantId = ((PartnerMerchantComparison)businessPartner.partnerMerchantComparisons().stream().filter(item -> item.getIsDefault()).collect(Collectors.toList()).get(0)).getMerchantId();
                vendor.setCorrespondingcust(merchantId);
            }
        } else {
            block1: for (Map<String, Object> item3 : partnerFieldMap) {
                if (item3.get("partner") == null || item3.get("vendor") == null) continue;
                Object vendorValue = vendor.get(item3.get("vendor"));
                if (item3.get("partner").toString().equals("internalOrgId")) {
                    List roles;
                    if (EntityStatus.Insert.equals((Object)businessPartner.getEntityStatus())) {
                        roles = businessPartner.partnerRoleClasses();
                    } else {
                        roles = businessPartner.partnerRoleClasses();
                        if (!org.springframework.util.CollectionUtils.isEmpty((Collection)roles)) {
                            for (RoleClass roleClass : roles) {
                                if (roleClass.getRoleClassName() != RoleClassName.org) continue;
                                roleClass.setEntityStatus(EntityStatus.Update);
                                break;
                            }
                        }
                    }
                    businessPartner.setPartnerRoleClasses(roles);
                    if (vendorValue == null) {
                        businessPartner.put(item3.get("partner").toString(), vendor.get(item3.get("vendor")));
                        if (org.springframework.util.CollectionUtils.isEmpty((Collection)roles)) continue;
                        for (RoleClass roleClass : roles) {
                            if (roleClass.getRoleClassName() != RoleClassName.org) continue;
                            roleClass.setIsCheck(Boolean.valueOf(false));
                            businessPartner.setPartnerRoleClasses(roles);
                            continue block1;
                        }
                        continue;
                    }
                    boolean financeorg = true;
                    if (!MerchantUtils.getIsInternalCustomer()) {
                        financeorg = this.funcTypeQueryService.orgHasFunc((String)AppContext.getYTenantId(), vendor.getCorrespondingorg(), "financeorg");
                    }
                    if (!financeorg) continue;
                    businessPartner.put(item3.get("partner").toString(), vendor.get(item3.get("vendor")));
                    if (org.springframework.util.CollectionUtils.isEmpty((Collection)roles)) continue;
                    for (RoleClass roleClass : roles) {
                        if (roleClass.getRoleClassName() != RoleClassName.org) continue;
                        roleClass.setIsCheck(Boolean.valueOf(true));
                        if (EntityStatus.Insert.equals((Object)businessPartner.getEntityStatus())) continue block1;
                        roleClass.setEntityStatus(EntityStatus.Update);
                        continue block1;
                    }
                    continue;
                }
                if (item3.get("partner").toString().equals("licenseType")) {
                    if (vendor.get("licenseType") == null) {
                        businessPartner.setLicenseType(null);
                        continue;
                    }
                    if ("businessLicense".equals(vendor.get("licenseType"))) {
                        businessPartner.setLicenseType(LicenseType.socialCodes);
                        continue;
                    }
                    if ("idCard".equals(vendor.get("licenseType"))) {
                        businessPartner.setLicenseType(LicenseType.IDCard);
                        continue;
                    }
                    if ("idNumber".equals(vendor.get("licenseType"))) continue;
                    if ("otherIDCard".equals(vendor.get("licenseType"))) {
                        businessPartner.setLicenseType(LicenseType.otherIDDocuments);
                        continue;
                    }
                    if ("otherLicenses".equals(vendor.get("licenseType"))) {
                        businessPartner.setLicenseType(LicenseType.otherLicenses);
                        continue;
                    }
                    if ("passport".equals(vendor.get("licenseType"))) {
                        businessPartner.setLicenseType(LicenseType.passport);
                        continue;
                    }
                    if (!"uniqueIDCode".equals(vendor.get("licenseType"))) continue;
                    businessPartner.setLicenseType(LicenseType.otherLicenses);
                    continue;
                }
                if (item3.get("partner").toString().equals("money")) continue;
                businessPartner.put(item3.get("partner").toString(), vendor.get(item3.get("vendor")));
            }
            if (vendor.vendorextends() != null) {
                businessPartner.setShortname(this.mulLangObjectConvertString(vendor.vendorextends().get("simplename"), locale));
                businessPartner.setSearchcode(vendor.vendorextends().getHelpcode());
                if (vendor.vendorextends().get("financialSynergy") != null) {
                    int financialSynergyFlag = BooleanUtil.isTrue((Boolean)((Boolean)vendor.vendorextends().get("financialSynergy"))) ? 1 : 0;
                    businessPartner.setFinancialSynergyFlag(Integer.valueOf(financialSynergyFlag));
                }
            }
            businessPartner.set("taxPayingCategories", vendor.get("taxPayingCategories"));
            businessPartner.set("partnerFrom", (Object)"4");
            businessPartner.set("vendorToPartner", (Object)true);
            businessPartner.setEntityStatus(EntityStatus.Update);
        }
    }

    public int getIndexByPartnerBank(List<BankData> bankList, String openBank, String bankAccount) {
        if (bankList == null) {
            return -1;
        }
        for (int i = 0; i < bankList.size(); ++i) {
            BankData merchantBank = bankList.get(i);
            if (merchantBank.getOpenBank() == null || merchantBank.getBankAccount() == null || !merchantBank.getOpenBank().equals(openBank) || !merchantBank.getBankAccount().equals(bankAccount)) continue;
            return i;
        }
        return -1;
    }

    private List<String> getPartnerIds() {
        HashMap<String, String> find = new HashMap<String, String>(16);
        find.put("ytenant_id", AppContext.getCurrentUser().getYTenantId());
        return SqlHelper.selectList((String)"com.yonyoucloud.upc.data.businesspartner.getBusinessPartnerAllId", find);
    }

    private List<Long> getMerchantIds() {
        QuerySchema qs = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"createMerchant").is_null()}));
        List merchantList = null;
        try {
            merchantList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)qs, (String)"productcenter");
        }
        catch (Exception e) {
            return new ArrayList<Long>();
        }
        if (this.empty(merchantList).booleanValue()) {
            return new ArrayList<Long>();
        }
        ArrayList<String> merchantIds = new ArrayList<String>();
        for (Map item : merchantList) {
            merchantIds.add(item.get("id").toString());
        }
        return merchantIds.stream().map(merchantId -> Long.parseLong(merchantId.trim())).collect(Collectors.toList());
    }

    private List<Long> getVendorIds() {
        QuerySchema qs = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"org.externalorg").eq((Object)false)}));
        List vendorList = null;
        try {
            vendorList = MetaDaoHelper.query((String)"aa.vendor.Vendor", (QuerySchema)qs, (String)"yssupplier");
        }
        catch (Exception e) {
            return new ArrayList<Long>();
        }
        if (this.empty(vendorList).booleanValue()) {
            return new ArrayList<Long>();
        }
        ArrayList<String> vendorIds = new ArrayList<String>();
        for (Map item : vendorList) {
            vendorIds.add(item.get("id").toString());
        }
        return vendorIds.stream().map(vendorId -> Long.parseLong(vendorId.trim())).collect(Collectors.toList());
    }

    private String getMerchantIdByPartnerId(List<PartnerMerchantComparison> merchantComparisons, String id, int flag) {
        if (0 == flag) {
            for (PartnerMerchantComparison item : merchantComparisons) {
                if (!item.getMerchantId().toString().equals(id)) continue;
                return item.getPartnerId();
            }
        } else {
            for (PartnerMerchantComparison item : merchantComparisons) {
                if (!item.getIsDefault().booleanValue() || !item.getPartnerId().equals(id)) continue;
                return item.getMerchantId().toString();
            }
        }
        return null;
    }

    private String getVendorIdByPartnerId(List<PartnerVendorComparison> vendorComparisons, String id, int flag) {
        if (0 == flag) {
            for (PartnerVendorComparison item : vendorComparisons) {
                if (!item.getVendorId().toString().equals(id)) continue;
                return item.getPartnerId();
            }
        } else {
            for (PartnerVendorComparison item : vendorComparisons) {
                if (!item.getIsDefault().booleanValue() || !item.getPartnerId().equals(id)) continue;
                return item.getVendorId().toString();
            }
        }
        return null;
    }

    public Map<String, BusinessPartner> getPartnerByIds(List<String> partnerIds) throws Exception {
        if (this.empty(partnerIds).booleanValue()) {
            return new HashMap<String, BusinessPartner>();
        }
        HashMap<String, BusinessPartner> partners = new HashMap<String, BusinessPartner>();
        QuerySchema detailSchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(partnerIds)}));
        detailSchema.addCompositionSchema(QuerySchema.create().name("partnerMerchantComparisons").fullname("base.businesspartner.PartnerMerchantComparison").addSelect("*"));
        detailSchema.addCompositionSchema(QuerySchema.create().name("partnerVendorComparisons").fullname("base.businesspartner.PartnerVendorComparison").addSelect("*"));
        detailSchema.addCompositionSchema(QuerySchema.create().name("partnerCapitalComparisons").fullname("base.businesspartner.PartnerCapitalComparison").addSelect("id, partnerId, capitalId, isDefault"));
        detailSchema.addCompositionSchema(QuerySchema.create().name("partnerRoleClasses").fullname("base.businesspartner.RoleClass").addSelect(PartnerConstant.ROLE_CLASS_NAME_FIELD));
        List partnerList = MetaDaoHelper.query((String)"base.businesspartner.BusinessPartner", (QuerySchema)detailSchema, (String)"productcenter");
        if (this.empty(partnerList).booleanValue()) {
            return partners;
        }
        Map<Object, Object> nameMap = new HashMap();
        List<String> partenerIdList = partnerList.stream().map(map -> map.get("id").toString()).collect(Collectors.toList());
        if (!org.springframework.util.CollectionUtils.isEmpty(partenerIdList)) {
            nameMap = this.getNameMultilingual(partenerIdList);
        }
        for (Map item : partnerList) {
            PartnerMerchantComparison comparison;
            BusinessPartner businessPartner = new BusinessPartner();
            ArrayList<BankData> bdList = new ArrayList<BankData>();
            ArrayList<PartnerMerchantComparison> mcList = new ArrayList<PartnerMerchantComparison>();
            ArrayList<PartnerMerchantComparison> vcList = new ArrayList<PartnerMerchantComparison>();
            businessPartner.init(item);
            businessPartner.put("name", nameMap.get(businessPartner.getId()));
            if (item.get("partnerBankDatas") != null) {
                List bankList = (List)item.get("partnerBankDatas");
                for (Map bank : bankList) {
                    BankData bankData = new BankData();
                    bankData.init(bank);
                    bdList.add(bankData);
                }
            }
            businessPartner.setPartnerBankDatas(bdList);
            if (item.get("partnerMerchantComparisons") != null) {
                List merList = (List)item.get("partnerMerchantComparisons");
                for (Map mer : merList) {
                    if ("1".equals(mer.get("dr").toString())) continue;
                    comparison = new PartnerMerchantComparison();
                    comparison.init(mer);
                    mcList.add(comparison);
                }
            }
            businessPartner.setPartnerMerchantComparisons(mcList);
            if (item.get("partnerVendorComparisons") != null) {
                List venList = (List)item.get("partnerVendorComparisons");
                for (Map ven : venList) {
                    if ("1".equals(ven.get("dr").toString())) continue;
                    comparison = new PartnerVendorComparison();
                    comparison.init(ven);
                    vcList.add(comparison);
                }
            }
            businessPartner.setPartnerVendorComparisons(vcList);
            businessPartner.setEntityStatus(EntityStatus.Unchanged);
            partners.put(businessPartner.get("id").toString(), businessPartner);
        }
        return partners;
    }

    public Map<String, Merchant> getMerchantByIds(List<Long> merchantIds) throws Exception {
        if (this.empty(merchantIds).booleanValue()) {
            return new HashMap<String, Merchant>();
        }
        HashMap<String, Merchant> merchants = new HashMap<String, Merchant>();
        QuerySchema detailSchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantIds), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
        detailSchema.addCompositionSchema(QuerySchema.create().name("merchantAgentFinancialInfos").fullname("aa.merchant.AgentFinancial").addSelect("*"));
        List merchantList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)detailSchema, null);
        int tryLockNum = 0;
        while (org.springframework.util.CollectionUtils.isEmpty((Collection)merchantList)) {
            if (tryLockNum > 60) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800032);
            }
            TimeUnit.MILLISECONDS.sleep(200L);
            ++tryLockNum;
            merchantList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)detailSchema, null);
        }
        if (this.empty(merchantList).booleanValue()) {
            return merchants;
        }
        detailSchema = QuerySchema.create().addSelect("id,merchantApplyRangeId,searchcode,stopstatus, exchangeratetype, merchantApplyRangeId.rangeType").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(merchantIds), QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true)}));
        List rangeDetailList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)detailSchema, null);
        for (Map item : merchantList) {
            Merchant merchant = new Merchant();
            ArrayList<AgentFinancial> financialList = new ArrayList<AgentFinancial>();
            merchant.init(item);
            this.setCNameMultilingual((BizObject)merchant);
            if (item.get("merchantAgentFinancialInfos") != null) {
                List bankList = (List)item.get("merchantAgentFinancialInfos");
                for (Map bank : bankList) {
                    AgentFinancial financial = new AgentFinancial();
                    financial.init(bank);
                    financialList.add(financial);
                }
            }
            merchant.setMerchantAgentFinancialInfos(financialList);
            merchant.setEntityStatus(EntityStatus.Unchanged);
            merchants.put(item.get("id").toString(), merchant);
            for (tryLockNum = 0; merchant.getId().toString().equals(merchant.getCode()) && tryLockNum < 5; ++tryLockNum) {
                TimeUnit.MILLISECONDS.sleep(1000L);
                QuerySchema codeSchema = QuerySchema.create().addSelect("code").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
                Map codeMap = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)codeSchema);
                if (codeMap == null || codeMap.isEmpty()) continue;
                merchant.setCode(codeMap.get("code").toString());
            }
        }
        if (this.empty(rangeDetailList).booleanValue()) {
            return merchants;
        }
        for (Map item : rangeDetailList) {
            if (item.get("rangeType") != null && !"3".equals(item.get("rangeType").toString())) {
                merchants.remove(item.get("id").toString());
            }
            MerchantApplyRangeDetail rangeDetail = new MerchantApplyRangeDetail();
            rangeDetail.set("id", item.get("id"));
            rangeDetail.setMerchantApplyRangeId(Long.valueOf(Long.parseLong(item.get("merchantApplyRangeId").toString())));
            if (item.get("stopstatus") != null) {
                rangeDetail.setStopstatus(Boolean.valueOf(Boolean.parseBoolean(item.get("stopstatus").toString())));
            }
            rangeDetail.setSearchcode(item.get("searchcode") == null ? null : item.get("searchcode").toString());
            rangeDetail.setExchangeratetype(item.get("exchangeratetype") == null ? null : item.get("exchangeratetype").toString());
            rangeDetail.setEntityStatus(EntityStatus.Update);
            LinkedList<MerchantApplyRangeDetail> tempDetailList = new LinkedList<MerchantApplyRangeDetail>();
            tempDetailList.add(rangeDetail);
            merchants.get(item.get("id").toString()).setMerchantAppliedDetail(tempDetailList);
        }
        return merchants;
    }

    public Map<String, Vendor> getVendorByIds(List<Long> vendorIds) throws Exception {
        if (this.empty(vendorIds).booleanValue()) {
            return new HashMap<String, Vendor>();
        }
        HashMap<String, Vendor> vendors = new HashMap<String, Vendor>();
        QuerySchema detailSchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(vendorIds)}));
        detailSchema.addCompositionSchema(QuerySchema.create().name("vendorbanks").fullname("aa.vendor.VendorBank").addSelect("*"));
        detailSchema.addCompositionSchema(QuerySchema.create().name("vendorextends").fullname("aa.vendor.VendorExtend").addSelect("*"));
        List vendorList = MetaDaoHelper.query((String)"aa.vendor.Vendor", (QuerySchema)detailSchema, (String)"yssupplier");
        if (this.empty(vendorList).booleanValue()) {
            return vendors;
        }
        Set originalOrgIds = vendorList.stream().map(item -> {
            if (item.get("org") != null) {
                return item.get("org").toString();
            }
            return "";
        }).collect(Collectors.toSet());
        Set filteredOrgIds = BusinessPartnerUtils.filterInternalOrgIds(originalOrgIds);
        if (org.springframework.util.CollectionUtils.isEmpty((Collection)filteredOrgIds)) {
            return new HashMap<String, Vendor>();
        }
        Iterator iterator = vendorList.iterator();
        while (iterator.hasNext()) {
            Map item2 = (Map)iterator.next();
            if (item2.get("orgId") == null || filteredOrgIds.contains(item2.get("orgId").toString())) continue;
            iterator.remove();
        }
        for (Map item3 : vendorList) {
            Vendor vendor = new Vendor();
            ArrayList<VendorBank> vendorBankList = new ArrayList<VendorBank>();
            VendorExtend extend = new VendorExtend();
            vendor.init(item3);
            vendor.set("name", (Object)this.queryVendorMulNameById(vendor));
            if (item3.get("vendorbanks") != null) {
                List bankList = (List)item3.get("vendorbanks");
                for (Map bank : bankList) {
                    VendorBank vendorBank = new VendorBank();
                    vendorBank.init(bank);
                    vendorBankList.add(vendorBank);
                }
            }
            vendor.setVendorbanks(vendorBankList);
            if (item3.get("vendorextends") != null) {
                Map vendorextendList = (Map)item3.get("vendorextends");
                extend.init(vendorextendList);
            }
            vendor.setVendorextends(extend);
            vendor.setEntityStatus(EntityStatus.Unchanged);
            vendors.put(item3.get("id").toString(), vendor);
        }
        return vendors;
    }

    private BizObject queryVendorMulNameById(Vendor vendor) throws Exception {
        QuerySchema schema = QuerySchema.create();
        QueryConditionGroup queryComparisonConditionGroup = new QueryConditionGroup();
        queryComparisonConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq(vendor.getId()));
        schema.addSelect("name").addCondition((ConditionExpression)queryComparisonConditionGroup);
        List bizObjects = MetaDaoHelper.queryObject((String)"aa.vendor.Vendor", (boolean)true, (QuerySchema)schema, null);
        if (!org.springframework.util.CollectionUtils.isEmpty((Collection)bizObjects)) {
            return (BizObject)((BizObject)bizObjects.get(0)).get("name");
        }
        return null;
    }

    public PartnerLinkPlan getLinkPlan() throws Exception {
        QuerySchema detailSchema = QuerySchema.create().addSelect("id,code,name,linkObject,linkMode,pubts,tenant,stopstatus");
        detailSchema.addCompositionSchema(QuerySchema.create().name("planLinkRules").fullname("base.businesspartner.PartnerLinkRule").addSelect("planId,linkObject,linkBy,partnerField, matchFieldValueChange,linkObjectField,id,pubts,tenant"));
        List partnerLinkPlans = MetaDaoHelper.queryObject((String)"base.businesspartner.PartnerLinkPlan", (QuerySchema)detailSchema, null);
        if (!org.springframework.util.CollectionUtils.isEmpty((Collection)partnerLinkPlans)) {
            return (PartnerLinkPlan)partnerLinkPlans.get(0);
        }
        PartnerLinkPlanPO partnerLinkPlanPO = this.queryDefaultLinkPlan();
        PartnerLinkPlan linkPlan = new PartnerLinkPlan();
        linkPlan.put("id", (Object)partnerLinkPlanPO.getId());
        linkPlan.put("code", (Object)partnerLinkPlanPO.getCode());
        linkPlan.put("linkObject", (Object)partnerLinkPlanPO.getLinkObject());
        linkPlan.put("linkMode", (Object)partnerLinkPlanPO.getLinkMode());
        linkPlan.put("stopstatus", (Object)partnerLinkPlanPO.getStopstatus());
        linkPlan.put("tenant", (Object)partnerLinkPlanPO.getTenant());
        List<PartnerLinkRulePO> partnerLinkRulePOList = this.getPartnerLinkRulePOS();
        ArrayList<PartnerLinkRule> partnerLinkRules = new ArrayList<PartnerLinkRule>();
        for (PartnerLinkRulePO partnerLinkRulePO : partnerLinkRulePOList) {
            PartnerLinkRule partnerLinkRule = new PartnerLinkRule();
            partnerLinkRules.add(partnerLinkRule);
            partnerLinkRule.put("id", (Object)partnerLinkRulePO.getId());
            partnerLinkRule.put("planId", (Object)partnerLinkRulePO.getPlanId());
            partnerLinkRule.put("linkObject", (Object)partnerLinkRulePO.getLinkObject());
            partnerLinkRule.put("linkBy", (Object)partnerLinkRulePO.getLinkBy());
            partnerLinkRule.put("partnerField", (Object)partnerLinkRulePO.getPartnerField());
            partnerLinkRule.put("matchFieldValueChange", (Object)partnerLinkRulePO.getMatchFieldValueChange());
            partnerLinkRule.put("linkObjectField", (Object)partnerLinkRulePO.getLinkObjectField());
            partnerLinkRule.put("tenant", (Object)partnerLinkRulePO.getTenant());
        }
        linkPlan.put("planLinkRules", partnerLinkRules);
        return linkPlan;
    }

    @NotNull
    private List<PartnerLinkRulePO> getPartnerLinkRulePOS() {
        IYmsJdbcApi ymsJdbcApi = (IYmsJdbcApi)AppContext.getBean(IYmsJdbcApi.class);
        SQLParameter parameter = new SQLParameter();
        StringBuilder sql = new StringBuilder();
        sql.append("select id, planId, linkObject, linkBy, partnerField,linkObjectField, match_field_value_change,tenant_id from base_partnerlinkrule where ytenant_id = '0'  ");
        AutoBeanListProcessor processor = new AutoBeanListProcessor((BaseEntity)new PartnerLinkRulePO());
        List partnerLinkRulePOList = ymsJdbcApi.queryForList(sql.toString(), parameter, (ResultSetProcessor)processor);
        if (org.springframework.util.CollectionUtils.isEmpty((Collection)partnerLinkRulePOList)) {
            this.logger.error("\u5173\u8054\u65b9\u6848\u672a\u914d\u7f6e\u5173\u8054\u89c4\u5219", (Object)sql, (Object)AppContext.getCurrentUser().getYTenantId());
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801300);
        }
        return partnerLinkRulePOList;
    }

    private PartnerLinkPlanPO queryDefaultLinkPlan() {
        IYmsJdbcApi ymsJdbcApi = (IYmsJdbcApi)AppContext.getBean(IYmsJdbcApi.class);
        SQLParameter parameter = new SQLParameter();
        StringBuilder sql = new StringBuilder();
        sql.append("select id, code, name, linkObject, linkMode, stopstatus, tenant_id from base_partnerlinkplan where ytenant_id = '0'  ");
        AutoBeanListProcessor processor = new AutoBeanListProcessor((BaseEntity)new PartnerLinkPlanPO());
        List partnerLinkPlanPOList = ymsJdbcApi.queryForList(sql.toString(), parameter, (ResultSetProcessor)processor);
        if (org.springframework.util.CollectionUtils.isEmpty((Collection)partnerLinkPlanPOList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801300);
        }
        return (PartnerLinkPlanPO)partnerLinkPlanPOList.get(0);
    }

    public PartnerSyncPlan getSyncPlan() throws Exception {
        String mainEntityId = null;
        HashMap<String, String> find = new HashMap<String, String>(16);
        find.put("ytenant_id", AppContext.getCurrentUser().getYTenantId());
        mainEntityId = (String)SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.businesspartner.getPartnerSyncPlanId", find);
        if (mainEntityId == null) {
            find.put("ytenant_id", "0");
            mainEntityId = (String)SqlHelper.selectOne((String)"com.yonyoucloud.upc.data.businesspartner.getPartnerSyncPlanId", find);
        }
        QuerySchema detailSchema = QuerySchema.create().addSelect("id,code,name,planId,planId.name as planId_name,syncMode,autoSyncAction,assocMultiObjRules,pubts,tenant,stopstatus").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)mainEntityId)}));
        detailSchema.addCompositionSchema(QuerySchema.create().name("planSyncRules").fullname("base.businesspartner.PartnerSyncRule").addSelect("planId,sourceObject,targetObject,createTarget,order,id,pubts,tenant,syncRange,conditionRelation,divDimension1,syncRange1,syncRangeName1,divDimension2,syncRange2,syncRangeName2,divDimension3,syncRange3,syncRangeName3, cascadeObject, conditionalOperator1, conditionalOperator2, conditionalOperator3,characterConditional"));
        List mapList = MetaDaoHelper.queryNoPartition((String)"base.businesspartner.PartnerSyncPlan", (QuerySchema)detailSchema, null);
        PartnerSyncPlan syncPlan = new PartnerSyncPlan();
        if (!this.empty(mapList).booleanValue()) {
            ArrayList<PartnerSyncRule> srList = new ArrayList<PartnerSyncRule>();
            Map map = (Map)mapList.get(0);
            syncPlan.init(map);
            if (map.get("planSyncRules") != null) {
                List syncRuleList = (List)map.get("planSyncRules");
                for (Map item : syncRuleList) {
                    PartnerSyncRule syncRule = new PartnerSyncRule();
                    syncRule.init(item);
                    srList.add(syncRule);
                }
            }
            syncPlan.setPlanSyncRules(srList);
        }
        return syncPlan;
    }

    public List<Map<String, Object>> readPartnerFieldMap(int flag) {
        HashMap<String, String> param = new HashMap<String, String>(8);
        param.put("ytenant_id", "0");
        if (flag == 2 || flag == 3) {
            param.put("bankData", "true");
        } else {
            param.put("bankData", null);
        }
        List partnerFieldMap = SqlHelper.selectList((String)"com.yonyoucloud.upc.data.businesspartner.readPartnerFieldMap", param);
        if (flag == 2 || flag == 3) {
            for (Map item : partnerFieldMap) {
                if (item.get("partner") == null) continue;
                String partner = item.get("partner").toString();
                item.put("partner", partner.substring(partner.indexOf(".") + 1, partner.length()));
                if (item.containsKey("merchant") && item.get("merchant") != null) {
                    String merchant = item.get("merchant").toString();
                    item.put("merchant", merchant.substring(merchant.indexOf(".") + 1, merchant.length()));
                }
                if (!item.containsKey("vendor") || item.get("vendor") == null) continue;
                String vendor = item.get("vendor").toString();
                item.put("vendor", vendor.substring(vendor.indexOf(".") + 1, vendor.length()));
            }
        }
        return partnerFieldMap;
    }

    public Boolean empty(Object object) {
        if (object == null) {
            return true;
        }
        if (object instanceof List && ((List)object).size() == 0) {
            return true;
        }
        if (object instanceof String && ((String)object).length() == 0) {
            return true;
        }
        if (object instanceof Map && ((Map)object).size() == 0) {
            return true;
        }
        return false;
    }

    private ResultList partnerMerchantSyncLockCheck(List<String> partnerIds, List<PartnerMerchantComparison> partnerMerchantList, int flag) {
        ResultList resultList = new ResultList();
        resultList.setCount(1);
        resultList.setSucessCount(0);
        resultList.setFailCount(1);
        resultList.addErrorMessage(PartnerConstant.CONCURRENT_INFO);
        RedisManager cache = AppContext.cache();
        String yTenant = AppContext.getCurrentUser().getYTenantId().toString();
        if (0 == flag) {
            for (String partnerId : partnerIds) {
                if (!cache.exists("2" + partnerId + yTenant)) continue;
                return resultList;
            }
            for (PartnerMerchantComparison item : partnerMerchantList) {
                if (!cache.exists("0" + item.getMerchantId() + yTenant)) continue;
                return resultList;
            }
        } else {
            for (String partnerId : partnerIds) {
                if (!cache.exists("2" + partnerId + yTenant)) continue;
                return resultList;
            }
            for (PartnerMerchantComparison item : partnerMerchantList) {
                if (!item.getIsDefault().booleanValue() || !cache.exists("0" + item.getMerchantId() + yTenant)) continue;
                return resultList;
            }
        }
        return null;
    }

    private SyncLog addSyncLog(PartnerSyncRule syncRule) {
        SyncLog syncLog = new SyncLog();
        syncLog.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
        syncLog.setStatus(0);
        syncLog.setSourceObject(syncRule.getSourceObject().getName());
        syncLog.setTargetObject(syncRule.getTargetObject().getName());
        syncLog.setCode();
        syncLog.setEntityStatus(EntityStatus.Insert);
        try {
            MetaDaoHelper.insert((String)"base.businesspartner.SyncLog", (BizObject)syncLog);
        }
        catch (Exception e) {
            return new SyncLog();
        }
        return syncLog;
    }

    private void updateSyncLog(SyncLog syncLog) {
        syncLog.setEntityStatus(EntityStatus.Update);
        try {
            MetaDaoHelper.update((String)"base.businesspartner.SyncLog", (BizObject)syncLog);
        }
        catch (Exception e) {
            this.logger.error("\u66f4\u65b0\u540c\u6b65\u6570\u636e\u65e5\u5fd7\u5931\u8d25");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ResultList batchSave(Object objects, String fullName, String asyncKey, Boolean computePercentage) {
        ResultList resultList = new ResultList();
        if (this.empty(objects).booleanValue() || this.empty(fullName).booleanValue() || !(objects instanceof List)) {
            return resultList;
        }
        RedisManager cache = AppContext.cache();
        String yTenant = AppContext.getCurrentUser().getYTenantId().toString();
        List objectList = (List)objects;
        objectList.removeIf(item -> ((BizObject)item).get("_status").toString().equals(EntityStatus.Unchanged.name()));
        int count = objectList.size();
        BillDataDto bill = new BillDataDto();
        bill.setAction("save");
        if ("base.businesspartner.BusinessPartner".equals(fullName)) {
            bill.setBillnum("base_businesspartner");
            bill.setFullname("base.businesspartner.BusinessPartner");
        } else if ("aa.merchant.Merchant".equals(fullName)) {
            bill.setBillnum("aa_merchant");
            bill.setFullname("aa.merchant.Merchant");
        } else if ("aa.vendor.Vendor".equals(fullName)) {
            bill.setBillnum("aa_vendor");
            bill.setFullname("aa.vendor.Vendor");
        }
        String cacheKey = null;
        HashMap<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("flag", 1);
        for (Object item2 : objectList) {
            String errorMessage;
            boolean isSuccess;
            block26: {
                block27: {
                    boolean keyStatus;
                    String code;
                    block28: {
                        block25: {
                            isSuccess = true;
                            errorMessage = "";
                            bill.setData(item2);
                            code = ((BizObject)item2).get("code").toString();
                            if (!fullName.equals("aa.merchant.Merchant") && !fullName.equals("base.businesspartner.BusinessPartner")) break block28;
                            if (fullName.equals("aa.merchant.Merchant")) {
                                cacheKey = "merchantLockKey_" + ((Merchant)item2).getId() + yTenant;
                                ((Merchant)item2).setEntityStatus(EntityStatus.Update);
                            } else {
                                cacheKey = "businessPartnerLockKey_" + ((BusinessPartner)item2).getId() + yTenant;
                            }
                            keyStatus = cache.setnx(cacheKey, cacheKey, 60);
                            if (!keyStatus) {
                                throw new CoreDocBusinessException(PartnerConstant.CONCURRENT_INFO);
                            }
                            RuleExecuteResult saveResult = null;
                            try {
                                saveResult = this.billService.executeUpdate("save", bill);
                                if (saveResult != null && saveResult.getMsgCode() == 1) {
                                    isSuccess = true;
                                    if (fullName.equals("base.businesspartner.BusinessPartner")) {
                                        String id = ((Map)((List)bill.getData()).get(0)).get("id").toString();
                                        errorMessage = "returnPartnerId#" + id;
                                    }
                                    break block25;
                                }
                                isSuccess = false;
                                errorMessage = StringUtils.isNotBlank((CharSequence)saveResult.getMessage()) ? "[" + code + "]\uff1a" + saveResult.getMessage() : "[" + code + "]\uff1a";
                            }
                            catch (Exception e) {
                                try {
                                    isSuccess = false;
                                    errorMessage = StringUtils.isNotBlank((CharSequence)e.getMessage()) ? "[" + code + "]\uff1a" + e.getMessage() : "[" + code + "]\uff1a";
                                    this.logger.error("\u4e1a\u52a1\u4f19\u4f34\u540c\u6b65\u5ba2\u6237\u4fdd\u5b58\u5f02\u5e38: {}, \u4e1a\u52a1\u4f19\u4f34\u540c\u6b65\u5ba2\u6237\u4fdd\u5b58\u5f02\u5e38\u9519\u8bef\u8be6\u60c5{}" + e.getMessage(), (Throwable)e);
                                }
                                catch (Throwable throwable) {
                                    cache.del(new String[]{cacheKey});
                                    throw throwable;
                                }
                                cache.del(new String[]{cacheKey});
                                break block26;
                            }
                        }
                        cache.del(new String[]{cacheKey});
                        break block26;
                    }
                    cacheKey = "vendorLockKey_" + ((Vendor)item2).getId() + yTenant;
                    keyStatus = cache.setnx(cacheKey, cacheKey, 60);
                    if (!keyStatus) {
                        cache.del(new String[]{cacheKey});
                        throw new CoreDocBusinessException(PartnerConstant.CONCURRENT_INFO);
                    }
                    try {
                        String saveVenRes = this.saveVendor(bill, code);
                        if ("".equals(saveVenRes)) {
                            isSuccess = true;
                            break block27;
                        }
                        isSuccess = false;
                        errorMessage = saveVenRes;
                    }
                    catch (Throwable throwable) {
                        cache.del(new String[]{cacheKey});
                        throw throwable;
                    }
                }
                cache.del(new String[]{cacheKey});
            }
            resultList.setCount(resultList.getCount() + 1);
            resultList.incResultCount(isSuccess);
            if (computePercentage.booleanValue()) {
                if (isSuccess) {
                    errorMessage = null;
                } else {
                    resultList.addErrorMessage(errorMessage);
                }
                int percentage = 0;
                percentage = count < 10 ? resultList.getCount() * 9 : resultList.getCount() / (count / 10) * 9;
                if (percentage > 90) {
                    percentage = 90;
                }
                resultMap.put(TOTAL_COUNT, count);
                resultMap.put("percentage", percentage);
                resultMap.put("message", errorMessage);
                ProcessData.builder((int)1, (int)200, resultMap, (String)PartnerConstant.SYNCING_DATA).percentage(String.valueOf(percentage)).setValue(TOTAL_COUNT, (Object)count).successCount(resultList.getSucessCount()).failCount(resultList.getFailCount()).message((Object)errorMessage).build(asyncKey, Integer.valueOf(1800));
                continue;
            }
            if (StringUtils.isBlank((CharSequence)asyncKey)) {
                resultList.addErrorMessage(errorMessage);
                continue;
            }
            if (StringUtils.isBlank((CharSequence)asyncKey) || isSuccess) continue;
            resultList.addErrorMessage(errorMessage);
        }
        return resultList;
    }

    public List<String> idsInSyncRange(PartnerSyncRule syncRule) throws Exception {
        PartnerSyncRule fullSR = this.getFullSyncRule(syncRule);
        syncRule.putAll((Map)fullSR);
        ArrayList<String> idsInSyncRange = new ArrayList<String>();
        if (syncRule.getSourceObject() == LinkObject.BUSINESS_PARTNER && fullSR.getSyncRange() == SyncRange.all) {
            return this.getPartnerIds();
        }
        if (syncRule.getSourceObject() == LinkObject.MERCHANT && fullSR.getSyncRange() == SyncRange.all) {
            return this.getMerchantIds().stream().map(Object::toString).collect(Collectors.toList());
        }
        if (syncRule.getSourceObject() == LinkObject.VENDOR && fullSR.getSyncRange() == SyncRange.all) {
            return this.getVendorIds().stream().map(Object::toString).collect(Collectors.toList());
        }
        if (syncRule.getSourceObject() == LinkObject.CAPITAL_BUSINESS_OBJECT && fullSR.getSyncRange() == SyncRange.all) {
            return this.capitalPartnerService.queryFundBizObjArchByTenant();
        }
        if (fullSR.getDivDimension1() == null && fullSR.getDivDimension2() == null && fullSR.getDivDimension3() == null && org.springframework.util.CollectionUtils.isEmpty((Collection)fullSR.getCharacterConditional())) {
            return idsInSyncRange;
        }
        if (fullSR.getSyncRange1() == null && fullSR.getSyncRange2() == null && fullSR.getSyncRange3() == null && org.springframework.util.CollectionUtils.isEmpty((Collection)fullSR.getCharacterConditional())) {
            return idsInSyncRange;
        }
        List<String> idsInSyncRange7 = this.collectBusinessPartnerIdsBasedOnSyncRule(syncRule, fullSR, idsInSyncRange);
        if (idsInSyncRange7 != null) {
            return idsInSyncRange7;
        }
        List<String> idsInSyncRange6 = BusinessPartnerService.collectMerchantIdsBasedOnSyncRule(syncRule, fullSR, idsInSyncRange);
        if (idsInSyncRange6 != null) {
            return idsInSyncRange6;
        }
        List<String> idsInSyncRange5 = BusinessPartnerService.collectVendorIdsBasedOnSyncRule(syncRule, idsInSyncRange);
        if (idsInSyncRange5 != null) {
            return idsInSyncRange5;
        }
        List<String> idsInSyncRange4 = this.collectCapitalBusinessObjectIdsBasedOnSyncRule(syncRule, idsInSyncRange);
        if (idsInSyncRange4 != null) {
            return idsInSyncRange4;
        }
        return idsInSyncRange;
    }

    @Nullable
    private QuerySchema collectBusinessPartnerIdsSchemaBasedOnSyncRule(PartnerSyncRule syncRule) throws Exception {
        if (syncRule.getSourceObject() == LinkObject.BUSINESS_PARTNER) {
            if (syncRule.getSyncRange() == SyncRange.all) {
                return QuerySchema.create().addSelect("id");
            }
            if (syncRule.getSyncRange() == SyncRange.syncByCondition) {
                QueryConditionGroup allConditionGroup = new QueryConditionGroup();
                allConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"dr").eq((Object)0));
                QueryConditionGroup queryConditionGroup = syncRule.getConditionRelation() == ConditionRelation.and ? new QueryConditionGroup() : new QueryConditionGroup(ConditionOperator.or);
                QuerySchema detailSchema = QuerySchema.create().addSelect("id");
                for (int i = 1; i <= 3; ++i) {
                    QueryConditionGroup conditionGroup;
                    SyncRangeDivDimension divDimension = SyncRangeDivDimension.find((Number)((Number)syncRule.get("divDimension" + i)));
                    String syncRange = (String)syncRule.get("syncRange" + i);
                    String conditionalOperator = (String)syncRule.get("conditionalOperator" + i);
                    if (divDimension == null || !StringUtils.isNotBlank((CharSequence)syncRange)) continue;
                    List idList = Arrays.stream(syncRange.split(",")).collect(Collectors.toList());
                    PartnerConditionOperator byOperator = PartnerConditionOperator.findByOperator((String)conditionalOperator);
                    if (divDimension == SyncRangeDivDimension.BUSINESS_PARTNER) {
                        conditionGroup = byOperator.createCondition("id", idList);
                        queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                    }
                    if (divDimension == SyncRangeDivDimension.PARTNER_TYPE) {
                        conditionGroup = byOperator.createCondition("partnerType", idList);
                        queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                    }
                    if (divDimension != SyncRangeDivDimension.ROLE_CLASS) continue;
                    conditionGroup = byOperator.createCondition("partnerRoleClasses.isCheck", new ArrayList<Integer>(Arrays.asList(1)));
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"partnerRoleClasses.dr").eq((Object)0));
                    conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"partnerRoleClasses.roleClassName").in(idList));
                    queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                    detailSchema.addGroupBy("partnerRoleClasses.partnerId").addHaving(new QueryCondition[]{QueryCondition.name((String)"count(partnerRoleClasses.partnerId)").egt((Object)idList.size())}).distinct();
                }
                List characterConditional = syncRule.getCharacterConditional();
                if (characterConditional != null && characterConditional.size() > 0) {
                    for (HashMap item : characterConditional) {
                        String fieldName = item.get("fieldName").toString();
                        String operator = item.get("operator").toString();
                        String value = item.get("value").toString();
                        List valueSplit = Arrays.stream(value.split(",")).collect(Collectors.toList());
                        PartnerConditionOperator byOperator = PartnerConditionOperator.findByOperator((String)operator);
                        queryConditionGroup.addCondition((ConditionExpression)byOperator.createCondition(fieldName, valueSplit));
                    }
                }
                allConditionGroup.addCondition((ConditionExpression)queryConditionGroup);
                detailSchema.addCondition((ConditionExpression)allConditionGroup);
                return detailSchema;
            }
        }
        return null;
    }

    @Nullable
    private List<String> collectBusinessPartnerIdsBasedOnSyncRule(PartnerSyncRule syncRule, PartnerSyncRule fullSR, List<String> idsInSyncRange) throws Exception {
        if (syncRule.getSourceObject() == LinkObject.BUSINESS_PARTNER) {
            QueryConditionGroup allConditionGroup = new QueryConditionGroup();
            allConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"dr").eq((Object)0));
            QueryConditionGroup queryConditionGroup = fullSR.getConditionRelation() == ConditionRelation.and ? new QueryConditionGroup() : new QueryConditionGroup(ConditionOperator.or);
            QuerySchema detailSchema = QuerySchema.create().addSelect("id");
            for (int i = 1; i <= 3; ++i) {
                QueryConditionGroup conditionGroup;
                SyncRangeDivDimension divDimension = SyncRangeDivDimension.find((Number)((Number)syncRule.get("divDimension" + i)));
                String syncRange = (String)syncRule.get("syncRange" + i);
                String conditionalOperator = (String)syncRule.get("conditionalOperator" + i);
                if (divDimension == null || !StringUtils.isNotBlank((CharSequence)syncRange)) continue;
                List idList = Arrays.stream(syncRange.split(",")).collect(Collectors.toList());
                PartnerConditionOperator byOperator = PartnerConditionOperator.findByOperator((String)conditionalOperator);
                if (divDimension == SyncRangeDivDimension.BUSINESS_PARTNER) {
                    conditionGroup = byOperator.createCondition("id", idList);
                    queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                }
                if (divDimension == SyncRangeDivDimension.PARTNER_TYPE) {
                    conditionGroup = byOperator.createCondition("partnerType", idList);
                    queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                }
                if (divDimension != SyncRangeDivDimension.ROLE_CLASS) continue;
                conditionGroup = byOperator.createCondition("partnerRoleClasses.isCheck", new ArrayList<Integer>(Arrays.asList(1)));
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"partnerRoleClasses.dr").eq((Object)0));
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"partnerRoleClasses.roleClassName").in(idList));
                queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                detailSchema.addGroupBy("partnerRoleClasses.partnerId").addHaving(new QueryCondition[]{QueryCondition.name((String)"count(partnerRoleClasses.partnerId)").egt((Object)idList.size())}).distinct();
            }
            List characterConditional = syncRule.getCharacterConditional();
            if (characterConditional != null && characterConditional.size() > 0) {
                for (HashMap item : characterConditional) {
                    String fieldName = item.get("fieldName").toString();
                    String operator = item.get("operator").toString();
                    if (item.get("value") == null) continue;
                    String value = item.get("value").toString();
                    List valueSplit = Arrays.stream(value.split(",")).collect(Collectors.toList());
                    PartnerConditionOperator byOperator = PartnerConditionOperator.findByOperator((String)operator);
                    queryConditionGroup.addCondition((ConditionExpression)byOperator.createCondition(fieldName, valueSplit));
                }
            }
            allConditionGroup.addCondition((ConditionExpression)queryConditionGroup);
            detailSchema.addCondition((ConditionExpression)allConditionGroup);
            List mapList = MetaDaoHelper.query((String)"base.businesspartner.BusinessPartner", (QuerySchema)detailSchema, (String)"productcenter");
            for (Map item : mapList) {
                idsInSyncRange.add(item.get("id").toString());
            }
            return idsInSyncRange;
        }
        return null;
    }

    @Nullable
    private QuerySchema collectMerchantIdsBasedOnSyncRule(PartnerSyncRule syncRule) throws Exception {
        if (syncRule.getSourceObject() == LinkObject.MERCHANT) {
            if (syncRule.getSyncRange() == SyncRange.all) {
                return QuerySchema.create().addSelect("id, businessPartner");
            }
            if (syncRule.getSyncRange() == SyncRange.syncByCondition) {
                QueryConditionGroup allConditionGroup = new QueryConditionGroup();
                allConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"createMerchant").is_null());
                QueryConditionGroup queryConditionGroup = syncRule.getConditionRelation() == ConditionRelation.and ? new QueryConditionGroup() : new QueryConditionGroup(ConditionOperator.or);
                for (int i = 1; i <= 3; ++i) {
                    QueryConditionGroup conditionGroup;
                    SyncRangeDivDimension divDimension = SyncRangeDivDimension.find((Number)((Number)syncRule.get("divDimension" + i)));
                    String syncRange = (String)syncRule.get("syncRange" + i);
                    String conditionalOperator = (String)syncRule.get("conditionalOperator" + i);
                    if (divDimension == null || !StringUtils.isNotBlank((CharSequence)syncRange)) continue;
                    List idList = Arrays.stream(syncRange.split(",")).collect(Collectors.toList());
                    PartnerConditionOperator byOperator = PartnerConditionOperator.findByOperator((String)conditionalOperator);
                    if (divDimension == SyncRangeDivDimension.MERCHANT) {
                        conditionGroup = byOperator.createCondition("id", idList);
                        queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                    }
                    if (divDimension == SyncRangeDivDimension.CUSTOMER_CLASS) {
                        conditionGroup = byOperator.createCondition("customerClass", idList);
                        queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                    }
                    if (divDimension != SyncRangeDivDimension.TRANS_TYPE) continue;
                    conditionGroup = byOperator.createCondition("transType", idList);
                    queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                }
                allConditionGroup.addCondition((ConditionExpression)queryConditionGroup);
                QuerySchema detailSchema = QuerySchema.create().addSelect("id, businessPartner").addCondition((ConditionExpression)allConditionGroup);
                return detailSchema;
            }
        }
        return null;
    }

    @Nullable
    private static List<String> collectMerchantIdsBasedOnSyncRule(PartnerSyncRule syncRule, PartnerSyncRule fullSR, List<String> idsInSyncRange) throws Exception {
        if (syncRule.getSourceObject() == LinkObject.MERCHANT) {
            QueryConditionGroup allConditionGroup = new QueryConditionGroup();
            allConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"createMerchant").is_null());
            QueryConditionGroup queryConditionGroup = syncRule.getConditionRelation() == ConditionRelation.and ? new QueryConditionGroup() : new QueryConditionGroup(ConditionOperator.or);
            for (int i = 1; i <= 3; ++i) {
                QueryConditionGroup conditionGroup;
                SyncRangeDivDimension divDimension = SyncRangeDivDimension.find((Number)((Number)syncRule.get("divDimension" + i)));
                String syncRange = (String)syncRule.get("syncRange" + i);
                String conditionalOperator = (String)syncRule.get("conditionalOperator" + i);
                if (divDimension == null || !StringUtils.isNotBlank((CharSequence)syncRange)) continue;
                List idList = Arrays.stream(syncRange.split(",")).collect(Collectors.toList());
                PartnerConditionOperator byOperator = PartnerConditionOperator.findByOperator((String)conditionalOperator);
                if (divDimension == SyncRangeDivDimension.MERCHANT) {
                    conditionGroup = byOperator.createCondition("id", idList);
                    queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                }
                if (divDimension == SyncRangeDivDimension.CUSTOMER_CLASS) {
                    conditionGroup = byOperator.createCondition("customerClass", idList);
                    queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                }
                if (divDimension != SyncRangeDivDimension.TRANS_TYPE) continue;
                conditionGroup = byOperator.createCondition("transType", idList);
                queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
            }
            allConditionGroup.addCondition((ConditionExpression)queryConditionGroup);
            QuerySchema detailSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)allConditionGroup);
            List mapList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)detailSchema, (String)"productcenter");
            for (Map item : mapList) {
                idsInSyncRange.add(item.get("id").toString());
            }
            return idsInSyncRange;
        }
        return null;
    }

    @Nullable
    private QuerySchema collectVendorIdsBasedOnSyncRule(PartnerSyncRule syncRule) throws Exception {
        if (syncRule.getSourceObject() == LinkObject.VENDOR) {
            if (syncRule.getSyncRange() == SyncRange.all) {
                return QuerySchema.create().addSelect("id, businessPartner");
            }
            if (syncRule.getSyncRange() == SyncRange.syncByCondition) {
                QueryConditionGroup allConditionGroup = new QueryConditionGroup();
                allConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"org.externalorg").eq((Object)0));
                QueryConditionGroup queryConditionGroup = syncRule.getConditionRelation() == ConditionRelation.and ? new QueryConditionGroup() : new QueryConditionGroup(ConditionOperator.or);
                for (int i = 1; i <= 3; ++i) {
                    QueryConditionGroup conditionGroup;
                    SyncRangeDivDimension divDimension = SyncRangeDivDimension.find((Number)((Number)syncRule.get("divDimension" + i)));
                    String syncRange = (String)syncRule.get("syncRange" + i);
                    String conditionalOperator = (String)syncRule.get("conditionalOperator" + i);
                    if (divDimension == null || !StringUtils.isNotBlank((CharSequence)syncRange)) continue;
                    List idList = Arrays.stream(syncRange.split(",")).collect(Collectors.toList());
                    PartnerConditionOperator byOperator = PartnerConditionOperator.findByOperator((String)conditionalOperator);
                    if (divDimension == SyncRangeDivDimension.VENDOR) {
                        conditionGroup = byOperator.createCondition("id", idList);
                        queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                    }
                    if (divDimension != SyncRangeDivDimension.VENDOR_CLASS) continue;
                    conditionGroup = byOperator.createCondition("vendorclass", idList);
                    queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                }
                allConditionGroup.addCondition((ConditionExpression)queryConditionGroup);
                QuerySchema detailSchema = QuerySchema.create().addSelect("id, businessPartner").addCondition((ConditionExpression)allConditionGroup);
                return detailSchema;
            }
        }
        return null;
    }

    @Nullable
    private static List<String> collectVendorIdsBasedOnSyncRule(PartnerSyncRule syncRule, List<String> idsInSyncRange) throws Exception {
        if (syncRule.getSourceObject() == LinkObject.VENDOR) {
            QueryConditionGroup allConditionGroup = new QueryConditionGroup();
            allConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"org.externalorg").eq((Object)0));
            QueryConditionGroup queryConditionGroup = syncRule.getConditionRelation() == ConditionRelation.and ? new QueryConditionGroup() : new QueryConditionGroup(ConditionOperator.or);
            for (int i = 1; i <= 3; ++i) {
                QueryConditionGroup conditionGroup;
                SyncRangeDivDimension divDimension = SyncRangeDivDimension.find((Number)((Number)syncRule.get("divDimension" + i)));
                String syncRange = (String)syncRule.get("syncRange" + i);
                String conditionalOperator = (String)syncRule.get("conditionalOperator" + i);
                if (divDimension == null || !StringUtils.isNotBlank((CharSequence)syncRange)) continue;
                List idList = Arrays.stream(syncRange.split(",")).collect(Collectors.toList());
                PartnerConditionOperator byOperator = PartnerConditionOperator.findByOperator((String)conditionalOperator);
                if (divDimension == SyncRangeDivDimension.VENDOR) {
                    conditionGroup = byOperator.createCondition("id", idList);
                    queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
                }
                if (divDimension != SyncRangeDivDimension.VENDOR_CLASS) continue;
                conditionGroup = byOperator.createCondition("vendorclass", idList);
                queryConditionGroup.addCondition((ConditionExpression)conditionGroup);
            }
            allConditionGroup.addCondition((ConditionExpression)queryConditionGroup);
            QuerySchema detailSchema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)allConditionGroup);
            List mapList = MetaDaoHelper.query((String)"aa.vendor.Vendor", (QuerySchema)detailSchema, (String)"yssupplier");
            for (Map item : mapList) {
                idsInSyncRange.add(item.get("id").toString());
            }
            return idsInSyncRange;
        }
        return null;
    }

    @Nullable
    private List<String> collectCapitalBusinessObjectIdsBasedOnSyncRule(PartnerSyncRule syncRule, List<String> idsInSyncRange) throws Exception {
        if (syncRule.getSourceObject() == LinkObject.CAPITAL_BUSINESS_OBJECT && syncRule.getDivDimension1() != null && StringUtils.isNotBlank((CharSequence)syncRule.getSyncRange1()) && syncRule.getDivDimension1() == SyncRangeDivDimension.CAPITAL_BUSINESS_OBJECT) {
            List idList = Arrays.stream(syncRule.getSyncRange1().split(",")).collect(Collectors.toList());
            List capitalIds = this.capitalPartnerService.queryFundBizObjArchByTenant();
            HashSet capitalIdSet = new HashSet(capitalIds);
            if (!org.springframework.util.CollectionUtils.isEmpty((Collection)capitalIds) && !org.springframework.util.CollectionUtils.isEmpty(idList)) {
                if (syncRule.getConditionalOperator1() == PartnerConditionOperator.IN) {
                    for (String s : idList) {
                        if (!capitalIdSet.contains(s)) continue;
                        idsInSyncRange.add(s);
                    }
                } else if (syncRule.getConditionalOperator1() == PartnerConditionOperator.NOT_IN) {
                    for (String s : idList) {
                        if (capitalIdSet.contains(s)) continue;
                        idsInSyncRange.add(s);
                    }
                }
            } else {
                return idsInSyncRange;
            }
        }
        return null;
    }

    public PartnerSyncRule getFullSyncRule(PartnerSyncRule syncRule) throws Exception {
        List<PartnerSyncRule> syncRules = this.getAllSyncRule();
        for (PartnerSyncRule item : syncRules) {
            if (item.getSourceObject() != syncRule.getSourceObject() || item.getTargetObject() != syncRule.getTargetObject()) continue;
            return item;
        }
        return new PartnerSyncRule();
    }

    public String saveVendor(BillDataDto bill, String code) {
        boolean isSuccess = true;
        String errorMessage = "";
        String giveVendor = null;
        ObjectMapper mapper = UpcJacksonUtils.OBJECT_MAPPER;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat((DateFormat)df);
        ObjectWriter writer = mapper.writerWithView(BillDataDto.class);
        try {
            giveVendor = writer.writeValueAsString((Object)bill);
        }
        catch (JsonProcessingException e) {
            isSuccess = false;
            errorMessage = "[" + code + "]" + e.getMessage();
        }
        String vendorGiveMe = null;
        try {
            vendorGiveMe = this.ysVendorService.batchSave(giveVendor);
            if (vendorGiveMe != null) {
                ResultList r = (ResultList)JSONObject.parseObject((String)vendorGiveMe, ResultList.class);
                if (r.getFailCount() != 0) {
                    if (!org.springframework.util.CollectionUtils.isEmpty((Collection)r.getMessages())) {
                        List newMerssages = r.getMessages().stream().map(message -> {
                            if (message instanceof String) {
                                message = message.toString().replace("VendorNameRepeatException:", "");
                                message = message.toString().replace("VendorCreditCodeRepeatException:", "");
                            }
                            return message;
                        }).collect(Collectors.toList());
                        r.setMessages(newMerssages);
                        errorMessage = "[" + code + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804BD", (String)"]\u540c\u6b65\u4f9b\u5e94\u5546\u5931\u8d25:") + r.getMessages().get(0);
                    } else {
                        errorMessage = "[" + code + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040804B2", (String)"]\u540c\u6b65\u4f9b\u5e94\u5546\u5931\u8d25");
                    }
                } else if (((JSONObject)r.getInfos().get(0)).get((Object)"id") != null) {
                    RedisManager cache = AppContext.cache();
                    Vendor vendorData = (Vendor)bill.getData();
                    cache.set(PartnerConstant.PARTNERTOVENDOR_VENDORID + vendorData.getId().toString(), ((JSONObject)r.getInfos().get(0)).get((Object)"id").toString());
                }
                isSuccess = true;
            }
        }
        catch (Exception e) {
            isSuccess = false;
            errorMessage = "[" + code + "]" + e.getMessage();
            this.logger.error("\u4f9b\u5e94\u5546\u4fdd\u5b58\u5931\u8d25\u5f02\u5e38: {}, \u4f9b\u5e94\u5546\u4fdd\u5b58\u5931\u8d25\u5f02\u5e38\u8be6\u60c5\uff1a{}" + e.getMessage(), (Throwable)e);
        }
        return errorMessage;
    }

    private void setCNameMultilingual(BizObject targetObject) {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("name");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)InvocationInfoProxy.getTenantid()), QueryCondition.name((String)"id").eq(targetObject.getId())}));
        List merchantPOList = this.iBillQueryRepository.queryBySchema("aa.merchant.Merchant", querySchema);
        if (CollectionUtils.isNotEmpty((Collection)merchantPOList)) {
            for (MerchantPO merchantPO : merchantPOList) {
                targetObject.put("name", (Object)merchantPO.getName());
            }
        }
    }

    private Map<String, MultiLangText> getNameMultilingual(List<String> ids) {
        HashMap<String, MultiLangText> nameMap = new HashMap<String, MultiLangText>();
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,name");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)InvocationInfoProxy.getTenantid()), QueryCondition.name((String)"id").in(ids)}));
        List businessPartnerPOList = this.iBillQueryRepository.queryBySchema("base.businesspartner.BusinessPartner", querySchema);
        if (CollectionUtils.isNotEmpty((Collection)businessPartnerPOList)) {
            for (BusinessPartnerPO businessPartnerPO : businessPartnerPOList) {
                nameMap.put(businessPartnerPO.getId(), businessPartnerPO.getName());
            }
        }
        return nameMap;
    }

    private List<RoleClass> queryBusinessPartnerRole(String partner, String roleClassName) throws Exception {
        QueryConditionGroup queryConditionGroup = new QueryConditionGroup();
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"partnerId").eq((Object)partner));
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"roleClassName").eq((Object)roleClassName));
        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"dr").eq((Object)0));
        QuerySchema schemaRole = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        return MetaDaoHelper.queryObject((String)"base.businesspartner.RoleClass", (QuerySchema)schemaRole, null);
    }

    private void modifyPartnerRoleIsCheck(BusinessPartner businessPartner, List<RoleClass> roleClasses) {
        RoleClass roleClass = roleClasses.get(0);
        roleClass.setEntityStatus(EntityStatus.Update);
        roleClass.setIsCheck(Boolean.valueOf(true));
        businessPartner.setPartnerRoleClasses(roleClasses);
    }

    public String getBillCodeForCodeRule(String billNumber, String mdUrl) {
        try {
            BillCodeContext billCodeContext = this.billCodeComponentService.getBillCodeContext(billNumber, AppContext.getTenantId().toString(), "");
            Integer billNumberMode = billCodeContext.getBillnumMode();
            if (null != billNumberMode && billNumberMode != 0) {
                return this.billCodeComponentService.getBillCode(billNumber, mdUrl, AppContext.getTenantId().toString(), "", false);
            }
            return null;
        }
        catch (Exception e) {
            this.logger.error("\u83b7\u53d6\u7f16\u7801\u5931\u8d25: {}, \u83b7\u53d6\u7f16\u7801\u5931\u8d25\u5f02\u5e38\u9519\u8bef\u8be6\u60c5:", (Object)e.getMessage(), (Object)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800745);
        }
    }

    public ResultList batchGenerationPartnerByOrg(OrgGenerationPartner orgGenerationPartner, String asyncKey) {
        ResultList allResultList = new ResultList();
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setAction(PartnerConstant.SAVE);
        billDataDto.setBillnum("base_businesspartner");
        billDataDto.setConvertType(PartnerConstant.NCC_CONVERT_TYPE);
        billDataDto.setFromApi(true);
        billDataDto.setKey("code");
        double allCount = orgGenerationPartner.getOrgIdList().size();
        double currentCount = 0.0;
        List orgIdSplitListForCapacity = ListSplitUtil.splitListByCapacity((List)orgGenerationPartner.getOrgIdList(), (int)20);
        for (List orgIdSplitList : orgIdSplitListForCapacity) {
            ArrayList<BusinessPartner> businessPartners = new ArrayList<BusinessPartner>(orgIdSplitList.size());
            List orgUnitDTOS = this.orgUnitQueryService.listByIds((String)AppContext.getYTenantId(), orgIdSplitList, Collections.singletonList(1));
            for (OrgUnitDTO orgUnitDTO : orgUnitDTOS) {
                BusinessPartner businessPartner = BusinessPartnerUtils.generateBusinessPartner();
                businessPartner.setInternalOrgId(orgUnitDTO.getId());
                List roleClasses = BusinessPartnerUtils.generatePartnerRoleClass((BusinessPartner)businessPartner, (HashSet)orgGenerationPartner.getRoleClassValue());
                businessPartner.setPartnerRoleClasses(roleClasses);
                if (orgGenerationPartner.getPartnerMerchantComparison() != null && orgGenerationPartner.getPartnerMerchantComparison().containsKey((Object)"merchantId_createOrg")) {
                    PartnerMerchantComparison partnerMerchantComparison = orgGenerationPartner.getPartnerMerchantComparison();
                    partnerMerchantComparison.setPartnerId((String)businessPartner.getId());
                    ArrayList<PartnerMerchantComparison> partnerMerchantComparisons = new ArrayList<PartnerMerchantComparison>();
                    partnerMerchantComparisons.add(partnerMerchantComparison);
                    businessPartner.setPartnerMerchantComparisons(partnerMerchantComparisons);
                }
                if (orgGenerationPartner.getPartnerVendorComparison() != null && orgGenerationPartner.getPartnerVendorComparison().containsKey((Object)"vendorId_org")) {
                    PartnerVendorComparison partnerVendorComparison = orgGenerationPartner.getPartnerVendorComparison();
                    partnerVendorComparison.setPartnerId((String)businessPartner.getId());
                    ArrayList<PartnerVendorComparison> partnerVendorComparisons = new ArrayList<PartnerVendorComparison>();
                    partnerVendorComparisons.add(partnerVendorComparison);
                    businessPartner.setPartnerVendorComparisons(partnerVendorComparisons);
                }
                businessPartner.setEntityStatus(EntityStatus.Insert);
                businessPartner.setCode(orgUnitDTO.getCode());
                businessPartner.setName(orgUnitDTO.getName());
                businessPartner.setShortname(orgUnitDTO.getShortname());
                businessPartner.setCreditCode(orgUnitDTO.getTaxpayerid());
                businessPartner.setContactTel(orgUnitDTO.getTelephone());
                businessPartner.setTimeZone(orgUnitDTO.getTimezone());
                businessPartner.setCountry(orgUnitDTO.getCountryzone());
                businessPartner.setRegAddress(orgUnitDTO.getAddress());
                businessPartner.put("specialKeyFromBatchOrg", (Object)"specialKeyFromBatchOrg");
                businessPartners.add(businessPartner);
            }
            billDataDto.setData(businessPartners);
            ResultList resultList = null;
            try {
                resultList = this.apiImportSingleService.batchSave4Api(billDataDto);
            }
            catch (Exception e) {
                this.logger.error("\u7ec4\u7ec7\u6279\u91cf\u751f\u6210\u4e1a\u52a1\u4f19\u4f34\u5931\u8d25", (Object)e.getMessage(), (Object)e);
                if (resultList == null) {
                    resultList = new ResultList();
                }
                resultList.addErrorMessage(e.getMessage());
            }
            currentCount = resultList.getCount() != 0 ? (currentCount += (double)resultList.getCount()) : (currentCount += 20.0);
            allResultList.setCount(allResultList.getCount() + resultList.getCount());
            allResultList.setSucessCount(allResultList.getSucessCount() + resultList.getSucessCount());
            allResultList.setFailCount(allResultList.getFailCount() + resultList.getFailCount());
            if (!org.springframework.util.CollectionUtils.isEmpty((Collection)resultList.getMessages()) && allResultList.getFailCount() <= 100) {
                for (int i = 0; i < resultList.getMessages().size(); ++i) {
                    Object errorMessage;
                    if (i + resultList.getCount() == 100) {
                        errorMessage = resultList.getMessages().get(i).toString() + InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A0AC22804900009", (String)"\u9519\u8bef\u4fe1\u606f\u8d85\u8fc7100\u6761\u4e0d\u5728\u63d0\u793a!");
                        allResultList.addErrorMessage((String)errorMessage);
                        break;
                    }
                    if (resultList.getMessages().get(i) instanceof ErrorMessage) {
                        errorMessage = (ErrorMessage)resultList.getMessages().get(i);
                        String erroString = (errorMessage.getKey() != null ? "[" + errorMessage.getKey().toString() + "]" : "") + errorMessage.getMessage();
                        allResultList.addErrorMessage(erroString);
                        continue;
                    }
                    allResultList.addErrorMessage(resultList.getMessages().get(i).toString());
                }
            }
            double percentage = currentCount >= allCount ? 1.0 : currentCount / allCount;
            ProcessData.builder((int)1, (int)200, (Object)allResultList, (String)PartnerConstant.SYNCING_DATA).percentage(String.valueOf(percentage * 100.0)).setValue(TOTAL_COUNT, (Object)allCount).successCount(allResultList.getSucessCount()).failCount(allResultList.getFailCount()).message((Object)allResultList.getMessages()).build(asyncKey, Integer.valueOf(1800));
        }
        return allResultList;
    }
}

