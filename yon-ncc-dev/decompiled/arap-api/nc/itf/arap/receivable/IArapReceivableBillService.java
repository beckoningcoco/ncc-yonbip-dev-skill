/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.arap.bill.IArapBillBaseService
 *  nc.vo.pub.BusinessException
 */
package nc.itf.arap.receivable;

import nc.itf.arap.bill.IArapBillBaseService;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.pub.BusinessException;

public interface IArapReceivableBillService<T extends AggReceivableBillVO>
extends IArapBillBaseService {
    public AggReceivableBillVO doBillWriteBack(AggReceivableBillVO var1, AggReceivableBillVO var2) throws BusinessException;
}

