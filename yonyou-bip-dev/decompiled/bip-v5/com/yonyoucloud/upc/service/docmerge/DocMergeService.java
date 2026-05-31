/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.diwork.service.ILabelApplicationServiceCacheService
 *  com.yonyou.diwork.service.IServiceManager4DomainCacheService
 *  com.yonyou.iuap.context.InvocationInfoProxy
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.upc.merge.model.BillInfo
 *  com.yonyou.iuap.upc.merge.model.CheckStatusEnum
 *  com.yonyou.iuap.upc.merge.model.CheckTypeEnum
 *  com.yonyou.iuap.upc.merge.model.MergeDocTypeEnum
 *  com.yonyou.iuap.upc.merge.model.MergeResult
 *  com.yonyou.iuap.upc.merge.service.IDocMergeCheckService
 *  com.yonyou.ucf.mdd.ext.bill.rule.util.BillInfoUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper
 *  com.yonyou.ucf.mdd.ext.filter.util.StringUtil
 *  com.yonyou.ucf.mdd.ext.poi.util.POIUtils
 *  com.yonyou.workbench.model.out.Application4DomainDTO
 *  com.yonyou.workbench.model.out.Label4DomainDTO
 *  com.yonyou.workbench.model.out.Service4DomainDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubDocMergeCheckDTO
 *  com.yonyoucloud.upc.coredoc.pub.CheckListStatus
 *  com.yonyoucloud.upc.coredoc.pub.DocMerge
 *  com.yonyoucloud.upc.coredoc.pub.DocMergeCheck
 *  com.yonyoucloud.upc.coredoc.pub.SyncAction
 *  javax.servlet.ServletOutputStream
 *  javax.servlet.http.HttpServletResponse
 *  org.apache.commons.lang3.ObjectUtils
 *  org.apache.poi.ss.usermodel.Row
 *  org.apache.poi.ss.usermodel.Sheet
 *  org.apache.poi.xssf.usermodel.XSSFWorkbook
 *  org.imeta.core.base.ConditionOperator
 *  org.imeta.orm.base.BizObject
 *  org.imeta.orm.base.EntityStatus
 *  org.imeta.orm.schema.ConditionExpression
 *  org.imeta.orm.schema.QueryCondition
 *  org.imeta.orm.schema.QueryConditionGroup
 *  org.imeta.orm.schema.QuerySchema
 *  org.imeta.orm.schema.SimpleCondition
 *  org.imeta.spring.support.id.IdManager
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Propagation
 *  org.springframework.transaction.annotation.Transactional
 */
package com.yonyoucloud.upc.service.docmerge;

