/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 */
package nc.vo.pub.util.xml;

import java.util.HashMap;
import nc.bs.logging.Logger;
import nc.vo.pub.util.xml.IClassTypeTargMap;
import nc.vo.pub.util.xml.ITypeMap;

public class CommonTypeMap
implements ITypeMap {
    private HashMap hmClassToType = new HashMap();
    private HashMap hmTypeToClass = new HashMap();
    private HashMap hmIClassTypeTargMap = new HashMap();

    public void appendIClassTypeTargMap(IClassTypeTargMap ctm) {
        this.hmIClassTypeTargMap.put(ctm.getDefinClass(), ctm);
    }

    @Override
    public Class getClassType(String typeName) {
        if (typeName == null) {
            return null;
        }
        if (typeName.length() == 0) {
            return null;
        }
        Class<?> c = (Class<?>)this.hmTypeToClass.get(typeName);
        try {
            if (c == null) {
                c = Class.forName(typeName);
            }
        }
        catch (ClassNotFoundException e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
        }
        return c;
    }

    @Override
    public String getType(Class classType) {
        String type = (String)this.hmClassToType.get(classType);
        if (type == null) {
            type = classType.getName();
        }
        return type;
    }

    @Override
    public IClassTypeTargMap getTypeTargMap(Class c) {
        return (IClassTypeTargMap)this.hmIClassTypeTargMap.get(c);
    }

    @Override
    public boolean hasClassMap(Class c) {
        return this.hmClassToType.containsKey(c);
    }

    public void setMapRelation(Object[][] oTypeMap) {
        for (int i = 0; i < oTypeMap.length; ++i) {
            this.hmClassToType.put(oTypeMap[i][0], oTypeMap[i][1]);
            this.hmTypeToClass.put(oTypeMap[i][1], oTypeMap[i][0]);
        }
    }
}

