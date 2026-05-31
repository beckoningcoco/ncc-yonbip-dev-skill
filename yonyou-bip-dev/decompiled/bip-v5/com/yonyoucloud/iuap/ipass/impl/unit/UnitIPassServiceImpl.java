/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cn.hutool.json.JSONObject
 *  cn.hutool.json.JSONUtil
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.diwork.ott.exexutors.RobotExecutors
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC
 *  com.yonyou.iuap.apdoc.coredoc.vo.unit.UnitGroupVO
 *  com.yonyou.iuap.apdoc.coredoc.vo.unit.UnitVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.yms.common.utils.JacksonUtils
 *  com.yonyou.ucf.mdd.common.model.Pager
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.upc.ipass.IPassBatchSaveResultUtil
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.unit.UnitGroupIPassQueryRequest
 *  com.yonyoucloud.iuap.ipass.unit.UnitGroupIPassSaveRequest
 *  com.yonyoucloud.iuap.ipass.unit.UnitIPassSaveRequest
 *  com.yonyoucloud.iuap.upc.dto.derivatives.UnitQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.iuap.upc.dto.ipass.unit.UnitGroupPassDTO
 *  com.yonyoucloud.upc.ipass.merchant.PassResultDTO
 *  com.yonyoucloud.upc.pc.unit.Unit
 *  com.yonyoucloud.upc.pc.unit.UnitGroup
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
 *  com.yonyoucloud.upc.utils.UPCResultConverter
 *  org.apache.commons.lang3.StringUtils
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.jetbrains.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.BeanUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.util.CollectionUtils
 *  org.springframework.util.ObjectUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.iuap.ipass.impl.unit;

