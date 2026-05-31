/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.api.IMerchantApplyRangeGroupService
 *  com.yonyoucloud.iuap.upc.dto.merchantgroupdto.ContactCrmDto
 *  com.yonyoucloud.iuap.upc.dto.merchantgroupdto.CustomerAreaCrmDto
 *  com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantAggregationCrmDto
 *  com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantApplyRangeGroupCrmDto
 *  com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantDetailCrmDto
 *  com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantDetailRecentCrmDto
 *  com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantGroupCrmDto
 *  com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MultilingualDto
 *  com.yonyoucloud.iuap.upc.dto.merchantgroupdto.PrincipalCrmDto
 *  com.yonyoucloud.upc.aa.merchant.Contacter
 *  com.yonyoucloud.upc.aa.merchant.CustomerArea
 *  com.yonyoucloud.upc.aa.merchant.FrozenState
 *  com.yonyoucloud.upc.aa.merchant.GenderType
 *  com.yonyoucloud.upc.aa.merchant.Merchant
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRange
 *  com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail
 *  com.yonyoucloud.upc.aa.merchant.MerchantDetail
 *  com.yonyoucloud.upc.aa.merchant.Principal
 *  com.yonyoucloud.upc.aa.merchant.StopStatusChar
 *  com.yonyoucloud.upc.aa.merchant.VerifyingState
 *  com.yonyoucloud.upc.data.merchant.MerchantGroupDao
 *  com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil
 *  com.yonyoucloud.upc.utils.MerchantUtils
 *  org.apache.commons.lang3.StringUtils
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

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.api.IMerchantApplyRangeGroupService;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.ContactCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.CustomerAreaCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantAggregationCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantApplyRangeGroupCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantDetailCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantDetailRecentCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MerchantGroupCrmDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.MultilingualDto;
import com.yonyoucloud.iuap.upc.dto.merchantgroupdto.PrincipalCrmDto;
import com.yonyoucloud.upc.aa.merchant.Contacter;
import com.yonyoucloud.upc.aa.merchant.CustomerArea;
import com.yonyoucloud.upc.aa.merchant.FrozenState;
import com.yonyoucloud.upc.aa.merchant.GenderType;
import com.yonyoucloud.upc.aa.merchant.Merchant;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRange;
import com.yonyoucloud.upc.aa.merchant.MerchantApplyRangeDetail;
import com.yonyoucloud.upc.aa.merchant.MerchantDetail;
import com.yonyoucloud.upc.aa.merchant.Principal;
import com.yonyoucloud.upc.aa.merchant.StopStatusChar;
import com.yonyoucloud.upc.aa.merchant.VerifyingState;
import com.yonyoucloud.upc.data.merchant.MerchantGroupDao;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.merchantapplyrangegroup.MerchantGroupService;
import com.yonyoucloud.upc.service.utils.PubOptionDataQueryUtil;
import com.yonyoucloud.upc.utils.MerchantUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
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

