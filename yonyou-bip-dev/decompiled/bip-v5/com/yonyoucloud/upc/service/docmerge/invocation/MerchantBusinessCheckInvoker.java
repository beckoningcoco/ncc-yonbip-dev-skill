/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.alibaba.fastjson.JSON
 *  com.yonyou.cloud.exception.IrisRpcRemoteException
 *  com.yonyou.cloud.exception.PluginRuntimeException
 *  com.yonyou.cloud.exception.YmsRpcErrorCode
 *  com.yonyou.cloud.middleware.iris.discovery.IInstanceService
 *  com.yonyou.cloud.mw.MwLocator
 *  com.yonyou.cloud.util.IrisDynamicInvokeUtil
 *  com.yonyou.iuap.refcheck.utils.JsonUtil
 *  com.yonyou.iuap.scheduler.domain.ActionEntity
 *  com.yonyou.iuap.scheduler.domain.ActionResult
 *  com.yonyou.iuap.scheduler.domain.IActionInvoker
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 *  com.yonyou.iuap.upc.merge.service.IDocMergeCheckService
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper
 *  com.yonyoucloud.upc.coredoc.pub.DocMergeCheck
 *  org.apache.commons.lang3.ObjectUtils
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package com.yonyoucloud.upc.service.docmerge.invocation;

import com.alibaba.fastjson.JSON;
import com.yonyou.cloud.exception.IrisRpcRemoteException;
import com.yonyou.cloud.exception.PluginRuntimeException;
import com.yonyou.cloud.exception.YmsRpcErrorCode;
import com.yonyou.cloud.middleware.iris.discovery.IInstanceService;
import com.yonyou.cloud.mw.MwLocator;
import com.yonyou.cloud.util.IrisDynamicInvokeUtil;
import com.yonyou.iuap.refcheck.utils.JsonUtil;
import com.yonyou.iuap.scheduler.domain.ActionEntity;
import com.yonyou.iuap.scheduler.domain.ActionResult;
import com.yonyou.iuap.scheduler.domain.IActionInvoker;
import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import com.yonyou.iuap.upc.merge.service.IDocMergeCheckService;
import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyou.ucf.mdd.ext.dao.meta.MetaDaoHelper;
import com.yonyoucloud.upc.coredoc.pub.DocMergeCheck;
import com.yonyoucloud.upc.service.docmerge.DocMergeService;
import com.yonyoucloud.upc.service.docmerge.model.BusinessCheckParam;
import java.text.MessageFormat;
import java.util.List;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MerchantBusinessCheckInvoker
implements IActionInvoker {
    private static final Logger log = LoggerFactory.getLogger(MerchantBusinessCheckInvoker.class);
    private static final String PROVIDER_NO_IMPLEMENTATION = "103500";

    public ActionResult invoke(ActionEntity actionEntity) {
        BusinessCheckParam docCheckParam = (BusinessCheckParam)JsonUtil.toObject((String)actionEntity.getContext(), BusinessCheckParam.class);
        DocMergeService docMergeService = (DocMergeService)AppContext.getBean(DocMergeService.class);
        if (docCheckParam == null || docCheckParam.getMicroServiceCode() == null || docCheckParam.getDocMergeId() == null) {
            return ActionResult.buildFail((String)InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CFA592C05C0000B", (String)"\u9886\u57df\u5fae\u670d\u52a1\u7f16\u7801\u4e3a\u7a7a"));
        }
        String microServiceCode = docCheckParam.getMicroServiceCode();
        try {
            Integer upInstancesNum = ((IInstanceService)MwLocator.lookup(IInstanceService.class)).getUpInstancesNum(microServiceCode, "c87e2267-1001-4c70-bb2a-ab41f3b81aa3");
            if (upInstancesNum == 0) {
                return ActionResult.buildSuccess((String)MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CFB01980568000A", (String)"\u8c03\u7528\u5fae\u670d\u52a1[{0}]\uff0c\u6ce8\u518c\u4e2d\u5fc3\u65e0\u53ef\u7528\u5b9e\u4f8b\uff0c\u4e0d\u67e5\u8be2"), microServiceCode));
            }
            docMergeService.deleteDocMergeCheck(microServiceCode, docCheckParam.getDocMergeId());
            IDocMergeCheckService checkService = (IDocMergeCheckService)IrisDynamicInvokeUtil.getService((String)microServiceCode, (String)"c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, IDocMergeCheckService.class);
            List resultList = checkService.checkBeforeMerge(docCheckParam.getDocType(), docCheckParam.getSourceDocId());
            if (ObjectUtils.isNotEmpty((Object)resultList)) {
                List<DocMergeCheck> docMergeCheckList = docMergeService.buildDocMergeCheck(microServiceCode, docCheckParam.getDocMergeId(), resultList);
                MetaDaoHelper.insert((String)"coredoc.pub.DocMergeCheck", docMergeCheckList);
            }
            return ActionResult.buildSuccess((String)MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CFA592C05C0000D", (String)"\u8c03\u7528\u5fae\u670d\u52a1[{0}]\uff0c\u5728\u9014\u4e1a\u52a1\u68c0\u67e5\u6210\u529f"), microServiceCode));
        }
        catch (Exception e) {
            log.error(MessageFormat.format("\u8c03\u7528\u5fae\u670d\u52a1[{0}]\uff0c\u5728\u9014\u4e1a\u52a1\u68c0\u67e5\u5931\u8d25", microServiceCode), (Throwable)e);
            if (MerchantBusinessCheckInvoker.canSkip(e)) {
                return ActionResult.buildSkip((String)MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CFA592C05C0000A", (String)"\u8c03\u7528\u5fae\u670d\u52a1[{0}]\uff0c\u672a\u5b9e\u73b0\u5728\u9014\u4e1a\u52a1\u68c0\u67e5\u63a5\u53e3\uff0c\u4e0d\u67e5\u8be2"), microServiceCode));
            }
            return ActionResult.buildFail((String)MessageFormat.format(InternationalUtils.getMessageWithDefault((String)"UID:P_COREDOC-BE_1CFA592C05C0000C", (String)"\u8c03\u7528\u5fae\u670d\u52a1[{0}]\uff0c\u5728\u9014\u4e1a\u52a1\u68c0\u67e5\u5931\u8d25\uff0c\u9519\u8bef\u539f\u56e0\uff1a{1}\uff0c\u4f4d\u7f6e\uff1a{2}"), microServiceCode, e, JSON.toJSONString((Object)e.getStackTrace())));
        }
    }

    public static boolean canSkip(Exception e) {
        if (e instanceof IrisRpcRemoteException) {
            String errorCode = ((IrisRpcRemoteException)e).getErrorCode();
            return PROVIDER_NO_IMPLEMENTATION.equals(errorCode);
        }
        if (!(e instanceof PluginRuntimeException)) {
            return false;
        }
        int errorCode = ((PluginRuntimeException)e).getErrorCode();
        return errorCode == YmsRpcErrorCode.PROVIDER_NO_BEAN_ERROR.getErrorCode() || errorCode == YmsRpcErrorCode.NO_TARGET_METHOD_ERROR.getErrorCode() || errorCode == YmsRpcErrorCode.INVOKE_NO_INSTANCE_ERROR.getErrorCode() || errorCode == 0;
    }
}

