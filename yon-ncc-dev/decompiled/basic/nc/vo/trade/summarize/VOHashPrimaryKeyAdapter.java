/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.summarize;

import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.trade.summarize.IHashKey;

public class VOHashPrimaryKeyAdapter
implements IHashKey {
    @Override
    public String getKey(Object o) {
        if (!(o instanceof CircularlyAccessibleValueObject)) {
            throw new IllegalArgumentException("Object must be subclass of CircularlyAccessibleValueObject");
        }
        try {
            return ((CircularlyAccessibleValueObject)o).getPrimaryKey();
        }
        catch (BusinessException e) {
            throw new IllegalArgumentException("Get PrimaryKey Error");
        }
    }
}

