/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.iuap.refcheck.utils.JsonUtil
 *  com.yonyou.iuap.scheduler.domain.ActionEntity
 *  com.yonyou.iuap.scheduler.domain.ActionResult
 *  com.yonyou.iuap.scheduler.domain.IActionInvoker
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyoucloud.upc.coredoc.pub.CheckListStatus
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.yonyoucloud.upc.service.docmerge.invocation;

import com.alibaba.fastjson.JSON;
import com.yonyou.iuap.refcheck.utils.JsonUtil;
import com.yonyou.iuap.scheduler.domain.ActionEntity;
import com.yonyou.iuap.scheduler.domain.ActionResult;
import com.yonyou.iuap.scheduler.domain.IActionInvoker;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyoucloud.upc.coredoc.pub.CheckListStatus;
import com.yonyoucloud.upc.service.docmerge.DocMergeService;
import com.yonyoucloud.upc.service.docmerge.model.BusinessCheckParam;
import java.text.MessageFormat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MerchantStopInvoker
implements IActionInvoker {
    private static final Logger log = LoggerFactory.getLogger(MerchantStopInvoker.class);

    public ActionResult invoke(ActionEntity actionEntity) {
        BusinessCheckParam docCheckParam = (BusinessCheckParam)JsonUtil.toObject((String)actionEntity.getContext(), BusinessCheckParam.class);
        DocMergeService docMergeService = (DocMergeService)AppContext.getBean(DocMergeService.class);
        if (docCheckParam == null && docCheckParam.getDocType() == null || docCheckParam.getSourceDocId() == null) {
            return ActionResult.buildFail((String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CFA592C05C00006", (String)"\u505c\u7528\u6863\u6848\u4e3a\u7a7a"));
        }
        try {
            docMergeService.updateDocMergeStatus(docCheckParam.getDocMergeId(), CheckListStatus.StopingCheckDoc);
            docMergeService.stopDoc(docCheckParam.getDocType(), docCheckParam.getSourceDocId());
            docMergeService.updateDocMergeStatus(docCheckParam.getDocMergeId(), CheckListStatus.BusinessCheckSuccess);
            return ActionResult.buildSuccess((String)MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CFA592C05C00007", (String)"\u505c\u7528{0}[{1}]\u6210\u529f"), docCheckParam.getDocType().name(), docCheckParam.getSourceDocId()));
        }
        catch (Exception e) {
            log.error(MessageFormat.format("\u505c\u7528{0}[{1}]\u5931\u8d25", docCheckParam.getDocType().name(), docCheckParam.getSourceDocId()), (Throwable)e);
            return ActionResult.buildFail((String)MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CFA592C05C00005", (String)"\u505c\u7528{0}[{1}]\u5931\u8d25\uff0c\u9519\u8bef\u539f\u56e0\uff1a{2}\uff0c\u4f4d\u7f6e\uff1a{3}"), docCheckParam.getDocType().name(), docCheckParam.getSourceDocId(), e, JSON.toJSONString((Object)e.getStackTrace())));
        }
    }
}

