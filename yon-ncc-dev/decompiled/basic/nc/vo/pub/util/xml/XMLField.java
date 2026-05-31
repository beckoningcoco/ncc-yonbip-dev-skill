/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.xml;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;
import nc.vo.pub.util.xml.Util;
import nc.vo.pub.util.xml.XMLProperty;

public class XMLField
implements XMLProperty {
    private Field field;
    private Object nCurrentObject = null;

    public XMLField(Field f) {
        this.field = f;
    }

    @Override
    public void fillPrimitiveValue(Object o, String strValue) throws Exception {
        Util.fillValue(this.field, o, strValue);
    }

    @Override
    public void fillValue(final Object o, final Object oValue) throws Exception {
        AccessController.doPrivileged(new PrivilegedAction(){

            public Object run() {
                try {
                    XMLField.this.field.set(o, oValue);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                return null;
            }
        });
    }

    @Override
    public String getName() {
        String name = this.field.getName();
        return name;
    }

    @Override
    public Class getType() throws Exception {
        return this.field.getType();
    }

    @Override
    public synchronized Object getValue(final Object o) throws Exception {
        AccessController.doPrivileged(new PrivilegedAction(){

            public Object run() {
                try {
                    XMLField.this.nCurrentObject = XMLField.this.field.get(o);
                }
                catch (Exception exception) {
                    // empty catch block
                }
                return null;
            }
        });
        return this.nCurrentObject;
    }

    @Override
    public boolean isPrimitive() {
        return Util.isPrimitive(this.field.getType());
    }

    public void setField(Field f) {
        this.field = f;
    }
}

