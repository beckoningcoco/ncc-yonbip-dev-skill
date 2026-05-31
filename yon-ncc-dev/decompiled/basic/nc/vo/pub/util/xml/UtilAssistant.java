/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.util.xml;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class UtilAssistant {
    private Field[] fa = null;

    public Field[] getAllFields(final Class cl) {
        if (cl == Object.class) {
            return null;
        }
        AccessController.doPrivileged(new PrivilegedAction(){

            public Object run() {
                UtilAssistant.access$002(UtilAssistant.this, cl.getDeclaredFields());
                return null;
            }
        });
        Class superClass = cl.getSuperclass();
        Field[] faThis = this.fa;
        Field[] faSuper = this.getAllFields(superClass);
        if (faSuper == null || faSuper.length == 0) {
            return faThis;
        }
        Field[] faAll = new Field[faThis.length + faSuper.length];
        System.arraycopy(faSuper, 0, faAll, 0, faSuper.length);
        System.arraycopy(faThis, 0, faAll, faSuper.length, faThis.length);
        return faAll;
    }

    static /* synthetic */ Field[] access$002(UtilAssistant x0, Field[] x1) {
        x0.fa = x1;
        return x1;
    }
}

