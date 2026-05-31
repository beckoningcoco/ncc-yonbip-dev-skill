/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pubapp.pattern.model.meta.entity.bill;

import java.util.Map;
import nc.vo.pub.IAttributeMeta;
import nc.vo.pub.ISuperVO;
import nc.vo.pub.IVOMeta;

public interface IBillMeta {
    public Map<String, Object> getBusinessAttribute();

    public IAttributeMeta[] getChildForeignKeys();

    public IVOMeta[] getChildren();

    public String getComponentName();

    public IVOMeta getParent();

    public Class<? extends ISuperVO> getVOClass(IVOMeta var1);

    public IVOMeta getVOMeta(Class<? extends ISuperVO> var1);
}

