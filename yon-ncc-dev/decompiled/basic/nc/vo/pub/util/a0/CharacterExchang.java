/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.a0;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import nc.vo.pub.util.a0.PrimitiveTypeExchang;
import nc.vo.pub.util.xml.IPrimitiveTypeExchang;

public class CharacterExchang
extends PrimitiveTypeExchang
implements IPrimitiveTypeExchang {
    @Override
    public void fillFieldValue(Field f, Object o, String str) throws Exception {
        if (str == null || str.length() == 0) {
            f.set(o, Character.valueOf(' '));
        } else {
            f.set(o, Character.valueOf(str.charAt(0)));
        }
    }

    @Override
    public Class getDealType() {
        return Character.class;
    }

    @Override
    public Object getObjectValueFromString(String str) {
        if (str != null && str.length() > 0) {
            return Character.valueOf(str.charAt(0));
        }
        return null;
    }

    @Override
    public void setArrayPrimitiveValue(Object arrayObject, int location, String str) throws Exception {
        if (str == null || str.length() == 0) {
            Array.set(arrayObject, location, Character.valueOf(' '));
        } else {
            Array.set(arrayObject, location, Character.valueOf(str.charAt(0)));
        }
    }
}

