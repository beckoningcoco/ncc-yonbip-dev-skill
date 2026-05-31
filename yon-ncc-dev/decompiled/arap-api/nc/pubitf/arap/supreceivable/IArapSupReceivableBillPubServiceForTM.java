/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.supreceivable;

import java.util.Map;
import nc.vo.pub.BusinessException;

public interface IArapSupReceivableBillPubServiceForTM {
    public Map<String, Integer> queryBalanceBySupplier(String[] var1) throws BusinessException;
}

