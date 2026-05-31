/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.actions;

import java.util.ArrayList;
import nc.bs.arap.billact.DeleteBatchBSAction;
import nc.bs.arap.billact.IValidatorFactory;
import nc.bs.arap.validator.ValidatorFactory;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class BillTmpDelBthBSAction
extends DeleteBatchBSAction {
    public BillTmpDelBthBSAction() {
        this.validatorCode.add(7);
        this.validatorCode.add(6);
        this.validatorCode.add(11);
        this.validatorCode.add(12);
        this.validatorCode.add(27);
        this.validatorCode.add(32);
        this.validatorCode.add(35);
    }

    @Override
    protected void doAfterDelete(AggregatedValueObject[] bills) throws BusinessException {
    }

    @Override
    protected void doBeforeDelete(AggregatedValueObject[] bills) throws BusinessException {
    }

    @Override
    protected void doDelete(AggregatedValueObject[] bills) throws BusinessException {
        ArrayList<AggregatedValueObject> VOList = new ArrayList<AggregatedValueObject>();
        for (int i = 0; i < bills.length; ++i) {
            if (BillEnumCollection.BillSatus.UNCOMFIRM.VALUE != ((BaseAggVO)bills[i]).getHeadVO().getBillstatus()) continue;
            VOList.add(bills[i]);
        }
        super.deleteVOs(VOList.toArray(new AggregatedValueObject[0]));
    }

    @Override
    protected IValidatorFactory getValidatorFactory() {
        ValidatorFactory factory = new ValidatorFactory();
        return factory;
    }
}

