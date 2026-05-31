/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.a0;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import nc.vo.pub.util.a0.PrimitiveTypeExchang;
import nc.vo.pub.util.xml.IPrimitiveTypeExchang;

public class ShortExchang
extends PrimitiveTypeExchang
implements IPrimitiveTypeExchang {
    @Override
    public void fillFieldValue(Field f, Object o, String str) throws Exception {
        f.set(o, Short.valueOf(str));
    }

    @Override
    public Class getDealType() {
        return Short.class;
    }

    @Override
    public Object getObjectValueFromString(String str) {
        if (str != null && str.length() > 0) {
            return new Integer(str);
        }
        return null;
    }

    @Override
    public void setArrayPrimitiveValue(Object arrayObject, int location, String str) throws Exception {
        Array.set(arrayObject, location, Short.valueOf(str));
    }
}

