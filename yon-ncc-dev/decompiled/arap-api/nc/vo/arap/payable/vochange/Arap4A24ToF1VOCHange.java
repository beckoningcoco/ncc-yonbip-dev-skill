/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.itf.fi.pub.Currency
 *  nc.vo.pf.change.ChangeVOAdjustContext
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.BusinessException
 *  nc.vo.pub.CircularlyAccessibleValueObject
 */
package nc.vo.arap.payable.vochange;

import nc.itf.fi.pub.Currency;
import nc.vo.arap.payable.vochange.Arap2AmF1VOChange;
import nc.vo.pf.change.ChangeVOAdjustContext;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.BusinessException;
import nc.vo.pub.CircularlyAccessibleValueObject;

public class Arap4A24ToF1VOCHange
extends Arap2AmF1VOChange {
    public AggregatedValueObject[] batchAdjustAfterChange(AggregatedValueObject[] srcVOs, AggregatedValueObject[] destVOs, ChangeVOAdjustContext adjustContext) throws BusinessException {
        if (null != destVOs && destVOs.length > 0) {
            String pk_currency = Currency.getLocalCurrPK((String)((String)srcVOs[0].getParentVO().getAttributeValue("pk_fiorg")));
            for (AggregatedValueObject bill : destVOs) {
                bill.getParentVO().setAttributeValue("pk_currtype", (Object)pk_currency);
                for (CircularlyAccessibleValueObject item : bill.getChildrenVO()) {
                    item.setAttributeValue("pk_currtype", (Object)pk_currency);
                }
            }
        }
        return super.batchAdjustAfterChange(srcVOs, destVOs, adjustContext);
    }
}

