/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.api.IMerchantApplyRangeDetailService
 *  com.yonyoucloud.iuap.upc.dto.portal.MerchantRangeDetailPortalDTO
 *  com.yonyoucloud.upc.aa.merchant.FrozenState
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantDetail
 *  com.yonyoucloud.upc.aa.merchant.Payway
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.IMerchantApplyRangeDetailService;
import com.yonyoucloud.iuap.upc.dto.portal.MerchantRangeDetailPortalDTO;
import com.yonyoucloud.upc.aa.merchant.FrozenState;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantDetail;
import com.yonyoucloud.upc.aa.merchant.Payway;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class MerchantApplyRangeDetailServiceImpl
implements IMerchantApplyRangeDetailService {
    private static final Logger log = LoggerFactory.getLogger(MerchantApplyRangeDetailServiceImpl.class);
    Logger logger = LoggerFactory.getLogger(MerchantApplyRangeDetailServiceImpl.class);
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;
    @Autowired
    private MerchantService merchantService;

    public void lock(Long merchantId, String createOrgId, String orgId) throws Exception {
        this.lock(merchantId, createOrgId, orgId, null, null);
    }

    public void lock(Long merchantId, String createOrgId, String orgId, Long modifyUserId, String modifyUserName) throws Exception {
        if (merchantId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800933);
        }
        Boolean aBoolean = createOrgId != null && orgId != null || createOrgId == null && orgId == null;
        if (aBoolean.booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801322);
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (createOrgId == null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)orgId));
        }
        QuerySchema schemaId = QuerySchema.create().addSelect("id,merchantDetailId").addCondition((ConditionExpression)queryConditionGroup);
        schemaId.setPartitionable(false);
        List bizObjectList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaId, null);
        if (!CollectionUtils.isEmpty((Collection)bizObjectList)) {
            for (BizObject bizObject : bizObjectList) {
                MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                merchantApplyRangeDetail.setMerchantApplyRangeId((Long)bizObject.getId());
                merchantApplyRangeDetail.setLockTime(new Date());
                merchantApplyRangeDetail.setLockDate(new Date());
                merchantApplyRangeDetail.setFrozenState(FrozenState.frozen);
                merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                merchantApplyRangeDetail.setModifierId(modifyUserId);
                merchantApplyRangeDetail.setModifier(modifyUserName);
                merchantApplyRangeDetail.setModifyDate(new Date());
                this.updateMerchantApplyRangeForLock(merchantApplyRangeDetail, merchantId);
                if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) continue;
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
            }
        } else {
            String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802E8", (String)"\u4e0d\u5b58\u5728\u8be5\u6761\u8bb0\u5f55,querySchema:[%s]"), schemaId);
            throw new CoreDocBusinessException(str);
        }
    }

    public void unLock(Long merchantId, String createOrgId, String orgId, List<String> excludeOrgId) throws Exception {
        this.unLock(merchantId, createOrgId, orgId, excludeOrgId, null, null);
    }

    public void unLock(Long merchantId, String createOrgId, String orgId, List<String> excludeOrgId, Long modifyUserId, String modifyUserName) throws Exception {
        if (merchantId == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800933);
        }
        Boolean aBoolean = createOrgId != null && orgId != null || createOrgId == null && orgId == null;
        if (aBoolean.booleanValue()) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801322);
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (createOrgId == null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").eq((Object)orgId));
        } else if (!CollectionUtils.isEmpty(excludeOrgId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"orgId").not_in(excludeOrgId));
        }
        QuerySchema schemaId = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)queryConditionGroup);
        schemaId.setPartitionable(false);
        List bizObjectList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaId, null);
        if (!CollectionUtils.isEmpty((Collection)bizObjectList)) {
            for (BizObject bizObject : bizObjectList) {
                MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                merchantApplyRangeDetail.setMerchantApplyRangeId((Long)bizObject.getId());
                merchantApplyRangeDetail.setLocker(null);
                merchantApplyRangeDetail.setLockTime(null);
                merchantApplyRangeDetail.setLockDate(null);
                merchantApplyRangeDetail.setFrozenState(FrozenState.unfrozen);
                merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                merchantApplyRangeDetail.setModifierId(modifyUserId);
                merchantApplyRangeDetail.setModifier(modifyUserName);
                merchantApplyRangeDetail.setModifyDate(new Date());
                this.updateMerchantApplyRangeForLock(merchantApplyRangeDetail, merchantId);
                if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) continue;
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
            }
        } else {
            String str = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_179F6286040802E8", (String)"\u4e0d\u5b58\u5728\u8be5\u6761\u8bb0\u5f55,querySchema:[%s]"), schemaId);
            throw new CoreDocBusinessException(str);
        }
    }

    public CoreDocJsonResult<MerchantRangeDetailPortalDTO> updateMerchantRangeDetailForPortal(MerchantRangeDetailPortalDTO merchantRangeDetailPortalDTO) {
        try {
            this.updateMerchantRangeDetail(merchantRangeDetailPortalDTO);
            return CoreDocJsonResult.success((Object)merchantRangeDetailPortalDTO);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            this.logger.error("\u534f\u4f5c\u8ba2\u8d27\u5ba2\u6237\u6863\u6848\u66f4\u65b0\u4e1a\u52a1\u4fe1\u606f\u63a5\u53e3\u62a5\u9519:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void updateMerchantRangeDetail(MerchantRangeDetailPortalDTO merchantRangeDetailPortalDTO) throws Exception {
        Long merchantId;
        MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
        MerchantDetail merchantDetail = new MerchantDetail();
        if (merchantRangeDetailPortalDTO.getMerchantApplyRangeId() != null) {
            merchantApplyRangeDetail.setMerchantApplyRangeId(merchantRangeDetailPortalDTO.getMerchantApplyRangeId());
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantRangeDetailPortalDTO.getMerchantApplyRangeId()), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
            QuerySchema schemaId = QuerySchema.create().addSelect("id,orgId,merchantId,merchantDetailId").addCondition((ConditionExpression)queryConditionGroup);
            schemaId.setPartitionable(false);
            List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaId, null);
            if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801323);
            merchantId = ((MerchantApplyRange)merchantApplyRangeList.get(0)).getMerchantId();
            merchantDetail.setId((Object)((MerchantApplyRange)merchantApplyRangeList.get(0)).getMerchantDetailId());
        } else {
            if (merchantRangeDetailPortalDTO.getMerchantId() == null || !StringUtils.hasText((String)merchantRangeDetailPortalDTO.getOrgId())) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801324);
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)merchantRangeDetailPortalDTO.getMerchantId()), QueryCondition.name((String)"orgId").eq((Object)merchantRangeDetailPortalDTO.getOrgId()), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
            QuerySchema schemaId = QuerySchema.create().addSelect("id,orgId,merchantId,merchantDetailId").addCondition((ConditionExpression)queryConditionGroup);
            schemaId.setPartitionable(false);
            List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schemaId, null);
            if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801323);
            merchantId = ((MerchantApplyRange)merchantApplyRangeList.get(0)).getMerchantId();
            merchantApplyRangeDetail.setMerchantApplyRangeId((Long)((MerchantApplyRange)merchantApplyRangeList.get(0)).getId());
            merchantDetail.setId((Object)((MerchantApplyRange)merchantApplyRangeList.get(0)).getMerchantDetailId());
        }
        if (merchantRangeDetailPortalDTO.getSettlementMethod() != null) {
            merchantApplyRangeDetail.setSettlementMethod(merchantRangeDetailPortalDTO.getSettlementMethod());
            merchantDetail.setSettlementMethodId(merchantRangeDetailPortalDTO.getSettlementMethod());
        }
        if (merchantRangeDetailPortalDTO.getShipmentMethod() != null) {
            merchantApplyRangeDetail.setShipmentMethod(merchantRangeDetailPortalDTO.getShipmentMethod());
            merchantDetail.setShipmentMethodId(merchantRangeDetailPortalDTO.getShipmentMethod());
        }
        if (merchantRangeDetailPortalDTO.getPayWay() != null) {
            merchantApplyRangeDetail.setPayway(Payway.find((Number)merchantRangeDetailPortalDTO.getPayWay()));
            merchantDetail.setPayWay(Payway.find((Number)merchantRangeDetailPortalDTO.getPayWay()));
        }
        if (merchantRangeDetailPortalDTO.getStopStatus() != null) {
            merchantApplyRangeDetail.setStopstatus(merchantRangeDetailPortalDTO.getStopStatus());
            merchantDetail.setStopstatus(merchantRangeDetailPortalDTO.getStopStatus());
        }
        if (merchantRangeDetailPortalDTO.getIsTradeCustomers() != null) {
            merchantApplyRangeDetail.setIsTradeCustomers(merchantRangeDetailPortalDTO.getIsTradeCustomers());
            merchantDetail.setIsTradeCustomers(merchantRangeDetailPortalDTO.getIsTradeCustomers());
        }
        merchantApplyRange.setId((Object)merchantApplyRangeDetail.getMerchantApplyRangeId());
        merchantApplyRange.setIsApplied(Boolean.valueOf(true));
        merchantApplyRange.setEntityStatus(EntityStatus.Update);
        merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
        this.updateMerchantDetail(merchantApplyRange, merchantApplyRangeDetail, merchantId);
        MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
        if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) return;
        this.merchantService.syncStopStatus(InvocationInfoProxy.getTenantid());
    }

    public void updateMerchantApplyRangeForLock(MerchantApplyRangeDetail merchantApplyRangeDetail, Long merchantId) throws Exception {
        MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
        merchantApplyRange.setId((Object)merchantApplyRangeDetail.getMerchantApplyRangeId());
        merchantApplyRange.setIsApplied(Boolean.valueOf(true));
        merchantApplyRange.setEntityStatus(EntityStatus.Update);
        List<MerchantApplyRange> originalDataBaseMerchantApplyRangeList = this.merchantGroupService.getMerchantApplyRangeById(merchantApplyRangeDetail.getMerchantApplyRangeId(), merchantId);
        if (CollectionUtils.isEmpty(originalDataBaseMerchantApplyRangeList) || !StringUtils.hasText((String)originalDataBaseMerchantApplyRangeList.get(0).getMerchantDetailId())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_SUIT_IS_NULL);
        }
        MerchantApplyRange originalDataBaseMerchantApplyRange = originalDataBaseMerchantApplyRangeList.get(0);
        List<MerchantDetail> originalDataBaseMerchantDetailList = this.merchantGroupService.getMerchantDetailByBelongOrgId(originalDataBaseMerchantApplyRange.getOrgId(), merchantId);
        if (CollectionUtils.isEmpty(originalDataBaseMerchantDetailList)) {
            List merchantDetailList = this.merchantGroupDao.getMerchantDetailById(originalDataBaseMerchantApplyRange.getMerchantDetailId(), merchantId);
            MerchantDetail merchantDetail = this.merchantGroupService.copyMerchantDetail((MerchantDetail)merchantDetailList.get(0), originalDataBaseMerchantApplyRange.getOrgId(), merchantId, BooleanUtil.isTrue((Object)originalDataBaseMerchantApplyRange.getIsCreator()));
            merchantDetail.setFrozenState(merchantApplyRangeDetail.getFrozenState());
            merchantDetail.setLockDate(merchantApplyRangeDetail.getLockDate());
            merchantDetail.setLockTime(merchantApplyRangeDetail.getLockTime());
            merchantDetail.setModifier(merchantApplyRangeDetail.getModifier());
            merchantDetail.setModifierId(merchantApplyRangeDetail.getModifierId());
            merchantDetail.setModifyDate(new Date());
            merchantApplyRange.setMerchantDetailId((String)merchantDetail.getId());
            MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
            MetaDaoHelper.insert((String)"aa.merchant.MerchantDetail", (BizObject)merchantDetail);
        } else {
            MerchantDetail merchantDetail = originalDataBaseMerchantDetailList.get(0);
            merchantDetail.setFrozenState(merchantApplyRangeDetail.getFrozenState());
            merchantDetail.setLockDate(merchantApplyRangeDetail.getLockDate());
            merchantDetail.setLockTime(merchantApplyRangeDetail.getLockTime());
            merchantDetail.setModifier(merchantApplyRangeDetail.getModifier());
            merchantDetail.setModifierId(merchantApplyRangeDetail.getModifierId());
            merchantDetail.setModifyDate(new Date());
            merchantDetail.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"aa.merchant.MerchantDetail", (BizObject)merchantDetail);
        }
    }

    public void updateMerchantDetail(MerchantApplyRange merchantApplyRange, MerchantApplyRangeDetail merchantApplyRangeDetail, Long merchantId) throws Exception {
        List<MerchantApplyRange> originalDataBaseMerchantApplyRangeList = this.merchantGroupService.getMerchantApplyRangeById(merchantApplyRangeDetail.getMerchantApplyRangeId(), merchantId);
        if (CollectionUtils.isEmpty(originalDataBaseMerchantApplyRangeList) || !StringUtils.hasText((String)originalDataBaseMerchantApplyRangeList.get(0).getMerchantDetailId())) {
            return;
        }
        MerchantApplyRange originalDataBaseMerchantApplyRange = originalDataBaseMerchantApplyRangeList.get(0);
        List<MerchantDetail> originalDataBaseMerchantDetailList = this.merchantGroupService.getMerchantDetailByBelongOrgId(originalDataBaseMerchantApplyRange.getOrgId(), merchantId);
        if (CollectionUtils.isEmpty(originalDataBaseMerchantDetailList)) {
            List newOriginalDataBaseMerchantDetailList = this.merchantGroupDao.getMerchantDetailById(originalDataBaseMerchantApplyRange.getMerchantDetailId(), merchantId);
            MerchantDetail userMerchantDetail = this.merchantGroupService.copyMerchantDetail((MerchantDetail)newOriginalDataBaseMerchantDetailList.get(0), originalDataBaseMerchantApplyRange.getOrgId(), merchantId, BooleanUtil.isTrue((Object)originalDataBaseMerchantApplyRange.getIsCreator()));
            if (merchantApplyRangeDetail.getSettlementMethod() != null) {
                userMerchantDetail.setSettlementMethodId(merchantApplyRangeDetail.getSettlementMethod());
            }
            if (merchantApplyRangeDetail.getShipmentMethod() != null) {
                userMerchantDetail.setShipmentMethodId(merchantApplyRangeDetail.getShipmentMethod());
            }
            if (merchantApplyRangeDetail.getPayway() != null) {
                userMerchantDetail.setPayWay(merchantApplyRangeDetail.getPayway());
            }
            if (merchantApplyRangeDetail.getStopstatus() != null) {
                userMerchantDetail.setStopstatus(merchantApplyRangeDetail.getStopstatus());
            }
            if (merchantApplyRangeDetail.getIsTradeCustomers() != null) {
                userMerchantDetail.setIsTradeCustomers(merchantApplyRangeDetail.getIsTradeCustomers());
            }
            merchantApplyRange.setMerchantDetailId((String)userMerchantDetail.getId());
            MetaDaoHelper.insert((String)"aa.merchant.MerchantDetail", (BizObject)userMerchantDetail);
        } else {
            MerchantDetail originalDataBaseMerchantDetail = originalDataBaseMerchantDetailList.get(0);
            if (merchantApplyRangeDetail.getSettlementMethod() != null) {
                originalDataBaseMerchantDetail.setSettlementMethodId(merchantApplyRangeDetail.getSettlementMethod());
            }
            if (merchantApplyRangeDetail.getShipmentMethod() != null) {
                originalDataBaseMerchantDetail.setShipmentMethodId(merchantApplyRangeDetail.getShipmentMethod());
            }
            if (merchantApplyRangeDetail.getPayway() != null) {
                originalDataBaseMerchantDetail.setPayWay(merchantApplyRangeDetail.getPayway());
            }
            if (merchantApplyRangeDetail.getStopstatus() != null) {
                originalDataBaseMerchantDetail.setStopstatus(merchantApplyRangeDetail.getStopstatus());
            }
            if (merchantApplyRangeDetail.getIsTradeCustomers() != null) {
                originalDataBaseMerchantDetail.setIsTradeCustomers(merchantApplyRangeDetail.getIsTradeCustomers());
            }
            merchantApplyRange.setMerchantDetailId((String)originalDataBaseMerchantDetail.getId());
            originalDataBaseMerchantDetail.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"aa.merchant.MerchantDetail", (BizObject)originalDataBaseMerchantDetail);
        }
    }
}

