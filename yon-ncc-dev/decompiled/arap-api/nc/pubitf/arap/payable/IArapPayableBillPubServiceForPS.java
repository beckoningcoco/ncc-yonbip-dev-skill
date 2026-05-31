/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.vo.arap.pay.PayBillItemVO
 *  nc.vo.arap.termitem.TermVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 */
package nc.pubitf.arap.payable;

import java.util.Map;
import java.util.Set;
import nc.bs.uif2.validation.ValidationFailure;
import nc.vo.arap.pay.PayBillItemVO;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.termitem.TermVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

public interface IArapPayableBillPubServiceForPS {
    public AggPayableBillVO[] splitBillsByPayterms(AggPayableBillVO var1) throws BusinessException;

    public PayBillItemVO[] splitBillsByPayterms(PayBillItemVO var1) throws BusinessException;

    public String[] getPeriodDiscount(TermVO var1) throws BusinessException;

    public UFDouble getWriteBackBills() throws BusinessException;

    public AggPayableBillVO[] queryBillByChildPks(String[] var1) throws BusinessException;

    public Map<String, UFBoolean> hasAppvFlowFinished(String[] var1) throws BusinessException;

    public ValidationFailure checkNextBillFromContract(String[] var1);

    public Map<String, Map<String, Set<String>>> getPayableItemPK();
}

