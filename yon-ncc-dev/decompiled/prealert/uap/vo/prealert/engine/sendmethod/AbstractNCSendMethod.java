/*
 * Decompiled with CFR 0.152.
 */
package uap.vo.prealert.engine.sendmethod;

import uap.vo.prealert.engine.PrimitiveSendMethods;
import uap.vo.prealert.engine.SendMethod;

public abstract class AbstractNCSendMethod
implements SendMethod,
PrimitiveSendMethods {
    public int hashCode() {
        return this.getId();
    }

    public boolean equals(Object obj) {
        return obj instanceof AbstractNCSendMethod && this.getId() == ((AbstractNCSendMethod)obj).getId();
    }

    public String toString() {
        return this.getName();
    }
}

