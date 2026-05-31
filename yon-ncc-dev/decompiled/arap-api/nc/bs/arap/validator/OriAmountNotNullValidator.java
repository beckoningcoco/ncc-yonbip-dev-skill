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
import java.util.LinkedList;
import java.util.List;
import nc.bs.arap.validator.AbstractValidator;
import nc.bs.uif2.validation.ValidationFailure;
import nc.bs.uif2.validation.Validator;
import nc.vo.arap.pub.BillEnumCollection;
import nc.vo.ml.NCLangRes4VoTransl;
import nc.vo.pub.AggregatedValueObject;
import nc.vo.pub.CircularlyAccessibleValueObject;
import nc.vo.pub.lang.UFBoolean;
import nc.vo.pub.lang.UFDouble;

public class OriAmountNotNullValidator
extends AbstractValidator
implements Validator {
    private static final long serialVersionUID = 1L;
    private List<String> filterBilltype = Arrays.asList("36D1", "36D7");

    public ValidationFailure validate(Object obj) {
        if (UFBoolean.FALSE.equals((Object)this.checkObj(obj))) {
            return null;
        }
        LinkedList<CircularlyAccessibleValueObject> childrens = new LinkedList<CircularlyAccessibleValueObject>();
        for (AggregatedValueObject aggvo : (AggregatedValueObject[])obj) {
            this.setObj(aggvo);
            childrens.addAll(Arrays.asList(aggvo.getChildrenVO()));
        }
        StringBuilder sb = new StringBuilder();
        for (CircularlyAccessibleValueObject child : childrens) {
            if (null == child.getAttributeValue("direction") || BillEnumCollection.CommissionPayType.REFUSECOMMPAY.VALUE.equals(child.getAttributeValue("commpaytype"))) continue;
            if (BillEnumCollection.Direction.CREDIT.VALUE.equals(child.getAttributeValue("direction"))) {
                this.vailMoney(sb, 0, child);
            } else {
                this.vailMoney(sb, 1, child);
            }
            if (sb.length() <= 0) continue;
            break;
        }
        if (sb.length() > 0) {
            return new ValidationFailure(sb.toString());
        }
        return null;
    }

    private void vailMoney(StringBuilder sb, int flag, CircularlyAccessibleValueObject child) {
        Object money = null;
        Object local_money = null;
        Object local_tax = null;
        if (flag == 0) {
            local_tax = child.getAttributeValue("local_tax_cr");
            if (local_tax == null || ((UFDouble)local_tax).compareTo((Object)UFDouble.ZERO_DBL) == 0) {
                money = child.getAttributeValue("money_cr");
                local_money = child.getAttributeValue("local_money_cr");
                if (money == null || ((UFDouble)money).compareTo((Object)UFDouble.ZERO_DBL) == 0) {
                    if (local_money == null || ((UFDouble)local_money).compareTo((Object)UFDouble.ZERO_DBL) == 0) {
                        sb.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0095"));
                    } else {
                        sb.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0096"));
                    }
                } else if (local_money == null || ((UFDouble)local_money).compareTo((Object)UFDouble.ZERO_DBL) == 0) {
                    sb.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0097"));
                }
            }
        } else {
            local_tax = child.getAttributeValue("local_tax_de");
            if (local_tax == null || ((UFDouble)local_tax).compareTo((Object)UFDouble.ZERO_DBL) == 0) {
                money = child.getAttributeValue("money_de");
                local_money = child.getAttributeValue("local_money_de");
                if (money == null || ((UFDouble)money).compareTo((Object)UFDouble.ZERO_DBL) == 0) {
                    if (local_money == null || ((UFDouble)local_money).compareTo((Object)UFDouble.ZERO_DBL) == 0) {
                        sb.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0098"));
                    } else {
                        sb.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0099"));
                    }
                } else if (local_money == null || ((UFDouble)local_money).compareTo((Object)UFDouble.ZERO_DBL) == 0) {
                    sb.append(NCLangRes4VoTransl.getNCLangRes().getStrByID("2006v61020_0", "02006v61020-0128"));
                }
            }
        }
    }
}

