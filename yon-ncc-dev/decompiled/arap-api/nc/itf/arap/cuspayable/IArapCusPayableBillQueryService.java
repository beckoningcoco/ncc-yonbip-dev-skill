/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.arap.bill.IArapBillQueryBaseService
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 */
package nc.itf.arap.cuspayable;

import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pagination.PaginationQueryVO;

public interface IArapCusPayableBillQueryService<AggCusPayableBillVO>
extends IArapBillQueryBaseService {
    public PaginationQueryVO queryPaginationQueryVO(String var1, Integer var2) throws BusinessException;

    public AggCusPayableBillVO[] queryVOsByWhere(String var1) throws BusinessException;

    public Object[] queryByQueryScheme(IQueryScheme var1) throws BusinessException;

    public AggCusPayableBillVO[] queryViewVOsByScheme(IQueryScheme var1) throws BusinessException;
}

