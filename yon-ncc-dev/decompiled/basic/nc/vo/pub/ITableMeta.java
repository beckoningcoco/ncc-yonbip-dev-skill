/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import nc.vo.pub.IColumnMeta;

public interface ITableMeta {
    public String getName();

    public String getLabel();

    public IColumnMeta[] getColumns();

    public IColumnMeta getPrimaryKey();

    public IColumnMeta getColumn(String var1);

    public ITableMeta[] getChildren();

    public IColumnMeta getChildForeignKey(ITableMeta var1);

    public IColumnMeta getAssociateColumn(ITableMeta var1);
}

