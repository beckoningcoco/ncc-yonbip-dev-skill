/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.summarize;

import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.trade.summarize.IIdentification;

public class VOIdentification
implements IIdentification {
    @Override
    public String getID(Object obj) throws Exception {
        if (!(obj instanceof CircularlyAccessibleValueObject)) {
            throw new IllegalArgumentException("obj must be subclass of CircularlyAccessibleValueObject");
        }
        CircularlyAccessibleValueObject vo = (CircularlyAccessibleValueObject)obj;
        return vo.getPrimaryKey();
    }
}

