/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.CircularlyAccessibleValueObject
 */
package nc.bs.arap.bill;

import java.sql.SQLException;
import nc.vo.pub.CircularlyAccessibleValueObject;

public interface IRSChecker {
    public boolean isReslut(Object var1) throws SQLException;

    public CircularlyAccessibleValueObject[] getReslut(CircularlyAccessibleValueObject[] var1) throws SQLException;
}

