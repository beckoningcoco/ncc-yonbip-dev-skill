/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.doc.ext.service;

import com.yonyou.iuap.doc.check.dto.DocCheckDataDTO;
import com.yonyou.iuap.doc.check.dto.DocCheckResult;
import java.util.List;

public interface IMerchantExtCheckService {
    public List<DocCheckResult> fastCheckMaterialRef(List<DocCheckDataDTO> var1);

    public List<DocCheckResult> listUsedBillDataDetails(List<DocCheckDataDTO> var1);
}

