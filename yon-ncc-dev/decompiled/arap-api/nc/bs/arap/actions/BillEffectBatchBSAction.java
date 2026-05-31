/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.actions;

import java.util.ArrayList;
import nc.bs.arap.billact.BusiUpdateBatchBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.util.BillEffectUtils;
import nc.bs.arap.util.BillPersistenceUtils;
import nc.bs.arap.validator.ValidatorFactory;
import nc.vo.arap.basebill.BaseBillVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class BillEffectBatchBSAction
extends BusiUpdateBatchBSAction {
    public BillEffectBatchBSAction() {
        this.validatorCode.add(34);
        this.setBeforeEventType("200603");
        this.setAfterEventType("200604");
    }

    @Override
    protected void doBeforeUpdate(AggregatedValueObject[] bills) throws BusinessException {
    }

    @Override
    protected AggregatedValueObject[] doBusiness(AggregatedValueObject[] bills) throws BusinessException {
        ArrayList<String> fields = new ArrayList<String>(BillPersistenceUtils.EFFICTFIELD);
        for (AggregatedValueObject vo : bills) {
            BaseBillVO parent = (BaseBillVO)vo.getParentVO();
            parent.setEffectstatus(BillEnumCollection.InureSign.OKINURE.VALUE);
        }
        return BillPersistenceUtils.persistenceHeadVOs((AggregatedValueObject[])bills, fields);
    }

    @Override
    protected void doAfterUpdate(AggregatedValueObject[] bills) throws BusinessException {
        BillEffectUtils.sendDAPMessge(bills);
        BillEffectUtils.refundF3TOF2(bills);
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory factory = new ValidatorFactory();
        return factory;
    }

    @Override
    protected String getBusiType() {
        return "effect";
    }
}

