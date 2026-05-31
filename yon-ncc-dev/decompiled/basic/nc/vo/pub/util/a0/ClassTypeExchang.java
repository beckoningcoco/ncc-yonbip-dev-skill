/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.a0;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import nc.vo.pub.util.a0.PrimitiveTypeExchang;

public class ClassTypeExchang
extends PrimitiveTypeExchang {
    @Override
    public void fillFieldValue(Field f, Object o, String str) throws Exception {
        f.set(o, this.getObjectValueFromString(str));
    }

    @Override
    public Class getDealType() {
        return Class.class;
    }

    @Override
    public Object getObjectValueFromString(String value) {
        try {
            return Class.forName(value);
        }
        catch (ClassNotFoundException cnfe) {
            return null;
        }
    }

    @Override
    public String getStringValue(Field f, Object o) throws Exception {
        return ((Class)f.get(o)).getName();
    }

    @Override
    public void setArrayPrimitiveValue(Object arrayObject, int location, String value) throws Exception {
        Array.set(arrayObject, location, this.getObjectValueFromString(value));
    }
}

