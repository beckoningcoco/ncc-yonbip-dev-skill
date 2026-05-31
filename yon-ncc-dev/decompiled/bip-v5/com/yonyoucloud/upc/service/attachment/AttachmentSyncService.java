/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.upc.tools.CoreDocJsonResultForOpenApi
 *  com.yonyoucloud.iuap.upc.dto.ext.UPCPager
 *  com.yonyoucloud.iuap.upc.vo.attachment.AttachmentInfoSyncQueryVO
 *  com.yonyoucloud.upc.utils.vo.AttachmentInfoSyncIntegrationVO
 */
package com.yonyoucloud.upc.service.attachment;

import com.yonyou.upc.tools.CoreDocJsonResultForOpenApi;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;
import com.yonyoucloud.iuap.upc.vo.attachment.AttachmentInfoSyncQueryVO;
import com.yonyoucloud.upc.utils.vo.AttachmentInfoSyncIntegrationVO;
import java.util.List;

public interface AttachmentSyncService {
    public CoreDocJsonResultForOpenApi<Object> batchUpdateAttachmentBusinessId(AttachmentInfoSyncQueryVO var1);

    public CoreDocJsonResultForOpenApi<Object> batchUpdateAttachmentBusinessIdIntegration(List<AttachmentInfoSyncIntegrationVO> var1);

    public CoreDocJsonResultForOpenApi<Object> batchDeleteAttachmentBusinessId(AttachmentInfoSyncQueryVO var1);

    public UPCPager queryIncrementAttachmentFromCooperation(String var1, Integer var2, Integer var3);

    public UPCPager queryDeletedAttachmentFromCooperation(String var1, Integer var2, Integer var3);
}

