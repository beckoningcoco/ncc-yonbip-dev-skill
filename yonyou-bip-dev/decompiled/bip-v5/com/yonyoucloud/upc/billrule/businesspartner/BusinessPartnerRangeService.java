/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantISubQryDao
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantApplyRangePO
 *  com.yonyou.iuap.basedoc.mc.service.GroupService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.base.businesspartner.BusinessPartner
 *  com.yonyoucloud.upc.pc.org.PubOrgGroup
 *  com.yonyoucloud.upc.pc.org.PubOrgGroupDetail
 *  com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService
 *  com.yonyoucloud.upc.pub.api.vendor.vo.vendor.VendorOrgVO
 *  com.yonyoucloud.upc.utils.BusinessPartnerUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Propagation
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.businesspartner;

import com.yonyou.iuap.apdoc.coredoc.dao.merchant.MerchantISubQryDao;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.merchant.MerchantApplyRangePO;
import com.yonyou.iuap.basedoc.mc.service.GroupService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.upc.base.businesspartner.BusinessPartner;
import com.yonyoucloud.upc.pc.org.PubOrgGroup;
import com.yonyoucloud.upc.pc.org.PubOrgGroupDetail;
import com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService;
import com.yonyoucloud.upc.pub.api.vendor.vo.vendor.VendorOrgVO;
import com.yonyoucloud.upc.utils.BusinessPartnerUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Service
public class BusinessPartnerRangeService {
    @Autowired
    GroupService groupService;
    @Autowired
    MerchantISubQryDao merchantISubQryDao;
    @Autowired
    private IVendorPubQueryService vendorPubQueryService;
    private final Logger logger = LoggerFactory.getLogger(BusinessPartnerRangeService.class);

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Transactional(propagation=Propagation.REQUIRED)
    public String updateBusinessPartnerOrgGroup(String businessPartnerId) throws Exception {
        String requestId;
        String lockKey = this.buildLockKey(businessPartnerId);
        if (!this.acquireDistributedLockWithRetry(lockKey, requestId = UUID.randomUUID().toString())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800032);
        }
        try {
            String string = this.processBusinessPartnerOrgGroup(businessPartnerId);
            return string;
        }
        finally {
            this.registerTransactionSyncForLockRelease(lockKey, requestId);
        }
    }

    private String processBusinessPartnerOrgGroup(String businessPartnerId) throws Exception {
        Long defaultMerchantId = BusinessPartnerUtils.getDefaultMerchantId((String)businessPartnerId);
        Long defaultVendorId = BusinessPartnerUtils.getDefaultVendorId((String)businessPartnerId);
        if (defaultMerchantId == null && defaultVendorId == null) {
            this.updatePartnerOrgGroupId(businessPartnerId, null);
            return null;
        }
        List<PubOrgGroupDetail> orgDetails = this.collectOrgDetails(defaultMerchantId, defaultVendorId);
        String orgGroupId = this.generateOrgGroupId(orgDetails);
        this.updatePartnerOrgGroupId(businessPartnerId, orgGroupId);
        return orgGroupId;
    }

    private String buildLockKey(String businessPartnerId) {
        return "base_businesspartner_" + AppContext.getYhtTenantId() + "_" + businessPartnerId;
    }

    private boolean acquireDistributedLockWithRetry(String lockKey, String requestId) throws InterruptedException {
        int maxRetries = 60;
        int retryIntervalMs = 200;
        for (int tryCount = 0; tryCount < maxRetries; ++tryCount) {
            if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)10)) {
                return true;
            }
            TimeUnit.MILLISECONDS.sleep(retryIntervalMs);
        }
        return false;
    }

    private List<PubOrgGroupDetail> collectOrgDetails(Long merchantId, Long vendorId) throws Exception {
        HashSet<String> orgIdSet = new HashSet<String>();
        ArrayList<PubOrgGroupDetail> uniqueDetails = new ArrayList<PubOrgGroupDetail>();
        if (merchantId != null) {
            for (PubOrgGroupDetail detail : this.getMerchantOrgDetails(merchantId)) {
                if (!orgIdSet.add(detail.getOrgId())) continue;
                uniqueDetails.add(detail);
            }
        }
        if (vendorId != null) {
            for (PubOrgGroupDetail detail : this.getVendorOrgDetails(vendorId)) {
                if (!orgIdSet.add(detail.getOrgId())) continue;
                uniqueDetails.add(detail);
            }
        }
        return uniqueDetails;
    }

    private void registerTransactionSyncForLockRelease(final String lockKey, final String requestId) {
        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

            public void afterCompletion(int status) {
                RedisTool.releaseLock((String)lockKey, (String)requestId);
            }
        });
    }

    private void updatePartnerOrgGroupId(String businessPartnerId, String orgGroupId) throws Exception {
        BusinessPartner partnerOrg = new BusinessPartner();
        partnerOrg.setId((Object)businessPartnerId);
        partnerOrg.setOrgGroupId(orgGroupId);
        partnerOrg.setEntityStatus(EntityStatus.Update);
        MetaDaoHelper.update((String)"base.businesspartner.BusinessPartner", (BizObject)partnerOrg);
    }

    private List<PubOrgGroupDetail> getVendorOrgDetails(Long vendorId) throws Exception {
        List vendorOrgByVendorId = this.vendorPubQueryService.getVendorOrgByVendorId(vendorId);
        ArrayList<PubOrgGroupDetail> pubOrgGroupDetails = new ArrayList<PubOrgGroupDetail>();
        for (VendorOrgVO vendorOrgVO : vendorOrgByVendorId) {
            PubOrgGroupDetail detail = new PubOrgGroupDetail();
            detail.setOrgId(vendorOrgVO.getOrg());
            detail.setOrgGroupType("0");
            pubOrgGroupDetails.add(detail);
        }
        return pubOrgGroupDetails;
    }

    private List<PubOrgGroupDetail> getMerchantOrgDetails(Long merchantId) throws Exception {
        List ranges = this.merchantISubQryDao.queryApplyRangeByMerchantIdAndOrgId(merchantId, null);
        return this.generateMerchantOrgGroupDetailListForPO(ranges);
    }

    private List<PubOrgGroupDetail> generateMerchantOrgGroupDetailListForPO(List<MerchantApplyRangePO> merchantApplyRangePOS) {
        ArrayList<PubOrgGroupDetail> pubOrgGroupDetailList = new ArrayList<PubOrgGroupDetail>();
        if (merchantApplyRangePOS != null && !merchantApplyRangePOS.isEmpty()) {
            for (MerchantApplyRangePO merchantApplyRange : merchantApplyRangePOS) {
                PubOrgGroupDetail pubOrgGroupDetail = this.generateMerchantOrgGroupDetail(merchantApplyRange.getOrgId(), merchantApplyRange.getRangeType() != null ? merchantApplyRange.getRangeType().toString() : null);
                pubOrgGroupDetailList.add(pubOrgGroupDetail);
            }
        }
        return pubOrgGroupDetailList;
    }

    private PubOrgGroupDetail generateMerchantOrgGroupDetail(String orgId, String rangeType) {
        PubOrgGroupDetail pubOrgGroupDetail = new PubOrgGroupDetail();
        pubOrgGroupDetail.setOrgId(orgId);
        pubOrgGroupDetail.setOrgType(rangeType);
        pubOrgGroupDetail.setOrgGroupType("0");
        return pubOrgGroupDetail;
    }

    private String generateOrgGroupId(List<PubOrgGroupDetail> pubOrgGroupDetailList) {
        if (CollectionUtils.isEmpty(pubOrgGroupDetailList)) {
            return null;
        }
        PubOrgGroup pubOrgGroup = new PubOrgGroup();
        pubOrgGroup.setOrgGroupType("0");
        pubOrgGroup.setOrgGroupDetailList(pubOrgGroupDetailList);
        return this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
    }

    @Transactional(propagation=Propagation.REQUIRED)
    public void updateBusinessPartnerOrgGroupBatch(List<String> businessPartnerIds) throws Exception {
        Map defaultIdsMap = BusinessPartnerUtils.getDefaultMerchantAndVendorIds(businessPartnerIds);
        HashSet merchantIds = new HashSet();
        HashSet vendorIds = new HashSet();
        defaultIdsMap.forEach((partnerId, ids) -> {
            if (ids[0] != null) {
                merchantIds.add(ids[0]);
            }
            if (ids[1] != null) {
                vendorIds.add(ids[1]);
            }
        });
        Map<String, Set<String>> partnerOrgIdsMap = this.precomputePartnerOrgIds(businessPartnerIds, defaultIdsMap, this.batchGetMerchantOrgIds(new ArrayList<Long>(merchantIds)), this.batchGetVendorOrgIds(new ArrayList<Long>(vendorIds)));
        this.batchUpdatePartnersWithOrgGroups(businessPartnerIds, partnerOrgIdsMap);
    }

    private Map<String, Set<String>> precomputePartnerOrgIds(List<String> businessPartnerIds, Map<String, Long[]> defaultIdsMap, Map<Long, Set<String>> merchantOrgIdsMap, Map<Long, Set<String>> vendorOrgIdsMap) {
        HashMap<String, Set<String>> partnerOrgIdsMap = new HashMap<String, Set<String>>();
        for (String businessPartnerId : businessPartnerIds) {
            Long[] ids = defaultIdsMap.get(businessPartnerId);
            Long merchantId = ids[0];
            Long vendorId = ids[1];
            HashSet orgIds = new HashSet();
            if (merchantId != null && merchantOrgIdsMap.containsKey(merchantId)) {
                orgIds.addAll(merchantOrgIdsMap.get(merchantId));
            }
            if (vendorId != null && vendorOrgIdsMap.containsKey(vendorId)) {
                orgIds.addAll(vendorOrgIdsMap.get(vendorId));
            }
            partnerOrgIdsMap.put(businessPartnerId, orgIds);
        }
        return partnerOrgIdsMap;
    }

    private void batchUpdatePartnersWithOrgGroups(List<String> businessPartnerIds, Map<String, Set<String>> partnerOrgIdsMap) throws Exception {
        ArrayList<BusinessPartner> partnersToUpdate = new ArrayList<BusinessPartner>();
        for (String businessPartnerId : businessPartnerIds) {
            Set<String> orgIds = partnerOrgIdsMap.get(businessPartnerId);
            String orgGroupId = this.generateOrgGroupIdByOrgIds(orgIds);
            BusinessPartner partner = new BusinessPartner();
            partner.setId((Object)businessPartnerId);
            partner.setOrgGroupId(orgGroupId);
            partner.setEntityStatus(EntityStatus.Update);
            partnersToUpdate.add(partner);
        }
        if (!partnersToUpdate.isEmpty()) {
            MetaDaoHelper.update((String)"base.businesspartner.BusinessPartner", partnersToUpdate);
        }
    }

    private String generateOrgGroupIdByOrgIds(Set<String> orgIds) {
        if (CollectionUtils.isEmpty(orgIds)) {
            return null;
        }
        PubOrgGroup pubOrgGroup = new PubOrgGroup();
        pubOrgGroup.setOrgGroupType("0");
        List details = orgIds.stream().map(orgId -> {
            PubOrgGroupDetail detail = new PubOrgGroupDetail();
            detail.setOrgId(orgId);
            detail.setOrgGroupType("1");
            return detail;
        }).collect(Collectors.toList());
        pubOrgGroup.setOrgGroupDetailList(details);
        return this.groupService.saveGroup((Map)pubOrgGroup, "pc.pub_org_group.PubOrgGroup");
    }

    private Map<Long, Set<String>> batchGetMerchantOrgIds(List<Long> merchantIds) throws Exception {
        HashMap<Long, Set<String>> result = new HashMap<Long, Set<String>>();
        if (CollectionUtils.isEmpty(merchantIds)) {
            return result;
        }
        try {
            List ranges = this.merchantISubQryDao.batchQueryApplyRangeByMerchantIdsAndOrgId(merchantIds, null);
            if (CollectionUtils.isEmpty((Collection)ranges)) {
                this.logger.error("\u83b7\u53d6\u5ba2\u6237\u9002\u7528\u8303\u56f4\u4e3a\u7a7a\uff0c\u5546\u6237IDs: {}", merchantIds);
                return result;
            }
            ranges.stream().filter(range -> range.getMerchantId() != null && range.getOrgId() != null).collect(Collectors.groupingBy(MerchantApplyRangePO::getMerchantId, Collectors.mapping(MerchantApplyRangePO::getOrgId, Collectors.toSet()))).forEach(result::put);
        }
        catch (Exception e) {
            this.logger.error("\u6279\u91cf\u83b7\u53d6\u5546\u6237\u7ec4\u7ec7\u8303\u56f4\u5931\u8d25\uff0c\u5546\u6237IDs: {}", merchantIds, (Object)e);
            throw e;
        }
        return result;
    }

    private Map<Long, Set<String>> batchGetVendorOrgIds(List<Long> vendorIds) throws Exception {
        HashMap<Long, Set<String>> result = new HashMap<Long, Set<String>>();
        if (CollectionUtils.isEmpty(vendorIds)) {
            return result;
        }
        try {
            List vendorOrgs = this.vendorPubQueryService.getVendorOrgByVendorIdList(vendorIds);
            if (CollectionUtils.isEmpty((Collection)vendorOrgs)) {
                return result;
            }
            vendorOrgs.stream().filter(org -> org.getVendororg() != null && org.getOrg() != null).collect(Collectors.groupingBy(VendorOrgVO::getVendororg, Collectors.mapping(VendorOrgVO::getOrg, Collectors.toSet()))).forEach(result::put);
        }
        catch (Exception e) {
            this.logger.error("\u6279\u91cf\u83b7\u53d6\u4f9b\u5e94\u5546\u7ec4\u7ec7\u8303\u56f4\u5931\u8d25\uff0c\u4f9b\u5e94\u5546IDs: {}", vendorIds, (Object)e);
            throw e;
        }
        return result;
    }
}

