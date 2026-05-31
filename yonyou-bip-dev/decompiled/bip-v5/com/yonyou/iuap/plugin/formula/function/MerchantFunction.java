/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.utils.JacksonUtilHolder
 *  com.yonyou.iuap.BusinessException
 */
package com.yonyou.iuap.plugin.formula.function;

import com.yonyou.cloud.utils.JacksonUtilHolder;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.sdk.dto.pub.IrisDynUtils;
import java.util.ArrayList;
import java.util.List;

public class MerchantFunction {
    public static Object getMerchantValue(String field, Object merchantId, Object orgId) throws Exception {
        if (field == null || field.trim().length() == 0) {
            throw new BusinessException("110486", "\u67e5\u8be2\u5b57\u6bb5\u53c2\u4e0d\u80fd\u4e3a\u7a7a");
        }
        if (null == merchantId) {
            throw new BusinessException("110486", "\u5ba2\u6237\u4e3b\u952e\u4e0d\u80fd\u4e3a\u7a7a");
        }
        if (orgId == null) {
            throw new BusinessException("110486", "\u7ec4\u7ec7\u4e0d\u80fd\u4e3a\u7a7a");
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        paramsTypeList.add(String.class.getName());
        String simpleMethodName = "getMerchantValue";
        if (merchantId instanceof Long) {
            paramsTypeList.add(Long.class.getName());
            if (orgId instanceof Long) {
                paramsTypeList.add(Long.class.getName());
            } else if (orgId instanceof String) {
                paramsTypeList.add(String.class.getName());
            }
        } else if (merchantId instanceof String) {
            paramsTypeList.add(String.class.getName());
            if (orgId instanceof Long) {
                paramsTypeList.add(Long.class.getName());
            } else if (orgId instanceof String) {
                paramsTypeList.add(String.class.getName());
            }
        } else {
            paramsTypeList.add(List.class.getName());
            paramsTypeList.add(List.class.getName());
            simpleMethodName = "getMerchantValues";
        }
        ArrayList<String> argsList = new ArrayList<String>();
        argsList.add(JacksonUtilHolder.toJson((Object)field));
        argsList.add(JacksonUtilHolder.toJson((Object)merchantId));
        argsList.add(JacksonUtilHolder.toJson((Object)orgId));
        String interfaceName = "com.yonyoucloud.upc.service.IMerchantRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }
}

