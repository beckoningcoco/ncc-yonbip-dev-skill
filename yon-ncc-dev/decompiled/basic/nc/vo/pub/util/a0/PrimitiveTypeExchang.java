/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.a0;

import java.lang.reflect.Field;
import nc.vo.pub.util.xml.IPrimitiveTypeExchang;

public abstract class PrimitiveTypeExchang
implements IPrimitiveTypeExchang {
    @Override
    public String getStringValue(Field f, Object o) throws Exception {
        return f.get(o) + "";
    }

    @Override
    public boolean eqauls(Object o1, Object o2) {
        return o1.equals(o2);
    }
}

