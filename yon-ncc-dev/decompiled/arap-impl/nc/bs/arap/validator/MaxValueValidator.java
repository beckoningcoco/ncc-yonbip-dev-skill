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

import java.util.Arrays;
import java.util.List;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

public class MaxValueValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;
    final UFDouble mnymax = new UFDouble(1.0E20);
    final UFDouble ratemax = new UFDouble(9999999.99999999);
    List<String> list = Arrays.asList("money_cr", "money_de", "notax_cr", "notax_de", "local_money_cr", "local_money_de", "local_notax_cr", "local_notax_de", "local_tax_cr", "local_tax_de");

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            if (null == this.getChildrenVO() || this.getChildrenVO().length <= 0) continue;
            for (CircularlyAccessibleValueObject vo : this.getChildrenVO()) {
                UFDouble value;
                if (this.isDeletedRow(vo)) continue;
                for (String key : this.list) {
                    UFDouble value2;
                    if (null == this.getItemAttrValue(vo, key) || (value2 = (UFDouble)this.getItemAttrValue(vo, key)).compareTo((Object)this.mnymax) <= 0) continue;
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0519") + key + NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0520"));
                }
                if (null == this.getItemAttrValue(vo, "rate") || (value = (UFDouble)this.getItemAttrValue(vo, "rate")).compareTo((Object)this.ratemax) <= 0) continue;
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0521"));
            }
        }
        return null;
    }
}

