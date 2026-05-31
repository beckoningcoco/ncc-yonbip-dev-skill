/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.initsupreceivable;

import java.util.Map;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.arap.supreceivable.AggSupReceivableBillVO;
import nc.vo.pub.BusinessException;

public interface IArapInitSupRecPubServiceForSCM {
    public void processChargeAgainst4SO(String var1, String var2, String var3, String var4) throws BusinessException;

    public void processChargeAgainst4IC(String var1, String var2, String var3, String var4) throws BusinessException;

    public void processUnChargeAgainst(String var1, String var2) throws BusinessException;

    public AggSupReceivableBillVO[] saveEffectBill(AggReceivableBillVO[] var1) throws BusinessException;

    public void deleteEffectBill(AggSupReceivableBillVO[] var1) throws BusinessException;

    public void deleteEffectBill(Map<String, String> var1) throws BusinessException;
}

