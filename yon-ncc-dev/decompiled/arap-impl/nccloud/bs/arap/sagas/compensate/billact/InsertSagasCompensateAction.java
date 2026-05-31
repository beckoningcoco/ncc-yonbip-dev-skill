/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.impl.pubapp.env.BSContext
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.bs.arap.sagas.compensate.billact;

import java.util.Map;
import nc.bs.arap.actions.BillInsertBatchBSAction;
import nc.bs.arap.bill.ArapBillDAO;
import nc.bs.arap.billact.LogTime;
import nc.bs.arap.util.BillStatusUtils;
import nc.bs.arap.util.BillTermUtils;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.impl.pubapp.env.BSContext;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.billact.IBaseSagasCompensateAction;
import org.apache.commons.lang3.ArrayUtils;

public class InsertSagasCompensateAction
extends BillInsertBatchBSAction
implements IBaseSagasCompensateAction {
    @Override
    public AggregatedValueObject[] doSagasCompensate(AggregatedValueObject[] bills) throws BusinessException {
        return this.insertVOs(bills);
    }

    @Override
    public AggregatedValueObject[] insertVOs(AggregatedValueObject[] pbills) throws BusinessException {
        AggregatedValueObject[] bills = pbills;
        if (null == bills || bills.length == 0) {
            throw new BusinessException("parameter is null!");
        }
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bills[0].getClass().getName());
        String id = bean.getID();
        this.tmpMap.put("beanid", id);
        long t1 = System.currentTimeMillis();
        this.doBeforeInsert(bills);
        LogTime.debug("\u5355\u636e\u65b0\u589e\u524d\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.setBillStatus(bills);
        LogTime.debug("\u8bbe\u7f6e\u5355\u636e\u72b6\u6001", t1);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bills);
        LogTime.debug("\u5355\u636e\u65b0\u589e\u524d\u901a\u77e5\u76d1\u542c\u8005", t1);
        t1 = System.currentTimeMillis();
        bills = this.doInsert(bills);
        LogTime.debug("\u5355\u636e\u4fdd\u5b58\u5230\u6570\u636e\u5e93", t1);
        t1 = System.currentTimeMillis();
        this.doAfterInsert(bills);
        LogTime.debug("\u5355\u636e\u65b0\u589e\u540e\u5904\u7406", t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bills);
        LogTime.debug("\u5355\u636e\u65b0\u589e\u540e\u901a\u77e5\u76d1\u542c\u8005", t1);
        this.tmpMap.clear();
        this.doAfterHcApprove(bills);
        bills = this.dealFoutPaulBill(bills);
        return bills;
    }

    @Override
    protected void doBeforeInsert(AggregatedValueObject[] bills) throws BusinessException {
        this.childvostatmap = BillStatusUtils.enNewVOStauts((AggregatedValueObject[])bills);
    }

    @Override
    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        ArapConstant constant = new ArapConstant();
        BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_ACTIONNAME, (Object)constant.ARAP_NTB_SAVE_KEY);
        if (bills != null && bills.length > 0 && ((BaseAggVO)bills[0]).isAlarmPassed()) {
            BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_FLAG, (Object)ArapConstant.ARAP_TBB_NOCHECK);
        }
        this.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1001", (Object[])bills));
    }

    @Override
    protected AggregatedValueObject[] doInsert(AggregatedValueObject[] bills) throws BusinessException {
        return new ArapBillDAO().recoveryDeleteBills(bills);
    }

    @Override
    protected void doAfterInsert(AggregatedValueObject[] bills) throws BusinessException {
        BillTermUtils.dealBillTerm((AggregatedValueObject[])bills, (Map)this.childvostatmap, null);
        BillTermUtils.retBodyTermVOS(bills);
    }

    @Override
    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        this.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1002", (Object[])bills));
    }

    @Override
    protected void setBillStatus(AggregatedValueObject[] bills) throws BusinessException {
        for (AggregatedValueObject bill : bills) {
            bill.getParentVO().setStatus(2);
            Object[] childVOs = bill.getChildrenVO();
            if (ArrayUtils.isEmpty((Object[])childVOs)) continue;
            for (Object childVO : childVOs) {
                childVO.setStatus(2);
            }
        }
    }
}

