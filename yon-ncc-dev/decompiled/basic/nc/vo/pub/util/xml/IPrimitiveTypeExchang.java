/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.xml;

import java.lang.reflect.Field;

public interface IPrimitiveTypeExchang {
    public boolean eqauls(Object var1, Object var2);

    public void fillFieldValue(Field var1, Object var2, String var3) throws Exception;

    public Class getDealType();

    public Object getObjectValueFromString(String var1);

    public String getStringValue(Field var1, Object var2) throws Exception;

    public void setArrayPrimitiveValue(Object var1, int var2, String var3) throws Exception;
}

