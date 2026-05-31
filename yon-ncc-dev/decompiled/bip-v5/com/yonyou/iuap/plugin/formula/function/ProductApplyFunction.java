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

public class ProductApplyFunction {
    public static Object getProductApplyValue(String field, Object productApplyId) throws Exception {
        if (field == null || field.trim().length() == 0) {
            throw new BusinessException("110486", "\u67e5\u8be2\u5b57\u6bb5\u53c2\u4e0d\u80fd\u4e3a\u7a7a");
        }
        if (null == productApplyId) {
            throw new BusinessException("110486", "\u7269\u6599\u7533\u8bf7\u5355\u4e3b\u952e\u4e0d\u80fd\u4e3a\u7a7a");
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        paramsTypeList.add(String.class.getName());
        String simpleMethodName = "getProductApplyValue";
        if (productApplyId instanceof Long) {
            paramsTypeList.add(Long.class.getName());
        } else {
            paramsTypeList.add(List.class.getName());
            simpleMethodName = "getProductApplyValues";
        }
        ArrayList<String> argsList = new ArrayList<String>();
        argsList.add(JacksonUtilHolder.toJson((Object)field));
        argsList.add(JacksonUtilHolder.toJson((Object)productApplyId));
        String interfaceName = "com.yonyoucloud.upc.service.IProductApplyRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }

    public static Object getOriginalProductDataFromApply(String field, Object productApplyId) throws Exception {
        if (field == null || field.trim().length() == 0) {
            throw new BusinessException("110486", "\u67e5\u8be2\u5b57\u6bb5\u53c2\u4e0d\u80fd\u4e3a\u7a7a");
        }
        if (null == productApplyId) {
            throw new BusinessException("110486", "\u7269\u6599\u7533\u8bf7\u5355\u4e3b\u952e\u4e0d\u80fd\u4e3a\u7a7a");
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        paramsTypeList.add(String.class.getName());
        String simpleMethodName = "getOriginalProductDataFromApply";
        if (productApplyId instanceof Long) {
            paramsTypeList.add(Long.class.getName());
        } else {
            paramsTypeList.add(List.class.getName());
            simpleMethodName = "getOriginalProductDataFromApplys";
        }
        ArrayList<String> argsList = new ArrayList<String>();
        argsList.add(JacksonUtilHolder.toJson((Object)field));
        argsList.add(JacksonUtilHolder.toJson((Object)productApplyId));
        String interfaceName = "com.yonyoucloud.upc.service.IProductApplyRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }
}

