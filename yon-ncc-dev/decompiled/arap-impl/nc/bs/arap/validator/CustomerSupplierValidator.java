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
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;

public class CustomerSupplierValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            if (null == this.getChildrenVO() || this.getChildrenVO().length <= 0) continue;
            int i = 0;
            for (CircularlyAccessibleValueObject vo : this.getChildrenVO()) {
                if (vo.getStatus() == 3) continue;
                if (null != this.getItemAttrValue(vo, "customer") && null != this.getItemAttrValue(vo, "supplier")) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0082", null, new String[]{String.valueOf(i)}));
                }
                ++i;
            }
        }
        return null;
    }
}

