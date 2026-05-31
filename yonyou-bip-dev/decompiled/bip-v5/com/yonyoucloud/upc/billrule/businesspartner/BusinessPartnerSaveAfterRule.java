/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyoucloud.fi.tmsp.openapi.ITmspBizPartnerService
 *  com.yonyoucloud.fi.tmsp.vo.FundBizObjArchInsertReq
 *  com.yonyoucloud.iuap.upc.dto.BusinessPartnerDTO
 *  com.yonyoucloud.upc.base.businesspartner.AutoSyncAction
 *  com.yonyoucloud.upc.base.businesspartner.BusinessPartner
 *  com.yonyoucloud.upc.base.businesspartner.LinkObject
 *  com.yonyoucloud.upc.base.businesspartner.PartnerCapitalComparison
 *  com.yonyoucloud.upc.base.businesspartner.PartnerMerchantComparison
 *  com.yonyoucloud.upc.base.businesspartner.PartnerSyncPlan
 *  com.yonyoucloud.upc.base.businesspartner.PartnerSyncRule
 *  com.yonyoucloud.upc.base.businesspartner.PartnerVendorComparison
 *  com.yonyoucloud.upc.base.businesspartner.SyncMode
 *  com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService
 *  com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubService
 *  com.yonyoucloud.upc.utils.BusinessPartnerUtils
 *  com.yonyoucloud.upc.utils.PartnerConstant
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.context.annotation.Lazy
 *  org.springframework.stereotype.Component
 *  org.springframework.transaction.support.TransactionSynchronization
 *  org.springframework.transaction.support.TransactionSynchronizationManager
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.billrule.businesspartner;

import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.AbstractCommonRule;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyoucloud.fi.tmsp.openapi.ITmspBizPartnerService;
import com.yonyoucloud.fi.tmsp.vo.FundBizObjArchInsertReq;
import com.yonyoucloud.iuap.upc.dto.BusinessPartnerDTO;
import com.yonyoucloud.upc.base.businesspartner.AutoSyncAction;
import com.yonyoucloud.upc.base.businesspartner.BusinessPartner;
import com.yonyoucloud.upc.base.businesspartner.LinkObject;
import com.yonyoucloud.upc.base.businesspartner.PartnerCapitalComparison;
import com.yonyoucloud.upc.base.businesspartner.PartnerMerchantComparison;
import com.yonyoucloud.upc.base.businesspartner.PartnerSyncPlan;
import com.yonyoucloud.upc.base.businesspartner.PartnerSyncRule;
import com.yonyoucloud.upc.base.businesspartner.PartnerVendorComparison;
import com.yonyoucloud.upc.base.businesspartner.SyncMode;
import com.yonyoucloud.upc.billrule.businesspartner.BusinessPartnerComparatorManager;
import com.yonyoucloud.upc.billrule.businesspartner.BusinessPartnerRangeService;
import com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubQueryService;
import com.yonyoucloud.upc.pub.api.vendor.service.vendor.IVendorPubService;
import com.yonyoucloud.upc.service.BusinessPartnerService;
import com.yonyoucloud.upc.service.api.BusinessPartnerServiceImpl;
import com.yonyoucloud.upc.utils.BusinessPartnerUtils;
import com.yonyoucloud.upc.utils.PartnerConstant;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;
import org.springframework.util.CollectionUtils;

