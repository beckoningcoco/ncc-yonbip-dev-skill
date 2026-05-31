/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.ucf.mdd.ext.core.AppContext
 *  org.springframework.beans.factory.annotation.Autowired
 *  org.springframework.stereotype.Component
 */
package com.yonyoucloud.upc.service;

import com.yonyou.ucf.mdd.ext.core.AppContext;
import com.yonyoucloud.upc.service.ProductSkuAsyncSaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="productSkuRealmService")
public class ProductSkuRealmService {
    private static final String CONCAT_SUFFIX = "_IMPORT_PRODUCTIDSET";
    @Autowired
    ProductSkuAsyncSaveService productSkuAsyncSaveService;

    public void writeImportCache(String asyncKey, Long productId) {
        AppContext.cache().sadd(this.getImportKey(asyncKey), new String[]{productId.toString()});
    }

    private String getImportKey(String asyncKey) {
        return asyncKey + CONCAT_SUFFIX;
    }
}

