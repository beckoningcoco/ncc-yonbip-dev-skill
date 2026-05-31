/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.util.OptionUtils
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.InvoicingCustomers
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.util.OptionUtils;
import com.yonyoucloud.iuap.upc.api.service.IMCUpdateEventHandler;
import com.yonyoucloud.iuap.upc.api.service.IUPCControlRuleService;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.InvoicingCustomers;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.addrange.KafkaMerchantAddRangeService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

@Component(value="pc.mcUpdateEventHandlerCustomer")
public class MCUpdateEventHandlerMerchant
implements IMCUpdateEventHandler {
    @Autowired
    private IUPCControlRuleService upcControlRuleService;
    @Autowired
    private IUPCMerchantQueryService upcMerchantQueryService;
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private KafkaMerchantAddRangeService kafkaMerchantAddRangeService;
    @Autowired
    private YMSParamConfig ymsParamConfig;

    @Override
    public void Handle(List<String> merchantOrgIds) throws Exception {
        if (!CollectionUtils.isEmpty(merchantOrgIds)) {
            for (String orgId : merchantOrgIds) {
                List<String> merchantIds;
                List<String> subOrgs = this.upcControlRuleService.getSubOrgs(orgId);
                if (subOrgs.isEmpty() || (merchantIds = this.getSelfCreateVoucherMerchantByMinId(orgId)) == null || merchantIds.isEmpty()) continue;
                List merchantIdsList = ListSplitUtil.splitListByCapacity(merchantIds, (int)50);
                List subOrgsList = ListSplitUtil.splitListByCapacity(subOrgs, (int)50);
                for (List merchantIdList : merchantIdsList) {
                    for (List subOrgList : subOrgsList) {
                        this.kafkaMerchantAddRangeService.sendMcMerchantSuitOrg(merchantIdList, subOrgList);
                    }
                }
            }
        }
    }

    @Override
    public void HandleShareRange(Map shareRangeData) throws Exception {
        for (Object key : shareRangeData.keySet()) {
            List<String> merchantIds;
            List beSharedOrgIds = (List)shareRangeData.get(key);
            if (CollectionUtils.isEmpty((Collection)beSharedOrgIds) || (merchantIds = this.getSelfCreateVoucherMerchantByMinId(key.toString())) == null || merchantIds.isEmpty()) continue;
            List merchantIdsList = ListSplitUtil.splitListByCapacity(merchantIds, (int)50);
            for (List merchantIdList : merchantIdsList) {
                this.kafkaMerchantAddRangeService.sendMcMerchantSuitOrg(merchantIdList, beSharedOrgIds);
            }
        }
    }

    private void setHandle(List<String> merchantIds, List<String> subOrgs) throws Exception {
        HashSet<MerchantApplyRange> ranges = new HashSet<MerchantApplyRange>();
        HashSet<MerchantApplyRangeDetail> resutlDetails = new HashSet<MerchantApplyRangeDetail>();
        HashSet<CustomerArea> customerAreaSet = new HashSet<CustomerArea>();
        HashSet<Principal> principalSet = new HashSet<Principal>();
        HashSet<InvoicingCustomers> invoicingCustomersSet = new HashSet<InvoicingCustomers>();
        ArrayList<String> merchantApplyRangeIdList = new ArrayList<String>();
        Object isCustomerAreaIssueOrg = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"isCustomerAreaIssueOrg");
        Object isPrincipalIssueOrg = OptionUtils.getSystemOption((Object)AppContext.getTenantId(), (String)"isPrincipalIssueOrg");
        String defaultOpen = "1";
        String url = "/agent/infrastructure/upc/syn/agentrelation";
        List<Map> rangesInDb = this.getSelfCreateVoucherRangeByMinId(merchantIds);
        HashMap<String, Integer> merchantRangesMap = new HashMap<String, Integer>();
        for (Map range : rangesInDb) {
            if (range.get("merchantId") == null || range.get("orgId") == null) continue;
            merchantRangesMap.put(range.get("merchantId").toString() + range.get("orgId").toString(), 1);
        }
        QuerySchema querySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").in(merchantIds), QueryCondition.name((String)"isCreator").eq((Object)1)}));
        QuerySchema detailSchema = QuerySchema.create().fullname("aa.merchant.MerchantApplyRangeDetail").name("merchantAppliedDetail").addSelect("*");
        querySchema.addCompositionSchema(detailSchema);
        List rangesList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
        if (!CollectionUtils.isEmpty((Collection)rangesList)) {
            HashMap merchantApplyRangeDetailMap = new HashMap();
            HashMap<String, String> params = new HashMap<String, String>();
            params.put("billNo", "aa_merchant");
            for (Map map : rangesList) {
                merchantApplyRangeDetailMap.put(map.get("merchantId").toString(), map.get("merchantAppliedDetail"));
                if (!map.containsKey("id")) continue;
                merchantApplyRangeIdList.add(map.get("id").toString());
            }
            for (String merchantId : merchantIds) {
                if (!merchantApplyRangeDetailMap.containsKey(merchantId)) continue;
                for (String subOrgId : subOrgs) {
                    if (merchantRangesMap.containsKey(merchantId + subOrgId)) continue;
                    MerchantApplyRange merchantApplyRange = MerchantUtils.getMerchantApplyRange((Long)Long.valueOf(merchantId), (Integer)1, (String)subOrgId);
                    ranges.add(merchantApplyRange);
                }
            }
            if (!CollectionUtils.isEmpty(ranges)) {
                for (MerchantApplyRange merchantApplyRange : ranges) {
                    MerchantApplyRangeDetail newmerchantApplyRangeDetail = new MerchantApplyRangeDetail();
                    MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                    merchantApplyRangeDetail.init((Map)merchantApplyRangeDetailMap.get(merchantApplyRange.getMerchantId().toString()));
                    this.upcMerchantQueryService.exchangeFromExtend((BizObject)merchantApplyRangeDetail, (BizObject)newmerchantApplyRangeDetail, params);
                    newmerchantApplyRangeDetail.setEntityStatus(EntityStatus.Insert);
                    if (newmerchantApplyRangeDetail.get("id") == null) {
                        newmerchantApplyRangeDetail.set("id", (Object)merchantApplyRange.getMerchantId());
                    }
                    newmerchantApplyRangeDetail.setMerchantApplyRangeId((Long)merchantApplyRange.getId());
                    newmerchantApplyRangeDetail.remove("merchantApplyRangeExtId");
                    resutlDetails.add(newmerchantApplyRangeDetail);
                }
            }
        }
        if (!CollectionUtils.isEmpty(merchantApplyRangeIdList)) {
            QuerySchema customerAreaQuerySchema = QuerySchema.create().addSelect("*").addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantApplyRangeId").in(merchantApplyRangeIdList)}));
            List customerAreaList = new ArrayList();
            if (defaultOpen.equals(isCustomerAreaIssueOrg)) {
                customerAreaList = MetaDaoHelper.query((String)"aa.merchant.CustomerArea", (QuerySchema)customerAreaQuerySchema);
            }
            List principalList = new ArrayList();
            if (defaultOpen.equals(isPrincipalIssueOrg)) {
                principalList = MetaDaoHelper.query((String)"aa.merchant.Principal", (QuerySchema)customerAreaQuerySchema);
            }
            List invoicingCustomersList = MetaDaoHelper.query((String)"aa.merchant.InvoicingCustomers", (QuerySchema)customerAreaQuerySchema);
            for (MerchantApplyRange merchantApplyRange : ranges) {
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
                        if (principal.containsKey("specialManagementDep")) {
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
        }
        if (!CollectionUtils.isEmpty(ranges)) {
            this.merchantService.setMerchantApplyRangeOrgFunc(new ArrayList<MerchantApplyRange>(ranges));
            this.merchantService.setMerchantMaintenanceUpdate(new ArrayList<MerchantApplyRangeDetail>(resutlDetails), new ArrayList<CustomerArea>(customerAreaSet), new ArrayList<Principal>(principalSet));
        }
        if (!ranges.isEmpty() && !resutlDetails.isEmpty()) {
            MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRange", new ArrayList(ranges));
            MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRangeDetail", new ArrayList(resutlDetails));
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
    }

    public List<Map> getSelfCreateVoucherRangeByMinId(List<String> merchantIds, Long minId, int realMaxRowsValue) {
        try {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id as merchantApplyRangeId, merchantId, orgId");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").gt((Object)minId), QueryCondition.name((String)"merchantId").in(merchantIds), QueryCondition.name((String)"tenant").eq(AppContext.getCurrentUser().getTenant())}));
            querySchema.addOrderBy("id");
            querySchema.setPartitionable(false);
            QueryPager queryPager = new QueryPager();
            queryPager.setPageIndex(1);
            queryPager.setPageSize(realMaxRowsValue);
            querySchema.pager(queryPager);
            List rangesInDbList = MetaDaoHelper.query((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
            return rangesInDbList;
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801336);
        }
    }

    public List<Map> getSelfCreateVoucherRangeByMinId(List<String> merchantIds) throws Exception {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        ArrayList<Map> rangesInDb = new ArrayList<Map>();
        List<Map> rangesInDbList = this.getSelfCreateVoucherRangeByMinId(merchantIds, currentRangeId, realMaxRowsValue);
        rangesInDb.addAll(rangesInDbList);
        while (rangesInDbList.size() >= realMaxRowsValue) {
            Map rangeNewMinIdMap = rangesInDbList.get(rangesInDbList.size() - 1);
            currentRangeId = Long.parseLong(rangeNewMinIdMap.get("merchantApplyRangeId").toString());
            rangesInDbList = this.getSelfCreateVoucherRangeByMinId(merchantIds, currentRangeId, realMaxRowsValue);
            rangesInDb.addAll(rangesInDbList);
        }
        return rangesInDb;
    }

    public List<String> getSelfCreateVoucherMerchantByMinId(String createOrg, Long minId, int realMaxRowsValue) {
        try {
            List<String> idList = new ArrayList<String>();
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"createOrg").eq((Object)createOrg), QueryCondition.name((String)"id").gt((Object)minId)}));
            querySchema.addOrderBy("id");
            QueryPager queryPager = new QueryPager();
            queryPager.setPageIndex(1);
            queryPager.setPageSize(realMaxRowsValue);
            querySchema.pager(queryPager);
            List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)merchantList)) {
                idList = merchantList.stream().map(map -> map.getId().toString()).collect(Collectors.toList());
            }
            return idList;
        }
        catch (Exception e) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801336);
        }
    }

    public List<String> getSelfCreateVoucherMerchantByMinId(String createOrg) throws Exception {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        ArrayList<String> merchantIds = new ArrayList<String>();
        List<String> merchantIdList = this.getSelfCreateVoucherMerchantByMinId(createOrg, currentRangeId, realMaxRowsValue);
        merchantIds.addAll(merchantIdList);
        while (merchantIdList.size() >= realMaxRowsValue) {
            String rangeNewMinIdMap = merchantIdList.get(merchantIdList.size() - 1);
            currentRangeId = Long.parseLong(rangeNewMinIdMap);
            merchantIdList = this.getSelfCreateVoucherMerchantByMinId(createOrg, currentRangeId, realMaxRowsValue);
            merchantIds.addAll(merchantIdList);
        }
        return merchantIds;
    }
}

