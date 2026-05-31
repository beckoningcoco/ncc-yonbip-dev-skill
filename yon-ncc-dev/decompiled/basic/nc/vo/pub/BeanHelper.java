/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nc.vo.pub.PropDescriptor;

public class BeanHelper {
    protected static final Object[] NULL_ARGUMENTS = new Object[0];
    private static Map<String, ReflectionInfo> cache = new ConcurrentHashMap<String, ReflectionInfo>();
    private static BeanHelper bhelp = new BeanHelper();

    public static BeanHelper getInstance() {
        return bhelp;
    }

    private BeanHelper() {
    }

    public static List<String> getPropertys(Object bean) {
        return Arrays.asList(BeanHelper.getInstance().getPropertiesAry(bean));
    }

    public String[] getPropertiesAry(Object bean) {
        ReflectionInfo reflectionInfo = null;
        reflectionInfo = this.cachedReflectionInfo(bean.getClass());
        HashSet<String> propertys = new HashSet<String>();
        for (String key : reflectionInfo.writeMap.keySet()) {
            if (reflectionInfo.writeMap.get(key) == null) continue;
            propertys.add(key);
        }
        return propertys.toArray(new String[0]);
    }

    public static Object getProperty(Object bean, String propertyName) {
        try {
            Method method = BeanHelper.getInstance().getMethod(bean, propertyName, false);
            if (propertyName != null && method == null) {
                return null;
            }
            if (method == null) {
                return null;
            }
            return method.invoke(bean, NULL_ARGUMENTS);
        }
        catch (Exception e) {
            String errStr = "Failed to get property: " + propertyName;
            throw new RuntimeException(errStr, e);
        }
    }

    public static Object[] getPropertyValues(Object bean, String[] propertys) {
        Object[] result = new Object[propertys.length];
        try {
            Method[] methods = BeanHelper.getInstance().getMethods(bean, propertys, false);
            for (int i = 0; i < propertys.length; ++i) {
                result[i] = propertys[i] == null || methods[i] == null ? null : methods[i].invoke(bean, NULL_ARGUMENTS);
            }
        }
        catch (Exception e) {
            String errStr = "Failed to get getPropertys from " + bean.getClass();
            throw new RuntimeException(errStr, e);
        }
        return result;
    }

    public static Method getMethod(Object bean, String propertyName) {
        return BeanHelper.getInstance().getMethod(bean, propertyName, true);
    }

    public static Method getGetMethod(Object bean, String propertyName) {
        return BeanHelper.getInstance().getMethod(bean, propertyName, false);
    }

    public static Method getSetMethod(Object bean, String propertyName) {
        return BeanHelper.getInstance().getMethod(bean, propertyName, true);
    }

    public static Method[] getMethods(Object bean, String[] propertys) {
        return BeanHelper.getInstance().getMethods(bean, propertys, true);
    }

    private Method[] getMethods(Object bean, String[] propertys, boolean isSetMethod) {
        Method[] methods = new Method[propertys.length];
        ReflectionInfo reflectionInfo = null;
        reflectionInfo = this.cachedReflectionInfo(bean.getClass());
        for (int i = 0; i < propertys.length; ++i) {
            Method method = null;
            method = isSetMethod ? reflectionInfo.getWriteMethod(propertys[i]) : reflectionInfo.getReadMethod(propertys[i]);
            methods[i] = method;
        }
        return methods;
    }

    private Method getMethod(Object bean, String propertyName, boolean isSetMethod) {
        Method method = null;
        ReflectionInfo reflectionInfo = null;
        reflectionInfo = this.cachedReflectionInfo(bean.getClass());
        method = isSetMethod ? reflectionInfo.getWriteMethod(propertyName) : reflectionInfo.getReadMethod(propertyName);
        return method;
    }

    private ReflectionInfo cachedReflectionInfo(Class<?> beanCls) {
        return this.cacheReflectionInfo(beanCls, null);
    }

