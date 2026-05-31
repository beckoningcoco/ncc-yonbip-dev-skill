/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.bs.arap.actions;

import java.util.HashMap;
import nc.bs.arap.actions.BillUnApproveBatchBSAction;
import nc.bs.arap.util.BillPersistenceUtils;
import nc.bs.arap.util.BillStatusUtils;
import nc.vo.arap.basebill.BaseAggVO;
import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public abstract class SettlebillUnApproveBatchBSAction
extends BillUnApproveBatchBSAction {
    public SettlebillUnApproveBatchBSAction() {
        this.validatorCode.add(47);
        this.validatorCode.add(6);
        this.validatorCode.add(55);
        this.validatorCode.add(70);
    }

    @Override
    protected AggregatedValueObject[] doUnApprove(AggregatedValueObject[] bills) throws BusinessException {
        BillStatusUtils.enUnApvStatus((AggregatedValueObject[])bills);
        return BillPersistenceUtils.persistenceApproveVOs((AggregatedValueObject[])bills);
    }

    @Override
    protected void doAfterUnApprove(AggregatedValueObject[] bills) throws BusinessException {
        super.doAfterUnApprove(bills);
        HashMap<String, String> relation = new HashMap<String, String>();
        for (AggregatedValueObject bill : bills) {
            for (BaseItemVO item : ((BaseAggVO)bill).getItems()) {
                relation.put(item.getTop_billid(), item.getPrimaryKey());
            }
        }
    }
}

