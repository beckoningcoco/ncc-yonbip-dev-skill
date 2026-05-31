/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import java.io.Serializable;
import nc.vo.pub.CircularlyAccessibleValueObject;

public abstract class AggregatedValueObject
implements Serializable {
    public abstract CircularlyAccessibleValueObject[] getChildrenVO();

    public abstract CircularlyAccessibleValueObject getParentVO();

    public abstract void setChildrenVO(CircularlyAccessibleValueObject[] var1);

    public abstract void setParentVO(CircularlyAccessibleValueObject var1);
}

