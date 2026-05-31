/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  nc.bs.uif2.validation.ValidationFailure
 *  nc.bs.uif2.validation.Validator
 *  nc.vo.ml.NCLangRes4VoTransl
 *  nc.vo.pub.AggregatedValueObject
 *  nc.vo.pub.CircularlyAccessibleValueObject
 *  nc.vo.pub.lang.UFBoolean
 *  nc.vo.pub.lang.UFDouble
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

public class PrimalMoneyValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            Integer billStatus;
            this.setObj(aggvo);
            Integer n = billStatus = this.getHeadAttrValue("billstatus") == null ? null : (Integer)this.getHeadAttrValue("billstatus");
            if (billStatus == BillEnumCollection.BillSatus.TEMPEORARY.VALUE) {
                return null;
            }
            if (null == this.getChildrenVO() || this.getChildrenVO().length <= 0) continue;
            for (CircularlyAccessibleValueObject vo : this.getChildrenVO()) {
                if (vo.getStatus() == 3) continue;
                if (UFDouble.ZERO_DBL == this.getItemAttrValue(vo, "rec_primal")) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0102"));
                }
                if (UFDouble.ZERO_DBL != this.getItemAttrValue(vo, "pay_primal")) continue;
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0103"));
            }
        }
        return null;
    }
}

