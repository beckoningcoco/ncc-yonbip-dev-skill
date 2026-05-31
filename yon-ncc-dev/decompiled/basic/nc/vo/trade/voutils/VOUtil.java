/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.voutils;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BeanHelper;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;
import nc.vo.pub.lang.UFDouble;
import nc.vo.trade.voutils.Class2UFDataType;
import nc.vo.trade.voutils.IFilter;

public class VOUtil {
    public static final int ASC = 1;
    public static final int DESC = -1;

    private VOUtil() {
    }

    public static void ascSort(CircularlyAccessibleValueObject[] vos, String[] fields) {
        if (vos == null) {
            return;
        }
        if (fields == null || fields.length == 0) {
            return;
        }
        int[] ascFlags = new int[fields.length];
        Arrays.fill(ascFlags, 1);
        VOUtil.sort(vos, fields, ascFlags);
    }

    public static void descSort(CircularlyAccessibleValueObject[] vos, String[] fields) {
        if (vos == null) {
            return;
        }
        if (fields == null || fields.length == 0) {
            return;
        }
        int[] ascFlags = new int[fields.length];
        Arrays.fill(ascFlags, -1);
        VOUtil.sort(vos, fields, ascFlags);
    }

    public static AggregatedValueObject duplicateBillVO(AggregatedValueObject billVO) throws Exception {
        if (billVO == null) {
            return null;
        }
        AggregatedValueObject result = (AggregatedValueObject)billVO.getClass().newInstance();
        CircularlyAccessibleValueObject sourceHead = billVO.getParentVO();
        CircularlyAccessibleValueObject headVO = null;
        if (sourceHead != null) {
            headVO = (CircularlyAccessibleValueObject)sourceHead.clone();
        }
        CircularlyAccessibleValueObject[] sourceBodyVOs = billVO.getChildrenVO();
        CircularlyAccessibleValueObject[] bodyVOs = null;
        if (sourceBodyVOs != null && sourceBodyVOs.length != 0) {
            bodyVOs = (CircularlyAccessibleValueObject[])Array.newInstance(sourceBodyVOs[0].getClass(), sourceBodyVOs.length);
            for (int i = 0; i < bodyVOs.length; ++i) {
                bodyVOs[i] = (CircularlyAccessibleValueObject)sourceBodyVOs[i].clone();
            }
        }
        result.setParentVO(headVO);
        result.setChildrenVO(bodyVOs);
        return result;
    }

    public static Object[] filter(Object[] os, IFilter iFilter) {
        ArrayList al = VOUtil.filter(Arrays.asList(os), iFilter);
        if (al.size() == 0) {
            return null;
        }
        return al.toArray((Object[])Array.newInstance(al.get(0).getClass(), 0));
    }

    public static ArrayList filter(List list, IFilter iFilter) {
        if (list == null || list.size() == 0) {
            return new ArrayList();
        }
        if (iFilter == null) {
            throw new IllegalArgumentException("iFilter cann't be null");
        }
        ArrayList al = new ArrayList();
        for (Object o : list) {
            if (!iFilter.accept(o)) continue;
            al.add(o);
        }
        return al;
    }

