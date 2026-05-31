/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import java.io.Serializable;
import nc.vo.pub.CircularlyAccessibleValueObject;

public abstract class ExtendedAggregatedValueObject
implements Serializable {
    public abstract CircularlyAccessibleValueObject getParentVO();

    public abstract String[] getTableCodes();

    public abstract String[] getTableNames();

    public abstract CircularlyAccessibleValueObject[] getTableVO(String var1);

    public abstract void setParentVO(CircularlyAccessibleValueObject var1);

    public abstract void setTableVO(String var1, CircularlyAccessibleValueObject[] var2);
}

