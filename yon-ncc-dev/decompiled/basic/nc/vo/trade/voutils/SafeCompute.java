/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.voutils;

import nc.vo.pub.lang.UFDouble;

public class SafeCompute {
    public static UFDouble add(UFDouble d1, UFDouble d2) {
        d1 = d1 == null ? new UFDouble(0) : d1;
        d2 = d2 == null ? new UFDouble(0) : d2;
        return d1.add(d2);
    }

    public static UFDouble div(UFDouble d1, UFDouble d2) {
        d1 = d1 == null ? new UFDouble(0) : d1;
        d2 = d2 == null ? new UFDouble(0) : d2;
        return d1.div(d2);
    }

    public static UFDouble multiply(UFDouble d1, UFDouble d2) {
        d1 = d1 == null ? new UFDouble(0) : d1;
        d2 = d2 == null ? new UFDouble(0) : d2;
        return d1.multiply(d2);
    }

    public static UFDouble sub(UFDouble d1, UFDouble d2) {
        d1 = d1 == null ? new UFDouble(0) : d1;
        d2 = d2 == null ? new UFDouble(0) : d2;
        return d1.sub(d2);
    }
}

