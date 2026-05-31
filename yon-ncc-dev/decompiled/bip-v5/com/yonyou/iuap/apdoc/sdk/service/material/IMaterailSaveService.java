/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 *  com.yonyou.cloud.yts.annotation.YtsTransactional
 *  com.yonyou.cloud.yts.enums.TransactionMode
 */
package com.yonyou.iuap.apdoc.sdk.service.material;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.cloud.yts.annotation.YtsTransactional;
import com.yonyou.cloud.yts.enums.TransactionMode;
import com.yonyoucloud.iuap.upc.dto.ext.UPCResultList;
import com.yonyoucloud.iuap.upc.vo.ProductApiVO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IMaterailSaveService {
    @YtsTransactional(mode=TransactionMode.TCC, confirm="materialBatchInsertConfirm", cancel="materialBatchInsertCancel")
    public CoreDocJsonResult<UPCResultList> materialBatchInsert(List<ProductApiVO> var1);

    public CoreDocJsonResult<UPCResultList> materialBatchInsertConfirm(List<ProductApiVO> var1);

    public CoreDocJsonResult<UPCResultList> materialBatchInsertCancel(List<ProductApiVO> var1);

    @YtsTransactional(mode=TransactionMode.TCC, confirm="materialBatchUpdateConfirm", cancel="materialBatchUpdateCancel")
    public CoreDocJsonResult<UPCResultList> materialBatchUpdate(List<ProductApiVO> var1, String[] var2);

    public CoreDocJsonResult<UPCResultList> materialBatchUpdateConfirm(List<ProductApiVO> var1, String[] var2);

    public CoreDocJsonResult<UPCResultList> materialBatchUpdateCancel(List<ProductApiVO> var1, String[] var2);
}