@Service
@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public class MerchantApplyRangeGroupServiceImpl
implements IMerchantApplyRangeGroupService {
    private static final Logger log = LoggerFactory.getLogger(MerchantApplyRangeGroupServiceImpl.class);
    private Logger logger = LoggerFactory.getLogger(MerchantApplyRangeGroupServiceImpl.class);
    @Autowired
    private MerchantGroupDao merchantGroupDao;
    @Autowired
    private MerchantGroupService merchantGroupService;
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private PubOptionDataQueryUtil pubOptionDataQueryUtil;

    public void merchantAggregation(MerchantAggregationCrmDto merchantAggregationCrmDto, Map<String, List<CustomerAreaCrmDto>> customerAreaCrmDtoMap, Map<String, List<PrincipalCrmDto>> principalCrmDtoMap, List<MerchantDetailCrmDto> merchantDetailCrmDtoList) throws Exception {
        this.setMerchantAggregationCrmDto(merchantAggregationCrmDto);
        if (!CollectionUtils.isEmpty((Collection)customerAreaCrmDtoMap.get("insert"))) {
            this.batchInsertCustomerArea(customerAreaCrmDtoMap.get("insert"));
        }
        if (!CollectionUtils.isEmpty((Collection)customerAreaCrmDtoMap.get("update"))) {
            this.batchUpdateCustomerArea(customerAreaCrmDtoMap.get("update"));
        }
        if (!CollectionUtils.isEmpty((Collection)customerAreaCrmDtoMap.get("delete"))) {
            this.batchDeleteCustomerArea(customerAreaCrmDtoMap.get("delete"));
        }
        if (!CollectionUtils.isEmpty((Collection)principalCrmDtoMap.get("insert"))) {
            this.batchInsertPrincipal(principalCrmDtoMap.get("insert"));
        }
        if (!CollectionUtils.isEmpty((Collection)principalCrmDtoMap.get("update"))) {
            this.batchUpdatePrincipal(principalCrmDtoMap.get("update"));
        }
        if (!CollectionUtils.isEmpty((Collection)principalCrmDtoMap.get("delete"))) {
            this.batchDeletePrincipal(principalCrmDtoMap.get("delete"));
        }
        if (!CollectionUtils.isEmpty(merchantDetailCrmDtoList)) {
            this.batchUpdateMerchantApplyRangeDetail(merchantDetailCrmDtoList);
        }
    }

    public void merchantAggregation(List<MerchantAggregationCrmDto> merchantAggregationCrmDtoList, Map<String, List<CustomerAreaCrmDto>> customerAreaCrmDtoMap, Map<String, List<PrincipalCrmDto>> principalCrmDtoMap, List<MerchantDetailCrmDto> merchantDetailCrmDtoList) throws Exception {
        if (!CollectionUtils.isEmpty(merchantAggregationCrmDtoList)) {
            this.batchSetMerchantAggregationCrmDto(merchantAggregationCrmDtoList);
        }
        if (!CollectionUtils.isEmpty((Collection)customerAreaCrmDtoMap.get("insert"))) {
            this.batchInsertCustomerArea(customerAreaCrmDtoMap.get("insert"));
        }
        if (!CollectionUtils.isEmpty((Collection)customerAreaCrmDtoMap.get("update"))) {
            this.batchUpdateCustomerArea(customerAreaCrmDtoMap.get("update"));
        }
        if (!CollectionUtils.isEmpty((Collection)customerAreaCrmDtoMap.get("delete"))) {
            this.batchDeleteCustomerArea(customerAreaCrmDtoMap.get("delete"));
        }
        if (!CollectionUtils.isEmpty((Collection)principalCrmDtoMap.get("insert"))) {
            this.batchInsertPrincipal(principalCrmDtoMap.get("insert"));
        }
        if (!CollectionUtils.isEmpty((Collection)principalCrmDtoMap.get("update"))) {
            this.batchUpdatePrincipal(principalCrmDtoMap.get("update"));
        }
        if (!CollectionUtils.isEmpty((Collection)principalCrmDtoMap.get("delete"))) {
            this.batchDeletePrincipal(principalCrmDtoMap.get("delete"));
        }
        if (!CollectionUtils.isEmpty(merchantDetailCrmDtoList)) {
            this.batchUpdateMerchantApplyRangeDetail(merchantDetailCrmDtoList);
        }
    }

    public void batchSetMerchantAggregationCrmDto(List<MerchantAggregationCrmDto> merchantAggregationCrmDtoList) throws Exception {
        if (!CollectionUtils.isEmpty(merchantAggregationCrmDtoList)) {
            if (merchantAggregationCrmDtoList.size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
            }
            for (MerchantAggregationCrmDto merchantAggregationCrmDto : merchantAggregationCrmDtoList) {
                this.setMerchantAggregationCrmDto(merchantAggregationCrmDto);
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
        }
    }

    public void setMerchantAggregationCrmDto(MerchantAggregationCrmDto merchantAggregationCrmDto) throws Exception {
        if (merchantAggregationCrmDto.getMerchantId() != null) {
            List<MerchantApplyRange> merchantApplyRangeList;
            List<MerchantApplyRange> merchantApplyRangeOldList;
            boolean isPotential = false;
            if (merchantAggregationCrmDto.getOldOrgId() != null && !CollectionUtils.isEmpty(merchantApplyRangeOldList = this.merchantGroupService.getMerchantApplyRangeByMerchantIdAndOrgId(merchantAggregationCrmDto.getOldOrgId(), merchantAggregationCrmDto.getMerchantId()))) {
                isPotential = merchantApplyRangeOldList.get(0).getIsPotential();
                if (merchantAggregationCrmDto.getOldOrgStop() != null) {
                    MerchantDetailCrmDto merchantDetailCrmDto = new MerchantDetailCrmDto();
                    merchantDetailCrmDto.setMerchantApplyRangeId((Long)merchantApplyRangeOldList.get(0).getId());
                    merchantDetailCrmDto.setStopStatus(merchantAggregationCrmDto.getOldOrgStop());
                    this.updateMerchantApplyRangeDetail(merchantDetailCrmDto);
                }
            }
            if (merchantAggregationCrmDto.getNewOrgId() != null && CollectionUtils.isEmpty(merchantApplyRangeList = this.merchantGroupService.getMerchantApplyRangeByMerchantIdAndOrgId(merchantAggregationCrmDto.getNewOrgId(), merchantAggregationCrmDto.getMerchantId()))) {
                MerchantApplyRange merchantApplyRange = MerchantUtils.getMerchantApplyRange((Long)merchantAggregationCrmDto.getMerchantId(), (Integer)1, (String)merchantAggregationCrmDto.getNewOrgId());
                merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                merchantApplyRange.setIsPotential(Boolean.valueOf(isPotential));
                ArrayList<MerchantApplyRange> merchantApplyRangeOrgFuncList = new ArrayList<MerchantApplyRange>();
                merchantApplyRangeOrgFuncList.add(merchantApplyRange);
                this.merchantService.setMerchantApplyRangeOrgFunc(merchantApplyRangeOrgFuncList);
                MerchantApplyRangeDetail merchantApplyRangeDetail = MerchantUtils.getMerchantApplyRangeDetail((Long)merchantAggregationCrmDto.getMerchantId(), (Long)((Long)merchantApplyRange.getId()), (String)merchantAggregationCrmDto.getNewOrgId(), (Boolean)false, null, null, null);
                merchantApplyRangeDetail.setCreateTime(new Date());
                merchantApplyRangeDetail.setCreateDate(new Date());
                merchantApplyRangeDetail.setCreator(AppContext.getCurrentUser().getName());
                merchantApplyRangeDetail.setCustomerArea(merchantAggregationCrmDto.getNewSaleAreaId());
                merchantApplyRangeDetail.setSpecialManagementDep(merchantAggregationCrmDto.getNewSpecialManagementDepId());
                merchantApplyRangeDetail.setProfessSalesman(merchantAggregationCrmDto.getNewProfessSalesmanId());
                this.setCrmSaveMerchantApplyRangeGroup(merchantApplyRange, merchantApplyRangeDetail);
                MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
                if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    MetaDaoHelper.insert((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                }
                if (merchantAggregationCrmDto.getNewSaleAreaId() != null) {
                    CustomerAreaCrmDto customerAreaCrmDto = new CustomerAreaCrmDto();
                    customerAreaCrmDto.setMerchantApplyRangeId(merchantApplyRangeDetail.getMerchantApplyRangeId());
                    customerAreaCrmDto.setMerchantId(merchantAggregationCrmDto.getMerchantId());
                    customerAreaCrmDto.setSaleAreaId(merchantAggregationCrmDto.getNewSaleAreaId());
                    customerAreaCrmDto.setIsDefault(Boolean.valueOf(true));
                    this.insertCustomerArea(customerAreaCrmDto);
                }
                if (merchantAggregationCrmDto.getNewSpecialManagementDepId() != null || merchantAggregationCrmDto.getNewProfessSalesmanId() != null) {
                    PrincipalCrmDto principalCrmDto = new PrincipalCrmDto();
                    principalCrmDto.setMerchantApplyRangeId(merchantApplyRangeDetail.getMerchantApplyRangeId());
                    principalCrmDto.setMerchantId(merchantAggregationCrmDto.getMerchantId());
                    principalCrmDto.setSpecialManagementDep(merchantAggregationCrmDto.getNewSpecialManagementDepId());
                    principalCrmDto.setProfessSalesman(merchantAggregationCrmDto.getNewProfessSalesmanId());
                    principalCrmDto.setIsDefault(Boolean.valueOf(true));
                    this.insertPrincipal(principalCrmDto);
                }
            }
        }
    }

    public void updateMerchant(MerchantGroupCrmDto merchantGroupCrmDto) throws Exception {
        if (merchantGroupCrmDto.getId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800933);
        }
        Merchant merchant = this.getMerchantByMerchantGroupDto(merchantGroupCrmDto);
        if (!StringUtils.isEmpty((CharSequence)merchantGroupCrmDto.getSearchCode())) {
            List merchantApplyRangeDetailList;
            List merchantDetailList = this.merchantGroupDao.getMerchantDetailIdByMerchantId(merchantGroupCrmDto.getId());
            if (!CollectionUtils.isEmpty((Collection)merchantDetailList)) {
                for (MerchantDetail merchantDetail : merchantDetailList) {
                    merchantDetail.setSearchCode(merchantGroupCrmDto.getSearchCode());
                    merchantDetail.setEntityStatus(EntityStatus.Update);
                }
                MetaDaoHelper.update((String)"aa.merchant.MerchantDetail", (List)merchantDetailList);
            }
            if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite() && !CollectionUtils.isEmpty((Collection)(merchantApplyRangeDetailList = this.merchantGroupDao.getMerchantApplyRangeDetailIdByMerchantId(merchantGroupCrmDto.getId())))) {
                for (MerchantApplyRangeDetail merchantApplyRangeDetail : merchantApplyRangeDetailList) {
                    merchantApplyRangeDetail.setSearchcode(merchantGroupCrmDto.getSearchCode());
                    merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                }
                merchant.setMerchantAppliedDetail(merchantApplyRangeDetailList);
            }
        }
        MetaDaoHelper.update((String)"aa.merchant.Merchant", (BizObject)merchant);
    }

    public void batchUpdateMerchant(List<MerchantGroupCrmDto> merchantGroupCrmDtoList) throws Exception {
        if (!CollectionUtils.isEmpty(merchantGroupCrmDtoList)) {
            if (merchantGroupCrmDtoList.size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
            }
            for (MerchantGroupCrmDto merchantGroupCrmDto : merchantGroupCrmDtoList) {
                this.updateMerchant(merchantGroupCrmDto);
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
        }
    }

    public void updateMerchantApplyRange(MerchantApplyRangeGroupCrmDto merchantApplyRangeGroupCrmDto) throws Exception {
        if (merchantApplyRangeGroupCrmDto.getId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801195);
        }
        HashSet blankSet = merchantApplyRangeGroupCrmDto.getBlankSet();
        MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
        merchantApplyRange.setId((Object)merchantApplyRangeGroupCrmDto.getId());
        merchantApplyRange.setIsApplied(Boolean.valueOf(false));
        boolean isValue = false;
        if (merchantApplyRangeGroupCrmDto.getRecentlyFollowTime() != null) {
            isValue = true;
            merchantApplyRange.setRecentlyFollowTime(merchantApplyRangeGroupCrmDto.getRecentlyFollowTime());
        } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("recentlyFollowTime")) {
            isValue = true;
            merchantApplyRange.setRecentlyFollowTime(null);
        }
        if (merchantApplyRangeGroupCrmDto.getPotential() != null) {
            isValue = true;
            merchantApplyRange.setIsPotential(merchantApplyRangeGroupCrmDto.getPotential());
        }
        if (!isValue) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801196);
        }
        merchantApplyRange.setEntityStatus(EntityStatus.Update);
        MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
    }

    public void batchUpdateMerchantApplyRange(List<MerchantApplyRangeGroupCrmDto> merchantApplyRangeGroupCrmDtoList) throws Exception {
        if (!CollectionUtils.isEmpty(merchantApplyRangeGroupCrmDtoList)) {
            if (merchantApplyRangeGroupCrmDtoList.size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
            }
            for (MerchantApplyRangeGroupCrmDto merchantApplyRangeGroupCrmDto : merchantApplyRangeGroupCrmDtoList) {
                this.updateMerchantApplyRange(merchantApplyRangeGroupCrmDto);
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
        }
    }

    public void updateMerchantApplyRangeDetail(MerchantDetailCrmDto merchantDetailCrmDto) throws Exception {
        if (merchantDetailCrmDto.getMerchantApplyRangeId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801197);
        }
        MerchantApplyRangeDetail merchantApplyRangeDetail = this.getMerchantApplyRangeDetailByMerchantDetailCrmDto(merchantDetailCrmDto);
        MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
        merchantApplyRange.setId((Object)merchantDetailCrmDto.getMerchantApplyRangeId());
        merchantApplyRange.setIsApplied(Boolean.valueOf(true));
        merchantApplyRange.setEntityStatus(EntityStatus.Update);
        List newOriginalDataBaseMerchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeById(merchantDetailCrmDto.getMerchantApplyRangeId());
        if (!CollectionUtils.isEmpty((Collection)newOriginalDataBaseMerchantApplyRangeList)) {
            MerchantApplyRange newOriginalDataBaseMerchantApplyRange = (MerchantApplyRange)newOriginalDataBaseMerchantApplyRangeList.get(0);
            this.setCrmSaveMerchantApplyRangeGroup(newOriginalDataBaseMerchantApplyRange, merchantApplyRangeDetail);
            merchantApplyRange.setMerchantDetailId(newOriginalDataBaseMerchantApplyRange.getMerchantDetailId());
        }
        MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
        if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
            MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
        }
    }

    public void batchUpdateMerchantApplyRangeDetail(List<MerchantDetailCrmDto> merchantDetailCrmDtoList) throws Exception {
        if (!CollectionUtils.isEmpty(merchantDetailCrmDtoList)) {
            if (merchantDetailCrmDtoList.size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
            }
            for (MerchantDetailCrmDto merchantDetailCrmDto : merchantDetailCrmDtoList) {
                this.updateMerchantApplyRangeDetail(merchantDetailCrmDto);
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
        }
    }

    public void insertCustomerArea(CustomerAreaCrmDto customerAreaCrmDto) throws Exception {
        this.setCustomerArea(customerAreaCrmDto, "insert");
    }

    public void batchInsertCustomerArea(List<CustomerAreaCrmDto> customerAreaCrmDtoList) throws Exception {
        if (!CollectionUtils.isEmpty(customerAreaCrmDtoList)) {
            if (customerAreaCrmDtoList.size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
            }
            for (CustomerAreaCrmDto customerAreaCrmDto : customerAreaCrmDtoList) {
                this.setCustomerArea(customerAreaCrmDto, "insert");
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
        }
    }

    public void updateCustomerArea(CustomerAreaCrmDto customerAreaCrmDto) throws Exception {
        this.setCustomerArea(customerAreaCrmDto, "update");
    }

    public void batchUpdateCustomerArea(List<CustomerAreaCrmDto> customerAreaCrmDtoList) throws Exception {
        if (!CollectionUtils.isEmpty(customerAreaCrmDtoList)) {
            if (customerAreaCrmDtoList.size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
            }
            for (CustomerAreaCrmDto customerAreaCrmDto : customerAreaCrmDtoList) {
                this.setCustomerArea(customerAreaCrmDto, "update");
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
        }
    }

    public void deleteCustomerArea(CustomerAreaCrmDto customerAreaCrmDto) throws Exception {
        this.setCustomerArea(customerAreaCrmDto, "delete");
    }

    public void batchDeleteCustomerArea(List<CustomerAreaCrmDto> customerAreaCrmDtoList) throws Exception {
        if (!CollectionUtils.isEmpty(customerAreaCrmDtoList)) {
            if (customerAreaCrmDtoList.size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
            }
            for (CustomerAreaCrmDto customerAreaCrmDto : customerAreaCrmDtoList) {
                this.setCustomerArea(customerAreaCrmDto, "delete");
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
        }
    }

    public void insertPrincipal(PrincipalCrmDto principalCrmDto) throws Exception {
        this.setPrincipal(principalCrmDto, "insert");
    }

    public void batchInsertPrincipal(List<PrincipalCrmDto> principalCrmDtoList) throws Exception {
        if (!CollectionUtils.isEmpty(principalCrmDtoList)) {
            if (principalCrmDtoList.size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
            }
            for (PrincipalCrmDto principalCrmDto : principalCrmDtoList) {
                this.setPrincipal(principalCrmDto, "insert");
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
        }
    }

    public void updatePrincipal(PrincipalCrmDto principalCrmDto) throws Exception {
        this.setPrincipal(principalCrmDto, "update");
    }

    public void batchUpdatePrincipal(List<PrincipalCrmDto> principalCrmDtoList) throws Exception {
        if (!CollectionUtils.isEmpty(principalCrmDtoList)) {
            if (principalCrmDtoList.size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
            }
            for (PrincipalCrmDto principalCrmDto : principalCrmDtoList) {
                this.setPrincipal(principalCrmDto, "update");
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
        }
    }

    public void deletePrincipal(PrincipalCrmDto principalCrmDto) throws Exception {
        this.setPrincipal(principalCrmDto, "delete");
    }

    public void batchDeletePrincipal(List<PrincipalCrmDto> principalCrmDtoList) throws Exception {
        if (!CollectionUtils.isEmpty(principalCrmDtoList)) {
            if (principalCrmDtoList.size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
            }
            for (PrincipalCrmDto principalCrmDto : principalCrmDtoList) {
                this.setPrincipal(principalCrmDto, "delete");
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
        }
    }

    private void setCustomerArea(CustomerAreaCrmDto customerAreaCrmDto, String status) throws Exception {
        if (StringUtils.isEmpty((CharSequence)status)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801199);
        }
        if ("insert".equals(status)) {
            CustomerArea customerArea = this.getCustomerAreaByCustomerAreaCrmDto(customerAreaCrmDto, status);
            Long merchantApplyRangeId = customerAreaCrmDto.getMerchantApplyRangeId();
            Long merchantId = customerAreaCrmDto.getMerchantId();
            MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
            merchantApplyRange.setId((Object)merchantApplyRangeId);
            merchantApplyRange.setIsApplied(Boolean.valueOf(true));
            merchantApplyRange.setEntityStatus(EntityStatus.Update);
            this.setCrmCopyMerchantApplyRangeGroup(merchantApplyRange, merchantApplyRangeId, merchantId);
            if (customerArea.getIsDefault().booleanValue() && !this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
                merchantApplyRangeDetail.setCustomerArea(customerArea.getSaleAreaId());
                merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
            }
            MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
            MetaDaoHelper.insert((String)"aa.merchant.CustomerArea", (BizObject)customerArea);
        } else if ("update".equals(status)) {
            CustomerArea customerArea = this.getCustomerAreaByCustomerAreaCrmDto(customerAreaCrmDto, status);
            List originalDataBaseCustomerAreaList = this.merchantGroupDao.getCustomerAreaById((Long)customerArea.getId());
            if (!CollectionUtils.isEmpty((Collection)originalDataBaseCustomerAreaList)) {
                Long merchantApplyRangeId = ((CustomerArea)originalDataBaseCustomerAreaList.get(0)).getmerchantApplyRangeId();
                Long merchantId = ((CustomerArea)originalDataBaseCustomerAreaList.get(0)).getMerchantId();
                MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
                merchantApplyRange.setId((Object)merchantApplyRangeId);
                merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                merchantApplyRange.setEntityStatus(EntityStatus.Update);
                this.setCrmCopyMerchantApplyRangeGroup(merchantApplyRange, merchantApplyRangeId, merchantId);
                if (customerArea.getIsDefault().booleanValue() && !this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                    merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
                    merchantApplyRangeDetail.setCustomerArea(customerArea.getSaleAreaId());
                    merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                    MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                }
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
            }
            MetaDaoHelper.update((String)"aa.merchant.CustomerArea", (BizObject)customerArea);
        } else if ("delete".equals(status)) {
            CustomerArea customerArea = this.getCustomerAreaByCustomerAreaCrmDto(customerAreaCrmDto, status);
            List originalDataBaseCustomerAreaList = this.merchantGroupDao.getCustomerAreaById((Long)customerArea.getId());
            if (!CollectionUtils.isEmpty((Collection)originalDataBaseCustomerAreaList)) {
                customerArea.setIsDefault(((CustomerArea)originalDataBaseCustomerAreaList.get(0)).getIsDefault());
                Long merchantApplyRangeId = ((CustomerArea)originalDataBaseCustomerAreaList.get(0)).getmerchantApplyRangeId();
                Long merchantId = ((CustomerArea)originalDataBaseCustomerAreaList.get(0)).getMerchantId();
                MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
                merchantApplyRange.setId((Object)merchantApplyRangeId);
                merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                merchantApplyRange.setEntityStatus(EntityStatus.Update);
                this.setCrmCopyMerchantApplyRangeGroup(merchantApplyRange, merchantApplyRangeId, merchantId);
                if (((CustomerArea)originalDataBaseCustomerAreaList.get(0)).getIsDefault().booleanValue() && !this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                    merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
                    merchantApplyRangeDetail.setCustomerArea(null);
                    merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                    MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                }
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
            }
            MetaDaoHelper.delete((String)"aa.merchant.CustomerArea", (BizObject)customerArea);
        }
    }

    private void setCrmCopyMerchantApplyRangeGroup(MerchantApplyRange merchantApplyRange, Long merchantApplyRangeId, Long merchantId) throws Exception {
        List<MerchantApplyRange> originalDataBaseMerchantApplyRangeList = this.merchantGroupService.getMerchantApplyRangeById(merchantApplyRangeId, merchantId);
        if (CollectionUtils.isEmpty(originalDataBaseMerchantApplyRangeList) || StringUtils.isEmpty((CharSequence)originalDataBaseMerchantApplyRangeList.get(0).getMerchantDetailId())) {
            return;
        }
        MerchantApplyRange originalDataBaseMerchantApplyRange = originalDataBaseMerchantApplyRangeList.get(0);
        List<MerchantDetail> originalDataBaseMerchantDetailList = this.merchantGroupService.getMerchantDetailByBelongOrgId(originalDataBaseMerchantApplyRange.getOrgId(), merchantId);
        if (CollectionUtils.isEmpty(originalDataBaseMerchantDetailList)) {
            List newOriginalDataBaseMerchantDetailList = this.merchantGroupDao.getMerchantDetailById(originalDataBaseMerchantApplyRange.getMerchantDetailId(), merchantId);
            MerchantDetail userMerchantDetail = this.merchantGroupService.copyMerchantDetail((MerchantDetail)newOriginalDataBaseMerchantDetailList.get(0), originalDataBaseMerchantApplyRange.getOrgId(), merchantId, BooleanUtil.isTrue((Object)originalDataBaseMerchantApplyRange.getIsCreator()));
            merchantApplyRange.setMerchantDetailId((String)userMerchantDetail.getId());
            MetaDaoHelper.insert((String)"aa.merchant.MerchantDetail", (BizObject)userMerchantDetail);
        } else {
            MerchantDetail originalDataBaseMerchantDetail = originalDataBaseMerchantDetailList.get(0);
            merchantApplyRange.setMerchantDetailId((String)originalDataBaseMerchantDetail.getId());
        }
    }

    private void setPrincipal(PrincipalCrmDto principalCrmDto, String status) throws Exception {
        if (StringUtils.isEmpty((CharSequence)status)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801199);
        }
        if ("insert".equals(status)) {
            Principal principal = this.getPrincipalByPrincipalCrmDto(principalCrmDto, status);
            Long merchantApplyRangeId = principal.getMerchantApplyRangeId();
            Long merchantId = principal.getMerchantId();
            MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
            merchantApplyRange.setId((Object)merchantApplyRangeId);
            merchantApplyRange.setIsApplied(Boolean.valueOf(true));
            merchantApplyRange.setEntityStatus(EntityStatus.Update);
            this.setCrmCopyMerchantApplyRangeGroup(merchantApplyRange, merchantApplyRangeId, merchantId);
            if (principal.getIsDefault().booleanValue() && !this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
                merchantApplyRangeDetail.setSpecialManagementDep(principal.getSpecialManagementDep());
                merchantApplyRangeDetail.setProfessSalesman(principal.getProfessSalesman());
                merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
            }
            MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
            MetaDaoHelper.insert((String)"aa.merchant.Principal", (BizObject)principal);
        } else if ("update".equals(status)) {
            Principal principal = this.getPrincipalByPrincipalCrmDto(principalCrmDto, status);
            List originalDataBasePrincipalList = this.merchantGroupDao.getPrincipalById((Long)principal.getId());
            if (!CollectionUtils.isEmpty((Collection)originalDataBasePrincipalList)) {
                Long merchantApplyRangeId = ((Principal)originalDataBasePrincipalList.get(0)).getMerchantApplyRangeId();
                Long merchantId = ((Principal)originalDataBasePrincipalList.get(0)).getMerchantId();
                MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
                merchantApplyRange.setId((Object)merchantApplyRangeId);
                merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                merchantApplyRange.setEntityStatus(EntityStatus.Update);
                this.setCrmCopyMerchantApplyRangeGroup(merchantApplyRange, merchantApplyRangeId, merchantId);
                if (principal.getIsDefault().booleanValue() && !this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                    merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
                    if (principal.containsKey((Object)"specialManagementDep")) {
                        merchantApplyRangeDetail.setSpecialManagementDep(principal.getSpecialManagementDep());
                    }
                    if (principal.containsKey((Object)"professSalesman")) {
                        merchantApplyRangeDetail.setProfessSalesman(principal.getProfessSalesman());
                    }
                    merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                    MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                }
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
            }
            MetaDaoHelper.update((String)"aa.merchant.Principal", (BizObject)principal);
        } else if ("delete".equals(status)) {
            Principal principal = this.getPrincipalByPrincipalCrmDto(principalCrmDto, status);
            List originalDataBasePrincipalList = this.merchantGroupDao.getPrincipalById((Long)principal.getId());
            if (!CollectionUtils.isEmpty((Collection)originalDataBasePrincipalList)) {
                principal.setIsDefault(((Principal)originalDataBasePrincipalList.get(0)).getIsDefault());
                Long merchantApplyRangeId = ((Principal)originalDataBasePrincipalList.get(0)).getMerchantApplyRangeId();
                Long merchantId = ((Principal)originalDataBasePrincipalList.get(0)).getMerchantId();
                MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
                merchantApplyRange.setId((Object)merchantApplyRangeId);
                merchantApplyRange.setIsApplied(Boolean.valueOf(true));
                merchantApplyRange.setEntityStatus(EntityStatus.Update);
                this.setCrmCopyMerchantApplyRangeGroup(merchantApplyRange, merchantApplyRangeId, merchantId);
                if (((Principal)originalDataBasePrincipalList.get(0)).getIsDefault().booleanValue() && !this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
                    MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
                    merchantApplyRangeDetail.setMerchantApplyRangeId(merchantApplyRangeId);
                    merchantApplyRangeDetail.setSpecialManagementDep(principal.getSpecialManagementDep());
                    merchantApplyRangeDetail.setProfessSalesman(principal.getProfessSalesman());
                    merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
                    MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
                }
                MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
            }
            MetaDaoHelper.delete((String)"aa.merchant.Principal", (BizObject)principal);
        }
    }

    private void setCrmSaveMerchantApplyRangeGroup(MerchantApplyRange merchantApplyRange, MerchantApplyRangeDetail merchantApplyRangeDetail) throws Exception {
        Merchant merchant = this.merchantGroupService.getMerchantCreateOrgById(merchantApplyRange.getMerchantId());
        merchant.setId((Object)merchantApplyRange.getMerchantId());
        if (!CollectionUtils.isEmpty((Map)merchant) && merchant.getCreateOrg() != null) {
            if (merchant.getCreateOrg().equals(merchantApplyRange.getOrgId())) {
                List<MerchantDetail> originalMerchantDetailList = this.merchantGroupService.getMerchantDetailByBelongOrgId(merchant.getCreateOrg(), (Long)merchant.getId());
                if (!CollectionUtils.isEmpty(originalMerchantDetailList)) {
                    MerchantDetail originalMerchantDetail = originalMerchantDetailList.get(0);
                    MerchantDetail merchantDetailUpdate = this.merchantGroupService.getMerchantDetailForUpdate(merchantApplyRangeDetail, (String)originalMerchantDetail.getId(), merchant.getCreateOrg(), (Long)merchant.getId());
                    MetaDaoHelper.update((String)"aa.merchant.MerchantDetail", (BizObject)merchantDetailUpdate);
                    merchantApplyRange.setMerchantDetailId((String)merchantDetailUpdate.getId());
                }
            } else {
                List<MerchantDetail> originalUserMerchantDetailList = this.merchantGroupService.getMerchantDetailByBelongOrgId(merchantApplyRange.getOrgId(), (Long)merchant.getId());
                if (!CollectionUtils.isEmpty(originalUserMerchantDetailList)) {
                    MerchantDetail merchantDetail = this.merchantGroupService.getMerchantDetailForUpdate(merchantApplyRangeDetail, (String)originalUserMerchantDetailList.get(0).getId(), merchantApplyRange.getOrgId(), (Long)merchant.getId());
                    MetaDaoHelper.update((String)"aa.merchant.MerchantDetail", (BizObject)merchantDetail);
                    merchantApplyRange.setMerchantDetailId((String)merchantDetail.getId());
                } else {
                    MerchantDetail userMerchantDetail;
                    List newOriginalDataBaseMerchantDetailList;
                    MerchantApplyRange originalDataBaseMerchantApplyRange = merchantApplyRange;
                    List<MerchantApplyRange> merchantApplyRangeInDbList = this.merchantGroupService.getMerchantApplyRangeById(merchantApplyRangeDetail.getMerchantApplyRangeId(), merchantApplyRange.getMerchantId());
                    if (!CollectionUtils.isEmpty(merchantApplyRangeInDbList) && !StringUtils.isEmpty((CharSequence)merchantApplyRangeInDbList.get(0).getMerchantDetailId())) {
                        originalDataBaseMerchantApplyRange = merchantApplyRangeInDbList.get(0);
                    }
                    if (CollectionUtils.isEmpty((Collection)(newOriginalDataBaseMerchantDetailList = StringUtils.isEmpty((CharSequence)originalDataBaseMerchantApplyRange.getMerchantDetailId()) ? this.merchantGroupDao.getMerchantDetailByIsCreator(merchantApplyRange.getMerchantId()) : this.merchantGroupDao.getMerchantDetailById(originalDataBaseMerchantApplyRange.getMerchantDetailId(), merchantApplyRange.getMerchantId())))) {
                        userMerchantDetail = this.merchantGroupService.getMerchantDetailForInsert(merchantApplyRangeDetail, merchantApplyRange.getOrgId(), merchantApplyRange.getMerchantId(), false);
                    } else {
                        userMerchantDetail = this.merchantGroupService.copyMerchantDetail((MerchantDetail)newOriginalDataBaseMerchantDetailList.get(0), originalDataBaseMerchantApplyRange.getOrgId(), merchantApplyRange.getMerchantId(), BooleanUtil.isTrue((Object)originalDataBaseMerchantApplyRange.getIsCreator()));
                        this.merchantGroupService.copyDataFromRangeToDetail(userMerchantDetail, merchantApplyRangeDetail);
                    }
                    merchantApplyRange.setMerchantDetailId((String)userMerchantDetail.getId());
                    MetaDaoHelper.insert((String)"aa.merchant.MerchantDetail", (BizObject)userMerchantDetail);
                }
            }
        }
    }

    public void batchUpdateMerchantApplyRangeDetailRecentFollow(List<MerchantDetailRecentCrmDto> merchantDetailRecentCrmDtoList) throws Exception {
        if (!CollectionUtils.isEmpty(merchantDetailRecentCrmDtoList)) {
            if (merchantDetailRecentCrmDtoList.size() > UpcAPiTool.List_LENGTH) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
            }
            for (MerchantDetailRecentCrmDto merchantDetailRecentCrmDto : merchantDetailRecentCrmDtoList) {
                this.updateMerchantApplyRangeDetailRecentFollow(merchantDetailRecentCrmDto);
            }
        } else {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801194, new Object[]{UpcAPiTool.List_LENGTH});
        }
    }

    public void updateMerchantApplyRangeDetailRecentFollow(MerchantDetailRecentCrmDto merchantDetailRecentCrmDto) throws Exception {
        if (merchantDetailRecentCrmDto.getMerchantApplyRangeId() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801197);
        }
        MerchantApplyRangeDetail merchantApplyRangeDetail = this.getMerchantApplyRangeDetailByMerchantDetailRecentCrmDto(merchantDetailRecentCrmDto);
        MerchantApplyRange merchantApplyRange = new MerchantApplyRange();
        merchantApplyRange.setId((Object)merchantDetailRecentCrmDto.getMerchantApplyRangeId());
        merchantApplyRange.setRecentlyFollowTime(merchantDetailRecentCrmDto.getRecentlyFollowTime());
        merchantApplyRange.setIsApplied(Boolean.valueOf(true));
        merchantApplyRange.set("positiveTime", (Object)merchantDetailRecentCrmDto.getPositiveTime());
        merchantApplyRange.set("positivePeople", (Object)merchantDetailRecentCrmDto.getPositivePeople());
        merchantApplyRange.setEntityStatus(EntityStatus.Update);
        List newOriginalDataBaseMerchantApplyRangeList = this.merchantGroupDao.getMerchantApplyRangeById(merchantDetailRecentCrmDto.getMerchantApplyRangeId());
        if (!CollectionUtils.isEmpty((Collection)newOriginalDataBaseMerchantApplyRangeList)) {
            MerchantApplyRange newOriginalDataBaseMerchantApplyRange = (MerchantApplyRange)newOriginalDataBaseMerchantApplyRangeList.get(0);
            newOriginalDataBaseMerchantApplyRange.setRecentlyFollowTime(merchantDetailRecentCrmDto.getRecentlyFollowTime());
            newOriginalDataBaseMerchantApplyRange.set("positiveTime", (Object)merchantDetailRecentCrmDto.getPositiveTime());
            newOriginalDataBaseMerchantApplyRange.set("positivePeople", (Object)merchantDetailRecentCrmDto.getPositivePeople());
            this.setCrmSaveMerchantApplyRangeGroup(newOriginalDataBaseMerchantApplyRange, merchantApplyRangeDetail);
            merchantApplyRange.setMerchantDetailId(newOriginalDataBaseMerchantApplyRange.getMerchantDetailId());
        }
        MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRange", (BizObject)merchantApplyRange);
        if (!this.pubOptionDataQueryUtil.isCloseMerchantModelDoubleWrite()) {
            MetaDaoHelper.update((String)"aa.merchant.MerchantApplyRangeDetail", (BizObject)merchantApplyRangeDetail);
        }
    }

    private Merchant getMerchantByMerchantGroupDto(MerchantGroupCrmDto merchantGroupCrmDto) {
        BizObject multilingualName;
        boolean isValue = false;
        Merchant merchant = new Merchant();
        merchant.setId((Object)merchantGroupCrmDto.getId());
        if (merchantGroupCrmDto.getName() != null) {
            MultilingualDto name = merchantGroupCrmDto.getName();
            multilingualName = new BizObject();
            if (!StringUtils.isEmpty((CharSequence)name.getChinese())) {
                multilingualName.put("zh_CN", (Object)name.getChinese());
            }
            if (!StringUtils.isEmpty((CharSequence)name.getEnglish())) {
                multilingualName.put("en_US", (Object)name.getEnglish());
            }
            if (!StringUtils.isEmpty((CharSequence)name.getTraditional())) {
                multilingualName.put("zh_TW", (Object)name.getTraditional());
            }
            if (!CollectionUtils.isEmpty((Map)multilingualName)) {
                merchant.put("name", (Object)multilingualName);
                isValue = true;
            }
        }
        if (merchantGroupCrmDto.getShortname() != null) {
            MultilingualDto shortname = merchantGroupCrmDto.getShortname();
            multilingualName = new BizObject();
            if (!StringUtils.isEmpty((CharSequence)shortname.getChinese())) {
                multilingualName.put("zh_CN", (Object)shortname.getChinese());
            }
            if (!StringUtils.isEmpty((CharSequence)shortname.getEnglish())) {
                multilingualName.put("en_US", (Object)shortname.getEnglish());
            }
            if (!StringUtils.isEmpty((CharSequence)shortname.getTraditional())) {
                multilingualName.put("zh_TW", (Object)shortname.getTraditional());
            }
            if (!CollectionUtils.isEmpty((Map)multilingualName)) {
                merchant.put("shortname", (Object)multilingualName);
                isValue = true;
            }
        }
        if (!StringUtils.isEmpty((CharSequence)merchantGroupCrmDto.getSearchCode())) {
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantGroupCrmDto.getCreditCode())) {
            merchant.setCreditCode(merchantGroupCrmDto.getCreditCode());
            isValue = true;
        }
        if (merchantGroupCrmDto.getVerfyMark() != null) {
            merchant.setVerfyMark(VerifyingState.find((Number)merchantGroupCrmDto.getVerfyMark()));
            isValue = true;
        }
        if (merchantGroupCrmDto.getLongitude() != null) {
            merchant.setLongitude(merchantGroupCrmDto.getLongitude());
            isValue = true;
        }
        if (merchantGroupCrmDto.getLatitude() != null) {
            merchant.setLatitude(merchantGroupCrmDto.getLatitude());
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantGroupCrmDto.getAddress())) {
            merchant.setAddress(merchantGroupCrmDto.getAddress());
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantGroupCrmDto.getCountry())) {
            merchant.setCountry(merchantGroupCrmDto.getCountry());
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantGroupCrmDto.getRegion())) {
            merchant.setRegion(merchantGroupCrmDto.getRegion());
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantGroupCrmDto.getRegionCode())) {
            merchant.setRegionCode(merchantGroupCrmDto.getRegionCode());
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantGroupCrmDto.getWebsite())) {
            merchant.setWebsite(merchantGroupCrmDto.getWebsite());
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantGroupCrmDto.getEnterpriseName())) {
            merchant.setEnterpriseName(merchantGroupCrmDto.getEnterpriseName());
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantGroupCrmDto.getLeaderName())) {
            merchant.setLeaderName(merchantGroupCrmDto.getLeaderName());
            isValue = true;
        }
        if (merchantGroupCrmDto.getBuildTime() != null) {
            merchant.setBuildTime(merchantGroupCrmDto.getBuildTime());
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantGroupCrmDto.getScope())) {
            merchant.setScope(merchantGroupCrmDto.getScope());
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantGroupCrmDto.getContactTel())) {
            merchant.setContactTel(merchantGroupCrmDto.getContactTel());
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantGroupCrmDto.getEmail())) {
            merchant.setEmail(merchantGroupCrmDto.getEmail());
            isValue = true;
        }
        if (!isValue) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801201);
        }
        merchant.setEntityStatus(EntityStatus.Update);
        return merchant;
    }

    private MerchantApplyRangeDetail getMerchantApplyRangeDetailByMerchantDetailCrmDto(MerchantDetailCrmDto merchantDetailCrmDto) {
        boolean isValue = false;
        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
        merchantApplyRangeDetail.setMerchantApplyRangeId(merchantDetailCrmDto.getMerchantApplyRangeId());
        HashSet blankSet = merchantDetailCrmDto.getBlankSet();
        if (merchantDetailCrmDto.getHighSeas() != null) {
            merchantApplyRangeDetail.put("highSeas", (Object)merchantDetailCrmDto.getHighSeas());
            isValue = true;
        } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("highSeas")) {
            merchantApplyRangeDetail.put("highSeas", null);
            isValue = true;
        }
        if (merchantDetailCrmDto.getSourceOfTheHighSeas() != null) {
            merchantApplyRangeDetail.put("sourceOfTheHighSeas", (Object)merchantDetailCrmDto.getSourceOfTheHighSeas());
            isValue = true;
        } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("sourceOfTheHighSeas")) {
            merchantApplyRangeDetail.put("sourceOfTheHighSeas", null);
            isValue = true;
        }
        if (merchantDetailCrmDto.getFrozenState() != null) {
            merchantApplyRangeDetail.setFrozenState(FrozenState.find((Number)merchantDetailCrmDto.getFrozenState()));
            isValue = true;
        } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("frozenState")) {
            merchantApplyRangeDetail.setFrozenState(null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantDetailCrmDto.getFreezingLink())) {
            merchantApplyRangeDetail.setFreezingLink(merchantDetailCrmDto.getFreezingLink());
            isValue = true;
        } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("freezingLink")) {
            merchantApplyRangeDetail.setFreezingLink(null);
            isValue = true;
        }
        if (merchantDetailCrmDto.getStopStatus() != null) {
            merchantApplyRangeDetail.setStopstatus(merchantDetailCrmDto.getStopStatus());
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantDetailCrmDto.getRecentFollower())) {
            merchantApplyRangeDetail.put("recentFollower", (Object)merchantDetailCrmDto.getRecentFollower());
            isValue = true;
        } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("recentFollower")) {
            merchantApplyRangeDetail.put("recentFollower", null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantDetailCrmDto.getRecentFollowContent())) {
            merchantApplyRangeDetail.put("recentFollowContent", (Object)merchantDetailCrmDto.getRecentFollowContent());
            isValue = true;
        } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("recentFollowContent")) {
            merchantApplyRangeDetail.put("recentFollowContent", null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantDetailCrmDto.getApplyPerson())) {
            merchantApplyRangeDetail.put("applyPerson", (Object)merchantDetailCrmDto.getApplyPerson());
            isValue = true;
        } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("applyPerson")) {
            merchantApplyRangeDetail.put("applyPerson", null);
            isValue = true;
        }
        if (merchantDetailCrmDto.getApplyTime() != null) {
            merchantApplyRangeDetail.put("applyTime", (Object)merchantDetailCrmDto.getApplyTime());
            isValue = true;
        } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("applyTime")) {
            merchantApplyRangeDetail.put("applyTime", null);
            isValue = true;
        }
        if (merchantDetailCrmDto.getApplyStatus() != null) {
            merchantApplyRangeDetail.put("applyStatus", (Object)merchantDetailCrmDto.getApplyStatus());
            isValue = true;
        } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("applyStatus")) {
            merchantApplyRangeDetail.put("applyStatus", null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantDetailCrmDto.getSpecialManagementDep())) {
            merchantApplyRangeDetail.setSpecialManagementDep(merchantDetailCrmDto.getSpecialManagementDep());
            isValue = true;
        } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("specialManagementDep")) {
            merchantApplyRangeDetail.setSpecialManagementDep(null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)merchantDetailCrmDto.getProfessSalesman())) {
            merchantApplyRangeDetail.setProfessSalesman(merchantDetailCrmDto.getProfessSalesman());
            isValue = true;
        } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("professSalesman")) {
            merchantApplyRangeDetail.setProfessSalesman(null);
            isValue = true;
        }
        if (merchantDetailCrmDto.getCustomerArea() != null) {
            merchantApplyRangeDetail.setCustomerArea(merchantDetailCrmDto.getCustomerArea());
            isValue = true;
        } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("customerArea")) {
            merchantApplyRangeDetail.setCustomerArea(null);
            isValue = true;
        }
        if (!isValue) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801201);
        }
        merchantApplyRangeDetail.setModifyTime(new Date());
        merchantApplyRangeDetail.setModifyDate(new Date());
        merchantApplyRangeDetail.setModifier(AppContext.getCurrentUser().getName());
        merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
        return merchantApplyRangeDetail;
    }

    private CustomerArea getCustomerAreaByCustomerAreaCrmDto(CustomerAreaCrmDto customerAreaCrmDto, String status) {
        CustomerArea customerArea = new CustomerArea();
        switch (status) {
            case "insert": {
                customerArea.setId((Object)IdManager.getInstance().nextId());
                if (customerAreaCrmDto.getMerchantId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801202);
                }
                customerArea.setMerchantId(customerAreaCrmDto.getMerchantId());
                if (customerAreaCrmDto.getMerchantApplyRangeId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801203);
                }
                customerArea.setmerchantApplyRangeId(customerAreaCrmDto.getMerchantApplyRangeId());
                if (customerAreaCrmDto.getSaleAreaId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801204);
                }
                customerArea.setSaleAreaId(customerAreaCrmDto.getSaleAreaId());
                if (customerAreaCrmDto.getIsDefault() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801205);
                }
                customerArea.setIsDefault(customerAreaCrmDto.getIsDefault());
                customerArea.setEntityStatus(EntityStatus.Insert);
                break;
            }
            case "update": {
                if (customerAreaCrmDto.getId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801206);
                }
                customerArea.setId((Object)customerAreaCrmDto.getId());
                if (customerAreaCrmDto.getSaleAreaId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801204);
                }
                customerArea.setSaleAreaId(customerAreaCrmDto.getSaleAreaId());
                if (customerAreaCrmDto.getIsDefault() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801205);
                }
                customerArea.setIsDefault(customerAreaCrmDto.getIsDefault());
                customerArea.setEntityStatus(EntityStatus.Update);
                break;
            }
            case "delete": {
                if (customerAreaCrmDto.getId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801206);
                }
                customerArea.setId((Object)customerAreaCrmDto.getId());
                customerArea.setEntityStatus(EntityStatus.Delete);
                break;
            }
        }
        return customerArea;
    }

    private Principal getPrincipalByPrincipalCrmDto(PrincipalCrmDto principalCrmDto, String status) {
        Principal principal = new Principal();
        HashSet blankSet = principalCrmDto.getBlankSet();
        switch (status) {
            case "insert": {
                principal.setId((Object)IdManager.getInstance().nextId());
                if (principalCrmDto.getMerchantId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801202);
                }
                principal.setMerchantId(principalCrmDto.getMerchantId());
                if (principalCrmDto.getMerchantApplyRangeId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801203);
                }
                principal.setMerchantApplyRangeId(principalCrmDto.getMerchantApplyRangeId());
                if (principalCrmDto.getSpecialManagementDep() == null && principalCrmDto.getProfessSalesman() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801207);
                }
                if (principalCrmDto.getSpecialManagementDep() != null) {
                    principal.setSpecialManagementDep(principalCrmDto.getSpecialManagementDep());
                }
                if (principalCrmDto.getProfessSalesman() != null) {
                    principal.setProfessSalesman(principalCrmDto.getProfessSalesman());
                }
                if (principalCrmDto.getIsDefault() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801205);
                }
                principal.setIsDefault(principalCrmDto.getIsDefault());
                principal.setEntityStatus(EntityStatus.Insert);
                break;
            }
            case "update": {
                if (principalCrmDto.getId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801206);
                }
                principal.setId((Object)principalCrmDto.getId());
                if (principalCrmDto.getSpecialManagementDep() == null && principalCrmDto.getProfessSalesman() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801207);
                }
                if (principalCrmDto.getSpecialManagementDep() != null) {
                    principal.setSpecialManagementDep(principalCrmDto.getSpecialManagementDep());
                } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("specialManagementDep")) {
                    principal.setSpecialManagementDep(null);
                }
                if (principalCrmDto.getProfessSalesman() != null) {
                    principal.setProfessSalesman(principalCrmDto.getProfessSalesman());
                } else if (blankSet != null && !blankSet.isEmpty() && blankSet.contains("professSalesman")) {
                    principal.setProfessSalesman(null);
                }
                if (principalCrmDto.getIsDefault() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801205);
                }
                principal.setIsDefault(principalCrmDto.getIsDefault());
                principal.setEntityStatus(EntityStatus.Update);
                break;
            }
            case "delete": {
                if (principalCrmDto.getId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801206);
                }
                principal.setId((Object)principalCrmDto.getId());
                principal.setEntityStatus(EntityStatus.Delete);
                break;
            }
        }
        return principal;
    }

    public ContactCrmDto insertContact(ContactCrmDto contactCrmDto) throws Exception {
        Contacter contacter = this.getMerchantContact(contactCrmDto, "insert");
        this.checkContact(contacter, "insert");
        MetaDaoHelper.insert((String)"aa.merchant.Contacter", (BizObject)contacter);
        return contactCrmDto;
    }

    public ContactCrmDto updateContact(ContactCrmDto contactCrmDto) throws Exception {
        Contacter contacter = this.getMerchantContact(contactCrmDto, "update");
        this.checkContact(contacter, "update");
        MetaDaoHelper.update((String)"aa.merchant.Contacter", (BizObject)contacter);
        return contactCrmDto;
    }

    public ContactCrmDto deleteContact(ContactCrmDto contactCrmDto) throws Exception {
        Contacter contacter = this.getMerchantContact(contactCrmDto, "delete");
        this.checkContact(contacter, "delete");
        MetaDaoHelper.delete((String)"aa.merchant.Contacter", (BizObject)contacter);
        return contactCrmDto;
    }

    public Contacter getMerchantContact(ContactCrmDto contactCrmDto, String status) {
        Contacter contacter = new Contacter();
        boolean isValue = false;
        HashSet blankSet = contactCrmDto.getBlankSet();
        if ("insert".equals(status)) {
            contacter.setId((Object)IdManager.getInstance().nextId());
            if (contactCrmDto.getMerchantId() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801208);
            }
            contacter.setMerchantId(contactCrmDto.getMerchantId());
            contacter.setEntityStatus(EntityStatus.Insert);
            contactCrmDto.setId((Long)contacter.getId());
        } else if ("update".equals(status)) {
            if (contactCrmDto.getId() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801209);
            }
            contacter.setId((Object)contactCrmDto.getId());
            if (contactCrmDto.getMerchantId() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801210);
            }
            contacter.setMerchantId(contactCrmDto.getMerchantId());
            contacter.setEntityStatus(EntityStatus.Update);
        } else if ("delete".equals(status)) {
            if (contactCrmDto.getId() == null) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801211);
            }
            contacter.setId((Object)contactCrmDto.getId());
            contacter.setEntityStatus(EntityStatus.Delete);
            return contacter;
        }
        if (contactCrmDto.getFullName() != null) {
            MultilingualDto fullName = contactCrmDto.getFullName();
            BizObject multilingualName = new BizObject();
            if (!StringUtils.isEmpty((CharSequence)fullName.getChinese())) {
                multilingualName.put("zh_CN", (Object)fullName.getChinese());
            }
            if (!StringUtils.isEmpty((CharSequence)fullName.getEnglish())) {
                multilingualName.put("en_US", (Object)fullName.getEnglish());
            }
            if (!StringUtils.isEmpty((CharSequence)fullName.getTraditional())) {
                multilingualName.put("zh_TW", (Object)fullName.getTraditional());
            }
            if (!CollectionUtils.isEmpty((Map)multilingualName)) {
                contacter.put("fullName", (Object)multilingualName);
                isValue = true;
            }
        } else if (!CollectionUtils.isEmpty((Collection)blankSet) && blankSet.contains("fullName")) {
            contacter.setFullName(null);
            isValue = true;
        }
        if (contactCrmDto.getFullName_multi() != null) {
            MultiLangText fullNameMulti = contactCrmDto.getFullName_multi();
            contacter.put("fullName", (Object)fullNameMulti.toMap());
            isValue = true;
        } else if (!CollectionUtils.isEmpty((Collection)blankSet) && blankSet.contains("fullName")) {
            contacter.setFullName(null);
            isValue = true;
        }
        if (contactCrmDto.getGender() != null) {
            contacter.setGender(GenderType.find((Number)contactCrmDto.getGender()));
            isValue = true;
        } else if (!CollectionUtils.isEmpty((Collection)blankSet) && blankSet.contains("gender")) {
            contacter.setGender(null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)contactCrmDto.getPositionName())) {
            contacter.setPositionName(contactCrmDto.getPositionName());
            isValue = true;
        } else if (!CollectionUtils.isEmpty((Collection)blankSet) && blankSet.contains("positionName")) {
            contacter.setPositionName(null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)contactCrmDto.getMobile())) {
            contacter.setMobile(contactCrmDto.getMobile());
            isValue = true;
        } else if (!CollectionUtils.isEmpty((Collection)blankSet) && blankSet.contains("mobile")) {
            contacter.setMobile(null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)contactCrmDto.getAreaCodeMobile())) {
            contacter.setAreaCodeMobile(contactCrmDto.getAreaCodeMobile());
            isValue = true;
        } else if (!CollectionUtils.isEmpty((Collection)blankSet) && blankSet.contains("areaCodeMobile")) {
            contacter.setAreaCodeMobile(null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)contactCrmDto.getTelePhone())) {
            contacter.setTelePhone(contactCrmDto.getTelePhone());
            isValue = true;
        } else if (!CollectionUtils.isEmpty((Collection)blankSet) && blankSet.contains("telePhone")) {
            contacter.setTelePhone(null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)contactCrmDto.getEmail())) {
            contacter.setEmail(contactCrmDto.getEmail());
            isValue = true;
        } else if (!CollectionUtils.isEmpty((Collection)blankSet) && blankSet.contains("email")) {
            contacter.setEmail(null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)contactCrmDto.getQq())) {
            contacter.setQq(contactCrmDto.getQq());
            isValue = true;
        } else if (!CollectionUtils.isEmpty((Collection)blankSet) && blankSet.contains("qq")) {
            contacter.setQq(null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)contactCrmDto.getWeChat())) {
            contacter.setWeChat(contactCrmDto.getWeChat());
            isValue = true;
        } else if (!CollectionUtils.isEmpty((Collection)blankSet) && blankSet.contains("weChat")) {
            contacter.setWeChat(null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)contactCrmDto.getStopStatus())) {
            if (StopStatusChar.stop.getValue().equals(contactCrmDto.getStopStatus())) {
                contacter.setStopStatus(StopStatusChar.stop);
            } else if (StopStatusChar.unStop.getValue().equals(contactCrmDto.getStopStatus())) {
                contacter.setStopStatus(StopStatusChar.unStop);
            }
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)contactCrmDto.getCrmContact())) {
            contacter.setCrmContact(contactCrmDto.getCrmContact());
            isValue = true;
        } else if (!CollectionUtils.isEmpty((Collection)blankSet) && blankSet.contains("crmContact")) {
            contacter.setCrmContact(null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)contactCrmDto.getContactDepartment())) {
            contacter.setContactDepartment(contactCrmDto.getContactDepartment());
            isValue = true;
        } else if (!CollectionUtils.isEmpty((Collection)blankSet) && blankSet.contains("contactDepartment")) {
            contacter.setContactDepartment(null);
            isValue = true;
        }
        if (!StringUtils.isEmpty((CharSequence)contactCrmDto.getRemarks())) {
            contacter.setRemarks(contactCrmDto.getRemarks());
            isValue = true;
        } else if (!CollectionUtils.isEmpty((Collection)blankSet) && blankSet.contains("remarks")) {
            contacter.setRemarks(null);
            isValue = true;
        }
        if (contactCrmDto.getContacterCharacter() != null && !contactCrmDto.getContacterCharacter().isEmpty()) {
            contacter.put("contacterCharacter", (Object)contactCrmDto.getContacterCharacter());
            isValue = true;
        }
        if (contactCrmDto.getIsDefault() == null) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801212);
        }
        contacter.setIsDefault(contactCrmDto.getIsDefault());
        if (!isValue) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801201);
        }
        return contacter;
    }

    public void checkContact(Contacter contacter, String status) throws Exception {
        if (!CollectionUtils.isEmpty((Map)contacter) && !"insert".equals(status) && !"update".equals(status) && "delete".equals(status)) {
            boolean merchantNeedDefaultContact = MerchantUtils.getMerchantNeedDefault((String)"customerNeedDefaultContact");
            QuerySchema querySchema = QuerySchema.create();
            querySchema.addSelect("id");
            querySchema.addCondition((ConditionExpression)QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"merchantId").eq((Object)contacter.getMerchantId()), QueryCondition.name((String)"isDefault").eq((Object)1), QueryCondition.name((String)"id").eq(contacter.getId())}));
            List isDefault = MetaDaoHelper.query((String)"aa.merchant.Contacter", (QuerySchema)querySchema);
            if (!CollectionUtils.isEmpty((Collection)isDefault) && merchantNeedDefaultContact) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801214);
            }
        }
    }

    private MerchantApplyRangeDetail getMerchantApplyRangeDetailByMerchantDetailRecentCrmDto(MerchantDetailRecentCrmDto merchantDetailRecentCrmDto) {
        boolean isValue = false;
        MerchantApplyRangeDetail merchantApplyRangeDetail = new MerchantApplyRangeDetail();
        merchantApplyRangeDetail.setMerchantApplyRangeId(merchantDetailRecentCrmDto.getMerchantApplyRangeId());
        merchantApplyRangeDetail.put("recentFollower", (Object)merchantDetailRecentCrmDto.getRecentFollower());
        merchantApplyRangeDetail.put("recentFollowContent", (Object)merchantDetailRecentCrmDto.getRecentFollowContent());
        merchantApplyRangeDetail.setEntityStatus(EntityStatus.Update);
        return merchantApplyRangeDetail;
    }

    public void setMerchantIsExistPotential(Long merchantId) throws Exception {
        this.merchantService.setMerchantIsExistPotential(merchantId);
    }
}

