/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.initbill;

import nc.vo.pub.BusinessException;

public interface IInitBillCloseService {
    public boolean isInitBillClosed(String var1, String var2) throws BusinessException;

    public int isInitBillClosed(String[] var1, String var2) throws BusinessException;

    public void isInitBillClosedBatch(String[] var1, String[] var2) throws BusinessException;
}

