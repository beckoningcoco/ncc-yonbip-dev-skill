/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pub;

import java.util.Map;
import nc.vo.pub.IAttributeMeta;
import nc.vo.pub.IVOMetaStatisticInfo;

public interface IVOMeta {
    public IAttributeMeta getPrimaryAttribute();

    public IAttributeMeta[] getAttributes();

    public IAttributeMeta getAttribute(String var1);

    public String getLabel();

    public String getEntityName();

    public Map<String, Object> getBusinessAttribute();

    public IVOMetaStatisticInfo getStatisticInfo();
}

