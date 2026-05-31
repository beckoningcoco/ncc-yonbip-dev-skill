/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDouble
 */
package nc.pubitf.arap.bill;

import java.util.Map;
import nc.vo.arap.basebill.PeriodpaymentParaVO;
import nc.vo.arap.basebill.PeriodpaymentReturnVO;
import nc.vo.arap.basebill.ReCaculateARParaVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDouble;

public interface IArapBillPubServiceForSCM {
    public Map<String, PeriodpaymentReturnVO[]> getMoneyForPeriodpaymentCheck(PeriodpaymentParaVO[] var1) throws BusinessException;

    public Map<String, PeriodpaymentReturnVO[]> getMoneyForPeriodpaymentCheckAll(PeriodpaymentParaVO[] var1) throws BusinessException;

    public int reCaculateAr(String var1, ReCaculateARParaVO var2, String var3) throws BusinessException;

    public UFDouble queryConsignorLocalMoneyBalforGather(String var1, String var2, String var3, String var4, String var5) throws BusinessException;

    public Map<String, UFDouble> queryConsignorMoneyBalforPay(String var1, String var2, String var3, String var4, String var5) throws BusinessException;

    public int reCaculateArByDetail(String var1, ReCaculateARParaVO var2, String var3) throws BusinessException;
}

