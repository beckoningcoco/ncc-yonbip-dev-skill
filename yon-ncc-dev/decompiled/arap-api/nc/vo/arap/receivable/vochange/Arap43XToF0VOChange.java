/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.vochange.ArapBillVOChange
 *  nc.vo.pf.change.ChangeVOAdjustContext
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 */
package nc.vo.arap.receivable.vochange;

import nc.vo.arap.vochange.ArapBillVOChange;
import nc.vo.pf.change.ChangeVOAdjustContext;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;

public class Arap43XToF0VOChange
extends ArapBillVOChange {
    public AggregatedValueObject adjustAfterChange(AggregatedValueObject srcVO, AggregatedValueObject destVO, ChangeVOAdjustContext adjustContext) throws BusinessException {
        return super.adjustAfterChange(srcVO, destVO, adjustContext);
    }

    protected boolean isSetBiztype() {
        return true;
    }
}

