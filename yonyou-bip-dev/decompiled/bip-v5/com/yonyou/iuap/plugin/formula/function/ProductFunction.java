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

public class ProductFunction {
    public static Object getProductValue(String field, Object productId, Object orgId) throws Exception {
        if (field == null || field.trim().length() == 0) {
            throw new BusinessException("110486", "\u67e5\u8be2\u5b57\u6bb5\u53c2\u4e0d\u80fd\u4e3a\u7a7a", null);
        }
        if (null == productId) {
            throw new BusinessException("110486", "\u7269\u6599\u4e3b\u952e\u4e0d\u80fd\u4e3a\u7a7a", null);
        }
        if (orgId == null) {
            throw new BusinessException("110486", "\u7ec4\u7ec7\u4e0d\u80fd\u4e3a\u7a7a", null);
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        paramsTypeList.add(String.class.getName());
        String simpleMethodName = "getProductValue";
        if (productId instanceof Long) {
            paramsTypeList.add(Long.class.getName());
            if (orgId instanceof Long) {
                paramsTypeList.add(Long.class.getName());
            } else if (orgId instanceof String) {
                paramsTypeList.add(String.class.getName());
            }
        } else if (productId instanceof String) {
            paramsTypeList.add(String.class.getName());
            if (orgId instanceof Long) {
                paramsTypeList.add(Long.class.getName());
            } else if (orgId instanceof String) {
                paramsTypeList.add(String.class.getName());
            }
        } else {
            paramsTypeList.add(List.class.getName());
            paramsTypeList.add(List.class.getName());
            simpleMethodName = "getProductValues";
        }
        ArrayList<String> argsList = new ArrayList<String>();
        argsList.add(JacksonUtilHolder.toJson((Object)field));
        argsList.add(JacksonUtilHolder.toJson((Object)productId));
        argsList.add(JacksonUtilHolder.toJson((Object)orgId));
        String interfaceName = "com.yonyoucloud.upc.service.IProductRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }

    public static Object getSkuValue(String field, Object skuid, Object orgId) throws Exception {
        if (field == null || field.trim().length() == 0) {
            throw new BusinessException("110486", "\u67e5\u8be2\u5b57\u6bb5\u53c2\u4e0d\u80fd\u4e3a\u7a7a", null);
        }
        if (null == skuid) {
            throw new BusinessException("110486", "SKU\u4e3b\u952e\u4e0d\u80fd\u4e3a\u7a7a", null);
        }
        if (orgId == null) {
            throw new BusinessException("110486", "\u7ec4\u7ec7\u4e0d\u80fd\u4e3a\u7a7a", null);
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        paramsTypeList.add(String.class.getName());
        String simpleMethodName = "getProductSKUValue";
        if (skuid instanceof Long) {
            paramsTypeList.add(Long.class.getName());
            if (orgId instanceof Long) {
                paramsTypeList.add(Long.class.getName());
            } else if (orgId instanceof String) {
                paramsTypeList.add(String.class.getName());
            }
        } else if (skuid instanceof String) {
            paramsTypeList.add(String.class.getName());
            if (orgId instanceof Long) {
                paramsTypeList.add(Long.class.getName());
            } else if (orgId instanceof String) {
                paramsTypeList.add(String.class.getName());
            }
        } else {
            paramsTypeList.add(List.class.getName());
            paramsTypeList.add(List.class.getName());
            simpleMethodName = "getProductSKUValues";
        }
        ArrayList<String> argsList = new ArrayList<String>();
        argsList.add(JacksonUtilHolder.toJson((Object)field));
        argsList.add(JacksonUtilHolder.toJson((Object)skuid));
        argsList.add(JacksonUtilHolder.toJson((Object)orgId));
        String interfaceName = "com.yonyoucloud.upc.service.IProductRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }

    public static Object getProductFreeCharactorValue(Object productId) throws Exception {
        if (null == productId) {
            throw new BusinessException("110486", "\u7269\u6599\u4e3b\u952e\u4e0d\u80fd\u4e3a\u7a7a", null);
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        String simpleMethodName = "getProductFreeCharactorValue";
        if (productId instanceof Long) {
            paramsTypeList.add(Long.class.getName());
        } else {
            paramsTypeList.add(List.class.getName());
            simpleMethodName = "getProductsFreeCharactorValue";
        }
        ArrayList<String> argsList = new ArrayList<String>();
        argsList.add(JacksonUtilHolder.toJson((Object)productId));
        String interfaceName = "com.yonyoucloud.upc.service.IProductRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }

    public static Object getMaterialHomeImage(Object productId) throws Exception {
        if (null == productId) {
            throw new BusinessException("110486", "\u7269\u6599\u4e3b\u952e\u4e0d\u80fd\u4e3a\u7a7a", null);
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        String simpleMethodName = "getMaterialHomeImage";
        if (productId instanceof Long) {
            paramsTypeList.add(Long.class.getName());
        } else {
            paramsTypeList.add(List.class.getName());
            simpleMethodName = "getMaterialsHomeImage";
        }
        ArrayList<String> argsList = new ArrayList<String>();
        argsList.add(JacksonUtilHolder.toJson((Object)productId));
        String interfaceName = "com.yonyoucloud.upc.service.IProductRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }

    public static Object getMaterialAlbum(Object productId) throws Exception {
        if (null == productId) {
            throw new BusinessException("110486", "\u7269\u6599\u4e3b\u952e\u4e0d\u80fd\u4e3a\u7a7a", null);
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        String simpleMethodName = "getMaterialAlbum";
        if (productId instanceof Long) {
            paramsTypeList.add(Long.class.getName());
        } else {
            paramsTypeList.add(List.class.getName());
            simpleMethodName = "getMaterialsAlbum";
        }
        ArrayList<String> argsList = new ArrayList<String>();
        argsList.add(JacksonUtilHolder.toJson((Object)productId));
        String interfaceName = "com.yonyoucloud.upc.service.IProductRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }

    public static Object getSkuAlbum(Object skuId) throws Exception {
        if (null == skuId) {
            throw new BusinessException("110486", "\u7269\u6599\u4e3b\u952e\u4e0d\u80fd\u4e3a\u7a7a", null);
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        String simpleMethodName = "getSkuAlbum";
        if (skuId instanceof Long) {
            paramsTypeList.add(Long.class.getName());
        } else {
            paramsTypeList.add(List.class.getName());
            simpleMethodName = "getSkusAlbum";
        }
        ArrayList<String> argsList = new ArrayList<String>();
        argsList.add(JacksonUtilHolder.toJson((Object)skuId));
        String interfaceName = "com.yonyoucloud.upc.service.IProductRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }

    public static Object getAlbumByBusinessId(Object businessId) throws Exception {
        if (null == businessId) {
            throw new BusinessException("110486", "\u4e1a\u52a1ID\u4e0d\u80fd\u4e3a\u7a7a", null);
        }
        ArrayList<String> paramsTypeList = new ArrayList<String>();
        String simpleMethodName = "getAlbumByBusinessId";
        if (businessId instanceof String) {
            paramsTypeList.add(String.class.getName());
        } else {
            paramsTypeList.add(List.class.getName());
            simpleMethodName = "getAlbumByBusinessId";
        }
        ArrayList<String> argsList = new ArrayList<String>();
        argsList.add(JacksonUtilHolder.toJson((Object)businessId));
        String interfaceName = "com.yonyoucloud.upc.service.IProductRpcService";
        return IrisDynUtils.irisExcute(interfaceName, simpleMethodName, paramsTypeList, argsList);
    }
}

