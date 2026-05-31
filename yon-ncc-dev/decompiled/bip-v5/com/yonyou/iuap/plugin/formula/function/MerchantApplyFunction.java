/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.cloud.utils.JacksonUtilHolder
 *  com.yonyou.iuap.BusinessException
 *  org.springframework.util.StringUtils
 */
package com.yonyou.iuap.plugin.formula.function;

import com.yonyou.cloud.utils.JacksonUtilHolder;
import com.yonyou.iuap.BusinessException;
import com.yonyou.iuap.apdoc.sdk.dto.pub.IrisDynUtils;
import java.util.ArrayList;
import java.util.List;
import org.springframework.util.StringUtils;

public class MerchantApplyFunction {
    public static Object getMerchantApplyValue(String field, Object merchantApplyId) {
        if (field == null || field.trim().length() == 0) {
            throw new BusinessException("110486", "\u67e5\u8be2\u5b57\u6bb5\u53c2\u4e0d\u80fd\u4e3a\u7a7a");
        }
        if (null == merchantApplyId) {
            return "\u5ba2\u6237\u7533\u8bf7\u5355\u4e3b\u952e\u4e0d\u80fd\u4e3a\u7a7a";
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        paramsTypeList.add(String.class.getName());
        String simpleMethodName = "getMerchantApplyValue";
        if (merchantApplyId instanceof Long) {
            paramsTypeList.add(Long.class.getName());
        } else {
            paramsTypeList.add(List.class.getName());
            simpleMethodName = "getMerchantApplyValues";
        }
        ArrayList<String> argsList = new ArrayList<String>();
        argsList.add(JacksonUtilHolder.toJson((Object)field));
        argsList.add(JacksonUtilHolder.toJson((Object)merchantApplyId));
        String interfaceName = "com.yonyoucloud.upc.service.IMerchantApplyRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }

    public static Object orgIsExistMerchantApplyRange(String orgCode, String orgName, Object customerApplyId) {
        if (!(orgCode != null && orgCode.trim().length() != 0 || orgName != null && orgName.trim().length() != 0)) {
            throw new BusinessException("110486", "\u7ec4\u7ec7\u7f16\u7801\u6216\u8005\u7ec4\u7ec7\u540d\u79f0\u4e0d\u80fd\u540c\u65f6\u4e3a\u7a7a");
        }
        if (null == customerApplyId) {
            throw new BusinessException("110486", "\u5ba2\u6237\u7533\u8bf7\u5355\u4e3b\u952e\u4e0d\u80fd\u4e3a\u7a7a");
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        paramsTypeList.add(String.class.getName());
        paramsTypeList.add(String.class.getName());
        String simpleMethodName = "orgIsExistMerchantApplyRange";
        if (customerApplyId instanceof Long) {
            paramsTypeList.add(Long.class.getName());
        } else {
            paramsTypeList.add(List.class.getName());
            simpleMethodName = "orgIsExistMerchantApplyRanges";
        }
        ArrayList<String> argsList = new ArrayList<String>();
        if (orgCode == null || orgCode.trim().length() == 0) {
            argsList.add(JacksonUtilHolder.toJson((Object)orgCode));
        } else {
            argsList.add(JacksonUtilHolder.toJson(null));
        }
        if (orgName == null || orgName.trim().length() == 0) {
            argsList.add(JacksonUtilHolder.toJson((Object)orgName));
        } else {
            argsList.add(JacksonUtilHolder.toJson(null));
        }
        argsList.add(JacksonUtilHolder.toJson((Object)customerApplyId));
        String interfaceName = "com.yonyoucloud.upc.service.IMerchantApplyRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }

    public static Object orgIsLikeMerchantApplyRange(String orgName, Long customerApplyId) {
        if (orgName == null || orgName.trim().length() == 0) {
            throw new BusinessException("110486", "\u7ec4\u7ec7\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a");
        }
        if (null == customerApplyId) {
            throw new BusinessException("110487", "\u5ba2\u6237\u7533\u8bf7\u5355\u4e3b\u952e\u4e0d\u80fd\u4e3a\u7a7a");
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        paramsTypeList.add(String.class.getName());
        paramsTypeList.add(Long.class.getName());
        String simpleMethodName = "orgIsLikeMerchantApplyRange";
        ArrayList<String> argsList = new ArrayList<String>();
        if (StringUtils.hasText((String)orgName)) {
            argsList.add(JacksonUtilHolder.toJson((Object)orgName));
        } else {
            argsList.add(JacksonUtilHolder.toJson(null));
        }
        argsList.add(JacksonUtilHolder.toJson((Object)customerApplyId));
        String interfaceName = "com.yonyoucloud.upc.service.IMerchantApplyRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }

    public static Object orgIsNotLikeMerchantApplyRange(String orgName, Long customerApplyId) {
        if (orgName == null || orgName.trim().length() == 0) {
            throw new BusinessException("110486", "\u7ec4\u7ec7\u540d\u79f0\u4e0d\u80fd\u4e3a\u7a7a");
        }
        if (null == customerApplyId) {
            throw new BusinessException("110487", "\u5ba2\u6237\u7533\u8bf7\u5355\u4e3b\u952e\u4e0d\u80fd\u4e3a\u7a7a");
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        paramsTypeList.add(String.class.getName());
        paramsTypeList.add(Long.class.getName());
        String simpleMethodName = "orgIsNotLikeMerchantApplyRange";
        ArrayList<String> argsList = new ArrayList<String>();
        if (StringUtils.hasText((String)orgName)) {
            argsList.add(JacksonUtilHolder.toJson((Object)orgName));
        } else {
            argsList.add(JacksonUtilHolder.toJson(null));
        }
        argsList.add(JacksonUtilHolder.toJson((Object)customerApplyId));
        String interfaceName = "com.yonyoucloud.upc.service.IMerchantApplyRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }
}

