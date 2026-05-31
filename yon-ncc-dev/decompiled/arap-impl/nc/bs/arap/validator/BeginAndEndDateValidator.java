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
 *  nc.vo.pub.lang.UFDate
 */
package nc.bs.arap.validator;

import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDate;

public class BeginAndEndDateValidator
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
            for (CircularlyAccessibleValueObject vo : this.getChildrenVO()) {
                if (vo.getStatus() == 3) continue;
                UFDate beginDate = (UFDate)(this.getItemAttrValue(vo, "begin_date") == null ? null : this.getItemAttrValue(vo, "begin_date"));
                UFDate endDate = (UFDate)(this.getItemAttrValue(vo, "end_date") == null ? null : this.getItemAttrValue(vo, "end_date"));
                UFDate billDate = this.getHeadAttrValue("billdate") == null ? null : this.getHeadAttrValue("billdate");
                if (null == endDate || endDate.ufBefore(beginDate)) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0116"));
                }
                if (null != beginDate && !beginDate.ufBefore(billDate)) continue;
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0117"));
            }
        }
        return null;
    }
}

