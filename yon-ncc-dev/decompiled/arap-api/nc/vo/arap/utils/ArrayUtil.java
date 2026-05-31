/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.SuperVO
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;

public class ArrayUtil {
    private ArrayUtil() {
    }

    public static <T> T[] changeListtovos(Collection<?> list, Class<?> cl) {
        if (list == null || list.size() == 0) {
            return (Object[])Array.newInstance(cl, 0);
        }
        return list.toArray((Object[])Array.newInstance(cl, 0));
    }

    public static <T> List<T> makeList() {
        return new ArrayList();
    }

    public static boolean isArrayIsNull(Object ... objs) {
        return objs == null || objs.length == 0 || objs.length == 1 && objs[0] == null;
    }

    public static <T extends SuperVO> T[] union(T[] arr1, T[] arr2) {
        if (ArrayUtil.isEmpty(arr1) && ArrayUtil.isEmpty(arr2)) {
            return null;
        }
        if (ArrayUtil.isEmpty(arr1) || ArrayUtil.isEmpty(arr2)) {
            return ArrayUtil.isEmpty(arr1) ? arr2 : arr1;
        }
        LinkedHashMap<String, T> map = new LinkedHashMap<String, T>();
        for (T arr : arr1) {
            map.put(arr.getPrimaryKey(), arr);
        }
        for (T arr : arr2) {
            if (null != map.get(arr.getPrimaryKey())) continue;
            map.put(arr.getPrimaryKey(), arr);
        }
        return map.values().toArray((SuperVO[])Array.newInstance(ArrayUtil.getAnyNotEmpty(arr1, arr2)[0].getClass(), 0));
    }

    public static <T extends SuperVO> T[] getAnyNotEmpty(T[] arr1, T[] arr2) {
        if (arr1 != null && arr1.length > 0) {
            return arr1;
        }
        if (arr2 != null && arr2.length > 0) {
            return arr2;
        }
        throw new BusinessRuntimeException("arr1 & arr2 is null!");
    }

    public static <T> T[] newEmptyArrayInstance(Class<T> clazz) {
        return (Object[])Array.newInstance(clazz, 0);
    }

    public static <T extends SuperVO> T[] intersect(T[] arr1, T[] arr2) {
        if (ArrayUtil.isEmpty(arr1) || ArrayUtil.isEmpty(arr2)) {
            return null;
        }
        HashMap<String, T> map = new HashMap<String, T>();
        LinkedList<T> list = new LinkedList<T>();
        for (T arr : arr1) {
            if (map.containsKey(arr.getPrimaryKey())) continue;
            map.put(arr.getPrimaryKey(), arr);
        }
        for (T arr : arr2) {
            if (!map.containsKey(arr.getPrimaryKey())) continue;
            list.add(arr);
        }
        return list.toArray((SuperVO[])Array.newInstance(((SuperVO)list.getFirst()).getClass(), 0));
    }

    public static <T extends SuperVO> Map<String, T[]> intersect4UpdAndUnchg(T[] arr1, T[] arr2) {
        if (ArrayUtil.isEmpty(arr1)) {
            throw new IllegalArgumentException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0635"));
        }
        HashMap<String, T> map = new HashMap<String, T>();
        LinkedList<SuperVO> updlist = new LinkedList<SuperVO>();
        LinkedList<SuperVO> unchglist = new LinkedList<SuperVO>();
        Class<?> clazz = arr1[0].getClass();
        String primaryKey = null;
        for (T arr : arr1) {
            String string = primaryKey = arr.getPrimaryKey() == null ? String.valueOf(arr.hashCode()) : arr.getPrimaryKey();
            if (map.containsKey(primaryKey)) continue;
            map.put(primaryKey, arr);
        }
        String[] attrs = ArrayUtil.getAnyNotEmpty(arr1, arr2)[0].getAttributeNames();
        for (T arr : arr2) {
            String key = arr.getPrimaryKey();
            if (!map.containsKey(key)) continue;
            SuperVO t = (SuperVO)map.get(key);
            boolean isSame = false;
            for (String attr : attrs) {
                if ("dr".equals(attr)) continue;
                Object val1 = t.getAttributeValue(attr);
                Object val2 = arr.getAttributeValue(attr);
                boolean is = false;
                is = val1 == null ? ArrayUtil.nvl(val2) : (val2 == null ? ArrayUtil.nvl(val1) : ArrayUtil.real(val1, val2));
                if (is) continue;
                isSame = true;
                break;
            }
            if (isSame) {
                updlist.add(t);
            } else {
                unchglist.add(t);
            }
            map.remove(key);
        }
        HashMap<String, T[]> retmap = new HashMap<String, T[]>();
        retmap.put("update", updlist.toArray((SuperVO[])Array.newInstance(clazz, 0)));
        retmap.put("unchange", unchglist.toArray((SuperVO[])Array.newInstance(clazz, 0)));
        return retmap;
    }

