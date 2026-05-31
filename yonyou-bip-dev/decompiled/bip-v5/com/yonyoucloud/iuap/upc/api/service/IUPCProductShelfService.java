/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.api.service;

public interface IUPCProductShelfService {
    public void enableProduct(Long var1, Boolean var2) throws Exception;

    public void enableAllProductSku(Long var1, Long var2, Boolean var3) throws Exception;

    public void disableProduct(Long var1, Long var2, Boolean var3) throws Exception;

    public void forceDownShopProduct(Long var1) throws Exception;

    public void shelfMallProduct(Long var1) throws Exception;

    public void unShelfMallProduct(Long var1) throws Exception;

    public void shelfUOrderProduct(Long var1) throws Exception;

    public void unShelfUOrderProduct(Long var1) throws Exception;

    public void enableProductSKU(Long var1, Long var2, Long var3, Boolean var4) throws Exception;

    public void disableProductSKU(Long var1, Long var2, Long var3, Boolean var4) throws Exception;

    public void shelfMallProductSKU(Long var1, Long var2, Long var3, Boolean var4) throws Exception;

    public void shelfUOrderProductSKU(Long var1, Long var2, Long var3, Boolean var4) throws Exception;

    public void unShelfMallProductSKU(Long var1, Long var2, Long var3, Boolean var4) throws Exception;

    public void unShelfUOrderProductSKU(Long var1, Long var2, Long var3, Boolean var4) throws Exception;

    public void setShelfAndlLnventoryProductSKU(Long var1, Long var2, Long var3, Boolean var4, Boolean var5, Boolean var6) throws Exception;

    public void updateAutoModifyInfo(Long var1, String var2) throws Exception;
}

