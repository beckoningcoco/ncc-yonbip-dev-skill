/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NoProtect
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.tally;

import nc.bs.framework.common.NoProtect;
import nc.vo.arap.tally.BalanceRebuildVO;
import nc.vo.pub.BusinessException;

public interface IBalanceRebuild {
    public boolean rebuild(BalanceRebuildVO var1) throws BusinessException;

    @NoProtect
    public void asynchBalance(String var1, String var2) throws BusinessException;
}

