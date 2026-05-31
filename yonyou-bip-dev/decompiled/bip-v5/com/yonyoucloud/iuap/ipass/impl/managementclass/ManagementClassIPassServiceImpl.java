/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant
 *  com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool
 *  com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum
 *  com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException
 *  com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg
 *  com.yonyou.iuap.apdoc.coredoc.vo.materialcls.MaterialClassVO
 *  com.yonyou.iuap.basedoc.social.util.JacksonUtils
 *  com.yonyou.iuap.international.MultiLangText
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult
 *  com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService
 *  com.yonyou.ucf.mdd.ext.bill.biz.BillBiz
 *  com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.ipass.managementclass.ManagementClassIPassSaveRequest
 *  com.yonyoucloud.iuap.ipass.managementclass.ManagementClassIPassTreeRequest
 *  com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassDTO
 *  com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassQryDTO
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCResultList
 *  com.yonyoucloud.upc.entity.field.ManagementClassField
 *  com.yonyoucloud.upc.ipass.merchant.PassResultDTO
 *  com.yonyoucloud.upc.pc.cls.ManagementClass
 *  com.yonyoucloud.upc.utils.CoreDocJsonResult
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
package com.yonyoucloud.iuap.ipass.impl.managementclass;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.apdoc.coredoc.constant.CoredocSDKConstant;
import com.yonyou.iuap.apdoc.coredoc.dto.keymapping.UpcAPiTool;
import com.yonyou.iuap.apdoc.coredoc.enums.CoreDocBusinessErrorEnum;
import com.yonyou.iuap.apdoc.coredoc.exceptions.CoreDocBusinessException;
import com.yonyou.iuap.apdoc.coredoc.po.pub.BatchApiQueryParamWithOrg;
import com.yonyou.iuap.apdoc.coredoc.vo.materialcls.MaterialClassVO;
import com.yonyou.iuap.basedoc.social.util.JacksonUtils;
import com.yonyou.iuap.international.MultiLangText;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.api.service.ApiImportCommandService;
import com.yonyou.ucf.mdd.ext.bill.biz.BillBiz;
import com.yonyou.ucf.mdd.ext.bill.dto.BillDataDto;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.ipass.managementclass.ManagementClassIPassSaveRequest;
import com.yonyoucloud.iuap.ipass.managementclass.ManagementClassIPassTreeRequest;
import com.yonyoucloud.iuap.ipass.service.managementclass.ManagementClassIPassService;
import com.yonyoucloud.iuap.ipass.utils.IPassServiceUtils;
import com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.ManagementClassQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.upc.entity.field.ManagementClassField;
import com.yonyoucloud.upc.ipass.merchant.PassResultDTO;
import com.yonyoucloud.upc.pc.cls.ManagementClass;
import com.yonyoucloud.upc.service.api.ProductManagerServiceImpl;
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
public class ManagementClassIPassServiceImpl
implements ManagementClassIPassService {
    private static final Logger log = LoggerFactory.getLogger(ManagementClassIPassServiceImpl.class);
    @Autowired
    private ProductManagerServiceImpl managerService;
    @Autowired
    private ApiImportCommandService apiImportSingleService;

    @Override
    public CoreDocJsonResultForOpenApi doManageClassQuery(ManagementClassIPassTreeRequest managementClassIPassTreeRequest) {
        try {
            ManagementClassQryDTO managementClassQryDTO = new ManagementClassQryDTO();
            BeanUtils.copyProperties((Object)managementClassIPassTreeRequest, (Object)managementClassQryDTO);
            if (managementClassIPassTreeRequest.getBeginTime() != null) {
                managementClassQryDTO.setBeganTime(managementClassIPassTreeRequest.getBeginTime());
            }
            CoreDocJsonResult<ManagementClassDTO> coreDocJsonResult = this.managerService.queryTree(managementClassQryDTO);
            CoreDocJsonResultForOpenApi resultForOpenApi = new CoreDocJsonResultForOpenApi();
            BeanUtils.copyProperties(coreDocJsonResult, (Object)resultForOpenApi);
            if (!resultForOpenApi.isSuccess()) {
                return resultForOpenApi;
            }
            Integer recordCount = this.managerService.queryManagementClassCount(managementClassQryDTO);
            UPCPager upcPager = new UPCPager();
            upcPager.setPageIndex(managementClassIPassTreeRequest.getPageIndex());
            upcPager.setPageSize(managementClassIPassTreeRequest.getPageSize());
            upcPager.setRecordCount(recordCount);
            upcPager.setHaveNextPage(Boolean.valueOf(false));
            if (recordCount != null && managementClassIPassTreeRequest.getPageIndex() != null && managementClassIPassTreeRequest.getPageSize() != null && recordCount > managementClassIPassTreeRequest.getPageSize() * managementClassIPassTreeRequest.getPageIndex()) {
                upcPager.setHaveNextPage(Boolean.valueOf(true));
            }
            upcPager.setRecordList((List)resultForOpenApi.getData());
            resultForOpenApi.setData((Object)upcPager);
            return resultForOpenApi;
        }
        catch (Exception e) {
            log.error("\u7269\u6599\u5206\u7c7b\u6811\u67e5\u8be2\u7279\u5f81-\u96c6\u6210\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    @Override
    public CoreDocJsonResultForOpenApi doManagementClassBatchSaveOrUpdate(List<ManagementClassIPassSaveRequest> managementClassIPassSaveRequestList) {
        if (CollectionUtils.isEmpty(managementClassIPassSaveRequestList)) {
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.PARAM_NOT_NULL));
        }
        if (managementClassIPassSaveRequestList.size() > CoredocSDKConstant.DEFAULT_NUM_FOR_SIMPLE) {
            return CoreDocJsonResultForOpenApi.error((Long)Long.valueOf(CoreDocBusinessErrorEnum.PARAM_MORE_THAN_LIMITATION.getCode()), (String)String.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1A7F2BEA04080003", (String)"\u8bf7\u6c42\u6570\u91cf\u8d85\u8fc7\u6700\u5927\u9650\u5236\u6570\u91cf:%d"), CoredocSDKConstant.DEFAULT_NUM_FOR_SIMPLE));
        }
        try {
            UPCResultList upcResultList = new UPCResultList();
            Integer successCount = 0;
            Integer failCount = 0;
            ArrayList<PassResultDTO> messages = new ArrayList<PassResultDTO>();
            ArrayList successInfos = new ArrayList();
            for (ManagementClassIPassSaveRequest managementClassIPassSaveRequest : managementClassIPassSaveRequestList) {
                Integer n;
                ManagementClassDTO managementClassDTO = new ManagementClassDTO();
                BeanUtils.copyProperties((Object)managementClassIPassSaveRequest, (Object)managementClassDTO);
                PassResultDTO passResultDTO = new PassResultDTO();
                CoreDocJsonResult<ManagementClassDTO> saveResult = managementClassDTO.getId() != null ? this.managerService.update(managementClassDTO) : this.managerService.add(managementClassDTO);
                if (saveResult.isSuccess()) {
                    n = successCount;
                    successCount = successCount + 1;
                    ManagementClassDTO managementClass = (ManagementClassDTO)saveResult.getData().get(0);
                    passResultDTO.setSourceUnique(managementClassIPassSaveRequest.getSourceUnique());
                    passResultDTO.setTargetUnique(managementClass.getId().toString());
                    HashMap<String, PassResultDTO> infoMap = new HashMap<String, PassResultDTO>();
                    infoMap.put("data", passResultDTO);
                    successInfos.add(infoMap);
                    continue;
                }
                n = failCount;
                failCount = failCount + 1;
                passResultDTO.setSourceUnique(managementClassIPassSaveRequest.getSourceUnique());
                passResultDTO.setMessage(saveResult.getMessage());
                messages.add(passResultDTO);
            }
            upcResultList.setCount(Integer.valueOf(failCount + successCount));
            upcResultList.setFailCount(failCount);
            upcResultList.setSuccessCount(successCount);
            upcResultList.setMessages(messages);
            upcResultList.setInfos(successInfos);
            return CoreDocJsonResultForOpenApi.success((Object)upcResultList);
        }
        catch (Exception e) {
            log.error("\u7279\u5f81\u7269\u6599\u5206\u7c7b\u6279\u91cf\u4fdd\u5b58\u66f4\u65b0-\u96c6\u6210\u63a5\u53e3\u5f02\u5e38:" + e.getMessage(), (Throwable)e);
            return CoreDocJsonResultForOpenApi.error((CoreDocBusinessException)new CoreDocBusinessException(CoreDocBusinessErrorEnum.SYSTEM_ERROR));
        }
    }

    public CoreDocJsonResult<MaterialClassVO> queryManagementClass(BatchApiQueryParamWithOrg batchApiQueryParamWithOrg) throws Exception {
        CoreDocJsonResult coreDocJsonResult;
        int recordCount = IPassServiceUtils.getRecordsCount(batchApiQueryParamWithOrg, "pc.cls.ManagementClass");
        if (recordCount > 0) {
            if (batchApiQueryParamWithOrg.getPageSize() > (long)UpcAPiTool.PAGE_MAX_SIZE.intValue()) {
                batchApiQueryParamWithOrg.setPageSize((long)UpcAPiTool.PAGE_MAX_SIZE.intValue());
            }
            ArrayList<String> field = new ArrayList<String>();
            field.addAll(ManagementClassField.ALL_FIELD);
            field.add("orgId.code as orgId___code,orgId.name as orgId___name");
            field.add("parent.code as parent___code,parent.name as parent___name");
            field.add("template.name as template___name");
            field.add("productClass.code as productClass___code,productClass.name as productClass___name");
            field.add("expenseItem.code as expenseItem___code,expenseItem.name as expenseItem___name");
            QuerySchema schema = QuerySchema.create().addSelect(org.apache.commons.lang3.StringUtils.join(field, (String)",")).addCondition((ConditionExpression)IPassServiceUtils.getQueryConditionGroup(batchApiQueryParamWithOrg)).addOrderBy("level").addPager(Long.valueOf(batchApiQueryParamWithOrg.getPageIndex()).intValue(), Long.valueOf(batchApiQueryParamWithOrg.getPageSize()).intValue());
            List managementClassList = MetaDaoHelper.queryObject((String)"pc.cls.ManagementClass", (boolean)true, (QuerySchema)schema, null);
            ArrayList<MaterialClassVO> managementClassVOList = new ArrayList<MaterialClassVO>();
            for (ManagementClass managementClass : managementClassList) {
                MaterialClassVO managementClassVO = (MaterialClassVO)JSON.parseObject((String)JSON.toJSONString((Object)managementClass), MaterialClassVO.class);
                if (managementClass.get("name") != null) {
                    managementClassVO.setName(new MultiLangText((Map)managementClass.get("name")));
                }
                if (managementClass.get("remark") != null) {
                    managementClassVO.setRemark(new MultiLangText((Map)managementClass.get("remark")));
                }
                managementClassVOList.add(managementClassVO);
            }
            coreDocJsonResult = CoreDocJsonResult.success(managementClassVOList);
        } else {
            coreDocJsonResult = CoreDocJsonResult.success(null);
        }
        coreDocJsonResult.setTotalCount(Integer.valueOf(recordCount));
        return coreDocJsonResult;
    }

    public Long manageClassSave(String matchRule, MaterialClassVO managementClassVO) throws Exception {
        Long id = 0L;
        ManagementClass managementClass = this.convertManagementClass(matchRule, managementClassVO);
        this.dataManageClassPreprocessing(matchRule, managementClass);
        managementClass.put("_fromApi", (Object)true);
        BillDataDto billDataDto = UpcAPiTool.builderBillData((String)"pc_managementclass", (Object)managementClass, (boolean)true, (int)4);
        Object result = this.apiImportSingleService.singleSave4Api(billDataDto);
        if (result != null) {
            id = (Long)((ManagementClass)result).getId();
        }
        return id;
    }

    private ManagementClass convertManagementClass(String matchRule, MaterialClassVO managementClassVO) {
        ManagementClass managementClass = (ManagementClass)JacksonUtils.parseObject((String)JacksonUtils.toJSONString((Object)managementClassVO), ManagementClass.class);
        if (ObjectUtils.isEmpty((Object)managementClassVO.getName())) {
            throw new CoreDocBusinessException(CoreDocBusinessErrorEnum.NAME_NOT_NULL);
        }
        managementClass.set("name", (Object)managementClassVO.getName().toMap());
        if (!ObjectUtils.isEmpty((Object)managementClassVO.getRemark())) {
            managementClass.set("remark", (Object)managementClassVO.getRemark().toMap());
        }
        if (StringUtils.hasLength((String)managementClassVO.getOrgId())) {
            managementClass.setOrgId(managementClassVO.getOrgId());
            managementClass.remove("orgId___code");
        } else if (!StringUtils.isEmpty((Object)managementClassVO.getOrgId___code())) {
            managementClass.set("orgId___code", (Object)managementClassVO.getOrgId___code());
        }
        if (managementClassVO.getProductClass() != null && !"".equals(managementClassVO.getProductClass())) {
            managementClass.setParent((Object)managementClassVO.getProductClass());
            managementClass.remove("productClass___code");
        } else if (!StringUtils.isEmpty((Object)managementClassVO.getProductClass___code())) {
            managementClass.set("productClass___code", (Object)managementClassVO.getProductClass___code());
        }
        if (managementClassVO.getParent() != null && !"".equals(managementClassVO.getParent())) {
            managementClass.setParent((Object)managementClassVO.getParent());
            managementClass.remove("parent___code");
        } else if (!StringUtils.isEmpty((Object)managementClassVO.getParent___code())) {
            managementClass.set("parent___code", (Object)managementClassVO.getParent___code());
        }
        return managementClass;
    }

    public void dataManageClassPreprocessing(String matchRule, ManagementClass managementClass) throws Exception {
        if (!"id".equals(matchRule)) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"code").eq((Object)managementClass.getCode())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List managementClassList = MetaDaoHelper.queryObject((String)"pc.cls.ManagementClass", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)managementClassList)) {
                managementClass.setId(((ManagementClass)managementClassList.get(0)).getId());
                managementClass.setEntityStatus(EntityStatus.Update);
            } else {
                managementClass.setEntityStatus(EntityStatus.Insert);
            }
        } else if (managementClass != null && managementClass.getId() != null && !"".equals(managementClass.getId())) {
            QueryConditionGroup condition = QueryConditionGroup.and((ConditionExpression[])new ConditionExpression[]{QueryCondition.name((String)"id").eq(managementClass.getId())});
            QuerySchema schema = QuerySchema.create().addSelect("id").addCondition((ConditionExpression)condition);
            List managementClassList = MetaDaoHelper.queryObject((String)"pc.cls.ManagementClass", (boolean)true, (QuerySchema)schema, null);
            if (!CollectionUtils.isEmpty((Collection)managementClassList)) {
                managementClass.setId(((ManagementClass)managementClassList.get(0)).getId());
                managementClass.setEntityStatus(EntityStatus.Update);
            } else {
                managementClass.setEntityStatus(EntityStatus.Insert);
            }
        } else {
            managementClass.setEntityStatus(EntityStatus.Insert);
        }
    }

    public String deleteManagementClass(String id, String code) throws Exception {
        String[] strings = org.apache.commons.lang3.StringUtils.join((Iterable)ManagementClassField.ALL_FIELD, (String)",").split(",");
        QuerySchema schema = ManagementClassIPassServiceImpl.getQuerySchema(id, code, strings);
        if (schema == null) {
            return null;
        }
        List managementClassList = MetaDaoHelper.queryObject((String)"pc.cls.ManagementClass", (QuerySchema)schema, null);
        if (CollectionUtils.isEmpty((Collection)managementClassList)) {
            return null;
        }
        BillDataDto bill = new BillDataDto();
        bill.setData((Object)managementClassList);
        bill.setBillnum("pc_managementclass");
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
}

