/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.middleware.iris.ExecuteResult
 *  com.yonyou.cloud.middleware.rpc.DynStub
 */
package com.yonyou.iuap.apdoc.sdk.dto.pub;

import com.yonyou.cloud.middleware.iris.ExecuteResult;
import com.yonyou.cloud.middleware.rpc.DynStub;
import java.util.List;

public class IrisDynUtils {
    public static Object irisExcute(String interfaceName, String methodName, List<String> paramsTypeList, List<String> argsList) {
        Object jsonResult;
        try {
            String[] typesArray = paramsTypeList.toArray(new String[0]);
            String[] argsArray = argsList.toArray(new String[0]);
            ExecuteResult result = DynStub.invokerExact((String)interfaceName, (String)"productcenter@c87e2267-1001-4c70-bb2a-ab41f3b81aa3", null, (String)methodName, (String[])typesArray, (String[])argsArray);
            jsonResult = result != null ? result.getValue() : "\u516c\u5f0f\u6267\u884c\u5f02\u5e38";
        }
        catch (Throwable e) {
            jsonResult = "\u516c\u5f0f\u6267\u884c\u9519\u8bef," + e.getMessage();
        }
        return jsonResult;
    }
}

