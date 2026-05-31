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
import com.yonyoucloud.iuap.upc.dto.MerchantDTO;
import java.util.List;

public interface IMerchantExtExecuteService {
    @YtsTransactional(mode=TransactionMode.TCC, confirm="insertMerchantConfirm", cancel="insertMerchantCancel")
    public List<DocCheckResult> insertMerchant(List<MerchantDTO> var1);

    public List<DocCheckResult> insertMerchantConfirm(List<MerchantDTO> var1);

    public List<DocCheckResult> insertMerchantCancel(List<MerchantDTO> var1);

    @YtsTransactional(mode=TransactionMode.TCC, confirm="updateMerchantConfirm", cancel="updateMerchantCancel")
    public List<DocCheckResult> updateMerchant(List<MerchantDTO> var1, String[] var2);

    public List<DocCheckResult> updateMerchantConfirm(List<MerchantDTO> var1, String[] var2);

    public List<DocCheckResult> updateMerchantCancel(List<MerchantDTO> var1, String[] var2);

    @YtsTransactional(mode=TransactionMode.TCC, confirm="deleteMerchantConfirm", cancel="deleteMerchantCancel")
    public List<DocCheckResult> deleteMerchant(List<Long> var1);

    public List<DocCheckResult> deleteMerchantConfirm(List<DocOrgPairDTO> var1);

    public List<DocCheckResult> deleteMerchantCancel(List<DocOrgPairDTO> var1);
}

