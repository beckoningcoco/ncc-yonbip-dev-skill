/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.pub;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import nc.bs.logging.Logger;
import nc.vo.jcom.lang.StringUtil;

class PropDescriptor {
    private Class<?> beanType;
    private Class<?> propType;
    private String name;
    private String baseName;

    public PropDescriptor(Class<?> beanType, Class<?> propType, String propName) {
        if (beanType == null) {
            throw new IllegalArgumentException("Bean Class can not be null!");
        }
        if (propName == null) {
            throw new IllegalArgumentException("Bean Property name can not be null!");
        }
        this.propType = propType;
        this.beanType = beanType;
        this.name = propName;
        this.baseName = this.name.startsWith("m_") && this.name.length() > 2 ? StringUtil.capitalize(this.name.substring(2)) : StringUtil.capitalize(propName);
    }

    public synchronized Method getReadMethod(Class<?> currBean) {
        Method readMethod;
        String readMethodName = null;
        readMethodName = this.propType == Boolean.TYPE || this.propType == null ? "is" + this.baseName : "get" + this.baseName;
        Class<?> classStart = currBean;
        if (classStart == null) {
            classStart = this.beanType;
        }
        if ((readMethod = this.findMemberMethod(classStart, readMethodName, 0, null)) == null && readMethodName.startsWith("is")) {
            readMethodName = "get" + this.baseName;
            readMethod = this.findMemberMethod(classStart, readMethodName, 0, null);
        }
        if (readMethod != null) {
            int mf = readMethod.getModifiers();
            if (!Modifier.isPublic(mf)) {
                return null;
            }
            Class<?> retType = readMethod.getReturnType();
            if (!this.propType.isAssignableFrom(retType)) {
                Logger.warn((Object)("return type unmatch for get Method and property! : " + classStart.getName() + "." + this.name));
            }
        }
        return readMethod;
    }

    public synchronized Method getWriteMethod(Class<?> currBean) {
        int mf;
        Class[] classArray;
        Class<?> classStart;
        String writeMethodName = null;
        if (this.propType == null) {
            this.propType = this.findPropertyType(this.getReadMethod(currBean), null);
        }
        if (writeMethodName == null) {
            writeMethodName = "set" + this.baseName;
        }
        if ((classStart = currBean) == null) {
            classStart = this.beanType;
        }
        if (this.propType == null) {
            classArray = null;
        } else {
            Class[] classArray2 = new Class[1];
            classArray = classArray2;
            classArray2[0] = this.propType;
        }
        Method writeMethod = this.findMemberMethod(classStart, writeMethodName, 1, classArray);
        if (writeMethod != null && (!Modifier.isPublic(mf = writeMethod.getModifiers()) || Modifier.isStatic(mf))) {
            writeMethod = null;
        }
        return writeMethod;
    }

    private Class<?> findPropertyType(Method readMethod, Method writeMethod) {
        Class<?> propertyType = null;
        if (readMethod != null) {
            propertyType = readMethod.getReturnType();
        }
        if (propertyType == null && writeMethod != null) {
            Class<?>[] params = writeMethod.getParameterTypes();
            propertyType = params[0];
        }
        return propertyType;
    }

    private Method findMemberMethod(Class<?> beanClass, String mName, int num, Class[] args) {
        Method foundM = null;
        Method[] methods = beanClass.getDeclaredMethods();
        if (methods.length < 0) {
            return null;
        }
        for (Method method : methods) {
            Class<?>[] paramTypes;
            if (!method.getName().equalsIgnoreCase(mName) || (paramTypes = method.getParameterTypes()).length != num) continue;
            boolean match = true;
            for (int i = 0; i < num; ++i) {
                if (args[i].isAssignableFrom(paramTypes[i])) continue;
                match = false;
                break;
            }
            if (!match) continue;
            foundM = method;
            break;
        }
        if (foundM == null && beanClass.getSuperclass() != null) {
            foundM = this.findMemberMethod(beanClass.getSuperclass(), mName, num, args);
        }
        return foundM;
    }

    public String getName() {
        return this.name;
    }
}

