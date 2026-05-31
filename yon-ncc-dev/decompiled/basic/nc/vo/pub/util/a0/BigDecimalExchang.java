/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.a0;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import nc.vo.pub.util.a0.PrimitiveTypeExchang;
import nc.vo.pub.util.xml.IPrimitiveTypeExchang;

public class BigDecimalExchang
extends PrimitiveTypeExchang
implements IPrimitiveTypeExchang {
    @Override
    public void fillFieldValue(Field f, Object o, String str) throws Exception {
        f.set(o, new BigDecimal(str));
    }

    @Override
    public Class getDealType() {
        return BigDecimal.class;
    }

    @Override
    public Object getObjectValueFromString(String str) {
        return new BigDecimal(str);
    }

    @Override
    public void setArrayPrimitiveValue(Object arrayObject, int location, String value) throws Exception {
        Array.set(arrayObject, location, new BigDecimal(value));
    }
}

