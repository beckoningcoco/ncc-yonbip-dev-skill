/*
 * Decompiled with CFR 0.152.
 */
package com.yonyoucloud.iuap.upc.constants;

import java.util.HashMap;
import java.util.HashSet;

public class MaterialLifeCycFieldMap {
    public static final String API_PACKAGE = "com.yonyoucloud.iuap.upc.vo";
    public static final String MATERIAL_STATUS_API_VO = "com.yonyoucloud.iuap.upc.vo.MaterialStatusApiVO";
    public static final String MATERIAL_STATUS_DETAIL_VO = "com.yonyoucloud.iuap.upc.vo.MaterialStatusDetailVO";
    public static final String MATERIAL_STATUS_DETAIL_ACTION_VO = "com.yonyoucloud.iuap.upc.vo.MaterialStatusDetailActionVO";
    public static final String LIFECYCLE_TEMPLATE_API_VO = "com.yonyoucloud.iuap.upc.vo.LifeCycleTemplateApiVO";
    public static final String LIFECYCLE_DETAIL_VO = "com.yonyoucloud.iuap.upc.vo.LifeCycleDetailVO";
    public static final String MULTILINGUAL_VO = "com.yonyoucloud.iuap.upc.vo.MultilingualVO";
    public static HashSet<String> materialFieldType = new HashSet(32);
    public static HashMap<String, String> materialRenameMap = new HashMap(256);

    static {
        materialFieldType.add(MATERIAL_STATUS_DETAIL_VO);
        materialFieldType.add(MATERIAL_STATUS_DETAIL_ACTION_VO);
        materialFieldType.add(MULTILINGUAL_VO);
        materialFieldType.add(LIFECYCLE_TEMPLATE_API_VO);
        materialFieldType.add(LIFECYCLE_DETAIL_VO);
        materialRenameMap.put("com.yonyoucloud.iuap.upc.vo.MaterialStatusApiVO.entityStatus", "_status");
        materialRenameMap.put("com.yonyoucloud.iuap.upc.vo.MaterialStatusDetailVO.entityStatus", "_status");
        materialRenameMap.put("com.yonyoucloud.iuap.upc.vo.MaterialStatusDetailActionVO.entityStatus", "_status");
        materialRenameMap.put("com.yonyoucloud.iuap.upc.vo.LifeCycleTemplateApiVO.entityStatus", "_status");
        materialRenameMap.put("com.yonyoucloud.iuap.upc.vo.LifeCycleDetailVO.entityStatus", "_status");
    }
}

