/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import nc.vo.pub.IColumnMeta;
import nc.vo.pub.IVOMeta;
import nc.vo.pub.JavaType;

public interface IAttributeMeta {
    public IColumnMeta getColumn();

    public boolean isPersistence();

    public boolean isSerializable();

    public boolean isStatic();

    public boolean isCustom();

    public String getName();

    public Object getDefaultValue();

    public Object getMinValue();

    public Object getMaxValue();

    public boolean isNullable();

    public int getModelType();

    public JavaType getJavaType();

    public Class getEnumClass();

    public String getReferenceDoc();

    public IVOMeta getVOMeta();
}

