/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 */
package com.yonyoucloud.upc.enums;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import java.util.HashMap;

public enum InventoryPlanStrategyEnum {
    LFL("P_YS_PF_PC-UI_0001295501", "\u6279\u5bf9\u6279", 0),
    ROP("P_YS_PF_PROCENTER_1676950000622895122", "\u518d\u8ba2\u8d27\u70b9\uff08ROP\uff09", 1);

    private static HashMap<Short, InventoryPlanStrategyEnum> map;
    private String resId;
    private String name;
    private short value;

    private InventoryPlanStrategyEnum(String resId, String name, short value) {
        this.resId = resId;
        this.name = name;
        this.value = value;
    }

    private static synchronized void initMap() {
        InventoryPlanStrategyEnum[] items;
        if (map != null) {
            return;
        }
        map = new HashMap();
        for (InventoryPlanStrategyEnum item : items = InventoryPlanStrategyEnum.values()) {
            map.put(item.getValue(), item);
        }
    }

    public static InventoryPlanStrategyEnum find(Number value) {
        if (value == null) {
            return null;
        }
        if (map == null) {
            InventoryPlanStrategyEnum.initMap();
        }
        return map.get(value.shortValue());
    }

    public String getName() {
        return InternationalUtils.getMessageWithDefault((String)this.resId, (String)this.name);
    }

    public short getValue() {
        return this.value;
    }

    static {
        map = null;
    }
}

