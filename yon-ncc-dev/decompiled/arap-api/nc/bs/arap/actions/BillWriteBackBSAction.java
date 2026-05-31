/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.framework.common.NCLocator
 *  nc.md.persist.framework.MDPersistenceService
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nccloud.pubitf.arap.arappub.IArapBillPubUtilService
 */
package nc.bs.arap.actions;

import nc.bs.arap.billact.BusiUpdateBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.framework.common.NCLocator;
import nc.md.persist.framework.MDPersistenceService;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.global.ArapBillVOConsts;
import nc.vo.arap.pub.ArapConstant;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nccloud.pubitf.arap.arappub.IArapBillPubUtilService;

public class BillWriteBackBSAction
extends BusiUpdateBSAction {
    @Override
    protected void doAfterUpdate(AggregatedValueObject bill) throws BusinessException {
    }

    @Override
    protected void doBeforeUpdate(AggregatedValueObject bill) throws BusinessException {
        String actionCode = ArapConstant.WRITEBACK;
        ((IArapBillPubUtilService)NCLocator.getInstance().lookup(IArapBillPubUtilService.class)).interceptorVaildator(new AggregatedValueObject[]{bill}, actionCode);
        AggregatedValueObject vo = (AggregatedValueObject)MDPersistenceService.lookupPersistenceQueryService().queryBillOfVOByPK(bill.getClass(), bill.getParentVO().getPrimaryKey(), false);
        CircularlyAccessibleValueObject parent = vo.getParentVO();
        UFBoolean value = (UFBoolean)(parent.getAttributeValue("isreded") == null ? null : parent.getAttributeValue("isreded"));
        if (null != value && value.equals((Object)ArapBillVOConsts.REDED)) {
            throw new BusinessException(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0435"));
        }
    }

    @Override
    protected AggregatedValueObject doBusiness(AggregatedValueObject bill) throws BusinessException {
        ((BaseBillVO)bill.getParentVO()).setIsreded(UFBoolean.TRUE);
        MDPersistenceService.lookupPersistenceService().saveBill((Object)bill);
        return bill;
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        return null;
    }
}

