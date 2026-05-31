/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSONObject
 *  com.alibaba.fastjson.serializer.SerializerFeature
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.util.OptionUtils
 *  com.yonyoucloud.iuap.upc.dto.ResultMessageDTO
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantDetail
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
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.util.OptionUtils;
import com.yonyoucloud.iuap.upc.dto.ResultMessageDTO;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantDetail;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.common.enums.AddMerchantRangeSourceEnum;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.event.EventService2;
import com.yonyoucloud.upc.event.EventType;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.addrange.KafkaMerchantAddRangeService;
import com.yonyoucloud.upc.service.api.MerchantSaveServiceImpl;
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
import java.util.Objects;
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
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service(value="addMerchantSuitBizService")
public class AddMerchantSuitBizService {
    Logger logger = LoggerFactory.getLogger(MerchantSaveServiceImpl.class);
    @Autowired
    private IUPCMerchantQueryService upcMerchantQueryService;
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private EventService2 eventService2;
    @Autowired
    private KafkaMerchantAddRangeService kafkaMerchantAddRangeService;
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public ResultMessageDTO saveMerchantAllocateShop(List<String> orgIds, Long merchantId, Long merchantApplyRangeId, Integer rangeType, String merchantName, String isTradeCustomers, Boolean stopStatus, List<Map<String, Object>> sourceMerchantApplyRangeDetail) throws Exception {
        ResultMessageDTO resultMessageDTO = new ResultMessageDTO((Number)200, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080798", (String)"\u64cd\u4f5c\u6210\u529f"), null);
        HashSet<CustomerArea> customerAreaSet = new HashSet<CustomerArea>();
        HashSet<Principal> principalSet = new HashSet<Principal>();
        HashSet<InvoicingCustomers> invoicingCustomersSet = new HashSet<InvoicingCustomers>();
        Object isCustomerAreaIssueOrg = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"isCustomerAreaIssueOrg");
        Object isPrincipalIssueOrg = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"isPrincipalIssueOrg");
        String defaultOpen = "1";
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schema = QuerySchema.create().addSelect("id,merchantDetailId").addCondition((ConditionExpression)queryConditionGroup);
        schema.setPartitionable(false);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800367, new Object[]{merchantName});
        }
        MerchantApplyRange merchantApplyRange = (MerchantApplyRange)merchantApplyRangeList.get(0);
        ArrayList<MerchantApplyRange> ranges2Db = new ArrayList<MerchantApplyRange>();
        ArrayList<MerchantApplyRangeDetail> detail2Db = new ArrayList<MerchantApplyRangeDetail>();
        ArrayList<MerchantDetail> merchantDetailList = new ArrayList<MerchantDetail>();
        QueryConditionGroup queryConditionGroup1 = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").in(orgIds), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schema1 = QuerySchema.create().addSelect("orgId, orgId.name as org_Name").addCondition((ConditionExpression)queryConditionGroup1);
        schema1.setPartitionable(false);
        List ranges = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema1);
        if (!CollectionUtils.isEmpty((Collection)ranges)) {
            List orgsInDb = ranges.stream().map(map -> map.get("orgId").toString()).collect(Collectors.toList());
            HashSet<String> orgIdSet = new HashSet<String>(orgIds);
            HashSet orgsInDbSet = new HashSet(orgsInDb);
            orgIdSet.retainAll(orgsInDbSet);
            if (!orgIdSet.isEmpty()) {
                this.logger.info("addMerchantSuitOrg merchantId:{}, exists orgs:{}", (Object)merchantId, (Object)orgsInDb);
                orgIds.removeAll(orgsInDb);
                List exists = MetaDaoHelper.query((String)"bd.adminOrg.BaseOrgVO", (QuerySchema)QuerySchema.create().addSelect(new String[]{"code", "name"}).addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").in(orgIdSet)})), (String)"ucf-org-center");
                resultMessageDTO.setData((Object)MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080797", (String)"\u5ba2\u6237[{0}]\u5df2\u5206\u914d\u7ec4\u7ec7{1}"), merchantName, exists.stream().map(map -> map.get("name").toString()).collect(Collectors.toList())));
            }
            if (orgIds.size() > 0) {
                for (String string : orgIds) {
                    this.setRangeAndDetail(ranges2Db, detail2Db, merchantId, string, sourceMerchantApplyRangeDetail, rangeType);
                }
            }
        } else {
            for (String orgid : orgIds) {
                this.setRangeAndDetail(ranges2Db, detail2Db, merchantId, orgid, sourceMerchantApplyRangeDetail, rangeType);
            }
        }
        QuerySchema customerAreaQuerySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId)}));
        List customerAreaList = new ArrayList();
        if (defaultOpen.equals(isCustomerAreaIssueOrg)) {
            customerAreaList = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)customerAreaQuerySchema);
        }
        List principalList = new ArrayList();
        if (defaultOpen.equals(isPrincipalIssueOrg)) {
            principalList = MetaDaoHelper.query((String)"aa.merchant.Principal", (QuerySchema)customerAreaQuerySchema);
        }
        List invoicingCustomersList = MetaDaoHelper.query((String)"aa.merchant.InvoicingCustomers", (QuerySchema)customerAreaQuerySchema);
        for (MerchantApplyRange newMerchantApplyRange : ranges2Db) {
            List newOriginalDataBaseMerchantDetailList = this.merchantGroupDao.getMerchantDetailById(merchantApplyRange.getMerchantDetailId(), merchantId);
            MerchantDetail userMerchantDetail = this.merchantGroupService.copyMerchantDetail((MerchantDetail)newOriginalDataBaseMerchantDetailList.get(0), newMerchantApplyRange.getOrgId(), merchantId, false);
            userMerchantDetail.setIsTradeCustomers(isTradeCustomers);
            if (stopStatus != null) {
                if (stopStatus.booleanValue()) {
                    userMerchantDetail.setStoptime(null);
                }
                userMerchantDetail.setStopstatus(stopStatus);
            }
            newMerchantApplyRange.setMerchantDetailId((String)userMerchantDetail.getId());
            merchantDetailList.add(userMerchantDetail);
            if (!CollectionUtils.isEmpty(customerAreaList)) {
                for (Map customerArea : customerAreaList) {
                    if (!newMerchantApplyRange.containsKey((Object)"merchantId") || !customerArea.containsKey("merchantId") || !newMerchantApplyRange.getMerchantId().equals(customerArea.get("merchantId")) || !customerArea.containsKey("saleAreaId")) continue;
                    CustomerArea newCustomer = new CustomerArea();
                    newCustomer.setId((Object)IdManager.getInstance().nextId());
                    newCustomer.setSaleAreaId(Long.valueOf(Long.parseLong(customerArea.get("saleAreaId").toString())));
                    newCustomer.setmerchantApplyRangeId((Long)newMerchantApplyRange.getId());
                    newCustomer.setIsDefault(Boolean.valueOf(customerArea.get("isDefault").toString()));
                    newCustomer.setMerchantId(newMerchantApplyRange.getMerchantId());
                    newCustomer.setTenant((Long)AppContext.getCurrentUser().getTenant());
                    newCustomer.setEntityStatus(EntityStatus.Insert);
                    customerAreaSet.add(newCustomer);
                }
            }
            if (!CollectionUtils.isEmpty(principalList)) {
                for (Map principal : principalList) {
                    if (!newMerchantApplyRange.containsKey((Object)"merchantId") || !principal.containsKey("merchantId") || !newMerchantApplyRange.getMerchantId().equals(principal.get("merchantId")) || !principal.containsKey("specialManagementDep") && !principal.containsKey("professSalesman")) continue;
                    Principal newPrincipal = new Principal();
                    newPrincipal.setId((Object)IdManager.getInstance().nextId());
                    if (principal.containsKey("specialManagementDep")) {
                        newPrincipal.setSpecialManagementDep(principal.get("specialManagementDep").toString());
                    }
                    if (principal.containsKey("specialManagementDep")) {
                        newPrincipal.setProfessSalesman(principal.get("professSalesman").toString());
                    }
                    newPrincipal.setIsDefault(Boolean.valueOf(principal.get("isDefault").toString()));
                    newPrincipal.setMerchantApplyRangeId((Long)newMerchantApplyRange.getId());
                    newPrincipal.setMerchantId(newMerchantApplyRange.getMerchantId());
                    newPrincipal.setTenant((Long)AppContext.getCurrentUser().getTenant());
                    newPrincipal.setEntityStatus(EntityStatus.Insert);
                    principalSet.add(newPrincipal);
                }
            }
            if (CollectionUtils.isEmpty((Collection)invoicingCustomersList)) continue;
            for (Map invoicingCustomers : invoicingCustomersList) {
                if (!newMerchantApplyRange.containsKey((Object)"merchantId") || !invoicingCustomers.containsKey("merchantId") || !newMerchantApplyRange.getMerchantId().equals(invoicingCustomers.get("merchantId")) || !invoicingCustomers.containsKey("invoicingCustomersId")) continue;
                InvoicingCustomers newInvoicingCustomers = new InvoicingCustomers();
                newInvoicingCustomers.setId((Object)IdManager.getInstance().nextId());
                newInvoicingCustomers.setInvoicingCustomersId(Long.valueOf(Long.parseLong(invoicingCustomers.get("invoicingCustomersId").toString())));
                newInvoicingCustomers.setIsDefault(Boolean.valueOf(invoicingCustomers.get("isDefault").toString()));
                newInvoicingCustomers.setMerchantApplyRangeId((Long)newMerchantApplyRange.getId());
                newInvoicingCustomers.setMerchantId(newMerchantApplyRange.getMerchantId());
                newInvoicingCustomers.setTenant((Long)AppContext.getCurrentUser().getTenant());
                newInvoicingCustomers.setEntityStatus(EntityStatus.Insert);
                invoicingCustomersSet.add(newInvoicingCustomers);
            }
        }
        if (!ranges2Db.isEmpty()) {
            this.merchantService.setMerchantApplyRangeOrgFunc(ranges2Db);
            MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRange", ranges2Db);
            MetaDaoHelper.insert((String)"aa.merchant.MerchantDetail", merchantDetailList);
            if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                this.setMerchantMaintenanceUpdate(detail2Db, new ArrayList<CustomerArea>(customerAreaSet), new ArrayList<Principal>(principalSet));
                this.setMerchantApplyRangeDetailFromUdh(detail2Db, isTradeCustomers, stopStatus);
                MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRangeDetail", detail2Db);
            }
            ArrayList<Map<String, Object>> arrayList = new ArrayList<Map<String, Object>>();
            for (MerchantApplyRange tempRangeData : ranges2Db) {
                HashMap<String, Object> rangMap = new HashMap<String, Object>();
                rangMap.put("merchantApplyRangeId", tempRangeData.getId());
                rangMap.put("orgId", tempRangeData.getOrgId());
                rangMap.put("rangeType", tempRangeData.getRangeType());
                rangMap.put("stopstatus", sourceMerchantApplyRangeDetail.get(0).get("stopstatus"));
                arrayList.add(rangMap);
            }
            this.sendEvent(merchantId.toString(), arrayList);
            this.sendTransactionRelationSaveNotify(ranges2Db, merchantId);
            this.kafkaMerchantAddRangeService.addRangeUpdateMerchantAudit(ranges2Db);
        }
        if (!CollectionUtils.isEmpty(customerAreaSet)) {
            MetaDaoHelper.insert((String)"aa.merchant.CustomerArea", new ArrayList(customerAreaSet));
        }
        if (!CollectionUtils.isEmpty(principalSet)) {
            MetaDaoHelper.insert((String)"aa.merchant.Principal", new ArrayList(principalSet));
        }
        if (!CollectionUtils.isEmpty(invoicingCustomersSet)) {
            MetaDaoHelper.insert((String)"aa.merchant.InvoicingCustomers", new ArrayList(invoicingCustomersSet));
        }
        return resultMessageDTO;
    }

    public ResultMessageDTO saveMerchantAllocateCommon(Map<String, Object> dataMap, Boolean shop, Integer rangeType, String isTradeCustomers, Boolean stopStatus) throws Exception {
        ResultMessageDTO resultMessageDTO = new ResultMessageDTO((Number)200, InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F628604080798", (String)"\u64cd\u4f5c\u6210\u529f"), null);
        if (!dataMap.containsKey("orgIds") || dataMap.get("orgIds") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800138);
        }
        if (!dataMap.containsKey("merchantId") || dataMap.get("merchantId") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800365);
        }
        if (!dataMap.containsKey("merchantApplyRangeId") || dataMap.get("merchantApplyRangeId") == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800366);
        }
        String merchantName = null;
        if (dataMap.get("merchant_name") == null) {
            QueryConditionGroup queryMerchantNameCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(dataMap.get("merchantId"))});
            QuerySchema queryMerchantNameSchema = QuerySchema.create().addSelect("name").addCondition((ConditionExpression)queryMerchantNameCondition);
            List merchantList = MetaDaoHelper.query((String)"aa.merchant.Merchant", (QuerySchema)queryMerchantNameSchema);
            if (merchantList != null && !merchantList.isEmpty()) {
                merchantName = ((Map)merchantList.get(0)).get("name").toString();
            }
        } else {
            merchantName = dataMap.get("merchant_name").toString();
        }
        List orgIds = (List)dataMap.get("orgIds");
        Long merchantId = Long.valueOf(dataMap.get("merchantId").toString());
        Long merchantApplyRangeId = Long.valueOf(dataMap.get("merchantApplyRangeId").toString());
        List<Map<String, Object>> merchantApplyRangeDetail = new ArrayList<Map<String, Object>>();
        if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
            QueryConditionGroup queryCondition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"id").eq((Object)merchantId)});
            QuerySchema querySchema = QuerySchema.create().addSelect(MerchantUtils.getMerchantApplyRangeDetailQueryField()).addCondition((ConditionExpression)queryCondition);
            merchantApplyRangeDetail = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRangeDetail", (QuerySchema)querySchema);
        }
        if (!CollectionUtils.isEmpty((Collection)orgIds) && orgIds.contains(merchantId + "")) {
            orgIds.remove(merchantId + "");
        }
        if (CollectionUtils.isEmpty((Collection)orgIds)) {
            return resultMessageDTO;
        }
        this.logger.info("saveMerchantAllocateCommon: orgIds = {}, merchantId = {}", (Object)orgIds, (Object)merchantId);
        if (shop.booleanValue()) {
            return this.saveMerchantAllocateShop(orgIds, merchantId, merchantApplyRangeId, rangeType, merchantName, isTradeCustomers, stopStatus, merchantApplyRangeDetail);
        }
        return resultMessageDTO;
    }

    public void sendEvent(String merchantId, List<Map<String, Object>> merchantApplyRanges) throws Exception {
        HashMap<String, Object> businessObject = new HashMap<String, Object>();
        businessObject.put("billnum", "aa_merchantlist");
        businessObject.put("fullname", "aa.merchant.Merchant");
        HashMap<String, Object> archive = new HashMap<String, Object>();
        archive.put("merchantId", merchantId);
        archive.put("merchantApplyRanges", merchantApplyRanges);
        businessObject.put("archive", JSONObject.toJSONString(archive, (SerializerFeature[])new SerializerFeature[]{SerializerFeature.WriteDateUseDateFormat}));
        String eventType = String.valueOf((Object)EventType.find("aa_merchantlist", "addmerchantsuitorg", null));
        try {
            this.eventService2.sendEvent("YXYBASEDOC", eventType, businessObject);
        }
        catch (Exception e) {
            this.logger.error("\u53cb\u4f01\u8054\u53d1\u9001\u5206\u914d\u7ec4\u7ec7\u4e8b\u4ef6\u5931\u8d25\uff1a" + e.getMessage(), (Throwable)e);
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801321);
        }
    }

    public void setRangeAndDetail(List<MerchantApplyRange> ranges2Db, List<MerchantApplyRangeDetail> detail2Db, Long merchantId, String orgId, List<Map<String, Object>> merchantApplyRangeDetail, Integer rangeType) {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("billNo", "aa_merchant");
        MerchantApplyRange range = MerchantUtils.getMerchantApplyRange((Long)merchantId, (Integer)rangeType, (String)orgId);
        range.setAllocatorName(AppContext.getCurrentUser().getName());
        range.setAllocatorId((Long)AppContext.getCurrentUser().getId());
        range.setAllocateSource(AddMerchantRangeSourceEnum.UDH_SUIT_ORG.getName());
        range.setAllocateTime(new Date());
        range.setIsApplied(Boolean.valueOf(true));
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

    public void setMerchantMaintenanceUpdate(List<MerchantApplyRangeDetail> merchantApplyRangeDetailList, List<CustomerArea> customerAreaList, List<Principal> principalList) {
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

    private void sendTransactionRelationSaveNotify(List<MerchantApplyRange> ranges2Db, Long merchantId) throws Exception {
        String createOrg = null;
        QuerySchema schema = QuerySchema.create().addSelect("createOrg").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantId)}));
        Map merchant = MetaDaoHelper.queryOne((String)"aa.merchant.Merchant", (QuerySchema)schema);
        if (merchant != null && !merchant.isEmpty()) {
            createOrg = merchant.get("createOrg").toString();
        }
        try {
            HashMap<String, Object> businessObject = new HashMap<String, Object>();
            businessObject.put("id", merchantId);
            businessObject.put("createOrg", createOrg);
            businessObject.put("merchantApplyRanges", ranges2Db);
            String eventType = Objects.requireNonNull(EventType.find("transaction_relationship", "save", null)).toString();
            this.eventService2.sendEvent("YXYBASEDOC", eventType, businessObject);
        }
        catch (Exception e) {
            this.logger.error("CRM\u9700\u8981\u76d1\u542c\u6e20\u9053\u4ea4\u6613\u5173\u7cfb\u6765\u751f\u6210CRM\u5ba2\u6237\u5173\u7cfb\u53d1\u9001\u4e8b\u4ef6\u5931\u8d25\uff1a" + e.getMessage(), (Throwable)e);
        }
    }
}

