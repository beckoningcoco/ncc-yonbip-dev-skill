/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.yts.annotation.YtsTransactional
 *  com.yonyou.cloud.yts.enums.TransactionMode
 */
package com.yonyou.iuap.doc.ext.service;

import com.yonyou.cloud.yts.annotation.YtsTransactional;
import com.yonyou.cloud.yts.enums.TransactionMode;
import com.yonyou.iuap.doc.check.dto.DocCheckResult;
import com.yonyou.iuap.doc.check.dto.DocOrgPairDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuDTO;
import java.util.List;

public interface ISkuExtExecuteService {
    @YtsTransactional(mode=TransactionMode.TCC, confirm="insertSkuConfirm", cancel="insertSkuCancel")
    public List<DocCheckResult> insertSku(List<ProductSkuDTO> var1);

    public List<DocCheckResult> insertSkuConfirm(List<ProductSkuDTO> var1);

    public List<DocCheckResult> insertSkuCancel(List<ProductSkuDTO> var1);

    @YtsTransactional(mode=TransactionMode.TCC, confirm="updateSkuConfirm", cancel="updateSkuCancel")
    public List<DocCheckResult> updateSku(List<ProductSkuDTO> var1, String[] var2);

    public List<DocCheckResult> updateSkuConfirm(List<ProductSkuDTO> var1, String[] var2);

    public List<DocCheckResult> updateSkuCancel(List<ProductSkuDTO> var1, String[] var2);

    @YtsTransactional(mode=TransactionMode.TCC, confirm="deleteSkuConfirm", cancel="deleteSkuCancel")
    public List<DocCheckResult> deleteSku(List<Long> var1);

    public List<DocCheckResult> deleteSkuConfirm(List<DocOrgPairDTO> var1);

    public List<DocCheckResult> deleteSkuCancel(List<DocOrgPairDTO> var1);
}

