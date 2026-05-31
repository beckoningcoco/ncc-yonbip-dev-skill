/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.InvocationInfoProxy
 *  nc.bs.framework.common.NCLocator
 *  nc.itf.imag.lightbus.IImagPubService
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 */
package nc.bs.arap.actions;

import java.util.ArrayList;
import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.DeleteBatchBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.util.ArapBusiLogUtils;
import nc.bs.arap.util.BillAccountCalendarUtils;
import nc.bs.arap.validator.ValidatorFactory;
import nc.bs.framework.common.InvocationInfoProxy;
import nc.bs.framework.common.NCLocator;
import nc.itf.arap.billconfer.IBConferMapService;
import nc.itf.arap.billconfer.IBillConferService;
import nc.itf.imag.lightbus.IImagPubService;
import nc.pubitf.arap.termitem.IArapTermItemPubService;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.utils.ARAPModuleEnableUtil;
import nc.vo.arap.utils.DataUtil;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;

public class BillDeleteBatchBSAction
extends DeleteBatchBSAction {
    private IArapTermItemPubService termService;

    public BillDeleteBatchBSAction() {
        this.validatorCode.add(77);
        this.validatorCode.add(7);
        this.validatorCode.add(45);
        this.validatorCode.add(6);
        this.validatorCode.add(66);
        this.validatorCode.add(67);
        this.validatorCode.add(68);
        this.termService = null;
    }

    @Override
    protected void doBeforeFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        AggregatedValueObject[] bills2 = this.getUnConfirmVos(bills);
        if (bills2.length != 0) {
            super.doBeforeFireEvent(bills2);
        }
    }

    protected AggregatedValueObject[] getUnConfirmVos(AggregatedValueObject[] bills) {
        ArrayList<AggregatedValueObject> billList = new ArrayList<AggregatedValueObject>();
        boolean hasUnConfirmBill = false;
        for (AggregatedValueObject aggvo : bills) {
            BaseBillVO parentVO = (BaseBillVO)aggvo.getParentVO();
            if (parentVO.getBillstatus().intValue() == BillEnumCollection.BillSatus.UNCOMFIRM.VALUE.intValue()) {
                hasUnConfirmBill = true;
                continue;
            }
            billList.add(aggvo);
        }
        if (!hasUnConfirmBill) {
            return bills;
        }
        AggregatedValueObject[] bills2 = billList.toArray(new AggregatedValueObject[0]);
        return bills2;
    }

    @Override
    protected void doAfterFireEvent(AggregatedValueObject[] bills) throws BusinessException {
        AggregatedValueObject[] bills2 = this.getUnConfirmVos(bills);
        if (bills2.length != 0) {
            super.doAfterFireEvent(bills2);
        }
    }

    public IArapTermItemPubService getTermService() {
        if (null == this.termService) {
            this.termService = (IArapTermItemPubService)NCLocator.getInstance().lookup(IArapTermItemPubService.class);
        }
        return this.termService;
    }

    @Override
    protected void doAfterDelete(AggregatedValueObject[] bills) throws BusinessException {
        if (bills == null || bills.length == 0) {
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
        ArrayList<String> pks = new ArrayList<String>();
        String pkBilltype = (String)bills[0].getParentVO().getAttributeValue("pk_billtype");
        for (AggregatedValueObject bill : bills) {
            Integer coordflag = (Integer)bill.getParentVO().getAttributeValue("coordflag");
            if (Integer.valueOf(1) != coordflag) continue;
            pks.add(bill.getParentVO().getPrimaryKey());
        }
        if (pks.size() != 0) {
            ((IBConferMapService)NCLocator.getInstance().lookup(IBConferMapService.class)).deleteByDestBill(pks.toArray(new String[0]), pkBilltype);
        }
        ArapBusiLogUtils.insertSmartBusiLogs(ArapConstant.ARAP_ACTION_DELETE, bills, ArapConstant.SYS_NAME);
    }

    @Override
    protected void doBeforeDelete(AggregatedValueObject[] bills) throws BusinessException {
        BillAccountCalendarUtils.setAccperiodYearMonth(bills);
    }

    @Override
    public void doDelete(AggregatedValueObject[] bills) throws BusinessException {
        this.doDeleteDefVals(bills);
        super.doDelete(bills);
    }

    protected void doDeleteDefVals(AggregatedValueObject[] bills) {
        for (int index = 0; index < bills.length; ++index) {
            AggregatedValueObject aggVO = bills[index];
            this.setHeadVODefaultVals((SuperVO)aggVO.getParentVO());
        }
    }

    protected void setHeadVODefaultVals(SuperVO parentVO) {
        DataUtil.setModify(parentVO);
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory factory = new ValidatorFactory();
        return factory;
    }

    @Override
    protected void returnbillsCode(AggregatedValueObject[] bills) throws BusinessException {
        ArapBillPubUtil.getBillCodeUtil(bills).returnBillCode(bills);
    }

    protected void deleteImag(AggregatedValueObject[] clientFullVOs, String msg) throws BusinessException {
        if (!ARAPModuleEnableUtil.isImagEnabled(InvocationInfoProxy.getInstance().getGroupId())) {
            return;
        }
        ArrayList<String> billIDList = new ArrayList<String>();
        for (AggregatedValueObject clientFullVO : clientFullVOs) {
            billIDList.add(clientFullVO.getParentVO().getPrimaryKey());
        }
        ((IImagPubService)NCLocator.getInstance().lookup(IImagPubService.class)).deleteImageAndInvoice(billIDList.toArray(new String[billIDList.size()]), InvocationInfoProxy.getInstance().getUserId(), msg);
    }
}

