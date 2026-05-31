/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.EventDispatcher
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.framework.common.NCLocator
 *  nc.bs.pub.compiler.AbstractCompiler2
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
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.compiler.PfParameterVO;
import nccloud.pubitf.arap.arappub.IArapBillRefundService;

public class N_F0_CANCELREFUND
extends AbstractCompiler2 {
    public Object runComClass(PfParameterVO paraVo) throws BusinessException {
        AggregatedValueObject bill = paraVo.m_preValueVo;
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bill.getClass().getName());
        String id = bean.getID();
        this.doBeforeCancelRefund(bill, id);
        ((IArapBillRefundService)NCLocator.getInstance().lookup(IArapBillRefundService.class)).cancelRefundBill(bill);
        this.doAfterCancelRefund(bill, id);
        return null;
    }

    private void doBeforeCancelRefund(AggregatedValueObject bill, String id) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent(id, "2006112", (Object[])new AggregatedValueObject[]{bill}));
    }

    private void doAfterCancelRefund(AggregatedValueObject bill, String id) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent(id, "2006113", (Object[])new AggregatedValueObject[]{bill}));
    }
}

