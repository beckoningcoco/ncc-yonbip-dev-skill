/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 *  nc.vo.pub.query.ConditionVO
 *  nc.vo.so.report.multipleprofit.MultProfitSourceSystem
 *  nc.vo.so.report.multipleprofit.MultipleProfitViewVO
 */
package nc.pubitf.arap.receivable;

import java.util.Hashtable;
import java.util.Map;
import nc.vo.arap.itfvo.ReceivableBillInfoVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;
import nc.vo.pub.query.ConditionVO;
import nc.vo.so.report.multipleprofit.MultProfitSourceSystem;
import nc.vo.so.report.multipleprofit.MultipleProfitViewVO;

public interface IArapReceivableBillPubServiceForSCM {
    public Hashtable getArBillNum(String var1) throws BusinessException;

    public String queryAccountAgeAnalyzeInfo(String var1, String var2, String var3, String var4, String var5, String var6, int var7, int var8) throws BusinessException;

    public UFDouble[] getBalanceByCreditTerms(String var1, String var2, String var3, int var4, int var5) throws BusinessException;

    public void deleteBillsByDetailIDs(String[] var1) throws BusinessException;

    public void deleteBodyVOs(String[] var1, String[] var2) throws BusinessException;

    public Map<String, AggReceivableBillVO> queryReceivableBillBySource(String[] var1) throws BusinessException;

    public Map<String, Integer> queryReceivableBillStatusBySource(String[] var1) throws BusinessException;

    public Map<String, Boolean> verifySaleInvoice(String[] var1) throws BusinessException;

    public Map<String, UFDouble> getNotaxForSoorder(String[] var1) throws BusinessException;

    public Map<String, ReceivableBillInfoVO> queryReceivableBillInfoByTopBill(String var1, String[] var2) throws BusinessException;

    public Map<String, ReceivableBillInfoVO> queryReceivableBillInfoByTopBill(String var1, String[] var2, String[] var3) throws BusinessException;

    public Map<String, ReceivableBillInfoVO> queryReceivableBillInfoBySrcBill(String[] var1) throws BusinessException;

    public Map<String, ReceivableBillInfoVO> queryReceivableBillInfoBySrcBill(String[] var1, String[] var2) throws BusinessException;

    public Map<String, ReceivableBillInfoVO> queryReceivableBillInfoBySrcBillExcludeTusun(String[] var1, String[] var2) throws BusinessException;

    public MultipleProfitViewVO[] queryMultProfit(ConditionVO[] var1, MultProfitSourceSystem var2, String[] var3) throws BusinessException;
}

