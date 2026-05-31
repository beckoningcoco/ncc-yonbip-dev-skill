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
import java.util.List;

public interface IUnitExtExecuteService {
    @YtsTransactional(mode=TransactionMode.TCC, confirm="deleteUnitConfirm", cancel="deleteUnitCancel")
    public List<DocCheckResult> deleteUnit(List<Long> var1);

    public List<DocCheckResult> deleteUnitConfirm(List<Long> var1);

    public List<DocCheckResult> deleteUnitCancel(List<Long> var1);
}

