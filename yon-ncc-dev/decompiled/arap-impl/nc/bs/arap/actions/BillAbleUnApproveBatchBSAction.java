/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.impl.pubapp.env.BSContext
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  org.apache.commons.lang3.ArrayUtils
 */
package nc.bs.arap.actions;

import nc.bs.arap.actions.BillUnApproveBatchBSAction;
import nc.bs.arap.businessevent.EventDispatcherProxy;
import nc.bs.arap.util.BillPersistenceUtils;
import nc.bs.arap.util.BillStatusUtils;
import nc.impl.pubapp.env.BSContext;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import org.apache.commons.lang3.ArrayUtils;

public abstract class BillAbleUnApproveBatchBSAction
extends BillUnApproveBatchBSAction {
    @Override
    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        ArapConstant constant = new ArapConstant();
        BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_ACTIONNAME, (Object)constant.ARAP_NTB_UNAPPROVE_KEY);
        if (((BaseAggVO)bills[0]).isAlarmPassed()) {
            BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_FLAG, (Object)ArapConstant.ARAP_TBB_NOCHECK);
        }
        EventDispatcherProxy.getInstance().fireBeforeUnApvEffectEvent(bills);
    }

    @Override
    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        EventDispatcherProxy.getInstance().fireAfterUnApvEffectEvent(bills);
    }

    @Override
    protected void doAfterUnApprove(AggregatedValueObject[] bills) throws BusinessException {
        super.doAfterUnApprove(bills);
    }

    @Override
    protected AggregatedValueObject[] doUnApprove(AggregatedValueObject[] bills) throws BusinessException {
        BillStatusUtils.enUnApv4UnEftVODefVals((AggregatedValueObject[])bills);
        return BillPersistenceUtils.persistenceApvAndEftVOs((AggregatedValueObject[])bills);
    }
}

