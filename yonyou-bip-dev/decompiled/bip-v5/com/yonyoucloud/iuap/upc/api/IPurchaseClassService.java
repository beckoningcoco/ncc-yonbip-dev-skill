/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyoucloud.iuap.upc.api;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.derivatives.PurchaseClassDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.PurchaseClassQryDTO;
import com.yonyoucloud.upc.utils.CoreDocJsonResult;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IPurchaseClassService {
    public CoreDocJsonResult<PurchaseClassDTO> queryByID(Long var1);

    public CoreDocJsonResult<PurchaseClassDTO> queryByCode(String var1);

    public CoreDocJsonResult<PurchaseClassDTO> listByPage(PurchaseClassQryDTO var1);

    public CoreDocJsonResult<PurchaseClassDTO> add(PurchaseClassDTO var1);

    public CoreDocJsonResult<PurchaseClassDTO> update(PurchaseClassDTO var1);
}

