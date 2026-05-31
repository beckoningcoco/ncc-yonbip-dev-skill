/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.vo.ProductAlbumVO;
import com.yonyoucloud.iuap.upc.vo.ProductAttachmentVO;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IProductDetailService {
    public List<ProductAlbumVO> listProductAlbum(Long var1) throws Exception;

    public List<ProductAttachmentVO> listProductAttachment(Long var1) throws Exception;
}

