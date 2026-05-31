/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.xml;

import java.lang.reflect.Method;
import nc.vo.pub.util.xml.Util;
import nc.vo.pub.util.xml.XMLProperty;

public class XMLMethodProperpty
implements XMLProperty {
    private Method setMethod = null;
    private Method getMethod = null;
    private static Class[] ca = new Class[0];

    public XMLMethodProperpty(Method setterMethod, Method getterMethod) {
        this.getMethod = getterMethod;
        this.setMethod = setterMethod;
    }

    @Override
    public void fillPrimitiveValue(Object o, String strValue) throws Exception {
        Object[] oa = new Object[]{Util.getObjectValueFromString(this.getMethod.getReturnType(), strValue)};
        this.setMethod.invoke(o, oa);
    }

    @Override
    public void fillValue(Object o, Object oValue) throws Exception {
        Object[] oa = new Object[]{oValue};
        this.setMethod.invoke(o, oa);
    }

    @Override
    public String getName() {
        String name = this.getMethod.getName();
        name = name.substring(3);
        return name;
    }

    @Override
    public Class getType() throws Exception {
        return this.getMethod.getReturnType();
    }

    @Override
    public Object getValue(Object o) throws Exception {
        return this.getMethod.invoke(o, ca);
    }

    @Override
    public boolean isPrimitive() {
        Class<?> c = this.getMethod.getReturnType();
        return Util.isPrimitive(c);
    }
}

