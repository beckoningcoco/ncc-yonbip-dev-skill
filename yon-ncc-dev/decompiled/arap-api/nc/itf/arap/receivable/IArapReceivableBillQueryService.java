/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.arap.bill.IArapBillQueryBaseService
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 */
package nc.itf.arap.receivable;

import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pagination.PaginationQueryVO;

public interface IArapReceivableBillQueryService
extends IArapBillQueryBaseService {
    public AggReceivableBillVO[] findBillByPrimaryKey(String[] var1) throws BusinessException;

    public PaginationQueryVO queryPaginationQueryVO(String var1, Integer var2) throws BusinessException;

    public AggReceivableBillVO[] queryVOsByWhere(String var1) throws BusinessException;

    public Object[] queryByQueryScheme(IQueryScheme var1) throws BusinessException;

    public AggReceivableBillVO[] queryViewVOsByScheme(IQueryScheme var1) throws BusinessException;
}

