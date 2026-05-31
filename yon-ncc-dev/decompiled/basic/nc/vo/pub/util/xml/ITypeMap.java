/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.xml;

import nc.vo.pub.util.xml.IClassTypeTargMap;

public interface ITypeMap {
    public Class getClassType(String var1);

    public String getType(Class var1);

    public IClassTypeTargMap getTypeTargMap(Class var1);

    public boolean hasClassMap(Class var1);
}

