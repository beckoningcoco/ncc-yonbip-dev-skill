/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.receivable.IArapReceivableBillQueryService
 *  nc.vo.arap.basebill.BaseAggVO
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pagination.PaginationQueryVO
 *  nccloud.pubimpl.arap.arappub.ConfirmQueryBillServiceImpl
 *  nccloud.pubitf.arap.arappub.IConfirmQueryBillService
 *  nccloud.pubitf.arap.receivablebill.IQueryConferRecbillService
 */
package nccloud.pubimpl.arap.receivablebill;

import nc.bs.framework.common.NCLocator;
import nc.itf.arap.receivable.IArapReceivableBillQueryService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pagination.PaginationQueryVO;
import nccloud.pubimpl.arap.arappub.ConfirmQueryBillServiceImpl;
import nccloud.pubitf.arap.arappub.IConfirmQueryBillService;
import nccloud.pubitf.arap.receivablebill.IQueryConferRecbillService;

public class QueryConferRecbillServiceImpl
extends ConfirmQueryBillServiceImpl
implements IQueryConferRecbillService {
    public PaginationQueryVO queryPaginationQueryVO(String condition, Integer billcount) throws BusinessException {
        IArapReceivableBillQueryService service = (IArapReceivableBillQueryService)NCLocator.getInstance().lookup(IArapReceivableBillQueryService.class);
        return service.queryPaginationQueryVO(condition, billcount);
    }

    public BaseAggVO[] findBillByPrimaryKey(String[] pks) throws BusinessException {
        IArapReceivableBillQueryService service = (IArapReceivableBillQueryService)NCLocator.getInstance().lookup(IArapReceivableBillQueryService.class);
        return service.findBillByPrimaryKey(pks);
    }

    public IConfirmQueryBillService getQueryService() {
        return (IConfirmQueryBillService)NCLocator.getInstance().lookup(IQueryConferRecbillService.class);
    }
}

