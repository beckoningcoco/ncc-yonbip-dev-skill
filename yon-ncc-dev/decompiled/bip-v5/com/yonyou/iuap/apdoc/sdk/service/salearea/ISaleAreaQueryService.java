/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.apdoc.sdk.service.salearea;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyoucloud.iuap.upc.dto.derivatives.SaleAreaDTO;
import com.yonyoucloud.iuap.upc.dto.derivatives.SaleAreaQryDTO;
import com.yonyoucloud.iuap.upc.dto.ext.UPCPager;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface ISaleAreaQueryService {
    public UPCPager<SaleAreaDTO> listSaleAreaByInfo(SaleAreaQryDTO var1) throws Exception;

    public UPCPager<SaleAreaDTO> listSaleAreaByOrg(String var1, int var2, int var3) throws Exception;
}

