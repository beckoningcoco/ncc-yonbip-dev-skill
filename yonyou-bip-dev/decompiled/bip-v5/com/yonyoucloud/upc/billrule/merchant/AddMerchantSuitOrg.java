/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.model.LoginUser
 *  com.yonyou.ucf.mdd.ext.util.OptionUtils
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.common.enums.AddMerchantRangeSourceEnum
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.billrule.merchant;

import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.model.LoginUser;
import com.yonyou.ucf.mdd.ext.util.OptionUtils;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.common.enums.AddMerchantRangeSourceEnum;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.addrange.KafkaMerchantAddRangeService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Component(value="addMerchantSuitOrg")
public class AddMerchantSuitOrg
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(AddMerchantSuitOrg.class);
    @Autowired
    private IUPCMerchantQueryService upcMerchantQueryService;
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private KafkaMerchantAddRangeService kafkaMerchantAddRangeService;
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> paramMap) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(paramMap);
        if (null == billContext || billDataDto == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800137);
        }
        List bills = this.getBills(billContext, paramMap);
        LoginUser user = AppContext.getCurrentUser();
        switch (user.getUserType()) {
            case TenantAdmin: 
            case TenantEmployee: {
                break;
            }
            case JoinUser: 
            case TenantShopuser: 
            case ShopAdminUser: 
            case ShopUser: {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800364, new Object[]{user.getName()});
            }
        }
        RuleExecuteResult result = new RuleExecuteResult();
        final String applyRangeLockKey = "APPLY_RANGE_MERCHANT" + AppContext.getTenantId();
        final String lockValue = UUID.randomUUID().toString();
        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

            public void afterCompletion(int status) {
                RedisTool.releaseLock((String)applyRangeLockKey, (String)lockValue);
            }
        });
        for (BizObject bill : bills) {
            if (RedisTool.tryGetLock((String)applyRangeLockKey, (String)lockValue, (int)600)) {
                Object orgid2;
                HashSet<CustomerArea> customerAreaSet = new HashSet<CustomerArea>();
                HashSet<Principal> principalSet = new HashSet<Principal>();
                HashSet<InvoicingCustomers> invoicingCustomersSet = new HashSet<InvoicingCustomers>();
                Object isCustomerAreaIssueOrg = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"isCustomerAreaIssueOrg");
                Object isPrincipalIssueOrg = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"isPrincipalIssueOrg");
                String defaultOpen = "1";
                if (!bill.containsKey((Object)"orgIds") || bill.get("orgIds") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800138);
                }
                if (!bill.containsKey((Object)"merchantId") || bill.get("merchantId") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800365);
                }
                if (!bill.containsKey((Object)"merchantApplyRangeId") || bill.get("merchantApplyRangeId") == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800366);
                }
                if (bill.get("merchant_name") == null) {
                    QueryConditionGroup queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("merchantId"))});
                    QuerySchema queryMerchantNameSchema = QuerySchema.create().addSelect("name").addCondition((ConditionExpression)queryMerchantNameCondition);
                    List merchantList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)queryMerchantNameSchema);
                    if (merchantList != null && !merchantList.isEmpty()) {
                        bill.put("merchant_name", ((Map)merchantList.get(0)).get("name"));
                    }
                }
                List orgIds = (List)bill.get("orgIds");
                Long merchantId = Long.valueOf((String)bill.get("merchantId"));
                List merchantApplyRangeDetail = null;
                if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    QueryConditionGroup queryCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq(bill.get("merchantApplyRangeId")), QueryCondition.name((String)"id").eq(bill.get("merchantId"))});
                    QuerySchema querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)queryCondition);
                    merchantApplyRangeDetail = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema);
                }
                log.info("addMerchantSuitOrg: orgId = {}, merchantIds = {}", (Object)orgIds, (Object)merchantId);
                QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(bill.get("merchantApplyRangeId")), QueryCondition.name((String)"isPotential").eq((Object)false)});
                QuerySchema schema = QuerySchema.create().addSelect("id,isCreator,isApplied,orgId,merchantDetailId,merchantDetailId.stopstatus as stopstatus").addCondition((ConditionExpression)queryConditionGroup);
                List creatorMerchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema, null);
                if (CollectionUtils.isEmpty((Collection)creatorMerchantApplyRangeList)) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800367, new Object[]{bill.get("merchant_name").toString()});
                }
                MerchantApplyRange creatorMerchantApplyRange = (MerchantApplyRange)creatorMerchantApplyRangeList.get(0);
                if (!creatorMerchantApplyRange.getIsCreator().booleanValue()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800368, new Object[]{bill.get("merchant_name").toString()});
                }
                if (!StringUtils.hasText((String)creatorMerchantApplyRange.getOrgId())) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800369, new Object[]{bill.get("merchant_name").toString()});
                }
                String creatorOrgId = creatorMerchantApplyRange.getOrgId();
                List creatorOrg = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)creatorOrgId)})), (String)"ucf-org-center");
                if (!this.upcControlRuleService.checkVoucherManageShareOrg("aa.merchant.Merchant", creatorOrgId).booleanValue()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800370, new Object[]{bill.get("merchant_name").toString(), ((Map)creatorOrg.get(0)).get("name")});
                }
                List<String> orgRangeShare = this.upcControlRuleService.getOrgRangeShareAllWithoutAutoShare("aa.merchant.Merchant", creatorOrgId);
                if (null == orgRangeShare || orgRangeShare.isEmpty()) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800371, new Object[]{bill.get("merchant_name").toString(), ((Map)creatorOrg.get(0)).get("name")});
                }
                HashSet<String> orgRangeShareSet = new HashSet<String>(orgRangeShare);
                HashSet orgIdSet = new HashSet(orgIds);
                HashSet orgIdInterSet = new HashSet(orgIds);
                orgIdSet.removeAll(orgRangeShareSet);
                orgIdInterSet.retainAll(orgRangeShareSet);
                if (!"CRM".equals(bill.get("srcBill")) && !orgIdSet.isEmpty()) {
                    List notExists = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgIdSet)})), (String)"ucf-org-center");
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800372, new Object[]{bill.get("merchant_name").toString(), ((Map)creatorOrg.get(0)).get("name"), notExists.stream().map(map -> map.get("name").toString()).collect(Collectors.toList())});
                }
                log.info("addMerchantSuitOrgAndDetail1 {}", (Object)bill);
                if (orgIdInterSet.isEmpty()) continue;
                ArrayList<MerchantApplyRange> ranges2Db = new ArrayList<MerchantApplyRange>();
                ArrayList<MerchantApplyRangeDetail> detail2Db = new ArrayList<MerchantApplyRangeDetail>();
                QueryConditionGroup queryConditionGroup1 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in((Collection)orgIds), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
                QuerySchema schema1 = QuerySchema.create().addSelect("orgId, orgId.name as org_Name").addCondition((ConditionExpression)queryConditionGroup1);
                schema1.setPartitionable(false);
                List ranges = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema1);
                if (!CollectionUtils.isEmpty((Collection)ranges)) {
                    List orgsInDb = ranges.stream().map(map -> map.get("orgId").toString()).collect(Collectors.toList());
                    HashSet existsOrgIdSet = new HashSet(orgIds);
                    HashSet orgsInDbSet = new HashSet(orgsInDb);
                    existsOrgIdSet.retainAll(orgsInDbSet);
                    if (!existsOrgIdSet.isEmpty()) {
                        log.info("addMerchantSuitOrg merchantId:{}, exists orgs:{}", (Object)merchantId, (Object)orgsInDb);
                        orgIds.removeAll(orgsInDb);
                        List exists = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(existsOrgIdSet)})), (String)"ucf-org-center");
                        result.setData((Object)MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040803B8", (String)"\u5ba2\u6237[{0}]\u5df2\u5206\u914d\u7ec4\u7ec7{1}"), bill.get("merchant_name"), exists.stream().map(map -> map.get("name").toString()).collect(Collectors.toList())));
                    }
                    if (orgIds.size() > 0) {
                        for (Object orgid2 : orgIds) {
                            this.setRangeAndDetail(ranges2Db, detail2Db, merchantId, (String)orgid2, merchantApplyRangeDetail, creatorMerchantApplyRange.getMerchantDetailId());
                        }
                    }
                } else {
                    for (String orgid3 : orgIds) {
                        this.setRangeAndDetail(ranges2Db, detail2Db, merchantId, orgid3, merchantApplyRangeDetail, creatorMerchantApplyRange.getMerchantDetailId());
                    }
                }
                log.info("addMerchantSuitOrgAndDetail2 {}", detail2Db);
                QuerySchema customerAreaQuerySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(bill.get("merchantId")), QueryCondition.name((String)"merchantApplyRangeId").eq(bill.get("merchantApplyRangeId"))}));
                List customerAreaList = new ArrayList();
                if (defaultOpen.equals(isCustomerAreaIssueOrg)) {
                    customerAreaList = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)customerAreaQuerySchema);
                }
                List principalList = new ArrayList();
                if (defaultOpen.equals(isPrincipalIssueOrg)) {
                    principalList = MetaDaoHelper.query((String)"aa.merchant.Principal", (QuerySchema)customerAreaQuerySchema);
                }
                List invoicingCustomersList = MetaDaoHelper.query((String)"aa.merchant.InvoicingCustomers", (QuerySchema)customerAreaQuerySchema);
                orgid2 = ranges2Db.iterator();
                while (orgid2.hasNext()) {
                    MerchantApplyRange merchantApplyRange = (MerchantApplyRange)orgid2.next();
                    if (!CollectionUtils.isEmpty(customerAreaList)) {
                        for (Map customerArea : customerAreaList) {
                            if (!merchantApplyRange.containsKey((Object)"merchantId") || !customerArea.containsKey("merchantId") || !merchantApplyRange.getMerchantId().equals(customerArea.get("merchantId")) || !customerArea.containsKey("saleAreaId")) continue;
                            CustomerArea newCustomer = new CustomerArea();
                            newCustomer.setId((Object)IdManager.getInstance().nextId());
                            newCustomer.setSaleAreaId(Long.valueOf(Long.parseLong(customerArea.get("saleAreaId").toString())));
                            newCustomer.setmerchantApplyRangeId((Long)merchantApplyRange.getId());
                            newCustomer.setIsDefault(Boolean.valueOf(customerArea.get("isDefault").toString()));
                            newCustomer.setMerchantId(merchantApplyRange.getMerchantId());
                            newCustomer.setTenant((Long)AppContext.getCurrentUser().getTenant());
                            newCustomer.setEntityStatus(EntityStatus.Insert);
                            customerAreaSet.add(newCustomer);
                        }
                    }
                    if (!CollectionUtils.isEmpty(principalList)) {
                        for (Map principal : principalList) {
                            if (!merchantApplyRange.containsKey((Object)"merchantId") || !principal.containsKey("merchantId") || !merchantApplyRange.getMerchantId().equals(principal.get("merchantId")) || !principal.containsKey("specialManagementDep") && !principal.containsKey("professSalesman")) continue;
                            Principal newPrincipal = new Principal();
                            newPrincipal.setId((Object)IdManager.getInstance().nextId());
                            if (principal.containsKey("specialManagementDep")) {
                                newPrincipal.setSpecialManagementDep(principal.get("specialManagementDep").toString());
                            }
                            if (principal.containsKey("professSalesman")) {
                                newPrincipal.setProfessSalesman(principal.get("professSalesman").toString());
                            }
                            newPrincipal.setIsDefault(Boolean.valueOf(principal.get("isDefault").toString()));
                            newPrincipal.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
                            newPrincipal.setMerchantId(merchantApplyRange.getMerchantId());
                            newPrincipal.setTenant((Long)AppContext.getCurrentUser().getTenant());
                            newPrincipal.setEntityStatus(EntityStatus.Insert);
                            principalSet.add(newPrincipal);
                        }
                    }
                    if (CollectionUtils.isEmpty((Collection)invoicingCustomersList)) continue;
                    for (Map invoicingCustomers : invoicingCustomersList) {
                        if (!merchantApplyRange.containsKey((Object)"merchantId") || !invoicingCustomers.containsKey("merchantId") || !merchantApplyRange.getMerchantId().equals(invoicingCustomers.get("merchantId")) || !invoicingCustomers.containsKey("invoicingCustomersId")) continue;
                        InvoicingCustomers newInvoicingCustomers = new InvoicingCustomers();
                        newInvoicingCustomers.setId((Object)IdManager.getInstance().nextId());
                        newInvoicingCustomers.setInvoicingCustomersId(Long.valueOf(Long.parseLong(invoicingCustomers.get("invoicingCustomersId").toString())));
                        newInvoicingCustomers.setIsDefault(Boolean.valueOf(invoicingCustomers.get("isDefault").toString()));
                        newInvoicingCustomers.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
                        newInvoicingCustomers.setMerchantId(merchantApplyRange.getMerchantId());
                        newInvoicingCustomers.setTenant((Long)AppContext.getCurrentUser().getTenant());
                        newInvoicingCustomers.setEntityStatus(EntityStatus.Insert);
                        invoicingCustomersSet.add(newInvoicingCustomers);
                    }
                }
                if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    this.setMerchantMaintenanceUpdate(detail2Db, new ArrayList<CustomerArea>(customerAreaSet), new ArrayList<Principal>(principalSet));
                }
                if (!ranges2Db.isEmpty()) {
                    this.merchantService.setMerchantApplyRangeOrgFunc(ranges2Db);
                    MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRange", ranges2Db);
                    if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                        MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRangeDetail", detail2Db);
                    }
                    ArrayList eventData = new ArrayList();
                    for (MerchantApplyRange tempRangeData : ranges2Db) {
                        HashMap<String, Object> rangMap = new HashMap<String, Object>();
                        rangMap.put("merchantApplyRangeId", tempRangeData.getId());
                        rangMap.put("orgId", tempRangeData.getOrgId());
                        rangMap.put("rangeType", tempRangeData.getRangeType());
                        rangMap.put("stopstatus", creatorMerchantApplyRange.get("stopstatus"));
                        eventData.add(rangMap);
                    }
                    bill.set("merchantApplyRanges", eventData);
                    this.kafkaMerchantAddRangeService.addRangeUpdateMerchantAudit(ranges2Db);
                }
                if (!CollectionUtils.isEmpty(customerAreaSet)) {
                    MetaDaoHelper.insert((String)"aa.merchant.CustomerArea", new ArrayList(customerAreaSet));
                }
                if (!CollectionUtils.isEmpty(principalSet)) {
                    MetaDaoHelper.insert((String)"aa.merchant.Principal", new ArrayList(principalSet));
                }
                if (CollectionUtils.isEmpty(invoicingCustomersSet)) continue;
                MetaDaoHelper.insert((String)"aa.merchant.InvoicingCustomers", new ArrayList(invoicingCustomersSet));
                continue;
            }
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.APPLY_RANGE_PARALLEL_DEAL_ERROR);
        }
        return result;
    }

    private void setMerchantMaintenanceUpdate(List<MerchantApplyRangeDetail> merchantApplyRangeDetailList, List<CustomerArea> customerAreaList, List<Principal> principalList) {
        if (!CollectionUtils.isEmpty(merchantApplyRangeDetailList)) {
            for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                if (!CollectionUtils.isEmpty(customerAreaList)) {
                    for (CustomerArea customerArea : customerAreaList) {
                        if (!merchantApplyRangeDetail.getMerchantApplyRangeId().equals(customerArea.getmerchantApplyRangeId()) || !customerArea.getIsDefault().booleanValue()) continue;
                        merchantApplyRangeDetail.setCustomerArea(customerArea.getSaleAreaId());
                    }
                }
                if (CollectionUtils.isEmpty(principalList)) continue;
                for (Principal principal : principalList) {
                    if (!merchantApplyRangeDetail.getMerchantApplyRangeId().equals(principal.getMerchantApplyRangeId()) || !principal.getIsDefault().booleanValue()) continue;
                    merchantApplyRangeDetail.setSpecialManagementDep(principal.getSpecialManagementDep());
                    merchantApplyRangeDetail.setProfessSalesman(principal.getProfessSalesman());
                }
            }
        }
    }

    private void setRangeAndDetail(List<MerchantApplyRange> ranges2Db, List<MerchantApplyRangeDetail> detail2Db, Long merchantId, String orgid, List<Map<String, Object>> merchantApplyRangeDetail, String merchantdetailId) {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("billNo", "aa_merchant");
        MerchantApplyRange range = MerchantUtils.getMerchantApplyRange((Long)merchantId, (Integer)1, (String)orgid);
        range.setAllocatorName(AppContext.getCurrentUser().getName());
        range.setAllocatorId((Long)AppContext.getCurrentUser().getId());
        range.setAllocateSource(AddMerchantRangeSourceEnum.UDH_SUIT_ORG.getName());
        range.setAllocateTime(new Date());
        range.setMerchantDetailId(merchantdetailId);
        ranges2Db.add(range);
        if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
            MerchantApplyRangeDetail newmerchantApplyRangeDetail = new MerchantApplyRangeDetail();
            MerchantApplyRangeDetail initMerchantApplyRangeDetail = new MerchantApplyRangeDetail();
            initMerchantApplyRangeDetail.init(merchantApplyRangeDetail.get(0));
            this.upcMerchantQueryService.exchangeFromExtend((BizObject)initMerchantApplyRangeDetail, (BizObject)newmerchantApplyRangeDetail, params);
            newmerchantApplyRangeDetail.setEntityStatus(EntityStatus.Insert);
            newmerchantApplyRangeDetail.setMerchantApplyRangeId((Long)range.getId());
            newmerchantApplyRangeDetail.remove("merchantApplyRangeExtId");
            newmerchantApplyRangeDetail.setCreator(AppContext.getCurrentUser().getName());
            newmerchantApplyRangeDetail.setCreatorId((Long)AppContext.getCurrentUser().getId());
            newmerchantApplyRangeDetail.setCreateDate(new Date());
            newmerchantApplyRangeDetail.setCreateTime(new Date());
            newmerchantApplyRangeDetail.setModifier(AppContext.getCurrentUser().getName());
            newmerchantApplyRangeDetail.setModifierId((Long)AppContext.getCurrentUser().getId());
            newmerchantApplyRangeDetail.setModifyDate(new Date());
            newmerchantApplyRangeDetail.setModifyTime(new Date());
            detail2Db.add(newmerchantApplyRangeDetail);
        }
    }

    private void setMerchantApplyRangeDetailFromUdh(List<MerchantApplyRangeDetail> merchantApplyRangeDetailList, String isTradeCustomers, Boolean stopStatus) {
        if (!CollectionUtils.isEmpty(merchantApplyRangeDetailList)) {
            for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                merchantApplyRangeDetail.setIsTradeCustomers(isTradeCustomers);
                if (stopStatus == null) continue;
                if (stopStatus.booleanValue()) {
                    merchantApplyRangeDetail.setStoptime(null);
                }
                merchantApplyRangeDetail.setStopstatus(stopStatus);
            }
        }
    }
}

