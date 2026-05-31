/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.global;

import java.lang.reflect.Array;
import java.util.Collection;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public class ArapCommonTool {
    public static final UFDouble ZERO = new UFDouble("0");
    public static String fb_temp_pk = "ARAP_FB_OID_";

    public static boolean isZero(UFDouble u) {
        if (null == u) {
            return false;
        }
        return u.compareTo((Object)ZERO) == 0;
    }

    public static boolean isLargeZero(UFDouble u) {
        if (null == u) {
            return false;
        }
        return u.compareTo((Object)ZERO) > 0;
    }

    public static boolean isLessZero(UFDouble u) {
        if (null == u) {
            return false;
        }
        return u.compareTo((Object)ZERO) < 0;
    }

    public static boolean isNotZero(UFDouble u) {
        return ArapCommonTool.isNotEqual(u, ArapCommonTool.getZero());
    }

    public static boolean isLarge(UFDouble u, UFDouble t) {
        if (null == u || null == t) {
            return false;
        }
        return u.compareTo((Object)t) > 0;
    }

    public static boolean isLargeEqual(UFDouble u, UFDouble t) {
        if (null == u || null == t) {
            return false;
        }
        return u.compareTo((Object)t) >= 0;
    }

    public static boolean isLess(UFDouble u, UFDouble t) {
        if (null == u || null == t) {
            return false;
        }
        return u.compareTo((Object)t) < 0;
    }

    public static boolean isLessEqual(UFDouble u, UFDouble t) {
        if (null == u || null == t) {
            return false;
        }
        return u.compareTo((Object)t) <= 0;
    }

    public static boolean isEqual(UFDouble u, UFDouble t) {
        if (null == u || null == t) {
            return false;
        }
        return u.compareTo((Object)t) == 0;
    }

    public static boolean isNotEqual(UFDouble u, UFDouble t) {
        if (null == u || null == t) {
            return false;
        }
        return u.compareTo((Object)t) != 0;
    }

    public static UFDouble getZero() {
        return new UFDouble("0");
    }

    public static Object changeCollection2Array(Collection cl, Class sClass) {
        if (cl.isEmpty()) {
            return null;
        }
        Object[] o = (Object[])Array.newInstance(sClass, cl.size());
        o = cl.toArray(o);
        return o;
    }

    public static UFDouble getLogicZero(String pk_currency) throws BusinessException {
        return ArapCommonTool.getZero();
    }
}

