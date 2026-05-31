/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.bizdoc.service.warehouse;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.bizdoc.service.model.WarehouseModel;
import com.yonyou.iuap.bizdoc.service.model.WarehouseQueryParam;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IWarehouseQueryService {
    public List<WarehouseModel> queryWarehouses(WarehouseQueryParam var1);
}

