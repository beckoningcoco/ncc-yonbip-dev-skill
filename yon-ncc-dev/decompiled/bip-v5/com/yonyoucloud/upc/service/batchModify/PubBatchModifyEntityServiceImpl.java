/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.github.benmanes.caffeine.cache.Cache
 *  com.github.benmanes.caffeine.cache.Caffeine
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyBillNumExtService
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryEntityExtService
 *  com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryFieldExtService
 *  com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig
 *  com.yonyou.iuap.apdoc.coredoc.dao.batchModify.PubBatchModifyEntityDao
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil
 *  com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.http.YmsHttpClient
 *  com.yonyou.iuap.yms.multitenant.UserExecutors
 *  com.yonyou.ucf.mdd.character.utils.CharacterViewModelFunction
 *  com.yonyou.ucf.mdd.common.enums.OperationTypeEnum
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.ResultList
 *  com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.Field
 *  com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel
 *  com.yonyou.ucf.mdd.ext.bill.dto.BaseDto
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils
 *  com.yonyou.ucf.mdd.ext.bill.rule.template.CommonOperator
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils
 *  com.yonyou.ucf.mdd.ext.enums.util.EnumUtil
 *  com.yonyou.ucf.mdd.ext.model.BillContext
 *  com.yonyou.ucf.mdd.ext.poi.model.ProcessData
 *  com.yonyou.ucf.mdd.ext.util.RedisTool
 *  com.yonyou.ucf.userdef.dto.CharacterDetailDto
 *  com.yonyou.ucf.userdef.dto.CharacterViewModelDto
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.ExtBusinessProperty
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityFieldSaveDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryFieldSaveDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyMutilEntitySaveDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyOnelEntityDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityFieldVO
 *  com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityVO
 *  com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEnumValue
 *  com.yonyoucloud.upc.coredoc.pub.ExtPubBatchModifyCheckFieldEnum
 *  com.yonyoucloud.upc.coredoc.pub.ExtPubBatchModifyQueryEnum
 *  com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntity
 *  com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntityField
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.biz.base.BizContext
 *  org.imeta.core.model.Entity
 *  org.imeta.core.model.Property
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.spring.support.id.IdManager
 *  org.jetbrains.annotations.NotNull
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.beans.factory.annotation.Qualifier
 *  org.springframework.data.redis.core.RedisTemplate
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Transactional
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 */
package com.yonyoucloud.upc.service.batchModify;

import com.alibaba.fastjson.JSON;
import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyBillNumExtService;
import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryEntityExtService;
import com.yonyou.iuap.apdoc.coredoc.batchmodify.extinterface.IPubBatchModifyQueryFieldExtService;
import com.yonyou.iuap.apdoc.coredoc.config.YMSParamConfig;
import com.yonyou.iuap.apdoc.coredoc.dao.batchModify.PubBatchModifyEntityDao;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.utils.BooleanUtil;
import com.yonyou.iuap.apdoc.coredoc.utils.MultiLangUtils;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.http.YmsHttpClient;
import com.yonyou.iuap.yms.multitenant.UserExecutors;
import com.yonyou.ucf.mdd.character.utils.CharacterViewModelFunction;
import com.yonyou.ucf.mdd.common.enums.OperationTypeEnum;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.ResultList;
import com.yonyou.ucf.mdd.common.model.uimeta.filter.vo.QueryPagerVo;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.Field;
import com.yonyou.ucf.mdd.common.model.uimeta.ui.ViewModel;
import com.yonyou.ucf.mdd.ext.bill.dto.BaseDto;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils;
import com.yonyou.ucf.mdd.ext.bill.rule.template.CommonOperator;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.meta.UIMetaUtils;
import com.yonyou.ucf.mdd.ext.enums.util.EnumUtil;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ucf.mdd.ext.poi.model.ProcessData;
import com.yonyou.ucf.mdd.ext.util.RedisTool;
import com.yonyou.ucf.userdef.dto.CharacterDetailDto;
import com.yonyou.ucf.userdef.dto.CharacterViewModelDto;
import com.yonyoucloud.iuap.upc.api.service.IPubBatchModifyEntityService;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.upc.coredoc.batchentity.dto.ExtBusinessProperty;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityFieldSaveDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryFieldSaveDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyMutilEntitySaveDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyOnelEntityDTO;
import com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityFieldVO;
import com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityVO;
import com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEnumValue;
import com.yonyoucloud.upc.coredoc.pub.CheckDomainDeleteService;
import com.yonyoucloud.upc.coredoc.pub.ExtPubBatchModifyCheckFieldEnum;
import com.yonyoucloud.upc.coredoc.pub.ExtPubBatchModifyQueryEnum;
import com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntity;
import com.yonyoucloud.upc.coredoc.pub.PubBatchModifyEntityField;
import com.yonyoucloud.upc.service.batchModify.common.ModifyUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.imeta.biz.base.BizContext;
import org.imeta.core.model.Entity;
import org.imeta.core.model.Property;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.spring.support.id.IdManager;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;

