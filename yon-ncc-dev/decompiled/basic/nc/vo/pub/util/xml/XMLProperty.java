/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.xml;

public interface XMLProperty {
    public void fillPrimitiveValue(Object var1, String var2) throws Exception;

    public void fillValue(Object var1, Object var2) throws Exception;

    public String getName();

    public Class getType() throws Exception;

    public Object getValue(Object var1) throws Exception;

    public boolean isPrimitive();
}

