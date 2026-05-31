/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.billcode.po.BillNumberPO
 *  com.yonyou.iuap.ml.vo.LanguageVO
 *  com.yonyou.iuap.org.dto.FinOrgDTO
 *  com.yonyou.iuap.org.service.itf.core.IFinOrgQueryService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.ucf.common.ml.MultiLangContext
 *  com.yonyou.uap.billcode.BillCodeComponentParam
 *  com.yonyou.uap.billcode.BillCodeContext
 *  com.yonyou.uap.billcode.service.IBillCodeComponentService
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.billmake.service.MakeBillRuleClientService
 *  com.yonyou.ucf.mdd.ext.bill.billmake.vo.PushAndPullVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.fi.tmsp.openapi.ITmspBizPartnerService
 *  com.yonyoucloud.fi.tmsp.vo.FundBizObjArchInsertResp
 *  com.yonyoucloud.fi.tmsp.vo.FundBusinObjArchivesResp
 *  com.yonyoucloud.upc.aa.merchant.EnterpriseNature
 *  com.yonyoucloud.upc.aa.merchant.LicenseType
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.vendor.Vendor
 *  com.yonyoucloud.upc.base.businesspartner.BusinessPartner
 *  com.yonyoucloud.upc.base.businesspartner.PartnerCapitalComparison
 *  com.yonyoucloud.upc.base.businesspartner.PartnerMerchantComparison
 *  com.yonyoucloud.upc.base.businesspartner.PartnerVendorComparison
 *  com.yonyoucloud.upc.base.businesspartner.RoleClassName
 *  com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService
 *  com.yonyoucloud.upc.pub.api.vendor.service.vendorclass.IVendorClassPubQueryService
 *  com.yonyoucloud.upc.pub.api.vendor.vo.vendorclass.VendorClassVO
 *  com.yonyoucloud.upc.utils.PartnerConstant
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.businesspartner;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.billcode.po.BillNumberPO;
import com.yonyou.iuap.ml.vo.LanguageVO;
import com.yonyou.iuap.org.dto.FinOrgDTO;
import com.yonyou.iuap.org.service.itf.core.IFinOrgQueryService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.ucf.common.ml.MultiLangContext;
import com.yonyou.uap.billcode.BillCodeComponentParam;
import com.yonyou.uap.billcode.BillCodeContext;
import com.yonyou.uap.billcode.service.IBillCodeComponentService;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.billmake.service.MakeBillRuleClientService;
import com.yonyou.ucf.mdd.ext.bill.billmake.vo.PushAndPullVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.data.fill.DataTransferUtils;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.fi.tmsp.openapi.ITmspBizPartnerService;
import com.yonyoucloud.fi.tmsp.vo.FundBizObjArchInsertResp;
import com.yonyoucloud.fi.tmsp.vo.FundBusinObjArchivesResp;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.merchant.EnterpriseNature;
import com.yonyoucloud.upc.aa.merchant.LicenseType;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.vendor.Vendor;
import com.yonyoucloud.upc.base.businesspartner.BusinessPartner;
import com.yonyoucloud.upc.base.businesspartner.PartnerCapitalComparison;
import com.yonyoucloud.upc.base.businesspartner.PartnerMerchantComparison;
import com.yonyoucloud.upc.base.businesspartner.PartnerVendorComparison;
import com.yonyoucloud.upc.base.businesspartner.RoleClassName;
import com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService;
import com.yonyoucloud.upc.pub.api.vendor.service.vendorclass.IVendorClassPubQueryService;
import com.yonyoucloud.upc.pub.api.vendor.vo.vendorclass.VendorClassVO;
import com.yonyoucloud.upc.service.BusinessPartnerService;
import com.yonyoucloud.upc.service.MerchantCheckService;
import com.yonyoucloud.upc.service.api.BusinessPartnerServiceImpl;
import com.yonyoucloud.upc.utils.PartnerConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class BusinessPartnerComparatorManager {
    @Autowired
    private MakeBillRuleClientService makeBillRuleClientService;
    @Autowired
    private BusinessPartnerService partnerService;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    @Autowired
    private MerchantCheckService merchantCheckService;
    @Autowired
    private IBillCodeComponentService billCodeComponentService;
    @Lazy
    @Autowired
    private IUPCControlRuleService iupcControlRuleService;
    @Autowired
    private IFinOrgQueryService finOrgQueryService;
    @Autowired
    private IVendorClassPubQueryService vendorClassPubQueryService;
    @Lazy
    @Autowired
    private ITmspBizPartnerService capitalPartnerService;
    @Autowired
    private IVendorPubQueryService vendorPubQueryService;
    @Autowired
    BusinessPartnerServiceImpl businessPartnerService;

    public void processPartnerComparisons(BusinessPartner partner) {
        List<PartnerCapitalComparison> partnerCapitalComparisons;
        List<PartnerVendorComparison> partnerVendorComparisons;
        List<PartnerMerchantComparison> partnerMerchantComparisons = this.filterAndSetDefault(partner.partnerMerchantComparisons(), PartnerMerchantComparison::getMerchantId);
        if (!CollectionUtils.isEmpty(partnerMerchantComparisons)) {
            long count = partnerMerchantComparisons.stream().filter(partnerMerchantComparison -> partnerMerchantComparison.getMerchantId() == null).count();
            if (count != 0L) {
                partner.put(PartnerConstant.PARTNER_MERCHANT_COMPARISONS_TEMP, partnerMerchantComparisons);
                partner.remove(PartnerConstant.PARTNER_MERCHANT_COMPARISONS);
            } else {
                partner.setPartnerMerchantComparisons(partnerMerchantComparisons);
            }
        }
        if (!CollectionUtils.isEmpty(partnerVendorComparisons = this.filterAndSetDefault(partner.partnerVendorComparisons(), PartnerVendorComparison::getVendorId))) {
            long count = partnerVendorComparisons.stream().filter(partnerVendorComparison -> partnerVendorComparison.getVendorId() == null).count();
            if (count != 0L) {
                partner.put(PartnerConstant.PARTNER_VENDOR_COMPARISONS_TEMP, partnerVendorComparisons);
                partner.remove(PartnerConstant.PARTNER_VENDOR_COMPARISONS);
            } else {
                partner.setPartnerVendorComparisons(partnerVendorComparisons);
            }
        }
        if (!CollectionUtils.isEmpty(partnerCapitalComparisons = this.filterAndSetDefault(partner.partnerCapitalComparisons(), PartnerCapitalComparison::getCapitalId))) {
            long count = partnerCapitalComparisons.stream().filter(partnerCapitalComparison -> partnerCapitalComparison.getCapitalId() == null).count();
            if (count != 0L) {
                partner.put(PartnerConstant.PARTNER_CAPITAL_COMPARISONS_TEMP, partnerCapitalComparisons);
                partner.remove(PartnerConstant.PARTNER_CAPITAL_COMPARISONS);
            } else {
                partner.setPartnerCapitalComparisons(partnerCapitalComparisons);
            }
        }
    }

    private <T extends BizObject> List<T> filterAndSetDefault(List<T> comparisons, Function<T, Object> idExtractor) {
        if (!CollectionUtils.isEmpty(comparisons)) {
            for (BizObject comparison : comparisons) {
                Object apply = idExtractor.apply(comparison);
                if (apply != null) continue;
                comparison.setEntityStatus(EntityStatus.Unchanged);
            }
            int size = comparisons.size();
            if (size == 1) {
                ((BizObject)comparisons.get(0)).set("isDefault", (Object)true);
                return comparisons;
            }
            HashSet<String> idSet = new HashSet<String>();
            ArrayList<BizObject> comparisonList = new ArrayList<BizObject>();
            for (BizObject comparison : comparisons) {
                Object apply = idExtractor.apply(comparison);
                if (apply == null) {
                    comparisonList.add(comparison);
                    continue;
                }
                if (!idSet.contains(apply.toString())) {
                    comparisonList.add(comparison);
                    idSet.add(apply.toString());
                    continue;
                }
                comparison.setEntityStatus(EntityStatus.Delete);
                comparisonList.add(0, comparison);
            }
            if (comparisonList.size() > 1) {
                ((BizObject)comparisonList.get(0)).set("isDefault", (Object)true);
                for (int i = 1; i < comparisonList.size(); ++i) {
                    ((BizObject)comparisonList.get(i)).set("isDefault", (Object)false);
                }
            }
            return comparisonList;
        }
        return comparisons;
    }

    public void dealMerchantComparison(BusinessPartner partner) throws Exception {
        List merchantComparisons = partner.partnerMerchantComparisons();
        if (CollectionUtils.isEmpty((Collection)merchantComparisons) || partner.containsKey((Object)"isAutoLinkMerchant")) {
            return;
        }
        if (merchantComparisons != null && partner.containsKey((Object)"isUpdateImport") && ((Boolean)partner.get("isUpdateImport")).booleanValue() && EntityStatus.Update.equals((Object)partner.getEntityStatus())) {
            for (PartnerMerchantComparison merchantComparison : merchantComparisons) {
                if (merchantComparison.getMerchantId() != null) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800034, new Object[]{partner.getCode()});
            }
        }
        this.checkPartnerSyncCreateMerchant(partner, merchantComparisons);
        if (CollectionUtils.isEmpty((Collection)merchantComparisons)) {
            return;
        }
        if (((Boolean)partner.get("isImport")).booleanValue()) {
            HashSet<String> repeatMerchantCode = new HashSet<String>(merchantComparisons.size() * 2);
            for (PartnerMerchantComparison merchantComparison : merchantComparisons) {
                if (merchantComparison.get("merchantId_code") == null) continue;
                if (repeatMerchantCode.contains(merchantComparison.get("merchantId_code").toString())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800035, new Object[]{partner.getCode()});
                }
                repeatMerchantCode.add(merchantComparison.get("merchantId_code").toString());
            }
        }
        for (PartnerMerchantComparison item2 : merchantComparisons) {
            if (item2.getMerchantId() != null || EntityStatus.LOGICDELETE == item2.getEntityStatus()) continue;
            boolean canCreateMerchantForImport = (Boolean)partner.get("isImport") != false && !item2.containsKey((Object)"isAutoLinkMerchant");
            Merchant merchant = new Merchant();
            if (partner.containsKey((Object)"cascadeSyncMerchant") || partner.containsKey((Object)"specialKeyFromBatchOrg")) {
                item2.set("merchantId_code", (Object)partner.getCode());
            }
            if (StringUtils.isNotBlank((CharSequence)((CharSequence)item2.get("merchantId_code")))) {
                merchant.setCode(item2.get("merchantId_code").toString());
            } else {
                item2.set("merchantId_code", (Object)partner.getCode());
                merchant.setCode(partner.getCode());
            }
            if (canCreateMerchantForImport || partner.containsKey((Object)"specialKeyFromApi")) {
                this.isExistMerchantByCode(partner, item2);
                partner.partnerRoleClasses().forEach(roleClass -> {
                    if (RoleClassName.merchant.equals((Object)roleClass.getRoleClassName())) {
                        roleClass.setIsCheck(Boolean.valueOf(true));
                    }
                });
                if (canCreateMerchantForImport) {
                    item2.put("createOrg_code", item2.get("merchantId_createOrgName"));
                    item2.put("transType_code", item2.get("merchantId_transTypeName"));
                    item2.put("customerClass_code", item2.get("merchantId_customerClassCode"));
                }
                DataTransferUtils.fill((String)"aa_merchant", (String)"aa.merchant.Merchant", (Object)item2, (int)3);
                if (item2.get("createOrg_code") == null && item2.get("createOrg") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800036, new Object[]{partner.getCode()});
                }
                if (item2.get("createOrg") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800037, new Object[]{partner.getCode()});
                }
                item2.put("merchantId_createOrg", item2.get("createOrg"));
                if (item2.get("transType_code") != null && item2.get("transType") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800038, new Object[]{partner.getCode(), item2.get("merchantId_transTypeName")});
                }
                merchant.put("merchantId_transType", item2.get("transType"));
                if (item2.get("customerClass_code") != null && item2.get("customerClass") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800039, new Object[]{partner.getCode(), item2.get("merchantId_customerClassCode")});
                }
                item2.put("merchantId_customerClass", item2.get("customerClass"));
            }
            long merchantId = IdManager.getInstance().nextId();
            merchant.setId((Object)merchantId);
            this.synchronousMultilingual((BizObject)partner, (BizObject)merchant);
            merchant.setCreateOrg((String)item2.get("merchantId_createOrg"));
            Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
            LoginUser currentUser = AppContext.getCurrentUser();
            if (singleOrg.booleanValue()) {
                merchant.setCreateOrg((String)AppContext.getCurrentUser().get("singleOrgId"));
            }
            merchant.setTransType((String)item2.get("merchantId_transType"));
            merchant.setCustomerClass(item2.get("merchantId_customerClass") == null ? null : Long.valueOf(Long.parseLong(item2.get("merchantId_customerClass").toString())));
            if (item2.get("merchantId_customerClassCode") != null) {
                merchant.put("customerClass_code", item2.get("merchantId_customerClassCode"));
            }
            merchant.set("belongOrg", merchant.get("createOrg"));
            merchant.setEntityStatus(EntityStatus.Insert);
            merchant.put("autoGenerateRangeData", (Object)true);
            merchant.setCreditCode(partner.getCreditCode());
            partner.partnerRoleClasses().forEach(roleClass -> {
                if (RoleClassName.org == roleClass.getRoleClassName() && roleClass.getIsCheck().booleanValue()) {
                    merchant.setInternalOrg(Boolean.valueOf(true));
                    merchant.setInternalOrgId(partner.getInternalOrgId());
                }
            });
            String partnerId = item2.getPartnerId();
            ArrayList<String> childIds = new ArrayList<String>();
            childIds.add(partnerId);
            PushAndPullVO pushAndPullVO = new PushAndPullVO();
            pushAndPullVO.setCode("partner_to_merchant");
            pushAndPullVO.setIsMainSelect(1);
            pushAndPullVO.setChildIds(childIds);
            Map targetMap = this.makeBillRuleClientService.getTargetList(pushAndPullVO, "push");
            List targetList = null;
            if (targetMap != null && targetMap.get("tarList") != null && !CollectionUtils.isEmpty((Collection)(targetList = (List)targetMap.get("tarList")))) {
                for (Merchant merchantTarget : targetList) {
                    merchantTarget.remove("isPullAndPushTarget");
                    merchantTarget.remove("vouchdate");
                    merchantTarget.remove("_status");
                    merchantTarget.remove("id");
                    if (merchant == null) continue;
                    this.businessPartnerService.putMapFieldInTargetObject((BizObject)merchantTarget, (BizObject)merchant, "merchantCharacter");
                    merchant.putAll((Map)merchantTarget);
                }
            }
            BillDataDto bill = new BillDataDto();
            bill.setBillnum("aa_merchant");
            bill.setData((Object)merchant);
            RuleExecuteResult saveResult = null;
            bill.setConvertType(Integer.valueOf(2));
            if (partner.containsKey((Object)"cascadeSyncMerchant") || partner.containsKey((Object)"specialKeyFromBatchOrg")) {
                item2.set("merchantId_code", (Object)partner.getCode());
            }
            merchant.setCode(item2.get("merchantId_code").toString());
            if (partner.getPartnerType() != null) {
                merchant.setEnterpriseNature(EnterpriseNature.find((Number)partner.getPartnerType().getValue()));
            } else {
                merchant.setEnterpriseNature(EnterpriseNature.enterprise);
            }
            if (partner.getLicenseType() != null) {
                merchant.setLicenseType(LicenseType.find((Number)partner.getLicenseType().getValue()));
            }
            this.merchantCheckService.merchantCheckFromApi(merchant, singleOrg, currentUser);
            this.checkMerchantCodeForInsert(partner, item2);
            merchant.set("specialKeyFromBusinessPartner", (Object)true);
            merchant.setBusinessPartner((String)partner.getId());
            try {
                saveResult = this.billService.executeUpdate("save", bill);
            }
            catch (Exception e) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800040, new Object[]{e.getMessage()});
            }
            if (saveResult != null && saveResult.getMsgCode() == 1) {
                item2.setMerchantId((Long)merchant.getId());
                item2.setIsDefault(Boolean.valueOf(true));
                item2.setEntityStatus(EntityStatus.Insert);
            }
            MetaDaoHelper.update((String)"base.businesspartner.PartnerMerchantComparison", (BizObject)item2);
        }
        merchantComparisons = merchantComparisons.stream().filter(item -> item.getMerchantId() != null).collect(Collectors.toList());
        partner.setPartnerMerchantComparisons(merchantComparisons);
    }

    public void dealMerchantComparisonForApi(BusinessPartner partner) throws Exception {
        List merchantComparisons = partner.partnerMerchantComparisons();
        if (CollectionUtils.isEmpty((Collection)merchantComparisons) || partner.containsKey((Object)"isAutoLinkMerchant")) {
            return;
        }
        this.checkPartnerSyncCreateMerchant(partner, merchantComparisons);
        if (CollectionUtils.isEmpty((Collection)merchantComparisons)) {
            return;
        }
        for (PartnerMerchantComparison item2 : merchantComparisons) {
            if (item2.getMerchantId() != null || EntityStatus.LOGICDELETE == item2.getEntityStatus()) continue;
            Merchant merchant = new Merchant();
            if (partner.containsKey((Object)"cascadeSyncMerchant") || partner.containsKey((Object)"specialKeyFromBatchOrg")) {
                item2.set("merchantId_code", (Object)partner.getCode());
            }
            if (StringUtils.isNotBlank((CharSequence)((CharSequence)item2.get("merchantId_code")))) {
                merchant.setCode(item2.get("merchantId_code").toString());
            } else {
                merchant.setCode(partner.getCode());
                item2.set("merchantId_code", (Object)partner.getCode());
            }
            this.isExistMerchantByCode(partner, item2);
            partner.partnerRoleClasses().forEach(roleClass -> {
                if (RoleClassName.merchant.equals((Object)roleClass.getRoleClassName())) {
                    roleClass.setIsCheck(Boolean.valueOf(true));
                }
            });
            DataTransferUtils.fill((String)"aa_merchant", (String)"aa.merchant.Merchant", (Object)item2, (int)3);
            if (item2.get("createOrg_code") == null && item2.get("createOrg") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800036, new Object[]{partner.getCode()});
            }
            if (item2.get("createOrg") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800037, new Object[]{partner.getCode()});
            }
            item2.put("merchantId_createOrg", item2.get("createOrg"));
            if (item2.get("transType_code") != null && item2.get("transType") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800038, new Object[]{partner.getCode(), item2.get("transType_code")});
            }
            item2.put("merchantId_transType", item2.get("transType"));
            if (item2.get("customerClass_code") != null && item2.get("customerClass") == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800039, new Object[]{partner.getCode(), item2.get("customerClass_code")});
            }
            if (item2.get("customerClass") != null) {
                QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(item2.get("customerClass"))})).addPager(0, 1);
                Map stringObjectMap = MetaDaoHelper.queryOne((String)"aa.custcategory.CustCategory", (QuerySchema)schema);
                if (stringObjectMap == null || stringObjectMap.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800041);
                }
                item2.put("merchantId_customerClass", item2.get("customerClass"));
            }
            long merchantId = IdManager.getInstance().nextId();
            merchant.setId((Object)merchantId);
            this.synchronousMultilingual((BizObject)partner, (BizObject)merchant);
            merchant.setCreateOrg((String)item2.get("merchantId_createOrg"));
            Boolean singleOrg = this.iupcControlRuleService.checkSingleOrg();
            LoginUser currentUser = AppContext.getCurrentUser();
            if (singleOrg.booleanValue()) {
                merchant.setCreateOrg((String)AppContext.getCurrentUser().get("singleOrgId"));
            }
            merchant.setTransType((String)item2.get("merchantId_transType"));
            merchant.setCustomerClass(item2.get("merchantId_customerClass") == null ? null : Long.valueOf(Long.parseLong(item2.get("merchantId_customerClass").toString())));
            if (item2.get("merchantId_customerClassCode") != null) {
                merchant.put("customerClass_code", item2.get("merchantId_customerClassCode"));
            }
            merchant.set("belongOrg", merchant.get("createOrg"));
            merchant.setEntityStatus(EntityStatus.Insert);
            merchant.put("autoGenerateRangeData", (Object)true);
            merchant.setCreditCode(partner.getCreditCode());
            partner.partnerRoleClasses().forEach(roleClass -> {
                if (RoleClassName.org == roleClass.getRoleClassName() && roleClass.getIsCheck().booleanValue()) {
                    merchant.setInternalOrg(Boolean.valueOf(true));
                    merchant.setInternalOrgId(partner.getInternalOrgId());
                }
            });
            BillDataDto bill = new BillDataDto();
            bill.setBillnum("aa_merchant");
            bill.setData((Object)merchant);
            RuleExecuteResult saveResult = null;
            bill.setConvertType(Integer.valueOf(2));
            if (partner.containsKey((Object)"cascadeSyncMerchant") || partner.containsKey((Object)"specialKeyFromBatchOrg")) {
                item2.set("merchantId_code", (Object)partner.getCode());
            }
            merchant.setCode(item2.get("merchantId_code").toString());
            if (partner.getPartnerType() != null) {
                merchant.setEnterpriseNature(EnterpriseNature.find((Number)partner.getPartnerType().getValue()));
            } else {
                merchant.setEnterpriseNature(EnterpriseNature.enterprise);
            }
            if (partner.getLicenseType() != null) {
                merchant.setLicenseType(LicenseType.find((Number)partner.getLicenseType().getValue()));
            }
            this.merchantCheckService.merchantCheckFromApi(merchant, singleOrg, currentUser);
            this.checkMerchantCodeForInsert(partner, item2);
            merchant.set("specialKeyFromBusinessPartner", (Object)true);
            merchant.setBusinessPartner((String)partner.getId());
            try {
                saveResult = this.billService.executeUpdate("save", bill);
            }
            catch (Exception e) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800040, new Object[]{e.getMessage()});
            }
            if (saveResult != null && saveResult.getMsgCode() == 1) {
                item2.setMerchantId((Long)merchant.getId());
                item2.setIsDefault(Boolean.valueOf(true));
                item2.setEntityStatus(EntityStatus.Insert);
            }
            MetaDaoHelper.update((String)"base.businesspartner.PartnerMerchantComparison", (BizObject)item2);
        }
        merchantComparisons = merchantComparisons.stream().filter(item -> item.getMerchantId() != null).collect(Collectors.toList());
        partner.setPartnerMerchantComparisons(merchantComparisons);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void checkMerchantCodeForInsert(BusinessPartner partner, PartnerMerchantComparison item) throws Exception {
        String merchantBizObjCode = "productcenter.aa_merchant";
        BillCodeComponentParam billCodeParam = new BillCodeComponentParam(merchantBizObjCode, "aa_merchant", AppContext.getCurrentUser().getYxyTenantId(), "-1");
        BillCodeContext context = this.billCodeComponentService.getBillCodeContext(billCodeParam);
        Integer billNumMode = context.getBillnumMode();
        String code = item.get("merchantId_code").toString();
        if (null != billNumMode && billNumMode == 0) {
            if (!StringUtils.isNotEmpty((CharSequence)code)) throw new CoreDocBusinessException(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040801F8", (String)"\u5ba2\u6237\u7f16\u7801\u552f\u4e00\u6027\u6821\u9a8c\u89c4\u5219:\u5ba2\u6237\u7f16\u7801\u4e0d\u80fd\u4e3a\u7a7a!"));
            this.isExistMerchantByCode(partner, item);
            return;
        } else {
            Integer handleWorkDuplicatePolicy;
            if (null == billNumMode || billNumMode != 2 || context.getBillNumber() == null || !(context.getBillNumber() instanceof BillNumberPO) || (handleWorkDuplicatePolicy = ((BillNumberPO)context.getBillNumber()).getHandleWorkDuplicatePolicy()) != 1) return;
            this.isExistMerchantByCode(partner, item);
        }
    }

    private void isExistMerchantByCode(BusinessPartner partner, PartnerMerchantComparison item) throws Exception {
        QuerySchema schemaMerchantForCode = QuerySchema.create().addSelect("1").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)item.get("merchantId_code").toString())}));
        schemaMerchantForCode.addPager(0, 1);
        Map merchantForCode = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)schemaMerchantForCode);
        if (merchantForCode != null && !merchantForCode.isEmpty()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800042, new Object[]{partner.getCode(), item.get("merchantId_code").toString()});
        }
    }

    private void checkPartnerSyncCreateMerchant(BusinessPartner partner, List<PartnerMerchantComparison> merchantComparisons) {
        if (!partner.containsKey((Object)"partnerSyncCreateMerchant") && !partner.containsKey((Object)"vendorSyncCascadeMerchant")) {
            Iterator<PartnerMerchantComparison> iterator = merchantComparisons.iterator();
            while (iterator.hasNext()) {
                PartnerMerchantComparison merchantComparison = iterator.next();
                if (merchantComparison.getMerchantId() != null) continue;
                iterator.remove();
            }
        }
    }

    public void dealVendorComparisonForApi(BusinessPartner partner) throws Exception {
        List vendorComparisons = partner.partnerVendorComparisons();
        if (CollectionUtils.isEmpty((Collection)vendorComparisons) || partner.containsKey((Object)"isAutoLinkVendor")) {
            return;
        }
        if (vendorComparisons != null && ((Boolean)partner.get("isUpdateImport")).booleanValue() && EntityStatus.Update.equals((Object)partner.getEntityStatus()) && !partner.containsKey((Object)"specialKeyFromApi")) {
            for (PartnerVendorComparison vendorComparison : vendorComparisons) {
                if (vendorComparison.getVendorId() != null) continue;
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800044, new Object[]{partner.getCode()});
            }
        }
        this.checkPartnerSyncCreateVendor(partner, vendorComparisons);
        if (CollectionUtils.isEmpty((Collection)vendorComparisons)) {
            return;
        }
        if (((Boolean)partner.get("isImport")).booleanValue()) {
            HashSet<String> repeatVendorCode = new HashSet<String>(vendorComparisons.size() * 2);
            for (PartnerVendorComparison vendorComparison : vendorComparisons) {
                if (vendorComparison.get("code") == null) continue;
                if (repeatVendorCode.contains(vendorComparison.get("code").toString())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800045, new Object[]{partner.getCode()});
                }
                repeatVendorCode.add(vendorComparison.get("code").toString());
            }
        }
        if (CollectionUtils.isEmpty((Collection)vendorComparisons)) {
            return;
        }
        partner.partnerRoleClasses().forEach(roleClass -> {
            if (RoleClassName.vendor.equals((Object)roleClass.getRoleClassName())) {
                roleClass.setIsCheck(Boolean.valueOf(true));
            }
        });
        for (PartnerVendorComparison item2 : vendorComparisons) {
            VendorClassVO vendorClassById;
            if (item2.getVendorId() != null || EntityStatus.LOGICDELETE == item2.getEntityStatus()) continue;
            Vendor vendor = new Vendor();
            long vendorId = IdManager.getInstance().nextId();
            vendor.setId((Object)vendorId);
            this.synchronousMultilingual((BizObject)partner, (BizObject)vendor);
            if (partner.getPartnerType() != null) {
                vendor.put("supplyType", (Object)partner.getPartnerType().getValue());
            }
            if (StringUtils.isNotBlank((CharSequence)((CharSequence)item2.get("createOrgId")))) {
                vendor.setOrg((String)item2.get("createOrgId"));
            } else {
                vendor.set("org_code", item2.get("createOrgCode"));
            }
            if (this.iupcControlRuleService.checkSingleOrg().booleanValue()) {
                vendor.setOrg((String)AppContext.getCurrentUser().get("singleOrgId"));
            }
            if (item2.get("vendorClass") != null) {
                vendor.setVendorclass((Long)item2.get("vendorClass"));
            } else {
                vendor.set("vendorclass_code", item2.get("vendorClassCode"));
            }
            if (StringUtils.isNotBlank((CharSequence)((CharSequence)item2.get("code")))) {
                vendor.setCode((String)item2.get("code"));
            } else {
                vendor.setCode(partner.getCode());
            }
            DataTransferUtils.fill((String)"aa_vendor", (String)"aa.vendor.Vendor", (Object)vendor, (int)0);
            if (StringUtils.isBlank((CharSequence)vendor.getOrg())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800046);
            }
            FinOrgDTO orgById = (FinOrgDTO)this.finOrgQueryService.getById((String)AppContext.getYTenantId(), vendor.getOrg());
            if (orgById == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800047);
            }
            if (vendor.getVendorclass() != null && (vendorClassById = this.vendorClassPubQueryService.getVendorClassById(vendor.getVendorclass())) == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800048);
            }
            partner.partnerRoleClasses().forEach(roleClass -> {
                if (RoleClassName.org == roleClass.getRoleClassName() && roleClass.getIsCheck().booleanValue()) {
                    vendor.setInternalunit(Boolean.valueOf(true));
                    vendor.setCorrespondingorg(partner.getInternalOrgId());
                }
            });
            vendor.set("creditcode", (Object)partner.getCreditCode());
            vendor.set("isCreator", (Object)true);
            vendor.set("extSystemCode", (Object)16);
            vendor.set("specialKeyFromBusinessPartner", (Object)true);
            vendor.setEntityStatus(EntityStatus.Insert);
            BillDataDto bill = new BillDataDto();
            bill.setBillnum("aa_vendor");
            bill.setData((Object)vendor);
            String saveVenRes = "";
            saveVenRes = this.partnerService.saveVendor(bill, vendor.getCode());
            if (!"".equals(saveVenRes) || AppContext.cache().get(PartnerConstant.PARTNERTOVENDOR_VENDORID + vendor.getId().toString()) == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800043, new Object[]{saveVenRes});
            }
            item2.setVendorId(Long.valueOf(Long.parseLong(AppContext.cache().get(PartnerConstant.PARTNERTOVENDOR_VENDORID + vendor.getId().toString()))));
            item2.setIsDefault(Boolean.valueOf(true));
            item2.setEntityStatus(EntityStatus.Insert);
            MetaDaoHelper.update((String)"base.businesspartner.PartnerVendorComparison", (BizObject)item2);
        }
        vendorComparisons = vendorComparisons.stream().filter(item -> item.getVendorId() != null).collect(Collectors.toList());
        partner.setPartnerVendorComparisons(vendorComparisons);
    }

    public void dealVendorComparison(BusinessPartner partner) throws Exception {
        List vendorComparisons = partner.partnerVendorComparisons();
        if (vendorComparisons == null) {
            return;
        }
        this.checkPartnerSyncCreateVendor(partner, vendorComparisons);
        if (CollectionUtils.isEmpty((Collection)vendorComparisons)) {
            return;
        }
        for (PartnerVendorComparison item2 : vendorComparisons) {
            if (item2.getVendorId() != null || EntityStatus.LOGICDELETE == item2.getEntityStatus()) continue;
            Vendor vendor = new Vendor();
            long vendorId = IdManager.getInstance().nextId();
            vendor.setId((Object)vendorId);
            this.synchronousMultilingual((BizObject)partner, (BizObject)vendor);
            vendor.setOrg((String)item2.get("vendorId_org"));
            if (this.iupcControlRuleService.checkSingleOrg().booleanValue()) {
                vendor.setOrg((String)AppContext.getCurrentUser().get("singleOrgId"));
            }
            if (partner.getPartnerType() != null) {
                vendor.put("supplyType", (Object)partner.getPartnerType().getValue());
            }
            vendor.setVendorclass(item2.get("vendorId_vendorclass") == null ? null : Long.valueOf(Long.parseLong(item2.get("vendorId_vendorclass").toString())));
            if (item2.get("vendorId_vendorclassCode") != null) {
                vendor.put("vendorclass_code", item2.get("vendorId_vendorclassCode"));
            }
            vendor.set("isCreator", (Object)true);
            vendor.set("extSystemCode", (Object)16);
            vendor.set("creditcode", (Object)partner.getCreditCode());
            partner.partnerRoleClasses().forEach(roleClass -> {
                if (RoleClassName.org == roleClass.getRoleClassName() && roleClass.getIsCheck().booleanValue()) {
                    vendor.setInternalunit(Boolean.valueOf(true));
                    vendor.setCorrespondingorg(partner.getInternalOrgId());
                }
            });
            vendor.setEntityStatus(EntityStatus.Insert);
            vendor.set("specialKeyFromBusinessPartner", (Object)true);
            BillDataDto bill = new BillDataDto();
            bill.setBillnum("aa_vendor");
            bill.setData((Object)vendor);
            String saveVenRes = "";
            if (StringUtils.isNotBlank((CharSequence)((CharSequence)item2.get("vendorId_code")))) {
                vendor.setCode(item2.get("vendorId_code").toString());
            } else {
                vendor.setCode(partner.getCode());
            }
            saveVenRes = this.partnerService.saveVendor(bill, vendor.getCode());
            if (!"".equals(saveVenRes) || AppContext.cache().get(PartnerConstant.PARTNERTOVENDOR_VENDORID + vendor.getId().toString()) == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800043, new Object[]{saveVenRes});
            }
            item2.setVendorId(Long.valueOf(Long.parseLong(AppContext.cache().get(PartnerConstant.PARTNERTOVENDOR_VENDORID + vendor.getId().toString()))));
            item2.setIsDefault(Boolean.valueOf(true));
            item2.setEntityStatus(EntityStatus.Insert);
            MetaDaoHelper.update((String)"base.businesspartner.PartnerVendorComparison", (BizObject)item2);
        }
        vendorComparisons = vendorComparisons.stream().filter(item -> item.getVendorId() != null).collect(Collectors.toList());
        partner.setPartnerVendorComparisons(vendorComparisons);
    }

    private void checkPartnerSyncCreateVendor(BusinessPartner partner, List<PartnerVendorComparison> vendorComparisons) {
        if (!partner.containsKey((Object)"partnerSyncCreateVendor") && !partner.containsKey((Object)"merchantSyncCascadeVendor")) {
            Iterator<PartnerVendorComparison> iterator = vendorComparisons.iterator();
            while (iterator.hasNext()) {
                PartnerVendorComparison vendorComparison = iterator.next();
                if (vendorComparison.getVendorId() != null) continue;
                iterator.remove();
            }
        }
    }

    public void dealCapitalComparison(BusinessPartner partner) throws Exception {
        List partnerCapitalComparisons = partner.partnerCapitalComparisons();
        if (partnerCapitalComparisons == null) {
            return;
        }
        this.checkPartnerSyncCreate(partner, partnerCapitalComparisons, PartnerCapitalComparison::getCapitalId, Arrays.asList("partnerSyncCreateCapital"));
        for (PartnerCapitalComparison capitalComparison : partnerCapitalComparisons) {
            if (capitalComparison.getCapitalId() != null || EntityStatus.LOGICDELETE == capitalComparison.getEntityStatus()) continue;
            FundBusinObjArchivesResp fundBusinObjArchivesResp = new FundBusinObjArchivesResp();
            fundBusinObjArchivesResp.setFundbusinobjtypename((String)((BizObject)partner.get("name")).get("zh_CN"));
            if (capitalComparison.get("capitalId_code") != null) {
                fundBusinObjArchivesResp.setCode((String)capitalComparison.get("capitalId_code"));
            } else {
                fundBusinObjArchivesResp.setCode(partner.getCode());
            }
            fundBusinObjArchivesResp.setFundbusinobjtypeid((String)capitalComparison.get("fundbusinobjtypeid"));
            fundBusinObjArchivesResp.setSettlemencenter((String)capitalComparison.get("settlemencenter"));
            fundBusinObjArchivesResp.setBankid((String)capitalComparison.get("openaccountbankid"));
            if (capitalComparison.get("isprivated") != null && capitalComparison.get("isprivated").equals("true")) {
                capitalComparison.put("isprivated", (Object)true);
            } else {
                capitalComparison.put("isprivated", (Object)false);
            }
            fundBusinObjArchivesResp.setIsprivated((Boolean)capitalComparison.get("isprivated"));
            fundBusinObjArchivesResp.setAccentitymanage((String)capitalComparison.get("capitalAccentityManage"));
            fundBusinObjArchivesResp.setAccentity((String)capitalComparison.get("accentity"));
            fundBusinObjArchivesResp.setBizPartner((String)partner.getId());
            fundBusinObjArchivesResp.setOpenaccountbankid((String)capitalComparison.get("openaccountbankid"));
            if (partner.containsKey((Object)"specialKeyFromApi")) {
                fundBusinObjArchivesResp.setAccentitymanagecode((String)capitalComparison.get("capitalAccentityManage_code"));
                fundBusinObjArchivesResp.setFundbusinobjtypecode((String)capitalComparison.get("fundBusinessObjectTypeCodeCode"));
                fundBusinObjArchivesResp.setSettlemencentercode((String)capitalComparison.get("settlemencenter_code"));
                fundBusinObjArchivesResp.setOpenaccountbankcode((String)capitalComparison.get("openaccountbankid_code"));
                fundBusinObjArchivesResp.setAccentitycode((String)capitalComparison.get("accentity_code"));
            }
            fundBusinObjArchivesResp.setUnifiedSocialCreditCode(partner.getCreditCode());
            FundBizObjArchInsertResp fundBizObjArchInsertResp = this.capitalPartnerService.insertFundBizObjArch(fundBusinObjArchivesResp);
            if (fundBizObjArchInsertResp != null) {
                capitalComparison.setCapitalId(fundBizObjArchInsertResp.getId());
                capitalComparison.setIsDefault(Boolean.valueOf(true));
                capitalComparison.setEntityStatus(EntityStatus.Insert);
                partner.partnerRoleClasses().forEach(roleClass -> {
                    if (RoleClassName.CAPITAL.equals((Object)roleClass.getRoleClassName())) {
                        roleClass.setIsCheck(Boolean.valueOf(true));
                    }
                });
            }
            MetaDaoHelper.update((String)"base.businesspartner.PartnerCapitalComparison", partnerCapitalComparisons);
        }
        partnerCapitalComparisons = partnerCapitalComparisons.stream().filter(item -> item.getCapitalId() != null).collect(Collectors.toList());
        partner.setPartnerCapitalComparisons(partnerCapitalComparisons);
    }

    private void synchronousMultilingual(BizObject source, BizObject target) {
        if (source.get("name") != null && source.get("name") instanceof BizObject) {
            BizObject sourceName = (BizObject)source.get("name");
            BizObject targetName = new BizObject();
            LinkedList enableLangVOs = MultiLangContext.getInstance().getEnableLangVOs();
            for (LanguageVO enableLangVO : enableLangVOs) {
                String langCode = enableLangVO.getLangCode();
                if (sourceName.containsKey((Object)langCode)) {
                    // empty if block
                }
                targetName.put(langCode, sourceName.get(langCode));
            }
            target.put("name", (Object)targetName);
        } else if (source.get("name") != null && source.get("name") instanceof String) {
            target.put("name", source.get("name"));
        }
    }

    private <T extends BizObject> void checkPartnerSyncCreate(BusinessPartner partner, List<T> comparisons, Function<T, Object> idExtractor, Collection<String> syncCreateKeys) {
        boolean shouldRemove = syncCreateKeys.stream().noneMatch(arg_0 -> ((BusinessPartner)partner).containsKey(arg_0));
        if (shouldRemove) {
            Iterator<T> iterator = comparisons.iterator();
            while (iterator.hasNext()) {
                BizObject comparison = (BizObject)iterator.next();
                if (idExtractor.apply(comparison) != null) continue;
                iterator.remove();
            }
        }
    }

    public void updateCorrespondingMerchantAndVendor(BusinessPartner partner) throws Exception {
        List partnerMerchantComparisons = partner.partnerMerchantComparisons();
        Long merchantId = !CollectionUtils.isEmpty((Collection)partnerMerchantComparisons) ? (Long)partnerMerchantComparisons.stream().filter(PartnerMerchantComparison::getIsDefault).findFirst().map(PartnerMerchantComparison::getMerchantId).orElse(null) : null;
        Long vendorId = !CollectionUtils.isEmpty((Collection)partner.partnerVendorComparisons()) ? (Long)partner.partnerVendorComparisons().stream().filter(PartnerVendorComparison::getIsDefault).findFirst().map(PartnerVendorComparison::getVendorId).orElse(null) : null;
        if (merchantId != null && vendorId != null) {
            this.updateMerchantSuppliers(merchantId, vendorId);
            this.updateVendorCorrespondingMerchant(vendorId, merchantId);
        }
    }

    private void updateVendorCorrespondingMerchant(Long vendorId, Long merchantId) throws Exception {
        Long correspondingcust = this.vendorPubQueryService.getVendorFieldById(vendorId, new String[]{"correspondingcust"}).getCorrespondingcust();
        if (correspondingcust != merchantId) {
            Vendor vendor = new Vendor();
            vendor.setId((Object)vendorId);
            vendor.setCorrespondingcust(merchantId);
            vendor.set("specialKeyFromBusinessPartner", (Object)true);
            vendor.setEntityStatus(EntityStatus.Update);
            BillDataDto bill = new BillDataDto();
            bill.setBillnum("aa_vendor");
            bill.setData((Object)vendor);
            this.partnerService.saveVendor(bill, vendor.getCode());
        }
    }

    private void updateMerchantSuppliers(Long merchantId, Long vendorId) throws Exception {
        Merchant merchant = new Merchant();
        merchant.setId((Object)merchantId);
        merchant.setSuppliers(vendorId);
        merchant.setEntityStatus(EntityStatus.Update);
        MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchant);
    }
}

