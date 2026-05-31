/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.jcom.util;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.List;
import nc.bs.logging.Logger;

public class ClassUtil {
    public static final Class[] EMPTY_CLASS_ARRAY = new Class[0];
    public static final String ARRAY_SUFFIX = "[]";
    private static Class[] PRIMITIVE_CLASSES = new Class[]{Boolean.TYPE, Byte.TYPE, Character.TYPE, Short.TYPE, Integer.TYPE, Long.TYPE, Float.TYPE, Double.TYPE};
    private static final char PACKAGE_SEPARATOR_CHAR = '.';
    private static final char INNER_CLASS_SEPARATOR_CHAR = '$';

    public static ClassLoader getContextClassLoader() {
        return AccessController.doPrivileged(new PrivilegedAction<ClassLoader>(){

            @Override
            public ClassLoader run() {
                return Thread.currentThread().getContextClassLoader();
            }
        });
    }

    public static Class loadClass(final String name) throws ClassNotFoundException {
        if (name.length() <= 8) {
            for (int i = 0; i < PRIMITIVE_CLASSES.length; ++i) {
                Class clazz = PRIMITIVE_CLASSES[i];
                if (!clazz.getName().equals(name)) continue;
                return clazz;
            }
        }
        if (name.endsWith(ARRAY_SUFFIX)) {
            String elementClassName = name.substring(0, name.length() - ARRAY_SUFFIX.length());
            Class elementClass = ClassUtil.loadClass(elementClassName);
            return Array.newInstance(elementClass, 0).getClass();
        }
        Class<?> result = null;
        try {
            result = Class.forName(name);
        }
        catch (ClassNotFoundException elementClass) {
            // empty catch block
        }
        if (result != null) {
            return result;
        }
        Object obj = AccessController.doPrivileged(new PrivilegedAction<Object>(){

            @Override
            public Object run() {
                ClassLoader threadCL = ClassUtil.getContextClassLoader();
                if (threadCL != null) {
                    try {
                        return threadCL.loadClass(name);
                    }
                    catch (ClassNotFoundException ex) {
                        return ex;
                    }
                }
                return null;
            }
        });
        if (obj instanceof Class) {
            return (Class)obj;
        }
        throw (ClassNotFoundException)obj;
    }

    public static Class[] getInterfaces(Class clazz, String[] excludes) {
        List<Class> interfaces = new ArrayList<Class>();
        interfaces = ClassUtil.getAllInterfacesExclude(clazz, excludes, interfaces);
        return interfaces.toArray(new Class[interfaces.size()]);
    }

    public static Class[] getInterfaces(Class clazz) {
        List<Class> interfaces = new ArrayList<Class>();
        interfaces = ClassUtil.getAllInterfacesExclude(clazz, null, interfaces);
        return interfaces.toArray(new Class[interfaces.size()]);
    }

    private static List<Class> getAllInterfacesExclude(Class clazz, String[] itfNames, List<Class> list) {
        if (list == null) {
            list = new ArrayList<Class>();
        }
        if (clazz != null) {
            Class<?>[] interfaces = clazz.getInterfaces();
            for (int i = 0; i < interfaces.length; ++i) {
                boolean needAdded = true;
                if (list.contains(interfaces[i])) continue;
                if (itfNames != null) {
                    for (int j = 0; j < itfNames.length && needAdded; ++j) {
                        if (!interfaces[i].getName().startsWith(itfNames[j])) continue;
                        if (clazz.isInterface()) {
                            list.remove(clazz);
                        }
                        needAdded = false;
                    }
                }
                if (!needAdded) continue;
                list.add(interfaces[i]);
                ClassUtil.getAllInterfacesExclude(interfaces[i], itfNames, list);
            }
            clazz = clazz.getSuperclass();
            ClassUtil.getAllInterfacesExclude(clazz, itfNames, list);
        }
        return list;
    }

    public static boolean isAssignableFrom(Class<?> original, Class<?>[] checkedClasses) {
        if (checkedClasses == null) {
            return false;
        }
        for (int i = 0; i < checkedClasses.length; ++i) {
            if (!original.isAssignableFrom(checkedClasses[i])) continue;
            return true;
        }
        return false;
    }

