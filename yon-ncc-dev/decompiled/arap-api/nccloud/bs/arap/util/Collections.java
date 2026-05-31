/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.poi.ss.formula.functions.T
 */
package nccloud.bs.arap.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import org.apache.poi.ss.formula.functions.T;

public final class Collections {
    private Collections() {
    }

    public static <T> boolean isEmpty(Collection<T> collection) {
        return collection == null || collection.isEmpty();
    }

    public static <T> boolean isNotEmpty(Collection<T> collection) {
        return !Collections.isEmpty(collection);
    }

    public static <T> int size(Collection<T> collection) {
        return collection == null ? 0 : collection.size();
    }

    public static <K, V> boolean isEmpty(Map<K, V> map) {
        return map == null || map.isEmpty();
    }

    public static <K, V> boolean isNotEmpty(Map<K, V> map) {
        return !Collections.isEmpty(map);
    }

    public static <K, V> int size(Map<K, V> map) {
        return map == null ? 0 : map.size();
    }

    public static <T> boolean containsInstance(Collection<T> collection, Object element) {
        if (collection != null) {
            for (T candidate : collection) {
                if (candidate != element) continue;
                return true;
            }
        }
        return false;
    }

    public static <T> boolean containsAny(Collection<T> source, Collection<T> candidates) {
        if (!Collections.isEmpty(source) && !Collections.isEmpty(candidates)) {
            T candidate;
            Iterator<T> iterator = candidates.iterator();
            do {
                if (iterator.hasNext()) continue;
                return false;
            } while (!source.contains(candidate = iterator.next()));
            return true;
        }
        return false;
    }

    public static Object findFirstMatch(Collection<T> source, Collection<T> candidates) {
        if (!Collections.isEmpty(source) && !Collections.isEmpty(candidates)) {
            T candidate;
            Iterator<T> iterator = candidates.iterator();
            do {
                if (iterator.hasNext()) continue;
                return null;
            } while (!source.contains(candidate = iterator.next()));
            return candidate;
        }
        return null;
    }
}

