/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.a0;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.util.a0.PrimitiveTypeExchang;
import nc.vo.pub.util.xml.IPrimitiveTypeExchang;

public class UFBooleanExchang
extends PrimitiveTypeExchang
implements IPrimitiveTypeExchang {
    public static final UFBoolean UF_TRUE = UFBoolean.valueOf("Y");
    public static final UFBoolean UF_FALSE = UFBoolean.valueOf("N");

    @Override
    public void fillFieldValue(Field f, Object o, String str) throws Exception {
        if (str == null || str.length() == 0) {
            f.set(o, null);
        } else if (str.charAt(0) == 'y' || str.charAt(0) == 'Y') {
            f.set(o, UF_TRUE);
        } else {
            f.set(o, UF_FALSE);
        }
    }

    @Override
    public Class getDealType() {
        return UFBoolean.class;
    }

    @Override
    public Object getObjectValueFromString(String str) {
        if (str != null && str.length() > 0) {
            return UFBoolean.valueOf(str);
        }
        return null;
    }

    @Override
    public String getStringValue(Field f, Object o) throws Exception {
        UFBoolean ufb = (UFBoolean)f.get(o);
        if (ufb.booleanValue()) {
            return "Y";
        }
        return "N";
    }

    @Override
    public void setArrayPrimitiveValue(Object arrayObject, int location, String str) throws Exception {
        Array.set(arrayObject, location, UFBoolean.valueOf(str));
    }
}

