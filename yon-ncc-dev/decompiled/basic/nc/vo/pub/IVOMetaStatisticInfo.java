/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import nc.vo.pub.IAttributeMeta;
import nc.vo.pub.IColumnMeta;
import nc.vo.pub.ITableMeta;
import nc.vo.pub.IVOMeta;

public interface IVOMetaStatisticInfo {
    public IAttributeMeta[] getPerisistentAttributes();

    public IAttributeMeta getPersistentAttribute(short var1);

    public short getPeristentAttributeIndex(String var1);

    public IAttributeMeta getAttribute(IColumnMeta var1);

    public ITableMeta[] getTables();

    public IAttributeMeta[] getSerializableAttributes();

    public IAttributeMeta getSerializableAttribute(short var1);

    public short getSerializableAttributeIndex(String var1);

    public IVOMeta getVOMeta();

    public IAttributeMeta[] getStaticAttributes();

    public IAttributeMeta[] getReferenceAttributes();
}

