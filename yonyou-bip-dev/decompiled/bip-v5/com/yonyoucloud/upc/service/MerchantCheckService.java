/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.coredoc.service.utils.OrgPermissionsService
 *  com.yonyou.diwork.service.auth.IServiceIsolateService
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.busidoc.regioncorp.RegionCorp
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.CoredocContextUtils
 *  com.yonyou.iuap.apdoc.coredoc.utils.MCServiceUntils
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.billcode.po.BillNumberPO
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.metadata.api.itf.MetadataSupportService
 *  com.yonyou.iuap.org.dto.BaseOrgDTO
 *  com.yonyou.iuap.org.dto.ConditionDTO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.org.enums.FuncTypeEnum
 *  com.yonyou.iuap.org.service.itf.core.IFuncTypeQueryService
 *  com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.uap.billcode.BillCodeComponentParam
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.BillCodeObj
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.common.enums.OperationTypeEnum
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BaseDto
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils
 *  com.yonyou.ucf.mdd.ext.bill.rule.template.CommonOperator
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.option.model.OptionData
 *  com.yonyou.ucf.mdd.ext.option.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ypd.bd.api.IBDQueryRepository
 *  com.yonyoucloud.iuap.upc.api.IBusinessPartnerServiceV2
 *  com.yonyoucloud.iuap.upc.api.ISaleAreaService
 *  com.yonyoucloud.iuap.upc.dto.BusinessPartnerDTO
 *  com.yonyoucloud.iuap.upc.dto.BusinessPartnerInfoQryDTO
 *  com.yonyoucloud.iuap.upc.dto.PartnerMerchantComparisonQryDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.SaleAreaDTO
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApplyChangeType
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApplyType
 *  com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus
 *  com.yonyoucloud.upc.aa.merchant.AddressInfo
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.AgentInvoice
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.EnterpriseNature
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.IsFinancialSynergy
 *  com.yonyoucloud.upc.aa.merchant.LicenseType
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantQualificationDocument
 *  com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.aa.merchant.StopStatusChar
 *  com.yonyoucloud.upc.aa.merchant.TaxPayingCate
 *  com.yonyoucloud.upc.aa.merchant.VerifyingState
 *  com.yonyoucloud.upc.aa.salearea.SaleAreaApplyRange
 *  com.yonyoucloud.upc.common.enums.DomainOpenEnum
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.upc.pc.productapply.EffectStatus
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.IdcardUtils
 *  com.yonyoucloud.upc.utils.MerchantOpenApiUtils
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  com.yonyoucloud.upc.utils.SQLInjectionCheckUtil
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.base.Json
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationAdapter
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.coredoc.service.utils.OrgPermissionsService;
import com.yonyou.diwork.service.auth.IServiceIsolateService;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.busidoc.regioncorp.RegionCorp;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.CoredocContextUtils;
import com.yonyou.iuap.apdoc.coredoc.utils.MCServiceUntils;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.billcode.po.BillNumberPO;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.metadata.api.itf.MetadataSupportService;
import com.yonyou.iuap.org.dto.BaseOrgDTO;
import com.yonyou.iuap.org.dto.ConditionDTO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.org.enums.FuncTypeEnum;
import com.yonyou.iuap.org.service.itf.core.IFuncTypeQueryService;
import com.yonyou.iuap.org.service.itf.core.IOrgUnitQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.uap.billcode.BillCodeComponentParam;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.BillCodeObj;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.common.enums.OperationTypeEnum;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BaseDto;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils;
import com.yonyou.ucf.mdd.ext.bill.rule.template.CommonOperator;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.option.model.OptionData;
import com.yonyou.ucf.mdd.ext.option.util.OptionUtils;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ypd.bd.api.IBDQueryRepository;
import com.yonyoucloud.iuap.upc.api.IBusinessPartnerServiceV2;
import com.yonyoucloud.iuap.upc.api.ISaleAreaService;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.iuap.upc.dto.BusinessPartnerDTO;
import com.yonyoucloud.iuap.upc.dto.BusinessPartnerInfoQryDTO;
import com.yonyoucloud.iuap.upc.dto.PartnerMerchantComparisonQryDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.SaleAreaDTO;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.customerapply.CustomerApplyChangeType;
import com.yonyoucloud.upc.aa.customerapply.CustomerApplyType;
import com.yonyoucloud.upc.aa.customerapply.CustomerEffectStatus;
import com.yonyoucloud.upc.aa.merchant.AddressInfo;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.AgentInvoice;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.EnterpriseNature;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.IsFinancialSynergy;
import com.yonyoucloud.upc.aa.merchant.LicenseType;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantQualificationDocument;
import com.yonyoucloud.upc.aa.merchant.MerchantRoleInfo;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.aa.merchant.StopStatusChar;
import com.yonyoucloud.upc.aa.merchant.TaxPayingCate;
import com.yonyoucloud.upc.aa.merchant.VerifyingState;
import com.yonyoucloud.upc.aa.salearea.SaleAreaApplyRange;
import com.yonyoucloud.upc.common.enums.DomainOpenEnum;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.pc.productapply.EffectStatus;
import com.yonyoucloud.upc.service.BusinessPartnerService;
import com.yonyoucloud.upc.service.api.BusinessPartnerServiceImpl;
import com.yonyoucloud.upc.service.customerapply.CustomerApplyCheckService;
import com.yonyoucloud.upc.service.utils.OrgPermissionsUtil;
import com.yonyoucloud.upc.service.utils.ProductUtil;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.IdcardUtils;
import com.yonyoucloud.upc.utils.MerchantOpenApiUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import com.yonyoucloud.upc.utils.SQLInjectionCheckUtil;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.base.Json;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationAdapter;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Service
public class MerchantCheckService {
    private static final Logger log = LoggerFactory.getLogger(MerchantCheckService.class);
    Logger logger = LoggerFactory.getLogger(MerchantCheckService.class);
    final String regex = "^[a-zA-Z\\d./\\\\@\\-_$]*$";
    @Autowired
    private IBillCodeComponentService billCodeComponentService;
    @Autowired
    private IFuncTypeQueryService iFuncTypeQueryService;
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private IOrgUnitQueryService iOrgUnitQueryService;
    @Autowired
    private BusinessPartnerServiceImpl iBusinessPartnerService;
    @Autowired
    private MetadataSupportService metadataSupportService;
    @Autowired
    private IServiceIsolateService iServiceIsolateService;
    @Autowired
    private OrgPermissionsUtil orgPermissionsUtil;
    @Autowired
    private OrgPermissionsService orgPermissionsService;
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    private BusinessPartnerService partnerService;
    @Autowired
    private IBusinessPartnerServiceV2 businessPartnerServiceV2;
    @Autowired
    ISaleAreaService iSaleAreaService;
    @Autowired
    private IBDQueryRepository billQueryRepository;
    @Autowired
    private MCServiceUntils mcServiceUntils;
    @Autowired
    CustomerApplyCheckService customerApplyCheckService;

    public void checkMerchantFromCustomerApply(Merchant merchant, CustomerApply customerApply) throws Exception {
        this.checkMustInput(merchant);
        this.checkSaveMerchantFromCustomerApply(merchant, customerApply);
    }

