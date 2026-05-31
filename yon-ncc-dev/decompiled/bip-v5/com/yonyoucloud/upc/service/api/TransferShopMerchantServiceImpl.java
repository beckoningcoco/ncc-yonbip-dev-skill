/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.data.service.itf.OrgExternalQryService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.api.ITransferShopMerchantService
 *  com.yonyoucloud.iuap.upc.dto.TransferShopMerchantDTO
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantDetail
 *  com.yonyoucloud.upc.common.enums.AddMerchantRangeSourceEnum
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.upc.service.IUPCMerchantQueryService
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  com.yonyoucloud.upc.utils.TransferDetailErrorShopMerchant
 *  com.yonyoucloud.upc.utils.TransferShopMerchantResult
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.data.service.itf.OrgExternalQryService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.ITransferShopMerchantService;
import com.yonyoucloud.iuap.upc.dto.TransferShopMerchantDTO;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantDetail;
import com.yonyoucloud.upc.common.enums.AddMerchantRangeSourceEnum;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.service.IUPCMerchantQueryService;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.MerchantUtils;
import com.yonyoucloud.upc.utils.TransferDetailErrorShopMerchant;
import com.yonyoucloud.upc.utils.TransferShopMerchantResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class TransferShopMerchantServiceImpl
implements ITransferShopMerchantService {
    Logger logger = LoggerFactory.getLogger(TransferShopMerchantServiceImpl.class);
    @Autowired
    private OrgExternalQryService orgExternalQryService;
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    private IUPCMerchantQueryService upcMerchantQueryService;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public TransferShopMerchantResult transferTaskShopMerchant(TransferShopMerchantDTO transferShopMerchantDTO) {
        List merchantIdList = transferShopMerchantDTO.getMerchantIdList();
        String targetOrgId = transferShopMerchantDTO.getTargetOrgId();
        Long customerLevelId = transferShopMerchantDTO.getCustomerLevelId();
        Long saleAreaId = transferShopMerchantDTO.getSaleAreaId();
        TransferShopMerchantResult transferShopMerchantResult = new TransferShopMerchantResult();
        if (!CollectionUtils.isEmpty((Collection)merchantIdList)) {
            int totalCount = merchantIdList.size();
            transferShopMerchantResult.setTotalCount(totalCount);
            int successCount = 0;
            int failCount = 0;
            ArrayList<TransferDetailErrorShopMerchant> transferDetailErrorShopMerchantList = new ArrayList<TransferDetailErrorShopMerchant>();
            for (Long merchantId : merchantIdList) {
                try {
                    if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                        this.transferTaskShopMerchant(merchantId, targetOrgId, customerLevelId, saleAreaId);
                        this.merchantGroupService.theCompensationMerchantGroupById(merchantId);
                    } else {
                        this.transferTaskShopMerchantDetail(merchantId, targetOrgId, customerLevelId, saleAreaId);
                    }
                    ++successCount;
                }
                catch (Exception e) {
                    ++failCount;
                    TransferDetailErrorShopMerchant transferDetailErrorShopMerchant = new TransferDetailErrorShopMerchant();
                    transferDetailErrorShopMerchant.setErrorCause(e.getMessage());
                    transferDetailErrorShopMerchant.setId(merchantId);
                    transferDetailErrorShopMerchantList.add(transferDetailErrorShopMerchant);
                }
            }
            transferShopMerchantResult.setSuccessCount(successCount);
            transferShopMerchantResult.setFailCount(failCount);
            transferShopMerchantResult.setCount(successCount + failCount);
            transferShopMerchantResult.setErrorList(transferDetailErrorShopMerchantList);
        } else {
            ArrayList transferDetailErrorShopMerchantList = new ArrayList();
            TransferDetailErrorShopMerchant transferDetailErrorShopMerchant = new TransferDetailErrorShopMerchant();
            transferDetailErrorShopMerchant.setErrorCause("\u9700\u8981\u79fb\u4ea4\u7684\u5546\u5bb6\u5ba2\u6237id\u4e3a\u7a7a!");
            transferShopMerchantResult.setTotalCount(0);
            transferShopMerchantResult.setSuccessCount(0);
            transferShopMerchantResult.setFailCount(0);
            transferShopMerchantResult.setCount(0);
            transferShopMerchantResult.setErrorList(transferDetailErrorShopMerchantList);
        }
        return transferShopMerchantResult;
    }

    public void transferTaskShopMerchant(Long merchantId, String targetOrgId, Long customerLevelId, Long saleAreaId) throws Exception {
        ArrayList<CustomerArea> customerAreaList;
        ArrayList<MerchantApplyRangeDetail> merchantApplyRangeDetailList;
        ArrayList<MerchantApplyRange> merchantApplyRangeList;
        Merchant merchant;
        Merchant originalDataBaseMerchant = this.merchantGroupDao.getMerchantById(merchantId);
        if (!CollectionUtils.isEmpty((Map)originalDataBaseMerchant)) {
            List originalDataBaseMerchantApplyRangeIsAppliedList;
            Long merchantApplyRangeId;
            List originalDataBaseSourceMerchantApplyRangeList;
            merchant = new Merchant();
            merchantApplyRangeList = new ArrayList<MerchantApplyRange>();
            merchantApplyRangeDetailList = new ArrayList<MerchantApplyRangeDetail>();
            customerAreaList = new ArrayList<CustomerArea>();
            if (!this.orgExternalQryService.judgeExternalOrg((String)AppContext.getYTenantId(), originalDataBaseMerchant.getCreateOrg()).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801267, new Object[]{originalDataBaseMerchant.getCode(), originalDataBaseMerchant.getName()});
            }
            merchant.setId((Object)merchantId);
            merchant.setCreateOrg(targetOrgId);
            merchant.setCreateMerchant(null);
            merchant.setCustomerArea(saleAreaId);
            merchant.setEntityStatus(EntityStatus.Update);
            int rangeType = 1;
            if (this.orgExternalQryService.judgeExternalOrg((String)AppContext.getYTenantId(), targetOrgId).booleanValue()) {
                rangeType = 3;
                merchant.setCreateMerchant(Long.valueOf(Long.parseLong(targetOrgId)));
            }
            if (CollectionUtils.isEmpty((Collection)(originalDataBaseSourceMerchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdAndOrgId(originalDataBaseMerchant.getCreateOrg(), merchantId)))) {
                return;
            }
            MerchantApplyRange originalDataBaseSourceMerchantApplyRange = (MerchantApplyRange)originalDataBaseSourceMerchantApplyRangeList.get(0);
            originalDataBaseSourceMerchantApplyRange.setIsCreator(Boolean.valueOf(false));
            originalDataBaseSourceMerchantApplyRange.setIsApplied(Boolean.valueOf(true));
            originalDataBaseSourceMerchantApplyRange.setEntityStatus(EntityStatus.Update);
            merchantApplyRangeList.add(originalDataBaseSourceMerchantApplyRange);
            List originalDataBaseTargetMerchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdAndOrgId(targetOrgId, merchantId);
            if (!CollectionUtils.isEmpty((Collection)originalDataBaseTargetMerchantApplyRangeList)) {
                MerchantApplyRange originalDataBaseTargetMerchantApplyRange = (MerchantApplyRange)originalDataBaseTargetMerchantApplyRangeList.get(0);
                originalDataBaseTargetMerchantApplyRange.setIsCreator(Boolean.valueOf(true));
                originalDataBaseTargetMerchantApplyRange.setIsApplied(Boolean.valueOf(true));
                originalDataBaseTargetMerchantApplyRange.setEntityStatus(EntityStatus.Update);
                merchantApplyRangeList.add(originalDataBaseTargetMerchantApplyRange);
                merchantApplyRangeId = (Long)originalDataBaseTargetMerchantApplyRange.getId();
                MerchantApplyRangeDetail originalDataBaseTargetMerchantApplyRangeDetail = new MerchantApplyRangeDetail();
                originalDataBaseTargetMerchantApplyRangeDetail.setMerchantApplyRangeId((Long)originalDataBaseTargetMerchantApplyRange.getId());
                originalDataBaseTargetMerchantApplyRangeDetail.set("id", (Object)merchantId);
                originalDataBaseTargetMerchantApplyRangeDetail.setCustomerLevel(customerLevelId);
                originalDataBaseTargetMerchantApplyRangeDetail.setCustomerArea(saleAreaId);
                originalDataBaseTargetMerchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                merchantApplyRangeDetailList.add(originalDataBaseTargetMerchantApplyRangeDetail);
                List originalDataBaseTargetCustomerAreaList = this.merchantGroupDao.getCustomerAreaByMerchantApplyRangeIdAndMerchantId(merchantId, merchantApplyRangeId);
                if (!CollectionUtils.isEmpty((Collection)originalDataBaseTargetCustomerAreaList)) {
                    for (CustomerArea originalDataBaseTargetCustomerArea : originalDataBaseTargetCustomerAreaList) {
                        CustomerArea originalDataBaseTargetCustomerAreaDelete = new CustomerArea();
                        originalDataBaseTargetCustomerAreaDelete.setId(originalDataBaseTargetCustomerArea.getId());
                        originalDataBaseTargetCustomerAreaDelete.setEntityStatus(EntityStatus.Delete);
                        customerAreaList.add(originalDataBaseTargetCustomerAreaDelete);
                    }
                }
            } else {
                MerchantApplyRange merchantApplyRange = MerchantUtils.getMerchantApplyRange((Long)merchantId, (Integer)rangeType, (String)targetOrgId);
                merchantApplyRange.setIsCreator(Boolean.valueOf(true));
                merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                merchantApplyRangeList.add(merchantApplyRange);
                merchantApplyRangeId = (Long)merchantApplyRange.getId();
                MerchantApplyRangeDetail originalDataBaseSourceMerchantApplyRangeDetail = this.merchantGroupDao.getMerchantApplyRangeDetailByMerchantApplyRangeId((Long)originalDataBaseSourceMerchantApplyRange.getId(), merchantId);
                if (!CollectionUtils.isEmpty((Map)originalDataBaseSourceMerchantApplyRangeDetail)) {
                    MerchantApplyRangeDetail merchantApplyRangeDetail = this.exchangeFromExtend(originalDataBaseSourceMerchantApplyRangeDetail, merchantId, merchantApplyRangeId);
                    merchantApplyRangeDetail.setCustomerArea(saleAreaId);
                    merchantApplyRangeDetail.setCustomerLevel(customerLevelId);
                    merchantApplyRangeDetail.setEntityStatus(EntityStatus.Insert);
                    merchantApplyRangeDetailList.add(merchantApplyRangeDetail);
                }
            }
            if (saleAreaId != null) {
                CustomerArea customerArea = new CustomerArea();
                customerArea.setId((Object)IdManager.getInstance().nextId());
                customerArea.setmerchantApplyRangeId(merchantApplyRangeId);
                customerArea.setMerchantId(merchantId);
                customerArea.setSaleAreaId(saleAreaId);
                customerArea.setIsDefault(Boolean.valueOf(true));
                customerArea.setEntityStatus(EntityStatus.Insert);
                customerAreaList.add(customerArea);
            }
            if (!CollectionUtils.isEmpty((Collection)(originalDataBaseMerchantApplyRangeIsAppliedList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdAndIsApplied(Boolean.valueOf(false), merchantId)))) {
                for (MerchantApplyRange originalDataBaseMerchantApplyRangeIsApplied : originalDataBaseMerchantApplyRangeIsAppliedList) {
                    if (merchantApplyRangeId == originalDataBaseMerchantApplyRangeIsApplied.getId()) continue;
                    originalDataBaseMerchantApplyRangeIsApplied.setIsApplied(Boolean.valueOf(true));
                    originalDataBaseMerchantApplyRangeIsApplied.setEntityStatus(EntityStatus.Update);
                    merchantApplyRangeList.add(originalDataBaseMerchantApplyRangeIsApplied);
                }
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801268);
        }
        this.merchantService.setMerchantApplyRangeOrgFunc(merchantApplyRangeList);
        merchant.setMerchantApplyRanges(merchantApplyRangeList);
        merchant.setMerchantAppliedDetail(merchantApplyRangeDetailList);
        merchant.setCustomerAreas(customerAreaList);
        this.merchantService.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.UDH_SUIT_ORG);
        this.logger.error("\u5546\u5bb6\u7ba1\u7406\u6743\u79fb\u4ea4:{}", (Object)JSON.toJSONString((Object)merchant));
        MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchant);
    }

    private MerchantApplyRangeDetail exchangeFromExtend(MerchantApplyRangeDetail originalDataBaseMerchantApplyRangeDetail, Long merchantId, Long merchantApplyRangeId) {
        HashMap<String, String> params = new HashMap<String, String>();
        params.put("billNo", "aa_merchant");
        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
        this.upcMerchantQueryService.exchangeFromExtend((BizObject)originalDataBaseMerchantApplyRangeDetail, (BizObject)merchantApplyRangeDetail, params);
        merchantApplyRangeDetail.set("id", (Object)merchantId);
        merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
        merchantApplyRangeDetail.remove("merchantApplyRangeExtId");
        merchantApplyRangeDetail.setCreateDate(new Date());
        merchantApplyRangeDetail.setCreateTime(new Date());
        merchantApplyRangeDetail.setModifyDate(new Date());
        merchantApplyRangeDetail.setModifyTime(new Date());
        return merchantApplyRangeDetail;
    }

    public void transferTaskShopMerchantDetail(Long merchantId, String targetOrgId, Long customerLevelId, Long saleAreaId) throws Exception {
        ArrayList<CustomerArea> customerAreaList;
        ArrayList<Object> merchantDetailList;
        ArrayList<MerchantApplyRange> merchantApplyRangeList;
        Merchant merchant;
        Merchant originalDataBaseMerchant = this.merchantGroupDao.getMerchantById(merchantId);
        if (!CollectionUtils.isEmpty((Map)originalDataBaseMerchant)) {
            List originalDataBaseMerchantApplyRangeIsAppliedList;
            Long merchantApplyRangeId;
            String merchantDerailId;
            List originalDataBaseSourceMerchantApplyRangeList;
            merchant = new Merchant();
            merchantApplyRangeList = new ArrayList<MerchantApplyRange>();
            merchantDetailList = new ArrayList<Object>();
            customerAreaList = new ArrayList<CustomerArea>();
            if (!this.orgExternalQryService.judgeExternalOrg((String)AppContext.getYTenantId(), originalDataBaseMerchant.getCreateOrg()).booleanValue()) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801267, new Object[]{originalDataBaseMerchant.getCode(), originalDataBaseMerchant.getName()});
            }
            merchant.setId((Object)merchantId);
            merchant.setCreateOrg(targetOrgId);
            merchant.setCreateMerchant(null);
            merchant.setCustomerArea(saleAreaId);
            merchant.setEntityStatus(EntityStatus.Update);
            int rangeType = 1;
            if (this.orgExternalQryService.judgeExternalOrg((String)AppContext.getYTenantId(), targetOrgId).booleanValue()) {
                rangeType = 3;
                merchant.setCreateMerchant(Long.valueOf(Long.parseLong(targetOrgId)));
            }
            if (CollectionUtils.isEmpty((Collection)(originalDataBaseSourceMerchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdAndOrgId(originalDataBaseMerchant.getCreateOrg(), merchantId)))) {
                return;
            }
            MerchantApplyRange originalDataBaseSourceMerchantApplyRange = (MerchantApplyRange)originalDataBaseSourceMerchantApplyRangeList.get(0);
            originalDataBaseSourceMerchantApplyRange.setIsCreator(Boolean.valueOf(false));
            originalDataBaseSourceMerchantApplyRange.setIsApplied(Boolean.valueOf(true));
            originalDataBaseSourceMerchantApplyRange.setEntityStatus(EntityStatus.Update);
            merchantApplyRangeList.add(originalDataBaseSourceMerchantApplyRange);
            List originalDataBaseTargetMerchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdAndOrgId(targetOrgId, merchantId);
            if (!CollectionUtils.isEmpty((Collection)originalDataBaseTargetMerchantApplyRangeList)) {
                MerchantDetail originalDataBaseSourceMerchantDetail;
                MerchantApplyRange originalDataBaseTargetMerchantApplyRange = (MerchantApplyRange)originalDataBaseTargetMerchantApplyRangeList.get(0);
                merchantDerailId = originalDataBaseTargetMerchantApplyRange.getMerchantDetailId();
                originalDataBaseTargetMerchantApplyRange.setIsCreator(Boolean.valueOf(true));
                originalDataBaseTargetMerchantApplyRange.setIsApplied(Boolean.valueOf(true));
                originalDataBaseTargetMerchantApplyRange.setEntityStatus(EntityStatus.Update);
                merchantApplyRangeList.add(originalDataBaseTargetMerchantApplyRange);
                if (originalDataBaseTargetMerchantApplyRange.getMerchantDetailId().equals(originalDataBaseSourceMerchantApplyRange.getMerchantDetailId())) {
                    originalDataBaseSourceMerchantDetail = new MerchantDetail();
                    originalDataBaseSourceMerchantDetail.setId((Object)originalDataBaseSourceMerchantApplyRange.getMerchantDetailId());
                    originalDataBaseSourceMerchantDetail.setBelongOrgId(originalDataBaseTargetMerchantApplyRange.getOrgId());
                    originalDataBaseSourceMerchantDetail.setEntityStatus(EntityStatus.Update);
                    merchantDetailList.add(originalDataBaseSourceMerchantDetail);
                } else {
                    originalDataBaseSourceMerchantDetail = new MerchantDetail();
                    originalDataBaseSourceMerchantDetail.setId((Object)originalDataBaseSourceMerchantApplyRange.getMerchantDetailId());
                    originalDataBaseSourceMerchantDetail.setIsCreator(Boolean.valueOf(false));
                    originalDataBaseSourceMerchantDetail.setEntityStatus(EntityStatus.Update);
                    merchantDetailList.add(originalDataBaseSourceMerchantDetail);
                    MerchantDetail originalDataBaseTargetMerchantDetail = new MerchantDetail();
                    originalDataBaseTargetMerchantDetail.setId((Object)originalDataBaseTargetMerchantApplyRange.getMerchantDetailId());
                    originalDataBaseTargetMerchantDetail.setIsCreator(Boolean.valueOf(true));
                    originalDataBaseTargetMerchantDetail.setEntityStatus(EntityStatus.Update);
                    merchantDetailList.add(originalDataBaseTargetMerchantDetail);
                }
                merchantApplyRangeId = (Long)originalDataBaseTargetMerchantApplyRange.getId();
                List originalDataBaseTargetCustomerAreaList = this.merchantGroupDao.getCustomerAreaByMerchantApplyRangeIdAndMerchantId(merchantId, merchantApplyRangeId);
                if (!CollectionUtils.isEmpty((Collection)originalDataBaseTargetCustomerAreaList)) {
                    for (CustomerArea originalDataBaseTargetCustomerArea : originalDataBaseTargetCustomerAreaList) {
                        CustomerArea originalDataBaseTargetCustomerAreaDelete = new CustomerArea();
                        originalDataBaseTargetCustomerAreaDelete.setId(originalDataBaseTargetCustomerArea.getId());
                        originalDataBaseTargetCustomerAreaDelete.setEntityStatus(EntityStatus.Delete);
                        customerAreaList.add(originalDataBaseTargetCustomerAreaDelete);
                    }
                }
            } else {
                MerchantApplyRange merchantApplyRange = MerchantUtils.getMerchantApplyRange((Long)merchantId, (Integer)rangeType, (String)targetOrgId);
                merchantApplyRange.setIsCreator(Boolean.valueOf(true));
                merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                merchantApplyRangeId = (Long)merchantApplyRange.getId();
                List newOriginalDataBaseMerchantDetailList = this.merchantGroupDao.getMerchantDetailById(originalDataBaseSourceMerchantApplyRange.getMerchantDetailId(), merchantId);
                MerchantDetail userMerchantDetail = this.merchantGroupService.copyMerchantDetail((MerchantDetail)newOriginalDataBaseMerchantDetailList.get(0), merchantApplyRange.getOrgId(), merchantId, true);
                merchantDerailId = (String)userMerchantDetail.getId();
                merchantApplyRange.setMerchantDetailId((String)userMerchantDetail.getId());
                merchantDetailList.add(userMerchantDetail);
                merchantApplyRangeList.add(merchantApplyRange);
            }
            if (saleAreaId != null) {
                CustomerArea customerArea = new CustomerArea();
                customerArea.setId((Object)IdManager.getInstance().nextId());
                customerArea.setmerchantApplyRangeId(merchantApplyRangeId);
                customerArea.setMerchantId(merchantId);
                customerArea.setSaleAreaId(saleAreaId);
                customerArea.setIsDefault(Boolean.valueOf(true));
                customerArea.setEntityStatus(EntityStatus.Insert);
                customerAreaList.add(customerArea);
            }
            if (!CollectionUtils.isEmpty((Collection)(originalDataBaseMerchantApplyRangeIsAppliedList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdAndIsApplied(Boolean.valueOf(false), merchantId)))) {
                for (MerchantApplyRange originalDataBaseMerchantApplyRangeIsApplied : originalDataBaseMerchantApplyRangeIsAppliedList) {
                    if (merchantApplyRangeId == originalDataBaseMerchantApplyRangeIsApplied.getId()) continue;
                    originalDataBaseMerchantApplyRangeIsApplied.setMerchantDetailId(merchantDerailId);
                    originalDataBaseMerchantApplyRangeIsApplied.setEntityStatus(EntityStatus.Update);
                    merchantApplyRangeList.add(originalDataBaseMerchantApplyRangeIsApplied);
                }
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801268);
        }
        this.merchantService.setMerchantApplyRangeOrgFunc(merchantApplyRangeList);
        merchant.setMerchantApplyRanges(merchantApplyRangeList);
        merchant.setMerchantDetail(merchantDetailList);
        merchant.setCustomerAreas(customerAreaList);
        this.merchantService.assignerMerchantApplyRangeSource(merchant, AddMerchantRangeSourceEnum.UDH_SUIT_ORG);
        this.logger.error("\u5546\u5bb6\u7ba1\u7406\u6743\u79fb\u4ea4:{}", (Object)JSON.toJSONString((Object)merchant));
        MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchant);
    }
}

