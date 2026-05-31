/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.dao.BaseDAO
 *  nc.bs.framework.common.NCLocator
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.SuperVO
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 */
package nc.bs.arap.actions;

import nc.bs.arap.bill.ArapBillPubUtil;
import nc.bs.arap.billact.BusiUpdateBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.dao.BaseDAO;
import nc.bs.framework.common.NCLocator;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.SuperVO;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;

public class PauseTransactBSAction
extends BusiUpdateBSAction {
    @Override
    protected void doAfterUpdate(AggregatedValueObject bill) throws BusinessException {
        ArapBillPubUtil.updateTS((BaseAggVO)bill);
    }

    @Override
    protected void doBeforeUpdate(AggregatedValueObject bill) throws BusinessException {
        String actionCode = ArapConstant.PAUSE;
        ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).interceptorVaildator(new AggregatedValueObject[]{bill}, actionCode);
    }

    @Override
    protected AggregatedValueObject doBusiness(AggregatedValueObject bill) throws BusinessException {
        new BaseDAO().updateVOArray((SuperVO[])bill.getChildrenVO(), new String[]{"pausetransact"});
        return bill;
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        return null;
    }

    @Override
    protected String getBeforeEventType() {
        return "20061040";
    }

    @Override
    protected String getAfterEventType() {
        return "20061041";
    }
}