    public void checkSaveMerchantFromCustomerApply(Merchant merchant, CustomerApply customerApply) throws Exception {
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        LoginUser currentUser = AppContext.getCurrentUser();
        if (CustomerApplyType.modify == customerApply.getApplyType() && CustomerApplyChangeType.GENERAL == customerApply.getCustomerApplyChangeType() && !merchant.getCreateOrg().equals(merchant.get("belongOrg"))) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_APPLY_ORG_MUST_CREATE_ORG);
        }
        this.theMerchantCheck(merchant, singleOrg, currentUser, customerApply);
        this.checkPath(merchant);
        this.theMerchantsManagerCheck(merchant);
        this.theMerchantRoleCheck(merchant, singleOrg, currentUser);
        this.checkCustomerArea(merchant);
        this.checkPrincipal(merchant);
        this.checkInvoicingCustomers(merchant);
        this.checkMerchantAddress(merchant);
        this.checkMerchantContact(merchant);
        this.checkMerchantAgentFinancial(merchant);
        this.checkMerchantAgentInvoice(merchant);
        if (merchant.get("name") != null && !merchant.containsKey((Object)"isBatchModifyMerchant")) {
            this.setBusinessPartnerId(merchant);
        }
    }

    public void theBeforeSaveCheckFromApi(Merchant merchant) throws Exception {
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        LoginUser currentUser = AppContext.getCurrentUser();
        this.theMerchantCheck(merchant, singleOrg, currentUser, null);
        this.theMerchantsManagerCheck(merchant);
        this.theMerchantRoleCheck(merchant, singleOrg, currentUser);
        this.merchantRoleCheckFromApi(merchant);
        this.merchantApplyRangeBeforeCheckFromApi(merchant);
    }

    public void beforeDataPreprocessCheckFromApi(Merchant merchant) throws Exception {
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        LoginUser currentUser = AppContext.getCurrentUser();
        this.merchantCheckFromApi(merchant, singleOrg, currentUser);
        this.merchantApplyRangeCheckFromApi(merchant);
    }

    public void theBeforeSaveCheckUdh(Merchant merchant) throws Exception {
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        LoginUser currentUser = AppContext.getCurrentUser();
        this.theMerchantCheck(merchant, singleOrg, currentUser, null);
        this.theMerchantsManagerCheck(merchant);
        this.theMerchantRoleCheck(merchant, singleOrg, currentUser);
    }

    public void theMerchantCheck(Merchant merchant, Boolean singleOrg, LoginUser currentUser, CustomerApply customerApply) throws Exception {
        List merchantInDbList;
        if (!SQLInjectionCheckUtil.validateParamCode((String)merchant.getCode())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800438);
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"enterpriseNature") && merchant.getEnterpriseNature() != null) {
            if (MerchantUtils.isExists((Map)merchant, (String)"licenseType")) {
                merchant.set("licenseType", (Object)Short.valueOf(merchant.get("licenseType").toString()));
            }
            if (merchant.getEnterpriseNature().getValue() == 0) {
                if (merchant.getLicenseType() != null && merchant.getLicenseType() != LicenseType.socialCodes && merchant.getLicenseType() != LicenseType.otherLicenses) {
                    String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801F7", (String)"\u4f01\u4e1a\u7c7b\u578b\u4e3a\u4f01\u4e1a,\u8bc1\u7167\u7c7b\u578b\u53ea\u80fd\u8f93\u5165\u201c\u7edf\u4e00\u793e\u4f1a\u4fe1\u7528\u4ee3\u7801\u3001\u5176\u4ed6\u8bc1\u7167\u201d"), new Object[0]);
                    throw new CoreDocBusinessException(null, msg);
                }
            } else if (merchant.getEnterpriseNature().getValue() == 1) {
                if (merchant.getLicenseType() != null && merchant.getLicenseType() != LicenseType.IDCard && merchant.getLicenseType() != LicenseType.passport && merchant.getLicenseType() != LicenseType.otherIDDocuments) {
                    String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801FB", (String)"\u4f01\u4e1a\u7c7b\u578b\u4e3a\u4e2a\u4eba,\u8bc1\u7167\u7c7b\u578b\u53ea\u80fd\u8f93\u5165\u201c\u5c45\u6c11\u8eab\u4efd\u8bc1\u3001\u62a4\u7167\u3001\u5176\u4ed6\u8eab\u4efd\u8bc1\u4ef6\u201d"), new Object[0]);
                    throw new CoreDocBusinessException(null, msg);
                }
                if (merchant.getLicenseType() == LicenseType.IDCard && MerchantUtils.isExists((Map)merchant, (String)"creditCode") && !IdcardUtils.validateCard((String)merchant.getCreditCode())) {
                    String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801DC", (String)"\u5c45\u6c11\u8eab\u4efd\u8bc1\u53f7\u4e0d\u5408\u6cd5\uff01"), new Object[0]);
                    throw new CoreDocBusinessException(null, msg);
                }
            } else if (merchant.getEnterpriseNature().getValue() == 2) {
                if (merchant.getLicenseType() != null && merchant.getLicenseType() != LicenseType.socialCodes && merchant.getLicenseType() != LicenseType.businessLicense && merchant.getLicenseType() != LicenseType.otherLicenses) {
                    String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801E1", (String)"\u4f01\u4e1a\u7c7b\u578b\u4e3a\u5176\u4ed6,\u8bc1\u7167\u7c7b\u578b\u53ea\u80fd\u8f93\u5165\u201c\u7edf\u4e00\u793e\u4f1a\u4fe1\u7528\u4ee3\u7801\u3001\u8425\u4e1a\u6267\u7167\u3001\u5176\u4ed6\u8bc1\u7167\u201d"), new Object[0]);
                    throw new CoreDocBusinessException(null, msg);
                }
            } else {
                String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801E3", (String)"\u4f01\u4e1a\u7c7b\u578b\u6570\u636e\u9519\u8bef,\u8bf7\u8f93\u5165\u6b63\u786e\u6570\u636e!"), new Object[0]);
                throw new CoreDocBusinessException(null, msg);
            }
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"leaderNameIdNo") && !IdcardUtils.validateCard((String)merchant.getLeaderNameIdNo())) {
            String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801E8", (String)"\u6cd5\u4eba\u4ee3\u8868\u8eab\u4efd\u8bc1\u53f7\u4e0d\u5408\u6cd5\uff01"), new Object[0]);
            throw new CoreDocBusinessException(null, msg);
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"personChargeIdNo") && !IdcardUtils.validateCard((String)merchant.getPersonChargeIdNo())) {
            String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801EC", (String)"\u8d1f\u8d23\u4eba\u8eab\u4efd\u8bc1\u53f7\u4e0d\u5408\u6cd5\uff01"), new Object[0]);
            throw new CoreDocBusinessException(null, msg);
        }
        if (merchant.getEntityStatus() == EntityStatus.Insert) {
            if (merchant.getVerfyMark() == null) {
                merchant.setVerfyMark(VerifyingState.Unverified);
            }
            if (merchant.getTaxPayingCategories() == null) {
                merchant.setTaxPayingCategories(TaxPayingCate.generaltaxpayer);
            }
            if (merchant.getInternalOrg() == null) {
                merchant.setInternalOrg(Boolean.valueOf(false));
            }
        }
        if (singleOrg.booleanValue() && (currentUser.getUserType() == UserType.ShopAdminUser || currentUser.getUserType() == UserType.ShopUser)) {
            merchant.setDevelopmentPartner(Long.valueOf((String)AppContext.getCurrentUser().get("singleOrgId")));
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"developmentPartner")) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchant.getDevelopmentPartner()), QueryCondition.name((String)"merchantRole.merchantOptions").eq((Object)1)}));
            List developmentPartnerList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
            if (CollectionUtils.isEmpty((Collection)developmentPartnerList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800439);
            }
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"internalOrgId") && !MerchantUtils.getIsInternalCustomer()) {
            boolean purchaseorg = this.iFuncTypeQueryService.orgHasFunc(AppContext.getCurrentUser().getYhtTenantId(), merchant.getInternalOrgId(), "purchaseorg");
            boolean financeorg = this.iFuncTypeQueryService.orgHasFunc(AppContext.getCurrentUser().getYhtTenantId(), merchant.getInternalOrgId(), "financeorg");
            if (!purchaseorg && !financeorg) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800440);
            }
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"internalOrg") && merchant.getInternalOrg().booleanValue()) {
            if (!StringUtils.isEmpty((CharSequence)merchant.getInternalOrgId())) {
                this.checkMerchantInternalOrgId(merchant);
                this.checkInternalOrgIdForCustomerApply(merchant, customerApply);
            }
            if (!CollectionUtils.isEmpty((Map)merchant.merchantRole()) && !StringUtils.isEmpty((CharSequence)merchant.merchantRole().getBusinessRole())) {
                if (merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("5") || merchant.merchantRole().getBusinessRole().contains("6")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800441);
                }
            } else {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"businessRole").like((Object)"3"), QueryCondition.name((String)"businessRole").like((Object)"4"), QueryCondition.name((String)"businessRole").like((Object)"5"), QueryCondition.name((String)"businessRole").like((Object)"6")})}));
                Map merchantRole = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Map)merchantRole)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800441);
                }
            }
            if (merchant.getEntityStatus() == EntityStatus.Insert && StringUtils.isEmpty((CharSequence)merchant.getInternalOrgId())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800442);
            }
            if (merchant.getEntityStatus() == EntityStatus.Update && StringUtils.isEmpty((CharSequence)merchant.getInternalOrgId())) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("internalOrgId");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
                merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                if (CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800442);
                }
            }
        } else if (MerchantUtils.isExists((Map)merchant, (String)"internalOrg") && !merchant.getInternalOrg().booleanValue()) {
            merchant.setInternalOrgId(null);
            if (IsFinancialSynergy.YES.getValue().equals(merchant.getIsFinancialSynergy())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800443);
            }
            merchant.setIsFinancialSynergy(IsFinancialSynergy.NO.getValue());
        }
        if (merchant.getEntityStatus() == EntityStatus.Insert && StringUtils.isEmpty((CharSequence)merchant.getIsFinancialSynergy())) {
            merchant.setIsFinancialSynergy(IsFinancialSynergy.NO.getValue());
        } else if (merchant.getEntityStatus() == EntityStatus.Update && IsFinancialSynergy.YES.getValue().equals(merchant.getIsFinancialSynergy()) && merchant.getInternalOrg() == null) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("internalOrg").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
            merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantInDbList) && !((Merchant)merchantInDbList.get(0)).getInternalOrg().booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800443);
            }
        }
        this.checkParentManageOrgForMerchant(merchant, currentUser, singleOrg);
        this.checkMerchantRegionCode(merchant);
    }

    public void theMerchantsManagerCheck(Merchant merchant) throws Exception {
        if ("isBatchModifyMerchant".equals(merchant.get("isBatchModifyMerchant"))) {
            merchant.setMerchantsManager(null);
        }
        if (merchant.merchantsManager() != null) {
            if (StringUtils.isBlank((CharSequence)merchant.merchantsManager().getMobile()) && StringUtils.isBlank((CharSequence)merchant.merchantsManager().getEmail())) {
                merchant.setMerchantsManager(null);
            } else {
                merchant.merchantsManager().setId((Object)merchant.merchantsManager().getMerchantId());
            }
        }
        if (merchant.merchantsManager() != null) {
            if (StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getMobile()) || StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getEmail())) {
                if (StringUtils.isBlank((CharSequence)merchant.merchantsManager().getFullName())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800444);
                }
                if (StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getMobile()) && StringUtils.isBlank((CharSequence)merchant.merchantsManager().getCountryCode())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800445, new Object[]{merchant.getCode()});
                }
                if (!(MerchantUtils.isExists((Map)merchant, (String)"data_from") || merchant.get("_fromApi") == null || !((Boolean)merchant.get("_fromApi")).booleanValue() || merchant.merchantRole() == null || merchant.merchantRole().getBusinessRole() != null && (merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("5") || merchant.merchantRole().getBusinessRole().contains("2") || merchant.merchantRole().getBusinessRole().contains("6")))) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800446, new Object[]{merchant.getCode()});
                }
            } else if (StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getFullName())) {
                if (StringUtils.isBlank((CharSequence)merchant.merchantsManager().getMobile()) || StringUtils.isBlank((CharSequence)merchant.merchantsManager().getEmail())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800447);
                }
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800448, new Object[]{merchant.getCode()});
            }
            if (merchant.getId() != null) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id, mobile, email, fullName").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
                Map stringObjectMap = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantsManager", (QuerySchema)querySchema);
                if (stringObjectMap != null && !stringObjectMap.isEmpty()) {
                    if (merchant.merchantsManager() != null && !merchant.merchantsManager().getFullName().equals(stringObjectMap.get("fullName"))) {
                        if (stringObjectMap.get("mobile") != null && stringObjectMap.get("email") != null && stringObjectMap.get("mobile").equals(merchant.merchantsManager().getMobile()) && stringObjectMap.get("email").equals(merchant.merchantsManager().getEmail())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800449);
                        }
                        if (stringObjectMap.get("mobile") != null && stringObjectMap.get("mobile").equals(merchant.merchantsManager().getMobile())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800449);
                        }
                        if (stringObjectMap.get("email") != null && stringObjectMap.get("email").equals(merchant.merchantsManager().getEmail())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800449);
                        }
                    }
                    merchant.merchantsManager().setEntityStatus(EntityStatus.Update);
                    merchant.merchantsManager().setId(stringObjectMap.get("id"));
                } else {
                    merchant.merchantsManager().setEntityStatus(EntityStatus.Insert);
                }
            }
        }
    }

    public void theMerchantRoleCheck(Merchant merchant, Boolean singleOrg, LoginUser currentUser) throws Exception {
        if (merchant.merchantRole() != null && merchant.merchantRole().get("merchantOptions") == null) {
            if (merchant.get("merchantOptions") != null) {
                merchant.merchantRole().set("merchantOptions", merchant.get("merchantOptions"));
            } else {
                merchant.merchantRole().set("merchantOptions", (Object)false);
            }
        }
        if (merchant.merchantRole() != null && StringUtils.isBlank((CharSequence)merchant.merchantRole().getBusinessRole())) {
            merchant.merchantRole().setBusinessRole("1");
        }
        if (!CollectionUtils.isEmpty((Map)merchant.merchantRole())) {
            String businessRole = merchant.merchantRole().getBusinessRole();
            Object isOpenportalMG = OptionUtils.getOptionByName((String)"u8c-config", (String)"app:portalMG", null);
            OptionData isOpenURetail = OptionUtils.getOptionByName((String)"u8c-config", (String)"app:RM");
            boolean sdma = ProductUtil.checkOpenOption("u8c-config", DomainOpenEnum.MALL.getServiceName());
            Object channelnoticesettinglist = OptionUtils.getSysOptionByName((String)"service:channelnoticesettinglist");
            Object prm = OptionUtils.getSysOptionByName((String)"app:PRM");
            String defaultOpen = "0";
            String defaultOpenApp = "false";
            if (singleOrg.booleanValue() && (currentUser.getUserType() == UserType.TenantAdmin || currentUser.getUserType() == UserType.TenantEmployee || currentUser.getUserType() == UserType.TenantShopuser || currentUser.getUserType() == UserType.JoinUser) && (businessRole.contains("4") || businessRole.contains("3") || businessRole.contains("5"))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800450);
            }
            if (businessRole.contains("2") && isOpenportalMG != null && (defaultOpen.equals(isOpenportalMG.toString()) || defaultOpenApp.equals(isOpenportalMG.toString()))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800967);
            }
            if (businessRole.contains("3") && channelnoticesettinglist != null && defaultOpenApp.equals(channelnoticesettinglist.toString())) {
                String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801F9", (String)"\u6ca1\u6709\u5f00\u901a\u6e20\u9053\u8fd0\u8425\u4e2d\u5fc31.0\uff0c\u3010\u4e1a\u52a1\u89d2\u8272\u3011\u5b57\u6bb5\u4e0d\u80fd\u5f55\u51652B\u5546\u5bb6"), new Object[0]);
                throw new CoreDocBusinessException(null, msg);
            }
            if (isOpenURetail != null && (defaultOpen.equals(isOpenURetail.toString()) || defaultOpenApp.equals(isOpenURetail.toString())) && businessRole.contains("4")) {
                String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801FC", (String)"\u6ca1\u6709\u5f00\u901a\u53cb\u96f6\u552e\uff0c\u3010\u4e1a\u52a1\u89d2\u8272\u3011\u5b57\u6bb5\u4e0d\u80fd\u5f55\u5165\u96f6\u552e\u52a0\u76df\u5546"), new Object[0]);
                throw new CoreDocBusinessException(null, msg);
            }
            if (!sdma && businessRole.contains("5")) {
                String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801FE", (String)"\u6ca1\u6709\u5f00\u901a\u5546\u57ce\u5e94\u7528\uff0c\u3010\u4e1a\u52a1\u89d2\u8272\u3011\u5b57\u6bb5\u4e0d\u80fd\u5f55\u51652C\u5546\u5bb6"), new Object[0]);
                throw new CoreDocBusinessException(null, msg);
            }
            if (prm != null && defaultOpenApp.equals(prm.toString()) && businessRole.contains("6")) {
                String msg = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801DD", (String)"\u6ca1\u6709\u5f00\u901a\u4f19\u4f34\u7ba1\u7406\uff0c\u3010\u4e1a\u52a1\u89d2\u8272\u3011\u5b57\u6bb5\u4e0d\u80fd\u5f55\u5165\u4f19\u4f34\u5ba2\u6237"), new Object[0]);
                throw new CoreDocBusinessException(null, msg);
            }
            if (merchant.merchantRole().getMerchantOptions() != null && !merchant.merchantRole().getMerchantOptions().booleanValue() && merchant.merchantRole().getBusinessRole() != null && (merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("5") || merchant.merchantRole().getBusinessRole().contains("6"))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800451, new Object[]{merchant.getCode()});
            }
            if (merchant.merchantRole().getBusinessRole() != null && (merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("5") || merchant.merchantRole().getBusinessRole().contains("2") || merchant.merchantRole().getBusinessRole().contains("6"))) {
                if ((merchant.merchantsManager() == null || !StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getMobile()) && !StringUtils.isNotBlank((CharSequence)merchant.merchantsManager().getEmail())) && !"isBatchModifyMerchant".equals(merchant.get("isBatchModifyMerchant")) && (merchant.merchantsManager() == null || merchant.merchantsManager().containsKey((Object)"mobile") && merchant.merchantsManager().getMobile() == null || merchant.merchantsManager().containsKey((Object)"email") && merchant.merchantsManager().getEmail() == null)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800452, new Object[]{merchant.getCode()});
                }
                if (merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("5")) {
                    List merchantApplyRangeDetailList = merchant.merchantAppliedDetail();
                    if (CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList) || ((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getTransactionCurrency() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808060, new Object[]{merchant.getCode()});
                    }
                    if (merchant.getEntityStatus() == EntityStatus.Insert) {
                        if ((currentUser.getUserType() == UserType.TenantAdmin || currentUser.getUserType() == UserType.TenantEmployee) && StringUtils.isEmpty((CharSequence)merchant.getParentManageOrg())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800453);
                        }
                    } else if (merchant.getEntityStatus() == EntityStatus.Update && (currentUser.getUserType() == UserType.TenantAdmin || currentUser.getUserType() == UserType.TenantEmployee) && StringUtils.isEmpty((CharSequence)merchant.getParentManageOrg())) {
                        QuerySchema querySchema = QuerySchema.create();
                        querySchema.addSelect("parentManageOrg").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
                        List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                        if (CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800453);
                        }
                    }
                }
                if (merchant.merchantRole().getBusinessRole().contains("3") || merchant.merchantRole().getBusinessRole().contains("4") || merchant.merchantRole().getBusinessRole().contains("5") || merchant.merchantRole().getBusinessRole().contains("6")) {
                    if (merchant.getInternalOrg() != null && merchant.getInternalOrg().booleanValue()) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800441);
                    }
                    if (merchant.getInternalOrg() == null) {
                        QuerySchema querySchema = QuerySchema.create();
                        querySchema.addSelect("internalOrg");
                        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
                        List merchantOriginList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                        if (!CollectionUtils.isEmpty((Collection)merchantOriginList) && ((Merchant)merchantOriginList.get(0)).getInternalOrg() != null && ((Merchant)merchantOriginList.get(0)).getInternalOrg().booleanValue()) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800441);
                        }
                    }
                }
            }
        }
    }

    public void theMerchantQualificationDocumentCheck(Merchant merchant) throws Exception {
        List merchantQualificationDocumentList;
        if (merchant.getEntityStatus() == EntityStatus.Insert) {
            List merchantQualificationDocumentList2 = merchant.merchantQualificationDocuments();
            if (!CollectionUtils.isEmpty((Collection)merchantQualificationDocumentList2) && merchantQualificationDocumentList2.size() > 50) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800460);
            }
            if (!CollectionUtils.isEmpty((Collection)merchantQualificationDocumentList2)) {
                for (MerchantQualificationDocument merchantQualificationDocument : merchantQualificationDocumentList2) {
                    if (!StringUtils.isEmpty((CharSequence)merchantQualificationDocument.getDocumentUploader())) continue;
                    merchantQualificationDocument.setDocumentUploader(AppContext.getCurrentUser().getName());
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    merchantQualificationDocument.set("documentUploaderTime", (Object)sdf.format(new Date()));
                }
            }
        } else if (!(merchant.getEntityStatus() != EntityStatus.Update && merchant.getEntityStatus() != EntityStatus.Unchanged || CollectionUtils.isEmpty((Collection)(merchantQualificationDocumentList = merchant.merchantQualificationDocuments())))) {
            int size = 0;
            ArrayList<String> idList = new ArrayList<String>();
            for (MerchantQualificationDocument merchantQualificationDocument : merchantQualificationDocumentList) {
                SimpleDateFormat sdf;
                if (merchantQualificationDocument.getEntityStatus() != EntityStatus.Delete) {
                    ++size;
                }
                if (merchantQualificationDocument.getEntityStatus() == EntityStatus.Update) {
                    if (StringUtils.isEmpty((CharSequence)merchantQualificationDocument.getInformationModifier())) {
                        merchantQualificationDocument.setInformationModifier(AppContext.getCurrentUser().getName());
                        sdf = new SimpleDateFormat("yyyy-MM-dd");
                        merchantQualificationDocument.set("informationModifyTime", (Object)sdf.format(new Date()));
                    }
                } else if (merchantQualificationDocument.getEntityStatus() == EntityStatus.Insert && StringUtils.isEmpty((CharSequence)merchantQualificationDocument.getDocumentUploader())) {
                    merchantQualificationDocument.setDocumentUploader(AppContext.getCurrentUser().getName());
                    sdf = new SimpleDateFormat("yyyy-MM-dd");
                    merchantQualificationDocument.set("documentUploaderTime", (Object)sdf.format(new Date()));
                }
                idList.add((String)merchantQualificationDocument.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"id").not_in(idList)}));
            List originalMerchantQualificationDocumentList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantQualificationDocument", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)originalMerchantQualificationDocumentList)) {
                size += originalMerchantQualificationDocumentList.size();
            }
            if (size > 50) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800460);
            }
        }
    }

    public Merchant checkInitMerchantFromCustomerApply(Map currCustomerData) throws Exception {
        Merchant merchant = new Merchant();
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum("aa_merchant");
        billDataDto.setData((Object)currCustomerData);
        BillContext billContext = new CommonOperator(OperationTypeEnum.QUERY).getBillContext((BaseDto)billDataDto);
        HashMap<String, BillDataDto> paramMap = new HashMap<String, BillDataDto>();
        paramMap.put("param", billDataDto);
        List bills = CommonRuleUtils.getBills((BillContext)billContext, paramMap);
        if (bills == null || bills.isEmpty()) {
            return null;
        }
        merchant.init((Map)bills.get(0));
        return merchant;
    }

    public void checkMerchantName(String name, String createOrg, Long customerApplyId, Long merchantId, EnterpriseNature enterpriseNature) throws Exception {
        Object merchantNameCheckSwitch = com.yonyou.ucf.mdd.ext.util.OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"merchantNameCheckSwitch");
        if (merchantNameCheckSwitch == null) {
            merchantNameCheckSwitch = "0";
        }
        if (!"2".equals(merchantNameCheckSwitch)) {
            this.checkMerchantNameForMerchant(name, createOrg, merchantId, enterpriseNature, merchantNameCheckSwitch);
            this.checkMerchantNameForCustomerApply(name, createOrg, merchantId, customerApplyId, merchantNameCheckSwitch, enterpriseNature);
        }
    }

    public void checkMerchantNameForMerchant(String name, String createOrg, Long merchantId, EnterpriseNature enterpriseNature, Object merchantNameCheckSwitch) throws Exception {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,code");
        if (EnterpriseNature.enterprise == enterpriseNature || enterpriseNature == EnterpriseNature.nonprofitOrg) {
            if ("0".equals(merchantNameCheckSwitch)) {
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)name), QueryCondition.name((String)"id").not_eq((Object)merchantId)}));
                List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                    if (this.checkMerchantFromCrm((Long)((Merchant)merchantInDbList.get(0)).getId())) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_NAME_CRM, new Object[]{name, ((Merchant)merchantInDbList.get(0)).getCode()});
                    }
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800400, new Object[]{name});
                }
            } else if ("1".equals(merchantNameCheckSwitch)) {
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)name), QueryCondition.name((String)"id").not_eq((Object)merchantId), QueryCondition.name((String)"createOrg").eq((Object)createOrg)}));
                List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                    if (this.checkMerchantFromCrm((Long)((Merchant)merchantInDbList.get(0)).getId())) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_NAME_CRM_CREATE_ORG, new Object[]{createOrg, name, ((Merchant)merchantInDbList.get(0)).getCode()});
                    }
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800402, new Object[]{createOrg, name});
                }
            }
        } else if (EnterpriseNature.personal == enterpriseNature) {
            // empty if block
        }
    }

    public void checkMerchantNameForCustomerApply(String name, String createOrg, Long merchantId, Long customerApplyId, Object merchantNameCheckSwitch, EnterpriseNature enterpriseNature) throws Exception {
        if (enterpriseNature == EnterpriseNature.enterprise || enterpriseNature == EnterpriseNature.nonprofitOrg) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,effectStatus,applyCustomer,customerData");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantName").eq((Object)name), QueryCondition.name((String)"id").not_eq((Object)customerApplyId)}));
            List originalDataBaseCustomerApplyList = MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApply", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)originalDataBaseCustomerApplyList)) {
                for (CustomerApply originalDataBaseCustomerApply : originalDataBaseCustomerApplyList) {
                    if (originalDataBaseCustomerApply.getEffectStatus() != CustomerEffectStatus.pending || merchantId.equals(originalDataBaseCustomerApply.getApplyCustomer())) continue;
                    Merchant merchant = (Merchant)JSONObject.parseObject((String)originalDataBaseCustomerApply.getCustomerData(), Merchant.class);
                    String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801F2", (String)"\u5ba2\u6237:[%s]\u540d\u79f0\u5728\u5ba2\u6237\u7533\u8bf7\u5355\u4e2d\u91cd\u590d,\u8bf7\u68c0\u67e5\uff01"), name);
                    throw new CoreDocBusinessException(null, str);
                }
            }
        }
    }

    public void checkMerchantNameRedis(String name, String createOrg, Long merchantId) throws Exception {
        String values;
        Object merchantNameCheckSwitch = com.yonyou.ucf.mdd.ext.util.OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"merchantNameCheckSwitch");
        if (merchantNameCheckSwitch == null) {
            merchantNameCheckSwitch = "0";
        }
        if ("2".equals(merchantNameCheckSwitch)) {
            return;
        }
        String unionKey = null;
        if ("0".equals(merchantNameCheckSwitch)) {
            unionKey = "productcenteraa.merchant.MerchantcheckMerchantNameRedis" + name.trim() + AppContext.getTenantId();
        } else if ("1".equals(merchantNameCheckSwitch)) {
            unionKey = createOrg != null ? "productcenteraa.merchant.MerchantcheckMerchantNameRedis" + createOrg.trim() + name.trim() + AppContext.getTenantId() : "productcenteraa.merchant.MerchantcheckMerchantNameRedis666666" + name.trim() + AppContext.getTenantId();
        }
        String ids = merchantId != null ? merchantId.toString() : "0";
        this.logger.info("checkMerchantNameRedis:{}", (Object)unionKey);
        boolean isOk = AppContext.cache().setnx(unionKey, ids, 5);
        if (!isOk && !(values = AppContext.cache().get(unionKey)).equals(ids)) {
            String str1 = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801E7", (String)"\u5b58\u5728\u76f8\u540c\u540d\u79f0[%s]\u7684\u5ba2\u6237\u6216\u8005\u5ba2\u6237\u7533\u8bf7\u5355\u6b63\u5728\u4fdd\u5b58,\u8bf7\u7a0d\u540e\u64cd\u4f5c\u6216\u66f4\u6539\u540d\u79f0\u8fdb\u884c\u4fdd\u5b58!"), name);
            throw new CoreDocBusinessException(str1);
        }
        final String finalUnionKey = unionKey;
        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

            public void afterCommit() {
                AppContext.cache().del(new String[]{finalUnionKey});
            }
        });
    }

    public boolean checkMerchantFromCrm(Long merchantId) throws Exception {
        if (merchantId != null) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isCreator").eq((Object)true), QueryCondition.name((String)"isPotential").eq((Object)true), QueryCondition.name((String)"ytenant").eq(AppContext.getYTenantId())}));
            querySchema.setPartitionable(false);
            List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
            return !CollectionUtils.isEmpty((Collection)merchantApplyRangeList);
        }
        return false;
    }

    public void checkMerchantNameFromMerchant(Merchant merchant) throws Exception {
        MerchantCheckService.dealMerchantName(merchant);
        EnterpriseNature enterpriseNature = merchant.getEnterpriseNature() == null && merchant.getEntityStatus() == EntityStatus.Insert ? EnterpriseNature.enterprise : merchant.getEnterpriseNature();
        String merchantLocaleName = String.valueOf(MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)merchant, null));
        this.logger.info("\u5ba2\u6237\u540d\u79f0\u6821\u9a8ccheckMerchantNameFromMerchant:{}", (Object)merchantLocaleName);
        if (EnterpriseNature.enterprise == enterpriseNature || enterpriseNature == EnterpriseNature.nonprofitOrg) {
            this.checkMerchantNameRedis(merchantLocaleName, merchant.getCreateOrg(), (Long)merchant.getId());
        }
        if (merchant.getEnterpriseNature() != EnterpriseNature.personal) {
            this.mcServiceUntils.validateDocUniquenessAndThrow((BizObject)merchant, "aa.merchant.Merchant");
            this.customerApplyCheckService.uniqueCheckWithCustomerApply((BizObject)merchant, null);
        }
    }

    private static void dealMerchantName(Merchant merchant) {
        Object merchantLocaleNameObject = MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)merchant, null);
        if (merchantLocaleNameObject == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800404);
        }
        String merchantLocaleName = String.valueOf(merchantLocaleNameObject);
        if (merchant.get("name") instanceof String) {
            merchant.set("name", (Object)MerchantUtils.replaceStr((String)merchantLocaleName));
        } else if (merchant.get("name") instanceof BizObject) {
            String locale = InvocationInfoProxy.getLocale();
            BizObject nameObject = (BizObject)merchant.get("name");
            if (null == locale) {
                nameObject.set("zh_CN", (Object)MerchantUtils.replaceStr((String)merchantLocaleName));
            } else {
                nameObject.set(locale, (Object)MerchantUtils.replaceStr((String)merchantLocaleName));
            }
        }
    }

    public void checkMerchantNameFromCustomerApply(CustomerApply customerApply) throws Exception {
        Merchant merchant = (Merchant)Objectlizer.decodeObj((Json)new Json(customerApply.getCustomerData()), (String)"aa.merchant.Merchant");
        String merchantLocaleName = MerchantUtils.replaceStr((String)String.valueOf(MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)merchant, null)));
        if ((customerApply.getApplyType() == CustomerApplyType.add || customerApply.getApplyType() == CustomerApplyType.modify) && merchant.getEnterpriseNature() != EnterpriseNature.personal) {
            this.mcServiceUntils.validateDocUniquenessAndThrow((BizObject)merchant, "aa.merchant.Merchant");
            this.customerApplyCheckService.uniqueCheckWithCustomerApply((BizObject)merchant, customerApply);
        }
        this.checkMerchantNameRedis(merchantLocaleName, merchant.getCreateOrg(), (Long)merchant.getId());
    }

    private String getCodeFromCodeService(Merchant merchant) {
        BillCodeComponentParam billCodeParam = new BillCodeComponentParam("productcenter.aa_merchant", "aa_merchant", InvocationInfoProxy.getTenantid(), "-1", "aa.merchant.Merchant", new BillCodeObj[]{new BillCodeObj((Map)merchant)});
        String[] batchBillCodes = this.billCodeComponentService.getBatchBillCodes(billCodeParam);
        if (StringUtils.isEmpty((CharSequence)batchBillCodes[0])) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800968);
        }
        return batchBillCodes[0];
    }

    public void dealCodeFromMerchant(Merchant merchant) throws Exception {
        String billNum = "aa_merchant";
        String merchantBizObjCode = "productcenter.aa_merchant";
        BillCodeComponentParam billCodeParam = new BillCodeComponentParam(merchantBizObjCode, billNum, AppContext.getCurrentUser().getYxyTenantId(), "-1");
        BillCodeContext context = this.billCodeComponentService.getBillCodeContext(billCodeParam);
        Integer billNumMode = context.getBillnumMode();
        String code = merchant.getCode();
        int whileNum = 0;
        if (null != billNumMode && billNumMode == 0 && Objects.nonNull(code)) {
            this.checkCodeFromMerchant(code, (Long)merchant.getId(), true);
        } else if (null != billNumMode && billNumMode == 2 && Objects.nonNull(code)) {
            Integer handleWorkDuplicatePolicy;
            boolean error = true;
            if (context.getBillNumber() != null && context.getBillNumber() instanceof BillNumberPO && (handleWorkDuplicatePolicy = ((BillNumberPO)context.getBillNumber()).getHandleWorkDuplicatePolicy()) == 0) {
                error = false;
            }
            if (this.checkCodeFromMerchant(code, (Long)merchant.getId(), error).booleanValue()) {
                Boolean isValid = true;
                while (isValid.booleanValue()) {
                    if (whileNum > 100) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800969, new Object[]{code});
                    }
                    code = this.getCodeFromCodeService(merchant);
                    isValid = this.checkCodeFromMerchant(code, (Long)merchant.getId(), false);
                    ++whileNum;
                }
            }
            merchant.setCode(code);
            final BillCodeComponentParam commitBillCodeParam = new BillCodeComponentParam(merchantBizObjCode, billNum, AppContext.getCurrentUser().getYxyTenantId(), "-1", new String[]{code});
            this.billCodeComponentService.commitBatchBillCodes(commitBillCodeParam);
            TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronizationAdapter(){

                public void afterCompletion(int status) {
                    if (0 != status) {
                        MerchantCheckService.this.billCodeComponentService.rollbackBatchBillCodes(commitBillCodeParam);
                    }
                }
            });
        }
    }

    public void dealCodeFromCustomerApply(CustomerApply customerApply) throws Exception {
        QuerySchema querySchema;
        List originalDataBaseMerchantList;
        Merchant merchant = (Merchant)JSONObject.parseObject((String)customerApply.getCustomerData(), Merchant.class);
        String billNum = "aa_merchant";
        String merchantBizObjCode = "productcenter.aa_merchant";
        BillCodeComponentParam billCodeParam = new BillCodeComponentParam(merchantBizObjCode, billNum, AppContext.getCurrentUser().getYxyTenantId(), "-1");
        BillCodeContext context = this.billCodeComponentService.getBillCodeContext(billCodeParam);
        Integer billNumMode = context.getBillnumMode();
        String merchantCode = merchant.getCode();
        Long customerApplyId = (Long)customerApply.getId();
        Long merchantId = customerApply.getApplyCustomer();
        if (CustomerApplyType.modify == customerApply.getApplyType() && merchantId != null && (CollectionUtils.isEmpty((Collection)(originalDataBaseMerchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)(querySchema = QuerySchema.create().addSelect("code").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantId)}))), null))) || ((Merchant)originalDataBaseMerchantList.get(0)).getCode().equals(merchantCode))) {
            return;
        }
        int whileNum = 0;
        if (null != billNumMode && billNumMode == 0 && Objects.nonNull(merchantCode)) {
            this.checkCodeFromCustomerApply(merchantCode, merchantId, customerApplyId, true);
        } else if (null != billNumMode && billNumMode == 2 && Objects.nonNull(merchantCode)) {
            Integer handleWorkDuplicatePolicy;
            Boolean error = true;
            if (context.getBillNumber() != null && context.getBillNumber() instanceof BillNumberPO && (handleWorkDuplicatePolicy = ((BillNumberPO)context.getBillNumber()).getHandleWorkDuplicatePolicy()) == 0) {
                error = false;
            }
            if (this.checkCodeFromCustomerApply(merchantCode, merchantId, customerApplyId, error)) {
                boolean isValid = true;
                while (isValid) {
                    if (whileNum > 100) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800969, new Object[]{merchantCode});
                    }
                    merchantCode = this.getCodeFromCodeService(merchant);
                    isValid = this.checkCodeFromCustomerApply(merchantCode, merchantId, customerApplyId, error);
                    ++whileNum;
                }
            }
            final BillCodeComponentParam commitBillCodeParam = new BillCodeComponentParam(merchantBizObjCode, billNum, AppContext.getCurrentUser().getYxyTenantId(), "-1", new String[]{merchantCode});
            this.billCodeComponentService.commitBatchBillCodes(commitBillCodeParam);
            TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronizationAdapter(){

                public void afterCompletion(int status) {
                    if (0 != status) {
                        MerchantCheckService.this.billCodeComponentService.rollbackBatchBillCodes(commitBillCodeParam);
                    }
                }
            });
            customerApply.setMerchantCode(merchantCode);
            merchant.setCode(merchantCode);
            customerApply.setCustomerData(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)merchant));
        } else {
            if (this.checkCodeFromCustomerApply(merchantCode, merchantId, customerApplyId, false)) {
                boolean isValid = true;
                while (isValid) {
                    if (whileNum > 100) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800969, new Object[]{merchantCode});
                    }
                    merchantCode = this.getCodeFromCodeService(merchant);
                    isValid = this.checkCodeFromCustomerApply(merchantCode, merchantId, customerApplyId, false);
                    ++whileNum;
                }
            }
            final BillCodeComponentParam commitBillCodeParam = new BillCodeComponentParam(merchantBizObjCode, billNum, AppContext.getCurrentUser().getYxyTenantId(), "-1", new String[]{merchantCode});
            this.billCodeComponentService.commitBatchBillCodes(commitBillCodeParam);
            TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronizationAdapter(){

                public void afterCompletion(int status) {
                    if (0 != status) {
                        MerchantCheckService.this.billCodeComponentService.rollbackBatchBillCodes(commitBillCodeParam);
                    }
                }
            });
            customerApply.setMerchantCode(merchantCode);
            merchant.setCode(merchantCode);
            customerApply.setCustomerData(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)merchant));
        }
    }

    public Boolean checkCodeFromMerchant(String code, Long merchantId, Boolean error) throws Exception {
        String message;
        Boolean isRepeat = false;
        if (code == null || "".equals(code)) {
            if (error.booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800970);
            }
            this.logger.error("\u5ba2\u6237\u7f16\u7801\u552f\u4e00\u6027\u6821\u9a8c\u89c4\u5219:\u5ba2\u6237\u7f16\u7801\u4e0d\u80fd\u4e3a\u7a7a!");
            return isRepeat;
        }
        if (merchantId == null) {
            if (error.booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800971);
            }
            this.logger.error("\u5ba2\u6237\u7f16\u7801\u552f\u4e00\u6027\u6821\u9a8c\u89c4\u5219:\u5ba2\u6237Id\u4e0d\u80fd\u4e3a\u7a7a!");
            return isRepeat;
        }
        if (this.checkMerchantCodeByRedis(code, merchantId).booleanValue()) {
            isRepeat = true;
            message = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801EA", (String)"\u5ba2\u6237:[%s]\u7f16\u7801,\u6709\u76f8\u540c\u6570\u636e\u5728\u64cd\u4f5c,\u8bf7\u7a0d\u540e\u91cd\u8bd5!"), code);
            if (error.booleanValue()) {
                throw new CoreDocBusinessException(null, message);
            }
            this.logger.error(message);
        }
        if (!isRepeat.booleanValue() && this.checkMerchantCodeByMerchantId(code, merchantId).booleanValue()) {
            isRepeat = true;
            message = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801DF", (String)"\u5ba2\u6237:[%s]\u7f16\u7801\u5728[\u5ba2\u6237\u6863\u6848]\u4e2d\u91cd\u590d,\u8bf7\u68c0\u67e5!"), code);
            if (error.booleanValue()) {
                throw new CoreDocBusinessException(null, message);
            }
            this.logger.error(message);
        }
        if (!isRepeat.booleanValue() && this.checkCustomerApplyCodeByMerchantId(code, merchantId).booleanValue()) {
            isRepeat = true;
            message = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801E4", (String)"\u5ba2\u6237:[%s]\u7f16\u7801\u5728[\u5ba2\u6237\u7533\u8bf7:\u751f\u6548\u72b6\u6001(\u672a\u5904\u7406)]\u4e2d\u91cd\u590d,\u8bf7\u68c0\u67e5!"), code);
            if (error.booleanValue()) {
                throw new CoreDocBusinessException(null, message);
            }
            this.logger.error(message);
        }
        return isRepeat;
    }

    public boolean checkCodeFromCustomerApply(String merchantCode, Long merchantId, Long customerApplyId, Boolean error) throws Exception {
        String message;
        boolean isRepeat = false;
        if (merchantCode == null || "".equals(merchantCode)) {
            if (error.booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800970);
            }
            this.logger.error("\u5ba2\u6237\u7f16\u7801\u552f\u4e00\u6027\u6821\u9a8c\u89c4\u5219:\u5ba2\u6237\u7f16\u7801\u4e0d\u80fd\u4e3a\u7a7a!");
            return false;
        }
        if (customerApplyId == null) {
            if (error.booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800972);
            }
            this.logger.error("\u5ba2\u6237\u7f16\u7801\u552f\u4e00\u6027\u6821\u9a8c\u89c4\u5219:\u5ba2\u6237\u7533\u8bf7Id\u4e0d\u80fd\u4e3a\u7a7a!");
            return false;
        }
        if (merchantId == null) {
            merchantId = 0L;
        }
        if (this.checkMerchantCodeByRedis(merchantCode, merchantId).booleanValue()) {
            isRepeat = true;
            message = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801EA", (String)"\u5ba2\u6237:[%s]\u7f16\u7801,\u6709\u76f8\u540c\u6570\u636e\u5728\u64cd\u4f5c,\u8bf7\u7a0d\u540e\u91cd\u8bd5!"), merchantCode);
            if (error.booleanValue()) {
                throw new CoreDocBusinessException(null, message);
            }
            this.logger.error(message);
        }
        if (!isRepeat && this.checkMerchantCodeByMerchantId(merchantCode, merchantId).booleanValue()) {
            isRepeat = true;
            message = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801DF", (String)"\u5ba2\u6237:[%s]\u7f16\u7801\u5728[\u5ba2\u6237\u6863\u6848]\u4e2d\u91cd\u590d,\u8bf7\u68c0\u67e5!"), merchantCode);
            if (error.booleanValue()) {
                throw new CoreDocBusinessException(null, message);
            }
            this.logger.error(message);
        }
        if (!isRepeat && this.checkCustomerApplyCodeByCustomerApply(merchantCode, merchantId, customerApplyId).booleanValue()) {
            isRepeat = true;
            message = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801E4", (String)"\u5ba2\u6237:[%s]\u7f16\u7801\u5728[\u5ba2\u6237\u7533\u8bf7:\u751f\u6548\u72b6\u6001(\u672a\u5904\u7406)]\u4e2d\u91cd\u590d,\u8bf7\u68c0\u67e5!"), merchantCode);
            if (error.booleanValue()) {
                throw new CoreDocBusinessException(null, message);
            }
            this.logger.error(message);
        }
        return isRepeat;
    }

    private Boolean checkMerchantCodeByMerchantId(String code, Long merchantId) throws Exception {
        Boolean isRepeat = false;
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_eq((Object)merchantId), QueryCondition.name((String)"code").eq((Object)code)}));
        List merchantList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)merchantList)) {
            isRepeat = true;
        }
        return isRepeat;
    }

    private Boolean checkCustomerApplyCodeByMerchantId(String code, Long merchantId) throws Exception {
        Boolean isRepeat = false;
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,effectStatus");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantCode").eq((Object)code), QueryConditionGroup.or((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"applyCustomer").is_null(), QueryCondition.name((String)"applyCustomer").not_eq((Object)merchantId)})}));
        List customerApplyList = MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApply", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)customerApplyList)) {
            for (CustomerApply customerApply : customerApplyList) {
                if (customerApply.getEffectStatus() != CustomerEffectStatus.pending) continue;
                isRepeat = true;
                break;
            }
        }
        return isRepeat;
    }

    private Boolean checkCustomerApplyCodeByCustomerApply(String merchantCode, Long merchantId, Long customerApplyId) throws Exception {
        Boolean isRepeat = false;
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,effectStatus,applyCustomer,customerData,applyType");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantCode").eq((Object)merchantCode), QueryCondition.name((String)"id").not_eq((Object)customerApplyId)}));
        List originalDataBaseCustomerApplyList = MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApply", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)originalDataBaseCustomerApplyList)) {
            for (CustomerApply originalDataBaseCustomerApply : originalDataBaseCustomerApplyList) {
                if (originalDataBaseCustomerApply.getApplyType() == CustomerApplyType.add && (originalDataBaseCustomerApply.getEffectStatus() == CustomerEffectStatus.pending || originalDataBaseCustomerApply.getEffectStatus() == CustomerEffectStatus.dealing)) {
                    isRepeat = true;
                    break;
                }
                if (originalDataBaseCustomerApply.getApplyType() != CustomerApplyType.modify || originalDataBaseCustomerApply.getEffectStatus() != CustomerEffectStatus.pending || Objects.equals(merchantId, originalDataBaseCustomerApply.getApplyCustomer())) continue;
                isRepeat = true;
                break;
            }
        }
        return isRepeat;
    }

    public Boolean checkMerchantCodeByRedis(String code, Long merchantId) {
        boolean isRepeat;
        boolean bl = isRepeat = null == merchantId;
        if (!isRepeat) {
            String values;
            final String unionKey = "merchantCheckService_checkMerchantCode" + code + AppContext.getCurrentUser().getYTenantId();
            isRepeat = AppContext.cache().setnx(unionKey, String.valueOf(merchantId), 10);
            if (!isRepeat && (values = AppContext.cache().get(unionKey)).equals(merchantId.toString()) && !"0".equals(values) && merchantId != 0L) {
                isRepeat = true;
            }
            TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronizationAdapter(){

                public void afterCompletion(int status) {
                    AppContext.cache().del(new String[]{unionKey});
                }
            });
        }
        return !isRepeat;
    }

    public void dataPreprocessing(Merchant merchant, EntityStatus entityStatus) throws Exception {
        this.merchantChildDataPreprocessing(merchant.merchantRole(), entityStatus);
        this.merchantChildDataPreprocessing(merchant.merchantsManager(), entityStatus);
        if (!MerchantUtils.isExists((Map)merchant, (String)"srcBill") || !"CRM".equals(merchant.get("srcBill"))) {
            this.merchantAppleRangeDataPreprocessing(merchant.getCreateOrg(), (String)merchant.get("belongOrg"), merchant.merchantApplyRanges(), entityStatus);
            this.merchantDataPreprocessing(merchant, entityStatus);
        }
        if (!CollectionUtils.isEmpty((Collection)merchant.merchantAppliedDetail())) {
            this.merchantAppleRangeDetailDataPreprocessing((Long)merchant.getId(), (String)merchant.get("belongOrg"), (MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0), entityStatus);
        }
        this.merchantChildDataPreprocessing((BizObject)merchant.invoicingCustomerss(), entityStatus);
        this.merchantChildDataPreprocessing((BizObject)merchant.merchantContacterInfos(), entityStatus);
        this.merchantChildDataPreprocessing((BizObject)merchant.merchantAddressInfos(), entityStatus);
        this.merchantChildDataPreprocessing((BizObject)merchant.customerAreas(), entityStatus);
        this.merchantChildDataPreprocessing((BizObject)merchant.merchantAgentFinancialInfos(), entityStatus);
        this.merchantChildDataPreprocessing((BizObject)merchant.merchantAgentInvoiceInfos(), entityStatus);
        this.merchantChildDataPreprocessing((BizObject)merchant.principals(), entityStatus);
        this.merchantChildDataPreprocessing((BizObject)merchant.merchantQualificationDocuments(), entityStatus);
        if (merchant.merchantDetail() != null && !merchant.merchantDetail().isEmpty()) {
            this.merchantChildDataPreprocessing((BizObject)merchant.merchantDetail(), entityStatus);
        }
    }

    public void merchantDataPreprocessing(Merchant merchant, EntityStatus entityStatus) throws Exception {
        if (!CollectionUtils.isEmpty((Map)merchant)) {
            if (EntityStatus.Insert == entityStatus) {
                merchant.setEntityStatus(EntityStatus.Insert);
            } else if (EntityStatus.Update == entityStatus) {
                merchant.setEntityStatus(EntityStatus.Update);
                if (StringUtils.isEmpty((CharSequence)((CharSequence)merchant.get("belongOrg")))) {
                    merchant.put("belongOrg", (Object)merchant.getCreateOrg());
                }
                if (merchant.getId() == null) {
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)merchant.getCode())}));
                    List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)merchantList)) {
                        merchant.setId(((Merchant)merchantList.get(0)).getId());
                    } else {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800973, new Object[]{merchant.getCode()});
                    }
                }
                QueryConditionGroup queryMerchantApplyRange = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"orgId").eq(merchant.get("belongOrg")), QueryCondition.name((String)"isPotential").eq((Object)false)});
                QuerySchema schemaId = QuerySchema.create().addSelect("id,isCreator").addCondition((ConditionExpression)queryMerchantApplyRange);
                Map merchantApplyRange = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaId);
                if (merchantApplyRange == null || merchantApplyRange.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800974, new Object[]{merchant.getCode()});
                }
                merchant.put("merchantApplyRangeId", merchantApplyRange.get("id"));
                merchant.put("isCreator", merchantApplyRange.get("isCreator"));
                if (merchant.getId() != null) {
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("scopeModel,retailInvestors,taxPayingCategories");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
                    List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)merchantList)) {
                        if (!merchant.containsKey((Object)"scopeModel") && ((Merchant)merchantList.get(0)).getScopeModel() != null) {
                            merchant.setScopeModel(((Merchant)merchantList.get(0)).getScopeModel());
                        }
                        if (!merchant.containsKey((Object)"retailInvestors") && ((Merchant)merchantList.get(0)).getRetailInvestors() != null) {
                            merchant.setRetailInvestors(((Merchant)merchantList.get(0)).getRetailInvestors());
                        }
                        if (!merchant.containsKey((Object)"taxPayingCategories") && ((Merchant)merchantList.get(0)).getTaxPayingCategories() != null) {
                            merchant.setTaxPayingCategories(((Merchant)merchantList.get(0)).getTaxPayingCategories());
                        }
                    }
                }
            }
        }
    }

    public void merchantAppleRangeDataPreprocessing(String createOrgId, String belongOrgId, List<MerchantApplyRange> merchantApplyRangeList, EntityStatus entityStatus) {
        if (!CollectionUtils.isEmpty(merchantApplyRangeList)) {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                merchantApplyRange.setEntityStatus(EntityStatus.Insert);
                merchantApplyRange.setRangeType(Integer.valueOf(1));
                if (createOrgId.equals(merchantApplyRange.getOrgId())) {
                    merchantApplyRange.setIsCreator(Boolean.valueOf(true));
                    merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                    continue;
                }
                merchantApplyRange.setIsCreator(Boolean.valueOf(false));
                merchantApplyRange.setIsApplied(Boolean.valueOf(false));
            }
        }
    }

    public void merchantAppleRangeDetailDataPreprocessing(Long merchantId, String belongOrg, MerchantApplyRangeDetail merchantApplyRangeDetail, EntityStatus entityStatus) throws Exception {
        if (!CollectionUtils.isEmpty((Map)merchantApplyRangeDetail)) {
            if (EntityStatus.Insert == entityStatus) {
                if (merchantApplyRangeDetail.getStopstatus() == null) {
                    merchantApplyRangeDetail.setStopstatus(Boolean.valueOf(false));
                }
            } else if (EntityStatus.Update == entityStatus) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("stopstatus,signBack,payway,exchangeratetype");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRangeId.orgId").eq((Object)belongOrg)}));
                List merchantApplyRangeDetailList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList)) {
                    if (merchantApplyRangeDetail.getStopstatus() == null) {
                        merchantApplyRangeDetail.setStopstatus(((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getStopstatus());
                    }
                    if (!merchantApplyRangeDetail.containsKey((Object)"signBack") && ((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getSignBack() != null) {
                        merchantApplyRangeDetail.setSignBack(((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getSignBack());
                    }
                    if (!merchantApplyRangeDetail.containsKey((Object)"payway") && ((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getPayway() != null) {
                        merchantApplyRangeDetail.setPayway(((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getPayway());
                    }
                    if (!merchantApplyRangeDetail.containsKey((Object)"exchangeratetype") && ((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getExchangeratetype() != null) {
                        merchantApplyRangeDetail.setExchangeratetype(((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getExchangeratetype());
                    }
                } else if (merchantApplyRangeDetail.getStopstatus() == null) {
                    merchantApplyRangeDetail.setStopstatus(Boolean.valueOf(false));
                }
            }
        }
    }

    public <T extends BizObject> void merchantChildDataPreprocessing(List<T> bizObjectList, EntityStatus entityStatus) {
        if (!CollectionUtils.isEmpty(bizObjectList)) {
            for (BizObject bizObject : bizObjectList) {
                this.merchantChildDataPreprocessing(bizObject, entityStatus);
            }
        }
    }

    public <T extends BizObject> void childStatusExtend(Merchant merchant) {
        if (merchant != null && merchant.getEntityStatus() == EntityStatus.Update && merchant.getId() != null) {
            this.childStatusExtend(merchant.merchantAddressInfos(), (Long)merchant.getId(), "aa.merchant.AddressInfo");
            this.childStatusExtend(merchant.merchantContacterInfos(), (Long)merchant.getId(), "aa.merchant.Contacter");
            this.childStatusExtend(merchant.merchantAgentFinancialInfos(), (Long)merchant.getId(), "aa.merchant.AgentFinancial");
            this.childStatusExtend(merchant.merchantAgentInvoiceInfos(), (Long)merchant.getId(), "aa.merchant.AgentInvoice");
        }
    }

    public <T extends BizObject> void childStatusExtend(List<T> bizObjectList, Long merchantId, String entityName) {
        if (!CollectionUtils.isEmpty(bizObjectList)) {
            ArrayList<String> sourceUniqueList = new ArrayList<String>();
            HashMap<String, BizObject> bizObjectMap = new HashMap<String, BizObject>();
            for (BizObject bizObject : bizObjectList) {
                if (bizObject.get("id") != null || bizObject.get(MerchantOpenApiUtils.SOURCE_UNIQUE) == null) continue;
                sourceUniqueList.add(bizObject.get(MerchantOpenApiUtils.SOURCE_UNIQUE).toString());
                bizObjectMap.put(bizObject.get(MerchantOpenApiUtils.SOURCE_UNIQUE).toString(), bizObject);
            }
            if (!CollectionUtils.isEmpty(sourceUniqueList)) {
                QueryConditionGroup conditionGroup = new QueryConditionGroup();
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"erpCode").in(sourceUniqueList));
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantId").eq((Object)merchantId));
                QuerySchema schema = QuerySchema.create().addSelect("id,erpCode").addCondition((ConditionExpression)conditionGroup);
                List queryMap = this.billQueryRepository.queryMapBySchema(entityName, schema);
                if (!CollectionUtils.isEmpty((Collection)queryMap)) {
                    for (Map query : queryMap) {
                        if (query == null || query.get("id") == null || query.get("erpCode") == null) continue;
                        Long id = Long.valueOf(query.get("id").toString());
                        String sourceUnique = query.get("erpCode").toString();
                        if (bizObjectMap.get(sourceUnique) == null) continue;
                        ((BizObject)bizObjectMap.get(sourceUnique)).set("id", (Object)id);
                        if (((BizObject)bizObjectMap.get(sourceUnique)).getEntityStatus() == EntityStatus.Delete) continue;
                        ((BizObject)bizObjectMap.get(sourceUnique)).setEntityStatus(EntityStatus.Update);
                    }
                }
            }
        }
    }

    public <T extends BizObject> void merchantChildDataPreprocessing(T bizObject, EntityStatus entityStatus) {
        if (!CollectionUtils.isEmpty(bizObject)) {
            if (EntityStatus.Insert == entityStatus) {
                bizObject.setEntityStatus(EntityStatus.Insert);
            } else if (EntityStatus.Update == entityStatus) {
                if (bizObject.containsKey((Object)"entityStatus")) {
                    if ("Insert".equals(bizObject.get("entityStatus").toString())) {
                        bizObject.setEntityStatus(EntityStatus.Insert);
                    } else if ("Update".equals(bizObject.get("entityStatus").toString())) {
                        bizObject.setEntityStatus(EntityStatus.Update);
                    } else if ("Delete".equals(bizObject.get("entityStatus").toString())) {
                        bizObject.setEntityStatus(EntityStatus.Delete);
                    }
                }
                if (bizObject.getEntityStatus() == null) {
                    if (bizObject.getId() != null) {
                        bizObject.setEntityStatus(EntityStatus.Update);
                    } else {
                        bizObject.setEntityStatus(EntityStatus.Insert);
                    }
                } else if (bizObject.getEntityStatus() == EntityStatus.Update || bizObject.getEntityStatus() == EntityStatus.Delete || bizObject.getEntityStatus() == EntityStatus.Unchanged) {
                    if (bizObject.getId() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801137);
                    }
                } else if (bizObject.getEntityStatus() == EntityStatus.Insert && bizObject.getId() == null) {
                    bizObject.setId((Object)IdManager.getInstance().nextId());
                }
            }
        }
    }

    public void merchantCheckFromApi(Merchant merchant, Boolean singleOrg, LoginUser currentUser) throws Exception {
        UserType userType = currentUser.getUserType();
        if (singleOrg.booleanValue()) {
            if (userType == UserType.ShopAdminUser || userType == UserType.ShopUser) {
                merchant.setCreateOrg((String)AppContext.getCurrentUser().get("singleOrgId"));
                merchant.setCreateMerchant(Long.valueOf((String)AppContext.getCurrentUser().get("singleOrgId")));
            } else {
                merchant.setMerchantApplyRanges(null);
            }
        } else {
            if (StringUtils.isEmpty((CharSequence)merchant.getCreateOrg())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800975);
            }
            List<String> orgIdList = this.iupcControlRuleService.getManageOrgList("aa.merchant.Merchant", "aa_merchant");
            if (CollectionUtils.isEmpty(orgIdList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800388);
            }
            if (!orgIdList.contains(merchant.getCreateOrg())) {
                String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_18923E1405B80015", (String)"\u5ba2\u6237\u6863\u6848\u6ca1\u6709\u5f53\u524d\u7ba1\u7406\u7ec4\u7ec7[%s]\u7684\u7ec4\u7ec7\u6743\u9650\u6216\u8be5\u7ba1\u7406\u7ec4\u7ec7\u6ca1\u6709\u6863\u6848\u7ba1\u7406\u6743\uff0c\u8bf7\u68c0\u67e5\u5206\u7ea7\u7ba1\u63a7\u662f\u5426\u5f00\u542f\u6863\u6848\u7ba1\u7406\u6743\uff01"), merchant.getCreateOrg());
                throw new CoreDocBusinessException(null, str);
            }
        }
        if (StringUtils.isEmpty((CharSequence)merchant.getCode())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800976);
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"internalOrg") && merchant.getInternalOrg().booleanValue() && StringUtils.isEmpty((CharSequence)merchant.getInternalOrgId())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800977);
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"belongOrg_code")) {
            List funcOrgesByCode = new ArrayList();
            ArrayList<String> orgCodeList = new ArrayList<String>();
            orgCodeList.add((String)merchant.get("belongOrg_code"));
            funcOrgesByCode = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andCodeIn(orgCodeList).withEnabled());
            if (!CollectionUtils.isEmpty(funcOrgesByCode)) {
                merchant.put("belongOrg", (Object)((OrgUnitDTO)funcOrgesByCode.get(0)).getId());
            }
        }
    }

    public void merchantApplyRangeCheckFromApi(Merchant merchant) throws Exception {
        List merchantApplyRangeList = merchant.merchantApplyRanges();
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            List funcOrgesByCodeList;
            ArrayList<String> merchantApplyRangeOrgIdList = new ArrayList<String>();
            ArrayList<String> merchantApplyRangeOrgCodeList = new ArrayList<String>();
            for (Object merchantApplyRange : merchantApplyRangeList) {
                if (merchantApplyRange.getOrgId() != null) {
                    merchantApplyRangeOrgIdList.add(merchantApplyRange.getOrgId());
                    continue;
                }
                if (merchantApplyRange.get("orgId_code") == null) continue;
                merchantApplyRangeOrgCodeList.add((String)merchantApplyRange.get("orgId_code"));
            }
            if (!CollectionUtils.isEmpty(merchantApplyRangeOrgCodeList) && !CollectionUtils.isEmpty((Collection)(funcOrgesByCodeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andCodeIn(merchantApplyRangeOrgCodeList).withEnabled())))) {
                for (Object orgUnitDTO : funcOrgesByCodeList) {
                    merchantApplyRangeOrgIdList.add(orgUnitDTO.getId());
                }
            }
            if (CollectionUtils.isEmpty(merchantApplyRangeOrgIdList)) {
                return;
            }
            Set orgRangeShareSet = this.orgPermissionsService.getShareOrgDetailByManageOrg4BillDate("aa.merchant.Merchant", merchant.getCreateOrg(), (BizObject)merchant);
            if (null == orgRangeShareSet || orgRangeShareSet.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800371, new Object[]{merchant.getCode(), merchant.get("createOrg_code")});
            }
            HashMap<String, String> orgRangeShareMap = new HashMap<String, String>();
            for (Object orgRangeShareId : orgRangeShareSet) {
                orgRangeShareMap.put((String)orgRangeShareId, "orgId");
            }
            ArrayList<String> subtractList = new ArrayList<String>();
            for (String merchantApplyRangeOrgId : merchantApplyRangeOrgIdList) {
                if ("orgId".equals(orgRangeShareMap.get(merchantApplyRangeOrgId))) continue;
                subtractList.add(merchantApplyRangeOrgId);
            }
            if (!subtractList.isEmpty()) {
                ArrayList<Integer> statusList = new ArrayList<Integer>();
                statusList.add(0);
                statusList.add(1);
                statusList.add(2);
                List funcOrgesByCodeList2 = this.iOrgUnitQueryService.listByIds(AppContext.getYhtTenantId().toString(), subtractList, statusList);
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800372, new Object[]{merchant.getCode(), merchant.get("createOrg_code"), funcOrgesByCodeList2.stream().map(BaseOrgDTO::getCode).collect(Collectors.toList())});
            }
        }
    }

    public void merchantApplyRangeBeforeCheckFromApi(Merchant merchant) throws Exception {
        List merchantApplyRangeList = merchant.merchantApplyRanges();
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            List funcOrgesByCodeList;
            ArrayList<String> merchantApplyRangeOrgIdList = new ArrayList<String>();
            ArrayList<String> merchantApplyRangeOrgCodeList = new ArrayList<String>();
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                if (merchantApplyRange.getOrgId() != null) {
                    merchantApplyRangeOrgIdList.add(merchantApplyRange.getOrgId());
                    continue;
                }
                if (merchantApplyRange.get("orgId_code") == null) continue;
                merchantApplyRangeOrgCodeList.add((String)merchantApplyRange.get("orgId_code"));
            }
            if (!CollectionUtils.isEmpty(merchantApplyRangeOrgCodeList) && !CollectionUtils.isEmpty((Collection)(funcOrgesByCodeList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andCodeIn(merchantApplyRangeOrgCodeList).withEnabled())))) {
                for (OrgUnitDTO orgUnitDTO : funcOrgesByCodeList) {
                    merchantApplyRangeOrgIdList.add(orgUnitDTO.getId());
                }
            }
            if (!CollectionUtils.isEmpty(merchantApplyRangeOrgIdList) && merchant.getEntityStatus() == EntityStatus.Insert && !merchantApplyRangeOrgIdList.contains(merchant.getCreateOrg())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800978);
            }
        }
    }

    public void merchantRoleCheckFromApi(Merchant merchant) throws Exception {
        if (!CollectionUtils.isEmpty((Map)merchant.merchantRole())) {
            QuerySchema querySchemaRole = QuerySchema.create();
            querySchemaRole.addSelect("id,merchantId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
            Map merchantRole = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchemaRole);
            if (merchantRole != null) {
                merchant.merchantRole().setId(merchantRole.get("id"));
                merchant.merchantRole().setEntityStatus(EntityStatus.Update);
            }
        }
    }

    public void setBusinessPartnerId(Merchant merchant) throws Exception {
        String merchantName;
        HashSet<String> changeFieldSet = new HashSet<String>();
        String oldMerchantPartnerId = "";
        Map oldMerchant = new HashMap();
        if (merchant.getEntityStatus() != null && merchant.getEntityStatus() == EntityStatus.Insert && merchant.getBusinessPartner() != null) {
            return;
        }
        if (merchant.getEntityStatus() != null && merchant.getEntityStatus() == EntityStatus.Update) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("code,name, creditCode, businessPartner");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
            oldMerchant = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty(oldMerchant) && oldMerchant.get("businessPartner") != null) {
                oldMerchantPartnerId = oldMerchant.get("businessPartner").toString();
                if (oldMerchant.get("businessPartner") != null && merchant.getBusinessPartner() != null && !oldMerchant.get("businessPartner").equals(merchant.getBusinessPartner())) {
                    return;
                }
                if (!merchant.containsKey((Object)"businessPartner")) {
                    merchant.setBusinessPartner(oldMerchantPartnerId);
                }
                if (oldMerchant.get("name") != null && merchant.get("name") != null) {
                    merchantName = this.partnerService.mulLangObjectConvertString(merchant.get("name"), InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale());
                    if (!oldMerchant.get("name").equals(merchantName)) {
                        changeFieldSet.add("name");
                    }
                }
                if (!(oldMerchant.get("creditCode") == null || merchant.containsKey((Object)"creditCode") && oldMerchant.get("creditCode").equals(merchant.getCertificate()))) {
                    changeFieldSet.add("creditCode");
                }
                if (!(oldMerchant.get("code") == null || merchant.containsKey((Object)"code") && oldMerchant.get("code").equals(merchant.getCode()))) {
                    changeFieldSet.add("code");
                }
                if (changeFieldSet.size() == 0) {
                    merchant.setBusinessPartner(oldMerchant.get("businessPartner").toString());
                    return;
                }
            }
        }
        String local = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
        merchantName = this.partnerService.mulLangObjectConvertString(merchant.get("name"), local);
        if (StringUtils.isBlank((CharSequence)merchantName) && !CollectionUtils.isEmpty(oldMerchant) && oldMerchant.get("name") != null) {
            merchantName = oldMerchant.get("name").toString();
        }
        BusinessPartnerInfoQryDTO businessPartnerInfoQryDTO = new BusinessPartnerInfoQryDTO();
        businessPartnerInfoQryDTO.setName(merchantName);
        businessPartnerInfoQryDTO.setCreditCode(merchant.getCreditCode());
        businessPartnerInfoQryDTO.setCode(merchant.getCode());
        businessPartnerInfoQryDTO.setLinkObject("0");
        businessPartnerInfoQryDTO.setPartnerId(merchant.getBusinessPartner());
        businessPartnerInfoQryDTO.setChangeFieldNameSet(changeFieldSet);
        try {
            BusinessPartnerDTO businessPartnerDTO = this.businessPartnerServiceV2.getPartnerIdByNameOrCreditCode(businessPartnerInfoQryDTO);
            if (businessPartnerDTO != null) {
                if (StringUtils.isNotBlank((CharSequence)oldMerchantPartnerId) && !oldMerchantPartnerId.equals(businessPartnerDTO.getId())) {
                    PartnerMerchantComparisonQryDTO partnerMerchantComparisonQryDTO = new PartnerMerchantComparisonQryDTO();
                    partnerMerchantComparisonQryDTO.setPartnerId(oldMerchantPartnerId);
                    partnerMerchantComparisonQryDTO.setMerchantId((Long)merchant.getId());
                    this.iBusinessPartnerService.delMerchantComparison(partnerMerchantComparisonQryDTO);
                }
                merchant.setBusinessPartner(businessPartnerDTO.getId());
            }
        }
        catch (Exception e) {
            log.error("\u4e1a\u52a1\u4f19\u4f34\u540c\u6b65\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800463, new Object[]{e.getMessage()});
        }
    }

    public void checkOnTheWayCustomerApply(Long merchantId) throws Exception {
        if (merchantId != null) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,applyCode,effectStatus,applyType");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"applyCustomer").eq((Object)merchantId)}));
            List customerApplyList = MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApply", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)customerApplyList)) {
                for (CustomerApply customerApply : customerApplyList) {
                    if (customerApply.getEffectStatus() != CustomerEffectStatus.pending) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800979, new Object[]{customerApply.getApplyCode()});
                }
            }
        }
    }

    public void checkCreateOrgGlobalShare(String createOrgId, String createOrgName, String fullName, String billNum) throws Exception {
        if (!this.iupcControlRuleService.checkSingleOrg().booleanValue() && !StringUtils.isEmpty((CharSequence)createOrgId)) {
            List<String> orgIdList = this.iupcControlRuleService.getManageOrgList(fullName, billNum);
            if (CollectionUtils.isEmpty(orgIdList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800980);
            }
            if (!orgIdList.contains(createOrgId)) {
                String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_19B4656004380010", (String)"\u5f53\u524d[%s]\u7ec4\u7ec7\u6ca1\u6709\u6863\u6848\u7ba1\u7406\u6743\uff0c\u65e0\u6cd5\u590d\u5236\u65b0\u589e\uff1b\u5982\u9700\u590d\u5236\uff0c\u8bf7\u5148\u5f00\u542f\u7ec4\u7ec7\u6863\u6848\u7ba1\u7406\u6743\uff01"), createOrgName);
                throw new CoreDocBusinessException(null, str);
            }
        }
    }

    public boolean checkStaffIsSalesman(String professSalesmanId) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("id, name").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)professSalesmanId), QueryCondition.name((String)"biz_man_tag").eq((Object)true), QueryCondition.name((String)"dr").eq((Object)0), QueryCondition.name((String)"enable").eq((Object)1)}));
        List staffList = MetaDaoHelper.queryObject((String)"bd.staff.Staff", (QuerySchema)schema, (String)"ucf-staff-center");
        return !CollectionUtils.isEmpty((Collection)staffList);
    }

    private void checkCustomerArea(Merchant merchant) throws Exception {
        List customerAreaList = merchant.customerAreas();
        if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
            CustomerArea customerArea;
            Iterator customerAreaIterator;
            if (EntityStatus.Insert.equals((Object)merchant.getEntityStatus())) {
                customerAreaIterator = customerAreaList.iterator();
                while (customerAreaIterator.hasNext()) {
                    customerArea = (CustomerArea)customerAreaIterator.next();
                    if (customerArea.getId() == null || customerArea.getSaleAreaId() != null) continue;
                    customerAreaIterator.remove();
                }
            } else if (EntityStatus.Update.equals((Object)merchant.getEntityStatus())) {
                customerAreaIterator = customerAreaList.iterator();
                while (customerAreaIterator.hasNext()) {
                    customerArea = (CustomerArea)customerAreaIterator.next();
                    if (customerArea.getId() != null && customerArea.getSaleAreaId() == null && customerArea.getEntityStatus() == EntityStatus.Update) {
                        customerArea.setEntityStatus(EntityStatus.Delete);
                        continue;
                    }
                    if (customerArea.getId() == null || customerArea.getSaleAreaId() != null || customerArea.getEntityStatus() != EntityStatus.Insert) continue;
                    customerAreaIterator.remove();
                }
            }
            if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
                int isDefaultNum = 0;
                Long merchantApplyRangeId = null;
                ArrayList<Long> idList = new ArrayList<Long>();
                for (CustomerArea customerArea2 : customerAreaList) {
                    if (customerArea2.getIsDefault() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800455);
                    }
                    if (customerArea2.getId() != null) {
                        idList.add((Long)customerArea2.getId());
                    }
                    if (merchantApplyRangeId == null) {
                        merchantApplyRangeId = customerArea2.getmerchantApplyRangeId();
                    }
                    if (!customerArea2.getIsDefault().booleanValue() || customerArea2.getEntityStatus() == EntityStatus.Delete) continue;
                    ++isDefaultNum;
                }
                if (merchant.getEntityStatus() == EntityStatus.Update && merchant.getId() != null) {
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1)});
                    if (!CollectionUtils.isEmpty(idList)) {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_in(idList));
                    }
                    if (merchant.get("merchantApplyRangeId") != null) {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId").eq((Object)Long.valueOf(merchant.get("merchantApplyRangeId").toString())));
                    } else if (merchantApplyRangeId != null) {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId));
                    } else {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true));
                    }
                    querySchema.addCondition((ConditionExpression)queryConditionGroup);
                    List customerAreaInDbDefaultList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)customerAreaInDbDefaultList)) {
                        isDefaultNum += customerAreaInDbDefaultList.size();
                    }
                }
                if (isDefaultNum > 1) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800981);
                }
            }
        }
    }

    private void checkPrincipal(Merchant merchant) throws Exception {
        List principalList = merchant.principals();
        if (!CollectionUtils.isEmpty((Collection)principalList)) {
            Principal principal;
            Iterator principalIterator;
            if (EntityStatus.Insert.equals((Object)merchant.getEntityStatus())) {
                principalIterator = principalList.iterator();
                while (principalIterator.hasNext()) {
                    principal = (Principal)principalIterator.next();
                    if (principal.getId() == null || principal.getProfessSalesman() != null || principal.getSpecialManagementDep() != null) continue;
                    principalIterator.remove();
                }
            } else if (EntityStatus.Update.equals((Object)merchant.getEntityStatus())) {
                principalIterator = principalList.iterator();
                while (principalIterator.hasNext()) {
                    principal = (Principal)principalIterator.next();
                    if (principal.getId() != null && principal.getProfessSalesman() == null && principal.getSpecialManagementDep() == null && principal.getEntityStatus() == EntityStatus.Update) {
                        principal.setEntityStatus(EntityStatus.Delete);
                        continue;
                    }
                    if (principal.getId() == null || principal.getProfessSalesman() != null || principal.getSpecialManagementDep() != null || principal.getEntityStatus() != EntityStatus.Insert) continue;
                    principalIterator.remove();
                }
            }
            if (!CollectionUtils.isEmpty((Collection)principalList)) {
                int isDefaultNum = 0;
                ArrayList<Long> idList = new ArrayList<Long>();
                Long merchantApplyRangeId = null;
                for (Principal principal2 : principalList) {
                    if (principal2.getIsDefault() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800456);
                    }
                    if (principal2.getId() != null) {
                        idList.add((Long)principal2.getId());
                    }
                    if (merchantApplyRangeId == null) {
                        merchantApplyRangeId = principal2.getMerchantApplyRangeId();
                    }
                    if (!principal2.getIsDefault().booleanValue() || principal2.getEntityStatus() == EntityStatus.Delete) continue;
                    ++isDefaultNum;
                }
                if (merchant.getEntityStatus() == EntityStatus.Update && merchant.getId() != null) {
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1)});
                    if (!CollectionUtils.isEmpty(idList)) {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_in(idList));
                    }
                    if (merchant.get("merchantApplyRangeId") != null) {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId").eq((Object)Long.valueOf(merchant.get("merchantApplyRangeId").toString())));
                    } else if (merchantApplyRangeId != null) {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId));
                    } else {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true));
                    }
                    querySchema.addCondition((ConditionExpression)queryConditionGroup);
                    List principalInDbDefaultList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)principalInDbDefaultList)) {
                        isDefaultNum += principalInDbDefaultList.size();
                    }
                }
                if (isDefaultNum > 1) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800982);
                }
            }
        }
    }

    private void checkInvoicingCustomers(Merchant merchant) throws Exception {
        List invoicingCustomersList = merchant.invoicingCustomerss();
        if (!CollectionUtils.isEmpty((Collection)invoicingCustomersList)) {
            InvoicingCustomers invoicingCustomers;
            Iterator invoicingCustomersIterator;
            if (EntityStatus.Insert.equals((Object)merchant.getEntityStatus())) {
                invoicingCustomersIterator = invoicingCustomersList.iterator();
                while (invoicingCustomersIterator.hasNext()) {
                    invoicingCustomers = (InvoicingCustomers)invoicingCustomersIterator.next();
                    if (invoicingCustomers.getId() == null || invoicingCustomers.getInvoicingCustomersId() != null) continue;
                    invoicingCustomersIterator.remove();
                }
            } else if (EntityStatus.Update.equals((Object)merchant.getEntityStatus())) {
                invoicingCustomersIterator = invoicingCustomersList.iterator();
                while (invoicingCustomersIterator.hasNext()) {
                    invoicingCustomers = (InvoicingCustomers)invoicingCustomersIterator.next();
                    if (invoicingCustomers.getId() != null && invoicingCustomers.getInvoicingCustomersId() == null && invoicingCustomers.getEntityStatus() == EntityStatus.Update) {
                        invoicingCustomers.setEntityStatus(EntityStatus.Delete);
                        continue;
                    }
                    if (invoicingCustomers.getId() == null || invoicingCustomers.getInvoicingCustomersId() != null || invoicingCustomers.getEntityStatus() != EntityStatus.Insert) continue;
                    invoicingCustomersIterator.remove();
                }
            }
            if (!CollectionUtils.isEmpty((Collection)invoicingCustomersList)) {
                int isDefaultNum = 0;
                ArrayList<Long> idList = new ArrayList<Long>();
                Long merchantApplyRangeId = null;
                for (InvoicingCustomers invoicingCustomers2 : invoicingCustomersList) {
                    if (invoicingCustomers2.getIsDefault() == null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800457);
                    }
                    if (invoicingCustomers2.getId() != null) {
                        idList.add((Long)invoicingCustomers2.getId());
                    }
                    if (merchantApplyRangeId == null) {
                        merchantApplyRangeId = invoicingCustomers2.getMerchantApplyRangeId();
                    }
                    if (!invoicingCustomers2.getIsDefault().booleanValue() || invoicingCustomers2.getEntityStatus() == EntityStatus.Delete) continue;
                    ++isDefaultNum;
                }
                if (merchant.getEntityStatus() == EntityStatus.Update && merchant.getId() != null) {
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("id");
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1)});
                    if (!CollectionUtils.isEmpty(idList)) {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_in(idList));
                    }
                    if (merchant.get("merchantApplyRangeId") != null) {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId").eq((Object)Long.valueOf(merchant.get("merchantApplyRangeId").toString())));
                    } else if (merchantApplyRangeId != null) {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId));
                    } else {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"merchantApplyRangeId.isCreator").eq((Object)true));
                    }
                    querySchema.addCondition((ConditionExpression)queryConditionGroup);
                    List invoicingCustomerInDbDefaultList = MetaDaoHelper.queryObject((String)"aa.merchant.InvoicingCustomers", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)invoicingCustomerInDbDefaultList)) {
                        isDefaultNum += invoicingCustomerInDbDefaultList.size();
                    }
                }
                if (isDefaultNum > 1) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800983);
                }
            }
        }
    }

    public void checkMustInput(Merchant merchant) {
        this.checkMustInputForMerchant(merchant);
        this.checkMustInputForMerchantApplyRangeDetail(merchant);
        this.checkMustInputForMerchantRoleInfo(merchant);
        this.checkMustInputForAddressInfo(merchant);
        this.checkMustInputForContacter(merchant);
        this.checkMustInputForAgentInvoice(merchant);
        this.checkMustInputForAgentFinancial(merchant);
        this.checkMustInputForQualificationDocument(merchant);
    }

    public void checkMustInputForMerchant(Merchant merchant) {
        if (StringUtils.isEmpty((CharSequence)merchant.getCreateOrg())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800984);
        }
        if (StringUtils.isEmpty((CharSequence)merchant.getCode())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800985);
        }
        Object merchantLocaleNameObject = MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)merchant, null);
        if (merchantLocaleNameObject == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800404);
        }
        if (merchant.getTaxPayingCategories() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800986);
        }
        if (merchant.getEnterpriseNature() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800987);
        }
    }

    public void checkMustInputForMerchantApplyRangeDetail(Merchant merchant) {
        List merchantApplyRangeDetailList = merchant.merchantAppliedDetail();
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList)) {
            for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                if (!StringUtils.isEmpty((CharSequence)merchantApplyRangeDetail.getIsTradeCustomers())) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800988);
            }
        }
    }

    public void checkMustInputForMerchantRoleInfo(Merchant merchant) {
        MerchantRoleInfo merchantRoleInfo = merchant.merchantRole();
        if (!CollectionUtils.isEmpty((Map)merchantRoleInfo) && merchantRoleInfo.getMerchantOptions() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800989);
        }
    }

    public void checkMustInputForAddressInfo(Merchant merchant) {
        List addressInfoList = merchant.merchantAddressInfos();
        if (!CollectionUtils.isEmpty((Collection)addressInfoList)) {
            for (AddressInfo addressInfo : addressInfoList) {
                if (!MerchantUtils.isExists((Map)addressInfo, (String)"addressCode")) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800990);
                }
                addressInfo.setAddressCode(addressInfo.get("addressCode").toString());
                if (StringUtils.isEmpty((CharSequence)addressInfo.getAddress())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800991);
                }
                if (addressInfo.getIsDefault() != null) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800992);
            }
        }
    }

    public void checkMustInputForContacter(Merchant merchant) {
        List contacterList = merchant.merchantContacterInfos();
        if (!CollectionUtils.isEmpty((Collection)contacterList)) {
            for (Contacter contacter : contacterList) {
                Object fullNameObject = MultilangUtil.getAttr((String)"aa.merchant.Contacter", (String)"fullName", (BizObject)contacter, null);
                if (fullNameObject == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800993);
                }
                if (contacter.getIsDefault() != null) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800994);
            }
        }
    }

    public void checkMustInputForAgentFinancial(Merchant merchant) {
        List agentFinancialList = merchant.merchantAgentFinancialInfos();
        if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
            for (AgentFinancial agentFinancial : agentFinancialList) {
                if (StringUtils.isEmpty((CharSequence)agentFinancial.getCurrency())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800995);
                }
                if (agentFinancial.getAccountType() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800996);
                }
                if (StringUtils.isEmpty((CharSequence)agentFinancial.getBank())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800997);
                }
                if (StringUtils.isEmpty((CharSequence)agentFinancial.getOpenBank())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800998);
                }
                if (StringUtils.isEmpty((CharSequence)agentFinancial.getBankAccount())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800999);
                }
                Object bankAccountNameObject = MultilangUtil.getAttr((String)"aa.merchant.AgentFinancial", (String)"bankAccountName", (BizObject)agentFinancial, null);
                if (bankAccountNameObject == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801000);
                }
                if (agentFinancial.getIsDefault() != null) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801001);
            }
        }
    }

    private void checkMustInputForAgentInvoice(Merchant merchant) {
        List agentInvoiceList = merchant.merchantAgentInvoiceInfos();
        if (!CollectionUtils.isEmpty((Collection)agentInvoiceList)) {
            for (AgentInvoice agentInvoice : agentInvoiceList) {
                if (StringUtils.isEmpty((CharSequence)agentInvoice.getTitle())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801002);
                }
                if (agentInvoice.getIsDefault() != null) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801003);
            }
        }
    }

    private void checkMustInputForQualificationDocument(Merchant merchant) {
        List merchantQualificationDocumentList = merchant.merchantQualificationDocuments();
        if (!CollectionUtils.isEmpty((Collection)merchantQualificationDocumentList)) {
            for (MerchantQualificationDocument merchantQualificationDocument : merchantQualificationDocumentList) {
                if (merchantQualificationDocument.getEntityStatus() == EntityStatus.Delete) continue;
                if (merchantQualificationDocument.getLicenseName() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801004);
                }
                if (!StringUtils.isEmpty((CharSequence)merchantQualificationDocument.getAttachment())) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801005);
            }
        }
    }

    private void checkMerchantAddress(Merchant merchant) throws Exception {
        this.checkAddressCodeForAddress(merchant);
        this.checkIsDefaultForAddress(merchant);
        this.checkStopStatusForAddress(merchant);
        this.checkRegionCodeForAddress(merchant);
    }

    private void checkAddressCodeForAddress(Merchant merchant) throws Exception {
        List addressInfoList = merchant.merchantAddressInfos();
        if (!CollectionUtils.isEmpty((Collection)addressInfoList)) {
            HashSet<String> addressCodeSet = new HashSet<String>();
            ArrayList<Long> addressIdForaddressCodeSetList = new ArrayList<Long>();
            for (AddressInfo addressInfo : addressInfoList) {
                if (addressInfo.getEntityStatus() != EntityStatus.Delete && addressInfo.getAddressCode() != null && addressCodeSet.contains(addressInfo.getAddressCode())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801006);
                }
                if (addressInfo.getEntityStatus() != EntityStatus.Delete && addressInfo.getAddressCode() != null) {
                    addressCodeSet.add(addressInfo.getAddressCode());
                }
                if (addressInfo.getId() == null || addressInfo.getAddressCode() == null && addressInfo.getEntityStatus() != EntityStatus.Delete) continue;
                addressIdForaddressCodeSetList.add((Long)addressInfo.getId());
            }
            if (merchant.getEntityStatus() == EntityStatus.Update && !CollectionUtils.isEmpty(addressIdForaddressCodeSetList) && merchant.getId() != null) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("addressCode");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_in(addressIdForaddressCodeSetList), QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
                List addressInfoFromDbList = MetaDaoHelper.queryObject((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)addressInfoFromDbList)) {
                    for (AddressInfo addressInfoFromDb : addressInfoFromDbList) {
                        if (addressCodeSet.contains(addressInfoFromDb.getAddressCode())) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801006);
                        }
                        addressCodeSet.add(addressInfoFromDb.getAddressCode());
                    }
                }
            }
        }
    }

    private void checkIsDefaultForAddress(Merchant merchant) throws Exception {
        List addressInfoList = merchant.merchantAddressInfos();
        if (!CollectionUtils.isEmpty((Collection)addressInfoList)) {
            boolean merchantNeedDefaultAddress;
            int isDefaultNum = 0;
            ArrayList<Long> IdList = new ArrayList<Long>();
            for (AddressInfo addressInfo : addressInfoList) {
                if (addressInfo.getId() != null) {
                    IdList.add((Long)addressInfo.getId());
                }
                if (addressInfo.getIsDefault() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800992);
                }
                if (!addressInfo.getIsDefault().booleanValue() || addressInfo.getEntityStatus() == EntityStatus.Delete) continue;
                ++isDefaultNum;
            }
            if (merchant.getEntityStatus() == EntityStatus.Update && merchant.getId() != null) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1)});
                if (!CollectionUtils.isEmpty(IdList)) {
                    queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_in(IdList));
                }
                querySchema.addCondition((ConditionExpression)queryConditionGroup);
                List addressInfoInDbDefaultList = MetaDaoHelper.queryObject((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)addressInfoInDbDefaultList)) {
                    isDefaultNum += addressInfoInDbDefaultList.size();
                }
            }
            if ((merchantNeedDefaultAddress = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultAddress")) && isDefaultNum != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800426, new Object[]{merchant.getCode()});
            }
            if (!merchantNeedDefaultAddress && isDefaultNum > 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800426, new Object[]{merchant.getCode()});
            }
        }
    }

    public void checkStopStatusForAddress(Merchant merchant) throws Exception {
        List addressInfoList = merchant.merchantAddressInfos();
        if (!CollectionUtils.isEmpty((Collection)addressInfoList)) {
            boolean isDefault = false;
            for (AddressInfo addressInfo : addressInfoList) {
                if (addressInfo.getEntityStatus() == EntityStatus.Insert && StringUtils.isEmpty((CharSequence)addressInfo.getStopStatus())) {
                    addressInfo.setStopStatus(StopStatusChar.unStop);
                }
                if (addressInfo.getEntityStatus() == EntityStatus.Delete || addressInfo.getIsDefault() == null || !addressInfo.getIsDefault().booleanValue()) continue;
                isDefault = true;
                if (!StopStatusChar.stop.getValue().equals(addressInfo.getStopStatus())) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800459);
            }
            if (!isDefault) {
                for (AddressInfo addressInfo : addressInfoList) {
                    if (addressInfo.getEntityStatus() != EntityStatus.Update || !StopStatusChar.stop.getValue().equals(addressInfo.getStopStatus()) || addressInfo.getIsDefault() != null) continue;
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("isDefault");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(addressInfo.getId())}));
                    List originalAddressInfoList = MetaDaoHelper.queryObject((String)"aa.merchant.AddressInfo", (QuerySchema)querySchema, null);
                    if (CollectionUtils.isEmpty((Collection)originalAddressInfoList) || !((AddressInfo)originalAddressInfoList.get(0)).getIsDefault().booleanValue()) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800459);
                }
            }
        }
    }

    public void checkRegionCodeForAddress(Merchant merchant) throws Exception {
        List addressInfoList = merchant.merchantAddressInfos();
        if (!CollectionUtils.isEmpty((Collection)addressInfoList)) {
            for (AddressInfo addressInfo : addressInfoList) {
                if (addressInfo.getEntityStatus() == EntityStatus.Delete) continue;
                this.checkAddressInfoRegionCode(addressInfo);
            }
        }
    }

    public void checkMerchantContact(Merchant merchant) throws Exception {
        this.checkStopStatusForContact(merchant);
        this.checkIsDefaultForContact(merchant);
    }

    public void checkIsDefaultForContact(Merchant merchant) throws Exception {
        List contacterList = merchant.merchantContacterInfos();
        if (!CollectionUtils.isEmpty((Collection)contacterList)) {
            boolean merchantNeedDefaultContact;
            ArrayList<Long> contacterIdList = new ArrayList<Long>();
            int isDefaultNum = 0;
            for (Contacter contacter : contacterList) {
                if (contacter.getIsDefault() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800994);
                }
                if (contacter.getIsDefault().booleanValue() && contacter.getEntityStatus() != EntityStatus.Delete) {
                    ++isDefaultNum;
                }
                contacterIdList.add((Long)contacter.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1), QueryCondition.name((String)"id").not_in(contacterIdList)}));
            List contacterInDbDefaultList = MetaDaoHelper.queryObject((String)"aa.merchant.Contacter", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)contacterInDbDefaultList)) {
                isDefaultNum += contacterInDbDefaultList.size();
            }
            if ((merchantNeedDefaultContact = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultContact")) && isDefaultNum != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800429, new Object[]{merchant.getCode()});
            }
            if (!merchantNeedDefaultContact && isDefaultNum > 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800429, new Object[]{merchant.getCode()});
            }
        }
    }

    public void checkStopStatusForContact(Merchant merchant) throws Exception {
        List contacterList = merchant.merchantContacterInfos();
        if (!CollectionUtils.isEmpty((Collection)contacterList)) {
            for (Contacter contacter : contacterList) {
                if (contacter.getEntityStatus() != EntityStatus.Insert || !contacter.containsKey((Object)"stopStatus") || !StringUtils.isEmpty((CharSequence)contacter.getStopStatus())) continue;
                contacter.setStopStatus(StopStatusChar.unStop);
            }
        }
    }

    public void checkMerchantAgentFinancial(Merchant merchant) throws Exception {
        this.checkIsDefaultForAgentFinancial(merchant);
        this.checkUniqueForAgentFinancial(merchant);
        this.checkBankAccountForAgentFinancial(merchant);
    }

    public void checkIsDefaultForAgentFinancial(Merchant merchant) throws Exception {
        List agentFinancialList = merchant.merchantAgentFinancialInfos();
        if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
            boolean merchantNeedDefaultBank;
            ArrayList<Long> agentFinancialIdList = new ArrayList<Long>();
            int isDefaultNum = 0;
            for (AgentFinancial agentFinancial : agentFinancialList) {
                if (agentFinancial.getIsDefault() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801001);
                }
                if (agentFinancial.getIsDefault().booleanValue() && agentFinancial.getEntityStatus() != EntityStatus.Delete) {
                    ++isDefaultNum;
                }
                agentFinancialIdList.add((Long)agentFinancial.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1), QueryCondition.name((String)"id").not_in(agentFinancialIdList)}));
            List agentFinancialInDbDefaultList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)agentFinancialInDbDefaultList)) {
                isDefaultNum += agentFinancialInDbDefaultList.size();
            }
            if ((merchantNeedDefaultBank = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultBank")) && isDefaultNum != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800431, new Object[]{merchant.getCode()});
            }
            if (!merchantNeedDefaultBank && isDefaultNum > 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800431, new Object[]{merchant.getCode()});
            }
        }
    }

    public void checkUniqueForAgentFinancial(Merchant merchant) throws Exception {
        List agentFinancialList = merchant.merchantAgentFinancialInfos();
        if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
            int i = 0;
            HashSet<AgentFinancial> agentFinancialSetList = new HashSet<AgentFinancial>();
            ArrayList<Long> agentFinancialIdList = new ArrayList<Long>();
            for (AgentFinancial agentFinancial : agentFinancialList) {
                if (!StringUtils.isEmpty((CharSequence)agentFinancial.getBankAccount())) {
                    agentFinancial.setBankAccount(agentFinancial.getBankAccount().replace(" ", ""));
                }
                if (agentFinancial.getEntityStatus() != EntityStatus.Delete) {
                    AgentFinancial agentFinancialSet = new AgentFinancial();
                    agentFinancialSet.setCurrency(agentFinancial.getCurrency());
                    agentFinancialSet.setBank(agentFinancial.getBank());
                    agentFinancialSet.setBankAccount(agentFinancial.getBankAccount());
                    agentFinancialSet.setOpenBank(agentFinancial.getOpenBank());
                    agentFinancialSetList.add(agentFinancialSet);
                    ++i;
                }
                if (agentFinancial.getId() == null) continue;
                agentFinancialIdList.add((Long)agentFinancial.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("currency,bank,bankAccount,openBank");
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())});
            if (!CollectionUtils.isEmpty(agentFinancialIdList)) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_in(agentFinancialIdList));
            }
            querySchema.addCondition((ConditionExpression)queryConditionGroup);
            List agentFinancialSQLList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentFinancial", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)agentFinancialSQLList)) {
                for (AgentFinancial agentFinancialSQL : agentFinancialSQLList) {
                    AgentFinancial agentFinancialSet = new AgentFinancial();
                    agentFinancialSet.setCurrency(agentFinancialSQL.getCurrency());
                    agentFinancialSet.setBank(agentFinancialSQL.getBank());
                    agentFinancialSet.setBankAccount(agentFinancialSQL.getBankAccount());
                    agentFinancialSet.setOpenBank(agentFinancialSQL.getOpenBank());
                    agentFinancialSetList.add(agentFinancialSet);
                }
                i += agentFinancialSQLList.size();
            }
            if (agentFinancialSetList.size() != i) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800454, new Object[]{merchant.getCode()});
            }
        }
    }

    public void checkBankAccountForAgentFinancial(Merchant merchant) throws Exception {
        List agentFinancialList = merchant.merchantAgentFinancialInfos();
        if (!CollectionUtils.isEmpty((Collection)agentFinancialList)) {
            for (AgentFinancial agentFinancial : agentFinancialList) {
                if (agentFinancial.getEntityStatus() == EntityStatus.Delete || agentFinancial.getBankAccount() == null) continue;
                String bankAccount = agentFinancial.getBankAccount();
                if ((bankAccount = bankAccount.replace("\uffe5", "")) == null || bankAccount.length() <= 0 || bankAccount.matches("^[a-zA-Z\\d./\\\\@\\-_$]*$")) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800464);
            }
        }
    }

    public void checkMerchantAgentInvoice(Merchant merchant) throws Exception {
        this.checkIsDefaultForAgentInvoice(merchant);
    }

    public void checkIsDefaultForAgentInvoice(Merchant merchant) throws Exception {
        List agentInvoicesList = merchant.merchantAgentInvoiceInfos();
        if (!CollectionUtils.isEmpty((Collection)agentInvoicesList)) {
            boolean merchantNeedDefaultBank;
            ArrayList<Long> agentInvoiceIdList = new ArrayList<Long>();
            int isDefaultNum = 0;
            for (AgentInvoice agentInvoice : agentInvoicesList) {
                if (agentInvoice.getIsDefault() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801003);
                }
                if (agentInvoice.getIsDefault().booleanValue() && agentInvoice.getEntityStatus() != EntityStatus.Delete) {
                    ++isDefaultNum;
                }
                agentInvoiceIdList.add((Long)agentInvoice.getId());
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,billingType,title");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isDefault").eq((Object)1), QueryCondition.name((String)"id").not_in(agentInvoiceIdList)}));
            List agentInvoiceInDbDefaultList = MetaDaoHelper.queryObject((String)"aa.merchant.AgentInvoice", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)agentInvoiceInDbDefaultList)) {
                isDefaultNum += agentInvoiceInDbDefaultList.size();
            }
            if ((merchantNeedDefaultBank = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultInvoice")) && isDefaultNum != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800434, new Object[]{merchant.getCode()});
            }
            if (!merchantNeedDefaultBank && isDefaultNum > 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800434, new Object[]{merchant.getCode()});
            }
        }
    }

    public void checkMerchantApplyRange(Merchant merchant) throws Exception {
        this.checkOrgIdForMerchantApplyRange(merchant);
    }

    public void checkOrgIdForMerchantApplyRange(Merchant merchant) throws Exception {
        List merchantApplyRangeList = merchant.merchantApplyRanges();
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList) && !StringUtils.isEmpty((CharSequence)merchant.getCreateOrg()) && merchant.getEntityStatus() == EntityStatus.Insert) {
            boolean isCreater = false;
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                if (StringUtils.isEmpty((CharSequence)merchantApplyRange.getOrgId())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801007);
                }
                if (!merchantApplyRange.getOrgId().equals(merchant.getCreateOrg())) continue;
                isCreater = true;
            }
            if (!isCreater) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801008);
            }
        } else if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList) && merchant.getEntityStatus() == EntityStatus.Insert) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801009);
        }
    }

    public void checkPath(Merchant merchant) throws Exception {
        if (EntityStatus.Update == merchant.getEntityStatus() && MerchantUtils.isExists((Map)merchant, (String)"parentCustomer")) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("parentCustomer,path");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
            Map merchantSql = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Map)merchantSql) && !merchant.getParentCustomer().equals(merchantSql.get("parentCustomer"))) {
                querySchema = QuerySchema.create();
                querySchema.addSelect("path");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchant.getParentCustomer())}));
                final String requestId = UUID.randomUUID().toString();
                final String lockKey = merchant.getParentCustomer() < Long.parseLong(merchant.getId().toString()) ? "merchantParentCustomer_" + AppContext.getYhtTenantId() + "_" + merchant.getId() + merchant.getParentCustomer() : "merchantParentCustomer_" + AppContext.getYhtTenantId() + "_" + merchant.getParentCustomer() + merchant.getId();
                int tryLockNum = 0;
                while (true) {
                    if (tryLockNum > 60) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800032);
                    }
                    ++tryLockNum;
                    if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)10)) {
                        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                            public void afterCompletion(int status) {
                                RedisTool.releaseLock((String)lockKey, (String)requestId);
                            }
                        });
                        List parentMerchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
                        if (CollectionUtils.isEmpty((Collection)parentMerchantList) || merchant.getId() == null) break;
                        this.theClosedLoopCheck(merchant, ((Merchant)parentMerchantList.get(0)).getPath());
                        break;
                    }
                    TimeUnit.MILLISECONDS.sleep(200L);
                }
            }
        }
    }

    private void theClosedLoopCheck(Merchant merchant, String parentPath) {
        String[] pathArray = parentPath.split("[|]");
        for (int i = 0; i < pathArray.length; ++i) {
            if (!pathArray[i].equals(merchant.getId().toString())) continue;
            String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080528", (String)"\u8be5\u5ba2\u6237:%s\u7684\u4e0a\u7ea7\u5ba2\u6237,\u5f62\u6210\u95ed\u73af\u8bf7\u68c0\u67e5\u6570\u636e\uff01"), merchant.getCode());
            throw new CoreDocBusinessException(null, str);
        }
    }

    public void checkInternalOrgIdForCustomerApply(Merchant merchant, CustomerApply customerApply) throws Exception {
        if (merchant.getInternalOrg() != null && merchant.getInternalOrg().booleanValue() && !StringUtils.isEmpty((CharSequence)merchant.getInternalOrgId())) {
            Long customerApplyId = 0L;
            if (!CollectionUtils.isEmpty((Map)customerApply)) {
                customerApplyId = (Long)customerApply.getId();
            }
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,applyCode,effectStatus,applyCustomer,customerData,applyType");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"effectStatus").in(new Object[]{String.valueOf(EffectStatus.pending.getValue()), String.valueOf(EffectStatus.dealing.getValue())}), QueryCondition.name((String)"id").not_eq((Object)customerApplyId)}));
            List originalDataBaseCustomerApplyList = MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApply", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)originalDataBaseCustomerApplyList)) {
                if (merchant.get("internalOrgId_Name") == null) {
                    ArrayList<String> internalOrgIdList = new ArrayList<String>();
                    internalOrgIdList.add(merchant.getInternalOrgId());
                    List orgUnitList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(internalOrgIdList).withEnabled());
                    if (!CollectionUtils.isEmpty((Collection)orgUnitList)) {
                        merchant.set("internalOrgId_Name", (Object)((OrgUnitDTO)orgUnitList.get(0)).toMultiLang().getName().toString());
                    }
                }
                for (CustomerApply originalDataBaseCustomerApply : originalDataBaseCustomerApplyList) {
                    Merchant merchantFromCustomerApply = this.checkInitMerchantFromCustomerApply((Map)JSONObject.parseObject((String)originalDataBaseCustomerApply.getCustomerData(), Map.class));
                    if (originalDataBaseCustomerApply.getApplyType() == CustomerApplyType.add && merchantFromCustomerApply.getInternalOrg() != null && merchantFromCustomerApply.getInternalOrg().booleanValue() && !StringUtils.isEmpty((CharSequence)merchantFromCustomerApply.getInternalOrgId()) && merchant.getInternalOrgId().equals(merchantFromCustomerApply.getInternalOrgId()) && merchant.getCreateOrg().equals(merchantFromCustomerApply.getCreateOrg())) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801010, new Object[]{merchant.get("internalOrgId_Name"), originalDataBaseCustomerApply.getApplyCode()});
                    }
                    if (originalDataBaseCustomerApply.getApplyType() != CustomerApplyType.modify || merchantFromCustomerApply.getInternalOrg() == null || !merchantFromCustomerApply.getInternalOrg().booleanValue() || StringUtils.isEmpty((CharSequence)merchantFromCustomerApply.getInternalOrgId()) || !merchant.getInternalOrgId().equals(merchantFromCustomerApply.getInternalOrgId()) || originalDataBaseCustomerApply.getApplyCustomer().equals(merchant.getId()) || !merchant.getCreateOrg().equals(merchantFromCustomerApply.getCreateOrg())) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801010, new Object[]{merchant.get("internalOrgId_Name"), originalDataBaseCustomerApply.getApplyCode()});
                }
            }
        }
    }

    public void checkParentManageOrgForMerchant(Merchant merchant, LoginUser currentUser, Boolean singleOrg) throws Exception {
        if (!StringUtils.isEmpty((CharSequence)merchant.getParentManageOrg())) {
            if (currentUser.getUserType() == UserType.TenantAdmin || currentUser.getUserType() == UserType.TenantEmployee) {
                if ("666666".equals(merchant.getParentManageOrg())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801011);
                }
                String businessRole = "1";
                if (merchant.merchantRole() != null && merchant.merchantRole().getBusinessRole() != null) {
                    businessRole = merchant.merchantRole().getBusinessRole();
                } else if (merchant.merchantRole() != null && merchant.merchantRole().containsKey((Object)"businessRole") && merchant.merchantRole().getBusinessRole() == null) {
                    businessRole = "1";
                } else if (merchant.getEntityStatus() == EntityStatus.Update) {
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("businessRole");
                    querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
                    List merchantRoleInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)merchantRoleInDbList) && ((MerchantRoleInfo)merchantRoleInDbList.get(0)).getBusinessRole() != null) {
                        businessRole = ((MerchantRoleInfo)merchantRoleInDbList.get(0)).getBusinessRole();
                    }
                }
                if (businessRole != null && (businessRole.contains("3") || businessRole.contains("4") || businessRole.contains("5"))) {
                    boolean isSalesOrgType = this.iFuncTypeQueryService.orgHasFunc(AppContext.getCurrentUser().getYhtTenantId(), merchant.getParentManageOrg(), FuncTypeEnum.SALES_ORG.getCode());
                    boolean isParentManageOrgOfRange = false;
                    if (merchant.getEntityStatus() == EntityStatus.Insert) {
                        if (!CollectionUtils.isEmpty((Collection)merchant.merchantApplyRanges())) {
                            for (MerchantApplyRange merchantApplyRange : merchant.merchantApplyRanges()) {
                                if (!merchant.getParentManageOrg().equals(merchantApplyRange.getOrgId())) continue;
                                isParentManageOrgOfRange = true;
                            }
                        } else {
                            List<String> orgRangeShareList = this.iupcControlRuleService.getOrgRangeShareAll("aa.merchant.Merchant", merchant.getCreateOrg());
                            if (!CollectionUtils.isEmpty(orgRangeShareList) && orgRangeShareList.contains(merchant.getParentManageOrg())) {
                                isParentManageOrgOfRange = true;
                            } else if (CollectionUtils.isEmpty(orgRangeShareList) && merchant.getParentManageOrg().equals(merchant.getCreateOrg())) {
                                isParentManageOrgOfRange = true;
                            }
                        }
                    } else if (merchant.getEntityStatus() == EntityStatus.Update) {
                        if (!CollectionUtils.isEmpty((Collection)merchant.merchantApplyRanges())) {
                            for (MerchantApplyRange merchantApplyRange : merchant.merchantApplyRanges()) {
                                if (!merchant.getParentManageOrg().equals(merchantApplyRange.getOrgId())) continue;
                                isParentManageOrgOfRange = true;
                            }
                        }
                        if (!isParentManageOrgOfRange) {
                            QuerySchema querySchema = QuerySchema.create();
                            querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"orgId").eq((Object)merchant.getParentManageOrg()), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                            List merchantApplyRangeInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
                            if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeInDbList)) {
                                isParentManageOrgOfRange = true;
                            }
                        }
                    }
                    if (!isSalesOrgType || !isParentManageOrgOfRange) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801012);
                    }
                }
            }
        } else if (merchant.containsKey((Object)"parentManageOrg") && (currentUser.getUserType() == UserType.TenantAdmin || currentUser.getUserType() == UserType.TenantEmployee)) {
            String businessRole = "1";
            if (merchant.merchantRole() != null && merchant.merchantRole().getBusinessRole() != null) {
                businessRole = merchant.merchantRole().getBusinessRole();
            } else if (merchant.getEntityStatus() == EntityStatus.Update) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("businessRole");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId())}));
                List merchantRoleInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantRoleInfo", (QuerySchema)querySchema, null);
                if (!CollectionUtils.isEmpty((Collection)merchantRoleInDbList) && ((MerchantRoleInfo)merchantRoleInDbList.get(0)).getBusinessRole() != null) {
                    businessRole = ((MerchantRoleInfo)merchantRoleInDbList.get(0)).getBusinessRole();
                }
            }
            if (businessRole != null && businessRole.contains("3") || businessRole.contains("4") || businessRole.contains("5")) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801013);
            }
        }
    }

    public void checkMerchantRegionCode(Merchant merchant) throws Exception {
        if (!StringUtils.isEmpty((CharSequence)merchant.getRegionCode())) {
            List<RegionCorp> regionCorpList = this.getRegionCorpListByCode(merchant.getRegionCode());
            if (!CollectionUtils.isEmpty(regionCorpList) && regionCorpList.size() == 1) {
                if (MerchantUtils.getRegionOnlyAllowFinalLevel() && !regionCorpList.get(0).getIsEnd().booleanValue()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801014, new Object[]{merchant.getRegionCode()});
                }
                merchant.setRegionCode(regionCorpList.get(0).getCode());
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801015, new Object[]{merchant.getRegionCode()});
            }
        }
    }

    public void checkAddressInfoRegionCode(AddressInfo addressInfo) throws Exception {
        if (!StringUtils.isEmpty((CharSequence)addressInfo.getRegionCode())) {
            List<RegionCorp> regionCorpList = this.getRegionCorpListByCode(addressInfo.getRegionCode());
            if (!CollectionUtils.isEmpty(regionCorpList) && regionCorpList.size() == 1) {
                if (MerchantUtils.getRegionOnlyAllowFinalLevel() && !regionCorpList.get(0).getIsEnd().booleanValue()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801016, new Object[]{addressInfo.getRegionCode()});
                }
                addressInfo.setRegionCode(regionCorpList.get(0).getCode());
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801017, new Object[]{addressInfo.getRegionCode()});
            }
        }
    }

    public List<RegionCorp> getRegionCorpListByCode(String regionCode) throws Exception {
        QuerySchema schema = QuerySchema.create().addSelect("code,isEnd").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId()), QueryCondition.name((String)"code").in(Arrays.asList(regionCode, MessageFormat.format("{0}000000", regionCode)))}));
        schema.setPartitionable(false);
        schema.distinct();
        List regionCorpList = this.billQueryRepository.queryBySchema("aa.regioncorp.RegionCorp", schema, null);
        return regionCorpList;
    }

    public void checkAreaApplyRange(Merchant merchant) throws Exception {
        List customerAreaList = merchant.customerAreas();
        if (this.iupcControlRuleService.checkSingleOrg().booleanValue() && AppContext.getCurrentUser().getUserType() != UserType.ShopAdminUser && AppContext.getCurrentUser().getUserType() != UserType.ShopUser) {
            return;
        }
        if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
            ArrayList<Long> areaIdList = new ArrayList<Long>();
            ArrayList<String> areaCodeList = new ArrayList<String>();
            for (CustomerArea customerArea : customerAreaList) {
                if (customerArea.getEntityStatus() == EntityStatus.Delete || customerArea.getSaleAreaId() == null) continue;
                areaIdList.add(customerArea.getSaleAreaId());
                String saleAreaCode = customerArea.getSaleAreaId().toString();
                if (customerArea.get("saleAreaId_code") != null) {
                    saleAreaCode = customerArea.get("saleAreaId_code").toString();
                } else {
                    CoreDocJsonResult saleAreaDTOCoreDocJsonResult = this.iSaleAreaService.queryByID(Long.valueOf(saleAreaCode));
                    if (!CollectionUtils.isEmpty((Collection)saleAreaDTOCoreDocJsonResult.getData())) {
                        saleAreaCode = ((SaleAreaDTO)saleAreaDTOCoreDocJsonResult.getData().get(0)).getCode();
                    }
                }
                areaCodeList.add(saleAreaCode);
            }
            if (!CollectionUtils.isEmpty(areaIdList)) {
                Merchant merchantInDb;
                String orgId = merchant.getCreateOrg();
                if (merchant.get("belongOrg") != null) {
                    orgId = merchant.get("belongOrg").toString();
                } else if (merchant.get("belongOrg_code") != null) {
                    ArrayList<String> codeList = new ArrayList<String>();
                    codeList.add(merchant.get("belongOrg_code").toString());
                    List orgUnitList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andCodeIn(codeList).withEnabled());
                    if (!CollectionUtils.isEmpty((Collection)orgUnitList)) {
                        orgId = ((OrgUnitDTO)orgUnitList.get(0)).getId();
                    }
                }
                if (StringUtils.isEmpty((CharSequence)orgId) && merchant.get("merchantApplyRangeId") != null) {
                    List merchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeById(Long.valueOf(Long.parseLong(merchant.get("merchantApplyRangeId").toString())));
                    if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                        orgId = ((MerchantApplyRange)merchantApplyRangeList.get(0)).getOrgId();
                    }
                } else if (StringUtils.isEmpty((CharSequence)orgId) && !CollectionUtils.isEmpty((Map)(merchantInDb = this.merchantGroupDao.getMerchantById((Long)merchant.getId())))) {
                    orgId = merchantInDb.getCreateOrg();
                }
                List<Long> rangeAreaIdList = this.getRangeAreaId(areaIdList, orgId);
                if (!CollectionUtils.isEmpty(rangeAreaIdList)) {
                    for (CustomerArea customerArea : customerAreaList) {
                        if (customerArea.getEntityStatus() == EntityStatus.Delete || customerArea.getSaleAreaId() == null || rangeAreaIdList.contains(customerArea.getSaleAreaId())) continue;
                        String saleAreaCode = customerArea.getSaleAreaId().toString();
                        if (customerArea.get("saleAreaId_code") != null) {
                            saleAreaCode = customerArea.get("saleAreaId_code").toString();
                        } else {
                            CoreDocJsonResult saleAreaDTOCoreDocJsonResult = this.iSaleAreaService.queryByID(Long.valueOf(saleAreaCode));
                            if (!CollectionUtils.isEmpty((Collection)saleAreaDTOCoreDocJsonResult.getData())) {
                                saleAreaCode = ((SaleAreaDTO)saleAreaDTOCoreDocJsonResult.getData().get(0)).getCode();
                            }
                        }
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_SALE_RANGE, new Object[]{saleAreaCode});
                    }
                } else {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_SALE_RANGE_LIST, new Object[]{areaCodeList});
                }
            }
        }
    }

    public List<Long> getRangeAreaId(List<Long> areaIdList, String orgId) throws Exception {
        if (CoredocContextUtils.isShopUser()) {
            orgId = CoredocContextUtils.getSingleOrgId();
        }
        ArrayList<Long> saleAreaIdInDbList = new ArrayList<Long>();
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect("id,saleArea");
        querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"saleArea").in(areaIdList), QueryCondition.name((String)"orgId").eq((Object)orgId)}));
        List saleAreaApplyRangeInDbList = MetaDaoHelper.queryObject((String)"aa.salearea.SaleAreaApplyRange", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)saleAreaApplyRangeInDbList)) {
            for (SaleAreaApplyRange saleAreaApplyRange : saleAreaApplyRangeInDbList) {
                saleAreaIdInDbList.add(saleAreaApplyRange.getSaleArea());
            }
        }
        return saleAreaIdInDbList;
    }

    public void checkMerchantInternalOrgId(Merchant merchant) throws Exception {
        if (!StringUtils.isEmpty((CharSequence)merchant.getInternalOrgId()) && BooleanUtil.isTrue((Object)merchant.getInternalOrg())) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,name");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"internalOrgId").eq((Object)merchant.getInternalOrgId()), QueryCondition.name((String)"createOrg").eq((Object)merchant.getCreateOrg()), QueryCondition.name((String)"id").not_eq(merchant.getId())}));
            List merchantInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantInDbList)) {
                if (merchant.get("internalOrgId_Name") == null) {
                    ArrayList<String> internalOrgIdList = new ArrayList<String>();
                    internalOrgIdList.add(merchant.getInternalOrgId());
                    List orgUnitList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(internalOrgIdList).withEnabled());
                    if (!CollectionUtils.isEmpty((Collection)orgUnitList)) {
                        merchant.set("internalOrgId_Name", (Object)((OrgUnitDTO)orgUnitList.get(0)).toMultiLang().getName().toString());
                    }
                }
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_SAVE_INTERNAL_ORG_ID, new Object[]{merchant.get("internalOrgId_Name"), ((Merchant)merchantInDbList.get(0)).getName()});
            }
        }
    }

    public void checkCreateOrgForMerchant(Merchant merchant, LoginUser currentUser, Boolean singleOrg) throws Exception {
        if (!singleOrg.booleanValue() && merchant.getEntityStatus() == EntityStatus.Insert) {
            List<String> orgIds = this.iupcControlRuleService.getManageOrgList("aa.merchant.Merchant", "aa_merchant");
            if (CollectionUtils.isEmpty(orgIds)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800388);
            }
            if (!merchant.containsKey((Object)"createOrg") || merchant.get("createOrg") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800383);
            }
            if (!orgIds.contains(merchant.getCreateOrg())) {
                String createOrgName = merchant.getCreateOrg();
                ArrayList<String> createOrgIdList = new ArrayList<String>();
                createOrgIdList.add(merchant.getCreateOrg());
                List orgUnitList = this.iOrgUnitQueryService.getByCondition(AppContext.getYhtTenantId().toString(), ConditionDTO.newOrgCondition().andIdIn(createOrgIdList).withEnabled());
                if (!CollectionUtils.isEmpty((Collection)orgUnitList)) {
                    createOrgName = ((OrgUnitDTO)orgUnitList.get(0)).toMultiLang().getName().toString();
                }
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MANAGE_ORG_MC_FILTER_CHECK, new Object[]{createOrgName});
            }
        }
    }
}

