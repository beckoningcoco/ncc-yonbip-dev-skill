/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nccloud.bs.arap.sagas.compensate.billact;

import nc.bs.arap.actions.SettlebillUnApproveBatchBSAction;
import nc.bs.arap.billact.LogTime;
import nc.bs.arap.util.BillPersistenceUtils;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.billact.IUnApproveSagasCompensateAction;

public class UnApproveSettleBillSagasCompensateAction
extends SettlebillUnApproveBatchBSAction
implements IUnApproveSagasCompensateAction {
    @Override
    public AggregatedValueObject[] doSagasCompensate(AggregatedValueObject[] bills) throws BusinessException {
        return this.unapproveVOs(bills);
    }

    @Override
    public AggregatedValueObject[] unapproveVOs(AggregatedValueObject[] pbills) throws BusinessException {
        AggregatedValueObject[] bills = pbills;
        if (null == bills) {
            throw new BusinessException("parameter is null!");
        }
        long t1 = System.currentTimeMillis();
        this.setbillsLock(bills);
        LogTime.debug("\u5355\u636e\u52a0\u52a8\u6001\u9501", t1);
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bills[0].getClass().getName());
        String id = bean.getID();
        this.tmpMap.put("beanid", id);
        t1 = System.currentTimeMillis();
        this.setBillStatus(bills);
        LogTime.debug("\u8bbe\u7f6e\u5355\u636e\u72b6\u6001", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeUnApprove(bills);
        LogTime.debug("\u5355\u636e\u53cd\u5ba1\u6838\u524d\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bills);
        LogTime.debug("\u5355\u636e\u53cd\u5ba1\u6838\u524d\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        bills = this.doUnApprove(bills);
        LogTime.debug("\u5355\u636e\u53cd\u5ba1\u6838\u5230\u6570\u636e\u5e93", t1);
        t1 = System.currentTimeMillis();
        this.doAfterUnApprove(bills);
        LogTime.debug("\u5355\u636e\u53cd\u5ba1\u6838\u540e\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bills);
        LogTime.debug("\u5355\u636e\u53cd\u5ba1\u6838\u540e\u901a\u77e5\u76d1\u542c\u8005", t1);
        bills = BillPersistenceUtils.persistenceEftVOs((AggregatedValueObject[])bills);
        this.retriveTsFromDb(bills);
        this.tmpMap.clear();
        return bills;
    }
}

