/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.arap.bill.IArapBillBaseService
 *  nc.vo.cmp.apply.ApplyVO
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.payable;

import nc.itf.arap.bill.IArapBillBaseService;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.cmp.apply.ApplyVO;
import nc.vo.pub.BusinessException;

public interface IArapPayableBillService<T extends AggPayableBillVO>
extends IArapBillBaseService {
    public void canPSApplyEnable(ApplyVO var1) throws BusinessException;
}

