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

public class ChangeBillCurrencyDirectionValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            CircularlyAccessibleValueObject[] childrenVOs = this.getChildrenVO();
            for (int j = 0; j < childrenVOs.length; ++j) {
                if (null == childrenVOs[j] || childrenVOs[j].getStatus() == 3) continue;
                for (int k = j + 1; k < childrenVOs.length; ++k) {
                    if (null == childrenVOs[k] || !childrenVOs[k].getAttributeValue("direction").equals(childrenVOs[k].getAttributeValue("direction")) || !childrenVOs[k].getAttributeValue("pk_currtype").equals(childrenVOs[k].getAttributeValue("pk_currtype"))) continue;
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0076", null, new String[]{String.valueOf(k + 1)}));
                }
            }
        }
        return null;
    }
}

