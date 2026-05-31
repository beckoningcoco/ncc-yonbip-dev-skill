/*
 * Decompiled with CFR 0.152.
 */
package nc.vo.pubapp.pattern.model.entity.bill;

import nc.vo.pub.ISuperVO;
import nc.vo.pub.IVOMeta;
import nc.vo.pubapp.pattern.model.meta.entity.bill.IBillMeta;

public interface IBill {
    public Object clone();

    public ISuperVO[] getChildren(Class<? extends ISuperVO> var1);

    public ISuperVO[] getChildren(IVOMeta var1);

    public IBillMeta getMetaData();

    public ISuperVO getParent();

    public String getPrimaryKey();

    public void setChildren(Class<? extends ISuperVO> var1, ISuperVO[] var2);

    public void setChildren(IVOMeta var1, ISuperVO[] var2);

    public void setParent(ISuperVO var1);
}

