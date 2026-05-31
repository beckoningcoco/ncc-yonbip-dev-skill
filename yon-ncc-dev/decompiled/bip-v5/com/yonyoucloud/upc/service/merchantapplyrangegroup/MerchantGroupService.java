/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.api.IYmsJdbcApi
 *  com.yonyou.iuap.yms.param.SQLParameter
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantDetailForCRM
 *  com.yonyoucloud.upc.attrcontrol.CarryType
 *  com.yonyoucloud.upc.attrcontrol.ControlType
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig
 *  com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QueryPager
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 */
package com.yonyoucloud.upc.service.merchantapplyrangegroup;

import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.ListSplitUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.api.IYmsJdbcApi;
import com.yonyou.iuap.yms.param.SQLParameter;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantDetailForCRM;
import com.yonyoucloud.upc.attrcontrol.CarryType;
import com.yonyoucloud.upc.attrcontrol.ControlType;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfig;
import com.yonyoucloud.upc.attrcontrol.DocAttributeControlConfigDTO;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QueryPager;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

@Service
public class MerchantGroupService {
    private Logger logger = LoggerFactory.getLogger(MerchantGroupService.class);
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    @Autowired
    @Qualifier(value="busiBaseDAO")
    private IYmsJdbcApi ymsJdbcApi;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public void saveMerchantApplyRangeGroup(Merchant merchant) throws Exception {
        List merchantApplyRangeList = merchant.merchantApplyRanges();
        List merchantApplyRangeDetailList = merchant.merchantAppliedDetail();
        ArrayList<MerchantDetail> merchantDetailList = new ArrayList<MerchantDetail>();
        if (merchant.getEntityStatus() == EntityStatus.Insert) {
            if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                return;
            }
            MerchantApplyRangeDetail merchantApplyRangeDetail = (MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0);
            MerchantDetail merchantDetail = this.getMerchantDetailForInsert(merchantApplyRangeDetail, merchant.getCreateOrg(), (Long)merchant.getId(), true);
            merchantDetailList.add(merchantDetail);
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                merchantApplyRange.setMerchantDetailId((String)merchantDetail.getId());
            }
        }
        if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
            merchant.setMerchantAppliedDetail(null);
        }
        merchant.setMerchantDetail(merchantDetailList);
    }

    public void saveMerchantApplyRangeGroupFromCrm(Merchant merchant) throws Exception {
        List merchantApplyRangeList = merchant.merchantApplyRanges();
        List merchantApplyRangeDetailList = merchant.merchantAppliedDetail();
        ArrayList<MerchantDetail> merchantDetailList = new ArrayList<MerchantDetail>();
        if (merchant.getEntityStatus() == EntityStatus.Insert) {
            if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                this.logger.error("\u5ba2\u6237\u6863\u6848\u65b0\u589eCRM\u53cc\u5199\u89c4\u5219merchantApplyRangeList\u4e3a\u7a7a");
                return;
            }
            MerchantApplyRangeDetail merchantApplyRangeDetail = (MerchantApplyRangeDetail)merchantApplyRangeDetailList.get(0);
            if (merchantApplyRangeDetail.getCreator() == null) {
                merchantApplyRangeDetail.setCreator(AppContext.getCurrentUser().getName());
            }
            if (merchantApplyRangeDetail.getCreatorId() == null) {
                merchantApplyRangeDetail.setCreatorId((Long)AppContext.getCurrentUser().getId());
            }
            if (merchantApplyRangeDetail.getCreateTime() == null) {
                merchantApplyRangeDetail.setCreateTime(new Date());
            }
            MerchantDetail merchantDetail = this.getMerchantDetailForInsert(merchantApplyRangeDetail, merchant.getCreateOrg(), (Long)merchant.getId(), true);
            merchantDetailList.add(merchantDetail);
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                if (merchant.getCreateOrg().equals(merchantApplyRange.getOrgId())) {
                    merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                } else {
                    merchantApplyRange.setIsApplied(Boolean.valueOf(false));
                }
                merchantApplyRange.setMerchantDetailId((String)merchantDetail.getId());
            }
        } else {
            if (CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList) || CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_SAVE_ERROR, new Object[]{InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A2053800B0", (String)"\u751f\u6210 MerchantDetail \u5bf9\u8c61\u5931\u8d25\uff0cmerchantApplyRangeList \u6216 merchantApplyRangeDetailList \u4e3a\u7a7a\uff01")});
            }
            for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                if (merchantApplyRangeDetail.getModifier() == null) {
                    merchantApplyRangeDetail.setModifier(AppContext.getCurrentUser().getName());
                }
                if (merchantApplyRangeDetail.getModifierId() == null) {
                    merchantApplyRangeDetail.setModifierId((Long)AppContext.getCurrentUser().getId());
                }
                if (merchantApplyRangeDetail.getModifyTime() != null) continue;
                merchantApplyRangeDetail.setModifyTime(new Date());
            }
            if (merchant.get("merchantApplyRangeId") == null && merchant.get("belongOrg") == null) {
                QuerySchema querySchema = QuerySchema.create();
                querySchema.addSelect("id,isCreator");
                querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq(merchant.getId()), QueryCondition.name((String)"isCreator").eq((Object)1), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())}));
                querySchema.setPartitionable(false);
                Map map = MetaDaoHelper.queryOne((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema);
                if (map != null && !map.isEmpty()) {
                    merchant.put("isCreator", map.get("isCreator"));
                    merchant.put("merchantApplyRangeId", map.get("id"));
                } else {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.MERCHANT_SAVE_ERROR, new Object[]{InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_21A830A2053800AF", (String)"\u6839\u636e\u5ba2\u6237 ID \u67e5\u8be2\u9002\u7528\u8303\u56f4\u4e3a\u7a7a\uff0c\u8bf7\u786e\u8ba4\u4f20\u53c2\u662f\u5426\u51c6\u786e\uff01")});
                }
            }
            for (MerchantApplyRange merchantApplyRange : merchantApplyRangeList) {
                merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                this.setCrmForMerchantApplyRangeGroup(merchantDetailList, merchant, merchantApplyRange);
            }
        }
        merchant.setMerchantDetail(merchantDetailList);
    }

    public void setCrmForMerchantApplyRangeGroup(List<MerchantDetail> merchantDetailList, Merchant merchant, MerchantApplyRange merchantApplyRange) throws Exception {
        List<MerchantDetail> originalUserMerchantDetailList;
        MerchantDetail merchantDetail = merchantApplyRange.getEntityStatus() == EntityStatus.Insert ? this.setCrmForMerchantDetail(merchant, merchantApplyRange, null) : (CollectionUtils.isEmpty(originalUserMerchantDetailList = this.getMerchantDetailByBelongOrgId(merchantApplyRange.getOrgId(), (Long)merchant.getId())) ? this.setCrmForMerchantDetail(merchant, merchantApplyRange, null) : this.setCrmForMerchantDetail(merchant, merchantApplyRange, originalUserMerchantDetailList.get(0)));
        merchantDetailList.add(merchantDetail);
        merchantApplyRange.setMerchantDetailId((String)merchantDetail.getId());
    }

    public MerchantDetail setCrmForMerchantDetail(Merchant merchant, MerchantApplyRange merchantApplyRange, MerchantDetail originalUserMerchantDetail) throws Exception {
        MerchantDetail merchantDetail = new MerchantDetail();
        List merchantApplyRangeDetailList = merchant.merchantAppliedDetail();
        if (CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList)) {
            return null;
        }
        for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
            if (!merchantApplyRange.getId().equals(merchantApplyRangeDetail.getMerchantApplyRangeId())) continue;
            if (merchantApplyRange.getEntityStatus() == EntityStatus.Insert) {
                merchantDetail = this.getMerchantDetailForInsert(merchantApplyRangeDetail, merchantApplyRange.getOrgId(), (Long)merchant.getId(), false);
                continue;
            }
            if (CollectionUtils.isEmpty((Map)originalUserMerchantDetail)) {
                merchantDetail = this.getMerchantDetailForInsert(merchantApplyRangeDetail, merchantApplyRange.getOrgId(), (Long)merchant.getId(), false);
                continue;
            }
            merchantDetail = this.getMerchantDetailForUpdate(merchantApplyRangeDetail, (String)originalUserMerchantDetail.getId(), merchantApplyRange.getOrgId(), (Long)merchant.getId());
        }
        return merchantDetail;
    }

    private MerchantDetailForCRM setCrmForMerchantDetailForCRM(Merchant merchant, MerchantApplyRange merchantApplyRange, String merchantDetailId) throws Exception {
        MerchantDetailForCRM merchantDetailForCRM = new MerchantDetailForCRM();
        List merchantApplyRangeDetailList = merchant.merchantAppliedDetail();
        if (CollectionUtils.isEmpty((Collection)merchantApplyRangeDetailList)) {
            return null;
        }
        for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
            if (!merchantApplyRange.getId().equals(merchantApplyRangeDetail.getMerchantApplyRangeId())) continue;
            if (merchantApplyRange.getEntityStatus() == EntityStatus.Insert) {
                merchantDetailForCRM = this.initMerchantDetailForCRM(merchantApplyRange, merchantApplyRangeDetail, (Long)merchant.getId(), merchantDetailId);
                continue;
            }
            List<MerchantDetailForCRM> userOriginalMerchantDetailForCRMList = this.getMerchantDetailForCRMByMerchantDetailId(merchantDetailId, (Long)merchant.getId());
            if (CollectionUtils.isEmpty(userOriginalMerchantDetailForCRMList)) {
                merchantDetailForCRM = this.initMerchantDetailForCRM(merchantApplyRange, merchantApplyRangeDetail, (Long)merchant.getId(), merchantDetailId);
                continue;
            }
            merchantDetailForCRM = this.updateMerchantDetailForCRM(merchantApplyRange, merchantApplyRangeDetail, (String)userOriginalMerchantDetailForCRMList.get(0).getId(), (Long)merchant.getId(), merchantDetailId);
        }
        return merchantDetailForCRM;
    }

    public void setBusinessSaveMerchantApplyRangeGroup(MerchantApplyRange merchantApplyRange, MerchantApplyRangeDetail merchantApplyRangeDetail) throws Exception {
        Merchant merchant = this.getMerchantCreateOrgById(merchantApplyRange.getMerchantId());
        merchant.setId((Object)merchantApplyRange.getMerchantId());
        if (!CollectionUtils.isEmpty((Map)merchant) && merchant.getCreateOrg() != null) {
            if (merchant.getCreateOrg().equals(merchantApplyRange.getOrgId())) {
                List<MerchantDetail> originalMerchantDetailList = this.getMerchantDetailByBelongOrgId(merchantApplyRange.getOrgId(), (Long)merchant.getId());
                if (!CollectionUtils.isEmpty(originalMerchantDetailList)) {
                    MerchantDetail originalMerchantDetail = originalMerchantDetailList.get(0);
                    merchantApplyRange.setMerchantDetailId((String)originalMerchantDetail.getId());
                    MerchantDetail merchantDetailUpdate = this.getMerchantDetailForUpdate(merchantApplyRangeDetail, (String)originalMerchantDetail.getId(), merchant.getCreateOrg(), (Long)merchant.getId());
                    MetaDaoHelper.update((String)"aa.merchant.MerchantDetail", (BizObject)merchantDetailUpdate);
                }
            } else {
                List<MerchantDetail> originalUserMerchantDetailList = this.getMerchantDetailByBelongOrgId(merchantApplyRange.getOrgId(), (Long)merchant.getId());
                if (!CollectionUtils.isEmpty(originalUserMerchantDetailList)) {
                    MerchantDetail merchantDetail = this.getMerchantDetailForUpdate(merchantApplyRangeDetail, (String)originalUserMerchantDetailList.get(0).getId(), merchantApplyRange.getOrgId(), (Long)merchant.getId());
                    merchantApplyRange.setMerchantDetailId((String)merchantDetail.getId());
                    MetaDaoHelper.update((String)"aa.merchant.MerchantDetail", (BizObject)merchantDetail);
                } else {
                    MerchantDetail userMerchantDetail = this.getMerchantDetailForInsert(merchantApplyRangeDetail, merchantApplyRange.getOrgId(), (Long)merchant.getId(), false);
                    merchantApplyRange.setMerchantDetailId((String)userMerchantDetail.getId());
                    MetaDaoHelper.insert((String)"aa.merchant.MerchantDetail", (BizObject)userMerchantDetail);
                }
            }
        }
    }

    public void deleteMerchantApplyRangeGroup(Long merchantId, Long merchantApplyRangeId, Boolean isCreator) throws Exception {
        MerchantApplyRange originalDataBaseMerchantApplyRange;
        List<MerchantDetail> originalDataBaseMerchantDetailList;
        List<MerchantApplyRange> originalDataBaseMerchantApplyRangeList;
        if (!(isCreator.booleanValue() || CollectionUtils.isEmpty(originalDataBaseMerchantApplyRangeList = this.getMerchantApplyRangeById(merchantApplyRangeId, merchantId)) || CollectionUtils.isEmpty(originalDataBaseMerchantDetailList = this.getMerchantDetailByBelongOrgId((originalDataBaseMerchantApplyRange = originalDataBaseMerchantApplyRangeList.get(0)).getOrgId(), merchantId)))) {
            originalDataBaseMerchantDetailList.get(0).setEntityStatus(EntityStatus.Delete);
            MetaDaoHelper.delete((String)"aa.merchant.MerchantDetail", originalDataBaseMerchantDetailList);
        }
    }

    public void enableMerchantApplyRangeGroup(Long merchantId, Long merchantApplyRangeId) throws Exception {
        this.stopStatusMerchantApplyRangeGroup(merchantId, merchantApplyRangeId, false);
    }

    public void disableMerchantApplyRangeGroup(Long merchantId, Long merchantApplyRangeId) throws Exception {
        this.stopStatusMerchantApplyRangeGroup(merchantId, merchantApplyRangeId, true);
    }

    public void stopStatusMerchantApplyRangeGroup(Long merchantId, Long merchantApplyRangeId, Boolean stopStatus) throws Exception {
        List<MerchantApplyRange> originalDataBaseMerchantApplyRangeList = this.getMerchantApplyRangeById(merchantApplyRangeId, merchantId);
        if (CollectionUtils.isEmpty(originalDataBaseMerchantApplyRangeList)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.FIND_MERCHANT_APPLY_RANGE_IS_NULL);
        }
        MerchantApplyRange originalDataBaseMerchantApplyRange = originalDataBaseMerchantApplyRangeList.get(0);
        List<MerchantDetail> originalDataBaseMerchantDetailList = this.getMerchantDetailByBelongOrgId(originalDataBaseMerchantApplyRange.getOrgId(), merchantId);
        if (CollectionUtils.isEmpty(originalDataBaseMerchantDetailList)) {
            List newOriginalDataBaseMerchantDetailList = this.merchantGroupDao.getMerchantDetailById(originalDataBaseMerchantApplyRange.getMerchantDetailId(), merchantId);
            MerchantDetail userMerchantDetail = this.copyMerchantDetail((MerchantDetail)newOriginalDataBaseMerchantDetailList.get(0), originalDataBaseMerchantApplyRange.getOrgId(), merchantId, BooleanUtil.isTrue((Object)originalDataBaseMerchantApplyRange.getIsCreator()));
            if (stopStatus.booleanValue()) {
                userMerchantDetail.setStopstatus(Boolean.valueOf(true));
                userMerchantDetail.setLayoffId((Long)AppContext.getCurrentUser().getId());
                userMerchantDetail.setStoptime(new Date());
            } else {
                userMerchantDetail.setStopstatus(Boolean.valueOf(false));
                userMerchantDetail.setLayoffId(null);
                userMerchantDetail.setStoptime(null);
            }
            MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
            merchantApplyRange.setId((Object)merchantApplyRangeId);
            merchantApplyRange.setIsApplied(Boolean.valueOf(true));
            merchantApplyRange.setMerchantDetailId((String)userMerchantDetail.getId());
            merchantApplyRange.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.insert((String)"aa.merchant.MerchantDetail", (BizObject)userMerchantDetail);
            MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
        } else {
            MerchantDetail originalDataBaseMerchantDetail = originalDataBaseMerchantDetailList.get(0);
            if (stopStatus.booleanValue()) {
                originalDataBaseMerchantDetail.setStopstatus(Boolean.valueOf(true));
                originalDataBaseMerchantDetail.setLayoffId((Long)AppContext.getCurrentUser().getId());
                originalDataBaseMerchantDetail.setStoptime(new Date());
            } else {
                originalDataBaseMerchantDetail.setStopstatus(Boolean.valueOf(false));
                originalDataBaseMerchantDetail.setLayoffId(null);
                originalDataBaseMerchantDetail.setStoptime(null);
            }
            originalDataBaseMerchantDetail.setEntityStatus(EntityStatus.Update);
            MetaDaoHelper.update((String)"aa.merchant.MerchantDetail", (BizObject)originalDataBaseMerchantDetail);
        }
    }

    public MerchantDetail getMerchantDetailForInsert(MerchantApplyRangeDetail merchantApplyRangeDetail, String belongOrgId, Long merchantId, Boolean isCreator) throws Exception {
        MerchantApplyRangeDetail merchantApplyRangeDetailCreator;
        MerchantDetail merchantDetail = new MerchantDetail();
        merchantDetail.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
        merchantDetail.setMerchantId(merchantId);
        merchantDetail.setBelongOrgId(belongOrgId);
        merchantDetail.setIsCreator(isCreator);
        this.copyDataFromRangeToDetail(merchantDetail, merchantApplyRangeDetail);
        if (StringUtils.isEmpty((CharSequence)merchantDetail.getCreator()) && !this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite() && !CollectionUtils.isEmpty((Map)(merchantApplyRangeDetailCreator = this.merchantGroupDao.getApplyRangeDetailCreatorByOrgId(merchantApplyRangeDetail.getMerchantApplyRangeId(), merchantId)))) {
            merchantDetail.setCreator(merchantApplyRangeDetailCreator.getCreator());
        }
        merchantDetail.setEntityStatus(EntityStatus.Insert);
        return merchantDetail;
    }

    public MerchantDetail getMerchantDetailForUpdate(MerchantApplyRangeDetail merchantApplyRangeDetail, String id, String belongOrgId, Long merchantId) {
        MerchantDetail merchantDetail = new MerchantDetail();
        merchantDetail.setId((Object)id);
        merchantDetail.setMerchantId(merchantId);
        if (!StringUtils.isEmpty((CharSequence)belongOrgId)) {
            merchantDetail.setBelongOrgId(belongOrgId);
        }
        this.copyDataFromRangeToDetail(merchantDetail, merchantApplyRangeDetail);
        merchantDetail.setEntityStatus(EntityStatus.Update);
        return merchantDetail;
    }

    public void controlConfigMerchantDetail(MerchantDetail merchantDetail, MerchantApplyRangeDetail merchantApplyRangeDetail, List<DocAttributeControlConfig> docAttributeControlConfigList, EntityStatus status) {
        this.copyDataFromRangeToDetail(merchantDetail, merchantApplyRangeDetail);
        merchantDetail.setEntityStatus(EntityStatus.Update);
        Map<String, String> fieldMap = this.getMerchantDetailFieldByRangeDetail();
        if (!CollectionUtils.isEmpty(docAttributeControlConfigList)) {
            for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                if (status == EntityStatus.Insert) {
                    if (String.valueOf(CarryType.FromDefault.getValue()).equals(docAttributeControlConfig.getCarryType()) && fieldMap.containsKey(docAttributeControlConfig.getAttributeCode())) {
                        merchantDetail.put(fieldMap.get(docAttributeControlConfig.getAttributeCode()), (Object)docAttributeControlConfig.getAttributeDefaultValue());
                        continue;
                    }
                    if (!String.valueOf(CarryType.NotCarry.getValue()).equals(docAttributeControlConfig.getCarryType()) || !fieldMap.containsKey(docAttributeControlConfig.getAttributeCode())) continue;
                    merchantDetail.remove(fieldMap.get(docAttributeControlConfig.getAttributeCode()));
                    continue;
                }
                if (status != EntityStatus.Update || !String.valueOf(ControlType.OwnOrgControl.getValue()).equals(docAttributeControlConfig.getControlType()) || !fieldMap.containsKey(docAttributeControlConfig.getAttributeCode())) continue;
                merchantDetail.remove(fieldMap.get(docAttributeControlConfig.getAttributeCode()));
            }
        }
    }

    public Map<String, String> getMerchantDetailFieldByRangeDetail() {
        HashMap<String, String> fieldMap = new HashMap<String, String>();
        fieldMap.put("searchcode", "searchCode");
        fieldMap.put("customerLevel", "merchantLevelId");
        fieldMap.put("customerType", "merchantTypeId");
        fieldMap.put("deliveryWarehouse", "deliveryWarehouseId");
        fieldMap.put("transactionCurrency", "transactionCurrencyId");
        fieldMap.put("exchangeratetype", "exchangeRateTypeId");
        fieldMap.put("taxRate", "taxRate");
        fieldMap.put("payway", "payWay");
        fieldMap.put("creditServiceDay", "creditServiceDayId");
        fieldMap.put("collectionAgreement", "collectionAgreementId");
        fieldMap.put("settlementMethod", "settlementMethodId");
        fieldMap.put("shipmentMethod", "shipmentMethodId");
        fieldMap.put("isTradeCustomers", "isTradeCustomers");
        return fieldMap;
    }

    public void copyDataFromRangeToDetail(MerchantDetail merchantDetail, MerchantApplyRangeDetail merchantApplyRangeDetail) {
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getSearchcode())) {
            merchantDetail.setSearchCode(merchantApplyRangeDetail.getSearchcode());
        } else if (merchantApplyRangeDetail.containsKey((Object)"searchcode")) {
            merchantDetail.setSearchCode(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getTransactionCurrency())) {
            merchantDetail.setTransactionCurrencyId(merchantApplyRangeDetail.getTransactionCurrency());
        } else if (merchantApplyRangeDetail.containsKey((Object)"transactionCurrency")) {
            merchantDetail.setTransactionCurrencyId(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getTaxRate())) {
            merchantDetail.setTaxRateId(merchantApplyRangeDetail.getTaxRate());
        } else if (merchantApplyRangeDetail.containsKey((Object)"taxRate")) {
            merchantDetail.setTaxRateId(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getDeliveryWarehouse())) {
            merchantDetail.setDeliveryWarehouseId(merchantApplyRangeDetail.getDeliveryWarehouse());
        } else if (merchantApplyRangeDetail.containsKey((Object)"deliveryWarehouse")) {
            merchantDetail.setDeliveryWarehouseId(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getCreditServiceDay())) {
            merchantDetail.setCreditServiceDayId(merchantApplyRangeDetail.getCreditServiceDay());
        } else if (merchantApplyRangeDetail.containsKey((Object)"creditServiceDay")) {
            merchantDetail.setCreditServiceDayId(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getCollectionAgreement())) {
            merchantDetail.setCollectionAgreementId(merchantApplyRangeDetail.getCollectionAgreement());
        } else if (merchantApplyRangeDetail.containsKey((Object)"collectionAgreement")) {
            merchantDetail.setCollectionAgreementId(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getSettlementMethod())) {
            merchantDetail.setSettlementMethodId(merchantApplyRangeDetail.getSettlementMethod());
        } else if (merchantApplyRangeDetail.containsKey((Object)"settlementMethod")) {
            merchantDetail.setSettlementMethodId(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getShipmentMethod())) {
            merchantDetail.setShipmentMethodId(merchantApplyRangeDetail.getShipmentMethod());
        } else if (merchantApplyRangeDetail.containsKey((Object)"shipmentMethod")) {
            merchantDetail.setShipmentMethodId(null);
        }
        if (merchantApplyRangeDetail.getSignBack() != null && !merchantApplyRangeDetail.getSignBack().booleanValue()) {
            merchantDetail.setSignBack(Integer.valueOf(0));
        } else if (merchantApplyRangeDetail.getSignBack() != null && merchantApplyRangeDetail.getSignBack().booleanValue()) {
            merchantDetail.setSignBack(Integer.valueOf(1));
        } else if (merchantApplyRangeDetail.containsKey((Object)"signBack")) {
            merchantDetail.setSignBack(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getCustomerLevel())) {
            merchantDetail.setMerchantLevelId(merchantApplyRangeDetail.getCustomerLevel());
        } else if (merchantApplyRangeDetail.containsKey((Object)"customerLevel")) {
            merchantDetail.setMerchantLevelId(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getExchangeratetype())) {
            merchantDetail.setExchangeRateTypeId(merchantApplyRangeDetail.getExchangeratetype());
        } else if (merchantApplyRangeDetail.containsKey((Object)"exchangeratetype")) {
            merchantDetail.setExchangeRateTypeId(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getPayway())) {
            merchantDetail.setPayWay(merchantApplyRangeDetail.getPayway());
        } else if (merchantApplyRangeDetail.containsKey((Object)"payway")) {
            merchantDetail.setPayWay(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getCustomerType())) {
            merchantDetail.setMerchantTypeId(merchantApplyRangeDetail.getCustomerType());
        } else if (merchantApplyRangeDetail.containsKey((Object)"customerType")) {
            merchantDetail.setMerchantTypeId(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("orgDefaultAddress"))) {
            merchantDetail.setOrgDefaultAddress((String)merchantApplyRangeDetail.get("orgDefaultAddress"));
        } else if (merchantApplyRangeDetail.containsKey((Object)"orgDefaultAddress")) {
            merchantDetail.setOrgDefaultAddress(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getStopstatus())) {
            merchantDetail.setStopstatus(merchantApplyRangeDetail.getStopstatus());
        } else if (merchantApplyRangeDetail.containsKey((Object)"stopstatus")) {
            merchantDetail.setStopstatus(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getStoptime())) {
            merchantDetail.setStoptime(merchantApplyRangeDetail.getStoptime());
        } else if (merchantApplyRangeDetail.containsKey((Object)"stoptime")) {
            merchantDetail.setStoptime(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getCreator())) {
            merchantDetail.setCreator(merchantApplyRangeDetail.getCreator());
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getCreatorId())) {
            merchantDetail.setCreatorId(merchantApplyRangeDetail.getCreatorId());
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getCreateDate())) {
            merchantDetail.setCreateDate(merchantApplyRangeDetail.getCreateDate());
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getCreateTime())) {
            merchantDetail.setCreateTime(merchantApplyRangeDetail.getCreateTime());
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getModifier())) {
            merchantDetail.setModifier(merchantApplyRangeDetail.getModifier());
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getModifierId())) {
            merchantDetail.setModifierId(merchantApplyRangeDetail.getModifierId());
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getModifyDate())) {
            merchantDetail.setModifyDate(merchantApplyRangeDetail.getModifyDate());
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getModifyTime())) {
            merchantDetail.setModifyTime(merchantApplyRangeDetail.getModifyTime());
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("freezingLink"))) {
            merchantDetail.setFreezeLink(merchantApplyRangeDetail.getFreezingLink());
        } else if (merchantApplyRangeDetail.containsKey((Object)"freezingLink")) {
            merchantDetail.setFreezeLink(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("frozenState"))) {
            merchantDetail.setFrozenState(merchantApplyRangeDetail.getFrozenState());
        } else if (merchantApplyRangeDetail.containsKey((Object)"frozenState")) {
            merchantDetail.setFrozenState(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("locker"))) {
            merchantDetail.setLocker(merchantApplyRangeDetail.getLocker());
        } else if (merchantApplyRangeDetail.containsKey((Object)"locker")) {
            merchantDetail.setLocker(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("lockTime"))) {
            merchantDetail.setLockTime(merchantApplyRangeDetail.getLockTime());
        } else if (merchantApplyRangeDetail.containsKey((Object)"lockTime")) {
            merchantDetail.setLockTime(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("lockDate"))) {
            merchantDetail.setLockDate(merchantApplyRangeDetail.getLockDate());
        } else if (merchantApplyRangeDetail.containsKey((Object)"lockDate")) {
            merchantDetail.setLockDate(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("isTradeCustomers"))) {
            merchantDetail.setIsTradeCustomers(merchantApplyRangeDetail.getIsTradeCustomers());
        } else if (merchantApplyRangeDetail.containsKey((Object)"isTradeCustomers")) {
            merchantDetail.setIsTradeCustomers(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("priceMarking"))) {
            merchantDetail.put("priceMarking", (Object)merchantApplyRangeDetail.getPriceMarking());
        } else if (merchantApplyRangeDetail.containsKey((Object)"priceMarking")) {
            merchantDetail.put("priceMarking", null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.getLayoffId())) {
            merchantDetail.setLayoffId(merchantApplyRangeDetail.getLayoffId());
        }
        if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite() && !ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter")) && merchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter") instanceof BizObject) {
            BizObject bizObject = (BizObject)merchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter");
            String newId = String.valueOf(IdManager.getInstance().nextId());
            Object characterDefInDbObj = merchantDetail.get("merchantApplyRangeDetailCharacter");
            if (null != characterDefInDbObj && characterDefInDbObj instanceof BizObject) {
                BizObject characterDefInDb = (BizObject)characterDefInDbObj;
                if (null != characterDefInDb.getId()) {
                    newId = characterDefInDb.getId().toString();
                    bizObject.setEntityStatus(merchantApplyRangeDetail.getEntityStatus());
                }
            } else {
                bizObject.setEntityStatus(EntityStatus.Insert);
            }
            bizObject.setId((Object)newId);
            merchantDetail.set("merchantApplyRangeDetailCharacter", bizObject.getId());
        } else if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite() && !ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter"))) {
            merchantDetail.set("merchantApplyRangeDetailCharacter", merchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter"));
        }
    }

    public MerchantDetail copyMerchantDetail(MerchantDetail merchantDetail, String belongOrgId, Long merchantId, Boolean isCreator) throws Exception {
        MerchantDetail copyMerchantDetail = new MerchantDetail();
        copyMerchantDetail.init((Map)merchantDetail);
        copyMerchantDetail.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
        copyMerchantDetail.setMerchantId(merchantId);
        copyMerchantDetail.setBelongOrgId(belongOrgId);
        copyMerchantDetail.setIsCreator(isCreator);
        if (!ObjectUtils.isEmpty((Object)merchantDetail.get("merchantApplyRangeDetailCharacter")) && merchantDetail.get("merchantApplyRangeDetailCharacter") instanceof BizObject) {
            if (this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                BizObject bizObject = (BizObject)merchantDetail.get("merchantApplyRangeDetailCharacter");
                bizObject.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                bizObject.setEntityStatus(EntityStatus.Insert);
            } else {
                MerchantApplyRangeDetail merchantApplyRangeDetail = this.merchantGroupDao.getApplyRangeDetailCharacterByOrgId(belongOrgId, merchantId);
                if (!CollectionUtils.isEmpty((Map)merchantApplyRangeDetail) && !ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter")) && merchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter") instanceof BizObject) {
                    BizObject bizObject = (BizObject)merchantApplyRangeDetail.get("merchantApplyRangeDetailCharacter");
                    bizObject.setEntityStatus(EntityStatus.Update);
                    copyMerchantDetail.set("merchantApplyRangeDetailCharacter", bizObject.getId());
                } else {
                    BizObject bizObject = (BizObject)merchantDetail.get("merchantApplyRangeDetailCharacter");
                    bizObject.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                    bizObject.setEntityStatus(EntityStatus.Insert);
                }
            }
        }
        copyMerchantDetail.setEntityStatus(EntityStatus.Insert);
        return copyMerchantDetail;
    }

    public MerchantDetailForCRM initMerchantDetailForCRM(MerchantApplyRange merchantApplyRange, MerchantApplyRangeDetail merchantApplyRangeDetail, Long merchantId, String merchantDetailId) {
        MerchantDetailForCRM merchantDetailForCRM = new MerchantDetailForCRM();
        merchantDetailForCRM.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
        merchantDetailForCRM.setMerchantDetailId(merchantDetailId);
        merchantDetailForCRM.setMerchantId(merchantId);
        this.setMerchantDetailForCRM(merchantDetailForCRM, merchantApplyRange, merchantApplyRangeDetail);
        merchantDetailForCRM.setEntityStatus(EntityStatus.Insert);
        return merchantDetailForCRM;
    }

    public MerchantDetailForCRM updateMerchantDetailForCRM(MerchantApplyRange merchantApplyRange, MerchantApplyRangeDetail merchantApplyRangeDetail, String id, Long merchantId, String merchantDetailId) {
        MerchantDetailForCRM merchantDetailForCRM = new MerchantDetailForCRM();
        merchantDetailForCRM.setId((Object)id);
        merchantDetailForCRM.setMerchantDetailId(merchantDetailId);
        merchantDetailForCRM.setMerchantId(merchantId);
        this.setMerchantDetailForCRM(merchantDetailForCRM, merchantApplyRange, merchantApplyRangeDetail);
        merchantDetailForCRM.setEntityStatus(EntityStatus.Update);
        return merchantDetailForCRM;
    }

    public void setMerchantDetailForCRM(MerchantDetailForCRM merchantDetailForCRM, MerchantApplyRange merchantApplyRange, MerchantApplyRangeDetail merchantApplyRangeDetail) {
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("highSeas"))) {
            merchantDetailForCRM.setHighSeas((Long)merchantApplyRangeDetail.get("highSeas"));
        } else if (merchantApplyRangeDetail.containsKey((Object)"highSeas")) {
            merchantDetailForCRM.setHighSeas(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("sourceOfTheHighSeas"))) {
            merchantDetailForCRM.setSourceOfTheHighSeas((Long)merchantApplyRangeDetail.get("sourceOfTheHighSeas"));
        } else if (merchantApplyRangeDetail.containsKey((Object)"sourceOfTheHighSeas")) {
            merchantDetailForCRM.setSourceOfTheHighSeas(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("clue"))) {
            merchantDetailForCRM.setClue((Long)merchantApplyRangeDetail.get("clue"));
        } else if (merchantApplyRangeDetail.containsKey((Object)"clue")) {
            merchantDetailForCRM.setClue(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("applyPerson"))) {
            merchantDetailForCRM.setApplyPerson((String)merchantApplyRangeDetail.get("applyPerson"));
        } else if (merchantApplyRangeDetail.containsKey((Object)"applyPerson")) {
            merchantDetailForCRM.setApplyPerson(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("applyTime"))) {
            merchantDetailForCRM.setApplyTime((Date)merchantApplyRangeDetail.get("applyTime"));
        } else if (merchantApplyRangeDetail.containsKey((Object)"applyTime")) {
            merchantDetailForCRM.setApplyTime(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("applyStatus"))) {
            merchantDetailForCRM.setApplyStatus((Integer)merchantApplyRangeDetail.get("applyStatus"));
        } else if (merchantApplyRangeDetail.containsKey((Object)"applyStatus")) {
            merchantDetailForCRM.setApplyStatus(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("recentFollower"))) {
            merchantDetailForCRM.setRecentFollower((String)merchantApplyRangeDetail.get("recentFollower"));
        } else if (merchantApplyRangeDetail.containsKey((Object)"recentFollower")) {
            merchantDetailForCRM.setRecentFollower(null);
        }
        if (!ObjectUtils.isEmpty((Object)merchantApplyRangeDetail.get("recentFollowContent"))) {
            merchantDetailForCRM.setRecentFollowContent((String)merchantApplyRangeDetail.get("recentFollowContent"));
        } else if (merchantApplyRangeDetail.containsKey((Object)"recentFollowContent")) {
            merchantDetailForCRM.setRecentFollowContent(null);
        }
        if (!CollectionUtils.isEmpty((Map)merchantApplyRange)) {
            if (merchantApplyRange.getIsPotential() != null && !merchantApplyRange.getIsPotential().booleanValue()) {
                merchantDetailForCRM.setIsPotential(Integer.valueOf(0));
            } else if (merchantApplyRange.getIsPotential() != null && merchantApplyRange.getIsPotential().booleanValue()) {
                merchantDetailForCRM.setIsPotential(Integer.valueOf(1));
            } else if (merchantApplyRange.containsKey((Object)"isPotential")) {
                merchantDetailForCRM.setIsPotential(null);
            }
            if (!ObjectUtils.isEmpty((Object)merchantApplyRange.get("positivePeople"))) {
                merchantDetailForCRM.setPositivePeople((String)merchantApplyRange.get("positivePeople"));
            } else if (merchantApplyRange.containsKey((Object)"positivePeople")) {
                merchantDetailForCRM.setPositivePeople(null);
            }
            if (!ObjectUtils.isEmpty((Object)merchantApplyRange.get("positiveTime"))) {
                merchantDetailForCRM.setPositiveTime((Date)merchantApplyRange.get("positiveTime"));
            } else if (merchantApplyRange.containsKey((Object)"positiveTime")) {
                merchantDetailForCRM.setPositiveTime(null);
            }
            if (!ObjectUtils.isEmpty((Object)merchantApplyRange.getRecentlyFollowTime())) {
                merchantDetailForCRM.setRecentlyFollowTime(merchantApplyRange.getRecentlyFollowTime());
            } else if (merchantApplyRange.containsKey((Object)"recentlyFollowTime")) {
                merchantDetailForCRM.setRecentlyFollowTime(null);
            }
            if (!ObjectUtils.isEmpty((Object)merchantApplyRange.getNoFollowTime())) {
                merchantDetailForCRM.setNoFollowTime(merchantApplyRange.getNoFollowTime());
            } else if (merchantApplyRange.containsKey((Object)"noFollowTime")) {
                merchantDetailForCRM.setNoFollowTime(null);
            }
        }
    }

    public MerchantDetailForCRM copyMerchantDetailForCRM(MerchantDetailForCRM merchantDetailForCRM, Long merchantId, String merchantDetailId) {
        MerchantDetailForCRM copyMerchantDetailForCRM = new MerchantDetailForCRM();
        copyMerchantDetailForCRM.init((Map)merchantDetailForCRM);
        copyMerchantDetailForCRM.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
        copyMerchantDetailForCRM.setMerchantDetailId(merchantDetailId);
        copyMerchantDetailForCRM.setMerchantId(merchantId);
        copyMerchantDetailForCRM.setEntityStatus(EntityStatus.Insert);
        return copyMerchantDetailForCRM;
    }

    public void theCompensationMerchantApplyRangeGroup(List<String> yTenantIdList, int capacity) {
        if (CollectionUtils.isEmpty(yTenantIdList)) {
            yTenantIdList = this.merchantGroupDao.getTenantByMerchant();
        }
        if (!CollectionUtils.isEmpty(yTenantIdList)) {
            for (String yTenantId : yTenantIdList) {
                try {
                    RobotExecutors.runAs((String)yTenantId, () -> this.compensationMerchantApplyRangeGroup(yTenantId, capacity), (ExecutorService)this.ymsLongTaskExecutorService);
                }
                catch (Exception e) {
                    this.logger.error("\u5ba2\u6237\u91cd\u6784\u5347\u7ea7\u5931\u8d25,\u79df\u6237\u3010{}\u3011\u5347\u7ea7\u5f02\u5e38\u3002\u65f6\u95f4\u4e3a\u3010{}\u3011,\u5f02\u5e38\u4fe1\u606f\u4e3a\u3010{}\u3011", new Object[]{yTenantId, LocalDateTime.now(), e.getMessage()});
                }
            }
        } else {
            this.logger.error("\u5ba2\u6237\u91cd\u6784,\u67e5\u8be2\u79df\u6237\u6570\u636e\u4e3a\u7a7a\uff01");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void compensationMerchantApplyRangeGroup(String yTenantId, int capacity) {
        if (!StringUtils.isEmpty((CharSequence)yTenantId)) {
            String lockKey = "theCompensationMerchantApplyRangeGroup" + yTenantId;
            int lockOutTime = 86400;
            String lockValue = UUID.randomUUID().toString();
            if (!RedisTool.tryGetLock((String)lockKey, (String)lockValue, (int)lockOutTime)) return;
            try {
                this.merchantGroupDao.deleteMerchantApplyRangeGroupByTenantId(yTenantId);
                List<Merchant> merchantList = this.queryMerchant();
                if (CollectionUtils.isEmpty(merchantList)) return;
                List merchantsList = ListSplitUtil.splitListByCapacity(merchantList, (int)capacity);
                for (List merchants : merchantsList) {
                    this.theCompensationMerchantDetailByMerchant(merchants, yTenantId);
                }
                return;
            }
            catch (Exception e) {
                this.logger.error("\u5ba2\u6237\u91cd\u6784,\u5f02\u5e38\u65e5\u5fd7\uff01{}", (Object)e.getMessage(), (Object)e);
                return;
            }
            finally {
                RedisTool.releaseLock((String)lockKey, (String)lockValue);
            }
        } else {
            this.logger.error("\u5ba2\u6237\u91cd\u6784,\u67e5\u8be2\u79df\u6237\u6570\u636e\u4e3a\u7a7a\uff01");
        }
    }

    public void upgradeRepeatOldRangeData(List<String> yTenantIdList, int capacity) {
        if (CollectionUtils.isEmpty(yTenantIdList)) {
            yTenantIdList = this.merchantGroupDao.getTenantByMerchant();
        }
        if (!CollectionUtils.isEmpty(yTenantIdList)) {
            for (String yTenantId : yTenantIdList) {
                try {
                    RobotExecutors.runAs((String)yTenantId, () -> this.upgradeRepeatOldRangeData(yTenantId, capacity), (ExecutorService)this.ymsLongTaskExecutorService);
                }
                catch (Exception e) {
                    this.logger.error("\u5ba2\u6237dealRepeatOldRangeData\u5347\u7ea7\u5931\u8d25,\u79df\u6237\u3010{}\u3011\u5347\u7ea7\u5f02\u5e38\u3002\u65f6\u95f4\u4e3a\u3010{}\u3011,\u5f02\u5e38\u4fe1\u606f\u4e3a\u3010{}\u3011", new Object[]{yTenantId, LocalDateTime.now(), e.getMessage()});
                }
            }
        } else {
            this.logger.error("\u5ba2\u6237\u91cd\u6784,\u67e5\u8be2\u79df\u6237\u6570\u636e\u4e3a\u7a7a\uff01");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void upgradeRepeatOldRangeData(String yTenantId, int capacity) {
        if (StringUtils.isEmpty((CharSequence)yTenantId)) {
            this.logger.error("\u5ba2\u6237dealRepeatOldRangeData,\u67e5\u8be2\u79df\u6237\u6570\u636e\u4e3a\u7a7a\uff01");
            return;
        }
        String lockKey = "upgradeRepeatOldRangeData" + yTenantId;
        int lockOutTime = 86400;
        String lockValue = UUID.randomUUID().toString();
        if (RedisTool.tryGetLock((String)lockKey, (String)lockValue, (int)lockOutTime)) {
            try {
                List<Merchant> merchantList = this.queryMerchant();
                if (!CollectionUtils.isEmpty(merchantList)) {
                    ArrayList<Long> merchantIdList = new ArrayList<Long>();
                    for (Merchant originalDataBaseMerchant : merchantList) {
                        merchantIdList.add((Long)originalDataBaseMerchant.getId());
                    }
                    List merchantIdsList = ListSplitUtil.splitListByCapacity(merchantIdList, (int)capacity);
                    for (List merchantIds : merchantIdsList) {
                        try {
                            this.dealRepeatOldRangeData(merchantIds, (Long)AppContext.getCurrentUser().getTenant(), yTenantId);
                            this.logger.error("\u5ba2\u6237dealRepeatOldRangeData\u5347\u7ea7\u6210\u529f,\u5f53\u524d\u79df\u6237[{}],\u5ba2\u6237id[{}],\u5b8c\u6210", (Object)yTenantId, (Object)UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)merchantIds));
                        }
                        catch (Exception e) {
                            this.logger.error("\u5ba2\u6237dealRepeatOldRangeData\u5347\u7ea7\u5931\u8d25,\u5f53\u524d\u79df\u6237[{}],\u5ba2\u6237id[{}],\u5f02\u5e38\u4fe1\u606f\u4e3a:[{}];", new Object[]{yTenantId, UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)merchantIds), e.getMessage(), e});
                        }
                    }
                }
            }
            catch (Exception e) {
                this.logger.error("\u5ba2\u6237\u91cd\u6784,\u5f02\u5e38\u65e5\u5fd7\uff01{}", (Object)e.getMessage(), (Object)e);
            }
            finally {
                RedisTool.releaseLock((String)lockKey, (String)lockValue);
            }
        }
    }

    public void theCompensationMerchantDetailByMerchant(List<Merchant> merchantList, String yTenantId) throws Exception {
        if (CollectionUtils.isEmpty(merchantList)) {
            return;
        }
        ArrayList<Long> merchantIdList = new ArrayList<Long>();
        for (Merchant originalDataBaseMerchant : merchantList) {
            merchantIdList.add((Long)originalDataBaseMerchant.getId());
        }
        try {
            this.dealRepeatOldRangeData(merchantIdList, (Long)AppContext.getCurrentUser().getTenant(), yTenantId);
            this.updateDetailIdForMerchantApplyRange(merchantIdList, yTenantId);
            this.logger.error("\u5ba2\u6237\u65b0\u6a21\u578b\u5347\u7ea7\u6210\u529f,\u5f53\u524d\u79df\u6237[{}],\u5ba2\u6237id[{}],\u5b8c\u6210", (Object)yTenantId, (Object)UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString(merchantIdList));
        }
        catch (Exception e) {
            this.logger.error("\u5ba2\u6237\u65b0\u6a21\u578b\u5347\u7ea7\u5931\u8d25,\u5f53\u524d\u79df\u6237[{}],\u5ba2\u6237id[{}],\u5f02\u5e38\u4fe1\u606f\u4e3a:[{}];", new Object[]{yTenantId, UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString(merchantIdList), e.getMessage(), e});
        }
    }

    public void theCompensationMerchantDetailByMerchant(Merchant merchant, String yTenantId) throws Exception {
        ArrayList<Long> merchantIdList = new ArrayList<Long>();
        merchantIdList.add((Long)merchant.getId());
        this.dealRepeatOldRangeData(merchantIdList, (Long)AppContext.getCurrentUser().getTenant(), yTenantId);
        this.updateDetailIdForMerchantApplyRange(merchantIdList, yTenantId);
    }

    public void updateDetailIdForManagementTransfer(Merchant originalMerchant, String targetOrgId, String sourceOrgId) throws Exception {
        Long merchantId = (Long)originalMerchant.getId();
        List<MerchantApplyRange> merchantApplyRange = this.getMerchantApplyRangeByMerchantIdAndOrgId(sourceOrgId, merchantId);
        if (!CollectionUtils.isEmpty(merchantApplyRange)) {
            SQLParameter parameter = new SQLParameter();
            parameter.addParam(merchantApplyRange.get(0).getMerchantDetailId());
            parameter.addParam(AppContext.getCurrentUser().getYTenantId());
            parameter.addParam(targetOrgId);
            parameter.addParam((Object)merchantId);
            this.ymsJdbcApi.update("update merchantapplyrange set merchant_detail_id = ? where ytenant_id = ? and orgId = ? and merchantId = ?;", parameter);
            SQLParameter detailParameter = new SQLParameter();
            detailParameter.addParam(targetOrgId);
            detailParameter.addParam(AppContext.getCurrentUser().getYTenantId());
            detailParameter.addParam(merchantApplyRange.get(0).getMerchantDetailId());
            detailParameter.addParam((Object)merchantId);
            this.ymsJdbcApi.update("update merchant_detail set belong_org_id = ? where ytenant_id = ? and id = ? and merchant_id = ?;", detailParameter);
        }
    }

    public void updateDetailIdForMerchantApplyRange(List<Long> merchantIdList, String yTenantId) throws Exception {
        SQLParameter parameter = new SQLParameter();
        parameter.addParam(yTenantId);
        String merchantIds = StringUtils.join(merchantIdList, (String)",");
        this.ymsJdbcApi.update("INSERT INTO merchant_detail(id,merchant_id, erpCode, belong_org_id, belong_merchant_id, search_code, transaction_currency_id, tax_rate_id, delivery_warehouse_id, credit_service_day_id, collection_agreement_id, settlement_method_id, shipment_method_id, sign_back, merchant_level_id, exchange_rate_type_Id, pay_way, merchant_type_id, org_default_address, merchant_detail_character, stopstatus, stop_time, create_time, create_date, modify_time, modify_date, creator, modifier, creatorId, modifierId, freeze_link, frozen_state, locker, lock_time, lock_Date, tenant_id, ytenant_id,is_trade_customers ,layoff_id ,is_creator ,cPriceMarking)\nselect b.id,a.id,e.erpCode ,b.orgId ,e.cBelongMerchant ,e.searchCode ,e.cTransactionCurrency ,e.iTaxRate ,e.cDeliveryWarehouse ,e.iCreditServiceDay ,e.cCollectionAgreement ,e.cSettlementMethod ,e.iShipmentMethodId ,e.bSignBack ,e.oCustomerLevel_id ,e.cExchangeratetypeId ,e.cPayWay ,e.iCustomerTypeId ,e.orgdefaultaddress ,e.merchant_detail_character ,e.stopstatus ,e.stop_time ,e.create_time ,e.create_date ,e.modify_time ,e.modify_date ,e.creator ,e.modifier ,e.creatorId ,e.modifierId ,e.cFreezingLink ,e.bfrozenstate ,e.locker ,e.lock_time ,e.lock_Date ,e.tenant_id ,e.ytenant_id ,e.is_trade_customers ,e.layoff_id ,b.isCreator ,e.cPriceMarking\nfrom merchant a inner join merchantapplyrange b on a.id = b.merchantId and a.ytenant_id = b.ytenant_id and b.isApplied = 1\ninner join merchantapplyrangedetail e on e.id = a.id and e.merchantApplyRangeId = b.id and a.ytenant_id = e.ytenant_id\nwhere a.ytenant_id = ? and a.id in (" + merchantIds + ");", parameter);
        this.ymsJdbcApi.update("update merchantapplyrange a inner join merchant_detail b on a.merchantId = b.merchant_id and b.is_Creator = 1 and a.ytenant_id = b.ytenant_id set a.merchant_detail_id = b.id where a.isCreator = 1 and a.ytenant_id = ? and a.merchantId in (" + merchantIds + ");", parameter);
        this.ymsJdbcApi.update("update merchantapplyrange a inner join merchant_detail b on a.merchantId = b.merchant_id and b.belong_org_id = a.orgId and b.is_Creator <> 1 and a.ytenant_id = b.ytenant_id set a.merchant_detail_id = b.id where a.isCreator <>1 and a.isApplied = 1 and a.ytenant_id = ? and a.merchantId in (" + merchantIds + ");", parameter);
        if (merchantIdList.size() == 1) {
            List<MerchantApplyRange> creatorMerchantApplyRange = this.getCreatorMerchantApplyRangeById(merchantIdList.get(0));
            if (!CollectionUtils.isEmpty(creatorMerchantApplyRange)) {
                SQLParameter parameterUpdateIsApplied = new SQLParameter();
                parameterUpdateIsApplied.addParam(creatorMerchantApplyRange.get(0).getMerchantDetailId());
                parameterUpdateIsApplied.addParam(yTenantId);
                parameterUpdateIsApplied.addParam((Object)merchantIdList.get(0));
                this.ymsJdbcApi.update("update merchantapplyrange set merchant_detail_id = ? where ytenant_id = ? and isApplied = 0 and merchantId = ?;", parameterUpdateIsApplied);
            }
        } else {
            this.ymsJdbcApi.update("update merchantapplyrange a LEFT JOIN merchantapplyrange b ON a.merchantId = b.merchantId AND b.isCreator = 1 and a.ytenant_id = b.ytenant_id set a.merchant_detail_id = b.merchant_detail_id where a.isApplied = 0 and a.ytenant_id = ? and a.merchantId in (" + merchantIds + ");", parameter);
        }
    }

    public void theCompensationMerchantGroupById(Long merchantId) throws Exception {
        Merchant originalDataBaseMerchant = this.merchantGroupDao.getMerchantById(merchantId);
        if (!CollectionUtils.isEmpty((Map)originalDataBaseMerchant) && !this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
            this.merchantGroupDao.deleteMerchantApplyRangeGroupByMerchantId(AppContext.getCurrentUser().getYTenantId(), merchantId);
            this.theCompensationMerchantDetailByMerchant(originalDataBaseMerchant, AppContext.getCurrentUser().getYTenantId());
        }
    }

    public void dealRepeatOldRangeData(List<Long> merchantIdList, Long tenantId, String yTenantId) throws Exception {
        HashMap<String, Object> queryRangeParamMap = new HashMap<String, Object>();
        queryRangeParamMap.put("ytenant", yTenantId);
        queryRangeParamMap.put("merchantIdList", merchantIdList);
        List repeatOldRange = SqlHelper.selectList((String)"com.yonyoucloud.upc.merchant.dao.merchantGroup.getRepeatMerchantApplyRangeByMerchantIdList", queryRangeParamMap);
        if (CollectionUtils.isEmpty((Collection)repeatOldRange)) {
            return;
        }
        ArrayList<Long> repeatMerchantIdList = new ArrayList<Long>();
        ArrayList<MerchantApplyRange> repeatList = new ArrayList<MerchantApplyRange>();
        ArrayList forDeleteList = new ArrayList();
        HashMap<String, String> repeatOldRangeMap = new HashMap<String, String>();
        for (Object repeatRange : repeatOldRange) {
            repeatOldRangeMap.put(repeatRange.getMerchantId() + repeatRange.getOrgId(), "1");
            if (repeatMerchantIdList.contains(repeatRange.getMerchantId())) continue;
            repeatMerchantIdList.add(repeatRange.getMerchantId());
        }
        List merchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeByMerchantIdList(repeatMerchantIdList);
        for (MerchantApplyRange merchantApplyRange2 : merchantApplyRangeList) {
            if (!repeatOldRangeMap.containsKey(merchantApplyRange2.getMerchantId() + merchantApplyRange2.getOrgId())) continue;
            repeatList.add(merchantApplyRange2);
        }
        Map<String, List<MerchantApplyRange>> repeatMerchantApplyRangeMapList = repeatList.stream().collect(Collectors.groupingBy(merchantApplyRange -> merchantApplyRange.getMerchantId() + merchantApplyRange.getOrgId()));
        Set<Map.Entry<String, List<MerchantApplyRange>>> repeatMerchantApplyRangeMapEntries = repeatMerchantApplyRangeMapList.entrySet();
        for (Map.Entry<String, List<MerchantApplyRange>> entry : repeatMerchantApplyRangeMapEntries) {
            List value = entry.getValue().stream().sorted(Comparator.comparing(MerchantApplyRange::getIsPotential, Comparator.naturalOrder()).thenComparing(BizObject::getPubts, Comparator.reverseOrder())).collect(Collectors.toList());
            value.remove(0);
            forDeleteList.addAll(value);
        }
        ArrayList<Long> forDeleteRangeIdList = new ArrayList<Long>();
        for (MerchantApplyRange merchantApplyRange3 : forDeleteList) {
            forDeleteRangeIdList.add((Long)merchantApplyRange3.getId());
        }
        SQLParameter sQLParameter = new SQLParameter();
        sQLParameter.addParam("-" + yTenantId);
        sQLParameter.addParam(tenantId * -1L);
        sQLParameter.addParam(yTenantId);
        String forDeleteRangeIds = StringUtils.join(forDeleteRangeIdList, (String)",");
        String forDeleteMerchantIds = StringUtils.join(repeatMerchantIdList, (String)",");
        this.ymsJdbcApi.update("update merchantapplyrange set ytenant_id = ?,tenant_id = ? where ytenant_id = ? and id in (" + forDeleteRangeIds + ");", sQLParameter);
        this.ymsJdbcApi.update("update merchantapplyrangedetail set ytenant_id = ?,tenant_id = ? where ytenant_id = ? and merchantApplyRangeId in (" + forDeleteRangeIds + ");", sQLParameter);
        this.ymsJdbcApi.update("update customerarea set ytenant_id = ?,tenant_id = ? where ytenant_id = ? and imerchantId in (" + forDeleteMerchantIds + ") and merchantApplyRangeId in (" + forDeleteRangeIds + ");", sQLParameter);
        this.ymsJdbcApi.update("update principal set ytenant_id = ?,tenant_id = ? where ytenant_id = ? and imerchantId in (" + forDeleteMerchantIds + ") and merchantApplyRangeId in (" + forDeleteRangeIds + ");", sQLParameter);
        this.ymsJdbcApi.update("update invoicingcustomers set ytenant_id = ?,tenant_id = ? where ytenant_id = ? and imerchantId in (" + forDeleteMerchantIds + ") and merchantApplyRangeId in (" + forDeleteRangeIds + ");", sQLParameter);
    }

    public void upgradeMerchantDetailForCrm(List<String> yTenantIdList) {
        if (CollectionUtils.isEmpty(yTenantIdList)) {
            yTenantIdList = this.merchantGroupDao.getTenantByMerchant();
        }
        if (!CollectionUtils.isEmpty(yTenantIdList)) {
            for (String yTenantId : yTenantIdList) {
                try {
                    RobotExecutors.runAs((String)yTenantId, () -> this.upgradeMerchantDetailForCrm(yTenantId), (ExecutorService)this.ymsLongTaskExecutorService);
                }
                catch (Exception e) {
                    this.logger.error("\u5ba2\u6237\u91cd\u6784MerchantDetailForCrm\u5347\u7ea7\u5931\u8d25,\u79df\u6237\u3010{}\u3011\u5347\u7ea7\u5f02\u5e38\u3002\u65f6\u95f4\u4e3a\u3010{}\u3011,\u5f02\u5e38\u4fe1\u606f\u4e3a\u3010{}\u3011", new Object[]{yTenantId, LocalDateTime.now(), e.getMessage()});
                }
            }
        } else {
            this.logger.error("\u5ba2\u6237\u91cd\u6784MerchantDetailForCrm,\u67e5\u8be2\u79df\u6237\u6570\u636e\u4e3a\u7a7a\uff01");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void upgradeMerchantDetailForCrm(String yTenantId) {
        if (!StringUtils.isEmpty((CharSequence)yTenantId)) {
            String lockKey = "upgradeMerchantDetailForCrm" + yTenantId;
            int lockOutTime = 86400;
            String lockValue = UUID.randomUUID().toString();
            if (!RedisTool.tryGetLock((String)lockKey, (String)lockValue, (int)lockOutTime)) return;
            try {
                List<Merchant> merchantList = this.queryMerchant();
                if (CollectionUtils.isEmpty(merchantList)) return;
                ArrayList<Long> merchantIdList = new ArrayList<Long>();
                for (Merchant originalDataBaseMerchant : merchantList) {
                    merchantIdList.add((Long)originalDataBaseMerchant.getId());
                }
                List merchantIdsList = ListSplitUtil.splitListByCapacity(merchantIdList, (int)50);
                for (List merchantIds : merchantIdsList) {
                    this.upgradeMerchantDetailForCrm(merchantIds, yTenantId);
                    this.logger.error("\u5ba2\u6237\u65b0\u6a21\u578bMerchantDetailForCrm\u5347\u7ea7\u6210\u529f,\u5f53\u524d\u79df\u6237[{}],\u5ba2\u6237id[{}],\u5b8c\u6210", (Object)yTenantId, (Object)UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)merchantIds));
                }
                return;
            }
            catch (Exception e) {
                this.logger.error("\u5ba2\u6237\u91cd\u6784MerchantDetailForCrm,\u5f02\u5e38\u65e5\u5fd7\uff01{}", (Object)e.getMessage(), (Object)e);
                return;
            }
            finally {
                RedisTool.releaseLock((String)lockKey, (String)lockValue);
            }
        } else {
            this.logger.error("\u5ba2\u6237\u91cd\u6784MerchantDetailForCrm,\u67e5\u8be2\u79df\u6237\u6570\u636e\u4e3a\u7a7a\uff01");
        }
    }

    public void upgradeMerchantDetailForCrm(List<Long> merchantIdList, String yTenantId) {
        SQLParameter parameter = new SQLParameter();
        parameter.addParam(yTenantId);
        String merchantIds = StringUtils.join(merchantIdList, (String)",");
        this.ymsJdbcApi.update("delete from merchant_detail_for_crm where ytenant_id = ? and merchant_id in (" + merchantIds + ");", parameter);
        this.ymsJdbcApi.update("INSERT INTO merchant_detail_for_crm(id,merchant_id, high_seas_id, source_of_the_high_seas_id, clue_id, apply_person, apply_time, apply_status, recent_follower, recent_follow_content, is_potential, positive_people, positive_time, recently_follow_time, no_follow_time,tenant_id, ytenant_id,merchant_apply_range_id,belong_org_id)\nselect b.id,a.id ,e.highSeas ,e.sourceOfTheHighSeas ,e.clueId ,e.apply_person ,e.apply_time ,e.apply_status ,e.recent_follower ,e.recent_follow_content ,b.ispotential ,b.positivePeople ,b.positiveTime ,b.recentlyFollowTime ,b.noFollowTime ,b.tenant_id ,b.ytenant_id ,b.id,b.orgId\nfrom merchant a inner join merchantapplyrange b on a.id = b.merchantId and a.ytenant_id = b.ytenant_id\nleft join merchantapplyrangedetail e on e.id = a.id and e.merchantApplyRangeId = b.id and a.ytenant_id = e.ytenant_id\nwhere a.ytenant_id = ? and a.id in (" + merchantIds + ");", parameter);
    }

    public void setMerchantApplyRangeGroup(MerchantApplyRange merchantApplyRange, Long merchantApplyRangeId, Long merchantId) throws Exception {
        List<MerchantApplyRange> originalDataBaseMerchantApplyRangeList = this.getMerchantApplyRangeById(merchantApplyRangeId, merchantId);
        if (CollectionUtils.isEmpty(originalDataBaseMerchantApplyRangeList) || StringUtils.isEmpty((CharSequence)originalDataBaseMerchantApplyRangeList.get(0).getMerchantDetailId())) {
            return;
        }
        MerchantApplyRange originalDataBaseMerchantApplyRange = originalDataBaseMerchantApplyRangeList.get(0);
        List<MerchantDetail> originalDataBaseMerchantDetailList = this.getMerchantDetailByBelongOrgId(originalDataBaseMerchantApplyRange.getOrgId(), merchantId);
        if (CollectionUtils.isEmpty(originalDataBaseMerchantDetailList)) {
            List newOriginalDataBaseMerchantDetailList = this.merchantGroupDao.getMerchantDetailById(originalDataBaseMerchantApplyRange.getMerchantDetailId(), merchantId);
            MerchantDetail userMerchantDetail = this.copyMerchantDetail((MerchantDetail)newOriginalDataBaseMerchantDetailList.get(0), originalDataBaseMerchantApplyRange.getOrgId(), merchantId, BooleanUtil.isTrue((Object)originalDataBaseMerchantApplyRange.getIsCreator()));
            merchantApplyRange.setMerchantDetailId((String)userMerchantDetail.getId());
            MetaDaoHelper.insert((String)"aa.merchant.MerchantDetail", (BizObject)userMerchantDetail);
        } else {
            MerchantDetail originalDataBaseMerchantDetail = originalDataBaseMerchantDetailList.get(0);
            merchantApplyRange.setMerchantDetailId((String)originalDataBaseMerchantDetail.getId());
        }
    }

    public Map<String, List<DocAttributeControlConfig>> getDocAttributeControlConfig(DocAttributeControlConfigDTO docAttributeControlConfigDTO) {
        List docAttributeControlConfigList;
        HashMap<String, List<DocAttributeControlConfig>> docAttributeControlConfigMap = new HashMap<String, List<DocAttributeControlConfig>>();
        if (!ObjectUtils.isEmpty((Object)docAttributeControlConfigDTO) && !CollectionUtils.isEmpty((Collection)(docAttributeControlConfigList = docAttributeControlConfigDTO.getDocAttributeControlConfigList()))) {
            for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                List<DocAttributeControlConfig> newDocAttributeControlConfigList;
                if (docAttributeControlConfigMap.containsKey(docAttributeControlConfig.getEntityUri())) {
                    newDocAttributeControlConfigList = (List)docAttributeControlConfigMap.get(docAttributeControlConfig.getEntityUri());
                    newDocAttributeControlConfigList.add(docAttributeControlConfig);
                    docAttributeControlConfigMap.put(docAttributeControlConfig.getEntityUri(), newDocAttributeControlConfigList);
                    continue;
                }
                newDocAttributeControlConfigList = new ArrayList<DocAttributeControlConfig>();
                newDocAttributeControlConfigList.add(docAttributeControlConfig);
                docAttributeControlConfigMap.put(docAttributeControlConfig.getEntityUri(), newDocAttributeControlConfigList);
            }
        }
        return docAttributeControlConfigMap;
    }

    public boolean getIsExistControlType(DocAttributeControlConfigDTO docAttributeControlConfigDTO) {
        List docAttributeControlConfigList;
        boolean isExistControlType = false;
        if (!ObjectUtils.isEmpty((Object)docAttributeControlConfigDTO) && !CollectionUtils.isEmpty((Collection)(docAttributeControlConfigList = docAttributeControlConfigDTO.getDocAttributeControlConfigList()))) {
            for (DocAttributeControlConfig docAttributeControlConfig : docAttributeControlConfigList) {
                if (!String.valueOf(ControlType.ManageOrgControl.getValue()).equals(docAttributeControlConfig.getControlType())) continue;
                isExistControlType = true;
            }
        }
        return isExistControlType;
    }

    public List<MerchantDetail> getMerchantDetailByBelongOrgId(String belongOrgId, Long merchantId) throws Exception {
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"belongOrgId").eq((Object)belongOrgId), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect("id,merchantApplyRangeGroupId").addCondition((ConditionExpression)condition);
        List merchantDetailList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantDetail", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)merchantDetailList)) {
            return null;
        }
        return merchantDetailList;
    }

    public List<MerchantDetailForCRM> getMerchantDetailForCRMByMerchantDetailId(String merchantDetailId, Long merchantId) throws Exception {
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantDetailId").eq((Object)merchantDetailId), QueryCondition.name((String)"merchantId").eq((Object)merchantId)});
        QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
        List merchantDetailForCRMList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantDetailForCRM", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)merchantDetailForCRMList)) {
            return null;
        }
        return merchantDetailForCRMList;
    }

    public List<MerchantApplyRange> getMerchantApplyRangeById(Long merchantApplyRangeId, Long merchantId) throws Exception {
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantApplyRangeId), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schema = QuerySchema.create().addSelect("id,orgId,merchantId,isCreator,isApplied,merchantDetailId,shop").addCondition((ConditionExpression)condition);
        schema.setPartitionable(false);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            return null;
        }
        return merchantApplyRangeList;
    }

    public List<MerchantApplyRange> getCreatorMerchantApplyRangeById(Long merchantId) throws Exception {
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isCreator").eq((Object)true), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schema = QuerySchema.create().addSelect("id,orgId,merchantId,isCreator,isApplied,merchantDetailId").addCondition((ConditionExpression)condition);
        schema.setPartitionable(false);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            return null;
        }
        return merchantApplyRangeList;
    }

    public List<MerchantApplyRange> getMerchantApplyRangeByMerchantIdAndOrgId(String orgId, Long merchantId) throws Exception {
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"orgId").eq((Object)orgId), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schema = QuerySchema.create().addSelect("id,isPotential,merchantDetailId").addCondition((ConditionExpression)condition);
        schema.setPartitionable(false);
        List merchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)merchantApplyRangeList)) {
            return null;
        }
        return merchantApplyRangeList;
    }

    public List<MerchantApplyRange> getMerchantApplyRangeListByControlRuleVersion(Long merchantId, Integer controlRuleVersion) throws Exception {
        if (merchantId != null) {
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id,isApplied,orgId,merchantDetailId");
            QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"isCreator").eq((Object)false), QueryCondition.name((String)"isApplied").eq((Object)false), QueryCondition.name((String)"merchantId").eq((Object)merchantId), QueryCondition.name((String)"isPotential").eq((Object)false), QueryCondition.name((String)"controlRuleVersion").eq((Object)controlRuleVersion)});
            querySchema.addCondition((ConditionExpression)queryConditionGroup);
            List originalMerchantApplyRangeList = MetaDaoHelper.queryObject((String)"aa.merchant.MerchantApplyRange", (QuerySchema)querySchema, null);
            if (!CollectionUtils.isEmpty((Collection)originalMerchantApplyRangeList)) {
                return originalMerchantApplyRangeList;
            }
        }
        return null;
    }

    public Merchant getMerchantCreateOrgById(Long merchantId) throws Exception {
        QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)merchantId), QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        QuerySchema schema = QuerySchema.create().addSelect("createOrg").addCondition((ConditionExpression)condition);
        List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)schema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantList)) {
            return (Merchant)merchantList.get(0);
        }
        return new Merchant();
    }

    public List<Merchant> queryMerchant() throws Exception {
        Long currentRangeId = 0L;
        int realMaxRowsValue = this.ymsParamConfig.getResultMaxRowsValue() - 1;
        List<Merchant> merchantList = this.queryMerchantByMinId(currentRangeId, realMaxRowsValue);
        ArrayList<Merchant> merchants = new ArrayList<Merchant>(merchantList);
        while (merchantList.size() >= realMaxRowsValue) {
            currentRangeId = (Long)merchantList.get(merchantList.size() - 1).getId();
            merchantList = this.queryMerchantByMinId(currentRangeId, realMaxRowsValue);
            merchants.addAll(merchantList);
        }
        if (!CollectionUtils.isEmpty(merchants)) {
            return merchants;
        }
        return null;
    }

    public List<Merchant> queryMerchantByMinId(Long minId, int realMaxRowsValue) throws Exception {
        QueryConditionGroup conditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").gt((Object)minId)});
        QuerySchema querySchema = QuerySchema.create().addSelect("id,createOrg").addCondition((ConditionExpression)conditionGroup);
        querySchema.addOrderBy("id");
        QueryPager queryPager = new QueryPager();
        queryPager.setPageIndex(1);
        queryPager.setPageSize(realMaxRowsValue);
        querySchema.pager(queryPager);
        List merchantList = MetaDaoHelper.queryObject((String)"aa.merchant.Merchant", (QuerySchema)querySchema, null);
        if (!CollectionUtils.isEmpty((Collection)merchantList)) {
            return merchantList;
        }
        return new ArrayList<Merchant>();
    }
}

