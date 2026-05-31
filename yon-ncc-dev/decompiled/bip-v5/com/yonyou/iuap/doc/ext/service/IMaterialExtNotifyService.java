/*
 * Decompiled with CFR 0.152.
 */
package com.yonyou.iuap.doc.ext.service;

import com.yonyou.iuap.doc.check.dto.DocOrgPairDTO;
import com.yonyoucloud.iuap.upc.dto.ProductDTO;
import java.util.List;

public interface IMaterialExtNotifyService {
    public void insertMaterialNotify(List<ProductDTO> var1);

    public void updateMaterialNotify(List<ProductDTO> var1, String[] var2);

    public void deleteMaterialNotify(List<Long> var1);

    public void deleteMaterialOrgNotify(List<DocOrgPairDTO> var1);

    public void stopMaterialNotify(List<Long> var1);

    public void stopMaterialOrgNotify(List<DocOrgPairDTO> var1);

    public void unStopMaterialNotify(List<Long> var1);

    public void unStopMaterialOrgNotify(List<DocOrgPairDTO> var1);
}

