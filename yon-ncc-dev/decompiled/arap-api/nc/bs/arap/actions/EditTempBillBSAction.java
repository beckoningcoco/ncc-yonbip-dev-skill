/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.businessevent.BdUpdateEvent
 *  nc.bs.businessevent.EventDispatcher
 *  nc.bs.businessevent.IBusinessEvent
 *  nc.bs.businessevent.IBusinessListener
 *  nc.bs.framework.core.util.ObjectCreator
 *  nc.bs.logging.Logger
 *  nc.md.MDBaseQueryFacade
 *  nc.md.model.IBean
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.jcom.lang.StringUtil
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.BusinessRuntimeException
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pubapp.pattern.model.entity.bill.IBill
 */
package nc.bs.arap.actions;

import java.util.Map;
import nc.bs.arap.actions.Save2TemporaryBSAction;
import nc.bs.arap.billact.BillBaseBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.billact.LogTime;
import nc.bs.arap.util.ArapVOUtils;
import nc.bs.arap.util.BillStatusUtils;
import nc.bs.arap.util.BillTermUtils;
import nc.bs.businessevent.BdUpdateEvent;
import nc.bs.businessevent.EventDispatcher;
import nc.bs.businessevent.IBusinessEvent;
import nc.bs.businessevent.IBusinessListener;
import nc.bs.framework.core.util.ObjectCreator;
import nc.bs.logging.Logger;
import nc.md.MDBaseQueryFacade;
import nc.md.model.IBean;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.BusiStatus;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.jcom.lang.StringUtil;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.BusinessRuntimeException;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pubapp.pattern.model.entity.bill.IBill;

public class EditTempBillBSAction
extends BillBaseBSAction {
    protected void doAfterUpdate(AggregatedValueObject bill, AggregatedValueObject orginBill) throws BusinessException {
    }

    protected void doBeforeUpdate(AggregatedValueObject bill, AggregatedValueObject orginBill) throws BusinessException {
    }

    protected AggregatedValueObject doUpdate(AggregatedValueObject bill, AggregatedValueObject orginBill) throws BusinessException {
        Map enUpdateVOStauts = BillStatusUtils.enUpdateVOStauts((AggregatedValueObject[])new AggregatedValueObject[]{bill}, (AggregatedValueObject[])new AggregatedValueObject[]{orginBill});
        BillTermUtils.dealBillTerm((AggregatedValueObject[])new AggregatedValueObject[]{bill}, (Map)enUpdateVOStauts, (AggregatedValueObject[])new AggregatedValueObject[]{orginBill});
        BaseBillVO parent = (BaseBillVO)bill.getParentVO();
        BaseBillVO parentOld = (BaseBillVO)orginBill.getParentVO();
        if (BusiStatus.SAVE.getBillStatusKind() == parentOld.getBillstatus().intValue()) {
            parent.setSaveTotemporarily(UFBoolean.TRUE);
            parent.setBillstatus(BusiStatus.TEMPEORARY.getBillStatusKind());
        }
        ArapVOUtils.resetMoneyBal(new AggregatedValueObject[]{bill});
        if (UFBoolean.TRUE.equals((Object)parent.getSaveToTemporarily())) {
            ((BaseAggVO)orginBill).getHeadVO().setSaveTotemporarily(parent.getSaveToTemporarily());
            new Save2TemporaryBSAction().deleteVOs((AggregatedValueObject[])new BaseAggVO[]{(BaseAggVO)orginBill});
            MDPersistenceService.lookupPersistenceService().saveBill((Object)bill);
        } else {
            this.getBilloperator().update(new IBill[]{(IBill)bill}, new IBill[]{(IBill)orginBill});
            if (parent.getPk_billtype().equals("F2") || parent.getPk_billtype().equals("F3")) {
                BdUpdateEvent event = new BdUpdateEvent((String)this.tmpMap.get("beanid"), "1004", (Object)new AggregatedValueObject[]{orginBill}, (Object)new AggregatedValueObject[]{bill});
                IBusinessListener instance = EditTempBillBSAction.createInstance("nc.bs.arap.busireg.NotifySettleHandleListener", "arap");
                instance.doAction((IBusinessEvent)event);
            }
        }
        return bill;
    }

    private static IBusinessListener createInstance(String className, String devModuleCode) {
        IBusinessListener instance = null;
        try {
            instance = StringUtil.isEmptyWithTrim((String)devModuleCode) ? (IBusinessListener)ObjectCreator.newInstance((String)className) : (IBusinessListener)ObjectCreator.newInstance((String)devModuleCode, (String)className);
        }
        catch (Exception e) {
            Logger.error((Object)e.getMessage(), (Throwable)e);
            throw new BusinessRuntimeException("cann't create instance. ClassName: " + className + ",devModuleCode:" + devModuleCode + ". Please check register info in table pub_eventlistener");
        }
        return instance;
    }

    public AggregatedValueObject updateVO(AggregatedValueObject pbill) throws BusinessException {
        AggregatedValueObject bill = pbill;
        if (null == bill) {
            throw new BusinessException("parameter is null!");
        }
        long t1 = System.currentTimeMillis();
        this.setbillsLock(bill);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0436"), t1);
        t1 = System.currentTimeMillis();
        this.checkBillsTs(bill);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0437"), t1);
        AggregatedValueObject orginBill = this.getOriginBill(bill);
        IBean bean = MDBaseQueryFacade.getInstance().getBeanByFullClassName(bill.getClass().getName());
        String id = bean.getID();
        this.tmpMap.put("beanid", id);
        t1 = System.currentTimeMillis();
        this.setTempBillStatus(bill, orginBill);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0438"), t1);
        t1 = System.currentTimeMillis();
        this.doBeforeUpdate(bill, orginBill);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0439"), t1);
        t1 = System.currentTimeMillis();
        this.validateWithPermission(bill);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0440"), t1);
        t1 = System.currentTimeMillis();
        this.doBeforeFireEvent(bill, orginBill);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0441"), t1);
        t1 = System.currentTimeMillis();
        bill = this.doUpdate(bill, orginBill);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0442"), t1);
        t1 = System.currentTimeMillis();
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0443"), t1);
        t1 = System.currentTimeMillis();
        this.doAfterUpdate(bill, orginBill);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0444"), t1);
        t1 = System.currentTimeMillis();
        this.doAfterFireEvent(bill, orginBill);
        LogTime.debug(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0445"), t1);
        this.tmpMap.clear();
        return bill;
    }

    protected void doAfterFireEvent(AggregatedValueObject bill, AggregatedValueObject orginBill) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BdUpdateEvent((String)this.tmpMap.get("beanid"), "200608", (Object)orginBill, (Object)bill));
    }

    protected void doBeforeFireEvent(AggregatedValueObject bill, AggregatedValueObject orginBill) throws BusinessException {
        EventDispatcher.fireEvent((IBusinessEvent)new BdUpdateEvent((String)this.tmpMap.get("beanid"), "200607", (Object)orginBill, (Object)bill));
    }

    protected AggregatedValueObject getOriginBill(AggregatedValueObject bill) throws BusinessException {
        return (AggregatedValueObject)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(bill.getClass(), bill.getParentVO().getPrimaryKey(), false);
    }

    protected void setTempBillStatus(AggregatedValueObject bill, AggregatedValueObject orginBill) throws BusinessException {
        if (null != bill) {
            bill.getParentVO().setStatus(1);
        }
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        return null;
    }
}

