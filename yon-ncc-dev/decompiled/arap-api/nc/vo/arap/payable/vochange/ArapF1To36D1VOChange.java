/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.pub.BillEnumCollection$ApproveStatus
 *  nc.vo.pf.change.ChangeVOAdjustContext
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFDouble
 */
package nc.vo.arap.payable.vochange;

import java.util.ArrayList;
import nc.vo.arap.payable.PayableBillItemVO;
import nc.vo.arap.payable.vochange.ArapF1VOChange;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.pf.change.ChangeVOAdjustContext;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFDouble;

public class ArapF1To36D1VOChange
extends ArapF1VOChange {
    public AggregatedValueObject[] batchAdjustBeforeChange(AggregatedValueObject[] srcVOs, ChangeVOAdjustContext adjustContext) throws BusinessException {
        AggregatedValueObject[] adjustBeforeChanges = super.batchAdjustBeforeChange(srcVOs, adjustContext);
        ArrayList<AggregatedValueObject> resultAggVO = new ArrayList<AggregatedValueObject>();
        for (int i = 0; i < adjustBeforeChanges.length; ++i) {
            Integer approveStatus = (Integer)adjustBeforeChanges[i].getParentVO().getAttributeValue("approvestatus");
            if (!BillEnumCollection.ApproveStatus.PASSING.VALUE.equals(approveStatus)) continue;
            PayableBillItemVO[] childrenVO = (PayableBillItemVO[])adjustBeforeChanges[i].getChildrenVO();
            ArrayList<PayableBillItemVO> childrenList = new ArrayList<PayableBillItemVO>();
            for (int j = 0; j < childrenVO.length; ++j) {
                UFDouble money_cr = childrenVO[j].getMoney_cr();
                if (money_cr == null || money_cr.abs().compareTo((Object)UFDouble.ZERO_DBL) <= 0) continue;
                childrenList.add(childrenVO[j]);
            }
            if (childrenList.size() <= 0) continue;
            adjustBeforeChanges[i].setChildrenVO((CircularlyAccessibleValueObject[])childrenList.toArray(new PayableBillItemVO[0]));
            resultAggVO.add(adjustBeforeChanges[i]);
        }
        return resultAggVO.toArray(new AggregatedValueObject[0]);
    }
}

