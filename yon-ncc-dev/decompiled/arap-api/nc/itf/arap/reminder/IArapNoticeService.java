/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.ui.querytemplate.querytree.IQueryScheme
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 */
package nc.itf.arap.reminder;

import nc.ui.querytemplate.querytree.IQueryScheme;
import nc.vo.arap.reminder.AggArapNoticeVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pagination.PaginationQueryVO;

public interface IArapNoticeService {
    public PaginationQueryVO queryPaginationQueryVO(String var1, Integer var2) throws BusinessException;

    public AggArapNoticeVO[] findBillByPrimaryKey(String[] var1) throws BusinessException;

    public AggArapNoticeVO[] queryByScheme(IQueryScheme var1) throws BusinessException;
}

