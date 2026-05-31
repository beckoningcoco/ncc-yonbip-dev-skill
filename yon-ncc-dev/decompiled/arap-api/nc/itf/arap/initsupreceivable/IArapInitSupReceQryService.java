/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.arap.bill.IArapBillQueryBaseService
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 */
package nc.itf.arap.initsupreceivable;

import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.supreceivable.AggSupReceivableBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pagination.PaginationQueryVO;

public interface IArapInitSupReceQryService<T extends AggSupReceivableBillVO>
extends IArapBillQueryBaseService {
    public PaginationQueryVO queryPaginationQueryVO(String var1, Integer var2) throws BusinessException;

    public AggSupReceivableBillVO[] queryViewVOsByScheme(IQueryScheme var1) throws BusinessException;
}

