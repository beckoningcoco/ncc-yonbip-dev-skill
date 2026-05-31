/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.a0;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import nc.vo.pub.util.a0.PrimitiveTypeExchang;
import nc.vo.pub.util.xml.IPrimitiveTypeExchang;

public class BoolExchang
extends PrimitiveTypeExchang
implements IPrimitiveTypeExchang {
    public static final Boolean FALSE_VALUE = new Boolean(false);

    @Override
    public void fillFieldValue(Field f, Object o, String str) throws Exception {
        if (str == null || str.length() == 0) {
            f.setBoolean(o, false);
        } else {
            f.setBoolean(o, Boolean.getBoolean(str));
        }
    }

    @Override
    public Class getDealType() {
        return Boolean.TYPE;
    }

    @Override
    public Object getObjectValueFromString(String str) {
        return new Boolean(str);
    }

    @Override
    public void setArrayPrimitiveValue(Object arrayObject, int location, String str) throws Exception {
        if (str == null || str.length() == 0) {
            Array.setBoolean(arrayObject, location, false);
        } else {
            Array.setBoolean(arrayObject, location, Boolean.getBoolean(str));
        }
    }
}