    private static boolean nvl(Object val) {
        if (val == null) {
            return true;
        }
        boolean isnvl = false;
        if (val instanceof UFDouble) {
            isnvl = UFDouble.ZERO_DBL.compareTo((Object)((UFDouble)val)) == 0;
        } else if (val instanceof String) {
            isnvl = ((String)val).trim().equals("");
        }
        return isnvl;
    }

    private static boolean real(Object val, Object val2) {
        if (val == null || val2 == null) {
            return false;
        }
        boolean equals = false;
        equals = val instanceof UFDouble && val2 instanceof UFDouble ? ((UFDouble)val).compareTo((Object)((UFDouble)val2)) == 0 : (val instanceof String && val2 instanceof String ? ((String)val).trim().equals(((String)val2).trim()) : val.equals(val2));
        return equals;
    }

    public static String[] intersect4UnChg(SuperVO[] childrenVO, SuperVO[] orichildrenVO) {
        return null;
    }

    private static <T> boolean isEmpty(T[] arr) {
        return arr == null || arr.length == 0;
    }

    public static <T extends SuperVO> T[] minus(T[] arr1, T[] arr2) {
        String key;
        if (ArrayUtil.isEmpty(arr1) || ArrayUtil.isEmpty(arr2)) {
            return null;
        }
        LinkedHashMap<String, T> map = new LinkedHashMap<String, T>();
        LinkedHashMap<String, T> history = new LinkedHashMap<String, T>();
        T[] longerArr = arr1;
        T[] shorterArr = arr2;
        if (arr1.length > arr2.length) {
            longerArr = arr2;
            shorterArr = arr1;
        }
        for (T arr : longerArr) {
            key = arr.getPrimaryKey();
            if (map.containsKey(key)) continue;
            map.put(key, arr);
        }
        for (T arr : shorterArr) {
            key = arr.getPrimaryKey();
            if (map.containsKey(key)) {
                history.put(key, arr);
                map.remove(key);
                continue;
            }
            if (history.containsKey(key)) continue;
            map.put(key, arr);
        }
        Collection values = map.values();
        if (values.isEmpty()) {
            return (SuperVO[])Array.newInstance(Object.class, 0);
        }
        return values.toArray((SuperVO[])Array.newInstance(((SuperVO)values.iterator().next()).getClass(), 0));
    }

    public static <T extends SuperVO> T[] subtract(T[] arr1, T[] arr2) {
        if (ArrayUtil.isEmpty(arr1)) {
            return null;
        }
        LinkedHashMap<String, T> map = new LinkedHashMap<String, T>();
        String key = null;
        for (T arr : arr1) {
            String string = key = arr.getPrimaryKey() == null ? String.valueOf(arr.hashCode()) : arr.getPrimaryKey();
            if (map.containsKey(key)) continue;
            map.put(key, arr);
        }
        for (T arr : arr2) {
            String string = key = arr.getPrimaryKey() == null ? String.valueOf(arr.hashCode()) : arr.getPrimaryKey();
            if (!map.containsKey(key)) continue;
            map.remove(key);
        }
        Collection values = map.values();
        if (values.isEmpty()) {
            return (SuperVO[])Array.newInstance(arr1[0].getClass(), 0);
        }
        return values.toArray((SuperVO[])Array.newInstance(((SuperVO)values.iterator().next()).getClass(), 0));
    }

    public static <T extends AggregatedValueObject> T[] subtract(T[] arr1, T[] arr2) throws BusinessException {
        if (ArrayUtil.isEmpty(arr1)) {
            return null;
        }
        LinkedHashMap<String, T> map = new LinkedHashMap<String, T>();
        for (T arr : arr1) {
            if (map.containsKey(arr.getParentVO().getPrimaryKey())) continue;
            map.put(arr.getParentVO().getPrimaryKey(), arr);
        }
        for (T arr : arr2) {
            String key = arr.getParentVO().getPrimaryKey();
            if (!map.containsKey(key)) continue;
            map.remove(key);
        }
        Collection values = map.values();
        if (values.isEmpty()) {
            return (AggregatedValueObject[])Array.newInstance(arr1[0].getClass(), 0);
        }
        return values.toArray((AggregatedValueObject[])Array.newInstance(((AggregatedValueObject)values.iterator().next()).getClass(), 0));
    }

