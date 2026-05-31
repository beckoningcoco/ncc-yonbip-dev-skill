/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.jcom.util;

import nc.bs.logging.Logger;

public class UniqueIDGenerator {
    public static String generate(String prefix, int len, String idcode, char c) {
        String key = null;
        if (idcode == null) {
            idcode = "";
        }
        if (prefix == null) {
            prefix = "";
        }
        idcode = idcode.trim();
        try {
            if (prefix != null && prefix.length() > len) {
                return null;
            }
            int idlen = len - prefix.length() - idcode.length();
            String s = Long.toHexString(System.currentTimeMillis());
            if (prefix != null && idcode != null && (prefix + idcode).length() > len) {
                return (prefix + s + idcode).substring(0, 20);
            }
            if (s.length() < idlen) {
                int dislen = idlen - s.length();
                for (int i = 0; i < dislen; ++i) {
                    s = s + c;
                }
            } else if (s.length() >= idlen) {
                s = s.substring(s.length() - idlen);
            }
            key = prefix + s + idcode;
        }
        catch (Exception ex) {
            Logger.error((Object)("\u6784\u9020ID\u53f7\u51fa\u9519!" + ex.getMessage()));
        }
        return key;
    }
}

