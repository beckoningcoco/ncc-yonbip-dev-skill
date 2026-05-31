/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.CircularlyAccessibleValueObject
 */
package nc.vo.arap.util;

import nc.vo.pub.CircularlyAccessibleValueObject;

public class SqlUtils_Pub {
    public static String getInStr(String fieldName, String[] pks) {
        if (fieldName == null) {
            fieldName = "";
        }
        if (pks == null || pks.length == 0) {
            return fieldName + " in ('') ";
        }
        int tmpTableMinCount = 200;
        if (pks.length < tmpTableMinCount) {
            String inStr = SqlUtils_Pub.getInStr(fieldName, pks, 0, tmpTableMinCount);
            return inStr;
        }
        String m_str = " ( ";
        int end = tmpTableMinCount;
        int i = 0;
        while (i < pks.length) {
            String inStr = SqlUtils_Pub.getInStr(fieldName, pks, i, end);
            if (i != 0) {
                m_str = m_str + " or ";
            }
            m_str = m_str + inStr;
            i += tmpTableMinCount;
            end += tmpTableMinCount;
        }
        m_str = m_str + " )";
        return m_str;
    }

    private static String getInStr(String fieldName, String[] pks, int start, int end) {
        StringBuffer sb = new StringBuffer();
        sb.append(fieldName + " in (");
        for (int i = 0; i < pks.length; ++i) {
            if (i < start) continue;
            if (i >= end) break;
            String key = pks[i].trim();
            sb.append("'");
            sb.append(key);
            sb.append("'");
            sb.append(",");
        }
        String inStr = sb.substring(0, sb.length() - 1) + ") ";
        return inStr;
    }

    public static String getInStr(String fieldName, CircularlyAccessibleValueObject[] vos, String voFieldName) {
        String[] pks = new String[vos.length];
        for (int i = 0; i < vos.length; ++i) {
            pks[i] = vos[i].getAttributeValue(voFieldName).toString().trim();
        }
        return SqlUtils_Pub.getInStr(fieldName, pks);
    }
}

