/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.cuspay.CusPayBillItemVO
 *  nc.vo.pub.BusinessException
 */
package nc.pubitf.arap.cuspayable;

import nc.vo.arap.cuspay.CusPayBillItemVO;
import nc.vo.arap.cuspayable.AggCusPayableBillVO;
import nc.vo.pub.BusinessException;

public interface IArapCusPayableBillPubServiceForPS {
    public AggCusPayableBillVO[] splitBillsByPayterms(AggCusPayableBillVO[] var1) throws BusinessException;

    public CusPayBillItemVO[] splitBillsByPayterms(CusPayBillItemVO[] var1) throws BusinessException;
}

