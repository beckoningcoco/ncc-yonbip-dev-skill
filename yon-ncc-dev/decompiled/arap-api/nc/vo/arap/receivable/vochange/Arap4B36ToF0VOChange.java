/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.vo.arap.basebill.BaseItemVO
 *  nc.vo.fipub.exception.ExceptionHandler
 *  nc.vo.pf.change.ChangeVOAdjustContext
 *  nc.vo.pf.change.IChangeVOAdjust
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 */
package nc.vo.arap.receivable.vochange;

import nc.vo.arap.basebill.BaseItemVO;
import nc.vo.arap.receivable.vochange.Arap2AmF0VOChange;
import nc.vo.fipub.exception.ExceptionHandler;
import nc.vo.pf.change.ChangeVOAdjustContext;
import nc.vo.pf.change.IChangeVOAdjust;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;

public class Arap4B36ToF0VOChange
extends Arap2AmF0VOChange {
    public AggregatedValueObject[] batchAdjustAfterChange(AggregatedValueObject[] srcVOs, AggregatedValueObject[] destVOs, ChangeVOAdjustContext adjustContext) throws BusinessException {
        try {
            IChangeVOAdjust workorderchange2ar = (IChangeVOAdjust)Class.forName("nc.vo.ewm.vochange.WorkOrderChange2AR").newInstance();
            destVOs = workorderchange2ar.batchAdjustAfterChange(srcVOs, destVOs, adjustContext);
        }
        catch (Exception e) {
            ExceptionHandler.handleException((Exception)e);
        }
        int i = 0;
        for (AggregatedValueObject destvo : destVOs) {
            for (CircularlyAccessibleValueObject item : destvo.getChildrenVO()) {
                BaseItemVO bodyVO = (BaseItemVO)item;
                bodyVO.setConfernum((String)srcVOs[i].getParentVO().getAttributeValue("bill_code"));
            }
            ++i;
        }
        return super.batchAdjustAfterChange(srcVOs, destVOs, adjustContext);
    }

    @Override
    protected boolean isProcessMny() {
        return true;
    }

    @Override
    protected boolean isFillRate() {
        return true;
    }
}

