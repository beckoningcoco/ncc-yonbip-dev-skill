/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.actions;

import java.util.HashMap;
import java.util.Map;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.billact.UpdateBatchBSAction;
import nc.bs.arap.util.BillStatusUtils;
import nc.bs.arap.validator.ValidatorFactory;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

@Deprecated
public class ArapBillEditSaveBatchBSAction
extends UpdateBatchBSAction {
    protected Map<String, Map<String, String>> fakeIds = new HashMap<String, Map<String, String>>();

    @Override
    protected void doAfterUpdate(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
    }

    @Override
    protected void doBeforeUpdate(AggregatedValueObject[] bills, AggregatedValueObject[] orginBills) throws BusinessException {
        BillStatusUtils.enUpdateVOStauts((AggregatedValueObject[])bills, (AggregatedValueObject[])orginBills);
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory vf = new ValidatorFactory();
        return vf;
    }
}

