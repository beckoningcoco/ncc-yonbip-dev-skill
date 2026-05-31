/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.EventDispatcher
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.impl.pubapp.env.BSContext
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 */
package nc.bs.arap.billact;

import nc.bs.arap.billact.BillBaseBSAction;
import nc.bs.arap.billact.LogTime;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.IBusinessEvent;
import nc.impl.pubapp.env.BSContext;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nccloud.bs.arap.sagas.util.SagasUtils;

public abstract class DeleteBatchBSAction
extends BillBaseBSAction {
    public void deleteVOs(AggregatedValueObject[] bills) throws BusinessException {
        if (null == bills) {
            throw new BusinessException("parameter is null!");
        }
        long t1 = System.currentTimeMillis();
        SagasUtils.frozenAndAddSaga("delete", bills);
        LogTime.debug("\u6dfb\u52a0sagas\u4e8b\u52a1\u4ee5\u53ca\u51bb\u7ed3\u5355\u636e", t1);
        t1 = System.currentTimeMillis();
        this.setbillsLock(bills);
        LogTime.debug("\u5355\u636e\u52a0\u52a8\u6001\u9501", t1);
        t1 = System.currentTimeMillis();
        this.checkBillsTs(bills);
        LogTime.debug("\u5355\u636e\u6821\u9a8cTS", t1);
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bills[0].getClass().getName());
        String id = bean.getID();
        this.tmpMap.put("beanid", id);
        t1 = System.currentTimeMillis();
        this.setBillStatus(bills);
        LogTime.debug("\u8bbe\u7f6e\u5355\u636e\u72b6\u6001", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeDelete(bills);
        LogTime.debug("\u5220\u9664\u524d\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.validateWithPermission(bills);
        LogTime.debug("\u5355\u636e\u6821\u9a8c", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bills);
        LogTime.debug("\u5355\u636e\u5220\u9664\u524d\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        this.doDelete(bills);
        LogTime.debug("\u5728\u6570\u636e\u5e93\u4e2d\u5220\u9664\u5355\u636e", t1);
        t1 = System.currentTimeMillis();
        this.doAfterDelete(bills);
        LogTime.debug("\u5355\u636e\u5220\u9664\u540e\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bills);
        LogTime.debug("\u5355\u636e\u5220\u9664\u540e\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        this.returnbillsCode(bills);
        LogTime.debug("\u56de\u6536\u5355\u636e\u53f7", t1);
        t1 = System.currentTimeMillis();
        SagasUtils.setCompensateService("delete", bills);
        LogTime.debug("\u6ce8\u518c\u8865\u507f\u63a5\u53e3", t1);
        this.tmpMap.clear();
    }

    protected abstract void doAfterDelete(AggregatedValueObject[] var1) throws BusinessException;

    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1006", (Object[])bills));
    }

    protected abstract void doBeforeDelete(AggregatedValueObject[] var1) throws BusinessException;

    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        ArapConstant constant = new ArapConstant();
        BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_ACTIONNAME, (Object)constant.ARAP_NTB_DELETE_KEY);
        if (bills != null && bills.length > 0 && ((BaseAggVO)bills[0]).isAlarmPassed()) {
            BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_FLAG, (Object)ArapConstant.ARAP_TBB_NOCHECK);
        }
        EventDispatcher.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1005", (Object[])bills));
    }

    protected void doDelete(AggregatedValueObject[] bills) throws BusinessException {
        if (bills instanceof IBill[]) {
            this.getBilloperator().delete((IBill[])bills);
        } else if (null != bills && bills.length > 0 && bills[0] instanceof IBill) {
            IBill[] ibills = new IBill[bills.length];
            System.arraycopy(bills, 0, ibills, 0, bills.length);
            this.getBilloperator().delete(ibills);
        }
    }

    protected void returnbillsCode(AggregatedValueObject[] bills) throws BusinessException {
    }

    protected void setBillStatus(AggregatedValueObject[] bills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setStatus(3);
        }
    }
}

