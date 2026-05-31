/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.pub.BillEnumCollection$BillSatus
 *  nc.vo.arap.pub.BillEnumCollection$Direction
 *  nc.vo.pf.change.ChangeVOAdjustContext
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 */
package nc.vo.arap.receivable.vochange;

import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.arap.receivable.vochange.ArapF0VOChange;
import nc.vo.pf.change.ChangeVOAdjustContext;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;

public class Arap35ToF0VOChange
extends ArapF0VOChange {
    public AggregatedValueObject[] batchAdjustAfterChange(AggregatedValueObject[] srcVOs, AggregatedValueObject[] destVOs, ChangeVOAdjustContext adjustContext) throws BusinessException {
        if (null != destVOs && destVOs.length > 0) {
            for (AggregatedValueObject bill : destVOs) {
                bill.getParentVO().setAttributeValue("billstatus", (Object)BillEnumCollection.BillSatus.SAVE.VALUE);
                for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
                    item.setAttributeValue("direction", (Object)BillEnumCollection.Direction.DEBIT.VALUE);
                }
            }
        }
        return super.batchAdjustAfterChange(srcVOs, destVOs, adjustContext);
    }
}

