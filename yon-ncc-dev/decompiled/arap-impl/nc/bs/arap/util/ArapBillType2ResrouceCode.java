/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.arap.util;

import java.util.HashMap;
import java.util.Map;

public class ArapBillType2ResrouceCode {
    private static Map<String, String> billType2ResrouceCode = new HashMap<String, String>();

    public static String resrouceCode(String billtype) {
        return billType2ResrouceCode.get(billtype);
    }

    static {
        billType2ResrouceCode.put("F0", "ar_recbill");
        billType2ResrouceCode.put("F1", "ap_payablebill");
        billType2ResrouceCode.put("F2", "ar_gatherbill");
        billType2ResrouceCode.put("F3", "ap_paybill");
        billType2ResrouceCode.put("23F0", "ar_suprecbill");
        billType2ResrouceCode.put("23F1", "ap_cuspayablebill");
        billType2ResrouceCode.put("23F2", "ar_supgatherbill");
        billType2ResrouceCode.put("23F3", "ap_cuspaybill");
    }
}

