/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.lang.UFDate
 *  nc.web.arap.bill.pub.IArapBillPubQueryService
 */
package nc.pubitf.arap.payable;

import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.arap.payable.PayableBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pub.lang.UFDate;
import nc.web.arap.bill.pub.IArapBillPubQueryService;

public interface IArapPayableBillPubQueryService
extends IArapBillPubQueryService {
    public AggPayableBillVO[] findBillByPrimaryKey(String[] var1) throws BusinessException;

    public AggPayableBillVO[] queryBillsBySourceRowID(String[] var1, String var2) throws BusinessException;

    public AggPayableBillVO[] queryBillsBySourceBillID(String[] var1) throws BusinessException;

    public PayableBillVO[] findUnConfirmBillsByPeriod(String var1, UFDate var2, UFDate var3) throws BusinessException;

    public AggPayableBillVO insertVO(AggPayableBillVO var1) throws BusinessException;
}

