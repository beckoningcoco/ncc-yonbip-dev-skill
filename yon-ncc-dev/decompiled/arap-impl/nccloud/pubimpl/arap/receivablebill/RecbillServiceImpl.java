/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.arap.receivable.IArapReceivableBillQueryService
 *  nc.itf.uap.pf.IPFBusiAction
 *  nc.vo.arap.receivable.AggReceivableBillVO
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nccloud.pubitf.arap.receivablebill.IRecbillService
 */
package nccloud.pubimpl.arap.receivablebill;

import nc.bs.framework.common.NCLocator;
import nc.itf.arap.receivable.IArapReceivableBillQueryService;
import nc.itf.uap.pf.IPFBusiAction;
import nc.vo.arap.receivable.AggReceivableBillVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.pubitf.arap.receivablebill.IRecbillService;

public class RecbillServiceImpl
implements IRecbillService {
    public AggReceivableBillVO insert(AggReceivableBillVO vo) throws BusinessException {
        return null;
    }

    public AggReceivableBillVO update(AggReceivableBillVO aggVo) throws BusinessException {
        return null;
    }

    public void delete(String ... pk) throws BusinessException {
        IArapReceivableBillQueryService iarbqs = (IArapReceivableBillQueryService)NCLocator.getInstance().lookup(IArapReceivableBillQueryService.class);
        AggReceivableBillVO[] initrecbillVo = iarbqs.findBillByPrimaryKey(pk);
        IPFBusiAction service = (IPFBusiAction)NCLocator.getInstance().lookup(IPFBusiAction.class);
        Object[] obj = service.processBatch("DELETE", "PK", (AggregatedValueObject[])initrecbillVo, null, null, null, null);
    }
}

