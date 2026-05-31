/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants
 *  com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantSaleAreaQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantPrincipalVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantSaleAreaVO
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.bpm.model.VerifyState
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApply
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApplyAddRange
 *  com.yonyoucloud.upc.aa.customerapply.CustomerApplyType
 *  com.yonyoucloud.upc.aa.customerapply.CustomerEffectType
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.data.customerapply.CustomerApplyAddRangeDao
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.upc.data.salearea.SaleAreaApplyRangeDao
 *  com.yonyoucloud.upc.utils.EmailUtils
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
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.billrule.customerapply;

import com.alibaba.fastjson.JSONObject;
import com.yonyou.iuap.apdoc.coredoc.constants.UPCConstants;
import com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantSaleAreaQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantPrincipalVO;
import com.yonyou.iuap.apdoc.coredoc.vo.merchant.MerchantSaleAreaVO;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.bpm.model.VerifyState;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.customerapply.CustomerApply;
import com.yonyoucloud.upc.aa.customerapply.CustomerApplyAddRange;
import com.yonyoucloud.upc.aa.customerapply.CustomerApplyType;
import com.yonyoucloud.upc.aa.customerapply.CustomerEffectType;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.data.customerapply.CustomerApplyAddRangeDao;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.data.salearea.SaleAreaApplyRangeDao;
import com.yonyoucloud.upc.service.CustomerApplyService;
import com.yonyoucloud.upc.service.MerchantCheckService;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.addrange.KafkaMerchantAddRangeService;
import com.yonyoucloud.upc.utils.EmailUtils;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
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
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="customerApplyDataProcessRule")
public class CustomerApplyDataProcessRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(CustomerApplyDataProcessRule.class);
    @Autowired
    private CustomerApplyService customerApplyService;
    @Autowired
    private MerchantCheckService merchantCheckService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    private CustomerApplyAddRangeDao customerApplyAddRangeDao;
    @Autowired
    private SaleAreaApplyRangeDao saleAreaApplyRangeDao;
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private KafkaMerchantAddRangeService merchantAddRangeService;
    @Autowired
    private MerchantSaleAreaQryDao merchantSaleAreaQryDao;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        List bills = this.getBills(billContext, map);
        for (BizObject bill : bills) {
            CustomerApply customerApply = (CustomerApply)bill;
            int customerApplyCount = this.customerApplyService.getCustomerApplyCountByVerifyState(customerApply, Arrays.asList(VerifyState.INIT_NEW_OPEN.getValue(), VerifyState.SUBMITED.getValue(), VerifyState.REJECTED_TO_MAKEBILL.getValue()));
            if (customerApplyCount > 5000) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800095, new Object[]{5000});
            }
            if (EntityStatus.Insert == bill.getEntityStatus()) {
                if (CustomerEffectType.timeing == customerApply.getEffectType() && null == customerApply.getEffectTime()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_EFFECT_TIME_NOT_NULL_FOR_DELAY_EFFECT);
                }
                this.customerApplyService.setInsertDate(customerApply);
            }
            if (CustomerEffectType.timeing == customerApply.getEffectType() && null != customerApply.getEffectTime() && this.customerApplyService.compareEffectTime(customerApply.getEffectTime())) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_APPLY_EFFECT_TIME_NOT_LESS_THAN_CURRENT_TIME_FOR_DELAY_EFFECT);
            }
            if (StringUtils.isEmpty((Object)customerApply.getApplicationOrg())) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801631);
            }
            if (CustomerApplyType.modify == customerApply.getApplyType() || CustomerApplyType.add == customerApply.getApplyType()) {
                if (customerApply.getCustomerData() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800096);
                }
                if (CustomerApplyType.modify == customerApply.getApplyType()) {
                    final String lockKey = "aa.customerapply.CustomerApply_" + AppContext.getYhtTenantId() + "_" + customerApply.getApplyCustomer();
                    final String requestId = UUID.randomUUID().toString();
                    int tryLockNum = 0;
                    while (true) {
                        if (tryLockNum > 60) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800097);
                        }
                        ++tryLockNum;
                        if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)UPCConstants.LOCK_EXPIRE_TIME)) {
                            TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                                public void afterCompletion(int status) {
                                    RedisTool.releaseLock((String)lockKey, (String)requestId);
                                }
                            });
                            List customerApplyInDbList = MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApply", (QuerySchema)QuerySchema.create().addSelect("id,applyType,customerData").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_eq(customerApply.getId()), QueryCondition.name((String)"applyCustomer").eq((Object)customerApply.getApplyCustomer()), QueryCondition.name((String)"verifystate").in(new Object[]{0, 1, 4})})), null);
                            if (CollectionUtils.isEmpty((Collection)customerApplyInDbList)) break;
                            Map currCustomerData = (Map)JSONObject.parseObject((String)customerApply.getCustomerData(), Map.class);
                            for (CustomerApply apply : customerApplyInDbList) {
                                Map existCustomerData;
                                if (apply.getApplyType() != CustomerApplyType.modify || !(existCustomerData = (Map)JSONObject.parseObject((String)apply.getCustomerData(), Map.class)).get("belongOrg").equals(currCustomerData.get("belongOrg"))) continue;
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800098);
                            }
                            break;
                        }
                        TimeUnit.MILLISECONDS.sleep(200L);
                    }
                }
                Map currCustomerData = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(customerApply.getCustomerData(), Map.class);
                this.checkCustomerApplyEmail(currCustomerData);
                this.theCheckMerchantFromCustomerApply(currCustomerData, customerApply);
                this.setCustomerApplyMerchantName(customerApply);
                this.merchantCheckService.checkMerchantNameFromCustomerApply(customerApply);
                this.merchantCheckService.dealCodeFromCustomerApply(customerApply);
                this.theCheckMerchantData(customerApply);
                this.customerApplyService.fillInfoData(customerApply);
                continue;
            }
            if (CustomerApplyType.ADD_RANGE != customerApply.getApplyType()) continue;
            customerApply.setCustomerData(null);
            this.checkCustomerApplyAddRangeIsNull(customerApply);
            this.supplementaryData(customerApply);
            List customerApplyInDbList = MetaDaoHelper.queryObject((String)"aa.customerapply.CustomerApply", (QuerySchema)QuerySchema.create().addSelect("id,applyType,customerData").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").not_eq(customerApply.getId()), QueryCondition.name((String)"applyCustomer").eq((Object)customerApply.getApplyCustomer()), QueryCondition.name((String)"verifystate").in(new Object[]{0, 1, 4})})), null);
            if (!CollectionUtils.isEmpty((Collection)customerApplyInDbList)) {
                for (CustomerApply apply : customerApplyInDbList) {
                    if (apply.getApplyType() != CustomerApplyType.ADD_RANGE) continue;
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800098);
                }
            }
            this.checkCustomerApplyAddRange(customerApply);
        }
        return new RuleExecuteResult();
    }

    private void setCustomerApplyMerchantName(CustomerApply customerApply) throws Exception {
        String customerData = customerApply.getCustomerData();
        if (null != customerData) {
            List principalList;
            Map Merchant2 = (Map)JSONObject.parseObject((String)customerData, Map.class);
            if (!StringUtils.isEmpty(Merchant2.get("code"))) {
                customerApply.setMerchantCode(Merchant2.get("code").toString());
            }
            if (!StringUtils.isEmpty(Merchant2.get("name"))) {
                String locale = InvocationInfoProxy.getLocale();
                if (Merchant2.get("name") instanceof String) {
                    customerApply.setMerchantName(Merchant2.get("name").toString());
                } else if (Merchant2.get("name") instanceof Object) {
                    Map name = (Map)Merchant2.get("name");
                    if (!StringUtils.isEmpty(name.get(locale))) {
                        customerApply.setMerchantName(name.get(locale).toString());
                    } else {
                        for (Object item : name.values()) {
                            if (!Objects.nonNull(item) || !StringUtils.hasText((String)item.toString())) continue;
                            customerApply.setMerchantName(item.toString());
                            break;
                        }
                    }
                    if (StringUtils.isEmpty(name.get("zh_CN"))) {
                        name.put("zh_CN", customerApply.getMerchantName());
                        Merchant2.put("name", name);
                        customerApply.setCustomerData(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)Merchant2));
                    }
                }
            }
            if (!CollectionUtils.isEmpty((Collection)(principalList = (List)Merchant2.get("principals")))) {
                boolean isSpecialManagementDep = true;
                boolean isProfessSalesman = true;
                for (Map principal : principalList) {
                    if (StringUtils.isEmpty(principal.get("isDefault")) || !"true".equals(principal.get("isDefault").toString())) continue;
                    if (!StringUtils.isEmpty(principal.get("specialManagementDep_Name"))) {
                        customerApply.setPrincipalSpecialManagementDep(principal.get("specialManagementDep_Name").toString());
                        isSpecialManagementDep = false;
                    }
                    if (StringUtils.isEmpty(principal.get("professSalesman_Name"))) continue;
                    customerApply.setPrincipalProfessSalesman(principal.get("professSalesman_Name").toString());
                    isProfessSalesman = false;
                }
                if (isSpecialManagementDep) {
                    customerApply.setPrincipalSpecialManagementDep(null);
                }
                if (isProfessSalesman) {
                    customerApply.setPrincipalProfessSalesman(null);
                }
            }
        }
    }

    private void checkEmail(Map<String, List<Map<String, Object>>> emailMap) {
        for (Map.Entry<String, List<Map<String, Object>>> stringListEntry : emailMap.entrySet()) {
            List<Map<String, Object>> listEmails = stringListEntry.getValue();
            if (CollectionUtils.isEmpty(listEmails)) continue;
            listEmails.forEach(email -> {
                if (MerchantUtils.isExists((Map)email, (String)"email") && !EmailUtils.validateEmail((String)email.get("email").toString())) {
                    switch ((String)stringListEntry.getKey()) {
                        case "merchantContacterInfos": {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CONTACTER_EMAIL_ERROR);
                        }
                        case "merchantAddressInfos": {
                            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.ADDRESS_EMAIL_ERROR);
                        }
                    }
                }
            });
        }
    }

    private void checkCustomerApplyEmail(Map currCustomerData) {
        if (MerchantUtils.isExists((Map)currCustomerData, (String)"email") && !EmailUtils.validateEmail((String)currCustomerData.get("email").toString())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.QUALIFICATION_EMAIL_ERROR);
        }
        if (MerchantUtils.isExists((Map)currCustomerData, (String)"merchantsManager!email") && !EmailUtils.validateEmail((String)currCustomerData.get("merchantsManager!email").toString())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_MANAGER_EMAIL_ERROR);
        }
        HashMap<String, List> addressInfosMap = new HashMap<String, List>();
        addressInfosMap.put("merchantAddressInfos", (List)currCustomerData.get("merchantAddressInfos"));
        HashMap<String, List> contacterInfosMap = new HashMap<String, List>();
        contacterInfosMap.put("merchantContacterInfos", (List)currCustomerData.get("merchantContacterInfos"));
    }

    private void theCheckMerchantFromCustomerApply(Map currCustomerData, CustomerApply customerApply) throws Exception {
        Merchant merchant = this.merchantCheckService.checkInitMerchantFromCustomerApply(currCustomerData);
        this.merchantCheckService.checkMerchantFromCustomerApply(merchant, customerApply);
    }

    private void theCheckMerchantData(CustomerApply customerApply) throws Exception {
        Merchant merchant = (Merchant)UpcJacksonUtils.OBJECT_MAPPER.readValue(customerApply.getCustomerData(), Merchant.class);
        this.merchantCheckService.theMerchantQualificationDocumentCheck(merchant);
        this.merchantService.assignerMerchantApplyRangeFromCustomerApply(merchant);
        customerApply.setCustomerData(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)merchant));
    }

    private void checkCustomerApplyAddRangeIsNull(CustomerApply customerApply) throws Exception {
        if (customerApply.getApplyType() == CustomerApplyType.ADD_RANGE) {
            List customerApplyAddRangeList;
            if (customerApply.getApplyCustomer() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800099);
            }
            if (customerApply.getEntityStatus() == EntityStatus.Insert) {
                List customerApplyAddRangeList2 = customerApply.customerApplyAddRanges();
                if (CollectionUtils.isEmpty((Collection)customerApplyAddRangeList2)) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_ORG_NOT_NULL);
                }
                for (CustomerApplyAddRange customerApplyAddRange : customerApplyAddRangeList2) {
                    if (StringUtils.hasText((String)customerApplyAddRange.getOrgId())) continue;
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_ORG_NOT_NULL);
                }
            } else if (customerApply.getEntityStatus() == EntityStatus.Update && !CollectionUtils.isEmpty((Collection)(customerApplyAddRangeList = customerApply.customerApplyAddRanges()))) {
                List customerApplyAddRangeInDbList;
                ArrayList<String> deleteAddRangeIds = new ArrayList<String>();
                for (CustomerApplyAddRange customerApplyAddRange : customerApplyAddRangeList) {
                    if (customerApplyAddRange.getEntityStatus() == EntityStatus.Insert && !StringUtils.hasText((String)customerApplyAddRange.getOrgId())) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_ORG_NOT_NULL);
                    }
                    if (customerApplyAddRange.getEntityStatus() == EntityStatus.Update && customerApplyAddRange.containsKey((Object)"orgId") && !StringUtils.hasText((String)customerApplyAddRange.getOrgId())) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_ORG_NOT_NULL);
                    }
                    if (customerApplyAddRange.getEntityStatus() != EntityStatus.Delete || customerApplyAddRange.getId() == null) continue;
                    deleteAddRangeIds.add((String)customerApplyAddRange.getId());
                }
                if (!CollectionUtils.isEmpty(deleteAddRangeIds) && CollectionUtils.isEmpty((Collection)(customerApplyAddRangeInDbList = this.customerApplyAddRangeDao.getApplyAddRangeListByNotInId((Long)customerApply.getId(), deleteAddRangeIds))) && customerApplyAddRangeList.size() == deleteAddRangeIds.size()) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_ORG_NOT_NULL);
                }
            }
        }
    }

    private void supplementaryData(CustomerApply customerApply) throws Exception {
        if (customerApply.getApplyType() == CustomerApplyType.ADD_RANGE) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,code,name");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)customerApply.getApplyCustomer())}));
            List originalMerchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)originalMerchantList)) {
                customerApply.setMerchantCode(((Merchant)originalMerchantList.get(0)).getCode());
                customerApply.setMerchantName(((Merchant)originalMerchantList.get(0)).getName());
            }
        }
    }

    private void checkCustomerApplyAddRange(CustomerApply customerApply) throws Exception {
        if (customerApply.getApplyType() == CustomerApplyType.ADD_RANGE) {
            if (CollectionUtils.isEmpty((Collection)customerApply.customerApplyAddRanges())) {
                return;
            }
            Long merchantId = customerApply.getApplyCustomer();
            Merchant originalMerchant = this.merchantGroupDao.getMerchantById(merchantId);
            if (originalMerchant != null) {
                HashSet<String> orgIdSet = new HashSet<String>();
                ArrayList<String> addRangeIdList = new ArrayList<String>();
                int orgIdCount = 0;
                List<String> shareAll = this.upcControlRuleService.getOrgRangeShareAllWithoutAutoShare("aa.merchant.Merchant", originalMerchant.getCreateOrg());
                List originalMerchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeByMerchantId(AppContext.getCurrentUser().getYTenantId(), merchantId);
                if (CollectionUtils.isEmpty((Collection)originalMerchantApplyRangeList)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800100);
                }
                List<String> originalMerchantApplyRangeOrgIdList = originalMerchantApplyRangeList.stream().filter(Objects::nonNull).map(MerchantApplyRange::getOrgId).collect(Collectors.toList());
                Map<String, String> rangeMapInDb = this.merchantAddRangeService.getRangeMapInDb(Collections.singletonList(merchantId), originalMerchantApplyRangeOrgIdList);
                HashMap<String, String> rangeOrgMap = new HashMap<String, String>();
                if (!CollectionUtils.isEmpty(rangeMapInDb)) {
                    for (String merchantIdorgId : rangeMapInDb.keySet()) {
                        rangeOrgMap.put(rangeMapInDb.get(merchantIdorgId), merchantIdorgId);
                    }
                }
                List merchantSaleAreaVOList = this.merchantSaleAreaQryDao.listMerchantSaleAreaById(Arrays.asList(merchantId), null, null);
                HashMap<String, Object> rangeIdSaleAreaIdMap = new HashMap<String, Object>();
                HashMap<String, Boolean> orgIdSaleAreaDefaultMap = new HashMap<String, Boolean>();
                HashMap<String, Boolean> orgIdPrincipalDefaultMap = new HashMap<String, Boolean>();
                if (!CollectionUtils.isEmpty((Collection)merchantSaleAreaVOList)) {
                    for (MerchantSaleAreaVO merchantSaleAreaVO : merchantSaleAreaVOList) {
                        if (merchantSaleAreaVO.getMerchantApplyRangeId() != null && merchantSaleAreaVO.getIsDefault().booleanValue() && rangeOrgMap != null && rangeOrgMap.get(merchantSaleAreaVO.getMerchantApplyRangeId().toString()) != null) {
                            String orgId = ((String)rangeOrgMap.get(merchantSaleAreaVO.getMerchantApplyRangeId().toString())).substring(merchantId.toString().length());
                            orgIdSaleAreaDefaultMap.put(orgId, true);
                        }
                        if (merchantSaleAreaVO.getMerchantApplyRangeId() == null || merchantSaleAreaVO.getSaleAreaId() == null) continue;
                        if (rangeIdSaleAreaIdMap.get(merchantSaleAreaVO.getMerchantApplyRangeId()) != null) {
                            ((Set)rangeIdSaleAreaIdMap.get(merchantSaleAreaVO.getMerchantApplyRangeId())).add(merchantSaleAreaVO.getSaleAreaId());
                            continue;
                        }
                        HashSet saleAreaIdSet = new HashSet();
                        saleAreaIdSet.add(merchantSaleAreaVO.getSaleAreaId());
                        rangeIdSaleAreaIdMap.put(merchantSaleAreaVO.getMerchantApplyRangeId().toString(), saleAreaIdSet);
                    }
                }
                List merchantPrincipalVOList = this.merchantSaleAreaQryDao.listMerchantPrincipalById(Arrays.asList(merchantId), null, null);
                HashMap rangeIdPrincipalMap = new HashMap();
                if (!CollectionUtils.isEmpty((Collection)merchantPrincipalVOList)) {
                    for (MerchantPrincipalVO merchantPrincipalVO : merchantPrincipalVOList) {
                        if (merchantPrincipalVO.getMerchantApplyRangeId() != null && merchantPrincipalVO.getIsDefault().booleanValue() && rangeOrgMap != null && rangeOrgMap.get(merchantPrincipalVO.getMerchantApplyRangeId().toString()) != null) {
                            String orgId = ((String)rangeOrgMap.get(merchantPrincipalVO.getMerchantApplyRangeId().toString())).substring(merchantId.toString().length());
                            orgIdPrincipalDefaultMap.put(orgId, true);
                        }
                        if (merchantPrincipalVO.getMerchantApplyRangeId() == null || merchantPrincipalVO.getProfessSalesman() == null) continue;
                        if (rangeIdPrincipalMap.get(merchantPrincipalVO.getMerchantApplyRangeId()) != null) {
                            ((Set)rangeIdPrincipalMap.get(merchantPrincipalVO.getMerchantApplyRangeId())).add(merchantPrincipalVO.getProfessSalesman());
                            continue;
                        }
                        HashSet<String> principalSet = new HashSet<String>();
                        principalSet.add(merchantPrincipalVO.getProfessSalesman());
                        rangeIdPrincipalMap.put(merchantPrincipalVO.getMerchantApplyRangeId().toString(), principalSet);
                    }
                }
                HashMap orgIdSaleAreaIdMap = new HashMap();
                HashMap orgIdPrincipalMap = new HashMap();
                for (CustomerApplyAddRange customerApplyAddRange : customerApply.customerApplyAddRanges()) {
                    if (customerApplyAddRange.getEntityStatus() == EntityStatus.Insert || customerApplyAddRange.getEntityStatus() == EntityStatus.Update || customerApplyAddRange.getEntityStatus() == EntityStatus.Unchanged) {
                        List saleAreaApplyRanges;
                        orgIdSet.add(customerApplyAddRange.getOrgId());
                        ++orgIdCount;
                        if (!CollectionUtils.isEmpty(originalMerchantApplyRangeOrgIdList) && !originalMerchantApplyRangeOrgIdList.contains(customerApplyAddRange.getOrgId())) {
                            if (CollectionUtils.isEmpty(shareAll) || !shareAll.contains(customerApplyAddRange.getOrgId())) {
                                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800101, new Object[]{customerApplyAddRange.getUiOrgIdName(), originalMerchant.getName()});
                            }
                            if (customerApplyAddRange.getOrgId() != null && BooleanUtil.isTrue((Object)customerApplyAddRange.getDefaultSaleArea())) {
                                if (BooleanUtil.isTrue(orgIdSaleAreaDefaultMap.get(customerApplyAddRange.getOrgId()))) {
                                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_DEFAULT_SALE_AREA, new Object[]{customerApplyAddRange.getUiOrgIdName()});
                                }
                                orgIdSaleAreaDefaultMap.put(customerApplyAddRange.getOrgId(), true);
                            }
                            if (customerApplyAddRange.getOrgId() != null && customerApplyAddRange.getSaleAreaId() != null) {
                                if (orgIdSaleAreaIdMap.get(customerApplyAddRange.getOrgId()) != null && ((Set)orgIdSaleAreaIdMap.get(customerApplyAddRange.getOrgId())).contains(customerApplyAddRange.getSaleAreaId())) {
                                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_SALE_AREA_REPEAT, new Object[]{customerApplyAddRange.getUiOrgIdName(), customerApplyAddRange.getUiSaleAreaName()});
                                }
                                if (orgIdSaleAreaIdMap.get(customerApplyAddRange.getOrgId()) != null) {
                                    ((Set)orgIdSaleAreaIdMap.get(customerApplyAddRange.getOrgId())).add(customerApplyAddRange.getSaleAreaId());
                                } else {
                                    HashSet<Long> saleAreaIdSet = new HashSet<Long>();
                                    saleAreaIdSet.add(customerApplyAddRange.getSaleAreaId());
                                    orgIdSaleAreaIdMap.put(customerApplyAddRange.getOrgId(), saleAreaIdSet);
                                }
                            }
                            if (customerApplyAddRange.getOrgId() != null && BooleanUtil.isTrue((Object)customerApplyAddRange.getDefaultPrincipal())) {
                                if (BooleanUtil.isTrue(orgIdPrincipalDefaultMap.get(customerApplyAddRange.getOrgId()))) {
                                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_DEFAULT_PRINCIPAL, new Object[]{customerApplyAddRange.getUiOrgIdName()});
                                }
                                orgIdPrincipalDefaultMap.put(customerApplyAddRange.getOrgId(), true);
                            }
                            if (customerApplyAddRange.getOrgId() != null && customerApplyAddRange.getProfessSalesmanId() != null) {
                                if (orgIdPrincipalMap.get(customerApplyAddRange.getOrgId()) != null && ((Set)orgIdPrincipalMap.get(customerApplyAddRange.getOrgId())).contains(customerApplyAddRange.getProfessSalesmanId())) {
                                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_PRINCIPAL_REPEAT, new Object[]{customerApplyAddRange.getUiOrgIdName(), customerApplyAddRange.getUiProfessSalesmanIdName()});
                                }
                                if (orgIdPrincipalMap.get(customerApplyAddRange.getOrgId()) != null) {
                                    ((Set)orgIdPrincipalMap.get(customerApplyAddRange.getOrgId())).add(customerApplyAddRange.getProfessSalesmanId());
                                } else {
                                    HashSet<String> principalSet = new HashSet<String>();
                                    principalSet.add(customerApplyAddRange.getProfessSalesmanId());
                                    orgIdPrincipalMap.put(customerApplyAddRange.getOrgId(), principalSet);
                                }
                            }
                        } else if (!CollectionUtils.isEmpty(originalMerchantApplyRangeOrgIdList) && originalMerchantApplyRangeOrgIdList.contains(customerApplyAddRange.getOrgId())) {
                            String rangeId = null;
                            if (rangeMapInDb != null && rangeMapInDb.get(merchantId + customerApplyAddRange.getOrgId()) != null) {
                                rangeId = rangeMapInDb.get(merchantId + customerApplyAddRange.getOrgId());
                            }
                            if (customerApplyAddRange.getOrgId() != null && customerApplyAddRange.getSaleAreaId() != null) {
                                if (rangeId != null && rangeIdSaleAreaIdMap.get(rangeId) != null && ((Set)rangeIdSaleAreaIdMap.get(rangeId)).contains(customerApplyAddRange.getSaleAreaId())) {
                                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_SALE_AREA_REPEAT, new Object[]{customerApplyAddRange.getUiOrgIdName(), customerApplyAddRange.getUiSaleAreaName()});
                                }
                                if (rangeId != null && rangeIdSaleAreaIdMap.get(rangeId) != null) {
                                    ((Set)rangeIdSaleAreaIdMap.get(rangeId)).add(customerApplyAddRange.getSaleAreaId());
                                } else if (rangeId != null && rangeIdSaleAreaIdMap.get(rangeId) == null) {
                                    HashSet<Long> saleAreaIdSet = new HashSet<Long>();
                                    saleAreaIdSet.add(customerApplyAddRange.getSaleAreaId());
                                    rangeIdSaleAreaIdMap.put(rangeId, saleAreaIdSet);
                                }
                            }
                            if (customerApplyAddRange.getOrgId() != null && BooleanUtil.isTrue((Object)customerApplyAddRange.getDefaultSaleArea())) {
                                if (rangeId != null && BooleanUtil.isTrue(orgIdSaleAreaDefaultMap.get(customerApplyAddRange.getOrgId()))) {
                                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_DEFAULT_SALE_AREA, new Object[]{customerApplyAddRange.getUiOrgIdName()});
                                }
                                if (rangeId != null) {
                                    orgIdSaleAreaDefaultMap.put(customerApplyAddRange.getOrgId(), true);
                                }
                            }
                            if (customerApplyAddRange.getOrgId() != null && customerApplyAddRange.getProfessSalesmanId() != null) {
                                if (rangeId != null && rangeIdPrincipalMap.get(rangeId) != null && ((Set)rangeIdPrincipalMap.get(rangeId)).contains(customerApplyAddRange.getProfessSalesmanId())) {
                                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_PRINCIPAL_REPEAT, new Object[]{customerApplyAddRange.getUiOrgIdName(), customerApplyAddRange.getUiProfessSalesmanIdName()});
                                }
                                if (rangeId != null && rangeIdPrincipalMap.get(rangeId) != null) {
                                    ((Set)rangeIdPrincipalMap.get(rangeId)).add(customerApplyAddRange.getProfessSalesmanId());
                                } else if (rangeId != null && rangeIdPrincipalMap.get(rangeId) == null) {
                                    HashSet<String> principalSet = new HashSet<String>();
                                    principalSet.add(customerApplyAddRange.getProfessSalesmanId());
                                    rangeIdPrincipalMap.put(rangeId, principalSet);
                                }
                            }
                            if (customerApplyAddRange.getOrgId() != null && BooleanUtil.isTrue((Object)customerApplyAddRange.getDefaultPrincipal())) {
                                if (rangeId != null && BooleanUtil.isTrue(orgIdPrincipalDefaultMap.get(customerApplyAddRange.getOrgId()))) {
                                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_DEFAULT_PRINCIPAL, new Object[]{customerApplyAddRange.getUiOrgIdName()});
                                }
                                if (rangeId != null) {
                                    orgIdPrincipalDefaultMap.put(customerApplyAddRange.getOrgId(), true);
                                }
                            }
                        }
                        if (customerApplyAddRange.getSaleAreaId() != null && CollectionUtils.isEmpty((Collection)(saleAreaApplyRanges = this.saleAreaApplyRangeDao.getApplyRangeByOrgIdAndAreaId(customerApplyAddRange.getSaleAreaId(), customerApplyAddRange.getOrgId())))) {
                            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800103, new Object[]{customerApplyAddRange.getUiOrgIdName(), customerApplyAddRange.getUiSaleAreaName()});
                        }
                    }
                    addRangeIdList.add((String)customerApplyAddRange.getId());
                }
                for (CustomerApplyAddRange addRange : customerApply.customerApplyAddRanges()) {
                    if (addRange.getEntityStatus() != EntityStatus.Insert && addRange.getEntityStatus() != EntityStatus.Update && addRange.getEntityStatus() != EntityStatus.Unchanged) continue;
                    if (addRange.getOrgId() != null && addRange.getSaleAreaId() != null && !BooleanUtil.isTrue(orgIdSaleAreaDefaultMap.get(addRange.getOrgId()))) {
                        throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_NOR_DEFAULT_SALE_AREA, new Object[]{addRange.getUiOrgIdName()});
                    }
                    if (addRange.getOrgId() == null || addRange.getProfessSalesmanId() == null || BooleanUtil.isTrue(orgIdPrincipalDefaultMap.get(addRange.getOrgId()))) continue;
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CUSTOMER_APPLY_RANGE_NOR_DEFAULT_PRINCIPAL, new Object[]{addRange.getUiOrgIdName()});
                }
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800104);
            }
        }
    }
}

