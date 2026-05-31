/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 */
package nc.vo.arap.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import nc.vo.pub.SuperVO;

public class StringUtil {
    public static String NULL = "NULL";

    public static String dealNullString(String value) {
        return value == null ? NULL : value;
    }

    public static String[] union(String[] arg0, String[] arg1) {
        if (StringUtil.isEmptyArry(arg0) || StringUtil.isEmptyArry(arg1)) {
            return StringUtil.isEmptyArry(arg0) ? (StringUtil.isEmptyArry(arg1) ? null : arg1) : arg0;
        }
        HashMap<String, String> map = new HashMap<String, String>();
        for (String t : arg0) {
            map.put(t.toString(), t);
        }
        for (String t : arg1) {
            map.put(t.toString(), t);
        }
        return map.values().toArray(new String[0]);
    }

    public static <T> boolean isEmptyArry(T[] arr) {
        return arr == null || arr.length == 0;
    }

    public static <T extends SuperVO> String[] chgFieldToStringArray(T[] vos, String field) {
        if (StringUtil.isEmptyArry(vos)) {
            return null;
        }
        ArrayList<String> value = new ArrayList<String>();
        for (T vo : vos) {
            if (null == vo.getAttributeValue(field)) continue;
            value.add(vo.getAttributeValue(field).toString());
        }
        return value.toArray(new String[0]);
    }

    public static <T> boolean checkHasCode(T[] arg0, T code) {
        if (null == arg0 || null == code) {
            return false;
        }
        List<T> list = Arrays.asList(arg0);
        return list.contains(code);
    }

    public static boolean isEmptyWithTrim(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static String collectionToDelimitedString(Collection<?> c, String delim, String prefix, String suffix) {
        if (c == null) {
            return "null";
        }
        StringBuffer sb = new StringBuffer();
        Iterator<?> it = c.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (i++ > 0) {
                sb.append(delim);
            }
            sb.append(prefix + it.next() + suffix);
        }
        return sb.toString();
    }

    public static String collectionToDelimitedString(Collection<?> c, String delim) {
        return StringUtil.collectionToDelimitedString(c, delim, "", "");
    }

    public static String arrayToCommaDelimitedString(Object[] arr) {
        return StringUtil.arrayToDelimitedString(arr, ",");
    }

    public static String arrayToDelimitedString(Object[] arr, String delim) {
        if (arr == null) {
            return "null";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; ++i) {
            if (i > 0) {
                sb.append(delim);
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static boolean isEmpty(String str) {
        return str == null || str.length() == 0 || "null".equals(str);
    }

    public static String toString(Object[] arr, String delim) {
        if (arr == null) {
            return "null";
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; ++i) {
            if (i > 0) {
                sb.append(delim);
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static String toString(Object[] arr) {
        return StringUtil.toString(arr, ",");
    }
}

