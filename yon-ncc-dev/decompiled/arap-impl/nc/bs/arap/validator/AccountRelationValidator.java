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
import nc.vo.arap.global.ArapCommonTool;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

public class AccountRelationValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            int accidCount1 = 1;
            int accidCount2 = 0;
            int accidflag1 = 0;
            int accidflag2 = 0;
            UFDouble sumYbje1 = new UFDouble(0);
            UFDouble sumYbje2 = new UFDouble(0);
            if (null == this.getChildrenVO() || this.getChildrenVO().length <= 0) continue;
            for (int i = 0; i < this.getChildrenVO().length; ++i) {
                CircularlyAccessibleValueObject vo = this.getChildrenVO()[i];
                if (this.isDeletedRow(vo)) continue;
                if (null == this.getItemAttrValue(vo, "accflag")) {
                    this.setAccFlag(vo);
                }
                if (i > 0) {
                    accidflag2 = (Integer)this.getItemAttrValue(vo, "accflag");
                    if (accidflag1 * accidflag1 + accidflag2 * accidflag2 == 4 || accidflag1 * accidflag1 + accidflag2 * accidflag2 == 5) {
                        ++accidCount2;
                        sumYbje2 = sumYbje2.add((UFDouble)this.getItemAttrValue(vo, "money_cr"));
                    } else {
                        ++accidCount1;
                        sumYbje1 = sumYbje1.add((UFDouble)this.getItemAttrValue(vo, "money_cr"));
                    }
                    if (i != this.getChildrenVO().length - 1 || (accidCount2 * accidCount1 == accidCount1 || accidCount2 * accidCount1 == accidCount2) && accidCount2 >= 0) continue;
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0062"));
                }
                accidflag1 = (Integer)this.getItemAttrValue(vo, "accflag");
                sumYbje1 = (UFDouble)this.getItemAttrValue(vo, "money_cr");
            }
            if (ArapCommonTool.isZero(sumYbje1.sub(sumYbje2))) continue;
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0063"));
        }
        return null;
    }

    private void setAccFlag(CircularlyAccessibleValueObject vo) {
    }
}