    public static String getCombinesKey(CircularlyAccessibleValueObject vo, String[] groupFields) {
        if (vo == null) {
            throw new IllegalArgumentException("AggVOSummarize.getCombinesKey vo cann't be null");
        }
        if (groupFields == null || groupFields.length == 0) {
            throw new IllegalArgumentException("AggVOSummarize.getCombinesKey groupFields cann't be null or empty");
        }
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < groupFields.length; ++i) {
            result.append("" + vo.getAttributeValue(groupFields[i]));
        }
        return result.toString();
    }

    public static int[] getSuperVOFieldDataTypes(Class voClass, String[] fieldNames) {
        Method[] methods = BeanHelper.getInstance().getAllGetMethod(voClass, fieldNames);
        int[] result = new int[fieldNames.length];
        for (int i = 0; i < fieldNames.length; ++i) {
            Method m = methods[i];
            result[i] = m != null ? Class2UFDataType.convert(m.getReturnType()) : 1;
        }
        return result;
    }

    public static CircularlyAccessibleValueObject max(CircularlyAccessibleValueObject[] vos, String fieldname) {
        if (vos == null || vos.length == 0) {
            return null;
        }
        int maxindex = 0;
        for (int i = 1; i < vos.length; ++i) {
            Object o = vos[i].getAttributeValue(fieldname);
            if (o == null) continue;
            String c = o.toString();
            if (vos[maxindex].getAttributeValue(fieldname) == null) {
                maxindex = i;
                continue;
            }
            Double dc = new Double(c);
            String s = "" + vos[maxindex].getAttributeValue(fieldname);
            Double ds = new Double(s);
            if (dc.compareTo(ds) <= 0) continue;
            maxindex = i;
        }
        return vos[maxindex];
    }

    public static void sort(CircularlyAccessibleValueObject[] vos, final String[] fields, final int[] ascFlags, final boolean nullLast) {
        if (vos == null) {
            return;
        }
        if (fields == null || fields.length == 0) {
            return;
        }
        if (ascFlags == null) {
            throw new IllegalArgumentException("VOUtil.sort ascFlags cann't be null");
        }
        if (fields.length != ascFlags.length) {
            throw new IllegalArgumentException("VOUtil.sort length of fields not equal with that of ascFlags");
        }
        for (int i = 0; i < ascFlags.length; ++i) {
            if (ascFlags[i] == 1 || ascFlags[i] == -1) continue;
            throw new IllegalArgumentException("VOUtil.sort Illegal Value of ascFlag i=" + i + " value= " + ascFlags[i]);
        }
        Comparator c = new Comparator(){

            public int compare(Object o1, Object o2) {
                CircularlyAccessibleValueObject vo1 = (CircularlyAccessibleValueObject)o1;
                CircularlyAccessibleValueObject vo2 = (CircularlyAccessibleValueObject)o2;
                int Greater = 1;
                int Less = -1;
                int Equal = 0;
                for (int i = 0; i < fields.length; ++i) {
                    Object v1 = vo1.getAttributeValue(fields[i]);
                    Object v2 = vo2.getAttributeValue(fields[i]);
                    if (v1 == null && v2 == null) continue;
                    if (v1 == null && v2 != null) {
                        if (ascFlags[i] == 1 && nullLast) {
                            return ascFlags[i] * Greater;
                        }
                        return ascFlags[i] * Less;
                    }
                    if (v1 != null && v2 == null) {
                        if (ascFlags[i] == 1 && nullLast) {
                            return ascFlags[i] * Less;
                        }
                        return ascFlags[i] * Greater;
                    }
                    Object c1 = null;
                    Object c2 = null;
                    if (v1 instanceof Comparable && v2 instanceof Comparable) {
                        c1 = (Comparable)v1;
                        c2 = (Comparable)v2;
                    } else {
                        if (v1 instanceof UFDouble && v2 instanceof UFDouble) {
                            UFDouble u1 = (UFDouble)v1;
                            UFDouble u2 = (UFDouble)v2;
                            if (u1.compareTo(u2) == 0) continue;
                            return u1.compareTo(u2) * ascFlags[i];
                        }
                        c1 = "" + v1;
                        c2 = "" + v2;
                    }
                    if (c1.compareTo(c2) == 0) continue;
                    return c1.compareTo(c2) * ascFlags[i];
                }
                return Equal;
            }
        };
        Arrays.sort(vos, c);
    }

    public static void sort(CircularlyAccessibleValueObject[] vos, String[] fields, int[] ascFlags) {
        VOUtil.sort(vos, fields, ascFlags, false);
    }

    public static List extractFieldValues(CircularlyAccessibleValueObject[] vos, String filedName, IFilter filter) {
        ArrayList<Object> l = new ArrayList<Object>();
        for (int i = 0; i < vos.length; ++i) {
            CircularlyAccessibleValueObject vo = vos[i];
            if (filter != null && !filter.accept(vo)) continue;
            l.add(vo.getAttributeValue(filedName));
        }
        return l;
    }

    public static List getSuperVOFieldNames(SuperVO prototype, IFilter filter) {
        String[] allFields = prototype.getAttributeNames();
        int[] types = VOUtil.getSuperVOFieldDataTypes(prototype.getClass(), allFields);
        ArrayList<String> l = new ArrayList<String>();
        for (int i = 0; i < types.length; ++i) {
            if (filter != null && !filter.accept(types[i])) continue;
            l.add(allFields[i]);
        }
        return l;
    }
}

