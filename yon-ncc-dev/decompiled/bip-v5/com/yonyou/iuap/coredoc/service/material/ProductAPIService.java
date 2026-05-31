/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialVO
 */
package com.yonyou.iuap.coredoc.service.material;

import com.yonyou.iuap.apdoc.coredoc.vo.material.MaterialVO;

public interface ProductAPIService {
    public MaterialVO productSaveForApi(MaterialVO var1, Integer var2, String var3) throws Exception;

    public MaterialVO productDetailSaveForApi(MaterialVO var1, Integer var2) throws Exception;
}

