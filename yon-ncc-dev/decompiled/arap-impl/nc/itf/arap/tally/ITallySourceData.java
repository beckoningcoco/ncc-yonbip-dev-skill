/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.SuperVO
 */
package nc.itf.arap.tally;

import nc.vo.pub.SuperVO;

public interface ITallySourceData {
    public SuperVO getHeadVO();

    public SuperVO[] getChildVOs(String var1);

    public SuperVO[] getChildVOs();

    public void setHeadVO(SuperVO var1);

    public void setChildVOs(String var1, SuperVO[] var2);

    public void setChildVOs(SuperVO[] var1);
}

