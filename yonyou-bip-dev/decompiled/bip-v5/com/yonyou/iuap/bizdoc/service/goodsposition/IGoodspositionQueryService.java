/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.bizdoc.service.goodsposition;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.bizdoc.service.model.GoodPositionModel;
import com.yonyou.iuap.bizdoc.service.model.GoodsProductsComparisonModel;
import com.yonyou.iuap.bizdoc.service.model.GoodspositionQueryParam;
import com.yonyou.iuap.bizdoc.service.model.GoodsproductscomparisonQueryParam;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface IGoodspositionQueryService {
    public List<GoodPositionModel> queryGoodspositions(GoodspositionQueryParam var1);

    public List<GoodsProductsComparisonModel> queryGoodsproductscomparisons(GoodsproductscomparisonQueryParam var1);
}

