/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.bs.businessevent;

import nc.bs.businessevent.IBusinessEvent;
import nc.vo.pub.BusinessException;

public interface IBusinessListener {
    public void doAction(IBusinessEvent var1) throws BusinessException;
}
