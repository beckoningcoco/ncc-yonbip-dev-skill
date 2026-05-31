/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.doc.ext.service;

import com.yonyou.iuap.doc.check.dto.DocOrgPairDTO;
import com.yonyoucloud.iuap.upc.dto.ProductSkuDTO;
import java.util.List;

public interface ISkuExtNotifyService {
    public void insertSkuNotify(List<ProductSkuDTO> var1);

    public void updateSkuNotify(List<ProductSkuDTO> var1, String[] var2);

    public void deleteSkuNotify(List<Long> var1);

    public void deleteSkuOrgNotify(List<DocOrgPairDTO> var1);

    public void stopSkuNotify(List<Long> var1);

    public void stopSkuOrgNotify(List<DocOrgPairDTO> var1);

    public void unStopSkuNotify(List<Long> var1);

    public void unStopSkuOrgNotify(List<DocOrgPairDTO> var1);
}

