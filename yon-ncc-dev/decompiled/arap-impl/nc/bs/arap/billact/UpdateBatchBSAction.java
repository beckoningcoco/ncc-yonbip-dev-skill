/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.EventDispatcher
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 */
package nc.bs.arap.billact;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.BillBaseBSAction;
import nc.bs.arap.billact.LogTime;
import nc.bs.arap.util.ArapVOUtils;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.IBusinessEvent;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;
import nccloud.bs.arap.sagas.util.SagasUtils;
import nccloud.bs.arap.util.LightVOProducer;

public abstract class UpdateBatchBSAction
extends BillBaseBSAction {
    public AggregatedValueObject[] updateVOs(AggregatedValueObject[] pbills) throws BusinessException {
        AggregatedValueObject[] bills = pbills;
        if (null == bills || bills.length == 0) {
            throw new BusinessException("parameter is null!");
        }
        long t1 = System.currentTimeMillis();
        SagasUtils.frozenAndAddSaga("update", bills);
        LogTime.debug("\u6dfb\u52a0sagas\u4e8b\u52a1\u4ee5\u53ca\u51bb\u7ed3\u5355\u636e", t1);
        t1 = System.currentTimeMillis();
        this.setbillsLock(bills);
        LogTime.debug("\u5355\u636e\u52a0\u52a8\u6001\u9501", t1);
        t1 = System.currentTimeMillis();
        this.checkBillsTs(bills);
        LogTime.debug("\u5355\u636e\u6821\u9a8cTS", t1);
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
        this.validateWithPermission(bills);
        LogTime.debug("\u5355\u636e\u6821\u9a8c", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bills, orginBills);
        LogTime.debug("\u5355\u636e\u4fee\u6539\u524d\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        bills = this.doUpdate(bills, orginBills);
        LogTime.debug("\u5355\u636e\u4fdd\u5b58\u5230\u6570\u636e\u5e93", t1);
        t1 = System.currentTimeMillis();
        LogTime.debug("\u5355\u636e\u4fee\u6539\u4fdd\u5b58\u540e\u6743\u9650\u9a8c\u8bc1", t1);
        t1 = System.currentTimeMillis();
        this.doAfterUpdate(bills, orginBills);
        LogTime.debug("\u5355\u636e\u4fee\u6539\u540e\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bills, orginBills);
        LogTime.debug("\u5355\u636e\u4fee\u6539\u540e\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        SagasUtils.setCompensateService("update", LightVOProducer.produceLightVO(bills, orginBills));
        LogTime.debug("\u6ce8\u518c\u8865\u507f\u63a5\u53e3", t1);
        this.tmpMap.clear();
        return bills;
    }

    protected void doAfterFireEvent(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BdUpdateEvent((String)this.tmpMap.get("beanid"), "1004", (Object)orginBills, (Object)bills));
    }

    protected abstract void doAfterUpdate(AggregatedValueObject[] var1, AggregatedValueObject[] var2) throws BusinessException;

    protected void doBeforeFireEvent(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BdUpdateEvent((String)this.tmpMap.get("beanid"), "1003", (Object)orginBills, (Object)bills));
    }

    protected abstract void doBeforeUpdate(AggregatedValueObject[] var1, AggregatedValueObject[] var2) throws BusinessException;

    protected AggregatedValueObject[] doUpdate(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        ArapVOUtils.resetMoneyBal(bills, orginBills);
        if (bills instanceof IBill[]) {
            IBill[] obills = null;
            if (orginBills instanceof IBill[]) {
                obills = (IBill[])orginBills;
            } else if (orginBills != null && orginBills.length > 0 && orginBills[0] instanceof IBill) {
                obills = new IBill[orginBills.length];
                System.arraycopy(orginBills, 0, obills, 0, orginBills.length);
            }
            this.getBilloperator().update((IBill[])bills, obills);
        } else if (null != bills && bills.length > 0 && bills[0] instanceof IBill) {
            IBill[] ibills = new IBill[bills.length];
            System.arraycopy(bills, 0, ibills, 0, bills.length);
            IBill[] obills = new IBill[orginBills.length];
            System.arraycopy(orginBills, 0, obills, 0, orginBills.length);
            this.getBilloperator().update(ibills, obills);
        }
        return bills;
    }

    protected AggregatedValueObject[] getOriginBill(AggregatedValueObject[] bills) throws BusinessException {
        String[] pks = new String[bills.length];
        for (int index = 0; index < pks.length; ++index) {
            pks[index] = bills[index].getParentVO().getPrimaryKey();
        }
        Collection vo = MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPKs(bills[0].getClass(), pks, false);
        HashMap<String, AggregatedValueObject> map = new HashMap<String, AggregatedValueObject>();
        ArrayList<BaseItemVO> rets = new ArrayList<BaseItemVO>();
        for (Object object : vo) {
            AggregatedValueObject bill = (AggregatedValueObject)object;
            for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
                if (Integer.valueOf(1).equals(item.getAttributeValue("dr"))) continue;
                rets.add((BaseItemVO)item);
            }
            bill.setChildrenVO((CircularlyAccessibleValueObject[])rets.toArray(new BaseItemVO[0]));
            rets.clear();
            map.put(bill.getParentVO().getPrimaryKey(), bill);
        }
        ArrayList list = new ArrayList();
        for (int i = 0; i < pks.length; ++i) {
            list.add(map.get(pks[i]));
        }
        return (AggregatedValueObject[])list.toArray(new BaseAggVO[0]);
    }

    protected void setBillStatus(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setStatus(1);
            ArapBillPubUtil.resetSagasFieldValue(bill);
        }
    }
}