import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSON;
import com.yonyou.diwork.ott.exexutors.RobotExecutors;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.service.config.YmsThreadPoolConfig4UPC;
import com.yonyou.iuap.apdoc.coredoc.vo.unit.UnitGroupVO;
import com.yonyou.iuap.apdoc.coredoc.vo.unit.UnitVO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.yms.common.utils.JacksonUtils;
import com.yonyou.ucf.mdd.common.model.Pager;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.bill.rule.common.ResultList;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.upc.ipass.IPassBatchSaveResultUtil;
import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.service.unit.UnitIPassService;
import com.yonyoucloud.iuap.ipass.unit.UnitGroupIPassQueryRequest;
import com.yonyoucloud.iuap.ipass.unit.UnitGroupIPassSaveRequest;
import com.yonyoucloud.iuap.ipass.unit.UnitIPassSaveRequest;
import com.yonyoucloud.iuap.ipass.utils.IPassServiceUtils;
import com.yonyoucloud.iuap.ipass.utils.PassResponseUtil;
import com.yonyoucloud.iuap.upc.api.service.IUPCBillService;
import com.yonyoucloud.iuap.upc.dto.derivatives.UnitQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.dto.ipass.unit.UnitGroupPassDTO;
import com.yonyoucloud.upc.ipass.merchant.PassResultDTO;
import com.yonyoucloud.upc.pc.unit.Unit;
import com.yonyoucloud.upc.pc.unit.UnitGroup;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import com.yonyoucloud.upc.utils.UPCResultConverter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
public class UnitIPassServiceImpl
implements UnitIPassService {
    private static final Logger log = LoggerFactory.getLogger(UnitIPassServiceImpl.class);
    @Autowired
    private ApiImportCommandService apiImportSingleService;
    @Autowired
    private IUPCBillService billService;
    @Autowired
    private PassResponseUtil responseUtil;
    @Autowired
    private YmsThreadPoolConfig4UPC ymsThreadPoolConfig4UPC;
    private static final int MAX_COUNT = 5000;
    private static final String[] UNIT_GROUP_QUERY_FIELDS = new String[]{"id", "code", "name", "pubts", "stopstatus", "desc", "creator", "createTime", "createDate", "sourcetype"};
    private static final String[] UNIT_QUERY_FIELDS = new String[]{"id", "code", "name", "pubts", "unitGroup", "bBaseUnit", "convertCoefficient", "truncationType", "precision", "stopstatus", "erpCode", "unitCharacter", "sourcetype", "logicallyDeleteType", "unitGroup.code as unitGroup___code"};

    @Override
    public CoreDocJsonResultForOpenApi doUnitGroupQuery(UnitGroupIPassQueryRequest unitGroupIPassQueryRequest) {
        try {
            UnitQryDTO unitQryDTO = new UnitQryDTO();
            BeanUtils.copyProperties((Object)unitGroupIPassQueryRequest, (Object)unitQryDTO);
            if (!org.apache.commons.lang3.StringUtils.isEmpty((CharSequence)unitGroupIPassQueryRequest.getId())) {
                unitQryDTO.setId(Long.valueOf(unitGroupIPassQueryRequest.getId()));
            }
            if (unitGroupIPassQueryRequest.getBeginTime() != null) {
                unitQryDTO.setBeganTime(unitGroupIPassQueryRequest.getBeginTime());
            }
            UPCPager upcPager = this.unitGroupQueryByPage(unitQryDTO);
            Integer recordCount = this.queryUnitGroupCount(unitQryDTO);
            upcPager.setRecordCount(recordCount);
            upcPager.setHaveNextPage(Boolean.valueOf(false));
            if (recordCount != null && unitGroupIPassQueryRequest.getPageIndex() != null && unitGroupIPassQueryRequest.getPageSize() != null && recordCount > unitGroupIPassQueryRequest.getPageSize() * unitGroupIPassQueryRequest.getPageIndex()) {
                upcPager.setHaveNextPage(Boolean.valueOf(true));
            }
            return CoreDocJsonResultForOpenApi.success((Object)upcPager);
        }
        catch (BusinessException e) {
            log.error("\u8ba1\u91cf\u5355\u4f4d\u5217\u8868\u67e5\u8be2-\u96c6\u6210\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(e.getMessage()));
        }
        catch (Exception e) {
            log.error("\u8ba1\u91cf\u5355\u4f4d\u5217\u8868\u67e5\u8be2-\u96c6\u6210\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    @Override
    public CoreDocJsonResultForOpenApi doUnitGroupBatchSaveOrUpdate(List<UnitGroupIPassSaveRequest> unitGroupIPassSaveRequestList) {
        if (CollectionUtils.isEmpty(unitGroupIPassSaveRequestList)) {
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        if (unitGroupIPassSaveRequestList.size() > CoredocSDKConstant.MAX_NUM_FOR_SIMPLE) {
            return CoreDocJsonResultForOpenApi.error((Long)Long.valueOf(CoreDocBusinessErrorEnum.PARAM_MORE_THAN_LIMITATION.getCode()), (String)String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A7F2BEA04080003", (String)"\u8bf7\u6c42\u6570\u91cf\u8d85\u8fc7\u6700\u5927\u9650\u5236\u6570\u91cf:%d"), CoredocSDKConstant.MAX_NUM_FOR_SIMPLE));
        }
        ArrayList<Future> futureList = new ArrayList<Future>();
        for (UnitGroupIPassSaveRequest unitGroupIPassSaveRequest : unitGroupIPassSaveRequestList) {
            Future ruleExecuteResultFuture = RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setData((Object)this.handleNameSaveParam(unitGroupIPassSaveRequest));
                billDataDto.setBillnum("pc_unitgroup");
                ResultList resultList = this.billService.batchSave(this.billService.dealBillDataForApi(billDataDto, "save"));
                PassResultDTO passResultDTO = new PassResultDTO();
                if (resultList.getSucessCount() == 1) {
                    passResultDTO.setSourceUnique(unitGroupIPassSaveRequest.getSourceUnique());
                    passResultDTO.setTargetUnique(((Map)resultList.getInfos().get(0)).get("id").toString());
                } else {
                    passResultDTO.setSourceUnique(unitGroupIPassSaveRequest.getSourceUnique());
                    passResultDTO.setMessage(resultList.getMessages().get(0).toString());
                }
                return passResultDTO;
            }, (ExecutorService)this.ymsThreadPoolConfig4UPC.getFixedThreadPoolExecutor("core-doc-ipass-multi-thread"));
            futureList.add(ruleExecuteResultFuture);
        }
        UPCResultList upcResultList = IPassBatchSaveResultUtil.buildResultForBatchSaveOrUpdate(futureList);
        return CoreDocJsonResultForOpenApi.success((Object)upcResultList);
    }

    @Override
    public CoreDocJsonResultForOpenApi doUnitBatchSaveOrUpdate(List<UnitIPassSaveRequest> unitIPassSaveRequestList) {
        ArrayList<Future> futureList = new ArrayList<Future>();
        for (UnitIPassSaveRequest unitIPassSaveRequest : unitIPassSaveRequestList) {
            Future ruleExecuteResultFuture = RobotExecutors.runAs((String)((String)AppContext.getYTenantId()), () -> {
                BillDataDto billDataDto = new BillDataDto();
                billDataDto.setData((Object)this.responseUtil.handleNameSaveParamToJsonArray(unitIPassSaveRequest, Collections.singletonList("name")));
                billDataDto.setBillnum("pc_unit");
                ResultList resultList = this.billService.batchSave(this.billService.dealBillDataForApi(billDataDto, "save"));
                PassResultDTO passResultDTO = new PassResultDTO();
                if (resultList.getSucessCount() == 1) {
                    passResultDTO.setSourceUnique(unitIPassSaveRequest.getSourceUnique());
                    passResultDTO.setTargetUnique(((Map)resultList.getInfos().get(0)).get("id").toString());
                } else {
                    passResultDTO.setSourceUnique(unitIPassSaveRequest.getSourceUnique());
                    passResultDTO.setMessage(resultList.getMessages().get(0).toString());
                }
                return passResultDTO;
            }, (ExecutorService)this.ymsThreadPoolConfig4UPC.getFixedThreadPoolExecutor("core-doc-ipass-multi-thread"));
            futureList.add(ruleExecuteResultFuture);
        }
        UPCResultList upcResultList = IPassBatchSaveResultUtil.buildResultForBatchSaveOrUpdate(futureList);
        return CoreDocJsonResultForOpenApi.success((Object)upcResultList);
    }

    public JSONObject handleNameSaveParam(UnitGroupIPassSaveRequest unitGroupIPassSaveRequest) {
        JSONObject jsonObject = JSONUtil.parseObj((Object)unitGroupIPassSaveRequest);
        HashMap<String, String> multipleMap = new HashMap<String, String>();
        if (unitGroupIPassSaveRequest.getName() != null) {
            multipleMap.put("zh_CN", unitGroupIPassSaveRequest.getName());
        }
        if (unitGroupIPassSaveRequest.getName_en_US() != null) {
            multipleMap.put("en_US", unitGroupIPassSaveRequest.getName_en_US());
        }
        if (unitGroupIPassSaveRequest.getName_zh_TW() != null) {
            multipleMap.put("zh_TW", unitGroupIPassSaveRequest.getName_zh_TW());
        }
        if (!multipleMap.isEmpty()) {
            jsonObject.set("name", multipleMap);
        }
        return jsonObject;
    }

    public UPCPager unitGroupQueryByPage(UnitQryDTO unitQryDTO) throws Exception {
        QuerySchema schema;
        Pager pager;
        if (unitQryDTO == null) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL);
        }
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        if (unitQryDTO.getId() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)unitQryDTO.getId()));
        }
        if (!org.apache.commons.lang3.StringUtils.isEmpty((CharSequence)unitQryDTO.getCode())) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)unitQryDTO.getCode()));
        }
        if (!org.apache.commons.lang3.StringUtils.isEmpty((CharSequence)unitQryDTO.getName())) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)unitQryDTO.getName()));
        }
        if (unitQryDTO.getBeganTime() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)unitQryDTO.getBeganTime()));
        }
        if (unitQryDTO.getEndTime() != null) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").lt((Object)unitQryDTO.getEndTime()));
        }
        Integer pageIndex = unitQryDTO.getPageIndex();
        Integer pageSize = unitQryDTO.getPageSize();
        if (pageIndex == null || pageIndex < 0) {
            pageIndex = 1;
        }
        if (pageSize == null || pageSize > 5000) {
            pageSize = 5000;
        }
        if ((pager = MetaDaoHelper.queryByPage((String)"pc.unit.UnitGroup", (QuerySchema)(schema = QuerySchema.create().addSelect(UNIT_GROUP_QUERY_FIELDS).addCondition((ConditionExpression)conditionGroup).addPager(pageIndex.intValue(), pageSize.intValue())))) != null && pager.getRecordList() != null) {
            pager.setRecordList(JSON.parseArray((String)JSON.toJSONString((Object)pager.getRecordList()), UnitGroupPassDTO.class));
        }
        return UPCResultConverter.pagerConvert((Pager)pager);
    }

    public Integer queryUnitGroupCount(UnitQryDTO unitQryDTO) throws Exception {
        QuerySchema schema;
        Map result;
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        if (unitQryDTO != null) {
            if (unitQryDTO.getId() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)unitQryDTO.getId()));
            }
            if (!org.apache.commons.lang3.StringUtils.isEmpty((CharSequence)unitQryDTO.getCode())) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)unitQryDTO.getCode()));
            }
            if (!org.apache.commons.lang3.StringUtils.isEmpty((CharSequence)unitQryDTO.getName())) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"name").eq((Object)unitQryDTO.getName()));
            }
            if (unitQryDTO.getBeganTime() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").egt((Object)unitQryDTO.getBeganTime()));
            }
            if (unitQryDTO.getEndTime() != null) {
                conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").lt((Object)unitQryDTO.getEndTime()));
            }
        }
        if ((result = MetaDaoHelper.queryOne((String)"pc.unit.UnitGroup", (QuerySchema)(schema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)conditionGroup)))) != null && result.get("count") != null) {
            Integer count = Integer.valueOf(result.get("count").toString());
            return count;
        }
        return null;
    }

    public CoreDocJsonResult<UnitGroupVO> queryUnitGroup(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        int recordCount = IPassServiceUtils.getRecordsCount(batchApiQueryParamWithOrg, "pc.unit.UnitGroup");
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect(UNIT_GROUP_QUERY_FIELDS).addCondition((ConditionExpression)IPassServiceUtils.getQueryConditionGroup(batchApiQueryParamWithOrg)).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue());
            List unitGroupList = MetaDaoHelper.queryObject((String)"pc.unit.UnitGroup", (boolean)true, (QuerySchema)schema, null);
            ArrayList<UnitGroupVO> unitGroupVOList = new ArrayList<UnitGroupVO>();
            for (UnitGroup unitGroup : unitGroupList) {
                UnitGroupVO unitGroupVO = (UnitGroupVO)JSON.parseObject((String)JSON.toJSONString((Object)unitGroup), UnitGroupVO.class);
                if (unitGroup.get("name") != null) {
                    unitGroupVO.setName(new MultiLangText((Map)unitGroup.get("name")));
                }
                unitGroupVOList.add(unitGroupVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(unitGroupVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public Long unitGroupSave(String matchRule, UnitGroupVO unitGroupVO) throws Exception {
        Long id = 0L;
        UnitGroup unitGroup = this.convertUnitGroup(unitGroupVO);
        this.dataPreprocessing(matchRule, unitGroup);
        unitGroup.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_unitgroup", (Object)unitGroup, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((UnitGroup)result).getId();
        }
        return id;
    }

    private UnitGroup convertUnitGroup(UnitGroupVO unitGroupVO) {
        UnitGroup unitGroup = (UnitGroup)JacksonUtils.parseObject((String)JacksonUtils.toJSONString((Object)unitGroupVO), UnitGroup.class);
        if (ObjectUtils.isEmpty((Object)unitGroupVO.getName())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.NAME_NOT_NULL);
        }
        unitGroup.set("name", (Object)unitGroupVO.getName().toMap());
        return unitGroup;
    }

    private Unit convertUnit(UnitVO unitVO) {
        Unit unit = (Unit)JacksonUtils.parseObject((String)JacksonUtils.toJSONString((Object)unitVO), Unit.class);
        if (ObjectUtils.isEmpty((Object)unitVO.getName())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.NAME_NOT_NULL);
        }
        unit.set("name", (Object)unitVO.getName().toMap());
        if (!ObjectUtils.isEmpty((Object)unitVO.getUnitGroup())) {
            unit.setUnitGroup(Long.valueOf(unitVO.getUnitGroup()));
            unit.remove("unitGroup___code");
        }
        return unit;
    }

    public void dataPreprocessing(String matchRule, UnitGroup unitGroup) throws Exception {
        if (!"id".equals(matchRule)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)unitGroup.getCode())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List unitGroupList = MetaDaoHelper.queryObject((String)"pc.unit.UnitGroup", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)unitGroupList)) {
                unitGroup.setId(((UnitGroup)unitGroupList.get(0)).getId());
                unitGroup.setEntityStatus(EntityStatus.Update);
            } else {
                unitGroup.setEntityStatus(EntityStatus.Insert);
            }
        } else if (unitGroup != null && unitGroup.getId() != null) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(unitGroup.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List unitGroupList = MetaDaoHelper.queryObject((String)"pc.unit.UnitGroup", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)unitGroupList)) {
                unitGroup.setId(((UnitGroup)unitGroupList.get(0)).getId());
                unitGroup.setEntityStatus(EntityStatus.Update);
            } else {
                unitGroup.setEntityStatus(EntityStatus.Insert);
            }
        } else {
            unitGroup.setEntityStatus(EntityStatus.Insert);
        }
    }

    public String delete(String unitGroupId, String unitGroupCode) throws Exception {
        QuerySchema schema = UnitIPassServiceImpl.getQuerySchema(unitGroupId, unitGroupCode, UNIT_GROUP_QUERY_FIELDS);
        if (schema == null) {
            return null;
        }
        List unitGroupList = MetaDaoHelper.queryObject((String)"pc.unit.UnitGroup", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)unitGroupList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)unitGroupList);
        bill.setBillnum("pc_unitgroup");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }

    @Nullable
    private static QuerySchema getQuerySchema(String id, String code, String[] queryFields) {
        if (!StringUtils.hasLength((String)id) && !StringUtils.hasLength((String)code)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (StringUtils.hasLength((String)id)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(id)));
        } else if (StringUtils.hasLength((String)code)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)code));
        }
        QuerySchema schema = QuerySchema.create().addSelect(queryFields).addCondition((ConditionExpression)queryConditionGroup);
        return schema;
    }

    public CoreDocJsonResult<UnitVO> queryUnit(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        int recordCount = IPassServiceUtils.getRecordsCount(batchApiQueryParamWithOrg, "pc.unit.Unit");
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect(UNIT_QUERY_FIELDS).addCondition((ConditionExpression)IPassServiceUtils.getQueryConditionGroup(batchApiQueryParamWithOrg)).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue());
            List unitList = MetaDaoHelper.queryObject((String)"pc.unit.Unit", (boolean)true, (QuerySchema)schema, null);
            ArrayList<UnitVO> unitVOList = new ArrayList<UnitVO>();
            for (Unit unit : unitList) {
                UnitVO unitVO = (UnitVO)JSON.parseObject((String)JSON.toJSONString((Object)unit), UnitVO.class);
                if (unit.get("name") != null) {
                    unitVO.setName(new MultiLangText((Map)unit.get("name")));
                }
                unitVOList.add(unitVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(unitVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public Long unitSave(String matchRule, UnitVO unitVO) throws Exception {
        Long id = 0L;
        Unit unit = this.convertUnit(unitVO);
        this.dataUnitPreprocessing(matchRule, unit);
        unit.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_unit", (Object)unit, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((Unit)result).getId();
        }
        return id;
    }

    public void dataUnitPreprocessing(String matchRule, Unit unit) throws Exception {
        if (!"id".equals(matchRule)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)unit.getCode())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List unitList = MetaDaoHelper.queryObject((String)"pc.unit.Unit", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)unitList)) {
                unit.setId(((Unit)unitList.get(0)).getId());
                unit.setEntityStatus(EntityStatus.Update);
            } else {
                unit.setEntityStatus(EntityStatus.Insert);
            }
        } else if (unit != null && unit.getId() != null) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(unit.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List unitList = MetaDaoHelper.queryObject((String)"pc.unit.Unit", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)unitList)) {
                unit.setId(((Unit)unitList.get(0)).getId());
                unit.setEntityStatus(EntityStatus.Update);
            } else {
                unit.setEntityStatus(EntityStatus.Insert);
            }
        } else {
            unit.setEntityStatus(EntityStatus.Insert);
        }
    }

    public String deleteUnit(String unitId, String unitCode) throws Exception {
        QuerySchema schema = UnitIPassServiceImpl.getQuerySchema(unitId, unitCode, UNIT_QUERY_FIELDS);
        if (schema == null) {
            return null;
        }
        List unitList = MetaDaoHelper.queryObject((String)"pc.unit.Unit", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)unitList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)unitList);
        bill.setBillnum("pc_unit");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }
}

