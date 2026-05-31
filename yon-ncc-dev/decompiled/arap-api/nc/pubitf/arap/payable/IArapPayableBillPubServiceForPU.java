/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.pubitf.arap.payable;

import java.util.Map;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public interface IArapPayableBillPubServiceForPU {
    public void deleteBillBySourcePK(String[] var1) throws BusinessException;

    public Map<String, UFDouble> getVerfiyMoney(String var1, String[] var2, String[] var3) throws BusinessException;

    public Map<String, UFDouble> getUnpayedMoney(String var1, String[] var2) throws BusinessException;
}

