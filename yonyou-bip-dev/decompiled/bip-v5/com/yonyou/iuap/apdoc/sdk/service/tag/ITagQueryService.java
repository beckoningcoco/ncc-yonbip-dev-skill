/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.apdoc.sdk.service.tag;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.TagDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface ITagQueryService {
    public UPCPager<TagDTO> listAllTagByPage(Integer var1, Integer var2) throws Exception;
}