@Service
public class PubBatchModifyEntityServiceImpl
implements IPubBatchModifyEntityService {
    private static final Logger log = LoggerFactory.getLogger(PubBatchModifyEntityServiceImpl.class);
    @Autowired
    private PubBatchModifyEntityDao pubBatchModifyEntityDao;
    @Autowired
    private CheckDomainDeleteService checkDomainDeleteService;
    @Autowired
    private YMSParamConfig ymsParamConfig;
    @Autowired
    @Qualifier(value="ymsLongTaskExecutorService")
    private ExecutorService ymsLongTaskExecutorService;
    @Autowired
    @Qualifier(value="coredocYmsHttpClient")
    private YmsHttpClient ymsHttpClient;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    @Qualifier(value="pc.BillService")
    private IUPCBillService billService;
    private ConcurrentHashMap<String, ResultList> resultListMap = new ConcurrentHashMap();
    public static ConcurrentHashMap<String, Integer> modifyTimesAccordingEntitiesMap = new ConcurrentHashMap();
    private ConcurrentHashMap<String, ConcurrentHashMap<String, Boolean>> resultYtenantMap = new ConcurrentHashMap();
    private Cache<String, Object> cache = Caffeine.newBuilder().maximumSize(10L).expireAfterWrite(30L, TimeUnit.MINUTES).build();

    @Override
    public List<PubBatchModifyEntityVO> getPubBatchModifyEntityVO(PubBatchModifyEntityQueryDTO pubBatchModifyEntityQueryDTO) throws Exception {
        if (!StringUtils.isEmpty((CharSequence)pubBatchModifyEntityQueryDTO.getBillNum())) {
            List pubBatchModifyEntityInDbList = new ArrayList();
            ExtPubBatchModifyQueryEnum extPubBatchModifyQueryFieldEnum = ExtPubBatchModifyQueryEnum.getByEntityFullNameOrBillNum((String)pubBatchModifyEntityQueryDTO.getBillNum());
            if (extPubBatchModifyQueryFieldEnum != null) {
                IPubBatchModifyQueryEntityExtService batchModifyQueryEntityExtService = (IPubBatchModifyQueryEntityExtService)AppContext.getBean((String)extPubBatchModifyQueryFieldEnum.getBeanName(), IPubBatchModifyQueryEntityExtService.class);
                if (batchModifyQueryEntityExtService != null) {
                    pubBatchModifyEntityInDbList = batchModifyQueryEntityExtService.getPubBatchModifyEntityVO(pubBatchModifyEntityQueryDTO);
                }
            } else {
                pubBatchModifyEntityInDbList = this.pubBatchModifyEntityDao.getPubBatchModifyEntityByBillNum(pubBatchModifyEntityQueryDTO.getBillNum());
            }
            ArrayList<PubBatchModifyEntityVO> pubBatchModifyEntityVOList = new ArrayList<PubBatchModifyEntityVO>();
            if (!CollectionUtils.isEmpty(pubBatchModifyEntityInDbList)) {
                for (PubBatchModifyEntity pubBatchModifyEntityInDb : pubBatchModifyEntityInDbList) {
                    if (!this.checkDomainDeleteService.getPredicateValue(pubBatchModifyEntityInDb.getDataRule(), null)) continue;
                    pubBatchModifyEntityVOList.add(this.initPubBatchModifyEntityVO(pubBatchModifyEntityInDb));
                }
            }
            if (!CollectionUtils.isEmpty(pubBatchModifyEntityVOList)) {
                return pubBatchModifyEntityVOList;
            }
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801274);
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801439);
    }

    @Override
    public PubBatchModifyEntityVO getPubBatchModifyEntityFieldVO(PubBatchModifyEntityQueryDTO pubBatchModifyEntityQueryDTO) throws Exception {
        if (StringUtils.isEmpty((CharSequence)pubBatchModifyEntityQueryDTO.getBatchModifyEntityId()) && StringUtils.isEmpty((CharSequence)pubBatchModifyEntityQueryDTO.getBillNum())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801090);
        }
        ArrayList<PubBatchModifyEntityFieldVO> batchModifyQueryFieldList = new ArrayList<PubBatchModifyEntityFieldVO>();
        ArrayList<PubBatchModifyEntityFieldVO> batchModifySaveFieldList = new ArrayList<PubBatchModifyEntityFieldVO>();
        this.getDBPrefabricatedFields(pubBatchModifyEntityQueryDTO, batchModifyQueryFieldList, batchModifySaveFieldList);
        this.getExtendFields(pubBatchModifyEntityQueryDTO, batchModifySaveFieldList, batchModifyQueryFieldList);
        PubBatchModifyEntityVO pubBatchModifyEntityVO = new PubBatchModifyEntityVO();
        if (!CollectionUtils.isEmpty(batchModifySaveFieldList)) {
            pubBatchModifyEntityVO.setBatchModifySaveFieldList(batchModifySaveFieldList);
            pubBatchModifyEntityVO.setBatchModifyQueryFieldList(batchModifyQueryFieldList);
            return pubBatchModifyEntityVO;
        }
        throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801440);
    }

    @Override
    public String batchModifyAsyncKey(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) {
        String billNum = pubBatchModifyEntitySaveDTO.getBillNum();
        String requestId = UUID.randomUUID().toString();
        if (StringUtils.isEmpty((CharSequence)billNum)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BILLNUM_CAN_NOT_NULL);
        }
        String lockKey = "batchModify" + billNum + AppContext.getYhtTenantId();
        String asyncKey = "batchModifyEntity" + AppContext.getCurrentUser().getYTenantId() + requestId;
        UserExecutors.executeInDetachedThread((ExecutorService)this.ymsLongTaskExecutorService, () -> this.batchModifyTransactional(pubBatchModifyEntitySaveDTO, lockKey, requestId, billNum, asyncKey));
        return asyncKey;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void batchModifyTransactional(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO, String lockKey, String requestId, String billNum, String asyncKey) {
        if (RedisTool.tryGetLock((String)lockKey, (String)requestId, (int)3600)) {
            try {
                this.initResultMap(billNum);
                this.setDTOAsyncKey(pubBatchModifyEntitySaveDTO, asyncKey);
                ProcessData.builder((int)1, (int)200, null, null).percentage("1").build(pubBatchModifyEntitySaveDTO.getAsyncKey(), Integer.valueOf(pubBatchModifyEntitySaveDTO.getExpireTime()));
                if (BooleanUtil.isTrue((Object)pubBatchModifyEntitySaveDTO.getAccordingConditions())) {
                    this.batchModifyAccordingCondition(pubBatchModifyEntitySaveDTO);
                } else {
                    this.resultListMap.get(AppContext.getYTenantId() + billNum).setCount(this.getFrontCount(pubBatchModifyEntitySaveDTO));
                    this.batchModifyMutilEntities(pubBatchModifyEntitySaveDTO, null);
                }
                this.dealSuccessfulProcessing(pubBatchModifyEntitySaveDTO);
            }
            catch (Exception e) {
                ResultList resultList = this.resultListMap.get(AppContext.getYTenantId() + billNum);
                resultList.addFailInfo((Object)e.getMessage());
                resultList.addErrorMessage(e.getMessage());
                resultList.setFailCount(1);
                resultList.setCount(1);
                ProcessData.builder((int)1, (int)200, (Object)resultList, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A5F8D8205E80011", (String)"\u6279\u6539\u5931\u8d25")).percentage("100").successCount(0).failCount(1).build(pubBatchModifyEntitySaveDTO.getAsyncKey(), Integer.valueOf(pubBatchModifyEntitySaveDTO.getExpireTime()));
            }
            finally {
                RedisTool.releaseLock((String)lockKey, (String)requestId);
            }
        } else {
            ResultList resultListCanNotGetLock = new ResultList();
            resultListCanNotGetLock.addFailInfo((Object)CoreDocBusinessErrorEnum.CAN_NOT_CONCURRENT_MODIFY.getMultilingualMessage());
            resultListCanNotGetLock.addErrorMessage(CoreDocBusinessErrorEnum.CAN_NOT_CONCURRENT_MODIFY.getMultilingualMessage());
            resultListCanNotGetLock.setFailCount(1);
            resultListCanNotGetLock.setCount(1);
            int expireTime = this.getExpireTime();
            ProcessData.builder((int)1, (int)200, (Object)resultListCanNotGetLock, (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A5F8D8205E80011", (String)"\u6279\u6539\u5931\u8d25")).percentage("100").successCount(0).failCount(1).build(asyncKey, Integer.valueOf(expireTime));
        }
    }

    private void initResultMap(String billNum) {
        ResultList resultList = new ResultList();
        this.resultListMap.put(AppContext.getYTenantId() + billNum, resultList);
        ConcurrentHashMap resultMap = new ConcurrentHashMap();
        this.resultYtenantMap.put(AppContext.getYTenantId() + billNum, resultMap);
    }

    private int getFrontCount(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) {
        int extSize = 0;
        int idSize = 0;
        if (pubBatchModifyEntitySaveDTO.getExtIdList() != null) {
            extSize = pubBatchModifyEntitySaveDTO.getExtIdList().size();
        }
        if (pubBatchModifyEntitySaveDTO.getIdList() != null) {
            idSize = pubBatchModifyEntitySaveDTO.getIdList().size();
        }
        return extSize > idSize ? extSize : idSize;
    }

    private void batchModifyAccordingCondition(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        BillDataDto billDataDto = pubBatchModifyEntitySaveDTO.getBill();
        if (billDataDto == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.CONDITION_IS_NULL);
        }
        int frontPageSize = billDataDto.getPage().getPageSize();
        if (frontPageSize < 100) {
            frontPageSize = 100;
        }
        QueryPagerVo queryPagerVo = new QueryPagerVo(1, frontPageSize);
        queryPagerVo.setTotalCount(1);
        billDataDto.setPage(queryPagerVo);
        billDataDto.setQueryId(String.valueOf(IdManager.getInstance().nextId()));
        Pager pagerFirstPage = this.billService.queryByPage(billDataDto);
        if (pagerFirstPage.getRecordList().size() < frontPageSize) {
            this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).setCount(pagerFirstPage.getRecordList().size());
        } else {
            queryPagerVo.setTotalCount(-1);
            billDataDto.setPage(queryPagerVo);
            Pager pagerCount = this.billService.queryByPage(billDataDto);
            this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).setCount(pagerCount.getRecordCount());
            billDataDto.getPage().setTotalCount(1);
        }
        if (this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).getCount() > UpcAPiTool.MAX_COUNT) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BATCH_MODIFY_MAX_COUNT, new Object[]{UpcAPiTool.MAX_COUNT});
        }
        int pageCount = (int)Math.ceil((double)this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).getCount() / (double)frontPageSize);
        CountDownLatch latch = new CountDownLatch(pageCount);
        int pageIndex = 1;
        while (pagerFirstPage.getRecordList().size() != 0) {
            PubBatchModifyEntitySaveDTO pubModifyEntity = new PubBatchModifyEntitySaveDTO();
            List recordList = pagerFirstPage.getRecordList();
            ArrayList idList = new ArrayList();
            ArrayList extIdList = new ArrayList();
            for (Map record : recordList) {
                Object id = record.get("id");
                idList.add(id);
                Object productApplyRangeId = record.get("productApplyRangeId");
                if (productApplyRangeId == null) continue;
                extIdList.add(productApplyRangeId);
            }
            BeanUtils.copyProperties((Object)pubBatchModifyEntitySaveDTO, (Object)pubModifyEntity);
            pubModifyEntity.setIdList(idList);
            pubModifyEntity.setExtIdList(extIdList);
            UserExecutors.executeInDetachedThread((ExecutorService)this.ymsLongTaskExecutorService, () -> {
                try {
                    this.batchModifyMutilEntities(pubModifyEntity, recordList);
                }
                catch (Exception e) {
                    log.error("\u5f02\u6b65\u6279\u6539\u62a5\u9519" + e.getMessage());
                }
                latch.countDown();
            });
            billDataDto.getPage().setPageIndex(++pageIndex);
            pagerFirstPage = this.billService.queryByPage(billDataDto);
        }
        latch.await();
    }

    private void dealSuccessfulProcessing(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) {
        ResultList resultList = this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum());
        ConcurrentHashMap<String, Boolean> modifyResultMap = this.resultYtenantMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum());
        int successCount = 0;
        int failCount = 0;
        for (Map.Entry<String, Boolean> stringBooleanEntry : modifyResultMap.entrySet()) {
            if (stringBooleanEntry.getValue().booleanValue()) {
                ++successCount;
                continue;
            }
            ++failCount;
        }
        resultList.setSucessCount(successCount);
        resultList.setFailCount(failCount);
        if (resultList.getSucessCount() + resultList.getFailCount() != resultList.getCount()) {
            int errorDataCounts = resultList.getCount() - (resultList.getSucessCount() + resultList.getFailCount());
            for (int i = 0; i < errorDataCounts; ++i) {
                resultList.incResultCount(false);
            }
        }
        if (pubBatchModifyEntitySaveDTO.getBatchModifyEntityQueryFieldSaveList() != null && pubBatchModifyEntitySaveDTO.getBatchModifyEntityQueryFieldSaveList().size() > 0 && resultList.getFailCount() > resultList.getFailInfos().size()) {
            resultList.addFailInfo((Object)MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E88E87005200002", (String)"\u672c\u6b21\u6279\u6539\u8bbe\u7f6e\u4e86\u4e8c\u6b21\u7b5b\u9009\u6761\u4ef6\uff0c\u6839\u636e\u6761\u4ef6\u7b5b\u9009\u5230\u3010{0}\u3011\u6761\u6570\u636e\u8fdb\u884c\u6279\u6539\uff0c\u6210\u529f\u3010{1}\u3011\u6761"), successCount + failCount, successCount));
            resultList.addMessage((Object)MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E88E87005200002", (String)"\u672c\u6b21\u6279\u6539\u8bbe\u7f6e\u4e86\u4e8c\u6b21\u7b5b\u9009\u6761\u4ef6\uff0c\u6839\u636e\u6761\u4ef6\u7b5b\u9009\u5230\u3010{0}\u3011\u6761\u6570\u636e\u8fdb\u884c\u6279\u6539\uff0c\u6210\u529f\u3010{1}\u3011\u6761"), successCount + failCount, successCount));
            resultList.addInfo((Object)MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E88E87005200002", (String)"\u672c\u6b21\u6279\u6539\u8bbe\u7f6e\u4e86\u4e8c\u6b21\u7b5b\u9009\u6761\u4ef6\uff0c\u6839\u636e\u6761\u4ef6\u7b5b\u9009\u5230\u3010{0}\u3011\u6761\u6570\u636e\u8fdb\u884c\u6279\u6539\uff0c\u6210\u529f\u3010{1}\u3011\u6761"), successCount + failCount, successCount));
        }
        ProcessData.builder((int)1, (int)200, (Object)this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()), (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A5F8D8205E8000F", (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E88E87005200003", (String)"\u6279\u6539\u5b8c\u6210"))).percentage("100").successCount(this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).getSucessCount()).failCount(this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).getFailCount()).build(pubBatchModifyEntitySaveDTO.getAsyncKey(), Integer.valueOf(pubBatchModifyEntitySaveDTO.getExpireTime()));
    }

    public void setDTOAsyncKey(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO, String asyncKey) {
        int expireTime = this.getExpireTime();
        pubBatchModifyEntitySaveDTO.setAsyncKey(asyncKey);
        pubBatchModifyEntitySaveDTO.setExpireTime(expireTime);
    }

    private int getExpireTime() {
        int expireTime = 600;
        try {
            String expireTimeConfig = this.ymsParamConfig.getMddExportProcessExpireTime();
            if (null != expireTimeConfig) {
                expireTime = Integer.parseInt(expireTimeConfig);
            }
        }
        catch (Exception var8) {
            log.error("\u6279\u6539-\u5f02\u6b65\u83b7\u53d6\u7f13\u5b58\u8d85\u65f6\u65f6\u95f4\u5f02\u5e38\uff0c\u8d70\u9ed8\u8ba4\u914d\u7f6e600\u79d2");
        }
        return expireTime;
    }

    public void batchModifyMutilEntities(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO, List<Map<String, Object>> records) throws Exception {
        List pubBatchModifyEntityListFromDB;
        if (BooleanUtil.isFalse((Object)pubBatchModifyEntitySaveDTO.getMultipleEntities())) {
            modifyTimesAccordingEntitiesMap.put(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum(), 1);
            this.batchModify(pubBatchModifyEntitySaveDTO);
            return;
        }
        HashMap<String, List<PubBatchModifyEntityFieldSaveDTO>> entityIdSavefieldMap = new HashMap<String, List<PubBatchModifyEntityFieldSaveDTO>>();
        HashMap<String, List<PubBatchModifyEntityQueryFieldSaveDTO>> entityIdQueryfieldMap = new HashMap<String, List<PubBatchModifyEntityQueryFieldSaveDTO>>();
        PubBatchModifyEntityServiceImpl.buildEntityIdFieldMap(pubBatchModifyEntitySaveDTO, entityIdSavefieldMap, entityIdQueryfieldMap);
        if (entityIdSavefieldMap.size() == 1 && entityIdQueryfieldMap.isEmpty() || entityIdSavefieldMap.size() == 1 && entityIdQueryfieldMap.size() == 1 && this.entityMapKeyIsSame(entityIdSavefieldMap, entityIdQueryfieldMap)) {
            List pubBatchModifyEntityById;
            modifyTimesAccordingEntitiesMap.put(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum(), 1);
            pubBatchModifyEntitySaveDTO.setMultipleEntities(Boolean.valueOf(false));
            String entityId = entityIdSavefieldMap.keySet().stream().findFirst().map(Object::toString).orElse(null);
            if (ObjectUtils.isEmpty((Object)entityId)) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PRODUCT_PARAM_IS_NULL);
            }
            String key = "BatchModify" + entityId;
            if (null != this.cache.getIfPresent((Object)key)) {
                pubBatchModifyEntityById = (List)this.cache.getIfPresent((Object)key);
            } else {
                pubBatchModifyEntityById = this.pubBatchModifyEntityDao.getPubBatchModifyEntityById(entityId);
                this.cache.put((Object)key, (Object)pubBatchModifyEntityById);
            }
            PubBatchModifyEntity pubBatchModifyEntity = (PubBatchModifyEntity)pubBatchModifyEntityById.get(0);
            BeanUtils.copyProperties((Object)pubBatchModifyEntity, (Object)pubBatchModifyEntitySaveDTO);
            this.batchModify(pubBatchModifyEntitySaveDTO);
            return;
        }
        String key = "BatchModify" + pubBatchModifyEntitySaveDTO.getBillNum();
        if (null != this.cache.getIfPresent((Object)key)) {
            pubBatchModifyEntityListFromDB = (List)this.cache.getIfPresent((Object)key);
        } else {
            pubBatchModifyEntityListFromDB = this.pubBatchModifyEntityDao.getPubBatchModifyEntityByBillNum(pubBatchModifyEntitySaveDTO.getBillNum());
            this.cache.put((Object)key, (Object)pubBatchModifyEntityListFromDB);
        }
        PubBatchModifyMutilEntitySaveDTO pubBatchModifyMutilEntitySaveDTO = this.convertMutilSaveEntity(pubBatchModifyEntitySaveDTO, pubBatchModifyEntityListFromDB, entityIdSavefieldMap, entityIdQueryfieldMap);
        this.batchModifyMutilEntities(pubBatchModifyEntityListFromDB, pubBatchModifyMutilEntitySaveDTO, records);
    }

    private boolean entityMapKeyIsSame(Map<String, List<PubBatchModifyEntityFieldSaveDTO>> entityIdSavefieldMap, Map<String, List<PubBatchModifyEntityQueryFieldSaveDTO>> entityIdQueryfieldMap) {
        Map.Entry<String, List<PubBatchModifyEntityFieldSaveDTO>> entitySaveFieldEntry = entityIdSavefieldMap.entrySet().iterator().next();
        Map.Entry<String, List<PubBatchModifyEntityQueryFieldSaveDTO>> entityQueryFieldEntry = entityIdQueryfieldMap.entrySet().iterator().next();
        return entitySaveFieldEntry.getKey().equals(entityQueryFieldEntry.getKey());
    }

    private void batchModifyMutilEntities(List<PubBatchModifyEntity> pubBatchModifyEntityListFromDB, PubBatchModifyMutilEntitySaveDTO pubBatchModifyMutilEntitySaveDTO, List<Map<String, Object>> records) throws Exception {
        IPubBatchModifyBillNumExtService pubBatchModifyEntityExtService;
        List modifyEntities = pubBatchModifyEntityListFromDB.stream().filter(pubBatchModifyEntity -> "1".equals(pubBatchModifyEntity.getIsMain())).collect(Collectors.toList());
        if (CollectionUtils.isEmpty(modifyEntities)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.NOT_FIND_MAIN_ENTITY);
        }
        PubBatchModifyEntity mainEntity = (PubBatchModifyEntity)modifyEntities.get(0);
        PubBatchModifyEntitySaveDTO pubBatchModifyMainEntitySaveDTO = new PubBatchModifyEntitySaveDTO();
        BeanUtils.copyProperties((Object)mainEntity, (Object)pubBatchModifyMainEntitySaveDTO);
        pubBatchModifyMainEntitySaveDTO.setIdList(pubBatchModifyMutilEntitySaveDTO.getIdList());
        pubBatchModifyMainEntitySaveDTO.setExtIdList(pubBatchModifyMutilEntitySaveDTO.getExtIdList());
        QuerySchema querySchema = this.buildQuerySchema(pubBatchModifyMainEntitySaveDTO);
        ExtPubBatchModifyCheckFieldEnum extPubBatchModifyCheckFieldEnum = ExtPubBatchModifyCheckFieldEnum.find((String)pubBatchModifyMutilEntitySaveDTO.getBillNum());
        if (extPubBatchModifyCheckFieldEnum != null && (pubBatchModifyEntityExtService = (IPubBatchModifyBillNumExtService)AppContext.getBean((String)extPubBatchModifyCheckFieldEnum.getBeanNameOrBillNum(), IPubBatchModifyBillNumExtService.class)) != null) {
            pubBatchModifyEntityExtService.initData(pubBatchModifyMutilEntitySaveDTO, this.resultListMap);
            pubBatchModifyEntityExtService.extendQuerySchema(querySchema, pubBatchModifyMutilEntitySaveDTO);
        }
        ArrayList<Object> mainEntityDataIdList = new ArrayList<Object>();
        List<Object> extIdList = new ArrayList<Object>();
        List<BizObject> bizObjectList = new ArrayList();
        if (!CollectionUtils.isEmpty(records)) {
            for (Map<String, Object> map : records) {
                if (map.get("id") != null) {
                    mainEntityDataIdList.add(map.get("id").toString());
                }
                if (map.get("productApplyRangeId") == null) continue;
                extIdList.add(map.get("productApplyRangeId").toString());
            }
        }
        if ((CollectionUtils.isEmpty(records) || this.isNeedQuery(pubBatchModifyMutilEntitySaveDTO)) && !CollectionUtils.isEmpty(bizObjectList = MetaDaoHelper.queryObject((String)pubBatchModifyMainEntitySaveDTO.getFullName(), (boolean)true, (QuerySchema)querySchema, null))) {
            for (Map<String, Object> map : bizObjectList) {
                if (map.get("id") != null) {
                    mainEntityDataIdList.add(map.get("id").toString());
                }
                if (map.get("productApplyRangeId") == null) continue;
                extIdList.add(map.get("productApplyRangeId").toString());
            }
        }
        if (CollectionUtils.isEmpty(mainEntityDataIdList) && CollectionUtils.isEmpty(extIdList)) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BATCH_MODIFY_LOGIC_ERROR);
        }
        if (CollectionUtils.isEmpty(extIdList) && !CollectionUtils.isEmpty((Collection)pubBatchModifyMutilEntitySaveDTO.getExtIdList())) {
            extIdList = pubBatchModifyMutilEntitySaveDTO.getExtIdList();
        }
        this.updateFieldAccordingEntity(pubBatchModifyMutilEntitySaveDTO, mainEntityDataIdList, extIdList);
        boolean updateFlag = this.saveEntityNeedCheckField(pubBatchModifyMutilEntitySaveDTO, bizObjectList, pubBatchModifyMainEntitySaveDTO, querySchema, mainEntityDataIdList, extIdList);
        if (!updateFlag) {
            this.addlog(pubBatchModifyMutilEntitySaveDTO, mainEntityDataIdList, extIdList);
        }
    }

    private void addlog(PubBatchModifyMutilEntitySaveDTO pubBatchModifyMutilEntitySaveDTO, List<Object> mainEntityDataIdList, List<Object> extIdList) {
        IPubBatchModifyBillNumExtService pubBatchModifyEntityExtService;
        ExtPubBatchModifyCheckFieldEnum extPubBatchModifyCheckFieldEnum = ExtPubBatchModifyCheckFieldEnum.find((String)pubBatchModifyMutilEntitySaveDTO.getBillNum());
        if (extPubBatchModifyCheckFieldEnum != null && (pubBatchModifyEntityExtService = (IPubBatchModifyBillNumExtService)AppContext.getBean((String)extPubBatchModifyCheckFieldEnum.getBeanNameOrBillNum(), IPubBatchModifyBillNumExtService.class)) != null) {
            pubBatchModifyEntityExtService.addLog(pubBatchModifyMutilEntitySaveDTO, mainEntityDataIdList, extIdList);
        }
    }

    private boolean isNeedQuery(PubBatchModifyMutilEntitySaveDTO pubBatchModifyMutilEntitySaveDTO) {
        List pubBatchModifyMutilEntityDTOList = pubBatchModifyMutilEntitySaveDTO.getPubBatchModifyMutilEntityDTOList();
        for (PubBatchModifyOnelEntityDTO pubBatchModifyOnelEntityDTO : pubBatchModifyMutilEntityDTOList) {
            if (pubBatchModifyOnelEntityDTO.getBatchModifyEntityQueryFieldSaveList() == null || pubBatchModifyOnelEntityDTO.getBatchModifyEntityQueryFieldSaveList().size() <= 0) continue;
            return true;
        }
        return false;
    }

    private boolean saveEntityNeedCheckField(PubBatchModifyMutilEntitySaveDTO pubBatchModifyMutilEntitySaveDTO, List<BizObject> bizObjectList, PubBatchModifyEntitySaveDTO pubBatchModifyMainEntitySaveDTO, QuerySchema querySchema, List<Object> mainEntityDataIdList, List<Object> extIdList) throws Exception {
        boolean updateFlag = false;
        List<PubBatchModifyOnelEntityDTO> pubBatchModifyMutilEntityNeedcheckDTOList = PubBatchModifyEntityServiceImpl.findNeedCheckEntityList(pubBatchModifyMutilEntitySaveDTO);
        if (pubBatchModifyMutilEntityNeedcheckDTOList.size() > 1 || pubBatchModifyMutilEntityNeedcheckDTOList.size() == 1 && "pc_productsku_edit".equals(pubBatchModifyMutilEntitySaveDTO.getBillNum())) {
            IPubBatchModifyBillNumExtService pubBatchModifyEntityExtService;
            if (bizObjectList.size() <= 0) {
                bizObjectList = MetaDaoHelper.queryObject((String)pubBatchModifyMainEntitySaveDTO.getFullName(), (QuerySchema)querySchema, null);
            }
            if (CollectionUtils.isEmpty(bizObjectList)) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801443, new Object[]{pubBatchModifyMainEntitySaveDTO.getEntityName()});
            }
            pubBatchModifyMutilEntitySaveDTO.setPubBatchModifyMutilEntityDTOList(pubBatchModifyMutilEntityNeedcheckDTOList);
            ExtPubBatchModifyCheckFieldEnum extPubBatchModifyCheckFieldEnum = ExtPubBatchModifyCheckFieldEnum.find((String)pubBatchModifyMutilEntitySaveDTO.getBillNum());
            if (extPubBatchModifyCheckFieldEnum != null && (pubBatchModifyEntityExtService = (IPubBatchModifyBillNumExtService)AppContext.getBean((String)extPubBatchModifyCheckFieldEnum.getBeanNameOrBillNum(), IPubBatchModifyBillNumExtService.class)) != null) {
                pubBatchModifyEntityExtService.batchModify(bizObjectList, pubBatchModifyMutilEntitySaveDTO, this.resultYtenantMap, this.resultListMap);
            }
            updateFlag = true;
        } else if (pubBatchModifyMutilEntityNeedcheckDTOList.size() == 1) {
            PubBatchModifyOnelEntityDTO pubBatchModifyOnelEntityDTO = pubBatchModifyMutilEntityNeedcheckDTOList.get(0);
            PubBatchModifyEntitySaveDTO oneEntityNeedCheckModifyDto = new PubBatchModifyEntitySaveDTO();
            BeanUtils.copyProperties((Object)pubBatchModifyOnelEntityDTO, (Object)oneEntityNeedCheckModifyDto);
            oneEntityNeedCheckModifyDto.setIdList(mainEntityDataIdList);
            oneEntityNeedCheckModifyDto.setExtIdList(extIdList);
            oneEntityNeedCheckModifyDto.setMultipleEntities(Boolean.valueOf(false));
            oneEntityNeedCheckModifyDto.setAsyncKey(pubBatchModifyMutilEntitySaveDTO.getAsyncKey());
            oneEntityNeedCheckModifyDto.setExpireTime(pubBatchModifyMutilEntitySaveDTO.getExpireTime());
            oneEntityNeedCheckModifyDto.setBillNum(pubBatchModifyMutilEntitySaveDTO.getBillNum());
            this.batchModify(oneEntityNeedCheckModifyDto);
            updateFlag = true;
        }
        return updateFlag;
    }

    @NotNull
    private static List<PubBatchModifyOnelEntityDTO> findNeedCheckEntityList(PubBatchModifyMutilEntitySaveDTO pubBatchModifyMutilEntitySaveDTO) {
        List pubBatchModifyMutilEntityDTOList = pubBatchModifyMutilEntitySaveDTO.getPubBatchModifyMutilEntityDTOList();
        ArrayList<PubBatchModifyOnelEntityDTO> pubBatchModifyMutilEntityNeedcheckDTOList = new ArrayList<PubBatchModifyOnelEntityDTO>();
        for (PubBatchModifyOnelEntityDTO pubBatchModifyOnelEntityDTO : pubBatchModifyMutilEntityDTOList) {
            if (pubBatchModifyOnelEntityDTO.getCheckFieldCount() == null || pubBatchModifyOnelEntityDTO.getCheckFieldCount() == 0) continue;
            PubBatchModifyOnelEntityDTO pubBatchModifyNewlEntityDTO = new PubBatchModifyOnelEntityDTO();
            BeanUtils.copyProperties((Object)pubBatchModifyOnelEntityDTO, (Object)pubBatchModifyNewlEntityDTO);
            ArrayList batchModifyEntityNeedcheckFieldSaveList = new ArrayList();
            if (pubBatchModifyOnelEntityDTO.getBatchModifyEntityFieldSaveList() != null && pubBatchModifyOnelEntityDTO.getBatchModifyEntityFieldSaveList().size() > 0) {
                pubBatchModifyOnelEntityDTO.getBatchModifyEntityFieldSaveList().forEach(item -> {
                    if (item.getIsCheck() != null && BooleanUtil.isTrue((Object)item.getIsCheck())) {
                        batchModifyEntityNeedcheckFieldSaveList.add(item);
                    }
                });
                pubBatchModifyNewlEntityDTO.setBatchModifyEntityFieldSaveList(batchModifyEntityNeedcheckFieldSaveList);
            }
            pubBatchModifyMutilEntityNeedcheckDTOList.add(pubBatchModifyNewlEntityDTO);
        }
        return pubBatchModifyMutilEntityNeedcheckDTOList;
    }

    private void updateFieldAccordingEntity(PubBatchModifyMutilEntitySaveDTO pubBatchModifyMutilEntitySaveDTO, List<Object> mainEntityDataIdList, List<Object> extIdList) throws Exception {
        List pubBatchModifyMutilEntityDTOList = pubBatchModifyMutilEntitySaveDTO.getPubBatchModifyMutilEntityDTOList();
        for (PubBatchModifyOnelEntityDTO pubBatchModifyOnelEntityDTO : pubBatchModifyMutilEntityDTOList) {
            if (pubBatchModifyOnelEntityDTO.getNocheckFieldCount() == null || pubBatchModifyOnelEntityDTO.getNocheckFieldCount() == 0) continue;
            PubBatchModifyEntitySaveDTO oneEntityModifyDto = new PubBatchModifyEntitySaveDTO();
            BeanUtils.copyProperties((Object)pubBatchModifyOnelEntityDTO, (Object)oneEntityModifyDto);
            oneEntityModifyDto.setIdList(mainEntityDataIdList);
            oneEntityModifyDto.setExtIdList(extIdList);
            oneEntityModifyDto.setMultipleEntities(Boolean.valueOf(true));
            oneEntityModifyDto.setBillNum(pubBatchModifyMutilEntitySaveDTO.getBillNum());
            oneEntityModifyDto.setAsyncKey(pubBatchModifyMutilEntitySaveDTO.getAsyncKey());
            oneEntityModifyDto.setExpireTime(pubBatchModifyMutilEntitySaveDTO.getExpireTime());
            ArrayList batchModifyEntityNocheckFieldSaveList = new ArrayList();
            if (oneEntityModifyDto.getBatchModifyEntityFieldSaveList() != null && oneEntityModifyDto.getBatchModifyEntityFieldSaveList().size() > 0) {
                oneEntityModifyDto.getBatchModifyEntityFieldSaveList().forEach(item -> {
                    if (item.getIsCheck() != null && BooleanUtil.isFalse((Object)item.getIsCheck())) {
                        batchModifyEntityNocheckFieldSaveList.add(item);
                    }
                });
                oneEntityModifyDto.setBatchModifyEntityFieldSaveList(batchModifyEntityNocheckFieldSaveList);
            }
            oneEntityModifyDto.setUpdateLog(Boolean.valueOf(false));
            this.batchModify(oneEntityModifyDto);
        }
    }

    private PubBatchModifyMutilEntitySaveDTO convertMutilSaveEntity(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO, List<PubBatchModifyEntity> pubBatchModifyEntityList, Map<String, List<PubBatchModifyEntityFieldSaveDTO>> entityIdSavefieldMap, Map<String, List<PubBatchModifyEntityQueryFieldSaveDTO>> entityIdQueryfieldMap) {
        PubBatchModifyMutilEntitySaveDTO pubBatchModifyMutilEntitySaveDTO = new PubBatchModifyMutilEntitySaveDTO();
        pubBatchModifyMutilEntitySaveDTO.setAsyncKey(pubBatchModifyEntitySaveDTO.getAsyncKey());
        pubBatchModifyMutilEntitySaveDTO.setExpireTime(pubBatchModifyEntitySaveDTO.getExpireTime());
        pubBatchModifyMutilEntitySaveDTO.setBillNum(pubBatchModifyEntitySaveDTO.getBillNum());
        pubBatchModifyMutilEntitySaveDTO.setIdList(pubBatchModifyEntitySaveDTO.getIdList());
        pubBatchModifyMutilEntitySaveDTO.setExtIdList(pubBatchModifyEntitySaveDTO.getExtIdList());
        ArrayList<PubBatchModifyOnelEntityDTO> pubBatchModifyOnelEntityDTOList = new ArrayList<PubBatchModifyOnelEntityDTO>();
        int count = 0;
        boolean flag = false;
        if (pubBatchModifyEntityList != null && pubBatchModifyEntityList.size() > 0) {
            for (PubBatchModifyEntity batchModifyEntity : pubBatchModifyEntityList) {
                if (!entityIdSavefieldMap.containsKey(batchModifyEntity.getId()) && !entityIdQueryfieldMap.containsKey(batchModifyEntity.getId())) continue;
                PubBatchModifyOnelEntityDTO pubBatchModifyEntitySaveDTOOne = new PubBatchModifyOnelEntityDTO();
                pubBatchModifyEntitySaveDTOOne.setFullName(batchModifyEntity.getFullName());
                pubBatchModifyEntitySaveDTOOne.setEntityName(batchModifyEntity.getEntityName());
                pubBatchModifyEntitySaveDTOOne.setIsMain(batchModifyEntity.getIsMain());
                pubBatchModifyEntitySaveDTOOne.setPrimaryKey(batchModifyEntity.getPrimaryKey());
                pubBatchModifyEntitySaveDTOOne.setForeignKey(batchModifyEntity.getForeignKey());
                if (entityIdSavefieldMap.get(batchModifyEntity.getId()) != null && entityIdSavefieldMap.get(batchModifyEntity.getId()).size() > 0) {
                    int checkFieldCount = 0;
                    int nocheckFieldCount = 0;
                    for (PubBatchModifyEntityFieldSaveDTO pubBatchModifyEntityFieldSaveDTO : entityIdSavefieldMap.get(batchModifyEntity.getId())) {
                        if (pubBatchModifyEntityFieldSaveDTO.getIsCheck() != null && BooleanUtil.isTrue((Object)pubBatchModifyEntityFieldSaveDTO.getIsCheck())) {
                            ++checkFieldCount;
                        } else if (pubBatchModifyEntityFieldSaveDTO.getIsCheck() != null && BooleanUtil.isFalse((Object)pubBatchModifyEntityFieldSaveDTO.getIsCheck())) {
                            ++nocheckFieldCount;
                        }
                        pubBatchModifyEntitySaveDTOOne.setNocheckFieldCount(Integer.valueOf(nocheckFieldCount));
                        pubBatchModifyEntitySaveDTOOne.setCheckFieldCount(Integer.valueOf(checkFieldCount));
                    }
                }
                pubBatchModifyEntitySaveDTOOne.setBatchModifyEntityFieldSaveList(entityIdSavefieldMap.get(batchModifyEntity.getId()));
                pubBatchModifyEntitySaveDTOOne.setBatchModifyEntityQueryFieldSaveList(entityIdQueryfieldMap.get(batchModifyEntity.getId()));
                if (pubBatchModifyEntitySaveDTOOne.getNocheckFieldCount() > 0) {
                    ++count;
                }
                if (pubBatchModifyEntitySaveDTOOne.getCheckFieldCount() > 0) {
                    flag = true;
                }
                pubBatchModifyOnelEntityDTOList.add(pubBatchModifyEntitySaveDTOOne);
            }
        }
        pubBatchModifyMutilEntitySaveDTO.setPubBatchModifyMutilEntityDTOList(pubBatchModifyOnelEntityDTOList);
        int countEntity = flag ? count + 1 : count;
        modifyTimesAccordingEntitiesMap.put(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum(), countEntity);
        return pubBatchModifyMutilEntitySaveDTO;
    }

    private static void buildEntityIdFieldMap(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO, Map<String, List<PubBatchModifyEntityFieldSaveDTO>> entityIdSavefieldMap, Map<String, List<PubBatchModifyEntityQueryFieldSaveDTO>> entityIdQueryfieldMap) {
        if (pubBatchModifyEntitySaveDTO.getBatchModifyEntityFieldSaveList() != null) {
            pubBatchModifyEntitySaveDTO.getBatchModifyEntityFieldSaveList().forEach(batchModifyEntityFieldSaveDTO -> {
                String batchModifyEntityId = batchModifyEntityFieldSaveDTO.getBatchModifyEntityId();
                List entityIdSavefieldList = entityIdSavefieldMap.getOrDefault(batchModifyEntityId, new ArrayList());
                entityIdSavefieldList.add(batchModifyEntityFieldSaveDTO);
                entityIdSavefieldMap.put(batchModifyEntityId, entityIdSavefieldList);
            });
        }
        if (pubBatchModifyEntitySaveDTO.getBatchModifyEntityQueryFieldSaveList() != null) {
            pubBatchModifyEntitySaveDTO.getBatchModifyEntityQueryFieldSaveList().forEach(batchModifyEntityQueryFieldSaveDTO -> {
                String batchModifyEntityId = batchModifyEntityQueryFieldSaveDTO.getBatchModifyEntityId();
                List entityIdQueryfieldList = entityIdQueryfieldMap.getOrDefault(batchModifyEntityId, new ArrayList());
                entityIdQueryfieldList.add(batchModifyEntityQueryFieldSaveDTO);
                entityIdQueryfieldMap.put(batchModifyEntityId, entityIdQueryfieldList);
            });
        }
        if (entityIdQueryfieldMap != null) {
            entityIdQueryfieldMap.keySet().forEach(key -> {
                if (!entityIdSavefieldMap.containsKey(key)) {
                    throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.BATCH_MODIFY_ERROR);
                }
            });
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void batchModify(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) throws Exception {
        IPubBatchModifyEntityExtService pubBatchModifyEntityExtService;
        ExtPubBatchModifyCheckFieldEnum extPubBatchModifyCheckFieldEnum;
        List batchModifyEntityFieldSaveList = pubBatchModifyEntitySaveDTO.getBatchModifyEntityFieldSaveList();
        if (CollectionUtils.isEmpty((Collection)batchModifyEntityFieldSaveList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801442);
        }
        HashMap<String, Object> pubBatchModifyEntityFieldSaveMap = new HashMap<String, Object>();
        HashMap<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap = new HashMap<String, Object>();
        HashMap<String, Object> pubBatchModifyEntityCharacterFieldSaveMap = new HashMap<String, Object>();
        HashMap<String, Map<String, Object>> pubBatchModifyEntityCharacterKeyMap = new HashMap();
        PubBatchModifyEntityServiceImpl.initFieldMap(batchModifyEntityFieldSaveList, pubBatchModifyEntityFieldSaveIsCheckMap, pubBatchModifyEntityCharacterFieldSaveMap, pubBatchModifyEntityFieldSaveMap);
        QuerySchema querySchema = this.buildQuerySchema(pubBatchModifyEntitySaveDTO);
        if (!CollectionUtils.isEmpty(pubBatchModifyEntityCharacterFieldSaveMap)) {
            pubBatchModifyEntityCharacterKeyMap = this.dealPubBatchModifyEntityCharacterFieldSaveMap(pubBatchModifyEntityCharacterFieldSaveMap, pubBatchModifyEntitySaveDTO, querySchema);
        }
        if ((extPubBatchModifyCheckFieldEnum = ExtPubBatchModifyCheckFieldEnum.find((String)pubBatchModifyEntitySaveDTO.getFullName())) != null && (pubBatchModifyEntityExtService = (IPubBatchModifyEntityExtService)AppContext.getBean((String)extPubBatchModifyCheckFieldEnum.getBeanNameOrBillNum(), IPubBatchModifyEntityExtService.class)) != null) {
            pubBatchModifyEntityExtService.initData(pubBatchModifyEntitySaveDTO, this.resultListMap);
            pubBatchModifyEntityExtService.extendQuerySchema(querySchema, pubBatchModifyEntitySaveDTO);
            if (!pubBatchModifyEntityFieldSaveIsCheckMap.isEmpty()) {
                pubBatchModifyEntityExtService.supplementaryReminder(pubBatchModifyEntityFieldSaveIsCheckMap);
            }
            if (!pubBatchModifyEntityFieldSaveMap.isEmpty()) {
                pubBatchModifyEntityExtService.checkBatchModifyEntityFieldSaveMap(pubBatchModifyEntityFieldSaveMap);
            }
        }
        int count = this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).getCount();
        int failCount = this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).getFailCount();
        if (failCount >= count) {
            return;
        }
        List bizObjectList = MetaDaoHelper.queryObject((String)pubBatchModifyEntitySaveDTO.getFullName(), (boolean)true, (QuerySchema)querySchema, null);
        if (CollectionUtils.isEmpty((Collection)bizObjectList)) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801443, new Object[]{pubBatchModifyEntitySaveDTO.getEntityName()});
        }
        HashMap<String, Map<String, Object>> finalPubBatchModifyEntityCharacterKeyMap = pubBatchModifyEntityCharacterKeyMap;
        for (BizObject bizObject : bizObjectList) {
            if (bizObject.get("id") == null && bizObject.get("code") == null) {
                throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.EXT_IS_NULL);
            }
            String code = bizObject.get("code") == null ? bizObject.get("id").toString() : bizObject.get("code").toString();
            String uniqueIdentifier = bizObject.get("code") == null ? bizObject.get("id").toString() : bizObject.get("code").toString();
            uniqueIdentifier = ModifyUtils.createDataIdentifier(pubBatchModifyEntitySaveDTO.getBillNum(), bizObject, uniqueIdentifier);
            try {
                this.modifyDataAccordingEntity(pubBatchModifyEntitySaveDTO, bizObject, pubBatchModifyEntityFieldSaveMap, finalPubBatchModifyEntityCharacterKeyMap, pubBatchModifyEntityFieldSaveIsCheckMap);
                this.updateResultList(pubBatchModifyEntitySaveDTO, uniqueIdentifier, code, true, null);
            }
            catch (Exception e) {
                String errorMessage = String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1B57FC1805A00006", (String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E88E87005200001", (String)"%s\u3010%s\u3011\u6279\u6539\u90e8\u5206\u5b57\u6bb5\u5931\u8d25,\u539f\u56e0\u4e3a[%s]")), pubBatchModifyEntitySaveDTO.getEntityName(), code, e.getMessage());
                log.error("pubBatchModify\u6279\u6539\u5f02\u5e38\u4fe1\u606f:" + e.getMessage(), (Throwable)e);
                this.updateResultList(pubBatchModifyEntitySaveDTO, uniqueIdentifier, code, false, errorMessage);
            }
            finally {
                this.updateProgress(pubBatchModifyEntitySaveDTO);
            }
        }
    }

    private void updateResultList(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO, String uniqueIdentifier, String code, boolean success, String str) {
        ConcurrentHashMap<String, Boolean> resultMap = this.resultYtenantMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum());
        if (success) {
            if (resultMap.containsKey(uniqueIdentifier)) {
                Boolean codeRes = resultMap.get(uniqueIdentifier);
                resultMap.put(uniqueIdentifier, codeRes != false);
            } else {
                resultMap.put(uniqueIdentifier, true);
            }
            this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).incResultCount(true);
        } else {
            this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).incResultCount(false);
            resultMap.put(uniqueIdentifier, false);
            if (this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).getMessages().size() <= 500) {
                this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).addInfo((Object)str);
                this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).addErrorMessage(str);
                this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).addFailInfo((Object)str);
            }
        }
    }

    private void updateProgress(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) {
        double percent = (double)(this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).getSucessCount() + this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).getFailCount()) / (double)(this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()).getCount() * modifyTimesAccordingEntitiesMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum())) * 100.0 - 0.5;
        BigDecimal bigDecimal = new BigDecimal(percent);
        BigDecimal percentage = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        if (percentage.doubleValue() >= 100.0) {
            percentage = new BigDecimal(99);
        }
        ProcessData.builder((int)1, (int)200, (Object)this.resultListMap.get(AppContext.getYTenantId() + pubBatchModifyEntitySaveDTO.getBillNum()), null).percentage(percentage.toString()).build(pubBatchModifyEntitySaveDTO.getAsyncKey(), Integer.valueOf(pubBatchModifyEntitySaveDTO.getExpireTime()));
    }

    @Transactional(rollbackFor={Exception.class})
    public void modifyDataAccordingEntity(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO, BizObject bizObject, Map<String, Object> pubBatchModifyEntityFieldSaveMap, Map<String, Map<String, Object>> pubBatchModifyEntityCharacterKeyMap, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap) throws Exception {
        IPubBatchModifyEntityExtService pubBatchModifyEntityExtService;
        Object pubBatchModifyEntityExtService2;
        ExtPubBatchModifyCheckFieldEnum extPubBatchModifyCheckFieldEnum = ExtPubBatchModifyCheckFieldEnum.find((String)pubBatchModifyEntitySaveDTO.getFullName());
        BizObject bizObjectUpdate = new BizObject((Map)bizObject);
        if (extPubBatchModifyCheckFieldEnum != null && (pubBatchModifyEntityExtService2 = (IPubBatchModifyEntityExtService)AppContext.getBean((String)extPubBatchModifyCheckFieldEnum.getBeanNameOrBillNum(), IPubBatchModifyEntityExtService.class)) != null) {
            pubBatchModifyEntityExtService2.checkBatchModifyEntity(bizObject);
        }
        if (!pubBatchModifyEntityFieldSaveMap.isEmpty()) {
            for (String key : pubBatchModifyEntityFieldSaveMap.keySet()) {
                bizObjectUpdate.put(key, pubBatchModifyEntityFieldSaveMap.get(key));
            }
            bizObjectUpdate.setEntityStatus(EntityStatus.Update);
        }
        if (!CollectionUtils.isEmpty(pubBatchModifyEntityCharacterKeyMap)) {
            for (String characterKey : pubBatchModifyEntityCharacterKeyMap.keySet()) {
                BizObject characterBizObject = bizObject.getBizObject(characterKey, BizObject.class);
                if (!CollectionUtils.isEmpty((Map)characterBizObject)) {
                    characterBizObject.putAll(pubBatchModifyEntityCharacterKeyMap.get(characterKey));
                    characterBizObject.setEntityStatus(EntityStatus.Update);
                } else {
                    characterBizObject = new BizObject();
                    characterBizObject.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                    characterBizObject.putAll(pubBatchModifyEntityCharacterKeyMap.get(characterKey));
                    characterBizObject.setEntityStatus(EntityStatus.Insert);
                }
                bizObjectUpdate.set(characterKey, (Object)characterBizObject);
                bizObjectUpdate.setEntityStatus(EntityStatus.Update);
            }
        }
        boolean flag = false;
        BizObject newBizObjectUpdate = ModifyUtils.convertBizObjectByFullName(bizObjectUpdate, pubBatchModifyEntitySaveDTO.getFullName());
        if (EntityStatus.Update.equals((Object)newBizObjectUpdate.getEntityStatus())) {
            if (extPubBatchModifyCheckFieldEnum != null && (pubBatchModifyEntityExtService = (IPubBatchModifyEntityExtService)AppContext.getBean((String)extPubBatchModifyCheckFieldEnum.getBeanNameOrBillNum(), IPubBatchModifyEntityExtService.class)) != null) {
                if (!pubBatchModifyEntityFieldSaveIsCheckMap.isEmpty() && !pubBatchModifyEntitySaveDTO.getMultipleEntities().booleanValue()) {
                    pubBatchModifyEntitySaveDTO.setUpdateLog(Boolean.valueOf(false));
                }
                flag = true;
                pubBatchModifyEntityExtService.update(pubBatchModifyEntitySaveDTO.getFullName(), newBizObjectUpdate, pubBatchModifyEntitySaveDTO);
            }
            if (!flag) {
                MetaDaoHelper.update((String)pubBatchModifyEntitySaveDTO.getFullName(), (BizObject)newBizObjectUpdate);
            }
        }
        if (!pubBatchModifyEntityFieldSaveIsCheckMap.isEmpty() && extPubBatchModifyCheckFieldEnum != null && (pubBatchModifyEntityExtService = (IPubBatchModifyEntityExtService)AppContext.getBean((String)extPubBatchModifyCheckFieldEnum.getBeanNameOrBillNum(), IPubBatchModifyEntityExtService.class)) != null) {
            pubBatchModifyEntityExtService.batchModifyIsCheckField(bizObject, pubBatchModifyEntityFieldSaveIsCheckMap, pubBatchModifyEntitySaveDTO);
        }
    }

    private static void initFieldMap(List<PubBatchModifyEntityFieldSaveDTO> batchModifyEntityFieldSaveList, Map<String, Object> pubBatchModifyEntityFieldSaveIsCheckMap, Map<String, Object> pubBatchModifyEntityCharacterFieldSaveMap, Map<String, Object> pubBatchModifyEntityFieldSaveMap) {
        for (PubBatchModifyEntityFieldSaveDTO pubBatchModifyEntityFieldSaveDTO : batchModifyEntityFieldSaveList) {
            if (BooleanUtil.isTrue((Object)pubBatchModifyEntityFieldSaveDTO.getIsCharacter())) {
                if (BooleanUtil.isTrue((Object)pubBatchModifyEntityFieldSaveDTO.getIsCheck())) {
                    pubBatchModifyEntityFieldSaveIsCheckMap.put(pubBatchModifyEntityFieldSaveDTO.getFieldName(), pubBatchModifyEntityFieldSaveDTO.getValue());
                    continue;
                }
                pubBatchModifyEntityCharacterFieldSaveMap.put(pubBatchModifyEntityFieldSaveDTO.getFieldName(), pubBatchModifyEntityFieldSaveDTO.getValue());
                continue;
            }
            if (BooleanUtil.isTrue((Object)pubBatchModifyEntityFieldSaveDTO.getIsCheck())) {
                pubBatchModifyEntityFieldSaveIsCheckMap.put(pubBatchModifyEntityFieldSaveDTO.getFieldName(), pubBatchModifyEntityFieldSaveDTO.getValue());
                continue;
            }
            pubBatchModifyEntityFieldSaveMap.put(pubBatchModifyEntityFieldSaveDTO.getFieldName(), pubBatchModifyEntityFieldSaveDTO.getValue());
        }
    }

    public QuerySchema buildQuerySchema(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO) {
        QuerySchema querySchema = QuerySchema.create();
        querySchema.addSelect(pubBatchModifyEntitySaveDTO.getPrimaryKey());
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (!CollectionUtils.isEmpty((Collection)pubBatchModifyEntitySaveDTO.getIdList())) {
            if ("0".equals(pubBatchModifyEntitySaveDTO.getIsMain())) {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)pubBatchModifyEntitySaveDTO.getForeignKey()).in(new HashSet(pubBatchModifyEntitySaveDTO.getIdList())));
            } else {
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)pubBatchModifyEntitySaveDTO.getPrimaryKey()).in(new HashSet(pubBatchModifyEntitySaveDTO.getIdList())));
            }
        }
        List batchModifyEntityQueryFieldSaveList = pubBatchModifyEntitySaveDTO.getBatchModifyEntityQueryFieldSaveList();
        this.processQueryFields(pubBatchModifyEntitySaveDTO, batchModifyEntityQueryFieldSaveList, queryConditionGroup);
        querySchema.addCondition((ConditionExpression)queryConditionGroup);
        return querySchema;
    }

    public void processQueryFields(PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO, List<PubBatchModifyEntityQueryFieldSaveDTO> batchModifyEntityQueryFieldSaveList, QueryConditionGroup queryConditionGroup) {
        if (!CollectionUtils.isEmpty(batchModifyEntityQueryFieldSaveList)) {
            for (PubBatchModifyEntityQueryFieldSaveDTO pubBatchModifyEntityQueryFieldSaveDTO : batchModifyEntityQueryFieldSaveList) {
                if (pubBatchModifyEntityQueryFieldSaveDTO.getValue() != null) {
                    if (pubBatchModifyEntityQueryFieldSaveDTO.isMultiple()) {
                        List<String> rangesId = Arrays.asList(StringUtils.split((String)pubBatchModifyEntityQueryFieldSaveDTO.getValue().toString(), (String)","));
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)pubBatchModifyEntityQueryFieldSaveDTO.getFieldName()).in(rangesId));
                        continue;
                    }
                    if (MultiLangUtils.isMultilingualFormat((Object)pubBatchModifyEntityQueryFieldSaveDTO.getValue())) {
                        queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)pubBatchModifyEntityQueryFieldSaveDTO.getFieldName()).eq((Object)MultiLangUtils.getLocalValue((Object)pubBatchModifyEntityQueryFieldSaveDTO.getValue())));
                        continue;
                    }
                    queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)pubBatchModifyEntityQueryFieldSaveDTO.getFieldName()).eq(pubBatchModifyEntityQueryFieldSaveDTO.getValue()));
                    continue;
                }
                queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)pubBatchModifyEntityQueryFieldSaveDTO.getFieldName()).is_null());
            }
        } else if ("0".equals(pubBatchModifyEntitySaveDTO.getIsMain()) && CollectionUtils.isEmpty((Collection)pubBatchModifyEntitySaveDTO.getExtIdList())) {
            throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801444);
        }
    }

    private PubBatchModifyEntityVO initPubBatchModifyEntityVO(PubBatchModifyEntity pubBatchModifyEntity) {
        PubBatchModifyEntityVO pubBatchModifyEntityVO = new PubBatchModifyEntityVO();
        pubBatchModifyEntityVO.setId((String)pubBatchModifyEntity.getId());
        pubBatchModifyEntityVO.setBillNum(pubBatchModifyEntity.getBillNum());
        pubBatchModifyEntityVO.setFullName(pubBatchModifyEntity.getFullName());
        if (!StringUtils.isEmpty((CharSequence)pubBatchModifyEntity.getEntityNameResId())) {
            pubBatchModifyEntityVO.setEntityName(InternationalUtils.getMessageWithDefault((String)pubBatchModifyEntity.getEntityNameResId(), (String)pubBatchModifyEntity.getEntityName()));
        } else {
            pubBatchModifyEntityVO.setEntityName(pubBatchModifyEntity.getEntityName());
        }
        pubBatchModifyEntityVO.setEntityNameResId(pubBatchModifyEntity.getEntityNameResId());
        pubBatchModifyEntityVO.setIsMain(pubBatchModifyEntity.getIsMain());
        pubBatchModifyEntityVO.setForeignKey(pubBatchModifyEntity.getForeignKey());
        pubBatchModifyEntityVO.setPrimaryKey(pubBatchModifyEntity.getPrimaryKey());
        return pubBatchModifyEntityVO;
    }

    private PubBatchModifyEntityFieldVO initPubBatchModifyEntityFieldVO(PubBatchModifyEntityField pubBatchModifyEntityField) {
        PubBatchModifyEntityFieldVO pubBatchModifyEntityFieldVO = new PubBatchModifyEntityFieldVO();
        pubBatchModifyEntityFieldVO.setId((String)pubBatchModifyEntityField.getId());
        pubBatchModifyEntityFieldVO.setBatchModifyEntityId(pubBatchModifyEntityField.getBatchModifyEntityId());
        pubBatchModifyEntityFieldVO.setBatchModifyEntityFullName(pubBatchModifyEntityField.getBatchModifyEntityFullName());
        pubBatchModifyEntityFieldVO.setFieldName(pubBatchModifyEntityField.getFieldName());
        pubBatchModifyEntityFieldVO.setCItemName(pubBatchModifyEntityField.getFieldName());
        if (!StringUtils.isEmpty((CharSequence)pubBatchModifyEntityField.getFieldCaptionResId())) {
            pubBatchModifyEntityFieldVO.setFieldCaption(InternationalUtils.getMessageWithDefault((String)pubBatchModifyEntityField.getFieldCaptionResId(), (String)pubBatchModifyEntityField.getFieldCaption()));
        } else {
            pubBatchModifyEntityFieldVO.setFieldCaption(pubBatchModifyEntityField.getFieldCaption());
        }
        pubBatchModifyEntityFieldVO.setFieldCaptionResId(pubBatchModifyEntityField.getFieldCaptionResId());
        pubBatchModifyEntityFieldVO.setCName(pubBatchModifyEntityField.getUiModelName());
        pubBatchModifyEntityFieldVO.setIsCheck(pubBatchModifyEntityField.getIsCheck());
        pubBatchModifyEntityFieldVO.setControlType(pubBatchModifyEntityField.getControlType());
        pubBatchModifyEntityFieldVO.setEnumType(pubBatchModifyEntityField.getEnumType());
        if (!StringUtils.isEmpty((CharSequence)pubBatchModifyEntityField.getEnumType())) {
            List pubBatchModifyEnumValueList = this.pubBatchModifyEntityDao.getEnumBuEnumType(pubBatchModifyEntityField.getEnumType());
            if (!CollectionUtils.isEmpty((Collection)pubBatchModifyEnumValueList)) {
                HashMap<String, String> coreDocBatchEnumValueMap = new HashMap<String, String>();
                for (PubBatchModifyEnumValue pubBatchModifyEnumValue : pubBatchModifyEnumValueList) {
                    coreDocBatchEnumValueMap.put(pubBatchModifyEnumValue.getEnumCode(), InternationalUtils.getMessageWithDefault((String)pubBatchModifyEnumValue.getEnumNameResId(), (String)pubBatchModifyEnumValue.getEnumName()));
                }
                pubBatchModifyEntityFieldVO.setEnumValue(JSON.toJSONString(coreDocBatchEnumValueMap));
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801445);
            }
        }
        if (!StringUtils.isEmpty((CharSequence)pubBatchModifyEntityField.getNumPoint())) {
            pubBatchModifyEntityFieldVO.setINumPoint(Integer.valueOf(Integer.parseInt(pubBatchModifyEntityField.getNumPoint())));
        }
        pubBatchModifyEntityFieldVO.setIsMultiple(pubBatchModifyEntityField.getIsMultiple());
        pubBatchModifyEntityFieldVO.setIsMultipleSave(pubBatchModifyEntityFieldVO.getIsMultipleSave());
        pubBatchModifyEntityFieldVO.setRefType(pubBatchModifyEntityField.getRefType());
        pubBatchModifyEntityFieldVO.setRefRetId(pubBatchModifyEntityField.getRefRetId());
        pubBatchModifyEntityFieldVO.setRefReturn(pubBatchModifyEntityField.getRefReturn());
        pubBatchModifyEntityFieldVO.setIsCharacter(pubBatchModifyEntityField.getIsCharacter());
        return pubBatchModifyEntityFieldVO;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void dealPubBatchModifyEntityCharacterFieldVO(PubBatchModifyEntityField pubBatchModifyEntityField, List<PubBatchModifyEntityFieldVO> batchModifyQueryFieldList, List<PubBatchModifyEntityFieldVO> batchModifySaveFieldList) {
        if (StringUtils.isEmpty((CharSequence)pubBatchModifyEntityField.getCharacterDefineFullName())) throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801446);
        try {
            ArrayList<String> bizUris = new ArrayList<String>();
            bizUris.add(pubBatchModifyEntityField.getBatchModifyEntityFullName());
            List result = CharacterViewModelFunction.getCharacterViewModelByUriFunc(bizUris);
            if (CollectionUtils.isEmpty((Collection)result) || CollectionUtils.isEmpty((Collection)((CharacterViewModelDto)result.get(0)).getCharacterDetailDtos())) return;
            List characterDetailDtoList = ((CharacterViewModelDto)result.get(0)).getCharacterDetailDtos();
            for (CharacterDetailDto characterDetailDto : characterDetailDtoList) {
                if ("imagelist".equals(characterDetailDto.getControlType()) || "filelist".equals(characterDetailDto.getControlType())) continue;
                PubBatchModifyEntityFieldVO pubBatchModifyEntityFieldVO = this.initPubBatchModifyEntityCharacterFieldVO(characterDetailDto, pubBatchModifyEntityField);
                if (BooleanUtil.isTrue((Object)pubBatchModifyEntityField.getIsQueryFields())) {
                    batchModifyQueryFieldList.add(pubBatchModifyEntityFieldVO);
                }
                if (!BooleanUtil.isTrue((Object)pubBatchModifyEntityField.getIsBatchFields())) continue;
                batchModifySaveFieldList.add(pubBatchModifyEntityFieldVO);
            }
            return;
        }
        catch (Exception e) {
            log.error("\u6279\u6539\u5904\u7406\u7279\u5f81\u5b57\u6bb5\u5f02\u5e38dealPubBatchModifyEntityCharacterFieldVO" + e.getMessage(), (Throwable)e);
            return;
        }
    }

    private Map<String, Map<String, Object>> dealPubBatchModifyEntityCharacterFieldSaveMap(Map<String, Object> pubBatchModifyEntityCharacterFieldSaveMap, PubBatchModifyEntitySaveDTO pubBatchModifyEntitySaveDTO, QuerySchema querySchema) throws Exception {
        HashMap<String, Map<String, Object>> pubBatchModifyEntityCharacterKeyMap = new HashMap<String, Map<String, Object>>();
        if (!CollectionUtils.isEmpty(pubBatchModifyEntityCharacterFieldSaveMap)) {
            List pubBatchModifyEntityCharacterFieldList = this.pubBatchModifyEntityDao.getPubBatchModifyEntityCharacterFieldByEntityFullName(pubBatchModifyEntitySaveDTO.getFullName());
            if (!CollectionUtils.isEmpty((Collection)pubBatchModifyEntityCharacterFieldList)) {
                for (PubBatchModifyEntityField pubBatchModifyEntityCharacterField : pubBatchModifyEntityCharacterFieldList) {
                    boolean contains = false;
                    for (String key : pubBatchModifyEntityCharacterFieldSaveMap.keySet()) {
                        Map<String, Object> characterMap;
                        if (!key.contains(pubBatchModifyEntityCharacterField.getFieldName())) continue;
                        if (!CollectionUtils.isEmpty((Map)((Map)pubBatchModifyEntityCharacterKeyMap.get(pubBatchModifyEntityCharacterField.getFieldName())))) {
                            characterMap = (Map)pubBatchModifyEntityCharacterKeyMap.get(pubBatchModifyEntityCharacterField.getFieldName());
                            characterMap.put(key.replace(pubBatchModifyEntityCharacterField.getFieldName() + ".", ""), pubBatchModifyEntityCharacterFieldSaveMap.get(key));
                            pubBatchModifyEntityCharacterKeyMap.put(pubBatchModifyEntityCharacterField.getFieldName(), characterMap);
                        } else {
                            characterMap = new HashMap<String, Object>();
                            characterMap.put(key.replace(pubBatchModifyEntityCharacterField.getFieldName() + ".", ""), pubBatchModifyEntityCharacterFieldSaveMap.get(key));
                            pubBatchModifyEntityCharacterKeyMap.put(pubBatchModifyEntityCharacterField.getFieldName(), characterMap);
                        }
                        contains = true;
                    }
                    if (!contains) continue;
                    querySchema.addSelect(pubBatchModifyEntityCharacterField.getFieldName());
                }
            } else {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801447);
            }
        }
        return pubBatchModifyEntityCharacterKeyMap;
    }

    public void setExtentBatchModifyField(PubBatchModifyEntity pubBatchModifyEntity, List<PubBatchModifyEntityFieldVO> batchModifySaveFieldList, List<PubBatchModifyEntityFieldVO> batchModifyQueryFieldList) throws Exception {
        List<ExtBusinessProperty> extBusinessPropertyList = this.getMetaExtentProperty(pubBatchModifyEntity, batchModifySaveFieldList, batchModifyQueryFieldList);
        if (!CollectionUtils.isEmpty(extBusinessPropertyList)) {
            Map<String, Field> fieldExtentMap = this.getViewModelExtentField(pubBatchModifyEntity);
            if (CollectionUtils.isEmpty(fieldExtentMap)) {
                return;
            }
            for (ExtBusinessProperty extBusinessProperty : extBusinessPropertyList) {
                Field extendField = fieldExtentMap.get(extBusinessProperty.getName());
                if (extendField == null) {
                    for (String key : fieldExtentMap.keySet()) {
                        if (!key.contains(extBusinessProperty.getName() + ".")) continue;
                        extendField = fieldExtentMap.get(key);
                    }
                }
                if (extendField == null) continue;
                PubBatchModifyEntityFieldVO pubBatchModifyEntityFieldVO = this.initPubBatchModifyEntityExtendFieldVO(extBusinessProperty, extendField, pubBatchModifyEntity);
                if (!pubBatchModifyEntityFieldVO.isMultiple()) {
                    batchModifyQueryFieldList.add(pubBatchModifyEntityFieldVO);
                }
                batchModifySaveFieldList.add(pubBatchModifyEntityFieldVO);
            }
        }
    }

    public Map<String, Field> getViewModelExtentField(PubBatchModifyEntity pubBatchModifyEntity) throws Exception {
        LinkedHashSet entities;
        HashMap<String, Field> fieldExtentMap = new HashMap<String, Field>();
        ViewModel viewModel = UIMetaUtils.getViewModel((String)pubBatchModifyEntity.getBillNum(), null);
        if (viewModel != null && !CollectionUtils.isEmpty((Collection)(entities = viewModel.getEntities()))) {
            for (com.yonyou.ucf.mdd.common.model.uimeta.ui.Entity entity : entities) {
                if (!pubBatchModifyEntity.getFullName().equals(entity.getDataSourceName())) continue;
                List fields = entity.getFields();
                if (CollectionUtils.isEmpty((Collection)fields)) break;
                for (Field field : fields) {
                    if (field.getiSystem() == null || field.getiSystem() != 0 || !BooleanUtil.isFalse((Object)field.getHidden()) || "rate".equals(field.getControlType()) || "map".equals(field.getControlType()) || "inputidentity".equals(field.getControlType()) || "filelist".equals(field.getControlType()) || "pictureupload".equals(field.getControlType())) continue;
                    fieldExtentMap.put(field.getFieldName(), field);
                }
            }
        }
        return fieldExtentMap;
    }

    public List<ExtBusinessProperty> getMetaExtentProperty(PubBatchModifyEntity pubBatchModifyEntity, List<PubBatchModifyEntityFieldVO> batchModifySaveFieldList, List<PubBatchModifyEntityFieldVO> batchModifyQueryFieldList) {
        Entity tenantEntity = BizContext.getMetaRepository().entity(pubBatchModifyEntity.getFullName());
        Entity zeroEntity = (Entity)RobotExecutors.runAs((String)"0", () -> BizContext.getMetaRepository().entity(pubBatchModifyEntity.getFullName()));
        HashMap zeroPropertyMap = new HashMap();
        zeroEntity.attributes().forEach(zeroProperty -> zeroPropertyMap.put(zeroProperty.name(), zeroProperty));
        if (batchModifySaveFieldList != null) {
            batchModifySaveFieldList.stream().filter(s -> pubBatchModifyEntity.getFullName().equals(s.getBatchModifyEntityFullName())).forEach(s -> {
                Property property;
                if (zeroPropertyMap.containsKey(s.getFieldName()) && "String".equalsIgnoreCase((property = (Property)zeroPropertyMap.get(s.getFieldName())).getTypeUri())) {
                    s.setIMaxLength(property.iLength());
                }
            });
        }
        if (batchModifyQueryFieldList != null) {
            batchModifyQueryFieldList.stream().filter(s -> pubBatchModifyEntity.getFullName().equals(s.getBatchModifyEntityFullName())).forEach(s -> {
                Property property;
                if (zeroPropertyMap.containsKey(s.getFieldName()) && "String".equalsIgnoreCase((property = (Property)zeroPropertyMap.get(s.getFieldName())).getTypeUri())) {
                    s.setIMaxLength(property.iLength());
                }
            });
        }
        ArrayList<ExtBusinessProperty> extBusinessPropertieList = new ArrayList<ExtBusinessProperty>();
        tenantEntity.attributes().forEach(tenantProperty -> {
            if (!(zeroPropertyMap.containsKey(tenantProperty.name()) || "attachment".equals(tenantProperty.getBizType()) || "position".equals(tenantProperty.getBizType()) || "image".equals(tenantProperty.getBizType()) || "credentialNo".equals(tenantProperty.getBizType()) || "score".equals(tenantProperty.getBizType()) || BooleanUtil.isTrue((Object)tenantProperty.isRoleA()) && BooleanUtil.isTrue((Object)tenantProperty.isCompositionAttribute()))) {
                ExtBusinessProperty extBusinessProperty = new ExtBusinessProperty();
                extBusinessProperty.setName(tenantProperty.name());
                extBusinessProperty.setDisplayName(tenantProperty.title());
                extBusinessProperty.setBiztype(tenantProperty.getBizType());
                if ("text".equalsIgnoreCase(tenantProperty.getBizType())) {
                    extBusinessProperty.setIMaxLength(tenantProperty.iLength());
                }
                extBusinessPropertieList.add(extBusinessProperty);
            }
        });
        return extBusinessPropertieList;
    }

    public BizObject convertBizObject(BizObject bizObject, String billNum) throws Exception {
        BizObject convertBizObject = new BizObject();
        HashMap data = new HashMap(bizObject);
        BillDataDto billDataDto = new BillDataDto();
        billDataDto.setBillnum(billNum);
        billDataDto.setData(data);
        BillContext billContext = new CommonOperator(OperationTypeEnum.QUERY).getBillContext((BaseDto)billDataDto);
        HashMap<String, BillDataDto> paramMap = new HashMap<String, BillDataDto>();
        paramMap.put("param", billDataDto);
        List bills = CommonRuleUtils.getBills((BillContext)billContext, paramMap);
        if (bills == null || bills.isEmpty()) {
            return null;
        }
        convertBizObject.init((Map)bills.get(0));
        return convertBizObject;
    }

    public PubBatchModifyEntityFieldVO initPubBatchModifyEntityCharacterFieldVO(CharacterDetailDto characterDetailDto, PubBatchModifyEntityField pubBatchModifyEntityField) {
        String suffix;
        PubBatchModifyEntityFieldVO pubBatchModifyEntityFieldVO = new PubBatchModifyEntityFieldVO();
        pubBatchModifyEntityFieldVO.setId((String)pubBatchModifyEntityField.getId());
        pubBatchModifyEntityFieldVO.setBatchModifyEntityId(pubBatchModifyEntityField.getBatchModifyEntityId());
        pubBatchModifyEntityFieldVO.setBatchModifyEntityFullName(pubBatchModifyEntityField.getBatchModifyEntityFullName());
        pubBatchModifyEntityFieldVO.setFieldName(pubBatchModifyEntityField.getFieldName() + "." + characterDetailDto.getCode());
        pubBatchModifyEntityFieldVO.setCItemName(pubBatchModifyEntityField.getFieldName() + "." + characterDetailDto.getCode());
        String string = suffix = pubBatchModifyEntityField.getFieldCaptionResId() == null || !pubBatchModifyEntityField.getFieldCaptionResId().contains("UID") ? "" : "\uff08" + InternationalUtils.getMessageWithDefault((String)pubBatchModifyEntityField.getFieldCaptionResId(), (String)pubBatchModifyEntityField.getFieldCaption()) + "\uff09";
        if (!StringUtils.isEmpty((CharSequence)characterDetailDto.getNameResId())) {
            pubBatchModifyEntityFieldVO.setFieldCaption(InternationalUtils.getMessageWithDefault((String)characterDetailDto.getNameResId(), (String)characterDetailDto.getName()) + suffix);
        } else {
            pubBatchModifyEntityFieldVO.setFieldCaption(characterDetailDto.getName() + suffix);
        }
        pubBatchModifyEntityFieldVO.setFieldCaptionResId(characterDetailDto.getNameResId());
        pubBatchModifyEntityFieldVO.setCName(pubBatchModifyEntityField.getFieldName() + "_" + characterDetailDto.getCode());
        pubBatchModifyEntityFieldVO.setIsCheck(pubBatchModifyEntityField.getIsCheck());
        pubBatchModifyEntityFieldVO.setControlType(characterDetailDto.getControlType());
        pubBatchModifyEntityFieldVO.setEnumType(characterDetailDto.getEnumType());
        if (!StringUtils.isEmpty((CharSequence)characterDetailDto.getEnumType())) {
            try {
                String enumString = EnumUtil.getEnumStr((String)characterDetailDto.getEnumType(), (boolean)false);
                pubBatchModifyEntityFieldVO.setEnumValue(enumString);
            }
            catch (Exception e) {
                log.error("\u8bbe\u7f6e\u679a\u4e3e\u4fe1\u606f\u5f02\u5e38 enumType:{} exception:{}", (Object)characterDetailDto.getEnumType(), (Object)e.getMessage());
            }
        }
        pubBatchModifyEntityFieldVO.setINumPoint(characterDetailDto.getPrecision());
        pubBatchModifyEntityFieldVO.setIsMultiple("0");
        pubBatchModifyEntityFieldVO.setMultiple(false);
        pubBatchModifyEntityFieldVO.setRefType(characterDetailDto.getRefDocCode());
        pubBatchModifyEntityFieldVO.setRefRetId(characterDetailDto.getRefReturn());
        pubBatchModifyEntityFieldVO.setRefReturn(characterDetailDto.getRefRetAttrCode());
        pubBatchModifyEntityFieldVO.setIsCharacter(pubBatchModifyEntityField.getIsCharacter());
        return pubBatchModifyEntityFieldVO;
    }

    public PubBatchModifyEntityFieldVO initPubBatchModifyEntityExtendFieldVO(ExtBusinessProperty extBusinessProperty, Field extendField, PubBatchModifyEntity pubBatchModifyEntity) {
        String suffix;
        PubBatchModifyEntityFieldVO pubBatchModifyEntityFieldVO = new PubBatchModifyEntityFieldVO();
        pubBatchModifyEntityFieldVO.setId(String.valueOf(extendField.getId()));
        pubBatchModifyEntityFieldVO.setBatchModifyEntityId((String)pubBatchModifyEntity.getId());
        pubBatchModifyEntityFieldVO.setBatchModifyEntityFullName(pubBatchModifyEntity.getFullName());
        pubBatchModifyEntityFieldVO.setFieldName(extBusinessProperty.getName());
        pubBatchModifyEntityFieldVO.setCItemName(extBusinessProperty.getName());
        pubBatchModifyEntityFieldVO.setIMaxLength(extBusinessProperty.getIMaxLength());
        String string = suffix = pubBatchModifyEntity.getEntityName() == null || !pubBatchModifyEntity.getEntityNameResId().contains("UID") ? "" : "\uff08" + InternationalUtils.getMessageWithDefault((String)pubBatchModifyEntity.getEntityNameResId(), (String)pubBatchModifyEntity.getEntityName()) + "\uff09";
        if (!StringUtils.isEmpty((CharSequence)extendField.getShowCaptionResid())) {
            pubBatchModifyEntityFieldVO.setFieldCaption(InternationalUtils.getMessageWithDefault((String)extendField.getShowCaptionResid(), (String)extendField.getShowCaption()));
        } else {
            pubBatchModifyEntityFieldVO.setFieldCaption(extendField.getShowCaption());
        }
        pubBatchModifyEntityFieldVO.setFieldCaptionResId(extendField.getShowCaptionResid());
        pubBatchModifyEntityFieldVO.setCName(extBusinessProperty.getName());
        pubBatchModifyEntityFieldVO.setIsCheck("1");
        pubBatchModifyEntityFieldVO.setControlType(extendField.getControlType());
        pubBatchModifyEntityFieldVO.setEnumType(extendField.getEnumType());
        if (!StringUtils.isEmpty((CharSequence)extendField.getEnumType())) {
            try {
                String enumString = EnumUtil.getEnumStr((String)extendField.getEnumType(), (boolean)false);
                pubBatchModifyEntityFieldVO.setEnumValue(enumString);
            }
            catch (Exception e) {
                log.error("\u8bbe\u7f6e\u679a\u4e3e\u4fe1\u606f\u5f02\u5e38 enumType:{} exception:{}", (Object)extendField.getEnumType(), (Object)e.getMessage());
            }
        }
        pubBatchModifyEntityFieldVO.setINumPoint(extendField.getNumPoint());
        if (!StringUtils.isEmpty((CharSequence)extendField.getRefType())) {
            pubBatchModifyEntityFieldVO.setRefType(extendField.getRefType());
            pubBatchModifyEntityFieldVO.setRefRetId("id");
            pubBatchModifyEntityFieldVO.setRefReturn(extendField.getrefReturn());
        }
        if (extendField.getMultiple() != null && extendField.getMultiple().booleanValue()) {
            pubBatchModifyEntityFieldVO.setMultiple(true);
            pubBatchModifyEntityFieldVO.setIsMultiple("1");
            pubBatchModifyEntityFieldVO.setIsMultipleSave("1");
        } else {
            pubBatchModifyEntityFieldVO.setMultiple(false);
            pubBatchModifyEntityFieldVO.setIsMultiple("0");
            pubBatchModifyEntityFieldVO.setIsMultipleSave("0");
        }
        pubBatchModifyEntityFieldVO.setIsCharacter("0");
        return pubBatchModifyEntityFieldVO;
    }

    private void getExtendFields(PubBatchModifyEntityQueryDTO pubBatchModifyEntityQueryDTO, List<PubBatchModifyEntityFieldVO> batchModifySaveFieldList, List<PubBatchModifyEntityFieldVO> batchModifyQueryFieldList) throws Exception {
        List pubBatchModifyEntityList = this.pubBatchModifyEntityDao.getPubBatchModifyEntity(pubBatchModifyEntityQueryDTO);
        if (!CollectionUtils.isEmpty((Collection)pubBatchModifyEntityList)) {
            for (PubBatchModifyEntity pubBatchModifyEntity : pubBatchModifyEntityList) {
                IPubBatchModifyQueryFieldExtService batchModifyQueryEntityExtService;
                ExtPubBatchModifyQueryEnum extPubBatchModifyQueryFieldEnum = ExtPubBatchModifyQueryEnum.getByEntityFullNameOrBillNum((String)pubBatchModifyEntity.getFullName());
                if (extPubBatchModifyQueryFieldEnum == null || (batchModifyQueryEntityExtService = (IPubBatchModifyQueryFieldExtService)AppContext.getBean((String)extPubBatchModifyQueryFieldEnum.getBeanName(), IPubBatchModifyQueryFieldExtService.class)) == null) continue;
                batchModifyQueryEntityExtService.getBatchModifyExtendField(pubBatchModifyEntity, batchModifySaveFieldList, batchModifyQueryFieldList);
            }
        }
    }

    private void getDBPrefabricatedFields(PubBatchModifyEntityQueryDTO pubBatchModifyEntityQueryDTO, List<PubBatchModifyEntityFieldVO> batchModifyQueryFieldList, List<PubBatchModifyEntityFieldVO> batchModifySaveFieldList) throws Exception {
        List pubBatchModifyEntityFieldInDbList;
        String redisKey = "pubBatchModifyEntityFieldInDbList:BillNum" + pubBatchModifyEntityQueryDTO.getBillNum() + ":EntityId" + pubBatchModifyEntityQueryDTO.getBatchModifyEntityId();
        if (this.redisTemplate.hasKey((Object)redisKey).booleanValue()) {
            pubBatchModifyEntityFieldInDbList = this.redisTemplate.opsForList().range((Object)redisKey, 0L, -1L);
        } else {
            pubBatchModifyEntityFieldInDbList = this.pubBatchModifyEntityDao.getPubBatchModifyEntityFieldByEntityInfo(pubBatchModifyEntityQueryDTO);
            if (pubBatchModifyEntityFieldInDbList.size() > 0) {
                this.redisTemplate.opsForList().rightPushAll((Object)redisKey, (Collection)pubBatchModifyEntityFieldInDbList);
                this.redisTemplate.expire((Object)redisKey, 5L, TimeUnit.HOURS);
            }
        }
        if (!CollectionUtils.isEmpty((Collection)pubBatchModifyEntityFieldInDbList)) {
            for (PubBatchModifyEntityField pubBatchModifyEntityFieldInDb : pubBatchModifyEntityFieldInDbList) {
                if (!this.checkDomainDeleteService.getPredicateValue(pubBatchModifyEntityFieldInDb.getDataRule(), null)) continue;
                if (BooleanUtil.isFalse((Object)pubBatchModifyEntityFieldInDb.getIsCharacter())) {
                    if (BooleanUtil.isTrue((Object)pubBatchModifyEntityFieldInDb.getIsQueryFields())) {
                        PubBatchModifyEntityFieldVO pubBatchModifyEntityQueryFieldVO = this.initPubBatchModifyEntityFieldVO(pubBatchModifyEntityFieldInDb);
                        pubBatchModifyEntityQueryFieldVO.setMultiple(BooleanUtil.isTrue((Object)pubBatchModifyEntityFieldInDb.getIsMultiple()));
                        batchModifyQueryFieldList.add(pubBatchModifyEntityQueryFieldVO);
                    }
                    if (!BooleanUtil.isTrue((Object)pubBatchModifyEntityFieldInDb.getIsBatchFields())) continue;
                    PubBatchModifyEntityFieldVO pubBatchModifyEntitySaveFieldVO = this.initPubBatchModifyEntityFieldVO(pubBatchModifyEntityFieldInDb);
                    pubBatchModifyEntitySaveFieldVO.setMultiple(BooleanUtil.isTrue((Object)pubBatchModifyEntityFieldInDb.getIsMultipleSave()));
                    batchModifySaveFieldList.add(pubBatchModifyEntitySaveFieldVO);
                    continue;
                }
                this.dealPubBatchModifyEntityCharacterFieldVO(pubBatchModifyEntityFieldInDb, batchModifyQueryFieldList, batchModifySaveFieldList);
            }
        }
    }
}

