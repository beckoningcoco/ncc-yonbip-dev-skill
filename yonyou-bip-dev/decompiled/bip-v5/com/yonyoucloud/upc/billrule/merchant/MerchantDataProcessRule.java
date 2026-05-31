/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.merchant.service.impl.MerchantApplyRangeInfoServiceImpl
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantAttachment
 *  com.yonyou.iuap.billcode.po.BillNumberPO
 *  com.yonyou.iuap.billcode.po.BillPrefixPO
 *  com.yonyou.iuap.org.dto.OrgUnitDTO
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.uap.billcode.BillCodeComponentParam
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.base.user.UserType
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.util.OptionUtils
 *  com.yonyoucloud.upc.aa.merchant.AddressInfo
 *  com.yonyoucloud.upc.aa.merchant.AgentFinancial
 *  com.yonyoucloud.upc.aa.merchant.AgentInvoice
 *  com.yonyoucloud.upc.aa.merchant.ChannelCertificationStatus
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.CreatorType
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.EnterpriseNature
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.IsTradeCustomers
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantBusinessRoleTime
 *  com.yonyoucloud.upc.aa.merchant.MerchantCorpImage
 *  com.yonyoucloud.upc.aa.merchant.MerchantDetail
 *  com.yonyoucloud.upc.aa.merchant.Payway
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.aa.merchant.ScopeModel
 *  com.yonyoucloud.upc.aa.merchant.TaxPayingCate
 *  com.yonyoucloud.upc.attrcontrol.CarryType
 *  com.yonyoucloud.upc.attrcontrol.ControlType
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.BizObjectUtils
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.MultilangUtil
 *  com.yonyoucloud.upc.utils.PingYinUtil
 *  com.yonyoucloud.upc.utils.ToolUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.Objectlizer
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryField
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.merchant.service.impl.MerchantApplyRangeInfoServiceImpl;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantAttachment;
import com.yonyou.iuap.billcode.po.BillNumberPO;
import com.yonyou.iuap.billcode.po.BillPrefixPO;
import com.yonyou.iuap.org.dto.OrgUnitDTO;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.uap.billcode.BillCodeComponentParam;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.base.user.UserType;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.util.OptionUtils;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.merchant.AddressInfo;
import com.yonyoucloud.upc.aa.merchant.AgentFinancial;
import com.yonyoucloud.upc.aa.merchant.AgentInvoice;
import com.yonyoucloud.upc.aa.merchant.ChannelCertificationStatus;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.CreatorType;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.EnterpriseNature;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.IsTradeCustomers;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantBusinessRoleTime;
import com.yonyoucloud.upc.aa.merchant.MerchantCorpImage;
import com.yonyoucloud.upc.aa.merchant.MerchantDetail;
import com.yonyoucloud.upc.aa.merchant.Payway;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.aa.merchant.ScopeModel;
import com.yonyoucloud.upc.aa.merchant.TaxPayingCate;
import com.yonyoucloud.upc.attrcontrol.CarryType;
import com.yonyoucloud.upc.attrcontrol.ControlType;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.attrcontrol.DocAttributeControlConfigService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.service.rpcService.OrgService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.BizObjectUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.MultilangUtil;
import com.yonyoucloud.upc.utils.PingYinUtil;
import com.yonyoucloud.upc.utils.ToolUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.Objectlizer;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryField;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Component(value="merchantDataProcessRule")
public class MerchantDataProcessRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(MerchantDataProcessRule.class);
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private IUPCMerchantQueryService upcMerchantQueryService;
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private IBillCodeComponentService billCodeComponentService;
    @Autowired
    private DocAttributeControlConfigService docAttributeControlConfigService;
    @Autowired
    OrgService orgService;
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    MerchantApplyRangeInfoServiceImpl merchantApplyRangeInfoService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        Map mapCondition = billDataDto.getMapCondition();
        List bills = this.getBills(billContext, paramMap);
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        for (BizObject bizObject : bills) {
            boolean fromCRM;
            Merchant merchant = (Merchant)bizObject;
            boolean bl = fromCRM = MerchantUtils.isExists((Map)merchant, (String)"srcBill") && "CRM".equals(merchant.get("srcBill"));
            if (merchant.getEntityStatus() == EntityStatus.Insert || merchant.getEntityStatus() == EntityStatus.Update) {
                merchant.setInvoicingCustomers(merchant.getInvoicingCustomers() == null ? (Long)merchant.getId() : merchant.getInvoicingCustomers());
            }
            this.merchantService.setLayoffIdForStopStatus(merchant);
            this.merchantService.setDefaultMobileForAreaMobile(merchant.merchantContacterInfos());
            merchant.put("entityStatus", (Object)merchant.getEntityStatus());
            if (null != billDataDto.getCustMap() && BooleanUtil.isTrue(billDataDto.getCustMap().get("FLAG_FROM_MIGRATION"))) {
                merchant.set("isCreator", (Object)true);
            }
            if (merchant.get("isCreator") != null && merchant.get("isCreator").equals(false)) {
                if (MerchantUtils.isExists((Map)merchant, (String)"srcBill") && "CRM".equals(merchant.get("srcBill"))) {
                    this.setEntityStatus(merchant);
                } else {
                    this.setUnChangedEntityStatus(merchant);
                }
            } else {
                this.setEntityStatus(merchant);
            }
            if (this.isUpdateMerchantCodeForCodingRule(merchant)) {
                try {
                    this.setMerchantCustomerAreaForExport(merchant);
                    this.caseUpdateMerchantCodeForCodingRule(merchant);
                }
                catch (Exception e) {
                    log.error("\u5ba2\u6237\u66f4\u65b0\u5bfc\u5165\u8054\u52a8\u66f4\u65b0\u7f16\u7801\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
                }
            }
            merchant.put("businessRole", (Object)(merchant.merchantRole() != null && StringUtils.isNotBlank((CharSequence)merchant.merchantRole().getBusinessRole()) ? merchant.merchantRole().getBusinessRole() : "1"));
            if (!fromCRM && BooleanUtil.isTrue((Object)merchant.get("_fromApi")) || merchant.get("importSpecialKey_merchant") != null) {
                if (merchant.getEntityStatus() != EntityStatus.Unchanged) {
                    this.checkIsNotNull(merchant, billDataDto);
                    this.setDefaultValue(merchant);
                }
            } else {
                this.checkBatchModify(merchant);
            }
            if (!fromCRM) {
                boolean autoGenerateRangeData = BooleanUtil.isTrue((Object)merchant.get("autoGenerateRangeData_"));
                if (EntityStatus.Insert.equals((Object)merchant.getEntityStatus())) {
                    if (!CollectionUtils.isEmpty((Map)mapCondition) && BooleanUtil.isTrue(mapCondition.get("isChannelCustomer"))) {
                        this.upcMerchantQueryService.setOrgsVoucher(merchant);
                    } else {
                        this.upcMerchantQueryService.setOrgs4U8c(merchant, singleOrg, Boolean.valueOf(!merchant.containsKey((Object)"data_from") || autoGenerateRangeData));
                    }
                }
            }
            this.checkData4U8c(merchant, singleOrg);
            this.setOrgData4U8c(merchant, singleOrg, billDataDto);
            if (MerchantUtils.isExists((Map)merchant, (String)"srcBill") && "CRM".equals(merchant.get("srcBill"))) {
                switch (AppContext.getCurrentUser().getUserType()) {
                    case TenantAdmin: 
                    case TenantEmployee: {
                        merchant.setChannelCertificationStatus(ChannelCertificationStatus.verified);
                        break;
                    }
                    case JoinUser: 
                    case TenantShopuser: {
                        break;
                    }
                    case ShopAdminUser: 
                    case ShopUser: {
                        this.setShop(merchant);
                        break;
                    }
                    default: {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800381, new Object[]{AppContext.getCurrentUser().getUserType()});
                    }
                }
                this.setMerchantCRMApplyRangeDetail(merchant, 1);
            } else {
                this.checkRangeData(merchant);
                int rangeType = 1;
                if (!CollectionUtils.isEmpty((Map)mapCondition) && BooleanUtil.isTrue(mapCondition.get("isChannelCustomer"))) {
                    rangeType = 3;
                    this.setVoucherShop(merchant);
                } else if (AppContext.getCurrentUser().getUserType() == UserType.TenantAdmin || AppContext.getCurrentUser().getUserType() == UserType.TenantEmployee) {
                    merchant.setChannelCertificationStatus(ChannelCertificationStatus.verified);
                } else if (AppContext.getCurrentUser().getUserType() == UserType.JoinUser || AppContext.getCurrentUser().getUserType() == UserType.TenantShopuser) {
                    rangeType = 2;
                    this.setShop(merchant);
                } else if (AppContext.getCurrentUser().getUserType() == UserType.ShopAdminUser || AppContext.getCurrentUser().getUserType() == UserType.ShopUser) {
                    rangeType = 3;
                    this.setShop(merchant);
                } else {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800381, new Object[]{AppContext.getCurrentUser().getUserType()});
                }
                this.setMerchantApplyRangeDetail(merchant, rangeType, mapCondition);
            }
            if (!CollectionUtils.isEmpty((Collection)merchant.merchantApplyRanges())) {
                this.merchantService.setMerchantApplyRangeOrgFunc(merchant.merchantApplyRanges());
            }
            if (merchant.getEntityStatus() == EntityStatus.Insert && !CollectionUtils.isEmpty((Collection)merchant.merchantApplyRanges())) {
                this.merchantService.setMerchantIsExistPotential(merchant);
            }
            if (!CollectionUtils.isEmpty((Collection)merchant.merchantAppliedDetail()) && merchant.getEntityStatus() == EntityStatus.Insert) {
                this.merchantService.getBillCodeDetail(merchant);
            }
            this.setMerchantApplyRangeDetailCharacter(merchant);
            this.setMerchantBusinessRoleTime(merchant);
            this.merchantService.inspectCharacterStatus(merchant);
            this.merchantService.assignerMerchantApplyRange(merchant, billDataDto);
            if (MerchantUtils.isExists((Map)merchant, (String)"srcBill") && "CRM".equals(merchant.get("srcBill"))) {
                this.merchantGroupService.saveMerchantApplyRangeGroupFromCrm(merchant);
            } else {
                this.migrationMerchant(merchant);
            }
            boolean isNeedSend = true;
            if (MerchantUtils.isExists((Map)merchant, (String)"srcBill") && "CRM".equals(merchant.get("srcBill")) && merchant.merchantAppliedDetail() != null && merchant.merchantAppliedDetail().size() > 0 && merchant.merchantApplyRanges() != null && merchant.merchantApplyRanges().size() > 0 && ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).getEntityStatus().equals((Object)EntityStatus.Insert) && ((MerchantApplyRange)merchant.merchantApplyRanges().get(0)).getEntityStatus().equals((Object)EntityStatus.Insert)) {
                isNeedSend = false;
            }
            if (isNeedSend && merchant.getEntityStatus() == EntityStatus.Update) {
                this.merchantService.updateBillContext(bills, billContext);
            }
            if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                merchant.setMerchantAppliedDetail(null);
            }
            this.dealMerchantRangeData(merchant);
            this.checkMerchantRangeData(merchant);
            this.checkMerchantRangeDataIsCreator(merchant);
        }
        return new RuleExecuteResult();
    }

    private void checkMerchantRangeDataIsCreator(Merchant merchant) {
        try {
            if (!CollectionUtils.isEmpty((Collection)merchant.merchantApplyRange()) && !CollectionUtils.isEmpty((Collection)merchant.merchantDetail())) {
                HashMap stringMerchantApplyRangeHashMap = new HashMap();
                merchant.merchantApplyRange().stream().filter(MerchantApplyRange::getIsApplied).filter(merchantApplyRange -> merchantApplyRange.getIsCreator() != null && merchantApplyRange.getOrgId() != null).forEach(merchantApplyRange -> stringMerchantApplyRangeHashMap.put(merchantApplyRange.getMerchantDetailId(), merchantApplyRange));
                for (MerchantDetail merchantDetail : merchant.merchantDetail()) {
                    MerchantApplyRange merchantApplyRange2;
                    if (merchantDetail.getId() == null || (merchantApplyRange2 = (MerchantApplyRange)stringMerchantApplyRangeHashMap.getOrDefault(merchantDetail.getId(), null)) == null) continue;
                    merchantDetail.setIsCreator(merchantApplyRange2.getIsCreator());
                    merchantDetail.setBelongOrgId(merchantApplyRange2.getOrgId());
                }
            }
        }
        catch (Exception e) {
            log.error("MerchantDataProcessRule checkMerchantRangeDataIsCreator error", (Throwable)e);
        }
    }

    private void checkMerchantRangeData(Merchant merchant) {
        List merchantApplyRangeList = merchant.merchantApplyRange();
        List merchantDetails = merchant.merchantDetail();
        List merchantApplyRangeDetails = merchant.merchantAppliedDetail();
        if (!(this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite() || CollectionUtils.isEmpty((Collection)merchantApplyRangeList) || CollectionUtils.isEmpty((Collection)merchantDetails) || CollectionUtils.isEmpty((Collection)merchantApplyRangeDetails))) {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                if (merchantApplyRange.getId() == null || merchantApplyRange.getMerchantDetailId() == null) continue;
                Optional<MerchantDetail> merchantDetailOptional = merchantDetails.stream().filter(merchantDetail -> merchantDetail.getId().equals(merchantApplyRange.getMerchantDetailId())).findFirst();
                Optional<MerchantApplyRangeDetail> merchantApplyRangeDetailOptional = merchantApplyRangeDetails.stream().filter(merchantApplyRangeDetail -> merchantApplyRangeDetail.getMerchantApplyRangeId().equals(merchantApplyRange.getId())).findFirst();
                if (!merchantDetailOptional.isPresent() || !merchantApplyRangeDetailOptional.isPresent()) continue;
                this.compareIsSame(merchantDetailOptional.get(), merchantApplyRangeDetailOptional.get());
            }
        }
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                if (merchantApplyRange.getEntityStatus() != EntityStatus.Insert) continue;
                if (merchantApplyRange.getRangeType() == null) {
                    merchantApplyRange.setRangeType(this.merchantApplyRangeInfoService.getRangeType(Boolean.valueOf(BooleanUtil.isTrue((Object)merchant.get("isChannelCustomer")))));
                }
                if (merchantApplyRange.getRangeType() == 1 && (merchantApplyRange.getShop() == null || merchantApplyRange.getShop() != -1L)) {
                    merchantApplyRange.setShop(Long.valueOf(-1L));
                }
                if (merchantApplyRange.getRangeType() != 3 || merchantApplyRange.getOrgId() == null || merchantApplyRange.getShop() == null || merchantApplyRange.getOrgId().equals(merchantApplyRange.getShop().toString())) continue;
                merchantApplyRange.setShop(Long.valueOf(merchantApplyRange.getOrgId()));
            }
        }
    }

    private void compareIsSame(MerchantDetail merchantDetail, MerchantApplyRangeDetail merchantApplyRangeDetail) {
        if (merchantDetail.getStopstatus() != null && merchantApplyRangeDetail.getStopstatus() != null && (BooleanUtil.isTrue((Object)merchantDetail.getStopstatus()) && BooleanUtil.isFalse((Object)merchantApplyRangeDetail.getStopstatus()) || BooleanUtil.isFalse((Object)merchantDetail.getStopstatus()) && BooleanUtil.isTrue((Object)merchantApplyRangeDetail.getStopstatus()))) {
            throw new RuntimeException(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1FF4BFDA05280008", (String)"\u65b0\u8001\u6a21\u578b\u53cc\u5199\u65f6\u9002\u7528\u8303\u56f4\u8be6\u60c5\u548c\u5ba2\u6237\u8be6\u60c5\u7684\u72b6\u6001\u4e0d\u4e00\u81f4\uff0c\u8bf7\u8054\u7cfb\u5f00\u53d1\u68c0\u67e5\uff01\u4e0d\u4e00\u81f4\u5b57\u6bb5\uff1a\u542f\u7528\u72b6\u6001"));
        }
    }

    private void dealMerchantRangeData(Merchant merchant) {
        Optional<MerchantApplyRangeDetail> merchantApplyRangeDetailCreateOrg;
        Optional<MerchantApplyRange> createOrgRange;
        if (merchant.merchantApplyRanges() != null && merchant.merchantApplyRanges().size() == 1 && merchant.merchantDetail() != null && merchant.merchantDetail().size() == 1) {
            MerchantApplyRange applyRange = (MerchantApplyRange)merchant.merchantApplyRanges().get(0);
            if (applyRange.getMerchantDetailId() == null && ((MerchantDetail)merchant.merchantDetail().get(0)).getId() != null || applyRange.getMerchantDetailId() != null && ((MerchantDetail)merchant.merchantDetail().get(0)).getId() != null && !applyRange.getMerchantDetailId().equals(((MerchantDetail)merchant.merchantDetail().get(0)).getId())) {
                applyRange.setMerchantDetailId((String)((MerchantDetail)merchant.merchantDetail().get(0)).getId());
                applyRange.setEntityStatus(EntityStatus.Update);
            } else if (applyRange.getMerchantDetailId().equals(((MerchantDetail)merchant.merchantDetail().get(0)).getId()) && applyRange.getEntityStatus() == EntityStatus.Unchanged && merchant.getEntityStatus() == EntityStatus.Update) {
                applyRange.setEntityStatus(EntityStatus.Update);
            }
        }
        List merchantApplyRangeDetails = merchant.merchantAppliedDetail();
        List merchantApplyRangeList = merchant.merchantApplyRanges();
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetails) && !CollectionUtils.isEmpty((Collection)merchantApplyRangeList) && merchantApplyRangeDetails.size() < merchantApplyRangeList.size() && (createOrgRange = merchantApplyRangeList.stream().filter(merchantApplyRange -> BooleanUtil.isTrue((Object)merchantApplyRange.getIsCreator())).findAny()).isPresent() && (merchantApplyRangeDetailCreateOrg = merchantApplyRangeDetails.stream().filter(merchantApplyRangeDetail -> merchantApplyRangeDetail.getMerchantApplyRangeId().equals(((MerchantApplyRange)createOrgRange.get()).getId())).findAny()).isPresent()) {
            for (MerchantApplyRange merchantApplyRange2 : merchantApplyRangeList) {
                String orgId = merchantApplyRange2.getOrgId();
                Optional<MerchantApplyRangeDetail> merchantApplyRangeDetail1 = merchantApplyRangeDetails.stream().filter(merchantApplyRangeDetail -> orgId.equals(merchantApplyRangeDetail.getBelongOrg())).findFirst();
                if (merchantApplyRangeDetail1.isPresent()) continue;
                MerchantApplyRangeDetail merchantApplyRangeDetail2 = new MerchantApplyRangeDetail();
                merchantApplyRangeDetailCreateOrg.get().entrySet().stream().forEach(entry -> {
                    merchantApplyRangeDetail2.put((String)entry.getKey(), entry.getValue());
                    if (((String)entry.getKey()).equals("merchantApplyRangeDetailCharacter")) {
                        BizObject value = (BizObject)entry.getValue();
                        BizObject newValue = new BizObject();
                        value.entrySet().stream().forEach(bizObjectEntry -> newValue.put((String)bizObjectEntry.getKey(), bizObjectEntry.getValue()));
                        newValue.setId((Object)IdManager.getInstance().nextId());
                        merchantApplyRangeDetail2.put((String)entry.getKey(), (Object)newValue);
                    }
                    merchantApplyRangeDetail2.setMerchantApplyRangeId((Long)merchantApplyRange2.getId());
                    merchantApplyRangeDetail2.setBelongOrg(merchantApplyRange2.getOrgId());
                });
                merchant.merchantAppliedDetail().add(merchantApplyRangeDetail2);
            }
        }
        List<MerchantApplyRange> merchantApplyRangeList1 = this.deduplicateByOrgId(MerchantDataProcessRule.filterOrgIdNull(merchantApplyRangeList), this.merchantApplyRangeInfoService.getRangeType(Boolean.valueOf(BooleanUtil.isTrue((Object)merchant.get("isChannelCustomer")))));
        merchant.setMerchantApplyRanges(merchantApplyRangeList1);
    }

    @NotNull
    private static List<MerchantApplyRange> filterOrgIdNull(List<MerchantApplyRange> merchantApplyRangeList) {
        List<Object> merchantApplyRangeOrgNotNull = new ArrayList<MerchantApplyRange>();
        if (!CollectionUtils.isEmpty(merchantApplyRangeList)) {
            merchantApplyRangeOrgNotNull = merchantApplyRangeList.stream().filter(s -> s.getOrgId() != null).collect(Collectors.toList());
        }
        return merchantApplyRangeOrgNotNull;
    }

    public List<MerchantApplyRange> deduplicateByOrgId(List<MerchantApplyRange> list, Integer rangeType) {
        if (list == null || list.isEmpty()) {
            return new ArrayList<MerchantApplyRange>();
        }
        HashMap<String, MerchantApplyRange> resultMap = new HashMap<String, MerchantApplyRange>();
        for (MerchantApplyRange po : list) {
            String orgId = po.getOrgId();
            if (orgId == null) continue;
            if (resultMap.containsKey(orgId)) {
                MerchantApplyRange existingPo = (MerchantApplyRange)resultMap.get(orgId);
                if (existingPo.getRangeType() == rangeType || po.getRangeType() != rangeType) continue;
                resultMap.put(orgId, po);
                continue;
            }
            resultMap.put(orgId, po);
        }
        return new ArrayList<MerchantApplyRange>(resultMap.values());
    }

    private void setEntityStatus(Merchant merchant) throws Exception {
        if (merchant.merchantsManager() != null && merchant.merchantsManager().getId() != null && merchant.merchantsManager().getEntityStatus().equals((Object)EntityStatus.Unchanged)) {
            merchant.merchantsManager().setEntityStatus(EntityStatus.Update);
            merchant.merchantsManager().setMerchantId((Long)merchant.getId());
        }
        if (merchant.merchantRole() != null && merchant.merchantRole().getId() != null && merchant.merchantRole().getEntityStatus().equals((Object)EntityStatus.Unchanged)) {
            merchant.merchantRole().setEntityStatus(EntityStatus.Update);
            merchant.merchantRole().setMerchantId((Long)merchant.getId());
        }
        merchant.setCustomerDefine(null);
    }

    private void setUnChangedEntityStatus(Merchant merchant) {
        merchant.setEntityStatus(EntityStatus.Update);
        if ("customerapply".equals(merchant.get("customerapply")) && MerchantUtils.getIsUpdateMerchantGlobalFields()) {
            return;
        }
        if (merchant.merchantsManager() != null) {
            merchant.merchantsManager().setEntityStatus(EntityStatus.Unchanged);
        }
        if (merchant.merchantRole() != null) {
            merchant.merchantRole().setEntityStatus(EntityStatus.Unchanged);
        }
        if (merchant.merchantCorpImages() != null) {
            for (MerchantCorpImage album : merchant.merchantCorpImages()) {
                album.setEntityStatus(EntityStatus.Unchanged);
            }
        }
        if (merchant.merchantAttachments() != null) {
            for (MerchantAttachment attachment : merchant.merchantAttachments()) {
                attachment.setEntityStatus(EntityStatus.Unchanged);
            }
        }
        if (merchant.merchantAddressInfos() != null) {
            for (AddressInfo addressInfo : merchant.merchantAddressInfos()) {
                addressInfo.setEntityStatus(EntityStatus.Unchanged);
            }
        }
        if (merchant.merchantContacterInfos() != null) {
            for (Contacter contacter : merchant.merchantContacterInfos()) {
                contacter.setEntityStatus(EntityStatus.Unchanged);
            }
        }
        if (merchant.merchantAgentFinancialInfos() != null) {
            for (AgentFinancial agentFinancial : merchant.merchantAgentFinancialInfos()) {
                agentFinancial.setEntityStatus(EntityStatus.Unchanged);
            }
        }
        if (merchant.merchantAgentInvoiceInfos() != null) {
            for (AgentInvoice agentInvoice : merchant.merchantAgentInvoiceInfos()) {
                agentInvoice.setEntityStatus(EntityStatus.Unchanged);
            }
        }
        merchant.setCustomerDefine(null);
        if (merchant.merchantApplyRanges() != null) {
            for (MerchantApplyRange merchantApplyRange : merchant.merchantApplyRanges()) {
                merchantApplyRange.setEntityStatus(EntityStatus.Unchanged);
            }
        }
    }

    private void checkRangeData(Merchant merchant) throws Exception {
        block9: {
            block8: {
                if (merchant.getEntityStatus() != EntityStatus.Insert) break block8;
                if (merchant.merchantApplyRanges() == null || merchant.merchantApplyRanges().size() == 0) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800382);
                }
                for (MerchantApplyRange org : merchant.merchantApplyRanges()) {
                    if (merchant.merchantApplyRanges().stream().filter(merchantOrg -> merchantOrg.getOrgId() != null && merchantOrg.getOrgId().equals(org.getOrgId())).count() <= 1L) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800237);
                }
                break block9;
            }
            if (merchant.getEntityStatus() != EntityStatus.Update) break block9;
            if (merchant.merchantApplyRanges() == null) {
                return;
            }
            List orgsDel = merchant.merchantApplyRanges().stream().filter(map -> map.getEntityStatus() == EntityStatus.Delete).collect(Collectors.toList());
            List orgsToDb = merchant.merchantApplyRanges().stream().filter(map -> map.getEntityStatus() == EntityStatus.Insert || map.getEntityStatus() == EntityStatus.Update).collect(Collectors.toList());
            for (MerchantApplyRange org : orgsToDb) {
                if (orgsToDb.stream().filter(map -> map.getOrgId() != null && org.getOrgId() != null && map.getOrgId().equals(org.getOrgId())).count() <= 1L) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800237);
            }
            List orgIds = merchant.merchantApplyRanges().stream().map(MerchantApplyRange::getOrgId).collect(Collectors.toList());
            if (orgIds != null && orgIds.size() > 0) {
                List orgsInDb = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)QuerySchema.create().addSelect("id, orgId, orgId.code as orgCode, orgId.name as orgName").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"rangeType").eq((Object)1), QueryCondition.name((String)"isPotential").eq((Object)false), QueryCondition.name((String)"orgId").in(orgIds)})));
                if (CollectionUtils.isEmpty((Collection)orgsInDb)) {
                    return;
                }
                Map<String, Long> orgsInDbMap = orgsInDb.stream().collect(Collectors.toMap(e -> e.get("orgId").toString(), e -> Long.parseLong(e.get("id").toString()), (key1, key2) -> key2));
                for (MerchantApplyRange org : orgsToDb) {
                    if (org.getEntityStatus() == EntityStatus.Insert) {
                        if (!orgsInDbMap.containsKey(org.getOrgId()) || orgsDel.stream().filter(map -> map.getOrgId().equals(org.getOrgId())).count() != 0L) continue;
                        org.setId((Object)orgsInDbMap.get(org.getOrgId()));
                        org.setEntityStatus(EntityStatus.Update);
                        continue;
                    }
                    if (org.getEntityStatus() != EntityStatus.Update || orgsInDb.stream().filter(map -> map.get("id").equals(org.getId()) && map.get("orgId").equals(org.getOrgId())).count() != 0L || orgsDel.stream().filter(map -> map.getOrgId().equals(org.getOrgId())).count() != 0L) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800242);
                }
            }
        }
    }

    private void checkData4U8c(Merchant merchant, Boolean singleOrg) throws Exception {
        if (!(merchant.getEntityStatus() == EntityStatus.Unchanged || singleOrg.booleanValue() || merchant.containsKey((Object)"createOrg") && merchant.getCreateOrg() != null)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800383);
        }
        if (merchant.getEntityStatus() == EntityStatus.Update) {
            Map merchantOrg = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)QuerySchema.create().addSelect("createOrg").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())})));
            if (merchantOrg == null || merchantOrg.isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800367, new Object[]{merchant.getCode()});
            }
            if (!singleOrg.booleanValue() && !merchantOrg.get("createOrg").toString().equals(merchant.getCreateOrg())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800385, new Object[]{merchant.getCode()});
            }
        }
    }

    private void setMerchantMaintenance(Merchant merchant) throws Exception {
        List merchantApplyRangesList = merchant.merchantApplyRanges();
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangesList)) {
            List customerAreaList = merchant.customerAreas();
            List principalList = merchant.principals();
            List invoicingCustomersList = merchant.invoicingCustomerss();
            List merchantApplyRangeDetails = merchant.merchantAppliedDetail();
            if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetails)) {
                for (MerchantApplyRangeDetail detail : merchantApplyRangeDetails) {
                    if (!CollectionUtils.isEmpty((Collection)principalList)) {
                        for (Principal pc : principalList) {
                            if (!pc.getIsDefault().booleanValue() || pc.getEntityStatus() == EntityStatus.Delete || !pc.getMerchantApplyRangeId().equals(detail.getMerchantApplyRangeId())) continue;
                            detail.setSpecialManagementDep(pc.getSpecialManagementDep());
                            detail.setProfessSalesman(pc.getProfessSalesman());
                        }
                    }
                    if (CollectionUtils.isEmpty((Collection)customerAreaList)) continue;
                    for (CustomerArea ca : customerAreaList) {
                        if (!ca.getIsDefault().booleanValue() || ca.getEntityStatus() == EntityStatus.Delete || !ca.getmerchantApplyRangeId().equals(detail.getMerchantApplyRangeId())) continue;
                        detail.setCustomerArea(ca.getSaleAreaId());
                    }
                }
            }
            for (MerchantApplyRange mar : merchantApplyRangesList) {
                if (!mar.getIsCreator().booleanValue()) continue;
                if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
                    for (CustomerArea ca : customerAreaList) {
                        if (!ca.getIsDefault().booleanValue() || ca.getEntityStatus() == EntityStatus.Delete || !ca.getmerchantApplyRangeId().equals(mar.getId())) continue;
                        merchant.setCustomerArea(ca.getSaleAreaId());
                        merchant.set("customerArea_code", ca.get("saleAreaId_code"));
                    }
                }
                if (CollectionUtils.isEmpty((Collection)invoicingCustomersList)) continue;
                for (InvoicingCustomers ic : invoicingCustomersList) {
                    if (!ic.getIsDefault().booleanValue() || ic.getEntityStatus() == EntityStatus.Delete || !ic.getMerchantApplyRangeId().equals(mar.getId())) continue;
                    merchant.setInvoicingCustomers(ic.getInvoicingCustomersId());
                }
            }
        }
    }

    private void setMerchantMaintenanceUpdate(Merchant merchant) {
        List customerAreaList = merchant.customerAreas();
        List principalList = merchant.principals();
        List invoicingCustomersList = merchant.invoicingCustomerss();
        List merchantApplyRangeDetailList = merchant.merchantAppliedDetail();
        if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
            for (CustomerArea ca : customerAreaList) {
                if (!ca.getIsDefault().booleanValue() || ca.getEntityStatus() == EntityStatus.Delete) continue;
                merchant.setCustomerArea(ca.getSaleAreaId());
                merchant.set("customerArea_code", ca.get("saleAreaId_code"));
            }
        }
        if (!CollectionUtils.isEmpty((Collection)invoicingCustomersList)) {
            for (InvoicingCustomers ic : invoicingCustomersList) {
                if (!ic.getIsDefault().booleanValue() || ic.getEntityStatus() == EntityStatus.Delete) continue;
                merchant.setInvoicingCustomers(ic.getInvoicingCustomersId());
            }
        }
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList)) {
            if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
                for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                    for (CustomerArea customerArea : customerAreaList) {
                        if (!customerArea.getmerchantApplyRangeId().equals(merchantApplyRangeDetail.getMerchantApplyRangeId()) || !customerArea.getIsDefault().booleanValue() || customerArea.getEntityStatus() == EntityStatus.Delete) continue;
                        merchantApplyRangeDetail.setCustomerArea(customerArea.getSaleAreaId());
                    }
                }
            }
            if (!CollectionUtils.isEmpty((Collection)principalList)) {
                for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                    for (Principal principal : principalList) {
                        if (!principal.getMerchantApplyRangeId().equals(merchantApplyRangeDetail.getMerchantApplyRangeId()) || !principal.getIsDefault().booleanValue() || principal.getEntityStatus() == EntityStatus.Delete) continue;
                        merchantApplyRangeDetail.setSpecialManagementDep(principal.getSpecialManagementDep());
                        merchantApplyRangeDetail.setProfessSalesman(principal.getProfessSalesman());
                    }
                }
            }
        }
    }

    private void setMerchantApplyRangeDetail(Merchant merchant, int rangeType, Map mapCondition) throws Exception {
        Long merchantApplyRangeId = 0L;
        if (merchant.merchantAppliedDetail() != null && merchant.merchantAppliedDetail().get(0) != null && ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).containsKey((Object)"stopstatus") && ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).getStopstatus() != null) {
            if (((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).getStopstatus().equals(true)) {
                ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setStoptime(new Date());
                merchant.put("isStop", (Object)true);
            } else {
                ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setStoptime(null);
                merchant.put("isStop", (Object)false);
            }
        }
        Object isCustomerAreaIssueOrg = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"isCustomerAreaIssueOrg");
        Object isPrincipalIssueOrg = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"isPrincipalIssueOrg");
        if (merchant.getEntityStatus() == EntityStatus.Insert) {
            merchant.put("isCreator", (Object)true);
            merchant.setCreateTime(new Date());
            if (merchant.merchantAppliedDetail() != null && merchant.merchantAppliedDetail().get(0) == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800386);
            }
            ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
            ArrayList<CustomerArea> customerAreaList = new ArrayList<CustomerArea>();
            ArrayList<Principal> principalList = new ArrayList<Principal>();
            ArrayList<InvoicingCustomers> invoicingCustomersList = new ArrayList<InvoicingCustomers>();
            ArrayList<MerchantDetail> merchantDetailList = new ArrayList<MerchantDetail>();
            MerchantApplyRangeDetail creatorMerchantApplyRangeDetail = this.initCreatorMerchantApplyRangeDetail(merchant);
            MerchantDetail creatorMerchantDetail = this.merchantGroupService.getMerchantDetailForInsert(creatorMerchantApplyRangeDetail, merchant.getCreateOrg(), (Long)merchant.getId(), true);
            merchantApplyRangeDetailList.add(creatorMerchantApplyRangeDetail);
            merchantDetailList.add(creatorMerchantDetail);
            if (rangeType == 1) {
                List<Principal> creatorPrincipalList;
                this.channMerchant(merchant);
                for (MerchantApplyRange org : merchant.merchantApplyRanges()) {
                    if (!org.getIsCreator().booleanValue()) continue;
                    merchantApplyRangeId = (Long)org.getId();
                    org.setMerchantDetailId((String)creatorMerchantDetail.getId());
                    break;
                }
                creatorMerchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
                List<CustomerArea> creatorCustomerAreaList = this.initCreatorCustomerAreaList(merchant, merchantApplyRangeId);
                if (!CollectionUtils.isEmpty(creatorCustomerAreaList)) {
                    customerAreaList.addAll(creatorCustomerAreaList);
                }
                if (!CollectionUtils.isEmpty(creatorPrincipalList = this.initCreatorPrincipalList(merchant, merchantApplyRangeId))) {
                    principalList.addAll(creatorPrincipalList);
                }
                this.setMerchantApplyRangeDetailDefault(creatorMerchantApplyRangeDetail, creatorCustomerAreaList, creatorPrincipalList);
                List<InvoicingCustomers> creatorInvoicingCustomerList = this.initCreatorInvoicingCustomerList(merchant, merchantApplyRangeId);
                if (!CollectionUtils.isEmpty(creatorInvoicingCustomerList)) {
                    invoicingCustomersList.addAll(creatorInvoicingCustomerList);
                }
                this.setMerchantDefault(merchant, creatorCustomerAreaList, creatorInvoicingCustomerList);
                if (creatorMerchantApplyRangeDetail.getIsTradeCustomers() == null) {
                    creatorMerchantApplyRangeDetail.setIsTradeCustomers(IsTradeCustomers.tradeCustomers.getValue());
                }
                DocAttributeControlConfigDTO docAttributeControlConfigOnly = this.docAttributeControlConfigService.queryAttrControlConfigOnlyForOrgAdd("aa.merchant.Merchant", merchant.getCreateOrg());
                DocAttributeControlConfigDTO docAttributeControlConfig = this.docAttributeControlConfigService.queryAttrControlConfigForOrg("aa.merchant.Merchant", merchant.getCreateOrg());
                Map<String, List<DocAttributeControlConfig>> docAttributeControlConfigMap = this.merchantGroupService.getDocAttributeControlConfig(docAttributeControlConfig);
                MerchantDetail userMerchantDetail = null;
                for (MerchantApplyRange range : merchant.merchantApplyRanges()) {
                    if (range.getIsCreator().booleanValue()) continue;
                    MerchantApplyRangeDetail userMerchantApplyRangeDetail = this.copyCreatorMerchantApplyRangeDetail(creatorMerchantApplyRangeDetail, (Long)range.getId(), docAttributeControlConfigMap.get("aa.merchant.MerchantApplyRangeDetail"), EntityStatus.Insert);
                    if (!ObjectUtils.isEmpty((Object)docAttributeControlConfigOnly)) {
                        range.setControlRuleVersion(docAttributeControlConfigOnly.getVersion());
                        if (ObjectUtils.isEmpty(userMerchantDetail)) {
                            userMerchantDetail = this.merchantGroupService.getMerchantDetailForInsert(userMerchantApplyRangeDetail, null, (Long)merchant.getId(), false);
                            merchantDetailList.add(userMerchantDetail);
                        }
                        range.setMerchantDetailId((String)userMerchantDetail.getId());
                    } else {
                        range.setMerchantDetailId((String)creatorMerchantDetail.getId());
                    }
                    List<CustomerArea> userCustomerAreaList = this.copyCreatorCustomerAreaList(creatorCustomerAreaList, (Long)merchant.getId(), (Long)range.getId(), BooleanUtil.isTrue((Object)isCustomerAreaIssueOrg), docAttributeControlConfigMap.get("aa.merchant.CustomerArea"), EntityStatus.Insert);
                    this.setMerchantApplyRangeDetailDefault(userMerchantApplyRangeDetail, userCustomerAreaList, null);
                    if (!CollectionUtils.isEmpty(userCustomerAreaList)) {
                        customerAreaList.addAll(userCustomerAreaList);
                    }
                    List<Principal> userPrincipalList = this.copyCreatorPrincipalList(creatorPrincipalList, (Long)merchant.getId(), (Long)range.getId(), BooleanUtil.isTrue((Object)isPrincipalIssueOrg), docAttributeControlConfigMap.get("aa.merchant.Principal"), EntityStatus.Insert);
                    this.setMerchantApplyRangeDetailDefault(userMerchantApplyRangeDetail, null, userPrincipalList);
                    if (!CollectionUtils.isEmpty(userPrincipalList)) {
                        principalList.addAll(userPrincipalList);
                    }
                    merchantApplyRangeDetailList.add(userMerchantApplyRangeDetail);
                    List<InvoicingCustomers> userInvoicingCustomersList = this.copyCreatorInvoicingCustomerList(creatorInvoicingCustomerList, (Long)merchant.getId(), (Long)range.getId(), docAttributeControlConfigMap.get("aa.merchant.InvoicingCustomers"), EntityStatus.Insert);
                    invoicingCustomersList.addAll(userInvoicingCustomersList);
                }
                merchant.setMerchantDetail(merchantDetailList);
                merchant.setMerchantAppliedDetail(merchantApplyRangeDetailList);
                merchant.setCustomerAreas(customerAreaList);
                merchant.setPrincipals(principalList);
                merchant.setInvoicingCustomerss(invoicingCustomersList);
            } else if (rangeType == 2 || rangeType == 3) {
                List<Principal> principalShopList;
                ArrayList<MerchantApplyRange> merchantApplyRangeShopList = new ArrayList<MerchantApplyRange>();
                creatorMerchantApplyRangeDetail.setIsTradeCustomers(IsTradeCustomers.tradeCustomers.getValue());
                MerchantApplyRange merchantApplyRangeShop = !CollectionUtils.isEmpty((Map)mapCondition) && BooleanUtil.isTrue(mapCondition.get("isChannelCustomer")) ? this.initMerchantApplyRange((Long)merchant.getId(), merchant.getCreateOrg(), merchant.getCreateMerchant(), true, true, rangeType) : this.initMerchantApplyRange((Long)merchant.getId(), (String)AppContext.getCurrentUser().get("singleOrgId"), AppContext.getCurrentUser().getShop(), true, true, rangeType);
                merchantApplyRangeShop.setMerchantDetailId((String)creatorMerchantDetail.getId());
                merchantApplyRangeId = (Long)merchantApplyRangeShop.getId();
                creatorMerchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
                merchantApplyRangeShopList.add(merchantApplyRangeShop);
                List<CustomerArea> customerAreaShopList = this.initCreatorCustomerAreaList(merchant, merchantApplyRangeId);
                if (!CollectionUtils.isEmpty(customerAreaShopList)) {
                    customerAreaList.addAll(customerAreaShopList);
                }
                if (!CollectionUtils.isEmpty(principalShopList = this.initCreatorPrincipalList(merchant, merchantApplyRangeId))) {
                    principalList.addAll(principalShopList);
                }
                this.setMerchantApplyRangeDetailDefault(creatorMerchantApplyRangeDetail, customerAreaShopList, principalShopList);
                List<InvoicingCustomers> invoicingCustomerShopList = this.initCreatorInvoicingCustomerList(merchant, merchantApplyRangeId);
                if (!CollectionUtils.isEmpty(invoicingCustomerShopList)) {
                    invoicingCustomersList.addAll(invoicingCustomerShopList);
                }
                this.setMerchantDefault(merchant, customerAreaShopList, invoicingCustomerShopList);
                if (!StringUtils.isEmpty((CharSequence)merchant.getParentManageOrg())) {
                    MerchantApplyRange tradeCustomersMerchantApplyRange = this.initMerchantApplyRange((Long)merchant.getId(), merchant.getParentManageOrg(), -1L, false, true, 1);
                    MerchantApplyRangeDetail tradeCustomersMerchantApplyRangeDetail = this.initMerchantApplyRangeDetailShop((Long)merchant.getId(), (Long)tradeCustomersMerchantApplyRange.getId(), creatorMerchantApplyRangeDetail);
                    MerchantDetail tradeCustomersMerchantDetail = this.merchantGroupService.getMerchantDetailForInsert(tradeCustomersMerchantApplyRangeDetail, merchant.getParentManageOrg(), (Long)merchant.getId(), false);
                    tradeCustomersMerchantApplyRange.setMerchantDetailId((String)tradeCustomersMerchantDetail.getId());
                    if (!CollectionUtils.isEmpty(customerAreaShopList) && BooleanUtil.isTrue((Object)isCustomerAreaIssueOrg)) {
                        List<CustomerArea> tradeCustomersCustomerAreaList = this.copyCreatorCustomerAreaList(customerAreaShopList, (Long)merchant.getId(), (Long)tradeCustomersMerchantApplyRange.getId(), BooleanUtil.isTrue((Object)isCustomerAreaIssueOrg), null, EntityStatus.Insert);
                        if (!CollectionUtils.isEmpty(tradeCustomersCustomerAreaList)) {
                            customerAreaList.addAll(tradeCustomersCustomerAreaList);
                        }
                        this.setMerchantApplyRangeDetailDefault(tradeCustomersMerchantApplyRangeDetail, tradeCustomersCustomerAreaList, null);
                    }
                    if (!CollectionUtils.isEmpty(principalShopList) && BooleanUtil.isTrue((Object)isPrincipalIssueOrg)) {
                        List<Principal> tradeCustomersPrincipalList = this.copyCreatorPrincipalList(principalShopList, (Long)merchant.getId(), (Long)tradeCustomersMerchantApplyRange.getId(), BooleanUtil.isTrue((Object)isPrincipalIssueOrg), null, EntityStatus.Insert);
                        this.setMerchantApplyRangeDetailDefault(tradeCustomersMerchantApplyRangeDetail, null, tradeCustomersPrincipalList);
                        if (!CollectionUtils.isEmpty(tradeCustomersPrincipalList)) {
                            principalList.addAll(tradeCustomersPrincipalList);
                        }
                    }
                    List<InvoicingCustomers> tradeCustomersInvoicingCustomersList = this.copyCreatorInvoicingCustomerList(invoicingCustomerShopList, (Long)merchant.getId(), (Long)tradeCustomersMerchantApplyRange.getId(), null, EntityStatus.Insert);
                    invoicingCustomersList.addAll(tradeCustomersInvoicingCustomersList);
                    merchantApplyRangeShopList.add(tradeCustomersMerchantApplyRange);
                    merchantApplyRangeDetailList.add(tradeCustomersMerchantApplyRangeDetail);
                    merchantDetailList.add(tradeCustomersMerchantDetail);
                }
                merchant.setMerchantDetail(merchantDetailList);
                merchant.setMerchantApplyRanges(merchantApplyRangeShopList);
                merchant.setMerchantAppliedDetail(merchantApplyRangeDetailList);
                merchant.setCustomerAreas(customerAreaList);
                merchant.setPrincipals(principalList);
                merchant.setInvoicingCustomerss(invoicingCustomersList);
            }
            merchant.put("merchantApplyRangeId", (Object)merchantApplyRangeId);
        } else if (merchant.getEntityStatus() == EntityStatus.Update) {
            List<MerchantApplyRange> currentSaveMerchantApplyRangeInDbList;
            if (merchant.get("merchantApplyRangeId") != null) {
                merchantApplyRangeId = Long.valueOf(merchant.get("merchantApplyRangeId").toString());
                if (merchantApplyRangeId == 0L) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800255);
                }
            } else {
                Map<String, Object> merchantApplyRange2 = this.getMerchantApplyRange(merchant);
                if (merchantApplyRange2 != null && !merchantApplyRange2.isEmpty()) {
                    merchantApplyRangeId = (Long)merchantApplyRange2.get("id");
                    merchant.put("merchantApplyRangeId", (Object)merchantApplyRangeId);
                    merchant.put("isCreator", merchantApplyRange2.get("isCreator"));
                } else {
                    OrgUnitDTO belongOrg = this.orgService.getOrgByOrgId((String)merchant.get("belongOrg"));
                    if (belongOrg != null) {
                        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800373, new Object[]{merchant.getCode(), merchant.getName(), merchant.getId(), belongOrg.getCode(), merchant.get("belongOrg")});
                    }
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808373, new Object[]{merchant.getCode(), merchant.getName(), merchant.getId(), merchant.get("belongOrg")});
                }
            }
            if (CollectionUtils.isEmpty(currentSaveMerchantApplyRangeInDbList = this.merchantGroupService.getMerchantApplyRangeById(merchantApplyRangeId, (Long)merchant.getId()))) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_808373, new Object[]{merchant.getCode(), merchant.getName(), merchant.getId(), merchant.get("belongOrg")});
            }
            MerchantApplyRange currentSaveMerchantApplyRange = currentSaveMerchantApplyRangeInDbList.get(0);
            Boolean isCreator = (Boolean)merchant.get("isCreator");
            ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
            ArrayList<MerchantDetail> merchantDetailList = new ArrayList<MerchantDetail>();
            MerchantApplyRangeDetail updateMerchantApplyRangeDetail = this.initUpdateMerchantApplyRangeDetail(merchant, merchantApplyRangeId);
            merchantApplyRangeDetailList.add(updateMerchantApplyRangeDetail);
            merchant.setMerchantAppliedDetail(merchantApplyRangeDetailList);
            this.deleteMerchantApplyRange(merchant);
            Boolean channelIdentification = this.channMerchant(merchant);
            this.defaultInvoicingCustomers(merchant);
            this.dealCustomerAreaAndPrincipal(merchant, merchantApplyRangeId);
            DocAttributeControlConfigDTO docAttributeControlConfigOnly = this.docAttributeControlConfigService.queryAttrControlConfigOnlyForOrgAdd("aa.merchant.Merchant", merchant.getCreateOrg());
            DocAttributeControlConfigDTO docAttributeControlConfig = this.docAttributeControlConfigService.queryAttrControlConfigForOrg("aa.merchant.Merchant", merchant.getCreateOrg());
            Map<String, List<DocAttributeControlConfig>> docAttributeControlConfigMap = this.merchantGroupService.getDocAttributeControlConfig(docAttributeControlConfig);
            if (isCreator.booleanValue()) {
                List<MerchantApplyRange> isAppliedMerchantApplyRangeList;
                List<CustomerArea> userCustomerAreaList;
                MerchantApplyRangeDetail userMerchantApplyRangeDetail;
                MerchantDetail updateMerchantDetail = this.merchantGroupService.getMerchantDetailForUpdate(updateMerchantApplyRangeDetail, currentSaveMerchantApplyRange.getMerchantDetailId(), currentSaveMerchantApplyRange.getOrgId(), (Long)merchant.getId());
                this.merchantService.updateMerchantDetailCharacter(merchant, currentSaveMerchantApplyRange, updateMerchantDetail, updateMerchantApplyRangeDetail);
                merchantDetailList.add(updateMerchantDetail);
                ArrayList<CustomerArea> customerAreaList = new ArrayList<CustomerArea>();
                if (!CollectionUtils.isEmpty((Collection)merchant.customerAreas())) {
                    customerAreaList.addAll(merchant.customerAreas());
                }
                ArrayList<Principal> principalList = new ArrayList<Principal>();
                if (!CollectionUtils.isEmpty((Collection)merchant.principals())) {
                    principalList.addAll(merchant.principals());
                }
                ArrayList<InvoicingCustomers> invoicingCustomerList = new ArrayList<InvoicingCustomers>();
                if (!CollectionUtils.isEmpty((Collection)merchant.invoicingCustomerss())) {
                    invoicingCustomerList.addAll(merchant.invoicingCustomerss());
                }
                boolean isExistInsertRange = false;
                if (!CollectionUtils.isEmpty((Collection)merchant.merchantApplyRanges())) {
                    isExistInsertRange = merchant.merchantApplyRanges().stream().anyMatch(merchantApplyRange -> merchantApplyRange.getEntityStatus() == EntityStatus.Insert);
                }
                List<InvoicingCustomers> creatorInvoicingCustomerList = this.getCreatorInvoicingCustomerListForUpdate(merchant, merchantApplyRangeId);
                List<CustomerArea> creatorCustomerAreaList = this.getCreatorCustomerAreaListForUpdate(merchant, merchantApplyRangeId);
                List<Principal> creatorPrincipalList = this.getCreatorPrincipalListForUpdate(merchant, merchantApplyRangeId);
                this.setMerchantDefault(merchant, creatorCustomerAreaList, creatorInvoicingCustomerList);
                if (isExistInsertRange) {
                    List<MerchantApplyRange> rangeControlRuleVersionList = null;
                    if (docAttributeControlConfigOnly != null) {
                        rangeControlRuleVersionList = this.merchantGroupService.getMerchantApplyRangeListByControlRuleVersion((Long)merchant.getId(), docAttributeControlConfigOnly.getVersion());
                    }
                    MerchantDetail userMerchantDetail = null;
                    for (MerchantApplyRange merchantApplyRange3 : merchant.merchantApplyRanges()) {
                        if (merchantApplyRange3.getEntityStatus() != EntityStatus.Insert) continue;
                        userMerchantApplyRangeDetail = this.copyCreatorMerchantApplyRangeDetail(updateMerchantApplyRangeDetail, (Long)merchantApplyRange3.getId(), docAttributeControlConfigMap.get("aa.merchant.MerchantApplyRangeDetail"), EntityStatus.Insert);
                        if (!ObjectUtils.isEmpty((Object)docAttributeControlConfigOnly)) {
                            merchantApplyRange3.setControlRuleVersion(docAttributeControlConfigOnly.getVersion());
                            if (!CollectionUtils.isEmpty(rangeControlRuleVersionList)) {
                                merchantApplyRange3.setMerchantDetailId(rangeControlRuleVersionList.get(0).getMerchantDetailId());
                            } else {
                                if (ObjectUtils.isEmpty(userMerchantDetail)) {
                                    userMerchantDetail = this.merchantGroupService.getMerchantDetailForInsert(userMerchantApplyRangeDetail, null, (Long)merchant.getId(), false);
                                    merchantDetailList.add(userMerchantDetail);
                                }
                                merchantApplyRange3.setMerchantDetailId((String)userMerchantDetail.getId());
                            }
                        } else {
                            merchantApplyRange3.setMerchantDetailId((String)updateMerchantDetail.getId());
                        }
                        if (!CollectionUtils.isEmpty(creatorCustomerAreaList)) {
                            userCustomerAreaList = this.copyCreatorCustomerAreaList(creatorCustomerAreaList, (Long)merchant.getId(), (Long)merchantApplyRange3.getId(), BooleanUtil.isTrue((Object)isCustomerAreaIssueOrg), docAttributeControlConfigMap.get("aa.merchant.CustomerArea"), EntityStatus.Insert);
                            this.setMerchantApplyRangeDetailDefault(userMerchantApplyRangeDetail, userCustomerAreaList, null);
                            if (!CollectionUtils.isEmpty(userCustomerAreaList)) {
                                customerAreaList.addAll(userCustomerAreaList);
                            }
                        }
                        if (!CollectionUtils.isEmpty(creatorPrincipalList)) {
                            List<Principal> userPrincipalList = this.copyCreatorPrincipalList(creatorPrincipalList, (Long)merchant.getId(), (Long)merchantApplyRange3.getId(), BooleanUtil.isTrue((Object)isPrincipalIssueOrg), docAttributeControlConfigMap.get("aa.merchant.Principal"), EntityStatus.Insert);
                            this.setMerchantApplyRangeDetailDefault(userMerchantApplyRangeDetail, null, userPrincipalList);
                            if (!CollectionUtils.isEmpty(userPrincipalList)) {
                                principalList.addAll(userPrincipalList);
                            }
                        }
                        merchantApplyRangeDetailList.add(userMerchantApplyRangeDetail);
                        List<InvoicingCustomers> userInvoicingCustomersList = this.copyCreatorInvoicingCustomerList(creatorInvoicingCustomerList, (Long)merchant.getId(), (Long)merchantApplyRange3.getId(), docAttributeControlConfigMap.get("aa.merchant.InvoicingCustomers"), EntityStatus.Insert);
                        if (CollectionUtils.isEmpty(userInvoicingCustomersList)) continue;
                        invoicingCustomerList.addAll(userInvoicingCustomersList);
                    }
                }
                if (!CollectionUtils.isEmpty(isAppliedMerchantApplyRangeList = this.getIsAppliedMerchantApplyRangeList(merchant, merchantApplyRangeId, docAttributeControlConfig))) {
                    ArrayList<String> userMerchantDetailIdExitList = new ArrayList<String>();
                    for (MerchantApplyRange isAppliedMerchantApplyRange : isAppliedMerchantApplyRangeList) {
                        List<InvoicingCustomers> userInvoicingCustomersList;
                        userMerchantApplyRangeDetail = this.copyCreatorMerchantApplyRangeDetail(updateMerchantApplyRangeDetail, (Long)isAppliedMerchantApplyRange.getId(), docAttributeControlConfigMap.get("aa.merchant.MerchantApplyRangeDetail"), EntityStatus.Update);
                        if (BooleanUtil.isTrue((Object)isAppliedMerchantApplyRange.getIsApplied())) {
                            userMerchantApplyRangeDetail.remove("stopstatus");
                            userMerchantApplyRangeDetail.remove("stoptime");
                        }
                        if (!(StringUtils.isEmpty((CharSequence)isAppliedMerchantApplyRange.getMerchantDetailId()) || userMerchantDetailIdExitList.contains(isAppliedMerchantApplyRange.getMerchantDetailId()) || isAppliedMerchantApplyRange.getMerchantDetailId().equals(updateMerchantDetail.getId()))) {
                            MerchantDetail userMerchantDetail = this.merchantGroupService.getMerchantDetailForUpdate(userMerchantApplyRangeDetail, isAppliedMerchantApplyRange.getMerchantDetailId(), null, (Long)merchant.getId());
                            merchantDetailList.add(userMerchantDetail);
                            userMerchantDetailIdExitList.add(isAppliedMerchantApplyRange.getMerchantDetailId());
                        }
                        userCustomerAreaList = this.copyCreatorCustomerAreaList(creatorCustomerAreaList, (Long)merchant.getId(), (Long)isAppliedMerchantApplyRange.getId(), BooleanUtil.isTrue((Object)isCustomerAreaIssueOrg), docAttributeControlConfigMap.get("aa.merchant.CustomerArea"), EntityStatus.Update);
                        this.setMerchantApplyRangeDetailDefault(userMerchantApplyRangeDetail, userCustomerAreaList, null);
                        if (!CollectionUtils.isEmpty(userCustomerAreaList)) {
                            customerAreaList.addAll(userCustomerAreaList);
                        }
                        List<Principal> userPrincipalList = this.copyCreatorPrincipalList(creatorPrincipalList, (Long)merchant.getId(), (Long)isAppliedMerchantApplyRange.getId(), BooleanUtil.isTrue((Object)isPrincipalIssueOrg), docAttributeControlConfigMap.get("aa.merchant.Principal"), EntityStatus.Update);
                        this.setMerchantApplyRangeDetailDefault(userMerchantApplyRangeDetail, null, userPrincipalList);
                        if (!CollectionUtils.isEmpty(userPrincipalList)) {
                            principalList.addAll(userPrincipalList);
                        }
                        if (!CollectionUtils.isEmpty(userInvoicingCustomersList = this.copyCreatorInvoicingCustomerList(creatorInvoicingCustomerList, (Long)merchant.getId(), (Long)isAppliedMerchantApplyRange.getId(), docAttributeControlConfigMap.get("aa.merchant.InvoicingCustomers"), EntityStatus.Update))) {
                            invoicingCustomerList.addAll(userInvoicingCustomersList);
                        }
                        merchantApplyRangeDetailList.add(userMerchantApplyRangeDetail);
                    }
                }
                merchant.setMerchantDetail(merchantDetailList);
                merchant.setCustomerAreas(customerAreaList);
                merchant.setPrincipals(principalList);
                merchant.setInvoicingCustomerss(invoicingCustomerList);
                merchant.setMerchantAppliedDetail(merchantApplyRangeDetailList);
            } else {
                MerchantApplyRange range = new MerchantApplyRange();
                range.setId((Object)merchantApplyRangeId);
                range.setOrgId(currentSaveMerchantApplyRange.getOrgId());
                range.setIsApplied(Boolean.valueOf(true));
                range.setIsPotential(Boolean.valueOf(false));
                range.setShop(currentSaveMerchantApplyRange.getShop());
                range.setEntityStatus(EntityStatus.Update);
                ArrayList<MerchantApplyRange> ranges = new ArrayList<MerchantApplyRange>();
                ranges.add(range);
                merchant.setMerchantApplyRanges(ranges);
                this.setUpdateUserMerchantApplyRangeDetail(updateMerchantApplyRangeDetail, docAttributeControlConfigMap.get("aa.merchant.MerchantApplyRangeDetail"));
                List<MerchantDetail> originalDataBaseMerchantDetailList = this.merchantGroupService.getMerchantDetailByBelongOrgId(currentSaveMerchantApplyRange.getOrgId(), (Long)merchant.getId());
                if (CollectionUtils.isEmpty(originalDataBaseMerchantDetailList)) {
                    List newOriginalDataBaseMerchantDetailList = this.merchantGroupDao.getMerchantDetailById(currentSaveMerchantApplyRange.getMerchantDetailId(), (Long)merchant.getId());
                    MerchantDetail userMerchantDetail = this.merchantGroupService.copyMerchantDetail((MerchantDetail)newOriginalDataBaseMerchantDetailList.get(0), currentSaveMerchantApplyRange.getOrgId(), (Long)merchant.getId(), false);
                    this.merchantGroupService.copyDataFromRangeToDetail(userMerchantDetail, updateMerchantApplyRangeDetail);
                    range.setMerchantDetailId((String)userMerchantDetail.getId());
                    merchantDetailList.add(userMerchantDetail);
                } else {
                    MerchantDetail originalDataBaseMerchantDetail = originalDataBaseMerchantDetailList.get(0);
                    MerchantDetail userMerchantDetail = this.merchantGroupService.getMerchantDetailForUpdate(updateMerchantApplyRangeDetail, (String)originalDataBaseMerchantDetail.getId(), null, (Long)merchant.getId());
                    merchantDetailList.add(userMerchantDetail);
                }
                this.setUpdateUserCustomerArea(merchant, docAttributeControlConfigMap.get("aa.merchant.CustomerArea"));
                this.setUpdateUserPrincipal(merchant, docAttributeControlConfigMap.get("aa.merchant.Principal"));
                this.setUpdateUserInvoicingCustomer(merchant, docAttributeControlConfigMap.get("aa.merchant.InvoicingCustomers"));
                merchant.setMerchantAppliedDetail(merchantApplyRangeDetailList);
                merchant.setMerchantDetail(merchantDetailList);
            }
            this.setUpdateMerchantGlobalFields(merchant, isCreator, channelIdentification);
        }
    }

    public Map<String, Object> getMerchantApplyRange(Merchant merchant) throws Exception {
        QueryConditionGroup queryMerchantApplyRangeid = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isPotential").eq((Object)false), QueryCondition.name((String)"orgId").eq(merchant.get("belongOrg"))});
        QuerySchema schemaId = QuerySchema.create().addSelect("id,isCreator,isApplied").addCondition((ConditionExpression)queryMerchantApplyRangeid);
        Map merchantApplyRange = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaId);
        return merchantApplyRange;
    }

    private void setUpdateMerchantGlobalFields(Merchant merchant, Boolean isCreator, Boolean channelIdentification) {
        boolean isUpdateGlobalFields = false;
        if ("customerapply".equals(merchant.get("customerapply")) && MerchantUtils.getIsUpdateMerchantGlobalFields()) {
            isUpdateGlobalFields = true;
        } else if (!channelIdentification.booleanValue() && !isCreator.booleanValue()) {
            isUpdateGlobalFields = true;
        } else if (isCreator.booleanValue()) {
            isUpdateGlobalFields = true;
        } else if ("CRM".equals(merchant.get("srcBill"))) {
            isUpdateGlobalFields = true;
        }
        if (isUpdateGlobalFields) {
            merchant.setEntityStatus(EntityStatus.Update);
        } else {
            merchant.setEntityStatus(EntityStatus.Unchanged);
        }
    }

    private void setShop(Merchant merchant) throws Exception {
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        Long shopId = (Long)user.get("shop");
        merchant.setCreatorType(CreatorType.shangjia);
        merchant.setCreateMerchant(shopId);
        BizObject parentManOrgId = MetaDaoHelper.findById((String)"aa.merchant.Merchant", (Object)shopId);
        merchant.setParentManageOrg(parentManOrgId.get("parentManageOrg") != null ? parentManOrgId.get("parentManageOrg").toString() : null);
    }

    private void setVoucherShop(Merchant merchant) throws Exception {
        LoginUser user = AppContext.getCurrentUser();
        if (null == user) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        Long shopId = Long.parseLong(merchant.getCreateOrg());
        merchant.setCreatorType(CreatorType.shangjia);
        merchant.setCreateMerchant(shopId);
        BizObject parentManOrgId = MetaDaoHelper.findById((String)"aa.merchant.Merchant", (Object)shopId);
        merchant.setParentManageOrg(parentManOrgId.get("parentManageOrg") != null ? parentManOrgId.get("parentManageOrg").toString() : null);
    }

    private void setOrgData4U8c(Merchant merchant, Boolean singleOrg, BillDataDto billDataDto) throws Exception {
        if (merchant.getEntityStatus() == EntityStatus.Insert) {
            merchant.setCreatorType(CreatorType.org);
            if (null == merchant.merchantApplyRanges() || merchant.merchantApplyRanges().isEmpty()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800387);
            }
            boolean migrationFlag = false;
            if (null != billDataDto.getCustMap()) {
                migrationFlag = BooleanUtil.isTrue(billDataDto.getCustMap().get("FLAG_FROM_MIGRATION"));
            }
            for (MerchantApplyRange org : merchant.merchantApplyRanges()) {
                if (!migrationFlag || org.getId() == null) {
                    org.setId((Object)IdManager.getInstance().nextId());
                }
                org.setMerchantId((Long)merchant.getId());
            }
        }
    }

    private void setDefaultValue(Merchant merchant) {
        if (merchant.getEntityStatus() == EntityStatus.Insert) {
            if (merchant.getScopeModel() == null) {
                merchant.setScopeModel(ScopeModel.productionAndProcess);
            }
            if (merchant.getEnterpriseNature() == null) {
                merchant.setEnterpriseNature(EnterpriseNature.enterprise);
            }
            if (merchant.getRetailInvestors() == null) {
                merchant.setRetailInvestors(Boolean.valueOf(false));
            }
            if (merchant.getInternalOrg() == null) {
                merchant.setInternalOrg(Boolean.valueOf(false));
            }
            if (merchant.getTaxPayingCategories() == null) {
                merchant.setTaxPayingCategories(TaxPayingCate.generaltaxpayer);
            }
            if (!CollectionUtils.isEmpty((Collection)merchant.merchantAppliedDetail())) {
                merchant.merchantAppliedDetail().forEach(detail -> {
                    if (detail.getSignBack() == null) {
                        detail.setSignBack(Boolean.valueOf(false));
                    }
                    if (detail.getStopstatus() == null) {
                        detail.setStopstatus(Boolean.valueOf(false));
                    }
                    if (detail.getPayway() == null) {
                        detail.setPayway(Payway.others);
                    }
                });
            }
        }
        if (merchant.merchantsManager() != null) {
            if (!StringUtils.isBlank((CharSequence)merchant.merchantsManager().getUserName())) {
                merchant.put("userName", (Object)merchant.merchantsManager().getUserName());
            }
            if (!StringUtils.isBlank((CharSequence)merchant.merchantsManager().getMobile())) {
                merchant.put("mobile", (Object)merchant.merchantsManager().getMobile());
            }
            if (!StringUtils.isBlank((CharSequence)merchant.merchantsManager().getFullName())) {
                merchant.put("fullName", (Object)merchant.merchantsManager().getFullName());
            }
            if (!StringUtils.isBlank((CharSequence)merchant.merchantsManager().getEmail())) {
                merchant.put("email", (Object)merchant.merchantsManager().getEmail());
            }
            merchant.put("businessRole", (Object)(merchant.merchantRole() != null && StringUtils.isNotBlank((CharSequence)merchant.merchantRole().getBusinessRole()) ? merchant.merchantRole().getBusinessRole() : "1"));
        }
    }

    private void checkIsNotNull(Merchant merchant, BillDataDto billDataDto) throws Exception {
        List merchantAppliedDetailList;
        Map merchantAppliedDetail;
        String str;
        Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
        if (!singleOrg.booleanValue() && AppContext.getCurrentUser().getUserType() != null && AppContext.getCurrentUser().getUserType().getValue() != 0 && merchant.getEntityStatus() == EntityStatus.Insert) {
            List<String> orgIds = "aa_merchantexport".equals(billDataDto.getBillnum()) ? this.iupcControlRuleService.getManageOrgList("aa.merchant.Merchant", "aa_merchant") : this.iupcControlRuleService.getManageOrgList("aa.merchant.Merchant", billDataDto.getBillnum());
            if (CollectionUtils.isEmpty(orgIds)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800388);
            }
            if (!merchant.containsKey((Object)"createOrg") || merchant.get("createOrg") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800383);
            }
            Map mapCondition = billDataDto.getMapCondition();
            if (!(mapCondition != null && !mapCondition.isEmpty() && mapCondition.get("isChannelCustomer") != null && Boolean.valueOf((String)mapCondition.get("isChannelCustomer")).booleanValue() || orgIds.contains(merchant.getCreateOrg()))) {
                String str2 = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802A5", (String)"\u6ca1\u6709\u6b64\u7ba1\u7406\u7ec4\u7ec7:%s \u7684\u6743\u9650\u6216\u8005\u6863\u6848\u7ba1\u7406\u6743\u6ca1\u6709\u5f00\u542f\uff0c\u8bf7\u68c0\u67e5\uff01"), merchant.getCreateOrg());
                throw new CoreDocBusinessException(str2);
            }
        }
        if (!MerchantUtils.isExists((Map)merchant, (String)"code")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800389);
        }
        if (!MerchantUtils.isExists((Map)merchant, (String)"name")) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800390);
        }
        if (!MerchantUtils.getAllowSelectNonLeafNodes() && MerchantUtils.isExists((Map)merchant, (String)"customerClass_isEnd") && MerchantDataProcessRule.checkIsBoolean(merchant.get("customerClass_isEnd"))) {
            str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802AC", (String)"\u5ba2\u6237\u5206\u7c7b:%s \u8bf7\u9009\u62e9\u672b\u7ea7\u8282\u70b9"), merchant.get("customerClass_Name").toString());
            throw new CoreDocBusinessException(str);
        }
        if (!MerchantUtils.getAllowSelectNonLeafNodes() && MerchantUtils.isExists((Map)merchant, (String)"customerArea_isEnd") && MerchantDataProcessRule.checkIsBoolean(merchant.get("customerArea_isEnd"))) {
            str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080293", (String)"\u9500\u552e\u533a\u57df:%s \u8bf7\u9009\u62e9\u672b\u7ea7\u8282\u70b9"), merchant.get("customerArea_Name").toString());
            throw new CoreDocBusinessException(str);
        }
        if (!MerchantUtils.getAllowSelectNonLeafNodes() && MerchantUtils.isExists((Map)merchant, (String)"customerIndustry_isEnd") && MerchantDataProcessRule.checkIsBoolean(merchant.get("customerIndustry_isEnd"))) {
            str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F62860408028F", (String)"\u5ba2\u6237\u884c\u4e1a:%s \u8bf7\u9009\u62e9\u672b\u7ea7\u8282\u70b9"), merchant.get("customerIndustry_Name").toString());
            throw new CoreDocBusinessException(str);
        }
        List customerAreasList = (List)merchant.get("customerAreas");
        if (!MerchantUtils.getAllowSelectNonLeafNodes() && !CollectionUtils.isEmpty((Collection)customerAreasList)) {
            for (Map ca : customerAreasList) {
                if (!MerchantUtils.isExists((Map)ca, (String)"areaCode_isEnd") || !MerchantDataProcessRule.checkIsBoolean(ca.get("areaCode_isEnd"))) continue;
                String str3 = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080293", (String)"\u9500\u552e\u533a\u57df:%s \u8bf7\u9009\u62e9\u672b\u7ea7\u8282\u70b9"), ca.get("saleAreaId_code").toString());
                throw new CoreDocBusinessException(str3);
            }
        }
        Map map = merchantAppliedDetail = !CollectionUtils.isEmpty((Collection)(merchantAppliedDetailList = (List)merchant.get("merchantAppliedDetail"))) ? (Map)merchantAppliedDetailList.get(0) : null;
        if (MerchantUtils.isExists((Map)merchantAppliedDetail, (String)"settlementMethod_isEnd") && MerchantDataProcessRule.checkIsBoolean(merchantAppliedDetail.get("settlementMethod_isEnd"))) {
            String str4 = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802A1", (String)"\u7ed3\u7b97\u65b9\u5f0f:%s \u8bf7\u9009\u62e9\u672b\u7ea7\u8282\u70b9"), merchantAppliedDetail.get("settlementMethod_Name") != null ? merchantAppliedDetail.get("settlementMethod_Name").toString() : "");
            throw new CoreDocBusinessException(str4);
        }
        if (MerchantUtils.isExists((Map)merchantAppliedDetail, (String)"creditServiceDay") && !ToolUtils.isNumber((String)merchantAppliedDetail.get("creditServiceDay").toString())) {
            String str5 = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802A3", (String)"\u4fe1\u7528\u671f\u9650:%s\u8f93\u5165\u4e0d\u5408\u6cd5"), merchantAppliedDetail.get("creditServiceDay") != null ? merchantAppliedDetail.get("creditServiceDay").toString() : "");
            throw new CoreDocBusinessException(str5);
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"money") && !ToolUtils.isNumber((String)merchant.get("money").toString())) {
            String str6 = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802A6", (String)"\u6ce8\u518c\u8d44\u91d1:%s\u8f93\u5165\u4e0d\u5408\u6cd5"), merchant.get("money").toString());
            throw new CoreDocBusinessException(str6);
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"peopleNum") && !ToolUtils.isNumber((String)merchant.get("peopleNum").toString())) {
            String str7 = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802A7", (String)"\u5458\u5de5\u4eba\u6570:%s\u8f93\u5165\u4e0d\u5408\u6cd5"), merchant.get("peopleNum").toString());
            throw new CoreDocBusinessException(str7);
        }
        if (MerchantUtils.isExists((Map)merchant, (String)"yearMoney") && !ToolUtils.isNumber((String)merchant.get("yearMoney").toString())) {
            String str8 = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802A9", (String)"\u5e74\u8425\u4e1a\u989d:%s\u8f93\u5165\u4e0d\u5408\u6cd5"), merchant.get("yearMoney").toString());
            throw new CoreDocBusinessException(str8);
        }
    }

    private void checkBatchModify(Merchant merchant) throws Exception {
        String str = null;
        if (merchant.containsKey((Object)"taxPayingCategories") && !MerchantUtils.isExists((Map)merchant, (String)"taxPayingCategories")) {
            str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802AE", (String)"\u5ba2\u6237[%s]\u7eb3\u7a0e\u7c7b\u522b\u4e0d\u80fd\u4e3a\u7a7a"), merchant.getCode());
            throw new CoreDocBusinessException(str);
        }
    }

    private static boolean checkIsBoolean(Object object) {
        return object instanceof Boolean ? !((Boolean)object).booleanValue() : (Integer)object == 0;
    }

    private void setMerchantCRMApplyRangeDetail(Merchant merchant, int rangeType) throws Exception {
        Long merchantApplyRangeId = 0L;
        if (merchant.getEntityStatus() == EntityStatus.Insert) {
            merchant.put("isCreator", (Object)true);
            merchant.setCreateTime(new Date());
            List merchantApplyRangeDetails = merchant.merchantAppliedDetail();
            List merchantApplyRanges = merchant.merchantApplyRanges();
            if (rangeType == 1 && !CollectionUtils.isEmpty((Collection)merchantApplyRangeDetails) && !CollectionUtils.isEmpty((Collection)merchantApplyRanges)) {
                for (MerchantApplyRange merchantApplyRange : merchantApplyRanges) {
                    for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetails) {
                        if (!StringUtils.isNotBlank((CharSequence)merchantApplyRange.getOrgId()) || !StringUtils.isNotBlank((CharSequence)merchantApplyRangeDetail.getBelongOrg()) || !merchantApplyRange.getOrgId().equals(merchantApplyRangeDetail.getBelongOrg())) continue;
                        long rangId = IdManager.getInstance().nextId();
                        merchantApplyRange.setId((Object)rangId);
                        merchantApplyRangeDetail.setMerchantApplyRangeId(Long.valueOf(rangId));
                        if (merchantApplyRangeDetail.getCreator() == null) {
                            merchantApplyRangeDetail.setCreator(AppContext.getCurrentUser().getName());
                        }
                        if (merchantApplyRangeDetail.getCreatorId() == null) {
                            merchantApplyRangeDetail.setCreatorId((Long)AppContext.getCurrentUser().getId());
                        }
                        merchantApplyRangeDetail.setCreateTime(new Date());
                    }
                }
            }
            this.defaultInvoicingCustomers(merchant);
            this.setCRMDistributionMerchantApplyRange(merchant);
            this.setMerchantMaintenance(merchant);
        } else if (merchant.getEntityStatus() == EntityStatus.Update) {
            Boolean isCreator;
            if (merchant.get("merchantApplyRangeId") != null && (merchantApplyRangeId = Long.valueOf(merchant.get("merchantApplyRangeId").toString())) == 0L) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800255);
            }
            List merchantApplyRangeDetails = merchant.merchantAppliedDetail();
            List merchantApplyRanges = merchant.merchantApplyRanges();
            if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetails) && !CollectionUtils.isEmpty((Collection)merchantApplyRanges)) {
                List invoicingCustomersList;
                List principalList;
                if (merchantApplyRangeDetails.size() > 1 || merchantApplyRanges.size() > 1) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_APPLY_DETAIL_SIZE_ERROR);
                }
                MerchantApplyRange merchantApplyRange = (MerchantApplyRange)merchantApplyRanges.get(0);
                MerchantApplyRangeDetail merchantApplyRangeDetail = (MerchantApplyRangeDetail)merchantApplyRangeDetails.get(0);
                if (merchantApplyRange.getId() != null) {
                    merchantApplyRangeId = Long.valueOf(merchantApplyRange.getId().toString());
                    merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
                }
                if (EntityStatus.Insert.equals((Object)merchantApplyRangeDetail.getEntityStatus()) && merchantApplyRange.getEntityStatus() == EntityStatus.Insert) {
                    long rangId = IdManager.getInstance().nextId();
                    merchantApplyRangeDetail.setCreateTime(new Date());
                    merchantApplyRange.setId((Object)rangId);
                    merchant.set("merchantApplyRangeId", (Object)rangId);
                    merchantApplyRangeDetail.setMerchantApplyRangeId(Long.valueOf(rangId));
                    if (merchantApplyRangeDetail.getCreator() == null) {
                        merchantApplyRangeDetail.setCreator(AppContext.getCurrentUser().getName());
                    }
                } else if (EntityStatus.Update.equals((Object)merchantApplyRangeDetail.getEntityStatus())) {
                    merchantApplyRangeDetail.setModifyTime(new Date());
                    if (merchantApplyRangeDetail.getModifier() == null) {
                        merchantApplyRangeDetail.setModifier(AppContext.getCurrentUser().getName());
                        merchantApplyRangeDetail.setModifierId((Long)AppContext.getCurrentUser().getId());
                    }
                }
                if (merchantApplyRange.getId() == null) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_SUIT_FAIL_ID_IS_NULL);
                }
                List customerAreaList = merchant.customerAreas();
                if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
                    for (CustomerArea customerArea : customerAreaList) {
                        customerArea.setmerchantApplyRangeId((Long)merchantApplyRange.getId());
                        merchantApplyRangeDetail.setCustomerArea(customerArea.getSaleAreaId());
                    }
                }
                if (!CollectionUtils.isEmpty((Collection)(principalList = merchant.principals()))) {
                    for (Principal principal : principalList) {
                        principal.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
                        merchantApplyRangeDetail.setSpecialManagementDep(principal.getSpecialManagementDep());
                        merchantApplyRangeDetail.setProfessSalesman(principal.getProfessSalesman());
                    }
                }
                if (!CollectionUtils.isEmpty((Collection)(invoicingCustomersList = merchant.invoicingCustomerss()))) {
                    for (InvoicingCustomers invoicingCustomers : invoicingCustomersList) {
                        invoicingCustomers.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
                    }
                }
            }
            this.defaultInvoicingCustomers(merchant);
            if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetails)) {
                this.dealCustomerAreaAndPrincipal(merchant, merchantApplyRangeId);
            }
            if ((isCreator = (Boolean)merchant.get("isCreator")).booleanValue()) {
                this.setMerchantMaintenanceUpdate(merchant);
            }
        }
    }

    private void setCRMDistributionMerchantApplyRange(Merchant merchant) throws Exception {
        List merchantApplyRangesList;
        if (merchant.getEntityStatus() == EntityStatus.Insert && !CollectionUtils.isEmpty((Collection)(merchantApplyRangesList = merchant.merchantApplyRanges()))) {
            List invoicingCustomersList;
            List principalList;
            ArrayList<CustomerArea> newCustomerAreaList = new ArrayList<CustomerArea>();
            ArrayList<Principal> newPrincipalList = new ArrayList<Principal>();
            ArrayList<InvoicingCustomers> newInvoicingCustomersList = new ArrayList<InvoicingCustomers>();
            List distributePrincipleOrgList = (List)merchant.get("distributePrincipleOrgs");
            Long merchantapplyrangesid = 0L;
            for (Object mar : merchantApplyRangesList) {
                if (!mar.getIsCreator().booleanValue()) continue;
                merchantapplyrangesid = (Long)mar.getId();
            }
            List customerAreaList = merchant.customerAreas();
            if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
                for (CustomerArea ca : customerAreaList) {
                    ca.setmerchantApplyRangeId(merchantapplyrangesid);
                    newCustomerAreaList.add(ca);
                }
            }
            if (!CollectionUtils.isEmpty((Collection)(principalList = merchant.principals()))) {
                for (Principal pc : principalList) {
                    pc.setMerchantApplyRangeId(merchantapplyrangesid);
                    newPrincipalList.add(pc);
                }
            }
            if (!CollectionUtils.isEmpty((Collection)(invoicingCustomersList = merchant.invoicingCustomerss()))) {
                for (InvoicingCustomers ic : invoicingCustomersList) {
                    ic.setMerchantApplyRangeId(merchantapplyrangesid);
                    newInvoicingCustomersList.add(ic);
                }
            }
            for (MerchantApplyRange mar : merchantApplyRangesList) {
                if (mar.getIsCreator().booleanValue()) continue;
                if (!CollectionUtils.isEmpty((Collection)invoicingCustomersList)) {
                    for (InvoicingCustomers ic : invoicingCustomersList) {
                        InvoicingCustomers invoicingCustomers = new InvoicingCustomers();
                        invoicingCustomers.setId((Object)IdManager.getInstance().nextId());
                        invoicingCustomers.setMerchantApplyRangeId((Long)mar.getId());
                        invoicingCustomers.setMerchantId(ic.getMerchantId());
                        invoicingCustomers.setIsDefault(ic.getIsDefault());
                        invoicingCustomers.setInvoicingCustomersId(ic.getInvoicingCustomersId());
                        invoicingCustomers.setEntityStatus(EntityStatus.Insert);
                        newInvoicingCustomersList.add(invoicingCustomers);
                    }
                }
                if (!CollectionUtils.isEmpty((Collection)customerAreaList) && !CollectionUtils.isEmpty((Collection)distributePrincipleOrgList) && distributePrincipleOrgList.contains(mar.getOrgId())) {
                    for (CustomerArea customerArea : customerAreaList) {
                        CustomerArea customerAreaRange = new CustomerArea();
                        customerAreaRange.setId((Object)IdManager.getInstance().nextId());
                        customerAreaRange.setmerchantApplyRangeId((Long)mar.getId());
                        customerAreaRange.setMerchantId(mar.getMerchantId());
                        customerAreaRange.setSaleAreaId(customerArea.getSaleAreaId());
                        customerAreaRange.setIsDefault(customerArea.getIsDefault());
                        customerAreaRange.setEntityStatus(EntityStatus.Insert);
                        newCustomerAreaList.add(customerAreaRange);
                    }
                }
                if (CollectionUtils.isEmpty((Collection)principalList) || CollectionUtils.isEmpty((Collection)distributePrincipleOrgList) || !distributePrincipleOrgList.contains(mar.getOrgId())) continue;
                for (Principal principal : principalList) {
                    Principal principalRange = new Principal();
                    principalRange.setId((Object)IdManager.getInstance().nextId());
                    principalRange.setMerchantApplyRangeId((Long)mar.getId());
                    principalRange.setMerchantId(mar.getMerchantId());
                    principalRange.setSpecialManagementDep(principal.getSpecialManagementDep());
                    principalRange.setProfessSalesman(principal.getProfessSalesman());
                    principalRange.setIsDefault(principal.getIsDefault());
                    principalRange.setEntityStatus(EntityStatus.Insert);
                    newPrincipalList.add(principalRange);
                }
            }
            if (!CollectionUtils.isEmpty(newCustomerAreaList)) {
                merchant.setCustomerAreas(newCustomerAreaList);
            }
            if (!CollectionUtils.isEmpty(newPrincipalList)) {
                merchant.setPrincipals(newPrincipalList);
            }
            if (!CollectionUtils.isEmpty(newInvoicingCustomersList)) {
                merchant.setInvoicingCustomerss(newInvoicingCustomersList);
            }
        }
    }

    private void dealCustomerAreaAndPrincipal(Merchant merchant, Long merchantApplyRangeId) throws Exception {
        int delete;
        int insert;
        List customerAreaList = merchant.customerAreas();
        if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
            insert = 0;
            delete = 0;
            ArrayList<Long> customerAreaIdList = new ArrayList<Long>();
            for (CustomerArea ca : customerAreaList) {
                customerAreaIdList.add((Long)ca.getId());
                if (ca.getmerchantApplyRangeId() == null) {
                    ca.setmerchantApplyRangeId(merchantApplyRangeId);
                }
                if (ca.getIsDefault().booleanValue() && ca.getEntityStatus() != EntityStatus.Delete) {
                    ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setCustomerArea(ca.getSaleAreaId());
                    ++insert;
                    continue;
                }
                if (!ca.getIsDefault().booleanValue() || ca.getEntityStatus() != EntityStatus.Delete) continue;
                ++delete;
            }
            if (insert == 0 && delete != 0) {
                ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setCustomerArea(null);
            } else if (insert == 0) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_in(customerAreaIdList), QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"isDefault").eq((Object)1)}));
                List customerAreaInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
                if (CollectionUtils.isEmpty((Collection)customerAreaInDbList)) {
                    ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setCustomerArea(null);
                }
            }
        } else {
            ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).remove("customerArea");
        }
        List principalList = merchant.principals();
        if (!CollectionUtils.isEmpty((Collection)principalList)) {
            insert = 0;
            delete = 0;
            ArrayList<Long> principalIdList = new ArrayList<Long>();
            for (Principal pc : principalList) {
                principalIdList.add((Long)pc.getId());
                if (pc.getMerchantApplyRangeId() == null) {
                    pc.setMerchantApplyRangeId(merchantApplyRangeId);
                }
                if (pc.getIsDefault().booleanValue() && pc.getEntityStatus() != EntityStatus.Delete) {
                    ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setSpecialManagementDep(pc.getSpecialManagementDep());
                    ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setProfessSalesman(pc.getProfessSalesman());
                    ++insert;
                    continue;
                }
                if (!pc.getIsDefault().booleanValue() || pc.getEntityStatus() != EntityStatus.Delete) continue;
                ++delete;
            }
            if (insert == 0 && delete != 0) {
                ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setSpecialManagementDep(null);
                ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setProfessSalesman(null);
            } else if (insert == 0) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_in(principalIdList), QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"isDefault").eq((Object)1)}));
                List principalInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
                if (CollectionUtils.isEmpty((Collection)principalInDbList)) {
                    ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setSpecialManagementDep(null);
                    ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).setProfessSalesman(null);
                }
            }
        } else {
            ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).remove("specialManagementDep");
            ((MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0)).remove("professSalesman");
        }
        List invoicingCustomersList = merchant.invoicingCustomerss();
        if (!CollectionUtils.isEmpty((Collection)invoicingCustomersList)) {
            for (InvoicingCustomers ic : invoicingCustomersList) {
                if (ic.getMerchantApplyRangeId() != null) continue;
                ic.setMerchantApplyRangeId(merchantApplyRangeId);
            }
        }
    }

    private void defaultInvoicingCustomers(Merchant merchant) throws Exception {
        InvoicingCustomers invoicingCustomer;
        ArrayList<InvoicingCustomers> invoicingCustomersList;
        if (merchant.getEntityStatus() == EntityStatus.Insert && CollectionUtils.isEmpty((Collection)merchant.invoicingCustomerss()) && !CollectionUtils.isEmpty((Collection)merchant.merchantApplyRanges())) {
            for (MerchantApplyRange merchantApplyRange : merchant.merchantApplyRanges()) {
                if (!merchantApplyRange.getIsCreator().booleanValue()) continue;
                invoicingCustomersList = new ArrayList<InvoicingCustomers>();
                invoicingCustomer = new InvoicingCustomers();
                invoicingCustomer.setIsDefault(Boolean.valueOf(true));
                invoicingCustomer.setId((Object)IdManager.getInstance().nextId());
                invoicingCustomer.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
                invoicingCustomer.setInvoicingCustomersId((Long)merchant.getId());
                invoicingCustomer.setMerchantId((Long)merchant.getId());
                invoicingCustomer.setEntityStatus(EntityStatus.Insert);
                invoicingCustomersList.add(invoicingCustomer);
                merchant.setInvoicingCustomerss(invoicingCustomersList);
            }
        }
        if (merchant.getEntityStatus() == EntityStatus.Update && CollectionUtils.isEmpty((Collection)merchant.invoicingCustomerss()) && merchant.get("merchantApplyRangeId") != null) {
            QuerySchema querySchema = null;
            querySchema = QuerySchema.create();
            querySchema.addSelect("*");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq(merchant.get("merchantApplyRangeId"))}));
            List ics = MetaDaoHelper.query((String)"aa.merchant.InvoicingCustomers", (QuerySchema)querySchema);
            if (CollectionUtils.isEmpty((Collection)ics)) {
                invoicingCustomersList = new ArrayList();
                invoicingCustomer = new InvoicingCustomers();
                invoicingCustomer.setIsDefault(Boolean.valueOf(true));
                invoicingCustomer.setId((Object)IdManager.getInstance().nextId());
                invoicingCustomer.setMerchantApplyRangeId(Long.valueOf(Long.parseLong(merchant.get("merchantApplyRangeId").toString())));
                invoicingCustomer.setInvoicingCustomersId((Long)merchant.getId());
                invoicingCustomer.setMerchantId((Long)merchant.getId());
                invoicingCustomer.setEntityStatus(EntityStatus.Insert);
                invoicingCustomersList.add(invoicingCustomer);
                merchant.setInvoicingCustomerss(invoicingCustomersList);
            }
        }
    }

    private Boolean channMerchant(Merchant merchant) throws Exception {
        Boolean channelIdentification;
        block21: {
            List customerAreaList;
            List merchantApplyRangeDetailList;
            block20: {
                channelIdentification = true;
                if (merchant.containsKey((Object)"customerIndustry")) {
                    merchant.setChannCustomerIndustry(merchant.getCustomerIndustry());
                    channelIdentification = false;
                }
                if (merchant.containsKey((Object)"customerClass")) {
                    merchant.setChannCustomerClass(merchant.getCustomerClass());
                    channelIdentification = false;
                } else if (!merchant.containsKey((Object)"customerClass") && merchant.containsKey((Object)"channCustomerClass")) {
                    merchant.setCustomerClass(merchant.getChannCustomerClass());
                    channelIdentification = false;
                }
                merchantApplyRangeDetailList = merchant.merchantAppliedDetail();
                customerAreaList = merchant.customerAreas();
                if (merchant.getEntityStatus() != EntityStatus.Insert) break block20;
                if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList)) {
                    merchant.setChannCustomerLevel(((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getCustomerLevel());
                }
                if (CollectionUtils.isEmpty((Collection)customerAreaList)) break block21;
                for (CustomerArea customerArea : customerAreaList) {
                    if (!customerArea.getIsDefault().booleanValue()) continue;
                    merchant.setChannCustomerArea(customerArea.getSaleAreaId());
                }
                break block21;
            }
            if (merchant.getEntityStatus() == EntityStatus.Update) {
                Boolean isCreator = (Boolean)merchant.get("isCreator");
                if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList) || !CollectionUtils.isEmpty((Collection)customerAreaList)) {
                    List sqlMerchant;
                    QuerySchema querySchema = QuerySchema.create();
                    querySchema.addSelect("orgId").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.get("merchantApplyRangeId")), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                    List merchantApplyRangeList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
                    String parentManageOrg = null;
                    if (MerchantUtils.isExists((Map)merchant, (String)"parentManageOrg")) {
                        parentManageOrg = merchant.getParentManageOrg();
                    } else {
                        querySchema = QuerySchema.create();
                        querySchema.addSelect("parentManageOrg").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
                        sqlMerchant = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
                        if (!CollectionUtils.isEmpty((Collection)sqlMerchant)) {
                            parentManageOrg = (String)((Map)sqlMerchant.get(0)).get("parentManageOrg");
                        }
                    }
                    if (parentManageOrg != null && !"".equals(parentManageOrg)) {
                        if (isCreator.booleanValue()) {
                            querySchema = QuerySchema.create();
                            querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId()), QueryCondition.name((String)"parentManageOrg").eq((Object)parentManageOrg)}));
                            sqlMerchant = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
                            if (CollectionUtils.isEmpty((Collection)sqlMerchant)) {
                                querySchema = QuerySchema.create();
                                querySchema.addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"orgId").eq((Object)parentManageOrg), QueryCondition.name((String)"isPotential").eq((Object)false)}));
                                List merchantApplyRange1 = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
                                if (!CollectionUtils.isEmpty((Collection)merchantApplyRange1)) {
                                    querySchema = QuerySchema.create();
                                    querySchema.addSelect("customerLevel,customerArea").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq(((Map)merchantApplyRange1.get(0)).get("id"))}));
                                    List merchantApplyRangeDetail = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema);
                                    if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetail)) {
                                        merchant.set("channCustomerLevel", ((Map)merchantApplyRangeDetail.get(0)).get("customerLevel"));
                                        merchant.set("channCustomerArea", ((Map)merchantApplyRangeDetail.get(0)).get("customerArea"));
                                        channelIdentification = false;
                                    }
                                }
                            }
                        }
                        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeList) && parentManageOrg.equals(((Map)merchantApplyRangeList.get(0)).get("orgId"))) {
                            if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList) && ((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getCustomerLevel() != null) {
                                merchant.setChannCustomerLevel(((MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0)).getCustomerLevel());
                                channelIdentification = false;
                            }
                            if (!CollectionUtils.isEmpty((Collection)customerAreaList)) {
                                for (CustomerArea customerArea : customerAreaList) {
                                    if (!customerArea.getIsDefault().booleanValue()) continue;
                                    merchant.setChannCustomerArea(customerArea.getSaleAreaId());
                                    channelIdentification = false;
                                }
                            }
                        }
                    }
                }
            }
        }
        return channelIdentification;
    }

    private void setMerchantApplyRangeDetailCharacter(Merchant merchant) {
        List merchantApplyRangeDetailList;
        if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
            return;
        }
        if (merchant.getEntityStatus() == EntityStatus.Insert && !CollectionUtils.isEmpty((Collection)(merchantApplyRangeDetailList = merchant.merchantAppliedDetail()))) {
            String merchantApplyRangeDetailCharacterId = null;
            for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                if (!merchantApplyRangeDetail.containsKey((Object)"merchantApplyRangeDetailCharacter") || !(merchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter") instanceof BizObject)) continue;
                BizObject merchantApplyRangeDetailCharacter = ((BizObject)merchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter")).clone();
                if (merchantApplyRangeDetailCharacterId == null) {
                    merchantApplyRangeDetailCharacterId = (String)merchantApplyRangeDetailCharacter.getId();
                    continue;
                }
                if (!merchantApplyRangeDetailCharacterId.equals(merchantApplyRangeDetailCharacter.getId()) || merchantApplyRangeDetailCharacter.getEntityStatus() != EntityStatus.Insert) continue;
                merchantApplyRangeDetailCharacter.setId((Object)IdManager.getInstance().nextId());
                merchantApplyRangeDetail.set("merchantApplyRangeDetailCharacter", (Object)merchantApplyRangeDetailCharacter);
            }
        }
    }

    private String getFirstSpell(String merchantName) {
        try {
            return PingYinUtil.getFirstSpell((String)merchantName);
        }
        catch (Exception e) {
            log.error(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800391.getMessage(), (Throwable)e);
            return null;
        }
    }

    public void caseUpdateMerchantCodeForCodingRule(Merchant merchant) throws Exception {
        QuerySchema schema;
        List bizObjects;
        BillCodeComponentParam billCodeParam = new BillCodeComponentParam("productcenter.aa_merchant", "aa_merchant", AppContext.getCurrentUser().getYxyTenantId(), "-1");
        BillCodeContext context = this.billCodeComponentService.getBillCodeContext(billCodeParam);
        BillNumberPO billNumberPO = (BillNumberPO)context.getBillNumber();
        if (billNumberPO.getBillnumMode() == 0 || billNumberPO.getCallTime() == null || billNumberPO.getCallTime() != 0) {
            return;
        }
        List billPrefixList = billNumberPO.getBillPrefix();
        if (CollectionUtils.isEmpty((Collection)billPrefixList)) {
            return;
        }
        HashSet<String> mainFieldNameSet = new HashSet<String>();
        HashSet<String> merchantCharacterFieldSet = new HashSet<String>();
        for (BillPrefixPO prefix : billPrefixList) {
            String rootFieldName;
            int delimiterPos;
            String fieldName;
            if (prefix.getCprefixtype() != null && prefix.getCprefixtype() != 0 || StringUtils.isBlank((CharSequence)(fieldName = prefix.getCfieldname()))) continue;
            if (fieldName.contains("merchantCharacter")) {
                delimiterPos = fieldName.indexOf(46);
            } else {
                delimiterPos = fieldName.indexOf(95);
                if (delimiterPos == -1) {
                    delimiterPos = fieldName.indexOf(46);
                }
            }
            String subFieldName = null;
            if (delimiterPos != -1) {
                rootFieldName = fieldName.substring(0, delimiterPos);
                subFieldName = fieldName.substring(delimiterPos + 1);
            } else {
                rootFieldName = fieldName;
            }
            if ("merchantCharacter".equals(rootFieldName)) {
                String firstLevelField;
                if (!StringUtils.isNotBlank(subFieldName)) continue;
                int subDelimiterPos = subFieldName.indexOf(46);
                String string = firstLevelField = subDelimiterPos != -1 ? subFieldName.substring(0, subDelimiterPos) : subFieldName;
                if (merchant.get("merchantCharacter") == null || !((Map)merchant.get("merchantCharacter")).containsKey(firstLevelField)) continue;
                merchantCharacterFieldSet.add(firstLevelField);
                continue;
            }
            if (!merchant.containsKey((Object)rootFieldName)) continue;
            mainFieldNameSet.add(rootFieldName);
        }
        if (mainFieldNameSet.isEmpty() && merchantCharacterFieldSet.isEmpty()) {
            return;
        }
        ArrayList<QueryField> queryFields = new ArrayList<QueryField>();
        queryFields.add(new QueryField("id"));
        mainFieldNameSet.forEach(field -> queryFields.add(new QueryField(field)));
        if (!merchantCharacterFieldSet.isEmpty()) {
            queryFields.add(new QueryField("merchantCharacter"));
        }
        if (CollectionUtils.isEmpty((Collection)(bizObjects = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)(schema = QuerySchema.create().addSelect(queryFields.toArray(new QueryField[0])).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.get("id"))}))), null)))) {
            return;
        }
        BizObject latestMerchant = (BizObject)bizObjects.get(0);
        boolean mainChanged = BizObjectUtils.compareBizObjectForFields((BizObject)merchant, (BizObject)latestMerchant, mainFieldNameSet);
        boolean characterChanged = false;
        if (!merchantCharacterFieldSet.isEmpty()) {
            characterChanged = BizObjectUtils.compareBizObjectForFields((BizObject)((BizObject)merchant.get("merchantCharacter")), (BizObject)((BizObject)latestMerchant.get("merchantCharacter")), merchantCharacterFieldSet);
        }
        if (mainChanged || characterChanged) {
            merchant.put("forceUpdateCode", (Object)true);
        }
    }

    private void setMerchantCustomerAreaForExport(Merchant merchant) {
        List principals;
        List invoicingCustomers;
        List customerAreas = merchant.customerAreas();
        if (!CollectionUtils.isEmpty((Collection)customerAreas)) {
            customerAreas.stream().forEach(customerArea -> {
                if (customerArea.getIsDefault() != null && customerArea.getIsDefault().booleanValue() && customerArea.getSaleAreaId() != null) {
                    merchant.setCustomerArea(customerArea.getSaleAreaId());
                }
            });
        }
        if (!CollectionUtils.isEmpty((Collection)(invoicingCustomers = merchant.invoicingCustomerss()))) {
            invoicingCustomers.stream().forEach(invoicingCustomer -> {
                if (invoicingCustomer.getIsDefault() != null && invoicingCustomer.getIsDefault().booleanValue() && invoicingCustomer.getInvoicingCustomersId() != null) {
                    merchant.setInvoicingCustomers(invoicingCustomer.getInvoicingCustomersId());
                }
            });
        }
        if (!CollectionUtils.isEmpty((Collection)(principals = merchant.principals()))) {
            principals.stream().forEach(principal -> {
                if (principal.getIsDefault() != null && principal.getIsDefault().booleanValue() && principal.getProfessSalesman() != null) {
                    merchant.setPersonCharge(principal.getProfessSalesman());
                }
            });
        }
    }

    private void migrationMerchant(Merchant merchant) {
        List merchantApplyRangeDetailList = merchant.merchantAppliedDetail();
        if (!CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList)) {
            for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                if (merchantApplyRangeDetail.getMerchantApplyRangeId() == null || merchantApplyRangeDetail.getMerchantApplyRangeExtId() == null) continue;
                merchantApplyRangeDetail.remove("merchantApplyRangeExtId");
            }
        }
    }

    public void setMerchantBusinessRoleTime(Merchant merchant) {
        if (!CollectionUtils.isEmpty((Collection)merchant.merchantBusinessRoleTime()) && merchant.merchantBusinessRoleTime().get(0) != null) {
            for (MerchantBusinessRoleTime merchantBusinessRoleTime : merchant.merchantBusinessRoleTime()) {
                if (merchantBusinessRoleTime.getEntityStatus().equals((Object)EntityStatus.Delete)) continue;
                if (merchantBusinessRoleTime.getRoleTimeStopstatus() != null && merchantBusinessRoleTime.getRoleTimeStopstatus().booleanValue()) {
                    merchantBusinessRoleTime.setActivationTime(null);
                    merchantBusinessRoleTime.setDisableTime(new Date());
                    continue;
                }
                merchantBusinessRoleTime.setActivationTime(new Date());
                merchantBusinessRoleTime.setDisableTime(null);
            }
        }
    }

    public List<MerchantApplyRange> getIsAppliedMerchantApplyRangeList(Merchant merchant, Long merchantApplyRangeId, DocAttributeControlConfigDTO docAttributeControlConfigDTO) throws Exception {
        if (merchant.getId() != null) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,isApplied,orgId,merchantDetailId");
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isCreator").eq((Object)false), QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"id").not_eq((Object)merchantApplyRangeId), QueryCondition.name((String)"isPotential").eq((Object)false)});
            if (!this.merchantGroupService.getIsExistControlType(docAttributeControlConfigDTO)) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"isApplied").eq((Object)false));
            }
            querySchema.addCondition((ConditionExpression)queryConditionGroup);
            List originalMerchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)originalMerchantApplyRangeList)) {
                return originalMerchantApplyRangeList;
            }
        }
        return null;
    }

    public MerchantApplyRangeDetail initCreatorMerchantApplyRangeDetail(Merchant merchant) {
        String merchantName;
        MerchantApplyRangeDetail merchantApplyRangeDetailIsCreator;
        if (merchant.merchantAppliedDetail() == null) {
            merchantApplyRangeDetailIsCreator = new MerchantApplyRangeDetail();
            merchantApplyRangeDetailIsCreator.setEntityStatus(EntityStatus.Insert);
        } else {
            merchantApplyRangeDetailIsCreator = (MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0);
        }
        if (merchantApplyRangeDetailIsCreator.getSearchcode() == null && !StringUtils.isEmpty((CharSequence)(merchantName = (String)MultilangUtil.getAttr((String)"aa.merchant.Merchant", (String)"name", (BizObject)merchant, null)))) {
            merchantApplyRangeDetailIsCreator.setSearchcode(this.getFirstSpell(merchantName));
        }
        merchantApplyRangeDetailIsCreator.setCreateTime(new Date());
        merchantApplyRangeDetailIsCreator.setCreateDate(new Date());
        if (merchantApplyRangeDetailIsCreator.getCreator() == null) {
            merchantApplyRangeDetailIsCreator.setCreator(AppContext.getCurrentUser().getName());
        }
        if (merchantApplyRangeDetailIsCreator.getCreatorId() == null) {
            merchantApplyRangeDetailIsCreator.setCreatorId((Long)AppContext.getCurrentUser().getId());
        }
        merchantApplyRangeDetailIsCreator.setModifyTime(new Date());
        merchantApplyRangeDetailIsCreator.setModifyDate(new Date());
        if (merchantApplyRangeDetailIsCreator.getModifier() == null) {
            merchantApplyRangeDetailIsCreator.setModifier(AppContext.getCurrentUser().getName());
            merchantApplyRangeDetailIsCreator.setModifierId((Long)AppContext.getCurrentUser().getId());
        }
        return merchantApplyRangeDetailIsCreator;
    }

    public MerchantApplyRangeDetail initUpdateMerchantApplyRangeDetail(Merchant merchant, Long merchantApplyRangeId) throws Exception {
        Map<String, Object> merchantApplyRange;
        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
        if (CollectionUtils.isEmpty((Collection)merchant.merchantAppliedDetail())) {
            merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
            merchantApplyRangeDetail.setMerchantId((Long)merchant.getId());
            merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
        } else {
            merchantApplyRangeDetail = (MerchantApplyRangeDetail)merchant.merchantAppliedDetail().get(0);
            merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
            merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
        }
        if (merchant.get("belongOrg") != null && BooleanUtil.isFalse((Object)merchant.get("isCreator")) && merchantApplyRangeDetail.containsKey((Object)"merchantApplyRangeDetailCharacter") && merchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter") instanceof BizObject && (merchantApplyRange = this.getMerchantApplyRange(merchant)).get("isApplied") != null && BooleanUtil.isFalse((Object)merchantApplyRange.get("isApplied"))) {
            BizObject merchantApplyRangeDetailCharacter = ((BizObject)merchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter")).clone();
            merchantApplyRangeDetailCharacter.setId((Object)IdManager.getInstance().nextId());
            merchantApplyRangeDetailCharacter.setEntityStatus(EntityStatus.Insert);
            merchantApplyRangeDetail.set("merchantApplyRangeDetailCharacter", (Object)merchantApplyRangeDetailCharacter);
        }
        merchantApplyRangeDetail.setModifyTime(new Date());
        merchantApplyRangeDetail.setModifyDate(new Date());
        if (merchantApplyRangeDetail.getModifier() == null) {
            merchantApplyRangeDetail.setModifier(AppContext.getCurrentUser().getName());
            merchantApplyRangeDetail.setModifierId((Long)AppContext.getCurrentUser().getId());
        }
        return merchantApplyRangeDetail;
    }

    public void deleteMerchantApplyRange(Merchant merchant) throws Exception {
        if (!CollectionUtils.isEmpty((Collection)merchant.merchantApplyRanges())) {
            ArrayList delCollects = new ArrayList();
            merchant.merchantApplyRanges().stream().filter(applyRange -> EntityStatus.Delete.equals((Object)applyRange.getEntityStatus())).forEach(merchantApplyRange -> {
                merchantApplyRange.setParentBizObject(null);
                delCollects.add(merchantApplyRange);
            });
            if (!CollectionUtils.isEmpty(delCollects)) {
                merchant.put("deletedRangs", delCollects);
                for (MerchantApplyRange mar : delCollects) {
                    List deleteInvoicingCustomersList;
                    List deletePrincipalList;
                    QuerySchema querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)mar.getMerchantId()), QueryCondition.name((String)"merchantApplyRangeId").eq(mar.getId())}));
                    List deleteCustomerAreaList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)deleteCustomerAreaList)) {
                        for (Object ca : deleteCustomerAreaList) {
                            ca.setEntityStatus(EntityStatus.Delete);
                            MetaDaoHelper.delete((String)"aa.merchant.CustomerArea", (BizObject)ca);
                        }
                    }
                    if (!CollectionUtils.isEmpty((Collection)(deletePrincipalList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null)))) {
                        Object ca;
                        ca = deletePrincipalList.iterator();
                        while (ca.hasNext()) {
                            Principal pc = (Principal)ca.next();
                            pc.setEntityStatus(EntityStatus.Delete);
                            MetaDaoHelper.delete((String)"aa.merchant.Principal", (BizObject)pc);
                        }
                    }
                    if (CollectionUtils.isEmpty((Collection)(deleteInvoicingCustomersList = MetaDaoHelper.queryObject((String)"aa.merchant.InvoicingCustomers", (QuerySchema)querySchema, null)))) continue;
                    for (InvoicingCustomers ic : deleteInvoicingCustomersList) {
                        ic.setEntityStatus(EntityStatus.Delete);
                        MetaDaoHelper.delete((String)"aa.merchant.InvoicingCustomers", (BizObject)ic);
                    }
                }
            }
        }
    }

    public MerchantApplyRangeDetail copyCreatorMerchantApplyRangeDetail(MerchantApplyRangeDetail creatorMerchantApplyRangeDetail, Long merchantApplyRangeId, List<DocAttributeControlConfig> docAttributeControlConfigList, EntityStatus status) {
        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
        merchantApplyRangeDetail.init((Map)creatorMerchantApplyRangeDetail);
        if (!CollectionUtils.isEmpty(docAttributeControlConfigList)) {
            HashMap<String, String> convertMerchantApplyRangeDetailMap = new HashMap<String, String>();
            for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                if (status == EntityStatus.Insert) {
                    if (String.valueOf(CarryType.FromDefault.getValue()).equals(docAttributeControlConfig.getCarryType())) {
                        convertMerchantApplyRangeDetailMap.put(docAttributeControlConfig.getAttributeCode(), docAttributeControlConfig.getAttributeDefaultValue());
                        continue;
                    }
                    if (!String.valueOf(CarryType.NotCarry.getValue()).equals(docAttributeControlConfig.getCarryType())) continue;
                    merchantApplyRangeDetail.remove(docAttributeControlConfig.getAttributeCode());
                    continue;
                }
                if (status != EntityStatus.Update || !String.valueOf(ControlType.OwnOrgControl.getValue()).equals(docAttributeControlConfig.getControlType())) continue;
                merchantApplyRangeDetail.remove(docAttributeControlConfig.getAttributeCode());
            }
            if (!CollectionUtils.isEmpty(convertMerchantApplyRangeDetailMap)) {
                merchantApplyRangeDetail.putAll((Map)Objectlizer.convert(convertMerchantApplyRangeDetailMap, (String)"aa.merchant.MerchantApplyRangeDetail"));
            }
        }
        merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
        merchantApplyRangeDetail.remove("customerArea");
        merchantApplyRangeDetail.remove("professSalesman");
        merchantApplyRangeDetail.remove("specialManagementDep");
        merchantApplyRangeDetail.remove("merchantApplyRangeDetailCharacter");
        if (status == EntityStatus.Insert && creatorMerchantApplyRangeDetail.containsKey((Object)"merchantApplyRangeDetailCharacter") && creatorMerchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter") instanceof BizObject) {
            BizObject merchantApplyRangeDetailCharacter = ((BizObject)creatorMerchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter")).clone();
            merchantApplyRangeDetailCharacter.setId((Object)IdManager.getInstance().nextId());
            merchantApplyRangeDetailCharacter.setEntityStatus(EntityStatus.Insert);
            merchantApplyRangeDetail.set("merchantApplyRangeDetailCharacter", (Object)merchantApplyRangeDetailCharacter);
        }
        merchantApplyRangeDetail.setEntityStatus(status);
        return merchantApplyRangeDetail;
    }

    public void setUpdateUserMerchantApplyRangeDetail(MerchantApplyRangeDetail userMerchantApplyRangeDetail, List<DocAttributeControlConfig> docAttributeControlConfigList) {
        if (!CollectionUtils.isEmpty(docAttributeControlConfigList)) {
            for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                if (!String.valueOf(ControlType.ManageOrgControl.getValue()).equals(docAttributeControlConfig.getControlType())) continue;
                userMerchantApplyRangeDetail.remove(docAttributeControlConfig.getAttributeCode());
            }
        }
    }

    public void setUpdateUserCustomerArea(Merchant merchant, List<DocAttributeControlConfig> docAttributeControlConfigList) {
        if (!CollectionUtils.isEmpty(docAttributeControlConfigList)) {
            DocAttributeControlConfig docAttributeControlConfigSaleArea = new DocAttributeControlConfig();
            for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                if (!"CustomerArea".equals(docAttributeControlConfig.getAttributeCode())) continue;
                docAttributeControlConfigSaleArea = docAttributeControlConfig;
            }
            if (String.valueOf(ControlType.ManageOrgControl.getValue()).equals(docAttributeControlConfigSaleArea.getControlType())) {
                merchant.setCustomerAreas(null);
            }
        }
    }

    public void setUpdateUserPrincipal(Merchant merchant, List<DocAttributeControlConfig> docAttributeControlConfigList) {
        if (!CollectionUtils.isEmpty(docAttributeControlConfigList)) {
            DocAttributeControlConfig controlConfigProfessSalesman = new DocAttributeControlConfig();
            for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                if (!"Principal".equals(docAttributeControlConfig.getAttributeCode())) continue;
                controlConfigProfessSalesman = docAttributeControlConfig;
            }
            if (String.valueOf(ControlType.ManageOrgControl.getValue()).equals(controlConfigProfessSalesman.getControlType())) {
                merchant.setPrincipals(null);
            }
        }
    }

    public void setUpdateUserInvoicingCustomer(Merchant merchant, List<DocAttributeControlConfig> docAttributeControlConfigList) {
        if (!CollectionUtils.isEmpty(docAttributeControlConfigList)) {
            DocAttributeControlConfig controlConfigInvoice = new DocAttributeControlConfig();
            for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                if (!"InvoicingCustomers".equals(docAttributeControlConfig.getAttributeCode())) continue;
                controlConfigInvoice = docAttributeControlConfig;
            }
            if (String.valueOf(ControlType.ManageOrgControl.getValue()).equals(controlConfigInvoice.getControlType())) {
                merchant.setInvoicingCustomerss(null);
            }
        }
    }

    public void setMerchantApplyRangeDetailDefault(MerchantApplyRangeDetail merchantApplyRangeDetail, List<CustomerArea> customerAreaList, List<Principal> principalList) {
        boolean isDefault;
        if (!CollectionUtils.isEmpty(customerAreaList)) {
            isDefault = false;
            for (CustomerArea creatorCustomerArea : customerAreaList) {
                if (creatorCustomerArea.getEntityStatus() == EntityStatus.Delete || !creatorCustomerArea.getIsDefault().booleanValue() || !Objects.equals(creatorCustomerArea.getmerchantApplyRangeId(), merchantApplyRangeDetail.getMerchantApplyRangeId())) continue;
                merchantApplyRangeDetail.setCustomerArea(creatorCustomerArea.getSaleAreaId());
                isDefault = true;
            }
            if (!isDefault) {
                for (CustomerArea creatorCustomerArea : customerAreaList) {
                    if (creatorCustomerArea.getEntityStatus() != EntityStatus.Delete || !creatorCustomerArea.getIsDefault().booleanValue() || !Objects.equals(creatorCustomerArea.getmerchantApplyRangeId(), merchantApplyRangeDetail.getMerchantApplyRangeId())) continue;
                    merchantApplyRangeDetail.setCustomerArea(null);
                }
            }
        }
        if (!CollectionUtils.isEmpty(principalList)) {
            isDefault = false;
            for (Principal creatorPrincipal : principalList) {
                if (creatorPrincipal.getEntityStatus() == EntityStatus.Delete || !creatorPrincipal.getIsDefault().booleanValue() || !Objects.equals(creatorPrincipal.getMerchantApplyRangeId(), merchantApplyRangeDetail.getMerchantApplyRangeId())) continue;
                merchantApplyRangeDetail.setProfessSalesman(creatorPrincipal.getProfessSalesman());
                merchantApplyRangeDetail.setSpecialManagementDep(creatorPrincipal.getSpecialManagementDep());
                isDefault = true;
            }
            if (!isDefault) {
                for (Principal creatorPrincipal : principalList) {
                    if (creatorPrincipal.getEntityStatus() != EntityStatus.Delete || !creatorPrincipal.getIsDefault().booleanValue() || !Objects.equals(creatorPrincipal.getMerchantApplyRangeId(), merchantApplyRangeDetail.getMerchantApplyRangeId())) continue;
                    merchantApplyRangeDetail.setProfessSalesman(null);
                    merchantApplyRangeDetail.setSpecialManagementDep(null);
                }
            }
        }
    }

    public void setMerchantDefault(Merchant merchant, List<CustomerArea> customerAreaList, List<InvoicingCustomers> invoicingCustomersList) {
        if (!CollectionUtils.isEmpty(customerAreaList)) {
            for (CustomerArea creatorCustomerArea : customerAreaList) {
                if (creatorCustomerArea.getEntityStatus() == EntityStatus.Delete || !creatorCustomerArea.getIsDefault().booleanValue()) continue;
                merchant.setCustomerArea(creatorCustomerArea.getSaleAreaId());
                merchant.set("customerArea_code", creatorCustomerArea.get("saleAreaId_code"));
            }
        }
        if (!CollectionUtils.isEmpty(invoicingCustomersList)) {
            for (InvoicingCustomers invoicingCustomer : invoicingCustomersList) {
                if (invoicingCustomer.getEntityStatus() == EntityStatus.Delete || !invoicingCustomer.getIsDefault().booleanValue()) continue;
                merchant.setInvoicingCustomers(invoicingCustomer.getInvoicingCustomersId());
            }
        }
    }

    public List<InvoicingCustomers> copyCreatorInvoicingCustomerList(List<InvoicingCustomers> creatorInvoicingCustomersList, Long merchantId, Long merchantApplyRangeId, List<DocAttributeControlConfig> docAttributeControlConfigList, EntityStatus status) throws Exception {
        ArrayList<InvoicingCustomers> invoicingCustomersList;
        block11: {
            block9: {
                DocAttributeControlConfig controlConfigInvoice;
                block10: {
                    invoicingCustomersList = new ArrayList<InvoicingCustomers>();
                    if (CollectionUtils.isEmpty(docAttributeControlConfigList)) break block9;
                    controlConfigInvoice = new DocAttributeControlConfig();
                    for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                        if (!"InvoicingCustomers".equals(docAttributeControlConfig.getAttributeCode())) continue;
                        controlConfigInvoice = docAttributeControlConfig;
                    }
                    if (!String.valueOf(ControlType.OwnOrgControl.getValue()).equals(controlConfigInvoice.getControlType())) break block10;
                    if (EntityStatus.Insert != status || !String.valueOf(CarryType.FromManage.getValue()).equals(controlConfigInvoice.getCarryType()) || CollectionUtils.isEmpty(creatorInvoicingCustomersList)) break block11;
                    for (InvoicingCustomers creatorInvoicingCustomer : creatorInvoicingCustomersList) {
                        InvoicingCustomers invoicingCustomer = this.initInvoicingCustomer(creatorInvoicingCustomer.getMerchantId(), merchantApplyRangeId, creatorInvoicingCustomer.getInvoicingCustomersId(), creatorInvoicingCustomer.getIsDefault());
                        invoicingCustomersList.add(invoicingCustomer);
                    }
                    break block11;
                }
                if (!String.valueOf(ControlType.ManageOrgControl.getValue()).equals(controlConfigInvoice.getControlType())) break block11;
                if (EntityStatus.Update == status) {
                    QuerySchema querySchema = QuerySchema.create().addSelect("id,merchantId,merchantApplyRangeId,invoicingCustomersId,isDefault");
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId)});
                    querySchema.addCondition((ConditionExpression)queryConditionGroup);
                    List invoicingCustomerInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.InvoicingCustomers", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)invoicingCustomerInDbList)) {
                        for (InvoicingCustomers invoicingCustomers : invoicingCustomerInDbList) {
                            invoicingCustomers.setEntityStatus(EntityStatus.Delete);
                            invoicingCustomersList.add(invoicingCustomers);
                        }
                    }
                }
                if (!CollectionUtils.isEmpty(creatorInvoicingCustomersList)) {
                    for (InvoicingCustomers creatorInvoicingCustomer : creatorInvoicingCustomersList) {
                        InvoicingCustomers invoicingCustomer = this.initInvoicingCustomer(creatorInvoicingCustomer.getMerchantId(), merchantApplyRangeId, creatorInvoicingCustomer.getInvoicingCustomersId(), creatorInvoicingCustomer.getIsDefault());
                        invoicingCustomersList.add(invoicingCustomer);
                    }
                }
                break block11;
            }
            if (EntityStatus.Insert == status && !CollectionUtils.isEmpty(creatorInvoicingCustomersList)) {
                for (InvoicingCustomers creatorInvoicingCustomer : creatorInvoicingCustomersList) {
                    InvoicingCustomers invoicingCustomer = this.initInvoicingCustomer(creatorInvoicingCustomer.getMerchantId(), merchantApplyRangeId, creatorInvoicingCustomer.getInvoicingCustomersId(), creatorInvoicingCustomer.getIsDefault());
                    invoicingCustomersList.add(invoicingCustomer);
                }
            }
        }
        return invoicingCustomersList;
    }

    public List<CustomerArea> copyCreatorCustomerAreaList(List<CustomerArea> creatorCustomerAreaList, Long merchantId, Long merchantApplyRangeId, Boolean isCustomerAreaIssueOrg, List<DocAttributeControlConfig> docAttributeControlConfigList, EntityStatus status) throws Exception {
        ArrayList<CustomerArea> customerAreaList;
        block14: {
            block12: {
                DocAttributeControlConfig docAttributeControlConfigSaleArea;
                block13: {
                    customerAreaList = new ArrayList<CustomerArea>();
                    if (CollectionUtils.isEmpty(docAttributeControlConfigList)) break block12;
                    docAttributeControlConfigSaleArea = new DocAttributeControlConfig();
                    for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                        if (!"CustomerArea".equals(docAttributeControlConfig.getAttributeCode())) continue;
                        docAttributeControlConfigSaleArea = docAttributeControlConfig;
                    }
                    if (!String.valueOf(ControlType.OwnOrgControl.getValue()).equals(docAttributeControlConfigSaleArea.getControlType())) break block13;
                    if (EntityStatus.Insert != status || !String.valueOf(CarryType.FromManage.getValue()).equals(docAttributeControlConfigSaleArea.getCarryType()) || CollectionUtils.isEmpty(creatorCustomerAreaList)) break block14;
                    for (CustomerArea creatorCustomerArea : creatorCustomerAreaList) {
                        CustomerArea customerArea = this.initCustomerArea(creatorCustomerArea.getMerchantId(), merchantApplyRangeId, creatorCustomerArea.getSaleAreaId(), creatorCustomerArea.getIsDefault());
                        if (creatorCustomerArea.containsKey((Object)"customerAreaCharacter") && creatorCustomerArea.get("customerAreaCharacter") instanceof BizObject) {
                            BizObject customerAreaCharacter = ((BizObject)creatorCustomerArea.get("customerAreaCharacter")).clone();
                            customerAreaCharacter.setId((Object)IdManager.getInstance().nextId());
                            customerAreaCharacter.setEntityStatus(EntityStatus.Insert);
                            customerArea.set("customerAreaCharacter", (Object)customerAreaCharacter);
                        }
                        customerAreaList.add(customerArea);
                    }
                    break block14;
                }
                if (!String.valueOf(ControlType.ManageOrgControl.getValue()).equals(docAttributeControlConfigSaleArea.getControlType())) break block14;
                if (EntityStatus.Update == status) {
                    QuerySchema querySchema = QuerySchema.create().addSelect("id,merchantId,merchantApplyRangeId,saleAreaId,isDefault");
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId)});
                    querySchema.addCondition((ConditionExpression)queryConditionGroup);
                    List customerAreaInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)customerAreaInDbList)) {
                        for (CustomerArea customerArea : customerAreaInDbList) {
                            customerArea.setEntityStatus(EntityStatus.Delete);
                            customerAreaList.add(customerArea);
                        }
                    }
                }
                if (!CollectionUtils.isEmpty(creatorCustomerAreaList)) {
                    for (CustomerArea creatorCustomerArea : creatorCustomerAreaList) {
                        CustomerArea customerArea = this.initCustomerArea(creatorCustomerArea.getMerchantId(), merchantApplyRangeId, creatorCustomerArea.getSaleAreaId(), creatorCustomerArea.getIsDefault());
                        if (creatorCustomerArea.containsKey((Object)"customerAreaCharacter") && creatorCustomerArea.get("customerAreaCharacter") instanceof BizObject) {
                            BizObject customerAreaCharacter = ((BizObject)creatorCustomerArea.get("customerAreaCharacter")).clone();
                            customerAreaCharacter.setId((Object)IdManager.getInstance().nextId());
                            customerAreaCharacter.setEntityStatus(EntityStatus.Insert);
                            customerArea.set("customerAreaCharacter", (Object)customerAreaCharacter);
                        }
                        customerAreaList.add(customerArea);
                    }
                }
                break block14;
            }
            if (isCustomerAreaIssueOrg.booleanValue() && EntityStatus.Insert == status && !CollectionUtils.isEmpty(creatorCustomerAreaList)) {
                for (CustomerArea creatorCustomerArea : creatorCustomerAreaList) {
                    CustomerArea customerArea = this.initCustomerArea(creatorCustomerArea.getMerchantId(), merchantApplyRangeId, creatorCustomerArea.getSaleAreaId(), creatorCustomerArea.getIsDefault());
                    if (creatorCustomerArea.containsKey((Object)"customerAreaCharacter") && creatorCustomerArea.get("customerAreaCharacter") instanceof BizObject) {
                        BizObject customerAreaCharacter = ((BizObject)creatorCustomerArea.get("customerAreaCharacter")).clone();
                        customerAreaCharacter.setId((Object)IdManager.getInstance().nextId());
                        customerAreaCharacter.setEntityStatus(EntityStatus.Insert);
                        customerArea.set("customerAreaCharacter", (Object)customerAreaCharacter);
                    }
                    customerAreaList.add(customerArea);
                }
            }
        }
        return customerAreaList;
    }

    public List<Principal> copyCreatorPrincipalList(List<Principal> creatorPrincipalList, Long merchantId, Long merchantApplyRangeId, Boolean isPrincipalIssueOrg, List<DocAttributeControlConfig> docAttributeControlConfigList, EntityStatus status) throws Exception {
        ArrayList<Principal> principalList;
        block14: {
            block12: {
                DocAttributeControlConfig controlConfigProfessSalesman;
                block13: {
                    principalList = new ArrayList<Principal>();
                    if (CollectionUtils.isEmpty(docAttributeControlConfigList)) break block12;
                    controlConfigProfessSalesman = new DocAttributeControlConfig();
                    for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                        if (!"Principal".equals(docAttributeControlConfig.getAttributeCode())) continue;
                        controlConfigProfessSalesman = docAttributeControlConfig;
                    }
                    if (!String.valueOf(ControlType.OwnOrgControl.getValue()).equals(controlConfigProfessSalesman.getControlType())) break block13;
                    if (EntityStatus.Insert != status || !String.valueOf(CarryType.FromManage.getValue()).equals(controlConfigProfessSalesman.getCarryType()) || CollectionUtils.isEmpty(creatorPrincipalList)) break block14;
                    for (Principal creatorPrincipal : creatorPrincipalList) {
                        Principal principal = this.initPrincipal(creatorPrincipal.getMerchantId(), merchantApplyRangeId, creatorPrincipal.getProfessSalesman(), creatorPrincipal.getSpecialManagementDep(), creatorPrincipal.getIsDefault());
                        if (creatorPrincipal.containsKey((Object)"principalCharacter") && creatorPrincipal.get("principalCharacter") instanceof BizObject) {
                            BizObject principalCharacter = ((BizObject)creatorPrincipal.get("principalCharacter")).clone();
                            principalCharacter.setId((Object)IdManager.getInstance().nextId());
                            principalCharacter.setEntityStatus(EntityStatus.Insert);
                            principal.set("principalCharacter", (Object)principalCharacter);
                        }
                        principalList.add(principal);
                    }
                    break block14;
                }
                if (!String.valueOf(ControlType.ManageOrgControl.getValue()).equals(controlConfigProfessSalesman.getControlType())) break block14;
                if (EntityStatus.Update == status) {
                    QuerySchema querySchema = QuerySchema.create().addSelect("id,merchantId,merchantApplyRangeId,specialManagementDep,professSalesman,isDefault");
                    QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId)});
                    querySchema.addCondition((ConditionExpression)queryConditionGroup);
                    List principalInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
                    if (!CollectionUtils.isEmpty((Collection)principalInDbList)) {
                        for (Principal principal : principalInDbList) {
                            principal.setEntityStatus(EntityStatus.Delete);
                            principalList.add(principal);
                        }
                    }
                }
                if (!CollectionUtils.isEmpty(creatorPrincipalList)) {
                    for (Principal creatorPrincipal : creatorPrincipalList) {
                        Principal principal = this.initPrincipal(creatorPrincipal.getMerchantId(), merchantApplyRangeId, creatorPrincipal.getProfessSalesman(), creatorPrincipal.getSpecialManagementDep(), creatorPrincipal.getIsDefault());
                        if (creatorPrincipal.containsKey((Object)"principalCharacter") && creatorPrincipal.get("principalCharacter") instanceof BizObject) {
                            BizObject principalCharacter = ((BizObject)creatorPrincipal.get("principalCharacter")).clone();
                            principalCharacter.setId((Object)IdManager.getInstance().nextId());
                            principalCharacter.setEntityStatus(EntityStatus.Insert);
                            principal.set("principalCharacter", (Object)principalCharacter);
                        }
                        principalList.add(principal);
                    }
                }
                break block14;
            }
            if (isPrincipalIssueOrg.booleanValue() && EntityStatus.Insert == status && !CollectionUtils.isEmpty(creatorPrincipalList)) {
                for (Principal creatorPrincipal : creatorPrincipalList) {
                    Principal principal = this.initPrincipal(creatorPrincipal.getMerchantId(), merchantApplyRangeId, creatorPrincipal.getProfessSalesman(), creatorPrincipal.getSpecialManagementDep(), creatorPrincipal.getIsDefault());
                    if (creatorPrincipal.containsKey((Object)"principalCharacter") && creatorPrincipal.get("principalCharacter") instanceof BizObject) {
                        BizObject principalCharacter = ((BizObject)creatorPrincipal.get("principalCharacter")).clone();
                        principalCharacter.setId((Object)IdManager.getInstance().nextId());
                        principalCharacter.setEntityStatus(EntityStatus.Insert);
                        principal.set("principalCharacter", (Object)principalCharacter);
                    }
                    principalList.add(principal);
                }
            }
        }
        return principalList;
    }

    public List<InvoicingCustomers> initCreatorInvoicingCustomerList(Merchant merchant, Long merchantApplyRangeId) {
        ArrayList<InvoicingCustomers> invoicingCustomersList = new ArrayList<InvoicingCustomers>();
        if (merchant.getEntityStatus() == EntityStatus.Insert) {
            if (CollectionUtils.isEmpty((Collection)merchant.invoicingCustomerss())) {
                InvoicingCustomers invoicingCustomer = this.initInvoicingCustomer((Long)merchant.getId(), merchantApplyRangeId, (Long)merchant.getId(), true);
                invoicingCustomersList.add(invoicingCustomer);
            } else {
                for (InvoicingCustomers invoicingCustomer : merchant.invoicingCustomerss()) {
                    invoicingCustomer.setMerchantApplyRangeId(merchantApplyRangeId);
                    invoicingCustomer.setMerchantId((Long)merchant.getId());
                    invoicingCustomersList.add(invoicingCustomer);
                }
            }
        }
        return invoicingCustomersList;
    }

    public List<InvoicingCustomers> getCreatorInvoicingCustomerListForUpdate(Merchant merchant, Long merchantApplyRangeId) throws Exception {
        ArrayList<InvoicingCustomers> invoicingCustomersList = new ArrayList<InvoicingCustomers>();
        if (merchant.getEntityStatus() == EntityStatus.Update) {
            ArrayList<Long> invoicingCustomerIdList = new ArrayList<Long>();
            if (!CollectionUtils.isEmpty((Collection)merchant.invoicingCustomerss())) {
                for (InvoicingCustomers invoicingCustomers : merchant.invoicingCustomerss()) {
                    if (invoicingCustomers.getId() != null) {
                        invoicingCustomerIdList.add((Long)invoicingCustomers.getId());
                    }
                    if (invoicingCustomers.getEntityStatus() == EntityStatus.Delete || !merchantApplyRangeId.equals(invoicingCustomers.getMerchantApplyRangeId())) continue;
                    invoicingCustomersList.add(invoicingCustomers);
                }
            }
            QuerySchema querySchema = QuerySchema.create().addSelect("id,merchantId,merchantApplyRangeId,invoicingCustomersId,isDefault");
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId)});
            if (!CollectionUtils.isEmpty(invoicingCustomerIdList)) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_in(invoicingCustomerIdList));
            }
            querySchema.addCondition((ConditionExpression)queryConditionGroup);
            List invoicingCustomerInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.InvoicingCustomers", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)invoicingCustomerInDbList)) {
                invoicingCustomersList.addAll(invoicingCustomerInDbList);
            }
        }
        return invoicingCustomersList;
    }

    public List<CustomerArea> initCreatorCustomerAreaList(Merchant merchant, Long merchantApplyRangeId) {
        ArrayList<CustomerArea> customerAreaList = new ArrayList<CustomerArea>();
        if (merchant.getEntityStatus() == EntityStatus.Insert && !CollectionUtils.isEmpty((Collection)merchant.customerAreas())) {
            for (CustomerArea customerArea : merchant.customerAreas()) {
                customerArea.setmerchantApplyRangeId(merchantApplyRangeId);
                customerArea.setMerchantId((Long)merchant.getId());
                customerAreaList.add(customerArea);
            }
        }
        return customerAreaList;
    }

    public List<CustomerArea> getCreatorCustomerAreaListForUpdate(Merchant merchant, Long merchantApplyRangeId) throws Exception {
        ArrayList<CustomerArea> customerAreaList = new ArrayList<CustomerArea>();
        if (merchant.getEntityStatus() == EntityStatus.Update) {
            ArrayList<Long> customerAreaIdList = new ArrayList<Long>();
            if (!CollectionUtils.isEmpty((Collection)merchant.customerAreas())) {
                for (CustomerArea customerArea : merchant.customerAreas()) {
                    if (customerArea.getId() != null) {
                        customerAreaIdList.add((Long)customerArea.getId());
                    }
                    if (customerArea.getEntityStatus() == EntityStatus.Delete || !merchantApplyRangeId.equals(customerArea.getmerchantApplyRangeId())) continue;
                    customerAreaList.add(customerArea);
                }
            }
            QuerySchema querySchema = QuerySchema.create().addSelect("id,merchantId,merchantApplyRangeId,saleAreaId,isDefault,customerAreaCharacter");
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId)});
            if (!CollectionUtils.isEmpty(customerAreaIdList)) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_in(customerAreaIdList));
            }
            querySchema.addCondition((ConditionExpression)queryConditionGroup);
            List customerAreaInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.CustomerArea", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)customerAreaInDbList)) {
                customerAreaList.addAll(customerAreaInDbList);
            }
        }
        return customerAreaList;
    }

    public List<Principal> initCreatorPrincipalList(Merchant merchant, Long merchantApplyRangeId) {
        ArrayList<Principal> principalList = new ArrayList<Principal>();
        if (merchant.getEntityStatus() == EntityStatus.Insert && !CollectionUtils.isEmpty((Collection)merchant.principals())) {
            for (Principal principal : merchant.principals()) {
                principal.setMerchantApplyRangeId(merchantApplyRangeId);
                principal.setMerchantId((Long)merchant.getId());
                principalList.add(principal);
            }
        }
        return principalList;
    }

    public List<Principal> getCreatorPrincipalListForUpdate(Merchant merchant, Long merchantApplyRangeId) throws Exception {
        ArrayList<Principal> principalList = new ArrayList<Principal>();
        if (merchant.getEntityStatus() == EntityStatus.Update) {
            ArrayList<Long> principalIdList = new ArrayList<Long>();
            if (!CollectionUtils.isEmpty((Collection)merchant.principals())) {
                for (Principal principal : merchant.principals()) {
                    if (principal.getId() != null) {
                        principalIdList.add((Long)principal.getId());
                    }
                    if (principal.getEntityStatus() == EntityStatus.Delete || !merchantApplyRangeId.equals(principal.getMerchantApplyRangeId())) continue;
                    principalList.add(principal);
                }
            }
            QuerySchema querySchema = QuerySchema.create().addSelect("id,merchantId,merchantApplyRangeId,specialManagementDep,professSalesman,isDefault,principalCharacter");
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId)});
            if (!CollectionUtils.isEmpty(principalIdList)) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").not_in(principalIdList));
            }
            querySchema.addCondition((ConditionExpression)queryConditionGroup);
            List principalInDbList = MetaDaoHelper.queryObject((String)"aa.merchant.Principal", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)principalInDbList)) {
                principalList.addAll(principalInDbList);
            }
        }
        return principalList;
    }

    public MerchantApplyRange initMerchantApplyRange(Long merchantId, String orgId, Long shop, Boolean isCreator, Boolean isApplied, Integer rangeType) {
        MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
        merchantApplyRange.setId((Object)IdManager.getInstance().nextId());
        merchantApplyRange.setMerchantId(merchantId);
        merchantApplyRange.setOrgId(orgId);
        if (shop != null) {
            merchantApplyRange.setShop(shop);
        }
        merchantApplyRange.setIsCreator(isCreator);
        merchantApplyRange.setIsApplied(isApplied);
        merchantApplyRange.setRangeType(rangeType);
        merchantApplyRange.setEntityStatus(EntityStatus.Insert);
        return merchantApplyRange;
    }

    public MerchantApplyRangeDetail initMerchantApplyRangeDetailShop(Long merchantId, Long merchantApplyRangeId, MerchantApplyRangeDetail merchantApplyRangeDetail) {
        MerchantApplyRangeDetail merchantApplyRangeDetailShop = new MerchantApplyRangeDetail();
        merchantApplyRangeDetailShop.setMerchantId(merchantId);
        merchantApplyRangeDetailShop.setMerchantApplyRangeId(merchantApplyRangeId);
        merchantApplyRangeDetailShop.setIsTradeCustomers(IsTradeCustomers.notTradeCustomers.getValue());
        merchantApplyRangeDetailShop.setStopstatus(Boolean.valueOf(false));
        merchantApplyRangeDetailShop.setCreator(AppContext.getCurrentUser().getName());
        merchantApplyRangeDetailShop.setCreatorId((Long)AppContext.getCurrentUser().getId());
        merchantApplyRangeDetailShop.setCreateDate(new Date());
        merchantApplyRangeDetailShop.setCreateTime(new Date());
        if (!CollectionUtils.isEmpty((Map)merchantApplyRangeDetail)) {
            merchantApplyRangeDetailShop.setSignBack(merchantApplyRangeDetail.getSignBack());
            merchantApplyRangeDetailShop.setPayway(merchantApplyRangeDetail.getPayway());
            merchantApplyRangeDetailShop.setExchangeratetype(merchantApplyRangeDetail.getExchangeratetype());
            merchantApplyRangeDetailShop.setCreator(merchantApplyRangeDetail.getCreator());
            merchantApplyRangeDetailShop.setModifier(merchantApplyRangeDetail.getModifier());
        }
        merchantApplyRangeDetailShop.setEntityStatus(EntityStatus.Insert);
        return merchantApplyRangeDetailShop;
    }

    public InvoicingCustomers initInvoicingCustomer(Long merchantId, Long merchantApplyRangeId, Long invoicingCustomersId, Boolean isDefault) {
        InvoicingCustomers invoicingCustomer = new InvoicingCustomers();
        invoicingCustomer.setId((Object)IdManager.getInstance().nextId());
        invoicingCustomer.setMerchantId(merchantId);
        invoicingCustomer.setMerchantApplyRangeId(merchantApplyRangeId);
        invoicingCustomer.setInvoicingCustomersId(invoicingCustomersId);
        invoicingCustomer.setIsDefault(isDefault);
        invoicingCustomer.setEntityStatus(EntityStatus.Insert);
        return invoicingCustomer;
    }

    public CustomerArea initCustomerArea(Long merchantId, Long merchantApplyRangeId, Long saleAreaId, Boolean isDefault) {
        CustomerArea customerArea = new CustomerArea();
        customerArea.setId((Object)IdManager.getInstance().nextId());
        customerArea.setMerchantId(merchantId);
        customerArea.setmerchantApplyRangeId(merchantApplyRangeId);
        customerArea.setSaleAreaId(saleAreaId);
        customerArea.setIsDefault(isDefault);
        customerArea.setEntityStatus(EntityStatus.Insert);
        return customerArea;
    }

    public Principal initPrincipal(Long merchantId, Long merchantApplyRangeId, String professSalesman, String specialManagementDep, Boolean isDefault) {
        Principal principal = new Principal();
        principal.setId((Object)IdManager.getInstance().nextId());
        principal.setMerchantId(merchantId);
        principal.setMerchantApplyRangeId(merchantApplyRangeId);
        principal.setProfessSalesman(professSalesman);
        principal.setSpecialManagementDep(specialManagementDep);
        principal.setIsDefault(isDefault);
        principal.setEntityStatus(EntityStatus.Insert);
        return principal;
    }

    public boolean isUpdateMerchantCodeForCodingRule(Merchant merchant) throws Exception {
        boolean isUpdateCode = false;
        if (EntityStatus.Update.equals((Object)merchant.getEntityStatus()) && merchant.containsKey((Object)"importSpecialKey_merchant") && merchant.containsKey((Object)"aa_merchant")) {
            isUpdateCode = true;
        } else if (EntityStatus.Update.equals((Object)merchant.getEntityStatus()) && merchant.containsKey((Object)"data_from")) {
            List merchantApplyRangeInDbList;
            if (merchant.get("isCreator") != null) {
                isUpdateCode = BooleanUtil.isTrue((Object)merchant.get("isCreator"));
            } else if (merchant.get("belongOrg") != null && !CollectionUtils.isEmpty((Collection)(merchantApplyRangeInDbList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdAndOrgId(merchant.get("belongOrg").toString(), (Long)merchant.getId())))) {
                isUpdateCode = BooleanUtil.isTrue((Object)((MerchantApplyRange)merchantApplyRangeInDbList.get(0)).getIsCreator());
            }
        }
        return isUpdateCode;
    }
}

