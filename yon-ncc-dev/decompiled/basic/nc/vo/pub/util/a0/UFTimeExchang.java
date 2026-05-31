/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.a0;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import nc.vo.pub.lang.UFTime;
import nc.vo.pub.util.a0.PrimitiveTypeExchang;
import nc.vo.pub.util.xml.IPrimitiveTypeExchang;

public class UFTimeExchang
extends PrimitiveTypeExchang
implements IPrimitiveTypeExchang {
    @Override
    public void fillFieldValue(Field f, Object o, String str) throws Exception {
        f.set(o, new UFTime(str));
    }

    @Override
    public Class getDealType() {
        return UFTime.class;
    }

    @Override
    public Object getObjectValueFromString(String str) {
        if (str != null && str.length() > 0) {
            return new UFTime(str);
        }
        return null;
    }

    @Override
    public void setArrayPrimitiveValue(Object arrayObject, int location, String str) throws Exception {
        Array.set(arrayObject, location, new UFTime(str));
    }

    @Override
    public boolean eqauls(Object o1, Object o2) {
        UFTime utf1 = (UFTime)o1;
        UFTime utf2 = (UFTime)o2;
        return utf1.equals(utf2);
    }
}

