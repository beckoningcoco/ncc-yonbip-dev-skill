/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.BusinessException
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils
 *  com.yonyou.iuap.apdoc.coredoc.vo.merchantcls.MerchantLevelVO
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.iuap.upc.dto.AgentLevelDTO
 *  com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO
 *  com.yonyoucloud.iuap.upc.vo.MultilingualVO
 *  com.yonyoucloud.upc.aa.agentlevel.AgentLevel
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
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
 *  org.springframework.util.ObjectUtils
 *  org.springframework.util.StringUtils
 */
package com.yonyoucloud.upc.service.api;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreExtrateBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.utils.UpcJacksonUtils;
import com.yonyou.iuap.apdoc.coredoc.vo.merchantcls.MerchantLevelVO;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.iuap.upc.dto.AgentLevelDTO;
import com.yonyoucloud.iuap.upc.dto.openapi.OpenAPIDTO;
import com.yonyoucloud.iuap.upc.vo.MultilingualVO;
import com.yonyoucloud.upc.aa.agentlevel.AgentLevel;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

@Service
public class AgentLevelServiceImpl {
    private static final Logger log = LoggerFactory.getLogger(AgentLevelServiceImpl.class);
    @Autowired
    private ApiImportCommandService apiImportSingleService;

    public CoreDocJsonResult<AgentLevelDTO> addIdempotent(OpenAPIDTO<AgentLevelDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            AgentLevelDTO agentLevelDTO = (AgentLevelDTO)dto.getData();
            Map map = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)agentLevelDTO), HashMap.class);
            AgentLevel agentLevel = new AgentLevel();
            agentLevel.putAll(map);
            agentLevel.put("_fromApi", (Object)true);
            agentLevel.put("_status", (Object)EntityStatus.Insert);
            if (agentLevelDTO.getMultilingualName() != null) {
                agentLevel.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)agentLevelDTO.getMultilingualName()));
            }
            if (agentLevelDTO.getEnabled() != null && !agentLevelDTO.getEnabled().booleanValue()) {
                agentLevel.put("isEnabled", (Object)0);
            } else if (agentLevelDTO.getEnabled() != null && agentLevelDTO.getEnabled().booleanValue()) {
                agentLevel.put("isEnabled", (Object)1);
            } else if (agentLevelDTO.getEnabled() == null) {
                agentLevel.put("isEnabled", (Object)0);
            }
            BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"aa_cuslevel", (Object)agentLevel, (boolean)true, (int)3);
            Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
            AgentLevelDTO saveResult = new AgentLevelDTO();
            saveResult.setId((Long)((Map)result).get("id"));
            return CoreDocJsonResult.success((Object)saveResult);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u5ba2\u6237\u7ea7\u522b\u65b0\u589e-\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<AgentLevelDTO> updateIdempotent(OpenAPIDTO<AgentLevelDTO> dto) {
        if (dto == null || dto.getData() == null) {
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        try {
            AgentLevelDTO agentLevelDTO = (AgentLevelDTO)dto.getData();
            Map map = (Map)UpcJacksonUtils.OBJECT_MAPPER.readValue(UpcJacksonUtils.OBJECT_MAPPER.writeValueAsString((Object)agentLevelDTO), HashMap.class);
            AgentLevel agentLevel = new AgentLevel();
            QueryConditionGroup queryConditionGroup = null;
            if (agentLevelDTO.getCode() != null && agentLevelDTO.getId() == null) {
                queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)agentLevelDTO.getCode())});
            } else {
                if (agentLevelDTO.getCode() == null && agentLevelDTO.getId() == null) {
                    throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_800880);
                }
                if (agentLevelDTO.getId() != null) {
                    queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq((Object)agentLevelDTO.getId())});
                }
            }
            QuerySchema querySchema = QuerySchema.create().addSelect("id,name").addCondition(queryConditionGroup);
            List queryResults = MetaDaoHelper.query((String)"aa.agentlevel.AgentLevel", (boolean)true, (QuerySchema)querySchema, null);
            if (queryResults == null || queryResults.size() != 1) {
                throw new CoreDocBusinessException(CoreExtrateBusinessErrorEnum.ERROR_ENUM_000_527_801264);
            }
            Map queryResult = (Map)queryResults.get(0);
            agentLevel.putAll(map);
            agentLevel.put("_fromApi", (Object)true);
            agentLevel.put("_status", (Object)EntityStatus.Update);
            agentLevel.setId(queryResult.get("id"));
            if (agentLevelDTO.getMultilingualName() != null) {
                agentLevel.set("name", (Object)UpcAPiTool.handleMultilingual((MultilingualVO)agentLevelDTO.getMultilingualName()));
            }
            if (agentLevelDTO.getEnabled() != null) {
                agentLevel.put("isEnabled", (Object)agentLevelDTO.getEnabled());
            }
            BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"aa_cuslevel", (Object)agentLevel, (boolean)true, (int)3);
            Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
            AgentLevelDTO saveResult = new AgentLevelDTO();
            saveResult.setId((Long)((Map)result).get("id"));
            return CoreDocJsonResult.success((Object)saveResult);
        }
        catch (BusinessException businessException) {
            return CoreDocJsonResult.error((BusinessException)businessException);
        }
        catch (Exception e) {
            log.error("\u5ba2\u6237\u7ea7\u522b\u66f4\u65b0-\u5e42\u7b49\u63a5\u53e3\u5f02\u5e38\uff1a" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResult.error((BusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public Long agentLevelSave(String matchRule, MerchantLevelVO agentLevelVO) throws Exception {
        Long id = 0L;
        AgentLevel agentLevel = this.convertAgentLevel(matchRule, agentLevelVO);
        this.dataPreprocessing(matchRule, agentLevel);
        agentLevel.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"aa_cuslevel", (Object)agentLevel, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((AgentLevel)result).getId();
        }
        return id;
    }

    public void dataPreprocessing(String matchRule, AgentLevel agentLevel) throws Exception {
        if (!"id".equals(matchRule)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)agentLevel.getCode())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List customerTypeList = MetaDaoHelper.queryObject((String)"aa.agentlevel.AgentLevel", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)customerTypeList)) {
                agentLevel.setId(((AgentLevel)customerTypeList.get(0)).getId());
                agentLevel.setEntityStatus(EntityStatus.Update);
            } else {
                agentLevel.setEntityStatus(EntityStatus.Insert);
                if (agentLevel.getIsEnabled() == null) {
                    agentLevel.setIsEnabled(Boolean.valueOf(false));
                }
            }
        } else if (agentLevel != null && agentLevel.getId() != null && !"".equals(agentLevel.getId())) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(agentLevel.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List customerTypeList = MetaDaoHelper.queryObject((String)"aa.agentlevel.AgentLevel", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)customerTypeList)) {
                agentLevel.setId(((AgentLevel)customerTypeList.get(0)).getId());
                agentLevel.setEntityStatus(EntityStatus.Update);
            } else {
                agentLevel.setEntityStatus(EntityStatus.Insert);
                if (agentLevel.getIsEnabled() == null) {
                    agentLevel.setIsEnabled(Boolean.valueOf(false));
                }
            }
        } else {
            agentLevel.setEntityStatus(EntityStatus.Insert);
            if (agentLevel.getIsEnabled() == null) {
                agentLevel.setIsEnabled(Boolean.valueOf(false));
            }
        }
    }

    public AgentLevel convertAgentLevel(String matchRule, MerchantLevelVO agentLevelVO) {
        AgentLevel agentLevel = new AgentLevel();
        boolean blank = false;
        if (agentLevelVO.getBlank() != null) {
            blank = agentLevelVO.getBlank();
        }
        if (null != agentLevelVO.getId()) {
            agentLevel.setId((Object)agentLevelVO.getId());
        }
        if (StringUtils.hasLength((String)agentLevelVO.getCode())) {
            agentLevel.setCode(agentLevelVO.getCode());
        }
        if (!ObjectUtils.isEmpty((Object)agentLevelVO.getName())) {
            agentLevel.set("name", (Object)agentLevelVO.getName().toMap());
        }
        if (!ObjectUtils.isEmpty((Object)agentLevelVO.getComment())) {
            agentLevel.set("comment", (Object)agentLevelVO.getComment().toMap());
        } else if (blank) {
            agentLevel.setComment(null);
        }
        if (StringUtils.hasLength((String)agentLevelVO.getSourceUnique())) {
            agentLevel.setErpCode(agentLevelVO.getSourceUnique());
        }
        if (agentLevelVO.getIsEnabled() != null) {
            agentLevel.setIsEnabled(agentLevelVO.getIsEnabled());
        }
        return agentLevel;
    }

    public CoreDocJsonResult<MerchantLevelVO> queryAgentLevel(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (!CollectionUtils.isEmpty((Collection)batchApiQueryParamWithOrg.getIds())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").in((Collection)batchApiQueryParamWithOrg.getIds()));
        } else if (StringUtils.hasLength((String)batchApiQueryParamWithOrg.getId())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(batchApiQueryParamWithOrg.getId())));
        }
        if (StringUtils.hasLength((String)batchApiQueryParamWithOrg.getCode())) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)batchApiQueryParamWithOrg.getCode()));
        }
        if (batchApiQueryParamWithOrg.getStartTs() != null || batchApiQueryParamWithOrg.getEndTs() != null) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"pubts").between((Object)batchApiQueryParamWithOrg.getStartTs(), (Object)batchApiQueryParamWithOrg.getEndTs()));
        }
        int recordCount = 0;
        QuerySchema countSchema = QuerySchema.create().addSelect("count(1) as count").addCondition((ConditionExpression)queryConditionGroup);
        Map result = MetaDaoHelper.queryOne((String)"aa.agentlevel.AgentLevel", (QuerySchema)countSchema);
        if (result != null && result.get("count") != null) {
            recordCount = Integer.parseInt(result.get("count").toString());
        }
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            QuerySchema schema = QuerySchema.create().addSelect("id,code,name,comment,isEnabled,order").addCondition((ConditionExpression)queryConditionGroup).addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue());
            List agentLevelList = MetaDaoHelper.queryObject((String)"aa.agentlevel.AgentLevel", (boolean)true, (QuerySchema)schema, null);
            ArrayList<MerchantLevelVO> agentLevelVOList = new ArrayList<MerchantLevelVO>();
            for (AgentLevel agentLevel : agentLevelList) {
                MerchantLevelVO agentLevelVO = (MerchantLevelVO)JSON.parseObject((String)JSON.toJSONString((Object)agentLevel), MerchantLevelVO.class);
                if (agentLevel.get("name") != null) {
                    agentLevelVO.setName(new MultiLangText((Map)agentLevel.get("name")));
                }
                if (agentLevel.get("comment") != null) {
                    agentLevelVO.setComment(new MultiLangText((Map)agentLevel.get("comment")));
                }
                agentLevelVOList.add(agentLevelVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(agentLevelVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public String delete(String agentLevelId, String agentLevelCode) throws Exception {
        if (!StringUtils.hasLength((String)agentLevelId) && !StringUtils.hasLength((String)agentLevelCode)) {
            return null;
        }
        QueryConditionGroup queryConditionGroup = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"ytenant").eq((Object)AppContext.getCurrentUser().getYTenantId())});
        if (StringUtils.hasLength((String)agentLevelId)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"id").eq((Object)Long.parseLong(agentLevelId)));
        } else if (StringUtils.hasLength((String)agentLevelCode)) {
            queryConditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").eq((Object)agentLevelCode));
        }
        QuerySchema schema = QuerySchema.create().addSelect("id,code,name,comment,isEnabled,order").addCondition((ConditionExpression)queryConditionGroup);
        List agentLevelList = MetaDaoHelper.queryObject((String)"aa.agentlevel.AgentLevel", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)agentLevelList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)agentLevelList);
        bill.setBillnum("aa_cuslevellist");
        RuleExecuteResult result = BillBiz.delete((BillDataDto)bill);
        if (!CollectionUtils.isEmpty((Collection)result.getMessages())) {
            return result.getMessages().get(0).toString();
        }
        return null;
    }
}

