/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 */
package nc.pubitf.arap.payable;

import java.util.Map;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

public interface IArapPayableBillPubQueryServiceForSCM {
    public Map<String, UFDouble> queryVerifyMoneyByOrdernos(String var1, String[] var2) throws BusinessException;

    public Map<String, Integer> queryBillsBySourceBillID(String[] var1) throws BusinessException;

    public String[] getPayableHids(String[] var1);

    public String[] getPayableTopId(String[] var1);

    public AggPayableBillVO[] getPayableVOsByInvoiceBids(String[] var1);

    public Map<String, UFDouble> getVerifyMnyByInvoiceBid(String[] var1);

    public Map<String, UFBoolean> hasNextPaybillByPuID(String[] var1);

    public Map<String, Map<String, UFDouble>> getWriteBackMoney() throws BusinessException;
}