import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.diwork.service.ILabelApplicationServiceCacheService;
import com.yonyou.diwork.service.IServiceManager4DomainCacheService;
import com.yonyou.iuap.context.InvocationInfoProxy;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.upc.merge.model.BillInfo;
import com.yonyou.iuap.upc.merge.model.CheckStatusEnum;
import com.yonyou.iuap.upc.merge.model.CheckTypeEnum;
import com.yonyou.iuap.upc.merge.model.MergeDocTypeEnum;
import com.yonyou.iuap.upc.merge.model.MergeResult;
import com.yonyou.iuap.upc.merge.service.IDocMergeCheckService;
import com.yonyou.ucf.mdd.ext.bill.rule.util.BillInfoUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyou.ucf.mdd.ext.dao.sql.SqlHelper;
import com.yonyou.ucf.mdd.ext.filter.util.StringUtil;
import com.yonyou.ucf.mdd.ext.poi.util.POIUtils;
import com.yonyou.workbench.model.out.Application4DomainDTO;
import com.yonyou.workbench.model.out.Label4DomainDTO;
import com.yonyou.workbench.model.out.Service4DomainDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubDocMergeCheckDTO;
import com.yonyoucloud.upc.coredoc.pub.CheckListStatus;
import com.yonyoucloud.upc.coredoc.pub.DocMerge;
import com.yonyoucloud.upc.coredoc.pub.DocMergeCheck;
import com.yonyoucloud.upc.coredoc.pub.SyncAction;
import com.yonyoucloud.upc.service.MerchantService;
import com.yonyoucloud.upc.service.docmerge.model.BusinessCheckResult;
import com.yonyoucloud.upc.service.docmerge.model.ServiceInfo;
import com.yonyoucloud.upc.service.docmerge.model.ToDoItem;
import com.yonyoucloud.upc.service.docmerge.task.DocMergeCheckTask;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.imeta.core.base.ConditionOperator;
import org.imeta.orm.base.BizObject;
import org.imeta.orm.base.EntityStatus;
import org.imeta.orm.schema.ConditionExpression;
import org.imeta.orm.schema.QueryCondition;
import org.imeta.orm.schema.QueryConditionGroup;
import org.imeta.orm.schema.QuerySchema;
import org.imeta.orm.schema.SimpleCondition;
import org.imeta.spring.support.id.IdManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DocMergeService {
    private static final Logger log = LoggerFactory.getLogger(DocMergeService.class);
    private static final String DOC_MERGE_CHECK_FILED = "id,docMergeId,microServiceCode,domainCloudCode,domainCloudName,subDomainCloudCode,subDomainCloudName,appCode,appName,serviceCode,serviceName,checkType,checkItem,checkStandard,checkStatus,checkResult,suggestion,url";
    private static final String DOC_MERGE_FIELD = "id,code,status,docType,sourceDocId,checkReason,checkTaskId";
    @Autowired
    private IServiceManager4DomainCacheService manager4Domain;
    @Autowired
    private DocMergeCheckTask docMergeCheckTask;
    @Autowired
    private ILabelApplicationServiceCacheService labelAppService;
    @Autowired
    private MerchantService merchantService;

    @Transactional(propagation=Propagation.REQUIRED, rollbackFor={Throwable.class})
    public void businessCheck(String code) throws Exception {
        DocMerge docMerge = this.queryDocMergeByCode(code);
        if (docMerge != null && docMerge.getId() != null && docMerge.getDocType() != null && docMerge.getSourceDocId() != null) {
            this.updateDocMergeStatus((String)docMerge.getId(), CheckListStatus.BusinessChecking);
            String taskId = this.docMergeCheckTask.startTask((String)docMerge.getId(), this.convertDocType(docMerge.getDocType()), docMerge.getSourceDocId());
            this.updateDocMergeTaskId(docMerge.getId(), taskId);
        }
    }

    public BusinessCheckResult queryBusinessCheckResult(String code) throws Exception {
        List<SyncAction> actions;
        BusinessCheckResult businessCheckResult = new BusinessCheckResult();
        DocMerge docMerge = this.queryDocMergeByCode(code);
        if (docMerge != null && ObjectUtils.isNotEmpty((Object)docMerge.getCheckTaskId()) && ObjectUtils.isNotEmpty(actions = this.selectActionByTaskId(docMerge.getCheckTaskId(), 1, null))) {
            businessCheckResult.setTotalMicroServiceCount(actions.size());
            businessCheckResult.setAllResultMessages(actions.stream().map(v -> String.valueOf(v.getResultMessage())).collect(Collectors.toList()));
            List<String> errorMsgs = actions.stream().filter(v -> 200 != v.getStatus()).map(v -> String.valueOf(v.getResultMessage())).collect(Collectors.toList());
            businessCheckResult.setErrorMicroServiceCount(errorMsgs.size());
            businessCheckResult.setSucessMicroServiceCount(actions.size() - errorMsgs.size());
            businessCheckResult.setErrorMessages(errorMsgs);
        }
        return businessCheckResult;
    }

    public List<SyncAction> queryBusinessCheckTaskDetail(String code, Boolean isCheckSuccessful) throws Exception {
        List<SyncAction> resultList = new ArrayList<SyncAction>();
        DocMerge docMerge = this.queryDocMergeByCode(code);
        if (docMerge != null && ObjectUtils.isNotEmpty((Object)docMerge.getCheckTaskId())) {
            resultList = this.selectActionByTaskId(docMerge.getCheckTaskId(), 1, isCheckSuccessful);
        }
        return resultList;
    }

    public List<MergeResult> businessCheckByServiceCode(String microServiceCode, String code) throws Exception {
        List microServiceCodeList;
        DocMerge docMerge = this.queryDocMergeByCode(code);
        List<Object> resultList = new ArrayList<MergeResult>();
        if (ObjectUtils.isNotEmpty((Object)microServiceCode) && docMerge != null && docMerge.getDocType() != null && docMerge.getSourceDocId() != null && (microServiceCodeList = this.manager4Domain.findMicroServiceCodeByTenantId(AppContext.getCurrentUser().getYTenantId())).contains(microServiceCode)) {
            this.deleteDocMergeCheck(microServiceCode, (String)docMerge.getId());
            IDocMergeCheckService checkService = (IDocMergeCheckService)IrisDynamicInvokeUtil.getService((String)microServiceCode, (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IDocMergeCheckService.class);
            resultList = checkService.checkBeforeMerge(this.convertDocType(docMerge.getDocType()), docMerge.getSourceDocId());
            if (ObjectUtils.isNotEmpty(resultList)) {
                List<DocMergeCheck> docMergeCheckList = this.buildDocMergeCheck(microServiceCode, (String)docMerge.getId(), resultList);
                MetaDaoHelper.insert((String)"coredoc.pub.DocMergeCheck", docMergeCheckList);
            }
        }
        return resultList;
    }

    public List<MergeResult> businessCheckByServiceCodeTest(String microServiceCode, String code) throws Exception {
        List microServiceCodeList;
        DocMerge docMerge = this.queryDocMergeByCode(code);
        List<Object> resultList = new ArrayList<MergeResult>();
        if (ObjectUtils.isNotEmpty((Object)microServiceCode) && docMerge != null && docMerge.getDocType() != null && docMerge.getSourceDocId() != null && (microServiceCodeList = this.manager4Domain.findMicroServiceCodeByTenantId(AppContext.getCurrentUser().getYTenantId())).contains(microServiceCode)) {
            IDocMergeCheckService checkService = (IDocMergeCheckService)IrisDynamicInvokeUtil.getService((String)microServiceCode, (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IDocMergeCheckService.class);
            resultList = checkService.checkBeforeMerge(this.convertDocType(docMerge.getDocType()), docMerge.getSourceDocId());
        }
        return resultList;
    }

    public void batchStopDoc(List<String> codeList) throws Exception {
        List<DocMerge> docMergeList;
        if (ObjectUtils.isNotEmpty(codeList) && ObjectUtils.isNotEmpty(docMergeList = this.queryDocMerge(codeList))) {
            for (DocMerge docMerge : docMergeList) {
                this.stopDoc(MergeDocTypeEnum.Merchant, docMerge.getSourceDocId());
                this.updateDocMergeStatus((String)docMerge.getId(), CheckListStatus.CheckListClosed);
            }
        }
    }

    public void stopDoc(String code) throws Exception {
        DocMerge docMerge;
        if (StringUtil.isNotEmpty((String)code) && (docMerge = this.queryDocMergeByCode(code)) != null) {
            this.stopDoc(this.convertDocType(docMerge.getDocType()), docMerge.getSourceDocId());
            this.updateDocMergeStatus((String)docMerge.getId(), CheckListStatus.CheckListClosed);
        }
    }

    public void stopDoc(MergeDocTypeEnum docType, String sourceDocId) throws Exception {
        if (MergeDocTypeEnum.Merchant.equals((Object)docType) && sourceDocId != null) {
            this.merchantService.cascadeDisable(Long.valueOf(sourceDocId));
        }
    }

    public List<ToDoItem> getToDoItem(String code, String microServiceCode, PubDocMergeCheckDTO dto) throws Exception {
        List<DocMergeCheck> docMergeCheckList;
        ArrayList<ToDoItem> exportToDoItemList = new ArrayList<ToDoItem>();
        DocMerge docMerge = this.queryDocMergeByCode(code);
        if (docMerge != null && ObjectUtils.isNotEmpty(docMergeCheckList = this.queryDocMergeCheck((String)docMerge.getId(), dto.getServiceCode(), dto.getCheckType(), dto.getCheckItem()))) {
            DocMergeCheck docMergeCheck = docMergeCheckList.get(0);
            MergeResult mergeResult = this.buildMergeResult(docMergeCheck);
            IDocMergeCheckService checkService = (IDocMergeCheckService)IrisDynamicInvokeUtil.getService((String)microServiceCode, (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IDocMergeCheckService.class);
            List billInfoList = checkService.getExportToDoItem(MergeDocTypeEnum.Merchant, docMerge.getSourceDocId(), mergeResult);
            ToDoItem toDoItem = null;
            if (ObjectUtils.isNotEmpty((Object)billInfoList)) {
                for (BillInfo billInfo : billInfoList) {
                    toDoItem = new ToDoItem(docMergeCheck.getDomainCloudName(), docMergeCheck.getAppName(), docMergeCheck.getServiceName());
                    toDoItem.setCode(billInfo.getCode());
                    toDoItem.setName(billInfo.getName());
                    toDoItem.setSuggestion(billInfo.getSuggestion());
                    exportToDoItemList.add(toDoItem);
                }
            }
        }
        return exportToDoItemList;
    }

    public void exportToDoItem(String code, String microServiceCode, PubDocMergeCheckDTO dto, HttpServletResponse response) throws Exception {
        List<ToDoItem> toDoItemList = this.getToDoItem(code, microServiceCode, dto);
        if (ObjectUtils.isNotEmpty(toDoItemList)) {
            XSSFWorkbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E029CD405280005", (String)"\u5ba2\u6237\u5408\u5e76\u5728\u9014\u4e1a\u52a1\u68c0\u67e5\u5f85\u529e\u660e\u7ec6"));
            int rowNum = 0;
            Row headerRow = sheet.createRow(rowNum++);
            String[] columns = new String[]{InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1DE5B0C204880001", (String)"\u9886\u57df"), InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1DE5B2F004C80005", (String)"\u5e94\u7528"), InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1DE5B31A04C80003", (String)"\u670d\u52a1"), InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E0D2E4E05800007", (String)"\u5355\u636e\u7f16\u7801"), InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E0D2E7605C00001", (String)"\u5355\u636e\u540d\u79f0"), InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E0D2EA605800003", (String)"\u63aa\u65bd\u5efa\u8bae")};
            for (int i = 0; i < columns.length; ++i) {
                headerRow.createCell(i).setCellValue(columns[i]);
            }
            for (ToDoItem toDoItem : toDoItemList) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(toDoItem.getDomainCloudName());
                row.createCell(1).setCellValue(toDoItem.getAppName());
                row.createCell(2).setCellValue(toDoItem.getServiceName());
                row.createCell(3).setCellValue(toDoItem.getCode());
                row.createCell(4).setCellValue(toDoItem.getName());
                row.createCell(5).setCellValue(toDoItem.getSuggestion());
            }
            for (int i = 0; i < columns.length; ++i) {
                sheet.autoSizeColumn(i);
            }
            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
            String fileName = POIUtils.encode((String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1E029CD405280005", (String)"\u5ba2\u6237\u5408\u5e76\u5728\u9014\u4e1a\u52a1\u68c0\u67e5\u5f85\u529e\u660e\u7ec6"), (String)"UTF-8");
            response.setHeader("Content-Disposition", "attachment; filename=" + fileName + ".xlsx");
            try (ServletOutputStream outputStream = response.getOutputStream();){
                workbook.write((OutputStream)outputStream);
                outputStream.flush();
            }
            catch (IOException e) {
                log.error("Failed to write Excel file to response output stream", (Throwable)e);
                throw new RuntimeException("Failed to export ToDo items", e);
            }
            finally {
                try {
                    workbook.close();
                }
                catch (IOException e) {
                    log.error("Failed to close Excel workbook", (Throwable)e);
                }
            }
        }
    }

    private MergeResult buildMergeResult(DocMergeCheck docMergeCheck) {
        List checkStatusEnumList;
        MergeResult mergeResult = new MergeResult();
        mergeResult.setServiceCode(docMergeCheck.getServiceCode());
        List checkTypeEnumList = Arrays.stream(CheckTypeEnum.values()).filter(v -> v.toString().equals(docMergeCheck.getCheckType())).collect(Collectors.toList());
        if (ObjectUtils.isNotEmpty(checkTypeEnumList)) {
            mergeResult.setCheckTypeEnum((CheckTypeEnum)checkTypeEnumList.get(0));
        }
        if (ObjectUtils.isNotEmpty(checkStatusEnumList = Arrays.stream(CheckStatusEnum.values()).filter(v -> v.toString().equals(docMergeCheck.getCheckStatus())).collect(Collectors.toList()))) {
            mergeResult.setStatus((CheckStatusEnum)checkStatusEnumList.get(0));
        }
        mergeResult.setCheckItem(docMergeCheck.getCheckItem());
        return mergeResult;
    }

    public MergeDocTypeEnum convertDocType(String docType) {
        for (MergeDocTypeEnum docTypeEnum : MergeDocTypeEnum.values()) {
            if (!docTypeEnum.name().equals(docType)) continue;
            return docTypeEnum;
        }
        return null;
    }

    public List<DocMergeCheck> buildDocMergeCheck(String microServiceCode, String docMergeId, List<MergeResult> resultList) {
        ArrayList<DocMergeCheck> docMergeCheckList = new ArrayList<DocMergeCheck>();
        if (ObjectUtils.isNotEmpty(resultList)) {
            for (MergeResult mergeResult : resultList) {
                DocMergeCheck docMergeCheck = new DocMergeCheck();
                docMergeCheck.setId((Object)String.valueOf(IdManager.getInstance().nextId()));
                docMergeCheck.setDocMergeId(docMergeId);
                docMergeCheck.setMicroServiceCode(microServiceCode);
                docMergeCheck.setServiceCode(mergeResult.getServiceCode());
                docMergeCheck.setServiceName(mergeResult.getServiceCode());
                ServiceInfo serviceInfo = this.getServiceInfo(mergeResult.getServiceCode());
                if (serviceInfo != null) {
                    docMergeCheck.setDomainCloudCode(serviceInfo.getDomainCloudCode());
                    docMergeCheck.setDomainCloudName(serviceInfo.getDomainCloudName());
                    docMergeCheck.setSubDomainCloudCode(serviceInfo.getSubDomainCloudCode());
                    docMergeCheck.setSubDomainCloudName(serviceInfo.getSubDomainCloudName());
                    docMergeCheck.setAppCode(serviceInfo.getAppCode());
                    docMergeCheck.setAppName(serviceInfo.getAppName());
                    docMergeCheck.setServiceCode(serviceInfo.getServiceCode());
                    docMergeCheck.setServiceName(serviceInfo.getServiceName());
                }
                docMergeCheck.setCheckType(mergeResult.getCheckTypeEnum() == null ? null : mergeResult.getCheckTypeEnum().name());
                docMergeCheck.setCheckItem(mergeResult.getCheckItem());
                docMergeCheck.setCheckStandard(mergeResult.getCheckStandard());
                docMergeCheck.setCheckStatus(mergeResult.getStatus() == null ? null : mergeResult.getStatus().name());
                docMergeCheck.setCheckResult(CheckStatusEnum.noAgent.equals((Object)mergeResult.getStatus()) ? InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_2022267804280001", (String)"\u68c0\u67e5\u6210\u529f") : mergeResult.getResult());
                docMergeCheck.setSuggestion(mergeResult.getSuggestion());
                docMergeCheck.setUrl(mergeResult.getUrl());
                docMergeCheckList.add(docMergeCheck);
            }
        }
        return docMergeCheckList;
    }

    private ServiceInfo getServiceInfo(String serviceCode) {
        String locale = InvocationInfoProxy.getLocale() != null ? InvocationInfoProxy.getLocale() : "zh_CN";
        Label4DomainDTO labelDto = this.labelAppService.findDTOByTenantIdAndServiceCodeInDomain(AppContext.getCurrentUser().getYTenantId(), serviceCode);
        ServiceInfo serviceInfo = null;
        if (labelDto != null) {
            serviceInfo = new ServiceInfo();
            serviceInfo.setDomainCloudCode(labelDto.getLabelCode()).setDomainCloudName((String)labelDto.getMultiLangName().get(locale));
            serviceInfo.setSubDomainCloudCode(labelDto.getLabelCode()).setSubDomainCloudName((String)labelDto.getMultiLangName().get(locale));
            if (ObjectUtils.isNotEmpty((Object)labelDto.getApplications())) {
                Application4DomainDTO appDto = (Application4DomainDTO)labelDto.getApplications().get(0);
                serviceInfo.setAppCode(appDto.getApplicationCode()).setAppName((String)appDto.getMultiLangName().get(locale));
                if (ObjectUtils.isNotEmpty((Object)appDto.getServices())) {
                    Service4DomainDTO serviceDto = (Service4DomainDTO)appDto.getServices().get(0);
                    serviceInfo.setServiceCode(serviceDto.getServiceCode()).setServiceName((String)serviceDto.getMultiLangName().get(locale));
                }
            }
        }
        return serviceInfo;
    }

    public void updateDocMergeStatus(String id, CheckListStatus status) throws Exception {
        if (ObjectUtils.isNotEmpty((Object)id) && status != null) {
            DocMerge docMerge = new DocMerge();
            docMerge.setId((Object)id);
            docMerge.setStatus(Short.valueOf(status.getValue()));
            docMerge.setEntityStatus(EntityStatus.Update);
            BillInfoUtils.setEditAuditInfo((BizObject)docMerge);
            MetaDaoHelper.update((String)"coredoc.pub.DocMerge", (BizObject)docMerge);
        }
    }

    private void updateDocMergeTaskId(Object id, String taskId) throws Exception {
        if (ObjectUtils.isNotEmpty((Object)id) && ObjectUtils.isNotEmpty((Object)taskId)) {
            DocMerge docMerge = new DocMerge();
            docMerge.setId(id);
            docMerge.setCheckTaskId(taskId);
            docMerge.setEntityStatus(EntityStatus.Update);
            BillInfoUtils.setEditAuditInfo((BizObject)docMerge);
            MetaDaoHelper.update((String)"coredoc.pub.DocMerge", (BizObject)docMerge);
        }
    }

    public void deleteDocMergeCheck(String microServiceCode, String docMergeId) throws Exception {
        ArrayList<SimpleCondition> conditions = new ArrayList<SimpleCondition>();
        conditions.add(new SimpleCondition("microServiceCode", ConditionOperator.eq, (Object)microServiceCode));
        conditions.add(new SimpleCondition("docMergeId", ConditionOperator.eq, (Object)docMergeId));
        MetaDaoHelper.batchDelete((String)"coredoc.pub.DocMergeCheck", conditions);
    }

    private DocMerge queryDocMergeByCode(String code) throws Exception {
        if (ObjectUtils.isNotEmpty((Object)code)) {
            List<DocMerge> docMergeList = this.queryDocMerge(Collections.singletonList(code));
            return ObjectUtils.isNotEmpty(docMergeList) ? docMergeList.get(0) : null;
        }
        return null;
    }

    private List<DocMerge> queryDocMerge(List<String> codeList) throws Exception {
        ArrayList<DocMerge> docMergeList = new ArrayList<DocMerge>();
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        if (ObjectUtils.isNotEmpty(codeList)) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"code").in(codeList));
        }
        QuerySchema schema = QuerySchema.create().addSelect(DOC_MERGE_FIELD).addCondition((ConditionExpression)conditionGroup);
        List queryList = MetaDaoHelper.query((String)"coredoc.pub.DocMerge", (QuerySchema)schema);
        for (Map map : queryList) {
            DocMerge docMerge = new DocMerge();
            docMerge.init(map);
            docMergeList.add(docMerge);
        }
        return docMergeList;
    }

    private List<DocMergeCheck> queryDocMergeCheck(String docMergeId, String serviceCode, String checkType, String checkItem) throws Exception {
        ArrayList<DocMergeCheck> docMergeCheckList = new ArrayList<DocMergeCheck>();
        QueryConditionGroup conditionGroup = new QueryConditionGroup();
        if (ObjectUtils.isNotEmpty((Object)docMergeId)) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"docMergeId").eq((Object)docMergeId));
        }
        if (ObjectUtils.isNotEmpty((Object)docMergeId)) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"serviceCode").eq((Object)serviceCode));
        }
        if (ObjectUtils.isNotEmpty((Object)docMergeId)) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"checkType").eq((Object)checkType));
        }
        if (ObjectUtils.isNotEmpty((Object)docMergeId)) {
            conditionGroup.addCondition((ConditionExpression)QueryCondition.name((String)"checkItem").eq((Object)checkItem));
        }
        QuerySchema schema = QuerySchema.create().addSelect(DOC_MERGE_CHECK_FILED).addCondition((ConditionExpression)conditionGroup);
        List queryList = MetaDaoHelper.query((String)"coredoc.pub.DocMergeCheck", (QuerySchema)schema);
        for (Map map : queryList) {
            DocMergeCheck docMergeCheck = new DocMergeCheck();
            docMergeCheck.init(map);
            docMergeCheckList.add(docMergeCheck);
        }
        return docMergeCheckList;
    }

    private List<SyncAction> selectActionByTaskId(String taskId, int stage, Boolean isCheckSuccessful) {
        List<Object> result = new ArrayList<SyncAction>();
        if (ObjectUtils.isNotEmpty((Object)taskId)) {
            HashMap<String, Object> params = new HashMap<String, Object>();
            params.put("ytenantId", AppContext.getCurrentUser().getYTenantId());
            params.put("taskId", taskId);
            params.put("stage", stage);
            params.put("isCheckSuccessful", isCheckSuccessful);
            result = SqlHelper.selectList((String)"com.yonyoucloud.upc.aa.cust.selectActionByTaskId", params);
        }
        return result;
    }
}

