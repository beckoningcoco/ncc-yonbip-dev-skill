/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.a0;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.util.a0.PrimitiveTypeExchang;
import nc.vo.pub.util.xml.IPrimitiveTypeExchang;

public class UFDoubleExchang
extends PrimitiveTypeExchang
implements IPrimitiveTypeExchang {
    @Override
    public void fillFieldValue(Field f, Object o, String str) throws Exception {
        f.set(o, new UFDouble(str));
    }

    @Override
    public Class getDealType() {
        return UFDouble.class;
    }

    @Override
    public Object getObjectValueFromString(String str) {
        if (str != null && str.length() > 0) {
            return new UFDouble(str);
        }
        return null;
    }

    @Override
    public void setArrayPrimitiveValue(Object arrayObject, int location, String str) throws Exception {
        Array.set(arrayObject, location, new UFDouble(str));
    }

    @Override
    public boolean eqauls(Object o1, Object o2) {
        UFDouble ufd1 = (UFDouble)o1;
        UFDouble ufd2 = (UFDouble)o2;
        return ufd1.getDouble() == ufd2.getDouble();
    }
}

