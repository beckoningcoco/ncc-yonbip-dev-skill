/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.impl.pubapp.env.BSContext
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 */
package nccloud.bs.arap.sagas.compensate.billact;

import nc.bs.arap.actions.BillUpdateBatchBSAction;
import nc.bs.arap.billact.LogTime;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.impl.pubapp.env.BSContext;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nccloud.bs.arap.sagas.compensate.billact.IBaseSagasCompensateAction;

public class UpdateSagasCompensateAction
extends BillUpdateBatchBSAction
implements IBaseSagasCompensateAction {
    @Override
    public AggregatedValueObject[] doSagasCompensate(AggregatedValueObject[] bills) throws BusinessException {
        return this.updateVOs(bills);
    }

    @Override
    public AggregatedValueObject[] updateVOs(AggregatedValueObject[] pbills) throws BusinessException {
        AggregatedValueObject[] bills = pbills;
        if (null == bills || bills.length == 0) {
            throw new BusinessException("parameter is null!");
        }
        long t1 = System.currentTimeMillis();
        this.setbillsLock(bills);
        LogTime.debug("\u5355\u636e\u52a0\u52a8\u6001\u9501", t1);
        AggregatedValueObject[] orginBills = this.getOriginBill(bills);
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bills[0].getClass().getName());
        String id = bean.getID();
        this.tmpMap.put("beanid", id);
        t1 = System.currentTimeMillis();
        this.setBillStatus(bills, orginBills);
        LogTime.debug("\u8bbe\u7f6e\u5355\u636e\u72b6\u6001", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeUpdate(bills, orginBills);
        LogTime.debug("\u5355\u636e\u4fee\u6539\u524d\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bills, orginBills);
        LogTime.debug("\u5355\u636e\u4fee\u6539\u524d\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        bills = this.doUpdate(bills, orginBills);
        LogTime.debug("\u5355\u636e\u4fdd\u5b58\u5230\u6570\u636e\u5e93", t1);
        t1 = System.currentTimeMillis();
        this.doAfterUpdate(bills, orginBills);
        LogTime.debug("\u5355\u636e\u4fee\u6539\u540e\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bills, orginBills);
        LogTime.debug("\u5355\u636e\u4fee\u6539\u540e\u901a\u77e5\u76d1\u542c\u8005", t1);
        this.tmpMap.clear();
        return bills;
    }

    @Override
    protected void doBeforeUpdate(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        int updateType = this.getUpdateType(bills, orginBills);
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setStatus(1);
        }
        if (updateType == TEMP_2_SAVE || updateType == SAVE_2_SAVE) {
            for (AggregatedValueObject bill : bills) {
                for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
                    if (item.getStatus() == 2 || item.getStatus() == 3) continue;
                    item.setStatus(1);
                }
            }
        }
    }

    @Override
    protected void doBeforeFireEvent(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        int updateType = this.getUpdateType(bills, orginBills);
        ArapConstant constant = new ArapConstant();
        BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_ACTIONNAME, (Object)constant.ARAP_NTB_EDIT_KEY);
        if (bills != null && bills.length > 0 && ((BaseAggVO)bills[0]).isAlarmPassed()) {
            BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_FLAG, (Object)ArapConstant.ARAP_TBB_NOCHECK);
        }
        if (updateType == TEMP_2_SAVE) {
            this.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1005", (Object[])orginBills));
            this.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1006", (Object[])orginBills));
            this.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1001", (Object[])bills));
        } else if (updateType == SAVE_2_TEMP) {
            this.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1005", (Object[])bills));
        } else if (updateType == SAVE_2_SAVE) {
            this.fireEvent((IBusinessEvent)new BdUpdateEvent((String)this.tmpMap.get("beanid"), "1003", (Object)orginBills, (Object)bills));
        }
    }

    @Override
    protected void doAfterFireEvent(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        int updateType = this.getUpdateType(bills, orginBills);
        if (updateType == TEMP_2_SAVE) {
            this.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1002", (Object[])bills));
        } else if (updateType == SAVE_2_TEMP) {
            this.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1006", (Object[])orginBills));
        } else if (updateType == SAVE_2_SAVE) {
            this.fireEvent((IBusinessEvent)new BdUpdateEvent((String)this.tmpMap.get("beanid"), "1004", (Object)orginBills, (Object)bills));
        }
    }
}

