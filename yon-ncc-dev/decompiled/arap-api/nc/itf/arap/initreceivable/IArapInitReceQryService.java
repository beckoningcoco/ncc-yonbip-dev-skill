/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.arap.bill.IArapBillQueryBaseService
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 */
package nc.itf.arap.initreceivable;

import nc.itf.arap.bill.IArapBillQueryBaseService;
import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pagination.PaginationQueryVO;

public interface IArapInitReceQryService<T extends AggReceivableBillVO>
extends IArapBillQueryBaseService {
    public BaseAggVO[] findBillByPrimaryKey(String[] var1) throws BusinessException;

    public PaginationQueryVO queryPaginationQueryVO(String var1, Integer var2) throws BusinessException;

    public Object[] queryByQueryScheme(IQueryScheme var1) throws BusinessException;
}

