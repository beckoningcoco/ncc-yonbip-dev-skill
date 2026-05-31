/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.impl.pubapp.env.BSContext
 *  nc.vo.cmp.exception.CmpAuthorizationException
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.actions;

import nc.bs.arap.actions.BillApproveBatchBSAction;
import nc.bs.arap.businessevent.EventDispatcherProxy;
import nc.bs.arap.util.BillPersistenceUtils;
import nc.bs.arap.util.BillStatusUtils;
import nc.impl.pubapp.env.BSContext;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.exception.ARAP4CmpAuthorizationException;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.cmp.exception.CmpAuthorizationException;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class SettlebillApproveBatchBSAction
extends BillApproveBatchBSAction {
    @Override
    protected AggregatedValueObject[] doApprove(AggregatedValueObject[] bills) throws BusinessException {
        BillStatusUtils.enApvStatus((AggregatedValueObject[])bills);
        AggregatedValueObject[] ret = BillPersistenceUtils.persistenceApproveVOs((AggregatedValueObject[])bills);
        return ret;
    }

    @Override
    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        ArapConstant constant = new ArapConstant();
        BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_ACTIONNAME, (Object)constant.ARAP_NTB_APPROVE_KEY);
        if (bills != null && bills.length > 0 && (BaseAggVO)bills[0] != null) {
            if (((BaseAggVO)bills[0]).isAlarmPassed()) {
                BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_FLAG, (Object)ArapConstant.ARAP_TBB_NOCHECK);
            }
            EventDispatcherProxy.getInstance().fireBeforeApvEvent(bills);
        }
    }

    @Override
    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        try {
            EventDispatcherProxy.getInstance().fireAfterApvEvent(bills);
        }
        catch (Exception e) {
            if (e instanceof CmpAuthorizationException) {
                ARAP4CmpAuthorizationException exp = new ARAP4CmpAuthorizationException(e.getMessage());
                exp.setCmpAuthorizationException((CmpAuthorizationException)e);
                throw exp;
            }
            throw e;
        }
    }
}

