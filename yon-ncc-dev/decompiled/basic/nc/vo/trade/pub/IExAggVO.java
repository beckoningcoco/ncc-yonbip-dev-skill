/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.trade.pub;

import java.util.HashMap;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.SuperVO;

public interface IExAggVO {
    public CircularlyAccessibleValueObject[] getAllChildrenVO();

    public CircularlyAccessibleValueObject[] getChildrenVO();

    public SuperVO[] getChildVOsByParentId(String var1, String var2);

    public String getDefaultTableCode();

    public HashMap getHmEditingVOs() throws Exception;

    public String getParentId(SuperVO var1);

    public CircularlyAccessibleValueObject getParentVO();

    public String[] getTableCodes();

    public String[] getTableNames();

    public CircularlyAccessibleValueObject[] getTableVO(String var1);

    public void setParentId(SuperVO var1, String var2);

    public void setParentVO(CircularlyAccessibleValueObject var1);

    public void setTableVO(String var1, CircularlyAccessibleValueObject[] var2);
}

