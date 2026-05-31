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
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

public class MoneyRelationValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        ValidationFailure valida = new ValidationFailure();
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            if (null == this.getChildrenVO() || this.getChildrenVO().length <= 0) continue;
            UFDouble logicZero = ArapCommonTool.ZERO;
            for (CircularlyAccessibleValueObject vo : this.getChildrenVO()) {
                UFDouble right;
                UFDouble local_money_de = this.getMoney(vo, "local_money_de", logicZero);
                UFDouble local_money_cr = this.getMoney(vo, "local_money_cr", logicZero);
                if (BillEnumCollection.CommissionPayType.REFUSECOMMPAY.VALUE.equals(vo.getAttributeValue("commpaytype"))) continue;
                UFDouble left = this.getSumMoney(vo, new String[]{"money_de", "money_cr"}, logicZero);
                if (!ArapCommonTool.isLessEqual(left.sub(right = this.getSumMoney(vo, new String[]{"notax_de", "notax_cr"}, logicZero)).abs(), logicZero)) {
                    valida.setMessage(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0086"));
                    return valida;
                }
                left = this.getSumMoney(vo, new String[]{"local_money_de", "local_money_cr"}, logicZero);
                if (ArapCommonTool.isLessEqual(left.sub(right = this.getSumMoney(vo, new String[]{"local_notax_de", "local_notax_cr", "local_tax_de", "local_tax_cr"}, logicZero)).abs(), logicZero)) continue;
                valida.setMessage(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0086"));
                return valida;
            }
        }
        return null;
    }

    private UFDouble getMoney(CircularlyAccessibleValueObject vo, String field, UFDouble logicZero) {
        UFDouble money = this.getItemAttrValue(vo, field) == null ? logicZero : (UFDouble)this.getItemAttrValue(vo, field);
        return money;
    }

    private UFDouble getSumMoney(CircularlyAccessibleValueObject vo, String[] fields, UFDouble logicZero) {
        UFDouble sum = UFDouble.ZERO_DBL;
        for (String field : fields) {
            sum.add(this.getMoney(vo, field, logicZero));
        }
        return sum;
    }
}

