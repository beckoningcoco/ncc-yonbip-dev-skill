/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.arap.djlx;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import nc.vo.arap.billstatus.ARAPBillStatus;
import nc.vo.arap.pub.BillEnumCollection;

public class ArBillStatusMap {
    public static Map<Integer, Integer[]> MAPPING_MAP;
    public static final Integer SAVE;
    public static final Integer AUDIT;
    public static final Integer EFFECT;

    static {
        SAVE = 0;
        AUDIT = 1;
        EFFECT = 2;
        MAPPING_MAP = new HashMap<Integer, Integer[]>();
        MAPPING_MAP.put(SAVE, new Integer[]{ARAPBillStatus.SAVE.VALUE, ARAPBillStatus.SIGN.VALUE, ARAPBillStatus.AUDIT.VALUE});
        MAPPING_MAP.put(AUDIT, new Integer[]{ARAPBillStatus.AUDIT.VALUE, ARAPBillStatus.SIGN.VALUE});
        MAPPING_MAP.put(EFFECT, new Integer[]{BillEnumCollection.InureSign.OKINURE.VALUE});
        Collections.unmodifiableMap(MAPPING_MAP);
    }
}

