/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.bizdoc.service.settlemethod;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.bizdoc.service.model.SettleMethodContrastModel;
import com.yonyou.iuap.bizdoc.service.model.SettleMethodContrastQueryParam;
import com.yonyou.iuap.bizdoc.service.model.SettleMethodModel;
import com.yonyou.iuap.bizdoc.service.model.SettleMethodQueryParam;
import com.yonyou.iuap.bizdoc.service.model.SettleMethodTreeModel;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface ISettleMethodQueryService {
    public List<SettleMethodModel> querySettleMethods(SettleMethodQueryParam var1);

    public List<SettleMethodContrastModel> querySettleMethodContrasts(SettleMethodContrastQueryParam var1);

    public List<SettleMethodTreeModel> querySettleMethodTree(SettleMethodQueryParam var1);
}

