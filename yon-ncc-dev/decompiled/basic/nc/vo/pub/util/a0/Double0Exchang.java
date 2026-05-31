/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.a0;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import nc.vo.pub.util.a0.PrimitiveTypeExchang;
import nc.vo.pub.util.xml.IPrimitiveTypeExchang;

public class Double0Exchang
extends PrimitiveTypeExchang
implements IPrimitiveTypeExchang {
    @Override
    public void fillFieldValue(Field f, Object o, String str) throws Exception {
        f.setDouble(o, Double.parseDouble(str));
    }

    @Override
    public Class getDealType() {
        return Double.TYPE;
    }

    @Override
    public Object getObjectValueFromString(String str) {
        if (str != null && str.length() > 0) {
            return new Double(str);
        }
        return null;
    }

    @Override
    public void setArrayPrimitiveValue(Object arrayObject, int location, String str) throws Exception {
        Array.setDouble(arrayObject, location, Double.parseDouble(str));
    }
}