    private ReflectionInfo cacheReflectionInfo(Class<?> beanCls, List<PropDescriptor> pdescriptor) {
        String key = beanCls.getName();
        ReflectionInfo reflectionInfo = cache.get(key);
        if (reflectionInfo == null && (reflectionInfo = cache.get(key)) == null) {
            reflectionInfo = new ReflectionInfo();
            List<Object> propDesc = new ArrayList<PropDescriptor>();
            if (pdescriptor != null) {
                propDesc.addAll(pdescriptor);
            } else {
                propDesc = this.getPropertyDescriptors(beanCls);
            }
            for (PropDescriptor propDescriptor : propDesc) {
                Method readMethod = propDescriptor.getReadMethod(beanCls);
                Method writeMethod = propDescriptor.getWriteMethod(beanCls);
                if (readMethod != null) {
                    reflectionInfo.readMap.put(propDescriptor.getName().toLowerCase(), readMethod);
                }
                if (writeMethod == null) continue;
                reflectionInfo.writeMap.put(propDescriptor.getName().toLowerCase(), writeMethod);
            }
            cache.put(key, reflectionInfo);
        }
        return reflectionInfo;
    }

    public static void invokeMethod(Object bean, Method method, Object value) {
        try {
            if (method == null) {
                return;
            }
            Object[] arguments = new Object[]{value};
            method.invoke(bean, arguments);
        }
        catch (Exception e) {
            String errStr = "Failed to set property: " + method.getName();
            throw new RuntimeException(errStr, e);
        }
    }

    public static void setProperty(Object bean, String propertyName, Object value) {
        try {
            Method method = BeanHelper.getInstance().getMethod(bean, propertyName, true);
            if (propertyName != null && method == null) {
                return;
            }
            if (method == null) {
                return;
            }
            method.invoke(bean, value);
        }
        catch (IllegalArgumentException e) {
            String errStr = "Failed to set property: " + propertyName + " at bean: " + bean.getClass().getName() + " with value:" + value + " type:" + (value == null ? "null" : value.getClass().getName());
            throw new IllegalArgumentException(errStr, e);
        }
        catch (Exception e) {
            String errStr = "Failed to set property: " + propertyName + " at bean: " + bean.getClass().getName() + " with value:" + value;
            throw new RuntimeException(errStr, e);
        }
    }

    public Method[] getAllGetMethod(Class<?> beanCls, String[] fieldNames) {
        Method[] methods = null;
        ReflectionInfo reflectionInfo = null;
        ArrayList<Method> al = new ArrayList<Method>();
        reflectionInfo = this.cachedReflectionInfo(beanCls);
        for (String str : fieldNames) {
            al.add(reflectionInfo.getReadMethod(str));
        }
        methods = al.toArray(new Method[al.size()]);
        return methods;
    }

    private List<PropDescriptor> getPropertyDescriptors(Class<?> clazz) {
        ArrayList<PropDescriptor> descList = new ArrayList<PropDescriptor>();
        ArrayList<PropDescriptor> superDescList = new ArrayList();
        ArrayList<String> propsList = new ArrayList<String>();
        Class<?> propType = null;
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.getName().length() < 4 || method.getName().charAt(3) < 'A' || method.getName().charAt(3) > 'Z') continue;
            if (method.getName().startsWith("set")) {
                if (method.getParameterTypes().length != 1 || method.getReturnType() != Void.TYPE) continue;
                propType = method.getParameterTypes()[0];
            } else {
                if (!method.getName().startsWith("get") || method.getParameterTypes().length != 0) continue;
                propType = method.getReturnType();
            }
            String propname = method.getName().substring(3, 4).toLowerCase();
            if (method.getName().length() > 4) {
                propname = propname + method.getName().substring(4);
            }
            if (propname.equals("class") || propsList.contains(propname)) continue;
            propsList.add(propname);
            descList.add(new PropDescriptor(clazz, propType, propname));
        }
        Class<?> superClazz = clazz.getSuperclass();
        if (superClazz != null) {
            superDescList = this.getPropertyDescriptors(superClazz);
            descList.addAll(superDescList);
            if (!this.isBeanCached(superClazz)) {
                this.cacheReflectionInfo(superClazz, superDescList);
            }
        }
        return descList;
    }

    private boolean isBeanCached(Class<?> bean) {
        String key = bean.getName();
        ReflectionInfo cMethod = cache.get(key);
        return cMethod != null || (cMethod = cache.get(key)) != null;
    }

    static class ReflectionInfo {
        Map<String, Method> readMap = new HashMap<String, Method>();
        Map<String, Method> writeMap = new HashMap<String, Method>();

        ReflectionInfo() {
        }

        Method getReadMethod(String prop) {
            return prop == null ? null : this.readMap.get(prop.toLowerCase());
        }

        Method getWriteMethod(String prop) {
            return prop == null ? null : this.writeMap.get(prop.toLowerCase());
        }
    }
}

