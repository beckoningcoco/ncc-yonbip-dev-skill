/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.voutils;

import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;
import nc.vo.pub.lang.UFDateTime;
import nc.vo.pub.lang.UFDouble;

public class Class2UFDataType {
    private Class2UFDataType() {
    }

    public static int convert(Class c) {
        if (c == Integer.class) {
            return 0;
        }
        if (c == String.class) {
            return 1;
        }
        if (c == UFDouble.class) {
            return 4;
        }
        if (c == UFBoolean.class) {
            return 5;
        }
        if (c == UFDate.class) {
            return 2;
        }
        if (c == UFDateTime.class) {
            return 3;
        }
        if (c == Boolean.class) {
            return 12;
        }
        return 1;
    }
}

