/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.impl.pubapp.pattern.data.vo.VOQuery
 *  nc.itf.arap.initreceivable.IArapInitReceQryService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.arap.receivable.ReceivableBillVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 *  nccloud.pubimpl.arap.arappub.QueryInitBillServiceImpl
 *  nccloud.pubitf.arap.arappub.IQueryInitBillService
 *  nccloud.pubitf.arap.receivablebill.IQueryInitRecbillService
 */
package nccloud.pubimpl.arap.receivablebill;

import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.pattern.data.vo.VOQuery;
import nc.itf.arap.initreceivable.IArapInitReceQryService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.receivable.ReceivableBillVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pagination.PaginationQueryVO;
import nccloud.pubimpl.arap.arappub.QueryInitBillServiceImpl;
import nccloud.pubitf.arap.arappub.IQueryInitBillService;
import nccloud.pubitf.arap.receivablebill.IQueryInitRecbillService;

public class QueryInitRecbillServiceImpl
extends QueryInitBillServiceImpl
implements IQueryInitRecbillService {
    public PaginationQueryVO queryPaginationQueryVO(String condition, Integer billcount) throws BusinessException {
        IArapInitReceQryService service = (IArapInitReceQryService)NCLocator.getInstance().lookup(IArapInitReceQryService.class);
        return service.queryPaginationQueryVO(condition, billcount);
    }

    public BaseAggVO[] findBillByPrimaryKey(String[] pks) throws BusinessException {
        IArapInitReceQryService service = (IArapInitReceQryService)NCLocator.getInstance().lookup(IArapInitReceQryService.class);
        return service.findBillByPrimaryKey(pks);
    }

    public ReceivableBillVO[] getAllHeadVos() throws BusinessException {
        VOQuery vq = new VOQuery(ReceivableBillVO.class);
        ReceivableBillVO[] vos = (ReceivableBillVO[])vq.queryWithWhereKeyWord("where 1=1 and isinit='Y'", " ");
        return vos;
    }

    public IQueryInitBillService getQueryService() {
        IQueryInitRecbillService queryService = (IQueryInitRecbillService)NCLocator.getInstance().lookup(IQueryInitRecbillService.class);
        return queryService;
    }
}

