/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.initcuspayable;

import java.util.Map;
import nc.vo.arap.cuspayable.AggCusPayableBillVO;
import nc.vo.pub.BusinessException;

public interface IArapInitCusPayablePubServiceForSCM {
    public void processChargeAgainst4SO(String var1, String var2, String var3, String var4) throws BusinessException;

    public void processChargeAgainst4IC(String var1, String var2, String var3, String var4) throws BusinessException;

    public void processUnChargeAgainst(String var1, String var2) throws BusinessException;

    public AggCusPayableBillVO[] saveEffectBill(AggCusPayableBillVO[] var1) throws BusinessException;

    public void deleteEffectBill(AggCusPayableBillVO[] var1) throws BusinessException;

    public void deleteEffectBill(Map<String, String> var1) throws BusinessException;
}

