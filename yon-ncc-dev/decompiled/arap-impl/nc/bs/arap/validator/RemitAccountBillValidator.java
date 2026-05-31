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

public class RemitAccountBillValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            if (null != this.getChildrenVO() && this.getChildrenVO().length > 0 && this.getChildrenVO().length < 2) {
                return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006pub_0", "02006pub-0535"));
            }
            if (null == this.getChildrenVO() || this.getChildrenVO().length <= 0) continue;
            int sfbz1Count = 0;
            int sfbz2Count = 0;
            int k1 = 0;
            int k2 = 0;
            UFDouble hjjfSumBbje = new UFDouble(0);
            UFDouble hjdfSumBbje = new UFDouble(0);
            for (int i = 0; i < this.getChildrenVO().length; ++i) {
                CircularlyAccessibleValueObject vo = this.getChildrenVO()[i];
                if (this.isDeletedRow(vo)) continue;
                UFDouble money_cr = (UFDouble)(this.getItemAttrValue(vo, "money_cr") == null ? null : this.getItemAttrValue(vo, "money_cr"));
                UFDouble money_de = (UFDouble)(this.getItemAttrValue(vo, "money_de") == null ? null : this.getItemAttrValue(vo, "money_de"));
                UFDouble local_money_de = (UFDouble)(this.getItemAttrValue(vo, "local_money_de") == null ? null : this.getItemAttrValue(vo, "local_money_de"));
                UFDouble local_money_cr = (UFDouble)(this.getItemAttrValue(vo, "local_money_cr") == null ? null : this.getItemAttrValue(vo, "local_money_cr"));
                if ((ArapCommonTool.isLargeZero(money_cr.abs()) && ArapCommonTool.isLargeZero(money_de.abs()) || ArapCommonTool.isZero(money_cr) && ArapCommonTool.isZero(money_de)) && !"DR".equalsIgnoreCase((String)this.getHeadAttrValue("pk_tradetype"))) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0106"));
                }
                if (ArapCommonTool.isLargeZero(money_cr.abs())) {
                    if (++sfbz1Count == 1) {
                        k1 = i;
                    }
                    if (!this.getItemAttrValue(vo, "pk_currtype").equals(this.getItemAttrValue(this.getChildrenVO()[k1], "pk_currtype"))) {
                        return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0107"));
                    }
                } else {
                    if (++sfbz2Count == 1) {
                        k2 = i;
                    }
                    if (!this.getItemAttrValue(vo, "pk_currtype").equals(this.getItemAttrValue(this.getChildrenVO()[k2], "pk_currtype"))) {
                        return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0107"));
                    }
                }
                if (sfbz1Count > 1 && sfbz2Count > 1) {
                    return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0108"));
                }
                if (!ArapCommonTool.isZero(local_money_de)) {
                    hjjfSumBbje = hjjfSumBbje.add(local_money_de);
                }
                if (ArapCommonTool.isZero(local_money_cr)) continue;
                hjdfSumBbje = hjdfSumBbje.add(local_money_cr);
            }
            if (ArapCommonTool.isZero(hjdfSumBbje.sub(hjjfSumBbje)) || "DR".equalsIgnoreCase((String)this.getHeadAttrValue("pk_tradetype")) || (Integer)this.getHeadAttrValue("billstatus") == -99) continue;
            return new ValidationFailure(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0109"));
        }
        return null;
    }
}

