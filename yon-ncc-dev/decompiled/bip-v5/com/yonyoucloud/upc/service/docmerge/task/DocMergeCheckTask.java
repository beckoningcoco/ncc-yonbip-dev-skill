/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.diwork.service.IServiceManager4DomainCacheService
 *  com.yonyou.iuap.refcheck.utils.JsonUtil
 *  com.yonyou.iuap.scheduler.domain.Action
 *  com.yonyou.iuap.scheduler.domain.Task
 *  com.yonyou.iuap.scheduler.service.TaskService
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.upc.merge.model.MergeDocTypeEnum
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  org.apache.commons.lang3.ObjectUtils
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Service
 *  org.springframework.transaction.annotation.Propagation
 *  org.springframework.transaction.annotation.Transactional
 */
package com.yonyoucloud.upc.service.docmerge.task;

import com.yonyou.diwork.service.IServiceManager4DomainCacheService;
import com.yonyou.iuap.refcheck.utils.JsonUtil;
import com.yonyou.iuap.scheduler.domain.Action;
import com.yonyou.iuap.scheduler.domain.Task;
import com.yonyou.iuap.scheduler.service.TaskService;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.upc.merge.model.MergeDocTypeEnum;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyoucloud.upc.service.docmerge.invocation.MerchantBusinessCheckInvoker;
import com.yonyoucloud.upc.service.docmerge.invocation.MerchantStopInvoker;
import com.yonyoucloud.upc.service.docmerge.model.BusinessCheckParam;
import com.yonyoucloud.upc.service.docmerge.model.TaskTypeEnum;
import com.yonyoucloud.upc.service.docmerge.task.TaskBase;
import java.text.MessageFormat;
import java.util.List;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DocMergeCheckTask
extends TaskBase {
    @Autowired
    private TaskService taskService;
    @Autowired
    private IServiceManager4DomainCacheService manager4Domain;

    @Transactional(propagation=Propagation.REQUIRED, rollbackFor={Throwable.class})
    public String startTask(String docMergeId, MergeDocTypeEnum docType, String sourceDocId) {
        if (docType == null || ObjectUtils.isEmpty((Object)sourceDocId)) {
            return null;
        }
        Task task = this.createTask(docMergeId, docType, sourceDocId);
        String taskId = this.taskService.addTask(task);
        this.scheduleTask(this.taskService, taskId);
        return taskId;
    }

    public Task createTask(String docMergeId, MergeDocTypeEnum docType, String sourceDocId) {
        if (!MergeDocTypeEnum.Merchant.equals((Object)docType)) {
            return null;
        }
        Task task = new Task("DocMergeCheckTask", TaskTypeEnum.MerchantMergeCheck.name(), TaskTypeEnum.MerchantMergeCheck.name());
        int stage = 1;
        BusinessCheckParam checkParam = new BusinessCheckParam(docMergeId, docType, sourceDocId, null);
        List microServiceCodes = this.manager4Domain.findMicroServiceCodeByTenantId(AppContext.getCurrentUser().getYTenantId());
        if (ObjectUtils.isNotEmpty((Object)microServiceCodes)) {
            for (String microServiceCode : microServiceCodes) {
                checkParam.setMicroServiceCode(microServiceCode);
                task.addAction(new Action(MessageFormat.format("businessCheck#[{0}]", microServiceCode), MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CFA592C05C00008", (String)"\u8c03\u7528\u5fae\u670d\u52a1[{0}]\uff0c\u5728\u9014\u4e1a\u52a1\u68c0\u67e5"), microServiceCode), stage, JsonUtil.toJsonString((Object)checkParam), MerchantBusinessCheckInvoker.class));
            }
        }
        task.addAction(new Action("stopDoc", MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CFA592C05C00009", (String)"\u505c\u7528{0}[{1}]"), docType.name(), sourceDocId), ++stage, JsonUtil.toJsonString((Object)checkParam), MerchantStopInvoker.class));
        return task;
    }
}

