/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.util;

import java.util.Collection;
import java.util.Map;
import nc.vo.pub.BusinessException;

public final class CheckException {
    private CheckException() {
    }

    public static void checkArgument(boolean expression, Object msg) throws BusinessException {
        if (expression) {
            throw new BusinessException(String.valueOf(msg));
        }
    }

    public static <T> T checkNotNull(T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }

    public static <T> boolean checkArraysIsNull(T[] arrays) {
        return CheckException.isArraysNull(arrays);
    }

    public static <T> void checkArraysIsNull(T[] arrays, Object msg) throws BusinessException {
        if (CheckException.isArraysNull(arrays)) {
            throw new BusinessException(String.valueOf(msg));
        }
    }

    private static <T> boolean isArraysNull(T[] arrays) {
        if (arrays == null) {
            return true;
        }
        return arrays.length == 0;
    }

    public static <K, V> boolean checkMapIsNull(Map<K, V> map) {
        if (map == null) {
            return true;
        }
        return map.size() == 0;
    }

    public static <T> T checkNotNull(T reference, Object errorMessage) throws BusinessException {
        if (reference == null) {
            throw new BusinessException(String.valueOf(errorMessage));
        }
        return reference;
    }

    public static <T extends Iterable<?>> boolean checkContionsIsNull(T iterable) {
        return CheckException.isContionsIsNull(iterable);
    }

    public static <T extends Iterable<?>> void checkContionsIsNull(T iterable, Object msg) throws BusinessException {
        if (CheckException.isContionsIsNull(iterable)) {
            throw new BusinessException(String.valueOf(msg));
        }
    }

    private static boolean isContionsIsNull(Iterable<?> iterable) {
        Collection c;
        if (iterable == null) {
            return true;
        }
        return iterable instanceof Collection && (c = (Collection)iterable).size() == 0;
    }
}

