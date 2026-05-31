/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.upc.service;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import java.util.List;

@RemoteCall(value="c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductRpcService {
    public Object getProductValue(String var1, Long var2, Long var3);

    public Object getProductValue(String var1, Long var2, String var3);

    public Object getProductValue(String var1, String var2, Long var3);

    public Object getProductValue(String var1, String var2, String var3);

    public Object getProductValue(String var1, List<Long> var2, List<String> var3);

    public Object getProductValues(String var1, List<Object> var2, List<Object> var3);

    public Object getProductSKUValue(String var1, Long var2, Long var3);

    public Object getProductSKUValue(String var1, Long var2, String var3);

    public Object getProductSKUValue(String var1, String var2, Long var3);

    public Object getProductSKUValue(String var1, String var2, String var3);

    public Object getProductSKUValues(String var1, List<Object> var2, List<Object> var3);

    public Object getProductFreeCharactorValue(Long var1);

    public Object getProductsFreeCharactorValue(List<Long> var1);

    public Object getMaterialHomeImage(Long var1);

    public Object getMaterialsHomeImage(List<Long> var1);

    public Object getMaterialAlbum(Long var1);

    public Object getMaterialsAlbum(List<Long> var1);

    public Object getSkuAlbum(Long var1);

    public Object getSkusAlbum(List<Long> var1);

    public Object getAlbumByBusinessId(String var1);

    public Object getAlbumByBusinessId(List<String> var1);
}

