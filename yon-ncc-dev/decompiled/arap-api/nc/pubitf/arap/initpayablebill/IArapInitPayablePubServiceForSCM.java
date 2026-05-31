/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.initpayablebill;

import java.util.Map;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.pub.BusinessException;

public interface IArapInitPayablePubServiceForSCM {
    public void processChargeAgainst4SO(String var1, String var2, String var3, String var4) throws BusinessException;

    public void processChargeAgainst4IC(String var1, String var2, String var3, String var4) throws BusinessException;

    public void processUnChargeAgainst(String var1, String var2) throws BusinessException;

    public AggPayableBillVO[] saveEffectBill(AggPayableBillVO[] var1) throws BusinessException;

    public void deleteEffectBill(AggPayableBillVO[] var1) throws BusinessException;

    public void deleteEffectBill(Map<String, String> var1) throws BusinessException;
}

