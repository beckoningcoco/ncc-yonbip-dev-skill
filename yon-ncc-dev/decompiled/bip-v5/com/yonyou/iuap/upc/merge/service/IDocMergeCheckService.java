/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.upc.merge.service;

import com.yonyou.iuap.upc.merge.model.BillInfo;
import com.yonyou.iuap.upc.merge.model.MergeDocTypeEnum;
import com.yonyou.iuap.upc.merge.model.MergeResult;
import java.util.List;

public interface IDocMergeCheckService {
    public List<MergeResult> checkBeforeMerge(MergeDocTypeEnum var1, String var2);

    public List<BillInfo> getExportToDoItem(MergeDocTypeEnum var1, String var2, MergeResult var3);
}

