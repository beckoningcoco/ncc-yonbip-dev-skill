/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.EventDispatcher
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pub.compiler.AbstractCompiler2
 *  nc.itf.uap.pf.IPFBusiAction
 *  nc.itf.uap.pf.IPfExchangeService
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.compiler.PfParameterVO
 *  nccloud.pubitf.arap.arappub.IArapBillRefundService
 */
package nc.bs.pub.action;

import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.framework.common.NCLocator;
import nc.bs.pub.compiler.AbstractCompiler2;
import nc.itf.uap.pf.IPFBusiAction;
import nc.itf.uap.pf.IPfExchangeService;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nccloud.pubitf.arap.arappub.IArapBillRefundService;

public class N_F0_REFUND
extends AbstractCompiler2 {
    public Object runComClass(PfParameterVO paraVo) throws BusinessException {
        AggregatedValueObject bill = paraVo.m_preValueVo;
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bill.getClass().getName());
        String id = bean.getID();
        this.doBeforeRefund(paraVo.m_preValueVo, id);
        ((IArapBillRefundService)NCLocator.getInstance().lookup(IArapBillRefundService.class)).refundBill(bill);
        IPfExchangeService service = (IPfExchangeService)NCLocator.getInstance().lookup(IPfExchangeService.class);
        AggregatedValueObject[] vos = service.runChangeDataAry((String)bill.getParentVO().getAttributeValue("pk_tradetype"), "F1-Refund", new AggregatedValueObject[]{bill}, null);
        ((IPFBusiAction)NCLocator.getInstance().lookup(IPFBusiAction.class)).processBatch("SAVE", "F1", vos, null, null, null);
        this.doAfterRefund(paraVo.m_preValueVo, id);
        return null;
    }

    private void doBeforeRefund(AggregatedValueObject bill, String id) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent(id, "2006110", (Object[])new AggregatedValueObject[]{bill}));
    }

    private void doAfterRefund(AggregatedValueObject bill, String id) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent(id, "2006111", (Object[])new AggregatedValueObject[]{bill}));
    }
}

