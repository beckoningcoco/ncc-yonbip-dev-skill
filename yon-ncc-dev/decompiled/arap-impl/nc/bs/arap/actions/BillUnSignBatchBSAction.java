/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.actions;

import nc.bs.arap.billact.BusiUpdateBatchBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.util.BillPersistenceUtils;
import nc.bs.arap.validator.ValidatorFactory;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class BillUnSignBatchBSAction
extends BusiUpdateBatchBSAction {
    @Override
    protected void doAfterUpdate(AggregatedValueObject[] bills) throws BusinessException {
    }

    @Override
    protected void doBeforeUpdate(AggregatedValueObject[] bills) throws BusinessException {
    }

    @Override
    protected AggregatedValueObject[] doBusiness(AggregatedValueObject[] bills) throws BusinessException {
        return BillPersistenceUtils.persistenceHeadVOs((AggregatedValueObject[])bills, BillPersistenceUtils.SIGNFIELD);
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory factory = new ValidatorFactory();
        return factory;
    }

    @Override
    protected String getBusiType() {
        return "unsign";
    }
}

