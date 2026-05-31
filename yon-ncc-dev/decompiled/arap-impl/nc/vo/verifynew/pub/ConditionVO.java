/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.ValidationException
 *  nc.vo.pub.lang.UFDate
 */
package nc.vo.verifynew.pub;

import java.util.HashMap;
import java.util.Map;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.ValidationException;
import nc.vo.pub.lang.UFDate;

public class ConditionVO
extends CircularlyAccessibleValueObject {
    private static final long serialVersionUID = 1L;
    private Map attributes = new HashMap();

    public String[] getAttributeNames() {
        return this.attributes.keySet().toArray(new String[0]);
    }

    public Object getAttributeValue(String arg0) {
        return this.attributes.get(arg0);
    }

    public void setAttributeValue(String arg0, Object arg1) {
        this.attributes.put(arg0, arg1);
    }

    public String getEntityName() {
        return null;
    }

    public void validate() throws ValidationException {
    }

    public void restrictEndDate(UFDate date) {
        UFDate date2;
        ConditionVO jfvo = (ConditionVO)((Object)this.getAttributeValue("jfvo"));
        ConditionVO dfvo = (ConditionVO)((Object)this.getAttributeValue("dfvo"));
        date = date.asEnd();
        if (jfvo.getAttributeValue("djrq_end") == null) {
            jfvo.setAttributeValue("djrq_end", date.toString());
            dfvo.setAttributeValue("djrq_end", date.toString());
        }
        if (jfvo.getAttributeValue("djrq_end") != null && date.before(date2 = new UFDate(jfvo.getAttributeValue("djrq_end").toString()))) {
            jfvo.setAttributeValue("djrq_end", date.toString());
            dfvo.setAttributeValue("djrq_end", date.toString());
        }
    }

    public void restrictBeginDate(UFDate date) {
        UFDate date2;
        ConditionVO jfvo = (ConditionVO)((Object)this.getAttributeValue("jfvo"));
        ConditionVO dfvo = (ConditionVO)((Object)this.getAttributeValue("dfvo"));
        date = date.asBegin();
        if (jfvo.getAttributeValue("djrq_begin") == null) {
            jfvo.setAttributeValue("djrq_begin", date.toString());
            dfvo.setAttributeValue("djrq_begin", date.toString());
        }
        if (jfvo.getAttributeValue("djrq_begin") != null && date.before(date2 = new UFDate(jfvo.getAttributeValue("djrq_begin").toString()))) {
            jfvo.setAttributeValue("djrq_begin", date.toString());
            dfvo.setAttributeValue("djrq_begin", date.toString());
        }
    }
}

