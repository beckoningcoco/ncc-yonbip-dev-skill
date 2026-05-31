/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import java.util.Set;
import nc.vo.pub.IVOMeta;

public interface ISuperVO {
    public Object getAttributeValue(String var1);

    public void setAttributeValue(String var1, Object var2);

    public String getPrimaryKey();

    public IVOMeta getMetaData();

    public Set<String> usedAttributeNames();

    public int getStatus();

    public void setStatus(int var1);

    public Object clone();
}

