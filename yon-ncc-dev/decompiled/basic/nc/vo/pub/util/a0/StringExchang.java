/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.a0;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import nc.vo.pub.util.a0.PrimitiveTypeExchang;
import nc.vo.pub.util.xml.IPrimitiveTypeExchang;

public class StringExchang
extends PrimitiveTypeExchang
implements IPrimitiveTypeExchang {
    @Override
    public void fillFieldValue(Field f, Object o, String str) throws Exception {
        f.set(o, str);
    }

    @Override
    public Class getDealType() {
        return String.class;
    }

    @Override
    public Object getObjectValueFromString(String str) {
        return str;
    }

    @Override
    public void setArrayPrimitiveValue(Object arrayObject, int location, String str) throws Exception {
        Array.set(arrayObject, location, str);
    }
}

