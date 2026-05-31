/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.pubitf.arap.receivable;

import java.util.List;
import java.util.Map;
import nc.vo.arap.receivable.UnSettReceivalbeBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public interface IArapReceivableBillPubServiceForPS {
    public Map<String, List<UnSettReceivalbeBillVO>> queryDetailsBySupplier(String var1, String[] var2) throws BusinessException;

    public Map<String, UFDouble> queryBalanceBySupplier(String var1, String[] var2) throws BusinessException;
}

