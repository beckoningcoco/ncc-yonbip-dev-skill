/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import nc.vo.pub.ValueObject;

public abstract class CircularlyAccessibleValueObject
extends ValueObject {
    private static final long serialVersionUID = -4360103926517671160L;
    private int status = 0;

    public abstract String[] getAttributeNames();

    public abstract Object getAttributeValue(String var1);

    public int getStatus() {
        return this.status;
    }

    public abstract void setAttributeValue(String var1, Object var2);

    public void setStatus(int status) {
        this.status = status;
    }
}