    public static <K, T extends K> T[] convertSupers2Subs(K[] bills, Class<T> clazz) {
        if (bills == null || null != bills && bills.length == 0) {
            return (Object[])Array.newInstance(clazz, 0);
        }
        if (bills.getClass().getComponentType().equals(clazz)) {
            return bills;
        }
        Object[] result = (Object[])Array.newInstance(clazz, bills.length);
        System.arraycopy(bills, 0, result, 0, bills.length);
        return result;
    }

    public static <A extends AggregatedValueObject, H extends CircularlyAccessibleValueObject> H[] convertAggVO2HeadVos(A[] bills) {
        ArrayList<CircularlyAccessibleValueObject> list = new ArrayList<CircularlyAccessibleValueObject>(bills.length);
        for (A bill : bills) {
            list.add(bill.getParentVO());
        }
        return (CircularlyAccessibleValueObject[])list.toArray(ArrayUtil.newEmptyArrays(list));
    }

    public static <A extends AggregatedValueObject, H extends CircularlyAccessibleValueObject> List<H> convertAggVO2HeadVos(List<A> bills) {
        ArrayList<CircularlyAccessibleValueObject> list = new ArrayList<CircularlyAccessibleValueObject>(bills.size());
        for (int i = 0; i < bills.size(); ++i) {
            list.add(((AggregatedValueObject)bills.get(i)).getParentVO());
        }
        return list;
    }

    public static <A extends AggregatedValueObject, H extends CircularlyAccessibleValueObject> H[] convertAggVO2BodyVos(A[] bills) {
        LinkedList<CircularlyAccessibleValueObject> list = new LinkedList<CircularlyAccessibleValueObject>();
        for (A bill : bills) {
            list.addAll(Arrays.asList(bill.getChildrenVO()));
        }
        return (CircularlyAccessibleValueObject[])list.toArray(ArrayUtil.newEmptyArrays(list));
    }

    public static <T> T getFirstInArrays(T[] arrays) {
        return null != arrays && arrays.length > 0 ? (T)arrays[0] : null;
    }

    public static <T> T[] newEmptyArrays(List<T> list) {
        if (list.size() == 0) {
            throw new IllegalArgumentException("list is empty");
        }
        Class<?> clazz = list.get(0).getClass();
        return (Object[])Array.newInstance(clazz, 0);
    }

    public static boolean contain4ParentVoPK(AggregatedValueObject[] array, AggregatedValueObject objectToFind) {
        return ArrayUtil.indexOf4ParentVoPK(array, objectToFind) != -1;
    }

    public static int indexOf4ParentVoPK(AggregatedValueObject[] array, AggregatedValueObject objectToFind) {
        return ArrayUtil.indexOf4ParentVoPK(array, objectToFind, 0);
    }

    public static int indexOf4ParentVoPK(AggregatedValueObject[] array, AggregatedValueObject objectToFind, int startIndex) {
        CircularlyAccessibleValueObject[] parentVOs = new CircularlyAccessibleValueObject[array.length];
        for (int index = 0; index < parentVOs.length; ++index) {
            parentVOs[index] = array[index].getParentVO();
        }
        return ArrayUtil.indexOf4ParentVoPK(parentVOs, objectToFind.getParentVO(), startIndex);
    }

    public static int indexOf4ParentVoPK(CircularlyAccessibleValueObject[] array, CircularlyAccessibleValueObject objectToFind) {
        return ArrayUtil.indexOf4ParentVoPK(array, objectToFind, 0);
    }

    public static int indexOf4ParentVoPK(CircularlyAccessibleValueObject[] array, CircularlyAccessibleValueObject objectToFind, int startIndex) {
        if (array == null) {
            return -1;
        }
        if (startIndex < 0) {
            startIndex = 0;
        }
        if (objectToFind == null) {
            for (int i = startIndex; i < array.length; ++i) {
                if (array[i] != null) continue;
                return i;
            }
        } else {
            try {
                for (int i = startIndex; i < array.length; ++i) {
                    if (!objectToFind.getPrimaryKey().equals(array[i].getPrimaryKey())) continue;
                    return i;
                }
            }
            catch (BusinessException e) {
                ExceptionHandler.consume((Throwable)e);
            }
        }
        return -1;
    }
}

