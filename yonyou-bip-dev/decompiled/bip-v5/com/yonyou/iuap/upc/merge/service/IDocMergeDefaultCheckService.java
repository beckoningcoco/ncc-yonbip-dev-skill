/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.upc.merge.service;

import com.yonyou.iuap.upc.merge.model.MergeCheckModel;
import com.yonyou.iuap.upc.merge.model.MergeResult;
import java.util.List;

public interface IDocMergeDefaultCheckService {
    public List<MergeResult> checkBeforeMerge(MergeCheckModel var1, String var2);
}

