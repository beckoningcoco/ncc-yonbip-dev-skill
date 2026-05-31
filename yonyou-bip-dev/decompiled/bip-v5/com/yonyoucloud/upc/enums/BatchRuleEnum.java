/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.yonyou.iuap.ucf.common.i18n.InternationalUtils
 */
package com.yonyoucloud.upc.enums;

import com.yonyou.iuap.ucf.common.i18n.InternationalUtils;
import java.util.HashMap;

public enum BatchRuleEnum {
    Direct_Batch("P_YS_PF_PC-UI_0000160532", "\u76f4\u63a5\u6279\u91cf", 0),
    Fixed_Lot_Size("P_YS_PF_PC-UI_0001147377", "\u56fa\u5b9a\u6279\u91cf", 10),
    Economic_Lot_Size("P_YS_PF_PC-UI_0001147396", "\u7ecf\u6d4e\u6279\u91cf", 5),
    MakeUP_To_MaxStock("P_YS_PF_PROCENTER_1676950000622895116", "\u8865\u81f3\u6700\u9ad8\u5e93\u5b58", 6);

    private static HashMap<Short, BatchRuleEnum> map;
    private String resId;
    private String name;
    private short value;

    private BatchRuleEnum(String resId, String name, short value) {
        this.resId = resId;
        this.name = name;
        this.value = value;
    }

    private static synchronized void initMap() {
        BatchRuleEnum[] items;
        if (map != null) {
            return;
        }
        map = new HashMap();
        for (BatchRuleEnum item : items = BatchRuleEnum.values()) {
            map.put(item.getValue(), item);
        }
    }

    public static BatchRuleEnum find(Number value) {
        if (value == null) {
            return null;
        }
        if (map == null) {
            BatchRuleEnum.initMap();
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

