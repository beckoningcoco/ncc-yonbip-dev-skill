/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO
 *  com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityVO
 */
package com.yonyoucloud.iuap.upc.api.service;

import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntityQueryDTO;
import com.yonyoucloud.upc.coredoc.batchentity.dto.PubBatchModifyEntitySaveDTO;
import com.yonyoucloud.upc.coredoc.batchentity.vo.PubBatchModifyEntityVO;
import java.util.List;

public interface IPubBatchModifyEntityService {
    public List<PubBatchModifyEntityVO> getPubBatchModifyEntityVO(PubBatchModifyEntityQueryDTO var1) throws Exception;

    public PubBatchModifyEntityVO getPubBatchModifyEntityFieldVO(PubBatchModifyEntityQueryDTO var1) throws Exception;

    public String batchModifyAsyncKey(PubBatchModifyEntitySaveDTO var1);

    public void batchModify(PubBatchModifyEntitySaveDTO var1) throws Exception;

    public void batchModifyTransactional(PubBatchModifyEntitySaveDTO var1, String var2, String var3, String var4, String var5);
}

