/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.rpc.RemoteCall
 */
package com.yonyou.iuap.bizdoc.service.sendTransWay;

import com.yonyou.cloud.middleware.rpc.RemoteCall;
import com.yonyou.iuap.bizdoc.service.model.SendTransWayModel;
import com.yonyou.iuap.bizdoc.service.model.SendTransWayQueryParam;
import java.util.List;

@RemoteCall(value="productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3")
public interface ISendTransWayQueryService {
    public List<SendTransWayModel> querySendTransWays(SendTransWayQueryParam var1);
}

