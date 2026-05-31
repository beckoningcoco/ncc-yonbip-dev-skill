/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.logging.Logger
 *  nc.bs.sm.accountmanage.IAllUpdateAccount
 *  nc.vo.pub.BusinessException
 */
package nc.bs.businessevent.update;

import nc.bs.businessevent.EventDispatcher;
import nc.bs.logging.Logger;
import nc.bs.sm.accountmanage.IAllUpdateAccount;
import nc.vo.pub.BusinessException;

public class ClearEventOnAccountUpdateListener
implements IAllUpdateAccount {
    public void doAfterUpdateWhole() throws BusinessException {
        Logger.error((Object)"Log: do clear EventCache on after Account update");
        EventDispatcher.clearCache();
    }
}

