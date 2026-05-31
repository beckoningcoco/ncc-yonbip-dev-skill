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
import com.yonyoucloud.iuap.upc.dto.ProductDTO;
import java.util.List;

public interface IMaterialExtExecuteService {
    @YtsTransactional(mode=TransactionMode.TCC, confirm="insertMaterialConfirm", cancel="insertMaterialCancel")
    public List<DocCheckResult> insertMaterial(List<ProductDTO> var1);

    public List<DocCheckResult> insertMaterialConfirm(List<ProductDTO> var1);

    public List<DocCheckResult> insertMaterialCancel(List<ProductDTO> var1);

    @YtsTransactional(mode=TransactionMode.TCC, confirm="updateMaterialConfirm", cancel="updateMaterialCancel")
    public List<DocCheckResult> updateMaterial(List<ProductDTO> var1, String[] var2);

    public List<DocCheckResult> updateMaterialConfirm(List<ProductDTO> var1, String[] var2);

    public List<DocCheckResult> updateMaterialCancel(List<ProductDTO> var1, String[] var2);

    @YtsTransactional(mode=TransactionMode.TCC, confirm="deleteMaterialConfirm", cancel="deleteMaterialCancel")
    public List<DocCheckResult> deleteMaterial(List<Long> var1);

    public List<DocCheckResult> deleteMaterialConfirm(List<DocOrgPairDTO> var1);

    public List<DocCheckResult> deleteMaterialCancel(List<DocOrgPairDTO> var1);
}

