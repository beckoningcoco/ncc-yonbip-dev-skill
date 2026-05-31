/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.billmake.service.MakeBillRuleClientService
 *  com.yonyou.ucf.mdd.ext.bill.billmake.vo.PushAndPullVO
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyoucloud.iuap.upc.dto.PartnerMerchantComparisonQryDTO
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.vendor.Vendor
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.BusinessPartnerUtils
 *  com.yonyoucloud.upc.utils.MerchantUtils
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
 *  org.springframework.util.ObjectUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.billmake.service.MakeBillRuleClientService;
import com.yonyou.ucf.mdd.ext.bill.billmake.vo.PushAndPullVO;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyoucloud.iuap.upc.dto.PartnerMerchantComparisonQryDTO;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.vendor.Vendor;
import com.yonyoucloud.upc.service.BusinessPartnerService;
import com.yonyoucloud.upc.service.api.BusinessPartnerServiceImpl;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.BusinessPartnerUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
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
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Component(value="syncMerchantToPartnerRule")
public class SyncMerchantToPartnerRule
extends AbstractCommonRule {
    Logger logger = LoggerFactory.getLogger(SyncMerchantToPartnerRule.class);
    @Autowired
    private BusinessPartnerServiceImpl iBusinessPartnerService;
    @Autowired
    private MakeBillRuleClientService makeBillRuleClientService;
    @Autowired
    private BusinessPartnerService partnerService;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        LoginUser currentUser = AppContext.getCurrentUser();
        if (null == currentUser) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800108);
        }
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List bills = this.getBills(billContext, map);
        for (BizObject bill : bills) {
            String customerClassId;
            PartnerMerchantComparisonQryDTO partnerMerchantComparisonQryDTO;
            Merchant merchant = (Merchant)bill;
            List merchantApplyRanges = (List)merchant.get("merchantApplyRanges");
            if (!CollectionUtils.isEmpty((Collection)merchantApplyRanges)) {
                for (MerchantApplyRange merchantApplyRange : merchantApplyRanges) {
                    if (merchantApplyRange.getIsCreator() == null || !merchantApplyRange.getIsCreator().booleanValue()) continue;
                    merchant.put("createMerchantApplyRangeId", merchantApplyRange.get("id"));
                }
            }
            if (!(!merchant.containsKey((Object)"specialKeyFromBusinessPartner") && !Boolean.FALSE.equals(merchant.get("isCreator")) || bill.get("srcBill") != null && "CRM".equals(bill.get("srcBill")))) {
                return new RuleExecuteResult();
            }
            if (merchant.getEntityStatus() == EntityStatus.Update) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("businessPartner");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(merchant.getId())}));
                Map merchantSql = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)querySchema);
                if (!CollectionUtils.isEmpty((Map)merchantSql) && merchantSql.get("businessPartner") != null && !merchantSql.get("businessPartner").toString().equals(merchant.getBusinessPartner())) {
                    partnerMerchantComparisonQryDTO = new PartnerMerchantComparisonQryDTO();
                    partnerMerchantComparisonQryDTO.setPartnerId(merchantSql.get("businessPartner").toString());
                    partnerMerchantComparisonQryDTO.setMerchantId((Long)merchant.getId());
                    this.iBusinessPartnerService.delMerchantComparison(partnerMerchantComparisonQryDTO);
                }
            }
            if ("null".equals(customerClassId = String.valueOf(merchant.getCustomerClass()))) {
                customerClassId = null;
            }
            this.merchantToVendor(merchant);
            Boolean isMerCanToPartner = this.iBusinessPartnerService.merCanToPartner((Long)merchant.getId(), merchant.getBusinessPartner(), merchant.getTransType(), customerClassId);
            if (isMerCanToPartner.booleanValue()) {
                AppContext.delThreadContext((String)"mddTransTypeId");
                ResultList resultList = this.iBusinessPartnerService.merchantToPartner(merchant, merchant.getBusinessPartner());
                if (!ObjectUtils.isEmpty((Object)resultList) && !CollectionUtils.isEmpty((Collection)resultList.getMessages()) && resultList.getMessages().get(0) instanceof String) {
                    String message = (String)resultList.getMessages().get(0);
                    if (StringUtils.hasText((String)message) && message.contains("returnPartnerId#")) {
                        message = message.replace("returnPartnerId#", "");
                        Merchant merchantBusinessPartner = new Merchant();
                        merchantBusinessPartner.setId(merchant.getId());
                        merchantBusinessPartner.setBusinessPartner(message);
                        merchantBusinessPartner.setEntityStatus(EntityStatus.Update);
                        MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchantBusinessPartner);
                    } else if (StringUtils.hasText((String)message)) {
                        this.logger.error("syncMerchantToPartnerRule_error:{}", (Object)message);
                        throw new CoreDocBusinessException(message);
                    }
                }
            }
            if (!MerchantUtils.isExists((Map)merchant, (String)"businessPartner")) continue;
            partnerMerchantComparisonQryDTO = new PartnerMerchantComparisonQryDTO();
            partnerMerchantComparisonQryDTO.setPartnerId(merchant.getBusinessPartner());
            partnerMerchantComparisonQryDTO.setMerchantId((Long)merchant.getId());
            this.iBusinessPartnerService.saveMerchantComparison(partnerMerchantComparisonQryDTO);
        }
        return new RuleExecuteResult();
    }

    public void merchantToVendor(Merchant merchant) throws Exception {
        String locale;
        List targetList;
        Boolean canGenerateVendorFromMerchant = this.iBusinessPartnerService.canGenerateVendorFromMerchant();
        if (!canGenerateVendorFromMerchant.booleanValue()) {
            return;
        }
        PushAndPullVO pushAndPullVO = new PushAndPullVO();
        pushAndPullVO.setCode("merchant_to_vendor");
        pushAndPullVO.setIsMainSelect(1);
        ArrayList<String> childIds = new ArrayList<String>();
        childIds.add(merchant.getId().toString());
        pushAndPullVO.setChildIds(childIds);
        HashMap<String, Boolean> isUseBusiQuery = new HashMap<String, Boolean>();
        isUseBusiQuery.put("isUseBusiQuery", true);
        pushAndPullVO.setExternalDataMap(isUseBusiQuery);
        Map targetMap = this.makeBillRuleClientService.getTargetList(pushAndPullVO, "push");
        Vendor vendor = null;
        if (targetMap != null && targetMap.get("tarList") != null && !CollectionUtils.isEmpty((Collection)(targetList = (List)targetMap.get("tarList")))) {
            for (Vendor target : targetList) {
                target.remove("isPullAndPushTarget");
                target.remove("vouchdate");
                vendor = target;
            }
        }
        String string = locale = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
        if (vendor != null) {
            String relation = this.pubOptionDataQueryUtil.queryMerchantToVendorRelation((String)AppContext.getYTenantId());
            Collection existVendorMap = null;
            if (StringUtils.hasLength((String)relation)) {
                switch (relation) {
                    case "code": {
                        QuerySchema queryVendorByCodeSchema = QuerySchema.create().addSelect("id, org").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)merchant.getCode())}));
                        existVendorMap = MetaDaoHelper.query((String)"aa.vendor.Vendor", (QuerySchema)queryVendorByCodeSchema);
                        break;
                    }
                    case "creditCode": {
                        QuerySchema queryVendorByCreditCodeSchema = QuerySchema.create().addSelect("id, org").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"creditCode").eq((Object)merchant.getCreditCode())}));
                        existVendorMap = MetaDaoHelper.query((String)"aa.vendor.Vendor", (QuerySchema)queryVendorByCreditCodeSchema);
                        break;
                    }
                    case "name": {
                        String name = BusinessPartnerUtils.mulLangObjectConvertString((Object)merchant.get("name"), (String)locale);
                        QuerySchema queryVendorByNameSchema = QuerySchema.create().addSelect("id, org").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)name)}));
                        existVendorMap = MetaDaoHelper.query((String)"aa.vendor.Vendor", (QuerySchema)queryVendorByNameSchema);
                        break;
                    }
                }
            } else {
                QuerySchema queryVendorByCodeSchema = QuerySchema.create().addSelect("id, org").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)merchant.getCode())}));
                existVendorMap = MetaDaoHelper.query((String)"aa.vendor.Vendor", (QuerySchema)queryVendorByCodeSchema);
                if (CollectionUtils.isEmpty((Collection)existVendorMap)) {
                    QuerySchema queryVendorByCreditCodeSchema = QuerySchema.create().addSelect("id, org").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"creditCode").eq((Object)merchant.getCreditCode())}));
                    existVendorMap = MetaDaoHelper.query((String)"aa.vendor.Vendor", (QuerySchema)queryVendorByCreditCodeSchema);
                }
                if (CollectionUtils.isEmpty((Collection)existVendorMap)) {
                    locale = InvocationInfoProxy.getLocale() == null ? "zh_CN" : InvocationInfoProxy.getLocale();
                    String name = BusinessPartnerUtils.mulLangObjectConvertString((Object)merchant.get("name"), (String)locale);
                    QuerySchema queryVendorByNameSchema = QuerySchema.create().addSelect("id, org").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"name").eq((Object)name)}));
                    existVendorMap = MetaDaoHelper.query((String)"aa.vendor.Vendor", (QuerySchema)queryVendorByNameSchema);
                }
            }
            if (!CollectionUtils.isEmpty(existVendorMap)) {
                Set originalOrgIds = existVendorMap.stream().map(item -> {
                    if (item.get("org") != null) {
                        return item.get("org").toString();
                    }
                    return "";
                }).collect(Collectors.toSet());
                Set filteredOrgIds = BusinessPartnerUtils.filterInternalOrgIds(originalOrgIds);
                Iterator iterator = existVendorMap.iterator();
                while (iterator.hasNext()) {
                    Map item2 = (Map)iterator.next();
                    if (item2.get("org") == null || filteredOrgIds.contains(item2.get("org").toString())) continue;
                    iterator.remove();
                }
            }
            if (!CollectionUtils.isEmpty((Collection)existVendorMap)) {
                if (existVendorMap.size() > 1) {
                    return;
                }
                vendor.setId(((Map)existVendorMap.get(0)).get("id"));
                vendor.setEntityStatus(EntityStatus.Update);
                vendor.remove("vendorbanks");
                vendor.remove("vendorAddresses");
                vendor.remove("vendorcontactss");
            } else {
                vendor.setEntityStatus(EntityStatus.Insert);
            }
            if (vendor.get("serviceRange") != null && vendor.get("serviceRange") instanceof BizObject) {
                vendor.set("serviceRange", (Object)BusinessPartnerUtils.mulLangObjectConvertString((Object)vendor.get("serviceRange"), (String)locale));
            }
            BillDataDto bill = new BillDataDto();
            bill.setBillnum("aa_vendor");
            bill.setData((Object)vendor);
            String saveVenRes = this.partnerService.saveVendor(bill, vendor.getCode());
            BusinessPartnerUtils.updateMerchantSuppliers((Long)((Long)merchant.getId()), (Long)((Long)vendor.getId()));
        }
    }
}

