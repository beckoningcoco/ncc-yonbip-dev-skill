/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import nc.vo.pub.ITableMeta;

public interface IColumnMeta {
    public String getLabel();

    public String getName();

    public boolean isNullable();

    public ITableMeta getTable();

    public int getLength();

    public int getPrecision();

    public int getSqlType();
}

