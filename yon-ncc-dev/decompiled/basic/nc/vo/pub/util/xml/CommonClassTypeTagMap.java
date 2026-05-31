/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.xml;

import java.util.HashMap;
import nc.vo.pub.util.xml.IClassTypeTargMap;

public class CommonClassTypeTagMap
implements IClassTypeTargMap {
    public Class m_DefinClass;
    private HashMap hmFieldToTag = new HashMap();
    private HashMap htTagToField = new HashMap();
    private HashMap htFieldSetAsAttrib = new HashMap();

    public void addFieldSetAsAttrib(String[] fields) {
        for (int i = 0; i < fields.length; ++i) {
            String field = fields[i];
            this.htFieldSetAsAttrib.put(field, field);
        }
    }

    public void addFieldSetAsAttrib(String field) {
        this.htFieldSetAsAttrib.put(field, field);
    }

    @Override
    public Class getDefinClass() {
        return this.m_DefinClass;
    }

    @Override
    public String getFieldToTag(String strSourceField) {
        String strTag = (String)this.hmFieldToTag.get(strSourceField);
        if (strTag == null) {
            strTag = strSourceField;
        }
        return strTag;
    }

    @Override
    public String getTagToField(String tag) {
        String strField = (String)this.htTagToField.get(tag);
        if (strField == null) {
            strField = tag;
        }
        return strField;
    }

    @Override
    public boolean isFieldOutputAsAttribut(String field) {
        return this.htFieldSetAsAttrib.containsKey(field);
    }

    public void setDefinClass(Class newDefinClass) {
        this.m_DefinClass = newDefinClass;
    }

    public void setMapRelation(Object[][] oTypeTagMap) {
        for (int i = 0; i < oTypeTagMap.length; ++i) {
            this.hmFieldToTag.put(oTypeTagMap[i][0], oTypeTagMap[i][1]);
            this.htTagToField.put(oTypeTagMap[i][1], oTypeTagMap[i][0]);
        }
    }
}

