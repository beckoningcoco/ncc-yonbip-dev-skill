/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  org.apache.commons.beanutils.PropertyUtils
 */
package nc.vo.arap.goldentax;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import nc.bs.logging.Logger;
import org.apache.commons.beanutils.PropertyUtils;

public class AttributeUtils {
    private static Map<Class<?>, String[]> attrNames = new Hashtable();

    public static String[] getAttributeNames(Class<?> clz) {
        String[] attributeNames = attrNames.get(clz);
        if (null == attributeNames) {
            PropertyDescriptor[] descriptors;
            ArrayList<String> nameList = new ArrayList<String>();
            for (PropertyDescriptor dp : descriptors = PropertyUtils.getPropertyDescriptors(clz)) {
                String name = dp.getName();
                if ("dirty".equals(name) || "primaryKey".equals(name) || "status".equals(name) || null == dp.getWriteMethod() || null == dp.getReadMethod()) continue;
                nameList.add(name);
            }
            attributeNames = nameList.toArray(new String[nameList.size()]);
            attrNames.put(clz, attributeNames);
        }
        return attributeNames;
    }

    public static Object getAttributeValue(Object bean, String attrName) {
        try {
            return PropertyUtils.getProperty((Object)bean, (String)attrName);
        }
        catch (Exception e) {
            Logger.error((Object)("error getAttributeValue : " + attrName + " of " + bean.getClass().getName() + " (" + e.toString() + ")"));
            return null;
        }
    }

    public static <T> T[] getAttributeValues(Object[] beans, String attrName, T[] array) {
        Object[] a = array;
        if (a.length < beans.length) {
            a = (Object[])Array.newInstance(a.getClass().getComponentType(), beans.length);
        }
        for (int i = 0; i < beans.length; ++i) {
            a[i] = AttributeUtils.getAttributeValue(beans[i], attrName);
        }
        return a;
    }

    public static boolean isValueOfAttrOfAllBeansIs(Object[] beans, String attrName, Object value) {
        Logger.error((Object)("vos.length=" + beans.length));
        if (0 == beans.length) {
            return false;
        }
        for (Object bean : beans) {
            Object actual = AttributeUtils.getAttributeValue(bean, attrName);
            if (!(null == value ? null != actual : !value.equals(actual))) continue;
            return false;
        }
        return true;
    }

    public static void setAttributeValue(Object bean, String attrName, Object value) {
        try {
            PropertyUtils.setProperty((Object)bean, (String)attrName, (Object)value);
        }
        catch (Exception e) {
            Logger.error((Object)("error setAttributeValue : " + attrName + " of " + bean.getClass().getName() + " (" + e.toString() + ")"));
        }
    }
}