@Component(value="businessPartnerSaveAfterRule")
public class BusinessPartnerSaveAfterRule
extends AbstractCommonRule {
    private static final Logger log = LoggerFactory.getLogger(BusinessPartnerSaveAfterRule.class);
    @Autowired
    private BusinessPartnerService partnerService;
    @Autowired
    private IVendorPubService vendorPublicService;
    @Lazy
    @Autowired
    private ITmspBizPartnerService capitalPartnerService;
    @Autowired
    private BusinessPartnerServiceImpl partnerServiceImpl;
    @Autowired
    private BusinessPartnerComparatorManager comparatorManager;
    @Autowired
    private IVendorPubQueryService vendorPubQueryService;
    @Autowired
    private BusinessPartnerRangeService partnerRangeService;

    public RuleExecuteResult execute(BillContext billContext, Map<String, Object> map) throws Exception {
        BillDataDto billDataDto = (BillDataDto)this.getParam(map);
        if (null == billContext || billDataDto == null) {
            return new RuleExecuteResult();
        }
        List partnerList = this.getBills(billContext, map);
        Boolean isImport = billDataDto.getAsyncKey() != null && billDataDto.getImportMode() != null && billDataDto.getImportType() != null;
        final String locale = InvocationInfoProxy.getLocale();
        for (BizObject bill : partnerList) {
            LinkedList<String> partnerIds;
            final BusinessPartner partner = (BusinessPartner)bill;
            if (!partner.containsKey((Object)PartnerConstant.SPECIAL_KEY_FROM_NCC)) {
                BusinessPartnerUtils.transferAndRemove((BusinessPartner)partner, (String)PartnerConstant.PARTNER_MERCHANT_COMPARISONS_TEMP, (String)PartnerConstant.PARTNER_MERCHANT_COMPARISONS);
                BusinessPartnerUtils.transferAndRemove((BusinessPartner)partner, (String)PartnerConstant.PARTNER_VENDOR_COMPARISONS_TEMP, (String)PartnerConstant.PARTNER_VENDOR_COMPARISONS);
                BusinessPartnerUtils.transferAndRemove((BusinessPartner)partner, (String)PartnerConstant.PARTNER_CAPITAL_COMPARISONS_TEMP, (String)PartnerConstant.PARTNER_CAPITAL_COMPARISONS);
                if (partner.containsKey((Object)"specialKeyFromApi")) {
                    this.comparatorManager.dealMerchantComparisonForApi(partner);
                    this.comparatorManager.dealVendorComparisonForApi(partner);
                } else if (isImport.booleanValue()) {
                    this.comparatorManager.dealMerchantComparison(partner);
                    this.comparatorManager.dealVendorComparisonForApi(partner);
                } else {
                    this.comparatorManager.dealMerchantComparison(partner);
                    this.comparatorManager.dealVendorComparison(partner);
                }
                this.comparatorManager.dealCapitalComparison(partner);
            }
            if (partner.partnerMerchantComparisons() != null && !partner.containsKey((Object)"associationRequired")) {
                Iterator params = new HashMap();
                params.put("ytenant_id", AppContext.getCurrentUser().getYTenantId());
                for (PartnerMerchantComparison item : partner.partnerMerchantComparisons()) {
                    params.put("merchantId", item.getMerchantId());
                    if (item.getEntityStatus() != null && item.getEntityStatus() == EntityStatus.Insert) {
                        params.put("businessPartner", item.getPartnerId());
                        SqlHelper.update((String)"com.yonyoucloud.upc.data.businesspartner.updateMerchantBusinessPartner", params);
                        continue;
                    }
                    if (item.getEntityStatus() == null || item.getEntityStatus() != EntityStatus.LOGICDELETE) continue;
                    params.put("businessPartner", null);
                    SqlHelper.update((String)"com.yonyoucloud.upc.data.businesspartner.updateMerchantBusinessPartner", params);
                }
            }
            if (partner.partnerVendorComparisons() != null) {
                for (PartnerVendorComparison item : partner.partnerVendorComparisons()) {
                    if (item.getEntityStatus() != null && item.getEntityStatus() == EntityStatus.Insert) {
                        try {
                            this.vendorPublicService.updateVendorBusinessPartner(item.getVendorId(), item.getPartnerId());
                            continue;
                        }
                        catch (Exception e) {
                            this.vendorPublicService.updateVendorBusinessPartner(item.getVendorId(), null);
                            throw e;
                        }
                    }
                    if (item.getEntityStatus() == null || item.getEntityStatus() != EntityStatus.LOGICDELETE) continue;
                    this.vendorPublicService.updateVendorBusinessPartner(item.getVendorId(), null);
                }
            }
            if (!CollectionUtils.isEmpty((Collection)partner.partnerCapitalComparisons())) {
                for (PartnerCapitalComparison capitalComparison : partner.partnerCapitalComparisons()) {
                    if (capitalComparison.getEntityStatus() == null || capitalComparison.getEntityStatus() != EntityStatus.LOGICDELETE && (capitalComparison.getEntityStatus() != EntityStatus.Insert || partner.get("partnerFrom") == null || !partner.get("partnerFrom").equals("4")) && capitalComparison.getEntityStatus() != EntityStatus.Unchanged) continue;
                    FundBizObjArchInsertReq fundBizObjArchInsertReq = new FundBizObjArchInsertReq();
                    fundBizObjArchInsertReq.setFundBizObjId(capitalComparison.getCapitalId());
                    if (partner.get("partnerFrom") != null && partner.get("partnerFrom").equals("4") || capitalComparison.getEntityStatus() == EntityStatus.Unchanged) {
                        fundBizObjArchInsertReq.setBizPartner((String)partner.getId());
                    }
                    this.capitalPartnerService.deleteFundBizObjArch(fundBizObjArchInsertReq);
                }
            }
            this.partnerRangeService.updateBusinessPartnerOrgGroup(partner.getId().toString());
            this.comparatorManager.updateCorrespondingMerchantAndVendor(partner);
            this.updateSuperiorsBusinessPartnerOnAssoc(partner);
            if (partner.get("partnerFrom") != null && !partner.containsKey((Object)"vendorSyncCascadeMerchant") && !partner.containsKey((Object)"merchantSyncCascadeVendor")) {
                return new RuleExecuteResult();
            }
            if (partner.containsKey((Object)"vendorToPartner") && partner.containsKey((Object)"vendorSyncCascadeMerchant")) {
                partnerIds = new LinkedList<String>(){
                    {
                        this.add((String)partner.getId());
                    }
                };
                final PartnerSyncRule merchantSyncRule = new PartnerSyncRule();
                merchantSyncRule.setSourceObject(LinkObject.BUSINESS_PARTNER);
                merchantSyncRule.setTargetObject(LinkObject.MERCHANT);
                TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                    public void afterCompletion(int status) {
                        if (status == 0) {
                            try {
                                BusinessPartnerSaveAfterRule.this.partnerService.partnerMerchantSync(partnerIds, 0, locale, "", merchantSyncRule, false);
                            }
                            catch (Exception e) {
                                log.error("\u4e1a\u52a1\u4f19\u4f34\u7ea7\u8054\u540c\u6b65\u5ba2\u6237\u63a5\u53e3\u9519\u8bef\uff1a" + e.getMessage(), (Throwable)e);
                            }
                        }
                    }
                });
                return new RuleExecuteResult();
            }
            if (partner.containsKey((Object)"merchantToPartner") && partner.containsKey((Object)"merchantSyncCascadeVendor")) {
                partnerIds = new LinkedList<String>(){
                    {
                        this.add((String)partner.getId());
                    }
                };
                final PartnerSyncRule vendorSyncRule = new PartnerSyncRule();
                vendorSyncRule.setSourceObject(LinkObject.BUSINESS_PARTNER);
                vendorSyncRule.setTargetObject(LinkObject.VENDOR);
                TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                    public void afterCompletion(int status) {
                        if (status == 0) {
                            try {
                                BusinessPartnerSaveAfterRule.this.partnerService.partnerVendorSync(partnerIds, 0, locale, "", vendorSyncRule, false);
                            }
                            catch (Exception e) {
                                log.error("\u4e1a\u52a1\u4f19\u4f34\u7ea7\u8054\u540c\u6b65\u4f9b\u5e94\u5546\u63a5\u53e3\u9519\u8bef\uff1a" + e.getMessage(), (Throwable)e);
                            }
                        }
                    }
                });
                return new RuleExecuteResult();
            }
            PartnerSyncPlan syncPlan = this.partnerService.getSyncPlan();
            SyncMode syncMode = syncPlan.getSyncMode();
            AutoSyncAction autoSyncAction = syncPlan.getAutoSyncAction();
            if (SyncMode.autoSync != syncMode || autoSyncAction != AutoSyncAction.sourceSave || syncPlan.getStopstatus().booleanValue()) continue;
            if (this.partnerService.empty(partner.partnerMerchantComparisons()).booleanValue() && this.partnerService.empty(partner.partnerVendorComparisons()).booleanValue() && CollectionUtils.isEmpty((Collection)partner.partnerCapitalComparisons())) {
                return new RuleExecuteResult();
            }
            String requestId = UUID.randomUUID().toString();
            final String asyncKey = "partnerTask_syncAfterSave_" + requestId + "_" + partner.getId().toString();
            ProcessData.builder((int)1, (int)200, null, null).percentage("0").build(asyncKey, Integer.valueOf(1800));
            TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

                public void afterCompletion(int status) {
                    if (status == 0) {
                        BusinessPartnerSaveAfterRule.this.partnerService.executeTask(partner.getId().toString(), asyncKey);
                    }
                }
            });
            partner.set("asyncKey", (Object)asyncKey);
            return new RuleExecuteResult();
        }
        return new RuleExecuteResult();
    }

    private void updateSuperiorsBusinessPartnerOnAssoc(final BusinessPartner partner) {
        TransactionSynchronizationManager.registerSynchronization((TransactionSynchronization)new TransactionSynchronization(){

            public void afterCompletion(int status) {
                if (status == 0) {
                    BusinessPartnerDTO businessPartnerDTO = new BusinessPartnerDTO();
                    businessPartnerDTO.setId((String)partner.getId());
                    try {
                        BusinessPartnerSaveAfterRule.this.partnerServiceImpl.updateSuperiorsBusinessPartnerOnAssoc(businessPartnerDTO);
                    }
                    catch (Exception e) {
                        log.error("\u66f4\u65b0\u4e0a\u7ea7\u4f19\u4f34\u5931\u8d25" + e.getMessage(), (Throwable)e);
                    }
                }
            }
        });
    }
}