    public static boolean isAssignable(Class<?> cls, Class<?> toClass) {
        if (toClass == null) {
            return false;
        }
        if (cls == null) {
            return !toClass.isPrimitive();
        }
        if (cls.equals(toClass)) {
            return true;
        }
        if (cls.isPrimitive()) {
            if (!toClass.isPrimitive()) {
                return false;
            }
            if (Integer.TYPE.equals(cls)) {
                return Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass);
            }
            if (Long.TYPE.equals(cls)) {
                return Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass);
            }
            if (Boolean.TYPE.equals(cls)) {
                return false;
            }
            if (Double.TYPE.equals(cls)) {
                return false;
            }
            if (Float.TYPE.equals(cls)) {
                return Double.TYPE.equals(toClass);
            }
            if (Character.TYPE.equals(cls)) {
                return Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass);
            }
            if (Short.TYPE.equals(cls)) {
                return Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass);
            }
            if (Byte.TYPE.equals(cls)) {
                return Short.TYPE.equals(toClass) || Integer.TYPE.equals(toClass) || Long.TYPE.equals(toClass) || Float.TYPE.equals(toClass) || Double.TYPE.equals(toClass);
            }
            return false;
        }
        return toClass.isAssignableFrom(cls);
    }

    public static boolean isAssignable(Class[] classArray, Class[] toClassArray) {
        if (classArray.length != toClassArray.length) {
            return false;
        }
        if (classArray == null) {
            classArray = EMPTY_CLASS_ARRAY;
        }
        if (toClassArray == null) {
            toClassArray = EMPTY_CLASS_ARRAY;
        }
        for (int i = 0; i < classArray.length; ++i) {
            if (ClassUtil.isAssignable(classArray[i], toClassArray[i])) continue;
            return false;
        }
        return true;
    }

    public static Method getMethod(Class clz, String methodName, Class[] expectedTypes) throws NoSuchMethodException {
        Method method;
        block4: {
            method = null;
            try {
                method = clz.getMethod(methodName, expectedTypes);
            }
            catch (NoSuchMethodException e) {
                Method[] methods = clz.getMethods();
                for (int i = 0; i < methods.length; ++i) {
                    Method _method = methods[i];
                    if (!_method.getName().equals(methodName) || !ClassUtil.isAssignable(expectedTypes, _method.getParameterTypes())) continue;
                    if (method == null) {
                        method = _method;
                        continue;
                    }
                    if (!ClassUtil.isAssignable(_method.getParameterTypes(), method.getParameterTypes())) continue;
                    method = _method;
                }
                if (method != null) break block4;
                throw e;
            }
        }
        return method;
    }

    public static Constructor getConstructor(Class clz, Class[] expectedTypes) {
        Constructor<?> constructor = null;
        try {
            Constructor<?>[] constructors = clz.getConstructors();
            for (int i = 0; i < constructors.length; ++i) {
                Constructor<?> creator = constructors[i];
                if (!ClassUtil.isAssignable(expectedTypes, creator.getParameterTypes())) continue;
                if (constructor == null) {
                    constructor = creator;
                    continue;
                }
                if (!ClassUtil.isAssignable(creator.getParameterTypes(), constructor.getParameterTypes())) continue;
                constructor = creator;
            }
        }
        catch (Throwable thr) {
            String msg = "Class: " + clz.getName() + ", " + clz.getProtectionDomain().getCodeSource().getLocation() + ", " + clz.getClassLoader();
            Logger.error((Object)msg, (Throwable)thr);
            throw new RuntimeException(msg, thr);
        }
        return constructor;
    }

    public static String getShortName(Class clazz) {
        return ClassUtil.getShortName(clazz.getName());
    }

    public static String getShortName(String className) {
        char[] charArray = className.toCharArray();
        int lastDot = 0;
        for (int i = 0; i < charArray.length; ++i) {
            if (charArray[i] == '.') {
                lastDot = i + 1;
                continue;
            }
            if (charArray[i] != '$') continue;
            charArray[i] = 46;
        }
        return new String(charArray, lastDot, charArray.length - lastDot);
    }

    public static boolean hasAtLeastOneMethodWithName(Class clazz, String methodName) {
        do {
            for (int i = 0; i < clazz.getDeclaredMethods().length; ++i) {
                Method method = clazz.getDeclaredMethods()[i];
                if (!methodName.equals(method.getName())) continue;
                return true;
            }
        } while ((clazz = clazz.getSuperclass()) != null);
        return false;
    }

    public static Method getStaticMethod(Class clazz, String methodName, Class[] args) {
        try {
            Method method = clazz.getDeclaredMethod(methodName, args);
            if ((method.getModifiers() & 8) != 0) {
                return method;
            }
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        return null;
    }

    public static String classPackageAsResourcePath(Class clazz) {
        if (clazz == null || clazz.getPackage() == null) {
            return "";
        }
        return clazz.getPackage().getName().replace('.', '/');
    }

    public static String addResourcePathToPackagePath(Class clazz, String resourceName) {
        if (!resourceName.startsWith("/")) {
            return ClassUtil.classPackageAsResourcePath(clazz) + "/" + resourceName;
        }
        return ClassUtil.classPackageAsResourcePath(clazz) + resourceName;
    }
}

