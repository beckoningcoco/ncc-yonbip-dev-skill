/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.arap.bill.IArapBillQueryBaseService
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 */
package nc.itf.arap.initpayablebill;

import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.vo.arap.payable.AggPayableBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pagination.PaginationQueryVO;

public interface IArapInitPayableQryService<T extends AggPayableBillVO>
extends IArapBillQueryBaseService {
    public PaginationQueryVO queryPaginationQueryVO(String var1, Integer var2) throws BusinessException;
}

