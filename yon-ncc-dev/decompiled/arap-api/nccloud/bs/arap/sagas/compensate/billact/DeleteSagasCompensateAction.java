/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BusinessEvent
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.framework.common.NCLocator
 *  nc.impl.pubapp.env.BSContext
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  org.apache.commons.lang3.ArrayUtils
 */
package nccloud.bs.arap.sagas.compensate.billact;

import nc.bs.arap.actions.BillDeleteBatchBSAction;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.LogTime;
import nc.bs.arap.util.ArapBusiLogUtils;
import nc.bs.businessevent.BusinessEvent;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.framework.common.NCLocator;
import nc.impl.pubapp.env.BSContext;
import nc.itf.arap.billconfer.IBillConferService;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nccloud.bs.arap.sagas.compensate.billact.IBaseSagasCompensateAction;
import org.apache.commons.lang3.ArrayUtils;

public class DeleteSagasCompensateAction
extends BillDeleteBatchBSAction
implements IBaseSagasCompensateAction {
    @Override
    public AggregatedValueObject[] doSagasCompensate(AggregatedValueObject[] bills) throws BusinessException {
        this.deleteVOs(bills);
        return null;
    }

    @Override
    public void deleteVOs(AggregatedValueObject[] bills) throws BusinessException {
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
        this.doBeforeDelete(bills);
        LogTime.debug("\u5220\u9664\u524d\u5904\u7406", t1);
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
        this.tmpMap.clear();
    }

    @Override
    protected void doBeforeDelete(AggregatedValueObject[] bills) throws BusinessException {
    }

    @Override
    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        AggregatedValueObject[] bills2 = this.getUnConfirmVos(bills);
        if (bills2.length != 0) {
            ArapConstant constant = new ArapConstant();
            BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_ACTIONNAME, (Object)constant.ARAP_NTB_DELETE_KEY);
            if (bills != null && bills.length > 0 && ((BaseAggVO)bills[0]).isAlarmPassed()) {
                BSContext.getInstance().setSession(ArapConstant.ARAP_TBB_FLAG, (Object)ArapConstant.ARAP_TBB_NOCHECK);
            }
            this.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1005", (Object[])bills));
        }
    }

    @Override
    protected void doAfterDelete(AggregatedValueObject[] bills) throws BusinessException {
        if (ArrayUtils.isEmpty((Object[])bills)) {
            return;
        }
        BaseAggVO[] ibills = null;
        if (bills instanceof BaseAggVO[]) {
            ibills = (BaseAggVO[])bills;
        } else if (null != bills && bills.length > 0 && bills[0] instanceof BaseAggVO) {
            ibills = new BaseAggVO[bills.length];
            System.arraycopy(bills, 0, ibills, 0, bills.length);
        }
        if (ibills == null) {
            return;
        }
        this.getTermService().deleteTermItem(ArapBillPubUtil.getBillPKs((AggregatedValueObject[])ibills));
        ArapBillPubUtil.dealRedFlag((AggregatedValueObject[])ibills);
        ((IBillConferService)NCLocator.getInstance().lookup(IBillConferService.class)).clearBillConferNum(ibills);
        ArapBusiLogUtils.insertSmartBusiLogs(ArapConstant.ARAP_ACTION_DELETE, bills, ArapConstant.SYS_NAME);
    }

    @Override
    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        AggregatedValueObject[] bills2 = this.getUnConfirmVos(bills);
        if (bills2.length != 0) {
            this.fireEvent((IBusinessEvent)new BusinessEvent((String)this.tmpMap.get("beanid"), "1006", (Object[])bills));
        }
    }
}

