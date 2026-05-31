/*
 * Decompiled with CFR 0.152.
 */
package nc.bs.pub.pa;

import nc.bs.pub.pa.PreAlertObject;
import nc.bs.pub.pa.PreAlertReturnType;

public class NullPreAlertObject
extends PreAlertObject {
    @Override
    public PreAlertReturnType getReturnType() {
        return PreAlertReturnType.RETURNNOTHING;
    }
}

