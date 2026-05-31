/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub.format;

import nc.vo.pub.format.exception.FormatException;
import nc.vo.pub.lang.UFDouble;

public class NumberObject {
    private UFDouble ufDouble = null;

    public NumberObject(Object orignObj) throws FormatException {
        this.ufDouble = new UFDouble(orignObj.toString());
    }

    public UFDouble getDoubleValue() {
        return this.ufDouble;
    }
}

